/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static wd field_e;
    static pa field_i;
    static String field_f;
    static int field_g;
    private wt field_b;
    static vd[] field_a;
    private er field_d;
    private int field_c;
    private ph field_h;

    final static void a(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              rs.field_x = param0;
              oi.a(12, 20665);
              if (!param1) {
                break L1;
              } else {
                field_g = 25;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("qk.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final static ll[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        ll[] var10 = null;
        ll[] var11_ref_ll__ = null;
        int var11 = 0;
        int var12 = 0;
        ll var13 = null;
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
        var15 = AceOfSkies.field_G ? 1 : 0;
        var9 = param4 + (param1 + param5);
        var10 = new ll[]{new ll(var9, var9), new ll(param0, var9), new ll(var9, var9), new ll(var9, param0), new ll(64, 64), new ll(var9, param0), new ll(var9, var9), new ll(param0, var9), new ll(var9, var9)};
        var11_ref_ll__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var12 >= var11_ref_ll__.length) {
                break L2;
              } else {
                var13 = var11_ref_ll__[var12];
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
                        if (var14 >= var13.field_x.length) {
                          break L5;
                        } else {
                          var13.field_x[var14] = -27;
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
              if (var11 >= param4) {
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
                        var10[6].field_x[var9 * (-var11 + (var9 + -1)) + var12] = param2;
                        var10[8].field_x[(-var11 + (var9 - 1)) * var9 + var12] = param2;
                        var10[2].field_x[-var11 - -var9 + (-1 + var12 * var9)] = param2;
                        var10[8].field_x[-var11 - (-var9 + 1) + var12 * var9] = param2;
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
              stackOut_23_0 = var11;
              stackOut_23_1 = param4;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              L11: while (true) {
                L12: {
                  if (stackIn_24_0 >= stackIn_24_1) {
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
                        var10[0].field_x[var11 * var9 + var12] = param3;
                        var10[0].field_x[var11 + var12 * var9] = param3;
                        stackOut_27_0 = ~(var9 + -var11);
                        stackOut_27_1 = ~var12;
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
                    if (param0 <= var11) {
                      var11 = 0;
                      stackOut_41_0 = param7;
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
                            if (param4 <= var12) {
                              var11++;
                              break L16;
                            } else {
                              var10[7].field_x[(-1 + -var12 + var9) * param0 + var11] = param2;
                              var10[5].field_x[-var12 - (-var9 + 1 - var11 * var9)] = param2;
                              var10[1].field_x[var12 * param0 - -var11] = param3;
                              var10[3].field_x[var9 * var11 + var12] = param3;
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
                  L17: {
                    if (stackIn_42_0 <= -89) {
                      break L17;
                    } else {
                      ll[] discarded$1 = qk.a(-50, 101, 116, 1, 33, 12, 71, 24, -27);
                      break L17;
                    }
                  }
                  L18: while (true) {
                    L19: {
                      if (param0 >> 1 <= var11) {
                        break L19;
                      } else {
                        var12 = 0;
                        L20: while (true) {
                          L21: {
                            if (param5 <= var12) {
                              var11++;
                              break L21;
                            } else {
                              var10[1].field_x[var11 + (-1 + (-var12 + var9)) * param0] = param6;
                              var10[3].field_x[var9 * var11 + -1 + (var9 - var12)] = param6;
                              var10[7].field_x[var12 * param0 - -var11] = param6;
                              var10[5].field_x[var9 * var11 + var12] = param6;
                              var12++;
                              if (var15 != 0) {
                                break L21;
                              } else {
                                continue L20;
                              }
                            }
                          }
                          if (var15 == 0) {
                            continue L18;
                          } else {
                            break L19;
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

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_e = null;
        field_f = null;
        field_i = null;
    }

    final void a(wt param0, int param1, long param2) {
        RuntimeException runtimeException = null;
        wt var5 = null;
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
        try {
          L0: {
            L1: {
              L2: {
                if (((qk) this).field_c == 0) {
                  break L2;
                } else {
                  ((qk) this).field_c = ((qk) this).field_c - 1;
                  if (!AceOfSkies.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = ((qk) this).field_d.b(param1 + -18522);
              var5.c(-126);
              var5.d(-119);
              if (((qk) this).field_b != var5) {
                break L1;
              } else {
                var5 = ((qk) this).field_d.b(param1 + -18522);
                var5.c(-128);
                var5.d(param1 + -125);
                break L1;
              }
            }
            ((qk) this).field_h.a(125, param2, (wf) (Object) param0);
            ((qk) this).field_d.a(param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("qk.A(");
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
          throw pn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(byte param0) {
        wo var1 = (wo) (Object) pu.field_b.b(param0 + 4187);
        if (var1 == null) {
            var1 = new wo();
        }
        var1.a(vp.field_i, 251, vp.field_c, vp.field_f, vp.field_b, vp.field_d, vp.field_j, vp.field_k);
        bo.field_i.a(104, (wf) (Object) var1);
        if (param0 != -92) {
            field_e = null;
        }
    }

    final wt a(byte param0, long param1) {
        if (param0 != -27) {
            field_g = 50;
        }
        wt var4 = (wt) (Object) ((qk) this).field_h.a((byte) 106, param1);
        if (!(var4 == null)) {
            ((qk) this).field_d.a(2, var4);
        }
        return var4;
    }

    qk(int param0) {
        ((qk) this).field_b = new wt();
        ((qk) this).field_d = new er();
        ((qk) this).field_c = param0;
        int var2 = 1;
        while (param0 > var2 + var2) {
            var2 = var2 + var2;
        }
        ((qk) this).field_h = new ph(var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You have 1 unread message!";
    }
}
