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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ZombieDawn.field_J;
          var4 = 2 + this.field_Gb;
          if (param1 <= -91) {
            break L0;
          } else {
            field_Vb = (String) null;
            break L0;
          }
        }
        if (var4 == 0) {
          return;
        } else {
          L1: {
            var5 = var4;
            var6 = var4 / 2;
            var7 = -var4 + 8;
            if ((this.field_cc ^ -1) != -3) {
              if ((this.field_cc ^ -1) == -2) {
                bi.d(var7 + -7 + param0, -var7 + (param2 - 15), -1 + var5, 0, 64);
                bi.d(-4 + param0, param2 - 20, -1 + var6, 0, 128);
                bi.a(var7 + (param0 - 7) << -439229724, param2 + (-15 - var7) << -1177496348, var5 << 412788068, 250, dm.field_p);
                bi.a(param0 - 4 << 816202884, param2 - 20 << -688756284, var6 << -978454108, 200, dm.field_r);
                break L1;
              } else {
                bi.d(-2 + param0, -10 + (param2 - var7), var5 + -1, 0, 64);
                bi.d(-2 + param0, -16 + param2, var6 - 1, 0, 128);
                bi.a(param0 - 2 << -215119484, -var7 + param2 + -10 << -1134074140, var5 << -513134716, 250, dm.field_p);
                bi.a(param0 + -2 << 653891812, param2 - 16 << 1185891300, var6 << 1059036196, 200, dm.field_r);
                break L1;
              }
            } else {
              bi.d(-var7 + param0 - -9, param2 - 15 - var7, var5 + -1, 0, 64);
              bi.d(7 + param0, -20 + param2, -1 + var6, 0, 128);
              bi.a(9 + param0 + -var7 << 901558244, -var7 + (param2 - 15) << -1458768700, var5 << -133018556, 250, dm.field_p);
              bi.a(param0 - -7 << -1225249756, -20 + param2 << 910197508, var6 << -294213340, 200, dm.field_r);
              break L1;
            }
          }
          return;
        }
    }

    final void g(int param0) {
        boolean discarded$6 = false;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        fn discarded$10 = null;
        fn discarded$11 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackOut_53_0 = null;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        L0: {
          var5 = ZombieDawn.field_J;
          this.field_Wb = this.field_Wb + 1;
          if (1 == this.field_F) {
            this.field_V = false;
            this.g((byte) 87);
            discarded$6 = this.h((byte) -91);
            this.field_V = true;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-11 != (this.field_F ^ -1)) {
            break L1;
          } else {
            if (0 == this.field_Wb % 2) {
              this.field_Sb = (1 + this.field_Sb) % 40;
              this.field_bc[this.field_Sb].a(-327680 + this.field_x, 20, this.field_y - 393216, 65);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (402 <= this.field_Wb) {
            var2 = 0;
            L3: while (true) {
              if (-41 >= (var2 ^ -1)) {
                break L2;
              } else {
                this.field_bc[var2].a(110);
                var2++;
                continue L3;
              }
            }
          } else {
            break L2;
          }
        }
        if (param0 >= 95) {
          L4: {
            var2 = 48;
            if (this.field_Wb < 200) {
              break L4;
            } else {
              if ((this.field_Wb ^ -1) != -201) {
                if (this.field_Wb == 250) {
                  this.e(1, -6904);
                  this.field_Y = var2 + this.a(true);
                  this.field_X = this.f(237239984);
                  this.c(0, 143360);
                  break L4;
                } else {
                  L5: {
                    if (-301 < (this.field_Wb ^ -1)) {
                      break L5;
                    } else {
                      if (this.field_Wb < 316) {
                        this.field_dc = this.field_dc + 1;
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if ((this.field_Wb ^ -1) > -350) {
                    L6: {
                      stackOut_53_0 = this;
                      stackIn_55_0 = stackOut_53_0;
                      stackIn_54_0 = stackOut_53_0;
                      if ((this.field_Wb ^ -1) >= -333) {
                        stackOut_55_0 = this;
                        stackOut_55_1 = 0;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        break L6;
                      } else {
                        stackOut_54_0 = this;
                        stackOut_54_1 = 1;
                        stackIn_56_0 = stackOut_54_0;
                        stackIn_56_1 = stackOut_54_1;
                        break L6;
                      }
                    }
                    ((dk) (this)).field_Ub = stackIn_56_1 != 0;
                    break L4;
                  } else {
                    if (-366 < (this.field_Wb ^ -1)) {
                      this.field_dc = this.field_dc - 1;
                      break L4;
                    } else {
                      if (365 == this.field_Wb) {
                        this.field_U = dc.a((byte) 18, 113);
                        this.e(1, -6904);
                        this.field_Y = -var2 + this.a(true);
                        this.field_X = this.f(237239984);
                        this.c(0, 143360);
                        break L4;
                      } else {
                        if ((this.field_Wb ^ -1) != -403) {
                          if (-15931 >= (this.field_Wb ^ -1)) {
                            if (-15931 == (this.field_Wb ^ -1)) {
                              this.e(0, -6904);
                              super.g(112);
                              break L4;
                            } else {
                              if (this.field_Wb == 15980) {
                                this.e(2, -6904);
                                super.g(112);
                                break L4;
                              } else {
                                if (-15981 > (this.field_Wb ^ -1)) {
                                  if (this.field_G >= 4) {
                                    fieldTemp$7 = this.field_Yb;
                                    this.field_Yb = this.field_Yb + 1;
                                    if (fieldTemp$7 < 2) {
                                      this.field_T = 0;
                                      this.field_O = 0;
                                      this.field_Y = this.a(true);
                                      this.field_X = this.f(237239984);
                                      this.field_G = 0;
                                      this.e(0, -6904);
                                      super.g(100);
                                      this.field_Wb = 15930;
                                      break L4;
                                    } else {
                                      this.field_y = this.field_y - 8192;
                                      var3 = 12288;
                                      this.field_Xb = this.field_Xb + var3;
                                      break L4;
                                    }
                                  } else {
                                    L7: {
                                      if (this.field_F != 10) {
                                        this.field_y = this.field_y - 12288;
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    super.g(125);
                                    fieldTemp$8 = this.field_N + 1;
                                    this.field_N = this.field_N + 1;
                                    if (fieldTemp$8 > 5) {
                                      this.field_N = 0;
                                      fieldTemp$9 = this.field_G + 1;
                                      this.field_G = this.field_G + 1;
                                      if (fieldTemp$9 >= 6) {
                                        this.field_G = 6;
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    } else {
                                      break L4;
                                    }
                                  }
                                } else {
                                  super.g(120);
                                  break L4;
                                }
                              }
                            }
                          } else {
                            super.g(109);
                            if (null == this.field_yb) {
                              break L4;
                            } else {
                              if (-11 != (this.field_F ^ -1)) {
                                break L4;
                              } else {
                                this.field_cc = 0;
                                var3 = Math.abs(this.field_yb.a(true) + -this.a(true));
                                var4 = Math.abs(this.field_yb.f(237239984) - this.f(237239984));
                                if (var4 / 2 < var3) {
                                  this.field_cc = this.field_cc + 1;
                                  if (this.field_yb.a(true) <= this.a(true)) {
                                    break L4;
                                  } else {
                                    this.field_cc = this.field_cc + 1;
                                    break L4;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        } else {
                          discarded$10 = kh.a(110, false);
                          discarded$11 = jp.a((byte) 127, 100);
                          this.e(0, -6904);
                          break L4;
                        }
                      }
                    }
                  }
                }
              } else {
                this.field_U = dc.a((byte) 18, 111);
                this.e(3, -6904);
                break L4;
              }
            }
          }
          return;
        } else {
          return;
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
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_16_0 = 0;
        vn stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        vn stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        vn stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        vn stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        vn stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        vn stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            if ((this.field_F ^ -1) != -21) {
              L1: {
                var3_int = param1.a(this.a(true), (byte) -102);
                var4 = param1.a(this.f(237239984), 0);
                var5 = 0;
                var6 = var4;
                if (param0 <= -76) {
                  break L1;
                } else {
                  this.q((byte) -95);
                  break L1;
                }
              }
              L2: {
                L3: {
                  var7_int = this.field_F;
                  if (var7_int == 0) {
                    break L3;
                  } else {
                    if (-2 != (var7_int ^ -1)) {
                      if (-4 != (var7_int ^ -1)) {
                        if ((var7_int ^ -1) == -11) {
                          var5 = 6 * this.field_cc + 6;
                          if (this.field_G == 1) {
                            var5++;
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          if (2 != var7_int) {
                            break L2;
                          } else {
                            var5 = 24;
                            var5 = var5 + this.field_G;
                            if ((var5 ^ -1) < -29) {
                              var5 = 28;
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                      } else {
                        var5 = 1;
                        break L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (this.field_Ub) {
                    stackOut_15_0 = this.field_cc * 6 + 6;
                    stackIn_16_0 = stackOut_15_0;
                    break L4;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_16_0 = stackOut_14_0;
                    break L4;
                  }
                }
                L5: {
                  var5 = stackIn_16_0;
                  if (365 <= this.field_Wb) {
                    var5 = var5 + this.field_Wb % 2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var6 = var6 + this.field_dc;
                break L2;
              }
              L6: {
                stackOut_27_0 = nb.field_k[1];
                stackOut_27_1 = -12;
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                if ((this.field_S ^ -1) != -4) {
                  stackOut_29_0 = (vn) ((Object) stackIn_29_0);
                  stackOut_29_1 = stackIn_29_1;
                  stackOut_29_2 = var3_int + -3;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  break L6;
                } else {
                  stackOut_28_0 = (vn) ((Object) stackIn_28_0);
                  stackOut_28_1 = stackIn_28_1;
                  stackOut_28_2 = var3_int + -2;
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  break L6;
                }
              }
              L7: {
                so.a(stackIn_30_0, stackIn_30_1 + stackIn_30_2, (this.field_Xb >> 458444592) + (var4 - 7));
                ld.field_l[this.field_t][var5].b(-24 + var3_int, var6 - 48);
                var7 = new int[]{0, -16, 16};
                if (this.field_Gb > 0) {
                  this.b(var3_int + -4 + var7[this.field_cc], (byte) -97, 15 + var6);
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (this.field_Wb < 402) {
                  break L8;
                } else {
                  var8 = 0;
                  L9: while (true) {
                    if (-41 >= (var8 ^ -1)) {
                      break L8;
                    } else {
                      this.field_bc[var8].a(param1, 8192);
                      var8++;
                      continue L9;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var3);
            stackOut_38_1 = new StringBuilder().append("dk.B(").append(param0).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L10;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L10;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        hp.field_A = (dk) (this);
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
