/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPayloadKind {
    static String levelTextTemplate;
    static int rankedSortLowerBoundValue;
    int wireId;
    static int sixMatchChainAchievementId;
    static String createPasswordText;

    public static void releaseStaticReferences(int methodGuard) {
        createPasswordText = null;
        if (methodGuard <= 55) {
            return;
        }
        levelTextTemplate = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    LoginPayloadKind(int wireId) {
        this.wireId = wireId;
    }

    final static void ensureAchievementStateRequested(int methodGuard) {
        if (methodGuard != 9313) {
            LoginPayloadKind.releaseStaticReferences(116);
            if (UnderlinedButtonRenderer.isGuestSessionMode(-114)) {
                return;
            }
            if (MouseWheelInput.achievementStateQuery == null) {
                MouseWheelInput.achievementStateQuery = AgeValidator.requestAchievementState(4, 94);
                return;
            }
            return;
        }
        if (UnderlinedButtonRenderer.isGuestSessionMode(-114)) {
            return;
        }
        if (MouseWheelInput.achievementStateQuery == null) {
            MouseWheelInput.achievementStateQuery = AgeValidator.requestAchievementState(4, 94);
            return;
        }
    }

    static {
        levelTextTemplate = "Level: <%0>";
        sixMatchChainAchievementId = 4;
        createPasswordText = "Password: ";
    }
}
