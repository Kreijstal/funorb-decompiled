/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends og implements im, vd, fd {
    private sd field_K;
    private sd field_M;
    static int[] field_J;
    private sd field_N;
    private pc field_E;
    private sd field_I;
    private sd field_z;
    private pc field_G;
    private of field_F;
    nh field_L;
    private sd field_A;
    private rf field_H;
    static String field_C;

    private final int a(int param0, int param1, String param2, int param3, qm param4) {
        RuntimeException var6 = null;
        sb var7 = null;
        ei var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -80) {
            this.field_G = (pc) null;
          }
          var8 = new ei(20, param3, param0 + 120, 25, param4, false, 120, 3, ai.field_h, 16777215, param2);
          this.b(var8, -117);
          var7 = new sb(((lf) ((Object) param4)).a(-121));
          this.b(var7, 47);
          var7.a(15, var8.field_r + var8.field_g + 3, var8.field_j + (var8.field_f - 15 >> 1), 15, (byte) -52);
          stackIn_3_0 = var8.field_f;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("dc.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public dc() {
        super(0, 0, 496, 0, (wo) null);
        this.field_N = new sd("", (bi) null, 12);
        this.field_A = new sd("", (bi) null, 100);
        this.field_K = new sd("", (bi) null, 100);
        this.field_M = new sd("", (bi) null, 20);
        this.field_I = new sd("", (bi) null, 20);
        this.field_z = new sd("", (bi) null, 3);
        int var1 = 1;
        this.field_F = new of("", (bi) null, var1 != 0);
        this.field_G = new pc(ok.field_i, (bi) null);
        this.field_E = new pc(dp.field_i, (bi) null);
        this.field_N.field_t = ac.field_k;
        this.field_A.field_t = go.field_g;
        this.field_K.field_t = dq.field_C;
        this.field_M.field_t = we.field_l;
        this.field_I.field_t = ad.field_j;
        this.field_z.field_t = tf.field_a;
        this.field_F.field_t = na.field_fb;
        this.field_N.a(true, new no(this.field_N));
        this.field_A.a(true, new hn(this.field_A));
        this.field_K.a(true, new kd(this.field_K, this.field_A));
        this.field_M.a(true, new jn(this.field_M, this.field_N, this.field_A));
        this.field_I.a(true, new oo(this.field_I, this.field_M));
        this.field_z.a(true, new ci(this.field_z));
        this.field_G.field_x = false;
        this.field_G.field_i = (wo) ((Object) new ve());
        this.field_E.field_i = (wo) ((Object) new ok());
        this.field_N.field_i = (wo) ((Object) new wc(10000536));
        wc dupTemp$0 = new wc(10000536);
        this.field_K.field_i = (wo) ((Object) dupTemp$0);
        this.field_A.field_i = (wo) ((Object) dupTemp$0);
        this.field_z.field_i = (wo) ((Object) new wc(10000536));
        this.field_F.field_i = (wo) ((Object) new wn());
        aq dupTemp$1 = new aq(10000536);
        this.field_I.field_i = (wo) ((Object) dupTemp$1);
        this.field_M.field_i = (wo) ((Object) dupTemp$1);
        String var2 = ci.a(new String[]{this.e((byte) -102), this.c(true)}, el.field_h, 3);
        int var3 = 20;
        var3 = var3 + this.a(var3, 170, vm.field_h, this.field_A, 25406);
        var3 = var3 + (this.a(170, 20, var3, 0, sh.field_m, "", this.field_K) + 5);
        var3 = var3 + this.a(var3, 170, fh.field_h, this.field_M, 25406);
        var3 = var3 + (this.a(pk.field_f, var3, this.field_I, true, si.field_c, 170) + 5);
        var3 = var3 + (5 + this.a(fh.field_g, var3, this.field_N, true, tb.field_c, 170));
        var3 = var3 + this.a(170, -81, ui.field_b, var3, this.field_z);
        ei var4 = new ei(46, var3, -90 + this.field_g, 25, this.field_F, true, -120 + this.field_g, 5, ba.field_i, 11579568, qn.field_j);
        this.b(var4, -123);
        var3 = var3 + var4.field_f;
        lb var5 = new lb(ai.field_h, 0, 0, 0, 0, 16777215, -1, 0, 0, ai.field_h.field_o, -1, 2147483647, true);
        this.field_H = new rf(var2, var5);
        this.field_H.field_t = "";
        this.field_H.a(47, hp.field_r, 0);
        this.field_H.a(47, hp.field_r, 1);
        this.field_H.field_l = (bi) (this);
        this.field_H.b(var3, 47, 46, -90 + this.field_g);
        var3 = var3 + (15 + this.field_H.field_f);
        this.b(this.field_H, 42);
        int var6 = 4;
        int var7 = 200;
        this.field_G.a(40, 496 - var7 >> 1, var3, var7, (byte) -52);
        this.field_E.a(40, 3 + var6, 15 + var3, 60, (byte) -52);
        this.field_E.field_l = (bi) (this);
        this.field_G.field_l = (bi) (this);
        this.b(this.field_G, -116);
        this.b(this.field_E, -124);
        this.field_L = new nh((fd) (this));
        this.field_L.a(150, 60 + this.field_N.field_r + this.field_N.field_g, 20 + this.field_N.field_j, -60 - this.field_N.field_r + (this.field_g - this.field_N.field_g), (byte) -52);
        this.b(this.field_L, 65);
        this.a(var6 + var3 + 55, 0, 0, 496, (byte) -52);
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
          super.a(param0, 19, param2, param3);
          int var5_int = -55 / ((param1 + 50) / 59);
          this.field_G.field_x = this.k(-103);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "dc.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(int param0, int param1, rf param2, byte param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = CrazyCrystals.field_B;
        try {
          if (0 == param0) {
            fq.a(-128, "terms.ws");
          } else {
            if (param0 != 1) {
              if (param0 == 2) {
                fq.a(-128, "conduct.ws");
              }
            } else {
              fq.a(56, "privacy.ws");
            }
          }
          if (param3 <= -127) {
            return;
          }
          field_J = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("dc.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (!param2) {
          kh.a();
          var3 = -33 % ((param1 - 49) / 52);
          d.a((byte) 90, param2);
          return;
        }
        kh.d(0, 0, kh.field_l, kh.field_d, 0, 192);
        var3Lifetime1 = -33 % ((param1 - 49) / 52);
        d.a((byte) 90, param2);
    }

    private final boolean i(int param0) {
        if (!this.k(-114)) {
          return false;
        }
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.field_z.field_o);
        } catch (NumberFormatException numberFormatException) {
        }
        if (param0 >= 87) {
          return mp.a(0, this.field_N.field_o, this, this.field_A.field_o, this.field_M.field_o, this.field_F.field_A, var2);
        }
        this.field_E = (pc) null;
        return mp.a(0, this.field_N.field_o, this, this.field_A.field_o, this.field_M.field_o, this.field_F.field_A, var2);
    }

    private final String e(byte param0) {
        if (param0 != -102) {
          this.field_F = (of) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean k(int param0) {
        if (param0 > -95) {
          return true;
        }
        if (!this.a((lf) (this.field_N), (byte) 61)) {
          return false;
        }
        if (!this.a((lf) (this.field_A), (byte) 61)) {
          return false;
        }
        if (!this.a((lf) (this.field_K), (byte) 61)) {
          return false;
        }
        if (!this.a((lf) (this.field_M), (byte) 61)) {
          return false;
        }
        if (!this.a((lf) (this.field_I), (byte) 61)) {
          return false;
        }
        if (this.a((lf) (this.field_z), (byte) 61)) {
          return true;
        }
        return false;
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.a((byte) -104, param2);
            return stackIn_6_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_9_0 = this.a(param2, -25911);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("dc.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2, int param3, String param4, String param5, qm param6) {
        RuntimeException var8 = null;
        io var9 = null;
        ei var10 = null;
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
          if (param3 != 0) {
            stackIn_2_0 = -62;
            return stackIn_2_0;
          }
          var10 = new ei(20, param2, 120 + param0, 25, param6, false, 120, 3, ai.field_h, 16777215, param4);
          this.b(var10, param3 ^ -124);
          var9 = new io(((lf) ((Object) param6)).a(param3 - 95), param5, 126, param2 + var10.field_f, 50 + param0, param1);
          var9.field_l = (bi) (this);
          this.b(var9, -116);
          stackIn_4_0 = var10.field_f + var9.field_f;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("dc.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static rm a(boolean param0, String param1, byte param2) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        rm var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        Object stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        wg stackIn_9_0;
        db stackIn_9_1;
        bn stackIn_9_2;
        rm stackIn_9_3;
        int stackIn_9_4;
        int stackIn_10_5 = 0;
        rm stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = (CharSequence) ((Object) param1);
          var3_long = ij.a(true, var7);
          var5 = (rm) (ra.field_d.a(var3_long, 0));
          if (var5 == null) {
            var5 = (rm) (ah.field_a.a(var3_long, 0));
            if (var5 == null) {
              var5 = rm.a(mg.field_c, param1, "");
              if (var5 == null) {
                stackIn_4_0 = null;
                return (rm) (stackIn_4_0);
              }
              ah.field_a.a(-22072, var3_long, var5);
              stackIn_6_0 = null;
              return (rm) (stackIn_6_0);
            }
            stackIn_9_0 = fq.field_x;
            stackIn_9_1 = rl.field_i;
            stackIn_9_2 = aa.field_b;
            stackIn_9_3 = var5;
            stackIn_9_4 = -128;
            if (param0) {
              stackIn_10_5 = 22050;
            } else {
              stackIn_10_5 = 2205;
            }
            if (!((wg) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_10_5)) {
              return null;
            }
            ra.field_d.a(-22072, var3_long, var5);
          }
          var6 = -4 % ((param2 + 64) / 35);
          stackIn_15_0 = var5;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("dc.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_J = null;
        int var1 = -101 / ((15 - param0) / 35);
        field_C = null;
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        boolean discarded$1 = false;
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = -47 / ((param0 - 83) / 36);
          if (this.field_E == param4) {
            ba.c((byte) 93);
            return;
          }
          if (this.field_G != param4) {
            return;
          }
          discarded$1 = this.i(100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("dc.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void a(String param0, int param1) {
        sd var3 = null;
        String var4 = null;
        try {
          var3 = this.field_N;
          var4 = param0;
          if (param1 != -23752) {
            this.field_L = (nh) null;
          }
          ((ga) ((Object) var3)).a(false, -100, var4);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "dc.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int a(String param0, int param1, qm param2, boolean param3, String param4, int param5) {
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
          if (param3) {
            stackIn_4_0 = this.a(param5, 35, param1, 0, param4, param0, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = 31;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("dc.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean a(lf param0, byte param1) {
        n var3 = null;
        RuntimeException var3_ref = null;
        oi var4 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 61) {
            return false;
          }
          var3 = param0.a(-113);
          if (var3 == null) {
            return true;
          }
          var4 = var3.c((byte) 45);
          if (var4 == rk.field_c) {
            return false;
          }
          if (var4 == ta.field_h) {
            return false;
          }
          if (pe.field_p != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("dc.O(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    private final String c(boolean param0) {
        if (!param0) {
          String var3 = (String) null;
          this.a((String) null, -79);
          return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(int param0) {
        ((no) (this.field_N.a(-101))).d(-31626);
        if (param0 != 20) {
          this.field_F = (of) null;
        }
    }

    private final int a(int param0, int param1, String param2, qm param3, int param4) {
        ei var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 25406) {
            field_C = (String) null;
          }
          var6 = new ei(20, param0, 120 + param1, 25, param3, false, 120, 3, ai.field_h, 16777215, param2);
          this.b(var6, 112);
          stackIn_3_0 = var6.field_f;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_6_0 = var6_ref;
          stackIn_6_1 = new StringBuilder().append("dc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_J = new int[]{33023, 49216, 8388863, 16711680};
        field_C = "Quit";
    }
}
