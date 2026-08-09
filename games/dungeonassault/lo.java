/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lo {
    static byte[][][] field_c;
    int field_a;
    int field_h;
    int field_e;
    int field_b;
    int field_d;
    int field_g;
    static long field_f;

    final static sm[] a(wj param0, byte param1) {
        Object stackIn_3_0 = null;
        sm[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        sm[] var4 = null;
        int var5 = 0;
        sm var6 = null;
        int var6_int = 0;
        int var7 = 0;
        vh var8 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            var2_int = param0.j(76, 8);
            if (var2_int <= 0) {
              L1: {
                var3 = param0.j(-80, 12);
                var4 = new sm[var3];
                if (param1 < -109) {
                  break L1;
                } else {
                  var8 = (vh) null;
                  lo.a(-66, true, (vh) null, -109, 2);
                  break L1;
                }
              }
              var5 = 0;
              L2: while (true) {
                if (var3 <= var5) {
                  stackIn_14_0 = (sm[]) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (jl.a(param0, -125)) {
                      var6 = new sm();
                      param0.j(74, 24);
                      param0.j(110, 24);
                      var6.field_d = param0.j(-66, 24);
                      param0.j(-79, 9);
                      param0.j(-75, 12);
                      param0.j(83, 12);
                      param0.j(-66, 12);
                      var4[var5] = var6;
                      break L3;
                    } else {
                      var6_int = param0.j(-117, hh.a(1, -1 + var5));
                      var4[var5] = var4[var6_int];
                      break L3;
                    }
                  }
                  var5++;
                  continue L2;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("lo.O(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (sm[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_14_0;
        }
    }

    abstract void a(int param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var16 = DungeonAssault.field_K;
        try {
          L0: {
            L1: while (true) {
              param0--;
              if (0 > param0) {
                if (param4 == 0) {
                  break L0;
                } else {
                  var17 = (int[]) null;
                  lo.a(-38, 98, 90, 94, -49, -128, (int[]) null, -44, -86, 68);
                  return;
                }
              } else {
                var18 = param6;
                var10 = var18;
                var11 = param1;
                var12 = param5;
                var13 = param3;
                var14 = param8;
                var15 = (var18[var11] & 16711422) >> -869667743;
                var10[var11] = var15 - (-nb.a(65280, var13 >> -357417303) + (-nb.a(16711680, var12 >> -1551496671) + -nb.a(var14 >> -1236356847, 255)));
                param1++;
                param8 = param8 + param2;
                param5 = param5 + param7;
                param3 = param3 + param9;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var10_ref);

            stackIn_8_1 = new StringBuilder().append("lo.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = -65 % ((param0 - -64) / 43);
        field_c = (byte[][][]) null;
    }

    final static void a(int param0, boolean param1, vh param2, int param3, int param4) {
        RuntimeException var5 = null;
        wj var6 = null;
        tc stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        int stackIn_2_3;
        vh stackIn_2_4;
        int stackIn_2_5;
        tc stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        vh stackIn_3_4 = null;
        int stackIn_3_5 = 0;
        int stackIn_3_6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = ek.field_b;

              stackIn_2_1 = 22199;

              stackIn_2_2 = 1000000;

              stackIn_2_3 = param3;

              stackIn_2_4 = (vh) (param2);

              stackIn_2_5 = param4;

              if (param1) {
                stackIn_3_0 = (tc) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = stackIn_2_3;
                stackIn_3_4 = (vh) ((Object) stackIn_2_4);
                stackIn_3_5 = stackIn_2_5;
                stackIn_3_6 = 0;
                break L1;
              } else {
                stackIn_3_0 = (tc) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = stackIn_2_3;
                stackIn_3_4 = (vh) ((Object) stackIn_2_4);
                stackIn_3_5 = stackIn_2_5;
                stackIn_3_6 = 1;
                break L1;
              }
            }
            ((tc) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_3_5, stackIn_3_6 != 0);
            if (param0 >= 65) {
              break L0;
            } else {
              var6 = (wj) null;
              lo.a((wj) null, (byte) 71);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("lo.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
    }
}
