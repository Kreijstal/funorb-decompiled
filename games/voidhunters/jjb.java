/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jjb {
    ob field_a;
    ob field_g;
    boolean field_d;
    static String field_f;
    aia[] field_e;
    aia[] field_c;
    ob field_b;

    public static void a() {
        field_f = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (li.field_i) {
          if (ne.field_v) {
            og.field_r.aa(0, 0, param5, param1, 0, 0);
            return;
          } else {
            return;
          }
        } else {
          dma.d(0, 0, param5, param1, 0);
          return;
        }
    }

    jjb(qfa param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ob var4 = null;
        nk var10 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        ((jjb) this).field_a = null;
        ((jjb) this).field_g = null;
        ((jjb) this).field_e = null;
        ((jjb) this).field_c = null;
        ((jjb) this).field_b = null;
        try {
          L0: {
            L1: {
              ((jjb) this).field_d = param0.field_tc;
              lna.a(param0, 16);
              if (!((jjb) this).field_d) {
                ((jjb) this).field_e = new aia[16];
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= 16) {
                    ((jjb) this).field_c = new aia[16];
                    var2_int = 0;
                    L3: while (true) {
                      if (16 <= var2_int) {
                        break L1;
                      } else {
                        int discarded$8 = 32768;
                        int discarded$9 = 1;
                        var24 = ppb.a(pjb.field_vb, var2_int * 32768);
                        ((jjb) this).field_c[var2_int] = new aia(param0, 3553, 6410, 128, 128, true, var24, 6410, false);
                        var2_int++;
                        continue L3;
                      }
                    }
                  } else {
                    int discarded$10 = 32768;
                    int discarded$11 = 1;
                    var23 = ppb.a(pra.field_p, 32768 * var2_int);
                    ((jjb) this).field_e[var2_int] = new aia(param0, 3553, 6410, 128, 128, true, var23, 6410, false);
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                int discarded$12 = 1;
                var20 = ffb.a(false, pra.field_p);
                ((jjb) this).field_b = new ob(param0, 6410, 128, 128, 16, var20, 6410);
                int discarded$13 = 1;
                var21 = ffb.a(false, pjb.field_vb);
                ((jjb) this).field_g = new ob(param0, 6410, 128, 128, 16, var21, 6410);
                var10 = param0.field_yb;
                if (!var10.a(92)) {
                  break L1;
                } else {
                  int discarded$14 = 1;
                  var22 = ffb.a(false, lda.field_o);
                  ((jjb) this).field_a = new ob(param0, 6408, 128, 128, 16);
                  var4 = new ob(param0, 6409, 128, 128, 16, var22, 6409);
                  if (!var10.a(2.0f, -28279, var4, ((jjb) this).field_a)) {
                    ((jjb) this).field_a.e(0);
                    ((jjb) this).field_a = null;
                    var4.e(0);
                    return;
                  } else {
                    boolean discarded$15 = ((jjb) this).field_a.c(9729);
                    var4.e(0);
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("jjb.<init>(");
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
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Provides a burst of acceleration";
    }
}
