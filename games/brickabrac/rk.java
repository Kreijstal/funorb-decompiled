/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rk extends mh {
    mh field_Rb;
    static String field_Tb;
    static jp field_Sb;
    private mh field_Pb;
    static int field_Qb;

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var4 = -param2;
          var5 = -param2;
          if (((rk) this).field_Pb == null) {
            break L0;
          } else {
            var4 = ((rk) this).field_Pb.g(71);
            break L0;
          }
        }
        L1: {
          if (null == ((rk) this).field_Rb) {
            break L1;
          } else {
            var5 = ((rk) this).field_Rb.a(-param1 + (-param1 + ((rk) this).field_Ib) - (var4 + param2), 0);
            break L1;
          }
        }
        L2: {
          var7 = 40 / ((-47 - param0) / 42);
          var6 = param2 + var4 + param1 + (var5 - -param1);
          if (((rk) this).field_Ib >= var6) {
            break L2;
          } else {
            var5 = var5 + (((rk) this).field_Ib + -var6);
            var6 = ((rk) this).field_Ib;
            break L2;
          }
        }
        L3: {
          if (-2 != (((rk) this).field_S ^ -1)) {
            break L3;
          } else {
            param1 = param1 + (((rk) this).field_Ib + -var6) / 2;
            break L3;
          }
        }
        L4: {
          if (2 == ((rk) this).field_S) {
            param1 = param1 + (-var6 + ((rk) this).field_Ib);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (null != ((rk) this).field_Pb) {
            ((rk) this).field_Pb.a(((rk) this).field_cb, 0, param1, var4, (byte) 64);
            ((rk) this).field_Pb.field_Q = ((rk) this).field_Q;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (null == ((rk) this).field_Rb) {
            break L6;
          } else {
            ((rk) this).field_Rb.a(((rk) this).field_cb, 0, param2 + (param1 + var4), var5, (byte) 64);
            ((rk) this).field_Rb.field_Q = ((rk) this).field_Q;
            if (null != ((rk) this).field_Pb) {
              ((rk) this).field_Rb.field_S = 0;
              break L6;
            } else {
              ((rk) this).field_Rb.field_S = ((rk) this).field_S;
              break L6;
            }
          }
        }
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_13_0 = 0;
        int stackOut_12_0;
        int stackOut_11_0;
        if (param0 < -58) {
          L0: {
            L1: {
              L2: {
                if (param1 < 48) {
                  break L2;
                } else {
                  if (param1 <= 57) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 65) {
                  break L3;
                } else {
                  if (param1 <= 90) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param1 < 97) {
                  break L4;
                } else {
                  if (122 < param1) {
                    break L4;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L0;
          }
          return stackIn_13_0 != 0;
        } else {
          return false;
        }
    }

    public static void d(byte param0) {
        field_Tb = null;
        field_Sb = null;
        if (param0 != 21) {
            rk.d((byte) -26);
        }
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            ql var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            tg stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            tg stackIn_16_0 = null;
            int stackIn_16_1 = 0;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            java.net.URL stackIn_16_4 = null;
            StringBuilder stackIn_16_5 = null;
            tg stackIn_17_0 = null;
            int stackIn_17_1 = 0;
            java.net.URL stackIn_17_2 = null;
            java.net.URL stackIn_17_3 = null;
            java.net.URL stackIn_17_4 = null;
            StringBuilder stackIn_17_5 = null;
            String stackIn_17_6 = null;
            tg stackOut_14_0;
            int stackOut_14_1;
            java.net.URL stackOut_14_2;
            java.net.URL stackOut_14_3;
            java.net.URL stackOut_14_4;
            StringBuilder stackOut_14_5;
            tg stackOut_15_0;
            int stackOut_15_1;
            java.net.URL stackOut_15_2;
            java.net.URL stackOut_15_3;
            java.net.URL stackOut_15_4;
            StringBuilder stackOut_15_5;
            String stackOut_15_6;
            tg stackOut_16_0;
            int stackOut_16_1;
            java.net.URL stackOut_16_2;
            java.net.URL stackOut_16_3;
            java.net.URL stackOut_16_4;
            StringBuilder stackOut_16_5;
            String stackOut_16_6;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = BrickABrac.field_J ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param2 > 27) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            boolean discarded$2 = rk.a((byte) -93, 'K');
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3_ref = "";
                            if (param1 == null) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var3_ref = pp.a(22570, param1);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param0 != null) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (param1 != null) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var3_ref = var3_ref + param0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            me.a(var3_ref, -107);
                            var7 = oh.a((byte) 13, "%3a", var3_ref, ":");
                            var8 = oh.a((byte) 13, "%40", var7, "@");
                            var9 = oh.a((byte) 13, "%26", var8, "&");
                            var10 = oh.a((byte) 13, "%23", var9, "#");
                            if (null == mk.field_i) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return;
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = mq.field_e;
                            stackOut_14_1 = -49;
                            stackOut_14_2 = null;
                            stackOut_14_3 = null;
                            stackOut_14_4 = mk.field_i.getCodeBase();
                            stackOut_14_5 = new StringBuilder().append("clienterror.ws?c=").append(oj.field_m).append("&u=");
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_16_1 = stackOut_14_1;
                            stackIn_16_2 = stackOut_14_2;
                            stackIn_16_3 = stackOut_14_3;
                            stackIn_16_4 = stackOut_14_4;
                            stackIn_16_5 = stackOut_14_5;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            stackIn_15_3 = stackOut_14_3;
                            stackIn_15_4 = stackOut_14_4;
                            stackIn_15_5 = stackOut_14_5;
                            if (ua.field_a == null) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = (tg) (Object) stackIn_15_0;
                            stackOut_15_1 = stackIn_15_1;
                            stackOut_15_2 = null;
                            stackOut_15_3 = null;
                            stackOut_15_4 = (java.net.URL) (Object) stackIn_15_4;
                            stackOut_15_5 = (StringBuilder) (Object) stackIn_15_5;
                            stackOut_15_6 = ua.field_a;
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_17_1 = stackOut_15_1;
                            stackIn_17_2 = stackOut_15_2;
                            stackIn_17_3 = stackOut_15_3;
                            stackIn_17_4 = stackOut_15_4;
                            stackIn_17_5 = stackOut_15_5;
                            stackIn_17_6 = stackOut_15_6;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = (tg) (Object) stackIn_16_0;
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = null;
                            stackOut_16_3 = null;
                            stackOut_16_4 = (java.net.URL) (Object) stackIn_16_4;
                            stackOut_16_5 = (StringBuilder) (Object) stackIn_16_5;
                            stackOut_16_6 = "" + sb.field_e;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            stackIn_17_2 = stackOut_16_2;
                            stackIn_17_3 = stackOut_16_3;
                            stackIn_17_4 = stackOut_16_4;
                            stackIn_17_5 = stackOut_16_5;
                            stackIn_17_6 = stackOut_16_6;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            new java.net.URL((java.net.URL) (Object) stackIn_17_4, (String) (Object) (stackIn_17_6 + "&v1=" + tg.field_g + "&v2=" + tg.field_o + "&e=" + var10));
                            var4 = ((tg) (Object) stackIn_17_0).a((byte) stackIn_17_1, (java.net.URL) (Object) stackIn_17_2);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var4.field_f != 0) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            wj.a(-125, 1L);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (-2 == (var4.field_f ^ -1)) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var5 = (DataInputStream) var4.field_e;
                            int discarded$3 = var5.read();
                            var5.close();
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
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

    final int a(int param0, int param1, int param2) {
        if (param1 != 24) {
            boolean discarded$0 = rk.a((byte) 108, '￱');
        }
        int var4 = -param0;
        if (!(((rk) this).field_Pb == null)) {
            var4 = ((rk) this).field_Pb.g(107);
        }
        int var5 = -param0;
        if (null != ((rk) this).field_Rb) {
            var5 = ((rk) this).field_Rb.g(64);
        }
        return param2 + var4 + (param0 + var5) + param2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 != -10411) {
            Object var9 = null;
            rk.a((String) null, (Throwable) null, 64);
        }
        ((rk) this).a(param5, param1, param4, param6, (byte) 64);
        this.b(param0 ^ 10436, param2, param3);
    }

    rk(long param0, mh param1, mh param2, mh param3, jp param4, String param5) {
        super(param0, param1);
        if (param4 != null) {
            ((rk) this).field_Pb = new mh(0L, param2);
            ((rk) this).field_Pb.field_wb = param4;
            ((rk) this).a(((rk) this).field_Pb, 0);
        }
        if (param5 != null) {
            ((rk) this).field_Rb = new mh(0L, param3, param5);
            ((rk) this).a(((rk) this).field_Rb, 0);
        }
        ((rk) this).c(true);
    }

    final static dc[] a(pi param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        dc[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        dc var6 = null;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        var2 = param0.c(8, (byte) -85);
        if ((var2 ^ -1) >= -1) {
          L0: {
            if (param1 == 24) {
              break L0;
            } else {
              field_Tb = null;
              break L0;
            }
          }
          var3 = param0.c(12, (byte) 85);
          var4 = new dc[var3];
          var5 = 0;
          L1: while (true) {
            if (var5 >= var3) {
              return var4;
            } else {
              if (eo.a(false, param0)) {
                var6 = new dc();
                int discarded$6 = param0.c(24, (byte) -115);
                int discarded$7 = param0.c(24, (byte) 107);
                var6.field_a = param0.c(24, (byte) -86);
                int discarded$8 = param0.c(9, (byte) 110);
                int discarded$9 = param0.c(12, (byte) -113);
                int discarded$10 = param0.c(12, (byte) -91);
                int discarded$11 = param0.c(12, (byte) -112);
                var4[var5] = var6;
                var5++;
                continue L1;
              } else {
                var6_int = param0.c(dj.a(-1 + var5, 15), (byte) 98);
                var4[var5] = var4[var6_int];
                var5++;
                continue L1;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
    }
}
