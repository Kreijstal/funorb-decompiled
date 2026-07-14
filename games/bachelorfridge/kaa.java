/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kaa extends pu {
    static kv[] field_l;
    static int field_m;

    final static boolean b(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) vv.field_e;
                    // monitorenter vv.field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (gha.field_q != jaa.field_s) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        gf.field_k = aq.field_a[gha.field_q];
                        dla.field_j = dla.field_i[gha.field_q];
                        gha.field_q = param0 & 1 + gha.field_q;
                        // monitorexit var1_ref
                        stackOut_4_0 = 1;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1_ref
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(byte param0) {
        if (param0 <= 106) {
            return;
        }
        field_l = null;
    }

    final static String c(int param0) {
        String var1 = null;
        Object var2 = null;
        L0: {
          var1 = "";
          if (ola.field_e != null) {
            var1 = ola.field_e.a(1);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var1.length() == 0) {
            var1 = uaa.d((byte) -82);
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 <= 14) {
          L2: {
            var2 = null;
            boolean discarded$8 = kaa.a((String) null, (byte) -3);
            if (-1 == var1.length()) {
              var1 = qfa.field_t;
              break L2;
            } else {
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (-1 == var1.length()) {
              var1 = qfa.field_t;
              break L3;
            } else {
              break L3;
            }
          }
          return var1;
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param1 == 63) {
          var2 = 0;
          L0: while (true) {
            if (param0.length() > var2) {
              var3 = param0.charAt(var2);
              if (ml.a(-130697146, (char) var3)) {
                var2++;
                var2++;
                var2++;
                continue L0;
              } else {
                if (!ula.a((char) var3, 48)) {
                  return true;
                } else {
                  var2++;
                  var2++;
                  continue L0;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          kaa.d((byte) -125);
          var2 = 0;
          if (param0.length() > var2) {
            var3 = param0.charAt(var2);
            if (!ml.a(-130697146, (char) var3)) {
              if (!ula.a((char) var3, 48)) {
                return true;
              } else {
                var2++;
                var2++;
                var2++;
                var2++;
                return false;
              }
            } else {
              var2++;
              var2++;
              var2++;
              var2++;
              return false;
            }
          } else {
            return false;
          }
        }
    }

    static {
    }
}
