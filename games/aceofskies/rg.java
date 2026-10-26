/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rg extends gm {
    private int field_B;
    private int field_H;
    private int field_I;
    static nf field_A;
    private int field_E;
    static String field_C;
    private int field_G;
    private int field_D;
    static ll[] field_F;

    void a(boolean param0, int param1, int param2) {
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
        var16 = AceOfSkies.obfuscationControl ? 1 : 0;
        vp.c(param1 + 6, param2 + 35, -12 + this.field_q, this.field_n - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        if (param0) {
          return;
        }
        var7 = 0;
        var8 = param2;
        while (var4 > var7) {
          if (vp.field_f <= var8 &&
            var8 < vp.field_d) {
            var9 = var5 + (var6 - var5) * var7 / var4;
            var10 = 0;
            var11 = this.field_q;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (-var10 + 20) * (20 - var10) + (20 - var7) * (20 - var7);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (462 - var12) * var9 / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  vp.field_j[var10 + param1 + var8 * vp.field_i] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = var13Lifetime1 * var13Lifetime1 + (20 - var7) * (20 - var7);
                if (var14 <= 462) {
                  if (var14 < 420) {
                    var12Lifetime1 = 1 + var11;
                  } else {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    vp.field_j[var8 * vp.field_i + param1 + var11] = var15;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            vp.b(param1 + var10, var8, -var10 + var11, var9);
          }
          var8++;
          var7++;
        }
        var5Lifetime1 = 194;
        var6Lifetime1 = 169;
        var4Lifetime1 = 22;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param2;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = (var6Lifetime1 - var5Lifetime1) * var7Lifetime1 / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          vp.b(param1, var8Lifetime1, 6, var9Lifetime1);
          vp.b(this.field_q + param1 - 6, var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        eo.field_b.b(-90 + (param1 + this.field_q), param2 + 10);
        cf.a(ArchiveProvider.field_c, param1 + 5, (byte) -121, 35 + param2, this.field_q - 10);
        cf.a(uc.field_k, param1, (byte) -114, this.field_n + param2 - 22, this.field_q);
        var4Lifetime2 = this.field_n - 79;
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var7Lifetime2 = 0;
        var8Lifetime2 = param2 + 57;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = var7Lifetime2 * (var6Lifetime2 - var5Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          vp.b(param1, var8Lifetime2, 6, var9Lifetime2);
          vp.b(-6 + this.field_q + param1, var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
        return;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 <= 0) {
          this.a(param2, (byte) 29, param1);
          return;
        }
        this.field_G = this.field_n;
        this.field_H = param1;
        this.field_D = 0;
        this.field_E = this.field_q;
        int var5 = 28 / ((param0 - 21) / 32);
        this.field_I = param3;
        this.field_B = param2;
    }

    void e(byte param0) {
        if (this.field_I <= 0) {
          return;
        }
        this.a(this.field_B, (byte) 29, this.field_H);
        this.field_I = 0;
        this.f((byte) -89);
        if (param0 < 26) {
          this.e((byte) 41);
        }
    }

    boolean i(int param0) {
        int var2 = -13 % ((param0 - 20) / 62);
        this.e((byte) 36);
        return super.i(112);
    }

    final static void a(int param0, boolean param1, SoundPlayback param2, int param3) {
        if (param2 == null) {
          return;
        }
        try {
          param2.b(-2580, param0);
          param2.a(-128, param3);
          if (param1) {
            SoundPlayback var5 = (SoundPlayback) null;
            rg.a(53, false, (SoundPlayback) null, -102);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "rg.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
          field_A = (nf) null;
        }
        field_F = null;
        field_A = null;
        field_C = null;
    }

    void f(byte param0) {
        if (param0 > -28) {
          rg.d(true);
        }
    }

    boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != 11) {
          this.a(1, 39, 77, -45);
        }
        if (this.field_I <= 0) {
        } else {
          var2 = this.field_B;
          var3 = this.field_H;
          fieldTemp$0 = this.field_D + 1;
          this.field_D = this.field_D + 1;
          if (fieldTemp$0 >= this.field_I) {
            this.field_I = 0;
            this.f((byte) -85);
          } else {
            var4 = (2 * this.field_I - this.field_D) * this.field_D;
            var5 = this.field_I * this.field_I;
            var2 = var4 * (-this.field_E + this.field_B) / var5 + this.field_E;
            var3 = (-this.field_G + this.field_H) * var4 / var5 + this.field_G;
          }
          this.a(var2, (byte) 29, var3);
        }
        return super.h(param0 + 0);
    }

    rg(lt param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_I = 0;
        this.field_D = 0;
    }

    static {
        field_C = "menu_select";
        field_A = new nf();
    }
}
