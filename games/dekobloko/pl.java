/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    private ng field_a;
    static String field_c;
    private ji field_g;
    static String field_e;
    static String field_f;
    private ji field_d;
    private ng field_b;

    final ud a(String param0, String param1, int param2) {
        RuntimeException var4 = null;
        ud stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                this.field_a = (ng) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0, (int[]) null, param1, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("pl.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0) {
        if (param0 != 3970) {
            field_c = (String) null;
            jc.a((byte) 103);
            return;
        }
        jc.a((byte) 103);
    }

    final ud a(int param0, int param1, int param2) {
        int var4 = -17 % ((-2 - param0) / 57);
        return this.a(121, param2, (int[]) null, param1);
    }

    final static java.net.URL a(String param0, String param1, boolean param2, java.net.URL param3, int param4) {
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
            java.net.URL stackIn_30_0 = null;
            java.net.URL stackIn_47_0 = null;
            java.net.URL stackIn_49_0 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            RuntimeException stackIn_56_0 = null;
            StringBuilder stackIn_56_1 = null;
            String stackIn_56_2 = null;
            RuntimeException stackIn_57_0 = null;
            StringBuilder stackIn_57_1 = null;
            RuntimeException stackIn_58_0 = null;
            StringBuilder stackIn_58_1 = null;
            RuntimeException stackIn_59_0 = null;
            StringBuilder stackIn_59_1 = null;
            String stackIn_59_2 = null;
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
            int var10 = 0;
            int var11 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = client.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var5 = param3.getFile();
                            var6 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                                statePc = 11;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7_int = var5.indexOf('/', 1 + var6);
                            var11 = var7_int ^ -1;
                            var10 = -1;
                            if (var9 != 0) {
                                statePc = 6;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var10 >= var11) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var10 < var11) {
                                statePc = 15;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (0 <= param4) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var5.regionMatches(var6, "/a=", 0, 3)) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var7_int = var5.indexOf('/', var6 - -1);
                            if (-1 < (var7_int ^ -1)) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                                statePc = 20;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var7_int = var5.indexOf('/', 1 + var6);
                            if (0 > var7_int) {
                                statePc = 20;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (param1 != null) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var5.regionMatches(var6, "/s=", 0, 3)) {
                                statePc = 23;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var5.regionMatches(var6, "/c=", 0, 3)) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var7_int = var5.indexOf('/', var6 + 1);
                            if (0 <= var7_int) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (param0 == null) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var7 = new StringBuilder(var6);
                            if (!param2) {
                                statePc = 31;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            stackIn_30_0 = (java.net.URL) null;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        return stackIn_30_0;
                    }
                    case 31: {
                        try {
                            discarded$0 = var7.append(var5.substring(0, var6));
                            if (-1 <= (param4 ^ -1)) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            discarded$1 = var7.append("/l=");
                            discarded$2 = var7.append(Integer.toString(param4));
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (param1 == null) {
                                statePc = 37;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if ((param1.length() ^ -1) < -1) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            discarded$3 = var7.append("/p=");
                            discarded$4 = var7.append(param1);
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (param0 == null) {
                                statePc = 41;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (0 < param0.length()) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            discarded$5 = var7.append("/s=");
                            discarded$6 = var7.append(param0);
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (var6 >= var5.length()) {
                                statePc = 44;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            discarded$7 = var7.append(var5.substring(var6, var5.length()));
                            if (var9 == 0) {
                                statePc = 46;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            discarded$8 = var7.append('/');
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            discarded$9 = var7.append('/');
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            stackIn_47_0 = new java.net.URL(param3, var7.toString());
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = ((Object) stateCaught_46 instanceof Exception ? 48 : 50);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        return stackIn_47_0;
                    }
                    case 48: {
                        try {
                            var8 = (Exception) ((Object) caughtException);
                            var8.printStackTrace();
                            stackIn_49_0 = (java.net.URL) (param3);
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        return stackIn_49_0;
                    }
                    case 50: {
                        var5_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_52_0 = (RuntimeException) (var5_ref);
                        stackIn_51_0 = stackIn_52_0;
                        stackIn_52_1 = new StringBuilder().append("pl.I(");
                        stackIn_51_1 = stackIn_52_1;
                        if (param0 == null) {
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
                        stackIn_55_0 = (RuntimeException) ((Object) stackIn_53_0);
                        stackIn_54_0 = stackIn_55_0;
                        stackIn_55_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',');
                        stackIn_54_1 = stackIn_55_1;
                        if (param1 == null) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        stackIn_56_0 = (RuntimeException) ((Object) stackIn_54_0);
                        stackIn_56_1 = (StringBuilder) ((Object) stackIn_54_1);
                        stackIn_56_2 = "{...}";
                        statePc = 56;
                        continue stateLoop;
                    }
                    case 55: {
                        stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
                        stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
                        stackIn_56_2 = "null";
                        statePc = 56;
                        continue stateLoop;
                    }
                    case 56: {
                        stackIn_58_0 = (RuntimeException) ((Object) stackIn_56_0);
                        stackIn_57_0 = stackIn_58_0;
                        stackIn_58_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(',').append(param2).append(',');
                        stackIn_57_1 = stackIn_58_1;
                        if (param3 == null) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        stackIn_59_0 = (RuntimeException) ((Object) stackIn_57_0);
                        stackIn_59_1 = (StringBuilder) ((Object) stackIn_57_1);
                        stackIn_59_2 = "{...}";
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 58: {
                        stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
                        stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
                        stackIn_59_2 = "null";
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        throw dh.a((Throwable) ((Object) stackIn_59_0), stackIn_59_2 + ',' + param4 + ')');
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

    private final ud a(String param0, int[] param1, String param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        ud stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 <= -17) {
                break L1;
              } else {
                var7 = (String) null;
                this.a((String) null, (String) null, 126);
                break L1;
              }
            }
            var5_int = this.field_d.b(-1, param2);
            if (0 <= var5_int) {
              var6 = this.field_d.a(var5_int, 13030, param0);
              if ((var6 ^ -1) <= -1) {
                stackIn_9_0 = this.a(var6, param1, var5_int, -15027);
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("pl.E(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final ud a(byte param0, String param1, String param2) {
        RuntimeException var4 = null;
        ud stackIn_2_0 = null;
        ud stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 101) {
              stackIn_4_0 = this.a(param2, (int[]) null, param1, (byte) -75);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ud) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("pl.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        int var1 = 81 % ((param0 - -78) / 33);
        field_f = null;
    }

    private final ud a(String param0, int[] param1, String param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_7_0 = null;
        ud stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = this.field_g.b(-1, param0);
              if (param3) {
                break L1;
              } else {
                this.field_a = (ng) null;
                break L1;
              }
            }
            if (0 <= var5_int) {
              var6 = this.field_g.a(var5_int, 13030, param2);
              if (var6 >= 0) {
                stackIn_9_0 = this.a(119, var5_int, param1, var6);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_7_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("pl.A(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ud) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    private final ud a(int param0, int[] param1, int param2, int param3) {
        va dupTemp$0 = null;
        ud stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_10_0 = null;
        ud stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        ud stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ud var8 = null;
        va var9 = null;
        va var10 = null;
        try {
          L0: {
            var5_int = param0 ^ (65532 & param2 << 58549220 | param2 >>> 391646732);
            var5_int = var5_int | param2 << 13351536;
            var6 = 4294967296L ^ (long)var5_int;
            var8 = (ud) ((Object) this.field_b.a(var6, 126));
            if (var8 == null) {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if ((param1[0] ^ -1) < -1) {
                    break L1;
                  } else {
                    stackIn_6_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                dupTemp$0 = (va) ((Object) this.field_a.a(var6, 55));
                var10 = dupTemp$0;
                var9 = dupTemp$0;
                if (var10 != null) {
                  break L2;
                } else {
                  var9 = va.a(this.field_d, param2, param0);
                  if (var9 != null) {
                    this.field_a.a(var6, param3 ^ 15026, var9);
                    break L2;
                  } else {
                    stackIn_10_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              if (param3 == -15027) {
                var8 = var9.a(param1);
                if (var8 != null) {
                  var9.b((byte) 101);
                  this.field_b.a(var6, -1, var8);
                  stackIn_19_0 = (ud) (var8);
                  decompiledRegionSelector0 = 5;
                  break L0;
                } else {
                  stackIn_17_0 = null;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                stackIn_14_0 = (ud) null;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackIn_2_0 = (ud) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("pl.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ud) ((Object) stackIn_6_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (ud) ((Object) stackIn_10_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (ud) ((Object) stackIn_17_0);
                } else {
                  return stackIn_19_0;
                }
              }
            }
          }
        }
    }

    private final ud a(int param0, int param1, int[] param2, int param3) {
        ud dupTemp$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ud var8 = null;
        bi var9 = null;
        ud var10 = null;
        ud var11 = null;
        ud stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        ud stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = param3 ^ (param1 << 1515294692 & 65531 | param1 >>> -487058036);
              var5_int = var5_int | param1 << 1656051856;
              if (param0 >= 113) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            var6 = (long)var5_int;
            dupTemp$1 = (ud) ((Object) this.field_b.a(var6, 106));
            var11 = dupTemp$1;
            var8 = dupTemp$1;
            if (var11 == null) {
              L2: {
                if (param2 == null) {
                  break L2;
                } else {
                  if ((param2[0] ^ -1) < -1) {
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              var9 = bi.a(this.field_g, param1, param3);
              if (var9 != null) {
                L3: {
                  var10 = var9.b();
                  var8 = var10;
                  this.field_b.a(var6, -1, var8);
                  if (param2 != null) {
                    param2[0] = param2[0] - var10.field_o.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackIn_16_0 = (ud) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_11_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = (ud) (var11);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("pl.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ud) ((Object) stackIn_11_0);
          } else {
            return stackIn_16_0;
          }
        }
    }

    final ud b(int param0, int param1, int param2) {
        if (param2 != -1) {
            return (ud) null;
        }
        return this.a(param0, (int[]) null, param1, -15027);
    }

    pl(ji param0, ji param1) {
        this.field_a = new ng(256);
        this.field_b = new ng(256);
        try {
            this.field_d = param1;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "pl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "New Game";
        field_f = "You need to play 1 more rated game to unlock this option.";
        field_e = "Add <%0> to friend list";
    }
}
