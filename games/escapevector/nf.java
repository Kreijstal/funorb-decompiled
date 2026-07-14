/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nf extends fl {
    int field_v;
    int field_A;
    int field_s;
    static cn field_w;
    int field_x;
    int field_q;
    static lm field_y;
    int field_z;
    static boolean field_u;
    static boolean field_r;
    static int[] field_t;

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void b(int param0, int param1) {
        ee.field_a = cb.field_b[param0];
        if (param1 != 15) {
          field_y = null;
          md.field_H = tc.field_i[param0];
          gj.field_g = jj.field_c[param0];
          return;
        } else {
          md.field_H = tc.field_i[param0];
          gj.field_g = jj.field_c[param0];
          return;
        }
    }

    final static void g(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) om.field_b;
                    // monitorenter om.field_b
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        md.field_G = md.field_G + 1;
                        eb.field_K = vj.field_b;
                        dh.field_d = vb.field_b;
                        bj.field_y = jk.field_b;
                        ah.field_h = ke.field_a;
                        ke.field_a = false;
                        qi.field_N = kb.field_f;
                        sf.field_c = fk.field_b;
                        ng.field_ob = dd.field_c;
                        if (param0 == -3657) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        nf.b(30, 39);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        kb.field_f = 0;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var2;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void f(int param0) {
        field_t = null;
        if (param0 != -363232252) {
            field_y = null;
            field_y = null;
            field_w = null;
            return;
        }
        field_y = null;
        field_w = null;
    }

    final static void a(int param0, boolean param1) {
        e.field_a = true;
        da.field_b = new ta();
        int var2 = -121 / ((param0 - -63) / 34);
        int var3 = da.field_b.d((byte) -73);
        di.field_d = new wc(var3);
        int var4 = da.field_b.c(5201);
        int var5 = da.field_b.a(-3, dh.field_d, bj.field_y);
        di.field_d.a(95, param1, var5, var4);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param1 != 34) {
          ((nf) this).field_v = 118;
          var6 = ((nf) this).field_A << 1008705795;
          var7 = ((nf) this).field_z << -1100444797;
          param0 = (param0 << -363232252) + (15 & var6);
          param4 = (param4 << 194412836) - -(15 & var7);
          ((nf) this).a(var6, var7, param0, param4, param3, param2);
          return;
        } else {
          var6 = ((nf) this).field_A << 1008705795;
          var7 = ((nf) this).field_z << -1100444797;
          param0 = (param0 << -363232252) + (15 & var6);
          param4 = (param4 << 194412836) - -(15 & var7);
          ((nf) this).a(var6, var7, param0, param4, param3, param2);
          return;
        }
    }

    nf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new cn();
        field_t = new int[8192];
        field_u = true;
    }
}
