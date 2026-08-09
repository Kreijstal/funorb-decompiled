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
        if (param0 >= -73) {
            field_e = (String) null;
        }
        field_b = null;
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param0 < -41) {
                break L1;
              } else {
                uo.a(false, 29, true, -7, 35, false);
                break L1;
              }
            }
            L2: {
              L3: {
                param1 = tg.a('_', param1, 3, "");
                var3 = sh.a((byte) -121, param1);
                if (0 != (param2.indexOf(param1) ^ -1)) {
                  break L3;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("uo.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0, int param1, int[] param2, Object[] param3, int param4) {
        int incrementValue$0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int var13 = 0;
        var13 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param0 == 256) {
                break L1;
              } else {
                uo.a(false, 117, false, -61, 4, ((boolean[]) (param3[1]))[6]);
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
                  if (-2147483648 != (var7 ^ -1)) {
                    stackIn_8_0 = 1;
                    break L3;
                  } else {
                    stackIn_8_0 = 0;
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
                    uo.a(param0 ^ 0, var6 + -1, param2, param3, param4);
                    uo.a(256, param1, param2, param3, 1 + var6);
                    break L2;
                  } else {
                    L5: {
                      if (((var9 & var10) + var7 ^ -1) < (param2[var10] ^ -1)) {
                        var11 = param2[var10];
                        param2[var10] = param2[var6];
                        param2[var6] = var11;
                        var12 = param3[var10];
                        param3[var10] = param3[var6];
                        incrementValue$0 = var6;
                        var6++;
                        param3[incrementValue$0] = var12;
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
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("uo.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ',' + param4 + ')');
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
            nh stackIn_12_0 = null;
            nh stackIn_17_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (null != kn.field_f.field_x) {
                    sa.field_x = new hd(kn.field_f.field_x, 5200, 0);
                    kn.field_f.field_x = null;
                    var6 = new ln(255, sa.field_x, new hd(kn.field_f.field_q, 12000, 0), 2097152);
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
                    var7 = new ln(param3, sa.field_x, cf.field_c[param3], 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8 = bl.field_r.a(param5, 4210752, param3, (ln) (var6), (ln) (var7));
                if (param4 == 27847) {
                  L5: {
                    if (param0) {
                      var8.d(param4 ^ 30326);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  stackIn_17_0 = new nh(var8, param2, param1);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_12_0 = (nh) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_12_0;
            } else {
              return stackIn_17_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_e = "Log in";
        field_g = new String[]{null, "Spend some of your initial Treasure building your dungeon, but save some for recruiting <%raiders> (about 50-100 Treasure should be sufficient). When you're finished, <col=FF0000>save your dungeon and exit this page by clicking on the 'Confirm' button at the top-left of the screen.</col>"};
        field_c = new int[256];
        field_d = "Your raider was detected by the monster.";
    }
}
