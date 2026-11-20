/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FireMissilesOrderDefinition extends SpecialOrderDefinition {
    final boolean requiresPrimaryPress(boolean param0) {
        if (param0) {
          return true;
        }
        return true;
    }

    final int getCooldown(byte param0) {
        if (param0 != 64) {
          FireMissilesOrderDefinition.a(-124, -42);
          return Particle.field_m;
        }
        return Particle.field_m;
    }

    FireMissilesOrderDefinition() {
    }

    final int getIconId(byte param0) {
        if (param0 < 79) {
          this.requiresPrimaryPress(false);
          return 105;
        }
        return 105;
    }

    final int getShortcutKey(int param0) {
        if (param0 != -1) {
          return -6;
        }
        return GetResourceNodeCaptureTime.field_o;
    }

    final static void a(int param0, int param1) {
        int var2 = -18 % ((param1 - 36) / 36);
        SetLaserEnergyUsed.field_p[4] = param0;
    }

    static {
    }
}
