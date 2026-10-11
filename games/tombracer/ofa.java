/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ofa extends gn {
    private int field_H;
    private int field_G;
    static boolean field_I;
    private int field_J;
    private int field_K;
    private int field_F;
    private int field_E;
    static String field_D;

    final void a(int param0, int param1, int param2, byte param3) {
        if (param0 <= 0) {
          this.c(-11560, param2, param1);
          return;
        }
        this.field_E = param2;
        this.field_K = param1;
        this.field_F = param0;
        this.field_H = this.field_p;
        this.field_J = this.field_m;
        this.field_G = 0;
        if (param3 > -80) {
          ofa.e(-57);
        }
    }

    ofa(jta param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_G = 0;
        this.field_F = 0;
    }

    boolean a(byte param0) {
        if (param0 >= -53) {
          ofa.e(69);
        }
        this.c(true);
        return super.a((byte) -92);
    }

    void a(int param0, byte param1, int param2) {
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
        var16 = TombRacer.field_G ? 1 : 0;
        bea.b(6 + param2, 35 + param0, this.field_m - 12, this.field_p - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        while (var4 > var7) {
          if (var8 >= bea.field_h &&
            var8 < bea.field_k) {
            var9 = (var6 - var5) * var7 / var4 + var5;
            var10 = 0;
            var11 = this.field_m;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (-var10 + 20) * (-var10 + 20) + (20 - var7) * (20 - var7);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (-var12 + 462) / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  bea.field_l[var10 + param2 + bea.field_g * var8] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (20 >= var13Lifetime1) {
                var14 = var13Lifetime1 * var13Lifetime1 + (-var7 + 20) * (20 - var7);
                if (462 >= var14) {
                  if (var14 < 420) {
                    var12Lifetime1 = 1 + var11;
                  } else {
                    var15 = var9 * (-var14 + 462) / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    bea.field_l[param2 + (var8 * bea.field_g + var11)] = var15;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            bea.c(var10 + param2, var8, -var10 + var11, var9);
          }
          var8++;
          var7++;
        }
        var4Lifetime1 = 22;
        var6Lifetime1 = 169;
        var5Lifetime1 = 194;
        var7Lifetime1 = 0;
        var8Lifetime1 = param0 + 35;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = var7Lifetime1 * (-var5Lifetime1 + var6Lifetime1) / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          bea.c(param2, var8Lifetime1, 6, var9Lifetime1);
          bea.c(param2 + this.field_m - 6, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        if (param1 != -67) {
          return;
        }
        bg.field_s.b(-90 + param2 + this.field_m, 10 + param0);
        ag.a(35 + param0, uca.field_f, -59, param2 + 5, -10 + this.field_m);
        ag.a(param0 + (this.field_p - 22), fua.field_f, param1 - 29, param2, this.field_m);
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var4Lifetime2 = this.field_p - 79;
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param0;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = var7Lifetime2 * (var6Lifetime2 - var5Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          bea.c(param2, var8Lifetime2, 6, var9Lifetime2);
          bea.c(param2 + this.field_m - 6, var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 < 126) {
          this.field_J = 90;
        }
        if (0 >= this.field_F) {
        } else {
          var2 = this.field_K;
          var3 = this.field_E;
          fieldTemp$0 = this.field_G + 1;
          this.field_G = this.field_G + 1;
          if (this.field_F <= fieldTemp$0) {
            this.field_F = 0;
            this.d(-69);
          } else {
            var4 = (-this.field_G + 2 * this.field_F) * this.field_G;
            var5 = this.field_F * this.field_F;
            var3 = this.field_H + (this.field_E - this.field_H) * var4 / var5;
            var2 = this.field_J + (-this.field_J + this.field_K) * var4 / var5;
          }
          this.c(-11560, var3, var2);
        }
        return super.a(127);
    }

    final static void a(int[] param0, long[] param1, int param2) {
        try {
          if (param2 < 31) {
            long[] var4 = (long[]) null;
            ofa.a((int[]) null, (long[]) null, -57);
          }
          hk.a(-1 + param1.length, param1, 0, param0, -2646);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ofa.QA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 != -126) {
          long[] var4 = (long[]) null;
          ofa.a((int[]) null, (long[]) null, -16);
        }
        return (param0 & 384) != 0 ? true : false;
    }

    void c(boolean param0) {
        if (!param0) {
          this.field_G = -30;
        }
        if (this.field_F <= 0) {
          return;
        }
        this.c(-11560, this.field_E, this.field_K);
        this.field_F = 0;
        this.d(-90);
    }

    void d(int param0) {
        if (param0 >= -20) {
          field_D = (String) null;
        }
    }

    public static void e(int param0) {
        field_D = null;
        if (param0 != 0) {
          field_D = (String) null;
        }
    }

    final static boolean d(boolean param0) {
        if (!param0) {
          return false;
        }
        return cl.field_o;
    }

    static {
        field_I = false;
        field_D = null;
    }
}
