/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    static mh field_a;
    static String field_d;
    static int field_b;
    static rg field_c;

    final static void a(int param0, int param1, int param2, int param3, jp[] param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        var22 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param4 != null) {
              L1: {
                if (-1 <= (param0 ^ -1)) {
                  break L1;
                } else {
                  if ((param1 ^ -1) >= -1) {
                    break L1;
                  } else {
                    L2: {
                      if (param4[3] != null) {
                        stackOut_9_0 = param4[3].field_x;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (param4[5] == null) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = param4[5].field_x;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    var7 = stackIn_13_0;
                    if (param2 == -40) {
                      L4: {
                        if (null == param4[1]) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L4;
                        } else {
                          stackOut_16_0 = param4[1].field_z;
                          stackIn_18_0 = stackOut_16_0;
                          break L4;
                        }
                      }
                      L5: {
                        var8 = stackIn_18_0;
                        if (param4[7] != null) {
                          stackOut_20_0 = param4[7].field_z;
                          stackIn_21_0 = stackOut_20_0;
                          break L5;
                        } else {
                          stackOut_19_0 = 0;
                          stackIn_21_0 = stackOut_19_0;
                          break L5;
                        }
                      }
                      L6: {
                        var9 = stackIn_21_0;
                        var10 = param0 + param3;
                        var11 = param5 + param1;
                        var12 = var6_int + param3;
                        var13 = -var7 + var10;
                        var14 = var8 + param5;
                        var15 = var11 + -var9;
                        var16 = var12;
                        var17 = var13;
                        if ((var16 ^ -1) < (var17 ^ -1)) {
                          var17 = param0 * var6_int / (var7 + var6_int) + param3;
                          var16 = param0 * var6_int / (var7 + var6_int) + param3;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        var18 = var14;
                        var19 = var15;
                        if (var19 >= var18) {
                          break L7;
                        } else {
                          var19 = param1 * var8 / (var8 + var9) + param5;
                          var18 = param1 * var8 / (var8 + var9) + param5;
                          break L7;
                        }
                      }
                      L8: {
                        lb.a(rg.field_g);
                        if (null == param4[0]) {
                          break L8;
                        } else {
                          lb.d(param3, param5, var16, var18);
                          param4[0].c(param3, param5);
                          lb.b(rg.field_g);
                          break L8;
                        }
                      }
                      L9: {
                        if (null == param4[2]) {
                          break L9;
                        } else {
                          lb.d(var17, param5, var10, var18);
                          param4[2].c(var13, param5);
                          lb.b(rg.field_g);
                          break L9;
                        }
                      }
                      L10: {
                        if (null == param4[6]) {
                          break L10;
                        } else {
                          lb.d(param3, var19, var16, var11);
                          param4[6].c(param3, var15);
                          lb.b(rg.field_g);
                          break L10;
                        }
                      }
                      L11: {
                        if (param4[8] != null) {
                          lb.d(var17, var19, var10, var11);
                          param4[8].c(var13, var15);
                          lb.b(rg.field_g);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (param4[1] == null) {
                          break L12;
                        } else {
                          if (0 != param4[1].field_x) {
                            lb.d(var16, param5, var17, var18);
                            var20 = var12;
                            L13: while (true) {
                              L14: {
                                if (var13 <= var20) {
                                  break L14;
                                } else {
                                  param4[1].c(var20, param5);
                                  var20 = var20 + param4[1].field_x;
                                  if (var22 != 0) {
                                    break L12;
                                  } else {
                                    if (var22 == 0) {
                                      continue L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              lb.b(rg.field_g);
                              break L12;
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                      L15: {
                        if (param4[7] == null) {
                          break L15;
                        } else {
                          if (param4[7].field_x != 0) {
                            lb.d(var16, var19, var17, var11);
                            var20 = var12;
                            L16: while (true) {
                              L17: {
                                if ((var13 ^ -1) >= (var20 ^ -1)) {
                                  break L17;
                                } else {
                                  param4[7].c(var20, var15);
                                  var20 = var20 + param4[7].field_x;
                                  if (var22 != 0) {
                                    break L15;
                                  } else {
                                    if (var22 == 0) {
                                      continue L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                              }
                              lb.b(rg.field_g);
                              break L15;
                            }
                          } else {
                            break L15;
                          }
                        }
                      }
                      L18: {
                        if (param4[3] == null) {
                          break L18;
                        } else {
                          if (-1 != (param4[3].field_z ^ -1)) {
                            lb.d(param3, var18, var16, var19);
                            var20 = var14;
                            L19: while (true) {
                              L20: {
                                if (var20 >= var15) {
                                  break L20;
                                } else {
                                  param4[3].c(param3, var20);
                                  var20 = var20 + param4[3].field_z;
                                  if (var22 != 0) {
                                    break L18;
                                  } else {
                                    if (var22 == 0) {
                                      continue L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                              lb.b(rg.field_g);
                              break L18;
                            }
                          } else {
                            break L18;
                          }
                        }
                      }
                      L21: {
                        if (null == param4[5]) {
                          break L21;
                        } else {
                          if (param4[5].field_z != 0) {
                            lb.d(var17, var18, var10, var19);
                            var20 = var14;
                            L22: while (true) {
                              L23: {
                                if (var15 <= var20) {
                                  break L23;
                                } else {
                                  param4[5].c(var13, var20);
                                  var20 = var20 + param4[5].field_z;
                                  if (var22 != 0) {
                                    break L21;
                                  } else {
                                    if (var22 == 0) {
                                      continue L22;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                              }
                              lb.b(rg.field_g);
                              break L21;
                            }
                          } else {
                            break L21;
                          }
                        }
                      }
                      L24: {
                        if (null == param4[4]) {
                          break L24;
                        } else {
                          if (param4[4].field_x == 0) {
                            break L24;
                          } else {
                            if ((param4[4].field_z ^ -1) == -1) {
                              break L24;
                            } else {
                              lb.d(var16, var18, var17, var19);
                              var20 = var14;
                              L25: while (true) {
                                L26: {
                                  if ((var20 ^ -1) <= (var15 ^ -1)) {
                                    break L26;
                                  } else {
                                    if (var22 != 0) {
                                      break L24;
                                    } else {
                                      var21 = var12;
                                      L27: while (true) {
                                        L28: {
                                          L29: {
                                            if ((var21 ^ -1) <= (var13 ^ -1)) {
                                              break L29;
                                            } else {
                                              param4[4].c(var21, var20);
                                              var21 = var21 + param4[4].field_x;
                                              if (var22 != 0) {
                                                break L28;
                                              } else {
                                                if (var22 == 0) {
                                                  continue L27;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                            }
                                          }
                                          var20 = var20 + param4[4].field_z;
                                          break L28;
                                        }
                                        if (var22 == 0) {
                                          continue L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                }
                                lb.b(rg.field_g);
                                break L24;
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
          L30: {
            var6 = decompiledCaughtException;
            stackOut_86_0 = (RuntimeException) (var6);
            stackOut_86_1 = new StringBuilder().append("nh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_88_0 = stackOut_86_0;
            stackIn_88_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param4 == null) {
              stackOut_88_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackOut_88_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L30;
            } else {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "{...}";
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              break L30;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_89_0), stackIn_89_2 + ',' + param5 + ')');
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

    final static void a(jp[] param0, int param1, int param2, int param3, int param4, dh param5, int param6, int param7, int param8, jp[] param9, int param10, jp[] param11, int param12, byte param13, int param14) {
        int var15_int = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        jp[] var17 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var15_int = param5.field_B - -param5.field_P;
              var16 = param5.field_B;
              if (param13 == -110) {
                break L1;
              } else {
                var17 = (jp[]) null;
                nh.a((jp[]) null, -71, 62, -50, 61, (dh) null, 97, 90, 79, (jp[]) null, 117, (jp[]) null, 81, (byte) 46, -119);
                break L1;
              }
            }
            oa.a(param3, var15_int, param10, param2, var15_int, param12, param1, param7, param4, param0, param5, param11, param8, param6, var16, false, param14, param9, param5, var16);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var15);
            stackOut_4_1 = new StringBuilder().append("nh.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param9 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param10).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param11 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        mh var6 = null;
        mh var7 = null;
        mh var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var13_ref_String = null;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        vl var17 = null;
        Object var18 = null;
        id var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        jp[] var20 = null;
        int[] var21 = null;
        mh var23 = null;
        int[] var24 = null;
        String var25 = null;
        int[] var26 = null;
        mh var27 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        mh stackIn_21_0 = null;
        mh stackIn_22_0 = null;
        mh stackIn_23_0 = null;
        mh stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_73_0 = 0;
        boolean stackIn_81_0 = false;
        int stackIn_87_0 = 0;
        boolean stackIn_133_0 = false;
        int stackIn_153_0 = 0;
        mh stackIn_171_0 = null;
        mh stackIn_172_0 = null;
        mh stackIn_173_0 = null;
        mh stackIn_174_0 = null;
        mh stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        mh stackIn_176_0 = null;
        mh stackIn_177_0 = null;
        mh stackIn_178_0 = null;
        mh stackIn_179_0 = null;
        mh stackIn_180_0 = null;
        int stackIn_180_1 = 0;
        mh stackIn_181_0 = null;
        mh stackIn_182_0 = null;
        mh stackIn_183_0 = null;
        mh stackIn_184_0 = null;
        mh stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        mh stackOut_20_0 = null;
        mh stackOut_21_0 = null;
        mh stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        mh stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_72_0 = 0;
        boolean stackOut_80_0 = false;
        int stackOut_86_0 = 0;
        boolean stackOut_132_0 = false;
        int stackOut_152_0 = 0;
        mh stackOut_170_0 = null;
        mh stackOut_171_0 = null;
        mh stackOut_172_0 = null;
        mh stackOut_173_0 = null;
        int stackOut_173_1 = 0;
        mh stackOut_174_0 = null;
        int stackOut_174_1 = 0;
        mh stackOut_175_0 = null;
        mh stackOut_176_0 = null;
        mh stackOut_177_0 = null;
        mh stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        mh stackOut_179_0 = null;
        int stackOut_179_1 = 0;
        mh stackOut_180_0 = null;
        mh stackOut_181_0 = null;
        mh stackOut_182_0 = null;
        mh stackOut_183_0 = null;
        int stackOut_183_1 = 0;
        mh stackOut_184_0 = null;
        int stackOut_184_1 = 0;
        var18 = null;
        var19 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = eg.field_m;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param0) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              co.a(stackIn_4_0, stackIn_4_1 != 0);
              if (o.field_e != null) {
                L3: {
                  L4: {
                    ij.field_e.field_eb = true;
                    var23 = pf.field_h;
                    var27 = var23;
                    pf.field_h.field_cb = 0;
                    var27.field_Ib = 0;
                    dn.field_K.field_cb = 0;
                    var6 = dn.field_K;
                    var6.field_Ib = 0;
                    var7 = ke.field_e;
                    ke.field_e.field_cb = 0;
                    var7.field_Ib = 0;
                    if (hn.b((byte) 7)) {
                      break L4;
                    } else {
                      var9_ref_String = o.field_e.field_Fc;
                      ba.field_v.field_Mb = rd.a(fm.field_a, new String[]{var9_ref_String}, (byte) 103).toUpperCase();
                      ke.field_e.a(40, ak.field_d.field_cb + -40, 0, ak.field_d.field_Ib, (byte) 64);
                      ke.field_e.field_Mb = rd.a(nm.field_a, new String[]{var9_ref_String}, (byte) 103);
                      var8 = ke.field_e;
                      if (var19 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      ba.field_v.field_Mb = ba.field_x.toUpperCase();
                      var9 = (ak.field_d.field_Ib - -2) / 2;
                      pf.field_h.a(40, ak.field_d.field_cb + -40, 0, -2 + var9, (byte) 64);
                      if ((o.field_e.field_jc ^ -1) < (o.field_e.field_cc ^ -1)) {
                        break L6;
                      } else {
                        pf.field_h.field_Mb = wg.field_d.toUpperCase();
                        pf.field_h.field_eb = false;
                        if (var19 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    pf.field_h.field_Mb = lq.field_a.toUpperCase();
                    pf.field_h.field_eb = true;
                    break L5;
                  }
                  L7: {
                    pf.field_h.field_Jb = fm.field_b.field_Jb;
                    if ((uf.field_c ^ -1) < -1) {
                      L8: {
                        L9: {
                          if ((uf.field_c ^ -1) != -2) {
                            break L9;
                          } else {
                            var10_ref_String = ei.field_g;
                            if (var19 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var10_ref_String = rd.a(mq.field_h, new String[]{Integer.toString(uf.field_c)}, (byte) 103);
                        break L8;
                      }
                      pf.field_h.field_Mb = pf.field_h.field_Mb + "<br>" + var10_ref_String;
                      if (-1 != (an.field_h & 16 ^ -1)) {
                        break L7;
                      } else {
                        if (hc.field_c) {
                          break L7;
                        } else {
                          pf.field_h.field_Jb = fm.field_b.field_Gb;
                          break L7;
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                  L10: {
                    L11: {
                      dn.field_K.a(40, ak.field_d.field_cb + -40, var9, ak.field_d.field_Ib + -var9, (byte) 64);
                      dn.field_K.field_Mb = sn.field_r.toUpperCase();
                      var8 = dn.field_K;
                      stackOut_20_0 = dn.field_K;
                      stackIn_23_0 = stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (!param4) {
                        break L11;
                      } else {
                        stackOut_21_0 = (mh) ((Object) stackIn_21_0);
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_22_0 = stackOut_21_0;
                        if ((ic.field_b ^ -1L) != -1L) {
                          break L11;
                        } else {
                          stackOut_22_0 = (mh) ((Object) stackIn_22_0);
                          stackOut_22_1 = 1;
                          stackIn_24_0 = stackOut_22_0;
                          stackIn_24_1 = stackOut_22_1;
                          break L10;
                        }
                      }
                    }
                    stackOut_23_0 = (mh) ((Object) stackIn_23_0);
                    stackOut_23_1 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    break L10;
                  }
                  L12: {
                    stackIn_24_0.field_eb = stackIn_24_1 != 0;
                    var10 = 2;
                    if (null == br.field_bc) {
                      break L12;
                    } else {
                      L13: {
                        if (qo.field_J == null) {
                          h.field_D = new boolean[cq.field_p];
                          qo.field_J = new byte[cq.field_p];
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      var11 = 0;
                      L14: while (true) {
                        L15: {
                          L16: {
                            if (cq.field_p <= var11) {
                              break L16;
                            } else {
                              h.field_D[var11] = false;
                              var11++;
                              if (var19 != 0) {
                                break L15;
                              } else {
                                if (var19 == 0) {
                                  continue L14;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          var10 = 0;
                          break L15;
                        }
                        L17: while (true) {
                          L18: {
                            L19: {
                              if (var10 >= 2) {
                                break L19;
                              } else {
                                var11 = 0;
                                stackOut_36_0 = 0;
                                stackIn_73_0 = stackOut_36_0;
                                stackIn_37_0 = stackOut_36_0;
                                if (var19 != 0) {
                                  break L18;
                                } else {
                                  var12 = stackIn_37_0;
                                  L20: while (true) {
                                    stackOut_38_0 = br.field_bc.length;
                                    stackOut_38_1 = var12;
                                    stackIn_39_0 = stackOut_38_0;
                                    stackIn_39_1 = stackOut_38_1;
                                    L21: while (true) {
                                      L22: {
                                        L23: {
                                          if (stackIn_39_0 <= stackIn_39_1) {
                                            break L23;
                                          } else {
                                            var26 = br.field_bc[var12];
                                            var24 = var26;
                                            var21 = var24;
                                            var13_ref_int__ = var21;
                                            stackOut_40_0 = 0;
                                            stackIn_67_0 = stackOut_40_0;
                                            stackIn_41_0 = stackOut_40_0;
                                            if (var19 != 0) {
                                              break L22;
                                            } else {
                                              var14 = stackIn_41_0;
                                              L24: while (true) {
                                                L25: {
                                                  L26: {
                                                    L27: {
                                                      if ((var26.length ^ -1) >= (var14 ^ -1)) {
                                                        break L27;
                                                      } else {
                                                        var15 = var26[var14];
                                                        var16 = var21[var14 - -1];
                                                        stackOut_43_0 = var15;
                                                        stackOut_43_1 = -1;
                                                        stackIn_58_0 = stackOut_43_0;
                                                        stackIn_58_1 = stackOut_43_1;
                                                        stackIn_44_0 = stackOut_43_0;
                                                        stackIn_44_1 = stackOut_43_1;
                                                        if (var19 != 0) {
                                                          break L26;
                                                        } else {
                                                          L28: {
                                                            L29: {
                                                              if (stackIn_44_0 == stackIn_44_1) {
                                                                break L29;
                                                              } else {
                                                                if ((o.field_e.field_Tb[var15] & 255 ^ -1) == (var16 ^ -1)) {
                                                                  break L28;
                                                                } else {
                                                                  if (var19 == 0) {
                                                                    break L25;
                                                                  } else {
                                                                    break L29;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            L30: {
                                                              if (var10 != 0) {
                                                                stackOut_50_0 = o.field_e.field_cc;
                                                                stackIn_51_0 = stackOut_50_0;
                                                                break L30;
                                                              } else {
                                                                stackOut_49_0 = o.field_e.field_jc;
                                                                stackIn_51_0 = stackOut_49_0;
                                                                break L30;
                                                              }
                                                            }
                                                            var17_int = stackIn_51_0;
                                                            if (var17_int == var16) {
                                                              break L28;
                                                            } else {
                                                              if (var19 == 0) {
                                                                break L25;
                                                              } else {
                                                                break L28;
                                                              }
                                                            }
                                                          }
                                                          var14 += 2;
                                                          if (var19 == 0) {
                                                            continue L24;
                                                          } else {
                                                            break L27;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var11 = 1;
                                                    var14 = -1;
                                                    var15 = 0;
                                                    stackOut_57_0 = var15;
                                                    stackOut_57_1 = var26.length;
                                                    stackIn_58_0 = stackOut_57_0;
                                                    stackIn_58_1 = stackOut_57_1;
                                                    break L26;
                                                  }
                                                  L31: while (true) {
                                                    L32: {
                                                      if (stackIn_58_0 >= stackIn_58_1) {
                                                        break L32;
                                                      } else {
                                                        var16 = var26[var15];
                                                        stackOut_59_0 = var16 ^ -1;
                                                        stackOut_59_1 = var14 ^ -1;
                                                        stackIn_39_0 = stackOut_59_0;
                                                        stackIn_39_1 = stackOut_59_1;
                                                        stackIn_60_0 = stackOut_59_0;
                                                        stackIn_60_1 = stackOut_59_1;
                                                        if (var19 != 0) {
                                                          continue L21;
                                                        } else {
                                                          L33: {
                                                            if (stackIn_60_0 < stackIn_60_1) {
                                                              var14 = var16;
                                                              break L33;
                                                            } else {
                                                              break L33;
                                                            }
                                                          }
                                                          var15 += 2;
                                                          if (var19 == 0) {
                                                            stackOut_57_0 = var15;
                                                            stackOut_57_1 = var26.length;
                                                            stackIn_58_0 = stackOut_57_0;
                                                            stackIn_58_1 = stackOut_57_1;
                                                            continue L31;
                                                          } else {
                                                            break L32;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    h.field_D[var14] = true;
                                                    break L25;
                                                  }
                                                }
                                                var12++;
                                                if (var19 == 0) {
                                                  continue L20;
                                                } else {
                                                  break L23;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_66_0 = var11;
                                        stackIn_67_0 = stackOut_66_0;
                                        break L22;
                                      }
                                      L34: {
                                        if (stackIn_67_0 == 0) {
                                          break L34;
                                        } else {
                                          if (var19 == 0) {
                                            break L19;
                                          } else {
                                            break L34;
                                          }
                                        }
                                      }
                                      var10++;
                                      if (var19 == 0) {
                                        continue L17;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_72_0 = 2;
                            stackIn_73_0 = stackOut_72_0;
                            break L18;
                          }
                          if (stackIn_73_0 > kb.field_Yb) {
                            break L12;
                          } else {
                            if (!pe.field_l[12]) {
                              break L12;
                            } else {
                              var10 = 2;
                              break L12;
                            }
                          }
                        }
                      }
                    }
                  }
                  L35: {
                    if (var10 >= 2) {
                      break L35;
                    } else {
                      dn.field_K.field_eb = false;
                      if (!dn.field_K.field_G) {
                        break L3;
                      } else {
                        var11_ref = null;
                        var12 = 0;
                        var13 = 0;
                        L36: while (true) {
                          L37: {
                            L38: {
                              if ((cq.field_p ^ -1) >= (var13 ^ -1)) {
                                break L38;
                              } else {
                                stackOut_80_0 = h.field_D[var13];
                                stackIn_87_0 = stackOut_80_0 ? 1 : 0;
                                stackIn_81_0 = stackOut_80_0;
                                if (var19 != 0) {
                                  break L37;
                                } else {
                                  L39: {
                                    if (!stackIn_81_0) {
                                      break L39;
                                    } else {
                                      L40: {
                                        var25 = "<col=A00000>" + rg.field_b[var13] + "</col>";
                                        if (var11_ref == null) {
                                          break L40;
                                        } else {
                                          var11_ref = (String) (var11_ref) + ", " + var25;
                                          var12 = 1;
                                          if (var19 == 0) {
                                            break L39;
                                          } else {
                                            break L40;
                                          }
                                        }
                                      }
                                      var11_ref = var25;
                                      break L39;
                                    }
                                  }
                                  var13++;
                                  if (var19 == 0) {
                                    continue L36;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                            }
                            stackOut_86_0 = -1;
                            stackIn_87_0 = stackOut_86_0;
                            break L37;
                          }
                          L41: {
                            if (stackIn_87_0 != (var10 ^ -1)) {
                              L42: {
                                var13_ref_String = bh.field_rb;
                                if (var12 != 0) {
                                  break L42;
                                } else {
                                  var14_ref_String = rd.a(br.field_ac, new String[]{(String) (var11_ref)}, (byte) 103);
                                  if (var19 == 0) {
                                    break L41;
                                  } else {
                                    break L42;
                                  }
                                }
                              }
                              var14_ref_String = ff.field_e + (String) (var11_ref);
                              break L41;
                            } else {
                              L43: {
                                var13_ref_String = eq.field_b;
                                if (var12 == 0) {
                                  break L43;
                                } else {
                                  var14_ref_String = ki.field_g + (String) (var11_ref);
                                  if (var19 == 0) {
                                    break L41;
                                  } else {
                                    break L43;
                                  }
                                }
                              }
                              var14_ref_String = rd.a(gk.field_b, new String[]{(String) (var11_ref)}, (byte) 103);
                              break L41;
                            }
                          }
                          ep.field_e = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                          if (var19 == 0) {
                            break L3;
                          } else {
                            break L35;
                          }
                        }
                      }
                    }
                  }
                  L44: {
                    if (null != vl.field_a) {
                      break L44;
                    } else {
                      if (bl.field_F != null) {
                        break L44;
                      } else {
                        if (ld.field_v != null) {
                          break L44;
                        } else {
                          if (null != me.field_e) {
                            break L44;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  var11 = 0;
                  var12 = 0;
                  var13 = 0;
                  var14 = 0;
                  var15 = 0;
                  var16 = 0;
                  L45: while (true) {
                    L46: {
                      L47: {
                        if (cq.field_p <= var16) {
                          break L47;
                        } else {
                          var17_int = 255 & o.field_e.field_Tb[var16];
                          if (var19 != 0) {
                            break L46;
                          } else {
                            L48: {
                              if (vl.field_a == null) {
                                break L48;
                              } else {
                                if (vl.field_a[var16] != null) {
                                  if (vl.field_a[var16][var17_int]) {
                                    var11 = 1;
                                    break L48;
                                  } else {
                                    break L48;
                                  }
                                } else {
                                  break L48;
                                }
                              }
                            }
                            L49: {
                              if (bl.field_F == null) {
                                break L49;
                              } else {
                                if (null == bl.field_F[var16]) {
                                  break L49;
                                } else {
                                  L50: {
                                    var18_int = bl.field_F[var16][var17_int];
                                    if (-1 == (var18_int ^ -1)) {
                                      break L50;
                                    } else {
                                      if (ea.field_g) {
                                        break L50;
                                      } else {
                                        var11 = 1;
                                        break L50;
                                      }
                                    }
                                  }
                                  if (var18_int <= var13) {
                                    break L49;
                                  } else {
                                    var13 = var18_int;
                                    break L49;
                                  }
                                }
                              }
                            }
                            L51: {
                              if (ld.field_v == null) {
                                break L51;
                              } else {
                                if (ld.field_v[var16] != null) {
                                  L52: {
                                    var18_int = ld.field_v[var16][var17_int];
                                    if (var18_int == 0) {
                                      break L52;
                                    } else {
                                      if (!ea.field_g) {
                                        var11 = 1;
                                        break L52;
                                      } else {
                                        break L52;
                                      }
                                    }
                                  }
                                  if (var14 >= var18_int) {
                                    break L51;
                                  } else {
                                    var14 = var18_int;
                                    break L51;
                                  }
                                } else {
                                  break L51;
                                }
                              }
                            }
                            L53: {
                              if (null == me.field_e) {
                                break L53;
                              } else {
                                if (me.field_e[var16] == null) {
                                  break L53;
                                } else {
                                  var15 = var15 | me.field_e[var16][var17_int];
                                  break L53;
                                }
                              }
                            }
                            var16++;
                            if (var19 == 0) {
                              continue L45;
                            } else {
                              break L47;
                            }
                          }
                        }
                      }
                      var16 = 0;
                      break L46;
                    }
                    var17 = vp.field_u.field_Rb.field_bb;
                    var18_ref = (id) ((Object) var17.d(-97));
                    L54: while (true) {
                      L55: {
                        L56: {
                          if (var18_ref == null) {
                            break L56;
                          } else {
                            stackOut_132_0 = var18_ref.i(0);
                            stackIn_153_0 = stackOut_132_0 ? 1 : 0;
                            stackIn_133_0 = stackOut_132_0;
                            if (var19 != 0) {
                              break L55;
                            } else {
                              L57: {
                                L58: {
                                  if (!stackIn_133_0) {
                                    break L58;
                                  } else {
                                    if (var19 == 0) {
                                      break L57;
                                    } else {
                                      break L58;
                                    }
                                  }
                                }
                                L59: {
                                  if (var11 == 0) {
                                    break L59;
                                  } else {
                                    if (!var18_ref.field_ec) {
                                      var16 = 1;
                                      if (var19 == 0) {
                                        break L56;
                                      } else {
                                        break L59;
                                      }
                                    } else {
                                      break L59;
                                    }
                                  }
                                }
                                L60: {
                                  if (var13 > var18_ref.field_Wb) {
                                    var16 = 1;
                                    if (var19 == 0) {
                                      break L56;
                                    } else {
                                      break L60;
                                    }
                                  } else {
                                    break L60;
                                  }
                                }
                                L61: {
                                  if (var18_ref.field_ac < var14) {
                                    var16 = 1;
                                    if (var19 == 0) {
                                      break L56;
                                    } else {
                                      break L61;
                                    }
                                  } else {
                                    break L61;
                                  }
                                }
                                L62: {
                                  if ((var15 & (var18_ref.field_Ub ^ -1)) > 0) {
                                    var16 = 1;
                                    if (var19 == 0) {
                                      break L56;
                                    } else {
                                      break L62;
                                    }
                                  } else {
                                    break L62;
                                  }
                                }
                                if (var12 == 0) {
                                  break L57;
                                } else {
                                  var16 = 1;
                                  if (var19 == 0) {
                                    break L56;
                                  } else {
                                    break L57;
                                  }
                                }
                              }
                              var18_ref = (id) ((Object) var17.a((byte) 116));
                              if (var19 == 0) {
                                continue L54;
                              } else {
                                break L56;
                              }
                            }
                          }
                        }
                        stackOut_152_0 = 2;
                        stackIn_153_0 = stackOut_152_0;
                        break L55;
                      }
                      L63: {
                        if (stackIn_153_0 > kb.field_Yb) {
                          break L63;
                        } else {
                          if (pe.field_l[12]) {
                            var16 = 0;
                            break L63;
                          } else {
                            break L63;
                          }
                        }
                      }
                      if (var16 != 0) {
                        dn.field_K.field_eb = false;
                        if (!dn.field_K.field_G) {
                          break L3;
                        } else {
                          L64: {
                            if (sb.field_c.field_d.field_Vb == 0) {
                              break L64;
                            } else {
                              ep.field_e = rd.a(ta.field_d, new String[]{mh.field_Z}, (byte) 103);
                              if (var19 == 0) {
                                break L3;
                              } else {
                                break L64;
                              }
                            }
                          }
                          ep.field_e = ei.field_a;
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L65: {
                  if (0L != ic.field_b) {
                    L66: {
                      var9 = (int)(ic.field_b + -ue.a(false));
                      var9 = (var9 + 999) / 1000;
                      if (1 <= var9) {
                        break L66;
                      } else {
                        var9 = 1;
                        break L66;
                      }
                    }
                    var8.field_Mb = rd.a(mn.field_w, new String[]{Integer.toString(var9)}, (byte) 103);
                    break L65;
                  } else {
                    break L65;
                  }
                }
                um.field_b.field_Mb = rd.a(rl.field_d, new String[]{Integer.toString(o.field_e.field_cc), Integer.toString(o.field_e.field_jc)}, (byte) 103);
                break L2;
              } else {
                break L2;
              }
            }
            L67: {
              L68: {
                stackOut_170_0 = qa.field_w;
                stackIn_174_0 = stackOut_170_0;
                stackIn_171_0 = stackOut_170_0;
                if (!param2) {
                  break L68;
                } else {
                  stackOut_171_0 = (mh) ((Object) stackIn_171_0);
                  stackIn_174_0 = stackOut_171_0;
                  stackIn_172_0 = stackOut_171_0;
                  if (param1) {
                    break L68;
                  } else {
                    stackOut_172_0 = (mh) ((Object) stackIn_172_0);
                    stackIn_174_0 = stackOut_172_0;
                    stackIn_173_0 = stackOut_172_0;
                    if (hc.field_c) {
                      break L68;
                    } else {
                      stackOut_173_0 = (mh) ((Object) stackIn_173_0);
                      stackOut_173_1 = 1;
                      stackIn_175_0 = stackOut_173_0;
                      stackIn_175_1 = stackOut_173_1;
                      break L67;
                    }
                  }
                }
              }
              stackOut_174_0 = (mh) ((Object) stackIn_174_0);
              stackOut_174_1 = 0;
              stackIn_175_0 = stackOut_174_0;
              stackIn_175_1 = stackOut_174_1;
              break L67;
            }
            L69: {
              L70: {
                ((mh) (Object) stackIn_175_0).a(stackIn_175_1 != 0, -15211);
                stackOut_175_0 = ak.field_d;
                stackIn_179_0 = stackOut_175_0;
                stackIn_176_0 = stackOut_175_0;
                if (!param2) {
                  break L70;
                } else {
                  stackOut_176_0 = (mh) ((Object) stackIn_176_0);
                  stackIn_179_0 = stackOut_176_0;
                  stackIn_177_0 = stackOut_176_0;
                  if (param1) {
                    break L70;
                  } else {
                    stackOut_177_0 = (mh) ((Object) stackIn_177_0);
                    stackIn_179_0 = stackOut_177_0;
                    stackIn_178_0 = stackOut_177_0;
                    if (hc.field_c) {
                      break L70;
                    } else {
                      stackOut_178_0 = (mh) ((Object) stackIn_178_0);
                      stackOut_178_1 = 1;
                      stackIn_180_0 = stackOut_178_0;
                      stackIn_180_1 = stackOut_178_1;
                      break L69;
                    }
                  }
                }
              }
              stackOut_179_0 = (mh) ((Object) stackIn_179_0);
              stackOut_179_1 = 0;
              stackIn_180_0 = stackOut_179_0;
              stackIn_180_1 = stackOut_179_1;
              break L69;
            }
            L71: {
              L72: {
                ((mh) (Object) stackIn_180_0).a(stackIn_180_1 != 0, -15211);
                stackOut_180_0 = wi.field_j;
                stackIn_184_0 = stackOut_180_0;
                stackIn_181_0 = stackOut_180_0;
                if (!param2) {
                  break L72;
                } else {
                  stackOut_181_0 = (mh) ((Object) stackIn_181_0);
                  stackIn_184_0 = stackOut_181_0;
                  stackIn_182_0 = stackOut_181_0;
                  if (param1) {
                    break L72;
                  } else {
                    stackOut_182_0 = (mh) ((Object) stackIn_182_0);
                    stackIn_184_0 = stackOut_182_0;
                    stackIn_183_0 = stackOut_182_0;
                    if (!hc.field_c) {
                      break L72;
                    } else {
                      stackOut_183_0 = (mh) ((Object) stackIn_183_0);
                      stackOut_183_1 = 1;
                      stackIn_185_0 = stackOut_183_0;
                      stackIn_185_1 = stackOut_183_1;
                      break L71;
                    }
                  }
                }
              }
              stackOut_184_0 = (mh) ((Object) stackIn_184_0);
              stackOut_184_1 = 0;
              stackIn_185_0 = stackOut_184_0;
              stackIn_185_1 = stackOut_184_1;
              break L71;
            }
            L73: {
              ((mh) (Object) stackIn_185_0).a(stackIn_185_1 != 0, -15211);
              if (param0) {
                break L73;
              } else {
                var20 = (jp[]) null;
                nh.a(-9, -55, 119, -100, (jp[]) null, -102);
                break L73;
              }
            }
            L74: {
              sb.field_c.field_d.i(0);
              if (null != o.field_e) {
                L75: {
                  if ((ij.field_e.field_L ^ -1) == -1) {
                    break L75;
                  } else {
                    vg.a(o.field_e.e((byte) 123), false, param3);
                    break L75;
                  }
                }
                L76: {
                  if (-1 != (pf.field_h.field_L ^ -1)) {
                    hc.field_c = true;
                    break L76;
                  } else {
                    break L76;
                  }
                }
                L77: {
                  if (-1 == (dn.field_K.field_L ^ -1)) {
                    break L77;
                  } else {
                    sl.field_w = true;
                    break L77;
                  }
                }
                L78: {
                  if (0 != nd.field_a.field_L) {
                    hc.field_c = false;
                    break L78;
                  } else {
                    break L78;
                  }
                }
                ip.a(param3, o.field_e, false, false);
                break L74;
              } else {
                break L74;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var5), "nh.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        id var1_ref = null;
        om var1_ref2 = null;
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        om stackIn_15_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        om stackOut_14_0 = null;
        nm stackOut_22_0 = null;
        var2 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var1_ref = (id) ((Object) ua.field_c.d(-50));
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var1_ref == null) {
                      break L4;
                    } else {
                      stackOut_3_0 = -1;
                      stackOut_3_1 = var1_ref.field_ic ^ -1;
                      stackIn_29_0 = stackOut_3_0;
                      stackIn_29_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var2 != 0) {
                        L5: while (true) {
                          L6: {
                            if (stackIn_29_0 == stackIn_29_1) {
                              var1_ref.field_kc = 0;
                              if (!var1_ref.i(param0 + 0)) {
                                break L6;
                              } else {
                                var1_ref.b((byte) 111);
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          L7: while (true) {
                            var1_ref = (id) ((Object) mp.field_Tb.a((byte) 116));
                            if (var2 == 0) {
                              if (var1_ref == null) {
                                break L2;
                              } else {
                                if (var2 != 0) {
                                  break L3;
                                } else {
                                  if (var1_ref.field_ic > 0) {
                                    var1_ref.field_ic = var1_ref.field_ic - 1;
                                    stackOut_28_0 = -1;
                                    stackOut_28_1 = var1_ref.field_ic ^ -1;
                                    stackIn_29_0 = stackOut_28_0;
                                    stackIn_29_1 = stackOut_28_1;
                                    continue L5;
                                  } else {
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                      } else {
                        L8: {
                          if (stackIn_4_0 <= stackIn_4_1) {
                            break L8;
                          } else {
                            var1_ref.field_ic = var1_ref.field_ic - 1;
                            if (var1_ref.field_ic == 0) {
                              var1_ref.field_kc = 0;
                              if (var1_ref.i(0)) {
                                var1_ref.b((byte) 111);
                                break L8;
                              } else {
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                        }
                        var1_ref = (id) ((Object) ua.field_c.a((byte) 116));
                        if (var2 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L9: {
                    var1_ref2 = (om) ((Object) rq.field_a.d(-14));
                    if (param0 == 0) {
                      break L9;
                    } else {
                      field_b = -23;
                      break L9;
                    }
                  }
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (var1_ref2 == null) {
                          break L12;
                        } else {
                          stackOut_14_0 = (om) (var1_ref2);
                          stackIn_23_0 = stackOut_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          if (var2 != 0) {
                            break L11;
                          } else {
                            L13: {
                              if ((stackIn_15_0.field_Wb ^ -1) < -1) {
                                var1_ref2.field_Wb = var1_ref2.field_Wb - 1;
                                if (var1_ref2.field_Wb == 0) {
                                  var1_ref2.field_Zb = 0;
                                  if (!var1_ref2.h(param0 ^ -15)) {
                                    break L13;
                                  } else {
                                    var1_ref2.b((byte) 111);
                                    break L13;
                                  }
                                } else {
                                  break L13;
                                }
                              } else {
                                break L13;
                              }
                            }
                            var1_ref2 = (om) ((Object) rq.field_a.a((byte) 116));
                            if (var2 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      stackOut_22_0 = mp.field_Tb.d(-21);
                      stackIn_23_0 = stackOut_22_0;
                      break L11;
                    }
                    var1_ref = (id) ((Object) stackIn_23_0);
                    L14: while (true) {
                      if (var1_ref == null) {
                        break L2;
                      } else {
                        if (var2 != 0) {
                          break L3;
                        } else {
                          L15: {
                            if (var1_ref.field_ic > 0) {
                              var1_ref.field_ic = var1_ref.field_ic - 1;
                              stackOut_28_0 = -1;
                              stackOut_28_1 = var1_ref.field_ic ^ -1;
                              stackIn_29_0 = stackOut_28_0;
                              stackIn_29_1 = stackOut_28_1;
                              if (stackIn_29_0 == stackIn_29_1) {
                                var1_ref.field_kc = 0;
                                if (!var1_ref.i(param0 + 0)) {
                                  break L15;
                                } else {
                                  var1_ref.b((byte) 111);
                                  break L15;
                                }
                              } else {
                                break L15;
                              }
                            } else {
                              break L15;
                            }
                          }
                          var1_ref = (id) ((Object) mp.field_Tb.a((byte) 116));
                          if (var2 == 0) {
                            continue L14;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "nh.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        int var1 = 17 / ((param0 - -45) / 59);
        field_d = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_d = "Security";
    }
}
