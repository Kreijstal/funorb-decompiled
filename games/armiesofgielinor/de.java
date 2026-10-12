/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static String field_c;
    static String field_d;
    static String field_b;
    static boolean field_a;

    final static String a(byte param0, int param1, Battlefield param2, int param3, int param4, int param5) {
        int var7_int = 0;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        String stackIn_32_0 = null;
        String stackIn_37_0 = null;
        String stackIn_52_0 = null;
        String stackIn_69_0 = null;
        String stackIn_73_0 = null;
        String stackIn_89_0 = null;
        String stackIn_92_0 = null;
        String stackIn_96_0 = null;
        String stackIn_100_0 = null;
        String stackIn_103_0 = null;
        String stackIn_107_0 = null;
        String stackIn_110_0 = null;
        String stackIn_113_0 = null;
        String stackIn_117_0 = null;
        String stackIn_120_0 = null;
        String stackIn_123_0 = null;
        String stackIn_130_0 = null;
        String stackIn_132_0 = null;
        String stackIn_138_0 = null;
        String stackIn_141_0 = null;
        String stackIn_147_0 = null;
        String stackIn_154_0 = null;
        String stackIn_158_0 = null;
        String stackIn_163_0 = null;
        String stackIn_167_0 = null;
        String stackIn_172_0 = null;
        String stackIn_177_0 = null;
        String stackIn_180_0 = null;
        String stackIn_185_0 = null;
        String stackIn_190_0 = null;
        String stackIn_195_0 = null;
        String stackIn_200_0 = null;
        String stackIn_204_0 = null;
        String stackIn_209_0 = null;
        String stackIn_212_0 = null;
        String stackIn_219_0 = null;
        String stackIn_224_0 = null;
        String stackIn_230_0 = null;
        String stackIn_236_0 = null;
        String stackIn_245_0 = null;
        String stackIn_253_0 = null;
        int stackIn_262_0 = 0;
        int stackIn_265_1 = 0;
        String stackIn_267_0 = null;
        String stackIn_271_0 = null;
        String stackIn_276_0 = null;
        String stackIn_280_0 = null;
        String stackIn_283_0 = null;
        String stackIn_286_0 = null;
        String stackIn_292_0 = null;
        String stackIn_296_0 = null;
        String stackIn_300_0 = null;
        String stackIn_304_0 = null;
        String stackIn_308_0 = null;
        String stackIn_311_0 = null;
        String stackIn_315_0 = null;
        String stackIn_320_0 = null;
        String stackIn_323_0 = null;
        String stackIn_327_0 = null;
        Object stackIn_329_0 = null;
        RuntimeException stackIn_332_0 = null;
        StringBuilder stackIn_332_1 = null;
        String stackIn_333_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Unit var7 = null;
        int var8 = 0;
        int var9 = 0;
        MapTile var10 = null;
        MapTile var11 = null;
        int var8Lifetime1;
        int var8Lifetime2;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param5 != param2.currentPlayer) {
            stackIn_4_0 = sj.field_g;
            return stackIn_4_0;
          }
          if (0 < param2.e(20, param5, param4)) {
            stackIn_8_0 = fo.a(4800, kv.field_I, new String[]{Integer.toString(uc.spellDefinitions[param4][1] + 1)});
            return stackIn_8_0;
          }
          if (uc.spellDefinitions[param4][3] == 4) {
            if (uc.spellDefinitions[param4][5] == 1) {
              if (0 == param2.godFavourLevels[param5][uc.spellDefinitions[param4][6]]) {
                stackIn_21_0 = fo.a(4800, RegionAnchor.field_n, new String[]{wf.field_q[1 + uc.spellDefinitions[param4][6]]});
                return stackIn_21_0;
              }
              if (param2.godFavourLevels[param5][uc.spellDefinitions[param4][6]] < 5) {
                return null;
              }
              stackIn_25_0 = fo.a(4800, rr.field_b, new String[]{wf.field_q[uc.spellDefinitions[param4][6] + 1]});
              return stackIn_25_0;
            }
            if (uc.spellDefinitions[param4][5] != 2) {
              return null;
            }
            if (!param2.kingBlackDragonSummoned) {
              stackIn_17_0 = ij.field_B;
              return stackIn_17_0;
            }
            stackIn_27_0 = null;
            return (String) (stackIn_27_0);
          }
          if (0 <= param3 &&
            param1 >= 0) {
            if (param2.mapWidth > param3 &&
              param2.mapHeight > param1) {
              var6_int = 98 % ((param0 - 5) / 61);
              for (var7_int = -uc.spellDefinitions[param4][7] + param3; var7_int <= uc.spellDefinitions[param4][7] + param3; var7_int++) {
                for (var8 = -uc.spellDefinitions[param4][7] + param1; uc.spellDefinitions[param4][7] + param1 >= var8; var8++) {
                  if (var7_int >= 0 &&
                    0 <= var8 &&
                    param2.mapWidth > var7_int &&
                    param2.mapHeight > var8) {
                    if (param2.tiles[param2.mapWidth * var8 + var7_int].terrainType != 7 &&
                      param2.tiles[param2.mapWidth * var8 + var7_int].terrainType != 11) {
                      continue;
                    }
                    stackIn_52_0 = kp.field_c;
                    return stackIn_52_0;
                  }
                  break;
                }
              }
              var10 = param2.tiles[param3 + param2.mapWidth * param1];
              var11 = var10;
              var7 = var10.occupant;
              var8Lifetime1 = uc.spellDefinitions[param4][3];
              if (var8Lifetime1 != 0) {
                if (var8Lifetime1 == 1) {
                  if (var7 == null) {
                    stackIn_283_0 = ai.field_N;
                    return stackIn_283_0;
                  }
                  if (param2.arePlayersAllied(var7.ownerPlayer, -16985, param5)) {
                    stackIn_286_0 = MovementPresentation.field_r;
                    return stackIn_286_0;
                  }
                  if (param4 != 68) {
                    return null;
                  }
                  if (!var7.poisoned) {
                    return null;
                  }
                  stackIn_292_0 = Unit.field_T;
                  return stackIn_292_0;
                }
                if (var8Lifetime1 == 2) {
                  if (var7 != null) {
                    return null;
                  }
                  stackIn_296_0 = ai.field_N;
                  return stackIn_296_0;
                }
                if (var8Lifetime1 != 8) {
                  if (var8Lifetime1 == 6) {
                    if (-1 == param2.a(param1, 2056, param3)) {
                      stackIn_308_0 = qt.field_d;
                      return stackIn_308_0;
                    }
                  } else {
                    if (var8Lifetime1 == 5) {
                      if (8 != var11.terrainType) {
                        stackIn_311_0 = TextCursor.field_g;
                        return stackIn_311_0;
                      }
                      if (param2.arePlayersAllied(var11.ownerPlayer, -16985, param5)) {
                        return null;
                      }
                      stackIn_315_0 = ActionSpell.field_k;
                      return stackIn_315_0;
                    }
                    if (var8Lifetime1 == 7) {
                      if (var11.terrainType != 8 &&
                        9 != var11.terrainType) {
                        stackIn_320_0 = tv.field_d;
                        return stackIn_320_0;
                      }
                      if (param2.arePlayersAllied(var11.ownerPlayer, -16985, param5)) {
                        stackIn_323_0 = uc.field_c;
                        return stackIn_323_0;
                      }
                      if (var11.ownerPlayer == -1) {
                        stackIn_327_0 = uc.field_c;
                        return stackIn_327_0;
                      }
                    }
                  }
                } else {
                  if (var7 == null) {
                    stackIn_300_0 = ai.field_N;
                    return stackIn_300_0;
                  }
                  if (param5 == var7.ownerPlayer) {
                    stackIn_304_0 = na.field_N;
                    return stackIn_304_0;
                  }
                }
                stackIn_329_0 = null;
                return (String) (stackIn_329_0);
              }
              if (var7 == null) {
                stackIn_69_0 = ai.field_N;
                return stackIn_69_0;
              }
              if (!param2.arePlayersAllied(var7.ownerPlayer, -16985, param5)) {
                stackIn_73_0 = gp.field_a;
                return stackIn_73_0;
              }
              var8Lifetime2 = param4;
              if (115 != var8Lifetime2) {
                if (var8Lifetime2 == 119) {
                  if (var7.unitType != 43) {
                    stackIn_96_0 = fg.field_n;
                    return stackIn_96_0;
                  }
                  if (var7.packedFlag32) {
                    stackIn_100_0 = fo.a(4800, ti.field_b, new String[]{fq.field_f[param4]});
                    return stackIn_100_0;
                  }
                } else {
                  if (var8Lifetime2 != 118) {
                    if (var8Lifetime2 == 116) {
                      if (var7.unitType != 58) {
                        stackIn_110_0 = GlobalSpell.field_i;
                        return stackIn_110_0;
                      }
                      if (var7.packedFlag32) {
                        stackIn_113_0 = fo.a(4800, ti.field_b, new String[]{fq.field_f[param4]});
                        return stackIn_113_0;
                      }
                    } else {
                      if (var8Lifetime2 != 117) {
                        if (var8Lifetime2 != 120) {
                          if (var8Lifetime2 == 46) {
                            if (34 == var7.unitType &&
                              var7.packedFlag8 &&
                              var7.attacksRemaining > 0) {
                              stackIn_132_0 = eq.field_g;
                              return stackIn_132_0;
                            }
                            if (!var7.movementSpent) {
                              stackIn_130_0 = eq.field_g;
                              return stackIn_130_0;
                            }
                          }
                        } else {
                          if (var7.meleeLifeSteal) {
                            stackIn_123_0 = fo.a(4800, ti.field_b, new String[]{fq.field_f[param4]});
                            return stackIn_123_0;
                          }
                        }
                      } else {
                        if (53 != var7.unitType) {
                          stackIn_117_0 = cs.field_X;
                          return stackIn_117_0;
                        }
                        if (var7.packedFlag32) {
                          stackIn_120_0 = fo.a(4800, ti.field_b, new String[]{fq.field_f[param4]});
                          return stackIn_120_0;
                        }
                      }
                    }
                  } else {
                    if (var7.unitType != 59) {
                      stackIn_103_0 = SpellCastEvent.field_A;
                      return stackIn_103_0;
                    }
                    if (var7.packedFlag32) {
                      stackIn_107_0 = fo.a(4800, ti.field_b, new String[]{fq.field_f[param4]});
                      return stackIn_107_0;
                    }
                  }
                }
              } else {
                if (var7.unitType != 63) {
                  stackIn_89_0 = eq.field_k;
                  return stackIn_89_0;
                }
                if (var7.packedFlag32) {
                  stackIn_92_0 = fo.a(4800, ti.field_b, new String[]{fq.field_f[param4]});
                  return stackIn_92_0;
                }
              }
              if (uc.spellDefinitions[param4][4] == 5) {
                if (param5 != var7.ownerPlayer) {
                  stackIn_138_0 = ji.field_a;
                  return stackIn_138_0;
                }
                if (var7.movementSpent) {
                  stackIn_141_0 = vg.field_o;
                  return stackIn_141_0;
                }
                if (param4 == 109 && (var7.unitType == 39 ||
                  51 == var7.unitType)) {
                  stackIn_147_0 = TaggedMapData.field_i;
                  return stackIn_147_0;
                }
              }
              boolean decompiledFrameRemainder1 = true;
              if (uc.spellDefinitions[param4][4] == 2 &&
                19 == uc.spellDefinitions[param4][5]) {
                if (uc.spellDefinitions[param4][6] < bw.unitDefinitions[var7.unitType][2]) {
                  stackIn_154_0 = fo.a(4800, sq.field_s, new String[]{Integer.toString(uc.spellDefinitions[param4][6]), Integer.toString(bw.unitDefinitions[var7.unitType][2])});
                  return stackIn_154_0;
                }
                if (var7.packedFlag256) {
                  stackIn_158_0 = lb.field_b;
                  return stackIn_158_0;
                }
                if ((!var7.movementSpent &&
                  8 != var7.statusEffectType) &&
                  (decompiledFrameRemainder1 = (var7.unitType == 39))) {
                  stackIn_167_0 = oi.field_b;
                  return stackIn_167_0;
                }
                if (decompiledFrameRemainder1) {
                  stackIn_163_0 = CampaignParticipant.field_l;
                  return stackIn_163_0;
                }
              }
              if (uc.spellDefinitions[param4][4] == 1) {
                if (var7.getEquipmentId((byte) 81) == uc.spellDefinitions[param4][6] &&
                  var7.getEquipmentCategory(20640) == uc.spellDefinitions[param4][5]) {
                  stackIn_172_0 = fo.a(4800, ti.field_b, new String[]{fq.field_f[param4]});
                  return stackIn_172_0;
                }
                if (uc.spellDefinitions[param4][5] == 0) {
                  if (4 == var7.getUnitCategory(0)) {
                    stackIn_177_0 = ah.field_c;
                    return stackIn_177_0;
                  }
                  if (var7.getUnitCategory(0) == 3) {
                    stackIn_180_0 = qa.field_E;
                    return stackIn_180_0;
                  }
                  if (var7.unitType == 34 &&
                    var7.packedFlag8) {
                    stackIn_185_0 = fc.field_c;
                    return stackIn_185_0;
                  }
                }
                if (uc.spellDefinitions[param4][5] == 1) {
                  if (var7.unitType == 34 &&
                    var7.packedFlag8) {
                    stackIn_190_0 = fc.field_c;
                    return stackIn_190_0;
                  }
                  if (2 != var7.getUnitCategory(0) &&
                    var7.unitType != 18 &&
                    var7.unitType != 28) {
                    stackIn_195_0 = wn.field_bb;
                    return stackIn_195_0;
                  }
                }
                if (2 == uc.spellDefinitions[param4][5]) {
                  if (34 == var7.unitType &&
                    var7.packedFlag8) {
                    stackIn_200_0 = fc.field_c;
                    return stackIn_200_0;
                  }
                  if (3 != var7.getUnitCategory(0)) {
                    stackIn_204_0 = hv.field_O;
                    return stackIn_204_0;
                  }
                }
                if (uc.spellDefinitions[param4][5] == 4) {
                  if (var7.unitType == 34 &&
                    var7.packedFlag8) {
                    stackIn_209_0 = fc.field_c;
                    return stackIn_209_0;
                  }
                  if (var7.getUnitCategory(0) != 4) {
                    stackIn_212_0 = bc.field_h;
                    return stackIn_212_0;
                  }
                }
                if (3 == uc.spellDefinitions[param4][5] &&
                  var7.unitType != 81 &&
                  var7.unitType != 4 &&
                  74 != var7.unitType &&
                  var7.unitType != 34) {
                  stackIn_219_0 = CampaignParticipant.field_r;
                  return stackIn_219_0;
                }
                if (uc.spellDefinitions[param4][6] == 6 &&
                  (64 & bw.unitDefinitions[var7.unitType][10]) != 0) {
                  stackIn_224_0 = iu.field_r;
                  return stackIn_224_0;
                }
              }
              if (uc.spellDefinitions[param4][4] == 0 &&
                uc.spellDefinitions[param4][6] == var7.statusEffectValue &&
                var7.statusEffectType == uc.spellDefinitions[param4][5]) {
                stackIn_230_0 = fo.a(4800, ti.field_b, new String[]{fq.field_f[param4]});
                return stackIn_230_0;
              }
              if (uc.spellDefinitions[param4][4] == 3) {
                if (uc.spellDefinitions[param4][5] == var7.accessoryType) {
                  stackIn_236_0 = fo.a(4800, ti.field_b, new String[]{fq.field_f[param4]});
                  return stackIn_236_0;
                }
                if (3 == uc.spellDefinitions[param4][5] && (4 == var7.getUnitCategory(0) ||
                  var7.r((byte) 115) ||
                  var7.o((byte) 98) ||
                  var7.unitType == 39 ||
                  var7.unitType == 51)) {
                  stackIn_245_0 = sp.field_d;
                  return stackIn_245_0;
                }
                if (uc.spellDefinitions[param4][5] == 4 && (var7.getUnitCategory(0) == 4 ||
                  var7.o((byte) 98) ||
                  var7.unitType == 39 ||
                  var7.unitType == 51)) {
                  stackIn_253_0 = sp.field_d;
                  return stackIn_253_0;
                }
                boolean decompiledFrameRemainder0 = true;
                if (2 == uc.spellDefinitions[param4][5]) {
                  if (var7.getUnitCategory(0) != 4 &&
                    !var7.canAttackFlying((byte) -83) &&
                    bw.unitDefinitions[var7.unitType][7] <= 1) {
                    if (var7.unitType == 34 &&
                      var7.packedFlag8) {
                      stackIn_262_0 = 1;
                    } else {
                      stackIn_262_0 = 0;
                    }
                    if (var7.unitType != 51) {
                      stackIn_265_1 = 0;
                    } else {
                      stackIn_265_1 = 1;
                    }
                    decompiledFrameRemainder0 = ((stackIn_262_0 | stackIn_265_1) != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    stackIn_267_0 = sp.field_d;
                    return stackIn_267_0;
                  }
                }
                if (uc.spellDefinitions[param4][5] == 1 &&
                  var7.canCaptureStructures(-21428)) {
                  stackIn_271_0 = sp.field_d;
                  return stackIn_271_0;
                }
                if (uc.spellDefinitions[param4][5] == 5 &&
                  var7.hasMovementFlag1(false)) {
                  stackIn_276_0 = AiUnitPlanner.field_w;
                  return stackIn_276_0;
                }
              }
              if (!var7.packedFlag512) {
                return null;
              }
              stackIn_280_0 = po.field_a;
              return stackIn_280_0;
            }
            stackIn_37_0 = MoveAttackAction.field_G;
            return stackIn_37_0;
          }
          stackIn_32_0 = MoveAttackAction.field_G;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_332_0 = var6;
          stackIn_332_1 = new StringBuilder().append("de.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_333_2 = "null";
          } else {
            stackIn_333_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_332_0), ((StringBuilder) (Object) stackIn_332_1).append(stackIn_333_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 > -96) {
          return;
        }
        field_d = null;
    }

    final static int readTieredSignedInt(int obfuscationGuard, CipherPacketBuffer packet, int tier0Bits, int tier1Bits, int tier3Bits, int tier2Bits) {
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_2;
        int stackIn_11_3;
        int stackIn_11_4;
        int stackIn_12_5 = 0;
        int stackIn_15_6;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -86) {
            stackIn_2_0 = 41;
            return stackIn_2_0;
          }
          if (0 != tier3Bits) {
            stackIn_6_0 = 1 << tier3Bits - 1;
          } else {
            stackIn_6_0 = 0;
          }
          if (tier2Bits != 0) {
            stackIn_9_1 = 1 << tier2Bits - 1;
          } else {
            stackIn_9_1 = 0;
          }
          stackIn_11_2 = -65;
          stackIn_11_3 = tier3Bits;
          stackIn_11_4 = tier2Bits;
          if (tier1Bits != 0) {
            stackIn_12_5 = 1 << tier1Bits - 1;
          } else {
            stackIn_12_5 = 0;
          }
          if (tier0Bits == 0) {
            stackIn_15_6 = 0;
          } else {
            stackIn_15_6 = 1 << -1 + tier0Bits;
          }
          stackIn_16_0 = sj.readTieredSignedBits(stackIn_6_0, stackIn_9_1, stackIn_11_2, stackIn_11_3, stackIn_11_4, stackIn_12_5, stackIn_15_6, tier1Bits, tier0Bits, packet);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("de.B(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(tier0Bits).append(',').append(tier1Bits).append(',').append(tier3Bits).append(',').append(tier2Bits).append(')').toString());
        }
    }

    static {
        field_c = "This password contains your Player Name, and would be easy to guess";
        field_d = "The account name you use to access RuneScape and other Jagex.com games";
        field_b = "Spiritual barrier - Deploys a single spiritual barrier at the current map tile, which protects friendly units within";
    }
}
