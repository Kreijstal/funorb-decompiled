/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PhasedEnergyBeamWeaponDefinition extends WeaponDefinition {
    static String field_b;
    static String field_c;

    final int getPulseDuration(byte param0) {
        int var2 = 3 / ((75 - param0) / 46);
        return SetGrapplingHookMaxLength.field_p;
    }

    final int getReloadTime(byte param0) {
        if (param0 < 0) {
          return 126;
        }
        return MissionEvent.field_a;
    }

    final int getPulseFadeTime(byte param0) {
        if (param0 != -63) {
          return 85;
        }
        return ea.field_j;
    }

    final int getFiringSoundId(boolean param0) {
        if (param0) {
          field_c = (String) null;
          return 31;
        }
        return 31;
    }

    final int getProjectileVelocityRandomness(byte param0) {
        if (param0 > -12) {
          field_b = (String) null;
          return SelectableIconLabelWidget.field_yb;
        }
        return SelectableIconLabelWidget.field_yb;
    }

    final int getProjectileDamage(int param0) {
        if (param0 != 2769) {
          this.getAimArc(-10);
          return TickClock.field_a;
        }
        return TickClock.field_a;
    }

    final int getProjectileSpeed(byte param0) {
        if (param0 >= -52) {
          field_b = (String) null;
          return wja.field_b;
        }
        return wja.field_b;
    }

    final boolean hasRecoil(byte param0) {
        if (param0 < 18) {
          field_c = (String) null;
          return false;
        }
        return false;
    }

    final int getProjectileType(int param0) {
        if (param0 != 0) {
          field_b = (String) null;
          return 3;
        }
        return 3;
    }

    final static void l(int param0) {
        lw.field_i = new Widget(0L, (Widget) null);
        if (GetGrapplingHooksDamageableBySourcePlayer.field_o) {
          lw.field_i.addChild(-561, DialogMessagePanel.field_v);
          lw.field_i.addChild(param0 ^ -9108, DualLinkNode.field_f);
          lc.field_b = new bs(UnsupportedGpuMaterialEffect.field_e, lw.field_i);
          tb.field_a = new Widget(0L, (Widget) null);
          tb.field_a.addChild(param0 ^ -9108, lc.field_b.field_a);
          tb.field_a.addChild(-561, SpawnChoiceFactory.field_c);
          SetGrapplingHookMinLength.a(5);
          if (param0 != 8611) {
            PhasedEnergyBeamWeaponDefinition.clearSharedReferences((byte) -29);
            return;
          }
          return;
        }
        lw.field_i.addChild(param0 ^ -9108, DualLinkNode.field_f);
        lc.field_b = new bs(UnsupportedGpuMaterialEffect.field_e, lw.field_i);
        tb.field_a = new Widget(0L, (Widget) null);
        tb.field_a.addChild(param0 ^ -9108, lc.field_b.field_a);
        tb.field_a.addChild(-561, SpawnChoiceFactory.field_c);
        SetGrapplingHookMinLength.a(5);
        if (param0 == 8611) {
          return;
        }
        PhasedEnergyBeamWeaponDefinition.clearSharedReferences((byte) -29);
    }

    final int getEnergyCost(int param0) {
        if (param0 != 0) {
          this.hasRecoil((byte) 11);
          return bv.field_e;
        }
        return bv.field_e;
    }

    final int getAimArc(int param0) {
        int var2 = 32 % ((param0 - 7) / 47);
        return ConsoleCharacterStream.field_d;
    }

    PhasedEnergyBeamWeaponDefinition() {
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != -22) {
          return;
        }
        field_c = null;
        field_b = null;
    }

    final int getProjectileCount(boolean param0) {
        if (param0) {
          field_c = (String) null;
          return uab.field_b;
        }
        return uab.field_b;
    }

    final boolean hasSustainedPulse(int param0) {
        if (param0 != 1024) {
          return false;
        }
        return true;
    }

    final int getAimSpeed(int param0) {
        if (param0 != 0) {
          return -23;
        }
        return PlayerActionFactory.field_a;
    }

    final int getProjectileLifetime(byte param0) {
        int var2 = -8 / ((param0 + 48) / 43);
        return 1;
    }

    static {
        field_b = "Resign";
        field_c = "Reload game";
    }
}
