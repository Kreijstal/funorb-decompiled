/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static int field_b;
    static sg[] field_a;

    final static void a(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        jl var2 = null;
        int var3 = 0;
        oi var4 = null;
        jl stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        qj stackIn_12_0 = null;
        qj stackIn_13_0 = null;
        qj stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        jl stackOut_3_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = (jl) ((Object) ll.field_T.a((byte) -95));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2 == null) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        sj.a(-7812, param1, var2);
                        stackOut_3_0 = (jl) ((Object) ll.field_T.a(true));
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var3 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = stackIn_4_0;
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = qd.field_d.a((byte) -95);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = (oi) ((Object) stackIn_6_0);
                        if (!param0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        eg.a((byte) 21);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var4 == null) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        de.a(var4, param1, 2);
                        if (var3 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        return;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_13_0 = qd.field_d;
                        stackIn_12_0 = stackIn_13_0;
                        if (param0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_14_0 = (qj) ((Object) stackIn_12_0);
                        stackIn_14_1 = 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = (qj) ((Object) stackIn_13_0);
                        stackIn_14_1 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4 = (oi) ((Object) ((qj) (Object) stackIn_14_0).a(stackIn_14_1 != 0));
                        if (var3 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) runtimeException), "eg.D(" + param0 + ',' + param1 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        if (param0 <= 47) {
            byte[] var2 = (byte[]) null;
            eg.a(-121, (byte[]) null);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        vi.field_e = wh.a((byte) -122);
        ci.field_f = new da();
        wl.a(true, true, 170);
        if (param0 >= 54) {
            return;
        }
        eg.a((byte) -57);
    }

    final static void a(String param0, byte param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 != (rd.field_f ^ -1)) {
                break L1;
              } else {
                if ((el.field_d ^ -1) != 0) {
                  break L1;
                } else {
                  el.field_d = bk.field_a;
                  rd.field_f = oa.field_j;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                da.field_y = da.field_y + 1;
                if (param0 != null) {
                  if (param0.equals(tj.field_v)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (tj.field_v != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!lk.field_c) {
                  if (da.field_y >= bk.field_d) {
                    if (bk.field_d - -ek.field_g > da.field_y) {
                      stackIn_16_0 = 1;
                      break L4;
                    } else {
                      stackIn_16_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_16_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_16_0 = 0;
                  break L4;
                }
              }
              L5: {
                L6: {
                  var2_int = stackIn_16_0;
                  if (param0 == null) {
                    break L6;
                  } else {
                    if (lk.field_c) {
                      da.field_y = bk.field_d;
                      break L5;
                    } else {
                      if (var2_int != 0) {
                        da.field_y = bk.field_d;
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                da.field_y = 0;
                if (var3 == 0) {
                  break L5;
                } else {
                  da.field_y = bk.field_d;
                  break L5;
                }
              }
              L7: {
                if (param0 != null) {
                  lk.field_c = false;
                  break L7;
                } else {
                  if (var2_int == 0) {
                    break L7;
                  } else {
                    lk.field_c = true;
                    if (var3 == 0) {
                      break L7;
                    } else {
                      lk.field_c = false;
                      break L7;
                    }
                  }
                }
              }
              qi.field_d = rd.field_f;
              og.field_e = el.field_d;
              break L2;
            }
            L8: {
              tj.field_v = param0;
              if (param1 > 121) {
                break L8;
              } else {
                field_b = -62;
                break L8;
              }
            }
            L9: {
              if (lk.field_c) {
                break L9;
              } else {
                if (da.field_y >= bk.field_d) {
                  break L9;
                } else {
                  if (!tl.field_a) {
                    break L9;
                  } else {
                    og.field_e = el.field_d;
                    qi.field_d = rd.field_f;
                    da.field_y = 0;
                    break L9;
                  }
                }
              }
            }
            L10: {
              rd.field_f = -1;
              if (!lk.field_c) {
                break L10;
              } else {
                if (pi.field_j == da.field_y) {
                  da.field_y = 0;
                  lk.field_c = false;
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            el.field_d = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var2);

            stackIn_46_1 = new StringBuilder().append("eg.B(");

            if (param0 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L11;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L11;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param1 + ')');
        }
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 82) {
                break L1;
              } else {
                eg.a((byte) -117);
                break L1;
              }
            }
            stackIn_3_0 = cc.a(0, 15923, param1.length, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("eg.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
    }
}
