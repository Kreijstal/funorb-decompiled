/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb implements el {
    static h field_f;
    static boolean field_h;
    static int field_b;
    static db field_g;
    static la field_a;
    static String field_c;
    static uh field_d;
    static int[][] field_e;

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_e = null;
        field_a = null;
        if (param0 != 2) {
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_f = null;
          return;
        }
    }

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        t var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var6_int = param4.field_w + param2;
              var7 = param4.field_k + param1;
              if (param0 >= 89) {
                break L1;
              } else {
                int[] discarded$1 = kb.a((byte) -45);
                break L1;
              }
            }
            L2: {
              tk.a(var7, var6_int, param4.field_o, param4.field_p, false);
              var8 = wj.field_h[1];
              if (!(param4 instanceof lg)) {
                break L2;
              } else {
                if (!((lg) (Object) param4).field_A) {
                  break L2;
                } else {
                  var8.a((-var8.field_w + param4.field_p >> 1) + 1 + var6_int, (-var8.field_u + param4.field_o >> 1) + var7 - -1, 256);
                  break L2;
                }
              }
            }
            if (param4.g(2)) {
              he.a(2 + var6_int, param4.field_o + -4, 2 + var7, 2, param4.field_p - 4);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("kb.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final static int[] a(byte param0) {
        if (param0 > -65) {
            field_a = null;
            return new int[8];
        }
        return new int[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = true;
        field_f = null;
        field_c = "Loading models";
        field_g = new db(1);
    }
}
