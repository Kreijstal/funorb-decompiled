/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends d {
    static int[] field_M;
    static jp field_L;
    static jp field_K;
    static vl field_N;

    public static void a(int param0) {
        field_N = null;
        field_K = null;
        field_M = null;
        field_L = null;
    }

    final static void a(String param0, int param1, float param2, boolean param3) {
        try {
            if (param1 != 8192) {
                Object var5 = null;
                bf.a((String) null, 67, -0.11976710706949234f, true);
            }
            if (sj.field_b == null) {
                sj.field_b = new tb(mf.field_f, ke.field_b);
                mf.field_f.a(param1 + -8287, (oc) (Object) sj.field_b);
            }
            sj.field_b.a(param2, param0, param3, (byte) 86);
            lb.d();
            int discarded$0 = -1;
            wc.a(true);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "bf.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    bf(String param0, uh param1, boolean param2) {
        this(param0, param1);
        try {
            ((bf) this).field_F = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "bf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private bf(String param0, uh param1) {
        this(param0, bj.field_T.field_q, param1);
        try {
            ((bf) this).field_l = bj.field_T.field_o;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "bf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param2 > -8) {
          L0: {
            field_L = null;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (((bf) this).field_F) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((bf) this).field_F = stackIn_8_1 != 0;
          super.a(param0, param1, -69, param3);
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (((bf) this).field_F) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((bf) this).field_F = stackIn_4_1 != 0;
          super.a(param0, param1, -69, param3);
          return;
        }
    }

    private bf(String param0, ub param1, uh param2) {
        super(param0, param1, param2);
        try {
            ((bf) this).field_l = bj.field_T.field_o;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "bf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(boolean param0, boolean param1, int param2, String param3) {
        try {
            lm.a(-1);
            mf.field_f.a(-127);
            if (param2 != -15947) {
                field_K = null;
            }
            eo.field_k = new hk(gf.field_d, (String) null, cg.field_l, param0, param1);
            rj.field_c = new bh(mf.field_f, (oc) (Object) eo.field_k);
            mf.field_f.a(-117, (oc) (Object) rj.field_c);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "bf.C(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              o.field_e = null;
              fh.field_d = false;
              nl.field_f = null;
              if (ua.field_c == null) {
                break L1;
              } else {
                ua.field_c.c((byte) -57);
                ua.field_c = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "bf.A(" + 119 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[8192];
    }
}
