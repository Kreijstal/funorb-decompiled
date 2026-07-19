/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir {
    private int field_b;
    private int field_n;
    static v field_d;
    private int field_a;
    static String field_j;
    static kl field_f;
    private int field_e;
    private int field_c;
    static String field_l;
    private ne[] field_m;
    static ka field_h;
    static String field_k;
    private int field_g;
    private int[] field_i;

    final void a(float[] param0, boolean param1, float param2, int param3, byte param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        float var16 = 0.0f;
        int var17 = 0;
        jd var18 = null;
        jd var19 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_9_0 = false;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == -4) {
                break L1;
              } else {
                this.field_b = 94;
                break L1;
              }
            }
            var18 = wg.field_b[param3];
            var19 = var18;
            var19.field_J = param7;
            var19.field_w = param6;
            this.a(var19, 120);
            var10 = 3 * bw.field_m[var18.field_N][3];
            var12 = this.field_b;
            L2: while (true) {
              stackOut_4_0 = var12;
              stackIn_5_0 = stackOut_4_0;
              L3: while (true) {
                L4: {
                  if (stackIn_5_0 > this.field_n) {
                    break L4;
                  } else {
                    var11 = this.field_e - -(this.field_a * var12);
                    if (var17 != 0) {
                      break L4;
                    } else {
                      var13 = this.field_e;
                      L5: while (true) {
                        L6: {
                          if (var13 > this.field_c) {
                            break L6;
                          } else {
                            var14 = this.field_i[var11];
                            var15 = (65535 & var14) + (var14 >> -1648080016) * var10;
                            var16 = 10.0f * param2 / (float)(1 + var15);
                            stackOut_9_0 = param1;
                            stackIn_5_0 = stackOut_9_0 ? 1 : 0;
                            stackIn_10_0 = stackOut_9_0;
                            if (var17 != 0) {
                              continue L3;
                            } else {
                              L7: {
                                if (!stackIn_10_0) {
                                  break L7;
                                } else {
                                  var16 = var16 / (float)(1 + var15);
                                  break L7;
                                }
                              }
                              param0[var11] = param0[var11] + var16;
                              var11++;
                              var13++;
                              if (var17 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var12++;
                        if (var17 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
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
          L8: {
            var9 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var9);
            stackOut_15_1 = new StringBuilder().append("ir.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L8;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, bv param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 != (param5 ^ -1)) {
                L2: {
                  var7_int = 1 << -1 + param5;
                  if (-1 + var7_int < param2) {
                    break L2;
                  } else {
                    if (param2 < -var7_int) {
                      break L2;
                    } else {
                      param6.a(-16807, 2, 0);
                      param6.a(param4 + -16808, param5, param2);
                      stackOut_8_0 = param5 + 2;
                      stackIn_9_0 = stackOut_8_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                L3: {
                  if (0 >= param2) {
                    break L3;
                  } else {
                    param2 = param2 - var7_int;
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                param2 = param2 + var7_int;
                break L1;
              } else {
                if (0 == param2) {
                  param6.a(param4 + -16808, 2, 0);
                  stackOut_4_0 = 2;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L4: {
              var7_int = 1 << -1 + param0;
              if (param2 > var7_int - param4) {
                break L4;
              } else {
                if (param2 < -var7_int) {
                  break L4;
                } else {
                  param6.a(-16807, 2, 1);
                  param6.a(param4 ^ -16808, param0, param2);
                  stackOut_15_0 = param0 + 2;
                  stackIn_16_0 = stackOut_15_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
            L5: {
              L6: {
                if ((param2 ^ -1) >= -1) {
                  break L6;
                } else {
                  param2 = param2 - var7_int;
                  if (var8 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              param2 = param2 + var7_int;
              break L5;
            }
            L7: {
              L8: {
                var7_int = 1 << -1 + param1;
                if (param2 > var7_int - 1) {
                  break L8;
                } else {
                  if (param2 >= -var7_int) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                L10: {
                  if (-1 <= (param2 ^ -1)) {
                    break L10;
                  } else {
                    param2 = param2 - var7_int;
                    if (var8 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                param2 = param2 + var7_int;
                if (var8 == 0) {
                  break L9;
                } else {
                  break L7;
                }
              }
              L11: {
                var7_int = 1 << param3 - 1;
                if (param2 > -1 + var7_int) {
                  break L11;
                } else {
                  if (param2 < -var7_int) {
                    break L11;
                  } else {
                    param6.a(-16807, 2, 3);
                    param6.a(-16807, param3, param2);
                    stackOut_30_0 = 2 - -param3;
                    stackIn_31_0 = stackOut_30_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
              L12: {
                L13: {
                  if (param2 <= 0) {
                    break L13;
                  } else {
                    param2 = param2 - var7_int;
                    if (var8 == 0) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                param2 = param2 + var7_int;
                break L12;
              }
              throw new IllegalArgumentException("out of range " + param2);
            }
            param6.a(-16807, 2, 2);
            param6.a(-16807, param1, param2);
            stackOut_26_0 = 2 + param1;
            stackIn_27_0 = stackOut_26_0;
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var7 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var7);
            stackOut_36_1 = new StringBuilder().append("ir.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param6 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L14;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L14;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0;
              } else {
                return stackIn_31_0;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_d = null;
        field_f = null;
        int var1 = 59 % ((param0 - -1) / 41);
        field_h = null;
        field_k = null;
        field_j = null;
    }

    final static String a(int param0, int param1) {
        int discarded$0 = 0;
        if (param0 != 10602) {
            bv var3 = (bv) null;
            discarded$0 = ir.a(12, 72, -87, -119, -83, -86, (bv) null);
        }
        return Integer.toString(param1);
    }

    final void a(float[][] param0, int param1, int param2, jd param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param3.field_S) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = param3.g(param2 ^ param2);
              var6 = param3.i(-21428) ? 1 : 0;
              this.a(param3, 124);
              var7 = 0;
              var8 = bw.field_m[param3.field_N][7];
              this.field_n = Math.min(this.field_n + var8, this.field_g - 1);
              this.field_c = Math.min(var8 + this.field_c, this.field_a + -1);
              this.field_b = Math.max(-var8 + this.field_b, 0);
              this.field_e = Math.max(-var8 + this.field_e, 0);
              var9 = this.field_b;
              L1: while (true) {
                stackOut_5_0 = this.field_n;
                stackOut_5_1 = var9;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                L2: while (true) {
                  L3: {
                    if (stackIn_6_0 < stackIn_6_1) {
                      break L3;
                    } else {
                      var7 = this.field_a * var9 + this.field_e;
                      if (var15 != 0) {
                        break L3;
                      } else {
                        var10 = this.field_e;
                        L4: while (true) {
                          L5: {
                            if (var10 > this.field_c) {
                              break L5;
                            } else {
                              var11 = this.a(this.field_i, param3, var10, var9, (byte) 5);
                              stackOut_10_0 = var11;
                              stackOut_10_1 = 1000000;
                              stackIn_6_0 = stackOut_10_0;
                              stackIn_6_1 = stackOut_10_1;
                              stackIn_11_0 = stackOut_10_0;
                              stackIn_11_1 = stackOut_10_1;
                              if (var15 != 0) {
                                continue L2;
                              } else {
                                L6: {
                                  if (stackIn_11_0 == stackIn_11_1) {
                                    break L6;
                                  } else {
                                    var12 = this.field_i[var11];
                                    var13 = var12 >> -865013712;
                                    var14 = var13 + 1;
                                    var14 = var14 * var14;
                                    param0[var5_int][var7] = param0[var5_int][var7] + (float)(param1 * param3.g((byte) 122)) / (float)var14;
                                    break L6;
                                  }
                                }
                                L7: {
                                  if (var6 != 0) {
                                    var12 = this.field_i[var7];
                                    var13 = var12 >> -419989840;
                                    var14 = var13 + 1;
                                    var14 = var14 * var14;
                                    param0[8][var7] = param0[8][var7] + (float)(param1 * param3.g((byte) 122)) / (float)var14;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                var7++;
                                var10++;
                                if (var15 == 0) {
                                  continue L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var9++;
                          if (var15 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var5);
            stackOut_19_1 = new StringBuilder().append("ir.G(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, float param2, int param3, float[][][] param4, boolean param5, int param6, boolean param7) {
        try {
            if (!param7) {
                this.field_a = -97;
            }
            this.a(param4[param0][param6], param5, param2, param0, (byte) -4, param6, param3, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ir.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int[] param0, byte param1, vh param2, int[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 100) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              L3: {
                if (6 <= var4_int) {
                  break L3;
                } else {
                  param2.b(param1 + -99, param0[var4_int]);
                  param2.b(1, param3[var4_int]);
                  var4_int++;
                  if (var5 != 0) {
                    break L3;
                  } else {
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("ir.K(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    private final void a(jd param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_i.length <= var3_int) {
                    break L3;
                  } else {
                    this.field_i[var3_int] = 268435455;
                    var3_int++;
                    if (var11 != 0) {
                      break L2;
                    } else {
                      if (var11 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_b = param0.field_w;
                this.field_c = param0.field_J;
                this.field_n = param0.field_w;
                this.field_e = param0.field_J;
                this.field_c = Math.min(this.field_c - -1, -1 + this.field_a);
                this.field_n = Math.min(1 + this.field_n, this.field_g - 1);
                this.field_e = Math.max(-1 + this.field_e, 0);
                this.field_b = Math.max(-1 + this.field_b, 0);
                this.field_i[param0.field_J + param0.field_w * this.field_a] = 0;
                break L2;
              }
              L4: {
                if (param1 >= 118) {
                  break L4;
                } else {
                  this.field_e = -1;
                  break L4;
                }
              }
              var3_int = 3 * bw.field_m[param0.field_N][3];
              var4 = 0;
              L5: while (true) {
                L6: {
                  if (500 <= var4) {
                    break L6;
                  } else {
                    var5 = 0;
                    var6 = 0;
                    if (var11 != 0) {
                      break L6;
                    } else {
                      var7 = this.field_b;
                      L7: while (true) {
                        stackOut_13_0 = this.field_n;
                        stackOut_13_1 = var7;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        L8: while (true) {
                          L9: {
                            L10: {
                              if (stackIn_14_0 < stackIn_14_1) {
                                break L10;
                              } else {
                                var6 = this.field_e - -(var7 * this.field_a);
                                stackOut_15_0 = this.field_e;
                                stackIn_21_0 = stackOut_15_0;
                                stackIn_16_0 = stackOut_15_0;
                                if (var11 != 0) {
                                  break L9;
                                } else {
                                  var8 = stackIn_16_0;
                                  if (this.field_c < var8) {
                                    var7++;
                                    if (var11 == 0) {
                                      continue L7;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    var9 = 2147483647;
                                    stackOut_17_0 = -1;
                                    stackOut_17_1 = var8 ^ -1;
                                    stackIn_14_0 = stackOut_17_0;
                                    stackIn_14_1 = stackOut_17_1;
                                    continue L8;
                                  }
                                }
                              }
                            }
                            stackOut_20_0 = var5 ^ -1;
                            stackIn_21_0 = stackOut_20_0;
                            break L9;
                          }
                          if (stackIn_21_0 == -1) {
                            break L6;
                          } else {
                            var4++;
                            if (var11 == 0) {
                              continue L5;
                            } else {
                              break L6;
                            }
                          }
                        }
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
          L11: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var3);
            stackOut_25_1 = new StringBuilder().append("ir.B(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_18_0 = false;
        boolean stackIn_19_0 = false;
        int stackIn_33_0 = 0;
        boolean stackIn_37_0 = false;
        boolean stackIn_38_0 = false;
        int stackIn_53_0 = 0;
        boolean stackIn_57_0 = false;
        boolean stackIn_58_0 = false;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        boolean stackIn_76_0 = false;
        boolean stackIn_77_0 = false;
        boolean stackIn_91_0 = false;
        boolean stackIn_92_0 = false;
        boolean stackIn_103_0 = false;
        boolean stackIn_104_0 = false;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        boolean stackOut_36_0 = false;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_17_0 = false;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        boolean stackOut_56_0 = false;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        boolean stackOut_90_0 = false;
        boolean stackOut_102_0 = false;
        boolean stackOut_75_0 = false;
        L0: {
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          if ((param0 - -param3 ^ -1) > -1) {
            break L0;
          } else {
            if (param3 + param0 >= this.field_a) {
              break L0;
            } else {
              if ((param5 + param4 ^ -1) > -1) {
                break L0;
              } else {
                if (this.field_g <= param4 + param5) {
                  break L0;
                } else {
                  L1: {
                    if (param3 != 0) {
                      if (param3 == 0) {
                        L2: {
                          if (-1 > (param4 ^ -1)) {
                            stackOut_32_0 = 1;
                            stackIn_33_0 = stackOut_32_0;
                            break L2;
                          } else {
                            stackOut_31_0 = -1;
                            stackIn_33_0 = stackOut_31_0;
                            break L2;
                          }
                        }
                        var7 = stackIn_33_0;
                        param4 = param4 * var7;
                        var8 = 1;
                        L3: while (true) {
                          if (var8 < param4) {
                            var9 = param0 + (var8 * var7 + param5) * this.field_a;
                            stackOut_36_0 = param2;
                            stackIn_38_0 = stackOut_36_0;
                            stackIn_37_0 = stackOut_36_0;
                            if (var12 == 0) {
                              L4: {
                                L5: {
                                  if (stackIn_38_0) {
                                    break L5;
                                  } else {
                                    if (2 == this.field_m[var9].field_h) {
                                      break L4;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                if (-4 != (this.field_m[var9].field_h ^ -1)) {
                                  var8++;
                                  continue L3;
                                } else {
                                  break L4;
                                }
                              }
                              return false;
                            } else {
                              return stackIn_37_0;
                            }
                          } else {
                            return true;
                          }
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      if (0 != param4) {
                        if (param3 == 0) {
                          L6: {
                            if (-1 > (param4 ^ -1)) {
                              stackOut_13_0 = 1;
                              stackIn_14_0 = stackOut_13_0;
                              break L6;
                            } else {
                              stackOut_12_0 = -1;
                              stackIn_14_0 = stackOut_12_0;
                              break L6;
                            }
                          }
                          var7 = stackIn_14_0;
                          param4 = param4 * var7;
                          var8 = 1;
                          L7: while (true) {
                            if (var8 < param4) {
                              var9 = param0 + (var8 * var7 + param5) * this.field_a;
                              stackOut_17_0 = param2;
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_18_0 = stackOut_17_0;
                              if (var12 == 0) {
                                L8: {
                                  if (stackIn_19_0) {
                                    break L8;
                                  } else {
                                    if (2 != this.field_m[var9].field_h) {
                                      break L8;
                                    } else {
                                      return false;
                                    }
                                  }
                                }
                                if (-4 != (this.field_m[var9].field_h ^ -1)) {
                                  var8++;
                                  continue L7;
                                } else {
                                  return false;
                                }
                              } else {
                                return stackIn_18_0;
                              }
                            } else {
                              return true;
                            }
                          }
                        } else {
                          break L1;
                        }
                      } else {
                        return true;
                      }
                    }
                  }
                  L9: {
                    if (param1 < -23) {
                      break L9;
                    } else {
                      field_f = (kl) null;
                      break L9;
                    }
                  }
                  if (-1 == (param4 ^ -1)) {
                    L10: {
                      if (-1 <= (param3 ^ -1)) {
                        stackOut_52_0 = -1;
                        stackIn_53_0 = stackOut_52_0;
                        break L10;
                      } else {
                        stackOut_51_0 = 1;
                        stackIn_53_0 = stackOut_51_0;
                        break L10;
                      }
                    }
                    var7 = stackIn_53_0;
                    param3 = param3 * var7;
                    var8 = 1;
                    L11: while (true) {
                      if (var8 < param3) {
                        var9 = param5 * this.field_a + var7 * var8 + param0;
                        stackOut_56_0 = param2;
                        stackIn_58_0 = stackOut_56_0;
                        stackIn_57_0 = stackOut_56_0;
                        if (var12 == 0) {
                          L12: {
                            L13: {
                              if (stackIn_58_0) {
                                break L13;
                              } else {
                                if (this.field_m[var9].field_h == 2) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            if (this.field_m[var9].field_h == 3) {
                              break L12;
                            } else {
                              var8++;
                              continue L11;
                            }
                          }
                          return false;
                        } else {
                          return stackIn_57_0;
                        }
                      } else {
                        return true;
                      }
                    }
                  } else {
                    L14: {
                      if (0 < param3) {
                        stackOut_68_0 = 1;
                        stackIn_69_0 = stackOut_68_0;
                        break L14;
                      } else {
                        stackOut_67_0 = -1;
                        stackIn_69_0 = stackOut_67_0;
                        break L14;
                      }
                    }
                    L15: {
                      var7 = stackIn_69_0;
                      if (0 >= param4) {
                        stackOut_71_0 = -1;
                        stackIn_72_0 = stackOut_71_0;
                        break L15;
                      } else {
                        stackOut_70_0 = 1;
                        stackIn_72_0 = stackOut_70_0;
                        break L15;
                      }
                    }
                    var8 = stackIn_72_0;
                    param3 = param3 * var7;
                    param4 = param4 * var8;
                    if (param3 > param4) {
                      var9 = 1;
                      L16: while (true) {
                        if (var9 < param3) {
                          var10 = var9 * param4 / param3;
                          var11 = (var10 * var8 + param5) * this.field_a + var9 * var7 + param0;
                          stackOut_90_0 = param2;
                          stackIn_92_0 = stackOut_90_0;
                          stackIn_91_0 = stackOut_90_0;
                          if (var12 == 0) {
                            L17: {
                              L18: {
                                if (stackIn_92_0) {
                                  break L18;
                                } else {
                                  if (this.field_m[var11].field_h == 2) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              if ((this.field_m[var11].field_h ^ -1) == -4) {
                                break L17;
                              } else {
                                var9++;
                                continue L16;
                              }
                            }
                            return false;
                          } else {
                            return stackIn_91_0;
                          }
                        } else {
                          return true;
                        }
                      }
                    } else {
                      var9 = 1;
                      L19: while (true) {
                        if (param4 <= var9) {
                          if (var12 != 0) {
                            var9 = 1;
                            L20: while (true) {
                              if (var9 < param3) {
                                var10 = var9 * param4 / param3;
                                var11 = (var10 * var8 + param5) * this.field_a + var9 * var7 + param0;
                                stackOut_102_0 = param2;
                                stackIn_104_0 = stackOut_102_0;
                                stackIn_103_0 = stackOut_102_0;
                                if (var12 == 0) {
                                  L21: {
                                    L22: {
                                      if (stackIn_104_0) {
                                        break L22;
                                      } else {
                                        if (this.field_m[var11].field_h == 2) {
                                          break L21;
                                        } else {
                                          break L22;
                                        }
                                      }
                                    }
                                    if ((this.field_m[var11].field_h ^ -1) == -4) {
                                      break L21;
                                    } else {
                                      var9++;
                                      continue L20;
                                    }
                                  }
                                  return false;
                                } else {
                                  return stackIn_103_0;
                                }
                              } else {
                                return true;
                              }
                            }
                          } else {
                            return true;
                          }
                        } else {
                          var10 = param3 * var9 / param4;
                          var11 = (var9 * var8 + param5) * this.field_a + var7 * var10 + param0;
                          stackOut_75_0 = param2;
                          stackIn_77_0 = stackOut_75_0;
                          stackIn_76_0 = stackOut_75_0;
                          if (var12 == 0) {
                            L23: {
                              L24: {
                                if (stackIn_77_0) {
                                  break L24;
                                } else {
                                  if (2 == this.field_m[var11].field_h) {
                                    break L23;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              if (-4 != (this.field_m[var11].field_h ^ -1)) {
                                var9++;
                                continue L19;
                              } else {
                                break L23;
                              }
                            }
                            return false;
                          } else {
                            return stackIn_76_0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    private final int a(int[] param0, jd param1, int param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_22_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_2_0 = 0;
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
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6_int = 1000000;
            var7 = 1000000;
            if (param4 == 5) {
              L1: {
                if (bw.field_m[param1.field_N][0] != 4) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              var8 = stackIn_7_0;
              var9 = bw.field_m[param1.field_N][6];
              var10 = bw.field_m[param1.field_N][7];
              var11 = -var10;
              L2: while (true) {
                stackOut_8_0 = var11;
                stackOut_8_1 = var10;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                L3: while (true) {
                  L4: {
                    if (stackIn_9_0 > stackIn_9_1) {
                      stackOut_21_0 = var6_int;
                      stackIn_22_0 = stackOut_21_0;
                      break L4;
                    } else {
                      stackOut_10_0 = -var10;
                      stackIn_22_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var17 != 0) {
                        break L4;
                      } else {
                        var12 = stackIn_11_0;
                        L5: while (true) {
                          if (var10 < var12) {
                            var11++;
                            continue L2;
                          } else {
                            var13 = Math.abs(var11) + Math.abs(var12);
                            stackOut_13_0 = var9;
                            stackOut_13_1 = var13;
                            stackIn_9_0 = stackOut_13_0;
                            stackIn_9_1 = stackOut_13_1;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            if (var17 != 0) {
                              continue L3;
                            } else {
                              L6: {
                                if (stackIn_14_0 > stackIn_14_1) {
                                  break L6;
                                } else {
                                  if (var13 > var10) {
                                    break L6;
                                  } else {
                                    if (this.a(param2, -117, var8 == 0, var12, var11, param3)) {
                                      break L6;
                                    } else {
                                      var15 = (param3 - -var11) * this.field_a + param2 + var12;
                                      var16 = param0[var15];
                                      if (var7 <= var16) {
                                        break L6;
                                      } else {
                                        var6_int = var15;
                                        var7 = var16;
                                        break L6;
                                      }
                                    }
                                  }
                                }
                              }
                              var12++;
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 115;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var6);
            stackOut_23_1 = new StringBuilder().append("ir.C(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_22_0;
        }
    }

    final void a(int param0, int param1, float param2, int param3, int param4, float[][][] param5, int param6) {
        try {
            if (param0 >= -18) {
                jd var9 = (jd) null;
                this.a((jd) null, 43);
            }
            this.a(param3, param6, param2, param1, param5, false, param4, true);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ir.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    ir(ne[] param0, int param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_a = param1;
              this.field_g = param2;
              this.field_m = param0;
              this.field_i = new int[this.field_m.length];
              if (null != wg.field_b) {
                break L1;
              } else {
                wg.field_b = new jd[8];
                var11 = new int[wg.field_b.length];
                var10 = var11;
                var9 = var10;
                var4 = var9;
                var5 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (75 <= var5) {
                        break L4;
                      } else {
                        var6 = bw.field_m[var5][0];
                        var7 = bw.field_m[var5][3];
                        stackOut_4_0 = var11[var6];
                        stackIn_10_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_5_0 == 0) {
                                break L6;
                              } else {
                                if (bw.field_m[var11[var6]][3] >= var7) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var11[var6] = var5;
                            break L5;
                          }
                          var5++;
                          if (var8 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  }
                  var5 = stackIn_10_0;
                  L7: while (true) {
                    if (wg.field_b.length <= var5) {
                      break L1;
                    } else {
                      wg.field_b[var5] = new jd(0, 0, var11[var5]);
                      var5++;
                      if (var8 != 0) {
                        break L1;
                      } else {
                        if (var8 == 0) {
                          continue L7;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4_ref);
            stackOut_16_1 = new StringBuilder().append("ir.<init>(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0) {
        String[][] dupTemp$2 = null;
        int[][] dupTemp$3 = null;
        RuntimeException var1 = null;
        int var2 = 0;
        nt var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        bv var13 = null;
        bv var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        boolean stackIn_32_0 = false;
        int stackIn_38_0 = 0;
        nt stackIn_46_0 = null;
        nt stackIn_47_0 = null;
        nt stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_37_0 = 0;
        boolean stackOut_31_0 = false;
        nt stackOut_45_0 = null;
        nt stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        nt stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var13 = mg.field_e;
            var14 = var13;
            var2 = var14.k(0);
            var3 = (nt) ((Object) s.field_a.e((byte) 120));
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var2 ^ -1;
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 != (var3.field_o ^ -1)) {
                          break L4;
                        } else {
                          if (var12 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3 = (nt) ((Object) s.field_a.a((byte) 123));
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (var3 == null) {
                  stackOut_10_0 = -127;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  L5: {
                    L6: {
                      var4 = var14.k(0);
                      if (var4 == 0) {
                        break L6;
                      } else {
                        var5 = var3.field_q;
                        gm.field_a[0] = mv.field_d;
                        var6_int = 1;
                        L7: while (true) {
                          L8: {
                            if (var6_int >= var4) {
                              qu.a(2, var5, var4);
                              break L8;
                            } else {
                              gm.field_a[var6_int] = var13.g(1);
                              var6_int++;
                              if (var12 != 0) {
                                break L8;
                              } else {
                                continue L7;
                              }
                            }
                          }
                          var6_int = 0;
                          L9: while (true) {
                            L10: {
                              if (var6_int >= var4) {
                                stackOut_28_0 = var5;
                                stackOut_28_1 = 0;
                                stackIn_29_0 = stackOut_28_0;
                                stackIn_29_1 = stackOut_28_1;
                                break L10;
                              } else {
                                jp.a(var14, -83);
                                stackOut_22_0 = 0;
                                stackOut_22_1 = var6_int;
                                stackIn_29_0 = stackOut_22_0;
                                stackIn_29_1 = stackOut_22_1;
                                stackIn_23_0 = stackOut_22_0;
                                stackIn_23_1 = stackOut_22_1;
                                if (var12 != 0) {
                                  break L10;
                                } else {
                                  L11: {
                                    L12: {
                                      if (stackIn_23_0 == stackIn_23_1) {
                                        break L12;
                                      } else {
                                        ut.a(rt.field_D, nk.field_m, ov.field_e, la.field_d, (byte) 125, var6_int);
                                        if (var12 == 0) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    var3.field_r = rt.field_D;
                                    var3.field_s = ov.field_e;
                                    var3.field_k = la.field_d;
                                    var3.field_m = nk.field_m;
                                    ut.a(rt.field_D, nk.field_m, ov.field_e, la.field_d, (byte) 127, var6_int);
                                    break L11;
                                  }
                                  var6_int++;
                                  continue L9;
                                }
                              }
                            }
                            jm.a(stackIn_29_0, stackIn_29_1);
                            dupTemp$2 = new String[2][var5];
                            var3.field_t = dupTemp$2;
                            var6 = dupTemp$2;
                            dupTemp$3 = new int[2][var5 * 4];
                            var3.field_n = dupTemp$3;
                            var7 = dupTemp$3;
                            var8 = kt.field_p;
                            var9 = 0;
                            var10 = 0;
                            L13: while (true) {
                              L14: {
                                if (var8 <= var9) {
                                  var9 = 0;
                                  stackOut_37_0 = 0;
                                  stackIn_38_0 = stackOut_37_0;
                                  break L14;
                                } else {
                                  var11 = vt.field_m[var9];
                                  var6[0][var10] = gm.field_a[var11];
                                  var7[0][var10 * 4] = no.field_U[var11];
                                  var7[0][1 + 4 * var10] = wp.field_w[var11];
                                  var7[0][var10 * 4 + 2] = ci.field_c[var11];
                                  var7[0][3 + var10 * 4] = pe.field_s[var11];
                                  stackOut_31_0 = gt.a(gm.field_a[var11], (byte) 121);
                                  stackIn_38_0 = stackOut_31_0 ? 1 : 0;
                                  stackIn_32_0 = stackOut_31_0;
                                  if (var12 != 0) {
                                    break L14;
                                  } else {
                                    L15: {
                                      if (!stackIn_32_0) {
                                        break L15;
                                      } else {
                                        if (0 == ci.field_c[var11] + wp.field_w[var11] - -pe.field_s[var11]) {
                                          var6[0][var10] = null;
                                          var10--;
                                          break L15;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    var9++;
                                    var10++;
                                    continue L13;
                                  }
                                }
                              }
                              var10 = stackIn_38_0;
                              L16: while (true) {
                                if (var8 <= var9) {
                                  break L6;
                                } else {
                                  var11 = vt.field_m[var5 - -var9];
                                  var6[1][var10] = gm.field_a[var11];
                                  var7[1][4 * var10] = no.field_U[var11];
                                  var7[1][var10 * 4 - -1] = wp.field_w[var11];
                                  var7[1][var10 * 4 + 2] = ci.field_c[var11];
                                  var7[1][var10 * 4 - -3] = pe.field_s[var11];
                                  if (var12 != 0) {
                                    break L5;
                                  } else {
                                    L17: {
                                      if (!gt.a(gm.field_a[var11], (byte) 109)) {
                                        break L17;
                                      } else {
                                        if (-1 != (pe.field_s[var11] + (wp.field_w[var11] - -ci.field_c[var11]) ^ -1)) {
                                          break L17;
                                        } else {
                                          var6[1][var10] = null;
                                          var10--;
                                          break L17;
                                        }
                                      }
                                    }
                                    var9++;
                                    var10++;
                                    continue L16;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L18: {
                      stackOut_45_0 = (nt) (var3);
                      stackIn_47_0 = stackOut_45_0;
                      stackIn_46_0 = stackOut_45_0;
                      if (!param0) {
                        stackOut_47_0 = (nt) ((Object) stackIn_47_0);
                        stackOut_47_1 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        break L18;
                      } else {
                        stackOut_46_0 = (nt) ((Object) stackIn_46_0);
                        stackOut_46_1 = 1;
                        stackIn_48_0 = stackOut_46_0;
                        stackIn_48_1 = stackOut_46_1;
                        break L18;
                      }
                    }
                    stackIn_48_0.field_l = stackIn_48_1 != 0;
                    var3.d(50);
                    break L5;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              dj.a((byte) stackIn_11_0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "ir.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_l = "Prayers to increase your favour.";
        field_j = "RuneScape clan";
        field_k = "Screen Size";
    }
}
