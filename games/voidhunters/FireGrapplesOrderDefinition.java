/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FireGrapplesOrderDefinition extends SpecialOrderDefinition {
    static int[] field_e;
    static int field_d;

    final boolean requiresPrimaryPress(boolean param0) {
        if (param0) {
          FireGrapplesOrderDefinition.clearSharedReferences(-108);
          return true;
        }
        return true;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != -3408) {
          FireGrapplesOrderDefinition.clearSharedReferences(-105);
          field_e = null;
          return;
        }
        field_e = null;
    }

    final boolean allowsActivationWithoutReadyComponents(int param0) {
        if (param0 < 63) {
          return false;
        }
        return true;
    }

    FireGrapplesOrderDefinition() {
    }

    final int getIconId(byte param0) {
        if (param0 <= 79) {
          field_d = 5;
          return 103;
        }
        return 103;
    }

    final int getShortcutKey(int param0) {
        if (param0 != -1) {
          this.getIconId((byte) 92);
          return SetMassDriverAimarc.field_o;
        }
        return SetMassDriverAimarc.field_o;
    }

    final int getCooldown(byte param0) {
        if (param0 != 64) {
          FireGrapplesOrderDefinition.clearSharedReferences(64);
          return Particle.field_t;
        }
        return Particle.field_t;
    }

    static {
        field_e = new int[4];
    }
}
