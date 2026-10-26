/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo {
    static Sprite field_b;
    static int field_a;
    int field_c;

    public static void a(byte param0) {
        if (param0 != 50) {
          field_b = (Sprite) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1) {
        if (param1 == 0) {
          return 0;
        }
        if (0 < param1) {
          int var2 = 1;
          if (65535 < param1) {
            param1 = param1 >> 16;
            var2 += 16;
          }
          if (param1 > 255) {
            param1 = param1 >> 8;
            var2 += 8;
          }
          if (15 < param1) {
            var2 += 4;
            param1 = param1 >> 4;
          }
          if (param1 > 3) {
            var2 += 2;
            param1 = param1 >> 2;
          }
          if (param1 > 1) {
            var2++;
            param1 = param1 >> 1;
          }
          return var2;
        }
        int var2Lifetime1 = 2;
        if (param1 < -65536) {
          var2Lifetime1 += 16;
          param1 = param1 >> 16;
        }
        if (param1 < -256) {
          var2Lifetime1 += 8;
          param1 = param1 >> 8;
        }
        if (param1 < -16) {
          param1 = param1 >> 4;
          var2Lifetime1 += 4;
        }
        if (-4 > param1) {
          var2Lifetime1 += 2;
          param1 = param1 >> 2;
        }
        if (param1 < -2) {
          var2Lifetime1++;
          param1 = param1 >> 1;
        }
        int var3 = -26 / ((param0 - 61) / 35);
        return var2Lifetime1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static MonochromeBitmapFont a(ResourceArchive param0, int param1, int param2, int param3, ResourceArchive param4) {
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        try {
          if (!tn.a(param0, (byte) -127, param1, param3)) {
            Object stackIn_2_0 = null;
            return (MonochromeBitmapFont) (stackIn_2_0);
          }
          int var5_int = 53 / ((param2 + 57) / 33);
          MonochromeBitmapFont stackIn_4_0 = HighscoreNameEntry.a(param4.a(param3, -10470, param1), 544);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var5;
          StringBuilder stackIn_7_1 = new StringBuilder().append("eo.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    eo(int param0) {
        this.field_c = param0;
    }

    static {
    }
}
