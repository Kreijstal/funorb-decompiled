/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends ek {
    static int field_M;
    static int field_N;
    static String[] field_K;
    static String field_L;

    dl(String param0, kg param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_H = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "dl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private dl(String param0, kg param1) {
        this(param0, bf.field_x.field_b, param1);
        try {
            this.field_p = bf.field_x.field_a;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "dl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, boolean param1, ck param2, int param3, int param4) {
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param2 != tc.field_Tb) {
                  break L2;
                } else {
                  lj.a(param4, param3, 0, true);
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (param2 != null) {
                param2.e(0, param3, param4);
                break L1;
              } else {
                hk.a(0, 0, 640, 480, 0);
                if (var6 == 0) {
                  break L1;
                } else {
                  param2.e(0, param3, param4);
                  break L1;
                }
              }
            }
            L3: {
              if (param1) {
                fj.a(0, param4, -26, param3);
                break L3;
              } else {
                break L3;
              }
            }
            if (param0 >= 40) {
              break L0;
            } else {
              field_L = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("dl.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_K = null;
        field_L = null;
    }

    final static void b(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ck var4 = null;
        cl var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = (cl) ((Object) oe.field_I.c((byte) 113));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        fh.a((byte) 104, var5, param1);
                        var5 = (cl) ((Object) oe.field_I.d(true));
                        if (var3 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 == 640) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = (ck) null;
                        dl.a((byte) 62, true, (ck) null, -96, 15);
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var2), "dl.L(" + param0 + ',' + param1 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private dl(String param0, gl param1, kg param2) {
        super(param0, param1, param2);
        try {
            this.field_p = bf.field_x.field_a;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "dl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.field_H = !this.field_H ? true : false;
        super.b(param0, param1, param2, param3);
    }

    final static boolean a(int param0) {
        if (param0 != 480) {
            return true;
        }
        return 250 < gd.field_e ? true : false;
    }

    static {
        field_M = 20;
        field_L = "Stage <%0>";
        field_N = -1;
    }
}
