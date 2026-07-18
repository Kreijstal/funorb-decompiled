/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static byte[] field_a;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -12) {
            ob.a((byte) -1);
        }
        field_a = null;
    }

    final static pk a(int param0, int[] param1, byte[] param2, boolean param3, sm[] param4) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        byte[][] var11 = null;
        int var12_int = 0;
        pk var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var30 = 0;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        byte[][] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        byte[][] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        byte[][] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        byte[][] var54 = null;
        pk stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        pk stackOut_32_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var30 = Torquing.field_u;
        try {
          L0: {
            if (param4.length != 256) {
              throw new IllegalArgumentException();
            } else {
              var52 = new int[256];
              var46 = var52;
              var40 = var46;
              var34 = var40;
              var5_array = var34;
              var53 = new int[256];
              var47 = var53;
              var41 = var47;
              var35 = var41;
              var6 = var35;
              var50 = new int[256];
              var44 = var50;
              var38 = var44;
              var32 = var38;
              var7 = var32;
              var51 = new int[256];
              var45 = var51;
              var39 = var45;
              var33 = var39;
              var8 = var33;
              var49 = new int[param1.length + 3];
              var43 = var49;
              var37 = var43;
              var31 = var37;
              var9 = var31;
              var49[2] = 1579032;
              var49[1] = 16777215;
              var10 = 0;
              L1: while (true) {
                if (var10 >= param1.length) {
                  L2: {
                    var10 = 1 + param1.length;
                    if (2 <= var10) {
                      break L2;
                    } else {
                      var10 = 2;
                      break L2;
                    }
                  }
                  var54 = new byte[256][];
                  var48 = var54;
                  var42 = var48;
                  var36 = var42;
                  var11 = var36;
                  var12_int = 0;
                  L3: while (true) {
                    if (var12_int >= 256) {
                      L4: {
                        var12 = new pk(param2, var52, var53, var50, var51, var49, var54);
                        var12.field_x = var12.field_x - 1;
                        if (param1.length == 0) {
                          var12.field_t = var12.field_t - 1;
                          break L4;
                        } else {
                          var12.field_t = var12.field_t - param1.length;
                          break L4;
                        }
                      }
                      var12.field_s = var12.field_s - 1;
                      stackOut_32_0 = (pk) var12;
                      stackIn_33_0 = stackOut_32_0;
                      break L0;
                    } else {
                      var5_array[var12_int] = -1 + param4[var12_int].field_a;
                      var6[var12_int] = param4[var12_int].field_g - 1;
                      var7[var12_int] = var10 + param4[var12_int].field_c;
                      var8[var12_int] = param4[var12_int].field_d - -var10;
                      var11[var12_int] = new byte[var50[var12_int] * var51[var12_int]];
                      var13 = new byte[var50[var12_int] * var51[var12_int]];
                      var14 = param4[var12_int].field_l;
                      var15 = param4[var12_int].field_c;
                      var16 = param4[var12_int].field_d;
                      var17 = var50[var12_int];
                      var18 = -var15 + var17;
                      var19 = 0;
                      var20 = var50[var12_int] - -1;
                      var21 = 0;
                      L5: while (true) {
                        if (var21 >= var16) {
                          var20 = 1 + var50[var12_int];
                          var19 = 0;
                          var21 = 0;
                          L6: while (true) {
                            if (var16 <= var21) {
                              var12_int++;
                              continue L3;
                            } else {
                              var22 = 0;
                              L7: while (true) {
                                if (var22 >= var15) {
                                  var20 = var20 + var18;
                                  var21++;
                                  continue L6;
                                } else {
                                  L8: {
                                    int incrementValue$3 = var19;
                                    var19++;
                                    if (var14[incrementValue$3] != 0) {
                                      int incrementValue$4 = var20;
                                      var20++;
                                      var13[incrementValue$4] = (byte) 1;
                                      break L8;
                                    } else {
                                      var20++;
                                      break L8;
                                    }
                                  }
                                  var22++;
                                  continue L7;
                                }
                              }
                            }
                          }
                        } else {
                          var22 = 0;
                          L9: while (true) {
                            if (var15 <= var22) {
                              var20 = var20 + var18;
                              var21++;
                              continue L5;
                            } else {
                              L10: {
                                int incrementValue$5 = var19;
                                var19++;
                                if (var14[incrementValue$5] == 0) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              var20++;
                              var22++;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var9[3 + var10] = param1[var10];
                  var10++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var5;
            stackOut_34_1 = new StringBuilder().append("ob.B(").append(1579032).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L11;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L11;
            }
          }
          L12: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L12;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L12;
            }
          }
          L13: {
            stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(true).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param4 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L13;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L13;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ')');
        }
        return stackIn_33_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[65536];
        dk.a(field_a, 0, 65536, (byte) -128);
    }
}
