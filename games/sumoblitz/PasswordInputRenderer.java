/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordInputRenderer extends BeveledTextInputRenderer {
    static int field_s;
    static String ifYouDoNothingText;
    static int field_r;
    static String unfortunatelyThereWasAText;
    static int[] field_u;

    final String widgetText(boolean guard, UiWidget widget) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!guard) {
            field_s = -86;
          }
          stackIn_3_0 = HardwareUnlitEffect.a(widget.text.length(), '*', -1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("c.I(").append(guard).append(',');
          if (widget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == 22760) {
          unfortunatelyThereWasAText = null;
          ifYouDoNothingText = null;
          field_u = null;
          return;
        }
        ifYouDoNothingText = (String) null;
        unfortunatelyThereWasAText = null;
        ifYouDoNothingText = null;
        field_u = null;
    }

    private PasswordInputRenderer(LegacyBitmapFont textFont, int textColor) {
        super(textFont, textColor);
    }

    PasswordInputRenderer(int textColor) {
        this(kw.field_b, textColor);
    }

    final static void pollKeyboardState(byte guard) {
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1 = wd.field_e;
          synchronized (var1) {
            if (guard < 108) {
              return;
            }
            bj.field_a = OpenGlBuffer.field_a;
            LegacyOpenGlFlowingWaterEffect.field_e = LegacyOpenGlFlowingWaterEffect.field_e + 1;
            if (0 > LegacyOpenGlEnvironmentWaterEffect.field_i) {
              var5 = 0;
              var2 = var5;
              while (var5 < 112) {
                hw.field_b[var5] = false;
                var5++;
              }
              LegacyOpenGlEnvironmentWaterEffect.field_i = HardwareTurbulentWaterNoise.field_v;
            } else {
              while (HardwareTurbulentWaterNoise.field_v != LegacyOpenGlEnvironmentWaterEffect.field_i) {
                var2 = jf.field_d[HardwareTurbulentWaterNoise.field_v];
                HardwareTurbulentWaterNoise.field_v = 127 & HardwareTurbulentWaterNoise.field_v + 1;
                if (0 <= var2) {
                  hw.field_b[var2] = true;
                  continue;
                }
                hw.field_b[~var2] = false;
              }
            }
            OpenGlBuffer.field_a = CacheReferenceNode.field_s;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1_ref), "c.K(" + guard + ')');
        }
    }

    static {
        ifYouDoNothingText = "If you do nothing the game will revert to normal view once the timer reaches 0.";
        unfortunatelyThereWasAText = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_u = new int[]{1, 1, 1};
    }
}
