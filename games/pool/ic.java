/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static he field_c;
    static int field_a;
    static String field_b;

    final static void a(byte param0, int param1) {
        hj.field_g = 400 * param1 / 150;
        hj.field_f = (param1 << 16) / 150;
        hj.field_l = param1 * 100 / 150;
        int var2 = 59 / ((-23 - param0) / 46);
    }

    public static void a(int param0) {
        if (param0 != -512) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    final static byte a(int[] param0, int param1, int[] param2, int[] param3, int[] param4, int param5) {
        int stackIn_3_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        try {
          var6_int = param2[1 + param1] - param2[param1];
          var7 = -param0[param1] + param0[param1 + 1];
          var8 = -param4[param1] + param4[1 + param1];
          if (param3 == null) {
            stackIn_3_0 = 0;
          } else {
            stackIn_3_0 = -param3[param1] + param3[1 + param1];
          }
          var9 = stackIn_3_0;
          var10 = 0;
          var17 = 0;
          var11 = -fb.field_q + qh.field_j;
          var13 = -512;
          var18 = 256;
          var15 = var11;
          var16 = -(512 * var6_int) + var11 * var8;
          if (var16 != 0) {
            var19 = (512 * param2[param1] - var11 * param4[param1] << 8) / var16;
            if (var19 > var17 &&
              var18 > var19) {
              var20 = ((param4[param1] << 8) + var8 * var19) / 512;
              if (var20 > 0) {
                if (0 >= var6_int * var13 + var8 * var15) {
                  var18 = var19;
                  var10 = (byte)(var10 | 16);
                } else {
                  var17 = var19;
                  var10 = (byte)(var10 | 1);
                }
              }
            }
          }
          var13Lifetime1 = 512;
          var11Lifetime1 = qh.field_b - fb.field_q;
          var15Lifetime1 = -var11Lifetime1;
          var16Lifetime1 = var11Lifetime1 * var8 - var6_int * 512;
          var14 = -512;
          if (var16Lifetime1 != 0) {
            var19Lifetime1 = (512 * param2[param1] - param4[param1] * var11Lifetime1 << 8) / var16Lifetime1;
            if (var19Lifetime1 > var17 &&
              var18 > var19Lifetime1) {
              var20Lifetime1 = ((param4[param1] << 8) + var8 * var19Lifetime1) / 512;
              if (var20Lifetime1 > 0) {
                if (var15Lifetime1 * var8 + var13Lifetime1 * var6_int <= 0) {
                  var18 = var19Lifetime1;
                  var10 = (byte)(var10 | 32);
                } else {
                  var10 = (byte)(var10 | 2);
                  var17 = var19Lifetime1;
                }
              }
            }
          }
          if (param5 != 4) {
            field_a = -4;
          }
          var12 = -fb.field_d + qh.field_g;
          var15Lifetime2 = var12;
          var16Lifetime2 = var12 * var8 - var7 * 512;
          if (0 != var16Lifetime2) {
            var19Lifetime2 = (-(var12 * param4[param1]) + 512 * param0[param1] << 8) / var16Lifetime2;
            if (var17 < var19Lifetime2 &&
              var19Lifetime2 < var18) {
              var20Lifetime2 = (var8 * var19Lifetime2 + (param4[param1] << 8)) / 512;
              if (0 < var20Lifetime2) {
                if (var8 * var15Lifetime2 + var14 * var7 > 0) {
                  var17 = var19Lifetime2;
                  var10 = (byte)(var10 | 4);
                } else {
                  var18 = var19Lifetime2;
                  var10 = (byte)(var10 | 64);
                }
              }
            }
          }
          var14Lifetime1 = 512;
          var12Lifetime1 = qh.field_c - fb.field_d;
          var15Lifetime3 = -var12Lifetime1;
          var16Lifetime3 = -(512 * var7) + var12Lifetime1 * var8;
          if (var16Lifetime3 != 0) {
            var19Lifetime3 = (512 * param0[param1] - var12Lifetime1 * param4[param1] << 8) / var16Lifetime3;
            if (var17 < var19Lifetime3 &&
              var19Lifetime3 < var18) {
              var20Lifetime3 = ((param4[param1] << 8) + var19Lifetime3 * var8) / 512;
              if (var20Lifetime3 > 0) {
                if (var15Lifetime3 * var8 + var14Lifetime1 * var7 > 0) {
                  var17 = var19Lifetime3;
                  var10 = (byte)(var10 | 8);
                } else {
                  var18 = var19Lifetime3;
                  var10 = (byte)(var10 | 128);
                }
              }
            }
          }
          if (var17 != 0) {
            param2[param1] = param2[param1] + (var6_int * var17 >> 8);
            param0[param1] = param0[param1] + (var7 * var17 >> 8);
            param4[param1] = param4[param1] + (var17 * var8 >> 8);
            if (param3 != null) {
              param3[param1] = param3[param1] + (var17 * var9 >> 8);
            }
          }
          if (256 != var18) {
            param2[param1 + 1] = param2[param1 + 1] - (var6_int * (256 - var18) >> 8);
            param0[param1 + 1] = param0[param1 + 1] - (var7 * (-var18 + 256) >> 8);
            param4[1 + param1] = param4[1 + param1] - ((-var18 + 256) * var8 >> 8);
            if (param3 != null) {
              param3[1 + param1] = param3[1 + param1] - (var9 * (-var18 + 256) >> 8);
            }
          }
          stackIn_49_0 = var10;
          return (byte) stackIn_49_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_52_0 = var6;
          stackIn_52_1 = new StringBuilder().append("ic.D(");
          if (param0 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          stackIn_55_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          stackIn_58_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',');
          if (param3 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          stackIn_61_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',');
          if (param4 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',').append(param5).append(')').toString());
        }
    }

    final static dd a(int param0, boolean param1, int param2, String param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        dd var7 = null;
        int var10 = 0;
        int var11 = 0;
        dd var12 = null;
        int[] var19 = null;
        int[] var20 = null;
        dd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = mc.field_e.b(param3, param2);
          var6 = var5_int * mc.field_e.field_G + mc.field_e.field_w;
          if (!param1) {
            ic.a(-50);
          }
          var7 = new dd(param2 + 4, 4 + var6);
          var7.field_B = -2;
          var7.field_G = -2;
          var19 = new int[4];
          var20 = qh.field_d;
          var10 = qh.field_l;
          var11 = qh.field_f;
          qh.a(var19);
          var7.e();
          mc.field_e.a(param3, 2, 2, param2, var6, param4, -1, param0, 0, mc.field_e.field_G * 3 / 4);
          var7.e(4144959);
          var7.e(65793);
          qh.a(var20, var10, var11);
          qh.b(var19);
          var7.b();
          var7.field_y = var7.field_A;
          var7.field_w = var7.field_z;
          var7.field_B = 0;
          var12 = var7;
          var12.field_G = 0;
          stackIn_3_0 = var7;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ic.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_c = new he();
        field_b = "Who can join";
    }
}
