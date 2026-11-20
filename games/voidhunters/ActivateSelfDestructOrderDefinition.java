/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ActivateSelfDestructOrderDefinition extends SpecialOrderDefinition {
    static int field_d;

    final int getIconId(byte param0) {
        if (param0 <= 79) {
          this.getShortcutKey(56);
          return 113;
        }
        return 113;
    }

    final int getActiveDuration(int param0) {
        if (param0 != -25131) {
          return 46;
        }
        return Particle.field_y;
    }

    final int getCooldown(byte param0) {
        if (param0 != 64) {
          return 5;
        }
        return Particle.field_e;
    }

    final int getShortcutKey(int param0) {
        if (param0 != -1) {
          this.getIconId((byte) -66);
          return GameKeyHandler.field_a;
        }
        return GameKeyHandler.field_a;
    }

    final boolean hidesReadyCount(byte param0) {
        if (param0 > -104) {
          return false;
        }
        return true;
    }

    ActivateSelfDestructOrderDefinition() {
    }

    final boolean requiresPrimaryPress(boolean param0) {
        if (param0) {
          return true;
        }
        return false;
    }

    static {
    }
}
