/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi implements Runnable {
    volatile boolean field_e;
    volatile md[] field_c;
    jk field_b;
    volatile boolean field_f;
    static int field_d;
    static String field_a;

    final static boolean a(int param0) {
        if (param0 != -3) {
            boolean discarded$0 = vi.a(68);
            return ad.field_b;
        }
        return ad.field_b;
    }

    final static boolean a(um param0, int param1, um param2, um param3) {
        int stackIn_12_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        if (param1 > 44) {
          L0: {
            if (!param0.c((byte) 127)) {
              break L0;
            } else {
              if (!param0.b("commonui", 100)) {
                break L0;
              } else {
                if (param2.c((byte) 121)) {
                  if (!param2.b("commonui", 100)) {
                    return false;
                  } else {
                    L1: {
                      L2: {
                        if (!param3.c((byte) 126)) {
                          break L2;
                        } else {
                          if (!param3.b("button.gif", 100)) {
                            break L2;
                          } else {
                            stackOut_24_0 = 1;
                            stackIn_26_0 = stackOut_24_0;
                            break L1;
                          }
                        }
                      }
                      stackOut_25_0 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      break L1;
                    }
                    return stackIn_26_0 != 0;
                  }
                } else {
                  return false;
                }
              }
            }
          }
          return false;
        } else {
          field_d = -26;
          if (param0.c((byte) 127)) {
            if (param0.b("commonui", 100)) {
              if (param2.c((byte) 121)) {
                if (!param2.b("commonui", 100)) {
                  return false;
                } else {
                  L3: {
                    L4: {
                      if (!param3.c((byte) 126)) {
                        break L4;
                      } else {
                        if (!param3.b("button.gif", 100)) {
                          break L4;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L3;
                        }
                      }
                    }
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L3;
                  }
                  return stackIn_12_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 5 % ((param0 - 65) / 51);
    }

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        md var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Chess.field_G;
                    ((vi) this).field_e = true;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((vi) this).field_f) {
                            statePc = 10;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var1_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-3 >= (var1_int ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = (stateCaught_3 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = ((vi) this).field_c[var1_int];
                        if (var2 != null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2.b();
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var1_int++;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1_int++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        bc.a(10L, (byte) -121);
                        var5 = null;
                        ak.a(((vi) this).field_b, (byte) -37, (Object) null);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 10: {
                    ((vi) this).field_e = false;
                    return;
                }
                case 11: {
                    try {
                        var1 = (Exception) (Object) caughtException;
                        var6 = null;
                        fg.a((Throwable) (Object) var1, (byte) -77, (String) null);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    ((vi) this).field_e = false;
                    return;
                }
                case 13: {
                    try {
                        var3 = caughtException;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 14: {
                    ((vi) this).field_e = false;
                    throw (RuntimeException) (Object) var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    vi() {
        ((vi) this).field_c = new md[2];
        ((vi) this).field_f = false;
        ((vi) this).field_e = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Reload game";
    }
}
