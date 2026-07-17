/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static String[] field_b;
    static String field_a;

    final static void c(int param0) {
    }

    final static boolean a(byte param0) {
        int var1 = -57 / ((param0 - 35) / 35);
        return true;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 3) {
            return;
        }
        field_b = null;
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param0 != 100) {
            break L0;
          } else {
            if (ol.field_h > 0) {
              int fieldTemp$6 = ol.field_h - 1;
              ol.field_h = ol.field_h - 1;
              var2_ref_byte__ = di.field_E[fieldTemp$6];
              di.field_E[ol.field_h] = null;
              return var2_ref_byte__;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 != 5000) {
            break L1;
          } else {
            if (0 < bl.field_P) {
              int fieldTemp$7 = bl.field_P - 1;
              bl.field_P = bl.field_P - 1;
              var2_ref_byte__ = nk.field_b[fieldTemp$7];
              nk.field_b[bl.field_P] = null;
              return var2_ref_byte__;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (param0 != 30000) {
            break L2;
          } else {
            if (0 < oj.field_c) {
              int fieldTemp$8 = oj.field_c - 1;
              oj.field_c = oj.field_c - 1;
              var2_ref_byte__ = cd.field_j[fieldTemp$8];
              cd.field_j[oj.field_c] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != cg.field_i) {
            var2 = 0;
            L4: while (true) {
              if (var2 >= pe.field_gb.length) {
                break L3;
              } else {
                if (param0 == pe.field_gb[var2]) {
                  if (fk.field_v[var2] > 0) {
                    fk.field_v[var2] = fk.field_v[var2] - 1;
                    var3 = cg.field_i[var2][fk.field_v[var2] - 1];
                    cg.field_i[var2][fk.field_v[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L4;
                  }
                } else {
                  var2++;
                  continue L4;
                }
              }
            }
          } else {
            break L3;
          }
        }
        return new byte[param0];
    }

    final static void a(boolean param0, byte[] param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
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
        Object var16 = null;
        int var17 = 0;
        int var18 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var18 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              of.field_f = 0;
              wb.field_p = null;
              if (param2 == 24233) {
                break L1;
              } else {
                mf.a(-120);
                break L1;
              }
            }
            L2: {
              var4_int = 0;
              fg.field_N = 0;
              var6 = 5;
              if (param0) {
                int incrementValue$13 = var4_int;
                var4_int++;
                var7 = param1[incrementValue$13];
                if (var7 == 1) {
                  int incrementValue$14 = var4_int;
                  var4_int++;
                  fh.field_e = param1[incrementValue$14];
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            int incrementValue$15 = var4_int;
            var4_int++;
            var7 = param1[incrementValue$15];
            var5 = 0;
            L3: while (true) {
              L4: {
                if (6 <= var5) {
                  break L4;
                } else {
                  if ((var7 & 1 << var5) <= 0) {
                    var5++;
                    continue L3;
                  } else {
                    var5++;
                    break L4;
                  }
                }
              }
              L5: {
                if (var7 == 0) {
                  var5 = 0;
                  break L5;
                } else {
                  break L5;
                }
              }
              var4_int++;
              var8 = 0;
              L6: while (true) {
                if (var8 >= 64) {
                  L7: {
                    if (!param3) {
                      break L7;
                    } else {
                      L8: {
                        int incrementValue$16 = var4_int;
                        var4_int++;
                        var8 = param1[incrementValue$16];
                        if (var8 < 0) {
                          var8 = var8 + 256;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        int incrementValue$17 = var4_int;
                        var4_int++;
                        var9 = param1[incrementValue$17];
                        if (var9 < 0) {
                          var9 = 256 - -var9;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        L11: {
                          var14 = 0;
                          ea.field_g = new qe[(var8 << 8) + var9];
                          if (n.field_kb == null) {
                            break L11;
                          } else {
                            if (ba.field_i.field_a >= n.field_kb[0].length) {
                              break L11;
                            } else {
                              break L10;
                            }
                          }
                        }
                        n.field_kb = new int[64][][];
                        var5 = 0;
                        L12: while (true) {
                          if (var5 >= 64) {
                            break L10;
                          } else {
                            n.field_kb[var5] = new int[ba.field_i.field_a][];
                            var5++;
                            continue L12;
                          }
                        }
                      }
                      var15 = ea.field_e * 5;
                      var16 = null;
                      w.field_m = 0;
                      var5 = 0;
                      L13: while (true) {
                        if (~var5 <= ~ea.field_g.length) {
                          L14: {
                            if (var16 == null) {
                              break L14;
                            } else {
                              if (null == wb.field_p) {
                                break L14;
                              } else {
                                wb.field_p.field_r = ((qe) var16).field_r;
                                wb.field_p.field_f = ((qe) var16).field_f;
                                break L14;
                              }
                            }
                          }
                          ol.field_g = ba.field_i;
                          boolean discarded$18 = pg.d(0);
                          qk.field_lb = 0;
                          wj.field_a = 0;
                          cb.field_c = new int[w.field_m][4];
                          var5 = 0;
                          L15: while (true) {
                            if (~w.field_m >= ~var5) {
                              ch.a(bl.field_O[0], bl.field_O[1], 0);
                              break L7;
                            } else {
                              var17 = 0;
                              L16: while (true) {
                                if (var17 >= 4) {
                                  var5++;
                                  continue L15;
                                } else {
                                  cb.field_c[var5][var17] = -1;
                                  var17++;
                                  continue L16;
                                }
                              }
                            }
                          }
                        } else {
                          L17: {
                            int incrementValue$19 = var4_int;
                            var4_int++;
                            var10 = param1[incrementValue$19];
                            int incrementValue$20 = var4_int;
                            var4_int++;
                            var11 = param1[incrementValue$20];
                            int incrementValue$21 = var4_int;
                            var4_int++;
                            var12 = param1[incrementValue$21];
                            int incrementValue$22 = var4_int;
                            var4_int++;
                            var13 = param1[incrementValue$22];
                            ea.field_g[var5] = new qe(var11, var12, var10, var13);
                            if (var10 != 28) {
                              break L17;
                            } else {
                              cj.field_f = ea.field_g[var5];
                              break L17;
                            }
                          }
                          L18: {
                            if (var10 != 19) {
                              break L18;
                            } else {
                              int incrementValue$23 = var4_int;
                              var4_int++;
                              ea.field_g[var5].field_hb = param1[incrementValue$23];
                              break L18;
                            }
                          }
                          L19: {
                            L20: {
                              if (var10 == 8) {
                                break L20;
                              } else {
                                if (var10 == 9) {
                                  break L20;
                                } else {
                                  if (var10 == 10) {
                                    break L20;
                                  } else {
                                    if (var10 == 11) {
                                      break L20;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                            }
                            fg.field_N = fg.field_N + 1;
                            break L19;
                          }
                          L21: {
                            if (!vg.a(var10, param2 + -24234)) {
                              break L21;
                            } else {
                              L22: {
                                if (6 != var10) {
                                  break L22;
                                } else {
                                  if (var13 == 0) {
                                    break L21;
                                  } else {
                                    if (var13 == 2) {
                                      break L21;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                              }
                              of.field_f = of.field_f + 1;
                              break L21;
                            }
                          }
                          L23: {
                            ea.field_g[var5].field_y = var5;
                            int discarded$24 = kf.a(ea.field_g[var5], var5, 8);
                            if (var10 == 0) {
                              wb.field_p = ea.field_g[var5];
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          L24: {
                            if (15 == ea.field_g[var5].field_F) {
                              L25: {
                                bl.field_O[0][var14] = var12;
                                bl.field_O[1][var14] = var5;
                                ea.field_g[var5].field_V = var15;
                                if (0 < (pi.field_d[vj.field_c][ea.field_e] & 1 << -(var6 * ea.field_e) + var15)) {
                                  ea.field_g[var5].field_nb = true;
                                  if (~var15 == ~ci.field_n) {
                                    var16 = (Object) (Object) ea.field_g[var5];
                                    ci.field_n = -1;
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                } else {
                                  break L25;
                                }
                              }
                              ie.field_e[var15 + -(ea.field_e * 5)] = ea.field_g[var5];
                              var14++;
                              var15++;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          L26: {
                            if (6 != var10) {
                              break L26;
                            } else {
                              w.field_m = w.field_m + 1;
                              break L26;
                            }
                          }
                          var5++;
                          continue L13;
                        }
                      }
                    }
                  }
                  break L0;
                } else {
                  var9 = 0;
                  L27: while (true) {
                    if (var9 >= ba.field_i.field_a) {
                      var8++;
                      continue L6;
                    } else {
                      int incrementValue$25 = var4_int;
                      var4_int++;
                      ic.field_E[var8][var9] = param1[incrementValue$25];
                      var9++;
                      continue L27;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var4 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var4;
            stackOut_78_1 = new StringBuilder().append("mf.F(").append(param0).append(44);
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param1 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L28;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L28;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void b(int param0) {
        int[] var4 = null;
        int[] var6 = null;
        int[] var8 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        L0: {
          var4 = new int[]{5};
          var15 = lg.field_d[4];
          da.a(200, 440, var15[6] + var15[8], 61, var15[3], 4, var4);
          ug.field_i[4] = new pd(4, be.field_e);
          var16 = lg.field_d[2];
          var6 = new int[]{8, 9, 10, 5};
          da.a(var16[1], var16[2], var16[6] + var16[8], 74, var16[3], 2, var6);
          ug.field_i[2] = new pd(2, be.field_e);
          if (0 >= ee.field_o) {
            break L0;
          } else {
            if (ol.a((byte) -119, sh.field_u)) {
              var17 = lg.field_d[1];
              var8 = new int[]{1, 12, 13, 4, 31, 3, 7};
              da.a(var17[1], var17[2], var17[6] + var17[8], 118, var17[3], 1, var8);
              ug.field_i[1] = new pd(1, be.field_e);
              break L0;
            } else {
              break L0;
            }
          }
        }
        ll.field_b = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[255];
    }
}
