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
        op var6 = null;
        ad var7 = null;
        gj var8 = null;
        L0: {
          var8 = param0.field_o;
          if (param3 == 83) {
            break L0;
          } else {
            field_r = -32;
            break L0;
          }
        }
        L1: {
          var6 = var8.field_h;
          if (-1 < (param2 ^ -1)) {
            break L1;
          } else {
            if (var6.field_z > param2) {
              L2: {
                if (0 > param1) {
                  break L2;
                } else {
                  if (param1 < var6.field_B) {
                    var7 = var8.a(param1, false, param2);
                    if (var7 != null) {
                      boolean discarded$2 = var7.field_s.g(48, 45);
                      param0.a(27799, (at) (Object) new ek(var8, var7, 45));
                      return;
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
    }

    private final void a(byte param0, int param1, int param2, op param3) {
        aga var5 = null;
        L0: {
          if (0 > param2) {
            break L0;
          } else {
            if (param3.field_z > param2) {
              L1: {
                if (-1 < (param1 ^ -1)) {
                  break L1;
                } else {
                  if (param3.field_B > param1) {
                    L2: {
                      var5 = param3.field_a[param2][param1].field_l;
                      if (var5 != null) {
                        boolean discarded$2 = var5.g(-94, 45);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (param0 == -116) {
                        break L3;
                      } else {
                        field_r = -38;
                        break L3;
                      }
                    }
                    return;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    public static void b(int param0) {
        field_q = null;
        if (param0 <= 58) {
            wp.b(44);
        }
    }

    final void a(boolean param0, op param1) {
        this.a((byte) -116, ((wp) this).field_o, ((wp) this).field_n, param1);
        this.a((byte) -116, ((wp) this).field_o, -1 + ((wp) this).field_n, param1);
        this.a((byte) -116, ((wp) this).field_o, 1 + ((wp) this).field_n, param1);
        this.a((byte) -116, ((wp) this).field_o - 1, ((wp) this).field_n, param1);
        this.a((byte) -116, ((wp) this).field_o - -1, ((wp) this).field_n, param1);
        this.a(param0, param1);
    }

    final static void a(boolean param0, uha param1, int param2, boolean param3) {
        int var4 = 0;
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
        String var20 = null;
        String var21 = null;
        int var22_int = 0;
        String var22 = null;
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
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        gna stackIn_32_0 = null;
        gna stackIn_33_0 = null;
        gna stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        gna stackIn_39_0 = null;
        gna stackIn_40_0 = null;
        gna stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_70_0 = 0;
        gna stackIn_85_0 = null;
        gna stackIn_86_0 = null;
        gna stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        gna stackIn_92_0 = null;
        boolean stackIn_92_1 = false;
        gna stackIn_93_0 = null;
        boolean stackIn_93_1 = false;
        gna stackIn_94_0 = null;
        boolean stackIn_94_1 = false;
        int stackIn_94_2 = 0;
        gna stackIn_96_0 = null;
        gna stackIn_97_0 = null;
        gna stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        gna stackIn_100_0 = null;
        gna stackIn_101_0 = null;
        gna stackIn_102_0 = null;
        gna stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_107_0 = 0;
        gna stackIn_120_0 = null;
        gna stackIn_121_0 = null;
        gna stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        gna stackIn_124_0 = null;
        gna stackIn_125_0 = null;
        gna stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        gna stackIn_129_0 = null;
        gna stackIn_130_0 = null;
        gna stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        gna stackIn_133_0 = null;
        gna stackIn_134_0 = null;
        gna stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        String stackIn_151_0 = null;
        gna stackIn_154_0 = null;
        gna stackIn_155_0 = null;
        gna stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        gna stackIn_157_0 = null;
        gna stackIn_158_0 = null;
        gna stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        int stackIn_165_0 = 0;
        int stackIn_208_0 = 0;
        int stackIn_225_0 = 0;
        gna stackIn_322_0 = null;
        gna stackIn_323_0 = null;
        gna stackIn_324_0 = null;
        int stackIn_324_1 = 0;
        gna stackIn_328_0 = null;
        boolean stackIn_328_1 = false;
        gna stackIn_329_0 = null;
        boolean stackIn_329_1 = false;
        gna stackIn_330_0 = null;
        boolean stackIn_330_1 = false;
        int stackIn_330_2 = 0;
        gna stackIn_332_0 = null;
        gna stackIn_333_0 = null;
        gna stackIn_334_0 = null;
        gna stackIn_335_0 = null;
        int stackIn_335_1 = 0;
        gna stackIn_337_0 = null;
        gna stackIn_338_0 = null;
        gna stackIn_339_0 = null;
        gna stackIn_340_0 = null;
        int stackIn_340_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        gna stackOut_31_0 = null;
        gna stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        gna stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        gna stackOut_38_0 = null;
        gna stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        gna stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        gna stackOut_95_0 = null;
        gna stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        gna stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        gna stackOut_91_0 = null;
        boolean stackOut_91_1 = false;
        gna stackOut_93_0 = null;
        boolean stackOut_93_1 = false;
        int stackOut_93_2 = 0;
        gna stackOut_92_0 = null;
        boolean stackOut_92_1 = false;
        int stackOut_92_2 = 0;
        gna stackOut_84_0 = null;
        gna stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        gna stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        gna stackOut_99_0 = null;
        gna stackOut_100_0 = null;
        gna stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        gna stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_105_0 = 0;
        Object stackOut_150_0 = null;
        String stackOut_149_0 = null;
        gna stackOut_153_0 = null;
        gna stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        gna stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        gna stackOut_156_0 = null;
        gna stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        gna stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        int stackOut_164_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_214_0 = 0;
        gna stackOut_331_0 = null;
        gna stackOut_332_0 = null;
        gna stackOut_333_0 = null;
        int stackOut_333_1 = 0;
        gna stackOut_334_0 = null;
        int stackOut_334_1 = 0;
        gna stackOut_327_0 = null;
        boolean stackOut_327_1 = false;
        gna stackOut_329_0 = null;
        boolean stackOut_329_1 = false;
        int stackOut_329_2 = 0;
        gna stackOut_328_0 = null;
        boolean stackOut_328_1 = false;
        int stackOut_328_2 = 0;
        gna stackOut_321_0 = null;
        gna stackOut_323_0 = null;
        int stackOut_323_1 = 0;
        gna stackOut_322_0 = null;
        int stackOut_322_1 = 0;
        gna stackOut_336_0 = null;
        gna stackOut_337_0 = null;
        gna stackOut_338_0 = null;
        int stackOut_338_1 = 0;
        gna stackOut_339_0 = null;
        int stackOut_339_1 = 0;
        gna stackOut_119_0 = null;
        gna stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        gna stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        gna stackOut_132_0 = null;
        gna stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        gna stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        gna stackOut_128_0 = null;
        gna stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        gna stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        gna stackOut_123_0 = null;
        gna stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        gna stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        L0: {
          var26 = BachelorFridge.field_y;
          if (param3) {
            L1: {
              if (ce.field_y) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L1;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L1;
              }
            }
            var4 = stackIn_11_0;
            break L0;
          } else {
            L2: {
              if (ps.d(-122)) {
                if (!param1.field_Zb) {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L2;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  break L2;
                }
              } else {
                stackOut_2_0 = 0;
                stackIn_7_0 = stackOut_2_0;
                break L2;
              }
            }
            var4 = stackIn_7_0;
            break L0;
          }
        }
        L3: {
          L4: {
            L5: {
              var5 = param0 ? 1 : 0;
              if (!param3) {
                var6 = 0;
                L6: while (true) {
                  if (var6 >= 5) {
                    L7: {
                      if (!gd.field_n[0][2].field_E) {
                        break L7;
                      } else {
                        if (!ps.d(-117)) {
                          jja.field_m = lga.a(true, new String[1], wa.field_o);
                          break L7;
                        } else {
                          jja.field_m = qd.field_p;
                          break L7;
                        }
                      }
                    }
                    if (2 <= qha.field_c.length) {
                      L8: {
                        if (param3) {
                          if (aca.field_k != -1) {
                            stackOut_52_0 = 1;
                            stackIn_54_0 = stackOut_52_0;
                            break L8;
                          } else {
                            stackOut_51_0 = 0;
                            stackIn_54_0 = stackOut_51_0;
                            break L8;
                          }
                        } else {
                          stackOut_49_0 = 0;
                          stackIn_54_0 = stackOut_49_0;
                          break L8;
                        }
                      }
                      var6 = stackIn_54_0;
                      if (var6 == 0) {
                        break L4;
                      } else {
                        var7 = aca.field_k;
                        var8_int = 0;
                        L9: while (true) {
                          if (fia.field_r.length <= var8_int) {
                            break L5;
                          } else {
                            fia.field_r[var8_int] = (byte) 0;
                            var8_int++;
                            continue L9;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    L10: {
                      if (var4 == 0) {
                        break L10;
                      } else {
                        if (gd.field_n[0][1 + var6].field_R == 0) {
                          break L10;
                        } else {
                          if (param1.field_Kb == var6) {
                            break L10;
                          } else {
                            param1.field_Kb = var6;
                            var5 = 1;
                            break L10;
                          }
                        }
                      }
                    }
                    L11: {
                      stackOut_31_0 = gd.field_n[0][1 + var6];
                      stackIn_33_0 = stackOut_31_0;
                      stackIn_32_0 = stackOut_31_0;
                      if (var4 == 0) {
                        stackOut_33_0 = (gna) (Object) stackIn_33_0;
                        stackOut_33_1 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        break L11;
                      } else {
                        stackOut_32_0 = (gna) (Object) stackIn_32_0;
                        stackOut_32_1 = 1;
                        stackIn_34_0 = stackOut_32_0;
                        stackIn_34_1 = stackOut_32_1;
                        break L11;
                      }
                    }
                    L12: {
                      ((gna) (Object) stackIn_34_0).field_u = stackIn_34_1 != 0;
                      if (eaa.field_c) {
                        break L12;
                      } else {
                        if ((var6 ^ -1) == -4) {
                          gd.field_n[0][1 + var6].field_u = false;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L13: {
                      stackOut_38_0 = gd.field_n[0][var6 - -1];
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_39_0 = stackOut_38_0;
                      if (var6 != param1.field_Kb) {
                        stackOut_40_0 = (gna) (Object) stackIn_40_0;
                        stackOut_40_1 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        break L13;
                      } else {
                        stackOut_39_0 = (gna) (Object) stackIn_39_0;
                        stackOut_39_1 = 1;
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        break L13;
                      }
                    }
                    ((gna) (Object) stackIn_41_0).field_t = stackIn_41_1 != 0;
                    var6++;
                    continue L6;
                  }
                }
              } else {
                if (2 <= qha.field_c.length) {
                  L14: {
                    if (param3) {
                      if (aca.field_k != -1) {
                        stackOut_19_0 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        break L14;
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_21_0 = stackOut_18_0;
                        break L14;
                      }
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_21_0 = stackOut_16_0;
                      break L14;
                    }
                  }
                  var6 = stackIn_21_0;
                  if (var6 == 0) {
                    break L4;
                  } else {
                    var7 = aca.field_k;
                    var8_int = 0;
                    L15: while (true) {
                      if (fia.field_r.length <= var8_int) {
                        break L5;
                      } else {
                        fia.field_r[var8_int] = (byte) 0;
                        var8_int++;
                        continue L15;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            fia.field_r[var7 / 8] = (byte)mp.a((int) fia.field_r[var7 / 8], 1 << var7 % 8);
            break L4;
          }
          L16: {
            if (!param3) {
              stackOut_61_0 = 0;
              stackIn_62_0 = stackOut_61_0;
              break L16;
            } else {
              stackOut_60_0 = -1;
              stackIn_62_0 = stackOut_60_0;
              break L16;
            }
          }
          var7 = stackIn_62_0;
          L17: while (true) {
            if (qha.field_c.length <= var7) {
              break L3;
            } else {
              L18: {
                if (var6 != 0) {
                  if (aca.field_k != var7) {
                    stackOut_68_0 = 1;
                    stackIn_70_0 = stackOut_68_0;
                    break L18;
                  } else {
                    stackOut_67_0 = 0;
                    stackIn_70_0 = stackOut_67_0;
                    break L18;
                  }
                } else {
                  stackOut_65_0 = 0;
                  stackIn_70_0 = stackOut_65_0;
                  break L18;
                }
              }
              L19: {
                var8_int = stackIn_70_0;
                if (var4 == 0) {
                  break L19;
                } else {
                  if (gd.field_n[1][1 + var7].field_R != 0) {
                    if (!param3) {
                      var9 = qha.field_c[var7];
                      if (param1.field_Pb == var9) {
                        break L19;
                      } else {
                        var5 = 1;
                        param1.field_Pb = var9;
                        break L19;
                      }
                    } else {
                      if (var6 == 0) {
                        if (var7 != -1) {
                          fia.field_r[var7 / 8] = (byte)lt.a((int) fia.field_r[var7 / 8], 1 << dda.a(var7, 7));
                          break L19;
                        } else {
                          var9 = 0;
                          L20: while (true) {
                            if (var9 >= fia.field_r.length) {
                              break L19;
                            } else {
                              fia.field_r[var9] = (byte) 0;
                              var9++;
                              continue L20;
                            }
                          }
                        }
                      } else {
                        break L19;
                      }
                    }
                  } else {
                    break L19;
                  }
                }
              }
              L21: {
                if (param3) {
                  if (0 != (var7 ^ -1)) {
                    L22: {
                      stackOut_95_0 = gd.field_n[1][var7 - -1];
                      stackIn_97_0 = stackOut_95_0;
                      stackIn_96_0 = stackOut_95_0;
                      if ((fia.field_r[var7 / 8] & 1 << (var7 & 7)) == 0) {
                        stackOut_97_0 = (gna) (Object) stackIn_97_0;
                        stackOut_97_1 = 0;
                        stackIn_98_0 = stackOut_97_0;
                        stackIn_98_1 = stackOut_97_1;
                        break L22;
                      } else {
                        stackOut_96_0 = (gna) (Object) stackIn_96_0;
                        stackOut_96_1 = 1;
                        stackIn_98_0 = stackOut_96_0;
                        stackIn_98_1 = stackOut_96_1;
                        break L22;
                      }
                    }
                    ((gna) (Object) stackIn_98_0).field_t = stackIn_98_1 != 0;
                    break L21;
                  } else {
                    gd.field_n[1][var7 - -1].field_t = true;
                    var9 = 0;
                    L23: while (true) {
                      if (qha.field_c.length <= var9) {
                        break L21;
                      } else {
                        L24: {
                          stackOut_91_0 = gd.field_n[1][var7 - -1];
                          stackOut_91_1 = gd.field_n[1][var7 - -1].field_t;
                          stackIn_93_0 = stackOut_91_0;
                          stackIn_93_1 = stackOut_91_1;
                          stackIn_92_0 = stackOut_91_0;
                          stackIn_92_1 = stackOut_91_1;
                          if ((fia.field_r[var9 / 8] & 1 << (var9 & 7)) != 0) {
                            stackOut_93_0 = (gna) (Object) stackIn_93_0;
                            stackOut_93_1 = stackIn_93_1;
                            stackOut_93_2 = 0;
                            stackIn_94_0 = stackOut_93_0;
                            stackIn_94_1 = stackOut_93_1;
                            stackIn_94_2 = stackOut_93_2;
                            break L24;
                          } else {
                            stackOut_92_0 = (gna) (Object) stackIn_92_0;
                            stackOut_92_1 = stackIn_92_1;
                            stackOut_92_2 = 1;
                            stackIn_94_0 = stackOut_92_0;
                            stackIn_94_1 = stackOut_92_1;
                            stackIn_94_2 = stackOut_92_2;
                            break L24;
                          }
                        }
                        ((gna) (Object) stackIn_94_0).field_t = stackIn_94_1 & stackIn_94_2 != 0;
                        var9++;
                        continue L23;
                      }
                    }
                  }
                } else {
                  L25: {
                    var9 = qha.field_c[var7];
                    stackOut_84_0 = gd.field_n[1][var7 - -1];
                    stackIn_86_0 = stackOut_84_0;
                    stackIn_85_0 = stackOut_84_0;
                    if (var9 != param1.field_Pb) {
                      stackOut_86_0 = (gna) (Object) stackIn_86_0;
                      stackOut_86_1 = 0;
                      stackIn_87_0 = stackOut_86_0;
                      stackIn_87_1 = stackOut_86_1;
                      break L25;
                    } else {
                      stackOut_85_0 = (gna) (Object) stackIn_85_0;
                      stackOut_85_1 = 1;
                      stackIn_87_0 = stackOut_85_0;
                      stackIn_87_1 = stackOut_85_1;
                      break L25;
                    }
                  }
                  ((gna) (Object) stackIn_87_0).field_t = stackIn_87_1 != 0;
                  break L21;
                }
              }
              L26: {
                L27: {
                  stackOut_99_0 = gd.field_n[1][var7 - -1];
                  stackIn_102_0 = stackOut_99_0;
                  stackIn_100_0 = stackOut_99_0;
                  if (var4 == 0) {
                    break L27;
                  } else {
                    stackOut_100_0 = (gna) (Object) stackIn_100_0;
                    stackIn_102_0 = stackOut_100_0;
                    stackIn_101_0 = stackOut_100_0;
                    if (var8_int != 0) {
                      break L27;
                    } else {
                      stackOut_101_0 = (gna) (Object) stackIn_101_0;
                      stackOut_101_1 = 1;
                      stackIn_103_0 = stackOut_101_0;
                      stackIn_103_1 = stackOut_101_1;
                      break L26;
                    }
                  }
                }
                stackOut_102_0 = (gna) (Object) stackIn_102_0;
                stackOut_102_1 = 0;
                stackIn_103_0 = stackOut_102_0;
                stackIn_103_1 = stackOut_102_1;
                break L26;
              }
              ((gna) (Object) stackIn_103_0).field_u = stackIn_103_1 != 0;
              var7++;
              continue L17;
            }
          }
        }
        L28: {
          if (!param3) {
            stackOut_106_0 = 1;
            stackIn_107_0 = stackOut_106_0;
            break L28;
          } else {
            stackOut_105_0 = 0;
            stackIn_107_0 = stackOut_105_0;
            break L28;
          }
        }
        var6 = stackIn_107_0;
        L29: while (true) {
          if ((var6 ^ -1) <= -4) {
            L30: {
              if (!param3) {
                break L30;
              } else {
                if ((bma.field_u ^ -1) < -2) {
                  var6 = 0;
                  L31: while (true) {
                    if (var6 >= bma.field_u - -1) {
                      break L30;
                    } else {
                      L32: {
                        var29 = gd.field_n[3][var6];
                        if (var4 == 0) {
                          break L32;
                        } else {
                          if (0 != var29.field_R) {
                            tq.field_h = var6;
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                      }
                      L33: {
                        if (!var29.field_E) {
                          break L33;
                        } else {
                          if ((var6 ^ -1) < -1) {
                            L34: {
                              if (null == md.field_p) {
                                stackOut_150_0 = null;
                                stackIn_151_0 = (String) (Object) stackOut_150_0;
                                break L34;
                              } else {
                                stackOut_149_0 = md.field_p[var6 - 1];
                                stackIn_151_0 = stackOut_149_0;
                                break L34;
                              }
                            }
                            var8_ref = (String) (Object) stackIn_151_0;
                            if (var8_ref == null) {
                              break L33;
                            } else {
                              jja.field_m = var8_ref;
                              break L33;
                            }
                          } else {
                            break L33;
                          }
                        }
                      }
                      L35: {
                        stackOut_153_0 = (gna) var29;
                        stackIn_155_0 = stackOut_153_0;
                        stackIn_154_0 = stackOut_153_0;
                        if (tq.field_h != var6) {
                          stackOut_155_0 = (gna) (Object) stackIn_155_0;
                          stackOut_155_1 = 0;
                          stackIn_156_0 = stackOut_155_0;
                          stackIn_156_1 = stackOut_155_1;
                          break L35;
                        } else {
                          stackOut_154_0 = (gna) (Object) stackIn_154_0;
                          stackOut_154_1 = 1;
                          stackIn_156_0 = stackOut_154_0;
                          stackIn_156_1 = stackOut_154_1;
                          break L35;
                        }
                      }
                      L36: {
                        ((gna) (Object) stackIn_156_0).field_t = stackIn_156_1 != 0;
                        stackOut_156_0 = (gna) var29;
                        stackIn_158_0 = stackOut_156_0;
                        stackIn_157_0 = stackOut_156_0;
                        if (var4 == 0) {
                          stackOut_158_0 = (gna) (Object) stackIn_158_0;
                          stackOut_158_1 = 0;
                          stackIn_159_0 = stackOut_158_0;
                          stackIn_159_1 = stackOut_158_1;
                          break L36;
                        } else {
                          stackOut_157_0 = (gna) (Object) stackIn_157_0;
                          stackOut_157_1 = 1;
                          stackIn_159_0 = stackOut_157_0;
                          stackIn_159_1 = stackOut_157_1;
                          break L36;
                        }
                      }
                      ((gna) (Object) stackIn_159_0).field_u = stackIn_159_1 != 0;
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
              if (var7 >= ld.field_q) {
                L38: {
                  if (var5 == 0) {
                    break L38;
                  } else {
                    if (!param3) {
                      bka.b(-112, param2);
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                }
                return;
              } else {
                L39: {
                  var30 = gd.field_n[var7 + 4];
                  var8 = var30;
                  if (param3) {
                    stackOut_164_0 = -1;
                    stackIn_165_0 = stackOut_164_0;
                    break L39;
                  } else {
                    stackOut_163_0 = 0;
                    stackIn_165_0 = stackOut_163_0;
                    break L39;
                  }
                }
                var9 = stackIn_165_0;
                L40: while (true) {
                  if (var9 >= var30.length + -1) {
                    var6 = var6 + (255 & mja.field_s[var7]);
                    var7++;
                    continue L37;
                  } else {
                    L41: {
                      var10 = 0;
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      if (var4 == 0) {
                        break L41;
                      } else {
                        if ((var9 ^ -1) > -1) {
                          break L41;
                        } else {
                          L42: {
                            if (null == wda.field_c) {
                              break L42;
                            } else {
                              if (wda.field_c[var7] == null) {
                                break L42;
                              } else {
                                if ((wda.field_c[var7][var9] & (pn.field_d ^ -1)) <= 0) {
                                  break L42;
                                } else {
                                  var14 = 1;
                                  var15 = ho.a(62, wda.field_c[var7][var9] & (pn.field_d ^ -1));
                                  break L42;
                                }
                              }
                            }
                          }
                          L43: {
                            if (hr.field_b == null) {
                              break L43;
                            } else {
                              if (hr.field_b[var7] != null) {
                                if (dm.field_f > 0) {
                                  break L43;
                                } else {
                                  if (!hr.field_b[var7][var9]) {
                                    break L43;
                                  } else {
                                    var10 = 1;
                                    break L43;
                                  }
                                }
                              } else {
                                break L43;
                              }
                            }
                          }
                          L44: {
                            if (null == re.field_F) {
                              break L44;
                            } else {
                              if (null == re.field_F[var7]) {
                                break L44;
                              } else {
                                L45: {
                                  var16 = re.field_F[var7][var9];
                                  if (var16 == 0) {
                                    break L45;
                                  } else {
                                    if (bha.field_l) {
                                      break L45;
                                    } else {
                                      if (dm.field_f > 0) {
                                        break L45;
                                      } else {
                                        var10 = 1;
                                        break L45;
                                      }
                                    }
                                  }
                                }
                                if (var16 <= 0) {
                                  break L44;
                                } else {
                                  if (wk.field_a < var16) {
                                    var12 = 1;
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                            }
                          }
                          L46: {
                            if (gma.field_c == null) {
                              break L46;
                            } else {
                              if (gma.field_c[var7] == null) {
                                break L46;
                              } else {
                                L47: {
                                  var16 = gma.field_c[var7][var9];
                                  if (0 >= var16) {
                                    break L47;
                                  } else {
                                    if (ui.field_q < var16) {
                                      var11 = 1;
                                      break L47;
                                    } else {
                                      break L47;
                                    }
                                  }
                                }
                                if (var16 == 0) {
                                  break L46;
                                } else {
                                  if (bha.field_l) {
                                    break L46;
                                  } else {
                                    if (dm.field_f > 0) {
                                      break L46;
                                    } else {
                                      var10 = 1;
                                      break L46;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L48: {
                            if (param3) {
                              if (null != im.field_c) {
                                if (null != im.field_c[var7]) {
                                  if (!im.field_c[var7][var9]) {
                                    stackOut_207_0 = 0;
                                    stackIn_208_0 = stackOut_207_0;
                                    break L48;
                                  } else {
                                    stackOut_206_0 = 1;
                                    stackIn_208_0 = stackOut_206_0;
                                    break L48;
                                  }
                                } else {
                                  stackOut_204_0 = 0;
                                  stackIn_208_0 = stackOut_204_0;
                                  break L48;
                                }
                              } else {
                                stackOut_202_0 = 0;
                                stackIn_208_0 = stackOut_202_0;
                                break L48;
                              }
                            } else {
                              stackOut_200_0 = 0;
                              stackIn_208_0 = stackOut_200_0;
                              break L48;
                            }
                          }
                          var13 = stackIn_208_0;
                          break L41;
                        }
                      }
                    }
                    L49: {
                      if (-3 < (hea.field_r ^ -1)) {
                        break L49;
                      } else {
                        if (wga.field_q[12]) {
                          var12 = 0;
                          var10 = 0;
                          var14 = 0;
                          var13 = 0;
                          var11 = 0;
                          break L49;
                        } else {
                          break L49;
                        }
                      }
                    }
                    L50: {
                      if (var10 == 0) {
                        if (var11 == 0) {
                          if (var12 == 0) {
                            if (var13 == 0) {
                              if (var14 != 0) {
                                stackOut_223_0 = 1;
                                stackIn_225_0 = stackOut_223_0;
                                break L50;
                              } else {
                                stackOut_222_0 = 0;
                                stackIn_225_0 = stackOut_222_0;
                                break L50;
                              }
                            } else {
                              stackOut_220_0 = 1;
                              stackIn_225_0 = stackOut_220_0;
                              break L50;
                            }
                          } else {
                            stackOut_218_0 = 1;
                            stackIn_225_0 = stackOut_218_0;
                            break L50;
                          }
                        } else {
                          stackOut_216_0 = 1;
                          stackIn_225_0 = stackOut_216_0;
                          break L50;
                        }
                      } else {
                        stackOut_214_0 = 1;
                        stackIn_225_0 = stackOut_214_0;
                        break L50;
                      }
                    }
                    L51: {
                      var16 = stackIn_225_0;
                      fla.field_q = true;
                      if (var16 != 0) {
                        break L51;
                      } else {
                        if ((var9 ^ -1) > -1) {
                          break L51;
                        } else {
                          if (pha.field_h == null) {
                            break L51;
                          } else {
                            L52: {
                              if (!param3) {
                                break L52;
                              } else {
                                if (!ce.field_y) {
                                  break L52;
                                } else {
                                  break L51;
                                }
                              }
                            }
                            L53: {
                              if (null != bja.field_o) {
                                break L53;
                              } else {
                                ala.field_b = new boolean[ld.field_q];
                                bja.field_o = new byte[ld.field_q];
                                break L53;
                              }
                            }
                            fla.field_q = false;
                            uu.field_yb = false;
                            var17_int = 0;
                            L54: while (true) {
                              if (var17_int >= var7) {
                                L55: {
                                  ub.a(0, param3, -96, var9, -1, param1, -1, var7);
                                  if (2 > hea.field_r) {
                                    break L55;
                                  } else {
                                    if (!wga.field_q[12]) {
                                      break L55;
                                    } else {
                                      fla.field_q = true;
                                      break L55;
                                    }
                                  }
                                }
                                if (!fla.field_q) {
                                  var16 = 1;
                                  break L51;
                                } else {
                                  break L51;
                                }
                              } else {
                                ala.field_b[var17_int] = false;
                                var17_int++;
                                continue L54;
                              }
                            }
                          }
                        }
                      }
                    }
                    L56: {
                      var17 = var8[1 + var9];
                      if (var4 == 0) {
                        break L56;
                      } else {
                        if (0 == var17.field_R) {
                          break L56;
                        } else {
                          if (param3) {
                            if (-1 == var9) {
                              var18 = var6;
                              L57: while (true) {
                                if (-1 + (var30.length + var6) <= var18) {
                                  break L56;
                                } else {
                                  sca.field_c[var18 / 8] = (byte)dda.a((int) sca.field_c[var18 / 8], 1 << dda.a(7, var18) ^ -1);
                                  var18++;
                                  continue L57;
                                }
                              }
                            } else {
                              sca.field_c[(var9 + var6) / 8] = (byte)lt.a((int) sca.field_c[(var9 + var6) / 8], 1 << dda.a(7, var6 + var9));
                              break L56;
                            }
                          } else {
                            if (var16 != 0) {
                              break L56;
                            } else {
                              if ((byte)var9 != param1.field_Eb[var7]) {
                                param1.field_Eb[var7] = (byte)var9;
                                var5 = 1;
                                break L56;
                              } else {
                                break L56;
                              }
                            }
                          }
                        }
                      }
                    }
                    L58: {
                      if (!param3) {
                        break L58;
                      } else {
                        if (var16 != 0) {
                          sca.field_c[(var6 + var9) / 8] = (byte)dda.a((int) sca.field_c[(var6 + var9) / 8], 1 << dda.a(var9 + var6, 7));
                          break L58;
                        } else {
                          break L58;
                        }
                      }
                    }
                    L59: {
                      if (-1 > var9) {
                        break L59;
                      } else {
                        if (!var17.field_E) {
                          break L59;
                        } else {
                          L60: {
                            if (null != co.field_a) {
                              if (null != co.field_a[var7]) {
                                var18_ref_String = co.field_a[var7][var9];
                                break L60;
                              } else {
                                var18_ref_String = null;
                                break L60;
                              }
                            } else {
                              var18_ref_String = null;
                              break L60;
                            }
                          }
                          L61: {
                            if (null != gk.field_c) {
                              if (gk.field_c[var7] != null) {
                                var19_ref = gk.field_c[var7][var9];
                                break L61;
                              } else {
                                var19_ref = null;
                                break L61;
                              }
                            } else {
                              var19_ref = null;
                              break L61;
                            }
                          }
                          L62: {
                            var20 = null;
                            if (var19_ref == null) {
                              break L62;
                            } else {
                              if (!var19_ref.equals((Object) (Object) var18_ref_String)) {
                                var20 = var19_ref;
                                break L62;
                              } else {
                                break L62;
                              }
                            }
                          }
                          L63: {
                            var21 = null;
                            if (var13 == 0) {
                              if (var10 == 0) {
                                L64: {
                                  if (var11 == 0) {
                                    break L64;
                                  } else {
                                    var22_int = -ui.field_q + gma.field_c[var7][var9];
                                    if (1 != var22_int) {
                                      var21 = lga.a(true, new String[1], tv.field_p);
                                      var31 = var21;
                                      var21 = var31;
                                      var31 = var21;
                                      var21 = var31;
                                      break L64;
                                    } else {
                                      var21 = afa.field_k;
                                      break L64;
                                    }
                                  }
                                }
                                L65: {
                                  if (var12 == 0) {
                                    break L65;
                                  } else {
                                    var31 = lga.a(true, new String[2], oca.field_o);
                                    var21 = var31;
                                    var21 = var31;
                                    if (var21 != null) {
                                      var21 = var21 + "<br>" + var31;
                                      break L65;
                                    } else {
                                      var21 = var31;
                                      break L65;
                                    }
                                  }
                                }
                                if (var14 != 0) {
                                  L66: {
                                    var22 = df.field_q;
                                    if (0 >= var15) {
                                      break L66;
                                    } else {
                                      if (ffa.field_j == null) {
                                        break L66;
                                      } else {
                                        if (var15 > ffa.field_j.length) {
                                          break L66;
                                        } else {
                                          if (null == ffa.field_j[var15 + -1]) {
                                            break L66;
                                          } else {
                                            var22_ref = ffa.field_j[var15 - 1][0];
                                            break L66;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var21 == null) {
                                    var21 = var22_ref;
                                    break L63;
                                  } else {
                                    var21 = var21 + "<br>" + var22_ref;
                                    break L63;
                                  }
                                } else {
                                  break L63;
                                }
                              } else {
                                var21 = ph.field_N;
                                break L63;
                              }
                            } else {
                              var21 = hk.field_a;
                              break L63;
                            }
                          }
                          L67: {
                            if (var4 == 0) {
                              break L67;
                            } else {
                              if (!fla.field_q) {
                                L68: {
                                  var22_ref = null;
                                  var23 = 0;
                                  if (uu.field_yb) {
                                    var22 = "</col>" + gb.field_j + "<col=A00000>";
                                    var25 = var22;
                                    var22 = var25;
                                    var25 = var22;
                                    var22 = var25;
                                    var21 = var22;
                                    break L68;
                                  } else {
                                    break L68;
                                  }
                                }
                                var24 = 0;
                                L69: while (true) {
                                  if (var7 <= var24) {
                                    if (var23 == 0) {
                                      var21 = lga.a(true, new String[1], l.field_s);
                                      break L67;
                                    } else {
                                      var21 = gf.field_i + var22;
                                      break L67;
                                    }
                                  } else {
                                    if (ala.field_b[var24]) {
                                      var25 = "</col>" + kka.field_k[var24] + "<col=A00000>";
                                      var22 = var25;
                                      var21 = var22;
                                      var22 = var25;
                                      if (var22 == null) {
                                        var22 = var25;
                                        var21 = var22;
                                        var21 = var22;
                                        var24++;
                                        continue L69;
                                      } else {
                                        var22 = var22 + ", " + var25;
                                        var23 = 1;
                                        var24++;
                                        continue L69;
                                      }
                                    } else {
                                      var24++;
                                      continue L69;
                                    }
                                  }
                                }
                              } else {
                                break L67;
                              }
                            }
                          }
                          L70: {
                            if (var21 != null) {
                              var32 = "<col=A00000>" + var21;
                              var33 = qm.a("<br><col=A00000>", "<br>", var32, -1);
                              if (var20 == null) {
                                var20 = var33;
                                break L70;
                              } else {
                                var20 = var20 + "<br>" + var33;
                                break L70;
                              }
                            } else {
                              break L70;
                            }
                          }
                          if (var20 == null) {
                            break L59;
                          } else {
                            jja.field_m = var20;
                            break L59;
                          }
                        }
                      }
                    }
                    L71: {
                      if (!param3) {
                        L72: {
                          L73: {
                            stackOut_331_0 = (gna) var17;
                            stackIn_334_0 = stackOut_331_0;
                            stackIn_332_0 = stackOut_331_0;
                            if (!fla.field_q) {
                              break L73;
                            } else {
                              stackOut_332_0 = (gna) (Object) stackIn_332_0;
                              stackIn_334_0 = stackOut_332_0;
                              stackIn_333_0 = stackOut_332_0;
                              if ((byte)var9 != param1.field_Eb[var7]) {
                                break L73;
                              } else {
                                stackOut_333_0 = (gna) (Object) stackIn_333_0;
                                stackOut_333_1 = 1;
                                stackIn_335_0 = stackOut_333_0;
                                stackIn_335_1 = stackOut_333_1;
                                break L72;
                              }
                            }
                          }
                          stackOut_334_0 = (gna) (Object) stackIn_334_0;
                          stackOut_334_1 = 0;
                          stackIn_335_0 = stackOut_334_0;
                          stackIn_335_1 = stackOut_334_1;
                          break L72;
                        }
                        ((gna) (Object) stackIn_335_0).field_t = stackIn_335_1 != 0;
                        break L71;
                      } else {
                        if (0 == (var9 ^ -1)) {
                          var17.field_t = true;
                          var27 = var6;
                          var18 = var27;
                          L74: while (true) {
                            if (var27 >= var6 - -var30.length + -1) {
                              break L71;
                            } else {
                              L75: {
                                stackOut_327_0 = (gna) var17;
                                stackOut_327_1 = var17.field_t;
                                stackIn_329_0 = stackOut_327_0;
                                stackIn_329_1 = stackOut_327_1;
                                stackIn_328_0 = stackOut_327_0;
                                stackIn_328_1 = stackOut_327_1;
                                if (-1 != (sca.field_c[var27 / 8] & 1 << (7 & var27) ^ -1)) {
                                  stackOut_329_0 = (gna) (Object) stackIn_329_0;
                                  stackOut_329_1 = stackIn_329_1;
                                  stackOut_329_2 = 0;
                                  stackIn_330_0 = stackOut_329_0;
                                  stackIn_330_1 = stackOut_329_1;
                                  stackIn_330_2 = stackOut_329_2;
                                  break L75;
                                } else {
                                  stackOut_328_0 = (gna) (Object) stackIn_328_0;
                                  stackOut_328_1 = stackIn_328_1;
                                  stackOut_328_2 = 1;
                                  stackIn_330_0 = stackOut_328_0;
                                  stackIn_330_1 = stackOut_328_1;
                                  stackIn_330_2 = stackOut_328_2;
                                  break L75;
                                }
                              }
                              ((gna) (Object) stackIn_330_0).field_t = stackIn_330_1 & stackIn_330_2 != 0;
                              var27++;
                              continue L74;
                            }
                          }
                        } else {
                          L76: {
                            stackOut_321_0 = (gna) var17;
                            stackIn_323_0 = stackOut_321_0;
                            stackIn_322_0 = stackOut_321_0;
                            if ((sca.field_c[(var9 + var6) / 8] & 1 << (var9 + var6 & 7)) == 0) {
                              stackOut_323_0 = (gna) (Object) stackIn_323_0;
                              stackOut_323_1 = 0;
                              stackIn_324_0 = stackOut_323_0;
                              stackIn_324_1 = stackOut_323_1;
                              break L76;
                            } else {
                              stackOut_322_0 = (gna) (Object) stackIn_322_0;
                              stackOut_322_1 = 1;
                              stackIn_324_0 = stackOut_322_0;
                              stackIn_324_1 = stackOut_322_1;
                              break L76;
                            }
                          }
                          ((gna) (Object) stackIn_324_0).field_t = stackIn_324_1 != 0;
                          break L71;
                        }
                      }
                    }
                    L77: {
                      L78: {
                        stackOut_336_0 = (gna) var17;
                        stackIn_339_0 = stackOut_336_0;
                        stackIn_337_0 = stackOut_336_0;
                        if (var4 == 0) {
                          break L78;
                        } else {
                          stackOut_337_0 = (gna) (Object) stackIn_337_0;
                          stackIn_339_0 = stackOut_337_0;
                          stackIn_338_0 = stackOut_337_0;
                          if (var16 != 0) {
                            break L78;
                          } else {
                            stackOut_338_0 = (gna) (Object) stackIn_338_0;
                            stackOut_338_1 = 1;
                            stackIn_340_0 = stackOut_338_0;
                            stackIn_340_1 = stackOut_338_1;
                            break L77;
                          }
                        }
                      }
                      stackOut_339_0 = (gna) (Object) stackIn_339_0;
                      stackOut_339_1 = 0;
                      stackIn_340_0 = stackOut_339_0;
                      stackIn_340_1 = stackOut_339_1;
                      break L77;
                    }
                    ((gna) (Object) stackIn_340_0).field_u = stackIn_340_1 != 0;
                    var9++;
                    continue L40;
                  }
                }
              }
            }
          } else {
            L79: {
              var28 = gd.field_n[2][var6];
              if (var4 == 0) {
                break L79;
              } else {
                if (var28.field_R != 0) {
                  if (param3) {
                    if (-1 != (var6 ^ -1)) {
                      ena.field_n = ena.field_n ^ var6;
                      break L79;
                    } else {
                      ena.field_n = 0;
                      break L79;
                    }
                  } else {
                    if (var6 != param1.field_Lb) {
                      param1.field_Lb = var6;
                      var5 = 1;
                      break L79;
                    } else {
                      break L79;
                    }
                  }
                } else {
                  break L79;
                }
              }
            }
            L80: {
              stackOut_119_0 = (gna) var28;
              stackIn_121_0 = stackOut_119_0;
              stackIn_120_0 = stackOut_119_0;
              if (var4 == 0) {
                stackOut_121_0 = (gna) (Object) stackIn_121_0;
                stackOut_121_1 = 0;
                stackIn_122_0 = stackOut_121_0;
                stackIn_122_1 = stackOut_121_1;
                break L80;
              } else {
                stackOut_120_0 = (gna) (Object) stackIn_120_0;
                stackOut_120_1 = 1;
                stackIn_122_0 = stackOut_120_0;
                stackIn_122_1 = stackOut_120_1;
                break L80;
              }
            }
            ((gna) (Object) stackIn_122_0).field_u = stackIn_122_1 != 0;
            if (param3) {
              if (0 == var6) {
                L81: {
                  stackOut_132_0 = (gna) var28;
                  stackIn_134_0 = stackOut_132_0;
                  stackIn_133_0 = stackOut_132_0;
                  if (0 != ena.field_n) {
                    stackOut_134_0 = (gna) (Object) stackIn_134_0;
                    stackOut_134_1 = 0;
                    stackIn_135_0 = stackOut_134_0;
                    stackIn_135_1 = stackOut_134_1;
                    break L81;
                  } else {
                    stackOut_133_0 = (gna) (Object) stackIn_133_0;
                    stackOut_133_1 = 1;
                    stackIn_135_0 = stackOut_133_0;
                    stackIn_135_1 = stackOut_133_1;
                    break L81;
                  }
                }
                ((gna) (Object) stackIn_135_0).field_t = stackIn_135_1 != 0;
                var6++;
                continue L29;
              } else {
                L82: {
                  stackOut_128_0 = (gna) var28;
                  stackIn_130_0 = stackOut_128_0;
                  stackIn_129_0 = stackOut_128_0;
                  if (-1 == (ena.field_n & var6)) {
                    stackOut_130_0 = (gna) (Object) stackIn_130_0;
                    stackOut_130_1 = 0;
                    stackIn_131_0 = stackOut_130_0;
                    stackIn_131_1 = stackOut_130_1;
                    break L82;
                  } else {
                    stackOut_129_0 = (gna) (Object) stackIn_129_0;
                    stackOut_129_1 = 1;
                    stackIn_131_0 = stackOut_129_0;
                    stackIn_131_1 = stackOut_129_1;
                    break L82;
                  }
                }
                ((gna) (Object) stackIn_131_0).field_t = stackIn_131_1 != 0;
                var6++;
                continue L29;
              }
            } else {
              L83: {
                stackOut_123_0 = (gna) var28;
                stackIn_125_0 = stackOut_123_0;
                stackIn_124_0 = stackOut_123_0;
                if ((var6 & param1.field_Lb) == -1) {
                  stackOut_125_0 = (gna) (Object) stackIn_125_0;
                  stackOut_125_1 = 0;
                  stackIn_126_0 = stackOut_125_0;
                  stackIn_126_1 = stackOut_125_1;
                  break L83;
                } else {
                  stackOut_124_0 = (gna) (Object) stackIn_124_0;
                  stackOut_124_1 = 1;
                  stackIn_126_0 = stackOut_124_0;
                  stackIn_126_1 = stackOut_124_1;
                  break L83;
                }
              }
              ((gna) (Object) stackIn_126_0).field_t = stackIn_126_1 != 0;
              var6++;
              continue L29;
            }
          }
        }
    }

    final void a(ub param0, int param1) {
        if (param1 > -2) {
            return;
        }
        gj var4 = param0.field_o;
        gj var5 = var4;
        if (-38 != (var4.field_h.field_a[((wp) this).field_n][((wp) this).field_o].field_n ^ -1)) {
            param0.a(27799, (at) (Object) new iu(60, 128));
        } else {
            param0.a(27799, (at) (Object) new iu(8, 128));
        }
        param0.a(27799, (at) (Object) new fha((kj) (Object) new dw(var5, ((wp) this).field_n, ((wp) this).field_o)));
        this.a(param0, ((wp) this).field_o, ((wp) this).field_n, (byte) 83);
        this.a(param0, ((wp) this).field_o, -1 + ((wp) this).field_n, (byte) 83);
        this.a(param0, ((wp) this).field_o, ((wp) this).field_n - -1, (byte) 83);
        this.a(param0, ((wp) this).field_o - 1, ((wp) this).field_n, (byte) 83);
        this.a(param0, 1 + ((wp) this).field_o, ((wp) this).field_n, (byte) 83);
        this.a(false, var5.field_h);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[5];
    }
}
