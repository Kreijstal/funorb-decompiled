/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends wh {
    private int field_x;
    private int field_w;
    private int field_z;
    private boolean field_q;
    private int field_s;
    private int field_n;
    private int field_A;
    private int field_u;
    private int field_v;
    private int field_t;
    private int field_y;
    private int field_o;
    private int field_r;
    private int field_p;
    private int field_m;

    final synchronized void j(int param0) {
        int var2 = ((ik) (this.field_i)).field_j.length << 8;
        if (param0 < -1) {
          param0 = -1;
        }
        if (param0 > var2) {
          param0 = var2;
        }
        this.field_v = param0;
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var6 = 0;
        int var6Lifetime1;
        if (param0 == 0) {
          this.b(param1, param2);
          return;
        }
        int var4 = bh.a(param1, param2);
        int var5 = bh.d(param1, param2);
        if (this.field_o != var4) {
          var6 = param1 - this.field_x;
          if (this.field_x - param1 > var6) {
            var6 = this.field_x - param1;
          }
          if (var4 - this.field_o > var6) {
            var6 = var4 - this.field_o;
          }
          if (this.field_o - var4 > var6) {
            var6 = this.field_o - var4;
          }
          if (var5 - this.field_s > var6) {
            var6 = var5 - this.field_s;
          }
          if (this.field_s - var5 > var6) {
            var6 = this.field_s - var5;
          }
          if (param0 > var6) {
            param0 = var6;
          }
          this.field_p = param0;
          this.field_r = param1;
          this.field_y = param2;
          this.field_m = (param1 - this.field_x) / param0;
          this.field_w = (var4 - this.field_o) / param0;
          this.field_t = (var5 - this.field_s) / param0;
          return;
        }
        if (this.field_s != var5) {
          var6Lifetime1 = param1 - this.field_x;
          if (this.field_x - param1 > var6Lifetime1) {
            var6Lifetime1 = this.field_x - param1;
          }
          if (var4 - this.field_o > var6Lifetime1) {
            var6Lifetime1 = var4 - this.field_o;
          }
          if (this.field_o - var4 > var6Lifetime1) {
            var6Lifetime1 = this.field_o - var4;
          }
          if (var5 - this.field_s > var6Lifetime1) {
            var6Lifetime1 = var5 - this.field_s;
          }
          if (this.field_s - var5 > var6Lifetime1) {
            var6Lifetime1 = this.field_s - var5;
          }
          if (param0 > var6Lifetime1) {
            param0 = var6Lifetime1;
          }
          this.field_p = param0;
          this.field_r = param1;
          this.field_y = param2;
          this.field_m = (param1 - this.field_x) / param0;
          this.field_w = (var4 - this.field_o) / param0;
          this.field_t = (var5 - this.field_s) / param0;
          return;
        }
        this.field_p = 0;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.field_p <= 0) {
            if (this.field_n == -256 &&
              (this.field_v & 255) == 0) {
              if (oa.field_k) {
                return bh.a(0, ((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_o, this.field_s, 0, param3, param2, this);
              }
              return bh.a(((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_x, 0, param3, param2, this);
            }
            if (oa.field_k) {
              return bh.d(0, 0, ((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_o, this.field_s, 0, param3, param2, this, this.field_n, param4);
            }
            return bh.b(0, 0, ((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_x, 0, param3, param2, this, this.field_n, param4);
          }
          var6 = param1 + this.field_p;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_p = this.field_p + param1;
          if (this.field_n == -256 &&
            (this.field_v & 255) == 0) {
            if (!oa.field_k) {
              param1 = bh.a(((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_x, this.field_m, 0, var6, param2, this);
            } else {
              param1 = bh.a(0, ((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_o, this.field_s, this.field_w, this.field_t, 0, var6, param2, this);
            }
          } else {
            if (!oa.field_k) {
              param1 = bh.b(0, 0, ((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_x, this.field_m, 0, var6, param2, this, this.field_n, param4);
            } else {
              param1 = bh.a(0, 0, ((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_o, this.field_s, this.field_w, this.field_t, 0, var6, param2, this, this.field_n, param4);
            }
          }
          this.field_p = this.field_p - param1;
          if (this.field_p != 0) {
            return param1;
          }
        } while (!this.l());
        return param3;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, bh param11, int param12, int param13) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        param11.field_o = param11.field_o - param11.field_w * param5;
        param11.field_s = param11.field_s - param11.field_t * param5;
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
        param11.field_o = param11.field_o + param11.field_w * param5;
        param11.field_s = param11.field_s + param11.field_t * param5;
        param11.field_x = param6;
        param11.field_v = param4;
        return param5;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, bh param8) {
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
        param8.field_v = param2 << 8;
        return param3;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, bh param11, int param12, int param13) {
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
        param11.field_v = param4;
        return param5 >> 1;
    }

    final wh b() {
        return null;
    }

    private final static int a(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, bh param12) {
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
        param12.field_x = param12.field_x + param12.field_m * (param9 - param4);
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
        param12.field_o = param5 >> 2;
        param12.field_s = param6 >> 2;
        param12.field_v = param3 << 8;
        return param4 >> 1;
    }

    final synchronized boolean j() {
        return this.field_v < 0 || this.field_v >= ((ik) (this.field_i)).field_j.length << 8;
    }

    final int c() {
        if (this.field_r == 0 &&
          this.field_p == 0) {
          return 0;
        }
        return 1;
    }

    private final void h() {
        this.field_x = this.field_r;
        this.field_o = bh.a(this.field_r, this.field_y);
        this.field_s = bh.d(this.field_r, this.field_y);
    }

    private final boolean l() {
        int var1;
        int var2;
        int var3;
        var1 = this.field_r;
        if (var1 != -2147483648) {
          var2 = bh.a(var1, this.field_y);
          var3 = bh.d(var1, this.field_y);
        } else {
          var3 = 0;
          var2 = 0;
          var1 = 0;
        }
        if (this.field_x == var1 &&
          this.field_o == var2 &&
          this.field_s == var3) {
          if (this.field_r != -2147483648) {
            this.h();
            return false;
          }
          this.field_r = 0;
          this.field_s = 0;
          this.field_o = 0;
          this.field_x = 0;
          this.a(-124);
          return true;
        }
        if (this.field_x >= var1) {
          if (this.field_x <= var1) {
            this.field_m = 0;
          } else {
            this.field_m = -1;
            this.field_p = this.field_x - var1;
          }
        } else {
          this.field_m = 1;
          this.field_p = var1 - this.field_x;
        }
        if (this.field_o >= var2) {
          if (this.field_o <= var2) {
            this.field_w = 0;
          } else {
            this.field_w = -1;
            if (this.field_p == 0 ||
              this.field_p > this.field_o - var2) {
              this.field_p = this.field_o - var2;
            }
          }
        } else {
          this.field_w = 1;
          if (this.field_p == 0 ||
            this.field_p > var2 - this.field_o) {
            this.field_p = var2 - this.field_o;
          }
        }
        if (this.field_s < var3) {
          this.field_t = 1;
          if (this.field_p != 0 &&
            this.field_p <= var3 - this.field_s) {
            return false;
          }
          this.field_p = var3 - this.field_s;
          return false;
        }
        if (this.field_s <= var3) {
          this.field_t = 0;
        } else {
          this.field_t = -1;
          if (this.field_p == 0 ||
            this.field_p > this.field_s - var3) {
            this.field_p = this.field_s - var3;
          }
        }
        return false;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, bh param10) {
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
        param10.field_v = param3 << 8;
        return param4 >> 1;
    }

    private final void k() {
        if (this.field_p != 0) {
          if (this.field_r == -2147483648) {
            this.field_r = 0;
          }
          this.field_p = 0;
          this.h();
          return;
        }
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, bh param9) {
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
        param9.field_o = param9.field_o + param9.field_w * (param6 - param3);
        param9.field_s = param9.field_s + param9.field_t * (param6 - param3);
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
        param9.field_x = param4 >> 2;
        param9.field_v = param2 << 8;
        return param3;
    }

    final synchronized boolean i() {
        return this.field_p != 0;
    }

    final synchronized void e(int param0) {
        param0 = param0 << 8;
        int var2 = ((ik) (this.field_i)).field_j.length << 8;
        if (param0 < -1) {
          param0 = -1;
        }
        if (param0 > var2) {
          param0 = var2;
        }
        this.field_v = param0;
    }

    final synchronized void h(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == 0) {
          this.g(0);
          this.a(-94);
          return;
        }
        if (this.field_o != 0) {
          var2 = -this.field_x;
          if (this.field_x > var2) {
            var2 = this.field_x;
          }
          if (-this.field_o > var2) {
            var2 = -this.field_o;
          }
          if (this.field_o > var2) {
            var2 = this.field_o;
          }
          if (-this.field_s > var2) {
            var2 = -this.field_s;
          }
          if (this.field_s > var2) {
            var2 = this.field_s;
          }
          if (param0 > var2) {
            param0 = var2;
          }
          this.field_p = param0;
          this.field_r = -2147483648;
          this.field_m = -this.field_x / param0;
          this.field_w = -this.field_o / param0;
          this.field_t = -this.field_s / param0;
          return;
        }
        if (this.field_s != 0) {
          var2Lifetime1 = -this.field_x;
          if (this.field_x > var2Lifetime1) {
            var2Lifetime1 = this.field_x;
          }
          if (-this.field_o > var2Lifetime1) {
            var2Lifetime1 = -this.field_o;
          }
          if (this.field_o > var2Lifetime1) {
            var2Lifetime1 = this.field_o;
          }
          if (-this.field_s > var2Lifetime1) {
            var2Lifetime1 = -this.field_s;
          }
          if (this.field_s > var2Lifetime1) {
            var2Lifetime1 = this.field_s;
          }
          if (param0 > var2Lifetime1) {
            param0 = var2Lifetime1;
          }
          this.field_p = param0;
          this.field_r = -2147483648;
          this.field_m = -this.field_x / param0;
          this.field_w = -this.field_o / param0;
          this.field_t = -this.field_s / param0;
          return;
        }
        this.field_p = 0;
        this.field_r = 0;
        this.field_x = 0;
        this.a(-84);
    }

    final synchronized void b(boolean param0) {
        this.field_n = (this.field_n ^ this.field_n >> 31) + (this.field_n >>> 31);
        if (!param0) {
          return;
        }
        this.field_n = -this.field_n;
    }

    final synchronized void g(int param0) {
        this.b(param0, this.g());
    }

    final static bh a(ik param0, int param1, int param2, int param3) {
        if (param0.field_j == null) {
          return null;
        }
        if (param0.field_j.length != 0) {
          return new bh(param0, param1, param2, param3);
        }
        return null;
    }

    final synchronized void i(int param0) {
        if (this.field_n < 0) {
          this.field_n = -param0;
        } else {
          this.field_n = param0;
        }
    }

    final static bh a(ik param0, int param1, int param2) {
        if (param0.field_j == null) {
          return null;
        }
        if (param0.field_j.length != 0) {
          return new bh(param0, (int)((long)param0.field_l * 256L * (long)param1 / (long)(100 * oa.field_h)), param2 << 6);
        }
        return null;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.field_p <= 0) {
            if (this.field_n == 256 &&
              (this.field_v & 255) == 0) {
              if (oa.field_k) {
                return bh.b(0, ((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_o, this.field_s, 0, param3, param2, this);
              }
              return bh.b(((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_x, 0, param3, param2, this);
            }
            if (oa.field_k) {
              return bh.a(0, 0, ((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_o, this.field_s, 0, param3, param2, this, this.field_n, param4);
            }
            return bh.a(0, 0, ((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_x, 0, param3, param2, this, this.field_n, param4);
          }
          var6 = param1 + this.field_p;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_p = this.field_p + param1;
          if (this.field_n == 256 &&
            (this.field_v & 255) == 0) {
            if (!oa.field_k) {
              param1 = bh.b(((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_x, this.field_m, 0, var6, param2, this);
            } else {
              param1 = bh.b(0, ((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_o, this.field_s, this.field_w, this.field_t, 0, var6, param2, this);
            }
          } else {
            if (!oa.field_k) {
              param1 = bh.c(0, 0, ((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_x, this.field_m, 0, var6, param2, this, this.field_n, param4);
            } else {
              param1 = bh.b(0, 0, ((ik) (this.field_i)).field_j, param0, this.field_v, param1, this.field_o, this.field_s, this.field_w, this.field_t, 0, var6, param2, this, this.field_n, param4);
            }
          }
          this.field_p = this.field_p - param1;
          if (this.field_p != 0) {
            return param1;
          }
        } while (!this.l());
        return param3;
    }

    private final static int d(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    final synchronized void c(int param0, int param1) {
        this.a(param0, param1, this.g());
    }

    final synchronized void d(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        ik var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (this.field_p > 0) {
          if (param0 < this.field_p) {
            this.field_x = this.field_x + this.field_m * param0;
            this.field_o = this.field_o + this.field_w * param0;
            this.field_s = this.field_s + this.field_t * param0;
            this.field_p = this.field_p - param0;
          } else {
            if (this.field_r == -2147483648) {
              this.field_r = 0;
              this.field_s = 0;
              this.field_o = 0;
              this.field_x = 0;
              this.a(-76);
              param0 = this.field_p;
            }
            this.field_p = 0;
            this.h();
          }
        }
        var2 = (ik) (this.field_i);
        var3 = this.field_A << 8;
        var4 = this.field_z << 8;
        var5 = var2.field_j.length << 8;
        var6 = var4 - var3;
        if (var6 <= 0) {
          this.field_u = 0;
        }
        if (this.field_v < 0) {
          if (this.field_n <= 0) {
            this.k();
            this.a(-37);
            return;
          }
          this.field_v = 0;
        }
        if (this.field_v >= var5) {
          if (this.field_n >= 0) {
            this.k();
            this.a(-40);
            return;
          }
          this.field_v = var5 - 1;
        }
        this.field_v = this.field_v + this.field_n * param0;
        if (this.field_u < 0) {
          if (!this.field_q) {
            if (this.field_n >= 0) {
              if (this.field_v < var4) {
                return;
              }
              this.field_v = var3 + (this.field_v - var3) % var6;
              return;
            }
            if (this.field_v >= var3) {
              return;
            }
            this.field_v = var4 - 1 - (var4 - 1 - this.field_v) % var6;
            return;
          }
          if (this.field_n < 0) {
            if (this.field_v >= var3) {
              return;
            }
            this.field_v = var3 + var3 - 1 - this.field_v;
            this.field_n = -this.field_n;
          }
          while (this.field_v >= var4) {
            this.field_v = var4 + var4 - 1 - this.field_v;
            this.field_n = -this.field_n;
            if (this.field_v >= var3) {
              return;
            }
            this.field_v = var3 + var3 - 1 - this.field_v;
            this.field_n = -this.field_n;
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_u > 0) {
          if (!this.field_q) {
            if (this.field_n >= 0) {
              if (this.field_v < var4) {
                return;
              }
              var7 = (this.field_v - var3) / var6;
              if (var7 >= this.field_u) {
                this.field_v = this.field_v - var6 * this.field_u;
                this.field_u = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_v = this.field_v - var6 * var7;
                this.field_u = this.field_u - var7;
              }
            } else {
              if (this.field_v >= var3) {
                return;
              }
              var7 = (var4 - 1 - this.field_v) / var6;
              if (var7 >= this.field_u) {
                this.field_v = this.field_v + var6 * this.field_u;
                this.field_u = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_v = this.field_v + var6 * var7;
                this.field_u = this.field_u - var7;
              }
            }
            if (decompiledFrameRemainder0) {
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_n < 0) {
              if (this.field_v >= var3) {
                return;
              }
              this.field_v = var3 + var3 - 1 - this.field_v;
              this.field_n = -this.field_n;
              fieldTemp$0 = this.field_u - 1;
              this.field_u = this.field_u - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                if (this.field_v < var4) {
                  return;
                }
                this.field_v = var4 + var4 - 1 - this.field_v;
                this.field_n = -this.field_n;
                fieldTemp$1 = this.field_u - 1;
                this.field_u = this.field_u - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                if (this.field_v >= var3) {
                  return;
                }
                this.field_v = var3 + var3 - 1 - this.field_v;
                this.field_n = -this.field_n;
                fieldTemp$2 = this.field_u - 1;
                this.field_u = this.field_u - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.field_n >= 0) {
          if (this.field_v >= var5) {
            this.field_v = var5;
            this.k();
            this.a(-72);
          }
          return;
        }
        if (this.field_v >= 0) {
          return;
        }
        this.field_v = -1;
        this.k();
        this.a(-88);
    }

    final synchronized void f(int param0) {
        this.field_u = param0;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, bh param9) {
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
        param9.field_o = param9.field_o + param9.field_w * (param6 - param3);
        param9.field_s = param9.field_s + param9.field_t * (param6 - param3);
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
        param9.field_x = param4 >> 2;
        param9.field_v = param2 << 8;
        return param3;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, bh param11, int param12, int param13) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        param11.field_o = param11.field_o - param11.field_w * param5;
        param11.field_s = param11.field_s - param11.field_t * param5;
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
        param11.field_o = param11.field_o + param11.field_w * param5;
        param11.field_s = param11.field_s + param11.field_t * param5;
        param11.field_x = param6;
        param11.field_v = param4;
        return param5;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, bh param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.field_x = param13.field_x - param13.field_m * param5;
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
        param13.field_x = param13.field_x + param13.field_m * param5;
        param13.field_o = param6;
        param13.field_s = param7;
        param13.field_v = param4;
        return param5;
    }

    final synchronized int g() {
        return this.field_y < 0 ? -1 : this.field_y;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, bh param10, int param11, int param12) {
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
        param10.field_v = param4;
        return param5;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, bh param12) {
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
        param12.field_x = param12.field_x + param12.field_m * (param9 - param4);
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
        param12.field_o = param5 >> 2;
        param12.field_s = param6 >> 2;
        param12.field_v = param3 << 8;
        return param4 >> 1;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, bh param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.field_x = param13.field_x - param13.field_m * param5;
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
        param13.field_x = param13.field_x + param13.field_m * param5;
        param13.field_o = param6;
        param13.field_s = param7;
        param13.field_v = param4;
        return param5;
    }

    final synchronized int f() {
        return this.field_n < 0 ? -this.field_n : this.field_n;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, bh param10) {
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
        param10.field_v = param3 << 8;
        return param4 >> 1;
    }

    private final synchronized void b(int param0, int param1) {
        this.field_r = param0;
        this.field_y = param1;
        this.field_p = 0;
        this.h();
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int discarded$4 = 0;
        int discarded$3 = 0;
        ik var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var10Lifetime1;
        if (this.field_r == 0 &&
          this.field_p == 0) {
          this.d(param2);
          return;
        }
        var4 = (ik) (this.field_i);
        var5 = this.field_A << 8;
        var6 = this.field_z << 8;
        var7 = var4.field_j.length << 8;
        var8 = var6 - var5;
        if (var8 <= 0) {
          this.field_u = 0;
        }
        var9 = param1;
        param2 = param2 + param1;
        if (this.field_v < 0) {
          if (this.field_n <= 0) {
            this.k();
            this.a(-106);
            return;
          }
          this.field_v = 0;
        }
        if (this.field_v >= var7) {
          if (this.field_n >= 0) {
            this.k();
            this.a(-86);
            return;
          }
          this.field_v = var7 - 1;
        }
        if (this.field_u < 0) {
          if (!this.field_q) {
            if (this.field_n >= 0) {
              while (true) {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_j[this.field_A]);
                if (this.field_v < var6) {
                  return;
                }
                this.field_v = var5 + (this.field_v - var5) % var8;
              }
            }
            while (true) {
              var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[this.field_z - 1]);
              if (this.field_v >= var5) {
                return;
              }
              this.field_v = var6 - 1 - (var6 - 1 - this.field_v) % var8;
            }
          }
          if (this.field_n < 0) {
            var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[this.field_A]);
            if (this.field_v >= var5) {
              return;
            }
            this.field_v = var5 + var5 - 1 - this.field_v;
            this.field_n = -this.field_n;
          }
          while (true) {
            var9 = this.a(param0, var9, var6, param2, (int) var4.field_j[this.field_z - 1]);
            if (this.field_v < var6) {
              return;
            }
            this.field_v = var6 + var6 - 1 - this.field_v;
            this.field_n = -this.field_n;
            var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[this.field_A]);
            if (this.field_v >= var5) {
              return;
            }
            this.field_v = var5 + var5 - 1 - this.field_v;
            this.field_n = -this.field_n;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_u > 0) {
          if (!this.field_q) {
            if (this.field_n < 0) {
              while (true) {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[this.field_z - 1]);
                if (this.field_v >= var5) {
                  return;
                }
                var10 = (var6 - 1 - this.field_v) / var8;
                if (var10 < this.field_u) {
                  this.field_v = this.field_v + var8 * var10;
                  this.field_u = this.field_u - var10;
                  continue;
                }
                break;
              }
              this.field_v = this.field_v + var8 * this.field_u;
              this.field_u = 0;
            } else {
              while (true) {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_j[this.field_A]);
                if (this.field_v < var6) {
                  return;
                }
                var10Lifetime1 = (this.field_v - var5) / var8;
                if (var10Lifetime1 < this.field_u) {
                  this.field_v = this.field_v - var8 * var10Lifetime1;
                  this.field_u = this.field_u - var10Lifetime1;
                  continue;
                }
                break;
              }
              this.field_v = this.field_v - var8 * this.field_u;
              this.field_u = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_n < 0) {
              var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[this.field_A]);
              if (this.field_v >= var5) {
                return;
              }
              this.field_v = var5 + var5 - 1 - this.field_v;
              this.field_n = -this.field_n;
              fieldTemp$0 = this.field_u - 1;
              this.field_u = this.field_u - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_j[this.field_z - 1]);
                if (this.field_v < var6) {
                  return;
                }
                this.field_v = var6 + var6 - 1 - this.field_v;
                this.field_n = -this.field_n;
                fieldTemp$1 = this.field_u - 1;
                this.field_u = this.field_u - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[this.field_A]);
                if (this.field_v >= var5) {
                  return;
                }
                this.field_v = var5 + var5 - 1 - this.field_v;
                this.field_n = -this.field_n;
                fieldTemp$2 = this.field_u - 1;
                this.field_u = this.field_u - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.field_n >= 0) {
          discarded$4 = this.a(param0, var9, var7, param2, 0);
          if (this.field_v >= var7) {
            this.field_v = var7;
            this.k();
            this.a(-76);
          }
          return;
        }
        discarded$3 = this.b(param0, var9, 0, param2, 0);
        if (this.field_v >= 0) {
          return;
        }
        this.field_v = -1;
        this.k();
        this.a(-23);
        return;
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, bh param11, int param12, int param13) {
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
        param11.field_v = param4;
        return param5 >> 1;
    }

    final wh a() {
        return null;
    }

    final synchronized int e() {
        return this.field_r == -2147483648 ? 0 : this.field_r;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, bh param8) {
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
        param8.field_v = param2 << 8;
        return param3;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, bh param10, int param11, int param12) {
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
        param10.field_v = param4;
        return param5;
    }

    final int d() {
        int var1 = this.field_x * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.field_u == 0) {
          var1 = var1 - var1 * this.field_v / (((ik) (this.field_i)).field_j.length << 8);
        } else {
          if (this.field_u >= 0) {
            var1 = var1 - var1 * this.field_A / ((ik) (this.field_i)).field_j.length;
          }
        }
        return var1 > 255 ? 255 : var1;
    }

    private bh(ik param0, int param1, int param2) {
        this.field_i = (lk) ((Object) param0);
        this.field_A = param0.field_m;
        this.field_z = param0.field_n;
        this.field_q = param0.field_k;
        this.field_n = param1;
        this.field_r = param2;
        this.field_y = 8192;
        this.field_v = 0;
        this.h();
    }

    private bh(ik param0, int param1, int param2, int param3) {
        this.field_i = (lk) ((Object) param0);
        this.field_A = param0.field_m;
        this.field_z = param0.field_n;
        this.field_q = param0.field_k;
        this.field_n = param1;
        this.field_r = param2;
        this.field_y = param3;
        this.field_v = 0;
        this.h();
    }
}
