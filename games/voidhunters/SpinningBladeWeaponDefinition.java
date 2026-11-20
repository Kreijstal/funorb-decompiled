/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpinningBladeWeaponDefinition extends WeaponDefinition {
    static int[] field_b;

    final boolean hasRecoil(byte param0) {
        if (param0 <= 18) {
          field_b = (int[]) null;
          return false;
        }
        return false;
    }

    final int getProjectileLifetime(byte param0) {
        int var2 = -41 / ((-48 - param0) / 43);
        return 0;
    }

    final int getAimArc(int param0) {
        int var2 = 35 / ((param0 - 7) / 47);
        return SetLaserRandomness.field_o;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 8192) {
          return;
        }
        field_b = null;
    }

    SpinningBladeWeaponDefinition() {
    }

    final int getSpinUpSpeed(int param0) {
        if (param0 != 1024) {
          field_b = (int[]) null;
          return SetUseRectFill.field_p;
        }
        return SetUseRectFill.field_p;
    }

    final int getMaxSpinSpeed(byte param0) {
        if (param0 < 27) {
          this.getSpinUpSpeed(-17);
          return SetFps.field_p;
        }
        return SetFps.field_p;
    }

    final int getAimSpeed(int param0) {
        if (param0 != 0) {
          field_b = (int[]) null;
          return SetTorpedoFireForce.field_o;
        }
        return SetTorpedoFireForce.field_o;
    }

    static {
        field_b = new int[8192];
    }
}
