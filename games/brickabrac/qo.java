/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends ib implements vf, en {
    static boolean field_I;
    static byte[] field_J;
    static String field_H;
    static int field_N;
    static String field_P;
    private d field_K;
    private sf field_L;
    private d field_Q;
    static String[] field_M;
    ri field_R;
    static int pressY;

    private final int a(int param0, String param1, oc param2, String param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -10) {
            stackIn_4_0 = this.a(param1, param5, param4, param2, 35, param3, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = 82;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("qo.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = 0;
          var4 = jq.field_r;
          if (param0 != 120) {
            pressY = -69;
          }
          while (qh.field_i.length > var3_int) {
            var5 = BrickABrac.field_K[var3_int];
            if (var5 < 0) {
              var4 = var4 + pe.field_s;
            } else {
              var6 = hm.a(true, qh.field_i[var3_int], 0);
              var4 = var4 + kn.field_y;
              var7 = wi.field_k - (var6 >> 1);
              if (bg.containsRectanglePoint(var7 - cn.field_c, (jb.field_H << 1) + b.field_c, var6 + (cn.field_c << 1), (byte) 65, param1, param2, var4)) {
                stackIn_7_0 = var5;
                return stackIn_7_0;
              }
              var4 = var4 + (kn.field_y + ((jb.field_H << 1) + b.field_c));
            }
            var3_int++;
          }
          stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var3), "qo.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.b(param2, (byte) 87);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(param2, (byte) -127);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("qo.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(String param0, int param1, int param2, oc param3, int param4, String param5, boolean param6) {
        RuntimeException var8 = null;
        nf var9 = null;
        ma var10 = null;
        ma stackIn_2_1 = null;
        boolean stackIn_3_2 = false;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new ma(20, param2, param1 + 120, 25, param3, param6, 120, 3, a.field_u, 16777215, param0);
          stackIn_2_1 = var10;
          stackIn_3_2 = !(param6);
          this.a(stackIn_2_1, stackIn_3_2);
          var9 = new nf(((je) ((Object) param3)).a(-11011), param5, 126, param2 + var10.field_s, 25 + param1, param4);
          var9.field_i = (uh) (this);
          this.a(var9, true);
          stackIn_4_0 = var9.field_s + var10.field_s;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("qo.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        IsaacGenerator.field_f = 400 * param1 / param0;
        IsaacGenerator.field_c = (param1 << 16) / 150;
        IsaacGenerator.field_n = param1 * 100 / 150;
    }

    public static void h(int param0) {
        field_P = null;
        field_H = null;
        field_J = null;
        field_M = null;
        int var1 = -119 / ((-4 - param0) / 38);
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param4 == this.field_K) {
            MotionWaypoint.d(-101);
          } else {
            if (param4 == this.field_Q) {
              this.a(28462);
            }
          }
          if (param2 <= -22) {
            return;
          }
          field_P = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("qo.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_Q.field_J = this.h((byte) 92);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "qo.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean a(int param0, je param1) {
        ia var3 = null;
        RuntimeException var3_ref = null;
        qh var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(-11011);
          if (var3 == null) {
            return true;
          }
          var4 = var3.b((byte) -31);
          if (param0 > -64) {
            field_J = (byte[]) null;
          }
          stackIn_9_0 = (var4 == DualLinkIterator.field_c);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("qo.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(int param0) {
        if (!this.h((byte) 92)) {
          return;
        }
        kb.a(this.field_L.field_A, -96);
        if (param0 != 28462) {
          this.field_Q = (d) null;
          return;
        }
    }

    public qo() {
        super(0, 0, 496, 0, (ub) null);
        this.field_L = new sf("", (uh) null, 12);
        um var1 = new um(og.field_Yb, 0, 0, 0, 0, 16777215, -1, 3, 0, a.field_u.ascent, -1, 2147483647, true);
        oc var2 = new oc(ac.field_d, var1, (uh) null);
        this.field_Q = new d(k.field_j, (uh) null);
        this.field_K = new d(wl.field_L, (uh) null);
        this.field_L.field_z = hh.field_a;
        this.field_L.a(new fl(this.field_L), (byte) -68);
        this.field_Q.field_J = false;
        this.field_Q.field_l = (ub) ((Object) new hi());
        this.field_K.field_l = (ub) ((Object) new bb());
        this.field_L.field_l = (ub) ((Object) new r(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, 20, var3, (byte) -119, 270);
        var3 += 50;
        this.a(var2, true);
        var3 = var3 + (this.a(-14, BlankScreen.field_j, this.field_L, dj.field_h, var3, 170) + 5);
        this.field_Q.a(40, 496 - var5 >> 1, var3, (byte) -119, var5);
        this.field_K.a(40, var4 + 3, var3 + 15, (byte) -119, 60);
        this.field_K.field_i = (uh) (this);
        this.field_Q.field_i = (uh) (this);
        this.a(this.field_Q, true);
        this.a(this.field_K, true);
        this.field_R = new ri((vf) (this));
        this.field_R.a(150, this.field_L.field_t + this.field_L.field_o + 60, 20, (byte) -119, -60 + (-this.field_L.field_t - this.field_L.field_o + this.field_t));
        this.a(this.field_R, true);
        this.a(var4 + (55 + var3), 0, 0, (byte) -119, 496);
    }

    private final boolean h(byte param0) {
        if (param0 != 92) {
          field_P = (String) null;
          if (this.a(-68, this.field_L)) {
            return true;
          }
          return false;
        }
        if (this.a(-68, this.field_L)) {
          return true;
        }
        return false;
    }

    public final void a(String param0, byte param1) {
        sf var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_L;
          var4 = param0;
          ((vb) ((Object) var3)).a(var4, param1 - 12648, false);
          if (param1 == 56) {
            return;
          }
          field_P = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("qo.C(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(byte param0) {
        if (param0 < 96) {
          return;
        }
        ((fl) (this.field_L.a(-11011))).e((byte) -22);
    }

    static {
        field_H = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_P = "Curses!";
        field_M = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        pressY = 0;
    }
}
