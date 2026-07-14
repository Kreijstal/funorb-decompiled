/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static String field_a;
    private ri field_e;
    static at field_h;
    static boolean field_f;
    private kl field_c;
    private kl field_d;
    static String field_g;
    static boolean field_b;

    final static void a(boolean param0, int param1) {
        try {
            tq.a(param0, true, param1 ^ -81);
            if (param1 != -5) {
                field_g = null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "bl.B(" + param0 + 44 + param1 + 41);
        }
    }

    final static String b(int param0) {
        RuntimeException var1 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        String stackIn_16_0 = null;
        Object stackIn_18_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        String stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 2) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_f = false;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (ei.field_b) {
                            statePc = 17;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = ev.field_a;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 < bb.field_c) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = ps.field_E;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((stackIn_10_0 + bb.field_c ^ -1) < (ev.field_a ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = ts.field_a;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return (String) (Object) stackIn_16_0;
                }
                case 17: {
                    try {
                        stackOut_17_0 = null;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return (String) (Object) stackIn_18_0;
                }
                case 19: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw ig.a((Throwable) (Object) var1, "bl.F(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        dj.a(param0, 0, "");
                        if (param1) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        t.a((byte) -118, param0);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) runtimeException;
                        stackOut_5_1 = new StringBuilder().append("bl.G(");
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (param0 == null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                        stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                        stackOut_6_2 = "{...}";
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_9_2 = stackOut_6_2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 8: {
                    stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                    stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                    stackOut_8_2 = "null";
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    throw ig.a((Throwable) (Object) stackIn_9_0, (String) (Object) (stackIn_9_2 + 44 + param1 + 41));
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        try {
            field_g = null;
            int var1_int = 69 / ((-73 - param0) / 51);
            field_a = null;
            field_h = null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "bl.A(" + param0 + 41);
        }
    }

    final static void a(byte param0) {
        bv var1 = null;
        int var2 = 0;
        of var3_ref_of = null;
        int var3 = 0;
        long var3_long = 0L;
        au var3_ref_au = null;
        au var4 = null;
        int var4_int = 0;
        au var4_ref = null;
        String var5_ref = null;
        int var5 = 0;
        au var5_ref_au = null;
        String var6 = null;
        String var7 = null;
        of var8_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_14_0 = 0;
        of stackIn_21_0 = null;
        of stackIn_22_0 = null;
        of stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        String stackIn_111_0 = null;
        String stackIn_112_0 = null;
        String stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        boolean stackIn_167_0 = false;
        boolean stackIn_168_0 = false;
        int stackIn_178_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        of stackOut_20_0 = null;
        of stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        of stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        String stackOut_110_0 = null;
        String stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        String stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        boolean stackOut_166_0 = false;
        boolean stackOut_167_0 = false;
        int stackOut_177_0 = 0;
        L0: {
          L1: {
            L2: {
              var11 = ArmiesOfGielinor.field_M ? 1 : 0;
              var1 = mg.field_e;
              var2 = ((vh) (Object) var1).k(0);
              if (var2 == 0) {
                break L2;
              } else {
                if ((var2 ^ -1) == -2) {
                  break L2;
                } else {
                  if ((var2 ^ -1) == -3) {
                    break L2;
                  } else {
                    if ((var2 ^ -1) == -4) {
                      break L2;
                    } else {
                      if (-5 == (var2 ^ -1)) {
                        break L2;
                      } else {
                        L3: {
                          if (var2 != 5) {
                            break L3;
                          } else {
                            L4: {
                              var3_long = ((vh) (Object) var1).j((byte) -2);
                              var5_ref = ((vh) (Object) var1).g(1);
                              var6 = ((vh) (Object) var1).g(1);
                              var7 = ((vh) (Object) var1).g(1);
                              var8_ref = tr.a((byte) 121, var3_long);
                              if (var6.equals((Object) (Object) "")) {
                                stackOut_13_0 = 0;
                                stackIn_14_0 = stackOut_13_0;
                                break L4;
                              } else {
                                stackOut_12_0 = 1;
                                stackIn_14_0 = stackOut_12_0;
                                break L4;
                              }
                            }
                            L5: {
                              L6: {
                                var9 = stackIn_14_0;
                                if (var8_ref == null) {
                                  break L6;
                                } else {
                                  if (var9 == 0) {
                                    break L5;
                                  } else {
                                    var8_ref.a((byte) 53, var7, var5_ref);
                                    if (var11 == 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var8_ref = new of(var5_ref, var7, var3_long);
                              oi.field_d.a(-1, var3_long, (ms) (Object) var8_ref);
                              break L5;
                            }
                            L7: {
                              var8_ref.field_Vb = vi.b(82) - (long)((vh) (Object) var1).i(1);
                              var8_ref.field_Sb = ((vh) (Object) var1).e((byte) -104);
                              var10 = ((vh) (Object) var1).h(-27);
                              stackOut_20_0 = (of) var8_ref;
                              stackIn_22_0 = stackOut_20_0;
                              stackIn_21_0 = stackOut_20_0;
                              if (-1 == (1 & var10 ^ -1)) {
                                stackOut_22_0 = (of) (Object) stackIn_22_0;
                                stackOut_22_1 = 0;
                                stackIn_23_0 = stackOut_22_0;
                                stackIn_23_1 = stackOut_22_1;
                                break L7;
                              } else {
                                stackOut_21_0 = (of) (Object) stackIn_21_0;
                                stackOut_21_1 = 1;
                                stackIn_23_0 = stackOut_21_0;
                                stackIn_23_1 = stackOut_21_1;
                                break L7;
                              }
                            }
                            ((of) (Object) stackIn_23_0).field_Zb = stackIn_23_1 != 0;
                            var8_ref.field_Xb = var10 >> -583261311;
                            var8_ref.field_Qb = ((vh) (Object) var1).k(0);
                            var8_ref.field_Ob = ((vh) (Object) var1).k(0);
                            sf.a((byte) -115, var8_ref);
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L8: {
                          if ((var2 ^ -1) != -7) {
                            break L8;
                          } else {
                            L9: {
                              var3_long = ((vh) (Object) var1).j((byte) -2);
                              var5 = ((vh) (Object) var1).k(0);
                              var6 = (String) (Object) tr.a((byte) 121, var3_long);
                              if (null == var6) {
                                break L9;
                              } else {
                                L10: {
                                  if (!((of) (Object) var6).field_Ub) {
                                    break L10;
                                  } else {
                                    vj.field_a = vj.field_a - 1;
                                    ((of) (Object) var6).field_Ub = false;
                                    break L10;
                                  }
                                }
                                L11: {
                                  L12: {
                                    if (-1 == (var5 ^ -1)) {
                                      break L12;
                                    } else {
                                      ((of) (Object) var6).field_Rb = qd.field_K;
                                      ((of) (Object) var6).field_Kb = var5;
                                      if (var11 == 0) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  ((of) (Object) var6).d(126);
                                  break L11;
                                }
                                ((of) (Object) var6).c((byte) -76);
                                break L9;
                              }
                            }
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L13: {
                          if ((var2 ^ -1) != -8) {
                            break L13;
                          } else {
                            var3_ref_of = (of) (Object) be.field_u.e((byte) 106);
                            L14: while (true) {
                              L15: {
                                L16: {
                                  if (var3_ref_of == null) {
                                    break L16;
                                  } else {
                                    var3_ref_of.d(122);
                                    var3_ref_of.c((byte) -76);
                                    var3_ref_of = (of) (Object) be.field_u.a((byte) 123);
                                    if (var11 != 0) {
                                      break L15;
                                    } else {
                                      if (var11 == 0) {
                                        continue L14;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                                vj.field_a = 0;
                                break L15;
                              }
                              if (var11 == 0) {
                                break L1;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                        L17: {
                          if (8 != var2) {
                            break L17;
                          } else {
                            L18: {
                              var3 = ((vh) (Object) var1).e((byte) -104);
                              var4 = (au) (Object) qm.field_J.a((byte) -27, (long)var3);
                              if (null == var4) {
                                var4_ref = new au(tq.field_b);
                                qm.field_J.a(-1, (long)var3, (ms) (Object) var4_ref);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            hh.a(var4_ref, true, (vh) (Object) var1, 78);
                            rf.a(-107, var4_ref);
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L19: {
                          if (var2 != 9) {
                            break L19;
                          } else {
                            L20: {
                              var3 = ((vh) (Object) var1).e((byte) -104);
                              var4_int = ((vh) (Object) var1).k(0);
                              var5_ref_au = (au) (Object) qm.field_J.a((byte) -27, (long)var3);
                              if (null == var5_ref_au) {
                                break L20;
                              } else {
                                L21: {
                                  L22: {
                                    if (var4_int != 0) {
                                      break L22;
                                    } else {
                                      var5_ref_au.d(118);
                                      if (var11 == 0) {
                                        break L21;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                  var5_ref_au.field_Lb = qd.field_K;
                                  var5_ref_au.field_mc = var4_int;
                                  break L21;
                                }
                                var5_ref_au.c((byte) -76);
                                break L20;
                              }
                            }
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L19;
                            }
                          }
                        }
                        L23: {
                          if (var2 == 10) {
                            break L23;
                          } else {
                            L24: {
                              if (-12 == (var2 ^ -1)) {
                                break L24;
                              } else {
                                if ((var2 ^ -1) == -13) {
                                  break L24;
                                } else {
                                  L25: {
                                    if (-14 != (var2 ^ -1)) {
                                      break L25;
                                    } else {
                                      L26: {
                                        var3 = ((vh) (Object) var1).e((byte) -104);
                                        var4_int = ((vh) (Object) var1).k(0);
                                        var5_ref_au = (au) (Object) qm.field_J.a((byte) -27, (long)var3);
                                        if (null == var5_ref_au) {
                                          break L26;
                                        } else {
                                          L27: {
                                            var5_ref_au.field_gc = false;
                                            var6 = (String) (Object) var5_ref_au;
                                            ((au) (Object) var6).field_Nb = false;
                                            if ((var4_int ^ -1) != -1) {
                                              var5_ref_au.field_mc = var4_int;
                                              var5_ref_au.field_Lb = qd.field_K;
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          rf.a(-127, var5_ref_au);
                                          break L26;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  L28: {
                                    L29: {
                                      if (14 == var2) {
                                        break L29;
                                      } else {
                                        if (var2 != 16) {
                                          break L28;
                                        } else {
                                          break L29;
                                        }
                                      }
                                    }
                                    L30: {
                                      var3_long = ((vh) (Object) var1).j((byte) -2);
                                      var5_ref = (String) (Object) tr.a((byte) 121, var3_long);
                                      if (null != var5_ref) {
                                        L31: {
                                          L32: {
                                            if ((var2 ^ -1) == -15) {
                                              break L32;
                                            } else {
                                              if (!((of) (Object) var5_ref).field_Ub) {
                                                ((of) (Object) var5_ref).field_Ub = true;
                                                vj.field_a = vj.field_a + 1;
                                                if (var11 == 0) {
                                                  break L31;
                                                } else {
                                                  break L32;
                                                }
                                              } else {
                                                break L31;
                                              }
                                            }
                                          }
                                          ((of) (Object) var5_ref).field_Wb = true;
                                          break L31;
                                        }
                                        sf.a((byte) 66, (of) (Object) var5_ref);
                                        break L30;
                                      } else {
                                        break L30;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L1;
                                    } else {
                                      break L28;
                                    }
                                  }
                                  L33: {
                                    L34: {
                                      if (var2 == 15) {
                                        break L34;
                                      } else {
                                        if ((var2 ^ -1) != -18) {
                                          break L33;
                                        } else {
                                          break L34;
                                        }
                                      }
                                    }
                                    L35: {
                                      var3_long = ((vh) (Object) var1).j((byte) -2);
                                      var5 = ((vh) (Object) var1).k(0);
                                      var6 = (String) (Object) tr.a((byte) 121, var3_long);
                                      if (var6 != null) {
                                        L36: {
                                          if (-1 == (var5 ^ -1)) {
                                            break L36;
                                          } else {
                                            ((of) (Object) var6).field_Rb = qd.field_K;
                                            ((of) (Object) var6).field_Kb = var5;
                                            break L36;
                                          }
                                        }
                                        L37: {
                                          L38: {
                                            if (var2 != 15) {
                                              break L38;
                                            } else {
                                              ((of) (Object) var6).field_Wb = false;
                                              if (var11 == 0) {
                                                break L37;
                                              } else {
                                                break L38;
                                              }
                                            }
                                          }
                                          if (((of) (Object) var6).field_Ub) {
                                            ((of) (Object) var6).field_Ub = false;
                                            vj.field_a = vj.field_a - 1;
                                            break L37;
                                          } else {
                                            break L37;
                                          }
                                        }
                                        sf.a((byte) 107, (of) (Object) var6);
                                        break L35;
                                      } else {
                                        break L35;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L1;
                                    } else {
                                      break L33;
                                    }
                                  }
                                  L39: {
                                    if ((var2 ^ -1) != -19) {
                                      break L39;
                                    } else {
                                      L40: {
                                        var3_long = ((vh) (Object) var1).j((byte) -2);
                                        var5_ref = ((vh) (Object) var1).g(1);
                                        var6 = ((vh) (Object) var1).g(1);
                                        var7 = (String) (Object) hr.a(var3_long, -79);
                                        if (var7 != null) {
                                          break L40;
                                        } else {
                                          var7 = (String) (Object) new of(var5_ref, var6, var3_long);
                                          eu.field_e.a(-1, var3_long, (ms) (Object) var7);
                                          vu.field_M.field_Ub = vu.field_M.field_Ub + 1;
                                          break L40;
                                        }
                                      }
                                      L41: {
                                        ((of) (Object) var7).field_Sb = ((vh) (Object) var1).e((byte) -104);
                                        var8 = ((vh) (Object) var1).h(120);
                                        ((of) (Object) var7).field_Xb = var8 >> 1006963553;
                                        stackOut_110_0 = (String) var7;
                                        stackIn_112_0 = stackOut_110_0;
                                        stackIn_111_0 = stackOut_110_0;
                                        if (-1 == (var8 & 1 ^ -1)) {
                                          stackOut_112_0 = (String) (Object) stackIn_112_0;
                                          stackOut_112_1 = 0;
                                          stackIn_113_0 = stackOut_112_0;
                                          stackIn_113_1 = stackOut_112_1;
                                          break L41;
                                        } else {
                                          stackOut_111_0 = (String) (Object) stackIn_111_0;
                                          stackOut_111_1 = 1;
                                          stackIn_113_0 = stackOut_111_0;
                                          stackIn_113_1 = stackOut_111_1;
                                          break L41;
                                        }
                                      }
                                      ((of) (Object) stackIn_113_0).field_Zb = stackIn_113_1 != 0;
                                      ((of) (Object) var7).field_Qb = ((vh) (Object) var1).k(0);
                                      ((of) (Object) var7).field_Ob = ((vh) (Object) var1).k(0);
                                      wl.field_F.a((byte) -119, (tc) (Object) var7);
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                  L42: {
                                    if (19 != var2) {
                                      break L42;
                                    } else {
                                      L43: {
                                        var3_long = ((vh) (Object) var1).j((byte) -2);
                                        var5 = ((vh) (Object) var1).k(0);
                                        var6 = (String) (Object) hr.a(var3_long, -111);
                                        if (null == var6) {
                                          break L43;
                                        } else {
                                          L44: {
                                            L45: {
                                              if (0 == var5) {
                                                break L45;
                                              } else {
                                                ((of) (Object) var6).field_Rb = qd.field_K;
                                                ((of) (Object) var6).field_Kb = var5;
                                                if (var11 == 0) {
                                                  break L44;
                                                } else {
                                                  break L45;
                                                }
                                              }
                                            }
                                            ((of) (Object) var6).d(68);
                                            break L44;
                                          }
                                          ((of) (Object) var6).c((byte) -76);
                                          vu.field_M.field_Ub = vu.field_M.field_Ub - 1;
                                          break L43;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L42;
                                      }
                                    }
                                  }
                                  L46: {
                                    if ((var2 ^ -1) == -21) {
                                      break L46;
                                    } else {
                                      L47: {
                                        if (21 != var2) {
                                          break L47;
                                        } else {
                                          L48: {
                                            L49: {
                                              var3 = ((vh) (Object) var1).e((byte) -104);
                                              if (var3 == 0) {
                                                break L49;
                                              } else {
                                                ph.field_d = vi.b(-59) - -(long)var3;
                                                if (var11 == 0) {
                                                  break L48;
                                                } else {
                                                  break L49;
                                                }
                                              }
                                            }
                                            ph.field_d = 0L;
                                            break L48;
                                          }
                                          if (var11 == 0) {
                                            break L1;
                                          } else {
                                            break L47;
                                          }
                                        }
                                      }
                                      L50: {
                                        if (-23 != (var2 ^ -1)) {
                                          break L50;
                                        } else {
                                          al.field_g = ((vh) (Object) var1).e((byte) -104);
                                          be.field_s = ((vh) (Object) var1).h(95);
                                          if (var11 == 0) {
                                            break L1;
                                          } else {
                                            break L50;
                                          }
                                        }
                                      }
                                      L51: {
                                        if (var2 != 23) {
                                          break L51;
                                        } else {
                                          oh.field_H = ((vh) (Object) var1).j((byte) -2);
                                          if (var11 == 0) {
                                            break L1;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                      af.a((Throwable) null, 118, "L1: " + cm.b(false));
                                      dj.a((byte) -124);
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                  hh.a(vu.field_M, false, (vh) (Object) var1, 83);
                                  if (var11 == 0) {
                                    break L1;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                            L52: {
                              var3 = ((vh) (Object) var1).e((byte) -104);
                              var4 = (au) (Object) qm.field_J.a((byte) -27, (long)var3);
                              if (null == var4) {
                                break L52;
                              } else {
                                L53: {
                                  L54: {
                                    if (-12 != (var2 ^ -1)) {
                                      break L54;
                                    } else {
                                      var4.field_Nb = true;
                                      if (var11 == 0) {
                                        break L53;
                                      } else {
                                        break L54;
                                      }
                                    }
                                  }
                                  var4.field_gc = true;
                                  break L53;
                                }
                                rf.a(-121, var4);
                                break L52;
                              }
                            }
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L23;
                            }
                          }
                        }
                        var3_ref_au = (au) (Object) qc.field_g.e((byte) 105);
                        L55: while (true) {
                          L56: {
                            if (var3_ref_au == null) {
                              break L56;
                            } else {
                              var3_ref_au.d(-112);
                              var3_ref_au.c((byte) -76);
                              var3_ref_au = (au) (Object) qc.field_g.a((byte) 123);
                              if (var11 != 0) {
                                break L1;
                              } else {
                                if (var11 == 0) {
                                  continue L55;
                                } else {
                                  break L56;
                                }
                              }
                            }
                          }
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            var3_ref_of = (of) (Object) wl.field_F.e((byte) 93);
            L57: while (true) {
              L58: {
                L59: {
                  if (var3_ref_of == null) {
                    break L59;
                  } else {
                    var3_ref_of.d(99);
                    var3_ref_of.c((byte) -76);
                    var3_ref_of = (of) (Object) wl.field_F.a((byte) 123);
                    if (var11 != 0) {
                      break L58;
                    } else {
                      if (var11 == 0) {
                        continue L57;
                      } else {
                        break L59;
                      }
                    }
                  }
                }
                var3_ref_of = (of) (Object) oi.field_d.a((byte) 66);
                break L58;
              }
              L60: while (true) {
                L61: {
                  L62: {
                    if (var3_ref_of == null) {
                      break L62;
                    } else {
                      stackOut_166_0 = var3_ref_of.field_Wb;
                      stackIn_178_0 = stackOut_166_0 ? 1 : 0;
                      stackIn_167_0 = stackOut_166_0;
                      if (var11 != 0) {
                        break L61;
                      } else {
                        stackOut_167_0 = stackIn_167_0;
                        stackIn_168_0 = stackOut_167_0;
                        L63: {
                          L64: {
                            if (stackIn_168_0) {
                              break L64;
                            } else {
                              if (var3_ref_of.field_Ub) {
                                break L64;
                              } else {
                                break L63;
                              }
                            }
                          }
                          L65: {
                            if (!var3_ref_of.field_Ub) {
                              break L65;
                            } else {
                              vj.field_a = vj.field_a - 1;
                              var3_ref_of.field_Ub = false;
                              break L65;
                            }
                          }
                          var3_ref_of.field_Wb = false;
                          sf.a((byte) 122, var3_ref_of);
                          break L63;
                        }
                        var3_ref_of = (of) (Object) oi.field_d.c(1);
                        if (var11 == 0) {
                          continue L60;
                        } else {
                          break L62;
                        }
                      }
                    }
                  }
                  stackOut_177_0 = 1;
                  stackIn_178_0 = stackOut_177_0;
                  break L61;
                }
                L66: {
                  if (stackIn_178_0 != var2) {
                    break L66;
                  } else {
                    if (vu.field_M == null) {
                      break L66;
                    } else {
                      ql.field_e = vu.field_M.field_rc;
                      break L66;
                    }
                  }
                }
                L67: {
                  L68: {
                    if (4 == var2) {
                      break L68;
                    } else {
                      vu.field_M = null;
                      if (var11 == 0) {
                        break L67;
                      } else {
                        break L68;
                      }
                    }
                  }
                  var3 = ((vh) (Object) var1).e((byte) -104);
                  vu.field_M = new au(tq.field_b);
                  vu.field_M.a(true, (long)var3);
                  hh.a(vu.field_M, false, (vh) (Object) var1, 97);
                  ph.field_d = 0L;
                  break L67;
                }
                L69: {
                  L70: {
                    L71: {
                      if (2 == var2) {
                        break L71;
                      } else {
                        if ((var2 ^ -1) != -4) {
                          break L70;
                        } else {
                          break L71;
                        }
                      }
                    }
                    if (null != no.field_K) {
                      break L69;
                    } else {
                      no.field_K = new au(tq.field_b);
                      if (var11 == 0) {
                        break L69;
                      } else {
                        break L70;
                      }
                    }
                  }
                  no.field_K = null;
                  break L69;
                }
                L72: {
                  if (3 == var2) {
                    break L72;
                  } else {
                    ua.field_s = false;
                    if (var11 == 0) {
                      break L1;
                    } else {
                      break L72;
                    }
                  }
                }
                ua.field_s = true;
                var3 = 0;
                L73: while (true) {
                  L74: {
                    L75: {
                      if ((var3 ^ -1) <= (ln.field_d.length ^ -1)) {
                        break L75;
                      } else {
                        ln.field_d[var3] = ((vh) (Object) var1).a((byte) -1);
                        var3++;
                        if (var11 != 0) {
                          break L74;
                        } else {
                          if (var11 == 0) {
                            continue L73;
                          } else {
                            break L75;
                          }
                        }
                      }
                    }
                    nh.field_E = ((vh) (Object) var1).k(0);
                    sm.field_b = ((vh) (Object) var1).k(0);
                    break L74;
                  }
                  var3 = 0;
                  L76: while (true) {
                    if ((tg.field_d.length ^ -1) >= (var3 ^ -1)) {
                      break L1;
                    } else {
                      tg.field_d[var3] = ((vh) (Object) var1).a((byte) -106);
                      var3++;
                      if (var11 != 0) {
                        break L0;
                      } else {
                        if (var11 == 0) {
                          continue L76;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if (param0 < -36) {
            break L0;
          } else {
            String discarded$1 = bl.b(122);
            break L0;
          }
        }
    }

    final va a(int param0, boolean param1) {
        va var3 = null;
        va var3_ref = null;
        RuntimeException var3_ref2 = null;
        byte[] var4 = null;
        va stackIn_6_0 = null;
        va stackIn_20_0 = null;
        va stackOut_5_0 = null;
        va stackOut_19_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_g = null;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = (va) ((bl) this).field_e.a((long)param0, (byte) 122);
                        if (var3 == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (va) var3;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return (va) (Object) stackIn_6_0;
                }
                case 7: {
                    try {
                        if (-32769 < (param0 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = ((bl) this).field_c.a((byte) 94, 32767 & param0, 0);
                        if (!ArmiesOfGielinor.field_M) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = ((bl) this).field_d.a((byte) 98, param0, 0);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var3_ref = new va();
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (null == var4) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3_ref.a((byte) -91, new vh(var4));
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param0 >= 32768) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var3_ref.g(30);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((bl) this).field_e.a((Object) (Object) var3_ref, 100, (long)param0);
                        stackOut_19_0 = (va) var3_ref;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return (va) (Object) stackIn_20_0;
                }
                case 21: {
                    var3_ref2 = (RuntimeException) (Object) caughtException;
                    throw ig.a((Throwable) (Object) var3_ref2, "bl.E(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, kl param1) {
        RuntimeException var2 = null;
        String var2_ref = null;
        int var3 = 0;
        String var4 = null;
        js var5 = null;
        int var6 = 0;
        int var7 = 0;
        js stackIn_5_0 = null;
        byte stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        js stackIn_50_0 = null;
        js stackIn_52_0 = null;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        js stackOut_4_0 = null;
        byte stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        js stackOut_49_0 = null;
        js stackOut_50_0 = null;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        mb.field_B = param1;
                        var2_ref = "";
                        nh.field_D = new boolean[mn.field_m.length];
                        var3 = param0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (mn.field_m.length <= var3) {
                            statePc = 45;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        mn.field_k[var3] = new kk[mn.field_m[var3].length];
                        nh.field_D[var3] = false;
                        var4 = mn.field_m[var3][0];
                        var5 = hs.a(var4, 235, var2_ref);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (js) var5;
                        stackIn_52_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var7 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 != null) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 == 0) {
                            statePc = 43;
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
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (76 != var3) {
                            statePc = 17;
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
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        pd.field_d = var5;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!th.a(var5, -17900)) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        nh.field_D[var3] = true;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (null != var5.field_p) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((var6 ^ -1) <= (var5.field_O ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = var5.field_p[var6];
                        stackOut_26_1 = 2;
                        stackIn_36_0 = stackOut_26_0;
                        stackIn_36_1 = stackOut_26_1;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        if (var7 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 != stackIn_27_1) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var5.field_q[var6] = 0;
                        var5.field_o[var6] = 0;
                        var5.field_r[var6] = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var6++;
                        if (var7 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        mn.field_k[var3][0] = var5.a(be.field_x, fm.field_a, ol.field_A, lf.field_t, ni.field_a);
                        var6 = 1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = var6;
                        stackOut_35_1 = mn.field_m[var3].length;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 >= stackIn_36_1) {
                            statePc = 43;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        mn.field_k[var3][var6] = null;
                        var6++;
                        if (var7 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var7 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var3++;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var3 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var3 >= cs.field_W.length) {
                            statePc = 69;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var4 = cs.field_W[var3];
                        var5 = hs.a(var4, 235, var2_ref);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var7 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = (js) var5;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = (js) (Object) stackIn_50_0;
                        stackIn_52_0 = stackOut_50_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (((js) (Object) stackIn_52_0).field_p == null) {
                            statePc = 63;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var6 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var6 ^ -1) <= (var5.field_O ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackOut_55_0 = var5.field_p[var6] ^ -1;
                        stackOut_55_1 = -3;
                        stackIn_64_0 = stackOut_55_0;
                        stackIn_64_1 = stackOut_55_1;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        if (var7 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 != stackIn_56_1) {
                            statePc = 62;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var5.field_q[var6] = 0;
                        var5.field_o[var6] = 0;
                        var5.field_r[var6] = 0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var6++;
                        if (var7 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        cs.field_db[var3] = var5.a(be.field_x, fm.field_a, ol.field_A, lf.field_t, ni.field_a);
                        stackOut_63_0 = -1;
                        stackOut_63_1 = ((gd) (Object) cs.field_db[var3]).field_I ^ -1;
                        stackIn_64_0 = stackOut_63_0;
                        stackIn_64_1 = stackOut_63_1;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 != stackIn_64_1) {
                            statePc = 68;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        cs.field_db[var3] = null;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var3++;
                        if (var7 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        fn.a(false, 76, -32596);
                        tm.b(0.75f);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 71: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    try {
                        stackOut_72_0 = (RuntimeException) var2;
                        stackOut_72_1 = new StringBuilder().append("bl.D(").append(param0).append(44);
                        stackIn_75_0 = stackOut_72_0;
                        stackIn_75_1 = stackOut_72_1;
                        stackIn_73_0 = stackOut_72_0;
                        stackIn_73_1 = stackOut_72_1;
                        if (param1 == null) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
                        stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
                        stackOut_73_2 = "{...}";
                        stackIn_76_0 = stackOut_73_0;
                        stackIn_76_1 = stackOut_73_1;
                        stackIn_76_2 = stackOut_73_2;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 74: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 75: {
                    stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
                    stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
                    stackOut_75_2 = "null";
                    stackIn_76_0 = stackOut_75_0;
                    stackIn_76_1 = stackOut_75_1;
                    stackIn_76_2 = stackOut_75_2;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    throw ig.a((Throwable) (Object) stackIn_76_0, (String) (Object) (stackIn_76_2 + 41));
                }
                case 77: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    bl(int param0, kl param1, kl param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((bl) this).field_e = new ri(64);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((bl) this).field_c = param2;
                        ((bl) this).field_d = param1;
                        if (((bl) this).field_d == null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        int discarded$6 = ((bl) this).field_d.d(0, -2);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (null == ((bl) this).field_c) {
                            statePc = 18;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        int discarded$7 = ((bl) this).field_c.d(0, -2);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) runtimeException;
                        stackOut_9_1 = new StringBuilder().append("bl.<init>(").append(param0).append(44);
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (param1 == null) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                        stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                        stackOut_10_2 = "{...}";
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_13_2 = stackOut_10_2;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 12: {
                    stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                    stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                    stackOut_12_2 = "null";
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (param2 == null) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                        stackOut_14_2 = "{...}";
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_17_2 = stackOut_14_2;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 16: {
                    stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                    stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                    stackOut_16_2 = "null";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw ig.a((Throwable) (Object) stackIn_17_0, (String) (Object) (stackIn_17_2 + 41));
                }
                case 18: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Talons and hooks with which to swipe from above, improving aerial attacks.";
        field_h = new at();
        field_g = "Not yet achieved";
        field_b = true;
    }
}
