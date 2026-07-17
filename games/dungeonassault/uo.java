/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uo {
    static String field_d;
    static String[] field_g;
    static int[] field_b;
    static int[] field_c;
    static gn[] field_f;
    static String field_e;
    static cn field_a;

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        field_d = null;
        field_a = null;
        field_e = null;
        field_g = null;
        field_b = null;
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
              if (param0 < -41) {
                break L1;
              } else {
                nh discarded$2 = uo.a(false, 29, true, -7, 35, false);
                break L1;
              }
            }
            L2: {
              L3: {
                param1 = tg.a('_', param1, 3, "");
                var3 = sh.a((byte) -121, param1);
                if (param2.indexOf(param1) != -1) {
                  break L3;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("uo.A(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0, int param1, int[] param2, Object[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int var13 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var13 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param0 == 256) {
                break L1;
              } else {
                nh discarded$2 = uo.a(false, 117, false, -61, 4, ((boolean[]) param3[1])[6]);
                break L1;
              }
            }
            L2: {
              if (param4 < param1) {
                L3: {
                  var5_int = (param1 + param4) / 2;
                  var6 = param4;
                  var7 = param2[var5_int];
                  param2[var5_int] = param2[param1];
                  param2[param1] = var7;
                  var8 = param3[var5_int];
                  param3[var5_int] = param3[param1];
                  param3[param1] = var8;
                  if (var7 != 2147483647) {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                var9 = stackIn_8_0;
                var10 = param4;
                L4: while (true) {
                  if (var10 >= param1) {
                    param2[param1] = param2[var6];
                    param2[var6] = var7;
                    param3[param1] = param3[var6];
                    param3[var6] = var8;
                    uo.a(param0, var6 + -1, param2, param3, param4);
                    uo.a(256, param1, param2, param3, 1 + var6);
                    break L2;
                  } else {
                    L5: {
                      if ((var9 & var10) + var7 > param2[var10]) {
                        var11 = param2[var10];
                        param2[var10] = param2[var6];
                        param2[var6] = var11;
                        var12 = param3[var10];
                        param3[var10] = param3[var6];
                        int incrementValue$3 = var6;
                        var6++;
                        param3[incrementValue$3] = var12;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var10++;
                    continue L4;
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("uo.D(").append(param0).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param4 + 41);
        }
    }

    private uo() throws Throwable {
        throw new Error();
    }

    final static nh a(boolean param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            ti var8 = null;
            Object stackIn_12_0 = null;
            nh stackIn_17_0 = null;
            Throwable decompiledCaughtException = null;
            nh stackOut_16_0 = null;
            Object stackOut_11_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (null != kn.field_f.field_x) {
                    sa.field_x = new hd(kn.field_f.field_x, 5200, 0);
                    kn.field_f.field_x = null;
                    var6 = (Object) (Object) new ln(255, sa.field_x, new hd(kn.field_f.field_q, 12000, 0), 2097152);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (sa.field_x != null) {
                    L3: {
                      if (null != cf.field_c) {
                        break L3;
                      } else {
                        cf.field_c = new hd[kn.field_f.field_v.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (null != cf.field_c[param3]) {
                        break L4;
                      } else {
                        cf.field_c[param3] = new hd(kn.field_f.field_v[param3], 12000, 0);
                        kn.field_f.field_v[param3] = null;
                        break L4;
                      }
                    }
                    var7 = (Object) (Object) new ln(param3, sa.field_x, cf.field_c[param3], 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8 = bl.field_r.a(param5, 4210752, param3, (ln) var6, (ln) var7);
                if (param4 == 27847) {
                  L5: {
                    if (param0) {
                      var8.d(param4 ^ 30326);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  stackOut_16_0 = new nh((qa) (Object) var8, param2, param1);
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  return (nh) (Object) stackIn_12_0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_17_0;
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
        field_e = "Log in";
        field_g = new String[]{null, "Spend some of your initial Treasure building your dungeon, but save some for recruiting <%raiders> (about 50-100 Treasure should be sufficient). When you're finished, <col=FF0000>save your dungeon and exit this page by clicking on the 'Confirm' button at the top-left of the screen.</col>"};
        field_c = new int[256];
        field_d = "Your raider was detected by the monster.";
    }
}
