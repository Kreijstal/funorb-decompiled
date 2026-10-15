/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiSynthesizer extends AudioStream {
    private int[] channelRetriggerValue;
    int[] channelSampleOffset;
    private int[] channelParameter;
    int[] channelFlags;
    private int[] channelPitchBend;
    static String field_o;
    int[] field_U;
    private int masterGain;
    private MusicVoice[][] voicesByGroup;
    private int[] channelPan;
    static NodeDeque pendingBytePayloadSubmissions;
    private int[] channelGain;
    private int[] channelExpression;
    private MidiFileReader midiReader;
    private int[] channelModulation;
    private IntrusiveHashTable patches;
    private int[] channelBank;
    private int[] channelPitchBendRange;
    private MusicVoice[][] voicesByNote;
    static String field_u;
    private int[] channelPortamentoTime;
    private int tempoScale;
    private int[] initialPrograms;
    private int[] channelProgram;
    static String field_q;
    private int[] channelVolume;
    private long field_B;
    private int field_x;
    private long field_F;
    private int field_O;
    private boolean field_N;
    private MusicVoiceMixer voiceMixer;
    private boolean field_L;
    private MusicTrack field_I;
    private int field_M;

    private final int b(int param0, MusicVoice param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            field_u = (String) null;
          }
          var3_int = this.channelPan[param1.channel];
          if (var3_int < 8192) {
            stackIn_6_0 = 32 + param1.notePan * var3_int >> 6;
            return stackIn_6_0;
          }
          stackIn_4_0 = 16384 - ((-param1.notePan + 128) * (-var3_int + 16384) + 32 >> 6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ie.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean a(int param0, int[] param1, int param2, MusicVoice param3, int param4) {
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        MusicEnvelope var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          param3.updateFrames = PcmPlayer.sampleRate / 100;
          if (0 <= param3.releaseProgress && (null == param3.pcmStream ||
            param3.pcmStream.isOutOfRange())) {
            param3.releaseResources(param0 ^ -23346);
            param3.unlink((byte) 111);
            if (param3.exclusiveGroup > 0) {
              if (this.voicesByGroup[param3.channel][param3.exclusiveGroup] != param3) {
                return true;
              }
              this.voicesByGroup[param3.channel][param3.exclusiveGroup] = null;
            }
            return true;
          }
          var6_int = param3.portamentoScale;
          if (param0 != 23300) {
            return false;
          }
          if (var6_int > 0) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.channelPortamentoTime[param3.channel]));
            if (0 > var6_int) {
              var6_int = 0;
            }
            param3.portamentoScale = var6_int;
          }
          param3.pcmStream.setSpeed(this.a(-11, param3));
          var7 = param3.envelope;
          param3.ageTicks = param3.ageTicks + 1;
          var8 = 0;
          param3.vibratoPhase = param3.vibratoPhase + var7.vibratoRate;
          var9 = 0.000005086263020833333 * (double)((param3.note - 60 << 8) + (param3.portamentoScale * param3.portamentoDelta >> 12));
          if (var7.decayRate > 0) {
            if (var7.field_k <= 0) {
              param3.decayProgress = param3.decayProgress + 128;
            } else {
              param3.decayProgress = param3.decayProgress + (int)(Math.pow(2.0, (double)var7.field_k * var9) * 128.0 + 0.5);
            }
            if (param3.decayProgress * var7.decayRate >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.volumeEnvelope) {
            if (var7.field_h > 0) {
              param3.volumeEnvelopeProgress = param3.volumeEnvelopeProgress + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_h) * 128.0);
            } else {
              param3.volumeEnvelopeProgress = param3.volumeEnvelopeProgress + 128;
            }
            while (param3.volumeEnvelopeIndex < -2 + var7.volumeEnvelope.length) {
              if (param3.volumeEnvelopeProgress > (255 & var7.volumeEnvelope[param3.volumeEnvelopeIndex + 2]) << 8) {
                param3.volumeEnvelopeIndex = param3.volumeEnvelopeIndex + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.volumeEnvelope.length == param3.volumeEnvelopeIndex &&
              var7.volumeEnvelope[param3.volumeEnvelopeIndex + 1] == 0) {
              var8 = 1;
            }
          }
          if (param3.releaseProgress >= 0 &&
            var7.releaseEnvelope != null &&
            0 == (1 & this.channelFlags[param3.channel]) && (!(param3.exclusiveGroup >= 0) ||
            param3 != this.voicesByGroup[param3.channel][param3.exclusiveGroup])) {
            if (var7.field_b <= 0) {
              param3.releaseProgress = param3.releaseProgress + 128;
            } else {
              param3.releaseProgress = param3.releaseProgress + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_b) + 0.5);
            }
            while (var7.releaseEnvelope.length - 2 > param3.releaseEnvelopeIndex) {
              if (param3.releaseProgress > (var7.releaseEnvelope[2 + param3.releaseEnvelopeIndex] << 8 & 65280)) {
                param3.releaseEnvelopeIndex = param3.releaseEnvelopeIndex + 2;
                continue;
              }
              break;
            }
            if (param3.releaseEnvelopeIndex == -2 + var7.releaseEnvelope.length) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param3.pcmStream.rampGainAndPan(param3.updateFrames, this.b(param3, param0 - 29023), this.b(2, param3));
            return false;
          }
          param3.pcmStream.fadeOut(param3.updateFrames);
          if (param1 != null) {
            param3.pcmStream.fill(param1, param4, param2);
          } else {
            param3.pcmStream.skip(param2);
          }
          if (param3.pcmStream.isRamping()) {
            this.voiceMixer.fadingStreams.addStream(param3.pcmStream);
          }
          param3.releaseResources(-94);
          if (param3.releaseProgress >= 0) {
            param3.unlink((byte) 111);
            if (param3.exclusiveGroup > 0 &&
              param3 == this.voicesByGroup[param3.channel][param3.exclusiveGroup]) {
              this.voicesByGroup[param3.channel][param3.exclusiveGroup] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_70_0 = var6;
          stackIn_70_1 = new StringBuilder().append("ie.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void c(int param0, int param1) {
        MusicVoice var3 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if ((4 & this.channelFlags[param0]) != 0) {
          var3 = (MusicVoice) (this.voiceMixer.voices.first(-117));
          while (var3 != null) {
            if (var3.channel == param0) {
              var3.field_j = 0;
            }
            var3 = (MusicVoice) (this.voiceMixer.voices.next((byte) 116));
          }
        }
        if (param1 != 0) {
          this.field_L = false;
        }
    }

    private final void f(int param0, int param1, int param2) {
        if (param2 != 2) {
          MusicVoice var5 = (MusicVoice) null;
          this.discardInactiveVoice((MusicVoice) null, 102);
        }
        this.channelPitchBend[param0] = param1;
    }

    final synchronized AudioStream nextSubStream() {
        return null;
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        fa var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 != -46) {
            return;
          }
          var4 = (fa) (SoundCache.field_f.first(-33));
          while (var4 != null) {
            SaveResultsPromptScreen.a(var4, param0, 49);
            var4 = (fa) (SoundCache.field_f.next((byte) 116));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "ie.EA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void setMasterGain(int gain, boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return;
        }
        this.masterGain = gain;
    }

    private final void a(int param0, int param1) {
        MusicVoice var3 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if ((this.channelFlags[param1] & 2) != 0) {
          var3 = (MusicVoice) (this.voiceMixer.voices.first(-70));
          while (var3 != null) {
            if (param1 == var3.channel &&
              this.voicesByNote[param1][var3.note] == null &&
              var3.releaseProgress < 0) {
              var3.releaseProgress = 0;
            }
            var3 = (MusicVoice) (this.voiceMixer.voices.next((byte) 116));
          }
        }
        if (param0 != 0) {
          pendingBytePayloadSubmissions = (NodeDeque) null;
        }
    }

    private final void d(int param0, int param1, int param2) {
        this.initialPrograms[param1] = param0;
        this.channelBank[param1] = IntrusiveHashIterator.a(param2, param0);
        this.a(param2 ^ 203445448, param0, param1);
    }

    final synchronized void a(byte param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        int var2 = -47 / ((param0 + 49) / 33);
        MusicPatch var3 = (MusicPatch) (this.patches.first(-15519));
        while (var3 != null) {
          var3.c((byte) 81);
          var3 = (MusicPatch) (this.patches.next(true));
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        if (param2 != 23) {
          this.channelRetriggerValue = (int[]) null;
        }
    }

    private final void g(int param0, int param1, int param2) {
        this.channelRetriggerValue[param2] = param0;
        this.field_U[param2] = (int)(Math.pow(2.0, 0.00054931640625 * (double)param0) * 2097152.0 + 0.5);
        if (param1 != 1010) {
          field_o = (String) null;
        }
    }

    final synchronized int getSchedulingCost() {
        return 0;
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          try {
            if (!PlatformServices.osNameLowercase.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = 0;
            while (var3 < param0.length()) {
              if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                var3++;
                continue;
              }
              return false;
            }
            if (param1) {
              var5 = (String) null;
              MidiSynthesizer.a((String) null, true);
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var2_ref2;
          stackIn_23_1 = new StringBuilder().append("ie.G(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void e(int param0) {
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = BrickABrac.field_J ? 1 : 0;
        var2 = this.field_x;
        var3 = this.field_O;
        var4 = this.field_B;
        if (null != this.field_I &&
          this.field_M == var3) {
          this.a(this.field_L, true, this.field_N, this.field_I);
          this.e(-2);
          return;
        }
        while (true) {
          if (var3 != this.field_O) {
            this.field_x = var2;
            this.field_O = var3;
            if (param0 != -2) {
              field_o = (String) null;
            }
            this.field_B = var4;
            if (null != this.field_I &&
              this.field_M < var3) {
              this.field_x = -1;
              this.field_O = this.field_M;
              this.field_B = this.midiReader.getTickTime(this.field_O);
            }
            return;
          }
          while (var3 == this.midiReader.trackTicks[var2]) {
            this.midiReader.seekTrack(var2);
            var6 = this.midiReader.readMessage(var2);
            if (var6 != 1) {
              if ((var6 & 128) != 0) {
                this.handleMidiMessage(-123, var6);
              }
              this.midiReader.readTrackDelta(var2);
              this.midiReader.saveTrackPosition(var2);
              continue;
            }
            this.midiReader.markTrackEnded();
            this.midiReader.saveTrackPosition(var2);
            if (this.midiReader.isDone()) {
              if (this.field_I != null) {
                this.playTrack(this.field_I, 126, this.field_N);
                this.e(param0 ^ 0);
                return;
              }
              if (this.field_N &&
                var3 != 0) {
                this.midiReader.reset(var4);
              } else {
                this.reset(-108, true);
                this.midiReader.clear();
                return;
              }
            }
            break;
          }
          var2 = this.midiReader.nextTrack();
          var3 = this.midiReader.trackTicks[var2];
          var4 = this.midiReader.getTickTime(var3);
        }
    }

    private final void noteOn(int channel, boolean obfuscationGuard, int note, int velocity) {
        boolean stackIn_20_1 = false;
        MusicVoice stackIn_20_2 = null;
        Object stackIn_21_0;
        boolean stackIn_21_3;
        MusicVoice var5;
        int var6_int;
        PcmSound var6;
        MusicVoice var7;
        MusicVoice var8;
        int var9;
        MusicPatch var10;
        MusicPatch var11;
        var9 = BrickABrac.field_J ? 1 : 0;
        this.noteOff(115, note, channel, 64);
        if ((this.channelFlags[channel] & 2) != 0) {
          var5 = (MusicVoice) (this.voiceMixer.voices.last(0));
          while (var5 != null) {
            if (var5.channel == channel &&
              var5.releaseProgress < 0) {
              this.voicesByNote[channel][var5.note] = null;
              this.voicesByNote[channel][note] = var5;
              var6_int = (var5.portamentoScale * var5.portamentoDelta >> 12) + var5.basePitch256;
              var5.basePitch256 = var5.basePitch256 + (-var5.note + note << 8);
              var5.portamentoDelta = -var5.basePitch256 + var6_int;
              var5.portamentoScale = 4096;
              var5.note = note;
              return;
            }
            var5 = (MusicVoice) (this.voiceMixer.voices.previous(-111));
          }
        }
        var10 = (MusicPatch) (this.patches.get(-81, (long)this.channelProgram[channel]));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.samples[note];
        if (var6 == null) {
          return;
        }
        var7 = new MusicVoice();
        var7.channel = channel;
        var7.sample = var6;
        var7.patch = var10;
        var7.envelope = var10.envelopes[note];
        var7.exclusiveGroup = var10.exclusiveGroups[note];
        var7.note = note;
        var7.velocityGain = velocity * velocity * (var10.gain * var10.volume[note]) + 1024 >> 11;
        var7.notePan = 255 & var10.pan[note];
        var7.basePitch256 = -(32767 & var10.pitchOffsets[note]) + (note << 8);
        var7.releaseEnvelopeIndex = 0;
        var7.decayProgress = 0;
        if (!obfuscationGuard) {
          this.voicesByNote = (MusicVoice[][]) null;
        }
        var7.volumeEnvelopeProgress = 0;
        var7.volumeEnvelopeIndex = 0;
        var7.releaseProgress = -1;
        if (this.channelSampleOffset[channel] != 0) {
          var7.pcmStream = PcmStream.createWithGain(var6, this.a(-11, var7), 0, this.b(2, var7));
          stackIn_20_1 = false;
          stackIn_20_2 = var7;
          if (var11.pitchOffsets[note] >= 0) {
            stackIn_21_0 = this;
            stackIn_21_3 = false;
          } else {
            stackIn_21_0 = this;
            stackIn_21_3 = true;
          }
          this.a(stackIn_20_1, stackIn_20_2, stackIn_21_3);
        } else {
          var7.pcmStream = PcmStream.createWithGain(var6, this.a(-11, var7), this.b(var7, -5723), this.b(2, var7));
        }
        if (var11.pitchOffsets[note] < 0) {
          var7.pcmStream.setLoopCount(-1);
        }
        if (var7.exclusiveGroup >= 0) {
          var8 = this.voicesByGroup[channel][var7.exclusiveGroup];
          if (var8 != null &&
            var8.releaseProgress < 0) {
            this.voicesByNote[channel][var8.note] = null;
            var8.releaseProgress = 0;
          }
          this.voicesByGroup[channel][var7.exclusiveGroup] = var7;
        }
        this.voiceMixer.voices.addLast(var7, (byte) 3);
        this.voicesByNote[channel][note] = var7;
        return;
    }

    final synchronized void playTrack(MusicTrack track, int obfuscationGuard, boolean loop) {
        try {
          int var4_int = -17 / ((obfuscationGuard - 74) / 51);
          this.a(true, true, loop, track);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ie.GA(" + (track != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + loop + ')');
        }
    }

    private final void resetControllers(int channel, int obfuscationGuard) {
        int var4;
        int var3;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (channel < 0) {
          for (channel = 0; channel < 16; channel++) {
            this.resetControllers(channel, -100);
          }
          return;
        }
        this.channelVolume[channel] = 12800;
        this.channelPan[channel] = 8192;
        this.channelExpression[channel] = 16383;
        this.channelPitchBend[channel] = 8192;
        this.channelModulation[channel] = 0;
        this.channelPortamentoTime[channel] = 8192;
        this.a(0, channel);
        this.c(channel, 0);
        this.channelFlags[channel] = 0;
        var3 = 30 % ((obfuscationGuard - 7) / 59);
        this.channelParameter[channel] = 32767;
        this.channelPitchBendRange[channel] = 256;
        this.channelSampleOffset[channel] = 0;
        this.g(8192, 1010, channel);
        return;
    }

    final synchronized void setTempoScale(int scale, int obfuscationGuard) {
        this.tempoScale = scale;
        if (obfuscationGuard != -606970073) {
          this.setTempoScale(-19, -107);
        }
    }

    private final void allSoundOff(byte obfuscationGuard, int channel) {
        MusicVoice var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != -86) {
          return;
        }
        var3 = (MusicVoice) (this.voiceMixer.voices.first(-28));
        while (var3 != null) {
          if (channel < 0 ||
            var3.channel == channel) {
            if (null != var3.pcmStream) {
              var3.pcmStream.fadeOut(PcmPlayer.sampleRate / 100);
              if (var3.pcmStream.isRamping()) {
                this.voiceMixer.fadingStreams.addStream(var3.pcmStream);
              }
              var3.releaseResources(-95);
            }
            if (var3.releaseProgress < 0) {
              this.voicesByNote[var3.channel][var3.note] = null;
            }
            var3.unlink((byte) 111);
          }
          var3 = (MusicVoice) (this.voiceMixer.voices.next((byte) 116));
        }
    }

    final synchronized AudioStream firstSubStream() {
        return (AudioStream) ((Object) this.voiceMixer);
    }

    private final void c(int param0, int param1, int param2) {
        if (param0 != -1427) {
          MusicVoice var5 = (MusicVoice) null;
          this.a(-16, (int[]) null, -83, (MusicVoice) null, 92);
        }
    }

    final boolean discardInactiveVoice(MusicVoice voice, int obfuscationGuard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != voice.pcmStream) {
            var3_int = -48 / ((-62 - obfuscationGuard) / 50);
            return false;
          }
          if (voice.releaseProgress >= 0) {
            voice.unlink((byte) 111);
            if (voice.exclusiveGroup > 0 &&
              voice == this.voicesByGroup[voice.channel][voice.exclusiveGroup]) {
              this.voicesByGroup[voice.channel][voice.exclusiveGroup] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ie.QA(");
          if (voice == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 != -203445432) {
          MusicVoice var6 = (MusicVoice) null;
          this.a(-40, (int[]) null, 15, (MusicVoice) null, -126);
        }
        if (param1 != this.channelProgram[param2]) {
          this.channelProgram[param2] = param1;
          for (var4 = 0; var4 < 128; var4++) {
            this.voicesByGroup[param2][var4] = null;
          }
        }
    }

    final void a(boolean param0, MusicVoice param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param1.sample.samples.length;
          if (param2 &&
            param1.sample.pingPong) {
            var6 = var4_int - (-var4_int + param1.sample.loopStart);
            var5 = (int)((long)this.channelSampleOffset[param1.channel] * (long)var6 >> 6);
            var4_int = var4_int << 8;
            if (var4_int <= var5) {
              param1.pcmStream.setReverse(true);
              var5 = var4_int + var4_int + (-1 - var5);
            }
          } else {
            var5 = (int)((long)var4_int * (long)this.channelSampleOffset[param1.channel] >> 6);
          }
          param1.pcmStream.setPosition(var5);
          if (param0) {
            this.channelPitchBend = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ie.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        if (param1 != 8192) {
          return;
        }
        this.midiReader.clear();
        this.field_I = null;
        this.reset(param1 ^ -8246, param0);
    }

    final synchronized boolean prepareTrack(int obfuscationGuard, MusicTrack track, int sampleBudget, ResourceArchive patchArchive, SoundCache soundCache) {
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
        int var11 = 0;
        MusicPatch var12 = null;
        MusicPatch var13 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          track.buildInstrumentUsage();
          var6_int = 1;
          var7 = null;
          if (sampleBudget > 0) {
            var7 = new int[]{sampleBudget};
          }
          if (obfuscationGuard > -110) {
            this.f(115, 34, -56);
          }
          var8 = (ByteArrayNode) (track.instrumentUsage.first(-15519));
          while (var8 != null) {
            boolean decompiledFrameRemainder0 = true;
            var9 = (int)var8.key;
            var12 = (MusicPatch) (this.patches.get(-70, (long)var9));
            if (var12 == null) {
              var13 = ContentTransitionPhase.a(patchArchive, var9, 8);
              if (var13 == null) {
                var6_int = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.patches.put(34, var13, (long)var9);
                decompiledFrameRemainder0 = !(var13.loadSamples(var8.bytes, (byte) -73, soundCache, (int[]) (var7)));
              }
            } else {
              decompiledFrameRemainder0 = !(var12.loadSamples(var8.bytes, (byte) -73, soundCache, (int[]) (var7)));
            }
            if (decompiledFrameRemainder0) {
              var6_int = 0;
            }
            var8 = (ByteArrayNode) (track.instrumentUsage.next(true));
          }
          if (var6_int != 0) {
            track.releaseInstrumentUsage();
          }
          stackIn_20_0 = var6_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ie.L(").append(obfuscationGuard).append(',');
          if (track == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(sampleBudget).append(',');
          if (patchArchive == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (soundCache == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final synchronized boolean hasMidiData(int obfuscationGuard) {
        if (obfuscationGuard != -1) {
          this.noteOn(-73, true, 50, 118);
        }
        return this.midiReader.hasData();
    }

    private final void reset(int obfuscationGuard, boolean stopImmediately) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (!stopImmediately) {
          this.allNotesOff(-1, 0);
        } else {
          this.allSoundOff((byte) -86, -1);
        }
        this.resetControllers(-1, 66);
        int var3 = 106 / ((-2 - obfuscationGuard) / 36);
        for (var4 = 0; var4 < 16; var4++) {
          this.channelProgram[var4] = this.initialPrograms[var4];
        }
        int var6 = 0;
        var3 = var6;
        while (16 > var6) {
          this.channelBank[var6] = IntrusiveHashIterator.a(-128, this.initialPrograms[var6]);
          var6++;
        }
    }

    private final void allNotesOff(int channel, int obfuscationGuard) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != 0) {
          this.channelParameter = (int[]) null;
        }
        MusicVoice var3 = (MusicVoice) (this.voiceMixer.voices.first(-36));
        while (var3 != null) {
          if ((0 > channel || channel == var3.channel) &&
            !(var3.releaseProgress >= 0)) {
            this.voicesByNote[var3.channel][var3.note] = null;
            var3.releaseProgress = 0;
          }
          var3 = (MusicVoice) (this.voiceMixer.voices.next((byte) 116));
        }
    }

    private final int b(MusicVoice param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        MusicEnvelope var9 = null;
        MusicEnvelope var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.channelGain[param0.channel] == 0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var9 = param0.envelope;
          var10 = var9;
          var4 = 4096 + this.channelExpression[param0.channel] * this.channelVolume[param0.channel] >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + param0.velocityGain * var4 >> 15;
          var4 = this.masterGain * var4 + 128 >> 8;
          var4 = 128 + this.channelGain[param0.channel] * var4 >> 8;
          if (var10.decayRate > 0) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)var10.decayRate * ((double)param0.decayProgress * 0.00001953125)) * (double)var4);
          }
          if (param1 != -5723) {
            stackIn_8_0 = -126;
            return stackIn_8_0;
          }
          if (null != var10.volumeEnvelope) {
            var5 = param0.volumeEnvelopeProgress;
            var6 = var10.volumeEnvelope[param0.volumeEnvelopeIndex + 1];
            if (param0.volumeEnvelopeIndex < -2 + var10.volumeEnvelope.length) {
              var7 = var9.volumeEnvelope[param0.volumeEnvelopeIndex] << 8 & 65280;
              var8 = var10.volumeEnvelope[param0.volumeEnvelopeIndex + 2] << 8 & 65280;
              var6 = var6 + (-var7 + var5) * (-var6 + var10.volumeEnvelope[param0.volumeEnvelopeIndex + 3]) / (-var7 + var8);
            }
            var4 = 32 + var4 * var6 >> 6;
          }
          if (param0.releaseProgress > 0 &&
            var10.releaseEnvelope != null) {
            var5Lifetime1 = param0.releaseProgress;
            var6Lifetime1 = var10.releaseEnvelope[1 + param0.releaseEnvelopeIndex];
            if (param0.releaseEnvelopeIndex < var10.releaseEnvelope.length - 2) {
              var7Lifetime1 = (255 & var9.releaseEnvelope[param0.releaseEnvelopeIndex]) << 8;
              var8Lifetime1 = (255 & var10.releaseEnvelope[2 + param0.releaseEnvelopeIndex]) << 8;
              var6Lifetime1 = var6Lifetime1 + (var5Lifetime1 - var7Lifetime1) * (-var6Lifetime1 + var10.releaseEnvelope[param0.releaseEnvelopeIndex + 3]) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = var4 * var6Lifetime1 + 32 >> 6;
          }
          stackIn_22_0 = var4;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("ie.CA(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void handleMidiMessage(int obfuscationGuard, int message) {
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
        var8 = BrickABrac.field_J ? 1 : 0;
        var3 = message & 240;
        if (var3 == 128) {
          var4 = message & 15;
          var5 = (32620 & message) >> 8;
          var6 = message >> 16 & 127;
          this.noteOff(-67, var5, var4, var6);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = 15 & message;
          var5Lifetime1 = (32595 & message) >> 8;
          var6Lifetime1 = 127 & message >> 16;
          if (var6Lifetime1 > 0) {
            this.noteOn(var4Lifetime1, true, var5Lifetime1, var6Lifetime1);
          } else {
            this.noteOff(-43, var5Lifetime1, var4Lifetime1, 64);
          }
          return;
        }
        if (obfuscationGuard > -119) {
          this.tempoScale = -25;
        }
        if (160 == var3) {
          var4Lifetime2 = message & 15;
          var5Lifetime2 = 127 & message >> 8;
          var6Lifetime2 = message >> 16 & 127;
          this.a(var5Lifetime2, var4Lifetime2, (byte) 23, var6Lifetime2);
          return;
        }
        if (176 != var3) {
          if (var3 == 192) {
            var4Lifetime3 = message & 15;
            var5Lifetime3 = (message & 32532) >> 8;
            this.a(-203445432, var5Lifetime3 + this.channelBank[var4Lifetime3], var4Lifetime3);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = message & 15;
            var5Lifetime3Lifetime1 = message >> 8 & 127;
            this.c(-1427, var5Lifetime3Lifetime1, var4Lifetime3Lifetime1);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = 15 & message;
            var5Lifetime3Lifetime2 = (message >> 9 & 16256) + (127 & message >> 8);
            this.f(var4Lifetime3Lifetime2, var5Lifetime3Lifetime2, 2);
            return;
          }
          var3 = 255 & message;
          if (var3 != 255) {
            return;
          }
          this.reset(-39, true);
          return;
        }
        var4Lifetime4 = 15 & message;
        var5Lifetime4 = (32710 & message) >> 8;
        var6Lifetime3 = (message & 8377946) >> 16;
        if (var5Lifetime4 == 0) {
          this.channelBank[var4Lifetime4] = IntrusiveHashIterator.a(-2080769, this.channelBank[var4Lifetime4]) + (var6Lifetime3 << 14);
        }
        if (var5Lifetime4 == 32) {
          this.channelBank[var4Lifetime4] = IntrusiveHashIterator.a(this.channelBank[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 1) {
          this.channelModulation[var4Lifetime4] = (var6Lifetime3 << 7) + IntrusiveHashIterator.a(-16257, this.channelModulation[var4Lifetime4]);
        }
        if (33 == var5Lifetime4) {
          this.channelModulation[var4Lifetime4] = IntrusiveHashIterator.a(-128, this.channelModulation[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 5) {
          this.channelPortamentoTime[var4Lifetime4] = IntrusiveHashIterator.a(this.channelPortamentoTime[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 37) {
          this.channelPortamentoTime[var4Lifetime4] = var6Lifetime3 + IntrusiveHashIterator.a(this.channelPortamentoTime[var4Lifetime4], -128);
        }
        if (7 == var5Lifetime4) {
          this.channelVolume[var4Lifetime4] = (var6Lifetime3 << 7) + IntrusiveHashIterator.a(-16257, this.channelVolume[var4Lifetime4]);
        }
        if (39 == var5Lifetime4) {
          this.channelVolume[var4Lifetime4] = var6Lifetime3 + IntrusiveHashIterator.a(this.channelVolume[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 10) {
          this.channelPan[var4Lifetime4] = IntrusiveHashIterator.a(this.channelPan[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 42) {
          this.channelPan[var4Lifetime4] = IntrusiveHashIterator.a(this.channelPan[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 11) {
          this.channelExpression[var4Lifetime4] = (var6Lifetime3 << 7) + IntrusiveHashIterator.a(this.channelExpression[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 43) {
          this.channelExpression[var4Lifetime4] = var6Lifetime3 + IntrusiveHashIterator.a(-128, this.channelExpression[var4Lifetime4]);
        }
        if (64 == var5Lifetime4) {
          if (var6Lifetime3 >= 64) {
            this.channelFlags[var4Lifetime4] = LevelSelectScreen.d(this.channelFlags[var4Lifetime4], 1);
          } else {
            this.channelFlags[var4Lifetime4] = IntrusiveHashIterator.a(this.channelFlags[var4Lifetime4], -2);
          }
        }
        if (var5Lifetime4 == 65) {
          if (var6Lifetime3 >= 64) {
            this.channelFlags[var4Lifetime4] = LevelSelectScreen.d(this.channelFlags[var4Lifetime4], 2);
          } else {
            this.a(0, var4Lifetime4);
            this.channelFlags[var4Lifetime4] = IntrusiveHashIterator.a(this.channelFlags[var4Lifetime4], -3);
          }
        }
        if (99 == var5Lifetime4) {
          this.channelParameter[var4Lifetime4] = (var6Lifetime3 << 7) + IntrusiveHashIterator.a(127, this.channelParameter[var4Lifetime4]);
        }
        if (var5Lifetime4 == 98) {
          this.channelParameter[var4Lifetime4] = IntrusiveHashIterator.a(16256, this.channelParameter[var4Lifetime4]) + var6Lifetime3;
        }
        if (101 == var5Lifetime4) {
          this.channelParameter[var4Lifetime4] = 16384 + IntrusiveHashIterator.a(127, this.channelParameter[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 100) {
          this.channelParameter[var4Lifetime4] = IntrusiveHashIterator.a(16256, this.channelParameter[var4Lifetime4]) + (16384 + var6Lifetime3);
        }
        if (var5Lifetime4 == 120) {
          this.allSoundOff((byte) -86, var4Lifetime4);
        }
        if (121 == var5Lifetime4) {
          this.resetControllers(var4Lifetime4, 98);
        }
        if (var5Lifetime4 == 123) {
          this.allNotesOff(var4Lifetime4, 0);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.channelParameter[var4Lifetime4];
          if (var7 == 16384) {
            this.channelPitchBendRange[var4Lifetime4] = IntrusiveHashIterator.a(-16257, this.channelPitchBendRange[var4Lifetime4]) + (var6Lifetime3 << 7);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.channelParameter[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.channelPitchBendRange[var4Lifetime4] = var6Lifetime3 + IntrusiveHashIterator.a(this.channelPitchBendRange[var4Lifetime4], -128);
          }
        }
        if (var5Lifetime4 == 16) {
          this.channelSampleOffset[var4Lifetime4] = IntrusiveHashIterator.a(this.channelSampleOffset[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 48) {
          this.channelSampleOffset[var4Lifetime4] = var6Lifetime3 + IntrusiveHashIterator.a(-128, this.channelSampleOffset[var4Lifetime4]);
        }
        if (var5Lifetime4 == 81) {
          if (var6Lifetime3 >= 64) {
            this.channelFlags[var4Lifetime4] = LevelSelectScreen.d(this.channelFlags[var4Lifetime4], 4);
          } else {
            this.c(var4Lifetime4, 0);
            this.channelFlags[var4Lifetime4] = IntrusiveHashIterator.a(this.channelFlags[var4Lifetime4], -5);
          }
        }
        if (var5Lifetime4 == 17) {
          this.g((-16257 & this.channelRetriggerValue[var4Lifetime4]) + (var6Lifetime3 << 7), 1010, var4Lifetime4);
        }
        if (var5Lifetime4 == 49) {
          this.g(var6Lifetime3 + (this.channelRetriggerValue[var4Lifetime4] & -128), 1010, var4Lifetime4);
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        this.d(param2, param1, -128);
        if (param0 != 0) {
          this.channelVolume = (int[]) null;
        }
    }

    final synchronized void fill(int[] output, int offset, int frames) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.midiReader.hasData()) {
            var4_int = this.midiReader.division * this.tempoScale / PcmPlayer.sampleRate;
            while (true) {
              var5 = this.field_F + (long)var4_int * (long)frames;
              if (-var5 + this.field_B >= 0L) {
                this.field_F = var5;
                break;
              }
              var7 = (int)(((long)var4_int + (-this.field_F + this.field_B) - 1L) / (long)var4_int);
              this.field_F = this.field_F + (long)var4_int * (long)var7;
              this.voiceMixer.fill(output, offset, var7);
              frames = frames - var7;
              this.e(-2);
              offset = offset + var7;
              if (this.midiReader.hasData()) {
                continue;
              }
              this.voiceMixer.fill(output, offset, frames);
              return;
            }
          }
          this.voiceMixer.fill(output, offset, frames);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ie.D(");
          if (output == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(offset).append(',').append(frames).append(')').toString());
        }
    }

    final synchronized void a(int param0, MusicTrack param1, int param2, boolean param3, int param4, boolean param5) {
        int var7_int = 0;
        int var8 = 0;
        if (!this.midiReader.hasData()) {
          this.playTrack(param1, -61, param3);
          return;
        }
        try {
          this.field_N = param3 ? true : false;
          this.field_L = param5 ? true : false;
          this.field_I = param1;
          var7_int = this.midiReader.timeToTick(this.field_F) * param0;
          var8 = param2 * this.midiReader.division;
          var7_int = var8 * ((param4 + var8 + var7_int) / var8);
          this.field_M = (var7_int + (param0 >> 1)) / param0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ie.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != -1) {
          String var2 = (String) null;
          MidiSynthesizer.a((String) null, false);
        }
        field_u = null;
        field_q = null;
        pendingBytePayloadSubmissions = null;
        field_o = null;
    }

    final synchronized void stopTrack(int obfuscationGuard) {
        this.a(true, obfuscationGuard ^ -16582);
        if (obfuscationGuard != -24774) {
          this.channelSampleOffset = (int[]) null;
        }
    }

    private final int a(int param0, MusicVoice param1) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        MusicEnvelope var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param1.basePitch256 + (param1.portamentoDelta * param1.portamentoScale >> 12);
          var3_int = var3_int + (this.channelPitchBendRange[param1.channel] * (-8192 + this.channelPitchBend[param1.channel]) >> 12);
          var4 = param1.envelope;
          if (0 < var4.vibratoRate && (!(var4.vibratoDepth <= 0) ||
            this.channelModulation[param1.channel] > 0)) {
            var5 = var4.vibratoDepth << 2;
            var6 = var4.vibratoDelay << 1;
            if (param1.ageTicks < var6) {
              var5 = var5 * param1.ageTicks / var6;
            }
            var5 = var5 + (this.channelModulation[param1.channel] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.vibratoPhase & 511));
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          if (param0 != -11) {
            this.field_N = true;
          }
          var5Lifetime1 = (int)((double)(param1.sample.sampleRate * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)PcmPlayer.sampleRate + 0.5);
          stackIn_12_0 = (var5Lifetime1 >= 1) ? var5Lifetime1 : 1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ie.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final synchronized void setChannelGain(int gain, int channel, int obfuscationGuard) {
        int var4 = 0;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (0 > channel) {
          for (var4 = 0; var4 < 16; var4++) {
            this.channelGain[var4] = gain;
          }
        } else {
          this.channelGain[channel] = gain;
        }
        if (obfuscationGuard != 16) {
          this.c(-83, 39, -63);
        }
    }

    private final void noteOff(int obfuscationGuard, int note, int channel, int velocity) {
        MusicVoice var7 = null;
        int var8 = BrickABrac.field_J ? 1 : 0;
        MusicVoice var9 = this.voicesByNote[channel][note];
        int var6 = -89 / ((obfuscationGuard - 16) / 58);
        if (var9 == null) {
          return;
        }
        this.voicesByNote[channel][note] = null;
        if ((this.channelFlags[channel] & 2) == 0) {
          var9.releaseProgress = 0;
        } else {
          var7 = (MusicVoice) (this.voiceMixer.voices.first(-26));
          while (var7 != null) {
            if (var9.channel == var7.channel && var7.releaseProgress < 0 &&
              var7 != var9) {
              var9.releaseProgress = 0;
              break;
            }
            var7 = (MusicVoice) (this.voiceMixer.voices.next((byte) 116));
          }
        }
    }

    final synchronized void skip(int frames) {
        int var2;
        long var3;
        int var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (this.midiReader.hasData()) {
          var2 = this.midiReader.division * this.tempoScale / PcmPlayer.sampleRate;
          while (true) {
            var3 = (long)var2 * (long)frames + this.field_F;
            if (-var3 + this.field_B >= 0L) {
              this.field_F = var3;
              break;
            }
            var5 = (int)((-1L + (-this.field_F + this.field_B) + (long)var2) / (long)var2);
            this.field_F = this.field_F + (long)var5 * (long)var2;
            this.voiceMixer.skip(var5);
            frames = frames - var5;
            this.e(-2);
            if (!this.midiReader.hasData()) {
              break;
            }
          }
        }
        this.voiceMixer.skip(frames);
    }

    private final synchronized void a(boolean param0, boolean param1, boolean param2, MusicTrack param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        try {
          this.a(param0, 8192);
          this.midiReader.parse(param3.midiBytes);
          this.field_F = 0L;
          this.field_N = param2 ? true : false;
          var5_int = this.midiReader.getTrackCount();
          for (var6 = 0; var6 < var5_int; var6++) {
            this.midiReader.seekTrack(var6);
            this.midiReader.readTrackDelta(var6);
            this.midiReader.saveTrackPosition(var6);
          }
          if (!param1) {
            field_u = (String) null;
          }
          this.field_x = this.midiReader.nextTrack();
          this.field_O = this.midiReader.trackTicks[this.field_x];
          this.field_B = this.midiReader.getTickTime(this.field_O);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ie.W(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, RgbSprite[] param1, RgbSprite[] param2, int param3, RgbSprite[] param4, int param5, int param6, TextFont param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        try {
          if (param10 < 87) {
            field_q = (String) null;
          }
          var15_int = param7.descent + param7.capHeight;
          var16 = param7.capHeight;
          BoardPresentationHelpers.configureFullscreenDialogFromSprites(param12, param9, var15_int, param3, param7, param13, var15_int, -111, param5, var16, param1, param7, param8, 480, param0, param6, var16, param11, param14, param2, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_6_0 = var15;
          stackIn_6_1 = new StringBuilder().append("ie.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    public MidiSynthesizer() {
        this.channelFlags = new int[16];
        this.channelGain = new int[16];
        this.channelModulation = new int[16];
        this.channelPitchBend = new int[16];
        this.channelPitchBendRange = new int[16];
        this.channelPan = new int[16];
        this.channelBank = new int[16];
        this.channelSampleOffset = new int[16];
        this.voicesByNote = new MusicVoice[16][128];
        this.channelRetriggerValue = new int[16];
        this.channelParameter = new int[16];
        this.channelPortamentoTime = new int[16];
        this.field_U = new int[16];
        this.masterGain = 256;
        this.tempoScale = 1000000;
        this.channelExpression = new int[16];
        this.voicesByGroup = new MusicVoice[16][128];
        this.initialPrograms = new int[16];
        this.channelProgram = new int[16];
        this.channelVolume = new int[16];
        this.midiReader = new MidiFileReader();
        this.voiceMixer = new MusicVoiceMixer(this);
        this.patches = new IntrusiveHashTable(128);
        this.setChannelGain(256, -1, 16);
        this.reset(-38, true);
    }

    static {
        field_o = "Creating your account";
        pendingBytePayloadSubmissions = new NodeDeque();
        field_u = "Tips";
        field_q = "Create your own free Jagex account";
    }
}
