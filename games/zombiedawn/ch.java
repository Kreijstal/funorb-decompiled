/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static vn field_a;
    static int field_b;
    static String field_c;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
    }

    final static void b(int param0) {
        if (param0 <= 5) {
            return;
        }
        Object var2 = null;
        ph.a((byte) 62, (wj) null);
    }

    final static void a() {
        ac.field_m = 1426;
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        if (100 == param1) {
          if (qg.field_c > 0) {
            byte[][] fieldTemp$82 = ff.field_c;
            int fieldTemp$83 = qg.field_c - 1;
            qg.field_c = qg.field_c - 1;
            var2 = fieldTemp$82[fieldTemp$83];
            ff.field_c[qg.field_c] = null;
            return var2;
          } else {
            if (param1 != 5000) {
              if (param1 != 30000) {
                if (wg.field_j != null) {
                  var2_int = 0;
                  L0: while (true) {
                    if (fl.field_d.length <= var2_int) {
                      return new byte[param1];
                    } else {
                      L1: {
                        if (param1 != fl.field_d[var2_int]) {
                          var2_int++;
                          break L1;
                        } else {
                          if (ba.field_w[var2_int] > 0) {
                            ba.field_w[var2_int] = ba.field_w[var2_int] - 1;
                            var3 = wg.field_j[var2_int][ba.field_w[var2_int] - 1];
                            wg.field_j[var2_int][ba.field_w[var2_int]] = null;
                            return var3;
                          } else {
                            break L1;
                          }
                        }
                      }
                      var2_int++;
                      continue L0;
                    }
                  }
                } else {
                  return new byte[param1];
                }
              } else {
                if (kn.field_F > 0) {
                  int fieldTemp$84 = kn.field_F - 1;
                  kn.field_F = kn.field_F - 1;
                  var2 = sh.field_j[fieldTemp$84];
                  sh.field_j[kn.field_F] = null;
                  return var2;
                } else {
                  if (wg.field_j != null) {
                    var2_int = 0;
                    L2: while (true) {
                      if (fl.field_d.length <= var2_int) {
                        return new byte[param1];
                      } else {
                        L3: {
                          if (param1 != fl.field_d[var2_int]) {
                            var2_int++;
                            break L3;
                          } else {
                            if (ba.field_w[var2_int] > 0) {
                              ba.field_w[var2_int] = ba.field_w[var2_int] - 1;
                              var3 = wg.field_j[var2_int][ba.field_w[var2_int] - 1];
                              wg.field_j[var2_int][ba.field_w[var2_int]] = null;
                              return var3;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var2_int++;
                        continue L2;
                      }
                    }
                  } else {
                    return new byte[param1];
                  }
                }
              }
            } else {
              if (re.field_e > 0) {
                byte[][] fieldTemp$85 = ka.field_e;
                int fieldTemp$86 = re.field_e - 1;
                re.field_e = re.field_e - 1;
                var2 = fieldTemp$85[fieldTemp$86];
                ka.field_e[re.field_e] = null;
                return var2;
              } else {
                if (param1 != 30000) {
                  if (wg.field_j != null) {
                    var2_int = 0;
                    L4: while (true) {
                      if (fl.field_d.length <= var2_int) {
                        return new byte[param1];
                      } else {
                        L5: {
                          if (param1 != fl.field_d[var2_int]) {
                            var2_int++;
                            break L5;
                          } else {
                            if (ba.field_w[var2_int] > 0) {
                              ba.field_w[var2_int] = ba.field_w[var2_int] - 1;
                              var3 = wg.field_j[var2_int][ba.field_w[var2_int] - 1];
                              wg.field_j[var2_int][ba.field_w[var2_int]] = null;
                              return var3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var2_int++;
                        continue L4;
                      }
                    }
                  } else {
                    return new byte[param1];
                  }
                } else {
                  if (kn.field_F > 0) {
                    int fieldTemp$87 = kn.field_F - 1;
                    kn.field_F = kn.field_F - 1;
                    var2 = sh.field_j[fieldTemp$87];
                    sh.field_j[kn.field_F] = null;
                    return var2;
                  } else {
                    L6: {
                      if (wg.field_j != null) {
                        var2_int = 0;
                        if (fl.field_d.length <= var2_int) {
                          break L6;
                        } else {
                          L7: {
                            if (param1 != fl.field_d[var2_int]) {
                              var2_int++;
                              break L7;
                            } else {
                              if (ba.field_w[var2_int] > 0) {
                                ba.field_w[var2_int] = ba.field_w[var2_int] - 1;
                                var3 = wg.field_j[var2_int][ba.field_w[var2_int] - 1];
                                wg.field_j[var2_int][ba.field_w[var2_int]] = null;
                                return var3;
                              } else {
                                var2_int++;
                                break L7;
                              }
                            }
                          }
                          var2_int++;
                          var2_int++;
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    return new byte[param1];
                  }
                }
              }
            }
          }
        } else {
          if (param1 != 5000) {
            if (param1 != 30000) {
              if (wg.field_j != null) {
                L8: {
                  var2_int = 0;
                  if (fl.field_d.length <= var2_int) {
                    break L8;
                  } else {
                    L9: {
                      if (param1 != fl.field_d[var2_int]) {
                        var2_int++;
                        break L9;
                      } else {
                        if (ba.field_w[var2_int] > 0) {
                          ba.field_w[var2_int] = ba.field_w[var2_int] - 1;
                          var3 = wg.field_j[var2_int][ba.field_w[var2_int] - 1];
                          wg.field_j[var2_int][ba.field_w[var2_int]] = null;
                          return var3;
                        } else {
                          var2_int++;
                          break L9;
                        }
                      }
                    }
                    var2_int++;
                    var2_int++;
                    break L8;
                  }
                }
                return new byte[param1];
              } else {
                return new byte[param1];
              }
            } else {
              if (kn.field_F > 0) {
                int fieldTemp$88 = kn.field_F - 1;
                kn.field_F = kn.field_F - 1;
                var2 = sh.field_j[fieldTemp$88];
                sh.field_j[kn.field_F] = null;
                return var2;
              } else {
                L10: {
                  if (wg.field_j != null) {
                    var2_int = 0;
                    if (fl.field_d.length <= var2_int) {
                      break L10;
                    } else {
                      L11: {
                        if (param1 != fl.field_d[var2_int]) {
                          var2_int++;
                          break L11;
                        } else {
                          if (ba.field_w[var2_int] > 0) {
                            ba.field_w[var2_int] = ba.field_w[var2_int] - 1;
                            var3 = wg.field_j[var2_int][ba.field_w[var2_int] - 1];
                            wg.field_j[var2_int][ba.field_w[var2_int]] = null;
                            return var3;
                          } else {
                            var2_int++;
                            break L11;
                          }
                        }
                      }
                      var2_int++;
                      var2_int++;
                      var2_int++;
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
                return new byte[param1];
              }
            }
          } else {
            if (re.field_e > 0) {
              byte[][] fieldTemp$89 = ka.field_e;
              int fieldTemp$90 = re.field_e - 1;
              re.field_e = re.field_e - 1;
              var2 = fieldTemp$89[fieldTemp$90];
              ka.field_e[re.field_e] = null;
              return var2;
            } else {
              L12: {
                if (param1 != 30000) {
                  break L12;
                } else {
                  if (kn.field_F > 0) {
                    int fieldTemp$91 = kn.field_F - 1;
                    kn.field_F = kn.field_F - 1;
                    var2 = sh.field_j[fieldTemp$91];
                    sh.field_j[kn.field_F] = null;
                    return var2;
                  } else {
                    break L12;
                  }
                }
              }
              L13: {
                if (wg.field_j != null) {
                  var2_int = 0;
                  if (fl.field_d.length <= var2_int) {
                    break L13;
                  } else {
                    L14: {
                      if (param1 != fl.field_d[var2_int]) {
                        var2_int++;
                        break L14;
                      } else {
                        if (ba.field_w[var2_int] > 0) {
                          ba.field_w[var2_int] = ba.field_w[var2_int] - 1;
                          var3 = wg.field_j[var2_int][ba.field_w[var2_int] - 1];
                          wg.field_j[var2_int][ba.field_w[var2_int]] = null;
                          return var3;
                        } else {
                          var2_int++;
                          break L14;
                        }
                      }
                    }
                    var2_int++;
                    var2_int++;
                    var2_int++;
                    break L13;
                  }
                } else {
                  break L13;
                }
              }
              return new byte[param1];
            }
          }
        }
    }

    final static boolean a(CharSequence param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            int discarded$11 = 0;
            if (!vb.a(0, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3_int = 0;
              L1: while (true) {
                if (param0.length() <= var3_int) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  if (!jb.a((byte) 27, param0.charAt(var3_int))) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("ch.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 0 + 44 + 0 + 41);
        }
        return stackIn_13_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You don't seem to have completed all of the Mall and Power Plant levels yet. We recommend you do so before attempting the UK levels.";
    }
}
