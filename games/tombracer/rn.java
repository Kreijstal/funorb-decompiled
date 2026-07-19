/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn implements pma {
    static int field_b;
    static float[] field_a;

    public final csa a(kh param0, int param1, la param2) {
        RuntimeException var4 = null;
        csa stackIn_3_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        csa stackOut_2_0 = null;
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
            stackOut_2_0 = this.a(param0, param2, (byte) -7, (csa) null);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("rn.D(");
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
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
        boolean discarded$0 = false;
        if (param0 >= -103) {
            discarded$0 = rn.a(8);
        }
        field_a = null;
    }

    private final csa a(int param0, la param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        csa stackIn_3_0 = null;
        si stackIn_136_0 = null;
        saa stackIn_138_0 = null;
        oma stackIn_140_0 = null;
        pw stackIn_142_0 = null;
        pw stackIn_144_0 = null;
        vka stackIn_146_0 = null;
        ve stackIn_148_0 = null;
        uea stackIn_150_0 = null;
        uk stackIn_152_0 = null;
        wqa stackIn_154_0 = null;
        bla stackIn_156_0 = null;
        aja stackIn_158_0 = null;
        gd stackIn_160_0 = null;
        tta stackIn_162_0 = null;
        lg stackIn_164_0 = null;
        tca stackIn_166_0 = null;
        ln stackIn_168_0 = null;
        ps stackIn_170_0 = null;
        m stackIn_172_0 = null;
        aw stackIn_174_0 = null;
        mh stackIn_176_0 = null;
        mh stackIn_178_0 = null;
        mj stackIn_180_0 = null;
        er stackIn_182_0 = null;
        bia stackIn_184_0 = null;
        wpa stackIn_186_0 = null;
        ih stackIn_188_0 = null;
        jh stackIn_190_0 = null;
        qta stackIn_192_0 = null;
        ipa stackIn_194_0 = null;
        sua stackIn_196_0 = null;
        ona stackIn_198_0 = null;
        ona stackIn_200_0 = null;
        kt stackIn_202_0 = null;
        wha stackIn_204_0 = null;
        wha stackIn_206_0 = null;
        jc stackIn_208_0 = null;
        md stackIn_210_0 = null;
        gw stackIn_212_0 = null;
        gw stackIn_214_0 = null;
        gw stackIn_216_0 = null;
        gw stackIn_218_0 = null;
        wta stackIn_220_0 = null;
        wfa stackIn_222_0 = null;
        mh stackIn_224_0 = null;
        mh stackIn_226_0 = null;
        lda stackIn_228_0 = null;
        lda stackIn_230_0 = null;
        df stackIn_232_0 = null;
        si stackIn_234_0 = null;
        aea stackIn_236_0 = null;
        uc stackIn_238_0 = null;
        tp stackIn_240_0 = null;
        jb stackIn_242_0 = null;
        pw stackIn_244_0 = null;
        pw stackIn_246_0 = null;
        nja stackIn_248_0 = null;
        si stackIn_250_0 = null;
        uka stackIn_252_0 = null;
        aw stackIn_254_0 = null;
        ln stackIn_256_0 = null;
        qi stackIn_258_0 = null;
        ga stackIn_260_0 = null;
        RuntimeException stackIn_263_0 = null;
        StringBuilder stackIn_263_1 = null;
        RuntimeException stackIn_264_0 = null;
        StringBuilder stackIn_264_1 = null;
        RuntimeException stackIn_265_0 = null;
        StringBuilder stackIn_265_1 = null;
        String stackIn_265_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        saa stackOut_137_0 = null;
        oma stackOut_139_0 = null;
        pw stackOut_141_0 = null;
        pw stackOut_143_0 = null;
        vka stackOut_145_0 = null;
        ve stackOut_147_0 = null;
        uea stackOut_149_0 = null;
        uk stackOut_151_0 = null;
        wqa stackOut_153_0 = null;
        bla stackOut_155_0 = null;
        aja stackOut_157_0 = null;
        gd stackOut_159_0 = null;
        tta stackOut_161_0 = null;
        lg stackOut_163_0 = null;
        tca stackOut_165_0 = null;
        ln stackOut_167_0 = null;
        ps stackOut_169_0 = null;
        m stackOut_171_0 = null;
        aw stackOut_173_0 = null;
        mh stackOut_175_0 = null;
        mh stackOut_177_0 = null;
        mj stackOut_179_0 = null;
        er stackOut_181_0 = null;
        bia stackOut_183_0 = null;
        wpa stackOut_185_0 = null;
        ih stackOut_187_0 = null;
        jh stackOut_189_0 = null;
        qta stackOut_191_0 = null;
        ipa stackOut_193_0 = null;
        sua stackOut_195_0 = null;
        ona stackOut_197_0 = null;
        ona stackOut_199_0 = null;
        kt stackOut_201_0 = null;
        wha stackOut_203_0 = null;
        wha stackOut_205_0 = null;
        jc stackOut_207_0 = null;
        md stackOut_209_0 = null;
        gw stackOut_211_0 = null;
        gw stackOut_213_0 = null;
        gw stackOut_215_0 = null;
        gw stackOut_217_0 = null;
        wta stackOut_219_0 = null;
        wfa stackOut_221_0 = null;
        mh stackOut_223_0 = null;
        mh stackOut_225_0 = null;
        lda stackOut_227_0 = null;
        lda stackOut_229_0 = null;
        df stackOut_231_0 = null;
        si stackOut_233_0 = null;
        aea stackOut_235_0 = null;
        uc stackOut_237_0 = null;
        tp stackOut_239_0 = null;
        jb stackOut_241_0 = null;
        pw stackOut_243_0 = null;
        pw stackOut_245_0 = null;
        nja stackOut_247_0 = null;
        si stackOut_249_0 = null;
        uka stackOut_251_0 = null;
        aw stackOut_253_0 = null;
        ln stackOut_255_0 = null;
        qi stackOut_257_0 = null;
        ga stackOut_259_0 = null;
        si stackOut_135_0 = null;
        csa stackOut_2_0 = null;
        RuntimeException stackOut_262_0 = null;
        StringBuilder stackOut_262_1 = null;
        RuntimeException stackOut_264_0 = null;
        StringBuilder stackOut_264_1 = null;
        String stackOut_264_2 = null;
        RuntimeException stackOut_263_0 = null;
        StringBuilder stackOut_263_1 = null;
        String stackOut_263_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == -29748) {
              L1: {
                L2: {
                  var4_int = param2;
                  if (-1 != (var4_int ^ -1)) {
                    break L2;
                  } else {
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if ((var4_int ^ -1) != -2) {
                    break L3;
                  } else {
                    if (var5 == 0) {
                      stackOut_137_0 = new saa(param1, param2);
                      stackIn_138_0 = stackOut_137_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                if ((var4_int ^ -1) == -3) {
                  stackOut_139_0 = new oma(param1, param2);
                  stackIn_140_0 = stackOut_139_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (3 == var4_int) {
                    stackOut_141_0 = new pw(param1, param2);
                    stackIn_142_0 = stackOut_141_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if ((var4_int ^ -1) == -5) {
                      stackOut_143_0 = new pw(param1, param2);
                      stackIn_144_0 = stackOut_143_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      L4: {
                        if (5 != var4_int) {
                          break L4;
                        } else {
                          if (var5 == 0) {
                            stackOut_145_0 = new vka(param1, param2);
                            stackIn_146_0 = stackOut_145_0;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (6 != var4_int) {
                          break L5;
                        } else {
                          if (var5 == 0) {
                            stackOut_147_0 = new ve(param1, param2);
                            stackIn_148_0 = stackOut_147_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (var4_int == 7) {
                        stackOut_149_0 = new uea(param1, param2);
                        stackIn_150_0 = stackOut_149_0;
                        decompiledRegionSelector0 = 8;
                        break L0;
                      } else {
                        L6: {
                          if ((var4_int ^ -1) != -9) {
                            break L6;
                          } else {
                            if (var5 == 0) {
                              stackOut_151_0 = new uk(param1, param2);
                              stackIn_152_0 = stackOut_151_0;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (-10 == (var4_int ^ -1)) {
                          stackOut_153_0 = new wqa(param1, param2);
                          stackIn_154_0 = stackOut_153_0;
                          decompiledRegionSelector0 = 10;
                          break L0;
                        } else {
                          if (-11 == (var4_int ^ -1)) {
                            stackOut_155_0 = new bla(param1, param2);
                            stackIn_156_0 = stackOut_155_0;
                            decompiledRegionSelector0 = 11;
                            break L0;
                          } else {
                            if (-12 == (var4_int ^ -1)) {
                              stackOut_157_0 = new aja(param1, param2);
                              stackIn_158_0 = stackOut_157_0;
                              decompiledRegionSelector0 = 12;
                              break L0;
                            } else {
                              L7: {
                                if (-13 != (var4_int ^ -1)) {
                                  break L7;
                                } else {
                                  if (var5 == 0) {
                                    stackOut_159_0 = new gd(param1, param2);
                                    stackIn_160_0 = stackOut_159_0;
                                    decompiledRegionSelector0 = 13;
                                    break L0;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                if (var4_int != 13) {
                                  break L8;
                                } else {
                                  if (var5 == 0) {
                                    stackOut_161_0 = new tta(param1, param2);
                                    stackIn_162_0 = stackOut_161_0;
                                    decompiledRegionSelector0 = 14;
                                    break L0;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (-15 != (var4_int ^ -1)) {
                                  break L9;
                                } else {
                                  if (var5 == 0) {
                                    stackOut_163_0 = new lg(param1, param2);
                                    stackIn_164_0 = stackOut_163_0;
                                    decompiledRegionSelector0 = 15;
                                    break L0;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              if ((var4_int ^ -1) == -16) {
                                stackOut_165_0 = new tca(param1, param2);
                                stackIn_166_0 = stackOut_165_0;
                                decompiledRegionSelector0 = 16;
                                break L0;
                              } else {
                                L10: {
                                  if ((var4_int ^ -1) != -17) {
                                    break L10;
                                  } else {
                                    if (var5 == 0) {
                                      stackOut_167_0 = new ln(param1, param2);
                                      stackIn_168_0 = stackOut_167_0;
                                      decompiledRegionSelector0 = 17;
                                      break L0;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if ((var4_int ^ -1) != -18) {
                                    break L11;
                                  } else {
                                    if (var5 == 0) {
                                      stackOut_169_0 = new ps(param1, param2);
                                      stackIn_170_0 = stackOut_169_0;
                                      decompiledRegionSelector0 = 18;
                                      break L0;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                if (var4_int == 18) {
                                  stackOut_171_0 = new m(param1, param2);
                                  stackIn_172_0 = stackOut_171_0;
                                  decompiledRegionSelector0 = 19;
                                  break L0;
                                } else {
                                  L12: {
                                    if (19 != var4_int) {
                                      break L12;
                                    } else {
                                      if (var5 == 0) {
                                        stackOut_173_0 = new aw(param1, param2);
                                        stackIn_174_0 = stackOut_173_0;
                                        decompiledRegionSelector0 = 20;
                                        break L0;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  if (-21 == (var4_int ^ -1)) {
                                    stackOut_175_0 = new mh(param1, param2);
                                    stackIn_176_0 = stackOut_175_0;
                                    decompiledRegionSelector0 = 21;
                                    break L0;
                                  } else {
                                    if (-22 == (var4_int ^ -1)) {
                                      stackOut_177_0 = new mh(param1, param2);
                                      stackIn_178_0 = stackOut_177_0;
                                      decompiledRegionSelector0 = 22;
                                      break L0;
                                    } else {
                                      if (22 == var4_int) {
                                        stackOut_179_0 = new mj(param1, param2);
                                        stackIn_180_0 = stackOut_179_0;
                                        decompiledRegionSelector0 = 23;
                                        break L0;
                                      } else {
                                        if (var4_int == 23) {
                                          stackOut_181_0 = new er(param1, param2);
                                          stackIn_182_0 = stackOut_181_0;
                                          decompiledRegionSelector0 = 24;
                                          break L0;
                                        } else {
                                          if (24 == var4_int) {
                                            stackOut_183_0 = new bia(param1, param2);
                                            stackIn_184_0 = stackOut_183_0;
                                            decompiledRegionSelector0 = 25;
                                            break L0;
                                          } else {
                                            L13: {
                                              if (25 != var4_int) {
                                                break L13;
                                              } else {
                                                if (var5 == 0) {
                                                  stackOut_185_0 = new wpa(param1, param2);
                                                  stackIn_186_0 = stackOut_185_0;
                                                  decompiledRegionSelector0 = 26;
                                                  break L0;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                            }
                                            L14: {
                                              if ((var4_int ^ -1) != -27) {
                                                break L14;
                                              } else {
                                                if (var5 == 0) {
                                                  stackOut_187_0 = new ih(param1, param2);
                                                  stackIn_188_0 = stackOut_187_0;
                                                  decompiledRegionSelector0 = 27;
                                                  break L0;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                            L15: {
                                              if (27 != var4_int) {
                                                break L15;
                                              } else {
                                                if (var5 == 0) {
                                                  stackOut_189_0 = new jh(param1, param2);
                                                  stackIn_190_0 = stackOut_189_0;
                                                  decompiledRegionSelector0 = 28;
                                                  break L0;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            if (-29 == (var4_int ^ -1)) {
                                              stackOut_191_0 = new qta(param1, param2);
                                              stackIn_192_0 = stackOut_191_0;
                                              decompiledRegionSelector0 = 29;
                                              break L0;
                                            } else {
                                              L16: {
                                                if (29 != var4_int) {
                                                  break L16;
                                                } else {
                                                  if (var5 == 0) {
                                                    stackOut_193_0 = new ipa(param1, param2);
                                                    stackIn_194_0 = stackOut_193_0;
                                                    decompiledRegionSelector0 = 30;
                                                    break L0;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                              L17: {
                                                if ((var4_int ^ -1) != -31) {
                                                  break L17;
                                                } else {
                                                  if (var5 == 0) {
                                                    stackOut_195_0 = new sua(param1, param2);
                                                    stackIn_196_0 = stackOut_195_0;
                                                    decompiledRegionSelector0 = 31;
                                                    break L0;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                              }
                                              L18: {
                                                if (-32 != (var4_int ^ -1)) {
                                                  break L18;
                                                } else {
                                                  if (var5 == 0) {
                                                    stackOut_197_0 = new ona(param1, param2);
                                                    stackIn_198_0 = stackOut_197_0;
                                                    decompiledRegionSelector0 = 32;
                                                    break L0;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                              if (32 == var4_int) {
                                                stackOut_199_0 = new ona(param1, param2);
                                                stackIn_200_0 = stackOut_199_0;
                                                decompiledRegionSelector0 = 33;
                                                break L0;
                                              } else {
                                                if (var4_int == 33) {
                                                  stackOut_201_0 = new kt(param1, param2);
                                                  stackIn_202_0 = stackOut_201_0;
                                                  decompiledRegionSelector0 = 34;
                                                  break L0;
                                                } else {
                                                  L19: {
                                                    if (var4_int != 34) {
                                                      break L19;
                                                    } else {
                                                      if (var5 == 0) {
                                                        stackOut_203_0 = new wha(param1, param2);
                                                        stackIn_204_0 = stackOut_203_0;
                                                        decompiledRegionSelector0 = 35;
                                                        break L0;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                  L20: {
                                                    if (35 != var4_int) {
                                                      break L20;
                                                    } else {
                                                      if (var5 == 0) {
                                                        stackOut_205_0 = new wha(param1, param2);
                                                        stackIn_206_0 = stackOut_205_0;
                                                        decompiledRegionSelector0 = 36;
                                                        break L0;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  if (var4_int == 36) {
                                                    stackOut_207_0 = new jc(param1, param2);
                                                    stackIn_208_0 = stackOut_207_0;
                                                    decompiledRegionSelector0 = 37;
                                                    break L0;
                                                  } else {
                                                    L21: {
                                                      if ((var4_int ^ -1) != -38) {
                                                        break L21;
                                                      } else {
                                                        if (var5 == 0) {
                                                          stackOut_209_0 = new md(param1, param2);
                                                          stackIn_210_0 = stackOut_209_0;
                                                          decompiledRegionSelector0 = 38;
                                                          break L0;
                                                        } else {
                                                          break L21;
                                                        }
                                                      }
                                                    }
                                                    L22: {
                                                      if (var4_int != 38) {
                                                        break L22;
                                                      } else {
                                                        if (var5 == 0) {
                                                          stackOut_211_0 = new gw(param1, param2);
                                                          stackIn_212_0 = stackOut_211_0;
                                                          decompiledRegionSelector0 = 39;
                                                          break L0;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    }
                                                    L23: {
                                                      if (39 != var4_int) {
                                                        break L23;
                                                      } else {
                                                        if (var5 == 0) {
                                                          stackOut_213_0 = new gw(param1, param2);
                                                          stackIn_214_0 = stackOut_213_0;
                                                          decompiledRegionSelector0 = 40;
                                                          break L0;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                    if (-41 == (var4_int ^ -1)) {
                                                      stackOut_215_0 = new gw(param1, param2);
                                                      stackIn_216_0 = stackOut_215_0;
                                                      decompiledRegionSelector0 = 41;
                                                      break L0;
                                                    } else {
                                                      if (var4_int == 41) {
                                                        stackOut_217_0 = new gw(param1, param2);
                                                        stackIn_218_0 = stackOut_217_0;
                                                        decompiledRegionSelector0 = 42;
                                                        break L0;
                                                      } else {
                                                        L24: {
                                                          if (var4_int != 42) {
                                                            break L24;
                                                          } else {
                                                            if (var5 == 0) {
                                                              stackOut_219_0 = new wta(param1, param2);
                                                              stackIn_220_0 = stackOut_219_0;
                                                              decompiledRegionSelector0 = 43;
                                                              break L0;
                                                            } else {
                                                              break L24;
                                                            }
                                                          }
                                                        }
                                                        if (-44 == (var4_int ^ -1)) {
                                                          stackOut_221_0 = new wfa(param1, param2);
                                                          stackIn_222_0 = stackOut_221_0;
                                                          decompiledRegionSelector0 = 44;
                                                          break L0;
                                                        } else {
                                                          if (-45 == (var4_int ^ -1)) {
                                                            stackOut_223_0 = new mh(param1, param2);
                                                            stackIn_224_0 = stackOut_223_0;
                                                            decompiledRegionSelector0 = 45;
                                                            break L0;
                                                          } else {
                                                            if (var4_int == 45) {
                                                              stackOut_225_0 = new mh(param1, param2);
                                                              stackIn_226_0 = stackOut_225_0;
                                                              decompiledRegionSelector0 = 46;
                                                              break L0;
                                                            } else {
                                                              if (-47 == (var4_int ^ -1)) {
                                                                stackOut_227_0 = new lda(param1, param2);
                                                                stackIn_228_0 = stackOut_227_0;
                                                                decompiledRegionSelector0 = 47;
                                                                break L0;
                                                              } else {
                                                                if ((var4_int ^ -1) == -48) {
                                                                  stackOut_229_0 = new lda(param1, param2);
                                                                  stackIn_230_0 = stackOut_229_0;
                                                                  decompiledRegionSelector0 = 48;
                                                                  break L0;
                                                                } else {
                                                                  L25: {
                                                                    if (48 != var4_int) {
                                                                      break L25;
                                                                    } else {
                                                                      if (var5 == 0) {
                                                                        stackOut_231_0 = new df(param1, param2);
                                                                        stackIn_232_0 = stackOut_231_0;
                                                                        decompiledRegionSelector0 = 49;
                                                                        break L0;
                                                                      } else {
                                                                        break L25;
                                                                      }
                                                                    }
                                                                  }
                                                                  L26: {
                                                                    if ((var4_int ^ -1) != -50) {
                                                                      break L26;
                                                                    } else {
                                                                      if (var5 == 0) {
                                                                        stackOut_233_0 = new si(param1, param2);
                                                                        stackIn_234_0 = stackOut_233_0;
                                                                        decompiledRegionSelector0 = 50;
                                                                        break L0;
                                                                      } else {
                                                                        break L26;
                                                                      }
                                                                    }
                                                                  }
                                                                  L27: {
                                                                    if ((var4_int ^ -1) != -51) {
                                                                      break L27;
                                                                    } else {
                                                                      if (var5 == 0) {
                                                                        stackOut_235_0 = new aea(param1, param2);
                                                                        stackIn_236_0 = stackOut_235_0;
                                                                        decompiledRegionSelector0 = 51;
                                                                        break L0;
                                                                      } else {
                                                                        break L27;
                                                                      }
                                                                    }
                                                                  }
                                                                  L28: {
                                                                    if (var4_int != 51) {
                                                                      break L28;
                                                                    } else {
                                                                      if (var5 == 0) {
                                                                        stackOut_237_0 = new uc(param1, param2);
                                                                        stackIn_238_0 = stackOut_237_0;
                                                                        decompiledRegionSelector0 = 52;
                                                                        break L0;
                                                                      } else {
                                                                        break L28;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (var4_int == 52) {
                                                                    stackOut_239_0 = new tp(param1, param2);
                                                                    stackIn_240_0 = stackOut_239_0;
                                                                    decompiledRegionSelector0 = 53;
                                                                    break L0;
                                                                  } else {
                                                                    L29: {
                                                                      if (-54 != (var4_int ^ -1)) {
                                                                        break L29;
                                                                      } else {
                                                                        if (var5 == 0) {
                                                                          stackOut_241_0 = new jb(param1, param2);
                                                                          stackIn_242_0 = stackOut_241_0;
                                                                          decompiledRegionSelector0 = 54;
                                                                          break L0;
                                                                        } else {
                                                                          break L29;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (-55 == (var4_int ^ -1)) {
                                                                      stackOut_243_0 = new pw(param1, param2);
                                                                      stackIn_244_0 = stackOut_243_0;
                                                                      decompiledRegionSelector0 = 55;
                                                                      break L0;
                                                                    } else {
                                                                      if (55 == var4_int) {
                                                                        stackOut_245_0 = new pw(param1, param2);
                                                                        stackIn_246_0 = stackOut_245_0;
                                                                        decompiledRegionSelector0 = 56;
                                                                        break L0;
                                                                      } else {
                                                                        if (56 == var4_int) {
                                                                          stackOut_247_0 = new nja(param1, param2);
                                                                          stackIn_248_0 = stackOut_247_0;
                                                                          decompiledRegionSelector0 = 57;
                                                                          break L0;
                                                                        } else {
                                                                          L30: {
                                                                            if (-58 != (var4_int ^ -1)) {
                                                                              break L30;
                                                                            } else {
                                                                              if (var5 == 0) {
                                                                                stackOut_249_0 = new si(param1, param2);
                                                                                stackIn_250_0 = stackOut_249_0;
                                                                                decompiledRegionSelector0 = 58;
                                                                                break L0;
                                                                              } else {
                                                                                break L30;
                                                                              }
                                                                            }
                                                                          }
                                                                          L31: {
                                                                            if (58 != var4_int) {
                                                                              break L31;
                                                                            } else {
                                                                              if (var5 == 0) {
                                                                                stackOut_251_0 = new uka(param1, param2);
                                                                                stackIn_252_0 = stackOut_251_0;
                                                                                decompiledRegionSelector0 = 59;
                                                                                break L0;
                                                                              } else {
                                                                                break L31;
                                                                              }
                                                                            }
                                                                          }
                                                                          L32: {
                                                                            if (59 != var4_int) {
                                                                              break L32;
                                                                            } else {
                                                                              if (var5 == 0) {
                                                                                stackOut_253_0 = new aw(param1, param2);
                                                                                stackIn_254_0 = stackOut_253_0;
                                                                                decompiledRegionSelector0 = 60;
                                                                                break L0;
                                                                              } else {
                                                                                break L32;
                                                                              }
                                                                            }
                                                                          }
                                                                          L33: {
                                                                            if (var4_int != 60) {
                                                                              break L33;
                                                                            } else {
                                                                              if (var5 == 0) {
                                                                                stackOut_255_0 = new ln(param1, param2);
                                                                                stackIn_256_0 = stackOut_255_0;
                                                                                decompiledRegionSelector0 = 61;
                                                                                break L0;
                                                                              } else {
                                                                                break L33;
                                                                              }
                                                                            }
                                                                          }
                                                                          L34: {
                                                                            if ((var4_int ^ -1) != -62) {
                                                                              break L34;
                                                                            } else {
                                                                              if (var5 == 0) {
                                                                                stackOut_257_0 = new qi(param1, param2);
                                                                                stackIn_258_0 = stackOut_257_0;
                                                                                decompiledRegionSelector0 = 62;
                                                                                break L0;
                                                                              } else {
                                                                                break L34;
                                                                              }
                                                                            }
                                                                          }
                                                                          if (-63 != (var4_int ^ -1)) {
                                                                            throw new IllegalStateException("Unrecognised component type: " + param2);
                                                                          } else {
                                                                            if (var5 == 0) {
                                                                              stackOut_259_0 = new ga(param1, param2);
                                                                              stackIn_260_0 = stackOut_259_0;
                                                                              decompiledRegionSelector0 = 63;
                                                                              break L0;
                                                                            } else {
                                                                              break L1;
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
              stackOut_135_0 = new si(param1, param2);
              stackIn_136_0 = stackOut_135_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = (csa) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var4 = decompiledCaughtException;
            stackOut_262_0 = (RuntimeException) (var4);
            stackOut_262_1 = new StringBuilder().append("rn.E(").append(param0).append(',');
            stackIn_264_0 = stackOut_262_0;
            stackIn_264_1 = stackOut_262_1;
            stackIn_263_0 = stackOut_262_0;
            stackIn_263_1 = stackOut_262_1;
            if (param1 == null) {
              stackOut_264_0 = (RuntimeException) ((Object) stackIn_264_0);
              stackOut_264_1 = (StringBuilder) ((Object) stackIn_264_1);
              stackOut_264_2 = "null";
              stackIn_265_0 = stackOut_264_0;
              stackIn_265_1 = stackOut_264_1;
              stackIn_265_2 = stackOut_264_2;
              break L35;
            } else {
              stackOut_263_0 = (RuntimeException) ((Object) stackIn_263_0);
              stackOut_263_1 = (StringBuilder) ((Object) stackIn_263_1);
              stackOut_263_2 = "{...}";
              stackIn_265_0 = stackOut_263_0;
              stackIn_265_1 = stackOut_263_1;
              stackIn_265_2 = stackOut_263_2;
              break L35;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_265_0), stackIn_265_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (csa) ((Object) stackIn_136_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (csa) ((Object) stackIn_138_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (csa) ((Object) stackIn_140_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (csa) ((Object) stackIn_142_0);
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (csa) ((Object) stackIn_144_0);
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return (csa) ((Object) stackIn_146_0);
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return (csa) ((Object) stackIn_148_0);
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return (csa) ((Object) stackIn_150_0);
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return (csa) ((Object) stackIn_152_0);
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return (csa) ((Object) stackIn_154_0);
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return (csa) ((Object) stackIn_156_0);
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return (csa) ((Object) stackIn_158_0);
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return (csa) ((Object) stackIn_160_0);
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return (csa) ((Object) stackIn_162_0);
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return (csa) ((Object) stackIn_164_0);
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return (csa) ((Object) stackIn_166_0);
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return (csa) ((Object) stackIn_168_0);
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return (csa) ((Object) stackIn_170_0);
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return (csa) ((Object) stackIn_172_0);
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return (csa) ((Object) stackIn_174_0);
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return (csa) ((Object) stackIn_176_0);
                                                  } else {
                                                    if (decompiledRegionSelector0 == 22) {
                                                      return (csa) ((Object) stackIn_178_0);
                                                    } else {
                                                      if (decompiledRegionSelector0 == 23) {
                                                        return (csa) ((Object) stackIn_180_0);
                                                      } else {
                                                        if (decompiledRegionSelector0 == 24) {
                                                          return (csa) ((Object) stackIn_182_0);
                                                        } else {
                                                          if (decompiledRegionSelector0 == 25) {
                                                            return (csa) ((Object) stackIn_184_0);
                                                          } else {
                                                            if (decompiledRegionSelector0 == 26) {
                                                              return (csa) ((Object) stackIn_186_0);
                                                            } else {
                                                              if (decompiledRegionSelector0 == 27) {
                                                                return (csa) ((Object) stackIn_188_0);
                                                              } else {
                                                                if (decompiledRegionSelector0 == 28) {
                                                                  return (csa) ((Object) stackIn_190_0);
                                                                } else {
                                                                  if (decompiledRegionSelector0 == 29) {
                                                                    return (csa) ((Object) stackIn_192_0);
                                                                  } else {
                                                                    if (decompiledRegionSelector0 == 30) {
                                                                      return (csa) ((Object) stackIn_194_0);
                                                                    } else {
                                                                      if (decompiledRegionSelector0 == 31) {
                                                                        return (csa) ((Object) stackIn_196_0);
                                                                      } else {
                                                                        if (decompiledRegionSelector0 == 32) {
                                                                          return (csa) ((Object) stackIn_198_0);
                                                                        } else {
                                                                          if (decompiledRegionSelector0 == 33) {
                                                                            return (csa) ((Object) stackIn_200_0);
                                                                          } else {
                                                                            if (decompiledRegionSelector0 == 34) {
                                                                              return (csa) ((Object) stackIn_202_0);
                                                                            } else {
                                                                              if (decompiledRegionSelector0 == 35) {
                                                                                return (csa) ((Object) stackIn_204_0);
                                                                              } else {
                                                                                if (decompiledRegionSelector0 == 36) {
                                                                                  return (csa) ((Object) stackIn_206_0);
                                                                                } else {
                                                                                  if (decompiledRegionSelector0 == 37) {
                                                                                    return (csa) ((Object) stackIn_208_0);
                                                                                  } else {
                                                                                    if (decompiledRegionSelector0 == 38) {
                                                                                      return (csa) ((Object) stackIn_210_0);
                                                                                    } else {
                                                                                      if (decompiledRegionSelector0 == 39) {
                                                                                        return (csa) ((Object) stackIn_212_0);
                                                                                      } else {
                                                                                        if (decompiledRegionSelector0 == 40) {
                                                                                          return (csa) ((Object) stackIn_214_0);
                                                                                        } else {
                                                                                          if (decompiledRegionSelector0 == 41) {
                                                                                            return (csa) ((Object) stackIn_216_0);
                                                                                          } else {
                                                                                            if (decompiledRegionSelector0 == 42) {
                                                                                              return (csa) ((Object) stackIn_218_0);
                                                                                            } else {
                                                                                              if (decompiledRegionSelector0 == 43) {
                                                                                                return (csa) ((Object) stackIn_220_0);
                                                                                              } else {
                                                                                                if (decompiledRegionSelector0 == 44) {
                                                                                                  return (csa) ((Object) stackIn_222_0);
                                                                                                } else {
                                                                                                  if (decompiledRegionSelector0 == 45) {
                                                                                                    return (csa) ((Object) stackIn_224_0);
                                                                                                  } else {
                                                                                                    if (decompiledRegionSelector0 == 46) {
                                                                                                      return (csa) ((Object) stackIn_226_0);
                                                                                                    } else {
                                                                                                      if (decompiledRegionSelector0 == 47) {
                                                                                                        return (csa) ((Object) stackIn_228_0);
                                                                                                      } else {
                                                                                                        if (decompiledRegionSelector0 == 48) {
                                                                                                          return (csa) ((Object) stackIn_230_0);
                                                                                                        } else {
                                                                                                          if (decompiledRegionSelector0 == 49) {
                                                                                                            return (csa) ((Object) stackIn_232_0);
                                                                                                          } else {
                                                                                                            if (decompiledRegionSelector0 == 50) {
                                                                                                              return (csa) ((Object) stackIn_234_0);
                                                                                                            } else {
                                                                                                              if (decompiledRegionSelector0 == 51) {
                                                                                                                return (csa) ((Object) stackIn_236_0);
                                                                                                              } else {
                                                                                                                if (decompiledRegionSelector0 == 52) {
                                                                                                                  return (csa) ((Object) stackIn_238_0);
                                                                                                                } else {
                                                                                                                  if (decompiledRegionSelector0 == 53) {
                                                                                                                    return (csa) ((Object) stackIn_240_0);
                                                                                                                  } else {
                                                                                                                    if (decompiledRegionSelector0 == 54) {
                                                                                                                      return (csa) ((Object) stackIn_242_0);
                                                                                                                    } else {
                                                                                                                      if (decompiledRegionSelector0 == 55) {
                                                                                                                        return (csa) ((Object) stackIn_244_0);
                                                                                                                      } else {
                                                                                                                        if (decompiledRegionSelector0 == 56) {
                                                                                                                          return (csa) ((Object) stackIn_246_0);
                                                                                                                        } else {
                                                                                                                          if (decompiledRegionSelector0 == 57) {
                                                                                                                            return (csa) ((Object) stackIn_248_0);
                                                                                                                          } else {
                                                                                                                            if (decompiledRegionSelector0 == 58) {
                                                                                                                              return (csa) ((Object) stackIn_250_0);
                                                                                                                            } else {
                                                                                                                              if (decompiledRegionSelector0 == 59) {
                                                                                                                                return (csa) ((Object) stackIn_252_0);
                                                                                                                              } else {
                                                                                                                                if (decompiledRegionSelector0 == 60) {
                                                                                                                                  return (csa) ((Object) stackIn_254_0);
                                                                                                                                } else {
                                                                                                                                  if (decompiledRegionSelector0 == 61) {
                                                                                                                                    return (csa) ((Object) stackIn_256_0);
                                                                                                                                  } else {
                                                                                                                                    if (decompiledRegionSelector0 == 62) {
                                                                                                                                      return (csa) ((Object) stackIn_258_0);
                                                                                                                                    } else {
                                                                                                                                      return (csa) ((Object) stackIn_260_0);
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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        si stackIn_137_0 = null;
        saa stackIn_139_0 = null;
        oma stackIn_141_0 = null;
        pw stackIn_143_0 = null;
        pw stackIn_145_0 = null;
        vka stackIn_147_0 = null;
        ve stackIn_149_0 = null;
        uea stackIn_151_0 = null;
        uk stackIn_153_0 = null;
        wqa stackIn_155_0 = null;
        bla stackIn_157_0 = null;
        aja stackIn_159_0 = null;
        gd stackIn_161_0 = null;
        tta stackIn_163_0 = null;
        lg stackIn_165_0 = null;
        tca stackIn_167_0 = null;
        ln stackIn_169_0 = null;
        ps stackIn_171_0 = null;
        m stackIn_173_0 = null;
        aw stackIn_175_0 = null;
        mh stackIn_177_0 = null;
        mh stackIn_179_0 = null;
        mj stackIn_181_0 = null;
        er stackIn_183_0 = null;
        bia stackIn_185_0 = null;
        wpa stackIn_187_0 = null;
        ih stackIn_189_0 = null;
        jh stackIn_191_0 = null;
        qta stackIn_193_0 = null;
        ipa stackIn_195_0 = null;
        sua stackIn_197_0 = null;
        ona stackIn_199_0 = null;
        ona stackIn_201_0 = null;
        kt stackIn_203_0 = null;
        wha stackIn_205_0 = null;
        wha stackIn_207_0 = null;
        jc stackIn_209_0 = null;
        md stackIn_211_0 = null;
        gw stackIn_213_0 = null;
        gw stackIn_215_0 = null;
        gw stackIn_217_0 = null;
        gw stackIn_219_0 = null;
        wta stackIn_221_0 = null;
        wfa stackIn_223_0 = null;
        mh stackIn_225_0 = null;
        mh stackIn_227_0 = null;
        lda stackIn_229_0 = null;
        lda stackIn_231_0 = null;
        df stackIn_233_0 = null;
        si stackIn_235_0 = null;
        aea stackIn_237_0 = null;
        uc stackIn_239_0 = null;
        tp stackIn_241_0 = null;
        jb stackIn_243_0 = null;
        pw stackIn_245_0 = null;
        pw stackIn_247_0 = null;
        nja stackIn_249_0 = null;
        si stackIn_251_0 = null;
        uka stackIn_253_0 = null;
        aw stackIn_255_0 = null;
        ln stackIn_257_0 = null;
        qi stackIn_259_0 = null;
        ga stackIn_261_0 = null;
        RuntimeException stackIn_264_0 = null;
        StringBuilder stackIn_264_1 = null;
        RuntimeException stackIn_265_0 = null;
        StringBuilder stackIn_265_1 = null;
        RuntimeException stackIn_266_0 = null;
        StringBuilder stackIn_266_1 = null;
        String stackIn_266_2 = null;
        RuntimeException stackIn_267_0 = null;
        StringBuilder stackIn_267_1 = null;
        RuntimeException stackIn_268_0 = null;
        StringBuilder stackIn_268_1 = null;
        RuntimeException stackIn_269_0 = null;
        StringBuilder stackIn_269_1 = null;
        String stackIn_269_2 = null;
        RuntimeException stackIn_270_0 = null;
        StringBuilder stackIn_270_1 = null;
        RuntimeException stackIn_271_0 = null;
        StringBuilder stackIn_271_1 = null;
        RuntimeException stackIn_272_0 = null;
        StringBuilder stackIn_272_1 = null;
        String stackIn_272_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        saa stackOut_138_0 = null;
        oma stackOut_140_0 = null;
        pw stackOut_142_0 = null;
        pw stackOut_144_0 = null;
        vka stackOut_146_0 = null;
        ve stackOut_148_0 = null;
        uea stackOut_150_0 = null;
        uk stackOut_152_0 = null;
        wqa stackOut_154_0 = null;
        bla stackOut_156_0 = null;
        aja stackOut_158_0 = null;
        gd stackOut_160_0 = null;
        tta stackOut_162_0 = null;
        lg stackOut_164_0 = null;
        tca stackOut_166_0 = null;
        ln stackOut_168_0 = null;
        ps stackOut_170_0 = null;
        m stackOut_172_0 = null;
        aw stackOut_174_0 = null;
        mh stackOut_176_0 = null;
        mh stackOut_178_0 = null;
        mj stackOut_180_0 = null;
        er stackOut_182_0 = null;
        bia stackOut_184_0 = null;
        wpa stackOut_186_0 = null;
        ih stackOut_188_0 = null;
        jh stackOut_190_0 = null;
        qta stackOut_192_0 = null;
        ipa stackOut_194_0 = null;
        sua stackOut_196_0 = null;
        ona stackOut_198_0 = null;
        ona stackOut_200_0 = null;
        kt stackOut_202_0 = null;
        wha stackOut_204_0 = null;
        wha stackOut_206_0 = null;
        jc stackOut_208_0 = null;
        md stackOut_210_0 = null;
        gw stackOut_212_0 = null;
        gw stackOut_214_0 = null;
        gw stackOut_216_0 = null;
        gw stackOut_218_0 = null;
        wta stackOut_220_0 = null;
        wfa stackOut_222_0 = null;
        mh stackOut_224_0 = null;
        mh stackOut_226_0 = null;
        lda stackOut_228_0 = null;
        lda stackOut_230_0 = null;
        df stackOut_232_0 = null;
        si stackOut_234_0 = null;
        aea stackOut_236_0 = null;
        uc stackOut_238_0 = null;
        tp stackOut_240_0 = null;
        jb stackOut_242_0 = null;
        pw stackOut_244_0 = null;
        pw stackOut_246_0 = null;
        nja stackOut_248_0 = null;
        si stackOut_250_0 = null;
        uka stackOut_252_0 = null;
        aw stackOut_254_0 = null;
        ln stackOut_256_0 = null;
        qi stackOut_258_0 = null;
        ga stackOut_260_0 = null;
        si stackOut_136_0 = null;
        RuntimeException stackOut_263_0 = null;
        StringBuilder stackOut_263_1 = null;
        RuntimeException stackOut_265_0 = null;
        StringBuilder stackOut_265_1 = null;
        String stackOut_265_2 = null;
        RuntimeException stackOut_264_0 = null;
        StringBuilder stackOut_264_1 = null;
        String stackOut_264_2 = null;
        RuntimeException stackOut_266_0 = null;
        StringBuilder stackOut_266_1 = null;
        RuntimeException stackOut_268_0 = null;
        StringBuilder stackOut_268_1 = null;
        String stackOut_268_2 = null;
        RuntimeException stackOut_267_0 = null;
        StringBuilder stackOut_267_1 = null;
        String stackOut_267_2 = null;
        RuntimeException stackOut_269_0 = null;
        StringBuilder stackOut_269_1 = null;
        RuntimeException stackOut_271_0 = null;
        StringBuilder stackOut_271_1 = null;
        String stackOut_271_2 = null;
        RuntimeException stackOut_270_0 = null;
        StringBuilder stackOut_270_1 = null;
        String stackOut_270_2 = null;
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
            L2: {
              L3: {
                var6 = var5_int;
                if (0 != var6) {
                  break L3;
                } else {
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (var6 == 1) {
                stackOut_138_0 = new saa(param1, var5_int, param0, param3);
                stackIn_139_0 = stackOut_138_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  if (2 != var6) {
                    break L4;
                  } else {
                    if (var7 == 0) {
                      stackOut_140_0 = new oma(param1, var5_int, param0, param3);
                      stackIn_141_0 = stackOut_140_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                if ((var6 ^ -1) == -4) {
                  stackOut_142_0 = new pw(param1, var5_int, param0, param3);
                  stackIn_143_0 = stackOut_142_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (4 == var6) {
                    stackOut_144_0 = new pw(param1, var5_int, param0, param3);
                    stackIn_145_0 = stackOut_144_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if (var6 == 5) {
                      stackOut_146_0 = new vka(param1, var5_int, param0, param3);
                      stackIn_147_0 = stackOut_146_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      if (6 == var6) {
                        stackOut_148_0 = new ve(param1, var5_int, param0, param3);
                        stackIn_149_0 = stackOut_148_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        L5: {
                          if (-8 != (var6 ^ -1)) {
                            break L5;
                          } else {
                            if (var7 == 0) {
                              stackOut_150_0 = new uea(param1, var5_int, param0, param3);
                              stackIn_151_0 = stackOut_150_0;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if ((var6 ^ -1) == -9) {
                          stackOut_152_0 = new uk(param1, var5_int, param0, param3);
                          stackIn_153_0 = stackOut_152_0;
                          decompiledRegionSelector0 = 8;
                          break L0;
                        } else {
                          if (-10 == (var6 ^ -1)) {
                            stackOut_154_0 = new wqa(param1, var5_int, param0, param3);
                            stackIn_155_0 = stackOut_154_0;
                            decompiledRegionSelector0 = 9;
                            break L0;
                          } else {
                            if ((var6 ^ -1) == -11) {
                              stackOut_156_0 = new bla(param1, var5_int, param0, param3);
                              stackIn_157_0 = stackOut_156_0;
                              decompiledRegionSelector0 = 10;
                              break L0;
                            } else {
                              L6: {
                                if (-12 != (var6 ^ -1)) {
                                  break L6;
                                } else {
                                  if (var7 == 0) {
                                    stackOut_158_0 = new aja(param1, var5_int, param0, param3);
                                    stackIn_159_0 = stackOut_158_0;
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              L7: {
                                if (var6 != 12) {
                                  break L7;
                                } else {
                                  if (var7 == 0) {
                                    stackOut_160_0 = new gd(param1, var5_int, param0, param3);
                                    stackIn_161_0 = stackOut_160_0;
                                    decompiledRegionSelector0 = 12;
                                    break L0;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                if (var6 != 13) {
                                  break L8;
                                } else {
                                  if (var7 == 0) {
                                    stackOut_162_0 = new tta(param1, var5_int, param0, param3);
                                    stackIn_163_0 = stackOut_162_0;
                                    decompiledRegionSelector0 = 13;
                                    break L0;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (var6 != 14) {
                                  break L9;
                                } else {
                                  if (var7 == 0) {
                                    stackOut_164_0 = new lg(param1, var5_int, param0, param3);
                                    stackIn_165_0 = stackOut_164_0;
                                    decompiledRegionSelector0 = 14;
                                    break L0;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              if (15 == var6) {
                                stackOut_166_0 = new tca(param1, var5_int, param0, param3);
                                stackIn_167_0 = stackOut_166_0;
                                decompiledRegionSelector0 = 15;
                                break L0;
                              } else {
                                L10: {
                                  if ((var6 ^ -1) != -17) {
                                    break L10;
                                  } else {
                                    if (var7 == 0) {
                                      stackOut_168_0 = new ln(param1, var5_int, param0, param3);
                                      stackIn_169_0 = stackOut_168_0;
                                      decompiledRegionSelector0 = 16;
                                      break L0;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if (var6 != 17) {
                                    break L11;
                                  } else {
                                    if (var7 == 0) {
                                      stackOut_170_0 = new ps(param1, var5_int, param0, param3);
                                      stackIn_171_0 = stackOut_170_0;
                                      decompiledRegionSelector0 = 17;
                                      break L0;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if (var6 != 18) {
                                    break L12;
                                  } else {
                                    if (var7 == 0) {
                                      stackOut_172_0 = new m(param1, var5_int, param0, param3);
                                      stackIn_173_0 = stackOut_172_0;
                                      decompiledRegionSelector0 = 18;
                                      break L0;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                if ((var6 ^ -1) == -20) {
                                  stackOut_174_0 = new aw(param1, var5_int, param0, param3);
                                  stackIn_175_0 = stackOut_174_0;
                                  decompiledRegionSelector0 = 19;
                                  break L0;
                                } else {
                                  L13: {
                                    if ((var6 ^ -1) != -21) {
                                      break L13;
                                    } else {
                                      if (var7 == 0) {
                                        stackOut_176_0 = new mh(param1, var5_int, param0, param3);
                                        stackIn_177_0 = stackOut_176_0;
                                        decompiledRegionSelector0 = 20;
                                        break L0;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  if (21 == var6) {
                                    stackOut_178_0 = new mh(param1, var5_int, param0, param3);
                                    stackIn_179_0 = stackOut_178_0;
                                    decompiledRegionSelector0 = 21;
                                    break L0;
                                  } else {
                                    L14: {
                                      if (var6 != 22) {
                                        break L14;
                                      } else {
                                        if (var7 == 0) {
                                          stackOut_180_0 = new mj(param1, var5_int, param0, param3);
                                          stackIn_181_0 = stackOut_180_0;
                                          decompiledRegionSelector0 = 22;
                                          break L0;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    if (23 == var6) {
                                      stackOut_182_0 = new er(param1, var5_int, param0, param3);
                                      stackIn_183_0 = stackOut_182_0;
                                      decompiledRegionSelector0 = 23;
                                      break L0;
                                    } else {
                                      if (var6 == 24) {
                                        stackOut_184_0 = new bia(param1, var5_int, param0, param3);
                                        stackIn_185_0 = stackOut_184_0;
                                        decompiledRegionSelector0 = 24;
                                        break L0;
                                      } else {
                                        if ((var6 ^ -1) == -26) {
                                          stackOut_186_0 = new wpa(param1, var5_int, param0, param3);
                                          stackIn_187_0 = stackOut_186_0;
                                          decompiledRegionSelector0 = 25;
                                          break L0;
                                        } else {
                                          if ((var6 ^ -1) == -27) {
                                            stackOut_188_0 = new ih(param1, var5_int, param0, param3);
                                            stackIn_189_0 = stackOut_188_0;
                                            decompiledRegionSelector0 = 26;
                                            break L0;
                                          } else {
                                            L15: {
                                              if (var6 != 27) {
                                                break L15;
                                              } else {
                                                if (var7 == 0) {
                                                  stackOut_190_0 = new jh(param1, var5_int, param0, param3);
                                                  stackIn_191_0 = stackOut_190_0;
                                                  decompiledRegionSelector0 = 27;
                                                  break L0;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            if (28 == var6) {
                                              stackOut_192_0 = new qta(param1, var5_int, param0, param3);
                                              stackIn_193_0 = stackOut_192_0;
                                              decompiledRegionSelector0 = 28;
                                              break L0;
                                            } else {
                                              L16: {
                                                if ((var6 ^ -1) != -30) {
                                                  break L16;
                                                } else {
                                                  if (var7 == 0) {
                                                    stackOut_194_0 = new ipa(param1, var5_int, param0, param3);
                                                    stackIn_195_0 = stackOut_194_0;
                                                    decompiledRegionSelector0 = 29;
                                                    break L0;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                              if (var6 == 30) {
                                                stackOut_196_0 = new sua(param1, var5_int, param0, param3);
                                                stackIn_197_0 = stackOut_196_0;
                                                decompiledRegionSelector0 = 30;
                                                break L0;
                                              } else {
                                                if (31 == var6) {
                                                  stackOut_198_0 = new ona(param1, var5_int, param0, param3);
                                                  stackIn_199_0 = stackOut_198_0;
                                                  decompiledRegionSelector0 = 31;
                                                  break L0;
                                                } else {
                                                  if (var6 == 32) {
                                                    stackOut_200_0 = new ona(param1, var5_int, param0, param3);
                                                    stackIn_201_0 = stackOut_200_0;
                                                    decompiledRegionSelector0 = 32;
                                                    break L0;
                                                  } else {
                                                    L17: {
                                                      if (var6 != 33) {
                                                        break L17;
                                                      } else {
                                                        if (var7 == 0) {
                                                          stackOut_202_0 = new kt(param1, var5_int, param0, param3);
                                                          stackIn_203_0 = stackOut_202_0;
                                                          decompiledRegionSelector0 = 33;
                                                          break L0;
                                                        } else {
                                                          break L17;
                                                        }
                                                      }
                                                    }
                                                    if (var6 == 34) {
                                                      stackOut_204_0 = new wha(param1, var5_int, param0, param3);
                                                      stackIn_205_0 = stackOut_204_0;
                                                      decompiledRegionSelector0 = 34;
                                                      break L0;
                                                    } else {
                                                      L18: {
                                                        if ((var6 ^ -1) != -36) {
                                                          break L18;
                                                        } else {
                                                          if (var7 == 0) {
                                                            stackOut_206_0 = new wha(param1, var5_int, param0, param3);
                                                            stackIn_207_0 = stackOut_206_0;
                                                            decompiledRegionSelector0 = 35;
                                                            break L0;
                                                          } else {
                                                            break L18;
                                                          }
                                                        }
                                                      }
                                                      L19: {
                                                        if (36 != var6) {
                                                          break L19;
                                                        } else {
                                                          if (var7 == 0) {
                                                            stackOut_208_0 = new jc(param1, var5_int, param0, param3);
                                                            stackIn_209_0 = stackOut_208_0;
                                                            decompiledRegionSelector0 = 36;
                                                            break L0;
                                                          } else {
                                                            break L19;
                                                          }
                                                        }
                                                      }
                                                      L20: {
                                                        if (var6 != 37) {
                                                          break L20;
                                                        } else {
                                                          if (var7 == 0) {
                                                            stackOut_210_0 = new md(param1, var5_int, param0, param3);
                                                            stackIn_211_0 = stackOut_210_0;
                                                            decompiledRegionSelector0 = 37;
                                                            break L0;
                                                          } else {
                                                            break L20;
                                                          }
                                                        }
                                                      }
                                                      L21: {
                                                        if (-39 != (var6 ^ -1)) {
                                                          break L21;
                                                        } else {
                                                          if (var7 == 0) {
                                                            stackOut_212_0 = new gw(param1, var5_int, param0, param3);
                                                            stackIn_213_0 = stackOut_212_0;
                                                            decompiledRegionSelector0 = 38;
                                                            break L0;
                                                          } else {
                                                            break L21;
                                                          }
                                                        }
                                                      }
                                                      L22: {
                                                        if ((var6 ^ -1) != -40) {
                                                          break L22;
                                                        } else {
                                                          if (var7 == 0) {
                                                            stackOut_214_0 = new gw(param1, var5_int, param0, param3);
                                                            stackIn_215_0 = stackOut_214_0;
                                                            decompiledRegionSelector0 = 39;
                                                            break L0;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                      if (40 == var6) {
                                                        stackOut_216_0 = new gw(param1, var5_int, param0, param3);
                                                        stackIn_217_0 = stackOut_216_0;
                                                        decompiledRegionSelector0 = 40;
                                                        break L0;
                                                      } else {
                                                        L23: {
                                                          if ((var6 ^ -1) != -42) {
                                                            break L23;
                                                          } else {
                                                            if (var7 == 0) {
                                                              stackOut_218_0 = new gw(param1, var5_int, param0, param3);
                                                              stackIn_219_0 = stackOut_218_0;
                                                              decompiledRegionSelector0 = 41;
                                                              break L0;
                                                            } else {
                                                              break L23;
                                                            }
                                                          }
                                                        }
                                                        if (var6 == 42) {
                                                          stackOut_220_0 = new wta(param1, var5_int, param0, param3);
                                                          stackIn_221_0 = stackOut_220_0;
                                                          decompiledRegionSelector0 = 42;
                                                          break L0;
                                                        } else {
                                                          L24: {
                                                            if (-44 != (var6 ^ -1)) {
                                                              break L24;
                                                            } else {
                                                              if (var7 == 0) {
                                                                stackOut_222_0 = new wfa(param1, var5_int, param0, param3);
                                                                stackIn_223_0 = stackOut_222_0;
                                                                decompiledRegionSelector0 = 43;
                                                                break L0;
                                                              } else {
                                                                break L24;
                                                              }
                                                            }
                                                          }
                                                          L25: {
                                                            if (var6 != 44) {
                                                              break L25;
                                                            } else {
                                                              if (var7 == 0) {
                                                                stackOut_224_0 = new mh(param1, var5_int, param0, param3);
                                                                stackIn_225_0 = stackOut_224_0;
                                                                decompiledRegionSelector0 = 44;
                                                                break L0;
                                                              } else {
                                                                break L25;
                                                              }
                                                            }
                                                          }
                                                          L26: {
                                                            if ((var6 ^ -1) != -46) {
                                                              break L26;
                                                            } else {
                                                              if (var7 == 0) {
                                                                stackOut_226_0 = new mh(param1, var5_int, param0, param3);
                                                                stackIn_227_0 = stackOut_226_0;
                                                                decompiledRegionSelector0 = 45;
                                                                break L0;
                                                              } else {
                                                                break L26;
                                                              }
                                                            }
                                                          }
                                                          L27: {
                                                            if (-47 != (var6 ^ -1)) {
                                                              break L27;
                                                            } else {
                                                              if (var7 == 0) {
                                                                stackOut_228_0 = new lda(param1, var5_int, param0, param3);
                                                                stackIn_229_0 = stackOut_228_0;
                                                                decompiledRegionSelector0 = 46;
                                                                break L0;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                          }
                                                          L28: {
                                                            if ((var6 ^ -1) != -48) {
                                                              break L28;
                                                            } else {
                                                              if (var7 == 0) {
                                                                stackOut_230_0 = new lda(param1, var5_int, param0, param3);
                                                                stackIn_231_0 = stackOut_230_0;
                                                                decompiledRegionSelector0 = 47;
                                                                break L0;
                                                              } else {
                                                                break L28;
                                                              }
                                                            }
                                                          }
                                                          if (var6 == 48) {
                                                            stackOut_232_0 = new df(param1, var5_int, param0, param3);
                                                            stackIn_233_0 = stackOut_232_0;
                                                            decompiledRegionSelector0 = 48;
                                                            break L0;
                                                          } else {
                                                            L29: {
                                                              if ((var6 ^ -1) != -50) {
                                                                break L29;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  stackOut_234_0 = new si(param1, var5_int, param0, param3);
                                                                  stackIn_235_0 = stackOut_234_0;
                                                                  decompiledRegionSelector0 = 49;
                                                                  break L0;
                                                                } else {
                                                                  break L29;
                                                                }
                                                              }
                                                            }
                                                            if (var6 == 50) {
                                                              stackOut_236_0 = new aea(param1, var5_int, param0, param3);
                                                              stackIn_237_0 = stackOut_236_0;
                                                              decompiledRegionSelector0 = 50;
                                                              break L0;
                                                            } else {
                                                              L30: {
                                                                if (-52 != (var6 ^ -1)) {
                                                                  break L30;
                                                                } else {
                                                                  if (var7 == 0) {
                                                                    stackOut_238_0 = new uc(param1, var5_int, param0, param3);
                                                                    stackIn_239_0 = stackOut_238_0;
                                                                    decompiledRegionSelector0 = 51;
                                                                    break L0;
                                                                  } else {
                                                                    break L30;
                                                                  }
                                                                }
                                                              }
                                                              L31: {
                                                                if (52 != var6) {
                                                                  break L31;
                                                                } else {
                                                                  if (var7 == 0) {
                                                                    stackOut_240_0 = new tp(param1, var5_int, param0, param3);
                                                                    stackIn_241_0 = stackOut_240_0;
                                                                    decompiledRegionSelector0 = 52;
                                                                    break L0;
                                                                  } else {
                                                                    break L31;
                                                                  }
                                                                }
                                                              }
                                                              L32: {
                                                                if ((var6 ^ -1) != -54) {
                                                                  break L32;
                                                                } else {
                                                                  if (var7 == 0) {
                                                                    stackOut_242_0 = new jb(param1, var5_int, param0, param3);
                                                                    stackIn_243_0 = stackOut_242_0;
                                                                    decompiledRegionSelector0 = 53;
                                                                    break L0;
                                                                  } else {
                                                                    break L32;
                                                                  }
                                                                }
                                                              }
                                                              if (54 == var6) {
                                                                stackOut_244_0 = new pw(param1, var5_int, param0, param3);
                                                                stackIn_245_0 = stackOut_244_0;
                                                                decompiledRegionSelector0 = 54;
                                                                break L0;
                                                              } else {
                                                                if (var6 == 55) {
                                                                  stackOut_246_0 = new pw(param1, var5_int, param0, param3);
                                                                  stackIn_247_0 = stackOut_246_0;
                                                                  decompiledRegionSelector0 = 55;
                                                                  break L0;
                                                                } else {
                                                                  L33: {
                                                                    if ((var6 ^ -1) != -57) {
                                                                      break L33;
                                                                    } else {
                                                                      if (var7 == 0) {
                                                                        stackOut_248_0 = new nja(param1, var5_int, param0, param3);
                                                                        stackIn_249_0 = stackOut_248_0;
                                                                        decompiledRegionSelector0 = 56;
                                                                        break L0;
                                                                      } else {
                                                                        break L33;
                                                                      }
                                                                    }
                                                                  }
                                                                  if ((var6 ^ -1) == -58) {
                                                                    stackOut_250_0 = new si(param1, var5_int, param0, param3);
                                                                    stackIn_251_0 = stackOut_250_0;
                                                                    decompiledRegionSelector0 = 57;
                                                                    break L0;
                                                                  } else {
                                                                    L34: {
                                                                      if (58 != var6) {
                                                                        break L34;
                                                                      } else {
                                                                        if (var7 == 0) {
                                                                          stackOut_252_0 = new uka(param1, var5_int, param0, param3);
                                                                          stackIn_253_0 = stackOut_252_0;
                                                                          decompiledRegionSelector0 = 58;
                                                                          break L0;
                                                                        } else {
                                                                          break L34;
                                                                        }
                                                                      }
                                                                    }
                                                                    L35: {
                                                                      if (59 != var6) {
                                                                        break L35;
                                                                      } else {
                                                                        if (var7 == 0) {
                                                                          stackOut_254_0 = new aw(param1, var5_int, param0, param3);
                                                                          stackIn_255_0 = stackOut_254_0;
                                                                          decompiledRegionSelector0 = 59;
                                                                          break L0;
                                                                        } else {
                                                                          break L35;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (-61 == (var6 ^ -1)) {
                                                                      stackOut_256_0 = new ln(param1, var5_int, param0, param3);
                                                                      stackIn_257_0 = stackOut_256_0;
                                                                      decompiledRegionSelector0 = 60;
                                                                      break L0;
                                                                    } else {
                                                                      L36: {
                                                                        if ((var6 ^ -1) != -62) {
                                                                          break L36;
                                                                        } else {
                                                                          if (var7 == 0) {
                                                                            stackOut_258_0 = new qi(param1, var5_int, param0, param3);
                                                                            stackIn_259_0 = stackOut_258_0;
                                                                            decompiledRegionSelector0 = 61;
                                                                            break L0;
                                                                          } else {
                                                                            break L36;
                                                                          }
                                                                        }
                                                                      }
                                                                      if ((var6 ^ -1) != -63) {
                                                                        throw new IllegalStateException("Unrecognised component type: " + var5_int);
                                                                      } else {
                                                                        if (var7 == 0) {
                                                                          stackOut_260_0 = new ga(param1, var5_int, param0, param3);
                                                                          stackIn_261_0 = stackOut_260_0;
                                                                          decompiledRegionSelector0 = 62;
                                                                          break L0;
                                                                        } else {
                                                                          break L2;
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
            stackOut_136_0 = new si(param1, var5_int, param0, param3);
            stackIn_137_0 = stackOut_136_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L37: {
            var5 = decompiledCaughtException;
            stackOut_263_0 = (RuntimeException) (var5);
            stackOut_263_1 = new StringBuilder().append("rn.A(");
            stackIn_265_0 = stackOut_263_0;
            stackIn_265_1 = stackOut_263_1;
            stackIn_264_0 = stackOut_263_0;
            stackIn_264_1 = stackOut_263_1;
            if (param0 == null) {
              stackOut_265_0 = (RuntimeException) ((Object) stackIn_265_0);
              stackOut_265_1 = (StringBuilder) ((Object) stackIn_265_1);
              stackOut_265_2 = "null";
              stackIn_266_0 = stackOut_265_0;
              stackIn_266_1 = stackOut_265_1;
              stackIn_266_2 = stackOut_265_2;
              break L37;
            } else {
              stackOut_264_0 = (RuntimeException) ((Object) stackIn_264_0);
              stackOut_264_1 = (StringBuilder) ((Object) stackIn_264_1);
              stackOut_264_2 = "{...}";
              stackIn_266_0 = stackOut_264_0;
              stackIn_266_1 = stackOut_264_1;
              stackIn_266_2 = stackOut_264_2;
              break L37;
            }
          }
          L38: {
            stackOut_266_0 = (RuntimeException) ((Object) stackIn_266_0);
            stackOut_266_1 = ((StringBuilder) (Object) stackIn_266_1).append(stackIn_266_2).append(',');
            stackIn_268_0 = stackOut_266_0;
            stackIn_268_1 = stackOut_266_1;
            stackIn_267_0 = stackOut_266_0;
            stackIn_267_1 = stackOut_266_1;
            if (param1 == null) {
              stackOut_268_0 = (RuntimeException) ((Object) stackIn_268_0);
              stackOut_268_1 = (StringBuilder) ((Object) stackIn_268_1);
              stackOut_268_2 = "null";
              stackIn_269_0 = stackOut_268_0;
              stackIn_269_1 = stackOut_268_1;
              stackIn_269_2 = stackOut_268_2;
              break L38;
            } else {
              stackOut_267_0 = (RuntimeException) ((Object) stackIn_267_0);
              stackOut_267_1 = (StringBuilder) ((Object) stackIn_267_1);
              stackOut_267_2 = "{...}";
              stackIn_269_0 = stackOut_267_0;
              stackIn_269_1 = stackOut_267_1;
              stackIn_269_2 = stackOut_267_2;
              break L38;
            }
          }
          L39: {
            stackOut_269_0 = (RuntimeException) ((Object) stackIn_269_0);
            stackOut_269_1 = ((StringBuilder) (Object) stackIn_269_1).append(stackIn_269_2).append(',').append(param2).append(',');
            stackIn_271_0 = stackOut_269_0;
            stackIn_271_1 = stackOut_269_1;
            stackIn_270_0 = stackOut_269_0;
            stackIn_270_1 = stackOut_269_1;
            if (param3 == null) {
              stackOut_271_0 = (RuntimeException) ((Object) stackIn_271_0);
              stackOut_271_1 = (StringBuilder) ((Object) stackIn_271_1);
              stackOut_271_2 = "null";
              stackIn_272_0 = stackOut_271_0;
              stackIn_272_1 = stackOut_271_1;
              stackIn_272_2 = stackOut_271_2;
              break L39;
            } else {
              stackOut_270_0 = (RuntimeException) ((Object) stackIn_270_0);
              stackOut_270_1 = (StringBuilder) ((Object) stackIn_270_1);
              stackOut_270_2 = "{...}";
              stackIn_272_0 = stackOut_270_0;
              stackIn_272_1 = stackOut_270_1;
              stackIn_272_2 = stackOut_270_2;
              break L39;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_272_0), stackIn_272_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (csa) ((Object) stackIn_137_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (csa) ((Object) stackIn_139_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (csa) ((Object) stackIn_141_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (csa) ((Object) stackIn_143_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (csa) ((Object) stackIn_145_0);
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (csa) ((Object) stackIn_147_0);
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return (csa) ((Object) stackIn_149_0);
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return (csa) ((Object) stackIn_151_0);
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return (csa) ((Object) stackIn_153_0);
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return (csa) ((Object) stackIn_155_0);
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return (csa) ((Object) stackIn_157_0);
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return (csa) ((Object) stackIn_159_0);
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return (csa) ((Object) stackIn_161_0);
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return (csa) ((Object) stackIn_163_0);
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return (csa) ((Object) stackIn_165_0);
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return (csa) ((Object) stackIn_167_0);
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return (csa) ((Object) stackIn_169_0);
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return (csa) ((Object) stackIn_171_0);
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return (csa) ((Object) stackIn_173_0);
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return (csa) ((Object) stackIn_175_0);
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return (csa) ((Object) stackIn_177_0);
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return (csa) ((Object) stackIn_179_0);
                                                  } else {
                                                    if (decompiledRegionSelector0 == 22) {
                                                      return (csa) ((Object) stackIn_181_0);
                                                    } else {
                                                      if (decompiledRegionSelector0 == 23) {
                                                        return (csa) ((Object) stackIn_183_0);
                                                      } else {
                                                        if (decompiledRegionSelector0 == 24) {
                                                          return (csa) ((Object) stackIn_185_0);
                                                        } else {
                                                          if (decompiledRegionSelector0 == 25) {
                                                            return (csa) ((Object) stackIn_187_0);
                                                          } else {
                                                            if (decompiledRegionSelector0 == 26) {
                                                              return (csa) ((Object) stackIn_189_0);
                                                            } else {
                                                              if (decompiledRegionSelector0 == 27) {
                                                                return (csa) ((Object) stackIn_191_0);
                                                              } else {
                                                                if (decompiledRegionSelector0 == 28) {
                                                                  return (csa) ((Object) stackIn_193_0);
                                                                } else {
                                                                  if (decompiledRegionSelector0 == 29) {
                                                                    return (csa) ((Object) stackIn_195_0);
                                                                  } else {
                                                                    if (decompiledRegionSelector0 == 30) {
                                                                      return (csa) ((Object) stackIn_197_0);
                                                                    } else {
                                                                      if (decompiledRegionSelector0 == 31) {
                                                                        return (csa) ((Object) stackIn_199_0);
                                                                      } else {
                                                                        if (decompiledRegionSelector0 == 32) {
                                                                          return (csa) ((Object) stackIn_201_0);
                                                                        } else {
                                                                          if (decompiledRegionSelector0 == 33) {
                                                                            return (csa) ((Object) stackIn_203_0);
                                                                          } else {
                                                                            if (decompiledRegionSelector0 == 34) {
                                                                              return (csa) ((Object) stackIn_205_0);
                                                                            } else {
                                                                              if (decompiledRegionSelector0 == 35) {
                                                                                return (csa) ((Object) stackIn_207_0);
                                                                              } else {
                                                                                if (decompiledRegionSelector0 == 36) {
                                                                                  return (csa) ((Object) stackIn_209_0);
                                                                                } else {
                                                                                  if (decompiledRegionSelector0 == 37) {
                                                                                    return (csa) ((Object) stackIn_211_0);
                                                                                  } else {
                                                                                    if (decompiledRegionSelector0 == 38) {
                                                                                      return (csa) ((Object) stackIn_213_0);
                                                                                    } else {
                                                                                      if (decompiledRegionSelector0 == 39) {
                                                                                        return (csa) ((Object) stackIn_215_0);
                                                                                      } else {
                                                                                        if (decompiledRegionSelector0 == 40) {
                                                                                          return (csa) ((Object) stackIn_217_0);
                                                                                        } else {
                                                                                          if (decompiledRegionSelector0 == 41) {
                                                                                            return (csa) ((Object) stackIn_219_0);
                                                                                          } else {
                                                                                            if (decompiledRegionSelector0 == 42) {
                                                                                              return (csa) ((Object) stackIn_221_0);
                                                                                            } else {
                                                                                              if (decompiledRegionSelector0 == 43) {
                                                                                                return (csa) ((Object) stackIn_223_0);
                                                                                              } else {
                                                                                                if (decompiledRegionSelector0 == 44) {
                                                                                                  return (csa) ((Object) stackIn_225_0);
                                                                                                } else {
                                                                                                  if (decompiledRegionSelector0 == 45) {
                                                                                                    return (csa) ((Object) stackIn_227_0);
                                                                                                  } else {
                                                                                                    if (decompiledRegionSelector0 == 46) {
                                                                                                      return (csa) ((Object) stackIn_229_0);
                                                                                                    } else {
                                                                                                      if (decompiledRegionSelector0 == 47) {
                                                                                                        return (csa) ((Object) stackIn_231_0);
                                                                                                      } else {
                                                                                                        if (decompiledRegionSelector0 == 48) {
                                                                                                          return (csa) ((Object) stackIn_233_0);
                                                                                                        } else {
                                                                                                          if (decompiledRegionSelector0 == 49) {
                                                                                                            return (csa) ((Object) stackIn_235_0);
                                                                                                          } else {
                                                                                                            if (decompiledRegionSelector0 == 50) {
                                                                                                              return (csa) ((Object) stackIn_237_0);
                                                                                                            } else {
                                                                                                              if (decompiledRegionSelector0 == 51) {
                                                                                                                return (csa) ((Object) stackIn_239_0);
                                                                                                              } else {
                                                                                                                if (decompiledRegionSelector0 == 52) {
                                                                                                                  return (csa) ((Object) stackIn_241_0);
                                                                                                                } else {
                                                                                                                  if (decompiledRegionSelector0 == 53) {
                                                                                                                    return (csa) ((Object) stackIn_243_0);
                                                                                                                  } else {
                                                                                                                    if (decompiledRegionSelector0 == 54) {
                                                                                                                      return (csa) ((Object) stackIn_245_0);
                                                                                                                    } else {
                                                                                                                      if (decompiledRegionSelector0 == 55) {
                                                                                                                        return (csa) ((Object) stackIn_247_0);
                                                                                                                      } else {
                                                                                                                        if (decompiledRegionSelector0 == 56) {
                                                                                                                          return (csa) ((Object) stackIn_249_0);
                                                                                                                        } else {
                                                                                                                          if (decompiledRegionSelector0 == 57) {
                                                                                                                            return (csa) ((Object) stackIn_251_0);
                                                                                                                          } else {
                                                                                                                            if (decompiledRegionSelector0 == 58) {
                                                                                                                              return (csa) ((Object) stackIn_253_0);
                                                                                                                            } else {
                                                                                                                              if (decompiledRegionSelector0 == 59) {
                                                                                                                                return (csa) ((Object) stackIn_255_0);
                                                                                                                              } else {
                                                                                                                                if (decompiledRegionSelector0 == 60) {
                                                                                                                                  return (csa) ((Object) stackIn_257_0);
                                                                                                                                } else {
                                                                                                                                  if (decompiledRegionSelector0 == 61) {
                                                                                                                                    return (csa) ((Object) stackIn_259_0);
                                                                                                                                  } else {
                                                                                                                                    return (csa) ((Object) stackIn_261_0);
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        csa stackOut_3_0 = null;
        csa stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 >= 109) {
              stackOut_3_0 = this.a(-29748, param0, 14);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (csa) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("rn.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              param2.a((byte) -127, param0.r(12), 10);
              param0.a(false, param2);
              if (param1 == -16097) {
                break L1;
              } else {
                field_a = (float[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("rn.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
        field_b = 0;
        field_a = new float[2];
    }
}
