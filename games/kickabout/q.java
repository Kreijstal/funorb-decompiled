/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int[] field_e;
    static String field_f;
    static int field_b;
    private lk[] field_g;
    int field_a;
    static String[] field_h;
    static uo field_d;
    static String field_c;

    final static void a(hd param0, int param1, int param2, int param3, hd param4, byte[] param5, hd param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var12 = Kickabout.field_G;
        try {
          L0: {
            rp.field_x = param5;
            dd.field_c = -1L;
            qi.field_p = param8;
            ss.field_j = param5.length;
            hw.field_k = false;
            er.field_h = new byte[(7 + qi.field_p) / 8];
            uv.field_i = null;
            ow.field_b = null;
            var10_int = 0;
            var11 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var11 >= rp.field_x.length) {
                    break L3;
                  } else {
                    var10_int = var10_int + (rp.field_x[var11] & 255);
                    var11++;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var10_int = (7 + var10_int) / 8;
                rf.field_d = new byte[var10_int];
                break L2;
              }
              L4: {
                if (null == param0.field_jb) {
                  param0.field_jb = new tf();
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                rp.field_B = param0.field_jb;
                rp.field_B.b(22997);
                pq.field_N = new em(param2);
                jm.field_h = 0;
                mi.field_d = -1;
                da.field_o = -1;
                fh.field_b = 0;
                if (param6.field_jb == null) {
                  param6.field_jb = new tf();
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                kq.field_yb = param6.field_jb;
                kq.field_yb.b(22997);
                sr.field_f = new em(param9);
                if (param4.field_jb == null) {
                  param4.field_jb = new tf();
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                lw.field_d = param4.field_jb;
                lw.field_d.b(22997);
                pu.field_Eb = new em(param3);
                mg.field_c = param7;
                vg.field_Ib = 0L;
                if (param1 > 114) {
                  break L7;
                } else {
                  ut[] discarded$1 = q.a(123, 125, 58, -75, 34, -38, 61, 107, -70);
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var10;
            stackOut_19_1 = new StringBuilder().append("q.C(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param5 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param6 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    final lk a(byte param0) {
        if (param0 <= 55) {
            return null;
        }
        int fieldTemp$0 = ((q) this).field_a;
        ((q) this).field_a = ((q) this).field_a + 1;
        return ((q) this).field_g[fieldTemp$0];
    }

    public static void b(int param0) {
        field_e = null;
        field_h = null;
        field_c = null;
        field_f = null;
        int var1 = 73 / ((-20 - param0) / 63);
        field_d = null;
    }

    final boolean a(int param0) {
        if (param0 != 6) {
            field_e = null;
        }
        return ((q) this).field_a >= ((q) this).field_g.length ? true : false;
    }

    final static ut[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        ut[] var10 = null;
        ut[] var11_ref_ut__ = null;
        int var11 = 0;
        int var12 = 0;
        ut var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_33_0 = 0;
        var15 = Kickabout.field_G;
        var9 = param1 + (param3 + param0);
        var10 = new ut[]{new ut(var9, var9), new ut(param4, var9), new ut(var9, var9), new ut(var9, param4), new ut(64, 64), new ut(var9, param4), new ut(var9, var9), new ut(param4, var9), new ut(var9, var9)};
        var11_ref_ut__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var12 >= var11_ref_ut__.length) {
                break L2;
              } else {
                var13 = var11_ref_ut__[var12];
                stackOut_2_0 = 0;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var15 != 0) {
                  break L1;
                } else {
                  var14 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var14 >= var13.field_y.length) {
                          break L5;
                        } else {
                          var13.field_y[var14] = param6;
                          var14++;
                          if (var15 != 0) {
                            break L4;
                          } else {
                            if (var15 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var12++;
                      break L4;
                    }
                    if (var15 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          var11 = stackIn_11_0;
          L6: while (true) {
            L7: {
              if (param0 <= var11) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L7;
              } else {
                stackOut_13_0 = 0;
                stackIn_22_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (var15 != 0) {
                  break L7;
                } else {
                  var12 = stackIn_14_0;
                  L8: while (true) {
                    L9: {
                      if (var12 >= var9) {
                        var11++;
                        break L9;
                      } else {
                        var10[6].field_y[(-1 + -var11 + var9) * var9 - -var12] = param2;
                        var10[8].field_y[var12 + var9 * (-var11 + (var9 + -1))] = param2;
                        var10[2].field_y[var12 * var9 + (-1 + (var9 + -var11))] = param2;
                        var10[8].field_y[-var11 - -var9 - (1 - var12 * var9)] = param2;
                        var12++;
                        if (var15 != 0) {
                          break L9;
                        } else {
                          continue L8;
                        }
                      }
                    }
                    continue L6;
                  }
                }
              }
            }
            var11 = stackIn_22_0;
            L10: while (true) {
              stackOut_23_0 = param0;
              stackOut_23_1 = var11;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              L11: while (true) {
                L12: {
                  if (stackIn_24_0 <= stackIn_24_1) {
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    break L12;
                  } else {
                    stackOut_25_0 = 0;
                    stackIn_31_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (var15 != 0) {
                      break L12;
                    } else {
                      var12 = stackIn_26_0;
                      if (var12 >= var9) {
                        var11++;
                        continue L10;
                      } else {
                        var10[0].field_y[var12 + var11 * var9] = -70;
                        var10[0].field_y[var9 * var12 + var11] = -70;
                        stackOut_27_0 = var9 + -var11;
                        stackOut_27_1 = var12;
                        stackIn_24_0 = stackOut_27_0;
                        stackIn_24_1 = stackOut_27_1;
                        continue L11;
                      }
                    }
                  }
                }
                var11 = stackIn_31_0;
                L13: while (true) {
                  L14: {
                    if (var11 >= param4) {
                      stackOut_41_0 = param5;
                      stackIn_42_0 = stackOut_41_0;
                      break L14;
                    } else {
                      stackOut_33_0 = 0;
                      stackIn_42_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (var15 != 0) {
                        break L14;
                      } else {
                        var12 = stackIn_34_0;
                        L15: while (true) {
                          L16: {
                            if (var12 >= param0) {
                              var11++;
                              break L16;
                            } else {
                              var10[7].field_y[param4 * (-var12 + (var9 + -1)) - -var11] = param2;
                              var10[5].field_y[-var12 - (-var9 + 1 - var9 * var11)] = param2;
                              var10[1].field_y[var12 * param4 - -var11] = -70;
                              var10[3].field_y[var11 * var9 + var12] = -70;
                              var12++;
                              if (var15 != 0) {
                                break L16;
                              } else {
                                continue L15;
                              }
                            }
                          }
                          continue L13;
                        }
                      }
                    }
                  }
                  if (stackIn_42_0 != -1481) {
                    return null;
                  } else {
                    var11 = 0;
                    L17: while (true) {
                      L18: {
                        if (param4 >> 1 <= var11) {
                          break L18;
                        } else {
                          var12 = 0;
                          L19: while (true) {
                            L20: {
                              if (var12 >= param1) {
                                var11++;
                                break L20;
                              } else {
                                var10[1].field_y[(var9 + -var12 - 1) * param4 - -var11] = param7;
                                var10[3].field_y[var9 + -1 + (-var12 + var9 * var11)] = param7;
                                var10[7].field_y[var12 * param4 - -var11] = param7;
                                var10[5].field_y[var9 * var11 - -var12] = param7;
                                var12++;
                                if (var15 != 0) {
                                  break L20;
                                } else {
                                  continue L19;
                                }
                              }
                            }
                            if (var15 == 0) {
                              continue L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      return var10;
                    }
                  }
                }
              }
            }
          }
        }
    }

    q(tf param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        lk var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = Kickabout.field_G;
        ((q) this).field_a = 0;
        try {
          L0: {
            ((q) this).field_g = new lk[param0.a(false)];
            var2_int = 0;
            var3 = (lk) (Object) param0.g(24009);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  var3.c((byte) -109);
                  int incrementValue$2 = var2_int;
                  var2_int++;
                  ((q) this).field_g[incrementValue$2] = var3;
                  var3 = (lk) (Object) param0.c(33);
                  if (var4 != 0) {
                    break L2;
                  } else {
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("q.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[7];
        field_h = new String[]{"Amateur", "Pebble Playoffs", "Cobalt Conference", "Sandstone Series", "Quartz Qualifiers", "Crystal Circuit", "Diamond Division"};
        field_f = "Stats";
        field_e[5] = 11;
        field_e[2] = 8;
        field_e[4] = 10;
        field_e[6] = 19;
        field_e[1] = 7;
        field_e[0] = 6;
        field_e[3] = 9;
        field_c = "Username: ";
    }
}
