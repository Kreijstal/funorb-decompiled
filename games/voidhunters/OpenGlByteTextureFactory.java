/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlByteTextureFactory {
    static String field_a;
    static String field_b;

    final static void showReconnectLogin(byte param0) {
        String var1 = null;
        if (!OpenGlSprite.reconnecting) {
          throw new IllegalStateException();
        }
        if (param0 == 63) {
          if (null != SetPointDefenceLaserAimarc.field_o) {
            SetPointDefenceLaserAimarc.field_o.closeDialog((byte) -106);
          }
          var1 = DisplayModeErrorDialog.getLoginNameOrFallback((byte) -118);
          SetAiFiringRangeUpshift.field_o = new LoginForm(var1, (String) null, true, false, false);
          GetLagStandardDeviationIn.modalStack.pushPanel(false, GetMissionVariablesHudX.field_o);
          GetMissionVariablesHudX.field_o.transitionToContent(SetAiFiringRangeUpshift.field_o, -110);
          GetMissionVariablesHudX.field_o.finishResize(param0 - 10394);
          return;
        }
    }

    final static OpenGlSpriteTexture createByteTexture(int param0, OpenGlToolkit param1, int param2, byte[] param3, int param4, boolean param5, int param6, int param7) {
        RuntimeException var8 = null;
        OpenGlSpriteTexture stackIn_2_0 = null;
        OpenGlSpriteTexture stackIn_9_0 = null;
        OpenGlSpriteTexture stackIn_11_0 = null;
        OpenGlSpriteTexture stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 != 21989) {
            stackIn_2_0 = (OpenGlSpriteTexture) null;
            return stackIn_2_0;
          }
          if (!param1.field_n && (!LobbyThemeBuilder.hasAtMostOneBitSet(param2, (byte) -95) ||
            !LobbyThemeBuilder.hasAtMostOneBitSet(param0, (byte) -95))) {
            if (!param1.field_g) {
              stackIn_11_0 = new OpenGlSpriteTexture(param1, param7, param2, param0, GetSalvoaim.nextPowerOfTwo(param2, (byte) -95), GetSalvoaim.nextPowerOfTwo(param0, (byte) -109), param3, param4);
              return stackIn_11_0;
            }
            stackIn_9_0 = new OpenGlSpriteTexture(param1, 34037, param7, param2, param0, param5, param3, param4);
            return stackIn_9_0;
          }
          stackIn_13_0 = new OpenGlSpriteTexture(param1, 3553, param7, param2, param0, param5, param3, param4);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("kia.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 3553) {
          field_a = (String) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Message game";
        field_a = "<%0> has won the round!";
    }
}
