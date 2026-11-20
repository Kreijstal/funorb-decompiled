/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToggleRepairModeOrderDefinition extends SpecialOrderDefinition {
    final int getShortcutKey(int param0) {
        if (param0 != -1) {
          return -91;
        }
        return SetSelfDestructActivateCooldown.field_o;
    }

    final boolean hidesReadyCount(byte param0) {
        if (param0 >= -104) {
          return false;
        }
        return true;
    }

    final int getActiveDuration(int param0) {
        if (param0 != -25131) {
          this.getActiveDuration(-64);
          return 256;
        }
        return 256;
    }

    final boolean requiresPrimaryPress(boolean param0) {
        if (param0) {
          return false;
        }
        return false;
    }

    final boolean allowsActivationWithoutReadyComponents(int param0) {
        if (param0 <= 63) {
          this.getCooldown((byte) 110);
          return true;
        }
        return true;
    }

    ToggleRepairModeOrderDefinition() {
    }

    final int getIconId(byte param0) {
        if (param0 <= 79) {
          return 89;
        }
        return 102;
    }

    final int getCooldown(byte param0) {
        if (param0 != 64) {
          this.allowsActivationWithoutReadyComponents(42);
          return 1;
        }
        return 1;
    }

    static {
    }
}
