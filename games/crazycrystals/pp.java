/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends jb {
    int field_f;
    static String field_i;
    int[] field_g;
    boolean field_h;

    final static StringBuilder a(char param0, StringBuilder param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            var4_int = param1.length();
            param1.setLength(param2);
            var5 = var4_int;
            L1: while (true) {
              if (param2 <= var5) {
                L2: {
                  if (param3 == 5277) {
                    break L2;
                  } else {
                    var7 = null;
                    StringBuilder discarded$2 = pp.a('T', (StringBuilder) null, -114, -83);
                    break L2;
                  }
                }
                stackOut_6_0 = (StringBuilder) param1;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                param1.setCharAt(var5, param0);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("pp.B(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final static uj a(int[] param0, byte param1, int param2, byte[] param3, wj[] param4) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        byte[][] var11 = null;
        int var12_int = 0;
        uj var12 = null;
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
        uj stackIn_38_0 = null;
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
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        uj stackOut_37_0 = null;
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
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var30 = CrazyCrystals.field_B;
        try {
          L0: {
            if (256 == param4.length) {
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
              var51 = new int[256];
              var45 = var51;
              var39 = var45;
              var33 = var39;
              var7 = var33;
              var50 = new int[256];
              var44 = var50;
              var38 = var44;
              var32 = var38;
              var8 = var32;
              var49 = new int[3 - -param0.length];
              var43 = var49;
              var37 = var43;
              var31 = var37;
              var9 = var31;
              var49[2] = 1;
              var49[1] = 16777215;
              var10 = 0;
              L1: while (true) {
                if (param0.length <= var10) {
                  L2: {
                    var10 = param0.length - -1;
                    if (var10 >= 2) {
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
                        var12 = new uj(param3, var52, var53, var51, var50, var49, var54);
                        var12.field_o = var12.field_o - 1;
                        if (param0.length != 0) {
                          var12.field_u = var12.field_u - param0.length;
                          break L4;
                        } else {
                          var12.field_u = var12.field_u - 1;
                          break L4;
                        }
                      }
                      var12.field_A = var12.field_A - 1;
                      stackOut_37_0 = (uj) var12;
                      stackIn_38_0 = stackOut_37_0;
                      break L0;
                    } else {
                      var5_array[var12_int] = -1 + param4[var12_int].field_g;
                      var6[var12_int] = param4[var12_int].field_d + -1;
                      var7[var12_int] = param4[var12_int].field_f + var10;
                      var8[var12_int] = param4[var12_int].field_e + var10;
                      var11[var12_int] = new byte[var50[var12_int] * var51[var12_int]];
                      var13 = new byte[var50[var12_int] * var51[var12_int]];
                      var14 = param4[var12_int].field_j;
                      var15 = param4[var12_int].field_f;
                      var16 = param4[var12_int].field_e;
                      var17 = var51[var12_int];
                      var18 = -var15 + var17;
                      var19 = 0;
                      var20 = var51[var12_int] - -1;
                      var21 = 0;
                      L5: while (true) {
                        if (var16 <= var21) {
                          var20 = 1 + var51[var12_int];
                          var19 = 0;
                          var21 = 0;
                          L6: while (true) {
                            if (var16 <= var21) {
                              var12_int++;
                              continue L3;
                            } else {
                              var22 = 0;
                              L7: while (true) {
                                if (var15 <= var22) {
                                  var20 = var20 + var18;
                                  var21++;
                                  continue L6;
                                } else {
                                  L8: {
                                    int incrementValue$3 = var19;
                                    var19++;
                                    if (var14[incrementValue$3] == 0) {
                                      var20++;
                                      break L8;
                                    } else {
                                      int incrementValue$4 = var20;
                                      var20++;
                                      var13[incrementValue$4] = (byte) 1;
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
                                if (var14[incrementValue$5] != 0) {
                                  var23 = var17 - -1;
                                  var24_int = 0;
                                  L11: while (true) {
                                    if (var24_int >= param0.length) {
                                      var24 = var13;
                                      var25 = -var17 + var20;
                                      var26 = var13;
                                      var27 = var20 + -1;
                                      var28 = var13;
                                      var29 = 1 + var20;
                                      var13[var20 - -var17] = (byte) 2;
                                      var28[var29] = (byte) 2;
                                      var26[var27] = (byte) 2;
                                      var24[var25] = (byte) 2;
                                      break L10;
                                    } else {
                                      var13[var23 + var20] = (byte)(3 + var24_int);
                                      var23 = var23 + (1 + var17);
                                      var24_int++;
                                      continue L11;
                                    }
                                  }
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
                  var9[3 + var10] = param0[var10];
                  var10++;
                  continue L1;
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var5;
            stackOut_39_1 = new StringBuilder().append("pp.A(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L12;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L12;
            }
          }
          L13: {
            stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',').append(80).append(',').append(1).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param3 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L13;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L13;
            }
          }
          L14: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param4 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L14;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L14;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ')');
        }
        return stackIn_38_0;
    }

    public static void a(byte param0) {
        field_i = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = CrazyCrystals.field_B;
          if (param2 < param1) {
            if (param0 <= param1) {
              if (param2 < param0) {
                qp.a((byte) 99, param4, param5, param1, kh.field_i, param2, param6, param7, param0);
                break L0;
              } else {
                qp.a((byte) 99, param7, param5, param1, kh.field_i, param0, param6, param4, param2);
                break L0;
              }
            } else {
              qp.a((byte) 99, param5, param4, param0, kh.field_i, param2, param6, param7, param1);
              break L0;
            }
          } else {
            if (param0 > param2) {
              qp.a((byte) 99, param7, param4, param0, kh.field_i, param1, param6, param5, param2);
              break L0;
            } else {
              if (param0 <= param1) {
                qp.a((byte) 99, param5, param7, param2, kh.field_i, param0, param6, param4, param1);
                break L0;
              } else {
                qp.a((byte) 99, param4, param7, param2, kh.field_i, param1, param6, param5, param0);
                break L0;
              }
            }
          }
        }
    }

    pp() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "\"There's a bug in the spider web!\" - Ben D";
    }
}
