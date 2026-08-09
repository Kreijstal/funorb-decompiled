/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static int field_c;
    static String field_b;
    static long field_a;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = param1.getDocumentBase().getFile();
                      var3 = var2.indexOf('?');
                      var4 = "reload.ws";
                      if (var3 >= 0) {
                        var4 = var4 + var2.substring(var3);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    if (param0 == 20104) {
                      var5 = new java.net.URL(param1.getCodeBase(), var4);
                      param1.getAppletContext().showDocument(gf.a(3, var5, param1), "_self");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var2_ref2);

                stackIn_11_1 = new StringBuilder().append("rf.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L3;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L3;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.net.URL a(int param0, java.net.URL param1, String param2, int param3, String param4) {
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
            java.net.URL stackIn_41_0 = null;
            java.net.URL stackIn_43_0 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
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
                        var9 = Lexicominos.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var5 = param1.getFile();
                            var6 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var5.regionMatches(var6, "/l=", 0, 3)) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var7_int = var5.indexOf('/', var6 + 1);
                            if (0 > var7_int) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (0 > param0) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var7_int = var5.indexOf('/', 1 + var6);
                            if (var7_int < 0) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var5.regionMatches(var6, "/p=", 0, 3)) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var7_int = var5.indexOf('/', 1 + var6);
                            if (0 > var7_int) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (param4 == null) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var5.regionMatches(var6, "/s=", 0, 3)) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                                statePc = 25;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var7_int = var5.indexOf('/', var6 + 1);
                            if (0 <= var7_int) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (param2 == null) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var7 = new StringBuilder(var6);
                            discarded$0 = var7.append(var5.substring(0, var6));
                            if (param3 < param0) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            discarded$1 = var7.append("/l=");
                            discarded$2 = var7.append(Integer.toString(param0));
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (param4 == null) {
                                statePc = 32;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (0 < param4.length()) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            discarded$3 = var7.append("/p=");
                            discarded$4 = var7.append(param4);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (param2 == null) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if ((param2.length() ^ -1) >= -1) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            discarded$5 = var7.append("/s=");
                            discarded$6 = var7.append(param2);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var6 >= var5.length()) {
                                statePc = 38;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            discarded$7 = var7.append(var5.substring(var6, var5.length()));
                            if (var9 == 0) {
                                statePc = 40;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            discarded$8 = var7.append('/');
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            discarded$9 = var7.append('/');
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            stackIn_41_0 = new java.net.URL(param1, var7.toString());
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = ((Object) stateCaught_40 instanceof Exception ? 42 : 44);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        return stackIn_41_0;
                    }
                    case 42: {
                        try {
                            var8 = (Exception) ((Object) caughtException);
                            var8.printStackTrace();
                            stackIn_43_0 = (java.net.URL) (param1);
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        return stackIn_43_0;
                    }
                    case 44: {
                        var5_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_46_0 = (RuntimeException) (var5_ref);
                        stackIn_45_0 = stackIn_46_0;
                        stackIn_46_1 = new StringBuilder().append("rf.D(").append(param0).append(',');
                        stackIn_45_1 = stackIn_46_1;
                        if (param1 == null) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        stackIn_47_0 = (RuntimeException) ((Object) stackIn_45_0);
                        stackIn_47_1 = (StringBuilder) ((Object) stackIn_45_1);
                        stackIn_47_2 = "{...}";
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 46: {
                        stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
                        stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                        stackIn_47_2 = "null";
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        stackIn_49_0 = (RuntimeException) ((Object) stackIn_47_0);
                        stackIn_48_0 = stackIn_49_0;
                        stackIn_49_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',');
                        stackIn_48_1 = stackIn_49_1;
                        if (param2 == null) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        stackIn_50_0 = (RuntimeException) ((Object) stackIn_48_0);
                        stackIn_50_1 = (StringBuilder) ((Object) stackIn_48_1);
                        stackIn_50_2 = "{...}";
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 49: {
                        stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                        stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                        stackIn_50_2 = "null";
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        stackIn_52_0 = (RuntimeException) ((Object) stackIn_50_0);
                        stackIn_51_0 = stackIn_52_0;
                        stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param3).append(',');
                        stackIn_51_1 = stackIn_52_1;
                        if (param4 == null) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        stackIn_53_0 = (RuntimeException) ((Object) stackIn_51_0);
                        stackIn_53_1 = (StringBuilder) ((Object) stackIn_51_1);
                        stackIn_53_2 = "{...}";
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 52: {
                        stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
                        stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                        stackIn_53_2 = "null";
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        throw ld.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
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

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 <= 0) {
                  break L2;
                } else {
                  if (param1 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (param1 <= 255) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param0 == -10) {
                  break L4;
                } else {
                  rf.a(48);
                  break L4;
                }
              }
              L5: {
                L6: {
                  if (0 == param1) {
                    break L6;
                  } else {
                    var6 = ne.field_d;
                    var2 = var6;
                    var3 = 0;
                    L7: while (true) {
                      if (var3 >= var6.length) {
                        break L6;
                      } else {
                        var4 = var6[var3];
                        stackIn_21_0 = var4 ^ -1;

                        if (var5 != 0) {
                          break L5;
                        } else {
                          if (stackIn_21_0 == (param1 ^ -1)) {
                            stackIn_18_0 = 1;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var3++;
                            if (var5 == 0) {
                              continue L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackIn_21_0 = 0;
                break L5;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
            stackIn_8_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref), "rf.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        field_b = null;
    }

    final synchronized static long c(int param0) {
        long var1;
        if (param0 != 0) {
          L0: {
            rf.c(3);
            var1 = System.currentTimeMillis();
            if ((var1 ^ -1L) > (fh.field_g ^ -1L)) {
              th.field_k = th.field_k + (fh.field_g + -var1);
              break L0;
            } else {
              break L0;
            }
          }
          fh.field_g = var1;
          return th.field_k + var1;
        } else {
          L1: {
            var1 = System.currentTimeMillis();
            if ((var1 ^ -1L) > (fh.field_g ^ -1L)) {
              th.field_k = th.field_k + (fh.field_g + -var1);
              break L1;
            } else {
              break L1;
            }
          }
          fh.field_g = var1;
          return th.field_k + var1;
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_6_0 = 0;
        if (param1 != 47) {
          return 5;
        } else {
          L0: {
            if (param0 == 0) {
              stackIn_6_0 = 0;
              break L0;
            } else {
              if (-1 >= (param0 ^ -1)) {
                stackIn_6_0 = 1;
                break L0;
              } else {
                stackIn_6_0 = -1;
                break L0;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    final static int a(int param0) {
        if (param0 != 30448) {
            field_c = 74;
            return uc.field_eb;
        }
        return uc.field_eb;
    }

    static {
        field_a = 0L;
    }
}
