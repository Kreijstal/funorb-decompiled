/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends ig {
    static String field_w;
    private boolean field_m;
    static String field_v;
    private String field_t;
    static di field_r;
    static int field_o;
    static int field_s;
    static dd field_p;
    static so field_y;
    static String field_u;
    static int field_x;
    private ne field_q;
    static int field_n;

    final static qb[] h(int param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        qb[] var1 = new qb[wf.field_d];
        for (var2 = param0; wf.field_d > var2; var2++) {
          var1[var2] = new qb(vd.field_c, tq.field_r, el.field_I[var2], ih.field_d[var2], pd.field_a[var2], rc.field_f[var2], v.field_b[var2], ma.field_h);
        }
        sh.h(-1);
        return var1;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -1) {
            stackIn_2_0 = -80;
            return stackIn_2_0;
          }
          var3_int = 1;
          while (param0 > 1) {
            if ((param0 & 1) != 0) {
              var3_int = var3_int * param1;
            }
            param1 = param1 * param1;
            param0 = param0 >> 1;
          }
          if (param0 != 1) {
            stackIn_13_0 = var3_int;
            return stackIn_13_0;
          }
          stackIn_11_0 = var3_int * param1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "me.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static ij a(int param0, int param1) {
        aa var2;
        ij var3;
        int var4;
        var4 = Pool.field_O;
        if (param0 != -2) {
          return (ij) null;
        }
        var2 = new aa(nd.field_i);
        var3 = (ij) (var2.b((byte) -92));
        while (var3 != null) {
          if (param1 == var3.field_m) {
            return var3;
          }
          var3 = (ij) (var2.b(-86));
        }
        return null;
    }

    final static void b(int param0, int param1) {
        oq var2 = ej.field_j;
        var2.b(false, param1);
        var2.a(1, false);
        var2.a(3, false);
        int var3 = 22 / ((-52 - param0) / 62);
    }

    public static void b(boolean param0) {
        field_r = null;
        field_p = null;
        field_y = null;
        field_w = null;
        field_v = null;
        if (param0) {
          field_u = null;
          return;
        }
        field_r = (di) null;
        field_u = null;
    }

    me(sl param0, sl param1) {
        super(param0);
        this.field_t = "";
        this.field_m = false;
        try {
          this.field_q = new ne(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final na a(String param0, boolean param1) {
        qr var3 = null;
        RuntimeException var3_ref = null;
        na stackIn_3_0 = null;
        na stackIn_8_0 = null;
        na stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_q.a(param0, param1) == gp.field_d) {
            stackIn_3_0 = gp.field_d;
            return stackIn_3_0;
          }
          if (!param0.equals(this.field_t)) {
            var3 = nf.b((byte) -25, param0);
            if (!var3.a(80)) {
              stackIn_8_0 = no.field_k;
              return stackIn_8_0;
            }
            this.field_t = param0;
            this.field_m = var3.b((byte) -74);
          }
          if (!this.field_m) {
            stackIn_13_0 = gp.field_d;
          } else {
            stackIn_13_0 = kr.field_e;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("me.K(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_q.a(param0, true) == gp.field_d) {
            stackIn_2_0 = this.field_q.a(param0, 0);
            return stackIn_2_0;
          }
          if (this.a(param0, true) == gp.field_d) {
            stackIn_5_0 = hm.field_d;
            return stackIn_5_0;
          }
          if (param1 != 0) {
            me.a(-101, -109);
          }
          stackIn_9_0 = hb.field_d;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("me.L(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_w = "Spots";
        field_v = "Hide private chat and appear offline to friends";
        field_u = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_o = 0;
        field_s = field_o;
    }
}
