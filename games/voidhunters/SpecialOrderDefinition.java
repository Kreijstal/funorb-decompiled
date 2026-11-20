/*
 * Decompiled by CFR-JS 0.4.0.
 */
class SpecialOrderDefinition {
    static boolean[] field_a;
    static String field_b;
    static String field_c;

    boolean hidesReadyCount(byte param0) {
        if (param0 >= -104) {
          field_c = (String) null;
          return false;
        }
        return false;
    }

    public static void clearSharedReferences(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 != -95) {
          SpecialOrderDefinition.clearSharedReferences((byte) 83);
        }
    }

    boolean allowsActivationWithoutReadyComponents(int param0) {
        if (param0 <= 63) {
          return false;
        }
        return false;
    }

    int getCooldown(byte param0) {
        if (param0 != 64) {
          this.getCooldown((byte) -115);
          return 10 * Particle.field_l;
        }
        return 10 * Particle.field_l;
    }

    int getActiveDuration(int param0) {
        if (param0 != -25131) {
          field_b = (String) null;
          return 0;
        }
        return 0;
    }

    boolean requiresPrimaryPress(boolean param0) {
        if (param0) {
          field_c = (String) null;
          return true;
        }
        return true;
    }

    int getIconId(byte param0) {
        if (param0 < 79) {
          return -77;
        }
        return 0;
    }

    int getShortcutKey(int param0) {
        if (param0 != -1) {
          field_b = (String) null;
          return -1;
        }
        return -1;
    }

    static {
        field_b = "wins";
        field_c = "Account created successfully!";
    }
}
