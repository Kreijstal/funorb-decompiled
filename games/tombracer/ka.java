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
                  if (ita.field_a[0] == -1) {
                    L2: {
                      if (-1 != ita.field_a[0]) {
                        break L2;
                      } else {
                        System.out.println("Shader compile failed:");
                        break L2;
                      }
                    }
                    L3: {
                      jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, ita.field_a, 1);
                      if (ita.field_a[1] <= 1) {
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
                      return (pr) (Object) stackIn_14_0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                stackOut_15_0 = new pr(param3, var4_long, param2);
                stackIn_16_0 = stackOut_15_0;
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
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("ka.W(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_16_0;
    }

    abstract void a(gda param0, el param1, int param2);

    abstract ka a(byte param0, int param1, boolean param2);

    abstract void a();

    abstract void a(gda param0, el param1, int param2, int param3);

    private final void a(int[] param0, int param1, int param2, int[] param3, boolean param4, int param5, int param6, int param7, int param8, byte param9) {
        RuntimeException var11 = null;
        int var11_int = 0;
        int var12 = 0;
        Object var13 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 != 1) {
                if (param1 != 2) {
                  if (param1 != 3) {
                    break L1;
                  } else {
                    L2: {
                      if (0 == param2) {
                        break L2;
                      } else {
                        if (param2 != 1) {
                          if (param2 != 3) {
                            if (param2 == 2) {
                              var11_int = param7;
                              param7 = param6 & 16383;
                              param6 = -var11_int & 16383;
                              break L1;
                            } else {
                              break L1;
                            }
                          } else {
                            var11_int = param7;
                            param7 = param6;
                            param6 = var11_int;
                            break L1;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    var11_int = param7;
                    param7 = -param6;
                    param6 = var11_int;
                    break L1;
                  }
                } else {
                  L3: {
                    if (param2 == 0) {
                      break L3;
                    } else {
                      if (param2 == 1) {
                        break L3;
                      } else {
                        if (param2 != 2) {
                          break L1;
                        } else {
                          param6 = 16383 & -param6;
                          param7 = 16383 & -param7;
                          break L1;
                        }
                      }
                    }
                  }
                  param7 = -param7;
                  param6 = -param6;
                  break L1;
                }
              } else {
                L4: {
                  if (0 == param2) {
                    break L4;
                  } else {
                    if (param2 != 1) {
                      if (param2 != 3) {
                        if (param2 == 2) {
                          var11_int = param7;
                          param7 = 16383 & -param6;
                          param6 = 16383 & var11_int;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        var11_int = param7;
                        param7 = param6;
                        param6 = var11_int;
                        break L1;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                var11_int = -param7;
                param7 = param6;
                param6 = var11_int;
                break L1;
              }
            }
            L5: {
              if (param9 > 81) {
                break L5;
              } else {
                var13 = null;
                ((ka) this).a((gda) null, (el) null, -114);
                break L5;
              }
            }
            L6: {
              if (param5 != 65535) {
                ((ka) this).I(param2, param0, param7, param8, param6, param4, param5, param3);
                break L6;
              } else {
                ((ka) this).a(param2, param0, param7, param8, param6, param1, param4);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var11 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var11;
            stackOut_33_1 = new StringBuilder().append("ka.EA(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L7;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L7;
            }
          }
          L8: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param3 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L8;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
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
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        var36 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param8 == null) {
                break L1;
              } else {
                if (0 != param0) {
                  var37 = 0;
                  var13_int = var37;
                  var38 = 0;
                  var14 = var38;
                  var39 = 0;
                  var15 = var39;
                  L2: while (true) {
                    if (var39 >= param7.field_j) {
                      break L0;
                    } else {
                      L3: {
                        var16 = 0;
                        if (param3.field_i <= var37) {
                          break L3;
                        } else {
                          if (var39 != param3.field_m[var37]) {
                            break L3;
                          } else {
                            var16 = 1;
                            break L3;
                          }
                        }
                      }
                      L4: {
                        var17 = 0;
                        if (param8.field_i <= var38) {
                          break L4;
                        } else {
                          if (var39 == param8.field_m[var38]) {
                            var17 = 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        L6: {
                          if (var16 != 0) {
                            break L6;
                          } else {
                            if (var17 != 0) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L7: {
                          if (param10 == null) {
                            break L7;
                          } else {
                            L8: {
                              if (param10[var39]) {
                                stackOut_36_0 = 0;
                                stackIn_37_0 = stackOut_36_0;
                                break L8;
                              } else {
                                stackOut_35_0 = 1;
                                stackIn_37_0 = stackOut_35_0;
                                break L8;
                              }
                            }
                            L9: {
                              stackOut_37_0 = stackIn_37_0;
                              stackIn_39_0 = stackOut_37_0;
                              stackIn_38_0 = stackOut_37_0;
                              if (param1) {
                                stackOut_39_0 = stackIn_39_0;
                                stackOut_39_1 = 0;
                                stackIn_40_0 = stackOut_39_0;
                                stackIn_40_1 = stackOut_39_1;
                                break L9;
                              } else {
                                stackOut_38_0 = stackIn_38_0;
                                stackOut_38_1 = 1;
                                stackIn_40_0 = stackOut_38_0;
                                stackIn_40_1 = stackOut_38_1;
                                break L9;
                              }
                            }
                            if (stackIn_40_0 == stackIn_40_1) {
                              break L7;
                            } else {
                              if (param7.field_h[var39] != 0) {
                                L10: {
                                  if (var16 == 0) {
                                    break L10;
                                  } else {
                                    var37++;
                                    break L10;
                                  }
                                }
                                if (var17 != 0) {
                                  var38++;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        L11: {
                          L12: {
                            var18 = 0;
                            var19 = param7.field_h[var39];
                            if (3 == var19) {
                              break L12;
                            } else {
                              if (var19 == 10) {
                                break L12;
                              } else {
                                break L11;
                              }
                            }
                          }
                          var18 = 128;
                          break L11;
                        }
                        L13: {
                          if (var16 != 0) {
                            var20 = param3.field_l[var37];
                            var21 = param3.field_k[var37];
                            var22 = param3.field_d[var37];
                            var23 = param3.field_j[var37];
                            var24 = param3.field_a[var37];
                            var37++;
                            break L13;
                          } else {
                            var20 = var18;
                            var24 = 0;
                            var22 = var18;
                            var23 = -1;
                            var21 = var18;
                            break L13;
                          }
                        }
                        L14: {
                          if (var17 != 0) {
                            var26 = param8.field_k[var38];
                            var28 = param8.field_j[var38];
                            var27 = param8.field_d[var38];
                            var25 = param8.field_l[var38];
                            var29 = param8.field_a[var38];
                            var38++;
                            break L14;
                          } else {
                            var27 = var18;
                            var25 = var18;
                            var29 = 0;
                            var26 = var18;
                            var28 = -1;
                            break L14;
                          }
                        }
                        L15: {
                          if (-1 == var23) {
                            if (-1 != var28) {
                              this.a(param7.field_f[var28], param4, 0, param5, param2, param7.field_i[var28] & param6, 0, 0, 0, (byte) 85);
                              break L15;
                            } else {
                              break L15;
                            }
                          } else {
                            this.a(param7.field_f[var23], param4, 0, param5, param2, param7.field_i[var23] & param6, 0, 0, 0, (byte) 103);
                            break L15;
                          }
                        }
                        L16: {
                          L17: {
                            if ((var24 & 2) != -1) {
                              break L17;
                            } else {
                              if (-1 == (var29 & 1)) {
                                if (var19 == 2) {
                                  L18: {
                                    var33 = 16383 & -var20 + var25;
                                    var34 = var26 - var21 & 16383;
                                    if (var33 >= 8192) {
                                      var33 -= 16384;
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (var34 >= 8192) {
                                      var34 -= 16384;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    var35 = 16383 & var27 + -var22;
                                    var30 = 16383 & param0 * var33 / param9 + var20;
                                    var31 = var21 + param0 * var34 / param9 & 16383;
                                    if (var35 < 8192) {
                                      break L20;
                                    } else {
                                      var35 -= 16384;
                                      break L20;
                                    }
                                  }
                                  var32 = var22 - -(param0 * var35 / param9) & 16383;
                                  break L16;
                                } else {
                                  if (var19 == 9) {
                                    L21: {
                                      var33 = 16383 & -var20 + var25;
                                      if (8192 <= var33) {
                                        var33 -= 16384;
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                    var30 = var20 - -(param0 * var33 / param9) & 16383;
                                    var31 = 0;
                                    var32 = 0;
                                    break L16;
                                  } else {
                                    if (7 != var19) {
                                      var31 = var21 - -((-var21 + var26) * param0 / param9);
                                      var30 = (var25 + -var20) * param0 / param9 + var20;
                                      var32 = param0 * (var27 - var22) / param9 + var22;
                                      break L16;
                                    } else {
                                      L22: {
                                        var33 = 63 & -var20 + var25;
                                        if (var33 >= 32) {
                                          var33 -= 64;
                                          break L22;
                                        } else {
                                          break L22;
                                        }
                                      }
                                      var30 = var20 - -(param0 * var33 / param9) & 63;
                                      var32 = var22 - -((var27 - var22) * param0 / param9);
                                      var31 = var21 + param0 * (-var21 + var26) / param9;
                                      break L16;
                                    }
                                  }
                                }
                              } else {
                                break L17;
                              }
                            }
                          }
                          var32 = var22;
                          var31 = var21;
                          var30 = var20;
                          break L16;
                        }
                        this.a(param7.field_f[var39], param4, var19, param5, param2, param6 & param7.field_i[var39], var32, var30, var31, (byte) 114);
                        break L5;
                      }
                      var39++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            var13_int = 0;
            L23: while (true) {
              if (param3.field_i <= var13_int) {
                return;
              } else {
                L24: {
                  var14 = param3.field_m[var13_int];
                  if (param10 == null) {
                    break L24;
                  } else {
                    L25: {
                      if (param1) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L25;
                      } else {
                        stackOut_8_0 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        break L25;
                      }
                    }
                    L26: {
                      stackOut_10_0 = stackIn_10_0;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (param10[var14]) {
                        stackOut_12_0 = stackIn_12_0;
                        stackOut_12_1 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L26;
                      } else {
                        stackOut_11_0 = stackIn_11_0;
                        stackOut_11_1 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        break L26;
                      }
                    }
                    if (stackIn_13_0 == stackIn_13_1) {
                      break L24;
                    } else {
                      L27: {
                        if (param7.field_h[var14] != 0) {
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      var13_int++;
                      continue L23;
                    }
                  }
                }
                L28: {
                  var15 = param3.field_j[var13_int];
                  if (-1 == var15) {
                    break L28;
                  } else {
                    this.a(param7.field_f[var15], param4, 0, param5, param2, param7.field_i[var15] & param6, 0, 0, 0, (byte) 96);
                    break L28;
                  }
                }
                this.a(param7.field_f[var14], param4, param7.field_h[var14], param5, param2, param7.field_i[var14] & param6, (int) param3.field_d[var13_int], (int) param3.field_l[var13_int], (int) param3.field_k[var13_int], (byte) 90);
                var13_int++;
                continue L23;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var13 = decompiledCaughtException;
            stackOut_91_0 = (RuntimeException) var13;
            stackOut_91_1 = new StringBuilder().append("ka.BA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_93_0 = stackOut_91_0;
            stackIn_93_1 = stackOut_91_1;
            stackIn_92_0 = stackOut_91_0;
            stackIn_92_1 = stackOut_91_1;
            if (param3 == null) {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "null";
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              stackIn_94_2 = stackOut_93_2;
              break L29;
            } else {
              stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
              stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
              stackOut_92_2 = "{...}";
              stackIn_94_0 = stackOut_92_0;
              stackIn_94_1 = stackOut_92_1;
              stackIn_94_2 = stackOut_92_2;
              break L29;
            }
          }
          L30: {
            stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
            stackOut_94_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_94_2).append(44).append(param4).append(44);
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param5 == null) {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L30;
            } else {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L30;
            }
          }
          L31: {
            stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
            stackOut_97_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_97_2).append(44).append(param6).append(44);
            stackIn_99_0 = stackOut_97_0;
            stackIn_99_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param7 == null) {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L31;
            } else {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "{...}";
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_100_2 = stackOut_98_2;
              break L31;
            }
          }
          L32: {
            stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
            stackOut_100_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_100_2).append(44);
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param8 == null) {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L32;
            } else {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L32;
            }
          }
          L33: {
            stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
            stackOut_103_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_103_2).append(44).append(param9).append(44);
            stackIn_105_0 = stackOut_103_0;
            stackIn_105_1 = stackOut_103_1;
            stackIn_104_0 = stackOut_103_0;
            stackIn_104_1 = stackOut_103_1;
            if (param10 == null) {
              stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
              stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
              stackOut_105_2 = "null";
              stackIn_106_0 = stackOut_105_0;
              stackIn_106_1 = stackOut_105_1;
              stackIn_106_2 = stackOut_105_2;
              break L33;
            } else {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "{...}";
              stackIn_106_0 = stackOut_104_0;
              stackIn_106_1 = stackOut_104_1;
              stackIn_106_2 = stackOut_104_2;
              break L33;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_106_0, stackIn_106_2 + 44 + 0 + 41);
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
        ((ka) this).a();
        if (!((ka) this).NA()) {
            ((ka) this).b();
            return;
        }
        try {
            var14 = param1.field_o[param3];
            var11 = var14.field_f;
            var12 = null;
            if (param5 != null) {
                var15 = param5.field_o[param2];
                if (var11 != var15.field_f) {
                    var12 = null;
                }
            }
            int var13 = -124 / ((-85 - param0) / 35);
            this.a(param4, false, param7, var14, param8, (int[]) null, 65535, var11, (rq) var12, param6, (boolean[]) null, false);
            ((ka) this).wa();
            ((ka) this).b();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ka.AA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 44 + param6 + 44 + param7 + 44 + param8 + 41);
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
        um.field_l.a(100, (ae) (Object) md.field_F);
    }

    abstract void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6);

    protected ka() {
        ((ka) this).field_a = false;
    }

    abstract boolean NA();

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_b = new float[4];
        field_c = new String[4];
        for (var0 = 0; var0 < 4; var0++) {
            field_c[var0] = "Test Model " + (var0 + 1);
        }
    }
}
