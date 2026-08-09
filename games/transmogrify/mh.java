/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mh {
    static int[] field_b;
    static qj field_e;
    static String field_c;
    static String field_d;
    static qj field_a;

    final static void a(int param0, String param1) {
        try {
            ql.field_a = param1;
            if (param0 != 11207) {
                field_e = (qj) null;
            }
            ba.a(108, 12);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "mh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static q a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        q var7 = null;
        int var8 = 0;
        q stackIn_3_0 = null;
        q stackIn_7_0 = null;
        q stackIn_10_0 = null;
        q stackIn_16_0 = null;
        q stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (255 < var2_int) {
                stackIn_7_0 = rd.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = vi.a((char)param1, param0, 0);
                if (var3.length >= 2) {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var5 >= var4.length) {
                          break L3;
                        } else {
                          var6 = var4[var5];
                          stackIn_19_0 = gj.a(param1 + -46, var6);

                          if (var8 != 0) {
                            break L2;
                          } else {
                            var7 = stackIn_19_0;
                            if (var7 == null) {
                              var5++;
                              if (var8 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            } else {
                              stackIn_16_0 = (q) (var7);
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        }
                      }
                      stackIn_19_0 = uf.a(false, var3[var3.length - 1]);
                      break L2;
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_10_0 = ai.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = ai.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("mh.B(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                return stackIn_16_0;
              }
            }
          }
        }
    }

    final static void a(int param0, sg param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$3 = 0;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var2_int ^ -1) <= -4) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ol.field_d[var2_int] = 0;
                        var2_int++;
                        if (var5 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (q.field_b <= var2_int) {
                            statePc = 15;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7 = param1.field_i ^ -1;
                        var6 = eg.field_a[var2_int].field_i ^ -1;
                        if (var5 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var6 == var7) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 == var7) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        dupTemp$0 = eg.field_a[var2_int].a(true);
                        ol.field_d[dupTemp$0] = ol.field_d[dupTemp$0] + 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var2_int++;
                        if (var5 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param0 == -27968) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        field_b = (int[]) null;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        dupTemp$1 = param1.a(true);
                        ol.field_d[dupTemp$1] = ol.field_d[dupTemp$1] + 1;
                        var2_int = 0;
                        var3 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (q.field_b <= var3) {
                            statePc = 26;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_27_0 = eg.field_a[var3].field_i;
                        stackIn_20_0 = stackIn_27_0;
                        if (var5 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 != param1.field_i) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4 = eg.field_a[var3].a(true);
                        if (ol.field_d[var4] > kh.field_d) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ol.field_d[var4] = ol.field_d[var4] - 1;
                        if (var5 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        incrementValue$2 = var2_int;
                        var2_int++;
                        eg.field_a[incrementValue$2] = eg.field_a[var3];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var3++;
                        if (var5 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = var2_int;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        q.field_b = stackIn_27_0;
                        fieldTemp$3 = q.field_b;
                        q.field_b = q.field_b + 1;
                        eg.field_a[fieldTemp$3] = param1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_31_0 = (RuntimeException) (var2);
                    stackIn_30_0 = stackIn_31_0;
                    stackIn_31_1 = new StringBuilder().append("mh.C(").append(param0).append(',');
                    stackIn_30_1 = stackIn_31_1;
                    if (param1 == null) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_32_2 = "{...}";
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_32_2 = "null";
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    throw ch.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
                }
                case 33: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String b(int param0) {
        if (!((bi.field_L ^ -1) <= -3)) {
            return vj.field_a;
        }
        if (null != hg.field_a) {
            if (!(hg.field_a.a((byte) -118))) {
                return dj.field_c;
            }
            return od.field_h;
        }
        if (!(cj.field_c.a((byte) -124))) {
            return vg.field_a;
        }
        if (!cj.field_c.a((byte) 120, "commonui")) {
            return aa.field_f + " - " + cj.field_c.a(0, "commonui") + "%";
        }
        if (param0 <= 75) {
            return (String) null;
        }
        if (!(wi.field_e.a((byte) -121))) {
            return dj.field_a;
        }
        if (!wi.field_e.a((byte) 120, "commonui")) {
            return i.field_c + " - " + wi.field_e.a(0, "commonui") + "%";
        }
        if (!(nd.field_n.a((byte) -123))) {
            return gk.field_a;
        }
        if (!(nd.field_n.c(32031))) {
            return fj.field_b + " - " + nd.field_n.b(-22884) + "%";
        }
        return field_d;
    }

    final static ci a(int param0, boolean param1, boolean param2, boolean param3, int param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            be var8 = null;
            ci stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            if (param0 == -26159) {
              try {
                L0: {
                  L1: {
                    var6 = null;
                    if (null != qi.field_a.field_b) {
                      kk.field_b = new we(qi.field_a.field_b, 5200, 0);
                      qi.field_a.field_b = null;
                      var6 = new ak(255, kk.field_b, new we(qi.field_a.field_h, 12000, 0), 2097152);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    var7 = null;
                    if (kk.field_b == null) {
                      break L2;
                    } else {
                      L3: {
                        if (null != oa.field_m) {
                          break L3;
                        } else {
                          oa.field_m = new we[qi.field_a.field_s.length];
                          break L3;
                        }
                      }
                      L4: {
                        if (oa.field_m[param5] != null) {
                          break L4;
                        } else {
                          oa.field_m[param5] = new we(qi.field_a.field_s[param5], 12000, 0);
                          qi.field_a.field_s[param5] = null;
                          break L4;
                        }
                      }
                      var7 = new ak(param5, kk.field_b, oa.field_m[param5], 2097152);
                      break L2;
                    }
                  }
                  L5: {
                    var8 = we.field_j.a(param5, param3, 24108, (ak) (var6), (ak) (var7));
                    if (param1) {
                      var8.a(true);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  stackIn_15_0 = new ci(var8, param2, param4);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(((IOException) (var6)).toString());
              }
              return stackIn_15_0;
            } else {
              return (ci) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        field_e = null;
        field_d = null;
        if (param0 == 0) {
            return;
        }
        mh.a(1);
    }

    static {
        field_b = new int[1024];
        field_e = new qj();
        field_d = "Please wait...";
        field_a = new qj();
    }
}
