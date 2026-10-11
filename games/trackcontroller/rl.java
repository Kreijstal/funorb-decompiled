/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends td implements se, m {
    private boolean field_L;
    private rh field_G;
    private rh field_O;
    static q[] field_C;
    private String field_M;
    private lb field_H;
    static kk field_D;
    static int field_N;
    private boolean field_K;
    private lb field_F;
    private boolean field_I;
    private rh field_J;

    final static kd a(int param0, boolean param1, String param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        kd stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 20) {
            field_C = (q[]) null;
          }
          var4_long = 0L;
          var6 = null;
          if (param3.indexOf('@') != -1) {
            var6 = param3;
          } else {
            var7 = (CharSequence) ((Object) param3);
            var4_long = vh.a((byte) -81, var7);
          }
          stackIn_6_0 = ie.a(var4_long, param2, param1, (String) (var6), (byte) -124);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("rl.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(byte param0, String param1) {
        lb var3 = null;
        String var4 = null;
        try {
          if (param0 < 45) {
            this.field_H = (lb) null;
          }
          var3 = this.field_H;
          var4 = param1;
          var3.a(false, var4, 122);
          this.field_F.l(-68);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "rl.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != this.field_M) {
          gk.field_c.a(this.field_M, param1 + this.field_p + 20, this.field_m + param2 + 15, this.field_x - 40, this.field_u, 16777215, -1, 1, 0, gk.field_c.field_G);
        }
        if (this.field_O != null) {
          ll.a(param1 + 10, 134 + param2, this.field_x - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final void a(byte param0) {
        if (param0 < 117) {
          return;
        }
        this.field_H.l(-73);
        this.field_F.l(-72);
    }

    public static void b(boolean param0) {
        field_C = null;
        if (param0) {
          return;
        }
        field_D = null;
    }

    public final void a(int param0, lb param1) {
        try {
          if (param0 != -12230) {
            this.field_I = true;
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "rl.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rl(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (t) null);
        sa dupTemp$0 = null;
        sa dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        rh stackIn_18_1 = null;
        rh stackIn_18_2 = null;
        rh stackIn_19_1 = null;
        rh stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        dc var6 = null;
        RuntimeException var6_ref = null;
        oh var7 = null;
        String var8 = null;
        bl var9 = null;
        sa var12 = null;
        sa var13 = null;
        try {
          stackIn_4_1 = (param2);
          this.field_L = stackIn_4_1;
          stackIn_7_1 = (param4);
          this.field_I = stackIn_7_1;
          stackIn_10_1 = (param3);
          this.field_K = stackIn_10_1;
          this.field_M = param1;
          if (this.field_L && (this.field_K ||
            this.field_I)) {
            throw new IllegalStateException();
          }
          this.field_H = (lb) ((Object) new lf(param0, (tg) (this), 100));
          this.field_F = (lb) ((Object) new lf("", (tg) (this), 20));
          if (!this.field_L) {
            this.field_G = new rh(nd.field_H, (tg) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_I) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = ea.field_p;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = v.field_d;
            }
            this.field_J = new rh(stackIn_19_3, (tg) null);
            if (this.field_K) {
              this.field_O = new rh(md.field_f, (tg) (this));
            }
          } else {
            this.field_G = new rh(ib.field_c, (tg) null);
            this.field_J = new rh(cg.field_b, (tg) null);
            this.field_H.field_B = false;
          }
          this.field_H.field_y = (t) ((Object) new dd(10000536));
          this.field_F.field_y = (t) ((Object) new ql(10000536));
          var6 = new dc();
          this.field_G.field_y = (t) ((Object) var6);
          if (this.field_J != null) {
            this.field_J.field_y = (t) ((Object) var6);
          }
          if (null != this.field_O) {
            this.field_O.field_y = (t) ((Object) var6);
          }
          this.field_H.field_n = ie.field_a;
          if (this.field_O != null) {
            this.field_O.field_n = ic.field_g;
          }
          if (!this.field_L) {
            if (!this.field_I) {
              this.field_J.field_y = (t) ((Object) new ne());
            } else {
              this.field_J.field_n = kh.field_b;
              this.field_J.field_y = (t) ((Object) new ne());
            }
          } else {
            this.field_J.field_n = lc.field_E;
          }
          this.field_m = 15;
          var7 = gk.field_c;
          if (this.field_M != null) {
            this.field_m = this.field_m + (var7.a(this.field_M, -40 + this.field_x, var7.field_G) + 5);
          }
          var8 = ai.field_i;
          var9 = gj.a(100, gd.b((byte) 77));
          if (rd.field_o != var9) {
            if (qi.field_f == var9) {
              var8 = nb.field_q;
            }
          } else {
            var8 = re.field_m;
          }
          dupTemp$0 = new sa(10, this.field_m, this.field_x - 20, 25, this.field_H, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.a(false, dupTemp$0);
          this.field_m = this.field_m + (5 + ((al) ((Object) var12)).field_u);
          dupTemp$1 = new sa(10, this.field_m, this.field_x - 20, 25, this.field_F, false, 80, 3, var7, 16777215, rf.field_d);
          var13 = dupTemp$1;
          this.a(false, dupTemp$1);
          this.field_m = this.field_m + (5 + ((al) ((Object) var13)).field_u);
          this.field_G.field_l = (tg) (this);
          if (null != this.field_O) {
            this.field_O.field_l = (tg) (this);
          }
          if (this.field_J != null) {
            this.field_J.field_l = (tg) (this);
          }
          if (this.field_O == null) {
            this.field_G.a(30, -3050, this.field_m, -10 + (-6 + this.field_x), 8);
            this.field_m = this.field_m + 35;
          } else {
            this.field_G.a(30, -3050, this.field_m, -95 + this.field_x, 85);
            this.field_m = this.field_m + 60;
          }
          if (null != this.field_O) {
            this.field_O.a(30, -3050, this.field_m, this.field_x - 16, 8);
            this.field_m = this.field_m + 35;
          }
          if (this.field_J != null) {
            if (!this.field_L &&
              !this.field_I) {
              this.field_J.a(20, -3050, this.field_m, 40, 8);
              this.field_m = this.field_m + 25;
            } else {
              this.field_J.a(30, -3050, this.field_m, -16 + this.field_x, 8);
              this.field_m = this.field_m + 35;
            }
          }
          this.a(this.field_m + 3, -3050, 0, this.field_x, 0);
          this.a(false, this.field_G);
          if (this.field_O != null) {
            this.a(false, this.field_O);
          }
          if (this.field_J != null) {
            this.a(false, this.field_J);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("rl.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a((byte) -38, param1, param2, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_6_0 = this.a(param2, -45);
            return stackIn_6_0;
          }
          if (param3 == 99) {
            stackIn_10_0 = this.a(param2, true);
            return stackIn_10_0;
          }
          var5_int = -54 / ((17 - param0) / 51);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("rl.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void c(boolean param0) {
        if (kk.b((byte) -128) ||
          !(0 >= this.field_H.field_s.length()) &&
          !(this.field_F.field_s.length() <= 0)) {
          vh.a(this.field_H.field_s, 224, this.field_F.field_s);
        }
        if (param0) {
          this.c(true);
        }
    }

    public final void b(int param0, lb param1) {
        if (this.field_H == param1) {
          this.field_F.a((byte) -108, (al) (this));
        }
        if (param0 >= -23) {
          return;
        }
        try {
          if (this.field_F == param1) {
            this.c(false);
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "rl.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          if (this.field_G == param0) {
            this.c(false);
          } else {
            if (param0 != this.field_O) {
              if (param0 == this.field_J) {
                if (!this.field_L) {
                  if (!this.field_I) {
                    ie.a((byte) 93);
                  } else {
                    hl.m(param4 ^ 1217388583);
                  }
                } else {
                  ti.a((byte) -58);
                }
              }
            } else {
              lb.o(-127);
            }
          }
          if (param4 != -27322) {
            this.field_O = (rh) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("rl.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final String d(boolean param0) {
        if (null == this.field_H.field_s) {
          return "";
        }
        if (!param0) {
          return (String) null;
        }
        return this.field_H.field_s;
    }

    static {
    }
}
