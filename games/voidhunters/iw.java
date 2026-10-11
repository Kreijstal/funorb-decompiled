/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class iw extends bl {
    static String[] field_F;
    private int field_H;
    private int field_I;
    private int field_B;
    private int field_C;
    private int field_E;
    static String field_D;
    private int field_G;

    void d(int param0) {
        if (param0 != 15435) {
          iw.k((byte) -22);
        }
    }

    void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = VoidHunters.field_G;
        dma.c(6 + param2, param0 + 35, this.field_h - 12, -40 + this.field_f, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        while (var7 < var4) {
          if (dma.field_c <= var8 &&
            var8 < dma.field_f) {
            var9 = var5 + (-var5 + var6) * var7 / var4;
            var10 = 0;
            var11 = this.field_h;
            if (20 >= var7) {
              while (var10 <= 20) {
                var12 = (20 - var10) * (-var10 + 20) + (20 - var7) * (20 - var7);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (462 - var12) * var9 / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  dma.field_i[var10 + (var8 * dma.field_g + param2)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = (20 - var7) * (20 - var7) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 < 420) {
                    var12Lifetime1 = var11 + 1;
                  } else {
                    var15 = var9 * (462 - var14) / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    dma.field_i[dma.field_g * var8 + param2 + var11] = var15;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            dma.h(var10 + param2, var8, var11 - var10, var9);
          }
          var8++;
          var7++;
        }
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var6Lifetime1 = 169;
        var7Lifetime1 = 0;
        var8Lifetime1 = param0 + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + (var6Lifetime1 - var5Lifetime1) * var7Lifetime1 / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          dma.h(param2, var8Lifetime1, 6, var9Lifetime1);
          dma.h(-6 + (param2 + this.field_h), var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        wf.field_a.a(-90 + this.field_h + param2, 10 + param0);
        eg.a(param1 ^ 1630174240, 35 + param0, vsa.field_p, 5 + param2, this.field_h - 10);
        if (param1 != 1630174241) {
          this.a(59);
        }
        eg.a(1, this.field_f + param0 - 22, oqa.field_q, param2, this.field_h);
        var5Lifetime2 = 169;
        var6Lifetime2 = 127;
        var4Lifetime2 = -79 + this.field_f;
        var7Lifetime2 = 0;
        var8Lifetime2 = param0 + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var7Lifetime2 * (-var5Lifetime2 + var6Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          dma.h(param2, var8Lifetime2, 6, var9Lifetime2);
          dma.h(-6 + this.field_h + param2, var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    iw(ida param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_H = 0;
        this.field_G = 0;
    }

    public static void f(int param0) {
        field_F = null;
        field_D = null;
        if (param0 != -27545) {
          iw.f(28);
        }
    }

    boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != 248) {
          return false;
        }
        if (this.field_G <= 0) {
        } else {
          var2 = this.field_I;
          var3 = this.field_C;
          fieldTemp$0 = this.field_H + 1;
          this.field_H = this.field_H + 1;
          if (this.field_G <= fieldTemp$0) {
            this.field_G = 0;
            this.d(param0 + 15187);
          } else {
            var4 = (-this.field_H + this.field_G * 2) * this.field_H;
            var5 = this.field_G * this.field_G;
            var3 = this.field_B + (this.field_C - this.field_B) * var4 / var5;
            var2 = this.field_E + (-this.field_E + this.field_I) * var4 / var5;
          }
          this.c(var2, -1860440319, var3);
        }
        return super.a(248);
    }

    final static void k(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        fa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        faa var14 = null;
        int[][] var18 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = VoidHunters.field_G;
        try {
          var14 = qga.field_b;
          var2 = var14.e((byte) -87);
          var3 = (fa) (gm.field_H.d(param0 + 38));
          while (var3 != null) {
            if (~var3.field_f != ~var2) {
              var3 = (fa) (gm.field_H.a((byte) 95));
              continue;
            }
            break;
          }
          if (var3 == null) {
            ifb.l(-117);
            return;
          }
          if (param0 != -38) {
            field_D = (String) null;
          }
          var4 = var14.e((byte) -118);
          if (var4 != 0) {
            tsb.field_o[0] = kca.field_a;
            var5 = var3.field_g;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              tsb.field_o[var6_int] = var14.a(param0 + 37);
            }
            eja.a(var5, var4, 0);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              bb.a(var14, true);
              if (var6_intLifetime1 != 0) {
                ujb.a(wl.field_q, qfb.field_o, vga.field_d, 13336, var6_intLifetime1, jv.field_b);
              } else {
                ujb.a(wl.field_q, qfb.field_o, vga.field_d, 13336, var6_intLifetime1, jv.field_b);
              }
            }
            qea.a((byte) -29, var5);
            var6 = new String[2][var5];
            var18 = new int[2][var5 * 4];
            var8 = bea.field_e;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = sv.field_f[var9];
              var6[0][var10] = tsb.field_o[var11];
              var18[0][var10 * 4] = fmb.field_o[var11];
              var18[0][var10 * 4 + 1] = emb.field_o[var11];
              var18[0][2 + var10 * 4] = hma.field_d[var11];
              var18[0][3 + 4 * var10] = fv.field_o[var11];
              if (qja.a((byte) -75, tsb.field_o[var11]) &&
                0 == emb.field_o[var11] + hma.field_d[var11] + fv.field_o[var11]) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = sv.field_f[var5 + var9Lifetime1];
              var6[1][var13] = tsb.field_o[var11Lifetime1];
              var18[1][var13 * 4] = fmb.field_o[var11Lifetime1];
              var18[1][1 + var13 * 4] = emb.field_o[var11Lifetime1];
              var18[1][var13 * 4 + 2] = hma.field_d[var11Lifetime1];
              var18[1][3 + var13 * 4] = fv.field_o[var11Lifetime1];
              if (qja.a((byte) -75, tsb.field_o[var11Lifetime1]) &&
                0 == fv.field_o[var11Lifetime1] + (hma.field_d[var11Lifetime1] + emb.field_o[var11Lifetime1])) {
                var6[1][var13] = null;
                var13--;
              }
              var13++;
              var9Lifetime1++;
            }
            var3.b(-3846);
            return;
          }
          var3.b(-3846);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "iw.MA(" + param0 + ')');
        }
    }

    final void c(int param0, int param1, int param2, int param3) {
        if (param3 <= 0) {
          this.c(param1, -1860440319, param2);
          return;
        }
        this.field_I = param1;
        this.field_C = param2;
        this.field_H = 0;
        if (param0 <= 71) {
          this.c(-109, 54, 31, -22);
        }
        this.field_G = param3;
        this.field_E = this.field_h;
        this.field_B = this.field_f;
    }

    boolean j(byte param0) {
        if (param0 != 55) {
          this.field_C = -52;
        }
        this.e(-10331);
        return super.j((byte) 55);
    }

    void e(int param0) {
        if (this.field_G <= 0) {
          return;
        }
        this.c(this.field_I, param0 ^ 1860450468, this.field_C);
        this.field_G = 0;
        this.d(param0 + 25766);
        if (param0 != -10331) {
          iw.k((byte) 34);
        }
    }

    static {
        field_F = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_D = "m";
    }
}
