/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    String field_d;
    boolean field_c;
    String field_a;
    static String field_b;

    final static void a(boolean param0, byte param1) {
        int var2;
        int var3;
        L0: {
          L1: {
            var3 = OrbDefence.field_D ? 1 : 0;
            if (0 >= tc.field_b) {
              break L1;
            } else {
              if (null != ne.field_b) {
                L2: {
                  L3: {
                    mg.field_k = ne.field_b.c(126);
                    fh.a(17489, 2);
                    if (mg.field_k != null) {
                      break L3;
                    } else {
                      var2 = 3;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2 = 2;
                  l.a(mg.field_k, -80);
                  if (var3 == 0) {
                    break L2;
                  } else {
                    L4: {
                      if (n.b((byte) 127)) {
                        break L4;
                      } else {
                        var2 = 1;
                        break L4;
                      }
                    }
                    var2 = 0;
                    break L2;
                  }
                }
                if (null == ne.field_b) {
                  L5: {
                    if (fh.field_c) {
                      gb.a(true, var2, param0);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (param1 <= -119) {
                    return;
                  } else {
                    hb.a(108);
                    return;
                  }
                } else {
                  if (param1 > -119) {
                    hb.a(108);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                mg.field_k = wd.a(480, (byte) 109, 0, 0, wc.field_c, 640);
                if (var3 == 0) {
                  L6: {
                    if (mg.field_k != null) {
                      break L6;
                    } else {
                      var2 = 3;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var2 = 2;
                  l.a(mg.field_k, -80);
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  L7: {
                    L8: {
                      mg.field_k = ne.field_b.c(126);
                      fh.a(17489, 2);
                      if (mg.field_k != null) {
                        break L8;
                      } else {
                        var2 = 3;
                        if (var3 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var2 = 2;
                    l.a(mg.field_k, -80);
                    if (var3 == 0) {
                      break L7;
                    } else {
                      L9: {
                        if (n.b((byte) 127)) {
                          break L9;
                        } else {
                          var2 = 1;
                          break L9;
                        }
                      }
                      var2 = 0;
                      break L7;
                    }
                  }
                  L10: {
                    if (null != ne.field_b) {
                      break L10;
                    } else {
                      if (fh.field_c) {
                        gb.a(true, var2, param0);
                        break L10;
                      } else {
                        if (param1 > -119) {
                          hb.a(108);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (param1 > -119) {
                    hb.a(108);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
          L11: {
            if (n.b((byte) 127)) {
              break L11;
            } else {
              var2 = 1;
              if (var3 == 0) {
                break L0;
              } else {
                break L11;
              }
            }
          }
          var2 = 0;
          break L0;
        }
        L12: {
          if (null != ne.field_b) {
            break L12;
          } else {
            if (fh.field_c) {
              gb.a(true, var2, param0);
              break L12;
            } else {
              if (param1 > -119) {
                hb.a(108);
                return;
              } else {
                return;
              }
            }
          }
        }
        if (param1 > -119) {
          hb.a(108);
          return;
        } else {
          return;
        }
    }

    final static void b(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        fb var4 = null;
        qf var5_ref_qf = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        se var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var9 = cd.field_t;
                        if (param0 == 554553416) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_b = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = var9.b((byte) 90);
                        var3 = var9.b((byte) 90);
                        if (var2 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (1 != var2) {
                            statePc = 19;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4_int = var9.c(true);
                        var5_ref_qf = (qf) ((Object) vb.field_h.b((byte) -124));
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var5_ref_qf == null) {
                            statePc = 13;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_16_0 = var5_ref_qf.field_j;
                        stackIn_8_0 = stackIn_16_0;
                        stackIn_16_1 = var3;
                        stackIn_8_1 = stackIn_16_1;
                        if (var8 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 != stackIn_8_1) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var4_int != var5_ref_qf.field_i) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var8 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_ref_qf = (qf) ((Object) vb.field_h.d(853));
                        if (var8 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var5_ref_qf == null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = param0;
                        stackIn_16_1 = 554553381;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        th.a(stackIn_16_0 ^ stackIn_16_1);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return;
                }
                case 18: {
                    try {
                        var5_ref_qf.b(param0 ^ 554553457);
                        if (var8 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        pe.a((byte) -13, (Throwable) null, "LR1: " + sj.b(true));
                        th.a(106);
                        if (var8 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4 = (fb) ((Object) mg.field_l.b((byte) -41));
                        if (var4 == null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        th.a(113);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return;
                }
                case 25: {
                    try {
                        var5 = tf.field_c - var9.field_i;
                        var11 = var4.field_g;
                        var10 = var11;
                        var6 = var10;
                        if (var11.length << -1845973534 < var5) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var5 = var11.length << 791664770;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var7 = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var7 < var5) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var4.b(57);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var6[var7 >> -1453597886] = var6[var7 >> -1453597886] + (var9.b((byte) 90) << (vi.a(3, var7) << 554553416));
                        var7++;
                        if (var8 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var8 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4.b(57);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var1), "hb.C(" + param0 + ')');
                }
                case 37: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, hj param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        try {
            var9_int = -param0 + (param5 + param8.field_p + param1);
            var10 = param1 + (param8.field_p - (-param5 + -param6));
            var11 = param8.field_u - (-param7 - (param8.field_k >> -536031135));
            ul.i(var9_int, 0, var10, param2 + var11);
            param8.e(param5 + param4, param7 + -1, param3);
            param8.e(-1 + param5, param7 - -1, param3);
            ul.b(rh.field_e);
            ul.i(1 + var9_int, 0, var10 + 1, param2 + var11);
            param8.e(param5 - -1, -1 + param7, param3);
            param8.e(param5 - -1, 1 + param7, param3);
            ul.b(rh.field_e);
            var9_int = -param6 + param8.field_o + param8.field_p + (param5 + -param1);
            var10 = -param0 + (-param1 + (param5 + param8.field_o + param8.field_p));
            ul.i(var9_int, var11 + -param2, var10, 480);
            param8.e(-1 + param5, -1 + param7, param3);
            param8.e(-1 + param5, param7 - -1, param3);
            ul.b(rh.field_e);
            ul.i(var9_int + 1, var11 + -param2, var10 - -1, 480);
            param8.e(1 + param5, param7 - 1, param3);
            param8.e(1 + param5, param7 + 1, param3);
            ul.b(rh.field_e);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "hb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(long param0, int param1) {
        if (param0 > 0L) {
          if (param1 >= 93) {
            if (0L == param0 % 10L) {
              km.a(param0 + -1L, -25680);
              km.a(1L, -25680);
              if (OrbDefence.field_D) {
                km.a(param0, -25680);
                return;
              } else {
                return;
              }
            } else {
              km.a(param0, -25680);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 < 98) {
            field_b = (String) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_b = "Loading sound effects";
    }
}
