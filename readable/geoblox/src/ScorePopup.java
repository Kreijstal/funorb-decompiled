/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScorePopup extends IntrusiveNode {
    float progress;
    int chainMultiplier;
    static int currentPacketOpcode;
    float originY;
    String pointsText;
    float originX;
    static String field_j;
    int points;
    static UsernameAvailabilityQuery pendingUsernameResult;

    final static void b(int param0) {
        if (param0 <= 65) {
            return;
        }
        if (CacheReference.gameMusicOutput == null) {
            if (!(null == ClientScreenExitSupport.gameSoundOutput)) {
                ClientScreenExitSupport.gameSoundOutput.dispose();
            }
            return;
        }
        CacheReference.gameMusicOutput.dispose();
        if (!(null == ClientScreenExitSupport.gameSoundOutput)) {
            ClientScreenExitSupport.gameSoundOutput.dispose();
        }
    }

    public static void c(byte param0) {
        pendingUsernameResult = null;
        if (param0 != -40) {
            return;
        }
        field_j = null;
    }

    final static void setAvatarNegativeRotationSteering(byte methodGuard) {
        FullscreenSupport.avatarSteeringDirectionId = 1;
        if (methodGuard != 38) {
            ScorePopup.c((byte) -26);
        }
    }

    final static void a(int param0, ByteArrayBuffer param1) {
        int var2_int = 0;
        try {
            StatefulWidgetRenderer.field_v = param1.readUnsignedShortBE(true) << 5;
            var2_int = param1.readUnsignedByte((byte) 34);
            StatefulWidgetRenderer.field_v = StatefulWidgetRenderer.field_v + (var2_int >> 3);
            EmailAvailabilityQuery.field_b = var2_int << 18 & 1835008;
            EmailAvailabilityQuery.field_b = EmailAvailabilityQuery.field_b + (param1.readUnsignedShortBE(true) << 2);
            var2_int = param1.readUnsignedByte((byte) 34);
            if (param0 <= 105) {
                ScorePopup.setAvatarNegativeRotationSteering((byte) 114);
            }
            GzipInflater.field_g = var2_int << 15 & 2064384;
            EmailAvailabilityQuery.field_b = EmailAvailabilityQuery.field_b + (var2_int >> 6);
            GzipInflater.field_g = GzipInflater.field_g + (param1.readUnsignedByte((byte) 34) << 7);
            var2_int = param1.readUnsignedByte((byte) 34);
            GzipInflater.field_g = GzipInflater.field_g + (var2_int >> 1);
            HighscoreNameEntry.unusedGuardScratch = (var2_int & 1) << 16;
            HighscoreNameEntry.unusedGuardScratch = HighscoreNameEntry.unusedGuardScratch + param1.readUnsignedShortBE(true);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "me.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ScorePopup() {
        this.progress = 0.0f;
        this.points = 0;
    }

    static {
        currentPacketOpcode = -1;
    }
}
