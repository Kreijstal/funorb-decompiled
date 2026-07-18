/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd implements dv {
    private hca field_d;
    static jpa field_c;
    static String field_a;
    private int field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 3) {
            Object var2 = null;
            us discarded$0 = wd.a((byte) -5, (String) null);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static us a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        us stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        us stackOut_6_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 <= -11) {
              L1: {
                if (!gva.field_b.b(127)) {
                  break L1;
                } else {
                  if (param1.equals((Object) (Object) gva.field_b.a((byte) 106))) {
                    break L1;
                  } else {
                    gva.field_b = ai.a((byte) 120, param1);
                    break L1;
                  }
                }
              }
              stackOut_6_0 = gva.field_b;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (us) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("wd.B(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(byte param0, int param1, boolean param2, la param3, fsa param4, boolean param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        ska var6_ref = null;
        int var7 = 0;
        eq var8 = null;
        bg var9 = null;
        ue var10 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param4.d((byte) -87, false);
            var6_int = param1;
            if (var6_int != 0) {
              if (1 != var6_int) {
                if (var6_int == 2) {
                  param4.a((byte) -3, 10);
                  param4.h(3, 0);
                  param4.a((byte) 83, (nv) (Object) new eq(param3, false));
                  param4.e(true, 117);
                  param4.g(119, 1);
                  param4.a(1, (byte) -12, true);
                  param4.b(false, 11468);
                  param4.b((byte) 17, false);
                  break L0;
                } else {
                  if (var6_int == 3) {
                    param4.a((byte) -3, 20);
                    param4.h(3, 0);
                    var8 = new eq(param3, false);
                    param4.a(3, (byte) -12, true);
                    var8.b((byte) -107, true);
                    param4.a((byte) 83, (nv) (Object) var8);
                    param4.a((wda) (Object) new wi(param3, 131072, 0, 0, false), 0);
                    param4.b((byte) 17, false);
                    param4.b(false, 11468);
                    break L0;
                  } else {
                    if (var6_int != 4) {
                      if (var6_int == 5) {
                        param4.a((byte) -3, 10);
                        param4.h(3, 0);
                        param4.a((byte) 83, (nv) (Object) new eq(param3, false));
                        param4.a((byte) 83, (nv) (Object) new ov(param3, false));
                        param4.a((wda) (Object) new pt(param3, false), 0);
                        break L0;
                      } else {
                        if (var6_int == 6) {
                          param4.a((byte) -3, 20);
                          param4.h(3, 0);
                          param4.a((byte) 83, (nv) (Object) new rea(param3, false));
                          var9 = new bg(param3, false);
                          param4.a((wda) (Object) var9, 0);
                          var9.c(124, 0);
                          break L0;
                        } else {
                          if (var6_int == 7) {
                            param4.a((byte) -3, 2);
                            var10 = new ue(param3, false);
                            var10.a(0, false);
                            param4.a((byte) 83, (nv) (Object) var10);
                            param4.b(false, 11468);
                            param4.b((byte) 17, false);
                            break L0;
                          } else {
                            break L0;
                          }
                        }
                      }
                    } else {
                      param4.a((byte) -3, 10);
                      param4.h(3, 0);
                      param4.a((byte) 83, (nv) (Object) new eq(param3, false));
                      var6_ref = new ska(param3, false);
                      var6_ref.a(ci.a(2, -1), (byte) 100);
                      param4.a((byte) 83, (nv) (Object) var6_ref);
                      param4.a((wda) (Object) new spa(param3, false), 0);
                      break L0;
                    }
                  }
                }
              } else {
                param4.a((byte) -3, 10);
                param4.h(3, 0);
                param4.a((byte) 83, (nv) (Object) new eq(param3, false));
                param4.b((byte) 17, true);
                break L0;
              }
            } else {
              param4.a((byte) 83, (nv) (Object) new mo(param3, false));
              break L0;
            }
          }
          if (param0 <= -85) {
            param4.c(437453352, true);
            return;
          } else {
            field_c = null;
            param4.c(437453352, true);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("wd.C(").append(param0).append(',').append(param1).append(',').append(true).append(',');
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
              break L1;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L1;
            }
          }
          L2: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L2;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + false + ')');
        }
    }

    final int b(int param0) {
        if (param0 <= 52) {
            wd.a(72);
            return ((wd) this).field_b;
        }
        return ((wd) this).field_b;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        Object var29 = null;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var28 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 >= param6) {
                break L1;
              } else {
                if (cla.a(9181, param6)) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L2: {
              if (param3 > 49) {
                break L2;
              } else {
                var29 = null;
                wd.a(127, 113, -99, -33, (int[]) null, 112, 62, 15);
                break L2;
              }
            }
            L3: {
              if (param7 <= 0) {
                break L3;
              } else {
                if (cla.a(9181, param7)) {
                  break L3;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            if (param1 == 32993) {
              L4: {
                var8_int = 0;
                if (param7 <= param6) {
                  stackOut_13_0 = param7;
                  stackIn_14_0 = stackOut_13_0;
                  break L4;
                } else {
                  stackOut_12_0 = param6;
                  stackIn_14_0 = stackOut_12_0;
                  break L4;
                }
              }
              var9 = stackIn_14_0;
              var10 = param6 >> 1;
              var11 = param7 >> 1;
              var12 = param4;
              var13 = new int[var10 * var11];
              L5: while (true) {
                jaggl.OpenGL.glTexImage2Di(param0, var8_int, param2, param6, param7, 0, param1, param5, var12, 0);
                if (1 >= var9) {
                  break L0;
                } else {
                  var15 = 0;
                  var24 = 0;
                  var25 = param6 + var24;
                  var26 = 0;
                  L6: while (true) {
                    if (var11 <= var26) {
                      var14 = var13;
                      var13 = var12;
                      var12 = var14;
                      param7 = var11;
                      param6 = var10;
                      var9 = var9 >> 1;
                      var8_int++;
                      var11 = var11 >> 1;
                      var10 = var10 >> 1;
                      continue L5;
                    } else {
                      var27 = 0;
                      L7: while (true) {
                        if (var10 <= var27) {
                          var25 = var25 + param6;
                          var24 = var24 + param6;
                          var26++;
                          continue L6;
                        } else {
                          int incrementValue$5 = var24;
                          var24++;
                          var16 = var12[incrementValue$5];
                          int incrementValue$6 = var24;
                          var24++;
                          var17 = var12[incrementValue$6];
                          int incrementValue$7 = var25;
                          var25++;
                          var18 = var12[incrementValue$7];
                          int incrementValue$8 = var25;
                          var25++;
                          var19 = var12[incrementValue$8];
                          var23 = 255 & var16 >> 24;
                          var22 = 255 & var16;
                          var21 = var16 >> 8 & 255;
                          var20 = (var16 & 16742997) >> 16;
                          var21 = var21 + (var17 >> 8 & 255);
                          var23 = var23 + (255 & var17 >> 24);
                          var20 = var20 + ((var17 & 16776900) >> 16);
                          var22 = var22 + (var17 & 255);
                          var22 = var22 + (255 & var18);
                          var23 = var23 + (255 & var18 >> 24);
                          var20 = var20 + ((16756606 & var18) >> 16);
                          var21 = var21 + (var18 >> 8 & 255);
                          var23 = var23 + (var19 >> 24 & 255);
                          var21 = var21 + ((var19 & 65349) >> 8);
                          var22 = var22 + (var19 & 255);
                          var20 = var20 + ((16764137 & var19) >> 16);
                          int incrementValue$9 = var15;
                          var15++;
                          var13[incrementValue$9] = fh.a(sea.c(1020, var22) >> 2, fh.a(fh.a(sea.c(var23 << 22, -16777216), sea.c(1020, var20) << 14), sea.c(var21 << 6, 65280)));
                          var27++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              throw new IllegalArgumentException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var8 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var8;
            stackOut_24_1 = new StringBuilder().append("wd.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final void a(kh param0, boolean param1) {
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
              ((wd) this).field_b = uma.a(5, param0, -26803);
              if (!param1) {
                break L1;
              } else {
                ((wd) this).field_d = null;
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
            stackOut_3_1 = new StringBuilder().append("wd.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int[] var17 = null;
        RuntimeException decompiledCaughtException = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7_int = param3 + param0;
            var8 = param6 + -param0;
            var11 = param3;
            L1: while (true) {
              if (var7_int <= var11) {
                L2: {
                  var9 = param0 + param4;
                  if (param5 == 27) {
                    break L2;
                  } else {
                    field_c = null;
                    break L2;
                  }
                }
                var10 = param1 + -param0;
                var11 = param6;
                L3: while (true) {
                  if (var8 >= var11) {
                    var11 = var7_int;
                    L4: while (true) {
                      if (var8 < var11) {
                        break L0;
                      } else {
                        var17 = vaa.field_a[var11];
                        nra.a((byte) -55, param2, var9, var17, param4);
                        nra.a((byte) -55, param2, param1, var17, var10);
                        var11++;
                        continue L4;
                      }
                    }
                  } else {
                    nra.a((byte) -55, param2, param1, vaa.field_a[var11], param4);
                    var11--;
                    continue L3;
                  }
                }
              } else {
                nra.a((byte) -55, param2, param1, vaa.field_a[var11], param4);
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var7, "wd.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0, hca param1) {
        if (param0 != 11008) {
            return;
        }
        try {
            ((wd) this).field_d = param1;
            ((wd) this).a(((wd) this).field_b, (byte) 37);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wd.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    wd() {
    }

    final void a(int param0, byte param1) {
        ((wd) this).field_b = param0;
        if (param1 == 37) {
          if (null != ((wd) this).field_d) {
            if (((wd) this).field_d.n((byte) -84) != null) {
              ((wd) this).field_d.n((byte) -115).a(param0, 1);
              ((wd) this).field_d.n((byte) -82).a(26, 0, true);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          wd.a(-67, 85, 11, -69, 5, (byte) -38, -52);
          if (null != ((wd) this).field_d) {
            if (((wd) this).field_d.n((byte) -84) == null) {
              return;
            } else {
              ((wd) this).field_d.n((byte) -115).a(param0, 1);
              ((wd) this).field_d.n((byte) -82).a(26, 0, true);
              return;
            }
          } else {
            return;
          }
        }
    }

    wd(hca param0) {
        try {
            ((wd) this).field_d = param0;
            ((wd) this).field_b = -1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static mf a(byte param0, kda param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_8_0 = null;
        mf stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        mf stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param2 != null) {
              var4_int = jaggl.OpenGL.glGenProgramARB();
              jaggl.OpenGL.glBindProgramARB(34336, var4_int);
              jaggl.OpenGL.glProgramRawARB(34336, 34933, param2);
              jaggl.OpenGL.glGetIntegerv(34379, tq.field_a, 0);
              if (tq.field_a[0] != -1) {
                jaggl.OpenGL.glBindProgramARB(34336, 0);
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (mf) (Object) stackIn_8_0;
              } else {
                jaggl.OpenGL.glBindProgramARB(34336, 0);
                stackOut_9_0 = new mf(param1, 34336, var4_int);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("wd.F(").append(-70).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 34336 + ')');
        }
        return stackIn_10_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Uh oh, you've been trapped forever in the Tortuous Temple of Torment! Press <img=16> to try again.";
    }
}
