/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static StringBuilder field_g;
    static gh field_a;
    static boolean field_b;
    static String field_f;
    static int field_c;
    static wk field_e;
    static String[] field_d;

    final static void a(na param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        byte stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_36_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 3) {
                    break L3;
                  } else {
                    uf.field_a[var2_int] = 0;
                    var2_int++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (~var2_int <= ~uc.field_a) {
                      break L6;
                    } else {
                      stackOut_9_0 = param0.field_k;
                      stackOut_9_1 = ph.field_e[var2_int].field_k;
                      stackIn_19_0 = stackOut_9_0;
                      stackIn_19_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        stackOut_10_0 = stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        L7: {
                          if (stackIn_12_0 == stackIn_12_1) {
                            int dupTemp$4 = ph.field_e[var2_int].a((byte) 58);
                            uf.field_a[dupTemp$4] = uf.field_a[dupTemp$4] + 1;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var2_int++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  int dupTemp$5 = param0.a((byte) 58);
                  uf.field_a[dupTemp$5] = uf.field_a[dupTemp$5] + 1;
                  stackOut_18_0 = param1;
                  stackOut_18_1 = -103;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L5;
                }
                if (stackIn_19_0 < stackIn_19_1) {
                  var2_int = 0;
                  var3 = 0;
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (uc.field_a <= var3) {
                          break L10;
                        } else {
                          stackOut_23_0 = ph.field_e[var3].field_k;
                          stackIn_37_0 = stackOut_23_0;
                          stackIn_24_0 = stackOut_23_0;
                          if (var5 != 0) {
                            break L9;
                          } else {
                            L11: {
                              L12: {
                                if (stackIn_24_0 == param0.field_k) {
                                  var4 = ph.field_e[var3].a((byte) 58);
                                  if (cj.field_h >= uf.field_a[var4]) {
                                    break L12;
                                  } else {
                                    uf.field_a[var4] = uf.field_a[var4] - 1;
                                    if (var5 == 0) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                } else {
                                  break L12;
                                }
                              }
                              int incrementValue$6 = var2_int;
                              var2_int++;
                              ph.field_e[incrementValue$6] = ph.field_e[var3];
                              break L11;
                            }
                            var3++;
                            if (var5 == 0) {
                              continue L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      stackOut_36_0 = var2_int;
                      stackIn_37_0 = stackOut_36_0;
                      break L9;
                    }
                    uc.field_a = stackIn_37_0;
                    int fieldTemp$7 = uc.field_a;
                    uc.field_a = uc.field_a + 1;
                    ph.field_e[fieldTemp$7] = param0;
                    break L0;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("tf.C(");
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L13;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L13;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == qf.field_e) {
                break L1;
              } else {
                pb.f(pb.field_i, pb.field_l, -pb.field_i + pb.field_b, pb.field_d - pb.field_l);
                qf.field_e.a(param1, (byte) 127);
                break L1;
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                field_a = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "tf.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        if (param0 != 26) {
            return;
        }
        try {
            field_a = null;
            field_f = null;
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "tf.B(" + param0 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 < 32) {
                break L1;
              } else {
                if (param1 <= 126) {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == 2459) {
              L2: {
                if (param1 < 160) {
                  break L2;
                } else {
                  if (param1 > 255) {
                    break L2;
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0 != 0;
                  }
                }
              }
              L3: {
                if (param1 == 8364) {
                  break L3;
                } else {
                  if (338 == param1) {
                    break L3;
                  } else {
                    if (8212 == param1) {
                      break L3;
                    } else {
                      if (param1 == 339) {
                        break L3;
                      } else {
                        if (param1 == 376) {
                          break L3;
                        } else {
                          stackOut_34_0 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_32_0 = 1;
              stackIn_33_0 = stackOut_32_0;
              return stackIn_33_0 != 0;
            } else {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "tf.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_35_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new StringBuilder(80);
        field_f = "Loading music";
        field_d = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
