/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends fh {
    private boolean field_l;
    private int field_w;
    private int field_i;
    private int field_k;
    private int field_n;
    private int field_o;
    private int field_t;
    private int field_u;
    private int field_q;
    private int field_m;
    private int field_p;
    private int field_j;
    private int field_v;
    private int field_s;
    private int field_r;

    final synchronized void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        td var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (this.field_o > 0) {
          if (param0 < this.field_o) {
            this.field_p = this.field_p + this.field_u * param0;
            this.field_j = this.field_j + this.field_k * param0;
            this.field_r = this.field_r + this.field_w * param0;
            this.field_o = this.field_o - param0;
          } else {
            if (this.field_i == -2147483648) {
              this.field_i = 0;
              this.field_r = 0;
              this.field_j = 0;
              this.field_p = 0;
              this.c(-19822);
              param0 = this.field_o;
            }
            this.field_o = 0;
            this.e();
          }
        }
        var2 = (td) (this.field_e);
        var3 = this.field_s << 8;
        var4 = this.field_n << 8;
        var5 = var2.field_j.length << 8;
        var6 = var4 - var3;
        if (var6 <= 0) {
          this.field_m = 0;
        }
        if (this.field_q < 0) {
          if (this.field_v <= 0) {
            this.j();
            this.c(-19822);
            return;
          }
          this.field_q = 0;
        }
        if (this.field_q >= var5) {
          if (this.field_v >= 0) {
            this.j();
            this.c(-19822);
            return;
          }
          this.field_q = var5 - 1;
        }
        this.field_q = this.field_q + this.field_v * param0;
        if (this.field_m < 0) {
          if (!this.field_l) {
            if (this.field_v >= 0) {
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
          if (this.field_v < 0) {
            if (this.field_q >= var3) {
              return;
            }
            this.field_q = var3 + var3 - 1 - this.field_q;
            this.field_v = -this.field_v;
          }
          while (this.field_q >= var4) {
            this.field_q = var4 + var4 - 1 - this.field_q;
            this.field_v = -this.field_v;
            if (this.field_q >= var3) {
              return;
            }
            this.field_q = var3 + var3 - 1 - this.field_q;
            this.field_v = -this.field_v;
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_m > 0) {
          if (!this.field_l) {
            if (this.field_v >= 0) {
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
            if (this.field_v < 0) {
              if (this.field_q >= var3) {
                return;
              }
              this.field_q = var3 + var3 - 1 - this.field_q;
              this.field_v = -this.field_v;
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
                this.field_v = -this.field_v;
                fieldTemp$1 = this.field_m - 1;
                this.field_m = this.field_m - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                if (this.field_q >= var3) {
                  return;
                }
                this.field_q = var3 + var3 - 1 - this.field_q;
                this.field_v = -this.field_v;
                fieldTemp$2 = this.field_m - 1;
                this.field_m = this.field_m - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.field_v >= 0) {
          if (this.field_q >= var5) {
            this.field_q = var5;
            this.j();
            this.c(-19822);
          }
          return;
        }
        if (this.field_q >= 0) {
          return;
        }
        this.field_q = -1;
        this.j();
        this.c(-19822);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int discarded$4 = 0;
        int discarded$3 = 0;
        td var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var10Lifetime1;
        if (this.field_i == 0 &&
          this.field_o == 0) {
          this.a(param2);
          return;
        }
        var4 = (td) (this.field_e);
        var5 = this.field_s << 8;
        var6 = this.field_n << 8;
        var7 = var4.field_j.length << 8;
        var8 = var6 - var5;
        if (var8 <= 0) {
          this.field_m = 0;
        }
        var9 = param1;
        param2 = param2 + param1;
        if (this.field_q < 0) {
          if (this.field_v <= 0) {
            this.j();
            this.c(-19822);
            return;
          }
          this.field_q = 0;
        }
        if (this.field_q >= var7) {
          if (this.field_v >= 0) {
            this.j();
            this.c(-19822);
            return;
          }
          this.field_q = var7 - 1;
        }
        if (this.field_m < 0) {
          if (!this.field_l) {
            if (this.field_v >= 0) {
              while (true) {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_j[this.field_s]);
                if (this.field_q < var6) {
                  return;
                }
                this.field_q = var5 + (this.field_q - var5) % var8;
              }
            }
            while (true) {
              var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[this.field_n - 1]);
              if (this.field_q >= var5) {
                return;
              }
              this.field_q = var6 - 1 - (var6 - 1 - this.field_q) % var8;
            }
          }
          if (this.field_v < 0) {
            var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[this.field_s]);
            if (this.field_q >= var5) {
              return;
            }
            this.field_q = var5 + var5 - 1 - this.field_q;
            this.field_v = -this.field_v;
          }
          while (true) {
            var9 = this.a(param0, var9, var6, param2, (int) var4.field_j[this.field_n - 1]);
            if (this.field_q < var6) {
              return;
            }
            this.field_q = var6 + var6 - 1 - this.field_q;
            this.field_v = -this.field_v;
            var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[this.field_s]);
            if (this.field_q >= var5) {
              return;
            }
            this.field_q = var5 + var5 - 1 - this.field_q;
            this.field_v = -this.field_v;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_m > 0) {
          if (!this.field_l) {
            if (this.field_v < 0) {
              while (true) {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[this.field_n - 1]);
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
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_j[this.field_s]);
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
            if (this.field_v < 0) {
              var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[this.field_s]);
              if (this.field_q >= var5) {
                return;
              }
              this.field_q = var5 + var5 - 1 - this.field_q;
              this.field_v = -this.field_v;
              fieldTemp$0 = this.field_m - 1;
              this.field_m = this.field_m - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_j[this.field_n - 1]);
                if (this.field_q < var6) {
                  return;
                }
                this.field_q = var6 + var6 - 1 - this.field_q;
                this.field_v = -this.field_v;
                fieldTemp$1 = this.field_m - 1;
                this.field_m = this.field_m - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[this.field_s]);
                if (this.field_q >= var5) {
                  return;
                }
                this.field_q = var5 + var5 - 1 - this.field_q;
                this.field_v = -this.field_v;
                fieldTemp$2 = this.field_m - 1;
                this.field_m = this.field_m - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.field_v >= 0) {
          discarded$4 = this.a(param0, var9, var7, param2, 0);
          if (this.field_q >= var7) {
            this.field_q = var7;
            this.j();
            this.c(-19822);
          }
          return;
        }
        discarded$3 = this.b(param0, var9, 0, param2, 0);
        if (this.field_q >= 0) {
          return;
        }
        this.field_q = -1;
        this.j();
        this.c(-19822);
        return;
    }

    final synchronized void c(int param0, int param1) {
        this.field_s = param0;
        this.field_n = param1;
    }

    private final static int d(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, li param9) {
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
        param9.field_j = param9.field_j + param9.field_k * (param6 - param3);
        param9.field_r = param9.field_r + param9.field_w * (param6 - param3);
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
        param9.field_p = param4 >> 2;
        param9.field_q = param2 << 8;
        return param3;
    }

    final static li a(td param0, int param1, int param2) {
        if (param0.field_j == null) {
          return null;
        }
        if (param0.field_j.length != 0) {
          return new li(param0, (int)((long)param0.field_f * 256L * (long)param1 / (long)(100 * va.field_i)), param2 << 6);
        }
        return null;
    }

    final synchronized void f(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == 0) {
          this.g(0);
          this.c(-19822);
          return;
        }
        if (this.field_j != 0) {
          var2 = -this.field_p;
          if (this.field_p > var2) {
            var2 = this.field_p;
          }
          if (-this.field_j > var2) {
            var2 = -this.field_j;
          }
          if (this.field_j > var2) {
            var2 = this.field_j;
          }
          if (-this.field_r > var2) {
            var2 = -this.field_r;
          }
          if (this.field_r > var2) {
            var2 = this.field_r;
          }
          if (param0 > var2) {
            param0 = var2;
          }
          this.field_o = param0;
          this.field_i = -2147483648;
          this.field_u = -this.field_p / param0;
          this.field_k = -this.field_j / param0;
          this.field_w = -this.field_r / param0;
          return;
        }
        if (this.field_r != 0) {
          var2Lifetime1 = -this.field_p;
          if (this.field_p > var2Lifetime1) {
            var2Lifetime1 = this.field_p;
          }
          if (-this.field_j > var2Lifetime1) {
            var2Lifetime1 = -this.field_j;
          }
          if (this.field_j > var2Lifetime1) {
            var2Lifetime1 = this.field_j;
          }
          if (-this.field_r > var2Lifetime1) {
            var2Lifetime1 = -this.field_r;
          }
          if (this.field_r > var2Lifetime1) {
            var2Lifetime1 = this.field_r;
          }
          if (param0 > var2Lifetime1) {
            param0 = var2Lifetime1;
          }
          this.field_o = param0;
          this.field_i = -2147483648;
          this.field_u = -this.field_p / param0;
          this.field_k = -this.field_j / param0;
          this.field_w = -this.field_r / param0;
          return;
        }
        this.field_o = 0;
        this.field_i = 0;
        this.field_p = 0;
        this.c(-19822);
    }

    final int d() {
        if (this.field_i == 0 &&
          this.field_o == 0) {
          return 0;
        }
        return 1;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.field_o <= 0) {
            if (this.field_v == 256 &&
              (this.field_q & 255) == 0) {
              if (va.field_n) {
                return li.b(0, ((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_j, this.field_r, 0, param3, param2, this);
              }
              return li.a(((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_p, 0, param3, param2, this);
            }
            if (va.field_n) {
              return li.b(0, 0, ((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_j, this.field_r, 0, param3, param2, this, this.field_v, param4);
            }
            return li.a(0, 0, ((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_p, 0, param3, param2, this, this.field_v, param4);
          }
          var6 = param1 + this.field_o;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_o = this.field_o + param1;
          if (this.field_v == 256 &&
            (this.field_q & 255) == 0) {
            if (!va.field_n) {
              param1 = li.a(((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_p, this.field_u, 0, var6, param2, this);
            } else {
              param1 = li.a(0, ((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_j, this.field_r, this.field_k, this.field_w, 0, var6, param2, this);
            }
          } else {
            if (!va.field_n) {
              param1 = li.a(0, 0, ((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_p, this.field_u, 0, var6, param2, this, this.field_v, param4);
            } else {
              param1 = li.b(0, 0, ((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_j, this.field_r, this.field_k, this.field_w, 0, var6, param2, this, this.field_v, param4);
            }
          }
          this.field_o = this.field_o - param1;
          if (this.field_o != 0) {
            return param1;
          }
        } while (!this.i());
        return param3;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, li param10, int param11, int param12) {
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, li param11, int param12, int param13) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        param11.field_j = param11.field_j - param11.field_k * param5;
        param11.field_r = param11.field_r - param11.field_w * param5;
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
        param11.field_j = param11.field_j + param11.field_k * param5;
        param11.field_r = param11.field_r + param11.field_w * param5;
        param11.field_p = param6;
        param11.field_q = param4;
        return param5;
    }

    final synchronized int f() {
        return this.field_i == -2147483648 ? 0 : this.field_i;
    }

    final static li a(td param0, int param1, int param2, int param3) {
        if (param0.field_j == null) {
          return null;
        }
        if (param0.field_j.length != 0) {
          return new li(param0, param1, param2 << 6, param3 << 6);
        }
        return null;
    }

    final synchronized void a(boolean param0) {
        this.field_l = param0 ? true : false;
    }

    private final void j() {
        if (this.field_o != 0) {
          if (this.field_i == -2147483648) {
            this.field_i = 0;
          }
          this.field_o = 0;
          this.e();
          return;
        }
    }

    final synchronized boolean h() {
        return this.field_q < 0 || this.field_q >= ((td) (this.field_e)).field_j.length << 8;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, li param10, int param11, int param12) {
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

    final synchronized void i(int param0) {
        if (this.field_v < 0) {
          this.field_v = -param0;
        } else {
          this.field_v = param0;
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        this.a(param0, param1 << 6, param2 << 6);
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, li param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.field_p = param13.field_p - param13.field_u * param5;
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
        param13.field_p = param13.field_p + param13.field_u * param5;
        param13.field_j = param6;
        param13.field_r = param7;
        param13.field_q = param4;
        return param5;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, li param10) {
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

    private final void e() {
        this.field_p = this.field_i;
        this.field_j = li.a(this.field_i, this.field_t);
        this.field_r = li.d(this.field_i, this.field_t);
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, li param10) {
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

    final synchronized void e(int param0) {
        param0 = param0 << 8;
        int var2 = ((td) (this.field_e)).field_j.length << 8;
        if (param0 < -1) {
          param0 = -1;
        }
        if (param0 > var2) {
          param0 = var2;
        }
        this.field_q = param0;
    }

    private final boolean i() {
        int var1;
        int var2;
        int var3;
        var1 = this.field_i;
        if (var1 != -2147483648) {
          var2 = li.a(var1, this.field_t);
          var3 = li.d(var1, this.field_t);
        } else {
          var3 = 0;
          var2 = 0;
          var1 = 0;
        }
        if (this.field_p == var1 &&
          this.field_j == var2 &&
          this.field_r == var3) {
          if (this.field_i != -2147483648) {
            this.e();
            return false;
          }
          this.field_i = 0;
          this.field_r = 0;
          this.field_j = 0;
          this.field_p = 0;
          this.c(-19822);
          return true;
        }
        if (this.field_p >= var1) {
          if (this.field_p <= var1) {
            this.field_u = 0;
          } else {
            this.field_u = -1;
            this.field_o = this.field_p - var1;
          }
        } else {
          this.field_u = 1;
          this.field_o = var1 - this.field_p;
        }
        if (this.field_j >= var2) {
          if (this.field_j <= var2) {
            this.field_k = 0;
          } else {
            this.field_k = -1;
            if (this.field_o == 0 ||
              this.field_o > this.field_j - var2) {
              this.field_o = this.field_j - var2;
            }
          }
        } else {
          this.field_k = 1;
          if (this.field_o == 0 ||
            this.field_o > var2 - this.field_j) {
            this.field_o = var2 - this.field_j;
          }
        }
        if (this.field_r < var3) {
          this.field_w = 1;
          if (this.field_o != 0 &&
            this.field_o <= var3 - this.field_r) {
            return false;
          }
          this.field_o = var3 - this.field_r;
          return false;
        }
        if (this.field_r <= var3) {
          this.field_w = 0;
        } else {
          this.field_w = -1;
          if (this.field_o == 0 ||
            this.field_o > this.field_r - var3) {
            this.field_o = this.field_r - var3;
          }
        }
        return false;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, li param8) {
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, li param11, int param12, int param13) {
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

    private final static int a(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, li param8) {
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

    private final synchronized int g() {
        return this.field_t < 0 ? -1 : this.field_t;
    }

    final int c() {
        int var1 = this.field_p * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.field_m == 0) {
          var1 = var1 - var1 * this.field_q / (((td) (this.field_e)).field_j.length << 8);
        } else {
          if (this.field_m >= 0) {
            var1 = var1 - var1 * this.field_s / ((td) (this.field_e)).field_j.length;
          }
        }
        return var1 > 255 ? 255 : var1;
    }

    final fh b() {
        return null;
    }

    final synchronized void g(int param0) {
        this.b(param0, this.g());
    }

    private final synchronized void b(int param0, int param1) {
        this.field_i = param0;
        this.field_t = param1;
        this.field_o = 0;
        this.e();
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, li param9) {
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
        param9.field_j = param9.field_j + param9.field_k * (param6 - param3);
        param9.field_r = param9.field_r + param9.field_w * (param6 - param3);
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
        param9.field_p = param4 >> 2;
        param9.field_q = param2 << 8;
        return param3;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, li param12) {
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
        param12.field_p = param12.field_p + param12.field_u * (param9 - param4);
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
        param12.field_j = param5 >> 2;
        param12.field_r = param6 >> 2;
        param12.field_q = param3 << 8;
        return param4 >> 1;
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, li param11, int param12, int param13) {
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, li param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.field_p = param13.field_p - param13.field_u * param5;
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
        param13.field_p = param13.field_p + param13.field_u * param5;
        param13.field_j = param6;
        param13.field_r = param7;
        param13.field_q = param4;
        return param5;
    }

    final synchronized void h(int param0) {
        this.field_m = param0;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, li param11, int param12, int param13) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        param11.field_j = param11.field_j - param11.field_k * param5;
        param11.field_r = param11.field_r - param11.field_w * param5;
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
        param11.field_j = param11.field_j + param11.field_k * param5;
        param11.field_r = param11.field_r + param11.field_w * param5;
        param11.field_p = param6;
        param11.field_q = param4;
        return param5;
    }

    private final synchronized void a(int param0, int param1, int param2) {
        int var6 = 0;
        int var6Lifetime1;
        if (param0 == 0) {
          this.b(param1, param2);
          return;
        }
        int var4 = li.a(param1, param2);
        int var5 = li.d(param1, param2);
        if (this.field_j != var4) {
          var6 = param1 - this.field_p;
          if (this.field_p - param1 > var6) {
            var6 = this.field_p - param1;
          }
          if (var4 - this.field_j > var6) {
            var6 = var4 - this.field_j;
          }
          if (this.field_j - var4 > var6) {
            var6 = this.field_j - var4;
          }
          if (var5 - this.field_r > var6) {
            var6 = var5 - this.field_r;
          }
          if (this.field_r - var5 > var6) {
            var6 = this.field_r - var5;
          }
          if (param0 > var6) {
            param0 = var6;
          }
          this.field_o = param0;
          this.field_i = param1;
          this.field_t = param2;
          this.field_u = (param1 - this.field_p) / param0;
          this.field_k = (var4 - this.field_j) / param0;
          this.field_w = (var5 - this.field_r) / param0;
          return;
        }
        if (this.field_r != var5) {
          var6Lifetime1 = param1 - this.field_p;
          if (this.field_p - param1 > var6Lifetime1) {
            var6Lifetime1 = this.field_p - param1;
          }
          if (var4 - this.field_j > var6Lifetime1) {
            var6Lifetime1 = var4 - this.field_j;
          }
          if (this.field_j - var4 > var6Lifetime1) {
            var6Lifetime1 = this.field_j - var4;
          }
          if (var5 - this.field_r > var6Lifetime1) {
            var6Lifetime1 = var5 - this.field_r;
          }
          if (this.field_r - var5 > var6Lifetime1) {
            var6Lifetime1 = this.field_r - var5;
          }
          if (param0 > var6Lifetime1) {
            param0 = var6Lifetime1;
          }
          this.field_o = param0;
          this.field_i = param1;
          this.field_t = param2;
          this.field_u = (param1 - this.field_p) / param0;
          this.field_k = (var4 - this.field_j) / param0;
          this.field_w = (var5 - this.field_r) / param0;
          return;
        }
        this.field_o = 0;
    }

    final fh a() {
        return null;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, li param12) {
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
        param12.field_p = param12.field_p + param12.field_u * (param9 - param4);
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
        param12.field_j = param5 >> 2;
        param12.field_r = param6 >> 2;
        param12.field_q = param3 << 8;
        return param4 >> 1;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.field_o <= 0) {
            if (this.field_v == -256 &&
              (this.field_q & 255) == 0) {
              if (va.field_n) {
                return li.a(0, ((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_j, this.field_r, 0, param3, param2, this);
              }
              return li.b(((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_p, 0, param3, param2, this);
            }
            if (va.field_n) {
              return li.d(0, 0, ((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_j, this.field_r, 0, param3, param2, this, this.field_v, param4);
            }
            return li.b(0, 0, ((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_p, 0, param3, param2, this, this.field_v, param4);
          }
          var6 = param1 + this.field_o;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_o = this.field_o + param1;
          if (this.field_v == -256 &&
            (this.field_q & 255) == 0) {
            if (!va.field_n) {
              param1 = li.b(((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_p, this.field_u, 0, var6, param2, this);
            } else {
              param1 = li.b(0, ((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_j, this.field_r, this.field_k, this.field_w, 0, var6, param2, this);
            }
          } else {
            if (!va.field_n) {
              param1 = li.c(0, 0, ((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_p, this.field_u, 0, var6, param2, this, this.field_v, param4);
            } else {
              param1 = li.a(0, 0, ((td) (this.field_e)).field_j, param0, this.field_q, param1, this.field_j, this.field_r, this.field_k, this.field_w, 0, var6, param2, this, this.field_v, param4);
            }
          }
          this.field_o = this.field_o - param1;
          if (this.field_o != 0) {
            return param1;
          }
        } while (!this.i());
        return param3;
    }

    private li(td param0, int param1, int param2) {
        this.field_e = (jl) ((Object) param0);
        this.field_s = param0.field_i;
        this.field_n = param0.field_g;
        this.field_l = param0.field_h;
        this.field_v = param1;
        this.field_i = param2;
        this.field_t = 8192;
        this.field_q = 0;
        this.e();
    }

    private li(td param0, int param1, int param2, int param3) {
        this.field_e = (jl) ((Object) param0);
        this.field_s = param0.field_i;
        this.field_n = param0.field_g;
        this.field_l = param0.field_h;
        this.field_v = param1;
        this.field_i = param2;
        this.field_t = param3;
        this.field_q = 0;
        this.e();
    }
}
