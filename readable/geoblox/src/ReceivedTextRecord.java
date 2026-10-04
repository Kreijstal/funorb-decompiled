/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReceivedTextRecord {
    private long sourceLongId;
    int recordKind;
    private static int[] unusedFiveStepPalette;
    String text;
    int recordIdHigh16;
    static int keyboardEventReadIndex;
    private int recordMetadataByte;
    static volatile int pendingPointerPressButton;
    private String sourceDisplayName;
    int[] referencedTemplateIds;
    private boolean headerFlagSet;
    static String[] highscoreModeNames;
    int recordIdLow24;
    static boolean receivedRecordHeaderFlagSet;
    static int field_p;
    static String tutorialShapeMatchMessage;

    public static void releaseTextRecordResources(int methodGuard) {
        unusedFiveStepPalette = null;
        tutorialShapeMatchMessage = null;
        highscoreModeNames = null;
        int guardResidue = -39 % ((62 - methodGuard) / 42);
    }

    final static String formatArchiveGroupProgress(String progressLabel, String waitingText, int groupId, boolean methodGuard, ResourceArchive archive) {
        RuntimeException progressFailureForContext = null;
        ResourceArchive unusedNullArchive = null;
        String waitingTextBeforeReturn = null;
        String progressTextBeforeReturn = null;
        RuntimeException progressFailureBeforeContext = null;
        StringBuilder progressMessagePrefix = null;
        String progressLabelDescription = null;
        StringBuilder messageWithProgressLabel = null;
        String waitingTextDescription = null;
        StringBuilder messageWithWaitingTextAndGuard = null;
        String archiveDescription = null;
        RuntimeException caughtProgressFailure = null;
        try {
          if (!archive.ensureIndexLoaded(0)) {
            waitingTextBeforeReturn = (String) (waitingText);
            return waitingTextBeforeReturn;
          }
          if (methodGuard) {
            unusedNullArchive = (ResourceArchive) null;
            ReceivedTextRecord.formatArchiveGroupProgress((String) null, (String) null, 53, false, (ResourceArchive) null);
          }
          progressTextBeforeReturn = progressLabel + " - " + archive.getGroupProgress((byte) 42, groupId) + "%";
          return progressTextBeforeReturn;
        } catch (java.lang.RuntimeException progressFailure) {
          caughtProgressFailure = progressFailure;
          progressFailureForContext = caughtProgressFailure;
          progressFailureBeforeContext = progressFailureForContext;
          progressMessagePrefix = new StringBuilder().append("vd.D(");
          if (progressLabel == null) {
            progressLabelDescription = "null";
          } else {
            progressLabelDescription = "{...}";
          }
          messageWithProgressLabel = ((StringBuilder) (Object) progressMessagePrefix).append(progressLabelDescription).append(',');
          if (waitingText == null) {
            waitingTextDescription = "null";
          } else {
            waitingTextDescription = "{...}";
          }
          messageWithWaitingTextAndGuard = ((StringBuilder) (Object) messageWithProgressLabel).append(waitingTextDescription).append(',').append(groupId).append(',').append(methodGuard).append(',');
          if (archive == null) {
            archiveDescription = "null";
          } else {
            archiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) progressFailureBeforeContext), ((StringBuilder) (Object) messageWithWaitingTextAndGuard).append(archiveDescription).append(')').toString());
        }
    }

    final static int chooseSpawnSpriteKind(int methodGuard) {
        if (methodGuard != 741924304) {
            return 104;
        }
        if (!(Math.random() < ContextualRuntimeException.specialSpriteKindProbability)) {
            return 0;
        }
        double specialKindRoll = Math.random();
        if (0.13 > specialKindRoll) {
            return 3;
        }
        if (specialKindRoll < 0.25) {
            return 4;
        }
        if (!(specialKindRoll < 0.65)) {
            return 2;
        }
        return 1;
    }

    final int getRetentionCategory(int methodGuard) {
        if (this.headerFlagSet) {
          return 2;
        }
        if ((this.recordKind == 2) &&
            (this.recordMetadataByte > 0)) {
          return 2;
        }
        if (SpriteState.field_n == this.sourceLongId) {
          return 1;
        }
        if ((MouseWheelInput.primarySocialListState == 2) &&
            (CanvasResizeController.hasPrimarySocialEntry(this.sourceDisplayName, (byte) 89))) {
          return 1;
        }
        if (methodGuard > 113) {
          return 0;
        }
        ReceivedTextRecord.chooseSpawnSpriteKind(-69);
        return 0;
    }

    ReceivedTextRecord(boolean retainTemplateReferences) {
        this.sourceDisplayName = AvatarFeedbackSupport.receivedRecordDisplayName;
        this.recordKind = StrongCacheReference.receivedTextRecordKind;
        this.sourceLongId = DiskCacheWorker.receivedRecordLongId;
        this.recordIdLow24 = UsernameAvailabilityValidator.receivedRecordIdLow24;
        this.text = RankedListQuery.receivedRecordText;
        this.headerFlagSet = receivedRecordHeaderFlagSet;
        if (retainTemplateReferences) {
            this.referencedTemplateIds = SessionTextState.receivedTextTemplateReferences;
        } else {
            this.referencedTemplateIds = null;
        }
        this.recordIdHigh16 = LoginUiSupport.receivedRecordIdHigh16;
        this.recordMetadataByte = ArchiveIndex.receivedRecordMetadataByte;
    }

    static {
        int paletteColorIndex = 0;
        unusedFiveStepPalette = new int[5];
        keyboardEventReadIndex = 0;
        pendingPointerPressButton = 0;
        highscoreModeNames = new String[]{"All scores", "My scores", "Best each"};
        field_p = 6;
        for (paletteColorIndex = 0; unusedFiveStepPalette.length > paletteColorIndex; paletteColorIndex++) {
          if (paletteColorIndex != 0) {
            unusedFiveStepPalette[paletteColorIndex] = (1 + paletteColorIndex) * 51 << 16;
          } else {
            unusedFiveStepPalette[paletteColorIndex] = (paletteColorIndex + 1) * 20 << 16;
          }
          if (paletteColorIndex <= 2) {
            continue;
          }
          unusedFiveStepPalette[paletteColorIndex] = SessionInstanceState.orInt(unusedFiveStepPalette[paletteColorIndex], (paletteColorIndex - 2) * 22 << 8);
        }
        tutorialShapeMatchMessage = "Excellent! Now try connecting three of a kind by shape.<br>Press <img=2> to continue.";
    }
}
