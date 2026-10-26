/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSampleStream extends PcmStream {
    private int field_r;
    private int field_u;
    private int field_p;
    private boolean field_m;
    private int field_o;
    private int field_i;
    private int field_q;
    private int field_j;
    private int field_s;
    private int field_k;
    private int field_t;
    private int field_l;
    private int field_w;
    private int field_v;
    private int field_n;

    final static PcmSampleStream a(PcmSample param0, int param1, int param2, int param3) {
        if (param0.samples == null) {
          return null;
        }
        if (param0.samples.length != 0) {
          return new PcmSampleStream(param0, param1, param2, param3);
        }
        return null;
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
        param11.field_i = param11.field_i - param11.field_k * param5;
        param11.field_p = param11.field_p - param11.field_o * param5;
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
          int incrementValue$3 = param5;
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
          int incrementValue$2 = param5;
          param5++;
          param3[incrementValue$2] = param3[incrementValue$2] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
          param6 = param6 + param7;
          param4 = param4 + param1;
        }
        param11.field_i = param11.field_i + param11.field_k * param5;
        param11.field_p = param11.field_p + param11.field_o * param5;
        param11.field_j = param6;
        param11.field_v = param4;
        return param5;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
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
          int incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          int incrementValue$7 = param5;
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
          int incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          int incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param4 = param4 + param12;
        }
        param11.field_v = param4;
        return param5 >> 1;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10, int param11, int param12) {
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
          int incrementValue$1 = param5;
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
          int incrementValue$0 = param5;
          param5++;
          param3[incrementValue$0] = param3[incrementValue$0] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
          param4 = param4 + param11;
        }
        param10.field_v = param4;
        return param5;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmSampleStream param12) {
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
        param12.field_j = param12.field_j + param12.field_l * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        while (param4 < param9) {
          param0 = param1[param3--];
          int incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3--];
          int incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3--];
          int incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3--];
          int incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
          param6 = param6 + param8;
        }
        param9 += 6;
        while (param4 < param9) {
          param0 = param1[param3--];
          int incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
          param6 = param6 + param8;
        }
        param12.field_i = param5 >> 2;
        param12.field_p = param6 >> 2;
        param12.field_v = param3 << 8;
        return param4 >> 1;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
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
          int incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          int incrementValue$7 = param5;
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
          int incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          int incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param4 = param4 + param12;
        }
        param11.field_v = param4;
        return param5 >> 1;
    }

    private final static int c(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final void k() {
        this.field_j = this.field_u;
        this.field_i = PcmSampleStream.b(this.field_u, this.field_q);
        this.field_p = PcmSampleStream.c(this.field_u, this.field_q);
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmSampleStream param9) {
        param2 = param2 >> 8;
        param8 = param8 >> 8;
        param4 = param4 << 2;
        param5 = param5 << 2;
        param6 = param3 + param2 - (param8 - 1);
        if (param3 + param2 - (param8 - 1) > param7) {
          param6 = param7;
        }
        param9.field_i = param9.field_i + param9.field_k * (param6 - param3);
        param9.field_p = param9.field_p + param9.field_o * (param6 - param3);
        param6 -= 3;
        while (param3 < param6) {
          int incrementValue$0 = param3;
          param3++;
          int incrementValue$1 = param2;
          param2--;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          param4 = param4 + param5;
          int incrementValue$2 = param3;
          param3++;
          int incrementValue$3 = param2;
          param2--;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          param4 = param4 + param5;
          int incrementValue$4 = param3;
          param3++;
          int incrementValue$5 = param2;
          param2--;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          param4 = param4 + param5;
          int incrementValue$6 = param3;
          param3++;
          int incrementValue$7 = param2;
          param2--;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
          param4 = param4 + param5;
        }
        param6 += 3;
        while (param3 < param6) {
          int incrementValue$8 = param3;
          param3++;
          int incrementValue$9 = param2;
          param2--;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
          param4 = param4 + param5;
        }
        param9.field_j = param4 >> 2;
        param9.field_v = param2 << 8;
        return param3;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10) {
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
          int incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          int incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param0 = param1[param3--];
          int incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          int incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param0 = param1[param3--];
          int incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          int incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param0 = param1[param3--];
          int incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          int incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
        }
        param7 += 6;
        while (param4 < param7) {
          param0 = param1[param3--];
          int incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          int incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
        }
        param10.field_v = param3 << 8;
        return param4 >> 1;
    }

    final synchronized void h(int param0) {
        if (param0 == 0) {
          this.f(0);
          this.unlink(-123);
          return;
        }
        if (this.field_i != 0) {
          int var2 = -this.field_j;
          if (this.field_j > var2) {
            var2 = this.field_j;
          }
          if (-this.field_i > var2) {
            var2 = -this.field_i;
          }
          if (this.field_i > var2) {
            var2 = this.field_i;
          }
          if (-this.field_p > var2) {
            var2 = -this.field_p;
          }
          if (this.field_p > var2) {
            var2 = this.field_p;
          }
          if (param0 > var2) {
            param0 = var2;
          }
          this.field_w = param0;
          this.field_u = -2147483648;
          this.field_l = -this.field_j / param0;
          this.field_k = -this.field_i / param0;
          this.field_o = -this.field_p / param0;
          return;
        }
        if (this.field_p != 0) {
          int var2Lifetime1 = -this.field_j;
          if (this.field_j > var2Lifetime1) {
            var2Lifetime1 = this.field_j;
          }
          if (-this.field_i > var2Lifetime1) {
            var2Lifetime1 = -this.field_i;
          }
          if (this.field_i > var2Lifetime1) {
            var2Lifetime1 = this.field_i;
          }
          if (-this.field_p > var2Lifetime1) {
            var2Lifetime1 = -this.field_p;
          }
          if (this.field_p > var2Lifetime1) {
            var2Lifetime1 = this.field_p;
          }
          if (param0 > var2Lifetime1) {
            param0 = var2Lifetime1;
          }
          this.field_w = param0;
          this.field_u = -2147483648;
          this.field_l = -this.field_j / param0;
          this.field_k = -this.field_i / param0;
          this.field_o = -this.field_p / param0;
          return;
        }
        this.field_w = 0;
        this.field_u = 0;
        this.field_j = 0;
        this.unlink(-123);
    }

    private final void e() {
        if (this.field_w != 0) {
          if (this.field_u == -2147483648) {
            this.field_u = 0;
          }
          this.field_w = 0;
          this.k();
          return;
        }
    }

    final synchronized boolean j() {
        return this.field_w != 0;
    }

    final PcmStream b() {
        return null;
    }

    final synchronized void a(int param0, int param1, int param2) {
        if (param0 == 0) {
          this.a(param1, param2);
          return;
        }
        int var4 = PcmSampleStream.b(param1, param2);
        int var5 = PcmSampleStream.c(param1, param2);
        if (this.field_i != var4) {
          int var6 = param1 - this.field_j;
          if (this.field_j - param1 > var6) {
            var6 = this.field_j - param1;
          }
          if (var4 - this.field_i > var6) {
            var6 = var4 - this.field_i;
          }
          if (this.field_i - var4 > var6) {
            var6 = this.field_i - var4;
          }
          if (var5 - this.field_p > var6) {
            var6 = var5 - this.field_p;
          }
          if (this.field_p - var5 > var6) {
            var6 = this.field_p - var5;
          }
          if (param0 > var6) {
            param0 = var6;
          }
          this.field_w = param0;
          this.field_u = param1;
          this.field_q = param2;
          this.field_l = (param1 - this.field_j) / param0;
          this.field_k = (var4 - this.field_i) / param0;
          this.field_o = (var5 - this.field_p) / param0;
          return;
        }
        if (this.field_p != var5) {
          int var6Lifetime1 = param1 - this.field_j;
          if (this.field_j - param1 > var6Lifetime1) {
            var6Lifetime1 = this.field_j - param1;
          }
          if (var4 - this.field_i > var6Lifetime1) {
            var6Lifetime1 = var4 - this.field_i;
          }
          if (this.field_i - var4 > var6Lifetime1) {
            var6Lifetime1 = this.field_i - var4;
          }
          if (var5 - this.field_p > var6Lifetime1) {
            var6Lifetime1 = var5 - this.field_p;
          }
          if (this.field_p - var5 > var6Lifetime1) {
            var6Lifetime1 = this.field_p - var5;
          }
          if (param0 > var6Lifetime1) {
            param0 = var6Lifetime1;
          }
          this.field_w = param0;
          this.field_u = param1;
          this.field_q = param2;
          this.field_l = (param1 - this.field_j) / param0;
          this.field_k = (var4 - this.field_i) / param0;
          this.field_o = (var5 - this.field_p) / param0;
          return;
        }
        this.field_w = 0;
    }

    private final static int b(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        do {
          if (this.field_w <= 0) {
            if (this.field_r == 256 &&
              (this.field_v & 255) == 0) {
              if (tk.field_r) {
                return PcmSampleStream.b(0, ((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_i, this.field_p, 0, param3, param2, this);
              }
              return PcmSampleStream.a(((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_j, 0, param3, param2, this);
            }
            if (tk.field_r) {
              return PcmSampleStream.a(0, 0, ((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_i, this.field_p, 0, param3, param2, this, this.field_r, param4);
            }
            return PcmSampleStream.a(0, 0, ((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_j, 0, param3, param2, this, this.field_r, param4);
          }
          int var6 = param1 + this.field_w;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_w = this.field_w + param1;
          if (this.field_r == 256 &&
            (this.field_v & 255) == 0) {
            if (!tk.field_r) {
              param1 = PcmSampleStream.a(((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_j, this.field_l, 0, var6, param2, this);
            } else {
              param1 = PcmSampleStream.a(0, ((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_i, this.field_p, this.field_k, this.field_o, 0, var6, param2, this);
            }
          } else if (!tk.field_r) {
            param1 = PcmSampleStream.c(0, 0, ((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_j, this.field_l, 0, var6, param2, this, this.field_r, param4);
          } else {
            param1 = PcmSampleStream.b(0, 0, ((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_i, this.field_p, this.field_k, this.field_o, 0, var6, param2, this, this.field_r, param4);
          }
          this.field_w = this.field_w - param1;
          if (this.field_w != 0) {
            return param1;
          }
        } while (!this.h());
        return param3;
    }

    final synchronized void f(int param0) {
        this.a(param0, this.g());
    }

    final synchronized int l() {
        return this.field_r < 0 ? -this.field_r : this.field_r;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmSampleStream param12) {
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
        param12.field_j = param12.field_j + param12.field_l * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        while (param4 < param9) {
          param0 = param1[param3++];
          int incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3++];
          int incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3++];
          int incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3++];
          int incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
          param6 = param6 + param8;
        }
        param9 += 6;
        while (param4 < param9) {
          param0 = param1[param3++];
          int incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
          param6 = param6 + param8;
        }
        param12.field_i = param5 >> 2;
        param12.field_p = param6 >> 2;
        param12.field_v = param3 << 8;
        return param4 >> 1;
    }

    private final boolean h() {
        int var2;
        int var3;
        int var1 = this.field_u;
        if (var1 != -2147483648) {
          var2 = PcmSampleStream.b(var1, this.field_q);
          var3 = PcmSampleStream.c(var1, this.field_q);
        } else {
          var3 = 0;
          var2 = 0;
          var1 = 0;
        }
        if (this.field_j == var1 &&
          this.field_i == var2 &&
          this.field_p == var3) {
          if (this.field_u != -2147483648) {
            this.k();
            return false;
          }
          this.field_u = 0;
          this.field_p = 0;
          this.field_i = 0;
          this.field_j = 0;
          this.unlink(-128);
          return true;
        }
        if (!(this.field_j >= var1)) {
          this.field_l = 1;
          this.field_w = var1 - this.field_j;
        } else if (this.field_j <= var1) {
          this.field_l = 0;
        } else {
          this.field_l = -1;
          this.field_w = this.field_j - var1;
        }
        if (!(this.field_i >= var2)) {
          this.field_k = 1;
          if (this.field_w == 0 ||
            this.field_w > var2 - this.field_i) {
            this.field_w = var2 - this.field_i;
          }
        } else if (this.field_i <= var2) {
          this.field_k = 0;
        } else {
          this.field_k = -1;
          if (this.field_w == 0 ||
            this.field_w > this.field_i - var2) {
            this.field_w = this.field_i - var2;
          }
        }
        if (this.field_p < var3) {
          this.field_o = 1;
          if (this.field_w != 0 &&
            this.field_w <= var3 - this.field_p) {
            return false;
          }
          this.field_w = var3 - this.field_p;
          return false;
        }
        if (this.field_p <= var3) {
          this.field_o = 0;
        } else {
          this.field_o = -1;
          if (this.field_w == 0 ||
            this.field_w > this.field_p - var3) {
            this.field_w = this.field_p - var3;
          }
        }
        return false;
    }

    final synchronized void a(int param0) {
        int fieldTemp$2 = 0;
        int var7;
        if (this.field_w > 0) {
          if (param0 < this.field_w) {
            this.field_j = this.field_j + this.field_l * param0;
            this.field_i = this.field_i + this.field_k * param0;
            this.field_p = this.field_p + this.field_o * param0;
            this.field_w = this.field_w - param0;
          } else {
            if (this.field_u == -2147483648) {
              this.field_u = 0;
              this.field_p = 0;
              this.field_i = 0;
              this.field_j = 0;
              this.unlink(-125);
              param0 = this.field_w;
            }
            this.field_w = 0;
            this.k();
          }
        }
        PcmSample var2 = (PcmSample) (this.field_f);
        int var3 = this.field_s << 8;
        int var4 = this.field_t << 8;
        int var5 = var2.samples.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
          this.field_n = 0;
        }
        if (this.field_v < 0) {
          if (this.field_r <= 0) {
            this.e();
            this.unlink(-126);
            return;
          }
          this.field_v = 0;
        }
        if (this.field_v >= var5) {
          if (this.field_r >= 0) {
            this.e();
            this.unlink(-128);
            return;
          }
          this.field_v = var5 - 1;
        }
        this.field_v = this.field_v + this.field_r * param0;
        if (this.field_n < 0) {
          if (!this.field_m) {
            if (this.field_r >= 0) {
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
          if (this.field_r < 0) {
            if (this.field_v >= var3) {
              return;
            }
            this.field_v = var3 + var3 - 1 - this.field_v;
            this.field_r = -this.field_r;
          }
          while (this.field_v >= var4) {
            this.field_v = var4 + var4 - 1 - this.field_v;
            this.field_r = -this.field_r;
            if (this.field_v >= var3) {
              return;
            }
            this.field_v = var3 + var3 - 1 - this.field_v;
            this.field_r = -this.field_r;
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_n > 0) {
          if (!this.field_m) {
            if (this.field_r >= 0) {
              if (this.field_v < var4) {
                return;
              }
              var7 = (this.field_v - var3) / var6;
              if (var7 >= this.field_n) {
                this.field_v = this.field_v - var6 * this.field_n;
                this.field_n = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_v = this.field_v - var6 * var7;
                this.field_n = this.field_n - var7;
              }
            } else {
              if (this.field_v >= var3) {
                return;
              }
              var7 = (var4 - 1 - this.field_v) / var6;
              if (var7 >= this.field_n) {
                this.field_v = this.field_v + var6 * this.field_n;
                this.field_n = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_v = this.field_v + var6 * var7;
                this.field_n = this.field_n - var7;
              }
            }
            if (decompiledFrameRemainder0) {
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_r < 0) {
              if (this.field_v >= var3) {
                return;
              }
              this.field_v = var3 + var3 - 1 - this.field_v;
              this.field_r = -this.field_r;
              int fieldTemp$0 = this.field_n - 1;
              this.field_n = this.field_n - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                if (this.field_v < var4) {
                  return;
                }
                this.field_v = var4 + var4 - 1 - this.field_v;
                this.field_r = -this.field_r;
                int fieldTemp$1 = this.field_n - 1;
                this.field_n = this.field_n - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                if (this.field_v >= var3) {
                  return;
                }
                this.field_v = var3 + var3 - 1 - this.field_v;
                this.field_r = -this.field_r;
                fieldTemp$2 = this.field_n - 1;
                this.field_n = this.field_n - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.field_r >= 0) {
          if (this.field_v >= var5) {
            this.field_v = var5;
            this.e();
            this.unlink(-128);
          }
          return;
        }
        if (this.field_v >= 0) {
          return;
        }
        this.field_v = -1;
        this.e();
        this.unlink(-126);
    }

    final synchronized int i() {
        return this.field_u == -2147483648 ? 0 : this.field_u;
    }

    final PcmStream a() {
        return null;
    }

    final synchronized void e(int param0) {
        int var2 = ((PcmSample) (this.field_f)).samples.length << 8;
        if (param0 < -1) {
          param0 = -1;
        }
        if (param0 > var2) {
          param0 = var2;
        }
        this.field_v = param0;
    }

    private final synchronized void a(int param0, int param1) {
        this.field_u = param0;
        this.field_q = param1;
        this.field_w = 0;
        this.k();
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int fieldTemp$2 = 0;
        if (this.field_u == 0 &&
          this.field_w == 0) {
          this.a(param2);
          return;
        }
        PcmSample var4 = (PcmSample) (this.field_f);
        int var5 = this.field_s << 8;
        int var6 = this.field_t << 8;
        int var7 = var4.samples.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
          this.field_n = 0;
        }
        int var9 = param1;
        param2 = param2 + param1;
        if (this.field_v < 0) {
          if (this.field_r <= 0) {
            this.e();
            this.unlink(-127);
            return;
          }
          this.field_v = 0;
        }
        if (this.field_v >= var7) {
          if (this.field_r >= 0) {
            this.e();
            this.unlink(-125);
            return;
          }
          this.field_v = var7 - 1;
        }
        if (this.field_n < 0) {
          if (!this.field_m) {
            if (this.field_r >= 0) {
              while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.samples[this.field_s]);
                if (this.field_v < var6) {
                  return;
                }
                this.field_v = var5 + (this.field_v - var5) % var8;
              }
            }
            while (true) {
              var9 = this.a(param0, var9, var5, param2, (int) var4.samples[this.field_t - 1]);
              if (this.field_v >= var5) {
                return;
              }
              this.field_v = var6 - 1 - (var6 - 1 - this.field_v) % var8;
            }
          }
          if (this.field_r < 0) {
            var9 = this.a(param0, var9, var5, param2, (int) var4.samples[this.field_s]);
            if (this.field_v >= var5) {
              return;
            }
            this.field_v = var5 + var5 - 1 - this.field_v;
            this.field_r = -this.field_r;
          }
          while (true) {
            var9 = this.b(param0, var9, var6, param2, (int) var4.samples[this.field_t - 1]);
            if (this.field_v < var6) {
              return;
            }
            this.field_v = var6 + var6 - 1 - this.field_v;
            this.field_r = -this.field_r;
            var9 = this.a(param0, var9, var5, param2, (int) var4.samples[this.field_s]);
            if (this.field_v >= var5) {
              return;
            }
            this.field_v = var5 + var5 - 1 - this.field_v;
            this.field_r = -this.field_r;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_n > 0) {
          if (!this.field_m) {
            if (this.field_r < 0) {
              while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) var4.samples[this.field_t - 1]);
                if (this.field_v >= var5) {
                  return;
                }
                int var10 = (var6 - 1 - this.field_v) / var8;
                if (var10 < this.field_n) {
                  this.field_v = this.field_v + var8 * var10;
                  this.field_n = this.field_n - var10;
                  continue;
                }
                break;
              }
              this.field_v = this.field_v + var8 * this.field_n;
              this.field_n = 0;
            } else {
              while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.samples[this.field_s]);
                if (this.field_v < var6) {
                  return;
                }
                int var10Lifetime1 = (this.field_v - var5) / var8;
                if (var10Lifetime1 < this.field_n) {
                  this.field_v = this.field_v - var8 * var10Lifetime1;
                  this.field_n = this.field_n - var10Lifetime1;
                  continue;
                }
                break;
              }
              this.field_v = this.field_v - var8 * this.field_n;
              this.field_n = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_r < 0) {
              var9 = this.a(param0, var9, var5, param2, (int) var4.samples[this.field_s]);
              if (this.field_v >= var5) {
                return;
              }
              this.field_v = var5 + var5 - 1 - this.field_v;
              this.field_r = -this.field_r;
              int fieldTemp$0 = this.field_n - 1;
              this.field_n = this.field_n - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                var9 = this.b(param0, var9, var6, param2, (int) var4.samples[this.field_t - 1]);
                if (this.field_v < var6) {
                  return;
                }
                this.field_v = var6 + var6 - 1 - this.field_v;
                this.field_r = -this.field_r;
                int fieldTemp$1 = this.field_n - 1;
                this.field_n = this.field_n - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                var9 = this.a(param0, var9, var5, param2, (int) var4.samples[this.field_s]);
                if (this.field_v >= var5) {
                  return;
                }
                this.field_v = var5 + var5 - 1 - this.field_v;
                this.field_r = -this.field_r;
                fieldTemp$2 = this.field_n - 1;
                this.field_n = this.field_n - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.field_r >= 0) {
          int discarded$4 = this.b(param0, var9, var7, param2, 0);
          if (this.field_v >= var7) {
            this.field_v = var7;
            this.e();
            this.unlink(-123);
          }
          return;
        }
        int discarded$3 = this.a(param0, var9, 0, param2, 0);
        if (this.field_v >= 0) {
          return;
        }
        this.field_v = -1;
        this.e();
        this.unlink(-127);
        return;
    }

    final static PcmSampleStream a(PcmSample param0, int param1, int param2) {
        if (param0.samples == null) {
          return null;
        }
        if (param0.samples.length != 0) {
          return new PcmSampleStream(param0, (int)((long)param0.sampleRate * 256L * (long)param1 / (long)(100 * tk.field_f)), param2 << 6);
        }
        return null;
    }

    final synchronized void d(int param0) {
        this.field_n = param0;
    }

    final synchronized int g() {
        return this.field_q < 0 ? -1 : this.field_q;
    }

    final synchronized boolean f() {
        return this.field_v < 0 || this.field_v >= ((PcmSample) (this.field_f)).samples.length << 8;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        do {
          if (this.field_w <= 0) {
            if (this.field_r == -256 &&
              (this.field_v & 255) == 0) {
              if (tk.field_r) {
                return PcmSampleStream.a(0, ((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_i, this.field_p, 0, param3, param2, this);
              }
              return PcmSampleStream.b(((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_j, 0, param3, param2, this);
            }
            if (tk.field_r) {
              return PcmSampleStream.b(0, 0, ((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_i, this.field_p, 0, param3, param2, this, this.field_r, param4);
            }
            return PcmSampleStream.b(0, 0, ((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_j, 0, param3, param2, this, this.field_r, param4);
          }
          int var6 = param1 + this.field_w;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_w = this.field_w + param1;
          if (this.field_r == -256 &&
            (this.field_v & 255) == 0) {
            if (!tk.field_r) {
              param1 = PcmSampleStream.b(((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_j, this.field_l, 0, var6, param2, this);
            } else {
              param1 = PcmSampleStream.b(0, ((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_i, this.field_p, this.field_k, this.field_o, 0, var6, param2, this);
            }
          } else if (!tk.field_r) {
            param1 = PcmSampleStream.d(0, 0, ((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_j, this.field_l, 0, var6, param2, this, this.field_r, param4);
          } else {
            param1 = PcmSampleStream.a(0, 0, ((PcmSample) (this.field_f)).samples, param0, this.field_v, param1, this.field_i, this.field_p, this.field_k, this.field_o, 0, var6, param2, this, this.field_r, param4);
          }
          this.field_w = this.field_w - param1;
          if (this.field_w != 0) {
            return param1;
          }
        } while (!this.h());
        return param3;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10) {
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
          int incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          int incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param0 = param1[param3++];
          int incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          int incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param0 = param1[param3++];
          int incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          int incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param0 = param1[param3++];
          int incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          int incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
        }
        param7 += 6;
        while (param4 < param7) {
          param0 = param1[param3++];
          int incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          int incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
        }
        param10.field_v = param3 << 8;
        return param4 >> 1;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, PcmSampleStream param8) {
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param7 - param2;
        if (param3 + param7 - param2 > param6) {
          param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
          int incrementValue$0 = param3;
          param3++;
          int incrementValue$1 = param2;
          param2++;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          int incrementValue$2 = param3;
          param3++;
          int incrementValue$3 = param2;
          param2++;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          int incrementValue$4 = param3;
          param3++;
          int incrementValue$5 = param2;
          param2++;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          int incrementValue$6 = param3;
          param3++;
          int incrementValue$7 = param2;
          param2++;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
          int incrementValue$8 = param3;
          param3++;
          int incrementValue$9 = param2;
          param2++;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
        }
        param8.field_v = param2 << 8;
        return param3;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmSampleStream param9) {
        param2 = param2 >> 8;
        param8 = param8 >> 8;
        param4 = param4 << 2;
        param5 = param5 << 2;
        param6 = param3 + param8 - param2;
        if (param3 + param8 - param2 > param7) {
          param6 = param7;
        }
        param9.field_i = param9.field_i + param9.field_k * (param6 - param3);
        param9.field_p = param9.field_p + param9.field_o * (param6 - param3);
        param6 -= 3;
        while (param3 < param6) {
          int incrementValue$0 = param3;
          param3++;
          int incrementValue$1 = param2;
          param2++;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          param4 = param4 + param5;
          int incrementValue$2 = param3;
          param3++;
          int incrementValue$3 = param2;
          param2++;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          param4 = param4 + param5;
          int incrementValue$4 = param3;
          param3++;
          int incrementValue$5 = param2;
          param2++;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          param4 = param4 + param5;
          int incrementValue$6 = param3;
          param3++;
          int incrementValue$7 = param2;
          param2++;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
          param4 = param4 + param5;
        }
        param6 += 3;
        while (param3 < param6) {
          int incrementValue$8 = param3;
          param3++;
          int incrementValue$9 = param2;
          param2++;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
          param4 = param4 + param5;
        }
        param9.field_j = param4 >> 2;
        param9.field_v = param2 << 8;
        return param3;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10, int param11, int param12) {
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
          int incrementValue$1 = param5;
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
          int incrementValue$0 = param5;
          param5++;
          param3[incrementValue$0] = param3[incrementValue$0] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
          param4 = param4 + param1;
        }
        param10.field_v = param4;
        return param5;
    }

    final synchronized void d(int param0, int param1) {
        this.a(param0, param1, this.g());
    }

    final int c() {
        int var1 = this.field_j * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.field_n == 0) {
          var1 = var1 - var1 * this.field_v / (((PcmSample) (this.field_f)).samples.length << 8);
        } else if (this.field_n >= 0) {
          var1 = var1 - var1 * this.field_s / ((PcmSample) (this.field_f)).samples.length;
        }
        return var1 > 255 ? 255 : var1;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmSampleStream param13, int param14, int param15) {
        param13.field_j = param13.field_j - param13.field_l * param5;
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
          int incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          int incrementValue$7 = param5;
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
          int incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          int incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param7 = param7 + param9;
          param4 = param4 + param14;
        }
        param5 = param5 >> 1;
        param13.field_j = param13.field_j + param13.field_l * param5;
        param13.field_i = param6;
        param13.field_p = param7;
        param13.field_v = param4;
        return param5;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
        param11.field_i = param11.field_i - param11.field_k * param5;
        param11.field_p = param11.field_p - param11.field_o * param5;
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
          int incrementValue$3 = param5;
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
          int incrementValue$2 = param5;
          param5++;
          param3[incrementValue$2] = param3[incrementValue$2] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
          param6 = param6 + param7;
          param4 = param4 + param12;
        }
        param11.field_i = param11.field_i + param11.field_k * param5;
        param11.field_p = param11.field_p + param11.field_o * param5;
        param11.field_j = param6;
        param11.field_v = param4;
        return param5;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, PcmSampleStream param8) {
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param2 - (param7 - 1);
        if (param3 + param2 - (param7 - 1) > param6) {
          param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
          int incrementValue$0 = param3;
          param3++;
          int incrementValue$1 = param2;
          param2--;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          int incrementValue$2 = param3;
          param3++;
          int incrementValue$3 = param2;
          param2--;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          int incrementValue$4 = param3;
          param3++;
          int incrementValue$5 = param2;
          param2--;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          int incrementValue$6 = param3;
          param3++;
          int incrementValue$7 = param2;
          param2--;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
          int incrementValue$8 = param3;
          param3++;
          int incrementValue$9 = param2;
          param2--;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
        }
        param8.field_v = param2 << 8;
        return param3;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmSampleStream param13, int param14, int param15) {
        param13.field_j = param13.field_j - param13.field_l * param5;
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
          int incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          int incrementValue$7 = param5;
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
          int incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          int incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param7 = param7 + param9;
          param4 = param4 + param14;
        }
        param5 = param5 >> 1;
        param13.field_j = param13.field_j + param13.field_l * param5;
        param13.field_i = param6;
        param13.field_p = param7;
        param13.field_v = param4;
        return param5;
    }

    final synchronized void a(boolean param0) {
        this.field_r = (this.field_r ^ this.field_r >> 31) + (this.field_r >>> 31);
        if (!param0) {
          return;
        }
        this.field_r = -this.field_r;
    }

    final int d() {
        if (this.field_u == 0 &&
          this.field_w == 0) {
          return 0;
        }
        return 1;
    }

    final synchronized void g(int param0) {
        if (this.field_r < 0) {
          this.field_r = -param0;
        } else {
          this.field_r = param0;
        }
    }

    private PcmSampleStream(PcmSample param0, int param1, int param2) {
        this.field_f = (gs) ((Object) param0);
        this.field_s = param0.loopStart;
        this.field_t = param0.loopEnd;
        this.field_m = param0.pingPongLoop;
        this.field_r = param1;
        this.field_u = param2;
        this.field_q = 8192;
        this.field_v = 0;
        this.k();
    }

    private PcmSampleStream(PcmSample param0, int param1, int param2, int param3) {
        this.field_f = (gs) ((Object) param0);
        this.field_s = param0.loopStart;
        this.field_t = param0.loopEnd;
        this.field_m = param0.pingPongLoop;
        this.field_r = param1;
        this.field_u = param2;
        this.field_q = param3;
        this.field_v = 0;
        this.k();
    }
}
