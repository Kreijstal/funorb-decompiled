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
    static String sessionCookieOverride;
    int points;
    static UsernameAvailabilityQuery pendingUsernameResult;

    final static void disposeGameAudioOutputs(int methodGuard) {
        if (methodGuard <= 65) {
            return;
        }
        if (CacheReference.gameMusicOutput == null) {
            if (null != ClientScreenExitSupport.gameSoundOutput) {
                ClientScreenExitSupport.gameSoundOutput.dispose();
            }
            return;
        }
        CacheReference.gameMusicOutput.dispose();
        if (null != ClientScreenExitSupport.gameSoundOutput) {
            ClientScreenExitSupport.gameSoundOutput.dispose();
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        pendingUsernameResult = null;
        if (methodGuard != -40) {
            return;
        }
        sessionCookieOverride = null;
    }

    final static void setAvatarNegativeRotationSteering(byte methodGuard) {
        FullscreenSupport.avatarSteeringDirectionId = 1;
        if (methodGuard != 38) {
            ScorePopup.releaseStaticReferences((byte) -26);
        }
    }

    final static void decodePackedRankedEntry(int methodGuard, ByteArrayBuffer buffer) {
        int packedComponentByte = 0;
        int packedComponentByteLiteralPhase1;
        int packedComponentByteLiteralPhase2;
        try {
            StatefulWidgetRenderer.decodedRankedRatioNumerator = buffer.readUnsignedShortBE(true) << 5;
            packedComponentByte = buffer.readUnsignedByte((byte) 34);
            StatefulWidgetRenderer.decodedRankedRatioNumerator = StatefulWidgetRenderer.decodedRankedRatioNumerator + (packedComponentByte >> 3);
            EmailAvailabilityQuery.decodedRankedRatioSecondComponent = packedComponentByte << 18 & 1835008;
            EmailAvailabilityQuery.decodedRankedRatioSecondComponent = EmailAvailabilityQuery.decodedRankedRatioSecondComponent + (buffer.readUnsignedShortBE(true) << 2);
            packedComponentByteLiteralPhase1 = buffer.readUnsignedByte((byte) 34);
            if (methodGuard <= 105) {
                ScorePopup.setAvatarNegativeRotationSteering((byte) 114);
            }
            GzipInflater.decodedRankedRatioThirdComponent = packedComponentByteLiteralPhase1 << 15 & 2064384;
            EmailAvailabilityQuery.decodedRankedRatioSecondComponent = EmailAvailabilityQuery.decodedRankedRatioSecondComponent + (packedComponentByteLiteralPhase1 >> 6);
            GzipInflater.decodedRankedRatioThirdComponent = GzipInflater.decodedRankedRatioThirdComponent + (buffer.readUnsignedByte((byte) 34) << 7);
            packedComponentByteLiteralPhase2 = buffer.readUnsignedByte((byte) 34);
            GzipInflater.decodedRankedRatioThirdComponent = GzipInflater.decodedRankedRatioThirdComponent + (packedComponentByteLiteralPhase2 >> 1);
            HighscoreNameEntry.decodedRankedKeyTwo = (packedComponentByteLiteralPhase2 & 1) << 16;
            HighscoreNameEntry.decodedRankedKeyTwo = HighscoreNameEntry.decodedRankedKeyTwo + buffer.readUnsignedShortBE(true);
        } catch (RuntimeException decodeFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) decodeFailure), "me.B(" + methodGuard + ',' + (buffer != null ? "{...}" : "null") + ')');
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
