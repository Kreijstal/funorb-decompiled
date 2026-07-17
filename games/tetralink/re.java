/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends ae {
    static String field_S;
    static String field_Q;
    static java.security.SecureRandom field_R;
    static String field_P;
    static String field_T;

    final void b(int param0, int param1, int param2, int param3) {
        ((re) this).field_N = !((re) this).field_N ? true : false;
        super.b(param0, param1, param2, param3);
    }

    re(String param0, dn param1, boolean param2) {
        this(param0, param1);
        try {
            ((re) this).field_N = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "re.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void d(boolean param0) {
        qa.b((byte) 53);
        if (!(uh.field_b == null)) {
            oa.a((byte) -128, uh.field_b);
        }
        int discarded$12 = -9648;
        rl.b();
        jl.a(109);
        int discarded$33 = -25676;
        bm.a();
        int discarded$40 = -14688;
        if (!(!wm.c())) {
            nd.field_Lb.f(1, (byte) -92);
            ak.a((byte) -86, 0);
        }
        int discarded$41 = 0;
        mk.a();
    }

    final static boolean a(byte param0, int param1) {
        return ~(-param1 & param1) == ~param1;
    }

    public static void a(int param0) {
        field_R = null;
        field_S = null;
        field_Q = null;
        field_T = null;
        if (param0 != 0) {
            return;
        }
        field_P = null;
    }

    private re(String param0, dn param1) {
        this(param0, dh.field_q.field_n, param1);
        try {
            ((re) this).field_H = dh.field_q.field_x;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "re.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void e() {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        gd var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              kl.field_a = false;
              qe.field_a = null;
              qb.field_N = null;
              if (gl.field_p != null) {
                gl.field_p.b(1);
                gl.field_p = null;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              db.field_a = null;
              if (null == jl.field_a) {
                break L2;
              } else {
                jl.field_a.b(1);
                jl.field_a = null;
                break L2;
              }
            }
            L3: {
              db.field_e = null;
              var1_int = -39;
              if (ui.field_d != null) {
                ui.field_d.b(1);
                ui.field_d = null;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              dg.field_g = null;
              if (null == db.field_a) {
                break L4;
              } else {
                var2 = (gd) (Object) db.field_a.b(-104);
                L5: while (true) {
                  if (var2 == null) {
                    db.field_a = null;
                    break L4;
                  } else {
                    var2.e(0);
                    var2 = (gd) (Object) db.field_a.d(-1);
                    continue L5;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oi.a((Throwable) (Object) runtimeException, "re.C(" + -33 + 41);
        }
    }

    private re(String param0, kg param1, dn param2) {
        super(param0, param1, param2);
        try {
            ((re) this).field_H = dh.field_q.field_x;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "re.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = "Remove friend";
        field_Q = "Add name";
        field_T = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
