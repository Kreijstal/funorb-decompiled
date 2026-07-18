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
                field_e = null;
            }
            ba.a(108, 12);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "mh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static q a(String param0) {
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
        q stackIn_15_0 = null;
        q stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        q stackOut_6_0 = null;
        q stackOut_17_0 = null;
        q stackOut_14_0 = null;
        q stackOut_9_0 = null;
        q stackOut_2_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (255 < var2_int) {
                stackOut_6_0 = rd.field_d;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var3 = vi.a('.', param0, 0);
                if (var3.length >= 2) {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      stackOut_17_0 = uf.a(false, var3[var3.length - 1]);
                      stackIn_18_0 = stackOut_17_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = gj.a(0, var6);
                      if (var7 == null) {
                        var5++;
                        continue L1;
                      } else {
                        stackOut_14_0 = (q) var7;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0;
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = ai.field_a;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            } else {
              stackOut_2_0 = ai.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("mh.B(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + 46 + ')');
        }
        return stackIn_18_0;
    }

    final static void a(int param0, sg param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (q.field_b <= var2_int) {
                    int dupTemp$4 = param1.a(true);
                    ol.field_d[dupTemp$4] = ol.field_d[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (q.field_b <= var3) {
                        q.field_b = var2_int;
                        int fieldTemp$5 = q.field_b;
                        q.field_b = q.field_b + 1;
                        eg.field_a[fieldTemp$5] = param1;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (eg.field_a[var3].field_i != param1.field_i) {
                              break L5;
                            } else {
                              var4 = eg.field_a[var3].a(true);
                              if (ol.field_d[var4] > kh.field_d) {
                                ol.field_d[var4] = ol.field_d[var4] - 1;
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          eg.field_a[incrementValue$6] = eg.field_a[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (eg.field_a[var2_int].field_i == param1.field_i) {
                        int dupTemp$7 = eg.field_a[var2_int].a(true);
                        ol.field_d[dupTemp$7] = ol.field_d[dupTemp$7] + 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                ol.field_d[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("mh.C(").append(-27968).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    final static String b() {
        if (!(bi.field_L >= 2)) {
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
            ci stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            ci stackOut_13_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (null != qi.field_a.field_b) {
                    kk.field_b = new we(qi.field_a.field_b, 5200, 0);
                    qi.field_a.field_b = null;
                    var6 = (Object) (Object) new ak(255, kk.field_b, new we(qi.field_a.field_h, 12000, 0), 2097152);
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
                    var7 = (Object) (Object) new ak(param5, kk.field_b, oa.field_m[param5], 2097152);
                    break L2;
                  }
                }
                L5: {
                  var8 = we.field_j.a(param5, false, 24108, (ak) var6, (ak) var7);
                  if (param1) {
                    var8.a(true);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                stackOut_13_0 = new ci((ih) (Object) var8, true, param4);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_14_0;
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
        if (param0 != 0) {
            mh.a(1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[1024];
        field_e = new qj();
        field_d = "Please wait...";
        field_a = new qj();
    }
}
