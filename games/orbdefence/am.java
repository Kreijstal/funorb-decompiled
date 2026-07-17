/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static sl field_h;
    static hj[] field_d;
    static int field_e;
    static String field_g;
    static String field_c;
    static ki field_b;
    static long field_a;
    static String field_f;

    public static void a() {
        field_g = null;
        field_b = null;
        field_h = null;
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final static void a(int param0) {
        if (param0 == -4062) {
          if (null == cd.field_w) {
            if (null != wf.field_b) {
              wf.field_b.c();
              return;
            } else {
              return;
            }
          } else {
            cd.field_w.c();
            if (null != wf.field_b) {
              wf.field_b.c();
              return;
            } else {
              return;
            }
          }
        } else {
          am.a(-120);
          if (null != cd.field_w) {
            cd.field_w.c();
            if (null == wf.field_b) {
              return;
            } else {
              wf.field_b.c();
              return;
            }
          } else {
            if (null != wf.field_b) {
              wf.field_b.c();
              return;
            } else {
              return;
            }
          }
        }
    }

    final static String b(int param0) {
        int var1 = 0;
        if (qc.field_g != mg.field_m) {
          if (tg.field_c == mg.field_m) {
            return pg.field_a;
          } else {
            if (!bd.field_u.a(false)) {
              return pg.field_a;
            } else {
              var1 = 8 % ((55 - param0) / 40);
              return vh.field_k;
            }
          }
        } else {
          return bh.field_e;
        }
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        ca var2 = null;
        RuntimeException var2_ref = null;
        ha var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = (ha) (Object) oa.field_d.b((byte) -111);
            L1: while (true) {
              if (var3 == null) {
                var2 = mj.field_m.b((byte) -123);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    tg.a(-126, 4);
                    var2 = mj.field_m.d(853);
                    continue L2;
                  }
                }
              } else {
                int discarded$2 = 4;
                tl.a(-128, var3);
                var3 = (ha) (Object) oa.field_d.d(853);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2_ref, "am.C(" + 4 + 44 + 113 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "CHAIN SHOT";
        field_c = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_f = "This password is part of your Player Name, and would be easy to guess";
    }
}
