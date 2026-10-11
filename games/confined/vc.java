/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends gf {
    private int field_x;
    private int field_q;
    private boolean field_v;
    private int field_D;
    private int field_r;
    private int field_A;
    private int field_C;
    private int field_y;
    private int field_t;
    private int field_s;
    private int field_z;
    private int field_B;
    private int field_w;
    private int field_E;
    private int field_u;

    final gf d() {
        return null;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, vc param11, int param12, int param13) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        param11.field_r = param11.field_r - param11.field_E * param5;
        param11.field_x = param11.field_x - param11.field_y * param5;
        if (param12 != 0) {
          param8 = param5 + (param10 + 256 - param4 + param12) / param12;
        }
        if (param12 == 0 ||
          param5 + (param10 + 256 - param4 + param12) / param12 > param9) {
          param8 = param9;
        }
        while (param5 < param8) {
          param1 = param4 >> 8;
          param0 = param2[param1 - 1];
          incrementValue$3 = param5;
          param5++;
          param3[incrementValue$3] = param3[incrementValue$3] + (((param0 << 8) + (param2[param1] - param0) * (param4 & 255)) * param6 >> 6);
          param6 = param6 + param7;
          param4 = param4 + param12;
        }
        if (param12 != 0) {
          param8 = param5 + (param10 - param4 + param12) / param12;
        }
        if (param12 == 0 ||
          param5 + (param10 - param4 + param12) / param12 > param9) {
          param8 = param9;
        }
        param0 = param13;
        param1 = param12;
        while (param5 < param8) {
          incrementValue$2 = param5;
          param5++;
          param3[incrementValue$2] = param3[incrementValue$2] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
          param6 = param6 + param7;
          param4 = param4 + param1;
        }
        param11.field_r = param11.field_r + param11.field_E * param5;
        param11.field_x = param11.field_x + param11.field_y * param5;
        param11.field_C = param6;
        param11.field_t = param4;
        return param5;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, vc param12) {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        param3 = param3 >> 8;
        param11 = param11 >> 8;
        param5 = param5 << 2;
        param6 = param6 << 2;
        param7 = param7 << 2;
        param8 = param8 << 2;
        param9 = param4 + param11 - param3;
        if (param4 + param11 - param3 > param10) {
          param9 = param10;
        }
        param12.field_C = param12.field_C + param12.field_z * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        while (param4 < param9) {
          param0 = param1[param3++];
          incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3++];
          incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3++];
          incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3++];
          incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
          param6 = param6 + param8;
        }
        param9 += 6;
        while (param4 < param9) {
          param0 = param1[param3++];
          incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
          param6 = param6 + param8;
        }
        param12.field_r = param5 >> 2;
        param12.field_x = param6 >> 2;
        param12.field_t = param3 << 8;
        return param4 >> 1;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, vc param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.field_C = param13.field_C - param13.field_z * param5;
        if (param14 != 0) {
          param10 = param5 + (param12 - param4 + param14 - 257) / param14;
        }
        if (param14 == 0 ||
          param5 + (param12 - param4 + param14 - 257) / param14 > param11) {
          param10 = param11;
        }
        param5 = param5 << 1;
        param10 = param10 << 1;
        while (param5 < param10) {
          param1 = param4 >> 8;
          param0 = param2[param1];
          param0 = (param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255);
          incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          incrementValue$7 = param5;
          param5++;
          param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
          param7 = param7 + param9;
          param4 = param4 + param14;
        }
        if (param14 != 0) {
          param10 = (param5 >> 1) + (param12 - param4 + param14 - 1) / param14;
        }
        if (param14 == 0 ||
          (param5 >> 1) + (param12 - param4 + param14 - 1) / param14 > param11) {
          param10 = param11;
        }
        param10 = param10 << 1;
        param1 = param15;
        while (param5 < param10) {
          param0 = param2[param4 >> 8];
          param0 = (param0 << 8) + (param1 - param0) * (param4 & 255);
          incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param7 = param7 + param9;
          param4 = param4 + param14;
        }
        param5 = param5 >> 1;
        param13.field_C = param13.field_C + param13.field_z * param5;
        param13.field_r = param6;
        param13.field_x = param7;
        param13.field_t = param4;
        return param5;
    }

    final synchronized void h(int param0) {
        this.c(param0 << 6, this.f());
    }

    final synchronized void d(int param0) {
        if (this.field_B < 0) {
          this.field_B = -param0;
        } else {
          this.field_B = param0;
        }
    }

    private final static int e(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, vc param12) {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        param3 = param3 >> 8;
        param11 = param11 >> 8;
        param5 = param5 << 2;
        param6 = param6 << 2;
        param7 = param7 << 2;
        param8 = param8 << 2;
        param9 = param4 + param3 - (param11 - 1);
        if (param4 + param3 - (param11 - 1) > param10) {
          param9 = param10;
        }
        param12.field_C = param12.field_C + param12.field_z * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        while (param4 < param9) {
          param0 = param1[param3--];
          incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3--];
          incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3--];
          incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3--];
          incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
          param6 = param6 + param8;
        }
        param9 += 6;
        while (param4 < param9) {
          param0 = param1[param3--];
          incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
          param6 = param6 + param8;
        }
        param12.field_r = param5 >> 2;
        param12.field_x = param6 >> 2;
        param12.field_t = param3 << 8;
        return param4 >> 1;
    }

    private final synchronized void g(int param0) {
        this.c(param0, this.f());
    }

    private final void e() {
        if (this.field_q != 0) {
          if (this.field_A == -2147483648) {
            this.field_A = 0;
          }
          this.field_q = 0;
          this.h();
          return;
        }
    }

    final int b() {
        int var1 = this.field_C * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.field_D == 0) {
          var1 = var1 - var1 * this.field_t / (((bi) (this.field_n)).field_o.length << 8);
        } else {
          if (this.field_D >= 0) {
            var1 = var1 - var1 * this.field_u / ((bi) (this.field_n)).field_o.length;
          }
        }
        return var1 > 255 ? 255 : var1;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, vc param8) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param7 - param2;
        if (param3 + param7 - param2 > param6) {
          param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
          incrementValue$0 = param3;
          param3++;
          incrementValue$1 = param2;
          param2++;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          incrementValue$2 = param3;
          param3++;
          incrementValue$3 = param2;
          param2++;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          incrementValue$4 = param3;
          param3++;
          incrementValue$5 = param2;
          param2++;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          incrementValue$6 = param3;
          param3++;
          incrementValue$7 = param2;
          param2++;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
          incrementValue$8 = param3;
          param3++;
          incrementValue$9 = param2;
          param2++;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
        }
        param8.field_t = param2 << 8;
        return param3;
    }

    private final synchronized void b(int param0, int param1, int param2) {
        int var6 = 0;
        int var6Lifetime1;
        if (param0 == 0) {
          this.c(param1, param2);
          return;
        }
        int var4 = vc.a(param1, param2);
        int var5 = vc.e(param1, param2);
        if (this.field_r != var4) {
          var6 = param1 - this.field_C;
          if (this.field_C - param1 > var6) {
            var6 = this.field_C - param1;
          }
          if (var4 - this.field_r > var6) {
            var6 = var4 - this.field_r;
          }
          if (this.field_r - var4 > var6) {
            var6 = this.field_r - var4;
          }
          if (var5 - this.field_x > var6) {
            var6 = var5 - this.field_x;
          }
          if (this.field_x - var5 > var6) {
            var6 = this.field_x - var5;
          }
          if (param0 > var6) {
            param0 = var6;
          }
          this.field_q = param0;
          this.field_A = param1;
          this.field_w = param2;
          this.field_z = (param1 - this.field_C) / param0;
          this.field_E = (var4 - this.field_r) / param0;
          this.field_y = (var5 - this.field_x) / param0;
          return;
        }
        if (this.field_x != var5) {
          var6Lifetime1 = param1 - this.field_C;
          if (this.field_C - param1 > var6Lifetime1) {
            var6Lifetime1 = this.field_C - param1;
          }
          if (var4 - this.field_r > var6Lifetime1) {
            var6Lifetime1 = var4 - this.field_r;
          }
          if (this.field_r - var4 > var6Lifetime1) {
            var6Lifetime1 = this.field_r - var4;
          }
          if (var5 - this.field_x > var6Lifetime1) {
            var6Lifetime1 = var5 - this.field_x;
          }
          if (this.field_x - var5 > var6Lifetime1) {
            var6Lifetime1 = this.field_x - var5;
          }
          if (param0 > var6Lifetime1) {
            param0 = var6Lifetime1;
          }
          this.field_q = param0;
          this.field_A = param1;
          this.field_w = param2;
          this.field_z = (param1 - this.field_C) / param0;
          this.field_E = (var4 - this.field_r) / param0;
          this.field_y = (var5 - this.field_x) / param0;
          return;
        }
        this.field_q = 0;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.field_q <= 0) {
            if (this.field_B == -256 &&
              (this.field_t & 255) == 0) {
              if (dk.field_j) {
                return vc.a(0, ((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_r, this.field_x, 0, param3, param2, this);
              }
              return vc.a(((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_C, 0, param3, param2, this);
            }
            if (dk.field_j) {
              return vc.c(0, 0, ((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_r, this.field_x, 0, param3, param2, this, this.field_B, param4);
            }
            return vc.a(0, 0, ((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_C, 0, param3, param2, this, this.field_B, param4);
          }
          var6 = param1 + this.field_q;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_q = this.field_q + param1;
          if (this.field_B == -256 &&
            (this.field_t & 255) == 0) {
            if (!dk.field_j) {
              param1 = vc.a(((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_C, this.field_z, 0, var6, param2, this);
            } else {
              param1 = vc.a(0, ((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_r, this.field_x, this.field_E, this.field_y, 0, var6, param2, this);
            }
          } else {
            if (!dk.field_j) {
              param1 = vc.a(0, 0, ((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_C, this.field_z, 0, var6, param2, this, this.field_B, param4);
            } else {
              param1 = vc.a(0, 0, ((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_r, this.field_x, this.field_E, this.field_y, 0, var6, param2, this, this.field_B, param4);
            }
          }
          this.field_q = this.field_q - param1;
          if (this.field_q != 0) {
            return param1;
          }
        } while (!this.g());
        return param3;
    }

    final synchronized void d(int param0, int param1) {
        this.field_u = param0;
        this.field_s = param1;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, vc param10, int param11, int param12) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        if (param11 != 0) {
          param7 = param5 + (param9 + 256 - param4 + param11) / param11;
        }
        if (param11 == 0 ||
          param5 + (param9 + 256 - param4 + param11) / param11 > param8) {
          param7 = param8;
        }
        while (param5 < param7) {
          param1 = param4 >> 8;
          param0 = param2[param1 - 1];
          incrementValue$1 = param5;
          param5++;
          param3[incrementValue$1] = param3[incrementValue$1] + (((param0 << 8) + (param2[param1] - param0) * (param4 & 255)) * param6 >> 6);
          param4 = param4 + param11;
        }
        if (param11 != 0) {
          param7 = param5 + (param9 - param4 + param11) / param11;
        }
        if (param11 == 0 ||
          param5 + (param9 - param4 + param11) / param11 > param8) {
          param7 = param8;
        }
        param0 = param12;
        param1 = param11;
        while (param5 < param7) {
          incrementValue$0 = param5;
          param5++;
          param3[incrementValue$0] = param3[incrementValue$0] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
          param4 = param4 + param1;
        }
        param10.field_t = param4;
        return param5;
    }

    final synchronized void c(boolean param0) {
        this.field_v = param0 ? true : false;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, vc param11, int param12, int param13) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        if (param12 != 0) {
          param8 = param5 + (param10 + 256 - param4 + param12) / param12;
        }
        if (param12 == 0 ||
          param5 + (param10 + 256 - param4 + param12) / param12 > param9) {
          param8 = param9;
        }
        param5 = param5 << 1;
        param8 = param8 << 1;
        while (param5 < param8) {
          param1 = param4 >> 8;
          param0 = param2[param1 - 1];
          param0 = (param0 << 8) + (param2[param1] - param0) * (param4 & 255);
          incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          incrementValue$7 = param5;
          param5++;
          param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
          param4 = param4 + param12;
        }
        if (param12 != 0) {
          param8 = (param5 >> 1) + (param10 - param4 + param12) / param12;
        }
        if (param12 == 0 ||
          (param5 >> 1) + (param10 - param4 + param12) / param12 > param9) {
          param8 = param9;
        }
        param8 = param8 << 1;
        param1 = param13;
        while (param5 < param8) {
          param0 = (param1 << 8) + (param2[param4 >> 8] - param1) * (param4 & 255);
          incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param4 = param4 + param12;
        }
        param11.field_t = param4;
        return param5 >> 1;
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, vc param11, int param12, int param13) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        if (param12 != 0) {
          param8 = param5 + (param10 - param4 + param12 - 257) / param12;
        }
        if (param12 == 0 ||
          param5 + (param10 - param4 + param12 - 257) / param12 > param9) {
          param8 = param9;
        }
        param5 = param5 << 1;
        param8 = param8 << 1;
        while (param5 < param8) {
          param1 = param4 >> 8;
          param0 = param2[param1];
          param0 = (param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255);
          incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          incrementValue$7 = param5;
          param5++;
          param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
          param4 = param4 + param12;
        }
        if (param12 != 0) {
          param8 = (param5 >> 1) + (param10 - param4 + param12 - 1) / param12;
        }
        if (param12 == 0 ||
          (param5 >> 1) + (param10 - param4 + param12 - 1) / param12 > param9) {
          param8 = param9;
        }
        param8 = param8 << 1;
        param1 = param13;
        while (param5 < param8) {
          param0 = param2[param4 >> 8];
          param0 = (param0 << 8) + (param1 - param0) * (param4 & 255);
          incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param4 = param4 + param12;
        }
        param11.field_t = param4;
        return param5 >> 1;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, vc param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        param2 = param2 >> 8;
        param8 = param8 >> 8;
        param4 = param4 << 2;
        param5 = param5 << 2;
        param6 = param3 + param8 - param2;
        if (param3 + param8 - param2 > param7) {
          param6 = param7;
        }
        param9.field_r = param9.field_r + param9.field_E * (param6 - param3);
        param9.field_x = param9.field_x + param9.field_y * (param6 - param3);
        param6 -= 3;
        while (param3 < param6) {
          incrementValue$0 = param3;
          param3++;
          incrementValue$1 = param2;
          param2++;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          param4 = param4 + param5;
          incrementValue$2 = param3;
          param3++;
          incrementValue$3 = param2;
          param2++;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          param4 = param4 + param5;
          incrementValue$4 = param3;
          param3++;
          incrementValue$5 = param2;
          param2++;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          param4 = param4 + param5;
          incrementValue$6 = param3;
          param3++;
          incrementValue$7 = param2;
          param2++;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
          param4 = param4 + param5;
        }
        param6 += 3;
        while (param3 < param6) {
          incrementValue$8 = param3;
          param3++;
          incrementValue$9 = param2;
          param2++;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
          param4 = param4 + param5;
        }
        param9.field_C = param4 >> 2;
        param9.field_t = param2 << 8;
        return param3;
    }

    final synchronized void e(int param0) {
        param0 = param0 << 8;
        int var2 = ((bi) (this.field_n)).field_o.length << 8;
        if (param0 < -1) {
          param0 = -1;
        }
        if (param0 > var2) {
          param0 = var2;
        }
        this.field_t = param0;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, vc param10) {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        param3 = param3 >> 8;
        param9 = param9 >> 8;
        param5 = param5 << 2;
        param6 = param6 << 2;
        param7 = param4 + param9 - param3;
        if (param4 + param9 - param3 > param8) {
          param7 = param8;
        }
        param4 = param4 << 1;
        param7 = param7 << 1;
        param7 -= 6;
        while (param4 < param7) {
          param0 = param1[param3++];
          incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param0 = param1[param3++];
          incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param0 = param1[param3++];
          incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param0 = param1[param3++];
          incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
        }
        param7 += 6;
        while (param4 < param7) {
          param0 = param1[param3++];
          incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
        }
        param10.field_t = param3 << 8;
        return param4 >> 1;
    }

    private final boolean g() {
        int var1;
        int var2;
        int var3;
        var1 = this.field_A;
        if (var1 != -2147483648) {
          var2 = vc.a(var1, this.field_w);
          var3 = vc.e(var1, this.field_w);
        } else {
          var3 = 0;
          var2 = 0;
          var1 = 0;
        }
        if (this.field_C == var1 &&
          this.field_r == var2 &&
          this.field_x == var3) {
          if (this.field_A != -2147483648) {
            this.h();
            return false;
          }
          this.field_A = 0;
          this.field_x = 0;
          this.field_r = 0;
          this.field_C = 0;
          this.a(true);
          return true;
        }
        if (this.field_C >= var1) {
          if (this.field_C <= var1) {
            this.field_z = 0;
          } else {
            this.field_z = -1;
            this.field_q = this.field_C - var1;
          }
        } else {
          this.field_z = 1;
          this.field_q = var1 - this.field_C;
        }
        if (this.field_r >= var2) {
          if (this.field_r <= var2) {
            this.field_E = 0;
          } else {
            this.field_E = -1;
            if (this.field_q == 0 ||
              this.field_q > this.field_r - var2) {
              this.field_q = this.field_r - var2;
            }
          }
        } else {
          this.field_E = 1;
          if (this.field_q == 0 ||
            this.field_q > var2 - this.field_r) {
            this.field_q = var2 - this.field_r;
          }
        }
        if (this.field_x < var3) {
          this.field_y = 1;
          if (this.field_q != 0 &&
            this.field_q <= var3 - this.field_x) {
            return false;
          }
          this.field_q = var3 - this.field_x;
          return false;
        }
        if (this.field_x <= var3) {
          this.field_y = 0;
        } else {
          this.field_y = -1;
          if (this.field_q == 0 ||
            this.field_q > this.field_x - var3) {
            this.field_q = this.field_x - var3;
          }
        }
        return false;
    }

    private final static int a(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final int c() {
        if (this.field_A == 0 &&
          this.field_q == 0) {
          return 0;
        }
        return 1;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.field_q <= 0) {
            if (this.field_B == 256 &&
              (this.field_t & 255) == 0) {
              if (dk.field_j) {
                return vc.b(0, ((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_r, this.field_x, 0, param3, param2, this);
              }
              return vc.b(((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_C, 0, param3, param2, this);
            }
            if (dk.field_j) {
              return vc.d(0, 0, ((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_r, this.field_x, 0, param3, param2, this, this.field_B, param4);
            }
            return vc.b(0, 0, ((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_C, 0, param3, param2, this, this.field_B, param4);
          }
          var6 = param1 + this.field_q;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_q = this.field_q + param1;
          if (this.field_B == 256 &&
            (this.field_t & 255) == 0) {
            if (!dk.field_j) {
              param1 = vc.b(((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_C, this.field_z, 0, var6, param2, this);
            } else {
              param1 = vc.b(0, ((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_r, this.field_x, this.field_E, this.field_y, 0, var6, param2, this);
            }
          } else {
            if (!dk.field_j) {
              param1 = vc.b(0, 0, ((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_C, this.field_z, 0, var6, param2, this, this.field_B, param4);
            } else {
              param1 = vc.b(0, 0, ((bi) (this.field_n)).field_o, param0, this.field_t, param1, this.field_r, this.field_x, this.field_E, this.field_y, 0, var6, param2, this, this.field_B, param4);
            }
          }
          this.field_q = this.field_q - param1;
          if (this.field_q != 0) {
            return param1;
          }
        } while (!this.g());
        return param3;
    }

    final synchronized void f(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == 0) {
          this.g(0);
          this.a(true);
          return;
        }
        if (this.field_r != 0) {
          var2 = -this.field_C;
          if (this.field_C > var2) {
            var2 = this.field_C;
          }
          if (-this.field_r > var2) {
            var2 = -this.field_r;
          }
          if (this.field_r > var2) {
            var2 = this.field_r;
          }
          if (-this.field_x > var2) {
            var2 = -this.field_x;
          }
          if (this.field_x > var2) {
            var2 = this.field_x;
          }
          if (param0 > var2) {
            param0 = var2;
          }
          this.field_q = param0;
          this.field_A = -2147483648;
          this.field_z = -this.field_C / param0;
          this.field_E = -this.field_r / param0;
          this.field_y = -this.field_x / param0;
          return;
        }
        if (this.field_x != 0) {
          var2Lifetime1 = -this.field_C;
          if (this.field_C > var2Lifetime1) {
            var2Lifetime1 = this.field_C;
          }
          if (-this.field_r > var2Lifetime1) {
            var2Lifetime1 = -this.field_r;
          }
          if (this.field_r > var2Lifetime1) {
            var2Lifetime1 = this.field_r;
          }
          if (-this.field_x > var2Lifetime1) {
            var2Lifetime1 = -this.field_x;
          }
          if (this.field_x > var2Lifetime1) {
            var2Lifetime1 = this.field_x;
          }
          if (param0 > var2Lifetime1) {
            param0 = var2Lifetime1;
          }
          this.field_q = param0;
          this.field_A = -2147483648;
          this.field_z = -this.field_C / param0;
          this.field_E = -this.field_r / param0;
          this.field_y = -this.field_x / param0;
          return;
        }
        this.field_q = 0;
        this.field_A = 0;
        this.field_C = 0;
        this.a(true);
    }

    private final synchronized void c(int param0, int param1) {
        this.field_A = param0;
        this.field_w = param1;
        this.field_q = 0;
        this.h();
    }

    private final synchronized int f() {
        return this.field_w < 0 ? -1 : this.field_w;
    }

    final synchronized void b(boolean param0) {
        this.field_B = (this.field_B ^ this.field_B >> 31) + (this.field_B >>> 31);
        if (!param0) {
          return;
        }
        this.field_B = -this.field_B;
    }

    final synchronized void b(int param0, int param1) {
        this.field_A = param0 << 6;
        this.field_w = param1 << 6;
        this.field_q = 0;
        this.h();
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, vc param10, int param11, int param12) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        if (param11 != 0) {
          param7 = param5 + (param9 - param4 + param11 - 257) / param11;
        }
        if (param11 == 0 ||
          param5 + (param9 - param4 + param11 - 257) / param11 > param8) {
          param7 = param8;
        }
        while (param5 < param7) {
          param1 = param4 >> 8;
          param0 = param2[param1];
          incrementValue$1 = param5;
          param5++;
          param3[incrementValue$1] = param3[incrementValue$1] + (((param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255)) * param6 >> 6);
          param4 = param4 + param11;
        }
        if (param11 != 0) {
          param7 = param5 + (param9 - param4 + param11 - 1) / param11;
        }
        if (param11 == 0 ||
          param5 + (param9 - param4 + param11 - 1) / param11 > param8) {
          param7 = param8;
        }
        param1 = param12;
        while (param5 < param7) {
          param0 = param2[param4 >> 8];
          incrementValue$0 = param5;
          param5++;
          param3[incrementValue$0] = param3[incrementValue$0] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
          param4 = param4 + param11;
        }
        param10.field_t = param4;
        return param5;
    }

    final synchronized boolean i() {
        return this.field_B < 0;
    }

    final static vc a(bi param0, int param1, int param2) {
        if (param0.field_o == null) {
          return null;
        }
        if (param0.field_o.length != 0) {
          return new vc(param0, param1, param2 << 6);
        }
        return null;
    }

    final static vc b(bi param0, int param1, int param2) {
        if (param0.field_o == null) {
          return null;
        }
        if (param0.field_o.length != 0) {
          return new vc(param0, (int)((long)param0.field_n * 256L * (long)param1 / (long)(100 * dk.field_k)), param2 << 6);
        }
        return null;
    }

    private final void h() {
        this.field_C = this.field_A;
        this.field_r = vc.a(this.field_A, this.field_w);
        this.field_x = vc.e(this.field_A, this.field_w);
    }

    final synchronized void c(int param0) {
        this.field_D = param0;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int discarded$4 = 0;
        int discarded$3 = 0;
        bi var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var10Lifetime1;
        if (this.field_A == 0 &&
          this.field_q == 0) {
          this.b(param2);
          return;
        }
        var4 = (bi) (this.field_n);
        var5 = this.field_u << 8;
        var6 = this.field_s << 8;
        var7 = var4.field_o.length << 8;
        var8 = var6 - var5;
        if (var8 <= 0) {
          this.field_D = 0;
        }
        var9 = param1;
        param2 = param2 + param1;
        if (this.field_t < 0) {
          if (this.field_B <= 0) {
            this.e();
            this.a(true);
            return;
          }
          this.field_t = 0;
        }
        if (this.field_t >= var7) {
          if (this.field_B >= 0) {
            this.e();
            this.a(true);
            return;
          }
          this.field_t = var7 - 1;
        }
        if (this.field_D < 0) {
          if (!this.field_v) {
            if (this.field_B >= 0) {
              while (true) {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_o[this.field_u]);
                if (this.field_t < var6) {
                  return;
                }
                this.field_t = var5 + (this.field_t - var5) % var8;
              }
            }
            while (true) {
              var9 = this.b(param0, var9, var5, param2, (int) var4.field_o[this.field_s - 1]);
              if (this.field_t >= var5) {
                return;
              }
              this.field_t = var6 - 1 - (var6 - 1 - this.field_t) % var8;
            }
          }
          if (this.field_B < 0) {
            var9 = this.b(param0, var9, var5, param2, (int) var4.field_o[this.field_u]);
            if (this.field_t >= var5) {
              return;
            }
            this.field_t = var5 + var5 - 1 - this.field_t;
            this.field_B = -this.field_B;
          }
          while (true) {
            var9 = this.a(param0, var9, var6, param2, (int) var4.field_o[this.field_s - 1]);
            if (this.field_t < var6) {
              return;
            }
            this.field_t = var6 + var6 - 1 - this.field_t;
            this.field_B = -this.field_B;
            var9 = this.b(param0, var9, var5, param2, (int) var4.field_o[this.field_u]);
            if (this.field_t >= var5) {
              return;
            }
            this.field_t = var5 + var5 - 1 - this.field_t;
            this.field_B = -this.field_B;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_D > 0) {
          if (!this.field_v) {
            if (this.field_B < 0) {
              while (true) {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_o[this.field_s - 1]);
                if (this.field_t >= var5) {
                  return;
                }
                var10 = (var6 - 1 - this.field_t) / var8;
                if (var10 < this.field_D) {
                  this.field_t = this.field_t + var8 * var10;
                  this.field_D = this.field_D - var10;
                  continue;
                }
                break;
              }
              this.field_t = this.field_t + var8 * this.field_D;
              this.field_D = 0;
            } else {
              while (true) {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_o[this.field_u]);
                if (this.field_t < var6) {
                  return;
                }
                var10Lifetime1 = (this.field_t - var5) / var8;
                if (var10Lifetime1 < this.field_D) {
                  this.field_t = this.field_t - var8 * var10Lifetime1;
                  this.field_D = this.field_D - var10Lifetime1;
                  continue;
                }
                break;
              }
              this.field_t = this.field_t - var8 * this.field_D;
              this.field_D = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_B < 0) {
              var9 = this.b(param0, var9, var5, param2, (int) var4.field_o[this.field_u]);
              if (this.field_t >= var5) {
                return;
              }
              this.field_t = var5 + var5 - 1 - this.field_t;
              this.field_B = -this.field_B;
              fieldTemp$0 = this.field_D - 1;
              this.field_D = this.field_D - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_o[this.field_s - 1]);
                if (this.field_t < var6) {
                  return;
                }
                this.field_t = var6 + var6 - 1 - this.field_t;
                this.field_B = -this.field_B;
                fieldTemp$1 = this.field_D - 1;
                this.field_D = this.field_D - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_o[this.field_u]);
                if (this.field_t >= var5) {
                  return;
                }
                this.field_t = var5 + var5 - 1 - this.field_t;
                this.field_B = -this.field_B;
                fieldTemp$2 = this.field_D - 1;
                this.field_D = this.field_D - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.field_B >= 0) {
          discarded$4 = this.a(param0, var9, var7, param2, 0);
          if (this.field_t >= var7) {
            this.field_t = var7;
            this.e();
            this.a(true);
          }
          return;
        }
        discarded$3 = this.b(param0, var9, 0, param2, 0);
        if (this.field_t >= 0) {
          return;
        }
        this.field_t = -1;
        this.e();
        this.a(true);
        return;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, vc param11, int param12, int param13) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        param11.field_r = param11.field_r - param11.field_E * param5;
        param11.field_x = param11.field_x - param11.field_y * param5;
        if (param12 != 0) {
          param8 = param5 + (param10 - param4 + param12 - 257) / param12;
        }
        if (param12 == 0 ||
          param5 + (param10 - param4 + param12 - 257) / param12 > param9) {
          param8 = param9;
        }
        while (param5 < param8) {
          param1 = param4 >> 8;
          param0 = param2[param1];
          incrementValue$3 = param5;
          param5++;
          param3[incrementValue$3] = param3[incrementValue$3] + (((param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255)) * param6 >> 6);
          param6 = param6 + param7;
          param4 = param4 + param12;
        }
        if (param12 != 0) {
          param8 = param5 + (param10 - param4 + param12 - 1) / param12;
        }
        if (param12 == 0 ||
          param5 + (param10 - param4 + param12 - 1) / param12 > param9) {
          param8 = param9;
        }
        param1 = param13;
        while (param5 < param8) {
          param0 = param2[param4 >> 8];
          incrementValue$2 = param5;
          param5++;
          param3[incrementValue$2] = param3[incrementValue$2] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
          param6 = param6 + param7;
          param4 = param4 + param12;
        }
        param11.field_r = param11.field_r + param11.field_E * param5;
        param11.field_x = param11.field_x + param11.field_y * param5;
        param11.field_C = param6;
        param11.field_t = param4;
        return param5;
    }

    final static vc a(bi param0, int param1, int param2, int param3) {
        if (param0.field_o == null) {
          return null;
        }
        if (param0.field_o.length != 0) {
          return new vc(param0, param1, param2 << 6, param3 << 6);
        }
        return null;
    }

    final synchronized void a(int param0, int param1, int param2) {
        this.b(param0, param1 << 6, param2 << 6);
    }

    final synchronized void b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        bi var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (this.field_q > 0) {
          if (param0 < this.field_q) {
            this.field_C = this.field_C + this.field_z * param0;
            this.field_r = this.field_r + this.field_E * param0;
            this.field_x = this.field_x + this.field_y * param0;
            this.field_q = this.field_q - param0;
          } else {
            if (this.field_A == -2147483648) {
              this.field_A = 0;
              this.field_x = 0;
              this.field_r = 0;
              this.field_C = 0;
              this.a(true);
              param0 = this.field_q;
            }
            this.field_q = 0;
            this.h();
          }
        }
        var2 = (bi) (this.field_n);
        var3 = this.field_u << 8;
        var4 = this.field_s << 8;
        var5 = var2.field_o.length << 8;
        var6 = var4 - var3;
        if (var6 <= 0) {
          this.field_D = 0;
        }
        if (this.field_t < 0) {
          if (this.field_B <= 0) {
            this.e();
            this.a(true);
            return;
          }
          this.field_t = 0;
        }
        if (this.field_t >= var5) {
          if (this.field_B >= 0) {
            this.e();
            this.a(true);
            return;
          }
          this.field_t = var5 - 1;
        }
        this.field_t = this.field_t + this.field_B * param0;
        if (this.field_D < 0) {
          if (!this.field_v) {
            if (this.field_B >= 0) {
              if (this.field_t < var4) {
                return;
              }
              this.field_t = var3 + (this.field_t - var3) % var6;
              return;
            }
            if (this.field_t >= var3) {
              return;
            }
            this.field_t = var4 - 1 - (var4 - 1 - this.field_t) % var6;
            return;
          }
          if (this.field_B < 0) {
            if (this.field_t >= var3) {
              return;
            }
            this.field_t = var3 + var3 - 1 - this.field_t;
            this.field_B = -this.field_B;
          }
          while (this.field_t >= var4) {
            this.field_t = var4 + var4 - 1 - this.field_t;
            this.field_B = -this.field_B;
            if (this.field_t >= var3) {
              return;
            }
            this.field_t = var3 + var3 - 1 - this.field_t;
            this.field_B = -this.field_B;
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_D > 0) {
          if (!this.field_v) {
            if (this.field_B >= 0) {
              if (this.field_t < var4) {
                return;
              }
              var7 = (this.field_t - var3) / var6;
              if (var7 >= this.field_D) {
                this.field_t = this.field_t - var6 * this.field_D;
                this.field_D = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_t = this.field_t - var6 * var7;
                this.field_D = this.field_D - var7;
              }
            } else {
              if (this.field_t >= var3) {
                return;
              }
              var7 = (var4 - 1 - this.field_t) / var6;
              if (var7 >= this.field_D) {
                this.field_t = this.field_t + var6 * this.field_D;
                this.field_D = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_t = this.field_t + var6 * var7;
                this.field_D = this.field_D - var7;
              }
            }
            if (decompiledFrameRemainder0) {
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_B < 0) {
              if (this.field_t >= var3) {
                return;
              }
              this.field_t = var3 + var3 - 1 - this.field_t;
              this.field_B = -this.field_B;
              fieldTemp$0 = this.field_D - 1;
              this.field_D = this.field_D - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                if (this.field_t < var4) {
                  return;
                }
                this.field_t = var4 + var4 - 1 - this.field_t;
                this.field_B = -this.field_B;
                fieldTemp$1 = this.field_D - 1;
                this.field_D = this.field_D - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                if (this.field_t >= var3) {
                  return;
                }
                this.field_t = var3 + var3 - 1 - this.field_t;
                this.field_B = -this.field_B;
                fieldTemp$2 = this.field_D - 1;
                this.field_D = this.field_D - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.field_B >= 0) {
          if (this.field_t >= var5) {
            this.field_t = var5;
            this.e();
            this.a(true);
          }
          return;
        }
        if (this.field_t >= 0) {
          return;
        }
        this.field_t = -1;
        this.e();
        this.a(true);
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, vc param8) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param2 - (param7 - 1);
        if (param3 + param2 - (param7 - 1) > param6) {
          param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
          incrementValue$0 = param3;
          param3++;
          incrementValue$1 = param2;
          param2--;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          incrementValue$2 = param3;
          param3++;
          incrementValue$3 = param2;
          param2--;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          incrementValue$4 = param3;
          param3++;
          incrementValue$5 = param2;
          param2--;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          incrementValue$6 = param3;
          param3++;
          incrementValue$7 = param2;
          param2--;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
          incrementValue$8 = param3;
          param3++;
          incrementValue$9 = param2;
          param2--;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
        }
        param8.field_t = param2 << 8;
        return param3;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, vc param10) {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        param3 = param3 >> 8;
        param9 = param9 >> 8;
        param5 = param5 << 2;
        param6 = param6 << 2;
        param7 = param4 + param3 - (param9 - 1);
        if (param4 + param3 - (param9 - 1) > param8) {
          param7 = param8;
        }
        param4 = param4 << 1;
        param7 = param7 << 1;
        param7 -= 6;
        while (param4 < param7) {
          param0 = param1[param3--];
          incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param0 = param1[param3--];
          incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param0 = param1[param3--];
          incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param0 = param1[param3--];
          incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
        }
        param7 += 6;
        while (param4 < param7) {
          param0 = param1[param3--];
          incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
        }
        param10.field_t = param3 << 8;
        return param4 >> 1;
    }

    final gf a() {
        return null;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, vc param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.field_C = param13.field_C - param13.field_z * param5;
        if (param14 != 0) {
          param10 = param5 + (param12 + 256 - param4 + param14) / param14;
        }
        if (param14 == 0 ||
          param5 + (param12 + 256 - param4 + param14) / param14 > param11) {
          param10 = param11;
        }
        param5 = param5 << 1;
        param10 = param10 << 1;
        while (param5 < param10) {
          param1 = param4 >> 8;
          param0 = param2[param1 - 1];
          param0 = (param0 << 8) + (param2[param1] - param0) * (param4 & 255);
          incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          incrementValue$7 = param5;
          param5++;
          param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
          param7 = param7 + param9;
          param4 = param4 + param14;
        }
        if (param14 != 0) {
          param10 = (param5 >> 1) + (param12 - param4 + param14) / param14;
        }
        if (param14 == 0 ||
          (param5 >> 1) + (param12 - param4 + param14) / param14 > param11) {
          param10 = param11;
        }
        param10 = param10 << 1;
        param1 = param15;
        while (param5 < param10) {
          param0 = (param1 << 8) + (param2[param4 >> 8] - param1) * (param4 & 255);
          incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param7 = param7 + param9;
          param4 = param4 + param14;
        }
        param5 = param5 >> 1;
        param13.field_C = param13.field_C + param13.field_z * param5;
        param13.field_r = param6;
        param13.field_x = param7;
        param13.field_t = param4;
        return param5;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, vc param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        param2 = param2 >> 8;
        param8 = param8 >> 8;
        param4 = param4 << 2;
        param5 = param5 << 2;
        param6 = param3 + param2 - (param8 - 1);
        if (param3 + param2 - (param8 - 1) > param7) {
          param6 = param7;
        }
        param9.field_r = param9.field_r + param9.field_E * (param6 - param3);
        param9.field_x = param9.field_x + param9.field_y * (param6 - param3);
        param6 -= 3;
        while (param3 < param6) {
          incrementValue$0 = param3;
          param3++;
          incrementValue$1 = param2;
          param2--;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          param4 = param4 + param5;
          incrementValue$2 = param3;
          param3++;
          incrementValue$3 = param2;
          param2--;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          param4 = param4 + param5;
          incrementValue$4 = param3;
          param3++;
          incrementValue$5 = param2;
          param2--;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          param4 = param4 + param5;
          incrementValue$6 = param3;
          param3++;
          incrementValue$7 = param2;
          param2--;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
          param4 = param4 + param5;
        }
        param6 += 3;
        while (param3 < param6) {
          incrementValue$8 = param3;
          param3++;
          incrementValue$9 = param2;
          param2--;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
          param4 = param4 + param5;
        }
        param9.field_C = param4 >> 2;
        param9.field_t = param2 << 8;
        return param3;
    }

    private vc(bi param0, int param1, int param2) {
        this.field_n = (ob) ((Object) param0);
        this.field_u = param0.field_p;
        this.field_s = param0.field_r;
        this.field_v = param0.field_q;
        this.field_B = param1;
        this.field_A = param2;
        this.field_w = 8192;
        this.field_t = 0;
        this.h();
    }

    private vc(bi param0, int param1, int param2, int param3) {
        this.field_n = (ob) ((Object) param0);
        this.field_u = param0.field_p;
        this.field_s = param0.field_r;
        this.field_v = param0.field_q;
        this.field_B = param1;
        this.field_A = param2;
        this.field_w = param3;
        this.field_t = 0;
        this.h();
    }
}
