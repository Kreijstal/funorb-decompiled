/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static q field_d;
    static int field_a;
    static int field_f;
    static int[] field_c;
    static String field_b;
    static int[] field_e;

    final static void a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        rd.a(true);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ka.c();
                        ug.field_c = new int[260];
                        nd.field_m = 11;
                        var1_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var1_int >= 256) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = 15.0;
                        ug.field_c[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                        var1_int++;
                        if (var4 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1_int = 256;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var1_int >= ug.field_c.length) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ug.field_c[var1_int] = 255;
                        var1_int++;
                        if (var4 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        return;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var4 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) var1), "rd.A(" + param0 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String param0, boolean param1) {
        try {
            hi.a(-23883, param0);
            jj.a(param1, gb.field_c, 1702);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "rd.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 > 46) {
          if (bi.field_L >= 20) {
            if (pa.b(-120)) {
              if (db.field_d > 0) {
                if (Transmogrify.d(false)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        if (param0 != 28) {
            return;
        }
        field_e = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    static {
        field_d = new q();
        field_c = new int[]{0, 21, 21, 21, 8, 9, 10, 11, 11, 16, 17, 18, 17, 18, 17, 18, 17, 24, 25, 26, 27, 26, 25, 28, 29, 28, 25, 30, 24, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25};
        field_b = "Player names can be up to 12 letters, numbers and underscores";
        field_f = -1;
    }
}
