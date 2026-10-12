/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Unit extends IntrusiveNode implements TaggedFieldReader {
    int tag;
    UnitModelPreview modelPreview;
    int accessoryType;
    boolean hasTileEffect8;
    boolean hasTileEffect4;
    boolean modelVisible;
    int strength;
    static String field_n;
    int attacksRemaining;
    int unitType;
    private int movementTargetY;
    int tileX;
    Battlefield battlefield;
    boolean poisoned;
    boolean packedFlag32;
    int facingAngle;
    int attacksMade;
    int maximumStrength;
    boolean packedFlag512;
    static boolean field_L;
    int bonusStrength;
    boolean presentationOwnsModel;
    int movementFlags;
    static String field_y;
    int statusEffectValue;
    int immobilizedTurns;
    int objectiveId;
    AiUnitPlanner aiPlanner;
    int[] field_R;
    static String field_T;
    int modelAnimationIndex;
    boolean meleeLifeSteal;
    boolean field_X;
    boolean removedFromActivePlay;
    private int movementTargetX;
    int equipmentDescriptor;
    int tankId;
    int tileY;
    String displayName;
    int statusEffectType;
    int ownerPlayer;
    int attacksReceived;
    boolean packedFlag8;
    boolean movementSpent;
    boolean escortComplete;
    boolean hasTileEffect16;
    boolean packedFlag256;

    final boolean hasMovementFlag1(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          this.packedFlag256 = true;
        }
        return (1 & this.movementFlags) != 0 ? true : false;
    }

    final int a(boolean param0) {
        if (param0) {
          Unit var3 = (Unit) null;
          this.canParasitize((Unit) null, (byte) 94);
        }
        return this.movementTargetX;
    }

    final boolean p(byte param0) {
        if (param0 >= -94) {
          this.attacksMade = -85;
        }
        return (2 & bw.unitDefinitions[this.unitType][10]) > 0 ? true : false;
    }

    final int packStatusFlags(byte obfuscationGuard) {
        int var2 = 0;
        if (this.packedFlag256) {
          var2 = var2 | 256;
        }
        if (this.poisoned) {
          var2 = var2 | 16;
        }
        if (this.packedFlag8) {
          var2 = var2 | 8;
        }
        if (this.meleeLifeSteal) {
          var2 = var2 | 64;
        }
        if (this.packedFlag32) {
          var2 = var2 | 32;
        }
        if (this.movementSpent) {
          var2 = var2 | 4;
        }
        if (this.packedFlag512) {
          var2 = var2 | 512;
        }
        if (obfuscationGuard < 96) {
          this.accessoryType = -60;
        }
        var2 = var2 | 3 & this.attacksRemaining;
        return var2;
    }

    final boolean isJadeVine(byte obfuscationGuard) {
        if (obfuscationGuard < 73) {
          this.tileY = -27;
        }
        return this.unitType == 39 ? true : false;
    }

    final void setModelUnitType(int modelUnitType, int obfuscationGuard) {
        if (obfuscationGuard != 8) {
          this.n((byte) 80);
        }
        if (this.modelPreview == null) {
          this.modelPreview = new UnitModelPreview(this.field_R, modelUnitType, this.facingAngle);
        } else {
          this.modelPreview.setUnitType((byte) 59, modelUnitType);
        }
    }

    final boolean isSeaSlug(byte obfuscationGuard) {
        if (obfuscationGuard < 75) {
          this.aiPlanner = (AiUnitPlanner) null;
        }
        return this.unitType == 27 ? true : false;
    }

    final void n(byte param0) {
        int stackIn_6_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_1 = 0;
        Object var3;
        int var4;
        Unit var5;
        Unit var6;
        Unit var7;
        Unit var8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        if (0 < this.bonusStrength) {
          this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TurnEffectEvent(this, 5)));
        }
        if (this.a(param0 ^ -23050)) {
          var3 = this;
          var4 = 0;
          var5 = this.battlefield.getUnitAt(((Unit) (var3)).tileY, true, -1 + ((Unit) (var3)).tileX);
          stackIn_6_0 = var4;
          if (var5 != null &&
            0 != (8 & bw.unitDefinitions[var5.unitType][10])) {
            stackIn_7_1 = 1;
          } else {
            stackIn_7_1 = 0;
          }
          var4Lifetime1 = stackIn_6_0 | stackIn_7_1;
          var6 = this.battlefield.getUnitAt(((Unit) (var3)).tileY, true, 1 + ((Unit) (var3)).tileX);
          stackIn_10_0 = var4Lifetime1;
          if (var6 != null &&
            (8 & bw.unitDefinitions[var6.unitType][10]) != 0) {
            stackIn_11_1 = 1;
          } else {
            stackIn_11_1 = 0;
          }
          var4Lifetime2 = stackIn_10_0 | stackIn_11_1;
          var7 = this.battlefield.getUnitAt(1 + ((Unit) (var3)).tileY, true, ((Unit) (var3)).tileX);
          stackIn_14_0 = var4Lifetime2;
          if (var7 != null &&
            (bw.unitDefinitions[var7.unitType][10] & 8) != 0) {
            stackIn_15_1 = 1;
          } else {
            stackIn_15_1 = 0;
          }
          var4Lifetime3 = stackIn_14_0 | stackIn_15_1;
          var8 = this.battlefield.getUnitAt(-1 + ((Unit) (var3)).tileY, true, ((Unit) (var3)).tileX);
          stackIn_18_0 = var4Lifetime3;
          if (var8 != null &&
            0 != (bw.unitDefinitions[var8.unitType][10] & 8)) {
            stackIn_19_1 = 1;
          } else {
            stackIn_19_1 = 0;
          }
          var4Lifetime4 = stackIn_18_0 | stackIn_19_1;
          if (var4Lifetime4 == 0) {
            this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TurnEffectEvent(this, 3)));
          }
        }
        if (this.poisoned) {
          this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TurnEffectEvent(this, 2)));
        }
        if (param0 != -42) {
          Unit.m(45);
        }
    }

    final int getMinimumAttackRange(byte obfuscationGuard) {
        if (obfuscationGuard != -79) {
          this.getEquipmentId((byte) -122);
        }
        int var2 = bw.unitDefinitions[this.unitType][6];
        if (this.packedFlag8 &&
          this.unitType == 34) {
          var2 = 2;
        }
        return var2;
    }

    final int getEquipmentCategory(int obfuscationGuard) {
        if (0 > this.equipmentDescriptor) {
          return -1;
        }
        if (obfuscationGuard != 20640) {
          this.meleeLifeSteal = true;
        }
        return this.equipmentDescriptor >> 5;
    }

    final boolean canCaptureStructures(int obfuscationGuard) {
        boolean stackIn_7_0 = false;
        if (obfuscationGuard != -21428) {
          return false;
        }
        stackIn_7_0 = !((512 & bw.unitDefinitions[this.unitType][10]) <= 0) || (this.accessoryType == 1);
        return stackIn_7_0;
    }

    final int getEquipmentProperty(int propertyIndex, int obfuscationGuard) {
        if (0 > this.equipmentDescriptor) {
          return 0;
        }
        int var3 = 62 / ((-23 - obfuscationGuard) / 63);
        return ContextActionMenu.field_Vb[this.equipmentDescriptor & 31][propertyIndex];
    }

    final int getEffectiveStrength(byte obfuscationGuard) {
        if (obfuscationGuard != 122) {
          return 34;
        }
        return this.strength + this.bonusStrength;
    }

    final boolean hasAntiFlyingBonus(int obfuscationGuard) {
        int var2;
        boolean stackIn_5_0 = false;
        var2 = 106 % ((80 - obfuscationGuard) / 34);
        stackIn_5_0 = !((bw.unitDefinitions[this.unitType][10] & 2048) <= 0) || (this.accessoryType == 2);
        return stackIn_5_0;
    }

    final Unit replaceWithOwner(int newOwnerPlayer, int obfuscationGuard) {
        this.removeFromBattlefield(-97);
        if (obfuscationGuard != -1) {
          this.displayName = (String) null;
        }
        if (this.removedFromActivePlay) {
          return null;
        }
        if (this.strength + this.bonusStrength == 0) {
          return null;
        }
        Unit var3 = new Unit(this.tileX, this.tileY, this.unitType, newOwnerPlayer, this.maximumStrength, this.strength, this.packStatusFlags((byte) 105), this.accessoryType, this.bonusStrength, this.battlefield, this.statusEffectType, this.statusEffectValue, this.equipmentDescriptor, false, this.immobilizedTurns);
        this.battlefield.registerUnit(8288, var3);
        return var3;
    }

    final boolean p(int param0) {
        int var2;
        boolean stackIn_8_0 = false;
        var2 = -69 % ((3 - param0) / 46);
        stackIn_8_0 = (this.unitType == 58) || (this.unitType == 63) || (this.unitType == 59) || (this.unitType == 53) || (this.unitType == 43);
        return stackIn_8_0;
    }

    final int l(int param0) {
        int var2 = 0;
        if (!this.movementSpent) {
          var2 = var2 | 1;
        }
        if (0 < this.attacksRemaining) {
          var2 = var2 | 2;
        }
        if (this.poisoned) {
          var2 = var2 | 4;
        }
        if (this.hasTileEffect4) {
          var2 = var2 | 8;
        }
        if (this.hasTileEffect16) {
          var2 = var2 | 16;
        }
        if (this.hasTileEffect8) {
          var2 = var2 | 32;
        }
        if (this.packedFlag32) {
          var2 = var2 | 64;
        }
        if (this.packedFlag256) {
          var2 = var2 | 128;
        }
        if (this.meleeLifeSteal) {
          var2 = var2 | 256;
        }
        if (param0 != -27014) {
          return 27;
        }
        if (-1 < this.equipmentDescriptor) {
          var2 = var2 | 512;
        }
        if (0 < this.statusEffectValue) {
          var2 = var2 | 1024;
        }
        if (this.accessoryType != 0) {
          var2 = var2 | 2048;
        }
        if (this.immobilizedTurns > 0) {
          var2 = var2 | 4096;
        }
        return var2;
    }

    final boolean canParasitize(Unit target, byte obfuscationGuard) {
        RuntimeException var3 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.isSeaSlug((byte) 107)) {
            return false;
          }
          if (target.packedFlag8 &&
            target.unitType != 0) {
            return false;
          }
          if (obfuscationGuard < 113) {
            this.modelAnimationIndex = -18;
          }
          stackIn_12_0 = !(this.bonusStrength + this.strength < target.strength + target.bonusStrength);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("jd.T(");
          if (target == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void applyStrengthDamage(int damage, boolean updateAfterDamage) {
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.statusEffectType != 7 &&
          this.statusEffectType != 8) {
          this.strength = this.strength - damage;
        } else {
          if (this.statusEffectValue > 1) {
            this.statusEffectValue = this.statusEffectValue - 1;
          } else {
            this.statusEffectType = 0;
          }
        }
        if (!updateAfterDamage) {
          return;
        }
        this.queueDeathOrRevival(22331);
    }

    final boolean canAttackFlying(byte obfuscationGuard) {
        int var2;
        boolean stackIn_11_0 = false;
        var2 = 31 % ((-9 - obfuscationGuard) / 61);
        if (this.unitType == 34 &&
          this.packedFlag8) {
          return true;
        }
        stackIn_11_0 = (bw.unitDefinitions[this.unitType][0] == 4) || (bw.unitDefinitions[this.unitType][0] == 3) || (bw.unitDefinitions[this.unitType][0] == 2) || !((2048 & bw.unitDefinitions[this.unitType][10]) <= 0) || (this.accessoryType == 2);
        return stackIn_11_0;
    }

    final int D(int param0) {
        if (param0 > -63) {
          this.tileX = 66;
        }
        return this.movementTargetY;
    }

    final static boolean i(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        boolean stackIn_6_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = QuickChatCategory.field_w;
        synchronized (var1) {
          if (rd.field_d == SummonAction.field_E) {
            return false;
          }
          rs.field_q = gt.field_d[SummonAction.field_E];
          DualNodeDeque.field_i = SpellCastAction.field_u[SummonAction.field_E];
          var2 = 86 % ((param0 - 0) / 48);
          SummonAction.field_E = 127 & SummonAction.field_E + 1;
          stackIn_6_0 = true;
        }
        return stackIn_6_0;
    }

    final void refreshForTurnChange(byte obfuscationGuard) {
        if (!this.poisoned &&
          !this.a(23072) &&
          this.maximumStrength > this.strength &&
          !this.movementSpent &&
          0 < this.attacksRemaining) {
          this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TurnEffectEvent(this, 1)));
        }
        if (0 < this.immobilizedTurns) {
          this.immobilizedTurns = this.immobilizedTurns - 1;
        }
        if (obfuscationGuard != -36) {
          this.modelPreview = (UnitModelPreview) null;
        }
        if (this.immobilizedTurns != 0) {
        } else {
          if (!this.h(obfuscationGuard - 13458)) {
            this.movementSpent = false;
          } else {
            this.movementSpent = true;
          }
          this.attacksRemaining = 1;
          this.packedFlag512 = false;
          if (74 == this.unitType) {
            this.attacksRemaining = 2;
          }
        }
    }

    final boolean f(byte param0) {
        if (param0 >= -99) {
          return true;
        }
        return 0 < (8 & bw.unitDefinitions[this.unitType][10]) ? true : false;
    }

    final String q(byte param0) {
        if (param0 <= 37) {
          this.copyDetached(true);
        }
        String var2 = new String(this.displayName);
        if (this.hasMovementFlag1(false)) {
          var2 = var2 + " " + og.field_r;
        }
        if (this.u(8)) {
          var2 = var2 + " " + fa.field_f;
        }
        return var2;
    }

    final boolean isDisplacedFromTile(int obfuscationGuard) {
        if (obfuscationGuard != 26440) {
          return true;
        }
        return this != this.battlefield.tiles[this.battlefield.mapWidth * this.tileY + this.tileX].occupant ? true : false;
    }

    final void z(int param0) {
        if (null != this.modelPreview) {
          if (this.unitType == 34) {
            this.modelPreview.setUnitType((byte) 115, 75);
          }
          if (this.unitType == 7) {
            this.modelPreview.setUnitType((byte) 77, 76);
          }
          this.modelPreview.selectAnimation(-23162, 0);
        }
        if (param0 != 10) {
          this.field_R = (int[]) null;
        }
    }

    final boolean o(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 98) {
          this.hasMovementTarget(-50);
        }
        stackIn_7_0 = (this.unitType == 73) || (this.accessoryType == 4);
        return stackIn_7_0;
    }

    final void setFacingAngle(int obfuscationGuard, int angle) {
        if (angle > -1 &&
          angle < 2048) {
          this.facingAngle = angle;
        }
        if (this.modelPreview != null) {
          this.modelPreview.setYaw(false, angle);
        }
        int var3 = 114 / ((-56 - obfuscationGuard) / 54);
    }

    public static void q(int param0) {
        field_T = null;
        field_n = null;
        if (param0 != -9480) {
          field_n = (String) null;
        }
        field_y = null;
    }

    final void removeFromBattlefield(int obfuscationGuard) {
        this.battlefield.tiles[this.battlefield.mapWidth * this.tileY + this.tileX].occupant = null;
        this.unlink(-100);
        this.battlefield.refreshTileEffectsNear(this.tileY, this.tileX, 0, 3);
        if (obfuscationGuard > -82) {
          field_y = (String) null;
        }
    }

    final boolean a(int param0) {
        boolean stackIn_4_0 = false;
        boolean stackIn_5_1 = false;
        boolean stackIn_9_0 = false;
        if (param0 != 23072) {
          this.statusEffectValue = -127;
        }
        stackIn_4_0 = this.meleeLifeSteal;
        stackIn_5_1 = ((256 & bw.unitDefinitions[this.unitType][10]) <= 0) ? false : true;
        stackIn_9_0 = (stackIn_4_0 | stackIn_5_1) && (!this.hasMovementFlag1(false));
        return stackIn_9_0;
    }

    public final void decodeTaggedField(int encodedLength, CipherPacketBuffer packet, String fieldName, byte obfuscationGuard) {
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 37) {
            this.packedFlag32 = false;
          }
          if (fieldName.equals("c")) {
            if (encodedLength <= 0) {
              return;
            }
            this.unitType = (int)tn.readTaggedInteger(false, encodedLength, packet);
          } else {
            if (fieldName.equals("o")) {
              if (encodedLength <= 0) {
                return;
              }
              this.ownerPlayer = (int)tn.readTaggedInteger(false, encodedLength, packet);
              return;
            }
            if (fieldName.equals("str")) {
              if (encodedLength > 0) {
                this.strength = (int)tn.readTaggedInteger(false, encodedLength, packet);
                return;
              }
            } else {
              if (fieldName.equals("max")) {
                if (encodedLength <= 0) {
                  return;
                }
                this.maximumStrength = (int)tn.readTaggedInteger(false, encodedLength, packet);
                return;
              }
              if (fieldName.equals("x")) {
                if (0 >= encodedLength) {
                  return;
                }
                this.tileX = (int)tn.readTaggedInteger(false, encodedLength, packet);
                return;
              }
              if (!fieldName.equals("y")) {
                if (fieldName.equals("mf")) {
                  if (encodedLength > 0) {
                    this.movementFlags = (int)tn.readTaggedInteger(false, encodedLength, packet);
                    return;
                  }
                } else {
                  if (fieldName.equals("nm")) {
                    if (0 >= encodedLength) {
                      return;
                    }
                    this.displayName = PortalLossCondition.a(packet, encodedLength, (byte) -122);
                    return;
                  }
                  if (fieldName.equals("tag")) {
                    if (encodedLength <= 0) {
                      return;
                    }
                    this.tag = (int)tn.readTaggedInteger(false, encodedLength, packet);
                    return;
                  }
                  if (fieldName.equals("obj")) {
                    if (encodedLength <= 0) {
                      return;
                    }
                    this.objectiveId = (int)tn.readTaggedInteger(false, encodedLength, packet);
                    return;
                  }
                  if (fieldName.equals("tnk")) {
                    if (encodedLength <= 0) {
                      return;
                    }
                    this.tankId = (int)tn.readTaggedInteger(false, encodedLength, packet);
                    return;
                  }
                }
              } else {
                if (encodedLength > 0) {
                  this.tileY = (int)tn.readTaggedInteger(false, encodedLength, packet);
                  return;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_47_0 = var5;
          stackIn_47_1 = new StringBuilder().append("jd.B(").append(encodedLength).append(',');
          if (packet == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
          if (fieldName == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void queueDeathOrRevival(int obfuscationGuard) {
        int var2 = 0;
        if (obfuscationGuard != 22331) {
          this.objectiveId = 111;
        }
        if (this.removedFromActivePlay) {
          return;
        }
        if (this.getEffectiveStrength((byte) 122) < 1) {
          this.removedFromActivePlay = true;
          var2 = -1;
          if (this.accessoryType == 5) {
            var2 = this.battlefield.a(this.tileY, this.ownerPlayer, this.tileX, (byte) -53);
          }
          if (var2 > -1) {
            this.battlefield.tiles[var2].field_l = true;
            this.battlefield.pendingEvents.addFirst(750, new RevivalEvent(this, var2 % this.battlefield.mapWidth, var2 / this.battlefield.mapWidth));
          } else {
            this.battlefield.pendingEvents.addFirst(750, new DeathEvent(this));
          }
        }
    }

    final boolean h(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -13494) {
          return false;
        }
        stackIn_6_0 = (34 == this.unitType) && (this.packedFlag8);
        return stackIn_6_0;
    }

    final void a(boolean param0, byte param1) {
        MapTile var3;
        int var4;
        int var5;
        MapTile var6;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.strength = 0;
        this.removedFromActivePlay = true;
        this.bonusStrength = 0;
        var6 = this.battlefield.tiles[this.tileX + this.battlefield.mapWidth * this.tileY];
        var3 = var6;
        var3.captureStrength = var6.getDefaultCaptureStrength(10);
        if (0 == this.unitType &&
          !this.packedFlag8) {
        }
        var4 = this.unitType;
        switch (var4) {
          case 53:
            this.battlefield.refreshTileEffectsNear(this.tileY, this.tileX, 0, 1);
            if (this.v(10)) {
              break;
            }
            if (!param0) {
              break;
            }
            var6.a(106);
            break;
          case 59:
            this.battlefield.refreshTileEffectsNear(this.tileY, this.tileX, 0, 1);
            if (this.v(10)) {
              break;
            }
            if (!param0) {
              break;
            }
            var6.a(106);
            break;
          default:
            if (this.v(10)) {
              break;
            }
            if (!param0) {
              break;
            }
            var6.a(106);
            break;
          case 63:
            this.battlefield.refreshTileEffectsNear(this.tileY, this.tileX, 0, 1);
            if (this.v(10)) {
              break;
            }
            if (!param0) {
              break;
            }
            var6.a(106);
            break;
          case 43:
          case 58:
            this.battlefield.refreshTileEffectsNear(this.tileY, this.tileX, 0, 1);
            if (!this.v(10) &&
              param0) {
              var6.a(106);
            }
            break;
        }
        if (this == var6.occupant) {
          var3.occupant = null;
        }
        this.unlink(39);
        if (param1 != 105) {
          this.field_X = false;
        }
        this.battlefield.refreshTileEffectsNear(this.tileY, this.tileX, 0, 3);
        if (this.hasMovementFlag1(false)) {
          this.battlefield.eliminatePlayerTeam((byte) 89, this.ownerPlayer);
        }
        if (this.battlefield.field_b) {
          this.battlefield.unitLossCounts[this.ownerPlayer] = this.battlefield.unitLossCounts[this.ownerPlayer] + 1;
        }
        this.battlefield.b(this.ownerPlayer, true);
    }

    final boolean s(int param0) {
        if (param0 < 123) {
          this.isSeaSlug((byte) -126);
        }
        return (32 & bw.unitDefinitions[this.unitType][10]) > 0 ? true : false;
    }

    final boolean hasMovementTarget(int obfuscationGuard) {
        boolean stackIn_9_0 = false;
        if (this.movementTargetX == this.tileX &&
          this.movementTargetY == this.tileY) {
          this.resetMovementTarget(-1);
        }
        if (obfuscationGuard != -28467) {
          this.packedFlag8 = false;
        }
        stackIn_9_0 = (this.movementTargetX != -1) && (this.movementTargetY != -1);
        return stackIn_9_0;
    }

    final int getUnitCategory(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          this.hasMovementTarget(82);
        }
        return bw.unitDefinitions[this.unitType][0];
    }

    final int getEquipmentId(byte obfuscationGuard) {
        if (obfuscationGuard != 81) {
          this.getEffectiveStrength((byte) -105);
        }
        if (0 > this.equipmentDescriptor) {
          return 0;
        }
        return 31 & this.equipmentDescriptor;
    }

    final boolean hasPoisonousAttacks(int obfuscationGuard) {
        if (obfuscationGuard > -92) {
          this.bonusStrength = -12;
        }
        return (64 & bw.unitDefinitions[this.unitType][10]) > 0 ? true : false;
    }

    final Unit copyDetached(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return (Unit) null;
        }
        return new Unit(this.tileX, this.tileY, this.unitType, this.ownerPlayer, this.maximumStrength, this.strength, this.packStatusFlags((byte) 110), this.accessoryType, this.bonusStrength, this.battlefield, this.statusEffectType, this.statusEffectValue, this.equipmentDescriptor, true, this.immobilizedTurns);
    }

    final int f(int param0) {
        if (this.unitType == 34 &&
          !this.packedFlag8) {
          return 0;
        }
        if (this.unitType == 39) {
          return 2;
        }
        if (param0 != 16) {
          this.tankId = -22;
        }
        if (this.unitType == 17) {
          return 1;
        }
        if (this.unitType == 72) {
          return 3;
        }
        if (7 == this.unitType &&
          !this.packedFlag8) {
          return 4;
        }
        return -1;
    }

    final void faceUnit(Unit targetUnit, int obfuscationGuard) {
        if (this.tileX == targetUnit.tileX &&
          this.tileY == targetUnit.tileY) {
          return;
        }
        try {
          this.setFacingAngle(obfuscationGuard ^ 2079, 256 + (obfuscationGuard - (int)(2048.0 * Math.atan2((double)(-(this.tileY - targetUnit.tileY)), (double)(this.tileX - targetUnit.tileX)) / 3.141592653589793 / 2.0)) & 2047);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "jd.HB(" + (targetUnit != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final boolean u(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 8) {
          Unit.i((byte) 14);
        }
        stackIn_6_0 = (0 != (this.movementFlags & 8)) && (this.strength >= this.maximumStrength);
        return stackIn_6_0;
    }

    final boolean isFlying(int obfuscationGuard) {
        if (obfuscationGuard >= -80) {
          Unit var3 = (Unit) null;
          this.faceUnit((Unit) null, -117);
        }
        return 4 == this.getUnitCategory(0) ? true : false;
    }

    final boolean r(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 <= 41) {
          return false;
        }
        stackIn_7_0 = (0 != (bw.unitDefinitions[this.unitType][10] & 4096)) || (this.accessoryType == 3);
        return stackIn_7_0;
    }

    final void queueTurnConsequences(int obfuscationGuard) {
        if (this.isJadeVine((byte) 102)) {
          this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new UpkeepEvent(this.tileX, this.tileY)));
        }
        if (this.p((byte) -128)) {
          this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new StateChangeEvent(2, this.tileX, this.tileY, this.ownerPlayer)));
        }
        if (this.d((byte) 105)) {
          this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new StateChangeEvent(3, this.tileX, this.tileY, this.ownerPlayer)));
        }
        if (this.f((byte) -116)) {
          this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new StateChangeEvent(1, this.tileX, this.tileY, this.ownerPlayer)));
        }
        if (obfuscationGuard != -1) {
          return;
        }
        if (this.s(124)) {
          this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new StateChangeEvent(4, this.tileX, this.tileY, this.ownerPlayer)));
        }
        if (this.isDisplacedFromTile(26440)) {
          this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TelefragEvent(this)));
        }
    }

    final int getMaximumAttackRange(int obfuscationGuard) {
        int var2;
        int var3;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = bw.unitDefinitions[this.unitType][7];
        if (this.packedFlag8 &&
          this.unitType == 34) {
          var2 = 7;
          if (this.getEquipmentCategory(20640) == 3) {
            var2 = var2 + this.getEquipmentProperty(1, -93);
          }
        }
        if ((this.unitType == 81 ||
          this.unitType == 4 ||
          this.unitType == 74) &&
          3 == this.getEquipmentCategory(20640)) {
          var2 = var2 + this.getEquipmentProperty(1, 83);
        } else if (3 == this.getUnitCategory(obfuscationGuard - 3257) &&
          this.getEquipmentCategory(20640) == 2) {
          var2 = var2 + this.getEquipmentProperty(1, obfuscationGuard - 3158);
        } else {
          if (this.getUnitCategory(0) == 2 &&
            this.getEquipmentCategory(20640) == 1) {
            var2 = var2 + this.getEquipmentProperty(1, 88);
          }
        }
        if (obfuscationGuard == 3257) {
          return var2;
        }
        return 117;
    }

    private final boolean v(int param0) {
        if (param0 != 10) {
          this.presentationOwnsModel = true;
        }
        return (bw.unitDefinitions[this.unitType][10] & 1) > 0 ? true : false;
    }

    final boolean grantsGrowthOnDeath(int obfuscationGuard) {
        if (obfuscationGuard != -40) {
          return true;
        }
        return this.unitType != 39 ? true : false;
    }

    final void resetMovementTarget(int targetX) {
        this.movementTargetX = targetX;
        this.movementTargetY = -1;
    }

    final boolean d(byte param0) {
        if (param0 != 105) {
          return true;
        }
        return (bw.unitDefinitions[this.unitType][10] & 16) > 0 ? true : false;
    }

    final static void m(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var8 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var1Lifetime1;
        int[] var1Lifetime2;
        int[] var1Lifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!io.a(rq.field_n, (byte) 108)) {
            return;
          }
          if (!OwnerChangeEvent.field_B) {
            return;
          }
          var17 = rq.field_n;
          var13 = var17;
          var6 = var13;
          var1 = var6;
          var24 = BoundedFile.field_e;
          for (var3 = 0; var3 < 8; var3++) {
            var6[var3] = rn.bitwiseAnd(var17[var3], ~var24[var3]);
          }
          for (var1_int = 0; var1_int < so.field_a.length; var1_int++) {
            if (rb.a(var1_int, rq.field_n, 1)) {
              ai.field_P.addLast((byte) -119, (IntrusiveNode) (new jg(var1_int)));
            }
          }
          var18 = BoundedFile.field_e;
          var14 = var18;
          var8 = var14;
          var1Lifetime1 = var8;
          var25 = rq.field_n;
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            var8[var3Lifetime1] = oe.bitwiseOr(var18[var3Lifetime1], var25[var3Lifetime1]);
          }
          var19 = ReportAbuseDialog.field_Nb;
          var15 = var19;
          var10 = var15;
          var1Lifetime2 = var10;
          var26 = rq.field_n;
          var3Lifetime2 = 0;
          var4 = 124 % ((-63 - param0) / 63);
          while (var3Lifetime2 < 8) {
            var10[var3Lifetime2] = oe.bitwiseOr(var19[var3Lifetime2], var26[var3Lifetime2]);
            var3Lifetime2++;
          }
          var20 = rq.field_n;
          var16 = var20;
          var12 = var16;
          var1Lifetime3 = var12;
          for (var2 = 0; var2 < 8; var2++) {
            var20[var2] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1_ref), "jd.VA(" + param0 + ')');
        }
    }

    final void refreshTileEffects(byte obfuscationGuard) {
        int var2 = 8 / ((19 - obfuscationGuard) / 34);
        this.battlefield.refreshUnitTileEffects(this, -97);
    }

    Unit(int tileX, int tileY, int unitType, int ownerPlayer, int maximumStrength, int strength, int packedStatusFlags, int accessoryType, int bonusStrength, Battlefield battlefield, int statusEffectType, int statusEffectValue, int equipmentDescriptor, boolean detached, int immobilizedTurns) {
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_16_1 = false;
        boolean stackIn_19_1 = false;
        boolean stackIn_22_1 = false;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        this.tag = 0;
        this.tankId = -1;
        this.movementTargetY = -1;
        this.movementTargetX = -1;
        this.objectiveId = 0;
        this.removedFromActivePlay = false;
        this.escortComplete = false;
        try {
          this.tileX = tileX;
          this.bonusStrength = bonusStrength;
          stackIn_4_1 = ((packedStatusFlags & 64) != 0);
          this.meleeLifeSteal = stackIn_4_1;
          this.attacksRemaining = 3 & packedStatusFlags;
          stackIn_7_1 = ((256 & packedStatusFlags) != 0);
          this.packedFlag256 = stackIn_7_1;
          this.equipmentDescriptor = equipmentDescriptor;
          stackIn_10_1 = ((packedStatusFlags & 4) != 0);
          this.movementSpent = stackIn_10_1;
          this.battlefield = battlefield;
          this.attacksMade = 0;
          this.maximumStrength = maximumStrength;
          this.attacksReceived = 0;
          this.immobilizedTurns = immobilizedTurns;
          this.unitType = unitType;
          this.accessoryType = accessoryType;
          stackIn_13_1 = (0 != (packedStatusFlags & 8));
          this.packedFlag8 = stackIn_13_1;
          stackIn_16_1 = ((512 & packedStatusFlags) != 0);
          this.packedFlag512 = stackIn_16_1;
          this.ownerPlayer = ownerPlayer;
          stackIn_19_1 = (0 != (packedStatusFlags & 32));
          this.packedFlag32 = stackIn_19_1;
          this.strength = strength;
          stackIn_22_1 = ((16 & packedStatusFlags) != 0);
          this.poisoned = stackIn_22_1;
          this.statusEffectValue = statusEffectValue;
          this.statusEffectType = statusEffectType;
          this.tileY = tileY;
          if (!detached) {
            battlefield.tiles[tileX + battlefield.mapWidth * tileY].occupant = this;
            this.refreshTileEffects((byte) -122);
          }
          this.modelAnimationIndex = -1;
          this.field_R = new int[3];
          this.facingAngle = 1792;
          if (0 == this.unitType &&
            this.packedFlag8) {
            this.displayName = ov.field_a;
            return;
          }
          if (this.unitType < ScrollContainer.unitDisplayNames.length) {
            this.displayName = ScrollContainer.unitDisplayNames[this.unitType];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_32_0 = var16;
          stackIn_32_1 = new StringBuilder().append("jd.<init>(").append(tileX).append(',').append(tileY).append(',').append(unitType).append(',').append(ownerPlayer).append(',').append(maximumStrength).append(',').append(strength).append(',').append(packedStatusFlags).append(',').append(accessoryType).append(',').append(bonusStrength).append(',');
          if (battlefield == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(statusEffectType).append(',').append(statusEffectValue).append(',').append(equipmentDescriptor).append(',').append(detached).append(',').append(immobilizedTurns).append(')').toString());
        }
    }

    Unit() {
        this.tag = 0;
        this.tankId = -1;
        this.movementTargetY = -1;
        this.movementTargetX = -1;
        this.objectiveId = 0;
        this.removedFromActivePlay = false;
        this.escortComplete = false;
    }

    Unit(int tileX, int tileY, int unitType) {
        this.tag = 0;
        this.tankId = -1;
        this.movementTargetY = -1;
        this.movementTargetX = -1;
        this.objectiveId = 0;
        this.removedFromActivePlay = false;
        this.escortComplete = false;
        this.tileY = tileY;
        this.tileX = tileX;
        this.unitType = unitType;
    }

    static {
        field_n = "Resizable";
        field_y = "Level:<nbsp><col=ff0000><%0></col>  Speed:<nbsp><col=ff0000><%1></col>  Strength:<nbsp><col=ff0000><%2></col>  Range:<nbsp><col=ff0000><%4></col>  Cost:<nbsp><col=ff0000><%5></col>";
        field_T = "This unit is already poisoned.";
    }
}
