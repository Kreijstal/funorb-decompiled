/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lf {
    static ja[] field_c;
    static lf field_a;
    static int field_d;
    static th field_e;
    static String field_b;

    final static StringBuilder a(char param0, int param1, int param2, StringBuilder param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder var7 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param3.length();
                        param3.setLength(param1);
                        if (param2 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var7 = (StringBuilder) null;
                        lf.a('￝', 1, -128, (StringBuilder) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = var4_int;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1 <= var5) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_9_0 = (StringBuilder) (param3);
                        stackIn_6_0 = stackIn_9_0;
                        if (var6 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((StringBuilder) (Object) stackIn_6_0).setCharAt(var5, param0);
                        var5++;
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = (StringBuilder) (param3);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_12_0 = (RuntimeException) (var4);
                    stackIn_11_0 = stackIn_12_0;
                    stackIn_12_1 = new StringBuilder().append("lf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_11_1 = stackIn_12_1;
                    if (param3 == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_13_2 = "{...}";
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_13_2 = "null";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(dm param0, boolean param1) {
        dm var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        dm stackIn_8_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            param0.a(param1);
            var2 = (dm) ((Object) cg.field_i.c(104));
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var2 == null) {
                      break L4;
                    } else {
                      stackIn_8_0 = (dm) (var2);

                      if (var3 != 0) {
                        break L3;
                      } else {
                        if (!((dm) (Object) stackIn_8_0).a((byte) -117, param0)) {
                          break L4;
                        } else {
                          var2 = (dm) ((Object) cg.field_i.b(6));
                          if (var3 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if (var2 == null) {
                    break L2;
                  } else {
                    stackIn_8_0 = (dm) (var2);
                    break L3;
                  }
                }
                vc.a(stackIn_8_0, param0, param1);
                if (var3 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              }
              cg.field_i.a(param0, false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2_ref);

            stackIn_13_1 = new StringBuilder().append("lf.B(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_e = null;
    }

    final static void a(boolean param0, int param1, long param2, int param3, int param4, int param5, go param6, int param7, boolean param8, int param9, int param10, int param11, String param12, int param13) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            StringBuilder stackIn_19_1 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                if (param1 == -5989) {
                  L1: {
                    s.field_e = new ga(param11);
                    ma.field_a = new ga(param10);
                    tm.field_c = param12;
                    if (!param8) {
                      stackIn_5_0 = 0;
                      break L1;
                    } else {
                      stackIn_5_0 = 1;
                      break L1;
                    }
                  }
                  L2: {
                    cm.field_e = stackIn_5_0 != 0;
                    ok.field_m = param6;
                    if (!param0) {
                      stackIn_8_0 = 0;
                      break L2;
                    } else {
                      stackIn_8_0 = 1;
                      break L2;
                    }
                  }
                  gj.field_e = stackIn_8_0 != 0;
                  dc.field_Hb = param3;
                  jo.field_b = param13;
                  rp.field_q = param7;
                  lo.field_b = param5;
                  v.field_f = param4;
                  qa.field_i = param2;
                  ff.field_s = param9;
                  if (null != ok.field_m.field_s) {
                    try {
                      L3: {
                        bg.field_e = new of(ok.field_m.field_s, 64, 0);
                        break L3;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var15 = (IOException) (Object) decompiledCaughtException;
                      throw new RuntimeException(var15.toString());
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var15_ref);

                stackIn_16_1 = new StringBuilder().append("lf.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

                if (param6 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L4;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');

                if (param12 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L5;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L5;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(ef param0, int param1) {
        int var2_int = 0;
        ja var3 = null;
        if (null == of.field_k) {
            return;
        }
        try {
            var2_int = param0.field_C - -param0.field_r;
            var3 = new ja(var2_int, var2_int);
            var3.a();
            of.field_k.c(0, param1, var2_int, var2_int);
            dl.field_h.b((byte) 119);
            of.field_k = var3;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "lf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = new lf();
        field_e = new th();
        field_b = "Disguise";
    }
}
