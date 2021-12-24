package com.malakibQq.myapplication.OOP;

import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.malakibQq.myapplication.CompleteInfo;
import com.malakibQq.myapplication.HomeActivity;
import com.malakibQq.myapplication.RegistrationActivity;

import java.util.EventListener;

public class fireBaseConnection {
    public static void addListenerForUserUpdate(AppCompatActivity actv){
        DB.getCurrentUserData().addValueEventListener(new ValueEventListener(){
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot){
                User.user.updateLists(dataSnapshot, actv);
            HomeActivity.checkBMIChange(); }
            @Override
            public void  onCancelled(@NonNull DatabaseError error){ }
        });

    }
    public static void createUserData(AppCompatActivity context, User user){
        try{
            DB.getCurrentUserName().setValue(user.getName())
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void OnFailure(@NonNull Exception e){
                            Toast.makeText(context, "Failed to create user record: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                        }})
                    .addOnSuccessListener(new OnSuccessListener<Void>(){
                        @Override
                        public void onSuccess(Void void){
                            move(context);
                        }
                    });
        } catch(Exception e){
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public static void registration(User user, AppCompatActivity context){
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        user.setmAuth(mAuth);
        mAuth.createUserWithEmailAndPassword(user.getEmail(), user.getPassword())
                .addOnCompleteListener(context, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            createUserData(context, user);
                        } else{
                            Toast.makeText(context, "Error, can't add user to firebase: "+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                            
                    }
                });

    }
    public static void login_user(AppCompatActivity context){
        try {
            User.user.setmAuth(FirebaseAuth.getInstance());
            User.user.getmAuth().signInWithEmailAndPassword(User.user.getEmail(), User.user.getPasswprd())
                    .addOnCompleteListener(context, new OnCompleteListener<AuthResult>(){
                        @Override
                        public void onComplete(@NonNull Tasks<AuthResult> task) {
                            if(task.isSuccessful()){
                                User.user.setmAuth(FirebaseAuth.getInstance());
                                addListenerForUserUpdate(context);
                                DB.getCurrentUserData().child("login").setValue(new Date().toString());
                                Intent intent;
                                if(User.user.isNewUser())
                                    intent = new Intent(context, RegistrationActivity.class);
                                else
                                    intent = new Intent(context, HomeActivity.class);
                                context.startActivity(intent);
                                context.finish();

                            } else{
                                Toast.makeText(context, "Invalid Email or password ", Toast.LENGTH_SHORT).show();
                            } }
                    });
        } catch (Exception e){
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public static void logout(){User.user.getmAuth().signout();}
    public static void addBMIRecord(BMIRecord record){ }
    public static void removeBMIRecord(BMIRecord record){ }
    public static void addFood(BMIFood record){ }
    public static void removeFood(BMIFood record){ }





}
