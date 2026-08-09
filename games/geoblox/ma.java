/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends hf {
    int field_h;
    long field_f;
    byte[] field_g;

    final static void a(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            var5 = uh.field_x;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            if (param0 == -35) {
              L1: while (true) {
                if (var2 >= var3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  incrementValue$16 = var2;
                  var2++;
                  var5[incrementValue$16] = 0;
                  incrementValue$17 = var2;
                  var2++;
                  var5[incrementValue$17] = 0;
                  incrementValue$18 = var2;
                  var2++;
                  var5[incrementValue$18] = 0;
                  incrementValue$19 = var2;
                  var2++;
                  var5[incrementValue$19] = 0;
                  incrementValue$20 = var2;
                  var2++;
                  var5[incrementValue$20] = 0;
                  incrementValue$21 = var2;
                  var2++;
                  var5[incrementValue$21] = 0;
                  incrementValue$22 = var2;
                  var2++;
                  var5[incrementValue$22] = 0;
                  incrementValue$23 = var2;
                  var2++;
                  var5[incrementValue$23] = 0;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "ma.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(boolean param0, float param1, ja param2) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ma.b(-91);
                break L1;
              }
            }
            stackIn_3_0 = aa.a(wd.field_b, 0, 0, vf.field_L, -wd.field_a + ng.field_G + -(vf.field_L.field_s >> 1323895489), -wd.field_d + -(vf.field_L.field_o >> -1840501887) + td.field_E);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ma.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int b(int param0) {
        gb.field_b.a((byte) -65);
        if (param0 != 15869) {
            return 61;
        }
        if (!wg.field_i.a((byte) 95)) {
            return ge.a((byte) -74);
        }
        return 0;
    }

    final static boolean c(byte param0) {
        int var1 = 39 / ((param0 - 18) / 54);
        return fa.field_b > fj.field_m ? true : false;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, dm[] param5) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        var22 = Geoblox.field_C;
        try {
          L0: {
            if (param5 != null) {
              L1: {
                if (param4 <= 0) {
                  break L1;
                } else {
                  if (0 >= param2) {
                    break L1;
                  } else {
                    L2: {
                      if (param5[3] == null) {
                        stackIn_10_0 = 0;
                        break L2;
                      } else {
                        stackIn_10_0 = param5[3].field_s;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (null == param5[5]) {
                        stackIn_13_0 = 0;
                        break L3;
                      } else {
                        stackIn_13_0 = param5[5].field_s;
                        break L3;
                      }
                    }
                    var7 = stackIn_13_0;
                    if (param3 == -92) {
                      L4: {
                        if (null != param5[1]) {
                          stackIn_18_0 = param5[1].field_o;
                          break L4;
                        } else {
                          stackIn_18_0 = 0;
                          break L4;
                        }
                      }
                      L5: {
                        var8 = stackIn_18_0;
                        if (null != param5[7]) {
                          stackIn_21_0 = param5[7].field_o;
                          break L5;
                        } else {
                          stackIn_21_0 = 0;
                          break L5;
                        }
                      }
                      L6: {
                        var9 = stackIn_21_0;
                        var10 = param4 + param1;
                        var11 = param0 + param2;
                        var12 = param1 + var6_int;
                        var13 = var10 - var7;
                        var14 = param0 - -var8;
                        var15 = -var9 + var11;
                        var16 = var12;
                        var17 = var13;
                        if (var16 <= var17) {
                          break L6;
                        } else {
                          var17 = var6_int * param4 / (var6_int - -var7) + param1;
                          var16 = var6_int * param4 / (var6_int - -var7) + param1;
                          break L6;
                        }
                      }
                      L7: {
                        var18 = var14;
                        var19 = var15;
                        vb.a(hd.field_I);
                        if (var19 >= var18) {
                          break L7;
                        } else {
                          var19 = param2 * var8 / (var8 + var9) + param0;
                          var18 = param2 * var8 / (var8 + var9) + param0;
                          break L7;
                        }
                      }
                      L8: {
                        if (null == param5[0]) {
                          break L8;
                        } else {
                          vb.b(param1, param0, var16, var18);
                          param5[0].b(param1, param0);
                          vb.b(hd.field_I);
                          break L8;
                        }
                      }
                      L9: {
                        if (param5[2] != null) {
                          vb.b(var17, param0, var10, var18);
                          param5[2].b(var13, param0);
                          vb.b(hd.field_I);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (null != param5[6]) {
                          vb.b(param1, var19, var16, var11);
                          param5[6].b(param1, var15);
                          vb.b(hd.field_I);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (null != param5[8]) {
                          vb.b(var17, var19, var10, var11);
                          param5[8].b(var13, var15);
                          vb.b(hd.field_I);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (null == param5[1]) {
                          break L12;
                        } else {
                          if (param5[1].field_s != 0) {
                            vb.b(var16, param0, var17, var18);
                            var20 = var12;
                            L13: while (true) {
                              if (var13 <= var20) {
                                vb.b(hd.field_I);
                                break L12;
                              } else {
                                param5[1].b(var20, param0);
                                var20 = var20 + param5[1].field_s;
                                continue L13;
                              }
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        if (param5[7] == null) {
                          break L14;
                        } else {
                          if (0 != param5[7].field_s) {
                            vb.b(var16, var19, var17, var11);
                            var20 = var12;
                            L15: while (true) {
                              if (var20 >= var13) {
                                vb.b(hd.field_I);
                                break L14;
                              } else {
                                param5[7].b(var20, var15);
                                var20 = var20 + param5[7].field_s;
                                continue L15;
                              }
                            }
                          } else {
                            break L14;
                          }
                        }
                      }
                      L16: {
                        if (param5[3] == null) {
                          break L16;
                        } else {
                          if (0 != param5[3].field_o) {
                            vb.b(param1, var18, var16, var19);
                            var20 = var14;
                            L17: while (true) {
                              if (var15 <= var20) {
                                vb.b(hd.field_I);
                                break L16;
                              } else {
                                param5[3].b(param1, var20);
                                var20 = var20 + param5[3].field_o;
                                continue L17;
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      L18: {
                        if (param5[5] == null) {
                          break L18;
                        } else {
                          if (param5[5].field_o != 0) {
                            vb.b(var17, var18, var10, var19);
                            var20 = var14;
                            L19: while (true) {
                              if (var20 >= var15) {
                                vb.b(hd.field_I);
                                break L18;
                              } else {
                                param5[5].b(var13, var20);
                                var20 = var20 + param5[5].field_o;
                                continue L19;
                              }
                            }
                          } else {
                            break L18;
                          }
                        }
                      }
                      L20: {
                        if (param5[4] == null) {
                          break L20;
                        } else {
                          if (param5[4].field_s == 0) {
                            break L20;
                          } else {
                            if (0 == param5[4].field_o) {
                              break L20;
                            } else {
                              vb.b(var16, var18, var17, var19);
                              var20 = var14;
                              L21: while (true) {
                                if (var15 <= var20) {
                                  vb.b(hd.field_I);
                                  break L20;
                                } else {
                                  var21 = var12;
                                  L22: while (true) {
                                    if (var21 >= var13) {
                                      var20 = var20 + param5[4].field_o;
                                      continue L21;
                                    } else {
                                      param5[4].b(var21, var20);
                                      var21 = var21 + param5[4].field_s;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackIn_77_0 = (RuntimeException) (var6);

            stackIn_77_1 = new StringBuilder().append("ma.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L23;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L23;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static boolean a(rh param0, rh param1, rh param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param2.a(0)) {
                break L1;
              } else {
                if (!param2.a("commonui", (byte) -127)) {
                  break L1;
                } else {
                  L2: {
                    if (!param1.a(param3 + 11652)) {
                      break L2;
                    } else {
                      if (!param1.a("commonui", (byte) -124)) {
                        break L2;
                      } else {
                        if (param3 == -11652) {
                          L3: {
                            if (!param0.a(0)) {
                              break L3;
                            } else {
                              if (!param0.a("button.gif", (byte) -125)) {
                                break L3;
                              } else {
                                return true;
                              }
                            }
                          }
                          stackIn_17_0 = 0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          stackIn_12_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("ma.D(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    ma(long param0, int param1, byte[] param2) {
        try {
            this.field_h = param1;
            this.field_g = param2;
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ma.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
