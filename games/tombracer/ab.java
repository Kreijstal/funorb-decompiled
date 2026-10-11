/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends qra {
    private int field_q;
    private int field_r;
    private int field_v;
    private int field_s;
    private int field_m;
    static String field_w;
    static int[] field_t;
    private cfa field_o;
    private int field_u;
    static sq field_n;
    private fv[][] field_p;

    public static void f(int param0) {
        field_t = null;
        field_w = null;
        if (param0 != 6153) {
          return;
        }
        field_n = null;
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 != 25) {
          return false;
        }
        if (this.field_v != 0 &&
          !this.a(true)) {
          if (param2 != 84 &&
            83 != param2) {
            return false;
          }
          this.i(12721);
          return true;
        }
        return false;
    }

    ab(qh param0, v param1) {
        super(param0, param1);
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        this.field_r = -1;
        this.field_v = 0;
        try {
          this.field_o = this.field_c.field_i;
          this.field_o.field_g = new w();
          var3_int = this.field_o.a(-28958);
          this.field_q = 3;
          this.field_s = 1;
          this.field_p = new fv[this.field_q][this.field_s];
          var4 = 0;
          var5 = aaa.a(false) - this.field_q * 100 + (100 - (this.field_q - 1) * 20);
          var5 = var5 / 2 + 0;
          var6 = -50 + (koa.b(0) + 100) + (-(this.field_s * 100) - 16 * (this.field_s - 1));
          var6 = var6 / 2 + 16;
          for (var7 = 0; var7 < this.field_q; var7++) {
            for (var8 = 0; var8 < this.field_s; var8++) {
              if (var4 >= var3_int) {
                this.field_p[var7][var8] = null;
              } else {
                var9 = var5;
                var10 = var6;
                if (var7 > 0) {
                  var9 = var9 + var7 * 120;
                }
                if (var8 > 0) {
                  var10 = var10 + 116 * var8;
                }
                var11 = 100;
                var9 = var9 - var11 / 2;
                var12 = 100;
                var10 = var10 - var12 / 2;
                this.field_p[var7][var8] = new fv(this, var4, var9, var10, var11, var12);
                var4++;
              }
            }
          }
          this.h(0);
          er.b(1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ab.<init>(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void b(int param0, boolean param1) {
        int var11_int = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        String var11;
        fv var12_ref_fv;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var5Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var16 = TombRacer.field_G ? 1 : 0;
        la.field_j.a(0, 0);
        var3 = 0;
        var4 = this.field_o.g(-1);
        if (!this.field_h.d((byte) 63) &&
          this.field_h.field_x == var4) {
          var3 = 1;
        }
        var5 = 160;
        var6 = aaa.a(false) / 2;
        var7 = koa.b(0) / 2;
        ura.a(-10985);
        var5Lifetime1 = 128;
        if (var4 >= 0) {
          var8 = (aaa.a(false) >> 1) - (gg.field_f.a() >> 1);
          var9 = (koa.b(0) >> 1) - (gg.field_f.c() >> 1);
          gg.field_f.a(var8, var9);
          if (var3 == 0) {
            be.a(gl.$cfr$intArgs$a$53ce4ab4c593(83, cba.field_c, new String[]{this.field_h.j(var4, 9)}).toUpperCase(), 1, eda.field_f, 16777215, 0, 32, 1, 32 + var9, var8, 1, (byte) 60, gg.field_f.a());
          } else {
            be.a(us.field_c.toUpperCase(), 1, eda.field_f, 16777215, 0, 32, 1, var9 + 32, var8, 1, (byte) 60, gg.field_f.a());
            var10 = (-this.field_o.c(-1) + 750) / 50 + 1;
            if (var10 < 0) {
              var10 = 0;
            }
            be.a(gl.$cfr$intArgs$a$53ce4ab4c593(108, tla.field_h, new String[]{Integer.toString(var10)}).toUpperCase(), 1, eda.field_f, 16777215, 0, 32, 1, var9 + 200, var8, 1, (byte) 60, gg.field_f.a());
          }
          for (var10 = 0; this.field_q > var10; var10++) {
            for (var11_int = 0; var11_int < this.field_s; var11_int++) {
              var12_ref_fv = this.field_p[var10][var11_int];
              if (var12_ref_fv != null) {
                if (this.a(true) &&
                  var10 == this.field_u &&
                  var11_int == this.field_m) {
                  tga.field_a.c(fm.a(false, wga.field_a[this.field_h.field_x]), var12_ref_fv.field_g, var12_ref_fv.field_j, var12_ref_fv.field_c, -22971, var12_ref_fv.field_i);
                }
                var12_ref_fv.a(1);
              }
            }
          }
        }
        var17 = 0;
        var8Lifetime1 = var17;
        if (param0 > -50) {
          this.b(-64, false);
        }
        while (this.field_c.field_H.length > var17) {
          var9Lifetime1 = -(this.field_c.field_H.length * var5Lifetime1 / 2) + var6 + var5Lifetime1 * var17;
          var10 = -200 + var7;
          be.a(this.field_h.a(var17, false).toUpperCase(), 1, kn.field_p, wga.field_a[var17], 0, 32, 1, var10, var9Lifetime1, 1, (byte) 60, var5Lifetime1);
          if (!this.field_c.b((byte) 90, var17)) {
            var11 = cs.field_b;
            var12 = 8947848;
          } else {
            var13 = this.field_c.field_H[var17].z(115);
            if (var13 == -1) {
              var14 = this.field_c.field_c.field_b[var17];
              var15 = this.field_o.b((byte) 50);
              if (var14 >= var15) {
                if (var14 != var15) {
                  var12 = 12303291;
                  var11 = g.field_i;
                } else {
                  var12 = 16777215;
                  var11 = bp.field_o;
                }
              } else {
                var11 = cga.field_l;
                var12 = 8947848;
              }
            } else {
              var12 = 16777215;
              var11 = sla.field_b[var13];
            }
          }
          be.a(var11.toUpperCase(), 1, kn.field_p, var12, 0, 32, 1, 32 + var10, var9Lifetime1, 1, (byte) 60, var5Lifetime1);
          var17++;
        }
        se.f((byte) -6);
        this.d(-27142);
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -4) {
            return false;
          }
          if (!ni.field_c) {
            return false;
          }
          if (bta.field_q == 2 &&
            null != mn.field_n) {
            var3 = (CharSequence) ((Object) param0);
            if (mn.field_n.equals(jd.a(1, var3))) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ab.H(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean b(int param0, int param1, byte param2) {
        fv var4;
        if (!this.a(true)) {
          return false;
        }
        if (param1 >= 0 &&
          param0 >= 0 &&
          this.field_q > param1) {
          if (param0 >= this.field_s) {
            return false;
          }
          var4 = this.field_p[param1][param0];
          if (param2 < 78) {
            this.a(32, 41, (byte) 103);
          }
          if (var4 == null) {
            return false;
          }
          if (!this.field_o.a((byte) 119, var4.field_f)) {
            return false;
          }
          this.field_m = param0;
          this.field_u = param1;
          return true;
        }
        return false;
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
          return true;
        }
        return true;
    }

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        jha var5 = null;
        jha var6 = null;
        if (this.field_o.g(-1) == param0) {
          if (param2 == -1) {
            var6 = ab.a(-9, gl.$cfr$intArgs$a$53ce4ab4c593(86, oba.field_n, new String[]{this.field_c.e(param0, 23807)}));
            iqa.field_c.a(0, var6);
            this.field_o.a(param2, (byte) 112);
          } else {
            var4 = this.field_o.a(-108, param2);
            this.field_o.a(param2, (byte) 119);
            this.h(0);
            var5 = ab.a(-58, gl.$cfr$intArgs$a$53ce4ab4c593(125, fva.field_b, new String[]{this.field_c.e(param0, 23807), sla.field_b[var4]}));
            iqa.field_c.a(0, var5);
          }
        }
        if (!param1) {
          ab.a(-52, 79, -8, 36, 97, 39, -99);
        }
    }

    private final void g(int param0) {
        if (this.field_v == 0) {
          return;
        }
        if (qma.field_c &&
          this.a(sta.field_B, 25006, jba.field_j) &&
          hf.field_b == 1) {
          this.i(12721);
        }
        if (this.field_h.g(param0, 2)) {
          this.a(0, -1, (byte) 56);
        }
        if (this.field_h.g(0, 3)) {
          this.a(0, 1, (byte) 80);
        }
        if (this.field_h.g(0, 0)) {
          this.a(-1, 0, (byte) 51);
        }
        if (this.field_h.g(0, 1)) {
          this.a(1, 0, (byte) 73);
        }
        if (this.field_h.g(0, 4)) {
          this.i(12721);
        }
    }

    private final boolean a(boolean param0) {
        boolean stackIn_6_0 = false;
        if (!param0) {
          field_n = (sq) null;
        }
        stackIn_6_0 = (!this.field_h.d((byte) 98)) && (this.field_h.field_x == this.field_o.g(-1));
        return stackIn_6_0;
    }

    private final void i(int param0) {
        if (!this.a(true)) {
          return;
        }
        int var2 = this.field_p[this.field_u][this.field_m].field_f;
        if (!this.field_o.a((byte) 127, var2)) {
          return;
        }
        if (param0 != 12721) {
          return;
        }
        if (null != this.field_f) {
          this.field_f.c(var2, 1);
        } else {
          this.field_o.a(var2, (byte) 102);
        }
    }

    final void a(int param0, boolean param1) {
        if (this.field_r > 0) {
          this.field_r = this.field_r - 1;
          return;
        }
        this.field_o.d((byte) -124);
        if (param1 &&
          this.a(true)) {
          this.g(param0 - 80);
        }
        if (param0 != 80) {
          this.e(-116);
        }
        if (this.field_o.f(param0 ^ -28956)) {
          this.field_r = 100;
        }
        if (param1) {
          this.c(7);
        }
        this.field_v = this.field_v + 1;
        if (this.field_o.g(-1) == this.field_h.field_x &&
          !(this.field_o.c(-1) <= 500) &&
          (750 - this.field_o.c(-1)) % 50 == 0) {
          this.field_o.a((byte) -124);
        }
    }

    private final void h(int param0) {
        this.field_m = param0;
        this.field_u = 0;
    }

    final cfa b(byte param0) {
        int var2 = -72 / ((35 - param0) / 62);
        return this.field_o;
    }

    private final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        fv var6;
        int var7;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param1 != 25006) {
          this.h(-51);
        }
        for (var4 = 0; this.field_q > var4; var4++) {
          for (var5 = 0; this.field_s > var5; var5++) {
            var6 = this.field_p[var4][var5];
            if (var6 != null &&
              var6.a(param0, false, param2)) {
              return this.b(var5, var4, (byte) 122);
            }
          }
        }
        return false;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        boolean stackIn_8_0 = false;
        if (param6 <= 100) {
          field_t = (int[]) null;
        }
        stackIn_8_0 = (param5 <= param1) && (param1 <= param4) && (param3 >= param0) && (param3 <= param2);
        return stackIn_8_0;
    }

    final static jha a(int param0, String param1) {
        RuntimeException var2 = null;
        jha stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -4) {
            ab.f(-54);
          }
          stackIn_3_0 = new jha(1, (String) null, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ab.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var4;
        fv var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        if (!this.a(true)) {
          return;
        }
        var4 = 0;
        if (param2 < 9) {
          this.field_v = 58;
        }
        while (var4 == 0) {
          this.field_m = this.field_m + param1;
          this.field_u = this.field_u + param0;
          if (this.field_m >= 0) {
            if (this.field_s <= this.field_m) {
              this.field_m = 0;
            }
          } else {
            this.field_m = this.field_s - 1;
          }
          if (this.field_u >= 0) {
            if (this.field_u >= this.field_q) {
              this.field_u = 0;
            }
          } else {
            this.field_u = -1 + this.field_q;
          }
          var5 = this.field_p[this.field_u][this.field_m];
          if (var5 == null) {
            var4 = 0;
            continue;
          }
          if (this.field_o.a((byte) -64, var5.field_f)) {
            var4 = 1;
            continue;
          }
          var4 = 0;
        }
    }

    static {
        field_w = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
        field_t = new int[]{135, 230, 520};
    }
}
