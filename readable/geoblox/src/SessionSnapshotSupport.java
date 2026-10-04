/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SessionSnapshotSupport {
    static Sprite logoSceneRaster;
    static ResourceArchive basicUiGraphicsArchive;
    static int currentKeyboardEventCode;
    static String fullscreenNonmemberText;
    static String js5ConnectErrorText;

    final static void retainSessionSnapshot(ClientSessionSnapshot snapshot, int methodGuard) {
        int existingCategoryIndexSnapshot = 0;
        int newCategoryIndexSnapshot = 0;
        int readIndex = 0;
        int writeIndexBeforeIncrement = 0;
        int appendIndexBeforeCountIncrement = 0;
        RuntimeException retentionFailureBeforeDescription = null;
        StringBuilder retentionMessagePrefix = null;
        String snapshotDescription = null;
        RuntimeException caughtRetentionFailure = null;
        int clearIndexThenWriteIndex = 0;
        RuntimeException retentionFailureForContext = null;
        int snapshotCategoryIndex = 0;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          for (clearIndexThenWriteIndex = 0; clearIndexThenWriteIndex < 3; clearIndexThenWriteIndex++) {
            AchievementSubmission.field_o[clearIndexThenWriteIndex] = 0;
          }
          for (clearIndexThenWriteIndex = 0; clearIndexThenWriteIndex < ByteStorage.field_b; clearIndexThenWriteIndex++) {
            if (MatchingTextValidator.field_k[clearIndexThenWriteIndex].field_f == snapshot.field_f) {
              existingCategoryIndexSnapshot = MatchingTextValidator.field_k[clearIndexThenWriteIndex].c(124);
              AchievementSubmission.field_o[existingCategoryIndexSnapshot] = AchievementSubmission.field_o[existingCategoryIndexSnapshot] + 1;
            }
          }
          if (methodGuard != 31274) {
            return;
          }
          newCategoryIndexSnapshot = snapshot.c(125);
          AchievementSubmission.field_o[newCategoryIndexSnapshot] = AchievementSubmission.field_o[newCategoryIndexSnapshot] + 1;
          clearIndexThenWriteIndex = 0;
          for (readIndex = 0; ByteStorage.field_b > readIndex; readIndex++) {
            L3: {
              if (snapshot.field_f == MatchingTextValidator.field_k[readIndex].field_f) {
                snapshotCategoryIndex = MatchingTextValidator.field_k[readIndex].c(124);
                if (AchievementSubmission.field_o[snapshotCategoryIndex] > MidiNote.field_v) {
                  AchievementSubmission.field_o[snapshotCategoryIndex] = AchievementSubmission.field_o[snapshotCategoryIndex] - 1;
                  break L3;
                }
              }
              writeIndexBeforeIncrement = clearIndexThenWriteIndex;
              clearIndexThenWriteIndex++;
              MatchingTextValidator.field_k[writeIndexBeforeIncrement] = MatchingTextValidator.field_k[readIndex];
            }
          }
          ByteStorage.field_b = clearIndexThenWriteIndex;
          appendIndexBeforeCountIncrement = ByteStorage.field_b;
          ByteStorage.field_b = ByteStorage.field_b + 1;
          MatchingTextValidator.field_k[appendIndexBeforeCountIncrement] = snapshot;
          return;
        } catch (java.lang.RuntimeException retentionFailure) {
          caughtRetentionFailure = retentionFailure;
          retentionFailureForContext = caughtRetentionFailure;
          retentionFailureBeforeDescription = retentionFailureForContext;
          retentionMessagePrefix = new StringBuilder().append("ki.B(");
          if (snapshot == null) {
            snapshotDescription = "null";
          } else {
            snapshotDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) retentionFailureBeforeDescription), ((StringBuilder) (Object) retentionMessagePrefix).append(snapshotDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        js5ConnectErrorText = null;
        logoSceneRaster = null;
        fullscreenNonmemberText = null;
        basicUiGraphicsArchive = null;
        if (methodGuard != -64) {
            ClientSessionSnapshot unusedNullSnapshot = (ClientSessionSnapshot) null;
            SessionSnapshotSupport.retainSessionSnapshot((ClientSessionSnapshot) null, -13);
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
