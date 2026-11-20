/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginStage {
    final static boolean shouldSpawnNeutralAiFleets(int param0, int param1) {
        if (param1 != 22681) {
          return false;
        }
        return false;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean isReceivingReplyOrLoggedIn(byte param0) {
        if (param0 != 98) {
          return true;
        }
        if (LegacyOpenGlShaderProgram.field_a == this) {
          return true;
        }
        if (UiFocusableComponent.readingAccountDetails == this) {
          return true;
        }
        if (this != GetOndamageParticleSpeed.loggedIn) {
          return false;
        }
        return true;
    }

    static {
    }
}
