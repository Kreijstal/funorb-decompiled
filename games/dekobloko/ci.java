/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static String field_g;
    static String field_f;
    static String field_e;
    static vj field_a;
    static String field_b;
    static boolean field_c;
    static vj field_h;
    static String field_d;

    public static void a(int param0) {
        if (param0 != -27513) {
          return;
        } else {
          field_d = null;
          field_f = null;
          field_g = null;
          field_b = null;
          field_e = null;
          field_h = null;
          field_a = null;
          return;
        }
    }

    final static pi[] b(int param0) {
        pi[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    var1 = new pi[ec.field_g];
                    if (param0 <= -110) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return (pi[]) null;
                }
                case 2: {
                    var2 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var2 < ec.field_g) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    oa.a(126);
                    return var1;
                }
                case 5: {
                    var1[var2] = new pi(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], tc.field_Nb[var2], mb.field_d);
                    var2++;
                    if (var3 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return var1;
                }
                case 7: {
                    if (var3 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    oa.a(126);
                    return var1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = nm.field_Nb;
                        var1 = var6;
                        var2 = -61 % ((60 - param0) / 38);
                        var3 = 0;
                        var4 = var6.length;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 >= var4) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        incrementValue$8 = var3;
                        var3++;
                        var6[incrementValue$8] = 0;
                        incrementValue$9 = var3;
                        var3++;
                        var6[incrementValue$9] = 0;
                        incrementValue$10 = var3;
                        var3++;
                        var6[incrementValue$10] = 0;
                        incrementValue$11 = var3;
                        var3++;
                        var6[incrementValue$11] = 0;
                        incrementValue$12 = var3;
                        var3++;
                        var6[incrementValue$12] = 0;
                        incrementValue$13 = var3;
                        var3++;
                        var6[incrementValue$13] = 0;
                        incrementValue$14 = var3;
                        var3++;
                        var6[incrementValue$14] = 0;
                        incrementValue$15 = var3;
                        var3++;
                        var6[incrementValue$15] = 0;
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
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
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var1_ref), "ci.A(" + param0 + ')');
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(cc param0, int param1, int param2, byte param3, int param4, cc param5) {
        try {
            if (param3 >= -62) {
                field_d = (String) null;
            }
            nf.field_g = param0;
            da.field_c = param5;
            mb.field_c = param1;
            qk.field_m = param4;
            pa.field_Y = param2;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ci.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(char param0, byte param1) {
        if (param1 >= 66) {
          if (Character.isISOControl(param0)) {
            return false;
          } else {
            if (!j.a(-8241, param0)) {
              L0: {
                if (45 == param0) {
                  break L0;
                } else {
                  if (160 == param0) {
                    break L0;
                  } else {
                    if (32 == param0) {
                      break L0;
                    } else {
                      if (param0 == 95) {
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          }
        } else {
          ci.a((byte) -16);
          if (Character.isISOControl(param0)) {
            return false;
          } else {
            if (!j.a(-8241, param0)) {
              if (45 != param0) {
                if (160 != param0) {
                  L1: {
                    if (32 == param0) {
                      break L1;
                    } else {
                      if (param0 == 95) {
                        break L1;
                      } else {
                        return false;
                      }
                    }
                  }
                  return true;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        }
    }

    static {
        field_f = "<%0> has not yet unlocked this option for use.";
        field_g = "Hide private chat and appear offline to friends";
        field_e = "Please select an option in the '<%0>' row.";
        field_a = new vj();
        field_b = "Try changing the '<%0>' setting.";
        field_d = "Click or press F10 to open Quick Chat";
    }
}
