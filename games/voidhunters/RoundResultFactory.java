/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RoundResultFactory implements GameStateFactory {
    static QuickChatHelpWindow field_a;

    final static void blendHalfAlphaSpan(boolean param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = VoidHunters.field_G;
        try {
          if (!param0) {
            field_a = (QuickChatHelpWindow) null;
          }
          while (true) {
            param3--;
            if (param3 < 0) {
              return;
            }
            var9 = param4;
            var5 = var9;
            var6 = param1;
            var7 = param2;
            var9[var6] = MenuBackgroundBattle.andBits(8355711, var9[var6] >> 1) + var7;
            param1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("wga.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_a = (QuickChatHelpWindow) null;
          return (SerializableGameState[]) ((Object) new RoundResult[param1]);
        }
        return (SerializableGameState[]) ((Object) new RoundResult[param1]);
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 == -1) {
          return;
        }
        field_a = (QuickChatHelpWindow) null;
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 127 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new RoundResult());
    }

    static {
    }
}
