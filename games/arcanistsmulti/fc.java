/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static ri field_c;
    static aj field_b;
    static String field_d;
    static qb[] field_e;
    static boolean field_a;

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, byte param6, byte[] param7, int param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var10_int = -(param8 >> 2);
            param8 = -(3 & param8);
            var11 = -param9;
            L1: while (true) {
              if (var11 >= 0) {
                break L0;
              } else {
                var12 = var10_int;
                L2: while (true) {
                  if (var12 >= 0) {
                    var12 = param8;
                    L3: while (true) {
                      if (var12 >= 0) {
                        param0 = param0 + param2;
                        param4 = param4 + param5;
                        var11++;
                        continue L1;
                      } else {
                        L4: {
                          int incrementValue$10 = param4;
                          param4++;
                          if (param1[incrementValue$10] == 0) {
                            param0++;
                            break L4;
                          } else {
                            int incrementValue$11 = param0;
                            param0++;
                            param7[incrementValue$11] = (byte) 0;
                            break L4;
                          }
                        }
                        var12++;
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      int incrementValue$12 = param4;
                      param4++;
                      if (param1[incrementValue$12] != 0) {
                        int incrementValue$13 = param0;
                        param0++;
                        param7[incrementValue$13] = (byte) 0;
                        break L5;
                      } else {
                        param0++;
                        break L5;
                      }
                    }
                    L6: {
                      int incrementValue$14 = param4;
                      param4++;
                      if (0 != param1[incrementValue$14]) {
                        int incrementValue$15 = param0;
                        param0++;
                        param7[incrementValue$15] = (byte) 0;
                        break L6;
                      } else {
                        param0++;
                        break L6;
                      }
                    }
                    L7: {
                      int incrementValue$16 = param4;
                      param4++;
                      if (param1[incrementValue$16] == 0) {
                        param0++;
                        break L7;
                      } else {
                        int incrementValue$17 = param0;
                        param0++;
                        param7[incrementValue$17] = (byte) 0;
                        break L7;
                      }
                    }
                    L8: {
                      int incrementValue$18 = param4;
                      param4++;
                      if (param1[incrementValue$18] == 0) {
                        param0++;
                        break L8;
                      } else {
                        int incrementValue$19 = param0;
                        param0++;
                        param7[incrementValue$19] = (byte) 0;
                        break L8;
                      }
                    }
                    var12++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var10 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var10;
            stackOut_28_1 = new StringBuilder().append("fc.D(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          L10: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param2).append(',').append(6725).append(',').append(param4).append(',').append(param5).append(',').append(0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param7 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static void a(byte param0, kc param1) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        kc var4 = (kc) (Object) param1.field_G.b(12623);
        if (param0 >= -60) {
            return;
        }
        try {
            while (var4 != null) {
                var4.field_db = 0;
                var4.field_I = 0;
                var4.field_bb = 0;
                var4.field_B = 0;
                var4 = (kc) (Object) param1.field_G.a(0);
            }
            param1.field_I = 0;
            param1.field_bb = 0;
            param1.field_db = 0;
            param1.field_B = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "fc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_b = null;
        field_d = null;
        field_c = null;
        field_e = null;
    }

    final static boolean a(int param0, eg param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        byte[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var6 = param1.b(param3, 26219, param2);
            var4 = var6;
            if (var6 == null) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var5 = -27 % ((param0 - -66) / 51);
              int discarded$2 = 1;
              e.a(var6);
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref;
            stackOut_6_1 = new StringBuilder().append("fc.C(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ri();
        field_d = "Lost";
        field_b = new aj(12, 0, 1, 0);
        field_a = true;
    }
}
