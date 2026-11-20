/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MusicPatchPcmStream extends PcmStream {
    static RaceWorld field_r;
    IntrusiveDeque notes;
    static int[] field_n;
    static String field_o;
    static SpriteAsset field_s;
    private MidiPcmStream midiStream;
    PcmStreamMixer fadeMixer;

    private final void skipNote(MidiNote param0, int param1, int param2) {
        MidiPcmStream stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        MidiNote stackIn_8_2 = null;
        boolean stackIn_9_3;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (0 != (this.midiStream.channelFlags[param0.channel] & 4) &&
            param0.releaseTime < 0) {
            var4_int = this.midiStream.retriggerPhaseSteps[param0.channel] / AudioOutput.sampleRate;
            var5 = (1048575 - (-var4_int + param0.retriggerPhase)) / var4_int;
            param0.retriggerPhase = var4_int * param2 + param0.retriggerPhase & 1048575;
            if (var5 <= param2) {
              if (this.midiStream.sampleOffsets[param0.channel] == 0) {
                param0.sampleStream = PcmSampleStream.createWithStep(param0.sample, param0.sampleStream.getPlaybackStep(), param0.sampleStream.getVolume(), param0.sampleStream.getPan());
              } else {
                param0.sampleStream = PcmSampleStream.createWithStep(param0.sample, param0.sampleStream.getPlaybackStep(), 0, param0.sampleStream.getPan());
                stackIn_8_0 = this.midiStream;
                stackIn_8_1 = 2;
                stackIn_8_2 = (MidiNote) (param0);
                stackIn_9_3 = !(param0.patch.keyPitches[param0.key] >= 0);
                ((MidiPcmStream) (Object) stackIn_8_0).applySampleOffset(stackIn_8_1, stackIn_8_2, stackIn_9_3);
              }
              if (param0.patch.keyPitches[param0.key] < 0) {
                param0.sampleStream.setLoopCount(-1);
              }
              param2 = param0.retriggerPhase / var4_int;
            }
          }
          if (param1 > -71) {
            this.notes = (IntrusiveDeque) null;
          }
          param0.sampleStream.skip(param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("bl.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final PcmStream firstSubStream() {
        MidiNote var1 = (MidiNote) (this.notes.first((byte) 100));
        if (var1 == null) {
          return null;
        }
        if (var1.sampleStream != null) {
          return (PcmStream) ((Object) var1.sampleStream);
        }
        return this.nextSubStream();
    }

    final static void reportClientError(Throwable param0, byte param1, String param2) {
        try {
          PlatformTaskDispatcher stackIn_13_0;
          java.net.URL stackIn_13_1;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          StringBuilder stackIn_13_4;
          java.net.URL stackIn_14_1;
          java.net.URL stackIn_14_2;
          String stackIn_14_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          PlatformTask var4 = null;
          DataInputStream var5_ref_DataInputStream = null;
          int var5 = 0;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = HoldTheLine.field_D;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = AchievementUnlockRequest.formatCompactStackTrace(param0, -12895);
            }
            if (param2 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param2;
            }
            cd.logClientError(12, var3);
            var7 = NineSlicePanel.replaceAllLiteral("%3a", ":", -104, var3);
            var8 = NineSlicePanel.replaceAllLiteral("%40", "@", -102, var7);
            var9 = NineSlicePanel.replaceAllLiteral("%26", "&", -102, var8);
            var10 = NineSlicePanel.replaceAllLiteral("%23", "#", -67, var9);
            if (null == RoadStripRenderer.field_d) {
              return;
            }
            stackIn_13_0 = te.field_d;
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_3 = RoadStripRenderer.field_d.getCodeBase();
            stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(IterableNodeHashTable.field_a).append("&u=");
            if (null != LinkWidgetRenderer.field_f) {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = LinkWidgetRenderer.field_f;
            } else {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = "" + TutorialCalloutAnchor.field_e;
            }
            var4 = ((PlatformTaskDispatcher) (Object) stackIn_13_0).openUrlStream(new java.net.URL(stackIn_13_3, ((StringBuilder) (Object) stackIn_13_4).append(stackIn_14_5).append("&v1=").append(PlatformTaskDispatcher.field_p).append("&v2=").append(PlatformTaskDispatcher.field_j).append("&e=").append(var10).toString()), 0);
            while (var4.field_d == 0) {
              SocketConnector.sleepMillis(1L, (byte) 45);
            }
            if (var4.field_d == 1) {
              var5_ref_DataInputStream = (DataInputStream) (var4.field_b);
              var5_ref_DataInputStream.read();
              var5_ref_DataInputStream.close();
            }
            var5 = 44 % ((17 - param1) / 37);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void skip(int param0) {
        int var2;
        MidiNote var3;
        int var4;
        var4 = HoldTheLine.field_D;
        this.fadeMixer.skip(param0);
        var3 = (MidiNote) (this.notes.first((byte) 120));
        while (var3 != null) {
          if (!this.midiStream.removeFinishedNote(true, var3)) {
            var2 = param0;
            do {
              if (var3.samplesUntilUpdate >= var2) {
                this.skipNote(var3, -106, var2);
                var3.samplesUntilUpdate = var3.samplesUntilUpdate - var2;
                break;
              }
              this.skipNote(var3, -121, var3.samplesUntilUpdate);
              var2 = var2 - var3.samplesUntilUpdate;
            } while (!this.midiStream.updateNote((int[]) null, var3, var2, -104, 0));
          }
          var3 = (MidiNote) (this.notes.next((byte) -120));
        }
    }

    private final void mixNote(MidiNote param0, int[] param1, byte param2, int param3, int param4, int param5) {
        MidiPcmStream stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        MidiNote stackIn_14_2 = null;
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
        var12 = HoldTheLine.field_D;
        try {
          if (param2 != -23) {
            this.notes = (IntrusiveDeque) null;
          }
          if ((4 & this.midiStream.channelFlags[param0.channel]) != 0 &&
            param0.releaseTime < 0) {
            var7_int = this.midiStream.retriggerPhaseSteps[param0.channel] / AudioOutput.sampleRate;
            while (true) {
              var8 = (-param0.retriggerPhase + var7_int + 1048575) / var7_int;
              if (param4 < var8) {
                param0.retriggerPhase = param0.retriggerPhase + var7_int * param4;
                break;
              }
              param0.sampleStream.mix(param1, param3, var8);
              param0.retriggerPhase = param0.retriggerPhase + (-1048576 + var8 * var7_int);
              param3 = param3 + var8;
              param4 = param4 - var8;
              var9 = AudioOutput.sampleRate / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param0.sampleStream;
              if (0 != this.midiStream.sampleOffsets[param0.channel]) {
                param0.sampleStream = PcmSampleStream.createWithStep(param0.sample, var11.getPlaybackStep(), 0, var11.getPan());
                stackIn_14_0 = this.midiStream;
                stackIn_14_1 = param2 ^ -21;
                stackIn_14_2 = (MidiNote) (param0);
                stackIn_15_3 = !(0 <= param0.patch.keyPitches[param0.key]);
                ((MidiPcmStream) (Object) stackIn_14_0).applySampleOffset(stackIn_14_1, stackIn_14_2, stackIn_15_3);
                param0.sampleStream.rampVolume(var9, var11.getVolume());
              } else {
                param0.sampleStream = PcmSampleStream.createWithStep(param0.sample, var11.getPlaybackStep(), var11.getVolume(), var11.getPan());
              }
              if (0 > param0.patch.keyPitches[param0.key]) {
                param0.sampleStream.setLoopCount(-1);
              }
              var11.fadeOutAndRemove(var9);
              var11.mix(param1, param3, param5 - param3);
              if (!var11.isRamping()) {
                continue;
              }
              this.fadeMixer.addSubStream(var11);
            }
          }
          param0.sampleStream.mix(param1, param3, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("bl.C(");
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
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final PcmStream nextSubStream() {
        MidiNote var1;
        int var2;
        var2 = HoldTheLine.field_D;
        while (true) {
          var1 = (MidiNote) (this.notes.next((byte) -57));
          if (var1 == null) {
            return null;
          }
          if (var1.sampleStream != null) {
            return (PcmStream) ((Object) var1.sampleStream);
          }
        }
    }

    final void mix(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        MidiNote var6 = null;
        int var7 = 0;
        var7 = HoldTheLine.field_D;
        try {
          this.fadeMixer.mix(param0, param1, param2);
          var6 = (MidiNote) (this.notes.first((byte) 101));
          while (var6 != null) {
            stackIn_4_0 = this.midiStream.removeFinishedNote(true, var6);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var4_int = param1;
              var5 = param2;
              while (var5 > var6.samplesUntilUpdate) {
                this.mixNote(var6, param0, (byte) -23, var4_int, var6.samplesUntilUpdate, var4_int + var5);
                var4_int = var4_int + var6.samplesUntilUpdate;
                var5 = var5 - var6.samplesUntilUpdate;
                if (this.midiStream.updateNote(param0, var6, var5, -116, var4_int)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.mixNote(var6, param0, (byte) -23, var4_int, var5, var4_int + var5);
                var6.samplesUntilUpdate = var6.samplesUntilUpdate - var5;
              }
            }
            var6 = (MidiNote) (this.notes.next((byte) 102));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("bl.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_o = null;
        field_n = null;
        field_r = null;
        if (param0 != 0) {
          field_s = (SpriteAsset) null;
          field_s = null;
          return;
        }
        field_s = null;
    }

    final int getActivityWeight() {
        return 0;
    }

    MusicPatchPcmStream(MidiPcmStream param0) {
        this.notes = new IntrusiveDeque();
        this.fadeMixer = new PcmStreamMixer();
        try {
          this.midiStream = param0;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "bl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = new int[]{3, 4, 3};
        field_o = "Deaths";
    }
}
