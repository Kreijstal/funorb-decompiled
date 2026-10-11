/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gf {
    private int field_B;
    double field_m;
    private double field_H;
    int field_u;
    private int field_a;
    static int[] field_o;
    int field_q;
    int field_I;
    static vd field_h;
    private ck[] field_j;
    private int field_f;
    private int field_E;
    private double field_z;
    nh field_g;
    double field_F;
    int field_l;
    private int field_n;
    private int[] field_x;
    private int[] field_v;
    double field_i;
    private double field_c;
    private int field_J;
    private int field_e;
    private double field_w;
    private int field_y;
    int field_t;
    static vd field_A;
    double field_d;
    static int field_C;
    static int field_D;
    static int[] field_k;
    static hm field_r;
    static int[] field_p;
    static String field_s;
    static boolean field_G;
    static int field_b;

    final boolean a(int param0, double param1, double param2) {
        boolean stackIn_39_0 = false;
        boolean stackIn_43_0 = false;
        boolean stackIn_57_0 = false;
        boolean stackIn_61_0 = false;
        boolean stackIn_87_0 = false;
        double var6;
        double var8;
        double var10;
        double var12;
        double var14;
        double var16;
        int var18;
        int var19;
        int var20;
        int var21;
        var21 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (-1 == this.field_I) {
          return true;
        }
        L0: {
          this.field_m = this.field_m + this.field_z;
          this.field_F = param1;
          this.field_d = param2;
          this.field_l = this.field_l + 1;
          this.field_i = this.field_i + this.field_c;
          var6 = Math.sqrt(this.field_z * this.field_z + this.field_c * this.field_c);
          var8 = this.field_c / var6;
          var10 = this.field_z / var6;
          var12 = param1 - this.field_m;
          var20 = this.field_I;
          if (var20 == 2) {
            this.field_j[0].a((int)this.field_m + this.field_u, 7, 24576, -117, 1, this.field_q + (int)this.field_i);
            this.field_j[1].a(2 + (this.field_u + (int)this.field_m), 7, 48, param0 ^ 16390, 1, (int)this.field_i + this.field_q);
            this.field_j[2].a(this.field_u + (int)this.field_m, 7, 24576, param0 - 16533, 1, this.field_q + (int)this.field_i + 2);
            this.field_j[3].a(this.field_u + (int)this.field_m - 2, 7, 48, -102, 1, this.field_q + ((int)this.field_i + 2));
          } else {
            if (4 == var20) {
              this.field_j[0].a((int)this.field_m + this.field_u, 4, 5263440, 114, 1, (int)this.field_i + this.field_q);
              this.field_j[1].a(this.field_u + (int)this.field_m + 2, 4, 5263440, -114, 1, (int)this.field_i + this.field_q);
              this.field_j[2].a((int)this.field_m + this.field_u, 4, 5263440, 122, 1, 2 + (this.field_q + (int)this.field_i));
              this.field_j[3].a(-2 + (int)this.field_m + this.field_u, 4, 5263440, param0 - 16596, 1, 2 + this.field_q + (int)this.field_i);
            } else {
              if (var20 == 6) {
                this.field_a = this.field_a - 32;
                stackIn_39_0 = !(this.field_a > 0);
                return stackIn_39_0;
              }
              if (27 == var20) {
                this.field_a = this.field_a - 4;
                stackIn_43_0 = !(this.field_a > 0);
                return stackIn_43_0;
              }
              if (11 != var20) {
                if (var20 != 13 &&
                  var20 != 15) {
                  if (var20 == 12) {
                    this.field_z = this.field_z + 0.1;
                  } else {
                    if (var20 != 14) {
                      if (0 == var20) {
                        this.field_j[0].a((int)this.field_m + this.field_u, 20, 2097152, -113, 1, this.field_q + (int)this.field_i);
                        this.field_j[1].a((int)this.field_m + hi.a(this.field_y, param0 ^ 16506, ug.field_m), 10, 8192, 112, 1, (int)this.field_i + hi.a(this.field_J, param0 - 16506, ug.field_m));
                      } else {
                        if (var20 != 5 &&
                          var20 != 10 &&
                          var20 != 16) {
                          if (var20 == 26) {
                            this.field_a = this.field_a - 4;
                            this.field_t = (int)Math.round((double)(this.field_a * af.field_f[this.field_I]) / 255.0);
                            stackIn_61_0 = !(this.field_a > 0);
                            return stackIn_61_0;
                          }
                          if (var20 == 17) {
                            this.field_z = this.field_z + var12 / 30.0;
                            this.field_z = this.field_z * 0.95;
                            for (var20 = 0; var20 < this.field_j.length - 1; var20 += 2) {
                              this.field_j[var20].a((int)((double)this.field_u + this.field_m - 3.0 * (Math.random() + var10 * (double)var20)), 8, 48, 119, 1, (int)((double)this.field_q + this.field_i - 3.0 * (Math.random() + (double)var20 * var8)));
                              this.field_j[var20 + 1].a((int)(this.field_m + (double)this.field_u - (Math.random() + (double)(1 + var20) * var10) * 3.0), 8, 24576, 116, 1, (int)((double)this.field_q + this.field_i - (Math.random() + var8 * (double)(var20 + 1)) * 3.0));
                            }
                          } else {
                            if (var20 == 18) {
                              for (var20 = 0; this.field_j.length > var20; var20++) {
                                this.field_j[var20].a((int)((double)this.field_u + this.field_m - (double)var20 * var10), 2, 24624, 2, 1, (int)(-(var8 * (double)var20) + ((double)this.field_q + this.field_i)));
                              }
                            } else {
                              if (var20 == 22) {
                                this.field_z = this.field_z + var12 / 30.0;
                                this.field_z = this.field_z * 0.95;
                                this.field_j[0].a((int)this.field_m + this.field_u, 5, 5242880, 116, 1, this.field_q + (int)this.field_i + 3);
                                this.field_j[1].a((int)this.field_m + (this.field_u + 1), 3, 12288, -93, 1, 2 + this.field_q + (int)this.field_i);
                                this.field_j[2].a(this.field_u + (int)this.field_m, 5, 5242880, 105, 1, 1 + this.field_q + (int)this.field_i);
                                this.field_j[3].a(this.field_u + ((int)this.field_m - 1), 3, 12288, param0 ^ 16400, 1, 0 + ((int)this.field_i + this.field_q));
                                this.field_j[4].a(this.field_u + (int)this.field_m, 5, 5242880, 119, 1, this.field_q + (int)this.field_i - 1);
                                this.field_j[5].a(1 + (int)this.field_m + this.field_u, 3, 12288, param0 - 16527, 1, -2 + (int)this.field_i + this.field_q);
                                this.field_j[6].a((int)this.field_m + this.field_u, 5, 5251072, -119, 1, (int)this.field_i + this.field_q - 3);
                                this.field_j[7].a(this.field_u + (int)this.field_m - 1, 3, 12288, -85, 1, this.field_q + (int)this.field_i - 4);
                                this.field_j[8].a(this.field_u + (int)this.field_m, 5, 5242880, -109, 1, -5 + ((int)this.field_i + this.field_q));
                                this.field_j[9].a((int)this.field_m + (this.field_u + 1), 3, 12288, param0 - 16623, 1, this.field_q + ((int)this.field_i - 6));
                                break L0;
                              }
                              if (var20 == 20) {
                                this.field_j[0].a((int)this.field_m, 5, 8947848, param0 - 16408, 0, this.field_q + (int)this.field_i);
                              } else {
                                if (var20 == 19) {
                                  for (var20 = 0; this.field_j.length > var20; var20++) {
                                    this.field_j[var20].a(this.field_u + (int)this.field_m, 1, 16776960, -114, 0, (int)(-((double)var20 * this.field_c / (double)this.field_j.length) + this.field_i));
                                  }
                                } else {
                                  if (23 != var20) {
                                    if (28 != var20) {
                                      break L0;
                                    }
                                    this.field_a = this.field_a - 51;
                                    stackIn_87_0 = !(this.field_a > 0);
                                    return stackIn_87_0;
                                  }
                                  this.field_B = this.field_l / 3 % f.field_i.length;
                                  if (this.field_t < 100) {
                                    var19 = 4210752;
                                    var18 = 983040;
                                  } else {
                                    if (150 <= this.field_t) {
                                      var18 = 1048592;
                                      var19 = 20224;
                                    } else {
                                      var19 = 20224;
                                      var18 = 983040;
                                    }
                                  }
                                  this.field_g = f.field_i[this.field_B];
                                  for (var20 = -2; 2 >= var20; var20++) {
                                    this.field_j[var20 + 2].a((int)this.field_m + (this.field_u - 5 * var20), 20, var18, -9, 1, this.field_q + (int)this.field_i);
                                  }
                                  for (var20 = -1; var20 <= 1; var20++) {
                                    this.field_j[6 + var20].a(-(var20 * 5) + (int)this.field_m + this.field_u, 10, var19, param0 ^ 16411, 1, (int)this.field_i + this.field_q);
                                  }
                                }
                              }
                            }
                          }
                          break L0;
                        }
                      }
                      this.field_a = this.field_a - 2;
                      if (this.field_I == 16) {
                        this.field_a = this.field_a - 2;
                      }
                      this.field_t = (int)Math.round((double)(af.field_f[this.field_I] * this.field_a) / 255.0);
                      stackIn_57_0 = !(0 < this.field_a);
                      return stackIn_57_0;
                    }
                  }
                  this.field_j[0].a(this.field_u + (int)this.field_m, 7, 6291456, -53, 1, this.field_q + (int)this.field_i);
                  this.field_j[1].a(2 + (this.field_u + (int)this.field_m), 7, 12288, -48, 1, this.field_q + (int)this.field_i);
                  this.field_j[2].a((int)this.field_m + this.field_u, 7, 6291456, param0 ^ -16455, 1, this.field_q + (int)this.field_i + 2);
                  this.field_j[3].a(-2 + (this.field_u + (int)this.field_m), 7, 12288, 122, 1, 2 + this.field_q + (int)this.field_i);
                  break L0;
                }
                var14 = Math.atan2(this.field_c, this.field_z);
                var16 = Math.atan2(sd.field_a.field_N - this.field_i, -this.field_m + sd.field_a.field_D);
                if (var14 < var16) {
                  var14 = var14 + 0.05;
                } else {
                  var14 = var14 - 0.05;
                }
                this.field_c = var6 * ji.a(65535, var14);
                this.field_z = pj.a(var14, 32768) * var6;
                this.field_j[0].a((int)this.field_m + this.field_u, 7, 6291456, 120, 1, (int)this.field_i + this.field_q);
                this.field_j[1].a(this.field_u + (int)this.field_m + 2, 7, 48, -120, 1, (int)this.field_i + this.field_q);
                this.field_j[2].a(this.field_u + (int)this.field_m, 7, 6291456, param0 - 16395, 1, this.field_q + ((int)this.field_i + 2));
                this.field_j[3].a(-2 + ((int)this.field_m + this.field_u), 7, 48, 118, 1, 2 + (this.field_q + (int)this.field_i));
              } else {
                this.field_j[0].a((int)this.field_m + this.field_u, 9, 24576, 114, 1, this.field_q + (int)this.field_i);
                this.field_j[1].a(2 + (int)this.field_m + this.field_u, 9, 48, param0 ^ -16430, 1, (int)this.field_i + this.field_q);
                this.field_j[2].a(this.field_u + (int)this.field_m, 9, 24576, -117, 1, this.field_q + (int)this.field_i + 2);
                this.field_j[3].a(this.field_u + ((int)this.field_m - 2), 9, 48, -20, 1, 2 + ((int)this.field_i + this.field_q));
              }
            }
          }
        }
        if (!((double)this.field_e > this.field_i) &&
          !((double)this.field_f < this.field_i) &&
          !(this.field_m < (double)this.field_n) &&
          !((double)this.field_E < this.field_m)) {
          if (this.field_I == 22) {
            this.field_c = this.field_c + 0.5;
          }
          if (this.field_I == 20) {
            this.field_z = this.field_z + 0.3;
          }
          if (param0 == 16510) {
            return false;
          }
          field_h = (vd) null;
          return false;
        }
        return true;
    }

    final boolean a(double param0, double param1, double param2, double param3, boolean param4) {
        this.field_i = param2;
        this.field_m = param1;
        if (!param4) {
          field_o = (int[]) null;
        }
        return this.a(16510, this.field_F, this.field_d);
    }

    final boolean a(byte param0) {
        if (param0 > -84) {
          return false;
        }
        return this.a(16510, this.field_F, this.field_d);
    }

    final static void b(byte param0) {
        kj.field_b[2] = 240;
        ih.field_O[2] = 180;
        kj.field_b[4] = 80;
        kj.field_b[10] = 80;
        ih.field_O[4] = 56;
        if (param0 != 86) {
          field_s = (String) null;
        }
        ih.field_O[10] = 56;
        dl.a(new int[]{5}, 390, 275, 4, 455, 30, (byte) 123);
        th.field_a[4] = new ld(4);
        ul.field_j[9] = new int[]{2, 5};
        th.field_a[9] = new ld(9);
        dl.a(new int[]{35, 36, 37, 6}, 385, 200, 2, 540, 30, (byte) 124);
        th.field_a[2] = new ld(2);
        dl.a(new int[]{5}, 390, 200, 12, 455, 30, (byte) 119);
        th.field_a[12] = new ld(12);
        ul.field_b[10] = ul.field_b[4];
        ul.field_j[10] = new int[]{5, 26, 27, 28, 29, 30, 31, 32, 33, 34};
        ul.field_i[10] = ul.field_b[10] + cb.field_b.b(hg.field_ob[10]);
        th.field_a[10] = new ld(10);
        if (0 < hb.field_g &&
          ea.a(sb.field_d, 0)) {
          dl.a(new int[]{1, 3, 10, 11, 4, 19, 7}, 200, 200, 1, 540, 30, (byte) 122);
          th.field_a[1] = new ld(1);
        }
    }

    final static void d(byte param0) {
        fb.field_e.a(33, new ff());
        if (param0 <= 78) {
          field_C = -56;
        }
    }

    gf(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        this(param0, param1, param2, param3, param4, param5, param6, af.field_f[param0]);
    }

    public static void a(boolean param0) {
        field_A = null;
        field_o = null;
        field_h = null;
        if (param0) {
          return;
        }
        field_p = null;
        field_s = null;
        field_k = null;
        field_r = null;
    }

    final void c(byte param0) {
        int var5_int = 0;
        gg stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        boolean stackIn_16_3;
        int var2;
        int var3;
        int var4;
        double var5;
        double var7;
        int var9;
        double var10;
        gg var12;
        int var13;
        int var14;
        int var15;
        int[] var16;
        int var17;
        int var18;
        int var19;
        int[] var20;
        int[] var21;
        var19 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 < 101) {
          return;
        }
        if (2 == sd.field_e) {
          for (var5_int = 0; this.field_j.length > var5_int; var5_int++) {
            this.field_j[var5_int].c(-1);
          }
        }
        var17 = this.field_I;
        if (var17 == 21) {
          be.a((int)this.field_w, (int)this.field_H, (int)this.field_i, (int)this.field_m, 0.15, 255, 0.8);
        } else {
          if (var17 == 28) {
            var7 = -this.field_F + this.field_m;
            var5 = -this.field_d + this.field_i;
            var9 = (int)dl.a(true, var5, var7) / 4;
            if (var9 > 64) {
              var9 = 64;
            }
            var10 = 3.141592653589793 + Math.atan2(var5, var7);
            var12 = new gg((int)this.field_i, (int)this.field_m, var9, var10, 0.5, 0.9, 1, 1.5, 0.92, this.field_l);
            var2 = 128 * this.field_a;
            var3 = 64 * this.field_a;
            var4 = this.field_a * 255;
            var2 = var2 >> 8;
            var3 = var3 >> 8;
            var4 = var4 >> 8;
            var3 = var3 << 8;
            var2 = var2 << 16;
            stackIn_15_0 = var12;
            stackIn_15_1 = -1093327740;
            stackIn_15_2 = 16777215;
            stackIn_16_3 = (sd.field_e == 2);
            ((gg) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_16_3, var4 | (var2 | var3));
          } else {
            if (26 == var17) {
              var13 = -this.field_a + 255;
              this.field_g.c();
              wj.b(this.field_g.field_y / 2, this.field_g.field_w / 2, var13, 1);
              lb.field_C.a(119);
              var15 = (int)this.field_m + this.field_g.field_w / 2;
              var14 = (int)this.field_i + this.field_g.field_y / 2;
              var3 = 255;
              var4 = 128;
              var2 = 0;
              wj.c(var14, var15, var13, 16777215, this.field_a);
              var21 = new int[255];
              var20 = var21;
              var16 = var20;
              for (var17 = 0; var17 < 255; var17++) {
                var18 = (var17 >> 5) + 1;
                var16[var17] = (var3 / var18 << 8) + (var2 / var18 << 16) + var4 / var18;
              }
              wj.a(var14 << 4, var15 << 4, var13 << 3, 254, var21);
            } else {
              if (gg.field_n[this.field_I] != 0) {
                this.field_g.a((int)this.field_i, (int)this.field_m, this.field_a);
              } else {
                if (this.field_a == 256) {
                  this.field_g.d((int)this.field_i, (int)this.field_m);
                } else {
                  this.field_g.e((int)this.field_i, (int)this.field_m, this.field_a);
                }
              }
            }
          }
        }
        if (sd.field_a.field_F) {
          a.field_g.b(Integer.toString(this.field_t), (int)this.field_i, (int)this.field_m, 16777215, 16777215, 128);
        }
    }

    gf(int param0, double param1, double param2, double param3, double param4, double param5, double param6, int param7) {
        int var15;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        this.field_B = 0;
        this.field_x = new int[]{2, 0, 4, 0, 4, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 0, 8, 10, 0, 2, 0, 10, 8, 0, 0, 10, 0, 0};
        this.field_l = 0;
        this.field_v = new int[]{256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 192, 256, 256, 256, 256};
        this.field_H = param2;
        this.field_w = param1;
        this.field_I = param0;
        this.field_i = this.field_w;
        this.field_z = param4;
        this.field_t = param7;
        this.field_c = param3;
        this.field_m = this.field_H;
        this.field_j = new ck[this.field_x[this.field_I]];
        this.field_g = ae.field_hb[this.field_I];
        this.field_a = this.field_v[this.field_I];
        this.field_d = param5;
        this.field_F = param6;
        if (ej.field_g[this.field_I] != -1) {
          var15 = e.a(127, (int)param1);
          th.a(-27610, uh.field_s[this.field_I], var15, nl.field_r[ej.field_g[this.field_I]]);
        }
        var15Lifetime1 = this.field_I;
        if (var15Lifetime1 != 5 &&
          var15Lifetime1 != 10 &&
          var15Lifetime1 != 16) {
          if (var15Lifetime1 == 6 ||
            var15Lifetime1 == 27) {
            this.field_m = this.field_m + (double)(this.field_g.field_C >> 1);
          }
        } else {
          this.field_i = this.field_i - 400.0;
        }
        boolean decompiledFrameRemainder0 = true;
        var15Lifetime2 = this.field_I;
        if (var15Lifetime2 != 20 &&
          19 != var15Lifetime2) {
          if (24 == var15Lifetime2) {
            this.field_f = 740;
            this.field_E = 450;
            this.field_n = -50;
            this.field_e = 0;
            decompiledFrameRemainder0 = false;
          }
          else {
            if (var15Lifetime2 != 25 &&
              var15Lifetime2 != 22 &&
              var15Lifetime2 != 23 &&
              var15Lifetime2 != 21) {
              this.field_n = -500;
              this.field_e = -500;
              this.field_f = 1140;
              this.field_E = 450;
              decompiledFrameRemainder0 = false;
            }
          }
        }
        if (decompiledFrameRemainder0) {
          this.field_f = 740;
          this.field_E = 450;
          this.field_n = -50;
          this.field_e = 0;
        }
        for (var15Lifetime3 = 0; var15Lifetime3 < this.field_j.length; var15Lifetime3++) {
          this.field_j[var15Lifetime3] = new ck();
        }
        if (null != this.field_g) {
          this.field_q = this.field_g.field_y / 2 + this.field_g.field_D;
          this.field_u = this.field_g.field_v + this.field_g.field_w / 2;
          this.field_y = this.field_g.field_C;
          this.field_J = this.field_g.field_z;
          this.field_i = this.field_i - (double)this.field_q;
          this.field_m = this.field_m - (double)this.field_u;
        } else {
          this.field_J = 0;
          this.field_q = 0;
          this.field_y = 0;
          this.field_u = 0;
        }
    }

    static {
        field_h = new vd();
        field_A = new vd();
        field_k = new int[]{-1, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 68, 68, -1, -1, -1, -1, 68, 68, -1, -1, -1, -1};
        field_p = new int[8192];
        field_G = true;
        field_b = 0;
        field_s = "New game";
    }
}
