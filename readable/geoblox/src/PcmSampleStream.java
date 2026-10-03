/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSampleStream extends ia {
    private int field_v;
    private int field_l;
    private int field_j;
    private int field_n;
    private int field_s;
    private int field_o;
    private int field_u;
    private int field_q;
    private int sampleStepFixed;
    private int field_m;
    private boolean field_r;
    private int field_k;
    private int samplePositionFixed;
    private int field_w;
    private int field_t;

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        L0: {
          if (param12 != 0) {
            param8 = param5 + (param10 + 256 - param4 + param12) / param12;
            if (param5 + (param10 + 256 - param4 + param12) / param12 <= param9) {
              break L0;
            }
          }
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
        L3: {
          if (param12 != 0) {
            param8 = (param5 >> 1) + (param10 - param4 + param12) / param12;
            if ((param5 >> 1) + (param10 - param4 + param12) / param12 <= param9) {
              break L3;
            }
          }
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
        param11.samplePositionFixed = param4;
        return param5 >> 1;
    }

    final synchronized void f(int param0) {
        this.b(param0, this.k());
    }

    final int d() {
        if (this.field_u == 0 && this.field_l == 0) {
            return 0;
        }
        return 1;
    }

    private final boolean j() {
        int var1;
        int var2;
        int var3;
        var1 = this.field_u;
        if (var1 != -2147483648) {
          var2 = PcmSampleStream.e(var1, this.field_o);
          var3 = PcmSampleStream.d(var1, this.field_o);
        } else {
          var3 = 0;
          var2 = 0;
          var1 = 0;
        }
        if ((this.field_k == var1) &&
            (this.field_n == var2) &&
            (this.field_s == var3)) {
          if (this.field_u != -2147483648) {
            this.e();
            return false;
          }
          this.field_u = 0;
          this.field_s = 0;
          this.field_n = 0;
          this.field_k = 0;
          this.unlinkNode(false);
          return true;
        }
        if (this.field_k >= var1) {
          if (this.field_k <= var1) {
            this.field_j = 0;
          } else {
            this.field_j = -1;
            this.field_l = this.field_k - var1;
          }
        } else {
          this.field_j = 1;
          this.field_l = var1 - this.field_k;
        }
        L3: {
          if (this.field_n >= var2) {
            if (this.field_n <= var2) {
              this.field_t = 0;
            } else {
              this.field_t = -1;
              if ((this.field_l != 0) &&
                  (this.field_l <= this.field_n - var2)) {
                break L3;
              }
              this.field_l = this.field_n - var2;
            }
          } else {
            this.field_t = 1;
            if ((this.field_l != 0) &&
                (this.field_l <= var2 - this.field_n)) {
              break L3;
            }
            this.field_l = var2 - this.field_n;
          }
        }
        if (this.field_s < var3) {
          this.field_w = 1;
          if ((this.field_l != 0) &&
              (this.field_l <= var3 - this.field_s)) {
            return false;
          }
          this.field_l = var3 - this.field_s;
          return false;
        }
        L6: {
          if (this.field_s <= var3) {
            this.field_w = 0;
          } else {
            this.field_w = -1;
            if ((this.field_l != 0) &&
                (this.field_l <= this.field_s - var3)) {
              break L6;
            }
            this.field_l = this.field_s - var3;
          }
        }
        return false;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        while (true) {
          if (this.field_l <= 0) {
            if ((this.sampleStepFixed == -256) &&
                ((this.samplePositionFixed & 255) == 0)) {
              if (AudioOutput.field_q) {
                return PcmSampleStream.b(0, ((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_n, this.field_s, 0, param3, param2, (PcmSampleStream) (this));
              }
              return PcmSampleStream.b(((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_k, 0, param3, param2, (PcmSampleStream) (this));
            }
            if (AudioOutput.field_q) {
              return PcmSampleStream.d(0, 0, ((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_n, this.field_s, 0, param3, param2, (PcmSampleStream) (this), this.sampleStepFixed, param4);
            }
            return PcmSampleStream.a(0, 0, ((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_k, 0, param3, param2, (PcmSampleStream) (this), this.sampleStepFixed, param4);
          }
          var6 = param1 + this.field_l;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_l = this.field_l + param1;
          if ((this.sampleStepFixed == -256) &&
              ((this.samplePositionFixed & 255) == 0)) {
            if (!AudioOutput.field_q) {
              param1 = PcmSampleStream.a(((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_k, this.field_j, 0, var6, param2, (PcmSampleStream) (this));
            } else {
              param1 = PcmSampleStream.a(0, ((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_n, this.field_s, this.field_t, this.field_w, 0, var6, param2, (PcmSampleStream) (this));
            }
          } else {
            if (!AudioOutput.field_q) {
              param1 = PcmSampleStream.a(0, 0, ((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_k, this.field_j, 0, var6, param2, (PcmSampleStream) (this), this.sampleStepFixed, param4);
            } else {
              param1 = PcmSampleStream.b(0, 0, ((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_n, this.field_s, this.field_t, this.field_w, 0, var6, param2, (PcmSampleStream) (this), this.sampleStepFixed, param4);
            }
          }
          this.field_l = this.field_l - param1;
          if (this.field_l != 0) {
            return param1;
          }
          if (!this.j()) {
            continue;
          }
          return param3;
        }
    }

    final ia b() {
        return null;
    }

    final synchronized int i() {
        return this.field_u == -2147483648 ? 0 : this.field_u;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        while (true) {
          if (this.field_l <= 0) {
            if ((this.sampleStepFixed == 256) &&
                ((this.samplePositionFixed & 255) == 0)) {
              if (AudioOutput.field_q) {
                return PcmSampleStream.a(0, ((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_n, this.field_s, 0, param3, param2, (PcmSampleStream) (this));
              }
              return PcmSampleStream.a(((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_k, 0, param3, param2, (PcmSampleStream) (this));
            }
            if (AudioOutput.field_q) {
              return PcmSampleStream.b(0, 0, ((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_n, this.field_s, 0, param3, param2, (PcmSampleStream) (this), this.sampleStepFixed, param4);
            }
            return PcmSampleStream.b(0, 0, ((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_k, 0, param3, param2, (PcmSampleStream) (this), this.sampleStepFixed, param4);
          }
          var6 = param1 + this.field_l;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_l = this.field_l + param1;
          if ((this.sampleStepFixed == 256) &&
              ((this.samplePositionFixed & 255) == 0)) {
            if (!AudioOutput.field_q) {
              param1 = PcmSampleStream.b(((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_k, this.field_j, 0, var6, param2, (PcmSampleStream) (this));
            } else {
              param1 = PcmSampleStream.b(0, ((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_n, this.field_s, this.field_t, this.field_w, 0, var6, param2, (PcmSampleStream) (this));
            }
          } else {
            if (!AudioOutput.field_q) {
              param1 = PcmSampleStream.c(0, 0, ((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_k, this.field_j, 0, var6, param2, (PcmSampleStream) (this), this.sampleStepFixed, param4);
            } else {
              param1 = PcmSampleStream.a(0, 0, ((PcmSample) ((Object) this.field_g)).samples, param0, this.samplePositionFixed, param1, this.field_n, this.field_s, this.field_t, this.field_w, 0, var6, param2, (PcmSampleStream) (this), this.sampleStepFixed, param4);
            }
          }
          this.field_l = this.field_l - param1;
          if (this.field_l != 0) {
            return param1;
          }
          if (!this.j()) {
            continue;
          }
          return param3;
        }
    }

    final int a() {
        int var1 = this.field_k * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.field_v == 0) {
            var1 = var1 - var1 * this.samplePositionFixed / (((PcmSample) ((Object) this.field_g)).samples.length << 8);
        } else {
            if (this.field_v >= 0) {
                var1 = var1 - var1 * this.field_q / ((PcmSample) ((Object) this.field_g)).samples.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    final synchronized void c(int param0, int param1) {
        this.a(param0, param1, this.k());
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmSampleStream param9) {
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
        param9.field_n = param9.field_n + param9.field_t * (param6 - param3);
        param9.field_s = param9.field_s + param9.field_w * (param6 - param3);
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
        param9.field_k = param4 >> 2;
        param9.samplePositionFixed = param2 << 8;
        return param3;
    }

    private final static int e(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        L0: {
          if (param12 != 0) {
            param8 = param5 + (param10 - param4 + param12 - 257) / param12;
            if (param5 + (param10 - param4 + param12 - 257) / param12 <= param9) {
              break L0;
            }
          }
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
        L3: {
          if (param12 != 0) {
            param8 = (param5 >> 1) + (param10 - param4 + param12 - 1) / param12;
            if ((param5 >> 1) + (param10 - param4 + param12 - 1) / param12 <= param9) {
              break L3;
            }
          }
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
        param11.samplePositionFixed = param4;
        return param5 >> 1;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, PcmSampleStream param8) {
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
        param8.samplePositionFixed = param2 << 8;
        return param3;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmSampleStream param12) {
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
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
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
        param12.field_k = param12.field_k + param12.field_j * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        while (param4 < param9) {
            incrementValue$0 = param3;
            param3--;
            param0 = param1[incrementValue$0];
            incrementValue$1 = param4;
            param4++;
            param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$2 = param4;
            param4++;
            param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
            param6 = param6 + param8;
            incrementValue$3 = param3;
            param3--;
            param0 = param1[incrementValue$3];
            incrementValue$4 = param4;
            param4++;
            param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$5 = param4;
            param4++;
            param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
            param6 = param6 + param8;
            incrementValue$6 = param3;
            param3--;
            param0 = param1[incrementValue$6];
            incrementValue$7 = param4;
            param4++;
            param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$8 = param4;
            param4++;
            param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
            param6 = param6 + param8;
            incrementValue$9 = param3;
            param3--;
            param0 = param1[incrementValue$9];
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
            incrementValue$12 = param3;
            param3--;
            param0 = param1[incrementValue$12];
            incrementValue$13 = param4;
            param4++;
            param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$14 = param4;
            param4++;
            param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
            param6 = param6 + param8;
        }
        param12.field_n = param5 >> 2;
        param12.field_s = param6 >> 2;
        param12.samplePositionFixed = param3 << 8;
        return param4 >> 1;
    }

    final ia c() {
        return null;
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        if (param0 == 0) {
            this.f(0);
            this.unlinkNode(false);
            return;
        }
        if (this.field_n != 0) {
            var2 = -this.field_k;
            if (this.field_k > var2) {
                var2 = this.field_k;
            }
            if (-this.field_n > var2) {
                var2 = -this.field_n;
            }
            if (this.field_n > var2) {
                var2 = this.field_n;
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
            this.field_l = param0;
            this.field_u = -2147483648;
            this.field_j = -this.field_k / param0;
            this.field_t = -this.field_n / param0;
            this.field_w = -this.field_s / param0;
            return;
        }
        if (this.field_s != 0) {
            var2 = -this.field_k;
            if (this.field_k > var2) {
                var2 = this.field_k;
            }
            if (-this.field_n > var2) {
                var2 = -this.field_n;
            }
            if (this.field_n > var2) {
                var2 = this.field_n;
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
            this.field_l = param0;
            this.field_u = -2147483648;
            this.field_j = -this.field_k / param0;
            this.field_t = -this.field_n / param0;
            this.field_w = -this.field_s / param0;
            return;
        }
        this.field_l = 0;
        this.field_u = 0;
        this.field_k = 0;
        this.unlinkNode(false);
    }

    private final synchronized void b(int param0, int param1) {
        this.field_u = param0;
        this.field_o = param1;
        this.field_l = 0;
        this.e();
    }

    final synchronized void b(boolean param0) {
        this.sampleStepFixed = (this.sampleStepFixed ^ this.sampleStepFixed >> 31) + (this.sampleStepFixed >>> 31);
        if (!param0) {
            return;
        }
        this.sampleStepFixed = -this.sampleStepFixed;
    }

    final synchronized void g(int param0) {
        this.field_v = param0;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmSampleStream param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        L0: {
          param13.field_k = param13.field_k - param13.field_j * param5;
          if (param14 != 0) {
            param10 = param5 + (param12 - param4 + param14 - 257) / param14;
            if (param5 + (param12 - param4 + param14 - 257) / param14 <= param11) {
              break L0;
            }
          }
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
        L3: {
          if (param14 != 0) {
            param10 = (param5 >> 1) + (param12 - param4 + param14 - 1) / param14;
            if ((param5 >> 1) + (param12 - param4 + param14 - 1) / param14 <= param11) {
              break L3;
            }
          }
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
        param13.field_k = param13.field_k + param13.field_j * param5;
        param13.field_n = param6;
        param13.field_s = param7;
        param13.samplePositionFixed = param4;
        return param5;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10, int param11, int param12) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        L0: {
          if (param11 != 0) {
            param7 = param5 + (param9 + 256 - param4 + param11) / param11;
            if (param5 + (param9 + 256 - param4 + param11) / param11 <= param8) {
              break L0;
            }
          }
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
        L3: {
          if (param11 != 0) {
            param7 = param5 + (param9 - param4 + param11) / param11;
            if (param5 + (param9 - param4 + param11) / param11 <= param8) {
              break L3;
            }
          }
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
        param10.samplePositionFixed = param4;
        return param5;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmSampleStream param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        L0: {
          param13.field_k = param13.field_k - param13.field_j * param5;
          if (param14 != 0) {
            param10 = param5 + (param12 + 256 - param4 + param14) / param14;
            if (param5 + (param12 + 256 - param4 + param14) / param14 <= param11) {
              break L0;
            }
          }
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
        L3: {
          if (param14 != 0) {
            param10 = (param5 >> 1) + (param12 - param4 + param14) / param14;
            if ((param5 >> 1) + (param12 - param4 + param14) / param14 <= param11) {
              break L3;
            }
          }
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
        param13.field_k = param13.field_k + param13.field_j * param5;
        param13.field_n = param6;
        param13.field_s = param7;
        param13.samplePositionFixed = param4;
        return param5;
    }

    final synchronized boolean g() {
        return this.field_l != 0;
    }

    final synchronized void d(int param0) {
        if (this.sampleStepFixed < 0) {
            this.sampleStepFixed = -param0;
        } else {
            this.sampleStepFixed = param0;
        }
    }

    final synchronized void e(int param0) {
        int var2 = ((PcmSample) ((Object) this.field_g)).samples.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        this.samplePositionFixed = param0;
    }

    private final static int d(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    final synchronized int h() {
        return this.sampleStepFixed < 0 ? -this.sampleStepFixed : this.sampleStepFixed;
    }

    final synchronized void b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        PcmSample var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (this.field_l > 0) {
          if (param0 < this.field_l) {
            this.field_k = this.field_k + this.field_j * param0;
            this.field_n = this.field_n + this.field_t * param0;
            this.field_s = this.field_s + this.field_w * param0;
            this.field_l = this.field_l - param0;
          } else {
            if (this.field_u == -2147483648) {
              this.field_u = 0;
              this.field_s = 0;
              this.field_n = 0;
              this.field_k = 0;
              this.unlinkNode(false);
              param0 = this.field_l;
            }
            this.field_l = 0;
            this.e();
          }
        }
        var2 = (PcmSample) ((Object) this.field_g);
        var3 = this.field_q << 8;
        var4 = this.field_m << 8;
        var5 = var2.samples.length << 8;
        var6 = var4 - var3;
        if (var6 <= 0) {
          this.field_v = 0;
        }
        if (this.samplePositionFixed < 0) {
          if (this.sampleStepFixed <= 0) {
            this.f();
            this.unlinkNode(false);
            return;
          }
          this.samplePositionFixed = 0;
        }
        if (this.samplePositionFixed >= var5) {
          if (this.sampleStepFixed >= 0) {
            this.f();
            this.unlinkNode(false);
            return;
          }
          this.samplePositionFixed = var5 - 1;
        }
        this.samplePositionFixed = this.samplePositionFixed + this.sampleStepFixed * param0;
        if (this.field_v < 0) {
          if (!this.field_r) {
            if (this.sampleStepFixed >= 0) {
              if (this.samplePositionFixed < var4) {
                return;
              }
              this.samplePositionFixed = var3 + (this.samplePositionFixed - var3) % var6;
              return;
            }
            if (this.samplePositionFixed >= var3) {
              return;
            }
            this.samplePositionFixed = var4 - 1 - (var4 - 1 - this.samplePositionFixed) % var6;
            return;
          }
          if (this.sampleStepFixed < 0) {
            if (this.samplePositionFixed >= var3) {
              return;
            }
            this.samplePositionFixed = var3 + var3 - 1 - this.samplePositionFixed;
            this.sampleStepFixed = -this.sampleStepFixed;
          }
          while (this.samplePositionFixed >= var4) {
            this.samplePositionFixed = var4 + var4 - 1 - this.samplePositionFixed;
            this.sampleStepFixed = -this.sampleStepFixed;
            if (this.samplePositionFixed >= var3) {
              return;
            }
            this.samplePositionFixed = var3 + var3 - 1 - this.samplePositionFixed;
            this.sampleStepFixed = -this.sampleStepFixed;
          }
          return;
        }
        L5: {
          if (this.field_v > 0) {
            if (!this.field_r) {
              if (this.sampleStepFixed >= 0) {
                if (this.samplePositionFixed < var4) {
                  return;
                }
                var7 = (this.samplePositionFixed - var3) / var6;
                if (var7 >= this.field_v) {
                  this.samplePositionFixed = this.samplePositionFixed - var6 * this.field_v;
                  this.field_v = 0;
                  break L5;
                }
                this.samplePositionFixed = this.samplePositionFixed - var6 * var7;
                this.field_v = this.field_v - var7;
              } else {
                if (this.samplePositionFixed >= var3) {
                  return;
                }
                var7 = (var4 - 1 - this.samplePositionFixed) / var6;
                if (var7 >= this.field_v) {
                  this.samplePositionFixed = this.samplePositionFixed + var6 * this.field_v;
                  this.field_v = 0;
                  break L5;
                }
                this.samplePositionFixed = this.samplePositionFixed + var6 * var7;
                this.field_v = this.field_v - var7;
              }
              return;
            }
            if (this.sampleStepFixed < 0) {
              if (this.samplePositionFixed >= var3) {
                return;
              }
              this.samplePositionFixed = var3 + var3 - 1 - this.samplePositionFixed;
              this.sampleStepFixed = -this.sampleStepFixed;
              fieldTemp$0 = this.field_v - 1;
              this.field_v = this.field_v - 1;
              if (fieldTemp$0 == 0) {
                break L5;
              }
            }
            while (true) {
              if (this.samplePositionFixed < var4) {
                return;
              }
              this.samplePositionFixed = var4 + var4 - 1 - this.samplePositionFixed;
              this.sampleStepFixed = -this.sampleStepFixed;
              fieldTemp$1 = this.field_v - 1;
              this.field_v = this.field_v - 1;
              if (fieldTemp$1 == 0) {
                break L5;
              }
              if (this.samplePositionFixed >= var3) {
                return;
              }
              this.samplePositionFixed = var3 + var3 - 1 - this.samplePositionFixed;
              this.sampleStepFixed = -this.sampleStepFixed;
              fieldTemp$2 = this.field_v - 1;
              this.field_v = this.field_v - 1;
              if (fieldTemp$2 != 0) {
                continue;
              }
              break L5;
            }
          }
        }
        if (this.sampleStepFixed >= 0) {
          if (this.samplePositionFixed >= var5) {
            this.samplePositionFixed = var5;
            this.f();
            this.unlinkNode(false);
          }
          return;
        }
        if (this.samplePositionFixed >= 0) {
          return;
        }
        this.samplePositionFixed = -1;
        this.f();
        this.unlinkNode(false);
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10) {
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
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
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
            incrementValue$0 = param3;
            param3++;
            param0 = param1[incrementValue$0];
            incrementValue$1 = param4;
            param4++;
            param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
            incrementValue$2 = param4;
            param4++;
            param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
            incrementValue$3 = param3;
            param3++;
            param0 = param1[incrementValue$3];
            incrementValue$4 = param4;
            param4++;
            param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
            incrementValue$5 = param4;
            param4++;
            param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
            incrementValue$6 = param3;
            param3++;
            param0 = param1[incrementValue$6];
            incrementValue$7 = param4;
            param4++;
            param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
            incrementValue$8 = param4;
            param4++;
            param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
            incrementValue$9 = param3;
            param3++;
            param0 = param1[incrementValue$9];
            incrementValue$10 = param4;
            param4++;
            param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
            incrementValue$11 = param4;
            param4++;
            param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
        }
        param7 += 6;
        while (param4 < param7) {
            incrementValue$12 = param3;
            param3++;
            param0 = param1[incrementValue$12];
            incrementValue$13 = param4;
            param4++;
            param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
            incrementValue$14 = param4;
            param4++;
            param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
        }
        param10.samplePositionFixed = param3 << 8;
        return param4 >> 1;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, PcmSampleStream param8) {
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
        param8.samplePositionFixed = param2 << 8;
        return param3;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int discarded$4 = 0;
        int discarded$3 = 0;
        PcmSample var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        if ((this.field_u == 0) &&
            (this.field_l == 0)) {
          this.b(param2);
          return;
        }
        var4 = (PcmSample) ((Object) this.field_g);
        var5 = this.field_q << 8;
        var6 = this.field_m << 8;
        var7 = var4.samples.length << 8;
        var8 = var6 - var5;
        if (var8 <= 0) {
          this.field_v = 0;
        }
        var9 = param1;
        param2 = param2 + param1;
        if (this.samplePositionFixed < 0) {
          if (this.sampleStepFixed <= 0) {
            this.f();
            this.unlinkNode(false);
            return;
          }
          this.samplePositionFixed = 0;
        }
        if (this.samplePositionFixed >= var7) {
          if (this.sampleStepFixed >= 0) {
            this.f();
            this.unlinkNode(false);
            return;
          }
          this.samplePositionFixed = var7 - 1;
        }
        if (this.field_v < 0) {
          if (!this.field_r) {
            if (this.sampleStepFixed >= 0) {
              while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.samples[this.field_q]);
                if (this.samplePositionFixed < var6) {
                  return;
                }
                this.samplePositionFixed = var5 + (this.samplePositionFixed - var5) % var8;
                continue;
              }
            }
            while (true) {
              var9 = this.a(param0, var9, var5, param2, (int) var4.samples[this.field_m - 1]);
              if (this.samplePositionFixed >= var5) {
                return;
              }
              this.samplePositionFixed = var6 - 1 - (var6 - 1 - this.samplePositionFixed) % var8;
              continue;
            }
          }
          if (this.sampleStepFixed < 0) {
            var9 = this.a(param0, var9, var5, param2, (int) var4.samples[this.field_q]);
            if (this.samplePositionFixed >= var5) {
              return;
            }
            this.samplePositionFixed = var5 + var5 - 1 - this.samplePositionFixed;
            this.sampleStepFixed = -this.sampleStepFixed;
          }
          while (true) {
            var9 = this.b(param0, var9, var6, param2, (int) var4.samples[this.field_m - 1]);
            if (this.samplePositionFixed < var6) {
              return;
            }
            this.samplePositionFixed = var6 + var6 - 1 - this.samplePositionFixed;
            this.sampleStepFixed = -this.sampleStepFixed;
            var9 = this.a(param0, var9, var5, param2, (int) var4.samples[this.field_q]);
            if (this.samplePositionFixed >= var5) {
              return;
            }
            this.samplePositionFixed = var5 + var5 - 1 - this.samplePositionFixed;
            this.sampleStepFixed = -this.sampleStepFixed;
            continue;
          }
        }
        L4: {
          if (this.field_v > 0) {
            if (!this.field_r) {
              if (this.sampleStepFixed < 0) {
                while (true) {
                  var9 = this.a(param0, var9, var5, param2, (int) var4.samples[this.field_m - 1]);
                  if (this.samplePositionFixed >= var5) {
                    return;
                  }
                  var10 = (var6 - 1 - this.samplePositionFixed) / var8;
                  if (var10 < this.field_v) {
                    this.samplePositionFixed = this.samplePositionFixed + var8 * var10;
                    this.field_v = this.field_v - var10;
                    continue;
                  }
                  this.samplePositionFixed = this.samplePositionFixed + var8 * this.field_v;
                  this.field_v = 0;
                  break L4;
                }
              }
              while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.samples[this.field_q]);
                if (this.samplePositionFixed < var6) {
                  return;
                }
                var10 = (this.samplePositionFixed - var5) / var8;
                if (var10 < this.field_v) {
                  this.samplePositionFixed = this.samplePositionFixed - var8 * var10;
                  this.field_v = this.field_v - var10;
                  continue;
                }
                this.samplePositionFixed = this.samplePositionFixed - var8 * this.field_v;
                this.field_v = 0;
                break L4;
              }
            }
            if (this.sampleStepFixed < 0) {
              var9 = this.a(param0, var9, var5, param2, (int) var4.samples[this.field_q]);
              if (this.samplePositionFixed >= var5) {
                return;
              }
              this.samplePositionFixed = var5 + var5 - 1 - this.samplePositionFixed;
              this.sampleStepFixed = -this.sampleStepFixed;
              fieldTemp$0 = this.field_v - 1;
              this.field_v = this.field_v - 1;
              if (fieldTemp$0 == 0) {
                break L4;
              }
            }
            while (true) {
              var9 = this.b(param0, var9, var6, param2, (int) var4.samples[this.field_m - 1]);
              if (this.samplePositionFixed < var6) {
                return;
              }
              this.samplePositionFixed = var6 + var6 - 1 - this.samplePositionFixed;
              this.sampleStepFixed = -this.sampleStepFixed;
              fieldTemp$1 = this.field_v - 1;
              this.field_v = this.field_v - 1;
              if (fieldTemp$1 == 0) {
                break L4;
              }
              var9 = this.a(param0, var9, var5, param2, (int) var4.samples[this.field_q]);
              if (this.samplePositionFixed >= var5) {
                return;
              }
              this.samplePositionFixed = var5 + var5 - 1 - this.samplePositionFixed;
              this.sampleStepFixed = -this.sampleStepFixed;
              fieldTemp$2 = this.field_v - 1;
              this.field_v = this.field_v - 1;
              if (fieldTemp$2 != 0) {
                continue;
              }
              break L4;
            }
          }
        }
        if (this.sampleStepFixed >= 0) {
          discarded$4 = this.b(param0, var9, var7, param2, 0);
          if (this.samplePositionFixed >= var7) {
            this.samplePositionFixed = var7;
            this.f();
            this.unlinkNode(false);
          }
          return;
        }
        discarded$3 = this.a(param0, var9, 0, param2, 0);
        if (this.samplePositionFixed >= 0) {
          return;
        }
        this.samplePositionFixed = -1;
        this.f();
        this.unlinkNode(false);
        return;
    }

    private final void e() {
        this.field_k = this.field_u;
        this.field_n = PcmSampleStream.e(this.field_u, this.field_o);
        this.field_s = PcmSampleStream.d(this.field_u, this.field_o);
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        L0: {
          param11.field_n = param11.field_n - param11.field_t * param5;
          param11.field_s = param11.field_s - param11.field_w * param5;
          if (param12 != 0) {
            param8 = param5 + (param10 + 256 - param4 + param12) / param12;
            if (param5 + (param10 + 256 - param4 + param12) / param12 <= param9) {
              break L0;
            }
          }
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
        L3: {
          if (param12 != 0) {
            param8 = param5 + (param10 - param4 + param12) / param12;
            if (param5 + (param10 - param4 + param12) / param12 <= param9) {
              break L3;
            }
          }
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
        param11.field_n = param11.field_n + param11.field_t * param5;
        param11.field_s = param11.field_s + param11.field_w * param5;
        param11.field_k = param6;
        param11.samplePositionFixed = param4;
        return param5;
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var6 = 0;
        if (param0 == 0) {
            this.b(param1, param2);
            return;
        }
        int var4 = PcmSampleStream.e(param1, param2);
        int var5 = PcmSampleStream.d(param1, param2);
        if (this.field_n != var4) {
            var6 = param1 - this.field_k;
            if (this.field_k - param1 > var6) {
                var6 = this.field_k - param1;
            }
            if (var4 - this.field_n > var6) {
                var6 = var4 - this.field_n;
            }
            if (this.field_n - var4 > var6) {
                var6 = this.field_n - var4;
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
            this.field_l = param0;
            this.field_u = param1;
            this.field_o = param2;
            this.field_j = (param1 - this.field_k) / param0;
            this.field_t = (var4 - this.field_n) / param0;
            this.field_w = (var5 - this.field_s) / param0;
            return;
        }
        if (this.field_s != var5) {
            var6 = param1 - this.field_k;
            if (this.field_k - param1 > var6) {
                var6 = this.field_k - param1;
            }
            if (var4 - this.field_n > var6) {
                var6 = var4 - this.field_n;
            }
            if (this.field_n - var4 > var6) {
                var6 = this.field_n - var4;
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
            this.field_l = param0;
            this.field_u = param1;
            this.field_o = param2;
            this.field_j = (param1 - this.field_k) / param0;
            this.field_t = (var4 - this.field_n) / param0;
            this.field_w = (var5 - this.field_s) / param0;
            return;
        }
        this.field_l = 0;
    }

    private final void f() {
        if (this.field_l != 0) {
            if (this.field_u == -2147483648) {
                this.field_u = 0;
            }
            this.field_l = 0;
            this.e();
            return;
        }
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        L0: {
          param11.field_n = param11.field_n - param11.field_t * param5;
          param11.field_s = param11.field_s - param11.field_w * param5;
          if (param12 != 0) {
            param8 = param5 + (param10 - param4 + param12 - 257) / param12;
            if (param5 + (param10 - param4 + param12 - 257) / param12 <= param9) {
              break L0;
            }
          }
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
        L3: {
          if (param12 != 0) {
            param8 = param5 + (param10 - param4 + param12 - 1) / param12;
            if (param5 + (param10 - param4 + param12 - 1) / param12 <= param9) {
              break L3;
            }
          }
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
        param11.field_n = param11.field_n + param11.field_t * param5;
        param11.field_s = param11.field_s + param11.field_w * param5;
        param11.field_k = param6;
        param11.samplePositionFixed = param4;
        return param5;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmSampleStream param9) {
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
        param9.field_n = param9.field_n + param9.field_t * (param6 - param3);
        param9.field_s = param9.field_s + param9.field_w * (param6 - param3);
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
        param9.field_k = param4 >> 2;
        param9.samplePositionFixed = param2 << 8;
        return param3;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmSampleStream param12) {
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
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
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
        param12.field_k = param12.field_k + param12.field_j * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        while (param4 < param9) {
            incrementValue$0 = param3;
            param3++;
            param0 = param1[incrementValue$0];
            incrementValue$1 = param4;
            param4++;
            param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$2 = param4;
            param4++;
            param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
            param6 = param6 + param8;
            incrementValue$3 = param3;
            param3++;
            param0 = param1[incrementValue$3];
            incrementValue$4 = param4;
            param4++;
            param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$5 = param4;
            param4++;
            param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
            param6 = param6 + param8;
            incrementValue$6 = param3;
            param3++;
            param0 = param1[incrementValue$6];
            incrementValue$7 = param4;
            param4++;
            param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$8 = param4;
            param4++;
            param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
            param6 = param6 + param8;
            incrementValue$9 = param3;
            param3++;
            param0 = param1[incrementValue$9];
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
            incrementValue$12 = param3;
            param3++;
            param0 = param1[incrementValue$12];
            incrementValue$13 = param4;
            param4++;
            param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$14 = param4;
            param4++;
            param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
            param6 = param6 + param8;
        }
        param12.field_n = param5 >> 2;
        param12.field_s = param6 >> 2;
        param12.samplePositionFixed = param3 << 8;
        return param4 >> 1;
    }

    final static PcmSampleStream a(PcmSample param0, int param1, int param2, int param3) {
        if (param0.samples == null) {
            return null;
        }
        if (param0.samples.length != 0) {
            return new PcmSampleStream(param0, param1, param2, param3);
        }
        return null;
    }

    final synchronized int k() {
        return this.field_o < 0 ? -1 : this.field_o;
    }

    final synchronized boolean isSamplePositionOutOfRange() {
        return this.samplePositionFixed < 0 || this.samplePositionFixed >= ((PcmSample) ((Object) this.field_g)).samples.length << 8;
    }

    final static PcmSampleStream createForPlaybackRate(PcmSample sample, int ratePercent, int volume) {
        if (sample.samples == null) {
            return null;
        }
        if (sample.samples.length != 0) {
            return new PcmSampleStream(sample, (int)((long)sample.sampleRateHz * 256L * (long)ratePercent / (long)(100 * AudioOutput.sampleRateHz)), volume << 6);
        }
        return null;
    }

    private PcmSampleStream(PcmSample param0, int param1, int param2) {
        this.field_g = (e) ((Object) param0);
        this.field_q = param0.loopStart;
        this.field_m = param0.loopEnd;
        this.field_r = param0.pingPongLoop;
        this.sampleStepFixed = param1;
        this.field_u = param2;
        this.field_o = 8192;
        this.samplePositionFixed = 0;
        this.e();
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10, int param11, int param12) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        L0: {
          if (param11 != 0) {
            param7 = param5 + (param9 - param4 + param11 - 257) / param11;
            if (param5 + (param9 - param4 + param11 - 257) / param11 <= param8) {
              break L0;
            }
          }
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
        L3: {
          if (param11 != 0) {
            param7 = param5 + (param9 - param4 + param11 - 1) / param11;
            if (param5 + (param9 - param4 + param11 - 1) / param11 <= param8) {
              break L3;
            }
          }
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
        param10.samplePositionFixed = param4;
        return param5;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10) {
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
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
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
            incrementValue$0 = param3;
            param3--;
            param0 = param1[incrementValue$0];
            incrementValue$1 = param4;
            param4++;
            param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
            incrementValue$2 = param4;
            param4++;
            param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
            incrementValue$3 = param3;
            param3--;
            param0 = param1[incrementValue$3];
            incrementValue$4 = param4;
            param4++;
            param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
            incrementValue$5 = param4;
            param4++;
            param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
            incrementValue$6 = param3;
            param3--;
            param0 = param1[incrementValue$6];
            incrementValue$7 = param4;
            param4++;
            param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
            incrementValue$8 = param4;
            param4++;
            param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
            incrementValue$9 = param3;
            param3--;
            param0 = param1[incrementValue$9];
            incrementValue$10 = param4;
            param4++;
            param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
            incrementValue$11 = param4;
            param4++;
            param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
        }
        param7 += 6;
        while (param4 < param7) {
            incrementValue$12 = param3;
            param3--;
            param0 = param1[incrementValue$12];
            incrementValue$13 = param4;
            param4++;
            param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
            incrementValue$14 = param4;
            param4++;
            param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
        }
        param10.samplePositionFixed = param3 << 8;
        return param4 >> 1;
    }

    private PcmSampleStream(PcmSample param0, int param1, int param2, int param3) {
        this.field_g = (e) ((Object) param0);
        this.field_q = param0.loopStart;
        this.field_m = param0.loopEnd;
        this.field_r = param0.pingPongLoop;
        this.sampleStepFixed = param1;
        this.field_u = param2;
        this.field_o = param3;
        this.samplePositionFixed = 0;
        this.e();
    }
}
