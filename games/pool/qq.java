/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qq extends ok implements tb {
    static String field_yb;
    private boolean field_tb;
    static String field_zb;
    private gj field_Ab;
    private boolean field_sb;
    private lr field_wb;
    private boolean field_ub;
    static int field_xb;
    private boolean field_vb;

    final static void o(byte param0) {
        kh.field_Vb = new vh("decision box", (vh) null);
        ia.a(true, kh.field_Vb);
        hk.field_t = new vh("decision button a", (vh) null);
        rl.field_b = new vh("decision button b", (vh) null);
        if (param0 < -103) {
          ar.a(29022, hk.field_t);
          ar.a(29022, rl.field_b);
          kh.field_Vb.a(-104, hk.field_t);
          kh.field_Vb.a(-104, rl.field_b);
          return;
        }
        qq.o((byte) -98);
        ar.a(29022, hk.field_t);
        ar.a(29022, rl.field_b);
        kh.field_Vb.a(-104, hk.field_t);
        kh.field_Vb.a(-104, rl.field_b);
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            return true;
          }
          if (param1 != 13) {
            stackIn_7_0 = super.a(param0, param1, false, param3);
            return stackIn_7_0;
          }
          this.k(17);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("qq.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void k(int param0) {
        if (param0 != 17) {
          return;
        }
        if (!this.field_R) {
          return;
        }
        this.field_R = false;
        if (this.field_sb) {
          kr.a(false);
          return;
        }
        if (!this.field_tb) {
          return;
        }
        bh.b(false);
    }

    final void m(byte param0) {
        wk var2 = null;
        wk var2Lifetime1;
        this.field_Ab.a(4210752, 19365, 2121792);
        if (param0 == -33) {
          var2 = new wk(this, this.field_wb, ag.field_g);
          var2.a(15, ti.field_c, param0 + 34);
          this.d(var2, param0 + 63);
          return;
        }
        this.field_tb = false;
        var2Lifetime1 = new wk(this, this.field_wb, ag.field_g);
        var2Lifetime1.a(15, ti.field_c, param0 + 34);
        this.d(var2Lifetime1, param0 + 63);
    }

    public static void n(byte param0) {
        if (param0 >= -62) {
          field_zb = (String) null;
          field_yb = null;
          field_zb = null;
          return;
        }
        field_yb = null;
        field_zb = null;
    }

    final void a(String param0, int param1, int param2) {
        boolean stackIn_5_1 = false;
        wk stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_11_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        wk var5 = null;
        try {
          if (this.field_vb) {
            return;
          }
          this.field_vb = true;
          stackIn_5_1 = (param2 == ~param1);
          this.field_ub = stackIn_5_1;
          this.field_Ab.a(4210752, param2 ^ -19110, 8405024);
          var5 = new wk(this, this.field_wb, param0);
          if (param1 == 5) {
            var5.a(11, hb.field_c, 1);
            var5.a(17, dj.field_e, 1);
          } else {
            if (param1 != 256) {
              stackIn_10_0 = var5;
              stackIn_10_1 = -1;
              if (!this.field_sb) {
                stackIn_11_2 = jk.field_a;
              } else {
                stackIn_11_2 = ap.field_F;
              }
              ((wk) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_11_2, 1);
            } else {
              var5.a(ap.field_F, -101, (cc) (this));
            }
          }
          if (param1 != 3) {
            if (4 == param1) {
              var5.a(8, lg.field_w, 1);
            } else {
              if (param1 == 6) {
                var5.a(9, e.field_f, 1);
              } else {
                if (param1 != 9) {
                  this.d(var5, 30);
                  return;
                }
                var5.a(lg.field_y, -94, (cc) (this));
              }
            }
          } else {
            var5.a(7, o.field_w, 1);
          }
          this.d(var5, 30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("qq.R(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public void a(boolean param0, int param1, int param2, fe param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_ub) {
            lf.a(3, (byte) 121);
            this.k(17);
          } else {
            ui.a("tochangedisplayname.ws", hk.d(97), false);
          }
          if (param0) {
            return;
          }
          this.field_wb = (lr) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("qq.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    qq(lq param0, lr param1, String param2, boolean param3, boolean param4) {
        super(param0, new wk((qq) null, param1, param2), 77, 10, 10);
        try {
          this.field_vb = false;
          this.field_sb = param3 ? true : false;
          this.field_wb = param1;
          this.field_tb = param4 ? true : false;
          this.field_ub = false;
          this.field_Ab = new gj(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_Ab.field_N = true;
          this.a(true, this.field_Ab);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "qq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_yb = "The objective of eight-ball pool is to \"pot\" all of your group of balls and then the black ball (number 8). Before we get to that, we \"break\", and the first thing you might want to do is <u=ffffff>move the cue ball</u>. <col=99ff99>Hold</col> down the <img=0> <col=99ff99>left mouse button over the cue ball and drag</col> it to where you would like to place it.";
        field_xb = 0;
        field_zb = "You and <%0> are <%2>.";
    }
}
