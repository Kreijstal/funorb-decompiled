/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchPcmStream extends PcmStream {
    static String field_h;
    IntrusiveDeque notes;
    private MidiPcmStream midiStream;
    PcmStreamMixer fadingStreams;

    final PcmStream nextSubStream() {
        MidiNote var1;
        while (true) {
          var1 = (MidiNote) (this.notes.next((byte) 30));
          if (var1 == null) {
            return null;
          }
          if (null != var1.stream) {
            return (PcmStream) ((Object) var1.stream);
          }
        }
    }

    final static float[] copyFloatArray(int param0, int param1, float[] param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new float[param0];
          var3 = var4;
          ArrayOperations.copy(param2, 0, var4, param1, param0);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("ht.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final PcmStream firstSubStream() {
        MidiNote var1 = (MidiNote) (this.notes.first(0));
        if (var1 == null) {
          return null;
        }
        if (var1.stream != null) {
          return (PcmStream) ((Object) var1.stream);
        }
        return this.nextSubStream();
    }

    final int getActivityWeight() {
        return 0;
    }

    private final void skipNote(MidiNote param0, int param1, int param2) {
        MidiPcmStream stackIn_7_0 = null;
        MidiNote stackIn_7_1 = null;
        boolean stackIn_8_2 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if ((4 & this.midiStream.channelFlags[param0.channel]) != 0 &&
            param0.releasePosition < 0) {
            var4_int = this.midiStream.retriggerPhaseIncrements[param0.channel] / AudioOutput.sampleRate;
            var5 = (-param0.retriggerPhase + var4_int + 1048575) / var4_int;
            param0.retriggerPhase = 1048575 & param0.retriggerPhase + param2 * var4_int;
            if (param2 >= var5) {
              if (this.midiStream.sampleOffsets[param0.channel] == 0) {
                param0.stream = PcmSampleStream.createRaw(param0.sample, param0.stream.getSpeed(), param0.stream.getTargetGain(), param0.stream.getPan());
              } else {
                param0.stream = PcmSampleStream.createRaw(param0.sample, param0.stream.getSpeed(), 0, param0.stream.getPan());
                stackIn_7_0 = this.midiStream;
                stackIn_7_1 = (MidiNote) (param0);
                stackIn_8_2 = !(param0.patch.pitchOffsets[param0.key] >= 0);
                ((MidiPcmStream) (Object) stackIn_7_0).applySampleOffset(stackIn_7_1, stackIn_8_2, true);
              }
              if (param0.patch.pitchOffsets[param0.key] < 0) {
                param0.stream.setLoopCount(-1);
              }
              param2 = param0.retriggerPhase / var4_int;
            }
          }
          param0.stream.skip(param2);
          if (param1 == -1) {
            return;
          }
          field_h = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ht.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void mix(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        MidiNote var6 = null;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        try {
          this.fadingStreams.mix(param0, param1, param2);
          var6 = (MidiNote) (this.notes.first(0));
          while (var6 != null) {
            stackIn_4_0 = this.midiStream.isNoteInactive(var6, 0);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var5 = param2;
              var4_int = param1;
              while (var5 > var6.samplesUntilUpdate) {
                this.mixNote(var4_int, var5 + var4_int, var6, param0, var6.samplesUntilUpdate, (byte) 26);
                var5 = var5 - var6.samplesUntilUpdate;
                var4_int = var4_int + var6.samplesUntilUpdate;
                if (this.midiStream.updateNote(var4_int, param0, var5, var6, (byte) -12)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.mixNote(var4_int, var5 + var4_int, var6, param0, var5, (byte) 12);
                var6.samplesUntilUpdate = var6.samplesUntilUpdate - var5;
              }
            }
            var6 = (MidiNote) (this.notes.next((byte) 103));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("ht.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void mixNote(int param0, int param1, MidiNote param2, int[] param3, int param4, byte param5) {
        MidiPcmStream stackIn_12_0 = null;
        MidiNote stackIn_12_1 = null;
        boolean stackIn_13_2 = false;
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
        var12 = VoidHunters.field_G;
        try {
          if (0 != (this.midiStream.channelFlags[param2.channel] & 4) &&
            param2.releasePosition < 0) {
            var7_int = this.midiStream.retriggerPhaseIncrements[param2.channel] / AudioOutput.sampleRate;
            while (true) {
              var8 = (1048575 + (var7_int - param2.retriggerPhase)) / var7_int;
              if (param4 < var8) {
                param2.retriggerPhase = param2.retriggerPhase + param4 * var7_int;
                break;
              }
              param2.stream.mix(param3, param0, var8);
              param2.retriggerPhase = param2.retriggerPhase + (var7_int * var8 - 1048576);
              param0 = param0 + var8;
              param4 = param4 - var8;
              var9 = AudioOutput.sampleRate / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param2.stream;
              if (this.midiStream.sampleOffsets[param2.channel] == 0) {
                param2.stream = PcmSampleStream.createRaw(param2.sample, var11.getSpeed(), var11.getTargetGain(), var11.getPan());
              } else {
                param2.stream = PcmSampleStream.createRaw(param2.sample, var11.getSpeed(), 0, var11.getPan());
                stackIn_12_0 = this.midiStream;
                stackIn_12_1 = (MidiNote) (param2);
                stackIn_13_2 = !(0 <= param2.patch.pitchOffsets[param2.key]);
                ((MidiPcmStream) (Object) stackIn_12_0).applySampleOffset(stackIn_12_1, stackIn_13_2, true);
                param2.stream.rampGain(var9, var11.getTargetGain());
              }
              if (param2.patch.pitchOffsets[param2.key] < 0) {
                param2.stream.setLoopCount(-1);
              }
              var11.fadeOut(var9);
              var11.mix(param3, param0, param1 - param0);
              if (!var11.isRamping()) {
                continue;
              }
              this.fadingStreams.addSubStream(var11);
            }
          }
          param2.stream.mix(param3, param0, param4);
          if (param5 >= 11) {
            return;
          }
          this.fadingStreams = (PcmStreamMixer) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("ht.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_h = null;
        if (!param0) {
          return;
        }
        float[] var2 = (float[]) null;
        MusicPatchPcmStream.copyFloatArray(-65, -20, (float[]) null);
    }

    final void skip(int param0) {
        int var2;
        MidiNote var3;
        int var4;
        var4 = VoidHunters.field_G;
        this.fadingStreams.skip(param0);
        var3 = (MidiNote) (this.notes.first(0));
        while (var3 != null) {
          if (!this.midiStream.isNoteInactive(var3, 0)) {
            var2 = param0;
            do {
              if (var3.samplesUntilUpdate >= var2) {
                this.skipNote(var3, -1, var2);
                var3.samplesUntilUpdate = var3.samplesUntilUpdate - var2;
                break;
              }
              this.skipNote(var3, -1, var3.samplesUntilUpdate);
              var2 = var2 - var3.samplesUntilUpdate;
            } while (!this.midiStream.updateNote(0, (int[]) null, var2, var3, (byte) -68));
          }
          var3 = (MidiNote) (this.notes.next((byte) 99));
        }
    }

    MusicPatchPcmStream(MidiPcmStream param0) {
        this.notes = new IntrusiveDeque();
        this.fadingStreams = new PcmStreamMixer();
        try {
          this.midiStream = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ht.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
