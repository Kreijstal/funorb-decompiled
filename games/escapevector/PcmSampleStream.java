/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSampleStream extends PcmStream {
    private int field_p;
    private int field_l;
    private boolean field_w;
    private int field_y;
    private int field_n;
    private int field_t;
    private int field_u;
    private int field_m;
    private int field_x;
    private int field_v;
    private int field_s;
    private int field_o;
    private int field_k;
    private int field_r;
    private int field_q;

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        do {
          if (this.field_v <= 0) {
            if (this.field_y == 256 &&
              (this.field_u & 255) == 0) {
              if (AudioOutput.field_o) {
                return PcmSampleStream.b(0, ((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_x, this.field_s, 0, param3, param2, this);
              }
              return PcmSampleStream.a(((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_m, 0, param3, param2, this);
            }
            if (AudioOutput.field_o) {
              return PcmSampleStream.d(0, 0, ((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_x, this.field_s, 0, param3, param2, this, this.field_y, param4);
            }
            return PcmSampleStream.a(0, 0, ((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_m, 0, param3, param2, this, this.field_y, param4);
          }
          int var6 = param1 + this.field_v;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_v = this.field_v + param1;
          if (this.field_y == 256 &&
            (this.field_u & 255) == 0) {
            if (!AudioOutput.field_o) {
              param1 = PcmSampleStream.b(((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_m, this.field_k, 0, var6, param2, this);
            } else {
              param1 = PcmSampleStream.b(0, ((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_x, this.field_s, this.field_t, this.field_p, 0, var6, param2, this);
            }
          } else if (!AudioOutput.field_o) {
            param1 = PcmSampleStream.b(0, 0, ((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_m, this.field_k, 0, var6, param2, this, this.field_y, param4);
          } else {
            param1 = PcmSampleStream.a(0, 0, ((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_x, this.field_s, this.field_t, this.field_p, 0, var6, param2, this, this.field_y, param4);
          }
          this.field_v = this.field_v - param1;
          if (this.field_v != 0) {
            return param1;
          }
        } while (!this.i());
        return param3;
    }

    final synchronized void f(int param0) {
        this.f(param0, this.f());
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmSampleStream param13, int param14, int param15) {
        param13.field_m = param13.field_m - param13.field_k * param5;
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
        param13.field_m = param13.field_m + param13.field_k * param5;
        param13.field_x = param6;
        param13.field_s = param7;
        param13.field_u = param4;
        return param5;
    }

    private final void g() {
        this.field_m = this.field_o;
        this.field_x = PcmSampleStream.d(this.field_o, this.field_n);
        this.field_s = PcmSampleStream.a(this.field_o, this.field_n);
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmSampleStream param13, int param14, int param15) {
        param13.field_m = param13.field_m - param13.field_k * param5;
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
        param13.field_m = param13.field_m + param13.field_k * param5;
        param13.field_x = param6;
        param13.field_s = param7;
        param13.field_u = param4;
        return param5;
    }

    final static PcmSampleStream b(PcmSample param0, int param1, int param2, int param3) {
        if (param0.samples == null) {
          return null;
        }
        if (param0.samples.length != 0) {
          return new PcmSampleStream(param0, param1, param2 << 6, param3 << 6);
        }
        return null;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        do {
          if (this.field_v <= 0) {
            if (this.field_y == -256 &&
              (this.field_u & 255) == 0) {
              if (AudioOutput.field_o) {
                return PcmSampleStream.a(0, ((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_x, this.field_s, 0, param3, param2, this);
              }
              return PcmSampleStream.b(((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_m, 0, param3, param2, this);
            }
            if (AudioOutput.field_o) {
              return PcmSampleStream.a(0, 0, ((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_x, this.field_s, 0, param3, param2, this, this.field_y, param4);
            }
            return PcmSampleStream.b(0, 0, ((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_m, 0, param3, param2, this, this.field_y, param4);
          }
          int var6 = param1 + this.field_v;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_v = this.field_v + param1;
          if (this.field_y == -256 &&
            (this.field_u & 255) == 0) {
            if (!AudioOutput.field_o) {
              param1 = PcmSampleStream.a(((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_m, this.field_k, 0, var6, param2, this);
            } else {
              param1 = PcmSampleStream.a(0, ((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_x, this.field_s, this.field_t, this.field_p, 0, var6, param2, this);
            }
          } else if (!AudioOutput.field_o) {
            param1 = PcmSampleStream.c(0, 0, ((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_m, this.field_k, 0, var6, param2, this, this.field_y, param4);
          } else {
            param1 = PcmSampleStream.b(0, 0, ((PcmSample) (this.sample)).samples, param0, this.field_u, param1, this.field_x, this.field_s, this.field_t, this.field_p, 0, var6, param2, this, this.field_y, param4);
          }
          this.field_v = this.field_v - param1;
          if (this.field_v != 0) {
            return param1;
          }
        } while (!this.i());
        return param3;
    }

    final synchronized void c(int param0, int param1) {
        this.a(param0, param1, this.f());
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
        param10.field_u = param3 << 8;
        return param4 >> 1;
    }

    private final boolean i() {
        int var2;
        int var3;
        int var1 = this.field_o;
        if (var1 != -2147483648) {
          var2 = PcmSampleStream.d(var1, this.field_n);
          var3 = PcmSampleStream.a(var1, this.field_n);
        } else {
          var3 = 0;
          var2 = 0;
          var1 = 0;
        }
        if (this.field_m == var1 &&
          this.field_x == var2 &&
          this.field_s == var3) {
          if (this.field_o != -2147483648) {
            this.g();
            return false;
          }
          this.field_o = 0;
          this.field_s = 0;
          this.field_x = 0;
          this.field_m = 0;
          this.unlink((byte) -120);
          return true;
        }
        if (!(this.field_m >= var1)) {
          this.field_k = 1;
          this.field_v = var1 - this.field_m;
        } else if (this.field_m <= var1) {
          this.field_k = 0;
        } else {
          this.field_k = -1;
          this.field_v = this.field_m - var1;
        }
        if (!(this.field_x >= var2)) {
          this.field_t = 1;
          if (this.field_v == 0 ||
            this.field_v > var2 - this.field_x) {
            this.field_v = var2 - this.field_x;
          }
        } else if (this.field_x <= var2) {
          this.field_t = 0;
        } else {
          this.field_t = -1;
          if (this.field_v == 0 ||
            this.field_v > this.field_x - var2) {
            this.field_v = this.field_x - var2;
          }
        }
        if (this.field_s < var3) {
          this.field_p = 1;
          if (this.field_v != 0 &&
            this.field_v <= var3 - this.field_s) {
            return false;
          }
          this.field_v = var3 - this.field_s;
          return false;
        }
        if (this.field_s <= var3) {
          this.field_p = 0;
        } else {
          this.field_p = -1;
          if (this.field_v == 0 ||
            this.field_v > this.field_s - var3) {
            this.field_v = this.field_s - var3;
          }
        }
        return false;
    }

    final synchronized void skip(int length) {
        int fieldTemp$2 = 0;
        int var7;
        if (this.field_v > 0) {
          if (length < this.field_v) {
            this.field_m = this.field_m + this.field_k * length;
            this.field_x = this.field_x + this.field_t * length;
            this.field_s = this.field_s + this.field_p * length;
            this.field_v = this.field_v - length;
          } else {
            if (this.field_o == -2147483648) {
              this.field_o = 0;
              this.field_s = 0;
              this.field_x = 0;
              this.field_m = 0;
              this.unlink((byte) -12);
              length = this.field_v;
            }
            this.field_v = 0;
            this.g();
          }
        }
        PcmSample var2 = (PcmSample) (this.sample);
        int var3 = this.field_q << 8;
        int var4 = this.field_l << 8;
        int var5 = var2.samples.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
          this.field_r = 0;
        }
        if (this.field_u < 0) {
          if (this.field_y <= 0) {
            this.h();
            this.unlink((byte) -123);
            return;
          }
          this.field_u = 0;
        }
        if (this.field_u >= var5) {
          if (this.field_y >= 0) {
            this.h();
            this.unlink((byte) -56);
            return;
          }
          this.field_u = var5 - 1;
        }
        this.field_u = this.field_u + this.field_y * length;
        if (this.field_r < 0) {
          if (!this.field_w) {
            if (this.field_y >= 0) {
              if (this.field_u < var4) {
                return;
              }
              this.field_u = var3 + (this.field_u - var3) % var6;
              return;
            }
            if (this.field_u >= var3) {
              return;
            }
            this.field_u = var4 - 1 - (var4 - 1 - this.field_u) % var6;
            return;
          }
          if (this.field_y < 0) {
            if (this.field_u >= var3) {
              return;
            }
            this.field_u = var3 + var3 - 1 - this.field_u;
            this.field_y = -this.field_y;
          }
          while (this.field_u >= var4) {
            this.field_u = var4 + var4 - 1 - this.field_u;
            this.field_y = -this.field_y;
            if (this.field_u >= var3) {
              return;
            }
            this.field_u = var3 + var3 - 1 - this.field_u;
            this.field_y = -this.field_y;
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_r > 0) {
          if (!this.field_w) {
            if (this.field_y >= 0) {
              if (this.field_u < var4) {
                return;
              }
              var7 = (this.field_u - var3) / var6;
              if (var7 >= this.field_r) {
                this.field_u = this.field_u - var6 * this.field_r;
                this.field_r = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_u = this.field_u - var6 * var7;
                this.field_r = this.field_r - var7;
              }
            } else {
              if (this.field_u >= var3) {
                return;
              }
              var7 = (var4 - 1 - this.field_u) / var6;
              if (var7 >= this.field_r) {
                this.field_u = this.field_u + var6 * this.field_r;
                this.field_r = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_u = this.field_u + var6 * var7;
                this.field_r = this.field_r - var7;
              }
            }
            if (decompiledFrameRemainder0) {
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_y < 0) {
              if (this.field_u >= var3) {
                return;
              }
              this.field_u = var3 + var3 - 1 - this.field_u;
              this.field_y = -this.field_y;
              int fieldTemp$0 = this.field_r - 1;
              this.field_r = this.field_r - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                if (this.field_u < var4) {
                  return;
                }
                this.field_u = var4 + var4 - 1 - this.field_u;
                this.field_y = -this.field_y;
                int fieldTemp$1 = this.field_r - 1;
                this.field_r = this.field_r - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                if (this.field_u >= var3) {
                  return;
                }
                this.field_u = var3 + var3 - 1 - this.field_u;
                this.field_y = -this.field_y;
                fieldTemp$2 = this.field_r - 1;
                this.field_r = this.field_r - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.field_y >= 0) {
          if (this.field_u >= var5) {
            this.field_u = var5;
            this.h();
            this.unlink((byte) -100);
          }
          return;
        }
        if (this.field_u >= 0) {
          return;
        }
        this.field_u = -1;
        this.h();
        this.unlink((byte) -88);
    }

    final synchronized void e() {
        this.field_y = (this.field_y ^ this.field_y >> 31) + (this.field_y >>> 31);
        this.field_y = -this.field_y;
        this.field_u = ((PcmSample) (this.sample)).samples.length - 1 << 8;
    }

    final synchronized void h(int param0) {
        this.field_r = param0;
    }

    final synchronized void e(int param0) {
        param0 = param0 << 8;
        int var2 = ((PcmSample) (this.sample)).samples.length << 8;
        if (param0 < -1) {
          param0 = -1;
        }
        if (param0 > var2) {
          param0 = var2;
        }
        this.field_u = param0;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmSampleStream param9) {
        param2 = param2 >> 8;
        param8 = param8 >> 8;
        param4 = param4 << 2;
        param5 = param5 << 2;
        param6 = param3 + param2 - (param8 - 1);
        if (param3 + param2 - (param8 - 1) > param7) {
          param6 = param7;
        }
        param9.field_x = param9.field_x + param9.field_t * (param6 - param3);
        param9.field_s = param9.field_s + param9.field_p * (param6 - param3);
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
        param9.field_m = param4 >> 2;
        param9.field_u = param2 << 8;
        return param3;
    }

    final static PcmSampleStream c(PcmSample param0, int param1, int param2, int param3) {
        if (param0.samples == null) {
          return null;
        }
        if (param0.samples.length != 0) {
          return new PcmSampleStream(param0, (int)((long)param0.sampleRate * 256L * (long)param1 / (long)(100 * AudioOutput.field_q)), param2, param3);
        }
        return null;
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
        param10.field_u = param4;
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
        param8.field_u = param2 << 8;
        return param3;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
        param11.field_x = param11.field_x - param11.field_t * param5;
        param11.field_s = param11.field_s - param11.field_p * param5;
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
        param11.field_x = param11.field_x + param11.field_t * param5;
        param11.field_s = param11.field_s + param11.field_p * param5;
        param11.field_m = param6;
        param11.field_u = param4;
        return param5;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
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
        param11.field_u = param4;
        return param5 >> 1;
    }

    private final static int a(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmSampleStream param12) {
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
        param12.field_m = param12.field_m + param12.field_k * (param9 - param4);
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
        param12.field_x = param5 >> 2;
        param12.field_s = param6 >> 2;
        param12.field_u = param3 << 8;
        return param4 >> 1;
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
        param10.field_u = param3 << 8;
        return param4 >> 1;
    }

    final static PcmSampleStream a(PcmSample param0, int param1, int param2) {
        if (param0.samples == null) {
          return null;
        }
        if (param0.samples.length != 0) {
          return new PcmSampleStream(param0, (int)((long)param0.sampleRate * 256L * (long)param1 / (long)(100 * AudioOutput.field_q)), param2 << 6);
        }
        return null;
    }

    final synchronized void mixInto(int[] samples, int offset, int length) {
        int fieldTemp$2 = 0;
        if (this.field_o == 0 &&
          this.field_v == 0) {
          this.skip(length);
          return;
        }
        PcmSample var4 = (PcmSample) (this.sample);
        int var5 = this.field_q << 8;
        int var6 = this.field_l << 8;
        int var7 = var4.samples.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
          this.field_r = 0;
        }
        int var9 = offset;
        length = length + offset;
        if (this.field_u < 0) {
          if (this.field_y <= 0) {
            this.h();
            this.unlink((byte) -26);
            return;
          }
          this.field_u = 0;
        }
        if (this.field_u >= var7) {
          if (this.field_y >= 0) {
            this.h();
            this.unlink((byte) -10);
            return;
          }
          this.field_u = var7 - 1;
        }
        if (this.field_r < 0) {
          if (!this.field_w) {
            if (this.field_y >= 0) {
              while (true) {
                var9 = this.a(samples, var9, var6, length, (int) var4.samples[this.field_q]);
                if (this.field_u < var6) {
                  return;
                }
                this.field_u = var5 + (this.field_u - var5) % var8;
              }
            }
            while (true) {
              var9 = this.b(samples, var9, var5, length, (int) var4.samples[this.field_l - 1]);
              if (this.field_u >= var5) {
                return;
              }
              this.field_u = var6 - 1 - (var6 - 1 - this.field_u) % var8;
            }
          }
          if (this.field_y < 0) {
            var9 = this.b(samples, var9, var5, length, (int) var4.samples[this.field_q]);
            if (this.field_u >= var5) {
              return;
            }
            this.field_u = var5 + var5 - 1 - this.field_u;
            this.field_y = -this.field_y;
          }
          while (true) {
            var9 = this.a(samples, var9, var6, length, (int) var4.samples[this.field_l - 1]);
            if (this.field_u < var6) {
              return;
            }
            this.field_u = var6 + var6 - 1 - this.field_u;
            this.field_y = -this.field_y;
            var9 = this.b(samples, var9, var5, length, (int) var4.samples[this.field_q]);
            if (this.field_u >= var5) {
              return;
            }
            this.field_u = var5 + var5 - 1 - this.field_u;
            this.field_y = -this.field_y;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_r > 0) {
          if (!this.field_w) {
            if (this.field_y < 0) {
              while (true) {
                var9 = this.b(samples, var9, var5, length, (int) var4.samples[this.field_l - 1]);
                if (this.field_u >= var5) {
                  return;
                }
                int var10 = (var6 - 1 - this.field_u) / var8;
                if (var10 < this.field_r) {
                  this.field_u = this.field_u + var8 * var10;
                  this.field_r = this.field_r - var10;
                  continue;
                }
                break;
              }
              this.field_u = this.field_u + var8 * this.field_r;
              this.field_r = 0;
            } else {
              while (true) {
                var9 = this.a(samples, var9, var6, length, (int) var4.samples[this.field_q]);
                if (this.field_u < var6) {
                  return;
                }
                int var10Lifetime1 = (this.field_u - var5) / var8;
                if (var10Lifetime1 < this.field_r) {
                  this.field_u = this.field_u - var8 * var10Lifetime1;
                  this.field_r = this.field_r - var10Lifetime1;
                  continue;
                }
                break;
              }
              this.field_u = this.field_u - var8 * this.field_r;
              this.field_r = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_y < 0) {
              var9 = this.b(samples, var9, var5, length, (int) var4.samples[this.field_q]);
              if (this.field_u >= var5) {
                return;
              }
              this.field_u = var5 + var5 - 1 - this.field_u;
              this.field_y = -this.field_y;
              int fieldTemp$0 = this.field_r - 1;
              this.field_r = this.field_r - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                var9 = this.a(samples, var9, var6, length, (int) var4.samples[this.field_l - 1]);
                if (this.field_u < var6) {
                  return;
                }
                this.field_u = var6 + var6 - 1 - this.field_u;
                this.field_y = -this.field_y;
                int fieldTemp$1 = this.field_r - 1;
                this.field_r = this.field_r - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                var9 = this.b(samples, var9, var5, length, (int) var4.samples[this.field_q]);
                if (this.field_u >= var5) {
                  return;
                }
                this.field_u = var5 + var5 - 1 - this.field_u;
                this.field_y = -this.field_y;
                fieldTemp$2 = this.field_r - 1;
                this.field_r = this.field_r - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.field_y >= 0) {
          int discarded$4 = this.a(samples, var9, var7, length, 0);
          if (this.field_u >= var7) {
            this.field_u = var7;
            this.h();
            this.unlink((byte) -66);
          }
          return;
        }
        int discarded$3 = this.b(samples, var9, 0, length, 0);
        if (this.field_u >= 0) {
          return;
        }
        this.field_u = -1;
        this.h();
        this.unlink((byte) -123);
        return;
    }

    private final void h() {
        if (this.field_v != 0) {
          if (this.field_o == -2147483648) {
            this.field_o = 0;
          }
          this.field_v = 0;
          this.g();
          return;
        }
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
        param8.field_u = param2 << 8;
        return param3;
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
        param10.field_u = param4;
        return param5;
    }

    final int priority() {
        int var1 = this.field_m * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.field_r == 0) {
          var1 = var1 - var1 * this.field_u / (((PcmSample) (this.sample)).samples.length << 8);
        } else if (this.field_r >= 0) {
          var1 = var1 - var1 * this.field_q / ((PcmSample) (this.sample)).samples.length;
        }
        return var1 > 255 ? 255 : var1;
    }

    final synchronized void a(int param0, int param1, int param2) {
        if (param0 == 0) {
          this.f(param1, param2);
          return;
        }
        int var4 = PcmSampleStream.d(param1, param2);
        int var5 = PcmSampleStream.a(param1, param2);
        if (this.field_x != var4) {
          int var6 = param1 - this.field_m;
          if (this.field_m - param1 > var6) {
            var6 = this.field_m - param1;
          }
          if (var4 - this.field_x > var6) {
            var6 = var4 - this.field_x;
          }
          if (this.field_x - var4 > var6) {
            var6 = this.field_x - var4;
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
          this.field_v = param0;
          this.field_o = param1;
          this.field_n = param2;
          this.field_k = (param1 - this.field_m) / param0;
          this.field_t = (var4 - this.field_x) / param0;
          this.field_p = (var5 - this.field_s) / param0;
          return;
        }
        if (this.field_s != var5) {
          int var6Lifetime1 = param1 - this.field_m;
          if (this.field_m - param1 > var6Lifetime1) {
            var6Lifetime1 = this.field_m - param1;
          }
          if (var4 - this.field_x > var6Lifetime1) {
            var6Lifetime1 = var4 - this.field_x;
          }
          if (this.field_x - var4 > var6Lifetime1) {
            var6Lifetime1 = this.field_x - var4;
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
          this.field_v = param0;
          this.field_o = param1;
          this.field_n = param2;
          this.field_k = (param1 - this.field_m) / param0;
          this.field_t = (var4 - this.field_x) / param0;
          this.field_p = (var5 - this.field_s) / param0;
          return;
        }
        this.field_v = 0;
    }

    final PcmStream nextSubstream() {
        return null;
    }

    final synchronized void j(int param0) {
        this.f(param0 << 6, this.f());
    }

    final synchronized void b(int param0, int param1) {
        this.field_q = param0;
        this.field_l = param1;
    }

    final int activity() {
        if (this.field_o == 0 &&
          this.field_v == 0) {
          return 0;
        }
        return 1;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmSampleStream param9) {
        param2 = param2 >> 8;
        param8 = param8 >> 8;
        param4 = param4 << 2;
        param5 = param5 << 2;
        param6 = param3 + param8 - param2;
        if (param3 + param8 - param2 > param7) {
          param6 = param7;
        }
        param9.field_x = param9.field_x + param9.field_t * (param6 - param3);
        param9.field_s = param9.field_s + param9.field_p * (param6 - param3);
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
        param9.field_m = param4 >> 2;
        param9.field_u = param2 << 8;
        return param3;
    }

    final PcmStream firstSubstream() {
        return null;
    }

    final synchronized void a(boolean param0) {
        this.field_w = param0 ? true : false;
    }

    private final synchronized int f() {
        return this.field_n < 0 ? -1 : this.field_n;
    }

    final synchronized void g(int param0) {
        if (param0 == 0) {
          this.f(0);
          this.unlink((byte) -38);
          return;
        }
        if (this.field_x != 0) {
          int var2 = -this.field_m;
          if (this.field_m > var2) {
            var2 = this.field_m;
          }
          if (-this.field_x > var2) {
            var2 = -this.field_x;
          }
          if (this.field_x > var2) {
            var2 = this.field_x;
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
          this.field_v = param0;
          this.field_o = -2147483648;
          this.field_k = -this.field_m / param0;
          this.field_t = -this.field_x / param0;
          this.field_p = -this.field_s / param0;
          return;
        }
        if (this.field_s != 0) {
          int var2Lifetime1 = -this.field_m;
          if (this.field_m > var2Lifetime1) {
            var2Lifetime1 = this.field_m;
          }
          if (-this.field_x > var2Lifetime1) {
            var2Lifetime1 = -this.field_x;
          }
          if (this.field_x > var2Lifetime1) {
            var2Lifetime1 = this.field_x;
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
          this.field_v = param0;
          this.field_o = -2147483648;
          this.field_k = -this.field_m / param0;
          this.field_t = -this.field_x / param0;
          this.field_p = -this.field_s / param0;
          return;
        }
        this.field_v = 0;
        this.field_o = 0;
        this.field_m = 0;
        this.unlink((byte) -23);
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
        param11.field_x = param11.field_x - param11.field_t * param5;
        param11.field_s = param11.field_s - param11.field_p * param5;
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
        param11.field_x = param11.field_x + param11.field_t * param5;
        param11.field_s = param11.field_s + param11.field_p * param5;
        param11.field_m = param6;
        param11.field_u = param4;
        return param5;
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
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
        param11.field_u = param4;
        return param5 >> 1;
    }

    final synchronized void b(int param0, int param1, int param2) {
        this.a(param0, param1 << 6, param2 << 6);
    }

    final synchronized void i(int param0) {
        if (this.field_y < 0) {
          this.field_y = -param0;
        } else {
          this.field_y = param0;
        }
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

    private final static int d(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final synchronized void e(int param0, int param1) {
        this.a(param0, param1 << 6, this.f());
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmSampleStream param12) {
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
        param12.field_m = param12.field_m + param12.field_k * (param9 - param4);
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
        param12.field_x = param5 >> 2;
        param12.field_s = param6 >> 2;
        param12.field_u = param3 << 8;
        return param4 >> 1;
    }

    final synchronized void f(int param0, int param1) {
        this.field_o = param0;
        this.field_n = param1;
        this.field_v = 0;
        this.g();
    }

    private PcmSampleStream(PcmSample param0, int param1, int param2) {
        this.sample = (AbstractPcmSample) ((Object) param0);
        this.field_q = param0.loopStart;
        this.field_l = param0.loopEnd;
        this.field_w = param0.pingPongLoop;
        this.field_y = param1;
        this.field_o = param2;
        this.field_n = 8192;
        this.field_u = 0;
        this.g();
    }

    private PcmSampleStream(PcmSample param0, int param1, int param2, int param3) {
        this.sample = (AbstractPcmSample) ((Object) param0);
        this.field_q = param0.loopStart;
        this.field_l = param0.loopEnd;
        this.field_w = param0.pingPongLoop;
        this.field_y = param1;
        this.field_o = param2;
        this.field_n = param3;
        this.field_u = 0;
        this.g();
    }
}
