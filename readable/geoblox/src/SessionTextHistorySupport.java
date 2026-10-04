/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SessionTextHistorySupport {
    static Sprite logoSceneRaster;
    static ResourceArchive basicUiGraphicsArchive;
    static int currentKeyboardEventCode;
    static String fullscreenNonmemberText;
    static String js5ConnectErrorText;

    final static void retainTextRecord(ReceivedTextRecord record, int methodGuard) {
        int existingCategoryIndexSnapshot = 0;
        int newCategoryIndexSnapshot = 0;
        int readIndex = 0;
        int writeIndexBeforeIncrement = 0;
        int appendIndexBeforeCountIncrement = 0;
        RuntimeException retentionFailureBeforeDescription = null;
        StringBuilder retentionMessagePrefix = null;
        String recordDescription = null;
        RuntimeException caughtRetentionFailure = null;
        int clearIndexThenWriteIndex = 0;
        RuntimeException retentionFailureForContext = null;
        int recordCategoryIndex = 0;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          for (clearIndexThenWriteIndex = 0; clearIndexThenWriteIndex < 3; clearIndexThenWriteIndex++) {
            AchievementSubmission.retentionCategoryCounts[clearIndexThenWriteIndex] = 0;
          }
          for (clearIndexThenWriteIndex = 0; clearIndexThenWriteIndex < ByteStorage.retainedTextRecordCount; clearIndexThenWriteIndex++) {
            if (MatchingTextValidator.retainedTextRecords[clearIndexThenWriteIndex].recordKind == record.recordKind) {
              existingCategoryIndexSnapshot = MatchingTextValidator.retainedTextRecords[clearIndexThenWriteIndex].getRetentionCategory(124);
              AchievementSubmission.retentionCategoryCounts[existingCategoryIndexSnapshot] = AchievementSubmission.retentionCategoryCounts[existingCategoryIndexSnapshot] + 1;
            }
          }
          if (methodGuard != 31274) {
            return;
          }
          newCategoryIndexSnapshot = record.getRetentionCategory(125);
          AchievementSubmission.retentionCategoryCounts[newCategoryIndexSnapshot] = AchievementSubmission.retentionCategoryCounts[newCategoryIndexSnapshot] + 1;
          clearIndexThenWriteIndex = 0;
          for (readIndex = 0; ByteStorage.retainedTextRecordCount > readIndex; readIndex++) {
            L3: {
              if (record.recordKind == MatchingTextValidator.retainedTextRecords[readIndex].recordKind) {
                recordCategoryIndex = MatchingTextValidator.retainedTextRecords[readIndex].getRetentionCategory(124);
                if (AchievementSubmission.retentionCategoryCounts[recordCategoryIndex] > MidiNote.recordsPerKindAndCategoryLimit) {
                  AchievementSubmission.retentionCategoryCounts[recordCategoryIndex] = AchievementSubmission.retentionCategoryCounts[recordCategoryIndex] - 1;
                  break L3;
                }
              }
              writeIndexBeforeIncrement = clearIndexThenWriteIndex;
              clearIndexThenWriteIndex++;
              MatchingTextValidator.retainedTextRecords[writeIndexBeforeIncrement] = MatchingTextValidator.retainedTextRecords[readIndex];
            }
          }
          ByteStorage.retainedTextRecordCount = clearIndexThenWriteIndex;
          appendIndexBeforeCountIncrement = ByteStorage.retainedTextRecordCount;
          ByteStorage.retainedTextRecordCount = ByteStorage.retainedTextRecordCount + 1;
          MatchingTextValidator.retainedTextRecords[appendIndexBeforeCountIncrement] = record;
          return;
        } catch (java.lang.RuntimeException retentionFailure) {
          caughtRetentionFailure = retentionFailure;
          retentionFailureForContext = caughtRetentionFailure;
          retentionFailureBeforeDescription = retentionFailureForContext;
          retentionMessagePrefix = new StringBuilder().append("ki.B(");
          if (record == null) {
            recordDescription = "null";
          } else {
            recordDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) retentionFailureBeforeDescription), ((StringBuilder) (Object) retentionMessagePrefix).append(recordDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        js5ConnectErrorText = null;
        logoSceneRaster = null;
        fullscreenNonmemberText = null;
        basicUiGraphicsArchive = null;
        if (methodGuard != -64) {
            ReceivedTextRecord unusedNullRecord = (ReceivedTextRecord) null;
            SessionTextHistorySupport.retainTextRecord((ReceivedTextRecord) null, -13);
        }
    }

    final static void prepareAccountCreationUi(int methodGuard) {
        AccountCreationDialog.a(ResourceArchive.accountCreationEmail, (byte) -61, true, ByteStorage.accountCreationPassword);
        int sentinelRemainder = -30 % ((methodGuard + 30) / 36);
        VisualPropertyOverrides.field_I = true;
    }

    static {
        logoSceneRaster = new Sprite(540, 140);
        fullscreenNonmemberText = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        js5ConnectErrorText = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
