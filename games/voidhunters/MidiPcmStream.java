/*
 * Decompiled by CFR-JS 0.4.0.
 */
class MidiPcmStream extends PcmStream {
    private int[] programs;
    private int masterVolume;
    private NodeHashTable patches;
    private int[] defaultPrograms;
    private MidiNote[][] notesByKey;
    private int[] modulation;
    private MidiFileReader midi;
    int[] sampleOffsets;
    private int playbackTimeScale;
    private int[] retriggerRateControl;
    private int[] banks;
    static byte[] field_N;
    private int[] parameterSelection;
    int[] channelFlags;
    private int[] channelGains;
    private int[] pitchBend;
    private MidiNote[][] notesByGroup;
    int[] retriggerPhaseIncrements;
    static int field_z;
    private int[] channelPan;
    private int[] portamentoTime;
    private int[] channelExpression;
    private int[] pitchBendSensitivity;
    private int[] channelVolume;
    private long currentTime;
    private int nextTrack;
    private long nextEventTime;
    private int nextTick;
    private MusicPatchPcmStream patchStream;
    private boolean loop;
    private boolean field_s;
    private int trackSwitchTick;
    private MusicTrack queuedTrack;

    private final void allSoundOff(int param0, int param1) {
        int var4 = VoidHunters.field_G;
        if (param0 != 144) {
          this.setPitchBend(80, 70, -74);
        }
        MidiNote var3 = (MidiNote) (this.patchStream.notes.first(0));
        while (var3 != null) {
          if (0 > param1 ||
            var3.channel == param1) {
            if (null != var3.stream) {
              var3.stream.fadeOut(AudioOutput.sampleRate / 100);
              if (var3.stream.isRamping()) {
                this.patchStream.fadingStreams.addSubStream(var3.stream);
              }
              var3.clearVoiceReferences(25804);
            }
            if (var3.releasePosition < 0) {
              this.notesByKey[var3.channel][var3.key] = null;
            }
            var3.unlink(param0 ^ -3990);
          }
          var3 = (MidiNote) (this.patchStream.notes.next((byte) 7));
        }
    }

    final synchronized void setDefaultProgram(int param0, byte param1, int param2) {
        this.initializeChannelProgram(param2, param0, param1 ^ 95);
        if (param1 != 96) {
          this.channelFlags = (int[]) null;
        }
    }

    private final void resetControllers(int param0, boolean param1) {
        int var4;
        var4 = VoidHunters.field_G;
        if (param0 < 0) {
          for (param0 = 0; param0 < 16; param0++) {
            this.resetControllers(param0, true);
          }
          return;
        }
        this.channelVolume[param0] = 12800;
        this.channelPan[param0] = 8192;
        this.channelExpression[param0] = 16383;
        this.pitchBend[param0] = 8192;
        this.modulation[param0] = 0;
        this.portamentoTime[param0] = 8192;
        if (!param1) {
          return;
        }
        this.releasePortamentoNotes(param0, (byte) -123);
        this.resetRetriggerPhase(param0, false);
        this.channelFlags[param0] = 0;
        this.parameterSelection[param0] = 32767;
        this.pitchBendSensitivity[param0] = 256;
        this.sampleOffsets[param0] = 0;
        this.setRetriggerRate(param0, 8192, 2);
    }

