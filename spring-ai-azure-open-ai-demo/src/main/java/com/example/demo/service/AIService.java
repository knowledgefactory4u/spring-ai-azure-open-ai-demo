package com.example.demo.service;

import org.springframework.ai.openai.OpenAiClient;
import org.springframework.stereotype.Service;

@Service
public class AIService {

    private final OpenAiClient openAiClient;

    public AIService(OpenAiClient openAiClient) {
        this.openAiClient = openAiClient;
    }

    public String getAIResponse(String prompt) {
        return openAiClient.completion(prompt);
    }
}
