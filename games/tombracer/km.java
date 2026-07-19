/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends od {
    private ci[] field_l;
    private ci field_r;
    private ci field_k;
    private ci field_m;
    static fta field_p;
    static String field_n;
    private int[] field_o;
    private int[] field_q;

    final boolean a(cn param0, d param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_7_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_22_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        int stackOut_6_0 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        boolean stackOut_21_0 = false;
        int stackOut_24_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param2 <= gla.field_m) {
                    break L3;
                  } else {
                    var4_int = 0;
                    L4: while (true) {
                      L5: {
                        if (var4_int >= this.field_q.length) {
                          break L5;
                        } else {
                          stackOut_4_0 = param0.a(-15121, this.field_q[var4_int]);
                          stackIn_19_0 = stackOut_4_0 ? 1 : 0;
                          stackIn_5_0 = stackOut_4_0;
                          if (var5 != 0) {
                            break L1;
                          } else {
                            if (stackIn_5_0) {
                              var4_int++;
                              if (var5 == 0) {
                                continue L4;
                              } else {
                                break L5;
                              }
                            } else {
                              stackOut_6_0 = 0;
                              stackIn_7_0 = stackOut_6_0;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            }
                          }
                        }
                      }
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4_int = 0;
                L6: while (true) {
                  if (var4_int >= this.field_q.length) {
                    break L2;
                  } else {
                    stackOut_12_0 = param0.a(gla.field_m, (byte) -106, this.field_q[var4_int]);
                    stackIn_19_0 = stackOut_12_0 ? 1 : 0;
                    stackIn_13_0 = stackOut_12_0;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      if (!stackIn_13_0) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var4_int++;
                        if (var5 == 0) {
                          continue L6;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L1;
            }
            var4_int = stackIn_19_0;
            L7: while (true) {
              L8: {
                L9: {
                  if (var4_int >= this.field_o.length) {
                    break L9;
                  } else {
                    stackOut_21_0 = param1.a(this.field_o[var4_int], (byte) 105);
                    stackIn_28_0 = stackOut_21_0 ? 1 : 0;
                    stackIn_22_0 = stackOut_21_0;
                    if (var5 != 0) {
                      break L8;
                    } else {
                      if (!stackIn_22_0) {
                        stackOut_24_0 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var4_int++;
                        if (var5 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                }
                stackOut_27_0 = 1;
                stackIn_28_0 = stackOut_27_0;
                break L8;
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var4);
            stackOut_29_1 = new StringBuilder().append("km.C(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          L11: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_28_0 != 0;
            } else {
              return stackIn_25_0 != 0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_n = null;
        if (param0 > -95) {
            field_p = (fta) null;
        }
    }

    final float[] a(d param0, byte param1, int param2, int param3, boolean param4, cn param5) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        float[] var7_array = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15_ref_int__ = null;
        int[][] var15_ref_int____ = null;
        int var15 = 0;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        int[][] var19 = null;
        float[] var20 = null;
        int[][] var21 = null;
        int[][] var22 = null;
        int stackIn_9_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_35_0 = 0;
        float[] stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_34_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_24_0 = 0;
        float[] stackOut_38_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var18 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            qw.field_j = param0;
            np.field_m = param5;
            var7_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_l.length <= var7_int) {
                    break L3;
                  } else {
                    this.field_l[var7_int].b(param3, param2, -256);
                    var7_int++;
                    if (var18 != 0) {
                      break L2;
                    } else {
                      if (var18 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                uta.a(0, param2, param3);
                break L2;
              }
              var20 = new float[4 * param2 * param3];
              var7_array = var20;
              var8 = 0;
              var9 = 0;
              L4: while (true) {
                stackOut_8_0 = var9 ^ -1;
                stackIn_9_0 = stackOut_8_0;
                L5: while (true) {
                  L6: {
                    if (stackIn_9_0 <= (param2 ^ -1)) {
                      stackOut_34_0 = -41 / ((-67 - param1) / 38);
                      stackIn_35_0 = stackOut_34_0;
                      break L6;
                    } else {
                      stackOut_10_0 = this.field_k.field_g;
                      stackIn_35_0 = stackOut_10_0 ? 1 : 0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var18 != 0) {
                        break L6;
                      } else {
                        L7: {
                          L8: {
                            if (stackIn_11_0) {
                              break L8;
                            } else {
                              var22 = this.field_k.b(var9, -1);
                              var21 = var22;
                              var19 = var21;
                              var15_ref_int____ = var19;
                              var11 = var22[1];
                              var12 = var22[2];
                              var10_ref_int__ = var22[0];
                              if (var18 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var15_ref_int__ = this.field_k.c(1, var9);
                          var10_ref_int__ = var15_ref_int__;
                          var11 = var15_ref_int__;
                          var12 = var15_ref_int__;
                          break L7;
                        }
                        L9: {
                          L10: {
                            if (this.field_r.field_g) {
                              break L10;
                            } else {
                              var13 = this.field_r.b(var9, -1)[0];
                              if (var18 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var13 = this.field_r.c(1, var9);
                          break L9;
                        }
                        L11: {
                          if (!param4) {
                            break L11;
                          } else {
                            var8 = var9 << 170449506;
                            break L11;
                          }
                        }
                        L12: {
                          L13: {
                            if (this.field_m.field_g) {
                              break L13;
                            } else {
                              var14 = this.field_m.b(var9, -1)[0];
                              if (var18 == 0) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          var14 = this.field_m.c(1, var9);
                          break L12;
                        }
                        var15 = param3 + -1;
                        L14: while (true) {
                          if (var15 < 0) {
                            var9++;
                            continue L4;
                          } else {
                            var16 = (float)var13[var15] / 4096.0f;
                            stackOut_24_0 = (0.0f < var16 ? -1 : (0.0f == var16 ? 0 : 1));
                            stackIn_9_0 = stackOut_24_0;
                            stackIn_25_0 = stackOut_24_0;
                            if (var18 != 0) {
                              continue L5;
                            } else {
                              L15: {
                                L16: {
                                  if (stackIn_25_0 <= 0) {
                                    break L16;
                                  } else {
                                    var16 = 0.0f;
                                    if (var18 == 0) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                if (1.0f < var16) {
                                  var16 = 1.0f;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              L17: {
                                var17 = (1.0f + (float)var14[var15] * 31.0f / 4096.0f) / 4096.0f;
                                incrementValue$4 = var8;
                                var8++;
                                var20[incrementValue$4] = var17 * (float)var10_ref_int__[var15];
                                incrementValue$5 = var8;
                                var8++;
                                var20[incrementValue$5] = var17 * (float)var11[var15];
                                incrementValue$6 = var8;
                                var8++;
                                var20[incrementValue$6] = (float)var12[var15] * var17;
                                incrementValue$7 = var8;
                                var8++;
                                var20[incrementValue$7] = var16;
                                if (!param4) {
                                  break L17;
                                } else {
                                  var8 = var8 + ((param3 << 627931138) - 4);
                                  break L17;
                                }
                              }
                              var15--;
                              continue L14;
                            }
                          }
                        }
                      }
                    }
                  }
                  var10 = stackIn_35_0;
                  var9 = 0;
                  L18: while (true) {
                    L19: {
                      if (var9 >= this.field_l.length) {
                        break L19;
                      } else {
                        this.field_l[var9].b(-54);
                        var9++;
                        if (var18 == 0) {
                          continue L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    stackOut_38_0 = (float[]) (var7_array);
                    stackIn_39_0 = stackOut_38_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var7);
            stackOut_40_1 = new StringBuilder().append("km.D(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L20;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L20;
            }
          }
          L21: {
            stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param5 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L21;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L21;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ')');
        }
        return stackIn_39_0;
    }

    final int[] a(int param0, cn param1, boolean param2, double param3, d param4, byte param5, int param6, boolean param7) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19_ref_int__ = null;
        int[][] var19_ref_int____ = null;
        int var19 = 0;
        int var20 = 0;
        int var24 = 0;
        int[][] var25 = null;
        int[] var26 = null;
        int[][] var27 = null;
        int[][] var28 = null;
        int[] stackIn_8_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_27_0 = 0;
        int[] stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_7_0 = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_26_0 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int[] stackOut_30_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var24 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            qw.field_j = param4;
            np.field_m = param1;
            var10_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_l.length <= var10_int) {
                    break L3;
                  } else {
                    this.field_l[var10_int].b(param6, param0, -256);
                    var10_int++;
                    if (var24 != 0) {
                      break L2;
                    } else {
                      if (var24 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param5 >= 17) {
                  js.a(param3, -256);
                  uta.a(0, param0, param6);
                  break L2;
                } else {
                  stackOut_7_0 = (int[]) null;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              L4: {
                L5: {
                  var26 = new int[param6 * param0];
                  var10_array = var26;
                  if (param2) {
                    break L5;
                  } else {
                    var12 = param6;
                    var11 = 0;
                    var13 = 1;
                    if (var24 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var13 = -1;
                var11 = param6 + -1;
                var12 = -1;
                break L4;
              }
              var14 = 0;
              var15 = 0;
              L6: while (true) {
                stackOut_14_0 = var15;
                stackOut_14_1 = param0;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                L7: while (true) {
                  L8: {
                    if (stackIn_15_0 >= stackIn_15_1) {
                      stackOut_26_0 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      break L8;
                    } else {
                      stackOut_16_0 = this.field_k.field_g;
                      stackIn_27_0 = stackOut_16_0 ? 1 : 0;
                      stackIn_17_0 = stackOut_16_0;
                      if (var24 != 0) {
                        break L8;
                      } else {
                        L9: {
                          L10: {
                            if (stackIn_17_0) {
                              break L10;
                            } else {
                              var28 = this.field_k.b(var15, -1);
                              var27 = var28;
                              var25 = var27;
                              var19_ref_int____ = var25;
                              var16 = var28[0];
                              var17 = var28[1];
                              var18 = var28[2];
                              if (var24 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var19_ref_int__ = this.field_k.c(1, var15);
                          var16 = var19_ref_int__;
                          var18 = var19_ref_int__;
                          var17 = var19_ref_int__;
                          break L9;
                        }
                        L11: {
                          if (!param7) {
                            break L11;
                          } else {
                            var14 = var15;
                            break L11;
                          }
                        }
                        var19 = var11;
                        if (var19 == var12) {
                          var15++;
                          continue L6;
                        } else {
                          var20 = var16[var19] >> 410727716;
                          stackOut_23_0 = -256;
                          stackOut_23_1 = var20 ^ -1;
                          stackIn_15_0 = stackOut_23_0;
                          stackIn_15_1 = stackOut_23_1;
                          continue L7;
                        }
                      }
                    }
                  }
                  var15 = stackIn_27_0;
                  L12: while (true) {
                    L13: {
                      if (var15 >= this.field_l.length) {
                        break L13;
                      } else {
                        this.field_l[var15].b(-50);
                        var15++;
                        if (var24 == 0) {
                          continue L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    stackOut_30_0 = (int[]) (var10_array);
                    stackIn_31_0 = stackOut_30_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var10 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var10);
            stackOut_32_1 = new StringBuilder().append("km.A(").append(param0).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L14;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L14;
            }
          }
          L15: {
            stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param2).append(',').append(param3).append(',');
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
              break L15;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L15;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_31_0;
        }
    }

    km(uia param0) {
        int[] array$3 = null;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        ci var13 = null;
        ci var14 = null;
        ci var15 = null;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.h(255);
            var3 = 0;
            var4 = 0;
            this.field_l = new ci[var2_int];
            var12 = new int[var2_int][];
            var6 = 0;
            L1: while (true) {
              L2: {
                if (var6 >= var2_int) {
                  this.field_q = new int[var3];
                  this.field_o = new int[var4];
                  var3 = 0;
                  var4 = 0;
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                } else {
                  var13 = aw.a(param0, 0);
                  var14 = var13;
                  stackOut_3_0 = var14.a(125);
                  stackIn_15_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var11 != 0) {
                    break L2;
                  } else {
                    L3: {
                      if (stackIn_4_0 < 0) {
                        break L3;
                      } else {
                        var3++;
                        break L3;
                      }
                    }
                    L4: {
                      if (-1 < (var14.c((byte) -117) ^ -1)) {
                        break L4;
                      } else {
                        var4++;
                        break L4;
                      }
                    }
                    var8 = var14.field_j.length;
                    array$3 = new int[var8];
                    var12[var6] = array$3;
                    var9 = 0;
                    L5: while (true) {
                      L6: {
                        if (var8 <= var9) {
                          this.field_l[var6] = var13;
                          var6++;
                          break L6;
                        } else {
                          var12[var6][var9] = param0.h(255);
                          var9++;
                          if (var11 != 0) {
                            break L6;
                          } else {
                            continue L5;
                          }
                        }
                      }
                      continue L1;
                    }
                  }
                }
              }
              var6 = stackIn_15_0;
              L7: while (true) {
                L8: {
                  if (var2_int <= var6) {
                    this.field_k = this.field_l[param0.h(255)];
                    this.field_r = this.field_l[param0.h(255)];
                    var5 = (int[][]) null;
                    this.field_m = this.field_l[param0.h(255)];
                    break L8;
                  } else {
                    var15 = this.field_l[var6];
                    var8 = var15.field_j.length;
                    if (var11 != 0) {
                      break L8;
                    } else {
                      var9 = 0;
                      L9: while (true) {
                        L10: {
                          if (var8 <= var9) {
                            var9 = var15.a(100);
                            break L10;
                          } else {
                            var15.field_j[var9] = this.field_l[var12[var6][var9]];
                            var9++;
                            if (var11 != 0) {
                              break L10;
                            } else {
                              continue L9;
                            }
                          }
                        }
                        L11: {
                          var10 = var15.c((byte) -117);
                          if ((var9 ^ -1) >= -1) {
                            break L11;
                          } else {
                            incrementValue$4 = var3;
                            var3++;
                            this.field_q[incrementValue$4] = var9;
                            break L11;
                          }
                        }
                        L12: {
                          if (0 >= var10) {
                            break L12;
                          } else {
                            incrementValue$5 = var4;
                            var4++;
                            this.field_o[incrementValue$5] = var10;
                            break L12;
                          }
                        }
                        var12[var6] = null;
                        var6++;
                        continue L7;
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
          L13: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var2);
            stackOut_30_1 = new StringBuilder().append("km.<init>(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L13;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L13;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
    }

    final int[] a(int param0, boolean param1, int param2, double param3, cn param4, d param5, boolean param6) {
        int incrementValue$1 = 0;
        RuntimeException var9 = null;
        int var9_int = 0;
        int[] var9_array = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[][] var15 = null;
        int[] var15_array = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[][] var22 = null;
        int[] var23 = null;
        int[][] var24 = null;
        int[][] var25 = null;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_55_0 = 0;
        int[] stackIn_59_0 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_54_0 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int[] stackOut_58_0 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var21 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            qw.field_j = param5;
            np.field_m = param4;
            var9_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_l.length <= var9_int) {
                    break L3;
                  } else {
                    this.field_l[var9_int].b(param0, param2, -256);
                    var9_int++;
                    if (var21 != 0) {
                      break L2;
                    } else {
                      if (var21 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                js.a(param3, -256);
                uta.a(0, param2, param0);
                break L2;
              }
              L4: {
                if (!param6) {
                  break L4;
                } else {
                  this.field_m = (ci) null;
                  break L4;
                }
              }
              var9_array = new int[param0 * param2];
              var10 = 0;
              var11 = 0;
              L5: while (true) {
                stackOut_10_0 = param2;
                stackOut_10_1 = var11;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                L6: while (true) {
                  L7: {
                    if (stackIn_11_0 <= stackIn_11_1) {
                      stackOut_54_0 = 0;
                      stackIn_55_0 = stackOut_54_0;
                      break L7;
                    } else {
                      stackOut_12_0 = this.field_k.field_g;
                      stackIn_55_0 = stackOut_12_0 ? 1 : 0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var21 != 0) {
                        break L7;
                      } else {
                        L8: {
                          L9: {
                            if (!stackIn_13_0) {
                              break L9;
                            } else {
                              var23 = this.field_k.c(1, var11);
                              var15_array = var23;
                              var14 = var23;
                              var12 = var23;
                              var13 = var23;
                              if (var21 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var25 = this.field_k.b(var11, -1);
                          var24 = var25;
                          var22 = var24;
                          var15 = var22;
                          var13 = var25[1];
                          var12 = var25[0];
                          var14 = var25[2];
                          break L8;
                        }
                        L10: {
                          L11: {
                            if (this.field_r.field_g) {
                              break L11;
                            } else {
                              var15_array = this.field_r.b(var11, -1)[0];
                              if (var21 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          var15_array = this.field_r.c(1, var11);
                          break L10;
                        }
                        L12: {
                          if (!param1) {
                            break L12;
                          } else {
                            var10 = var11;
                            break L12;
                          }
                        }
                        var16 = -1 + param0;
                        L13: while (true) {
                          L14: {
                            if (-1 < (var16 ^ -1)) {
                              break L14;
                            } else {
                              var17 = var12[var16] >> 1855972;
                              stackOut_23_0 = -256;
                              stackOut_23_1 = var17 ^ -1;
                              stackIn_11_0 = stackOut_23_0;
                              stackIn_11_1 = stackOut_23_1;
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              if (var21 != 0) {
                                continue L6;
                              } else {
                                L15: {
                                  if (stackIn_24_0 > stackIn_24_1) {
                                    var17 = 255;
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                L16: {
                                  if (0 > var17) {
                                    var17 = 0;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                L17: {
                                  var18 = var13[var16] >> 103167844;
                                  if ((var18 ^ -1) >= -256) {
                                    break L17;
                                  } else {
                                    var18 = 255;
                                    break L17;
                                  }
                                }
                                L18: {
                                  if (0 <= var18) {
                                    break L18;
                                  } else {
                                    var18 = 0;
                                    break L18;
                                  }
                                }
                                L19: {
                                  var19 = var14[var16] >> 1420546980;
                                  if (-256 <= (var19 ^ -1)) {
                                    break L19;
                                  } else {
                                    var19 = 255;
                                    break L19;
                                  }
                                }
                                L20: {
                                  var17 = sk.field_c[var17];
                                  var18 = sk.field_c[var18];
                                  if (var19 >= 0) {
                                    break L20;
                                  } else {
                                    var19 = 0;
                                    break L20;
                                  }
                                }
                                L21: {
                                  L22: {
                                    L23: {
                                      var19 = sk.field_c[var19];
                                      if (-1 != (var17 ^ -1)) {
                                        break L23;
                                      } else {
                                        if (var18 != 0) {
                                          break L23;
                                        } else {
                                          if (var19 == 0) {
                                            break L22;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                    }
                                    L24: {
                                      var20 = var15_array[var16] >> -1446832988;
                                      if ((var20 ^ -1) < -256) {
                                        var20 = 255;
                                        break L24;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    if (-1 < (var20 ^ -1)) {
                                      var20 = 0;
                                      if (var21 == 0) {
                                        break L21;
                                      } else {
                                        break L22;
                                      }
                                    } else {
                                      break L21;
                                    }
                                  }
                                  var20 = 0;
                                  break L21;
                                }
                                L25: {
                                  incrementValue$1 = var10;
                                  var10++;
                                  var9_array[incrementValue$1] = var19 + ((var18 << 1514685224) + ((var17 << -1006888912) + (var20 << -2094779528)));
                                  if (param1) {
                                    var10 = var10 + (param0 + -1);
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                }
                                var16--;
                                if (var21 == 0) {
                                  continue L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          var11++;
                          continue L5;
                        }
                      }
                    }
                  }
                  var11 = stackIn_55_0;
                  L26: while (true) {
                    L27: {
                      if (var11 >= this.field_l.length) {
                        break L27;
                      } else {
                        this.field_l[var11].b(-126);
                        var11++;
                        if (var21 == 0) {
                          continue L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    stackOut_58_0 = (int[]) (var9_array);
                    stackIn_59_0 = stackOut_58_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var9 = decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) (var9);
            stackOut_60_1 = new StringBuilder().append("km.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param4 == null) {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L28;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L28;
            }
          }
          L29: {
            stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
            stackOut_63_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(',');
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param5 == null) {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L29;
            } else {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L29;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ',' + param6 + ')');
        }
        return stackIn_59_0;
    }

    static {
        field_n = "LASER stands for Light Amplification by Stimulated Emission of Radiation. Misuse of a LASER can turn a PLAYER into TOAST.";
    }
}
