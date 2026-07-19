/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bp implements ed {
    private ji field_a;
    private boolean field_d;
    int field_h;
    on field_e;
    private int field_f;
    io field_g;
    iw field_c;
    private int field_b;

    final void a(int param0, int param1, int[] param2, int param3, int param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
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
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var26 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) >= param4) {
                break L1;
              } else {
                if (rm.a(param1, -108)) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L2: {
              if (-1 <= (param0 ^ -1)) {
                break L2;
              } else {
                if (!rm.a(param0, -127)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            if (this.field_c != nl.field_p) {
              throw new IllegalArgumentException("");
            } else {
              L3: {
                var6_int = 0;
                if (param0 <= param1) {
                  stackOut_13_0 = param0;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = param1;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              var7 = stackIn_14_0;
              var8 = param1 >> -1527941855;
              var9 = param0 >> -1750721919;
              var10 = param2;
              var11 = new int[var9 * var8];
              L4: while (true) {
                L5: {
                  L6: {
                    jaggl.OpenGL.glTexImage2Di(param3, var6_int, this.e(param4 + 101), param1, param0, 0, 32993, this.field_e.field_Ec, var10, 0);
                    if (var7 > 1) {
                      break L6;
                    } else {
                      if (var26 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var13 = 0;
                  var22 = 0;
                  var23 = var22 - -param1;
                  var12 = var11;
                  var24 = 0;
                  L7: while (true) {
                    L8: {
                      if (var9 <= var24) {
                        var11 = var10;
                        param0 = var9;
                        param1 = var8;
                        var10 = var12;
                        var6_int++;
                        var7 = var7 >> 1;
                        var8 = var8 >> 1;
                        stackOut_27_0 = var9 >> 1;
                        stackIn_28_0 = stackOut_27_0;
                        break L8;
                      } else {
                        stackOut_19_0 = 0;
                        stackIn_28_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var26 != 0) {
                          break L8;
                        } else {
                          var25 = stackIn_20_0;
                          L9: while (true) {
                            L10: {
                              if (var8 <= var25) {
                                var22 = var22 + param1;
                                var23 = var23 + param1;
                                var24++;
                                break L10;
                              } else {
                                incrementValue$5 = var22;
                                var22++;
                                var14 = var10[incrementValue$5];
                                incrementValue$6 = var23;
                                var23++;
                                var16 = var10[incrementValue$6];
                                incrementValue$7 = var22;
                                var22++;
                                var15 = var10[incrementValue$7];
                                var21 = 255 & var14 >> -579678952;
                                var18 = 255 & var14 >> 370863056;
                                var20 = 255 & var14;
                                incrementValue$8 = var23;
                                var23++;
                                var17 = var10[incrementValue$8];
                                var19 = (65493 & var14) >> 2074770600;
                                var20 = var20 + (255 & var15);
                                var18 = var18 + ((16770131 & var15) >> -585212752);
                                var21 = var21 + (var15 >> 263869080 & 255);
                                var19 = var19 + (var15 >> -1359596440 & 255);
                                var18 = var18 + (var16 >> 269135280 & 255);
                                var21 = var21 + (255 & var16 >> 1619277144);
                                var20 = var20 + (255 & var16);
                                var19 = var19 + (255 & var16 >> 917921640);
                                var20 = var20 + (255 & var17);
                                var19 = var19 + ((var17 & 65361) >> 882928968);
                                var18 = var18 + ((var17 & 16719727) >> 843582288);
                                var21 = var21 + (var17 >> -1688071080 & 255);
                                incrementValue$9 = var13;
                                var13++;
                                var11[incrementValue$9] = ic.a(eb.a(1020, var20) >> -1739142110, ic.a(eb.a(1020, var19) << 597537094, ic.a(eb.a(16711680, var18 << -1199202834), eb.a(var21, 1020) << -491897674)));
                                var25++;
                                if (var26 != 0) {
                                  break L10;
                                } else {
                                  continue L9;
                                }
                              }
                            }
                            continue L7;
                          }
                        }
                      }
                    }
                    var9 = stackIn_28_0;
                    if (var26 == 0) {
                      continue L4;
                    } else {
                      break L5;
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var6);
            stackOut_30_1 = new StringBuilder().append("bp.A(").append(param0).append(',').append(param1).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int g(int param0) {
        if (2 <= mp.field_a) {
          if (param0 == 14296) {
            if (dk.field_c == 0) {
              if (!wd.field_j.b((byte) 127)) {
                return 20;
              } else {
                if (wd.field_j.a("commonui", 100)) {
                  if (eb.field_f.b((byte) 127)) {
                    if (eb.field_f.a("commonui", 100)) {
                      if (!hw.field_a.b((byte) 127)) {
                        return 70;
                      } else {
                        if (hw.field_a.a(true)) {
                          return 100;
                        } else {
                          return 80;
                        }
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                } else {
                  return 40;
                }
              }
            } else {
              if (null == hd.field_H) {
                if (!wd.field_j.b((byte) 127)) {
                  return 43;
                } else {
                  if (wd.field_j.a("commonui", param0 ^ 14268)) {
                    if (!eb.field_f.b((byte) 127)) {
                      return 71;
                    } else {
                      if (eb.field_f.a("commonui", 100)) {
                        if (!hw.field_a.b((byte) 127)) {
                          return 82;
                        } else {
                          if (hw.field_a.a(true)) {
                            return 100;
                          } else {
                            return 86;
                          }
                        }
                      } else {
                        return 80;
                      }
                    }
                  } else {
                    return 57;
                  }
                }
              } else {
                if (hd.field_H.b((byte) 127)) {
                  if (hd.field_H.b((byte) -98, "")) {
                    if (hd.field_H.a("", 100)) {
                      if (!wd.field_j.b((byte) 127)) {
                        return 43;
                      } else {
                        if (wd.field_j.a("commonui", param0 ^ 14268)) {
                          if (!eb.field_f.b((byte) 127)) {
                            return 71;
                          } else {
                            if (eb.field_f.a("commonui", 100)) {
                              if (!hw.field_a.b((byte) 127)) {
                                return 82;
                              } else {
                                if (hw.field_a.a(true)) {
                                  return 100;
                                } else {
                                  return 86;
                                }
                              }
                            } else {
                              return 80;
                            }
                          }
                        } else {
                          return 57;
                        }
                      }
                    } else {
                      return 29;
                    }
                  } else {
                    return 29;
                  }
                } else {
                  return 14;
                }
              }
            }
          } else {
            return -117;
          }
        } else {
          return 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, float[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float var14 = 0.0f;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 <= 0) {
                break L1;
              } else {
                if (!rm.a(param3, -102)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (-1 <= (param1 ^ -1)) {
                break L2;
              } else {
                if (!rm.a(param1, -102)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var6_int = this.field_c.field_c;
              var7 = 0;
              if (param1 <= param3) {
                stackOut_11_0 = param1;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = param3;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            var8 = stackIn_12_0;
            var9 = param3 >> -1590570239;
            if (param2 < -115) {
              var10 = param1 >> -1865914367;
              var11 = param4;
              var12 = new float[var6_int * (var9 * var10)];
              L4: while (true) {
                L5: {
                  L6: {
                    jaggl.OpenGL.glTexImage2Df(param0, var7, this.e(-107), param3, param1, 0, te.a(-21339, this.field_c), 5126, var11, 0);
                    if (var8 > 1) {
                      break L6;
                    } else {
                      if (var22 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var15 = var6_int * param3;
                  var13 = var12;
                  var16 = 0;
                  L7: while (true) {
                    stackOut_18_0 = var6_int;
                    stackIn_19_0 = stackOut_18_0;
                    L8: while (true) {
                      L9: {
                        if (stackIn_19_0 <= var16) {
                          var12 = var11;
                          param1 = var10;
                          var11 = var13;
                          param3 = var9;
                          var10 = var10 >> 1;
                          var9 = var9 >> 1;
                          stackOut_32_0 = var8 >> 1;
                          stackIn_33_0 = stackOut_32_0;
                          break L9;
                        } else {
                          var17 = var16;
                          var18 = var16;
                          var19 = var15 + var18;
                          stackOut_20_0 = 0;
                          stackIn_33_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (var22 != 0) {
                            break L9;
                          } else {
                            var20 = stackIn_21_0;
                            L10: while (true) {
                              if (var20 >= var10) {
                                var16++;
                                continue L7;
                              } else {
                                stackOut_23_0 = 0;
                                stackIn_19_0 = stackOut_23_0;
                                stackIn_24_0 = stackOut_23_0;
                                if (var22 != 0) {
                                  continue L8;
                                } else {
                                  var21 = stackIn_24_0;
                                  L11: while (true) {
                                    L12: {
                                      if (var9 <= var21) {
                                        var18 = var18 + var15;
                                        var19 = var19 + var15;
                                        var20++;
                                        break L12;
                                      } else {
                                        var14 = param4[var18];
                                        var18 = var18 + var6_int;
                                        var14 = var14 + param4[var18];
                                        var18 = var18 + var6_int;
                                        var14 = var14 + param4[var19];
                                        var19 = var19 + var6_int;
                                        var14 = var14 + param4[var19];
                                        var12[var17] = var14 * 0.25f;
                                        var19 = var19 + var6_int;
                                        var17 = var17 + var6_int;
                                        var21++;
                                        if (var22 != 0) {
                                          break L12;
                                        } else {
                                          continue L11;
                                        }
                                      }
                                    }
                                    continue L10;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var8 = stackIn_33_0;
                      var7++;
                      if (var22 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var6 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var6);
            stackOut_35_1 = new StringBuilder().append("bp.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param4 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L13;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L13;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 <= (param1 ^ -1)) {
                break L1;
              } else {
                if (rm.a(param1, -102)) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L2: {
              if (-1 <= (param3 ^ -1)) {
                break L2;
              } else {
                if (!rm.a(param3, -116)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var6_int = this.field_c.field_c;
              if (param4 >= 33) {
                break L3;
              } else {
                var23 = (int[]) null;
                this.a(30, -125, (int[]) null, 92, 74);
                break L3;
              }
            }
            L4: {
              var7 = 0;
              if (param3 <= param1) {
                stackOut_12_0 = param3;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = param1;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            var8 = stackIn_13_0;
            var9 = param1 >> 1356208065;
            var10 = param3 >> -681452095;
            var11 = param0;
            var12 = new byte[var6_int * (var10 * var9)];
            L5: while (true) {
              jaggl.OpenGL.glTexImage2Dub(param2, var7, this.e(-89), param1, param3, 0, te.a(-21339, this.field_c), 5121, var11, 0);
              stackOut_14_0 = 1;
              stackIn_15_0 = stackOut_14_0;
              L6: while (true) {
                L7: {
                  L8: {
                    if (stackIn_15_0 < var8) {
                      break L8;
                    } else {
                      if (var22 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var15 = var6_int * param1;
                  var16 = 0;
                  L9: while (true) {
                    stackOut_18_0 = var6_int ^ -1;
                    stackIn_19_0 = stackOut_18_0;
                    L10: while (true) {
                      L11: {
                        if (stackIn_19_0 >= (var16 ^ -1)) {
                          break L11;
                        } else {
                          var17 = var16;
                          var18 = var16;
                          var19 = var18 - -var15;
                          stackOut_20_0 = 0;
                          stackIn_15_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (var22 != 0) {
                            continue L6;
                          } else {
                            var20 = stackIn_21_0;
                            L12: while (true) {
                              L13: {
                                if (var20 >= var10) {
                                  break L13;
                                } else {
                                  stackOut_23_0 = 0;
                                  stackIn_19_0 = stackOut_23_0;
                                  stackIn_24_0 = stackOut_23_0;
                                  if (var22 != 0) {
                                    continue L10;
                                  } else {
                                    var21 = stackIn_24_0;
                                    L14: while (true) {
                                      L15: {
                                        if (var21 >= var9) {
                                          var19 = var19 + var15;
                                          var18 = var18 + var15;
                                          var20++;
                                          break L15;
                                        } else {
                                          var14 = param0[var18];
                                          var18 = var18 + var6_int;
                                          var14 = var14 + param0[var18];
                                          var14 = var14 + param0[var19];
                                          var18 = var18 + var6_int;
                                          var19 = var19 + var6_int;
                                          var14 = var14 + param0[var19];
                                          var12[var17] = (byte)(var14 >> 1544912706);
                                          var19 = var19 + var6_int;
                                          var17 = var17 + var6_int;
                                          var21++;
                                          if (var22 != 0) {
                                            break L15;
                                          } else {
                                            continue L14;
                                          }
                                        }
                                      }
                                      if (var22 == 0) {
                                        continue L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              var16++;
                              if (var22 == 0) {
                                continue L9;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                      }
                      var13 = var12;
                      var12 = var11;
                      var11 = var13;
                      param1 = var9;
                      param3 = var10;
                      var9 = var9 >> 1;
                      var7++;
                      var8 = var8 >> 1;
                      var10 = var10 >> 1;
                      if (var22 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var6 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var6);
            stackOut_34_1 = new StringBuilder().append("bp.L(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L16;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L16;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.d(22989);
        super.finalize();
    }

    private final void b(int param0, int param1) {
        this.field_e.field_Cb = this.field_e.field_Cb - param0;
        if (param1 != 25109) {
          this.field_c = (iw) null;
          this.field_e.field_Cb = this.field_e.field_Cb + this.f(3);
          return;
        } else {
          this.field_e.field_Cb = this.field_e.field_Cb + this.f(3);
          return;
        }
    }

    public void a(ji param0, int param1) {
        RuntimeException var3 = null;
        ji var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 15149) {
                break L1;
              } else {
                var4 = (ji) null;
                this.a((ji) null, 12);
                break L1;
              }
            }
            if (this.field_a != param0) {
              this.field_a = param0;
              this.b((byte) -122);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("bp.J(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        L0: {
          L1: {
            this.field_e.a((ed) (this), 112);
            if (ao.field_y != this.field_a) {
              break L1;
            } else {
              L2: {
                stackOut_1_0 = this.field_h;
                stackOut_1_1 = 10241;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_2_0 = stackOut_1_0;
                stackIn_2_1 = stackOut_1_1;
                if (!this.field_d) {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = 9729;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  break L2;
                } else {
                  stackOut_2_0 = stackIn_2_0;
                  stackOut_2_1 = stackIn_2_1;
                  stackOut_2_2 = 9987;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_4_2 = stackOut_2_2;
                  break L2;
                }
              }
              jaggl.OpenGL.glTexParameteri(stackIn_4_0, stackIn_4_1, stackIn_4_2);
              jaggl.OpenGL.glTexParameteri(this.field_h, 10240, 9729);
              if (!Sumoblitz.field_L) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L3: {
            stackOut_5_0 = this.field_h;
            stackOut_5_1 = 10241;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (this.field_d) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = 9984;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 9728;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          jaggl.OpenGL.glTexParameteri(stackIn_8_0, stackIn_8_1, stackIn_8_2);
          jaggl.OpenGL.glTexParameteri(this.field_h, 10240, 9728);
          break L0;
        }
        var2 = 110 / ((param0 - -69) / 49);
    }

    final int e(int param0) {
        int var2 = 0;
        var2 = -58 / ((param0 - 57) / 34);
        if (this.field_g == io.field_g) {
          if (this.field_c != m.field_X) {
            if (this.field_c != nl.field_p) {
              if (te.field_f != this.field_c) {
                if (kd.field_b != this.field_c) {
                  if (ps.field_c != this.field_c) {
                    if (rg.field_A == this.field_c) {
                      return 6145;
                    } else {
                      throw new IllegalStateException();
                    }
                  } else {
                    return 6410;
                  }
                } else {
                  return 6409;
                }
              } else {
                return 6406;
              }
            } else {
              return 6408;
            }
          } else {
            return 6407;
          }
        } else {
          if (io.field_e == this.field_g) {
            if (m.field_X != this.field_c) {
              if (nl.field_p != this.field_c) {
                if (this.field_c != te.field_f) {
                  if (kd.field_b != this.field_c) {
                    if (ps.field_c != this.field_c) {
                      if (this.field_c == rg.field_A) {
                        return 6145;
                      } else {
                        throw new IllegalStateException();
                      }
                    } else {
                      return 34847;
                    }
                  } else {
                    return 34846;
                  }
                } else {
                  return 34844;
                }
              } else {
                return 34842;
              }
            } else {
              return 34843;
            }
          } else {
            if (this.field_g == io.field_d) {
              if (this.field_c != m.field_X) {
                if (nl.field_p != this.field_c) {
                  if (this.field_c != te.field_f) {
                    if (kd.field_b != this.field_c) {
                      if (this.field_c != ps.field_c) {
                        if (this.field_c != rg.field_A) {
                          throw new IllegalStateException();
                        } else {
                          return 6145;
                        }
                      } else {
                        return 34841;
                      }
                    } else {
                      return 34840;
                    }
                  } else {
                    return 34838;
                  }
                } else {
                  return 34836;
                }
              } else {
                return 34837;
              }
            } else {
              throw new IllegalStateException();
            }
          }
        }
    }

    private final void d(int param0) {
        int[] var3 = null;
        L0: {
          if ((this.field_f ^ -1) < -1) {
            this.field_e.a(this.f(3), this.field_f, (byte) 23);
            this.field_f = 0;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 22989) {
          var3 = (int[]) null;
          this.a(-4, 71, (int[]) null, -10, -31);
          return;
        } else {
          return;
        }
    }

    public void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = this.field_e.t(param0 + -8983);
        var3 = this.field_e.field_Hc[var2];
        if (this.field_h == var3) {
          jaggl.OpenGL.glBindTexture(this.field_h, this.field_f);
          if (param0 != 8905) {
            this.a(-104);
            return;
          } else {
            return;
          }
        } else {
          if (var3 == 0) {
            jaggl.OpenGL.glEnable(this.field_h);
            this.field_e.field_Hc[var2] = this.field_h;
            jaggl.OpenGL.glBindTexture(this.field_h, this.field_f);
            if (param0 == 8905) {
              return;
            } else {
              this.a(-104);
              return;
            }
          } else {
            jaggl.OpenGL.glBindTexture(var3, 0);
            jaggl.OpenGL.glDisable(var3);
            jaggl.OpenGL.glEnable(this.field_h);
            this.field_e.field_Hc[var2] = this.field_h;
            jaggl.OpenGL.glBindTexture(this.field_h, this.field_f);
            if (param0 == 8905) {
              return;
            } else {
              this.a(-104);
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        pj.field_p = 1000000000L / (long)param0;
        if (param1 != 26175) {
            bp.a(92, -56);
        }
    }

    bp(on param0, int param1, iw param2, io param3, int param4, boolean param5) {
        this.field_a = ao.field_y;
        try {
            this.field_g = param3;
            this.field_d = param5 ? true : false;
            this.field_h = param1;
            this.field_e = param0;
            this.field_c = param2;
            this.field_b = param4;
            jaggl.OpenGL.glGenTextures(1, dq.field_s, 0);
            this.field_f = dq.field_s[0];
            this.b((byte) 78);
            this.b(0, 25109);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "bp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final int f(int param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = this.field_g.field_j * this.field_c.field_c * this.field_b;
        if (param0 != 3) {
          L0: {
            this.field_c = (iw) null;
            if (!this.field_d) {
              stackOut_7_0 = var2;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 4 * var2 / 3;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (!this.field_d) {
              stackOut_3_0 = var2;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 4 * var2 / 3;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    static {
    }
}
