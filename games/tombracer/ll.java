/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    int field_b;
    short field_l;
    static su field_d;
    byte field_f;
    static int[] field_g;
    int field_m;
    short field_a;
    boolean field_e;
    int field_k;
    int field_c;
    short field_j;
    int field_i;
    static String field_h;

    public static void a() {
        field_h = null;
        field_g = null;
        field_d = null;
    }

    final static int a(int param0) {
        g[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        g var4 = null;
        int var5 = 0;
        g[] var6 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var6 = qg.field_a;
            var2 = var6;
            var3 = 0;
            L1: while (true) {
              if (var6.length <= var3) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                var4 = var6[var3];
                if (var4.field_f == param0) {
                  stackOut_5_0 = var4.field_a;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2_ref, "ll.B(" + param0 + 44 + 0 + 41);
        }
        return stackIn_9_0;
    }

    ll(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, boolean param9, boolean param10, int param11) {
        ((ll) this).field_a = (short)param5;
        ((ll) this).field_k = param3;
        ((ll) this).field_f = (byte)param8;
        ((ll) this).field_i = param2;
        ((ll) this).field_l = (short)param6;
        ((ll) this).field_c = param1;
        ((ll) this).field_j = (short)param4;
        ((ll) this).field_m = param0;
        ((ll) this).field_b = param11;
        ((ll) this).field_e = param10 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[]{36, 37, 38, 39, 40, 7, 5, 6, 0};
        field_d = new su(4, 1, 1, 1);
        field_h = "More suggestions";
    }
}
