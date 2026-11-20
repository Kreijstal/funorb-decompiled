/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SniperCannonWeaponDefinition extends WeaponDefinition {
    static String field_c;
    static dla field_b;

    final int getProjectileType(int param0) {
        if (param0 != 0) {
          return -53;
        }
        return 4;
    }

    public static void clearSharedReferences(int param0) {
        field_c = null;
        field_b = null;
        if (param0 > -27) {
          SniperCannonWeaponDefinition.clearSharedReferences(-69);
        }
    }

    final int getProjectileSpeed(byte param0) {
        if (param0 > -52) {
          return 7;
        }
        return GetMassDriverAimarc.field_o;
    }

    final int getProjectileLifetime(byte param0) {
        int var2 = -72 % ((-48 - param0) / 43);
        return SetAiFiringRangeUpshift.field_p;
    }

    SniperCannonWeaponDefinition() {
    }

    final int getAimArc(int param0) {
        int var2 = -102 / ((param0 - 7) / 47);
        return SetThrusterBindingBalanceThreshold.field_p;
    }

    final int getReloadTime(byte param0) {
        if (param0 <= 0) {
          return 27;
        }
        return SetLaserRandomness.field_q;
    }

    final int getFiringSoundId(boolean param0) {
        if (param0) {
          return -97;
        }
        return 42;
    }

    final int getAimSpeed(int param0) {
        if (param0 != 0) {
          field_b = (dla) null;
          return ArmSelfDestructOrderDefinition.field_e;
        }
        return ArmSelfDestructOrderDefinition.field_e;
    }

    final int getProjectileVelocityRandomness(byte param0) {
        if (param0 >= -12) {
          field_c = (String) null;
          return SetPhasedEnergyBeamPulseFadetime.field_o;
        }
        return SetPhasedEnergyBeamPulseFadetime.field_o;
    }

    final int getEnergyCost(int param0) {
        if (param0 != 0) {
          return 87;
        }
        return ShieldBehaviourFactory.field_a;
    }

    final int getProjectileCount(boolean param0) {
        if (param0) {
          this.getProjectileDamage(-21);
          return fj.field_b;
        }
        return fj.field_b;
    }

    final int getProjectileDamage(int param0) {
        if (param0 != 2769) {
          return -80;
        }
        return ArchiveRequest.field_m;
    }

    static {
        field_c = "Scale down map zone";
    }
}
