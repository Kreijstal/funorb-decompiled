/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends rd {
    static int field_m;
    static boolean field_n;
    static int field_o;

    final static boolean b(byte param0) {
        boolean discarded$0 = false;
        if (param0 <= 78) {
            discarded$0 = pj.b((byte) -61);
        }
        return mn.field_a;
    }

    final void a(int[] param0, int param1, byte param2, int[] param3) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param2 < -49) {
                break L1;
              } else {
                field_n = true;
                break L1;
              }
            }
            var8 = new int[param0.length + param3.length];
            var11 = var8;
            var10 = var11;
            var5_array = var10;
            var6 = 0;
            L2: while (true) {
              if (param0.length <= var6) {
                var9 = 0;
                var6 = var9;
                L3: while (true) {
                  if (param3.length / 2 <= var9) {
                    lj.a(0, 128, 5, var11, (byte) -32, 5);
                    break L0;
                  } else {
                    var5_array[param0.length + var9 * 2] = param3[-(2 * var9) + param3.length - 2];
                    var5_array[1 + param0.length - -(2 * var9)] = param3[-1 + (param3.length - 2 * var9)];
                    var9++;
                    continue L3;
                  }
                }
              } else {
                var8[var6] = param0[var6];
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("pj.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static void a(byte param0) {
        float discarded$0 = 0.0f;
        dm.field_a = 0;
        if (param0 > -21) {
            wc[] var2 = (wc[]) null;
            discarded$0 = pj.a((wc[]) null, (byte) -53, 0.8636131286621094f, -0.5086926817893982f);
        }
        em.field_l = -1;
        ac.field_e = -1;
        sk.field_h = false;
        n.field_s = null;
    }

    final static int a(CharSequence param0, int param1, int param2, byte[] param3, int param4, byte param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_69_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            if (param5 == 29) {
              var6_int = param2 - param4;
              var7 = 0;
              L1: while (true) {
                if (var6_int <= var7) {
                  stackOut_69_0 = var6_int;
                  stackIn_70_0 = stackOut_69_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var8 = param0.charAt(var7 + param4);
                        if (var8 <= 0) {
                          break L4;
                        } else {
                          if (128 > var8) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var8 < 160) {
                          break L5;
                        } else {
                          if (var8 <= 255) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (var8 != 8364) {
                        if (var8 != 8218) {
                          if (var8 == 402) {
                            param3[var7 + param1] = (byte)-125;
                            break L2;
                          } else {
                            if (8222 == var8) {
                              param3[param1 + var7] = (byte)-124;
                              break L2;
                            } else {
                              if (8230 == var8) {
                                param3[param1 + var7] = (byte)-123;
                                break L2;
                              } else {
                                if (var8 == 8224) {
                                  param3[param1 + var7] = (byte)-122;
                                  break L2;
                                } else {
                                  if (var8 == 8225) {
                                    param3[param1 + var7] = (byte)-121;
                                    break L2;
                                  } else {
                                    if (710 != var8) {
                                      if (var8 != 8240) {
                                        if (var8 == 352) {
                                          param3[param1 + var7] = (byte)-118;
                                          break L2;
                                        } else {
                                          if (var8 != 8249) {
                                            if (var8 == 338) {
                                              param3[var7 + param1] = (byte)-116;
                                              break L2;
                                            } else {
                                              if (var8 == 381) {
                                                param3[var7 + param1] = (byte)-114;
                                                break L2;
                                              } else {
                                                if (var8 == 8216) {
                                                  param3[param1 - -var7] = (byte)-111;
                                                  break L2;
                                                } else {
                                                  if (var8 != 8217) {
                                                    if (var8 != 8220) {
                                                      if (var8 == 8221) {
                                                        param3[var7 + param1] = (byte)-108;
                                                        break L2;
                                                      } else {
                                                        if (var8 != 8226) {
                                                          if (var8 != 8211) {
                                                            if (var8 != 8212) {
                                                              if (732 == var8) {
                                                                param3[var7 + param1] = (byte)-104;
                                                                break L2;
                                                              } else {
                                                                if (var8 != 8482) {
                                                                  if (var8 != 353) {
                                                                    if (var8 == 8250) {
                                                                      param3[param1 + var7] = (byte)-101;
                                                                      break L2;
                                                                    } else {
                                                                      if (var8 != 339) {
                                                                        if (var8 == 382) {
                                                                          param3[var7 + param1] = (byte)-98;
                                                                          break L2;
                                                                        } else {
                                                                          if (var8 == 376) {
                                                                            param3[param1 - -var7] = (byte)-97;
                                                                            break L2;
                                                                          } else {
                                                                            param3[param1 + var7] = (byte)63;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        param3[param1 + var7] = (byte)-100;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param3[var7 + param1] = (byte)-102;
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  param3[param1 - -var7] = (byte)-103;
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              param3[param1 + var7] = (byte)-105;
                                                              break L2;
                                                            }
                                                          } else {
                                                            param3[param1 - -var7] = (byte)-106;
                                                            break L2;
                                                          }
                                                        } else {
                                                          param3[var7 + param1] = (byte)-107;
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      param3[param1 + var7] = (byte)-109;
                                                      break L2;
                                                    }
                                                  } else {
                                                    param3[param1 - -var7] = (byte)-110;
                                                    break L2;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            param3[param1 + var7] = (byte)-117;
                                            break L2;
                                          }
                                        }
                                      } else {
                                        param3[var7 + param1] = (byte)-119;
                                        break L2;
                                      }
                                    } else {
                                      param3[var7 + param1] = (byte)-120;
                                      break L2;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          param3[param1 - -var7] = (byte)-126;
                          break L2;
                        }
                      } else {
                        param3[var7 + param1] = (byte)-128;
                        break L2;
                      }
                    }
                    param3[var7 + param1] = (byte)var8;
                    break L2;
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 5;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) (var6);
            stackOut_71_1 = new StringBuilder().append("pj.C(");
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param0 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L6;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L6;
            }
          }
          L7: {
            stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param3 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L7;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L7;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_70_0;
        }
    }

    pj(int param0, float param1) {
        this.field_h = param0;
        this.field_k = param1;
        this.field_c = 0;
        this.field_i = 1;
    }

    final static float a(wc[] param0, byte param1, float param2, float param3) {
        RuntimeException var4 = null;
        float var4_float = 0.0f;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        float stackIn_28_0 = 0.0f;
        float stackIn_30_0 = 0.0f;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        float stackOut_27_0 = 0.0f;
        float stackOut_26_0 = 0.0f;
        float stackOut_29_0 = 0.0f;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var4_float = 0.0f;
              var5 = (int)param2;
              var6 = (int)param3;
              if (param1 == -105) {
                break L1;
              } else {
                pj.a((byte) -116);
                break L1;
              }
            }
            L2: {
              if (var6 == var5) {
                L3: {
                  var4_float = -param2 + param3;
                  if (var4_float >= 0.0f) {
                    stackOut_27_0 = var4_float;
                    stackIn_28_0 = stackOut_27_0;
                    break L3;
                  } else {
                    stackOut_26_0 = -var4_float;
                    stackIn_28_0 = stackOut_26_0;
                    break L3;
                  }
                }
                var4_float = stackIn_28_0;
                break L2;
              } else {
                if (var6 > var5) {
                  L4: {
                    if (param2 != (float)var5) {
                      var4_float = param0[var5].f(param1 + 155) * ((float)(var5 + 1) - param2);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var7 = 1 + var5;
                  L5: while (true) {
                    if (var7 >= var6) {
                      if (param3 == (float)var6) {
                        break L2;
                      } else {
                        var4_float = var4_float + (param3 - (float)var6) * param0[var6].f(param1 + 155);
                        break L2;
                      }
                    } else {
                      var4_float = var4_float + param0[var7].f(param1 + 155);
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  L6: {
                    if ((float)var5 != param2) {
                      var4_float = param0[var5].f(param1 ^ -91) * ((float)(1 + var5) - param2);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var7 = 1 + var5;
                  L7: while (true) {
                    if (var7 >= param0.length) {
                      var7 = 0;
                      L8: while (true) {
                        if (var7 >= var6) {
                          if ((float)var6 != param3) {
                            var4_float = var4_float + ((float)(-var6) + param3) * param0[var6].f(50);
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          var4_float = var4_float + param0[var7].f(50);
                          var7++;
                          continue L8;
                        }
                      }
                    } else {
                      var4_float = var4_float + param0[var7].f(50);
                      var7++;
                      continue L7;
                    }
                  }
                }
              }
            }
            stackOut_29_0 = var4_float;
            stackIn_30_0 = stackOut_29_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var4);
            stackOut_31_1 = new StringBuilder().append("pj.B(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_30_0;
    }

    static {
    }
}
