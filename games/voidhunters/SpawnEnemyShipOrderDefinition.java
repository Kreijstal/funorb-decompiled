/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpawnEnemyShipOrderDefinition extends SpecialOrderDefinition {
    static Widget field_d;
    static String field_e;
    static String field_f;
    static int field_g;

    final int getShortcutKey(int param0) {
        if (param0 != -1) {
          return -73;
        }
        return GetMomentOfInertiaPredivideDownshift.field_r;
    }

    final boolean requiresPrimaryPress(boolean param0) {
        if (param0) {
          field_g = 34;
          return true;
        }
        return true;
    }

    final int getIconId(byte param0) {
        if (param0 <= 79) {
          field_d = (Widget) null;
          return 109;
        }
        return 109;
    }

    final boolean hidesReadyCount(byte param0) {
        if (param0 > -104) {
          field_g = -68;
          return true;
        }
        return true;
    }

    public static void clearSharedReferences(int param0) {
        field_f = null;
        if (param0 != 109) {
          field_d = (Widget) null;
          field_e = null;
          field_d = null;
          return;
        }
        field_e = null;
        field_d = null;
    }

    final int getCooldown(byte param0) {
        if (param0 != 64) {
          this.hidesReadyCount((byte) -72);
          return Particle.field_t;
        }
        return Particle.field_t;
    }

    SpawnEnemyShipOrderDefinition() {
    }

    static {
        field_e = "Set up new unrated game";
    }
}
