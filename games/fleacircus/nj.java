/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nj {
    private int field_f;
    private ji[] field_e;
    static dd field_b;
    private int field_c;
    static String field_d;
    private int field_g;
    static od field_a;

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        int var1 = 29 / ((-60 - param0) / 36);
        field_a = null;
    }

    final void c(int param0) {
        int var2;
        int var3;
        var3 = fleas.field_A ? 1 : 0;
        var2 = this.field_e.length + -1;
        L0: while (true) {
          L1: {
            if (0 > var2) {
              break L1;
            } else {
              if (var3 == 0) {
                L2: {
                  if (null != this.field_e[var2]) {
                    this.field_e[var2].b(true);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var2--;
                if (var3 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              } else {
                return;
              }
            }
          }
          if (param0 < -24) {
            return;
          } else {
            this.field_e = (ji[]) null;
            return;
          }
        }
    }

    final static java.net.URL a(byte param0, int param1, String param2, java.net.URL param3, String param4) {
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
            java.net.URL stackIn_44_0 = null;
            java.net.URL stackIn_46_0 = null;
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
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            RuntimeException stackIn_56_0 = null;
            StringBuilder stackIn_56_1 = null;
            String stackIn_56_2 = null;
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
                        var9 = fleas.field_A ? 1 : 0;
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
                            statePc = 47;
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
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var7_int = var5.indexOf('/', 1 + var6);
                            if ((var7_int ^ -1) > -1) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if ((param1 ^ -1) <= -1) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var5.regionMatches(var6, "/a=", 0, 3)) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var7_int = var5.indexOf('/', var6 - -1);
                            if ((var7_int ^ -1) > -1) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                                statePc = 18;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var7_int = var5.indexOf('/', 1 + var6);
                            if ((var7_int ^ -1) <= -1) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (param2 != null) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 47;
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
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var5.regionMatches(var6, "/s=", 0, 3)) {
                                statePc = 21;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                                statePc = 26;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var7_int = var5.indexOf('/', 1 + var6);
                            if ((var7_int ^ -1) <= -1) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (param4 != null) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 47;
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
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (param0 == 53) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            field_b = (dd) null;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var7 = new StringBuilder(var6);
                            discarded$0 = var7.append(var5.substring(0, var6));
                            if (0 < param1) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            discarded$1 = var7.append("/l=");
                            discarded$2 = var7.append(Integer.toString(param1));
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (param2 == null) {
                                statePc = 35;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if ((param2.length() ^ -1) < -1) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            discarded$3 = var7.append("/p=");
                            discarded$4 = var7.append(param2);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (param4 == null) {
                                statePc = 38;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (-1 <= (param4.length() ^ -1)) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            discarded$5 = var7.append("/s=");
                            discarded$6 = var7.append(param4);
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var5.length() <= var6) {
                                statePc = 41;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            discarded$7 = var7.append(var5.substring(var6, var5.length()));
                            if (var9 == 0) {
                                statePc = 43;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            discarded$8 = var7.append('/');
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            discarded$9 = var7.append('/');
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            stackIn_44_0 = new java.net.URL(param3, var7.toString());
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = ((Object) stateCaught_43 instanceof Exception ? 45 : 47);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        return stackIn_44_0;
                    }
                    case 45: {
                        try {
                            var8 = (Exception) ((Object) caughtException);
                            var8.printStackTrace();
                            stackIn_46_0 = (java.net.URL) (param3);
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        return stackIn_46_0;
                    }
                    case 47: {
                        var5_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_49_0 = (RuntimeException) (var5_ref);
                        stackIn_48_0 = stackIn_49_0;
                        stackIn_49_1 = new StringBuilder().append("nj.D(").append(param0).append(',').append(param1).append(',');
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
                        stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');
                        stackIn_51_1 = stackIn_52_1;
                        if (param3 == null) {
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
                        if (param4 == null) {
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
                        throw pf.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ')');
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
                    var12 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (gb.field_l > param3) {
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
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param2 = param2 - (gb.field_l - param3);
                        param3 = gb.field_l;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2 + param3 <= gb.field_h) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param2 = gb.field_h + -param3;
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
                        if (param0 >= gb.field_b) {
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
                        param4 = param4 - (-param0 + gb.field_b);
                        param0 = gb.field_b;
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
                        if (gb.field_i >= param4 + param0) {
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
                        param4 = -param0 + gb.field_i;
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
                        if (0 >= param2) {
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
                        if (0 < param4) {
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
                        var6_int = param0 * gb.field_d + param3;
                        var7 = gb.field_d - param2;
                        if (param5 == 1067) {
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
                        nj.a((byte) 101);
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
                        param0 = -param4;
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
                        if (0 <= param0) {
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
                        param3 = -param2;
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
                        if (0 <= param3) {
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
                        var8 = gb.field_a[var6_int];
                        stackIn_31_0 = param1 ^ -1;
                        stackIn_23_0 = stackIn_31_0;
                        stackIn_31_1 = (65280 & var8) >> 1876065320 ^ -1;
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
                        if ((var8 >> 875236872 & 255) >= (16711680 & var8) >> -275225488) {
                            statePc = 26;
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
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var9 = -60 + (510 & var8 >> 236763183);
                        if (-256 <= (var9 ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
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
                        var10 = 65280 & var8;
                        var10 = (var10 >> 1802518369) + -(var10 >> 937195909) & 65280;
                        var11 = (255 & var8) >> 1748457475;
                        gb.field_a[var6_int] = ne.a(ne.a(var9 << 1760663824, var10), var11);
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
                        param3++;
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
                        param0++;
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
                    throw pf.a((Throwable) ((Object) var6), "nj.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 34: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    nj(int param0, int param1, int param2, int param3, int[] param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_c = param0 + db.a((byte) -115, na.field_c, param2);
                        this.field_f = param1 - -db.a((byte) -115, na.field_c, param3);
                        this.field_e = new ji[50 - -db.a((byte) -115, na.field_c, 5)];
                        var6_int = this.field_e.length + -1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var6_int < 0) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_e[var6_int] = new ji(this.field_c, this.field_f, db.a((byte) -115, na.field_c, 1024), param4);
                        var6_int--;
                        if (var7 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_g = db.a((byte) -115, na.field_c, 3) + 2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_9_0 = (RuntimeException) (runtimeException);
                    stackIn_8_0 = stackIn_9_0;
                    stackIn_9_1 = new StringBuilder().append("nj.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_8_1 = stackIn_9_1;
                    if (param4 == null) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_8_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_8_1);
                    stackIn_10_2 = "{...}";
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_10_2 = "null";
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        int var1;
        if (param0 == -9340) {
          if (gf.field_d <= 32) {
            ia.a(true, 0);
            if (fleas.field_A) {
              L0: {
                var1 = gf.field_d % 32;
                if (0 == var1) {
                  var1 = 32;
                  break L0;
                } else {
                  break L0;
                }
              }
              ia.a(true, gf.field_d - var1);
              return;
            } else {
              return;
            }
          } else {
            L1: {
              var1 = gf.field_d % 32;
              if (0 == var1) {
                var1 = 32;
                break L1;
              } else {
                break L1;
              }
            }
            ia.a(true, gf.field_d - var1);
            return;
          }
        } else {
          nj.a(-16);
          if (gf.field_d > 32) {
            L2: {
              var1 = gf.field_d % 32;
              if (0 == var1) {
                var1 = 32;
                break L2;
              } else {
                break L2;
              }
            }
            ia.a(true, gf.field_d - var1);
            return;
          } else {
            L3: {
              ia.a(true, 0);
              if (!fleas.field_A) {
                break L3;
              } else {
                L4: {
                  var1 = gf.field_d % 32;
                  if (0 == var1) {
                    var1 = 32;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ia.a(true, gf.field_d - var1);
                break L3;
              }
            }
            return;
          }
        }
    }

    final boolean b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = fleas.field_A ? 1 : 0;
        var2 = 1;
        var3 = 122 % ((param0 - 3) / 55);
        var4 = -1 + this.field_e.length;
        L0: while (true) {
          L1: {
            if ((var4 ^ -1) > -1) {
              break L1;
            } else {
              L2: {
                if (null == this.field_e[var4]) {
                  break L2;
                } else {
                  this.field_e[var4].a(this.field_g, (byte) -128);
                  var2 = var2 != 0 & this.field_e[var4].a(true) ? 1 : 0;
                  break L2;
                }
              }
              var4--;
              if (var5 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          return var2 != 0;
        }
    }

    static {
        field_b = new dd(540, 140);
        field_d = "Next level";
    }
}
