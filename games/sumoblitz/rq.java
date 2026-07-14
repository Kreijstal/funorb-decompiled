/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rq {
    static String field_a;
    static boolean field_d;
    static ri field_c;
    aw field_b;

    void b(int param0) {
        int var2 = -35 / ((param0 - 41) / 46);
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null == wd.field_e) {
                        statePc = 8;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = (Object) (Object) wd.field_e;
                    // monitorenter wd.field_e
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        wd.field_e = null;
                        // monitorexit var1
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    if (!param0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    rq.c(106);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
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
                case 8: {
                    if (param0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    rq.c(106);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract void a(int param0, int param1, int param2);

    public static void c(int param0) {
        field_c = null;
        field_a = null;
        if (param0 >= -99) {
            field_c = null;
        }
    }

    abstract void a(boolean param0, int param1);

    abstract void c(boolean param0);

    void c(byte param0) {
        if (param0 <= 0) {
            ((rq) this).a((byte) -128);
        }
    }

    void a(int param0) {
        if (param0 != 260) {
            ((rq) this).c((byte) -26);
        }
    }

    abstract void a(int param0, int param1, ed param2);

    void a(byte param0) {
        if (param0 >= -47) {
            ((rq) this).c((byte) 119);
        }
    }

    rq(aw param0) {
        ((rq) this).field_b = param0;
    }

    final static int a(int param0, tg param1) {
        if (param0 == -9267) {
          if (param1 != lf.field_e) {
            if (param1 != vi.field_v) {
              if (param1 != ua.field_n) {
                if (cv.field_F != param1) {
                  if (bj.field_c == param1) {
                    return 34023;
                  } else {
                    throw new IllegalArgumentException();
                  }
                } else {
                  return 260;
                }
              } else {
                return 34165;
              }
            } else {
              return 8448;
            }
          } else {
            return 7681;
          }
        } else {
          rq.c(38);
          if (param1 != lf.field_e) {
            if (param1 != vi.field_v) {
              if (param1 != ua.field_n) {
                if (cv.field_F != param1) {
                  if (bj.field_c == param1) {
                    return 34023;
                  } else {
                    throw new IllegalArgumentException();
                  }
                } else {
                  return 260;
                }
              } else {
                return 34165;
              }
            } else {
              return 8448;
            }
          } else {
            return 7681;
          }
        }
    }

    final static ne[] a(String param0, ki param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (param2 < 28) {
          field_a = null;
          var4 = param1.a(0, param3);
          var5 = param1.a(var4, param0, (byte) 127);
          return kk.a(var4, -1, var5, param1);
        } else {
          var4 = param1.a(0, param3);
          var5 = param1.a(var4, param0, (byte) 127);
          return kk.a(var4, -1, var5, param1);
        }
    }

    void b(boolean param0) {
        if (param0) {
            field_c = null;
        }
    }

    abstract boolean b(byte param0);

    abstract void a(boolean param0, byte param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
