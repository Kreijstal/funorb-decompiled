/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq {
    static jp field_d;
    static String field_c;
    static int[] field_b;
    private tk field_g;
    private tk field_f;
    static String field_e;
    static String field_a;

    final static void d(int param0) {
        tn.field_m = null;
        int var1 = -1 / ((42 - param0) / 59);
    }

    final void a(tk param0, boolean param1) {
        try {
            if (!(param0.field_n == null)) {
                param0.d(3);
            }
            if (param1) {
                mf var4 = (mf) null;
                lq.a(-17, 78, 86, (mf) null);
            }
            param0.field_s = this.field_g;
            param0.field_n = this.field_g.field_n;
            param0.field_n.field_s = param0;
            param0.field_s.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "lq.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final tk a(int param0) {
        tk var2;
        if (param0 == 25609) {
          var2 = this.field_g.field_s;
          if (this.field_g == var2) {
            return null;
          } else {
            var2.d(param0 ^ 25610);
            return var2;
          }
        } else {
          this.field_g = (tk) null;
          var2 = this.field_g.field_s;
          if (this.field_g == var2) {
            return null;
          } else {
            var2.d(param0 ^ 25610);
            return var2;
          }
        }
    }

    final tk e(int param0) {
        tk var2;
        tk var3;
        var2 = this.field_f;
        if (var2 != this.field_g) {
          this.field_f = var2.field_s;
          if (param0 != -8394) {
            var3 = (tk) null;
            this.a((tk) null, true);
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_f = null;
          return null;
        }
    }

    final tk a(boolean param0) {
        if (!param0) {
            return (tk) null;
        }
        tk var2 = this.field_g.field_s;
        if (!(this.field_g != var2)) {
            this.field_f = null;
            return null;
        }
        this.field_f = var2.field_s;
        return var2;
    }

    final int c(int param0) {
        int var2;
        tk var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var3 = this.field_g.field_s;
        if (param0 == -25906) {
          L0: while (true) {
            if (this.field_g == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_s;
              continue L0;
            }
          }
        } else {
          return 88;
        }
    }

    final static th[] b(int param0) {
        if (param0 != 0) {
          field_e = (String) null;
          return new th[]{un.field_b, nm.field_c, ro.field_r, an.field_i, o.field_h, c.field_m, wi.field_i, ba.field_B, pa.field_k, hj.field_Sb, sl.field_B, si.field_o, kq.field_i, lk.field_o};
        } else {
          return new th[]{un.field_b, nm.field_c, ro.field_r, an.field_i, o.field_h, c.field_m, wi.field_i, ba.field_B, pa.field_k, hj.field_Sb, sl.field_B, si.field_o, kq.field_i, lk.field_o};
        }
    }

    public static void b(boolean param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (!param0) {
          lq.b(false);
          field_e = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_c = null;
          return;
        }
    }

    final static void a(mf param0, mf param1, byte param2, mf param3, mf param4) {
        try {
            kc.field_j = param1;
            ta.field_g = param3;
            ic.field_a = param0;
            ag.field_G = param4;
            gf.field_e = new wp(ag.field_G, ta.field_g);
            if (param2 != -38) {
                field_a = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "lq.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static tp a(int param0, int param1, int param2, mf param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        tp stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ln.a(-105, param2, param3, param1)) {
              L1: {
                if (param0 == 0) {
                  break L1;
                } else {
                  lq.d(-20);
                  break L1;
                }
              }
              stackIn_6_0 = ud.c(false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("lq.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (tp) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    public lq() {
        this.field_g = new tk();
        this.field_g.field_s = this.field_g;
        this.field_g.field_n = this.field_g;
    }

    static {
        field_c = "Go!";
        field_a = "Invite players";
    }
}
