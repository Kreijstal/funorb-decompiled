/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiNoteMixer extends PcmStream {
    private MidiPcmStream midiStream;
    static String fullscreenFocusOrResolutionText;
    static boolean appletShutdownStarted;
    IntrusiveDeque notes;
    static int receivedSocialSettingLow;
    PcmStreamMixer fadingStreams;
    static int thirdPreviousPacketOpcode;

    public static void clearFullscreenFailureText(int methodGuard) {
        fullscreenFocusOrResolutionText = null;
        if (methodGuard != -1) {
            MidiNoteMixer.prepareLogoGlowRaster((byte) -81);
        }
    }

    final int getSchedulingCost() {
        return 0;
    }

    final void mixInto(int[] destination, int destinationOffset, int frameCount) {
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String destinationDescription = null;
        RuntimeException caughtMixFailure = null;
        int noteDestinationOffset = 0;
        RuntimeException mixFailure = null;
        int remainingNoteFrames = 0;
        MidiNote note = null;
        try {
          this.fadingStreams.mixInto(destination, destinationOffset, frameCount);
          note = (MidiNote) ((Object) this.notes.firstForIteration(0));
          while (note != null) {
            if (!this.midiStream.isNoteStreamAbsent(note, -1)) {
              noteDestinationOffset = destinationOffset;
              remainingNoteFrames = frameCount;
              while (true) {
                if (remainingNoteFrames <= note.framesUntilUpdate) {
                  this.mixNoteFrames(remainingNoteFrames, (byte) -69, remainingNoteFrames + noteDestinationOffset, destination, note, noteDestinationOffset);
                  note.framesUntilUpdate = note.framesUntilUpdate - remainingNoteFrames;
                  break;
                }
                this.mixNoteFrames(note.framesUntilUpdate, (byte) -37, noteDestinationOffset + remainingNoteFrames, destination, note, noteDestinationOffset);
                remainingNoteFrames = remainingNoteFrames - note.framesUntilUpdate;
                noteDestinationOffset = noteDestinationOffset + note.framesUntilUpdate;
                if (!this.midiStream.advanceNoteAndHandleCompletion(remainingNoteFrames, noteDestinationOffset, destination, note, false)) {
                  continue;
                }
                break;
              }
            }
            note = (MidiNote) ((Object) this.notes.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException mixParameterFailure) {
          caughtMixFailure = mixParameterFailure;
          mixFailure = caughtMixFailure;
          failureContextCause = mixFailure;
          failureContextBuilder = new StringBuilder().append("ad.C(");
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(destinationDescription).append(',').append(destinationOffset).append(',').append(frameCount).append(')').toString());
        }
    }

    private final void skipNoteFrames(int methodGuard, MidiNote note, int frameCount) {
        MidiPcmStream offsetOwner = null;
        MidiNote offsetNote = null;
        int offsetMethodGuard = 0;
        boolean loopEnabled;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String noteDescription = null;
        RuntimeException caughtSkipFailure = null;
        int phaseIncrement = 0;
        RuntimeException skipFailure = null;
        int framesToPhaseWrap = 0;
        try {
          if (((this.midiStream.channelFlags[note.channelIndex] & 4) != 0) &&
              (note.releaseEnvelopeTime < 0)) {
            phaseIncrement = this.midiStream.channelRetriggerPhaseRates[note.channelIndex] / AudioOutput.sampleRateHz;
            framesToPhaseWrap = (-note.retriggerPhaseFixed + (1048575 + phaseIncrement)) / phaseIncrement;
            note.retriggerPhaseFixed = 1048575 & note.retriggerPhaseFixed + frameCount * phaseIncrement;
            if (frameCount >= framesToPhaseWrap) {
              if (this.midiStream.channelSampleOffsets[note.channelIndex] == 0) {
                note.sampleStream = PcmSampleStream.createForSampleStep(note.pcmSample, note.sampleStream.getSampleStepMagnitude(), note.sampleStream.getTargetVolume(), note.sampleStream.getPan());
              } else {
                note.sampleStream = PcmSampleStream.createForSampleStep(note.pcmSample, note.sampleStream.getSampleStepMagnitude(), 0, note.sampleStream.getPan());
                offsetOwner = this.midiStream;
                offsetNote = (MidiNote) (note);
                offsetMethodGuard = -70;
                if (note.instrumentPatch.pitchOffsetsAndLoopFlag[note.keyNumber] >= 0) {
                  loopEnabled = false;
                } else {
                  loopEnabled = true;
                }
                ((MidiPcmStream) (Object) offsetOwner).applyNoteSampleOffset(offsetNote, (byte) offsetMethodGuard, loopEnabled);
              }
              if (note.instrumentPatch.pitchOffsetsAndLoopFlag[note.keyNumber] < 0) {
                note.sampleStream.setLoopCount(-1);
              }
              frameCount = note.retriggerPhaseFixed / phaseIncrement;
            }
          }
          if (methodGuard != -1) {
            return;
          }
          note.sampleStream.skipFrames(frameCount);
          return;
        } catch (java.lang.RuntimeException skipParameterFailure) {
          caughtSkipFailure = skipParameterFailure;
          skipFailure = caughtSkipFailure;
          failureContextCause = skipFailure;
          failureContextBuilder = new StringBuilder().append("ad.I(").append(methodGuard).append(',');
          if (note == null) {
            noteDescription = "null";
          } else {
            noteDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(noteDescription).append(',').append(frameCount).append(')').toString());
        }
    }

    final static void prepareLogoGlowRaster(byte methodGuard) {
        Sprite logoRenderRaster = null;
        Sprite logoSilhouette = null;
        int blurPass = 0;
        int clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
            if (methodGuard != -32) {
                appletShutdownStarted = false;
            }
            logoRenderRaster = new Sprite(540, 140);
            Geoblox.setRasterTarget(1, logoRenderRaster);
            TriangleRasterState.prepareTriangleClipFromRasterizer();
            SoftwareRasterizer.clearFramebuffer();
            DequeCursor.logoAnimationTick = 0;
            TextTemplateArgumentType.renderLogoMeshes((byte) -73);
            logoSilhouette = logoRenderRaster.copy();
            for (blurPass = 0; blurPass < 15; blurPass++) {
                logoSilhouette.drawSilhouette(-2, -2, 16777215);
                SoftwareRasterizer.blurRasterRegion(4, 4, 0, 0, 540, 140);
            }
            ProxySocketConnector.logoGlowRaster.setAsRasterTarget();
            logoRenderRaster.drawHalfSize(0, 0);
            RasterTargetRestoreSupport.restoreRasterTarget(true);
        } catch (RuntimeException glowPreparationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) glowPreparationFailure), "ad.H(" + methodGuard + ')');
        }
    }

    final void skipFrames(int frameCount) {
        int remainingNoteFrames;
        MidiNote note;
        this.fadingStreams.skipFrames(frameCount);
        note = (MidiNote) ((Object) this.notes.firstForIteration(0));
        while (note != null) {
          noteSkipCompletion: {
            if (!this.midiStream.isNoteStreamAbsent(note, -1)) {
              remainingNoteFrames = frameCount;
              while (remainingNoteFrames > note.framesUntilUpdate) {
                this.skipNoteFrames(-1, note, note.framesUntilUpdate);
                remainingNoteFrames = remainingNoteFrames - note.framesUntilUpdate;
                if (this.midiStream.advanceNoteAndHandleCompletion(remainingNoteFrames, 0, (int[]) null, note, false)) {
                  break noteSkipCompletion;
                }
              }
              this.skipNoteFrames(-1, note, remainingNoteFrames);
              note.framesUntilUpdate = note.framesUntilUpdate - remainingNoteFrames;
            }
          }
          note = (MidiNote) ((Object) this.notes.nextForIteration(1));
        }
    }

    final PcmStream nextChildStream() {
        MidiNote note;
        int clientControlFlowGuard;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        while (true) {
          note = (MidiNote) ((Object) this.notes.nextForIteration(1));
          if (note == null) {
            return null;
          }
          if (note.sampleStream != null) {
            return (PcmStream) ((Object) note.sampleStream);
          }
          continue;
        }
    }

    final PcmStream firstChildStream() {
        MidiNote note = (MidiNote) ((Object) this.notes.firstForIteration(0));
        if (note == null) {
            return null;
        }
        if (!(null == note.sampleStream)) {
            return (PcmStream) ((Object) note.sampleStream);
        }
        return this.nextChildStream();
    }

    private final void mixNoteFrames(int frameCount, byte methodGuard, int destinationEnd, int[] destination, MidiNote note, int destinationOffset) {
        MidiPcmStream offsetOwner = null;
        MidiNote offsetNote = null;
        int offsetMethodGuard = 0;
        boolean loopEnabled;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String destinationDescription = null;
        StringBuilder failureContextPrefix = null;
        String noteDescription = null;
        RuntimeException caughtMixFailure = null;
        int phaseIncrement = 0;
        RuntimeException mixFailure = null;
        int framesToPhaseWrap = 0;
        int fadeFrames = 0;
        int quarterPhaseFrames = 0;
        PcmSampleStream previousStream = null;
        try {
          if (((4 & this.midiStream.channelFlags[note.channelIndex]) != 0) &&
              (note.releaseEnvelopeTime < 0)) {
            phaseIncrement = this.midiStream.channelRetriggerPhaseRates[note.channelIndex] / AudioOutput.sampleRateHz;
            while (true) {
              framesToPhaseWrap = (-note.retriggerPhaseFixed + (phaseIncrement + 1048575)) / phaseIncrement;
              if (frameCount < framesToPhaseWrap) {
                note.retriggerPhaseFixed = note.retriggerPhaseFixed + frameCount * phaseIncrement;
                break;
              }
              note.sampleStream.mixInto(destination, destinationOffset, framesToPhaseWrap);
              frameCount = frameCount - framesToPhaseWrap;
              destinationOffset = destinationOffset + framesToPhaseWrap;
              note.retriggerPhaseFixed = note.retriggerPhaseFixed + (-1048576 + phaseIncrement * framesToPhaseWrap);
              fadeFrames = AudioOutput.sampleRateHz / 100;
              quarterPhaseFrames = 262144 / phaseIncrement;
              if (quarterPhaseFrames < fadeFrames) {
                fadeFrames = quarterPhaseFrames;
              }
              previousStream = note.sampleStream;
              if (this.midiStream.channelSampleOffsets[note.channelIndex] == 0) {
                note.sampleStream = PcmSampleStream.createForSampleStep(note.pcmSample, previousStream.getSampleStepMagnitude(), previousStream.getTargetVolume(), previousStream.getPan());
              } else {
                note.sampleStream = PcmSampleStream.createForSampleStep(note.pcmSample, previousStream.getSampleStepMagnitude(), 0, previousStream.getPan());
                offsetOwner = this.midiStream;
                offsetNote = (MidiNote) (note);
                offsetMethodGuard = -70;
                if (note.instrumentPatch.pitchOffsetsAndLoopFlag[note.keyNumber] >= 0) {
                  loopEnabled = false;
                } else {
                  loopEnabled = true;
                }
                ((MidiPcmStream) (Object) offsetOwner).applyNoteSampleOffset(offsetNote, (byte) offsetMethodGuard, loopEnabled);
                note.sampleStream.rampVolume(fadeFrames, previousStream.getTargetVolume());
              }
              if (note.instrumentPatch.pitchOffsetsAndLoopFlag[note.keyNumber] < 0) {
                note.sampleStream.setLoopCount(-1);
              }
              previousStream.fadeOutAndUnlink(fadeFrames);
              previousStream.mixInto(destination, destinationOffset, destinationEnd - destinationOffset);
              if (!previousStream.hasRemainingRampFrames()) {
                continue;
              }
              this.fadingStreams.addChildStream(previousStream);
              continue;
            }
          }
          if (methodGuard >= -26) {
            return;
          }
          note.sampleStream.mixInto(destination, destinationOffset, frameCount);
          return;
        } catch (java.lang.RuntimeException mixParameterFailure) {
          caughtMixFailure = mixParameterFailure;
          mixFailure = caughtMixFailure;
          failureContextCause = mixFailure;
          failureContextBuilder = new StringBuilder().append("ad.J(").append(frameCount).append(',').append(methodGuard).append(',').append(destinationEnd).append(',');
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          failureContextPrefix = ((StringBuilder) (Object) failureContextBuilder).append(destinationDescription).append(',');
          if (note == null) {
            noteDescription = "null";
          } else {
            noteDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextPrefix).append(noteDescription).append(',').append(destinationOffset).append(')').toString());
        }
    }

    MidiNoteMixer(MidiPcmStream midiStream) {
        this.notes = new IntrusiveDeque();
        this.fadingStreams = new PcmStreamMixer();
        try {
            this.midiStream = midiStream;
        } catch (RuntimeException noteMixerConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) noteMixerConstructionFailure), "ad.<init>(" + (midiStream != null ? "{...}" : "null") + ')');
        }
    }

    static {
        appletShutdownStarted = false;
        fullscreenFocusOrResolutionText = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        receivedSocialSettingLow = 2;
        thirdPreviousPacketOpcode = -1;
    }
}
