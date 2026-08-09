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
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        var11 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (2 > param1) {
                break L1;
              } else {
                if ((param1 ^ -1) >= -37) {
                  L2: {
                    var4_int = 0;
                    if (param0 == 48) {
                      break L2;
                    } else {
                      var12 = (CharSequence) null;
                      wi.a(-107, 91, (CharSequence) null, true);
                      break L2;
                    }
                  }
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      stackIn_42_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param2.charAt(var8);
                          if (-1 != (var8 ^ -1)) {
                            break L5;
                          } else {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (param3) {
                                  break L4;
                                } else {
                                  break L5;
                                }
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
                          stackIn_26_0 = 0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                        if (param1 <= var9) {
                          stackIn_30_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
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
                            stackIn_37_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var5 = 1;
                            var6 = var10;
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
            stackIn_45_0 = (RuntimeException) (var4);

            stackIn_45_1 = new StringBuilder().append("wi.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L11;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L11;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_26_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_30_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_37_0 != 0;
            } else {
              return stackIn_42_0 != 0;
            }
          }
        }
    }

    final static ef a(int param0, wj[] param1, byte[] param2) {
        ef stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
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
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            if (-257 != (param1.length ^ -1)) {
              throw new IllegalArgumentException();
            } else {
              var16 = new int[256];
              var11 = var16;
              var10 = var11;
              var3 = var10;
              var17 = new int[256];
              var12 = var17;
              var4 = var12;
              var18 = new int[256];
              var13 = var18;
              var5 = var13;
              var19 = new int[256];
              var14 = var19;
              var6 = var14;
              var20 = new byte[256][];
              var15 = var20;
              var7 = var15;
              var8 = param0;
              L1: while (true) {
                if (256 <= var8) {
                  stackIn_8_0 = new ef(param2, var16, var17, var18, var19, var20);
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
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("wi.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        return stackIn_8_0;
    }

    abstract void a(int param0, int param1);

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_b = (String) null;
        }
    }

    final static void a(int param0, dl[] param1, int param2, int param3, byte param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              qc.a(192, param2, param3, param1, param0, param5, 2);
              if (param4 == -71) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wi.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_b = "This is earth.<br>Dig your way through it<br>to get to the crystals.";
    }
}
