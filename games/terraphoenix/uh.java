/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends gb implements pa, n {
    private boolean field_O;
    static String[] field_L;
    static String[] field_J;
    private boolean field_Q;
    private eb field_G;
    static int field_P;
    private eb field_K;
    static int field_H;
    private ej field_N;
    private ej field_R;
    private eb field_F;
    private boolean field_M;
    private String field_I;

    final void g(byte param0) {
        this.field_N.k(-1);
        this.field_R.k(-1);
        if (param0 >= -78) {
          field_L = (String[]) null;
        }
    }

    final static void a(bm param0, bm param1, int param2, int param3, int param4, int param5) {
        hi.field_ab = param3;
        if (param4 >= -125) {
          return;
        }
        try {
          pj.field_q = param1;
          se.field_j = param5;
          dc.field_b = param2;
          sa.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "uh.S(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2 + 0, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_6_0 = this.a(48, param1);
            return stackIn_6_0;
          }
          if (param2 != 30) {
            field_H = -39;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_11_0 = this.a(param1, (byte) 84);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("uh.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    uh(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (cj) null);
        j dupTemp$0 = null;
        j dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        eb stackIn_17_1 = null;
        eb stackIn_17_2 = null;
        eb stackIn_18_1 = null;
        eb stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ic var6 = null;
        RuntimeException var6_ref = null;
        pk var7 = null;
        String var8 = null;
        kf var9 = null;
        j var12 = null;
        j var13 = null;
        try {
          stackIn_4_1 = (param4);
          this.field_Q = stackIn_4_1;
          this.field_I = param1;
          stackIn_7_1 = (param3);
          this.field_M = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_O = stackIn_10_1;
          if (this.field_O && (this.field_M ||
            this.field_Q)) {
            throw new IllegalStateException();
          }
          this.field_N = (ej) ((Object) new ib(param0, (sc) (this), 100));
          this.field_R = (ej) ((Object) new ib("", (sc) (this), 20));
          if (this.field_O) {
            this.field_F = new eb(rb.field_c, (sc) null);
            this.field_G = new eb(ed.field_c, (sc) null);
            this.field_N.field_A = false;
          } else {
            this.field_F = new eb(ik.field_a, (sc) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (!this.field_Q) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = gd.field_b;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = aj.field_c;
            }
            this.field_G = new eb(stackIn_18_3, (sc) null);
            if (this.field_M) {
              this.field_K = new eb(td.field_j, (sc) (this));
            }
          }
          this.field_N.field_l = (cj) ((Object) new ng(10000536));
          this.field_R.field_l = (cj) ((Object) new ah(10000536));
          var6 = new ic();
          this.field_F.field_l = (cj) ((Object) var6);
          if (null != this.field_G) {
            this.field_G.field_l = (cj) ((Object) var6);
          }
          if (this.field_K != null) {
            this.field_K.field_l = (cj) ((Object) var6);
          }
          this.field_N.field_x = hi.field_Z;
          if (this.field_K != null) {
            this.field_K.field_x = sj.field_d;
          }
          if (this.field_O) {
            this.field_G.field_x = ie.field_c;
          } else {
            if (this.field_Q) {
              this.field_G.field_x = qf.field_b;
              this.field_G.field_l = (cj) ((Object) new qh());
            } else {
              this.field_G.field_l = (cj) ((Object) new qh());
            }
          }
          this.field_u = 15;
          var7 = qk.field_e;
          if (null != this.field_I) {
            this.field_u = this.field_u + (var7.a(this.field_I, this.field_p - 40, var7.field_s) + 5);
          }
          var8 = gb.field_D;
          var9 = vk.a(false, dg.a(false));
          if (var9 == te.field_g) {
            var8 = ed.field_b;
          } else {
            if (gf.field_u == var9) {
              var8 = mm.field_a;
            }
          }
          dupTemp$0 = new j(10, this.field_u, this.field_p - 20, 25, this.field_N, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.b((byte) 95, dupTemp$0);
          this.field_u = this.field_u + (((gl) ((Object) var12)).field_n + 5);
          dupTemp$1 = new j(10, this.field_u, this.field_p - 20, 25, this.field_R, false, 80, 3, var7, 16777215, eb.field_E);
          var13 = dupTemp$1;
          this.b((byte) 95, dupTemp$1);
          this.field_F.field_r = (sc) (this);
          this.field_u = this.field_u + (((gl) ((Object) var13)).field_n + 5);
          if (null != this.field_K) {
            this.field_K.field_r = (sc) (this);
          }
          if (null != this.field_G) {
            this.field_G.field_r = (sc) (this);
          }
          if (null != this.field_K) {
            this.field_F.a(this.field_u, (byte) 83, -95 + this.field_p, 85, 30);
            this.field_u = this.field_u + 60;
          } else {
            this.field_F.a(this.field_u, (byte) 94, -10 + (-6 + this.field_p), 8, 30);
            this.field_u = this.field_u + 35;
          }
          if (this.field_K != null) {
            this.field_K.a(this.field_u, (byte) 83, -10 + (-6 + this.field_p), 8, 30);
            this.field_u = this.field_u + 35;
          }
          if (null != this.field_G) {
            if (!this.field_O &&
              !this.field_Q) {
              this.field_G.a(this.field_u, (byte) 99, 40, 8, 20);
              this.field_u = this.field_u + 25;
            } else {
              this.field_G.a(this.field_u, (byte) 94, -10 + (this.field_p - 6), 8, 30);
              this.field_u = this.field_u + 35;
            }
          }
          this.a(0, (byte) 93, this.field_p, 0, 3 + this.field_u);
          this.b((byte) 95, this.field_F);
          if (this.field_K != null) {
            this.b((byte) 95, this.field_K);
          }
          if (this.field_G != null) {
            this.b((byte) 95, this.field_G);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("uh.<init>(");
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
          throw qk.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_L = null;
        if (param0 != 8) {
          bm var2 = (bm) null;
          uh.a((bm) null, (bm) null, 103, -96, 28, 84);
        }
        field_J = null;
    }

    public final void a(ej param0, boolean param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1) {
            this.g((byte) 36);
          }
          if (this.field_N == param0) {
            this.field_R.a((byte) 17, (gl) (this));
          }
          if (this.field_R == param0) {
            this.f((byte) 121);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("uh.T(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(ej param0, byte param1) {
        try {
          if (param1 != 83) {
            uh.a(-1);
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "uh.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String d(boolean param0) {
        if (this.field_N.field_o == null) {
          return "";
        }
        if (param0) {
          return (String) null;
        }
        return this.field_N.field_o;
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -31312) {
            uh.a(116, 56, '￾');
          }
          var2 = param1.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (0L != qd.a(-82, var3)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("uh.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(String param0, int param1) {
        ej var3 = null;
        String var4 = null;
        try {
          var3 = this.field_N;
          var4 = param0;
          var3.a(false, (byte) -128, var4);
          this.field_R.k(param1);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "uh.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != this.field_I) {
          qk.field_e.a(this.field_I, this.field_w + param0 + 20, this.field_u + (param3 + 15), -40 + this.field_p, this.field_n, 16777215, -1, 1, 0, qk.field_e.field_s);
        }
        if (this.field_K != null) {
          l.d(param0 + 10, param3 + 134, this.field_p - 20, 4210752);
        }
        if (param1 > -106) {
          this.field_R = (ej) null;
        }
        super.a(param0, -118, param2, param3);
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        var7 = Terraphoenix.field_V;
        try {
          if (param0 != this.field_F) {
            if (param0 != this.field_K) {
              if (this.field_G == param0) {
                if (this.field_O) {
                  si.m(-74);
                } else {
                  if (this.field_Q) {
                    fd.c(-24);
                  } else {
                    ie.a(4);
                  }
                }
              }
            } else {
              oe.a(-110);
            }
          } else {
            this.f((byte) 112);
          }
          var6_int = -66 % ((-5 - param4) / 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("uh.I(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void f(byte param0) {
        if (param0 < 77) {
          this.a(-35, 9, -77, 87);
        }
        if (ja.a(true) ||
          !(this.field_N.field_o.length() <= 0) &&
          !(this.field_R.field_o.length() <= 0)) {
          ae.a(this.field_R.field_o, (byte) 75, this.field_N.field_o);
        }
    }

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = Terraphoenix.field_V;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = param0; param1 > var4; var4++) {
          var6[var4] = param2;
        }
        return new String(var6);
    }

    static {
        field_J = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_P = 0;
        field_L = new String[]{"Pistol", "Shotgun", "Automatic Rifle", "Submachine Gun", "Rocket Launcher", "Grenade", "Laser Cannon", "Miniturised Laser", "Pulse Pistol", "Pulse Gun", "Pulse Carbine", "Pulse Grenade", "Fusion Pistol", "Fusion Gun", "Fusion Cannon", "Fusion Launcher", "Fusion Rifle", "Shield Module", "Light Machine Gun", "", ""};
    }
}
