/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends g implements md, oi, rf {
    private pl field_C;
    private ig field_I;
    private pl field_K;
    private nd field_D;
    private rg field_M;
    static int field_F;
    private pl field_H;
    ul field_O;
    static int field_L;
    private pl field_N;
    static bd field_E;
    private pl field_G;
    private pl field_B;
    private ig field_J;

    public final void a(byte param0, String param1) {
        pl var3 = null;
        String var4 = null;
        try {
          var3 = this.field_N;
          var4 = param1;
          ((ae) ((Object) var3)).a((byte) 20, var4, false);
          int var5 = -111 / ((61 - param0) / 62);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "mj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            return;
          }
          if (this.field_J == param2) {
            cg.a((byte) 122);
            return;
          }
          if (this.field_I != param2) {
            return;
          }
          discarded$1 = this.j(5255);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("mj.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static ml i(int param0) {
        if (ok.field_a == o.field_l) {
          throw new IllegalStateException();
        }
        if (param0 != 0) {
          return (ml) null;
        }
        if (ta.field_m == o.field_l) {
          o.field_l = ok.field_a;
          return hi.field_d;
        }
        return null;
    }

    private final boolean h(int param0) {
        if (!this.a(10000536, (je) (this.field_N))) {
          return false;
        }
        if (!this.a(param0 ^ 10000560, (je) (this.field_H))) {
          return false;
        }
        if (!this.a(10000536, (je) (this.field_K))) {
          return false;
        }
        if (!this.a(10000536, (je) (this.field_G))) {
          return false;
        }
        if (!this.a(10000536, (je) (this.field_B))) {
          return false;
        }
        if (!this.a(10000536, (je) (this.field_C))) {
          return false;
        }
        if (param0 == 40) {
          return true;
        }
        return false;
    }

    public final void a(int param0) {
        ((ge) (this.field_N.a((byte) 56))).a(false);
        int var2 = -120 % ((param0 - 63) / 60);
    }

    final static void a(String param0, String param1, int param2) {
        try {
          if (null != ei.field_G) {
            ei.field_G.o(3);
          }
          af.field_r = new la(param1, param0, false, true, true);
          if (param2 <= 30) {
            mj.l(116);
          }
          sf.field_f.b(af.field_r, 23143);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "mj.RA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        int var7 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = stellarshard.field_B;
        try {
          var3_int = -53 / ((25 - param0) / 47);
          if (param2 == null) {
            return false;
          }
          var4 = param2.length();
          if (var4 >= 1 &&
            var4 <= 12) {
            var5 = nh.a(param2, false);
            if (var5 == null) {
              return false;
            }
            if (var5.length() < 1) {
              return false;
            }
            if (!sk.a(var5.charAt(0), -107) &&
              !sk.a(var5.charAt(var5.length() - 1), -114)) {
              var6 = 0;
              for (var7 = 0; param2.length() > var7; var7++) {
                var8 = param2.charAt(var7);
                if (sk.a((char) var8, -112)) {
                  var6++;
                } else {
                  var6 = 0;
                }
                if (var6 >= 2 &&
                  !param1) {
                  return false;
                }
              }
              if (var6 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("mj.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    private final int a(int param0, rj param1, int param2, byte param3, String param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -113) {
            this.field_I = (ig) null;
          }
          stackIn_3_0 = this.a(param4, param2, param5, param1, param0, 35, -2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("mj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, rg param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = stellarshard.field_B;
        try {
          if (param1 != -2) {
            mj.l(-50);
          }
          if (param0 == 0) {
            sf.a("terms.ws", 12);
            return;
          }
          if (param0 == 1) {
            sf.a("privacy.ws", param1 + 14);
            return;
          }
          if (param0 != 2) {
            return;
          }
          sf.a("conduct.ws", 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("mj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    private final String k(int param0) {
        if (param0 != 120) {
          mj.l(51);
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_5_0 = this.a(param3, -8666);
            return stackIn_5_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_9_0 = this.a(param3, (byte) 123);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("mj.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final int a(int param0, String param1, rj param2, int param3, int param4) {
        kg var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -31909) {
            this.field_M = (rg) null;
          }
          var6 = new kg(20, param3, 120 + param4, 25, param2, false, 120, 3, si.field_V, 16777215, param1);
          this.b(param0 ^ -31905, var6);
          stackIn_3_0 = var6.field_t;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_6_0 = var6_ref;
          stackIn_6_1 = new StringBuilder().append("mj.D(").append(param0).append(',');
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
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, int param1, rj param2, String param3, int param4) {
        RuntimeException var6 = null;
        ii var7 = null;
        kg var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new kg(20, param1, 120 + param4, 25, param2, false, 120, 3, si.field_V, 16777215, param3);
          if (param0 != -17073) {
            this.field_O = (ul) null;
          }
          this.b(4, var8);
          var7 = new ii(((je) ((Object) param2)).a((byte) 38));
          this.b(4, var7);
          var7.b(15, var8.field_p + var8.field_w + 3, var8.field_k + (var8.field_t - 15 >> 1), 15, 23987);
          stackIn_3_0 = var8.field_t;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("mj.H(").append(param0).append(',').append(param1).append(',');
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
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    public mj() {
        super(0, 0, 496, 0, (uk) null);
        this.field_N = new pl("", (lf) null, 12);
        this.field_H = new pl("", (lf) null, 100);
        this.field_K = new pl("", (lf) null, 100);
        this.field_G = new pl("", (lf) null, 20);
        this.field_B = new pl("", (lf) null, 20);
        this.field_C = new pl("", (lf) null, 3);
        int var1 = 1;
        this.field_D = new nd("", (lf) null, var1 != 0);
        this.field_I = new ig(ta.field_k, (lf) null);
        this.field_J = new ig(bc.field_h, (lf) null);
        this.field_N.field_x = fc.field_d;
        this.field_H.field_x = fk.field_r;
        this.field_K.field_x = ib.field_m;
        this.field_G.field_x = wg.field_d;
        this.field_B.field_x = bi.field_t;
        this.field_C.field_x = si.field_B;
        this.field_D.field_x = ci.field_c;
        this.field_N.a((byte) -2, new ge(this.field_N));
        this.field_H.a((byte) -2, new qb(this.field_H));
        this.field_K.a((byte) -2, new ef(this.field_K, this.field_H));
        this.field_G.a((byte) -2, new lc(this.field_G, this.field_N, this.field_H));
        this.field_B.a((byte) -2, new ea(this.field_B, this.field_G));
        this.field_C.a((byte) -2, new kk(this.field_C));
        this.field_I.field_E = false;
        this.field_I.field_u = (uk) ((Object) new b());
        this.field_J.field_u = (uk) ((Object) new ll());
        this.field_N.field_u = (uk) ((Object) new vg(10000536));
        vg dupTemp$0 = new vg(10000536);
        this.field_K.field_u = (uk) ((Object) dupTemp$0);
        this.field_H.field_u = (uk) ((Object) dupTemp$0);
        this.field_C.field_u = (uk) ((Object) new vg(10000536));
        this.field_D.field_u = (uk) ((Object) new kf());
        il dupTemp$1 = new il(10000536);
        this.field_B.field_u = (uk) ((Object) dupTemp$1);
        this.field_G.field_u = (uk) ((Object) dupTemp$1);
        String var2 = h.a(hk.field_v, 0, new String[]{this.k(120), this.e((byte) 100)});
        int var3 = 20;
        var3 = var3 + this.a(-31909, t.field_b, this.field_H, var3, 170);
        var3 = var3 + (this.a("", var3, ca.field_a, this.field_K, 170, 20, -2) + 5);
        var3 = var3 + this.a(-31909, th.field_b, this.field_G, var3, 170);
        var3 = var3 + (this.a(170, this.field_B, var3, (byte) -113, u.field_l, ta.field_l) + 5);
        var3 = var3 + (5 + this.a(170, this.field_N, var3, (byte) -113, nk.field_h, si.field_I));
        var3 = var3 + this.a(-17073, var3, this.field_C, vd.field_c, 170);
        kg var4 = new kg(46, var3, this.field_p - 90, 25, this.field_D, true, this.field_p - 120, 5, de.field_c, 11579568, nf.field_o);
        this.b(4, var4);
        var3 = var3 + var4.field_t;
        id var5 = new id(si.field_V, 0, 0, 0, 0, 16777215, -1, 0, 0, si.field_V.field_N, -1, 2147483647, true);
        this.field_M = new rg(var2, var5);
        this.field_M.field_x = "";
        this.field_M.a(ni.field_b, 0, 1);
        this.field_M.a(ni.field_b, 1, 1);
        this.field_M.field_v = (lf) (this);
        this.field_M.b(this.field_p - 90, (byte) -11, 46, var3);
        var3 = var3 + (this.field_M.field_t + 15);
        this.b(4, this.field_M);
        int var6 = 4;
        int var7 = 200;
        this.field_I.b(var7, -var7 + 496 >> 1, var3, 40, 23987);
        this.field_J.b(60, 3 + var6, 15 + var3, 40, 23987);
        this.field_J.field_v = (lf) (this);
        this.field_I.field_v = (lf) (this);
        this.b(4, this.field_I);
        this.b(4, this.field_J);
        this.field_O = new ul((rf) (this));
        this.field_O.b(-60 - this.field_N.field_p - this.field_N.field_w + this.field_p, 60 + this.field_N.field_w + this.field_N.field_p, 20 + this.field_N.field_k, 150, 23987);
        this.b(4, this.field_O);
        this.b(496, 0, 0, var3 - (-55 - var6), 23987);
    }

    private final int a(String param0, int param1, String param2, rj param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        cd var9 = null;
        kg var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new kg(20, param1, param4 + 120, 25, param3, false, 120, 3, si.field_V, 16777215, param2);
          this.b(param6 ^ -6, var10);
          if (param6 != -2) {
            this.field_G = (pl) null;
          }
          var9 = new cd(((je) ((Object) param3)).a((byte) 105), param0, 126, param1 + var10.field_t, 50 + param4, param5);
          var9.field_v = (lf) (this);
          this.b(param6 ^ -6, var9);
          stackIn_3_0 = var9.field_t + var10.field_t;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("mj.OA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
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
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean j(int param0) {
        if (!this.h(40)) {
          return false;
        }
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.field_C.field_m);
        } catch (NumberFormatException numberFormatException) {
        }
        if (param0 == 5255) {
          return wd.a(var2, this.field_D.field_z, 5, this.field_H.field_m, this.field_G.field_m, this.field_N.field_m, this);
        }
        rj var4 = (rj) null;
        this.a(-3, false, -41, (rj) null);
        return wd.a(var2, this.field_D.field_z, 5, this.field_H.field_m, this.field_G.field_m, this.field_N.field_m, this);
    }

    private final boolean a(int param0, je param1) {
        w var3 = null;
        RuntimeException var3_ref = null;
        cg var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 10000536) {
            this.field_N = (pl) null;
          }
          var3 = param1.a((byte) 43);
          if (var3 == null) {
            return true;
          }
          var4 = var3.b(-28036);
          if (qj.field_c == var4) {
            return false;
          }
          if (var4 == eh.field_c) {
            return false;
          }
          if (var4 != sf.field_a) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("mj.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void l(int param0) {
        field_E = null;
        if (param0 != 120) {
          String var2 = (String) null;
          mj.a((String) null, (String) null, 64);
        }
    }

    final void a(int param0, boolean param1, int param2, rj param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_I.field_E = this.h(40);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "mj.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final String e(byte param0) {
        if (param0 >= 87) {
          return "</col></u>";
        }
        rj var3 = (rj) null;
        int discarded$0 = this.a(-39, (String) null, (rj) null, 36, -97);
        return "</col></u>";
    }

    static {
    }
}
