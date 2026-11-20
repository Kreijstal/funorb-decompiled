/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MachineGunWeaponDefinition extends WeaponDefinition {
    static GameStateFactory field_d;
    static int field_b;
    static GameStateFactory field_c;

    final static void a(int param0, byte param1) {
        if (FlipTextureOperation.field_l != null) {
          FlipTextureOperation.field_l.sendDebugRequest((byte) 76, Integer.toString(param0), RequestNewestBlackboxRecording.field_p);
          if (param1 != 47) {
            MachineGunWeaponDefinition.a(112, (byte) -50);
            return;
          }
          return;
        }
        if (param1 == 47) {
          return;
        }
        MachineGunWeaponDefinition.a(112, (byte) -50);
    }

    final int getProjectileDamage(int param0) {
        if (param0 != 2769) {
          return 45;
        }
        return ServerInfo.field_f;
    }

    MachineGunWeaponDefinition() {
    }

    final int getFiringSoundId(boolean param0) {
        if (param0) {
          return -62;
        }
        return 31;
    }

    final int getEnergyCost(int param0) {
        if (param0 != 0) {
          field_c = (GameStateFactory) null;
          return OpenGlVertexNormal.field_g;
        }
        return OpenGlVertexNormal.field_g;
    }

    final static void b(int param0, byte param1) {
        if (param1 != 71) {
          return;
        }
        ActivateSelfDestructOrderDefinition.field_d = 3 & param0 >> 4;
        if (ActivateSelfDestructOrderDefinition.field_d > 2) {
          ActivateSelfDestructOrderDefinition.field_d = 2;
          GetThrusterSmallForce.field_p = (13 & param0) >> 2;
          GzipCodec.field_h = param0 & 3;
          if (GetThrusterSmallForce.field_p <= 2) {
            if (2 >= GzipCodec.field_h) {
              return;
            }
            GzipCodec.field_h = 2;
            return;
          }
          GetThrusterSmallForce.field_p = 2;
          if (2 < GzipCodec.field_h) {
            GzipCodec.field_h = 2;
            return;
          }
          return;
        }
        GetThrusterSmallForce.field_p = (13 & param0) >> 2;
        GzipCodec.field_h = param0 & 3;
        if (GetThrusterSmallForce.field_p > 2) {
          GetThrusterSmallForce.field_p = 2;
          if (2 >= GzipCodec.field_h) {
            return;
          }
          GzipCodec.field_h = 2;
          return;
        }
        if (2 >= GzipCodec.field_h) {
          return;
        }
        GzipCodec.field_h = 2;
    }

    public static void clearSharedReferences(int param0) {
        field_c = null;
        if (param0 != 3) {
          MachineGunWeaponDefinition.b(-77, (byte) 54);
          field_d = null;
          return;
        }
        field_d = null;
    }

    final int getProjectileVelocityRandomness(byte param0) {
        if (param0 >= -12) {
          return -116;
        }
        return SelectableIconLabelWidget.field_yb;
    }

    final int getProjectileSpeed(byte param0) {
        if (param0 > -52) {
          return -3;
        }
        return TextFieldValidator.field_e;
    }

    final boolean hasSustainedPulse(int param0) {
        if (param0 != 1024) {
          field_b = 100;
          return true;
        }
        return true;
    }

    final int getProjectileCount(boolean param0) {
        if (param0) {
          field_b = 40;
          return uab.field_b;
        }
        return uab.field_b;
    }

    final int getProjectileLifetime(byte param0) {
        int var2 = -79 % ((-48 - param0) / 43);
        return 1;
    }

    final int getAimArc(int param0) {
        int var2 = -115 / ((param0 - 7) / 47);
        return PlayerReady.field_c;
    }

    final boolean hasRecoil(byte param0) {
        if (param0 < 18) {
          return true;
        }
        return false;
    }

    final int getProjectileType(int param0) {
        if (param0 != 0) {
          this.hasRecoil((byte) 56);
          return 3;
        }
        return 3;
    }

    final int getPulseDuration(byte param0) {
        int var2 = -97 % ((param0 - 75) / 46);
        return GetTorqueDownshift.field_o;
    }

    final int getReloadTime(byte param0) {
        if (param0 < 0) {
          this.getProjectileCount(true);
          return SetSpinningBladeAimarc.field_o;
        }
        return SetSpinningBladeAimarc.field_o;
    }

    final int getAimSpeed(int param0) {
        if (param0 != 0) {
          field_c = (GameStateFactory) null;
          return ChatInputResetter.field_a;
        }
        return ChatInputResetter.field_a;
    }

    static {
        field_d = (GameStateFactory) ((Object) new MapClearanceCircleFactory());
        field_b = 0;
        field_c = (GameStateFactory) ((Object) new NebulaFactory());
    }
}
