/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class MidiPcmStream extends PcmStream {
    private int field_u;
    int[] field_i;
    private int[] field_z;
    private int[] channelPan;
    private MusicPatchNode[][] field_Q;
    private int[] channelExpression;
    private int[] initialPrograms;
    private int[] channelBanks;
    int[] field_o;
    int[] sampleOffsets;
    private int[] modulation;
    private int[] pitchBend;
    private int[] channelPrograms;
    private int playbackTimeScale;
    private IntrusiveNodeHashTable field_w;
    private MidiFileReader field_k;
    private int[] channelVolume;
    private MusicPatchNode[][] field_O;
    private int[] retriggerRates;
    private int[] channelGains;
    private int[] portamentoTime;
    private int[] pitchBendSensitivity;
    static Random field_l;
    static IntrusiveDeque field_M;
    static int field_C;
    private int field_H;
    private MusicPatchPcmStream field_m;
    private long field_D;
    private int field_K;
    static String field_t;
    private boolean field_r;
    private long field_P;
    private boolean field_F;
    private int field_N;
    private MusicTrack field_x;

    final synchronized void playTrack(boolean param0, int param1, MusicTrack param2) {
        if (param1 != 19134) {
          return;
        }
        try {
          this.startTrack(param2, true, (byte) 101, param0);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ru.HA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized PcmStream nextSubstream() {
        return null;
    }

    private final void handleChannelPressure(int param0, int param1, int param2) {
        if (param0 != 16) {
          this.field_k = (MidiFileReader) null;
        }
    }

    private final int computeNoteStep(MusicPatchNode param0, int param1) {
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        InstrumentEnvelope var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = (param0.field_n * param0.field_p >> 12) + param0.field_D;
          if (param1 != -5) {
            stackIn_2_0 = -5;
            return stackIn_2_0;
          }
          var3_int = var3_int + ((-8192 + this.pitchBend[param0.field_q]) * this.pitchBendSensitivity[param0.field_q] >> 12);
          var4 = param0.field_j;
          if (var4.field_h > 0 && (!(var4.field_j <= 0) ||
            this.modulation[param0.field_q] > 0)) {
            var5 = var4.field_j << 2;
            var6 = var4.field_k << 1;
            if (param0.field_w < var6) {
              var5 = var5 * param0.field_w / var6;
            }
            var5 = var5 + (this.modulation[param0.field_q] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(511 & param0.field_z));
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)((double)(256 * param0.field_y.field_f) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)PcmPlayerService.sampleRate + 0.5);
          stackIn_14_0 = (1 > var5Lifetime1) ? 1 : var5Lifetime1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("ru.V(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized int getSchedulingCost() {
        return 0;
    }

    final synchronized void setPlaybackTimeScale(int param0, int param1) {
        this.playbackTimeScale = param0;
        if (param1 != 107342216) {
          this.dispatchMidiEvent(9, 30);
        }
    }

    private final void handlePolyphonicPressure(int param0, int param1, byte param2, int param3) {
        int discarded$0 = 0;
        if (param2 != -71) {
          discarded$0 = this.computeNotePan(false, (MusicPatchNode) null);
        }
    }

    final synchronized void setChannelProgram(int param0, int param1, byte param2) {
        if (param2 > -48) {
          this.channelExpression = (int[]) null;
        }
        this.applyInitialProgram(param0, param1, (byte) 36);
    }

    private final void dispatchMidiEvent(int param0, int param1) {
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
        var8 = Kickabout.field_G;
        if (param0 != 5) {
          return;
        }
        var3 = 240 & param1;
        if (var3 == 128) {
          var4 = 15 & param1;
          var5 = 127 & param1 >> 8;
          var6 = param1 >> 16 & 127;
          this.noteOff((byte) -119, var5, var4, var6);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = (param1 & 32618) >> 8;
          var6Lifetime1 = param1 >> 16 & 127;
          if (var6Lifetime1 <= 0) {
            this.noteOff((byte) -44, var5Lifetime1, var4Lifetime1, 64);
          } else {
            this.noteOn(32, var6Lifetime1, var5Lifetime1, var4Lifetime1);
          }
          return;
        }
        if (160 == var3) {
          var4Lifetime2 = param1 & 15;
          var5Lifetime2 = param1 >> 8 & 127;
          var6Lifetime2 = (param1 & 8376783) >> 16;
          this.handlePolyphonicPressure(var4Lifetime2, var5Lifetime2, (byte) -71, var6Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (192 == var3) {
            var4Lifetime3 = 15 & param1;
            var5Lifetime3 = 127 & param1 >> 8;
            this.changeProgram(this.channelBanks[var4Lifetime3] + var5Lifetime3, param0 ^ 133, var4Lifetime3);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = 15 & param1;
            var5Lifetime3Lifetime1 = (param1 & 32603) >> 8;
            this.handleChannelPressure(param0 + 11, var5Lifetime3Lifetime1, var4Lifetime3Lifetime1);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = param1 & 15;
            var5Lifetime3Lifetime2 = (127 & param1 >> 8) + (16256 & param1 >> 9);
            this.setPitchBend(param0 + 37, var4Lifetime3Lifetime2, var5Lifetime3Lifetime2);
            return;
          }
          var3 = param1 & 255;
          if (255 != var3) {
            return;
          }
          this.resetSynthesizer(true, false);
          return;
        }
        var4Lifetime4 = param1 & 15;
        var5Lifetime4 = 127 & param1 >> 8;
        var6Lifetime3 = (8349360 & param1) >> 16;
        if (var5Lifetime4 == 0) {
          this.channelBanks[var4Lifetime4] = TextLayoutLine.b(this.channelBanks[var4Lifetime4], -2080769) + (var6Lifetime3 << 14);
        }
        if (var5Lifetime4 == 32) {
          this.channelBanks[var4Lifetime4] = TextLayoutLine.b(-16257, this.channelBanks[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 1) {
          this.modulation[var4Lifetime4] = TextLayoutLine.b(this.modulation[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (33 == var5Lifetime4) {
          this.modulation[var4Lifetime4] = var6Lifetime3 + TextLayoutLine.b(-128, this.modulation[var4Lifetime4]);
        }
        if (var5Lifetime4 == 5) {
          this.portamentoTime[var4Lifetime4] = (var6Lifetime3 << 7) + TextLayoutLine.b(this.portamentoTime[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 37) {
          this.portamentoTime[var4Lifetime4] = var6Lifetime3 + TextLayoutLine.b(this.portamentoTime[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 7) {
          this.channelVolume[var4Lifetime4] = (var6Lifetime3 << 7) + TextLayoutLine.b(this.channelVolume[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 39) {
          this.channelVolume[var4Lifetime4] = var6Lifetime3 + TextLayoutLine.b(-128, this.channelVolume[var4Lifetime4]);
        }
        if (10 == var5Lifetime4) {
          this.channelPan[var4Lifetime4] = (var6Lifetime3 << 7) + TextLayoutLine.b(this.channelPan[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 42) {
          this.channelPan[var4Lifetime4] = TextLayoutLine.b(this.channelPan[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 11) {
          this.channelExpression[var4Lifetime4] = TextLayoutLine.b(this.channelExpression[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 43) {
          this.channelExpression[var4Lifetime4] = var6Lifetime3 + TextLayoutLine.b(-128, this.channelExpression[var4Lifetime4]);
        }
        if (var5Lifetime4 == 64) {
          if (var6Lifetime3 >= 64) {
            this.field_i[var4Lifetime4] = PainterStyle.a(this.field_i[var4Lifetime4], 1);
          } else {
            this.field_i[var4Lifetime4] = TextLayoutLine.b(this.field_i[var4Lifetime4], -2);
          }
        }
        if (65 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.releasePortamentoNotes(-1, var4Lifetime4);
            this.field_i[var4Lifetime4] = TextLayoutLine.b(this.field_i[var4Lifetime4], -3);
          } else {
            this.field_i[var4Lifetime4] = PainterStyle.a(this.field_i[var4Lifetime4], 2);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_z[var4Lifetime4] = TextLayoutLine.b(this.field_z[var4Lifetime4], 127) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 98) {
          this.field_z[var4Lifetime4] = TextLayoutLine.b(16256, this.field_z[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 101) {
          this.field_z[var4Lifetime4] = 16384 - (-TextLayoutLine.b(this.field_z[var4Lifetime4], 127) - (var6Lifetime3 << 7));
        }
        if (var5Lifetime4 == 100) {
          this.field_z[var4Lifetime4] = var6Lifetime3 + (16384 + TextLayoutLine.b(16256, this.field_z[var4Lifetime4]));
        }
        if (120 == var5Lifetime4) {
          this.allSoundOff(var4Lifetime4, 100);
        }
        if (121 == var5Lifetime4) {
          this.resetControllers(var4Lifetime4, param0 ^ 87);
        }
        if (var5Lifetime4 == 123) {
          this.allNotesOff(-9, var4Lifetime4);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_z[var4Lifetime4];
          if (var7 == 16384) {
            this.pitchBendSensitivity[var4Lifetime4] = (var6Lifetime3 << 7) + TextLayoutLine.b(-16257, this.pitchBendSensitivity[var4Lifetime4]);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_z[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.pitchBendSensitivity[var4Lifetime4] = TextLayoutLine.b(-128, this.pitchBendSensitivity[var4Lifetime4]) + var6Lifetime3;
          }
        }
        if (var5Lifetime4 == 16) {
          this.sampleOffsets[var4Lifetime4] = (var6Lifetime3 << 7) + TextLayoutLine.b(-16257, this.sampleOffsets[var4Lifetime4]);
        }
        if (48 == var5Lifetime4) {
          this.sampleOffsets[var4Lifetime4] = var6Lifetime3 + TextLayoutLine.b(-128, this.sampleOffsets[var4Lifetime4]);
        }
        if (var5Lifetime4 == 81) {
          if (64 > var6Lifetime3) {
            this.resetRetriggerPhase(-28723, var4Lifetime4);
            this.field_i[var4Lifetime4] = TextLayoutLine.b(this.field_i[var4Lifetime4], -5);
          } else {
            this.field_i[var4Lifetime4] = PainterStyle.a(this.field_i[var4Lifetime4], 4);
          }
        }
        if (17 == var5Lifetime4) {
          this.setRetriggerRate(var4Lifetime4, (var6Lifetime3 << 7) + (this.retriggerRates[var4Lifetime4] & -16257), 103);
        }
        if (var5Lifetime4 != 49) {
          return;
        }
        this.setRetriggerRate(var4Lifetime4, (-128 & this.retriggerRates[var4Lifetime4]) + var6Lifetime3, 110);
        return;
    }

    private final synchronized void startTrack(MusicTrack param0, boolean param1, byte param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = Kickabout.field_G;
        try {
          this.stopTrack((byte) -123, param1);
          this.field_k.parse(param0.field_e);
          this.field_D = 0L;
          this.field_r = param3 ? true : false;
          if (param2 != 101) {
            this.field_N = 27;
          }
          var5_int = this.field_k.getTrackCount();
          for (var6 = 0; var6 < var5_int; var6++) {
            this.field_k.seekTrack(var6);
            this.field_k.readDelta(var6);
            this.field_k.saveTrackPosition(var6);
          }
          this.field_K = this.field_k.nextTrack();
          this.field_H = this.field_k.field_e[this.field_K];
          this.field_P = this.field_k.timeAtTick(this.field_H);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ru.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void noteOn(int param0, int param1, int param2, int param3) {
        boolean stackIn_19_1 = false;
        MusicPatchNode stackIn_19_2 = null;
        Object stackIn_20_0;
        boolean stackIn_20_3;
        MusicPatchNode var5;
        int var6_int;
        PcmSample var6;
        MusicPatchNode var7;
        MusicPatchNode var8;
        int var9;
        MusicPatch var10;
        MusicPatch var11;
        var9 = Kickabout.field_G;
        this.noteOff((byte) -50, param2, param3, 64);
        if ((this.field_i[param3] & 2) != 0) {
          var5 = (MusicPatchNode) (this.field_m.field_j.last(param0 ^ -9065));
          while (var5 != null) {
            if (~var5.field_q == ~param3 &&
              0 > var5.field_s) {
              this.field_O[param3][var5.field_e] = null;
              this.field_O[param3][param2] = var5;
              var6_int = var5.field_D + (var5.field_p * var5.field_n >> 12);
              var5.field_D = var5.field_D + (param2 - var5.field_e << 8);
              var5.field_e = param2;
              var5.field_n = -var5.field_D + var6_int;
              var5.field_p = 4096;
              return;
            }
            var5 = (MusicPatchNode) (this.field_m.field_j.e(33));
          }
        }
        var10 = (MusicPatch) (this.field_w.a(true, (long)this.channelPrograms[param3]));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_l[param2];
        if (var6 == null) {
          return;
        }
        var7 = new MusicPatchNode();
        var7.field_y = var6;
        if (param0 != 32) {
          return;
        }
        var7.field_q = param3;
        var7.field_g = var10;
        var7.field_j = var10.field_e[param2];
        var7.field_E = var10.field_p[param2];
        var7.field_e = param2;
        var7.field_C = var10.field_n[param2] * (param1 * param1) * var11.field_j + 1024 >> 11;
        var7.field_A = var10.field_k[param2] & 255;
        var7.field_D = (param2 << 8) - (32767 & var10.field_r[param2]);
        var7.field_f = 0;
        var7.field_l = 0;
        var7.field_t = 0;
        var7.field_s = -1;
        var7.field_v = 0;
        if (0 != this.sampleOffsets[param3]) {
          var7.field_F = PcmSampleStream.createAtFixedStep(var6, this.computeNoteStep(var7, -5), 0, this.computeNotePan(true, var7));
          stackIn_19_1 = false;
          stackIn_19_2 = var7;
          if (var11.field_r[param2] >= 0) {
            stackIn_20_0 = this;
            stackIn_20_3 = false;
          } else {
            stackIn_20_0 = this;
            stackIn_20_3 = true;
          }
          this.applySampleOffset(stackIn_19_1, stackIn_19_2, stackIn_20_3);
        } else {
          var7.field_F = PcmSampleStream.createAtFixedStep(var6, this.computeNoteStep(var7, -5), this.computeNoteVolume(-101, var7), this.computeNotePan(true, var7));
        }
        if (var11.field_r[param2] < 0) {
          var7.field_F.setLoopCount(-1);
        }
        if (var7.field_E >= 0) {
          var8 = this.field_Q[param3][var7.field_E];
          if (var8 != null &&
            0 > var8.field_s) {
            this.field_O[param3][var8.field_e] = null;
            var8.field_s = 0;
          }
          this.field_Q[param3][var7.field_E] = var7;
        }
        this.field_m.field_j.addLast(var7, 3);
        this.field_O[param3][param2] = var7;
        return;
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Kickabout.field_G;
        try {
          if (this.field_k.hasData()) {
            var4_int = this.playbackTimeScale * this.field_k.field_h / PcmPlayerService.sampleRate;
            while (true) {
              var5 = (long)var4_int * (long)param2 + this.field_D;
              if (this.field_P - var5 >= 0L) {
                this.field_D = var5;
                break;
              }
              var7 = (int)((-1L + (long)var4_int + (this.field_P - this.field_D)) / (long)var4_int);
              this.field_D = this.field_D + (long)var7 * (long)var4_int;
              this.field_m.mixInto(param0, param1, var7);
              param1 = param1 + var7;
              this.advanceMidiEvents(4204);
              param2 = param2 - var7;
              if (!this.field_k.hasData()) {
                break;
              }
            }
          }
          this.field_m.mixInto(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ru.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void applySampleOffset(boolean param0, MusicPatchNode param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param1.field_y.field_i.length;
          if (param0) {
            return;
          }
          if (param2 &&
            param1.field_y.field_g) {
            var6 = -param1.field_y.field_h + (var4_int + var4_int);
            var4_int = var4_int << 8;
            var5 = (int)((long)this.sampleOffsets[param1.field_q] * (long)var6 >> 6);
            if (var5 >= var4_int) {
              var5 = var4_int + var4_int - (1 + var5);
              param1.field_F.setReversePlayback(true);
            }
          } else {
            var5 = (int)((long)this.sampleOffsets[param1.field_q] * (long)var4_int >> 6);
          }
          param1.field_F.setSamplePositionFixed(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ru.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean prepareTrackSamples(int param0, int param1, ResourceArchive param2, SoundCache param3, MusicTrack param4) {
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
        var11 = Kickabout.field_G;
        try {
          param4.buildNoteMasks();
          var6_int = 1;
          var7 = null;
          if (param1 > 0) {
            var7 = new int[]{param1};
          }
          if (param0 != 1) {
            this.field_m = (MusicPatchPcmStream) null;
          }
          var8 = (InstrumentNoteMask) (param4.field_f.b(param0 - 1));
          while (var8 != null) {
            var9 = (int)var8.field_a;
            var10 = (MusicPatch) (this.field_w.a(true, (long)var9));
            if (var10 == null) {
              var10 = ReceivedAuctionItemRow.a(param2, var9, 116);
              if (var10 != null) {
                this.field_w.put(var10, param0 ^ 124, (long)var9);
              } else {
                var6_int = 0;
              }
            }
            if (var10 != null &&
              !var10.prepareSamples(param3, (int[]) (var7), (byte) 123, var8.field_g)) {
              var6_int = 0;
            }
            var8 = (InstrumentNoteMask) (param4.field_f.a(param0 ^ -2));
          }
          if (var6_int != 0) {
            param4.releaseNoteMasks();
          }
          stackIn_19_0 = var6_int;
          return stackIn_19_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("ru.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final int computeNotePan(boolean param0, MusicPatchNode param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.field_m = (MusicPatchPcmStream) null;
          }
          var3_int = this.channelPan[param1.field_q];
          if (var3_int >= 8192) {
            stackIn_6_0 = 16384 - ((-var3_int + 16384) * (128 - param1.field_A) + 32 >> 6);
            return stackIn_6_0;
          }
          stackIn_4_0 = 32 + var3_int * param1.field_A >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ru.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void allSoundOff(int param0, int param1) {
        MusicPatchNode var3;
        int var4;
        var4 = Kickabout.field_G;
        if (param1 != 100) {
          this.applyInitialProgram(15, 115, (byte) 81);
        }
        var3 = (MusicPatchNode) (this.field_m.field_j.g(24009));
        while (var3 != null) {
          if (param0 < 0 ||
            var3.field_q == param0) {
            if (var3.field_F != null) {
              var3.field_F.fadeOutAndUnlink(PcmPlayerService.sampleRate / 100);
              if (var3.field_F.hasRemainingRampFrames()) {
                this.field_m.field_i.addSubStream(var3.field_F);
              }
              var3.clearReferences(true);
            }
            if (0 > var3.field_s) {
              this.field_O[var3.field_q][var3.field_e] = null;
            }
            var3.c((byte) -109);
          }
          var3 = (MusicPatchNode) (this.field_m.field_j.c(33));
        }
    }

    private final void resetControllers(int param0, int param1) {
        int var4;
        var4 = Kickabout.field_G;
        if (param0 < 0) {
          for (param0 = 0; 16 > param0; param0++) {
            this.resetControllers(param0, 73);
          }
        } else {
          this.channelVolume[param0] = 12800;
          if (param1 <= 66) {
            this.handleChannelPressure(-112, 41, 103);
          }
          this.channelPan[param0] = 8192;
          this.channelExpression[param0] = 16383;
          this.pitchBend[param0] = 8192;
          this.modulation[param0] = 0;
          this.portamentoTime[param0] = 8192;
          this.releasePortamentoNotes(-1, param0);
          this.resetRetriggerPhase(-28723, param0);
          this.field_i[param0] = 0;
          this.field_z[param0] = 32767;
          this.pitchBendSensitivity[param0] = 256;
          this.sampleOffsets[param0] = 0;
          this.setRetriggerRate(param0, 8192, 110);
        }
    }

    final boolean updateNote(int param0, int param1, int param2, MusicPatchNode param3, int[] param4) {
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        InstrumentEnvelope var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_32_0Lifetime1;
        int stackIn_32_1Lifetime1;
        int stackIn_50_0Lifetime1;
        int stackIn_50_1Lifetime1;
        var11 = Kickabout.field_G;
        try {
          param3.field_B = PcmPlayerService.sampleRate / 100;
          if (param3.field_s >= 0 && (param3.field_F == null ||
            param3.field_F.isSamplePositionOutOfRange())) {
            param3.clearReferences(true);
            param3.c((byte) -109);
            if (0 < param3.field_E) {
              if (this.field_Q[param3.field_q][param3.field_E] != param3) {
                return true;
              }
              this.field_Q[param3.field_q][param3.field_E] = null;
            }
            return true;
          }
          var6_int = param3.field_p;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.portamentoTime[param3.field_q]) + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param3.field_p = var6_int;
          }
          param3.field_F.setSampleStepMagnitude(this.computeNoteStep(param3, -5));
          var7 = param3.field_j;
          var8 = 0;
          param3.field_w = param3.field_w + 1;
          param3.field_z = param3.field_z + var7.field_h;
          var9 = 0.000005086263020833333 * (double)((param3.field_p * param3.field_n >> 12) + (param3.field_e - 60 << 8));
          if (var7.field_n > 0) {
            if (var7.field_g <= 0) {
              param3.field_f = param3.field_f + 128;
            } else {
              param3.field_f = param3.field_f + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_g) + 0.5);
            }
            if (819200 <= param3.field_f * var7.field_n) {
              var8 = 1;
            }
          }
          if (var7.field_m != null) {
            if (0 >= var7.field_e) {
              param3.field_v = param3.field_v + 128;
            } else {
              param3.field_v = param3.field_v + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_e) + 0.5);
            }
            while (true) {
              if ((var7.field_m.length - 2) > param3.field_t) {
                stackIn_32_0 = param3.field_v;
                stackIn_32_1 = var7.field_m[param3.field_t + 2] << 8 & 65280;
                if (stackIn_32_0 > stackIn_32_1) {
                  param3.field_t = param3.field_t + 2;
                  continue;
                }
              }
              stackIn_32_0Lifetime1 = var7.field_m.length - 2;
              stackIn_32_1Lifetime1 = param3.field_t;
              if (stackIn_32_0Lifetime1 != stackIn_32_1Lifetime1) {
                break;
              }
              if (var7.field_m[1 + param3.field_t] != 0) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (param3.field_s >= 0 &&
            null != var7.field_b &&
            (this.field_i[param3.field_q] & 1) == 0 && (!(param3.field_E >= 0) ||
            param3 != this.field_Q[param3.field_q][param3.field_E])) {
            if (var7.field_l > 0) {
              param3.field_s = param3.field_s + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
            } else {
              param3.field_s = param3.field_s + 128;
            }
            while (true) {
              if ((-2 + var7.field_b.length) > param3.field_l) {
                stackIn_50_0 = ~(var7.field_b[param3.field_l + 2] << 8 & 65280);
                stackIn_50_1 = ~param3.field_s;
                if (stackIn_50_0 > stackIn_50_1) {
                  param3.field_l = param3.field_l + 2;
                  continue;
                }
              }
              stackIn_50_0Lifetime1 = param3.field_l;
              stackIn_50_1Lifetime1 = -2 + var7.field_b.length;
              if (stackIn_50_0Lifetime1 != stackIn_50_1Lifetime1) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (param0 >= -26) {
            return true;
          }
          if (var8 == 0) {
            param3.field_F.rampVolumeAndPan(param3.field_B, this.computeNoteVolume(55, param3), this.computeNotePan(true, param3));
            return false;
          }
          param3.field_F.fadeOutAndUnlink(param3.field_B);
          if (param4 == null) {
            param3.field_F.skipFrames(param1);
          } else {
            param3.field_F.mixInto(param4, param2, param1);
          }
          if (param3.field_F.hasRemainingRampFrames()) {
            this.field_m.field_i.addSubStream(param3.field_F);
          }
          param3.clearReferences(true);
          if (0 <= param3.field_s) {
            param3.c((byte) -109);
            if (param3.field_E > 0 &&
              param3 == this.field_Q[param3.field_q][param3.field_E]) {
              this.field_Q[param3.field_q][param3.field_E] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_74_0 = var6;
          stackIn_74_1 = new StringBuilder().append("ru.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',');
          if (param4 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(')').toString());
        }
    }

    private final synchronized void stopTrack(byte param0, boolean param1) {
        this.field_k.clear();
        if (param0 > -109) {
          field_C = 94;
        }
        this.field_x = null;
        this.resetSynthesizer(param1, false);
    }

    private final void resetSynthesizer(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        int var3Lifetime1;
        if (param0) {
          this.allSoundOff(-1, 100);
        } else {
          this.allNotesOff(-60, -1);
        }
        this.resetControllers(-1, 124);
        if (param1) {
          this.releasePortamentoNotes(86, -61);
        }
        for (var3 = 0; var3 < 16; var3++) {
          this.channelPrograms[var3] = this.initialPrograms[var3];
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.channelBanks[var5] = TextLayoutLine.b(-128, this.initialPrograms[var5]);
          var5++;
        }
    }

    private final void setRetriggerRate(int param0, int param1, int param2) {
        this.retriggerRates[param0] = param1;
        this.field_o[param0] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1) + 0.5);
        if (param2 < 48) {
          this.stop(-2);
        }
    }

    private final void allNotesOff(int param0, int param1) {
        MusicPatchNode var3;
        int var4;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_0Lifetime1;
        int stackIn_10_1Lifetime1;
        var4 = Kickabout.field_G;
        var3 = (MusicPatchNode) (this.field_m.field_j.g(24009));
        while (var3 != null) {
          stackIn_10_0 = 0;
          stackIn_10_1 = param1;
          if ((stackIn_10_0 > stackIn_10_1 ||
            ~param1 == ~var3.field_q) &&
            0 > var3.field_s) {
            this.field_O[var3.field_q][var3.field_e] = null;
            var3.field_s = 0;
          }
          var3 = (MusicPatchNode) (this.field_m.field_j.c(33));
        }
        stackIn_10_0Lifetime1 = param0;
        stackIn_10_1Lifetime1 = -8;
        if (stackIn_10_0Lifetime1 > stackIn_10_1Lifetime1) {
          this.dispatchMidiEvent(4, -110);
        }
        return;
    }

    final synchronized void setChannelGain(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = Kickabout.field_G;
        if (~param0 > param1) {
          for (var4 = 0; var4 < 16; var4++) {
            this.channelGains[var4] = param2;
          }
        } else {
          this.channelGains[param0] = param2;
        }
    }

    final synchronized void stop(int param0) {
        if (param0 != 21404) {
          return;
        }
        this.stopTrack((byte) -114, true);
    }

    private final void resetRetriggerPhase(int param0, int param1) {
        MusicPatchNode var3 = null;
        int var4 = Kickabout.field_G;
        if (param0 != -28723) {
          this.channelGains = (int[]) null;
        }
        if ((4 & this.field_i[param1]) != 0) {
          var3 = (MusicPatchNode) (this.field_m.field_j.g(24009));
          while (var3 != null) {
            if (param1 == var3.field_q) {
              var3.field_r = 0;
            }
            var3 = (MusicPatchNode) (this.field_m.field_j.c(33));
          }
        }
    }

    final synchronized void skipFrames(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted0 = true;
        var6 = Kickabout.field_G;
        if (this.field_k.hasData()) {
          var2 = this.playbackTimeScale * this.field_k.field_h / PcmPlayerService.sampleRate;
          while (true) {
            var3 = this.field_D + (long)param0 * (long)var2;
            if (-var3 + this.field_P >= 0L) {
              this.field_D = var3;
              break;
            }
            var5 = (int)((-1L + this.field_P - this.field_D + (long)var2) / (long)var2);
            this.field_D = this.field_D + (long)var2 * (long)var5;
            param0 = param0 - var5;
            this.field_m.skipFrames(var5);
            this.advanceMidiEvents(4204);
            if (this.field_k.hasData()) {
              continue;
            }
            this.field_m.skipFrames(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if (decompiledFrameCompleted0) {
          this.field_m.skipFrames(param0);
        }

    }

    private final void changeProgram(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        if (param1 != 128) {
          return;
        }
        if (param0 != this.channelPrograms[param2]) {
          this.channelPrograms[param2] = param0;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_Q[param2][var4] = null;
          }
        }
    }

    final static void drawGoalScenery(boolean param0, byte param1) {
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_48_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        var10 = Kickabout.field_G;
        try {
          if (FadingSoundPlayer.field_q) {
            return;
          }
          var2 = null;
          var3 = MySquadScreen.worldToScreenX(-93, 359);
          if (param0) {
            stackIn_7_0 = PitchProjectionSupport.worldToScreenY(0, (byte) -56);
          } else {
            stackIn_7_0 = PitchProjectionSupport.worldToScreenY(1344, (byte) -56);
          }
          var4 = stackIn_7_0;
          if (RankingsScreen.field_C != 0) {
            if (RankingsScreen.field_C != 1) {
              if (RankingsScreen.field_C > 2) {
                if (RankingsScreen.field_C == 3) {
                  if (!param0) {
                    var2 = IntrusiveNodeHashTable.field_g[0];
                    var4 = var4 - (InstrumentNoteMask.field_i * 58 >> 8);
                  } else {
                    var2 = IntrusiveNodeHashTable.field_g[1];
                    var4 = var4 - (InstrumentNoteMask.field_i * 97 >> 8);
                  }
                }
              } else {
                var4 = var4 - (55 * InstrumentNoteMask.field_i >> 8);
                var2 = IntrusiveNodeHashTable.field_g[2];
                if (!param0) {
                  var4 = var4 - (InstrumentNoteMask.field_i * 5 >> 8);
                }
              }
            } else {
              var4 = var4 - (InstrumentNoteMask.field_i * 62 >> 8);
              var2 = IntrusiveNodeHashTable.field_g[3];
              if (!param0) {
                var4 = var4 - (5 * InstrumentNoteMask.field_i >> 8);
              }
            }
          } else {
            if (FormationMaskSupport.field_c == 0) {
              stackIn_12_0 = var4;
              if (param0) {
                stackIn_13_1 = 53;
              } else {
                stackIn_13_1 = 64;
              }
              var4 = stackIn_12_0 - (stackIn_13_1 * InstrumentNoteMask.field_i >> 8);
              var2 = IntrusiveNodeHashTable.field_g[6];
            }
            if (FormationMaskSupport.field_c == 1) {
              var2 = IntrusiveNodeHashTable.field_g[5];
              stackIn_18_0 = var4;
              stackIn_18_1 = InstrumentNoteMask.field_i;
              if (param0) {
                stackIn_19_2 = 62;
              } else {
                stackIn_19_2 = 72;
              }
              var4 = stackIn_18_0 - (stackIn_18_1 * stackIn_19_2 >> 8);
            }
            if (FormationMaskSupport.field_c == 2) {
              var2 = IntrusiveNodeHashTable.field_g[4];
              stackIn_24_0 = var4;
              if (param0) {
                stackIn_25_1 = 68;
              } else {
                stackIn_25_1 = 72;
              }
              var4 = stackIn_24_0 - (stackIn_25_1 * InstrumentNoteMask.field_i >> 8);
            }
          }
          if (param0 &&
            3 == RankingsScreen.field_C) {
            var5 = PitchProjectionSupport.worldToScreenY(-87, (byte) -56);
            for (var6 = 0; var6 < 5; var6++) {
              ListRow.a(-12376, MySquadScreen.worldToScreenX(-121, (-5 + MatchingTextValidator.field_k.field_o) * var6 - 32), var5, MatchingTextValidator.field_k);
            }
          }
          if (FormationMaskSupport.field_c == 2) {
            var5Lifetime1 = MySquadScreen.worldToScreenX(-105, -47);
            var6Lifetime1 = MySquadScreen.worldToScreenX(param1 + 94, 892);
            stackIn_48_0 = (!param0) ? 0 : 3;
            var7 = stackIn_48_0;
            for (var8 = 0; 5 > var8; var8++) {
              var9 = PitchProjectionSupport.worldToScreenY(var8 * 290 - 40, (byte) -56);
              ListRow.a(-12376, var5Lifetime1, var9, AppletContextSupport.field_d[0 + var7]);
              ListRow.a(-12376, var6Lifetime1, var9, AppletContextSupport.field_d[1 + var7]);
            }
          }
          ListRow.a(-12376, var3, var4, (Sprite) (var2));
          if (param1 != -114) {
            field_M = (IntrusiveDeque) null;
          }
          if (!param0 &&
            3 == RankingsScreen.field_C) {
            var5Lifetime2 = PitchProjectionSupport.worldToScreenY(1384, (byte) -56);
            for (var6Lifetime2 = 0; var6Lifetime2 < 5; var6Lifetime2++) {
              ListRow.a(param1 - 12262, MySquadScreen.worldToScreenX(-126, var6Lifetime2 * (-5 + MatchingTextValidator.field_k.field_o) - 32), var5Lifetime2, MatchingTextValidator.field_k);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) (var2), "ru.I(" + param0 + ',' + param1 + ')');
        }
    }

    private final void noteOff(byte param0, int param1, int param2, int param3) {
        MusicPatchNode var6;
        int var7;
        MusicPatchNode var8;
        var7 = Kickabout.field_G;
        if (param0 > -16) {
          field_t = (String) null;
        }
        var8 = this.field_O[param2][param1];
        if (var8 == null) {
          return;
        }
        {
          this.field_O[param2][param1] = null;
          if ((this.field_i[param2] & 2) != 0) {
            var6 = (MusicPatchNode) (this.field_m.field_j.g(24009));
            while (var6 != null) {
              if (var6.field_q == var8.field_q &&
                0 > var6.field_s &&
                var6 != var8) {
                var8.field_s = 0;
                break;
              }
              var6 = (MusicPatchNode) (this.field_m.field_j.c(33));
            }
          } else {
            var8.field_s = 0;
          }
        }
    }

    private final void applyInitialProgram(int param0, int param1, byte param2) {
        this.initialPrograms[param0] = param1;
        this.channelBanks[param0] = TextLayoutLine.b(param1, -128);
        this.changeProgram(param1, param2 ^ 164, param0);
        if (param2 != 36) {
          this.firstSubstream();
        }
    }

    final synchronized PcmStream firstSubstream() {
        return (PcmStream) ((Object) this.field_m);
    }

    private final void releasePortamentoNotes(int param0, int param1) {
        MusicPatchNode var3 = null;
        int var4 = Kickabout.field_G;
        if (param0 != -1) {
          return;
        }
        if (0 != (2 & this.field_i[param1])) {
          var3 = (MusicPatchNode) (this.field_m.field_j.g(24009));
          while (var3 != null) {
            if (param1 == var3.field_q &&
              this.field_O[param1][var3.field_e] == null &&
              var3.field_s < 0) {
              var3.field_s = 0;
            }
            var3 = (MusicPatchNode) (this.field_m.field_j.c(33));
          }
        }
    }

    private final void advanceMidiEvents(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_28_0Lifetime1;
        int stackIn_28_1Lifetime1;
        var7 = Kickabout.field_G;
        if (param0 != 4204) {
          this.allSoundOff(-128, -34);
        }
        var2 = this.field_K;
        var3 = this.field_H;
        var4 = this.field_P;
        if (this.field_x != null &&
          this.field_N == var3) {
          this.startTrack(this.field_x, this.field_F, (byte) 101, this.field_r);
          this.advanceMidiEvents(4204);
          return;
        }
        scanLoop1: while (true) {
          stackIn_7_0 = this.field_H;
          stackIn_7_1 = var3;
          if (stackIn_7_0 == stackIn_7_1) {
            while (true) {
              stackIn_28_0 = this.field_k.field_e[var2];
              stackIn_28_1 = var3;
              if (stackIn_28_0 == stackIn_28_1) {
                this.field_k.seekTrack(var2);
                var6 = this.field_k.readMessage(var2);
                stackIn_7_0 = 1;
                stackIn_7_1 = var6;
                if (stackIn_7_0 != stackIn_7_1) {
                  if ((var6 & 128) != 0) {
                    this.dispatchMidiEvent(5, var6);
                  }
                  this.field_k.readDelta(var2);
                  this.field_k.saveTrackPosition(var2);
                  continue;
                }
                this.field_k.markTrackDone();
                this.field_k.saveTrackPosition(var2);
                if (this.field_k.isDone()) {
                  if (this.field_x != null) {
                    this.playTrack(this.field_r, 19134, this.field_x);
                    this.advanceMidiEvents(param0 ^ 0);
                    return;
                  }
                  if (this.field_r &&
                    var3 != 0) {
                    this.field_k.reset(var4);
                  } else {
                    this.resetSynthesizer(true, false);
                    this.field_k.clear();
                    return;
                  }
                }
              }
              break;
            }
            var2 = this.field_k.nextTrack();
            var3 = this.field_k.field_e[var2];
            var4 = this.field_k.timeAtTick(var3);
            continue scanLoop1;
          }
          break;
        }
        this.field_H = var3;
        this.field_K = var2;
        this.field_P = var4;
        if (null == this.field_x) {
          return;
        }
        stackIn_28_0Lifetime1 = ~this.field_N;
        stackIn_28_1Lifetime1 = ~var3;
        if (stackIn_28_0Lifetime1 > stackIn_28_1Lifetime1) {
          this.field_K = -1;
          this.field_H = this.field_N;
          this.field_P = this.field_k.timeAtTick(this.field_H);
        }
        return;
    }

    final boolean removeNoteWithoutStream(int param0, MusicPatchNode param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -25102) {
            this.field_m = (MusicPatchPcmStream) null;
          }
          if (param1.field_F != null) {
            return false;
          }
          if (param1.field_s >= 0) {
            param1.c((byte) -109);
            if (param1.field_E > 0 &&
              this.field_Q[param1.field_q][param1.field_E] == param1) {
              this.field_Q[param1.field_q][param1.field_E] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ru.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final int computeNoteVolume(int param0, MusicPatchNode param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        InstrumentEnvelope var10 = null;
        InstrumentEnvelope var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          if (this.channelGains[param1.field_q] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var10 = param1.field_j;
          var11 = var10;
          var4 = this.channelExpression[param1.field_q] * this.channelVolume[param1.field_q] + 4096 >> 13;
          var5 = 60 % ((param0 + 15) / 38);
          var4 = 16384 + var4 * var4 >> 15;
          var4 = param1.field_C * var4 + 16384 >> 15;
          var4 = this.field_u * var4 + 128 >> 8;
          var4 = var4 * this.channelGains[param1.field_q] + 128 >> 8;
          if (var11.field_n > 0) {
            var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)var11.field_n * (0.00001953125 * (double)param1.field_f)));
          }
          if (var11.field_m != null) {
            var6 = param1.field_v;
            var7 = var11.field_m[1 + param1.field_t];
            if (param1.field_t < (-2 + var11.field_m.length)) {
              var8 = var10.field_m[param1.field_t] << 8 & 65280;
              var9 = var11.field_m[param1.field_t + 2] << 8 & 65280;
              var7 = var7 + (var6 - var8) * (var11.field_m[param1.field_t + 3] - var7) / (var9 - var8);
            }
            var4 = var4 * var7 + 32 >> 6;
          }
          if (param1.field_s > 0 &&
            var11.field_b != null) {
            var6Lifetime1 = param1.field_s;
            var7Lifetime1 = var11.field_b[param1.field_l + 1];
            if (param1.field_l < var11.field_b.length - 2) {
              var8Lifetime1 = (var10.field_b[param1.field_l] & 255) << 8;
              var9Lifetime1 = (255 & var11.field_b[2 + param1.field_l]) << 8;
              var7Lifetime1 = var7Lifetime1 + (-var7Lifetime1 + var11.field_b[3 + param1.field_l]) * (var6Lifetime1 - var8Lifetime1) / (var9Lifetime1 - var8Lifetime1);
            }
            var4 = var4 * var7Lifetime1 + 32 >> 6;
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("ru.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void setPitchBend(int param0, int param1, int param2) {
        this.pitchBend[param1] = param2;
        if (param0 < 20) {
          this.getSchedulingCost();
        }
    }

    public static void releaseStatics(byte param0) {
        int var1 = -114 / ((34 - param0) / 59);
        field_t = null;
        field_l = null;
        field_M = null;
    }

    public MidiPcmStream() {
        this.channelPan = new int[16];
        this.field_i = new int[16];
        this.field_Q = new MusicPatchNode[16][128];
        this.field_z = new int[16];
        this.field_u = 256;
        this.sampleOffsets = new int[16];
        this.channelBanks = new int[16];
        this.initialPrograms = new int[16];
        this.channelVolume = new int[16];
        this.channelExpression = new int[16];
        this.retriggerRates = new int[16];
        this.playbackTimeScale = 1000000;
        this.modulation = new int[16];
        this.field_O = new MusicPatchNode[16][128];
        this.channelGains = new int[16];
        this.channelPrograms = new int[16];
        this.pitchBend = new int[16];
        this.portamentoTime = new int[16];
        this.pitchBendSensitivity = new int[16];
        this.field_o = new int[16];
        this.field_k = new MidiFileReader();
        this.field_m = new MusicPatchPcmStream(this);
        this.field_w = new IntrusiveNodeHashTable(128);
        this.setChannelGain(-1, -1, 256);
        this.resetSynthesizer(true, false);
    }

    MidiPcmStream(MidiPcmStream param0) {
        this.channelPan = new int[16];
        this.field_i = new int[16];
        this.field_Q = new MusicPatchNode[16][128];
        this.field_z = new int[16];
        this.field_u = 256;
        this.sampleOffsets = new int[16];
        this.channelBanks = new int[16];
        this.initialPrograms = new int[16];
        this.channelVolume = new int[16];
        this.channelExpression = new int[16];
        this.retriggerRates = new int[16];
        this.playbackTimeScale = 1000000;
        this.modulation = new int[16];
        this.field_O = new MusicPatchNode[16][128];
        this.channelGains = new int[16];
        this.channelPrograms = new int[16];
        this.pitchBend = new int[16];
        this.portamentoTime = new int[16];
        this.pitchBendSensitivity = new int[16];
        this.field_o = new int[16];
        this.field_k = new MidiFileReader();
        this.field_m = new MusicPatchPcmStream(this);
        try {
          this.field_w = param0.field_w;
          this.setChannelGain(-1, -1, 256);
          this.resetSynthesizer(true, false);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ru.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = new Random();
        field_M = new IntrusiveDeque();
        field_t = "Click or press F10 to open Quick Chat";
    }
}
