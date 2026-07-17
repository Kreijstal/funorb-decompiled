/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wi {
    int field_d;
    static long field_h;
    int field_a;
    int field_f;
    int field_c;
    int field_e;
    int field_g;
    static String field_b;

    final static boolean a(int param0, int param1, CharSequence param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_34_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var11 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (2 > param1) {
                break L1;
              } else {
                if (param1 <= 36) {
                  L2: {
                    var4_int = 0;
                    if (param0 == 48) {
                      break L2;
                    } else {
                      var12 = null;
                      boolean discarded$1 = wi.a(-107, 91, (CharSequence) null, true);
                      break L2;
                    }
                  }
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      stackOut_41_0 = var5;
                      stackIn_42_0 = stackOut_41_0;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param2.charAt(var8);
                          if (var8 != 0) {
                            break L5;
                          } else {
                            if (var9 == 45) {
                              var4_int = 1;
                              var8++;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (48 > var9) {
                              break L7;
                            } else {
                              if (var9 > 57) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (90 < var9) {
                                break L8;
                              } else {
                                var9 -= 55;
                                break L6;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (var9 > 122) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0 != 0;
                        }
                        if (param1 <= var9) {
                          stackOut_27_0 = 0;
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0 != 0;
                        } else {
                          L10: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = var9 + var6 * param1;
                          if (var10 / param1 != var6) {
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            return stackIn_35_0 != 0;
                          } else {
                            var5 = 1;
                            var6 = var10;
                            var8++;
                            break L4;
                          }
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("wi.F(").append(param0).append(44).append(param1).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L11;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L11;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + 1 + 41);
        }
        return stackIn_42_0 != 0;
    }

    final static ef a(int param0, wj[] param1, byte[] param2) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        byte[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        byte[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        byte[][] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        byte[][] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        byte[][] var30 = null;
        ef stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ef stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param1.length != 256) {
              throw new IllegalArgumentException();
            } else {
              var26 = new int[256];
              var21 = var26;
              var16 = var21;
              var11 = var16;
              var10 = var11;
              var3_array = var10;
              var27 = new int[256];
              var22 = var27;
              var17 = var22;
              var12 = var17;
              var4 = var12;
              var28 = new int[256];
              var23 = var28;
              var18 = var23;
              var13 = var18;
              var5 = var13;
              var29 = new int[256];
              var24 = var29;
              var19 = var24;
              var14 = var19;
              var6 = var14;
              var30 = new byte[256][];
              var25 = var30;
              var20 = var25;
              var15 = var20;
              var7 = var15;
              var8 = param0;
              L1: while (true) {
                if (256 <= var8) {
                  stackOut_7_0 = new ef(param2, var26, var27, var28, var29, var30);
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  var10[var8] = param1[var8].field_g;
                  var4[var8] = param1[var8].field_d;
                  var5[var8] = param1[var8].field_f;
                  var6[var8] = param1[var8].field_e;
                  var7[var8] = param1[var8].field_j;
                  var8++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("wi.E(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_8_0;
    }

    abstract void a(int param0, int param1);

    public static void a(int param0) {
        field_b = null;
    }

    final static void a(int param0, dl[] param1, int param2, int param3, byte param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              qc.a(192, param2, param3, param1, param0, param5, 2);
              if (param4 == -71) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wi.H(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This is earth.<br>Dig your way through it<br>to get to the crystals.";
    }
}
