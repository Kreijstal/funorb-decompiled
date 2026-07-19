/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static String field_a;
    static volatile int field_b;

    final static int a(int param0, int param1, int param2) {
        ef discarded$2 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        var4 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param1 >= 113) {
                break L1;
              } else {
                var5 = (byte[]) null;
                discarded$2 = kk.a((wb[]) null, (byte[]) null, -29, 88, 105);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (-1 <= (param2 ^ -1)) {
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3_int = var3_int << 887824321 | param0 & 1;
                param2--;
                param0 = param0 >>> 1;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "kk.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final static ef a(wb[] param0, byte[] param1, int param2, int param3, int param4) {
        byte[] array$4 = null;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        RuntimeException var5 = null;
        int[] var5_array = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        byte[][] var10 = null;
        int var11_int = 0;
        ef var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        byte[] var22 = null;
        int var23 = 0;
        byte[] var24 = null;
        int var25 = 0;
        byte[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        byte[][] var38 = null;
        ef stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        ef stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var28 = Main.field_T;
        try {
          L0: {
            if (param3 == param0.length) {
              var36 = new int[256];
              var31 = var36;
              var5_array = var31;
              var37 = new int[256];
              var32 = var37;
              var6 = var32;
              var35 = new int[256];
              var30 = var35;
              var7 = var30;
              var34 = new int[256];
              var29 = var34;
              var8 = var29;
              var9 = new int[]{0, param4, param2};
              var38 = new byte[256][];
              var33 = var38;
              var10 = var33;
              var11_int = 0;
              L1: while (true) {
                if ((var11_int ^ -1) <= -257) {
                  var11 = new ef(param1, var36, var37, var35, var34, var9, var38);
                  var11.field_s = var11.field_s - 1;
                  var11.field_x = var11.field_x - 1;
                  var11.field_q = var11.field_q - 1;
                  stackOut_23_0 = (ef) (var11);
                  stackIn_24_0 = stackOut_23_0;
                  break L0;
                } else {
                  var5_array[var11_int] = -1 + param0[var11_int].field_h;
                  var6[var11_int] = param0[var11_int].field_c + -1;
                  var7[var11_int] = param0[var11_int].field_g - -2;
                  var8[var11_int] = param0[var11_int].field_b - -2;
                  array$4 = new byte[var34[var11_int] * var35[var11_int]];
                  var10[var11_int] = array$4;
                  var12 = array$4;
                  var13 = param0[var11_int].field_i;
                  var14 = param0[var11_int].field_g;
                  var15 = param0[var11_int].field_b;
                  var16 = var35[var11_int];
                  var17 = -var14 + var16;
                  var18 = 0;
                  var19 = var35[var11_int] - -1;
                  var20 = 0;
                  L2: while (true) {
                    if (var20 >= var15) {
                      var19 = 1 + var35[var11_int];
                      var18 = 0;
                      var20 = 0;
                      L3: while (true) {
                        if (var15 <= var20) {
                          var11_int++;
                          continue L1;
                        } else {
                          var21 = 0;
                          L4: while (true) {
                            if (var21 >= var14) {
                              var19 = var19 + var17;
                              var20++;
                              continue L3;
                            } else {
                              L5: {
                                incrementValue$5 = var18;
                                var18++;
                                if (-1 == (var13[incrementValue$5] ^ -1)) {
                                  var19++;
                                  break L5;
                                } else {
                                  incrementValue$6 = var19;
                                  var19++;
                                  var12[incrementValue$6] = (byte) 1;
                                  break L5;
                                }
                              }
                              var21++;
                              continue L4;
                            }
                          }
                        }
                      }
                    } else {
                      var21 = 0;
                      L6: while (true) {
                        if (var14 <= var21) {
                          var19 = var19 + var17;
                          var20++;
                          continue L2;
                        } else {
                          incrementValue$7 = var18;
                          var18++;
                          if (0 != var13[incrementValue$7]) {
                            var22 = var12;
                            var23 = -var16 + var19;
                            var24 = var12;
                            var25 = var19 - 1;
                            var26 = var12;
                            var12[var16 + var19] = (byte)2;
                            var27 = 1 + var19;
                            var26[var27] = (byte) 2;
                            var24[var25] = (byte) 2;
                            var22[var23] = (byte) 2;
                            var19++;
                            var21++;
                            continue L6;
                          } else {
                            var19++;
                            var21++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var5);
            stackOut_25_1 = new StringBuilder().append("kk.B(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          L8: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_24_0;
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, qk param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        mg var5 = null;
        int[] var6 = null;
        int var7 = 0;
        w var8 = null;
        int var9 = 0;
        w var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = Main.field_T;
        try {
          L0: {
            var8 = new w(param1.a((byte) 7, "", "logo.fo3d"));
            var10 = var8;
            var3 = var10.f(param0 ^ -16903);
            var10.f(true);
            ga.field_b = hk.a(param0 + 17076, var10);
            il.field_a = new mg[var3];
            sk.field_b = new int[var3][];
            var4 = 0;
            if (param0 == -16998) {
              L1: while (true) {
                if (var3 <= var4) {
                  var10.g(8);
                  var9 = 0;
                  var4 = var9;
                  L2: while (true) {
                    if (var9 >= var3) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var5 = il.field_a[var9];
                      var5.a(6, 6, param0 + 10328, 1, 6);
                      var5.a((byte) 124);
                      var6 = new int[]{var5.field_f + var5.field_e >> 837186561, var5.field_u + var5.field_s >> 1164429537, var5.field_i + var5.field_z >> -808614751};
                      sk.field_b[var9] = var6;
                      var5.a(false, -var6[0], -var6[1], -var6[2]);
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  il.field_a[var4] = nb.a((byte) 119, var8);
                  var4++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("kk.D(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_a = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_b = 0;
    }
}
