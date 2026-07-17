/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends rf {
    int[] field_g;
    boolean field_n;
    static id[] field_i;
    static String field_m;
    static String[] field_l;
    static String field_f;
    static int field_h;
    static int field_j;
    int field_k;

    final static int a(int param0, int param1, byte param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 > 79) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            var4_int = -1;
            var5 = param0;
            L2: while (true) {
              if (var5 >= param1) {
                var4_int = ~var4_int;
                stackOut_5_0 = var4_int;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var4_int = var4_int >>> 8 ^ fb.field_n[(param3[var5] ^ var4_int) & 255];
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("rj.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != -1) {
            rj.a(118);
        }
        field_l = null;
        field_m = null;
        field_i = null;
    }

    rj() {
        ((rj) this).field_n = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Achieved";
        field_j = 5;
        field_m = "Cancel";
        field_l = new String[]{"New superweapon!", "Serious challenges!", "Mega boss fights!"};
    }
}
