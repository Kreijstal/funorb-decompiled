/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiPcmStream extends PcmStream {
    private MidiNote[][] notesByKeyGroup;
    private int[] channelVolume;
    private MidiTrackReader midiReader;
    private int[] channelPan;
    int[] channelSampleOffsets;
    static boolean[] heldInternalKeys;
    static Sprite jewelsForegroundSprite;
    private int timeScalePerSecond;
    private int[] channelExpression;
    private IntrusiveNodeHashTable instrumentPatches;
    private MidiNote[][] heldNotesByKey;
    private int[] channelPitchBendSensitivity;
    int[] channelRetriggerPhaseRates;
    private int[] channelInstrumentIds;
    int[] channelFlags;
    private int[] channelVolumeScale;
    private int[] channelPortamentoTime;
    static int pendingActionPanelPhase;
    private int[] channelBankOffsets;
    private int masterVolume;
    private int[] channelPitchBend;
    private int[] channelModulation;
    static int[] queuedKeyboardEventCodes;
    private int[] channelRetriggerControl;
    static int[] lowBitMasks;
    private int[] defaultChannelInstrumentIds;
    private int[] channelSelectedParameter;
    private int nextEventTick;
    private MidiNoteMixer noteMixer;
    private boolean loopScore;
    private int nextTrackIndex;
    private long playbackTime;
    private long nextEventTime;
    private boolean pendingScoreFadeOutNotes;
    private MusicScore pendingScore;
    private int pendingScoreTick;

    final synchronized void mixInto(int[] destination, int destinationOffset, int frameCount) {
        int timeUnitsPerFrame = 0;
        long timeAfterFrames = 0L;
        int framesToEvent = 0;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String destinationDescription = null;
        RuntimeException caughtMixFailure = null;
        RuntimeException mixFailure = null;
        try {
          if (this.midiReader.isLoaded()) {
            timeUnitsPerFrame = this.midiReader.tickDivision * this.timeScalePerSecond / AudioOutput.sampleRateHz;
            while (true) {
              timeAfterFrames = (long)frameCount * (long)timeUnitsPerFrame + this.playbackTime;
              if (this.nextEventTime - timeAfterFrames >= 0L) {
                this.playbackTime = timeAfterFrames;
                break;
              }
              framesToEvent = (int)((-1L + this.nextEventTime - (this.playbackTime - (long)timeUnitsPerFrame)) / (long)timeUnitsPerFrame);
              this.playbackTime = this.playbackTime + (long)framesToEvent * (long)timeUnitsPerFrame;
              this.noteMixer.mixInto(destination, destinationOffset, framesToEvent);
              frameCount = frameCount - framesToEvent;
              destinationOffset = destinationOffset + framesToEvent;
              this.advanceMidiEvents((byte) 65);
              if (!this.midiReader.isLoaded()) {
                break;
              }
            }
          }
          this.noteMixer.mixInto(destination, destinationOffset, frameCount);
          return;
        } catch (java.lang.RuntimeException mixParameterFailure) {
          caughtMixFailure = mixParameterFailure;
          mixFailure = caughtMixFailure;
          failureContextCause = mixFailure;
          failureContextBuilder = new StringBuilder().append("kj.C(");
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(destinationDescription).append(',').append(destinationOffset).append(',').append(frameCount).append(')').toString());
        }
    }

    final synchronized int getSchedulingCost() {
        return 0;
    }

    private final void handleChannelPressureStub(int pressureValue, int methodGuard, int channelIndex) {
        if (methodGuard != -2832) {
            this.stopMusicPlayback(44);
        }
    }

    private final int computeNoteVolume(byte methodGuard, MidiNote note) {
        RuntimeException volumeFailure = null;
        int volume = 0;
        int guardResidue = 0;
        int volumeEnvelopeTime = 0;
        int volumeEnvelopeValue = 0;
        int volumeSegmentStartTime = 0;
        int volumeSegmentEndTime = 0;
        InstrumentEnvelope noteEnvelope = null;
        InstrumentEnvelope envelope = null;
        int zeroVolumeAtReturn = 0;
        int volumeAtReturn = 0;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String noteDescription = null;
        RuntimeException caughtVolumeFailure = null;
        int releaseEnvelopeTime;
        int releaseEnvelopeValue;
        int releaseSegmentStartTime;
        int releaseSegmentEndTime;
        try {
          if (this.channelVolumeScale[note.channelIndex] == 0) {
            zeroVolumeAtReturn = 0;
            return zeroVolumeAtReturn;
          }
          noteEnvelope = note.envelope;
          envelope = noteEnvelope;
          volume = this.channelVolume[note.channelIndex] * this.channelExpression[note.channelIndex] + 4096 >> 13;
          volume = volume * volume + 16384 >> 15;
          guardResidue = -83 % ((methodGuard - 44) / 55);
          volume = 16384 + volume * note.velocityVolumeScale >> 15;
          volume = 128 + volume * this.masterVolume >> 8;
          volume = volume * this.channelVolumeScale[note.channelIndex] + 128 >> 8;
          if (envelope.decayRate > 0) {
            volume = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)note.decayTime * (double)envelope.decayRate) * (double)volume);
          }
          if (null != envelope.volumeEnvelope) {
            volumeEnvelopeTime = note.volumeEnvelopeTime;
            volumeEnvelopeValue = envelope.volumeEnvelope[1 + note.volumeEnvelopeIndex];
            if (note.volumeEnvelopeIndex < envelope.volumeEnvelope.length - 2) {
              volumeSegmentStartTime = (noteEnvelope.volumeEnvelope[note.volumeEnvelopeIndex] & 255) << 8;
              volumeSegmentEndTime = (255 & envelope.volumeEnvelope[note.volumeEnvelopeIndex + 2]) << 8;
              volumeEnvelopeValue = volumeEnvelopeValue + (envelope.volumeEnvelope[note.volumeEnvelopeIndex + 3] - volumeEnvelopeValue) * (-volumeSegmentStartTime + volumeEnvelopeTime) / (volumeSegmentEndTime - volumeSegmentStartTime);
            }
            volume = volume * volumeEnvelopeValue + 32 >> 6;
          }
          if (note.releaseEnvelopeTime > 0 &&
              envelope.releaseEnvelope != null) {
            releaseEnvelopeTime = note.releaseEnvelopeTime;
            releaseEnvelopeValue = envelope.releaseEnvelope[1 + note.releaseEnvelopeIndex];
            if (-2 + envelope.releaseEnvelope.length > note.releaseEnvelopeIndex) {
              releaseSegmentStartTime = noteEnvelope.releaseEnvelope[note.releaseEnvelopeIndex] << 8 & 65280;
              releaseSegmentEndTime = envelope.releaseEnvelope[note.releaseEnvelopeIndex + 2] << 8 & 65280;
              releaseEnvelopeValue = releaseEnvelopeValue + (envelope.releaseEnvelope[note.releaseEnvelopeIndex + 3] - releaseEnvelopeValue) * (-releaseSegmentStartTime + releaseEnvelopeTime) / (-releaseSegmentStartTime + releaseSegmentEndTime);
            }
            volume = releaseEnvelopeValue * volume + 32 >> 6;
          }
          volumeAtReturn = volume;
          return volumeAtReturn;
        } catch (java.lang.RuntimeException volumeParameterFailure) {
          caughtVolumeFailure = volumeParameterFailure;
          volumeFailure = caughtVolumeFailure;
          failureContextCause = volumeFailure;
          failureContextBuilder = new StringBuilder().append("kj.KA(").append(methodGuard).append(',');
          if (note == null) {
            noteDescription = "null";
          } else {
            noteDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(noteDescription).append(')').toString());
        }
    }

    private final int computeNoteSampleStep(int methodGuard, MidiNote note) {
        int badGuardStepAtReturn = 0;
        int sampleStepAtReturn = 0;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String noteDescription = null;
        RuntimeException caughtStepFailure = null;
        int pitchFixed = 0;
        RuntimeException stepFailure = null;
        InstrumentEnvelope envelope = null;
        int vibratoDepth = 0;
        int vibratoRampUpdates = 0;
        double vibratoWave = 0.0;
        int computedSampleStep;
        try {
          pitchFixed = (note.portamentoPitchDelta * note.portamentoScale >> 12) + note.basePitchFixed;
          pitchFixed = pitchFixed + ((-8192 + this.channelPitchBend[note.channelIndex]) * this.channelPitchBendSensitivity[note.channelIndex] >> 12);
          envelope = note.envelope;
          if (0 < envelope.vibratoPhaseStep && (!(envelope.vibratoDepth <= 0) ||
              this.channelModulation[note.channelIndex] > 0)) {
            vibratoDepth = envelope.vibratoDepth << 2;
            vibratoRampUpdates = envelope.vibratoRampTicks << 1;
            if (vibratoRampUpdates > note.ageUpdates) {
              vibratoDepth = vibratoDepth * note.ageUpdates / vibratoRampUpdates;
            }
            vibratoDepth = vibratoDepth + (this.channelModulation[note.channelIndex] >> 7);
            vibratoWave = Math.sin(0.01227184630308513 * (double)(note.vibratoPhase & 511));
            pitchFixed = pitchFixed + (int)(vibratoWave * (double)vibratoDepth);
          }
          if (methodGuard <= 10) {
            badGuardStepAtReturn = -116;
            return badGuardStepAtReturn;
          }
          computedSampleStep = (int)((double)(256 * note.pcmSample.sampleRateHz) * Math.pow(2.0, 0.0003255208333333333 * (double)pitchFixed) / (double)AudioOutput.sampleRateHz + 0.5);
          sampleStepAtReturn = (computedSampleStep < 1) ? 1 : computedSampleStep;
          return sampleStepAtReturn;
        } catch (java.lang.RuntimeException stepParameterFailure) {
          caughtStepFailure = stepParameterFailure;
          stepFailure = caughtStepFailure;
          failureContextCause = stepFailure;
          failureContextBuilder = new StringBuilder().append("kj.N(").append(methodGuard).append(',');
          if (note == null) {
            noteDescription = "null";
          } else {
            noteDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(noteDescription).append(')').toString());
        }
    }

    final static void clearDecodedSpriteWorkingArrays(boolean clearRemainingArrays) {
        GmtTimestampSupport.decodedSpriteYOffsets = null;
        if (!clearRemainingArrays) {
            return;
        }
        ProgressBarWidget.decodedSpriteHeights = null;
        TextConcatenationSupport.decodedSpriteIndices = (byte[][]) null;
        DualLinkNode.decodedSpriteWidths = null;
        GameplaySession.decodedSpriteXOffsets = null;
        NanoFrameTimer.decodedSpritePalette = null;
    }

    private final void releaseUnmappedPortamentoNotes(byte methodGuard, int channelIndex) {
        MidiNote note = null;
        if (methodGuard != 39) {
            this.resetChannelControllers((byte) -85, -70);
        }
        if ((this.channelFlags[channelIndex] & 2) != 0) {
            note = (MidiNote) ((Object) this.noteMixer.notes.firstForIteration(0));
            while (note != null) {
                if (channelIndex == note.channelIndex && null == this.heldNotesByKey[channelIndex][note.keyNumber] && note.releaseEnvelopeTime < 0) {
                    note.releaseEnvelopeTime = 0;
                }
                note = (MidiNote) ((Object) this.noteMixer.notes.nextForIteration(1));
            }
        }
    }

    final boolean advanceNoteAndHandleCompletion(int remainingFrames, int destinationOffset, int[] destination, MidiNote note, boolean completionOrUnlinkFlag) {
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String destinationDescription = null;
        StringBuilder failureContextPrefix = null;
        String noteDescription = null;
        RuntimeException caughtUpdateFailure = null;
        int remainingPitchSlideScale = 0;
        RuntimeException updateFailure = null;
        InstrumentEnvelope envelope = null;
        int finishNoteInt = 0;
        double keyScalingExponent = 0.0;
        try {
          note.framesUntilUpdate = AudioOutput.sampleRateHz / 100;
          if (note.releaseEnvelopeTime >= 0 && (null == note.sampleStream ||
              note.sampleStream.isSamplePositionOutOfRange())) {
            note.clearAudioReferences(-1);
            note.unlinkNode(completionOrUnlinkFlag);
            if (0 < note.keyGroup &&
                note == this.notesByKeyGroup[note.channelIndex][note.keyGroup]) {
              this.notesByKeyGroup[note.channelIndex][note.keyGroup] = null;
              return true;
            }
            return true;
          }
          remainingPitchSlideScale = note.portamentoScale;
          if (0 < remainingPitchSlideScale) {
            remainingPitchSlideScale = remainingPitchSlideScale - (int)(0.5 + 16.0 * Math.pow(2.0, (double)this.channelPortamentoTime[note.channelIndex] * 0.0004921259842519685));
            if (0 > remainingPitchSlideScale) {
              remainingPitchSlideScale = 0;
            }
            note.portamentoScale = remainingPitchSlideScale;
          }
          note.sampleStream.setSampleStepMagnitude(this.computeNoteSampleStep(112, note));
          envelope = note.envelope;
          note.vibratoPhase = note.vibratoPhase + envelope.vibratoPhaseStep;
          note.ageUpdates = note.ageUpdates + 1;
          finishNoteInt = completionOrUnlinkFlag ? 1 : 0;
          keyScalingExponent = 0.000005086263020833333 * (double)((-60 + note.keyNumber << 8) + (note.portamentoPitchDelta * note.portamentoScale >> 12));
          if (envelope.decayRate > 0) {
            if (envelope.decayKeyScaling > 0) {
              note.decayTime = note.decayTime + (int)(128.0 * Math.pow(2.0, (double)envelope.decayKeyScaling * keyScalingExponent) + 0.5);
            } else {
              note.decayTime = note.decayTime + 128;
            }
            if (envelope.decayRate * note.decayTime >= 819200) {
              finishNoteInt = 1;
            }
          }
          if (envelope.volumeEnvelope != null) {
            if (envelope.volumeEnvelopeKeyScaling > 0) {
              note.volumeEnvelopeTime = note.volumeEnvelopeTime + (int)(0.5 + 128.0 * Math.pow(2.0, keyScalingExponent * (double)envelope.volumeEnvelopeKeyScaling));
            } else {
              note.volumeEnvelopeTime = note.volumeEnvelopeTime + 128;
            }
            while (note.volumeEnvelopeIndex < -2 + envelope.volumeEnvelope.length) {
              if ((65280 & envelope.volumeEnvelope[note.volumeEnvelopeIndex + 2] << 8) < note.volumeEnvelopeTime) {
                note.volumeEnvelopeIndex = note.volumeEnvelopeIndex + 2;
                continue;
              }
              break;
            }
            if (note.volumeEnvelopeIndex == -2 + envelope.volumeEnvelope.length &&
                envelope.volumeEnvelope[note.volumeEnvelopeIndex + 1] == 0) {
              finishNoteInt = 1;
            }
          }
          if (note.releaseEnvelopeTime >= 0 &&
            envelope.releaseEnvelope != null &&
            (this.channelFlags[note.channelIndex] & 1) == 0 && (!(0 <= note.keyGroup) ||
              note != this.notesByKeyGroup[note.channelIndex][note.keyGroup])) {
            if (0 < envelope.releaseEnvelopeKeyScaling) {
              note.releaseEnvelopeTime = note.releaseEnvelopeTime + (int)(0.5 + Math.pow(2.0, keyScalingExponent * (double)envelope.releaseEnvelopeKeyScaling) * 128.0);
            } else {
              note.releaseEnvelopeTime = note.releaseEnvelopeTime + 128;
            }
            while (-2 + envelope.releaseEnvelope.length > note.releaseEnvelopeIndex) {
              if (note.releaseEnvelopeTime > (envelope.releaseEnvelope[note.releaseEnvelopeIndex + 2] & 255) << 8) {
                note.releaseEnvelopeIndex = note.releaseEnvelopeIndex + 2;
                continue;
              }
              break;
            }
            if (-2 + envelope.releaseEnvelope.length == note.releaseEnvelopeIndex) {
              finishNoteInt = 1;
            }
          }
          if (finishNoteInt == 0) {
            note.sampleStream.rampVolumeAndPan(note.framesUntilUpdate, this.computeNoteVolume((byte) -79, note), this.computeNotePan(note, 761736646));
            return false;
          }
          note.sampleStream.fadeOutAndUnlink(note.framesUntilUpdate);
          if (destination == null) {
            note.sampleStream.skipFrames(remainingFrames);
          } else {
            note.sampleStream.mixInto(destination, destinationOffset, remainingFrames);
          }
          if (note.sampleStream.hasRemainingRampFrames()) {
            this.noteMixer.fadingStreams.addChildStream(note.sampleStream);
          }
          note.clearAudioReferences(-1);
          if (0 <= note.releaseEnvelopeTime) {
            note.unlinkNode(false);
            if (0 < note.keyGroup &&
                this.notesByKeyGroup[note.channelIndex][note.keyGroup] == note) {
              this.notesByKeyGroup[note.channelIndex][note.keyGroup] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException updateParameterFailure) {
          caughtUpdateFailure = updateParameterFailure;
          updateFailure = caughtUpdateFailure;
          failureContextCause = updateFailure;
          failureContextBuilder = new StringBuilder().append("kj.K(").append(remainingFrames).append(',').append(destinationOffset).append(',');
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
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextPrefix).append(noteDescription).append(',').append(completionOrUnlinkFlag).append(')').toString());
        }
    }

    private final void resetChannelRetriggerPhases(int channelIndex, byte methodGuard) {
        MidiNote note = null;
        if ((this.channelFlags[channelIndex] & 4) != 0) {
            note = (MidiNote) ((Object) this.noteMixer.notes.firstForIteration(0));
            while (note != null) {
                if (note.channelIndex == channelIndex) {
                    note.retriggerPhaseFixed = 0;
                }
                note = (MidiNote) ((Object) this.noteMixer.notes.nextForIteration(1));
            }
        }
        if (methodGuard != 67) {
            this.pendingScore = (MusicScore) null;
        }
    }

    final synchronized boolean prepareScoreInstruments(SoundSampleCache sampleCache, int sampleByteBudget, int methodGuard, MusicScore score, ResourceArchive patchArchive) {
        int allInstrumentsPreparedAtReturn = 0;
        RuntimeException preparationFailureBeforeDescription = null;
        StringBuilder preparationMessagePrefix = null;
        String sampleCacheDescription = null;
        StringBuilder messageBeforeScore = null;
        String scoreDescription = null;
        StringBuilder messageBeforePatchArchive = null;
        String patchArchiveDescription = null;
        RuntimeException caughtInstrumentPreparationFailure = null;
        int allInstrumentsPreparedFlag = 0;
        RuntimeException instrumentPreparationFailureForContext = null;
        Object remainingByteBudget = null;
        InstrumentNoteMask instrumentNoteMask = null;
        int instrumentId = 0;
        InstrumentPatch instrumentPatch = null;
        int clientControlSnapshot = 0;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          score.collectInstrumentNotes();
          allInstrumentsPreparedFlag = 1;
          remainingByteBudget = null;
          if (~sampleByteBudget < methodGuard) {
            remainingByteBudget = new int[]{sampleByteBudget};
          }
          instrumentNoteMask = (InstrumentNoteMask) ((Object) score.instrumentNoteMasks.firstForIteration((byte) 125));
          while (instrumentNoteMask != null) {
            instrumentId = (int)instrumentNoteMask.nodeKey;
            instrumentPatch = (InstrumentPatch) ((Object) this.instrumentPatches.findByKey((long)instrumentId, (byte) -91));
            if (instrumentPatch == null) {
              instrumentPatch = InstrumentPatch.loadInstrumentPatch(instrumentId, (byte) 121, patchArchive);
              if (instrumentPatch != null) {
                this.instrumentPatches.put((byte) 102, instrumentPatch, (long)instrumentId);
              } else {
                allInstrumentsPreparedFlag = 0;
              }
            }
            if (instrumentPatch != null &&
                !instrumentPatch.loadSelectedSamples((int[]) (remainingByteBudget), instrumentNoteMask.notesUsed, methodGuard + 36, sampleCache)) {
              allInstrumentsPreparedFlag = 0;
            }
            instrumentNoteMask = (InstrumentNoteMask) ((Object) score.instrumentNoteMasks.nextForIteration(methodGuard - 100));
          }
          if (allInstrumentsPreparedFlag != 0) {
            score.clearInstrumentNotes();
          }
          allInstrumentsPreparedAtReturn = allInstrumentsPreparedFlag;
          return allInstrumentsPreparedAtReturn != 0;
        } catch (java.lang.RuntimeException instrumentPreparationFailure) {
          caughtInstrumentPreparationFailure = instrumentPreparationFailure;
          instrumentPreparationFailureForContext = caughtInstrumentPreparationFailure;
          preparationFailureBeforeDescription = instrumentPreparationFailureForContext;
          preparationMessagePrefix = new StringBuilder().append("kj.T(");
          if (sampleCache == null) {
            sampleCacheDescription = "null";
          } else {
            sampleCacheDescription = "{...}";
          }
          messageBeforeScore = ((StringBuilder) (Object) preparationMessagePrefix).append(sampleCacheDescription).append(',').append(sampleByteBudget).append(',').append(methodGuard).append(',');
          if (score == null) {
            scoreDescription = "null";
          } else {
            scoreDescription = "{...}";
          }
          messageBeforePatchArchive = ((StringBuilder) (Object) messageBeforeScore).append(scoreDescription).append(',');
          if (patchArchive == null) {
            patchArchiveDescription = "null";
          } else {
            patchArchiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) preparationFailureBeforeDescription), ((StringBuilder) (Object) messageBeforePatchArchive).append(patchArchiveDescription).append(')').toString());
        }
    }

    private final void resetChannelControllers(byte methodGuard, int channelIndex) {
        if (channelIndex < 0) {
            for (channelIndex = 0; channelIndex < 16; channelIndex++) {
                this.resetChannelControllers((byte) -22, channelIndex);
            }
            return;
        }
        this.channelVolume[channelIndex] = 12800;
        this.channelPan[channelIndex] = 8192;
        this.channelExpression[channelIndex] = 16383;
        this.channelPitchBend[channelIndex] = 8192;
        this.channelModulation[channelIndex] = 0;
        this.channelPortamentoTime[channelIndex] = 8192;
        this.releaseUnmappedPortamentoNotes((byte) 39, channelIndex);
        this.resetChannelRetriggerPhases(channelIndex, (byte) 67);
        this.channelFlags[channelIndex] = 0;
        if (methodGuard >= -12) {
            this.nextEventTick = 55;
        }
        this.channelSelectedParameter[channelIndex] = 32767;
        this.channelPitchBendSensitivity[channelIndex] = 256;
        this.channelSampleOffsets[channelIndex] = 0;
        this.setChannelRetriggerControl(-112, 8192, channelIndex);
    }

    private final void setDefaultInstrumentAndBank(int methodGuard, int channelIndex, int instrumentId) {
        this.defaultChannelInstrumentIds[channelIndex] = instrumentId;
        this.channelBankOffsets[channelIndex] = ProxySocketConnector.andInt(instrumentId, -128);
        if (methodGuard != -8581) {
            this.channelPan = (int[]) null;
        }
        this.selectChannelInstrument(channelIndex, -129, instrumentId);
    }

    private final int computeNotePan(MidiNote note, int methodGuard) {
        int discardedBadGuardPan = 0;
        int channelPan = 0;
        RuntimeException panFailure = null;
        MidiNote unusedNullNoteBeforeBadGuardCall = null;
        int upperPanAtReturn = 0;
        int lowerPanAtReturn = 0;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String noteDescription = null;
        RuntimeException caughtPanFailure = null;
        try {
          channelPan = this.channelPan[note.channelIndex];
          if (methodGuard != 761736646) {
            unusedNullNoteBeforeBadGuardCall = (MidiNote) null;
            discardedBadGuardPan = this.computeNotePan((MidiNote) null, 124);
          }
          if (channelPan < 8192) {
            lowerPanAtReturn = channelPan * note.notePan + 32 >> 6;
            return lowerPanAtReturn;
          }
          upperPanAtReturn = 16384 - (32 + (128 - note.notePan) * (16384 - channelPan) >> 6);
          return upperPanAtReturn;
        } catch (java.lang.RuntimeException panParameterFailure) {
          caughtPanFailure = panParameterFailure;
          panFailure = caughtPanFailure;
          failureContextCause = panFailure;
          failureContextBuilder = new StringBuilder().append("kj.U(");
          if (note == null) {
            noteDescription = "null";
          } else {
            noteDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(noteDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void applyNoteSampleOffset(MidiNote note, byte methodGuard, boolean loopEnabled) {
        int sampleLengthOrFixedEnd = 0;
        int sampleOffsetFixed = 0;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String noteDescription = null;
        RuntimeException caughtOffsetFailure = null;
        RuntimeException offsetFailure = null;
        int reflectedLoopLength = 0;
        try {
          if (methodGuard != -70) {
            heldInternalKeys = (boolean[]) null;
          }
          sampleLengthOrFixedEnd = note.pcmSample.samples.length;
          if (loopEnabled &&
              note.pcmSample.pingPongLoop) {
            reflectedLoopLength = -note.pcmSample.loopStart + sampleLengthOrFixedEnd + sampleLengthOrFixedEnd;
            sampleLengthOrFixedEnd = sampleLengthOrFixedEnd << 8;
            sampleOffsetFixed = (int)((long)reflectedLoopLength * (long)this.channelSampleOffsets[note.channelIndex] >> 6);
            if (sampleLengthOrFixedEnd <= sampleOffsetFixed) {
              note.sampleStream.setReversePlayback(true);
              sampleOffsetFixed = -sampleOffsetFixed + (sampleLengthOrFixedEnd + sampleLengthOrFixedEnd) - 1;
            }
          } else {
            sampleOffsetFixed = (int)((long)sampleLengthOrFixedEnd * (long)this.channelSampleOffsets[note.channelIndex] >> 6);
          }
          note.sampleStream.setSamplePositionFixed(sampleOffsetFixed);
          return;
        } catch (java.lang.RuntimeException offsetParameterFailure) {
          caughtOffsetFailure = offsetParameterFailure;
          offsetFailure = caughtOffsetFailure;
          failureContextCause = offsetFailure;
          failureContextBuilder = new StringBuilder().append("kj.HA(");
          if (note == null) {
            noteDescription = "null";
          } else {
            noteDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(noteDescription).append(',').append(methodGuard).append(',').append(loopEnabled).append(')').toString());
        }
    }

    final synchronized PcmStream nextChildStream() {
        return null;
    }

    private final void releaseChannelNotes(int channelIndex, int methodGuard) {
        MidiNote note = (MidiNote) ((Object) this.noteMixer.notes.firstForIteration(methodGuard ^ methodGuard));
        while (note != null) {
            if ((channelIndex < 0 || channelIndex == note.channelIndex) &&
                !(note.releaseEnvelopeTime >= 0)) {
                this.heldNotesByKey[note.channelIndex][note.keyNumber] = null;
                note.releaseEnvelopeTime = 0;
            }
            note = (MidiNote) ((Object) this.noteMixer.notes.nextForIteration(1));
        }
    }

    private final void dispatchMidiEvent(int packedEvent, byte methodGuard) {
        int statusKind;
        int noteOffChannel;
        int noteOffKey;
        int noteOffReleaseVelocity;
        int dataEntryMsbParameterSelection;
        int noteOnChannel;
        int polyPressureChannel;
        int programChannel;
        int controllerChannel;
        int noteOnKey;
        int polyPressureKey;
        int programNumber;
        int controllerNumber;
        int noteOnVelocity;
        int polyPressureValue;
        int controllerValue;
        int dataEntryLsbParameterSelection;
        int channelPressureChannel;
        int pitchBendChannel;
        int channelPressureValue;
        int pitchBendValue;
        if (methodGuard != 38) {
          return;
        }
        statusKind = 240 & packedEvent;
        if (statusKind == 128) {
          noteOffChannel = packedEvent & 15;
          noteOffKey = (32542 & packedEvent) >> 8;
          noteOffReleaseVelocity = (packedEvent & 8361066) >> 16;
          this.releaseNote(23327, noteOffKey, noteOffReleaseVelocity, noteOffChannel);
          return;
        }
        if (statusKind == 144) {
          noteOnChannel = packedEvent & 15;
          noteOnKey = (32525 & packedEvent) >> 8;
          noteOnVelocity = 127 & packedEvent >> 16;
          if (noteOnVelocity > 0) {
            this.startNote(-1, noteOnChannel, noteOnVelocity, noteOnKey);
          } else {
            this.releaseNote(23327, noteOnKey, 64, noteOnChannel);
          }
          return;
        }
        if (statusKind == 160) {
          polyPressureChannel = 15 & packedEvent;
          polyPressureKey = packedEvent >> 8 & 127;
          polyPressureValue = (8370933 & packedEvent) >> 16;
          this.handlePolyphonicPressureStub(-40, polyPressureValue, polyPressureKey, polyPressureChannel);
          return;
        }
        if (statusKind != 176) {
          if (192 == statusKind) {
            programChannel = packedEvent & 15;
            programNumber = (32632 & packedEvent) >> 8;
            this.selectChannelInstrument(programChannel, methodGuard - 167, programNumber + this.channelBankOffsets[programChannel]);
            return;
          }
          if (statusKind == 208) {
            channelPressureChannel = packedEvent & 15;
            channelPressureValue = (32669 & packedEvent) >> 8;
            this.handleChannelPressureStub(channelPressureValue, methodGuard ^ -2858, channelPressureChannel);
            return;
          }
          if (statusKind == 224) {
            pitchBendChannel = packedEvent & 15;
            pitchBendValue = (packedEvent >> 9 & 16256) + ((32673 & packedEvent) >> 8);
            this.setChannelPitchBend(-108, pitchBendValue, pitchBendChannel);
            return;
          }
          statusKind = 255 & packedEvent;
          if (255 != statusKind) {
            return;
          }
          this.resetSynthesisState(true, methodGuard ^ 2097113);
          return;
        }
        controllerChannel = 15 & packedEvent;
        controllerNumber = (packedEvent & 32577) >> 8;
        controllerValue = packedEvent >> 16 & 127;
        if (0 == controllerNumber) {
          this.channelBankOffsets[controllerChannel] = (controllerValue << 14) + ProxySocketConnector.andInt(this.channelBankOffsets[controllerChannel], -2080769);
        }
        if (controllerNumber == 32) {
          this.channelBankOffsets[controllerChannel] = (controllerValue << 7) + ProxySocketConnector.andInt(this.channelBankOffsets[controllerChannel], -16257);
        }
        if (controllerNumber == 1) {
          this.channelModulation[controllerChannel] = (controllerValue << 7) + ProxySocketConnector.andInt(this.channelModulation[controllerChannel], -16257);
        }
        if (33 == controllerNumber) {
          this.channelModulation[controllerChannel] = controllerValue + ProxySocketConnector.andInt(-128, this.channelModulation[controllerChannel]);
        }
        if (controllerNumber == 5) {
          this.channelPortamentoTime[controllerChannel] = ProxySocketConnector.andInt(-16257, this.channelPortamentoTime[controllerChannel]) + (controllerValue << 7);
        }
        if (controllerNumber == 37) {
          this.channelPortamentoTime[controllerChannel] = ProxySocketConnector.andInt(-128, this.channelPortamentoTime[controllerChannel]) + controllerValue;
        }
        if (controllerNumber == 7) {
          this.channelVolume[controllerChannel] = ProxySocketConnector.andInt(this.channelVolume[controllerChannel], -16257) + (controllerValue << 7);
        }
        if (controllerNumber == 39) {
          this.channelVolume[controllerChannel] = ProxySocketConnector.andInt(-128, this.channelVolume[controllerChannel]) + controllerValue;
        }
        if (controllerNumber == 10) {
          this.channelPan[controllerChannel] = ProxySocketConnector.andInt(-16257, this.channelPan[controllerChannel]) + (controllerValue << 7);
        }
        if (controllerNumber == 42) {
          this.channelPan[controllerChannel] = controllerValue + ProxySocketConnector.andInt(-128, this.channelPan[controllerChannel]);
        }
        if (controllerNumber == 11) {
          this.channelExpression[controllerChannel] = (controllerValue << 7) + ProxySocketConnector.andInt(-16257, this.channelExpression[controllerChannel]);
        }
        if (controllerNumber == 43) {
          this.channelExpression[controllerChannel] = ProxySocketConnector.andInt(-128, this.channelExpression[controllerChannel]) + controllerValue;
        }
        if (controllerNumber == 64) {
          if (controllerValue < 64) {
            this.channelFlags[controllerChannel] = ProxySocketConnector.andInt(this.channelFlags[controllerChannel], -2);
          } else {
            this.channelFlags[controllerChannel] = SessionInstanceState.orInt(this.channelFlags[controllerChannel], 1);
          }
        }
        if (controllerNumber == 65) {
          if (64 <= controllerValue) {
            this.channelFlags[controllerChannel] = SessionInstanceState.orInt(this.channelFlags[controllerChannel], 2);
          } else {
            this.releaseUnmappedPortamentoNotes((byte) 39, controllerChannel);
            this.channelFlags[controllerChannel] = ProxySocketConnector.andInt(this.channelFlags[controllerChannel], -3);
          }
        }
        if (controllerNumber == 99) {
          this.channelSelectedParameter[controllerChannel] = ProxySocketConnector.andInt(this.channelSelectedParameter[controllerChannel], 127) + (controllerValue << 7);
        }
        if (controllerNumber == 98) {
          this.channelSelectedParameter[controllerChannel] = controllerValue + ProxySocketConnector.andInt(16256, this.channelSelectedParameter[controllerChannel]);
        }
        if (101 == controllerNumber) {
          this.channelSelectedParameter[controllerChannel] = (controllerValue << 7) + (ProxySocketConnector.andInt(this.channelSelectedParameter[controllerChannel], 127) + 16384);
        }
        if (controllerNumber == 100) {
          this.channelSelectedParameter[controllerChannel] = 16384 + (ProxySocketConnector.andInt(16256, this.channelSelectedParameter[controllerChannel]) + controllerValue);
        }
        if (120 == controllerNumber) {
          this.fadeOutChannelNotes(100, controllerChannel);
        }
        if (controllerNumber == 121) {
          this.resetChannelControllers((byte) -72, controllerChannel);
        }
        if (controllerNumber == 123) {
          this.releaseChannelNotes(controllerChannel, methodGuard ^ 15421);
        }
        if (controllerNumber == 6) {
          dataEntryMsbParameterSelection = this.channelSelectedParameter[controllerChannel];
          if (16384 == dataEntryMsbParameterSelection) {
            this.channelPitchBendSensitivity[controllerChannel] = ProxySocketConnector.andInt(this.channelPitchBendSensitivity[controllerChannel], -16257) + (controllerValue << 7);
          }
        }
        if (controllerNumber == 38) {
          dataEntryLsbParameterSelection = this.channelSelectedParameter[controllerChannel];
          if (dataEntryLsbParameterSelection == 16384) {
            this.channelPitchBendSensitivity[controllerChannel] = ProxySocketConnector.andInt(this.channelPitchBendSensitivity[controllerChannel], -128) + controllerValue;
          }
        }
        if (16 == controllerNumber) {
          this.channelSampleOffsets[controllerChannel] = ProxySocketConnector.andInt(-16257, this.channelSampleOffsets[controllerChannel]) + (controllerValue << 7);
        }
        if (48 == controllerNumber) {
          this.channelSampleOffsets[controllerChannel] = controllerValue + ProxySocketConnector.andInt(this.channelSampleOffsets[controllerChannel], -128);
        }
        if (controllerNumber == 81) {
          if (controllerValue >= 64) {
            this.channelFlags[controllerChannel] = SessionInstanceState.orInt(this.channelFlags[controllerChannel], 4);
          } else {
            this.resetChannelRetriggerPhases(controllerChannel, (byte) 67);
            this.channelFlags[controllerChannel] = ProxySocketConnector.andInt(this.channelFlags[controllerChannel], -5);
          }
        }
        if (controllerNumber == 17) {
          this.setChannelRetriggerControl(-118, (controllerValue << 7) + (this.channelRetriggerControl[controllerChannel] & -16257), controllerChannel);
        }
        if (controllerNumber == 49) {
          this.setChannelRetriggerControl(-102, (-128 & this.channelRetriggerControl[controllerChannel]) + controllerValue, controllerChannel);
        }
        return;
    }

    private final synchronized void setChannelVolumeScale(byte methodGuard, int channelIndex, int volumeScale) {
        int channel = 0;
        int clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        if (channelIndex >= 0) {
            this.channelVolumeScale[channelIndex] = volumeScale;
        } else {
            for (channel = 0; channel < 16; channel++) {
                this.channelVolumeScale[channel] = volumeScale;
            }
        }
        if (methodGuard != 74) {
            this.releaseUnmappedPortamentoNotes((byte) 100, 93);
        }
    }

    final synchronized void setMasterVolume(int volume, byte methodGuard) {
        this.masterVolume = volume;
        if (methodGuard != 22) {
            this.playbackTime = 84L;
        }
    }

    private final void advanceMidiEvents(byte methodGuard) {
        int trackIndex;
        int guardResidue;
        int eventTick;
        long eventTime;
        int event;
        guardResidue = -25 % ((29 - methodGuard) / 34);
        trackIndex = this.nextTrackIndex;
        eventTick = this.nextEventTick;
        eventTime = this.nextEventTime;
        if (this.pendingScore != null &&
            this.pendingScoreTick == eventTick) {
          this.loadScoreAndResetSynthesis(121, this.pendingScore, this.loopScore, this.pendingScoreFadeOutNotes);
          this.advanceMidiEvents((byte) 73);
          return;
        }
        while (true) {
          if (eventTick != this.nextEventTick) {
            this.nextEventTick = eventTick;
            this.nextEventTime = eventTime;
            this.nextTrackIndex = trackIndex;
            if (null != this.pendingScore &&
                this.pendingScoreTick < eventTick) {
              this.nextEventTick = this.pendingScoreTick;
              this.nextTrackIndex = -1;
              this.nextEventTime = this.midiReader.getTickTime(this.nextEventTick);
            }
            return;
          }
          while (this.midiReader.trackTicks[trackIndex] == eventTick) {
            this.midiReader.seekTrack(trackIndex);
            event = this.midiReader.readTrackEvent(trackIndex);
            if (1 != event) {
              if ((128 & event) != 0) {
                this.dispatchMidiEvent(event, (byte) 38);
              }
              this.midiReader.readTrackDelta(trackIndex);
              this.midiReader.saveTrackPosition(trackIndex);
              continue;
            }
            this.midiReader.markCurrentTrackEnded();
            this.midiReader.saveTrackPosition(trackIndex);
            if (this.midiReader.areAllTracksEnded()) {
              if (this.pendingScore != null) {
                this.startMusicScore(this.loopScore, this.pendingScore, -1706);
                this.advanceMidiEvents((byte) -32);
                return;
              }
              if (this.loopScore &&
                  eventTick != 0) {
                this.midiReader.restartTracks(eventTime);
              } else {
                this.resetSynthesisState(true, 2097151);
                this.midiReader.unload();
                return;
              }
            }
            break;
          }
          trackIndex = this.midiReader.selectEarliestTrack();
          eventTick = this.midiReader.trackTicks[trackIndex];
          eventTime = this.midiReader.getTickTime(eventTick);
        }
    }

    final synchronized void startMusicScore(boolean loopPlayback, MusicScore score, int methodGuard) {
        try {
            if (methodGuard != -1706) {
                this.nextTrackIndex = -24;
            }
            this.loadScoreAndResetSynthesis(methodGuard + 1832, score, loopPlayback, true);
        } catch (RuntimeException musicStartFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) musicStartFailure), "kj.PA(" + loopPlayback + ',' + (score != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    private final void releaseNote(int methodGuard, int keyNumber, int unusedReleaseVelocity, int channelIndex) {
        MidiNote otherHeldNote;
        MidiNote note;
        note = this.heldNotesByKey[channelIndex][keyNumber];
        if (note == null) {
          return;
        }
        this.heldNotesByKey[channelIndex][keyNumber] = null;
        if (methodGuard != 23327) {
          this.pendingScoreTick = -124;
        }
        portamentoReleaseSelection: {
          if ((this.channelFlags[channelIndex] & 2) != 0) {
            otherHeldNote = (MidiNote) ((Object) this.noteMixer.notes.firstForIteration(methodGuard ^ 23327));
            while (otherHeldNote != null) {
              if (note.channelIndex == otherHeldNote.channelIndex &&
                  0 > otherHeldNote.releaseEnvelopeTime &&
                  note != otherHeldNote) {
                note.releaseEnvelopeTime = 0;
                break portamentoReleaseSelection;
              }
              otherHeldNote = (MidiNote) ((Object) this.noteMixer.notes.nextForIteration(1));
            }
            break portamentoReleaseSelection;
          }
          note.releaseEnvelopeTime = 0;
        }
    }

    private final void fadeOutChannelNotes(int methodGuard, int channelIndex) {
        MidiNote note;
        note = (MidiNote) ((Object) this.noteMixer.notes.firstForIteration(methodGuard - 100));
        while (note != null) {
          if (channelIndex < 0 ||
                channelIndex == note.channelIndex) {
            if (null != note.sampleStream) {
              note.sampleStream.fadeOutAndUnlink(AudioOutput.sampleRateHz / 100);
              if (note.sampleStream.hasRemainingRampFrames()) {
                this.noteMixer.fadingStreams.addChildStream(note.sampleStream);
              }
              note.clearAudioReferences(-1);
            }
            if (note.releaseEnvelopeTime < 0) {
              this.heldNotesByKey[note.channelIndex][note.keyNumber] = null;
            }
            note.unlinkNode(false);
          }
          note = (MidiNote) ((Object) this.noteMixer.notes.nextForIteration(1));
        }
        if (methodGuard != 100) {
          this.playbackTime = -48L;
        }
    }

    final synchronized void clearInstrumentSampleIds(byte methodGuard) {
        int clientControlSnapshot = Geoblox.clientControlFlowFlag;
        if (methodGuard <= 65) {
            this.dispatchMidiEvent(-76, (byte) -34);
        }
        InstrumentPatch instrumentPatch = (InstrumentPatch) ((Object) this.instrumentPatches.firstForIteration((byte) 125));
        while (instrumentPatch != null) {
            instrumentPatch.clearEncodedSampleIds((byte) -121);
            instrumentPatch = (InstrumentPatch) ((Object) this.instrumentPatches.nextForIteration(-52));
        }
    }

    private final void setChannelRetriggerControl(int methodGuard, int controlValue, int channelIndex) {
        this.channelRetriggerControl[channelIndex] = controlValue;
        if (methodGuard > -100) {
            this.setDefaultInstrumentAndBank(-75, 124, -68);
        }
        this.channelRetriggerPhaseRates[channelIndex] = (int)(0.5 + 2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)controlValue));
    }

    private final void selectChannelInstrument(int channelIndex, int methodGuard, int instrumentId) {
        int keyGroup = 0;
        if (instrumentId != this.channelInstrumentIds[channelIndex]) {
            this.channelInstrumentIds[channelIndex] = instrumentId;
            for (keyGroup = 0; keyGroup < 128; keyGroup++) {
                this.notesByKeyGroup[channelIndex][keyGroup] = null;
            }
        }
        if (methodGuard != -129) {
            this.channelPitchBendSensitivity = (int[]) null;
        }
    }

    public static void clearSharedInputAndSpriteState(boolean detachKeyboardWithGuardSideEffect) {
        jewelsForegroundSprite = null;
        queuedKeyboardEventCodes = null;
        heldInternalKeys = null;
        lowBitMasks = null;
        if (detachKeyboardWithGuardSideEffect) {
            MidiPcmStream.detachKeyboardListener(-77);
        }
    }

    private final void resetSynthesisState(boolean fadeOutNotes, int methodGuard) {
        int instrumentResetChannelIndex = 0;
        int unusedInitialBankChannelSnapshot;
        if (!fadeOutNotes) {
            this.releaseChannelNotes(-1, 15387);
        } else {
            this.fadeOutChannelNotes(100, -1);
        }
        if (methodGuard != 2097151) {
            this.skipFrames(108);
        }
        this.resetChannelControllers((byte) -109, -1);
        for (instrumentResetChannelIndex = 0; instrumentResetChannelIndex < 16; instrumentResetChannelIndex++) {
            this.channelInstrumentIds[instrumentResetChannelIndex] = this.defaultChannelInstrumentIds[instrumentResetChannelIndex];
        }
        int bankChannelIndex = 0;
        unusedInitialBankChannelSnapshot = bankChannelIndex;
        while (bankChannelIndex < 16) {
            this.channelBankOffsets[bankChannelIndex] = ProxySocketConnector.andInt(this.defaultChannelInstrumentIds[bankChannelIndex], -128);
            bankChannelIndex++;
        }
    }

    final synchronized PcmStream firstChildStream() {
        return (PcmStream) ((Object) this.noteMixer);
    }

    final synchronized void skipFrames(int frameCount) {
        int timeUnitsPerFrame;
        long timeAfterFrames;
        int framesToEvent;
        if (this.midiReader.isLoaded()) {
          timeUnitsPerFrame = this.timeScalePerSecond * this.midiReader.tickDivision / AudioOutput.sampleRateHz;
          do {
            timeAfterFrames = this.playbackTime + (long)frameCount * (long)timeUnitsPerFrame;
            if (-timeAfterFrames + this.nextEventTime >= 0L) {
              this.playbackTime = timeAfterFrames;
              break;
            }
            framesToEvent = (int)((-1L + ((long)timeUnitsPerFrame - this.playbackTime + this.nextEventTime)) / (long)timeUnitsPerFrame);
            this.playbackTime = this.playbackTime + (long)timeUnitsPerFrame * (long)framesToEvent;
            frameCount = frameCount - framesToEvent;
            this.noteMixer.skipFrames(framesToEvent);
            this.advanceMidiEvents((byte) -42);
          } while (this.midiReader.isLoaded());
        }
        this.noteMixer.skipFrames(frameCount);
    }

    final boolean isNoteStreamAbsent(MidiNote note, int methodGuard) {
        RuntimeException absenceFailure = null;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String noteDescription = null;
        RuntimeException caughtAbsenceFailure = null;
        try {
          if (note.sampleStream != null) {
            if (methodGuard == -1) {
              return false;
            }
            return true;
          }
          if (note.releaseEnvelopeTime >= 0) {
            note.unlinkNode(false);
            if (0 < note.keyGroup &&
                this.notesByKeyGroup[note.channelIndex][note.keyGroup] == note) {
              this.notesByKeyGroup[note.channelIndex][note.keyGroup] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException absenceParameterFailure) {
          caughtAbsenceFailure = absenceParameterFailure;
          absenceFailure = caughtAbsenceFailure;
          failureContextCause = absenceFailure;
          failureContextBuilder = new StringBuilder().append("kj.IA(");
          if (note == null) {
            noteDescription = "null";
          } else {
            noteDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(noteDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    private final synchronized void unloadScoreAndResetSynthesis(byte methodGuard, boolean fadeOutNotes) {
        this.midiReader.unload();
        if (methodGuard < 78) {
            this.channelPitchBend = (int[]) null;
        }
        this.pendingScore = null;
        this.resetSynthesisState(fadeOutNotes, 2097151);
    }

    private final void startNote(int methodGuard, int channelIndex, int velocity, int keyNumber) {
        MidiNote offsetNote = null;
        int offsetMethodGuard = 0;
        Object unusedOffsetOwnerSnapshot;
        boolean loopEnabled;
        MidiNote heldNote;
        int previousPitchFixed;
        PcmSample sample;
        MidiNote note;
        MidiNote previousGroupNote;
        InstrumentPatch patch;
        InstrumentPatch patchAlias;
        this.releaseNote(23327, keyNumber, 64, channelIndex);
        if (0 != (2 & this.channelFlags[channelIndex])) {
          heldNote = (MidiNote) ((Object) this.noteMixer.notes.lastForIteration(false));
          while (heldNote != null) {
            if (channelIndex == heldNote.channelIndex &&
                heldNote.releaseEnvelopeTime < 0) {
              this.heldNotesByKey[channelIndex][heldNote.keyNumber] = null;
              this.heldNotesByKey[channelIndex][keyNumber] = heldNote;
              previousPitchFixed = (heldNote.portamentoPitchDelta * heldNote.portamentoScale >> 12) + heldNote.basePitchFixed;
              heldNote.basePitchFixed = heldNote.basePitchFixed + (keyNumber - heldNote.keyNumber << 8);
              heldNote.keyNumber = keyNumber;
              heldNote.portamentoPitchDelta = previousPitchFixed - heldNote.basePitchFixed;
              heldNote.portamentoScale = 4096;
              return;
            }
            heldNote = (MidiNote) ((Object) this.noteMixer.notes.previousForIteration(~methodGuard));
          }
        }
        patch = (InstrumentPatch) ((Object) this.instrumentPatches.findByKey((long)this.channelInstrumentIds[channelIndex], (byte) -105));
        patchAlias = patch;
        if (patchAlias == null) {
          return;
        }
        sample = patch.keySamples[keyNumber];
        if (sample == null) {
          return;
        }
        note = new MidiNote();
        note.channelIndex = channelIndex;
        note.instrumentPatch = patchAlias;
        note.pcmSample = sample;
        note.envelope = patch.keyEnvelopes[keyNumber];
        note.keyGroup = patch.keyGroups[keyNumber];
        note.keyNumber = keyNumber;
        note.velocityVolumeScale = patch.keyVolumes[keyNumber] * patchAlias.globalVolume * (velocity * velocity) + 1024 >> 11;
        note.notePan = 255 & patch.keyPans[keyNumber];
        note.basePitchFixed = (keyNumber << 8) - (patch.pitchOffsetsAndLoopFlag[keyNumber] & 32767);
        note.releaseEnvelopeIndex = 0;
        note.decayTime = 0;
        note.volumeEnvelopeTime = 0;
        note.volumeEnvelopeIndex = 0;
        note.releaseEnvelopeTime = -1;
        if (methodGuard == ~this.channelSampleOffsets[channelIndex]) {
          note.sampleStream = PcmSampleStream.createForSampleStep(sample, this.computeNoteSampleStep(92, note), this.computeNoteVolume((byte) 117, note), this.computeNotePan(note, 761736646));
        } else {
          note.sampleStream = PcmSampleStream.createForSampleStep(sample, this.computeNoteSampleStep(83, note), 0, this.computeNotePan(note, 761736646));
          offsetNote = note;
          offsetMethodGuard = -70;
          if (0 <= patch.pitchOffsetsAndLoopFlag[keyNumber]) {
            unusedOffsetOwnerSnapshot = this;
            loopEnabled = false;
          } else {
            unusedOffsetOwnerSnapshot = this;
            loopEnabled = true;
          }
          this.applyNoteSampleOffset(offsetNote, (byte) offsetMethodGuard, loopEnabled);
        }
        if (patch.pitchOffsetsAndLoopFlag[keyNumber] < 0) {
          note.sampleStream.setLoopCount(-1);
        }
        if (0 <= note.keyGroup) {
          previousGroupNote = this.notesByKeyGroup[channelIndex][note.keyGroup];
          if (previousGroupNote != null &&
              previousGroupNote.releaseEnvelopeTime < 0) {
            this.heldNotesByKey[channelIndex][previousGroupNote.keyNumber] = null;
            previousGroupNote.releaseEnvelopeTime = 0;
          }
          this.notesByKeyGroup[channelIndex][note.keyGroup] = note;
        }
        this.noteMixer.notes.addLast(-70, note);
        this.heldNotesByKey[channelIndex][keyNumber] = note;
        return;
    }

    private final void setChannelPitchBend(int methodGuard, int pitchBend, int channelIndex) {
        if (methodGuard > -107) {
            return;
        }
        this.channelPitchBend[channelIndex] = pitchBend;
    }

    private final void handlePolyphonicPressureStub(int methodGuard, int pressureValue, int keyNumber, int channelIndex) {
        if (methodGuard != -40) {
            int[] unusedNullDestinationBeforeBadGuardMix = (int[]) null;
            this.mixInto((int[]) null, -107, 119);
        }
    }

    final synchronized void stopMusicPlayback(int methodGuard) {
        this.unloadScoreAndResetSynthesis((byte) 106, true);
        if (methodGuard != -9268) {
            this.defaultChannelInstrumentIds = (int[]) null;
        }
    }

    final static void detachKeyboardListener(int methodGuard) {
        Throwable unusedMonitorExceptionCarrier = null;
        Object keyboardListenerMonitor = null;
        if (null != TrackedPcmStream.keyboardListener) {
          keyboardListenerMonitor = TrackedPcmStream.keyboardListener;
          synchronized (keyboardListenerMonitor) {
            TrackedPcmStream.keyboardListener = null;
          }
        }
        if (methodGuard != -11099) {
          pendingActionPanelPhase = 4;
        }
    }

    private final synchronized void loadScoreAndResetSynthesis(int methodGuard, MusicScore score, boolean loopPlayback, boolean fadeOutNotes) {
        int trackCount = 0;
        int trackIndex = 0;
        try {
            this.unloadScoreAndResetSynthesis((byte) 98, fadeOutNotes);
            this.midiReader.load(score.midiBytes);
            this.playbackTime = 0L;
            this.loopScore = loopPlayback ? true : false;
            trackCount = this.midiReader.getTrackCount();
            if (methodGuard <= 92) {
                this.resetChannelRetriggerPhases(60, (byte) -45);
            }
            for (trackIndex = 0; trackIndex < trackCount; trackIndex++) {
                this.midiReader.seekTrack(trackIndex);
                this.midiReader.readTrackDelta(trackIndex);
                this.midiReader.saveTrackPosition(trackIndex);
            }
            this.nextTrackIndex = this.midiReader.selectEarliestTrack();
            this.nextEventTick = this.midiReader.trackTicks[this.nextTrackIndex];
            this.nextEventTime = this.midiReader.getTickTime(this.nextEventTick);
        } catch (RuntimeException scoreLoadFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) scoreLoadFailure), "kj.P(" + methodGuard + ',' + (score != null ? "{...}" : "null") + ',' + loopPlayback + ',' + fadeOutNotes + ')');
        }
    }

    final synchronized void setChannelDefaultInstrument(int methodGuard, int channelIndex, int instrumentId) {
        if (methodGuard != -1636) {
            this.resetChannelControllers((byte) -86, 98);
        }
        this.setDefaultInstrumentAndBank(-8581, channelIndex, instrumentId);
    }

    public MidiPcmStream() {
        this.notesByKeyGroup = new MidiNote[16][128];
        this.channelPan = new int[16];
        this.channelSampleOffsets = new int[16];
        this.channelVolume = new int[16];
        this.channelInstrumentIds = new int[16];
        this.channelFlags = new int[16];
        this.channelPitchBendSensitivity = new int[16];
        this.channelVolumeScale = new int[16];
        this.channelModulation = new int[16];
        this.channelPortamentoTime = new int[16];
        this.heldNotesByKey = new MidiNote[16][128];
        this.channelExpression = new int[16];
        this.timeScalePerSecond = 1000000;
        this.channelBankOffsets = new int[16];
        this.masterVolume = 256;
        this.channelRetriggerPhaseRates = new int[16];
        this.channelPitchBend = new int[16];
        this.channelRetriggerControl = new int[16];
        this.defaultChannelInstrumentIds = new int[16];
        this.channelSelectedParameter = new int[16];
        this.midiReader = new MidiTrackReader();
        this.noteMixer = new MidiNoteMixer(this);
        this.instrumentPatches = new IntrusiveNodeHashTable(128);
        this.setChannelVolumeScale((byte) 74, -1, 256);
        this.resetSynthesisState(true, 2097151);
    }

    static {
        pendingActionPanelPhase = 0;
        heldInternalKeys = new boolean[112];
        queuedKeyboardEventCodes = new int[128];
        lowBitMasks = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
