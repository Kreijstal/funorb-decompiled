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
        int var23 = 0;
        int var24_int = 0;
        byte[] var24 = null;
        int var25 = 0;
        byte[] var26 = null;
        int var27 = 0;
        byte[] var28 = null;
        int var29 = 0;
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
        pk stackIn_41_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        pk stackOut_40_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var30 = Torquing.field_u;
        try {
          L0: {
            if (-257 != (param4.length ^ -1)) {
              throw new IllegalArgumentException();
            } else {
              L1: {
                var40 = new int[256];
                var34 = var40;
                var5_array = var34;
                var41 = new int[256];
                var35 = var41;
                var6 = var35;
                var38 = new int[256];
                var32 = var38;
                var7 = var32;
                if (param3) {
                  break L1;
                } else {
                  field_a = (byte[]) null;
                  break L1;
                }
              }
              var39 = new int[256];
              var33 = var39;
              var8 = var33;
              var37 = new int[param1.length + 3];
              var31 = var37;
              var9 = var31;
              var37[2] = param0;
              var37[1] = 16777215;
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
                  var42 = new byte[256][];
                  var36 = var42;
                  var11 = var36;
                  var12_int = 0;
                  L4: while (true) {
                    if ((var12_int ^ -1) <= -257) {
                      L5: {
                        var12 = new pk(param2, var40, var41, var38, var39, var37, var42);
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
                      stackOut_40_0 = (pk) (var12);
                      stackIn_41_0 = stackOut_40_0;
                      break L0;
                    } else {
                      var5_array[var12_int] = -1 + param4[var12_int].field_a;
                      var6[var12_int] = param4[var12_int].field_g - 1;
                      var7[var12_int] = var10 + param4[var12_int].field_c;
                      var8[var12_int] = param4[var12_int].field_d - -var10;
                      array$4 = new byte[var38[var12_int] * var39[var12_int]];
                      var11[var12_int] = array$4;
                      var13 = array$4;
                      var14 = param4[var12_int].field_l;
                      var15 = param4[var12_int].field_c;
                      var16 = param4[var12_int].field_d;
                      var17 = var38[var12_int];
                      var18 = -var15 + var17;
                      var19 = 0;
                      var20 = var38[var12_int] - -1;
                      var21 = 0;
                      L6: while (true) {
                        if (var21 >= var16) {
                          var20 = 1 + var38[var12_int];
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
                                    incrementValue$5 = var19;
                                    var19++;
                                    if (var14[incrementValue$5] != 0) {
                                      incrementValue$6 = var20;
                                      var20++;
                                      var13[incrementValue$6] = (byte) 1;
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
                              incrementValue$7 = var19;
                              var19++;
                              if (var14[incrementValue$7] != 0) {
                                var23 = var17 + 1;
                                var24_int = 0;
                                L11: while (true) {
                                  if (var24_int >= param1.length) {
                                    L12: {
                                      if (0 != (param0 ^ -1)) {
                                        var24 = var13;
                                        var25 = -var17 + var20;
                                        var26 = var13;
                                        var27 = -1 + var20;
                                        var28 = var13;
                                        var29 = 1 + var20;
                                        var13[var17 + var20] = (byte) 2;
                                        var28[var29] = (byte) 2;
                                        var26[var27] = (byte) 2;
                                        var24[var25] = (byte) 2;
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    var20++;
                                    var22++;
                                    continue L10;
                                  } else {
                                    var13[var23 + var20] = (byte)(3 + var24_int);
                                    var23 = var23 + (1 + var17);
                                    var24_int++;
                                    continue L11;
                                  }
                                }
                              } else {
                                var20++;
                                var22++;
                                continue L10;
                              }
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
          L13: {
            var5 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var5);
            stackOut_42_1 = new StringBuilder().append("ob.B(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L13;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L13;
            }
          }
          L14: {
            stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L14;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L14;
            }
          }
          L15: {
            stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param3).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param4 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L15;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L15;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ')');
        }
        return stackIn_41_0;
    }

    static {
        field_a = new byte[65536];
        dk.a(field_a, 0, 65536, (byte) -128);
    }
}
