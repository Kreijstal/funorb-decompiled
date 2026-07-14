/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static int field_b;
    static String field_a;

    final static void a(int param0, boolean param1) {
        if (param1) {
            field_b = 93;
        }
        int discarded$0 = de.a((byte) 92);
    }

    public static void a(byte param0) {
        if (param0 >= -43) {
            String var2 = (String) null;
            w discarded$0 = ic.a((String) null, true);
        }
        field_a = null;
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (ua.field_d != null) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var1 = (Object) (Object) ua.field_d;
                    // monitorenter ua.field_d
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        ua.field_d = null;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var2;
                }
                case 7: {
                    if (param0 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ic.a((byte) -120);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static w a(String param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        var2 = param0.length();
        if (-1 == (var2 ^ -1)) {
          return nh.field_f;
        } else {
          if (63 >= var2) {
            var3 = 0;
            L0: while (true) {
              if (var3 >= var2) {
                if (param1) {
                  field_a = (String) null;
                  return null;
                } else {
                  return null;
                }
              } else {
                var4 = param0.charAt(var3);
                if (var4 != 45) {
                  if (0 == (ml.field_l.indexOf(var4) ^ -1)) {
                    return td.field_d;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  L1: {
                    if (0 == var3) {
                      break L1;
                    } else {
                      if (var3 == -1 + var2) {
                        break L1;
                      } else {
                        var3++;
                        continue L0;
                      }
                    }
                  }
                  return td.field_d;
                }
              }
            }
          } else {
            return ei.field_d;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = "End Game";
    }
}
