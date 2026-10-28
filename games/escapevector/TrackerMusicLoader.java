/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrackerMusicLoader {
    static Sprite field_c;
    static SecondaryNodeHashTable field_a;
    static String field_b;

    final static boolean isAccountCharacter(char character, int guard) {
        if (guard != 21654) {
          ScoreSubmission var3 = (ScoreSubmission) null;
          TrackerMusicLoader.enqueueScoreSubmission((ScoreSubmission) null, -66, (byte) -72);
          return EmailAvailabilityRequest.a(character, -11217);
        }
        return EmailAvailabilityRequest.a(character, -11217);
    }

    public static void releaseStatics(int guard) {
        if (guard >= -112) {
          return;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static TrackerMusicDefinition load(int guard, ResourceArchive archive, SoundCache sounds, int fileId, int groupId) {
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        try {
          byte[] var6 = archive.getFile(groupId, (byte) -97, fileId);
          byte[] var5 = var6;
          if (var6 == null) {
            return null;
          }
          if (guard == -15618) {
            TrackerMusicDefinition stackIn_7_0 = new TrackerMusicDefinition(new PacketBuffer(var6), sounds);
            return stackIn_7_0;
          }
          TrackerMusicDefinition stackIn_5_0 = (TrackerMusicDefinition) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var5_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("ml.B(").append(guard).append(',');
          if (archive == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (sounds == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(fileId).append(',').append(groupId).append(')').toString());
        }
    }

    final static void enqueueScoreSubmission(ScoreSubmission submission, int opcode, byte guard) {
        try {
          LoginCredentials.field_d.addLast(-12328, submission);
          LevelSelectScreen.writeScoreSubmission(-75, opcode, submission);
          if (guard != 101) {
            TrackerMusicLoader.releaseStatics(-42);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ml.D(" + (submission != null ? "{...}" : "null") + ',' + opcode + ',' + guard + ')');
        }
    }

    static {
        field_b = "Password is valid";
    }
}
