/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class i {
    static String field_g;
    static vj field_b;
    static String field_f;
    static String field_a;
    static int field_c;
    static int field_d;
    static w field_e;

    final static int a(int param0) {
        if (param0 != 1) {
            return -83;
        }
        return ql.field_c;
    }

    public static void b(int param0) {
        field_g = null;
        field_e = null;
        field_b = null;
        field_f = null;
        if (param0 != 28180) {
            return;
        }
        field_a = null;
    }

    final static void a(wl param0, int param1) {
        try {
            int var3_int = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var9 = null;
            byte[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var2 = null;
            Exception var3 = null;
            int var4 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = client.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var9 = new byte[24];
                            var7 = var9;
                            var6 = var7;
                            var12 = var6;
                            if (dj.field_cb != null) {
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
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            dj.field_cb.a(0L, (byte) -109);
                            dj.field_cb.a(var9, (byte) -76);
                            var3_int = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = ((Object) stateCaught_3 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (-25 >= (var3_int ^ -1)) {
                                statePc = 14;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = ((Object) stateCaught_4 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var14 = var9[var3_int] ^ -1;
                            var13 = -1;
                            if (var5 != 0) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = ((Object) stateCaught_5 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var13 == var14) {
                                statePc = 12;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = ((Object) stateCaught_6 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var13 < var14) {
                                statePc = 22;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = ((Object) stateCaught_8 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = ((Object) stateCaught_9 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var5 == 0) {
                                statePc = 14;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = ((Object) stateCaught_10 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = ((Object) stateCaught_11 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_int++;
                            if (var5 == 0) {
                                statePc = 4;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = ((Object) stateCaught_12 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = ((Object) stateCaught_13 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var3_int < 24) {
                                statePc = 22;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = ((Object) stateCaught_14 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = ((Object) stateCaught_15 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var3 = (Exception) ((Object) caughtException);
                            var4 = 0;
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
                            if ((var4 ^ -1) <= -25) {
                                statePc = 22;
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
                            var6[var4] = (byte)-1;
                            var4++;
                            if (var5 != 0) {
                                statePc = 28;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var5 == 0) {
                                statePc = 18;
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
                            param0.a(false, 24, var12, param1);
                            return;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            param0.a(false, 24, var12, param1);
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        var2 = (RuntimeException) ((Object) caughtException);
                        stackIn_26_0 = (RuntimeException) (var2);
                        stackIn_25_0 = stackIn_26_0;
                        stackIn_26_1 = new StringBuilder().append("i.A(");
                        stackIn_25_1 = stackIn_26_1;
                        if (param0 == null) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                        stackIn_27_1 = (StringBuilder) ((Object) stackIn_25_1);
                        stackIn_27_2 = "{...}";
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 26: {
                        stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                        stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                        stackIn_27_2 = "null";
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 27: {
                        throw dh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
                    }
                    case 28: {
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

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_20_0 = null;
        byte[] stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var6 = null;
        int var6_int = 0;
        byte[] var7 = null;
        Object var8 = null;
        wl var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        try {
          L0: {
            L1: {
              var10 = new wl(param0);
              var3 = var10.d((byte) -119);
              var5 = -11 / ((-4 - param1) / 59);
              var4 = var10.i(7553);
              if (var4 < 0) {
                break L1;
              } else {
                L2: {
                  if (ad.field_u == 0) {
                    break L2;
                  } else {
                    if (var4 > ad.field_u) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 == 0) {
                  var14 = new byte[var4];
                  var12 = var14;
                  var6 = var12;
                  var10.a(var14, 0, (byte) 126, var4);
                  stackIn_22_0 = (byte[]) (var6);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var6_int = var10.i(7553);
                    if (var6_int < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (-1 == (ad.field_u ^ -1)) {
                          break L4;
                        } else {
                          if (ad.field_u >= var6_int) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        L6: {
                          var13 = new byte[var6_int];
                          var11 = var13;
                          var7 = var11;
                          if (1 != var3) {
                            break L6;
                          } else {
                            td.a(var13, var6_int, param0, var4, 9);
                            if (!client.field_A) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var8 = jf.field_g;
                        synchronized (var8) {
                          L7: {
                            jf.field_g.a((byte) 111, var10, var13);
                            break L7;
                          }
                        }
                        break L5;
                      }
                      stackIn_20_0 = (byte[]) (var7);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("i.C(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0;
        } else {
          return stackIn_22_0;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_f = "Create a free Account";
        field_g = "Accept";
    }
}
