/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiPcmStream extends PcmStream {
    private int[] channelModulation;
    private int field_r;
    private int[] defaultPrograms;
    int[] sampleStartOffset;
    private int[] channelBanks;
    private int[] channelGain;
    static int field_M;
    static java.applet.Applet field_F;
    private int[] pitchBendRange;
    int[] channelFlags;
    private int[] channelExpression;
    static int field_u;
    private int[] channelPrograms;
    private int[] channelVolume;
    int[] retriggerPhaseStep;
    private int[] portamentoTime;
    private int[] channelPan;
    private int[] channelPitchBend;
    private MidiNote[][] notesByGroup;
    private MidiNote[][] notesByKey;
    private MidiFileReader midiFile;
    private int[] registeredParameter;
    private int[] retriggerRate;
    static int field_V;
    private int masterVolume;
    private IntrusiveNodeHashTable patches;
    private boolean field_U;
    private int field_p;
    static byte[][][] field_T;
    private long field_n;
    private long field_K;
    static java.awt.Frame field_H;
    private int field_s;
    private MidiNoteMixer noteMixer;
    private MidiTrack field_x;
    private int field_W;
    private boolean field_q;

    private final void changeProgram(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        boolean decompiledFrameCompleted0 = true;
        var5 = wizardrun.field_H;
        if (param1 != this.channelPrograms[param2]) {
          this.channelPrograms[param2] = param1;
          var4 = 0;
          while (var4 < 128) {
            this.notesByGroup[param2][var4] = null;
            var4++;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if ((decompiledFrameCompleted0) &&
          (param0 != -129)) {
          this.setRetriggerRate(93, -111, 85);
        }

    }

    private final int computeNotePan(MidiNote param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.channelPan[param0.channel];
          if (param1 < 54) {
            this.skipFrames(-24);
          }
          if (var3_int >= 8192) {
            stackIn_6_0 = -((-var3_int + 16384) * (128 - param0.field_B) + 32 >> 6) + 16384;
            return stackIn_6_0;
          }
          stackIn_4_0 = 32 + param0.field_B * var3_int >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("fl.CA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean loadTrackInstruments(ResourceArchive param0, int param1, SoundCache param2, MidiTrack param3, int param4) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        MidiKeyUsage var8 = null;
        int var9 = 0;
        MusicPatch var10 = null;
        int var11 = 0;
        var11 = wizardrun.field_H;
        try {
          param3.buildKeyUsage();
          var6_int = 1;
          var7 = null;
          if (param1 > ~param4) {
            var7 = new int[]{param4};
          }
          var8 = (MidiKeyUsage) (param3.keyUsage.first((byte) 61));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 == null))) {
            var9 = (int)var8.key;
            var10 = (MusicPatch) (this.patches.get(1, (long)var9));
            if (var11 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (var10 == null) {
                var10 = MusicPatchLoader.loadPatch(param1 + 82, var9, param0);
                if (var10 == null) {
                  var6_int = 0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  this.patches.put(var10, -9, (long)var9);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (!var10.loadSamples(var8.keys, param2, -75, (int[]) (var7)))) {
                var6_int = 0;
              }
              var8 = (MidiKeyUsage) (param3.keyUsage.next(1));
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (var6_int != 0)) {
            param3.clearKeyUsage();
          }
          stackIn_19_0 = var6_int;
          return stackIn_19_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("fl.FA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(')').toString());
        }
    }

    final synchronized PcmStream nextSubstream() {
        return null;
    }

    private final void noteOn(int param0, int param1, int param2, int param3) {
        int stackIn_19_1 = 0;
        boolean stackIn_20_2 = false;
        MidiNote var5;
        int var6_int;
        PcmSample var6;
        MidiNote var7;
        MidiNote var8;
        int var9;
        MusicPatch var10;
        MusicPatch var11;
        var9 = wizardrun.field_H;
        this.noteOff(param3, 64, param0, (byte) -16);
        if ((this.channelFlags[param0] & 2) != 0) {
          var5 = (MidiNote) (this.noteMixer.field_p.last((byte) 11));
          while (var5 != null) {
            if (param0 == var5.channel &&
              var5.field_j < 0) {
              this.notesByKey[param0][var5.key] = null;
              this.notesByKey[param0][param3] = var5;
              var6_int = var5.field_z + (var5.field_y * var5.field_I >> 12);
              var5.field_z = var5.field_z + (-var5.key + param3 << 8);
              var5.key = param3;
              var5.field_I = -var5.field_z + var6_int;
              var5.field_y = 4096;
              return;
            }
            var5 = (MidiNote) (this.noteMixer.field_p.previous(102));
            if (var9 == 0) {
              continue;
            }
            break;
          }
        }
        var10 = (MusicPatch) (this.patches.get(1, (long)this.channelPrograms[param0]));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_k[param3];
        if (var6 == null) {
          return;
        }
        var7 = new MidiNote();
        var7.patch = var11;
        var7.channel = param0;
        var7.sample = var6;
        var7.envelope = var10.field_t[param3];
        var7.exclusiveGroup = var10.field_l[param3];
        var7.key = param3;
        var7.field_D = 1024 + param1 * (param1 * var11.field_n) * var10.field_q[param3] >> 11;
        var7.field_B = 255 & var10.field_o[param3];
        var7.field_z = -(var10.field_r[param3] & 32767) + (param3 << 8);
        var7.field_m = 0;
        var7.field_K = 0;
        var7.field_j = -1;
        var7.field_n = 0;
        var7.field_s = param2;
        if (this.sampleStartOffset[param0] == 0) {
          var7.sampleStream = PcmSampleStream.createAtStepQ8(var6, this.computeNotePlaybackRate(-822, var7), this.computeNoteVolume(var7, -98), this.computeNotePan(var7, (byte) 105));
          if (var9 != 0) {
            var7.sampleStream = PcmSampleStream.createAtStepQ8(var6, this.computeNotePlaybackRate(param2 ^ -822, var7), 0, this.computeNotePan(var7, (byte) 79));
            stackIn_19_1 = 15;
            stackIn_20_2 = !(var10.field_r[param3] >= 0);
            this.applySampleStartOffset(stackIn_19_1, stackIn_20_2, var7);
          }
        } else {
          var7.sampleStream = PcmSampleStream.createAtStepQ8(var6, this.computeNotePlaybackRate(param2 ^ -822, var7), 0, this.computeNotePan(var7, (byte) 79));
          stackIn_19_1 = 15;
          stackIn_20_2 = !(var10.field_r[param3] >= 0);
          this.applySampleStartOffset(stackIn_19_1, stackIn_20_2, var7);
        }
        if (0 > var10.field_r[param3]) {
          var7.sampleStream.setLoopCount(-1);
        }
        if (var7.exclusiveGroup >= 0) {
          var8 = this.notesByGroup[param0][var7.exclusiveGroup];
          if (var8 != null &&
            var8.field_j < 0) {
            this.notesByKey[param0][var8.key] = null;
            var8.field_j = 0;
          }
          this.notesByGroup[param0][var7.exclusiveGroup] = var7;
        }
        this.noteMixer.field_p.addLast(var7, false);
        this.notesByKey[param0][param3] = var7;
        return;
    }

    final synchronized void clearPatchSampleIds(boolean param0) {
        int var3 = 0;
        MusicPatch var4 = null;
        var3 = wizardrun.field_H;
        if (!param0) {
          this.setMasterVolume(-72, 96);
        }
        var4 = (MusicPatch) (this.patches.first((byte) -87));
        while (var4 != null) {
          var4.clearSampleIds(-106);
          var4 = (MusicPatch) (this.patches.next(1));
          if (var3 == 0) {
            continue;
          }
          break;
        }
    }

    private final void processMidiEvents(boolean param0) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = wizardrun.field_H;
        var2 = this.field_p;
        var3 = this.field_s;
        var4 = this.field_n;
        if (this.field_x != null &&
          var3 == this.field_W) {
          this.startTrackWithTimeOffset(this.field_U, this.field_q, 0, this.field_x);
          this.processMidiEvents(false);
          return;
        }
        while (true) {
          if (this.field_s != var3) {
            this.field_n = var4;
            this.field_s = var3;
            this.field_p = var2;
            if (param0) {
              this.clearPatchSampleIds(true);
            }
            if (null != this.field_x) {
              stackIn_9_0 = var3;
              stackIn_9_1 = this.field_W;
              if (stackIn_9_0 > stackIn_9_1) {
                this.field_p = -1;
                this.field_s = this.field_W;
                this.field_n = this.midiFile.timeForTicks(this.field_s);
              }
            }
            return;
          }
          while (true) {
            stackIn_15_0 = this.midiFile.field_h[var2];
            stackIn_15_1 = var3;
            if (var7 != 0) {
              if (stackIn_15_0 > stackIn_15_1) {
                this.field_p = -1;
                this.field_s = this.field_W;
                this.field_n = this.midiFile.timeForTicks(this.field_s);
              }
              return;
            }
            if (stackIn_15_0 == stackIn_15_1) {
              this.midiFile.seekTrack(var2);
              var6 = this.midiFile.readMessage(var2);
              stackIn_19_0 = -2;
              stackIn_19_1 = ~var6;
              if (stackIn_19_0 == stackIn_19_1) {
                this.midiFile.markTrackEnded();
                this.midiFile.saveTrackPosition(var2);
                if (this.midiFile.isDone()) {
                  if (this.field_x != null) {
                    this.startTrack(this.field_U, -76, this.field_x);
                    this.processMidiEvents(false);
                    return;
                  }
                  if (this.field_U &&
                    0 != var3) {
                    this.midiFile.reset(var4);
                  } else {
                    this.resetChannels(true, (byte) -91);
                    this.midiFile.clear();
                    return;
                  }
                }
              } else {
                if ((var6 & 128) != 0) {
                  this.processMidiMessage(var6, 12035);
                }
                this.midiFile.readDeltaTicks(var2);
                this.midiFile.saveTrackPosition(var2);
                continue;
              }
            }
            break;
          }
          var2 = this.midiFile.nextTrack();
          var3 = this.midiFile.field_h[var2];
          var4 = this.midiFile.timeForTicks(var3);
        }
    }

    final void applySampleStartOffset(int param0, boolean param1, MidiNote param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.sample.field_k.length;
          boolean decompiledSharedTail0 = (param1 &&
            param2.sample.field_j);
          if (!decompiledSharedTail0) {
            var5 = (int)((long)var4_int * (long)this.sampleStartOffset[param2.channel] >> 6);
            decompiledSharedTail0 = (wizardrun.field_H != 0);
          }
          if (decompiledSharedTail0) {
            var6 = -param2.sample.field_n + var4_int + var4_int;
            var5 = (int)((long)this.sampleStartOffset[param2.channel] * (long)var6 >> 6);
            var4_int = var4_int << 8;
            if (var4_int <= var5) {
              param2.sampleStream.setReversePlayback(true);
              var5 = -var5 + (var4_int + var4_int) - 1;
            }
          }
          if (param0 != 15) {
            this.startTrack(true, -14, (MidiTrack) null);
          }
          param2.sampleStream.setPositionFixed(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("fl.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final int computeNotePlaybackRate(int param0, MidiNote param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        MidiEnvelope var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param1.field_z + (param1.field_I * param1.field_y >> 12);
          var3_int = var3_int + ((-8192 + this.channelPitchBend[param1.channel]) * this.pitchBendRange[param1.channel] >> 12);
          var4 = param1.envelope;
          if (var4.field_k > 0 && (!(var4.field_e <= 0) ||
            0 < this.channelModulation[param1.channel])) {
            var5 = var4.field_e << 2;
            var6 = var4.field_a << 1;
            if (param1.field_q < var6) {
              var5 = var5 * param1.field_q / var6;
            }
            var5 = var5 + (this.channelModulation[param1.channel] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.field_x & 511));
            var3_int = var3_int + (int)((double)var5 * var7);
          }
          var5Lifetime1 = (int)((double)(256 * param1.sample.field_m) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)AudioOutput.field_l + 0.5);
          if (param0 != -822) {
            this.firstSubstream();
          }
          stackIn_13_0 = (var5Lifetime1 < 1) ? 1 : var5Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("fl.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void setRetriggerRate(int param0, int param1, int param2) {
        this.retriggerRate[param0] = param2;
        if (param1 <= 113) {
          this.field_U = false;
        }
        this.retriggerPhaseStep[param0] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param2) + 0.5);
    }

    private final void handlePolyphonicPressure(int param0, int param1, int param2, byte param3) {
        if (param3 <= 71) {
          this.retriggerPhaseStep = (int[]) null;
        }
    }

    private final void releasePortamentoNotes(int param0, int param1) {
        MidiNote var3;
        int var4;
        var4 = wizardrun.field_H;
        if (param0 != 256) {
          return;
        }
        if ((2 & this.channelFlags[param1]) != 0) {
          var3 = (MidiNote) (this.noteMixer.field_p.first((byte) 91));
          while (var3 != null) {
            if (var4 != 0) {
              break;
            }
            if (param1 == var3.channel &&
              this.notesByKey[param1][var3.key] == null &&
              var3.field_j < 0) {
              var3.field_j = 0;
            }
            var3 = (MidiNote) (this.noteMixer.field_p.next(param0 ^ 8448));
          }
        }
    }

    private final void processMidiMessage(int param0, int param1) {
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
        var8 = wizardrun.field_H;
        var3 = 240 & param0;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = param0 >> 8 & 127;
          var6 = 127 & param0 >> 16;
          this.noteOff(var5, var6, var4, (byte) -16);
          return;
        }
        if (144 == var3) {
          var4Lifetime1 = param0 & 15;
          var5Lifetime1 = param0 >> 8 & 127;
          var6Lifetime1 = param0 >> 16 & 127;
          if (var6Lifetime1 > 0) {
            this.noteOn(var4Lifetime1, var6Lifetime1, 0, var5Lifetime1);
            if (var8 == 0) {
              return;
            }
          }
          this.noteOff(var5Lifetime1, 64, var4Lifetime1, (byte) -16);
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = 15 & param0;
          var5Lifetime2 = 127 & param0 >> 8;
          var6Lifetime2 = (8323853 & param0) >> 16;
          this.handlePolyphonicPressure(var4Lifetime2, var6Lifetime2, var5Lifetime2, (byte) 118);
          return;
        }
        if (176 != var3) {
          if (192 == var3) {
            var4Lifetime3 = param0 & 15;
            var5Lifetime3 = 127 & param0 >> 8;
            this.changeProgram(-129, var5Lifetime3 + this.channelBanks[var4Lifetime3], var4Lifetime3);
            return;
          }
          if (param1 != 12035) {
            this.field_K = -72L;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = 15 & param0;
            var5Lifetime3Lifetime1 = 127 & param0 >> 8;
            this.handleChannelPressure(var5Lifetime3Lifetime1, 2, var4Lifetime3Lifetime1);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = param0 & 15;
            var5Lifetime3Lifetime2 = (param0 >> 8 & 127) + ((param0 & 8323516) >> 9);
            this.setPitchBend(var4Lifetime3Lifetime2, var5Lifetime3Lifetime2, 38);
            return;
          }
          var3 = param0 & 255;
          if (var3 != 255) {
            return;
          }
          this.resetChannels(true, (byte) -78);
          return;
        }
        var4Lifetime4 = 15 & param0;
        var5Lifetime4 = (param0 & 32628) >> 8;
        var6Lifetime3 = (param0 & 8367717) >> 16;
        if (var5Lifetime4 == 0) {
          this.channelBanks[var4Lifetime4] = (var6Lifetime3 << 14) + ResourceArchive.bitAnd(this.channelBanks[var4Lifetime4], -2080769);
        }
        if (var5Lifetime4 == 32) {
          this.channelBanks[var4Lifetime4] = (var6Lifetime3 << 7) + ResourceArchive.bitAnd(this.channelBanks[var4Lifetime4], -16257);
        }
        if (1 == var5Lifetime4) {
          this.channelModulation[var4Lifetime4] = ResourceArchive.bitAnd(this.channelModulation[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 33) {
          this.channelModulation[var4Lifetime4] = var6Lifetime3 + ResourceArchive.bitAnd(-128, this.channelModulation[var4Lifetime4]);
        }
        if (var5Lifetime4 == 5) {
          this.portamentoTime[var4Lifetime4] = (var6Lifetime3 << 7) + ResourceArchive.bitAnd(-16257, this.portamentoTime[var4Lifetime4]);
        }
        if (var5Lifetime4 == 37) {
          this.portamentoTime[var4Lifetime4] = var6Lifetime3 + ResourceArchive.bitAnd(-128, this.portamentoTime[var4Lifetime4]);
        }
        if (7 == var5Lifetime4) {
          this.channelVolume[var4Lifetime4] = ResourceArchive.bitAnd(-16257, this.channelVolume[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 39) {
          this.channelVolume[var4Lifetime4] = ResourceArchive.bitAnd(-128, this.channelVolume[var4Lifetime4]) + var6Lifetime3;
        }
        if (10 == var5Lifetime4) {
          this.channelPan[var4Lifetime4] = (var6Lifetime3 << 7) + ResourceArchive.bitAnd(this.channelPan[var4Lifetime4], -16257);
        }
        if (42 == var5Lifetime4) {
          this.channelPan[var4Lifetime4] = ResourceArchive.bitAnd(this.channelPan[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 11) {
          this.channelExpression[var4Lifetime4] = (var6Lifetime3 << 7) + ResourceArchive.bitAnd(-16257, this.channelExpression[var4Lifetime4]);
        }
        if (var5Lifetime4 == 43) {
          this.channelExpression[var4Lifetime4] = ResourceArchive.bitAnd(-128, this.channelExpression[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 64) {
          if (var6Lifetime3 >= 64) {
            this.channelFlags[var4Lifetime4] = LoginCredentialKind.bitOr(this.channelFlags[var4Lifetime4], 1);
            if (var8 != 0) {
              this.channelFlags[var4Lifetime4] = ResourceArchive.bitAnd(this.channelFlags[var4Lifetime4], -2);
            }
          } else {
            this.channelFlags[var4Lifetime4] = ResourceArchive.bitAnd(this.channelFlags[var4Lifetime4], -2);
          }
        }
        if (var5Lifetime4 == 65) {
          if (64 > var6Lifetime3) {
            this.releasePortamentoNotes(256, var4Lifetime4);
            this.channelFlags[var4Lifetime4] = ResourceArchive.bitAnd(this.channelFlags[var4Lifetime4], -3);
            if (var8 != 0) {
              this.channelFlags[var4Lifetime4] = LoginCredentialKind.bitOr(this.channelFlags[var4Lifetime4], 2);
            }
          } else {
            this.channelFlags[var4Lifetime4] = LoginCredentialKind.bitOr(this.channelFlags[var4Lifetime4], 2);
          }
        }
        if (99 == var5Lifetime4) {
          this.registeredParameter[var4Lifetime4] = (var6Lifetime3 << 7) + ResourceArchive.bitAnd(127, this.registeredParameter[var4Lifetime4]);
        }
        if (98 == var5Lifetime4) {
          this.registeredParameter[var4Lifetime4] = var6Lifetime3 + ResourceArchive.bitAnd(16256, this.registeredParameter[var4Lifetime4]);
        }
        if (101 == var5Lifetime4) {
          this.registeredParameter[var4Lifetime4] = ResourceArchive.bitAnd(127, this.registeredParameter[var4Lifetime4]) + (16384 + (var6Lifetime3 << 7));
        }
        if (var5Lifetime4 == 100) {
          this.registeredParameter[var4Lifetime4] = ResourceArchive.bitAnd(this.registeredParameter[var4Lifetime4], 16256) + (16384 + var6Lifetime3);
        }
        if (var5Lifetime4 == 120) {
          this.allSoundOff(param1 - 12035, var4Lifetime4);
        }
        if (var5Lifetime4 == 121) {
          this.resetChannelControllers(var4Lifetime4, (byte) 21);
        }
        if (123 == var5Lifetime4) {
          this.allNotesOff(var4Lifetime4, -1);
        }
        if (6 == var5Lifetime4) {
          var7 = this.registeredParameter[var4Lifetime4];
          if (var7 == 16384) {
            this.pitchBendRange[var4Lifetime4] = (var6Lifetime3 << 7) + ResourceArchive.bitAnd(this.pitchBendRange[var4Lifetime4], -16257);
          }
        }
        if (38 == var5Lifetime4) {
          var7Lifetime1 = this.registeredParameter[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.pitchBendRange[var4Lifetime4] = ResourceArchive.bitAnd(this.pitchBendRange[var4Lifetime4], -128) + var6Lifetime3;
          }
        }
        if (16 == var5Lifetime4) {
          this.sampleStartOffset[var4Lifetime4] = (var6Lifetime3 << 7) + ResourceArchive.bitAnd(this.sampleStartOffset[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 48) {
          this.sampleStartOffset[var4Lifetime4] = ResourceArchive.bitAnd(-128, this.sampleStartOffset[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 81) {
          if (var6Lifetime3 >= 64) {
            this.channelFlags[var4Lifetime4] = LoginCredentialKind.bitOr(this.channelFlags[var4Lifetime4], 4);
            if (var8 != 0) {
              this.resetRetriggerPhases(-1, var4Lifetime4);
              this.channelFlags[var4Lifetime4] = ResourceArchive.bitAnd(this.channelFlags[var4Lifetime4], -5);
            }
          } else {
            this.resetRetriggerPhases(-1, var4Lifetime4);
            this.channelFlags[var4Lifetime4] = ResourceArchive.bitAnd(this.channelFlags[var4Lifetime4], -5);
          }
        }
        if (17 == var5Lifetime4) {
          this.setRetriggerRate(var4Lifetime4, param1 ^ 12154, (var6Lifetime3 << 7) + (this.retriggerRate[var4Lifetime4] & -16257));
        }
        if (var5Lifetime4 != 49) {
          return;
        }
        this.setRetriggerRate(var4Lifetime4, param1 ^ 12148, (-128 & this.retriggerRate[var4Lifetime4]) + var6Lifetime3);
    }

    final synchronized void skipFrames(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        var6 = wizardrun.field_H;
        if (this.midiFile.isReady()) {
          var2 = this.field_r * this.midiFile.field_d / AudioOutput.field_l;
          while (true) {
            var3 = (long)var2 * (long)param0 + this.field_K;
            if (-var3 + this.field_n >= 0L) {
              this.field_K = var3;
              if (var6 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              break;
            }
            var5 = (int)((-1L + ((long)var2 + this.field_n - this.field_K)) / (long)var2);
            this.field_K = this.field_K + (long)var5 * (long)var2;
            this.noteMixer.skipFrames(var5);
            param0 = param0 - var5;
            this.processMidiEvents(false);
            if (!this.midiFile.isReady() &&
              var6 == 0) {
              break;
            }
            if (var6 == 0) {
              continue;
            }
            this.noteMixer.skipFrames(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if ((decompiledFrameCompleted1) &&
          (decompiledFrameCompleted0)) {
          this.noteMixer.skipFrames(param0);
        }

    }

    final synchronized void setInitialProgram(int param0, int param1, byte param2) {
        if (param2 != 108) {
          return;
        }
        this.setDefaultProgram(param0, param1, 1);
    }

    final synchronized void startTrack(boolean param0, int param1, MidiTrack param2) {
        try {
          if (param1 >= -75) {
            this.field_r = -65;
          }
          this.startTrackWithTimeOffset(param0, true, 0, param2);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "fl.T(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void stopPlayback(int param0) {
        this.clearTrack(true, true);
        if (param0 >= -20) {
          field_T = (byte[][][]) null;
        }
    }

    public static void releaseStatics(int param0) {
        int var1 = -95 / ((param0 + 33) / 63);
        field_F = null;
        field_H = null;
        field_T = (byte[][][]) null;
    }

    private final void allNotesOff(int param0, int param1) {
        MidiNote var3;
        int var4;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        var4 = wizardrun.field_H;
        var3 = (MidiNote) (this.noteMixer.field_p.first((byte) 110));
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
          stackIn_10_0 = -1;
          stackIn_10_1 = ~param0;
          if (var4 == 0) {
            if ((stackIn_10_0 < stackIn_10_1 ||
              param0 == var3.channel) &&
              var3.field_j < 0) {
              this.notesByKey[var3.channel][var3.key] = null;
              var3.field_j = 0;
            }
            var3 = (MidiNote) (this.noteMixer.field_p.next(param1 ^ -8193));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_10_0 = param1;
          stackIn_10_1 = -1;
        }
        if (stackIn_10_0 != stackIn_10_1) {
          this.channelFlags = (int[]) null;
        }
        return;
    }

    private final synchronized void startTrackWithTimeOffset(boolean param0, boolean param1, int param2, MidiTrack param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = wizardrun.field_H;
        try {
          this.clearTrack(true, param1);
          this.midiFile.parse(param3.midiBytes);
          stackIn_4_1 = (param0);
          this.field_U = stackIn_4_1;
          this.field_K = (long)param2;
          var5_int = this.midiFile.getTrackCount();
          var6 = 0;
          while (var5_int > var6) {
            this.midiFile.seekTrack(var6);
            this.midiFile.readDeltaTicks(var6);
            this.midiFile.saveTrackPosition(var6);
            var6++;
            if (var7 != 0) {
              return;
            }
          }
          this.field_p = this.midiFile.nextTrack();
          this.field_s = this.midiFile.field_h[this.field_p];
          this.field_n = this.midiFile.timeForTicks(this.field_s);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("fl.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final synchronized void clearTrack(boolean param0, boolean param1) {
        this.midiFile.clear();
        this.field_x = null;
        this.resetChannels(param1, (byte) -71);
        if (!param0) {
          this.fill((int[]) null, -66, -74);
        }
    }

    final boolean removeInactiveNote(int param0, MidiNote param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            return false;
          }
          if (null != param1.sampleStream) {
            return false;
          }
          if (param1.field_j >= 0) {
            param1.unlink(false);
            if (param1.exclusiveGroup > 0 &&
              this.notesByGroup[param1.channel][param1.exclusiveGroup] == param1) {
              this.notesByGroup[param1.channel][param1.exclusiveGroup] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("fl.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final synchronized void setMasterVolume(int param0, int param1) {
        this.masterVolume = param1;
        if (param0 != -1) {
          this.notesByGroup = (MidiNote[][]) null;
        }
    }

    private final void setDefaultProgram(int param0, int param1, int param2) {
        this.defaultPrograms[param1] = param0;
        this.channelBanks[param1] = ResourceArchive.bitAnd(param0, -128);
        if (param2 != 1) {
          this.sampleStartOffset = (int[]) null;
        }
        this.changeProgram(param2 ^ -130, param0, param1);
    }

    private final void resetChannelControllers(int param0, byte param1) {
        int var4 = wizardrun.field_H;
        if (param0 >= 0) {
        } else {
          param0 = 0;
          do {
            if (param0 >= 16) {
              return;
            }
            this.resetChannelControllers(param0, (byte) 21);
            param0++;
          } while (var4 == 0);
          return;
        }
        this.channelVolume[param0] = 12800;
        this.channelPan[param0] = 8192;
        if (param1 == 21) {
          this.channelExpression[param0] = 16383;
          this.channelPitchBend[param0] = 8192;
          this.channelModulation[param0] = 0;
          this.portamentoTime[param0] = 8192;
          this.releasePortamentoNotes(256, param0);
          this.resetRetriggerPhases(-1, param0);
          this.channelFlags[param0] = 0;
          this.registeredParameter[param0] = 32767;
          this.pitchBendRange[param0] = 256;
          this.sampleStartOffset[param0] = 0;
          this.setRetriggerRate(param0, param1 + 103, 8192);
          return;
        }
    }

    final boolean updateNote(int param0, int[] param1, MidiNote param2, int param3, int param4) {
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        MidiEnvelope var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = wizardrun.field_H;
        try {
          param2.field_E = AudioOutput.field_l / 100;
          if (param2.field_j >= 0 && (null == param2.sampleStream ||
            param2.sampleStream.isOutOfBounds())) {
            param2.clearAudioReferences(0);
            param2.unlink(false);
            if (0 < param2.exclusiveGroup &&
              param2 == this.notesByGroup[param2.channel][param2.exclusiveGroup]) {
              this.notesByGroup[param2.channel][param2.exclusiveGroup] = null;
              return true;
            }
            return true;
          }
          var6_int = param2.field_y;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.portamentoTime[param2.channel]) + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param2.field_y = var6_int;
          }
          param2.sampleStream.setRateMagnitude(this.computeNotePlaybackRate(-822, param2));
          var7 = param2.envelope;
          param2.field_q = param2.field_q + 1;
          param2.field_x = param2.field_x + var7.field_k;
          var8 = 0;
          var9 = (double)((-60 + param2.key << 8) + (param2.field_I * param2.field_y >> 12)) * 0.000005086263020833333;
          if (var7.field_h > 0) {
            if (var7.field_d > 0) {
              param2.field_m = param2.field_m + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_d * var9));
              if (var11 != 0) {
                param2.field_m = param2.field_m + 128;
              }
            } else {
              param2.field_m = param2.field_m + 128;
            }
            if (var7.field_h * param2.field_m >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_f) {
            boolean decompiledSharedTail1 = !(var7.field_i <= 0);
            if (!decompiledSharedTail1) {
              param2.field_K = param2.field_K + 128;
              decompiledSharedTail1 = (var11 != 0);
            }
            if (decompiledSharedTail1) {
              param2.field_K = param2.field_K + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_i));
            }
            while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (param2.field_n < var7.field_f.length - 2) {
                stackIn_35_0 = (255 & var7.field_f[2 + param2.field_n]) << 8;
                stackIn_35_1 = param2.field_K;
                decompiledFrameRemainder1 = (var11 == 0);
                if ((decompiledFrameRemainder1) &&
                  (stackIn_35_0 < stackIn_35_1)) {
                  param2.field_n = param2.field_n + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_35_0 = var7.field_f.length - 2;
                stackIn_35_1 = param2.field_n;
              }
              if (stackIn_35_0 != stackIn_35_1) {
                break;
              }
              if (var7.field_f[param2.field_n + 1] != 0) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (param2.field_j >= param0 &&
            null != var7.field_c &&
            (this.channelFlags[param2.channel] & 1) == 0 && (!(param2.exclusiveGroup >= 0) ||
            param2 != this.notesByGroup[param2.channel][param2.exclusiveGroup])) {
            boolean decompiledSharedTail0 = !(0 >= var7.field_j);
            if (!decompiledSharedTail0) {
              param2.field_j = param2.field_j + 128;
              decompiledSharedTail0 = (var11 != 0);
            }
            if (decompiledSharedTail0) {
              param2.field_j = param2.field_j + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_j) * 128.0);
            }
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var7.field_c.length - 2 > param2.field_s) {
                stackIn_55_0 = param2.field_j;
                stackIn_55_1 = var7.field_c[2 + param2.field_s] << 8 & 65280;
                decompiledFrameRemainder0 = (var11 == 0);
                if ((decompiledFrameRemainder0) &&
                  (stackIn_55_0 > stackIn_55_1)) {
                  param2.field_s = param2.field_s + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_55_0 = param2.field_s;
                stackIn_55_1 = -2 + var7.field_c.length;
              }
              if (stackIn_55_0 != stackIn_55_1) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (var8 == 0) {
            param2.sampleStream.rampVolumeAndPan(param2.field_E, this.computeNoteVolume(param2, -109), this.computeNotePan(param2, (byte) 59));
            return false;
          }
          param2.sampleStream.fadeOutAndUnlink(param2.field_E);
          if (param1 != null) {
            param2.sampleStream.fill(param1, param4, param3);
            if (var11 != 0) {
              param2.sampleStream.skipFrames(param3);
            }
          } else {
            param2.sampleStream.skipFrames(param3);
          }
          if (param2.sampleStream.isRamping()) {
            this.noteMixer.field_o.addStream(param2.sampleStream);
          }
          param2.clearAudioReferences(0);
          if (param2.field_j >= 0) {
            param2.unlink(false);
            if (param2.exclusiveGroup > 0 &&
              this.notesByGroup[param2.channel][param2.exclusiveGroup] == param2) {
              this.notesByGroup[param2.channel][param2.exclusiveGroup] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_76_0 = var6;
          stackIn_76_1 = new StringBuilder().append("fl.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final synchronized void setChannelGain(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        boolean decompiledFrameCompleted0 = true;
        var5 = wizardrun.field_H;
        if (param2 < 0) {
          var4 = 0;
          while (var4 < 16) {
            this.channelGain[var4] = param0;
            var4++;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
          if ((decompiledFrameCompleted0) &&
            (var5 != 0)) {
            this.channelGain[param2] = param0;
          }
        } else {
          this.channelGain[param2] = param0;
        }
        if (param1 <= 99) {
          field_T = (byte[][][]) null;
        }
    }

    final synchronized int mixingCost() {
        return 0;
    }

    final static void sortAndLimitRankings(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = wizardrun.field_H;
        try {
          wizardrun.sortRankingIndices(true, (byte) 11, param0, FullscreenFailureKind.rankingCount, ArchiveContainerHelpers.field_d, DisplayModeInfo.field_e, 0);
          var2_int = 0;
          if (param1 != 16) {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var2), "fl.QA(" + param0 + ',' + param1 + ')');
        }
        stackIn_5_0 = FullscreenFailureKind.rankingCount;
        try {
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (stackIn_5_0 <= var2_int))) {
            EmailAddressValidator.field_m[param0 + var2_int] = var2_int;
            var2_int++;
            if (var3 == 0) {
              stackIn_5_0 = FullscreenFailureKind.rankingCount;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            wizardrun.sortRankingIndices(false, (byte) 11, param0 + param0, FullscreenFailureKind.rankingCount + param0, ContentTransitionDialog.field_W, ByteStorage.field_b, param0);
          }
          if (FullscreenFailureKind.rankingCount > param0) {
            FullscreenFailureKind.rankingCount = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var2), "fl.QA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int computeNoteVolume(MidiNote param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        MidiEnvelope var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          var3_int = 123 / ((49 - param1) / 44);
          if (this.channelGain[param0.channel] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var4 = param0.envelope;
          var5 = 4096 + this.channelVolume[param0.channel] * this.channelExpression[param0.channel] >> 13;
          var5 = var5 * var5 + 16384 >> 15;
          var5 = 16384 + param0.field_D * var5 >> 15;
          var5 = 128 + this.masterVolume * var5 >> 8;
          var5 = 128 + var5 * this.channelGain[param0.channel] >> 8;
          if (var4.field_h > 0) {
            var5 = (int)((double)var5 * Math.pow(0.5, (double)var4.field_h * ((double)param0.field_m * 0.00001953125)) + 0.5);
          }
          if (null != var4.field_f) {
            var6 = param0.field_K;
            var7 = var4.field_f[1 + param0.field_n];
            if (param0.field_n < -2 + var4.field_f.length) {
              var8 = (var4.field_f[param0.field_n] & 255) << 8;
              var9 = (255 & var4.field_f[param0.field_n + 2]) << 8;
              var7 = var7 + (-var7 + var4.field_f[param0.field_n + 3]) * (var6 - var8) / (-var8 + var9);
            }
            var5 = var5 * var7 + 32 >> 6;
          }
          if (param0.field_j > 0 &&
            null != var4.field_c) {
            var6Lifetime1 = param0.field_j;
            var7Lifetime1 = var4.field_c[1 + param0.field_s];
            if (var4.field_c.length - 2 > param0.field_s) {
              var8Lifetime1 = var4.field_c[param0.field_s] << 8 & 65280;
              var9Lifetime1 = (var4.field_c[param0.field_s + 2] & 255) << 8;
              var7Lifetime1 = var7Lifetime1 + (var6Lifetime1 - var8Lifetime1) * (var4.field_c[3 + param0.field_s] - var7Lifetime1) / (-var8Lifetime1 + var9Lifetime1);
            }
            var5 = var7Lifetime1 * var5 + 32 >> 6;
          }
          stackIn_18_0 = var5;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("fl.U(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void noteOff(int param0, int param1, int param2, byte param3) {
        MidiNote var6 = null;
        int var7 = 0;
        MidiNote var8 = null;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        var7 = wizardrun.field_H;
        var8 = this.notesByKey[param2][param0];
        if (var8 == null) {
          return;
        }
        boolean decompiledFrameCompleted0 = true;
        this.notesByKey[param2][param0] = null;
        if ((this.channelFlags[param2] & 2) != 0) {
          var6 = (MidiNote) (this.noteMixer.field_p.first((byte) 84));
          while (true) {
            if (var6 != null) {
              stackIn_16_0 = ~var8.channel;
              stackIn_16_1 = ~var6.channel;
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_16_0 == stackIn_16_1 &&
                var6.field_j < 0 &&
                var6 != var8) {
                var8.field_j = 0;
              } else {
                var6 = (MidiNote) (this.noteMixer.field_p.next(8192));
                continue;
              }
            }
            break;
          }
          if ((decompiledFrameCompleted0) &&
            (var7 != 0)) {
            var8.field_j = 0;
          }
        } else {
          var8.field_j = 0;
        }
        if (decompiledFrameCompleted0) {
          stackIn_16_0 = param3;
          stackIn_16_1 = -16;
        }
        if (stackIn_16_0 != stackIn_16_1) {
          this.channelPrograms = (int[]) null;
        }
    }

    final synchronized void fill(int[] param0, int param1, int param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = wizardrun.field_H;
        try {
          if (this.midiFile.isReady()) {
            var4_int = this.field_r * this.midiFile.field_d / AudioOutput.field_l;
            while (true) {
              var5 = this.field_K + (long)param2 * (long)var4_int;
              if (this.field_n - var5 >= 0L) {
                this.field_K = var5;
                if (var8 != 0) {
                  return;
                }
                break;
              }
              var7 = (int)((-1L + (long)var4_int + (-this.field_K + this.field_n)) / (long)var4_int);
              this.field_K = this.field_K + (long)var7 * (long)var4_int;
              this.noteMixer.fill(param0, param1, var7);
              param1 = param1 + var7;
              param2 = param2 - var7;
              this.processMidiEvents(false);
              if (!this.midiFile.isReady() &&
                var8 == 0) {
                break;
              }
              if (var8 == 0) {
                continue;
              }
              this.noteMixer.fill(param0, param1, param2);
              return;
            }
          }
          this.noteMixer.fill(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("fl.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void setPitchBend(int param0, int param1, int param2) {
        this.channelPitchBend[param0] = param1;
        if (param2 != 38) {
          this.handleChannelPressure(11, -69, 19);
        }
    }

    private final void resetChannels(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = wizardrun.field_H;
        if (!param0) {
          this.allNotesOff(-1, -1);
          if (var4 != 0) {
            this.allSoundOff(0, -1);
          }
        } else {
          this.allSoundOff(0, -1);
        }
        this.resetChannelControllers(-1, (byte) 21);
        var3 = 0;
        do {
          if (16 <= var3) {
            var3 = 0;
            break;
          }
          this.channelPrograms[var3] = this.defaultPrograms[var3];
          var3++;
        } while (var4 == 0);
        if (param1 > -62) {
          this.setDefaultProgram(-85, 122, -57);
        }
        while (16 > var3) {
          this.channelBanks[var3] = ResourceArchive.bitAnd(this.defaultPrograms[var3], -128);
          var3++;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        return;
    }

    private final void resetRetriggerPhases(int param0, int param1) {
        MidiNote var3;
        int var4;
        var4 = wizardrun.field_H;
        if (param0 != ~(4 & this.channelFlags[param1])) {
          var3 = (MidiNote) (this.noteMixer.field_p.first((byte) 55));
          while (var3 != null) {
            if (var4 != 0) {
              break;
            }
            if (param1 == var3.channel) {
              var3.field_H = 0;
            }
            var3 = (MidiNote) (this.noteMixer.field_p.next(8192));
          }
        }
    }

    final synchronized PcmStream firstSubstream() {
        return (PcmStream) ((Object) this.noteMixer);
    }

    private final void allSoundOff(int param0, int param1) {
        MidiNote var3;
        int var4;
        var4 = wizardrun.field_H;
        if (param0 != 0) {
          return;
        }
        var3 = (MidiNote) (this.noteMixer.field_p.first((byte) 92));
        while (var3 != null) {
          if (var4 == 0) {
            if (param1 < 0 ||
              var3.channel == param1) {
              if (var3.sampleStream != null) {
                var3.sampleStream.fadeOutAndUnlink(AudioOutput.field_l / 100);
                if (var3.sampleStream.isRamping()) {
                  this.noteMixer.field_o.addStream(var3.sampleStream);
                }
                var3.clearAudioReferences(0);
              }
              if (var3.field_j < 0) {
                this.notesByKey[var3.channel][var3.key] = null;
              }
              var3.unlink(false);
            }
            var3 = (MidiNote) (this.noteMixer.field_p.next(8192));
            continue;
          }
          break;
        }
        return;
    }

    private final void handleChannelPressure(int param0, int param1, int param2) {
        if (param1 != 2) {
          MidiPcmStream.sortAndLimitRankings(67, -78);
        }
    }

    public MidiPcmStream() {
        this.field_r = 1000000;
        this.pitchBendRange = new int[16];
        this.channelGain = new int[16];
        this.retriggerPhaseStep = new int[16];
        this.channelBanks = new int[16];
        this.channelVolume = new int[16];
        this.channelFlags = new int[16];
        this.channelPan = new int[16];
        this.portamentoTime = new int[16];
        this.channelPrograms = new int[16];
        this.notesByKey = new MidiNote[16][128];
        this.channelPitchBend = new int[16];
        this.channelModulation = new int[16];
        this.channelExpression = new int[16];
        this.retriggerRate = new int[16];
        this.defaultPrograms = new int[16];
        this.notesByGroup = new MidiNote[16][128];
        this.masterVolume = 256;
        this.registeredParameter = new int[16];
        this.sampleStartOffset = new int[16];
        this.midiFile = new MidiFileReader();
        this.noteMixer = new MidiNoteMixer(this);
        this.patches = new IntrusiveNodeHashTable(128);
        this.setChannelGain(256, 114, -1);
        this.resetChannels(true, (byte) -67);
    }

    static {
        DiskCacheRequest.configureMembershipSlideTiming(16062, 50);
    }
}
