/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static String field_e;
    static java.awt.Canvas field_d;
    static int field_c;
    static ValidationState field_f;
    static boolean field_b;
    static Sprite field_a;
    static fd field_g;
    static PcmSample field_h;

    final static Sprite a(int param0, byte param1, int param2) {
        int var6 = EscapeVector.obfuscationControl;
        Sprite var7 = new Sprite(param2, param2);
        Sprite var3 = var7;
        int var4 = 92 % ((param1 - 15) / 58);
        for (int var5 = 0; var5 < var3.pixels.length; var5++) {
          var7.pixels[var5] = param0;
        }
        return var3;
    }

    final static boolean a(char param0, byte param1) {
        if (param1 < 28) {
          of.a('ﾱ', (byte) 49);
        }
        boolean stackIn_10_0 = ((!(65 > param0) &&
          !(90 < param0)) ||
          (!(param0 < 97) &&
          !(122 < param0)));
        return stackIn_10_0;
    }

    final static boolean a(ResourceArchive param0, ResourceArchive param1, ResourceArchive param2, byte param3) {
        String stackIn_22_2 = null;
        String stackIn_25_2 = null;
        String stackIn_28_2 = null;
        try {
          if (!param0.b(0)) {
            return false;
          }
          if (!param0.a(0, "commonui")) {
            return false;
          }
          if (param1.b(0) &&
            param1.a(0, "commonui")) {
            if (param2.b(0) &&
              param2.a(0, "button.gif")) {
              if (param3 > -1) {
                field_h = (PcmSample) null;
              }
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var4;
          StringBuilder stackIn_21_1 = new StringBuilder().append("of.F(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          StringBuilder stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          StringBuilder stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(')').toString());
        }
    }

    final static NameAvailabilityResult a(int param0, String param1) {
        String stackIn_14_2 = null;
        try {
          if (param0 != 122) {
            of.a('o', (byte) -83);
          }
          if (ui.field_b == EmailAvailabilityValidator.field_o) {
            return null;
          }
          if (ia.field_y == ui.field_b &&
            param1.equals(tc.field_j)) {
            ui.field_b = RasterBuffer.field_g;
            NameAvailabilityResult stackIn_8_0 = co.field_a;
            return stackIn_8_0;
          }
          tc.field_j = param1;
          co.field_a = null;
          ui.field_b = EmailAvailabilityValidator.field_o;
          Object stackIn_10_0 = null;
          return (NameAvailabilityResult) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var2;
          StringBuilder stackIn_13_1 = new StringBuilder().append("of.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (param0) {
          of.releaseStatics(89);
        }
        gi.field_e = null;
        gn.field_k = null;
        qe.field_a = (byte[][]) null;
        bc.field_a = null;
        qk.field_f = null;
        qh.field_k = null;
    }

    final static int a(byte param0) {
        if (param0 >= -72) {
          of.releaseStatics(-52);
        }
        return md.field_G;
    }

    public static void releaseStatics(int guard) {
        if (guard != 122) {
          return;
        }
        field_e = null;
        field_a = null;
        field_d = null;
        field_h = null;
        field_g = null;
        field_f = null;
    }

    static {
        field_e = "Start Game";
        field_c = 70;
        field_f = new ValidationState();
    }
}
