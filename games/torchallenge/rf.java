/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends dj implements uh {
    private wd field_fb;
    private int field_gb;
    static int field_ib;
    static sl field_db;
    static int[] field_hb;
    static int[][] field_eb;
    static int[] field_jb;

    public static void i(byte param0) {
        field_eb = null;
        field_jb = null;
        field_hb = null;
        field_db = null;
    }

    final void a(ee param0, int param1, byte param2, int param3) {
        try {
            super.a(param0, param1, (byte) -114, param3);
            if (param2 >= -97) {
                field_jb = null;
            }
            ((rf) this).field_gb = kc.field_u - ((rf) this).field_m - param1;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "rf.U(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void n(int param0) {
        ie.field_g = null;
        ul.field_n = -1;
        bk.field_p = 0;
        sj.field_R = false;
        bi.field_h = -1;
    }

    final static void a(lj param0, byte param1, boolean param2, lj param3, lj param4) {
        try {
            ji.field_k = og.a("", true);
            ji.field_k.a((byte) 56, false);
            vj.a(param4, param3, param1 + 23104, param0);
            ul.c(-1247);
            if (param1 != -23) {
                Object var6 = null;
                rf.a((lj) null, (byte) 35, false, (lj) null, (lj) null);
            }
            gj.field_a = mg.field_c;
            eh.field_p = mg.field_c;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "rf.FA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final String b(boolean param0) {
        if (((rf) this).field_w) {
          if (((rf) this).field_r != null) {
            if (param0) {
              field_jb = null;
              sl.a(((rf) this).field_p - (((rf) this).field_gb - kc.field_u), ph.field_d, -6665);
              return ((rf) this).field_r;
            } else {
              sl.a(((rf) this).field_p - (((rf) this).field_gb - kc.field_u), ph.field_d, -6665);
              return ((rf) this).field_r;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void k(int param0) {
        L0: {
          super.k(-95);
          if (((rf) this).field_fb != null) {
            ((rf) this).field_fb.a(true);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -79) {
          field_db = null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, wd param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((rf) this).field_fb = param1;
              if (param0 == -27997) {
                break L1;
              } else {
                ((rf) this).k(-38);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("rf.EA(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final wd a(int param0) {
        if (param0 > -101) {
            return null;
        }
        return ((rf) this).field_fb;
    }

    rf(String param0, gg param1, int param2) {
        super(param0, param1, param2);
    }

    final static void m(int param0) {
        int var1 = 0;
        int var2 = 0;
        if (param0 != 62) {
          return;
        } else {
          var1 = fl.f(param0 + -62);
          var2 = o.a(18);
          gb.field_f.a(var2 - -(mg.field_d << 1), jl.field_e + -mg.field_d, -1, -i.field_m + qe.field_R, var1 - -(i.field_m << 1));
          m.a((byte) 118);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ib = 0;
        field_db = new sl();
        field_hb = new int[]{0, 0, 1, 0, 0, 1, 2, 3, 4};
        field_eb = new int[][]{new int[4], new int[4], new int[4]};
        field_jb = new int[]{2048, 8388608, 8};
    }
}
