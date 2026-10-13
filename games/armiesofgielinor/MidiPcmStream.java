/*
 * Decompiled by CFR-JS 0.4.0.
 */
class MidiPcmStream extends PcmStream {
    private MidiFileReader midiReader;
    private int[] channelModulation;
    static int[] field_E;
    static nj field_H;
    private MusicPatchNode[][] notesByGroup;
    int[] channelRetriggerSteps;
    private int[] channelPortamentoTime;
    private NodeHashTable patches;
    private int[] channelDefaultPrograms;
    private MusicPatchNode[][] notesByKey;
    private int[] channelRetriggerRates;
    private int masterVolume;
    private int timeScale;
    private int[] channelExpression;
    static SpellMenuGroup field_p;
    private int[] channelPan;
    private static byte[] field_G;
    private int[] channelPitchBend;
    private int[] channelBanks;
    private int[] channelPitchBendSensitivity;
    int[] channelFlags;
    int[] channelSampleOffsets;
    private int[] channelVolume;
    private int[] channelPrograms;
    static String field_R;
    private int[] channelGain;
    private int[] channelParameterSelection;
    static int renderTimestampIndex;
    static String field_X;
    private long playbackTime;
    private int nextTrackIndex;
    private int nextEventTick;
    private boolean loopTrack;
    private long nextEventTime;
    private MusicPatchPcmStream patchStream;
    private boolean pendingStopSounds;
    private MusicTrack pendingTrack;
    private int pendingTrackTick;

    private final void processMidiEvents(byte obfuscationGuard) {
        int complementPendingTick = 0;
        int complementEventTick = 0;
        int trackIndex;
        int tick;
        long eventTime;
        int message;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        trackIndex = this.nextTrackIndex;
        tick = this.nextEventTick;
        eventTime = this.nextEventTime;
        if (null != this.pendingTrack &&
          tick == this.pendingTrackTick) {
          this.startTrack(this.loopTrack, (byte) -90, this.pendingStopSounds, this.pendingTrack);
          this.processMidiEvents((byte) 36);
          return;
        }
        if (obfuscationGuard != 36) {
          this.nextEventTime = -103L;
        }
        while (true) {
          if (tick != this.nextEventTick) {
            this.nextEventTime = eventTime;
            this.nextTrackIndex = trackIndex;
            this.nextEventTick = tick;
            if (this.pendingTrack != null) {
              complementPendingTick = ~this.pendingTrackTick;
              complementEventTick = ~tick;
              if (complementPendingTick > complementEventTick) {
                this.nextEventTick = this.pendingTrackTick;
                this.nextTrackIndex = -1;
                this.nextEventTime = this.midiReader.tickTime(this.nextEventTick);
              }
            }
            return;
          }
          while (tick == this.midiReader.trackTicks[trackIndex]) {
            this.midiReader.seekTrack(trackIndex);
            message = this.midiReader.readMessage(trackIndex);
            if (message != 1) {
              if (0 != (message & 128)) {
                this.dispatchMidiMessage((byte) 127, message);
              }
              this.midiReader.readDelta(trackIndex);
              this.midiReader.saveTrackPosition(trackIndex);
              continue;
            }
            this.midiReader.markTrackDone();
            this.midiReader.saveTrackPosition(trackIndex);
            if (this.midiReader.isDone()) {
              if (null != this.pendingTrack) {
                this.playTrack(obfuscationGuard - 34, this.loopTrack, this.pendingTrack);
                this.processMidiEvents((byte) 36);
                return;
              }
              if (this.loopTrack &&
                tick != 0) {
                this.midiReader.reset(eventTime);
              } else {
                this.resetState(true, true);
                this.midiReader.release();
                return;
              }
            }
            break;
          }
          trackIndex = this.midiReader.nextTrack();
          tick = this.midiReader.trackTicks[trackIndex];
          eventTime = this.midiReader.tickTime(tick);
        }
    }

