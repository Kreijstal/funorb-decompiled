/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArmSelfDestructOrderDefinition extends SpecialOrderDefinition {
    static int field_e;
    static String field_f;
    static String field_d;

    public static void clearSharedReferences(boolean param0) {
        if (param0) {
          ArmSelfDestructOrderDefinition.clearSharedReferences(false);
          field_d = null;
          field_f = null;
          return;
        }
        field_d = null;
        field_f = null;
    }

    final int getShortcutKey(int param0) {
        if (param0 != -1) {
          ArmSelfDestructOrderDefinition.clearSharedReferences(true);
          return GetPointDefenceLaserRandomness.field_p;
        }
        return GetPointDefenceLaserRandomness.field_p;
    }

    final int getIconId(byte param0) {
        if (param0 < 79) {
          this.getCooldown((byte) 75);
          return 112;
        }
        return 112;
    }

    final int getCooldown(byte param0) {
        if (param0 != 64) {
          field_e = -50;
          return Particle.field_o;
        }
        return Particle.field_o;
    }

    ArmSelfDestructOrderDefinition() {
    }

    final boolean hidesReadyCount(byte param0) {
        if (param0 > -104) {
          return true;
        }
        return true;
    }

    final boolean requiresPrimaryPress(boolean param0) {
        if (param0) {
          this.requiresPrimaryPress(true);
          return false;
        }
        return false;
    }

    static {
        field_e = 4;
        field_f = "Spawn enemy uber-ship at mouse";
        field_d = "You have 1 unread message!";
    }
}
