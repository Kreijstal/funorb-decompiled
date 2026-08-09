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
        Object stackIn_14_0 = null;
        pr stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var4_long = 0L;
        RuntimeException var4 = null;
        int var6 = 0;
        byte[] var11 = null;
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
                      stackIn_14_0 = null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                stackIn_16_0 = new pr(param3, var4_long, param2);
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
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("ka.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
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
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        el var13 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) != -2) {
                if ((param1 ^ -1) != -3) {
                  if ((param1 ^ -1) != -4) {
                    break L1;
                  } else {
                    L2: {
                      if (0 == param2) {
                        break L2;
                      } else {
                        if ((param2 ^ -1) != -2) {
                          if (param2 != 3) {
                            if ((param2 ^ -1) == -3) {
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
                    if (-1 == (param2 ^ -1)) {
                      break L3;
                    } else {
                      if (param2 == 1) {
                        break L3;
                      } else {
                        if ((param2 ^ -1) != -3) {
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
                    if (-2 != (param2 ^ -1)) {
                      if (-4 != (param2 ^ -1)) {
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
                var13 = (el) null;
                this.a((gda) null, (el) null, -114);
                break L5;
              }
            }
            L6: {
              if (-65536 != (param5 ^ -1)) {
                this.I(param2, param0, param7, param8, param6, param4, param5, param3);
                break L6;
              } else {
                this.a(param2, param0, param7, param8, param6, param1, param4);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var11 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var11);

            stackIn_35_1 = new StringBuilder().append("ka.EA(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L7;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L8;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_36_0), stackIn_39_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    private final void a(int param0, boolean param1, boolean param2, rq param3, int param4, int[] param5, int param6, nk param7, rq param8, int param9, boolean[] param10, boolean param11) {
        int stackIn_10_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        StringBuilder stackIn_97_1 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        StringBuilder stackIn_100_1 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        StringBuilder stackIn_103_1 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        StringBuilder stackIn_106_1 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
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
        var36 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param8 == null) {
                break L1;
              } else {
                if (0 != param0) {
                  L2: {
                    var37 = 0;
                    var13_int = var37;
                    var38 = 0;
                    var14 = var38;
                    var39 = 0;
                    var15 = var39;
                    if (!param11) {
                      break L2;
                    } else {
                      this.field_a = true;
                      break L2;
                    }
                  }
                  L3: while (true) {
                    if (var39 >= param7.field_j) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L4: {
                        var16 = 0;
                        if (param3.field_i <= var37) {
                          break L4;
                        } else {
                          if (var39 != param3.field_m[var37]) {
                            break L4;
                          } else {
                            var16 = 1;
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var17 = 0;
                        if (param8.field_i <= var38) {
                          break L5;
                        } else {
                          if (var39 == param8.field_m[var38]) {
                            var17 = 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        L7: {
                          if (var16 != 0) {
                            break L7;
                          } else {
                            if (var17 != 0) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L8: {
                          if (param10 == null) {
                            break L8;
                          } else {
                            L9: {
                              if (param10[var39]) {
                                stackIn_38_0 = 0;
                                break L9;
                              } else {
                                stackIn_38_0 = 1;
                                break L9;
                              }
                            }
                            L10: {


                              if (param1) {

                                stackIn_41_1 = 0;
                                break L10;
                              } else {

                                stackIn_41_1 = 1;
                                break L10;
                              }
                            }
                            if (stackIn_38_0 == stackIn_41_1) {
                              break L8;
                            } else {
                              if (-1 != (param7.field_h[var39] ^ -1)) {
                                L11: {
                                  if (var16 == 0) {
                                    break L11;
                                  } else {
                                    var37++;
                                    break L11;
                                  }
                                }
                                if (var17 != 0) {
                                  var38++;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        L12: {
                          L13: {
                            var18 = 0;
                            var19 = param7.field_h[var39];
                            if (3 == var19) {
                              break L13;
                            } else {
                              if ((var19 ^ -1) == -11) {
                                break L13;
                              } else {
                                break L12;
                              }
                            }
                          }
                          var18 = 128;
                          break L12;
                        }
                        L14: {
                          if (var16 != 0) {
                            var20 = param3.field_l[var37];
                            var21 = param3.field_k[var37];
                            var22 = param3.field_d[var37];
                            var23 = param3.field_j[var37];
                            var24 = param3.field_a[var37];
                            var37++;
                            break L14;
                          } else {
                            var20 = var18;
                            var24 = 0;
                            var22 = var18;
                            var23 = -1;
                            var21 = var18;
                            break L14;
                          }
                        }
                        L15: {
                          if (var17 != 0) {
                            var26 = param8.field_k[var38];
                            var28 = param8.field_j[var38];
                            var27 = param8.field_d[var38];
                            var25 = param8.field_l[var38];
                            var29 = param8.field_a[var38];
                            var38++;
                            break L15;
                          } else {
                            var27 = var18;
                            var25 = var18;
                            var29 = 0;
                            var26 = var18;
                            var28 = -1;
                            break L15;
                          }
                        }
                        L16: {
                          if (-1 == var23) {
                            if (-1 != var28) {
                              this.a(param7.field_f[var28], param4, 0, param5, param2, param7.field_i[var28] & param6, 0, 0, 0, (byte) 85);
                              break L16;
                            } else {
                              break L16;
                            }
                          } else {
                            this.a(param7.field_f[var23], param4, 0, param5, param2, param7.field_i[var23] & param6, 0, 0, 0, (byte) 103);
                            break L16;
                          }
                        }
                        L17: {
                          L18: {
                            if ((var24 & 2) != 0) {
                              break L18;
                            } else {
                              if (-1 == (var29 & 1 ^ -1)) {
                                if (var19 == 2) {
                                  L19: {
                                    var33 = 16383 & -var20 + var25;
                                    var34 = var26 - var21 & 16383;
                                    if (var33 >= 8192) {
                                      var33 -= 16384;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (-8193 >= (var34 ^ -1)) {
                                      var34 -= 16384;
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    var35 = 16383 & var27 + -var22;
                                    var30 = 16383 & param0 * var33 / param9 + var20;
                                    var31 = var21 + param0 * var34 / param9 & 16383;
                                    if (var35 < 8192) {
                                      break L21;
                                    } else {
                                      var35 -= 16384;
                                      break L21;
                                    }
                                  }
                                  var32 = var22 - -(param0 * var35 / param9) & 16383;
                                  break L17;
                                } else {
                                  if (var19 == 9) {
                                    L22: {
                                      var33 = 16383 & -var20 + var25;
                                      if (8192 <= var33) {
                                        var33 -= 16384;
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    var30 = var20 - -(param0 * var33 / param9) & 16383;
                                    var31 = 0;
                                    var32 = 0;
                                    break L17;
                                  } else {
                                    if (7 != var19) {
                                      var31 = var21 - -((-var21 + var26) * param0 / param9);
                                      var30 = (var25 + -var20) * param0 / param9 + var20;
                                      var32 = param0 * (var27 - var22) / param9 + var22;
                                      break L17;
                                    } else {
                                      L23: {
                                        var33 = 63 & -var20 + var25;
                                        if (var33 >= 32) {
                                          var33 -= 64;
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                      var30 = var20 - -(param0 * var33 / param9) & 63;
                                      var32 = var22 - -((var27 - var22) * param0 / param9);
                                      var31 = var21 + param0 * (-var21 + var26) / param9;
                                      break L17;
                                    }
                                  }
                                }
                              } else {
                                break L18;
                              }
                            }
                          }
                          var32 = var22;
                          var31 = var21;
                          var30 = var20;
                          break L17;
                        }
                        this.a(param7.field_f[var39], param4, var19, param5, param2, param6 & param7.field_i[var39], var32, var30, var31, (byte) 114);
                        break L6;
                      }
                      var39++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            var13_int = 0;
            L24: while (true) {
              if (param3.field_i <= var13_int) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L25: {
                  var14 = param3.field_m[var13_int];
                  if (param10 == null) {
                    break L25;
                  } else {
                    L26: {
                      if (param1) {
                        stackIn_10_0 = 0;
                        break L26;
                      } else {
                        stackIn_10_0 = 1;
                        break L26;
                      }
                    }
                    L27: {


                      if (param10[var14]) {

                        stackIn_13_1 = 0;
                        break L27;
                      } else {

                        stackIn_13_1 = 1;
                        break L27;
                      }
                    }
                    if (stackIn_10_0 == stackIn_13_1) {
                      break L25;
                    } else {
                      if (param7.field_h[var14] == 0) {
                        break L25;
                      } else {
                        var13_int++;
                        continue L24;
                      }
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
                continue L24;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var13 = decompiledCaughtException;
            stackIn_94_0 = (RuntimeException) (var13);

            stackIn_94_1 = new StringBuilder().append("ka.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackIn_95_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackIn_95_2 = "null";
              break L29;
            } else {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackIn_95_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackIn_95_2 = "{...}";
              break L29;
            }
          }
          L30: {


            stackIn_97_1 = ((StringBuilder) (Object) stackIn_95_1).append(stackIn_95_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_98_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackIn_98_2 = "null";
              break L30;
            } else {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_98_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackIn_98_2 = "{...}";
              break L30;
            }
          }
          L31: {


            stackIn_100_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_98_2).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "null";
              break L31;
            } else {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "{...}";
              break L31;
            }
          }
          L32: {


            stackIn_103_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_101_2).append(',');

            if (param8 == null) {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "null";
              break L32;
            } else {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "{...}";
              break L32;
            }
          }
          L33: {


            stackIn_106_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_104_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackIn_107_2 = "null";
              break L33;
            } else {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackIn_107_2 = "{...}";
              break L33;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_95_0), stackIn_107_2 + ',' + param11 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
