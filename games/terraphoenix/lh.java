/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends lj {
    private int field_n;
    private int field_v;
    private int field_z;
    private int field_w;
    private int field_l;
    private int field_s;
    private boolean field_u;
    private int field_r;
    private int field_q;
    private int field_x;
    private int field_m;
    private int field_y;
    private int field_o;
    private int field_p;
    private int field_t;

    final lj c() {
        return null;
    }

    final int d() {
        if (this.field_x == 0 &&
          this.field_n == 0) {
          return 0;
        }
        return 1;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, lh param11, int param12, int param13) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        param11.field_t = param11.field_t - param11.field_l * param5;
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
        param11.field_t = param11.field_t + param11.field_l * param5;
        param11.field_s = param11.field_s + param11.field_p * param5;
        param11.field_r = param6;
        param11.field_q = param4;
        return param5;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, lh param8) {
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
        param8.field_q = param2 << 8;
        return param3;
    }

    final synchronized void a(boolean param0) {
        this.field_y = (this.field_y ^ this.field_y >> 31) + (this.field_y >>> 31);
        if (!param0) {
          return;
        }
        this.field_y = -this.field_y;
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, lh param11, int param12, int param13) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        param11.field_t = param11.field_t - param11.field_l * param5;
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
        param11.field_t = param11.field_t + param11.field_l * param5;
        param11.field_s = param11.field_s + param11.field_p * param5;
        param11.field_r = param6;
        param11.field_q = param4;
        return param5;
    }

    private final void f() {
        this.field_r = this.field_x;
        this.field_t = lh.d(this.field_x, this.field_v);
        this.field_s = lh.c(this.field_x, this.field_v);
    }

    final synchronized void f(int param0) {
        if (this.field_y < 0) {
          this.field_y = -param0;
        } else {
          this.field_y = param0;
        }
    }

    private final static int d(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final synchronized void d(int param0) {
        int var2 = ((gg) (this.field_i)).field_k.length << 8;
        if (param0 < -1) {
          param0 = -1;
        }
        if (param0 > var2) {
          param0 = var2;
        }
        this.field_q = param0;
    }

    private final static int c(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, lh param10) {
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
        param10.field_q = param3 << 8;
        return param4 >> 1;
    }

    final synchronized int l() {
        return this.field_y < 0 ? -this.field_y : this.field_y;
    }

    final synchronized void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        gg var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (this.field_n > 0) {
          if (param0 < this.field_n) {
            this.field_r = this.field_r + this.field_z * param0;
            this.field_t = this.field_t + this.field_l * param0;
            this.field_s = this.field_s + this.field_p * param0;
            this.field_n = this.field_n - param0;
          } else {
            if (this.field_x == -2147483648) {
              this.field_x = 0;
              this.field_s = 0;
              this.field_t = 0;
              this.field_r = 0;
              this.b((byte) 12);
              param0 = this.field_n;
            }
            this.field_n = 0;
            this.f();
          }
        }
        var2 = (gg) (this.field_i);
        var3 = this.field_o << 8;
        var4 = this.field_w << 8;
        var5 = var2.field_k.length << 8;
        var6 = var4 - var3;
        if (var6 <= 0) {
          this.field_m = 0;
        }
        if (this.field_q < 0) {
          if (this.field_y <= 0) {
            this.j();
            this.b((byte) 12);
            return;
          }
          this.field_q = 0;
        }
        if (this.field_q >= var5) {
          if (this.field_y >= 0) {
            this.j();
            this.b((byte) 12);
            return;
          }
          this.field_q = var5 - 1;
        }
        this.field_q = this.field_q + this.field_y * param0;
        if (this.field_m < 0) {
          if (!this.field_u) {
            if (this.field_y >= 0) {
              if (this.field_q < var4) {
                return;
              }
              this.field_q = var3 + (this.field_q - var3) % var6;
              return;
            }
            if (this.field_q >= var3) {
              return;
            }
            this.field_q = var4 - 1 - (var4 - 1 - this.field_q) % var6;
            return;
          }
          if (this.field_y < 0) {
            if (this.field_q >= var3) {
              return;
            }
            this.field_q = var3 + var3 - 1 - this.field_q;
            this.field_y = -this.field_y;
          }
          while (this.field_q >= var4) {
            this.field_q = var4 + var4 - 1 - this.field_q;
            this.field_y = -this.field_y;
            if (this.field_q >= var3) {
              return;
            }
            this.field_q = var3 + var3 - 1 - this.field_q;
            this.field_y = -this.field_y;
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_m > 0) {
          if (!this.field_u) {
            if (this.field_y >= 0) {
              if (this.field_q < var4) {
                return;
              }
              var7 = (this.field_q - var3) / var6;
              if (var7 >= this.field_m) {
                this.field_q = this.field_q - var6 * this.field_m;
                this.field_m = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_q = this.field_q - var6 * var7;
                this.field_m = this.field_m - var7;
              }
            } else {
              if (this.field_q >= var3) {
                return;
              }
              var7 = (var4 - 1 - this.field_q) / var6;
              if (var7 >= this.field_m) {
                this.field_q = this.field_q + var6 * this.field_m;
                this.field_m = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_q = this.field_q + var6 * var7;
                this.field_m = this.field_m - var7;
              }
            }
            if (decompiledFrameRemainder0) {
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_y < 0) {
              if (this.field_q >= var3) {
                return;
              }
              this.field_q = var3 + var3 - 1 - this.field_q;
              this.field_y = -this.field_y;
              fieldTemp$0 = this.field_m - 1;
              this.field_m = this.field_m - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                if (this.field_q < var4) {
                  return;
                }
                this.field_q = var4 + var4 - 1 - this.field_q;
                this.field_y = -this.field_y;
                fieldTemp$1 = this.field_m - 1;
                this.field_m = this.field_m - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                if (this.field_q >= var3) {
                  return;
                }
                this.field_q = var3 + var3 - 1 - this.field_q;
                this.field_y = -this.field_y;
                fieldTemp$2 = this.field_m - 1;
                this.field_m = this.field_m - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.field_y >= 0) {
          if (this.field_q >= var5) {
            this.field_q = var5;
            this.j();
            this.b((byte) 12);
          }
          return;
        }
        if (this.field_q >= 0) {
          return;
        }
        this.field_q = -1;
        this.j();
        this.b((byte) 12);
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, lh param11, int param12, int param13) {
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
        param11.field_q = param4;
        return param5 >> 1;
    }

    private final synchronized void e(int param0) {
        this.b(param0, this.g());
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int discarded$4 = 0;
        int discarded$3 = 0;
        gg var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var10Lifetime1;
        if (this.field_x == 0 &&
          this.field_n == 0) {
          this.a(param2);
          return;
        }
        var4 = (gg) (this.field_i);
        var5 = this.field_o << 8;
        var6 = this.field_w << 8;
        var7 = var4.field_k.length << 8;
        var8 = var6 - var5;
        if (var8 <= 0) {
          this.field_m = 0;
        }
        var9 = param1;
        param2 = param2 + param1;
        if (this.field_q < 0) {
          if (this.field_y <= 0) {
            this.j();
            this.b((byte) 12);
            return;
          }
          this.field_q = 0;
        }
        if (this.field_q >= var7) {
          if (this.field_y >= 0) {
            this.j();
            this.b((byte) 12);
            return;
          }
          this.field_q = var7 - 1;
        }
        if (this.field_m < 0) {
          if (!this.field_u) {
            if (this.field_y >= 0) {
              while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_k[this.field_o]);
                if (this.field_q < var6) {
                  return;
                }
                this.field_q = var5 + (this.field_q - var5) % var8;
              }
            }
            while (true) {
              var9 = this.a(param0, var9, var5, param2, (int) var4.field_k[this.field_w - 1]);
              if (this.field_q >= var5) {
                return;
              }
              this.field_q = var6 - 1 - (var6 - 1 - this.field_q) % var8;
            }
          }
          if (this.field_y < 0) {
            var9 = this.a(param0, var9, var5, param2, (int) var4.field_k[this.field_o]);
            if (this.field_q >= var5) {
              return;
            }
            this.field_q = var5 + var5 - 1 - this.field_q;
            this.field_y = -this.field_y;
          }
          while (true) {
            var9 = this.b(param0, var9, var6, param2, (int) var4.field_k[this.field_w - 1]);
            if (this.field_q < var6) {
              return;
            }
            this.field_q = var6 + var6 - 1 - this.field_q;
            this.field_y = -this.field_y;
            var9 = this.a(param0, var9, var5, param2, (int) var4.field_k[this.field_o]);
            if (this.field_q >= var5) {
              return;
            }
            this.field_q = var5 + var5 - 1 - this.field_q;
            this.field_y = -this.field_y;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_m > 0) {
          if (!this.field_u) {
            if (this.field_y < 0) {
              while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_k[this.field_w - 1]);
                if (this.field_q >= var5) {
                  return;
                }
                var10 = (var6 - 1 - this.field_q) / var8;
                if (var10 < this.field_m) {
                  this.field_q = this.field_q + var8 * var10;
                  this.field_m = this.field_m - var10;
                  continue;
                }
                break;
              }
              this.field_q = this.field_q + var8 * this.field_m;
              this.field_m = 0;
            } else {
              while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_k[this.field_o]);
                if (this.field_q < var6) {
                  return;
                }
                var10Lifetime1 = (this.field_q - var5) / var8;
                if (var10Lifetime1 < this.field_m) {
                  this.field_q = this.field_q - var8 * var10Lifetime1;
                  this.field_m = this.field_m - var10Lifetime1;
                  continue;
                }
                break;
              }
              this.field_q = this.field_q - var8 * this.field_m;
              this.field_m = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_y < 0) {
              var9 = this.a(param0, var9, var5, param2, (int) var4.field_k[this.field_o]);
              if (this.field_q >= var5) {
                return;
              }
              this.field_q = var5 + var5 - 1 - this.field_q;
              this.field_y = -this.field_y;
              fieldTemp$0 = this.field_m - 1;
              this.field_m = this.field_m - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_k[this.field_w - 1]);
                if (this.field_q < var6) {
                  return;
                }
                this.field_q = var6 + var6 - 1 - this.field_q;
                this.field_y = -this.field_y;
                fieldTemp$1 = this.field_m - 1;
                this.field_m = this.field_m - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_k[this.field_o]);
                if (this.field_q >= var5) {
                  return;
                }
                this.field_q = var5 + var5 - 1 - this.field_q;
                this.field_y = -this.field_y;
                fieldTemp$2 = this.field_m - 1;
                this.field_m = this.field_m - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.field_y >= 0) {
          discarded$4 = this.b(param0, var9, var7, param2, 0);
          if (this.field_q >= var7) {
            this.field_q = var7;
            this.j();
            this.b((byte) 12);
          }
          return;
        }
        discarded$3 = this.a(param0, var9, 0, param2, 0);
        if (this.field_q >= 0) {
          return;
        }
        this.field_q = -1;
        this.j();
        this.b((byte) 12);
        return;
    }

    final int b() {
        int var1 = this.field_r * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.field_m == 0) {
          var1 = var1 - var1 * this.field_q / (((gg) (this.field_i)).field_k.length << 8);
        } else {
          if (this.field_m >= 0) {
            var1 = var1 - var1 * this.field_o / ((gg) (this.field_i)).field_k.length;
          }
        }
        return var1 > 255 ? 255 : var1;
    }

    private final boolean e() {
        int var1;
        int var2;
        int var3;
        var1 = this.field_x;
        if (var1 != -2147483648) {
          var2 = lh.d(var1, this.field_v);
          var3 = lh.c(var1, this.field_v);
        } else {
          var3 = 0;
          var2 = 0;
          var1 = 0;
        }
        if (this.field_r == var1 &&
          this.field_t == var2 &&
          this.field_s == var3) {
          if (this.field_x != -2147483648) {
            this.f();
            return false;
          }
          this.field_x = 0;
          this.field_s = 0;
          this.field_t = 0;
          this.field_r = 0;
          this.b((byte) 12);
          return true;
        }
        if (this.field_r >= var1) {
          if (this.field_r <= var1) {
            this.field_z = 0;
          } else {
            this.field_z = -1;
            this.field_n = this.field_r - var1;
          }
        } else {
          this.field_z = 1;
          this.field_n = var1 - this.field_r;
        }
        if (this.field_t >= var2) {
          if (this.field_t <= var2) {
            this.field_l = 0;
          } else {
            this.field_l = -1;
            if (this.field_n == 0 ||
              this.field_n > this.field_t - var2) {
              this.field_n = this.field_t - var2;
            }
          }
        } else {
          this.field_l = 1;
          if (this.field_n == 0 ||
            this.field_n > var2 - this.field_t) {
            this.field_n = var2 - this.field_t;
          }
        }
        if (this.field_s < var3) {
          this.field_p = 1;
          if (this.field_n != 0 &&
            this.field_n <= var3 - this.field_s) {
            return false;
          }
          this.field_n = var3 - this.field_s;
          return false;
        }
        if (this.field_s <= var3) {
          this.field_p = 0;
        } else {
          this.field_p = -1;
          if (this.field_n == 0 ||
            this.field_n > this.field_s - var3) {
            this.field_n = this.field_s - var3;
          }
        }
        return false;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, lh param8) {
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
        param8.field_q = param2 << 8;
        return param3;
    }

    final lj a() {
        return null;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, lh param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.field_r = param13.field_r - param13.field_z * param5;
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
        param13.field_r = param13.field_r + param13.field_z * param5;
        param13.field_t = param6;
        param13.field_s = param7;
        param13.field_q = param4;
        return param5;
    }

    final static lh a(gg param0, int param1, int param2) {
        if (param0.field_k == null) {
          return null;
        }
        if (param0.field_k.length != 0) {
          return new lh(param0, (int)((long)param0.field_l * 256L * (long)param1 / (long)(100 * nk.field_u)), param2 << 6);
        }
        return null;
    }

    final synchronized void g(int param0) {
        this.field_m = param0;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, lh param11, int param12, int param13) {
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
        param11.field_q = param4;
        return param5 >> 1;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, lh param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.field_r = param13.field_r - param13.field_z * param5;
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
        param13.field_r = param13.field_r + param13.field_z * param5;
        param13.field_t = param6;
        param13.field_s = param7;
        param13.field_q = param4;
        return param5;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, lh param12) {
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
        param12.field_r = param12.field_r + param12.field_z * (param9 - param4);
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
        param12.field_t = param5 >> 2;
        param12.field_s = param6 >> 2;
        param12.field_q = param3 << 8;
        return param4 >> 1;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, lh param12) {
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
        param12.field_r = param12.field_r + param12.field_z * (param9 - param4);
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
        param12.field_t = param5 >> 2;
        param12.field_s = param6 >> 2;
        param12.field_q = param3 << 8;
        return param4 >> 1;
    }

    final static lh a(gg param0, int param1, int param2, int param3) {
        if (param0.field_k == null) {
          return null;
        }
        if (param0.field_k.length != 0) {
          return new lh(param0, param1, param2, param3);
        }
        return null;
    }

    final synchronized int h() {
        return this.field_x == -2147483648 ? 0 : this.field_x;
    }

    final synchronized boolean i() {
        return this.field_q < 0 || this.field_q >= ((gg) (this.field_i)).field_k.length << 8;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, lh param10, int param11, int param12) {
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
        param10.field_q = param4;
        return param5;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.field_n <= 0) {
            if (this.field_y == -256 &&
              (this.field_q & 255) == 0) {
              if (nk.field_r) {
                return lh.b(0, ((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_t, this.field_s, 0, param3, param2, this);
              }
              return lh.a(((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_r, 0, param3, param2, this);
            }
            if (nk.field_r) {
              return lh.a(0, 0, ((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_t, this.field_s, 0, param3, param2, this, this.field_y, param4);
            }
            return lh.b(0, 0, ((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_r, 0, param3, param2, this, this.field_y, param4);
          }
          var6 = param1 + this.field_n;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_n = this.field_n + param1;
          if (this.field_y == -256 &&
            (this.field_q & 255) == 0) {
            if (!nk.field_r) {
              param1 = lh.a(((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_r, this.field_z, 0, var6, param2, this);
            } else {
              param1 = lh.a(0, ((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_t, this.field_s, this.field_l, this.field_p, 0, var6, param2, this);
            }
          } else {
            if (!nk.field_r) {
              param1 = lh.d(0, 0, ((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_r, this.field_z, 0, var6, param2, this, this.field_y, param4);
            } else {
              param1 = lh.a(0, 0, ((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_t, this.field_s, this.field_l, this.field_p, 0, var6, param2, this, this.field_y, param4);
            }
          }
          this.field_n = this.field_n - param1;
          if (this.field_n != 0) {
            return param1;
          }
        } while (!this.e());
        return param3;
    }

    private final void j() {
        if (this.field_n != 0) {
          if (this.field_x == -2147483648) {
            this.field_x = 0;
          }
          this.field_n = 0;
          this.f();
          return;
        }
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var6 = 0;
        int var6Lifetime1;
        if (param0 == 0) {
          this.b(param1, param2);
          return;
        }
        int var4 = lh.d(param1, param2);
        int var5 = lh.c(param1, param2);
        if (this.field_t != var4) {
          var6 = param1 - this.field_r;
          if (this.field_r - param1 > var6) {
            var6 = this.field_r - param1;
          }
          if (var4 - this.field_t > var6) {
            var6 = var4 - this.field_t;
          }
          if (this.field_t - var4 > var6) {
            var6 = this.field_t - var4;
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
          this.field_n = param0;
          this.field_x = param1;
          this.field_v = param2;
          this.field_z = (param1 - this.field_r) / param0;
          this.field_l = (var4 - this.field_t) / param0;
          this.field_p = (var5 - this.field_s) / param0;
          return;
        }
        if (this.field_s != var5) {
          var6Lifetime1 = param1 - this.field_r;
          if (this.field_r - param1 > var6Lifetime1) {
            var6Lifetime1 = this.field_r - param1;
          }
          if (var4 - this.field_t > var6Lifetime1) {
            var6Lifetime1 = var4 - this.field_t;
          }
          if (this.field_t - var4 > var6Lifetime1) {
            var6Lifetime1 = this.field_t - var4;
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
          this.field_n = param0;
          this.field_x = param1;
          this.field_v = param2;
          this.field_z = (param1 - this.field_r) / param0;
          this.field_l = (var4 - this.field_t) / param0;
          this.field_p = (var5 - this.field_s) / param0;
          return;
        }
        this.field_n = 0;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, lh param10, int param11, int param12) {
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
        param10.field_q = param4;
        return param5;
    }

    final synchronized void e(int param0, int param1) {
        this.a(param0, param1, this.g());
    }

    final synchronized int g() {
        return this.field_v < 0 ? -1 : this.field_v;
    }

    final synchronized boolean k() {
        return this.field_n != 0;
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == 0) {
          this.e(0);
          this.b((byte) 12);
          return;
        }
        if (this.field_t != 0) {
          var2 = -this.field_r;
          if (this.field_r > var2) {
            var2 = this.field_r;
          }
          if (-this.field_t > var2) {
            var2 = -this.field_t;
          }
          if (this.field_t > var2) {
            var2 = this.field_t;
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
          this.field_n = param0;
          this.field_x = -2147483648;
          this.field_z = -this.field_r / param0;
          this.field_l = -this.field_t / param0;
          this.field_p = -this.field_s / param0;
          return;
        }
        if (this.field_s != 0) {
          var2Lifetime1 = -this.field_r;
          if (this.field_r > var2Lifetime1) {
            var2Lifetime1 = this.field_r;
          }
          if (-this.field_t > var2Lifetime1) {
            var2Lifetime1 = -this.field_t;
          }
          if (this.field_t > var2Lifetime1) {
            var2Lifetime1 = this.field_t;
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
          this.field_n = param0;
          this.field_x = -2147483648;
          this.field_z = -this.field_r / param0;
          this.field_l = -this.field_t / param0;
          this.field_p = -this.field_s / param0;
          return;
        }
        this.field_n = 0;
        this.field_x = 0;
        this.field_r = 0;
        this.b((byte) 12);
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, lh param10) {
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
        param10.field_q = param3 << 8;
        return param4 >> 1;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, lh param9) {
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
        param9.field_t = param9.field_t + param9.field_l * (param6 - param3);
        param9.field_s = param9.field_s + param9.field_p * (param6 - param3);
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
        param9.field_r = param4 >> 2;
        param9.field_q = param2 << 8;
        return param3;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, lh param9) {
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
        param9.field_t = param9.field_t + param9.field_l * (param6 - param3);
        param9.field_s = param9.field_s + param9.field_p * (param6 - param3);
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
        param9.field_r = param4 >> 2;
        param9.field_q = param2 << 8;
        return param3;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.field_n <= 0) {
            if (this.field_y == 256 &&
              (this.field_q & 255) == 0) {
              if (nk.field_r) {
                return lh.a(0, ((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_t, this.field_s, 0, param3, param2, this);
              }
              return lh.b(((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_r, 0, param3, param2, this);
            }
            if (nk.field_r) {
              return lh.b(0, 0, ((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_t, this.field_s, 0, param3, param2, this, this.field_y, param4);
            }
            return lh.a(0, 0, ((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_r, 0, param3, param2, this, this.field_y, param4);
          }
          var6 = param1 + this.field_n;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_n = this.field_n + param1;
          if (this.field_y == 256 &&
            (this.field_q & 255) == 0) {
            if (!nk.field_r) {
              param1 = lh.b(((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_r, this.field_z, 0, var6, param2, this);
            } else {
              param1 = lh.b(0, ((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_t, this.field_s, this.field_l, this.field_p, 0, var6, param2, this);
            }
          } else {
            if (!nk.field_r) {
              param1 = lh.c(0, 0, ((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_r, this.field_z, 0, var6, param2, this, this.field_y, param4);
            } else {
              param1 = lh.b(0, 0, ((gg) (this.field_i)).field_k, param0, this.field_q, param1, this.field_t, this.field_s, this.field_l, this.field_p, 0, var6, param2, this, this.field_y, param4);
            }
          }
          this.field_n = this.field_n - param1;
          if (this.field_n != 0) {
            return param1;
          }
        } while (!this.e());
        return param3;
    }

    private final synchronized void b(int param0, int param1) {
        this.field_x = param0;
        this.field_v = param1;
        this.field_n = 0;
        this.f();
    }

    private lh(gg param0, int param1, int param2) {
        this.field_i = (id) ((Object) param0);
        this.field_o = param0.field_j;
        this.field_w = param0.field_m;
        this.field_u = param0.field_i;
        this.field_y = param1;
        this.field_x = param2;
        this.field_v = 8192;
        this.field_q = 0;
        this.f();
    }

    private lh(gg param0, int param1, int param2, int param3) {
        this.field_i = (id) ((Object) param0);
        this.field_o = param0.field_j;
        this.field_w = param0.field_m;
        this.field_u = param0.field_i;
        this.field_y = param1;
        this.field_x = param2;
        this.field_v = param3;
        this.field_q = 0;
        this.f();
    }
}
