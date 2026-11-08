/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioPumpHelpers {
    static BinaryBitmapFont field_d;
    static LoginMethod field_e;
    static String field_c;
    static Sprite[][] field_a;
    static ResourceArchive field_b;

    final static String charToString(int param0, char param1) {
        if (param0 < 123) {
          return (String) null;
        }
        return String.valueOf(param1);
    }

    final static AccountRequestReply takeAccountRequestResult(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        AccountRequestReply stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 200) {
            field_b = (ResourceArchive) null;
          }
          if (MatchingTextValidator.field_n == Js5NetworkRequest.field_F) {
            stackIn_4_0 = null;
            return (AccountRequestReply) (stackIn_4_0);
          }
          if (MatchingTextValidator.field_n == Checkbox.field_N &&
            param1.equals(PlayerController.field_m)) {
            MatchingTextValidator.field_n = ReportReason.field_a;
            stackIn_8_0 = SpriteCheckboxPainter.field_f;
            return stackIn_8_0;
          }
          MatchingTextValidator.field_n = Js5NetworkRequest.field_F;
          PlayerController.field_m = param1;
          SpriteCheckboxPainter.field_f = null;
          stackIn_10_0 = null;
          return (AccountRequestReply) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ig.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = (Sprite[][]) null;
        field_c = null;
        field_b = null;
        int var1 = 113 % ((-66 - param0) / 54);
        field_e = null;
        field_d = null;
    }

    final static void pumpAudio(int param0) {
        int var1_int = 0;
        VolumeControlledVoice var2 = null;
        int var3 = 0;
        boolean stackIn_18_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        VolumeControlledVoice var2Lifetime1;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          MainMenuScreen.field_t.serviceOutput();
          GridSize.field_h.serviceOutput();
          var1_int = -121 % ((param0 - 54) / 39);
          ConnectionStateGlobals.field_a = ConnectionStateGlobals.field_a - 1;
          if (ConnectionStateGlobals.field_a == 0) {
            ConnectionStateGlobals.field_a = 200;
            var2 = (VolumeControlledVoice) (ScreenDisplayMode.field_d.first(1504642273));
            while (var2 != null) {
              if (!var2.field_k.isLinked(0)) {
                var2.unlink(2779);
              }
              var2 = (VolumeControlledVoice) (ScreenDisplayMode.field_d.next(1504642273));
            }
            if (LoginCredentials.field_b != null) {
              var2Lifetime1 = (VolumeControlledVoice) (LoginCredentials.field_b.first(1504642273));
              while (var2Lifetime1 != null) {
                if (!var2Lifetime1.field_k.isLinked(0)) {
                  var2Lifetime1.unlink(2779);
                }
                var2Lifetime1 = (VolumeControlledVoice) (LoginCredentials.field_b.next(1504642273));
              }
            }
          }
          if ((null != MainMenuScreen.field_q) &&
            (stackIn_18_0 = MainMenuScreen.field_q.isReady((byte) -123))) {
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1), "ig.B(" + param0 + ')');
        }
    }

    static {
        field_c = "OK";
        field_e = new LoginMethod("email");
    }
}
