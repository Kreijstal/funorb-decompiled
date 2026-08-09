/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static int[] field_d;
    static float[] field_c;
    static String field_a;
    static String[] field_b;

    final static sh a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        sh stackIn_3_0 = null;
        sh stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = param0.length();
            if (param1 >= 34) {
              var3 = 0;
              L1: while (true) {
                if (var2_int <= var3) {
                  stackIn_13_0 = qj.field_F;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4 = param0.charAt(var3);
                  if (var4 >= 48) {
                    if (var4 <= 57) {
                      var3++;
                      continue L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = (sh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("qg.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_13_0;
        }
    }

    final static void a(hj param0, byte param1, int[] param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = HoldTheLine.field_D;
        try {
          L0: {
            gf.a();
            var3_int = 62 / ((69 - param1) / 47);
            gf.a(param2, 0, param2.length);
            gf.c();
            L1: while (true) {
              if (!gf.d()) {
                break L0;
              } else {
                var4 = gf.field_g;
                stackIn_4_0 = -1;
                stackIn_4_1 = var4 ^ -1;
                L2: {
                  if (stackIn_4_0 >= stackIn_4_1) {
                    break L2;
                  } else {
                    var4 = 0;
                    break L2;
                  }
                }
                L3: {
                  var5 = gf.field_b;
                  if (tc.field_j <= var5) {
                    var5 = -1 + tc.field_j;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var6 = gf.field_a;
                  if (var6 < 0) {
                    var6 = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var6 < tc.field_c) {
                    break L5;
                  } else {
                    var6 = -1 + tc.field_c;
                    break L5;
                  }
                }
                var7 = var4 % param0.field_s;
                var8 = var6 % param0.field_y;
                var9 = var4 - -(tc.field_j * var6);
                var10 = var7 - -(param0.field_s * var8);
                var11 = param0.field_s + -var7;
                var12 = -var4 + var5;
                L6: while (true) {
                  var12--;
                  if (0 > var12) {
                    continue L1;
                  } else {
                    incrementValue$0 = var9;
                    var9++;
                    incrementValue$1 = var10;
                    var10++;
                    tc.field_b[incrementValue$0] = param0.field_z[incrementValue$1];
                    var11--;
                    if (0 == var11) {
                      var10 = param0.field_s * var8;
                      var11 = param0.field_s;
                      continue L6;
                    } else {
                      continue L6;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("qg.E(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 >= 51) {
            return;
        }
        field_a = (String) null;
    }

    final static jk a(int param0, int param1, int param2, int param3, int param4, ah[] param5, int param6, int param7, int param8, int param9, byte param10) {
        int var11_int = 0;
        RuntimeException var11 = null;
        jk stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var11_int = -58 % ((-25 - param10) / 57);
            stackIn_1_0 = kn.a(0, param8, param9, param6, 1, param7, param2, param1, param5, param4, 0, param3, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var11 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var11);

            stackIn_4_1 = new StringBuilder().append("qg.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
        return stackIn_1_0;
    }

    final static boolean a(int param0, int param1, byte param2, gn param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = param3.a(param0, true, param1);
            var4 = var5;
            if (var5 != null) {
              ug.a((byte) -97, var5);
              if (param2 == -27) {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_d = (int[]) null;
                return true;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4_ref);

            stackIn_9_1 = new StringBuilder().append("qg.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    static {
        field_d = new int[1024];
        field_a = "If you do nothing the game will revert to normal view in <%0> second.";
        field_c = new float[]{0.6000000238418579f, 0.800000011920929f, 1.0f};
    }
}
