/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fd {
    static String field_d;
    static String field_b;
    static b field_a;
    static long field_c;

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = StarCannon.field_A;
        if (param4 > -93) {
            field_a = null;
        }
        for (var5 = 0; var5 < jf.field_a.length; var5++) {
            param1 = jf.field_a[var5];
            var6 = var5 << 436875300;
            while (true) {
                param1--;
                if (-1 == (param1 ^ -1)) {
                    break;
                }
                var6++;
                param0 = ih.field_d[var6];
                param3[param2[param0]] = param3[param2[param0]] + 1;
                ih.field_d[param3[param2[param0]]] = param0;
            }
        }
    }

    final static void a(rb param0, byte param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            byte[] var5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = new byte[24];
                        var2 = var5;
                        if (param1 <= -108) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        if (null != mf.field_c) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        param0.a(var2, 24, -20144, 0);
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 4: {
                        try {
                            mf.field_c.a(0L, 0);
                            mf.field_c.a(var5, 15);
                            var3_int = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var5[var3_int] != 0) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3_int++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if ((var3_int ^ -1) > -25) {
                                statePc = 14;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (var4 >= 24) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var5[var4] = (byte)-1;
                        var4++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 14: {
                        param0.a(var2, 24, -20144, 0);
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 0) {
            fd.a(98, 30);
        }
        md.field_a = param0;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != -12241) {
            return;
        }
        field_b = null;
    }

    final static short[] a(int param0, short[] param1, int param2, ia param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = StarCannon.field_A;
        var4 = param3.e(8, param0);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (var4 != param1.length) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param1 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param3.e(8, 4);
            var6 = -78 / ((param2 - 34) / 53);
            var7 = (short)param3.e(8, 16);
            if ((var5 ^ -1) >= -1) {
              var8 = 0;
              L3: while (true) {
                if (var8 >= var4) {
                  break L2;
                } else {
                  param1[var8] = (short)var7;
                  var8++;
                  continue L3;
                }
              }
            } else {
              var8 = 0;
              L4: while (true) {
                if (var8 >= var4) {
                  break L2;
                } else {
                  param1[var8] = (short)(param3.e(8, var5) + var7);
                  var8++;
                  continue L4;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "GFX - MEDIUM";
        field_b = "Return to game";
        field_c = 20000000L;
    }
}
