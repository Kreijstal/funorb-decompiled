/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class bd extends qt {
    static boolean field_D;
    static String field_B;
    static vg field_A;

    public static void f(int param0) {
        field_B = null;
        if (param0 >= -25) {
            return;
        }
        field_A = null;
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          super.a((byte) 117, param1);
          if (up.a((byte) -3)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = rp.a(stackIn_3_0 != 0, -587);
        if ((var3 ^ -1) == -4) {
          if (null == e.field_m) {
            cq.a(so.a(-98), (byte) 126);
            if ((var3 ^ -1) != -2) {
              L1: {
                if ((var3 ^ -1) == -3) {
                  jm.a(0, true, -2);
                  break L1;
                } else {
                  break L1;
                }
              }
              var4 = 62 / ((38 - param0) / 60);
              return;
            } else {
              L2: {
                jm.a(0, false, -2);
                if ((var3 ^ -1) == -3) {
                  jm.a(0, true, -2);
                  break L2;
                } else {
                  break L2;
                }
              }
              var4 = 62 / ((38 - param0) / 60);
              return;
            }
          } else {
            fd.h(0);
            cq.a(so.a(-98), (byte) 126);
            if ((var3 ^ -1) == -2) {
              L3: {
                jm.a(0, false, -2);
                if ((var3 ^ -1) == -3) {
                  jm.a(0, true, -2);
                  break L3;
                } else {
                  break L3;
                }
              }
              var4 = 62 / ((38 - param0) / 60);
              return;
            } else {
              L4: {
                if ((var3 ^ -1) == -3) {
                  jm.a(0, true, -2);
                  break L4;
                } else {
                  break L4;
                }
              }
              var4 = 62 / ((38 - param0) / 60);
              return;
            }
          }
        } else {
          if ((var3 ^ -1) != -2) {
            L5: {
              if ((var3 ^ -1) == -3) {
                jm.a(0, true, -2);
                break L5;
              } else {
                break L5;
              }
            }
            var4 = 62 / ((38 - param0) / 60);
            return;
          } else {
            L6: {
              jm.a(0, false, -2);
              if ((var3 ^ -1) == -3) {
                jm.a(0, true, -2);
                break L6;
              } else {
                break L6;
              }
            }
            var4 = 62 / ((38 - param0) / 60);
            return;
          }
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = param2 >> 2141048528;
        var4 = param2 & 65535;
        if (param1) {
          return 87;
        } else {
          var5 = param0 >> -196501712;
          var6 = 65535 & param0;
          return (var6 * var4 >> 293067888) + param0 * var3 - -(var5 * var4);
        }
    }

    final void a(int param0, boolean param1) {
        super.a(param0, param1);
    }

    bd() {
    }

    final static void e(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Kickabout.field_G;
        st.field_m = null;
        wq.field_g = false;
        if (param0 == -1) {
          if (!hk.field_G) {
            var1 = rl.field_n;
            if (-1 > var1) {
              if (-2 != var1) {
                st.field_m = vo.a((byte) -18, tk.field_Lb, new String[1]);
                st.field_m = kr.a(new CharSequence[3], false);
                rk.field_f.q(-105);
                fj.a(param0 ^ 44);
                return;
              } else {
                st.field_m = dq.field_h;
                st.field_m = kr.a(new CharSequence[3], false);
                rk.field_f.q(-105);
                fj.a(param0 ^ 44);
                return;
              }
            } else {
              rk.field_f.q(-105);
              fj.a(param0 ^ 44);
              return;
            }
          } else {
            rk.field_f.r(2121792);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            wu var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            bu stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            bu stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            bu stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            String stackIn_14_5 = null;
            bu stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            bu stackOut_12_0 = null;
            java.net.URL stackOut_12_1 = null;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            StringBuilder stackOut_12_4 = null;
            String stackOut_12_5 = null;
            bu stackOut_13_0 = null;
            java.net.URL stackOut_13_1 = null;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            StringBuilder stackOut_13_4 = null;
            String stackOut_13_5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Kickabout.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param1 == null) {
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
                            var3_ref = le.a(true, param1);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param0 != null) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param1 != null) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var3_ref = var3_ref + param0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            or.a(var3_ref, param2 ^ 0);
                            var7 = aj.a(-1, ":", "%3a", var3_ref);
                            var8 = aj.a(param2 ^ -2, "@", "%40", var7);
                            var9 = aj.a(-1, "&", "%26", var8);
                            var10 = aj.a(-1, "#", "%23", var9);
                            if (null != ug.field_a) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = sa.field_a;
                            stackOut_11_1 = null;
                            stackOut_11_2 = null;
                            stackOut_11_3 = ug.field_a.getCodeBase();
                            stackOut_11_4 = new StringBuilder().append("clienterror.ws?c=").append(ei.field_e).append("&u=");
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_13_2 = stackOut_11_2;
                            stackIn_13_3 = stackOut_11_3;
                            stackIn_13_4 = stackOut_11_4;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            stackIn_12_3 = stackOut_11_3;
                            stackIn_12_4 = stackOut_11_4;
                            if (null == ds.field_b) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = (bu) (Object) stackIn_12_0;
                            stackOut_12_1 = null;
                            stackOut_12_2 = null;
                            stackOut_12_3 = (java.net.URL) (Object) stackIn_12_3;
                            stackOut_12_4 = (StringBuilder) (Object) stackIn_12_4;
                            stackOut_12_5 = ds.field_b;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            stackIn_14_3 = stackOut_12_3;
                            stackIn_14_4 = stackOut_12_4;
                            stackIn_14_5 = stackOut_12_5;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (bu) (Object) stackIn_13_0;
                            stackOut_13_1 = null;
                            stackOut_13_2 = null;
                            stackOut_13_3 = (java.net.URL) (Object) stackIn_13_3;
                            stackOut_13_4 = (StringBuilder) (Object) stackIn_13_4;
                            stackOut_13_5 = "" + tn.field_a;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            stackIn_14_3 = stackOut_13_3;
                            stackIn_14_4 = stackOut_13_4;
                            stackIn_14_5 = stackOut_13_5;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + bu.field_u + "&v2=" + bu.field_r + "&e=" + var10);
                            var4 = ((bu) (Object) stackIn_14_0).a(stackIn_14_1, (byte) -29);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var4.field_a != 0) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            aj.a(1L, param2 + 0);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (param2 != var4.field_a) {
                                statePc = 21;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var5 = (DataInputStream) var4.field_b;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "This auction has been bought out! Your bid of <%0> was returned to you.";
    }
}
