/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends je {
    private int field_w;
    private int field_t;
    private int field_q;
    private int field_u;
    private boolean field_o;
    private int field_k;
    private int field_n;
    private int field_l;
    private int field_p;
    private int field_m;
    private int field_x;
    private int field_y;
    private int field_r;
    private int field_v;
    private int field_s;

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
        param11.field_u = param4;
        return param5 >> 1;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int discarded$4 = 0;
        int discarded$3 = 0;
        ib var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var10Lifetime1;
        if (this.field_m == 0 &&
          this.field_x == 0) {
          this.a(param2);
          return;
        }
        var4 = (ib) (this.field_i);
        var5 = this.field_r << 8;
        var6 = this.field_t << 8;
        var7 = var4.field_h.length << 8;
        var8 = var6 - var5;
        if (var8 <= 0) {
          this.field_l = 0;
        }
        var9 = param1;
        param2 = param2 + param1;
        if (this.field_u < 0) {
          if (this.field_p <= 0) {
            this.f();
            this.c(103);
            return;
          }
          this.field_u = 0;
        }
        if (this.field_u >= var7) {
          if (this.field_p >= 0) {
            this.f();
            this.c(126);
            return;
          }
          this.field_u = var7 - 1;
        }
        if (this.field_l < 0) {
          if (!this.field_o) {
            if (this.field_p >= 0) {
              while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_h[this.field_r]);
                if (this.field_u < var6) {
                  return;
                }
                this.field_u = var5 + (this.field_u - var5) % var8;
              }
            }
            while (true) {
              var9 = this.a(param0, var9, var5, param2, (int) var4.field_h[this.field_t - 1]);
              if (this.field_u >= var5) {
                return;
              }
              this.field_u = var6 - 1 - (var6 - 1 - this.field_u) % var8;
            }
          }
          if (this.field_p < 0) {
            var9 = this.a(param0, var9, var5, param2, (int) var4.field_h[this.field_r]);
            if (this.field_u >= var5) {
              return;
            }
            this.field_u = var5 + var5 - 1 - this.field_u;
            this.field_p = -this.field_p;
          }
          while (true) {
            var9 = this.b(param0, var9, var6, param2, (int) var4.field_h[this.field_t - 1]);
            if (this.field_u < var6) {
              return;
            }
            this.field_u = var6 + var6 - 1 - this.field_u;
            this.field_p = -this.field_p;
            var9 = this.a(param0, var9, var5, param2, (int) var4.field_h[this.field_r]);
            if (this.field_u >= var5) {
              return;
            }
            this.field_u = var5 + var5 - 1 - this.field_u;
            this.field_p = -this.field_p;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_l > 0) {
          if (!this.field_o) {
            if (this.field_p < 0) {
              while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_h[this.field_t - 1]);
                if (this.field_u >= var5) {
                  return;
                }
                var10 = (var6 - 1 - this.field_u) / var8;
                if (var10 < this.field_l) {
                  this.field_u = this.field_u + var8 * var10;
                  this.field_l = this.field_l - var10;
                  continue;
                }
                break;
              }
              this.field_u = this.field_u + var8 * this.field_l;
              this.field_l = 0;
            } else {
              while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_h[this.field_r]);
                if (this.field_u < var6) {
                  return;
                }
                var10Lifetime1 = (this.field_u - var5) / var8;
                if (var10Lifetime1 < this.field_l) {
                  this.field_u = this.field_u - var8 * var10Lifetime1;
                  this.field_l = this.field_l - var10Lifetime1;
                  continue;
                }
                break;
              }
              this.field_u = this.field_u - var8 * this.field_l;
              this.field_l = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_p < 0) {
              var9 = this.a(param0, var9, var5, param2, (int) var4.field_h[this.field_r]);
              if (this.field_u >= var5) {
                return;
              }
              this.field_u = var5 + var5 - 1 - this.field_u;
              this.field_p = -this.field_p;
              fieldTemp$0 = this.field_l - 1;
              this.field_l = this.field_l - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_h[this.field_t - 1]);
                if (this.field_u < var6) {
                  return;
                }
                this.field_u = var6 + var6 - 1 - this.field_u;
                this.field_p = -this.field_p;
                fieldTemp$1 = this.field_l - 1;
                this.field_l = this.field_l - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_h[this.field_r]);
                if (this.field_u >= var5) {
                  return;
                }
                this.field_u = var5 + var5 - 1 - this.field_u;
                this.field_p = -this.field_p;
                fieldTemp$2 = this.field_l - 1;
                this.field_l = this.field_l - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.field_p >= 0) {
          discarded$4 = this.b(param0, var9, var7, param2, 0);
          if (this.field_u >= var7) {
            this.field_u = var7;
            this.f();
            this.c(122);
          }
          return;
        }
        discarded$3 = this.a(param0, var9, 0, param2, 0);
        if (this.field_u >= 0) {
          return;
        }
        this.field_u = -1;
        this.f();
        this.c(92);
        return;
    }

    final synchronized int g() {
        return this.field_m == -2147483648 ? 0 : this.field_m;
    }

    final synchronized void a(boolean param0) {
        this.field_o = param0 ? true : false;
    }

    final synchronized void h(int param0) {
        param0 = param0 << 8;
        int var2 = ((ib) (this.field_i)).field_h.length << 8;
        if (param0 < -1) {
          param0 = -1;
        }
        if (param0 > var2) {
          param0 = var2;
        }
        this.field_u = param0;
    }

    final je b() {
        return null;
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
        param10.field_u = param3 << 8;
        return param4 >> 1;
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
        param8.field_u = param2 << 8;
        return param3;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, li param11, int param12, int param13) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        param11.field_v = param11.field_v - param11.field_s * param5;
        param11.field_w = param11.field_w - param11.field_y * param5;
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
        param11.field_v = param11.field_v + param11.field_s * param5;
        param11.field_w = param11.field_w + param11.field_y * param5;
        param11.field_q = param6;
        param11.field_u = param4;
        return param5;
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
        param12.field_q = param12.field_q + param12.field_k * (param9 - param4);
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
        param12.field_v = param5 >> 2;
        param12.field_w = param6 >> 2;
        param12.field_u = param3 << 8;
        return param4 >> 1;
    }

    private final void f() {
        if (this.field_x != 0) {
          if (this.field_m == -2147483648) {
            this.field_m = 0;
          }
          this.field_x = 0;
          this.i();
          return;
        }
    }

    private final synchronized void a(int param0, int param1) {
        this.field_m = param0;
        this.field_n = param1;
        this.field_x = 0;
        this.i();
    }

    final synchronized void e(int param0) {
        this.field_l = param0;
    }

    final static li a(ib param0, int param1, int param2, int param3) {
        if (param0.field_h == null) {
          return null;
        }
        if (param0.field_h.length != 0) {
          return new li(param0, param1, param2 << 6, param3 << 6);
        }
        return null;
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
        param11.field_u = param4;
        return param5 >> 1;
    }

    final synchronized void f(int param0) {
        this.a(param0, this.h());
    }

    final je a() {
        return null;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.field_x <= 0) {
            if (this.field_p == 256 &&
              (this.field_u & 255) == 0) {
              if (gd.field_q) {
                return li.a(0, ((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_v, this.field_w, 0, param3, param2, this);
              }
              return li.b(((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_q, 0, param3, param2, this);
            }
            if (gd.field_q) {
              return li.b(0, 0, ((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_v, this.field_w, 0, param3, param2, this, this.field_p, param4);
            }
            return li.a(0, 0, ((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_q, 0, param3, param2, this, this.field_p, param4);
          }
          var6 = param1 + this.field_x;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_x = this.field_x + param1;
          if (this.field_p == 256 &&
            (this.field_u & 255) == 0) {
            if (!gd.field_q) {
              param1 = li.a(((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_q, this.field_k, 0, var6, param2, this);
            } else {
              param1 = li.a(0, ((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_v, this.field_w, this.field_s, this.field_y, 0, var6, param2, this);
            }
          } else {
            if (!gd.field_q) {
              param1 = li.c(0, 0, ((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_q, this.field_k, 0, var6, param2, this, this.field_p, param4);
            } else {
              param1 = li.a(0, 0, ((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_v, this.field_w, this.field_s, this.field_y, 0, var6, param2, this, this.field_p, param4);
            }
          }
          this.field_x = this.field_x - param1;
          if (this.field_x != 0) {
            return param1;
          }
        } while (!this.e());
        return param3;
    }

    private final void i() {
        this.field_q = this.field_m;
        this.field_v = li.b(this.field_m, this.field_n);
        this.field_w = li.d(this.field_m, this.field_n);
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
        param10.field_u = param4;
        return param5;
    }

    private final static int d(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int b(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.field_x <= 0) {
            if (this.field_p == -256 &&
              (this.field_u & 255) == 0) {
              if (gd.field_q) {
                return li.b(0, ((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_v, this.field_w, 0, param3, param2, this);
              }
              return li.a(((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_q, 0, param3, param2, this);
            }
            if (gd.field_q) {
              return li.d(0, 0, ((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_v, this.field_w, 0, param3, param2, this, this.field_p, param4);
            }
            return li.b(0, 0, ((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_q, 0, param3, param2, this, this.field_p, param4);
          }
          var6 = param1 + this.field_x;
          if (var6 > param3) {
            var6 = param3;
          }
          this.field_x = this.field_x + param1;
          if (this.field_p == -256 &&
            (this.field_u & 255) == 0) {
            if (!gd.field_q) {
              param1 = li.b(((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_q, this.field_k, 0, var6, param2, this);
            } else {
              param1 = li.b(0, ((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_v, this.field_w, this.field_s, this.field_y, 0, var6, param2, this);
            }
          } else {
            if (!gd.field_q) {
              param1 = li.a(0, 0, ((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_q, this.field_k, 0, var6, param2, this, this.field_p, param4);
            } else {
              param1 = li.b(0, 0, ((ib) (this.field_i)).field_h, param0, this.field_u, param1, this.field_v, this.field_w, this.field_s, this.field_y, 0, var6, param2, this, this.field_p, param4);
            }
          }
          this.field_x = this.field_x - param1;
          if (this.field_x != 0) {
            return param1;
          }
        } while (!this.e());
        return param3;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, li param11, int param12, int param13) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        param11.field_v = param11.field_v - param11.field_s * param5;
        param11.field_w = param11.field_w - param11.field_y * param5;
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
        param11.field_v = param11.field_v + param11.field_s * param5;
        param11.field_w = param11.field_w + param11.field_y * param5;
        param11.field_q = param6;
        param11.field_u = param4;
        return param5;
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
        param10.field_u = param4;
        return param5;
    }

    final synchronized void c(int param0, int param1) {
        this.field_r = param0;
        this.field_t = param1;
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == 0) {
          this.f(0);
          this.c(127);
          return;
        }
        if (this.field_v != 0) {
          var2 = -this.field_q;
          if (this.field_q > var2) {
            var2 = this.field_q;
          }
          if (-this.field_v > var2) {
            var2 = -this.field_v;
          }
          if (this.field_v > var2) {
            var2 = this.field_v;
          }
          if (-this.field_w > var2) {
            var2 = -this.field_w;
          }
          if (this.field_w > var2) {
            var2 = this.field_w;
          }
          if (param0 > var2) {
            param0 = var2;
          }
          this.field_x = param0;
          this.field_m = -2147483648;
          this.field_k = -this.field_q / param0;
          this.field_s = -this.field_v / param0;
          this.field_y = -this.field_w / param0;
          return;
        }
        if (this.field_w != 0) {
          var2Lifetime1 = -this.field_q;
          if (this.field_q > var2Lifetime1) {
            var2Lifetime1 = this.field_q;
          }
          if (-this.field_v > var2Lifetime1) {
            var2Lifetime1 = -this.field_v;
          }
          if (this.field_v > var2Lifetime1) {
            var2Lifetime1 = this.field_v;
          }
          if (-this.field_w > var2Lifetime1) {
            var2Lifetime1 = -this.field_w;
          }
          if (this.field_w > var2Lifetime1) {
            var2Lifetime1 = this.field_w;
          }
          if (param0 > var2Lifetime1) {
            param0 = var2Lifetime1;
          }
          this.field_x = param0;
          this.field_m = -2147483648;
          this.field_k = -this.field_q / param0;
          this.field_s = -this.field_v / param0;
          this.field_y = -this.field_w / param0;
          return;
        }
        this.field_x = 0;
        this.field_m = 0;
        this.field_q = 0;
        this.c(122);
    }

    final static li a(ib param0, int param1, int param2) {
        if (param0.field_h == null) {
          return null;
        }
        if (param0.field_h.length != 0) {
          return new li(param0, (int)((long)param0.field_l * 256L * (long)param1 / (long)(100 * gd.field_m)), param2 << 6);
        }
        return null;
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
        param8.field_u = param2 << 8;
        return param3;
    }

    final synchronized void b(int param0, int param1, int param2) {
        this.a(param0, param1 << 6, param2 << 6);
    }

    private final boolean e() {
        int var1;
        int var2;
        int var3;
        var1 = this.field_m;
        if (var1 != -2147483648) {
          var2 = li.b(var1, this.field_n);
          var3 = li.d(var1, this.field_n);
        } else {
          var3 = 0;
          var2 = 0;
          var1 = 0;
        }
        if (this.field_q == var1 &&
          this.field_v == var2 &&
          this.field_w == var3) {
          if (this.field_m != -2147483648) {
            this.i();
            return false;
          }
          this.field_m = 0;
          this.field_w = 0;
          this.field_v = 0;
          this.field_q = 0;
          this.c(91);
          return true;
        }
        if (this.field_q >= var1) {
          if (this.field_q <= var1) {
            this.field_k = 0;
          } else {
            this.field_k = -1;
            this.field_x = this.field_q - var1;
          }
        } else {
          this.field_k = 1;
          this.field_x = var1 - this.field_q;
        }
        if (this.field_v >= var2) {
          if (this.field_v <= var2) {
            this.field_s = 0;
          } else {
            this.field_s = -1;
            if (this.field_x == 0 ||
              this.field_x > this.field_v - var2) {
              this.field_x = this.field_v - var2;
            }
          }
        } else {
          this.field_s = 1;
          if (this.field_x == 0 ||
            this.field_x > var2 - this.field_v) {
            this.field_x = var2 - this.field_v;
          }
        }
        if (this.field_w < var3) {
          this.field_y = 1;
          if (this.field_x != 0 &&
            this.field_x <= var3 - this.field_w) {
            return false;
          }
          this.field_x = var3 - this.field_w;
          return false;
        }
        if (this.field_w <= var3) {
          this.field_y = 0;
        } else {
          this.field_y = -1;
          if (this.field_x == 0 ||
            this.field_x > this.field_w - var3) {
            this.field_x = this.field_w - var3;
          }
        }
        return false;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, li param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.field_q = param13.field_q - param13.field_k * param5;
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
        param13.field_q = param13.field_q + param13.field_k * param5;
        param13.field_v = param6;
        param13.field_w = param7;
        param13.field_u = param4;
        return param5;
    }

    final synchronized void g(int param0) {
        this.a(param0 << 6, this.h());
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, li param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.field_q = param13.field_q - param13.field_k * param5;
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
        param13.field_q = param13.field_q + param13.field_k * param5;
        param13.field_v = param6;
        param13.field_w = param7;
        param13.field_u = param4;
        return param5;
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
        param9.field_v = param9.field_v + param9.field_s * (param6 - param3);
        param9.field_w = param9.field_w + param9.field_y * (param6 - param3);
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
        param9.field_q = param4 >> 2;
        param9.field_u = param2 << 8;
        return param3;
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
        param12.field_q = param12.field_q + param12.field_k * (param9 - param4);
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
        param12.field_v = param5 >> 2;
        param12.field_w = param6 >> 2;
        param12.field_u = param3 << 8;
        return param4 >> 1;
    }

    final int d() {
        int var1 = this.field_q * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.field_l == 0) {
          var1 = var1 - var1 * this.field_u / (((ib) (this.field_i)).field_h.length << 8);
        } else {
          if (this.field_l >= 0) {
            var1 = var1 - var1 * this.field_r / ((ib) (this.field_i)).field_h.length;
          }
        }
        return var1 > 255 ? 255 : var1;
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
        param10.field_u = param3 << 8;
        return param4 >> 1;
    }

    final int c() {
        if (this.field_m == 0 &&
          this.field_x == 0) {
          return 0;
        }
        return 1;
    }

    private final synchronized int h() {
        return this.field_n < 0 ? -1 : this.field_n;
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
        param9.field_v = param9.field_v + param9.field_s * (param6 - param3);
        param9.field_w = param9.field_w + param9.field_y * (param6 - param3);
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
        param9.field_q = param4 >> 2;
        param9.field_u = param2 << 8;
        return param3;
    }

    private final synchronized void a(int param0, int param1, int param2) {
        int var6 = 0;
        int var6Lifetime1;
        if (param0 == 0) {
          this.a(param1, param2);
          return;
        }
        int var4 = li.b(param1, param2);
        int var5 = li.d(param1, param2);
        if (this.field_v != var4) {
          var6 = param1 - this.field_q;
          if (this.field_q - param1 > var6) {
            var6 = this.field_q - param1;
          }
          if (var4 - this.field_v > var6) {
            var6 = var4 - this.field_v;
          }
          if (this.field_v - var4 > var6) {
            var6 = this.field_v - var4;
          }
          if (var5 - this.field_w > var6) {
            var6 = var5 - this.field_w;
          }
          if (this.field_w - var5 > var6) {
            var6 = this.field_w - var5;
          }
          if (param0 > var6) {
            param0 = var6;
          }
          this.field_x = param0;
          this.field_m = param1;
          this.field_n = param2;
          this.field_k = (param1 - this.field_q) / param0;
          this.field_s = (var4 - this.field_v) / param0;
          this.field_y = (var5 - this.field_w) / param0;
          return;
        }
        if (this.field_w != var5) {
          var6Lifetime1 = param1 - this.field_q;
          if (this.field_q - param1 > var6Lifetime1) {
            var6Lifetime1 = this.field_q - param1;
          }
          if (var4 - this.field_v > var6Lifetime1) {
            var6Lifetime1 = var4 - this.field_v;
          }
          if (this.field_v - var4 > var6Lifetime1) {
            var6Lifetime1 = this.field_v - var4;
          }
          if (var5 - this.field_w > var6Lifetime1) {
            var6Lifetime1 = var5 - this.field_w;
          }
          if (this.field_w - var5 > var6Lifetime1) {
            var6Lifetime1 = this.field_w - var5;
          }
          if (param0 > var6Lifetime1) {
            param0 = var6Lifetime1;
          }
          this.field_x = param0;
          this.field_m = param1;
          this.field_n = param2;
          this.field_k = (param1 - this.field_q) / param0;
          this.field_s = (var4 - this.field_v) / param0;
          this.field_y = (var5 - this.field_w) / param0;
          return;
        }
        this.field_x = 0;
    }

    final synchronized void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        ib var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (this.field_x > 0) {
          if (param0 < this.field_x) {
            this.field_q = this.field_q + this.field_k * param0;
            this.field_v = this.field_v + this.field_s * param0;
            this.field_w = this.field_w + this.field_y * param0;
            this.field_x = this.field_x - param0;
          } else {
            if (this.field_m == -2147483648) {
              this.field_m = 0;
              this.field_w = 0;
              this.field_v = 0;
              this.field_q = 0;
              this.c(83);
              param0 = this.field_x;
            }
            this.field_x = 0;
            this.i();
          }
        }
        var2 = (ib) (this.field_i);
        var3 = this.field_r << 8;
        var4 = this.field_t << 8;
        var5 = var2.field_h.length << 8;
        var6 = var4 - var3;
        if (var6 <= 0) {
          this.field_l = 0;
        }
        if (this.field_u < 0) {
          if (this.field_p <= 0) {
            this.f();
            this.c(93);
            return;
          }
          this.field_u = 0;
        }
        if (this.field_u >= var5) {
          if (this.field_p >= 0) {
            this.f();
            this.c(113);
            return;
          }
          this.field_u = var5 - 1;
        }
        this.field_u = this.field_u + this.field_p * param0;
        if (this.field_l < 0) {
          if (!this.field_o) {
            if (this.field_p >= 0) {
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
          if (this.field_p < 0) {
            if (this.field_u >= var3) {
              return;
            }
            this.field_u = var3 + var3 - 1 - this.field_u;
            this.field_p = -this.field_p;
          }
          while (this.field_u >= var4) {
            this.field_u = var4 + var4 - 1 - this.field_u;
            this.field_p = -this.field_p;
            if (this.field_u >= var3) {
              return;
            }
            this.field_u = var3 + var3 - 1 - this.field_u;
            this.field_p = -this.field_p;
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_l > 0) {
          if (!this.field_o) {
            if (this.field_p >= 0) {
              if (this.field_u < var4) {
                return;
              }
              var7 = (this.field_u - var3) / var6;
              if (var7 >= this.field_l) {
                this.field_u = this.field_u - var6 * this.field_l;
                this.field_l = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_u = this.field_u - var6 * var7;
                this.field_l = this.field_l - var7;
              }
            } else {
              if (this.field_u >= var3) {
                return;
              }
              var7 = (var4 - 1 - this.field_u) / var6;
              if (var7 >= this.field_l) {
                this.field_u = this.field_u + var6 * this.field_l;
                this.field_l = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_u = this.field_u + var6 * var7;
                this.field_l = this.field_l - var7;
              }
            }
            if (decompiledFrameRemainder0) {
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_p < 0) {
              if (this.field_u >= var3) {
                return;
              }
              this.field_u = var3 + var3 - 1 - this.field_u;
              this.field_p = -this.field_p;
              fieldTemp$0 = this.field_l - 1;
              this.field_l = this.field_l - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                if (this.field_u < var4) {
                  return;
                }
                this.field_u = var4 + var4 - 1 - this.field_u;
                this.field_p = -this.field_p;
                fieldTemp$1 = this.field_l - 1;
                this.field_l = this.field_l - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                if (this.field_u >= var3) {
                  return;
                }
                this.field_u = var3 + var3 - 1 - this.field_u;
                this.field_p = -this.field_p;
                fieldTemp$2 = this.field_l - 1;
                this.field_l = this.field_l - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.field_p >= 0) {
          if (this.field_u >= var5) {
            this.field_u = var5;
            this.f();
            this.c(101);
          }
          return;
        }
        if (this.field_u >= 0) {
          return;
        }
        this.field_u = -1;
        this.f();
        this.c(103);
    }

    final synchronized void i(int param0) {
        if (this.field_p < 0) {
          this.field_p = -param0;
        } else {
          this.field_p = param0;
        }
    }

    private li(ib param0, int param1, int param2) {
        this.field_i = (ea) ((Object) param0);
        this.field_r = param0.field_j;
        this.field_t = param0.field_k;
        this.field_o = param0.field_i;
        this.field_p = param1;
        this.field_m = param2;
        this.field_n = 8192;
        this.field_u = 0;
        this.i();
    }

    private li(ib param0, int param1, int param2, int param3) {
        this.field_i = (ea) ((Object) param0);
        this.field_r = param0.field_j;
        this.field_t = param0.field_k;
        this.field_o = param0.field_i;
        this.field_p = param1;
        this.field_m = param2;
        this.field_n = param3;
        this.field_u = 0;
        this.i();
    }
}
