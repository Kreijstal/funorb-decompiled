/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb implements vc {
    static java.awt.Color field_f;
    private int field_a;
    static String field_b;
    static String field_d;
    static vj field_c;
    static long field_e;

    private final boolean d(int param0) {
        boolean stackIn_18_0 = false;
        int var2;
        GameplayScreen var3;
        MultiplayerMatch var4;
        if (!ue.field_c) {
          return false;
        }
        if (pf.a(false, -2)) {
          return false;
        }
        if (pf.a(false, 19)) {
          return true;
        }
        var2 = -78 / ((0 - param0) / 34);
        if (null == pe.gameplayScreen) {
          return false;
        }
        if (!pe.gameplayScreen.field_p) {
          return false;
        }
        var3 = pe.gameplayScreen;
        var4 = var3.match;
        if (var3.c(99)) {
          return true;
        }
        if (var3.match.field_c) {
          return true;
        }
        stackIn_18_0 = (((var4.playerMaskThree | var4.playerMaskTwo | var4.playerMaskOne) & var3.field_o) != 0);
        return stackIn_18_0;
    }

    public final void a(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        RgbSprite stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_27_3;
        int stackIn_46_0 = 0;
        RgbSprite stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_53_3;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_63_0 = 0;
        RgbSprite stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int stackIn_70_3;
        RgbSprite stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        int stackIn_80_3;
        RgbSprite stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_89_2 = 0;
        int stackIn_90_3;
        RgbSprite stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        int stackIn_99_3;
        RgbSprite stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        int stackIn_108_2 = 0;
        int stackIn_109_3;
        int stackIn_116_0 = 0;
        int stackIn_120_0 = 0;
        RgbSprite stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        int stackIn_127_3;
        RgbSprite stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        int stackIn_136_2 = 0;
        int stackIn_137_3;
        RgbSprite stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        int stackIn_146_2 = 0;
        int stackIn_147_3;
        RgbSprite stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        int stackIn_155_2 = 0;
        int stackIn_156_3;
        RgbSprite stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        int stackIn_165_2 = 0;
        int stackIn_166_3;
        int stackIn_172_0 = 0;
        int stackIn_181_0 = 0;
        RgbSprite stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        int stackIn_188_2 = 0;
        int stackIn_189_3;
        int stackIn_194_0 = 0;
        int stackIn_198_0 = 0;
        RgbSprite stackIn_204_0 = null;
        int stackIn_204_1 = 0;
        int stackIn_204_2 = 0;
        int stackIn_205_3;
        RgbSprite stackIn_214_0 = null;
        int stackIn_214_1 = 0;
        int stackIn_214_2 = 0;
        int stackIn_215_3;
        RgbSprite stackIn_225_0 = null;
        int stackIn_225_1 = 0;
        int stackIn_225_2 = 0;
        int stackIn_226_3;
        int stackIn_229_0 = 0;
        RgbSprite stackIn_236_0 = null;
        int stackIn_236_1 = 0;
        int stackIn_236_2 = 0;
        int stackIn_237_3;
        int stackIn_243_0 = 0;
        int stackIn_247_0 = 0;
        RgbSprite stackIn_253_0 = null;
        int stackIn_253_1 = 0;
        int stackIn_253_2 = 0;
        int stackIn_254_3;
        RgbSprite stackIn_263_0 = null;
        int stackIn_263_1 = 0;
        int stackIn_263_2 = 0;
        int stackIn_264_3;
        RgbSprite stackIn_273_0 = null;
        int stackIn_273_1 = 0;
        int stackIn_273_2 = 0;
        int stackIn_274_3;
        RgbSprite stackIn_282_0 = null;
        int stackIn_282_1 = 0;
        int stackIn_282_2 = 0;
        int stackIn_283_3;
        RgbSprite stackIn_292_0 = null;
        int stackIn_292_1 = 0;
        int stackIn_292_2 = 0;
        int stackIn_293_3;
        int stackIn_300_0 = 0;
        int stackIn_309_0 = 0;
        int stackIn_313_0 = 0;
        RgbSprite stackIn_319_0 = null;
        int stackIn_319_1 = 0;
        int stackIn_319_2 = 0;
        int stackIn_320_3;
        RgbSprite stackIn_329_0 = null;
        int stackIn_329_1 = 0;
        int stackIn_329_2 = 0;
        int stackIn_330_3;
        RgbSprite stackIn_339_0 = null;
        int stackIn_339_1 = 0;
        int stackIn_339_2 = 0;
        int stackIn_340_3;
        RgbSprite stackIn_348_0 = null;
        int stackIn_348_1 = 0;
        int stackIn_348_2 = 0;
        int stackIn_349_3;
        RgbSprite stackIn_358_0 = null;
        int stackIn_358_1 = 0;
        int stackIn_358_2 = 0;
        int stackIn_359_3;
        int stackIn_362_0 = 0;
        int stackIn_365_0 = 0;
        RgbSprite stackIn_378_0 = null;
        int stackIn_378_1 = 0;
        int stackIn_378_2 = 0;
        int stackIn_379_3;
        int stackIn_382_0 = 0;
        RgbSprite stackIn_389_0 = null;
        int stackIn_389_1 = 0;
        int stackIn_389_2 = 0;
        int stackIn_390_3;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var4Lifetime6;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var4Lifetime7;
        int var5Lifetime7;
        int var4Lifetime2Lifetime1;
        int var5Lifetime2Lifetime1;
        int var5Lifetime8;
        int var5Lifetime9;
        int var5Lifetime10;
        int var5Lifetime11;
        if (param0 == 16769381) {
          if (LegacyUtf8Decoder.a((byte) 121)) {
            stackIn_300_0 = (!lp.n(param0 - 16769386)) ? 0 : 1;
          } else {
            stackIn_300_0 = 0;
          }
          var2 = stackIn_300_0;
          var3 = DualLinkDeque.field_d.field_db;
          if (!n.field_d) {
            if (0 < Brick.field_E &&
              20 > MembershipBenefitsScreen.field_x % 40) {
              var4 = 1;
              if (var4 != 0) {
                stackIn_309_0 = 1;
                var5 = stackIn_309_0;
                if (this.d(-119)) {
                  NewAchievementsScreen.a(var3, var4 != 0, var5 != 0, -114);
                }
                eg.a(var2 != 0, 24);
                if (this.d(101)) {
                  stackIn_358_0 = ap.field_a;
                  stackIn_358_1 = 10;
                  stackIn_358_2 = -8 + var3;
                  stackIn_359_3 = (var5 != 0) ? 256 : 128;
                  ((RgbSprite) (Object) stackIn_358_0).b(stackIn_358_1, stackIn_358_2, stackIn_359_3);
                }
                return;
              }
              if (pf.field_p) {
                stackIn_313_0 = 1;
                var5Lifetime8 = stackIn_313_0;
                if (this.d(-119)) {
                  NewAchievementsScreen.a(var3, var4 != 0, var5Lifetime8 != 0, -114);
                }
                eg.a(var2 != 0, 24);
                if (this.d(101)) {
                  stackIn_319_0 = ap.field_a;
                  stackIn_319_1 = 10;
                  stackIn_319_2 = -8 + var3;
                  stackIn_320_3 = (var5Lifetime8 != 0) ? 256 : 128;
                  ((RgbSprite) (Object) stackIn_319_0).b(stackIn_319_1, stackIn_319_2, stackIn_320_3);
                }
                return;
              }
              if (pe.gameplayScreen == null) {
                var5Lifetime9 = 0;
                if (this.d(-119)) {
                  NewAchievementsScreen.a(var3, var4 != 0, var5Lifetime9 != 0, -114);
                }
                eg.a(var2 != 0, 24);
                if (this.d(101)) {
                  stackIn_329_0 = ap.field_a;
                  stackIn_329_1 = 10;
                  stackIn_329_2 = -8 + var3;
                  stackIn_330_3 = (var5Lifetime9 != 0) ? 256 : 128;
                  ((RgbSprite) (Object) stackIn_329_0).b(stackIn_329_1, stackIn_329_2, stackIn_330_3);
                }
                return;
              }
              if (pe.gameplayScreen.match.field_c) {
                var5Lifetime10 = 1;
                if (this.d(-119)) {
                  NewAchievementsScreen.a(var3, var4 != 0, var5Lifetime10 != 0, -114);
                }
                eg.a(var2 != 0, 24);
                if (this.d(101)) {
                  stackIn_348_0 = ap.field_a;
                  stackIn_348_1 = 10;
                  stackIn_348_2 = -8 + var3;
                  stackIn_349_3 = (var5Lifetime10 != 0) ? 256 : 128;
                  ((RgbSprite) (Object) stackIn_348_0).b(stackIn_348_1, stackIn_348_2, stackIn_349_3);
                }
                return;
              }
              var5Lifetime11 = 0;
              if (this.d(-119)) {
                NewAchievementsScreen.a(var3, var4 != 0, var5Lifetime11 != 0, -114);
              }
              eg.a(var2 != 0, 24);
              if (this.d(101)) {
                stackIn_339_0 = ap.field_a;
                stackIn_339_1 = 10;
                stackIn_339_2 = -8 + var3;
                stackIn_340_3 = (var5Lifetime11 != 0) ? 256 : 128;
                ((RgbSprite) (Object) stackIn_339_0).b(stackIn_339_1, stackIn_339_2, stackIn_340_3);
              }
              return;
            }
            stackIn_362_0 = 0;
          } else {
            stackIn_362_0 = 1;
          }
          var4Lifetime7 = stackIn_362_0;
          if (var4Lifetime7 == 0) {
            if (!pf.field_p) {
              if (pe.gameplayScreen != null &&
                pe.gameplayScreen.match.field_c) {
                var5Lifetime7 = 1;
                if (this.d(-119)) {
                  NewAchievementsScreen.a(var3, var4Lifetime7 != 0, var5Lifetime7 != 0, -114);
                }
                eg.a(var2 != 0, 24);
                if (this.d(101)) {
                  stackIn_378_0 = ap.field_a;
                  stackIn_378_1 = 10;
                  stackIn_378_2 = -8 + var3;
                  stackIn_379_3 = (var5Lifetime7 != 0) ? 256 : 128;
                  ((RgbSprite) (Object) stackIn_378_0).b(stackIn_378_1, stackIn_378_2, stackIn_379_3);
                }
                return;
              }
              stackIn_382_0 = 0;
            } else {
              stackIn_382_0 = 1;
            }
            var5Lifetime7 = stackIn_382_0;
          } else {
            stackIn_365_0 = 1;
            var5Lifetime7 = stackIn_365_0;
          }
          if (this.d(-119)) {
            NewAchievementsScreen.a(var3, var4Lifetime7 != 0, var5Lifetime7 != 0, -114);
          }
          eg.a(var2 != 0, 24);
          if (this.d(101)) {
            stackIn_389_0 = ap.field_a;
            stackIn_389_1 = 10;
            stackIn_389_2 = -8 + var3;
            stackIn_390_3 = (var5Lifetime7 != 0) ? 256 : 128;
            ((RgbSprite) (Object) stackIn_389_0).b(stackIn_389_1, stackIn_389_2, stackIn_390_3);
          }
          return;
        }
        this.field_a = 50;
        if (!LegacyUtf8Decoder.a((byte) 121)) {
          var2Lifetime1 = 0;
          var3Lifetime1 = DualLinkDeque.field_d.field_db;
          if (!n.field_d) {
            if (0 < Brick.field_E) {
              stackIn_10_0 = (20 > MembershipBenefitsScreen.field_x % 40) ? 1 : 0;
            } else {
              stackIn_10_0 = 0;
            }
          } else {
            stackIn_10_0 = 1;
          }
          var4Lifetime1 = stackIn_10_0;
          if (var4Lifetime1 != 0) {
            stackIn_20_0 = 1;
          } else {
            if (!pf.field_p) {
              if (pe.gameplayScreen != null) {
                stackIn_20_0 = (pe.gameplayScreen.match.field_c) ? 1 : 0;
              } else {
                stackIn_20_0 = 0;
              }
            } else {
              stackIn_20_0 = 1;
            }
          }
          var5Lifetime1 = stackIn_20_0;
          if (this.d(-119)) {
            NewAchievementsScreen.a(var3Lifetime1, var4Lifetime1 != 0, var5Lifetime1 != 0, -114);
          }
          eg.a(var2Lifetime1 != 0, 24);
          if (this.d(101)) {
            stackIn_26_0 = ap.field_a;
            stackIn_26_1 = 10;
            stackIn_26_2 = -8 + var3Lifetime1;
            stackIn_27_3 = (var5Lifetime1 != 0) ? 256 : 128;
            ((RgbSprite) (Object) stackIn_26_0).b(stackIn_26_1, stackIn_26_2, stackIn_27_3);
          }
          return;
        }
        if (!lp.n(param0 - 16769386)) {
          var2Lifetime2 = 0;
          var3Lifetime2 = DualLinkDeque.field_d.field_db;
          if (!n.field_d) {
            if (0 < Brick.field_E &&
              20 > MembershipBenefitsScreen.field_x % 40) {
              var4Lifetime2 = 1;
              if (var4Lifetime2 != 0) {
                stackIn_46_0 = 1;
              } else {
                if (!pf.field_p) {
                  if (pe.gameplayScreen != null) {
                    stackIn_46_0 = (pe.gameplayScreen.match.field_c) ? 1 : 0;
                  } else {
                    stackIn_46_0 = 0;
                  }
                } else {
                  stackIn_46_0 = 1;
                }
              }
              var5Lifetime2 = stackIn_46_0;
              if (this.d(-119)) {
                NewAchievementsScreen.a(var3Lifetime2, var4Lifetime2 != 0, var5Lifetime2 != 0, -114);
              }
              eg.a(var2Lifetime2 != 0, 24);
              if (this.d(101)) {
                stackIn_52_0 = ap.field_a;
                stackIn_52_1 = 10;
                stackIn_52_2 = -8 + var3Lifetime2;
                stackIn_53_3 = (var5Lifetime2 != 0) ? 256 : 128;
                ((RgbSprite) (Object) stackIn_52_0).b(stackIn_52_1, stackIn_52_2, stackIn_53_3);
              }
              return;
            }
            stackIn_56_0 = 0;
          } else {
            stackIn_56_0 = 1;
          }
          var4Lifetime2Lifetime1 = stackIn_56_0;
          if (var4Lifetime2Lifetime1 != 0) {
            stackIn_59_0 = 1;
            var5Lifetime2Lifetime1 = stackIn_59_0;
            if (this.d(-119)) {
              NewAchievementsScreen.a(var3Lifetime2, var4Lifetime2Lifetime1 != 0, var5Lifetime2Lifetime1 != 0, -114);
            }
            eg.a(var2Lifetime2 != 0, 24);
            if (this.d(101)) {
              stackIn_108_0 = ap.field_a;
              stackIn_108_1 = 10;
              stackIn_108_2 = -8 + var3Lifetime2;
              stackIn_109_3 = (var5Lifetime2Lifetime1 != 0) ? 256 : 128;
              ((RgbSprite) (Object) stackIn_108_0).b(stackIn_108_1, stackIn_108_2, stackIn_109_3);
            }
          } else {
            if (pf.field_p) {
              stackIn_63_0 = 1;
              var5Lifetime2Lifetime1 = stackIn_63_0;
              if (this.d(-119)) {
                NewAchievementsScreen.a(var3Lifetime2, var4Lifetime2Lifetime1 != 0, var5Lifetime2Lifetime1 != 0, -114);
              }
              eg.a(var2Lifetime2 != 0, 24);
              if (this.d(101)) {
                stackIn_69_0 = ap.field_a;
                stackIn_69_1 = 10;
                stackIn_69_2 = -8 + var3Lifetime2;
                stackIn_70_3 = (var5Lifetime2Lifetime1 != 0) ? 256 : 128;
                ((RgbSprite) (Object) stackIn_69_0).b(stackIn_69_1, stackIn_69_2, stackIn_70_3);
              }
            } else {
              if (pe.gameplayScreen == null) {
                var5Lifetime2Lifetime1 = 0;
                if (this.d(-119)) {
                  NewAchievementsScreen.a(var3Lifetime2, var4Lifetime2Lifetime1 != 0, var5Lifetime2Lifetime1 != 0, -114);
                }
                eg.a(var2Lifetime2 != 0, 24);
                if (this.d(101)) {
                  stackIn_79_0 = ap.field_a;
                  stackIn_79_1 = 10;
                  stackIn_79_2 = -8 + var3Lifetime2;
                  stackIn_80_3 = (var5Lifetime2Lifetime1 != 0) ? 256 : 128;
                  ((RgbSprite) (Object) stackIn_79_0).b(stackIn_79_1, stackIn_79_2, stackIn_80_3);
                }
              } else {
                if (pe.gameplayScreen.match.field_c) {
                  var5Lifetime2Lifetime1 = 1;
                  if (this.d(-119)) {
                    NewAchievementsScreen.a(var3Lifetime2, var4Lifetime2Lifetime1 != 0, var5Lifetime2Lifetime1 != 0, -114);
                  }
                  eg.a(var2Lifetime2 != 0, 24);
                  if (this.d(101)) {
                    stackIn_98_0 = ap.field_a;
                    stackIn_98_1 = 10;
                    stackIn_98_2 = -8 + var3Lifetime2;
                    stackIn_99_3 = (var5Lifetime2Lifetime1 != 0) ? 256 : 128;
                    ((RgbSprite) (Object) stackIn_98_0).b(stackIn_98_1, stackIn_98_2, stackIn_99_3);
                  }
                } else {
                  var5Lifetime2Lifetime1 = 0;
                  if (this.d(-119)) {
                    NewAchievementsScreen.a(var3Lifetime2, var4Lifetime2Lifetime1 != 0, var5Lifetime2Lifetime1 != 0, -114);
                  }
                  eg.a(var2Lifetime2 != 0, 24);
                  if (this.d(101)) {
                    stackIn_89_0 = ap.field_a;
                    stackIn_89_1 = 10;
                    stackIn_89_2 = -8 + var3Lifetime2;
                    stackIn_90_3 = (var5Lifetime2Lifetime1 != 0) ? 256 : 128;
                    ((RgbSprite) (Object) stackIn_89_0).b(stackIn_89_1, stackIn_89_2, stackIn_90_3);
                  }
                }
              }
            }
          }
          return;
        }
        var2Lifetime3 = 1;
        var3Lifetime3 = DualLinkDeque.field_d.field_db;
        if (n.field_d) {
          var4Lifetime3 = 1;
          if (var4Lifetime3 != 0) {
            stackIn_243_0 = 1;
            var5Lifetime3 = stackIn_243_0;
            if (this.d(-119)) {
              NewAchievementsScreen.a(var3Lifetime3, var4Lifetime3 != 0, var5Lifetime3 != 0, -114);
            }
            eg.a(var2Lifetime3 != 0, 24);
            if (this.d(101)) {
              stackIn_292_0 = ap.field_a;
              stackIn_292_1 = 10;
              stackIn_292_2 = -8 + var3Lifetime3;
              stackIn_293_3 = (var5Lifetime3 != 0) ? 256 : 128;
              ((RgbSprite) (Object) stackIn_292_0).b(stackIn_292_1, stackIn_292_2, stackIn_293_3);
            }
          } else {
            if (pf.field_p) {
              stackIn_247_0 = 1;
              var5Lifetime3 = stackIn_247_0;
              if (this.d(-119)) {
                NewAchievementsScreen.a(var3Lifetime3, var4Lifetime3 != 0, var5Lifetime3 != 0, -114);
              }
              eg.a(var2Lifetime3 != 0, 24);
              if (this.d(101)) {
                stackIn_253_0 = ap.field_a;
                stackIn_253_1 = 10;
                stackIn_253_2 = -8 + var3Lifetime3;
                stackIn_254_3 = (var5Lifetime3 != 0) ? 256 : 128;
                ((RgbSprite) (Object) stackIn_253_0).b(stackIn_253_1, stackIn_253_2, stackIn_254_3);
              }
            } else {
              if (pe.gameplayScreen == null) {
                var5Lifetime3 = 0;
                if (this.d(-119)) {
                  NewAchievementsScreen.a(var3Lifetime3, var4Lifetime3 != 0, var5Lifetime3 != 0, -114);
                }
                eg.a(var2Lifetime3 != 0, 24);
                if (this.d(101)) {
                  stackIn_263_0 = ap.field_a;
                  stackIn_263_1 = 10;
                  stackIn_263_2 = -8 + var3Lifetime3;
                  stackIn_264_3 = (var5Lifetime3 != 0) ? 256 : 128;
                  ((RgbSprite) (Object) stackIn_263_0).b(stackIn_263_1, stackIn_263_2, stackIn_264_3);
                }
              } else {
                if (!pe.gameplayScreen.match.field_c) {
                  var5Lifetime3 = 0;
                  if (this.d(-119)) {
                    NewAchievementsScreen.a(var3Lifetime3, var4Lifetime3 != 0, var5Lifetime3 != 0, -114);
                  }
                  eg.a(var2Lifetime3 != 0, 24);
                  if (this.d(101)) {
                    stackIn_282_0 = ap.field_a;
                    stackIn_282_1 = 10;
                    stackIn_282_2 = -8 + var3Lifetime3;
                    stackIn_283_3 = (var5Lifetime3 != 0) ? 256 : 128;
                    ((RgbSprite) (Object) stackIn_282_0).b(stackIn_282_1, stackIn_282_2, stackIn_283_3);
                  }
                } else {
                  var5Lifetime3 = 1;
                  if (this.d(-119)) {
                    NewAchievementsScreen.a(var3Lifetime3, var4Lifetime3 != 0, var5Lifetime3 != 0, -114);
                  }
                  eg.a(var2Lifetime3 != 0, 24);
                  if (this.d(101)) {
                    stackIn_273_0 = ap.field_a;
                    stackIn_273_1 = 10;
                    stackIn_273_2 = -8 + var3Lifetime3;
                    stackIn_274_3 = (var5Lifetime3 != 0) ? 256 : 128;
                    ((RgbSprite) (Object) stackIn_273_0).b(stackIn_273_1, stackIn_273_2, stackIn_274_3);
                  }
                }
              }
            }
          }
          return;
        }
        if (0 >= Brick.field_E) {
          var4Lifetime4 = 0;
          if (var4Lifetime4 != 0) {
            stackIn_116_0 = 1;
            var5Lifetime4 = stackIn_116_0;
            if (this.d(-119)) {
              NewAchievementsScreen.a(var3Lifetime3, var4Lifetime4 != 0, var5Lifetime4 != 0, -114);
            }
            eg.a(var2Lifetime3 != 0, 24);
            if (this.d(101)) {
              stackIn_165_0 = ap.field_a;
              stackIn_165_1 = 10;
              stackIn_165_2 = -8 + var3Lifetime3;
              stackIn_166_3 = (var5Lifetime4 != 0) ? 256 : 128;
              ((RgbSprite) (Object) stackIn_165_0).b(stackIn_165_1, stackIn_165_2, stackIn_166_3);
            }
          } else {
            if (pf.field_p) {
              stackIn_120_0 = 1;
              var5Lifetime4 = stackIn_120_0;
              if (this.d(-119)) {
                NewAchievementsScreen.a(var3Lifetime3, var4Lifetime4 != 0, var5Lifetime4 != 0, -114);
              }
              eg.a(var2Lifetime3 != 0, 24);
              if (this.d(101)) {
                stackIn_126_0 = ap.field_a;
                stackIn_126_1 = 10;
                stackIn_126_2 = -8 + var3Lifetime3;
                stackIn_127_3 = (var5Lifetime4 != 0) ? 256 : 128;
                ((RgbSprite) (Object) stackIn_126_0).b(stackIn_126_1, stackIn_126_2, stackIn_127_3);
              }
            } else {
              if (pe.gameplayScreen == null) {
                var5Lifetime4 = 0;
                if (this.d(-119)) {
                  NewAchievementsScreen.a(var3Lifetime3, var4Lifetime4 != 0, var5Lifetime4 != 0, -114);
                }
                eg.a(var2Lifetime3 != 0, 24);
                if (this.d(101)) {
                  stackIn_136_0 = ap.field_a;
                  stackIn_136_1 = 10;
                  stackIn_136_2 = -8 + var3Lifetime3;
                  stackIn_137_3 = (var5Lifetime4 != 0) ? 256 : 128;
                  ((RgbSprite) (Object) stackIn_136_0).b(stackIn_136_1, stackIn_136_2, stackIn_137_3);
                }
              } else {
                if (pe.gameplayScreen.match.field_c) {
                  var5Lifetime4 = 1;
                  if (this.d(-119)) {
                    NewAchievementsScreen.a(var3Lifetime3, var4Lifetime4 != 0, var5Lifetime4 != 0, -114);
                  }
                  eg.a(var2Lifetime3 != 0, 24);
                  if (this.d(101)) {
                    stackIn_155_0 = ap.field_a;
                    stackIn_155_1 = 10;
                    stackIn_155_2 = -8 + var3Lifetime3;
                    stackIn_156_3 = (var5Lifetime4 != 0) ? 256 : 128;
                    ((RgbSprite) (Object) stackIn_155_0).b(stackIn_155_1, stackIn_155_2, stackIn_156_3);
                  }
                } else {
                  var5Lifetime4 = 0;
                  if (this.d(-119)) {
                    NewAchievementsScreen.a(var3Lifetime3, var4Lifetime4 != 0, var5Lifetime4 != 0, -114);
                  }
                  eg.a(var2Lifetime3 != 0, 24);
                  if (this.d(101)) {
                    stackIn_146_0 = ap.field_a;
                    stackIn_146_1 = 10;
                    stackIn_146_2 = -8 + var3Lifetime3;
                    stackIn_147_3 = (var5Lifetime4 != 0) ? 256 : 128;
                    ((RgbSprite) (Object) stackIn_146_0).b(stackIn_146_1, stackIn_146_2, stackIn_147_3);
                  }
                }
              }
            }
          }
          return;
        }
        if (20 > MembershipBenefitsScreen.field_x % 40) {
          var4Lifetime5 = 1;
          if (var4Lifetime5 == 0) {
            if (!pf.field_p) {
              if (pe.gameplayScreen != null) {
                stackIn_181_0 = (pe.gameplayScreen.match.field_c) ? 1 : 0;
              } else {
                stackIn_181_0 = 0;
              }
            } else {
              stackIn_181_0 = 1;
            }
            var5Lifetime5 = stackIn_181_0;
          } else {
            stackIn_172_0 = 1;
            var5Lifetime5 = stackIn_172_0;
          }
          if (this.d(-119)) {
            NewAchievementsScreen.a(var3Lifetime3, var4Lifetime5 != 0, var5Lifetime5 != 0, -114);
          }
          eg.a(var2Lifetime3 != 0, 24);
          if (this.d(101)) {
            stackIn_188_0 = ap.field_a;
            stackIn_188_1 = 10;
            stackIn_188_2 = -8 + var3Lifetime3;
            stackIn_189_3 = (var5Lifetime5 != 0) ? 256 : 128;
            ((RgbSprite) (Object) stackIn_188_0).b(stackIn_188_1, stackIn_188_2, stackIn_189_3);
          }
          return;
        }
        var4Lifetime6 = 0;
        if (var4Lifetime6 == 0) {
          if (pf.field_p) {
            stackIn_198_0 = 1;
            var5Lifetime6 = stackIn_198_0;
            if (this.d(-119)) {
              NewAchievementsScreen.a(var3Lifetime3, var4Lifetime6 != 0, var5Lifetime6 != 0, -114);
            }
            eg.a(var2Lifetime3 != 0, 24);
            if (this.d(101)) {
              stackIn_204_0 = ap.field_a;
              stackIn_204_1 = 10;
              stackIn_204_2 = -8 + var3Lifetime3;
              stackIn_205_3 = (var5Lifetime6 != 0) ? 256 : 128;
              ((RgbSprite) (Object) stackIn_204_0).b(stackIn_204_1, stackIn_204_2, stackIn_205_3);
            }
            return;
          }
          if (pe.gameplayScreen == null) {
            var5Lifetime6 = 0;
            if (this.d(-119)) {
              NewAchievementsScreen.a(var3Lifetime3, var4Lifetime6 != 0, var5Lifetime6 != 0, -114);
            }
            eg.a(var2Lifetime3 != 0, 24);
            if (this.d(101)) {
              stackIn_214_0 = ap.field_a;
              stackIn_214_1 = 10;
              stackIn_214_2 = -8 + var3Lifetime3;
              stackIn_215_3 = (var5Lifetime6 != 0) ? 256 : 128;
              ((RgbSprite) (Object) stackIn_214_0).b(stackIn_214_1, stackIn_214_2, stackIn_215_3);
            }
            return;
          }
          if (pe.gameplayScreen.match.field_c) {
            var5Lifetime6 = 1;
            if (this.d(-119)) {
              NewAchievementsScreen.a(var3Lifetime3, var4Lifetime6 != 0, var5Lifetime6 != 0, -114);
            }
            eg.a(var2Lifetime3 != 0, 24);
            if (this.d(101)) {
              stackIn_225_0 = ap.field_a;
              stackIn_225_1 = 10;
              stackIn_225_2 = -8 + var3Lifetime3;
              stackIn_226_3 = (var5Lifetime6 != 0) ? 256 : 128;
              ((RgbSprite) (Object) stackIn_225_0).b(stackIn_225_1, stackIn_225_2, stackIn_226_3);
            }
            return;
          }
          stackIn_229_0 = 0;
          var5Lifetime6 = stackIn_229_0;
        } else {
          stackIn_194_0 = 1;
          var5Lifetime6 = stackIn_194_0;
        }
        if (this.d(-119)) {
          NewAchievementsScreen.a(var3Lifetime3, var4Lifetime6 != 0, var5Lifetime6 != 0, -114);
        }
        eg.a(var2Lifetime3 != 0, 24);
        if (this.d(101)) {
          stackIn_236_0 = ap.field_a;
          stackIn_236_1 = 10;
          stackIn_236_2 = -8 + var3Lifetime3;
          stackIn_237_3 = (var5Lifetime6 != 0) ? 256 : 128;
          ((RgbSprite) (Object) stackIn_236_0).b(stackIn_236_1, stackIn_236_2, stackIn_237_3);
        }
    }

    public final boolean a(int param0, char param1, int param2) {
        if (param2 > -58) {
          field_d = (String) null;
          if (this.c(-25437)) {
            return LevelSequence.a(13, -1, 12, 15);
          }
          return false;
        }
        if (this.c(-25437)) {
          return LevelSequence.a(13, -1, 12, 15);
        }
        return false;
    }

    public final void a(boolean param0, byte param1) {
        boolean stackIn_22_0 = false;
        boolean stackIn_27_0 = false;
        boolean stackIn_33_0 = false;
        int stackIn_34_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        boolean stackIn_46_1 = false;
        int stackIn_48_2;
        int stackIn_48_3;
        int stackIn_48_4;
        int stackIn_48_5;
        boolean stackIn_48_6;
        int stackIn_48_7;
        int stackIn_48_8;
        boolean stackIn_48_9;
        int stackIn_48_10;
        boolean stackIn_49_11 = false;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        boolean stackIn_65_1 = false;
        int stackIn_67_2;
        int stackIn_67_3;
        int stackIn_67_4;
        int stackIn_67_5;
        boolean stackIn_67_6;
        int stackIn_67_7;
        int stackIn_67_8;
        boolean stackIn_67_9;
        int stackIn_67_10;
        boolean stackIn_68_11 = false;
        boolean stackIn_80_0 = false;
        int stackIn_88_0 = 0;
        int stackIn_90_0 = 0;
        boolean stackIn_91_1 = false;
        int stackIn_93_2;
        int stackIn_93_3;
        int stackIn_93_4;
        int stackIn_93_5;
        boolean stackIn_93_6;
        int stackIn_93_7;
        int stackIn_93_8;
        boolean stackIn_93_9;
        int stackIn_93_10;
        boolean stackIn_94_11 = false;
        boolean stackIn_102_0 = false;
        int stackIn_103_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_112_0 = 0;
        boolean stackIn_113_1 = false;
        int stackIn_115_2;
        int stackIn_115_3;
        int stackIn_115_4;
        int stackIn_115_5;
        boolean stackIn_115_6;
        int stackIn_115_7;
        int stackIn_115_8;
        boolean stackIn_115_9;
        int stackIn_115_10;
        boolean stackIn_116_11 = false;
        int stackIn_128_0 = 0;
        int stackIn_130_0 = 0;
        boolean stackIn_131_1 = false;
        int stackIn_133_2;
        int stackIn_133_3;
        int stackIn_133_4;
        int stackIn_133_5;
        boolean stackIn_133_6;
        int stackIn_133_7;
        int stackIn_133_8;
        boolean stackIn_133_9;
        int stackIn_133_10;
        boolean stackIn_134_11 = false;
        boolean stackIn_145_0 = false;
        boolean stackIn_149_0 = false;
        int stackIn_150_1 = 0;
        int stackIn_156_0 = 0;
        int stackIn_158_0 = 0;
        boolean stackIn_159_1 = false;
        int stackIn_161_2;
        int stackIn_161_3;
        int stackIn_161_4;
        int stackIn_161_5;
        boolean stackIn_161_6;
        int stackIn_161_7;
        int stackIn_161_8;
        boolean stackIn_161_9;
        int stackIn_161_10;
        boolean stackIn_162_11 = false;
        int stackIn_174_0 = 0;
        int stackIn_176_0 = 0;
        boolean stackIn_177_1 = false;
        int stackIn_179_2;
        int stackIn_179_3;
        int stackIn_179_4;
        int stackIn_179_5;
        boolean stackIn_179_6;
        int stackIn_179_7;
        int stackIn_179_8;
        boolean stackIn_179_9;
        int stackIn_179_10;
        boolean stackIn_180_11 = false;
        boolean stackIn_190_0 = false;
        int stackIn_191_1 = 0;
        int stackIn_197_0 = 0;
        int stackIn_199_0 = 0;
        boolean stackIn_200_1 = false;
        int stackIn_202_2;
        int stackIn_202_3;
        int stackIn_202_4;
        int stackIn_202_5;
        boolean stackIn_202_6;
        int stackIn_202_7;
        int stackIn_202_8;
        boolean stackIn_202_9;
        int stackIn_202_10;
        boolean stackIn_203_11 = false;
        int stackIn_215_0 = 0;
        int stackIn_217_0 = 0;
        boolean stackIn_218_1 = false;
        int stackIn_220_2;
        int stackIn_220_3;
        int stackIn_220_4;
        int stackIn_220_5;
        boolean stackIn_220_6;
        int stackIn_220_7;
        int stackIn_220_8;
        boolean stackIn_220_9;
        int stackIn_220_10;
        boolean stackIn_221_11 = false;
        boolean stackIn_231_0 = false;
        int stackIn_232_1 = 0;
        int stackIn_238_0 = 0;
        int stackIn_240_0 = 0;
        boolean stackIn_241_1 = false;
        int stackIn_243_2;
        int stackIn_243_3;
        int stackIn_243_4;
        int stackIn_243_5;
        boolean stackIn_243_6;
        int stackIn_243_7;
        int stackIn_243_8;
        boolean stackIn_243_9;
        int stackIn_243_10;
        boolean stackIn_244_11 = false;
        int stackIn_257_0 = 0;
        int stackIn_259_0 = 0;
        boolean stackIn_260_1 = false;
        int stackIn_262_2;
        int stackIn_262_3;
        int stackIn_262_4;
        int stackIn_262_5;
        boolean stackIn_262_6;
        int stackIn_262_7;
        int stackIn_262_8;
        boolean stackIn_262_9;
        int stackIn_262_10;
        boolean stackIn_263_11 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var5Lifetime5;
        var8 = BrickABrac.field_J ? 1 : 0;
        var3 = -86 / ((param1 + 61) / 47);
        if (!ue.field_c) {
          ri.h(-111);
          this.field_a = 0;
          return;
        }
        nn.field_f = bj.field_V;
        if (this.c(-25437) &&
          this.field_a < 20) {
          this.field_a = this.field_a + 1;
        }
        if (!this.c(-25437)) {
          if (this.field_a > 0) {
            this.field_a = this.field_a - 1;
          }
          if (Brick.field_E != 1) {
            if (1 < Brick.field_E) {
              nn.field_f = rd.a(bc.field_a, new String[]{Integer.toString(Brick.field_E)}, (byte) 103);
              var4 = n.field_d ? 1 : 0;
              n.field_d = false;
              if (this.d(76)) {
                var5 = IntrusiveHashTable.field_l + nn.field_g.measureText(nn.field_f);
                stackIn_22_0 = (0 <= pq.pointerX) && (pq.pointerX < var5) && (DualLinkDeque.field_d.field_db - LevelSelectScreen.field_w <= po.pointerY) && (DualLinkDeque.field_d.field_db > po.pointerY);
                n.field_d = stackIn_22_0;
                if (n.field_d &&
                  ki.pressedButton == 1) {
                  stackIn_27_0 = !(pf.field_p);
                  pf.field_p = stackIn_27_0;
                  if (pf.field_p) {
                    this.field_a = 0;
                    Brick.field_E = 0;
                  } else {
                    this.field_a = 20;
                  }
                }
                if (n.field_d) {
                  stackIn_33_0 = n.field_d;
                  stackIn_34_1 = (var4 != 0) ? 0 : 1;
                  if ((stackIn_33_0 ? 1 : 0) == stackIn_34_1) {
                    wp.playUiSound(8, ta.uiSounds[0]);
                  }
                }
              }
              var5Lifetime5 = 400 - this.field_a * this.field_a;
              var6 = var5Lifetime5 * (480 - LevelPack.field_g) / 400 + LevelPack.field_g;
              sn.b((byte) -118, var6);
              nh.a(0);
              if (o.field_e != null) {
                stackIn_43_0 = (lm.a(o.field_e.field_cc, 0)) ? 1 : 0;
              } else {
                stackIn_43_0 = 0;
              }
              var7 = stackIn_43_0;
              stackIn_45_0 = 15;
              stackIn_46_1 = (this.b(109)) ? false : true;
              stackIn_48_2 = 11;
              stackIn_48_3 = GameplayAudioEvent.mouseWheelDelta;
              stackIn_48_4 = 0;
              stackIn_48_5 = 16777215;
              stackIn_48_6 = true;
              stackIn_48_7 = 14;
              stackIn_48_8 = var7;
              stackIn_48_9 = param0;
              stackIn_48_10 = 13;
              stackIn_49_11 = (so.a((byte) -35) <= 50) ? false : true;
              dc.a(stackIn_45_0, stackIn_46_1, stackIn_48_2, stackIn_48_3, stackIn_48_4, stackIn_48_5, stackIn_48_6, stackIn_48_7, stackIn_48_8 != 0, stackIn_48_9, stackIn_48_10, stackIn_49_11);
              if (sl.field_w) {
                k.field_h.writeCipheredOpcode(-13413, 64);
                sl.field_w = false;
              }
              if (tq.field_c) {
                k.field_h.writeCipheredOpcode(-13413, 10);
                tq.field_c = false;
              }
              return;
            }
            nn.field_f = il.field_A;
          } else {
            nn.field_f = an.field_g;
          }
        } else {
          Brick.field_E = 0;
        }
        var4Lifetime1 = n.field_d ? 1 : 0;
        n.field_d = false;
        if (!this.d(76)) {
          var5Lifetime1 = 400 - this.field_a * this.field_a;
          var6Lifetime1 = var5Lifetime1 * (480 - LevelPack.field_g) / 400 + LevelPack.field_g;
          sn.b((byte) -118, var6Lifetime1);
          nh.a(0);
          if (o.field_e != null) {
            stackIn_62_0 = (lm.a(o.field_e.field_cc, 0)) ? 1 : 0;
          } else {
            stackIn_62_0 = 0;
          }
          var7Lifetime1 = stackIn_62_0;
          stackIn_64_0 = 15;
          stackIn_65_1 = (this.b(109)) ? false : true;
          stackIn_67_2 = 11;
          stackIn_67_3 = GameplayAudioEvent.mouseWheelDelta;
          stackIn_67_4 = 0;
          stackIn_67_5 = 16777215;
          stackIn_67_6 = true;
          stackIn_67_7 = 14;
          stackIn_67_8 = var7Lifetime1;
          stackIn_67_9 = param0;
          stackIn_67_10 = 13;
          stackIn_68_11 = (so.a((byte) -35) <= 50) ? false : true;
          dc.a(stackIn_64_0, stackIn_65_1, stackIn_67_2, stackIn_67_3, stackIn_67_4, stackIn_67_5, stackIn_67_6, stackIn_67_7, stackIn_67_8 != 0, stackIn_67_9, stackIn_67_10, stackIn_68_11);
          if (sl.field_w) {
            k.field_h.writeCipheredOpcode(-13413, 64);
            sl.field_w = false;
          }
          if (tq.field_c) {
            k.field_h.writeCipheredOpcode(-13413, 10);
            tq.field_c = false;
          }
          return;
        }
        var5Lifetime2 = IntrusiveHashTable.field_l + nn.field_g.measureText(nn.field_f);
        stackIn_80_0 = (0 <= pq.pointerX) && (pq.pointerX < var5Lifetime2) && (DualLinkDeque.field_d.field_db - LevelSelectScreen.field_w <= po.pointerY) && (DualLinkDeque.field_d.field_db > po.pointerY);
        n.field_d = stackIn_80_0;
        if (!n.field_d) {
          if (!n.field_d) {
            var5Lifetime3 = 400 - this.field_a * this.field_a;
            var6Lifetime2 = var5Lifetime3 * (480 - LevelPack.field_g) / 400 + LevelPack.field_g;
            sn.b((byte) -118, var6Lifetime2);
            nh.a(0);
            if (o.field_e != null) {
              stackIn_88_0 = (lm.a(o.field_e.field_cc, 0)) ? 1 : 0;
            } else {
              stackIn_88_0 = 0;
            }
            var7Lifetime2 = stackIn_88_0;
            stackIn_90_0 = 15;
            stackIn_91_1 = (this.b(109)) ? false : true;
            stackIn_93_2 = 11;
            stackIn_93_3 = GameplayAudioEvent.mouseWheelDelta;
            stackIn_93_4 = 0;
            stackIn_93_5 = 16777215;
            stackIn_93_6 = true;
            stackIn_93_7 = 14;
            stackIn_93_8 = var7Lifetime2;
            stackIn_93_9 = param0;
            stackIn_93_10 = 13;
            stackIn_94_11 = (so.a((byte) -35) <= 50) ? false : true;
            dc.a(stackIn_90_0, stackIn_91_1, stackIn_93_2, stackIn_93_3, stackIn_93_4, stackIn_93_5, stackIn_93_6, stackIn_93_7, stackIn_93_8 != 0, stackIn_93_9, stackIn_93_10, stackIn_94_11);
          } else {
            stackIn_102_0 = n.field_d;
            stackIn_103_1 = (var4Lifetime1 != 0) ? 0 : 1;
            if ((stackIn_102_0 ? 1 : 0) != stackIn_103_1) {
              var5Lifetime3 = 400 - this.field_a * this.field_a;
              var6Lifetime2 = var5Lifetime3 * (480 - LevelPack.field_g) / 400 + LevelPack.field_g;
              sn.b((byte) -118, var6Lifetime2);
              nh.a(0);
              if (o.field_e != null) {
                stackIn_128_0 = (lm.a(o.field_e.field_cc, 0)) ? 1 : 0;
              } else {
                stackIn_128_0 = 0;
              }
              var7Lifetime2 = stackIn_128_0;
              stackIn_130_0 = 15;
              stackIn_131_1 = (this.b(109)) ? false : true;
              stackIn_133_2 = 11;
              stackIn_133_3 = GameplayAudioEvent.mouseWheelDelta;
              stackIn_133_4 = 0;
              stackIn_133_5 = 16777215;
              stackIn_133_6 = true;
              stackIn_133_7 = 14;
              stackIn_133_8 = var7Lifetime2;
              stackIn_133_9 = param0;
              stackIn_133_10 = 13;
              stackIn_134_11 = (so.a((byte) -35) <= 50) ? false : true;
              dc.a(stackIn_130_0, stackIn_131_1, stackIn_133_2, stackIn_133_3, stackIn_133_4, stackIn_133_5, stackIn_133_6, stackIn_133_7, stackIn_133_8 != 0, stackIn_133_9, stackIn_133_10, stackIn_134_11);
            } else {
              wp.playUiSound(8, ta.uiSounds[0]);
              var5Lifetime3 = 400 - this.field_a * this.field_a;
              var6Lifetime2 = var5Lifetime3 * (480 - LevelPack.field_g) / 400 + LevelPack.field_g;
              sn.b((byte) -118, var6Lifetime2);
              nh.a(0);
              if (o.field_e != null) {
                stackIn_110_0 = (lm.a(o.field_e.field_cc, 0)) ? 1 : 0;
              } else {
                stackIn_110_0 = 0;
              }
              var7Lifetime2 = stackIn_110_0;
              stackIn_112_0 = 15;
              stackIn_113_1 = (this.b(109)) ? false : true;
              stackIn_115_2 = 11;
              stackIn_115_3 = GameplayAudioEvent.mouseWheelDelta;
              stackIn_115_4 = 0;
              stackIn_115_5 = 16777215;
              stackIn_115_6 = true;
              stackIn_115_7 = 14;
              stackIn_115_8 = var7Lifetime2;
              stackIn_115_9 = param0;
              stackIn_115_10 = 13;
              stackIn_116_11 = (so.a((byte) -35) <= 50) ? false : true;
              dc.a(stackIn_112_0, stackIn_113_1, stackIn_115_2, stackIn_115_3, stackIn_115_4, stackIn_115_5, stackIn_115_6, stackIn_115_7, stackIn_115_8 != 0, stackIn_115_9, stackIn_115_10, stackIn_116_11);
            }
          }
          if (sl.field_w) {
            k.field_h.writeCipheredOpcode(-13413, 64);
            sl.field_w = false;
          }
          if (tq.field_c) {
            k.field_h.writeCipheredOpcode(-13413, 10);
            tq.field_c = false;
          }
          return;
        }
        if (ki.pressedButton != 1) {
          regionExit1: {
            if (n.field_d) {
              stackIn_231_0 = n.field_d;
              stackIn_232_1 = (var4Lifetime1 != 0) ? 0 : 1;
              if ((stackIn_231_0 ? 1 : 0) != stackIn_232_1) {
                var5Lifetime4 = 400 - this.field_a * this.field_a;
                var6Lifetime3 = var5Lifetime4 * (480 - LevelPack.field_g) / 400 + LevelPack.field_g;
                sn.b((byte) -118, var6Lifetime3);
                nh.a(0);
                if (o.field_e != null) {
                  stackIn_238_0 = (!lm.a(o.field_e.field_cc, 0)) ? 0 : 1;
                } else {
                  stackIn_238_0 = 0;
                }
                var7Lifetime3 = stackIn_238_0;
                stackIn_240_0 = 15;
                stackIn_241_1 = (this.b(109)) ? false : true;
                stackIn_243_2 = 11;
                stackIn_243_3 = GameplayAudioEvent.mouseWheelDelta;
                stackIn_243_4 = 0;
                stackIn_243_5 = 16777215;
                stackIn_243_6 = true;
                stackIn_243_7 = 14;
                stackIn_243_8 = var7Lifetime3;
                stackIn_243_9 = param0;
                stackIn_243_10 = 13;
                stackIn_244_11 = (so.a((byte) -35) <= 50) ? false : true;
                dc.a(stackIn_240_0, stackIn_241_1, stackIn_243_2, stackIn_243_3, stackIn_243_4, stackIn_243_5, stackIn_243_6, stackIn_243_7, stackIn_243_8 != 0, stackIn_243_9, stackIn_243_10, stackIn_244_11);
                break regionExit1;
              }
              wp.playUiSound(8, ta.uiSounds[0]);
            }
            var5Lifetime4 = 400 - this.field_a * this.field_a;
            var6Lifetime3 = var5Lifetime4 * (480 - LevelPack.field_g) / 400 + LevelPack.field_g;
            sn.b((byte) -118, var6Lifetime3);
            nh.a(0);
            if (o.field_e != null) {
              stackIn_257_0 = (!lm.a(o.field_e.field_cc, 0)) ? 0 : 1;
            } else {
              stackIn_257_0 = 0;
            }
            var7Lifetime3 = stackIn_257_0;
            stackIn_259_0 = 15;
            stackIn_260_1 = (this.b(109)) ? false : true;
            stackIn_262_2 = 11;
            stackIn_262_3 = GameplayAudioEvent.mouseWheelDelta;
            stackIn_262_4 = 0;
            stackIn_262_5 = 16777215;
            stackIn_262_6 = true;
            stackIn_262_7 = 14;
            stackIn_262_8 = var7Lifetime3;
            stackIn_262_9 = param0;
            stackIn_262_10 = 13;
            stackIn_263_11 = (so.a((byte) -35) <= 50) ? false : true;
            dc.a(stackIn_259_0, stackIn_260_1, stackIn_262_2, stackIn_262_3, stackIn_262_4, stackIn_262_5, stackIn_262_6, stackIn_262_7, stackIn_262_8 != 0, stackIn_262_9, stackIn_262_10, stackIn_263_11);
          }
        } else {
          stackIn_145_0 = !(pf.field_p);
          pf.field_p = stackIn_145_0;
          if (!pf.field_p) {
            this.field_a = 20;
            if (n.field_d) {
              stackIn_149_0 = n.field_d;
              stackIn_150_1 = (var4Lifetime1 != 0) ? 0 : 1;
              if ((stackIn_149_0 ? 1 : 0) != stackIn_150_1) {
                var5Lifetime4 = 400 - this.field_a * this.field_a;
                var6Lifetime3 = var5Lifetime4 * (480 - LevelPack.field_g) / 400 + LevelPack.field_g;
                sn.b((byte) -118, var6Lifetime3);
                nh.a(0);
                if (o.field_e != null) {
                  stackIn_156_0 = (!lm.a(o.field_e.field_cc, 0)) ? 0 : 1;
                } else {
                  stackIn_156_0 = 0;
                }
                var7Lifetime3 = stackIn_156_0;
                stackIn_158_0 = 15;
                stackIn_159_1 = (this.b(109)) ? false : true;
                stackIn_161_2 = 11;
                stackIn_161_3 = GameplayAudioEvent.mouseWheelDelta;
                stackIn_161_4 = 0;
                stackIn_161_5 = 16777215;
                stackIn_161_6 = true;
                stackIn_161_7 = 14;
                stackIn_161_8 = var7Lifetime3;
                stackIn_161_9 = param0;
                stackIn_161_10 = 13;
                stackIn_162_11 = (so.a((byte) -35) <= 50) ? false : true;
                dc.a(stackIn_158_0, stackIn_159_1, stackIn_161_2, stackIn_161_3, stackIn_161_4, stackIn_161_5, stackIn_161_6, stackIn_161_7, stackIn_161_8 != 0, stackIn_161_9, stackIn_161_10, stackIn_162_11);
                if (sl.field_w) {
                  k.field_h.writeCipheredOpcode(-13413, 64);
                  sl.field_w = false;
                }
                if (tq.field_c) {
                  k.field_h.writeCipheredOpcode(-13413, 10);
                  tq.field_c = false;
                }
                return;
              }
              wp.playUiSound(8, ta.uiSounds[0]);
            }
            var5Lifetime4 = 400 - this.field_a * this.field_a;
            var6Lifetime3 = var5Lifetime4 * (480 - LevelPack.field_g) / 400 + LevelPack.field_g;
            sn.b((byte) -118, var6Lifetime3);
            nh.a(0);
            if (o.field_e != null) {
              stackIn_174_0 = (!lm.a(o.field_e.field_cc, 0)) ? 0 : 1;
            } else {
              stackIn_174_0 = 0;
            }
            var7Lifetime3 = stackIn_174_0;
            stackIn_176_0 = 15;
            stackIn_177_1 = (this.b(109)) ? false : true;
            stackIn_179_2 = 11;
            stackIn_179_3 = GameplayAudioEvent.mouseWheelDelta;
            stackIn_179_4 = 0;
            stackIn_179_5 = 16777215;
            stackIn_179_6 = true;
            stackIn_179_7 = 14;
            stackIn_179_8 = var7Lifetime3;
            stackIn_179_9 = param0;
            stackIn_179_10 = 13;
            stackIn_180_11 = (so.a((byte) -35) <= 50) ? false : true;
            dc.a(stackIn_176_0, stackIn_177_1, stackIn_179_2, stackIn_179_3, stackIn_179_4, stackIn_179_5, stackIn_179_6, stackIn_179_7, stackIn_179_8 != 0, stackIn_179_9, stackIn_179_10, stackIn_180_11);
          } else {
            this.field_a = 0;
            Brick.field_E = 0;
            if (n.field_d) {
              stackIn_190_0 = n.field_d;
              stackIn_191_1 = (var4Lifetime1 != 0) ? 0 : 1;
              if ((stackIn_190_0 ? 1 : 0) != stackIn_191_1) {
                var5Lifetime4 = 400 - this.field_a * this.field_a;
                var6Lifetime3 = var5Lifetime4 * (480 - LevelPack.field_g) / 400 + LevelPack.field_g;
                sn.b((byte) -118, var6Lifetime3);
                nh.a(0);
                if (o.field_e != null) {
                  stackIn_197_0 = (!lm.a(o.field_e.field_cc, 0)) ? 0 : 1;
                } else {
                  stackIn_197_0 = 0;
                }
                var7Lifetime3 = stackIn_197_0;
                stackIn_199_0 = 15;
                stackIn_200_1 = (this.b(109)) ? false : true;
                stackIn_202_2 = 11;
                stackIn_202_3 = GameplayAudioEvent.mouseWheelDelta;
                stackIn_202_4 = 0;
                stackIn_202_5 = 16777215;
                stackIn_202_6 = true;
                stackIn_202_7 = 14;
                stackIn_202_8 = var7Lifetime3;
                stackIn_202_9 = param0;
                stackIn_202_10 = 13;
                stackIn_203_11 = (so.a((byte) -35) <= 50) ? false : true;
                dc.a(stackIn_199_0, stackIn_200_1, stackIn_202_2, stackIn_202_3, stackIn_202_4, stackIn_202_5, stackIn_202_6, stackIn_202_7, stackIn_202_8 != 0, stackIn_202_9, stackIn_202_10, stackIn_203_11);
                if (sl.field_w) {
                  k.field_h.writeCipheredOpcode(-13413, 64);
                  sl.field_w = false;
                }
                if (tq.field_c) {
                  k.field_h.writeCipheredOpcode(-13413, 10);
                  tq.field_c = false;
                }
                return;
              }
              wp.playUiSound(8, ta.uiSounds[0]);
            }
            var5Lifetime4 = 400 - this.field_a * this.field_a;
            var6Lifetime3 = var5Lifetime4 * (480 - LevelPack.field_g) / 400 + LevelPack.field_g;
            sn.b((byte) -118, var6Lifetime3);
            nh.a(0);
            if (o.field_e != null) {
              stackIn_215_0 = (!lm.a(o.field_e.field_cc, 0)) ? 0 : 1;
            } else {
              stackIn_215_0 = 0;
            }
            var7Lifetime3 = stackIn_215_0;
            stackIn_217_0 = 15;
            stackIn_218_1 = (this.b(109)) ? false : true;
            stackIn_220_2 = 11;
            stackIn_220_3 = GameplayAudioEvent.mouseWheelDelta;
            stackIn_220_4 = 0;
            stackIn_220_5 = 16777215;
            stackIn_220_6 = true;
            stackIn_220_7 = 14;
            stackIn_220_8 = var7Lifetime3;
            stackIn_220_9 = param0;
            stackIn_220_10 = 13;
            stackIn_221_11 = (so.a((byte) -35) <= 50) ? false : true;
            dc.a(stackIn_217_0, stackIn_218_1, stackIn_220_2, stackIn_220_3, stackIn_220_4, stackIn_220_5, stackIn_220_6, stackIn_220_7, stackIn_220_8 != 0, stackIn_220_9, stackIn_220_10, stackIn_221_11);
          }
        }
        if (sl.field_w) {
          k.field_h.writeCipheredOpcode(-13413, 64);
          sl.field_w = false;
        }
        if (!tq.field_c) {
          return;
        }
        k.field_h.writeCipheredOpcode(-13413, 10);
        tq.field_c = false;
    }

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        if (param0 == -102) {
          field_c = null;
          field_d = null;
          return;
        }
        field_c = (vj) null;
        field_c = null;
        field_d = null;
    }

    final static void a(mf param0, mf param1, int param2) {
        int var4 = 0;
        PacketBuffer var8 = null;
        PacketBuffer var9 = null;
        PacketBuffer var10 = null;
        PacketBuffer var11 = null;
        PacketBuffer var7 = null;
        int var3_int = param0.a("", false);
        if (param2 != 2) {
          return;
        }
        try {
          na.field_L = new LevelPack[2];
          var4 = 0;
          var8 = new PacketBuffer(param0.a(param2 ^ 118, "single", ""));
          var9 = var8;
          na.field_L[0] = LevelPackLoader.loadLevelPack((byte) 76, param0, var9, var3_int, 0, 0, var4);
          var4 = var4 + na.field_L[0].levelCount;
          var10 = new PacketBuffer(param0.a(121, "hotseat", ""));
          qh.field_b = LevelPackLoader.loadLevelPack((byte) -115, param0, var10, var3_int, -1, -1, -1);
          var11 = new PacketBuffer(param0.a(100, "multiplayer", ""));
          tq.field_d = LevelPackLoader.loadLevelPack((byte) -97, param0, var11, var3_int, -1, -1, -1);
          tq.field_d.appendLevelData(qh.field_b, false);
          var3_int = param1.a("", false);
          var7 = new PacketBuffer(param1.a(-88, "single", ""));
          na.field_L[1] = LevelPackLoader.loadLevelPack((byte) 94, param1, var7, var3_int, 1, 1, var4);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "sb.H(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final boolean b(int param0) {
        if (param0 < 36) {
          field_d = (String) null;
          if (!ue.field_c) {
            return false;
          }
          if (pf.a(false, -2)) {
            return true;
          }
          return false;
        }
        if (!ue.field_c) {
          return false;
        }
        if (pf.a(false, -2)) {
          return true;
        }
        return false;
    }

    sb() {
        LevelSelectScreen.field_w = nn.field_g.descent + (qi.field_K[0].height + qi.field_K[6].height) + nn.field_g.capHeight;
        IntrusiveHashTable.field_l = qi.field_K[2].width + (3 + qi.field_K[0].width);
    }

    private final boolean c(int param0) {
        if (param0 != -25437) {
          return true;
        }
        if (this.b(param0 + 25496)) {
          return true;
        }
        if (!pf.field_p) {
          return false;
        }
        return true;
    }

    static {
        field_b = "To play a multiplayer game, please log in or create a free account.";
        field_d = "Welcome to Brick-À-Brac!<br><br>Clear the screen of coloured bricks by hitting them with the ball.<br><br>In this tutorial level, you will not be able to obtain any Achievements.";
        field_f = new java.awt.Color(10040319);
    }
}
