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
          var4 = 2 + ((dk) this).field_Gb;
          if (param1 <= -91) {
            break L0;
          } else {
            field_Vb = null;
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
            if ((((dk) this).field_cc ^ -1) != -3) {
              if ((((dk) this).field_cc ^ -1) == -2) {
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
          ((dk) this).field_Wb = ((dk) this).field_Wb + 1;
          if (1 == ((dk) this).field_F) {
            ((dk) this).field_V = false;
            ((dk) this).g((byte) 87);
            boolean discarded$6 = ((dk) this).h((byte) -91);
            ((dk) this).field_V = true;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-11 != (((dk) this).field_F ^ -1)) {
            break L1;
          } else {
            if (0 == ((dk) this).field_Wb % 2) {
              ((dk) this).field_Sb = (1 + ((dk) this).field_Sb) % 40;
              ((dk) this).field_bc[((dk) this).field_Sb].a(-327680 + ((dk) this).field_x, 20, ((dk) this).field_y - 393216, 65);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (402 <= ((dk) this).field_Wb) {
            var2 = 0;
            L3: while (true) {
              if (-41 >= (var2 ^ -1)) {
                break L2;
              } else {
                ((dk) this).field_bc[var2].a(110);
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
            if (((dk) this).field_Wb < 200) {
              break L4;
            } else {
              if ((((dk) this).field_Wb ^ -1) != -201) {
                if (((dk) this).field_Wb == 250) {
                  ((dk) this).e(1, -6904);
                  ((dk) this).field_Y = var2 + ((dk) this).a(true);
                  ((dk) this).field_X = ((dk) this).f(237239984);
                  ((dk) this).c(0, 143360);
                  break L4;
                } else {
                  L5: {
                    if (-301 < (((dk) this).field_Wb ^ -1)) {
                      break L5;
                    } else {
                      if (((dk) this).field_Wb < 316) {
                        ((dk) this).field_dc = ((dk) this).field_dc + 1;
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if ((((dk) this).field_Wb ^ -1) > -350) {
                    L6: {
                      stackOut_53_0 = this;
                      stackIn_55_0 = stackOut_53_0;
                      stackIn_54_0 = stackOut_53_0;
                      if ((((dk) this).field_Wb ^ -1) >= -333) {
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
                    ((dk) this).field_Ub = stackIn_56_1 != 0;
                    break L4;
                  } else {
                    if (-366 < (((dk) this).field_Wb ^ -1)) {
                      ((dk) this).field_dc = ((dk) this).field_dc - 1;
                      break L4;
                    } else {
                      if (365 == ((dk) this).field_Wb) {
                        ((dk) this).field_U = dc.a((byte) 18, 113);
                        ((dk) this).e(1, -6904);
                        ((dk) this).field_Y = -var2 + ((dk) this).a(true);
                        ((dk) this).field_X = ((dk) this).f(237239984);
                        ((dk) this).c(0, 143360);
                        break L4;
                      } else {
                        if ((((dk) this).field_Wb ^ -1) != -403) {
                          if (-15931 >= (((dk) this).field_Wb ^ -1)) {
                            if (-15931 == (((dk) this).field_Wb ^ -1)) {
                              ((dk) this).e(0, -6904);
                              super.g(112);
                              break L4;
                            } else {
                              if (((dk) this).field_Wb == 15980) {
                                ((dk) this).e(2, -6904);
                                super.g(112);
                                break L4;
                              } else {
                                if (-15981 > (((dk) this).field_Wb ^ -1)) {
                                  if (((dk) this).field_G >= 4) {
                                    int fieldTemp$7 = ((dk) this).field_Yb;
                                    ((dk) this).field_Yb = ((dk) this).field_Yb + 1;
                                    if (fieldTemp$7 < 2) {
                                      ((dk) this).field_T = 0;
                                      ((dk) this).field_O = 0;
                                      ((dk) this).field_Y = ((dk) this).a(true);
                                      ((dk) this).field_X = ((dk) this).f(237239984);
                                      ((dk) this).field_G = 0;
                                      ((dk) this).e(0, -6904);
                                      super.g(100);
                                      ((dk) this).field_Wb = 15930;
                                      break L4;
                                    } else {
                                      ((dk) this).field_y = ((dk) this).field_y - 8192;
                                      var3 = 12288;
                                      ((dk) this).field_Xb = ((dk) this).field_Xb + var3;
                                      break L4;
                                    }
                                  } else {
                                    L7: {
                                      if (((dk) this).field_F != 10) {
                                        ((dk) this).field_y = ((dk) this).field_y - 12288;
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    super.g(125);
                                    int fieldTemp$8 = ((dk) this).field_N + 1;
                                    ((dk) this).field_N = ((dk) this).field_N + 1;
                                    if (fieldTemp$8 > 5) {
                                      ((dk) this).field_N = 0;
                                      int fieldTemp$9 = ((dk) this).field_G + 1;
                                      ((dk) this).field_G = ((dk) this).field_G + 1;
                                      if (fieldTemp$9 >= 6) {
                                        ((dk) this).field_G = 6;
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
                            if (null == ((dk) this).field_yb) {
                              break L4;
                            } else {
                              if (-11 != (((dk) this).field_F ^ -1)) {
                                break L4;
                              } else {
                                ((dk) this).field_cc = 0;
                                var3 = Math.abs(((dk) this).field_yb.a(true) + -((dk) this).a(true));
                                var4 = Math.abs(((dk) this).field_yb.f(237239984) - ((dk) this).f(237239984));
                                if (var4 / 2 < var3) {
                                  ((dk) this).field_cc = ((dk) this).field_cc + 1;
                                  if (((dk) this).field_yb.a(true) <= ((dk) this).a(true)) {
                                    break L4;
                                  } else {
                                    ((dk) this).field_cc = ((dk) this).field_cc + 1;
                                    break L4;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        } else {
                          fn discarded$10 = kh.a(110, false);
                          fn discarded$11 = jp.a((byte) 127, 100);
                          ((dk) this).e(0, -6904);
                          break L4;
                        }
                      }
                    }
                  }
                }
              } else {
                ((dk) this).field_U = dc.a((byte) 18, 111);
                ((dk) this).e(3, -6904);
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
        ((dk) this).field_Xb = ((dk) this).field_Xb + 2621440;
        if (param0 >= -31) {
            ((dk) this).r((byte) 103);
        }
        ((dk) this).field_x = ((dk) this).field_x - 2621440;
    }

    public static void p(byte param0) {
        if (param0 < 64) {
            field_Tb = null;
        }
        field_Vb = null;
        field_Zb = null;
        field_Tb = null;
    }

    final void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_15_0 = 0;
        vn stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        vn stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        vn stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        vn stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        vn stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        vn stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        var9 = ZombieDawn.field_J;
        if ((((dk) this).field_F ^ -1) != -21) {
          L0: {
            var3 = param1.a(((dk) this).a(true), (byte) -102);
            var4 = param1.a(((dk) this).f(237239984), 0);
            var5 = 0;
            var6 = var4;
            if (param0 <= -76) {
              break L0;
            } else {
              ((dk) this).q((byte) -95);
              break L0;
            }
          }
          L1: {
            L2: {
              var7_int = ((dk) this).field_F;
              if ((var7_int ^ -1) == -1) {
                break L2;
              } else {
                if (-2 != (var7_int ^ -1)) {
                  if (-4 != (var7_int ^ -1)) {
                    if ((var7_int ^ -1) == -11) {
                      var5 = 6 * ((dk) this).field_cc + 6;
                      if (((dk) this).field_G == 1) {
                        var5++;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      if (2 != var7_int) {
                        break L1;
                      } else {
                        var5 = 24;
                        var5 = var5 + ((dk) this).field_G;
                        if ((var5 ^ -1) < -29) {
                          var5 = 28;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    var5 = 1;
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((dk) this).field_Ub) {
                stackOut_14_0 = ((dk) this).field_cc * 6 + 6;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              } else {
                stackOut_13_0 = 0;
                stackIn_15_0 = stackOut_13_0;
                break L3;
              }
            }
            L4: {
              var5 = stackIn_15_0;
              if (365 <= ((dk) this).field_Wb) {
                var5 = var5 + ((dk) this).field_Wb % 2;
                break L4;
              } else {
                break L4;
              }
            }
            var6 = var6 + ((dk) this).field_dc;
            break L1;
          }
          L5: {
            stackOut_26_0 = nb.field_k[1];
            stackOut_26_1 = -12;
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if ((((dk) this).field_S ^ -1) != -4) {
              stackOut_28_0 = (vn) (Object) stackIn_28_0;
              stackOut_28_1 = stackIn_28_1;
              stackOut_28_2 = var3 + -3;
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = (vn) (Object) stackIn_27_0;
              stackOut_27_1 = stackIn_27_1;
              stackOut_27_2 = var3 + -2;
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          L6: {
            so.a(stackIn_29_0, stackIn_29_1 + stackIn_29_2, (((dk) this).field_Xb >> 458444592) + (var4 - 7));
            ld.field_l[((dk) this).field_t][var5].b(-24 + var3, var6 - 48);
            var7 = new int[]{0, -16, 16};
            if (((dk) this).field_Gb > 0) {
              ((dk) this).b(var3 + -4 + var7[((dk) this).field_cc], (byte) -97, 15 + var6);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (((dk) this).field_Wb < 402) {
              break L7;
            } else {
              var8 = 0;
              L8: while (true) {
                if (-41 >= (var8 ^ -1)) {
                  break L7;
                } else {
                  ((dk) this).field_bc[var8].a(param1, 8192);
                  var8++;
                  continue L8;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void q(byte param0) {
        if (param0 < 89) {
            ((dk) this).b(-1, (byte) -3, 12);
        }
        ((dk) this).field_Wb = 15930;
        ((dk) this).g(124);
    }

    dk(int param0, int param1) {
        super(param0, param1, 27);
        int var3 = 0;
        ((dk) this).field_Sb = 0;
        ((dk) this).field_bc = new a[40];
        ((dk) this).field_Sb = 0;
        ((dk) this).field_G = 0;
        ((dk) this).field_Yb = 0;
        ((dk) this).field_F = 0;
        ((dk) this).field_Wb = 0;
        ((dk) this).field_V = true;
        ((dk) this).field_dc = 0;
        ((dk) this).field_cc = 2;
        ((dk) this).field_Xb = 0;
        ((dk) this).field_Ub = false;
        hp.field_A = (dk) this;
        for (var3 = 0; var3 < 40; var3++) {
            ((dk) this).field_bc[var3] = new a();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ac = false;
        field_Zb = "<%0>: <%1>";
        field_Tb = new int[9][][];
        field_Tb[1] = new int[11][];
        field_Tb[5] = new int[1][];
        field_Tb[7] = new int[19][];
        field_Tb[3] = new int[6][];
        field_Tb[4] = new int[8][];
        field_Tb[8] = new int[19][];
        field_Tb[0] = new int[21][];
        field_Tb[2] = new int[1][];
        field_Tb[6] = new int[21][];
        field_Vb = "Email (Login):";
    }
}
