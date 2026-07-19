/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends kd {
    ke[] field_l;
    private int[] field_i;
    static hk field_j;
    byte[] field_n;
    static be field_s;
    byte[] field_q;
    rc[] field_h;
    int field_m;
    static int field_o;
    short[] field_k;
    static String field_p;
    byte[] field_r;

    final void a(int param0) {
        if (param0 >= -81) {
            return;
        }
        this.field_i = null;
    }

    final boolean a(byte[] param0, ja param1, byte param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
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
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 1;
            var6 = 0;
            var7 = null;
            var8 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (128 <= var8) {
                    break L3;
                  } else {
                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (param0 == null) {
                            break L5;
                          } else {
                            if ((param0[var8] ^ -1) != -1) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var9 = this.field_i[var8];
                        if ((var9 ^ -1) == -1) {
                          break L4;
                        } else {
                          L6: {
                            if (var9 == var6) {
                              break L6;
                            } else {
                              L7: {
                                L8: {
                                  var6 = var9;
                                  var9--;
                                  if ((1 & var9 ^ -1) == -1) {
                                    break L8;
                                  } else {
                                    var7 = param1.a(var9 >> 1047490754, param3, true);
                                    if (var10 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var7 = param1.a(-1, param3, var9 >> -1827134814);
                                break L7;
                              }
                              if (var7 == null) {
                                var5_int = 0;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (var7 != null) {
                            this.field_l[var8] = (ke) (var7);
                            this.field_i[var8] = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var8++;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param2 >= 76) {
                  break L2;
                } else {
                  wj.c(true);
                  break L2;
                }
              }
              stackOut_21_0 = var5_int;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var5);
            stackOut_23_1 = new StringBuilder().append("wj.C(");
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
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
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
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        return stackIn_22_0 != 0;
    }

    public static void c(boolean param0) {
        int[] discarded$0 = null;
        field_p = null;
        field_j = null;
        if (param0) {
            discarded$0 = wj.b(-51);
        }
        field_s = null;
    }

    final static int[] b(int param0) {
        if (param0 != 26770) {
            wj.c(true);
        }
        return new int[8];
    }

    final static void c(int param0) {
        gb.field_d = false;
        ca.field_k = false;
        ni.a(param0 ^ -6357, -1);
        ee.field_c = c.field_m;
        bk.field_c = c.field_m;
        if (param0 != -6399) {
            field_p = (String) null;
        }
    }

    wj(byte[] param0) {
        int incrementValue$9 = 0;
        rc dupTemp$10 = null;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        rc[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        rc var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28_int = 0;
        rc var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        wf var37 = null;
        byte[] var38 = null;
        rc var39 = null;
        byte[] var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        rc var44 = null;
        byte[] var45 = null;
        byte[] var46 = null;
        rc var47 = null;
        rc var48 = null;
        rc var49 = null;
        rc var50 = null;
        rc var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_47_0 = 0;
        byte[] stackIn_50_0 = null;
        byte[] stackIn_53_0 = null;
        int stackIn_74_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_127_0 = 0;
        Object stackIn_130_0 = null;
        byte[] stackIn_130_1 = null;
        Object stackIn_143_0 = null;
        byte[] stackIn_143_1 = null;
        byte[] stackIn_156_0 = null;
        byte[] stackIn_166_0 = null;
        int stackIn_186_0 = 0;
        int stackIn_193_0 = 0;
        byte[] stackIn_204_0 = null;
        int stackIn_212_0 = 0;
        int stackIn_212_1 = 0;
        int stackIn_219_0 = 0;
        int stackIn_219_1 = 0;
        int stackIn_221_0 = 0;
        int stackIn_224_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_239_0 = 0;
        rc stackIn_246_0 = null;
        int stackIn_260_0 = 0;
        int stackIn_260_1 = 0;
        int stackIn_265_0 = 0;
        int stackIn_265_1 = 0;
        rc stackIn_267_0 = null;
        RuntimeException stackIn_273_0 = null;
        StringBuilder stackIn_273_1 = null;
        RuntimeException stackIn_274_0 = null;
        StringBuilder stackIn_274_1 = null;
        RuntimeException stackIn_275_0 = null;
        StringBuilder stackIn_275_1 = null;
        String stackIn_275_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_46_0 = 0;
        Object stackOut_49_0 = null;
        byte[] stackOut_48_0 = null;
        Object stackOut_52_0 = null;
        byte[] stackOut_51_0 = null;
        int stackOut_73_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_126_0 = 0;
        Object stackOut_129_0 = null;
        byte[] stackOut_129_1 = null;
        Object stackOut_142_0 = null;
        byte[] stackOut_142_1 = null;
        byte[] stackOut_155_0 = null;
        byte[] stackOut_165_0 = null;
        int stackOut_185_0 = 0;
        int stackOut_192_0 = 0;
        byte[] stackOut_203_0 = null;
        int stackOut_211_0 = 0;
        int stackOut_211_1 = 0;
        int stackOut_220_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_218_1 = 0;
        int stackOut_238_0 = 0;
        rc stackOut_245_0 = null;
        int stackOut_264_0 = 0;
        int stackOut_264_1 = 0;
        rc stackOut_266_0 = null;
        int stackOut_259_0 = 0;
        int stackOut_259_1 = 0;
        RuntimeException stackOut_272_0 = null;
        StringBuilder stackOut_272_1 = null;
        RuntimeException stackOut_274_0 = null;
        StringBuilder stackOut_274_1 = null;
        String stackOut_274_2 = null;
        RuntimeException stackOut_273_0 = null;
        StringBuilder stackOut_273_1 = null;
        String stackOut_273_2 = null;
        var36 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            this.field_l = new ke[128];
            this.field_h = new rc[128];
            this.field_q = new byte[128];
            this.field_n = new byte[128];
            this.field_i = new int[128];
            this.field_r = new byte[128];
            this.field_k = new short[128];
            var37 = new wf(param0);
            var3 = 0;
            L1: while (true) {
              L2: {
                if (0 == var37.field_j[var3 + var37.field_h]) {
                  break L2;
                } else {
                  var3++;
                  if (var36 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var54 = new byte[var3];
              var41 = var54;
              var4 = var41;
              var5 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if ((var3 ^ -1) >= (var5 ^ -1)) {
                      break L5;
                    } else {
                      var4[var5] = var37.e(true);
                      var5++;
                      if (var36 != 0) {
                        break L4;
                      } else {
                        if (var36 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var3++;
                  var37.field_h = var37.field_h + 1;
                  var5 = var37.field_h;
                  var37.field_h = var37.field_h + var3;
                  break L4;
                }
                var6 = 0;
                L6: while (true) {
                  L7: {
                    if ((var37.field_j[var37.field_h + var6] ^ -1) == -1) {
                      break L7;
                    } else {
                      var6++;
                      if (var36 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var55 = new byte[var6];
                  var42 = var55;
                  var7 = var42;
                  var8 = 0;
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (var8 >= var6) {
                          break L10;
                        } else {
                          var7[var8] = var37.e(true);
                          var8++;
                          if (var36 != 0) {
                            break L9;
                          } else {
                            if (var36 == 0) {
                              continue L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      var6++;
                      var37.field_h = var37.field_h + 1;
                      var8 = var37.field_h;
                      var37.field_h = var37.field_h + var6;
                      break L9;
                    }
                    var9 = 0;
                    L11: while (true) {
                      L12: {
                        if ((var37.field_j[var9 + var37.field_h] ^ -1) == -1) {
                          break L12;
                        } else {
                          var9++;
                          if (var36 == 0) {
                            continue L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var56 = new byte[var9];
                      var43 = var56;
                      var10 = var43;
                      var11_int = 0;
                      L13: while (true) {
                        L14: {
                          L15: {
                            if (var9 <= var11_int) {
                              break L15;
                            } else {
                              var10[var11_int] = var37.e(true);
                              var11_int++;
                              if (var36 != 0) {
                                break L14;
                              } else {
                                if (var36 == 0) {
                                  continue L13;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          var9++;
                          var37.field_h = var37.field_h + 1;
                          break L14;
                        }
                        L16: {
                          L17: {
                            L18: {
                              var52 = new byte[var9];
                              var38 = var52;
                              var11 = var38;
                              if ((var9 ^ -1) >= -2) {
                                break L18;
                              } else {
                                var52[1] = (byte) 1;
                                var12 = 2;
                                var13_int = 1;
                                var14 = 2;
                                L19: while (true) {
                                  L20: {
                                    if (var9 <= var14) {
                                      break L20;
                                    } else {
                                      var15_int = var37.d(true);
                                      stackOut_28_0 = var15_int;
                                      stackIn_38_0 = stackOut_28_0;
                                      stackIn_29_0 = stackOut_28_0;
                                      if (var36 != 0) {
                                        break L16;
                                      } else {
                                        L21: {
                                          L22: {
                                            if (stackIn_29_0 == 0) {
                                              break L22;
                                            } else {
                                              L23: {
                                                if ((var13_int ^ -1) > (var15_int ^ -1)) {
                                                  break L23;
                                                } else {
                                                  var15_int--;
                                                  break L23;
                                                }
                                              }
                                              var13_int = var15_int;
                                              if (var36 == 0) {
                                                break L21;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          incrementValue$9 = var12;
                                          var12++;
                                          var13_int = incrementValue$9;
                                          break L21;
                                        }
                                        var11[var14] = (byte)var13_int;
                                        var14++;
                                        if (var36 == 0) {
                                          continue L19;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                  }
                                  if (var36 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            var12 = var9;
                            break L17;
                          }
                          stackOut_37_0 = var12;
                          stackIn_38_0 = stackOut_37_0;
                          break L16;
                        }
                        var13 = new rc[stackIn_38_0];
                        var14 = 0;
                        L24: while (true) {
                          L25: {
                            L26: {
                              if (var13.length <= var14) {
                                break L26;
                              } else {
                                dupTemp$10 = new rc();
                                var13[var14] = dupTemp$10;
                                var39 = dupTemp$10;
                                var15 = var39;
                                var16_int = var37.d(true);
                                stackOut_40_0 = var16_int;
                                stackIn_47_0 = stackOut_40_0;
                                stackIn_41_0 = stackOut_40_0;
                                if (var36 != 0) {
                                  break L25;
                                } else {
                                  L27: {
                                    if (stackIn_41_0 <= 0) {
                                      break L27;
                                    } else {
                                      var15.field_c = new byte[var16_int * 2];
                                      break L27;
                                    }
                                  }
                                  L28: {
                                    var16_int = var37.d(true);
                                    if ((var16_int ^ -1) >= -1) {
                                      break L28;
                                    } else {
                                      var15.field_g = new byte[var16_int * 2 + 2];
                                      var39.field_g[1] = (byte)64;
                                      break L28;
                                    }
                                  }
                                  var14++;
                                  if (var36 == 0) {
                                    continue L24;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            var14 = var37.d(true);
                            stackOut_46_0 = -1;
                            stackIn_47_0 = stackOut_46_0;
                            break L25;
                          }
                          L29: {
                            if (stackIn_47_0 <= (var14 ^ -1)) {
                              stackOut_49_0 = null;
                              stackIn_50_0 = (byte[]) ((Object) stackOut_49_0);
                              break L29;
                            } else {
                              stackOut_48_0 = new byte[2 * var14];
                              stackIn_50_0 = stackOut_48_0;
                              break L29;
                            }
                          }
                          L30: {
                            var45 = stackIn_50_0;
                            var15_array = var45;
                            var14 = var37.d(true);
                            if (var14 <= 0) {
                              stackOut_52_0 = null;
                              stackIn_53_0 = (byte[]) ((Object) stackOut_52_0);
                              break L30;
                            } else {
                              stackOut_51_0 = new byte[2 * var14];
                              stackIn_53_0 = stackOut_51_0;
                              break L30;
                            }
                          }
                          var46 = stackIn_53_0;
                          var16 = var46;
                          var17 = 0;
                          L31: while (true) {
                            L32: {
                              if (-1 == (var37.field_j[var17 + var37.field_h] ^ -1)) {
                                break L32;
                              } else {
                                var17++;
                                if (var36 == 0) {
                                  continue L31;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            var53 = new byte[var17];
                            var40 = var53;
                            var18 = var40;
                            var19 = 0;
                            L33: while (true) {
                              L34: {
                                L35: {
                                  if (var19 >= var17) {
                                    break L35;
                                  } else {
                                    var18[var19] = var37.e(true);
                                    var19++;
                                    if (var36 != 0) {
                                      break L34;
                                    } else {
                                      if (var36 == 0) {
                                        continue L33;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                                var17++;
                                var37.field_h = var37.field_h + 1;
                                var19 = 0;
                                break L34;
                              }
                              var20 = 0;
                              L36: while (true) {
                                L37: {
                                  L38: {
                                    if ((var20 ^ -1) <= -129) {
                                      break L38;
                                    } else {
                                      var19 = var19 + var37.d(true);
                                      this.field_k[var20] = (short)var19;
                                      var20++;
                                      if (var36 != 0) {
                                        break L37;
                                      } else {
                                        if (var36 == 0) {
                                          continue L36;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                  }
                                  var19 = 0;
                                  break L37;
                                }
                                var20 = 0;
                                L39: while (true) {
                                  L40: {
                                    L41: {
                                      if (128 <= var20) {
                                        break L41;
                                      } else {
                                        var19 = var19 + var37.d(true);
                                        this.field_k[var20] = (short)(this.field_k[var20] + (var19 << 1631847880));
                                        var20++;
                                        if (var36 != 0) {
                                          break L40;
                                        } else {
                                          if (var36 == 0) {
                                            continue L39;
                                          } else {
                                            break L41;
                                          }
                                        }
                                      }
                                    }
                                    var20 = 0;
                                    break L40;
                                  }
                                  var21 = 0;
                                  var22 = 0;
                                  var23 = 0;
                                  L42: while (true) {
                                    L43: {
                                      L44: {
                                        if (var23 >= 128) {
                                          break L44;
                                        } else {
                                          stackOut_73_0 = var20;
                                          stackIn_81_0 = stackOut_73_0;
                                          stackIn_74_0 = stackOut_73_0;
                                          if (var36 != 0) {
                                            break L43;
                                          } else {
                                            L45: {
                                              if (stackIn_74_0 != 0) {
                                                break L45;
                                              } else {
                                                L46: {
                                                  L47: {
                                                    if (var53.length > var21) {
                                                      break L47;
                                                    } else {
                                                      var20 = -1;
                                                      if (var36 == 0) {
                                                        break L46;
                                                      } else {
                                                        break L47;
                                                      }
                                                    }
                                                  }
                                                  incrementValue$11 = var21;
                                                  var21++;
                                                  var20 = var18[incrementValue$11];
                                                  break L46;
                                                }
                                                var22 = var37.g((byte) -99);
                                                break L45;
                                              }
                                            }
                                            this.field_k[var23] = (short)(this.field_k[var23] + vg.a(32768, -1 + var22 << -658371602));
                                            var20--;
                                            this.field_i[var23] = var22;
                                            var23++;
                                            if (var36 == 0) {
                                              continue L42;
                                            } else {
                                              break L44;
                                            }
                                          }
                                        }
                                      }
                                      var21 = 0;
                                      var20 = 0;
                                      var23 = 0;
                                      stackOut_80_0 = 0;
                                      stackIn_81_0 = stackOut_80_0;
                                      break L43;
                                    }
                                    var24 = stackIn_81_0;
                                    L48: while (true) {
                                      L49: {
                                        L50: {
                                          if (-129 >= (var24 ^ -1)) {
                                            break L50;
                                          } else {
                                            stackOut_83_0 = this.field_i[var24] ^ -1;
                                            stackIn_92_0 = stackOut_83_0;
                                            stackIn_84_0 = stackOut_83_0;
                                            if (var36 != 0) {
                                              break L49;
                                            } else {
                                              L51: {
                                                if (stackIn_84_0 == -1) {
                                                  break L51;
                                                } else {
                                                  L52: {
                                                    if ((var20 ^ -1) != -1) {
                                                      break L52;
                                                    } else {
                                                      L53: {
                                                        incrementValue$12 = var5;
                                                        var5++;
                                                        var23 = -1 + var37.field_j[incrementValue$12];
                                                        if (var21 >= var54.length) {
                                                          break L53;
                                                        } else {
                                                          incrementValue$13 = var21;
                                                          var21++;
                                                          var20 = var4[incrementValue$13];
                                                          if (var36 == 0) {
                                                            break L52;
                                                          } else {
                                                            break L53;
                                                          }
                                                        }
                                                      }
                                                      var20 = -1;
                                                      break L52;
                                                    }
                                                  }
                                                  this.field_r[var24] = (byte)var23;
                                                  var20--;
                                                  break L51;
                                                }
                                              }
                                              var24++;
                                              if (var36 == 0) {
                                                continue L48;
                                              } else {
                                                break L50;
                                              }
                                            }
                                          }
                                        }
                                        var20 = 0;
                                        var21 = 0;
                                        var24 = 0;
                                        stackOut_91_0 = 0;
                                        stackIn_92_0 = stackOut_91_0;
                                        break L49;
                                      }
                                      var25_int = stackIn_92_0;
                                      L54: while (true) {
                                        L55: {
                                          L56: {
                                            if ((var25_int ^ -1) <= -129) {
                                              break L56;
                                            } else {
                                              stackOut_94_0 = 0;
                                              stackIn_104_0 = stackOut_94_0;
                                              stackIn_95_0 = stackOut_94_0;
                                              if (var36 != 0) {
                                                break L55;
                                              } else {
                                                L57: {
                                                  L58: {
                                                    if (stackIn_95_0 != this.field_i[var25_int]) {
                                                      break L58;
                                                    } else {
                                                      if (var36 == 0) {
                                                        break L57;
                                                      } else {
                                                        break L58;
                                                      }
                                                    }
                                                  }
                                                  L59: {
                                                    if ((var20 ^ -1) != -1) {
                                                      break L59;
                                                    } else {
                                                      L60: {
                                                        incrementValue$14 = var8;
                                                        var8++;
                                                        var24 = var37.field_j[incrementValue$14] - -16 << -1072087262;
                                                        if ((var55.length ^ -1) >= (var21 ^ -1)) {
                                                          break L60;
                                                        } else {
                                                          incrementValue$15 = var21;
                                                          var21++;
                                                          var20 = var7[incrementValue$15];
                                                          if (var36 == 0) {
                                                            break L59;
                                                          } else {
                                                            break L60;
                                                          }
                                                        }
                                                      }
                                                      var20 = -1;
                                                      break L59;
                                                    }
                                                  }
                                                  this.field_q[var25_int] = (byte)var24;
                                                  var20--;
                                                  break L57;
                                                }
                                                var25_int++;
                                                if (var36 == 0) {
                                                  continue L54;
                                                } else {
                                                  break L56;
                                                }
                                              }
                                            }
                                          }
                                          var21 = 0;
                                          stackOut_103_0 = 0;
                                          stackIn_104_0 = stackOut_103_0;
                                          break L55;
                                        }
                                        var20 = stackIn_104_0;
                                        var25 = null;
                                        var26 = 0;
                                        L61: while (true) {
                                          L62: {
                                            L63: {
                                              if ((var26 ^ -1) <= -129) {
                                                break L63;
                                              } else {
                                                stackOut_106_0 = this.field_i[var26] ^ -1;
                                                stackIn_116_0 = stackOut_106_0;
                                                stackIn_107_0 = stackOut_106_0;
                                                if (var36 != 0) {
                                                  break L62;
                                                } else {
                                                  L64: {
                                                    L65: {
                                                      if (stackIn_107_0 != -1) {
                                                        break L65;
                                                      } else {
                                                        if (var36 == 0) {
                                                          break L64;
                                                        } else {
                                                          break L65;
                                                        }
                                                      }
                                                    }
                                                    L66: {
                                                      if (0 != var20) {
                                                        break L66;
                                                      } else {
                                                        L67: {
                                                          var25 = var13[var52[var21]];
                                                          if (var21 < var56.length) {
                                                            break L67;
                                                          } else {
                                                            var20 = -1;
                                                            if (var36 == 0) {
                                                              break L66;
                                                            } else {
                                                              break L67;
                                                            }
                                                          }
                                                        }
                                                        incrementValue$16 = var21;
                                                        var21++;
                                                        var20 = var10[incrementValue$16];
                                                        break L66;
                                                      }
                                                    }
                                                    var20--;
                                                    this.field_h[var26] = (rc) (var25);
                                                    break L64;
                                                  }
                                                  var26++;
                                                  if (var36 == 0) {
                                                    continue L61;
                                                  } else {
                                                    break L63;
                                                  }
                                                }
                                              }
                                            }
                                            var20 = 0;
                                            var21 = 0;
                                            var26 = 0;
                                            stackOut_115_0 = 0;
                                            stackIn_116_0 = stackOut_115_0;
                                            break L62;
                                          }
                                          var27 = stackIn_116_0;
                                          L68: while (true) {
                                            L69: {
                                              L70: {
                                                if (var27 >= 128) {
                                                  break L70;
                                                } else {
                                                  stackOut_118_0 = var20;
                                                  stackIn_127_0 = stackOut_118_0;
                                                  stackIn_119_0 = stackOut_118_0;
                                                  if (var36 != 0) {
                                                    break L69;
                                                  } else {
                                                    L71: {
                                                      if (stackIn_119_0 != 0) {
                                                        break L71;
                                                      } else {
                                                        L72: {
                                                          L73: {
                                                            if ((var21 ^ -1) <= (var53.length ^ -1)) {
                                                              break L73;
                                                            } else {
                                                              incrementValue$17 = var21;
                                                              var21++;
                                                              var20 = var18[incrementValue$17];
                                                              if (var36 == 0) {
                                                                break L72;
                                                              } else {
                                                                break L73;
                                                              }
                                                            }
                                                          }
                                                          var20 = -1;
                                                          break L72;
                                                        }
                                                        if (this.field_i[var27] <= 0) {
                                                          break L71;
                                                        } else {
                                                          var26 = var37.d(true) + 1;
                                                          break L71;
                                                        }
                                                      }
                                                    }
                                                    var20--;
                                                    this.field_n[var27] = (byte)var26;
                                                    var27++;
                                                    if (var36 == 0) {
                                                      continue L68;
                                                    } else {
                                                      break L70;
                                                    }
                                                  }
                                                }
                                              }
                                              this.field_m = var37.d(true) - -1;
                                              stackOut_126_0 = 0;
                                              stackIn_127_0 = stackOut_126_0;
                                              break L69;
                                            }
                                            var27 = stackIn_127_0;
                                            L74: while (true) {
                                              L75: {
                                                L76: {
                                                  if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                    break L76;
                                                  } else {
                                                    var44 = var13[var27];
                                                    stackOut_129_0 = null;
                                                    stackOut_129_1 = var44.field_c;
                                                    stackIn_143_0 = stackOut_129_0;
                                                    stackIn_143_1 = stackOut_129_1;
                                                    stackIn_130_0 = stackOut_129_0;
                                                    stackIn_130_1 = stackOut_129_1;
                                                    if (var36 != 0) {
                                                      break L75;
                                                    } else {
                                                      L77: {
                                                        L78: {
                                                          L79: {
                                                            L80: {
                                                              if (stackIn_130_0 == stackIn_130_1) {
                                                                break L80;
                                                              } else {
                                                                var29 = 1;
                                                                L81: while (true) {
                                                                  if (var29 >= var44.field_c.length) {
                                                                    break L80;
                                                                  } else {
                                                                    var44.field_c[var29] = var37.e(true);
                                                                    var29 += 2;
                                                                    if (var36 != 0) {
                                                                      break L79;
                                                                    } else {
                                                                      if (var36 == 0) {
                                                                        continue L81;
                                                                      } else {
                                                                        break L80;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            if (var44.field_g == null) {
                                                              break L78;
                                                            } else {
                                                              break L79;
                                                            }
                                                          }
                                                          var29 = 3;
                                                          L82: while (true) {
                                                            if ((var29 ^ -1) <= (var44.field_g.length - 2 ^ -1)) {
                                                              break L78;
                                                            } else {
                                                              var44.field_g[var29] = var37.e(true);
                                                              var29 += 2;
                                                              if (var36 != 0) {
                                                                break L77;
                                                              } else {
                                                                if (var36 == 0) {
                                                                  continue L82;
                                                                } else {
                                                                  break L78;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var27++;
                                                        break L77;
                                                      }
                                                      if (var36 == 0) {
                                                        continue L74;
                                                      } else {
                                                        break L76;
                                                      }
                                                    }
                                                  }
                                                }
                                                stackOut_142_0 = null;
                                                stackOut_142_1 = (byte[]) (var15_array);
                                                stackIn_143_0 = stackOut_142_0;
                                                stackIn_143_1 = stackOut_142_1;
                                                break L75;
                                              }
                                              L83: {
                                                L84: {
                                                  L85: {
                                                    if (stackIn_143_0 == stackIn_143_1) {
                                                      break L85;
                                                    } else {
                                                      var27 = 1;
                                                      L86: while (true) {
                                                        if (var45.length <= var27) {
                                                          break L85;
                                                        } else {
                                                          var15_array[var27] = var37.e(true);
                                                          var27 += 2;
                                                          if (var36 != 0) {
                                                            break L84;
                                                          } else {
                                                            if (var36 == 0) {
                                                              continue L86;
                                                            } else {
                                                              break L85;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (var16 == null) {
                                                    break L84;
                                                  } else {
                                                    var27 = 1;
                                                    L87: while (true) {
                                                      if ((var27 ^ -1) <= (var46.length ^ -1)) {
                                                        break L84;
                                                      } else {
                                                        var16[var27] = var37.e(true);
                                                        var27 += 2;
                                                        if (var36 != 0) {
                                                          break L83;
                                                        } else {
                                                          if (var36 == 0) {
                                                            continue L87;
                                                          } else {
                                                            break L84;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var27 = 0;
                                                break L83;
                                              }
                                              L88: while (true) {
                                                L89: {
                                                  L90: {
                                                    L91: {
                                                      L92: {
                                                        if (var12 <= var27) {
                                                          break L92;
                                                        } else {
                                                          var47 = var13[var27];
                                                          stackOut_155_0 = var47.field_g;
                                                          stackIn_204_0 = stackOut_155_0;
                                                          stackIn_156_0 = stackOut_155_0;
                                                          if (var36 != 0) {
                                                            break L91;
                                                          } else {
                                                            L93: {
                                                              L94: {
                                                                if (stackIn_156_0 == null) {
                                                                  break L94;
                                                                } else {
                                                                  var19 = 0;
                                                                  var29 = 2;
                                                                  L95: while (true) {
                                                                    if ((var47.field_g.length ^ -1) >= (var29 ^ -1)) {
                                                                      break L94;
                                                                    } else {
                                                                      var19 = 1 + var19 + var37.d(true);
                                                                      var47.field_g[var29] = (byte)var19;
                                                                      var29 += 2;
                                                                      if (var36 != 0) {
                                                                        break L93;
                                                                      } else {
                                                                        if (var36 == 0) {
                                                                          continue L95;
                                                                        } else {
                                                                          break L94;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var27++;
                                                              break L93;
                                                            }
                                                            if (var36 == 0) {
                                                              continue L88;
                                                            } else {
                                                              break L92;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var27 = 0;
                                                      L96: while (true) {
                                                        L97: {
                                                          if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                            break L97;
                                                          } else {
                                                            var48 = var13[var27];
                                                            stackOut_165_0 = var48.field_c;
                                                            stackIn_204_0 = stackOut_165_0;
                                                            stackIn_166_0 = stackOut_165_0;
                                                            if (var36 != 0) {
                                                              break L91;
                                                            } else {
                                                              L98: {
                                                                L99: {
                                                                  if (stackIn_166_0 == null) {
                                                                    break L99;
                                                                  } else {
                                                                    var19 = 0;
                                                                    var29 = 2;
                                                                    L100: while (true) {
                                                                      if (var48.field_c.length <= var29) {
                                                                        break L99;
                                                                      } else {
                                                                        var19 = var37.d(true) + 1 + var19;
                                                                        var48.field_c[var29] = (byte)var19;
                                                                        var29 += 2;
                                                                        if (var36 != 0) {
                                                                          break L98;
                                                                        } else {
                                                                          if (var36 == 0) {
                                                                            continue L100;
                                                                          } else {
                                                                            break L99;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                var27++;
                                                                break L98;
                                                              }
                                                              if (var36 == 0) {
                                                                continue L96;
                                                              } else {
                                                                break L97;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        L101: {
                                                          if (var15_array == null) {
                                                            break L101;
                                                          } else {
                                                            var19 = var37.d(true);
                                                            var15_array[0] = (byte)var19;
                                                            var27 = 2;
                                                            L102: while (true) {
                                                              L103: {
                                                                L104: {
                                                                  if (var45.length <= var27) {
                                                                    break L104;
                                                                  } else {
                                                                    var19 = var37.d(true) + var19 + 1;
                                                                    var15_array[var27] = (byte)var19;
                                                                    var27 += 2;
                                                                    if (var36 != 0) {
                                                                      break L103;
                                                                    } else {
                                                                      if (var36 == 0) {
                                                                        continue L102;
                                                                      } else {
                                                                        break L104;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                var27 = var45[0];
                                                                break L103;
                                                              }
                                                              var28_int = var45[1];
                                                              var29 = 0;
                                                              L105: while (true) {
                                                                L106: {
                                                                  L107: {
                                                                    if ((var29 ^ -1) <= (var27 ^ -1)) {
                                                                      break L107;
                                                                    } else {
                                                                      this.field_n[var29] = (byte)(var28_int * this.field_n[var29] - -32 >> -158679418);
                                                                      var29++;
                                                                      if (var36 != 0) {
                                                                        break L106;
                                                                      } else {
                                                                        if (var36 == 0) {
                                                                          continue L105;
                                                                        } else {
                                                                          break L107;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  var29 = 2;
                                                                  break L106;
                                                                }
                                                                L108: while (true) {
                                                                  L109: {
                                                                    L110: {
                                                                      if ((var45.length ^ -1) >= (var29 ^ -1)) {
                                                                        break L110;
                                                                      } else {
                                                                        var30 = var45[var29];
                                                                        var31 = var15_array[1 + var29];
                                                                        var32 = (-var27 + var30) * var28_int - -((-var27 + var30) / 2);
                                                                        stackOut_185_0 = var27;
                                                                        stackIn_193_0 = stackOut_185_0;
                                                                        stackIn_186_0 = stackOut_185_0;
                                                                        if (var36 != 0) {
                                                                          break L109;
                                                                        } else {
                                                                          var33 = stackIn_186_0;
                                                                          L111: while (true) {
                                                                            L112: {
                                                                              L113: {
                                                                                if ((var33 ^ -1) <= (var30 ^ -1)) {
                                                                                  break L113;
                                                                                } else {
                                                                                  var34 = rl.b(-var27 + var30, var32, 25668);
                                                                                  this.field_n[var33] = (byte)(var34 * this.field_n[var33] - -32 >> 2044572166);
                                                                                  var32 = var32 + (-var28_int + var31);
                                                                                  var33++;
                                                                                  if (var36 != 0) {
                                                                                    break L112;
                                                                                  } else {
                                                                                    if (var36 == 0) {
                                                                                      continue L111;
                                                                                    } else {
                                                                                      break L113;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                              var28_int = var31;
                                                                              var27 = var30;
                                                                              var29 += 2;
                                                                              break L112;
                                                                            }
                                                                            if (var36 == 0) {
                                                                              continue L108;
                                                                            } else {
                                                                              break L110;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    stackOut_192_0 = var27;
                                                                    stackIn_193_0 = stackOut_192_0;
                                                                    break L109;
                                                                  }
                                                                  var30 = stackIn_193_0;
                                                                  L114: while (true) {
                                                                    L115: {
                                                                      if (128 <= var30) {
                                                                        break L115;
                                                                      } else {
                                                                        this.field_n[var30] = (byte)(var28_int * this.field_n[var30] + 32 >> 1870569894);
                                                                        var30++;
                                                                        if (var36 != 0) {
                                                                          break L101;
                                                                        } else {
                                                                          if (var36 == 0) {
                                                                            continue L114;
                                                                          } else {
                                                                            break L115;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    var15_array = null;
                                                                    break L101;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        L116: {
                                                          if (var16 != null) {
                                                            break L116;
                                                          } else {
                                                            var27 = 0;
                                                            L117: while (true) {
                                                              if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                                break L90;
                                                              } else {
                                                                var13[var27].field_e = var37.d(true);
                                                                var27++;
                                                                if (var36 != 0) {
                                                                  break L89;
                                                                } else {
                                                                  if (var36 == 0) {
                                                                    continue L117;
                                                                  } else {
                                                                    break L116;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var19 = var37.d(true);
                                                        stackOut_203_0 = (byte[]) (var16);
                                                        stackIn_204_0 = stackOut_203_0;
                                                        break L91;
                                                      }
                                                    }
                                                    stackIn_204_0[0] = (byte)var19;
                                                    var27 = 2;
                                                    L118: while (true) {
                                                      L119: {
                                                        L120: {
                                                          if (var46.length <= var27) {
                                                            break L120;
                                                          } else {
                                                            var19 = var37.d(true) + var19 - -1;
                                                            var16[var27] = (byte)var19;
                                                            var27 += 2;
                                                            if (var36 != 0) {
                                                              break L119;
                                                            } else {
                                                              if (var36 == 0) {
                                                                continue L118;
                                                              } else {
                                                                break L120;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var27 = var46[0];
                                                        break L119;
                                                      }
                                                      var28_int = var46[1] << 1733682753;
                                                      var29 = 0;
                                                      L121: while (true) {
                                                        L122: {
                                                          L123: {
                                                            L124: {
                                                              if (var27 <= var29) {
                                                                break L124;
                                                              } else {
                                                                var30 = (this.field_q[var29] & 255) + var28_int;
                                                                stackOut_211_0 = -1;
                                                                stackOut_211_1 = var30 ^ -1;
                                                                stackIn_219_0 = stackOut_211_0;
                                                                stackIn_219_1 = stackOut_211_1;
                                                                stackIn_212_0 = stackOut_211_0;
                                                                stackIn_212_1 = stackOut_211_1;
                                                                if (var36 != 0) {
                                                                  L125: while (true) {
                                                                    if (stackIn_219_0 <= stackIn_219_1) {
                                                                      break L123;
                                                                    } else {
                                                                      var30 = var46[var29];
                                                                      var31 = var16[var29 - -1] << -1816063903;
                                                                      var32 = (var30 - var27) / 2 + (var30 - var27) * var28_int;
                                                                      stackOut_220_0 = var27;
                                                                      stackIn_239_0 = stackOut_220_0;
                                                                      stackIn_221_0 = stackOut_220_0;
                                                                      if (var36 != 0) {
                                                                        break L122;
                                                                      } else {
                                                                        var33 = stackIn_221_0;
                                                                        L126: while (true) {
                                                                          L127: {
                                                                            L128: {
                                                                              if ((var33 ^ -1) <= (var30 ^ -1)) {
                                                                                break L128;
                                                                              } else {
                                                                                var34 = rl.b(var30 + -var27, var32, 25668);
                                                                                var35 = (255 & this.field_q[var33]) - -var34;
                                                                                stackOut_223_0 = var35;
                                                                                stackIn_230_0 = stackOut_223_0;
                                                                                stackIn_224_0 = stackOut_223_0;
                                                                                if (var36 != 0) {
                                                                                  break L127;
                                                                                } else {
                                                                                  L129: {
                                                                                    if (stackIn_224_0 >= 0) {
                                                                                      break L129;
                                                                                    } else {
                                                                                      var35 = 0;
                                                                                      break L129;
                                                                                    }
                                                                                  }
                                                                                  L130: {
                                                                                    if (128 >= var35) {
                                                                                      break L130;
                                                                                    } else {
                                                                                      var35 = 128;
                                                                                      break L130;
                                                                                    }
                                                                                  }
                                                                                  this.field_q[var33] = (byte)var35;
                                                                                  var32 = var32 + (-var28_int + var31);
                                                                                  var33++;
                                                                                  if (var36 == 0) {
                                                                                    continue L126;
                                                                                  } else {
                                                                                    break L128;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var28_int = var31;
                                                                            stackOut_229_0 = var30;
                                                                            stackIn_230_0 = stackOut_229_0;
                                                                            break L127;
                                                                          }
                                                                          var27 = stackIn_230_0;
                                                                          var29 += 2;
                                                                          if (var36 == 0) {
                                                                            stackOut_218_0 = var46.length;
                                                                            stackOut_218_1 = var29;
                                                                            stackIn_219_0 = stackOut_218_0;
                                                                            stackIn_219_1 = stackOut_218_1;
                                                                            continue L125;
                                                                          } else {
                                                                            break L123;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  L131: {
                                                                    if (stackIn_212_0 >= stackIn_212_1) {
                                                                      break L131;
                                                                    } else {
                                                                      var30 = 0;
                                                                      break L131;
                                                                    }
                                                                  }
                                                                  L132: {
                                                                    if (-129 <= (var30 ^ -1)) {
                                                                      break L132;
                                                                    } else {
                                                                      var30 = 128;
                                                                      break L132;
                                                                    }
                                                                  }
                                                                  this.field_q[var29] = (byte)var30;
                                                                  var29++;
                                                                  if (var36 == 0) {
                                                                    continue L121;
                                                                  } else {
                                                                    break L124;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var29 = 2;
                                                            L133: while (true) {
                                                              stackOut_218_0 = var46.length;
                                                              stackOut_218_1 = var29;
                                                              stackIn_219_0 = stackOut_218_0;
                                                              stackIn_219_1 = stackOut_218_1;
                                                              if (stackIn_219_0 <= stackIn_219_1) {
                                                                break L123;
                                                              } else {
                                                                var30 = var46[var29];
                                                                var31 = var16[var29 - -1] << -1816063903;
                                                                var32 = (var30 - var27) / 2 + (var30 - var27) * var28_int;
                                                                stackOut_220_0 = var27;
                                                                stackIn_239_0 = stackOut_220_0;
                                                                stackIn_221_0 = stackOut_220_0;
                                                                if (var36 != 0) {
                                                                  break L122;
                                                                } else {
                                                                  var33 = stackIn_221_0;
                                                                  L134: while (true) {
                                                                    L135: {
                                                                      L136: {
                                                                        if ((var33 ^ -1) <= (var30 ^ -1)) {
                                                                          break L136;
                                                                        } else {
                                                                          var34 = rl.b(var30 + -var27, var32, 25668);
                                                                          var35 = (255 & this.field_q[var33]) - -var34;
                                                                          stackOut_223_0 = var35;
                                                                          stackIn_230_0 = stackOut_223_0;
                                                                          stackIn_224_0 = stackOut_223_0;
                                                                          if (var36 != 0) {
                                                                            break L135;
                                                                          } else {
                                                                            L137: {
                                                                              if (stackIn_224_0 >= 0) {
                                                                                break L137;
                                                                              } else {
                                                                                var35 = 0;
                                                                                break L137;
                                                                              }
                                                                            }
                                                                            L138: {
                                                                              if (128 >= var35) {
                                                                                break L138;
                                                                              } else {
                                                                                var35 = 128;
                                                                                break L138;
                                                                              }
                                                                            }
                                                                            this.field_q[var33] = (byte)var35;
                                                                            var32 = var32 + (-var28_int + var31);
                                                                            var33++;
                                                                            if (var36 == 0) {
                                                                              continue L134;
                                                                            } else {
                                                                              break L136;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      var28_int = var31;
                                                                      stackOut_229_0 = var30;
                                                                      stackIn_230_0 = stackOut_229_0;
                                                                      break L135;
                                                                    }
                                                                    var27 = stackIn_230_0;
                                                                    var29 += 2;
                                                                    if (var36 == 0) {
                                                                      continue L133;
                                                                    } else {
                                                                      break L123;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var16 = null;
                                                          var30 = var27;
                                                          L139: while (true) {
                                                            if (var30 >= 128) {
                                                              stackOut_238_0 = 0;
                                                              stackIn_239_0 = stackOut_238_0;
                                                              break L122;
                                                            } else {
                                                              L140: {
                                                                var31 = var28_int + (255 & this.field_q[var30]);
                                                                if (0 <= var31) {
                                                                  break L140;
                                                                } else {
                                                                  var31 = 0;
                                                                  break L140;
                                                                }
                                                              }
                                                              L141: {
                                                                if (-129 <= (var31 ^ -1)) {
                                                                  break L141;
                                                                } else {
                                                                  var31 = 128;
                                                                  break L141;
                                                                }
                                                              }
                                                              this.field_q[var30] = (byte)var31;
                                                              var30++;
                                                              continue L139;
                                                            }
                                                          }
                                                        }
                                                        var27 = stackIn_239_0;
                                                        L142: while (true) {
                                                          if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                            break L90;
                                                          } else {
                                                            var13[var27].field_e = var37.d(true);
                                                            var27++;
                                                            if (var36 != 0) {
                                                              break L89;
                                                            } else {
                                                              if (var36 == 0) {
                                                                continue L142;
                                                              } else {
                                                                break L90;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var27 = 0;
                                                  break L89;
                                                }
                                                L143: while (true) {
                                                  L144: {
                                                    L145: {
                                                      L146: {
                                                        if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                          break L146;
                                                        } else {
                                                          var49 = var13[var27];
                                                          stackOut_245_0 = (rc) (var49);
                                                          stackIn_267_0 = stackOut_245_0;
                                                          stackIn_246_0 = stackOut_245_0;
                                                          if (var36 != 0) {
                                                            L147: while (true) {
                                                              var51 = stackIn_267_0;
                                                              var28 = var51;
                                                              if (var36 != 0) {
                                                                break L145;
                                                              } else {
                                                                L148: {
                                                                  if (-1 <= (var51.field_k ^ -1)) {
                                                                    break L148;
                                                                  } else {
                                                                    var51.field_h = var37.d(true);
                                                                    break L148;
                                                                  }
                                                                }
                                                                var27++;
                                                                if (var36 == 0) {
                                                                  stackOut_264_0 = var27;
                                                                  stackOut_264_1 = var12;
                                                                  stackIn_265_0 = stackOut_264_0;
                                                                  stackIn_265_1 = stackOut_264_1;
                                                                  if (stackIn_265_0 >= stackIn_265_1) {
                                                                    break L144;
                                                                  } else {
                                                                    stackOut_266_0 = var13[var27];
                                                                    stackIn_267_0 = stackOut_266_0;
                                                                    continue L147;
                                                                  }
                                                                } else {
                                                                  break L144;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            L149: {
                                                              if (stackIn_246_0.field_c == null) {
                                                                break L149;
                                                              } else {
                                                                var49.field_j = var37.d(true);
                                                                break L149;
                                                              }
                                                            }
                                                            L150: {
                                                              if (null == var49.field_g) {
                                                                break L150;
                                                              } else {
                                                                var49.field_l = var37.d(true);
                                                                break L150;
                                                              }
                                                            }
                                                            L151: {
                                                              if (-1 <= (var49.field_e ^ -1)) {
                                                                break L151;
                                                              } else {
                                                                var49.field_b = var37.d(true);
                                                                break L151;
                                                              }
                                                            }
                                                            var27++;
                                                            if (var36 == 0) {
                                                              continue L143;
                                                            } else {
                                                              break L146;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var27 = 0;
                                                      L152: while (true) {
                                                        L153: {
                                                          L154: {
                                                            if (var12 <= var27) {
                                                              break L154;
                                                            } else {
                                                              var13[var27].field_d = var37.d(true);
                                                              var27++;
                                                              if (var36 != 0) {
                                                                break L153;
                                                              } else {
                                                                if (var36 == 0) {
                                                                  continue L152;
                                                                } else {
                                                                  break L154;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var27 = 0;
                                                          break L153;
                                                        }
                                                        L155: while (true) {
                                                          L156: {
                                                            if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                              break L156;
                                                            } else {
                                                              var50 = var13[var27];
                                                              stackOut_259_0 = 0;
                                                              stackOut_259_1 = var50.field_d;
                                                              stackIn_265_0 = stackOut_259_0;
                                                              stackIn_265_1 = stackOut_259_1;
                                                              stackIn_260_0 = stackOut_259_0;
                                                              stackIn_260_1 = stackOut_259_1;
                                                              if (var36 != 0) {
                                                                L157: while (true) {
                                                                  if (stackIn_265_0 >= stackIn_265_1) {
                                                                    break L144;
                                                                  } else {
                                                                    stackOut_266_0 = var13[var27];
                                                                    stackIn_267_0 = stackOut_266_0;
                                                                    var51 = stackIn_267_0;
                                                                    var28 = var51;
                                                                    if (var36 != 0) {
                                                                      break L145;
                                                                    } else {
                                                                      L158: {
                                                                        if (-1 <= (var51.field_k ^ -1)) {
                                                                          break L158;
                                                                        } else {
                                                                          var51.field_h = var37.d(true);
                                                                          break L158;
                                                                        }
                                                                      }
                                                                      var27++;
                                                                      if (var36 == 0) {
                                                                        stackOut_264_0 = var27;
                                                                        stackOut_264_1 = var12;
                                                                        stackIn_265_0 = stackOut_264_0;
                                                                        stackIn_265_1 = stackOut_264_1;
                                                                        continue L157;
                                                                      } else {
                                                                        break L144;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                L159: {
                                                                  if (stackIn_260_0 >= stackIn_260_1) {
                                                                    break L159;
                                                                  } else {
                                                                    var50.field_k = var37.d(true);
                                                                    break L159;
                                                                  }
                                                                }
                                                                var27++;
                                                                if (var36 == 0) {
                                                                  continue L155;
                                                                } else {
                                                                  break L156;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var27 = 0;
                                                          L160: while (true) {
                                                            stackOut_264_0 = var27;
                                                            stackOut_264_1 = var12;
                                                            stackIn_265_0 = stackOut_264_0;
                                                            stackIn_265_1 = stackOut_264_1;
                                                            if (stackIn_265_0 >= stackIn_265_1) {
                                                              break L144;
                                                            } else {
                                                              stackOut_266_0 = var13[var27];
                                                              stackIn_267_0 = stackOut_266_0;
                                                              var51 = stackIn_267_0;
                                                              var28 = var51;
                                                              if (var36 != 0) {
                                                                break L145;
                                                              } else {
                                                                L161: {
                                                                  if (-1 <= (var51.field_k ^ -1)) {
                                                                    break L161;
                                                                  } else {
                                                                    var51.field_h = var37.d(true);
                                                                    break L161;
                                                                  }
                                                                }
                                                                var27++;
                                                                if (var36 == 0) {
                                                                  continue L160;
                                                                } else {
                                                                  break L144;
                                                                }
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
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L162: {
            var2 = decompiledCaughtException;
            stackOut_272_0 = (RuntimeException) (var2);
            stackOut_272_1 = new StringBuilder().append("wj.<init>(");
            stackIn_274_0 = stackOut_272_0;
            stackIn_274_1 = stackOut_272_1;
            stackIn_273_0 = stackOut_272_0;
            stackIn_273_1 = stackOut_272_1;
            if (param0 == null) {
              stackOut_274_0 = (RuntimeException) ((Object) stackIn_274_0);
              stackOut_274_1 = (StringBuilder) ((Object) stackIn_274_1);
              stackOut_274_2 = "null";
              stackIn_275_0 = stackOut_274_0;
              stackIn_275_1 = stackOut_274_1;
              stackIn_275_2 = stackOut_274_2;
              break L162;
            } else {
              stackOut_273_0 = (RuntimeException) ((Object) stackIn_273_0);
              stackOut_273_1 = (StringBuilder) ((Object) stackIn_273_1);
              stackOut_273_2 = "{...}";
              stackIn_275_0 = stackOut_273_0;
              stackIn_275_1 = stackOut_273_1;
              stackIn_275_2 = stackOut_273_2;
              break L162;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_275_0), stackIn_275_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_o = 500;
    }
}
