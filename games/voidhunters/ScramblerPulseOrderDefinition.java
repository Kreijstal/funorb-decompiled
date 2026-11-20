/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScramblerPulseOrderDefinition extends SpecialOrderDefinition {
    static String field_d;

    final int getIconId(byte param0) {
        if (param0 < 79) {
          return -43;
        }
        return 108;
    }

    final boolean requiresPrimaryPress(boolean param0) {
        if (param0) {
          this.getShortcutKey(-39);
          return false;
        }
        return false;
    }

    ScramblerPulseOrderDefinition() {
    }

    final int getCooldown(byte param0) {
        if (param0 != 64) {
          field_d = (String) null;
          return Particle.field_a;
        }
        return Particle.field_a;
    }

    final int getShortcutKey(int param0) {
        if (param0 != -1) {
          return 56;
        }
        return ModelData.field_h;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 108) {
          field_d = (String) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    static {
        field_d = "Confirm Password: ";
    }
}