    private final int noteVolume(byte obfuscationGuard, MusicPatchNode note) {
        RuntimeException failure = null;
        int volume = 0;
        int volumeTime = 0;
        int volumeLevel = 0;
        int volumeStartTime = 0;
        int volumeEndTime = 0;
        MusicPatchEnvelope envelope = null;
        MusicPatchEnvelope envelopeAlias = null;
        int mutedVolume = 0;
        int resultVolume = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String noteDescription = null;
        RuntimeException caughtFailure = null;
        int releaseTime;
        int releaseLevel;
        int releaseStartTime;
        int releaseEndTime;
        try {
          if (this.channelGain[note.channel] == 0) {
            mutedVolume = 0;
            return mutedVolume;
          }
          envelope = note.envelope;
          envelopeAlias = envelope;
          volume = this.channelExpression[note.channel] * this.channelVolume[note.channel] + 4096 >> 13;
          if (obfuscationGuard != -110) {
            this.resetRetriggerPhases(102, (byte) -86);
          }
          volume = 16384 + volume * volume >> 15;
          volume = note.velocityGain * volume + 16384 >> 15;
          volume = 128 + volume * this.masterVolume >> 8;
          volume = volume * this.channelGain[note.channel] + 128 >> 8;
          if (0 < envelopeAlias.decayRate) {
            volume = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)note.decayTime * (double)envelopeAlias.decayRate) * (double)volume);
          }
          if (envelopeAlias.volumeEnvelope != null) {
            volumeTime = note.volumeEnvelopeTime;
            volumeLevel = envelopeAlias.volumeEnvelope[note.volumeEnvelopeIndex + 1];
            if (note.volumeEnvelopeIndex < -2 + envelopeAlias.volumeEnvelope.length) {
              volumeStartTime = (envelope.volumeEnvelope[note.volumeEnvelopeIndex] & 255) << 8;
              volumeEndTime = envelopeAlias.volumeEnvelope[2 + note.volumeEnvelopeIndex] << 8 & 65280;
              volumeLevel = volumeLevel + (-volumeLevel + envelopeAlias.volumeEnvelope[3 + note.volumeEnvelopeIndex]) * (volumeTime - volumeStartTime) / (volumeEndTime - volumeStartTime);
            }
            volume = volumeLevel * volume + 32 >> 6;
          }
          if (0 < note.releaseTime &&
            envelopeAlias.releaseEnvelope != null) {
            releaseTime = note.releaseTime;
            releaseLevel = envelopeAlias.releaseEnvelope[note.releaseEnvelopeIndex + 1];
            if (envelopeAlias.releaseEnvelope.length - 2 > note.releaseEnvelopeIndex) {
              releaseStartTime = envelope.releaseEnvelope[note.releaseEnvelopeIndex] << 8 & 65280;
              releaseEndTime = (envelopeAlias.releaseEnvelope[note.releaseEnvelopeIndex + 2] & 255) << 8;
              releaseLevel = releaseLevel + (-releaseLevel + envelopeAlias.releaseEnvelope[note.releaseEnvelopeIndex + 3]) * (-releaseStartTime + releaseTime) / (-releaseStartTime + releaseEndTime);
            }
            volume = releaseLevel * volume + 32 >> 6;
          }
          resultVolume = volume;
          return resultVolume;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ih.CA(").append(obfuscationGuard).append(',');
          if (note == null) {
            noteDescription = "null";
          } else {
            noteDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(noteDescription).append(')').toString());
        }
    }

    synchronized void setChannelGain(int gain, int channel, byte obfuscationGuard) {
        int channelIndex = 0;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard > -13) {
          return;
        }
        if (0 > channel) {
          for (channelIndex = 0; 16 > channelIndex; channelIndex++) {
            this.channelGain[channelIndex] = gain;
          }
        } else {
          this.channelGain[channel] = gain;
        }
    }

    final void applySampleOffset(boolean looped, MusicPatchNode note, int obfuscationGuard) {
        int sampleLength = 0;
        int position = 0;
        int reflectedLength = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String noteDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        try {
          if (obfuscationGuard != 16) {
            this.noteOff(-101, 56, -32, -116);
          }
          sampleLength = note.sample.samples.length;
          if (looped &&
            note.sample.loopModeFlag) {
            reflectedLength = -note.sample.loopStart + sampleLength + sampleLength;
            position = (int)((long)this.channelSampleOffsets[note.channel] * (long)reflectedLength >> 6);
            sampleLength = sampleLength << 8;
            if (sampleLength <= position) {
              note.stream.setReverse(true);
              position = -position + sampleLength + (sampleLength - 1);
            }
          } else {
            position = (int)((long)this.channelSampleOffsets[note.channel] * (long)sampleLength >> 6);
          }
          note.stream.setPosition(position);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ih.TA(").append(looped).append(',');
          if (note == null) {
            noteDescription = "null";
          } else {
            noteDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(noteDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final synchronized PcmStream nextSubStream() {
        return null;
    }

    synchronized void startTrack(boolean loop, byte obfuscationGuard, boolean stopSounds, MusicTrack track) {
        int trackCount = 0;
        int trackIndex = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.stopTrack(stopSounds, -128);
        if (obfuscationGuard > -78) {
          return;
        }
        try {
          this.midiReader.parse(track.midiBytes);
          this.playbackTime = 0L;
          this.loopTrack = loop ? true : false;
          trackCount = this.midiReader.trackCount();
          for (trackIndex = 0; trackIndex < trackCount; trackIndex++) {
            this.midiReader.seekTrack(trackIndex);
            this.midiReader.readDelta(trackIndex);
            this.midiReader.saveTrackPosition(trackIndex);
          }
          this.nextTrackIndex = this.midiReader.nextTrack();
          this.nextEventTick = this.midiReader.trackTicks[this.nextTrackIndex];
          this.nextEventTime = this.midiReader.tickTime(this.nextEventTick);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ih.EA(" + loop + ',' + obfuscationGuard + ',' + stopSounds + ',' + (track != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void setMasterVolume(int obfuscationGuard, int volume) {
        if (obfuscationGuard >= -49) {
          return;
        }
        this.masterVolume = volume;
    }

    private final void setDefaultProgram(int program, int channel, boolean obfuscationGuard) {
        this.channelDefaultPrograms[channel] = program;
        this.channelBanks[channel] = rn.bitwiseAnd(-128, program);
        this.selectProgram(channel, (byte) 114, program);
        if (!obfuscationGuard) {
          this.playbackTime = -32L;
        }
    }

    final synchronized boolean prepareTrackSamples(SoundCache soundCache, ResourceArchive patchArchive, int budget, MusicTrack track, byte obfuscationGuard) {
        int resultSuccess = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String cacheDescription = null;
        StringBuilder archiveContext = null;
        String archiveDescription = null;
        StringBuilder trackContext = null;
        String trackDescription = null;
        RuntimeException caughtFailure = null;
        int prepared = 0;
        RuntimeException failure = null;
        Object sampleBudget = null;
        MusicPatchUsage usage = null;
        int patchId = 0;
        int obfuscationControl = 0;
        MusicPatch cachedPatch = null;
        MusicPatch loadedPatch = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          track.buildPatchUsage();
          prepared = 1;
          sampleBudget = null;
          if (budget > 0) {
            sampleBudget = new int[]{budget};
          }
          if (obfuscationGuard != 86) {
            return true;
          }
          usage = (MusicPatchUsage) (track.patchUsage.first(1));
          while (usage != null) {
            patchId = (int)usage.key;
            cachedPatch = (MusicPatch) (this.patches.get(-27, (long)patchId));
            if (cachedPatch == null) {
              loadedPatch = ModalDialog.loadMusicPatch(patchArchive, patchId, true);
              if (loadedPatch != null) {
                this.patches.put(loadedPatch, (long)patchId, 24);
                if (!loadedPatch.prepareSamples(obfuscationGuard + 10922, usage.notes, (int[]) (sampleBudget), soundCache)) {
                  prepared = 0;
                }
              } else {
                prepared = 0;
              }
            } else {
              if (!cachedPatch.prepareSamples(obfuscationGuard + 10922, usage.notes, (int[]) (sampleBudget), soundCache)) {
                prepared = 0;
                usage = (MusicPatchUsage) (track.patchUsage.next((byte) 115));
                continue;
              }
            }
            usage = (MusicPatchUsage) (track.patchUsage.next((byte) 115));
          }
          if (prepared != 0) {
            track.releasePatchUsage();
          }
          resultSuccess = prepared;
          return resultSuccess != 0;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ih.SA(");
          if (soundCache == null) {
            cacheDescription = "null";
          } else {
            cacheDescription = "{...}";
          }
          archiveContext = ((StringBuilder) (Object) errorContext).append(cacheDescription).append(',');
          if (patchArchive == null) {
            archiveDescription = "null";
          } else {
            archiveDescription = "{...}";
          }
          trackContext = ((StringBuilder) (Object) archiveContext).append(archiveDescription).append(',').append(budget).append(',');
          if (track == null) {
            trackDescription = "null";
          } else {
            trackDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) trackContext).append(trackDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void selectProgram(int channel, byte obfuscationGuard, int program) {
        int group = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (program != this.channelPrograms[channel]) {
          this.channelPrograms[channel] = program;
          for (group = 0; 128 > group; group++) {
            this.notesByGroup[channel][group] = null;
          }
        }
        if (obfuscationGuard < 111) {
          field_E = (int[]) null;
        }
    }

    synchronized void render(int[] output, int outputOffset, int frameCount) {
        int timePerFrame = 0;
        long endTime = 0L;
        int framesToEvent = 0;
        int obfuscationControl = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String outputDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.midiReader.isReady()) {
            timePerFrame = this.timeScale * this.midiReader.division / PcmPlayer.outputSampleRate;
            while (true) {
              endTime = this.playbackTime + (long)frameCount * (long)timePerFrame;
              if (0L <= -endTime + this.nextEventTime) {
                this.playbackTime = endTime;
                break;
              }
              framesToEvent = (int)(((long)timePerFrame + (this.nextEventTime - (this.playbackTime + 1L))) / (long)timePerFrame);
              this.playbackTime = this.playbackTime + (long)timePerFrame * (long)framesToEvent;
              this.patchStream.render(output, outputOffset, framesToEvent);
              this.processMidiEvents((byte) 36);
              outputOffset = outputOffset + framesToEvent;
              frameCount = frameCount - framesToEvent;
              if (this.midiReader.isReady()) {
                continue;
              }
              this.patchStream.render(output, outputOffset, frameCount);
              return;
            }
          }
          this.patchStream.render(output, outputOffset, frameCount);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ih.E(");
          if (output == null) {
            outputDescription = "null";
          } else {
            outputDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(outputDescription).append(',').append(outputOffset).append(',').append(frameCount).append(')').toString());
        }
    }

    final boolean removeFinishedNote(byte obfuscationGuard, MusicPatchNode note) {
        RuntimeException failure = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String noteDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard > -76) {
            this.channelRetriggerRates = (int[]) null;
          }
          if (note.stream != null) {
            return false;
          }
          if (note.releaseTime >= 0) {
            note.unlink(56);
            if (note.exclusiveGroup > 0) {
              if (this.notesByGroup[note.channel][note.exclusiveGroup] != note) {
                return true;
              }
              this.notesByGroup[note.channel][note.exclusiveGroup] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ih.DA(").append(obfuscationGuard).append(',');
          if (note == null) {
            noteDescription = "null";
          } else {
            noteDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(noteDescription).append(')').toString());
        }
    }

    final synchronized void releasePatchSampleIds(int obfuscationGuard) {
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        MusicPatch patch = (MusicPatch) (this.patches.first(1));
        int guardRemainder = -125 % ((-68 - obfuscationGuard) / 49);
        while (patch != null) {
          patch.releaseSampleIds(126);
          patch = (MusicPatch) (this.patches.next((byte) 55));
        }
    }

    private final void releasePortamentoNotes(boolean obfuscationGuard, int channel) {
        MusicPatchNode note;
        int obfuscationControl;
        MusicTrack unusedTrack;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 != (2 & this.channelFlags[channel])) {
          note = (MusicPatchNode) (this.patchStream.notes.first((byte) 89));
          while (note != null) {
            if (note.channel == channel) {
              if (null != this.notesByKey[channel][note.key]) {
                note = (MusicPatchNode) (this.patchStream.notes.next((byte) 123));
                continue;
              }
              if (0 > note.releaseTime) {
                note.releaseTime = 0;
              }
            }
            note = (MusicPatchNode) (this.patchStream.notes.next((byte) 123));
          }
        }
        if (obfuscationGuard) {
          unusedTrack = (MusicTrack) null;
          this.prepareTrackSamples((SoundCache) null, (ResourceArchive) null, -24, (MusicTrack) null, (byte) 111);
        }
    }

    public static void f(int param0) {
        field_G = null;
        if (param0 != -128) {
          field_X = (String) null;
        }
        field_H = null;
        field_X = null;
        field_p = null;
        field_E = null;
        field_R = null;
    }

    final int getMasterVolume(int obfuscationGuard) {
        if (obfuscationGuard != 4096) {
          this.channelSampleOffsets = (int[]) null;
        }
        return this.masterVolume;
    }

    final static String releaseUnitModelOwnershipForConsole(int obfuscationGuard) {
        int playerIndex = 0;
        NodeDeque units = null;
        Unit unit = null;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        GameplayController controller = rd.gameplayController;
        if (controller == null) {
          return "No game in progress.";
        }
        NodeDeque[] unitsByPlayer = controller.battlefield.unitsByPlayer;
        if (obfuscationGuard <= 10) {
          return (String) null;
        }
        for (playerIndex = 0; playerIndex < unitsByPlayer.length; playerIndex++) {
          units = unitsByPlayer[playerIndex];
          unit = (Unit) (units.first((byte) 99));
          while (unit != null) {
            unit.presentationOwnsModel = false;
            unit = (Unit) (units.next((byte) 123));
          }
        }
        return "Did that work?";
    }

    final synchronized int getSchedulingCost() {
        return 0;
    }

    private final void noteOff(int velocity, int key, int obfuscationGuard, int channel) {
        MusicPatchNode otherNote = null;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        MusicPatchNode note = this.notesByKey[channel][key];
        if (note == null) {
          return;
        }
        this.notesByKey[channel][key] = null;
        if (obfuscationGuard != -44) {
          MidiPcmStream.releaseUnitModelOwnershipForConsole(-77);
        }
        if ((this.channelFlags[channel] & 2) == 0) {
          note.releaseTime = 0;
        } else {
          otherNote = (MusicPatchNode) (this.patchStream.notes.first((byte) 87));
          while (otherNote != null) {
            if (otherNote.channel == note.channel &&
              otherNote.releaseTime < 0 &&
              note != otherNote) {
              note.releaseTime = 0;
              break;
            }
            otherNote = (MusicPatchNode) (this.patchStream.notes.next((byte) 123));
          }
        }
    }

    final synchronized void stop(int obfuscationGuard) {
        this.stopTrack(true, -128);
        if (obfuscationGuard != 7) {
          this.notesByGroup = (MusicPatchNode[][]) null;
        }
    }

    private final int noteStep(int obfuscationGuard, MusicPatchNode note) {
        int resultStep = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String noteDescription = null;
        RuntimeException caughtFailure = null;
        int pitch = 0;
        RuntimeException failure = null;
        MusicPatchEnvelope envelope = null;
        int vibratoDepth = 0;
        int vibratoDelay = 0;
        double vibratoWave = 0.0;
        int step;
        try {
          if (obfuscationGuard != 1370206316) {
            this.patches = (NodeHashTable) null;
          }
          pitch = note.basePitch + (note.portamentoScale * note.portamentoPitchDelta >> 12);
          pitch = pitch + (this.channelPitchBendSensitivity[note.channel] * (-8192 + this.channelPitchBend[note.channel]) >> 12);
          envelope = note.envelope;
          if (envelope.vibratoRate > 0 && (!(envelope.vibratoDepth <= 0) ||
            this.channelModulation[note.channel] > 0)) {
            vibratoDepth = envelope.vibratoDepth << 2;
            vibratoDelay = envelope.vibratoDelay << 1;
            if (vibratoDelay > note.ageTicks) {
              vibratoDepth = note.ageTicks * vibratoDepth / vibratoDelay;
            }
            vibratoDepth = vibratoDepth + (this.channelModulation[note.channel] >> 7);
            vibratoWave = Math.sin(0.01227184630308513 * (double)(note.vibratoPhase & 511));
            pitch = pitch + (int)(vibratoWave * (double)vibratoDepth);
          }
          step = (int)(0.5 + (double)(note.sample.sampleRate * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)pitch) / (double)PcmPlayer.outputSampleRate);
          resultStep = (1 > step) ? 1 : step;
          return resultStep;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ih.BA(").append(obfuscationGuard).append(',');
          if (note == null) {
            noteDescription = "null";
          } else {
            noteDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(noteDescription).append(')').toString());
        }
    }

    final synchronized PcmStream firstSubStream() {
        return (PcmStream) ((Object) this.patchStream);
    }

    final boolean updateNote(int remainingFrames, int outputOffset, MusicPatchNode note, byte obfuscationGuard, int[] output) {
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String noteDescription = null;
        StringBuilder outputContext = null;
        String outputDescription = null;
        RuntimeException caughtFailure = null;
        int portamentoScale = 0;
        RuntimeException failure = null;
        MusicPatchEnvelope envelope = null;
        int finished = 0;
        double keyProgress = 0.0;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          note.framesUntilUpdate = PcmPlayer.outputSampleRate / 100;
          if (0 <= note.releaseTime && (note.stream == null ||
            note.stream.isOutOfBounds())) {
            note.releaseReferences(13301);
            note.unlink(-119);
            if (note.exclusiveGroup > 0 &&
              note == this.notesByGroup[note.channel][note.exclusiveGroup]) {
              this.notesByGroup[note.channel][note.exclusiveGroup] = null;
              return true;
            }
            return true;
          }
          portamentoScale = note.portamentoScale;
          if (0 < portamentoScale) {
            portamentoScale = portamentoScale - (int)(0.5 + 16.0 * Math.pow(2.0, (double)this.channelPortamentoTime[note.channel] * 0.0004921259842519685));
            if (0 > portamentoScale) {
              portamentoScale = 0;
            }
            note.portamentoScale = portamentoScale;
          }
          note.stream.setStepMagnitude(this.noteStep(1370206316, note));
          envelope = note.envelope;
          note.vibratoPhase = note.vibratoPhase + envelope.vibratoRate;
          note.ageTicks = note.ageTicks + 1;
          finished = 0;
          keyProgress = 0.000005086263020833333 * (double)((note.portamentoPitchDelta * note.portamentoScale >> 12) + (-60 + note.key << 8));
          if (0 < envelope.decayRate) {
            if (envelope.decayKeyScaling > 0) {
              note.decayTime = note.decayTime + (int)(Math.pow(2.0, (double)envelope.decayKeyScaling * keyProgress) * 128.0 + 0.5);
            } else {
              note.decayTime = note.decayTime + 128;
            }
            if (envelope.decayRate * note.decayTime >= 819200) {
              finished = 1;
            }
          }
          if (envelope.volumeEnvelope != null) {
            if (envelope.volumeKeyScaling <= 0) {
              note.volumeEnvelopeTime = note.volumeEnvelopeTime + 128;
            } else {
              note.volumeEnvelopeTime = note.volumeEnvelopeTime + (int)(0.5 + Math.pow(2.0, keyProgress * (double)envelope.volumeKeyScaling) * 128.0);
            }
            while (note.volumeEnvelopeIndex < envelope.volumeEnvelope.length - 2) {
              if ((255 & envelope.volumeEnvelope[note.volumeEnvelopeIndex + 2]) << 8 < note.volumeEnvelopeTime) {
                note.volumeEnvelopeIndex = note.volumeEnvelopeIndex + 2;
                continue;
              }
              break;
            }
            if (note.volumeEnvelopeIndex == envelope.volumeEnvelope.length - 2 &&
              envelope.volumeEnvelope[1 + note.volumeEnvelopeIndex] == 0) {
              finished = 1;
            }
          }
          if (obfuscationGuard <= 34) {
            this.channelPressure(-100, -5, -59);
          }
          if (note.releaseTime >= 0 &&
            envelope.releaseEnvelope != null &&
            0 == (1 & this.channelFlags[note.channel]) && (!(note.exclusiveGroup >= 0) ||
            note != this.notesByGroup[note.channel][note.exclusiveGroup])) {
            if (envelope.releaseKeyScaling <= 0) {
              note.releaseTime = note.releaseTime + 128;
            } else {
              note.releaseTime = note.releaseTime + (int)(0.5 + 128.0 * Math.pow(2.0, (double)envelope.releaseKeyScaling * keyProgress));
            }
            while (note.releaseEnvelopeIndex < envelope.releaseEnvelope.length - 2) {
              if (((255 & envelope.releaseEnvelope[2 + note.releaseEnvelopeIndex]) << 8) < note.releaseTime) {
                note.releaseEnvelopeIndex = note.releaseEnvelopeIndex + 2;
                continue;
              }
              break;
            }
            if (-2 + envelope.releaseEnvelope.length == note.releaseEnvelopeIndex) {
              finished = 1;
            }
          }
          if (finished == 0) {
            note.stream.rampVolumeAndPan(note.framesUntilUpdate, this.noteVolume((byte) -110, note), this.notePan((byte) 112, note));
            return false;
          }
          note.stream.fadeOut(note.framesUntilUpdate);
          if (output == null) {
            note.stream.skip(remainingFrames);
          } else {
            note.stream.render(output, outputOffset, remainingFrames);
          }
          if (note.stream.isRamping()) {
            this.patchStream.fadingStreams.addSubStream(note.stream);
          }
          note.releaseReferences(13301);
          if (note.releaseTime >= 0) {
            note.unlink(93);
            if (0 < note.exclusiveGroup &&
              this.notesByGroup[note.channel][note.exclusiveGroup] == note) {
              this.notesByGroup[note.channel][note.exclusiveGroup] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ih.D(").append(remainingFrames).append(',').append(outputOffset).append(',');
          if (note == null) {
            noteDescription = "null";
          } else {
            noteDescription = "{...}";
          }
          outputContext = ((StringBuilder) (Object) errorContext).append(noteDescription).append(',').append(obfuscationGuard).append(',');
          if (output == null) {
            outputDescription = "null";
          } else {
            outputDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) outputContext).append(outputDescription).append(')').toString());
        }
    }

    private final void allNotesOff(int channel, int obfuscationGuard) {
        MusicPatchNode note;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != 0) {
          this.setMasterVolume(81, -106);
        }
        note = (MusicPatchNode) (this.patchStream.notes.first((byte) 105));
        while (note != null) {
          if ((0 > channel ||
            note.channel == channel) &&
            note.releaseTime < 0) {
            this.notesByKey[note.channel][note.key] = null;
            note.releaseTime = 0;
          }
          note = (MusicPatchNode) (this.patchStream.notes.next((byte) 123));
        }
    }

    private final void allSoundOff(int obfuscationGuard, int channel) {
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        MusicPatchNode note = (MusicPatchNode) (this.patchStream.notes.first((byte) 121));
        if (obfuscationGuard != -23024) {
          this.channelSampleOffsets = (int[]) null;
        }
        while (note != null) {
          if (channel < 0 ||
            channel == note.channel) {
            if (null != note.stream) {
              note.stream.fadeOut(PcmPlayer.outputSampleRate / 100);
              if (note.stream.isRamping()) {
                this.patchStream.fadingStreams.addSubStream(note.stream);
              }
              note.releaseReferences(13301);
            }
            if (note.releaseTime < 0) {
              this.notesByKey[note.channel][note.key] = null;
            }
            note.unlink(-118);
          }
          note = (MusicPatchNode) (this.patchStream.notes.next((byte) 123));
        }
    }

    final synchronized void setChannelProgram(int obfuscationGuard, int program, int channel) {
        if (obfuscationGuard != -1) {
          this.resetState(true, false);
        }
        this.setDefaultProgram(program, channel, true);
    }

    private final void channelPressure(int pressure, int obfuscationGuard, int channel) {
        if (obfuscationGuard != 2) {
          this.setMasterVolume(-56, 47);
        }
    }

    private final void setPitchBend(int channel, int pitchBend, int obfuscationGuard) {
        this.channelPitchBend[channel] = pitchBend;
        if (obfuscationGuard < 117) {
          this.notesByGroup = (MusicPatchNode[][]) null;
        }
    }

    private final void resetChannelControllers(int obfuscationGuard, int channel) {
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (channel < 0) {
          for (channel = 0; channel < 16; channel++) {
            this.resetChannelControllers(59, channel);
          }
        } else {
          this.channelVolume[channel] = 12800;
          this.channelPan[channel] = 8192;
          this.channelExpression[channel] = 16383;
          this.channelPitchBend[channel] = 8192;
          this.channelModulation[channel] = 0;
          this.channelPortamentoTime[channel] = 8192;
          this.releasePortamentoNotes(false, channel);
          if (obfuscationGuard <= 31) {
            this.polyphonicPressure(-1, (byte) -1, 112, 0);
          }
          this.resetRetriggerPhases(channel, (byte) 83);
          this.channelFlags[channel] = 0;
          this.channelParameterSelection[channel] = 32767;
          this.channelPitchBendSensitivity[channel] = 256;
          this.channelSampleOffsets[channel] = 0;
          this.setRetriggerRate(10287, channel, 8192);
        }
    }

    private final void dispatchMidiMessage(byte obfuscationGuard, int message) {
        int status;
        int noteOffChannel;
        int noteOffKey;
        int noteOffVelocity;
        int selectedParameter;
        int obfuscationControl;
        int noteOnChannel;
        int polyPressureChannel;
        int programChannel;
        int controlChannel;
        int noteOnKey;
        int polyPressureKey;
        int program;
        int controller;
        int noteOnVelocity;
        int polyPressure;
        int controlValue;
        int fineSelectedParameter;
        int pressureChannel;
        int pitchChannel;
        int pressure;
        int pitchBend;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        status = 240 & message;
        if (obfuscationGuard < 102) {
          return;
        }
        if (status == 128) {
          noteOffChannel = message & 15;
          noteOffKey = (32625 & message) >> 8;
          noteOffVelocity = (8335388 & message) >> 16;
          this.noteOff(noteOffVelocity, noteOffKey, -44, noteOffChannel);
          return;
        }
        if (status == 144) {
          noteOnChannel = 15 & message;
          noteOnKey = message >> 8 & 127;
          noteOnVelocity = message >> 16 & 127;
          if (0 < noteOnVelocity) {
            this.noteOn(64, noteOnKey, noteOnVelocity, noteOnChannel);
          } else {
            this.noteOff(64, noteOnKey, -44, noteOnChannel);
          }
          return;
        }
        if (status == 160) {
          polyPressureChannel = 15 & message;
          polyPressureKey = message >> 8 & 127;
          polyPressure = (message & 8346101) >> 16;
          this.polyphonicPressure(polyPressureChannel, (byte) 79, polyPressureKey, polyPressure);
          return;
        }
        if (status != 176) {
          if (status == 192) {
            programChannel = message & 15;
            program = message >> 8 & 127;
            this.selectProgram(programChannel, (byte) 112, program + this.channelBanks[programChannel]);
            return;
          }
          if (status == 208) {
            pressureChannel = message & 15;
            pressure = 127 & message >> 8;
            this.channelPressure(pressure, 2, pressureChannel);
            return;
          }
          if (status == 224) {
            pitchChannel = 15 & message;
            pitchBend = (message >> 8 & 127) + (message >> 9 & 16256);
            this.setPitchBend(pitchChannel, pitchBend, 124);
            return;
          }
          status = 255 & message;
          if (status != 255) {
            return;
          }
          this.resetState(true, true);
          return;
        }
        controlChannel = 15 & message;
        controller = (message & 32599) >> 8;
        controlValue = 127 & message >> 16;
        if (0 == controller) {
          this.channelBanks[controlChannel] = rn.bitwiseAnd(-2080769, this.channelBanks[controlChannel]) + (controlValue << 14);
        }
        if (controller == 32) {
          this.channelBanks[controlChannel] = (controlValue << 7) + rn.bitwiseAnd(this.channelBanks[controlChannel], -16257);
        }
        if (controller == 1) {
          this.channelModulation[controlChannel] = rn.bitwiseAnd(this.channelModulation[controlChannel], -16257) + (controlValue << 7);
        }
        if (controller == 33) {
          this.channelModulation[controlChannel] = rn.bitwiseAnd(this.channelModulation[controlChannel], -128) + controlValue;
        }
        if (5 == controller) {
          this.channelPortamentoTime[controlChannel] = rn.bitwiseAnd(-16257, this.channelPortamentoTime[controlChannel]) + (controlValue << 7);
        }
        if (37 == controller) {
          this.channelPortamentoTime[controlChannel] = controlValue + rn.bitwiseAnd(this.channelPortamentoTime[controlChannel], -128);
        }
        if (7 == controller) {
          this.channelVolume[controlChannel] = (controlValue << 7) + rn.bitwiseAnd(-16257, this.channelVolume[controlChannel]);
        }
        if (controller == 39) {
          this.channelVolume[controlChannel] = controlValue + rn.bitwiseAnd(-128, this.channelVolume[controlChannel]);
        }
        if (10 == controller) {
          this.channelPan[controlChannel] = rn.bitwiseAnd(-16257, this.channelPan[controlChannel]) + (controlValue << 7);
        }
        if (controller == 42) {
          this.channelPan[controlChannel] = controlValue + rn.bitwiseAnd(this.channelPan[controlChannel], -128);
        }
        if (controller == 11) {
          this.channelExpression[controlChannel] = rn.bitwiseAnd(this.channelExpression[controlChannel], -16257) + (controlValue << 7);
        }
        if (controller == 43) {
          this.channelExpression[controlChannel] = rn.bitwiseAnd(-128, this.channelExpression[controlChannel]) + controlValue;
        }
        if (controller == 64) {
          if (controlValue >= 64) {
            this.channelFlags[controlChannel] = AccountRegistrationDialog.bitwiseOr(this.channelFlags[controlChannel], 1);
          } else {
            this.channelFlags[controlChannel] = rn.bitwiseAnd(this.channelFlags[controlChannel], -2);
          }
        }
        if (controller == 65) {
          if (controlValue < 64) {
            this.releasePortamentoNotes(false, controlChannel);
            this.channelFlags[controlChannel] = rn.bitwiseAnd(this.channelFlags[controlChannel], -3);
          } else {
            this.channelFlags[controlChannel] = AccountRegistrationDialog.bitwiseOr(this.channelFlags[controlChannel], 2);
          }
        }
        if (controller == 99) {
          this.channelParameterSelection[controlChannel] = rn.bitwiseAnd(127, this.channelParameterSelection[controlChannel]) + (controlValue << 7);
        }
        if (controller == 98) {
          this.channelParameterSelection[controlChannel] = rn.bitwiseAnd(16256, this.channelParameterSelection[controlChannel]) + controlValue;
        }
        if (controller == 101) {
          this.channelParameterSelection[controlChannel] = 16384 - (-rn.bitwiseAnd(127, this.channelParameterSelection[controlChannel]) - (controlValue << 7));
        }
        if (controller == 100) {
          this.channelParameterSelection[controlChannel] = controlValue + (rn.bitwiseAnd(this.channelParameterSelection[controlChannel], 16256) + 16384);
        }
        if (controller == 120) {
          this.allSoundOff(-23024, controlChannel);
        }
        if (controller == 121) {
          this.resetChannelControllers(107, controlChannel);
        }
        if (123 == controller) {
          this.allNotesOff(controlChannel, 0);
        }
        if (controller == 6) {
          selectedParameter = this.channelParameterSelection[controlChannel];
          if (16384 == selectedParameter) {
            this.channelPitchBendSensitivity[controlChannel] = rn.bitwiseAnd(-16257, this.channelPitchBendSensitivity[controlChannel]) + (controlValue << 7);
          }
        }
        if (38 == controller) {
          fineSelectedParameter = this.channelParameterSelection[controlChannel];
          if (fineSelectedParameter == 16384) {
            this.channelPitchBendSensitivity[controlChannel] = controlValue + rn.bitwiseAnd(-128, this.channelPitchBendSensitivity[controlChannel]);
          }
        }
        if (16 == controller) {
          this.channelSampleOffsets[controlChannel] = rn.bitwiseAnd(-16257, this.channelSampleOffsets[controlChannel]) + (controlValue << 7);
        }
        if (controller == 48) {
          this.channelSampleOffsets[controlChannel] = controlValue + rn.bitwiseAnd(this.channelSampleOffsets[controlChannel], -128);
        }
        if (controller == 81) {
          if (controlValue < 64) {
            this.resetRetriggerPhases(controlChannel, (byte) -66);
            this.channelFlags[controlChannel] = rn.bitwiseAnd(this.channelFlags[controlChannel], -5);
          } else {
            this.channelFlags[controlChannel] = AccountRegistrationDialog.bitwiseOr(this.channelFlags[controlChannel], 4);
          }
        }
        if (controller == 17) {
          this.setRetriggerRate(10287, controlChannel, (-16257 & this.channelRetriggerRates[controlChannel]) + (controlValue << 7));
        }
        if (controller == 49) {
          this.setRetriggerRate(10287, controlChannel, controlValue + (this.channelRetriggerRates[controlChannel] & -128));
          return;
        }
    }

    final synchronized void skip(int frameCount) {
        int timePerFrame;
        long endTime;
        int framesToEvent;
        int obfuscationControl;
        boolean renderRemainder = true;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.midiReader.isReady()) {
          timePerFrame = this.midiReader.division * this.timeScale / PcmPlayer.outputSampleRate;
          while (true) {
            endTime = this.playbackTime + (long)frameCount * (long)timePerFrame;
            if (-endTime + this.nextEventTime >= 0L) {
              this.playbackTime = endTime;
              break;
            }
            framesToEvent = (int)((-1L + ((long)timePerFrame - this.playbackTime) + this.nextEventTime) / (long)timePerFrame);
            this.playbackTime = this.playbackTime + (long)timePerFrame * (long)framesToEvent;
            this.patchStream.skip(framesToEvent);
            frameCount = frameCount - framesToEvent;
            this.processMidiEvents((byte) 36);
            if (this.midiReader.isReady()) {
              continue;
            }
            this.patchStream.skip(frameCount);
            renderRemainder = false;
            break;
          }
        }
        if (renderRemainder) {
          this.patchStream.skip(frameCount);
        }

    }

    private final void noteOn(int obfuscationGuard, int key, int velocity, int channel) {
        boolean looped = false;
        MusicPatchNode reusedNote;
        int previousPitch;
        PcmSample sample;
        MusicPatchNode newNote;
        MusicPatchNode previousGroupNote;
        int obfuscationControl;
        MusicPatch patch;
        MusicPatch patchAlias;
        MusicPatch patchLoopAlias;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.noteOff(obfuscationGuard, key, -44, channel);
        if ((2 & this.channelFlags[channel]) != 0) {
          reusedNote = (MusicPatchNode) (this.patchStream.notes.last((byte) -83));
          while (reusedNote != null) {
            if (reusedNote.channel == channel &&
              reusedNote.releaseTime < 0) {
              this.notesByKey[channel][reusedNote.key] = null;
              this.notesByKey[channel][key] = reusedNote;
              previousPitch = reusedNote.basePitch + (reusedNote.portamentoPitchDelta * reusedNote.portamentoScale >> 12);
              reusedNote.basePitch = reusedNote.basePitch + (key - reusedNote.key << 8);
              reusedNote.portamentoPitchDelta = -reusedNote.basePitch + previousPitch;
              reusedNote.key = key;
              reusedNote.portamentoScale = 4096;
              return;
            }
            reusedNote = (MusicPatchNode) (this.patchStream.notes.previous((byte) 60));
          }
        }
        patch = (MusicPatch) (this.patches.get(-22, (long)this.channelPrograms[channel]));
        patchAlias = patch;
        patchLoopAlias = patchAlias;
        if (patchAlias == null) {
          return;
        }
        sample = patch.samples[key];
        if (sample == null) {
          return;
        }
        newNote = new MusicPatchNode();
        newNote.sample = sample;
        newNote.patch = patchAlias;
        newNote.channel = channel;
        newNote.envelope = patch.envelopes[key];
        newNote.exclusiveGroup = patch.exclusiveGroups[key];
        newNote.key = key;
        newNote.velocityGain = 1024 + velocity * velocity * (patch.globalGain * patch.noteGains[key]) >> 11;
        newNote.notePan = 255 & patch.notePans[key];
        newNote.basePitch = (key << 8) - (32767 & patch.pitchAndLoopFlags[key]);
        newNote.decayTime = 0;
        newNote.releaseEnvelopeIndex = 0;
        newNote.releaseTime = -1;
        newNote.volumeEnvelopeIndex = 0;
        newNote.volumeEnvelopeTime = 0;
        if (this.channelSampleOffsets[channel] != 0) {
          newNote.stream = RawPcmStream.createAtStep(sample, this.noteStep(1370206316, newNote), 0, this.notePan((byte) -119, newNote));
          looped = !(0 <= patchLoopAlias.pitchAndLoopFlags[key]);
          this.applySampleOffset(looped, newNote, obfuscationGuard - 48);
        } else {
          newNote.stream = RawPcmStream.createAtStep(sample, this.noteStep(1370206316, newNote), this.noteVolume((byte) -110, newNote), this.notePan((byte) -117, newNote));
        }
        if (0 > patchLoopAlias.pitchAndLoopFlags[key]) {
          newNote.stream.setLoopCount(-1);
        }
        if (newNote.exclusiveGroup >= 0) {
          previousGroupNote = this.notesByGroup[channel][newNote.exclusiveGroup];
          if (previousGroupNote != null &&
            previousGroupNote.releaseTime < 0) {
            this.notesByKey[channel][previousGroupNote.key] = null;
            previousGroupNote.releaseTime = 0;
          }
          this.notesByGroup[channel][newNote.exclusiveGroup] = newNote;
        }
        this.patchStream.notes.addLast((byte) -119, (IntrusiveNode) (newNote));
        this.notesByKey[channel][key] = newNote;
        return;
    }

    final synchronized void playTrack(int obfuscationGuard, boolean loop, MusicTrack track) {
        try {
          this.startTrack(loop, (byte) -113, true, track);
          if (obfuscationGuard != 2) {
            this.skip(-44);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ih.S(" + obfuscationGuard + ',' + loop + ',' + (track != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void stopTrack(boolean stopSounds, int obfuscationGuard) {
        this.midiReader.release();
        this.pendingTrack = null;
        if (obfuscationGuard != -128) {
          MusicTrack unusedTrack = (MusicTrack) null;
          this.playTrack(-112, true, (MusicTrack) null);
        }
        this.resetState(true, stopSounds);
    }

    final synchronized boolean isPlaying(int obfuscationGuard) {
        if (obfuscationGuard != 11899) {
          this.channelRetriggerRates = (int[]) null;
        }
        return this.midiReader.isReady();
    }

    private final void resetRetriggerPhases(int channel, byte obfuscationGuard) {
        MusicPatchNode note = null;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int guardQuotient = -88 / ((obfuscationGuard - 1) / 57);
        if ((4 & this.channelFlags[channel]) != 0) {
          note = (MusicPatchNode) (this.patchStream.notes.first((byte) 107));
          while (note != null) {
            if (note.channel == channel) {
              note.retriggerPhase = 0;
            }
            note = (MusicPatchNode) (this.patchStream.notes.next((byte) 123));
          }
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RgbSprite var8 = null;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param2 = param2 << 8 | param2;
          var4_int = param2 ^ param2 >> 1;
          if (param0 >= -119) {
            field_R = (String) null;
          }
          for (var7 = 0; var7 < 4; var7++) {
            var6 = -64 + (param3 + (CachedArchiveProvider.field_y[var7][1] + (param2 & 3)));
            var5 = (var4_int & 7) + (CachedArchiveProvider.field_y[var7][0] + param1) - 44;
            var8 = tn.activeFoliageShadows[0 + param2 % 6];
            fe.a(var8, var5, var6);
            var4_int = var4_int >> 1;
            param2 = param2 >> 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4), "ih.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void setRetriggerRate(int obfuscationGuard, int channel, int rate) {
        this.channelRetriggerRates[channel] = rate;
        this.channelRetriggerSteps[channel] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)rate) * 2097152.0);
        if (obfuscationGuard != 10287) {
          this.noteOff(60, -113, 122, -42);
        }
    }

    private final int notePan(byte obfuscationGuard, MusicPatchNode note) {
        int pan = 0;
        RuntimeException failure = null;
        int guardQuotient = 0;
        int lowPan = 0;
        int highPan = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String noteDescription = null;
        RuntimeException caughtFailure = null;
        try {
          pan = this.channelPan[note.channel];
          guardQuotient = 78 / ((obfuscationGuard - 63) / 40);
          if (pan >= 8192) {
            highPan = 16384 - ((-pan + 16384) * (128 - note.notePan) + 32 >> 6);
            return highPan;
          }
          lowPan = 32 + pan * note.notePan >> 6;
          return lowPan;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ih.P(").append(obfuscationGuard).append(',');
          if (note == null) {
            noteDescription = "null";
          } else {
            noteDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(noteDescription).append(')').toString());
        }
    }

    private final void polyphonicPressure(int channel, byte obfuscationGuard, int key, int pressure) {
        if (obfuscationGuard <= 33) {
          this.setDefaultProgram(-79, 59, false);
        }
    }

    private final void resetState(boolean obfuscationGuard, boolean stopSounds) {
        int programChannel = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int unusedBankChannel;
        if (!obfuscationGuard) {
          return;
        }
        if (!stopSounds) {
          this.allNotesOff(-1, 0);
        } else {
          this.allSoundOff(-23024, -1);
        }
        this.resetChannelControllers(89, -1);
        for (programChannel = 0; programChannel < 16; programChannel++) {
          this.channelPrograms[programChannel] = this.channelDefaultPrograms[programChannel];
        }
        int bankChannel = 0;
        unusedBankChannel = bankChannel;
        while (bankChannel < 16) {
          this.channelBanks[bankChannel] = rn.bitwiseAnd(this.channelDefaultPrograms[bankChannel], -128);
          bankChannel++;
        }
    }

    final synchronized void setTimeScale(int scale, int obfuscationGuard) {
        if (obfuscationGuard >= -13) {
          this.channelRetriggerRates = (int[]) null;
        }
        this.timeScale = scale;
    }

    protected MidiPcmStream() {
        this.channelPortamentoTime = new int[16];
        this.channelModulation = new int[16];
        this.channelDefaultPrograms = new int[16];
        this.notesByKey = new MusicPatchNode[16][128];
        this.channelRetriggerRates = new int[16];
        this.channelFlags = new int[16];
        this.channelPitchBendSensitivity = new int[16];
        this.timeScale = 1000000;
        this.channelExpression = new int[16];
        this.masterVolume = 256;
        this.channelSampleOffsets = new int[16];
        this.channelPrograms = new int[16];
        this.channelVolume = new int[16];
        this.notesByGroup = new MusicPatchNode[16][128];
        this.channelRetriggerSteps = new int[16];
        this.channelPitchBend = new int[16];
        this.channelGain = new int[16];
        this.channelBanks = new int[16];
        this.channelPan = new int[16];
        this.channelParameterSelection = new int[16];
        this.midiReader = new MidiFileReader();
        this.patchStream = new MusicPatchPcmStream(this);
        this.patches = new NodeHashTable(128);
        this.setChannelGain(256, -1, (byte) -116);
        this.resetState(true, true);
    }

    MidiPcmStream(MidiPcmStream sharedPatchOwner) {
        this.channelPortamentoTime = new int[16];
        this.channelModulation = new int[16];
        this.channelDefaultPrograms = new int[16];
        this.notesByKey = new MusicPatchNode[16][128];
        this.channelRetriggerRates = new int[16];
        this.channelFlags = new int[16];
        this.channelPitchBendSensitivity = new int[16];
        this.timeScale = 1000000;
        this.channelExpression = new int[16];
        this.masterVolume = 256;
        this.channelSampleOffsets = new int[16];
        this.channelPrograms = new int[16];
        this.channelVolume = new int[16];
        this.notesByGroup = new MusicPatchNode[16][128];
        this.channelRetriggerSteps = new int[16];
        this.channelPitchBend = new int[16];
        this.channelGain = new int[16];
        this.channelBanks = new int[16];
        this.channelPan = new int[16];
        this.channelParameterSelection = new int[16];
        this.midiReader = new MidiFileReader();
        this.patchStream = new MusicPatchPcmStream(this);
        try {
          this.patches = sharedPatchOwner.patches;
          this.setChannelGain(256, -1, (byte) -70);
          this.resetState(true, true);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ih.<init>(" + (sharedPatchOwner != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        field_E = new int[4096];
        field_p = null;
        field_G = new byte[4096];
        for (var0 = 0; var0 < 4096; var0++) {
          field_E[var0] = 1;
          field_G[var0] = (byte)-128;
        }
        field_X = "Offensive account name";
        field_R = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
