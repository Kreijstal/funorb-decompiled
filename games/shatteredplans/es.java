/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class es extends oh {
    static qr field_l;
    static int field_n;
    static bc field_j;
    static int field_m;
    int field_k;
    int field_h;
    ln field_p;
    fs field_i;
    int field_o;

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int var3 = 0;
            int stackIn_10_0 = 0;
            int stackIn_12_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_11_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (sa.field_a.field_j < param1) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        if (null != wg.field_f) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return false;
                    }
                    case 4: {
                        try {
                            var3 = 52 % ((param0 - 38) / 63);
                            var2_int = wg.field_f.a(-1);
                            if ((var2_int ^ -1) < -1) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var2_int <= param1 + -sa.field_a.field_j) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var2_int = param1 + -sa.field_a.field_j;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            wg.field_f.a(sa.field_a.field_h, var2_int, sa.field_a.field_j, (byte) 119);
                            pf.field_e = pr.a(14274);
                            sa.field_a.field_j = sa.field_a.field_j + var2_int;
                            if (sa.field_a.field_j >= param1) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0 != 0;
                    }
                    case 11: {
                        try {
                            sa.field_a.field_j = 0;
                            stackOut_11_0 = 1;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0 != 0;
                    }
                    case 13: {
                        try {
                            if (-1 < (var2_int ^ -1)) {
                                statePc = 16;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if ((wh.a(18) ^ -1L) >= -30001L) {
                                statePc = 18;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            q.g(-114);
                            return false;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            q.g(-114);
                            return false;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return false;
                    }
                    case 19: {
                        var2 = (IOException) (Object) caughtException;
                        q.g(-117);
                        return false;
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

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        rg var15 = null;
        StringWriter var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        L0: {
          var14 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 instanceof rg) {
            var15 = (rg) (Object) param0;
            param0 = var15.field_e;
            var2 = var15.field_b + " | ";
            var12 = var2;
            var2 = var12;
            var12 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var16 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var16);
        param0.printStackTrace(var4);
        var4.close();
        var5 = var16.toString();
        var12 = var5;
        var2 = var12;
        var12 = var5;
        var8 = 30 % ((-57 - param1) / 33);
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var12 = var7;
        var2 = var12;
        var12 = var7;
        L1: while (true) {
          var9 = var6.readLine();
          var12 = var9;
          var2 = var12;
          var12 = var9;
          if (var9 == null) {
            var2 = var2 + "| " + var7;
            return var2;
          } else {
            L2: {
              var10 = var9.indexOf('(');
              var11 = var9.indexOf(')', var10 - -1);
              if ((var10 ^ -1) == 0) {
                var12 = var9;
                var2 = var12;
                var2 = var12;
                break L2;
              } else {
                var12 = var9.substring(0, var10);
                break L2;
              }
            }
            L3: {
              var17 = var12.trim();
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf(' ') - -1);
              var2 = var18;
              var2 = var18;
              var19 = var18.substring(var18.lastIndexOf('\t') + 1);
              var2 = var19;
              var2 = var19;
              var20 = var2 + var19;
              var2 = var20;
              var2 = var20;
              if (0 == (var10 ^ -1)) {
                break L3;
              } else {
                if (var11 == -1) {
                  break L3;
                } else {
                  var13 = var9.indexOf(".java:", var10);
                  if ((var13 ^ -1) > -1) {
                    break L3;
                  } else {
                    var2 = var20 + var9.substring(var13 - -5, var11);
                    break L3;
                  }
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_j = null;
        field_l = null;
    }

    es(ln param0, fs param1, int param2, int param3) {
        ((es) this).field_o = param2;
        ((es) this).field_p = param0;
        ((es) this).field_i = param1;
        ((es) this).field_k = param3;
        ((es) this).field_h = 0;
    }

    es(ln param0, fs param1, int param2, int param3, int param4) {
        ((es) this).field_h = param3;
        ((es) this).field_p = param0;
        ((es) this).field_o = param2;
        ((es) this).field_k = param4;
        ((es) this).field_i = param1;
    }

    static {
    }
}
