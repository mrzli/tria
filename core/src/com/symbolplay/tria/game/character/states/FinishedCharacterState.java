package com.symbolplay.tria.game.character.states;

public final class FinishedCharacterState extends CharacterStateBase {

    public FinishedCharacterState(CharacterStateManager characterStateManager) {
        super(characterStateManager);
    }
    
    @Override
    public boolean isFinished() {
        return true;
    }
}
