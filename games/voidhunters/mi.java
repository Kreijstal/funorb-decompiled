/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends rqa {
    static phb field_o;

    final static void a(kka param0, boolean param1, int param2, byte param3) {
        int var4_int = 0;
        Object var4 = null;
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null != ew.field_p) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    wo.a(1048576, param1, param2, true, param0);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (null != aab.field_o) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var4_int = 92 % ((param3 - 44) / 49);
                    return;
                }
                case 5: {
                    var4 = (Object) (Object) flb.field_o;
                    // monitorenter flb.field_o
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        aab.field_o.b(param2, (byte) 18, -1);
                        if (param0 != dha.field_u) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        // monitorexit var4
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        aab.field_o.a(true);
                        flb.field_o.f();
                        dha.field_u = param0;
                        if (null == dha.field_u) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        aab.field_o.a(param1, dha.field_u, -1);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        // monitorexit var4
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var4_int = 92 % ((param3 - 44) / 49);
                    return;
                }
                case 13: {
                    try {
                        var5 = caughtException;
                        // monitorexit var4
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void f(byte param0) {
        if (param0 > -90) {
            mi.e((byte) 79);
            field_o = null;
            return;
        }
        field_o = null;
    }

    final static void e(byte param0) {
        int var1 = 0;
        if (param0 != -81) {
          L0: {
            mi.f((byte) 52);
            if (-33 > (hlb.field_p ^ -1)) {
              L1: {
                var1 = hlb.field_p % 32;
                if (0 == var1) {
                  var1 = 32;
                  break L1;
                } else {
                  break L1;
                }
              }
              re.a(-var1 + hlb.field_p, (byte) -125);
              break L0;
            } else {
              re.a(0, (byte) -126);
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (-33 > (hlb.field_p ^ -1)) {
              L3: {
                var1 = hlb.field_p % 32;
                if (0 == var1) {
                  var1 = 32;
                  break L3;
                } else {
                  break L3;
                }
              }
              re.a(-var1 + hlb.field_p, (byte) -125);
              break L2;
            } else {
              re.a(0, (byte) -126);
              break L2;
            }
          }
          return;
        }
    }

    mi(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = null;
          return new nc((Object) (Object) frb.a(195, 121));
        } else {
          return new nc((Object) (Object) frb.a(195, 121));
        }
    }

    static {
    }
}
