/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nq extends rqa {
    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(208, 115));
    }

    final static void a(float param0, int param1, float param2, int param3, int param4, int param5, float param6, vjb param7, int param8, float param9, int param10, byte[] param11, byte param12, float param13) {
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        int var21 = 0;
        float[] var25 = null;
        L0: {
          var19 = VoidHunters.field_G;
          if (param12 > 47) {
            break L0;
          } else {
            var20 = null;
            nq.a(1.1260381937026978f, -88, 0.9253022074699402f, -128, 62, -46, 1.1999729871749878f, (vjb) null, -54, 2.695220470428467f, -81, (byte[]) null, (byte) -123, -0.5407317280769348f);
            break L0;
          }
        }
        var14 = param4 * param3;
        var25 = new float[var14];
        var16 = 0;
        L1: while (true) {
          if (var16 >= param1) {
            var21 = param10;
            var16 = var21;
            var17 = 0;
            L2: while (true) {
              if ((var17 ^ -1) <= (var14 ^ -1)) {
                return;
              } else {
                param11[var21] = (byte)(param11[var21] - -127);
                var21++;
                var17++;
                continue L2;
              }
            }
          } else {
            var17 = param10;
            param7.a(param0 / (float)param3, param6 / (float)param4, var25, param9 / (float)param8, param8, 127.0f * param2, (byte) 99, 0, param3, param5, param4);
            param9 = param9 * 2.0f;
            param2 = param2 * param13;
            var18 = 0;
            L3: while (true) {
              if ((var18 ^ -1) <= (var14 ^ -1)) {
                param6 = param6 * 2.0f;
                param0 = param0 * 2.0f;
                var16++;
                continue L1;
              } else {
                param11[var17] = (byte)(int)((float)param11[var17] + var25[var18]);
                var17++;
                var18++;
                continue L3;
              }
            }
          }
        }
    }

    final static void a(byte param0, ds param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = VoidHunters.field_G;
                        var6 = new byte[24];
                        var2 = var6;
                        if (param0 <= -69) {
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
                        if (vsa.field_r != null) {
                            statePc = 4;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        try {
                            vsa.field_r.a(0, 0L);
                            vsa.field_r.a(-112, var6);
                            var3_int = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
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
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (0 != var6[var3_int]) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
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
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (-25 >= (var3_int ^ -1)) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            param1.a(0, var2, -1, 24);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if ((var4 ^ -1) <= -25) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 15: {
                        param1.a(0, var2, -1, 24);
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
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

    nq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
