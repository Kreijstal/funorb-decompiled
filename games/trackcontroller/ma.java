/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma implements t {
    static long field_b;
    static int field_c;
    static String field_a;

    final static de a(int param0, byte param1, int param2, ng[] param3, byte[] param4) {
        RuntimeException var6 = null;
        int[] var6_array = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        byte[][] var11 = null;
        int var13 = 0;
        int var14 = 0;
        int var16_int = 0;
        de var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        byte[][] var47 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        byte[][] var54 = null;
        int[] var55 = null;
        de stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        de stackOut_30_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var27 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param3.length != 256) {
              throw new IllegalArgumentException();
            } else {
              var52 = new int[256];
              var45 = var52;
              var38 = var45;
              var31 = var38;
              var6_array = var31;
              var53 = new int[256];
              var46 = var53;
              var39 = var46;
              var32 = var39;
              var7 = var32;
              var50 = new int[256];
              var43 = var50;
              var36 = var43;
              var29 = var36;
              var8 = var29;
              var51 = new int[256];
              var44 = var51;
              var37 = var44;
              var30 = var37;
              var9 = var30;
              var10 = new int[]{0, 15252224, 6488064};
              var54 = new byte[256][];
              var47 = var54;
              var40 = var47;
              var33 = var40;
              var11 = var33;
              var55 = ll.field_i;
              var13 = ll.field_d;
              var14 = ll.field_k;
              var49 = new int[4];
              ll.a(var49);
              var16_int = 0;
              L1: while (true) {
                if (256 <= var16_int) {
                  var16 = new de(param4, var52, var53, var50, var51, var10, var54);
                  var16.field_u = var16.field_u - 2;
                  var16.field_H = var16.field_H - 2;
                  var16.field_G = var16.field_G - 2;
                  ll.a(var55, var13, var14);
                  ll.b(var49);
                  stackOut_30_0 = (de) var16;
                  stackIn_31_0 = stackOut_30_0;
                  break L0;
                } else {
                  var6_array[var16_int] = param3[var16_int].field_b - 2;
                  var7[var16_int] = -2 + param3[var16_int].field_a;
                  var8[var16_int] = 4 + param3[var16_int].field_c;
                  var9[var16_int] = 4 + param3[var16_int].field_j;
                  var11[var16_int] = new byte[var50[var16_int] * var51[var16_int]];
                  var17 = new byte[var50[var16_int] * var51[var16_int]];
                  var18 = param3[var16_int].field_m;
                  var19 = param3[var16_int].field_c;
                  var20 = param3[var16_int].field_j;
                  var21 = var50[var16_int];
                  var22 = -var19 + var21;
                  ll.a(new int[var51[var16_int] * var50[var16_int]], var50[var16_int], var51[var16_int]);
                  var23 = 0;
                  var24 = 0;
                  L2: while (true) {
                    if (var24 >= var20) {
                      var24 = 0;
                      L3: while (true) {
                        if (var17.length <= var24) {
                          var23 = 0;
                          var24 = 2 * (var50[var16_int] + 1);
                          var25 = 0;
                          L4: while (true) {
                            if (var20 <= var25) {
                              var16_int++;
                              continue L1;
                            } else {
                              var26 = 0;
                              L5: while (true) {
                                if (var19 <= var26) {
                                  var24 = var24 + var22;
                                  var25++;
                                  continue L4;
                                } else {
                                  L6: {
                                    int incrementValue$3 = var23;
                                    var23++;
                                    if (0 != var18[incrementValue$3]) {
                                      int incrementValue$4 = var24;
                                      var24++;
                                      var17[incrementValue$4] = (byte) 1;
                                      break L6;
                                    } else {
                                      var24++;
                                      break L6;
                                    }
                                  }
                                  var26++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          var17[var24] = (byte)ll.field_i[var24];
                          var24++;
                          continue L3;
                        }
                      }
                    } else {
                      var25 = 0;
                      L7: while (true) {
                        if (var19 <= var25) {
                          var24++;
                          continue L2;
                        } else {
                          L8: {
                            int incrementValue$5 = var23;
                            var23++;
                            if (var18[incrementValue$5] != 0) {
                              ll.f(var25 - -2, var24 - -2, 2, 2);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var25++;
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
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var6;
            stackOut_32_1 = new StringBuilder().append("ma.D(").append(6488064).append(',').append(-123).append(',').append(2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          L10: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param4 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L10;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + 15252224 + ')');
        }
        return stackIn_31_0;
    }

    public static void a() {
        field_a = null;
    }

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        qj var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var6_int = param1.field_p + param4;
            var7 = param1.field_m + param2;
            fc.a(param1.field_x, var7, param1.field_u, (byte) -77, var6_int);
            if (param0 == -24969) {
              L1: {
                var8 = TrackController.field_D[1];
                if (!(param1 instanceof rh)) {
                  break L1;
                } else {
                  if (!((rh) (Object) param1).field_G) {
                    break L1;
                  } else {
                    var8.a((param1.field_x - var8.field_s >> 1) + (1 + var6_int), var7 + 1 + (param1.field_u - var8.field_v >> 1), 256);
                    break L1;
                  }
                }
              }
              L2: {
                if (!param1.h(-111)) {
                  break L2;
                } else {
                  bc.a(param1.field_u + -4, -28846, param1.field_x - 4, var7 - -2, var6_int - -2);
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("ma.L(").append(param0).append(',');
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
          throw sl.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                    int discarded$2 = 0;
                    param1.getAppletContext().showDocument(of.a(param1, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref2;
                stackOut_4_1 = new StringBuilder().append("ma.C(").append(-9969).append(',');
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
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw sl.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Members";
    }
}
