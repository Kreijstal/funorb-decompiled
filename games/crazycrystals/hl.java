/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends l {
    static int field_h;
    private r field_f;
    static String field_e;
    static int field_g;

    final l b(byte param0) {
        if (param0 != -90) {
            return null;
        }
        return (l) (Object) new fe(((hl) this).field_f);
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int stackOut_3_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_18_0 = 0;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = CrazyCrystals.field_B;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (wg.field_P) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = 1;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0 != 0;
                    }
                    case 5: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) hi.a(param0, "getcookies", 16);
                            var4 = ik.a(var3, (byte) -76, ';');
                            if (param1 <= -39) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            uf discarded$2 = hl.a(-13, true);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var5 = 0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 16;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 13;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = 1;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0 != 0;
                    }
                    case 13: {
                        try {
                            var5++;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var2_ref = caughtException;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (null == param0.getParameter("tuhstatbut")) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return stackIn_19_0 != 0;
                    }
                    case 20: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_20_0 = (RuntimeException) var2_ref2;
                        stackOut_20_1 = new StringBuilder().append("hl.D(");
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param0 == null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "{...}";
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_23_2 = stackOut_21_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 22: {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                        stackOut_22_2 = "null";
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        throw dn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
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

    final l a(int param0) {
        jj.field_b = jj.field_b + 16;
        if (!(jj.field_b >= 0)) {
            return (l) this;
        }
        if (param0 != -2) {
            ((hl) this).field_f = null;
        }
        jj.field_b = 0;
        return (l) (Object) new o(30, (l) (Object) new fe(((hl) this).field_f));
    }

    final static uf a(int param0, boolean param1) {
        md var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        Object var8 = null;
        md var9 = null;
        mp var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_22_0 = null;
        L0: {
          var7 = CrazyCrystals.field_B;
          var9 = kd.field_n;
          var2 = var9;
          var3 = var9.h(255);
          lj.field_b = var3 & 127;
          if ((128 & var3) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          om.field_u = stackIn_3_0 != 0;
          dd.field_b = var9.h(255);
          vf.field_d = var9.d(true);
          if (lj.field_b == 2) {
            na.field_kb = var9.c((byte) -7);
            ca.field_m = var9.b(false);
            break L1;
          } else {
            na.field_kb = 0;
            ca.field_m = 0;
            break L1;
          }
        }
        L2: {
          if (var9.h(255) != 1) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          pc.field_w = var9.i(110);
          if (var4 == 0) {
            md.field_s = pc.field_w;
            break L3;
          } else {
            md.field_s = var9.i(121);
            break L3;
          }
        }
        L4: {
          if (param0 == 16) {
            break L4;
          } else {
            var8 = null;
            boolean discarded$8 = hl.a((java.applet.Applet) null, 102);
            break L4;
          }
        }
        L5: {
          if (lj.field_b == 1) {
            int discarded$9 = var9.c((byte) -7);
            String discarded$10 = var9.i(111);
            break L5;
          } else {
            if (lj.field_b != 4) {
              break L5;
            } else {
              int discarded$11 = var9.c((byte) -7);
              String discarded$12 = var9.i(111);
              break L5;
            }
          }
        }
        L6: {
          if (!param1) {
            int discarded$13 = 80;
            int discarded$14 = 116;
            fb.field_b = s.a((ng) (Object) var9);
            so.field_f = null;
            break L6;
          } else {
            var5 = var9.c((byte) -7);
            try {
              L7: {
                L8: {
                  var10 = bn.field_g.a(127, var5);
                  fb.field_b = var10.e(60);
                  if (md.field_s.equals((Object) (Object) je.field_g)) {
                    stackOut_23_0 = null;
                    stackIn_24_0 = (int[]) (Object) stackOut_23_0;
                    break L8;
                  } else {
                    stackOut_22_0 = var10.field_o;
                    stackIn_24_0 = stackOut_22_0;
                    break L8;
                  }
                }
                so.field_f = stackIn_24_0;
                break L7;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                int discarded$15 = 21862;
                wp.a((Throwable) (Object) var6, "CC1");
                fb.field_b = null;
                so.field_f = null;
                break L9;
              }
            }
            break L6;
          }
        }
        return new uf(param1);
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != 25648) {
            Object var2 = null;
            boolean discarded$0 = hl.a((java.applet.Applet) null, -82);
        }
    }

    hl(r param0) {
        try {
            ((hl) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "hl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "This is a hole.<br><br>Watch out! You can fall<br>into holes - unless they<br>have been filled.";
        field_g = 0;
    }
}
