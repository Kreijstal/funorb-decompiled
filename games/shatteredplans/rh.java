/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh implements jk {
    static String field_a;
    qk[] field_b;
    lp[] field_c;
    static mp field_g;
    static int[] field_f;
    static double field_e;
    static double field_d;

    final static void b(byte param0) {
        nf var1 = null;
        RuntimeException var1_ref = null;
        tm var2_ref_tm = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = rp.i(0);
              if (var1 == null) {
                break L1;
              } else {
                if (var1 == hs.field_j) {
                  break L1;
                } else {
                  no.a(hs.field_j, 1);
                  hs.field_j = var1;
                  break L1;
                }
              }
            }
            L2: {
              if (qd.field_a >= 18) {
                break L2;
              } else {
                qd.field_a = qd.field_a + 1;
                break L2;
              }
            }
            L3: {
              if (qd.field_a >= 18) {
                qd.field_a = 18;
                var2_ref_tm = (tm) (Object) ld.field_p.h(35);
                if (var2_ref_tm == null) {
                  break L3;
                } else {
                  gs.a(var2_ref_tm, true);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            var2 = 0;
            L4: while (true) {
              if (var2 >= hj.field_l.length) {
                break L0;
              } else {
                L5: {
                  if (hj.field_l[var2] == null) {
                    break L5;
                  } else {
                    hj.field_l[var2].a(256);
                    break L5;
                  }
                }
                var2++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1_ref, "rh.B(" + -127 + 41);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_g = null;
    }

    final static void a(byte param0) {
        ai.a(3);
        if (param0 > -119) {
            return;
        }
        pc.c(-113);
        tc.field_G = null;
        jp.g((byte) 122);
    }

    public rh() {
        ((rh) this).field_b = new qk[4];
        ((rh) this).field_c = new lp[4];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "New Game";
        field_f = new int[]{0, 5, 39, 72, 67, 33};
        field_g = new mp();
        field_e = Math.cos(0.5235987755982988);
        field_d = 1.0 / field_e;
    }
}
