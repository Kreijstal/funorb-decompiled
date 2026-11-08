/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiNoteMixer extends PcmStream {
    static int field_p;
    static SpriteData[] field_q;
    IntrusiveDeque voices;
    static int[] field_s;
    static boolean[] field_r;
    private MidiPcmStream synthesizer;
    PcmStreamMixer fadingStreams;

    final void mixInto(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        MusicVoice var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          this.fadingStreams.mixInto(param0, param1, param2);
          var6 = (MusicVoice) (this.voices.first(-108));
          while (var6 != null) {
            stackIn_4_0 = this.synthesizer.removeInactiveVoice(73, var6);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var5 = param2;
              var4_int = param1;
              while (var5 > var6.samplesUntilUpdate) {
                this.mixVoice(var6, param0, var5 + var4_int, 78, var4_int, var6.samplesUntilUpdate);
                var5 = var5 - var6.samplesUntilUpdate;
                var4_int = var4_int + var6.samplesUntilUpdate;
                if (this.synthesizer.updateVoice(param0, var4_int, var5, var6, 0)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.mixVoice(var6, param0, var4_int + var5, 119, var4_int, var5);
                var6.samplesUntilUpdate = var6.samplesUntilUpdate - var5;
              }
            }
            var6 = (MusicVoice) (this.voices.next((byte) 18));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("rh.J(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void mixVoice(MusicVoice param0, int[] param1, int param2, int param3, int param4, int param5) {
        MidiPcmStream stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        MusicVoice stackIn_14_2 = null;
        boolean stackIn_15_3;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        PcmSampleStream var11 = null;
        int var12 = 0;
        MusicVoice var13 = null;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param3 < 54) {
            var13 = (MusicVoice) null;
            this.skipVoice((MusicVoice) null, -15, 29);
          }
          if ((4 & this.synthesizer.channelFlags[param0.channel]) != 0 &&
            param0.releaseTime < 0) {
            var7_int = this.synthesizer.retriggerRates[param0.channel] / AudioOutput.sampleRate;
            while (true) {
              var8 = (var7_int + (1048575 - param0.retriggerPhase)) / var7_int;
              if (var8 > param5) {
                param0.retriggerPhase = param0.retriggerPhase + var7_int * param5;
                break;
              }
              param0.stream.mixInto(param1, param4, var8);
              param4 = param4 + var8;
              param0.retriggerPhase = param0.retriggerPhase + (-1048576 + var8 * var7_int);
              param5 = param5 - var8;
              var9 = AudioOutput.sampleRate / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param0.stream;
              if (this.synthesizer.sampleOffsets[param0.channel] != 0) {
                param0.stream = PcmSampleStream.createForSampleStep(param0.sample, var11.stepMagnitude(), 0, var11.targetPan());
                stackIn_14_0 = this.synthesizer;
                stackIn_14_1 = 114;
                stackIn_14_2 = (MusicVoice) (param0);
                stackIn_15_3 = !(param0.patch.tunings[param0.note] >= 0);
                ((MidiPcmStream) (Object) stackIn_14_0).applySampleOffset((byte) stackIn_14_1, stackIn_14_2, stackIn_15_3);
                param0.stream.rampVolume(var9, var11.targetVolume());
              } else {
                param0.stream = PcmSampleStream.createForSampleStep(param0.sample, var11.stepMagnitude(), var11.targetVolume(), var11.targetPan());
              }
              if (param0.patch.tunings[param0.note] < 0) {
                param0.stream.setLoopCount(-1);
              }
              var11.fadeOutAndUnlink(var9);
              var11.mixInto(param1, param4, -param4 + param2);
              if (!var11.isRamping()) {
                continue;
              }
              this.fadingStreams.addSubstream(var11);
            }
          }
          param0.stream.mixInto(param1, param4, param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("rh.F(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void skip(int param0) {
        int var2;
        MusicVoice var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.fadingStreams.skip(param0);
        var3 = (MusicVoice) (this.voices.first(-103));
        while (var3 != null) {
          stackIn_4_0 = this.synthesizer.removeInactiveVoice(94, var3);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_4_0) {
            var2 = param0;
            while (var2 > var3.samplesUntilUpdate) {
              this.skipVoice(var3, var3.samplesUntilUpdate, -23408);
              var2 = var2 - var3.samplesUntilUpdate;
              if (this.synthesizer.updateVoice((int[]) null, 0, var2, var3, 0)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.skipVoice(var3, var2, -23408);
              var3.samplesUntilUpdate = var3.samplesUntilUpdate - var2;
            }
          }
          var3 = (MusicVoice) (this.voices.next((byte) 18));
        }
    }

    final int activityWeight() {
        return 0;
    }

    final PcmStream firstSubstream() {
        MusicVoice var1 = (MusicVoice) (this.voices.first(-127));
        if (var1 == null) {
          return null;
        }
        if (null == var1.stream) {
          return this.nextSubstream();
        }
        return (PcmStream) ((Object) var1.stream);
    }

    public static void releaseStatics(byte param0) {
        if (param0 > 47) {
          field_s = null;
          field_q = null;
          field_r = null;
          return;
        }
        MidiNoteMixer.releaseStatics((byte) 45);
        field_s = null;
        field_q = null;
        field_r = null;
    }

    private final void skipVoice(MusicVoice param0, int param1, int param2) {
        MidiPcmStream stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        MusicVoice stackIn_8_2 = null;
        boolean stackIn_9_3;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var6 = null;
        try {
          if ((4 & this.synthesizer.channelFlags[param0.channel]) != 0 &&
            param0.releaseTime < 0) {
            var4_int = this.synthesizer.retriggerRates[param0.channel] / AudioOutput.sampleRate;
            var5 = (var4_int + 1048575 - param0.retriggerPhase) / var4_int;
            param0.retriggerPhase = param1 * var4_int + param0.retriggerPhase & 1048575;
            if (param1 >= var5) {
              if (this.synthesizer.sampleOffsets[param0.channel] == 0) {
                param0.stream = PcmSampleStream.createForSampleStep(param0.sample, param0.stream.stepMagnitude(), param0.stream.targetVolume(), param0.stream.targetPan());
              } else {
                param0.stream = PcmSampleStream.createForSampleStep(param0.sample, param0.stream.stepMagnitude(), 0, param0.stream.targetPan());
                stackIn_8_0 = this.synthesizer;
                stackIn_8_1 = -56;
                stackIn_8_2 = (MusicVoice) (param0);
                stackIn_9_3 = !(param0.patch.tunings[param0.note] >= 0);
                ((MidiPcmStream) (Object) stackIn_8_0).applySampleOffset((byte) stackIn_8_1, stackIn_8_2, stackIn_9_3);
              }
              if (param0.patch.tunings[param0.note] < 0) {
                param0.stream.setLoopCount(-1);
              }
              param1 = param0.retriggerPhase / var4_int;
            }
          }
          param0.stream.skip(param1);
          if (param2 == -23408) {
            return;
          }
          var6 = (int[]) null;
          this.mixVoice((MusicVoice) null, (int[]) null, 36, -113, -84, 67);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("rh.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final PcmStream nextSubstream() {
        MusicVoice var1;
        int var2;
        var2 = Sumoblitz.field_L ? 1 : 0;
        while (true) {
          var1 = (MusicVoice) (this.voices.next((byte) 18));
          if (var1 == null) {
            return null;
          }
          if (var1.stream != null) {
            return (PcmStream) ((Object) var1.stream);
          }
        }
    }

    MidiNoteMixer(MidiPcmStream param0) {
        this.voices = new IntrusiveDeque();
        this.fadingStreams = new PcmStreamMixer();
        try {
          this.synthesizer = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = new boolean[]{true, false, false, false, true, false, true, false, true, false, false, false, true, false, false, false, true, false, true, false, true, false, false, false, true};
        field_s = new int[13];
    }
}
