/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static String field_d;
    static double[] field_c;
    static volatile int field_a;
    static jb field_b;

    final static nf[] a(int param0, nf[] param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        nf[] stackIn_42_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        nf[] stackOut_41_0 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        try {
          L0: {
            L1: {
              if (param1[2].field_u != 0) {
                break L1;
              } else {
                param1[2].field_s = param1[2].field_t;
                break L1;
              }
            }
            L2: {
              if (0 != param1[5].field_u) {
                break L2;
              } else {
                param1[5].field_s = param1[5].field_t;
                break L2;
              }
            }
            L3: {
              if (0 == param1[8].field_u) {
                param1[8].field_s = param1[8].field_t;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1[6].field_w == 0) {
                param1[6].field_v = param1[6].field_x;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param1[7].field_w != 0) {
                break L5;
              } else {
                param1[7].field_v = param1[7].field_x;
                break L5;
              }
            }
            L6: {
              if (0 == param1[8].field_w) {
                param1[8].field_v = param1[8].field_x;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var3 = param1[3].field_s + param1[3].field_u;
              var2_int = param1[0].field_u + param1[0].field_s;
              var4 = param1[6].field_u + param1[6].field_s;
              if (var3 < var2_int) {
                stackOut_17_0 = var2_int;
                stackIn_18_0 = stackOut_17_0;
                break L7;
              } else {
                stackOut_16_0 = var3;
                stackIn_18_0 = stackOut_16_0;
                break L7;
              }
            }
            L8: {
              var5 = stackIn_18_0;
              if (var5 > var4) {
                stackOut_20_0 = var5;
                stackIn_21_0 = stackOut_20_0;
                break L8;
              } else {
                stackOut_19_0 = var4;
                stackIn_21_0 = stackOut_19_0;
                break L8;
              }
            }
            L9: {
              var5 = stackIn_21_0;
              var2_int = param1[2].field_s;
              var3 = param1[5].field_s;
              var4 = param1[8].field_s;
              param1[6].field_t = var5;
              param1[3].field_t = var5;
              param1[0].field_t = var5;
              if (var2_int < var3) {
                stackOut_23_0 = var2_int;
                stackIn_24_0 = stackOut_23_0;
                break L9;
              } else {
                stackOut_22_0 = var3;
                stackIn_24_0 = stackOut_22_0;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_24_0;
              if (var5 < var4) {
                stackOut_26_0 = var5;
                stackIn_27_0 = stackOut_26_0;
                break L10;
              } else {
                stackOut_25_0 = var4;
                stackIn_27_0 = stackOut_25_0;
                break L10;
              }
            }
            L11: {
              var5 = stackIn_27_0;
              param1[2].field_t = param1[2].field_t - var5;
              param1[2].field_s = param1[2].field_s - var5;
              param1[5].field_t = param1[5].field_t - var5;
              param1[5].field_s = param1[5].field_s - var5;
              param1[8].field_t = param1[8].field_t - var5;
              var3 = param1[1].field_v - -param1[1].field_w;
              var4 = param1[2].field_w + param1[2].field_v;
              param1[8].field_s = param1[8].field_s - var5;
              var2_int = param1[0].field_v + param1[0].field_w;
              if (var3 >= var2_int) {
                stackOut_29_0 = var3;
                stackIn_30_0 = stackOut_29_0;
                break L11;
              } else {
                stackOut_28_0 = var2_int;
                stackIn_30_0 = stackOut_28_0;
                break L11;
              }
            }
            L12: {
              var5 = stackIn_30_0;
              if (var5 > var4) {
                stackOut_32_0 = var5;
                stackIn_33_0 = stackOut_32_0;
                break L12;
              } else {
                stackOut_31_0 = var4;
                stackIn_33_0 = stackOut_31_0;
                break L12;
              }
            }
            L13: {
              var5 = stackIn_33_0;
              var2_int = param1[6].field_v;
              var3 = param1[7].field_v;
              var4 = param1[8].field_v;
              param1[2].field_x = var5;
              param1[1].field_x = var5;
              param1[0].field_x = var5;
              if (param0 > 113) {
                break L13;
              } else {
                field_a = 85;
                break L13;
              }
            }
            L14: {
              if (var3 <= var2_int) {
                stackOut_37_0 = var3;
                stackIn_38_0 = stackOut_37_0;
                break L14;
              } else {
                stackOut_36_0 = var2_int;
                stackIn_38_0 = stackOut_36_0;
                break L14;
              }
            }
            L15: {
              var5 = stackIn_38_0;
              if (var5 >= var4) {
                stackOut_40_0 = var4;
                stackIn_41_0 = stackOut_40_0;
                break L15;
              } else {
                stackOut_39_0 = var5;
                stackIn_41_0 = stackOut_39_0;
                break L15;
              }
            }
            var5 = stackIn_41_0;
            param1[6].field_v = param1[6].field_v - var5;
            param1[6].field_x = param1[6].field_x - var5;
            param1[7].field_v = param1[7].field_v - var5;
            param1[7].field_x = param1[7].field_x - var5;
            param1[8].field_v = param1[8].field_v - var5;
            param1[8].field_x = param1[8].field_x - var5;
            stackOut_41_0 = (nf[]) param1;
            stackIn_42_0 = stackOut_41_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var2 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var2;
            stackOut_43_1 = new StringBuilder().append("va.C(").append(param0).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L16;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L16;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 41);
        }
        return stackIn_42_0;
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var3 = null;
                String discarded$2 = va.a(7, (byte[]) null);
                break L1;
              }
            }
            stackOut_2_0 = kh.a(param1, param1.length, 0, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("va.D(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        int var1 = -21 % ((-51 - param0) / 45);
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final static boolean b(int param0) {
        return hd.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Player names can be up to 12 letters, numbers and underscores";
        field_c = new double[]{0.0, 0.0, -1.0, 0.0, 0.0, -1.0, 0.0, 0.0, -1.0, 0.2300718937365538, 0.4675654614646093, -0.8534925090226996};
        field_a = 0;
    }
}
