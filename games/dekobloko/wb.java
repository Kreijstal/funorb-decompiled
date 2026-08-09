/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends w {
    String field_Pb;
    w field_Sb;
    static int field_Rb;
    w field_Wb;
    String field_Vb;
    static int[] field_Zb;
    int field_Xb;
    static Boolean field_Ub;
    static fm field_Nb;
    w field_Yb;
    String field_Tb;
    String field_Ob;
    static String[] field_Qb;

    final static void a(kc param0, int param1, int param2) {
        uf var3 = null;
        try {
            var3 = we.field_b;
            var3.f(param1, param2 + -64);
            if (param2 != 60) {
                field_Nb = (fm) null;
            }
            var3.a(true, 5);
            var3.a(true, 0);
            var3.d(param2 ^ -61, param0.field_n);
            var3.a(true, param0.field_o);
            var3.a(true, param0.field_v);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "wb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  L1: {
                    var2 = param0.getDocumentBase().getFile();
                    var4 = var2;
                    var4 = var2;
                    if (param1 == 30307) {
                      break L1;
                    } else {
                      field_Rb = 64;
                      break L1;
                    }
                  }
                  L2: {
                    var3 = var2.indexOf('?');
                    var4 = "reload.ws";
                    if (0 > var3) {
                      break L2;
                    } else {
                      var4 = var4 + var2.substring(var3);
                      break L2;
                    }
                  }
                  var5 = new java.net.URL(param0.getCodeBase(), var4);
                  param0.getAppletContext().showDocument(gn.a(var5, -1, param0), "_self");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_10_0 = (RuntimeException) (var2_ref2);

                stackIn_10_1 = new StringBuilder().append("wb.C(");

                if (param0 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "null";
                  break L3;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "{...}";
                  break L3;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (hk.field_c <= param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        param5 = param5 - (-param1 + hk.field_c);
                        param1 = hk.field_c;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param1 + param5 > hk.field_g) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param5 = hk.field_g + -param1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (hk.field_h <= param3) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param2 = param2 - (-param3 + hk.field_h);
                        param3 = hk.field_h;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param3 + param2 <= hk.field_b) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param2 = -param3 + hk.field_b;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (0 >= param5) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param2 > 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return;
                }
                case 14: {
                    try {
                        var6_int = param3 * hk.field_j + param1;
                        if (param0 == 31) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        field_Qb = (String[]) null;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7 = -param5 + hk.field_j;
                        param3 = -param2;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (-1 >= (param3 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var12 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        return;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        param1 = -param5;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (-1 >= (param1 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8 = hk.field_l[var6_int];
                        stackIn_31_0 = (65280 & var8) >> 1753310408;
                        stackIn_23_0 = stackIn_31_0;
                        stackIn_31_1 = param4;
                        stackIn_23_1 = stackIn_31_1;
                        if (var12 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 <= stackIn_23_1) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((255 & var8 >> 459642768) > (var8 >> -1566086360 & 255)) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9 = ((16711680 & var8) >> -1904407857) - 60;
                        if (-256 > (var9 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9 = 255;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var10 = var8 & 65280;
                        var10 = (var10 >> -14574239) + -(var10 >> -1326998683) & 65280;
                        var11 = 31 & var8 >> 44010979;
                        hk.field_l[var6_int] = de.b(var11, de.b(var9 << -1621456400, var10));
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var6_int++;
                        param1++;
                        if (var12 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = var6_int;
                        stackIn_31_1 = var7;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var6_int = stackIn_31_0 + stackIn_31_1;
                        param3++;
                        if (var12 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var6), "wb.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 34: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void e(int param0) {
        if (param0 >= -73) {
          field_Zb = (int[]) null;
          field_Qb = null;
          field_Zb = null;
          field_Nb = null;
          field_Ub = null;
          return;
        } else {
          field_Qb = null;
          field_Zb = null;
          field_Nb = null;
          field_Ub = null;
          return;
        }
    }

    final static int b(byte param0, int param1) {
        int var2;
        kc var3;
        var2 = param1 >>> -691332351;
        var2 = var2 | var2 >>> 285134945;
        if (param0 > -77) {
          var3 = (kc) null;
          wb.a((kc) null, -48, 106);
          var2 = var2 | var2 >>> 2037729058;
          var2 = var2 | var2 >>> -501559868;
          var2 = var2 | var2 >>> -1143914328;
          var2 = var2 | var2 >>> -1995022320;
          return param1 & (var2 ^ -1);
        } else {
          var2 = var2 | var2 >>> 2037729058;
          var2 = var2 | var2 >>> -501559868;
          var2 = var2 | var2 >>> -1143914328;
          var2 = var2 | var2 >>> -1995022320;
          return param1 & (var2 ^ -1);
        }
    }

    wb() {
        super(0L, (w) null);
    }

    static {
        field_Nb = null;
    }
}
