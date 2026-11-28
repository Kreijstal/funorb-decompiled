/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiPlayer extends PcmStream {
    private ha[][] field_n;
    private NodeHashTable field_r;
    private int[] field_t;
    private int[] field_E;
    static String field_A;
    private int field_w;
    private int[] field_J;
    private int[] field_S;
    private int[] field_Q;
    int[] field_M;
    private int field_m;
    static String field_q;
    private int[] field_N;
    int[] field_I;
    private MidiFileReader field_P;
    private int[] field_y;
    static ff field_v;
    private int[] field_T;
    private int[] field_K;
    private int[] field_x;
    int[] field_R;
    private ha[][] field_L;
    private int[] field_F;
    private int[] field_O;
    private int[] field_U;
    static int[] field_s;
    private long field_C;
    private MusicPatchPcmStream field_G;
    private int field_p;
    private long field_H;
    private boolean field_z;
    private int field_D;
    private boolean field_B;
    private MidiFile field_o;
    private int field_u;

    private final void setPitchWheel(int param0, int param1, int param2) {
        if (param0 != -1) {
          return;
        }
        this.field_Q[param1] = param2;
    }

    final synchronized int getSchedulingCost() {
        return 0;
    }

    final synchronized void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = TrackController.field_F ? 1 : 0;
        if (param2 < 0) {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_t[var4] = param0;
          }
        } else {
          this.field_t[param2] = param0;
        }
        if (param1 > -88) {
          field_s = (int[]) null;
        }
    }

    final synchronized void b(boolean param0) {
        int var3 = TrackController.field_F ? 1 : 0;
        mh var4 = (mh) (this.field_r.first(-48));
        while (var4 != null) {
          var4.f(21645);
          var4 = (mh) (this.field_r.next((byte) 91));
        }
        if (!param0) {
          this.field_C = -59L;
        }
    }

    private final void advanceMidiEvents(int param0) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = TrackController.field_F ? 1 : 0;
        var2 = this.field_D;
        var3 = this.field_p;
        if (param0 != -17313) {
          this.b(false);
        }
        var4 = this.field_H;
        if (this.field_o != null &&
          var3 == this.field_u) {
          this.a(this.field_o, param0 + 17313, this.field_B, this.field_z);
          this.advanceMidiEvents(-17313);
          return;
        }
        while (true) {
          if (var3 != this.field_p) {
            this.field_H = var4;
            this.field_p = var3;
            this.field_D = var2;
            if (null != this.field_o) {
              stackIn_23_0 = var3;
              stackIn_23_1 = this.field_u;
              if (stackIn_23_0 > stackIn_23_1) {
                this.field_D = -1;
                this.field_p = this.field_u;
                this.field_H = this.field_P.tickTime(this.field_p);
              }
            }
            return;
          }
          while (var3 == this.field_P.field_b[var2]) {
            this.field_P.seekTrack(var2);
            var6 = this.field_P.readMessage(var2);
            if (var6 != 1) {
              if ((var6 & 128) != 0) {
                this.handleMidiMessage(var6, 88);
              }
              this.field_P.readDelta(var2);
              this.field_P.saveTrackPosition(var2);
              continue;
            }
            this.field_P.markTrackDone();
            this.field_P.saveTrackPosition(var2);
            if (this.field_P.isDone()) {
              if (this.field_o != null) {
                this.a(this.field_o, 14526, this.field_z);
                this.advanceMidiEvents(-17313);
                return;
              }
              if (this.field_z &&
                var3 != 0) {
                this.field_P.reset(var4);
              } else {
                this.resetPlaybackChannels((byte) 70, true);
                this.field_P.release();
                return;
              }
            }
            break;
          }
          var2 = this.field_P.nextTrack();
          var3 = this.field_P.field_b[var2];
          var4 = this.field_P.tickTime(var3);
        }
    }

    final synchronized boolean isMidiReady(byte param0) {
        if (param0 >= -57) {
          this.nextChildStream();
        }
        return this.field_P.hasMidiData();
    }

    final synchronized void a(int param0, int param1) {
        this.field_m = param1;
        if (param0 != 0) {
          this.field_E = (int[]) null;
        }
    }

    private final synchronized void a(MidiFile param0, int param1, boolean param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = TrackController.field_F ? 1 : 0;
        try {
          this.clearMidiPlayback(param2, (byte) -110);
          this.field_P.parse(param0.field_j);
          this.field_C = 0L;
          this.field_z = param3 ? true : false;
          var5_int = this.field_P.trackCount();
          for (var6 = param1; var5_int > var6; var6++) {
            this.field_P.seekTrack(var6);
            this.field_P.readDelta(var6);
            this.field_P.saveTrackPosition(var6);
          }
          this.field_D = this.field_P.nextTrack();
          this.field_p = this.field_P.field_b[this.field_D];
          this.field_H = this.field_P.tickTime(this.field_p);
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "nb.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean isVoiceInactive(int param0, ha param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -22) {
            field_v = (ff) null;
          }
          if (param1.field_l != null) {
            return false;
          }
          if (param1.field_v < 0) {
            return true;
          }
          param1.unlink(-35);
          if (param1.field_F > 0 &&
            this.field_n[param1.field_D][param1.field_F] == param1) {
            this.field_n[param1.field_D][param1.field_F] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("nb.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(byte param0) {
        int var1 = -40 % ((-35 - param0) / 62);
        field_v = null;
        field_s = null;
        field_q = null;
        field_A = null;
    }

    private final void onChannelPressure(int param0, int param1, int param2) {
        if (param1 >= -85) {
          this.field_z = true;
        }
    }

    private final void resetChannelVoicePhases(int param0, int param1) {
        ha var3 = null;
        int var4 = TrackController.field_F ? 1 : 0;
        if ((4 & this.field_I[param0]) != 0) {
          var3 = (ha) (this.field_G.field_q.first(2));
          while (var3 != null) {
            if (var3.field_D == param0) {
              var3.field_C = 0;
            }
            var3 = (ha) (this.field_G.field_q.next(10));
          }
        }
        if (param1 != 0) {
          MidiPlayer.a((byte) 68);
        }
    }

    private final int computeNoteSampleStep(ha param0, byte param1) {
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        uh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int var6Lifetime1;
        try {
          var3_int = param0.field_A + (param0.field_y * param0.field_p >> 12);
          var3_int = var3_int + (this.field_S[param0.field_D] * (this.field_Q[param0.field_D] - 8192) >> 12);
          var5 = -73 / ((36 - param1) / 37);
          var4 = param0.field_k;
          if (var4.field_a > 0 && (!(var4.field_h <= 0) ||
            this.field_T[param0.field_D] > 0)) {
            var6 = var4.field_h << 2;
            var7 = var4.field_l << 1;
            if (var7 > param0.field_t) {
              var6 = var6 * param0.field_t / var7;
            }
            var6 = var6 + (this.field_T[param0.field_D] >> 7);
            var8 = Math.sin((double)(param0.field_r & 511) * 0.01227184630308513);
            var3_int = var3_int + (int)(var8 * (double)var6);
          }
          var6Lifetime1 = (int)(0.5 + (double)(256 * param0.field_n.field_l) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)AudioOutput.field_h);
          stackIn_11_0 = (1 <= var6Lifetime1) ? var6Lifetime1 : 1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("nb.KA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void setProgram(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TrackController.field_F ? 1 : 0;
        if (param0 < 13) {
          this.field_Q = (int[]) null;
        }
        if (this.field_N[param1] != param2) {
          this.field_N[param1] = param2;
          for (var4 = 0; 128 > var4; var4++) {
            this.field_n[param1][var4] = null;
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        this.field_U[param0] = param1;
        this.field_M[param0] = (int)(0.5 + 2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625));
        if (param2 != -131394585) {
          this.setMasterVolume(-62, -88);
        }
    }

    private final void onPolyPressure(int param0, int param1, byte param2, int param3) {
        int var5 = 49 % ((param2 + 68) / 47);
    }

    final synchronized void setMasterVolume(int param0, int param1) {
        if (param0 != 16384) {
          return;
        }
        this.field_w = param1;
    }

    private final synchronized void clearMidiPlayback(boolean param0, byte param1) {
        if (param1 != -110) {
          this.isMidiReady((byte) -25);
        }
        this.field_P.release();
        this.field_o = null;
        this.resetPlaybackChannels((byte) 70, param0);
    }

    final synchronized void stopPlayback(int param0) {
        this.clearMidiPlayback(true, (byte) -110);
        if (param0 != 11795) {
          this.setChannelProgram(-63, -101, -103);
        }
    }

    private final void noteOff(int param0, int param1, int param2, int param3) {
        ha var6 = null;
        int var7 = TrackController.field_F ? 1 : 0;
        ha var8 = this.field_L[param3][param0];
        if (var8 == null) {
          return;
        }
        this.field_L[param3][param0] = null;
        if (param1 != -27205) {
          this.advanceMidiEvents(79);
        }
        if ((this.field_I[param3] & 2) == 0) {
          var8.field_v = 0;
        } else {
          var6 = (ha) (this.field_G.field_q.first(2));
          while (var6 != null) {
            if (var8.field_D == var6.field_D &&
              var6.field_v < 0 &&
              var8 != var6) {
              var8.field_v = 0;
              break;
            }
            var6 = (ha) (this.field_G.field_q.next(10));
          }
        }
    }

    final synchronized void mix(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var7 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          if (this.field_P.hasMidiData()) {
            var4_int = this.field_m * this.field_P.field_e / AudioOutput.field_h;
            while (true) {
              var5 = this.field_C + (long)param2 * (long)var4_int;
              if (-var5 + this.field_H >= 0L) {
                this.field_C = var5;
                break;
              }
              var7 = (int)((-1L + ((long)var4_int + (-this.field_C + this.field_H))) / (long)var4_int);
              this.field_C = this.field_C + (long)var4_int * (long)var7;
              this.field_G.mix(param0, param1, var7);
              this.advanceMidiEvents(-17313);
              param2 = param2 - var7;
              param1 = param1 + var7;
              if (this.field_P.hasMidiData()) {
                continue;
              }
              this.field_G.mix(param0, param1, param2);
              return;
            }
          }
          this.field_G.mix(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("nb.HA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void skip(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        var6 = TrackController.field_F ? 1 : 0;
        if (this.field_P.hasMidiData()) {
          var2 = this.field_m * this.field_P.field_e / AudioOutput.field_h;
          while (true) {
            var3 = (long)param0 * (long)var2 + this.field_C;
            if (-var3 + this.field_H >= 0L) {
              this.field_C = var3;
              break;
            }
            var5 = (int)(((long)var2 + (-this.field_C + (this.field_H - 1L))) / (long)var2);
            this.field_C = this.field_C + (long)var5 * (long)var2;
            param0 = param0 - var5;
            this.field_G.skip(var5);
            this.advanceMidiEvents(-17313);
            if (!this.field_P.hasMidiData()) {
              break;
            }
          }
        }
        this.field_G.skip(param0);
    }

    final synchronized void a(MidiFile param0, int param1, boolean param2) {
        try {
          this.a(param0, 0, true, param2);
          if (param1 != 14526) {
            this.nextChildStream();
          }
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "nb.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
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
        var8 = TrackController.field_F ? 1 : 0;
        var3 = 240 & param0;
        if (param1 <= 76) {
          this.field_S = (int[]) null;
        }
        if (var3 == 128) {
          var4 = param0 & 15;
          var5 = (32643 & param0) >> 8;
          var6 = (param0 & 8328631) >> 16;
          this.noteOff(var5, -27205, var6, var4);
          return;
        }
        if (144 == var3) {
          var4Lifetime1 = param0 & 15;
          var5Lifetime1 = param0 >> 8 & 127;
          var6Lifetime1 = (8378272 & param0) >> 16;
          if (0 < var6Lifetime1) {
            this.noteOn((byte) -43, var6Lifetime1, var5Lifetime1, var4Lifetime1);
          } else {
            this.noteOff(var5Lifetime1, -27205, 64, var4Lifetime1);
          }
          return;
        }
        if (160 == var3) {
          var4Lifetime2 = param0 & 15;
          var5Lifetime2 = param0 >> 8 & 127;
          var6Lifetime2 = param0 >> 16 & 127;
          this.onPolyPressure(var6Lifetime2, var4Lifetime2, (byte) -128, var5Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (var3 == 192) {
            var4Lifetime3 = param0 & 15;
            var5Lifetime3 = param0 >> 8 & 127;
            this.setProgram((byte) 127, var4Lifetime3, this.field_O[var4Lifetime3] + var5Lifetime3);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = 15 & param0;
            var5Lifetime3Lifetime1 = (param0 & 32520) >> 8;
            this.onChannelPressure(var4Lifetime3Lifetime1, -107, var5Lifetime3Lifetime1);
            return;
          }
          if (224 == var3) {
            var4Lifetime3Lifetime2 = 15 & param0;
            var5Lifetime3Lifetime2 = ((32550 & param0) >> 8) + (param0 >> 9 & 16256);
            this.setPitchWheel(-1, var4Lifetime3Lifetime2, var5Lifetime3Lifetime2);
            return;
          }
          var3 = 255 & param0;
          if (var3 != 255) {
            return;
          }
          this.resetPlaybackChannels((byte) 70, true);
          return;
        }
        var4Lifetime4 = 15 & param0;
        var5Lifetime4 = (32723 & param0) >> 8;
        var6Lifetime3 = (8336064 & param0) >> 16;
        if (var5Lifetime4 == 0) {
          this.field_O[var4Lifetime4] = RandomAccessCacheFile.a(-2080769, this.field_O[var4Lifetime4]) + (var6Lifetime3 << 14);
        }
        if (var5Lifetime4 == 32) {
          this.field_O[var4Lifetime4] = (var6Lifetime3 << 7) + RandomAccessCacheFile.a(this.field_O[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 1) {
          this.field_T[var4Lifetime4] = (var6Lifetime3 << 7) + RandomAccessCacheFile.a(-16257, this.field_T[var4Lifetime4]);
        }
        if (33 == var5Lifetime4) {
          this.field_T[var4Lifetime4] = RandomAccessCacheFile.a(-128, this.field_T[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 5) {
          this.field_F[var4Lifetime4] = (var6Lifetime3 << 7) + RandomAccessCacheFile.a(-16257, this.field_F[var4Lifetime4]);
        }
        if (37 == var5Lifetime4) {
          this.field_F[var4Lifetime4] = RandomAccessCacheFile.a(this.field_F[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 7) {
          this.field_J[var4Lifetime4] = (var6Lifetime3 << 7) + RandomAccessCacheFile.a(this.field_J[var4Lifetime4], -16257);
        }
        if (39 == var5Lifetime4) {
          this.field_J[var4Lifetime4] = RandomAccessCacheFile.a(this.field_J[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 10) {
          this.field_E[var4Lifetime4] = (var6Lifetime3 << 7) + RandomAccessCacheFile.a(-16257, this.field_E[var4Lifetime4]);
        }
        if (var5Lifetime4 == 42) {
          this.field_E[var4Lifetime4] = RandomAccessCacheFile.a(-128, this.field_E[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 11) {
          this.field_K[var4Lifetime4] = (var6Lifetime3 << 7) + RandomAccessCacheFile.a(-16257, this.field_K[var4Lifetime4]);
        }
        if (var5Lifetime4 == 43) {
          this.field_K[var4Lifetime4] = RandomAccessCacheFile.a(this.field_K[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 64) {
          if (var6Lifetime3 < 64) {
            this.field_I[var4Lifetime4] = RandomAccessCacheFile.a(this.field_I[var4Lifetime4], -2);
          } else {
            this.field_I[var4Lifetime4] = SingleChildWidgetContainer.a(this.field_I[var4Lifetime4], 1);
          }
        }
        if (var5Lifetime4 == 65) {
          if (var6Lifetime3 < 64) {
            this.releaseUnmappedVoices(-22803, var4Lifetime4);
            this.field_I[var4Lifetime4] = RandomAccessCacheFile.a(this.field_I[var4Lifetime4], -3);
          } else {
            this.field_I[var4Lifetime4] = SingleChildWidgetContainer.a(this.field_I[var4Lifetime4], 2);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_x[var4Lifetime4] = RandomAccessCacheFile.a(this.field_x[var4Lifetime4], 127) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 98) {
          this.field_x[var4Lifetime4] = RandomAccessCacheFile.a(this.field_x[var4Lifetime4], 16256) + var6Lifetime3;
        }
        if (var5Lifetime4 == 101) {
          this.field_x[var4Lifetime4] = (var6Lifetime3 << 7) + (16384 + RandomAccessCacheFile.a(127, this.field_x[var4Lifetime4]));
        }
        if (100 == var5Lifetime4) {
          this.field_x[var4Lifetime4] = var6Lifetime3 + 16384 + RandomAccessCacheFile.a(this.field_x[var4Lifetime4], 16256);
        }
        if (var5Lifetime4 == 120) {
          this.removeChannelVoices(var4Lifetime4, true);
        }
        if (var5Lifetime4 == 121) {
          this.resetChannel(var4Lifetime4, (byte) 127);
        }
        if (var5Lifetime4 == 123) {
          this.allNotesOff(var4Lifetime4, 110);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_x[var4Lifetime4];
          if (var7 == 16384) {
            this.field_S[var4Lifetime4] = (var6Lifetime3 << 7) + RandomAccessCacheFile.a(-16257, this.field_S[var4Lifetime4]);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_x[var4Lifetime4];
          if (16384 == var7Lifetime1) {
            this.field_S[var4Lifetime4] = RandomAccessCacheFile.a(-128, this.field_S[var4Lifetime4]) + var6Lifetime3;
          }
        }
        if (var5Lifetime4 == 16) {
          this.field_R[var4Lifetime4] = (var6Lifetime3 << 7) + RandomAccessCacheFile.a(this.field_R[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 48) {
          this.field_R[var4Lifetime4] = var6Lifetime3 + RandomAccessCacheFile.a(this.field_R[var4Lifetime4], -128);
        }
        if (81 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.resetChannelVoicePhases(var4Lifetime4, 0);
            this.field_I[var4Lifetime4] = RandomAccessCacheFile.a(this.field_I[var4Lifetime4], -5);
          } else {
            this.field_I[var4Lifetime4] = SingleChildWidgetContainer.a(this.field_I[var4Lifetime4], 4);
          }
        }
        if (var5Lifetime4 == 17) {
          this.b(var4Lifetime4, (var6Lifetime3 << 7) + (-16257 & this.field_U[var4Lifetime4]), -131394585);
        }
        if (var5Lifetime4 == 49) {
          this.b(var4Lifetime4, var6Lifetime3 + (-128 & this.field_U[var4Lifetime4]), -131394585);
        }
    }

    private final void noteOn(byte param0, int param1, int param2, int param3) {
        boolean stackIn_16_1 = false;
        boolean stackIn_17_2 = false;
        ha var5_ref_ha;
        int var5;
        int var6_int;
        mh var6;
        PcmSample var7;
        ha var8;
        ha var9;
        int var10;
        var10 = TrackController.field_F ? 1 : 0;
        this.noteOff(param2, -27205, 64, param3);
        if ((2 & this.field_I[param3]) != 0) {
          var5_ref_ha = (ha) (this.field_G.field_q.last((byte) 95));
          while (var5_ref_ha != null) {
            if (~param3 == ~var5_ref_ha.field_D &&
              0 > var5_ref_ha.field_v) {
              this.field_L[param3][var5_ref_ha.field_i] = null;
              this.field_L[param3][param2] = var5_ref_ha;
              var6_int = var5_ref_ha.field_A + (var5_ref_ha.field_p * var5_ref_ha.field_y >> 12);
              var5_ref_ha.field_A = var5_ref_ha.field_A + (param2 - var5_ref_ha.field_i << 8);
              var5_ref_ha.field_y = 4096;
              var5_ref_ha.field_i = param2;
              var5_ref_ha.field_p = var6_int - var5_ref_ha.field_A;
              return;
            }
            var5_ref_ha = (ha) (this.field_G.field_q.previous(100));
          }
        }
        var5 = -7 % ((57 - param0) / 55);
        var6 = (mh) (this.field_r.get(8434, (long)this.field_N[param3]));
        if (var6 == null) {
          return;
        }
        var7 = var6.field_o[param2];
        if (var7 == null) {
          return;
        }
        var8 = new ha();
        var8.field_n = var7;
        var8.field_B = var6;
        var8.field_D = param3;
        var8.field_k = var6.field_p[param2];
        var8.field_F = var6.field_l[param2];
        var8.field_i = param2;
        var8.field_u = 1024 + var6.field_j[param2] * var6.field_m * param1 * param1 >> 11;
        var8.field_s = var6.field_r[param2] & 255;
        var8.field_A = (param2 << 8) - (32767 & var6.field_q[param2]);
        var8.field_j = 0;
        var8.field_G = 0;
        var8.field_v = -1;
        var8.field_o = 0;
        var8.field_q = 0;
        if (0 != this.field_R[param3]) {
          var8.field_l = PcmSampleStream.createForSampleStep(var7, this.computeNoteSampleStep(var8, (byte) 117), 0, this.computeNotePan(var8, (byte) 105));
          stackIn_16_1 = false;
          stackIn_17_2 = !(var6.field_q[param2] >= 0);
          this.a(stackIn_16_1, stackIn_17_2, var8);
        } else {
          var8.field_l = PcmSampleStream.createForSampleStep(var7, this.computeNoteSampleStep(var8, (byte) 119), this.computeNoteVolume(var8, 3), this.computeNotePan(var8, (byte) 105));
        }
        if (var6.field_q[param2] < 0) {
          var8.field_l.setLoopCount(-1);
        }
        if (var8.field_F >= 0) {
          var9 = this.field_n[param3][var8.field_F];
          if (var9 != null &&
            var9.field_v < 0) {
            this.field_L[param3][var9.field_i] = null;
            var9.field_v = 0;
          }
          this.field_n[param3][var8.field_F] = var8;
        }
        this.field_G.field_q.addLast((byte) -96, var8);
        this.field_L[param3][param2] = var8;
        return;
    }

    final boolean updateVoice(int param0, int[] param1, int param2, int param3, ha param4) {
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        uh var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          param4.field_w = AudioOutput.field_h / 100;
          if (0 <= param4.field_v && (null == param4.field_l ||
            param4.field_l.isSamplePositionOutOfRange())) {
            param4.e(-95);
            param4.unlink(-35);
            if (param4.field_F > 0) {
              if (param4 != this.field_n[param4.field_D][param4.field_F]) {
                return true;
              }
              this.field_n[param4.field_D][param4.field_F] = null;
            }
            return true;
          }
          var6_int = param4.field_y;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(Math.pow(2.0, (double)this.field_F[param4.field_D] * 0.0004921259842519685) * 16.0 + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param4.field_y = var6_int;
          }
          param4.field_l.setSampleStepMagnitude(this.computeNoteSampleStep(param4, (byte) 122));
          var7 = param4.field_k;
          param4.field_t = param4.field_t + 1;
          param4.field_r = param4.field_r + var7.field_a;
          var8 = 0;
          var9 = 0.000005086263020833333 * (double)((param4.field_y * param4.field_p >> 12) + (param4.field_i - 60 << 8));
          if (var7.field_j > 0) {
            if (var7.field_k > 0) {
              param4.field_q = param4.field_q + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_k) + 0.5);
            } else {
              param4.field_q = param4.field_q + 128;
            }
            if (param4.field_q * var7.field_j >= 819200) {
              var8 = 1;
            }
          }
          if (var7.field_c != null) {
            if (var7.field_f <= 0) {
              param4.field_G = param4.field_G + 128;
            } else {
              param4.field_G = param4.field_G + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_f) * 128.0);
            }
            while (param4.field_o < -2 + var7.field_c.length) {
              if (param4.field_G > (65280 & var7.field_c[2 + param4.field_o] << 8)) {
                param4.field_o = param4.field_o + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.field_c.length == param4.field_o &&
              var7.field_c[param4.field_o + 1] == 0) {
              var8 = 1;
            }
          }
          if (param4.field_v >= 0 &&
            null != var7.field_i &&
            0 == (this.field_I[param4.field_D] & 1) && (!(param4.field_F >= 0) ||
            this.field_n[param4.field_D][param4.field_F] != param4)) {
            if (0 >= var7.field_g) {
              param4.field_v = param4.field_v + 128;
            } else {
              param4.field_v = param4.field_v + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_g));
            }
            while (param4.field_j < var7.field_i.length - 2) {
              if (param4.field_v > (65280 & var7.field_i[param4.field_j + 2] << 8)) {
                param4.field_j = param4.field_j + 2;
                continue;
              }
              break;
            }
            if (var7.field_i.length - 2 == param4.field_j) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param4.field_l.rampVolumeAndPan(param4.field_w, this.computeNoteVolume(param4, param3 ^ 2), this.computeNotePan(param4, (byte) 105));
            if (param3 != 1) {
              this.a(100, (byte) 77, 77);
            }
            return false;
          }
          param4.field_l.fadeOutAndUnlink(param4.field_w);
          if (param1 == null) {
            param4.field_l.skip(param0);
          } else {
            param4.field_l.mix(param1, param2, param0);
          }
          if (param4.field_l.hasRemainingRampFrames()) {
            this.field_G.field_o.addChildStream(param4.field_l);
          }
          param4.e(param3 - 100);
          if (param4.field_v >= 0) {
            param4.unlink(param3 ^ -62);
            if (param4.field_F > 0 &&
              this.field_n[param4.field_D][param4.field_F] == param4) {
              this.field_n[param4.field_D][param4.field_F] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_69_0 = var6;
          stackIn_69_1 = new StringBuilder().append("nb.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    final synchronized void a(boolean param0, int param1, int param2) {
        if (param0) {
          this.setMasterVolume(22, 10);
        }
        this.setChannelProgram(param1, -3, param2);
    }

    private final void removeChannelVoices(int param0, boolean param1) {
        ha var3;
        int var4;
        var4 = TrackController.field_F ? 1 : 0;
        var3 = (ha) (this.field_G.field_q.first(2));
        while (var3 != null) {
          if (0 > param0 ||
            param0 == var3.field_D) {
            if (null != var3.field_l) {
              var3.field_l.fadeOutAndUnlink(AudioOutput.field_h / 100);
              if (var3.field_l.hasRemainingRampFrames()) {
                this.field_G.field_o.addChildStream(var3.field_l);
              }
              var3.e(83);
            }
            if (var3.field_v < 0) {
              this.field_L[var3.field_D][var3.field_i] = null;
            }
            var3.unlink(-36);
          }
          var3 = (ha) (this.field_G.field_q.next(10));
        }
        if (!param1) {
          this.noteOff(-59, -83, 120, 85);
        }
    }

    private final void resetChannel(int param0, byte param1) {
        int var4;
        var4 = TrackController.field_F ? 1 : 0;
        if (param0 < 0) {
          for (param0 = 0; param0 < 16; param0++) {
            this.resetChannel(param0, (byte) 123);
          }
          return;
        }
        this.field_J[param0] = 12800;
        this.field_E[param0] = 8192;
        this.field_K[param0] = 16383;
        this.field_Q[param0] = 8192;
        this.field_T[param0] = 0;
        this.field_F[param0] = 8192;
        this.releaseUnmappedVoices(-22803, param0);
        this.resetChannelVoicePhases(param0, 0);
        this.field_I[param0] = 0;
        this.field_x[param0] = 32767;
        this.field_S[param0] = 256;
        this.field_R[param0] = 0;
        if (param1 < 121) {
          return;
        }
        this.b(param0, 8192, -131394585);
    }

    final synchronized PcmStream nextChildStream() {
        return null;
    }

    final void a(boolean param0, boolean param1, ha param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0) {
            this.field_C = -42L;
          }
          var4_int = param2.field_n.field_j.length;
          if (param1 &&
            param2.field_n.field_k) {
            var6 = -param2.field_n.field_m + var4_int + var4_int;
            var5 = (int)((long)var6 * (long)this.field_R[param2.field_D] >> 6);
            var4_int = var4_int << 8;
            if (var5 >= var4_int) {
              var5 = -var5 + (var4_int + var4_int) - 1;
              param2.field_l.setReversePlayback(true);
            }
          } else {
            var5 = (int)((long)var4_int * (long)this.field_R[param2.field_D] >> 6);
          }
          param2.field_l.setSamplePositionFixed(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("nb.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static Sprite[] a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = TrackController.field_F ? 1 : 0;
        Sprite[] var1 = new Sprite[gi.field_o];
        if (param0 >= -40) {
          String var8 = (String) null;
          MidiPlayer.a((String) null, false, 38);
        }
        for (var2 = 0; var2 < gi.field_o; var2++) {
          var3 = j.field_f[var2] * cf.field_p[var2];
          var4 = qk.field_M[var2];
          var5 = new int[var3];
          for (var6 = 0; var3 > var6; var6++) {
            var5[var6] = CrossfadingMidiPcmStream.field_z[RandomAccessCacheFile.a((int) var4[var6], 255)];
          }
          var1[var2] = new Sprite(ab.field_a, CrossfadingMidiPcmStream.field_p, ka.field_f[var2], vb.field_a[var2], cf.field_p[var2], j.field_f[var2], var5);
        }
        ff.b(119);
        return var1;
    }

    private final void resetPlaybackChannels(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = TrackController.field_F ? 1 : 0;
        int var3Lifetime1;
        if (!param1) {
          this.allNotesOff(-1, 110);
        } else {
          this.removeChannelVoices(-1, true);
        }
        if (param0 != 70) {
          return;
        }
        this.resetChannel(-1, (byte) 122);
        for (var3 = 0; var3 < 16; var3++) {
          this.field_N[var3] = this.field_y[var3];
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (16 > var5) {
          this.field_O[var5] = RandomAccessCacheFile.a(this.field_y[var5], -128);
          var5++;
        }
    }

    final static void a(String param0, boolean param1, int param2) {
        try {
          gh.field_k = true;
          ArchiveIndex.field_h = param1 ? true : false;
          kb.field_a = new ProgressMessageDialog(AlphaWidgetContainer.field_E, p.field_a, param0, vg.field_o, ArchiveIndex.field_h);
          if (param2 != -16257) {
            field_s = (int[]) null;
          }
          AlphaWidgetContainer.field_E.showDialog((byte) -94, kb.field_a);
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "nb.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void releaseUnmappedVoices(int param0, int param1) {
        ha var3;
        int var4;
        var4 = TrackController.field_F ? 1 : 0;
        if ((2 & this.field_I[param1]) != 0) {
          var3 = (ha) (this.field_G.field_q.first(2));
          while (var3 != null) {
            if (~var3.field_D == ~param1) {
              if (null != this.field_L[param1][var3.field_i]) {
                var3 = (ha) (this.field_G.field_q.next(10));
                continue;
              }
              if (var3.field_v < 0) {
                var3.field_v = 0;
              }
            }
            var3 = (ha) (this.field_G.field_q.next(10));
          }
        }
        if (param0 != -22803) {
          this.resetChannelVoicePhases(112, 114);
        }
    }

    final synchronized PcmStream firstChildStream() {
        return (PcmStream) ((Object) this.field_G);
    }

    private final int computeNoteVolume(ha param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        uh var9 = null;
        uh var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_t[param0.field_D] == 0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (param1 != 3) {
            stackIn_5_0 = 41;
            return stackIn_5_0;
          }
          var9 = param0.field_k;
          var10 = var9;
          var4 = 4096 + this.field_K[param0.field_D] * this.field_J[param0.field_D] >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + param0.field_u * var4 >> 15;
          var4 = 128 + var4 * this.field_w >> 8;
          var4 = this.field_t[param0.field_D] * var4 + 128 >> 8;
          if (var10.field_j > 0) {
            var4 = (int)((double)var4 * Math.pow(0.5, 0.00001953125 * (double)param0.field_q * (double)var10.field_j) + 0.5);
          }
          if (var10.field_c != null) {
            var5 = param0.field_G;
            var6 = var10.field_c[param0.field_o + 1];
            if (var10.field_c.length - 2 > param0.field_o) {
              var7 = (255 & var9.field_c[param0.field_o]) << 8;
              var8 = 65280 & var10.field_c[2 + param0.field_o] << 8;
              var6 = var6 + (-var6 + var10.field_c[3 + param0.field_o]) * (var5 - var7) / (-var7 + var8);
            }
            var4 = var6 * var4 + 32 >> 6;
          }
          if (param0.field_v > 0 &&
            var10.field_i != null) {
            var5Lifetime1 = param0.field_v;
            var6Lifetime1 = var10.field_i[param0.field_j + 1];
            if (param0.field_j < -2 + var10.field_i.length) {
              var7Lifetime1 = (255 & var9.field_i[param0.field_j]) << 8;
              var8Lifetime1 = (var10.field_i[2 + param0.field_j] & 255) << 8;
              var6Lifetime1 = var6Lifetime1 + (var10.field_i[3 + param0.field_j] - var6Lifetime1) * (-var7Lifetime1 + var5Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = var6Lifetime1 * var4 + 32 >> 6;
          }
          stackIn_21_0 = var4;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("nb.U(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void setChannelProgram(int param0, int param1, int param2) {
        this.field_y[param2] = param0;
        this.field_O[param2] = RandomAccessCacheFile.a(param0, -128);
        this.setProgram((byte) 83, param2, param0);
        if (param1 != -3) {
          this.field_O = (int[]) null;
        }
    }

    private final int computeNotePan(ha param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 105) {
            stackIn_2_0 = -26;
            return stackIn_2_0;
          }
          var3_int = this.field_E[param0.field_D];
          if (var3_int >= 8192) {
            stackIn_7_0 = -((128 - param0.field_s) * (16384 - var3_int) + 32 >> 6) + 16384;
            return stackIn_7_0;
          }
          stackIn_5_0 = 32 + param0.field_s * var3_int >> 6;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("nb.AA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean a(Archive param0, byte param1, int param2, SoundCache param3, MidiFile param4) {
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
        wl var8 = null;
        int var9 = 0;
        int var11 = 0;
        mh var12 = null;
        mh var13 = null;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          param4.buildPatchUsage();
          if (param1 != -27) {
            field_v = (ff) null;
          }
          var6_int = 1;
          var7 = null;
          if (param2 > 0) {
            var7 = new int[]{param2};
          }
          var8 = (wl) (param4.field_i.first(-35));
          while (var8 != null) {
            boolean decompiledFrameRemainder0 = true;
            var9 = (int)var8.key;
            var12 = (mh) (this.field_r.get(8434, (long)var9));
            if (var12 == null) {
              var13 = kf.a(-97, param0, var9);
              if (var13 == null) {
                var6_int = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_r.put(false, (long)var9, var13);
                decompiledFrameRemainder0 = !(var13.a(var8.field_k, (int[]) (var7), (byte) -61, param3));
              }
            } else {
              decompiledFrameRemainder0 = !(var12.a(var8.field_k, (int[]) (var7), (byte) -61, param3));
            }
            if (decompiledFrameRemainder0) {
              var6_int = 0;
            }
            var8 = (wl) (param4.field_i.next((byte) 91));
          }
          if (var6_int != 0) {
            param4.releasePatchUsage();
          }
          stackIn_20_0 = var6_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("nb.MA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    private final void allNotesOff(int param0, int param1) {
        int var4 = TrackController.field_F ? 1 : 0;
        if (param1 < 82) {
          return;
        }
        ha var3 = (ha) (this.field_G.field_q.first(2));
        while (var3 != null) {
          if ((param0 < 0 || var3.field_D == param0) &&
            !(var3.field_v >= 0)) {
            this.field_L[var3.field_D][var3.field_i] = null;
            var3.field_v = 0;
          }
          var3 = (ha) (this.field_G.field_q.next(10));
        }
    }

    public MidiPlayer() {
        this.field_t = new int[16];
        this.field_n = new ha[16][128];
        this.field_S = new int[16];
        this.field_y = new int[16];
        this.field_E = new int[16];
        this.field_w = 256;
        this.field_Q = new int[16];
        this.field_L = new ha[16][128];
        this.field_M = new int[16];
        this.field_R = new int[16];
        this.field_I = new int[16];
        this.field_T = new int[16];
        this.field_K = new int[16];
        this.field_J = new int[16];
        this.field_m = 1000000;
        this.field_N = new int[16];
        this.field_U = new int[16];
        this.field_F = new int[16];
        this.field_x = new int[16];
        this.field_O = new int[16];
        this.field_P = new MidiFileReader();
        this.field_G = new MusicPatchPcmStream(this);
        this.field_r = new NodeHashTable(128);
        this.a(256, (byte) -119, -1);
        this.resetPlaybackChannels((byte) 70, true);
    }

    static {
        field_A = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_q = "Username: ";
        field_s = new int[8192];
    }
}
