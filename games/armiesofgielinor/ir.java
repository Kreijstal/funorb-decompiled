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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (var12 > this.field_n) {
                break L0;
              } else {
                var11 = this.field_e - -(this.field_a * var12);
                var13 = this.field_e;
                L3: while (true) {
                  if (var13 > this.field_c) {
                    var12++;
                    continue L2;
                  } else {
                    L4: {
                      var14 = this.field_i[var11];
                      var15 = (65535 & var14) + (var14 >> -1648080016) * var10;
                      var16 = 10.0f * param2 / (float)(1 + var15);
                      if (!param1) {
                        break L4;
                      } else {
                        var16 = var16 / (float)(1 + var15);
                        break L4;
                      }
                    }
                    param0[var11] = param0[var11] + var16;
                    var11++;
                    var13++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var9);

            stackIn_14_1 = new StringBuilder().append("ir.A(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, bv param6) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
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
                      stackIn_9_0 = param5 + 2;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                if (0 >= param2) {
                  param2 = param2 + var7_int;
                  break L1;
                } else {
                  param2 = param2 - var7_int;
                  break L1;
                }
              } else {
                if (0 == param2) {
                  param6.a(param4 + -16808, 2, 0);
                  stackIn_5_0 = 2;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              var7_int = 1 << -1 + param0;
              if (param2 > var7_int - param4) {
                break L3;
              } else {
                if (param2 < -var7_int) {
                  break L3;
                } else {
                  param6.a(-16807, 2, 1);
                  param6.a(param4 ^ -16808, param0, param2);
                  stackIn_16_0 = param0 + 2;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
            L4: {
              if ((param2 ^ -1) >= -1) {
                param2 = param2 + var7_int;
                break L4;
              } else {
                param2 = param2 - var7_int;
                break L4;
              }
            }
            L5: {
              var7_int = 1 << -1 + param1;
              if (param2 > var7_int - 1) {
                break L5;
              } else {
                if (param2 >= -var7_int) {
                  param6.a(-16807, 2, 2);
                  param6.a(-16807, param1, param2);
                  stackIn_27_0 = 2 + param1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (-1 <= (param2 ^ -1)) {
                param2 = param2 + var7_int;
                break L6;
              } else {
                param2 = param2 - var7_int;
                break L6;
              }
            }
            L7: {
              var7_int = 1 << param3 - 1;
              if (param2 > -1 + var7_int) {
                break L7;
              } else {
                if (param2 < -var7_int) {
                  break L7;
                } else {
                  param6.a(-16807, 2, 3);
                  param6.a(-16807, param3, param2);
                  stackIn_31_0 = 2 - -param3;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
            L8: {
              if (param2 <= 0) {
                param2 = param2 + var7_int;
                break L8;
              } else {
                param2 = param2 - var7_int;
                break L8;
              }
            }
            throw new IllegalArgumentException("out of range " + param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var7);

            stackIn_38_1 = new StringBuilder().append("ir.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L9;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L9;
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
        if (param0 != 10602) {
            bv var3 = (bv) null;
            ir.a(12, 72, -87, -119, -83, -86, (bv) null);
        }
        return Integer.toString(param1);
    }

    final void a(float[][] param0, int param1, int param2, jd param3) {
        float[] dupTemp$0 = null;
        float[] dupTemp$1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        int var16 = 0;
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
                if (this.field_n < var9) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var16 = this.field_a * var9 + this.field_e;
                  var7 = var16;
                  var10 = this.field_e;
                  L2: while (true) {
                    if (var10 > this.field_c) {
                      var9++;
                      continue L1;
                    } else {
                      L3: {
                        var11 = this.a(this.field_i, param3, var10, var9, (byte) 5);
                        if (var11 == 1000000) {
                          break L3;
                        } else {
                          var12 = this.field_i[var11];
                          var13 = var12 >> -865013712;
                          var14 = var13 + 1;
                          var14 = var14 * var14;
                          dupTemp$0 = param0[var5_int];
                          dupTemp$0[var16] = dupTemp$0[var16] + (float)(param1 * param3.g((byte) 122)) / (float)var14;
                          break L3;
                        }
                      }
                      L4: {
                        if (var6 != 0) {
                          var12 = this.field_i[var16];
                          var13 = var12 >> -419989840;
                          var14 = var13 + 1;
                          var14 = var14 * var14;
                          dupTemp$1 = param0[8];
                          dupTemp$1[var16] = dupTemp$1[var16] + (float)(param1 * param3.g((byte) 122)) / (float)var14;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var16++;
                      var10++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("ir.G(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
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
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
              if (6 <= var4_int) {
                break L0;
              } else {
                param2.b(param1 + -99, param0[var4_int]);
                param2.b(1, param3[var4_int]);
                var4_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ir.K(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
        }
    }

    private final void a(jd param0, int param1) {
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (this.field_i.length <= var3_int) {
                L2: {
                  this.field_b = param0.field_w;
                  this.field_c = param0.field_J;
                  this.field_n = param0.field_w;
                  this.field_e = param0.field_J;
                  this.field_c = Math.min(this.field_c - -1, -1 + this.field_a);
                  this.field_n = Math.min(1 + this.field_n, this.field_g - 1);
                  this.field_e = Math.max(-1 + this.field_e, 0);
                  this.field_b = Math.max(-1 + this.field_b, 0);
                  this.field_i[param0.field_J + param0.field_w * this.field_a] = 0;
                  if (param1 >= 118) {
                    break L2;
                  } else {
                    this.field_e = -1;
                    break L2;
                  }
                }
                var3_int = 3 * bw.field_m[param0.field_N][3];
                var4 = 0;
                L3: while (true) {
                  L4: {
                    if (500 <= var4) {
                      break L4;
                    } else {
                      var5 = 0;
                      var6 = 0;
                      var7 = this.field_b;
                      L5: while (true) {
                        if (this.field_n < var7) {
                          if (var5 == 0) {
                            break L4;
                          } else {
                            var4++;
                            continue L3;
                          }
                        } else {
                          var12 = this.field_e - -(var7 * this.field_a);
                          var6 = var12;
                          var8 = this.field_e;
                          L6: while (true) {
                            if (this.field_c < var8) {
                              var7++;
                              continue L5;
                            } else {
                              L7: {
                                var9 = 2147483647;
                                if (-1 > (var8 ^ -1)) {
                                  L8: {
                                    var10 = this.field_i[-1 + var12] - -pj.a(this.field_a, this.field_m, false, var12, param0.field_O, this.field_g, -1, param0, var12 - 1, false, true);
                                    if (var3_int >= (65535 & var10)) {
                                      break L8;
                                    } else {
                                      var10 = -var3_int + (((var10 >> 2111662672) - -1 << -874072112) + (65535 & var10));
                                      break L8;
                                    }
                                  }
                                  if (var9 <= var10) {
                                    break L7;
                                  } else {
                                    var9 = var10;
                                    break L7;
                                  }
                                } else {
                                  break L7;
                                }
                              }
                              L9: {
                                if (var7 <= 0) {
                                  break L9;
                                } else {
                                  L10: {
                                    var10 = this.field_i[var12 - this.field_a] - -pj.a(this.field_a, this.field_m, false, var12, param0.field_O, this.field_g, -1, param0, var12 - this.field_a, false, true);
                                    if (var3_int < (var10 & 65535)) {
                                      var10 = (65535 & var10) + ((1 + (var10 >> 1497006928) << 1137221616) + -var3_int);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  if (var9 <= var10) {
                                    break L9;
                                  } else {
                                    var9 = var10;
                                    break L9;
                                  }
                                }
                              }
                              L11: {
                                if (-1 + this.field_a <= var8) {
                                  break L11;
                                } else {
                                  L12: {
                                    var10 = this.field_i[1 + var12] - -pj.a(this.field_a, this.field_m, false, var12, param0.field_O, this.field_g, -1, param0, var12 - -1, false, true);
                                    if ((var10 & 65535) > var3_int) {
                                      var10 = (1 + (var10 >> 379779344) << -1384863760) - -(var10 & 65535) + -var3_int;
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if (var10 >= var9) {
                                    break L11;
                                  } else {
                                    var9 = var10;
                                    break L11;
                                  }
                                }
                              }
                              L13: {
                                if (-1 + this.field_g <= var7) {
                                  break L13;
                                } else {
                                  L14: {
                                    var10 = this.field_i[this.field_a + var12] - -pj.a(this.field_a, this.field_m, false, var12, param0.field_O, this.field_g, -1, param0, var12 - -this.field_a, false, true);
                                    if ((var10 & 65535) <= var3_int) {
                                      break L14;
                                    } else {
                                      var10 = -var3_int + ((var10 >> 114181744) - -1 << -430777392) + (65535 & var10);
                                      break L14;
                                    }
                                  }
                                  if (var9 > var10) {
                                    var9 = var10;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (var9 < this.field_i[var12]) {
                                if (6 >= var9 >> 500845072) {
                                  L15: {
                                    this.field_i[var12] = var9;
                                    if (this.field_n > var7) {
                                      break L15;
                                    } else {
                                      this.field_n = Math.min(var7 + 1, this.field_g + -1);
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    if (this.field_c > var8) {
                                      break L16;
                                    } else {
                                      this.field_c = Math.min(1 + var8, this.field_a + -1);
                                      break L16;
                                    }
                                  }
                                  L17: {
                                    if (this.field_b < var7) {
                                      break L17;
                                    } else {
                                      this.field_b = Math.max(-1 + var7, 0);
                                      break L17;
                                    }
                                  }
                                  L18: {
                                    if (var8 > this.field_e) {
                                      break L18;
                                    } else {
                                      this.field_e = Math.max(-1 + var8, 0);
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (var5 < var9) {
                                      var5 = var9;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  var12++;
                                  var8++;
                                  continue L6;
                                } else {
                                  var12++;
                                  var8++;
                                  continue L6;
                                }
                              } else {
                                var12++;
                                var8++;
                                continue L6;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  break L0;
                }
              } else {
                this.field_i[var3_int] = 268435455;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var3 = decompiledCaughtException;
            stackIn_58_0 = (RuntimeException) (var3);

            stackIn_58_1 = new StringBuilder().append("ir.B(");

            if (param0 == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L20;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L20;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_59_0), stackIn_59_2 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int stackIn_13_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
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
                    L2: {
                      if (param3 != 0) {
                        if (param3 == 0) {
                          L3: {
                            if (-1 > (param4 ^ -1)) {
                              stackIn_28_0 = 1;
                              break L3;
                            } else {
                              stackIn_28_0 = -1;
                              break L3;
                            }
                          }
                          var7 = stackIn_28_0;
                          param4 = param4 * var7;
                          var8 = 1;
                          L4: while (true) {
                            if (var8 >= param4) {
                              break L1;
                            } else {
                              L5: {
                                L6: {
                                  var9 = param0 + (var8 * var7 + param5) * this.field_a;
                                  if (param2) {
                                    break L6;
                                  } else {
                                    if (2 == this.field_m[var9].field_h) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                if (-4 != (this.field_m[var9].field_h ^ -1)) {
                                  var8++;
                                  continue L4;
                                } else {
                                  break L5;
                                }
                              }
                              return false;
                            }
                          }
                        } else {
                          break L2;
                        }
                      } else {
                        if (0 == param4) {
                          return true;
                        } else {
                          if (param3 == 0) {
                            L7: {
                              if (-1 > (param4 ^ -1)) {
                                stackIn_13_0 = 1;
                                break L7;
                              } else {
                                stackIn_13_0 = -1;
                                break L7;
                              }
                            }
                            var7 = stackIn_13_0;
                            param4 = param4 * var7;
                            var8 = 1;
                            L8: while (true) {
                              if (var8 >= param4) {
                                break L1;
                              } else {
                                L9: {
                                  var9 = param0 + (var8 * var7 + param5) * this.field_a;
                                  if (param2) {
                                    break L9;
                                  } else {
                                    if (2 == this.field_m[var9].field_h) {
                                      return false;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                if (-4 != (this.field_m[var9].field_h ^ -1)) {
                                  var8++;
                                  continue L8;
                                } else {
                                  return false;
                                }
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    L10: {
                      if (param1 < -23) {
                        break L10;
                      } else {
                        field_f = (kl) null;
                        break L10;
                      }
                    }
                    if (-1 == (param4 ^ -1)) {
                      L11: {
                        if (-1 <= (param3 ^ -1)) {
                          stackIn_45_0 = -1;
                          break L11;
                        } else {
                          stackIn_45_0 = 1;
                          break L11;
                        }
                      }
                      var7 = stackIn_45_0;
                      param3 = param3 * var7;
                      var8 = 1;
                      L12: while (true) {
                        if (var8 >= param3) {
                          return true;
                        } else {
                          L13: {
                            L14: {
                              var9 = param5 * this.field_a + var7 * var8 + param0;
                              if (param2) {
                                break L14;
                              } else {
                                if (this.field_m[var9].field_h == 2) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            if (this.field_m[var9].field_h == 3) {
                              break L13;
                            } else {
                              var8++;
                              continue L12;
                            }
                          }
                          return false;
                        }
                      }
                    } else {
                      L15: {
                        if (0 < param3) {
                          stackIn_58_0 = 1;
                          break L15;
                        } else {
                          stackIn_58_0 = -1;
                          break L15;
                        }
                      }
                      L16: {
                        var7 = stackIn_58_0;
                        if (0 >= param4) {
                          stackIn_61_0 = -1;
                          break L16;
                        } else {
                          stackIn_61_0 = 1;
                          break L16;
                        }
                      }
                      L17: {
                        var8 = stackIn_61_0;
                        param3 = param3 * var7;
                        param4 = param4 * var8;
                        if (param3 > param4) {
                          var9 = 1;
                          L18: while (true) {
                            if (var9 >= param3) {
                              break L17;
                            } else {
                              L19: {
                                L20: {
                                  var10 = var9 * param4 / param3;
                                  var11 = (var10 * var8 + param5) * this.field_a + var9 * var7 + param0;
                                  if (param2) {
                                    break L20;
                                  } else {
                                    if (this.field_m[var11].field_h == 2) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                if ((this.field_m[var11].field_h ^ -1) == -4) {
                                  break L19;
                                } else {
                                  var9++;
                                  continue L18;
                                }
                              }
                              return false;
                            }
                          }
                        } else {
                          var9 = 1;
                          L21: while (true) {
                            if (param4 <= var9) {
                              break L17;
                            } else {
                              L22: {
                                L23: {
                                  var10 = param3 * var9 / param4;
                                  var11 = (var9 * var8 + param5) * this.field_a + var7 * var10 + param0;
                                  if (param2) {
                                    break L23;
                                  } else {
                                    if (2 == this.field_m[var11].field_h) {
                                      break L22;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                if (-4 != (this.field_m[var11].field_h ^ -1)) {
                                  var9++;
                                  continue L21;
                                } else {
                                  break L22;
                                }
                              }
                              return false;
                            }
                          }
                        }
                      }
                      return true;
                    }
                  }
                  return true;
                }
              }
            }
          }
        }
        return false;
    }

    private final int a(int[] param0, jd param1, int param2, int param3, byte param4) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6_int = 1000000;
            var7 = 1000000;
            if (param4 == 5) {
              L1: {
                if (bw.field_m[param1.field_N][0] != 4) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              var8 = stackIn_7_0;
              var9 = bw.field_m[param1.field_N][6];
              var10 = bw.field_m[param1.field_N][7];
              var11 = -var10;
              L2: while (true) {
                if (var11 > var10) {
                  stackIn_22_0 = var6_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var12 = -var10;
                  L3: while (true) {
                    if (var10 < var12) {
                      var11++;
                      continue L2;
                    } else {
                      var13 = Math.abs(var11) + Math.abs(var12);
                      if (var9 <= var13) {
                        if (var13 <= var10) {
                          if (this.a(param2, -117, var8 != 0, var12, var11, param3)) {
                            var15 = (param3 - -var11) * this.field_a + param2 + var12;
                            var16 = param0[var15];
                            if (var7 > var16) {
                              var6_int = var15;
                              var7 = var16;
                              var12++;
                              continue L3;
                            } else {
                              var12++;
                              continue L3;
                            }
                          } else {
                            var12++;
                            continue L3;
                          }
                        } else {
                          var12++;
                          continue L3;
                        }
                      } else {
                        var12++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = 115;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var6);

            stackIn_25_1 = new StringBuilder().append("ir.C(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
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
                var12 = new int[wg.field_b.length];
                var11 = var12;
                var9 = var11;
                var4 = var9;
                var5 = 0;
                L2: while (true) {
                  if (75 <= var5) {
                    var10 = 0;
                    var5 = var10;
                    L3: while (true) {
                      if (wg.field_b.length <= var10) {
                        break L1;
                      } else {
                        wg.field_b[var10] = new jd(0, 0, var12[var10]);
                        var10++;
                        continue L3;
                      }
                    }
                  } else {
                    L4: {
                      L5: {
                        var6 = bw.field_m[var5][0];
                        var7 = bw.field_m[var5][3];
                        if (var12[var6] == 0) {
                          break L5;
                        } else {
                          if (bw.field_m[var12[var6]][3] >= var7) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var12[var6] = var5;
                      break L4;
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4_ref);

            stackIn_14_1 = new StringBuilder().append("ir.<init>(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        nt stackIn_36_0 = null;
        nt stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        int var13 = 0;
        bv var14 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var14 = mg.field_e;
            var2 = var14.k(0);
            var3 = (nt) ((Object) s.field_a.e((byte) 120));
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 != var3.field_o) {
                    var3 = (nt) ((Object) s.field_a.a((byte) 123));
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 == null) {
                dj.a((byte) -127);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L3: {
                  var4 = var14.k(0);
                  if (var4 == 0) {
                    break L3;
                  } else {
                    var5 = var3.field_q;
                    gm.field_a[0] = mv.field_d;
                    var6_int = 1;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        qu.a(2, var5, var4);
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= var4) {
                            jm.a(var5, 0);
                            dupTemp$0 = new String[2][var5];
                            var3.field_t = dupTemp$0;
                            var6 = dupTemp$0;
                            dupTemp$1 = new int[2][var5 * 4];
                            var3.field_n = dupTemp$1;
                            var7 = dupTemp$1;
                            var8 = kt.field_p;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var9 = 0;
                                var13 = 0;
                                var10 = var13;
                                L7: while (true) {
                                  if (var8 <= var9) {
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = vt.field_m[var5 - -var9];
                                      var6[1][var13] = gm.field_a[var11];
                                      var7[1][4 * var13] = no.field_U[var11];
                                      var7[1][var13 * 4 - -1] = wp.field_w[var11];
                                      var7[1][var13 * 4 + 2] = ci.field_c[var11];
                                      var7[1][var13 * 4 - -3] = pe.field_s[var11];
                                      if (!gt.a(gm.field_a[var11], (byte) 109)) {
                                        break L8;
                                      } else {
                                        if (-1 != (pe.field_s[var11] + (wp.field_w[var11] - -ci.field_c[var11]) ^ -1)) {
                                          break L8;
                                        } else {
                                          var6[1][var13] = null;
                                          var13--;
                                          break L8;
                                        }
                                      }
                                    }
                                    var9++;
                                    var13++;
                                    continue L7;
                                  }
                                }
                              } else {
                                var11 = vt.field_m[var9];
                                var6[0][var10] = gm.field_a[var11];
                                var7[0][var10 * 4] = no.field_U[var11];
                                var7[0][1 + 4 * var10] = wp.field_w[var11];
                                var7[0][var10 * 4 + 2] = ci.field_c[var11];
                                var7[0][3 + var10 * 4] = pe.field_s[var11];
                                if (gt.a(gm.field_a[var11], (byte) 121)) {
                                  L9: {
                                    if (0 == ci.field_c[var11] + wp.field_w[var11] - -pe.field_s[var11]) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  var9++;
                                  var10++;
                                  continue L6;
                                } else {
                                  var9++;
                                  var10++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            L10: {
                              jp.a(var14, -83);
                              if (0 == var6_int) {
                                var3.field_r = rt.field_D;
                                var3.field_s = ov.field_e;
                                var3.field_k = la.field_d;
                                var3.field_m = nk.field_m;
                                ut.a(rt.field_D, nk.field_m, ov.field_e, la.field_d, (byte) 127, var6_int);
                                break L10;
                              } else {
                                ut.a(rt.field_D, nk.field_m, ov.field_e, la.field_d, (byte) 125, var6_int);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        gm.field_a[var6_int] = var14.g(1);
                        var6_int++;
                        continue L4;
                      }
                    }
                  }
                }
                L11: {
                  stackIn_36_0 = (nt) (var3);

                  if (!param0) {
                    stackIn_37_0 = (nt) ((Object) stackIn_36_0);
                    stackIn_37_1 = 0;
                    break L11;
                  } else {
                    stackIn_37_0 = (nt) ((Object) stackIn_36_0);
                    stackIn_37_1 = 1;
                    break L11;
                  }
                }
                stackIn_37_0.field_l = stackIn_37_1 != 0;
                var3.d(50);
                decompiledRegionSelector0 = 1;
                break L0;
              }
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
