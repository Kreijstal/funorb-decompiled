/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rb {
    int field_d;
    static int field_f;
    int field_j;
    int field_a;
    private int field_n;
    int field_c;
    private int field_k;
    private int field_i;
    private boolean field_h;
    int field_b;
    private int field_m;
    private int field_g;
    private int field_e;
    private int field_l;

    final rb b(int param0) {
        boolean stackIn_228_0 = false;
        int stackIn_228_1 = 0;
        int stackIn_229_2 = 0;
        boolean stackIn_252_0 = false;
        int stackIn_252_1 = 0;
        int stackIn_253_2 = 0;
        boolean stackIn_278_0 = false;
        int stackIn_278_1 = 0;
        int stackIn_279_2 = 0;
        boolean stackIn_305_0 = false;
        int stackIn_305_1 = 0;
        int stackIn_306_2 = 0;
        boolean stackIn_335_0 = false;
        int stackIn_335_1 = 0;
        int stackIn_336_2 = 0;
        boolean stackIn_362_0 = false;
        int stackIn_362_1 = 0;
        int stackIn_363_2 = 0;
        int var2;
        Object var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        rb var10;
        rb var11;
        rb var12;
        rb var13;
        rb var14;
        rb var15;
        rb var16;
        rb var17;
        rb var18;
        rb var19;
        rb var20;
        rb var21;
        rb var22;
        rb var23;
        rb var24;
        rb var25;
        rb var26;
        var9 = SolKnight.field_L ? 1 : 0;
        if (param0 <= 2) {
          return (rb) null;
        }
        while (true) {
          this.field_a = this.field_a + this.field_c;
          this.field_b = this.field_b + this.field_d;
          var2 = 32;
          if (this.field_j == 25) {
            var2 = 9;
          }
          if (this.field_j == 26) {
            var2 = 14;
          }
          if (this.field_j == 27) {
            var2 = 27;
          }
          if (this.field_j == 28) {
            var2 = 40;
          }
          if (this.field_j == 29) {
            var2 = 53;
          }
          if (30 == this.field_j) {
            var2 = 70;
          }
          if (this.field_a < -(640 + var2 << 4)) {
            this.a((byte) 62);
            this.field_h = true;
            return null;
          }
          if (var2 + 640 << 4 < this.field_a) {
            this.a((byte) 62);
            this.field_h = true;
            return null;
          }
          if (this.field_b > var2 + 720 << 4) {
            this.a((byte) 62);
            this.field_h = true;
            return null;
          }
          if (-(var2 << 4) > this.field_b &&
            this.field_d < 0) {
            this.a((byte) 62);
            this.field_h = true;
            return null;
          }
          if (3 >= this.field_j) {
            this.field_i = bk.a(120, jb.field_g, (byte) 49);
            this.field_n = bk.a(120, jb.field_g, (byte) 57);
          }
          L9: {
            var4 = this.field_j;
            if (var4 == 0) {
              this.field_g = 4;
              this.field_e = this.field_e + 1;
              if (kb.field_b == 0) {
                if (this.field_e < 50) {
                  this.field_b = this.field_b - this.field_d * (-this.field_e + 50) / 100;
                  this.field_a = this.field_a - this.field_c * (50 - this.field_e) / 100;
                  if (this.field_e % 2 != 0) {
                    this.a(9, -19, 16);
                    break L9;
                  }
                  pk.a((byte) 32, new rb(12, this));
                }
                this.a(9, -19, 16);
              } else {
                this.a(9, -19, 8);
              }
            } else {
              if (var4 != 1) {
                if (2 == var4) {
                  this.field_g = 5;
                  this.field_e = this.field_e + 1;
                  if (0 == this.field_e % 10) {
                    pk.a((byte) 32, new rb(8, this));
                    if (this.field_e % 2 == 0) {
                      pk.a((byte) 32, new rb(12, this));
                    }
                  }
                  this.field_g = 32;
                  this.a(13, -19, 0);
                  this.field_g = 5;
                  if (this.field_j == 13) {
                    if (bi.field_h >= 2) {
                      mb.a(true, 7, 256);
                    } else {
                      mb.a(true, 7, 128);
                    }
                    this.field_j = 0;
                    var10 = new rb(0, this);
                    var10.field_c = this.field_c / 3 + this.field_d / 4;
                    var10.field_d = -(this.field_c / 4) + this.field_d / 3;
                    pk.a((byte) 32, var10);
                    var11 = new rb(0, this);
                    var11.field_c = this.field_d / 5 + this.field_c / 2;
                    var11.field_d = -(this.field_c / 5) + this.field_d / 2;
                    pk.a((byte) 32, var11);
                    var12 = new rb(0, this);
                    var12.field_c = this.field_c / 3 - this.field_d / 4;
                    var12.field_d = this.field_d / 3 + this.field_c / 4;
                    pk.a((byte) 32, var12);
                    var13 = new rb(0, this);
                    var13.field_c = -(this.field_d / 5) + this.field_c / 2;
                    var13.field_d = this.field_c / 5 + this.field_d / 2;
                    pk.a((byte) 32, var13);
                    if (bi.field_h == 2) {
                      var14 = new rb(0, this);
                      var14.field_d = this.field_d / 3;
                      var14.field_c = this.field_c / 3;
                      pk.a((byte) 32, var14);
                      var15 = new rb(0, this);
                      var15.field_c = this.field_c / 5 + this.field_d / 2;
                      var15.field_d = -(this.field_c / 2) + this.field_d / 5;
                      pk.a((byte) 32, var15);
                      var16 = new rb(0, this);
                      var16.field_c = this.field_d / 4 + this.field_c / 4;
                      var16.field_d = this.field_d / 4 - this.field_c / 4;
                      pk.a((byte) 32, var16);
                      var17 = new rb(0, this);
                      var17.field_c = -(this.field_d / 2) + this.field_c / 5;
                      var17.field_d = this.field_c / 2 + this.field_d / 5;
                      pk.a((byte) 32, var17);
                      var18 = new rb(0, this);
                      var18.field_c = this.field_c / 4 - this.field_d / 4;
                      var18.field_d = this.field_d / 4 + this.field_c / 4;
                      pk.a((byte) 32, var18);
                    }
                    this.field_c = 2 * this.field_c / 3;
                    this.field_d = 2 * this.field_d / 3;
                  }
                } else {
                  if (var4 == 3) {
                    this.field_e = this.field_e + 1;
                    this.field_g = 6;
                    if (0 == this.field_e % 4) {
                      pk.a((byte) 32, new rb(8, this));
                    }
                    if (this.field_e % 2 == 0) {
                      var4 = 15 & this.field_e >> 1;
                      if (var4 > 8) {
                        var4 = -var4 + 16;
                      }
                      var19 = new rb(12, this);
                      var4 -= 4;
                      var19.field_a = var19.field_a - this.field_d * var4 / 4;
                      var19.field_b = var19.field_b + var4 * this.field_c / 4;
                      pk.a((byte) 32, var19);
                    }
                    if (bi.field_h < 2) {
                      this.a(10, -19, 16);
                    }
                    if (bi.field_h == 2) {
                      this.a(11, -19, 16);
                    }
                    if (10 == this.field_j) {
                      this.field_g = 128;
                      this.a(10, -19, 50);
                    }
                    if (this.field_j == 11) {
                      this.field_g = 192;
                      this.a(11, -19, 75);
                    }
                  } else {
                    if (var4 == 4) {
                      this.field_g = 4;
                      this.a(12, -19, 8);
                    } else {
                      if (5 == var4) {
                        this.field_g = 4;
                        var3 = null;
                        if (bi.field_h == 0 ||
                          bi.field_h == 1 &&
                          10 < this.field_e ||
                          2 == bi.field_h &&
                          this.field_e > 20) {
                          var3 = new rb(14, this);
                        }
                        if (bi.field_h == 1 ||
                          bi.field_h == 2 &&
                          this.field_e > 10) {
                          var3 = new rb(15, this);
                        }
                        if (2 == bi.field_h) {
                          var3 = new rb(16, this);
                        }
                        ((rb) (var3)).field_d = this.field_d;
                        ((rb) (var3)).field_c = this.field_c;
                        pk.a((byte) 32, (rb) (var3));
                        if (bi.field_h == 0) {
                          this.a(13, -19, 1);
                        }
                        if (1 == bi.field_h) {
                          this.a(13, -19, 1);
                        }
                        if (bi.field_h == 2) {
                          this.a(13, -19, 1);
                        }
                        if (this.field_j == 13 &&
                          this.field_e < 10 + 10 * bi.field_h) {
                          this.field_e = this.field_e + 1;
                          var20 = new rb(13, this);
                          pk.a((byte) 32, var20);
                          this.field_j = 5;
                        }
                      } else {
                        if (6 == var4) {
                          this.field_e = this.field_e + 1;
                          this.field_g = 6;
                          var4 = 320 + (-wd.field_c + (this.field_a >> 4));
                          var5 = (this.field_b >> 4) - si.field_E;
                          var6 = -var4 + gb.field_j;
                          var7 = ad.field_m - var5;
                          if (ve.field_b >= 0) {
                            var6 = -var4 + (sk.field_o >> 4) - wd.field_c + 320;
                            var7 = -var5 + ((wg.field_e >> 4) - si.field_E);
                          }
                          var8 = (int)Math.sqrt((double)(var7 * var7 + var6 * var6));
                          if (var8 > 8) {
                            this.field_c = this.field_c + (-this.field_e + 500) * 8 * var6 / (500 * var8);
                            this.field_d = this.field_d + 8 * var7 * (500 - this.field_e) / (var8 * 500);
                            var8 = (int)Math.sqrt((double)(this.field_d * this.field_d + this.field_c * this.field_c));
                            if (var8 > 255) {
                              this.field_d = 255 * this.field_d / var8;
                              this.field_c = 255 * this.field_c / var8;
                            }
                          }
                          if (bi.field_h < 2) {
                            this.a(17, -19, 15);
                          } else {
                            this.a(17, -19, 0);
                            if (this.field_j == 17) {
                              this.field_g = 64;
                              this.a(18, -19, 30);
                            }
                          }
                        } else {
                          if (var4 != 7) {
                            if (var4 == 8) {
                              this.field_e = this.field_e + 4;
                              if (this.field_e > 64) {
                                return null;
                              }
                            } else {
                              if (var4 == 9) {
                                this.field_e = this.field_e + 1;
                                if (this.field_e > 64) {
                                  return null;
                                }
                              } else {
                                if (var4 == 10) {
                                  if (!pg.field_e ||
                                    kd.field_a != -1) {
                                    this.field_e = this.field_e + 3;
                                  }
                                  this.field_e = this.field_e + 1;
                                  if (this.field_e > 85) {
                                    return null;
                                  }
                                } else {
                                  if (var4 == 11) {
                                    if (!pg.field_e ||
                                      kd.field_a != -1) {
                                      this.field_e = this.field_e + 3;
                                    }
                                    this.field_e = this.field_e + 1;
                                    if (128 < this.field_e) {
                                      return null;
                                    }
                                  } else {
                                    if (var4 != 12 &&
                                      var4 != 13 &&
                                      17 != var4) {
                                      if (14 != var4 &&
                                        15 != var4 &&
                                        var4 != 16) {
                                        if (18 == var4) {
                                          this.field_e = this.field_e + 1;
                                          if (this.field_e <= 32) {
                                            break L9;
                                          }
                                          return null;
                                        }
                                        if (19 == var4) {
                                          this.field_b = this.field_b - this.field_d;
                                          this.field_a = this.field_a - this.field_c;
                                          this.field_e = this.field_e + 1;
                                          if (this.field_e <= 1) {
                                            break L9;
                                          }
                                          return null;
                                        }
                                        if (25 == var4) {
                                          this.field_l = this.field_l + 50;
                                          if (150 < this.field_l) {
                                            this.field_l = this.field_l - 150;
                                            this.field_m = this.field_m + 1;
                                          }
                                          this.field_g = 8;
                                          if (this.field_m >= 36) {
                                            this.field_m = this.field_m - 36;
                                          }
                                          if (!pg.field_e ||
                                            kd.field_a != -1) {
                                            var4 = this.field_a >> 4;
                                            var5 = ea.field_p[kb.field_b] + ((this.field_b >> 4) - 720);
                                            var6 = (int)Math.sqrt((double)(var5 * var5 + var4 * var4));
                                            if (var6 < this.field_g + kd.field_b[kb.field_b]) {
                                              if (!pg.field_e) {
                                                mb.a(true, 12, 256);
                                              }
                                              pg.field_e = true;
                                              this.field_e = 5;
                                            }
                                            if (this.field_m % 8 == 0 &&
                                              this.field_l < 100) {
                                              stackIn_228_0 = true;
                                              stackIn_228_1 = 21;
                                              if (var6 >= 32) {
                                                stackIn_229_2 = 8192 / var6;
                                              } else {
                                                stackIn_229_2 = 256;
                                              }
                                              mb.a(stackIn_228_0, stackIn_228_1, stackIn_229_2);
                                            }
                                          }
                                          if (0 < this.field_k) {
                                            this.field_k = this.field_k - 1;
                                          }
                                          if (!(this.field_e <= 4)) {
                                            vk.field_p = vk.field_p + 1;
                                            mb.a(true, 30, 256);
                                            pl.field_a = pl.field_a + vk.field_p * 1;
                                            ud.field_k = ud.field_k + 1;
                                            ic.field_t = ic.field_t + (lc.field_h >>> 17);
                                            this.field_c = 0;
                                            this.field_j = this.field_j - 5;
                                            ob.field_j = vk.field_p;
                                            bi.field_i = bi.field_i + 1;
                                            cb.field_a = 256;
                                            this.field_d = 0;
                                            this.field_e = 0;
                                          }
                                        } else {
                                          if (var4 == 26) {
                                            this.field_l = this.field_l + 40;
                                            if (this.field_l > 150) {
                                              this.field_l = this.field_l - 150;
                                              this.field_m = this.field_m + 1;
                                            }
                                            this.field_g = 12;
                                            if (this.field_m >= 36) {
                                              this.field_m = this.field_m - 36;
                                            }
                                            if (!pg.field_e ||
                                              kd.field_a != -1) {
                                              var4 = this.field_a >> 4;
                                              var5 = -720 + ((this.field_b >> 4) + ea.field_p[kb.field_b]);
                                              var6 = (int)Math.sqrt((double)(var5 * var5 + var4 * var4));
                                              if (this.field_g + kd.field_b[kb.field_b] > var6) {
                                                if (!pg.field_e) {
                                                  mb.a(true, 12, 256);
                                                }
                                                this.field_e = 13;
                                                pg.field_e = true;
                                              }
                                              if (this.field_m % 8 == 0 &&
                                                this.field_l < 80) {
                                                stackIn_252_0 = true;
                                                stackIn_252_1 = 22;
                                                if (var6 >= 32) {
                                                  stackIn_253_2 = 8192 / var6;
                                                } else {
                                                  stackIn_253_2 = 256;
                                                }
                                                mb.a(stackIn_252_0, stackIn_252_1, stackIn_253_2);
                                              }
                                            }
                                            if (this.field_k > 0) {
                                              this.field_k = this.field_k - 1;
                                            }
                                            if (!(this.field_e <= 12)) {
                                              vk.field_p = vk.field_p + 1;
                                              for (var4 = 0; var4 < 8; var4++) {
                                                var22 = new rb(31, this);
                                                pk.a((byte) 32, var22);
                                              }
                                              mb.a(true, 29, 256);
                                              this.field_j = this.field_j - 5;
                                              this.field_c = 0;
                                              pl.field_a = pl.field_a + vk.field_p * 2;
                                              ob.field_j = vk.field_p;
                                              cb.field_a = 256;
                                              ud.field_k = ud.field_k + 2;
                                              bi.field_i = bi.field_i + 2;
                                              ic.field_t = ic.field_t + ((lc.field_h & -125932) >>> 16);
                                              this.field_e = 0;
                                              this.field_d = 0;
                                            }
                                          } else {
                                            if (var4 == 27) {
                                              this.field_l = this.field_l + 30;
                                              if (this.field_l > 150) {
                                                this.field_m = this.field_m + 1;
                                                this.field_l = this.field_l - 150;
                                              }
                                              this.field_g = 24;
                                              if (36 <= this.field_m) {
                                                this.field_m = this.field_m - 36;
                                              }
                                              if (!pg.field_e ||
                                                kd.field_a != -1) {
                                                var4 = this.field_a >> 4;
                                                var5 = -720 + (this.field_b >> 4) + ea.field_p[kb.field_b];
                                                var6 = (int)Math.sqrt((double)(var4 * var4 + var5 * var5));
                                                if (var6 < kd.field_b[kb.field_b] + this.field_g) {
                                                  if (!pg.field_e) {
                                                    mb.a(true, 12, 256);
                                                  }
                                                  this.field_e = 37;
                                                  pg.field_e = true;
                                                }
                                                if (this.field_m % 8 == 0 &&
                                                  this.field_l < 60) {
                                                  stackIn_278_0 = true;
                                                  stackIn_278_1 = 23;
                                                  if (var6 >= 32) {
                                                    stackIn_279_2 = 8192 / var6;
                                                  } else {
                                                    stackIn_279_2 = 256;
                                                  }
                                                  mb.a(stackIn_278_0, stackIn_278_1, stackIn_279_2);
                                                }
                                              }
                                              if (this.field_k > 0) {
                                                this.field_k = this.field_k - 1;
                                              }
                                              if (!(this.field_e <= 36)) {
                                                vk.field_p = vk.field_p + 1;
                                                for (var4 = 0; var4 < 12; var4++) {
                                                  var23 = new rb(31, this);
                                                  pk.a((byte) 32, var23);
                                                }
                                                mb.a(true, 28, 256);
                                                this.field_d = 0;
                                                ic.field_t = ic.field_t + 3 * (lc.field_h >>> 17);
                                                ud.field_k = ud.field_k + 3;
                                                ob.field_j = vk.field_p;
                                                bi.field_i = bi.field_i + 3;
                                                this.field_c = 0;
                                                this.field_e = 0;
                                                this.field_j = this.field_j - 5;
                                                pl.field_a = pl.field_a + 3 * vk.field_p;
                                                cb.field_a = 256;
                                              }
                                            } else {
                                              if (var4 == 28) {
                                                this.field_l = this.field_l + 20;
                                                if (this.field_l > 150) {
                                                  this.field_l = this.field_l - 150;
                                                  this.field_m = this.field_m + 1;
                                                }
                                                if (this.field_m >= 36) {
                                                  this.field_m = this.field_m - 36;
                                                }
                                                this.field_g = 32;
                                                if (!pg.field_e ||
                                                  kd.field_a != -1) {
                                                  var4 = this.field_a >> 4;
                                                  var5 = ea.field_p[kb.field_b] + ((this.field_b >> 4) - 720);
                                                  var6 = (int)Math.sqrt((double)(var4 * var4 + var5 * var5));
                                                  if (var6 < kd.field_b[kb.field_b] + this.field_g) {
                                                    if (!pg.field_e) {
                                                      mb.a(true, 12, 256);
                                                    }
                                                    pg.field_e = true;
                                                    this.field_e = 73;
                                                  }
                                                  if (0 == this.field_m % 8 &&
                                                    this.field_l < 40) {
                                                    stackIn_305_0 = true;
                                                    stackIn_305_1 = 24;
                                                    if (var6 >= 32) {
                                                      stackIn_306_2 = 8192 / var6;
                                                    } else {
                                                      stackIn_306_2 = 256;
                                                    }
                                                    mb.a(stackIn_305_0, stackIn_305_1, stackIn_306_2);
                                                  }
                                                }
                                                if (this.field_k > 0) {
                                                  this.field_k = this.field_k - 1;
                                                }
                                                if (!(this.field_e <= 72)) {
                                                  vk.field_p = vk.field_p + 1;
                                                  for (var4 = 0; 16 > var4; var4++) {
                                                    var24 = new rb(31, this);
                                                    pk.a((byte) 32, var24);
                                                  }
                                                  mb.a(true, 27, 256);
                                                  this.field_e = 0;
                                                  ob.field_j = vk.field_p;
                                                  pl.field_a = pl.field_a + vk.field_p * 4;
                                                  ud.field_k = ud.field_k + 4;
                                                  cb.field_a = 256;
                                                  bi.field_i = bi.field_i + 4;
                                                  ic.field_t = ic.field_t + ((-111141 & lc.field_h) >>> 15);
                                                  this.field_c = 0;
                                                  this.field_d = 0;
                                                  this.field_j = this.field_j - 5;
                                                }
                                              } else {
                                                if (var4 == 29) {
                                                  this.field_l = this.field_l + 10;
                                                  if (150 < this.field_l) {
                                                    this.field_l = this.field_l - 150;
                                                    this.field_m = this.field_m + 1;
                                                  }
                                                  if (this.field_m >= 36) {
                                                    this.field_m = this.field_m - 36;
                                                  }
                                                  this.field_g = 48;
                                                  if (!pg.field_e ||
                                                    -1 != kd.field_a) {
                                                    var4 = this.field_a >> 4;
                                                    var5 = (this.field_b >> 4) - 720 + ea.field_p[kb.field_b];
                                                    var6 = (int)Math.sqrt((double)(var5 * var5 + var4 * var4));
                                                    if (kd.field_b[kb.field_b] + this.field_g > var6) {
                                                      if (!pg.field_e) {
                                                        mb.a(true, 12, 256);
                                                      }
                                                      this.field_e = 129;
                                                      pg.field_e = true;
                                                    }
                                                    if (this.field_m % 8 == 0 &&
                                                      20 > this.field_l) {
                                                      stackIn_335_0 = true;
                                                      stackIn_335_1 = 25;
                                                      if (var6 < 32) {
                                                        stackIn_336_2 = 256;
                                                      } else {
                                                        stackIn_336_2 = 8192 / var6;
                                                      }
                                                      mb.a(stackIn_335_0, stackIn_335_1, stackIn_336_2);
                                                    }
                                                  }
                                                  if (this.field_k > 0) {
                                                    this.field_k = this.field_k - 1;
                                                  }
                                                  if (!(this.field_e <= 128)) {
                                                    vk.field_p = vk.field_p + 1;
                                                    for (var4 = 0; 32 > var4; var4++) {
                                                      var25 = new rb(31, this);
                                                      pk.a((byte) 32, var25);
                                                    }
                                                    mb.a(true, 26, 256);
                                                    pl.field_a = pl.field_a + 5 * vk.field_p;
                                                    cb.field_a = 256;
                                                    this.field_c = 0;
                                                    bi.field_i = bi.field_i + 5;
                                                    this.field_j = this.field_j - 5;
                                                    ic.field_t = ic.field_t + (lc.field_h >>> 17) * 5;
                                                    this.field_e = 0;
                                                    ob.field_j = vk.field_p;
                                                    this.field_d = 0;
                                                    ud.field_k = ud.field_k + 5;
                                                  }
                                                } else {
                                                  if (30 != var4) {
                                                    if (20 != var4 &&
                                                      21 != var4 &&
                                                      var4 != 22 &&
                                                      23 != var4 &&
                                                      24 != var4) {
                                                      if (var4 != 31) {
                                                        break L9;
                                                      }
                                                      this.field_e = this.field_e + 2;
                                                      if (256 >= this.field_e) {
                                                        break L9;
                                                      }
                                                      this.field_h = true;
                                                      return null;
                                                    }
                                                    this.field_e = this.field_e + 1;
                                                    if (this.field_g >= this.field_e) {
                                                      break L9;
                                                    }
                                                    this.field_h = true;
                                                    return null;
                                                  }
                                                  this.field_l = this.field_l + 10;
                                                  if (this.field_l > 150) {
                                                    this.field_l = this.field_l - 150;
                                                    this.field_m = this.field_m + 1;
                                                  }
                                                  if (36 <= this.field_m) {
                                                    this.field_m = this.field_m - 36;
                                                  }
                                                  this.field_g = 64;
                                                  if (!pg.field_e ||
                                                    kd.field_a != -1) {
                                                    var4 = this.field_a >> 4;
                                                    var5 = (this.field_b >> 4) - (720 - ea.field_p[kb.field_b]);
                                                    var6 = (int)Math.sqrt((double)(var4 * var4 + var5 * var5));
                                                    if (kd.field_b[kb.field_b] + this.field_g > var6) {
                                                      if (!pg.field_e) {
                                                        mb.a(true, 12, 256);
                                                      }
                                                      this.field_e = 513;
                                                      pg.field_e = true;
                                                    }
                                                    if (this.field_m % 8 == 0 &&
                                                      this.field_l < 20) {
                                                      stackIn_362_0 = true;
                                                      stackIn_362_1 = 25;
                                                      if (var6 >= 32) {
                                                        stackIn_363_2 = 8192 / var6;
                                                      } else {
                                                        stackIn_363_2 = 256;
                                                      }
                                                      mb.a(stackIn_362_0, stackIn_362_1, stackIn_363_2);
                                                    }
                                                  }
                                                  if (0 < this.field_k) {
                                                    this.field_k = this.field_k - 1;
                                                  }
                                                  if (!(this.field_e <= 256)) {
                                                    vk.field_p = vk.field_p + 1;
                                                    for (var4 = 0; var4 < 32; var4++) {
                                                      var26 = new rb(31, this);
                                                      pk.a((byte) 32, var26);
                                                    }
                                                    mb.a(true, 26, 256);
                                                    ic.field_t = ic.field_t + 6 * (lc.field_h >>> 17);
                                                    this.field_j = this.field_j - 6;
                                                    this.field_c = 0;
                                                    cb.field_a = 256;
                                                    ob.field_j = vk.field_p;
                                                    ud.field_k = ud.field_k + 6;
                                                    this.field_e = 0;
                                                    this.field_d = 0;
                                                    bi.field_i = bi.field_i + 6;
                                                    pl.field_a = pl.field_a + 6 * vk.field_p;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        break L9;
                                      }
                                      this.field_e = this.field_e + 1;
                                      this.field_a = this.field_a - this.field_c;
                                      this.field_b = this.field_b - this.field_d;
                                      if (this.field_e <= 2) {
                                        break L9;
                                      }
                                      return null;
                                    }
                                    this.field_e = this.field_e + 1;
                                    if (this.field_e > 16) {
                                      return null;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_g = 8;
                            if (bi.field_h == 1) {
                              this.field_g = 16;
                            }
                            if (bi.field_h == 2) {
                              this.field_g = 32;
                            }
                            var21 = new rb(19, this);
                            var21.field_d = this.field_d;
                            var21.field_g = this.field_g;
                            var21.field_c = this.field_c;
                            pk.a((byte) 32, var21);
                            this.a(10, -19, 0);
                            if (this.field_j == 10) {
                              var4 = this.field_g;
                              if (bi.field_h == 0) {
                                var4 = 5;
                              }
                              this.field_g = 64;
                              this.a(10, -19, var4);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                this.field_g = 4;
                this.field_e = this.field_e + 1;
                if (this.field_e % 10 == 0 ||
                  (100 > this.field_e &&
                  bi.field_h == 0 &&
                  this.field_e % 3 == 0 ||
                  this.field_e < 100 &&
                  bi.field_h == 1 &&
                  0 == this.field_e % 4) ||
                  this.field_e < 100 &&
                  bi.field_h == 2 &&
                  this.field_e % 5 == 0) {
                  if (this.field_e < 100) {
                    pk.a((byte) 32, new rb(8, this));
                  }
                  if (this.field_e < 100) {
                    pk.a((byte) 32, new rb(12, this));
                  }
                }
                if (this.field_e < 100) {
                  var4 = (this.field_a >> 4) - wd.field_c + 320;
                  var5 = (this.field_b >> 4) - si.field_E;
                  var6 = -var4 + gb.field_j;
                  var7 = -var5 + ad.field_m;
                  if (ve.field_b >= 0) {
                    var7 = -si.field_E + (wg.field_e >> 4) - var5;
                    var6 = -var4 + 320 + (-wd.field_c + (sk.field_o >> 4));
                  }
                  var8 = (int)Math.sqrt((double)(var7 * var7 + var6 * var6));
                  if (var8 > 8) {
                    this.field_c = this.field_c + var6 * 8 / var8;
                    this.field_d = this.field_d + 8 * var7 / var8;
                    var8 = (int)Math.sqrt((double)(this.field_c * this.field_c + this.field_d * this.field_d));
                    if (var8 <= 128) {
                      this.a(9, -19, 42);
                      break L9;
                    }
                    this.field_d = 128 * this.field_d / var8;
                    this.field_c = this.field_c * 128 / var8;
                  }
                  this.a(9, -19, 42);
                } else {
                  this.a(9, -19, 42);
                }
              }
            }
          }
          if (this.field_j == 5) {
            continue;
          }
          if (7 == this.field_j) {
            continue;
          }
          break;
        }
        return this;
    }

    final static void c(int param0) {
        if (ad.field_h != -a.field_i + 0 &&
          ad.field_h != 250 - a.field_i) {
        }
        ad.field_h = ad.field_h + 1;
        if (param0 != -27347) {
          rb.a(78);
        }
    }

    final static boolean a(int param0) {
        if (param0 != -1) {
          return false;
        }
        return lb.b(ia.g(-45), 6669);
    }

    private final void a(int param0, int param1, int param2) {
        int var8 = 0;
        int var5;
        int var6;
        int var7;
        int var9;
        int var11;
        rb var12;
        rb var13;
        rb var14;
        rb var15;
        rb var16;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var11 = SolKnight.field_L ? 1 : 0;
        if (param1 != -19) {
          field_f = -7;
        }
        for (var8 = 0; var8 < kf.field_G.length; var8++) {
          if (null != kf.field_G[var8]) {
            var12 = kf.field_G[var8];
            if (0 < var12.field_g &&
              !var12.field_h &&
              var12.field_j >= 25 &&
              var12.field_j <= 30) {
              var5 = var12.field_a - this.field_a >> 4;
              var6 = -this.field_b + var12.field_b >> 4;
              var7 = (int)Math.sqrt((double)(var5 * var5 + var6 * var6));
              if (this.field_g + var12.field_g >= var7) {
                if (var7 > 0) {
                  var12.field_d = var12.field_d + param2 * var6 * 6400 / (var12.field_g * (var7 * var12.field_g * var12.field_g));
                  var12.field_c = var12.field_c + 6400 * (var5 * param2) / (var12.field_g * (var7 * var12.field_g * var12.field_g));
                }
                if (this.field_j != param0) {
                  if (9 == param0) {
                    mb.a(true, 4, 256);
                  }
                  if (param0 == 12) {
                    mb.a(true, 31, 256);
                  }
                  if (17 == param0) {
                    mb.a(true, 32, 256);
                  }
                  if (18 == param0) {
                    mb.a(true, 33, 256);
                  }
                  if (param0 == 13) {
                    mb.a(true, 16, 256 * (bi.field_h + 1) / 3);
                  }
                  if (param0 == 10 ||
                    param0 == 11) {
                    if (this.field_j != 3) {
                      mb.a(true, 4, 256);
                    } else {
                      if (11 != param0) {
                        mb.a(true, 9, 256);
                      } else {
                        mb.a(true, 34, 256);
                      }
                    }
                  }
                  this.field_j = param0;
                  if (param0 != 13) {
                    if (9 == this.field_j) {
                      for (var9 = 0; var9 < 2; var9++) {
                        var13 = new rb(31, this);
                        pk.a((byte) 32, var13);
                        var13.field_c = bk.a(32, jb.field_g, (byte) 59) - 16;
                        var13.field_d = -16 + bk.a(32, jb.field_g, (byte) 84);
                      }
                    }
                    if (this.field_j == 12) {
                      for (var9Lifetime1 = 0; var9Lifetime1 < 1; var9Lifetime1++) {
                        var14 = new rb(31, this);
                        pk.a((byte) 32, var14);
                        var14.field_c = -16 + bk.a(32, jb.field_g, (byte) 65);
                        var14.field_d = bk.a(32, jb.field_g, (byte) 123) - 16;
                      }
                    }
                    if (this.field_j == 17) {
                      for (var9Lifetime2 = 0; var9Lifetime2 < 2; var9Lifetime2++) {
                        var15 = new rb(31, this);
                        pk.a((byte) 32, var15);
                        var15.field_c = bk.a(32, jb.field_g, (byte) 74) - 16;
                        var15.field_d = bk.a(32, jb.field_g, (byte) 79) - 16;
                      }
                    }
                    if (this.field_j == 18) {
                      for (var9Lifetime3 = 0; 4 > var9Lifetime3; var9Lifetime3++) {
                        var16 = new rb(31, this);
                        pk.a((byte) 32, var16);
                        var16.field_c = bk.a(32, jb.field_g, (byte) 111) - 16;
                        var16.field_d = -16 + bk.a(32, jb.field_g, (byte) -127);
                      }
                    }
                    this.field_d = 0;
                    this.field_c = 0;
                    this.field_e = 0;
                  }
                }
                if (param2 > 0) {
                  var12.field_k = 50;
                }
                var12.field_e = var12.field_e + param2;
                ia.field_hb = 0;
                if (param0 != 10 &&
                  param0 != 11 &&
                  param0 != 18) {
                  return;
                }
              }
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        var11 = SolKnight.field_L ? 1 : 0;
        var4 = (this.field_a >> 4) + (-wd.field_c + 320);
        var5 = -si.field_E + (this.field_b >> 4);
        if (param0 <= 69) {
          this.a((byte) 84);
        }
        var8 = 0;
        var9 = 0;
        var10 = this.field_j;
        if (var10 == 0) {
          var6 = (int)(128.0 * Math.atan2((double)(-this.field_c), (double)(-this.field_d)) / 3.141592653589793);
          if ((this.field_d | this.field_c) != 0) {
            var10 = (int)Math.sqrt((double)(this.field_d * this.field_d + this.field_c * this.field_c));
            var8 = this.field_c * 12 / var10;
            var9 = this.field_d * 12 / var10;
          }
          if (kb.field_b != 0) {
            hf.field_c[2].a(64, var5, 110, var6, var4);
            mi.a(-var8 + var4, -var9 + var5, this.field_i / 40 + 1, 16776960, 128);
            mi.e(-var8 + var4, -var9 + var5, 1 + this.field_n / 60, 16777215);
          } else {
            hf.field_c[0].a(128, var5, 125, var6, var4);
            mi.a(var4 - var8, -var9 + var5, 1 + this.field_i / 30, 16776960, 128);
            mi.e(var4 - var8, var5 - var9, this.field_n / 40 + 1, 16777215);
          }
        } else {
          if (1 != var10) {
            if (2 != var10) {
              if (var10 != 3) {
                if (var10 != 4) {
                  if (var10 != 5) {
                    if (var10 == 6) {
                      mi.e(var4, var5, 4, 65280);
                      mi.e(var4 - this.field_c / 32, -(this.field_d / 32) + var5, 3, 65280);
                      mi.e(-(this.field_c / 16) + var4, var5 - this.field_d / 16, 2, 65280);
                      mi.e(var4, var5, 3, 16776960);
                      mi.e(var4, var5, 2, 16777215);
                    } else {
                      if (var10 != 7) {
                        if (var10 != 8) {
                          if (var10 != 9) {
                            switch (var10) {
                              case 10:
                                var7 = 256 * this.field_e / 256;
                                if (16 > var7) {
                                  ua.field_F[var7].c(var4 - 4 * this.field_e, var5 - 4 * this.field_e, 8 * this.field_e, 8 * this.field_e, 256 - this.field_e * 16);
                                }
                                var7 = 2 + this.field_e * 42 / 256;
                                if (var7 >= 16) {
                                  break;
                                }
                                if (4 > var7) {
                                  var7 = 0;
                                } else {
                                  var7 = var7 - 4;
                                }
                                ua.field_F[var7].c(var4 - (-this.field_e + 128), -128 - (-this.field_e - var5), 2 * -this.field_e + 256, 256 + 2 * -this.field_e, -(this.field_e * 3) + 256);
                                break;
                              case 12:
                                var7 = 256 * this.field_e / 256;
                                if (var7 >= 16) {
                                  break;
                                }
                                ii.field_g[var7].c(var4 - 8, -8 + var5, 16, 16, -(16 * this.field_e) + 256);
                                break;
                              case 13:
                                var7 = 256 * this.field_e / 256;
                                if (var7 >= 16) {
                                  break;
                                }
                                ii.field_g[var7].c(var4 - 16, -16 + var5, 32, 32, 256 - this.field_e * 16);
                                break;
                              case 14:
                                mi.e(-(this.field_c / 16) + var4, var5 - this.field_d / 16, var4, var5, 16711680);
                                break;
                              case 15:
                                mi.e(1 + var4 - this.field_c / 16, var5 - this.field_d / 16, 1 + var4, var5, 16711680);
                                mi.e(-(this.field_c / 16) + var4 - 1, -(this.field_d / 16) + var5, var4 - 1, var5, 16711680);
                                mi.e(var4 - this.field_c / 16, 1 + var5 - this.field_d / 16, var4, 1 + var5, 16711680);
                                mi.e(-(this.field_c / 16) + var4, -1 - this.field_d / 16 + var5, var4, -1 + var5, 16711680);
                                mi.e(-(this.field_c / 16) + var4, var5 - this.field_d / 16, var4, var5, 16776960);
                                break;
                              case 16:
                                mi.e(1 + (-(this.field_c / 16) + var4), var5 - this.field_d / 16, 1 + var4, var5, 16776960);
                                mi.e(-1 + (-(this.field_c / 16) + var4), -(this.field_d / 16) + var5, var4 - 1, var5, 16776960);
                                mi.e(var4 - this.field_c / 16, -(this.field_d / 16) + (var5 + 1), var4, 1 + var5, 16776960);
                                mi.e(-(this.field_c / 16) + var4, -(this.field_d / 16) + (var5 - 1), var4, -1 + var5, 16776960);
                                mi.e(-(this.field_c / 16) + var4, var5 - this.field_d / 16, var4, var5, 16777215);
                                break;
                              case 18:
                                if (this.field_e * 8 < 255) {
                                  mi.a(var4, var5, 2 * this.field_e, 65280, -(this.field_e * 8) + 255);
                                }
                                if (this.field_e * 16 >= 255) {
                                  break;
                                }
                                mi.a(var4, var5, this.field_e, 16776960, -(this.field_e * 16) + 255);
                                break;
                              case 19:
                                mi.a((this.field_c >> 4) + var4, (this.field_d >> 4) + var5, this.field_g + 4, 16711680, 32);
                                mi.e(var4, var5, this.field_g, 16777215);
                                break;
                              case 25:
                                wi.field_i[this.field_m].a(21, var5, 110, 0, var4);
                                if (this.field_k <= 0) {
                                  if (param1 < -this.field_g + var4) {
                                    break;
                                  }
                                  if (param1 > this.field_g + var4) {
                                    break;
                                  }
                                  if (param2 < var5 - this.field_g) {
                                    break;
                                  }
                                  if (param2 > this.field_g + var5) {
                                    break;
                                  }
                                }
                                if (kd.field_a != -1) {
                                  break;
                                }
                                mi.b(var4 - this.field_g / 2, -2 + var5, this.field_g - this.field_e * this.field_g / 4, 4, 16744576);
                                mi.g(var4 - this.field_g / 2, -2 + var5, this.field_g, 4, 16711680);
                                break;
                              case 28:
                                wi.field_i[this.field_m].a(96, var5, 116, 0, var4);
                                if (this.field_k <= 0) {
                                  if (param1 < -this.field_g + var4) {
                                    break;
                                  }
                                  if (this.field_g + var4 < param1) {
                                    break;
                                  }
                                  if (-this.field_g + var5 > param2) {
                                    break;
                                  }
                                  if (param2 > var5 + this.field_g) {
                                    break;
                                  }
                                }
                                if (kd.field_a != -1) {
                                  break;
                                }
                                mi.b(var4 - this.field_g / 2, var5 - 2, -(this.field_e * this.field_g / 72) + this.field_g, 4, 16744576);
                                mi.g(-(this.field_g / 2) + var4, var5 - 2, this.field_g, 4, 16711680);
                                break;
                              case 29:
                                wi.field_i[this.field_m].a(128, var5, 92, 0, var4);
                                if (0 >= this.field_k) {
                                  if (var4 - this.field_g > param1) {
                                    break;
                                  }
                                  if (this.field_g + var4 < param1) {
                                    break;
                                  }
                                  if (var5 - this.field_g > param2) {
                                    break;
                                  }
                                  if (param2 > var5 + this.field_g) {
                                    break;
                                  }
                                }
                                if (-1 == kd.field_a) {
                                  mi.b(-(this.field_g / 2) + var4, var5 - 2, this.field_g - this.field_e * this.field_g / 128, 4, 16744576);
                                  mi.g(var4 - this.field_g / 2, var5 - 2, this.field_g, 4, 16711680);
                                }
                                break;
                              case 30:
                                wi.field_i[this.field_m].a(170, var5, 110, 0, var4);
                                if (this.field_k <= 0) {
                                  if (param1 < -this.field_g + var4) {
                                    break;
                                  }
                                  if (var4 + this.field_g < param1) {
                                    break;
                                  }
                                  if (-this.field_g + var5 > param2) {
                                    break;
                                  }
                                  if (this.field_g + var5 < param2) {
                                    break;
                                  }
                                }
                                if (kd.field_a != -1) {
                                  break;
                                }
                                mi.b(-(this.field_g / 2) + var4, var5 - 2, this.field_g - this.field_g * this.field_e / 256, 4, 16744576);
                                mi.g(var4 - this.field_g / 2, -2 + var5, this.field_g, 4, 16711680);
                                break;
                              case 31:
                              default:
                                if (var10 != 20 &&
                                  21 != var10 &&
                                  var10 != 22 &&
                                  var10 != 23 &&
                                  var10 != 24) {
                                  if (var10 != 31) {
                                    mi.e(var4, var5, 4, 16777215);
                                    break;
                                  }
                                  if (this.field_e >= 128) {
                                    break;
                                  }
                                  wi.field_i[this.field_m].a((128 - this.field_e) * 16 / 128, var5, 104, 0, var4);
                                  break;
                                }
                                if (-this.field_e + this.field_g > 0) {
                                  var7 = 16 * this.field_e / this.field_g;
                                  if (var7 >= 16) {
                                    break;
                                  }
                                  ii.field_g[var7].c(this.field_e + (-this.field_g + var4), this.field_e - this.field_g + var5, (-this.field_e + this.field_g) * 2, (this.field_g - this.field_e) * 2, 255 - this.field_e * 255 / this.field_g);
                                  ua.field_F[0].c(var4 - this.field_e * 4, var5 - 4 * this.field_e, this.field_e * 8, this.field_e * 8, -(128 * this.field_e / this.field_g) + 128);
                                }
                                break;
                              case 27:
                                wi.field_i[this.field_m].a(64, var5, 126, 0, var4);
                                if (this.field_k <= 0) {
                                  if (var4 - this.field_g > param1) {
                                    break;
                                  }
                                  if (param1 > var4 + this.field_g) {
                                    break;
                                  }
                                  if (var5 - this.field_g > param2) {
                                    break;
                                  }
                                  if (this.field_g + var5 < param2) {
                                    break;
                                  }
                                }
                                if (kd.field_a == -1) {
                                  mi.b(-(this.field_g / 2) + var4, var5 - 2, this.field_g - this.field_e * this.field_g / 36, 4, 16744576);
                                  mi.g(-(this.field_g / 2) + var4, -2 + var5, this.field_g, 4, 16711680);
                                }
                                break;
                              case 26:
                                wi.field_i[this.field_m].a(32, var5, 100, 0, var4);
                                if (0 >= this.field_k) {
                                  if (var4 - this.field_g > param1) {
                                    break;
                                  }
                                  if (param1 > this.field_g + var4) {
                                    break;
                                  }
                                  if (var5 - this.field_g > param2) {
                                    break;
                                  }
                                  if (param2 > var5 + this.field_g) {
                                    break;
                                  }
                                }
                                if (kd.field_a == -1) {
                                  mi.b(var4 - this.field_g / 2, -2 + var5, -(this.field_g * this.field_e / 12) + this.field_g, 4, 16744576);
                                  mi.g(var4 - this.field_g / 2, -2 + var5, this.field_g, 4, 16711680);
                                }
                                break;
                              case 17:
                                if (255 > this.field_e * 16) {
                                  mi.a(var4, var5, this.field_e * 4, 65280, 255 - 16 * this.field_e);
                                }
                                break;
                              case 11:
                                var7 = 256 * this.field_e / 256;
                                if (var7 < 16) {
                                  ua.field_F[var7].c(-(4 * this.field_e) + var4, var5 - this.field_e * 4, 8 * this.field_e, 8 * this.field_e, -(this.field_e * 16) + 256);
                                }
                                var7 = 28 * this.field_e / 256 + 2;
                                if (var7 < 16) {
                                  if (var7 < 4) {
                                    var7 = 0;
                                  } else {
                                    var7 = -4 + var7;
                                  }
                                  ua.field_F[var7].c(this.field_e - 192 + var4, this.field_e - 192 + var5, 2 * (-this.field_e + 192), -this.field_e * 2 + 384, -(2 * this.field_e) + 256);
                                }
                                break;
                            }
                          } else {
                            var7 = this.field_e * 256 / 256;
                            if (var7 < 16) {
                              ii.field_g[var7].c(-(this.field_e * 4) + var4, -(this.field_e * 4) + var5, 8 * this.field_e, 8 * this.field_e, 256 - this.field_e * 16);
                            }
                            var7 = 64 * this.field_e / 256;
                            if (16 > var7) {
                              ii.field_g[var7].c(-(2 * this.field_e) + var4, -(this.field_e * 2) + var5, this.field_e * 4, 4 * this.field_e, -(this.field_e * 4) + 256);
                            }
                          }
                        } else {
                          var7 = this.field_e * 64 / 256;
                          if (var7 < 16) {
                            eh.field_b[var7].d(-this.field_e + var4, var5 - this.field_e, this.field_e * 2, this.field_e * 2, (256 - this.field_e * 4) / 2);
                          }
                        }
                      }
                    }
                  } else {
                    mi.e(var4, var5, 1, 16711680);
                  }
                } else {
                  mi.e(var4, var5, -(this.field_c / 16) + var4, -(this.field_d / 16) + var5, 16777215);
                  mi.e(var4 - (this.field_c + this.field_d / 10) / 16, var5 - (this.field_d - this.field_c / 10) / 16, var4, var5, 16777215);
                  mi.e(var4 - (-(this.field_d / 10) + this.field_c) / 16, var5 - (this.field_d + this.field_c / 10) / 16, var4, var5, 16777215);
                  mi.e(var4 - (this.field_c + this.field_d / 20) / 16, var5 - (-(this.field_c / 20) + this.field_d) / 16, var4, var5, 16777215);
                  mi.e(-((this.field_c - this.field_d / 20) / 16) + var4, -((this.field_d + this.field_c / 20) / 16) + var5, var4, var5, 16777215);
                }
              } else {
                var6 = (int)(128.0 * Math.atan2((double)(-this.field_c), (double)(-this.field_d)) / 3.141592653589793);
                hf.field_c[3].a(128, var5, 89, var6, var4);
                mi.a(-var8 + var4, -var9 + var5, 1 + this.field_i / 20, 16776960, 128);
                mi.e(var4 - var8, -var9 + var5, 1 + this.field_n / 24, 16777215);
              }
            } else {
              var6 = (int)(Math.atan2((double)(-this.field_c), (double)(-this.field_d)) * 128.0 / 3.141592653589793);
              hf.field_c[2].a(128, var5, 121, var6, var4);
              if ((this.field_c | this.field_d) != 0) {
                var10 = (int)Math.sqrt((double)(this.field_c * this.field_c + this.field_d * this.field_d));
                var9 = this.field_d * 12 / var10;
                var8 = this.field_c * 12 / var10;
              }
              mi.a(var4 - var8, -var9 + var5, this.field_i / 24 + 1, 16776960, 128);
              mi.e(var4 - var8, var5 - var9, 1 + this.field_n / 30, 16777215);
            }
          } else {
            var6 = (int)(128.0 * Math.atan2((double)(-this.field_c), (double)(-this.field_d)) / 3.141592653589793);
            hf.field_c[1].a(128, var5, 109, var6, var4);
            if (0 != (this.field_d | this.field_c)) {
              var10 = (int)Math.sqrt((double)(this.field_d * this.field_d + this.field_c * this.field_c));
              var9 = 12 * this.field_d / var10;
              var8 = 12 * this.field_c / var10;
            }
            mi.a(-var8 + var4, var5 - var9, 1 + this.field_i / 30, 16776960, 128);
            mi.e(-var8 + var4, -var9 + var5, this.field_n / 40 + 1, 16777215);
          }
        }
    }

    final static o a(String param0, String param1, da param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        o stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.c(91, param1);
          var5 = param2.a(param0, -1, var4_int);
          if (param3 >= -108) {
            field_f = 75;
          }
          stackIn_3_0 = mh.a(true, param2, var4_int, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("rb.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(byte param0) {
        if (param0 != 62) {
          this.a((byte) 96);
        }
        if (!pg.field_e && this.field_j >= 25 &&
          this.field_j <= 30) {
          lk.field_f = lk.field_f + (1 + this.field_j - 25);
        }
        if (7 >= this.field_j &&
          ia.field_hb == 0) {
          ia.field_hb = ia.field_hb + 1;
        }
    }

    rb(int param0, int param1, int param2, int param3, int param4) {
        this.field_j = param0;
        this.field_b = param2;
        this.field_d = param4;
        this.field_e = 0;
        this.field_c = param3;
        this.field_a = param1;
        this.field_h = false;
    }

    private rb(int param0, rb param1) {
        double var3_double = 0.0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        try {
          this.field_c = 0;
          this.field_b = param1.field_b;
          this.field_d = 0;
          this.field_a = param1.field_a;
          this.field_e = 0;
          if (param0 == 31) {
            this.field_c = param1.field_c;
            this.field_d = param1.field_d;
            var3_double = 3.141592653589793 * Math.random();
            var5 = Math.random() * (double)param1.field_g * 2.0 - (double)param1.field_g;
            var7 = (int)(Math.sin(var3_double) * var5);
            var8 = (int)(Math.cos(var3_double) * var5);
            this.field_e = (int)var5;
            this.field_a = this.field_a + var7;
            this.field_d = this.field_d + var8;
            this.field_c = this.field_c + var7;
            this.field_b = this.field_b + var8;
            this.field_m = bk.a(36, jb.field_g, (byte) 106);
          }
          this.field_j = param0;
          this.field_h = false;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "rb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
