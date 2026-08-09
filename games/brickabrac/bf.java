/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends d {
    static int[] field_M;
    static jp field_L;
    static jp field_K;
    static vl field_N;

    public static void a(int param0) {
        if (param0 != 8192) {
            return;
        }
        field_N = null;
        field_K = null;
        field_M = null;
        field_L = null;
    }

    final static void a(String param0, int param1, float param2, boolean param3) {
        try {
            if (param1 != 8192) {
                String var5 = (String) null;
                bf.a((String) null, 67, -0.11976710706949234f, true);
            }
            if (sj.field_b == null) {
                sj.field_b = new tb(mf.field_f, ke.field_b);
                mf.field_f.a(param1 + -8287, sj.field_b);
            }
            sj.field_b.a(param2, param0, param3, (byte) 86);
            lb.d();
            wc.a(true, -1);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "bf.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    bf(String param0, uh param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_F = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "bf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private bf(String param0, uh param1) {
        this(param0, bj.field_T.field_q, param1);
        try {
            this.field_l = bj.field_T.field_o;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "bf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param2 > -8) {
          L0: {
            field_L = (jp) null;
            stackIn_7_0 = this;

            if (this.field_F) {
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((bf) (this)).field_F = stackIn_8_1 != 0;
          super.a(param0, param1, -69, param3);
          return;
        } else {
          L1: {
            stackIn_3_0 = this;

            if (this.field_F) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          ((bf) (this)).field_F = stackIn_4_1 != 0;
          super.a(param0, param1, -69, param3);
          return;
        }
    }

    private bf(String param0, ub param1, uh param2) {
        super(param0, param1, param2);
        try {
            this.field_l = bj.field_T.field_o;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "bf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2, String param3) {
        try {
            lm.a(-1);
            mf.field_f.a(-127);
            if (param2 != -15947) {
                field_K = (jp) null;
            }
            eo.field_k = new hk(gf.field_d, (String) null, cg.field_l, param0, param1);
            rj.field_c = new bh(mf.field_f, eo.field_k);
            mf.field_f.a(-117, rj.field_c);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "bf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        id var3 = null;
        int var2 = BrickABrac.field_J ? 1 : 0;
        o.field_e = null;
        fh.field_d = false;
        nl.field_f = null;
        if (ua.field_c != null) {
            ua.field_c.c((byte) -57);
            ua.field_c = null;
        }
        if (param0 < 29) {
            return;
        }
        try {
            eq.field_m = null;
            if (!(rq.field_a == null)) {
                rq.field_a.c((byte) -91);
                rq.field_a = null;
            }
            pn.field_i = null;
            if (null != mp.field_Tb) {
                mp.field_Tb.c((byte) -84);
                mp.field_Tb = null;
            }
            BrickABrac.field_F = null;
            if (eq.field_m != null) {
                var3 = (id) ((Object) eq.field_m.b((byte) 120));
                while (var3 != null) {
                    var3.d(3);
                    var3 = (id) ((Object) eq.field_m.a(false));
                }
                eq.field_m = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "bf.A(" + param0 + ')');
        }
    }

    static {
        field_M = new int[8192];
    }
}
