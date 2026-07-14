/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends RuntimeException {
    String field_a;
    Throwable field_b;
    static String field_c;

    final static void a(int param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            byte[] var4 = null;
            Object[] var5 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                if (param0 == 7400) {
                  break L0;
                } else {
                  var4 = (byte[]) null;
                  byte[] discarded$1 = ac.a(-53, (byte[]) null);
                  break L0;
                }
              }
              if (var1 != null) {
                try {
                  var2_ref = Runtime.getRuntime();
                  var5 = (Object[]) null;
                  var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                  v.field_Q = (int)(var3.longValue() / 1048576L) - -1;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return;
                }
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var2 = decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        pb var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = new pb(param1);
                    if (param0 <= -54) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ac.a((byte) -15);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = var9.f(-124);
                    var4 = var9.e((byte) 126);
                    if (0 > var4) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (0 == rl.field_u) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (rl.field_u >= var4) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (-1 == var3) {
                        statePc = 20;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5_int = var9.e((byte) 126);
                    if (-1 > var5_int) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (rl.field_u == 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (rl.field_u < var5_int) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    throw new RuntimeException();
                }
                case 13: {
                    var16 = new byte[var5_int];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var6 = var10;
                    if ((var3 ^ -1) != -2) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    int discarded$3 = dc.a(var16, var5_int, param1, var4, 9);
                    return var6;
                }
                case 15: {
                    var7 = (Object) (Object) cc.field_f;
                    // monitorenter cc.field_f
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        cc.field_f.a(var9, 2, var16);
                        // monitorexit var7
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return var6;
                }
                case 18: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) var8;
                }
                case 20: {
                    var17 = new byte[var4];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var5 = var11;
                    var9.a(97, var17, 0, var4);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -118) {
            field_c = (String) null;
        }
    }

    ac(Throwable param0, String param1) {
        ((ac) this).field_b = param0;
        ((ac) this).field_a = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
