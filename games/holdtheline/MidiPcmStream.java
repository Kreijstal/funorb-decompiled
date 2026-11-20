/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiPcmStream extends PcmStream {
    int[] retriggerPhaseSteps;
    private int[] channelGains;
    private int[] channelPans;
    static String field_q;
    private MidiFileReader midiReader;
    private int[] pitchBendRanges;
    private int[] channelExpressions;
    private int masterVolume;
    private int[] defaultPrograms;
    static int field_F;
    static int field_H;
    private int[] channelPrograms;
    private int[] channelModulations;
    private NodeHashTable patchCache;
    int[] channelFlags;
    static int[] field_T;
    private MidiNote[][] exclusiveGroupNotes;
    private int[] channelBanks;
    private int[] portamentoTimes;
    private int[] parameterSelectors;
    static FullscreenFocusCanvas field_U;
    private int[] retriggerRates;
    private int[] pitchBends;
    private MidiNote[][] keyedNotes;
    private int playbackTimeScale;
    private int[] channelVolumes;
    int[] sampleOffsets;
    private MusicPatchPcmStream patchStream;
    private long nextEventTime;
    private boolean loopTrack;
    private int nextEventTick;
    private long playbackTime;
    private int nextEventTrack;
    private int queuedTrackTick;
    private MusicTrack queuedTrack;
    private boolean stopNotesForQueuedTrack;

    private final void dispatchMidiMessage(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = HoldTheLine.field_D;
        var3 = param1 & 240;
        if (var3 == 128) {
          var4 = param1 & 15;
          var5 = (param1 & 32716) >> 8;
          var6 = (param1 & 8325097) >> 16;
          this.noteOff(var5, var6, var4, 26410);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = 127 & param1 >> 8;
          var6Lifetime1 = (8371051 & param1) >> 16;
          if (var6Lifetime1 <= 0) {
            this.noteOff(var5Lifetime1, 64, var4Lifetime1, 26410);
            return;
          }
          this.noteOn(var6Lifetime1, var4Lifetime1, var5Lifetime1, (byte) 108);
        } else {
          if (var3 == 160) {
            var4Lifetime1 = param1 & 15;
            var5Lifetime1 = 127 & param1 >> 8;
            var6Lifetime1 = 127 & param1 >> 16;
            this.polyphonicPressure(var5Lifetime1, var6Lifetime1, param0 ^ -14275, var4Lifetime1);
            return;
          }
          if (var3 != 176) {
            if (192 == var3) {
              var4Lifetime1 = param1 & 15;
              var5Lifetime1 = 127 & param1 >> 8;
              this.programChange(param0 + 14189, var5Lifetime1 + this.channelBanks[var4Lifetime1], var4Lifetime1);
              return;
            }
            if (var3 == 208) {
              var4Lifetime1 = 15 & param1;
              var5Lifetime1 = param1 >> 8 & 127;
              this.channelPressure(param0 ^ 14287, var5Lifetime1, var4Lifetime1);
              return;
            }
            if (var3 == 224) {
              var4Lifetime1 = 15 & param1;
              var5Lifetime1 = ((param1 & 8323286) >> 9) + ((param1 & 32634) >> 8);
              this.pitchBend(var5Lifetime1, var4Lifetime1, (byte) -116);
              return;
            }
            if (param0 != -14238) {
              return;
            }
            var3 = param1 & 255;
            if (var3 != 255) {
              return;
            }
            this.resetMidiState(16, true);
            return;
          }
          var4Lifetime1 = param1 & 15;
          var5Lifetime1 = (32552 & param1) >> 8;
          var6Lifetime1 = 127 & param1 >> 16;
          if (var5Lifetime1 == 0) {
            this.channelBanks[var4Lifetime1] = LoginChoicePanel.andInts(-2080769, this.channelBanks[var4Lifetime1]) + (var6Lifetime1 << 14);
          }
          if (32 == var5Lifetime1) {
            this.channelBanks[var4Lifetime1] = (var6Lifetime1 << 7) + LoginChoicePanel.andInts(this.channelBanks[var4Lifetime1], -16257);
          }
          if (1 == var5Lifetime1) {
            this.channelModulations[var4Lifetime1] = LoginChoicePanel.andInts(-16257, this.channelModulations[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (33 == var5Lifetime1) {
            this.channelModulations[var4Lifetime1] = var6Lifetime1 + LoginChoicePanel.andInts(-128, this.channelModulations[var4Lifetime1]);
          }
          if (var5Lifetime1 == 5) {
            this.portamentoTimes[var4Lifetime1] = LoginChoicePanel.andInts(this.portamentoTimes[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 37) {
            this.portamentoTimes[var4Lifetime1] = LoginChoicePanel.andInts(-128, this.portamentoTimes[var4Lifetime1]) + var6Lifetime1;
          }
          if (7 == var5Lifetime1) {
            this.channelVolumes[var4Lifetime1] = LoginChoicePanel.andInts(this.channelVolumes[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 39) {
            this.channelVolumes[var4Lifetime1] = var6Lifetime1 + LoginChoicePanel.andInts(-128, this.channelVolumes[var4Lifetime1]);
          }
          if (var5Lifetime1 == 10) {
            this.channelPans[var4Lifetime1] = (var6Lifetime1 << 7) + LoginChoicePanel.andInts(-16257, this.channelPans[var4Lifetime1]);
          }
          if (42 == var5Lifetime1) {
            this.channelPans[var4Lifetime1] = var6Lifetime1 + LoginChoicePanel.andInts(this.channelPans[var4Lifetime1], -128);
          }
          if (var5Lifetime1 == 11) {
            this.channelExpressions[var4Lifetime1] = LoginChoicePanel.andInts(-16257, this.channelExpressions[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 43) {
            this.channelExpressions[var4Lifetime1] = var6Lifetime1 + LoginChoicePanel.andInts(-128, this.channelExpressions[var4Lifetime1]);
          }
          if (var5Lifetime1 == 64) {
            if (var6Lifetime1 < 64) {
              this.channelFlags[var4Lifetime1] = LoginChoicePanel.andInts(this.channelFlags[var4Lifetime1], -2);
            } else {
              this.channelFlags[var4Lifetime1] = BitwiseIntegerOperations.orInts(this.channelFlags[var4Lifetime1], 1);
            }
          }
          if (var5Lifetime1 == 65) {
            if (var6Lifetime1 >= 64) {
              this.channelFlags[var4Lifetime1] = BitwiseIntegerOperations.orInts(this.channelFlags[var4Lifetime1], 2);
            } else {
              this.releasePortamentoNotes(var4Lifetime1, 2097152);
              this.channelFlags[var4Lifetime1] = LoginChoicePanel.andInts(this.channelFlags[var4Lifetime1], -3);
            }
          }
          if (var5Lifetime1 == 99) {
            this.parameterSelectors[var4Lifetime1] = (var6Lifetime1 << 7) + LoginChoicePanel.andInts(127, this.parameterSelectors[var4Lifetime1]);
          }
          if (var5Lifetime1 == 98) {
            this.parameterSelectors[var4Lifetime1] = LoginChoicePanel.andInts(this.parameterSelectors[var4Lifetime1], 16256) + var6Lifetime1;
          }
          if (var5Lifetime1 == 101) {
            this.parameterSelectors[var4Lifetime1] = 16384 + LoginChoicePanel.andInts(127, this.parameterSelectors[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 100) {
            this.parameterSelectors[var4Lifetime1] = 16384 + (LoginChoicePanel.andInts(16256, this.parameterSelectors[var4Lifetime1]) + var6Lifetime1);
          }
          if (var5Lifetime1 == 120) {
            this.allSoundsOff(var4Lifetime1, (byte) -120);
          }
          if (var5Lifetime1 == 121) {
            this.resetControllers(var4Lifetime1, (byte) -33);
          }
          if (123 == var5Lifetime1) {
            this.allNotesOff(var4Lifetime1, 95);
          }
          if (var5Lifetime1 == 6) {
            var7 = this.parameterSelectors[var4Lifetime1];
            if (var7 == 16384) {
              this.pitchBendRanges[var4Lifetime1] = LoginChoicePanel.andInts(this.pitchBendRanges[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
            }
          }
          if (38 == var5Lifetime1) {
            var7Lifetime1 = this.parameterSelectors[var4Lifetime1];
            if (var7Lifetime1 == 16384) {
              this.pitchBendRanges[var4Lifetime1] = LoginChoicePanel.andInts(this.pitchBendRanges[var4Lifetime1], -128) + var6Lifetime1;
            }
          }
          if (var5Lifetime1 == 16) {
            this.sampleOffsets[var4Lifetime1] = LoginChoicePanel.andInts(-16257, this.sampleOffsets[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 48) {
            this.sampleOffsets[var4Lifetime1] = LoginChoicePanel.andInts(this.sampleOffsets[var4Lifetime1], -128) + var6Lifetime1;
          }
          if (81 == var5Lifetime1) {
            if (64 > var6Lifetime1) {
              this.resetRetriggerPhases((byte) 91, var4Lifetime1);
              this.channelFlags[var4Lifetime1] = LoginChoicePanel.andInts(this.channelFlags[var4Lifetime1], -5);
            } else {
              this.channelFlags[var4Lifetime1] = BitwiseIntegerOperations.orInts(this.channelFlags[var4Lifetime1], 4);
            }
          }
          if (var5Lifetime1 == 17) {
            this.setRetriggerRate(param0 ^ 14237, var4Lifetime1, (-16257 & this.retriggerRates[var4Lifetime1]) + (var6Lifetime1 << 7));
          }
          if (var5Lifetime1 == 49) {
            this.setRetriggerRate(-1, var4Lifetime1, var6Lifetime1 + (this.retriggerRates[var4Lifetime1] & -128));
            return;
          }
        }
    }

    final synchronized void setMasterVolume(int param0, boolean param1) {
        this.masterVolume = param0;
        if (param1) {
          CharSequence var4 = (CharSequence) null;
          MidiPcmStream.normalizeAccountName((CharSequence) null, (byte) -9);
        }
    }

    final synchronized void discardPatchSampleIds(int param0) {
        int var3 = HoldTheLine.field_D;
        MusicPatch var4 = (MusicPatch) (this.patchCache.first(param0));
        while (var4 != null) {
          var4.discardSampleIds(-8346);
          var4 = (MusicPatch) (this.patchCache.next(-1));
        }
    }

    final synchronized PcmStream nextSubStream() {
        return null;
    }

    private final void allSoundsOff(int param0, byte param1) {
        int var4 = HoldTheLine.field_D;
        if (param1 >= -111) {
          field_F = 43;
        }
        MidiNote var3 = (MidiNote) (this.patchStream.notes.first((byte) 101));
        while (var3 != null) {
          if (param0 < 0 ||
            var3.channel == param0) {
            if (var3.sampleStream != null) {
              var3.sampleStream.fadeOutAndRemove(AudioOutput.sampleRate / 100);
              if (var3.sampleStream.isRamping()) {
                this.patchStream.fadeMixer.addSubStream(var3.sampleStream);
              }
              var3.clearVoiceReferences((byte) -110);
            }
            if (!(var3.releaseTime >= 0)) {
              this.keyedNotes[var3.channel][var3.key] = null;
            }
            var3.unlink(0);
          }
          var3 = (MidiNote) (this.patchStream.notes.next((byte) -52));
        }
    }

    final synchronized boolean loadTrackPatches(int param0, SoundCache param1, MusicTrack param2, boolean param3, ResourceArchive param4) {
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        MidiKeyUsage var8 = null;
        int var9 = 0;
        int var11 = 0;
        MusicPatch var12 = null;
        MusicPatch var13 = null;
        var11 = HoldTheLine.field_D;
        try {
          param2.buildPatchUsage();
          if (param3) {
            this.nextEventTime = 89L;
          }
          var6_int = 1;
          var7 = null;
          if (0 < param0) {
            var7 = new int[]{param0};
          }
          var8 = (MidiKeyUsage) (param2.field_i.first(0));
          while (var8 != null) {
            boolean decompiledFrameRemainder0 = true;
            var9 = (int)var8.key;
            var12 = (MusicPatch) (this.patchCache.get((byte) 124, (long)var9));
            if (var12 == null) {
              var13 = RoadFillRenderer.loadMusicPatch(param4, 65535, var9);
              if (var13 == null) {
                var6_int = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.patchCache.put(var13, (long)var9, param3);
                decompiledFrameRemainder0 = !(var13.loadSamples(90, (int[]) (var7), var8.field_k, param1));
              }
            } else {
              decompiledFrameRemainder0 = !(var12.loadSamples(90, (int[]) (var7), var8.field_k, param1));
            }
            if (decompiledFrameRemainder0) {
              var6_int = 0;
            }
            var8 = (MidiKeyUsage) (param2.field_i.next(-1));
          }
          if (var6_int != 0) {
            param2.clearPatchUsage();
          }
          stackIn_22_0 = var6_int;
          return stackIn_22_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_25_0 = var6;
          stackIn_25_1 = new StringBuilder().append("kf.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final synchronized boolean isReady(byte param0) {
        int var2 = -76 % ((-64 - param0) / 62);
        return this.midiReader.isReady();
    }

    private final int calculateNotePan(boolean param0, MidiNote param1) {
        int discarded$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        MidiNote var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var4 = (MidiNote) null;
            discarded$1 = this.calculateNoteVolume((MidiNote) null, 88);
          }
          var3_int = this.channelPans[param1.channel];
          if (8192 <= var3_int) {
            stackIn_6_0 = 16384 - (32 + (-param1.keyPan + 128) * (16384 - var3_int) >> 6);
            return stackIn_6_0;
          }
          stackIn_4_0 = var3_int * param1.keyPan + 32 >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void programChange(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = HoldTheLine.field_D;
        if (param0 != -49) {
          return;
        }
        if (param1 != this.channelPrograms[param2]) {
          this.channelPrograms[param2] = param1;
          for (var4 = 0; 128 > var4; var4++) {
            this.exclusiveGroupNotes[param2][var4] = null;
          }
        }
    }

    final synchronized void mix(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = HoldTheLine.field_D;
        try {
          if (this.midiReader.isReady()) {
            var4_int = this.playbackTimeScale * this.midiReader.field_a / AudioOutput.sampleRate;
            while (true) {
              var5 = (long)var4_int * (long)param2 + this.playbackTime;
              if (this.nextEventTime - var5 >= 0L) {
                this.playbackTime = var5;
                break;
              }
              var7 = (int)((this.nextEventTime + (-this.playbackTime + (long)var4_int - 1L)) / (long)var4_int);
              this.playbackTime = this.playbackTime + (long)var4_int * (long)var7;
              this.patchStream.mix(param0, param1, var7);
              param2 = param2 - var7;
              param1 = param1 + var7;
              this.processMidiEvents((byte) 9);
              if (this.midiReader.isReady()) {
                continue;
              }
              this.patchStream.mix(param0, param1, param2);
              return;
            }
          }
          this.patchStream.mix(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("kf.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void channelPressure(int param0, int param1, int param2) {
        if (param0 > -54) {
          this.noteOff(117, -92, -50, -101);
        }
    }

    private final void setDefaultProgram(int param0, int param1, int param2) {
        if (param2 != 128) {
          return;
        }
        this.defaultPrograms[param1] = param0;
        this.channelBanks[param1] = LoginChoicePanel.andInts(param0, -128);
        this.programChange(param2 ^ -177, param0, param1);
    }

    private final void resetControllers(int param0, byte param1) {
        int var4;
        var4 = HoldTheLine.field_D;
        if (param0 < 0) {
          for (param0 = 0; param0 < 16; param0++) {
            this.resetControllers(param0, (byte) -33);
          }
          return;
        }
        this.channelVolumes[param0] = 12800;
        this.channelPans[param0] = 8192;
        this.channelExpressions[param0] = 16383;
        this.pitchBends[param0] = 8192;
        this.channelModulations[param0] = 0;
        this.portamentoTimes[param0] = 8192;
        this.releasePortamentoNotes(param0, 2097152);
        this.resetRetriggerPhases((byte) 91, param0);
        if (param1 != -33) {
          return;
        }
        this.channelFlags[param0] = 0;
        this.parameterSelectors[param0] = 32767;
        this.pitchBendRanges[param0] = 256;
        this.sampleOffsets[param0] = 0;
        this.setRetriggerRate(-1, param0, 8192);
    }

    final synchronized int getActivityWeight() {
        return 0;
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != -104) {
          return;
        }
        field_U = null;
        field_T = null;
        field_q = null;
    }

    final synchronized void skip(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        var6 = HoldTheLine.field_D;
        if (this.midiReader.isReady()) {
          var2 = this.midiReader.field_a * this.playbackTimeScale / AudioOutput.sampleRate;
          while (true) {
            var3 = this.playbackTime + (long)param0 * (long)var2;
            if (this.nextEventTime - var3 >= 0L) {
              this.playbackTime = var3;
              break;
            }
            var5 = (int)(((long)var2 + (-this.playbackTime + this.nextEventTime - 1L)) / (long)var2);
            this.playbackTime = this.playbackTime + (long)var2 * (long)var5;
            param0 = param0 - var5;
            this.patchStream.skip(var5);
            this.processMidiEvents((byte) 9);
            if (!this.midiReader.isReady()) {
              break;
            }
          }
        }
        this.patchStream.skip(param0);
    }

    final boolean removeFinishedNote(boolean param0, MidiNote param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          if (param1.sampleStream != null) {
            return false;
          }
          if (param1.releaseTime >= 0) {
            param1.unlink(0);
            if (param1.exclusiveGroup > 0 &&
              param1 == this.exclusiveGroupNotes[param1.channel][param1.exclusiveGroup]) {
              this.exclusiveGroupNotes[param1.channel][param1.exclusiveGroup] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kf.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void processMidiEvents(byte param0) {
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = HoldTheLine.field_D;
        var2 = this.nextEventTrack;
        var3 = this.nextEventTick;
        var4 = this.nextEventTime;
        if (this.queuedTrack != null &&
          this.queuedTrackTick == var3) {
          this.startMusicTrack(this.queuedTrack, this.loopTrack, this.stopNotesForQueuedTrack, 57);
          this.processMidiEvents((byte) 9);
          return;
        }
        while (true) {
          if (this.nextEventTick != var3) {
            this.nextEventTrack = var2;
            if (param0 != 9) {
              this.masterVolume = -73;
            }
            this.nextEventTick = var3;
            this.nextEventTime = var4;
            if (this.queuedTrack != null &&
              var3 > this.queuedTrackTick) {
              this.nextEventTrack = -1;
              this.nextEventTick = this.queuedTrackTick;
              this.nextEventTime = this.midiReader.getEventTime(this.nextEventTick);
            }
            return;
          }
          while (~var3 == ~this.midiReader.field_c[var2]) {
            this.midiReader.gotoTrack(var2);
            var6 = this.midiReader.readMessage(var2);
            if (1 != var6) {
              if ((var6 & 128) != 0) {
                this.dispatchMidiMessage(param0 ^ -14229, var6);
              }
              this.midiReader.readTrackDelta(var2);
              this.midiReader.markTrackPosition(var2);
              continue;
            }
            this.midiReader.markTrackDone();
            this.midiReader.markTrackPosition(var2);
            if (this.midiReader.allTracksDone()) {
              if (this.queuedTrack != null) {
                this.setMusicTrack(-2128027000, this.queuedTrack, this.loopTrack);
                this.processMidiEvents((byte) 9);
                return;
              }
              if (this.loopTrack &&
                var3 != 0) {
                this.midiReader.resetTracks(var4);
              } else {
                this.resetMidiState(16, true);
                this.midiReader.clear();
                return;
              }
            }
            break;
          }
          var2 = this.midiReader.getPrioritizedTrack();
          var3 = this.midiReader.field_c[var2];
          var4 = this.midiReader.getEventTime(var3);
        }
    }

    final synchronized void stop(int param0) {
        if (param0 > -123) {
          this.dispatchMidiMessage(-107, -6);
        }
        this.clearMusicTrack(false, true);
    }

    private final void setRetriggerRate(int param0, int param1, int param2) {
        if (param0 != -1) {
          this.pitchBend(44, -22, (byte) 103);
        }
        this.retriggerRates[param1] = param2;
        this.retriggerPhaseSteps[param1] = (int)(0.5 + Math.pow(2.0, (double)param2 * 0.00054931640625) * 2097152.0);
    }

    final synchronized void setPlaybackTimeScale(int param0, int param1) {
        this.playbackTimeScale = param0;
        if (param1 != 2) {
          this.midiReader = (MidiFileReader) null;
        }
    }

    final synchronized void setChannelProgram(int param0, int param1, int param2) {
        this.setDefaultProgram(param0, param2, 128);
        if (param1 != -13549) {
          field_H = -43;
        }
    }

    private final void pitchBend(int param0, int param1, byte param2) {
        this.pitchBends[param1] = param0;
        int var4 = 99 / ((6 - param2) / 58);
    }

    private final void resetMidiState(int param0, boolean param1) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        int var3Lifetime1;
        if (param1) {
          this.allSoundsOff(-1, (byte) -112);
        } else {
          this.allNotesOff(-1, param0 - 91);
        }
        this.resetControllers(-1, (byte) -33);
        for (var3 = 0; var3 < 16; var3++) {
          this.channelPrograms[var3] = this.defaultPrograms[var3];
        }
        if (param0 != 16) {
          this.programChange(31, 118, -86);
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.channelBanks[var5] = LoginChoicePanel.andInts(this.defaultPrograms[var5], -128);
          var5++;
        }
    }

    final synchronized void setMusicTrack(int param0, MusicTrack param1, boolean param2) {
        try {
          this.startMusicTrack(param1, param2, true, 79);
          if (param0 != -2128027000) {
            this.stopNotesForQueuedTrack = true;
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "kf.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final synchronized PcmStream firstSubStream() {
        return (PcmStream) ((Object) this.patchStream);
    }

    private final void resetRetriggerPhases(byte param0, int param1) {
        MidiNote var3 = null;
        int var4 = HoldTheLine.field_D;
        if (param0 != 91) {
          return;
        }
        if (0 != (4 & this.channelFlags[param1])) {
          var3 = (MidiNote) (this.patchStream.notes.first((byte) 99));
          while (var3 != null) {
            if (param1 == var3.channel) {
              var3.retriggerPhase = 0;
            }
            var3 = (MidiNote) (this.patchStream.notes.next((byte) -47));
          }
        }
    }

    private final void allNotesOff(int param0, int param1) {
        int var5 = HoldTheLine.field_D;
        int var3 = 2 / ((-7 - param1) / 40);
        MidiNote var4 = (MidiNote) (this.patchStream.notes.first((byte) 106));
        while (var4 != null) {
          if ((param0 < 0 || param0 == var4.channel) &&
            var4.releaseTime < 0) {
            this.keyedNotes[var4.channel][var4.key] = null;
            var4.releaseTime = 0;
          }
          var4 = (MidiNote) (this.patchStream.notes.next((byte) 91));
        }
    }

    private final void noteOn(int param0, int param1, int param2, byte param3) {
        int stackIn_19_1 = 0;
        MidiNote stackIn_19_2 = null;
        Object stackIn_20_0;
        boolean stackIn_20_3;
        MidiNote var5;
        int var6_int;
        PcmSample var6;
        MidiNote var7;
        MidiNote var8;
        int var9;
        MusicPatch var10;
        MusicPatch var11;
        var9 = HoldTheLine.field_D;
        this.noteOff(param2, 64, param1, 26410);
        if (param3 < 94) {
          this.channelBanks = (int[]) null;
        }
        if ((2 & this.channelFlags[param1]) != 0) {
          var5 = (MidiNote) (this.patchStream.notes.last((byte) 124));
          while (var5 != null) {
            if (var5.channel == param1 &&
              var5.releaseTime < 0) {
              this.keyedNotes[param1][var5.key] = null;
              this.keyedNotes[param1][param2] = var5;
              var6_int = (var5.portamentoProgress * var5.portamentoPitchDelta >> 12) + var5.basePitch;
              var5.basePitch = var5.basePitch + (param2 - var5.key << 8);
              var5.key = param2;
              var5.portamentoProgress = 4096;
              var5.portamentoPitchDelta = -var5.basePitch + var6_int;
              return;
            }
            var5 = (MidiNote) (this.patchStream.notes.previous(-4140));
          }
        }
        var10 = (MusicPatch) (this.patchCache.get((byte) 115, (long)this.channelPrograms[param1]));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.samples[param2];
        if (var6 == null) {
          return;
        }
        var7 = new MidiNote();
        var7.sample = var6;
        var7.patch = var11;
        var7.channel = param1;
        var7.envelope = var10.envelopes[param2];
        var7.exclusiveGroup = var10.exclusiveGroups[param2];
        var7.key = param2;
        var7.velocityGain = param0 * (param0 * var11.volume * var10.keyVolumes[param2]) + 1024 >> 11;
        var7.keyPan = 255 & var10.keyPans[param2];
        var7.basePitch = (param2 << 8) - (var10.keyPitches[param2] & 32767);
        var7.amplitudeEnvelopeTime = 0;
        var7.releaseEnvelopeIndex = 0;
        var7.decayProgress = 0;
        var7.amplitudeEnvelopeIndex = 0;
        var7.releaseTime = -1;
        if (this.sampleOffsets[param1] == 0) {
          var7.sampleStream = PcmSampleStream.createWithStep(var6, this.calculateNoteStep(var7, (byte) -121), this.calculateNoteVolume(var7, -78), this.calculateNotePan(false, var7));
        } else {
          var7.sampleStream = PcmSampleStream.createWithStep(var6, this.calculateNoteStep(var7, (byte) 26), 0, this.calculateNotePan(false, var7));
          stackIn_19_1 = 2;
          stackIn_19_2 = var7;
          if (0 <= var10.keyPitches[param2]) {
            stackIn_20_0 = this;
            stackIn_20_3 = false;
          } else {
            stackIn_20_0 = this;
            stackIn_20_3 = true;
          }
          this.applySampleOffset(stackIn_19_1, stackIn_19_2, stackIn_20_3);
        }
        if (var10.keyPitches[param2] < 0) {
          var7.sampleStream.setLoopCount(-1);
        }
        if (var7.exclusiveGroup >= 0) {
          var8 = this.exclusiveGroupNotes[param1][var7.exclusiveGroup];
          if (var8 != null &&
            var8.releaseTime < 0) {
            this.keyedNotes[param1][var8.key] = null;
            var8.releaseTime = 0;
          }
          this.exclusiveGroupNotes[param1][var7.exclusiveGroup] = var7;
        }
        this.patchStream.notes.addLast((byte) -128, var7);
        this.keyedNotes[param1][param2] = var7;
        return;
    }

    private final synchronized void clearMusicTrack(boolean param0, boolean param1) {
        this.midiReader.clear();
        this.queuedTrack = null;
        if (param0) {
          this.keyedNotes = (MidiNote[][]) null;
        }
        this.resetMidiState(16, param1);
    }

    final synchronized void setChannelGain(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = HoldTheLine.field_D;
        int var4Lifetime1;
        if (0 <= param1) {
          this.channelGains[param1] = param2;
        } else {
          for (var4 = 0; var4 < 16; var4++) {
            this.channelGains[var4] = param2;
          }
        }
        var4Lifetime1 = -113 % ((param0 + 18) / 60);
    }

    final boolean updateNote(int[] param0, MidiNote param1, int param2, int param3, int param4) {
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        MusicPatchEnvelope var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = HoldTheLine.field_D;
        try {
          param1.samplesUntilUpdate = AudioOutput.sampleRate / 100;
          if (0 <= param1.releaseTime && (param1.sampleStream == null ||
            param1.sampleStream.isOutOfBounds())) {
            param1.clearVoiceReferences((byte) -95);
            param1.unlink(0);
            if (0 < param1.exclusiveGroup) {
              if (param1 != this.exclusiveGroupNotes[param1.channel][param1.exclusiveGroup]) {
                return true;
              }
              this.exclusiveGroupNotes[param1.channel][param1.exclusiveGroup] = null;
            }
            return true;
          }
          var6_int = param1.portamentoProgress;
          if (param3 >= -41) {
            this.retriggerPhaseSteps = (int[]) null;
          }
          if (0 < var6_int) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.portamentoTimes[param1.channel]));
            if (0 > var6_int) {
              var6_int = 0;
            }
            param1.portamentoProgress = var6_int;
          }
          param1.sampleStream.setPlaybackStep(this.calculateNoteStep(param1, (byte) -127));
          var7 = param1.envelope;
          param1.vibratoPhase = param1.vibratoPhase + var7.field_m;
          param1.age = param1.age + 1;
          var8 = 0;
          var9 = (double)((param1.portamentoPitchDelta * param1.portamentoProgress >> 12) + (param1.key - 60 << 8)) * 0.000005086263020833333;
          if (var7.field_b > 0) {
            if (0 >= var7.field_c) {
              param1.decayProgress = param1.decayProgress + 128;
            } else {
              param1.decayProgress = param1.decayProgress + (int)(128.0 * Math.pow(2.0, (double)var7.field_c * var9) + 0.5);
            }
            if (819200 <= param1.decayProgress * var7.field_b) {
              var8 = 1;
            }
          }
          if (var7.field_l != null) {
            if (0 < var7.field_d) {
              param1.amplitudeEnvelopeTime = param1.amplitudeEnvelopeTime + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_d) + 0.5);
            } else {
              param1.amplitudeEnvelopeTime = param1.amplitudeEnvelopeTime + 128;
            }
            while (var7.field_l.length - 2 > param1.amplitudeEnvelopeIndex) {
              if ((var7.field_l[param1.amplitudeEnvelopeIndex + 2] << 8 & 65280) < param1.amplitudeEnvelopeTime) {
                param1.amplitudeEnvelopeIndex = param1.amplitudeEnvelopeIndex + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.field_l.length == param1.amplitudeEnvelopeIndex &&
              var7.field_l[1 + param1.amplitudeEnvelopeIndex] == 0) {
              var8 = 1;
            }
          }
          if (0 <= param1.releaseTime &&
            var7.field_g != null &&
            (1 & this.channelFlags[param1.channel]) == 0 && (!(param1.exclusiveGroup >= 0) ||
            this.exclusiveGroupNotes[param1.channel][param1.exclusiveGroup] != param1)) {
            if (0 >= var7.field_n) {
              param1.releaseTime = param1.releaseTime + 128;
            } else {
              param1.releaseTime = param1.releaseTime + (int)(128.0 * Math.pow(2.0, (double)var7.field_n * var9) + 0.5);
            }
            while (-2 + var7.field_g.length > param1.releaseEnvelopeIndex) {
              if (param1.releaseTime > (var7.field_g[param1.releaseEnvelopeIndex + 2] << 8 & 65280)) {
                param1.releaseEnvelopeIndex = param1.releaseEnvelopeIndex + 2;
                continue;
              }
              break;
            }
            if (param1.releaseEnvelopeIndex == var7.field_g.length - 2) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param1.sampleStream.rampVolumeAndPan(param1.samplesUntilUpdate, this.calculateNoteVolume(param1, 72), this.calculateNotePan(false, param1));
            return false;
          }
          param1.sampleStream.fadeOutAndRemove(param1.samplesUntilUpdate);
          if (param0 == null) {
            param1.sampleStream.skip(param2);
          } else {
            param1.sampleStream.mix(param0, param4, param2);
          }
          if (param1.sampleStream.isRamping()) {
            this.patchStream.fadeMixer.addSubStream(param1.sampleStream);
          }
          param1.clearVoiceReferences((byte) -92);
          if (param1.releaseTime >= 0) {
            param1.unlink(0);
            if (param1.exclusiveGroup > 0 &&
              this.exclusiveGroupNotes[param1.channel][param1.exclusiveGroup] == param1) {
              this.exclusiveGroupNotes[param1.channel][param1.exclusiveGroup] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_71_0 = var6;
          stackIn_71_1 = new StringBuilder().append("kf.BA(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param1 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int calculateNoteStep(MidiNote param0, byte param1) {
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        MusicPatchEnvelope var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int var6Lifetime1;
        try {
          var3_int = param0.basePitch + (param0.portamentoProgress * param0.portamentoPitchDelta >> 12);
          var3_int = var3_int + (this.pitchBendRanges[param0.channel] * (-8192 + this.pitchBends[param0.channel]) >> 12);
          var4 = param0.envelope;
          var5 = 37 / ((param1 + 58) / 60);
          if (var4.field_m > 0 && (!(var4.field_h <= 0) ||
            this.channelModulations[param0.channel] > 0)) {
            var6 = var4.field_h << 2;
            var7 = var4.field_j << 1;
            if (param0.age < var7) {
              var6 = var6 * param0.age / var7;
            }
            var6 = var6 + (this.channelModulations[param0.channel] >> 7);
            var8 = Math.sin((double)(param0.vibratoPhase & 511) * 0.01227184630308513);
            var3_int = var3_int + (int)((double)var6 * var8);
          }
          var6Lifetime1 = (int)(0.5 + (double)(256 * param0.sample.field_j) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)AudioOutput.sampleRate);
          stackIn_11_0 = (var6Lifetime1 < 1) ? 1 : var6Lifetime1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("kf.AA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String normalizeAccountName(CharSequence param0, byte param1) {
        int var7 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HoldTheLine.field_D;
        try {
          if (param0 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param0.length();
          while (var2_int < var3) {
            if (SocketJs5Transport.isNameSeparator(-2821, param0.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          var4 = 106 % ((param1 - 45) / 45);
          while (var2_int < var3) {
            if (SocketJs5Transport.isNameSeparator(-2821, param0.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          var5 = var3 - var2_int;
          if (1 > var5) {
            return null;
          }
          if (var5 > 12) {
            stackIn_16_0 = null;
            return (String) (stackIn_16_0);
          }
          var6 = new StringBuilder(var5);
          for (var7 = var2_int; var3 > var7; var7++) {
            var8 = param0.charAt(var7);
            if (LoginCredentials.isDisplayNameCharacter((char) var8, (byte) -116)) {
              var9 = AccountNameNormalizer.normalizeAccountCharacter(true, (char) var8);
              if (0 != var9) {
                discarded$0 = var6.append((char) var9);
              }
            }
          }
          if (var6.length() != 0) {
            return var6.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("kf.IA(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void releasePortamentoNotes(int param0, int param1) {
        MidiNote var3 = null;
        int var4 = HoldTheLine.field_D;
        if (param1 != 2097152) {
          this.programChange(121, 39, -127);
        }
        if (0 != (2 & this.channelFlags[param0])) {
          var3 = (MidiNote) (this.patchStream.notes.first((byte) 100));
          while (var3 != null) {
            if (param0 == var3.channel &&
              this.keyedNotes[param0][var3.key] == null &&
              0 > var3.releaseTime) {
              var3.releaseTime = 0;
            }
            var3 = (MidiNote) (this.patchStream.notes.next((byte) -38));
          }
        }
    }

    final void applySampleOffset(int param0, MidiNote param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        try {
          var4_int = param1.sample.field_n.length;
          if (param2 &&
            param1.sample.field_k) {
            var6 = var4_int + var4_int - param1.sample.field_m;
            var5 = (int)((long)this.sampleOffsets[param1.channel] * (long)var6 >> 6);
            var4_int = var4_int << 8;
            if (var4_int <= var5) {
              var5 = -var5 + var4_int + var4_int - 1;
              param1.sampleStream.setReversed(true);
            }
          } else {
            var5 = (int)((long)var4_int * (long)this.sampleOffsets[param1.channel] >> 6);
          }
          if (param0 != 2) {
            this.resetRetriggerPhases((byte) -59, 8);
          }
          param1.sampleStream.setFixedPosition(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("kf.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int calculateNoteVolume(MidiNote param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        MusicPatchEnvelope var10 = null;
        MusicPatchEnvelope var11 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          if (this.channelGains[param0.channel] == 0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var10 = param0.envelope;
          var11 = var10;
          var4 = this.channelVolumes[param0.channel] * this.channelExpressions[param0.channel] + 4096 >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = var4 * param0.velocityGain + 16384 >> 15;
          var5 = -91 / ((-16 - param1) / 51);
          var4 = this.masterVolume * var4 + 128 >> 8;
          var4 = this.channelGains[param0.channel] * var4 + 128 >> 8;
          if (0 < var11.field_b) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)var11.field_b * ((double)param0.decayProgress * 0.00001953125)) + 0.5);
          }
          if (var11.field_l != null) {
            var6 = param0.amplitudeEnvelopeTime;
            var7 = var11.field_l[param0.amplitudeEnvelopeIndex + 1];
            if (param0.amplitudeEnvelopeIndex < var11.field_l.length - 2) {
              var8 = var10.field_l[param0.amplitudeEnvelopeIndex] << 8 & 65280;
              var9 = 65280 & var11.field_l[2 + param0.amplitudeEnvelopeIndex] << 8;
              var7 = var7 + (-var8 + var6) * (-var7 + var11.field_l[param0.amplitudeEnvelopeIndex + 3]) / (var9 - var8);
            }
            var4 = var4 * var7 + 32 >> 6;
          }
          if (param0.releaseTime > 0 &&
            var11.field_g != null) {
            var6Lifetime1 = param0.releaseTime;
            var7Lifetime1 = var11.field_g[1 + param0.releaseEnvelopeIndex];
            if (param0.releaseEnvelopeIndex < var11.field_g.length - 2) {
              var8Lifetime1 = (var10.field_g[param0.releaseEnvelopeIndex] & 255) << 8;
              var9Lifetime1 = (var11.field_g[param0.releaseEnvelopeIndex + 2] & 255) << 8;
              var7Lifetime1 = var7Lifetime1 + (-var8Lifetime1 + var6Lifetime1) * (var11.field_g[3 + param0.releaseEnvelopeIndex] - var7Lifetime1) / (-var8Lifetime1 + var9Lifetime1);
            }
            var4 = 32 + var7Lifetime1 * var4 >> 6;
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("kf.L(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void noteOff(int param0, int param1, int param2, int param3) {
        MidiNote var6;
        int var7;
        MidiNote var8;
        var7 = HoldTheLine.field_D;
        var8 = this.keyedNotes[param2][param0];
        if (var8 == null) {
          return;
        }
        if (param3 != 26410) {
          this.channelPressure(82, 108, -74);
        }
        {
          this.keyedNotes[param2][param0] = null;
          if (0 != (this.channelFlags[param2] & 2)) {
            var6 = (MidiNote) (this.patchStream.notes.first((byte) 117));
            while (var6 != null) {
              if (var8.channel == var6.channel &&
                var6.releaseTime < 0 &&
                var8 != var6) {
                var8.releaseTime = 0;
                break;
              }
              var6 = (MidiNote) (this.patchStream.notes.next((byte) 122));
            }
          } else {
            var8.releaseTime = 0;
          }
        }
    }

    private final synchronized void startMusicTrack(MusicTrack param0, boolean param1, boolean param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = HoldTheLine.field_D;
        try {
          if (param3 < 39) {
            this.sampleOffsets = (int[]) null;
          }
          this.clearMusicTrack(false, param2);
          this.midiReader.parse(param0.field_j);
          this.loopTrack = param1 ? true : false;
          this.playbackTime = 0L;
          var5_int = this.midiReader.getTrackCount();
          for (var6 = 0; var6 < var5_int; var6++) {
            this.midiReader.gotoTrack(var6);
            this.midiReader.readTrackDelta(var6);
            this.midiReader.markTrackPosition(var6);
          }
          this.nextEventTrack = this.midiReader.getPrioritizedTrack();
          this.nextEventTick = this.midiReader.field_c[this.nextEventTrack];
          this.nextEventTime = this.midiReader.getEventTime(this.nextEventTick);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "kf.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void polyphonicPressure(int param0, int param1, int param2, int param3) {
        if (param2 < 59) {
          this.exclusiveGroupNotes = (MidiNote[][]) null;
        }
    }

    public MidiPcmStream() {
        this.retriggerPhaseSteps = new int[16];
        this.pitchBendRanges = new int[16];
        this.channelPans = new int[16];
        this.channelExpressions = new int[16];
        this.channelGains = new int[16];
        this.channelPrograms = new int[16];
        this.defaultPrograms = new int[16];
        this.channelModulations = new int[16];
        this.channelFlags = new int[16];
        this.portamentoTimes = new int[16];
        this.retriggerRates = new int[16];
        this.channelBanks = new int[16];
        this.pitchBends = new int[16];
        this.masterVolume = 256;
        this.exclusiveGroupNotes = new MidiNote[16][128];
        this.keyedNotes = new MidiNote[16][128];
        this.playbackTimeScale = 1000000;
        this.sampleOffsets = new int[16];
        this.parameterSelectors = new int[16];
        this.channelVolumes = new int[16];
        this.midiReader = new MidiFileReader();
        this.patchStream = new MusicPatchPcmStream(this);
        this.patchCache = new NodeHashTable(128);
        this.setChannelGain((byte) 99, -1, 256);
        this.resetMidiState(16, true);
    }

    MidiPcmStream(MidiPcmStream param0) {
        this.retriggerPhaseSteps = new int[16];
        this.pitchBendRanges = new int[16];
        this.channelPans = new int[16];
        this.channelExpressions = new int[16];
        this.channelGains = new int[16];
        this.channelPrograms = new int[16];
        this.defaultPrograms = new int[16];
        this.channelModulations = new int[16];
        this.channelFlags = new int[16];
        this.portamentoTimes = new int[16];
        this.retriggerRates = new int[16];
        this.channelBanks = new int[16];
        this.pitchBends = new int[16];
        this.masterVolume = 256;
        this.exclusiveGroupNotes = new MidiNote[16][128];
        this.keyedNotes = new MidiNote[16][128];
        this.playbackTimeScale = 1000000;
        this.sampleOffsets = new int[16];
        this.parameterSelectors = new int[16];
        this.channelVolumes = new int[16];
        this.midiReader = new MidiFileReader();
        this.patchStream = new MusicPatchPcmStream(this);
        try {
          this.patchCache = param0.patchCache;
          this.setChannelGain((byte) 91, -1, 256);
          this.resetMidiState(16, true);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "kf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_T = new int[8192];
        field_F = 0;
    }
}
