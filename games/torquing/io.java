/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io extends ig {
    static int[] field_s;

    final static void b(byte param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            if (param0 == 78) {
              var5 = a.field_f;
              var1 = var5;
              var2 = 0;
              var3 = var5.length;
              L1: while (true) {
                if (var2 >= var3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  incrementValue$40 = var2;
                  var2++;
                  var5[incrementValue$40] = 0;
                  incrementValue$41 = var2;
                  var2++;
                  var5[incrementValue$41] = 0;
                  incrementValue$42 = var2;
                  var2++;
                  var5[incrementValue$42] = 0;
                  incrementValue$43 = var2;
                  var2++;
                  var5[incrementValue$43] = 0;
                  incrementValue$44 = var2;
                  var2++;
                  var5[incrementValue$44] = 0;
                  incrementValue$45 = var2;
                  var2++;
                  var5[incrementValue$45] = 0;
                  incrementValue$46 = var2;
                  var2++;
                  var5[incrementValue$46] = 0;
                  incrementValue$47 = var2;
                  var2++;
                  var5[incrementValue$47] = 0;
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
          var1_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1_ref), "io.P(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String c(byte param0, gm param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 65) {
              stackOut_3_0 = ff.a(param1.field_m.length(), '*', true);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("io.R(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        field_s = null;
        if (param0 != -113) {
            io.b((byte) 20);
        }
    }

    private io(uc param0, int param1) {
        super(param0, param1);
    }

    io(int param0) {
        this(dg.field_e, param0);
    }

    final static vn a(sm[] param0, int param1, byte[] param2) {
        byte[] array$4 = null;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        RuntimeException var3 = null;
        int[] var3_array = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        byte[][] var7 = null;
        int var8_int = 0;
        vn var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        byte[] var19 = null;
        int var20 = 0;
        byte[] var21 = null;
        int var22 = 0;
        byte[] var23 = null;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        byte[][] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        byte[][] var35 = null;
        vn stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        vn stackOut_27_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var25 = Torquing.field_u;
        try {
          L0: {
            if (param0.length != 256) {
              throw new IllegalArgumentException();
            } else {
              L1: {
                var33 = new int[256];
                var28 = var33;
                var3_array = var28;
                var34 = new int[256];
                var29 = var34;
                var4 = var29;
                var31 = new int[256];
                var26 = var31;
                var5 = var26;
                if (param1 == -1) {
                  break L1;
                } else {
                  field_s = (int[]) null;
                  break L1;
                }
              }
              var32 = new int[256];
              var27 = var32;
              var6 = var27;
              var35 = new byte[256][];
              var30 = var35;
              var7 = var30;
              var8_int = 0;
              L2: while (true) {
                if (var8_int >= 256) {
                  var8 = new vn(param2, var33, var34, var31, var32, var35);
                  var8.field_x = var8.field_x - 1;
                  var8.field_s = var8.field_s - 1;
                  var8.field_t = var8.field_t - 1;
                  stackOut_27_0 = (vn) (var8);
                  stackIn_28_0 = stackOut_27_0;
                  break L0;
                } else {
                  var3_array[var8_int] = param0[var8_int].field_a - 1;
                  var4[var8_int] = -1 + param0[var8_int].field_g;
                  var5[var8_int] = param0[var8_int].field_c - -2;
                  var6[var8_int] = 2 + param0[var8_int].field_d;
                  array$4 = new byte[var31[var8_int] * var32[var8_int]];
                  var7[var8_int] = array$4;
                  var9 = array$4;
                  var10 = param0[var8_int].field_l;
                  var11 = param0[var8_int].field_c;
                  var12 = param0[var8_int].field_d;
                  var13 = var31[var8_int];
                  var14 = -var11 + var13;
                  var15 = 0;
                  var16 = var31[var8_int] - -1;
                  var17 = 0;
                  L3: while (true) {
                    if (var17 >= var12) {
                      var15 = 0;
                      var16 = var31[var8_int] - -1;
                      var17 = 0;
                      L4: while (true) {
                        if (var17 >= var12) {
                          var8_int++;
                          continue L2;
                        } else {
                          var18 = 0;
                          L5: while (true) {
                            if (var18 >= var11) {
                              var16 = var16 + var14;
                              var17++;
                              continue L4;
                            } else {
                              L6: {
                                incrementValue$5 = var15;
                                var15++;
                                if (var10[incrementValue$5] != 0) {
                                  incrementValue$6 = var16;
                                  var16++;
                                  var9[incrementValue$6] = (byte) 0;
                                  break L6;
                                } else {
                                  var16++;
                                  break L6;
                                }
                              }
                              var18++;
                              continue L5;
                            }
                          }
                        }
                      }
                    } else {
                      var18 = 0;
                      L7: while (true) {
                        if (var11 <= var18) {
                          var16 = var16 + var14;
                          var17++;
                          continue L3;
                        } else {
                          L8: {
                            incrementValue$7 = var15;
                            var15++;
                            if (-1 != (var10[incrementValue$7] ^ -1)) {
                              var19 = var9;
                              var20 = var16 - var13;
                              var21 = var9;
                              var22 = var16 + -1;
                              var23 = var9;
                              var9[var13 + var16] = (byte) 1;
                              var24 = 1 + var16;
                              var23[var24] = (byte) 1;
                              var21[var22] = (byte) 1;
                              var19[var20] = (byte) 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var16++;
                          var18++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var3);
            stackOut_29_1 = new StringBuilder().append("io.Q(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          L10: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        return stackIn_28_0;
    }

    static {
        field_s = new int[8192];
    }
}
