/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tb {
    static ej field_a;

    final static boolean a(fg param0, int param1, fg param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var4 = Confined.field_J ? 1 : 0;
          var3 = -param2.field_lb + param0.field_lb;
          if (ql.field_t != param0.field_kb) {
            if (param0.field_kb != null) {
              break L0;
            } else {
              // wide iinc 3 200
              break L0;
            }
          } else {
            // wide iinc 3 -200
            break L0;
          }
        }
        L1: {
          if (param1 == 200) {
            break L1;
          } else {
            var5 = null;
            boolean discarded$2 = tb.a((fg) null, -40, (fg) null);
            break L1;
          }
        }
        L2: {
          if (ql.field_t == param2.field_kb) {
            // wide iinc 3 200
            break L2;
          } else {
            if (null == param2.field_kb) {
              // wide iinc 3 -200
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (0 >= var3) {
            stackOut_13_0 = 0;
            stackIn_14_0 = stackOut_13_0;
            break L3;
          } else {
            stackOut_12_0 = 1;
            stackIn_14_0 = stackOut_12_0;
            break L3;
          }
        }
        return stackIn_14_0 != 0;
    }

    final static void a(int param0, String param1) {
        if (param0 != -15912) {
            Object var3 = null;
            boolean discarded$0 = tb.a((fg) null, -108, (fg) null);
        }
        rl.field_s = param1;
        vf.a((byte) -115, 12);
    }

    final static void a(int param0, int param1) {
        try {
            IOException var2 = null;
            Object var3 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == kl.field_G) {
                            statePc = 10;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (0 <= param0) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (0 != vh.field_a.field_n) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        if ((pc.field_a + 10000L ^ -1L) <= (ri.a(-3) ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        vh.field_a.b(true, param0);
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 5: {
                        if (wd.field_f != lk.field_d) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (0 != vh.field_a.field_n) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if ((pc.field_a + 10000L ^ -1L) <= (ri.a(-3) ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        vh.field_a.b(true, param0);
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 10: {
                        vh.field_a.field_n = 0;
                        return;
                    }
                    case 12: {
                        if ((vh.field_a.field_n ^ -1) >= -1) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            kl.field_G.a(vh.field_a.field_n, false, vh.field_a.field_m, 0);
                            pc.field_a = ri.a(-3);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        var2 = (IOException) (Object) caughtException;
                        dc.d(118);
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        vh.field_a.field_n = 0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (param1 > 103) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        var3 = null;
                        boolean discarded$2 = tb.a((fg) null, -29, (fg) null);
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
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

    final static String a(int param0, kg param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        Object var6 = null;
        String stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        try {
          L0: {
            if (param2 < -115) {
              break L0;
            } else {
              var6 = null;
              String discarded$2 = tb.a(14, (CharSequence) null, true);
              break L0;
            }
          }
          L1: {
            var3_int = param1.k((byte) -11);
            if (var3_int > param0) {
              var3_int = param0;
              break L1;
            } else {
              break L1;
            }
          }
          var4 = new byte[var3_int];
          param1.field_n = param1.field_n + hc.field_t.a(param1.field_n, var4, 0, param1.field_m, var3_int, false);
          var5 = kh.a(var4, var3_int, 0, 0);
          stackOut_5_0 = (String) var5;
          stackIn_6_0 = stackOut_5_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_6_0;
        }
        return null;
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 25 % ((param0 - -7) / 51);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = Confined.field_J ? 1 : 0;
          if (param13 <= -52) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          if (param1 >= param3) {
            if (param1 >= param10) {
              if (param10 > param3) {
                ih.a(true, fn.field_h, param3, param6, param2, param9, param1, param5, param8, param15, param10, param7, param11, param4, param12, param0, param14);
                break L1;
              } else {
                ih.a(true, fn.field_h, param10, param14, param9, param2, param1, param5, param12, param15, param3, param7, param11, param0, param8, param4, param6);
                break L1;
              }
            } else {
              ih.a(true, fn.field_h, param3, param7, param5, param9, param10, param2, param8, param4, param1, param6, param12, param15, param11, param0, param14);
              break L1;
            }
          } else {
            if (param10 <= param3) {
              if (param1 >= param10) {
                ih.a(true, fn.field_h, param10, param7, param5, param2, param3, param9, param12, param0, param1, param14, param8, param15, param11, param4, param6);
                break L1;
              } else {
                ih.a(true, fn.field_h, param1, param6, param2, param5, param3, param9, param11, param0, param10, param14, param8, param4, param12, param15, param7);
                break L1;
              }
            } else {
              ih.a(true, fn.field_h, param1, param14, param9, param5, param10, param2, param11, param4, param3, param6, param12, param0, param8, param15, param7);
              break L1;
            }
          }
        }
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Confined.field_J ? 1 : 0;
        var3 = vk.a(param2, param1, (byte) -2);
        if (var3 != null) {
          return var3;
        } else {
          var4 = param0;
          L0: while (true) {
            if (var4 < param1.length()) {
              if (og.a(-96, param1.charAt(var4))) {
                var4++;
                continue L0;
              } else {
                return jn.field_R;
              }
            } else {
              return null;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ej();
    }
}
