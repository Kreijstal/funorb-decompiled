/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends kg {
    static int field_lb;
    String field_mb;
    static int[][][] field_nb;
    String field_F;
    int field_ob;

    qk() {
        super(0L, (kg) null);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1) > -1) {
                var8_int = 127;
                break L1;
              } else {
                var8_int = ll.field_e[param0][param6][param3];
                break L1;
              }
            }
            L2: {
              var9 = param1 - param7;
              var10 = param2 - param5;
              if ((var10 ^ -1) > -1) {
                var10 = -var10;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var11 = 0;
              var12 = -43 % ((param4 - 57) / 60);
              if (var9 >= 0) {
                break L3;
              } else {
                var9 = -var9;
                break L3;
              }
            }
            L4: {
              if (-33 >= (var9 ^ -1)) {
                var9 = -var9 + 64;
                break L4;
              } else {
                break L4;
              }
            }
            if ((var9 ^ -1) >= -65) {
              if (16 >= var9) {
                if (-241 > (var10 * 64 ^ -1)) {
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var10 = var10 * 4 - -1;
                  var13 = var9 * var9 + var10 * var10;
                  var14 = 0;
                  L5: while (true) {
                    if ((var13 ^ -1) >= -1) {
                      var11 = -var14 + 9;
                      var11 = var11 * var8_int >> 1230128835;
                      stackIn_26_0 = var11;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var13 = var13 >> 1771887969;
                      var14++;
                      continue L5;
                    }
                  }
                }
              } else {
                stackIn_17_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_14_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var8), "qk.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0;
            } else {
              return stackIn_26_0;
            }
          }
        }
    }

    final static ka a(String param0, String param1, lj param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ka stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2.a(param0, param3 ^ -117);
              if (param3 == 0) {
                break L1;
              } else {
                qk.d((byte) -119);
                break L1;
              }
            }
            var5 = param2.a(var4_int, param1, (byte) 115);
            stackIn_3_0 = jj.a((byte) 62, param2, var4_int, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("qk.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static void d(byte param0) {
        L0: {
          if (null != da.field_c) {
            da.field_c.o(77);
            break L0;
          } else {
            break L0;
          }
        }
        m.field_j = new ib();
        if (param0 >= -43) {
          return;
        } else {
          bg.field_K.c(0, m.field_j);
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        ll.a(param1, true, param0);
    }

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_nb = (int[][][]) null;
    }

    static {
        field_nb = new int[][][]{new int[][]{new int[]{0, 0}, new int[]{0, 219}}, new int[][]{new int[]{59, 160}, new int[]{122, 72}}, new int[][]{new int[]{0, 219}, new int[]{159, 79}}, new int[][]{new int[]{37, 186}, new int[]{101, 67}}, new int[][]{new int[]{119, 79}, new int[]{0, 79}}};
    }
}
