/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp extends tga {
    static int[] field_q;
    static int field_r;

    wp(lu param0) {
        this(param0.b(16711935), param0.b(16711935));
    }

    wp(int param0, int param1) {
        super(param0, param1);
        ((wp) this).field_j = 3;
    }

    private final void a(ub param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        gj var5 = null;
        op var6 = null;
        ad var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var5 = param0.field_o;
              var6 = var5.field_h;
              if (param2 < 0) {
                break L1;
              } else {
                if (var6.field_z > param2) {
                  L2: {
                    if (0 > param1) {
                      break L2;
                    } else {
                      if (param1 < var6.field_B) {
                        var7 = var5.a(param1, false, param2);
                        if (var7 != null) {
                          boolean discarded$2 = var7.field_s.g(48, 45);
                          param0.a(27799, (at) (Object) new ek(var5, var7, 45));
                          break L0;
                        } else {
                          return;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("wp.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + 83 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, op param3) {
        aga var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (param3.field_z > param2) {
                  L2: {
                    if (param1 < 0) {
                      break L2;
                    } else {
                      if (param3.field_B > param1) {
                        L3: {
                          var5 = param3.field_a[param2][param1].field_l;
                          if (var5 != null) {
                            boolean discarded$2 = var5.g(-94, 45);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5_ref;
            stackOut_10_1 = new StringBuilder().append("wp.D(").append(-116).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    public static void b(int param0) {
        field_q = null;
        if (param0 <= 58) {
            wp.b(44);
        }
    }

    final void a(boolean param0, op param1) {
        try {
            this.a((byte) -116, ((wp) this).field_o, ((wp) this).field_n, param1);
            this.a((byte) -116, ((wp) this).field_o, -1 + ((wp) this).field_n, param1);
            this.a((byte) -116, ((wp) this).field_o, 1 + ((wp) this).field_n, param1);
            this.a((byte) -116, ((wp) this).field_o - 1, ((wp) this).field_n, param1);
            this.a((byte) -116, ((wp) this).field_o - -1, ((wp) this).field_n, param1);
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "wp.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, uha param1, int param2, boolean param3) {
        Object var31_ref = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        gna[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        gna var17 = null;
        int var17_int = 0;
        int var18 = 0;
        Object var18_ref = null;
        String var18_ref_String = null;
        Object var19 = null;
        String var19_ref = null;
        Object var20 = null;
        Object var21 = null;
        int var22_int = 0;
        Object var22 = null;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        String var25 = null;
        int var26 = 0;
        int var27 = 0;
        gna var28 = null;
        gna var29 = null;
        gna[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        gna stackIn_28_0 = null;
        gna stackIn_29_0 = null;
        gna stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        gna stackIn_35_0 = null;
        gna stackIn_36_0 = null;
        gna stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_62_0 = 0;
        gna stackIn_77_0 = null;
        gna stackIn_78_0 = null;
        gna stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        gna stackIn_84_0 = null;
        boolean stackIn_84_1 = false;
        gna stackIn_85_0 = null;
        boolean stackIn_85_1 = false;
        gna stackIn_86_0 = null;
        boolean stackIn_86_1 = false;
        int stackIn_86_2 = 0;
        gna stackIn_88_0 = null;
        gna stackIn_89_0 = null;
        gna stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        gna stackIn_92_0 = null;
        gna stackIn_93_0 = null;
        gna stackIn_94_0 = null;
        gna stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_99_0 = 0;
        gna stackIn_112_0 = null;
        gna stackIn_113_0 = null;
        gna stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        gna stackIn_116_0 = null;
        gna stackIn_117_0 = null;
        gna stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        gna stackIn_121_0 = null;
        gna stackIn_122_0 = null;
        gna stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        gna stackIn_125_0 = null;
        gna stackIn_126_0 = null;
        gna stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        String stackIn_144_0 = null;
        gna stackIn_147_0 = null;
        gna stackIn_148_0 = null;
        gna stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        gna stackIn_150_0 = null;
        gna stackIn_151_0 = null;
        gna stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        int stackIn_158_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_211_0 = 0;
        gna stackIn_308_0 = null;
        gna stackIn_309_0 = null;
        gna stackIn_310_0 = null;
        int stackIn_310_1 = 0;
        gna stackIn_314_0 = null;
        boolean stackIn_314_1 = false;
        gna stackIn_315_0 = null;
        boolean stackIn_315_1 = false;
        gna stackIn_316_0 = null;
        boolean stackIn_316_1 = false;
        int stackIn_316_2 = 0;
        gna stackIn_318_0 = null;
        gna stackIn_319_0 = null;
        gna stackIn_320_0 = null;
        gna stackIn_321_0 = null;
        int stackIn_321_1 = 0;
        gna stackIn_323_0 = null;
        gna stackIn_324_0 = null;
        gna stackIn_325_0 = null;
        gna stackIn_326_0 = null;
        int stackIn_326_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_47_0 = 0;
        gna stackOut_27_0 = null;
        gna stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        gna stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        gna stackOut_34_0 = null;
        gna stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        gna stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_61_0 = 0;
        gna stackOut_87_0 = null;
        gna stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        gna stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        gna stackOut_83_0 = null;
        boolean stackOut_83_1 = false;
        gna stackOut_85_0 = null;
        boolean stackOut_85_1 = false;
        int stackOut_85_2 = 0;
        gna stackOut_84_0 = null;
        boolean stackOut_84_1 = false;
        int stackOut_84_2 = 0;
        gna stackOut_76_0 = null;
        gna stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        gna stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        gna stackOut_91_0 = null;
        gna stackOut_92_0 = null;
        gna stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        gna stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        Object stackOut_143_0 = null;
        String stackOut_142_0 = null;
        gna stackOut_146_0 = null;
        gna stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        gna stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        gna stackOut_149_0 = null;
        gna stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        gna stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        int stackOut_157_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_209_0 = 0;
        gna stackOut_317_0 = null;
        gna stackOut_318_0 = null;
        gna stackOut_319_0 = null;
        int stackOut_319_1 = 0;
        gna stackOut_320_0 = null;
        int stackOut_320_1 = 0;
        gna stackOut_313_0 = null;
        boolean stackOut_313_1 = false;
        gna stackOut_315_0 = null;
        boolean stackOut_315_1 = false;
        int stackOut_315_2 = 0;
        gna stackOut_314_0 = null;
        boolean stackOut_314_1 = false;
        int stackOut_314_2 = 0;
        gna stackOut_307_0 = null;
        gna stackOut_309_0 = null;
        int stackOut_309_1 = 0;
        gna stackOut_308_0 = null;
        int stackOut_308_1 = 0;
        gna stackOut_322_0 = null;
        gna stackOut_323_0 = null;
        gna stackOut_324_0 = null;
        int stackOut_324_1 = 0;
        gna stackOut_325_0 = null;
        int stackOut_325_1 = 0;
        gna stackOut_111_0 = null;
        gna stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        gna stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        gna stackOut_124_0 = null;
        gna stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        gna stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        gna stackOut_120_0 = null;
        gna stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        gna stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        gna stackOut_115_0 = null;
        gna stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        gna stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        var31_ref = null;
        L0: {
          var26 = BachelorFridge.field_y;
          if (param3) {
            L1: {
              if (ce.field_y) {
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
                if (!ps.d(-122)) {
                  break L3;
                } else {
                  if (param1.field_Zb) {
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
          L5: {
            L6: {
              var5 = 0;
              if (!param3) {
                var6 = 0;
                L7: while (true) {
                  if (var6 >= 5) {
                    L8: {
                      if (!gd.field_n[0][2].field_E) {
                        break L8;
                      } else {
                        if (!ps.d(-117)) {
                          jja.field_m = lga.a(true, new String[1], wa.field_o);
                          break L8;
                        } else {
                          jja.field_m = qd.field_p;
                          break L8;
                        }
                      }
                    }
                    if (2 <= qha.field_c.length) {
                      L9: {
                        L10: {
                          if (!param3) {
                            break L10;
                          } else {
                            if (aca.field_k == -1) {
                              break L10;
                            } else {
                              stackOut_46_0 = 1;
                              stackIn_48_0 = stackOut_46_0;
                              break L9;
                            }
                          }
                        }
                        stackOut_47_0 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        break L9;
                      }
                      var6 = stackIn_48_0;
                      if (var6 == 0) {
                        break L5;
                      } else {
                        var7 = aca.field_k;
                        var8_int = 0;
                        L11: while (true) {
                          if (fia.field_r.length <= var8_int) {
                            break L6;
                          } else {
                            fia.field_r[var8_int] = (byte) 0;
                            var8_int++;
                            continue L11;
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L12: {
                      if (var4_int == 0) {
                        break L12;
                      } else {
                        if (gd.field_n[0][1 + var6].field_R == 0) {
                          break L12;
                        } else {
                          if (~param1.field_Kb == ~var6) {
                            break L12;
                          } else {
                            param1.field_Kb = var6;
                            var5 = 1;
                            break L12;
                          }
                        }
                      }
                    }
                    L13: {
                      stackOut_27_0 = gd.field_n[0][1 + var6];
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_28_0 = stackOut_27_0;
                      if (var4_int == 0) {
                        stackOut_29_0 = (gna) (Object) stackIn_29_0;
                        stackOut_29_1 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        break L13;
                      } else {
                        stackOut_28_0 = (gna) (Object) stackIn_28_0;
                        stackOut_28_1 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        stackIn_30_1 = stackOut_28_1;
                        break L13;
                      }
                    }
                    L14: {
                      stackIn_30_0.field_u = stackIn_30_1 != 0;
                      if (eaa.field_c) {
                        break L14;
                      } else {
                        if (var6 == 3) {
                          gd.field_n[0][1 + var6].field_u = false;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      stackOut_34_0 = gd.field_n[0][var6 - -1];
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (~var6 != ~param1.field_Kb) {
                        stackOut_36_0 = (gna) (Object) stackIn_36_0;
                        stackOut_36_1 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        break L15;
                      } else {
                        stackOut_35_0 = (gna) (Object) stackIn_35_0;
                        stackOut_35_1 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        break L15;
                      }
                    }
                    stackIn_37_0.field_t = stackIn_37_1 != 0;
                    var6++;
                    continue L7;
                  }
                }
              } else {
                if (2 <= qha.field_c.length) {
                  L16: {
                    L17: {
                      if (!param3) {
                        break L17;
                      } else {
                        if (aca.field_k == -1) {
                          break L17;
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L16;
                        }
                      }
                    }
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L16;
                  }
                  var6 = stackIn_17_0;
                  if (var6 == 0) {
                    break L5;
                  } else {
                    var7 = aca.field_k;
                    var8_int = 0;
                    L18: while (true) {
                      if (fia.field_r.length <= var8_int) {
                        break L6;
                      } else {
                        fia.field_r[var8_int] = (byte) 0;
                        var8_int++;
                        continue L18;
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            fia.field_r[var7 / 8] = (byte)mp.a((int) fia.field_r[var7 / 8], 1 << var7 % 8);
            break L5;
          }
          L19: {
            if (!param3) {
              stackOut_55_0 = 0;
              stackIn_56_0 = stackOut_55_0;
              break L19;
            } else {
              stackOut_54_0 = -1;
              stackIn_56_0 = stackOut_54_0;
              break L19;
            }
          }
          var7 = stackIn_56_0;
          L20: while (true) {
            if (~qha.field_c.length >= ~var7) {
              break L4;
            } else {
              L21: {
                L22: {
                  if (var6 == 0) {
                    break L22;
                  } else {
                    if (aca.field_k == var7) {
                      break L22;
                    } else {
                      stackOut_60_0 = 1;
                      stackIn_62_0 = stackOut_60_0;
                      break L21;
                    }
                  }
                }
                stackOut_61_0 = 0;
                stackIn_62_0 = stackOut_61_0;
                break L21;
              }
              L23: {
                var8_int = stackIn_62_0;
                if (var4_int == 0) {
                  break L23;
                } else {
                  if (gd.field_n[1][1 + var7].field_R != 0) {
                    if (!param3) {
                      var9 = qha.field_c[var7];
                      if (param1.field_Pb == var9) {
                        break L23;
                      } else {
                        var5 = 1;
                        param1.field_Pb = var9;
                        break L23;
                      }
                    } else {
                      if (var6 == 0) {
                        if (var7 != -1) {
                          fia.field_r[var7 / 8] = (byte)lt.a((int) fia.field_r[var7 / 8], 1 << dda.a(var7, 7));
                          break L23;
                        } else {
                          var9 = 0;
                          L24: while (true) {
                            if (var9 >= fia.field_r.length) {
                              break L23;
                            } else {
                              fia.field_r[var9] = (byte) 0;
                              var9++;
                              continue L24;
                            }
                          }
                        }
                      } else {
                        break L23;
                      }
                    }
                  } else {
                    break L23;
                  }
                }
              }
              L25: {
                if (param3) {
                  if (var7 != -1) {
                    L26: {
                      stackOut_87_0 = gd.field_n[1][var7 - -1];
                      stackIn_89_0 = stackOut_87_0;
                      stackIn_88_0 = stackOut_87_0;
                      if ((fia.field_r[var7 / 8] & 1 << (var7 & 7)) == 0) {
                        stackOut_89_0 = (gna) (Object) stackIn_89_0;
                        stackOut_89_1 = 0;
                        stackIn_90_0 = stackOut_89_0;
                        stackIn_90_1 = stackOut_89_1;
                        break L26;
                      } else {
                        stackOut_88_0 = (gna) (Object) stackIn_88_0;
                        stackOut_88_1 = 1;
                        stackIn_90_0 = stackOut_88_0;
                        stackIn_90_1 = stackOut_88_1;
                        break L26;
                      }
                    }
                    stackIn_90_0.field_t = stackIn_90_1 != 0;
                    break L25;
                  } else {
                    gd.field_n[1][var7 - -1].field_t = true;
                    var9 = 0;
                    L27: while (true) {
                      if (~qha.field_c.length >= ~var9) {
                        break L25;
                      } else {
                        L28: {
                          stackOut_83_0 = gd.field_n[1][var7 - -1];
                          stackOut_83_1 = gd.field_n[1][var7 - -1].field_t;
                          stackIn_85_0 = stackOut_83_0;
                          stackIn_85_1 = stackOut_83_1;
                          stackIn_84_0 = stackOut_83_0;
                          stackIn_84_1 = stackOut_83_1;
                          if ((fia.field_r[var9 / 8] & 1 << (var9 & 7)) != 0) {
                            stackOut_85_0 = (gna) (Object) stackIn_85_0;
                            stackOut_85_1 = stackIn_85_1;
                            stackOut_85_2 = 0;
                            stackIn_86_0 = stackOut_85_0;
                            stackIn_86_1 = stackOut_85_1;
                            stackIn_86_2 = stackOut_85_2;
                            break L28;
                          } else {
                            stackOut_84_0 = (gna) (Object) stackIn_84_0;
                            stackOut_84_1 = stackIn_84_1;
                            stackOut_84_2 = 1;
                            stackIn_86_0 = stackOut_84_0;
                            stackIn_86_1 = stackOut_84_1;
                            stackIn_86_2 = stackOut_84_2;
                            break L28;
                          }
                        }
                        stackIn_86_0.field_t = stackIn_86_1 & stackIn_86_2 != 0;
                        var9++;
                        continue L27;
                      }
                    }
                  }
                } else {
                  L29: {
                    var9 = qha.field_c[var7];
                    stackOut_76_0 = gd.field_n[1][var7 - -1];
                    stackIn_78_0 = stackOut_76_0;
                    stackIn_77_0 = stackOut_76_0;
                    if (var9 != param1.field_Pb) {
                      stackOut_78_0 = (gna) (Object) stackIn_78_0;
                      stackOut_78_1 = 0;
                      stackIn_79_0 = stackOut_78_0;
                      stackIn_79_1 = stackOut_78_1;
                      break L29;
                    } else {
                      stackOut_77_0 = (gna) (Object) stackIn_77_0;
                      stackOut_77_1 = 1;
                      stackIn_79_0 = stackOut_77_0;
                      stackIn_79_1 = stackOut_77_1;
                      break L29;
                    }
                  }
                  stackIn_79_0.field_t = stackIn_79_1 != 0;
                  break L25;
                }
              }
              L30: {
                L31: {
                  stackOut_91_0 = gd.field_n[1][var7 - -1];
                  stackIn_94_0 = stackOut_91_0;
                  stackIn_92_0 = stackOut_91_0;
                  if (var4_int == 0) {
                    break L31;
                  } else {
                    stackOut_92_0 = (gna) (Object) stackIn_92_0;
                    stackIn_94_0 = stackOut_92_0;
                    stackIn_93_0 = stackOut_92_0;
                    if (var8_int != 0) {
                      break L31;
                    } else {
                      stackOut_93_0 = (gna) (Object) stackIn_93_0;
                      stackOut_93_1 = 1;
                      stackIn_95_0 = stackOut_93_0;
                      stackIn_95_1 = stackOut_93_1;
                      break L30;
                    }
                  }
                }
                stackOut_94_0 = (gna) (Object) stackIn_94_0;
                stackOut_94_1 = 0;
                stackIn_95_0 = stackOut_94_0;
                stackIn_95_1 = stackOut_94_1;
                break L30;
              }
              stackIn_95_0.field_u = stackIn_95_1 != 0;
              var7++;
              continue L20;
            }
          }
        }
        L32: {
          if (!param3) {
            stackOut_98_0 = 1;
            stackIn_99_0 = stackOut_98_0;
            break L32;
          } else {
            stackOut_97_0 = 0;
            stackIn_99_0 = stackOut_97_0;
            break L32;
          }
        }
        var6 = stackIn_99_0;
        L33: while (true) {
          if (var6 >= 3) {
            L34: {
              if (!param3) {
                break L34;
              } else {
                if (bma.field_u > 1) {
                  var6 = 0;
                  L35: while (true) {
                    if (~var6 <= ~(bma.field_u - -1)) {
                      break L34;
                    } else {
                      L36: {
                        var29 = gd.field_n[3][var6];
                        if (var4_int == 0) {
                          break L36;
                        } else {
                          if (0 != var29.field_R) {
                            tq.field_h = var6;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                      }
                      L37: {
                        if (!var29.field_E) {
                          break L37;
                        } else {
                          if (var6 > 0) {
                            L38: {
                              if (null == md.field_p) {
                                stackOut_143_0 = null;
                                stackIn_144_0 = (String) (Object) stackOut_143_0;
                                break L38;
                              } else {
                                stackOut_142_0 = md.field_p[var6 - 1];
                                stackIn_144_0 = stackOut_142_0;
                                break L38;
                              }
                            }
                            var8_ref = stackIn_144_0;
                            if (var8_ref == null) {
                              break L37;
                            } else {
                              jja.field_m = var8_ref;
                              break L37;
                            }
                          } else {
                            break L37;
                          }
                        }
                      }
                      L39: {
                        stackOut_146_0 = (gna) var29;
                        stackIn_148_0 = stackOut_146_0;
                        stackIn_147_0 = stackOut_146_0;
                        if (tq.field_h != var6) {
                          stackOut_148_0 = (gna) (Object) stackIn_148_0;
                          stackOut_148_1 = 0;
                          stackIn_149_0 = stackOut_148_0;
                          stackIn_149_1 = stackOut_148_1;
                          break L39;
                        } else {
                          stackOut_147_0 = (gna) (Object) stackIn_147_0;
                          stackOut_147_1 = 1;
                          stackIn_149_0 = stackOut_147_0;
                          stackIn_149_1 = stackOut_147_1;
                          break L39;
                        }
                      }
                      L40: {
                        stackIn_149_0.field_t = stackIn_149_1 != 0;
                        stackOut_149_0 = (gna) var29;
                        stackIn_151_0 = stackOut_149_0;
                        stackIn_150_0 = stackOut_149_0;
                        if (var4_int == 0) {
                          stackOut_151_0 = (gna) (Object) stackIn_151_0;
                          stackOut_151_1 = 0;
                          stackIn_152_0 = stackOut_151_0;
                          stackIn_152_1 = stackOut_151_1;
                          break L40;
                        } else {
                          stackOut_150_0 = (gna) (Object) stackIn_150_0;
                          stackOut_150_1 = 1;
                          stackIn_152_0 = stackOut_150_0;
                          stackIn_152_1 = stackOut_150_1;
                          break L40;
                        }
                      }
                      stackIn_152_0.field_u = stackIn_152_1 != 0;
                      var6++;
                      continue L35;
                    }
                  }
                } else {
                  break L34;
                }
              }
            }
            var6 = 0;
            var7 = 0;
            L41: while (true) {
              if (var7 >= ld.field_q) {
                L42: {
                  L43: {
                    if (var5 == 0) {
                      break L43;
                    } else {
                      if (!param3) {
                        bka.b(-112, 11);
                        break L43;
                      } else {
                        break L42;
                      }
                    }
                  }
                  break L42;
                }
                return;
              } else {
                L44: {
                  var30 = gd.field_n[var7 + 4];
                  var8 = var30;
                  if (param3) {
                    stackOut_157_0 = -1;
                    stackIn_158_0 = stackOut_157_0;
                    break L44;
                  } else {
                    stackOut_156_0 = 0;
                    stackIn_158_0 = stackOut_156_0;
                    break L44;
                  }
                }
                var9 = stackIn_158_0;
                L45: while (true) {
                  if (var9 >= var30.length + -1) {
                    var6 = var6 + (255 & mja.field_s[var7]);
                    var7++;
                    continue L41;
                  } else {
                    L46: {
                      var10 = 0;
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      if (var4_int == 0) {
                        break L46;
                      } else {
                        if (var9 < 0) {
                          break L46;
                        } else {
                          L47: {
                            if (null == wda.field_c) {
                              break L47;
                            } else {
                              if (wda.field_c[var7] == null) {
                                break L47;
                              } else {
                                if ((wda.field_c[var7][var9] & ~pn.field_d) <= 0) {
                                  break L47;
                                } else {
                                  var14 = 1;
                                  var15 = ho.a(62, wda.field_c[var7][var9] & ~pn.field_d);
                                  break L47;
                                }
                              }
                            }
                          }
                          L48: {
                            if (hr.field_b == null) {
                              break L48;
                            } else {
                              if (hr.field_b[var7] != null) {
                                if (dm.field_f > 0) {
                                  break L48;
                                } else {
                                  if (!hr.field_b[var7][var9]) {
                                    break L48;
                                  } else {
                                    var10 = 1;
                                    break L48;
                                  }
                                }
                              } else {
                                break L48;
                              }
                            }
                          }
                          L49: {
                            if (null == re.field_F) {
                              break L49;
                            } else {
                              if (null == re.field_F[var7]) {
                                break L49;
                              } else {
                                L50: {
                                  var16 = re.field_F[var7][var9];
                                  if (var16 == 0) {
                                    break L50;
                                  } else {
                                    if (bha.field_l) {
                                      break L50;
                                    } else {
                                      if (dm.field_f > 0) {
                                        break L50;
                                      } else {
                                        var10 = 1;
                                        break L50;
                                      }
                                    }
                                  }
                                }
                                if (var16 <= 0) {
                                  break L49;
                                } else {
                                  if (wk.field_a < var16) {
                                    var12 = 1;
                                    break L49;
                                  } else {
                                    break L49;
                                  }
                                }
                              }
                            }
                          }
                          L51: {
                            if (gma.field_c == null) {
                              break L51;
                            } else {
                              if (gma.field_c[var7] == null) {
                                break L51;
                              } else {
                                L52: {
                                  var16 = gma.field_c[var7][var9];
                                  if (0 >= var16) {
                                    break L52;
                                  } else {
                                    if (ui.field_q < var16) {
                                      var11 = 1;
                                      break L52;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                                if (var16 == 0) {
                                  break L51;
                                } else {
                                  if (bha.field_l) {
                                    break L51;
                                  } else {
                                    if (dm.field_f > 0) {
                                      break L51;
                                    } else {
                                      var10 = 1;
                                      break L51;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L53: {
                            L54: {
                              if (!param3) {
                                break L54;
                              } else {
                                if (null == im.field_c) {
                                  break L54;
                                } else {
                                  if (null == im.field_c[var7]) {
                                    break L54;
                                  } else {
                                    if (!im.field_c[var7][var9]) {
                                      break L54;
                                    } else {
                                      stackOut_196_0 = 1;
                                      stackIn_198_0 = stackOut_196_0;
                                      break L53;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_197_0 = 0;
                            stackIn_198_0 = stackOut_197_0;
                            break L53;
                          }
                          var13 = stackIn_198_0;
                          break L46;
                        }
                      }
                    }
                    L55: {
                      if (hea.field_r < 2) {
                        break L55;
                      } else {
                        if (wga.field_q[12]) {
                          var12 = 0;
                          var10 = 0;
                          var14 = 0;
                          var13 = 0;
                          var11 = 0;
                          break L55;
                        } else {
                          break L55;
                        }
                      }
                    }
                    L56: {
                      L57: {
                        if (var10 != 0) {
                          break L57;
                        } else {
                          if (var11 != 0) {
                            break L57;
                          } else {
                            if (var12 != 0) {
                              break L57;
                            } else {
                              if (var13 != 0) {
                                break L57;
                              } else {
                                if (var14 == 0) {
                                  stackOut_210_0 = 0;
                                  stackIn_211_0 = stackOut_210_0;
                                  break L56;
                                } else {
                                  break L57;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_209_0 = 1;
                      stackIn_211_0 = stackOut_209_0;
                      break L56;
                    }
                    L58: {
                      var16 = stackIn_211_0;
                      fla.field_q = true;
                      if (var16 != 0) {
                        break L58;
                      } else {
                        if (var9 < 0) {
                          break L58;
                        } else {
                          if (pha.field_h == null) {
                            break L58;
                          } else {
                            L59: {
                              if (!param3) {
                                break L59;
                              } else {
                                if (!ce.field_y) {
                                  break L59;
                                } else {
                                  break L58;
                                }
                              }
                            }
                            L60: {
                              if (null != bja.field_o) {
                                break L60;
                              } else {
                                ala.field_b = new boolean[ld.field_q];
                                bja.field_o = new byte[ld.field_q];
                                break L60;
                              }
                            }
                            fla.field_q = false;
                            uu.field_yb = false;
                            var17_int = 0;
                            L61: while (true) {
                              if (var17_int >= var7) {
                                L62: {
                                  ub.a(0, param3, -96, var9, -1, param1, -1, var7);
                                  if (2 > hea.field_r) {
                                    break L62;
                                  } else {
                                    if (!wga.field_q[12]) {
                                      break L62;
                                    } else {
                                      fla.field_q = true;
                                      break L62;
                                    }
                                  }
                                }
                                if (!fla.field_q) {
                                  var16 = 1;
                                  break L58;
                                } else {
                                  break L58;
                                }
                              } else {
                                ala.field_b[var17_int] = false;
                                var17_int++;
                                continue L61;
                              }
                            }
                          }
                        }
                      }
                    }
                    L63: {
                      var17 = var8[1 + var9];
                      if (var4_int == 0) {
                        break L63;
                      } else {
                        if (0 == var17.field_R) {
                          break L63;
                        } else {
                          if (param3) {
                            if (-1 == var9) {
                              var18 = var6;
                              L64: while (true) {
                                if (~(-1 + (var30.length + var6)) >= ~var18) {
                                  break L63;
                                } else {
                                  sca.field_c[var18 / 8] = (byte)dda.a((int) sca.field_c[var18 / 8], ~(1 << dda.a(7, var18)));
                                  var18++;
                                  continue L64;
                                }
                              }
                            } else {
                              sca.field_c[(var9 + var6) / 8] = (byte)lt.a((int) sca.field_c[(var9 + var6) / 8], 1 << dda.a(7, var6 + var9));
                              break L63;
                            }
                          } else {
                            if (var16 != 0) {
                              break L63;
                            } else {
                              if (~(byte)var9 != ~param1.field_Eb[var7]) {
                                param1.field_Eb[var7] = (byte)var9;
                                var5 = 1;
                                break L63;
                              } else {
                                break L63;
                              }
                            }
                          }
                        }
                      }
                    }
                    L65: {
                      if (!param3) {
                        break L65;
                      } else {
                        if (var16 != 0) {
                          sca.field_c[(var6 + var9) / 8] = (byte)dda.a((int) sca.field_c[(var6 + var9) / 8], ~(1 << dda.a(var9 + var6, 7)));
                          break L65;
                        } else {
                          break L65;
                        }
                      }
                    }
                    L66: {
                      if (var9 < 0) {
                        break L66;
                      } else {
                        if (!var17.field_E) {
                          break L66;
                        } else {
                          L67: {
                            if (null != co.field_a) {
                              if (null != co.field_a[var7]) {
                                var18_ref_String = co.field_a[var7][var9];
                                break L67;
                              } else {
                                var18_ref_String = null;
                                break L67;
                              }
                            } else {
                              var18_ref_String = null;
                              break L67;
                            }
                          }
                          L68: {
                            if (null != gk.field_c) {
                              if (gk.field_c[var7] != null) {
                                var19_ref = gk.field_c[var7][var9];
                                break L68;
                              } else {
                                var19_ref = null;
                                break L68;
                              }
                            } else {
                              var19_ref = null;
                              break L68;
                            }
                          }
                          L69: {
                            var20 = null;
                            if (var19_ref == null) {
                              break L69;
                            } else {
                              if (!var19_ref.equals((Object) (Object) var18_ref_String)) {
                                var20 = (Object) (Object) var19_ref;
                                break L69;
                              } else {
                                break L69;
                              }
                            }
                          }
                          L70: {
                            var21 = null;
                            if (var13 == 0) {
                              if (var10 == 0) {
                                L71: {
                                  if (var11 == 0) {
                                    break L71;
                                  } else {
                                    var22_int = -ui.field_q + gma.field_c[var7][var9];
                                    if (1 != var22_int) {
                                      var21 = (Object) (Object) lga.a(true, new String[1], tv.field_p);
                                      var31_ref = var21;
                                      var21 = var31_ref;
                                      var31_ref = var21;
                                      var21 = var31_ref;
                                      break L71;
                                    } else {
                                      var21 = (Object) (Object) afa.field_k;
                                      break L71;
                                    }
                                  }
                                }
                                L72: {
                                  if (var12 == 0) {
                                    break L72;
                                  } else {
                                    var31 = lga.a(true, new String[2], oca.field_o);
                                    var21 = (Object) (Object) var31;
                                    var21 = (Object) (Object) var31;
                                    if (var21 != null) {
                                      var21 = (Object) (Object) ((String) var21 + "<br>" + var31);
                                      break L72;
                                    } else {
                                      var21 = (Object) (Object) var31;
                                      break L72;
                                    }
                                  }
                                }
                                if (var14 != 0) {
                                  L73: {
                                    var22_ref = df.field_q;
                                    if (0 >= var15) {
                                      break L73;
                                    } else {
                                      if (ffa.field_j == null) {
                                        break L73;
                                      } else {
                                        if (~var15 < ~ffa.field_j.length) {
                                          break L73;
                                        } else {
                                          if (null == ffa.field_j[var15 + -1]) {
                                            break L73;
                                          } else {
                                            var22_ref = ffa.field_j[var15 - 1][0];
                                            break L73;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var21 == null) {
                                    var21 = (Object) (Object) var22_ref;
                                    break L70;
                                  } else {
                                    var21 = (Object) (Object) ((String) var21 + "<br>" + var22_ref);
                                    break L70;
                                  }
                                } else {
                                  break L70;
                                }
                              } else {
                                var21 = (Object) (Object) ph.field_N;
                                break L70;
                              }
                            } else {
                              var21 = (Object) (Object) hk.field_a;
                              break L70;
                            }
                          }
                          L74: {
                            if (var4_int == 0) {
                              break L74;
                            } else {
                              if (!fla.field_q) {
                                L75: {
                                  var22_ref = null;
                                  var23 = 0;
                                  if (uu.field_yb) {
                                    var22_ref = "</col>" + gb.field_j + "<col=A00000>";
                                    var25 = var22_ref;
                                    var22_ref = var25;
                                    var25 = var22_ref;
                                    var22_ref = var25;
                                    var21 = (Object) (Object) var22_ref;
                                    break L75;
                                  } else {
                                    break L75;
                                  }
                                }
                                var24 = 0;
                                L76: while (true) {
                                  if (~var7 >= ~var24) {
                                    if (var23 == 0) {
                                      var21 = (Object) (Object) lga.a(true, new String[1], l.field_s);
                                      break L74;
                                    } else {
                                      var21 = (Object) (Object) (gf.field_i + var22_ref);
                                      break L74;
                                    }
                                  } else {
                                    L77: {
                                      if (!ala.field_b[var24]) {
                                        break L77;
                                      } else {
                                        var25 = "</col>" + kka.field_k[var24] + "<col=A00000>";
                                        var22_ref = var25;
                                        var21 = (Object) (Object) var22_ref;
                                        var22_ref = var25;
                                        if (var22_ref == null) {
                                          var22_ref = var25;
                                          var21 = (Object) (Object) var22_ref;
                                          var21 = (Object) (Object) var22_ref;
                                          break L77;
                                        } else {
                                          var22_ref = var22_ref + ", " + var25;
                                          var23 = 1;
                                          break L77;
                                        }
                                      }
                                    }
                                    var24++;
                                    continue L76;
                                  }
                                }
                              } else {
                                break L74;
                              }
                            }
                          }
                          L78: {
                            if (var21 != null) {
                              var32 = "<col=A00000>" + (String) var21;
                              var33 = qm.a("<br><col=A00000>", "<br>", var32, -1);
                              if (var20 == null) {
                                var20 = (Object) (Object) var33;
                                break L78;
                              } else {
                                var20 = (Object) (Object) ((String) var20 + "<br>" + var33);
                                break L78;
                              }
                            } else {
                              break L78;
                            }
                          }
                          if (var20 == null) {
                            break L66;
                          } else {
                            jja.field_m = (String) var20;
                            break L66;
                          }
                        }
                      }
                    }
                    L79: {
                      if (!param3) {
                        L80: {
                          L81: {
                            stackOut_317_0 = (gna) var17;
                            stackIn_320_0 = stackOut_317_0;
                            stackIn_318_0 = stackOut_317_0;
                            if (!fla.field_q) {
                              break L81;
                            } else {
                              stackOut_318_0 = (gna) (Object) stackIn_318_0;
                              stackIn_320_0 = stackOut_318_0;
                              stackIn_319_0 = stackOut_318_0;
                              if (~(byte)var9 != ~param1.field_Eb[var7]) {
                                break L81;
                              } else {
                                stackOut_319_0 = (gna) (Object) stackIn_319_0;
                                stackOut_319_1 = 1;
                                stackIn_321_0 = stackOut_319_0;
                                stackIn_321_1 = stackOut_319_1;
                                break L80;
                              }
                            }
                          }
                          stackOut_320_0 = (gna) (Object) stackIn_320_0;
                          stackOut_320_1 = 0;
                          stackIn_321_0 = stackOut_320_0;
                          stackIn_321_1 = stackOut_320_1;
                          break L80;
                        }
                        stackIn_321_0.field_t = stackIn_321_1 != 0;
                        break L79;
                      } else {
                        if (var9 == -1) {
                          var17.field_t = true;
                          var27 = var6;
                          var18 = var27;
                          L82: while (true) {
                            if (~var27 <= ~(var6 - -var30.length + -1)) {
                              break L79;
                            } else {
                              L83: {
                                stackOut_313_0 = (gna) var17;
                                stackOut_313_1 = var17.field_t;
                                stackIn_315_0 = stackOut_313_0;
                                stackIn_315_1 = stackOut_313_1;
                                stackIn_314_0 = stackOut_313_0;
                                stackIn_314_1 = stackOut_313_1;
                                if ((sca.field_c[var27 / 8] & 1 << (7 & var27)) != 0) {
                                  stackOut_315_0 = (gna) (Object) stackIn_315_0;
                                  stackOut_315_1 = stackIn_315_1;
                                  stackOut_315_2 = 0;
                                  stackIn_316_0 = stackOut_315_0;
                                  stackIn_316_1 = stackOut_315_1;
                                  stackIn_316_2 = stackOut_315_2;
                                  break L83;
                                } else {
                                  stackOut_314_0 = (gna) (Object) stackIn_314_0;
                                  stackOut_314_1 = stackIn_314_1;
                                  stackOut_314_2 = 1;
                                  stackIn_316_0 = stackOut_314_0;
                                  stackIn_316_1 = stackOut_314_1;
                                  stackIn_316_2 = stackOut_314_2;
                                  break L83;
                                }
                              }
                              stackIn_316_0.field_t = stackIn_316_1 & stackIn_316_2 != 0;
                              var27++;
                              continue L82;
                            }
                          }
                        } else {
                          L84: {
                            stackOut_307_0 = (gna) var17;
                            stackIn_309_0 = stackOut_307_0;
                            stackIn_308_0 = stackOut_307_0;
                            if ((sca.field_c[(var9 + var6) / 8] & 1 << (var9 + var6 & 7)) == 0) {
                              stackOut_309_0 = (gna) (Object) stackIn_309_0;
                              stackOut_309_1 = 0;
                              stackIn_310_0 = stackOut_309_0;
                              stackIn_310_1 = stackOut_309_1;
                              break L84;
                            } else {
                              stackOut_308_0 = (gna) (Object) stackIn_308_0;
                              stackOut_308_1 = 1;
                              stackIn_310_0 = stackOut_308_0;
                              stackIn_310_1 = stackOut_308_1;
                              break L84;
                            }
                          }
                          stackIn_310_0.field_t = stackIn_310_1 != 0;
                          break L79;
                        }
                      }
                    }
                    L85: {
                      L86: {
                        stackOut_322_0 = (gna) var17;
                        stackIn_325_0 = stackOut_322_0;
                        stackIn_323_0 = stackOut_322_0;
                        if (var4_int == 0) {
                          break L86;
                        } else {
                          stackOut_323_0 = (gna) (Object) stackIn_323_0;
                          stackIn_325_0 = stackOut_323_0;
                          stackIn_324_0 = stackOut_323_0;
                          if (var16 != 0) {
                            break L86;
                          } else {
                            stackOut_324_0 = (gna) (Object) stackIn_324_0;
                            stackOut_324_1 = 1;
                            stackIn_326_0 = stackOut_324_0;
                            stackIn_326_1 = stackOut_324_1;
                            break L85;
                          }
                        }
                      }
                      stackOut_325_0 = (gna) (Object) stackIn_325_0;
                      stackOut_325_1 = 0;
                      stackIn_326_0 = stackOut_325_0;
                      stackIn_326_1 = stackOut_325_1;
                      break L85;
                    }
                    stackIn_326_0.field_u = stackIn_326_1 != 0;
                    var9++;
                    continue L45;
                  }
                }
              }
            }
          } else {
            L87: {
              var28 = gd.field_n[2][var6];
              if (var4_int == 0) {
                break L87;
              } else {
                if (var28.field_R != 0) {
                  if (param3) {
                    if (var6 != 0) {
                      ena.field_n = ena.field_n ^ var6;
                      break L87;
                    } else {
                      ena.field_n = 0;
                      break L87;
                    }
                  } else {
                    if (~var6 != ~param1.field_Lb) {
                      param1.field_Lb = var6;
                      var5 = 1;
                      break L87;
                    } else {
                      break L87;
                    }
                  }
                } else {
                  break L87;
                }
              }
            }
            L88: {
              stackOut_111_0 = (gna) var28;
              stackIn_113_0 = stackOut_111_0;
              stackIn_112_0 = stackOut_111_0;
              if (var4_int == 0) {
                stackOut_113_0 = (gna) (Object) stackIn_113_0;
                stackOut_113_1 = 0;
                stackIn_114_0 = stackOut_113_0;
                stackIn_114_1 = stackOut_113_1;
                break L88;
              } else {
                stackOut_112_0 = (gna) (Object) stackIn_112_0;
                stackOut_112_1 = 1;
                stackIn_114_0 = stackOut_112_0;
                stackIn_114_1 = stackOut_112_1;
                break L88;
              }
            }
            L89: {
              stackIn_114_0.field_u = stackIn_114_1 != 0;
              if (param3) {
                if (0 == var6) {
                  L90: {
                    stackOut_124_0 = (gna) var28;
                    stackIn_126_0 = stackOut_124_0;
                    stackIn_125_0 = stackOut_124_0;
                    if (0 != ena.field_n) {
                      stackOut_126_0 = (gna) (Object) stackIn_126_0;
                      stackOut_126_1 = 0;
                      stackIn_127_0 = stackOut_126_0;
                      stackIn_127_1 = stackOut_126_1;
                      break L90;
                    } else {
                      stackOut_125_0 = (gna) (Object) stackIn_125_0;
                      stackOut_125_1 = 1;
                      stackIn_127_0 = stackOut_125_0;
                      stackIn_127_1 = stackOut_125_1;
                      break L90;
                    }
                  }
                  stackIn_127_0.field_t = stackIn_127_1 != 0;
                  break L89;
                } else {
                  L91: {
                    stackOut_120_0 = (gna) var28;
                    stackIn_122_0 = stackOut_120_0;
                    stackIn_121_0 = stackOut_120_0;
                    if ((ena.field_n & var6) == 0) {
                      stackOut_122_0 = (gna) (Object) stackIn_122_0;
                      stackOut_122_1 = 0;
                      stackIn_123_0 = stackOut_122_0;
                      stackIn_123_1 = stackOut_122_1;
                      break L91;
                    } else {
                      stackOut_121_0 = (gna) (Object) stackIn_121_0;
                      stackOut_121_1 = 1;
                      stackIn_123_0 = stackOut_121_0;
                      stackIn_123_1 = stackOut_121_1;
                      break L91;
                    }
                  }
                  stackIn_123_0.field_t = stackIn_123_1 != 0;
                  break L89;
                }
              } else {
                L92: {
                  stackOut_115_0 = (gna) var28;
                  stackIn_117_0 = stackOut_115_0;
                  stackIn_116_0 = stackOut_115_0;
                  if ((var6 & param1.field_Lb) == 0) {
                    stackOut_117_0 = (gna) (Object) stackIn_117_0;
                    stackOut_117_1 = 0;
                    stackIn_118_0 = stackOut_117_0;
                    stackIn_118_1 = stackOut_117_1;
                    break L92;
                  } else {
                    stackOut_116_0 = (gna) (Object) stackIn_116_0;
                    stackOut_116_1 = 1;
                    stackIn_118_0 = stackOut_116_0;
                    stackIn_118_1 = stackOut_116_1;
                    break L92;
                  }
                }
                stackIn_118_0.field_t = stackIn_118_1 != 0;
                break L89;
              }
            }
            var6++;
            continue L33;
          }
        }
    }

    final void a(ub param0, int param1) {
        RuntimeException var3 = null;
        gj var4 = null;
        gj var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 <= -2) {
              L1: {
                var4 = param0.field_o;
                var5 = var4;
                if (var4.field_h.field_a[((wp) this).field_n][((wp) this).field_o].field_n == 37) {
                  param0.a(27799, (at) (Object) new iu(8, 128));
                  break L1;
                } else {
                  param0.a(27799, (at) (Object) new iu(60, 128));
                  break L1;
                }
              }
              param0.a(27799, (at) (Object) new fha((kj) (Object) new dw(var5, ((wp) this).field_n, ((wp) this).field_o)));
              this.a(param0, ((wp) this).field_o, ((wp) this).field_n, (byte) 83);
              this.a(param0, ((wp) this).field_o, -1 + ((wp) this).field_n, (byte) 83);
              this.a(param0, ((wp) this).field_o, ((wp) this).field_n - -1, (byte) 83);
              this.a(param0, ((wp) this).field_o - 1, ((wp) this).field_n, (byte) 83);
              this.a(param0, 1 + ((wp) this).field_o, ((wp) this).field_n, (byte) 83);
              super.a(false, var5.field_h);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("wp.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[5];
    }
}
