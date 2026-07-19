/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends wf {
    private int[] field_o;
    static int field_l;
    byte[] field_p;
    hb[] field_j;
    static j field_i;
    nh[] field_m;
    short[] field_k;
    int field_h;
    byte[] field_g;
    byte[] field_n;

    final void d(int param0) {
        if (param0 <= 56) {
            field_i = (j) null;
        }
        this.field_o = null;
    }

    public static void a(byte param0) {
        field_i = null;
        if (param0 < 74) {
            field_i = (j) null;
        }
    }

    final boolean a(bl param0, int[] param1, int param2, byte[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 == -1) {
              var5_int = 1;
              var6 = 0;
              var7 = null;
              var8 = 0;
              L1: while (true) {
                L2: {
                  if ((var8 ^ -1) <= -129) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (param3 == null) {
                          break L4;
                        } else {
                          if (param3[var8] != 0) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        var9 = this.field_o[var8];
                        if (0 != var9) {
                          break L5;
                        } else {
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if ((var6 ^ -1) != (var9 ^ -1)) {
                          L7: {
                            L8: {
                              var6 = var9;
                              var9--;
                              if ((1 & var9) == 0) {
                                break L8;
                              } else {
                                var7 = param0.a(param2 + 1673501265, var9 >> 16721986, param1);
                                if (var10 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var7 = param0.a(param1, var9 >> -2035343518, (byte) 17);
                            break L7;
                          }
                          if (var7 != null) {
                            break L6;
                          } else {
                            var5_int = 0;
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      if (var7 == null) {
                        break L3;
                      } else {
                        this.field_j[var8] = (hb) (var7);
                        this.field_o[var8] = 0;
                        break L3;
                      }
                    }
                    var8++;
                    if (var10 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_22_0 = var5_int;
                stackIn_23_0 = stackOut_22_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("si.A(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          L11: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_23_0 != 0;
        }
    }

    si(byte[] param0) {
        int incrementValue$9 = 0;
        nh dupTemp$10 = null;
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
        nh[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        nh var15 = null;
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
        nh var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        oa var37 = null;
        byte[] var38 = null;
        nh var39 = null;
        byte[] var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        nh var44 = null;
        byte[] var45 = null;
        byte[] var46 = null;
        nh var47 = null;
        nh var48 = null;
        nh var49 = null;
        nh var50 = null;
        nh var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        byte[] stackIn_50_0 = null;
        byte[] stackIn_53_0 = null;
        int stackIn_74_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        Object stackIn_130_0 = null;
        byte[] stackIn_130_1 = null;
        byte[] stackIn_155_0 = null;
        Object stackIn_165_0 = null;
        byte[] stackIn_165_1 = null;
        Object stackIn_173_0 = null;
        byte[] stackIn_173_1 = null;
        byte[] stackIn_175_0 = null;
        int stackIn_187_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_210_0 = 0;
        int stackIn_216_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_218_1 = 0;
        int stackIn_220_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_223_1 = 0;
        int stackIn_237_0 = 0;
        nh stackIn_244_0 = null;
        int stackIn_258_0 = 0;
        int stackIn_262_0 = 0;
        nh stackIn_266_0 = null;
        RuntimeException stackIn_271_0 = null;
        StringBuilder stackIn_271_1 = null;
        RuntimeException stackIn_272_0 = null;
        StringBuilder stackIn_272_1 = null;
        RuntimeException stackIn_273_0 = null;
        StringBuilder stackIn_273_1 = null;
        String stackIn_273_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        Object stackOut_47_0 = null;
        byte[] stackOut_49_0 = null;
        Object stackOut_52_0 = null;
        byte[] stackOut_51_0 = null;
        int stackOut_73_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        Object stackOut_129_0 = null;
        byte[] stackOut_129_1 = null;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        byte[] stackOut_154_0 = null;
        Object stackOut_164_0 = null;
        byte[] stackOut_164_1 = null;
        Object stackOut_172_0 = null;
        byte[] stackOut_172_1 = null;
        byte[] stackOut_174_0 = null;
        int stackOut_186_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_215_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_217_1 = 0;
        int stackOut_219_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_222_1 = 0;
        int stackOut_236_0 = 0;
        nh stackOut_243_0 = null;
        nh stackOut_265_0 = null;
        int stackOut_257_0 = 0;
        int stackOut_261_0 = 0;
        RuntimeException stackOut_270_0 = null;
        StringBuilder stackOut_270_1 = null;
        RuntimeException stackOut_272_0 = null;
        StringBuilder stackOut_272_1 = null;
        String stackOut_272_2 = null;
        RuntimeException stackOut_271_0 = null;
        StringBuilder stackOut_271_1 = null;
        String stackOut_271_2 = null;
        var36 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            this.field_p = new byte[128];
            this.field_o = new int[128];
            this.field_k = new short[128];
            this.field_n = new byte[128];
            this.field_j = new hb[128];
            this.field_g = new byte[128];
            this.field_m = new nh[128];
            var37 = new oa(param0);
            var3 = 0;
            L1: while (true) {
              L2: {
                if (-1 == (var37.field_g[var3 + var37.field_h] ^ -1)) {
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
                    if ((var5 ^ -1) <= (var3 ^ -1)) {
                      break L5;
                    } else {
                      var4[var5] = var37.b(true);
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
                  var37.field_h = var37.field_h + 1;
                  var3++;
                  var5 = var37.field_h;
                  var37.field_h = var37.field_h + var3;
                  break L4;
                }
                var6 = 0;
                L6: while (true) {
                  L7: {
                    if (var37.field_g[var37.field_h - -var6] == 0) {
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
                          var7[var8] = var37.b(true);
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
                        if (-1 == (var37.field_g[var37.field_h - -var9] ^ -1)) {
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
                              var10[var11_int] = var37.b(true);
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
                          var37.field_h = var37.field_h + 1;
                          var9++;
                          break L14;
                        }
                        L16: {
                          L17: {
                            L18: {
                              var52 = new byte[var9];
                              var38 = var52;
                              var11 = var38;
                              if (-2 <= (var9 ^ -1)) {
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
                                      var15_int = var37.d((byte) 72);
                                      stackOut_28_0 = var15_int;
                                      stackIn_38_0 = stackOut_28_0;
                                      stackIn_29_0 = stackOut_28_0;
                                      if (var36 != 0) {
                                        break L16;
                                      } else {
                                        L21: {
                                          L22: {
                                            if (stackIn_29_0 != 0) {
                                              break L22;
                                            } else {
                                              incrementValue$9 = var12;
                                              var12++;
                                              var13_int = incrementValue$9;
                                              if (var36 == 0) {
                                                break L21;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          L23: {
                                            if ((var15_int ^ -1) < (var13_int ^ -1)) {
                                              break L23;
                                            } else {
                                              var15_int--;
                                              break L23;
                                            }
                                          }
                                          var13_int = var15_int;
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
                        var13 = new nh[stackIn_38_0];
                        var14 = 0;
                        L24: while (true) {
                          L25: {
                            L26: {
                              L27: {
                                if (var13.length <= var14) {
                                  break L27;
                                } else {
                                  dupTemp$10 = new nh();
                                  var13[var14] = dupTemp$10;
                                  var39 = dupTemp$10;
                                  var15 = var39;
                                  var16_int = var37.d((byte) 63);
                                  stackOut_40_0 = 0;
                                  stackOut_40_1 = var16_int;
                                  stackIn_49_0 = stackOut_40_0;
                                  stackIn_49_1 = stackOut_40_1;
                                  stackIn_41_0 = stackOut_40_0;
                                  stackIn_41_1 = stackOut_40_1;
                                  if (var36 != 0) {
                                    break L26;
                                  } else {
                                    L28: {
                                      if (stackIn_41_0 >= stackIn_41_1) {
                                        break L28;
                                      } else {
                                        var15.field_g = new byte[var16_int * 2];
                                        break L28;
                                      }
                                    }
                                    L29: {
                                      var16_int = var37.d((byte) 90);
                                      if (var16_int <= 0) {
                                        break L29;
                                      } else {
                                        var15.field_c = new byte[2 + var16_int * 2];
                                        var39.field_c[1] = (byte)64;
                                        break L29;
                                      }
                                    }
                                    var14++;
                                    if (var36 == 0) {
                                      continue L24;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                              }
                              var14 = var37.d((byte) 91);
                              if (var14 > 0) {
                                stackOut_48_0 = 2;
                                stackOut_48_1 = var14;
                                stackIn_49_0 = stackOut_48_0;
                                stackIn_49_1 = stackOut_48_1;
                                break L26;
                              } else {
                                stackOut_47_0 = null;
                                stackIn_50_0 = (byte[]) ((Object) stackOut_47_0);
                                break L25;
                              }
                            }
                            stackOut_49_0 = new byte[stackIn_49_0 * stackIn_49_1];
                            stackIn_50_0 = stackOut_49_0;
                            break L25;
                          }
                          L30: {
                            var57 = stackIn_50_0;
                            var45 = var57;
                            var15_array = var45;
                            var14 = var37.d((byte) 87);
                            if ((var14 ^ -1) >= -1) {
                              stackOut_52_0 = null;
                              stackIn_53_0 = (byte[]) ((Object) stackOut_52_0);
                              break L30;
                            } else {
                              stackOut_51_0 = new byte[var14 * 2];
                              stackIn_53_0 = stackOut_51_0;
                              break L30;
                            }
                          }
                          var46 = stackIn_53_0;
                          var16 = var46;
                          var17 = 0;
                          L31: while (true) {
                            L32: {
                              if ((var37.field_g[var17 + var37.field_h] ^ -1) == -1) {
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
                                  if (var17 <= var19) {
                                    break L35;
                                  } else {
                                    var18[var19] = var37.b(true);
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
                                    if (128 <= var20) {
                                      break L38;
                                    } else {
                                      var19 = var19 + var37.d((byte) 45);
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
                                      if ((var20 ^ -1) <= -129) {
                                        break L41;
                                      } else {
                                        var19 = var19 + var37.d((byte) 56);
                                        this.field_k[var20] = (short)(this.field_k[var20] + (var19 << -2087784504));
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
                                        if (128 <= var23) {
                                          break L44;
                                        } else {
                                          stackOut_73_0 = var20 ^ -1;
                                          stackIn_81_0 = stackOut_73_0;
                                          stackIn_74_0 = stackOut_73_0;
                                          if (var36 != 0) {
                                            break L43;
                                          } else {
                                            L45: {
                                              if (stackIn_74_0 != -1) {
                                                break L45;
                                              } else {
                                                L46: {
                                                  L47: {
                                                    if ((var53.length ^ -1) >= (var21 ^ -1)) {
                                                      break L47;
                                                    } else {
                                                      incrementValue$11 = var21;
                                                      var21++;
                                                      var20 = var18[incrementValue$11];
                                                      if (var36 == 0) {
                                                        break L46;
                                                      } else {
                                                        break L47;
                                                      }
                                                    }
                                                  }
                                                  var20 = -1;
                                                  break L46;
                                                }
                                                var22 = var37.i(17783);
                                                break L45;
                                              }
                                            }
                                            this.field_k[var23] = (short)(this.field_k[var23] + (vg.c(2, var22 + -1) << -524218994));
                                            this.field_o[var23] = var22;
                                            var20--;
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
                                            stackOut_83_0 = this.field_o[var24] ^ -1;
                                            stackIn_93_0 = stackOut_83_0;
                                            stackIn_84_0 = stackOut_83_0;
                                            if (var36 != 0) {
                                              break L49;
                                            } else {
                                              L51: {
                                                if (stackIn_84_0 == -1) {
                                                  break L51;
                                                } else {
                                                  L52: {
                                                    if (var20 != 0) {
                                                      break L52;
                                                    } else {
                                                      L53: {
                                                        L54: {
                                                          if ((var54.length ^ -1) < (var21 ^ -1)) {
                                                            break L54;
                                                          } else {
                                                            var20 = -1;
                                                            if (var36 == 0) {
                                                              break L53;
                                                            } else {
                                                              break L54;
                                                            }
                                                          }
                                                        }
                                                        incrementValue$12 = var21;
                                                        var21++;
                                                        var20 = var4[incrementValue$12];
                                                        break L53;
                                                      }
                                                      incrementValue$13 = var5;
                                                      var5++;
                                                      var23 = var37.field_g[incrementValue$13] + -1;
                                                      break L52;
                                                    }
                                                  }
                                                  this.field_g[var24] = (byte)var23;
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
                                        stackOut_92_0 = 0;
                                        stackIn_93_0 = stackOut_92_0;
                                        break L49;
                                      }
                                      var25_int = stackIn_93_0;
                                      L55: while (true) {
                                        L56: {
                                          L57: {
                                            if (var25_int >= 128) {
                                              break L57;
                                            } else {
                                              stackOut_95_0 = this.field_o[var25_int];
                                              stackIn_104_0 = stackOut_95_0;
                                              stackIn_96_0 = stackOut_95_0;
                                              if (var36 != 0) {
                                                break L56;
                                              } else {
                                                L58: {
                                                  if (stackIn_96_0 == 0) {
                                                    break L58;
                                                  } else {
                                                    L59: {
                                                      if ((var20 ^ -1) != -1) {
                                                        break L59;
                                                      } else {
                                                        L60: {
                                                          incrementValue$14 = var8;
                                                          var8++;
                                                          var24 = var37.field_g[incrementValue$14] + 16 << 967768098;
                                                          if (var55.length > var21) {
                                                            break L60;
                                                          } else {
                                                            var20 = -1;
                                                            if (var36 == 0) {
                                                              break L59;
                                                            } else {
                                                              break L60;
                                                            }
                                                          }
                                                        }
                                                        incrementValue$15 = var21;
                                                        var21++;
                                                        var20 = var7[incrementValue$15];
                                                        break L59;
                                                      }
                                                    }
                                                    this.field_p[var25_int] = (byte)var24;
                                                    var20--;
                                                    break L58;
                                                  }
                                                }
                                                var25_int++;
                                                if (var36 == 0) {
                                                  continue L55;
                                                } else {
                                                  break L57;
                                                }
                                              }
                                            }
                                          }
                                          var20 = 0;
                                          stackOut_103_0 = 0;
                                          stackIn_104_0 = stackOut_103_0;
                                          break L56;
                                        }
                                        var21 = stackIn_104_0;
                                        var25 = null;
                                        var26 = 0;
                                        L61: while (true) {
                                          L62: {
                                            L63: {
                                              if (128 <= var26) {
                                                break L63;
                                              } else {
                                                stackOut_106_0 = -1;
                                                stackIn_116_0 = stackOut_106_0;
                                                stackIn_107_0 = stackOut_106_0;
                                                if (var36 != 0) {
                                                  break L62;
                                                } else {
                                                  L64: {
                                                    L65: {
                                                      if (stackIn_107_0 != (this.field_o[var26] ^ -1)) {
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
                                                      if (var20 != 0) {
                                                        break L66;
                                                      } else {
                                                        L67: {
                                                          var25 = var13[var52[var21]];
                                                          if ((var21 ^ -1) > (var56.length ^ -1)) {
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
                                                    this.field_m[var26] = (nh) (var25);
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
                                                L71: {
                                                  L72: {
                                                    L73: {
                                                      L74: {
                                                        L75: {
                                                          L76: {
                                                            if (-129 >= (var27 ^ -1)) {
                                                              break L76;
                                                            } else {
                                                              stackOut_118_0 = -1;
                                                              stackOut_118_1 = var20 ^ -1;
                                                              stackIn_128_0 = stackOut_118_0;
                                                              stackIn_128_1 = stackOut_118_1;
                                                              stackIn_119_0 = stackOut_118_0;
                                                              stackIn_119_1 = stackOut_118_1;
                                                              if (var36 != 0) {
                                                                L77: while (true) {
                                                                  if (stackIn_128_0 >= stackIn_128_1) {
                                                                    break L75;
                                                                  } else {
                                                                    var44 = var13[var27];
                                                                    stackOut_129_0 = null;
                                                                    stackOut_129_1 = var44.field_g;
                                                                    stackIn_173_0 = stackOut_129_0;
                                                                    stackIn_173_1 = stackOut_129_1;
                                                                    stackIn_130_0 = stackOut_129_0;
                                                                    stackIn_130_1 = stackOut_129_1;
                                                                    if (var36 != 0) {
                                                                      break L74;
                                                                    } else {
                                                                      L78: {
                                                                        L79: {
                                                                          L80: {
                                                                            L81: {
                                                                              if (stackIn_130_0 == stackIn_130_1) {
                                                                                break L81;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L82: while (true) {
                                                                                  if (var44.field_g.length <= var29) {
                                                                                    break L81;
                                                                                  } else {
                                                                                    var44.field_g[var29] = var37.b(true);
                                                                                    var29 += 2;
                                                                                    if (var36 != 0) {
                                                                                      break L80;
                                                                                    } else {
                                                                                      if (var36 == 0) {
                                                                                        continue L82;
                                                                                      } else {
                                                                                        break L81;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (null == var44.field_c) {
                                                                              break L79;
                                                                            } else {
                                                                              break L80;
                                                                            }
                                                                          }
                                                                          var29 = 3;
                                                                          L83: while (true) {
                                                                            if ((var44.field_c.length - 2 ^ -1) >= (var29 ^ -1)) {
                                                                              break L79;
                                                                            } else {
                                                                              var44.field_c[var29] = var37.b(true);
                                                                              var29 += 2;
                                                                              if (var36 != 0) {
                                                                                break L78;
                                                                              } else {
                                                                                if (var36 == 0) {
                                                                                  continue L83;
                                                                                } else {
                                                                                  break L79;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        var27++;
                                                                        break L78;
                                                                      }
                                                                      if (var36 == 0) {
                                                                        stackOut_127_0 = var12 ^ -1;
                                                                        stackOut_127_1 = var27 ^ -1;
                                                                        stackIn_128_0 = stackOut_127_0;
                                                                        stackIn_128_1 = stackOut_127_1;
                                                                        continue L77;
                                                                      } else {
                                                                        break L75;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                L84: {
                                                                  if (stackIn_119_0 != stackIn_119_1) {
                                                                    break L84;
                                                                  } else {
                                                                    L85: {
                                                                      L86: {
                                                                        if (var53.length <= var21) {
                                                                          break L86;
                                                                        } else {
                                                                          incrementValue$17 = var21;
                                                                          var21++;
                                                                          var20 = var18[incrementValue$17];
                                                                          if (var36 == 0) {
                                                                            break L85;
                                                                          } else {
                                                                            break L86;
                                                                          }
                                                                        }
                                                                      }
                                                                      var20 = -1;
                                                                      break L85;
                                                                    }
                                                                    if (-1 <= (this.field_o[var27] ^ -1)) {
                                                                      break L84;
                                                                    } else {
                                                                      var26 = var37.d((byte) 99) + 1;
                                                                      break L84;
                                                                    }
                                                                  }
                                                                }
                                                                this.field_n[var27] = (byte)var26;
                                                                var20--;
                                                                var27++;
                                                                if (var36 == 0) {
                                                                  continue L68;
                                                                } else {
                                                                  break L76;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          this.field_h = 1 + var37.d((byte) 22);
                                                          var27 = 0;
                                                          L87: while (true) {
                                                            stackOut_127_0 = var12 ^ -1;
                                                            stackOut_127_1 = var27 ^ -1;
                                                            stackIn_128_0 = stackOut_127_0;
                                                            stackIn_128_1 = stackOut_127_1;
                                                            if (stackIn_128_0 >= stackIn_128_1) {
                                                              break L75;
                                                            } else {
                                                              var44 = var13[var27];
                                                              stackOut_129_0 = null;
                                                              stackOut_129_1 = var44.field_g;
                                                              stackIn_173_0 = stackOut_129_0;
                                                              stackIn_173_1 = stackOut_129_1;
                                                              stackIn_130_0 = stackOut_129_0;
                                                              stackIn_130_1 = stackOut_129_1;
                                                              if (var36 != 0) {
                                                                break L74;
                                                              } else {
                                                                L88: {
                                                                  L89: {
                                                                    L90: {
                                                                      L91: {
                                                                        if (stackIn_130_0 == stackIn_130_1) {
                                                                          break L91;
                                                                        } else {
                                                                          var29 = 1;
                                                                          L92: while (true) {
                                                                            if (var44.field_g.length <= var29) {
                                                                              break L91;
                                                                            } else {
                                                                              var44.field_g[var29] = var37.b(true);
                                                                              var29 += 2;
                                                                              if (var36 != 0) {
                                                                                break L90;
                                                                              } else {
                                                                                if (var36 == 0) {
                                                                                  continue L92;
                                                                                } else {
                                                                                  break L91;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      if (null == var44.field_c) {
                                                                        break L89;
                                                                      } else {
                                                                        break L90;
                                                                      }
                                                                    }
                                                                    var29 = 3;
                                                                    L93: while (true) {
                                                                      if ((var44.field_c.length - 2 ^ -1) >= (var29 ^ -1)) {
                                                                        break L89;
                                                                      } else {
                                                                        var44.field_c[var29] = var37.b(true);
                                                                        var29 += 2;
                                                                        if (var36 != 0) {
                                                                          break L88;
                                                                        } else {
                                                                          if (var36 == 0) {
                                                                            continue L93;
                                                                          } else {
                                                                            break L89;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  var27++;
                                                                  break L88;
                                                                }
                                                                if (var36 == 0) {
                                                                  continue L87;
                                                                } else {
                                                                  break L75;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        L94: {
                                                          L95: {
                                                            L96: {
                                                              L97: {
                                                                if (var15_array == null) {
                                                                  break L97;
                                                                } else {
                                                                  var27 = 1;
                                                                  L98: while (true) {
                                                                    if (var57.length <= var27) {
                                                                      break L97;
                                                                    } else {
                                                                      var15_array[var27] = var37.b(true);
                                                                      var27 += 2;
                                                                      if (var36 != 0) {
                                                                        break L96;
                                                                      } else {
                                                                        if (var36 == 0) {
                                                                          continue L98;
                                                                        } else {
                                                                          break L97;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              if (var16 == null) {
                                                                break L95;
                                                              } else {
                                                                break L96;
                                                              }
                                                            }
                                                            var27 = 1;
                                                            L99: while (true) {
                                                              if ((var27 ^ -1) <= (var46.length ^ -1)) {
                                                                break L95;
                                                              } else {
                                                                var16[var27] = var37.b(true);
                                                                var27 += 2;
                                                                if (var36 != 0) {
                                                                  break L94;
                                                                } else {
                                                                  if (var36 == 0) {
                                                                    continue L99;
                                                                  } else {
                                                                    break L95;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var27 = 0;
                                                          break L94;
                                                        }
                                                        L100: while (true) {
                                                          L101: {
                                                            if (var27 >= var12) {
                                                              break L101;
                                                            } else {
                                                              var47 = var13[var27];
                                                              stackOut_154_0 = var47.field_c;
                                                              stackIn_175_0 = stackOut_154_0;
                                                              stackIn_155_0 = stackOut_154_0;
                                                              if (var36 != 0) {
                                                                break L73;
                                                              } else {
                                                                L102: {
                                                                  L103: {
                                                                    if (stackIn_155_0 == null) {
                                                                      break L103;
                                                                    } else {
                                                                      var19 = 0;
                                                                      var29 = 2;
                                                                      L104: while (true) {
                                                                        if ((var47.field_c.length ^ -1) >= (var29 ^ -1)) {
                                                                          break L103;
                                                                        } else {
                                                                          var19 = var19 + (1 - -var37.d((byte) 86));
                                                                          var47.field_c[var29] = (byte)var19;
                                                                          var29 += 2;
                                                                          if (var36 != 0) {
                                                                            break L102;
                                                                          } else {
                                                                            if (var36 == 0) {
                                                                              continue L104;
                                                                            } else {
                                                                              break L103;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  var27++;
                                                                  break L102;
                                                                }
                                                                if (var36 == 0) {
                                                                  continue L100;
                                                                } else {
                                                                  break L101;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var27 = 0;
                                                          L105: while (true) {
                                                            L106: {
                                                              if (var12 <= var27) {
                                                                break L106;
                                                              } else {
                                                                var48 = var13[var27];
                                                                stackOut_164_0 = null;
                                                                stackOut_164_1 = var48.field_g;
                                                                stackIn_173_0 = stackOut_164_0;
                                                                stackIn_173_1 = stackOut_164_1;
                                                                stackIn_165_0 = stackOut_164_0;
                                                                stackIn_165_1 = stackOut_164_1;
                                                                if (var36 != 0) {
                                                                  break L74;
                                                                } else {
                                                                  L107: {
                                                                    L108: {
                                                                      if (stackIn_165_0 == stackIn_165_1) {
                                                                        break L108;
                                                                      } else {
                                                                        var19 = 0;
                                                                        var29 = 2;
                                                                        L109: while (true) {
                                                                          if (var29 >= var48.field_g.length) {
                                                                            break L108;
                                                                          } else {
                                                                            var19 = 1 + var19 - -var37.d((byte) 71);
                                                                            var48.field_g[var29] = (byte)var19;
                                                                            var29 += 2;
                                                                            if (var36 != 0) {
                                                                              break L107;
                                                                            } else {
                                                                              if (var36 == 0) {
                                                                                continue L109;
                                                                              } else {
                                                                                break L108;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    var27++;
                                                                    break L107;
                                                                  }
                                                                  if (var36 == 0) {
                                                                    continue L105;
                                                                  } else {
                                                                    break L106;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            stackOut_172_0 = null;
                                                            stackOut_172_1 = (byte[]) (var15_array);
                                                            stackIn_173_0 = stackOut_172_0;
                                                            stackIn_173_1 = stackOut_172_1;
                                                            break L74;
                                                          }
                                                        }
                                                      }
                                                      if (stackIn_173_0 == stackIn_173_1) {
                                                        break L72;
                                                      } else {
                                                        var19 = var37.d((byte) 99);
                                                        stackOut_174_0 = (byte[]) (var15_array);
                                                        stackIn_175_0 = stackOut_174_0;
                                                        break L73;
                                                      }
                                                    }
                                                    stackIn_175_0[0] = (byte)var19;
                                                    var27 = 2;
                                                    L110: while (true) {
                                                      L111: {
                                                        L112: {
                                                          if (var57.length <= var27) {
                                                            break L112;
                                                          } else {
                                                            var19 = var37.d((byte) 98) + var19 + 1;
                                                            var15_array[var27] = (byte)var19;
                                                            var27 += 2;
                                                            if (var36 != 0) {
                                                              break L111;
                                                            } else {
                                                              if (var36 == 0) {
                                                                continue L110;
                                                              } else {
                                                                break L112;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var27 = var57[0];
                                                        break L111;
                                                      }
                                                      var28_int = var57[1];
                                                      var29 = 0;
                                                      L113: while (true) {
                                                        L114: {
                                                          L115: {
                                                            if (var29 >= var27) {
                                                              break L115;
                                                            } else {
                                                              this.field_n[var29] = (byte)(this.field_n[var29] * var28_int + 32 >> 1824374406);
                                                              var29++;
                                                              if (var36 != 0) {
                                                                break L114;
                                                              } else {
                                                                if (var36 == 0) {
                                                                  continue L113;
                                                                } else {
                                                                  break L115;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var29 = 2;
                                                          break L114;
                                                        }
                                                        L116: while (true) {
                                                          L117: {
                                                            if (var29 >= var57.length) {
                                                              break L117;
                                                            } else {
                                                              var30 = var57[var29];
                                                              var31 = var15_array[var29 - -1];
                                                              var32 = (-var27 + var30) / 2 + var28_int * (var30 - var27);
                                                              stackOut_186_0 = var27;
                                                              stackIn_202_0 = stackOut_186_0;
                                                              stackIn_187_0 = stackOut_186_0;
                                                              if (var36 != 0) {
                                                                break L71;
                                                              } else {
                                                                var33 = stackIn_187_0;
                                                                L118: while (true) {
                                                                  L119: {
                                                                    L120: {
                                                                      if ((var33 ^ -1) <= (var30 ^ -1)) {
                                                                        break L120;
                                                                      } else {
                                                                        var34 = dh.b(15, var30 + -var27, var32);
                                                                        var32 = var32 + (-var28_int + var31);
                                                                        this.field_n[var33] = (byte)(32 + var34 * this.field_n[var33] >> -440579962);
                                                                        var33++;
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
                                                                    var27 = var30;
                                                                    var29 += 2;
                                                                    var28_int = var31;
                                                                    break L119;
                                                                  }
                                                                  if (var36 == 0) {
                                                                    continue L116;
                                                                  } else {
                                                                    break L117;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var15_array = null;
                                                          var30 = var27;
                                                          L121: while (true) {
                                                            if (-129 >= (var30 ^ -1)) {
                                                              break L72;
                                                            } else {
                                                              this.field_n[var30] = (byte)(this.field_n[var30] * var28_int + 32 >> 965878374);
                                                              var30++;
                                                              continue L121;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L122: {
                                                    if (var16 != null) {
                                                      break L122;
                                                    } else {
                                                      var27 = 0;
                                                      L123: while (true) {
                                                        if (var12 <= var27) {
                                                          break L70;
                                                        } else {
                                                          var13[var27].field_k = var37.d((byte) 90);
                                                          var27++;
                                                          if (var36 != 0) {
                                                            break L69;
                                                          } else {
                                                            if (var36 == 0) {
                                                              continue L123;
                                                            } else {
                                                              break L122;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var19 = var37.d((byte) 53);
                                                  var16[0] = (byte)var19;
                                                  stackOut_201_0 = 2;
                                                  stackIn_202_0 = stackOut_201_0;
                                                  break L71;
                                                }
                                                var27 = stackIn_202_0;
                                                L124: while (true) {
                                                  L125: {
                                                    L126: {
                                                      if ((var27 ^ -1) <= (var46.length ^ -1)) {
                                                        break L126;
                                                      } else {
                                                        var19 = var37.d((byte) 38) + var19 - -1;
                                                        var16[var27] = (byte)var19;
                                                        var27 += 2;
                                                        if (var36 != 0) {
                                                          break L125;
                                                        } else {
                                                          if (var36 == 0) {
                                                            continue L124;
                                                          } else {
                                                            break L126;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var27 = var46[0];
                                                    break L125;
                                                  }
                                                  var28_int = var46[1] << 1109827777;
                                                  var29 = 0;
                                                  L127: while (true) {
                                                    L128: {
                                                      L129: {
                                                        if (var29 >= var27) {
                                                          break L129;
                                                        } else {
                                                          var30 = var28_int + (255 & this.field_p[var29]);
                                                          stackOut_209_0 = var30;
                                                          stackIn_216_0 = stackOut_209_0;
                                                          stackIn_210_0 = stackOut_209_0;
                                                          if (var36 != 0) {
                                                            break L128;
                                                          } else {
                                                            L130: {
                                                              if (stackIn_210_0 >= 0) {
                                                                break L130;
                                                              } else {
                                                                var30 = 0;
                                                                break L130;
                                                              }
                                                            }
                                                            L131: {
                                                              if (128 >= var30) {
                                                                break L131;
                                                              } else {
                                                                var30 = 128;
                                                                break L131;
                                                              }
                                                            }
                                                            this.field_p[var29] = (byte)var30;
                                                            var29++;
                                                            if (var36 == 0) {
                                                              continue L127;
                                                            } else {
                                                              break L129;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      stackOut_215_0 = 2;
                                                      stackIn_216_0 = stackOut_215_0;
                                                      break L128;
                                                    }
                                                    var29 = stackIn_216_0;
                                                    L132: while (true) {
                                                      stackOut_217_0 = var46.length;
                                                      stackOut_217_1 = var29;
                                                      stackIn_218_0 = stackOut_217_0;
                                                      stackIn_218_1 = stackOut_217_1;
                                                      L133: while (true) {
                                                        L134: {
                                                          L135: {
                                                            if (stackIn_218_0 <= stackIn_218_1) {
                                                              break L135;
                                                            } else {
                                                              var30 = var46[var29];
                                                              var31 = var16[1 + var29] << -1713192063;
                                                              var32 = (var30 + -var27) * var28_int + (var30 - var27) / 2;
                                                              stackOut_219_0 = var27;
                                                              stackIn_237_0 = stackOut_219_0;
                                                              stackIn_220_0 = stackOut_219_0;
                                                              if (var36 != 0) {
                                                                break L134;
                                                              } else {
                                                                var33 = stackIn_220_0;
                                                                L136: while (true) {
                                                                  L137: {
                                                                    if ((var33 ^ -1) <= (var30 ^ -1)) {
                                                                      break L137;
                                                                    } else {
                                                                      var34 = dh.b(15, -var27 + var30, var32);
                                                                      var35 = var34 + (255 & this.field_p[var33]);
                                                                      stackOut_222_0 = var35 ^ -1;
                                                                      stackOut_222_1 = -1;
                                                                      stackIn_218_0 = stackOut_222_0;
                                                                      stackIn_218_1 = stackOut_222_1;
                                                                      stackIn_223_0 = stackOut_222_0;
                                                                      stackIn_223_1 = stackOut_222_1;
                                                                      if (var36 != 0) {
                                                                        continue L133;
                                                                      } else {
                                                                        L138: {
                                                                          if (stackIn_223_0 <= stackIn_223_1) {
                                                                            break L138;
                                                                          } else {
                                                                            var35 = 0;
                                                                            break L138;
                                                                          }
                                                                        }
                                                                        L139: {
                                                                          if (128 >= var35) {
                                                                            break L139;
                                                                          } else {
                                                                            var35 = 128;
                                                                            break L139;
                                                                          }
                                                                        }
                                                                        var32 = var32 + (-var28_int + var31);
                                                                        this.field_p[var33] = (byte)var35;
                                                                        var33++;
                                                                        if (var36 == 0) {
                                                                          continue L136;
                                                                        } else {
                                                                          break L137;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  var28_int = var31;
                                                                  var29 += 2;
                                                                  var27 = var30;
                                                                  if (var36 == 0) {
                                                                    continue L132;
                                                                  } else {
                                                                    break L135;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var16 = null;
                                                          var30 = var27;
                                                          L140: while (true) {
                                                            if (128 <= var30) {
                                                              stackOut_236_0 = 0;
                                                              stackIn_237_0 = stackOut_236_0;
                                                              break L134;
                                                            } else {
                                                              L141: {
                                                                var31 = var28_int + (255 & this.field_p[var30]);
                                                                if (-1 >= (var31 ^ -1)) {
                                                                  break L141;
                                                                } else {
                                                                  var31 = 0;
                                                                  break L141;
                                                                }
                                                              }
                                                              L142: {
                                                                if (-129 <= (var31 ^ -1)) {
                                                                  break L142;
                                                                } else {
                                                                  var31 = 128;
                                                                  break L142;
                                                                }
                                                              }
                                                              this.field_p[var30] = (byte)var31;
                                                              var30++;
                                                              continue L140;
                                                            }
                                                          }
                                                        }
                                                        var27 = stackIn_237_0;
                                                        L143: while (true) {
                                                          if (var12 <= var27) {
                                                            break L70;
                                                          } else {
                                                            var13[var27].field_k = var37.d((byte) 90);
                                                            var27++;
                                                            if (var36 != 0) {
                                                              break L69;
                                                            } else {
                                                              if (var36 == 0) {
                                                                continue L143;
                                                              } else {
                                                                break L70;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              var27 = 0;
                                              break L69;
                                            }
                                            L144: while (true) {
                                              L145: {
                                                L146: {
                                                  L147: {
                                                    if (var12 <= var27) {
                                                      break L147;
                                                    } else {
                                                      var49 = var13[var27];
                                                      var28 = var49;
                                                      stackOut_243_0 = (nh) (var49);
                                                      stackIn_266_0 = stackOut_243_0;
                                                      stackIn_244_0 = stackOut_243_0;
                                                      if (var36 != 0) {
                                                        L148: while (true) {
                                                          L149: {
                                                            if (stackIn_266_0.field_e <= 0) {
                                                              break L149;
                                                            } else {
                                                              var28.field_i = var37.d((byte) 92);
                                                              break L149;
                                                            }
                                                          }
                                                          var27++;
                                                          if (var36 == 0) {
                                                            if (var27 >= var12) {
                                                              break L145;
                                                            } else {
                                                              var51 = var13[var27];
                                                              var28 = var51;
                                                              if (var36 != 0) {
                                                                break L146;
                                                              } else {
                                                                stackOut_265_0 = (nh) (var51);
                                                                stackIn_266_0 = stackOut_265_0;
                                                                continue L148;
                                                              }
                                                            }
                                                          } else {
                                                            break L145;
                                                          }
                                                        }
                                                      } else {
                                                        L150: {
                                                          if (stackIn_244_0.field_g == null) {
                                                            break L150;
                                                          } else {
                                                            var49.field_f = var37.d((byte) 50);
                                                            break L150;
                                                          }
                                                        }
                                                        L151: {
                                                          if (null == var49.field_c) {
                                                            break L151;
                                                          } else {
                                                            var49.field_d = var37.d((byte) 125);
                                                            break L151;
                                                          }
                                                        }
                                                        L152: {
                                                          if (var49.field_k <= 0) {
                                                            break L152;
                                                          } else {
                                                            var49.field_b = var37.d((byte) 22);
                                                            break L152;
                                                          }
                                                        }
                                                        var27++;
                                                        if (var36 == 0) {
                                                          continue L144;
                                                        } else {
                                                          break L147;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var27 = 0;
                                                  L153: while (true) {
                                                    L154: {
                                                      L155: {
                                                        if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                          break L155;
                                                        } else {
                                                          var13[var27].field_a = var37.d((byte) 113);
                                                          var27++;
                                                          if (var36 != 0) {
                                                            break L154;
                                                          } else {
                                                            if (var36 == 0) {
                                                              continue L153;
                                                            } else {
                                                              break L155;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var27 = 0;
                                                      break L154;
                                                    }
                                                    L156: while (true) {
                                                      L157: {
                                                        L158: {
                                                          if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                            break L158;
                                                          } else {
                                                            var50 = var13[var27];
                                                            stackOut_257_0 = var50.field_a;
                                                            stackIn_262_0 = stackOut_257_0;
                                                            stackIn_258_0 = stackOut_257_0;
                                                            if (var36 != 0) {
                                                              break L157;
                                                            } else {
                                                              L159: {
                                                                if (stackIn_258_0 <= 0) {
                                                                  break L159;
                                                                } else {
                                                                  var50.field_e = var37.d((byte) 125);
                                                                  break L159;
                                                                }
                                                              }
                                                              var27++;
                                                              if (var36 == 0) {
                                                                continue L156;
                                                              } else {
                                                                break L158;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        stackOut_261_0 = 0;
                                                        stackIn_262_0 = stackOut_261_0;
                                                        break L157;
                                                      }
                                                      var27 = stackIn_262_0;
                                                      L160: while (true) {
                                                        if (var27 >= var12) {
                                                          break L145;
                                                        } else {
                                                          var51 = var13[var27];
                                                          var28 = var51;
                                                          if (var36 != 0) {
                                                            break L146;
                                                          } else {
                                                            stackOut_265_0 = (nh) (var51);
                                                            stackIn_266_0 = stackOut_265_0;
                                                            L161: {
                                                              if (stackIn_266_0.field_e <= 0) {
                                                                break L161;
                                                              } else {
                                                                var28.field_i = var37.d((byte) 92);
                                                                break L161;
                                                              }
                                                            }
                                                            var27++;
                                                            if (var36 == 0) {
                                                              continue L160;
                                                            } else {
                                                              break L145;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L162: {
            var2 = decompiledCaughtException;
            stackOut_270_0 = (RuntimeException) (var2);
            stackOut_270_1 = new StringBuilder().append("si.<init>(");
            stackIn_272_0 = stackOut_270_0;
            stackIn_272_1 = stackOut_270_1;
            stackIn_271_0 = stackOut_270_0;
            stackIn_271_1 = stackOut_270_1;
            if (param0 == null) {
              stackOut_272_0 = (RuntimeException) ((Object) stackIn_272_0);
              stackOut_272_1 = (StringBuilder) ((Object) stackIn_272_1);
              stackOut_272_2 = "null";
              stackIn_273_0 = stackOut_272_0;
              stackIn_273_1 = stackOut_272_1;
              stackIn_273_2 = stackOut_272_2;
              break L162;
            } else {
              stackOut_271_0 = (RuntimeException) ((Object) stackIn_271_0);
              stackOut_271_1 = (StringBuilder) ((Object) stackIn_271_1);
              stackOut_271_2 = "{...}";
              stackIn_273_0 = stackOut_271_0;
              stackIn_273_1 = stackOut_271_1;
              stackIn_273_2 = stackOut_271_2;
              break L162;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_273_0), stackIn_273_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_i = new j(8, 161, 247);
    }
}
