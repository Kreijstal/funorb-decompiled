/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnitSpell extends Spell {
    static String field_h;
    static String field_e;
    int targetY;
    int targetX;

    private final void applyStatusEffect(int obfuscationGuard, Battlefield battlefield) {
        Unit targetUnit = null;
        try {
          targetUnit = battlefield.getUnitAt(this.targetY, true, this.targetX);
          Unit targetAlias = targetUnit;
          if (obfuscationGuard != 0) {
            Battlefield discardedBattlefield = (Battlefield) null;
            this.applyAccessoryEffect((byte) 119, (Battlefield) null);
          }
          targetUnit.statusEffectType = uc.spellDefinitions[this.spellId][5];
          targetUnit.statusEffectValue = uc.spellDefinitions[this.spellId][6];
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wa.S(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    final void writePayload(int obfuscationGuard, PacketBuffer packet) {
        try {
          packet.writeShort(true, this.spellId);
          packet.writeByte(1, this.targetX);
          packet.writeByte(1, this.targetY);
          if (obfuscationGuard != -11637) {
            field_e = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wa.E(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    private final void applyPoisonOrTurnRefresh(byte obfuscationGuard, Battlefield battlefield) {
        int obfuscationControl = 0;
        Unit targetUnit = null;
        Unit refreshTarget = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard >= -100) {
            this.targetY = 58;
          }
          targetUnit = battlefield.getUnitAt(this.targetY, true, this.targetX);
          refreshTarget = targetUnit;
          if (uc.spellDefinitions[this.spellId][6] == 7) {
            targetUnit.poisoned = true;
          }
          if (uc.spellDefinitions[this.spellId][6] == 16) {
            if (refreshTarget.immobilizedTurns > 0) {
              refreshTarget.immobilizedTurns = refreshTarget.immobilizedTurns - 1;
            } else {
              if (34 != refreshTarget.unitType ||
                !refreshTarget.packedFlag8) {
                refreshTarget.movementSpent = false;
              }
              if (74 != refreshTarget.unitType) {
                refreshTarget.attacksRemaining = 1;
              } else {
                refreshTarget.attacksRemaining = 2;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("wa.R(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final void applyAreaEffect(boolean obfuscationGuard, Battlefield battlefield) {
        int effectCode = 0;
        int obfuscationControl = 0;
        Battlefield discardedBattlefield = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!obfuscationGuard) {
            discardedBattlefield = (Battlefield) null;
            this.applyUnitFlagsAndImmobilize((Battlefield) null, false);
          }
          effectCode = uc.spellDefinitions[this.spellId][5];
          if (effectCode != 0) {
            if (effectCode != 64) {
              this.queueAreaDamageOrHealing(true, battlefield);
            } else {
              this.queueAreaStrengthCapacityChanges((byte) 78, battlefield);
            }
          } else {
            this.applyPoisonOrTurnRefresh((byte) -106, battlefield);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("wa.M(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void applyEquipmentEffect(int obfuscationGuard, Battlefield battlefield) {
        Unit targetUnit = null;
        try {
          if (obfuscationGuard <= 80) {
            Battlefield discardedBattlefield = (Battlefield) null;
            this.finishEffect((Battlefield) null, 28);
          }
          targetUnit = battlefield.getUnitAt(this.targetY, true, this.targetX);
          Unit targetAlias = targetUnit;
          targetUnit.equipmentDescriptor = uc.spellDefinitions[this.spellId][6] | uc.spellDefinitions[this.spellId][5] << 5;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wa.I(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    private final void queueAreaStrengthCapacityChanges(byte obfuscationGuard, Battlefield battlefield) {
        int tileX = 0;
        int tileY = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int radius = 0;
        RuntimeException var3 = null;
        Unit targetUnit = null;
        int shrinkIndex = 0;
        int obfuscationControl = 0;
        int growIndex;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 78) {
            field_h = (String) null;
          }
          radius = uc.spellDefinitions[this.spellId][7];
          for (tileX = this.targetX - radius; tileX <= radius + this.targetX; tileX++) {
            for (tileY = -radius + this.targetY; this.targetY + radius >= tileY; tileY++) {
              targetUnit = battlefield.getUnitAt(tileY, true, tileX);
              if (targetUnit != null) {
                for (shrinkIndex = 0; uc.spellDefinitions[this.spellId][6] > shrinkIndex; shrinkIndex++) {
                  battlefield.pendingEvents.addFirst(750, new TurnEffectEvent(targetUnit, 6));
                }
                for (growIndex = 0; uc.spellDefinitions[this.spellId][6] < growIndex; growIndex--) {
                  battlefield.pendingEvents.addFirst(750, new TurnEffectEvent(targetUnit, 4));
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("wa.N(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void queueAreaDamageOrHealing(boolean obfuscationGuard, Battlefield battlefield) {
        int tileX = 0;
        int tileY = 0;
        int healIndex = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int radius = 0;
        RuntimeException var3 = null;
        Unit targetUnit = null;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          radius = uc.spellDefinitions[this.spellId][7];
          if (!obfuscationGuard) {
            this.targetX = -123;
          }
          for (tileX = this.targetX - radius; radius + this.targetX >= tileX; tileX++) {
            for (tileY = this.targetY - radius; radius + this.targetY >= tileY; tileY++) {
              targetUnit = battlefield.getUnitAt(tileY, true, tileX);
              if (targetUnit != null) {
                if (uc.spellDefinitions[this.spellId][6] <= 0) {
                  for (healIndex = 0; healIndex > uc.spellDefinitions[this.spellId][6]; healIndex--) {
                    battlefield.pendingEvents.addFirst(750, new TurnEffectEvent(targetUnit, 1));
                  }
                } else {
                  battlefield.pendingEvents.addFirst(750, new DamageEvent(targetUnit, battlefield.scaleIncomingDamage(targetUnit, (byte) -128, uc.spellDefinitions[this.spellId][5], uc.spellDefinitions[this.spellId][6]), false));
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("wa.O(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void installViewportResizeListener(int obfuscationGuard, ViewportResizeListener listener) {
        try {
          PreparedAction.a((byte) 111, new fj(listener));
          if (obfuscationGuard < 8) {
            field_h = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wa.T(" + obfuscationGuard + ',' + (listener != null ? "{...}" : "null") + ')');
        }
    }

    private final void applyTerrainEffect(byte obfuscationGuard, int castingPlayer, Battlefield battlefield) {
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int ownershipRadius = 0;
        RuntimeException var4 = null;
        int ownershipTileX = 0;
        int ownershipTileY = 0;
        MapTile ownedTile = null;
        int crossingTileY = 0;
        int var8 = 0;
        int var9 = 0;
        int directionBranch = 0;
        int obfuscationControl = 0;
        int skeletonRadius;
        int crossingDirection;
        int skeletonTileX;
        int crossingTerrain;
        int skeletonTileY;
        int crossingTileX;
        int crossingDeltaX;
        int crossingDeltaY;
        int terrainRadius;
        int terrainTileX;
        int terrainTileY;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (uc.spellDefinitions[this.spellId][5] == 5) {
            ownershipRadius = uc.spellDefinitions[this.spellId][7];
            for (ownershipTileX = this.targetX - ownershipRadius; ownershipRadius + this.targetX >= ownershipTileX; ownershipTileX++) {
              if (ownershipTileX >= 0) {
                if (battlefield.mapWidth <= ownershipTileX) {
                  break;
                }
                for (ownershipTileY = -ownershipRadius + this.targetY; ownershipTileY <= this.targetY + ownershipRadius; ownershipTileY++) {
                  if (ownershipTileY >= 0) {
                    if (ownershipTileY >= battlefield.mapHeight) {
                      break;
                    }
                    ownedTile = battlefield.tiles[ownershipTileX + battlefield.mapWidth * ownershipTileY];
                    ownedTile.setExplicitOwner(true, battlefield.getPlayerTeamIndex(castingPlayer, -1));
                  }
                }
              }
            }
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (uc.spellDefinitions[this.spellId][5] == 6) {
            skeletonRadius = uc.spellDefinitions[this.spellId][7];
            for (skeletonTileX = this.targetX - skeletonRadius; this.targetX + skeletonRadius >= skeletonTileX; skeletonTileX++) {
              if (0 <= skeletonTileX) {
                if (battlefield.mapWidth <= skeletonTileX) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                for (skeletonTileY = this.targetY - skeletonRadius; this.targetY + skeletonRadius >= skeletonTileY; skeletonTileY++) {
                  if (skeletonTileY >= 0) {
                    if (battlefield.mapHeight <= skeletonTileY) {
                      break;
                    }
                    battlefield.healOrRaiseSkeletonAt((byte) 86, castingPlayer, skeletonTileY, skeletonTileX);
                  }
                }
              }
            }
            decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0) &&
            (uc.spellDefinitions[this.spellId][5] == 3)) {
            terrainRadius = uc.spellDefinitions[this.spellId][7];
            for (terrainTileX = -terrainRadius + this.targetX; terrainRadius + this.targetX >= terrainTileX; terrainTileX++) {
              for (terrainTileY = this.targetY - terrainRadius; terrainRadius + this.targetY >= terrainTileY; terrainTileY++) {
                battlefield.applyTerrainChange(terrainTileX, true, uc.spellDefinitions[this.spellId][6], castingPlayer, terrainTileY);
              }
            }
          }
          if (uc.spellDefinitions[this.spellId][5] == 4) {
            crossingDirection = battlefield.getTerrainCrossingDirection(this.targetY, 2056, this.targetX);
            crossingTerrain = battlefield.getNormalizedTerrainAt(this.targetY, -85, this.targetX);
            crossingTileX = this.targetX;
            crossingTileY = this.targetY;
            var8 = 0;
            var9 = 0;
            directionBranch = crossingDirection;
            if (1 != directionBranch) {
              if (2 == directionBranch) {
                crossingDeltaX = 0;
                crossingDeltaY = 1;
              } else {
                if (directionBranch == 3) {
                  crossingDeltaY = 0;
                  crossingDeltaX = -1;
                } else {
                  if (directionBranch != 0) {
                    return;
                  }
                  crossingDeltaY = 0;
                  crossingDeltaX = 1;
                }
              }
            } else {
              crossingDeltaY = -1;
              crossingDeltaX = 0;
            }
            while (battlefield.getNormalizedTerrainAt(crossingTileY, -85, crossingTileX) == crossingTerrain) {
              battlefield.applyTerrainChange(crossingTileX, true, 10, castingPlayer, crossingTileY);
              crossingTileY = crossingTileY + crossingDeltaY;
              crossingTileX = crossingTileX + crossingDeltaX;
            }
            battlefield.applyTerrainChange(crossingTileX, true, 1, castingPlayer, crossingTileY);
            battlefield.applyTerrainChange(this.targetX - crossingDeltaX, true, 1, castingPlayer, this.targetY - crossingDeltaY);
          }
          if (obfuscationGuard != -100) {
            return;
          }
          if (uc.spellDefinitions[this.spellId][5] == 7) {
            battlefield.tiles[this.targetY * battlefield.mapWidth + this.targetX].ownerPlayer = -1;
            battlefield.recountMapStructures(-2);
            battlefield.recountStructures(obfuscationGuard ^ -98);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_63_0 = var4;
          stackIn_63_1 = new StringBuilder().append("wa.J(").append(obfuscationGuard).append(',').append(castingPlayer).append(',');
          if (battlefield == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(')').toString());
        }
    }

    final static int readSignedBits(CipherPacketBuffer packet, int bitCount, int obfuscationGuard) {
        RuntimeException var3 = null;
        CipherPacketBuffer var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 1) {
            var4 = (CipherPacketBuffer) null;
            UnitSpell.readSignedBits((CipherPacketBuffer) null, 11, -12);
          }
          stackIn_3_0 = (packet.readBits(obfuscationGuard - 102, bitCount) ^ 1 << bitCount - 1) - (1 << bitCount - 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wa.L(");
          if (packet == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(bitCount).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void applyEffect(int castingPlayer, Battlefield battlefield, int obfuscationGuard) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        Unit markedTarget = null;
        int handlerKind = 0;
        RuntimeException var4_ref = null;
        int dispatchKind = 0;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (uc.spellDefinitions[this.spellId][3] == 0) {
            markedTarget = battlefield.getUnitAt(this.targetY, true, this.targetX);
            if (markedTarget != null) {
              markedTarget.packedFlag512 = true;
            }
          }
          handlerKind = uc.spellDefinitions[this.spellId][4];
          if (obfuscationGuard != 26123) {
            return;
          }
          dispatchKind = handlerKind;
          if (dispatchKind != 4) {
            if (dispatchKind != 6) {
              if (dispatchKind != 0) {
                if (dispatchKind != 1) {
                  if (dispatchKind == 3) {
                    this.applyAccessoryEffect((byte) 51, battlefield);
                  } else {
                    if (dispatchKind == 2) {
                      this.applyUnitFlagsAndImmobilize(battlefield, true);
                    }
                  }
                } else {
                  this.applyEquipmentEffect(95, battlefield);
                }
              } else {
                this.applyStatusEffect(0, battlefield);
              }
            } else {
              this.applyTerrainEffect((byte) -100, castingPlayer, battlefield);
            }
          } else {
            this.applyAreaEffect(true, battlefield);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_26_0 = var4_ref;
          stackIn_26_1 = new StringBuilder().append("wa.A(").append(castingPlayer).append(',');
          if (battlefield == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int getPayloadSize(int obfuscationGuard) {
        if (obfuscationGuard != 25365) {
          return -57;
        }
        return 4;
    }

    final static void a(int param0, int param1, aj param2) {
        try {
          if (param1 != 1) {
            ViewportResizeListener var4 = (ViewportResizeListener) null;
            UnitSpell.installViewportResizeListener(-25, (ViewportResizeListener) null);
          }
          GameEvent.field_r.addLast((byte) -119, (IntrusiveNode) (param2));
          BirthDateChatEnableForm.a((byte) -57, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wa.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void applyAccessoryEffect(byte obfuscationGuard, Battlefield battlefield) {
        Unit accessoryTarget = null;
        Unit targetUnit = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          targetUnit = battlefield.getUnitAt(this.targetY, true, this.targetX);
          accessoryTarget = targetUnit;
          if (obfuscationGuard != 51) {
            field_h = (String) null;
          }
          if (accessoryTarget != null) {
            targetUnit.accessoryType = uc.spellDefinitions[this.spellId][5];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("wa.K(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void prepareEffect(byte obfuscationGuard, Battlefield battlefield) {
        try {
          if (obfuscationGuard != -37) {
            this.targetX = 12;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wa.D(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    private final void applyUnitFlagsAndImmobilize(Battlefield battlefield, boolean obfuscationGuard) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        Unit targetUnit = null;
        Unit flagTarget = null;
        try {
          targetUnit = battlefield.getUnitAt(this.targetY, obfuscationGuard, this.targetX);
          flagTarget = targetUnit;
          if (115 == this.spellId &&
            flagTarget.unitType == 63 ||
            119 == this.spellId &&
            43 == flagTarget.unitType ||
            this.spellId == 118 &&
            flagTarget.unitType == 59 ||
            this.spellId == 116 &&
            flagTarget.unitType == 58 ||
            this.spellId == 117 &&
            flagTarget.unitType == 53) {
            flagTarget.packedFlag32 = true;
            battlefield.refreshTileEffectsNear(this.targetY, this.targetX, 0, 3);
          }
          if (this.spellId == 120) {
            targetUnit.meleeLifeSteal = true;
          }
          if (19 == uc.spellDefinitions[this.spellId][5]) {
            flagTarget.packedFlag256 = true;
          }
          if (uc.spellDefinitions[this.spellId][5] == 21) {
            targetUnit.immobilizedTurns = targetUnit.immobilizedTurns + uc.spellDefinitions[this.spellId][6];
            flagTarget.movementSpent = true;
            flagTarget.attacksRemaining = 0;
            if (flagTarget.immobilizedTurns <= 100) {
              return;
            }
            flagTarget.immobilizedTurns = 100;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("wa.P(");
          if (battlefield == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_h = null;
        field_e = null;
        if (param0 != 6) {
          field_h = (String) null;
        }
    }

    UnitSpell(int spellId, int targetX, int targetY) {
        super(spellId);
        this.targetY = targetY;
        this.targetX = targetX;
    }

    final void finishEffect(Battlefield battlefield, int obfuscationGuard) {
        try {
          if (obfuscationGuard != -1700635440) {
            field_h = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wa.G(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    static {
        field_h = "(<%0> players want to join)";
    }
}
