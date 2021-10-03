import React, { useState } from 'react'
import { StyleSheet, Text, View, TextInput, Button, Image, ImageBackground, TouchableOpacity} from "react-native"
import logo from "./image/image.png";
import backImage from "./image/bgimg.png"; 
import {Entypo} from '@expo/vector-icons'

export default function LoginTextInput() {
    const[Email, setEmail]= useState("")
    const[Password, setPassword]= useState("")
    const[isSecureEntry, setisSequreEntry]= useState(true)
    return (
        <>
        <View style={styles.container}>
        <ImageBackground source={backImage} style={styles.container}>
            <Image source={logo} style={{ width: 80, height: 80, margin: 15, borderRadius: 50}}/>
            <Text style={{ fontSize: 30, fontWeight: "bold"}}>Login</Text>
            <TextInput placeholder="Email"
            style={styles.login}
            onChangeText={(e)=> {
                setEmail(e);
            }
            }
            />
            <TextInput placeholder="Password"
            secureTextEntry={isSecureEntry}
            icon={
                <TouchableOpacity onPress={()=>{
                    setisSequreEntry((prev)=> !prev)
                }
                }>
                    <Entypo name="eye" size={24} color="black" />
                </TouchableOpacity>
            }
            iconPositon="right"
            style={styles.pass}
            onChangeText={(e)=> {
                setPassword(e);
            }
        }
            />
            <Button title="Submit" color="#0A1D37" onPress={()=> {
                alert("email:" + Email + "\nPassword:" + Password); }}
                style={styles.button}
                />
                </ImageBackground>

        </View>
        </>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
        width: "100%",
        height: "100%",
        //backgroundColor: "#FFE6E6",
    },
    button: {
        margin: 20,
    },
    
    login: {
        backgroundColor: "#B9D2D2",
        padding: 5,
        paddingTop: 3,
        width: 200,
        margin: 8,
        borderRadius: 5,
    },
    pass: {
        backgroundColor: "#B9D2D2",
        padding: 5,
        paddingTop: 3,
        width: 200,
        margin: 8,
        marginBottom: 35,
        borderRadius: 5,
    }
});
