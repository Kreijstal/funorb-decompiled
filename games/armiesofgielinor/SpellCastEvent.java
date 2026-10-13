/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpellCastEvent extends GameEvent {
    static String field_A;
    private boolean applied;
    Spell spell;
    private int castingPlayer;
    static ClientUiComponent field_D;
    int selectionMode;
    static CommunityTabGroup field_E;

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        int var3 = 3 % ((53 - obfuscationGuard) / 51);
        String var4 = "Trinketused! " + this.spell.spellId;
        if (verbose) {
          System.out.println(var4);
        }
        return var4;
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        if (obfuscationGuard != -26661) {
          field_A = (String) null;
        }
        if (this.applied) {
          return;
        }
        try {
          this.applied = true;
          this.spell.applyEffect(this.castingPlayer, battlefield, 26123);
          battlefield.consumeEquippedSpell((byte) -49, this.spell, this.selectionMode, this.castingPlayer);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pj.G(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static void h(int param0) {
        int var3 = 0;
        String stackIn_12_0 = null;
        boolean stackIn_13_1 = false;
        nr stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        nr var9 = null;
        int var10 = 0;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var1_int = CachedArchiveProvider.field_h - BattlefieldTheme.field_f;
          BattlefieldTheme.field_f = bt.field_g - (var1_int >> 1);
          CachedArchiveProvider.field_h = var1_int + BattlefieldTheme.field_f;
          if (param0 != 15) {
            field_E = (CommunityTabGroup) null;
          }
          InstructionsPanel.field_r = -(DualLinkedNode.field_r >> 1) + lm.field_g;
          var2 = InstructionsPanel.field_r;
          for (var3 = 0; nb.field_h.length > var3; var3++) {
            var4 = DirectByteStorage.field_k[var3];
            if (var4 >= 0) {
              if (var4 == MovementPlanner.field_z.selectedIndex) {
                var5 = jv.field_c;
              } else {
                var5 = DualNodeDeque.field_g;
              }
            } else {
              var5 = ActionRequest.field_n;
            }
            var6 = nb.field_h[var3];
            stackIn_12_0 = var6;
            stackIn_13_1 = !(0 > var4);
            var7 = lp.a(stackIn_12_0, stackIn_13_1, false);
            var8 = bt.field_g - (var7 >> 1);
            if (0 <= var4) {
              var2 = var2 + QuickChatPhrase.field_w;
              if (MovementPlanner.field_z.selectedIndex != var4) {
                stackIn_17_0 = ov.field_m;
              } else {
                stackIn_17_0 = ed.field_d;
              }
              var9 = stackIn_17_0;
              if (var9 != null) {
                var9.a((byte) -111, (FullscreenFocusCanvas.field_b << 1) + jg.field_k, var8 - LoginForm.field_E, (LoginForm.field_E << 1) + var7, var2);
              }
              var2 = var2 + FullscreenFocusCanvas.field_b;
            }
            if (0 <= var4) {
              NanoGameClock.field_s.drawText(var6, var8, ia.field_g + var2, var5, -1);
              var2 = var2 + (jg.field_k + QuickChatPhrase.field_w + FullscreenFocusCanvas.field_b);
            } else {
              AiPlanner.field_G.drawText(var6, var8, var2 + StandardContentDialog.field_mb, var5, -1);
              var2 = var2 + cn.field_o;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "pj.B(" + param0 + ')');
        }
    }

    final static void b(int param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        li var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4 = (li) (s.field_e.first((byte) 108));
          while (var4 != null) {
            DeathEvent.a(var4, param0, 25522);
            var4 = (li) (s.field_e.next((byte) 123));
          }
          if (param1 != -32666) {
            field_D = (ClientUiComponent) null;
          }
          var2 = AccountRegistrationDialog.field_Bb.first((byte) 105);
          while (var2 != null) {
            tq.a(param0, 0);
            var2 = AccountRegistrationDialog.field_Bb.next((byte) 123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "pj.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static String g(int param0) {
        if (!(StrongCacheEntry.field_E >= 2)) {
          return BattleUnitRenderer.field_c;
        }
        if (null != IconTextComponent.field_Nb) {
          if (!IconTextComponent.field_Nb.ensureIndex((byte) 82)) {
            return db.field_b;
          }
          return LobbyPlayer.field_Jb;
        }
        if (!ps.field_u.ensureIndex((byte) 82)) {
          return TileMetadata.field_i;
        }
        if (param0 != -15862) {
          return (String) null;
        }
        if (!ps.field_u.ensureGroupAvailableByName(28979, "commonui")) {
          return Battlefield.field_nb + " - " + ps.field_u.getGroupProgressByName("commonui", (byte) -34) + "%";
        }
        if (!CombatPresentation.field_M.ensureIndex((byte) 82)) {
          return is.field_f;
        }
        if (!CombatPresentation.field_M.ensureGroupAvailableByName(28979, "commonui")) {
          return QuickChatPhraseRepository.field_a + " - " + CombatPresentation.field_M.getGroupProgressByName("commonui", (byte) 122) + "%";
        }
        if (!h.field_g.ensureIndex((byte) 82)) {
          return ProgressDialog.field_eb;
        }
        if (!h.field_g.ensureAllGroupsAvailable(param0 ^ 20707)) {
          return DateInputWidget.field_G + " - " + h.field_g.getOverallProgress(0) + "%";
        }
        return fm.field_c;
    }

    public static void a(boolean param0) {
        field_E = null;
        field_A = null;
        if (!param0) {
          SpellCastEvent.b(-127, -31);
        }
        field_D = null;
    }

    final static int computeMovementStepCost(int mapWidth, MapTile[] tiles, boolean checkOccupancy, int destinationIndex, int playerId, int mapHeight, int teamIndex, Unit unit, int sourceIndex, boolean allowUnmovedOwnUnits, boolean obfuscationGuard) {
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        int unitCategory = 0;
        int sourceTerrain = 0;
        int destinationTerrain = 0;
        int var15 = 0;
        int var16 = 0;
        int kind2Override = 0;
        int costThreeOverride = 0;
        int costOneOverride = 0;
        int category4 = 0;
        int sourceEffects = 0;
        int obfuscationControl = 0;
        Unit destinationOccupant = null;
        int sourceCost;
        int destinationCost;
        int destinationEffects;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          destinationOccupant = tiles[destinationIndex].occupant;
          if (checkOccupancy &&
            destinationOccupant != null && (!allowUnmovedOwnUnits ||
            destinationOccupant.movementSpent ||
            playerId != destinationOccupant.ownerPlayer)) {
            stackIn_8_0 = 1000000;
            return stackIn_8_0;
          }
          unitCategory = unit.getUnitCategory(0);
          sourceTerrain = tiles[sourceIndex].terrainType;
          destinationTerrain = tiles[destinationIndex].terrainType;
          var15 = 0;
          var16 = 0;
          stackIn_12_0 = (bw.unitDefinitions[unit.unitType][1] != 2) ? 0 : 1;
          kind2Override = stackIn_12_0;
          costThreeOverride = unit.r((byte) 55) ? 1 : 0;
          costOneOverride = unit.o((byte) 98) ? 1 : 0;
          stackIn_15_0 = (unitCategory != 4) ? 0 : 1;
          category4 = stackIn_15_0;
          sourceCost = LeaderEscortCondition.baseTerrainMovementCosts[unitCategory][sourceTerrain];
          if (!obfuscationGuard) {
            stackIn_17_0 = 20;
            return stackIn_17_0;
          }
          if (kind2Override != 0 &&
            sourceTerrain == 3) {
            sourceCost = 3;
          } else if (sourceTerrain != 4 &&
            sourceTerrain != 6) {
            if (sourceTerrain == 5 && (costThreeOverride != 0 ||
              costOneOverride != 0)) {
              sourceCost = 3;
            }
          } else {
            if (costOneOverride != 0) {
              sourceCost = 1;
            } else {
              if (costThreeOverride != 0) {
                sourceCost = 3;
              }
            }
          }
          if (sourceCost < 0) {
            sourceCost = 6;
          }
          destinationCost = LeaderEscortCondition.baseTerrainMovementCosts[unitCategory][destinationTerrain];
          if (kind2Override != 0 &&
            destinationTerrain == 3) {
            destinationCost = 3;
          } else if (destinationTerrain != 4 &&
            6 != destinationTerrain) {
            if (destinationTerrain == 5 && (costThreeOverride != 0 ||
              costOneOverride != 0)) {
              destinationCost = 3;
            }
          } else {
            if (costOneOverride != 0) {
              destinationCost = 1;
            } else {
              if (costThreeOverride != 0) {
                destinationCost = 3;
              }
            }
          }
          if (destinationCost < 0) {
            destinationCost = 1000000;
          }
          sourceEffects = tiles[sourceIndex % mapWidth + sourceIndex / mapHeight * mapWidth].getEffectsForPlayer((byte) 97, playerId, teamIndex);
          if (category4 == 0 &&
            (1 & sourceEffects) != 0 &&
            sourceTerrain != 4 &&
            6 != sourceTerrain &&
            sourceTerrain != 2 &&
            12 != sourceTerrain &&
            15 != sourceTerrain) {
            sourceCost = 9;
          }
          destinationEffects = tiles[destinationIndex % mapWidth + mapWidth * (destinationIndex / mapHeight)].getEffectsForPlayer((byte) 97, playerId, teamIndex);
          if (category4 == 0 &&
            (1 & destinationEffects) != 0 &&
            destinationTerrain != 4 &&
            destinationTerrain != 6 &&
            destinationTerrain != 2 &&
            destinationTerrain != 12 &&
            destinationTerrain != 15) {
            destinationCost = 9;
          }
          if (2 == destinationTerrain &&
            unit.unitType == 62) {
            destinationCost = 3 * bw.unitDefinitions[62][3];
          }
          if (destinationCost >= sourceCost) {
            stackIn_78_0 = destinationCost;
            return stackIn_78_0;
          }
          stackIn_76_0 = sourceCost;
          return stackIn_76_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_81_0 = var11;
          stackIn_81_1 = new StringBuilder().append("pj.E(").append(mapWidth).append(',');
          if (tiles == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          stackIn_84_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(checkOccupancy).append(',').append(destinationIndex).append(',').append(playerId).append(',').append(mapHeight).append(',').append(teamIndex).append(',');
          if (unit == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(',').append(sourceIndex).append(',').append(allowUnmovedOwnUnits).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        int stackIn_39_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          ArrayWidgetContainer.b(-103, this.spell.spellId);
          SpellCastRequest.a(3, (byte) -121, 38);
          param2.notifyTutorialInteraction(27, this.spell.spellId, -91);
          var4_int = 0;
          if (param1 >= -84) {
            SpellCastEvent.b(30, -93);
          }
          var4_int = var4_int != 0 | this.a((byte) -39, param2, param0, false) ? 1 : 0;
          if (uc.spellDefinitions[this.spell.spellId][3] != 4 &&
            uc.spellDefinitions[this.spell.spellId][4] != 5) {
            var5 = ((UnitSpell) (this.spell)).targetX;
            var6 = ((UnitSpell) (this.spell)).targetY;
            if (6 != uc.spellDefinitions[this.spell.spellId][3]) {
              var7 = uc.spellDefinitions[this.spell.spellId][7];
              for (var8 = -var7 + var5; var8 <= var7 + var5; var8++) {
                if (var8 >= 0 &&
                  var8 < param2.battlefield.mapWidth) {
                  for (var9 = -var7 + var6; var9 <= var7 + var6; var9++) {
                    if (0 <= var9 &&
                      param2.battlefield.mapWidth > var9) {
                      var4_int = var4_int != 0 | this.a(var9, 15, param2, param0, var8) ? 1 : 0;
                    }
                  }
                }
              }
            } else {
              var7 = param2.battlefield.getTerrainCrossingDirection(var6, 2056, var5);
              var8 = param2.battlefield.getNormalizedTerrainAt(var6, -90, var5);
              var9 = var5;
              var10 = var6;
              var11 = 0;
              var12 = 0;
              var13 = var7;
              if (var13 != 1) {
                if (var13 != 2) {
                  if (var13 == 3) {
                    var11Lifetime1 = -1;
                    var12Lifetime1 = 0;
                  } else {
                    if (var13 != 0) {
                      return false;
                    }
                    var12Lifetime1 = 0;
                    var11Lifetime1 = 1;
                  }
                } else {
                  var12Lifetime1 = 1;
                  var11Lifetime1 = 0;
                }
              } else {
                var11Lifetime1 = 0;
                var12Lifetime1 = -1;
              }
              while (var8 == param2.battlefield.getNormalizedTerrainAt(var10, -94, var9)) {
                var4_int = var4_int != 0 | this.a(var10, 15, param2, param0, var9) ? 1 : 0;
                var9 = var9 + var11Lifetime1;
                var10 = var10 + var12Lifetime1;
              }
              var4_int = var4_int != 0 | this.a(var6 - var12Lifetime1, 15, param2, param0, -var11Lifetime1 + var5) ? 1 : 0;
              var4_int = var4_int != 0 | this.a(var10, 15, param2, param0, var9) ? 1 : 0;
            }
          }
          LineOfSightGrid.$cfr$intArgs$a$5d483ac33914(-80, EmailCheckResult.a(4800, RadialSummonItem.field_e, new String[]{param2.battlefield.playerNames[this.castingPlayer], MusicPatchEnvelope.field_f[this.spell.spellId]}), param2.field_Nb);
          stackIn_39_0 = var4_int;
          return stackIn_39_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("pj.A(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    SpellCastEvent(Spell spell, int selectionMode, int castingPlayer) {
        try {
          this.castingPlayer = castingPlayer;
          this.selectionMode = selectionMode;
          this.spell = spell;
          this.eventKind = 24;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pj.<init>(" + (spell != null ? "{...}" : "null") + ',' + selectionMode + ',' + castingPlayer + ')');
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        Unit var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 593277313) {
            var3 = (Unit) null;
            SpellCastEvent.computeMovementStepCost(73, (MapTile[]) null, true, -35, 53, 62, 17, (Unit) null, 87, false, false);
          }
          stackIn_3_0 = TrianglePulse.a(param1, 0, param1.length, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pj.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_A = "This item can only be used on a cyclops.";
    }
}
