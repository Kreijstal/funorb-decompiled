/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    boolean field_g;
    int field_e;
    String field_d;
    static ic field_b;
    boolean field_c;
    String[] field_f;
    static String field_i;
    static ut field_j;
    static String field_h;
    static ut[] field_a;

    final static boolean a(byte param0) {
        int var1;
        var1 = -55 / ((-40 - param0) / 36);
        if (be.e((byte) 127)) {
          if (!f.field_c) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_h = null;
        field_a = null;
        field_b = null;
        field_i = null;
        field_j = null;
    }

    final static int a(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            var3_int = 0;
            var4 = param2.length();
            var5 = param1;
            L1: while (true) {
              if (var4 <= var5) {
                stackIn_8_0 = var3_int;
                break L0;
              } else {
                L2: {
                  if (param0 == param2.charAt(var5)) {
                    var3_int++;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("wn.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    wn(boolean param0) {
        this.field_g = param0 ? true : false;
    }

    static {
        field_b = new ic();
        field_h = "Tournament Game";
    }
}
