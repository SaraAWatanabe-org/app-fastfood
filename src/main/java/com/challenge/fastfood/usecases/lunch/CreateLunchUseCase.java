package com.challenge.fastfood.usecases.lunch;

import com.challenge.fastfood.entities.Lunch;
import com.challenge.fastfood.interfaceadapters.interfaces.lunch.SaveLunchGatewayInterface;

public class CreateLunchUseCase {
    private final SaveLunchGatewayInterface saveLunchGatewayInterface;

    public CreateLunchUseCase(SaveLunchGatewayInterface saveLunchGatewayInterface) {
        this.saveLunchGatewayInterface = saveLunchGatewayInterface;
    }

    public Lunch createLunch(Lunch lunch) {
        return saveLunchGatewayInterface.saveLunch(lunch);
    }
}