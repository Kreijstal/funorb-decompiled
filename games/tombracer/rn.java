/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn implements pma {
    static int field_b;
    static float[] field_a;

    public final csa a(kh param0, int param1, la param2) {
        RuntimeException var4 = null;
        csa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 55) {
                break L1;
              } else {
                field_a = (float[]) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0, param2, (byte) -7, (csa) null);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("rn.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public rn() {
        dsa.field_a = new String[63];
        dsa.field_a[46] = "Rope Bridge, Horizontal";
        dsa.field_a[57] = "Fragile Block";
        dsa.field_a[59] = "Fixed Mirror";
        dsa.field_a[58] = "Boulder";
        dsa.field_a[7] = "Brazier";
        dsa.field_a[61] = "Maze: All Platforms";
        dsa.field_a[40] = "Plant, Grassy";
        dsa.field_a[28] = "Blade Shooter";
        dsa.field_a[13] = "Item: Key";
        dsa.field_a[42] = "Tracking Crusher";
        dsa.field_a[21] = "Door 4x1";
        dsa.field_a[48] = "Item: Revolver";
        dsa.field_a[22] = "Key Switch";
        dsa.field_a[5] = "Portal";
        dsa.field_a[45] = "Empty Doorway 4x1";
        dsa.field_a[47] = "Rope Bridge, Vertical";
        dsa.field_a[34] = "Track X Mount";
        dsa.field_a[9] = "Gas Trap";
        dsa.field_a[19] = "Pushable Mirror";
        dsa.field_a[30] = "Rotater Mount";
        dsa.field_a[24] = "Cauldron";
        dsa.field_a[15] = "Moving Wall";
        dsa.field_a[36] = "Simple Hover Mount";
        dsa.field_a[3] = "Pressure Switch 1x1";
        dsa.field_a[41] = "Plant, Flower";
        dsa.field_a[12] = "Item: Idol";
        dsa.field_a[17] = "Moving Platform";
        dsa.field_a[38] = "Plant, Green";
        dsa.field_a[32] = "Sweeper-180 Mount";
        dsa.field_a[18] = "Pillar";
        dsa.field_a[62] = "Wall Crusher";
        dsa.field_a[53] = "White Light Sensor";
        dsa.field_a[0] = "Pushable Block";
        dsa.field_a[23] = "Trip Beam";
        dsa.field_a[49] = "Pushable Block 2x2";
        dsa.field_a[25] = "Arrow Shooter";
        dsa.field_a[29] = "Wheeled Mount";
        dsa.field_a[31] = "Sweeper-90 Mount";
        dsa.field_a[52] = "White Light Shooter";
        dsa.field_a[51] = "Maze: Pushable Blocks";
        dsa.field_a[8] = "Moving Saw";
        dsa.field_a[4] = "Pressure Switch 2x2";
        dsa.field_a[44] = "Empty Doorway 3x1";
        dsa.field_a[33] = "Face Player Mount";
        dsa.field_a[55] = "Pressure Switch Y";
        dsa.field_a[2] = "Pit o' Doom";
        dsa.field_a[35] = "Track Y Mount";
        dsa.field_a[14] = "Skeleton";
        dsa.field_a[16] = "Platform";
        dsa.field_a[6] = "Torch";
        dsa.field_a[39] = "Plant, Red";
        dsa.field_a[37] = "Pushable Mount";
        dsa.field_a[1] = "Snake Pit";
        dsa.field_a[60] = "Hidden Platform";
        dsa.field_a[50] = "Maze: Platforms";
        dsa.field_a[20] = "Door 3x1";
        dsa.field_a[56] = "Invisible Touch Switch";
        dsa.field_a[54] = "Pressure Switch X";
        dsa.field_a[10] = "Item: Coin";
        dsa.field_a[26] = "Laser Shooter";
        dsa.field_a[11] = "Item: Coin Bag";
        dsa.field_a[43] = "Static Crusher";
        dsa.field_a[27] = "Flame Shooter";
    }

    public static void a(byte param0) {
        if (param0 >= -103) {
            rn.a(8);
        }
        field_a = null;
    }

    private final csa a(int param0, la param1, int param2) {
        csa stackIn_3_0 = null;
        si stackIn_102_0 = null;
        saa stackIn_104_0 = null;
        oma stackIn_106_0 = null;
        pw stackIn_108_0 = null;
        pw stackIn_110_0 = null;
        vka stackIn_112_0 = null;
        ve stackIn_114_0 = null;
        uea stackIn_116_0 = null;
        uk stackIn_118_0 = null;
        wqa stackIn_120_0 = null;
        bla stackIn_122_0 = null;
        aja stackIn_124_0 = null;
        gd stackIn_126_0 = null;
        tta stackIn_128_0 = null;
        lg stackIn_130_0 = null;
        tca stackIn_132_0 = null;
        ln stackIn_134_0 = null;
        ps stackIn_136_0 = null;
        m stackIn_138_0 = null;
        aw stackIn_140_0 = null;
        mh stackIn_142_0 = null;
        mh stackIn_144_0 = null;
        mj stackIn_146_0 = null;
        er stackIn_148_0 = null;
        bia stackIn_150_0 = null;
        wpa stackIn_152_0 = null;
        ih stackIn_154_0 = null;
        jh stackIn_156_0 = null;
        qta stackIn_158_0 = null;
        ipa stackIn_160_0 = null;
        sua stackIn_162_0 = null;
        ona stackIn_164_0 = null;
        ona stackIn_166_0 = null;
        kt stackIn_168_0 = null;
        wha stackIn_170_0 = null;
        wha stackIn_172_0 = null;
        jc stackIn_174_0 = null;
        md stackIn_176_0 = null;
        gw stackIn_178_0 = null;
        gw stackIn_180_0 = null;
        gw stackIn_182_0 = null;
        gw stackIn_184_0 = null;
        wta stackIn_186_0 = null;
        wfa stackIn_188_0 = null;
        mh stackIn_190_0 = null;
        mh stackIn_192_0 = null;
        lda stackIn_194_0 = null;
        lda stackIn_196_0 = null;
        df stackIn_198_0 = null;
        si stackIn_200_0 = null;
        aea stackIn_202_0 = null;
        uc stackIn_204_0 = null;
        tp stackIn_206_0 = null;
        jb stackIn_208_0 = null;
        pw stackIn_210_0 = null;
        pw stackIn_212_0 = null;
        nja stackIn_214_0 = null;
        si stackIn_216_0 = null;
        uka stackIn_218_0 = null;
        aw stackIn_220_0 = null;
        ln stackIn_222_0 = null;
        qi stackIn_224_0 = null;
        ga stackIn_226_0 = null;
        RuntimeException stackIn_230_0 = null;
        StringBuilder stackIn_230_1 = null;
        RuntimeException stackIn_231_0 = null;
        StringBuilder stackIn_231_1 = null;
        String stackIn_231_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == -29748) {
              var4_int = param2;
              if (-1 != (var4_int ^ -1)) {
                if ((var4_int ^ -1) != -2) {
                  if ((var4_int ^ -1) == -3) {
                    stackIn_106_0 = new oma(param1, param2);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (3 == var4_int) {
                      stackIn_108_0 = new pw(param1, param2);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if ((var4_int ^ -1) == -5) {
                        stackIn_110_0 = new pw(param1, param2);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (5 != var4_int) {
                          if (6 != var4_int) {
                            if (var4_int == 7) {
                              stackIn_116_0 = new uea(param1, param2);
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if ((var4_int ^ -1) != -9) {
                                if (-10 == (var4_int ^ -1)) {
                                  stackIn_120_0 = new wqa(param1, param2);
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  if (-11 == (var4_int ^ -1)) {
                                    stackIn_122_0 = new bla(param1, param2);
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  } else {
                                    if (-12 == (var4_int ^ -1)) {
                                      stackIn_124_0 = new aja(param1, param2);
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    } else {
                                      if (-13 != (var4_int ^ -1)) {
                                        if (var4_int != 13) {
                                          if (-15 != (var4_int ^ -1)) {
                                            if ((var4_int ^ -1) == -16) {
                                              stackIn_132_0 = new tca(param1, param2);
                                              decompiledRegionSelector0 = 16;
                                              break L0;
                                            } else {
                                              if ((var4_int ^ -1) != -17) {
                                                if ((var4_int ^ -1) != -18) {
                                                  if (var4_int == 18) {
                                                    stackIn_138_0 = new m(param1, param2);
                                                    decompiledRegionSelector0 = 19;
                                                    break L0;
                                                  } else {
                                                    if (19 != var4_int) {
                                                      if (-21 == (var4_int ^ -1)) {
                                                        stackIn_142_0 = new mh(param1, param2);
                                                        decompiledRegionSelector0 = 21;
                                                        break L0;
                                                      } else {
                                                        if (-22 == (var4_int ^ -1)) {
                                                          stackIn_144_0 = new mh(param1, param2);
                                                          decompiledRegionSelector0 = 22;
                                                          break L0;
                                                        } else {
                                                          if (22 == var4_int) {
                                                            stackIn_146_0 = new mj(param1, param2);
                                                            decompiledRegionSelector0 = 23;
                                                            break L0;
                                                          } else {
                                                            if (var4_int == 23) {
                                                              stackIn_148_0 = new er(param1, param2);
                                                              decompiledRegionSelector0 = 24;
                                                              break L0;
                                                            } else {
                                                              if (24 == var4_int) {
                                                                stackIn_150_0 = new bia(param1, param2);
                                                                decompiledRegionSelector0 = 25;
                                                                break L0;
                                                              } else {
                                                                if (25 != var4_int) {
                                                                  if ((var4_int ^ -1) != -27) {
                                                                    if (27 != var4_int) {
                                                                      if (-29 == (var4_int ^ -1)) {
                                                                        stackIn_158_0 = new qta(param1, param2);
                                                                        decompiledRegionSelector0 = 29;
                                                                        break L0;
                                                                      } else {
                                                                        if (29 != var4_int) {
                                                                          if ((var4_int ^ -1) != -31) {
                                                                            if (-32 != (var4_int ^ -1)) {
                                                                              if (32 == var4_int) {
                                                                                stackIn_166_0 = new ona(param1, param2);
                                                                                decompiledRegionSelector0 = 33;
                                                                                break L0;
                                                                              } else {
                                                                                if (var4_int == 33) {
                                                                                  stackIn_168_0 = new kt(param1, param2);
                                                                                  decompiledRegionSelector0 = 34;
                                                                                  break L0;
                                                                                } else {
                                                                                  if (var4_int != 34) {
                                                                                    if (35 != var4_int) {
                                                                                      if (var4_int == 36) {
                                                                                        stackIn_174_0 = new jc(param1, param2);
                                                                                        decompiledRegionSelector0 = 37;
                                                                                        break L0;
                                                                                      } else {
                                                                                        if ((var4_int ^ -1) != -38) {
                                                                                          if (var4_int != 38) {
                                                                                            if (39 != var4_int) {
                                                                                              if (-41 == (var4_int ^ -1)) {
                                                                                                stackIn_182_0 = new gw(param1, param2);
                                                                                                decompiledRegionSelector0 = 41;
                                                                                                break L0;
                                                                                              } else {
                                                                                                if (var4_int == 41) {
                                                                                                  stackIn_184_0 = new gw(param1, param2);
                                                                                                  decompiledRegionSelector0 = 42;
                                                                                                  break L0;
                                                                                                } else {
                                                                                                  if (var4_int != 42) {
                                                                                                    if (-44 == (var4_int ^ -1)) {
                                                                                                      stackIn_188_0 = new wfa(param1, param2);
                                                                                                      decompiledRegionSelector0 = 44;
                                                                                                      break L0;
                                                                                                    } else {
                                                                                                      if (-45 == (var4_int ^ -1)) {
                                                                                                        stackIn_190_0 = new mh(param1, param2);
                                                                                                        decompiledRegionSelector0 = 45;
                                                                                                        break L0;
                                                                                                      } else {
                                                                                                        if (var4_int == 45) {
                                                                                                          stackIn_192_0 = new mh(param1, param2);
                                                                                                          decompiledRegionSelector0 = 46;
                                                                                                          break L0;
                                                                                                        } else {
                                                                                                          if (-47 == (var4_int ^ -1)) {
                                                                                                            stackIn_194_0 = new lda(param1, param2);
                                                                                                            decompiledRegionSelector0 = 47;
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            if ((var4_int ^ -1) == -48) {
                                                                                                              stackIn_196_0 = new lda(param1, param2);
                                                                                                              decompiledRegionSelector0 = 48;
                                                                                                              break L0;
                                                                                                            } else {
                                                                                                              if (48 != var4_int) {
                                                                                                                if ((var4_int ^ -1) != -50) {
                                                                                                                  if ((var4_int ^ -1) != -51) {
                                                                                                                    if (var4_int != 51) {
                                                                                                                      if (var4_int == 52) {
                                                                                                                        stackIn_206_0 = new tp(param1, param2);
                                                                                                                        decompiledRegionSelector0 = 53;
                                                                                                                        break L0;
                                                                                                                      } else {
                                                                                                                        if (-54 != (var4_int ^ -1)) {
                                                                                                                          if (-55 == (var4_int ^ -1)) {
                                                                                                                            stackIn_210_0 = new pw(param1, param2);
                                                                                                                            decompiledRegionSelector0 = 55;
                                                                                                                            break L0;
                                                                                                                          } else {
                                                                                                                            if (55 == var4_int) {
                                                                                                                              stackIn_212_0 = new pw(param1, param2);
                                                                                                                              decompiledRegionSelector0 = 56;
                                                                                                                              break L0;
                                                                                                                            } else {
                                                                                                                              if (56 == var4_int) {
                                                                                                                                stackIn_214_0 = new nja(param1, param2);
                                                                                                                                decompiledRegionSelector0 = 57;
                                                                                                                                break L0;
                                                                                                                              } else {
                                                                                                                                if (-58 != (var4_int ^ -1)) {
                                                                                                                                  if (58 != var4_int) {
                                                                                                                                    if (59 != var4_int) {
                                                                                                                                      if (var4_int != 60) {
                                                                                                                                        if ((var4_int ^ -1) != -62) {
                                                                                                                                          if (-63 != (var4_int ^ -1)) {
                                                                                                                                            throw new IllegalStateException("Unrecognised component type: " + param2);
                                                                                                                                          } else {
                                                                                                                                            stackIn_226_0 = new ga(param1, param2);
                                                                                                                                            decompiledRegionSelector0 = 63;
                                                                                                                                            break L0;
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          stackIn_224_0 = new qi(param1, param2);
                                                                                                                                          decompiledRegionSelector0 = 62;
                                                                                                                                          break L0;
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        stackIn_222_0 = new ln(param1, param2);
                                                                                                                                        decompiledRegionSelector0 = 61;
                                                                                                                                        break L0;
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      stackIn_220_0 = new aw(param1, param2);
                                                                                                                                      decompiledRegionSelector0 = 60;
                                                                                                                                      break L0;
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    stackIn_218_0 = new uka(param1, param2);
                                                                                                                                    decompiledRegionSelector0 = 59;
                                                                                                                                    break L0;
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  stackIn_216_0 = new si(param1, param2);
                                                                                                                                  decompiledRegionSelector0 = 58;
                                                                                                                                  break L0;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          stackIn_208_0 = new jb(param1, param2);
                                                                                                                          decompiledRegionSelector0 = 54;
                                                                                                                          break L0;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      stackIn_204_0 = new uc(param1, param2);
                                                                                                                      decompiledRegionSelector0 = 52;
                                                                                                                      break L0;
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    stackIn_202_0 = new aea(param1, param2);
                                                                                                                    decompiledRegionSelector0 = 51;
                                                                                                                    break L0;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  stackIn_200_0 = new si(param1, param2);
                                                                                                                  decompiledRegionSelector0 = 50;
                                                                                                                  break L0;
                                                                                                                }
                                                                                                              } else {
                                                                                                                stackIn_198_0 = new df(param1, param2);
                                                                                                                decompiledRegionSelector0 = 49;
                                                                                                                break L0;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    stackIn_186_0 = new wta(param1, param2);
                                                                                                    decompiledRegionSelector0 = 43;
                                                                                                    break L0;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              stackIn_180_0 = new gw(param1, param2);
                                                                                              decompiledRegionSelector0 = 40;
                                                                                              break L0;
                                                                                            }
                                                                                          } else {
                                                                                            stackIn_178_0 = new gw(param1, param2);
                                                                                            decompiledRegionSelector0 = 39;
                                                                                            break L0;
                                                                                          }
                                                                                        } else {
                                                                                          stackIn_176_0 = new md(param1, param2);
                                                                                          decompiledRegionSelector0 = 38;
                                                                                          break L0;
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      stackIn_172_0 = new wha(param1, param2);
                                                                                      decompiledRegionSelector0 = 36;
                                                                                      break L0;
                                                                                    }
                                                                                  } else {
                                                                                    stackIn_170_0 = new wha(param1, param2);
                                                                                    decompiledRegionSelector0 = 35;
                                                                                    break L0;
                                                                                  }
                                                                                }
                                                                              }
                                                                            } else {
                                                                              stackIn_164_0 = new ona(param1, param2);
                                                                              decompiledRegionSelector0 = 32;
                                                                              break L0;
                                                                            }
                                                                          } else {
                                                                            stackIn_162_0 = new sua(param1, param2);
                                                                            decompiledRegionSelector0 = 31;
                                                                            break L0;
                                                                          }
                                                                        } else {
                                                                          stackIn_160_0 = new ipa(param1, param2);
                                                                          decompiledRegionSelector0 = 30;
                                                                          break L0;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      stackIn_156_0 = new jh(param1, param2);
                                                                      decompiledRegionSelector0 = 28;
                                                                      break L0;
                                                                    }
                                                                  } else {
                                                                    stackIn_154_0 = new ih(param1, param2);
                                                                    decompiledRegionSelector0 = 27;
                                                                    break L0;
                                                                  }
                                                                } else {
                                                                  stackIn_152_0 = new wpa(param1, param2);
                                                                  decompiledRegionSelector0 = 26;
                                                                  break L0;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      stackIn_140_0 = new aw(param1, param2);
                                                      decompiledRegionSelector0 = 20;
                                                      break L0;
                                                    }
                                                  }
                                                } else {
                                                  stackIn_136_0 = new ps(param1, param2);
                                                  decompiledRegionSelector0 = 18;
                                                  break L0;
                                                }
                                              } else {
                                                stackIn_134_0 = new ln(param1, param2);
                                                decompiledRegionSelector0 = 17;
                                                break L0;
                                              }
                                            }
                                          } else {
                                            stackIn_130_0 = new lg(param1, param2);
                                            decompiledRegionSelector0 = 15;
                                            break L0;
                                          }
                                        } else {
                                          stackIn_128_0 = new tta(param1, param2);
                                          decompiledRegionSelector0 = 14;
                                          break L0;
                                        }
                                      } else {
                                        stackIn_126_0 = new gd(param1, param2);
                                        decompiledRegionSelector0 = 13;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackIn_118_0 = new uk(param1, param2);
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            }
                          } else {
                            stackIn_114_0 = new ve(param1, param2);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackIn_112_0 = new vka(param1, param2);
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  stackIn_104_0 = new saa(param1, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_102_0 = new si(param1, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (csa) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_230_0 = (RuntimeException) (var4);

            stackIn_230_1 = new StringBuilder().append("rn.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_231_0 = (RuntimeException) ((Object) stackIn_230_0);
              stackIn_231_1 = (StringBuilder) ((Object) stackIn_230_1);
              stackIn_231_2 = "null";
              break L1;
            } else {
              stackIn_231_0 = (RuntimeException) ((Object) stackIn_230_0);
              stackIn_231_1 = (StringBuilder) ((Object) stackIn_230_1);
              stackIn_231_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_231_0), stackIn_231_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (csa) ((Object) stackIn_102_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (csa) ((Object) stackIn_104_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (csa) ((Object) stackIn_106_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (csa) ((Object) stackIn_108_0);
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (csa) ((Object) stackIn_110_0);
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return (csa) ((Object) stackIn_112_0);
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return (csa) ((Object) stackIn_114_0);
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return (csa) ((Object) stackIn_116_0);
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return (csa) ((Object) stackIn_118_0);
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return (csa) ((Object) stackIn_120_0);
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return (csa) ((Object) stackIn_122_0);
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return (csa) ((Object) stackIn_124_0);
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return (csa) ((Object) stackIn_126_0);
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return (csa) ((Object) stackIn_128_0);
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return (csa) ((Object) stackIn_130_0);
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return (csa) ((Object) stackIn_132_0);
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return (csa) ((Object) stackIn_134_0);
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return (csa) ((Object) stackIn_136_0);
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return (csa) ((Object) stackIn_138_0);
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return (csa) ((Object) stackIn_140_0);
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return (csa) ((Object) stackIn_142_0);
                                                  } else {
                                                    if (decompiledRegionSelector0 == 22) {
                                                      return (csa) ((Object) stackIn_144_0);
                                                    } else {
                                                      if (decompiledRegionSelector0 == 23) {
                                                        return (csa) ((Object) stackIn_146_0);
                                                      } else {
                                                        if (decompiledRegionSelector0 == 24) {
                                                          return (csa) ((Object) stackIn_148_0);
                                                        } else {
                                                          if (decompiledRegionSelector0 == 25) {
                                                            return (csa) ((Object) stackIn_150_0);
                                                          } else {
                                                            if (decompiledRegionSelector0 == 26) {
                                                              return (csa) ((Object) stackIn_152_0);
                                                            } else {
                                                              if (decompiledRegionSelector0 == 27) {
                                                                return (csa) ((Object) stackIn_154_0);
                                                              } else {
                                                                if (decompiledRegionSelector0 == 28) {
                                                                  return (csa) ((Object) stackIn_156_0);
                                                                } else {
                                                                  if (decompiledRegionSelector0 == 29) {
                                                                    return (csa) ((Object) stackIn_158_0);
                                                                  } else {
                                                                    if (decompiledRegionSelector0 == 30) {
                                                                      return (csa) ((Object) stackIn_160_0);
                                                                    } else {
                                                                      if (decompiledRegionSelector0 == 31) {
                                                                        return (csa) ((Object) stackIn_162_0);
                                                                      } else {
                                                                        if (decompiledRegionSelector0 == 32) {
                                                                          return (csa) ((Object) stackIn_164_0);
                                                                        } else {
                                                                          if (decompiledRegionSelector0 == 33) {
                                                                            return (csa) ((Object) stackIn_166_0);
                                                                          } else {
                                                                            if (decompiledRegionSelector0 == 34) {
                                                                              return (csa) ((Object) stackIn_168_0);
                                                                            } else {
                                                                              if (decompiledRegionSelector0 == 35) {
                                                                                return (csa) ((Object) stackIn_170_0);
                                                                              } else {
                                                                                if (decompiledRegionSelector0 == 36) {
                                                                                  return (csa) ((Object) stackIn_172_0);
                                                                                } else {
                                                                                  if (decompiledRegionSelector0 == 37) {
                                                                                    return (csa) ((Object) stackIn_174_0);
                                                                                  } else {
                                                                                    if (decompiledRegionSelector0 == 38) {
                                                                                      return (csa) ((Object) stackIn_176_0);
                                                                                    } else {
                                                                                      if (decompiledRegionSelector0 == 39) {
                                                                                        return (csa) ((Object) stackIn_178_0);
                                                                                      } else {
                                                                                        if (decompiledRegionSelector0 == 40) {
                                                                                          return (csa) ((Object) stackIn_180_0);
                                                                                        } else {
                                                                                          if (decompiledRegionSelector0 == 41) {
                                                                                            return (csa) ((Object) stackIn_182_0);
                                                                                          } else {
                                                                                            if (decompiledRegionSelector0 == 42) {
                                                                                              return (csa) ((Object) stackIn_184_0);
                                                                                            } else {
                                                                                              if (decompiledRegionSelector0 == 43) {
                                                                                                return (csa) ((Object) stackIn_186_0);
                                                                                              } else {
                                                                                                if (decompiledRegionSelector0 == 44) {
                                                                                                  return (csa) ((Object) stackIn_188_0);
                                                                                                } else {
                                                                                                  if (decompiledRegionSelector0 == 45) {
                                                                                                    return (csa) ((Object) stackIn_190_0);
                                                                                                  } else {
                                                                                                    if (decompiledRegionSelector0 == 46) {
                                                                                                      return (csa) ((Object) stackIn_192_0);
                                                                                                    } else {
                                                                                                      if (decompiledRegionSelector0 == 47) {
                                                                                                        return (csa) ((Object) stackIn_194_0);
                                                                                                      } else {
                                                                                                        if (decompiledRegionSelector0 == 48) {
                                                                                                          return (csa) ((Object) stackIn_196_0);
                                                                                                        } else {
                                                                                                          if (decompiledRegionSelector0 == 49) {
                                                                                                            return (csa) ((Object) stackIn_198_0);
                                                                                                          } else {
                                                                                                            if (decompiledRegionSelector0 == 50) {
                                                                                                              return (csa) ((Object) stackIn_200_0);
                                                                                                            } else {
                                                                                                              if (decompiledRegionSelector0 == 51) {
                                                                                                                return (csa) ((Object) stackIn_202_0);
                                                                                                              } else {
                                                                                                                if (decompiledRegionSelector0 == 52) {
                                                                                                                  return (csa) ((Object) stackIn_204_0);
                                                                                                                } else {
                                                                                                                  if (decompiledRegionSelector0 == 53) {
                                                                                                                    return (csa) ((Object) stackIn_206_0);
                                                                                                                  } else {
                                                                                                                    if (decompiledRegionSelector0 == 54) {
                                                                                                                      return (csa) ((Object) stackIn_208_0);
                                                                                                                    } else {
                                                                                                                      if (decompiledRegionSelector0 == 55) {
                                                                                                                        return (csa) ((Object) stackIn_210_0);
                                                                                                                      } else {
                                                                                                                        if (decompiledRegionSelector0 == 56) {
                                                                                                                          return (csa) ((Object) stackIn_212_0);
                                                                                                                        } else {
                                                                                                                          if (decompiledRegionSelector0 == 57) {
                                                                                                                            return (csa) ((Object) stackIn_214_0);
                                                                                                                          } else {
                                                                                                                            if (decompiledRegionSelector0 == 58) {
                                                                                                                              return (csa) ((Object) stackIn_216_0);
                                                                                                                            } else {
                                                                                                                              if (decompiledRegionSelector0 == 59) {
                                                                                                                                return (csa) ((Object) stackIn_218_0);
                                                                                                                              } else {
                                                                                                                                if (decompiledRegionSelector0 == 60) {
                                                                                                                                  return (csa) ((Object) stackIn_220_0);
                                                                                                                                } else {
                                                                                                                                  if (decompiledRegionSelector0 == 61) {
                                                                                                                                    return (csa) ((Object) stackIn_222_0);
                                                                                                                                  } else {
                                                                                                                                    if (decompiledRegionSelector0 == 62) {
                                                                                                                                      return (csa) ((Object) stackIn_224_0);
                                                                                                                                    } else {
                                                                                                                                      return (csa) ((Object) stackIn_226_0);
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
            }
          }
        }
    }

    public final csa a(kh param0, la param1, byte param2, csa param3) {
        si stackIn_102_0 = null;
        saa stackIn_104_0 = null;
        oma stackIn_106_0 = null;
        pw stackIn_108_0 = null;
        pw stackIn_110_0 = null;
        vka stackIn_112_0 = null;
        ve stackIn_114_0 = null;
        uea stackIn_116_0 = null;
        uk stackIn_118_0 = null;
        wqa stackIn_120_0 = null;
        bla stackIn_122_0 = null;
        aja stackIn_124_0 = null;
        gd stackIn_126_0 = null;
        tta stackIn_128_0 = null;
        lg stackIn_130_0 = null;
        tca stackIn_132_0 = null;
        ln stackIn_134_0 = null;
        ps stackIn_136_0 = null;
        m stackIn_138_0 = null;
        aw stackIn_140_0 = null;
        mh stackIn_142_0 = null;
        mh stackIn_144_0 = null;
        mj stackIn_146_0 = null;
        er stackIn_148_0 = null;
        bia stackIn_150_0 = null;
        wpa stackIn_152_0 = null;
        ih stackIn_154_0 = null;
        jh stackIn_156_0 = null;
        qta stackIn_158_0 = null;
        ipa stackIn_160_0 = null;
        sua stackIn_162_0 = null;
        ona stackIn_164_0 = null;
        ona stackIn_166_0 = null;
        kt stackIn_168_0 = null;
        wha stackIn_170_0 = null;
        wha stackIn_172_0 = null;
        jc stackIn_174_0 = null;
        md stackIn_176_0 = null;
        gw stackIn_178_0 = null;
        gw stackIn_180_0 = null;
        gw stackIn_182_0 = null;
        gw stackIn_184_0 = null;
        wta stackIn_186_0 = null;
        wfa stackIn_188_0 = null;
        mh stackIn_190_0 = null;
        mh stackIn_192_0 = null;
        lda stackIn_194_0 = null;
        lda stackIn_196_0 = null;
        df stackIn_198_0 = null;
        si stackIn_200_0 = null;
        aea stackIn_202_0 = null;
        uc stackIn_204_0 = null;
        tp stackIn_206_0 = null;
        jb stackIn_208_0 = null;
        pw stackIn_210_0 = null;
        pw stackIn_212_0 = null;
        nja stackIn_214_0 = null;
        si stackIn_216_0 = null;
        uka stackIn_218_0 = null;
        aw stackIn_220_0 = null;
        ln stackIn_222_0 = null;
        qi stackIn_224_0 = null;
        ga stackIn_226_0 = null;
        RuntimeException stackIn_230_0 = null;
        StringBuilder stackIn_230_1 = null;
        RuntimeException stackIn_231_0 = null;
        StringBuilder stackIn_231_1 = null;
        String stackIn_231_2 = null;
        StringBuilder stackIn_233_1 = null;
        StringBuilder stackIn_234_1 = null;
        String stackIn_234_2 = null;
        StringBuilder stackIn_236_1 = null;
        StringBuilder stackIn_237_1 = null;
        String stackIn_237_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param0.b((byte) 44, 10);
              if (param2 == -7) {
                break L1;
              } else {
                field_a = (float[]) null;
                break L1;
              }
            }
            var6 = var5_int;
            if (0 != var6) {
              if (var6 == 1) {
                stackIn_104_0 = new saa(param1, var5_int, param0, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (2 != var6) {
                  if ((var6 ^ -1) == -4) {
                    stackIn_108_0 = new pw(param1, var5_int, param0, param3);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (4 == var6) {
                      stackIn_110_0 = new pw(param1, var5_int, param0, param3);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (var6 == 5) {
                        stackIn_112_0 = new vka(param1, var5_int, param0, param3);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (6 == var6) {
                          stackIn_114_0 = new ve(param1, var5_int, param0, param3);
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (-8 != (var6 ^ -1)) {
                            if ((var6 ^ -1) == -9) {
                              stackIn_118_0 = new uk(param1, var5_int, param0, param3);
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if (-10 == (var6 ^ -1)) {
                                stackIn_120_0 = new wqa(param1, var5_int, param0, param3);
                                decompiledRegionSelector0 = 9;
                                break L0;
                              } else {
                                if ((var6 ^ -1) == -11) {
                                  stackIn_122_0 = new bla(param1, var5_int, param0, param3);
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  if (-12 != (var6 ^ -1)) {
                                    if (var6 != 12) {
                                      if (var6 != 13) {
                                        if (var6 != 14) {
                                          if (15 == var6) {
                                            stackIn_132_0 = new tca(param1, var5_int, param0, param3);
                                            decompiledRegionSelector0 = 15;
                                            break L0;
                                          } else {
                                            if ((var6 ^ -1) != -17) {
                                              if (var6 != 17) {
                                                if (var6 != 18) {
                                                  if ((var6 ^ -1) == -20) {
                                                    stackIn_140_0 = new aw(param1, var5_int, param0, param3);
                                                    decompiledRegionSelector0 = 19;
                                                    break L0;
                                                  } else {
                                                    if ((var6 ^ -1) != -21) {
                                                      if (21 == var6) {
                                                        stackIn_144_0 = new mh(param1, var5_int, param0, param3);
                                                        decompiledRegionSelector0 = 21;
                                                        break L0;
                                                      } else {
                                                        if (var6 != 22) {
                                                          if (23 == var6) {
                                                            stackIn_148_0 = new er(param1, var5_int, param0, param3);
                                                            decompiledRegionSelector0 = 23;
                                                            break L0;
                                                          } else {
                                                            if (var6 == 24) {
                                                              stackIn_150_0 = new bia(param1, var5_int, param0, param3);
                                                              decompiledRegionSelector0 = 24;
                                                              break L0;
                                                            } else {
                                                              if ((var6 ^ -1) == -26) {
                                                                stackIn_152_0 = new wpa(param1, var5_int, param0, param3);
                                                                decompiledRegionSelector0 = 25;
                                                                break L0;
                                                              } else {
                                                                if ((var6 ^ -1) == -27) {
                                                                  stackIn_154_0 = new ih(param1, var5_int, param0, param3);
                                                                  decompiledRegionSelector0 = 26;
                                                                  break L0;
                                                                } else {
                                                                  if (var6 != 27) {
                                                                    if (28 == var6) {
                                                                      stackIn_158_0 = new qta(param1, var5_int, param0, param3);
                                                                      decompiledRegionSelector0 = 28;
                                                                      break L0;
                                                                    } else {
                                                                      if ((var6 ^ -1) != -30) {
                                                                        if (var6 == 30) {
                                                                          stackIn_162_0 = new sua(param1, var5_int, param0, param3);
                                                                          decompiledRegionSelector0 = 30;
                                                                          break L0;
                                                                        } else {
                                                                          if (31 == var6) {
                                                                            stackIn_164_0 = new ona(param1, var5_int, param0, param3);
                                                                            decompiledRegionSelector0 = 31;
                                                                            break L0;
                                                                          } else {
                                                                            if (var6 == 32) {
                                                                              stackIn_166_0 = new ona(param1, var5_int, param0, param3);
                                                                              decompiledRegionSelector0 = 32;
                                                                              break L0;
                                                                            } else {
                                                                              if (var6 != 33) {
                                                                                if (var6 == 34) {
                                                                                  stackIn_170_0 = new wha(param1, var5_int, param0, param3);
                                                                                  decompiledRegionSelector0 = 34;
                                                                                  break L0;
                                                                                } else {
                                                                                  if ((var6 ^ -1) != -36) {
                                                                                    if (36 != var6) {
                                                                                      if (var6 != 37) {
                                                                                        if (-39 != (var6 ^ -1)) {
                                                                                          if ((var6 ^ -1) != -40) {
                                                                                            if (40 == var6) {
                                                                                              stackIn_182_0 = new gw(param1, var5_int, param0, param3);
                                                                                              decompiledRegionSelector0 = 40;
                                                                                              break L0;
                                                                                            } else {
                                                                                              if ((var6 ^ -1) != -42) {
                                                                                                if (var6 == 42) {
                                                                                                  stackIn_186_0 = new wta(param1, var5_int, param0, param3);
                                                                                                  decompiledRegionSelector0 = 42;
                                                                                                  break L0;
                                                                                                } else {
                                                                                                  if (-44 != (var6 ^ -1)) {
                                                                                                    if (var6 != 44) {
                                                                                                      if ((var6 ^ -1) != -46) {
                                                                                                        if (-47 != (var6 ^ -1)) {
                                                                                                          if ((var6 ^ -1) != -48) {
                                                                                                            if (var6 == 48) {
                                                                                                              stackIn_198_0 = new df(param1, var5_int, param0, param3);
                                                                                                              decompiledRegionSelector0 = 48;
                                                                                                              break L0;
                                                                                                            } else {
                                                                                                              if ((var6 ^ -1) != -50) {
                                                                                                                if (var6 == 50) {
                                                                                                                  stackIn_202_0 = new aea(param1, var5_int, param0, param3);
                                                                                                                  decompiledRegionSelector0 = 50;
                                                                                                                  break L0;
                                                                                                                } else {
                                                                                                                  if (-52 != (var6 ^ -1)) {
                                                                                                                    if (52 != var6) {
                                                                                                                      if ((var6 ^ -1) != -54) {
                                                                                                                        if (54 == var6) {
                                                                                                                          stackIn_210_0 = new pw(param1, var5_int, param0, param3);
                                                                                                                          decompiledRegionSelector0 = 54;
                                                                                                                          break L0;
                                                                                                                        } else {
                                                                                                                          if (var6 == 55) {
                                                                                                                            stackIn_212_0 = new pw(param1, var5_int, param0, param3);
                                                                                                                            decompiledRegionSelector0 = 55;
                                                                                                                            break L0;
                                                                                                                          } else {
                                                                                                                            if ((var6 ^ -1) != -57) {
                                                                                                                              if ((var6 ^ -1) == -58) {
                                                                                                                                stackIn_216_0 = new si(param1, var5_int, param0, param3);
                                                                                                                                decompiledRegionSelector0 = 57;
                                                                                                                                break L0;
                                                                                                                              } else {
                                                                                                                                if (58 != var6) {
                                                                                                                                  if (59 != var6) {
                                                                                                                                    if (-61 == (var6 ^ -1)) {
                                                                                                                                      stackIn_222_0 = new ln(param1, var5_int, param0, param3);
                                                                                                                                      decompiledRegionSelector0 = 60;
                                                                                                                                      break L0;
                                                                                                                                    } else {
                                                                                                                                      if ((var6 ^ -1) != -62) {
                                                                                                                                        if ((var6 ^ -1) != -63) {
                                                                                                                                          throw new IllegalStateException("Unrecognised component type: " + var5_int);
                                                                                                                                        } else {
                                                                                                                                          stackIn_226_0 = new ga(param1, var5_int, param0, param3);
                                                                                                                                          decompiledRegionSelector0 = 62;
                                                                                                                                          break L0;
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        stackIn_224_0 = new qi(param1, var5_int, param0, param3);
                                                                                                                                        decompiledRegionSelector0 = 61;
                                                                                                                                        break L0;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    stackIn_220_0 = new aw(param1, var5_int, param0, param3);
                                                                                                                                    decompiledRegionSelector0 = 59;
                                                                                                                                    break L0;
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  stackIn_218_0 = new uka(param1, var5_int, param0, param3);
                                                                                                                                  decompiledRegionSelector0 = 58;
                                                                                                                                  break L0;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              stackIn_214_0 = new nja(param1, var5_int, param0, param3);
                                                                                                                              decompiledRegionSelector0 = 56;
                                                                                                                              break L0;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        stackIn_208_0 = new jb(param1, var5_int, param0, param3);
                                                                                                                        decompiledRegionSelector0 = 53;
                                                                                                                        break L0;
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      stackIn_206_0 = new tp(param1, var5_int, param0, param3);
                                                                                                                      decompiledRegionSelector0 = 52;
                                                                                                                      break L0;
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    stackIn_204_0 = new uc(param1, var5_int, param0, param3);
                                                                                                                    decompiledRegionSelector0 = 51;
                                                                                                                    break L0;
                                                                                                                  }
                                                                                                                }
                                                                                                              } else {
                                                                                                                stackIn_200_0 = new si(param1, var5_int, param0, param3);
                                                                                                                decompiledRegionSelector0 = 49;
                                                                                                                break L0;
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            stackIn_196_0 = new lda(param1, var5_int, param0, param3);
                                                                                                            decompiledRegionSelector0 = 47;
                                                                                                            break L0;
                                                                                                          }
                                                                                                        } else {
                                                                                                          stackIn_194_0 = new lda(param1, var5_int, param0, param3);
                                                                                                          decompiledRegionSelector0 = 46;
                                                                                                          break L0;
                                                                                                        }
                                                                                                      } else {
                                                                                                        stackIn_192_0 = new mh(param1, var5_int, param0, param3);
                                                                                                        decompiledRegionSelector0 = 45;
                                                                                                        break L0;
                                                                                                      }
                                                                                                    } else {
                                                                                                      stackIn_190_0 = new mh(param1, var5_int, param0, param3);
                                                                                                      decompiledRegionSelector0 = 44;
                                                                                                      break L0;
                                                                                                    }
                                                                                                  } else {
                                                                                                    stackIn_188_0 = new wfa(param1, var5_int, param0, param3);
                                                                                                    decompiledRegionSelector0 = 43;
                                                                                                    break L0;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                stackIn_184_0 = new gw(param1, var5_int, param0, param3);
                                                                                                decompiledRegionSelector0 = 41;
                                                                                                break L0;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            stackIn_180_0 = new gw(param1, var5_int, param0, param3);
                                                                                            decompiledRegionSelector0 = 39;
                                                                                            break L0;
                                                                                          }
                                                                                        } else {
                                                                                          stackIn_178_0 = new gw(param1, var5_int, param0, param3);
                                                                                          decompiledRegionSelector0 = 38;
                                                                                          break L0;
                                                                                        }
                                                                                      } else {
                                                                                        stackIn_176_0 = new md(param1, var5_int, param0, param3);
                                                                                        decompiledRegionSelector0 = 37;
                                                                                        break L0;
                                                                                      }
                                                                                    } else {
                                                                                      stackIn_174_0 = new jc(param1, var5_int, param0, param3);
                                                                                      decompiledRegionSelector0 = 36;
                                                                                      break L0;
                                                                                    }
                                                                                  } else {
                                                                                    stackIn_172_0 = new wha(param1, var5_int, param0, param3);
                                                                                    decompiledRegionSelector0 = 35;
                                                                                    break L0;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                stackIn_168_0 = new kt(param1, var5_int, param0, param3);
                                                                                decompiledRegionSelector0 = 33;
                                                                                break L0;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        stackIn_160_0 = new ipa(param1, var5_int, param0, param3);
                                                                        decompiledRegionSelector0 = 29;
                                                                        break L0;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    stackIn_156_0 = new jh(param1, var5_int, param0, param3);
                                                                    decompiledRegionSelector0 = 27;
                                                                    break L0;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          stackIn_146_0 = new mj(param1, var5_int, param0, param3);
                                                          decompiledRegionSelector0 = 22;
                                                          break L0;
                                                        }
                                                      }
                                                    } else {
                                                      stackIn_142_0 = new mh(param1, var5_int, param0, param3);
                                                      decompiledRegionSelector0 = 20;
                                                      break L0;
                                                    }
                                                  }
                                                } else {
                                                  stackIn_138_0 = new m(param1, var5_int, param0, param3);
                                                  decompiledRegionSelector0 = 18;
                                                  break L0;
                                                }
                                              } else {
                                                stackIn_136_0 = new ps(param1, var5_int, param0, param3);
                                                decompiledRegionSelector0 = 17;
                                                break L0;
                                              }
                                            } else {
                                              stackIn_134_0 = new ln(param1, var5_int, param0, param3);
                                              decompiledRegionSelector0 = 16;
                                              break L0;
                                            }
                                          }
                                        } else {
                                          stackIn_130_0 = new lg(param1, var5_int, param0, param3);
                                          decompiledRegionSelector0 = 14;
                                          break L0;
                                        }
                                      } else {
                                        stackIn_128_0 = new tta(param1, var5_int, param0, param3);
                                        decompiledRegionSelector0 = 13;
                                        break L0;
                                      }
                                    } else {
                                      stackIn_126_0 = new gd(param1, var5_int, param0, param3);
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    }
                                  } else {
                                    stackIn_124_0 = new aja(param1, var5_int, param0, param3);
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  }
                                }
                              }
                            }
                          } else {
                            stackIn_116_0 = new uea(param1, var5_int, param0, param3);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                } else {
                  stackIn_106_0 = new oma(param1, var5_int, param0, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_102_0 = new si(param1, var5_int, param0, param3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_230_0 = (RuntimeException) (var5);

            stackIn_230_1 = new StringBuilder().append("rn.A(");

            if (param0 == null) {
              stackIn_231_0 = (RuntimeException) ((Object) stackIn_230_0);
              stackIn_231_1 = (StringBuilder) ((Object) stackIn_230_1);
              stackIn_231_2 = "null";
              break L2;
            } else {
              stackIn_231_0 = (RuntimeException) ((Object) stackIn_230_0);
              stackIn_231_1 = (StringBuilder) ((Object) stackIn_230_1);
              stackIn_231_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_233_1 = ((StringBuilder) (Object) stackIn_231_1).append(stackIn_231_2).append(',');

            if (param1 == null) {
              stackIn_231_0 = (RuntimeException) ((Object) stackIn_231_0);
              stackIn_234_1 = (StringBuilder) ((Object) stackIn_233_1);
              stackIn_234_2 = "null";
              break L3;
            } else {
              stackIn_231_0 = (RuntimeException) ((Object) stackIn_231_0);
              stackIn_234_1 = (StringBuilder) ((Object) stackIn_233_1);
              stackIn_234_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_236_1 = ((StringBuilder) (Object) stackIn_234_1).append(stackIn_234_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_231_0 = (RuntimeException) ((Object) stackIn_231_0);
              stackIn_237_1 = (StringBuilder) ((Object) stackIn_236_1);
              stackIn_237_2 = "null";
              break L4;
            } else {
              stackIn_231_0 = (RuntimeException) ((Object) stackIn_231_0);
              stackIn_237_1 = (StringBuilder) ((Object) stackIn_236_1);
              stackIn_237_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_231_0), stackIn_237_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (csa) ((Object) stackIn_102_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (csa) ((Object) stackIn_104_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (csa) ((Object) stackIn_106_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (csa) ((Object) stackIn_108_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (csa) ((Object) stackIn_110_0);
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (csa) ((Object) stackIn_112_0);
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return (csa) ((Object) stackIn_114_0);
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return (csa) ((Object) stackIn_116_0);
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return (csa) ((Object) stackIn_118_0);
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return (csa) ((Object) stackIn_120_0);
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return (csa) ((Object) stackIn_122_0);
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return (csa) ((Object) stackIn_124_0);
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return (csa) ((Object) stackIn_126_0);
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return (csa) ((Object) stackIn_128_0);
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return (csa) ((Object) stackIn_130_0);
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return (csa) ((Object) stackIn_132_0);
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return (csa) ((Object) stackIn_134_0);
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return (csa) ((Object) stackIn_136_0);
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return (csa) ((Object) stackIn_138_0);
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return (csa) ((Object) stackIn_140_0);
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return (csa) ((Object) stackIn_142_0);
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return (csa) ((Object) stackIn_144_0);
                                                  } else {
                                                    if (decompiledRegionSelector0 == 22) {
                                                      return (csa) ((Object) stackIn_146_0);
                                                    } else {
                                                      if (decompiledRegionSelector0 == 23) {
                                                        return (csa) ((Object) stackIn_148_0);
                                                      } else {
                                                        if (decompiledRegionSelector0 == 24) {
                                                          return (csa) ((Object) stackIn_150_0);
                                                        } else {
                                                          if (decompiledRegionSelector0 == 25) {
                                                            return (csa) ((Object) stackIn_152_0);
                                                          } else {
                                                            if (decompiledRegionSelector0 == 26) {
                                                              return (csa) ((Object) stackIn_154_0);
                                                            } else {
                                                              if (decompiledRegionSelector0 == 27) {
                                                                return (csa) ((Object) stackIn_156_0);
                                                              } else {
                                                                if (decompiledRegionSelector0 == 28) {
                                                                  return (csa) ((Object) stackIn_158_0);
                                                                } else {
                                                                  if (decompiledRegionSelector0 == 29) {
                                                                    return (csa) ((Object) stackIn_160_0);
                                                                  } else {
                                                                    if (decompiledRegionSelector0 == 30) {
                                                                      return (csa) ((Object) stackIn_162_0);
                                                                    } else {
                                                                      if (decompiledRegionSelector0 == 31) {
                                                                        return (csa) ((Object) stackIn_164_0);
                                                                      } else {
                                                                        if (decompiledRegionSelector0 == 32) {
                                                                          return (csa) ((Object) stackIn_166_0);
                                                                        } else {
                                                                          if (decompiledRegionSelector0 == 33) {
                                                                            return (csa) ((Object) stackIn_168_0);
                                                                          } else {
                                                                            if (decompiledRegionSelector0 == 34) {
                                                                              return (csa) ((Object) stackIn_170_0);
                                                                            } else {
                                                                              if (decompiledRegionSelector0 == 35) {
                                                                                return (csa) ((Object) stackIn_172_0);
                                                                              } else {
                                                                                if (decompiledRegionSelector0 == 36) {
                                                                                  return (csa) ((Object) stackIn_174_0);
                                                                                } else {
                                                                                  if (decompiledRegionSelector0 == 37) {
                                                                                    return (csa) ((Object) stackIn_176_0);
                                                                                  } else {
                                                                                    if (decompiledRegionSelector0 == 38) {
                                                                                      return (csa) ((Object) stackIn_178_0);
                                                                                    } else {
                                                                                      if (decompiledRegionSelector0 == 39) {
                                                                                        return (csa) ((Object) stackIn_180_0);
                                                                                      } else {
                                                                                        if (decompiledRegionSelector0 == 40) {
                                                                                          return (csa) ((Object) stackIn_182_0);
                                                                                        } else {
                                                                                          if (decompiledRegionSelector0 == 41) {
                                                                                            return (csa) ((Object) stackIn_184_0);
                                                                                          } else {
                                                                                            if (decompiledRegionSelector0 == 42) {
                                                                                              return (csa) ((Object) stackIn_186_0);
                                                                                            } else {
                                                                                              if (decompiledRegionSelector0 == 43) {
                                                                                                return (csa) ((Object) stackIn_188_0);
                                                                                              } else {
                                                                                                if (decompiledRegionSelector0 == 44) {
                                                                                                  return (csa) ((Object) stackIn_190_0);
                                                                                                } else {
                                                                                                  if (decompiledRegionSelector0 == 45) {
                                                                                                    return (csa) ((Object) stackIn_192_0);
                                                                                                  } else {
                                                                                                    if (decompiledRegionSelector0 == 46) {
                                                                                                      return (csa) ((Object) stackIn_194_0);
                                                                                                    } else {
                                                                                                      if (decompiledRegionSelector0 == 47) {
                                                                                                        return (csa) ((Object) stackIn_196_0);
                                                                                                      } else {
                                                                                                        if (decompiledRegionSelector0 == 48) {
                                                                                                          return (csa) ((Object) stackIn_198_0);
                                                                                                        } else {
                                                                                                          if (decompiledRegionSelector0 == 49) {
                                                                                                            return (csa) ((Object) stackIn_200_0);
                                                                                                          } else {
                                                                                                            if (decompiledRegionSelector0 == 50) {
                                                                                                              return (csa) ((Object) stackIn_202_0);
                                                                                                            } else {
                                                                                                              if (decompiledRegionSelector0 == 51) {
                                                                                                                return (csa) ((Object) stackIn_204_0);
                                                                                                              } else {
                                                                                                                if (decompiledRegionSelector0 == 52) {
                                                                                                                  return (csa) ((Object) stackIn_206_0);
                                                                                                                } else {
                                                                                                                  if (decompiledRegionSelector0 == 53) {
                                                                                                                    return (csa) ((Object) stackIn_208_0);
                                                                                                                  } else {
                                                                                                                    if (decompiledRegionSelector0 == 54) {
                                                                                                                      return (csa) ((Object) stackIn_210_0);
                                                                                                                    } else {
                                                                                                                      if (decompiledRegionSelector0 == 55) {
                                                                                                                        return (csa) ((Object) stackIn_212_0);
                                                                                                                      } else {
                                                                                                                        if (decompiledRegionSelector0 == 56) {
                                                                                                                          return (csa) ((Object) stackIn_214_0);
                                                                                                                        } else {
                                                                                                                          if (decompiledRegionSelector0 == 57) {
                                                                                                                            return (csa) ((Object) stackIn_216_0);
                                                                                                                          } else {
                                                                                                                            if (decompiledRegionSelector0 == 58) {
                                                                                                                              return (csa) ((Object) stackIn_218_0);
                                                                                                                            } else {
                                                                                                                              if (decompiledRegionSelector0 == 59) {
                                                                                                                                return (csa) ((Object) stackIn_220_0);
                                                                                                                              } else {
                                                                                                                                if (decompiledRegionSelector0 == 60) {
                                                                                                                                  return (csa) ((Object) stackIn_222_0);
                                                                                                                                } else {
                                                                                                                                  if (decompiledRegionSelector0 == 61) {
                                                                                                                                    return (csa) ((Object) stackIn_224_0);
                                                                                                                                  } else {
                                                                                                                                    return (csa) ((Object) stackIn_226_0);
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
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 != 27) {
            field_b = 58;
        }
        return oea.field_i != null ? true : false;
    }

    public final csa a(la param0, byte param1) {
        RuntimeException var3 = null;
        csa stackIn_2_0 = null;
        csa stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 109) {
              stackIn_4_0 = this.a(-29748, param0, 14);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (csa) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("rn.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(csa param0, int param1, kh param2) {
        try {
            param2.a((byte) -127, param0.r(12), 10);
            param0.a(false, param2);
            if (param1 != -16097) {
                field_a = (float[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 0;
        field_a = new float[2];
    }
}
