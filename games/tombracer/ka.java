/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ka {
    static float[] field_b;
    boolean field_a;
    private static String[] field_c;

    abstract void FA(int param0);

    abstract void I(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7);

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != -11) {
            ka.a((byte) -43);
        }
    }

    abstract void b();

    abstract void O(int param0, int param1, int param2);

    final static pr a(byte param0, byte[] param1, int param2, kda param3) {
        RuntimeException var4 = null;
        long var4_long = 0L;
        int var6 = 0;
        byte[] var11 = null;
        Object stackIn_14_0 = null;
        pr stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        pr stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (param1.length != 0) {
                L1: {
                  var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param2);
                  jaggl.OpenGL.glShaderSourceRawARB(var4_long, param1);
                  jaggl.OpenGL.glCompileShaderARB(var4_long);
                  var6 = 35 / ((param0 - -29) / 46);
                  jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, ita.field_a, 0);
                  if (ita.field_a[0] == 0) {
                    L2: {
                      if (-1 != (ita.field_a[0] ^ -1)) {
                        break L2;
                      } else {
                        System.out.println("Shader compile failed:");
                        break L2;
                      }
                    }
                    L3: {
                      jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, ita.field_a, 1);
                      if ((ita.field_a[1] ^ -1) >= -2) {
                        break L3;
                      } else {
                        var11 = new byte[ita.field_a[1]];
                        jaggl.OpenGL.glGetInfoLogARB(var4_long, ita.field_a[1], ita.field_a, 0, var11, 0);
                        System.out.println(new String(var11));
                        break L3;
                      }
                    }
                    if (ita.field_a[0] == 0) {
                      jaggl.OpenGL.glDeleteObjectARB(var4_long);
                      stackOut_13_0 = null;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                stackOut_15_0 = new pr(param3, var4_long, param2);
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("ka.W(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (pr) ((Object) stackIn_14_0);
        } else {
          return stackIn_16_0;
        }
    }

    abstract void a(gda param0, el param1, int param2);

    abstract ka a(byte param0, int param1, boolean param2);

    abstract void a();

    abstract void a(gda param0, el param1, int param2, int param3);

    private final void a(int[] param0, int param1, int param2, int[] param3, boolean param4, int param5, int param6, int param7, int param8, byte param9) {
        RuntimeException var11 = null;
        int var11_int = 0;
        int var12 = 0;
        el var13 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if ((param1 ^ -1) != -2) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (0 == param2) {
                        break L4;
                      } else {
                        if (-2 != (param2 ^ -1)) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var11_int = -param7;
                    param7 = param6;
                    param6 = var11_int;
                    if (var12 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if (-4 != (param2 ^ -1)) {
                      break L5;
                    } else {
                      var11_int = param7;
                      param7 = param6;
                      param6 = var11_int;
                      if (var12 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (param2 == 2) {
                    var11_int = param7;
                    param7 = 16383 & -param6;
                    param6 = 16383 & var11_int;
                    if (var12 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L6: {
                if ((param1 ^ -1) != -3) {
                  break L6;
                } else {
                  L7: {
                    if (-1 == (param2 ^ -1)) {
                      break L7;
                    } else {
                      if (param2 == 1) {
                        break L7;
                      } else {
                        if ((param2 ^ -1) != -3) {
                          break L1;
                        } else {
                          param6 = 16383 & -param6;
                          param7 = 16383 & -param7;
                          if (var12 == 0) {
                            break L1;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  param7 = -param7;
                  param6 = -param6;
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L6;
                  }
                }
              }
              if ((param1 ^ -1) != -4) {
                break L1;
              } else {
                L8: {
                  L9: {
                    if (0 == param2) {
                      break L9;
                    } else {
                      if ((param2 ^ -1) != -2) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var11_int = param7;
                  param7 = -param6;
                  param6 = var11_int;
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L8;
                  }
                }
                L10: {
                  if (param2 != 3) {
                    break L10;
                  } else {
                    var11_int = param7;
                    param7 = param6;
                    param6 = var11_int;
                    if (var12 == 0) {
                      break L1;
                    } else {
                      break L10;
                    }
                  }
                }
                if ((param2 ^ -1) == -3) {
                  var11_int = param7;
                  param7 = param6 & 16383;
                  param6 = -var11_int & 16383;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L11: {
              if (param9 > 81) {
                break L11;
              } else {
                var13 = (el) null;
                this.a((gda) null, (el) null, -114);
                break L11;
              }
            }
            L12: {
              L13: {
                if (-65536 != (param5 ^ -1)) {
                  break L13;
                } else {
                  this.a(param2, param0, param7, param8, param6, param1, param4);
                  if (var12 == 0) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              this.I(param2, param0, param7, param8, param6, param4, param5, param3);
              break L12;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var11 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var11);
            stackOut_34_1 = new StringBuilder().append("ka.EA(");
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
              break L14;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L14;
            }
          }
          L15: {
            stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param3 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L15;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L15;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    private final void a(int param0, boolean param1, boolean param2, rq param3, int param4, int[] param5, int param6, nk param7, rq param8, int param9, boolean[] param10, boolean param11) {
        RuntimeException var13 = null;
        int var13_int = 0;
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
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_110_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        var36 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param8 == null) {
                break L1;
              } else {
                if (0 != param0) {
                  L2: {
                    var13_int = 0;
                    var14 = 0;
                    var15 = 0;
                    if (!param11) {
                      break L2;
                    } else {
                      this.field_a = true;
                      break L2;
                    }
                  }
                  L3: while (true) {
                    L4: {
                      if (var15 >= param7.field_j) {
                        break L4;
                      } else {
                        var16 = 0;
                        if (var36 != 0) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          L5: {
                            if (param3.field_i <= var13_int) {
                              break L5;
                            } else {
                              if (var15 != param3.field_m[var13_int]) {
                                break L5;
                              } else {
                                var16 = 1;
                                break L5;
                              }
                            }
                          }
                          L6: {
                            var17 = 0;
                            if (param8.field_i <= var14) {
                              break L6;
                            } else {
                              if (var15 == param8.field_m[var14]) {
                                var17 = 1;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            L8: {
                              if (var16 != 0) {
                                break L8;
                              } else {
                                if (var17 != 0) {
                                  break L8;
                                } else {
                                  if (var36 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            L9: {
                              if (param10 == null) {
                                break L9;
                              } else {
                                L10: {
                                  if (param10[var15]) {
                                    stackOut_39_0 = 0;
                                    stackIn_40_0 = stackOut_39_0;
                                    break L10;
                                  } else {
                                    stackOut_38_0 = 1;
                                    stackIn_40_0 = stackOut_38_0;
                                    break L10;
                                  }
                                }
                                L11: {
                                  stackOut_40_0 = stackIn_40_0;
                                  stackIn_42_0 = stackOut_40_0;
                                  stackIn_41_0 = stackOut_40_0;
                                  if (param1) {
                                    stackOut_42_0 = stackIn_42_0;
                                    stackOut_42_1 = 0;
                                    stackIn_43_0 = stackOut_42_0;
                                    stackIn_43_1 = stackOut_42_1;
                                    break L11;
                                  } else {
                                    stackOut_41_0 = stackIn_41_0;
                                    stackOut_41_1 = 1;
                                    stackIn_43_0 = stackOut_41_0;
                                    stackIn_43_1 = stackOut_41_1;
                                    break L11;
                                  }
                                }
                                if (stackIn_43_0 == stackIn_43_1) {
                                  break L9;
                                } else {
                                  if (-1 != (param7.field_h[var15] ^ -1)) {
                                    L12: {
                                      if (var16 == 0) {
                                        break L12;
                                      } else {
                                        var13_int++;
                                        break L12;
                                      }
                                    }
                                    if (var17 != 0) {
                                      var14++;
                                      if (var36 == 0) {
                                        break L7;
                                      } else {
                                        break L9;
                                      }
                                    } else {
                                      break L7;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            L13: {
                              L14: {
                                var18 = 0;
                                var19 = param7.field_h[var15];
                                if (3 == var19) {
                                  break L14;
                                } else {
                                  if ((var19 ^ -1) == -11) {
                                    break L14;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              var18 = 128;
                              break L13;
                            }
                            L15: {
                              L16: {
                                if (var16 != 0) {
                                  break L16;
                                } else {
                                  var20 = var18;
                                  var24 = 0;
                                  var22 = var18;
                                  var23 = -1;
                                  var21 = var18;
                                  if (var36 == 0) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              var20 = param3.field_l[var13_int];
                              var21 = param3.field_k[var13_int];
                              var22 = param3.field_d[var13_int];
                              var23 = param3.field_j[var13_int];
                              var24 = param3.field_a[var13_int];
                              var13_int++;
                              break L15;
                            }
                            L17: {
                              L18: {
                                if (var17 != 0) {
                                  break L18;
                                } else {
                                  var27 = var18;
                                  var25 = var18;
                                  var29 = 0;
                                  var26 = var18;
                                  var28 = -1;
                                  if (var36 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              var26 = param8.field_k[var14];
                              var28 = param8.field_j[var14];
                              var27 = param8.field_d[var14];
                              var25 = param8.field_l[var14];
                              var29 = param8.field_a[var14];
                              var14++;
                              break L17;
                            }
                            L19: {
                              L20: {
                                if (-1 == var23) {
                                  break L20;
                                } else {
                                  this.a(param7.field_f[var23], param4, 0, param5, param2, param7.field_i[var23] & param6, 0, 0, 0, (byte) 103);
                                  if (var36 == 0) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              if (-1 != var28) {
                                this.a(param7.field_f[var28], param4, 0, param5, param2, param7.field_i[var28] & param6, 0, 0, 0, (byte) 85);
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            L21: {
                              L22: {
                                L23: {
                                  if ((var24 & 2) != 0) {
                                    break L23;
                                  } else {
                                    if (-1 == (var29 & 1 ^ -1)) {
                                      break L22;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                var32 = var22;
                                var31 = var21;
                                var30 = var20;
                                if (var36 == 0) {
                                  break L21;
                                } else {
                                  break L22;
                                }
                              }
                              L24: {
                                if (var19 == 2) {
                                  break L24;
                                } else {
                                  L25: {
                                    if (var19 == 9) {
                                      break L25;
                                    } else {
                                      L26: {
                                        if (7 != var19) {
                                          break L26;
                                        } else {
                                          L27: {
                                            var33 = 63 & -var20 + var25;
                                            if (var33 >= 32) {
                                              var33 -= 64;
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          var30 = var20 - -(param0 * var33 / param9) & 63;
                                          var32 = var22 - -((var27 - var22) * param0 / param9);
                                          var31 = var21 + param0 * (-var21 + var26) / param9;
                                          if (var36 == 0) {
                                            break L21;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      var31 = var21 - -((-var21 + var26) * param0 / param9);
                                      var30 = (var25 + -var20) * param0 / param9 + var20;
                                      var32 = param0 * (var27 - var22) / param9 + var22;
                                      if (var36 == 0) {
                                        break L21;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  L28: {
                                    var33 = 16383 & -var20 + var25;
                                    if (8192 <= var33) {
                                      var33 -= 16384;
                                      break L28;
                                    } else {
                                      break L28;
                                    }
                                  }
                                  var30 = var20 - -(param0 * var33 / param9) & 16383;
                                  var31 = 0;
                                  var32 = 0;
                                  if (var36 == 0) {
                                    break L21;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              L29: {
                                var33 = 16383 & -var20 + var25;
                                var34 = var26 - var21 & 16383;
                                if (var33 >= 8192) {
                                  var33 -= 16384;
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                              L30: {
                                if (-8193 >= (var34 ^ -1)) {
                                  var34 -= 16384;
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              L31: {
                                var35 = 16383 & var27 + -var22;
                                var30 = 16383 & param0 * var33 / param9 + var20;
                                var31 = var21 + param0 * var34 / param9 & 16383;
                                if (var35 < 8192) {
                                  break L31;
                                } else {
                                  var35 -= 16384;
                                  break L31;
                                }
                              }
                              var32 = var22 - -(param0 * var35 / param9) & 16383;
                              break L21;
                            }
                            this.a(param7.field_f[var15], param4, var19, param5, param2, param6 & param7.field_i[var15], var32, var30, var31, (byte) 114);
                            break L7;
                          }
                          var15++;
                          if (var36 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            var13_int = 0;
            L32: while (true) {
              L33: {
                if (param3.field_i <= var13_int) {
                  break L33;
                } else {
                  L34: {
                    L35: {
                      var14 = param3.field_m[var13_int];
                      if (param10 == null) {
                        break L35;
                      } else {
                        L36: {
                          if (param1) {
                            stackOut_9_0 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            break L36;
                          } else {
                            stackOut_8_0 = 1;
                            stackIn_10_0 = stackOut_8_0;
                            break L36;
                          }
                        }
                        L37: {
                          stackOut_10_0 = stackIn_10_0;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (param10[var14]) {
                            stackOut_12_0 = stackIn_12_0;
                            stackOut_12_1 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            break L37;
                          } else {
                            stackOut_11_0 = stackIn_11_0;
                            stackOut_11_1 = 1;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            break L37;
                          }
                        }
                        if (stackIn_13_0 == stackIn_13_1) {
                          break L35;
                        } else {
                          if (param7.field_h[var14] != 0) {
                            break L34;
                          } else {
                            break L35;
                          }
                        }
                      }
                    }
                    L38: {
                      var15 = param3.field_j[var13_int];
                      if (-1 == var15) {
                        break L38;
                      } else {
                        this.a(param7.field_f[var15], param4, 0, param5, param2, param7.field_i[var15] & param6, 0, 0, 0, (byte) 96);
                        break L38;
                      }
                    }
                    this.a(param7.field_f[var14], param4, param7.field_h[var14], param5, param2, param7.field_i[var14] & param6, (int) param3.field_d[var13_int], (int) param3.field_l[var13_int], (int) param3.field_k[var13_int], (byte) 90);
                    break L34;
                  }
                  var13_int++;
                  if (var36 == 0) {
                    continue L32;
                  } else {
                    break L33;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var13 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) (var13);
            stackOut_95_1 = new StringBuilder().append("ka.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param3 == null) {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L39;
            } else {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L39;
            }
          }
          L40: {
            stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
            stackOut_98_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_98_2).append(',').append(param4).append(',');
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param5 == null) {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L40;
            } else {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L40;
            }
          }
          L41: {
            stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
            stackOut_101_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_101_2).append(',').append(param6).append(',');
            stackIn_103_0 = stackOut_101_0;
            stackIn_103_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param7 == null) {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L41;
            } else {
              stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackOut_102_2 = "{...}";
              stackIn_104_0 = stackOut_102_0;
              stackIn_104_1 = stackOut_102_1;
              stackIn_104_2 = stackOut_102_2;
              break L41;
            }
          }
          L42: {
            stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
            stackOut_104_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_104_2).append(',');
            stackIn_106_0 = stackOut_104_0;
            stackIn_106_1 = stackOut_104_1;
            stackIn_105_0 = stackOut_104_0;
            stackIn_105_1 = stackOut_104_1;
            if (param8 == null) {
              stackOut_106_0 = (RuntimeException) ((Object) stackIn_106_0);
              stackOut_106_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackOut_106_2 = "null";
              stackIn_107_0 = stackOut_106_0;
              stackIn_107_1 = stackOut_106_1;
              stackIn_107_2 = stackOut_106_2;
              break L42;
            } else {
              stackOut_105_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackOut_105_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackOut_105_2 = "{...}";
              stackIn_107_0 = stackOut_105_0;
              stackIn_107_1 = stackOut_105_1;
              stackIn_107_2 = stackOut_105_2;
              break L42;
            }
          }
          L43: {
            stackOut_107_0 = (RuntimeException) ((Object) stackIn_107_0);
            stackOut_107_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_107_2).append(',').append(param9).append(',');
            stackIn_109_0 = stackOut_107_0;
            stackIn_109_1 = stackOut_107_1;
            stackIn_108_0 = stackOut_107_0;
            stackIn_108_1 = stackOut_107_1;
            if (param10 == null) {
              stackOut_109_0 = (RuntimeException) ((Object) stackIn_109_0);
              stackOut_109_1 = (StringBuilder) ((Object) stackIn_109_1);
              stackOut_109_2 = "null";
              stackIn_110_0 = stackOut_109_0;
              stackIn_110_1 = stackOut_109_1;
              stackIn_110_2 = stackOut_109_2;
              break L43;
            } else {
              stackOut_108_0 = (RuntimeException) ((Object) stackIn_108_0);
              stackOut_108_1 = (StringBuilder) ((Object) stackIn_108_1);
              stackOut_108_2 = "{...}";
              stackIn_110_0 = stackOut_108_0;
              stackIn_110_1 = stackOut_108_1;
              stackIn_110_2 = stackOut_108_2;
              break L43;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_110_0), stackIn_110_2 + ',' + param11 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    abstract void a(int param0, int param1, int param2, int param3);

    abstract void H(int param0, int param1, int param2);

    final void a(int param0, ena param1, int param2, int param3, int param4, ena param5, int param6, boolean param7, int param8) {
        rq var14 = null;
        nk var11 = null;
        Object var12 = null;
        rq var15 = null;
        if (-1 == param3) {
            return;
        }
        this.a();
        if (!this.NA()) {
            this.b();
            return;
        }
        try {
            var14 = param1.field_o[param3];
            var11 = var14.field_f;
            var12 = null;
            if (param5 != null) {
                var15 = param5.field_o[param2];
                var12 = var15;
                if (var11 != var15.field_f) {
                    var12 = null;
                }
            }
            int var13 = -124 / ((-85 - param0) / 35);
            this.a(param4, false, param7, var14, param8, (int[]) null, 65535, var11, (rq) (var12), param6, (boolean[]) null, false);
            this.wa();
            this.b();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ka.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    abstract void wa();

    final static void a(byte param0) {
        if (param0 != -33) {
            ka.a((byte) 65);
        }
        if (ci.field_l != null) {
            ci.field_l.i((byte) -7);
        }
        md.field_F = new efa();
        um.field_l.a(100, md.field_F);
    }

    abstract void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6);

    protected ka() {
        this.field_a = false;
    }

    abstract boolean NA();

    static {
        int var0 = 0;
        field_b = new float[4];
        field_c = new String[4];
        for (var0 = 0; (var0 ^ -1) > -5; var0++) {
            field_c[var0] = "Test Model " + (var0 + 1);
        }
    }
}
