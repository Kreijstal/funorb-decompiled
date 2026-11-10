/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingTextValidator extends TextInputValidator {
    private TextInputWidget field_q;
    static byte[][] field_t;
    static Sprite field_v;
    static String[] field_s;
    static String field_r;
    static Sprite[] field_u;
    static BinaryBitmapFont field_w;

    public static void releaseStatics(int param0) {
        field_s = null;
        field_r = null;
        field_u = null;
        field_t = (byte[][]) null;
        field_w = null;
        if (param0 != 1) {
          return;
        }
        field_v = null;
    }

    final static int clampPopupX(int param0, byte param1, int param2, int param3) {
        if (!(SoftwareRasterizer.width < param0 + param2)) {
          return param0;
        }
        int var4 = -6 % ((-7 - param1) / 32);
        if (-param2 + (param3 + param0) >= 0) {
          return -param2 + param0 + param3;
        }
        return SoftwareRasterizer.width - param2;
    }

    final static Sprite[] createSolidPanelSprites(int param0, int param1, int param2, int param3, int param4) {
        Sprite[] var6 = new Sprite[9];
        Sprite[] var5 = var6;
        Sprite dupTemp$0 = PacketBuffer.createSolidSprite(-109, param1, param3);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        Sprite dupTemp$1 = PacketBuffer.createSolidSprite(-125, param1, param4);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param0 != 0) {
          var6[4] = PacketBuffer.createSolidSprite(-124, 64, param0);
          if (param2 <= -55) {
            return var5;
          }
          return (Sprite[]) null;
        }
        if (param2 <= -55) {
          return var5;
        }
        return (Sprite[]) null;
    }

    final static void drawModalOverlay(boolean param0, boolean param1) {
        CookieHelpers.drawOverlayBackdrop(param0, param1, -105);
    }

    final ValidationState validationStateForText(boolean param0, String param1) {
        ValidationProvider var3 = null;
        RuntimeException var3_ref = null;
        ValidationState stackIn_6_0 = null;
        ValidationState stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_r = (String) null;
          }
          if (this.field_q instanceof ValidationProviderSource) {
            var3 = ((ValidationProviderSource) ((Object) this.field_q)).getValidationProvider((byte) 101);
            if (var3 != null &&
              var3.getDebouncedValidationState(49) != AudioStartupHelpers.field_b) {
              stackIn_6_0 = PowerGaugeHelpers.field_b;
              return stackIn_6_0;
            }
          }
          if (param1.equals(this.field_q.field_j)) {
            stackIn_10_0 = AudioStartupHelpers.field_b;
          } else {
            stackIn_10_0 = PowerGaugeHelpers.field_b;
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("qp.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    MatchingTextValidator(TextInputWidget param0, TextInputWidget param1) {
        super(param0);
        try {
          this.field_q = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "qp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String validationMessageForText(String param0, int param1) {
        ValidationProvider var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_q instanceof ValidationProviderSource) {
            var3 = ((ValidationProviderSource) ((Object) this.field_q)).getValidationProvider((byte) 85);
            if (var3 != null) {
              if (var3.getDebouncedValidationState(125) == AudioStartupHelpers.field_b &&
                !param0.equals(this.field_q.field_j)) {
                stackIn_5_0 = AwtEventPumpHelpers.field_d;
                return stackIn_5_0;
              }
              stackIn_7_0 = var3.getDebouncedValidationMessage(-122);
              return stackIn_7_0;
            }
          }
          if (!param0.equals(this.field_q.field_j)) {
            stackIn_11_0 = AwtEventPumpHelpers.field_d;
            return stackIn_11_0;
          }
          if (param1 == -1276425040) {
            return null;
          }
          MatchingTextValidator.createSolidPanelSprites(-118, 127, -62, 52, -38);
          stackIn_15_0 = null;
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("qp.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_r = "Tech Master";
    }
}
