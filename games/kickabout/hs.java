/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class hs {
    static String field_b;
    static om field_d;
    int field_g;
    nu field_a;
    static int field_e;
    boolean field_f;
    private ko field_i;
    io[] field_c;
    int field_h;

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Kickabout.field_G;
          if (param2 <= -48) {
            break L0;
          } else {
            boolean discarded$2 = ((hs) this).e(38, -6);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= ((hs) this).field_i.field_a) {
            return -1;
          } else {
            var5 = ((hs) this).field_c[var4].field_d;
            var6 = ((hs) this).field_c[var4].field_h;
            var7 = -(var5 >> -1250102591) + ((hs) this).d(111, var4);
            var8 = ((hs) this).c(342, var4) - (var6 >> 1812573025);
            if (((hs) this).e(var4, 50)) {
              if (var7 <= param0) {
                if (var7 - -var5 > param0) {
                  if (param1 >= var8) {
                    if (param1 < var8 - -var6) {
                      return var4;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    boolean e(int param0, int param1) {
        if (param1 != 50) {
            ((hs) this).b(2, 47);
        }
        return true;
    }

    int d(int param0, int param1) {
        if (param0 <= 106) {
            return 15;
        }
        return 544;
    }

    final boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 13) {
            break L0;
          } else {
            ((hs) this).d(-24);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((((hs) this).field_g ^ -1) == 1) {
              break L2;
            } else {
              if (!((hs) this).field_a.field_R[((hs) this).field_g].d(3511)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static vn a(boolean param0, int param1, int param2, int param3, boolean[][] param4, int param5, boolean[][] param6, byte param7, int param8, boolean param9, int param10) {
        vn var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        vn var15 = null;
        int var16 = 0;
        int var17 = 0;
        short[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        vn var27 = null;
        vn var28 = null;
        short[] var32 = null;
        int stackIn_55_0 = 0;
        int stackIn_70_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        var26 = Kickabout.field_G;
        if (param0) {
          return pu.a(param9, param2, param4, (byte) -103, param6, param3, param10);
        } else {
          L0: {
            var27 = new vn(new vn[1], 1);
            var28 = var27;
            if (!param9) {
              break L0;
            } else {
              var12_int = wc.field_e[param2];
              var13 = 0;
              L1: while (true) {
                if (var13 >= var28.field_H.length) {
                  break L0;
                } else {
                  var27.field_H[var13] = var27.field_H[var13] * 3;
                  var28.field_l[var13] = 3 * (var27.field_l[var13] + -var12_int) + var12_int;
                  var13++;
                  if (0 == 0) {
                    continue L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          L2: {
            var12 = new vn(new vn[2], 2);
            var13 = (short)param3;
            var14 = (short)param10;
            var15 = new vn(var12, true, false, true, true);
            if (param4 != null) {
              break L2;
            } else {
              if (param6 == null) {
                return var15;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (param7 < -39) {
              break L3;
            } else {
              field_b = null;
              break L3;
            }
          }
          L4: {
            var32 = var12.field_p;
            var19 = var15.field_p;
            if (param2 != 4) {
              var16 = -9284;
              var20 = gt.field_h[param2][param8][param5].length;
              var21 = 0;
              L5: while (true) {
                L6: {
                  if (var32.length <= var21) {
                    break L6;
                  } else {
                    L7: {
                      if (var32[var21] == var16) {
                        var19[var21] = (short)gt.field_h[param2][param8][param5][0];
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var21++;
                    if (0 == 0) {
                      continue L5;
                    } else {
                      break L6;
                    }
                  }
                }
                var20 = gt.field_h[param2][param8][param5].length;
                var21 = 0;
                L8: while (true) {
                  L9: {
                    if (var21 >= var20) {
                      break L9;
                    } else {
                      var16 = (short)gt.field_h[param2][param8][0][var21];
                      var22 = 0;
                      L10: while (true) {
                        L11: {
                          if (var22 >= var32.length) {
                            break L11;
                          } else {
                            L12: {
                              if (var16 == var32[var22]) {
                                var19[var22] = (short)gt.field_h[param2][param8][param5][var21];
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var22++;
                            if (0 == 0) {
                              continue L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        var21++;
                        if (0 == 0) {
                          continue L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  var20 = hr.field_m[param2][param8][param1].length;
                  var21 = 0;
                  L13: while (true) {
                    L14: {
                      if (var21 >= var20) {
                        break L14;
                      } else {
                        var16 = (short)hr.field_m[param2][param8][0][var21];
                        var22 = 0;
                        L15: while (true) {
                          L16: {
                            if (var32.length <= var22) {
                              break L16;
                            } else {
                              L17: {
                                if ((var32[var22] ^ -1) != (var16 ^ -1)) {
                                  break L17;
                                } else {
                                  var19[var22] = (short)hr.field_m[param2][param8][param1][var21];
                                  break L17;
                                }
                              }
                              var22++;
                              if (0 == 0) {
                                continue L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          var21++;
                          if (0 == 0) {
                            continue L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    if ((param2 ^ -1) == -3) {
                      var16 = (short)ad.field_e[param8][0];
                      var21 = 0;
                      L18: while (true) {
                        if (var21 >= var32.length) {
                          break L4;
                        } else {
                          L19: {
                            if ((var32[var21] ^ -1) == (var16 ^ -1)) {
                              var19[var21] = (short)ad.field_e[param8][param5];
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          var21++;
                          if (0 == 0) {
                            continue L18;
                          } else {
                            break L4;
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
              }
            } else {
              break L4;
            }
          }
          L20: {
            if (param4 == null) {
              break L20;
            } else {
              var20 = 0;
              var21 = 0;
              L21: while (true) {
                if (param4.length <= var21) {
                  break L20;
                } else {
                  var22 = 20;
                  var23 = 0;
                  L22: while (true) {
                    L23: {
                      if (var23 >= param4[0].length) {
                        break L23;
                      } else {
                        L24: {
                          var24 = var23;
                          if (!param4[-var21 + 12][var24]) {
                            stackOut_54_0 = var13;
                            stackIn_55_0 = stackOut_54_0;
                            break L24;
                          } else {
                            stackOut_53_0 = var14;
                            stackIn_55_0 = stackOut_53_0;
                            break L24;
                          }
                        }
                        var17 = stackIn_55_0;
                        var16 = ks.a(var22, var20, 114, 7);
                        var25 = 0;
                        L25: while (true) {
                          L26: {
                            if (var25 >= var32.length) {
                              break L26;
                            } else {
                              L27: {
                                if ((var16 ^ -1) != (var32[var25] ^ -1)) {
                                  break L27;
                                } else {
                                  var19[var25] = (short)var17;
                                  break L27;
                                }
                              }
                              var25++;
                              if (0 == 0) {
                                continue L25;
                              } else {
                                break L26;
                              }
                            }
                          }
                          var22 += 5;
                          var23++;
                          if (0 == 0) {
                            continue L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    var20 += 3;
                    var21++;
                    if (0 == 0) {
                      continue L21;
                    } else {
                      break L20;
                    }
                  }
                }
              }
            }
          }
          L28: {
            if (param6 == null) {
              break L28;
            } else {
              var20 = 0;
              var21 = 0;
              L29: while (true) {
                if (param6.length <= var21) {
                  break L28;
                } else {
                  var22 = 20;
                  var23 = 0;
                  L30: while (true) {
                    L31: {
                      if (var23 >= param6[0].length) {
                        break L31;
                      } else {
                        L32: {
                          var24 = 9 + -var23;
                          if (!param6[-var21 + 12][var24]) {
                            stackOut_69_0 = var13;
                            stackIn_70_0 = stackOut_69_0;
                            break L32;
                          } else {
                            stackOut_68_0 = var14;
                            stackIn_70_0 = stackOut_68_0;
                            break L32;
                          }
                        }
                        var17 = stackIn_70_0;
                        var16 = ks.a(var22, var20, 110, 6);
                        var25 = 0;
                        L33: while (true) {
                          L34: {
                            if (var32.length <= var25) {
                              break L34;
                            } else {
                              L35: {
                                if (var16 != var32[var25]) {
                                  break L35;
                                } else {
                                  var19[var25] = (short)var17;
                                  break L35;
                                }
                              }
                              var25++;
                              if (0 == 0) {
                                continue L33;
                              } else {
                                break L34;
                              }
                            }
                          }
                          var22 += 5;
                          var23++;
                          if (0 == 0) {
                            continue L30;
                          } else {
                            break L31;
                          }
                        }
                      }
                    }
                    var20 += 3;
                    var21++;
                    if (0 == 0) {
                      continue L29;
                    } else {
                      break L28;
                    }
                  }
                }
              }
            }
          }
          return var15;
        }
    }

    void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        var8 = Kickabout.field_G;
        if (null != ((hs) this).field_c) {
          L0: {
            if (param1) {
              ((hs) this).field_i.a(-21174, this.a(wt.field_x, us.field_j, -74), this.a(dn.field_yb, kf.field_Eb, -106));
              if (-1 < (((hs) this).field_i.field_e ^ -1)) {
                break L0;
              } else {
                if (((hs) this).field_i.c(-1)) {
                  ((hs) this).f(111, ((hs) this).field_c[((hs) this).field_i.field_e].field_m);
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (((hs) this).field_c.length <= var3) {
              L2: {
                if (param0 < -92) {
                  break L2;
                } else {
                  field_b = null;
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                if (param1) {
                  if (var3 == ((hs) this).field_i.field_e) {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_16_0 = stackOut_13_0;
                    break L3;
                  }
                } else {
                  stackOut_11_0 = 0;
                  stackIn_16_0 = stackOut_11_0;
                  break L3;
                }
              }
              L4: {
                var4 = stackIn_16_0;
                if (param1) {
                  if (var4 != 0) {
                    if (((hs) this).field_i.c(-1)) {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L4;
                    } else {
                      stackOut_21_0 = 0;
                      stackIn_24_0 = stackOut_21_0;
                      break L4;
                    }
                  } else {
                    stackOut_19_0 = 0;
                    stackIn_24_0 = stackOut_19_0;
                    break L4;
                  }
                } else {
                  stackOut_17_0 = 0;
                  stackIn_24_0 = stackOut_17_0;
                  break L4;
                }
              }
              L5: {
                var5 = stackIn_24_0;
                if (var4 != 0) {
                  if (((hs) this).field_i.a(0)) {
                    stackOut_28_0 = 1;
                    stackIn_30_0 = stackOut_28_0;
                    break L5;
                  } else {
                    stackOut_27_0 = 0;
                    stackIn_30_0 = stackOut_27_0;
                    break L5;
                  }
                } else {
                  stackOut_25_0 = 0;
                  stackIn_30_0 = stackOut_25_0;
                  break L5;
                }
              }
              var6 = stackIn_30_0;
              var7 = wt.field_x - ((hs) this).d(124, var3);
              ((hs) this).field_c[var3].a(var4 != 0, var5 != 0, var6 != 0, 16, var7);
              var3++;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0) {
        if (param0 != -26254) {
            field_d = null;
        }
        ((hs) this).field_i = new ko(((hs) this).field_c.length);
        ((hs) this).field_i.a(true, this.a(wt.field_x, us.field_j, -93), (byte) -127);
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        int var1 = 45 % ((22 - param0) / 38);
    }

    abstract void e(int param0);

    final void c(int param0) {
        on.a(10, 50, 620, 320, 20, 65793, 128);
        if (param0 < 43) {
            int discarded$0 = ((hs) this).c(-47, -123);
        }
    }

    boolean a(char param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Kickabout.field_G;
          if (param1 == 1670) {
            break L0;
          } else {
            ((hs) this).field_i = null;
            break L0;
          }
        }
        if (null == ((hs) this).field_i) {
          return false;
        } else {
          L1: {
            ((hs) this).field_i.a(0, true);
            if (((hs) this).field_i.field_e >= 0) {
              var4 = 0;
              L2: while (true) {
                if (((hs) this).e(((hs) this).field_i.field_e, 50)) {
                  break L1;
                } else {
                  int incrementValue$181 = var4;
                  var4++;
                  if (((hs) this).field_i.field_a < incrementValue$181) {
                    break L1;
                  } else {
                    if (96 == param2) {
                      ((hs) this).field_i.field_e = (((hs) this).field_i.field_a + ((hs) this).field_i.field_e + -1) % ((hs) this).field_i.field_a;
                      continue L2;
                    } else {
                      ((hs) this).field_i.field_e = (1 + ((hs) this).field_i.field_e) % ((hs) this).field_i.field_a;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          L3: {
            if ((((hs) this).field_i.field_e ^ -1) > -1) {
              break L3;
            } else {
              if (((hs) this).field_i.c(-1)) {
                ((hs) this).f(101, ((hs) this).field_c[((hs) this).field_i.field_e].field_m);
                break L3;
              } else {
                return true;
              }
            }
          }
          return true;
        }
    }

    void a(boolean param0) {
        mj.a(140.0, 60, 448.0, 672.0);
        if (!param0) {
            ((hs) this).d(69);
        }
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (0 == (param1 ^ -1)) {
          return;
        } else {
          L0: {
            var3 = 47;
            var4 = 83;
            var5 = Integer.toString(param1 / 50);
            iw.a(-45, hg.field_G);
            on.b();
            var6 = on.field_g >> 1301340449;
            var7 = on.field_f >> 926497377;
            un.field_d.d(var5, var6, var7, 16777215, -1);
            pw.field_H.c(-16 + var6, var7 - 31);
            ta.e(124);
            var8 = 256;
            if (param0 == -2351) {
              break L0;
            } else {
              ((hs) this).field_c = null;
              break L0;
            }
          }
          L1: {
            if (-11 > (param1 / 50 ^ -1)) {
              break L1;
            } else {
              var8 = var8 + (-200 - -(4 * (((hs) this).field_a.field_v % 50)) + 128);
              if (256 <= var8) {
                break L1;
              } else {
                var8 = 256;
                break L1;
              }
            }
          }
          L2: {
            var9 = hg.field_G.field_o;
            var10 = hg.field_G.field_v;
            if (256 == var8) {
              hg.field_G.c(var3 - (var9 >> -1025132031), -(var10 >> -1624295551) + var4);
              break L2;
            } else {
              var10 = var10 * var8 >> -1906217048;
              var9 = var8 * var9 >> -1512780888;
              hg.field_G.e(var3 + (-(var9 >> 1218602561) + -1), -1 + (var4 - (var10 >> 1428940641)), var9, var10, 256);
              break L2;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        String stackIn_12_2 = null;
        int stackIn_21_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var13 = Kickabout.field_G;
          if ((((hs) this).field_g ^ -1) != 1) {
            stackOut_2_0 = ((hs) this).field_a.field_g[((hs) this).field_g].field_p;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          var6 = -1;
          if (param0 != var5) {
            break L1;
          } else {
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (((hs) this).field_g <= var7) {
                break L1;
              } else {
                if (((hs) this).field_a.field_g[var7].field_p == param0) {
                  var6++;
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
        L3: {
          stackOut_9_0 = var6;
          stackOut_9_1 = 4;
          stackIn_11_0 = stackOut_9_0;
          stackIn_11_1 = stackOut_9_1;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          if (param0 != 0) {
            stackOut_11_0 = stackIn_11_0;
            stackOut_11_1 = stackIn_11_1;
            stackOut_11_2 = nu.field_a;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            stackIn_12_2 = stackOut_11_2;
            break L3;
          } else {
            stackOut_10_0 = stackIn_10_0;
            stackOut_10_1 = stackIn_10_1;
            stackOut_10_2 = he.field_Ub;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_12_2 = stackOut_10_2;
            break L3;
          }
        }
        wj.a(stackIn_12_0, stackIn_12_1, stackIn_12_2, param3, param1, 114);
        param1 += 39;
        if (param2 < -43) {
          var14 = 0;
          var7 = var14;
          L4: while (true) {
            if (var14 >= ((hs) this).field_a.field_I) {
              return;
            } else {
              if (param0 == ((hs) this).field_a.field_g[var14].field_p) {
                L5: {
                  b.field_U[((hs) this).field_a.field_g[var14].field_f].c(param3, -16 + param1);
                  if (((hs) this).field_a.field_R[var14].d(3511)) {
                    stackOut_20_0 = 16777215;
                    stackIn_21_0 = stackOut_20_0;
                    break L5;
                  } else {
                    stackOut_19_0 = 11184810;
                    stackIn_21_0 = stackOut_19_0;
                    break L5;
                  }
                }
                var8 = stackIn_21_0;
                var9 = ((hs) this).field_a.field_S[var14].toLowerCase();
                un.field_d.d(var9, param3 - -80, param1, var8, -1);
                if (!((hs) this).field_a.field_R[var14].d(3511)) {
                  var10 = un.field_d.a(var9);
                  var11 = param3 - -(-var10 + 160 >> -1971830719);
                  var12 = 10;
                  on.b(var11, -2 + param1 - var12, var10 + var11, param1 + -1, 13382451);
                  on.b(var11, param1 - 1, var10 + var11, -var12 + (param1 - 2), 13382451);
                  param1 += 23;
                  var14++;
                  continue L4;
                } else {
                  param1 += 23;
                  var14++;
                  continue L4;
                }
              } else {
                var14++;
                continue L4;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(boolean param0, String param1) {
        on.a(22, 62, 596, 28, 10, 65793, 128);
        if (param0) {
            ((hs) this).field_a = null;
        }
        un.field_d.d(param1.toUpperCase(), 320, 83, 16777215, -1);
    }

    int c(int param0, int param1) {
        if (param0 != 342) {
            return -91;
        }
        return 342 + -(param1 * 29);
    }

    hs(nu param0, int param1, boolean param2, int[] param3) {
        int var5 = 0;
        ((hs) this).field_g = param1;
        ((hs) this).field_a = param0;
        ((hs) this).field_h = -2 != ((hs) this).field_g ? ((hs) this).field_a.field_g[((hs) this).field_g].field_p : 0;
        ((hs) this).field_f = param2 ? true : false;
        if (param3 != null) {
            ((hs) this).field_c = new io[param3.length];
            for (var5 = 0; param3.length > var5; var5++) {
                ((hs) this).field_c[var5] = new io(-3, 7126504, param3[var5]);
            }
            ((hs) this).a(-26254);
        }
    }

    abstract void f(int param0, int param1);

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        if (null != ((hs) this).field_c) {
          var2 = 90 / ((param0 - 78) / 38);
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((hs) this).field_c.length) {
              return;
            } else {
              if (((hs) this).e(var3, 50)) {
                ((hs) this).field_c[var3].a(((hs) this).c(342, var3), ((hs) this).d(124, var3), 13800);
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var9 = Kickabout.field_G;
          if (param1 == 17709) {
            break L0;
          } else {
            ((hs) this).a(-84, 57);
            break L0;
          }
        }
        L1: {
          var3 = 210;
          var4 = new int[]{-160 + -var3 + 640 >> 1264603681, -160 + (640 - -var3) >> -167049151};
          var5 = new int[]{23 + param0, param0 + 23};
          if (1 != (((hs) this).field_g ^ -1)) {
            if (1 == ((hs) this).field_a.field_g[((hs) this).field_g].field_p) {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = 0;
              stackIn_8_0 = stackOut_5_0;
              break L1;
            }
          } else {
            stackOut_3_0 = 0;
            stackIn_8_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_8_0;
          if (var6 == 0) {
            break L2;
          } else {
            var7 = var4[0];
            var4[0] = var4[1];
            var4[1] = var7;
            break L2;
          }
        }
        ((hs) this).a(0, param0, (byte) -62, var4[0]);
        ((hs) this).a(1, param0, (byte) -72, var4[1]);
        var10 = 0;
        var7 = var10;
        L3: while (true) {
          if (((hs) this).field_a.field_I <= var10) {
            return;
          } else {
            L4: {
              var8 = ((hs) this).field_a.field_g[var10].field_p;
              pt.a(640, -22914, 2 + (var4[var8] - -160), 480, 0);
              on.a(var4[var8], var5[var8], 186, 21, 7, 65793, 128);
              ta.e(123);
              if (((hs) this).field_a.field_R[var10].field_i) {
                vb.field_l.c(2 + (160 + var4[var8]), -4 + var5[var8]);
                break L4;
              } else {
                break L4;
              }
            }
            var5[var8] = var5[var8] + 23;
            var10++;
            continue L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "£";
    }
}
