/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SaveShipDesignOrderDefinition extends SpecialOrderDefinition {
    static String field_d;

    final int getCooldown(byte param0) {
        if (param0 != 64) {
          return -25;
        }
        return Particle.field_t;
    }

    final boolean hidesReadyCount(byte param0) {
        if (param0 >= -104) {
          this.hidesReadyCount((byte) -63);
          return true;
        }
        return true;
    }

    final int getIconId(byte param0) {
        if (param0 < 79) {
          field_d = (String) null;
          return 110;
        }
        return 110;
    }

    final boolean requiresPrimaryPress(boolean param0) {
        if (param0) {
          SaveShipDesignOrderDefinition.a(68, 42, true, -12, 65);
          return false;
        }
        return false;
    }

    final int getActiveDuration(int param0) {
        if (param0 != -25131) {
          return 46;
        }
        return 256;
    }

    SaveShipDesignOrderDefinition() {
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        if (OpenGlTexture1D.field_i) {
          feb.a(GetDebrisGroupColour.field_r, true).a(param4, param3, param0, param1, (byte) -45);
          if (!param2) {
            SaveShipDesignOrderDefinition.a(117, -125, true, -70, 61);
            return;
          }
          return;
        }
        SelectableIconLabelWidget.pushClip(param3, param1, param4, true, param0);
        if (!param2) {
          SaveShipDesignOrderDefinition.a(117, -125, true, -70, 61);
          return;
        }
    }

    final int getShortcutKey(int param0) {
        if (param0 != -1) {
          return 67;
        }
        return SetDetachmentMode.field_p;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 110) {
          SaveShipDesignOrderDefinition.clearSharedReferences(-110);
          field_d = null;
          return;
        }
        field_d = null;
    }

    static {
        field_d = "Music: ";
    }
}
