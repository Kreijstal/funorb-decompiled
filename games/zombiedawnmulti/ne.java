/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ne extends ie implements in {
    private boolean field_wb;
    private boolean field_xb;
    static ja[] field_Ab;
    private boolean field_ub;
    private boolean field_yb;
    private le field_Bb;
    private fm field_zb;
    static String field_vb;
    static int field_tb;

    final void a(String param0, int param1, int param2) {
        boolean stackIn_6_1 = false;
        wd stackIn_11_0 = null;
        String stackIn_12_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        wd var7 = null;
        int var5Lifetime1;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_ub) {
            return;
          }
          stackIn_6_1 = (param2 == 256);
          this.field_yb = stackIn_6_1;
          this.field_ub = true;
          this.field_Bb.a(4210752, 8405024, (byte) -31);
          var7 = new wd(this, this.field_zb, param0);
          if (5 != param2) {
            if (param2 == 256) {
              var7.a(ci.field_g, -76, (bj) (this));
            } else {
              stackIn_11_0 = var7;
              if (!this.field_wb) {
                stackIn_12_1 = sn.field_Zb;
              } else {
                stackIn_12_1 = ci.field_g;
              }
              ((wd) (Object) stackIn_11_0).a(stackIn_12_1, -1, true);
            }
          } else {
            var7.a(lc.field_g, 11, true);
            var7.a(oe.field_b, 17, true);
          }
          if (3 != param2) {
            if (param2 == 4) {
              var7.a(bc.field_c, 8, true);
            } else {
              if (6 != param2) {
                if (param2 != 9) {
                  this.a((cf) (var7), (byte) 119);
                  var5 = -3 % ((-15 - param1) / 46);
                  return;
                }
                var7.a(il.field_l, -74, (bj) (this));
              } else {
                var7.a(wm.field_S, 9, true);
              }
            }
          } else {
            var7.a(od.field_zb, 7, true);
          }
          this.a((cf) (var7), (byte) 119);
          var5Lifetime1 = -3 % ((-15 - param1) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("ne.P(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void m(int param0) {
        if (!this.field_R) {
          return;
        }
        this.field_R = false;
        if (param0 != -7435) {
          return;
        }
        if (this.field_wb) {
          lb.a(9047);
          return;
        }
        if (!this.field_xb) {
          return;
        }
        ce.c((byte) -123);
    }

    final static void c(int param0, int param1, int param2, int param3, int param4) {
        if (param1 == 20341) {
          mg.field_H = param0;
          dq.field_l = param2;
          tk.field_n = param4;
          po.field_n = param3;
          return;
        }
        field_Ab = (ja[]) null;
        mg.field_H = param0;
        dq.field_l = param2;
        tk.field_n = param4;
        po.field_n = param3;
    }

    public static void n(int param0) {
        field_Ab = null;
        field_vb = null;
        if (param0 != 10) {
          ne.c(10, -105, -88, -20, 64);
        }
    }

    final void c(boolean param0) {
        this.field_Bb.a(4210752, 2121792, (byte) 116);
        wd var2 = new wd(this, this.field_zb, lq.field_c);
        if (!param0) {
          var2.a(og.field_T, 15, true);
          this.a((cf) (var2), (byte) -18);
          return;
        }
    }

    public void a(int param0, int param1, gn param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_yb) {
            fb.a(3, 118);
            this.m(-7435);
          } else {
            ic.a(jl.b(0), "tochangedisplayname.ws", 114);
          }
          if (param3 < -83) {
            return;
          }
          this.field_yb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ne.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    ne(vk param0, fm param1, String param2, boolean param3, boolean param4) {
        super(param0, new wd((ne) null, param1, param2), 77, 10, 10);
        try {
          this.field_yb = false;
          this.field_wb = param3 ? true : false;
          this.field_ub = false;
          this.field_xb = param4 ? true : false;
          this.field_zb = param1;
          this.field_Bb = new le(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_Bb.field_L = true;
          this.b((byte) 104, this.field_Bb);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        gn var6 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 13) {
            this.m(-7435);
            return true;
          }
          if (param3 != -6208) {
            var6 = (gn) null;
            this.a(110, 74, (gn) null, -12, 106);
          }
          stackIn_7_0 = super.a(param0, param1, param2, -6208);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ne.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_vb = "Lobby";
    }
}
