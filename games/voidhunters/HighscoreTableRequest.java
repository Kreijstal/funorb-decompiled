/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class HighscoreTableRequest extends IntrusiveNode {
    static String field_d;
    static int field_f;
    int id;
    int rowLimit;
    static ModalStack field_h;
    int columnCount;

    final static void initializeSoundQueues(byte param0) {
        NetworkGameClient.activeOneShotSounds = new IntrusiveDeque();
        PlayerReady.activeLoopingSounds = new IntrusiveDeque();
        if (param0 >= 52) {
          OpenGlGpuToolkit.field_Jc = new Random();
          return;
        }
        HighscoreTableRequest.isVoteOptionVisible(11, (byte) 95);
        OpenGlGpuToolkit.field_Jc = new Random();
    }

    final static boolean isVoteOptionVisible(int param0, byte param1) {
        if (param1 != -25) {
          return true;
        }
        if (!OpenGlSprite.isVoteOptionAvailable(111, param0)) {
          if (ArchiveIndexLoader.field_g.isVoteOptionComingSoon(param0, param1 ^ -29)) {
            return ArchiveIndexLoader.field_g.isVoteOptionAllowedInCurrentMode(param0, false) ? true : false;
          }
          return false;
        }
        if (ArchiveIndexLoader.field_g.isVoteOptionAllowedInCurrentMode(param0, false)) {
          return true;
        }
        return false;
    }

    final static int countOccurrences(char param0, byte param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = VoidHunters.field_G;
        try {
          var3_int = 0;
          if (param1 != 58) {
            stackIn_3_0 = -52;
            return stackIn_3_0;
          }
          var4 = param2.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (param0 == param2.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("qn.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(boolean param0) {
        if (!param0) {
          HighscoreTableRequest.initializeSoundQueues((byte) -115);
          field_h = null;
          field_d = null;
          return;
        }
        field_h = null;
        field_d = null;
    }

    private HighscoreTableRequest() throws Throwable {
        throw new Error();
    }

    static {
        field_f = 20;
        field_d = "Decreased map width";
    }
}
