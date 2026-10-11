/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends dc {
    private dg field_gb;
    static int[] field_eb;
    static String field_db;
    static int field_bb;
    private String field_lb;
    static mg[][] field_fb;
    static int[] field_jb;
    private String field_kb;
    private boolean field_ib;
    static String field_hb;
    private boolean field_cb;

    final void b(int param0, int param1, int param2) {
        super.b(param0, 22, param2);
        on.field_b.c(this.field_lb, param2 + (this.field_g >> 1), 103 + param0, 16777215, -1);
        if (param1 < 8) {
          vc.g((byte) 3);
          if (this.field_kb != null) {
            df.b(20 + param2, 113 + param0, 260, 8421504);
            on.field_b.a(this.field_kb, param2 + 20, param0 + 120 + 8, 260, 100, 16777215, -1, 1, 0, on.field_b.field_H);
            return;
          }
          return;
        }
        if (this.field_kb == null) {
          return;
        }
        df.b(20 + param2, 113 + param0, 260, 8421504);
        on.field_b.a(this.field_kb, param2 + 20, param0 + 120 + 8, 260, 100, 16777215, -1, 1, 0, on.field_b.field_H);
    }

    final static void a(boolean param0, boolean param1, int param2) {
        String var4 = (String) null;
        mi.a((String) null, param1, param0, true);
        if (param2 != -16113) {
          vc.a(true, true, -42);
        }
    }

    public static void g(byte param0) {
        field_db = null;
        field_eb = null;
        field_hb = null;
        if (param0 < 57) {
          return;
        }
        field_fb = (mg[][]) null;
        field_jb = null;
    }

    final void a(float param0, boolean param1, boolean param2, String param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_cb != param2) {
            stackIn_5_1 = (param2);
            this.field_cb = stackIn_5_1;
            if (!this.field_cb) {
              this.field_gb.d(4210752, 2113632, 123);
              if (this.field_ib) {
                this.field_gb.field_z = false;
              }
            } else {
              this.field_gb.d(4210752, 8405024, 125);
              this.field_gb.field_z = true;
            }
          }
          this.field_lb = param3;
          this.field_gb.field_C = (int)(param0 / 100.0f * 65536.0f);
          if (!param1) {
            return;
          }
          vc.g((byte) 54);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("vc.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    vc(je param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_kb = param1;
          if (null != this.field_kb) {
            var3_int = on.field_b.a(this.field_kb, 260, on.field_b.field_H);
            this.c(150 + var3_int, 120, 300);
          }
          this.field_gb = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_gb.field_z = true;
          this.field_cb = false;
          this.field_ib = false;
          this.a((fi) (this.field_gb), (byte) -78);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "vc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void k(int param0) {
        this.field_ib = true;
        this.field_gb.field_z = false;
        int var2 = -44 / ((param0 + 54) / 59);
    }

    final static void h(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = pm.field_l;
        synchronized (var1) {
          j.field_e = hc.field_d;
          ng.field_Q = ng.field_Q + 1;
          nl.field_u = ka.field_i;
          hk.field_Jb = sm.field_a;
          if (param0 > -30) {
            field_eb = (int[]) null;
          }
          w.field_J = wg.field_a;
          wg.field_a = false;
          oi.field_g = we.field_g;
          ii.field_b = ei.field_f;
          a.field_y = hk.field_Mb;
          we.field_g = 0;
        }
    }

    final static rm a(eh param0, String param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        rm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(-1, param2);
          var5 = param0.a(-60, var4_int, param1);
          if (param3 <= 23) {
            field_hb = (String) null;
          }
          stackIn_3_0 = bd.a(var5, var4_int, -2071, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("vc.Q(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_eb = new int[]{1, 1, 1, 3, 2, 1, 1, 2, 5, 1};
        field_db = "You cannot move";
    }
}
