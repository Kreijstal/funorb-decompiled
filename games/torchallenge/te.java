/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    static ka field_e;
    static vf field_b;
    static String field_a;
    static String field_c;
    static byte[] field_d;

    public static void a(byte param0) {
        if (param0 != -50) {
            Object var2 = null;
            te.a(-56, 39, (o) null);
        }
        field_d = null;
        field_c = null;
        field_b = null;
        field_e = null;
        field_a = null;
    }

    final static void a(int param0, int param1, String param2) {
        int var3 = 0;
        ga.field_y = false;
        hl.field_e = false;
        if (param0 == -1) {
          L0: {
            if (null == da.field_c) {
              break L0;
            } else {
              if (da.field_c.field_K) {
                L1: {
                  var3 = 1;
                  if (param1 != 8) {
                    break L1;
                  } else {
                    L2: {
                      param1 = 2;
                      if (eb.field_m) {
                        param2 = n.field_fb;
                        break L2;
                      } else {
                        param2 = k.field_f;
                        break L2;
                      }
                    }
                    kb.field_O.a(lg.field_b, 10);
                    break L1;
                  }
                }
                L3: {
                  if (param1 == -11) {
                    qk.d((byte) -80);
                    var3 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (var3 == 0) {
                  if (param1 == 256) {
                    break L0;
                  } else {
                    if (-11 == param1) {
                      break L0;
                    } else {
                      if (eb.field_m) {
                        break L0;
                      } else {
                        kb.field_O.h(param0);
                        break L0;
                      }
                    }
                  }
                } else {
                  if (param1 == 256) {
                    break L0;
                  } else {
                    if (-11 == param1) {
                      break L0;
                    } else {
                      if (eb.field_m) {
                        break L0;
                      } else {
                        kb.field_O.h(param0);
                        break L0;
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = TorChallenge.field_F ? 1 : 0;
                    var1 = (Object) (Object) hl.field_d;
                    // monitorenter hl.field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ja.field_f = kc.field_n;
                        if (param0 == -11) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        te.a(-52);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        vf.field_a = vf.field_a + 1;
                        if (-1 >= (df.field_Q ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var2 >= 112) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        nj.field_c[var2] = false;
                        var2++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        df.field_Q = qa.field_a;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (qa.field_a == df.field_Q) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2 = bb.field_g[qa.field_a];
                        qa.field_a = qa.field_a - -1 & 127;
                        if (0 <= var2) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        nj.field_c[var2 ^ -1] = false;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        nj.field_c[var2] = true;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        kc.field_n = b.field_M;
                        // monitorexit var1
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var3;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, o param2) {
        if (param1 != 9082) {
            return;
        }
        pa var3 = dk.field_s;
        var3.d(25, param0);
        var3.d(param2.field_p, (byte) 122);
        var3.a(param2.field_o, (byte) 106);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new vf();
        field_a = "Player names can be up to 12 letters, numbers and underscores";
        field_c = "Reload game";
    }
}
