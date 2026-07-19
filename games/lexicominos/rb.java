/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static ng field_b;
    static byte[][] field_c;
    static dg field_d;
    static String field_e;
    static int field_a;

    final static void a(byte param0, String param1) {
        try {
            sa.a((byte) 68, param1);
            int var2_int = -34 / ((-25 - param0) / 58);
            m.a(ca.field_o, -127, false);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "rb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static db[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        db[] var10 = null;
        db[] var11_ref_db__ = null;
        int var11 = 0;
        int var12 = 0;
        db var13 = null;
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
        var15 = Lexicominos.field_L ? 1 : 0;
        var9 = param1 + (param0 + param3);
        var10 = new db[]{new db(var9, var9), new db(param7, var9), new db(var9, var9), new db(var9, param7), new db(64, 64), new db(var9, param7), new db(var9, var9), new db(param7, var9), new db(var9, var9)};
        var11_ref_db__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var12 >= var11_ref_db__.length) {
                break L2;
              } else {
                var13 = var11_ref_db__[var12];
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
                          var13.field_y[var14] = param2;
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
                      if (var9 <= var12) {
                        var11++;
                        break L9;
                      } else {
                        var10[6].field_y[var9 * (-var11 + (var9 - 1)) - -var12] = param6;
                        var10[8].field_y[var9 * (-1 + var9 - var11) - -var12] = param6;
                        var10[2].field_y[-var11 - (1 + -var9 - var9 * var12)] = param6;
                        var10[8].field_y[var9 - 1 - var11 + var12 * var9] = param6;
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
                      if (var9 <= var12) {
                        var11++;
                        continue L10;
                      } else {
                        var10[0].field_y[var12 - -(var9 * var11)] = param4;
                        var10[0].field_y[var11 + var9 * var12] = param4;
                        stackOut_27_0 = var12 ^ -1;
                        stackOut_27_1 = -var11 + var9 ^ -1;
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
                    if (param7 <= var11) {
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
                            if (param0 <= var12) {
                              var11++;
                              break L16;
                            } else {
                              var10[7].field_y[var11 + (-1 + -var12 + var9) * param7] = param6;
                              var10[5].field_y[-var12 - 1 - -var9 + var9 * var11] = param6;
                              var10[1].field_y[var11 + var12 * param7] = param4;
                              var10[3].field_y[var12 + var11 * var9] = param4;
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
                  if (stackIn_42_0 != 1) {
                    return (db[]) null;
                  } else {
                    var11 = 0;
                    L17: while (true) {
                      L18: {
                        if (param7 >> 1353960321 <= var11) {
                          break L18;
                        } else {
                          var12 = 0;
                          L19: while (true) {
                            L20: {
                              if (param1 <= var12) {
                                var11++;
                                break L20;
                              } else {
                                var10[1].field_y[var11 + param7 * (var9 + (-var12 - 1))] = param8;
                                var10[3].field_y[-var12 + (var9 - (1 - var11 * var9))] = param8;
                                var10[7].field_y[var11 + var12 * param7] = param8;
                                var10[5].field_y[var11 * var9 + var12] = param8;
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

    final static void a(boolean param0) {
        cg var1 = (cg) ((Object) ca.field_n.a(true));
        if (!(var1 != null)) {
            ck.b((byte) -120);
            return;
        }
        th var2 = ig.field_a;
        if (param0) {
            String var3 = (String) null;
            rb.a((byte) -12, (String) null);
        }
        int discarded$0 = var2.d((byte) 19);
        int discarded$1 = var2.d((byte) 19);
        int discarded$2 = var2.d((byte) 19);
        int discarded$3 = var2.d((byte) 19);
        var1.b((byte) -121);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != 50) {
            field_b = (ng) null;
        }
        field_e = null;
        field_c = (byte[][]) null;
    }

    final static void a(String param0, boolean param1, boolean param2, int param3) {
        wj.c(param3 ^ -8662);
        if (param3 != 14635) {
            return;
        }
        try {
            ug.field_A.h(0);
            eb.field_b = new ti(dd.field_d, (String) null, ca.field_k, param2, param1);
            di.field_x = new qj(ug.field_A, eb.field_b);
            ug.field_A.a(-14579, di.field_x);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "rb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_c = new byte[250][];
        field_b = new ng();
        field_d = new dg();
        field_e = "This password contains your email address, and would be easy to guess";
    }
}
