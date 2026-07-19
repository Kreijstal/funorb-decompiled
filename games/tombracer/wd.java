/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd implements dv {
    private hca field_d;
    static jpa field_c;
    static String field_a;
    private int field_b;

    public static void a(int param0) {
        us discarded$0 = null;
        field_a = null;
        if (param0 != 3) {
            String var2 = (String) null;
            discarded$0 = wd.a((byte) -5, (String) null);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static us a(byte param0, String param1) {
        RuntimeException var2 = null;
        us stackIn_2_0 = null;
        us stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        us stackOut_6_0 = null;
        us stackOut_1_0 = null;
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
                  if (param1.equals(gva.field_b.a((byte) 106))) {
                    break L1;
                  } else {
                    gva.field_b = ai.a((byte) 120, param1);
                    break L1;
                  }
                }
              }
              stackOut_6_0 = gva.field_b;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (us) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("wd.B(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(byte param0, int param1, boolean param2, la param3, fsa param4, boolean param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        ska var6_ref = null;
        int var7 = 0;
        eq var8 = null;
        bg var9 = null;
        ue var10 = null;
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
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      param4.d((byte) -87, param5);
                      var6_int = param1;
                      if (var6_int != 0) {
                        break L5;
                      } else {
                        if (var7 == 0) {
                          param4.a((byte) 83, (nv) (new mo(param3, param5)));
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (1 != var6_int) {
                        break L6;
                      } else {
                        if (var7 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if ((var6_int ^ -1) == -3) {
                      break L3;
                    } else {
                      if (-4 == (var6_int ^ -1)) {
                        break L2;
                      } else {
                        L7: {
                          if (-5 != (var6_int ^ -1)) {
                            break L7;
                          } else {
                            if (var7 == 0) {
                              param4.a((byte) -3, 10);
                              param4.h(3, 0);
                              param4.a((byte) 83, (nv) (new eq(param3, param5)));
                              var6_ref = new ska(param3, param5);
                              var6_ref.a(ci.a(2, -1), (byte) 100);
                              param4.a((byte) 83, (nv) (var6_ref));
                              param4.a(new spa(param3, param5), 0);
                              break L1;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (var6_int == 5) {
                            param4.a((byte) -3, 10);
                            param4.h(3, 0);
                            param4.a((byte) 83, (nv) (new eq(param3, param5)));
                            param4.a((byte) 83, (nv) (new ov(param3, param5)));
                            param4.a(new pt(param3, param5), 0);
                            if (var7 == 0) {
                              break L1;
                            } else {
                              break L8;
                            }
                          } else {
                            if ((var6_int ^ -1) == -7) {
                              break L8;
                            } else {
                              if ((var6_int ^ -1) == -8) {
                                param4.a((byte) -3, 2);
                                var10 = new ue(param3, param5);
                                var10.a(0, false);
                                param4.a((byte) 83, (nv) (var10));
                                param4.b(false, 11468);
                                param4.b((byte) 17, false);
                                break L1;
                              } else {
                                break L1;
                              }
                            }
                          }
                        }
                        param4.a((byte) -3, 20);
                        param4.h(3, 0);
                        param4.a((byte) 83, (nv) (new rea(param3, param5)));
                        var9 = new bg(param3, param5);
                        param4.a(var9, 0);
                        var9.c(124, 0);
                        break L1;
                      }
                    }
                  }
                  param4.a((byte) -3, 10);
                  param4.h(3, 0);
                  param4.a((byte) 83, (nv) (new eq(param3, param5)));
                  param4.b((byte) 17, true);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                param4.a((byte) -3, 10);
                param4.h(3, 0);
                param4.a((byte) 83, (nv) (new eq(param3, param5)));
                param4.e(true, 117);
                param4.g(119, 1);
                param4.a(1, (byte) -12, true);
                param4.b(false, 11468);
                param4.b((byte) 17, false);
                if (var7 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              param4.a((byte) -3, 20);
              param4.h(3, 0);
              var8 = new eq(param3, param5);
              param4.a(3, (byte) -12, true);
              var8.b((byte) -107, true);
              param4.a((byte) 83, (nv) (var8));
              param4.a(new wi(param3, 131072, 0, 0, param5), 0);
              param4.b((byte) 17, false);
              param4.b(false, 11468);
              break L1;
            }
            L9: {
              if (param0 <= -85) {
                break L9;
              } else {
                field_c = (jpa) null;
                break L9;
              }
            }
            if (!param2) {
              break L0;
            } else {
              param4.c(437453352, true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var6);
            stackOut_31_1 = new StringBuilder().append("wd.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          L11: {
            stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param4 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L11;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param5 + ')');
        }
    }

    final int b(int param0) {
        if (param0 <= 52) {
            wd.a(72);
            return this.field_b;
        }
        return this.field_b;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
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
        int[] var29 = null;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
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
                var29 = (int[]) null;
                wd.a(127, 113, -99, -33, (int[]) null, 112, 62, 15);
                break L2;
              }
            }
            L3: {
              if (-1 <= (param7 ^ -1)) {
                break L3;
              } else {
                if (cla.a(9181, param7)) {
                  break L3;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            if (-32994 == (param1 ^ -1)) {
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
              var10 = param6 >> -1338254143;
              var11 = param7 >> 239271617;
              var12 = param4;
              var13 = new int[var10 * var11];
              L5: while (true) {
                jaggl.OpenGL.glTexImage2Di(param0, var8_int, param2, param6, param7, 0, param1, param5, var12, 0);
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                L6: while (true) {
                  L7: {
                    if (stackIn_16_0 >= var9) {
                      break L7;
                    } else {
                      var15 = 0;
                      var24 = 0;
                      var25 = param6 + var24;
                      if (var28 == 0) {
                        var26 = 0;
                        L8: while (true) {
                          L9: {
                            if (var11 <= var26) {
                              break L9;
                            } else {
                              stackOut_21_0 = 0;
                              stackIn_16_0 = stackOut_21_0;
                              stackIn_22_0 = stackOut_21_0;
                              if (var28 != 0) {
                                continue L6;
                              } else {
                                var27 = stackIn_22_0;
                                L10: while (true) {
                                  L11: {
                                    if (var10 <= var27) {
                                      var25 = var25 + param6;
                                      var24 = var24 + param6;
                                      var26++;
                                      break L11;
                                    } else {
                                      incrementValue$5 = var24;
                                      var24++;
                                      var16 = var12[incrementValue$5];
                                      incrementValue$6 = var24;
                                      var24++;
                                      var17 = var12[incrementValue$6];
                                      incrementValue$7 = var25;
                                      var25++;
                                      var18 = var12[incrementValue$7];
                                      incrementValue$8 = var25;
                                      var25++;
                                      var19 = var12[incrementValue$8];
                                      var23 = 255 & var16 >> 1429214680;
                                      var22 = 255 & var16;
                                      var21 = var16 >> -356988376 & 255;
                                      var20 = (var16 & 16742997) >> 182455760;
                                      var21 = var21 + (var17 >> -1804776696 & 255);
                                      var23 = var23 + (255 & var17 >> -586128008);
                                      var20 = var20 + ((var17 & 16776900) >> -137091056);
                                      var22 = var22 + (var17 & 255);
                                      var22 = var22 + (255 & var18);
                                      var23 = var23 + (255 & var18 >> -2138789608);
                                      var20 = var20 + ((16756606 & var18) >> -1510509584);
                                      var21 = var21 + (var18 >> 2092293512 & 255);
                                      var23 = var23 + (var19 >> -734945736 & 255);
                                      var21 = var21 + ((var19 & 65349) >> 1672203720);
                                      var22 = var22 + (var19 & 255);
                                      var20 = var20 + ((16764137 & var19) >> 351806640);
                                      incrementValue$9 = var15;
                                      var15++;
                                      var13[incrementValue$9] = fh.a(sea.c(1020, var22) >> -250326430, fh.a(fh.a(sea.c(var23 << 842548214, -16777216), sea.c(1020, var20) << -540414578), sea.c(var21 << -1034575738, 65280)));
                                      var27++;
                                      if (var28 != 0) {
                                        break L11;
                                      } else {
                                        continue L10;
                                      }
                                    }
                                  }
                                  if (var28 == 0) {
                                    continue L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                          var14 = var13;
                          var13 = var12;
                          var12 = var14;
                          param7 = var11;
                          param6 = var10;
                          var9 = var9 >> 1;
                          var8_int++;
                          var11 = var11 >> 1;
                          var10 = var10 >> 1;
                          if (var28 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  break L0;
                }
              }
            } else {
              throw new IllegalArgumentException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var8 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var8);
            stackOut_31_1 = new StringBuilder().append("wd.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param4 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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
              this.field_b = uma.a(5, param0, -26803);
              if (!param1) {
                break L1;
              } else {
                this.field_d = (hca) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("wd.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int[] var17 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7_int = param3 + param0;
            var8 = param6 + -param0;
            var11 = param3;
            L1: while (true) {
              L2: {
                if (var7_int <= var11) {
                  stackOut_6_0 = param0;
                  stackOut_6_1 = param4;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L2;
                } else {
                  stackOut_3_0 = -55;
                  stackOut_3_1 = param2;
                  stackIn_7_0 = stackOut_3_0;
                  stackIn_7_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (var13 != 0) {
                    break L2;
                  } else {
                    nra.a((byte) stackIn_4_0, stackIn_4_1, param1, vaa.field_a[var11], param4);
                    var11++;
                    continue L1;
                  }
                }
              }
              L3: {
                var9 = stackIn_7_0 + stackIn_7_1;
                if (param5 == 27) {
                  break L3;
                } else {
                  field_c = (jpa) null;
                  break L3;
                }
              }
              var10 = param1 + -param0;
              var11 = param6;
              L4: while (true) {
                L5: {
                  if (var8 >= var11) {
                    var11 = var7_int;
                    break L5;
                  } else {
                    nra.a((byte) -55, param2, param1, vaa.field_a[var11], param4);
                    var11--;
                    if (var13 != 0) {
                      break L5;
                    } else {
                      continue L4;
                    }
                  }
                }
                L6: while (true) {
                  if (var8 < var11) {
                    break L0;
                  } else {
                    var17 = vaa.field_a[var11];
                    nra.a((byte) -55, param2, var9, var17, param4);
                    nra.a((byte) -55, param2, param1, var17, var10);
                    var11++;
                    if (var13 == 0) {
                      continue L6;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "wd.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0, hca param1) {
        if (param0 != 11008) {
            return;
        }
        try {
            this.field_d = param1;
            this.a(this.field_b, (byte) 37);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wd.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    wd() {
    }

    final void a(int param0, byte param1) {
        this.field_b = param0;
        if (param1 == 37) {
          if (null != this.field_d) {
            if (this.field_d.n((byte) -84) != null) {
              this.field_d.n((byte) -115).a(param0, 1);
              this.field_d.n((byte) -82).a(26, 0, true);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          wd.a(-67, 85, 11, -69, 5, (byte) -38, -52);
          if (null != this.field_d) {
            if (this.field_d.n((byte) -84) == null) {
              return;
            } else {
              this.field_d.n((byte) -115).a(param0, 1);
              this.field_d.n((byte) -82).a(26, 0, true);
              return;
            }
          } else {
            return;
          }
        }
    }

    wd(hca param0) {
        try {
            this.field_d = param0;
            this.field_b = -1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static mf a(byte param0, kda param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        mf stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        mf stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        mf stackOut_10_0 = null;
        mf stackOut_4_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (param2 != null) {
              var4_int = jaggl.OpenGL.glGenProgramARB();
              jaggl.OpenGL.glBindProgramARB(param3, var4_int);
              if (param0 == -70) {
                jaggl.OpenGL.glProgramRawARB(param3, 34933, param2);
                jaggl.OpenGL.glGetIntegerv(34379, tq.field_a, 0);
                if (0 != (tq.field_a[0] ^ -1)) {
                  jaggl.OpenGL.glBindProgramARB(param3, 0);
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  jaggl.OpenGL.glBindProgramARB(param3, 0);
                  stackOut_10_0 = new mf(param1, param3, var4_int);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = (mf) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
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
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("wd.F(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          L2: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (mf) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    static {
        field_a = "Uh oh, you've been trapped forever in the Tortuous Temple of Torment! Press <img=16> to try again.";
    }
}
