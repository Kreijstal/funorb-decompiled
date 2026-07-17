/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm implements bo {
    private int field_b;
    static qg[] field_a;

    public final void a(kh param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((cm) this).field_b = param0.h(255);
              if (param1 == -19) {
                break L1;
              } else {
                ((cm) this).field_b = -24;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("cm.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1) {
        ((cm) this).field_b = param0;
        if (param1 != 0) {
            field_a = null;
        }
    }

    public final void a(int param0, kh param1) {
        if (param0 != 200) {
            return;
        }
        try {
            param1.i(((cm) this).field_b, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cm.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = TombRacer.field_G ? 1 : 0;
          if (param0 <= param12) {
            if (param14 <= param12) {
              if (param0 >= param14) {
                ica.a(param0, param10, param3, param5, 0, param8, bea.field_l, param1, param4, param11, param2, param15, param13, param9, param6, param12, param14);
                break L0;
              } else {
                ica.a(param14, param3, param10, param1, 0, param8, bea.field_l, param5, param6, param11, param2, param15, param9, param13, param4, param12, param0);
                break L0;
              }
            } else {
              ica.a(param12, param3, param2, param11, 0, param6, bea.field_l, param5, param8, param1, param10, param9, param15, param13, param4, param14, param0);
              break L0;
            }
          } else {
            if (param14 > param0) {
              ica.a(param0, param2, param3, param5, 0, param6, bea.field_l, param11, param4, param1, param10, param9, param13, param15, param8, param14, param12);
              break L0;
            } else {
              if (param12 < param14) {
                ica.a(param14, param2, param10, param1, 0, param4, bea.field_l, param11, param6, param5, param3, param13, param9, param15, param8, param0, param12);
                break L0;
              } else {
                ica.a(param12, param10, param2, param11, 0, param4, bea.field_l, param1, param8, param5, param3, param13, param15, param9, param6, param0, param14);
                break L0;
              }
            }
          }
        }
    }

    public static void a() {
        field_a = null;
    }

    final static void a(int param0, ht param1, int param2, boolean param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        tv[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        tv var17 = null;
        int var17_int = 0;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var22_int = 0;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        tv var28 = null;
        tv var29 = null;
        tv[] var30 = null;
        String var31 = null;
        String var32 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        tv stackIn_19_0 = null;
        tv stackIn_20_0 = null;
        tv stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        tv stackIn_25_0 = null;
        tv stackIn_26_0 = null;
        tv stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        tv stackIn_66_0 = null;
        tv stackIn_67_0 = null;
        tv stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        tv stackIn_73_0 = null;
        boolean stackIn_73_1 = false;
        tv stackIn_74_0 = null;
        boolean stackIn_74_1 = false;
        tv stackIn_75_0 = null;
        boolean stackIn_75_1 = false;
        int stackIn_75_2 = 0;
        tv stackIn_77_0 = null;
        tv stackIn_78_0 = null;
        tv stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        tv stackIn_81_0 = null;
        tv stackIn_82_0 = null;
        tv stackIn_83_0 = null;
        tv stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_88_0 = 0;
        tv stackIn_101_0 = null;
        tv stackIn_102_0 = null;
        tv stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        tv stackIn_106_0 = null;
        tv stackIn_107_0 = null;
        tv stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        tv stackIn_110_0 = null;
        tv stackIn_111_0 = null;
        tv stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        tv stackIn_114_0 = null;
        tv stackIn_115_0 = null;
        tv stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        String stackIn_131_0 = null;
        tv stackIn_134_0 = null;
        tv stackIn_135_0 = null;
        tv stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        tv stackIn_137_0 = null;
        tv stackIn_138_0 = null;
        tv stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        int stackIn_146_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_205_0 = 0;
        tv stackIn_304_0 = null;
        tv stackIn_305_0 = null;
        tv stackIn_306_0 = null;
        int stackIn_306_1 = 0;
        tv stackIn_310_0 = null;
        boolean stackIn_310_1 = false;
        tv stackIn_311_0 = null;
        boolean stackIn_311_1 = false;
        tv stackIn_312_0 = null;
        boolean stackIn_312_1 = false;
        int stackIn_312_2 = 0;
        tv stackIn_314_0 = null;
        tv stackIn_315_0 = null;
        tv stackIn_316_0 = null;
        tv stackIn_317_0 = null;
        int stackIn_317_1 = 0;
        tv stackIn_319_0 = null;
        tv stackIn_320_0 = null;
        tv stackIn_321_0 = null;
        tv stackIn_322_0 = null;
        int stackIn_322_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        tv stackOut_18_0 = null;
        tv stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        tv stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        tv stackOut_24_0 = null;
        tv stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        tv stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_50_0 = 0;
        tv stackOut_76_0 = null;
        tv stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        tv stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        tv stackOut_72_0 = null;
        boolean stackOut_72_1 = false;
        tv stackOut_74_0 = null;
        boolean stackOut_74_1 = false;
        int stackOut_74_2 = 0;
        tv stackOut_73_0 = null;
        boolean stackOut_73_1 = false;
        int stackOut_73_2 = 0;
        tv stackOut_65_0 = null;
        tv stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        tv stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        tv stackOut_80_0 = null;
        tv stackOut_81_0 = null;
        tv stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        tv stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        Object stackOut_130_0 = null;
        String stackOut_129_0 = null;
        tv stackOut_133_0 = null;
        tv stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        tv stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        tv stackOut_136_0 = null;
        tv stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        tv stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        int stackOut_145_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_203_0 = 0;
        tv stackOut_313_0 = null;
        tv stackOut_314_0 = null;
        tv stackOut_315_0 = null;
        int stackOut_315_1 = 0;
        tv stackOut_316_0 = null;
        int stackOut_316_1 = 0;
        tv stackOut_309_0 = null;
        boolean stackOut_309_1 = false;
        tv stackOut_311_0 = null;
        boolean stackOut_311_1 = false;
        int stackOut_311_2 = 0;
        tv stackOut_310_0 = null;
        boolean stackOut_310_1 = false;
        int stackOut_310_2 = 0;
        tv stackOut_303_0 = null;
        tv stackOut_305_0 = null;
        int stackOut_305_1 = 0;
        tv stackOut_304_0 = null;
        int stackOut_304_1 = 0;
        tv stackOut_318_0 = null;
        tv stackOut_319_0 = null;
        tv stackOut_320_0 = null;
        int stackOut_320_1 = 0;
        tv stackOut_321_0 = null;
        int stackOut_321_1 = 0;
        tv stackOut_100_0 = null;
        tv stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        tv stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        tv stackOut_113_0 = null;
        tv stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        tv stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        tv stackOut_109_0 = null;
        tv stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        tv stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        tv stackOut_105_0 = null;
        tv stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        tv stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        L0: {
          var26 = TombRacer.field_G ? 1 : 0;
          if (param3) {
            L1: {
              if (qa.field_o) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L1;
              }
            }
            var4_int = stackIn_9_0;
            break L0;
          } else {
            L2: {
              L3: {
                int discarded$2 = 8192;
                if (!mka.b()) {
                  break L3;
                } else {
                  if (param1.field_ec) {
                    break L3;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L2;
            }
            var4_int = stackIn_5_0;
            break L0;
          }
        }
        L4: {
          var5 = 0;
          if (param3) {
            break L4;
          } else {
            var6 = 0;
            L5: while (true) {
              if (var6 >= 5) {
                if (!bf.field_b[0][2].field_pb) {
                  break L4;
                } else {
                  int discarded$3 = 8192;
                  if (mka.b()) {
                    qda.field_b = jsa.field_y;
                    break L4;
                  } else {
                    qda.field_b = gl.a((byte) 101, gfa.field_i, new String[1]);
                    break L4;
                  }
                }
              } else {
                L6: {
                  if (var4_int == 0) {
                    break L6;
                  } else {
                    if (bf.field_b[0][1 + var6].field_y == 0) {
                      break L6;
                    } else {
                      if (~var6 != ~param1.field_cc) {
                        param1.field_cc = var6;
                        var5 = 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                L7: {
                  stackOut_18_0 = bf.field_b[0][var6 - -1];
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (var4_int == 0) {
                    stackOut_20_0 = (tv) (Object) stackIn_20_0;
                    stackOut_20_1 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L7;
                  } else {
                    stackOut_19_0 = (tv) (Object) stackIn_19_0;
                    stackOut_19_1 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L7;
                  }
                }
                L8: {
                  stackIn_21_0.field_X = stackIn_21_1 != 0;
                  if (rca.field_p) {
                    break L8;
                  } else {
                    if (var6 != 3) {
                      break L8;
                    } else {
                      bf.field_b[0][1 + var6].field_X = false;
                      break L8;
                    }
                  }
                }
                L9: {
                  stackOut_24_0 = bf.field_b[0][1 + var6];
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_25_0 = stackOut_24_0;
                  if (~param1.field_cc != ~var6) {
                    stackOut_26_0 = (tv) (Object) stackIn_26_0;
                    stackOut_26_1 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    break L9;
                  } else {
                    stackOut_25_0 = (tv) (Object) stackIn_25_0;
                    stackOut_25_1 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    break L9;
                  }
                }
                stackIn_27_0.field_cb = stackIn_27_1 != 0;
                var6++;
                continue L5;
              }
            }
          }
        }
        L10: {
          if (sg.field_u.length < 2) {
            break L10;
          } else {
            L11: {
              L12: {
                if (!param3) {
                  break L12;
                } else {
                  if (kca.field_g == -1) {
                    break L12;
                  } else {
                    stackOut_35_0 = 1;
                    stackIn_37_0 = stackOut_35_0;
                    break L11;
                  }
                }
              }
              stackOut_36_0 = 0;
              stackIn_37_0 = stackOut_36_0;
              break L11;
            }
            L13: {
              var6 = stackIn_37_0;
              if (var6 == 0) {
                break L13;
              } else {
                var7 = kca.field_g;
                var8_int = 0;
                L14: while (true) {
                  if (vk.field_b.length <= var8_int) {
                    vk.field_b[var7 / 8] = (byte)fh.a((int) vk.field_b[var7 / 8], 1 << var7 % 8);
                    break L13;
                  } else {
                    vk.field_b[var8_int] = (byte) 0;
                    var8_int++;
                    continue L14;
                  }
                }
              }
            }
            L15: {
              if (!param3) {
                stackOut_44_0 = 0;
                stackIn_45_0 = stackOut_44_0;
                break L15;
              } else {
                stackOut_43_0 = -1;
                stackIn_45_0 = stackOut_43_0;
                break L15;
              }
            }
            var7 = stackIn_45_0;
            L16: while (true) {
              if (~sg.field_u.length >= ~var7) {
                break L10;
              } else {
                L17: {
                  L18: {
                    if (var6 == 0) {
                      break L18;
                    } else {
                      if (~var7 == ~kca.field_g) {
                        break L18;
                      } else {
                        stackOut_49_0 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        break L17;
                      }
                    }
                  }
                  stackOut_50_0 = 0;
                  stackIn_51_0 = stackOut_50_0;
                  break L17;
                }
                L19: {
                  var8_int = stackIn_51_0;
                  if (var4_int == 0) {
                    break L19;
                  } else {
                    if (0 != bf.field_b[1][1 + var7].field_y) {
                      if (!param3) {
                        var9 = sg.field_u[var7];
                        if (param1.field_Jb != var9) {
                          var5 = 1;
                          param1.field_Jb = var9;
                          break L19;
                        } else {
                          break L19;
                        }
                      } else {
                        if (var6 != 0) {
                          break L19;
                        } else {
                          if (var7 == -1) {
                            var9 = 0;
                            L20: while (true) {
                              if (~var9 <= ~vk.field_b.length) {
                                break L19;
                              } else {
                                vk.field_b[var9] = (byte) 0;
                                var9++;
                                continue L20;
                              }
                            }
                          } else {
                            vk.field_b[var7 / 8] = (byte)kha.b((int) vk.field_b[var7 / 8], 1 << sea.c(var7, 7));
                            break L19;
                          }
                        }
                      }
                    } else {
                      break L19;
                    }
                  }
                }
                L21: {
                  if (param3) {
                    if (var7 != -1) {
                      L22: {
                        stackOut_76_0 = bf.field_b[1][1 + var7];
                        stackIn_78_0 = stackOut_76_0;
                        stackIn_77_0 = stackOut_76_0;
                        if (0 == (vk.field_b[var7 / 8] & 1 << (var7 & 7))) {
                          stackOut_78_0 = (tv) (Object) stackIn_78_0;
                          stackOut_78_1 = 0;
                          stackIn_79_0 = stackOut_78_0;
                          stackIn_79_1 = stackOut_78_1;
                          break L22;
                        } else {
                          stackOut_77_0 = (tv) (Object) stackIn_77_0;
                          stackOut_77_1 = 1;
                          stackIn_79_0 = stackOut_77_0;
                          stackIn_79_1 = stackOut_77_1;
                          break L22;
                        }
                      }
                      stackIn_79_0.field_cb = stackIn_79_1 != 0;
                      break L21;
                    } else {
                      bf.field_b[1][var7 + 1].field_cb = true;
                      var9 = 0;
                      L23: while (true) {
                        if (~var9 <= ~sg.field_u.length) {
                          break L21;
                        } else {
                          L24: {
                            stackOut_72_0 = bf.field_b[1][1 + var7];
                            stackOut_72_1 = bf.field_b[1][1 + var7].field_cb;
                            stackIn_74_0 = stackOut_72_0;
                            stackIn_74_1 = stackOut_72_1;
                            stackIn_73_0 = stackOut_72_0;
                            stackIn_73_1 = stackOut_72_1;
                            if (0 != (vk.field_b[var9 / 8] & 1 << (7 & var9))) {
                              stackOut_74_0 = (tv) (Object) stackIn_74_0;
                              stackOut_74_1 = stackIn_74_1;
                              stackOut_74_2 = 0;
                              stackIn_75_0 = stackOut_74_0;
                              stackIn_75_1 = stackOut_74_1;
                              stackIn_75_2 = stackOut_74_2;
                              break L24;
                            } else {
                              stackOut_73_0 = (tv) (Object) stackIn_73_0;
                              stackOut_73_1 = stackIn_73_1;
                              stackOut_73_2 = 1;
                              stackIn_75_0 = stackOut_73_0;
                              stackIn_75_1 = stackOut_73_1;
                              stackIn_75_2 = stackOut_73_2;
                              break L24;
                            }
                          }
                          stackIn_75_0.field_cb = stackIn_75_1 & stackIn_75_2 != 0;
                          var9++;
                          continue L23;
                        }
                      }
                    }
                  } else {
                    L25: {
                      var9 = sg.field_u[var7];
                      stackOut_65_0 = bf.field_b[1][var7 + 1];
                      stackIn_67_0 = stackOut_65_0;
                      stackIn_66_0 = stackOut_65_0;
                      if (param1.field_Jb != var9) {
                        stackOut_67_0 = (tv) (Object) stackIn_67_0;
                        stackOut_67_1 = 0;
                        stackIn_68_0 = stackOut_67_0;
                        stackIn_68_1 = stackOut_67_1;
                        break L25;
                      } else {
                        stackOut_66_0 = (tv) (Object) stackIn_66_0;
                        stackOut_66_1 = 1;
                        stackIn_68_0 = stackOut_66_0;
                        stackIn_68_1 = stackOut_66_1;
                        break L25;
                      }
                    }
                    stackIn_68_0.field_cb = stackIn_68_1 != 0;
                    break L21;
                  }
                }
                L26: {
                  L27: {
                    stackOut_80_0 = bf.field_b[1][1 + var7];
                    stackIn_83_0 = stackOut_80_0;
                    stackIn_81_0 = stackOut_80_0;
                    if (var4_int == 0) {
                      break L27;
                    } else {
                      stackOut_81_0 = (tv) (Object) stackIn_81_0;
                      stackIn_83_0 = stackOut_81_0;
                      stackIn_82_0 = stackOut_81_0;
                      if (var8_int != 0) {
                        break L27;
                      } else {
                        stackOut_82_0 = (tv) (Object) stackIn_82_0;
                        stackOut_82_1 = 1;
                        stackIn_84_0 = stackOut_82_0;
                        stackIn_84_1 = stackOut_82_1;
                        break L26;
                      }
                    }
                  }
                  stackOut_83_0 = (tv) (Object) stackIn_83_0;
                  stackOut_83_1 = 0;
                  stackIn_84_0 = stackOut_83_0;
                  stackIn_84_1 = stackOut_83_1;
                  break L26;
                }
                stackIn_84_0.field_X = stackIn_84_1 != 0;
                var7++;
                continue L16;
              }
            }
          }
        }
        L28: {
          if (param3) {
            stackOut_87_0 = 0;
            stackIn_88_0 = stackOut_87_0;
            break L28;
          } else {
            stackOut_86_0 = 1;
            stackIn_88_0 = stackOut_86_0;
            break L28;
          }
        }
        var6 = stackIn_88_0;
        L29: while (true) {
          if (var6 >= 3) {
            L30: {
              if (!param3) {
                break L30;
              } else {
                if (ws.field_r > 1) {
                  var6 = 0;
                  L31: while (true) {
                    if (var6 >= 1 + ws.field_r) {
                      break L30;
                    } else {
                      L32: {
                        var29 = bf.field_b[3][var6];
                        if (var4_int == 0) {
                          break L32;
                        } else {
                          if (var29.field_y == 0) {
                            break L32;
                          } else {
                            aja.field_H = var6;
                            break L32;
                          }
                        }
                      }
                      L33: {
                        if (!var29.field_pb) {
                          break L33;
                        } else {
                          if (var6 <= 0) {
                            break L33;
                          } else {
                            L34: {
                              if (null == mh.field_L) {
                                stackOut_130_0 = null;
                                stackIn_131_0 = (String) (Object) stackOut_130_0;
                                break L34;
                              } else {
                                stackOut_129_0 = mh.field_L[-1 + var6];
                                stackIn_131_0 = stackOut_129_0;
                                break L34;
                              }
                            }
                            var8_ref = stackIn_131_0;
                            if (var8_ref == null) {
                              break L33;
                            } else {
                              qda.field_b = var8_ref;
                              break L33;
                            }
                          }
                        }
                      }
                      L35: {
                        stackOut_133_0 = (tv) var29;
                        stackIn_135_0 = stackOut_133_0;
                        stackIn_134_0 = stackOut_133_0;
                        if (var4_int == 0) {
                          stackOut_135_0 = (tv) (Object) stackIn_135_0;
                          stackOut_135_1 = 0;
                          stackIn_136_0 = stackOut_135_0;
                          stackIn_136_1 = stackOut_135_1;
                          break L35;
                        } else {
                          stackOut_134_0 = (tv) (Object) stackIn_134_0;
                          stackOut_134_1 = 1;
                          stackIn_136_0 = stackOut_134_0;
                          stackIn_136_1 = stackOut_134_1;
                          break L35;
                        }
                      }
                      L36: {
                        stackIn_136_0.field_X = stackIn_136_1 != 0;
                        stackOut_136_0 = (tv) var29;
                        stackIn_138_0 = stackOut_136_0;
                        stackIn_137_0 = stackOut_136_0;
                        if (~aja.field_H != ~var6) {
                          stackOut_138_0 = (tv) (Object) stackIn_138_0;
                          stackOut_138_1 = 0;
                          stackIn_139_0 = stackOut_138_0;
                          stackIn_139_1 = stackOut_138_1;
                          break L36;
                        } else {
                          stackOut_137_0 = (tv) (Object) stackIn_137_0;
                          stackOut_137_1 = 1;
                          stackIn_139_0 = stackOut_137_0;
                          stackIn_139_1 = stackOut_137_1;
                          break L36;
                        }
                      }
                      stackIn_139_0.field_cb = stackIn_139_1 != 0;
                      var6++;
                      continue L31;
                    }
                  }
                } else {
                  break L30;
                }
              }
            }
            var6 = 0;
            var7 = 0;
            L37: while (true) {
              if (~var7 <= ~fk.field_b) {
                L38: {
                  L39: {
                    if (var5 == 0) {
                      break L39;
                    } else {
                      if (!param3) {
                        mla.a(param0, -94);
                        break L39;
                      } else {
                        break L38;
                      }
                    }
                  }
                  break L38;
                }
                return;
              } else {
                L40: {
                  var30 = bf.field_b[var7 + 4];
                  var8 = var30;
                  if (!param3) {
                    stackOut_145_0 = 0;
                    stackIn_146_0 = stackOut_145_0;
                    break L40;
                  } else {
                    stackOut_144_0 = -1;
                    stackIn_146_0 = stackOut_144_0;
                    break L40;
                  }
                }
                var9 = stackIn_146_0;
                L41: while (true) {
                  if (var9 >= var30.length + -1) {
                    var6 = var6 + (255 & um.field_m[var7]);
                    var7++;
                    continue L37;
                  } else {
                    L42: {
                      var10 = 0;
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      if (var4_int == 0) {
                        break L42;
                      } else {
                        if (0 <= var9) {
                          L43: {
                            if (lga.field_z == null) {
                              break L43;
                            } else {
                              if (lga.field_z[var7] == null) {
                                break L43;
                              } else {
                                if (0 < (~mi.field_g & lga.field_z[var7][var9])) {
                                  var15 = b.a(~mi.field_g & lga.field_z[var7][var9], (byte) -115);
                                  var14 = 1;
                                  break L43;
                                } else {
                                  break L43;
                                }
                              }
                            }
                          }
                          L44: {
                            if (rl.field_u == null) {
                              break L44;
                            } else {
                              if (rl.field_u[var7] != null) {
                                if (wla.field_ub > 0) {
                                  break L44;
                                } else {
                                  if (rl.field_u[var7][var9]) {
                                    var10 = 1;
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                              } else {
                                break L44;
                              }
                            }
                          }
                          L45: {
                            if (null == hp.field_a) {
                              break L45;
                            } else {
                              if (hp.field_a[var7] == null) {
                                break L45;
                              } else {
                                L46: {
                                  var16 = hp.field_a[var7][var9];
                                  if (0 == var16) {
                                    break L46;
                                  } else {
                                    if (dea.field_c) {
                                      break L46;
                                    } else {
                                      if (wla.field_ub <= 0) {
                                        var10 = 1;
                                        break L46;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                }
                                if (var16 <= 0) {
                                  break L45;
                                } else {
                                  if (~qb.field_f > ~var16) {
                                    var12 = 1;
                                    break L45;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                            }
                          }
                          L47: {
                            if (null == nra.field_g) {
                              break L47;
                            } else {
                              if (nra.field_g[var7] != null) {
                                L48: {
                                  var16 = nra.field_g[var7][var9];
                                  if (var16 == 0) {
                                    break L48;
                                  } else {
                                    if (dea.field_c) {
                                      break L48;
                                    } else {
                                      if (0 >= wla.field_ub) {
                                        var10 = 1;
                                        break L48;
                                      } else {
                                        break L48;
                                      }
                                    }
                                  }
                                }
                                if (var16 <= 0) {
                                  break L47;
                                } else {
                                  if (bha.field_z < var16) {
                                    var11 = 1;
                                    break L47;
                                  } else {
                                    break L47;
                                  }
                                }
                              } else {
                                break L47;
                              }
                            }
                          }
                          L49: {
                            L50: {
                              if (!param3) {
                                break L50;
                              } else {
                                if (pfa.field_b == null) {
                                  break L50;
                                } else {
                                  if (pfa.field_b[var7] == null) {
                                    break L50;
                                  } else {
                                    if (!pfa.field_b[var7][var9]) {
                                      break L50;
                                    } else {
                                      stackOut_190_0 = 1;
                                      stackIn_192_0 = stackOut_190_0;
                                      break L49;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_191_0 = 0;
                            stackIn_192_0 = stackOut_191_0;
                            break L49;
                          }
                          var13 = stackIn_192_0;
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                    }
                    L51: {
                      if (ld.field_e < 2) {
                        break L51;
                      } else {
                        if (oj.field_tb[12]) {
                          var14 = 0;
                          var13 = 0;
                          var11 = 0;
                          var12 = 0;
                          var10 = 0;
                          break L51;
                        } else {
                          break L51;
                        }
                      }
                    }
                    L52: {
                      L53: {
                        rh.field_s = true;
                        if (var10 != 0) {
                          break L53;
                        } else {
                          if (var11 != 0) {
                            break L53;
                          } else {
                            if (var12 != 0) {
                              break L53;
                            } else {
                              if (var13 != 0) {
                                break L53;
                              } else {
                                if (var14 == 0) {
                                  stackOut_204_0 = 0;
                                  stackIn_205_0 = stackOut_204_0;
                                  break L52;
                                } else {
                                  break L53;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_203_0 = 1;
                      stackIn_205_0 = stackOut_203_0;
                      break L52;
                    }
                    L54: {
                      var16 = stackIn_205_0;
                      if (var16 != 0) {
                        break L54;
                      } else {
                        if (var9 < 0) {
                          break L54;
                        } else {
                          if (ce.field_A == null) {
                            break L54;
                          } else {
                            L55: {
                              if (!param3) {
                                break L55;
                              } else {
                                if (!qa.field_o) {
                                  break L55;
                                } else {
                                  break L54;
                                }
                              }
                            }
                            L56: {
                              mm.field_g = false;
                              if (null != tba.field_m) {
                                break L56;
                              } else {
                                tba.field_m = new byte[fk.field_b];
                                sda.field_f = new boolean[fk.field_b];
                                break L56;
                              }
                            }
                            rh.field_s = false;
                            var17_int = 0;
                            L57: while (true) {
                              if (var17_int >= var7) {
                                L58: {
                                  cja.a(125, var7, param1, 0, var9, -1, -1, param3);
                                  if (ld.field_e < 2) {
                                    break L58;
                                  } else {
                                    if (!oj.field_tb[12]) {
                                      break L58;
                                    } else {
                                      rh.field_s = true;
                                      break L58;
                                    }
                                  }
                                }
                                if (rh.field_s) {
                                  break L54;
                                } else {
                                  var16 = 1;
                                  break L54;
                                }
                              } else {
                                sda.field_f[var17_int] = false;
                                var17_int++;
                                continue L57;
                              }
                            }
                          }
                        }
                      }
                    }
                    L59: {
                      var17 = var8[var9 + 1];
                      if (var4_int == 0) {
                        break L59;
                      } else {
                        if (0 == var17.field_y) {
                          break L59;
                        } else {
                          if (!param3) {
                            if (var16 != 0) {
                              break L59;
                            } else {
                              if ((byte)var9 != param1.field_ac[var7]) {
                                param1.field_ac[var7] = (byte)var9;
                                var5 = 1;
                                break L59;
                              } else {
                                break L59;
                              }
                            }
                          } else {
                            if (var9 == -1) {
                              var18 = var6;
                              L60: while (true) {
                                if (var18 >= -1 + var6 + var30.length) {
                                  break L59;
                                } else {
                                  tqa.field_e[var18 / 8] = (byte)sea.c((int) tqa.field_e[var18 / 8], ~(1 << sea.c(var18, 7)));
                                  var18++;
                                  continue L60;
                                }
                              }
                            } else {
                              tqa.field_e[(var6 + var9) / 8] = (byte)kha.b((int) tqa.field_e[(var6 + var9) / 8], 1 << sea.c(7, var9 + var6));
                              break L59;
                            }
                          }
                        }
                      }
                    }
                    L61: {
                      if (!param3) {
                        break L61;
                      } else {
                        if (var16 != 0) {
                          tqa.field_e[(var9 + var6) / 8] = (byte)sea.c((int) tqa.field_e[(var9 + var6) / 8], ~(1 << sea.c(7, var6 + var9)));
                          break L61;
                        } else {
                          break L61;
                        }
                      }
                    }
                    L62: {
                      if (var9 < 0) {
                        break L62;
                      } else {
                        if (var17.field_pb) {
                          L63: {
                            if (null == no.field_o) {
                              var18_ref = null;
                              break L63;
                            } else {
                              if (null == no.field_o[var7]) {
                                var18_ref = null;
                                break L63;
                              } else {
                                var18_ref = (Object) (Object) no.field_o[var7][var9];
                                break L63;
                              }
                            }
                          }
                          L64: {
                            if (null == eca.field_b) {
                              var19 = null;
                              break L64;
                            } else {
                              if (null == eca.field_b[var7]) {
                                var19 = null;
                                break L64;
                              } else {
                                var19 = (Object) (Object) eca.field_b[var7][var9];
                                break L64;
                              }
                            }
                          }
                          L65: {
                            var20 = null;
                            if (var19 == null) {
                              break L65;
                            } else {
                              if (!((String) var19).equals(var18_ref)) {
                                var20 = var19;
                                break L65;
                              } else {
                                break L65;
                              }
                            }
                          }
                          L66: {
                            var21 = null;
                            if (var13 != 0) {
                              var21 = (Object) (Object) tp.field_L;
                              var22 = var21;
                              var25 = var22;
                              var22 = var25;
                              var21 = var22;
                              var25 = var21;
                              var22 = var25;
                              var25 = var22;
                              var22 = var25;
                              var21 = var22;
                              var22 = var25;
                              break L66;
                            } else {
                              if (var10 != 0) {
                                var21 = (Object) (Object) ai.field_b;
                                break L66;
                              } else {
                                L67: {
                                  if (var11 == 0) {
                                    break L67;
                                  } else {
                                    var22_int = nra.field_g[var7][var9] + -bha.field_z;
                                    if (var22_int == 1) {
                                      var21 = (Object) (Object) rm.field_b;
                                      break L67;
                                    } else {
                                      var21 = (Object) (Object) gl.a((byte) 112, vn.field_c, new String[1]);
                                      break L67;
                                    }
                                  }
                                }
                                L68: {
                                  if (var12 != 0) {
                                    var31 = gl.a((byte) 106, kp.field_f, new String[2]);
                                    var22_ref = var31;
                                    var25_ref = var22_ref;
                                    var22_ref = var25_ref;
                                    var21 = (Object) (Object) var22_ref;
                                    var25_ref = var31;
                                    var22_ref = var25_ref;
                                    if (var21 == null) {
                                      var21 = (Object) (Object) var31;
                                      break L68;
                                    } else {
                                      var21 = (Object) (Object) (var21 + "<br>" + var31);
                                      break L68;
                                    }
                                  } else {
                                    break L68;
                                  }
                                }
                                if (var14 != 0) {
                                  L69: {
                                    var22_ref = ova.field_j;
                                    if (var15 <= 0) {
                                      break L69;
                                    } else {
                                      if (null == kh.field_l) {
                                        break L69;
                                      } else {
                                        if (var15 > kh.field_l.length) {
                                          break L69;
                                        } else {
                                          if (null != kh.field_l[var15 + -1]) {
                                            var22_ref = kh.field_l[var15 + -1][0];
                                            break L69;
                                          } else {
                                            break L69;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var21 != null) {
                                    var21 = (Object) (Object) (var21 + "<br>" + var22_ref);
                                    break L66;
                                  } else {
                                    var21 = (Object) (Object) var22_ref;
                                    break L66;
                                  }
                                } else {
                                  break L66;
                                }
                              }
                            }
                          }
                          L70: {
                            if (var4_int == 0) {
                              break L70;
                            } else {
                              if (!rh.field_s) {
                                L71: {
                                  var22_ref = null;
                                  var23 = 0;
                                  if (mm.field_g) {
                                    var22_ref = "</col>" + mi.field_j + "<col=A00000>";
                                    var25_ref = var22_ref;
                                    var22_ref = var25_ref;
                                    var25_ref = var22_ref;
                                    var22_ref = var25_ref;
                                    var21 = (Object) (Object) var22_ref;
                                    break L71;
                                  } else {
                                    break L71;
                                  }
                                }
                                var24 = 0;
                                L72: while (true) {
                                  if (~var7 >= ~var24) {
                                    if (var23 != 0) {
                                      var21 = (Object) (Object) (sta.field_G + var22_ref);
                                      break L70;
                                    } else {
                                      var21 = (Object) (Object) gl.a((byte) 106, cna.field_d, new String[1]);
                                      break L70;
                                    }
                                  } else {
                                    L73: {
                                      if (sda.field_f[var24]) {
                                        var25_ref = "</col>" + kma.field_e[var24] + "<col=A00000>";
                                        var22_ref = var25_ref;
                                        var21 = (Object) (Object) var22_ref;
                                        var22_ref = var25_ref;
                                        if (var22_ref != null) {
                                          var23 = 1;
                                          var22_ref = var22_ref + ", " + var25_ref;
                                          var21 = (Object) (Object) var22_ref;
                                          var21 = (Object) (Object) var22_ref;
                                          break L73;
                                        } else {
                                          var22_ref = var25_ref;
                                          break L73;
                                        }
                                      } else {
                                        break L73;
                                      }
                                    }
                                    var24++;
                                    continue L72;
                                  }
                                }
                              } else {
                                break L70;
                              }
                            }
                          }
                          L74: {
                            if (var21 == null) {
                              break L74;
                            } else {
                              var21 = (Object) (Object) ("<col=A00000>" + var21);
                              var32 = fta.a((String) var21, "<br>", 0, "<br><col=A00000>");
                              if (var20 == null) {
                                var20 = (Object) (Object) var32;
                                break L74;
                              } else {
                                var20 = (Object) (Object) (var20 + "<br>" + var32);
                                break L74;
                              }
                            }
                          }
                          if (var20 == null) {
                            break L62;
                          } else {
                            qda.field_b = (String) var20;
                            break L62;
                          }
                        } else {
                          break L62;
                        }
                      }
                    }
                    L75: {
                      if (!param3) {
                        L76: {
                          L77: {
                            stackOut_313_0 = (tv) var17;
                            stackIn_316_0 = stackOut_313_0;
                            stackIn_314_0 = stackOut_313_0;
                            if (!rh.field_s) {
                              break L77;
                            } else {
                              stackOut_314_0 = (tv) (Object) stackIn_314_0;
                              stackIn_316_0 = stackOut_314_0;
                              stackIn_315_0 = stackOut_314_0;
                              if ((byte)var9 != param1.field_ac[var7]) {
                                break L77;
                              } else {
                                stackOut_315_0 = (tv) (Object) stackIn_315_0;
                                stackOut_315_1 = 1;
                                stackIn_317_0 = stackOut_315_0;
                                stackIn_317_1 = stackOut_315_1;
                                break L76;
                              }
                            }
                          }
                          stackOut_316_0 = (tv) (Object) stackIn_316_0;
                          stackOut_316_1 = 0;
                          stackIn_317_0 = stackOut_316_0;
                          stackIn_317_1 = stackOut_316_1;
                          break L76;
                        }
                        stackIn_317_0.field_cb = stackIn_317_1 != 0;
                        break L75;
                      } else {
                        if (var9 == -1) {
                          var17.field_cb = true;
                          var27 = var6;
                          var18 = var27;
                          L78: while (true) {
                            if (~var27 <= ~(var30.length + (var6 - 1))) {
                              break L75;
                            } else {
                              L79: {
                                stackOut_309_0 = (tv) var17;
                                stackOut_309_1 = var17.field_cb;
                                stackIn_311_0 = stackOut_309_0;
                                stackIn_311_1 = stackOut_309_1;
                                stackIn_310_0 = stackOut_309_0;
                                stackIn_310_1 = stackOut_309_1;
                                if (0 != (tqa.field_e[var27 / 8] & 1 << (var27 & 7))) {
                                  stackOut_311_0 = (tv) (Object) stackIn_311_0;
                                  stackOut_311_1 = stackIn_311_1;
                                  stackOut_311_2 = 0;
                                  stackIn_312_0 = stackOut_311_0;
                                  stackIn_312_1 = stackOut_311_1;
                                  stackIn_312_2 = stackOut_311_2;
                                  break L79;
                                } else {
                                  stackOut_310_0 = (tv) (Object) stackIn_310_0;
                                  stackOut_310_1 = stackIn_310_1;
                                  stackOut_310_2 = 1;
                                  stackIn_312_0 = stackOut_310_0;
                                  stackIn_312_1 = stackOut_310_1;
                                  stackIn_312_2 = stackOut_310_2;
                                  break L79;
                                }
                              }
                              stackIn_312_0.field_cb = stackIn_312_1 & stackIn_312_2 != 0;
                              var27++;
                              continue L78;
                            }
                          }
                        } else {
                          L80: {
                            stackOut_303_0 = (tv) var17;
                            stackIn_305_0 = stackOut_303_0;
                            stackIn_304_0 = stackOut_303_0;
                            if (0 == (tqa.field_e[(var6 + var9) / 8] & 1 << (7 & var9 + var6))) {
                              stackOut_305_0 = (tv) (Object) stackIn_305_0;
                              stackOut_305_1 = 0;
                              stackIn_306_0 = stackOut_305_0;
                              stackIn_306_1 = stackOut_305_1;
                              break L80;
                            } else {
                              stackOut_304_0 = (tv) (Object) stackIn_304_0;
                              stackOut_304_1 = 1;
                              stackIn_306_0 = stackOut_304_0;
                              stackIn_306_1 = stackOut_304_1;
                              break L80;
                            }
                          }
                          stackIn_306_0.field_cb = stackIn_306_1 != 0;
                          break L75;
                        }
                      }
                    }
                    L81: {
                      L82: {
                        stackOut_318_0 = (tv) var17;
                        stackIn_321_0 = stackOut_318_0;
                        stackIn_319_0 = stackOut_318_0;
                        if (var4_int == 0) {
                          break L82;
                        } else {
                          stackOut_319_0 = (tv) (Object) stackIn_319_0;
                          stackIn_321_0 = stackOut_319_0;
                          stackIn_320_0 = stackOut_319_0;
                          if (var16 != 0) {
                            break L82;
                          } else {
                            stackOut_320_0 = (tv) (Object) stackIn_320_0;
                            stackOut_320_1 = 1;
                            stackIn_322_0 = stackOut_320_0;
                            stackIn_322_1 = stackOut_320_1;
                            break L81;
                          }
                        }
                      }
                      stackOut_321_0 = (tv) (Object) stackIn_321_0;
                      stackOut_321_1 = 0;
                      stackIn_322_0 = stackOut_321_0;
                      stackIn_322_1 = stackOut_321_1;
                      break L81;
                    }
                    stackIn_322_0.field_X = stackIn_322_1 != 0;
                    var9++;
                    continue L41;
                  }
                }
              }
            }
          } else {
            L83: {
              var28 = bf.field_b[2][var6];
              if (var4_int == 0) {
                break L83;
              } else {
                if (var28.field_y != 0) {
                  if (!param3) {
                    if (~param1.field_yb != ~var6) {
                      var5 = 1;
                      param1.field_yb = var6;
                      break L83;
                    } else {
                      break L83;
                    }
                  } else {
                    if (var6 != 0) {
                      mua.field_b = mua.field_b ^ var6;
                      break L83;
                    } else {
                      mua.field_b = 0;
                      break L83;
                    }
                  }
                } else {
                  break L83;
                }
              }
            }
            L84: {
              stackOut_100_0 = (tv) var28;
              stackIn_102_0 = stackOut_100_0;
              stackIn_101_0 = stackOut_100_0;
              if (var4_int == 0) {
                stackOut_102_0 = (tv) (Object) stackIn_102_0;
                stackOut_102_1 = 0;
                stackIn_103_0 = stackOut_102_0;
                stackIn_103_1 = stackOut_102_1;
                break L84;
              } else {
                stackOut_101_0 = (tv) (Object) stackIn_101_0;
                stackOut_101_1 = 1;
                stackIn_103_0 = stackOut_101_0;
                stackIn_103_1 = stackOut_101_1;
                break L84;
              }
            }
            L85: {
              stackIn_103_0.field_X = stackIn_103_1 != 0;
              if (!param3) {
                L86: {
                  stackOut_113_0 = (tv) var28;
                  stackIn_115_0 = stackOut_113_0;
                  stackIn_114_0 = stackOut_113_0;
                  if ((var6 & param1.field_yb) == 0) {
                    stackOut_115_0 = (tv) (Object) stackIn_115_0;
                    stackOut_115_1 = 0;
                    stackIn_116_0 = stackOut_115_0;
                    stackIn_116_1 = stackOut_115_1;
                    break L86;
                  } else {
                    stackOut_114_0 = (tv) (Object) stackIn_114_0;
                    stackOut_114_1 = 1;
                    stackIn_116_0 = stackOut_114_0;
                    stackIn_116_1 = stackOut_114_1;
                    break L86;
                  }
                }
                stackIn_116_0.field_cb = stackIn_116_1 != 0;
                break L85;
              } else {
                if (var6 == 0) {
                  L87: {
                    stackOut_109_0 = (tv) var28;
                    stackIn_111_0 = stackOut_109_0;
                    stackIn_110_0 = stackOut_109_0;
                    if (mua.field_b != 0) {
                      stackOut_111_0 = (tv) (Object) stackIn_111_0;
                      stackOut_111_1 = 0;
                      stackIn_112_0 = stackOut_111_0;
                      stackIn_112_1 = stackOut_111_1;
                      break L87;
                    } else {
                      stackOut_110_0 = (tv) (Object) stackIn_110_0;
                      stackOut_110_1 = 1;
                      stackIn_112_0 = stackOut_110_0;
                      stackIn_112_1 = stackOut_110_1;
                      break L87;
                    }
                  }
                  stackIn_112_0.field_cb = stackIn_112_1 != 0;
                  break L85;
                } else {
                  L88: {
                    stackOut_105_0 = (tv) var28;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_106_0 = stackOut_105_0;
                    if ((mua.field_b & var6) == 0) {
                      stackOut_107_0 = (tv) (Object) stackIn_107_0;
                      stackOut_107_1 = 0;
                      stackIn_108_0 = stackOut_107_0;
                      stackIn_108_1 = stackOut_107_1;
                      break L88;
                    } else {
                      stackOut_106_0 = (tv) (Object) stackIn_106_0;
                      stackOut_106_1 = 1;
                      stackIn_108_0 = stackOut_106_0;
                      stackIn_108_1 = stackOut_106_1;
                      break L88;
                    }
                  }
                  stackIn_108_0.field_cb = stackIn_108_1 != 0;
                  break L85;
                }
              }
            }
            var6++;
            continue L29;
          }
        }
    }

    static {
    }
}
