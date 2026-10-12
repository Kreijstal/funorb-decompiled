/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class LineOfSightGrid {
    static boolean field_a;
    static boolean field_m;
    static int field_d;
    static String field_j;
    static String field_f;
    private boolean[] visibilityMask;
    private int originY;
    private Battlefield battlefield;
    private MapTile[] tiles;
    private int mapHeight;
    private int mapWidth;
    private int maximumRange;
    static String field_o;
    private int originX;
    static RgbSprite field_g;

    final static void buildSpellMenu(int finalWeaknessSpellId) {
        CachedArchiveProvider.spellMenuRoot = new SpellMenuGroup(170, or.field_j, ck.field_d, new SpellMenuGroup[]{new SpellMenuGroup(135, qc.field_i, ma.field_X, new SpellMenuGroup[]{new SpellMenuGroup(136, ScrollContainer.field_Lb, DelayedPacket.field_n, new SpellMenuGroup[]{new SpellMenuGroup(137, SummonRequest.field_x, wh.field_e, new int[]{70, 71, 72, 73}), new SpellMenuGroup(138, TutorialController.field_b, ki.field_f, new int[]{74, 75, 76, 77}), new SpellMenuGroup(139, r.field_w, DiskCacheRequest.field_H, new int[]{78, 79, 80, 81}), new SpellMenuGroup(141, DualLinkedNode.field_p, ai.field_J, new int[]{90, 91, 92, 93}), new SpellMenuGroup(140, oh.field_F, AiActionCandidate.field_n, new int[]{82, 83, 84, 85}), new SpellMenuGroup(142, NodeHashIterator.field_f, VerticalScrollbar.field_Kb, new int[]{86, 87, 88, 89}), new SpellMenuGroup(143, UnitInfoPopup.field_l, UnitLossCondition.field_c, new int[]{103, 104})}), new SpellMenuGroup(144, ClientConnectionState.field_d, ed.field_a, new SpellMenuGroup[]{new SpellMenuGroup(147, on.field_k, nv.field_J, new int[]{94, 95, 96, 105}), new SpellMenuGroup(146, SocialListEntry.field_Lb, HuffmanCodec.field_j, new int[]{97, 98, 99, 106, 124}), new SpellMenuGroup(145, hf.field_g, fm.field_b, new int[]{100, 101, 102, 107, 125}), new SpellMenuGroup(148, nl.field_D, ActionRequest.field_q, new int[]{127, 128, 129, 130, 126}), new SpellMenuGroup(149, DualLinkedNode.field_n, QuickChatCategoryRepository.field_a, new int[]{131, 132, 133, 134})}), new SpellMenuGroup(150, ArchiveIndex.field_d, HuffmanCodec.field_d, new int[]{12, 110, 69, 28, 108})}), new SpellMenuGroup(151, na.field_I, CommunityTabGroup.field_b, new SpellMenuGroup[]{new SpellMenuGroup(152, mi.field_C, bh.field_L, new SpellMenuGroup[]{new SpellMenuGroup(153, vv.field_a, cn.field_q, new int[]{54, 55, 56, 57, 58, 59, 60, 46}), new SpellMenuGroup(154, ij.field_v, cn.field_s, new int[]{61, 62, 63, 64, 65, 66, 67})}), new SpellMenuGroup(155, nl.field_G, fj.field_u, new SpellMenuGroup[]{new SpellMenuGroup(156, AnimationSequence.field_l, CameraOverviewTarget.field_o, new int[]{0, 1, 2, 3, 4, 5, 6}), new SpellMenuGroup(157, vv.field_c, ng.field_s, new int[]{47, 48, 49, 50, 51, 52, 53}), new SpellMenuGroup(158, iv.field_m, IterableNodeHashTable.field_g, new int[]{121, 122, 123, 68})}), new SpellMenuGroup(159, TeamRoster.field_h, TurnEffectEvent.field_A, new SpellMenuGroup[]{new SpellMenuGroup(160, kp.field_j, AiInfluenceMap.field_l, new int[]{37, 38, 39, 40, 41, 42, 45}), new SpellMenuGroup(161, dv.field_i, BattleCharacter.field_v, new int[]{7, 8, 9, 10, 11})}), new SpellMenuGroup(162, fq.field_a, rd.field_a, new int[]{23, 24, 25, 26, 43, 27}), new SpellMenuGroup(163, BattleCamera.field_f, IconTextComponent.field_Pb, new int[]{111, 112, 113, 114, 44}), new SpellMenuGroup(164, dr.field_y, hg.field_c, new int[]{34, 35, 36, 109})}), new SpellMenuGroup(165, fd.field_o, vq.field_e, new SpellMenuGroup[]{new SpellMenuGroup(166, c.field_b, ao.field_u, new int[]{13, 14, 15, 16, finalWeaknessSpellId}), new SpellMenuGroup(167, vf.field_h, gi.field_a, new int[]{18, 19, 20, 21, 22}), new SpellMenuGroup(168, ov.field_c, p.field_c, new int[]{29, 30, 31, 32, 33}), new SpellMenuGroup(169, SpellMenuGroup.field_d, CampaignQuicksave.field_a, new int[]{115, 116, 117, 118, 119, 120})})});
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8;
        int var9;
        var8 = el.field_d * 30;
        if ((param3 != 0 ||
          var8 != 0) && (param6 >= param2 &&
          param4 < param1 + param6 &&
          param4 >= param7 &&
          param4 < param7 + param5)) {
          if (param4 - param7 >= 44 &&
            var8 >= 0) {
            if (-4 + (-40 + param5) >= -param7 + param4 &&
              var8 <= 0) {
              CorpseConditionMarker.a(-28309, true);
              var9 = -56 % ((-5 - param0) / 50);
              return;
            }
            Widget.field_n = Widget.field_n + 1;
            if (var8 > 0) {
              Widget.field_n = Widget.field_n + var8;
            }
            if (15 < Widget.field_n) {
              Widget.field_n = 15;
            }
            CorpseConditionMarker.a(-28309, false);
            return;
          }
          Widget.field_n = Widget.field_n - 1;
          if (var8 < 0) {
            Widget.field_n = Widget.field_n + var8;
          }
          if (Widget.field_n < -15) {
            Widget.field_n = -15;
          }
          CorpseConditionMarker.a(-28309, false);
          return;
        }
        CorpseConditionMarker.a(-28309, true);
    }

    final static void a(byte param0, String param1, NodeDeque param2) {
        try {
          fq.a(param2, param1, 0, false);
          if (param0 != -80) {
            field_m = true;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ul.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean isVisible(int tileX, byte obfuscationGuard, int tileY) {
        tileX = 15 + (-this.originX + tileX);
        tileY = tileY - this.originY + 15;
        if (obfuscationGuard != 112) {
          return false;
        }
        if (tileX >= 0 &&
          tileY >= 0 &&
          tileX <= 30) {
          if (tileY <= 30) {
            return this.visibilityMask[tileX + 30 * tileY];
          }
          return false;
        }
        return false;
    }

    public static void b(int param0) {
        field_o = null;
        field_g = null;
        if (param0 != 30) {
          return;
        }
        field_f = null;
        field_j = null;
    }

    final boolean computeVisibility(int originY, int targetX, int originX, boolean ignoreBlockingTerrain, int maximumRange, int targetY, byte obfuscationGuard) {
        int deltaY = 0;
        int deltaX = 0;
        int targetVisible;
        int guardQuotient;
        int manhattanDistance;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.resetVisibility((byte) -104);
        this.maximumRange = maximumRange;
        this.originY = originY;
        this.originX = originX;
        guardQuotient = 77 / ((obfuscationGuard + 50) / 62);
        for (deltaY = this.maximumRange; deltaY >= 0; deltaY--) {
          for (deltaX = -deltaY; deltaY > deltaX; deltaX++) {
            manhattanDistance = deltaY + Math.abs(deltaX);
            if (maximumRange >= manhattanDistance) {
              if (-1 < this.originX + deltaX &&
                this.mapWidth > this.originX + deltaX &&
                this.originY + deltaY > -1 &&
                deltaY + this.originY < this.mapHeight) {
                this.traceVisibilityRay(25, deltaY, this.originY, deltaX, this.originX, ignoreBlockingTerrain);
              }
              if (this.originX - deltaX > -1 &&
                -deltaX + this.originX < this.mapWidth &&
                -deltaY + this.originY > -1 &&
                this.originY - deltaY < this.mapHeight) {
                this.traceVisibilityRay(25, -deltaY, this.originY, -deltaX, this.originX, ignoreBlockingTerrain);
              }
              if (-deltaY + this.originX > -1 &&
                this.originX - deltaY < this.mapWidth &&
                this.originY + deltaX > -1 &&
                deltaX + this.originY < this.mapHeight) {
                this.traceVisibilityRay(25, deltaX, this.originY, -deltaY, this.originX, ignoreBlockingTerrain);
              }
              if (deltaY + this.originX > -1 &&
                this.mapWidth > this.originX + deltaY &&
                -1 < this.originY - deltaX &&
                this.mapHeight > -deltaX + this.originY) {
                this.traceVisibilityRay(25, -deltaX, this.originY, deltaY, this.originX, ignoreBlockingTerrain);
              }
            }
          }
        }
        targetVisible = this.isVisible(targetX, (byte) 112, targetY) ? 1 : 0;
        return targetVisible != 0;
    }

    final void mergeAttackTargetMask(int minimumRange, boolean allowCategory4, int obfuscationGuard, int minimumX, int maximumY, int playerId, boolean includeAllies, int[] movementCosts, int maximumRange, int maximumX, boolean ignoreBlockingTerrain, int[] targetMask, int maximumMovementCost, int minimumY) {
        int candidateOriginY = 0;
        int candidateOriginX = 0;
        int rayDeltaY = 0;
        int rayDeltaX = 0;
        int availableTargetBits = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        int originMovementCost = 0;
        int originTargetBits = 0;
        int manhattanDistance = 0;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != -1) {
            this.originX = 124;
          }
          for (candidateOriginY = minimumY; candidateOriginY <= maximumY; candidateOriginY++) {
            for (candidateOriginX = minimumX; maximumX >= candidateOriginX; candidateOriginX++) {
              originMovementCost = movementCosts[this.mapWidth * candidateOriginY + candidateOriginX];
              if (originMovementCost <= maximumMovementCost) {
                availableTargetBits = (originMovementCost != 0) ? 6 : 7;
                originTargetBits = availableTargetBits;
                this.resetVisibility((byte) -108);
                this.originX = candidateOriginX;
                this.maximumRange = maximumRange;
                this.originY = candidateOriginY;
                for (rayDeltaY = this.maximumRange; rayDeltaY >= 0; rayDeltaY--) {
                  for (rayDeltaX = -rayDeltaY; rayDeltaX < rayDeltaY; rayDeltaX++) {
                    manhattanDistance = rayDeltaY + Math.abs(rayDeltaX);
                    if (minimumRange <= manhattanDistance &&
                      manhattanDistance <= maximumRange) {
                      if (this.originX + rayDeltaX > -1 &&
                        this.mapWidth > this.originX + rayDeltaX &&
                        this.originY + rayDeltaY > -1 &&
                        this.mapHeight > rayDeltaY + this.originY && (7 == originTargetBits ||
                        targetMask[(rayDeltaY + this.originY) * this.mapWidth + rayDeltaX + this.originX] == 0)) {
                        this.traceVisibilityRay(25, rayDeltaY, this.originY, rayDeltaX, this.originX, ignoreBlockingTerrain);
                        targetMask[rayDeltaX + (this.originX + (rayDeltaY + this.originY) * this.mapWidth)] = oe.bitwiseOr(targetMask[rayDeltaX + (this.originX + (rayDeltaY + this.originY) * this.mapWidth)], rn.bitwiseAnd(this.getTargetFlags((byte) 114, playerId, this.originY + rayDeltaY, includeAllies, rayDeltaX + this.originX, manhattanDistance, ignoreBlockingTerrain, allowCategory4), originTargetBits));
                      }
                      if (-rayDeltaX + this.originX > -1 &&
                        this.mapWidth > -rayDeltaX + this.originX &&
                        this.originY - rayDeltaY > -1 &&
                        this.originY - rayDeltaY < this.mapHeight && (7 == originTargetBits ||
                        targetMask[(-rayDeltaY + this.originY) * this.mapWidth + (-rayDeltaX + this.originX)] == 0)) {
                        this.traceVisibilityRay(obfuscationGuard + 26, -rayDeltaY, this.originY, -rayDeltaX, this.originX, ignoreBlockingTerrain);
                        targetMask[this.originX - rayDeltaX + (-rayDeltaY + this.originY) * this.mapWidth] = oe.bitwiseOr(targetMask[this.originX - rayDeltaX + (-rayDeltaY + this.originY) * this.mapWidth], rn.bitwiseAnd(this.getTargetFlags((byte) 114, playerId, -rayDeltaY + this.originY, includeAllies, -rayDeltaX + this.originX, manhattanDistance, ignoreBlockingTerrain, allowCategory4), originTargetBits));
                      }
                      if (-rayDeltaY + this.originX > -1 &&
                        this.mapWidth > -rayDeltaY + this.originX &&
                        this.originY + rayDeltaX > -1 &&
                        this.originY + rayDeltaX < this.mapHeight && (7 == originTargetBits ||
                        targetMask[-rayDeltaY + this.originX + (rayDeltaX + this.originY) * this.mapWidth] == 0)) {
                        this.traceVisibilityRay(obfuscationGuard + 26, rayDeltaX, this.originY, -rayDeltaY, this.originX, ignoreBlockingTerrain);
                        targetMask[this.originX - rayDeltaY + this.mapWidth * (rayDeltaX + this.originY)] = oe.bitwiseOr(targetMask[this.originX - rayDeltaY + this.mapWidth * (rayDeltaX + this.originY)], rn.bitwiseAnd(originTargetBits, this.getTargetFlags((byte) 114, playerId, this.originY + rayDeltaX, includeAllies, this.originX - rayDeltaY, manhattanDistance, ignoreBlockingTerrain, allowCategory4)));
                      }
                      if (this.originX + rayDeltaY > -1 &&
                        this.mapWidth > this.originX + rayDeltaY &&
                        this.originY - rayDeltaX > -1 &&
                        -rayDeltaX + this.originY < this.mapHeight && (originTargetBits == 7 ||
                        targetMask[rayDeltaY + (this.originX + (this.originY - rayDeltaX) * this.mapWidth)] == 0)) {
                        this.traceVisibilityRay(obfuscationGuard + 26, -rayDeltaX, this.originY, rayDeltaY, this.originX, ignoreBlockingTerrain);
                        targetMask[(this.originY - rayDeltaX) * this.mapWidth + rayDeltaY + this.originX] = oe.bitwiseOr(targetMask[(this.originY - rayDeltaX) * this.mapWidth + rayDeltaY + this.originX], rn.bitwiseAnd(originTargetBits, this.getTargetFlags((byte) 114, playerId, -rayDeltaX + this.originY, includeAllies, this.originX + rayDeltaY, manhattanDistance, ignoreBlockingTerrain, allowCategory4)));
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_60_0 = var15;
          stackIn_60_1 = new StringBuilder().append("ul.I(").append(minimumRange).append(',').append(allowCategory4).append(',').append(obfuscationGuard).append(',').append(minimumX).append(',').append(maximumY).append(',').append(playerId).append(',').append(includeAllies).append(',');
          if (movementCosts == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',').append(maximumRange).append(',').append(maximumX).append(',').append(ignoreBlockingTerrain).append(',');
          if (targetMask == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(maximumMovementCost).append(',').append(minimumY).append(')').toString());
        }
    }

    private final int getTargetFlags(byte obfuscationGuard, int playerId, int tileY, boolean includeAllies, int tileX, int distance, boolean ignoreBlockingTerrain, boolean allowCategory4) {
        int targetFlags = 0;
        Unit targetUnit = null;
        if (obfuscationGuard != 114) {
          field_j = (String) null;
        }
        if (this.isVisible(tileX, (byte) 112, tileY)) {
          if (distance > 1) {
            if (0 != (2 & this.battlefield.getTileEffects(31, this.originY, this.originX, playerId))) {
              return 0;
            }
            if ((2 & this.battlefield.getTileEffects(obfuscationGuard - 83, tileY, tileX, playerId)) != 0) {
              return 0;
            }
          }
          targetFlags = 3;
          targetUnit = this.tiles[tileX + tileY * this.mapWidth].occupant;
          if (targetUnit != null &&
            (!this.battlefield.arePlayersAllied(targetUnit.ownerPlayer, -16985, playerId) || includeAllies) &&
            (targetUnit.getUnitCategory(0) != 4 || ignoreBlockingTerrain || allowCategory4)) {
            targetFlags = targetFlags | 4;
          }
          return targetFlags;
        }
        return 0;
    }

    final static void paintMapCenterPattern(Random random, Battlefield battlefield, byte obfuscationGuard, int patternMode) {
        MapTile[] stackIn_152_0;
        int stackIn_152_1;
        MapTile stackIn_152_2;
        MapTile stackIn_152_3;
        MapTile stackIn_154_2 = null;
        MapTile stackIn_154_3 = null;
        int stackIn_154_4 = 0;
        RuntimeException stackIn_160_0 = null;
        StringBuilder stackIn_160_1 = null;
        String stackIn_161_2 = null;
        StringBuilder stackIn_163_1 = null;
        String stackIn_164_2 = null;
        RuntimeException decompiledCaughtException = null;
        int patternOrTileX = 0;
        RuntimeException var4 = null;
        int tileY = 0;
        int horizontalDistance = 0;
        int verticalDistance = 0;
        int jitter = 0;
        int obfuscationControl = 0;
        ArmiesOfGielinor var10 = null;
        MapTile stackIn_152_2Lifetime1;
        MapTile stackIn_152_3Lifetime1;
        MapTile stackIn_154_2Lifetime1;
        MapTile stackIn_154_3Lifetime1;
        MapTile stackIn_152_2Lifetime1Lifetime1;
        MapTile stackIn_152_3Lifetime1Lifetime1;
        int structureX;
        int structureY;
        int structureCount;
        int structureIndex;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          patternOrTileX = patternMode;
          if (0 == patternOrTileX) {
            for (patternOrTileX = 0; battlefield.mapWidth > patternOrTileX; patternOrTileX++) {
              for (tileY = 0; battlefield.mapHeight > tileY; tileY++) {
                horizontalDistance = Math.abs(-10 + (AttackEvent.nextBoundedInt(false, 2, random) + (patternOrTileX + 10)) % 20);
                verticalDistance = Math.abs((AttackEvent.nextBoundedInt(false, 2, random) + (tileY + 10)) % 20 - 10);
                if (verticalDistance + 2 * horizontalDistance < 6) {
                  battlefield.tiles[battlefield.mapWidth * tileY + patternOrTileX] = new MapTile(2, battlefield);
                }
                if (6 > horizontalDistance + verticalDistance * 2) {
                  battlefield.tiles[battlefield.mapWidth * tileY + patternOrTileX] = new MapTile(2, battlefield);
                }
              }
            }
          } else {
            if (patternOrTileX == 1) {
              for (patternOrTileX = 0; battlefield.mapWidth > patternOrTileX; patternOrTileX++) {
                for (tileY = 0; battlefield.mapHeight > tileY; tileY++) {
                  horizontalDistance = Math.abs(patternOrTileX - (battlefield.mapWidth >> 1));
                  verticalDistance = Math.abs(tileY - (battlefield.mapHeight >> 1));
                  jitter = AttackEvent.nextBoundedInt(false, 2, random);
                  if (horizontalDistance < jitter + 12 &&
                    horizontalDistance > jitter + 7 ||
                    jitter + 12 > verticalDistance &&
                    verticalDistance > jitter + 7) {
                    battlefield.tiles[patternOrTileX + tileY * battlefield.mapWidth] = new MapTile(6, battlefield);
                  }
                }
              }
            } else {
              if (2 == patternOrTileX) {
                for (patternOrTileX = 0; battlefield.mapWidth > patternOrTileX; patternOrTileX++) {
                  for (tileY = 0; battlefield.mapHeight > tileY; tileY++) {
                    horizontalDistance = Math.abs(-(battlefield.mapWidth >> 1) + patternOrTileX);
                    verticalDistance = Math.abs(-(battlefield.mapHeight >> 1) + tileY);
                    jitter = AttackEvent.nextBoundedInt(false, 2, random);
                    if ((jitter + 8) > horizontalDistance &&
                      verticalDistance < jitter + 8 &&
                      (verticalDistance + horizontalDistance) * 2 / 3 < 8 + jitter) {
                      battlefield.tiles[tileY * battlefield.mapWidth + patternOrTileX] = new MapTile(0, battlefield);
                    } else if (horizontalDistance < jitter + 12 &&
                      jitter + 12 > verticalDistance &&
                      2 * (verticalDistance + horizontalDistance) / 3 < 12 + jitter) {
                      battlefield.tiles[battlefield.mapWidth * tileY + patternOrTileX] = new MapTile(5, battlefield);
                    } else {
                      if ((patternOrTileX + jitter) % 20 >= (-9 + verticalDistance + jitter) / 5) {
                        if ((jitter + tileY) % 20 >= (horizontalDistance + jitter - 9) / 5) {
                          if ((-9 + (verticalDistance + jitter)) / 5 > 20 - (jitter + patternOrTileX) % 20) {
                            battlefield.tiles[tileY * battlefield.mapWidth + patternOrTileX] = new MapTile(2, battlefield);
                          } else {
                            if ((jitter + (horizontalDistance - 9)) / 5 > 20 - (tileY + jitter) % 20) {
                              battlefield.tiles[patternOrTileX + tileY * battlefield.mapWidth] = new MapTile(2, battlefield);
                            }
                          }
                        } else {
                          battlefield.tiles[tileY * battlefield.mapWidth + patternOrTileX] = new MapTile(2, battlefield);
                        }
                      } else {
                        battlefield.tiles[patternOrTileX + battlefield.mapWidth * tileY] = new MapTile(2, battlefield);
                      }
                    }
                  }
                }
              } else {
                if (patternOrTileX != 3) {
                  if (4 == patternOrTileX) {
                    for (patternOrTileX = 0; battlefield.mapWidth > patternOrTileX; patternOrTileX++) {
                      for (tileY = 0; tileY < battlefield.mapHeight; tileY++) {
                        horizontalDistance = Math.abs(patternOrTileX - (battlefield.mapWidth >> 1));
                        verticalDistance = Math.abs(-(battlefield.mapHeight >> 1) + tileY);
                        jitter = AttackEvent.nextBoundedInt(false, 2, random);
                        if (8 + jitter > horizontalDistance &&
                          jitter + 8 > verticalDistance &&
                          (verticalDistance + horizontalDistance) * 2 / 3 < jitter + 8) {
                          battlefield.tiles[patternOrTileX + tileY * battlefield.mapWidth] = new MapTile(0, battlefield);
                        } else if (horizontalDistance < jitter + 12 &&
                          jitter + 12 > verticalDistance &&
                          jitter + 12 > (horizontalDistance + verticalDistance) * 2 / 3) {
                          battlefield.tiles[patternOrTileX + battlefield.mapWidth * tileY] = new MapTile(3, battlefield);
                        } else {
                          if ((patternOrTileX + jitter) % 20 < (verticalDistance + jitter - 9) / 5) {
                            battlefield.tiles[patternOrTileX + battlefield.mapWidth * tileY] = new MapTile(2, battlefield);
                          } else {
                            if ((jitter + horizontalDistance - 9) / 5 > (tileY + jitter) % 20) {
                              battlefield.tiles[tileY * battlefield.mapWidth + patternOrTileX] = new MapTile(2, battlefield);
                            } else {
                              if (20 - (patternOrTileX + jitter) % 20 < (verticalDistance + jitter - 9) / 5) {
                                battlefield.tiles[tileY * battlefield.mapWidth + patternOrTileX] = new MapTile(2, battlefield);
                              } else {
                                if ((jitter + (horizontalDistance - 9)) / 5 > -((jitter + tileY) % 20) + 20) {
                                  battlefield.tiles[battlefield.mapWidth * tileY + patternOrTileX] = new MapTile(2, battlefield);
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (5 == patternOrTileX) {
                      for (patternOrTileX = 0; patternOrTileX < battlefield.mapWidth; patternOrTileX++) {
                        for (tileY = 0; battlefield.mapHeight > tileY; tileY++) {
                          horizontalDistance = Math.abs(-(battlefield.mapWidth >> 1) + patternOrTileX);
                          verticalDistance = Math.abs(tileY - (battlefield.mapHeight >> 1));
                          jitter = AttackEvent.nextBoundedInt(false, 2, random);
                          if (horizontalDistance < (8 + jitter) &&
                            verticalDistance < 8 + jitter &&
                            (horizontalDistance + verticalDistance) * 2 / 3 < jitter + 8) {
                            battlefield.tiles[battlefield.mapWidth * tileY + patternOrTileX] = new MapTile(0, battlefield);
                          } else if (horizontalDistance < 12 + jitter &&
                            verticalDistance < 12 + jitter &&
                            2 * (verticalDistance + horizontalDistance) / 3 < jitter + 12) {
                            battlefield.tiles[patternOrTileX + battlefield.mapWidth * tileY] = new MapTile(3, battlefield);
                          } else {
                            if ((jitter + verticalDistance - 15) / 5 > (jitter + patternOrTileX) % 20) {
                              battlefield.tiles[battlefield.mapWidth * tileY + patternOrTileX] = new MapTile(2, battlefield);
                            } else {
                              if ((horizontalDistance - (-jitter + 15)) / 5 <= (jitter + tileY) % 20) {
                                if ((jitter + patternOrTileX) % 20 < (jitter + verticalDistance - 8) / 5) {
                                  battlefield.tiles[patternOrTileX + tileY * battlefield.mapWidth] = new MapTile(3, battlefield);
                                } else {
                                  if ((tileY + jitter) % 20 >= (jitter + (horizontalDistance - 8)) / 5) {
                                    if ((jitter + verticalDistance - 8) / 5 <= 20 - (patternOrTileX + jitter) % 20) {
                                      if (-((jitter + tileY) % 20) + 20 < (-8 + jitter + horizontalDistance) / 5) {
                                        battlefield.tiles[battlefield.mapWidth * tileY + patternOrTileX] = new MapTile(3, battlefield);
                                      }
                                    } else {
                                      battlefield.tiles[patternOrTileX + tileY * battlefield.mapWidth] = new MapTile(3, battlefield);
                                    }
                                  } else {
                                    battlefield.tiles[battlefield.mapWidth * tileY + patternOrTileX] = new MapTile(3, battlefield);
                                  }
                                }
                              } else {
                                battlefield.tiles[patternOrTileX + tileY * battlefield.mapWidth] = new MapTile(2, battlefield);
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (patternOrTileX == 6) {
                        for (patternOrTileX = 0; patternOrTileX < battlefield.mapWidth; patternOrTileX++) {
                          for (tileY = 0; tileY < battlefield.mapHeight; tileY++) {
                            horizontalDistance = Math.abs(patternOrTileX - (battlefield.mapWidth >> 1));
                            verticalDistance = Math.abs(-(battlefield.mapHeight >> 1) + tileY);
                            jitter = AttackEvent.nextBoundedInt(false, 2, random);
                            if (horizontalDistance < (jitter + 8) &&
                              verticalDistance < jitter + 8 &&
                              8 + jitter > (verticalDistance + horizontalDistance) * 2 / 3) {
                              battlefield.tiles[patternOrTileX + tileY * battlefield.mapWidth] = new MapTile(0, battlefield);
                            } else if (horizontalDistance < 11 + jitter &&
                              11 + jitter > verticalDistance &&
                              11 + jitter > (verticalDistance + horizontalDistance) * 2 / 3) {
                              battlefield.tiles[patternOrTileX + tileY * battlefield.mapWidth] = new MapTile(4, battlefield);
                            } else {
                              if ((-15 + verticalDistance + jitter) / 5 <= (jitter + patternOrTileX) % 20) {
                                if ((jitter + horizontalDistance - 15) / 5 <= (tileY + jitter) % 20) {
                                  if ((-12 + verticalDistance + jitter) / 5 <= (jitter + patternOrTileX) % 20) {
                                    if ((-12 + jitter + horizontalDistance) / 5 > (jitter + tileY) % 20) {
                                      battlefield.tiles[tileY * battlefield.mapWidth + patternOrTileX] = new MapTile(3, battlefield);
                                    }
                                  } else {
                                    battlefield.tiles[battlefield.mapWidth * tileY + patternOrTileX] = new MapTile(3, battlefield);
                                  }
                                } else {
                                  battlefield.tiles[patternOrTileX + tileY * battlefield.mapWidth] = new MapTile(2, battlefield);
                                }
                              } else {
                                battlefield.tiles[battlefield.mapWidth * tileY + patternOrTileX] = new MapTile(2, battlefield);
                              }
                            }
                          }
                        }
                        battlefield.tiles[24 + (AttackEvent.nextBoundedInt(false, 3, random) + (AttackEvent.nextBoundedInt(false, 3, random) + 24) * battlefield.mapWidth)] = new MapTile(7, battlefield);
                        battlefield.tiles[AttackEvent.nextBoundedInt(false, 3, random) + 24 + (AttackEvent.nextBoundedInt(false, 3, random) + 34) * battlefield.mapWidth] = new MapTile(7, battlefield);
                        battlefield.tiles[AttackEvent.nextBoundedInt(false, 3, random) + 34 + (24 + AttackEvent.nextBoundedInt(false, 3, random)) * battlefield.mapWidth] = new MapTile(7, battlefield);
                        battlefield.tiles[AttackEvent.nextBoundedInt(false, 3, random) + 34 + (34 + AttackEvent.nextBoundedInt(false, 3, random)) * battlefield.mapWidth] = new MapTile(7, battlefield);
                      }
                    }
                  }
                }
              }
            }
          }
          if (patternMode == 3 ||
            1 == patternMode) {
            UnitInfoPopup.paintRandomTerrainPath(25, (byte) 101, 1, 25, 10, true, 10, battlefield, random);
            UnitInfoPopup.paintRandomTerrainPath(35, (byte) 101, 1, 35, 50, true, 50, battlefield, random);
            UnitInfoPopup.paintRandomTerrainPath(25, (byte) 101, 1, 35, 10, true, 50, battlefield, random);
            UnitInfoPopup.paintRandomTerrainPath(35, (byte) 101, 1, 25, 50, true, 10, battlefield, random);
            UnitInfoPopup.paintRandomTerrainPath(30, (byte) 101, 1, 25, 30, true, 10, battlefield, random);
            UnitInfoPopup.paintRandomTerrainPath(30, (byte) 101, 1, 35, 30, true, 50, battlefield, random);
            UnitInfoPopup.paintRandomTerrainPath(35, (byte) 101, 1, 30, 50, true, 30, battlefield, random);
            UnitInfoPopup.paintRandomTerrainPath(25, (byte) 101, 1, 30, 10, true, 30, battlefield, random);
          }
          structureX = 30;
          structureY = 30;
          if (obfuscationGuard != 85) {
            var10 = (ArmiesOfGielinor) null;
            LineOfSightGrid.a((IndexedSprite[]) null, (byte) -17, (ArmiesOfGielinor) null);
          }
          structureCount = 15 + AttackEvent.nextBoundedInt(false, 15, random);
          for (structureIndex = 0; structureCount > structureIndex; structureIndex++) {
            while (battlefield.tiles[structureX + structureY * battlefield.mapWidth] != null) {
              if (battlefield.tiles[battlefield.mapWidth * structureY + structureX].terrainType != 0 &&
                battlefield.tiles[structureY * battlefield.mapWidth + structureX].terrainType != 1) {
                structureX = AttackEvent.nextBoundedInt(false, 14, random) + 23;
                structureY = 23 + AttackEvent.nextBoundedInt(false, 14, random);
                continue;
              }
              break;
            }
            boolean decompiledFrameRemainder0 = true;
            stackIn_152_0 = battlefield.tiles;
            stackIn_152_1 = structureX + structureY * battlefield.mapWidth;
            stackIn_152_2 = null;
            stackIn_152_3 = null;
            if (structureX > 27) {
              stackIn_152_2Lifetime1 = null;
              stackIn_152_3Lifetime1 = null;
              if (structureY > 27) {
                stackIn_152_2Lifetime1Lifetime1 = null;
                stackIn_152_3Lifetime1Lifetime1 = null;
                if (structureX < 33 &&
                  structureY < 33) {
                  stackIn_154_2 = null;
                  stackIn_154_3 = null;
                  stackIn_154_4 = 9;
                  decompiledFrameRemainder0 = false;
                }
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_154_2Lifetime1 = null;
              stackIn_154_3Lifetime1 = null;
              stackIn_154_4 = 8;
            }
            stackIn_152_0[stackIn_152_1] = new MapTile(stackIn_154_4, battlefield);
            if (patternMode == 3) {
              qp.paintTerrainConnection(structureY, 30, -1, 30, structureX, 0, battlefield, 1, random);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_160_0 = var4;
          stackIn_160_1 = new StringBuilder().append("ul.B(");
          if (random == null) {
            stackIn_161_2 = "null";
          } else {
            stackIn_161_2 = "{...}";
          }
          stackIn_163_1 = ((StringBuilder) (Object) stackIn_160_1).append(stackIn_161_2).append(',');
          if (battlefield == null) {
            stackIn_164_2 = "null";
          } else {
            stackIn_164_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_160_0), ((StringBuilder) (Object) stackIn_163_1).append(stackIn_164_2).append(',').append(obfuscationGuard).append(',').append(patternMode).append(')').toString());
        }
    }

    private final void resetVisibility(byte obfuscationGuard) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard >= -9) {
          this.tiles = (MapTile[]) null;
        }
        for (var2 = 0; var2 < 900; var2++) {
          this.visibilityMask[var2] = false;
        }
        this.visibilityMask[465] = true;
    }

    final static void a(IndexedSprite[] param0, byte param1, ArmiesOfGielinor param2) {
        try {
          br.field_a = new oo(param2, bi.field_c, param0, new String[]{BufferedSocket.field_a, LeaderEscortCondition.field_b, IntPair.field_o, DropdownOptionList.field_S, bj.field_q});
          if (param1 <= 56) {
            field_g = (RgbSprite) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ul.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void traceVisibilityRay(int obfuscationGuard, int deltaY, int originY, int deltaX, int originX, boolean ignoreBlockingTerrain) {
        int stackIn_20_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_49_0 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 <= deltaX + originX &&
          this.mapWidth > deltaX + originX &&
          0 <= deltaY + originY &&
          deltaY + originY < this.mapHeight) {
          if (this.visibilityMask[deltaX + (15 + 30 * deltaY + 450)]) {
            return;
          }
          if (obfuscationGuard != 25) {
            return;
          }
          if (deltaX == 0 &&
            deltaY == 0) {
            this.visibilityMask[30 * deltaY + 450 + deltaX + 15] = true;
            return;
          }
          if (deltaX == 0) {
            stackIn_20_0 = (deltaY <= 0) ? -1 : 1;
            var7 = stackIn_20_0;
            deltaY = deltaY * var7;
            var8 = 1;
            while (deltaY >= var8) {
              var9 = (var8 * var7 + originY) * this.mapWidth + originX;
              this.visibilityMask[deltaX + 15 + 30 * (var8 * var7 + 15)] = true;
              if (!ignoreBlockingTerrain &&
                this.tiles[var9].blocksLineOfSight(obfuscationGuard + 903)) {
                return;
              }
              var8++;
            }
            return;
          }
          if (deltaY == 0) {
            stackIn_34_0 = (deltaX > 0) ? 1 : -1;
            var7Lifetime1 = stackIn_34_0;
            deltaX = deltaX * var7Lifetime1;
            var8Lifetime1 = 1;
            while (var8Lifetime1 <= deltaX) {
              var9Lifetime1 = var8Lifetime1 * var7Lifetime1 + originX + this.mapWidth * originY;
              this.visibilityMask[deltaY * 30 + 450 + var7Lifetime1 * var8Lifetime1 + 15] = true;
              if (!ignoreBlockingTerrain &&
                this.tiles[var9Lifetime1].blocksLineOfSight(928)) {
                return;
              }
              var8Lifetime1++;
            }
            return;
          }
          stackIn_46_0 = (deltaX <= 0) ? -1 : 1;
          var7Lifetime2 = stackIn_46_0;
          stackIn_49_0 = (deltaY <= 0) ? -1 : 1;
          var8Lifetime2 = stackIn_49_0;
          deltaX = deltaX * var7Lifetime2;
          deltaY = deltaY * var8Lifetime2;
          if (deltaY >= deltaX) {
            for (var9Lifetime2 = 1; deltaY >= var9Lifetime2; var9Lifetime2++) {
              var10 = deltaX * var9Lifetime2 / deltaY;
              var11 = (originY + var8Lifetime2 * var9Lifetime2) * this.mapWidth + (originX + var7Lifetime2 * var10);
              this.visibilityMask[var7Lifetime2 * var10 + (15 + (15 + var8Lifetime2 * var9Lifetime2) * 30)] = true;
              if (!ignoreBlockingTerrain &&
                this.tiles[var11].blocksLineOfSight(928)) {
                return;
              }
            }
            return;
          }
          for (var9Lifetime3 = 1; deltaX >= var9Lifetime3; var9Lifetime3++) {
            var10Lifetime1 = deltaY * var9Lifetime3 / deltaX;
            var11Lifetime1 = var9Lifetime3 * var7Lifetime2 + (originX + this.mapWidth * (originY + var10Lifetime1 * var8Lifetime2));
            this.visibilityMask[15 + var7Lifetime2 * var9Lifetime3 + (15 + var8Lifetime2 * var10Lifetime1) * 30] = true;
            if (!ignoreBlockingTerrain &&
              this.tiles[var11Lifetime1].blocksLineOfSight(928)) {
              return;
            }
          }
          return;
        }
    }

    LineOfSightGrid(Battlefield battlefield, MapTile[] tiles, int mapWidth, int mapHeight) {
        this.visibilityMask = new boolean[900];
        this.maximumRange = 0;
        this.originY = 0;
        this.originX = 0;
        try {
          this.battlefield = battlefield;
          this.mapHeight = mapHeight;
          this.mapWidth = mapWidth;
          this.tiles = tiles;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ul.<init>(" + (battlefield != null ? "{...}" : "null") + ',' + (tiles != null ? "{...}" : "null") + ',' + mapWidth + ',' + mapHeight + ')');
        }
    }

    static {
        field_f = "OK";
        field_j = "Start Mission";
        field_d = 0;
        field_o = "Names cannot contain consecutive spaces";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$5d483ac33914(int param0, String param1, NodeDeque param2) {
        try {
          fq.a(param2, param1, 0, false);
          if (param0 != -80) {
            field_m = true;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ul.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }
}
