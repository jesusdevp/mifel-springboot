package com.mifel.controller;

import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

@RestController
@RequestMapping("/api/encrypt")
public class EncryptController {

    private SecretKeySpec keySpec;
    private IvParameterSpec ivSpec;

    @PostConstruct
    public void init() {
        byte[] key = "1234567890123456".getBytes();
        byte[] iv = "abcdefghijklmnop".getBytes();
        keySpec = new SecretKeySpec(key, "AES");
        ivSpec = new IvParameterSpec(iv);
    }

    @PostMapping
    public String encrypt(@RequestBody String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
        byte[] encrypted = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }
}