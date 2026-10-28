/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HudMessage extends IntrusiveNode {
    static int[] field_h;
    static SpriteLoadTask[] field_k;
    static String[] field_j;
    String text;
    int durationTicks;

    public static void releaseStatics(byte guard) {
        if (guard != -85) {
          return;
        }
        field_h = null;
        field_k = null;
        field_j = null;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          HudMessage.releaseStatics((byte) -76);
          if (TextLayout.field_c == null) {
            return false;
          }
          if (AccountFormStage.field_d == ThreeSliceButtonPainter.field_t) {
            return true;
          }
          return false;
        }
        if (TextLayout.field_c == null) {
          return false;
        }
        if (AccountFormStage.field_d == ThreeSliceButtonPainter.field_t) {
          return true;
        }
        return false;
    }

    final static void a(LegacyButton[] param0, int param1, int param2, byte param3) {
        String stackIn_21_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          if (param0 == null) {
            return;
          }
          LegacyButton[] var11 = param0;
          LegacyButton[] var4 = var11;
          for (int var5 = 0; var11.length > var5; var5++) {
            LegacyButton var6 = var11[var5];
            if (var6 != null) {
              int var7 = var6.actionId;
              boolean stackIn_9_0 = !(param2 != var7);
              boolean var8 = stackIn_9_0;
              boolean stackIn_12_0 = !(var7 != param1);
              boolean var9 = stackIn_12_0;
              var6.drawState((var8), (var9), (byte) 81);
            }
          }
          if (param3 > -5) {
            field_k = (SpriteLoadTask[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var4_ref;
          StringBuilder stackIn_20_1 = new StringBuilder().append("rb.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    HudMessage(String text, int durationTicks) {
        try {
          this.text = text;
          this.durationTicks = durationTicks;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "rb.<init>(" + (text != null ? "{...}" : "null") + ',' + durationTicks + ')');
        }
    }

    static {
        field_j = new String[]{"Congratulations on your success in the asteroid belt. Given your success thus far, we are extending your mission. You must now cripple the alien's mining operations.", "Target and eliminate their ore extraction machinery."};
    }
}
