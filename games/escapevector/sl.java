/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sl {
    static String[] field_c;
    static uf field_d;
    static long field_a;
    static ed[][] field_b;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 127) {
          sl.a((mf) null, (mf) null, (int[]) null, (byte[][][]) null, -11, 8);
          field_b = (ed[][]) null;
          field_d = null;
          return;
        } else {
          field_b = (ed[][]) null;
          field_d = null;
          return;
        }
    }

    final static byte[][][] a(mf param0, mf param1, int[] param2, byte[][][] param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        byte[][] var12 = null;
        byte[][][] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = EscapeVector.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = dh.field_e.length;
                        if (param3 != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        param3 = new byte[var6_int][][];
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7 = param5;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 >= var6_int) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8 = dh.field_e[var7];
                        if (param4 == var8) {
                            statePc = 8;
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
                        if (var10 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
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
                        if (param3[var7] == null) {
                            statePc = 11;
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
                        if (var10 == 0) {
                            statePc = 12;
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
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var12 = ol.a(-51, param1, param2, var7, param0);
                        param3[var7] = var12;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7++;
                        if (var10 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = (byte[][][]) (param3);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var6);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("sl.A(");
                    stackIn_16_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param1 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
                    stackIn_22_1 = stackIn_23_1;
                    if (param2 == null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_24_2 = "{...}";
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_24_2 = "null";
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
                    stackIn_25_1 = stackIn_26_1;
                    if (param3 == null) {
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
                    throw t.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param4 + ',' + param5 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static gi a(boolean param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_26_0 = null;
        Throwable decompiledCaughtException = null;
        c var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        si var8 = null;
        L0: {
          var7 = EscapeVector.field_A;
          var2 = om.field_g;
          var3 = var2.e(0);
          fl.field_o = var3 & 127;
          if (0 == (128 & var3)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          rm.field_c = stackIn_3_0 != 0;
          ve.field_g = var2.e(0);
          ah.field_e = var2.i(-800509813);
          if (fl.field_o != 2) {
            im.field_a = 0;
            jn.field_d = 0;
            break L1;
          } else {
            jn.field_d = var2.f(1952);
            im.field_a = var2.d((byte) -119);
            if (var7 == 0) {
              break L1;
            } else {
              im.field_a = 0;
              jn.field_d = 0;
              break L1;
            }
          }
        }
        L2: {
          if ((var2.e(param1 ^ param1) ^ -1) != -2) {
            stackIn_11_0 = 0;
            break L2;
          } else {
            stackIn_11_0 = 1;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_11_0;
          gm.field_e = var2.c(false);
          if (var4 != 0) {
            rm.field_g = var2.c(false);
            break L3;
          } else {
            rm.field_g = gm.field_e;
            if (var7 == 0) {
              break L3;
            } else {
              rm.field_g = var2.c(false);
              break L3;
            }
          }
        }
        L4: {
          if (1 == fl.field_o) {
            var2.f(1952);
            var2.c(false);
            break L4;
          } else {
            if (fl.field_o == 4) {
              var2.f(1952);
              var2.c(false);
              break L4;
            } else {
              break L4;
            }
          }
        }
        if (!param0) {
          od.field_d = fn.a(var2, 10241, 80);
          bo.field_H = null;
          return new gi(param0);
        } else {
          var5 = var2.f(1952);
          try {
            L5: {
              L6: {
                var8 = hi.field_s.a(var5, (byte) -126);
                od.field_d = var8.g(-4);
                if (rm.field_g.equals(ck.field_r)) {
                  stackIn_26_0 = null;
                  break L6;
                } else {
                  stackIn_26_0 = var8.field_z;
                  break L6;
                }
              }
              bo.field_H = stackIn_26_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              pf.a(false, "CC1", (Throwable) ((Object) var6));
              bo.field_H = null;
              od.field_d = null;
              break L7;
            }
          }
          if (var7 != 0) {
            od.field_d = fn.a(var2, 10241, 80);
            bo.field_H = null;
            return new gi(param0);
          } else {
            return new gi(param0);
          }
        }
    }

    final static boolean a(boolean param0, byte param1) {
        try {
            long dupTemp$1 = 0L;
            IOException var2 = null;
            c var4 = null;
            c var5 = null;
            int stackIn_11_0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (sk.field_d == null) {
                sk.field_d = ca.field_c.a(ej.field_b, 4, cn.field_h);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_b = (ed[][]) null;
                break L1;
              }
            }
            if (-1 != (sk.field_d.field_f ^ -1)) {
              dupTemp$1 = td.b(128);
              le.field_c = dupTemp$1;
              field_a = dupTemp$1;
              if (-2 != (sk.field_d.field_f ^ -1)) {
                al.field_d = ak.field_d;
                sk.field_d = null;
                return true;
              } else {
                try {
                  L2: {
                    L3: {
                      pg.field_c = new pj((java.net.Socket) (sk.field_d.field_b), ca.field_c);
                      om.field_c.field_m = 0;
                      var4 = om.field_g;
                      var5 = var4;
                      al.field_d = sf.field_d;
                      var5.field_m = 0;
                      if (!param0) {
                        stackIn_11_0 = -1;
                        break L3;
                      } else {
                        stackIn_11_0 = -2;
                        break L3;
                      }
                    }
                    g.field_q = stackIn_11_0;
                    f.field_t = stackIn_11_0;
                    jj.field_b = stackIn_11_0;
                    wc.a(rd.field_a, ac.field_b, true, qa.field_D, om.field_c);
                    rn.a(-1, 30785);
                    break L2;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  al.field_d = ak.field_d;
                  if (EscapeVector.field_A != 0) {
                    al.field_d = ak.field_d;
                    sk.field_d = null;
                    return true;
                  } else {
                    sk.field_d = null;
                    return true;
                  }
                }
                sk.field_d = null;
                return true;
              }
            } else {
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_b = new ed[7][4];
    }
}