    private final void handlePolyphonicPressure(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
          this.resetControllers(-128, false);
        }
    }

    private final int calculatePitchStep(int param0, MidiNote param1) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        MidiEnvelope var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param1.basePitch + (param1.portamentoDelta * param1.portamentoProgress >> 12);
          var3_int = var3_int + (this.pitchBendSensitivity[param1.channel] * (-8192 + this.pitchBend[param1.channel]) >> 12);
          if (param0 < 7) {
            this.modulation = (int[]) null;
          }
          var4 = param1.envelope;
          if (var4.vibratoSpeed > 0 && (!(var4.vibratoDepth <= 0) ||
            0 < this.modulation[param1.channel])) {
            var5 = var4.vibratoDepth << 2;
            var6 = var4.vibratoDelay << 1;
            if (param1.age < var6) {
              var5 = param1.age * var5 / var6;
            }
            var5 = var5 + (this.modulation[param1.channel] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.vibratoPhase & 511));
            var3_int = var3_int + (int)((double)var5 * var7);
          }
          var5Lifetime1 = (int)(0.5 + (double)(param1.sample.sampleRate * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)AudioOutput.sampleRate);
          stackIn_12_0 = (var5Lifetime1 >= 1) ? var5Lifetime1 : 1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("hbb.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final synchronized void playTrack(boolean param0, MusicTrack param1, int param2) {
        if (param2 != -1) {
          return;
        }
        try {
          this.startTrack(param1, true, -11886, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hbb.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int calculatePan(int param0, MidiNote param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 9259) {
            this.firstSubStream();
          }
          var3_int = this.channelPan[param1.channel];
          if (var3_int >= 8192) {
            stackIn_6_0 = -((16384 - var3_int) * (-param1.pan + 128) + 32 >> 6) + 16384;
            return stackIn_6_0;
          }
          stackIn_4_0 = 32 + param1.pan * var3_int >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hbb.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void setProgram(int param0, int param1, int param2) {
        int var4 = 0;
        int discarded$0 = 0;
        int var5 = VoidHunters.field_G;
        if (this.programs[param0] != param2) {
          this.programs[param0] = param2;
          for (var4 = 0; var4 < 128; var4++) {
            this.notesByGroup[param0][var4] = null;
          }
        }
        if (param1 >= -16) {
          MidiNote var6 = (MidiNote) null;
          discarded$0 = this.calculatePitchStep(-85, (MidiNote) null);
        }
    }

    private final void setPitchBend(int param0, int param1, int param2) {
        if (param2 != 6889) {
          this.allSoundOff(-21, 97);
        }
        this.pitchBend[param0] = param1;
    }

    private final void handleChannelPressure(int param0, int param1, byte param2) {
        if (param2 != 72) {
          this.stop(false);
        }
    }

    final synchronized void setPlaybackTimeScale(byte param0, int param1) {
        if (param0 != 30) {
          MidiNote var4 = (MidiNote) null;
          this.applySampleOffset((MidiNote) null, true, false);
        }
        this.playbackTimeScale = param1;
    }

    final synchronized int getActivityWeight() {
        return 0;
    }

    final synchronized PcmStream nextSubStream() {
        return null;
    }

    final synchronized void clearPatchSampleIds(boolean param0) {
        int var3 = VoidHunters.field_G;
        MusicPatch var2 = (MusicPatch) (this.patches.first((byte) -123));
        if (param0) {
          MusicTrack var4 = (MusicTrack) null;
          this.startTrack((MusicTrack) null, true, -105, false);
        }
        while (var2 != null) {
          var2.clearSampleIds(0);
          var2 = (MusicPatch) (this.patches.next(-85));
        }
    }

    synchronized void startTrack(MusicTrack param0, boolean param1, int param2, boolean param3) {
        int discarded$0 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        try {
          this.stopAndReset(param1, true);
          this.midi.parse(param0.midi);
          this.currentTime = 0L;
          if (param2 != -11886) {
            MidiNote var8 = (MidiNote) null;
            discarded$0 = this.calculatePitchStep(113, (MidiNote) null);
          }
          this.loop = param3 ? true : false;
          var5_int = this.midi.getTrackCount();
          for (var6 = 0; var6 < var5_int; var6++) {
            this.midi.gotoTrack(var6);
            this.midi.readTrackDelta(var6);
            this.midi.markTrackPosition(var6);
          }
          this.nextTrack = this.midi.getNextTrack();
          this.nextTick = this.midi.trackTicks[this.nextTrack];
          this.nextEventTime = this.midi.getTickTime(this.nextTick);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hbb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized boolean loadMusicPatches(SoundCache param0, int param1, ResourceArchive param2, int param3, MusicTrack param4) {
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        ByteArrayNode var8 = null;
        int var9 = 0;
        MusicPatch var10 = null;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          param4.buildInstrumentUsage();
          var6_int = 1;
          var7 = null;
          if (param1 != -29476) {
            return false;
          }
          if (param3 > 0) {
            var7 = new int[]{param3};
          }
          var8 = (ByteArrayNode) (param4.instrumentUsage.first((byte) 126));
          while (var8 != null) {
            boolean decompiledFrameRemainder0 = true;
            var9 = (int)var8.key;
            var10 = (MusicPatch) (this.patches.get((long)var9, param1 ^ -29517));
            if (var10 == null) {
              var10 = waa.a(param2, (byte) 115, var9);
              if (var10 == null) {
                var6_int = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.patches.put((long)var9, var10, (byte) -122);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (!var10.loadSamples(1069, param0, (int[]) (var7), var8.value))) {
              var6_int = 0;
            }
            var8 = (ByteArrayNode) (param4.instrumentUsage.next(param1 ^ 29545));
          }
          if (var6_int != 0) {
            param4.clearInstrumentUsage();
          }
          stackIn_20_0 = var6_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("hbb.Q(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    private final void resetMidiState(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        int var3Lifetime1;
        if (param1) {
          this.allSoundOff(144, -1);
        } else {
          this.allNotesOff(0, -1);
        }
        this.resetControllers(-1, param0);
        for (var3 = 0; var3 < 16; var3++) {
          this.programs[var3] = this.defaultPrograms[var3];
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.banks[var5] = dla.a(this.defaultPrograms[var5], -128);
          var5++;
        }
    }

    final synchronized boolean isPlaying(int param0) {
        if (param0 >= -67) {
          field_N = (byte[]) null;
        }
        return this.midi.isReady();
    }

    final boolean updateNote(int param0, int[] param1, int param2, MidiNote param3, byte param4) {
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        MidiEnvelope var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          param3.samplesUntilUpdate = AudioOutput.sampleRate / 100;
          if (param3.releasePosition >= 0 && (param3.stream == null ||
            param3.stream.isOutOfBounds())) {
            param3.clearVoiceReferences(25804);
            param3.unlink(-3846);
            if (0 < param3.exclusiveGroup) {
              if (param3 != this.notesByGroup[param3.channel][param3.exclusiveGroup]) {
                return true;
              }
              this.notesByGroup[param3.channel][param3.exclusiveGroup] = null;
            }
            return true;
          }
          var6_int = param3.portamentoProgress;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.portamentoTime[param3.channel]) + 0.5);
            if (0 > var6_int) {
              var6_int = 0;
            }
            param3.portamentoProgress = var6_int;
          }
          param3.stream.setSpeed(this.calculatePitchStep(93, param3));
          var7 = param3.envelope;
          param3.age = param3.age + 1;
          param3.vibratoPhase = param3.vibratoPhase + var7.vibratoSpeed;
          var8 = 0;
          var9 = (double)((param3.key - 60 << 8) + (param3.portamentoProgress * param3.portamentoDelta >> 12)) * 0.000005086263020833333;
          if (0 < var7.decayRate) {
            if (0 >= var7.decayPitchScale) {
              param3.decayTime = param3.decayTime + 128;
            } else {
              param3.decayTime = param3.decayTime + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.decayPitchScale) * 128.0);
            }
            if (var7.decayRate * param3.decayTime >= 819200) {
              var8 = 1;
            }
          }
          if (var7.amplitudeEnvelope != null) {
            if (var7.envelopePitchScale <= 0) {
              param3.envelopePosition = param3.envelopePosition + 128;
            } else {
              param3.envelopePosition = param3.envelopePosition + (int)(128.0 * Math.pow(2.0, (double)var7.envelopePitchScale * var9) + 0.5);
            }
            while (param3.envelopeIndex < var7.amplitudeEnvelope.length - 2) {
              if ((var7.amplitudeEnvelope[param3.envelopeIndex + 2] << 8 & 65280) < param3.envelopePosition) {
                param3.envelopeIndex = param3.envelopeIndex + 2;
                continue;
              }
              break;
            }
            if (param3.envelopeIndex == -2 + var7.amplitudeEnvelope.length &&
              var7.amplitudeEnvelope[1 + param3.envelopeIndex] == 0) {
              var8 = 1;
            }
          }
          if (0 <= param3.releasePosition &&
            null != var7.releaseEnvelope &&
            0 == (1 & this.channelFlags[param3.channel]) && (!(param3.exclusiveGroup >= 0) ||
            param3 != this.notesByGroup[param3.channel][param3.exclusiveGroup])) {
            if (var7.releasePitchScale > 0) {
              param3.releasePosition = param3.releasePosition + (int)(Math.pow(2.0, (double)var7.releasePitchScale * var9) * 128.0 + 0.5);
            } else {
              param3.releasePosition = param3.releasePosition + 128;
            }
            while (param3.releaseEnvelopeIndex < var7.releaseEnvelope.length - 2) {
              if (param3.releasePosition > ((255 & var7.releaseEnvelope[2 + param3.releaseEnvelopeIndex]) << 8)) {
                param3.releaseEnvelopeIndex = param3.releaseEnvelopeIndex + 2;
                continue;
              }
              break;
            }
            if (param3.releaseEnvelopeIndex == var7.releaseEnvelope.length - 2) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            if (param4 >= -3) {
              this.midi = (MidiFileReader) null;
            }
            param3.stream.rampTo(param3.samplesUntilUpdate, this.calculateVolume(param3, 0), this.calculatePan(9259, param3));
            return false;
          }
          param3.stream.fadeOut(param3.samplesUntilUpdate);
          if (param1 == null) {
            param3.stream.skip(param2);
          } else {
            param3.stream.mix(param1, param0, param2);
          }
          if (param3.stream.isRamping()) {
            this.patchStream.fadingStreams.addSubStream(param3.stream);
          }
          param3.clearVoiceReferences(25804);
          if (param3.releasePosition >= 0) {
            param3.unlink(-3846);
            if (param3.exclusiveGroup > 0 &&
              this.notesByGroup[param3.channel][param3.exclusiveGroup] == param3) {
              this.notesByGroup[param3.channel][param3.exclusiveGroup] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_69_0 = var6;
          stackIn_69_1 = new StringBuilder().append("hbb.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param4).append(')').toString());
        }
    }

    private final synchronized void stopAndReset(boolean param0, boolean param1) {
        this.midi.clear();
        this.queuedTrack = null;
        this.resetMidiState(param1, param0);
        if (!param1) {
          this.channelExpression = (int[]) null;
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_N = null;
        if (!param0) {
          MidiPcmStream.clearSharedReferences(false);
        }
    }

    synchronized void setChannelGain(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = VoidHunters.field_G;
        if (param2 < 0) {
          for (var4 = 0; var4 < 16; var4++) {
            this.channelGains[var4] = param0;
          }
        } else {
          this.channelGains[param2] = param0;
        }
        if (param1 != 18) {
          field_z = 71;
        }
    }

    final synchronized void skip(int param0) {
        int var2;
        long var3;
        int var6;
        int var5;
        boolean decompiledFrameRemainder0 = true;
        var6 = VoidHunters.field_G;
        if (this.midi.isReady()) {
          var2 = this.midi.division * this.playbackTimeScale / AudioOutput.sampleRate;
          while (true) {
            var3 = (long)param0 * (long)var2 + this.currentTime;
            if (0L <= this.nextEventTime - var3) {
              this.currentTime = var3;
            } else {
              var5 = (int)((-1L + (long)var2 + (this.nextEventTime - this.currentTime)) / (long)var2);
              this.currentTime = this.currentTime + (long)var2 * (long)var5;
              param0 = param0 - var5;
              this.patchStream.skip(var5);
              this.processMidiEvents(-1);
              if (this.midi.isReady()) {
                continue;
              }
            }
            break;
          }
          this.patchStream.skip(param0);
          decompiledFrameRemainder0 = false;
        }
        else {
          this.patchStream.skip(param0);
        }

    }

    final synchronized PcmStream firstSubStream() {
        return (PcmStream) ((Object) this.patchStream);
    }

    private final int calculateVolume(MidiNote param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        MidiEnvelope var9 = null;
        MidiEnvelope var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.channelGains[param0.channel] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = param0.envelope;
          var10 = var9;
          var4 = this.channelVolume[param0.channel] * this.channelExpression[param0.channel] + 4096 >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + var4 * param0.velocityScale >> 15;
          var4 = this.masterVolume * var4 + 128 >> 8;
          var4 = var4 * this.channelGains[param0.channel] + 128 >> 8;
          if (param1 < var10.decayRate) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)param0.decayTime * 0.00001953125 * (double)var10.decayRate) + 0.5);
          }
          if (null != var10.amplitudeEnvelope) {
            var5 = param0.envelopePosition;
            var6 = var10.amplitudeEnvelope[1 + param0.envelopeIndex];
            if (var10.amplitudeEnvelope.length - 2 > param0.envelopeIndex) {
              var7 = (var9.amplitudeEnvelope[param0.envelopeIndex] & 255) << 8;
              var8 = (255 & var10.amplitudeEnvelope[2 + param0.envelopeIndex]) << 8;
              var6 = var6 + (-var6 + var10.amplitudeEnvelope[param0.envelopeIndex + 3]) * (var5 - var7) / (var8 - var7);
            }
            var4 = var4 * var6 + 32 >> 6;
          }
          if (0 < param0.releasePosition &&
            var10.releaseEnvelope != null) {
            var5Lifetime1 = param0.releasePosition;
            var6Lifetime1 = var10.releaseEnvelope[1 + param0.releaseEnvelopeIndex];
            if (param0.releaseEnvelopeIndex < var10.releaseEnvelope.length - 2) {
              var7Lifetime1 = var9.releaseEnvelope[param0.releaseEnvelopeIndex] << 8 & 65280;
              var8Lifetime1 = (255 & var10.releaseEnvelope[2 + param0.releaseEnvelopeIndex]) << 8;
              var6Lifetime1 = var6Lifetime1 + (var5Lifetime1 - var7Lifetime1) * (var10.releaseEnvelope[3 + param0.releaseEnvelopeIndex] - var6Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = var6Lifetime1 * var4 + 32 >> 6;
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("hbb.U(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getMasterVolume(int param0) {
        if (param0 != 127) {
          this.releasePortamentoNotes(31, (byte) -113);
        }
        return this.masterVolume;
    }

    final synchronized void stop(boolean param0) {
        this.stopAndReset(true, param0);
    }

    synchronized void mix(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = VoidHunters.field_G;
        try {
          if (this.midi.isReady()) {
            var4_int = this.playbackTimeScale * this.midi.division / AudioOutput.sampleRate;
            while (true) {
              var5 = this.currentTime + (long)param2 * (long)var4_int;
              if (-var5 + this.nextEventTime >= 0L) {
                this.currentTime = var5;
                break;
              }
              var7 = (int)((-1L + this.nextEventTime - this.currentTime + (long)var4_int) / (long)var4_int);
              this.currentTime = this.currentTime + (long)var7 * (long)var4_int;
              this.patchStream.mix(param0, param1, var7);
              param2 = param2 - var7;
              param1 = param1 + var7;
              this.processMidiEvents(-1);
              if (!this.midi.isReady()) {
                break;
              }
            }
          }
          this.patchStream.mix(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("hbb.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean isNoteInactive(MidiNote param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.stream != null) {
            if (param1 != 0) {
              this.channelFlags = (int[]) null;
            }
            return false;
          }
          if (param0.releasePosition >= 0) {
            param0.unlink(-3846);
            if (param0.exclusiveGroup > 0 &&
              param0 == this.notesByGroup[param0.channel][param0.exclusiveGroup]) {
              this.notesByGroup[param0.channel][param0.exclusiveGroup] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("hbb.AB(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void setRetriggerRate(int param0, int param1, int param2) {
        this.retriggerRateControl[param0] = param1;
        this.retriggerPhaseIncrements[param0] = (int)(0.5 + Math.pow((double)param2, (double)param1 * 0.00054931640625) * 2097152.0);
    }

    private final void resetRetriggerPhase(int param0, boolean param1) {
        MidiNote var3 = null;
        int var4 = VoidHunters.field_G;
        if (param1) {
          this.loop = true;
        }
        if ((4 & this.channelFlags[param0]) != 0) {
          var3 = (MidiNote) (this.patchStream.notes.first(0));
          while (var3 != null) {
            if (param0 == var3.channel) {
              var3.retriggerPhase = 0;
            }
            var3 = (MidiNote) (this.patchStream.notes.next((byte) 117));
          }
        }
    }

    private final void handleMidiMessage(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var4Lifetime3Lifetime1;
        int var4Lifetime3Lifetime2;
        int var5Lifetime3Lifetime1;
        int var5Lifetime3Lifetime2;
        var8 = VoidHunters.field_G;
        var3 = param0 & 240;
        if (128 == var3) {
          var4 = 15 & param0;
          var5 = 127 & param0 >> 8;
          var6 = (param0 & 8342805) >> 16;
          this.noteOff(var6, var5, var4, (byte) 127);
          return;
        }
        if (144 == var3) {
          var4Lifetime1 = param0 & 15;
          var5Lifetime1 = (param0 & 32621) >> 8;
          var6Lifetime1 = 127 & param0 >> 16;
          if (var6Lifetime1 <= 0) {
            this.noteOff(64, var5Lifetime1, var4Lifetime1, (byte) 84);
          } else {
            this.noteOn(var6Lifetime1, -21459, var5Lifetime1, var4Lifetime1);
          }
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = 15 & param0;
          var5Lifetime2 = param0 >> 8 & 127;
          var6Lifetime2 = (8343323 & param0) >> 16;
          this.handlePolyphonicPressure(var6Lifetime2, var5Lifetime2, true, var4Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (param1 != -19172) {
            return;
          }
          if (var3 == 192) {
            var4Lifetime3 = param0 & 15;
            var5Lifetime3 = param0 >> 8 & 127;
            this.setProgram(var4Lifetime3, -105, this.banks[var4Lifetime3] + var5Lifetime3);
            return;
          }
          if (208 == var3) {
            var4Lifetime3Lifetime1 = 15 & param0;
            var5Lifetime3Lifetime1 = (32717 & param0) >> 8;
            this.handleChannelPressure(var5Lifetime3Lifetime1, var4Lifetime3Lifetime1, (byte) 72);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = param0 & 15;
            var5Lifetime3Lifetime2 = (16256 & param0 >> 9) + (127 & param0 >> 8);
            this.setPitchBend(var4Lifetime3Lifetime2, var5Lifetime3Lifetime2, 6889);
            return;
          }
          var3 = 255 & param0;
          if (var3 != 255) {
            return;
          }
          this.resetMidiState(true, true);
          return;
        }
        var4Lifetime4 = param0 & 15;
        var5Lifetime4 = (param0 & 32715) >> 8;
        var6Lifetime3 = (param0 & 8340936) >> 16;
        if (0 == var5Lifetime4) {
          this.banks[var4Lifetime4] = (var6Lifetime3 << 14) + dla.a(this.banks[var4Lifetime4], -2080769);
        }
        if (var5Lifetime4 == 32) {
          this.banks[var4Lifetime4] = dla.a(-16257, this.banks[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (1 == var5Lifetime4) {
          this.modulation[var4Lifetime4] = dla.a(-16257, this.modulation[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 33) {
          this.modulation[var4Lifetime4] = dla.a(-128, this.modulation[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 5) {
          this.portamentoTime[var4Lifetime4] = dla.a(this.portamentoTime[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 37) {
          this.portamentoTime[var4Lifetime4] = dla.a(this.portamentoTime[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 7) {
          this.channelVolume[var4Lifetime4] = (var6Lifetime3 << 7) + dla.a(this.channelVolume[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 39) {
          this.channelVolume[var4Lifetime4] = dla.a(-128, this.channelVolume[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 10) {
          this.channelPan[var4Lifetime4] = (var6Lifetime3 << 7) + dla.a(this.channelPan[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 42) {
          this.channelPan[var4Lifetime4] = dla.a(this.channelPan[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 11) {
          this.channelExpression[var4Lifetime4] = dla.a(-16257, this.channelExpression[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 43) {
          this.channelExpression[var4Lifetime4] = dla.a(this.channelExpression[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 64) {
          if (var6Lifetime3 >= 64) {
            this.channelFlags[var4Lifetime4] = SetAngularForceDownshift.a(this.channelFlags[var4Lifetime4], 1);
          } else {
            this.channelFlags[var4Lifetime4] = dla.a(this.channelFlags[var4Lifetime4], -2);
          }
        }
        if (65 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.releasePortamentoNotes(var4Lifetime4, (byte) -89);
            this.channelFlags[var4Lifetime4] = dla.a(this.channelFlags[var4Lifetime4], -3);
          } else {
            this.channelFlags[var4Lifetime4] = SetAngularForceDownshift.a(this.channelFlags[var4Lifetime4], 2);
          }
        }
        if (99 == var5Lifetime4) {
          this.parameterSelection[var4Lifetime4] = (var6Lifetime3 << 7) + dla.a(127, this.parameterSelection[var4Lifetime4]);
        }
        if (var5Lifetime4 == 98) {
          this.parameterSelection[var4Lifetime4] = var6Lifetime3 + dla.a(this.parameterSelection[var4Lifetime4], 16256);
        }
        if (var5Lifetime4 == 101) {
          this.parameterSelection[var4Lifetime4] = (var6Lifetime3 << 7) + 16384 + dla.a(this.parameterSelection[var4Lifetime4], 127);
        }
        if (100 == var5Lifetime4) {
          this.parameterSelection[var4Lifetime4] = var6Lifetime3 + dla.a(this.parameterSelection[var4Lifetime4], 16256) + 16384;
        }
        if (var5Lifetime4 == 120) {
          this.allSoundOff(144, var4Lifetime4);
        }
        if (var5Lifetime4 == 121) {
          this.resetControllers(var4Lifetime4, true);
        }
        if (123 == var5Lifetime4) {
          this.allNotesOff(0, var4Lifetime4);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.parameterSelection[var4Lifetime4];
          if (var7 == 16384) {
            this.pitchBendSensitivity[var4Lifetime4] = (var6Lifetime3 << 7) + dla.a(-16257, this.pitchBendSensitivity[var4Lifetime4]);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.parameterSelection[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.pitchBendSensitivity[var4Lifetime4] = var6Lifetime3 + dla.a(-128, this.pitchBendSensitivity[var4Lifetime4]);
          }
        }
        if (var5Lifetime4 == 16) {
          this.sampleOffsets[var4Lifetime4] = (var6Lifetime3 << 7) + dla.a(-16257, this.sampleOffsets[var4Lifetime4]);
        }
        if (var5Lifetime4 == 48) {
          this.sampleOffsets[var4Lifetime4] = dla.a(this.sampleOffsets[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 81) {
          if (var6Lifetime3 >= 64) {
            this.channelFlags[var4Lifetime4] = SetAngularForceDownshift.a(this.channelFlags[var4Lifetime4], 4);
          } else {
            this.resetRetriggerPhase(var4Lifetime4, false);
            this.channelFlags[var4Lifetime4] = dla.a(this.channelFlags[var4Lifetime4], -5);
          }
        }
        if (var5Lifetime4 == 17) {
          this.setRetriggerRate(var4Lifetime4, (var6Lifetime3 << 7) + (this.retriggerRateControl[var4Lifetime4] & -16257), param1 + 19174);
        }
        if (49 == var5Lifetime4) {
          this.setRetriggerRate(var4Lifetime4, (this.retriggerRateControl[var4Lifetime4] & -128) + var6Lifetime3, param1 ^ -19170);
          return;
        }
    }

    private final void noteOff(int param0, int param1, int param2, byte param3) {
        MidiNote var6 = null;
        int var7 = VoidHunters.field_G;
        if (param3 <= 73) {
          this.playbackTimeScale = -82;
        }
        MidiNote var8 = this.notesByKey[param2][param1];
        if (var8 == null) {
          return;
        }
        this.notesByKey[param2][param1] = null;
        if ((2 & this.channelFlags[param2]) == 0) {
          var8.releasePosition = 0;
        } else {
          var6 = (MidiNote) (this.patchStream.notes.first(0));
          while (var6 != null) {
            if (var8.channel == var6.channel &&
              var6.releasePosition < 0 &&
              var8 != var6) {
              var8.releasePosition = 0;
              break;
            }
            var6 = (MidiNote) (this.patchStream.notes.next((byte) 96));
          }
        }
    }

    private final void processMidiEvents(int param0) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = VoidHunters.field_G;
        var2 = this.nextTrack;
        var3 = this.nextTick;
        var4 = this.nextEventTime;
        if (null != this.queuedTrack &&
          this.trackSwitchTick == var3) {
          this.startTrack(this.queuedTrack, this.field_s, -11886, this.loop);
          this.processMidiEvents(param0 + 0);
          return;
        }
        if (param0 != -1) {
          this.nextSubStream();
        }
        while (true) {
          if (var3 != this.nextTick) {
            this.nextTrack = var2;
            this.nextTick = var3;
            this.nextEventTime = var4;
            if (null != this.queuedTrack) {
              stackIn_23_0 = ~var3;
              stackIn_23_1 = ~this.trackSwitchTick;
              if (stackIn_23_0 < stackIn_23_1) {
                this.nextTick = this.trackSwitchTick;
                this.nextTrack = -1;
                this.nextEventTime = this.midi.getTickTime(this.nextTick);
              }
            }
            return;
          }
          while (~this.midi.trackTicks[var2] == ~var3) {
            this.midi.gotoTrack(var2);
            var6 = this.midi.readMessage(var2);
            if (1 != var6) {
              if ((var6 & 128) != 0) {
                this.handleMidiMessage(var6, param0 - 19171);
              }
              this.midi.readTrackDelta(var2);
              this.midi.markTrackPosition(var2);
              continue;
            }
            this.midi.setTrackDone();
            this.midi.markTrackPosition(var2);
            if (this.midi.isDone()) {
              if (null != this.queuedTrack) {
                this.playTrack(this.loop, this.queuedTrack, param0 ^ 0);
                this.processMidiEvents(-1);
                return;
              }
              if (this.loop &&
                var3 != 0) {
                this.midi.reset(var4);
              } else {
                this.resetMidiState(true, true);
                this.midi.clear();
                return;
              }
            }
            break;
          }
          var2 = this.midi.getNextTrack();
          var3 = this.midi.trackTicks[var2];
          var4 = this.midi.getTickTime(var3);
        }
    }

    final void applySampleOffset(MidiNote param0, boolean param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        try {
          if (!param2) {
            this.notesByKey = (MidiNote[][]) null;
          }
          var4_int = param0.sample.samples.length;
          if (param1 &&
            param0.sample.pingPongLoop) {
            var6 = -param0.sample.loopStart + (var4_int + var4_int);
            var4_int = var4_int << 8;
            var5 = (int)((long)this.sampleOffsets[param0.channel] * (long)var6 >> 6);
            if (var4_int <= var5) {
              var5 = -var5 + var4_int + var4_int - 1;
              param0.stream.setReverse(true);
            }
          } else {
            var5 = (int)((long)this.sampleOffsets[param0.channel] * (long)var4_int >> 6);
          }
          param0.stream.setPosition(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("hbb.RA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void releasePortamentoNotes(int param0, byte param1) {
        MidiNote var3 = null;
        int var4 = VoidHunters.field_G;
        if ((this.channelFlags[param0] & 2) != 0) {
          var3 = (MidiNote) (this.patchStream.notes.first(0));
          while (var3 != null) {
            if (~var3.channel == ~param0 &&
              null == this.notesByKey[param0][var3.key] &&
              var3.releasePosition < 0) {
              var3.releasePosition = 0;
            }
            var3 = (MidiNote) (this.patchStream.notes.next((byte) 78));
          }
        }
        if (param1 > -60) {
          this.setChannelGain(121, (byte) 19, -123);
        }
    }

    private final void noteOn(int param0, int param1, int param2, int param3) {
        MidiNote stackIn_17_1 = null;
        boolean stackIn_18_2 = false;
        MidiNote var5;
        int var6_int;
        PcmSample var6;
        MidiNote var7;
        MidiNote var8;
        int var9;
        MusicPatch var10;
        MusicPatch var11;
        var9 = VoidHunters.field_G;
        this.noteOff(64, param2, param3, (byte) 110);
        if (0 != (this.channelFlags[param3] & 2)) {
          var5 = (MidiNote) (this.patchStream.notes.last((byte) 122));
          while (var5 != null) {
            if (var5.channel == param3 &&
              var5.releasePosition < 0) {
              this.notesByKey[param3][var5.key] = null;
              this.notesByKey[param3][param2] = var5;
              var6_int = (var5.portamentoDelta * var5.portamentoProgress >> 12) + var5.basePitch;
              var5.basePitch = var5.basePitch + (-var5.key + param2 << 8);
              var5.key = param2;
              var5.portamentoProgress = 4096;
              var5.portamentoDelta = var6_int - var5.basePitch;
              return;
            }
            var5 = (MidiNote) (this.patchStream.notes.previous(param1 - 1155545385));
          }
        }
        var10 = (MusicPatch) (this.patches.get((long)this.programs[param3], 103));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.samples[param2];
        if (var6 == null) {
          return;
        }
        var7 = new MidiNote();
        var7.patch = var11;
        var7.sample = var6;
        var7.channel = param3;
        var7.envelope = var10.envelopes[param2];
        var7.exclusiveGroup = var10.exclusiveGroups[param2];
        var7.key = param2;
        var7.velocityScale = var10.keyVolumes[param2] * (var11.volume * (param0 * param0)) + 1024 >> 11;
        var7.pan = var10.keyPans[param2] & 255;
        var7.basePitch = (param2 << 8) - (32767 & var10.pitchOffsets[param2]);
        var7.releasePosition = -1;
        var7.decayTime = 0;
        var7.envelopeIndex = 0;
        var7.releaseEnvelopeIndex = 0;
        var7.envelopePosition = 0;
        if (this.sampleOffsets[param3] != 0) {
          var7.stream = PcmSampleStream.createRaw(var6, this.calculatePitchStep(92, var7), 0, this.calculatePan(9259, var7));
          stackIn_17_1 = var7;
          stackIn_18_2 = !(var11.pitchOffsets[param2] >= 0);
          this.applySampleOffset(stackIn_17_1, stackIn_18_2, true);
        } else {
          var7.stream = PcmSampleStream.createRaw(var6, this.calculatePitchStep(param1 ^ -21404, var7), this.calculateVolume(var7, 0), this.calculatePan(9259, var7));
        }
        if (var11.pitchOffsets[param2] < 0) {
          var7.stream.setLoopCount(-1);
        }
        if (var7.exclusiveGroup >= 0) {
          var8 = this.notesByGroup[param3][var7.exclusiveGroup];
          if (var8 != null &&
            var8.releasePosition < 0) {
            this.notesByKey[param3][var8.key] = null;
            var8.releasePosition = 0;
          }
          this.notesByGroup[param3][var7.exclusiveGroup] = var7;
        }
        if (param1 != -21459) {
          this.setPitchBend(84, -87, 32);
        }
        this.patchStream.notes.addLast(-10258, var7);
        this.notesByKey[param3][param2] = var7;
        return;
    }

    private final void initializeChannelProgram(int param0, int param1, int param2) {
        this.defaultPrograms[param0] = param1;
        this.banks[param0] = dla.a(-128, param1);
        this.setProgram(param0, -81, param1);
        if (param2 <= 0) {
          this.getMasterVolume(26);
        }
    }

    final synchronized void setMasterVolume(int param0, byte param1) {
        this.masterVolume = param0;
        if (param1 != 14) {
          this.channelPan = (int[]) null;
        }
    }

    private final void allNotesOff(int param0, int param1) {
        int var4 = VoidHunters.field_G;
        MidiNote var3 = (MidiNote) (this.patchStream.notes.first(param0));
        while (var3 != null) {
          if ((param1 < 0 || var3.channel == param1) &&
            0 > var3.releasePosition) {
            this.notesByKey[var3.channel][var3.key] = null;
            var3.releasePosition = 0;
          }
          var3 = (MidiNote) (this.patchStream.notes.next((byte) 10));
        }
    }

    public MidiPcmStream() {
        this.modulation = new int[16];
        this.masterVolume = 256;
        this.notesByKey = new MidiNote[16][128];
        this.retriggerRateControl = new int[16];
        this.sampleOffsets = new int[16];
        this.playbackTimeScale = 1000000;
        this.banks = new int[16];
        this.notesByGroup = new MidiNote[16][128];
        this.pitchBend = new int[16];
        this.retriggerPhaseIncrements = new int[16];
        this.channelGains = new int[16];
        this.channelPan = new int[16];
        this.channelFlags = new int[16];
        this.parameterSelection = new int[16];
        this.programs = new int[16];
        this.channelExpression = new int[16];
        this.portamentoTime = new int[16];
        this.pitchBendSensitivity = new int[16];
        this.defaultPrograms = new int[16];
        this.channelVolume = new int[16];
        this.midi = new MidiFileReader();
        this.patchStream = new MusicPatchPcmStream(this);
        this.patches = new NodeHashTable(128);
        this.setChannelGain(256, (byte) 18, -1);
        this.resetMidiState(true, true);
    }

    MidiPcmStream(MidiPcmStream param0) {
        this.modulation = new int[16];
        this.masterVolume = 256;
        this.notesByKey = new MidiNote[16][128];
        this.retriggerRateControl = new int[16];
        this.sampleOffsets = new int[16];
        this.playbackTimeScale = 1000000;
        this.banks = new int[16];
        this.notesByGroup = new MidiNote[16][128];
        this.pitchBend = new int[16];
        this.retriggerPhaseIncrements = new int[16];
        this.channelGains = new int[16];
        this.channelPan = new int[16];
        this.channelFlags = new int[16];
        this.parameterSelection = new int[16];
        this.programs = new int[16];
        this.channelExpression = new int[16];
        this.portamentoTime = new int[16];
        this.pitchBendSensitivity = new int[16];
        this.defaultPrograms = new int[16];
        this.channelVolume = new int[16];
        this.midi = new MidiFileReader();
        this.patchStream = new MusicPatchPcmStream(this);
        try {
          this.patches = param0.patches;
          this.setChannelGain(256, (byte) 18, -1);
          this.resetMidiState(true, true);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hbb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = new byte[520];
        field_z = 0;
    }
}
