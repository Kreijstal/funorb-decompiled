/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ge extends pa {
    private boolean field_Bb;
    static String field_pb;
    private int field_yb;
    static String field_qb;
    private int field_Db;
    private boolean field_jb;
    private int field_mb;
    private int field_rb;
    boolean field_lb;
    private int field_sb;
    private int field_xb;
    private th field_Cb;
    lm field_tb;
    private int field_hb;
    int field_gb;
    private int field_kb;
    private int field_Ab;
    private qk field_wb;
    private int field_fb;
    private int field_nb;
    private int field_ob;
    private sa field_vb;
    static int field_zb;
    static String field_ib;
    boolean field_eb;
    private int field_ub;

    private final void a(int param0, int param1, int param2) {
        this.field_N = param2;
        this.field_ab = param0;
        this.c(85, this.field_M * 14336);
        if (param1 != 750) {
          this.field_wb = (qk) null;
        }
        this.a(6, (byte) -89);
    }

    final boolean a(int param0, boolean param1) {
        if (this.c(true)) {
          return false;
        }
        this.a(!param1 ? 15 : 34, (byte) -89);
        this.field_S = true;
        if (param0 != 47) {
          field_pb = (String) null;
          return true;
        }
        return true;
    }

    public static void r(int param0) {
        field_qb = null;
        field_pb = null;
        if (param0 >= -7) {
          return;
        }
        field_ib = null;
    }

    final void h(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        boolean stackIn_25_1 = false;
        int stackIn_155_0 = 0;
        int var2;
        int var3;
        int var4;
        og var5;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        super.h(77);
        this.field_Ab = this.field_Ab - 1;
        this.b((byte) 123, this.field_Q);
        if (this.field_Q != 33 &&
          this.field_Q != 29) {
          this.field_ob = 0;
        }
        if (this.field_ub > 0) {
          this.field_ub = this.field_ub - 1;
        }
        if (param0 <= 30) {
          this.field_tb = (lm) null;
        }
        if (this.field_xb > 0) {
          this.field_xb = this.field_xb - 1;
        }
        if (29 != this.field_Q) {
          this.field_lb = false;
        }
        stackIn_25_1 = ((!this.field_Bb ||
          this.field_Q == 33 ||
          29 == this.field_Q) &&
          (23 != this.field_Q &&
          !this.o(126) &&
          this.field_Q != 9 &&
          21 != this.field_Q));
        boolean decompiledFrameRemainder1 = true;
        this.field_jb = stackIn_25_1;
        if (this.field_Q == 4) {
          if (this.field_nb > 0) {
            this.field_nb = this.field_nb - 1;
          }
          if (this.field_Bb &&
            this.field_V < 2) {
            this.field_L = this.field_L + 3;
          }
          if (0 < this.field_fb) {
            this.field_fb = this.field_fb - 1;
          }
          L12: {
            if (this.field_nb != 1 && (!(this.field_M > 2) ||
              this.field_Bb)) {
              if ((this.field_nb == 0)) {
                this.field_nb = hp.a((byte) 114, g.field_a, 60) + 60;
                if (!(!this.field_A.field_m.b((byte) -98, 55, this.field_gb))) {
                  this.field_nb = 0;
                }
              }
              break L12;
            }
            var2 = -24 + this.e((byte) -112) + hp.a((byte) 22, g.field_a, 48);
            var3 = -24 + (this.g(1829947600) + hp.a((byte) -66, g.field_a, 48));
            if (!this.field_A.field_b.a(var2, true, true, var3)) {
              this.field_nb = this.field_nb + 1;
            } else {
              this.a(var3, 750, var2);
            }
          }
          this.n(-26310);
          this.n((byte) 106);
        } else {
          if (this.field_Q == 23) {
            fieldTemp$0 = this.field_Db - 1;
            this.field_Db = this.field_Db - 1;
            if (fieldTemp$0 <= 0) {
              this.a(4, (byte) -89);
              this.field_S = true;
            }
          } else {
            if (5 != this.field_Q) {
              if (this.field_Q == 33) {
                this.field_ob = this.field_ob + 1;
                if (this.field_ob != 0) {
                  if (100 < this.field_ob) {
                    this.a(4, (byte) -89);
                  }
                } else {
                  this.field_E = this.field_rb;
                  this.field_G = this.field_sb;
                }
              } else {
                if (this.field_Q != 6) {
                  if (this.field_Q != 7) {
                    if (this.field_Q != 8) {
                      if (this.field_Q == 22) {
                        fieldTemp$1 = this.field_Ab - 1;
                        this.field_Ab = this.field_Ab - 1;
                        if (fieldTemp$1 <= 0) {
                          this.field_Ab = 35;
                          this.field_S = true;
                          this.a(4, (byte) -89);
                          this.u(92);
                          this.o((byte) 27);
                        }
                      } else {
                        if (this.field_Q == 9) {
                          if (this.field_yb != 0) {
                            this.field_G = this.field_G + (this.field_yb << 16);
                          }
                          if (this.field_V == 5) {
                            this.field_A.field_m.a(-99, (ff) (this));
                            this.t(4);
                          }
                        } else {
                          if (12 == this.field_Q) {
                            this.field_Bb = false;
                            this.h((byte) 33);
                            if (this.field_A != null) {
                              stackIn_155_0 = (this.field_A.field_b.a(this.e((byte) -112), true, true, this.g(1829947600))) ? 0 : 1;
                              var2 = stackIn_155_0;
                              if (var2 != 0) {
                                this.field_E = this.field_E - this.field_W;
                                this.field_G = this.field_G - this.field_R;
                              }
                              if (var2 != 0 ||
                                this.k(2)) {
                                this.u(81);
                                this.o((byte) 27);
                              }
                            }
                          } else {
                            if (this.field_Q != 13) {
                              if (this.field_Q != 14 &&
                                26 != this.field_Q) {
                                if (this.field_Q == 34) {
                                  if ((this.field_V == 4)) {
                                    this.field_xb = 0;
                                    this.field_L = this.field_L - 1;
                                    this.field_Bb = false;
                                    if (this.field_vb == null) {
                                      this.field_vb = new sa(this, this.e((byte) -112), -30 + this.g(1829947600), this.field_A.field_m.a((byte) 32, this.field_gb, 750));
                                      this.field_A.field_m.field_G.a(this.field_vb, false);
                                    } else {
                                      if (this.field_vb.b(true)) {
                                        this.t(4);
                                        this.a(4, (byte) -89);
                                      } else {
                                        if ((this.field_R != 0 ||
                                          0 != this.field_W)) {
                                          this.h((byte) 66);
                                          if ((this.k(2) ||
                                            this.field_R == 0 &&
                                            this.field_W == 0) && (this.field_Cb != null &&
                                            !this.field_Cb.f(28113))) {
                                            this.o((byte) 27);
                                            this.field_S = true;
                                          }
                                          this.field_vb.a(this.e((byte) -112), (byte) 121, -30 + this.g(1829947600));
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (15 == this.field_Q) {
                                    if ((4 == this.field_V)) {
                                      this.field_Bb = false;
                                      this.field_L = this.field_L - 1;
                                      this.field_xb = 0;
                                      if (this.field_vb == null) {
                                        this.field_vb = new sa(this, this.e((byte) -112), -30 + this.g(1829947600), this.field_A.field_m.a((byte) 32, this.field_gb, 750));
                                        this.field_A.field_m.field_G.a(this.field_vb, false);
                                      }
                                      if (!(!this.field_vb.b(true))) {
                                        this.t(4);
                                        this.a(4, (byte) -89);
                                      }
                                    }
                                  } else {
                                    if (this.field_Q == 17) {
                                      if (this.field_V == 3 &&
                                        0 == this.field_L) {
                                        this.field_A.a(this.e((byte) -112), -22930, this.field_gb, this.g(1829947600));
                                      }
                                      if (!(this.field_V < 5)) {
                                        this.m((byte) 85);
                                        this.field_A.field_m.a(-113, (ff) (this));
                                      }
                                    } else {
                                      if (this.field_Q != 19 &&
                                        this.field_Q != 24) {
                                        if (this.field_Q == 27) {
                                          if (this.field_V == gg.field_j[27] / 2) {
                                            this.field_Bb = false;
                                            this.field_ub = 0;
                                            this.field_xb = this.field_A.field_m.a((byte) 32, this.field_gb, 2250);
                                          }
                                          if ((~(-1 + gg.field_j[27]) == ~this.field_V)) {
                                            this.a(4, (byte) -89);
                                          }
                                        } else {
                                          if (this.field_Q == 31) {
                                            if ((~this.field_V == ~(gg.field_j[31] - 1))) {
                                              this.a(4, (byte) -89);
                                            }
                                          } else {
                                            if ((this.field_Q == 28)) {
                                              if (gg.field_j[28] / 2 == this.field_V) {
                                                this.field_xb = 0;
                                                this.field_Bb = false;
                                                this.field_ub = this.field_A.field_m.a((byte) 32, this.field_gb, 2250);
                                              }
                                              if ((gg.field_j[28] - 1 == this.field_V)) {
                                                this.a(4, (byte) -89);
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if ((this.field_V == 5)) {
                                          this.field_Bb = true;
                                          this.a(4, (byte) -89);
                                        }
                                      }
                                    }
                                  }
                                }
                                decompiledFrameRemainder1 = false;
                              }
                              else {
                                this.field_Bb = false;
                                if (4 == this.field_V) {
                                  this.a(4, (byte) -89);
                                  this.field_nb = 2;
                                  var5 = new og(this.e((byte) -112), this.g(1829947600), this.field_D, this.field_gb);
                                  this.field_A.field_m.field_K.a(var5, false);
                                  var5.a(-9019, this.field_A);
                                }
                              }
                            } else {
                              if (this.field_Bb) {
                                this.field_V = 2;
                              }
                              if (this.field_V == 2) {
                                this.field_Bb = false;
                                this.field_V = 0;
                                this.field_A.a((byte) 65, this, this.field_X);
                              }
                            }
                          }
                        }
                      }
                    } else {
                      this.field_Bb = false;
                      if ((this.field_V == 0 ||
                        this.field_V == 2) && this.field_L == 0) {
                        if (hp.a((byte) 63, g.field_a, 3) != 0) {
                          hp.a((byte) 124, g.field_a, 5);
                        } else {
                          if (this.field_tb != null &&
                            !this.field_tb.k((byte) -7)) {
                            hp.a((byte) -106, g.field_a, 3);
                          } else {
                            hp.a((byte) -111, g.field_a, 4);
                          }
                        }
                      }
                      fieldTemp$2 = this.field_Ab - 1;
                      this.field_Ab = this.field_Ab - 1;
                      if (0 >= fieldTemp$2) {
                        this.field_A.a(this.field_gb, this, -32422, this.field_tb);
                        this.field_tb.j(18);
                        this.field_tb = null;
                        this.a(4, (byte) -89);
                        this.field_S = true;
                        if (this.field_wb != null) {
                          this.a(true, this.field_A.field_b.b(this.e((byte) -112), this.field_wb.field_h, this.g(1829947600), this.field_wb.field_g, 8760));
                        }
                      }
                    }
                  } else {
                    if (!this.field_A.field_m.b((byte) -66, 61, this.field_gb)) {
                    }
                    if (this.field_A.field_m.b((byte) -88, 54, this.field_gb)) {
                    }
                    boolean decompiledFrameRemainder0 = true;
                    if (this.field_tb != null &&
                      !this.field_tb.field_Z &&
                      18 != this.field_tb.field_Q &&
                      21 != this.field_tb.field_Q &&
                      this.field_tb.field_Q != 20) {
                      fieldTemp$3 = this.field_fb;
                      this.field_fb = this.field_fb + 1;
                      if (fieldTemp$3 <= 60) {
                        if ((this.field_tb.field_Q == 1 ||
                          this.field_tb.field_Q == 2)) {
                          this.q((byte) -98);
                        }
                        decompiledFrameRemainder0 = false;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      this.field_tb = null;
                      this.a(4, (byte) -89);
                      this.u(-128);
                      this.o((byte) 27);
                    }
                    this.h((byte) 110);
                    this.n(-26310);
                  }
                } else {
                  if (0 < this.field_fb) {
                    this.field_fb = this.field_fb - 1;
                  }
                  this.h((byte) 55);
                  if (this.k(2) ||
                    0 == this.field_R &&
                    this.field_W == 0) {
                    this.a(4, (byte) -89);
                  }
                  this.n(-26310);
                  this.n((byte) 33);
                }
              }
            } else {
              if (this.field_fb > 0) {
                this.field_fb = this.field_fb - 1;
              }
              this.k((byte) 92);
              this.h((byte) 40);
              if (this.k(2) ||
                0 == this.field_R &&
                0 == this.field_W) {
                this.o((byte) 27);
              }
              if (null == this.field_A) {
                return;
              }
              this.n(-26310);
              this.n((byte) 15);
            }
          }
        }

    }

    final static void s(int param0) {
        int var2 = 0;
        hn[] var1 = null;
        hn var3 = null;
        int var4 = 0;
        hn[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5 = ia.field_x;
          var1 = var5;
          for (var2 = 0; var5.length > var2; var2++) {
            var3 = var5[var2];
            var3.a(false);
          }
          if (param0 != 9) {
            ge.s(101);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "ge.EC(" + param0 + ')');
        }
    }

    private final void u(int param0) {
        this.field_Cb = this.field_wb != null ? this.field_A.field_b.b(this.e((byte) -112), this.field_wb.field_h, this.g(1829947600), this.field_wb.field_g, 8760) : null;
        int var2 = 82 / ((-11 - param0) / 51);
    }

    private final void q(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var2 = this.field_tb.e((byte) -112);
        var3 = this.field_tb.g(1829947600);
        var4 = -var2 + this.e((byte) -112);
        var5 = -var3 + this.g(1829947600);
        var6 = 6400;
        if (this.field_A.field_m.b((byte) -101, 61, this.field_gb)) {
          var6 = var6 * 3;
        }
        if (this.field_A.field_m.b((byte) -109, 54, this.field_gb)) {
          var6 = var6 * 5;
        }
        if (var5 * var5 + var4 * var4 <= var6 + 10 &&
          this.field_A.field_b.a(var3, -110, var2, this.g(1829947600), this.e((byte) -112)) != -1) {
          this.field_N = var2;
          this.field_ab = var3;
          var7 = 57344 * this.field_M;
          var8 = var7 / 2;
          if (this.field_A.field_m.b((byte) -68, 61, this.field_gb)) {
            var7 = var7 + var8;
          }
          if (this.field_A.field_m.b((byte) -102, 54, this.field_gb)) {
            var7 = var7 + var8;
          }
          this.c(93, var7);
        } else {
          this.u(72);
          this.o((byte) 27);
        }
        if (param0 > -42) {
          return;
        }
        this.field_S = true;
    }

    final void e(int param0, int param1) {
        this.a(31, (byte) -89);
        int var3 = 100 % ((30 - param0) / 32);
        this.field_hb = this.field_hb | 1 << this.field_gb;
        this.field_S = true;
        this.field_gb = param1;
    }

    final void e(boolean param0) {
        if (this.c(true)) {
          return;
        }
        if (param0) {
          return;
        }
        this.a(29, (byte) -89);
        this.field_S = true;
    }

    final static void a(String param0, byte param1) {
        if (param1 < 124) {
          return;
        }
        try {
          rb.field_a = param0;
          fb.a(12, 74);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ge.SB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_Q == 9) {
          return;
        }
        if (this.field_Q == 17 &&
          param0 != 9) {
          return;
        }
        if (34 == this.field_Q &&
          9 != param0 &&
          21 != param0) {
          return;
        }
        if (this.field_vb != null && (param0 == 9 ||
          param0 == 21)) {
          this.t(4);
        }
        boolean decompiledFrameRemainder0 = true;
        super.a(param0, param1);
        if (this.field_Q != 4) {
          if (this.field_Q == 7) {
            this.field_eb = true;
          } else {
            if (9 != this.field_Q) {
              if (this.field_Q != 27 &&
                28 != this.field_Q &&
                this.field_Q != 19 &&
                this.field_Q != 24) {
                if (this.field_Q == 29) {
                  this.field_lb = true;
                } else {
                  if (this.field_Q == 33) {
                    this.field_wb = null;
                  } else {
                    if (((this.field_Q == 8)) &&
                      ((this.field_A == null)) &&
                      ((this.field_tb != null))) {
                      this.field_tb.j((byte) 118);
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_ub = 0;
                this.field_Bb = false;
                this.field_xb = 0;
              }
            }
          }
        } else {
          this.field_W = 0;
          this.field_R = 0;
        }

    }

    ge(int param0, int param1, int param2) {
        super(param0, param1, param2, 28672);
        this.field_lb = false;
        this.field_Ab = 0;
        this.field_Bb = false;
        this.field_yb = 0;
        this.field_hb = 0;
        this.field_tb = null;
        this.field_ob = 0;
        this.field_kb = 0;
        this.field_vb = null;
        this.field_W = 0;
        this.field_R = 0;
        this.field_mb = hp.a((byte) -103, g.field_a, 10);
        this.field_nb = hp.a((byte) -80, g.field_a, 120);
    }

    final void m(int param0) {
        if (param0 != -6556) {
          this.h(-45);
        }
        if (this.c(true)) {
          return;
        }
        this.a(27, (byte) -89);
        this.field_S = true;
    }

    private final void n(byte param0) {
        int fieldTemp$0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_17_0 = false;
        boolean stackOut_16_0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        c var7;
        ek var8;
        ge var9;
        int var10;
        int var11;
        int var12;
        int var10Lifetime1;
        int var11Lifetime1;
        int stackIn_12_0Lifetime1;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_Bb) {
          return;
        }
        fieldTemp$0 = this.field_mb;
        this.field_mb = this.field_mb + 1;
        if (10 > fieldTemp$0) {
          return;
        }
        this.field_mb = 0;
        if (0 < this.field_Ab) {
          return;
        }
        var5 = this.field_C - 1;
        while (true) {
          if (this.field_C + 1 < var5) {
            if (param0 < 4) {
              this.q(-53);
            }
            return;
          }
          var6 = -1 + this.field_B;
          while (true) {
            stackIn_12_0 = ~(this.field_B + 1);
            if (stackIn_12_0 > ~var6) {
              var5++;
              break;
            }
            var7 = this.field_A.a(true, var5, var6);
            if (var7 != null) {
              var8 = (ek) (var7.a(false));
              while (var8 != null) {
                stackOut_16_0 = var8 instanceof ge;
                stackIn_12_0Lifetime1 = stackOut_16_0 ? 1 : 0;
                stackIn_17_0 = stackOut_16_0;
                if (stackIn_17_0) {
                  var9 = (ge) (var8);
                  if (var9.field_gb != this.field_gb &&
                    !var9.field_Bb) {
                    if (var9.field_Q != 5 &&
                      var9.field_Q != 6 &&
                      var9.field_Q != 4) {
                      var8 = (ek) (var7.c(-1));
                      continue;
                    }
                    var2 = var9.e((byte) -112) - this.e((byte) -112);
                    var3 = var9.g(1829947600) - this.g(1829947600);
                    var4 = var3 * var3 + var2 * var2;
                    if (var4 < 1600 &&
                      -1 != this.field_A.field_b.a(var9.g(1829947600), -104, var9.e((byte) -112), this.g(1829947600), this.e((byte) -112))) {
                      this.a(22, (byte) -89);
                      this.field_Ab = 70;
                      if (!var9.field_Bb) {
                        var9.a(22, (byte) -89);
                        var9.field_Ab = 70;
                      }
                      var10 = var9.field_G + (var2 << 15);
                      var11 = (var3 << 15) + var9.field_E;
                      if (this.field_A.field_b.a(var11 >> 16, 126, var10 >> 16, var9.g(1829947600), var9.e((byte) -112)) != -1) {
                        var9.field_G = var10;
                        var9.field_E = var11;
                      }
                      var10Lifetime1 = -(var2 << 15) + this.field_G;
                      var11Lifetime1 = this.field_E - (var3 << 15);
                      if (this.field_A.field_b.a(var11Lifetime1 >> 16, -72, var10Lifetime1 >> 16, this.g(1829947600), this.e((byte) -112)) != -1) {
                        this.field_E = var11Lifetime1;
                        this.field_G = var10Lifetime1;
                      }
                      this.field_A.a(-89, var9, this);
                      return;
                    }
                  }
                }
                var8 = (ek) (var7.c(-1));
              }
            }
            var6++;
          }
        }
    }

    final void j(byte param0) {
        if (7 == this.field_Q) {
          this.q((byte) -110);
        } else {
          if (this.field_Q == 5 ||
            this.field_Q == 6) {
            this.u(83);
            this.o((byte) 27);
            this.field_S = true;
          }
        }
        int var2 = 9 % ((param0 - 3) / 53);
    }

    final void m(byte param0) {
        int fieldTemp$0 = this.field_kb;
        this.field_kb = this.field_kb - 1;
        if (0 < fieldTemp$0 ||
          this.field_Q == 9) {
          return;
        }
        if (this.field_Q == 8 &&
          null != this.field_tb) {
          this.field_tb.q(-22882);
        }
        if (param0 < 37) {
          this.u(32);
        }
        if (this.field_Q != 17) {
          this.a(9, (byte) -89);
        }
        this.field_S = true;
        this.field_A.field_p[this.field_gb] = this.field_A.field_p[this.field_gb] + 1;
    }

    final void t(int param0) {
        if (null != this.field_vb) {
          this.field_Q = 15;
          this.field_vb.d(-108);
          this.field_vb.a(true);
          this.field_vb = null;
          this.a(4, (byte) -89);
        }
        if (param0 != 4) {
          this.field_Ab = 97;
        }
    }

    final boolean a(boolean param0, byte param1) {
        if (this.c(true)) {
          return false;
        }
        this.a(13, (byte) -89);
        if (param1 <= 3) {
          this.field_tb = (lm) null;
        }
        this.field_X = param0 ? true : false;
        this.field_S = true;
        return true;
    }

    final void l(int param0) {
        if (this.c(true)) {
          return;
        }
        if (param0 != 34) {
          ge.s(47);
        }
        this.a(28, (byte) -89);
        this.field_S = true;
    }

    final void a(boolean param0, th param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            !param1.f(28113)) {
            this.field_nb = 0;
            this.field_wb = (qk) (param1.a((byte) 115));
            this.field_Cb = param1;
            if (!this.c(param0)) {
              this.o((byte) 27);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("ge.PC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void k(byte param0) {
        if (param0 != 92) {
          this.field_yb = -27;
        }
    }

    private final void o(byte param0) {
        int var3;
        int var4;
        qk var5;
        if (null != this.field_Cb &&
          !this.field_Cb.f(param0 ^ 28106)) {
          var5 = (qk) (this.field_Cb.g(77));
          this.field_N = var5.field_g;
          this.field_ab = var5.field_h;
          this.a(5, (byte) -89);
          var3 = 28672 * this.field_M;
          if (param0 != 27) {
            this.field_nb = 3;
          }
          var4 = var3 / 2;
          if (this.field_A.field_m.b((byte) -72, 49, this.field_gb)) {
            var3 = var3 + var4;
          }
          if (this.field_A.field_m.b((byte) -101, 47, this.field_gb)) {
            var3 = var3 + var4;
          }
          this.c(-97, var3);
          return;
        }
        this.field_Cb = null;
        this.field_wb = null;
        this.a(4, (byte) -89);
    }

    private final void n(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_17_0 = false;
        boolean stackOut_16_0;
        Object var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        c var8;
        ek var9;
        lm var10;
        int var11;
        int var12;
        int var7Lifetime1;
        int stackIn_11_0Lifetime1;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_xb > 0) {
          return;
        }
        fieldTemp$0 = this.field_mb;
        this.field_mb = this.field_mb + 1;
        if (fieldTemp$0 < 10) {
          return;
        }
        this.field_mb = 0;
        if (param0 != -26310) {
          this.field_rb = 98;
        }
        var2 = null;
        var6 = this.field_C - 1;
        while (true) {
          if (this.field_C + 1 < var6) {
            if (var2 != null &&
              this.field_Q != 7 &&
              this.field_fb == 0 &&
              !this.field_Bb &&
              this.field_Q != 33) {
              this.field_N = ((lm) (var2)).e((byte) -112);
              this.field_ab = ((lm) (var2)).g(param0 + 1829973910);
              var6 = 57344 * this.field_M;
              var7 = var6 / 2;
              if (this.field_A.field_m.b((byte) -77, 61, this.field_gb)) {
                var6 = var6 + var7;
              }
              if (this.field_A.field_m.b((byte) -99, 54, this.field_gb)) {
                var6 = var6 + var7;
              }
              this.c(param0 ^ 26259, var6);
              this.a(7, (byte) -89);
              this.field_tb = (lm) (var2);
              this.field_fb = 0;
            }
            return;
          }
          var7Lifetime1 = this.field_B - 1;
          while (true) {
            stackIn_11_0 = 1 + this.field_B;
            if (stackIn_11_0 < var7Lifetime1) {
              var6++;
              break;
            }
            var8 = this.field_A.a(true, var6, var7Lifetime1);
            if (var8 != null) {
              var9 = (ek) (var8.a(false));
              while (var9 != null) {
                stackOut_16_0 = var9 instanceof lm;
                stackIn_11_0Lifetime1 = stackOut_16_0 ? 1 : 0;
                stackIn_17_0 = stackOut_16_0;
                if (stackIn_17_0) {
                  var10 = (lm) (var9);
                  if (var10.field_Q != 21 &&
                    var10.field_Q != 18 &&
                    32 != var10.field_Q &&
                    var10.field_Q != 20) {
                    var3 = var10.e((byte) -112) - this.e((byte) -112);
                    var4 = var10.g(param0 ^ -1829940758) - this.g(1829947600);
                    var5 = var3 * var3 + var4 * var4;
                    var11 = 6400;
                    if (this.field_A.field_m.b((byte) -79, 61, this.field_gb)) {
                      var11 = var11 * 2;
                    }
                    if (this.field_A.field_m.b((byte) -91, 54, this.field_gb)) {
                      var11 = var11 * 3;
                    }
                    if (var11 > var5) {
                      if (this.field_A.field_b.a(var10.g(1829947600), 111, var10.e((byte) -112), this.g(1829947600), this.e((byte) -112)) == -1) {
                        var9 = (ek) (var8.c(-1));
                        continue;
                      }
                      if (400 > var5) {
                        this.field_tb = var10;
                        var10.j((byte) 120);
                        this.a(8, (byte) -89);
                        this.field_Ab = 70;
                        this.field_A.a(var10, this, (var10.e((byte) -112) + this.e((byte) -112)) / 2, (var10.g(1829947600) + this.g(1829947600)) / 2, (byte) -63);
                        return;
                      }
                      if (var2 == null ||
                        0 == (var10.field_x + this.field_x) % 2) {
                        var2 = var10;
                      }
                    }
                  }
                }
                var9 = (ek) (var8.c(-1));
              }
            }
            var7Lifetime1++;
          }
        }
    }

    final boolean d(byte param0, int param1) {
        if (param0 != 61) {
          this.field_Db = -106;
        }
        return 0 != (this.field_hb & 1 << param1) ? true : false;
    }

    final void r(byte param0) {
        if (param0 >= -47) {
          return;
        }
        this.field_Db = 0;
    }

    final boolean p(byte param0) {
        if (param0 <= 12) {
          this.j((byte) -27);
        }
        return this.field_ub > 0 ? true : false;
    }

    final void d(int param0, int param1) {
        if (this.field_Q == 8) {
          return;
        }
        this.a(23, (byte) -89);
        this.field_S = true;
        this.field_Db = param0;
        if (param1 > -93) {
          this.o(49);
        }
    }

    final boolean q(int param0) {
        if (param0 >= -126) {
          return false;
        }
        return this.field_jb;
    }

    ge(int param0, int param1, boolean param2) {
        this(param0, param1, param2 ? 0 : 1);
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_3_3 = 0;
        stackIn_2_1 = param0;
        stackIn_2_2 = param1;
        if (!param2) {
          stackIn_3_3 = 1;
        } else {
          stackIn_3_3 = 0;
        }
    }

    final static boolean p(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -59) {
          field_zb = -82;
        }
        stackIn_6_0 = (a.field_b >= 10) && (fn.field_i >= 13);
        return stackIn_6_0;
    }

    final boolean o(int param0) {
        int var2 = 35 % ((param0 - 75) / 44);
        return this.field_xb > 0 ? true : false;
    }

    final void f(boolean param0) {
        if (0 < this.field_xb ||
          0 < this.field_ub ||
          this.field_Bb) {
          this.field_Bb = false;
          this.field_xb = 0;
          this.field_S = true;
          this.field_ub = 0;
        }
        if (!param0) {
          this.d(-44, -117);
        }
    }

    private final boolean c(boolean param0) {
        boolean stackIn_18_0 = false;
        if (!param0) {
          return false;
        }
        stackIn_18_0 = (8 == this.field_Q) || (this.field_Q == 9) || (this.field_Q == 23) || (this.field_Q == 12) || (7 == this.field_Q) || (this.field_Q == 13) || (this.field_Q == 14) || (26 == this.field_Q) || (this.field_Q == 15) || (17 == this.field_Q) || (this.field_Q == 28) || (this.field_Q == 24) || (this.field_Q == 19);
        return stackIn_18_0;
    }

    final boolean d(boolean param0) {
        if (!param0) {
          this.field_gb = -9;
        }
        return this.field_D == 0 ? true : false;
    }

    final boolean l(byte param0) {
        if (this.c(true)) {
          return false;
        }
        this.a(17, (byte) -89);
        if (param0 != -52) {
          this.u(78);
        }
        this.field_S = true;
        return true;
    }

    final boolean b(boolean param0, byte param1) {
        if (this.c(true)) {
          return false;
        }
        if (param1 > -100) {
          this.field_mb = -62;
        }
        this.a(param0 ? 26 : 14, (byte) -89);
        this.field_S = true;
        return true;
    }

    static {
        field_pb = "Game options changed (<%0>)";
        field_qb = "Invite <%0> to this game";
        field_ib = "A cloud of corrosive acid that will stop living and dead alike.";
    }
}
