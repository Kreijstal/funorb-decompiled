/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MissileLauncherWeaponDefinition extends WeaponDefinition {
    static boolean field_b;

    final static Widget i(byte param0) {
        if (param0 >= -75) {
          field_b = true;
          return re.field_n.content;
        }
        return re.field_n.content;
    }

    final int getProjectileLifetime(byte param0) {
        int var2 = 70 / ((param0 + 48) / 43);
        return SetTorpedoEnergyUsed.field_q;
    }

    final int getProjectileType(int param0) {
        if (param0 != 0) {
          return -51;
        }
        return 6;
    }

    final static int a(int param0, byte param1) {
        if (param1 != -78) {
          MissileLauncherWeaponDefinition.a(-119, (byte) -85);
          if (param0 == 3) {
            return Particle.field_l * SetVariableActionFactory.field_a;
          }
          if (param0 == 12) {
            return Particle.field_l * SetVariableActionFactory.field_a;
          }
          return SetVariableActionFactory.field_a * Particle.field_l;
        }
        if (param0 == 3) {
          return Particle.field_l * SetVariableActionFactory.field_a;
        }
        if (param0 == 12) {
          return Particle.field_l * SetVariableActionFactory.field_a;
        }
        return SetVariableActionFactory.field_a * Particle.field_l;
    }

    final int getReloadTime(byte param0) {
        if (param0 < 0) {
          this.getAimArc(-118);
          return Particle.field_m;
        }
        return Particle.field_m;
    }

    final int getProjectileSpeed(byte param0) {
        if (param0 > -52) {
          return 120;
        }
        return ana.field_f;
    }

    final int getProjectileCount(boolean param0) {
        if (param0) {
          return -12;
        }
        return GetPlayerRepairAmount.field_o;
    }

    final int getFiringSoundId(boolean param0) {
        if (param0) {
          return -72;
        }
        return 39;
    }

    final int getProjectileVelocityRandomness(byte param0) {
        if (param0 >= -12) {
          field_b = true;
          return LoadSettings.field_s;
        }
        return LoadSettings.field_s;
    }

    final boolean aimsDirectlyAtTarget(boolean param0) {
        if (!param0) {
          this.aimsDirectlyAtTarget(false);
          return true;
        }
        return true;
    }

    final int getAimArc(int param0) {
        int var2 = -98 / ((7 - param0) / 47);
        return khb.field_c;
    }

    final int getAimSpeed(int param0) {
        if (param0 != 0) {
          return 125;
        }
        return GetMissileLauncherRandomness.field_p;
    }

    final int getEnergyCost(int param0) {
        if (param0 != 0) {
          field_b = false;
          return SetShipAimLines.field_q;
        }
        return SetShipAimLines.field_q;
    }

    MissileLauncherWeaponDefinition() {
    }

    static {
        field_b = false;
    }
}
