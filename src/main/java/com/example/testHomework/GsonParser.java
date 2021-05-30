package com.example.testHomework;

import com.example.testHomework.model.Root;
import com.google.gson.Gson;

import java.io.FileReader;

public class GsonParser {
    public Root parse() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("src/file.json")){
            Root root = gson.fromJson(reader, Root.class);
            return root;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
