/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static da field_g;
    String field_d;
    boolean field_c;
    String[] field_a;
    boolean field_f;
    int field_b;
    static int field_e;

    final static void a(byte param0) {
        if (param0 != -128) {
            wg.a(false);
        }
    }

    final static java.net.URL a(String param0, int param1, String param2, int param3, java.net.URL param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            StringBuilder discarded$9 = null;
            java.net.URL stackIn_3_0 = null;
            java.net.URL stackIn_46_0 = null;
            java.net.URL stackIn_48_0 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            String stackIn_55_2 = null;
            RuntimeException stackIn_56_0 = null;
            StringBuilder stackIn_56_1 = null;
            RuntimeException stackIn_57_0 = null;
            StringBuilder stackIn_57_1 = null;
            RuntimeException stackIn_58_0 = null;
            StringBuilder stackIn_58_1 = null;
            String stackIn_58_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = SolKnight.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var5 = param4.getFile();
                            if (param1 == -7362) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackIn_3_0 = (java.net.URL) null;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return stackIn_3_0;
                    }
                    case 4: {
                        try {
                            var6 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var5.regionMatches(var6, "/l=", 0, 3)) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var7_int = var5.indexOf('/', var6 + 1);
                            if (0 <= var7_int) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if ((param3 ^ -1) > -1) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 5;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 5;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var5.regionMatches(var6, "/a=", 0, 3)) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var7_int = var5.indexOf('/', 1 + var6);
                            if (0 <= var7_int) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 5;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                                statePc = 23;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var7_int = var5.indexOf('/', 1 + var6);
                            if (-1 >= (var7_int ^ -1)) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (param0 == null) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 5;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 5;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var5.regionMatches(var6, "/s=", 0, 3)) {
                                statePc = 26;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var5.regionMatches(var6, "/c=", 0, 3)) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var7_int = var5.indexOf('/', var6 + 1);
                            if (var7_int >= 0) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (param2 != null) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 5;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 5;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var7 = new StringBuilder(var6);
                            discarded$0 = var7.append(var5.substring(0, var6));
                            if ((param3 ^ -1) >= -1) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            discarded$1 = var7.append("/l=");
                            discarded$2 = var7.append(Integer.toString(param3));
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (param0 == null) {
                                statePc = 37;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (-1 > (param0.length() ^ -1)) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            discarded$3 = var7.append("/p=");
                            discarded$4 = var7.append(param0);
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (param2 == null) {
                                statePc = 40;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (0 >= param2.length()) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            discarded$5 = var7.append("/s=");
                            discarded$6 = var7.append(param2);
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var5.length() <= var6) {
                                statePc = 43;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            discarded$7 = var7.append(var5.substring(var6, var5.length()));
                            if (var9 == 0) {
                                statePc = 45;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            discarded$8 = var7.append('/');
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            discarded$9 = var7.append('/');
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            stackIn_46_0 = new java.net.URL(param4, var7.toString());
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = ((Object) stateCaught_45 instanceof Exception ? 47 : 49);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        return stackIn_46_0;
                    }
                    case 47: {
                        try {
                            var8 = (Exception) ((Object) caughtException);
                            var8.printStackTrace();
                            stackIn_48_0 = (java.net.URL) (param4);
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        return stackIn_48_0;
                    }
                    case 49: {
                        var5_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_51_0 = (RuntimeException) (var5_ref);
                        stackIn_50_0 = stackIn_51_0;
                        stackIn_51_1 = new StringBuilder().append("wg.B(");
                        stackIn_50_1 = stackIn_51_1;
                        if (param0 == null) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        stackIn_52_0 = (RuntimeException) ((Object) stackIn_50_0);
                        stackIn_52_1 = (StringBuilder) ((Object) stackIn_50_1);
                        stackIn_52_2 = "{...}";
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 51: {
                        stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
                        stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
                        stackIn_52_2 = "null";
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        stackIn_54_0 = (RuntimeException) ((Object) stackIn_52_0);
                        stackIn_53_0 = stackIn_54_0;
                        stackIn_54_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',').append(param1).append(',');
                        stackIn_53_1 = stackIn_54_1;
                        if (param2 == null) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        stackIn_55_0 = (RuntimeException) ((Object) stackIn_53_0);
                        stackIn_55_1 = (StringBuilder) ((Object) stackIn_53_1);
                        stackIn_55_2 = "{...}";
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 54: {
                        stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
                        stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
                        stackIn_55_2 = "null";
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 55: {
                        stackIn_57_0 = (RuntimeException) ((Object) stackIn_55_0);
                        stackIn_56_0 = stackIn_57_0;
                        stackIn_57_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',').append(param3).append(',');
                        stackIn_56_1 = stackIn_57_1;
                        if (param4 == null) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        stackIn_58_0 = (RuntimeException) ((Object) stackIn_56_0);
                        stackIn_58_1 = (StringBuilder) ((Object) stackIn_56_1);
                        stackIn_58_2 = "{...}";
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 57: {
                        stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
                        stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
                        stackIn_58_2 = "null";
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 58: {
                        throw fc.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ')');
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

    final static od a(byte param0, da param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        od stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (l.a(param0 + 62, param3, param2, param1)) {
              L1: {
                if (param0 == 47) {
                  break L1;
                } else {
                  wg.a('￧', (byte) -104);
                  break L1;
                }
              }
              stackIn_6_0 = ea.e((byte) 113);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("wg.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (od) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static boolean a(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (param1 <= -104) {
            if (!gb.a(param0, 121)) {
              L0: {
                if (param0 == 45) {
                  break L0;
                } else {
                  if (param0 == 160) {
                    break L0;
                  } else {
                    if (param0 == 32) {
                      break L0;
                    } else {
                      if (param0 == 95) {
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          } else {
            field_e = 70;
            if (!gb.a(param0, 121)) {
              if (param0 != 45) {
                if (param0 != 160) {
                  if (param0 != 32) {
                    if (param0 == 95) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        }
    }

    wg(boolean param0) {
        this.field_c = param0 ? true : false;
    }

    public static void a(boolean param0) {
        java.net.URL var2;
        if (!param0) {
          var2 = (java.net.URL) null;
          wg.a((String) null, -62, (String) null, -119, (java.net.URL) null);
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    static {
        field_e = -480;
    }
}
