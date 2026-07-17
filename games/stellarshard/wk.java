/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String field_g;
    static boolean field_c;
    static pf field_a;
    private pf field_d;
    static vl[] field_b;
    private pf field_f;
    private wa field_e;

    final static boolean a(int param0) {
        return id.b(-4);
    }

    public static void a() {
        field_a = null;
        field_g = null;
        field_b = null;
    }

    final static boolean b() {
        lb var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        lb var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        var3 = stellarshard.field_B;
        try {
          L0: {
            var4 = (lb) (Object) oc.field_c.b(-124);
            var1 = var4;
            if (var1 != null) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= var1.field_s) {
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L2: {
                    if (null == var4.field_r[var2]) {
                      break L2;
                    } else {
                      if (0 == var4.field_r[var2].field_f) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (null == var4.field_q[var2]) {
                      break L3;
                    } else {
                      if (var4.field_q[var2].field_f == 0) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1_ref, "wk.D(" + 1816 + 41);
        }
        return stackIn_19_0 != 0;
    }

    final od a(int param0, int param1) {
        byte[] var4 = null;
        od var3 = (od) ((wk) this).field_e.b((long)param1, (byte) 58);
        if (var3 != null) {
            return var3;
        }
        if (param1 < 32768) {
            var4 = ((wk) this).field_f.a(param1, 16, 1);
        } else {
            var4 = ((wk) this).field_d.a(32767 & param1, 16, 1);
        }
        var3 = new od();
        if (var4 != null) {
            var3.a(new ka(var4), 745);
        }
        if (!(param1 < 32768)) {
            var3.f(20865);
        }
        ((wk) this).field_e.a((Object) (Object) var3, (long)param1, -22424);
        if (param0 != 32767) {
            field_a = null;
        }
        return var3;
    }

    private wk() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_b = new vl[3000];
        field_g = "Please wait for high scores";
    }
}
