/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class im {
    static String[] field_d;
    static int field_c;
    static String field_b;
    static String field_a;

    final static int a(int param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          L0: {
            if (param0 < 6144) {
              stackOut_7_0 = -va.field_d[-param0 + 6144];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = va.field_d[-6144 + param0];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param0 < 2048) {
              stackOut_3_0 = va.field_d[-param0 + 2048];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = -va.field_d[-2048 + param0];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        if (param0) {
            field_d = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static String a(CharSequence param0, byte param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            var3 = jl.a(param0, 121, false);
            if (var3 == null) {
              var4 = 0;
              L1: while (true) {
                if (param0.length() <= var4) {
                  if (param1 != -14) {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  if (qb.a(param0.charAt(var4), (byte) -76)) {
                    var4++;
                    continue L1;
                  } else {
                    stackOut_7_0 = gd.field_d;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
            } else {
              stackOut_2_0 = (String) var3;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("im.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + 0 + 41);
        }
        return (String) (Object) stackIn_13_0;
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        if (!(var2 != 0)) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128) {
            if (var2 < 160) {
                var3 = oj.field_s[var2 - 128];
                if (0 == var3) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "HE";
        field_b = "Player names can be up to 12 letters, numbers and underscores";
        field_d = new String[]{"By rating", "By win percentage"};
    }
}
