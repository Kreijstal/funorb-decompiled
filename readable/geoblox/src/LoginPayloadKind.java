/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPayloadKind {
    static String field_e;
    static int field_a;
    int wireId;
    static int field_d;
    static String createPasswordText;

    public static void a(int param0) {
        createPasswordText = null;
        if (param0 <= 55) {
            return;
        }
        field_e = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    LoginPayloadKind(int wireId) {
        this.wireId = wireId;
    }

    final static void ensureAchievementStateRequested(int methodGuard) {
        if (methodGuard != 9313) {
            LoginPayloadKind.a(116);
            if (UnderlinedButtonRenderer.c(-114)) {
                return;
            }
            if (MouseWheelInput.achievementStateQuery == null) {
                MouseWheelInput.achievementStateQuery = AgeValidator.requestAchievementState(4, 94);
                return;
            }
            return;
        }
        if (UnderlinedButtonRenderer.c(-114)) {
            return;
        }
        if (MouseWheelInput.achievementStateQuery == null) {
            MouseWheelInput.achievementStateQuery = AgeValidator.requestAchievementState(4, 94);
            return;
        }
    }

    static {
        field_e = "Level: <%0>";
        field_d = 4;
        createPasswordText = "Password: ";
    }
}
