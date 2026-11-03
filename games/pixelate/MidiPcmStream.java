/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiPcmStream extends PcmStream {
    int[] channelSampleOffset;
    private int[] channelExpression;
    private int[] channelPortamentoTime;
    private NodeHashTable patches;
    private int[] channelPitchBendRange;
    private MusicPatchNode[][] notesByGroup;
    private int[] channelVolume;
    static SceneWidget field_E;
    private int[] channelParameter;
    private int[] field_Q;
    private int[] channelModulation;
    private int[] channelBank;
    int[] channelFlags;
    private int field_v;
    private int[] field_y;
    static int field_t;
    private int[] field_S;
    int[] field_I;
    private int[] channelPan;
    private MusicPatchNode[][] field_G;
    private MidiFileReader midiReader;
    private int[] field_V;
    private int[] field_u;
    private int field_C;
    private boolean field_z;
    private int field_B;
    private long playbackTime;
    private int field_U;
    private long nextEventTime;
    private MusicPatchPcmStream field_N;
    private boolean field_s;
    private int field_O;
    private MusicTrack field_D;

    private final void b(int param0, int param1, int param2) {
        if (param2 != 1000000) {
          this.g(-41);
        }
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var7 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          if (this.midiReader.isReady()) {
            var4_int = this.midiReader.field_i * this.field_C / AudioOutput.field_h;
            while (true) {
              var5 = (long)param2 * (long)var4_int + this.playbackTime;
              if (0L <= this.nextEventTime - var5) {
                this.playbackTime = var5;
                break;
              }
              var7 = (int)(((long)var4_int + (-this.playbackTime + this.nextEventTime - 1L)) / (long)var4_int);
              this.playbackTime = this.playbackTime + (long)var4_int * (long)var7;
              this.field_N.mixInto(param0, param1, var7);
              param1 = param1 + var7;
              this.dispatchDueMidiMessages(-111);
              param2 = param2 - var7;
              if (this.midiReader.isReady()) {
                continue;
              }
              this.field_N.mixInto(param0, param1, param2);
              return;
            }
          }
          this.field_N.mixInto(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ti.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void setChannelGain(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = Pixelate.field_H ? 1 : 0;
        if (param1) {
          this.firstSubStream();
        }
        if (param2 < 0) {
          for (var4 = 0; 16 > var4; var4++) {
            this.field_S[var4] = param0;
          }
        } else {
          this.field_S[param2] = param0;
        }
    }

    final boolean discardInactiveVoice(MusicPatchNode param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 75) {
            return false;
          }
          if (null != param0.field_G) {
            return false;
          }
          if (param0.field_v < 0) {
            return true;
          }
          param0.unlink(param1 ^ 2704);
          if (param0.field_y > 0 &&
            param0 == this.notesByGroup[param0.field_I][param0.field_y]) {
            this.notesByGroup[param0.field_I][param0.field_y] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ti.RA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void allNotesOff(byte param0, int param1) {
        MusicPatchNode var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param0 <= 66) {
          this.field_z = false;
        }
        var3 = (MusicPatchNode) (this.field_N.field_r.c(1504642273));
        while (var3 != null) {
          if ((0 > param1 ||
            param1 == var3.field_I) &&
            0 > var3.field_v) {
            this.field_G[var3.field_I][var3.field_A] = null;
            var3.field_v = 0;
          }
          var3 = (MusicPatchNode) (this.field_N.field_r.last(1504642273));
        }
    }

    private final void allSoundOff(int param0, int param1) {
        int var4 = Pixelate.field_H ? 1 : 0;
        if (param1 != 0) {
          this.firstSubStream();
        }
        MusicPatchNode var3 = (MusicPatchNode) (this.field_N.field_r.c(1504642273));
        while (var3 != null) {
          if (param0 < 0 ||
            var3.field_I == param0) {
            if (var3.field_G != null) {
              var3.field_G.fadeOut(AudioOutput.field_h / 100);
              if (var3.field_G.hasRemainingRampFrames()) {
                this.field_N.field_o.a(var3.field_G);
              }
              var3.a(false);
            }
            if (!(var3.field_v >= 0)) {
              this.field_G[var3.field_I][var3.field_A] = null;
            }
            var3.unlink(2779);
          }
          var3 = (MusicPatchNode) (this.field_N.field_r.last(param1 + 1504642273));
        }
    }

    final synchronized boolean prepareTrack(MusicTrack param0, SoundCache param1, ResourceArchive param2, int param3, int param4) {
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
        qn var8 = null;
        int var9 = 0;
        int var11 = 0;
        MusicPatch var12 = null;
        MusicPatch var13 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          param0.buildPatchUsage();
          var6_int = 1;
          var7 = null;
          if (param4 > 0) {
            var7 = new int[]{param4};
          }
          var8 = (qn) (param0.patchUsage.a((byte) -109));
          while (var8 != null) {
            boolean decompiledFrameRemainder0 = true;
            var9 = (int)var8.field_e;
            var12 = (MusicPatch) (this.patches.a(-25484, (long)var9));
            if (var12 == null) {
              var13 = TabbedPanel.a(param2, var9, -30805);
              if (var13 == null) {
                var6_int = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.patches.a((long)var9, 124, var13);
                decompiledFrameRemainder0 = !(var13.prepareSamples(param1, (int[]) (var7), (byte) -52, var8.field_r));
              }
            } else {
              decompiledFrameRemainder0 = !(var12.prepareSamples(param1, (int[]) (var7), (byte) -52, var8.field_r));
            }
            if (decompiledFrameRemainder0) {
              var6_int = 0;
            }
            var8 = (qn) (param0.patchUsage.a(-119));
          }
          if (param3 <= 52) {
            return true;
          }
          if (var6_int != 0) {
            param0.releasePatchUsage();
          }
          stackIn_20_0 = var6_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ti.O(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int computeVoiceSpeed(int param0, MusicPatchNode param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        un var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param1.field_r + (param1.field_k * param1.field_z >> 12);
          if (param0 != -2003551188) {
            this.channelParameter = (int[]) null;
          }
          var3_int = var3_int + (this.channelPitchBendRange[param1.field_I] * (this.field_u[param1.field_I] - 8192) >> 12);
          var4 = param1.field_q;
          if (0 < var4.field_g && (!(var4.field_a <= 0) ||
            this.channelModulation[param1.field_I] > 0)) {
            var5 = var4.field_a << 2;
            var6 = var4.field_m << 1;
            if (var6 > param1.field_H) {
              var5 = param1.field_H * var5 / var6;
            }
            var5 = var5 + (this.channelModulation[param1.field_I] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(511 & param1.field_u));
            var3_int = var3_int + (int)((double)var5 * var7);
          }
          var5Lifetime1 = (int)(0.5 + (double)(param1.field_F.field_o * 256) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)AudioOutput.field_h);
          stackIn_13_0 = (var5Lifetime1 >= 1) ? var5Lifetime1 : 1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ti.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void d(int param0, int param1, int param2) {
        this.field_u[param1] = param0;
        if (param2 != -102) {
          this.field_u = (int[]) null;
        }
    }

    final static void a(int param0, String param1, String param2, byte param3, int param4, String param5) {
        aa var6 = null;
        if (param3 > -18) {
          return;
        }
        try {
          var6 = new aa(param4, param2, param0, param1, param5);
          vd.appendChatHistory(false, var6);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "ti.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final void setDefaultInstrumentAndBank(int param0, int param1, int param2) {
        this.field_V[param2] = param0;
        if (param1 != 4200) {
          this.channelVolume = (int[]) null;
        }
        this.channelBank[param2] = cm.bitAnd(-128, param0);
        this.selectChannelInstrument(param0, false, param2);
    }

    private final void resetState(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        int var3Lifetime1;
        if (param1) {
          this.allSoundOff(-1, 0);
        } else {
          this.allNotesOff((byte) 110, -1);
        }
        this.resetChannelControllers((byte) -67, -1);
        for (var3 = 0; var3 < 16; var3++) {
          this.field_y[var3] = this.field_V[var3];
        }
        if (param0 <= 71) {
          ResourceArchive var5 = (ResourceArchive) null;
          this.prepareTrack((MusicTrack) null, (SoundCache) null, (ResourceArchive) null, -121, -8);
        }
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < 16) {
          this.channelBank[var6] = cm.bitAnd(this.field_V[var6], -128);
          var6++;
        }
    }

    private final void noteOn(int param0, int param1, int param2, int param3) {
        boolean stackIn_16_1 = false;
        MusicPatchNode var5;
        int var6_int;
        PcmSample var6;
        MusicPatchNode var7;
        MusicPatchNode var8;
        int var9;
        ResourceArchive var10;
        MusicPatch var11;
        MusicPatch var12;
        var9 = Pixelate.field_H ? 1 : 0;
        this.noteOff(param1, 64, param0, (byte) 114);
        if ((this.channelFlags[param0] & 2) != 0) {
          var5 = (MusicPatchNode) (this.field_N.field_r.g(1504642273));
          while (var5 != null) {
            if (var5.field_I == param0 &&
              0 > var5.field_v) {
              this.field_G[param0][var5.field_A] = null;
              this.field_G[param0][param1] = var5;
              var6_int = (var5.field_z * var5.field_k >> 12) + var5.field_r;
              var5.field_r = var5.field_r + (param1 - var5.field_A << 8);
              var5.field_z = 4096;
              var5.field_k = var6_int - var5.field_r;
              var5.field_A = param1;
              return;
            }
            var5 = (MusicPatchNode) (this.field_N.field_r.j(0));
          }
        }
        var11 = (MusicPatch) (this.patches.a(-25484, (long)this.field_y[param0]));
        var12 = var11;
        if (var12 == null) {
          return;
        }
        var6 = var11.field_n[param1];
        if (var6 == null) {
          return;
        }
        var7 = new MusicPatchNode();
        var7.field_F = var6;
        var7.field_x = var12;
        var7.field_I = param0;
        var7.field_q = var11.field_l[param1];
        var7.field_y = var11.field_p[param1];
        var7.field_A = param1;
        var7.field_D = 1024 + var11.field_t[param1] * (param3 * param3) * var12.field_v >> 11;
        var7.field_C = 255 & var11.field_o[param1];
        var7.field_r = -(var11.field_u[param1] & 32767) + (param1 << 8);
        var7.field_w = 0;
        var7.field_o = 0;
        var7.field_v = -1;
        var7.field_l = 0;
        var7.field_m = 0;
        if (this.channelSampleOffset[param0] != 0) {
          var7.field_G = PcmSampleStream.createAtStepQ8(var6, this.computeVoiceSpeed(-2003551188, var7), 0, this.computeVoicePan(var7, (byte) -109));
          stackIn_16_1 = !(var12.field_u[param1] >= 0);
          this.applyNoteSampleOffset(stackIn_16_1, (byte) 118, var7);
        } else {
          var7.field_G = PcmSampleStream.createAtStepQ8(var6, this.computeVoiceSpeed(-2003551188, var7), this.computeVoiceGain(var7, (byte) -123), this.computeVoicePan(var7, (byte) 96));
        }
        if (var12.field_u[param1] < 0) {
          var7.field_G.setLoopCount(-1);
        }
        if (0 <= var7.field_y) {
          var8 = this.notesByGroup[param0][var7.field_y];
          if (var8 != null &&
            0 > var8.field_v) {
            this.field_G[param0][var8.field_A] = null;
            var8.field_v = 0;
          }
          this.notesByGroup[param0][var7.field_y] = var7;
        }
        this.field_N.field_r.addFirst(22125, var7);
        if (param2 >= -21) {
          var10 = (ResourceArchive) null;
          this.prepareTrack((MusicTrack) null, (SoundCache) null, (ResourceArchive) null, 79, -76);
        }
        this.field_G[param0][param1] = var7;
        return;
    }

    final static boolean a(int param0, char param1) {
        boolean stackIn_6_0 = false;
        if (param0 < 45) {
          return false;
        }
        stackIn_6_0 = (param1 >= 48) && (param1 <= 57);
        return stackIn_6_0;
    }

    final synchronized PcmStream firstSubStream() {
        return (PcmStream) ((Object) this.field_N);
    }

    private final void selectChannelInstrument(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        if (param0 != this.field_y[param2]) {
          this.field_y[param2] = param0;
          for (var4 = 0; var4 < 128; var4++) {
            this.notesByGroup[param2][var4] = null;
          }
        }
        if (param1) {
          this.allSoundOff(79, 96);
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        if (param0 <= 106) {
          this.field_G = (MusicPatchNode[][]) null;
        }
    }

    final void applyNoteSampleOffset(boolean param0, byte param1, MusicPatchNode param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        try {
          if (param1 != 118) {
            return;
          }
          var4_int = param2.field_F.field_n.length;
          if (param0 &&
            param2.field_F.field_m) {
            var6 = var4_int + var4_int - param2.field_F.field_l;
            var5 = (int)((long)var6 * (long)this.channelSampleOffset[param2.field_I] >> 6);
            var4_int = var4_int << 8;
            if (var5 >= var4_int) {
              param2.field_G.setReversePlayback(true);
              var5 = -var5 - 1 + (var4_int + var4_int);
            }
          } else {
            var5 = (int)((long)this.channelSampleOffset[param2.field_I] * (long)var4_int >> 6);
          }
          param2.field_G.setPosition(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ti.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        jd var1 = (jd) (ValidationIndicator.field_O.b(-88));
        if (var1 == null) {
          var1 = new jd();
        }
        if (param0) {
          MidiPcmStream.a(-80, 'ￆ');
        }
        var1.a(SoftwareRasterizer.field_k, SoftwareRasterizer.field_a, SoftwareRasterizer.field_d, SoftwareRasterizer.field_e, (byte) -102, SoftwareRasterizer.field_h, SoftwareRasterizer.field_f, SoftwareRasterizer.field_j);
        BirthDateEntryPanel.field_P.addFirst(22125, var1);
    }

    final boolean updateNote(int param0, MusicPatchNode param1, int param2, boolean param3, int[] param4) {
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        un var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          param1.field_E = AudioOutput.field_h / 100;
          if (param1.field_v >= 0 && (null == param1.field_G ||
            param1.field_G.isSamplePositionOutOfRange())) {
            param1.a(param3);
            param1.unlink(2779);
            if (param1.field_y > 0 &&
              this.notesByGroup[param1.field_I][param1.field_y] == param1) {
              this.notesByGroup[param1.field_I][param1.field_y] = null;
              return true;
            }
            return true;
          }
          var6_int = param1.field_z;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, (double)this.channelPortamentoTime[param1.field_I] * 0.0004921259842519685));
            if (var6_int < 0) {
              var6_int = 0;
            }
            param1.field_z = var6_int;
          }
          param1.field_G.setSampleStepMagnitude(this.computeVoiceSpeed(-2003551188, param1));
          var7 = param1.field_q;
          param1.field_u = param1.field_u + var7.field_g;
          param1.field_H = param1.field_H + 1;
          var8 = param3 ? 1 : 0;
          var9 = (double)((-60 + param1.field_A << 8) + (param1.field_z * param1.field_k >> 12)) * 0.000005086263020833333;
          if (0 < var7.field_e) {
            if (var7.field_i <= 0) {
              param1.field_l = param1.field_l + 128;
            } else {
              param1.field_l = param1.field_l + (int)(0.5 + Math.pow(2.0, (double)var7.field_i * var9) * 128.0);
            }
            if (param1.field_l * var7.field_e >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_b) {
            if (0 >= var7.field_f) {
              param1.field_o = param1.field_o + 128;
            } else {
              param1.field_o = param1.field_o + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_f * var9));
            }
            while (var7.field_b.length - 2 > param1.field_w) {
              if (param1.field_o > (65280 & var7.field_b[param1.field_w + 2] << 8)) {
                param1.field_w = param1.field_w + 2;
                continue;
              }
              break;
            }
            if (param1.field_w == var7.field_b.length - 2 &&
              var7.field_b[1 + param1.field_w] == 0) {
              var8 = 1;
            }
          }
          if (param1.field_v >= 0 &&
            null != var7.field_h &&
            (1 & this.channelFlags[param1.field_I]) == 0 && (!(param1.field_y >= 0) ||
            this.notesByGroup[param1.field_I][param1.field_y] != param1)) {
            if (var7.field_d > 0) {
              param1.field_v = param1.field_v + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_d * var9));
            } else {
              param1.field_v = param1.field_v + 128;
            }
            while (var7.field_h.length - 2 > param1.field_m) {
              if ((255 & var7.field_h[param1.field_m + 2]) << 8 < param1.field_v) {
                param1.field_m = param1.field_m + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.field_h.length == param1.field_m) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param1.field_G.rampVolumeAndPan(param1.field_E, this.computeVoiceGain(param1, (byte) -113), this.computeVoicePan(param1, (byte) 89));
            return false;
          }
          param1.field_G.fadeOut(param1.field_E);
          if (param4 == null) {
            param1.field_G.skip(param0);
          } else {
            param1.field_G.mixInto(param4, param2, param0);
          }
          if (param1.field_G.hasRemainingRampFrames()) {
            this.field_N.field_o.a(param1.field_G);
          }
          param1.a(param3);
          if (param1.field_v >= 0) {
            param1.unlink(2779);
            if (param1.field_y > 0 &&
              this.notesByGroup[param1.field_I][param1.field_y] == param1) {
              this.notesByGroup[param1.field_I][param1.field_y] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_67_0 = var6;
          stackIn_67_1 = new StringBuilder().append("ti.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    private final void resetChannelControllers(byte param0, int param1) {
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param1 < 0) {
          for (param1 = 0; param1 < 16; param1++) {
            this.resetChannelControllers((byte) -112, param1);
          }
        } else {
          this.channelVolume[param1] = 12800;
          this.channelPan[param1] = 8192;
          this.channelExpression[param1] = 16383;
          this.field_u[param1] = 8192;
          this.channelModulation[param1] = 0;
          this.channelPortamentoTime[param1] = 8192;
          if (param0 > -45) {
            this.handleMidiMessage(-56, -113);
          }
          this.b(param1, 16383);
          this.resetRetriggerPhase(true, param1);
          this.channelFlags[param1] = 0;
          this.channelParameter[param1] = 32767;
          this.channelPitchBendRange[param1] = 256;
          this.channelSampleOffset[param1] = 0;
          this.c(103, 8192, param1);
        }
    }

    public static void releaseStatics(int param0) {
        int var1 = -106 % ((34 - param0) / 60);
        field_E = null;
    }

    final synchronized int activity() {
        return 0;
    }

    final synchronized void playTrack(MusicTrack param0, int param1, boolean param2) {
        try {
          this.startTrack(param2, param0, true, 0);
          if (param1 != -39) {
            this.e(54);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "ti.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void c(int param0, int param1) {
        this.field_C = param0;
        if (param1 != 274191016) {
          ResourceArchive var4 = (ResourceArchive) null;
          this.prepareTrack((MusicTrack) null, (SoundCache) null, (ResourceArchive) null, -68, 6);
        }
    }

    private final void noteOff(int param0, int param1, int param2, byte param3) {
        MusicPatchNode var6;
        int var7;
        MusicPatchNode var8;
        var7 = Pixelate.field_H ? 1 : 0;
        var8 = this.field_G[param2][param0];
        if (var8 == null) {
          return;
        }
        this.field_G[param2][param0] = null;
        if (param3 <= 113) {
          return;
        }
        {
          if (0 != (2 & this.channelFlags[param2])) {
            var6 = (MusicPatchNode) (this.field_N.field_r.c(1504642273));
            while (var6 != null) {
              if (var6.field_I == var8.field_I &&
                0 > var6.field_v &&
                var6 != var8) {
                var8.field_v = 0;
                break;
              }
              var6 = (MusicPatchNode) (this.field_N.field_r.last(1504642273));
            }
          } else {
            var8.field_v = 0;
          }
        }
    }

    private final int computeVoiceGain(MusicPatchNode param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        un var10 = null;
        un var11 = null;
        int stackIn_2_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          if (0 == this.field_S[param0.field_I]) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var10 = param0.field_q;
          var11 = var10;
          var4 = 4096 + this.channelExpression[param0.field_I] * this.channelVolume[param0.field_I] >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          var4 = 16384 + var4 * param0.field_D >> 15;
          var4 = 128 + this.field_v * var4 >> 8;
          var4 = 128 + var4 * this.field_S[param0.field_I] >> 8;
          var5 = 78 % ((-76 - param1) / 35);
          if (var11.field_e > 0) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)var11.field_e * ((double)param0.field_l * 0.00001953125)) + 0.5);
          }
          if (var11.field_b != null) {
            var6 = param0.field_o;
            var7 = var11.field_b[param0.field_w + 1];
            if (param0.field_w < -2 + var11.field_b.length) {
              var8 = var10.field_b[param0.field_w] << 8 & 65280;
              var9 = (var11.field_b[param0.field_w + 2] & 255) << 8;
              var7 = var7 + (var6 - var8) * (var11.field_b[param0.field_w + 3] - var7) / (var9 - var8);
            }
            var4 = 32 + var7 * var4 >> 6;
          }
          if (0 < param0.field_v &&
            null != var11.field_h) {
            var6Lifetime1 = param0.field_v;
            var7Lifetime1 = var11.field_h[1 + param0.field_m];
            if (var11.field_h.length - 2 > param0.field_m) {
              var8Lifetime1 = 65280 & var10.field_h[param0.field_m] << 8;
              var9Lifetime1 = 65280 & var11.field_h[param0.field_m + 2] << 8;
              var7Lifetime1 = var7Lifetime1 + (var6Lifetime1 - var8Lifetime1) * (var11.field_h[3 + param0.field_m] - var7Lifetime1) / (var9Lifetime1 - var8Lifetime1);
            }
            var4 = var7Lifetime1 * var4 + 32 >> 6;
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ti.G(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void dispatchDueMidiMessages(int param0) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = Pixelate.field_H ? 1 : 0;
        var2 = this.field_U;
        if (param0 > -105) {
          this.b(100, -34);
        }
        var3 = this.field_B;
        var4 = this.nextEventTime;
        if (null != this.field_D &&
          this.field_O == var3) {
          this.startTrack(this.field_z, this.field_D, this.field_s, 0);
          this.dispatchDueMidiMessages(-113);
          return;
        }
        while (true) {
          if (this.field_B != var3) {
            this.field_B = var3;
            this.field_U = var2;
            this.nextEventTime = var4;
            if (this.field_D != null) {
              stackIn_23_0 = ~this.field_O;
              stackIn_23_1 = ~var3;
              if (stackIn_23_0 > stackIn_23_1) {
                this.field_B = this.field_O;
                this.field_U = -1;
                this.nextEventTime = this.midiReader.tickTime(this.field_B);
              }
            }
            return;
          }
          while (~this.midiReader.trackTicks[var2] == ~var3) {
            this.midiReader.seekTrack(var2);
            var6 = this.midiReader.readMessage(var2);
            if (1 != var6) {
              if ((var6 & 128) != 0) {
                this.handleMidiMessage(var6, -24232);
              }
              this.midiReader.readDelta(var2);
              this.midiReader.saveTrackPosition(var2);
              continue;
            }
            this.midiReader.markTrackDone();
            this.midiReader.saveTrackPosition(var2);
            if (this.midiReader.isDone()) {
              if (null != this.field_D) {
                this.playTrack(this.field_D, -39, this.field_z);
                this.dispatchDueMidiMessages(-106);
                return;
              }
              if (this.field_z &&
                var3 != 0) {
                this.midiReader.reset(var4);
              } else {
                this.resetState((byte) 99, true);
                this.midiReader.release();
                return;
              }
            }
            break;
          }
          var2 = this.midiReader.nextTrack();
          var3 = this.midiReader.trackTicks[var2];
          var4 = this.midiReader.tickTime(var3);
        }
    }

    private final int computeVoicePan(MusicPatchNode param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.channelPan[param0.field_I];
          var4 = -18 / ((param1 + 23) / 55);
          if (var3_int < 8192) {
            stackIn_4_0 = var3_int * param0.field_C + 32 >> 6;
            return stackIn_4_0;
          }
          stackIn_2_0 = 16384 - ((16384 - var3_int) * (-param0.field_C + 128) + 32 >> 6);
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ti.KA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized PcmStream nextSubStream() {
        return null;
    }

    final synchronized void skip(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        var6 = Pixelate.field_H ? 1 : 0;
        if (this.midiReader.isReady()) {
          var2 = this.field_C * this.midiReader.field_i / AudioOutput.field_h;
          while (true) {
            var3 = (long)var2 * (long)param0 + this.playbackTime;
            if (-var3 + this.nextEventTime >= 0L) {
              this.playbackTime = var3;
              break;
            }
            var5 = (int)((-1L + (this.nextEventTime - this.playbackTime + (long)var2)) / (long)var2);
            this.playbackTime = this.playbackTime + (long)var5 * (long)var2;
            param0 = param0 - var5;
            this.field_N.skip(var5);
            this.dispatchDueMidiMessages(-123);
            if (!this.midiReader.isReady()) {
              break;
            }
          }
        }
        this.field_N.skip(param0);
    }

    private final void b(int param0, int param1) {
        MusicPatchNode var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param1 != 16383) {
          return;
        }
        if ((2 & this.channelFlags[param0]) != 0) {
          var3 = (MusicPatchNode) (this.field_N.field_r.c(param1 + 1504625890));
          while (var3 != null) {
            if (var3.field_I == param0) {
              if (this.field_G[param0][var3.field_A] != null) {
                var3 = (MusicPatchNode) (this.field_N.field_r.last(1504642273));
                continue;
              }
              if (0 > var3.field_v) {
                var3.field_v = 0;
              }
            }
            var3 = (MusicPatchNode) (this.field_N.field_r.last(1504642273));
          }
        }
    }

    final synchronized void g(int param0) {
        this.stopTrack(125, true);
        int var2 = 127 / ((param0 - 78) / 45);
    }

    private final synchronized void startTrack(boolean param0, MusicTrack param1, boolean param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = Pixelate.field_H ? 1 : 0;
        try {
          this.stopTrack(param3 + 66, param2);
          this.midiReader.parse(param1.field_k);
          this.playbackTime = (long)param3;
          this.field_z = param0 ? true : false;
          var5_int = this.midiReader.d();
          for (var6 = 0; var6 < var5_int; var6++) {
            this.midiReader.seekTrack(var6);
            this.midiReader.readDelta(var6);
            this.midiReader.saveTrackPosition(var6);
          }
          this.field_U = this.midiReader.nextTrack();
          this.field_B = this.midiReader.trackTicks[this.field_U];
          this.nextEventTime = this.midiReader.tickTime(this.field_B);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "ti.SA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
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
        var8 = Pixelate.field_H ? 1 : 0;
        var3 = 240 & param0;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = param0 >> 8 & 127;
          var6 = 127 & param0 >> 16;
          this.noteOff(var5, var6, var4, (byte) 120);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = param0 & 15;
          var5Lifetime1 = (param0 & 32584) >> 8;
          var6Lifetime1 = (param0 & 8388537) >> 16;
          if (0 >= var6Lifetime1) {
            this.noteOff(var5Lifetime1, 64, var4Lifetime1, (byte) 115);
          } else {
            this.noteOn(var4Lifetime1, var5Lifetime1, -83, var6Lifetime1);
          }
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = param0 & 15;
          var5Lifetime2 = param0 >> 8 & 127;
          var6Lifetime2 = param0 >> 16 & 127;
          this.a((byte) 119, var5Lifetime2, var4Lifetime2, var6Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (var3 == 192) {
            var4Lifetime3 = 15 & param0;
            var5Lifetime3 = param0 >> 8 & 127;
            this.selectChannelInstrument(this.channelBank[var4Lifetime3] + var5Lifetime3, false, var4Lifetime3);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = param0 & 15;
            var5Lifetime3Lifetime1 = 127 & param0 >> 8;
            this.b(var5Lifetime3Lifetime1, var4Lifetime3Lifetime1, 1000000);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = param0 & 15;
            var5Lifetime3Lifetime2 = (127 & param0 >> 8) + (16256 & param0 >> 9);
            this.d(var5Lifetime3Lifetime2, var4Lifetime3Lifetime2, -102);
            return;
          }
          if (param1 != -24232) {
            return;
          }
          var3 = param0 & 255;
          if (var3 != 255) {
            return;
          }
          this.resetState((byte) 119, true);
          return;
        }
        var4Lifetime4 = param0 & 15;
        var5Lifetime4 = (param0 & 32655) >> 8;
        var6Lifetime3 = (8347431 & param0) >> 16;
        if (var5Lifetime4 == 0) {
          this.channelBank[var4Lifetime4] = cm.bitAnd(-2080769, this.channelBank[var4Lifetime4]) + (var6Lifetime3 << 14);
        }
        if (var5Lifetime4 == 32) {
          this.channelBank[var4Lifetime4] = cm.bitAnd(this.channelBank[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (1 == var5Lifetime4) {
          this.channelModulation[var4Lifetime4] = cm.bitAnd(this.channelModulation[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 33) {
          this.channelModulation[var4Lifetime4] = var6Lifetime3 + cm.bitAnd(-128, this.channelModulation[var4Lifetime4]);
        }
        if (var5Lifetime4 == 5) {
          this.channelPortamentoTime[var4Lifetime4] = cm.bitAnd(this.channelPortamentoTime[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 37) {
          this.channelPortamentoTime[var4Lifetime4] = var6Lifetime3 + cm.bitAnd(-128, this.channelPortamentoTime[var4Lifetime4]);
        }
        if (var5Lifetime4 == 7) {
          this.channelVolume[var4Lifetime4] = cm.bitAnd(this.channelVolume[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (39 == var5Lifetime4) {
          this.channelVolume[var4Lifetime4] = var6Lifetime3 + cm.bitAnd(-128, this.channelVolume[var4Lifetime4]);
        }
        if (var5Lifetime4 == 10) {
          this.channelPan[var4Lifetime4] = (var6Lifetime3 << 7) + cm.bitAnd(-16257, this.channelPan[var4Lifetime4]);
        }
        if (var5Lifetime4 == 42) {
          this.channelPan[var4Lifetime4] = var6Lifetime3 + cm.bitAnd(this.channelPan[var4Lifetime4], -128);
        }
        if (11 == var5Lifetime4) {
          this.channelExpression[var4Lifetime4] = cm.bitAnd(this.channelExpression[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (43 == var5Lifetime4) {
          this.channelExpression[var4Lifetime4] = var6Lifetime3 + cm.bitAnd(-128, this.channelExpression[var4Lifetime4]);
        }
        if (var5Lifetime4 == 64) {
          if (64 > var6Lifetime3) {
            this.channelFlags[var4Lifetime4] = cm.bitAnd(this.channelFlags[var4Lifetime4], -2);
          } else {
            this.channelFlags[var4Lifetime4] = bq.bitOr(this.channelFlags[var4Lifetime4], 1);
          }
        }
        if (65 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.b(var4Lifetime4, 16383);
            this.channelFlags[var4Lifetime4] = cm.bitAnd(this.channelFlags[var4Lifetime4], -3);
          } else {
            this.channelFlags[var4Lifetime4] = bq.bitOr(this.channelFlags[var4Lifetime4], 2);
          }
        }
        if (99 == var5Lifetime4) {
          this.channelParameter[var4Lifetime4] = (var6Lifetime3 << 7) + cm.bitAnd(127, this.channelParameter[var4Lifetime4]);
        }
        if (98 == var5Lifetime4) {
          this.channelParameter[var4Lifetime4] = cm.bitAnd(16256, this.channelParameter[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 101) {
          this.channelParameter[var4Lifetime4] = (var6Lifetime3 << 7) + 16384 + cm.bitAnd(this.channelParameter[var4Lifetime4], 127);
        }
        if (var5Lifetime4 == 100) {
          this.channelParameter[var4Lifetime4] = var6Lifetime3 + cm.bitAnd(16256, this.channelParameter[var4Lifetime4]) + 16384;
        }
        if (var5Lifetime4 == 120) {
          this.allSoundOff(var4Lifetime4, 0);
        }
        if (var5Lifetime4 == 121) {
          this.resetChannelControllers((byte) -90, var4Lifetime4);
        }
        if (123 == var5Lifetime4) {
          this.allNotesOff((byte) 87, var4Lifetime4);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.channelParameter[var4Lifetime4];
          if (var7 == 16384) {
            this.channelPitchBendRange[var4Lifetime4] = (var6Lifetime3 << 7) + cm.bitAnd(this.channelPitchBendRange[var4Lifetime4], -16257);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.channelParameter[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.channelPitchBendRange[var4Lifetime4] = var6Lifetime3 + cm.bitAnd(this.channelPitchBendRange[var4Lifetime4], -128);
          }
        }
        if (16 == var5Lifetime4) {
          this.channelSampleOffset[var4Lifetime4] = (var6Lifetime3 << 7) + cm.bitAnd(-16257, this.channelSampleOffset[var4Lifetime4]);
        }
        if (var5Lifetime4 == 48) {
          this.channelSampleOffset[var4Lifetime4] = var6Lifetime3 + cm.bitAnd(-128, this.channelSampleOffset[var4Lifetime4]);
        }
        if (var5Lifetime4 == 81) {
          if (64 > var6Lifetime3) {
            this.resetRetriggerPhase(true, var4Lifetime4);
            this.channelFlags[var4Lifetime4] = cm.bitAnd(this.channelFlags[var4Lifetime4], -5);
          } else {
            this.channelFlags[var4Lifetime4] = bq.bitOr(this.channelFlags[var4Lifetime4], 4);
          }
        }
        if (var5Lifetime4 == 17) {
          this.c(124, (this.field_Q[var4Lifetime4] & -16257) + (var6Lifetime3 << 7), var4Lifetime4);
        }
        if (var5Lifetime4 == 49) {
          this.c(72, (-128 & this.field_Q[var4Lifetime4]) + var6Lifetime3, var4Lifetime4);
        }
    }

    final synchronized void a(boolean param0, int param1, int param2) {
        this.setDefaultInstrumentAndBank(param2, 4200, param1);
        if (!param0) {
          this.allNotesOff((byte) 53, 52);
        }
    }

    final synchronized boolean isReady(byte param0) {
        int var2 = -72 % ((param0 - 20) / 61);
        return this.midiReader.isReady();
    }

    final synchronized void e(int param0) {
        int var3 = Pixelate.field_H ? 1 : 0;
        if (param0 != -38) {
          this.channelFlags = (int[]) null;
        }
        MusicPatch var4 = (MusicPatch) (this.patches.a((byte) -121));
        while (var4 != null) {
          var4.a(false);
          var4 = (MusicPatch) (this.patches.a(113));
        }
    }

    private final void resetRetriggerPhase(boolean param0, int param1) {
        MusicPatchNode var3 = null;
        int var4 = Pixelate.field_H ? 1 : 0;
        if (0 != (4 & this.channelFlags[param1])) {
          var3 = (MusicPatchNode) (this.field_N.field_r.c(1504642273));
          while (var3 != null) {
            if (param1 == var3.field_I) {
              var3.field_n = 0;
            }
            var3 = (MusicPatchNode) (this.field_N.field_r.last(1504642273));
          }
        }
        if (!param0) {
          this.channelPitchBendRange = (int[]) null;
        }
    }

    final synchronized void c(byte param0, int param1) {
        this.field_v = param1;
        int var3 = -66 / ((-71 - param0) / 55);
    }

    private final synchronized void stopTrack(int param0, boolean param1) {
        this.midiReader.release();
        this.field_D = null;
        this.resetState((byte) 92, param1);
        if (param0 <= 36) {
          this.resetChannelControllers((byte) 56, 43);
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_Q[param2] = param1;
        if (param0 <= 19) {
          return;
        }
        this.field_I[param2] = (int)(Math.pow(2.0, (double)param1 * 0.00054931640625) * 2097152.0 + 0.5);
    }

    public MidiPcmStream() {
        this.channelExpression = new int[16];
        this.channelVolume = new int[16];
        this.channelParameter = new int[16];
        this.channelPitchBendRange = new int[16];
        this.field_Q = new int[16];
        this.channelPortamentoTime = new int[16];
        this.channelSampleOffset = new int[16];
        this.notesByGroup = new MusicPatchNode[16][128];
        this.channelBank = new int[16];
        this.field_y = new int[16];
        this.channelFlags = new int[16];
        this.field_S = new int[16];
        this.channelModulation = new int[16];
        this.channelPan = new int[16];
        this.field_v = 256;
        this.field_G = new MusicPatchNode[16][128];
        this.field_I = new int[16];
        this.field_u = new int[16];
        this.field_C = 1000000;
        this.field_V = new int[16];
        this.midiReader = new MidiFileReader();
        this.field_N = new MusicPatchPcmStream(this);
        this.patches = new NodeHashTable(128);
        this.setChannelGain(256, false, -1);
        this.resetState((byte) 126, true);
    }

    MidiPcmStream(MidiPcmStream param0) {
        this.channelExpression = new int[16];
        this.channelVolume = new int[16];
        this.channelParameter = new int[16];
        this.channelPitchBendRange = new int[16];
        this.field_Q = new int[16];
        this.channelPortamentoTime = new int[16];
        this.channelSampleOffset = new int[16];
        this.notesByGroup = new MusicPatchNode[16][128];
        this.channelBank = new int[16];
        this.field_y = new int[16];
        this.channelFlags = new int[16];
        this.field_S = new int[16];
        this.channelModulation = new int[16];
        this.channelPan = new int[16];
        this.field_v = 256;
        this.field_G = new MusicPatchNode[16][128];
        this.field_I = new int[16];
        this.field_u = new int[16];
        this.field_C = 1000000;
        this.field_V = new int[16];
        this.midiReader = new MidiFileReader();
        this.field_N = new MusicPatchPcmStream(this);
        try {
          this.patches = param0.patches;
          this.setChannelGain(256, false, -1);
          this.resetState((byte) 106, true);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "ti.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
