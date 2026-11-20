/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BombletSprayWeaponDefinition extends WeaponDefinition {
    static int field_b;
    static String field_c;

    final int getFiringSoundId(boolean param0) {
        if (param0) {
          return -106;
        }
        return 27;
    }

    final int getAimSpeed(int param0) {
        if (param0 != 0) {
          return -34;
        }
        return AccountRequestPhase.field_a;
    }

    final static void initializeCarouselMenuInput(boolean param0, byte param1) {
        SpriteArchiveDecoder.field_b = 0;
        SetBots.field_q = SetMachineGunEnergyUsed.field_p;
        SetSpecialOrderBoxWidth.field_o = 0;
        DialogMessagePanel.field_z = new MenuInputState(2);
        DialogMessagePanel.field_z.resetSelection(param0, param1 - 91, -1, GetGrapplingHookAimspeed.hitTestCarouselControl(param1 - 91, OpenGlFaceAttachment.field_b, PlayerGameData.field_b));
        if (param1 != 90) {
          BombletSprayWeaponDefinition.clearSharedReferences((byte) 38);
        }
    }

    final int getReloadTime(byte param0) {
        if (param0 < 0) {
          this.getProjectileCount(true);
          return SetMomentOfInertiaPerpointCalcDownshift.field_p;
        }
        return SetMomentOfInertiaPerpointCalcDownshift.field_p;
    }

    final int getProjectileVelocityRandomness(byte param0) {
        if (param0 > -12) {
          this.getProjectileCount(true);
          return GetSalvoRepairTimeMultiplier.field_o;
        }
        return GetSalvoRepairTimeMultiplier.field_o;
    }

    final int getProjectileLifetime(byte param0) {
        int var2 = 65 % ((param0 + 48) / 43);
        return GetReadyRoomMissionTime.field_p;
    }

    final int getProjectileType(int param0) {
        if (param0 != 0) {
          this.getProjectileDamage(34);
          return 2;
        }
        return 2;
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != 9) {
          field_c = (String) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final int getProjectileSpeed(byte param0) {
        if (param0 > -52) {
          BombletSprayWeaponDefinition.clearSharedReferences((byte) 119);
          return GetMachineGunAimspeed.field_p;
        }
        return GetMachineGunAimspeed.field_p;
    }

    final int getAimArc(int param0) {
        int var2 = -1 % ((param0 - 7) / 47);
        return BombletSprayAimArcSetting.aimArc;
    }

    final int getProjectileDamage(int param0) {
        if (param0 != 2769) {
          this.getEnergyCost(71);
          return GetMissionTerrainAsteroidProbability.field_o;
        }
        return GetMissionTerrainAsteroidProbability.field_o;
    }

    final int getEnergyCost(int param0) {
        if (param0 != 0) {
          BombletSprayWeaponDefinition.clearSharedReferences((byte) 50);
          return QuickChatCategoryDefinition.field_o;
        }
        return QuickChatCategoryDefinition.field_o;
    }

    BombletSprayWeaponDefinition() {
    }

    final int getProjectileCount(boolean param0) {
        if (param0) {
          return -32;
        }
        return LegacyOpenGlUnderwaterEffect.field_m;
    }

    static {
        field_b = 10;
        field_c = "SPAWN";
    }
}
