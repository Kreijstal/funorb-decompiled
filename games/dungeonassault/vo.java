/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vo extends ip {
    static String field_m;
    static String field_q;
    private rm field_n;
    static String field_o;
    static int field_r;
    private rm field_p;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0 >= 44) {
              je.a((byte) -96, param1, param2, bf.field_d, param4, param3);
              var5_int = param4 + gf.field_i * param2;
              var6 = -param3 + gf.field_i;
              var7 = -param1;
              L1: while (true) {
                if (var7 >= 0) {
                  qe.b(param4, param2, param3, param1, 2105376, 192, 80);
                  var7 = 0;
                  L2: while (true) {
                    if (var7 >= 4) {
                      break L0;
                    } else {
                      qe.a(param4 + var7, param2 + var7, param3 - var7 * 2, param1 + -(2 * var7), 16777215, -(var7 * 16) + 64, 80 - var7 * 20);
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  var8 = -param3;
                  L3: while (true) {
                    if (var8 >= 0) {
                      var5_int = var5_int + var6;
                      var7++;
                      continue L1;
                    } else {
                      gf.field_b[var5_int] = mp.a(gf.field_b[var5_int], -2147483648);
                      var5_int++;
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var5, "vo.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        String stackOut_17_0 = null;
        String stackOut_24_0 = null;
        String stackOut_32_0 = null;
        String stackOut_30_0 = null;
        String stackOut_27_0 = null;
        String stackOut_20_0 = null;
        String stackOut_9_0 = null;
        String stackOut_6_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 44) {
                break L1;
              } else {
                ((vo) this).field_n = null;
                break L1;
              }
            }
            var6 = ((vo) this).field_n.field_w.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (!sm.a(1, var5)) {
                if (!dj.a(6623, var5)) {
                  if (j.a(var5, (byte) -124)) {
                    stackOut_13_0 = di.field_k;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    if (this.a(param1, (byte) -106)) {
                      stackOut_17_0 = tp.field_x;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    } else {
                      if (var6.length() > 0) {
                        if (gk.a(var6, var5, 16777215)) {
                          stackOut_24_0 = qd.field_b;
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        } else {
                          if (!gl.a(var6, 0, var5)) {
                            if (!uo.a((byte) -69, var6, var5)) {
                              stackOut_32_0 = fm.field_j;
                              stackIn_33_0 = stackOut_32_0;
                              break L0;
                            } else {
                              stackOut_30_0 = qd.field_b;
                              stackIn_31_0 = stackOut_30_0;
                              return stackIn_31_0;
                            }
                          } else {
                            stackOut_27_0 = mf.field_a;
                            stackIn_28_0 = stackOut_27_0;
                            return stackIn_28_0;
                          }
                        }
                      } else {
                        stackOut_20_0 = dl.field_a;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = ad.field_c;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_6_0 = fm.field_j;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("vo.D(").append(param0).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L2;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ')');
        }
        return stackIn_33_0;
    }

    vo(rm param0, rm param1, rm param2) {
        super(param0);
        try {
            ((vo) this).field_p = param2;
            ((vo) this).field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "vo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final od a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        od stackIn_3_0 = null;
        od stackIn_7_0 = null;
        od stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        od stackOut_2_0 = null;
        od stackOut_6_0 = null;
        od stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            var3_int = 113 % ((param1 - 5) / 44);
            var4 = ((vo) this).field_n.field_w.toLowerCase();
            var5 = param0.toLowerCase();
            if (var5.length() == 0) {
              stackOut_2_0 = pd.field_J;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (!wm.a(var4, var5, (byte) -83)) {
                stackOut_6_0 = pd.field_J;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (this.a(param0, (byte) -117)) {
                  stackOut_10_0 = pd.field_J;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  return c.field_d;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("vo.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    public static void e(int param0) {
        field_q = null;
        field_m = null;
        field_o = null;
        if (param0 != 1) {
            vo.e(-81);
        }
    }

    private final boolean a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -95) {
                break L1;
              } else {
                field_r = -102;
                break L1;
              }
            }
            L2: {
              var3 = ((vo) this).field_p.field_w.toLowerCase();
              var4 = param0.toLowerCase();
              if (var3.length() <= 0) {
                break L2;
              } else {
                if (var4.length() >= -1) {
                  break L2;
                } else {
                  var5 = var3.lastIndexOf("@");
                  if (-1 > var5) {
                    break L2;
                  } else {
                    if (var5 >= var3.length() + -1) {
                      break L2;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 + 1);
                      if (var4.indexOf(var6) >= 0) {
                        stackOut_8_0 = 1;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0 != 0;
                      } else {
                        if (0 <= var4.indexOf(var7)) {
                          stackOut_12_0 = 1;
                          stackIn_13_0 = stackOut_12_0;
                          return stackIn_13_0 != 0;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_14_0 = 0;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("vo.E(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_15_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_m = "<col=178B8B>Use skill - <%0></col>";
        field_o = "<col=8B1717>Disarm</col>";
    }
}
