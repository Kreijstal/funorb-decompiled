/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static boolean field_c;
    static String field_b;
    static String field_a;
    static int field_d;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 21) {
            field_c = false;
        }
    }

    final static void a(o[] param0, int param1, int param2, int param3, byte param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param3 <= 0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        var5_int = param0[0].field_q;
                        var6 = param0[2].field_q;
                        var7 = param0[1].field_q;
                        param0[0].d(param1, param2);
                        param0[2].d(-var6 + param1 + param3, param2);
                        mi.b(ql.field_q);
                        mi.d(var5_int + param1, param2, param1 + param3 + -var6, param0[1].field_r + param2);
                        var8 = param1 - -var5_int;
                        var9 = param1 + (param3 + -var6);
                        param1 = var8;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var9 <= param1) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param0[1].d(param1, param2);
                        param1 = param1 + var7;
                        if (var11 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var11 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        mi.a(ql.field_q);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10 = -88 % ((-22 - param4) / 53);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (var5);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("je.G(");
                    stackIn_14_1 = stackIn_15_1;
                    if (param0 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw fc.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static o[] a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = -125 % ((param1 - 30) / 35);
        return md.a(param2, param3, param0, param4, 1, -1, 1, 3, 1);
    }

    final synchronized static long a(int param0) {
        long var1;
        var1 = System.currentTimeMillis();
        if (qf.field_b <= var1) {
          if (param0 != 1) {
            je.a((byte) 110);
            qf.field_b = var1;
            return var1 + of.field_e;
          } else {
            qf.field_b = var1;
            return var1 + of.field_e;
          }
        } else {
          of.field_e = of.field_e + (qf.field_b + -var1);
          if (param0 == 1) {
            qf.field_b = var1;
            return var1 + of.field_e;
          } else {
            je.a((byte) 110);
            qf.field_b = var1;
            return var1 + of.field_e;
          }
        }
    }

    final static boolean a(ia param0, ia param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                field_c = false;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = param0.field_jb - param1.field_jb;
                if (param0.field_gb != qa.field_r) {
                  break L3;
                } else {
                  var3_int -= 200;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (param0.field_gb == null) {
                var3_int += 200;
                break L2;
              } else {
                break L2;
              }
            }
            L4: {
              L5: {
                if (qa.field_r != param1.field_gb) {
                  break L5;
                } else {
                  var3_int += 200;
                  if (var4 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (null == param1.field_gb) {
                var3_int -= 200;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (0 >= var3_int) {
                stackIn_18_0 = 0;
                break L6;
              } else {
                stackIn_18_0 = 1;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("je.F(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param2 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 <= -59) {
              if (null != kf.field_G) {
                var3_int = 0;
                L1: while (true) {
                  L2: {
                    if (kf.field_G.length <= var3_int) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        L3: {
                          if (null == kf.field_G[var3_int]) {
                            break L3;
                          } else {
                            kf.field_G[var3_int].a((byte) 117, param2, param1);
                            break L3;
                          }
                        }
                        var3_int++;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) runtimeException), "je.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0) {
        if (param0) {
          L0: {
            je.a(false);
            if (lf.field_d != null) {
              lf.field_d.d(2);
              lf.field_d = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (lf.field_d != null) {
              lf.field_d.d(2);
              lf.field_d = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        field_b = "Waiting for music";
        field_a = "Player";
        field_d = 0;
    }
}
