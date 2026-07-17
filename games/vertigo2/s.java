/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends li {
    boolean field_s;
    int field_q;
    long[][] field_w;
    static int field_y;
    String[][] field_x;
    static int field_u;
    static String field_r;
    int field_p;
    int[][] field_n;
    int field_o;
    static nj field_t;
    static String field_v;

    public static void a() {
        field_v = null;
        field_t = null;
        field_r = null;
    }

    final static void a(byte param0, er[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param3 > 0) {
                  var6_int = param1[0].field_x;
                  var7 = param1[2].field_x;
                  var8 = param1[1].field_x;
                  param1[0].a(param4, param2, param5);
                  param1[2].a(param4 + (param3 + -var7), param2, param5);
                  bi.a(ak.field_d);
                  bi.c(var6_int + param4, param2, param3 + (param4 - var7), param1[1].field_B + param2);
                  var9 = var6_int + param4;
                  var10 = param4 + (param3 + -var7);
                  param4 = var9;
                  L2: while (true) {
                    if (param4 >= var10) {
                      bi.b(ak.field_d);
                      break L0;
                    } else {
                      param1[1].a(param4, param2, param5);
                      param4 = param4 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("s.A(").append(49).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    s() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = 48;
        field_r = "Passwords can only contain letters and numbers";
        field_v = "Change display name";
    }
}
