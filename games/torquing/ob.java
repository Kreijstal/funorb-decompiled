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
        pk stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        pk stackOut_34_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var30 = Torquing.field_u;
        try {
          L0: {
            if (param4.length != 256) {
              throw new IllegalArgumentException();
            } else {
              L1: {
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
                if (param3) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
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
              var49[2] = param0;
              var49[1] = 16777215;
              var10 = 0;
              L2: while (true) {
                if (var10 >= param1.length) {
                  L3: {
                    var10 = 1 + param1.length;
                    if (2 <= var10) {
                      break L3;
                    } else {
                      var10 = 2;
                      break L3;
                    }
                  }
                  var54 = new byte[256][];
                  var48 = var54;
                  var42 = var48;
                  var36 = var42;
                  var11 = var36;
                  var12_int = 0;
                  L4: while (true) {
                    if (var12_int >= 256) {
                      L5: {
                        var12 = new pk(param2, var52, var53, var50, var51, var49, var54);
                        var12.field_x = var12.field_x - 1;
                        if (param1.length == 0) {
                          var12.field_t = var12.field_t - 1;
                          break L5;
                        } else {
                          var12.field_t = var12.field_t - param1.length;
                          break L5;
                        }
                      }
                      var12.field_s = var12.field_s - 1;
                      stackOut_34_0 = (pk) var12;
                      stackIn_35_0 = stackOut_34_0;
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
                      L6: while (true) {
                        if (var21 >= var16) {
                          var20 = 1 + var50[var12_int];
                          var19 = 0;
                          var21 = 0;
                          L7: while (true) {
                            if (var16 <= var21) {
                              var12_int++;
                              continue L4;
                            } else {
                              var22 = 0;
                              L8: while (true) {
                                if (var22 >= var15) {
                                  var20 = var20 + var18;
                                  var21++;
                                  continue L7;
                                } else {
                                  L9: {
                                    int incrementValue$3 = var19;
                                    var19++;
                                    if (var14[incrementValue$3] != 0) {
                                      int incrementValue$4 = var20;
                                      var20++;
                                      var13[incrementValue$4] = (byte) 1;
                                      break L9;
                                    } else {
                                      var20++;
                                      break L9;
                                    }
                                  }
                                  var22++;
                                  continue L8;
                                }
                              }
                            }
                          }
                        } else {
                          var22 = 0;
                          L10: while (true) {
                            if (var15 <= var22) {
                              var20 = var20 + var18;
                              var21++;
                              continue L6;
                            } else {
                              L11: {
                                int incrementValue$5 = var19;
                                var19++;
                                if (var14[incrementValue$5] == 0) {
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              var20++;
                              var22++;
                              continue L10;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var9[3 + var10] = param1[var10];
                  var10++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var5;
            stackOut_36_1 = new StringBuilder().append("ob.B(").append(param0).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L12;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L12;
            }
          }
          L13: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L13;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L13;
            }
          }
          L14: {
            stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(44).append(param3).append(44);
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param4 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L14;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L14;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 41);
        }
        return stackIn_35_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[65536];
        dk.a(field_a, 0, 65536, (byte) -128);
    }
}
