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
                field_a = null;
                break L1;
              }
            }
            stackOut_2_0 = ((rn) this).a(param0, param2, (byte) -7, (csa) null);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("rn.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
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
        field_a = null;
    }

    private final csa a(int param0, la param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        si stackIn_101_0 = null;
        saa stackIn_103_0 = null;
        oma stackIn_105_0 = null;
        pw stackIn_107_0 = null;
        pw stackIn_109_0 = null;
        vka stackIn_111_0 = null;
        ve stackIn_113_0 = null;
        uea stackIn_115_0 = null;
        uk stackIn_117_0 = null;
        wqa stackIn_119_0 = null;
        bla stackIn_121_0 = null;
        aja stackIn_123_0 = null;
        gd stackIn_125_0 = null;
        tta stackIn_127_0 = null;
        lg stackIn_129_0 = null;
        tca stackIn_131_0 = null;
        ln stackIn_133_0 = null;
        ps stackIn_135_0 = null;
        m stackIn_137_0 = null;
        aw stackIn_139_0 = null;
        mh stackIn_141_0 = null;
        mh stackIn_143_0 = null;
        mj stackIn_145_0 = null;
        er stackIn_147_0 = null;
        bia stackIn_149_0 = null;
        wpa stackIn_151_0 = null;
        ih stackIn_153_0 = null;
        jh stackIn_155_0 = null;
        qta stackIn_157_0 = null;
        ipa stackIn_159_0 = null;
        sua stackIn_161_0 = null;
        ona stackIn_163_0 = null;
        ona stackIn_165_0 = null;
        kt stackIn_167_0 = null;
        wha stackIn_169_0 = null;
        wha stackIn_171_0 = null;
        jc stackIn_173_0 = null;
        md stackIn_175_0 = null;
        gw stackIn_177_0 = null;
        gw stackIn_179_0 = null;
        gw stackIn_181_0 = null;
        gw stackIn_183_0 = null;
        wta stackIn_185_0 = null;
        wfa stackIn_187_0 = null;
        mh stackIn_189_0 = null;
        mh stackIn_191_0 = null;
        lda stackIn_193_0 = null;
        lda stackIn_195_0 = null;
        df stackIn_197_0 = null;
        si stackIn_199_0 = null;
        aea stackIn_201_0 = null;
        uc stackIn_203_0 = null;
        tp stackIn_205_0 = null;
        jb stackIn_207_0 = null;
        pw stackIn_209_0 = null;
        pw stackIn_211_0 = null;
        nja stackIn_213_0 = null;
        si stackIn_215_0 = null;
        uka stackIn_217_0 = null;
        aw stackIn_219_0 = null;
        ln stackIn_221_0 = null;
        qi stackIn_223_0 = null;
        ga stackIn_225_0 = null;
        RuntimeException stackIn_228_0 = null;
        StringBuilder stackIn_228_1 = null;
        RuntimeException stackIn_229_0 = null;
        StringBuilder stackIn_229_1 = null;
        RuntimeException stackIn_230_0 = null;
        StringBuilder stackIn_230_1 = null;
        String stackIn_230_2 = null;
        RuntimeException decompiledCaughtException = null;
        oma stackOut_104_0 = null;
        pw stackOut_106_0 = null;
        pw stackOut_108_0 = null;
        uea stackOut_114_0 = null;
        wqa stackOut_118_0 = null;
        bla stackOut_120_0 = null;
        aja stackOut_122_0 = null;
        tca stackOut_130_0 = null;
        m stackOut_136_0 = null;
        mh stackOut_140_0 = null;
        mh stackOut_142_0 = null;
        mj stackOut_144_0 = null;
        er stackOut_146_0 = null;
        bia stackOut_148_0 = null;
        qta stackOut_156_0 = null;
        ona stackOut_164_0 = null;
        kt stackOut_166_0 = null;
        jc stackOut_172_0 = null;
        gw stackOut_180_0 = null;
        gw stackOut_182_0 = null;
        wfa stackOut_186_0 = null;
        mh stackOut_188_0 = null;
        mh stackOut_190_0 = null;
        lda stackOut_192_0 = null;
        lda stackOut_194_0 = null;
        tp stackOut_204_0 = null;
        pw stackOut_208_0 = null;
        pw stackOut_210_0 = null;
        nja stackOut_212_0 = null;
        ga stackOut_224_0 = null;
        qi stackOut_222_0 = null;
        ln stackOut_220_0 = null;
        aw stackOut_218_0 = null;
        uka stackOut_216_0 = null;
        si stackOut_214_0 = null;
        jb stackOut_206_0 = null;
        uc stackOut_202_0 = null;
        aea stackOut_200_0 = null;
        si stackOut_198_0 = null;
        df stackOut_196_0 = null;
        wta stackOut_184_0 = null;
        gw stackOut_178_0 = null;
        gw stackOut_176_0 = null;
        md stackOut_174_0 = null;
        wha stackOut_170_0 = null;
        wha stackOut_168_0 = null;
        ona stackOut_162_0 = null;
        sua stackOut_160_0 = null;
        ipa stackOut_158_0 = null;
        jh stackOut_154_0 = null;
        ih stackOut_152_0 = null;
        wpa stackOut_150_0 = null;
        aw stackOut_138_0 = null;
        ps stackOut_134_0 = null;
        ln stackOut_132_0 = null;
        lg stackOut_128_0 = null;
        tta stackOut_126_0 = null;
        gd stackOut_124_0 = null;
        uk stackOut_116_0 = null;
        ve stackOut_112_0 = null;
        vka stackOut_110_0 = null;
        saa stackOut_102_0 = null;
        si stackOut_100_0 = null;
        RuntimeException stackOut_227_0 = null;
        StringBuilder stackOut_227_1 = null;
        RuntimeException stackOut_229_0 = null;
        StringBuilder stackOut_229_1 = null;
        String stackOut_229_2 = null;
        RuntimeException stackOut_228_0 = null;
        StringBuilder stackOut_228_1 = null;
        String stackOut_228_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = 14;
          if (var4_int != 0) {
            if (var4_int != 1) {
              if (var4_int == 2) {
                stackOut_104_0 = new oma(param1, 14);
                stackIn_105_0 = stackOut_104_0;
                return (csa) (Object) stackIn_105_0;
              } else {
                if (3 == var4_int) {
                  stackOut_106_0 = new pw(param1, 14);
                  stackIn_107_0 = stackOut_106_0;
                  return (csa) (Object) stackIn_107_0;
                } else {
                  if (var4_int == 4) {
                    stackOut_108_0 = new pw(param1, 14);
                    stackIn_109_0 = stackOut_108_0;
                    return (csa) (Object) stackIn_109_0;
                  } else {
                    if (5 != var4_int) {
                      if (6 != var4_int) {
                        if (var4_int == 7) {
                          stackOut_114_0 = new uea(param1, 14);
                          stackIn_115_0 = stackOut_114_0;
                          return (csa) (Object) stackIn_115_0;
                        } else {
                          if (var4_int != 8) {
                            if (var4_int == 9) {
                              stackOut_118_0 = new wqa(param1, 14);
                              stackIn_119_0 = stackOut_118_0;
                              return (csa) (Object) stackIn_119_0;
                            } else {
                              if (var4_int == 10) {
                                stackOut_120_0 = new bla(param1, 14);
                                stackIn_121_0 = stackOut_120_0;
                                return (csa) (Object) stackIn_121_0;
                              } else {
                                if (var4_int == 11) {
                                  stackOut_122_0 = new aja(param1, 14);
                                  stackIn_123_0 = stackOut_122_0;
                                  return (csa) (Object) stackIn_123_0;
                                } else {
                                  if (var4_int != 12) {
                                    if (var4_int != 13) {
                                      if (var4_int != 14) {
                                        if (var4_int == 15) {
                                          stackOut_130_0 = new tca(param1, 14);
                                          stackIn_131_0 = stackOut_130_0;
                                          return (csa) (Object) stackIn_131_0;
                                        } else {
                                          if (var4_int != 16) {
                                            if (var4_int != 17) {
                                              if (var4_int == 18) {
                                                stackOut_136_0 = new m(param1, 14);
                                                stackIn_137_0 = stackOut_136_0;
                                                return (csa) (Object) stackIn_137_0;
                                              } else {
                                                if (19 != var4_int) {
                                                  if (var4_int == 20) {
                                                    stackOut_140_0 = new mh(param1, 14);
                                                    stackIn_141_0 = stackOut_140_0;
                                                    return (csa) (Object) stackIn_141_0;
                                                  } else {
                                                    if (var4_int == 21) {
                                                      stackOut_142_0 = new mh(param1, 14);
                                                      stackIn_143_0 = stackOut_142_0;
                                                      return (csa) (Object) stackIn_143_0;
                                                    } else {
                                                      if (22 == var4_int) {
                                                        stackOut_144_0 = new mj(param1, 14);
                                                        stackIn_145_0 = stackOut_144_0;
                                                        return (csa) (Object) stackIn_145_0;
                                                      } else {
                                                        if (var4_int == 23) {
                                                          stackOut_146_0 = new er(param1, 14);
                                                          stackIn_147_0 = stackOut_146_0;
                                                          return (csa) (Object) stackIn_147_0;
                                                        } else {
                                                          if (24 == var4_int) {
                                                            stackOut_148_0 = new bia(param1, 14);
                                                            stackIn_149_0 = stackOut_148_0;
                                                            return (csa) (Object) stackIn_149_0;
                                                          } else {
                                                            if (25 != var4_int) {
                                                              if (var4_int != 26) {
                                                                if (27 != var4_int) {
                                                                  if (var4_int == 28) {
                                                                    stackOut_156_0 = new qta(param1, 14);
                                                                    stackIn_157_0 = stackOut_156_0;
                                                                    return (csa) (Object) stackIn_157_0;
                                                                  } else {
                                                                    if (29 != var4_int) {
                                                                      if (var4_int != 30) {
                                                                        if (var4_int != 31) {
                                                                          if (32 == var4_int) {
                                                                            stackOut_164_0 = new ona(param1, 14);
                                                                            stackIn_165_0 = stackOut_164_0;
                                                                            return (csa) (Object) stackIn_165_0;
                                                                          } else {
                                                                            if (var4_int == 33) {
                                                                              stackOut_166_0 = new kt(param1, 14);
                                                                              stackIn_167_0 = stackOut_166_0;
                                                                              return (csa) (Object) stackIn_167_0;
                                                                            } else {
                                                                              if (var4_int != 34) {
                                                                                if (35 != var4_int) {
                                                                                  if (var4_int == 36) {
                                                                                    stackOut_172_0 = new jc(param1, 14);
                                                                                    stackIn_173_0 = stackOut_172_0;
                                                                                    return (csa) (Object) stackIn_173_0;
                                                                                  } else {
                                                                                    if (var4_int != 37) {
                                                                                      if (var4_int != 38) {
                                                                                        if (39 != var4_int) {
                                                                                          if (var4_int == 40) {
                                                                                            stackOut_180_0 = new gw(param1, 14);
                                                                                            stackIn_181_0 = stackOut_180_0;
                                                                                            return (csa) (Object) stackIn_181_0;
                                                                                          } else {
                                                                                            if (var4_int == 41) {
                                                                                              stackOut_182_0 = new gw(param1, 14);
                                                                                              stackIn_183_0 = stackOut_182_0;
                                                                                              return (csa) (Object) stackIn_183_0;
                                                                                            } else {
                                                                                              if (var4_int != 42) {
                                                                                                if (var4_int == 43) {
                                                                                                  stackOut_186_0 = new wfa(param1, 14);
                                                                                                  stackIn_187_0 = stackOut_186_0;
                                                                                                  return (csa) (Object) stackIn_187_0;
                                                                                                } else {
                                                                                                  if (var4_int == 44) {
                                                                                                    stackOut_188_0 = new mh(param1, 14);
                                                                                                    stackIn_189_0 = stackOut_188_0;
                                                                                                    return (csa) (Object) stackIn_189_0;
                                                                                                  } else {
                                                                                                    if (var4_int == 45) {
                                                                                                      stackOut_190_0 = new mh(param1, 14);
                                                                                                      stackIn_191_0 = stackOut_190_0;
                                                                                                      return (csa) (Object) stackIn_191_0;
                                                                                                    } else {
                                                                                                      if (var4_int == 46) {
                                                                                                        stackOut_192_0 = new lda(param1, 14);
                                                                                                        stackIn_193_0 = stackOut_192_0;
                                                                                                        return (csa) (Object) stackIn_193_0;
                                                                                                      } else {
                                                                                                        if (var4_int == 47) {
                                                                                                          stackOut_194_0 = new lda(param1, 14);
                                                                                                          stackIn_195_0 = stackOut_194_0;
                                                                                                          return (csa) (Object) stackIn_195_0;
                                                                                                        } else {
                                                                                                          if (48 != var4_int) {
                                                                                                            if (var4_int != 49) {
                                                                                                              if (var4_int != 50) {
                                                                                                                if (var4_int != 51) {
                                                                                                                  if (var4_int == 52) {
                                                                                                                    stackOut_204_0 = new tp(param1, 14);
                                                                                                                    stackIn_205_0 = stackOut_204_0;
                                                                                                                    return (csa) (Object) stackIn_205_0;
                                                                                                                  } else {
                                                                                                                    if (var4_int != 53) {
                                                                                                                      if (var4_int == 54) {
                                                                                                                        stackOut_208_0 = new pw(param1, 14);
                                                                                                                        stackIn_209_0 = stackOut_208_0;
                                                                                                                        return (csa) (Object) stackIn_209_0;
                                                                                                                      } else {
                                                                                                                        if (55 == var4_int) {
                                                                                                                          stackOut_210_0 = new pw(param1, 14);
                                                                                                                          stackIn_211_0 = stackOut_210_0;
                                                                                                                          return (csa) (Object) stackIn_211_0;
                                                                                                                        } else {
                                                                                                                          if (56 == var4_int) {
                                                                                                                            stackOut_212_0 = new nja(param1, 14);
                                                                                                                            stackIn_213_0 = stackOut_212_0;
                                                                                                                            return (csa) (Object) stackIn_213_0;
                                                                                                                          } else {
                                                                                                                            if (var4_int != 57) {
                                                                                                                              if (58 != var4_int) {
                                                                                                                                if (59 != var4_int) {
                                                                                                                                  if (var4_int != 60) {
                                                                                                                                    if (var4_int != 61) {
                                                                                                                                      if (var4_int != 62) {
                                                                                                                                        throw new IllegalStateException("Unrecognised component type: " + 14);
                                                                                                                                      } else {
                                                                                                                                        stackOut_224_0 = new ga(param1, 14);
                                                                                                                                        stackIn_225_0 = stackOut_224_0;
                                                                                                                                        return (csa) (Object) stackIn_225_0;
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      stackOut_222_0 = new qi(param1, 14);
                                                                                                                                      stackIn_223_0 = stackOut_222_0;
                                                                                                                                      return (csa) (Object) stackIn_223_0;
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    stackOut_220_0 = new ln(param1, 14);
                                                                                                                                    stackIn_221_0 = stackOut_220_0;
                                                                                                                                    return (csa) (Object) stackIn_221_0;
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  stackOut_218_0 = new aw(param1, 14);
                                                                                                                                  stackIn_219_0 = stackOut_218_0;
                                                                                                                                  return (csa) (Object) stackIn_219_0;
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                stackOut_216_0 = new uka(param1, 14);
                                                                                                                                stackIn_217_0 = stackOut_216_0;
                                                                                                                                return (csa) (Object) stackIn_217_0;
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              stackOut_214_0 = new si(param1, 14);
                                                                                                                              stackIn_215_0 = stackOut_214_0;
                                                                                                                              return (csa) (Object) stackIn_215_0;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      stackOut_206_0 = new jb(param1, 14);
                                                                                                                      stackIn_207_0 = stackOut_206_0;
                                                                                                                      return (csa) (Object) stackIn_207_0;
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  stackOut_202_0 = new uc(param1, 14);
                                                                                                                  stackIn_203_0 = stackOut_202_0;
                                                                                                                  return (csa) (Object) stackIn_203_0;
                                                                                                                }
                                                                                                              } else {
                                                                                                                stackOut_200_0 = new aea(param1, 14);
                                                                                                                stackIn_201_0 = stackOut_200_0;
                                                                                                                return (csa) (Object) stackIn_201_0;
                                                                                                              }
                                                                                                            } else {
                                                                                                              stackOut_198_0 = new si(param1, 14);
                                                                                                              stackIn_199_0 = stackOut_198_0;
                                                                                                              return (csa) (Object) stackIn_199_0;
                                                                                                            }
                                                                                                          } else {
                                                                                                            stackOut_196_0 = new df(param1, 14);
                                                                                                            stackIn_197_0 = stackOut_196_0;
                                                                                                            return (csa) (Object) stackIn_197_0;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                stackOut_184_0 = new wta(param1, 14);
                                                                                                stackIn_185_0 = stackOut_184_0;
                                                                                                return (csa) (Object) stackIn_185_0;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          stackOut_178_0 = new gw(param1, 14);
                                                                                          stackIn_179_0 = stackOut_178_0;
                                                                                          return (csa) (Object) stackIn_179_0;
                                                                                        }
                                                                                      } else {
                                                                                        stackOut_176_0 = new gw(param1, 14);
                                                                                        stackIn_177_0 = stackOut_176_0;
                                                                                        return (csa) (Object) stackIn_177_0;
                                                                                      }
                                                                                    } else {
                                                                                      stackOut_174_0 = new md(param1, 14);
                                                                                      stackIn_175_0 = stackOut_174_0;
                                                                                      return (csa) (Object) stackIn_175_0;
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  stackOut_170_0 = new wha(param1, 14);
                                                                                  stackIn_171_0 = stackOut_170_0;
                                                                                  return (csa) (Object) stackIn_171_0;
                                                                                }
                                                                              } else {
                                                                                stackOut_168_0 = new wha(param1, 14);
                                                                                stackIn_169_0 = stackOut_168_0;
                                                                                return (csa) (Object) stackIn_169_0;
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          stackOut_162_0 = new ona(param1, 14);
                                                                          stackIn_163_0 = stackOut_162_0;
                                                                          return (csa) (Object) stackIn_163_0;
                                                                        }
                                                                      } else {
                                                                        stackOut_160_0 = new sua(param1, 14);
                                                                        stackIn_161_0 = stackOut_160_0;
                                                                        return (csa) (Object) stackIn_161_0;
                                                                      }
                                                                    } else {
                                                                      stackOut_158_0 = new ipa(param1, 14);
                                                                      stackIn_159_0 = stackOut_158_0;
                                                                      return (csa) (Object) stackIn_159_0;
                                                                    }
                                                                  }
                                                                } else {
                                                                  stackOut_154_0 = new jh(param1, 14);
                                                                  stackIn_155_0 = stackOut_154_0;
                                                                  return (csa) (Object) stackIn_155_0;
                                                                }
                                                              } else {
                                                                stackOut_152_0 = new ih(param1, 14);
                                                                stackIn_153_0 = stackOut_152_0;
                                                                return (csa) (Object) stackIn_153_0;
                                                              }
                                                            } else {
                                                              stackOut_150_0 = new wpa(param1, 14);
                                                              stackIn_151_0 = stackOut_150_0;
                                                              return (csa) (Object) stackIn_151_0;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  stackOut_138_0 = new aw(param1, 14);
                                                  stackIn_139_0 = stackOut_138_0;
                                                  return (csa) (Object) stackIn_139_0;
                                                }
                                              }
                                            } else {
                                              stackOut_134_0 = new ps(param1, 14);
                                              stackIn_135_0 = stackOut_134_0;
                                              return (csa) (Object) stackIn_135_0;
                                            }
                                          } else {
                                            stackOut_132_0 = new ln(param1, 14);
                                            stackIn_133_0 = stackOut_132_0;
                                            return (csa) (Object) stackIn_133_0;
                                          }
                                        }
                                      } else {
                                        stackOut_128_0 = new lg(param1, 14);
                                        stackIn_129_0 = stackOut_128_0;
                                        return (csa) (Object) stackIn_129_0;
                                      }
                                    } else {
                                      stackOut_126_0 = new tta(param1, 14);
                                      stackIn_127_0 = stackOut_126_0;
                                      return (csa) (Object) stackIn_127_0;
                                    }
                                  } else {
                                    stackOut_124_0 = new gd(param1, 14);
                                    stackIn_125_0 = stackOut_124_0;
                                    return (csa) (Object) stackIn_125_0;
                                  }
                                }
                              }
                            }
                          } else {
                            stackOut_116_0 = new uk(param1, 14);
                            stackIn_117_0 = stackOut_116_0;
                            return (csa) (Object) stackIn_117_0;
                          }
                        }
                      } else {
                        stackOut_112_0 = new ve(param1, 14);
                        stackIn_113_0 = stackOut_112_0;
                        return (csa) (Object) stackIn_113_0;
                      }
                    } else {
                      stackOut_110_0 = new vka(param1, 14);
                      stackIn_111_0 = stackOut_110_0;
                      return (csa) (Object) stackIn_111_0;
                    }
                  }
                }
              }
            } else {
              stackOut_102_0 = new saa(param1, 14);
              stackIn_103_0 = stackOut_102_0;
              return (csa) (Object) stackIn_103_0;
            }
          } else {
            stackOut_100_0 = new si(param1, 14);
            stackIn_101_0 = stackOut_100_0;
            return (csa) (Object) stackIn_101_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_227_0 = (RuntimeException) var4;
            stackOut_227_1 = new StringBuilder().append("rn.E(").append(-29748).append(',');
            stackIn_229_0 = stackOut_227_0;
            stackIn_229_1 = stackOut_227_1;
            stackIn_228_0 = stackOut_227_0;
            stackIn_228_1 = stackOut_227_1;
            if (param1 == null) {
              stackOut_229_0 = (RuntimeException) (Object) stackIn_229_0;
              stackOut_229_1 = (StringBuilder) (Object) stackIn_229_1;
              stackOut_229_2 = "null";
              stackIn_230_0 = stackOut_229_0;
              stackIn_230_1 = stackOut_229_1;
              stackIn_230_2 = stackOut_229_2;
              break L0;
            } else {
              stackOut_228_0 = (RuntimeException) (Object) stackIn_228_0;
              stackOut_228_1 = (StringBuilder) (Object) stackIn_228_1;
              stackOut_228_2 = "{...}";
              stackIn_230_0 = stackOut_228_0;
              stackIn_230_1 = stackOut_228_1;
              stackIn_230_2 = stackOut_228_2;
              break L0;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_230_0, stackIn_230_2 + ',' + 14 + ')');
        }
    }

    public final csa a(kh param0, la param1, byte param2, csa param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
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
        RuntimeException stackIn_229_0 = null;
        StringBuilder stackIn_229_1 = null;
        RuntimeException stackIn_230_0 = null;
        StringBuilder stackIn_230_1 = null;
        RuntimeException stackIn_231_0 = null;
        StringBuilder stackIn_231_1 = null;
        String stackIn_231_2 = null;
        RuntimeException stackIn_232_0 = null;
        StringBuilder stackIn_232_1 = null;
        RuntimeException stackIn_233_0 = null;
        StringBuilder stackIn_233_1 = null;
        RuntimeException stackIn_234_0 = null;
        StringBuilder stackIn_234_1 = null;
        String stackIn_234_2 = null;
        RuntimeException stackIn_235_0 = null;
        StringBuilder stackIn_235_1 = null;
        RuntimeException stackIn_236_0 = null;
        StringBuilder stackIn_236_1 = null;
        RuntimeException stackIn_237_0 = null;
        StringBuilder stackIn_237_1 = null;
        String stackIn_237_2 = null;
        RuntimeException decompiledCaughtException = null;
        saa stackOut_103_0 = null;
        pw stackOut_107_0 = null;
        pw stackOut_109_0 = null;
        vka stackOut_111_0 = null;
        ve stackOut_113_0 = null;
        uk stackOut_117_0 = null;
        wqa stackOut_119_0 = null;
        bla stackOut_121_0 = null;
        tca stackOut_131_0 = null;
        aw stackOut_139_0 = null;
        mh stackOut_143_0 = null;
        er stackOut_147_0 = null;
        bia stackOut_149_0 = null;
        wpa stackOut_151_0 = null;
        ih stackOut_153_0 = null;
        qta stackOut_157_0 = null;
        sua stackOut_161_0 = null;
        ona stackOut_163_0 = null;
        ona stackOut_165_0 = null;
        wha stackOut_169_0 = null;
        gw stackOut_181_0 = null;
        wta stackOut_185_0 = null;
        df stackOut_197_0 = null;
        aea stackOut_201_0 = null;
        pw stackOut_209_0 = null;
        pw stackOut_211_0 = null;
        si stackOut_215_0 = null;
        ln stackOut_221_0 = null;
        ga stackOut_225_0 = null;
        qi stackOut_223_0 = null;
        aw stackOut_219_0 = null;
        uka stackOut_217_0 = null;
        nja stackOut_213_0 = null;
        jb stackOut_207_0 = null;
        tp stackOut_205_0 = null;
        uc stackOut_203_0 = null;
        si stackOut_199_0 = null;
        lda stackOut_195_0 = null;
        lda stackOut_193_0 = null;
        mh stackOut_191_0 = null;
        mh stackOut_189_0 = null;
        wfa stackOut_187_0 = null;
        gw stackOut_183_0 = null;
        gw stackOut_179_0 = null;
        gw stackOut_177_0 = null;
        md stackOut_175_0 = null;
        jc stackOut_173_0 = null;
        wha stackOut_171_0 = null;
        kt stackOut_167_0 = null;
        ipa stackOut_159_0 = null;
        jh stackOut_155_0 = null;
        mj stackOut_145_0 = null;
        mh stackOut_141_0 = null;
        m stackOut_137_0 = null;
        ps stackOut_135_0 = null;
        ln stackOut_133_0 = null;
        lg stackOut_129_0 = null;
        tta stackOut_127_0 = null;
        gd stackOut_125_0 = null;
        aja stackOut_123_0 = null;
        uea stackOut_115_0 = null;
        oma stackOut_105_0 = null;
        si stackOut_101_0 = null;
        RuntimeException stackOut_228_0 = null;
        StringBuilder stackOut_228_1 = null;
        RuntimeException stackOut_230_0 = null;
        StringBuilder stackOut_230_1 = null;
        String stackOut_230_2 = null;
        RuntimeException stackOut_229_0 = null;
        StringBuilder stackOut_229_1 = null;
        String stackOut_229_2 = null;
        RuntimeException stackOut_231_0 = null;
        StringBuilder stackOut_231_1 = null;
        RuntimeException stackOut_233_0 = null;
        StringBuilder stackOut_233_1 = null;
        String stackOut_233_2 = null;
        RuntimeException stackOut_232_0 = null;
        StringBuilder stackOut_232_1 = null;
        String stackOut_232_2 = null;
        RuntimeException stackOut_234_0 = null;
        StringBuilder stackOut_234_1 = null;
        RuntimeException stackOut_236_0 = null;
        StringBuilder stackOut_236_1 = null;
        String stackOut_236_2 = null;
        RuntimeException stackOut_235_0 = null;
        StringBuilder stackOut_235_1 = null;
        String stackOut_235_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = param0.b((byte) 44, 10);
            if (param2 == -7) {
              break L0;
            } else {
              field_a = null;
              break L0;
            }
          }
          var6 = var5_int;
          if (0 != var6) {
            if (var6 == 1) {
              stackOut_103_0 = new saa(param1, var5_int, param0, param3);
              stackIn_104_0 = stackOut_103_0;
              return (csa) (Object) stackIn_104_0;
            } else {
              if (2 != var6) {
                if (var6 == 3) {
                  stackOut_107_0 = new pw(param1, var5_int, param0, param3);
                  stackIn_108_0 = stackOut_107_0;
                  return (csa) (Object) stackIn_108_0;
                } else {
                  if (4 == var6) {
                    stackOut_109_0 = new pw(param1, var5_int, param0, param3);
                    stackIn_110_0 = stackOut_109_0;
                    return (csa) (Object) stackIn_110_0;
                  } else {
                    if (var6 == 5) {
                      stackOut_111_0 = new vka(param1, var5_int, param0, param3);
                      stackIn_112_0 = stackOut_111_0;
                      return (csa) (Object) stackIn_112_0;
                    } else {
                      if (6 == var6) {
                        stackOut_113_0 = new ve(param1, var5_int, param0, param3);
                        stackIn_114_0 = stackOut_113_0;
                        return (csa) (Object) stackIn_114_0;
                      } else {
                        if (var6 != 7) {
                          if (var6 == 8) {
                            stackOut_117_0 = new uk(param1, var5_int, param0, param3);
                            stackIn_118_0 = stackOut_117_0;
                            return (csa) (Object) stackIn_118_0;
                          } else {
                            if (var6 == 9) {
                              stackOut_119_0 = new wqa(param1, var5_int, param0, param3);
                              stackIn_120_0 = stackOut_119_0;
                              return (csa) (Object) stackIn_120_0;
                            } else {
                              if (var6 == 10) {
                                stackOut_121_0 = new bla(param1, var5_int, param0, param3);
                                stackIn_122_0 = stackOut_121_0;
                                return (csa) (Object) stackIn_122_0;
                              } else {
                                if (var6 != 11) {
                                  if (var6 != 12) {
                                    if (var6 != 13) {
                                      if (var6 != 14) {
                                        if (15 == var6) {
                                          stackOut_131_0 = new tca(param1, var5_int, param0, param3);
                                          stackIn_132_0 = stackOut_131_0;
                                          return (csa) (Object) stackIn_132_0;
                                        } else {
                                          if (var6 != 16) {
                                            if (var6 != 17) {
                                              if (var6 != 18) {
                                                if (var6 == 19) {
                                                  stackOut_139_0 = new aw(param1, var5_int, param0, param3);
                                                  stackIn_140_0 = stackOut_139_0;
                                                  return (csa) (Object) stackIn_140_0;
                                                } else {
                                                  if (var6 != 20) {
                                                    if (21 == var6) {
                                                      stackOut_143_0 = new mh(param1, var5_int, param0, param3);
                                                      stackIn_144_0 = stackOut_143_0;
                                                      return (csa) (Object) stackIn_144_0;
                                                    } else {
                                                      if (var6 != 22) {
                                                        if (23 == var6) {
                                                          stackOut_147_0 = new er(param1, var5_int, param0, param3);
                                                          stackIn_148_0 = stackOut_147_0;
                                                          return (csa) (Object) stackIn_148_0;
                                                        } else {
                                                          if (var6 == 24) {
                                                            stackOut_149_0 = new bia(param1, var5_int, param0, param3);
                                                            stackIn_150_0 = stackOut_149_0;
                                                            return (csa) (Object) stackIn_150_0;
                                                          } else {
                                                            if (var6 == 25) {
                                                              stackOut_151_0 = new wpa(param1, var5_int, param0, param3);
                                                              stackIn_152_0 = stackOut_151_0;
                                                              return (csa) (Object) stackIn_152_0;
                                                            } else {
                                                              if (var6 == 26) {
                                                                stackOut_153_0 = new ih(param1, var5_int, param0, param3);
                                                                stackIn_154_0 = stackOut_153_0;
                                                                return (csa) (Object) stackIn_154_0;
                                                              } else {
                                                                if (var6 != 27) {
                                                                  if (28 == var6) {
                                                                    stackOut_157_0 = new qta(param1, var5_int, param0, param3);
                                                                    stackIn_158_0 = stackOut_157_0;
                                                                    return (csa) (Object) stackIn_158_0;
                                                                  } else {
                                                                    if (var6 != 29) {
                                                                      if (var6 == 30) {
                                                                        stackOut_161_0 = new sua(param1, var5_int, param0, param3);
                                                                        stackIn_162_0 = stackOut_161_0;
                                                                        return (csa) (Object) stackIn_162_0;
                                                                      } else {
                                                                        if (31 == var6) {
                                                                          stackOut_163_0 = new ona(param1, var5_int, param0, param3);
                                                                          stackIn_164_0 = stackOut_163_0;
                                                                          return (csa) (Object) stackIn_164_0;
                                                                        } else {
                                                                          if (var6 == 32) {
                                                                            stackOut_165_0 = new ona(param1, var5_int, param0, param3);
                                                                            stackIn_166_0 = stackOut_165_0;
                                                                            return (csa) (Object) stackIn_166_0;
                                                                          } else {
                                                                            if (var6 != 33) {
                                                                              if (var6 == 34) {
                                                                                stackOut_169_0 = new wha(param1, var5_int, param0, param3);
                                                                                stackIn_170_0 = stackOut_169_0;
                                                                                return (csa) (Object) stackIn_170_0;
                                                                              } else {
                                                                                if (var6 != 35) {
                                                                                  if (36 != var6) {
                                                                                    if (var6 != 37) {
                                                                                      if (var6 != 38) {
                                                                                        if (var6 != 39) {
                                                                                          if (40 == var6) {
                                                                                            stackOut_181_0 = new gw(param1, var5_int, param0, param3);
                                                                                            stackIn_182_0 = stackOut_181_0;
                                                                                            return (csa) (Object) stackIn_182_0;
                                                                                          } else {
                                                                                            if (var6 != 41) {
                                                                                              if (var6 == 42) {
                                                                                                stackOut_185_0 = new wta(param1, var5_int, param0, param3);
                                                                                                stackIn_186_0 = stackOut_185_0;
                                                                                                return (csa) (Object) stackIn_186_0;
                                                                                              } else {
                                                                                                if (var6 != 43) {
                                                                                                  if (var6 != 44) {
                                                                                                    if (var6 != 45) {
                                                                                                      if (var6 != 46) {
                                                                                                        if (var6 != 47) {
                                                                                                          if (var6 == 48) {
                                                                                                            stackOut_197_0 = new df(param1, var5_int, param0, param3);
                                                                                                            stackIn_198_0 = stackOut_197_0;
                                                                                                            return (csa) (Object) stackIn_198_0;
                                                                                                          } else {
                                                                                                            if (var6 != 49) {
                                                                                                              if (var6 == 50) {
                                                                                                                stackOut_201_0 = new aea(param1, var5_int, param0, param3);
                                                                                                                stackIn_202_0 = stackOut_201_0;
                                                                                                                return (csa) (Object) stackIn_202_0;
                                                                                                              } else {
                                                                                                                if (var6 != 51) {
                                                                                                                  if (52 != var6) {
                                                                                                                    if (var6 != 53) {
                                                                                                                      if (54 == var6) {
                                                                                                                        stackOut_209_0 = new pw(param1, var5_int, param0, param3);
                                                                                                                        stackIn_210_0 = stackOut_209_0;
                                                                                                                        return (csa) (Object) stackIn_210_0;
                                                                                                                      } else {
                                                                                                                        if (var6 == 55) {
                                                                                                                          stackOut_211_0 = new pw(param1, var5_int, param0, param3);
                                                                                                                          stackIn_212_0 = stackOut_211_0;
                                                                                                                          return (csa) (Object) stackIn_212_0;
                                                                                                                        } else {
                                                                                                                          if (var6 != 56) {
                                                                                                                            if (var6 == 57) {
                                                                                                                              stackOut_215_0 = new si(param1, var5_int, param0, param3);
                                                                                                                              stackIn_216_0 = stackOut_215_0;
                                                                                                                              return (csa) (Object) stackIn_216_0;
                                                                                                                            } else {
                                                                                                                              if (58 != var6) {
                                                                                                                                if (59 != var6) {
                                                                                                                                  if (var6 == 60) {
                                                                                                                                    stackOut_221_0 = new ln(param1, var5_int, param0, param3);
                                                                                                                                    stackIn_222_0 = stackOut_221_0;
                                                                                                                                    return (csa) (Object) stackIn_222_0;
                                                                                                                                  } else {
                                                                                                                                    if (var6 != 61) {
                                                                                                                                      if (var6 != 62) {
                                                                                                                                        throw new IllegalStateException("Unrecognised component type: " + var5_int);
                                                                                                                                      } else {
                                                                                                                                        stackOut_225_0 = new ga(param1, var5_int, param0, param3);
                                                                                                                                        stackIn_226_0 = stackOut_225_0;
                                                                                                                                        return (csa) (Object) stackIn_226_0;
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      stackOut_223_0 = new qi(param1, var5_int, param0, param3);
                                                                                                                                      stackIn_224_0 = stackOut_223_0;
                                                                                                                                      return (csa) (Object) stackIn_224_0;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  stackOut_219_0 = new aw(param1, var5_int, param0, param3);
                                                                                                                                  stackIn_220_0 = stackOut_219_0;
                                                                                                                                  return (csa) (Object) stackIn_220_0;
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                stackOut_217_0 = new uka(param1, var5_int, param0, param3);
                                                                                                                                stackIn_218_0 = stackOut_217_0;
                                                                                                                                return (csa) (Object) stackIn_218_0;
                                                                                                                              }
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            stackOut_213_0 = new nja(param1, var5_int, param0, param3);
                                                                                                                            stackIn_214_0 = stackOut_213_0;
                                                                                                                            return (csa) (Object) stackIn_214_0;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      stackOut_207_0 = new jb(param1, var5_int, param0, param3);
                                                                                                                      stackIn_208_0 = stackOut_207_0;
                                                                                                                      return (csa) (Object) stackIn_208_0;
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    stackOut_205_0 = new tp(param1, var5_int, param0, param3);
                                                                                                                    stackIn_206_0 = stackOut_205_0;
                                                                                                                    return (csa) (Object) stackIn_206_0;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  stackOut_203_0 = new uc(param1, var5_int, param0, param3);
                                                                                                                  stackIn_204_0 = stackOut_203_0;
                                                                                                                  return (csa) (Object) stackIn_204_0;
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              stackOut_199_0 = new si(param1, var5_int, param0, param3);
                                                                                                              stackIn_200_0 = stackOut_199_0;
                                                                                                              return (csa) (Object) stackIn_200_0;
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          stackOut_195_0 = new lda(param1, var5_int, param0, param3);
                                                                                                          stackIn_196_0 = stackOut_195_0;
                                                                                                          return (csa) (Object) stackIn_196_0;
                                                                                                        }
                                                                                                      } else {
                                                                                                        stackOut_193_0 = new lda(param1, var5_int, param0, param3);
                                                                                                        stackIn_194_0 = stackOut_193_0;
                                                                                                        return (csa) (Object) stackIn_194_0;
                                                                                                      }
                                                                                                    } else {
                                                                                                      stackOut_191_0 = new mh(param1, var5_int, param0, param3);
                                                                                                      stackIn_192_0 = stackOut_191_0;
                                                                                                      return (csa) (Object) stackIn_192_0;
                                                                                                    }
                                                                                                  } else {
                                                                                                    stackOut_189_0 = new mh(param1, var5_int, param0, param3);
                                                                                                    stackIn_190_0 = stackOut_189_0;
                                                                                                    return (csa) (Object) stackIn_190_0;
                                                                                                  }
                                                                                                } else {
                                                                                                  stackOut_187_0 = new wfa(param1, var5_int, param0, param3);
                                                                                                  stackIn_188_0 = stackOut_187_0;
                                                                                                  return (csa) (Object) stackIn_188_0;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              stackOut_183_0 = new gw(param1, var5_int, param0, param3);
                                                                                              stackIn_184_0 = stackOut_183_0;
                                                                                              return (csa) (Object) stackIn_184_0;
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          stackOut_179_0 = new gw(param1, var5_int, param0, param3);
                                                                                          stackIn_180_0 = stackOut_179_0;
                                                                                          return (csa) (Object) stackIn_180_0;
                                                                                        }
                                                                                      } else {
                                                                                        stackOut_177_0 = new gw(param1, var5_int, param0, param3);
                                                                                        stackIn_178_0 = stackOut_177_0;
                                                                                        return (csa) (Object) stackIn_178_0;
                                                                                      }
                                                                                    } else {
                                                                                      stackOut_175_0 = new md(param1, var5_int, param0, param3);
                                                                                      stackIn_176_0 = stackOut_175_0;
                                                                                      return (csa) (Object) stackIn_176_0;
                                                                                    }
                                                                                  } else {
                                                                                    stackOut_173_0 = new jc(param1, var5_int, param0, param3);
                                                                                    stackIn_174_0 = stackOut_173_0;
                                                                                    return (csa) (Object) stackIn_174_0;
                                                                                  }
                                                                                } else {
                                                                                  stackOut_171_0 = new wha(param1, var5_int, param0, param3);
                                                                                  stackIn_172_0 = stackOut_171_0;
                                                                                  return (csa) (Object) stackIn_172_0;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              stackOut_167_0 = new kt(param1, var5_int, param0, param3);
                                                                              stackIn_168_0 = stackOut_167_0;
                                                                              return (csa) (Object) stackIn_168_0;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      stackOut_159_0 = new ipa(param1, var5_int, param0, param3);
                                                                      stackIn_160_0 = stackOut_159_0;
                                                                      return (csa) (Object) stackIn_160_0;
                                                                    }
                                                                  }
                                                                } else {
                                                                  stackOut_155_0 = new jh(param1, var5_int, param0, param3);
                                                                  stackIn_156_0 = stackOut_155_0;
                                                                  return (csa) (Object) stackIn_156_0;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        stackOut_145_0 = new mj(param1, var5_int, param0, param3);
                                                        stackIn_146_0 = stackOut_145_0;
                                                        return (csa) (Object) stackIn_146_0;
                                                      }
                                                    }
                                                  } else {
                                                    stackOut_141_0 = new mh(param1, var5_int, param0, param3);
                                                    stackIn_142_0 = stackOut_141_0;
                                                    return (csa) (Object) stackIn_142_0;
                                                  }
                                                }
                                              } else {
                                                stackOut_137_0 = new m(param1, var5_int, param0, param3);
                                                stackIn_138_0 = stackOut_137_0;
                                                return (csa) (Object) stackIn_138_0;
                                              }
                                            } else {
                                              stackOut_135_0 = new ps(param1, var5_int, param0, param3);
                                              stackIn_136_0 = stackOut_135_0;
                                              return (csa) (Object) stackIn_136_0;
                                            }
                                          } else {
                                            stackOut_133_0 = new ln(param1, var5_int, param0, param3);
                                            stackIn_134_0 = stackOut_133_0;
                                            return (csa) (Object) stackIn_134_0;
                                          }
                                        }
                                      } else {
                                        stackOut_129_0 = new lg(param1, var5_int, param0, param3);
                                        stackIn_130_0 = stackOut_129_0;
                                        return (csa) (Object) stackIn_130_0;
                                      }
                                    } else {
                                      stackOut_127_0 = new tta(param1, var5_int, param0, param3);
                                      stackIn_128_0 = stackOut_127_0;
                                      return (csa) (Object) stackIn_128_0;
                                    }
                                  } else {
                                    stackOut_125_0 = new gd(param1, var5_int, param0, param3);
                                    stackIn_126_0 = stackOut_125_0;
                                    return (csa) (Object) stackIn_126_0;
                                  }
                                } else {
                                  stackOut_123_0 = new aja(param1, var5_int, param0, param3);
                                  stackIn_124_0 = stackOut_123_0;
                                  return (csa) (Object) stackIn_124_0;
                                }
                              }
                            }
                          }
                        } else {
                          stackOut_115_0 = new uea(param1, var5_int, param0, param3);
                          stackIn_116_0 = stackOut_115_0;
                          return (csa) (Object) stackIn_116_0;
                        }
                      }
                    }
                  }
                }
              } else {
                stackOut_105_0 = new oma(param1, var5_int, param0, param3);
                stackIn_106_0 = stackOut_105_0;
                return (csa) (Object) stackIn_106_0;
              }
            }
          } else {
            stackOut_101_0 = new si(param1, var5_int, param0, param3);
            stackIn_102_0 = stackOut_101_0;
            return (csa) (Object) stackIn_102_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_228_0 = (RuntimeException) var5;
            stackOut_228_1 = new StringBuilder().append("rn.A(");
            stackIn_230_0 = stackOut_228_0;
            stackIn_230_1 = stackOut_228_1;
            stackIn_229_0 = stackOut_228_0;
            stackIn_229_1 = stackOut_228_1;
            if (param0 == null) {
              stackOut_230_0 = (RuntimeException) (Object) stackIn_230_0;
              stackOut_230_1 = (StringBuilder) (Object) stackIn_230_1;
              stackOut_230_2 = "null";
              stackIn_231_0 = stackOut_230_0;
              stackIn_231_1 = stackOut_230_1;
              stackIn_231_2 = stackOut_230_2;
              break L1;
            } else {
              stackOut_229_0 = (RuntimeException) (Object) stackIn_229_0;
              stackOut_229_1 = (StringBuilder) (Object) stackIn_229_1;
              stackOut_229_2 = "{...}";
              stackIn_231_0 = stackOut_229_0;
              stackIn_231_1 = stackOut_229_1;
              stackIn_231_2 = stackOut_229_2;
              break L1;
            }
          }
          L2: {
            stackOut_231_0 = (RuntimeException) (Object) stackIn_231_0;
            stackOut_231_1 = ((StringBuilder) (Object) stackIn_231_1).append(stackIn_231_2).append(',');
            stackIn_233_0 = stackOut_231_0;
            stackIn_233_1 = stackOut_231_1;
            stackIn_232_0 = stackOut_231_0;
            stackIn_232_1 = stackOut_231_1;
            if (param1 == null) {
              stackOut_233_0 = (RuntimeException) (Object) stackIn_233_0;
              stackOut_233_1 = (StringBuilder) (Object) stackIn_233_1;
              stackOut_233_2 = "null";
              stackIn_234_0 = stackOut_233_0;
              stackIn_234_1 = stackOut_233_1;
              stackIn_234_2 = stackOut_233_2;
              break L2;
            } else {
              stackOut_232_0 = (RuntimeException) (Object) stackIn_232_0;
              stackOut_232_1 = (StringBuilder) (Object) stackIn_232_1;
              stackOut_232_2 = "{...}";
              stackIn_234_0 = stackOut_232_0;
              stackIn_234_1 = stackOut_232_1;
              stackIn_234_2 = stackOut_232_2;
              break L2;
            }
          }
          L3: {
            stackOut_234_0 = (RuntimeException) (Object) stackIn_234_0;
            stackOut_234_1 = ((StringBuilder) (Object) stackIn_234_1).append(stackIn_234_2).append(',').append(param2).append(',');
            stackIn_236_0 = stackOut_234_0;
            stackIn_236_1 = stackOut_234_1;
            stackIn_235_0 = stackOut_234_0;
            stackIn_235_1 = stackOut_234_1;
            if (param3 == null) {
              stackOut_236_0 = (RuntimeException) (Object) stackIn_236_0;
              stackOut_236_1 = (StringBuilder) (Object) stackIn_236_1;
              stackOut_236_2 = "null";
              stackIn_237_0 = stackOut_236_0;
              stackIn_237_1 = stackOut_236_1;
              stackIn_237_2 = stackOut_236_2;
              break L3;
            } else {
              stackOut_235_0 = (RuntimeException) (Object) stackIn_235_0;
              stackOut_235_1 = (StringBuilder) (Object) stackIn_235_1;
              stackOut_235_2 = "{...}";
              stackIn_237_0 = stackOut_235_0;
              stackIn_237_1 = stackOut_235_1;
              stackIn_237_2 = stackOut_235_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_237_0, stackIn_237_2 + ')');
        }
    }

    final static boolean a(int param0) {
        return oea.field_i != null;
    }

    public final csa a(la param0, byte param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        csa stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        csa stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (csa) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("rn.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
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
                field_a = null;
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
            stackOut_3_1 = new StringBuilder().append("rn.B(");
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = new float[2];
    }
}
