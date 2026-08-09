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
        byte[] array$0 = null;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        pk stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
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
        var30 = Torquing.field_u;
        try {
          L0: {
            if (-257 != (param4.length ^ -1)) {
              throw new IllegalArgumentException();
            } else {
              L1: {
                var40 = new int[256];
                var34 = var40;
                var5 = var34;
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
                      stackIn_41_0 = (pk) (var12);
                      break L0;
                    } else {
                      var5[var12_int] = -1 + param4[var12_int].field_a;
                      var6[var12_int] = param4[var12_int].field_g - 1;
                      var7[var12_int] = var10 + param4[var12_int].field_c;
                      var8[var12_int] = param4[var12_int].field_d - -var10;
                      array$0 = new byte[var38[var12_int] * var39[var12_int]];
                      var11[var12_int] = array$0;
                      var13 = array$0;
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
                                    incrementValue$1 = var19;
                                    var19++;
                                    if ((var14[incrementValue$1] ^ -1) != -1) {
                                      incrementValue$2 = var20;
                                      var20++;
                                      var13[incrementValue$2] = (byte) 1;
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
                              incrementValue$3 = var19;
                              var19++;
                              if ((var14[incrementValue$3] ^ -1) != -1) {
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
            var5_ref = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var5_ref);

            stackIn_44_1 = new StringBuilder().append("ob.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L13;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_47_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');

            if (param2 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L14;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L15;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L15;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_45_0), stackIn_51_2 + ')');
        }
        return stackIn_41_0;
    }

    static {
        field_a = new byte[65536];
        dk.a(field_a, 0, 65536, (byte) -128);
    }
}
