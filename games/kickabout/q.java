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
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Kickabout.field_G;
        rp.field_x = param5;
        dd.field_c = -1L;
        qi.field_p = param8;
        ss.field_j = param5.length;
        hw.field_k = false;
        er.field_h = new byte[(7 + qi.field_p) / 8];
        uv.field_i = null;
        ow.field_b = null;
        var10 = 0;
        var11 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var11 >= rp.field_x.length) {
                break L2;
              } else {
                var10 = var10 + (rp.field_x[var11] & 255);
                var11++;
                if (var12 != 0) {
                  break L1;
                } else {
                  if (var12 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var10 = (7 + var10) / 8;
            rf.field_d = new byte[var10];
            break L1;
          }
          L3: {
            if (null == param0.field_jb) {
              param0.field_jb = new tf();
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            rp.field_B = param0.field_jb;
            rp.field_B.b(22997);
            pq.field_N = new em(param2);
            jm.field_h = 0;
            mi.field_d = -1;
            da.field_o = -1;
            fh.field_b = 0;
            if (param6.field_jb == null) {
              param6.field_jb = new tf();
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            kq.field_yb = param6.field_jb;
            kq.field_yb.b(22997);
            sr.field_f = new em(param9);
            if (param4.field_jb == null) {
              param4.field_jb = new tf();
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            lw.field_d = param4.field_jb;
            lw.field_d.b(22997);
            pu.field_Eb = new em(param3);
            mg.field_c = param7;
            vg.field_Ib = 0L;
            if (param1 > 114) {
              break L6;
            } else {
              ut[] discarded$1 = q.a(123, 125, 58, -75, 34, -38, 61, 107, -70);
              break L6;
            }
          }
          return;
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
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_37_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_30_0 = 0;
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
                stackIn_9_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var15 != 0) {
                  break L1;
                } else {
                  var14 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      if (var14 >= var13.field_y.length) {
                        break L4;
                      } else {
                        var13.field_y[var14] = param6;
                        var14++;
                        if (var15 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var12++;
                    if (var15 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L1;
          }
          var11 = stackIn_9_0;
          L5: while (true) {
            L6: {
              if (param0 <= var11) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L6;
              } else {
                stackOut_11_0 = 0;
                stackIn_18_0 = stackOut_11_0;
                stackIn_12_0 = stackOut_11_0;
                if (var15 != 0) {
                  break L6;
                } else {
                  var12 = stackIn_12_0;
                  L7: while (true) {
                    if (var12 >= var9) {
                      var11++;
                      continue L5;
                    } else {
                      var10[6].field_y[(-1 + -var11 + var9) * var9 - -var12] = param2;
                      var10[8].field_y[var12 + var9 * (-var11 + (var9 + -1))] = param2;
                      var10[2].field_y[var12 * var9 + (-1 + (var9 + -var11))] = param2;
                      var10[8].field_y[-var11 - -var9 - (1 - var12 * var9)] = param2;
                      var12++;
                      continue L7;
                    }
                  }
                }
              }
            }
            var11 = stackIn_18_0;
            L8: while (true) {
              L9: {
                if (param0 <= var11) {
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  break L9;
                } else {
                  stackOut_20_0 = 0;
                  stackIn_28_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (var15 != 0) {
                    break L9;
                  } else {
                    var12 = stackIn_21_0;
                    L10: while (true) {
                      if (var12 >= var9) {
                        var11++;
                        continue L8;
                      } else {
                        L11: {
                          var10[0].field_y[var12 + var11 * var9] = param8;
                          var10[0].field_y[var9 * var12 + var11] = param8;
                          if (var9 + -var11 <= var12) {
                            break L11;
                          } else {
                            var10[2].field_y[var11 * var9 + var12] = param8;
                            var10[6].field_y[var9 * var12 + var11] = param8;
                            break L11;
                          }
                        }
                        var12++;
                        continue L10;
                      }
                    }
                  }
                }
              }
              var11 = stackIn_28_0;
              L12: while (true) {
                L13: {
                  if (var11 >= param4) {
                    stackOut_36_0 = param5;
                    stackIn_37_0 = stackOut_36_0;
                    break L13;
                  } else {
                    stackOut_30_0 = 0;
                    stackIn_37_0 = stackOut_30_0;
                    stackIn_31_0 = stackOut_30_0;
                    if (var15 != 0) {
                      break L13;
                    } else {
                      var12 = stackIn_31_0;
                      L14: while (true) {
                        if (var12 >= param0) {
                          var11++;
                          continue L12;
                        } else {
                          var10[7].field_y[param4 * (-var12 + (var9 + -1)) - -var11] = param2;
                          var10[5].field_y[-var12 - (-var9 + 1 - var9 * var11)] = param2;
                          var10[1].field_y[var12 * param4 - -var11] = param8;
                          var10[3].field_y[var11 * var9 + var12] = param8;
                          var12++;
                          continue L14;
                        }
                      }
                    }
                  }
                }
                if (stackIn_37_0 != -1481) {
                  return null;
                } else {
                  var11 = 0;
                  L15: while (true) {
                    L16: {
                      if (param4 >> 1827069377 <= var11) {
                        break L16;
                      } else {
                        var12 = 0;
                        L17: while (true) {
                          L18: {
                            if (var12 >= param1) {
                              var11++;
                              break L18;
                            } else {
                              var10[1].field_y[(var9 + -var12 - 1) * param4 - -var11] = param7;
                              var10[3].field_y[var9 + -1 + (-var12 + var9 * var11)] = param7;
                              var10[7].field_y[var12 * param4 - -var11] = param7;
                              var10[5].field_y[var9 * var11 - -var12] = param7;
                              var12++;
                              if (var15 != 0) {
                                break L18;
                              } else {
                                continue L17;
                              }
                            }
                          }
                          if (var15 == 0) {
                            continue L15;
                          } else {
                            break L16;
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

    q(tf param0) {
        int var2 = 0;
        lk var3 = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        ((q) this).field_a = 0;
        ((q) this).field_g = new lk[param0.a(false)];
        var2 = 0;
        var3 = (lk) (Object) param0.g(24009);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              var3.c((byte) -109);
              int incrementValue$2 = var2;
              var2++;
              ((q) this).field_g[incrementValue$2] = var3;
              var3 = (lk) (Object) param0.c(33);
              if (var4 != 0) {
                break L1;
              } else {
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          return;
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
