/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch extends k {
    static String field_eb;
    static String field_db;
    private rm field_hb;
    private String field_fb;
    private boolean field_bb;
    private String field_ib;
    static gg field_gb;
    private boolean field_cb;

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        tk.field_a.b(this.field_ib, param2 + (this.field_y >> 1), param1 + 103, 16777215, -1);
        if (null != this.field_fb) {
          wb.a(20 + param2, 120 + param1 - 7, 260, 8421504);
          tk.field_a.a(this.field_fb, 20 + param2, 8 + (param1 + 120), 260, 100, 16777215, -1, 1, 0, tk.field_a.field_C);
        }
    }

    public static void m(int param0) {
        field_gb = null;
        field_db = null;
        if (param0 != 30) {
          field_db = (String) null;
          field_eb = null;
          return;
        }
        field_eb = null;
    }

    ch(fm param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_fb = param1;
          if (this.field_fb != null) {
            var3_int = tk.field_a.b(this.field_fb, 260, tk.field_a.field_C);
            this.a(300, (byte) 78, var3_int + 150);
          }
          this.field_hb = new rm(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_bb = false;
          this.field_cb = false;
          this.field_hb.field_W = true;
          this.b(this.field_hb, 95);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ch.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static rk a(boolean param0, int[] param1, rk param2) {
        rk var3 = null;
        RuntimeException var3_ref = null;
        rk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new rk(0, 0, 0);
          var3.field_p = param2.field_p;
          var3.field_m = param2.field_m;
          if (!param0) {
            field_db = (String) null;
          }
          var3.field_j = param2.field_j;
          var3.field_o = param1;
          var3.field_h = param2.field_h;
          var3.field_i = param2.field_i;
          var3.field_a = param2.field_a;
          var3.field_k = param2.field_k;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ch.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(String param0, float param1, boolean param2, int param3) {
        try {
          if ((!this.field_bb ? 1 : 0) == (!param2 ? 1 : 0)) {
          } else {
            this.field_bb = param2 ? true : false;
            if (this.field_bb) {
              this.field_hb.b(8405024, 15016, 4210752);
              this.field_hb.field_W = true;
            } else {
              this.field_hb.b(2113632, 15016, 4210752);
              if (this.field_cb) {
                this.field_hb.field_W = false;
              }
            }
          }
          if (param3 > -124) {
            rk var6 = (rk) null;
            ch.a(true, (int[]) null, (rk) null);
          }
          this.field_hb.field_L = (int)(param1 / 100.0f * 65536.0f);
          this.field_ib = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ch.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void k(int param0) {
        vk.field_d = (byte[][]) null;
        if (param0 == 4210752) {
          b.field_c = null;
          uh.field_r = null;
          be.field_a = null;
          a.field_c = null;
          wm.field_b = null;
          return;
        }
        field_eb = (String) null;
        b.field_c = null;
        uh.field_r = null;
        be.field_a = null;
        a.field_c = null;
        wm.field_b = null;
    }

    final void l(int param0) {
        if (param0 != -30336) {
          return;
        }
        this.field_hb.field_W = false;
        this.field_cb = true;
    }

    static {
        field_db = "Connecting to<br>friend server...";
        field_eb = "<%0> has entered a game.";
        field_gb = null;
    }
}
