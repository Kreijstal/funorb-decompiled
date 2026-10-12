/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class vf {
    private short[] field_g;
    static String field_h;
    static RgbSprite[] smokeSprites;
    private int field_d;
    static String field_e;
    private int field_a;
    private short[] field_k;
    int field_b;
    static String field_c;
    static String field_l;
    static int field_f;
    private int field_i;

    abstract void b(int param0, int param1, int param2);

    final static void a(int param0, int param1) {
        ClientContextMenu.field_a = param1;
        if (param0 != 0) {
          field_f = -108;
        }
        pg.field_f = DirectByteStorage.field_h;
    }

    private final void b(int param0) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_g = new short[this.field_b];
        int var2 = 0;
        int var3 = -49 / ((-69 - param0) / 56);
        while (var2 < this.field_b) {
          this.field_g[var2] = (short)(int)Math.pow(2.0, (double)var2);
          var2++;
        }
    }

    final static void a(int param0, boolean param1, int param2, LobbyRoom param3) {
        IconTextComponent dupTemp$0 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        IconTextComponent stackIn_35_0 = null;
        boolean stackIn_36_1 = false;
        IconTextComponent stackIn_41_0 = null;
        boolean stackIn_42_1 = false;
        int stackIn_55_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_72_0 = 0;
        IconTextComponent stackIn_90_0 = null;
        boolean stackIn_91_1 = false;
        IconTextComponent stackIn_96_0 = null;
        boolean stackIn_96_1 = false;
        boolean stackIn_97_2 = false;
        IconTextComponent stackIn_100_0 = null;
        boolean stackIn_101_1 = false;
        IconTextComponent stackIn_105_0 = null;
        boolean stackIn_106_1 = false;
        int stackIn_110_0 = 0;
        IconTextComponent stackIn_123_0 = null;
        boolean stackIn_124_1 = false;
        IconTextComponent stackIn_128_0 = null;
        boolean stackIn_129_1 = false;
        IconTextComponent stackIn_132_0 = null;
        boolean stackIn_133_1 = false;
        IconTextComponent stackIn_136_0 = null;
        boolean stackIn_137_1 = false;
        String stackIn_153_0 = null;
        IconTextComponent stackIn_158_0 = null;
        boolean stackIn_159_1 = false;
        IconTextComponent stackIn_161_0 = null;
        boolean stackIn_162_1 = false;
        int stackIn_170_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_230_0 = 0;
        IconTextComponent stackIn_327_0 = null;
        boolean stackIn_328_1 = false;
        IconTextComponent stackIn_334_0 = null;
        boolean stackIn_334_1 = false;
        boolean stackIn_335_2 = false;
        IconTextComponent stackIn_337_0 = null;
        int stackIn_337_1 = 0;
        int stackIn_337_2 = 0;
        int stackIn_337_3 = 0;
        boolean stackIn_340_1 = false;
        IconTextComponent stackIn_344_0 = null;
        boolean stackIn_345_1 = false;
        RuntimeException stackIn_354_0 = null;
        StringBuilder stackIn_354_1 = null;
        String stackIn_355_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        IconTextComponent[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        IconTextComponent var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var22_int = 0;
        int var23 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        IconTextComponent var28 = null;
        IconTextComponent var29 = null;
        IconTextComponent[] var30 = null;
        String var31 = null;
        String var32 = null;
        Object var25Lifetime1;
        String var25_refLifetime1;
        Object var25Lifetime1Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1) {
            stackIn_12_0 = (SpellCastAction.field_s) ? 0 : 1;
            var4_int = stackIn_12_0;
          } else {
            if (vu.isCurrentRoomOwner(false)) {
              stackIn_8_0 = (!param3.playing) ? 1 : 0;
            } else {
              stackIn_8_0 = 0;
            }
            var4_int = stackIn_8_0;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var5 = 0;
          if (param1) {
            decompiledFrameRemainder1 = !(lm.field_e.length < 2);
            if (decompiledFrameRemainder1) {
              if (param1) {
                stackIn_22_0 = (-1 != ResourceProtocolClient.field_c) ? 1 : 0;
              } else {
                stackIn_22_0 = 0;
              }
              var6 = stackIn_22_0;
              decompiledFrameRemainder0 = (var6 != 0);
              if (decompiledFrameRemainder0) {
                var7 = ResourceProtocolClient.field_c;
                for (var8_int = 0; var8_int < CoatOfArms.field_d.length; var8_int++) {
                  CoatOfArms.field_d[var8_int] = (byte) 0;
                }
              }
            }
          } else {
            for (var6 = 0; var6 < 5; var6++) {
              if (var4_int != 0 &&
                pu.field_k[0][var6 + 1].pressedButton != 0 &&
                var6 != param3.gameType) {
                var5 = 1;
                param3.gameType = var6;
              }
              stackIn_35_0 = pu.field_k[0][1 + var6];
              stackIn_36_1 = (var4_int != 0);
              stackIn_35_0.inputEnabled = stackIn_36_1;
              if (!fh.field_c &&
                var6 == 3) {
                pu.field_k[0][var6 + 1].inputEnabled = false;
              }
              stackIn_41_0 = pu.field_k[0][1 + var6];
              stackIn_42_1 = (var6 == param3.gameType);
              stackIn_41_0.selected = stackIn_42_1;
            }
            if (pu.field_k[0][2].hovered) {
              if (!vu.isCurrentRoomOwner(false)) {
                ad.field_I = fo.a(4800, op.field_a, new String[]{vu.currentRoom.ownerName});
              } else {
                ad.field_I = ActionSpell.field_f;
              }
            }
            decompiledFrameRemainder1 = !(lm.field_e.length < 2);
            if (decompiledFrameRemainder1) {
              if (param1) {
                stackIn_55_0 = (-1 != ResourceProtocolClient.field_c) ? 1 : 0;
              } else {
                stackIn_55_0 = 0;
              }
              var6 = stackIn_55_0;
              decompiledFrameRemainder0 = (var6 != 0);
              if (decompiledFrameRemainder0) {
                var7 = ResourceProtocolClient.field_c;
                for (var8_int = 0; var8_int < CoatOfArms.field_d.length; var8_int++) {
                  CoatOfArms.field_d[var8_int] = (byte) 0;
                }
              }
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            CoatOfArms.field_d[var7 / 8] = (byte)oe.bitwiseOr((int) CoatOfArms.field_d[var7 / 8], 1 << var7 % 8);
          }
          if (decompiledFrameRemainder1) {
            stackIn_64_0 = (param1) ? -1 : 0;
            for (var7 = stackIn_64_0; var7 < lm.field_e.length; var7++) {
              if (var6 != 0) {
                stackIn_72_0 = (ResourceProtocolClient.field_c != var7) ? 1 : 0;
              } else {
                stackIn_72_0 = 0;
              }
              var8_intLifetime1 = stackIn_72_0;
              if (var4_int != 0 &&
                0 != pu.field_k[1][var7 + 1].pressedButton) {
                if (!param1) {
                  var9 = lm.field_e[var7];
                  if (var9 != param3.playerCapacity) {
                    param3.playerCapacity = var9;
                    var5 = 1;
                  }
                } else {
                  if (var6 == 0) {
                    if (var7 == -1) {
                      for (var9 = 0; var9 < CoatOfArms.field_d.length; var9++) {
                        CoatOfArms.field_d[var9] = (byte) 0;
                      }
                    } else {
                      CoatOfArms.field_d[var7 / 8] = (byte)GrowthEvent.bitwiseXor((int) CoatOfArms.field_d[var7 / 8], 1 << rn.bitwiseAnd(var7, 7));
                    }
                  }
                }
              }
              if (!param1) {
                var9 = lm.field_e[var7];
                stackIn_100_0 = pu.field_k[1][var7 + 1];
                stackIn_101_1 = (var9 == param3.playerCapacity);
                stackIn_100_0.selected = stackIn_101_1;
              } else {
                if (var7 == -1) {
                  pu.field_k[1][1 + var7].selected = true;
                  for (var9 = 0; var9 < lm.field_e.length; var9++) {
                    dupTemp$0 = pu.field_k[1][var7 + 1];
                    stackIn_96_0 = dupTemp$0;
                    stackIn_96_1 = dupTemp$0.selected;
                    stackIn_97_2 = (0 == (CoatOfArms.field_d[var9 / 8] & 1 << (7 & var9)));
                    stackIn_96_0.selected = stackIn_96_1 & stackIn_97_2;
                  }
                } else {
                  stackIn_90_0 = pu.field_k[1][var7 + 1];
                  stackIn_91_1 = ((CoatOfArms.field_d[var7 / 8] & 1 << (var7 & 7)) != 0);
                  stackIn_90_0.selected = stackIn_91_1;
                }
              }
              stackIn_105_0 = pu.field_k[1][var7 + 1];
              stackIn_106_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_105_0.inputEnabled = stackIn_106_1;
            }
          }
          stackIn_110_0 = (!param1) ? 1 : 0;
          for (var6Lifetime1 = stackIn_110_0; var6Lifetime1 < 3; var6Lifetime1++) {
            var28 = pu.field_k[2][var6Lifetime1];
            if (var4_int != 0 &&
              var28.pressedButton != 0) {
              if (param1) {
                if (var6Lifetime1 == 0) {
                  AiPlanningStrategy.field_b = 0;
                } else {
                  AiPlanningStrategy.field_b = AiPlanningStrategy.field_b ^ var6Lifetime1;
                }
              } else {
                if (var6Lifetime1 != param3.spectatorMode) {
                  param3.spectatorMode = var6Lifetime1;
                  var5 = 1;
                }
              }
            }
            stackIn_123_0 = var28;
            stackIn_124_1 = (var4_int != 0);
            stackIn_123_0.inputEnabled = stackIn_124_1;
            if (!param1) {
              stackIn_136_0 = var28;
              stackIn_137_1 = ((var6Lifetime1 & param3.spectatorMode) != 0);
              stackIn_136_0.selected = stackIn_137_1;
            } else {
              if (var6Lifetime1 != 0) {
                stackIn_132_0 = var28;
                stackIn_133_1 = ((var6Lifetime1 & AiPlanningStrategy.field_b) != 0);
                stackIn_132_0.selected = stackIn_133_1;
              } else {
                stackIn_128_0 = var28;
                stackIn_129_1 = (AiPlanningStrategy.field_b == 0);
                stackIn_128_0.selected = stackIn_129_1;
              }
            }
          }
          if (param1 &&
            BoundedFile.field_h > 1) {
            for (var6Lifetime2 = 0; 1 + BoundedFile.field_h > var6Lifetime2; var6Lifetime2++) {
              var29 = pu.field_k[3][var6Lifetime2];
              if (var4_int != 0 &&
                var29.pressedButton != 0) {
                DiskCacheRequest.field_E = var6Lifetime2;
              }
              if (var29.hovered &&
                0 < var6Lifetime2) {
                if (DirectByteStorage.field_j != null) {
                  stackIn_153_0 = DirectByteStorage.field_j[var6Lifetime2 - 1];
                } else {
                  stackIn_153_0 = null;
                }
                var8 = stackIn_153_0;
                if (var8 != null) {
                  ad.field_I = var8;
                }
              }
              stackIn_158_0 = var29;
              stackIn_159_1 = (var6Lifetime2 == DiskCacheRequest.field_E);
              stackIn_158_0.selected = stackIn_159_1;
              stackIn_161_0 = var29;
              stackIn_162_1 = (var4_int != 0);
              stackIn_161_0.inputEnabled = stackIn_162_1;
            }
          }
          var6Lifetime3 = 0;
          if (param0 != 1) {
            field_e = (String) null;
          }
          for (var7 = 0; tq.gameOptionCount > var7; var7++) {
            var30 = pu.field_k[var7 + 4];
            var8_array = var30;
            stackIn_170_0 = (param1) ? -1 : 0;
            for (var9 = stackIn_170_0; var9 < -1 + var30.length; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                var9 >= 0) {
                if (CombatPresentation.field_j != null &&
                  CombatPresentation.field_j[var7] != null &&
                  (~BoundedFile.field_a & CombatPresentation.field_j[var7][var9]) > 0) {
                  var14 = 1;
                  var15 = fd.a(true, CombatPresentation.field_j[var7][var9] & ~BoundedFile.field_a);
                }
                if (ep.field_p != null &&
                  null != ep.field_p[var7] &&
                  df.field_M <= 0 &&
                  ep.field_p[var7][var9]) {
                  var10 = 1;
                }
                if (null != iv.field_e &&
                  null != iv.field_e[var7]) {
                  var16 = iv.field_e[var7][var9];
                  if (0 != var16 &&
                    !bj.field_k &&
                    df.field_M <= 0) {
                    var10 = 1;
                  }
                  if (0 < var16 &&
                    GlobalSpell.field_g < var16) {
                    var12 = 1;
                  }
                }
                if (null != jv.field_d &&
                  jv.field_d[var7] != null) {
                  var16Lifetime2 = jv.field_d[var7][var9];
                  if (0 < var16Lifetime2 &&
                    var16Lifetime2 > SummonAction.field_s) {
                    var11 = 1;
                  }
                  if (var16Lifetime2 != 0 &&
                    !bj.field_k &&
                    df.field_M <= 0) {
                    var10 = 1;
                  }
                }
                if (param1) {
                  if (ke.field_b != null) {
                    if (null != ke.field_b[var7]) {
                      stackIn_217_0 = (ke.field_b[var7][var9]) ? 1 : 0;
                    } else {
                      stackIn_217_0 = 0;
                    }
                  } else {
                    stackIn_217_0 = 0;
                  }
                } else {
                  stackIn_217_0 = 0;
                }
                var13 = stackIn_217_0;
              }
              if (BufferedSocket.field_j >= 2 &&
                br.heldKeys[12]) {
                var11 = 0;
                var12 = 0;
                var10 = 0;
                var13 = 0;
                var14 = 0;
              }
              fc.field_a = true;
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0 &&
                var14 == 0) {
                stackIn_230_0 = 0;
              } else {
                stackIn_230_0 = 1;
              }
              var16Lifetime1 = stackIn_230_0;
              if (var16Lifetime1 == 0 &&
                0 <= var9 &&
                null != fs.field_d && (!param1 ||
                !SpellCastAction.field_s)) {
                jp.field_a = false;
                fc.field_a = false;
                if (null == TeleportAction.field_B) {
                  TeleportAction.field_B = new byte[tq.gameOptionCount];
                  dt.field_d = new boolean[tq.gameOptionCount];
                }
                for (var17_int = 0; var17_int < var7; var17_int++) {
                  dt.field_d[var17_int] = false;
                }
                es.a(0, var7, param3, -1, param1, var9, (byte) 103, -1);
                if (BufferedSocket.field_j >= 2 &&
                  br.heldKeys[12]) {
                  fc.field_a = true;
                }
                if (!fc.field_a) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[var9 + 1];
              if (var4_int != 0 &&
                var17.pressedButton != 0) {
                if (!param1) {
                  if (var16Lifetime1 == 0 &&
                    param3.gameOptions[var7] != (byte)var9) {
                    var5 = 1;
                    param3.gameOptions[var7] = (byte)var9;
                  }
                } else {
                  if (var9 == -1) {
                    for (var18 = var6Lifetime3; var18 < var30.length + var6Lifetime3 - 1; var18++) {
                      ClientContextMenu.field_d[var18 / 8] = (byte)rn.bitwiseAnd((int) ClientContextMenu.field_d[var18 / 8], ~(1 << rn.bitwiseAnd(7, var18)));
                    }
                  } else {
                    ClientContextMenu.field_d[(var6Lifetime3 + var9) / 8] = (byte)GrowthEvent.bitwiseXor((int) ClientContextMenu.field_d[(var6Lifetime3 + var9) / 8], 1 << rn.bitwiseAnd(var9 + var6Lifetime3, 7));
                  }
                }
              }
              if (param1 &&
                var16Lifetime1 != 0) {
                ClientContextMenu.field_d[(var6Lifetime3 + var9) / 8] = (byte)rn.bitwiseAnd((int) ClientContextMenu.field_d[(var6Lifetime3 + var9) / 8], ~(1 << rn.bitwiseAnd(var9 + var6Lifetime3, 7)));
              }
              if (var9 >= 0 &&
                var17.hovered) {
                if (VerticalScrollbar.field_Mb == null) {
                  var18_ref = null;
                } else {
                  if (VerticalScrollbar.field_Mb[var7] == null) {
                    var18_ref = null;
                  } else {
                    var18_ref = VerticalScrollbar.field_Mb[var7][var9];
                  }
                }
                if (wb.field_a == null) {
                  var19 = null;
                } else {
                  if (null == wb.field_a[var7]) {
                    var19 = null;
                  } else {
                    var19 = wb.field_a[var7][var9];
                  }
                }
                var20 = null;
                if (var19 != null &&
                  !((String) (var19)).equals(var18_ref)) {
                  var20 = var19;
                }
                var21 = null;
                if (var13 != 0) {
                  var21 = TaggedMapData.field_h;
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
                } else {
                  if (var10 != 0) {
                    var21 = gt.field_a;
                  } else {
                    if (var11 != 0) {
                      var22_int = jv.field_d[var7][var9] - SummonAction.field_s;
                      if (var22_int != 1) {
                        var21 = fo.a(4800, ByteStorage.field_a, new String[]{Integer.toString(var22_int)});
                      } else {
                        var21 = bt.field_a;
                      }
                    }
                    if (var12 != 0) {
                      var31 = fo.a(4800, AnimationSequence.field_k, new String[]{Integer.toString(GlobalSpell.field_g), Integer.toString(iv.field_e[var7][var9])});
                      var22 = var31;
                      var25 = var22;
                      var22 = var25;
                      var21 = var22;
                      var25_ref = var31;
                      var22 = var25_ref;
                      if (var21 == null) {
                        var21 = var31;
                      } else {
                        var21 = (String) (var21) + "<br>" + var31;
                      }
                    }
                    if (var14 != 0) {
                      var22 = ParasiteEvent.field_F;
                      if (var15 > 0 &&
                        jl.field_c != null &&
                        var15 <= jl.field_c.length &&
                        null != jl.field_c[var15 - 1]) {
                        var22 = jl.field_c[var15 - 1][0];
                      }
                      if (var21 != null) {
                        var21 = (String) (var21) + "<br>" + (String) (var22);
                      } else {
                        var21 = var22;
                      }
                    }
                  }
                }
                if (var4_int != 0 &&
                  !fc.field_a) {
                  var22 = null;
                  if (jp.field_a) {
                    var22 = "</col>" + ep.field_h + "<col=A00000>";
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var25Lifetime1Lifetime1 = var22;
                    var22 = var25Lifetime1Lifetime1;
                    var21 = var22;
                  }
                  var23 = 0;
                  for (var24 = 0; var24 < var7; var24++) {
                    if (dt.field_d[var24]) {
                      var25_refLifetime1 = "</col>" + ob.field_M[var24] + "<col=A00000>";
                      var22 = var25_refLifetime1;
                      var21 = var22;
                      var22 = var25_refLifetime1;
                      if (var22 != null) {
                        var22 = (String) (var22) + ", " + var25_refLifetime1;
                        var21 = var22;
                        var21 = var22;
                        var23 = 1;
                      } else {
                        var22 = var25_refLifetime1;
                      }
                    }
                  }
                  if (var23 == 0) {
                    var21 = fo.a(4800, ab.field_e, new String[]{(String) (var22)});
                  } else {
                    var21 = mj.field_a + (String) (var22);
                  }
                }
                if (var21 != null) {
                  var21 = "<col=A00000>" + (String) (var21);
                  var32 = dj.a(6609, (String) (var21), "<br>", "<br><col=A00000>");
                  if (var20 != null) {
                    var20 = (String) (var20) + "<br>" + var32;
                  } else {
                    var20 = var32;
                  }
                }
                if (var20 != null) {
                  ad.field_I = (String) (var20);
                }
              }
              if (param1) {
                if (var9 == -1) {
                  var17.selected = true;
                  var27 = var6Lifetime3;
                  var18Lifetime1 = var27;
                  while (var30.length + var6Lifetime3 - 1 > var27) {
                    stackIn_334_0 = var17;
                    stackIn_334_1 = var17.selected;
                    stackIn_335_2 = ((ClientContextMenu.field_d[var27 / 8] & 1 << (var27 & 7)) == 0);
                    stackIn_334_0.selected = stackIn_334_1 & stackIn_335_2;
                    var27++;
                  }
                } else {
                  stackIn_337_0 = var17;
                  stackIn_337_1 = -1;
                  stackIn_337_2 = ClientContextMenu.field_d[(var9 + var6Lifetime3) / 8] & 1 << (var9 + var6Lifetime3 & 7);
                  stackIn_337_3 = -1;
                  stackIn_340_1 = (stackIn_337_1 != (stackIn_337_2 ^ stackIn_337_3));
                  stackIn_337_0.selected = stackIn_340_1;
                }
              } else {
                stackIn_327_0 = var17;
                stackIn_328_1 = (fc.field_a) && ((byte)var9 == param3.gameOptions[var7]);
                stackIn_327_0.selected = stackIn_328_1;
              }
              stackIn_344_0 = var17;
              stackIn_345_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_344_0.inputEnabled = stackIn_345_1;
            }
            var6Lifetime3 = var6Lifetime3 + (255 & t.field_b[var7]);
          }
          if (var5 != 0) {
            if (param1) {
              return;
            }
            AiUnitPlanner.b(5, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_354_0 = var4;
          stackIn_354_1 = new StringBuilder().append("vf.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_355_2 = "null";
          } else {
            stackIn_355_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_354_0), ((StringBuilder) (Object) stackIn_354_1).append(stackIn_355_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_e = null;
        smokeSprites = null;
        field_l = null;
        if (param0 >= -70) {
          return;
        }
        field_h = null;
        field_c = null;
    }

    final void c(int param0, int param1, int param2) {
        int var23 = 0;
        int var22 = 0;
        int var24 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int[] var25;
        int[] var26;
        int var27;
        int var28;
        int[] var29;
        int[] var30;
        int[] var31;
        int[] var32;
        int var27Lifetime1;
        int var27Lifetime2;
        int var18Lifetime1;
        int var19Lifetime1;
        var28 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 != 1) {
          field_l = (String) null;
        }
        var31 = new int[param2];
        var29 = var31;
        var25 = var29;
        for (var27 = 0; var27 < param2; var27++) {
          var25[var27] = (var27 << 12) / param2;
        }
        var32 = new int[param0];
        var30 = var32;
        var26 = var30;
        for (var27Lifetime1 = 0; var27Lifetime1 < param0; var27Lifetime1++) {
          var26[var27Lifetime1] = (var27Lifetime1 << 12) / param0;
        }
        this.a(param1 ^ -30419);
        for (var23 = 0; var23 < param0; var23++) {
          for (var22 = 0; var22 < param2; var22++) {
            for (var24 = 0; this.field_b > var24; var24++) {
              var27Lifetime2 = this.field_g[var24] << 12;
              var6 = this.field_a * var27Lifetime2 >> 12;
              var4 = var31[var22] * var27Lifetime2 >> 12;
              var7 = var27Lifetime2 * this.field_d >> 12;
              var5 = var32[var23] * var27Lifetime2 >> 12;
              var5 = var5 * this.field_d;
              var4 = var4 * this.field_a;
              var8 = var4 >> 12;
              var9 = var8 + 1;
              var10 = var5 >> 12;
              var8 = var8 & 255;
              var11 = var10 + 1;
              var5 = var5 & 4095;
              if (var9 < var6) {
                var9 = var9 & 255;
              } else {
                var9 = 0;
              }
              var10 = var10 & 255;
              var4 = var4 & 4095;
              if (var7 <= var11) {
                var11 = 0;
              } else {
                var11 = var11 & 255;
              }
              var14 = var4 - 4096;
              var13 = mw.field_F[var5];
              var17 = this.field_k[var11];
              var15 = var5 - 4096;
              var16 = this.field_k[var10];
              var12 = mw.field_F[var4];
              var18 = ma.a(var4, 3, (int) this.field_k[var16 + var8], var5);
              var19 = ma.a(var14, 3, (int) this.field_k[var9 + var16], var5);
              var20 = (var12 * (var19 - var18) >> 12) + var18;
              var18Lifetime1 = ma.a(var4, 3, (int) this.field_k[var17 + var8], var15);
              var19Lifetime1 = ma.a(var14, 3, (int) this.field_k[var17 + var9], var15);
              var21 = var18Lifetime1 + (var12 * (-var18Lifetime1 + var19Lifetime1) >> 12);
              this.b(var24, (var13 * (-var20 + var21) >> 12) + var20, 19699);
            }
            this.a((byte) -127);
          }
        }
    }

    final static IndexedSprite a(int[] param0, int param1, IndexedSprite param2) {
        IndexedSprite var3 = null;
        RuntimeException var3_ref = null;
        IndexedSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -13546) {
            field_l = (String) null;
          }
          var3 = new IndexedSprite(0, 0, 0);
          var3.palette = param0;
          var3.offsetY = param2.offsetY;
          var3.pixelWidth = param2.pixelWidth;
          var3.pixelIndices = param2.pixelIndices;
          var3.offsetX = param2.offsetX;
          var3.canvasHeight = param2.canvasHeight;
          var3.pixelHeight = param2.pixelHeight;
          var3.canvasWidth = param2.canvasWidth;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("vf.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    abstract void a(int param0);

    abstract void a(byte param0);

    vf(int param0, int param1, int param2, int param3, int param4) {
        this.field_k = new short[512];
        this.field_d = 4;
        this.field_a = 4;
        this.field_b = 4;
        this.field_i = 0;
        this.field_a = param2;
        this.field_i = param0;
        this.field_b = param1;
        this.field_d = param3;
        this.b(-125);
        this.d(-256);
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != -1) {
          return -123;
        }
        if (rs.field_o == null) {
          return -1;
        }
        if (param0 >= VertexNormal.field_c && VertexNormal.field_c + rs.field_o.pixelWidth > param0 && param2 >= ro.field_pb &&
          !(param2 >= ro.field_pb + rs.field_o.pixelHeight)) {
          return 0;
        }
        if (param0 >= BattlefieldTheme.field_h && BattlefieldTheme.field_h + rs.field_o.pixelWidth > param0 && ug.field_a <= param2 &&
          !(rs.field_o.pixelHeight + ug.field_a <= param2)) {
          return 1;
        }
        return -1;
    }

    private final void d(int param0) {
        Random var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var3Lifetime1;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != -256) {
          field_f = 9;
        }
        var2 = new Random((long)this.field_i);
        for (var3 = 0; var3 < 255; var3++) {
          this.field_k[var3] = (short)var3;
        }
        for (var3Lifetime1 = 0; var3Lifetime1 < 255; var3Lifetime1++) {
          var4 = 255 - var3Lifetime1;
          var5 = AttackEvent.nextBoundedInt(false, var4, var2);
          var6 = this.field_k[var5];
          this.field_k[var5] = this.field_k[var4];
          this.field_k[256 + var4] = (short) var6;
          this.field_k[var4] = (short) var6;
        }
    }

    static {
        field_h = "Toxins";
        field_e = "You have entered another game.";
        field_f = -1;
        field_c = "(1 player wants to join)";
        field_l = "Add <%0> to friend list";
    }
}
