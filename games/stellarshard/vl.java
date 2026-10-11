/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    int field_f;
    static String field_h;
    private int field_b;
    int field_l;
    double field_j;
    static String field_i;
    private qe field_g;
    static bj[] field_r;
    int field_n;
    static int[][] field_o;
    double field_k;
    int field_q;
    double field_a;
    static boolean[] field_s;
    private int field_e;
    int field_d;
    int field_m;
    double field_c;
    int field_p;

    private final void b(byte param0) {
        int var2 = 0;
        qe var3;
        double var4;
        double var6;
        double var8;
        double var10;
        double var12;
        double var14;
        double var16;
        double var18;
        double var20;
        double var22;
        double var24;
        double var26;
        double var28;
        vl var30;
        double var31;
        double var33;
        int var35;
        int var36;
        double var26Lifetime1;
        double var28Lifetime1;
        var36 = stellarshard.field_B;
        if (param0 >= -125) {
          this.a(88, 65, true);
        }
        for (var2 = 0; var2 < 1000; var2++) {
          if (a.field_h[var2] != null &&
            this.a(-48, a.field_h[var2], false) && (a.field_h[var2].field_m != -1 ||
            nc.field_H != 2)) {
            var3 = a.field_h[var2];
            if (var3 != this.field_g &&
              !var3.a((byte) -47)) {
              var4 = -var3.field_a + this.field_c;
              var6 = this.field_k - var3.field_l;
              if (0.0 != var4 ||
                0.0 != var6) {
                var8 = Math.sqrt(var6 * var6 + var4 * var4);
                var10 = var4 / var8;
                var12 = var6 / var8;
                var14 = -(this.field_a * var10) + var12 * this.field_j;
                var16 = -(var10 * var3.field_k) + var12 * var3.field_d;
                var18 = var10 * this.field_j + this.field_a * var12;
                var20 = var3.field_d * var10 + var12 * var3.field_k;
                if (var18 < var20) {
                  var22 = var18 * (double)this.field_m + (double)var3.field_n * var20;
                  var24 = -var20 + var18;
                  var26 = 0.0;
                  var26Lifetime1 = (var22 - var24 * (double)var3.field_n) / (double)(this.field_m + var3.field_n);
                  var28 = 0.0;
                  if (0.0 == var10) {
                    var10 = 0.00001;
                  }
                  var28Lifetime1 = var24 + var26Lifetime1;
                  if (var12 == 0.0) {
                    var12 = 0.00001;
                  }
                  var30 = new vl(this);
                  var30.field_b = 0;
                  var30.field_f = 6;
                  wk.field_b[eg.a(-101)] = var30;
                  this.field_a = (var12 * (var26Lifetime1 / var10) - var14) / (var12 * var12 / var10 + var10);
                  var3.field_k = (var28Lifetime1 / var10 * var12 - var16) / (var12 * var12 / var10 + var10);
                  this.field_j = (-(this.field_a * var12) + var26Lifetime1) / var10;
                  var3.field_d = (var28Lifetime1 - var12 * var3.field_k) / var10;
                  if (a.field_h[var2].field_m == -1) {
                    if (el.field_I <= 0) {
                      el.field_I = 50;
                      this.field_p = this.field_p - 1;
                    }
                  } else {
                    this.field_p = this.field_p - 1;
                  }
                  if (11 != var3.field_m ||
                    var3.field_c != 13) {
                    var3.field_g = var3.field_g - 1;
                  }
                  if (fe.field_e &&
                    a.field_h[0] != null) {
                    var31 = -a.field_h[0].field_a + this.field_c;
                    var33 = this.field_k - a.field_h[0].field_l;
                    var35 = 128;
                    if (var31 != 0.0 ||
                      var33 != 0.0) {
                      var35 = (int)(25600.0 / Math.sqrt(var31 * var31 + var33 * var33));
                    }
                    if (var35 > 128) {
                      var35 = 128;
                    }
                    ll.field_c.a(sb.field_e[40], 100, pk.field_h * var35 / 50);
                  }
                  if (5 < this.field_p ||
                    this.field_l > 100) {
                    if (var3.field_m != 11 ||
                      var3.field_c != 13) {
                      var3.field_g = var3.field_g - this.field_p;
                    }
                    this.field_f = 4;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, pb param1) {
        boolean discarded$0 = false;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        double var6 = 0.0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        qe var10 = null;
        int var6_intLifetime1;
        int var6_intLifetime2;
        int var6_intLifetime3;
        int var6_intLifetime4;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime2Lifetime1;
        int var7Lifetime3Lifetime1;
        var9 = stellarshard.field_B;
        try {
          var3_int = (int)(320.0 + this.field_c);
          var4 = (int)(this.field_k + 240.0);
          var5 = this.field_q;
          if (this.field_d != -1) {
            var6_int = 16711680 & ((this.field_d & 16711680) * this.field_e + (128 - this.field_e) * (16711680 & this.field_q)) / 128;
            var7 = 65280 & ((this.field_d & 65280) * this.field_e + (65280 & this.field_q) * (-this.field_e + 128)) / 128;
            var8 = 255 & ((this.field_q & 255) * (128 - this.field_e) + (this.field_d & 255) * this.field_e) / 128;
            var5 = var8 + var7 + var6_int;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_f == 0) {
            if (this.field_n != -4) {
              if (this.field_n == -2) {
                ti.c(var3_int, var4, 5 + this.field_p, 16777215 - var5, 32);
                ti.e(var3_int, var4, 1 + this.field_p, var5);
              } else {
                if (this.field_n != -1 &&
                  this.field_n != 0) {
                  if (this.field_n != 1 &&
                    this.field_n != 6) {
                    if (this.field_n == 2) {
                      var6_intLifetime1 = (int)(Math.sin(0.1 * (double)this.field_b) * (double)this.field_p);
                      var7Lifetime1 = (int)(Math.cos((double)this.field_b * 0.1) * (double)this.field_p);
                      ti.c(var3_int + var6_intLifetime1, var4 + var7Lifetime1, this.field_p + 1, 0, 128);
                      ti.c(var3_int - var6_intLifetime1, -var7Lifetime1 + var4, 1 + this.field_p, 0, 128);
                      ti.c(var3_int + var6_intLifetime1, var4 + var7Lifetime1, this.field_p, var5, 128);
                      ti.c(var3_int - var6_intLifetime1, var4 - var7Lifetime1, this.field_p, var5, 128);
                      ti.e(var3_int + var6_intLifetime1, var4 + var7Lifetime1, 1 + this.field_p / 3, 16777215);
                      ti.e(var3_int - var6_intLifetime1, -var7Lifetime1 + var4, this.field_p / 3 + 1, 16777215);
                    } else {
                      if (((this.field_n != 3)) &&
                        ((7 != this.field_n)) &&
                        ((this.field_n != 4)) &&
                        ((this.field_n != 9))) {
                        if (this.field_n == 5) {
                          ti.c(var3_int, var4, this.field_p + 5, var5, 32);
                          ti.c(var3_int, var4, 3 + this.field_p, var5, 32);
                          ti.c(var3_int, var4, this.field_p + 1, 16777215, 32);
                        } else {
                          if (((this.field_n != -3)) && ((this.field_n == 10 ||
                            this.field_n == 11))) {
                            ti.a(var3_int << 4, var4 << 4, this.field_p + 6 << 4, 192, ei.field_I);
                          }
                        }
                      }
                    }
                  } else {
                    ti.e(var3_int, var4, this.field_p + 1, var5);
                    ti.e((int)(-(this.field_j / 2.0) + (double)var3_int), (int)((double)var4 - this.field_a / 2.0), this.field_p / 2 + 1, var5);
                    ti.e((int)(-(this.field_j / 4.0) + (double)var3_int), (int)((double)var4 - this.field_a / 4.0), 1 + this.field_p / 4, var5);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  ti.e(var3_int, var4, this.field_p + 1, var5);
                  ti.c((int)(-this.field_j + (double)var3_int), (int)(-this.field_a + (double)var4), this.field_p / 2 + 1, var5, 128);
                  ti.c((int)((double)var3_int - this.field_j * 2.0), (int)(-(this.field_a * 2.0) + (double)var4), 1 + this.field_p / 3, var5, 64);
                  ti.c((int)(-(this.field_j * 3.0) + (double)var3_int), (int)(-(this.field_a * 3.0) + (double)var4), 1 + this.field_p / 4, var5, 32);
                  ti.e(var3_int, var4, 1 + this.field_p / 2, 16777215);
                }
              }
            } else {
              ti.c(var3_int, var4, 5 + this.field_p, -var5 + 16777215, 32);
              ti.e(var3_int, var4, this.field_p, var5);
            }
          }
          if (this.field_f == 1) {
            param1.e();
            ti.c(var3_int, var4, this.field_b / 16 + 1, 255, 128 - this.field_b / 2);
            pd.field_h.a((byte) -107);
          }
          if (this.field_f == 4) {
            param1.e();
            ti.c(var3_int, var4, this.field_b / 16 + 1, 255, 128 - this.field_b / 2);
            pd.field_h.a((byte) -107);
          }
          if (this.field_f == 2 &&
            0 < this.field_b) {
            var6_intLifetime2 = this.field_b >> 4;
            var7Lifetime2 = 2 * this.field_b / 3 + 24;
            pg.field_hb[var6_intLifetime2].c(-var7Lifetime2 + var3_int, var4 - var7Lifetime2, var7Lifetime2 * 2, 2 * var7Lifetime2, (255 - this.field_b) / 2);
            var7Lifetime2Lifetime1 = 24 + 2 * this.field_b / 9;
            pg.field_hb[var6_intLifetime2].c(-var7Lifetime2Lifetime1 + var3_int, var4 - var7Lifetime2Lifetime1, var7Lifetime2Lifetime1 * 2, 2 * var7Lifetime2Lifetime1, 255 - this.field_b);
          }
          if (this.field_f == 6 &&
            this.field_b > 0) {
            var6_intLifetime3 = this.field_b >> 4;
            var7Lifetime3 = 12 + this.field_b / 3;
            pg.field_hb[var6_intLifetime3].c(var3_int - var7Lifetime3, var4 - var7Lifetime3, 2 * var7Lifetime3, var7Lifetime3 * 2, (255 - this.field_b) / 2);
            var7Lifetime3Lifetime1 = 12 + this.field_b / 9;
            pg.field_hb[var6_intLifetime3].c(-var7Lifetime3Lifetime1 + var3_int, var4 - var7Lifetime3Lifetime1, var7Lifetime3Lifetime1 * 2, var7Lifetime3Lifetime1 * 2, -this.field_b + 255);
          }
          if (3 == this.field_f) {
            ti.c(var3_int, var4, 7, 0, 128);
            ti.e(var3_int, var4, 2, var5);
            ti.c(var3_int, var4, 3, var5, 128);
            for (var6_intLifetime4 = 0; var6_intLifetime4 < 5; var6_intLifetime4++) {
              ti.c((int)((double)var3_int - this.field_j), (int)((double)var4 - this.field_a), 3, var5, 128 - 15 * var6_intLifetime4);
            }
          }
          if (this.field_f == 5) {
            if (-5 == this.field_n) {
              for (var6 = 0.0; 1.0 > var6; var6 = var6 + 0.1) {
                ti.a((int)(var6 * this.field_j + (double)var3_int) << 4, (int)((double)var4 + var6 * this.field_a) << 4, (int)(6.0 + (-var6 + 1.0) * (double)this.field_p) << 4, 32 - (int)(32.0 * var6), ei.field_I);
              }
            } else {
              for (var6 = 0.0; var6 < 1.0; var6 = var6 + 0.1) {
                ti.c((int)((double)var3_int + this.field_j * var6), (int)((double)var4 + var6 * this.field_a), 1 + this.field_p, var5, 255 - 64 * this.field_b);
              }
            }
          }
          if (param0 >= -35) {
            var10 = (qe) null;
            discarded$0 = this.a(68, (qe) null, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_66_0 = var3;
          stackIn_66_1 = new StringBuilder().append("vl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(')').toString());
        }
    }

    final vl a(byte param0) {
        int var2;
        double var3_double;
        vl var3;
        int var4;
        double var5;
        int var7;
        var7 = stellarshard.field_B;
        if (param0 >= -84) {
          return (vl) null;
        }
        var2 = this.field_l;
        if (var2 == 1001) {
          var2 = 250;
        }
        do {
          var2--;
          if (this.field_l == 1001) {
            var3_double = Math.sqrt(this.field_a * this.field_a + this.field_j * this.field_j);
            var5 = -0.1 + (Math.atan2(this.field_j, this.field_a) + 0.2 * Math.random());
            this.field_j = var3_double * Math.sin(var5);
            this.field_a = Math.cos(var5) * var3_double;
          }
          this.a(true);
          if (this.field_d != -1) {
            this.field_e = this.field_e + 1;
            if (128 > this.field_e) {
              this.field_e = this.field_e + 1;
              if (this.field_e >= 128) {
                this.field_e = 0;
                this.field_q = this.field_d;
                this.field_d = -1;
              }
            }
            if (-3 == this.field_n &&
              this.field_d == -1) {
              return null;
            }
          }
          if (this.field_f == 0) {
            this.field_b = this.field_b + 1;
            this.b((byte) -127);
            if (0 >= this.field_p) {
              this.field_j = this.field_j * 0.1;
              this.field_a = this.field_a * 0.1;
              this.field_p = 1;
              this.field_q = 16777215;
              this.field_f = 1;
            }
            if (this.field_f != 0) {
              this.field_l = 0;
            }
            if (this.field_l > 0 &&
              11 != this.field_n) {
              var3 = new vl(this);
              if (5 == this.field_l) {
                var3.field_p = 5 - var2;
              }
              var4 = dc.a(true);
              if (var4 > -1) {
                wk.field_b[var4] = var3;
              }
            }
          }
          if (this.field_f != 1) {
            if (this.field_f == 2) {
              this.field_b = this.field_b + 16;
              if (this.field_b > 255) {
                return null;
              }
            } else {
              if (this.field_f == 6) {
                this.field_b = this.field_b + 16;
                if (this.field_b > 255) {
                  return null;
                }
              }
            }
          } else {
            this.field_b = this.field_b + 16;
            if (255 < this.field_b) {
              return null;
            }
          }
          if (3 == this.field_f) {
            this.field_b = this.field_b + 1;
            this.b((byte) -126);
            if (this.field_p <= 0) {
              this.field_q = 16711680;
              this.field_p = 1;
              this.field_j = this.field_j * 0.1;
              this.field_f = 1;
              this.field_a = this.field_a * 0.1;
            }
          }
          if (this.field_f == 4) {
            this.b((byte) -128);
            this.field_b = this.field_b + 8;
            if (this.field_b > 255) {
              return null;
            }
            if (0 >= this.field_p) {
              this.field_b = 0;
              this.field_p = 1;
              this.field_f = 1;
              this.field_q = 16777215;
              this.field_a = this.field_a * 0.1;
              this.field_j = this.field_j * 0.1;
            }
          }
          if (-384.0 > this.field_c) {
            return null;
          }
          if (this.field_c > 384.0) {
            return null;
          }
          if (this.field_k < -304.0) {
            return null;
          }
          if (304.0 < this.field_k) {
            return null;
          }
          if (this.field_p <= 0) {
            return null;
          }
        } while (var2 > 0);
        if (this.field_l != 1001) {
          return this;
        }
        return null;
    }

    final void a(int param0, int param1, boolean param2) {
        this.field_k = this.field_k - (double)param0;
        if (!param2) {
          field_o = (int[][]) null;
        }
        this.field_c = this.field_c - (double)param1;
    }

    public static void a(int param0) {
        field_r = null;
        field_s = null;
        field_o = (int[][]) null;
        field_i = null;
        int var1 = 118 % ((-40 - param0) / 46);
        field_h = null;
    }

    private final void a(boolean param0) {
        this.field_c = this.field_c + this.field_j;
        if (!param0) {
          vl.a(-40);
        }
        this.field_k = this.field_k + this.field_a;
    }

    private final boolean a(int param0, qe param1, boolean param2) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1.field_a - 48.0 < this.field_c &&
            this.field_c < 48.0 + param1.field_a &&
            -48.0 + param1.field_l < this.field_k &&
            param1.field_l + 48.0 > this.field_k && (param2 ||
            param1.b(param0 ^ -688).c((int)(param1.field_a - 48.0), (int)(param1.field_l - 48.0), (int)this.field_c, (int)this.field_k))) {
            return true;
          }
          if (-4.0 + param1.field_a < this.field_c &&
            this.field_c < 4.0 + param1.field_a &&
            this.field_k > param1.field_l - 4.0 &&
            this.field_k < 4.0 + param1.field_l) {
            return true;
          }
          if (param0 == -48) {
            return false;
          }
          field_r = (bj[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("vl.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    private vl(vl param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_b = 0;
          this.field_n = -2;
          this.field_j = param0.field_j;
          this.field_e = param0.field_e;
          this.field_m = param0.field_m;
          this.field_d = param0.field_d;
          this.field_k = param0.field_k;
          this.field_p = param0.field_p;
          this.field_l = 0;
          this.field_q = param0.field_q;
          this.field_f = 5;
          this.field_c = param0.field_c;
          this.field_g = param0.field_g;
          this.field_a = param0.field_a;
          if (9 == param0.field_n) {
            this.field_n = -4;
          }
          if (param0.field_n == 10) {
            this.field_n = -5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("vl.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    vl(int param0, qe param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_m = 10;
          this.field_c = 0.0;
          this.field_k = 0.0;
          this.field_f = param0;
          this.field_q = 16777215;
          this.field_g = param1;
          this.field_b = 0;
          this.field_a = 0.0;
          this.field_e = 0;
          this.field_p = 1;
          this.field_j = 0.0;
          this.field_d = -1;
          if (param0 == 3) {
            this.field_q = 16711680;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("vl.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_h = "Sound: ";
        field_i = "to keep fullscreen or";
    }
}
