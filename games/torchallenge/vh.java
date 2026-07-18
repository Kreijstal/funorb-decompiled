/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private boolean field_f;
    static int field_h;
    private boolean field_e;
    static vi field_b;
    static String field_g;
    private String field_c;
    static tc[] field_d;
    static boolean field_a;

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        Object var4 = null;
        o var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= -26) {
                break L1;
              } else {
                var4 = null;
                int discarded$2 = vh.a((byte) -81, false, -106, (CharSequence) null);
                break L1;
              }
            }
            var5 = (o) (Object) ve.field_c.c((byte) -72);
            L2: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                te.a(param0, 9082, var5);
                var5 = (o) (Object) ve.field_c.c(-270);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "vh.H(" + param0 + ',' + param1 + ')');
        }
    }

    final String a(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((vh) this).field_c;
    }

    final void a(byte param0, boolean param1) {
        ((vh) this).field_f = true;
        ((vh) this).field_e = param1 ? true : false;
        if (param0 < 39) {
            vh.a(32, -4);
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        return ((vh) this).field_e;
    }

    final static int a(byte param0, boolean param1, int param2, CharSequence param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_37_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 < 2) {
                break L1;
              } else {
                if (36 < param2) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param3.length();
                  var8 = -95 % ((param0 - -60) / 47);
                  var9 = 0;
                  L2: while (true) {
                    if (var9 >= var7) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackOut_37_0 = var6;
                        stackIn_38_0 = stackOut_37_0;
                        break L0;
                      }
                    } else {
                      L3: {
                        L4: {
                          var10 = param3.charAt(var9);
                          if (var9 != 0) {
                            break L4;
                          } else {
                            if (var10 != 45) {
                              if (var10 != 43) {
                                break L4;
                              } else {
                                if (!param1) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L3;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (var10 < 48) {
                              break L6;
                            } else {
                              if (57 >= var10) {
                                var10 -= 48;
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (var10 < 65) {
                              break L7;
                            } else {
                              if (90 < var10) {
                                break L7;
                              } else {
                                var10 -= 55;
                                break L5;
                              }
                            }
                          }
                          L8: {
                            if (var10 < 97) {
                              break L8;
                            } else {
                              if (var10 > 122) {
                                break L8;
                              } else {
                                var10 -= 87;
                                break L5;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var10 < param2) {
                          L9: {
                            if (var4_int != 0) {
                              var10 = -var10;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var11 = param2 * var6 - -var10;
                          if (var6 != var11 / param2) {
                            throw new NumberFormatException();
                          } else {
                            var6 = var11;
                            var5 = 1;
                            break L3;
                          }
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var4;
            stackOut_39_1 = new StringBuilder().append("vh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param3 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L10;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L10;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ')');
        }
        return stackIn_38_0;
    }

    final static rh a(ge[] param0, int param1, int param2, byte[] param3, int param4, int param5) {
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
        rh var16 = null;
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
        rh stackIn_28_0 = null;
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
        rh stackOut_27_0 = null;
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
        var27 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param0.length == 256) {
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
              var10 = new int[]{0, 16301089, 8015912};
              var54 = new byte[256][];
              var47 = var54;
              var40 = var47;
              var33 = var40;
              var11 = var33;
              var55 = qg.field_i;
              var13 = qg.field_g;
              var14 = qg.field_f;
              var49 = new int[4];
              qg.a(var49);
              var16_int = 0;
              L1: while (true) {
                if (var16_int >= 256) {
                  var16 = new rh(param3, var52, var53, var50, var51, var10, var54);
                  var16.field_t = var16.field_t - 2;
                  var16.field_K = var16.field_K - 2;
                  var16.field_x = var16.field_x - 2;
                  qg.a(var55, var13, var14);
                  qg.b(var49);
                  stackOut_27_0 = (rh) var16;
                  stackIn_28_0 = stackOut_27_0;
                  break L0;
                } else {
                  var6_array[var16_int] = -2 + param0[var16_int].field_f;
                  var7[var16_int] = param0[var16_int].field_g - 2;
                  var8[var16_int] = param0[var16_int].field_b - -4;
                  var9[var16_int] = param0[var16_int].field_a + 4;
                  var11[var16_int] = new byte[var50[var16_int] * var51[var16_int]];
                  var17 = new byte[var50[var16_int] * var51[var16_int]];
                  var18 = param0[var16_int].field_k;
                  var19 = param0[var16_int].field_b;
                  var20 = param0[var16_int].field_a;
                  var21 = var50[var16_int];
                  var22 = -var19 + var21;
                  qg.a(new int[var50[var16_int] * var51[var16_int]], var50[var16_int], var51[var16_int]);
                  var23 = 0;
                  var24 = 0;
                  L2: while (true) {
                    if (var20 <= var24) {
                      var24 = 0;
                      L3: while (true) {
                        if (var24 >= var17.length) {
                          var23 = 0;
                          var24 = (var50[var16_int] + 1) * 2;
                          var25 = 0;
                          L4: while (true) {
                            if (var20 <= var25) {
                              var16_int++;
                              continue L1;
                            } else {
                              var26 = 0;
                              L5: while (true) {
                                if (var26 >= var19) {
                                  var24 = var24 + var22;
                                  var25++;
                                  continue L4;
                                } else {
                                  L6: {
                                    int incrementValue$3 = var23;
                                    var23++;
                                    if (var18[incrementValue$3] == 0) {
                                      var24++;
                                      break L6;
                                    } else {
                                      int incrementValue$4 = var24;
                                      var24++;
                                      var17[incrementValue$4] = (byte) 1;
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
                          var17[var24] = (byte)qg.field_i[var24];
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
                              qg.e(2 + var25, var24 + 2, 2, 2);
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
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("vh.A(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          L10: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(2).append(',').append(33).append(',');
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
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + 16301089 + ',' + 8015912 + ')');
        }
        return stackIn_28_0;
    }

    final boolean b(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            int discarded$0 = vh.a((byte) 57, true, 84, (CharSequence) null);
        }
        return ((vh) this).field_f;
    }

    public static void c(int param0) {
        field_b = null;
        field_d = null;
        field_g = null;
    }

    vh(String param0) {
        ((vh) this).field_f = false;
        ((vh) this).field_e = false;
        try {
            ((vh) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "vh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_d = null;
        field_b = new vi();
        field_a = false;
    }
}
