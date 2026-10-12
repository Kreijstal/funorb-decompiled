/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnitSpell extends Spell {
    static String field_h;
    static String field_e;
    int targetY;
    int targetX;

    private final void a(int param0, Battlefield param1) {
        Unit var5 = null;
        try {
          var5 = param1.getUnitAt(this.targetY, true, this.targetX);
          Unit var3 = var5;
          if (param0 != 0) {
            Battlefield var4 = (Battlefield) null;
            this.b((byte) 119, (Battlefield) null);
          }
          var5.statusEffectType = uc.spellDefinitions[this.spellId][5];
          var5.statusEffectValue = uc.spellDefinitions[this.spellId][6];
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wa.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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

    private final void d(byte param0, Battlefield param1) {
        int var4 = 0;
        Unit var5 = null;
        Unit var6 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 >= -100) {
            this.targetY = 58;
          }
          var5 = param1.getUnitAt(this.targetY, true, this.targetX);
          var6 = var5;
          if (uc.spellDefinitions[this.spellId][6] == 7) {
            var5.poisoned = true;
          }
          if (uc.spellDefinitions[this.spellId][6] == 16) {
            if (var6.immobilizedTurns > 0) {
              var6.immobilizedTurns = var6.immobilizedTurns - 1;
            } else {
              if (34 != var6.unitType ||
                !var6.packedFlag8) {
                var6.movementSpent = false;
              }
              if (74 != var6.unitType) {
                var6.attacksRemaining = 1;
              } else {
                var6.attacksRemaining = 2;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("wa.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final void a(boolean param0, Battlefield param1) {
        int var3_int = 0;
        int var4 = 0;
        Battlefield var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!param0) {
            var5 = (Battlefield) null;
            this.a((Battlefield) null, false);
          }
          var3_int = uc.spellDefinitions[this.spellId][5];
          if (var3_int != 0) {
            if (var3_int != 64) {
              this.b(true, param1);
            } else {
              this.c((byte) 78, param1);
            }
          } else {
            this.d((byte) -106, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("wa.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void b(int param0, Battlefield param1) {
        Unit var5 = null;
        try {
          if (param0 <= 80) {
            Battlefield var4 = (Battlefield) null;
            this.finishEffect((Battlefield) null, 28);
          }
          var5 = param1.getUnitAt(this.targetY, true, this.targetX);
          Unit var3 = var5;
          var5.equipmentDescriptor = uc.spellDefinitions[this.spellId][6] | uc.spellDefinitions[this.spellId][5] << 5;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wa.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(byte param0, Battlefield param1) {
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Unit var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 78) {
            field_h = (String) null;
          }
          var3_int = uc.spellDefinitions[this.spellId][7];
          for (var4 = this.targetX - var3_int; var4 <= var3_int + this.targetX; var4++) {
            for (var5 = -var3_int + this.targetY; this.targetY + var3_int >= var5; var5++) {
              var6 = param1.getUnitAt(var5, true, var4);
              if (var6 != null) {
                for (var7 = 0; uc.spellDefinitions[this.spellId][6] > var7; var7++) {
                  param1.pendingEvents.addFirst(750, new TurnEffectEvent(var6, 6));
                }
                for (var7Lifetime1 = 0; uc.spellDefinitions[this.spellId][6] < var7Lifetime1; var7Lifetime1--) {
                  param1.pendingEvents.addFirst(750, new TurnEffectEvent(var6, 4));
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("wa.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void b(boolean param0, Battlefield param1) {
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Unit var6 = null;
        int var8 = 0;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = uc.spellDefinitions[this.spellId][7];
          if (!param0) {
            this.targetX = -123;
          }
          for (var4 = this.targetX - var3_int; var3_int + this.targetX >= var4; var4++) {
            for (var5 = this.targetY - var3_int; var3_int + this.targetY >= var5; var5++) {
              var6 = param1.getUnitAt(var5, true, var4);
              if (var6 != null) {
                if (uc.spellDefinitions[this.spellId][6] <= 0) {
                  for (var7 = 0; var7 > uc.spellDefinitions[this.spellId][6]; var7--) {
                    param1.pendingEvents.addFirst(750, new TurnEffectEvent(var6, 1));
                  }
                } else {
                  param1.pendingEvents.addFirst(750, new DamageEvent(var6, param1.scaleIncomingDamage(var6, (byte) -128, uc.spellDefinitions[this.spellId][5], uc.spellDefinitions[this.spellId][6]), false));
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("wa.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(int param0, ok param1) {
        try {
          PreparedAction.a((byte) 111, new fj(param1));
          if (param0 < 8) {
            field_h = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wa.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, int param1, Battlefield param2) {
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        MapTile var7_ref_ne = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var8Lifetime1;
        int var9Lifetime1;
        int var4_intLifetime1Lifetime1;
        int var5Lifetime1Lifetime1;
        int var6Lifetime1Lifetime1;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (uc.spellDefinitions[this.spellId][5] == 5) {
            var4_int = uc.spellDefinitions[this.spellId][7];
            for (var5 = this.targetX - var4_int; var4_int + this.targetX >= var5; var5++) {
              if (var5 >= 0) {
                if (param2.mapWidth <= var5) {
                  break;
                }
                for (var6 = -var4_int + this.targetY; var6 <= this.targetY + var4_int; var6++) {
                  if (var6 >= 0) {
                    if (var6 >= param2.mapHeight) {
                      break;
                    }
                    var7_ref_ne = param2.tiles[var5 + param2.mapWidth * var6];
                    var7_ref_ne.setExplicitOwner(true, param2.getPlayerTeamIndex(param1, -1));
                  }
                }
              }
            }
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (uc.spellDefinitions[this.spellId][5] == 6) {
            var4_intLifetime1 = uc.spellDefinitions[this.spellId][7];
            for (var5Lifetime1 = this.targetX - var4_intLifetime1; this.targetX + var4_intLifetime1 >= var5Lifetime1; var5Lifetime1++) {
              if (0 <= var5Lifetime1) {
                if (param2.mapWidth <= var5Lifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                for (var6Lifetime1 = this.targetY - var4_intLifetime1; this.targetY + var4_intLifetime1 >= var6Lifetime1; var6Lifetime1++) {
                  if (var6Lifetime1 >= 0) {
                    if (param2.mapHeight <= var6Lifetime1) {
                      break;
                    }
                    param2.healOrRaiseSkeletonAt((byte) 86, param1, var6Lifetime1, var5Lifetime1);
                  }
                }
              }
            }
            decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0) &&
            (uc.spellDefinitions[this.spellId][5] == 3)) {
            var4_intLifetime1Lifetime1 = uc.spellDefinitions[this.spellId][7];
            for (var5Lifetime1Lifetime1 = -var4_intLifetime1Lifetime1 + this.targetX; var4_intLifetime1Lifetime1 + this.targetX >= var5Lifetime1Lifetime1; var5Lifetime1Lifetime1++) {
              for (var6Lifetime1Lifetime1 = this.targetY - var4_intLifetime1Lifetime1; var4_intLifetime1Lifetime1 + this.targetY >= var6Lifetime1Lifetime1; var6Lifetime1Lifetime1++) {
                param2.b(var5Lifetime1Lifetime1, true, uc.spellDefinitions[this.spellId][6], param1, var6Lifetime1Lifetime1);
              }
            }
          }
          if (uc.spellDefinitions[this.spellId][5] == 4) {
            var4_intLifetime2 = param2.a(this.targetY, 2056, this.targetX);
            var5Lifetime2 = param2.g(this.targetY, -85, this.targetX);
            var6Lifetime2 = this.targetX;
            var7 = this.targetY;
            var8 = 0;
            var9 = 0;
            var10 = var4_intLifetime2;
            if (1 != var10) {
              if (2 == var10) {
                var8Lifetime1 = 0;
                var9Lifetime1 = 1;
              } else {
                if (var10 == 3) {
                  var9Lifetime1 = 0;
                  var8Lifetime1 = -1;
                } else {
                  if (var10 != 0) {
                    return;
                  }
                  var9Lifetime1 = 0;
                  var8Lifetime1 = 1;
                }
              }
            } else {
              var9Lifetime1 = -1;
              var8Lifetime1 = 0;
            }
            while (param2.g(var7, -85, var6Lifetime2) == var5Lifetime2) {
              param2.b(var6Lifetime2, true, 10, param1, var7);
              var7 = var7 + var9Lifetime1;
              var6Lifetime2 = var6Lifetime2 + var8Lifetime1;
            }
            param2.b(var6Lifetime2, true, 1, param1, var7);
            param2.b(this.targetX - var8Lifetime1, true, 1, param1, this.targetY - var9Lifetime1);
          }
          if (param0 != -100) {
            return;
          }
          if (uc.spellDefinitions[this.spellId][5] == 7) {
            param2.tiles[this.targetY * param2.mapWidth + this.targetX].ownerPlayer = -1;
            param2.recountMapStructures(-2);
            param2.recountStructures(param0 ^ -98);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_63_0 = var4;
          stackIn_63_1 = new StringBuilder().append("wa.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
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
        Unit var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (uc.spellDefinitions[this.spellId][3] == 0) {
            var4 = battlefield.getUnitAt(this.targetY, true, this.targetX);
            if (var4 != null) {
              var4.packedFlag512 = true;
            }
          }
          var4_int = uc.spellDefinitions[this.spellId][4];
          if (obfuscationGuard != 26123) {
            return;
          }
          var5 = var4_int;
          if (var5 != 4) {
            if (var5 != 6) {
              if (var5 != 0) {
                if (var5 != 1) {
                  if (var5 == 3) {
                    this.b((byte) 51, battlefield);
                  } else {
                    if (var5 == 2) {
                      this.a(battlefield, true);
                    }
                  }
                } else {
                  this.b(95, battlefield);
                }
              } else {
                this.a(0, battlefield);
              }
            } else {
              this.a((byte) -100, castingPlayer, battlefield);
            }
          } else {
            this.a(true, battlefield);
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
            ok var4 = (ok) null;
            UnitSpell.a(-25, (ok) null);
          }
          GameEvent.field_r.addLast((byte) -119, (IntrusiveNode) (param2));
          wr.a((byte) -57, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wa.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(byte param0, Battlefield param1) {
        Unit var3 = null;
        Unit var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = param1.getUnitAt(this.targetY, true, this.targetX);
          var3 = var4;
          if (param0 != 51) {
            field_h = (String) null;
          }
          if (var3 != null) {
            var4.accessoryType = uc.spellDefinitions[this.spellId][5];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("wa.K(").append(param0).append(',');
          if (param1 == null) {
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

    private final void a(Battlefield param0, boolean param1) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        Unit var4 = null;
        Unit var5 = null;
        try {
          var4 = param0.getUnitAt(this.targetY, param1, this.targetX);
          var5 = var4;
          if (115 == this.spellId &&
            var5.unitType == 63 ||
            119 == this.spellId &&
            43 == var5.unitType ||
            this.spellId == 118 &&
            var5.unitType == 59 ||
            this.spellId == 116 &&
            var5.unitType == 58 ||
            this.spellId == 117 &&
            var5.unitType == 53) {
            var5.packedFlag32 = true;
            param0.a(this.targetY, this.targetX, 0, 3);
          }
          if (this.spellId == 120) {
            var4.meleeLifeSteal = true;
          }
          if (19 == uc.spellDefinitions[this.spellId][5]) {
            var5.packedFlag256 = true;
          }
          if (uc.spellDefinitions[this.spellId][5] == 21) {
            var4.immobilizedTurns = var4.immobilizedTurns + uc.spellDefinitions[this.spellId][6];
            var5.movementSpent = true;
            var5.attacksRemaining = 0;
            if (var5.immobilizedTurns <= 100) {
              return;
            }
            var5.immobilizedTurns = 100;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("wa.P(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
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
