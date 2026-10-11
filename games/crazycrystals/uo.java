/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo extends el {
    static int[] field_k;
    static wh field_n;
    private int field_j;
    static int[] field_l;
    static int field_o;
    static int field_m;
    private boolean field_p;
    static dc field_i;

    final void a(boolean param0, int param1, int param2, byte param3, boolean param4, int param5, int param6) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var13Lifetime4;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var12Lifetime5;
        int var13Lifetime5;
        int var14Lifetime5;
        int var12Lifetime1Lifetime1;
        int var12Lifetime2Lifetime1;
        int var13Lifetime1Lifetime1;
        int var13Lifetime2Lifetime1;
        int var13Lifetime3Lifetime1;
        int var14Lifetime1Lifetime1;
        int var14Lifetime2Lifetime1;
        int var14Lifetime3Lifetime1;
        int var13Lifetime2Lifetime2;
        int var14Lifetime2Lifetime2;
        var17 = CrazyCrystals.field_B;
        var8 = kh.field_c;
        var9 = kh.field_b;
        var10 = kh.field_g;
        var11 = kh.field_j;
        if (!param4) {
          kh.d(0, 0, 480, 480);
          this.field_p = true;
          if (param3 > -59) {
            this.a(true, -118, 73, (byte) -80, true, 50, -86);
          }
          for (var12 = 0; var12 < 8; var12++) {
            var13 = -var12 + (-1 + (this.field_j >> 1)) << 1;
            if (var13 >= 0) {
              var14 = (var13 + 16) * param1 >> 4;
              var15 = param1 + (param5 - (var14 >> 2));
              var16 = -(var14 * (-2 + var13 + 16) >> 3) + (param2 + param6);
              if (var16 + (var14 * 3 >> 2) > 0) {
                if (!param4) {
                  this.field_p = false;
                }
                bd.field_n[var12].a(var15, var16, var14 >> 1, var14 * 3 >> 2, 256);
              }
              continue;
            }
            break;
          }
          var12Lifetime5 = param1 * (16 + this.field_j) >> 4;
          var13Lifetime5 = -var12Lifetime5 + (param1 + param5);
          var14Lifetime5 = param2 + param6 - (var12Lifetime5 * (this.field_j + 16) >> 3);
          if (0 < 3 * var12Lifetime5 + var14Lifetime5) {
            if (!param4) {
              this.field_p = false;
            }
            this.field_a.h(-30).b(var13Lifetime5, var14Lifetime5, var12Lifetime5 * 2, var12Lifetime5 * 3, ek.field_f[this.field_a.field_u]);
          }
          kh.d(var8, var9, var10, var11);
          return;
        }
        if (!param4) {
          this.field_p = true;
          if (param3 > -59) {
            this.a(true, -118, 73, (byte) -80, true, 50, -86);
          }
          for (var12Lifetime1 = 0; var12Lifetime1 < 8; var12Lifetime1++) {
            var13Lifetime1 = -var12Lifetime1 + (-1 + (this.field_j >> 1)) << 1;
            if (var13Lifetime1 >= 0) {
              var14Lifetime1 = (var13Lifetime1 + 16) * param1 >> 4;
              var15Lifetime1 = param1 + (param5 - (var14Lifetime1 >> 2));
              var16Lifetime1 = -(var14Lifetime1 * (-2 + var13Lifetime1 + 16) >> 3) + (param2 + param6);
              if (var16Lifetime1 + (var14Lifetime1 * 3 >> 2) > 0) {
                if (!param4) {
                  this.field_p = false;
                }
                bd.field_n[var12Lifetime1].a(var15Lifetime1, var16Lifetime1, var14Lifetime1 >> 1, var14Lifetime1 * 3 >> 2, 256);
              }
              continue;
            }
            break;
          }
          var12Lifetime1Lifetime1 = param1 * (16 + this.field_j) >> 4;
          var13Lifetime1Lifetime1 = -var12Lifetime1Lifetime1 + (param1 + param5);
          var14Lifetime1Lifetime1 = param2 + param6 - (var12Lifetime1Lifetime1 * (this.field_j + 16) >> 3);
          if (0 < 3 * var12Lifetime1Lifetime1 + var14Lifetime1Lifetime1) {
            if (!param4) {
              this.field_p = false;
            }
            this.field_a.h(-30).b(var13Lifetime1Lifetime1, var14Lifetime1Lifetime1, var12Lifetime1Lifetime1 * 2, var12Lifetime1Lifetime1 * 3, ek.field_f[this.field_a.field_u]);
          }
          kh.d(var8, var9, var10, var11);
          return;
        }
        if (param3 <= -59) {
          var12Lifetime2 = 0;
          while (true) {
            if (var12Lifetime2 >= 8) {
              var12Lifetime2 = param1 * (16 + this.field_j) >> 4;
              var13Lifetime2 = -var12Lifetime2 + (param1 + param5);
              var14Lifetime2 = param2 + param6 - (var12Lifetime2 * (this.field_j + 16) >> 3);
              if (0 >= 3 * var12Lifetime2 + var14Lifetime2) {
                kh.d(var8, var9, var10, var11);
                return;
              }
              if (param4) {
                this.field_a.h(-30).b(var13Lifetime2, var14Lifetime2, var12Lifetime2 * 2, var12Lifetime2 * 3, ek.field_f[this.field_a.field_u]);
                kh.d(var8, var9, var10, var11);
                return;
              }
              this.field_p = false;
              this.field_a.h(-30).b(var13Lifetime2, var14Lifetime2, var12Lifetime2 * 2, var12Lifetime2 * 3, ek.field_f[this.field_a.field_u]);
              kh.d(var8, var9, var10, var11);
              return;
            }
            var13Lifetime2Lifetime2 = -var12Lifetime2 + (-1 + (this.field_j >> 1)) << 1;
            if (var13Lifetime2Lifetime2 >= 0) {
              var14Lifetime2Lifetime2 = (var13Lifetime2Lifetime2 + 16) * param1 >> 4;
              var15Lifetime2 = param1 + (param5 - (var14Lifetime2Lifetime2 >> 2));
              var16Lifetime2 = -(var14Lifetime2Lifetime2 * (-2 + var13Lifetime2Lifetime2 + 16) >> 3) + (param2 + param6);
              if (var16Lifetime2 + (var14Lifetime2Lifetime2 * 3 >> 2) > 0) {
                if (!param4) {
                  this.field_p = false;
                }
                bd.field_n[var12Lifetime2].a(var15Lifetime2, var16Lifetime2, var14Lifetime2Lifetime2 >> 1, var14Lifetime2Lifetime2 * 3 >> 2, 256);
              }
              var12Lifetime2++;
              continue;
            }
            break;
          }
          var12Lifetime2Lifetime1 = param1 * (16 + this.field_j) >> 4;
          var13Lifetime2Lifetime1 = -var12Lifetime2Lifetime1 + (param1 + param5);
          var14Lifetime2Lifetime1 = param2 + param6 - (var12Lifetime2Lifetime1 * (this.field_j + 16) >> 3);
          if (0 < 3 * var12Lifetime2Lifetime1 + var14Lifetime2Lifetime1) {
            if (param4) {
              this.field_a.h(-30).b(var13Lifetime2Lifetime1, var14Lifetime2Lifetime1, var12Lifetime2Lifetime1 * 2, var12Lifetime2Lifetime1 * 3, ek.field_f[this.field_a.field_u]);
            } else {
              this.field_p = false;
              this.field_a.h(-30).b(var13Lifetime2Lifetime1, var14Lifetime2Lifetime1, var12Lifetime2Lifetime1 * 2, var12Lifetime2Lifetime1 * 3, ek.field_f[this.field_a.field_u]);
            }
          }
          kh.d(var8, var9, var10, var11);
          return;
        }
        this.a(true, -118, 73, (byte) -80, true, 50, -86);
        var12Lifetime3 = 0;
        while (true) {
          if (var12Lifetime3 >= 8) {
            var12Lifetime3 = param1 * (16 + this.field_j) >> 4;
            var13Lifetime3 = -var12Lifetime3 + (param1 + param5);
            var14Lifetime3 = param2 + param6 - (var12Lifetime3 * (this.field_j + 16) >> 3);
            if (0 < 3 * var12Lifetime3 + var14Lifetime3) {
              if (param4) {
                this.field_a.h(-30).b(var13Lifetime3, var14Lifetime3, var12Lifetime3 * 2, var12Lifetime3 * 3, ek.field_f[this.field_a.field_u]);
              } else {
                this.field_p = false;
                this.field_a.h(-30).b(var13Lifetime3, var14Lifetime3, var12Lifetime3 * 2, var12Lifetime3 * 3, ek.field_f[this.field_a.field_u]);
              }
            }
            kh.d(var8, var9, var10, var11);
            return;
          }
          var13Lifetime3Lifetime1 = -var12Lifetime3 + (-1 + (this.field_j >> 1)) << 1;
          if (var13Lifetime3Lifetime1 >= 0) {
            var14Lifetime3Lifetime1 = (var13Lifetime3Lifetime1 + 16) * param1 >> 4;
            var15Lifetime3 = param1 + (param5 - (var14Lifetime3Lifetime1 >> 2));
            var16Lifetime3 = -(var14Lifetime3Lifetime1 * (-2 + var13Lifetime3Lifetime1 + 16) >> 3) + (param2 + param6);
            if (var16Lifetime3 + (var14Lifetime3Lifetime1 * 3 >> 2) > 0) {
              if (!param4) {
                this.field_p = false;
              }
              bd.field_n[var12Lifetime3].a(var15Lifetime3, var16Lifetime3, var14Lifetime3Lifetime1 >> 1, var14Lifetime3Lifetime1 * 3 >> 2, 256);
            }
            var12Lifetime3++;
            continue;
          }
          break;
        }
        var12Lifetime4 = param1 * (16 + this.field_j) >> 4;
        var13Lifetime4 = -var12Lifetime4 + (param1 + param5);
        var14Lifetime4 = param2 + param6 - (var12Lifetime4 * (this.field_j + 16) >> 3);
        if (0 >= 3 * var12Lifetime4 + var14Lifetime4) {
          kh.d(var8, var9, var10, var11);
          return;
        }
        if (param4) {
          this.field_a.h(-30).b(var13Lifetime4, var14Lifetime4, var12Lifetime4 * 2, var12Lifetime4 * 3, ek.field_f[this.field_a.field_u]);
          kh.d(var8, var9, var10, var11);
          return;
        }
        this.field_p = false;
        this.field_a.h(-30).b(var13Lifetime4, var14Lifetime4, var12Lifetime4 * 2, var12Lifetime4 * 3, ek.field_f[this.field_a.field_u]);
        kh.d(var8, var9, var10, var11);
        return;
    }

    final fb a(int param0) {
        int var2 = -48 / ((36 - param0) / 62);
        fb discarded$0 = super.a(99);
        this.field_j = this.field_j + 1;
        if (!this.field_p) {
          return (fb) (this);
        }
        return null;
    }

    uo(fq param0) {
        super(param0, 21);
        this.field_j = 0;
        this.field_p = false;
    }

    public static void c(int param0) {
        field_n = null;
        field_l = null;
        int var1 = 69 / ((20 - param0) / 58);
        field_k = null;
        field_i = null;
    }

    static {
        field_n = new wh(2);
    }
}
