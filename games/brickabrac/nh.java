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
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        var22 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param4 != null) {
              L1: {
                if (param0 <= 0) {
                  break L1;
                } else {
                  if (param1 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (param4[3] != null) {
                        stackOut_13_0 = param4[3].field_x;
                        stackIn_14_0 = stackOut_13_0;
                        break L2;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_14_0 = stackOut_11_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_14_0;
                      if (param4[5] == null) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        break L3;
                      } else {
                        stackOut_15_0 = param4[5].field_x;
                        stackIn_18_0 = stackOut_15_0;
                        break L3;
                      }
                    }
                    var7 = stackIn_18_0;
                    if (param2 == -40) {
                      L4: {
                        if (null == param4[1]) {
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          break L4;
                        } else {
                          stackOut_21_0 = param4[1].field_z;
                          stackIn_24_0 = stackOut_21_0;
                          break L4;
                        }
                      }
                      L5: {
                        var8 = stackIn_24_0;
                        if (param4[7] != null) {
                          stackOut_27_0 = param4[7].field_z;
                          stackIn_28_0 = stackOut_27_0;
                          break L5;
                        } else {
                          stackOut_25_0 = 0;
                          stackIn_28_0 = stackOut_25_0;
                          break L5;
                        }
                      }
                      L6: {
                        var9 = stackIn_28_0;
                        var10 = param0 + param3;
                        var11 = param5 + param1;
                        var12 = var6_int + param3;
                        var13 = -var7 + var10;
                        var14 = var8 + param5;
                        var15 = var11 + -var9;
                        var16 = var12;
                        var17 = var13;
                        if (~var16 < ~var17) {
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
                                if (~var13 >= ~var20) {
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
                          if (param4[3].field_z != 0) {
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
                            if (param4[4].field_z == 0) {
                              break L24;
                            } else {
                              lb.d(var16, var18, var17, var19);
                              var20 = var14;
                              L25: while (true) {
                                L26: {
                                  if (~var20 <= ~var15) {
                                    break L26;
                                  } else {
                                    if (var22 != 0) {
                                      break L24;
                                    } else {
                                      var21 = var12;
                                      L27: while (true) {
                                        L28: {
                                          L29: {
                                            if (~var21 <= ~var13) {
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
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var6 = decompiledCaughtException;
            stackOut_119_0 = (RuntimeException) var6;
            stackOut_119_1 = new StringBuilder().append("nh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_122_0 = stackOut_119_0;
            stackIn_122_1 = stackOut_119_1;
            stackIn_120_0 = stackOut_119_0;
            stackIn_120_1 = stackOut_119_1;
            if (param4 == null) {
              stackOut_122_0 = (RuntimeException) (Object) stackIn_122_0;
              stackOut_122_1 = (StringBuilder) (Object) stackIn_122_1;
              stackOut_122_2 = "null";
              stackIn_123_0 = stackOut_122_0;
              stackIn_123_1 = stackOut_122_1;
              stackIn_123_2 = stackOut_122_2;
              break L30;
            } else {
              stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
              stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
              stackOut_120_2 = "{...}";
              stackIn_123_0 = stackOut_120_0;
              stackIn_123_1 = stackOut_120_1;
              stackIn_123_2 = stackOut_120_2;
              break L30;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_123_0, stackIn_123_2 + ',' + param5 + ')');
        }
    }

    final static void a(jp[] param0, int param1, int param2, int param3, int param4, dh param5, int param6, int param7, int param8, jp[] param9, int param10, jp[] param11, int param12, byte param13, int param14) {
        int var15_int = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var15_int = param5.field_B - -param5.field_P;
              var16 = param5.field_B;
              if (param13 == -110) {
                break L1;
              } else {
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
            stackOut_5_0 = (RuntimeException) var15;
            stackOut_5_1 = new StringBuilder().append("nh.C(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param9 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param10).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param11 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        mh var5_ref = null;
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
        id var18 = null;
        int var18_int = 0;
        int var19 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        mh stackIn_29_0 = null;
        mh stackIn_30_0 = null;
        mh stackIn_32_0 = null;
        mh stackIn_34_0 = null;
        mh stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_99_0 = 0;
        boolean stackIn_111_0 = false;
        int stackIn_119_0 = 0;
        boolean stackIn_192_0 = false;
        int stackIn_231_0 = 0;
        mh stackIn_258_0 = null;
        mh stackIn_259_0 = null;
        mh stackIn_261_0 = null;
        mh stackIn_262_0 = null;
        mh stackIn_264_0 = null;
        mh stackIn_266_0 = null;
        mh stackIn_267_0 = null;
        int stackIn_267_1 = 0;
        mh stackIn_268_0 = null;
        mh stackIn_269_0 = null;
        mh stackIn_271_0 = null;
        mh stackIn_272_0 = null;
        mh stackIn_274_0 = null;
        mh stackIn_276_0 = null;
        mh stackIn_277_0 = null;
        int stackIn_277_1 = 0;
        mh stackIn_278_0 = null;
        mh stackIn_279_0 = null;
        mh stackIn_281_0 = null;
        mh stackIn_282_0 = null;
        mh stackIn_284_0 = null;
        mh stackIn_286_0 = null;
        mh stackIn_287_0 = null;
        int stackIn_287_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        mh stackOut_28_0 = null;
        mh stackOut_29_0 = null;
        mh stackOut_30_0 = null;
        mh stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        mh stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_98_0 = 0;
        boolean stackOut_110_0 = false;
        int stackOut_118_0 = 0;
        boolean stackOut_191_0 = false;
        int stackOut_230_0 = 0;
        mh stackOut_257_0 = null;
        mh stackOut_258_0 = null;
        mh stackOut_259_0 = null;
        mh stackOut_261_0 = null;
        mh stackOut_262_0 = null;
        mh stackOut_264_0 = null;
        int stackOut_264_1 = 0;
        mh stackOut_266_0 = null;
        int stackOut_266_1 = 0;
        mh stackOut_267_0 = null;
        mh stackOut_268_0 = null;
        mh stackOut_269_0 = null;
        mh stackOut_271_0 = null;
        mh stackOut_272_0 = null;
        mh stackOut_274_0 = null;
        int stackOut_274_1 = 0;
        mh stackOut_276_0 = null;
        int stackOut_276_1 = 0;
        mh stackOut_277_0 = null;
        mh stackOut_278_0 = null;
        mh stackOut_279_0 = null;
        mh stackOut_281_0 = null;
        mh stackOut_282_0 = null;
        mh stackOut_284_0 = null;
        int stackOut_284_1 = 0;
        mh stackOut_286_0 = null;
        int stackOut_286_1 = 0;
        var19 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = eg.field_m;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param0) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              co.a(stackIn_5_0, stackIn_5_1 != 0);
              if (o.field_e != null) {
                L3: {
                  L4: {
                    ij.field_e.field_eb = true;
                    var5_ref = pf.field_h;
                    pf.field_h.field_cb = 0;
                    var5_ref.field_Ib = 0;
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
                      ba.field_v.field_Mb = rd.a(fm.field_a, new String[1], (byte) 103).toUpperCase();
                      ke.field_e.a(40, ak.field_d.field_cb + -40, 0, ak.field_d.field_Ib, (byte) 64);
                      ke.field_e.field_Mb = rd.a(nm.field_a, new String[1], (byte) 103);
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
                      if (~o.field_e.field_jc < ~o.field_e.field_cc) {
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
                    if (uf.field_c > 0) {
                      L8: {
                        L9: {
                          if (uf.field_c != 1) {
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
                        var10_ref_String = rd.a(mq.field_h, new String[1], (byte) 103);
                        break L8;
                      }
                      pf.field_h.field_Mb = pf.field_h.field_Mb + "<br>" + var10_ref_String;
                      if ((an.field_h & 16) != 0) {
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
                      stackOut_28_0 = dn.field_K;
                      stackIn_34_0 = stackOut_28_0;
                      stackIn_29_0 = stackOut_28_0;
                      if (!param4) {
                        break L11;
                      } else {
                        stackOut_29_0 = (mh) (Object) stackIn_29_0;
                        stackIn_34_0 = stackOut_29_0;
                        stackIn_30_0 = stackOut_29_0;
                        if (ic.field_b != 0L) {
                          break L11;
                        } else {
                          stackOut_30_0 = (mh) (Object) stackIn_30_0;
                          stackIn_32_0 = stackOut_30_0;
                          stackOut_32_0 = (mh) (Object) stackIn_32_0;
                          stackOut_32_1 = 1;
                          stackIn_35_0 = stackOut_32_0;
                          stackIn_35_1 = stackOut_32_1;
                          break L10;
                        }
                      }
                    }
                    stackOut_34_0 = (mh) (Object) stackIn_34_0;
                    stackOut_34_1 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    break L10;
                  }
                  L12: {
                    stackIn_35_0.field_eb = stackIn_35_1 != 0;
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
                                stackOut_50_0 = 0;
                                stackIn_99_0 = stackOut_50_0;
                                stackIn_51_0 = stackOut_50_0;
                                if (var19 != 0) {
                                  break L18;
                                } else {
                                  var12 = stackIn_51_0;
                                  L20: while (true) {
                                    stackOut_52_0 = br.field_bc.length;
                                    stackOut_52_1 = var12;
                                    stackIn_53_0 = stackOut_52_0;
                                    stackIn_53_1 = stackOut_52_1;
                                    L21: while (true) {
                                      L22: {
                                        L23: {
                                          if (stackIn_53_0 <= stackIn_53_1) {
                                            break L23;
                                          } else {
                                            var13_ref_int__ = br.field_bc[var12];
                                            stackOut_54_0 = 0;
                                            stackIn_91_0 = stackOut_54_0;
                                            stackIn_55_0 = stackOut_54_0;
                                            if (var19 != 0) {
                                              break L22;
                                            } else {
                                              var14 = stackIn_55_0;
                                              L24: while (true) {
                                                L25: {
                                                  L26: {
                                                    L27: {
                                                      if (~var13_ref_int__.length >= ~var14) {
                                                        break L27;
                                                      } else {
                                                        var15 = var13_ref_int__[var14];
                                                        var16 = var13_ref_int__[var14 - -1];
                                                        stackOut_57_0 = var15;
                                                        stackOut_57_1 = -1;
                                                        stackIn_82_0 = stackOut_57_0;
                                                        stackIn_82_1 = stackOut_57_1;
                                                        stackIn_58_0 = stackOut_57_0;
                                                        stackIn_58_1 = stackOut_57_1;
                                                        if (var19 != 0) {
                                                          break L26;
                                                        } else {
                                                          L28: {
                                                            L29: {
                                                              if (stackIn_58_0 == stackIn_58_1) {
                                                                break L29;
                                                              } else {
                                                                if (~(o.field_e.field_Tb[var15] & 255) == ~var16) {
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
                                                                stackOut_72_0 = o.field_e.field_cc;
                                                                stackIn_73_0 = stackOut_72_0;
                                                                break L30;
                                                              } else {
                                                                stackOut_70_0 = o.field_e.field_jc;
                                                                stackIn_73_0 = stackOut_70_0;
                                                                break L30;
                                                              }
                                                            }
                                                            var17_int = stackIn_73_0;
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
                                                    stackOut_81_0 = var15;
                                                    stackOut_81_1 = var13_ref_int__.length;
                                                    stackIn_82_0 = stackOut_81_0;
                                                    stackIn_82_1 = stackOut_81_1;
                                                    break L26;
                                                  }
                                                  L31: while (true) {
                                                    L32: {
                                                      if (stackIn_82_0 >= stackIn_82_1) {
                                                        break L32;
                                                      } else {
                                                        var16 = var13_ref_int__[var15];
                                                        stackOut_83_0 = ~var16;
                                                        stackOut_83_1 = ~var14;
                                                        stackIn_53_0 = stackOut_83_0;
                                                        stackIn_53_1 = stackOut_83_1;
                                                        stackIn_84_0 = stackOut_83_0;
                                                        stackIn_84_1 = stackOut_83_1;
                                                        if (var19 != 0) {
                                                          continue L21;
                                                        } else {
                                                          L33: {
                                                            if (stackIn_84_0 < stackIn_84_1) {
                                                              var14 = var16;
                                                              break L33;
                                                            } else {
                                                              break L33;
                                                            }
                                                          }
                                                          var15 += 2;
                                                          if (var19 == 0) {
                                                            stackOut_81_0 = var15;
                                                            stackOut_81_1 = var13_ref_int__.length;
                                                            stackIn_82_0 = stackOut_81_0;
                                                            stackIn_82_1 = stackOut_81_1;
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
                                        stackOut_90_0 = var11;
                                        stackIn_91_0 = stackOut_90_0;
                                        break L22;
                                      }
                                      L34: {
                                        if (stackIn_91_0 == 0) {
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
                            stackOut_98_0 = 2;
                            stackIn_99_0 = stackOut_98_0;
                            break L18;
                          }
                          if (stackIn_99_0 > kb.field_Yb) {
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
                              if (~cq.field_p >= ~var13) {
                                break L38;
                              } else {
                                stackOut_110_0 = h.field_D[var13];
                                stackIn_119_0 = stackOut_110_0 ? 1 : 0;
                                stackIn_111_0 = stackOut_110_0;
                                if (var19 != 0) {
                                  break L37;
                                } else {
                                  L39: {
                                    if (!stackIn_111_0) {
                                      break L39;
                                    } else {
                                      L40: {
                                        var14_ref_String = "<col=A00000>" + rg.field_b[var13] + "</col>";
                                        if (null == var11_ref) {
                                          break L40;
                                        } else {
                                          var11_ref = (Object) (Object) ((String) var11_ref + ", " + var14_ref_String);
                                          var12 = 1;
                                          if (var19 == 0) {
                                            break L39;
                                          } else {
                                            break L40;
                                          }
                                        }
                                      }
                                      var11_ref = (Object) (Object) var14_ref_String;
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
                            stackOut_118_0 = -1;
                            stackIn_119_0 = stackOut_118_0;
                            break L37;
                          }
                          L41: {
                            if (stackIn_119_0 != ~var10) {
                              L42: {
                                var13_ref_String = bh.field_rb;
                                if (var12 != 0) {
                                  break L42;
                                } else {
                                  var14_ref_String = rd.a(br.field_ac, new String[1], (byte) 103);
                                  if (var19 == 0) {
                                    break L41;
                                  } else {
                                    break L42;
                                  }
                                }
                              }
                              var14_ref_String = ff.field_e + (String) var11_ref;
                              break L41;
                            } else {
                              L43: {
                                var13_ref_String = eq.field_b;
                                if (var12 == 0) {
                                  break L43;
                                } else {
                                  var14_ref_String = ki.field_g + (String) var11_ref;
                                  if (var19 == 0) {
                                    break L41;
                                  } else {
                                    break L43;
                                  }
                                }
                              }
                              var14_ref_String = rd.a(gk.field_b, new String[1], (byte) 103);
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
                                    if (var18_int == 0) {
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
                    var18 = (id) (Object) var17.d(-97);
                    L54: while (true) {
                      L55: {
                        L56: {
                          if (var18 == null) {
                            break L56;
                          } else {
                            stackOut_191_0 = var18.i(0);
                            stackIn_231_0 = stackOut_191_0 ? 1 : 0;
                            stackIn_192_0 = stackOut_191_0;
                            if (var19 != 0) {
                              break L55;
                            } else {
                              L57: {
                                L58: {
                                  if (!stackIn_192_0) {
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
                                    if (!var18.field_ec) {
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
                                  if (var13 > var18.field_Wb) {
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
                                  if (var18.field_ac < var14) {
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
                                  if ((var15 & ~var18.field_Ub) > 0) {
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
                              var18 = (id) (Object) var17.a((byte) 116);
                              if (var19 == 0) {
                                continue L54;
                              } else {
                                break L56;
                              }
                            }
                          }
                        }
                        stackOut_230_0 = 2;
                        stackIn_231_0 = stackOut_230_0;
                        break L55;
                      }
                      L63: {
                        if (stackIn_231_0 > kb.field_Yb) {
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
                              ep.field_e = rd.a(ta.field_d, new String[1], (byte) 103);
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
                    var8.field_Mb = rd.a(mn.field_w, new String[1], (byte) 103);
                    break L65;
                  } else {
                    break L65;
                  }
                }
                um.field_b.field_Mb = rd.a(rl.field_d, new String[2], (byte) 103);
                break L2;
              } else {
                break L2;
              }
            }
            L67: {
              L68: {
                stackOut_257_0 = qa.field_w;
                stackIn_266_0 = stackOut_257_0;
                stackIn_258_0 = stackOut_257_0;
                if (!param2) {
                  break L68;
                } else {
                  stackOut_258_0 = (mh) (Object) stackIn_258_0;
                  stackIn_266_0 = stackOut_258_0;
                  stackIn_259_0 = stackOut_258_0;
                  if (param1) {
                    break L68;
                  } else {
                    stackOut_259_0 = (mh) (Object) stackIn_259_0;
                    stackIn_261_0 = stackOut_259_0;
                    stackOut_261_0 = (mh) (Object) stackIn_261_0;
                    stackIn_266_0 = stackOut_261_0;
                    stackIn_262_0 = stackOut_261_0;
                    if (hc.field_c) {
                      break L68;
                    } else {
                      stackOut_262_0 = (mh) (Object) stackIn_262_0;
                      stackIn_264_0 = stackOut_262_0;
                      stackOut_264_0 = (mh) (Object) stackIn_264_0;
                      stackOut_264_1 = 1;
                      stackIn_267_0 = stackOut_264_0;
                      stackIn_267_1 = stackOut_264_1;
                      break L67;
                    }
                  }
                }
              }
              stackOut_266_0 = (mh) (Object) stackIn_266_0;
              stackOut_266_1 = 0;
              stackIn_267_0 = stackOut_266_0;
              stackIn_267_1 = stackOut_266_1;
              break L67;
            }
            L69: {
              L70: {
                ((mh) (Object) stackIn_267_0).a(stackIn_267_1 != 0, -15211);
                stackOut_267_0 = ak.field_d;
                stackIn_276_0 = stackOut_267_0;
                stackIn_268_0 = stackOut_267_0;
                if (!param2) {
                  break L70;
                } else {
                  stackOut_268_0 = (mh) (Object) stackIn_268_0;
                  stackIn_276_0 = stackOut_268_0;
                  stackIn_269_0 = stackOut_268_0;
                  if (param1) {
                    break L70;
                  } else {
                    stackOut_269_0 = (mh) (Object) stackIn_269_0;
                    stackIn_271_0 = stackOut_269_0;
                    stackOut_271_0 = (mh) (Object) stackIn_271_0;
                    stackIn_276_0 = stackOut_271_0;
                    stackIn_272_0 = stackOut_271_0;
                    if (hc.field_c) {
                      break L70;
                    } else {
                      stackOut_272_0 = (mh) (Object) stackIn_272_0;
                      stackIn_274_0 = stackOut_272_0;
                      stackOut_274_0 = (mh) (Object) stackIn_274_0;
                      stackOut_274_1 = 1;
                      stackIn_277_0 = stackOut_274_0;
                      stackIn_277_1 = stackOut_274_1;
                      break L69;
                    }
                  }
                }
              }
              stackOut_276_0 = (mh) (Object) stackIn_276_0;
              stackOut_276_1 = 0;
              stackIn_277_0 = stackOut_276_0;
              stackIn_277_1 = stackOut_276_1;
              break L69;
            }
            L71: {
              L72: {
                ((mh) (Object) stackIn_277_0).a(stackIn_277_1 != 0, -15211);
                stackOut_277_0 = wi.field_j;
                stackIn_286_0 = stackOut_277_0;
                stackIn_278_0 = stackOut_277_0;
                if (!param2) {
                  break L72;
                } else {
                  stackOut_278_0 = (mh) (Object) stackIn_278_0;
                  stackIn_286_0 = stackOut_278_0;
                  stackIn_279_0 = stackOut_278_0;
                  if (param1) {
                    break L72;
                  } else {
                    stackOut_279_0 = (mh) (Object) stackIn_279_0;
                    stackIn_281_0 = stackOut_279_0;
                    stackOut_281_0 = (mh) (Object) stackIn_281_0;
                    stackIn_286_0 = stackOut_281_0;
                    stackIn_282_0 = stackOut_281_0;
                    if (!hc.field_c) {
                      break L72;
                    } else {
                      stackOut_282_0 = (mh) (Object) stackIn_282_0;
                      stackIn_284_0 = stackOut_282_0;
                      stackOut_284_0 = (mh) (Object) stackIn_284_0;
                      stackOut_284_1 = 1;
                      stackIn_287_0 = stackOut_284_0;
                      stackIn_287_1 = stackOut_284_1;
                      break L71;
                    }
                  }
                }
              }
              stackOut_286_0 = (mh) (Object) stackIn_286_0;
              stackOut_286_1 = 0;
              stackIn_287_0 = stackOut_286_0;
              stackIn_287_1 = stackOut_286_1;
              break L71;
            }
            L73: {
              ((mh) (Object) stackIn_287_0).a(stackIn_287_1 != 0, -15211);
              if (param0) {
                break L73;
              } else {
                nh.a(-9, -55, 119, -100, (jp[]) null, -102);
                break L73;
              }
            }
            L74: {
              sb.field_c.field_d.i(0);
              if (null != o.field_e) {
                L75: {
                  if (ij.field_e.field_L == 0) {
                    break L75;
                  } else {
                    vg.a(o.field_e.e((byte) 123), false, param3);
                    break L75;
                  }
                }
                L76: {
                  if (pf.field_h.field_L != 0) {
                    hc.field_c = true;
                    break L76;
                  } else {
                    break L76;
                  }
                }
                L77: {
                  if (dn.field_K.field_L == 0) {
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
          throw qb.a((Throwable) (Object) var5, "nh.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        id var1_ref = null;
        om var1_ref2 = null;
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        om stackIn_22_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        om stackOut_21_0 = null;
        nm stackOut_34_0 = null;
        var2 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var1_ref = (id) (Object) ua.field_c.d(-50);
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (null == var1_ref) {
                      break L4;
                    } else {
                      stackOut_3_0 = -1;
                      stackOut_3_1 = ~var1_ref.field_ic;
                      stackIn_44_0 = stackOut_3_0;
                      stackIn_44_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var2 != 0) {
                        L5: while (true) {
                          L6: {
                            if (stackIn_44_0 == stackIn_44_1) {
                              var1_ref.field_kc = 0;
                              if (!var1_ref.i(param0)) {
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
                            var1_ref = (id) (Object) mp.field_Tb.a((byte) 116);
                            if (var2 == 0) {
                              if (null == var1_ref) {
                                break L3;
                              } else {
                                if (var2 != 0) {
                                  break L2;
                                } else {
                                  if (var1_ref.field_ic > 0) {
                                    var1_ref.field_ic = var1_ref.field_ic - 1;
                                    stackOut_43_0 = -1;
                                    stackOut_43_1 = ~var1_ref.field_ic;
                                    stackIn_44_0 = stackOut_43_0;
                                    stackIn_44_1 = stackOut_43_1;
                                    continue L5;
                                  } else {
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              break L3;
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
                        var1_ref = (id) (Object) ua.field_c.a((byte) 116);
                        if (var2 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L9: {
                    var1_ref2 = (om) (Object) rq.field_a.d(-14);
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
                          stackOut_21_0 = (om) var1_ref2;
                          stackIn_35_0 = (Object) (Object) stackOut_21_0;
                          stackIn_22_0 = stackOut_21_0;
                          if (var2 != 0) {
                            break L11;
                          } else {
                            L13: {
                              if (stackIn_22_0.field_Wb > 0) {
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
                            var1_ref2 = (om) (Object) rq.field_a.a((byte) 116);
                            if (var2 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      stackOut_34_0 = mp.field_Tb.d(-21);
                      stackIn_35_0 = (Object) (Object) stackOut_34_0;
                      break L11;
                    }
                    var1_ref = (id) (Object) stackIn_35_0;
                    L14: while (true) {
                      if (null == var1_ref) {
                        break L3;
                      } else {
                        if (var2 != 0) {
                          break L2;
                        } else {
                          L15: {
                            if (var1_ref.field_ic > 0) {
                              var1_ref.field_ic = var1_ref.field_ic - 1;
                              stackOut_43_0 = -1;
                              stackOut_43_1 = ~var1_ref.field_ic;
                              stackIn_44_0 = stackOut_43_0;
                              stackIn_44_1 = stackOut_43_1;
                              if (stackIn_44_0 == stackIn_44_1) {
                                var1_ref.field_kc = 0;
                                if (!var1_ref.i(param0)) {
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
                          var1_ref = (id) (Object) mp.field_Tb.a((byte) 116);
                          if (var2 == 0) {
                            continue L14;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "nh.B(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        try {
            int var1_int = 17 / ((param0 - -45) / 59);
            field_d = null;
            field_a = null;
            field_c = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "nh.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Security";
    }
}
