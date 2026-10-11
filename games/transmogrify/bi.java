/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi extends mk {
    static volatile boolean field_M;
    private int field_N;
    private int field_F;
    static int field_J;
    private int field_K;
    static int field_L;
    private int field_I;
    static String field_O;
    private int field_H;
    private int field_G;

    void p(int param0) {
        if (this.field_G <= 0) {
          return;
        }
        this.a(this.field_H, this.field_N, false);
        this.field_G = 0;
        if (param0 != 27830) {
          return;
        }
        this.d((byte) -2);
    }

    boolean m(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 >= this.field_G) {
        } else {
          var2 = this.field_H;
          var3 = this.field_N;
          fieldTemp$0 = this.field_F + 1;
          this.field_F = this.field_F + 1;
          if (fieldTemp$0 >= this.field_G) {
            this.field_G = 0;
            this.d((byte) -2);
          } else {
            var4 = this.field_F * (this.field_G * 2 - this.field_F);
            var5 = this.field_G * this.field_G;
            var3 = this.field_I + (this.field_N - this.field_I) * var4 / var5;
            var2 = var4 * (this.field_H - this.field_K) / var5 + this.field_K;
          }
          this.a(var2, var3, false);
        }
        return super.m(0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 <= param0) {
          this.a(param1, param2, false);
          return;
        }
        this.field_I = this.field_h;
        this.field_K = this.field_l;
        this.field_G = param3;
        this.field_H = param1;
        this.field_F = 0;
        this.field_N = param2;
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
        var16 = Transmogrify.field_A ? 1 : 0;
        sb.d(param2 + 6, 35 + param0, -12 + this.field_l, this.field_h - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        while (var7 < var4) {
          if (var8 >= sb.field_e &&
            sb.field_f > var8) {
            var9 = var5 + var7 * (var6 - var5) / var4;
            var10 = 0;
            var11 = this.field_l;
            if (20 >= var7) {
              while (var10 <= 20) {
                var12 = (-var7 + 20) * (-var7 + 20) + (20 - var10) * (20 - var10);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (-var12 + 462) / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  sb.field_h[var8 * sb.field_c + param2 + var10] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = (-var7 + 20) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (462 >= var14) {
                  if (var14 >= 420) {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    sb.field_h[var11 + sb.field_c * var8 + param2] = var15;
                  } else {
                    var12Lifetime1 = var11 + 1;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            sb.d(var10 + param2, var8, -var10 + var11, var9);
          }
          var8++;
          var7++;
        }
        var4Lifetime1 = 22;
        var6Lifetime1 = 169;
        var5Lifetime1 = 194;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param0;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = var7Lifetime1 * (-var5Lifetime1 + var6Lifetime1) / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          sb.d(param2, var8Lifetime1, 6, var9Lifetime1);
          sb.d(this.field_l + (param2 - 6), var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        vf.field_a.c(-90 + (this.field_l + param2), 10 + param0);
        k.a(35 + param0, true, 5 + param2, ua.field_f, -10 + this.field_l);
        k.a(-22 + (this.field_h + param0), true, param2, rh.field_l, this.field_l);
        if (param1 > -79) {
          this.a(64, -46, 111, -124);
        }
        var5Lifetime2 = 169;
        var6Lifetime2 = 127;
        var4Lifetime2 = -79 + this.field_h;
        var7Lifetime2 = 0;
        var8Lifetime2 = param0 + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + (var6Lifetime2 - var5Lifetime2) * var7Lifetime2 / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          sb.d(param2, var8Lifetime2, 6, var9Lifetime2);
          sb.d(-6 + this.field_l + param2, var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    bi(da param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_F = 0;
        this.field_G = 0;
    }

    void d(byte param0) {
        if (param0 != -2) {
          bi.o(-106);
        }
    }

    boolean a(byte param0) {
        this.p(27830);
        if (param0 != -97) {
          this.field_G = 107;
        }
        return super.a((byte) -97);
    }

    public static void o(int param0) {
        field_O = null;
        int var1 = 38 % ((29 - param0) / 45);
    }

    static {
        field_M = true;
        field_O = "Player Name: ";
    }
}
