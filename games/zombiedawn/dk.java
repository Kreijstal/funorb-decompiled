/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk extends wc {
    static boolean field_ac;
    private int field_Xb;
    static int[][][] field_Tb;
    private boolean field_Ub;
    static String field_Zb;
    private int field_Sb;
    private int field_cc;
    private int field_dc;
    private int field_Wb;
    static String field_Vb;
    private int field_Yb;
    private a[] field_bc;

    final void b(int param0, byte param1, int param2) {
        int var8 = ZombieDawn.field_J;
        int var4 = 2 + this.field_Gb;
        if (param1 > -91) {
          field_Vb = (String) null;
        }
        if (var4 == 0) {
          return;
        }
        int var5 = var4;
        int var6 = var4 / 2;
        int var7 = -var4 + 8;
        if (this.field_cc == 2) {
          bi.d(-var7 + param0 + 9, param2 - 15 - var7, var5 - 1, 0, 64);
          bi.d(7 + param0, -20 + param2, -1 + var6, 0, 128);
          bi.a(9 + param0 - var7 << 4, -var7 + (param2 - 15) << 4, var5 << 4, 250, dm.field_p);
          bi.a(param0 + 7 << 4, -20 + param2 << 4, var6 << 4, 200, dm.field_r);
        } else {
          if (this.field_cc != 1) {
            bi.d(-2 + param0, -10 + (param2 - var7), var5 - 1, 0, 64);
            bi.d(-2 + param0, -16 + param2, var6 - 1, 0, 128);
            bi.a(param0 - 2 << 4, -var7 + param2 - 10 << 4, var5 << 4, 250, dm.field_p);
            bi.a(param0 - 2 << 4, param2 - 16 << 4, var6 << 4, 200, dm.field_r);
          } else {
            bi.d(var7 - 7 + param0, -var7 + (param2 - 15), -1 + var5, 0, 64);
            bi.d(-4 + param0, param2 - 20, -1 + var6, 0, 128);
            bi.a(var7 + (param0 - 7) << 4, param2 + (-15 - var7) << 4, var5 << 4, 250, dm.field_p);
            bi.a(param0 - 4 << 4, param2 - 20 << 4, var6 << 4, 200, dm.field_r);
          }
        }
    }

    final void g(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        boolean stackIn_56_1 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        var5 = ZombieDawn.field_J;
        this.field_Wb = this.field_Wb + 1;
        if (1 == this.field_F) {
          this.field_V = false;
          this.g((byte) 87);
          this.h((byte) -91);
          this.field_V = true;
        }
        if (this.field_F == 10 &&
          0 == this.field_Wb % 2) {
          this.field_Sb = (1 + this.field_Sb) % 40;
          this.field_bc[this.field_Sb].a(-327680 + this.field_x, 20, this.field_y - 393216, 65);
        }
        if (402 <= this.field_Wb) {
          for (var2 = 0; var2 < 40; var2++) {
            this.field_bc[var2].a(110);
          }
        }
        if (param0 < 95) {
          return;
        }
        var2Lifetime1 = 48;
        if (this.field_Wb >= 200) {
          if (this.field_Wb != 200) {
            if (this.field_Wb == 250) {
              this.e(1, -6904);
              this.field_Y = var2Lifetime1 + this.a(true);
              this.field_X = this.f(237239984);
              this.c(0, 143360);
            } else {
              if (this.field_Wb >= 300 &&
                this.field_Wb < 316) {
                this.field_dc = this.field_dc + 1;
              } else {
                if (this.field_Wb < 349) {
                  stackIn_56_1 = !(this.field_Wb <= 332);
                  this.field_Ub = stackIn_56_1;
                } else {
                  if (this.field_Wb < 365) {
                    this.field_dc = this.field_dc - 1;
                  } else {
                    if (365 == this.field_Wb) {
                      this.field_U = dc.a((byte) 18, 113);
                      this.e(1, -6904);
                      this.field_Y = -var2Lifetime1 + this.a(true);
                      this.field_X = this.f(237239984);
                      this.c(0, 143360);
                    } else {
                      if (this.field_Wb != 402) {
                        if (this.field_Wb >= 15930) {
                          if (this.field_Wb == 15930) {
                            this.e(0, -6904);
                            super.g(112);
                          } else {
                            if (this.field_Wb == 15980) {
                              this.e(2, -6904);
                              super.g(112);
                            } else {
                              if (this.field_Wb > 15980) {
                                if (this.field_G >= 4) {
                                  fieldTemp$0 = this.field_Yb;
                                  this.field_Yb = this.field_Yb + 1;
                                  if (fieldTemp$0 < 2) {
                                    this.field_T = 0;
                                    this.field_O = 0;
                                    this.field_Y = this.a(true);
                                    this.field_X = this.f(237239984);
                                    this.field_G = 0;
                                    this.e(0, -6904);
                                    super.g(100);
                                    this.field_Wb = 15930;
                                  } else {
                                    this.field_y = this.field_y - 8192;
                                    var3 = 12288;
                                    this.field_Xb = this.field_Xb + var3;
                                  }
                                } else {
                                  if (this.field_F != 10) {
                                    this.field_y = this.field_y - 12288;
                                  }
                                  super.g(125);
                                  fieldTemp$1 = this.field_N + 1;
                                  this.field_N = this.field_N + 1;
                                  if (fieldTemp$1 > 5) {
                                    this.field_N = 0;
                                    fieldTemp$2 = this.field_G + 1;
                                    this.field_G = this.field_G + 1;
                                    if (fieldTemp$2 >= 6) {
                                      this.field_G = 6;
                                    }
                                  }
                                }
                              } else {
                                super.g(120);
                              }
                            }
                          }
                        } else {
                          super.g(109);
                          if (null != this.field_yb &&
                            this.field_F == 10) {
                            this.field_cc = 0;
                            var3 = Math.abs(this.field_yb.a(true) - this.a(true));
                            var4 = Math.abs(this.field_yb.f(237239984) - this.f(237239984));
                            if (var4 / 2 < var3) {
                              this.field_cc = this.field_cc + 1;
                              if (this.field_yb.a(true) > this.a(true)) {
                                this.field_cc = this.field_cc + 1;
                              }
                            }
                          }
                        }
                      } else {
                        kh.a(110, false);
                        jp.$cfr$intArgs$a$c44adeabe1a9(127, 100);
                        this.e(0, -6904);
                      }
                    }
                  }
                }
              }
            }
          } else {
            this.field_U = dc.a((byte) 18, 111);
            this.e(3, -6904);
          }
        }
    }

    final void r(byte param0) {
        this.field_Xb = this.field_Xb + 2621440;
        if (param0 >= -31) {
          this.r((byte) 103);
        }
        this.field_x = this.field_x - 2621440;
    }

    public static void p(byte param0) {
        if (param0 < 64) {
          field_Tb = (int[][][]) null;
        }
        field_Vb = null;
        field_Zb = null;
        field_Tb = (int[][][]) null;
    }

    final void a(byte param0, wk param1) {
        int var8 = 0;
        int stackIn_16_0 = 0;
        vn stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_30_2 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var9 = 0;
        var9 = ZombieDawn.field_J;
        try {
          if (this.field_F == 20) {
            return;
          }
          var3_int = param1.a(this.a(true), (byte) -102);
          var4 = param1.a(this.f(237239984), 0);
          var5 = 0;
          var6 = var4;
          if (param0 > -76) {
            this.q((byte) -95);
          }
          var7_int = this.field_F;
          if (var7_int != 0 &&
            var7_int != 1) {
            if (var7_int == 3) {
              var5 = 1;
            } else if (var7_int == 10) {
              var5 = 6 * this.field_cc + 6;
              if (this.field_G == 1) {
                var5++;
              }
            } else if (2 == var7_int) {
              var5 = 24;
              var5 = var5 + this.field_G;
              if (var5 > 28) {
                var5 = 28;
              }
            }
          } else {
            if (this.field_Ub) {
              stackIn_16_0 = this.field_cc * 6 + 6;
            } else {
              stackIn_16_0 = 0;
            }
            var5 = stackIn_16_0;
            if (365 <= this.field_Wb) {
              var5 = var5 + this.field_Wb % 2;
            }
            var6 = var6 + this.field_dc;
          }
          stackIn_29_0 = nb.field_k[1];
          stackIn_29_1 = -12;
          if (this.field_S != 3) {
            stackIn_30_2 = var3_int - 3;
          } else {
            stackIn_30_2 = var3_int - 2;
          }
          so.a(stackIn_29_0, stackIn_29_1 + stackIn_30_2, (this.field_Xb >> 16) + (var4 - 7));
          ld.field_l[this.field_t][var5].b(-24 + var3_int, var6 - 48);
          var7 = new int[]{0, -16, 16};
          if (this.field_Gb > 0) {
            this.b(var3_int - 4 + var7[this.field_cc], (byte) -97, 15 + var6);
          }
          if (this.field_Wb >= 402) {
            for (var8 = 0; var8 < 40; var8++) {
              this.field_bc[var8].a(param1, 8192);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("dk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final void q(byte param0) {
        if (param0 < 89) {
          this.b(-1, (byte) -3, 12);
        }
        this.field_Wb = 15930;
        this.g(124);
    }

    dk(int param0, int param1) {
        super(param0, param1, 27);
        int var3 = 0;
        this.field_Sb = 0;
        this.field_bc = new a[40];
        this.field_Sb = 0;
        this.field_G = 0;
        this.field_Yb = 0;
        this.field_F = 0;
        this.field_Wb = 0;
        this.field_V = true;
        this.field_dc = 0;
        this.field_cc = 2;
        this.field_Xb = 0;
        this.field_Ub = false;
        hp.field_A = this;
        for (var3 = 0; var3 < 40; var3++) {
          this.field_bc[var3] = new a();
        }
    }

    static {
        field_ac = false;
        field_Zb = "<%0>: <%1>";
        field_Tb = new int[9][][];
        field_Tb[1] = new int[][]{new int[]{5, 0, 1}, new int[]{4, 0, 2}, new int[]{3, 0, 3}, new int[]{2, 0, 4}, new int[]{1, 0, 6}, new int[]{1, 0, 8}, new int[]{1, 0, 10}, new int[]{1, 0, 12}, new int[]{1, 0, 14}, new int[]{1, 0, 16}, new int[]{2, 0, 17}};
        field_Tb[5] = new int[][]{new int[]{15, 2, 7}};
        field_Tb[7] = new int[][]{new int[]{2, 3, 10}, new int[]{2, 3, 8}, new int[]{2, 3, 7}, new int[]{2, 3, 6}, new int[]{2, 3, 7}, new int[]{2, 3, 8}, new int[]{2, 3, 9}, new int[]{2, 3, 10}, new int[]{2, 3, 11}, new int[]{2, 3, 12}, new int[]{2, 3, 13}, new int[]{2, 3, 14}, new int[]{2, 3, 15}, new int[]{2, 3, 16}, new int[]{2, 3, 17}, new int[]{2, 3, 18}, new int[]{2, 3, 19}, new int[]{2, 3, 20}, new int[]{2, 3, 21}};
        field_Tb[3] = new int[][]{new int[]{25, 2, 1}, new int[]{8, 2, 2}, new int[]{7, 2, 3}, new int[]{6, 2, 4}, new int[]{4, 2, 5}, new int[]{15, 2, 6}};
        field_Tb[4] = new int[][]{new int[]{20, 1, 5}, new int[]{8, 1, 6}, new int[]{7, 1, 7}, new int[]{6, 1, 8}, new int[]{5, 1, 9}, new int[]{5, 1, 10}, new int[]{5, 1, 11}, new int[]{5, 1, 12}};
        field_Tb[8] = new int[][]{new int[]{2, 3, 10}, new int[]{2, 3, 8}, new int[]{2, 3, 7}, new int[]{2, 3, 6}, new int[]{2, 3, 7}, new int[]{2, 3, 8}, new int[]{2, 3, 9}, new int[]{2, 3, 10}, new int[]{2, 3, 11}, new int[]{2, 3, 12}, new int[]{2, 3, 13}, new int[]{2, 3, 14}, new int[]{2, 3, 15}, new int[]{2, 3, 16}, new int[]{2, 3, 17}, new int[]{2, 3, 18}, new int[]{2, 3, 19}, new int[]{2, 3, 20}, new int[]{2, 3, 21}};
        field_Tb[0] = new int[][]{new int[]{5, 0, 1}, new int[]{4, 0, 2}, new int[]{3, 0, 3}, new int[]{2, 0, 4}, new int[]{1, 0, 5}, new int[]{1, 0, 6}, new int[]{1, 0, 7}, new int[]{1, 0, 8}, new int[]{1, 0, 9}, new int[]{1, 0, 10}, new int[]{1, 0, 11}, new int[]{1, 0, 12}, new int[]{1, 0, 13}, new int[]{1, 0, 14}, new int[]{2, 0, 15}, new int[]{3, 0, 16}, new int[]{4, 0, 17}, new int[]{5, 1, 1}, new int[]{4, 1, 2}, new int[]{3, 1, 3}, new int[]{2, 1, 4}};
        field_Tb[2] = new int[][]{new int[]{20, 1, 5}};
        field_Tb[6] = new int[][]{new int[]{2, 3, 1}, new int[]{2, 3, 2}, new int[]{2, 3, 3}, new int[]{2, 3, 4}, new int[]{2, 3, 5}, new int[]{2, 3, 6}, new int[]{2, 3, 7}, new int[]{2, 3, 8}, new int[]{2, 3, 9}, new int[]{2, 3, 10}, new int[]{2, 3, 11}, new int[]{2, 3, 12}, new int[]{2, 3, 13}, new int[]{2, 3, 14}, new int[]{2, 3, 15}, new int[]{2, 3, 16}, new int[]{2, 3, 17}, new int[]{2, 3, 18}, new int[]{2, 3, 19}, new int[]{2, 3, 20}, new int[]{2, 3, 21}};
        field_Vb = "Email (Login):";
    }
}
