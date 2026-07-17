/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static nh field_d;
    static ok field_e;
    static String[] field_a;
    static he field_c;
    static he[] field_b;

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        if (param0) {
            field_e = null;
        }
        field_e = null;
        field_c = null;
        field_d = null;
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        if (param0 != 63) {
            return '';
        }
        int var2 = param1 & 255;
        if (!(var2 != 0)) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (128 <= var2) {
            if (var2 < 160) {
                var3 = we.field_a[-128 + var2];
                if (!(0 != var3)) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    final static void a(u param0, boolean param1, int param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              fb.field_b[0] = cm.field_M.nextInt();
              fb.field_b[1] = cm.field_M.nextInt();
              am.field_n.field_j = 0;
              fb.field_b[2] = (int)(s.field_c >> 32);
              fb.field_b[3] = (int)s.field_c;
              am.field_n.a(fb.field_b[0], (byte) -49);
              am.field_n.a(fb.field_b[1], (byte) 119);
              am.field_n.a(fb.field_b[2], (byte) -50);
              am.field_n.a(fb.field_b[3], (byte) -44);
              u.a(am.field_n, (byte) -102);
              am.field_n.c(param2, -17402);
              param0.a(am.field_n, 119);
              nj.field_p.field_j = 0;
              if (param3) {
                nj.field_p.c(18, (byte) -128);
                break L1;
              } else {
                nj.field_p.c(16, (byte) -105);
                break L1;
              }
            }
            L2: {
              nj.field_p.field_j = nj.field_p.field_j + 2;
              var5_int = nj.field_p.field_j;
              nj.field_p.a(nf.field_t, (byte) 113);
              nj.field_p.a(n.field_i, (byte) -25);
              var6 = 0;
              if (!bd.field_N) {
                break L2;
              } else {
                var6 = var6 | 1;
                break L2;
              }
            }
            L3: {
              if (wg.field_d) {
                var6 = var6 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param1) {
                break L4;
              } else {
                var6 = var6 | 8;
                break L4;
              }
            }
            L5: {
              if (cj.field_i == null) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              nj.field_p.c(var6, (byte) -107);
              var7 = ob.a((byte) 117, nb.a(-109));
              if (var7 == null) {
                var7 = "";
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              nj.field_p.a(var7, -1);
              if (cj.field_i == null) {
                break L7;
              } else {
                nj.field_p.a(-23805, cj.field_i);
                break L7;
              }
            }
            i.a((od) (Object) nj.field_p, am.field_n, a.field_b, d.field_a, 0);
            nj.field_p.a(-2, nj.field_p.field_j + -var5_int);
            qj.a(-1, 14656);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("le.C(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + 16 + 41);
        }
    }

    final static String a(java.applet.Applet param0, String param1, int param2) {
        try {
            int var3_int = 0;
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String stackIn_6_0 = null;
            Object stackIn_11_0 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            String stackOut_5_0 = null;
            Object stackOut_10_0 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_int = 0;
                            var4 = (String) pb.a("getcookies", param0, true);
                            var5 = ki.a((byte) -113, ';', var4);
                            var6 = 0;
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
                            if (var6 >= var5.length) {
                                statePc = 10;
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
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 7;
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
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) param1)) {
                                statePc = 7;
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
                            stackOut_5_0 = var5[var6].substring(var7 + 1).trim();
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0;
                    }
                    case 7: {
                        try {
                            var6++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var3 = caughtException;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = null;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return (String) (Object) stackIn_11_0;
                    }
                    case 12: {
                        var3_ref = (RuntimeException) (Object) caughtException;
                        stackOut_12_0 = (RuntimeException) var3_ref;
                        stackOut_12_1 = new StringBuilder().append("le.A(");
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param0 == null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "{...}";
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 14: {
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                        stackOut_14_2 = "null";
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (param1 == null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "{...}";
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "null";
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        throw ie.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + 43 + 41);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Introduction", "It gets harder", "The first command ship", "Asteroids!", "Mines!", "Alien starbase", "If these are the wastelands...", "...what are the cities like?", "The final showdown"};
    }
}
