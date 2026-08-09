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
            String var2 = (String) null;
            wd.a((byte) -5, (String) null);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static us a(byte param0, String param1) {
        RuntimeException var2 = null;
        us stackIn_2_0 = null;
        us stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_7_0 = gva.field_b;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (us) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("wd.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        ska var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        eq var8 = null;
        bg var9 = null;
        ue var10 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param4.d((byte) -87, param5);
              var6_int = param1;
              if (var6_int != 0) {
                if (1 != var6_int) {
                  if ((var6_int ^ -1) == -3) {
                    param4.a((byte) -3, 10);
                    param4.h(3, 0);
                    param4.a((byte) 83, (nv) (new eq(param3, param5)));
                    param4.e(true, 117);
                    param4.g(119, 1);
                    param4.a(1, (byte) -12, true);
                    param4.b(false, 11468);
                    param4.b((byte) 17, false);
                    break L1;
                  } else {
                    if (-4 == (var6_int ^ -1)) {
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
                    } else {
                      if (-5 != (var6_int ^ -1)) {
                        if (var6_int == 5) {
                          param4.a((byte) -3, 10);
                          param4.h(3, 0);
                          param4.a((byte) 83, (nv) (new eq(param3, param5)));
                          param4.a((byte) 83, (nv) (new ov(param3, param5)));
                          param4.a(new pt(param3, param5), 0);
                          break L1;
                        } else {
                          if ((var6_int ^ -1) == -7) {
                            param4.a((byte) -3, 20);
                            param4.h(3, 0);
                            param4.a((byte) 83, (nv) (new rea(param3, param5)));
                            var9 = new bg(param3, param5);
                            param4.a(var9, 0);
                            var9.c(124, 0);
                            break L1;
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
                      } else {
                        param4.a((byte) -3, 10);
                        param4.h(3, 0);
                        param4.a((byte) 83, (nv) (new eq(param3, param5)));
                        var6 = new ska(param3, param5);
                        var6.a(ci.a(2, -1), (byte) 100);
                        param4.a((byte) 83, (nv) (var6));
                        param4.a(new spa(param3, param5), 0);
                        break L1;
                      }
                    }
                  }
                } else {
                  param4.a((byte) -3, 10);
                  param4.h(3, 0);
                  param4.a((byte) 83, (nv) (new eq(param3, param5)));
                  param4.b((byte) 17, true);
                  break L1;
                }
              } else {
                param4.a((byte) 83, (nv) (new mo(param3, param5)));
                break L1;
              }
            }
            L2: {
              if (param0 <= -85) {
                break L2;
              } else {
                field_c = (jpa) null;
                break L2;
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
          L3: {
            var6_ref = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var6_ref);

            stackIn_28_1 = new StringBuilder().append("wd.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L3;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param4 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L4;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ',' + param5 + ')');
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
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
                  stackIn_14_0 = param7;
                  break L4;
                } else {
                  stackIn_14_0 = param6;
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
            stackIn_26_0 = (RuntimeException) (var8);

            stackIn_26_1 = new StringBuilder().append("wd.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final void a(kh param0, boolean param1) {
        try {
            this.field_b = uma.a(5, param0, -26803);
            if (param1) {
                this.field_d = (hca) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int[] var17 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
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
                    field_c = (jpa) null;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_9_0 = null;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  jaggl.OpenGL.glBindProgramARB(param3, 0);
                  stackIn_11_0 = new mf(param1, param3, var4_int);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = (mf) null;
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
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("wd.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param3 + ')');
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
