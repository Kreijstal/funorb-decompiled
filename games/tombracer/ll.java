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

    public static void a(byte param0) {
        int discarded$0 = 0;
        field_h = null;
        field_g = null;
        if (param0 <= 78) {
            discarded$0 = ll.a(-66, -115);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static int a(int param0, int param1) {
        g[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        g var4 = null;
        int var5 = 0;
        g[] var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var6 = qg.field_a;
            var2 = var6;
            var3 = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var6.length <= var3) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    stackOut_3_0 = var4.field_f ^ -1;
                    stackIn_10_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 == (param0 ^ -1)) {
                        stackOut_6_0 = var4.field_a;
                        stackIn_7_0 = stackOut_6_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "ll.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_7_0;
        }
    }

    ll(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, boolean param9, boolean param10, int param11) {
        this.field_a = (short)param5;
        this.field_k = param3;
        this.field_f = (byte)param8;
        this.field_i = param2;
        this.field_l = (short)param6;
        this.field_c = param1;
        this.field_j = (short)param4;
        this.field_m = param0;
        this.field_b = param11;
        this.field_e = param10 ? true : false;
    }

    static {
        field_g = new int[]{36, 37, 38, 39, 40, 7, 5, 6, 0};
        field_d = new su(4, 1, 1, 1);
        field_h = "More suggestions";
    }
}
