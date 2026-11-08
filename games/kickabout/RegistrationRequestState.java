/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RegistrationRequestState {
    static String field_b;
    static boolean field_f;
    static ClubState field_h;
    static String field_e;
    static UiLayoutNode field_a;
    static boolean field_i;
    static String field_c;
    static String field_g;
    static String field_j;
    static java.awt.Canvas field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void drawCaptionedMessage(int param0, String param1, boolean param2, String param3, int param4, boolean param5, boolean param6, int param7) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Kickabout.field_G;
        try {
          var8_int = param0 - 30;
          var9 = 16 + IsSixCommand.field_C.paragraphHeight(param1, var8_int, 16);
          if (param6) {
            param4 = param4 - (var9 >> 1);
          }
          var10 = 15 + param7;
          if (param5) {
            RegistrationRequestState.configureGameReverb(0.2927350103855133f, 0.23789334297180176f, 0.7446646690368652f, -0.029778925701975822f, -2.126020908355713f, (byte) -27, -1.3001068830490112f);
          }
          var11 = 8 + param4;
          if (param3 != null) {
            var9 += 34;
            var11 += 30;
          }
          var12 = 10;
          while (var9 <= var12 << 1) {
            var12 = var12 >> 1;
          }
          SoftwareRasterizer.fillRoundedRectangleBlended(param7, param4, param0, var9, var12, 65793, 140);
          IsSixCommand.field_C.drawParagraph(param1, var10, var11, var8_int, var9, 16777215, -1, 0, 0, 16);
          if (param3 == null) {
            return;
          }
          if (!param2) {
            ByteArrayPool.field_d.drawText(param3, var10, -10 + var11, 16777215, -1);
            return;
          }
          ByteArrayPool.field_d.drawCentered(param3, var10 + (var8_int >> 1), var11 - 10, 16777215, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = var8;
          stackIn_19_1 = new StringBuilder().append("ic.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_g = null;
        field_h = null;
        field_c = null;
        if (param0 >= 67) {
          field_a = null;
          field_e = null;
          field_j = null;
          field_b = null;
          field_d = null;
          return;
        }
        field_h = (ClubState) null;
        field_a = null;
        field_e = null;
        field_j = null;
        field_b = null;
        field_d = null;
    }

    final static void configureGameReverb(float param0, float param1, float param2, float param3, float param4, byte param5, float param6) {
        MusicTrackMixer var7 = null;
        if (param5 == -113) {
          if (AnimationClip.field_k == null) {
            var7 = LoadingProgressSupport.field_d;
            AnimationClip.field_k = new ReverbPcmStream(var7);
            PitchPurchaseSupport.field_d.setRootStream(AnimationClip.field_k);
          }
          AnimationClip.field_k.setInputGain(param3);
          AnimationClip.field_k.setFeedbackGain(param6);
          AnimationClip.field_k.setDampingTimeMicros(param4);
          AnimationClip.field_k.setWetGain(param2);
          AnimationClip.field_k.setDryGain(param0);
          AnimationClip.field_k.setStereoWidth(param1);
          return;
        }
    }

    static {
        field_b = "League Point Thresholds";
        field_e = "Error connecting to server. Please try using a different server.";
        field_i = false;
        field_g = "Return to Main Menu";
        field_c = "You need a rating of <%1> to play with the current options.";
        field_j = "search";
        field_h = new ClubState();
    }
}
