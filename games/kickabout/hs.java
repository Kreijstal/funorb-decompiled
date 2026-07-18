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
            var7 = -(var5 >> 1) + ((hs) this).d(111, var4);
            var8 = ((hs) this).c(342, var4) - (var6 >> 1);
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
            if (((hs) this).field_g == -2) {
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
        RuntimeException var11 = null;
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
        int var28 = 0;
        vn var29 = null;
        short[] var33 = null;
        vn stackIn_4_0 = null;
        vn stackIn_13_0 = null;
        int stackIn_57_0 = 0;
        int stackIn_72_0 = 0;
        vn stackIn_80_0 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        RuntimeException decompiledCaughtException = null;
        vn stackOut_3_0 = null;
        vn stackOut_12_0 = null;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        vn stackOut_79_0 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        var26 = Kickabout.field_G;
        try {
          L0: {
            if (param0) {
              stackOut_3_0 = pu.a(param9, param2, param4, (byte) -103, param6, param3, param10);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var27 = new vn(new vn[1], 1);
                var29 = var27;
                if (!param9) {
                  break L1;
                } else {
                  var12_int = wc.field_e[param2];
                  var13 = 0;
                  L2: while (true) {
                    if (var13 >= var29.field_H.length) {
                      break L1;
                    } else {
                      var27.field_H[var13] = var27.field_H[var13] * 3;
                      var29.field_l[var13] = 3 * (var27.field_l[var13] + -var12_int) + var12_int;
                      var13++;
                      continue L2;
                    }
                  }
                }
              }
              L3: {
                var12 = new vn(new vn[2], 2);
                var13 = (short)param3;
                var14 = (short)param10;
                var15 = new vn(var12, true, false, true, true);
                if (param4 != null) {
                  break L3;
                } else {
                  if (param6 == null) {
                    stackOut_12_0 = (vn) var15;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param7 < -39) {
                  break L4;
                } else {
                  field_b = null;
                  break L4;
                }
              }
              L5: {
                var33 = var12.field_p;
                var19 = var15.field_p;
                if (param2 != 4) {
                  var16 = -9284;
                  var20 = gt.field_h[param2][param8][param5].length;
                  var21 = 0;
                  L6: while (true) {
                    if (var33.length <= var21) {
                      var20 = gt.field_h[param2][param8][param5].length;
                      var21 = 0;
                      L7: while (true) {
                        if (var21 >= var20) {
                          var20 = hr.field_m[param2][param8][param1].length;
                          var21 = 0;
                          L8: while (true) {
                            if (var21 >= var20) {
                              if (param2 == 2) {
                                var16 = (short)ad.field_e[param8][0];
                                var21 = 0;
                                L9: while (true) {
                                  if (var21 >= var33.length) {
                                    break L5;
                                  } else {
                                    L10: {
                                      if (var33[var21] == var16) {
                                        var19[var21] = (short)ad.field_e[param8][param5];
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    var21++;
                                    continue L9;
                                  }
                                }
                              } else {
                                break L5;
                              }
                            } else {
                              var16 = (short)hr.field_m[param2][param8][0][var21];
                              var22 = 0;
                              L11: while (true) {
                                if (var33.length <= var22) {
                                  var21++;
                                  continue L8;
                                } else {
                                  L12: {
                                    if (var33[var22] != var16) {
                                      break L12;
                                    } else {
                                      var19[var22] = (short)hr.field_m[param2][param8][param1][var21];
                                      break L12;
                                    }
                                  }
                                  var22++;
                                  continue L11;
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (short)gt.field_h[param2][param8][0][var21];
                          var22 = 0;
                          L13: while (true) {
                            if (var22 >= var33.length) {
                              var21++;
                              continue L7;
                            } else {
                              L14: {
                                if (var16 == var33[var22]) {
                                  var19[var22] = (short)gt.field_h[param2][param8][param5][var21];
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              var22++;
                              continue L13;
                            }
                          }
                        }
                      }
                    } else {
                      L15: {
                        if (var33[var21] == var16) {
                          var19[var21] = (short)gt.field_h[param2][param8][param5][0];
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      var21++;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
              L16: {
                if (param4 == null) {
                  break L16;
                } else {
                  var20 = 0;
                  var21 = 0;
                  L17: while (true) {
                    if (param4.length <= var21) {
                      break L16;
                    } else {
                      var22 = 20;
                      var23 = 0;
                      L18: while (true) {
                        if (var23 >= param4[0].length) {
                          var20 += 3;
                          var21++;
                          continue L17;
                        } else {
                          L19: {
                            var24 = var23;
                            if (!param4[-var21 + 12][var24]) {
                              stackOut_56_0 = var13;
                              stackIn_57_0 = stackOut_56_0;
                              break L19;
                            } else {
                              stackOut_55_0 = var14;
                              stackIn_57_0 = stackOut_55_0;
                              break L19;
                            }
                          }
                          var17 = stackIn_57_0;
                          var16 = ks.a(var22, var20, 114, 7);
                          var25 = 0;
                          L20: while (true) {
                            if (var25 >= var33.length) {
                              var22 += 5;
                              var23++;
                              continue L18;
                            } else {
                              L21: {
                                if (var16 != var33[var25]) {
                                  break L21;
                                } else {
                                  var19[var25] = (short)var17;
                                  break L21;
                                }
                              }
                              var25++;
                              continue L20;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L22: {
                if (param6 == null) {
                  break L22;
                } else {
                  var20 = 0;
                  var21 = 0;
                  L23: while (true) {
                    if (param6.length <= var21) {
                      break L22;
                    } else {
                      var22 = 20;
                      var23 = 0;
                      L24: while (true) {
                        if (var23 >= param6[0].length) {
                          var20 += 3;
                          var21++;
                          continue L23;
                        } else {
                          L25: {
                            var24 = 9 + -var23;
                            if (!param6[-var21 + 12][var24]) {
                              stackOut_71_0 = var13;
                              stackIn_72_0 = stackOut_71_0;
                              break L25;
                            } else {
                              stackOut_70_0 = var14;
                              stackIn_72_0 = stackOut_70_0;
                              break L25;
                            }
                          }
                          var17 = stackIn_72_0;
                          var16 = ks.a(var22, var20, 110, 6);
                          var28 = 0;
                          var25 = var28;
                          L26: while (true) {
                            if (var33.length <= var28) {
                              var22 += 5;
                              var23++;
                              continue L24;
                            } else {
                              L27: {
                                if (var16 != var33[var28]) {
                                  break L27;
                                } else {
                                  var19[var28] = (short)var17;
                                  break L27;
                                }
                              }
                              var28++;
                              continue L26;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_79_0 = (vn) var15;
              stackIn_80_0 = stackOut_79_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var11 = decompiledCaughtException;
            stackOut_81_0 = (RuntimeException) var11;
            stackOut_81_1 = new StringBuilder().append("hs.LB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param4 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L28;
            } else {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L28;
            }
          }
          L29: {
            stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
            stackOut_84_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(',').append(param5).append(',');
            stackIn_86_0 = stackOut_84_0;
            stackIn_86_1 = stackOut_84_1;
            stackIn_85_0 = stackOut_84_0;
            stackIn_85_1 = stackOut_84_1;
            if (param6 == null) {
              stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
              stackOut_86_2 = "null";
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              stackIn_87_2 = stackOut_86_2;
              break L29;
            } else {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "{...}";
              stackIn_87_0 = stackOut_85_0;
              stackIn_87_1 = stackOut_85_1;
              stackIn_87_2 = stackOut_85_2;
              break L29;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_87_0, stackIn_87_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
        return stackIn_80_0;
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
              if (((hs) this).field_i.field_e < 0) {
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
        int var1 = 1;
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
            if (((hs) this).field_i.field_e < 0) {
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
        if (param1 == -1) {
          return;
        } else {
          L0: {
            var3 = 47;
            var4 = 83;
            var5 = Integer.toString(param1 / 50);
            iw.a(-45, hg.field_G);
            on.b();
            var6 = on.field_g >> 1;
            var7 = on.field_f >> 1;
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
            if (param1 / 50 > 10) {
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
              hg.field_G.c(var3 - (var9 >> 1), -(var10 >> 1) + var4);
              break L2;
            } else {
              var10 = var10 * var8 >> 8;
              var9 = var8 * var9 >> 8;
              hg.field_G.e(var3 + (-(var9 >> 1) + -1), -1 + (var4 - (var10 >> 1)), var9, var10, 256);
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
          if (((hs) this).field_g != -2) {
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
                  var11 = param3 - -(-var10 + 160 >> 1);
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
        try {
            on.a(22, 62, 596, 28, 10, 65793, 128);
            if (param0) {
                ((hs) this).field_a = null;
            }
            un.field_d.d(param1.toUpperCase(), 320, 83, 16777215, -1);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "hs.JB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    int c(int param0, int param1) {
        if (param0 != 342) {
            return -91;
        }
        return 342 + -(param1 * 29);
    }

    hs(nu param0, int param1, boolean param2, int[] param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              ((hs) this).field_g = param1;
              ((hs) this).field_a = param0;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (-2 == ((hs) this).field_g) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = ((hs) this).field_a.field_g[((hs) this).field_g].field_p;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((hs) this).field_h = stackIn_4_1;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param2) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((hs) this).field_f = stackIn_7_1 != 0;
              if (param3 == null) {
                break L3;
              } else {
                ((hs) this).field_c = new io[param3.length];
                var5_int = 0;
                L4: while (true) {
                  if (param3.length <= var5_int) {
                    ((hs) this).a(-26254);
                    break L3;
                  } else {
                    ((hs) this).field_c[var5_int] = new io(-3, 7126504, param3[var5_int]);
                    var5_int++;
                    continue L4;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("hs.<init>(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
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
          var4 = new int[]{-160 + -var3 + 640 >> 1, -160 + (640 - -var3) >> 1};
          var5 = new int[]{23 + param0, param0 + 23};
          if (((hs) this).field_g != -2) {
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
