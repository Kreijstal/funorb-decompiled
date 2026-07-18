/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class li extends hi {
    static int[] field_u;
    static nd field_x;
    private ig field_w;
    static int field_s;
    static int field_p;
    static String field_v;
    static bd field_t;
    static boolean field_o;
    static bd field_y;
    static boolean[] field_r;
    static int field_q;

    final static void a() {
        int var2 = 0;
        ch.field_a = 20000000L;
    }

    li(ig param0, ig param1) {
        super(param0);
        try {
            ((li) this).field_w = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "li.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final bm a(String param0, byte param1) {
        bg var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        bm stackIn_6_0 = null;
        bm stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        bm stackOut_5_0 = null;
        bm stackOut_9_0 = null;
        bm stackOut_8_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (((li) this).field_w instanceof sk) {
                var3 = ((sk) (Object) ((li) this).field_w).a((byte) 111);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.b(-71) != nd.field_d) {
                    stackOut_5_0 = bi.field_d;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = 32 % ((param1 - 3) / 42);
              if (param0.equals((Object) (Object) ((li) this).field_w.field_n)) {
                stackOut_9_0 = nd.field_d;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              } else {
                stackOut_8_0 = bi.field_d;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("li.L(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final static nc a(byte[] param0) {
        nc var2 = null;
        RuntimeException var2_ref = null;
        nc stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new nc(param0, th.field_Jb, nh.field_O, sf.field_X, hd.field_r, bf.field_d, ja.field_e);
              uj.d(-126);
              stackOut_5_0 = (nc) var2;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("li.E(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + 5116 + ')');
        }
        return stackIn_6_0;
    }

    public static void d(byte param0) {
        field_u = null;
        field_r = null;
        field_y = null;
        if (param0 > -34) {
            li.d((byte) 88);
        }
        field_t = null;
        field_v = null;
        field_x = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              si.g(param4, param2, param7, param0, param6);
              si.g(param7, param0, param5, param3, param6);
              si.g(param5, param3, param4, param2, param6);
              if (param0 < param2) {
                var8_int = param4;
                param4 = param7;
                param7 = var8_int;
                var8_int = param2;
                param2 = param0;
                param0 = var8_int;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 < param2) {
                var8_int = param4;
                param4 = param5;
                param5 = var8_int;
                var8_int = param2;
                param2 = param3;
                param3 = var8_int;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 <= param3) {
                break L3;
              } else {
                var8_int = param7;
                param7 = param5;
                param5 = var8_int;
                var8_int = param0;
                param0 = param3;
                param3 = var8_int;
                break L3;
              }
            }
            L4: {
              if (param5 <= param7) {
                var10 = param2;
                L5: while (true) {
                  if (var10 >= param0) {
                    var10 = param0;
                    L6: while (true) {
                      if (var10 >= param3) {
                        break L4;
                      } else {
                        var8_int = param4 - -((param5 + -param4) * (var10 + -param2) / (-param2 + param3));
                        var9 = (-param0 + var10) * (-param7 + param5) / (param3 + -param0) + param7;
                        si.a(var8_int, var10, 1 + (-var8_int + var9), param6);
                        var10++;
                        continue L6;
                      }
                    }
                  } else {
                    var8_int = param4 - -((param5 - param4) * (-param2 + var10) / (-param2 + param3));
                    var9 = param4 + (-param4 + param7) * (var10 + -param2) / (param0 + -param2);
                    si.a(var8_int, var10, 1 + -var8_int + var9, param6);
                    var10++;
                    continue L5;
                  }
                }
              } else {
                var10 = param2;
                L7: while (true) {
                  if (param0 <= var10) {
                    var10 = param0;
                    L8: while (true) {
                      if (param3 <= var10) {
                        break L4;
                      } else {
                        var9 = param4 + (-param4 + param5) * (-param2 + var10) / (-param2 + param3);
                        var8_int = param7 + (var10 + -param0) * (-param7 + param5) / (param3 + -param0);
                        si.a(var8_int, var10, -var8_int + (var9 - -1), param6);
                        var10++;
                        continue L8;
                      }
                    }
                  } else {
                    var9 = param4 + (var10 - param2) * (-param4 + param5) / (-param2 + param3);
                    var8_int = (-param4 + param7) * (-param2 + var10) / (-param2 + param0) + param4;
                    si.a(var8_int, var10, var9 - (var8_int + -1), param6);
                    var10++;
                    continue L7;
                  }
                }
              }
            }
            L9: {
              if (param1 == -1) {
                break L9;
              } else {
                field_v = null;
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var8, "li.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final String a(byte param0, String param1) {
        bg var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (!(((li) this).field_w instanceof sk)) {
                break L1;
              } else {
                var3 = ((sk) (Object) ((li) this).field_w).a((byte) 122);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.b(-112) != nd.field_d) {
                      break L2;
                    } else {
                      if (param1.equals((Object) (Object) ((li) this).field_w.field_n)) {
                        break L2;
                      } else {
                        stackOut_4_0 = qm.field_Q;
                        stackIn_5_0 = stackOut_4_0;
                        return stackIn_5_0;
                      }
                    }
                  }
                  stackOut_6_0 = var3.a(-60);
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
            var3_int = 83 / ((-24 - param0) / 35);
            if (!param1.equals((Object) (Object) ((li) this).field_w.field_n)) {
              stackOut_10_0 = qm.field_Q;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("li.K(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = -1;
        field_u = new int[]{0, 0, 64, 192, 128};
        field_x = new nd(4, 1, 1, 1);
        field_v = "Orb coins: ";
        field_p = 0;
        field_r = new boolean[2];
    }
}
