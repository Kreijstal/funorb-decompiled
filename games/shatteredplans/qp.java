/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends o {
    static String field_v;
    private int field_y;
    private int field_u;
    private bi[] field_t;
    static in field_w;
    private int field_x;

    final static int[] a(boolean param0, int[] param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        Object stackIn_17_0 = null;
        Object stackIn_61_0 = null;
        int[] stackIn_63_0 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_62_0 = null;
        Object stackOut_60_0 = null;
        Object stackOut_16_0 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = param1.length;
                if (null == ai.field_b) {
                  break L2;
                } else {
                  if (ai.field_b.length >= var2_int * 2) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ai.field_b = new int[2 * var2_int];
              en.field_b = new int[var2_int * 2];
              break L1;
            }
            sl.field_r = 0;
            var5 = param1[var2_int - 2];
            var6 = param1[-1 + var2_int];
            var7_int = 0;
            L3: while (true) {
              if (var7_int >= var2_int) {
                if (sl.field_r != 0) {
                  var7 = en.field_b;
                  en.field_b = ai.field_b;
                  ai.field_b = var7;
                  var2_int = sl.field_r;
                  sl.field_r = 0;
                  var5 = en.field_b[var2_int + -2];
                  var6 = en.field_b[-1 + var2_int];
                  var8_int = 0;
                  L4: while (true) {
                    if (var2_int <= var8_int) {
                      if (sl.field_r != 0) {
                        var7 = en.field_b;
                        en.field_b = ai.field_b;
                        ai.field_b = var7;
                        var2_int = sl.field_r;
                        sl.field_r = 0;
                        var5 = en.field_b[var2_int + -2];
                        var6 = en.field_b[var2_int + -1];
                        var8_int = 0;
                        L5: while (true) {
                          if (var2_int <= var8_int) {
                            if (0 != sl.field_r) {
                              var7 = en.field_b;
                              en.field_b = ai.field_b;
                              var2_int = sl.field_r;
                              ai.field_b = var7;
                              sl.field_r = 0;
                              var6 = en.field_b[-1 + var2_int];
                              var5 = en.field_b[var2_int - 2];
                              var8_int = 0;
                              L6: while (true) {
                                if (var8_int >= var2_int) {
                                  if (sl.field_r != 0) {
                                    var17 = new int[sl.field_r];
                                    var16 = var17;
                                    var15 = var16;
                                    var14 = var15;
                                    var8 = var14;
                                    ps.a(ai.field_b, 0, var17, 0, sl.field_r);
                                    stackOut_62_0 = (int[]) var8;
                                    stackIn_63_0 = stackOut_62_0;
                                    break L0;
                                  } else {
                                    stackOut_60_0 = null;
                                    stackIn_61_0 = stackOut_60_0;
                                    return (int[]) (Object) stackIn_61_0;
                                  }
                                } else {
                                  L7: {
                                    var3 = var5;
                                    var4 = var6;
                                    var5 = en.field_b[var8_int];
                                    var6 = en.field_b[1 + var8_int];
                                    if (var6 >= gf.field_f) {
                                      if (var4 < gf.field_f) {
                                        var9 = var3;
                                        var10 = var4;
                                        var11 = var5;
                                        var12 = var6;
                                        int fieldTemp$22 = sl.field_r;
                                        sl.field_r = sl.field_r + 1;
                                        ai.field_b[fieldTemp$22] = (gf.field_f - var10) * (var11 + -var9) / (var12 - var10) + var9;
                                        int fieldTemp$23 = sl.field_r;
                                        sl.field_r = sl.field_r + 1;
                                        ai.field_b[fieldTemp$23] = gf.field_f;
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    } else {
                                      L8: {
                                        if (gf.field_f <= var4) {
                                          var9 = var5;
                                          var10 = var6;
                                          var11 = var3;
                                          var12 = var4;
                                          int fieldTemp$24 = sl.field_r;
                                          sl.field_r = sl.field_r + 1;
                                          ai.field_b[fieldTemp$24] = (-var9 + var11) * (gf.field_f - var10) / (var12 - var10) + var9;
                                          int fieldTemp$25 = sl.field_r;
                                          sl.field_r = sl.field_r + 1;
                                          ai.field_b[fieldTemp$25] = gf.field_f;
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      }
                                      int fieldTemp$26 = sl.field_r;
                                      sl.field_r = sl.field_r + 1;
                                      ai.field_b[fieldTemp$26] = var5;
                                      int fieldTemp$27 = sl.field_r;
                                      sl.field_r = sl.field_r + 1;
                                      ai.field_b[fieldTemp$27] = var6;
                                      break L7;
                                    }
                                  }
                                  var8_int += 2;
                                  continue L6;
                                }
                              }
                            } else {
                              return null;
                            }
                          } else {
                            L9: {
                              var4 = var6;
                              var3 = var5;
                              var6 = en.field_b[var8_int + 1];
                              var5 = en.field_b[var8_int];
                              if (var6 >= gf.field_a) {
                                L10: {
                                  if (var4 < gf.field_a) {
                                    var9 = var5;
                                    var10 = var6;
                                    var11 = var3;
                                    var12 = var4;
                                    int fieldTemp$28 = sl.field_r;
                                    sl.field_r = sl.field_r + 1;
                                    ai.field_b[fieldTemp$28] = var9 + (-var9 + var11) * (-var10 + gf.field_a) / (var12 - var10);
                                    int fieldTemp$29 = sl.field_r;
                                    sl.field_r = sl.field_r + 1;
                                    ai.field_b[fieldTemp$29] = gf.field_a;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                int fieldTemp$30 = sl.field_r;
                                sl.field_r = sl.field_r + 1;
                                ai.field_b[fieldTemp$30] = var5;
                                int fieldTemp$31 = sl.field_r;
                                sl.field_r = sl.field_r + 1;
                                ai.field_b[fieldTemp$31] = var6;
                                break L9;
                              } else {
                                if (var4 >= gf.field_a) {
                                  var9 = var3;
                                  var10 = var4;
                                  var11 = var5;
                                  var12 = var6;
                                  int fieldTemp$32 = sl.field_r;
                                  sl.field_r = sl.field_r + 1;
                                  ai.field_b[fieldTemp$32] = var9 - -((gf.field_a + -var10) * (-var9 + var11) / (-var10 + var12));
                                  int fieldTemp$33 = sl.field_r;
                                  sl.field_r = sl.field_r + 1;
                                  ai.field_b[fieldTemp$33] = gf.field_a;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var8_int += 2;
                            continue L5;
                          }
                        }
                      } else {
                        return null;
                      }
                    } else {
                      L11: {
                        var3 = var5;
                        var4 = var6;
                        var6 = en.field_b[1 + var8_int];
                        var5 = en.field_b[var8_int];
                        if (gf.field_l > var5) {
                          L12: {
                            if (var3 >= gf.field_l) {
                              var9 = var5;
                              var10 = var6;
                              var11 = var3;
                              var12 = var4;
                              int fieldTemp$34 = sl.field_r;
                              sl.field_r = sl.field_r + 1;
                              ai.field_b[fieldTemp$34] = gf.field_l;
                              int fieldTemp$35 = sl.field_r;
                              sl.field_r = sl.field_r + 1;
                              ai.field_b[fieldTemp$35] = (var12 - var10) * (-var9 + gf.field_l) / (var11 + -var9) + var10;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          int fieldTemp$36 = sl.field_r;
                          sl.field_r = sl.field_r + 1;
                          ai.field_b[fieldTemp$36] = var5;
                          int fieldTemp$37 = sl.field_r;
                          sl.field_r = sl.field_r + 1;
                          ai.field_b[fieldTemp$37] = var6;
                          break L11;
                        } else {
                          if (var3 < gf.field_l) {
                            var9 = var3;
                            var10 = var4;
                            var11 = var5;
                            var12 = var6;
                            int fieldTemp$38 = sl.field_r;
                            sl.field_r = sl.field_r + 1;
                            ai.field_b[fieldTemp$38] = gf.field_l;
                            int fieldTemp$39 = sl.field_r;
                            sl.field_r = sl.field_r + 1;
                            ai.field_b[fieldTemp$39] = var10 - -((-var10 + var12) * (gf.field_l + -var9) / (-var9 + var11));
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var8_int += 2;
                      continue L4;
                    }
                  }
                } else {
                  stackOut_16_0 = null;
                  stackIn_17_0 = stackOut_16_0;
                  return (int[]) (Object) stackIn_17_0;
                }
              } else {
                var3 = var5;
                var4 = var6;
                var5 = param1[var7_int];
                var6 = param1[var7_int + 1];
                if (gf.field_i <= var5) {
                  L13: {
                    if (gf.field_i > var3) {
                      var8_int = var5;
                      var9 = var6;
                      var10 = var3;
                      var11 = var4;
                      int fieldTemp$40 = sl.field_r;
                      sl.field_r = sl.field_r + 1;
                      ai.field_b[fieldTemp$40] = gf.field_i;
                      int fieldTemp$41 = sl.field_r;
                      sl.field_r = sl.field_r + 1;
                      ai.field_b[fieldTemp$41] = var9 - -((-var8_int + gf.field_i) * (-var9 + var11) / (var10 + -var8_int));
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  int fieldTemp$42 = sl.field_r;
                  sl.field_r = sl.field_r + 1;
                  ai.field_b[fieldTemp$42] = var5;
                  int fieldTemp$43 = sl.field_r;
                  sl.field_r = sl.field_r + 1;
                  ai.field_b[fieldTemp$43] = var6;
                  var7_int += 2;
                  continue L3;
                } else {
                  L14: {
                    if (gf.field_i > var3) {
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  var7_int += 2;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var2 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) var2;
            stackOut_64_1 = new StringBuilder().append("qp.B(").append(true).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param1 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L15;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L15;
            }
          }
          throw r.a((Throwable) (Object) stackIn_67_0, stackIn_67_2 + ')');
        }
        return stackIn_63_0;
    }

    public qp() {
        this(2188450, 2591221, 9543);
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == 12) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            L2: {
              if (!param0.field_k) {
                if (param0.f(1)) {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_8_0 = stackOut_5_0;
                  break L2;
                }
              } else {
                stackOut_3_0 = 1;
                stackIn_8_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var6_int = stackIn_8_0;
              if (param0 instanceof kg) {
                param2 = param2 & ((kg) (Object) param0).field_y;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2) {
                if (var6_int != 0) {
                  stackOut_15_0 = ((qp) this).field_x;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = ((qp) this).field_y;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              } else {
                stackOut_12_0 = ((qp) this).field_u;
                stackIn_16_0 = stackOut_12_0;
                break L4;
              }
            }
            L5: {
              var7 = stackIn_16_0;
              mj.a(param0.field_x, 2, var7, param3 + param0.field_q + (param0.field_n - ((qp) this).field_t[0].field_p >> 1), param0.field_m + param1, ((qp) this).field_t);
              if (param2) {
                stackOut_18_0 = 16777215;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = 7105644;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            var8 = stackIn_19_0;
            int discarded$1 = ((qp) this).field_c.a(param0.field_s, param1 - -param0.field_m, -2 + param0.field_q + param3, param0.field_x, param0.field_n, var8, -1, 1, 1, ((qp) this).field_c.field_J);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("qp.E(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static bi[] a(int param0, int param1, int param2) {
        int var3 = 124 % ((-27 - param1) / 41);
        return cr.a(param0, 1, -10, param2);
    }

    public static void b() {
        field_w = null;
        field_v = null;
    }

    private qp(int param0, int param1, int param2) {
        ((qp) this).field_t = kl.field_q;
        ((qp) this).field_y = param0;
        ((qp) this).field_c = sl.field_p;
        ((qp) this).field_x = param1;
        ((qp) this).field_u = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
