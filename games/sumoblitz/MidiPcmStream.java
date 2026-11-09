/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiPcmStream extends PcmStream {
    private int timeScale;
    private int[] pitchBend;
    private int[] initialPrograms;
    int[] sampleOffsets;
    private int[] banks;
    private int[] channelExpression;
    private int[] channelVolumeScales;
    private MidiFileReader midiReader;
    private int[] programs;
    private int[] parameterSelection;
    private MusicVoice[][] groupVoices;
    private int masterVolume;
    private int[] pitchBendSensitivity;
    private IntrusiveNodeHashTable patches;
    int[] retriggerRates;
    private int[] retriggerControllers;
    private int[] channelVolume;
    private int[] channelPan;
    private MusicVoice[][] keyVoices;
    private int[] portamentoTime;
    private int[] modulation;
    static char[] field_o;
    int[] channelFlags;
    private boolean looping;
    private long nextEventTime;
    private MidiNoteMixer noteMixer;
    private int nextEventTick;
    private long currentTime;
    private int nextTrack;
    private int switchTick;
    private boolean stopVoicesOnSwitch;
    private MusicTrack pendingTrack;

    final synchronized boolean isPlaying(int param0) {
        if (param0 != -8192) {
          this.playTrack(false, (MusicTrack) null, -40);
        }
        return this.midiReader.isReady();
    }

    final synchronized PcmStream nextSubstream() {
        return null;
    }

    private final int voiceVolume(int guard, MusicVoice voice) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        MusicPatchEnvelope var9 = null;
        MusicPatchEnvelope var10 = null;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (guard != 255) {
            this.channelExpression = (int[]) null;
          }
          if (this.channelVolumeScales[voice.channel] == 0) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          var9 = voice.envelope;
          var10 = var9;
          var4 = 4096 + this.channelExpression[voice.channel] * this.channelVolume[voice.channel] >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + voice.velocityGain * var4 >> 15;
          var4 = 128 + this.masterVolume * var4 >> 8;
          var4 = var4 * this.channelVolumeScales[voice.channel] + 128 >> 8;
          if (0 < var10.decayRate) {
            var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, 0.00001953125 * (double)voice.decayTime * (double)var10.decayRate));
          }
          if (null != var10.gainCurve) {
            var5 = voice.gainEnvelopeTime;
            var6 = var10.gainCurve[voice.gainEnvelopeIndex + 1];
            if (voice.gainEnvelopeIndex < (-2 + var10.gainCurve.length)) {
              var7 = 65280 & var9.gainCurve[voice.gainEnvelopeIndex] << 8;
              var8 = var10.gainCurve[voice.gainEnvelopeIndex + 2] << 8 & 65280;
              var6 = var6 + (var5 - var7) * (-var6 + var10.gainCurve[3 + voice.gainEnvelopeIndex]) / (-var7 + var8);
            }
            var4 = 32 + var6 * var4 >> 6;
          }
          if (voice.releaseTime > 0 &&
            var10.releaseCurve != null) {
            var5Lifetime1 = voice.releaseTime;
            var6Lifetime1 = var10.releaseCurve[1 + voice.releaseEnvelopeIndex];
            if ((-2 + var10.releaseCurve.length) > voice.releaseEnvelopeIndex) {
              var7Lifetime1 = (var9.releaseCurve[voice.releaseEnvelopeIndex] & 255) << 8;
              var8Lifetime1 = 65280 & var10.releaseCurve[voice.releaseEnvelopeIndex + 2] << 8;
              var6Lifetime1 = var6Lifetime1 + (var10.releaseCurve[3 + voice.releaseEnvelopeIndex] - var6Lifetime1) * (-var7Lifetime1 + var5Lifetime1) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = var6Lifetime1 * var4 + 32 >> 6;
          }
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("bs.I(").append(guard).append(',');
          if (voice == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void noteOff(int velocity, int note, int guard, int channel) {
        MusicVoice var6 = null;
        int var7 = 0;
        MusicVoice var8 = null;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var8 = this.keyVoices[channel][note];
        if (var8 == null) {
          return;
        }
        boolean decompiledFrameCompleted0 = true;
        this.keyVoices[channel][note] = null;
        if ((this.channelFlags[channel] & 2) != 0) {
          var6 = (MusicVoice) (this.noteMixer.voices.first(guard - 12866));
          while (true) {
            if (var6 != null) {
              stackIn_15_0 = var8.channel;
              stackIn_15_1 = var6.channel;
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_15_0 == stackIn_15_1 &&
                var6.releaseTime < 0 &&
                var8 != var6) {
                var8.releaseTime = 0;
              } else {
                var6 = (MusicVoice) (this.noteMixer.voices.next((byte) 18));
                continue;
              }
            }
            break;
          }
          if ((decompiledFrameCompleted0) &&
            (var7 != 0)) {
            var8.releaseTime = 0;
          }
        } else {
          var8.releaseTime = 0;
        }
        if (decompiledFrameCompleted0) {
          stackIn_15_0 = guard;
          stackIn_15_1 = 12800;
        }
        if (stackIn_15_0 != stackIn_15_1) {
          this.masterVolume = 50;
        }
    }

    private final int voiceSampleStep(boolean guard, MusicVoice voice) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        MusicPatchEnvelope var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = (voice.portamentoDelta * voice.portamentoScaleQ12 >> 12) + voice.basePitchQ8;
          var3_int = var3_int + (this.pitchBendSensitivity[voice.channel] * (-8192 + this.pitchBend[voice.channel]) >> 12);
          if (!guard) {
            this.currentTime = 8L;
          }
          var4 = voice.envelope;
          if (var4.vibratoRate > 0 && (!(var4.vibratoDepth <= 0) ||
            this.modulation[voice.channel] > 0)) {
            var5 = var4.vibratoDepth << 2;
            var6 = var4.vibratoDelay << 1;
            if (var6 > voice.ageTicks) {
              var5 = var5 * voice.ageTicks / var6;
            }
            var5 = var5 + (this.modulation[voice.channel] >> 7);
            var7 = Math.sin((double)(511 & voice.vibratoPhase) * 0.01227184630308513);
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)(0.5 + (double)(voice.sample.sampleRate * 256) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)AudioOutput.sampleRate);
          stackIn_13_0 = (var5Lifetime1 >= 1) ? var5Lifetime1 : 1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("bs.QA(").append(guard).append(',');
          if (voice == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void resetControllers(int channel, boolean guard) {
        int discarded$1 = 0;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (0 > channel) {
          channel = 0;
          do {
            if (channel >= 16) {
              return;
            }
            this.resetControllers(channel, true);
            channel++;
          } while (var4 == 0);
          return;
        }
        this.channelVolume[channel] = 12800;
        this.channelPan[channel] = 8192;
        this.channelExpression[channel] = 16383;
        this.pitchBend[channel] = 8192;
        this.modulation[channel] = 0;
        this.portamentoTime[channel] = 8192;
        this.releasePortamentoVoices(channel, (byte) 126);
        this.resetRetriggerPhases(channel, 32605);
        if (!guard) {
          discarded$1 = this.voicePan(45, (MusicVoice) null);
        }
        this.channelFlags[channel] = 0;
        this.parameterSelection[channel] = 32767;
        this.pitchBendSensitivity[channel] = 256;
        this.sampleOffsets[channel] = 0;
        this.setRetriggerRate(8192, channel, 41);
    }

    private final void resetSynthesizer(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0) {
          this.allSoundOff(-1, -1);
        }
        if (!param0 ||
          var4 != 0) {
          this.allNotesOff(-1, (byte) -30);
        }
        this.resetControllers(-1, param1);
        var3 = 0;
        do {
          if (var3 >= 16) {
            var3 = 0;
            break;
          }
          this.programs[var3] = this.initialPrograms[var3];
          var3++;
        } while (var4 == 0);
        while (var3 < 16) {
          this.banks[var3] = LegacyOpenGlPostProcessManager.bitwiseAnd(this.initialPrograms[var3], -128);
          var3++;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        return;
    }

    final synchronized boolean loadTrackPatches(SoundCache param0, MusicTrack param1, int param2, ResourceArchive param3, int param4) {
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
        InstrumentNoteMask var8 = null;
        int var9 = 0;
        MusicPatch var10 = null;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          param1.buildInstrumentUsage();
          var6_int = 1;
          var7 = null;
          if (~param4 < param2) {
            var7 = new int[]{param4};
          }
          var8 = (InstrumentNoteMask) (param1.instrumentUsage.a(52));
          scanLoop1: while (true) {
            if (var8 != null) {
              var9 = (int)var8.key;
              var10 = (MusicPatch) (this.patches.a(param2 ^ -119, (long)var9));
              if (var11 == 0) {
                boolean decompiledFrameRemainder0 = true;
                if (var10 == null) {
                  var10 = DisplayModeErrorDialog.a(param3, var9, 0);
                  if (var10 == null) {
                    var6_int = 0;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    this.patches.a(var10, param2 ^ 0, (long)var9);
                    decompiledFrameRemainder0 = !(var10.loadSamples(var8.notes, (int[]) (var7), param0, 1255750754));
                  }
                } else {
                  decompiledFrameRemainder0 = !(var10.loadSamples(var8.notes, (int[]) (var7), param0, 1255750754));
                }
                if (decompiledFrameRemainder0) {
                  var6_int = 0;
                }
                var8 = (InstrumentNoteMask) (param1.instrumentUsage.a(true));
                continue;
              }
            } else {
              if (var6_int == 0) {
                break scanLoop1;
              }
            }
            param1.clearInstrumentUsage();
            break;
          }
          stackIn_19_0 = var6_int;
          return stackIn_19_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("bs.EA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(')').toString());
        }
    }

    final synchronized PcmStream firstSubstream() {
        return (PcmStream) ((Object) this.noteMixer);
    }

    final synchronized int activityWeight() {
        return 0;
    }

    private final int voicePan(int guard, MusicVoice voice) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 16384) {
            this.modulation = (int[]) null;
          }
          var3_int = this.channelPan[voice.channel];
          if (8192 <= var3_int) {
            stackIn_6_0 = 16384 - ((128 - voice.pan) * (16384 - var3_int) + 32 >> 6);
            return stackIn_6_0;
          }
          stackIn_4_0 = var3_int * voice.pan + 32 >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("bs.HA(").append(guard).append(',');
          if (voice == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final synchronized void playTrack(boolean param0, MusicTrack param1, int param2) {
        try {
          if (param2 <= 48) {
            this.setRetriggerRate(0, -127, 115);
          }
          this.startTrack(param0, true, true, param1);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "bs.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean updateVoice(int[] output, int offset, int sampleCount, MusicVoice voice, int guard) {
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        MusicPatchEnvelope var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          voice.samplesUntilUpdate = AudioOutput.sampleRate / 100;
          if (voice.releaseTime >= 0 && (voice.stream == null ||
            voice.stream.isOutOfBounds())) {
            voice.clearReferences(0);
            voice.unlink(false);
            if (voice.exclusiveGroup > 0 &&
              this.groupVoices[voice.channel][voice.exclusiveGroup] == voice) {
              this.groupVoices[voice.channel][voice.exclusiveGroup] = null;
              return true;
            }
            return true;
          }
          var6_int = voice.portamentoScaleQ12;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(16.0 * Math.pow(2.0, (double)this.portamentoTime[voice.channel] * 0.0004921259842519685) + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            voice.portamentoScaleQ12 = var6_int;
          }
          voice.stream.setStepMagnitude(this.voiceSampleStep(true, voice));
          var7 = voice.envelope;
          voice.vibratoPhase = voice.vibratoPhase + var7.vibratoRate;
          var8 = 0;
          voice.ageTicks = voice.ageTicks + 1;
          var9 = (double)((voice.portamentoScaleQ12 * voice.portamentoDelta >> 12) + (-60 + voice.note << 8)) * 0.000005086263020833333;
          if (var7.decayRate > 0) {
            boolean decompiledSharedTail0 = !(var7.decayKeyScale <= 0);
            if (!decompiledSharedTail0) {
              voice.decayTime = voice.decayTime + 128;
              decompiledSharedTail0 = (var11 != 0);
            }
            if (decompiledSharedTail0) {
              voice.decayTime = voice.decayTime + (int)(128.0 * Math.pow(2.0, (double)var7.decayKeyScale * var9) + 0.5);
            }
            if (819200 <= var7.decayRate * voice.decayTime) {
              var8 = 1;
            }
          }
          if (var7.gainCurve != null) {
            if (0 < var7.gainKeyScale) {
              voice.gainEnvelopeTime = voice.gainEnvelopeTime + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.gainKeyScale) * 128.0);
              if (var11 != 0) {
                voice.gainEnvelopeTime = voice.gainEnvelopeTime + 128;
              }
            } else {
              voice.gainEnvelopeTime = voice.gainEnvelopeTime + 128;
            }
            while (true) {
              boolean decompiledFrameRemainder1 = true;
              if ((var7.gainCurve.length - 2) > voice.gainEnvelopeIndex) {
                stackIn_34_0 = voice.gainEnvelopeTime;
                stackIn_34_1 = (255 & var7.gainCurve[voice.gainEnvelopeIndex + 2]) << 8;
                decompiledFrameRemainder1 = (var11 == 0);
                if ((decompiledFrameRemainder1) &&
                  (stackIn_34_0 > stackIn_34_1)) {
                  voice.gainEnvelopeIndex = voice.gainEnvelopeIndex + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_34_0 = ~(var7.gainCurve.length - 2);
                stackIn_34_1 = ~voice.gainEnvelopeIndex;
              }
              if (stackIn_34_0 != stackIn_34_1) {
                break;
              }
              if (0 != var7.gainCurve[voice.gainEnvelopeIndex + 1]) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (guard <= voice.releaseTime &&
            var7.releaseCurve != null &&
            (1 & this.channelFlags[voice.channel]) == 0 && (!(voice.exclusiveGroup >= 0) ||
            this.groupVoices[voice.channel][voice.exclusiveGroup] != voice)) {
            if (var7.releaseKeyScale > 0) {
              voice.releaseTime = voice.releaseTime + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.releaseKeyScale));
              if (var11 != 0) {
                voice.releaseTime = voice.releaseTime + 128;
              }
            } else {
              voice.releaseTime = voice.releaseTime + 128;
            }
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (voice.releaseEnvelopeIndex < var7.releaseCurve.length - 2) {
                stackIn_55_0 = voice.releaseTime;
                stackIn_55_1 = (var7.releaseCurve[2 + voice.releaseEnvelopeIndex] & 255) << 8;
                decompiledFrameRemainder0 = (var11 == 0);
                if ((decompiledFrameRemainder0) &&
                  (stackIn_55_0 > stackIn_55_1)) {
                  voice.releaseEnvelopeIndex = voice.releaseEnvelopeIndex + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_55_0 = voice.releaseEnvelopeIndex;
                stackIn_55_1 = var7.releaseCurve.length - 2;
              }
              if (stackIn_55_0 != stackIn_55_1) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (var8 == 0) {
            voice.stream.rampVolumeAndPan(voice.samplesUntilUpdate, this.voiceVolume(255, voice), this.voicePan(guard ^ 16384, voice));
            return false;
          }
          voice.stream.fadeOutAndUnlink(voice.samplesUntilUpdate);
          if (output != null) {
            voice.stream.mixInto(output, offset, sampleCount);
            if (var11 != 0) {
              voice.stream.skip(sampleCount);
            }
          } else {
            voice.stream.skip(sampleCount);
          }
          if (voice.stream.isRamping()) {
            this.noteMixer.fadingStreams.addSubstream(voice.stream);
          }
          voice.clearReferences(0);
          if (voice.releaseTime >= 0) {
            voice.unlink(false);
            if (voice.exclusiveGroup > 0 &&
              this.groupVoices[voice.channel][voice.exclusiveGroup] == voice) {
              this.groupVoices[voice.channel][voice.exclusiveGroup] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_77_0 = var6;
          stackIn_77_1 = new StringBuilder().append("bs.IA(");
          if (output == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(offset).append(',').append(sampleCount).append(',');
          if (voice == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void releasePortamentoVoices(int param0, byte param1) {
        MusicVoice var3;
        int var4;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        boolean decompiledFrameCompleted0 = true;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if ((2 & this.channelFlags[param0]) != 0) {
          var3 = (MusicVoice) (this.noteMixer.voices.first(-78));
          while (var3 != null) {
            stackIn_12_0 = var3.channel;
            stackIn_12_1 = param0;
            if (var4 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (stackIn_12_0 == stackIn_12_1 &&
              this.keyVoices[param0][var3.note] == null &&
              0 > var3.releaseTime) {
              var3.releaseTime = 0;
            }
            var3 = (MusicVoice) (this.noteMixer.voices.next((byte) 18));
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_12_0 = param1;
          stackIn_12_1 = 120;
        }
        if (stackIn_12_0 <= stackIn_12_1) {
          this.channelFlags = (int[]) null;
        }
    }

    final void applySampleOffset(byte guard, MusicVoice voice, boolean looping) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        try {
          var4_int = voice.sample.samples.length;
          boolean decompiledSharedTail0 = (!(looping) ||
            !(voice.sample.pingPong));
          if (!decompiledSharedTail0) {
            var6 = -voice.sample.loopStart + (var4_int + var4_int);
            var5 = (int)((long)var6 * (long)this.sampleOffsets[voice.channel] >> 6);
            var4_int = var4_int << 8;
            if (var4_int <= var5) {
              voice.stream.setReversed(true);
              var5 = -var5 + (var4_int + var4_int) - 1;
            }
            decompiledSharedTail0 = (Sumoblitz.field_L);
          }
          if (decompiledSharedTail0) {
            var5 = (int)((long)var4_int * (long)this.sampleOffsets[voice.channel] >> 6);
          }
          var6Lifetime1 = -121 / ((22 - guard) / 59);
          voice.stream.setPosition(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("bs.GA(").append(guard).append(',');
          if (voice == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(looping).append(')').toString());
        }
    }

    final synchronized void setMasterVolume(int volume, boolean guard) {
        if (!guard) {
          this.channelVolumeScales = (int[]) null;
        }
        this.masterVolume = volume;
    }

    private final void setPitchBend(int channel, int guard, int value) {
        this.pitchBend[channel] = value;
        if (guard > -98) {
          this.pitchBendSensitivity = (int[]) null;
        }
    }

    private final void advanceMidiEvents(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var2 = this.nextTrack;
        if (param0 != 18922) {
          this.midiReader = (MidiFileReader) null;
        }
        var3 = this.nextEventTick;
        var4 = this.nextEventTime;
        if (null != this.pendingTrack &&
          ~var3 == ~this.switchTick) {
          this.startTrack(this.looping, true, this.stopVoicesOnSwitch, this.pendingTrack);
          this.advanceMidiEvents(18922);
          return;
        }
        while (true) {
          stackIn_7_0 = ~var3;
          stackIn_7_1 = ~this.nextEventTick;
          regionExit1: {
            if (stackIn_7_0 == stackIn_7_1) {
              scanLoop2: while (true) {
                stackIn_29_0 = ~var3;
                stackIn_29_1 = ~this.midiReader.trackTicks[var2];
                if (var7 != 0) {
                  break regionExit1;
                }
                if (stackIn_29_0 == stackIn_29_1) {
                  this.midiReader.seekTrack(var2);
                  var6 = this.midiReader.readMessage(var2);
                  stackIn_7_0 = ~var6;
                  stackIn_7_1 = -2;
                  if (stackIn_7_0 == stackIn_7_1) {
                    this.midiReader.markTrackDone();
                    this.midiReader.saveTrackPosition(var2);
                    if (!this.midiReader.allTracksDone() &&
                      var7 == 0) {
                      break scanLoop2;
                    }
                    if (this.pendingTrack != null) {
                      this.playTrack(this.looping, this.pendingTrack, 107);
                      this.advanceMidiEvents(18922);
                      return;
                    }
                    if (this.looping &&
                      var3 != 0) {
                      this.midiReader.reset(var4);
                      break scanLoop2;
                    }
                    this.resetSynthesizer(true, true);
                    this.midiReader.clear();
                    return;
                  }
                  if (0 != (var6 & 128)) {
                    this.dispatchMidiEvent(var6, (byte) -82);
                  }
                  this.midiReader.readTrackDelta(var2);
                  this.midiReader.saveTrackPosition(var2);
                  continue;
                }
                break;
              }
              var2 = this.midiReader.nextTrack();
              var3 = this.midiReader.trackTicks[var2];
              var4 = this.midiReader.timeAtTick(var3);
              continue;
            }
            this.nextEventTime = var4;
            this.nextEventTick = var3;
            this.nextTrack = var2;
            if (this.pendingTrack == null) {
              return;
            }
            stackIn_29_0 = ~this.switchTick;
            stackIn_29_1 = ~var3;
          }
          if (stackIn_29_0 > stackIn_29_1) {
            this.nextEventTick = this.switchTick;
            this.nextTrack = -1;
            this.nextEventTime = this.midiReader.timeAtTick(this.nextEventTick);
          }
          return;
        }
    }

    private final void noteOn(int velocity, byte guard, int channel, int note) {
        int stackIn_17_1 = 0;
        MusicVoice stackIn_17_2 = null;
        Object stackIn_18_0;
        boolean stackIn_18_3;
        MusicVoice var5;
        int var6_int;
        PcmSample var6;
        MusicVoice var7;
        int var8;
        MusicVoice var9;
        int var10;
        MusicPatch var11;
        MusicPatch var12;
        var10 = Sumoblitz.field_L ? 1 : 0;
        this.noteOff(64, note, 12800, channel);
        if ((this.channelFlags[channel] & 2) != 0) {
          var5 = (MusicVoice) (this.noteMixer.voices.last(9));
          while (var5 != null) {
            if (~channel == ~var5.channel &&
              0 > var5.releaseTime) {
              this.keyVoices[channel][var5.note] = null;
              this.keyVoices[channel][note] = var5;
              var6_int = var5.basePitchQ8 + (var5.portamentoDelta * var5.portamentoScaleQ12 >> 12);
              var5.basePitchQ8 = var5.basePitchQ8 + (-var5.note + note << 8);
              var5.portamentoDelta = -var5.basePitchQ8 + var6_int;
              var5.note = note;
              var5.portamentoScaleQ12 = 4096;
              return;
            }
            var5 = (MusicVoice) (this.noteMixer.voices.previous(9));
            if (var10 == 0) {
              continue;
            }
            break;
          }
        }
        var11 = (MusicPatch) (this.patches.a(115, (long)this.programs[channel]));
        var12 = var11;
        if (var12 == null) {
          return;
        }
        var6 = var11.samples[note];
        if (var6 == null) {
          return;
        }
        var7 = new MusicVoice();
        var7.patch = var12;
        var7.channel = channel;
        var7.sample = var6;
        var7.envelope = var11.envelopes[note];
        var7.exclusiveGroup = var11.exclusiveGroups[note];
        var8 = -115 % ((-80 - guard) / 43);
        var7.note = note;
        var7.velocityGain = 1024 + var12.volume * (velocity * (velocity * var11.noteVolumes[note])) >> 11;
        var7.pan = var11.notePans[note] & 255;
        var7.basePitchQ8 = -(32767 & var11.tunings[note]) + (note << 8);
        var7.gainEnvelopeTime = 0;
        var7.gainEnvelopeIndex = 0;
        var7.releaseTime = -1;
        var7.decayTime = 0;
        var7.releaseEnvelopeIndex = 0;
        if (0 == this.sampleOffsets[channel]) {
          var7.stream = PcmSampleStream.createForSampleStep(var6, this.voiceSampleStep(true, var7), this.voiceVolume(255, var7), this.voicePan(16384, var7));
          if (var10 != 0) {
            var7.stream = PcmSampleStream.createForSampleStep(var6, this.voiceSampleStep(true, var7), 0, this.voicePan(16384, var7));
            stackIn_17_1 = 110;
            stackIn_17_2 = var7;
            if (var11.tunings[note] >= 0) {
              stackIn_18_0 = this;
              stackIn_18_3 = false;
            } else {
              stackIn_18_0 = this;
              stackIn_18_3 = true;
            }
            this.applySampleOffset((byte) stackIn_17_1, stackIn_17_2, stackIn_18_3);
          }
        } else {
          var7.stream = PcmSampleStream.createForSampleStep(var6, this.voiceSampleStep(true, var7), 0, this.voicePan(16384, var7));
          stackIn_17_1 = 110;
          stackIn_17_2 = var7;
          if (var11.tunings[note] >= 0) {
            stackIn_18_0 = this;
            stackIn_18_3 = false;
          } else {
            stackIn_18_0 = this;
            stackIn_18_3 = true;
          }
          this.applySampleOffset((byte) stackIn_17_1, stackIn_17_2, stackIn_18_3);
        }
        if (var11.tunings[note] < 0) {
          var7.stream.setLoopCount(-1);
        }
        if (var7.exclusiveGroup >= 0) {
          var9 = this.groupVoices[channel][var7.exclusiveGroup];
          if (var9 != null &&
            var9.releaseTime < 0) {
            this.keyVoices[channel][var9.note] = null;
            var9.releaseTime = 0;
          }
          this.groupVoices[channel][var7.exclusiveGroup] = var7;
        }
        this.noteMixer.voices.addLast((IntrusiveNode) (var7), (byte) 39);
        this.keyVoices[channel][note] = var7;
        return;
    }

    final boolean removeInactiveVoice(int guard, MusicVoice voice) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard < 30) {
            this.noteMixer = (MidiNoteMixer) null;
          }
          if (voice.stream != null) {
            return false;
          }
          if (voice.releaseTime < 0) {
            return true;
          }
          voice.unlink(false);
          if (0 < voice.exclusiveGroup &&
            voice == this.groupVoices[voice.channel][voice.exclusiveGroup]) {
            this.groupVoices[voice.channel][voice.exclusiveGroup] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("bs.V(").append(guard).append(',');
          if (voice == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void dispatchMidiEvent(int message, byte guard) {
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
        var8 = Sumoblitz.field_L ? 1 : 0;
        var3 = message & 240;
        if (var3 == 128) {
          var4 = 15 & message;
          var5 = message >> 8 & 127;
          var6 = message >> 16 & 127;
          this.noteOff(var6, var5, 12800, var4);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = 15 & message;
          var5Lifetime1 = (32657 & message) >> 8;
          var6Lifetime1 = 127 & message >> 16;
          if (var6Lifetime1 > 0) {
            this.noteOn(var6Lifetime1, (byte) -13, var4Lifetime1, var5Lifetime1);
            if (var8 == 0) {
              return;
            }
          }
          this.noteOff(64, var5Lifetime1, 12800, var4Lifetime1);
          return;
        }
        if (guard >= -52) {
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = message & 15;
          var5Lifetime2 = 127 & message >> 8;
          var6Lifetime2 = message >> 16 & 127;
          this.handlePolyphonicPressure(97, var5Lifetime2, var6Lifetime2, var4Lifetime2);
          return;
        }
        if (176 != var3) {
          if (var3 == 192) {
            var4Lifetime3 = message & 15;
            var5Lifetime3 = (message & 32711) >> 8;
            this.changeProgram(var4Lifetime3, this.banks[var4Lifetime3] + var5Lifetime3, 5174);
            return;
          }
          if (208 == var3) {
            var4Lifetime3Lifetime1 = 15 & message;
            var5Lifetime3Lifetime1 = (32605 & message) >> 8;
            this.handleChannelPressure(var4Lifetime3Lifetime1, (byte) -101, var5Lifetime3Lifetime1);
            return;
          }
          if (224 == var3) {
            var4Lifetime3Lifetime2 = 15 & message;
            var5Lifetime3Lifetime2 = ((message & 8323255) >> 9) + (message >> 8 & 127);
            this.setPitchBend(var4Lifetime3Lifetime2, -105, var5Lifetime3Lifetime2);
            return;
          }
          var3 = 255 & message;
          if (var3 != 255) {
            return;
          }
          this.resetSynthesizer(true, true);
          return;
        }
        var4Lifetime4 = 15 & message;
        var5Lifetime4 = (32654 & message) >> 8;
        var6Lifetime3 = (8345855 & message) >> 16;
        if (0 == var5Lifetime4) {
          this.banks[var4Lifetime4] = (var6Lifetime3 << 14) + LegacyOpenGlPostProcessManager.bitwiseAnd(-2080769, this.banks[var4Lifetime4]);
        }
        if (var5Lifetime4 == 32) {
          this.banks[var4Lifetime4] = (var6Lifetime3 << 7) + LegacyOpenGlPostProcessManager.bitwiseAnd(this.banks[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 1) {
          this.modulation[var4Lifetime4] = (var6Lifetime3 << 7) + LegacyOpenGlPostProcessManager.bitwiseAnd(-16257, this.modulation[var4Lifetime4]);
        }
        if (33 == var5Lifetime4) {
          this.modulation[var4Lifetime4] = LegacyOpenGlPostProcessManager.bitwiseAnd(-128, this.modulation[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 5) {
          this.portamentoTime[var4Lifetime4] = (var6Lifetime3 << 7) + LegacyOpenGlPostProcessManager.bitwiseAnd(-16257, this.portamentoTime[var4Lifetime4]);
        }
        if (37 == var5Lifetime4) {
          this.portamentoTime[var4Lifetime4] = var6Lifetime3 + LegacyOpenGlPostProcessManager.bitwiseAnd(-128, this.portamentoTime[var4Lifetime4]);
        }
        if (var5Lifetime4 == 7) {
          this.channelVolume[var4Lifetime4] = LegacyOpenGlPostProcessManager.bitwiseAnd(-16257, this.channelVolume[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (39 == var5Lifetime4) {
          this.channelVolume[var4Lifetime4] = var6Lifetime3 + LegacyOpenGlPostProcessManager.bitwiseAnd(this.channelVolume[var4Lifetime4], -128);
        }
        if (10 == var5Lifetime4) {
          this.channelPan[var4Lifetime4] = LegacyOpenGlPostProcessManager.bitwiseAnd(-16257, this.channelPan[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (42 == var5Lifetime4) {
          this.channelPan[var4Lifetime4] = var6Lifetime3 + LegacyOpenGlPostProcessManager.bitwiseAnd(-128, this.channelPan[var4Lifetime4]);
        }
        if (var5Lifetime4 == 11) {
          this.channelExpression[var4Lifetime4] = LegacyOpenGlPostProcessManager.bitwiseAnd(-16257, this.channelExpression[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 43) {
          this.channelExpression[var4Lifetime4] = var6Lifetime3 + LegacyOpenGlPostProcessManager.bitwiseAnd(-128, this.channelExpression[var4Lifetime4]);
        }
        if (var5Lifetime4 == 64) {
          if (var6Lifetime3 >= 64) {
            this.channelFlags[var4Lifetime4] = ic.a(this.channelFlags[var4Lifetime4], 1);
            if (var8 != 0) {
              this.channelFlags[var4Lifetime4] = LegacyOpenGlPostProcessManager.bitwiseAnd(this.channelFlags[var4Lifetime4], -2);
            }
          } else {
            this.channelFlags[var4Lifetime4] = LegacyOpenGlPostProcessManager.bitwiseAnd(this.channelFlags[var4Lifetime4], -2);
          }
        }
        if (var5Lifetime4 == 65) {
          if (var6Lifetime3 < 64) {
            this.releasePortamentoVoices(var4Lifetime4, (byte) 122);
            this.channelFlags[var4Lifetime4] = LegacyOpenGlPostProcessManager.bitwiseAnd(this.channelFlags[var4Lifetime4], -3);
            if (var8 != 0) {
              this.channelFlags[var4Lifetime4] = ic.a(this.channelFlags[var4Lifetime4], 2);
            }
          } else {
            this.channelFlags[var4Lifetime4] = ic.a(this.channelFlags[var4Lifetime4], 2);
          }
        }
        if (var5Lifetime4 == 99) {
          this.parameterSelection[var4Lifetime4] = (var6Lifetime3 << 7) + LegacyOpenGlPostProcessManager.bitwiseAnd(127, this.parameterSelection[var4Lifetime4]);
        }
        if (var5Lifetime4 == 98) {
          this.parameterSelection[var4Lifetime4] = LegacyOpenGlPostProcessManager.bitwiseAnd(16256, this.parameterSelection[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 101) {
          this.parameterSelection[var4Lifetime4] = 16384 + (LegacyOpenGlPostProcessManager.bitwiseAnd(127, this.parameterSelection[var4Lifetime4]) + (var6Lifetime3 << 7));
        }
        if (var5Lifetime4 == 100) {
          this.parameterSelection[var4Lifetime4] = 16384 - (-LegacyOpenGlPostProcessManager.bitwiseAnd(this.parameterSelection[var4Lifetime4], 16256) - var6Lifetime3);
        }
        if (var5Lifetime4 == 120) {
          this.allSoundOff(-1, var4Lifetime4);
        }
        if (var5Lifetime4 == 121) {
          this.resetControllers(var4Lifetime4, true);
        }
        if (var5Lifetime4 == 123) {
          this.allNotesOff(var4Lifetime4, (byte) -109);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.parameterSelection[var4Lifetime4];
          if (16384 == var7) {
            this.pitchBendSensitivity[var4Lifetime4] = LegacyOpenGlPostProcessManager.bitwiseAnd(-16257, this.pitchBendSensitivity[var4Lifetime4]) + (var6Lifetime3 << 7);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.parameterSelection[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.pitchBendSensitivity[var4Lifetime4] = var6Lifetime3 + LegacyOpenGlPostProcessManager.bitwiseAnd(this.pitchBendSensitivity[var4Lifetime4], -128);
          }
        }
        if (16 == var5Lifetime4) {
          this.sampleOffsets[var4Lifetime4] = LegacyOpenGlPostProcessManager.bitwiseAnd(this.sampleOffsets[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 48) {
          this.sampleOffsets[var4Lifetime4] = var6Lifetime3 + LegacyOpenGlPostProcessManager.bitwiseAnd(this.sampleOffsets[var4Lifetime4], -128);
        }
        if (81 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.resetRetriggerPhases(var4Lifetime4, 32605);
            this.channelFlags[var4Lifetime4] = LegacyOpenGlPostProcessManager.bitwiseAnd(this.channelFlags[var4Lifetime4], -5);
            if (var8 != 0) {
              this.channelFlags[var4Lifetime4] = ic.a(this.channelFlags[var4Lifetime4], 4);
            }
          } else {
            this.channelFlags[var4Lifetime4] = ic.a(this.channelFlags[var4Lifetime4], 4);
          }
        }
        if (var5Lifetime4 == 17) {
          this.setRetriggerRate((var6Lifetime3 << 7) + (-16257 & this.retriggerControllers[var4Lifetime4]), var4Lifetime4, 97);
        }
        if (var5Lifetime4 == 49) {
          this.setRetriggerRate(var6Lifetime3 + (-128 & this.retriggerControllers[var4Lifetime4]), var4Lifetime4, 42);
        }
        return;
    }

    private final void changeProgram(int channel, int program, int guard) {
        int var4 = 0;
        int var5 = 0;
        boolean decompiledFrameCompleted0 = true;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (~this.programs[channel] != ~program) {
          this.programs[channel] = program;
          var4 = 0;
          while (var4 < 128) {
            this.groupVoices[channel][var4] = null;
            var4++;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if ((decompiledFrameCompleted0) &&
          (guard != 5174)) {
          this.channelVolumeScales = (int[]) null;
        }

    }

    private final void handleChannelPressure(int param0, byte param1, int param2) {
        if (param1 >= -26) {
          this.masterVolume = -65;
        }
    }

    private final void initializeChannelProgram(int param0, int param1, int param2) {
        this.initialPrograms[param1] = param2;
        this.banks[param1] = LegacyOpenGlPostProcessManager.bitwiseAnd(-128, param2);
        if (param0 != -1823) {
          return;
        }
        this.changeProgram(param1, param2, param0 ^ -4905);
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.midiReader.isReady()) {
            var4_int = this.timeScale * this.midiReader.division / AudioOutput.sampleRate;
            while (true) {
              var5 = (long)var4_int * (long)param2 + this.currentTime;
              if (0L <= -var5 + this.nextEventTime) {
                this.currentTime = var5;
                if (var8 == 0) {
                  break;
                }
              }
              var7 = (int)((this.nextEventTime + (-this.currentTime + (long)var4_int - 1L)) / (long)var4_int);
              this.currentTime = this.currentTime + (long)var7 * (long)var4_int;
              this.noteMixer.mixInto(param0, param1, var7);
              param2 = param2 - var7;
              this.advanceMidiEvents(18922);
              param1 = param1 + var7;
              if (!this.midiReader.isReady() &&
                var8 == 0) {
                break;
              }
              if (var8 == 0) {
                continue;
              }
              this.noteMixer.mixInto(param0, param1, param2);
              return;
            }
          }
          this.noteMixer.mixInto(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("bs.J(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void resetRetriggerPhases(int param0, int param1) {
        MusicVoice var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param1 != 32605) {
          this.portamentoTime = (int[]) null;
        }
        if ((this.channelFlags[param0] & 4) != 0) {
          var3 = (MusicVoice) (this.noteMixer.voices.first(param1 - 32539));
          while (var3 != null) {
            if (var4 != 0) {
              break;
            }
            if (~param0 == ~var3.channel) {
              var3.retriggerPhase = 0;
            }
            var3 = (MusicVoice) (this.noteMixer.voices.next((byte) 18));
          }
        }
    }

    private final void allSoundOff(int guard, int channel) {
        MusicVoice var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (guard != -1) {
          this.midiReader = (MidiFileReader) null;
        }
        var3 = (MusicVoice) (this.noteMixer.voices.first(guard ^ -95));
        while (var3 != null) {
          if (var4 == 0) {
            if (channel < 0 ||
              ~var3.channel == ~channel) {
              if (null != var3.stream) {
                var3.stream.fadeOutAndUnlink(AudioOutput.sampleRate / 100);
                if (var3.stream.isRamping()) {
                  this.noteMixer.fadingStreams.addSubstream(var3.stream);
                }
                var3.clearReferences(~guard);
              }
              if (var3.releaseTime < 0) {
                this.keyVoices[var3.channel][var3.note] = null;
              }
              var3.unlink(false);
            }
            var3 = (MusicVoice) (this.noteMixer.voices.next((byte) 18));
            continue;
          }
          break;
        }
    }

    private final void handlePolyphonicPressure(int param0, int param1, int param2, int param3) {
        if (param0 <= 7) {
          this.banks = (int[]) null;
        }
    }

    final synchronized void queueTrackAtGrid(boolean param0, int param1, int param2, int param3, MusicTrack param4, boolean param5) {
        int var7_int = 0;
        int var8 = 0;
        if (!this.midiReader.isReady()) {
          this.playTrack(param5, param4, 77);
          return;
        }
        try {
          this.looping = param5 ? true : false;
          this.stopVoicesOnSwitch = param0 ? true : false;
          this.pendingTrack = param4;
          var7_int = this.midiReader.ticksAtTimeCeiling(this.currentTime) * param3;
          if (param2 != 7094) {
            this.allNotesOff(-41, (byte) 86);
          }
          var8 = param1 * this.midiReader.division;
          var7_int = var8 * ((-1 + var8 + var7_int) / var8);
          this.switchTick = ((param3 >> 1) + var7_int) / param3;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "bs.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final synchronized void stop(int param0) {
        if (param0 != 0) {
          this.releasePortamentoVoices(-55, (byte) 105);
        }
        this.clearPlayback(true, (byte) 104);
    }

    final synchronized void clearPatchSampleIds(byte param0) {
        int var3 = 0;
        MusicPatch var4 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var4 = (MusicPatch) (this.patches.a(79));
        while (var4 != null) {
          var4.clearSampleIds((byte) -36);
          var4 = (MusicPatch) (this.patches.a(true));
          if (var3 != 0) {
            return;
          }
        }
        if (param0 != 28) {
          this.channelVolumeScales = (int[]) null;
        }
        return;
    }

    final synchronized void setTimeScale(int timeScale, int guard) {
        int discarded$0 = 0;
        if (guard != 0) {
          discarded$0 = this.voiceSampleStep(true, (MusicVoice) null);
        }
        this.timeScale = timeScale;
    }

    private final void setRetriggerRate(int value, int channel, int guard) {
        this.retriggerControllers[channel] = value;
        if (guard <= 9) {
          this.handleChannelPressure(-89, (byte) -88, -127);
        }
        this.retriggerRates[channel] = (int)(0.5 + Math.pow(2.0, (double)value * 0.00054931640625) * 2097152.0);
    }

    final synchronized void setInitialProgram(int param0, int param1, int param2) {
        this.initializeChannelProgram(param0 ^ -1968, param2, param1);
        if (param0 != 177) {
          this.portamentoTime = (int[]) null;
        }
    }

    private final synchronized void clearPlayback(boolean param0, byte param1) {
        this.midiReader.clear();
        this.pendingTrack = null;
        if (param1 < 0) {
          this.nextEventTime = 79L;
        }
        this.resetSynthesizer(param0, true);
    }

    private final void allNotesOff(int channel, byte guard) {
        MusicVoice var3;
        int var4;
        int stackIn_11_0 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var3 = (MusicVoice) (this.noteMixer.voices.first(-96));
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
          stackIn_11_0 = channel;
          if (var4 == 0) {
            if ((stackIn_11_0 < 0 ||
              ~var3.channel == ~channel) &&
              var3.releaseTime < 0) {
              this.keyVoices[var3.channel][var3.note] = null;
              var3.releaseTime = 0;
            }
            var3 = (MusicVoice) (this.noteMixer.voices.next((byte) 18));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_11_0 = guard;
        }
        if (stackIn_11_0 >= -15) {
          this.allSoundOff(126, 58);
        }
        return;
    }

    final synchronized void setChannelVolumeScale(byte guard, int channel, int scale) {
        int var4 = 0;
        int var5 = 0;
        boolean decompiledFrameCompleted0 = true;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (channel < 0) {
          var4 = 0;
          while (16 > var4) {
            this.channelVolumeScales[var4] = scale;
            var4++;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
          if ((decompiledFrameCompleted0) &&
            (var5 != 0)) {
            this.channelVolumeScales[channel] = scale;
          }
        } else {
          this.channelVolumeScales[channel] = scale;
        }
        if (guard >= -42) {
          this.nextSubstream();
        }
    }

    private final synchronized void startTrack(boolean param0, boolean param1, boolean param2, MusicTrack param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          this.clearPlayback(param2, (byte) 69);
          this.midiReader.parse(param3.midiBytes);
          this.currentTime = 0L;
          stackIn_4_1 = (param0);
          this.looping = stackIn_4_1;
          var5_int = this.midiReader.trackCount();
          var6 = 0;
          if (!param1) {
            this.programs = (int[]) null;
          }
          while (var5_int > var6) {
            this.midiReader.seekTrack(var6);
            this.midiReader.readTrackDelta(var6);
            this.midiReader.saveTrackPosition(var6);
            var6++;
            if (var7 != 0) {
              return;
            }
          }
          this.nextTrack = this.midiReader.nextTrack();
          this.nextEventTick = this.midiReader.trackTicks[this.nextTrack];
          this.nextEventTime = this.midiReader.timeAtTick(this.nextEventTick);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("bs.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_o = null;
        if (param0 >= -38) {
          MidiPcmStream.releaseStatics(-53);
        }
    }

    final synchronized void skip(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted0 = true;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (this.midiReader.isReady()) {
          var2 = this.timeScale * this.midiReader.division / AudioOutput.sampleRate;
          while (true) {
            var3 = this.currentTime + (long)param0 * (long)var2;
            if (-var3 + this.nextEventTime >= 0L) {
              this.currentTime = var3;
              if (var6 == 0) {
                break;
              }
            }
            var5 = (int)((this.nextEventTime - this.currentTime + ((long)var2 - 1L)) / (long)var2);
            this.currentTime = this.currentTime + (long)var5 * (long)var2;
            param0 = param0 - var5;
            this.noteMixer.skip(var5);
            this.advanceMidiEvents(18922);
            if (!this.midiReader.isReady() &&
              var6 == 0) {
              break;
            }
            if (var6 == 0) {
              continue;
            }
            this.noteMixer.skip(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if (decompiledFrameCompleted0) {
          this.noteMixer.skip(param0);
        }

    }

    public MidiPcmStream() {
        this.sampleOffsets = new int[16];
        this.channelExpression = new int[16];
        this.programs = new int[16];
        this.banks = new int[16];
        this.initialPrograms = new int[16];
        this.channelVolumeScales = new int[16];
        this.groupVoices = new MusicVoice[16][128];
        this.masterVolume = 256;
        this.channelVolume = new int[16];
        this.timeScale = 1000000;
        this.pitchBend = new int[16];
        this.retriggerControllers = new int[16];
        this.keyVoices = new MusicVoice[16][128];
        this.parameterSelection = new int[16];
        this.retriggerRates = new int[16];
        this.channelPan = new int[16];
        this.modulation = new int[16];
        this.pitchBendSensitivity = new int[16];
        this.channelFlags = new int[16];
        this.portamentoTime = new int[16];
        this.midiReader = new MidiFileReader();
        this.noteMixer = new MidiNoteMixer(this);
        this.patches = new IntrusiveNodeHashTable(128);
        this.setChannelVolumeScale((byte) -127, -1, 256);
        this.resetSynthesizer(true, true);
    }

    static {
        field_o = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
