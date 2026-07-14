/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq {
    static String field_a;
    static String field_c;
    int field_b;
    static String field_d;

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_30_0 = 0;
        int stackOut_29_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        var6 = param1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!param4) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        tq.a(true, (java.applet.Applet) null);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = -param1;
                        var8 = -1;
                        var9 = pk.a((byte) -14, ib.field_a, param0 - -param1, ap.field_e);
                        var10 = pk.a((byte) -14, ib.field_a, param0 + -param1, ap.field_e);
                        ki.a(-110, var10, vl.field_e[param2], var9, param3);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var6 ^ -1) >= (var5_int ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 += 2;
                        var7 = var7 + var8;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var15 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-1 <= (var7 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6--;
                        var7 = var7 - (var6 << -871283871);
                        var11 = param2 - var6;
                        var12 = param2 + var6;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var12 < ua.field_e) {
                            statePc = 27;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (cj.field_D < var11) {
                            statePc = 27;
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
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var13 = pk.a((byte) -14, ib.field_a, param0 - -var5_int, ap.field_e);
                        var14 = pk.a((byte) -14, ib.field_a, param0 - var5_int, ap.field_e);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var12 ^ -1) >= (cj.field_D ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ki.a(-123, var14, vl.field_e[var12], var13, param3);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (ua.field_e <= var11) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ki.a(-86, var14, vl.field_e[var11], var13, param3);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var5_int++;
                        var11 = -var5_int + param2;
                        var12 = var5_int + param2;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var12 ^ -1) > (ua.field_e ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = var11;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 <= cj.field_D) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var13 = pk.a((byte) -14, ib.field_a, var6 + param0, ap.field_e);
                        var14 = pk.a((byte) -14, ib.field_a, -var6 + param0, ap.field_e);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((cj.field_D ^ -1) > (var12 ^ -1)) {
                            statePc = 40;
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
                        ki.a(-88, var14, vl.field_e[var12], var13, param3);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var11 ^ -1) <= (ua.field_e ^ -1)) {
                            statePc = 43;
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
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ki.a(-97, var14, vl.field_e[var11], var13, param3);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var15 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw wn.a((Throwable) (Object) var5, "tq.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        mi var1 = null;
        int var2 = 0;
        bs var3 = null;
        int var3_int = 0;
        long var3_long = 0L;
        uh var3_ref = null;
        uh var4 = null;
        uh var4_ref = null;
        int var4_int = 0;
        String var5 = null;
        int var5_int = 0;
        uh var5_ref = null;
        String var6 = null;
        String var7 = null;
        bs var8_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        boolean stackIn_19_0 = false;
        boolean stackIn_20_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_68_0 = 0;
        bs stackIn_74_0 = null;
        bs stackIn_75_0 = null;
        bs stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        String stackIn_142_0 = null;
        String stackIn_143_0 = null;
        String stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        boolean stackOut_18_0 = false;
        boolean stackOut_19_0 = false;
        int stackOut_30_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        bs stackOut_73_0 = null;
        bs stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        bs stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        String stackOut_141_0 = null;
        String stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        String stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        var1 = id.field_f;
        if (param0 == -66) {
          L0: {
            L1: {
              L2: {
                var2 = ((ed) (Object) var1).h(-11);
                if (var2 == 0) {
                  break L2;
                } else {
                  if ((var2 ^ -1) == -2) {
                    break L2;
                  } else {
                    if (-3 == (var2 ^ -1)) {
                      break L2;
                    } else {
                      if (-4 == (var2 ^ -1)) {
                        break L2;
                      } else {
                        if ((var2 ^ -1) != -5) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              var3 = (bs) (Object) kq.field_Rb.a((byte) 100);
              L3: while (true) {
                L4: {
                  L5: {
                    if (null == var3) {
                      break L5;
                    } else {
                      var3.c(2);
                      var3.a(-117);
                      var3 = (bs) (Object) kq.field_Rb.b(param0 + 181);
                      if (var11 != 0) {
                        break L4;
                      } else {
                        if (var11 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var3 = (bs) (Object) kd.field_l.b(-128);
                  break L4;
                }
                L6: while (true) {
                  L7: {
                    L8: {
                      if (var3 == null) {
                        break L8;
                      } else {
                        stackOut_18_0 = var3.field_Yb;
                        stackIn_31_0 = stackOut_18_0 ? 1 : 0;
                        stackIn_19_0 = stackOut_18_0;
                        if (var11 != 0) {
                          break L7;
                        } else {
                          stackOut_19_0 = stackIn_19_0;
                          stackIn_20_0 = stackOut_19_0;
                          L9: {
                            L10: {
                              if (stackIn_20_0) {
                                break L10;
                              } else {
                                if (!var3.field_Ob) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (var3.field_Ob) {
                                kk.field_j = kk.field_j - 1;
                                var3.field_Ob = false;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            var3.field_Yb = false;
                            ia.a((byte) 77, var3);
                            break L9;
                          }
                          var3 = (bs) (Object) kd.field_l.a((byte) -60);
                          if (var11 == 0) {
                            continue L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    stackOut_30_0 = var2;
                    stackIn_31_0 = stackOut_30_0;
                    break L7;
                  }
                  L12: {
                    if (stackIn_31_0 != 1) {
                      break L12;
                    } else {
                      if (gd.field_j != null) {
                        nr.field_q = gd.field_j.field_Nb;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if (4 == var2) {
                        break L14;
                      } else {
                        gd.field_j = null;
                        if (var11 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var3_int = ((ed) (Object) var1).a((byte) -11);
                    gd.field_j = new uh(ol.field_A);
                    gd.field_j.a(-1, (long)var3_int);
                    ph.a(gd.field_j, true, (ed) (Object) var1, false);
                    r.field_h = 0L;
                    break L13;
                  }
                  L15: {
                    L16: {
                      L17: {
                        if (var2 == 2) {
                          break L17;
                        } else {
                          if (-4 != (var2 ^ -1)) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      if (sj.field_d != null) {
                        break L15;
                      } else {
                        sj.field_d = new uh(ol.field_A);
                        if (var11 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    sj.field_d = null;
                    break L15;
                  }
                  L18: {
                    if (-4 == (var2 ^ -1)) {
                      break L18;
                    } else {
                      qn.field_q = false;
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L18;
                      }
                    }
                  }
                  qn.field_q = true;
                  var3_int = 0;
                  L19: while (true) {
                    L20: {
                      L21: {
                        if ((qc.field_w.length ^ -1) >= (var3_int ^ -1)) {
                          break L21;
                        } else {
                          qc.field_w[var3_int] = ((ed) (Object) var1).g(114);
                          var3_int++;
                          if (var11 != 0) {
                            break L20;
                          } else {
                            if (var11 == 0) {
                              continue L19;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                      ua.field_a = ((ed) (Object) var1).h(-11);
                      kg.field_y = ((ed) (Object) var1).h(param0 ^ 75);
                      break L20;
                    }
                    var3_int = 0;
                    L22: while (true) {
                      L23: {
                        if (var3_int >= dj.field_a.length) {
                          break L23;
                        } else {
                          dj.field_a[var3_int] = ((ed) (Object) var1).g(90);
                          var3_int++;
                          if (var11 != 0) {
                            break L0;
                          } else {
                            if (var11 == 0) {
                              continue L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L24: {
              if (5 != var2) {
                break L24;
              } else {
                L25: {
                  var3_long = ((ed) (Object) var1).i(param0 + -30950);
                  var5 = ((ed) (Object) var1).f(128);
                  var6 = ((ed) (Object) var1).f(128);
                  var7 = ((ed) (Object) var1).f(128);
                  var8_ref = jg.a(var3_long, -126);
                  if (var6.equals((Object) (Object) "")) {
                    stackOut_67_0 = 0;
                    stackIn_68_0 = stackOut_67_0;
                    break L25;
                  } else {
                    stackOut_66_0 = 1;
                    stackIn_68_0 = stackOut_66_0;
                    break L25;
                  }
                }
                L26: {
                  L27: {
                    var9 = stackIn_68_0;
                    if (var8_ref != null) {
                      break L27;
                    } else {
                      var8_ref = new bs(var5, var7, var3_long);
                      kd.field_l.a((gp) (Object) var8_ref, var3_long, 61);
                      if (var11 == 0) {
                        break L26;
                      } else {
                        break L27;
                      }
                    }
                  }
                  if (var9 == 0) {
                    break L26;
                  } else {
                    var8_ref.a(1, var7, var5);
                    break L26;
                  }
                }
                L28: {
                  var8_ref.field_Jb = gk.a(53) + -(long)((ed) (Object) var1).b(true);
                  var8_ref.field_Rb = ((ed) (Object) var1).a((byte) -11);
                  var10 = ((ed) (Object) var1).a(false);
                  var8_ref.field_Mb = var10 >> 1936096449;
                  stackOut_73_0 = (bs) var8_ref;
                  stackIn_75_0 = stackOut_73_0;
                  stackIn_74_0 = stackOut_73_0;
                  if ((var10 & 1) == 0) {
                    stackOut_75_0 = (bs) (Object) stackIn_75_0;
                    stackOut_75_1 = 0;
                    stackIn_76_0 = stackOut_75_0;
                    stackIn_76_1 = stackOut_75_1;
                    break L28;
                  } else {
                    stackOut_74_0 = (bs) (Object) stackIn_74_0;
                    stackOut_74_1 = 1;
                    stackIn_76_0 = stackOut_74_0;
                    stackIn_76_1 = stackOut_74_1;
                    break L28;
                  }
                }
                stackIn_76_0.field_Zb = stackIn_76_1 != 0;
                var8_ref.field_Ib = ((ed) (Object) var1).h(param0 + 55);
                var8_ref.field_Kb = ((ed) (Object) var1).h(-11);
                ia.a((byte) 77, var8_ref);
                if (var11 == 0) {
                  break L0;
                } else {
                  break L24;
                }
              }
            }
            L29: {
              if (var2 != 6) {
                break L29;
              } else {
                L30: {
                  var3_long = ((ed) (Object) var1).i(-31016);
                  var5_int = ((ed) (Object) var1).h(-11);
                  var6 = (String) (Object) jg.a(var3_long, 86);
                  if (var6 != null) {
                    L31: {
                      if (!((bs) (Object) var6).field_Ob) {
                        break L31;
                      } else {
                        ((bs) (Object) var6).field_Ob = false;
                        kk.field_j = kk.field_j - 1;
                        break L31;
                      }
                    }
                    L32: {
                      L33: {
                        if (-1 != (var5_int ^ -1)) {
                          break L33;
                        } else {
                          ((bs) (Object) var6).c(param0 ^ -68);
                          if (var11 == 0) {
                            break L32;
                          } else {
                            break L33;
                          }
                        }
                      }
                      ((bs) (Object) var6).field_Hb = var5_int;
                      ((bs) (Object) var6).field_Ub = lp.field_D;
                      break L32;
                    }
                    ((bs) (Object) var6).a(-124);
                    break L30;
                  } else {
                    break L30;
                  }
                }
                if (var11 == 0) {
                  break L0;
                } else {
                  break L29;
                }
              }
            }
            L34: {
              if (-8 == (var2 ^ -1)) {
                break L34;
              } else {
                L35: {
                  if (-9 == (var2 ^ -1)) {
                    break L35;
                  } else {
                    L36: {
                      if (9 == var2) {
                        break L36;
                      } else {
                        L37: {
                          if (-11 == (var2 ^ -1)) {
                            break L37;
                          } else {
                            L38: {
                              L39: {
                                if (-12 == (var2 ^ -1)) {
                                  break L39;
                                } else {
                                  if (var2 != 12) {
                                    break L38;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                              L40: {
                                var3_int = ((ed) (Object) var1).a((byte) -11);
                                var4 = (uh) (Object) lh.field_b.a(param0 ^ -3597, (long)var3_int);
                                if (var4 == null) {
                                  break L40;
                                } else {
                                  L41: {
                                    L42: {
                                      if ((var2 ^ -1) != -12) {
                                        break L42;
                                      } else {
                                        var4.field_Sb = true;
                                        if (var11 == 0) {
                                          break L41;
                                        } else {
                                          break L42;
                                        }
                                      }
                                    }
                                    var4.field_qc = true;
                                    break L41;
                                  }
                                  ce.a(true, var4);
                                  break L40;
                                }
                              }
                              if (var11 == 0) {
                                break L0;
                              } else {
                                break L38;
                              }
                            }
                            L43: {
                              if (-14 != (var2 ^ -1)) {
                                break L43;
                              } else {
                                L44: {
                                  var3_int = ((ed) (Object) var1).a((byte) -11);
                                  var4_int = ((ed) (Object) var1).h(-11);
                                  var5_ref = (uh) (Object) lh.field_b.a(3661, (long)var3_int);
                                  if (null != var5_ref) {
                                    L45: {
                                      var5_ref.field_qc = false;
                                      var6 = (String) (Object) var5_ref;
                                      ((uh) (Object) var6).field_Sb = false;
                                      if (0 == var4_int) {
                                        break L45;
                                      } else {
                                        var5_ref.field_ic = lp.field_D;
                                        var5_ref.field_Lb = var4_int;
                                        break L45;
                                      }
                                    }
                                    ce.a(true, var5_ref);
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                                if (var11 == 0) {
                                  break L0;
                                } else {
                                  break L43;
                                }
                              }
                            }
                            L46: {
                              if (var2 == 14) {
                                break L46;
                              } else {
                                if (var2 == 16) {
                                  break L46;
                                } else {
                                  L47: {
                                    L48: {
                                      if ((var2 ^ -1) == -16) {
                                        break L48;
                                      } else {
                                        if (-18 != (var2 ^ -1)) {
                                          break L47;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                    L49: {
                                      var3_long = ((ed) (Object) var1).i(-31016);
                                      var5_int = ((ed) (Object) var1).h(-11);
                                      var6 = (String) (Object) jg.a(var3_long, -126);
                                      if (var6 == null) {
                                        break L49;
                                      } else {
                                        L50: {
                                          if (var5_int == 0) {
                                            break L50;
                                          } else {
                                            ((bs) (Object) var6).field_Ub = lp.field_D;
                                            ((bs) (Object) var6).field_Hb = var5_int;
                                            break L50;
                                          }
                                        }
                                        L51: {
                                          L52: {
                                            if (15 == var2) {
                                              break L52;
                                            } else {
                                              if (!((bs) (Object) var6).field_Ob) {
                                                break L51;
                                              } else {
                                                ((bs) (Object) var6).field_Ob = false;
                                                kk.field_j = kk.field_j - 1;
                                                if (var11 == 0) {
                                                  break L51;
                                                } else {
                                                  break L52;
                                                }
                                              }
                                            }
                                          }
                                          ((bs) (Object) var6).field_Yb = false;
                                          break L51;
                                        }
                                        ia.a((byte) 77, (bs) (Object) var6);
                                        break L49;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L0;
                                    } else {
                                      break L47;
                                    }
                                  }
                                  L53: {
                                    if (-19 != (var2 ^ -1)) {
                                      break L53;
                                    } else {
                                      L54: {
                                        var3_long = ((ed) (Object) var1).i(-31016);
                                        var5 = ((ed) (Object) var1).f(128);
                                        var6 = ((ed) (Object) var1).f(128);
                                        var7 = (String) (Object) eq.a(var3_long, (byte) 89);
                                        if (var7 != null) {
                                          break L54;
                                        } else {
                                          var7 = (String) (Object) new bs(var5, var6, var3_long);
                                          ck.field_I.a((gp) (Object) var7, var3_long, param0 + -1);
                                          gd.field_j.field_Qb = gd.field_j.field_Qb + 1;
                                          break L54;
                                        }
                                      }
                                      L55: {
                                        ((bs) (Object) var7).field_Rb = ((ed) (Object) var1).a((byte) -11);
                                        var8 = ((ed) (Object) var1).a(false);
                                        stackOut_141_0 = (String) var7;
                                        stackIn_143_0 = stackOut_141_0;
                                        stackIn_142_0 = stackOut_141_0;
                                        if ((var8 & 1 ^ -1) == -1) {
                                          stackOut_143_0 = (String) (Object) stackIn_143_0;
                                          stackOut_143_1 = 0;
                                          stackIn_144_0 = stackOut_143_0;
                                          stackIn_144_1 = stackOut_143_1;
                                          break L55;
                                        } else {
                                          stackOut_142_0 = (String) (Object) stackIn_142_0;
                                          stackOut_142_1 = 1;
                                          stackIn_144_0 = stackOut_142_0;
                                          stackIn_144_1 = stackOut_142_1;
                                          break L55;
                                        }
                                      }
                                      ((bs) (Object) stackIn_144_0).field_Zb = stackIn_144_1 != 0;
                                      ((bs) (Object) var7).field_Mb = var8 >> -236505247;
                                      ((bs) (Object) var7).field_Ib = ((ed) (Object) var1).h(-11);
                                      ((bs) (Object) var7).field_Kb = ((ed) (Object) var1).h(-11);
                                      kq.field_Rb.a((li) (Object) var7, false);
                                      if (var11 == 0) {
                                        break L0;
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                  L56: {
                                    if ((var2 ^ -1) == -20) {
                                      break L56;
                                    } else {
                                      L57: {
                                        if ((var2 ^ -1) == -21) {
                                          break L57;
                                        } else {
                                          L58: {
                                            if (var2 != 21) {
                                              break L58;
                                            } else {
                                              L59: {
                                                L60: {
                                                  var3_int = ((ed) (Object) var1).a((byte) -11);
                                                  if (-1 == (var3_int ^ -1)) {
                                                    break L60;
                                                  } else {
                                                    r.field_h = (long)var3_int + gk.a(102);
                                                    if (var11 == 0) {
                                                      break L59;
                                                    } else {
                                                      break L60;
                                                    }
                                                  }
                                                }
                                                r.field_h = 0L;
                                                break L59;
                                              }
                                              if (var11 == 0) {
                                                break L0;
                                              } else {
                                                break L58;
                                              }
                                            }
                                          }
                                          L61: {
                                            if (-23 == (var2 ^ -1)) {
                                              break L61;
                                            } else {
                                              L62: {
                                                if (var2 == 23) {
                                                  break L62;
                                                } else {
                                                  ke.a((Throwable) null, "L1: " + or.a(param0 + 181), 0);
                                                  rm.b((byte) -115);
                                                  if (var11 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L62;
                                                  }
                                                }
                                              }
                                              ao.field_N = ((ed) (Object) var1).i(param0 ^ 31078);
                                              if (var11 == 0) {
                                                break L0;
                                              } else {
                                                break L61;
                                              }
                                            }
                                          }
                                          rp.field_a = ((ed) (Object) var1).a((byte) -11);
                                          qn.field_w = ((ed) (Object) var1).a(false);
                                          if (var11 == 0) {
                                            break L0;
                                          } else {
                                            break L57;
                                          }
                                        }
                                      }
                                      ph.a(gd.field_j, true, (ed) (Object) var1, false);
                                      if (var11 == 0) {
                                        break L0;
                                      } else {
                                        break L56;
                                      }
                                    }
                                  }
                                  L63: {
                                    var3_long = ((ed) (Object) var1).i(-31016);
                                    var5_int = ((ed) (Object) var1).h(-11);
                                    var6 = (String) (Object) eq.a(var3_long, (byte) 127);
                                    if (null != var6) {
                                      L64: {
                                        L65: {
                                          if ((var5_int ^ -1) == -1) {
                                            break L65;
                                          } else {
                                            ((bs) (Object) var6).field_Ub = lp.field_D;
                                            ((bs) (Object) var6).field_Hb = var5_int;
                                            if (var11 == 0) {
                                              break L64;
                                            } else {
                                              break L65;
                                            }
                                          }
                                        }
                                        ((bs) (Object) var6).c(param0 ^ -68);
                                        break L64;
                                      }
                                      ((bs) (Object) var6).a(param0 ^ 58);
                                      gd.field_j.field_Qb = gd.field_j.field_Qb - 1;
                                      break L63;
                                    } else {
                                      break L63;
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L0;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                            }
                            L66: {
                              var3_long = ((ed) (Object) var1).i(-31016);
                              var5 = (String) (Object) jg.a(var3_long, -8);
                              if (var5 == null) {
                                break L66;
                              } else {
                                L67: {
                                  L68: {
                                    if ((var2 ^ -1) != -15) {
                                      break L68;
                                    } else {
                                      ((bs) (Object) var5).field_Yb = true;
                                      if (var11 == 0) {
                                        break L67;
                                      } else {
                                        break L68;
                                      }
                                    }
                                  }
                                  if (!((bs) (Object) var5).field_Ob) {
                                    ((bs) (Object) var5).field_Ob = true;
                                    kk.field_j = kk.field_j + 1;
                                    break L67;
                                  } else {
                                    break L67;
                                  }
                                }
                                ia.a((byte) 77, (bs) (Object) var5);
                                break L66;
                              }
                            }
                            if (var11 == 0) {
                              break L0;
                            } else {
                              break L37;
                            }
                          }
                        }
                        var3_ref = (uh) (Object) nr.field_p.a((byte) 100);
                        L69: while (true) {
                          L70: {
                            if (null == var3_ref) {
                              break L70;
                            } else {
                              var3_ref.c(2);
                              var3_ref.a(-103);
                              var3_ref = (uh) (Object) nr.field_p.b(49);
                              if (var11 != 0) {
                                break L0;
                              } else {
                                if (var11 == 0) {
                                  continue L69;
                                } else {
                                  break L70;
                                }
                              }
                            }
                          }
                          if (var11 == 0) {
                            break L0;
                          } else {
                            break L36;
                          }
                        }
                      }
                    }
                    L71: {
                      var3_int = ((ed) (Object) var1).a((byte) -11);
                      var4_int = ((ed) (Object) var1).h(-11);
                      var5_ref = (uh) (Object) lh.field_b.a(3661, (long)var3_int);
                      if (var5_ref != null) {
                        L72: {
                          L73: {
                            if ((var4_int ^ -1) != -1) {
                              break L73;
                            } else {
                              var5_ref.c(2);
                              if (var11 == 0) {
                                break L72;
                              } else {
                                break L73;
                              }
                            }
                          }
                          var5_ref.field_Lb = var4_int;
                          var5_ref.field_ic = lp.field_D;
                          break L72;
                        }
                        var5_ref.a(-108);
                        break L71;
                      } else {
                        break L71;
                      }
                    }
                    if (var11 == 0) {
                      break L0;
                    } else {
                      break L35;
                    }
                  }
                }
                L74: {
                  var3_int = ((ed) (Object) var1).a((byte) -11);
                  var4 = (uh) (Object) lh.field_b.a(3661, (long)var3_int);
                  if (null != var4) {
                    break L74;
                  } else {
                    var4_ref = new uh(ol.field_A);
                    lh.field_b.a((gp) (Object) var4_ref, (long)var3_int, 45);
                    break L74;
                  }
                }
                ph.a(var4_ref, true, (ed) (Object) var1, true);
                ce.a(true, var4_ref);
                if (var11 == 0) {
                  break L0;
                } else {
                  break L34;
                }
              }
            }
            var3 = (bs) (Object) mk.field_J.a((byte) 100);
            L75: while (true) {
              L76: {
                if (null == var3) {
                  break L76;
                } else {
                  var3.c(2);
                  var3.a(param0 + -59);
                  var3 = (bs) (Object) mk.field_J.b(88);
                  if (var11 != 0) {
                    break L0;
                  } else {
                    if (var11 == 0) {
                      continue L75;
                    } else {
                      break L76;
                    }
                  }
                }
              }
              kk.field_j = 0;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              eb.field_c = uo.a(107);
              ch.field_e = new sd();
              if (param0 == 44) {
                break L0;
              } else {
                tq.a((java.awt.Color) null, false, (String) null, (byte) 8, 11);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          ak.a(true, true, 3);
        }
    }

    public static void a(int param0) {
        try {
            field_a = null;
            field_c = null;
            field_d = null;
            if (param0 != 13597) {
                field_d = null;
            }
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "tq.F(" + param0 + 41);
        }
    }

    final static void a(java.awt.Color param0, boolean param1, String param2, byte param3, int param4) {
        try {
            java.awt.Graphics var5 = null;
            Exception var5_ref = null;
            RuntimeException var5_ref2 = null;
            Exception var6 = null;
            java.awt.Graphics var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            String stackIn_34_2 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            String stackIn_38_2 = null;
            RuntimeException stackOut_30_0 = null;
            StringBuilder stackOut_30_1 = null;
            RuntimeException stackOut_31_0 = null;
            StringBuilder stackOut_31_1 = null;
            String stackOut_31_2 = null;
            RuntimeException stackOut_33_0 = null;
            StringBuilder stackOut_33_1 = null;
            String stackOut_33_2 = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var5 = ne.field_F.getGraphics();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = (stateCaught_0 instanceof Exception ? 27 : 29);
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            if (null != fh.field_t) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof Exception ? 4 : 29);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            fh.field_t = new java.awt.Font("Helvetica", 1, 13);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof Exception ? 4 : 29);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof Exception ? 27 : 29);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof Exception ? 27 : 29);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (!param1) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof Exception ? 8 : 29);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var5.setColor(java.awt.Color.black);
                            var5.fillRect(0, 0, op.field_c, gh.field_a);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof Exception ? 8 : 29);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof Exception ? 27 : 29);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof Exception ? 27 : 29);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (param0 != null) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof Exception ? 27 : 29);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            param0 = new java.awt.Color(140, 17, 17);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof Exception ? 27 : 29);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (null != ug.field_c) {
                                statePc = 15;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof Exception ? 17 : 29);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ug.field_c = ne.field_F.createImage(304, 34);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof Exception ? 17 : 29);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof Exception ? 17 : 29);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var6_ref = ug.field_c.getGraphics();
                            var6_ref.setColor(param0);
                            var6_ref.drawRect(0, 0, 303, 33);
                            var6_ref.fillRect(2, 2, param4 * 3, 30);
                            var6_ref.setColor(java.awt.Color.black);
                            var6_ref.drawRect(1, 1, 301, 31);
                            var6_ref.fillRect(2 - -(3 * param4), 2, -(param4 * 3) + 300, 30);
                            var6_ref.setFont(fh.field_t);
                            var6_ref.setColor(java.awt.Color.white);
                            var6_ref.drawString(param2, (304 + -(param2.length() * 6)) / 2, 22);
                            boolean discarded$1 = var5.drawImage(ug.field_c, -152 + op.field_c / 2, -18 + gh.field_a / 2, (java.awt.image.ImageObserver) null);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof Exception ? 17 : 29);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof Exception ? 27 : 29);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var6 = (Exception) (Object) caughtException;
                            var7 = -152 + op.field_c / 2;
                            var8 = -18 + gh.field_a / 2;
                            var5.setColor(param0);
                            var5.drawRect(var7, var8, 303, 33);
                            var5.fillRect(var7 - -2, var8 + 2, param4 * 3, 30);
                            var5.setColor(java.awt.Color.black);
                            var5.drawRect(1 + var7, var8 + 1, 301, 31);
                            var5.fillRect(2 + var7 + param4 * 3, 2 + var8, 300 - param4 * 3, 30);
                            var5.setFont(fh.field_t);
                            var5.setColor(java.awt.Color.white);
                            var5.drawString(param2, var7 + (304 + -(param2.length() * 6)) / 2, 22 + var8);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof Exception ? 27 : 29);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (param3 <= -125) {
                                statePc = 22;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof Exception ? 21 : 29);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            field_c = null;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof Exception ? 21 : 29);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof Exception ? 27 : 29);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof Exception ? 27 : 29);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (op.field_a != null) {
                                statePc = 25;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof Exception ? 24 : 29);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof Exception ? 24 : 29);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof Exception ? 27 : 29);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var5.setFont(fh.field_t);
                            var5.setColor(java.awt.Color.white);
                            var5.drawString(op.field_a, op.field_c / 2 + -(6 * op.field_a.length() / 2), -26 + gh.field_a / 2);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof Exception ? 27 : 29);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var5_ref = (Exception) (Object) caughtException;
                            ne.field_F.repaint();
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        var5_ref2 = (RuntimeException) (Object) caughtException;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        try {
                            stackOut_30_0 = (RuntimeException) var5_ref2;
                            stackOut_30_1 = new StringBuilder().append("tq.E(");
                            stackIn_33_0 = stackOut_30_0;
                            stackIn_33_1 = stackOut_30_1;
                            stackIn_31_0 = stackOut_30_0;
                            stackIn_31_1 = stackOut_30_1;
                            if (param0 == null) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
                            stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
                            stackOut_31_2 = "{...}";
                            stackIn_34_0 = stackOut_31_0;
                            stackIn_34_1 = stackOut_31_1;
                            stackIn_34_2 = stackOut_31_2;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 33: {
                        stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                        stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                        stackOut_33_2 = "null";
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        stackIn_34_2 = stackOut_33_2;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        try {
                            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(44).append(param1).append(44);
                            stackIn_37_0 = stackOut_34_0;
                            stackIn_37_1 = stackOut_34_1;
                            stackIn_35_0 = stackOut_34_0;
                            stackIn_35_1 = stackOut_34_1;
                            if (param2 == null) {
                                statePc = 37;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                            stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                            stackOut_35_2 = "{...}";
                            stackIn_38_0 = stackOut_35_0;
                            stackIn_38_1 = stackOut_35_1;
                            stackIn_38_2 = stackOut_35_2;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 37: {
                        stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                        stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                        stackOut_37_2 = "null";
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        throw wn.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 44 + param3 + 44 + param4 + 41);
                    }
                    case 39: {
                        return;
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

    public final String toString() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "tq.toString()");
        }
    }

    tq(int param0) {
        try {
            ((tq) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "tq.<init>(" + param0 + 41);
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2 = param1.getParameter("username");
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (!param0) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_c = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var2 == null) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((kq.a((byte) 123, (CharSequence) (Object) var2) ^ -1L) != -1L) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 11: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) var2_ref;
                        stackOut_12_1 = new StringBuilder().append("tq.C(").append(param0).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param1 == null) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "{...}";
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_16_2 = stackOut_13_2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 15: {
                    stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                    stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                    stackOut_15_2 = "null";
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw wn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Move left:<br>Move right:<br>Move back:<br>Move forward:<br>Jump:<br>Rotate camera left:<br>Rotate camera right:<br>Raise camera up:";
        field_a = "<%0> is not on your friend list.";
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
