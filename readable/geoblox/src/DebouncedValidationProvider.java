/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedValidationProvider implements ValidationProvider {
    private long lastInputChangeMillis;
    static String notAchievedText;
    static boolean gameAssetsInitialized;
    static int commonUiSpriteArchiveId;
    static int archiveLoadStatus;

    final static void drawHalfBlendSolidSpan(int guard, int[] destinationPixels, int destinationIndex, int halfRgb, int pixelCount) {
        int[] destinationForReadAndWrite = null;
        int destinationIndexForWrite = 0;
        int halfRgbForWrite = 0;
        int controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
            while (true) {
                pixelCount--;
                if (pixelCount < 0) {
                    break;
                }
                destinationForReadAndWrite = destinationPixels;
                int[] destinationAlias = destinationForReadAndWrite;
                destinationIndexForWrite = destinationIndex;
                halfRgbForWrite = halfRgb;
                destinationForReadAndWrite[destinationIndexForWrite] = halfRgbForWrite + ProxySocketConnector.andInt(destinationForReadAndWrite[destinationIndexForWrite] >> 1, 8355711);
                destinationIndex++;
            }
            int guardRemainder = -30 % ((-2 - guard) / 40);
        } catch (RuntimeException caughtSpanFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) caughtSpanFailure), "ib.AA(" + guard + ',' + (destinationPixels != null ? "{...}" : "null") + ',' + destinationIndex + ',' + halfRgb + ',' + pixelCount + ')');
        }
    }

    public static void releaseStaticReferences(boolean methodGuard) {
        notAchievedText = null;
        if (!methodGuard) {
            commonUiSpriteArchiveId = -26;
        }
    }

    public final String getDebouncedValidationMessage(int methodGuard) {
        if (this.isInputEmpty(-26556)) {
            return null;
        }
        if (ClientClockSupport.correctedCurrentTimeMillis(methodGuard ^ 25670) < 350L + this.lastInputChangeMillis) {
            return null;
        }
        if (methodGuard == -21666) {
            return this.currentValidationMessage((byte) -103);
        }
        return (String) null;
    }

    abstract String currentValidationMessage(byte guard);

    public final void resetValidationDelay(int methodGuard) {
        this.lastInputChangeMillis = ClientClockSupport.correctedCurrentTimeMillis(methodGuard ^ 23811);
        if (methodGuard != -28133) {
            archiveLoadStatus = 55;
        }
    }

    final static void writeHighscoreRequest(int packetOpcode, int requestType, HighscoreQuery query) {
        PacketBuffer outgoingPacket = null;
        try {
            outgoingPacket = CacheReference.outgoingSessionBuffer;
            outgoingPacket.writeCipherByte(packetOpcode, (byte) -82);
            outgoingPacket.writeByte((byte) 124, requestType);
            outgoingPacket.writeByte((byte) -66, 0);
            outgoingPacket.writeShortBE(query.queryId, 28695);
            outgoingPacket.writeByte((byte) -84, query.entryLimit);
            outgoingPacket.writeByte((byte) 125, query.valuesPerEntry);
        } catch (RuntimeException highscoreWriteFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) highscoreWriteFailure), "ib.DA(" + packetOpcode + ',' + requestType + ',' + (query != null ? "{...}" : "null") + ')');
        }
    }

    public final ValidationState getDebouncedValidationState(byte methodGuard) {
        if (methodGuard != -105) {
            archiveLoadStatus = -117;
            if (this.isInputEmpty(methodGuard ^ 26579)) {
                return ByteStorage.emptyInputValidationState;
            }
            if (~(350L + this.lastInputChangeMillis) >= ~ClientClockSupport.correctedCurrentTimeMillis(-12520)) {
                return this.currentValidationState(32);
            }
            return ImageProducerRasterBuffer.debouncingValidationState;
        }
        if (this.isInputEmpty(methodGuard ^ 26579)) {
            return ByteStorage.emptyInputValidationState;
        }
        if (~(350L + this.lastInputChangeMillis) >= ~ClientClockSupport.correctedCurrentTimeMillis(-12520)) {
            return this.currentValidationState(32);
        }
        return ImageProducerRasterBuffer.debouncingValidationState;
    }

    final static void showEmptyLoginForm(int methodGuard) {
        String unusedLoginText = (String) null;
        MessageDialog.showLoginForm("", (String) null, 7697781);
        if (methodGuard != 24107) {
            gameAssetsInitialized = false;
        }
    }

    abstract ValidationState currentValidationState(int guard);

    static {
        notAchievedText = "Not achieved";
    }
}
