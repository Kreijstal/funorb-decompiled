/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class es {
    static String[][][] field_c;
    static ru[] field_d;
    int field_a;
    static String field_b;
    private og[] field_e;

    final og a(byte param0) {
        if (param0 != 13) {
            boolean discarded$0 = ((es) this).a(97);
        }
        ((es) this).field_a = ((es) this).field_a + 1;
        return ((es) this).field_e[((es) this).field_a];
    }

    public static void b(int param0) {
        if (param0 > -13) {
            es.b(-31);
        }
        field_b = null;
        field_d = null;
        field_c = null;
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_15_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (mg.field_e.field_q < param1) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        if (param0 < -63) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return true;
                    }
                    case 4: {
                        if (null == am.field_z) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return false;
                    }
                    case 7: {
                        try {
                            var2_int = am.field_z.d((byte) 43);
                            if (-1 <= (var2_int ^ -1)) {
                                statePc = 17;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (param1 + -mg.field_e.field_q < var2_int) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2_int = -mg.field_e.field_q + param1;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            am.field_z.a(0, mg.field_e.field_q, var2_int, mg.field_e.field_o);
                            iq.field_h = vi.b(46);
                            mg.field_e.field_q = mg.field_e.field_q + var2_int;
                            if (mg.field_e.field_q < param1) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
                    }
                    case 15: {
                        try {
                            mg.field_e.field_q = 0;
                            stackOut_15_0 = 1;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0 != 0;
                    }
                    case 17: {
                        try {
                            if (0 > var2_int) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (ca.b(0) <= 30000L) {
                                statePc = 21;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            dj.a((byte) -127);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        return false;
                    }
                    case 22: {
                        var2 = (IOException) (Object) caughtException;
                        dj.a((byte) -127);
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        return false;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0) {
        if (param0 <= 109) {
            field_d = null;
        }
        return ((es) this).field_a >= ((es) this).field_e.length ? true : false;
    }

    final static void a(int param0, int param1, au param2, int param3, boolean param4, int param5, byte param6, int param7) {
        int var8 = 0;
        int var9_int = 0;
        nf[] var9 = null;
        int var10 = 0;
        int[] var11_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        nf var14 = null;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        nf[][] stackIn_34_0 = null;
        nf[][] stackIn_35_0 = null;
        nf[][] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_69_0 = 0;
        nf[][] stackOut_33_0 = null;
        nf[][] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        nf[][] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        L0: {
          var16 = ArmiesOfGielinor.field_M ? 1 : 0;
          var8 = -49 % ((2 - param6) / 56);
          if (param3 < param1) {
            L1: {
              stackOut_33_0 = pu.field_k;
              stackIn_35_0 = stackOut_33_0;
              stackIn_34_0 = stackOut_33_0;
              if (param3 != 0) {
                stackOut_35_0 = (nf[][]) (Object) stackIn_35_0;
                stackOut_35_1 = 4 + param3;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                break L1;
              } else {
                stackOut_34_0 = (nf[][]) (Object) stackIn_34_0;
                stackOut_34_1 = 1;
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                break L1;
              }
            }
            L2: {
              var9 = (nf[]) (Object) stackIn_36_0[stackIn_36_1];
              var10 = 1;
              if (!param4) {
                break L2;
              } else {
                if (0 == param3) {
                  var11 = 0;
                  L3: while (true) {
                    if (var11 >= lm.field_e.length) {
                      break L2;
                    } else {
                      if ((ln.field_d[var11 / 8] & 1 << (var11 & 7)) != -1) {
                        var10 = 0;
                        break L2;
                      } else {
                        var11++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  var11 = 0;
                  L4: while (true) {
                    L5: {
                      if (var9.length + -1 <= var11) {
                        break L5;
                      } else {
                        if ((tg.field_d[(var11 + param0) / 8] & 1 << (param0 - -var11 & 7)) == 0) {
                          var11++;
                          continue L4;
                        } else {
                          var10 = 0;
                          break L5;
                        }
                      }
                    }
                    param0 = param0 + (255 & t.field_b[param3]);
                    break L2;
                  }
                }
              }
            }
            var11 = 0;
            var12 = 0;
            L6: while (true) {
              L7: {
                if (0 != param3) {
                  stackOut_53_0 = -1 + var9.length;
                  stackIn_54_0 = stackOut_53_0;
                  break L7;
                } else {
                  stackOut_52_0 = lm.field_e.length;
                  stackIn_54_0 = stackOut_52_0;
                  break L7;
                }
              }
              if ((stackIn_54_0 ^ -1) >= var12) {
                if (var11 != 0) {
                  break L0;
                } else {
                  var12 = 0;
                  L8: while (true) {
                    if (var12 >= var9.length - 1) {
                      break L0;
                    } else {
                      L9: {
                        if (-1 != param3) {
                          ur.field_B[param3] = (byte)var12;
                          break L9;
                        } else {
                          param7 = var12;
                          break L9;
                        }
                      }
                      es.a(param0, param1, param2, param3 + 1, param4, param5, (byte) -72, param7);
                      if (fc.field_a) {
                        return;
                      } else {
                        var12++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                L10: {
                  if (param3 == -1) {
                    param7 = var12;
                    break L10;
                  } else {
                    ur.field_B[param3] = (byte)var12;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    if (0 != param3) {
                      break L12;
                    } else {
                      if ((lm.field_e.length ^ -1) == -2) {
                        var13 = 1;
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var14 = var9[1 + var12];
                  if (param4) {
                    if (!var14.field_rb) {
                      if (var10 != 0) {
                        if (var14.field_xb) {
                          var13 = 1;
                          break L11;
                        } else {
                          var13 = 0;
                          break L11;
                        }
                      } else {
                        var13 = 0;
                        break L11;
                      }
                    } else {
                      var13 = 1;
                      break L11;
                    }
                  } else {
                    if ((param3 ^ -1) == 0) {
                      L13: {
                        if (vu.field_M.field_nc != lm.field_e[var12]) {
                          stackOut_68_0 = 0;
                          stackIn_69_0 = stackOut_68_0;
                          break L13;
                        } else {
                          stackOut_67_0 = 1;
                          stackIn_69_0 = stackOut_67_0;
                          break L13;
                        }
                      }
                      var13 = stackIn_69_0;
                      break L11;
                    } else {
                      if ((vu.field_M.field_pc[param3] & 255) != var12) {
                        var13 = 0;
                        break L11;
                      } else {
                        var13 = 1;
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  if (var13 == 0) {
                    break L14;
                  } else {
                    es.a(param0, param1, param2, param3 - -1, param4, param5, (byte) 120, param7);
                    var11 = 1;
                    break L14;
                  }
                }
                if (!fc.field_a) {
                  var12++;
                  continue L6;
                } else {
                  return;
                }
              }
            }
          } else {
            var9_int = 1;
            var10 = 0;
            L15: while (true) {
              if (fs.field_d.length <= var10) {
                if (var9_int != 0) {
                  fc.field_a = true;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var20 = fs.field_d[var10];
                var19 = var20;
                var18 = var19;
                var17 = var18;
                var11_ref_int__ = var17;
                var12 = 0;
                var13 = 0;
                L16: while (true) {
                  if (var13 >= var20.length) {
                    L17: {
                      if (var12 != 0) {
                        break L17;
                      } else {
                        if (param3 == tq.field_b) {
                          break L17;
                        } else {
                          var10++;
                          continue L15;
                        }
                      }
                    }
                    var9_int = 0;
                    var13 = 0;
                    L18: while (true) {
                      if (var20.length > var13) {
                        var14_int = var20[var13];
                        if (var14_int == -1) {
                          jp.field_a = true;
                          var13 += 2;
                          continue L18;
                        } else {
                          if (param3 > var14_int) {
                            dt.field_d[var14_int] = true;
                            var13 += 2;
                            continue L18;
                          } else {
                            var13 += 2;
                            continue L18;
                          }
                        }
                      } else {
                        var10++;
                        continue L15;
                      }
                    }
                  } else {
                    L19: {
                      var14_int = var20[var13];
                      var15 = var11_ref_int__[var13 - -1];
                      if (-1 != var14_int) {
                        L20: {
                          if (var14_int != param3) {
                            break L20;
                          } else {
                            if (var15 != param5) {
                              break L20;
                            } else {
                              var12 = 1;
                              var13 += 2;
                              continue L16;
                            }
                          }
                        }
                        if (param3 > var14_int) {
                          if (var15 == (255 & ur.field_B[var14_int])) {
                            break L19;
                          } else {
                            var10++;
                            continue L15;
                          }
                        } else {
                          var10++;
                          continue L15;
                        }
                      } else {
                        if (var15 == lm.field_e[param7]) {
                          break L19;
                        } else {
                          var10++;
                          continue L15;
                        }
                      }
                    }
                    var13 += 2;
                    continue L16;
                  }
                }
              }
            }
          }
        }
    }

    es(at param0) {
        ((es) this).field_a = 0;
        ((es) this).field_e = new og[param0.b(false)];
        int var2 = 0;
        og var3 = (og) (Object) param0.e((byte) 105);
        while (var3 != null) {
            var3.d(121);
            var2++;
            ((es) this).field_e[var2] = var3;
            var3 = (og) (Object) param0.a((byte) 123);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[][][]{new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[2][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][]};
        field_b = "Load Mission";
    }
}
