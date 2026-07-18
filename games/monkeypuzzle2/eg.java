/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static String field_f;
    int field_b;
    int field_g;
    int field_a;
    static te field_i;
    int field_e;
    static boolean field_j;
    static boolean[] field_k;
    static int field_c;
    static String field_h;
    static ai[] field_d;

    final static eg[] a(md param0, boolean param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        eg[] var4 = null;
        int var5 = 0;
        eg var6 = null;
        int var7 = 0;
        ic var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        eg[] stackIn_4_0 = null;
        eg[] stackIn_11_0 = null;
        eg[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg[] stackOut_3_0 = null;
        eg[] stackOut_10_0 = null;
        eg[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!param0.a(2)) {
              stackOut_3_0 = new eg[]{};
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var8 = param0.b((byte) -66);
              L1: while (true) {
                if (var8.field_g != 0) {
                  if (var8.field_g == 2) {
                    stackOut_10_0 = new eg[]{};
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    var12 = (int[]) var8.field_b;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new eg[var12.length >> 2];
                    var5 = 0;
                    L2: while (true) {
                      if (var4.length <= var5) {
                        stackOut_15_0 = (eg[]) var4;
                        stackIn_16_0 = stackOut_15_0;
                        break L0;
                      } else {
                        var6 = new eg();
                        var4[var5] = var6;
                        var6.field_a = var3[var5 << 2];
                        var6.field_b = var3[(var5 << 2) - -1];
                        var6.field_e = var3[(var5 << 2) - -2];
                        var6.field_g = var3[3 + (var5 << 2)];
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  em.a(10L, false);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("eg.C(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + true + ')');
        }
        return stackIn_16_0;
    }

    final static void a(int param0, int param1) {
    }

    final static String a(String param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = param3.indexOf(param2);
        L0: while (true) {
          if (var4 == -1) {
            return param3;
          } else {
            param3 = param3.substring(0, var4) + param0 + param3.substring(param2.length() + var4);
            var4 = param3.indexOf(param2, var4 + param0.length());
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_h = null;
        field_d = null;
        field_i = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Connection lost - attempting to reconnect";
        field_i = new te(2, 4, 4, 0);
        field_h = "Please wait...";
        field_k = new boolean[64];
    }
}
