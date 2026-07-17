/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends nc {
    static ja field_n;
    static sc field_o;
    private int field_m;
    static String field_q;
    static int field_p;
    static String field_l;

    final void e(int param0) {
        ((ol) this).field_g.field_d = 2;
        ((ol) this).field_m = 0;
        if (param0 < 26) {
            ((ol) this).field_m = 114;
        }
    }

    ol(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        ((ol) this).field_m = 0;
    }

    final boolean c(int param0, int param1) {
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (param1 == 16777215) {
            break L0;
          } else {
            ((ol) this).field_m = -35;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param0 != 0) {
                break L3;
              } else {
                if (0 == ((ol) this).field_m) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 != 2) {
                break L4;
              } else {
                if (((ol) this).field_m == 6) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            stackOut_8_0 = 1;
            stackIn_10_0 = stackOut_8_0;
            break L1;
          }
          stackOut_9_0 = 0;
          stackIn_10_0 = stackOut_9_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    public static void c(byte param0) {
        field_n = null;
        field_l = null;
        field_q = null;
        field_o = null;
        int var1 = 11 % ((58 - param0) / 35);
    }

    final int d(int param0, int param1) {
        if (param0 > -65) {
            return -64;
        }
        return 180 + ((ol) this).a((byte) -118, param1);
    }

    final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (0 != ((ol) this).field_m) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (6 != ((ol) this).field_m) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          L3: {
            var3 = stackIn_6_0;
            if (var2 != 0) {
              break L3;
            } else {
              if (var3 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          L4: {
            if (sj.field_p == 96) {
              break L4;
            } else {
              if (97 != sj.field_p) {
                break L2;
              } else {
                break L4;
              }
            }
          }
          L5: {
            L6: {
              ((ol) this).field_g.a(1, false);
              if (var2 == 0) {
                break L6;
              } else {
                if (((ol) this).field_g.field_d != 0) {
                  break L6;
                } else {
                  ((ol) this).field_g.a(1, false);
                  break L5;
                }
              }
            }
            if (var3 == 0) {
              break L5;
            } else {
              if (((ol) this).field_g.field_d != 2) {
                break L5;
              } else {
                ((ol) this).field_g.a(1, false);
                break L5;
              }
            }
          }
          return;
        }
        ((ol) this).field_g.a(1, param0);
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        ((ol) this).field_m = ((ol) this).field_m + 1;
        if (param0 != 1) {
            ol.c((byte) 94);
        }
        if (!param1) {
            if (cp.field_S.length == ((ol) this).field_m) {
                var3 = sj.field_p;
                sj.field_p = 96;
                ((ol) this).field_g.a(1, false);
                sj.field_p = var3;
            }
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_3_0 = 0;
        ef stackIn_15_0 = null;
        String stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        ef stackIn_16_0 = null;
        String stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        ef stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_25_0 = 0;
        int stackIn_62_0 = 0;
        ef stackIn_62_1 = null;
        String stackIn_62_2 = null;
        int stackIn_63_0 = 0;
        ef stackIn_63_1 = null;
        String stackIn_63_2 = null;
        int stackIn_64_0 = 0;
        ef stackIn_64_1 = null;
        String stackIn_64_2 = null;
        int stackIn_64_3 = 0;
        int stackIn_65_0 = 0;
        ef stackIn_65_1 = null;
        String stackIn_65_2 = null;
        int stackIn_65_3 = 0;
        int stackIn_65_4 = 0;
        int stackIn_66_0 = 0;
        ef stackIn_66_1 = null;
        String stackIn_66_2 = null;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        int stackIn_67_0 = 0;
        ef stackIn_67_1 = null;
        String stackIn_67_2 = null;
        int stackIn_67_3 = 0;
        int stackIn_67_4 = 0;
        int stackIn_67_5 = 0;
        ja[] stackIn_72_0 = null;
        ja[] stackIn_73_0 = null;
        ja[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        ja[] stackOut_71_0 = null;
        ja[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        ja[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_61_0 = 0;
        ef stackOut_61_1 = null;
        String stackOut_61_2 = null;
        int stackOut_63_0 = 0;
        ef stackOut_63_1 = null;
        String stackOut_63_2 = null;
        int stackOut_63_3 = 0;
        int stackOut_62_0 = 0;
        ef stackOut_62_1 = null;
        String stackOut_62_2 = null;
        int stackOut_62_3 = 0;
        int stackOut_64_0 = 0;
        ef stackOut_64_1 = null;
        String stackOut_64_2 = null;
        int stackOut_64_3 = 0;
        int stackOut_64_4 = 0;
        int stackOut_66_0 = 0;
        ef stackOut_66_1 = null;
        String stackOut_66_2 = null;
        int stackOut_66_3 = 0;
        int stackOut_66_4 = 0;
        int stackOut_66_5 = 0;
        int stackOut_65_0 = 0;
        ef stackOut_65_1 = null;
        String stackOut_65_2 = null;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        int stackOut_65_5 = 0;
        ef stackOut_14_0 = null;
        String stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        ef stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        ef stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        L0: {
          var16 = ZombieDawnMulti.field_E ? 1 : 0;
          super.a(param0);
          var2 = 3 + (pb.field_e.field_C + pb.field_e.field_r);
          var3 = 600;
          var6 = 200;
          if (p.field_e != 1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          L2: {
            var7 = stackIn_3_0;
            var14 = ((ol) this).field_m;
            if (0 != var14) {
              if (var14 == 1) {
                L3: {
                  var10 = 30;
                  var9 = 155;
                  var2 -= 4;
                  ah.field_e.c(cp.field_J[1][0], 20, 135, 2, 0);
                  if (var7 == 0) {
                    stackOut_24_0 = 340;
                    stackIn_25_0 = stackOut_24_0;
                    break L3;
                  } else {
                    stackOut_23_0 = 400;
                    stackIn_25_0 = stackOut_23_0;
                    break L3;
                  }
                }
                var8 = stackIn_25_0;
                md.field_N[1].g(-50 + var6, -8 + var9);
                var9 = var9 + (var10 + var2 * pb.field_e.a(cp.field_S[1][0], var6, var9, var8, 50, 16777215, 0, 0, 0, var2));
                var11 = var6 - 95;
                var12 = -20 + var9;
                var9 = var9 + (pb.field_e.a(cp.field_S[1][1], var6, var9, var8, 50, 16777215, 0, 0, 0, var2) * var2 + var10);
                pp.field_q[3].a(-31 + var6, 3 + var9);
                md.field_N[3].g(var6 - 20, var9 - -15);
                var9 = var9 + (var2 * pb.field_e.a(cp.field_S[1][2], var6, var9, var8, 50, 16777215, 0, 0, 0, var2) + var10);
                md.field_N[5].g(-46 + var6, 2 + var9);
                var9 = var9 + (var2 * pb.field_e.a(cp.field_S[1][3], var6, var9, var8, 50, 16777215, 0, 0, 0, var2) + var10);
                md.field_N[6].g(-60 + var6, var9 - 20);
                var9 = var9 + (var2 * pb.field_e.a(cp.field_S[1][4], var6, var9, var8, 50, 16777215, 0, 0, 0, var2) + var10);
                md.field_N[0].g(var11, var12);
                ig.field_d[0].c(var11 + -8, var12 - 4, 128);
                ig.field_d[0].c(var11 + 13, var12 - -14, 128);
                ig.field_d[0].c(var11 + 41, var12 + 11, 128);
                oo.a(var11 + 3, 14 + var12, 77, 47, 16777215);
                oo.h(4 + var11, 15 + var12, 75, 45, 10066431, 32);
                oo.f(5 + var11, var12 + 16, 73, 43, 3355647, 32);
                break L2;
              } else {
                if (var14 == 2) {
                  var9 = 175;
                  var2 -= 4;
                  var10 = 35;
                  ah.field_e.c(cp.field_J[2][0], 20, 135, 2, 0);
                  pp.field_q[8].a(var6 + -36, var9 + 4);
                  md.field_N[3].g(-25 + var6, var9 - -15);
                  var9 = var9 + (var10 - -(var2 * pb.field_e.a(cp.field_S[2][0], var6, var9, 340, 50, 16777215, 0, 0, 0, var2)));
                  md.field_N[4].g(var6 + -110, -10 + var9);
                  ig.field_d[0].c(-54 + var6, -3 + var9, 128);
                  md.field_N[3].g(var6 + -25, 30 + var9);
                  var9 = var9 + (var10 + var2 * pb.field_e.a(cp.field_S[2][1], var6, var9, 340, 50, 16777215, 0, 0, 0, var2));
                  md.field_N[7].g(var6 - 63, 10 + var9);
                  var9 = var9 + (var2 * pb.field_e.a(cp.field_S[2][2], var6, var9, 340, 50, 16777215, 0, 0, 0, var2) + var10);
                  md.field_N[9].g(var6 + -94, var9 + 10);
                  var9 = var9 + (var10 + var2 * pb.field_e.a(cp.field_S[2][3], var6, var9, 340, 50, 16777215, 0, 0, 0, var2));
                  break L2;
                } else {
                  if (var14 == 3) {
                    ah.field_e.c(cp.field_J[3][0], 20, 135, 2, 0);
                    rb.field_e[0].g(18, 148);
                    rb.field_e[1].g(8, 235);
                    ah.field_e.c("1/5", 100, 202, 2, -1);
                    ah.field_e.c("2:15", 85, 365, 0, -1);
                    var4 = pb.field_e.a(cp.field_S[3][0], 165, 170, var3 - 150, 440, 16777215, 0, 0, 0, -2 + var2);
                    break L2;
                  } else {
                    if (4 == var14) {
                      ah.field_e.c(cp.field_J[4][0], 20, 135, 2, 0);
                      var13 = var2 + -4;
                      var4 = pb.field_e.a(cp.field_S[4][0], 20, 155, var3, 440, 16777215, 0, 0, 0, var13);
                      var5 = 135 + (var13 * var4 - -39);
                      var14 = 0;
                      L4: while (true) {
                        if (5 <= var14) {
                          break L2;
                        } else {
                          L5: {
                            var15 = -1;
                            if (0 == var14) {
                              var15 = 3;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            if (1 != var14) {
                              break L6;
                            } else {
                              var15 = 0;
                              break L6;
                            }
                          }
                          L7: {
                            if (var14 == 2) {
                              var15 = 1;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L8: {
                            if (var14 == 3) {
                              var15 = 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if (var14 != 3) {
                              break L9;
                            } else {
                              var15 = 8;
                              break L9;
                            }
                          }
                          L10: {
                            if (-1 == var15) {
                              break L10;
                            } else {
                              wa.field_b[var15].g(20, var5 + 2);
                              break L10;
                            }
                          }
                          var5 = var5 + (pb.field_e.a(cp.field_I[var14], 60, var5, -40 + var3, 400, 16777215, 0, 0, 0, var13) * var13 + 15);
                          var14++;
                          continue L4;
                        }
                      }
                    } else {
                      if (5 != var14) {
                        if (6 == var14) {
                          ah.field_e.c(cp.field_J[6][0], 20, 135, 2, 0);
                          int discarded$2 = pb.field_e.a(cp.field_S[5][0], 20, 155, 600, 440, 16777215, 0, 0, 0, var2);
                          break L2;
                        } else {
                          if (7 == var14) {
                            var5 = 155;
                            ah.field_e.c(cp.field_J[7][0], 20, 135, 2, 0);
                            var14 = 0;
                            L11: while (true) {
                              if (2 <= var14) {
                                break L2;
                              } else {
                                L12: {
                                  stackOut_71_0 = ch.field_b;
                                  stackIn_73_0 = stackOut_71_0;
                                  stackIn_72_0 = stackOut_71_0;
                                  if (var14 == 0) {
                                    stackOut_73_0 = (ja[]) (Object) stackIn_73_0;
                                    stackOut_73_1 = 0;
                                    stackIn_74_0 = stackOut_73_0;
                                    stackIn_74_1 = stackOut_73_1;
                                    break L12;
                                  } else {
                                    stackOut_72_0 = (ja[]) (Object) stackIn_72_0;
                                    stackOut_72_1 = 3;
                                    stackIn_74_0 = stackOut_72_0;
                                    stackIn_74_1 = stackOut_72_1;
                                    break L12;
                                  }
                                }
                                ((ja) (Object) stackIn_74_0[stackIn_74_1]).g(28, -8 + var5);
                                var5 = var5 + (var2 * pb.field_e.a(bh.field_b[var14], 100, var5, var3 - 80, 400, 16777215, 0, 0, 0, var2) + 20);
                                var14++;
                                continue L11;
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        var5 = 154;
                        ah.field_e.c(cp.field_J[5][0], 20, 135, 2, 0);
                        var14 = 0;
                        L13: while (true) {
                          if (~var14 <= ~cp.field_Q.length) {
                            break L2;
                          } else {
                            L14: {
                              var15 = -1;
                              if (1 == var14) {
                                var15 = 43;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            L15: {
                              if (2 != var14) {
                                break L15;
                              } else {
                                var15 = 41;
                                break L15;
                              }
                            }
                            L16: {
                              if (var14 == 3) {
                                var15 = 40;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            L17: {
                              if (var14 == 4) {
                                var15 = 35;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            L18: {
                              if (var15 == -1) {
                                break L18;
                              } else {
                                wa.field_b[var15].g(20, var5 + 2);
                                break L18;
                              }
                            }
                            L19: {
                              stackOut_61_0 = var5;
                              stackOut_61_1 = pb.field_e;
                              stackOut_61_2 = cp.field_Q[var14];
                              stackIn_63_0 = stackOut_61_0;
                              stackIn_63_1 = stackOut_61_1;
                              stackIn_63_2 = stackOut_61_2;
                              stackIn_62_0 = stackOut_61_0;
                              stackIn_62_1 = stackOut_61_1;
                              stackIn_62_2 = stackOut_61_2;
                              if (0 == var14) {
                                stackOut_63_0 = stackIn_63_0;
                                stackOut_63_1 = (ef) (Object) stackIn_63_1;
                                stackOut_63_2 = (String) (Object) stackIn_63_2;
                                stackOut_63_3 = 20;
                                stackIn_64_0 = stackOut_63_0;
                                stackIn_64_1 = stackOut_63_1;
                                stackIn_64_2 = stackOut_63_2;
                                stackIn_64_3 = stackOut_63_3;
                                break L19;
                              } else {
                                stackOut_62_0 = stackIn_62_0;
                                stackOut_62_1 = (ef) (Object) stackIn_62_1;
                                stackOut_62_2 = (String) (Object) stackIn_62_2;
                                stackOut_62_3 = 60;
                                stackIn_64_0 = stackOut_62_0;
                                stackIn_64_1 = stackOut_62_1;
                                stackIn_64_2 = stackOut_62_2;
                                stackIn_64_3 = stackOut_62_3;
                                break L19;
                              }
                            }
                            L20: {
                              stackOut_64_0 = stackIn_64_0;
                              stackOut_64_1 = (ef) (Object) stackIn_64_1;
                              stackOut_64_2 = (String) (Object) stackIn_64_2;
                              stackOut_64_3 = stackIn_64_3;
                              stackOut_64_4 = var5;
                              stackIn_66_0 = stackOut_64_0;
                              stackIn_66_1 = stackOut_64_1;
                              stackIn_66_2 = stackOut_64_2;
                              stackIn_66_3 = stackOut_64_3;
                              stackIn_66_4 = stackOut_64_4;
                              stackIn_65_0 = stackOut_64_0;
                              stackIn_65_1 = stackOut_64_1;
                              stackIn_65_2 = stackOut_64_2;
                              stackIn_65_3 = stackOut_64_3;
                              stackIn_65_4 = stackOut_64_4;
                              if (var14 != 0) {
                                stackOut_66_0 = stackIn_66_0;
                                stackOut_66_1 = (ef) (Object) stackIn_66_1;
                                stackOut_66_2 = (String) (Object) stackIn_66_2;
                                stackOut_66_3 = stackIn_66_3;
                                stackOut_66_4 = stackIn_66_4;
                                stackOut_66_5 = -40 + var3;
                                stackIn_67_0 = stackOut_66_0;
                                stackIn_67_1 = stackOut_66_1;
                                stackIn_67_2 = stackOut_66_2;
                                stackIn_67_3 = stackOut_66_3;
                                stackIn_67_4 = stackOut_66_4;
                                stackIn_67_5 = stackOut_66_5;
                                break L20;
                              } else {
                                stackOut_65_0 = stackIn_65_0;
                                stackOut_65_1 = (ef) (Object) stackIn_65_1;
                                stackOut_65_2 = (String) (Object) stackIn_65_2;
                                stackOut_65_3 = stackIn_65_3;
                                stackOut_65_4 = stackIn_65_4;
                                stackOut_65_5 = var3;
                                stackIn_67_0 = stackOut_65_0;
                                stackIn_67_1 = stackOut_65_1;
                                stackIn_67_2 = stackOut_65_2;
                                stackIn_67_3 = stackOut_65_3;
                                stackIn_67_4 = stackOut_65_4;
                                stackIn_67_5 = stackOut_65_5;
                                break L20;
                              }
                            }
                            var5 = stackIn_67_0 + (((ef) (Object) stackIn_67_1).a(stackIn_67_2, stackIn_67_3, stackIn_67_4, stackIn_67_5, 400, 16777215, 0, 0, 0, var2) * var2 + 15);
                            var14++;
                            continue L13;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              L21: {
                ah.field_e.c(cp.field_J[0][0], 20, 135, 2, 0);
                stackOut_14_0 = pb.field_e;
                stackOut_14_1 = cp.field_S[0][0];
                stackOut_14_2 = 20;
                stackOut_14_3 = 155;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_16_2 = stackOut_14_2;
                stackIn_16_3 = stackOut_14_3;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                stackIn_15_2 = stackOut_14_2;
                stackIn_15_3 = stackOut_14_3;
                if (var7 != 0) {
                  stackOut_16_0 = (ef) (Object) stackIn_16_0;
                  stackOut_16_1 = (String) (Object) stackIn_16_1;
                  stackOut_16_2 = stackIn_16_2;
                  stackOut_16_3 = stackIn_16_3;
                  stackOut_16_4 = var3;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  stackIn_17_3 = stackOut_16_3;
                  stackIn_17_4 = stackOut_16_4;
                  break L21;
                } else {
                  stackOut_15_0 = (ef) (Object) stackIn_15_0;
                  stackOut_15_1 = (String) (Object) stackIn_15_1;
                  stackOut_15_2 = stackIn_15_2;
                  stackOut_15_3 = stackIn_15_3;
                  stackOut_15_4 = var3 + -70;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_17_3 = stackOut_15_3;
                  stackIn_17_4 = stackOut_15_4;
                  break L21;
                }
              }
              L22: {
                var4 = ((ef) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, 440, 16777215, 0, 0, 0, var2);
                var5 = var2 * var4;
                if (var7 == 0) {
                  break L22;
                } else {
                  var5 -= 20;
                  break L22;
                }
              }
              ah.field_e.c(cp.field_J[0][1], 20, 210 + var5, 2, 0);
              int discarded$3 = pb.field_e.a(cp.field_S[0][1], 20, 230 + var5, var3, 440, 16777215, 0, 0, 0, var2);
              if (var7 == 0) {
                tf.field_Hb[0].g(530, 150);
                tf.field_Hb[1].g(230, 242);
                break L2;
              } else {
                pb.field_e.a(fa.a(120, 1 + cp.field_S.length, 1 + ((ol) this).field_m), 620, 410, 16777215, 0);
                break L1;
              }
            }
          }
          pb.field_e.a(fa.a(120, 1 + cp.field_S.length, 1 + ((ol) this).field_m), 620, 410, 16777215, 0);
          break L1;
        }
    }

    final void a(boolean param0, byte param1) {
        int var3 = 0;
        ((ol) this).field_m = ((ol) this).field_m - 1;
        if (!param0) {
            if (!(((ol) this).field_m != 0)) {
                var3 = sj.field_p;
                sj.field_p = 97;
                ((ol) this).field_g.a(1, false);
                sj.field_p = var3;
            }
        }
        if (param1 > -110) {
            ((ol) this).a(false, (byte) -86);
        }
    }

    final static boolean a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= param0.length()) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L2: {
                  var3 = param0.charAt(var2_int);
                  if (hd.a(-24315, (char) var3)) {
                    break L2;
                  } else {
                    int discarded$9 = 85;
                    if (!vh.a((char) var3)) {
                      stackOut_6_0 = 1;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("ol.JA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 0 + 41);
        }
        return stackIn_10_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
