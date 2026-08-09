/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static String field_d;
    static double[] field_c;
    static volatile int field_a;
    static jb field_b;

    final static nf[] a(int param0, nf[] param1) {
        nf dupTemp$0 = null;
        nf dupTemp$1 = null;
        nf dupTemp$2 = null;
        nf dupTemp$3 = null;
        nf dupTemp$4 = null;
        nf dupTemp$5 = null;
        nf dupTemp$6 = null;
        nf dupTemp$7 = null;
        nf dupTemp$8 = null;
        nf dupTemp$9 = null;
        nf dupTemp$10 = null;
        nf dupTemp$11 = null;
        nf dupTemp$12 = null;
        nf dupTemp$13 = null;
        nf dupTemp$14 = null;
        nf dupTemp$15 = null;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        nf[] stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
                stackIn_18_0 = var2_int;
                break L7;
              } else {
                stackIn_18_0 = var3;
                break L7;
              }
            }
            L8: {
              var5 = stackIn_18_0;
              if (var5 > var4) {
                stackIn_21_0 = var5;
                break L8;
              } else {
                stackIn_21_0 = var4;
                break L8;
              }
            }
            L9: {
              var5 = stackIn_21_0;
              var2_int = param1[2].field_s;
              var3 = param1[5].field_s;
              var4 = param1[8].field_s;
              dupTemp$0 = param1[6];
              dupTemp$0.field_t = var5;
              dupTemp$1 = param1[3];
              dupTemp$1.field_t = var5;
              param1[0].field_t = var5;
              if (var2_int < var3) {
                stackIn_24_0 = var2_int;
                break L9;
              } else {
                stackIn_24_0 = var3;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_24_0;
              if (var5 < var4) {
                stackIn_27_0 = var5;
                break L10;
              } else {
                stackIn_27_0 = var4;
                break L10;
              }
            }
            L11: {
              var5 = stackIn_27_0;
              dupTemp$2 = param1[2];
              dupTemp$2.field_t = dupTemp$2.field_t - var5;
              dupTemp$3 = param1[2];
              dupTemp$3.field_s = dupTemp$3.field_s - var5;
              dupTemp$4 = param1[5];
              dupTemp$4.field_t = dupTemp$4.field_t - var5;
              dupTemp$5 = param1[5];
              dupTemp$5.field_s = dupTemp$5.field_s - var5;
              dupTemp$6 = param1[8];
              dupTemp$6.field_t = dupTemp$6.field_t - var5;
              var3 = param1[1].field_v - -param1[1].field_w;
              var4 = param1[2].field_w + param1[2].field_v;
              dupTemp$7 = param1[8];
              dupTemp$7.field_s = dupTemp$7.field_s - var5;
              var2_int = param1[0].field_v + param1[0].field_w;
              if (var3 >= var2_int) {
                stackIn_30_0 = var3;
                break L11;
              } else {
                stackIn_30_0 = var2_int;
                break L11;
              }
            }
            L12: {
              var5 = stackIn_30_0;
              if (var5 > var4) {
                stackIn_33_0 = var5;
                break L12;
              } else {
                stackIn_33_0 = var4;
                break L12;
              }
            }
            L13: {
              var5 = stackIn_33_0;
              var2_int = param1[6].field_v;
              var3 = param1[7].field_v;
              var4 = param1[8].field_v;
              dupTemp$8 = param1[2];
              dupTemp$8.field_x = var5;
              dupTemp$9 = param1[1];
              dupTemp$9.field_x = var5;
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
                stackIn_38_0 = var3;
                break L14;
              } else {
                stackIn_38_0 = var2_int;
                break L14;
              }
            }
            L15: {
              var5 = stackIn_38_0;
              if (var5 >= var4) {
                stackIn_41_0 = var4;
                break L15;
              } else {
                stackIn_41_0 = var5;
                break L15;
              }
            }
            var5 = stackIn_41_0;
            dupTemp$10 = param1[6];
            dupTemp$10.field_v = dupTemp$10.field_v - var5;
            dupTemp$11 = param1[6];
            dupTemp$11.field_x = dupTemp$11.field_x - var5;
            dupTemp$12 = param1[7];
            dupTemp$12.field_v = dupTemp$12.field_v - var5;
            dupTemp$13 = param1[7];
            dupTemp$13.field_x = dupTemp$13.field_x - var5;
            dupTemp$14 = param1[8];
            dupTemp$14.field_v = dupTemp$14.field_v - var5;
            dupTemp$15 = param1[8];
            dupTemp$15.field_x = dupTemp$15.field_x - var5;
            stackIn_42_0 = (nf[]) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var2 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var2);

            stackIn_45_1 = new StringBuilder().append("va.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L16;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L16;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ')');
        }
        return stackIn_42_0;
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        byte[] var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var3 = (byte[]) null;
                va.a(7, (byte[]) null);
                break L1;
              }
            }
            stackIn_3_0 = kh.a(param1, param1.length, 0, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("va.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
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
        if (param0 != 8) {
            field_a = 74;
        }
        return hd.field_d;
    }

    static {
        field_d = "Player names can be up to 12 letters, numbers and underscores";
        field_c = new double[]{0.0, 0.0, -1.0, 0.0, 0.0, -1.0, 0.0, 0.0, -1.0, 0.2300718937365538, 0.4675654614646093, -0.8534925090226996};
        field_a = 0;
    }
}
