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
        this.field_g.field_d = 2;
        this.field_m = 0;
        if (param0 < 26) {
            this.field_m = 114;
        }
    }

    ol(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        this.field_m = 0;
    }

    final boolean c(int param0, int param1) {
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (param1 == 16777215) {
            break L0;
          } else {
            this.field_m = -35;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param0 != 0) {
                break L3;
              } else {
                if (0 == this.field_m) {
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
                if (this.field_m == 6) {
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
        return 180 + this.a((byte) -118, param1);
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
          if (0 != this.field_m) {
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
          if (6 != this.field_m) {
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
          var3 = stackIn_6_0;
          if (var2 != 0) {
            break L2;
          } else {
            if (var3 != 0) {
              break L2;
            } else {
              this.field_g.a(1, param0);
              return;
            }
          }
        }
        if (-97 != (sj.field_p ^ -1)) {
          if (97 == sj.field_p) {
            L3: {
              this.field_g.a(1, false);
              if (var2 != 0) {
                if (-1 == (this.field_g.field_d ^ -1)) {
                  this.field_g.a(1, false);
                  if (!ZombieDawnMulti.field_E) {
                    break L3;
                  } else {
                    if (var3 == 0) {
                      break L3;
                    } else {
                      if ((this.field_g.field_d ^ -1) != -3) {
                        break L3;
                      } else {
                        this.field_g.a(1, false);
                        break L3;
                      }
                    }
                  }
                } else {
                  if (var3 == 0) {
                    break L3;
                  } else {
                    if ((this.field_g.field_d ^ -1) != -3) {
                      break L3;
                    } else {
                      this.field_g.a(1, false);
                      break L3;
                    }
                  }
                }
              } else {
                if (var3 == 0) {
                  break L3;
                } else {
                  if ((this.field_g.field_d ^ -1) != -3) {
                    break L3;
                  } else {
                    this.field_g.a(1, false);
                    break L3;
                  }
                }
              }
            }
            return;
          } else {
            this.field_g.a(1, param0);
            return;
          }
        } else {
          L4: {
            this.field_g.a(1, false);
            if (var2 != 0) {
              if (-1 == (this.field_g.field_d ^ -1)) {
                this.field_g.a(1, false);
                if (!ZombieDawnMulti.field_E) {
                  break L4;
                } else {
                  if (var3 == 0) {
                    break L4;
                  } else {
                    if ((this.field_g.field_d ^ -1) != -3) {
                      break L4;
                    } else {
                      this.field_g.a(1, false);
                      break L4;
                    }
                  }
                }
              } else {
                if (var3 == 0) {
                  break L4;
                } else {
                  if ((this.field_g.field_d ^ -1) != -3) {
                    break L4;
                  } else {
                    this.field_g.a(1, false);
                    break L4;
                  }
                }
              }
            } else {
              if (var3 == 0) {
                break L4;
              } else {
                if ((this.field_g.field_d ^ -1) != -3) {
                  break L4;
                } else {
                  this.field_g.a(1, false);
                  break L4;
                }
              }
            }
          }
          return;
        }
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        this.field_m = this.field_m + 1;
        if (param0 != 1) {
            ol.c((byte) 94);
        }
        if (!param1) {
            if (cp.field_S.length == this.field_m) {
                var3 = sj.field_p;
                sj.field_p = 96;
                this.field_g.a(1, false);
                sj.field_p = var3;
            }
        }
    }

    final void a(boolean param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
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
        ef stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        ef stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        ef stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        int stackIn_27_0 = 0;
        int stackIn_67_0 = 0;
        ef stackIn_67_1 = null;
        String stackIn_67_2 = null;
        int stackIn_68_0 = 0;
        ef stackIn_68_1 = null;
        String stackIn_68_2 = null;
        int stackIn_69_0 = 0;
        ef stackIn_69_1 = null;
        String stackIn_69_2 = null;
        int stackIn_69_3 = 0;
        int stackIn_70_0 = 0;
        ef stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int stackIn_70_3 = 0;
        int stackIn_70_4 = 0;
        int stackIn_71_0 = 0;
        ef stackIn_71_1 = null;
        String stackIn_71_2 = null;
        int stackIn_71_3 = 0;
        int stackIn_71_4 = 0;
        int stackIn_72_0 = 0;
        ef stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int stackIn_72_3 = 0;
        int stackIn_72_4 = 0;
        int stackIn_72_5 = 0;
        ja[] stackIn_80_0 = null;
        ja[] stackIn_81_0 = null;
        ja[] stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        ef stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        ef stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        ef stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_66_0 = 0;
        ef stackOut_66_1 = null;
        String stackOut_66_2 = null;
        int stackOut_68_0 = 0;
        ef stackOut_68_1 = null;
        String stackOut_68_2 = null;
        int stackOut_68_3 = 0;
        int stackOut_67_0 = 0;
        ef stackOut_67_1 = null;
        String stackOut_67_2 = null;
        int stackOut_67_3 = 0;
        int stackOut_69_0 = 0;
        ef stackOut_69_1 = null;
        String stackOut_69_2 = null;
        int stackOut_69_3 = 0;
        int stackOut_69_4 = 0;
        int stackOut_71_0 = 0;
        ef stackOut_71_1 = null;
        String stackOut_71_2 = null;
        int stackOut_71_3 = 0;
        int stackOut_71_4 = 0;
        int stackOut_71_5 = 0;
        int stackOut_70_0 = 0;
        ef stackOut_70_1 = null;
        String stackOut_70_2 = null;
        int stackOut_70_3 = 0;
        int stackOut_70_4 = 0;
        int stackOut_70_5 = 0;
        ja[] stackOut_79_0 = null;
        ja[] stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        ja[] stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        L0: {
          var16 = ZombieDawnMulti.field_E ? 1 : 0;
          super.a(param0);
          var2 = 3 + (pb.field_e.field_C + pb.field_e.field_r);
          var3 = 600;
          var6 = 200;
          if (-2 != (p.field_e ^ -1)) {
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
            L3: {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      L8: {
                        L9: {
                          L10: {
                            var7 = stackIn_3_0;
                            var14 = this.field_m;
                            if (0 != var14) {
                              break L10;
                            } else {
                              if (var16 == 0) {
                                L11: {
                                  ah.field_e.c(cp.field_J[0][0], 20, 135, 2, 0);
                                  stackOut_16_0 = pb.field_e;
                                  stackOut_16_1 = cp.field_S[0][0];
                                  stackOut_16_2 = 20;
                                  stackOut_16_3 = 155;
                                  stackIn_18_0 = stackOut_16_0;
                                  stackIn_18_1 = stackOut_16_1;
                                  stackIn_18_2 = stackOut_16_2;
                                  stackIn_18_3 = stackOut_16_3;
                                  stackIn_17_0 = stackOut_16_0;
                                  stackIn_17_1 = stackOut_16_1;
                                  stackIn_17_2 = stackOut_16_2;
                                  stackIn_17_3 = stackOut_16_3;
                                  if (var7 != 0) {
                                    stackOut_18_0 = (ef) ((Object) stackIn_18_0);
                                    stackOut_18_1 = (String) ((Object) stackIn_18_1);
                                    stackOut_18_2 = stackIn_18_2;
                                    stackOut_18_3 = stackIn_18_3;
                                    stackOut_18_4 = var3;
                                    stackIn_19_0 = stackOut_18_0;
                                    stackIn_19_1 = stackOut_18_1;
                                    stackIn_19_2 = stackOut_18_2;
                                    stackIn_19_3 = stackOut_18_3;
                                    stackIn_19_4 = stackOut_18_4;
                                    break L11;
                                  } else {
                                    stackOut_17_0 = (ef) ((Object) stackIn_17_0);
                                    stackOut_17_1 = (String) ((Object) stackIn_17_1);
                                    stackOut_17_2 = stackIn_17_2;
                                    stackOut_17_3 = stackIn_17_3;
                                    stackOut_17_4 = var3 + -70;
                                    stackIn_19_0 = stackOut_17_0;
                                    stackIn_19_1 = stackOut_17_1;
                                    stackIn_19_2 = stackOut_17_2;
                                    stackIn_19_3 = stackOut_17_3;
                                    stackIn_19_4 = stackOut_17_4;
                                    break L11;
                                  }
                                }
                                L12: {
                                  var4 = ((ef) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_19_2, stackIn_19_3, stackIn_19_4, 440, 16777215, 0, 0, 0, var2);
                                  var5 = var2 * var4;
                                  if (var7 == 0) {
                                    break L12;
                                  } else {
                                    var5 -= 20;
                                    break L12;
                                  }
                                }
                                ah.field_e.c(cp.field_J[0][1], 20, 210 + var5, 2, 0);
                                discarded$2 = pb.field_e.a(cp.field_S[0][1], 20, 230 + var5, var3, 440, 16777215, 0, 0, 0, var2);
                                if (var7 == 0) {
                                  tf.field_Hb[0].g(530, 150);
                                  tf.field_Hb[1].g(230, 242);
                                  if (var16 == 0) {
                                    break L2;
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  pb.field_e.a(fa.a(120, 1 + cp.field_S.length, 1 + this.field_m), 620, 410, 16777215, 0);
                                  break L1;
                                }
                              } else {
                                break L10;
                              }
                            }
                          }
                          if (-2 == (var14 ^ -1)) {
                            break L9;
                          } else {
                            if ((var14 ^ -1) == -3) {
                              break L8;
                            } else {
                              if ((var14 ^ -1) == -4) {
                                break L7;
                              } else {
                                if (4 == var14) {
                                  break L6;
                                } else {
                                  L13: {
                                    if (5 != var14) {
                                      break L13;
                                    } else {
                                      if (var16 == 0) {
                                        break L5;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  if (6 == var14) {
                                    break L4;
                                  } else {
                                    if (7 == var14) {
                                      break L3;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L14: {
                          var10 = 30;
                          var9 = 155;
                          var2 -= 4;
                          ah.field_e.c(cp.field_J[1][0], 20, 135, 2, 0);
                          if (var7 == 0) {
                            stackOut_26_0 = 340;
                            stackIn_27_0 = stackOut_26_0;
                            break L14;
                          } else {
                            stackOut_25_0 = 400;
                            stackIn_27_0 = stackOut_25_0;
                            break L14;
                          }
                        }
                        var8 = stackIn_27_0;
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
                        if (var16 == 0) {
                          break L2;
                        } else {
                          break L8;
                        }
                      }
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
                      if (var16 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                    ah.field_e.c(cp.field_J[3][0], 20, 135, 2, 0);
                    rb.field_e[0].g(18, 148);
                    rb.field_e[1].g(8, 235);
                    ah.field_e.c("1/5", 100, 202, 2, -1);
                    ah.field_e.c("2:15", 85, 365, 0, -1);
                    var4 = pb.field_e.a(cp.field_S[3][0], 165, 170, var3 - 150, 440, 16777215, 0, 0, 0, -2 + var2);
                    if (var16 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                  ah.field_e.c(cp.field_J[4][0], 20, 135, 2, 0);
                  var13 = var2 + -4;
                  var4 = pb.field_e.a(cp.field_S[4][0], 20, 155, var3, 440, 16777215, 0, 0, 0, var13);
                  var5 = 135 + (var13 * var4 - -39);
                  var14 = 0;
                  L15: while (true) {
                    L16: {
                      if (5 <= var14) {
                        break L16;
                      } else {
                        var15 = -1;
                        if (var16 != 0) {
                          break L1;
                        } else {
                          L17: {
                            if (0 == var14) {
                              var15 = 3;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          L18: {
                            if (1 != var14) {
                              break L18;
                            } else {
                              var15 = 0;
                              break L18;
                            }
                          }
                          L19: {
                            if ((var14 ^ -1) == -3) {
                              var15 = 1;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          L20: {
                            if (var14 == 3) {
                              var15 = 1;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          L21: {
                            if (-4 != (var14 ^ -1)) {
                              break L21;
                            } else {
                              var15 = 8;
                              break L21;
                            }
                          }
                          L22: {
                            if (-1 == var15) {
                              break L22;
                            } else {
                              wa.field_b[var15].g(20, var5 + 2);
                              break L22;
                            }
                          }
                          var5 = var5 + (pb.field_e.a(cp.field_I[var14], 60, var5, -40 + var3, 400, 16777215, 0, 0, 0, var13) * var13 + 15);
                          var14++;
                          if (var16 == 0) {
                            continue L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    if (var16 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                var5 = 154;
                ah.field_e.c(cp.field_J[5][0], 20, 135, 2, 0);
                var14 = 0;
                L23: while (true) {
                  L24: {
                    if (var14 >= cp.field_Q.length) {
                      break L24;
                    } else {
                      var15 = -1;
                      if (var16 != 0) {
                        break L1;
                      } else {
                        L25: {
                          if (1 == var14) {
                            var15 = 43;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          if (2 != var14) {
                            break L26;
                          } else {
                            var15 = 41;
                            break L26;
                          }
                        }
                        L27: {
                          if (var14 == 3) {
                            var15 = 40;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        L28: {
                          if ((var14 ^ -1) == -5) {
                            var15 = 35;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        L29: {
                          if ((var15 ^ -1) == 0) {
                            break L29;
                          } else {
                            wa.field_b[var15].g(20, var5 + 2);
                            break L29;
                          }
                        }
                        L30: {
                          stackOut_66_0 = var5;
                          stackOut_66_1 = pb.field_e;
                          stackOut_66_2 = cp.field_Q[var14];
                          stackIn_68_0 = stackOut_66_0;
                          stackIn_68_1 = stackOut_66_1;
                          stackIn_68_2 = stackOut_66_2;
                          stackIn_67_0 = stackOut_66_0;
                          stackIn_67_1 = stackOut_66_1;
                          stackIn_67_2 = stackOut_66_2;
                          if (0 == var14) {
                            stackOut_68_0 = stackIn_68_0;
                            stackOut_68_1 = (ef) ((Object) stackIn_68_1);
                            stackOut_68_2 = (String) ((Object) stackIn_68_2);
                            stackOut_68_3 = 20;
                            stackIn_69_0 = stackOut_68_0;
                            stackIn_69_1 = stackOut_68_1;
                            stackIn_69_2 = stackOut_68_2;
                            stackIn_69_3 = stackOut_68_3;
                            break L30;
                          } else {
                            stackOut_67_0 = stackIn_67_0;
                            stackOut_67_1 = (ef) ((Object) stackIn_67_1);
                            stackOut_67_2 = (String) ((Object) stackIn_67_2);
                            stackOut_67_3 = 60;
                            stackIn_69_0 = stackOut_67_0;
                            stackIn_69_1 = stackOut_67_1;
                            stackIn_69_2 = stackOut_67_2;
                            stackIn_69_3 = stackOut_67_3;
                            break L30;
                          }
                        }
                        L31: {
                          stackOut_69_0 = stackIn_69_0;
                          stackOut_69_1 = (ef) ((Object) stackIn_69_1);
                          stackOut_69_2 = (String) ((Object) stackIn_69_2);
                          stackOut_69_3 = stackIn_69_3;
                          stackOut_69_4 = var5;
                          stackIn_71_0 = stackOut_69_0;
                          stackIn_71_1 = stackOut_69_1;
                          stackIn_71_2 = stackOut_69_2;
                          stackIn_71_3 = stackOut_69_3;
                          stackIn_71_4 = stackOut_69_4;
                          stackIn_70_0 = stackOut_69_0;
                          stackIn_70_1 = stackOut_69_1;
                          stackIn_70_2 = stackOut_69_2;
                          stackIn_70_3 = stackOut_69_3;
                          stackIn_70_4 = stackOut_69_4;
                          if (var14 != 0) {
                            stackOut_71_0 = stackIn_71_0;
                            stackOut_71_1 = (ef) ((Object) stackIn_71_1);
                            stackOut_71_2 = (String) ((Object) stackIn_71_2);
                            stackOut_71_3 = stackIn_71_3;
                            stackOut_71_4 = stackIn_71_4;
                            stackOut_71_5 = -40 + var3;
                            stackIn_72_0 = stackOut_71_0;
                            stackIn_72_1 = stackOut_71_1;
                            stackIn_72_2 = stackOut_71_2;
                            stackIn_72_3 = stackOut_71_3;
                            stackIn_72_4 = stackOut_71_4;
                            stackIn_72_5 = stackOut_71_5;
                            break L31;
                          } else {
                            stackOut_70_0 = stackIn_70_0;
                            stackOut_70_1 = (ef) ((Object) stackIn_70_1);
                            stackOut_70_2 = (String) ((Object) stackIn_70_2);
                            stackOut_70_3 = stackIn_70_3;
                            stackOut_70_4 = stackIn_70_4;
                            stackOut_70_5 = var3;
                            stackIn_72_0 = stackOut_70_0;
                            stackIn_72_1 = stackOut_70_1;
                            stackIn_72_2 = stackOut_70_2;
                            stackIn_72_3 = stackOut_70_3;
                            stackIn_72_4 = stackOut_70_4;
                            stackIn_72_5 = stackOut_70_5;
                            break L31;
                          }
                        }
                        var5 = stackIn_72_0 + (((ef) (Object) stackIn_72_1).a(stackIn_72_2, stackIn_72_3, stackIn_72_4, stackIn_72_5, 400, 16777215, 0, 0, 0, var2) * var2 + 15);
                        var14++;
                        if (var16 == 0) {
                          continue L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                  }
                  if (var16 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              ah.field_e.c(cp.field_J[6][0], 20, 135, 2, 0);
              discarded$3 = pb.field_e.a(cp.field_S[5][0], 20, 155, 600, 440, 16777215, 0, 0, 0, var2);
              if (var16 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
            var5 = 155;
            ah.field_e.c(cp.field_J[7][0], 20, 135, 2, 0);
            var14 = 0;
            L32: while (true) {
              if (2 <= var14) {
                break L2;
              } else {
                if (var16 != 0) {
                  break L1;
                } else {
                  L33: {
                    stackOut_79_0 = ch.field_b;
                    stackIn_81_0 = stackOut_79_0;
                    stackIn_80_0 = stackOut_79_0;
                    if (-1 == (var14 ^ -1)) {
                      stackOut_81_0 = (ja[]) ((Object) stackIn_81_0);
                      stackOut_81_1 = 0;
                      stackIn_82_0 = stackOut_81_0;
                      stackIn_82_1 = stackOut_81_1;
                      break L33;
                    } else {
                      stackOut_80_0 = (ja[]) ((Object) stackIn_80_0);
                      stackOut_80_1 = 3;
                      stackIn_82_0 = stackOut_80_0;
                      stackIn_82_1 = stackOut_80_1;
                      break L33;
                    }
                  }
                  ((ja) (Object) stackIn_82_0[stackIn_82_1]).g(28, -8 + var5);
                  var5 = var5 + (var2 * pb.field_e.a(bh.field_b[var14], 100, var5, var3 - 80, 400, 16777215, 0, 0, 0, var2) + 20);
                  var14++;
                  if (var16 == 0) {
                    continue L32;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          pb.field_e.a(fa.a(120, 1 + cp.field_S.length, 1 + this.field_m), 620, 410, 16777215, 0);
          break L1;
        }
    }

    final void a(boolean param0, byte param1) {
        int var3 = 0;
        this.field_m = this.field_m - 1;
        if (!param0) {
            if (!(-1 != (this.field_m ^ -1))) {
                var3 = sj.field_p;
                sj.field_p = 97;
                this.field_g.a(1, false);
                sj.field_p = var3;
            }
        }
        if (param1 > -110) {
            this.a(false, (byte) -86);
        }
    }

    final static boolean a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_p = 29;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var2_int >= param0.length()) {
                    break L4;
                  } else {
                    var3 = param0.charAt(var2_int);
                    stackOut_5_0 = hd.a(-24315, (char) var3);
                    stackIn_13_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0) {
                          break L5;
                        } else {
                          if (!vh.a((char) var3, (byte) 85)) {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("ol.JA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    static {
        field_l = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
