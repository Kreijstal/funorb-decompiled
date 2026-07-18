/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends rd {
    static int[] field_q;
    private int field_s;
    static wj field_n;
    private uh field_p;
    static int field_r;
    static int field_m;
    private uh field_o;

    final static float a(int param0, wc[] param1) {
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        float stackIn_6_0 = 0.0f;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        float stackOut_5_0 = 0.0f;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            var2_float = 0.0f;
            var3 = 0;
            L1: while (true) {
              if (param1.length <= var3) {
                stackOut_5_0 = var2_float;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var2_float = var2_float + param1[var3].f(50);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("ce.A(").append(-1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int[] param0, int param1, byte param2, int[] param3) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            var12 = new int[param3.length + param0.length];
            var16 = var12;
            var15 = var16;
            var14 = var15;
            var13 = var14;
            var5_array = var13;
            var6 = 0;
            L1: while (true) {
              if (var6 >= param0.length) {
                var6 = 0;
                L2: while (true) {
                  if (param3.length / 2 <= var6) {
                    ((ce) this).field_p.a(param0, 0);
                    ((ce) this).field_o.a(param3, 0);
                    gf.a(var16, 12566463);
                    if (param2 <= -49) {
                      L3: {
                        if (param1 != ((ce) this).field_s) {
                          L4: {
                            if (((ce) this).field_p.b(-127) <= 0) {
                              break L4;
                            } else {
                              if (((ce) this).field_o.b(-115) > 0) {
                                var7 = ((ce) this).field_p.a((byte) 127, 0);
                                var8 = ((ce) this).field_p.a((byte) 105, 1);
                                var6 = 0;
                                L5: while (true) {
                                  if (var6 >= ((ce) this).field_p.b(-117)) {
                                    var9 = ((ce) this).field_o.a((byte) 81, -2 + ((ce) this).field_o.b(-111));
                                    var10 = ((ce) this).field_o.a((byte) 46, ((ce) this).field_o.b(-119) + -1);
                                    tc.d(var7, var8, var9, var10, 4144959);
                                    var8 = var10;
                                    var7 = var9;
                                    var6 = -2 + ((ce) this).field_o.b(-115);
                                    L6: while (true) {
                                      if (var6 < 0) {
                                        var9 = ((ce) this).field_p.a((byte) 28, 0);
                                        var10 = ((ce) this).field_p.a((byte) 118, 1);
                                        tc.d(var7, var8, var9, var10, 4144959);
                                        var7 = var9;
                                        var8 = var10;
                                        ((ce) this).field_p = o.a((byte) 103);
                                        ((ce) this).field_o = o.a((byte) -115);
                                        break L4;
                                      } else {
                                        var9 = ((ce) this).field_o.a((byte) 19, var6);
                                        var10 = ((ce) this).field_o.a((byte) 107, var6 - -1);
                                        tc.d(var7, var8, var9, var10, 4144959);
                                        var7 = var9;
                                        var8 = var10;
                                        var6 -= 2;
                                        continue L6;
                                      }
                                    }
                                  } else {
                                    var9 = ((ce) this).field_p.a((byte) 110, var6);
                                    var10 = ((ce) this).field_p.a((byte) 13, 1 + var6);
                                    tc.d(var7, var8, var9, var10, 4144959);
                                    var7 = var9;
                                    var8 = var10;
                                    var6 += 2;
                                    continue L5;
                                  }
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          ((ce) this).field_s = param1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    var5_array[2 * var6 + param0.length] = param3[-(2 * var6) + (-2 + param3.length)];
                    var5_array[var6 * 2 + param0.length - -1] = param3[-(var6 * 2) + -1 + param3.length];
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var12[var6] = param0[var6];
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("ce.D(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
    }

    final static ql a(int param0, byte[] param1, bm[] param2, int param3) {
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
        ql var16 = null;
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
        ql stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        ql stackOut_29_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var27 = HoldTheLine.field_D;
        try {
          L0: {
            if (param2.length == 256) {
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
              var51 = new int[256];
              var44 = var51;
              var37 = var44;
              var30 = var37;
              var8 = var30;
              var50 = new int[256];
              var43 = var50;
              var36 = var43;
              var29 = var36;
              var9 = var29;
              var10 = new int[]{0, 16777215, 0};
              var54 = new byte[256][];
              var47 = var54;
              var40 = var47;
              var33 = var40;
              var11 = var33;
              var55 = tc.field_b;
              var13 = tc.field_j;
              var14 = tc.field_c;
              var49 = new int[4];
              tc.b(var49);
              var16_int = 0;
              L1: while (true) {
                if (var16_int >= 256) {
                  var16 = new ql(param1, var52, var53, var51, var50, var10, var54);
                  var16.field_I = var16.field_I - param3;
                  var16.field_s = var16.field_s - param3;
                  var16.field_G = var16.field_G - param3;
                  tc.a(var55, var13, var14);
                  tc.a(var49);
                  stackOut_29_0 = (ql) var16;
                  stackIn_30_0 = stackOut_29_0;
                  break L0;
                } else {
                  var6_array[var16_int] = param2[var16_int].field_k + -param3;
                  var7[var16_int] = -param3 + param2[var16_int].field_d;
                  var8[var16_int] = (param3 << 1) + param2[var16_int].field_i;
                  var9[var16_int] = (param3 << 1) + param2[var16_int].field_l;
                  var11[var16_int] = new byte[var50[var16_int] * var51[var16_int]];
                  var17 = new byte[var50[var16_int] * var51[var16_int]];
                  var18 = param2[var16_int].field_m;
                  var19 = param2[var16_int].field_i;
                  var20 = param2[var16_int].field_l;
                  var21 = var51[var16_int];
                  tc.a(new int[var50[var16_int] * var51[var16_int]], var51[var16_int], var50[var16_int]);
                  var22 = -var19 + var21;
                  var23 = 0;
                  var24 = 0;
                  L2: while (true) {
                    if (var24 >= var20) {
                      var24 = 0;
                      L3: while (true) {
                        if (var17.length <= var24) {
                          var23 = 0;
                          var24 = (1 + var51[var16_int]) * param3;
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
                                    if (var18[incrementValue$3] != 0) {
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
                          var17[var24] = (byte)tc.field_b[var24];
                          var24++;
                          continue L3;
                        }
                      }
                    } else {
                      var25 = 0;
                      L7: while (true) {
                        if (var25 >= var19) {
                          var24++;
                          continue L2;
                        } else {
                          L8: {
                            int incrementValue$5 = var23;
                            var23++;
                            if (var18[incrementValue$5] != 0) {
                              tc.d(var25 - -param3, var24 + param3, param3, 2);
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
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("ce.F(").append(0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          L10: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L10;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L10;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param3 + ',' + 16777215 + ',' + 8 + ')');
        }
        return stackIn_30_0;
    }

    public static void c() {
        field_q = null;
        field_n = null;
    }

    final static hj[] a(String param0, int param1, String param2, gn param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hj[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        hj[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var4_int = param3.c(param2, 3);
            var5 = param3.a(var4_int, param0, false);
            stackOut_2_0 = jc.a(-1, var5, param3, var4_int);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ce.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(17870).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, vk param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = kg.a((byte) 26, param1);
            var3 = go.field_g[param1.field_p];
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                L2: {
                  if (!mc.field_a[9].field_c) {
                    break L2;
                  } else {
                    var2_int += 8;
                    break L2;
                  }
                }
                L3: {
                  if (mc.field_a[11].field_c) {
                    var2_int += 8;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (!nn.a(-64)) {
                    var2_int += 88;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackOut_20_0 = 2 * var2_int / 3;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                L5: {
                  if (ge.field_c[var3[var4]].field_b.b((byte) 58)) {
                    var2_int += 8;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (ge.field_c[var3[var4]].field_z.b((byte) 58)) {
                    var2_int += 8;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("ce.E(").append(-14646).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    ce(int param0, float param1) {
        ((ce) this).field_c = 0;
        ((ce) this).field_i = 1;
        ((ce) this).field_h = param0;
        ((ce) this).field_k = param1;
        ((ce) this).field_p = o.a((byte) 50);
        ((ce) this).field_o = o.a((byte) 96);
        ((ce) this).field_s = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[4];
    }
}
