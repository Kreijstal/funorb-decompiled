/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ci {
    static int field_b;
    static String field_d;
    static String[] field_a;
    static String field_c;

    public static void c(int param0) {
        if (param0 != -1) {
          field_c = null;
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final int a(long param0, int param1) {
        long var4 = 0L;
        if (param1 == 1) {
          var4 = ((ci) this).b(30393);
          if ((var4 ^ -1L) < -1L) {
            jj.a((byte) -114, var4);
            return ((ci) this).a(true, param0);
          } else {
            return ((ci) this).a(true, param0);
          }
        } else {
          return 38;
        }
    }

    abstract void a(byte param0);

    abstract int a(boolean param0, long param1);

    final static String a(String param0, char param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = stellarshard.field_B;
        var4 = param0.length();
        var5 = param2.length();
        var6 = var4;
        var7 = var5 - 1;
        if (var7 != 0) {
          var8 = 0;
          L0: while (true) {
            var8 = param0.indexOf((int) param1, var8);
            if ((var8 ^ -1) <= -1) {
              var6 = var6 + var7;
              var8++;
              continue L0;
            } else {
              var13 = new StringBuilder(var6);
              if (param3 != 2619) {
                return null;
              } else {
                var9 = 0;
                L1: while (true) {
                  var10 = param0.indexOf((int) param1, var9);
                  if (-1 < (var10 ^ -1)) {
                    StringBuilder discarded$6 = var13.append(param0.substring(var9));
                    return var13.toString();
                  } else {
                    StringBuilder discarded$7 = var13.append(param0.substring(var9, var10));
                    var9 = 1 + var10;
                    StringBuilder discarded$8 = var13.append(param2);
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          var12 = new StringBuilder(var6);
          if (param3 != 2619) {
            return null;
          } else {
            var9 = 0;
            L2: while (true) {
              var10 = param0.indexOf((int) param1, var9);
              if (-1 < (var10 ^ -1)) {
                StringBuilder discarded$9 = var12.append(param0.substring(var9));
                return var12.toString();
              } else {
                StringBuilder discarded$10 = var12.append(param0.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$11 = var12.append(param2);
                continue L2;
              }
            }
          }
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = stellarshard.field_B;
                    var1 = (Object) (Object) pk.field_e;
                    // monitorenter pk.field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 > 30) {
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
                        var5 = null;
                        String discarded$2 = ci.a((String) null, 'ￛ', (String) null, -48);
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
                        ce.field_e = ce.field_e + 1;
                        di.field_a = q.field_c;
                        if (-1 >= se.field_H) {
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
                        if (-113 <= var2) {
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
                        si.field_jb[var2] = false;
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
                        se.field_H = vd.field_e;
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
                        if (se.field_H == vd.field_e) {
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
                        var2 = ob.field_c[vd.field_e];
                        vd.field_e = 1 + vd.field_e & 127;
                        if (-1 < (var2 ^ -1)) {
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
                        si.field_jb[var2] = true;
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
                        si.field_jb[var2 ^ -1] = false;
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
                        q.field_c = l.field_h;
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

    abstract long b(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Homes in";
        field_c = "Updates will sent to the email address you've given";
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
