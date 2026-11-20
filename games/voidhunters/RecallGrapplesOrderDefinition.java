/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RecallGrapplesOrderDefinition extends SpecialOrderDefinition {
    static String[] field_e;
    static String field_d;

    public static void clearSharedReferences(int param0) {
        if (param0 < 56) {
          field_d = (String) null;
          field_d = null;
          field_e = null;
          return;
        }
        field_d = null;
        field_e = null;
    }

    final boolean allowsActivationWithoutReadyComponents(int param0) {
        if (param0 <= 63) {
          RecallGrapplesOrderDefinition.clearSharedReferences(-112);
          return true;
        }
        return true;
    }

    final int getCooldown(byte param0) {
        if (param0 != 64) {
          field_d = (String) null;
          return Particle.field_t;
        }
        return Particle.field_t;
    }

    RecallGrapplesOrderDefinition() {
    }

    final boolean requiresPrimaryPress(boolean param0) {
        if (param0) {
          field_d = (String) null;
          return false;
        }
        return false;
    }

    final int getIconId(byte param0) {
        if (param0 < 79) {
          field_d = (String) null;
          return 103;
        }
        return 103;
    }

    static {
        field_e = new String[16];
    }
}
