/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LaserWeaponDefinition extends WeaponDefinition {
    static String field_b;

    LaserWeaponDefinition() {
    }

    final int getProjectileCount(boolean param0) {
        if (param0) {
          this.getProjectileCount(true);
          return GetLaserBeamProjectileDamage.field_o;
        }
        return GetLaserBeamProjectileDamage.field_o;
    }

    final int getProjectileVelocityRandomness(byte param0) {
        if (param0 >= -12) {
          field_b = (String) null;
          return tea.field_b;
        }
        return tea.field_b;
    }

    final int getAimArc(int param0) {
        int var2 = 84 % ((param0 - 7) / 47);
        return SetPointDefenceLaserReload.field_q;
    }

    final static boolean isWordDelimiter(int param0, char param1) {
        if (param0 > -107) {
          LaserWeaponDefinition.a(-27, 5);
          if (param1 == 32) {
            return true;
          }
          if (40 != param1) {
            return param1 == 41 ? true : false;
          }
          return true;
        }
        if (param1 == 32) {
          return true;
        }
        if (40 == param1) {
          return true;
        }
        if (param1 != 41) {
          return false;
        }
        return true;
    }

    public static void clearSharedReferences(byte param0) {
        field_b = null;
        int var1 = -124 % ((param0 + 63) / 32);
    }

    final int getProjectileLifetime(byte param0) {
        int var2 = 106 % ((-48 - param0) / 43);
        return Particle.field_x;
    }

    final int getProjectileSpeed(byte param0) {
        if (param0 > -52) {
          this.getProjectileVelocityRandomness((byte) 55);
          return WorldFactory.field_a;
        }
        return WorldFactory.field_a;
    }

    final int getProjectileDamage(int param0) {
        if (param0 != 2769) {
          LaserWeaponDefinition.clearSharedReferences((byte) 112);
          return GetMissionTerrainNebulaProbability.field_p;
        }
        return GetMissionTerrainNebulaProbability.field_p;
    }

    final int getProjectileType(int param0) {
        if (param0 != 0) {
          field_b = (String) null;
          return 0;
        }
        return 0;
    }

    final int getEnergyCost(int param0) {
        if (param0 != 0) {
          field_b = (String) null;
          return SoftwareFaceAttachment.field_b;
        }
        return SoftwareFaceAttachment.field_b;
    }

    final int getAimSpeed(int param0) {
        if (param0 != 0) {
          this.getFiringSoundId(true);
          return GpuMaterialEffect.field_b;
        }
        return GpuMaterialEffect.field_b;
    }

    final static void a(int param0, int param1) {
        IsaacPacketBuffer var2 = null;
        IsaacPacketBuffer var2Lifetime1;
        if (param0 == 40) {
          var2 = RequestNewestBlackboxRecording.field_p;
          var2.writeIsaacByte(24335, param1);
          var2.writeByte(0, 2);
          var2.writeByte(0, 4);
          var2.writeByte(0, kua.a((byte) 75));
          return;
        }
        LaserWeaponDefinition.clearSharedReferences((byte) 62);
        var2Lifetime1 = RequestNewestBlackboxRecording.field_p;
        var2Lifetime1.writeIsaacByte(24335, param1);
        var2Lifetime1.writeByte(0, 2);
        var2Lifetime1.writeByte(0, 4);
        var2Lifetime1.writeByte(0, kua.a((byte) 75));
    }

    final int getFiringSoundId(boolean param0) {
        if (param0) {
          return 17;
        }
        return 31;
    }

    final int getReloadTime(byte param0) {
        if (param0 <= 0) {
          LaserWeaponDefinition.a(-4, 20);
          return SetSniperCannonAimspeed.field_o;
        }
        return SetSniperCannonAimspeed.field_o;
    }

    static {
        field_b = "Ship blueprint stored on server";
    }
}
