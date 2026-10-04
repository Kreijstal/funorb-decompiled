/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientFlowState {
    static ClientFlowToken accountCreationFlowState;
    static String bubbleBonusAnnouncementText;
    static DialogLayer accountDialogLayer;
    static String achievedText;
    static int[] difficultyStepFlags;
    static int field_c;

    public static void clearClientFlowResources(byte methodGuard) {
        int guardResidue = -73 % ((26 - methodGuard) / 53);
        accountDialogLayer = null;
        achievedText = null;
        bubbleBonusAnnouncementText = null;
        difficultyStepFlags = null;
        accountCreationFlowState = null;
    }

    final static void requestSessionExit(byte methodGuard) {
        if (methodGuard <= 79) {
            return;
        }
        if (10 == SpriteConstructionSupport.clientScreenStage) {
            DraggableWidget.f((byte) 24);
            SpriteConstructionSupport.clientScreenStage = 11;
            SessionInstanceState.sessionExitRequested = true;
            return;
        }
        if (!TextTemplateArgumentType.b(0)) {
            DraggableWidget.f((byte) 24);
            SpriteConstructionSupport.clientScreenStage = 11;
            SessionInstanceState.sessionExitRequested = true;
            return;
        }
        SessionInstanceState.sessionExitRequested = true;
    }

    static {
        bubbleBonusAnnouncementText = "It's the<br>bubble bonus!";
        achievedText = "Achieved";
        difficultyStepFlags = new int[23];
        difficultyStepFlags[14] = SessionInstanceState.orInt(difficultyStepFlags[14], 128);
        difficultyStepFlags[12] = SessionInstanceState.orInt(difficultyStepFlags[12], 17);
        difficultyStepFlags[0] = 0;
        difficultyStepFlags[2] = SessionInstanceState.orInt(difficultyStepFlags[2], 12);
        difficultyStepFlags[15] = SessionInstanceState.orInt(difficultyStepFlags[15], 3);
        difficultyStepFlags[5] = SessionInstanceState.orInt(difficultyStepFlags[5], 140);
        difficultyStepFlags[1] = SessionInstanceState.orInt(difficultyStepFlags[1], 4);
        difficultyStepFlags[6] = SessionInstanceState.orInt(difficultyStepFlags[6], 1);
        difficultyStepFlags[11] = SessionInstanceState.orInt(difficultyStepFlags[11], 132);
        difficultyStepFlags[4] = SessionInstanceState.orInt(difficultyStepFlags[4], 0);
        difficultyStepFlags[16] = SessionInstanceState.orInt(difficultyStepFlags[16], 0);
        difficultyStepFlags[13] = SessionInstanceState.orInt(difficultyStepFlags[13], 16);
        difficultyStepFlags[21] = SessionInstanceState.orInt(difficultyStepFlags[21], 16);
        difficultyStepFlags[3] = SessionInstanceState.orInt(difficultyStepFlags[3], 133);
        difficultyStepFlags[7] = SessionInstanceState.orInt(difficultyStepFlags[7], 4);
        difficultyStepFlags[22] = SessionInstanceState.orInt(difficultyStepFlags[22], 0);
        difficultyStepFlags[17] = SessionInstanceState.orInt(difficultyStepFlags[17], 128);
        difficultyStepFlags[8] = SessionInstanceState.orInt(difficultyStepFlags[8], 136);
        difficultyStepFlags[20] = SessionInstanceState.orInt(difficultyStepFlags[20], 132);
        difficultyStepFlags[9] = SessionInstanceState.orInt(difficultyStepFlags[9], 2);
        difficultyStepFlags[18] = SessionInstanceState.orInt(difficultyStepFlags[18], 2);
        difficultyStepFlags[19] = SessionInstanceState.orInt(difficultyStepFlags[19], 16);
        difficultyStepFlags[10] = SessionInstanceState.orInt(difficultyStepFlags[10], 4);
        field_c = 0;
    }
}
