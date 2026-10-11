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
        int var3 = 0;
        int var1 = ir.field_h * ir.field_h;
        int var2 = -(em.field_P * em.field_P) + var1;
        int var3Lifetime1;
        if (param0 == 23323) {
          var3 = fd.field_J + (-fd.field_J + cb.field_g) * var2 / var1;
          fl.field_q.b(var3, 2147483647, tn.field_u, 640, 120);
          mm.a(ja.field_b, cb.field_g - 24, 0, 640, 5, 118, kj.field_j);
          return;
        }
        field_ib = (int[]) null;
        var3Lifetime1 = fd.field_J + (-fd.field_J + cb.field_g) * var2 / var1;
        fl.field_q.b(var3Lifetime1, 2147483647, tn.field_u, 640, 120);
        mm.a(ja.field_b, cb.field_g - 24, 0, 640, 5, 118, kj.field_j);
    }

    final void a(int param0, int param1, int param2) {
        super.a(param0, param1, param2);
        bi.field_e.b(this.field_nb, param0 + (this.field_l >> 1), param1 + 103, 16777215, -1);
        if (null != this.field_pb) {
          qh.f(param0 + 20, -7 + (param1 + 120), 260, 8421504);
          bi.field_e.a(this.field_pb, param0 + 20, 8 + (param1 + 120), 260, 100, 16777215, -1, 1, 0, bi.field_e.field_C);
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
        if (param0 == 7585) {
          field_gb = null;
          field_mb = null;
          field_hb = null;
          return;
        }
        wa.l(-78);
        field_gb = null;
        field_mb = null;
        field_hb = null;
    }

    final void a(String param0, int param1, float param2, boolean param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2113632) {
            this.field_lb = false;
          }
          if (param3 == this.field_lb) {
            this.field_nb = param0;
            this.field_kb.field_P = (int)(65536.0f * (param2 / 100.0f));
            return;
          }
          stackIn_7_1 = (param3);
          this.field_lb = stackIn_7_1;
          if (!this.field_lb) {
            this.field_kb.a(4210752, param1 - 2094267, 2113632);
            if (this.field_jb) {
              this.field_kb.field_N = false;
            }
          } else {
            this.field_kb.a(4210752, 19365, 8405024);
            this.field_kb.field_N = true;
          }
          this.field_nb = param0;
          this.field_kb.field_P = (int)(65536.0f * (param2 / 100.0f));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("wa.O(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void i(byte param0) {
        if (param0 == 72) {
          sq.field_c.field_e = 0;
          sq.field_c.field_a = 0;
          return;
        }
        field_ib = (int[]) null;
        sq.field_c.field_e = 0;
        sq.field_c.field_a = 0;
    }

    final static void m(int param0) {
        if (param0 != 8421504) {
          field_gb = (dd) null;
          if (null != vl.field_m) {
            if (vl.field_m.field_i != null) {
              vl.field_m.field_i.field_Ib = false;
            }
            vl.field_m = null;
            pf.field_c = null;
            return;
          }
          vl.field_m = null;
          pf.field_c = null;
          return;
        }
        if (null == vl.field_m) {
          vl.field_m = null;
          pf.field_c = null;
          return;
        }
        if (vl.field_m.field_i != null) {
          vl.field_m.field_i.field_Ib = false;
          vl.field_m = null;
          pf.field_c = null;
          return;
        }
        vl.field_m = null;
        pf.field_c = null;
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
