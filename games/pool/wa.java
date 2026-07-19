/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends tj {
    static String field_ob;
    static dd field_gb;
    static vh field_hb;
    static int[] field_ib;
    private String field_pb;
    private String field_nb;
    private gj field_kb;
    static vh field_qb;
    private boolean field_jb;
    static int[] field_mb;
    private boolean field_lb;

    final static void l(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var1 = ir.field_h * ir.field_h;
        var2 = -(em.field_P * em.field_P) + var1;
        if (param0 != 23323) {
          field_ib = (int[]) null;
          var3 = fd.field_J - -((-fd.field_J + cb.field_g) * var2 / var1);
          fl.field_q.b(var3, 2147483647, tn.field_u, 640, 120);
          mm.a(ja.field_b, cb.field_g + -24, 0, 640, 5, 118, kj.field_j);
          return;
        } else {
          var3 = fd.field_J - -((-fd.field_J + cb.field_g) * var2 / var1);
          fl.field_q.b(var3, 2147483647, tn.field_u, 640, 120);
          mm.a(ja.field_b, cb.field_g + -24, 0, 640, 5, 118, kj.field_j);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int discarded$0 = 0;
        super.a(param0, param1, param2);
        bi.field_e.b(this.field_nb, param0 + (this.field_l >> -1287640991), param1 - -103, 16777215, -1);
        if (!(null == this.field_pb)) {
            qh.f(param0 - -20, -7 + (param1 + 120), 260, 8421504);
            discarded$0 = bi.field_e.a(this.field_pb, param0 - -20, 8 + (param1 - -120), 260, 100, 16777215, -1, 1, 0, bi.field_e.field_C);
        }
    }

    wa(lq param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_pb = param1;
            if (null != this.field_pb) {
                var3_int = bi.field_e.b(this.field_pb, 260, bi.field_e.field_C);
                this.b(150 + var3_int, 31936, 300);
            }
            this.field_kb = new gj(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_kb.field_N = true;
            this.field_jb = false;
            this.field_lb = false;
            this.a(true, this.field_kb);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "wa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void n(int param0) {
        field_ob = null;
        field_qb = null;
        field_ib = null;
        if (param0 != 7585) {
          wa.l(-78);
          field_gb = null;
          field_mb = null;
          field_hb = null;
          return;
        } else {
          field_gb = null;
          field_mb = null;
          field_hb = null;
          return;
        }
    }

    final void a(String param0, int param1, float param2, boolean param3) {
        RuntimeException var5 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 2113632) {
                break L1;
              } else {
                this.field_lb = false;
                break L1;
              }
            }
            if (param3 != this.field_lb) {
              L2: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (!param3) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L2;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L2;
                }
              }
              L3: {
                ((wa) (this)).field_lb = stackIn_7_1 != 0;
                if (!this.field_lb) {
                  this.field_kb.a(4210752, param1 + -2094267, 2113632);
                  if (this.field_jb) {
                    this.field_kb.field_N = false;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  this.field_kb.a(4210752, 19365, 8405024);
                  this.field_kb.field_N = true;
                  break L3;
                }
              }
              this.field_nb = param0;
              this.field_kb.field_P = (int)(65536.0f * (param2 / 100.0f));
              break L0;
            } else {
              this.field_nb = param0;
              this.field_kb.field_P = (int)(65536.0f * (param2 / 100.0f));
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("wa.O(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void i(byte param0) {
        if (param0 != 72) {
          field_ib = (int[]) null;
          sq.field_c.field_e = 0;
          sq.field_c.field_a = 0;
          return;
        } else {
          sq.field_c.field_e = 0;
          sq.field_c.field_a = 0;
          return;
        }
    }

    final static void m(int param0) {
        if (param0 == 8421504) {
          if (null != vl.field_m) {
            if (vl.field_m.field_i == null) {
              vl.field_m = null;
              pf.field_c = null;
              return;
            } else {
              vl.field_m.field_i.field_Ib = false;
              vl.field_m = null;
              pf.field_c = null;
              return;
            }
          } else {
            vl.field_m = null;
            pf.field_c = null;
            return;
          }
        } else {
          field_gb = (dd) null;
          if (null == vl.field_m) {
            vl.field_m = null;
            pf.field_c = null;
            return;
          } else {
            L0: {
              if (vl.field_m.field_i != null) {
                vl.field_m.field_i.field_Ib = false;
                break L0;
              } else {
                break L0;
              }
            }
            vl.field_m = null;
            pf.field_c = null;
            return;
          }
        }
    }

    final void k(int param0) {
        this.field_kb.field_N = false;
        if (param0 != 0) {
            this.field_lb = true;
            this.field_jb = true;
            return;
        }
        this.field_jb = true;
    }

    static {
        field_ob = "Extra visit";
        field_ib = new int[128];
        field_mb = new int[8192];
    }
}
