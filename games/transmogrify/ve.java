/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends InteractiveWidget {
    private FieldValidator field_A;
    static String field_D;
    static boolean[] field_B;
    private int field_C;

    final static boolean a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          var2_int = param1.charAt(0);
          for (var3 = param0; param1.length() > var3; var3++) {
            if (var2_int != param1.charAt(var3)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ve.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final String getTooltipText(int param0) {
        if (param0 != 4) {
          UiWidget var3 = (UiWidget) null;
          this.a((UiWidget) null, 58);
          if (this.field_g) {
            return this.field_A.getValidationMessage(param0 + 30519);
          }
          return null;
        }
        if (this.field_g) {
          return this.field_A.getValidationMessage(param0 + 30519);
        }
        return null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        Sprite var16 = null;
        Sprite var17 = null;
        Sprite var14 = null;
        Sprite var13 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = Transmogrify.field_A ? 1 : 0;
        int var10Lifetime1;
        int var11Lifetime1;
        super.a(param0, param1, param2, (byte) 111);
        if (param2 != 0) {
          return;
        }
        int var5 = this.field_p + (param0 + (this.field_l >> 1));
        int var6 = param1 - (-this.field_n - (this.field_h >> 1));
        int var9 = -100 % ((param3 - 77) / 34);
        rc var8 = this.field_A.getValidationStatus(27835);
        if (var8 == ek.field_a) {
          var16 = ai.field_b[0];
          var10 = var16.field_r << 1;
          var11 = var16.field_s << 1;
          if (null == EmailFormatValidator.field_l) {
            EmailFormatValidator.field_l = new Sprite(var10, var11);
            CrossfadingMidiPcmStream.a(EmailFormatValidator.field_l, 256);
            var16.drawRotatedAbout(112, 144, var16.field_r << 4, var16.field_s << 4, -this.field_C << 10, 4096);
            fi.c(true);
            EmailFormatValidator.field_l.drawAdditive(-var16.field_r + var5, var6 - var16.field_s, 256);
            return;
          }
          if (var10 > EmailFormatValidator.field_l.field_n) {
            EmailFormatValidator.field_l = new Sprite(var10, var11);
            CrossfadingMidiPcmStream.a(EmailFormatValidator.field_l, 256);
            var16.drawRotatedAbout(112, 144, var16.field_r << 4, var16.field_s << 4, -this.field_C << 10, 4096);
            fi.c(true);
            EmailFormatValidator.field_l.drawAdditive(-var16.field_r + var5, var6 - var16.field_s, 256);
            return;
          }
          if (EmailFormatValidator.field_l.field_m < var11) {
            EmailFormatValidator.field_l = new Sprite(var10, var11);
            CrossfadingMidiPcmStream.a(EmailFormatValidator.field_l, 256);
            var16.drawRotatedAbout(112, 144, var16.field_r << 4, var16.field_s << 4, -this.field_C << 10, 4096);
            fi.c(true);
            EmailFormatValidator.field_l.drawAdditive(-var16.field_r + var5, var6 - var16.field_s, 256);
            return;
          }
          CrossfadingMidiPcmStream.a(EmailFormatValidator.field_l, 256);
          SoftwareRasterizer.clearRaster();
          var16.drawRotatedAbout(112, 144, var16.field_r << 4, var16.field_s << 4, -this.field_C << 10, 4096);
          fi.c(true);
          EmailFormatValidator.field_l.drawAdditive(-var16.field_r + var5, var6 - var16.field_s, 256);
          return;
        }
        if (var8 == fi.field_u) {
          var17 = ai.field_b[0];
          var10Lifetime1 = var17.field_r << 1;
          var11Lifetime1 = var17.field_s << 1;
          if (null == EmailFormatValidator.field_l) {
            EmailFormatValidator.field_l = new Sprite(var10Lifetime1, var11Lifetime1);
            CrossfadingMidiPcmStream.a(EmailFormatValidator.field_l, 256);
            var17.drawRotatedAbout(112, 144, var17.field_r << 4, var17.field_s << 4, -this.field_C << 10, 4096);
            fi.c(true);
            EmailFormatValidator.field_l.drawAdditive(-var17.field_r + var5, var6 - var17.field_s, 256);
            return;
          }
          if (var10Lifetime1 > EmailFormatValidator.field_l.field_n) {
            EmailFormatValidator.field_l = new Sprite(var10Lifetime1, var11Lifetime1);
            CrossfadingMidiPcmStream.a(EmailFormatValidator.field_l, 256);
            var17.drawRotatedAbout(112, 144, var17.field_r << 4, var17.field_s << 4, -this.field_C << 10, 4096);
            fi.c(true);
            EmailFormatValidator.field_l.drawAdditive(-var17.field_r + var5, var6 - var17.field_s, 256);
            return;
          }
          if (EmailFormatValidator.field_l.field_m < var11Lifetime1) {
            EmailFormatValidator.field_l = new Sprite(var10Lifetime1, var11Lifetime1);
            CrossfadingMidiPcmStream.a(EmailFormatValidator.field_l, 256);
            var17.drawRotatedAbout(112, 144, var17.field_r << 4, var17.field_s << 4, -this.field_C << 10, 4096);
            fi.c(true);
            EmailFormatValidator.field_l.drawAdditive(-var17.field_r + var5, var6 - var17.field_s, 256);
            return;
          }
          CrossfadingMidiPcmStream.a(EmailFormatValidator.field_l, 256);
          SoftwareRasterizer.clearRaster();
          var17.drawRotatedAbout(112, 144, var17.field_r << 4, var17.field_s << 4, -this.field_C << 10, 4096);
          fi.c(true);
          EmailFormatValidator.field_l.drawAdditive(-var17.field_r + var5, var6 - var17.field_s, 256);
          return;
        }
        if (var8 == SocketConnector.field_d) {
          var14 = ai.field_b[2];
          var14.drawAdditive(var5 - (var14.field_n >> 1), var6 - (var14.field_m >> 1), 256);
          return;
        }
        if (hi.field_b == var8) {
          var13 = ai.field_b[1];
          var13.drawAdditive(var5 - (var13.field_n >> 1), var6 - (var13.field_m >> 1), 256);
          return;
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_B = null;
        field_D = null;
        if (param0 > -58) {
          ve.clearStaticReferences((byte) 42);
        }
    }

    final static AccountServiceResult createAccountSuggestionsResult(String[] args, byte param1) {
        AccountServiceResult var2 = null;
        RuntimeException var2_ref = null;
        AccountServiceResult stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -98) {
            field_D = (String) null;
          }
          var2 = new AccountServiceResult(false);
          var2.suggestions = args;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("ve.C(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        String[] var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -11) {
            return false;
          }
          var4 = (String[]) null;
          ve.createAccountSuggestionsResult((String[]) null, (byte) -44);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ve.M(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ve(FieldValidator param0) {
        try {
          this.field_A = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "ve.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, UiWidget param2, int param3) {
        try {
          this.field_C = this.field_C + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "ve.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_B = new boolean[112];
        field_D = "Total";
    }
}
