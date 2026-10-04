/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiNote extends IntrusiveNode {
    PcmSample pcmSample;
    static int keyboardEventFrameEndIndex;
    int releaseEnvelopeTime;
    int decayTime;
    int volumeEnvelopeIndex;
    int velocityVolumeScale;
    int releaseEnvelopeIndex;
    static int stagedIncomingPacketOpcode;
    int framesUntilUpdate;
    InstrumentPatch instrumentPatch;
    int basePitchFixed;
    int portamentoScale;
    PcmSampleStream sampleStream;
    int vibratoPhase;
    int channelIndex;
    int notePan;
    static int archiveLanguageId;
    int retriggerPhaseFixed;
    int keyGroup;
    int volumeEnvelopeTime;
    int ageUpdates;
    int keyNumber;
    int portamentoPitchDelta;
    static int recordsPerKindAndCategoryLimit;
    InstrumentEnvelope envelope;

    final static void releaseSessionInputAndCloseSocket(byte methodGuard) {
        int guardResidue = -125 / ((methodGuard - 56) / 54);
        FullscreenSupport.exitActiveFullscreen((byte) -90);
        if (null != MessageDialog.gameCanvas) {
            EntitySpawnSupport.detachCanvasInputListeners(-2, MessageDialog.gameCanvas);
            MidiPcmStream.detachKeyboardListener(-11099);
            ValidatedTextInputWidget.releasePointerListener(true);
            TextLayout.closeArchiveAndCacheServices((byte) -121);
            if (UsernameSuggestionsPanel.g(-88)) {
                CacheReference.outgoingSessionBuffer.writeCipherByte(1, (byte) -27);
                NanoFrameTimer.flushSessionWrites(-1, 0);
                Bzip2DecoderState.closeSessionSocket((byte) -126);
                return;
            }
            Bzip2DecoderState.closeSessionSocket((byte) -126);
            return;
        }
        MidiPcmStream.detachKeyboardListener(-11099);
        ValidatedTextInputWidget.releasePointerListener(true);
        TextLayout.closeArchiveAndCacheServices((byte) -121);
        if (!UsernameSuggestionsPanel.g(-88)) {
            Bzip2DecoderState.closeSessionSocket((byte) -126);
            return;
        }
        CacheReference.outgoingSessionBuffer.writeCipherByte(1, (byte) -27);
        NanoFrameTimer.flushSessionWrites(-1, 0);
        Bzip2DecoderState.closeSessionSocket((byte) -126);
    }

    final static void setPendingLoginUiAction(int action, boolean methodGuard) {
        if (methodGuard) {
            archiveLanguageId = 99;
            GzipInflater.pendingLoginUiAction = action;
            return;
        }
        GzipInflater.pendingLoginUiAction = action;
    }

    final void clearAudioReferences(int methodGuard) {
        this.sampleStream = null;
        this.envelope = null;
        if (methodGuard == -1) {
            this.pcmSample = null;
            this.instrumentPatch = null;
            return;
        }
        stagedIncomingPacketOpcode = 41;
        this.pcmSample = null;
        this.instrumentPatch = null;
    }

    MidiNote() {
    }

    static {
        keyboardEventFrameEndIndex = 0;
        stagedIncomingPacketOpcode = -1;
    }
}
