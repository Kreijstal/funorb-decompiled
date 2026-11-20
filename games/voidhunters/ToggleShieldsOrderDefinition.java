/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToggleShieldsOrderDefinition extends SpecialOrderDefinition {
    static String loginName;

    final boolean requiresPrimaryPress(boolean param0) {
        if (param0) {
          loginName = (String) null;
          return false;
        }
        return false;
    }

    final int getCooldown(byte param0) {
        if (param0 != 64) {
          ToggleShieldsOrderDefinition.clearSharedReferences(87);
          return Particle.field_w;
        }
        return Particle.field_w;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 104) {
          ToggleShieldsOrderDefinition.clearSharedReferences(122);
          loginName = null;
          return;
        }
        loginName = null;
    }

    ToggleShieldsOrderDefinition() {
    }

    final int getIconId(byte param0) {
        if (param0 < 79) {
          return -118;
        }
        return 104;
    }

    final int getShortcutKey(int param0) {
        if (param0 != -1) {
          loginName = (String) null;
          return GetSpinningBladeAimarc.field_r;
        }
        return GetSpinningBladeAimarc.field_r;
    }

    static {
    }
}
