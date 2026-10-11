/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends hn implements fp, ng, ba {
    static m field_D;
    vp field_M;
    private rb field_C;
    private gp field_K;
    private gp field_E;
    private gp field_G;
    private gp field_B;
    private lg field_J;
    private ok field_F;
    private gp field_L;
    private gp field_I;
    static t field_H;
    private lg field_N;

    public final void a(byte param0, String param1) {
        gp var3 = null;
        String var4 = null;
        try {
          if (param0 != 21) {
            this.field_I = (gp) null;
          }
          var3 = this.field_E;
          var4 = param1;
          ((tk) ((Object) var3)).a(false, var4, true);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ki.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(int param0, wg param1) {
        sk var3 = null;
        RuntimeException var3_ref = null;
        cd var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            this.field_J = (lg) null;
          }
          var3 = param1.a(-10116);
          if (var3 == null) {
            return true;
          }
          var4 = var3.a((byte) -86);
          if (var4 == so.field_u) {
            return false;
          }
          if (var4 == q.field_a) {
            return false;
          }
          if (var4 != df.field_r) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ki.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public final void a(byte param0) {
        if (param0 > 89) {
          ((il) (this.field_E.a(-10116))).e(-40);
          return;
        }
        gm var3 = (gm) null;
        this.a(119, (gm) null, '\f', -86);
        ((il) (this.field_E.a(-10116))).e(-40);
    }

    private final String j(int param0) {
        if (param0 <= -64) {
          return "<u=2164A2><col=2164A2>";
        }
        String var3 = (String) null;
        int discarded$0 = this.a((String) null, 86, -114, (gm) null, (String) null, true);
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(byte param0, int param1, int param2, rb param3) {
        int discarded$0 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var7 = null;
        var6 = Torquing.field_u;
        try {
          if (0 == param2) {
            d.a("terms.ws", (byte) 31);
          } else {
            if (1 != param2) {
              if (param2 == 2) {
                d.a("conduct.ws", (byte) 31);
              }
            } else {
              d.a("privacy.ws", (byte) 31);
            }
          }
          if (param0 >= 106) {
            return;
          }
          var7 = (String) null;
          discarded$0 = this.a((String) null, -82, -103, (gm) null, (String) null, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ki.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final int a(String param0, int param1, int param2, gm param3, String param4, boolean param5) {
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
          if (!param5) {
            this.field_K = (gp) null;
          }
          stackIn_3_0 = this.a(param3, param1, (byte) -63, param4, param2, param0, 35);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ki.OA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean h(int param0) {
        if (param0 != 19545) {
          return true;
        }
        if (!this.a(param0 ^ -19546, this.field_E)) {
          return false;
        }
        if (!this.a(-1, this.field_K)) {
          return false;
        }
        if (!this.a(-1, this.field_G)) {
          return false;
        }
        if (!this.a(-1, this.field_B)) {
          return false;
        }
        if (!this.a(-1, this.field_L)) {
          return false;
        }
        if (this.a(-1, this.field_I)) {
          return true;
        }
        return false;
    }

    public ki() {
        super(0, 0, 496, 0, (el) null);
        this.field_E = new gp("", (ca) null, 12);
        this.field_K = new gp("", (ca) null, 100);
        this.field_G = new gp("", (ca) null, 100);
        this.field_B = new gp("", (ca) null, 20);
        this.field_L = new gp("", (ca) null, 20);
        this.field_I = new gp("", (ca) null, 3);
        int var1 = 1;
        this.field_F = new ok("", (ca) null, var1 != 0);
        this.field_J = new lg(bq.field_a, (ca) null);
        this.field_N = new lg(cm.field_k, (ca) null);
        this.field_E.field_n = ag.field_d;
        this.field_K.field_n = o.field_c;
        this.field_G.field_n = pf.field_j;
        this.field_B.field_n = oi.field_a;
        this.field_L.field_n = ud.field_j;
        this.field_I.field_n = df.field_p;
        this.field_F.field_n = l.field_b;
        this.field_E.a(new il(this.field_E), 112);
        this.field_K.a(new tn(this.field_K), 99);
        this.field_G.a(new ad(this.field_G, this.field_K), 110);
        this.field_B.a(new ij(this.field_B, this.field_E, this.field_K), 126);
        this.field_L.a(new um(this.field_L, this.field_B), 86);
        this.field_I.a(new ab(this.field_I), 76);
        this.field_J.field_x = false;
        this.field_J.field_q = (el) ((Object) new rf());
        this.field_N.field_q = (el) ((Object) new je());
        this.field_E.field_q = (el) ((Object) new ig(10000536));
        ig dupTemp$0 = new ig(10000536);
        this.field_G.field_q = (el) ((Object) dupTemp$0);
        this.field_K.field_q = (el) ((Object) dupTemp$0);
        this.field_I.field_q = (el) ((Object) new ig(10000536));
        this.field_F.field_q = (el) ((Object) new kb());
        io dupTemp$1 = new io(10000536);
        this.field_L.field_q = (el) ((Object) dupTemp$1);
        this.field_B.field_q = (el) ((Object) dupTemp$1);
        String var2 = ff.a(new String[]{this.j(-94), this.k(-128)}, 0, km.field_a);
        int var3 = 20;
        var3 = var3 + this.a((byte) 106, a.field_b, 170, (gm) (this.field_K), var3);
        var3 = var3 + (this.a(this.field_G, var3, (byte) -63, qn.field_E, 170, "", 20) + 5);
        var3 = var3 + this.a((byte) 115, hm.field_v, 170, (gm) (this.field_B), var3);
        var3 = var3 + (this.a(ug.field_a, var3, 170, this.field_L, bj.field_K, true) + 5);
        var3 = var3 + (5 + this.a(de.field_b, var3, 170, this.field_E, ad.field_l, true));
        var3 = var3 + this.a(170, ta.field_m, var3, this.field_I, 3);
        na var4 = new na(46, var3, -90 + this.field_p, 25, this.field_F, true, -120 + this.field_p, 5, sp.field_R, 11579568, ce.field_a);
        this.a(var4, -6938);
        var3 = var3 + var4.field_o;
        pc var5 = new pc(dg.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, dg.field_e.field_x, -1, 2147483647, true);
        this.field_C = new rb(var2, var5);
        this.field_C.field_n = "";
        this.field_C.a(0, (byte) -100, jp.field_e);
        this.field_C.a(1, (byte) -91, jp.field_e);
        this.field_C.field_t = (ca) (this);
        this.field_C.a((byte) 46, 46, -90 + this.field_p, var3);
        var3 = var3 + (this.field_C.field_o + 15);
        this.a(this.field_C, -6938);
        int var6 = 4;
        int var7 = 200;
        this.field_J.a((byte) 123, 496 - var7 >> 1, var3, 40, var7);
        this.field_N.a((byte) -11, 3 + var6, var3 + 15, 40, 60);
        this.field_N.field_t = (ca) (this);
        this.field_J.field_t = (ca) (this);
        this.a(this.field_J, -6938);
        this.a(this.field_N, -6938);
        this.field_M = new vp((ba) (this));
        this.field_M.a((byte) 123, 60 + (this.field_E.field_p + this.field_E.field_w), 20 + this.field_E.field_k, 150, -this.field_E.field_w + (this.field_p - this.field_E.field_p) - 60);
        this.a(this.field_M, -6938);
        this.a((byte) 125, 0, 0, var3 - (-55 - var6), 496);
    }

    private final boolean l(int param0) {
        if (!this.h(19545)) {
          return false;
        }
        int var2 = param0;
        try {
          var2 = Integer.parseInt(this.field_I.field_m);
        } catch (NumberFormatException numberFormatException) {
        }
        return vf.a(this, this.field_B.field_m, var2, this.field_F.field_A, param0 ^ -7014, this.field_K.field_m, this.field_E.field_m);
    }

    private final int a(int param0, String param1, int param2, gm param3, int param4) {
        RuntimeException var6 = null;
        ub var7 = null;
        int var8 = 0;
        na var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new na(20, param2, param0 + 120, 25, param3, false, 120, 3, dg.field_e, 16777215, param1);
          this.a(var9, -6938);
          var7 = new ub(((wg) ((Object) param3)).a(-10116));
          var8 = -12 % ((param4 - 62) / 48);
          this.a(var7, -6938);
          var7.a((byte) 123, 3 + var9.field_w + var9.field_p, (var9.field_o - 15 >> 1) + var9.field_k, 15, 15);
          stackIn_1_0 = var9.field_o;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("ki.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(String param0, String param1, int param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        StringBuilder var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Torquing.field_u;
        try {
          var4_int = param3.length();
          var5 = param0.length();
          var6 = param1.length();
          if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          var9 = 78 % ((-33 - param2) / 49);
          var8 = -var5 + var6;
          if (var8 != 0) {
            var10_int = 0;
            while (true) {
              var10_int = param3.indexOf(param0, var10_int);
              if (var10_int < 0) {
                break;
              }
              var10_int = var10_int + var5;
              var7 = var7 + var8;
            }
          }
          var10 = new StringBuilder(var7);
          var11 = 0;
          while (true) {
            var12 = param3.indexOf(param0, var11);
            if (var12 < 0) {
              discarded$0 = var10.append(param3.substring(var11));
              stackIn_12_0 = var10.toString();
              return stackIn_12_0;
            }
            discarded$1 = var10.append(param3.substring(var11, var12));
            var11 = var12 + var5;
            discarded$2 = var10.append(param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ki.RA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public static void m(int param0) {
        if (param0 != 0) {
          return;
        }
        field_D = null;
        field_H = null;
    }

    final static String i(int param0) {
        if (bh.field_a == mg.field_b) {
          return rf.field_u;
        }
        if (kh.field_o == mg.field_b) {
          return on.field_b;
        }
        if (param0 != 20) {
          field_D = (m) null;
          if (qk.field_q.c(param0 ^ 496)) {
            return eo.field_a;
          }
          return on.field_b;
        }
        if (qk.field_q.c(param0 ^ 496)) {
          return eo.field_a;
        }
        return on.field_b;
    }

    final boolean a(int param0, gm param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, -100)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_7_0 = this.a((byte) -107, param1);
            return stackIn_7_0;
          }
          var5_int = -121 % ((param3 + 33) / 57);
          if (param0 != 99) {
            return false;
          }
          stackIn_11_0 = this.b(param1, -9928);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ki.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, gm param1, int param2, int param3) {
        try {
          int var5_int = -8 % ((-28 - param0) / 43);
          super.a(-84, param1, param2, param3);
          this.field_J.field_x = this.h(19545);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ki.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final String k(int param0) {
        if (param0 > -124) {
          return (String) null;
        }
        return "</col></u>";
    }

    private final int a(gm param0, int param1, byte param2, String param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        bj var9 = null;
        na var10 = null;
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
          var10 = new na(20, param1, param4 + 120, 25, param0, false, 120, 3, dg.field_e, 16777215, param3);
          this.a(var10, -6938);
          if (param2 != -63) {
            stackIn_2_0 = -56;
            return stackIn_2_0;
          }
          var9 = new bj(((wg) ((Object) param0)).a(-10116), param5, 126, var10.field_o + param1, param4 + 50, param6);
          var9.field_t = (ca) (this);
          this.a(var9, -6938);
          stackIn_4_0 = var9.field_o + var10.field_o;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("ki.SA(");
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
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    private final int a(byte param0, String param1, int param2, gm param3, int param4) {
        na var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new na(20, param4, param2 + 120, 25, param3, false, 120, 3, dg.field_e, 16777215, param1);
          if (param0 <= 102) {
            stackIn_2_0 = 58;
            return stackIn_2_0;
          }
          this.a(var6, -6938);
          stackIn_4_0 = var6.field_o;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("ki.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        boolean discarded$2 = false;
        int discarded$3 = 0;
        RuntimeException var6 = null;
        String var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != this.field_N) {
            if (param1 == this.field_J) {
              discarded$2 = this.l(-1);
            }
          } else {
            of.b((byte) 105);
          }
          if (param0 < -85) {
            return;
          }
          var7 = (String) null;
          discarded$3 = this.a((String) null, 31, 19, (gm) null, (String) null, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("ki.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_D = null;
    }
}
