/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiPcmStream extends PcmStream {
    private int[] field_p;
    private int[] field_R;
    static IntrusiveDequeCursor field_D;
    private int[] field_J;
    private int[] field_k;
    private int[] field_q;
    private int[] field_B;
    private MusicPatchNode[][] field_A;
    private int field_r;
    private MusicPatchNode[][] field_m;
    int[] field_s;
    private int[] field_S;
    private NodeHashTable field_F;
    private MidiFileReader field_N;
    int[] field_Q;
    private int field_v;
    int[] field_H;
    private int[] field_V;
    private int[] field_x;
    private int[] field_n;
    static byte[] field_E;
    static String field_O;
    private int[] field_P;
    private int[] field_I;
    private int[] field_y;
    static IntrusiveDequeCursor field_L;
    static int[] field_l;
    static String field_z;
    static String field_o;
    private long field_T;
    private long field_t;
    private MusicPatchPcmStream field_G;
    private int field_U;
    private int field_K;
    private boolean field_u;
    private MusicTrack field_C;
    private boolean field_M;
    private int field_w;

    private final void allSoundOff(int param0, int param1) {
        MusicPatchNode var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 0) {
          return;
        }
        var3 = (MusicPatchNode) (this.field_G.field_l.first(param1 ^ 12623));
        while (var3 != null) {
          if (param0 < 0 ||
            param0 == var3.field_H) {
            if (null != var3.field_n) {
              var3.field_n.fadeOut(AudioOutput.field_r / 100);
              if (var3.field_n.hasRemainingRampFrames()) {
                this.field_G.field_n.addSubStream(var3.field_n);
              }
              var3.release(true);
            }
            if (var3.field_y < 0) {
              this.field_A[var3.field_H][var3.field_t] = null;
            }
            var3.unlink(true);
          }
          var3 = (MusicPatchNode) (this.field_G.field_l.next(0));
        }
    }

    final synchronized void setMasterVolume(int param0, byte param1) {
        if (param1 != -66) {
          MidiPcmStream.releaseStatics((byte) 98);
        }
        this.field_v = param0;
    }

    private final void releaseSostenutoNotes(int param0, int param1) {
        MusicPatchNode var4 = null;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = 118 % ((40 - param1) / 57);
        if ((this.field_Q[param0] & 4) != 0) {
          var4 = (MusicPatchNode) (this.field_G.field_l.first(12623));
          while (var4 != null) {
            if (var4.field_H == param0) {
              var4.field_l = 0;
            }
            var4 = (MusicPatchNode) (this.field_G.field_l.next(0));
          }
        }
    }

    private final void dispatchDueMidiMessages(byte param0) {
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        int var6Lifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = this.field_U;
        var3 = this.field_K;
        var4 = this.field_t;
        if (this.field_C != null &&
          var3 == this.field_w) {
          this.startTrack(-93, this.field_u, this.field_C, this.field_M);
          this.dispatchDueMidiMessages((byte) 29);
          return;
        }
        while (true) {
          if (this.field_K != var3) {
            this.field_K = var3;
            this.field_t = var4;
            this.field_U = var2;
            if (null != this.field_C &&
              this.field_w < var3) {
              this.field_U = -1;
              this.field_K = this.field_w;
              this.field_t = this.field_N.tickTime(this.field_K);
            }
            var6 = 62 / ((-75 - param0) / 48);
            return;
          }
          while (~this.field_N.field_d[var2] == ~var3) {
            this.field_N.seekTrack(var2);
            var6Lifetime1 = this.field_N.readMessage(var2);
            if (var6Lifetime1 != 1) {
              if ((var6Lifetime1 & 128) != 0) {
                this.handleMidiMessage(27257, var6Lifetime1);
              }
              this.field_N.readDelta(var2);
              this.field_N.saveTrackPosition(var2);
              continue;
            }
            this.field_N.markTrackDone();
            this.field_N.saveTrackPosition(var2);
            if (this.field_N.isDone()) {
              if (null != this.field_C) {
                this.playTrack((byte) -96, this.field_u, this.field_C);
                this.dispatchDueMidiMessages((byte) 124);
                return;
              }
              if (this.field_u &&
                var3 != 0) {
                this.field_N.reset(var4);
              } else {
                this.resetState((byte) -120, true);
                this.field_N.release();
                return;
              }
            }
            break;
          }
          var2 = this.field_N.nextTrack();
          var3 = this.field_N.field_d[var2];
          var4 = this.field_N.tickTime(var3);
        }
    }

    final synchronized boolean isReady(byte param0) {
        if (param0 != -8) {
          this.field_v = 62;
        }
        return this.field_N.isReady();
    }

    private final int computeVoiceSpeed(int param0, MusicPatchNode param1) {
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        PatchEnvelopeSet var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param1.field_I + (param1.field_i * param1.field_B >> 12);
          if (param0 >= -105) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var3_int = var3_int + ((this.field_x[param1.field_H] - 8192) * this.field_J[param1.field_H] >> 12);
          var4 = param1.field_x;
          if (var4.field_e > 0 && (!(var4.field_j <= 0) ||
            this.field_I[param1.field_H] > 0)) {
            var5 = var4.field_j << 2;
            var6 = var4.field_d << 1;
            if (var6 > param1.field_z) {
              var5 = param1.field_z * var5 / var6;
            }
            var5 = var5 + (this.field_I[param1.field_H] >> 7);
            var7 = Math.sin((double)(511 & param1.field_w) * 0.01227184630308513);
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)(0.5 + (double)(param1.field_m.field_l * 256) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)AudioOutput.field_r);
          stackIn_13_0 = (var5Lifetime1 < 1) ? 1 : var5Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("gh.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized void stop(byte param0) {
        if (param0 > -103) {
          return;
        }
        this.stopTrack(true, false);
    }

    private final void noOperation(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          java.applet.Applet var6 = (java.applet.Applet) null;
          MidiPcmStream.logoutAndReload(3, (java.applet.Applet) null);
        }
    }

    final synchronized void releasePatchSamples(int param0) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 <= 119) {
          return;
        }
        MusicPatch var4 = (MusicPatch) (this.field_F.first(10));
        while (var4 != null) {
          var4.releaseSamples(23257);
          var4 = (MusicPatch) (this.field_F.next(-64));
        }
    }

    private final void noteOn(int param0, int param1, int param2, int param3) {
        int stackIn_19_1 = 0;
        boolean stackIn_20_2 = false;
        MusicPatchNode var5;
        int var6_int;
        PcmSample var6;
        MusicPatchNode var7;
        MusicPatchNode var8;
        int var9;
        java.applet.Applet var10;
        MusicPatch var11;
        MusicPatch var12;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        this.noteOff(false, param0, 64, param2);
        if (0 != (2 & this.field_Q[param0])) {
          var5 = (MusicPatchNode) (this.field_G.field_l.last(true));
          while (var5 != null) {
            if (param0 == var5.field_H &&
              var5.field_y < 0) {
              this.field_A[param0][var5.field_t] = null;
              this.field_A[param0][param2] = var5;
              var6_int = var5.field_I + (var5.field_i * var5.field_B >> 12);
              var5.field_I = var5.field_I + (param2 - var5.field_t << 8);
              var5.field_B = 4096;
              var5.field_i = var6_int - var5.field_I;
              var5.field_t = param2;
              return;
            }
            var5 = (MusicPatchNode) (this.field_G.field_l.previous((byte) 48));
          }
        }
        var11 = (MusicPatch) (this.field_F.get((long)this.field_q[param0], -74));
        var12 = var11;
        if (var12 == null) {
          return;
        }
        var6 = var11.field_p[param2];
        if (var6 == null) {
          return;
        }
        var7 = new MusicPatchNode();
        var7.field_H = param0;
        var7.field_D = var12;
        var7.field_m = var6;
        var7.field_x = var11.field_n[param2];
        var7.field_k = var11.field_l[param2];
        if (param3 <= 120) {
          var10 = (java.applet.Applet) null;
          MidiPcmStream.logoutAndReload(-26, (java.applet.Applet) null);
        }
        var7.field_t = param2;
        var7.field_u = 1024 + param1 * (param1 * var12.field_r) * var11.field_h[param2] >> 11;
        var7.field_q = var11.field_j[param2] & 255;
        var7.field_I = (param2 << 8) - (32767 & var11.field_m[param2]);
        var7.field_y = -1;
        var7.field_h = 0;
        var7.field_v = 0;
        var7.field_p = 0;
        var7.field_j = 0;
        if (this.field_H[param0] == 0) {
          var7.field_n = PcmSampleStream.createAtStepQ8(var6, this.computeVoiceSpeed(-122, var7), this.computeVoiceGain((byte) -128, var7), this.computeVoicePan(-127, var7));
        } else {
          var7.field_n = PcmSampleStream.createAtStepQ8(var6, this.computeVoiceSpeed(-127, var7), 0, this.computeVoicePan(-128, var7));
          stackIn_19_1 = 11132;
          stackIn_20_2 = !(var11.field_m[param2] >= 0);
          this.applyNoteSampleOffset(stackIn_19_1, stackIn_20_2, var7);
        }
        if (var11.field_m[param2] < 0) {
          var7.field_n.setLoopCount(-1);
        }
        if (var7.field_k >= 0) {
          var8 = this.field_m[param0][var7.field_k];
          if (var8 != null &&
            var8.field_y < 0) {
            this.field_A[param0][var8.field_t] = null;
            var8.field_y = 0;
          }
          this.field_m[param0][var7.field_k] = var7;
        }
        this.field_G.field_l.addLast(var7, -1);
        this.field_A[param0][param2] = var7;
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
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_N.isReady()) {
            var4_int = this.field_N.field_h * this.field_r / AudioOutput.field_r;
            while (true) {
              var5 = this.field_T + (long)param2 * (long)var4_int;
              if (0L <= this.field_t - var5) {
                this.field_T = var5;
                break;
              }
              var7 = (int)(((long)var4_int + (-this.field_T + this.field_t - 1L)) / (long)var4_int);
              this.field_T = this.field_T + (long)var4_int * (long)var7;
              this.field_G.mixInto(param0, param1, var7);
              param2 = param2 - var7;
              param1 = param1 + var7;
              this.dispatchDueMidiMessages((byte) 45);
              if (this.field_N.isReady()) {
                continue;
              }
              this.field_G.mixInto(param0, param1, param2);
              return;
            }
          }
          this.field_G.mixInto(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("gh.AA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean prepareTrack(int param0, SoundCache param1, ResourceArchive param2, MusicTrack param3, int param4) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        int var8 = 0;
        vf var9 = null;
        int var10 = 0;
        MusicPatch var11 = null;
        int var12 = 0;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          param3.buildPatchUsage();
          var6_int = 1;
          var8 = 73 % ((-55 - param4) / 50);
          var7 = null;
          if (param0 > 0) {
            var7 = new int[]{param0};
          }
          var9 = (vf) (param3.field_h.first(10));
          while (var9 != null) {
            var10 = (int)var9.key;
            var11 = (MusicPatch) (this.field_F.get((long)var10, -102));
            if (var11 == null) {
              var11 = IntrusiveNodeHashTable.loadMusicPatch((byte) -127, param2, var10);
              if (var11 != null) {
                this.field_F.put(var11, true, (long)var10);
              } else {
                var6_int = 0;
              }
            }
            if (var11 != null &&
              !var11.prepareSamples(-99, param1, (int[]) (var7), var9.field_t)) {
              var6_int = 0;
            }
            var9 = (vf) (param3.field_h.next(-62));
          }
          if (var6_int != 0) {
            param3.releasePatchUsage();
          }
          stackIn_17_0 = var6_int;
          return stackIn_17_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("gh.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(')').toString());
        }
    }

    final synchronized PcmStream nextSubStream() {
        return null;
    }

    final synchronized void setChannelVolume(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5;
        MusicTrack var6;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 < 0) {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_B[var4] = param2;
          }
        } else {
          this.field_B[param0] = param2;
        }
        if (param1 != 69) {
          var6 = (MusicTrack) null;
          this.playTrack((byte) -63, false, (MusicTrack) null);
        }
    }

    private final void releaseUnsustainedNotes(int param0, int param1) {
        MusicPatchNode var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 27652) {
          this.field_w = -18;
        }
        var3 = (MusicPatchNode) (this.field_G.field_l.first(param1 ^ 23883));
        while (var3 != null) {
          if ((param0 < 0 ||
            param0 == var3.field_H) &&
            0 > var3.field_y) {
            this.field_A[var3.field_H][var3.field_t] = null;
            var3.field_y = 0;
          }
          var3 = (MusicPatchNode) (this.field_G.field_l.next(0));
        }
    }

    final static int multiplyFixed16(int param0, byte param1, int param2) {
        if (param1 != 96) {
          HuffmanCodec var7 = (HuffmanCodec) null;
          MidiPcmStream.setHuffmanCodec(107, (HuffmanCodec) null);
        }
        int var3 = param2 >> 16;
        int var4 = 65535 & param2;
        int var5 = param0 >> 16;
        int var6 = 65535 & param0;
        return param0 * var3 + (var5 * var4 + (var4 * var6 >> 16));
    }

    final static void drawFramedTextPanel(int param0, BitmapFont param1, int param2, BitmapFont param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, Sprite[] param12, int param13, int param14, byte param15, int param16, Sprite[] param17, int param18, Sprite[] param19, int param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        java.applet.Applet var22 = null;
        try {
          IsaacCipher.configureLobbyLayout((byte) 100, param8, param2, param7, param3, param14, param18, param10, param13, param6, param9, new ec(param12), param20, param1, new ec(param17), param11, param4, param16, param5, new ec(param19), param0);
          if (param15 >= -99) {
            var22 = (java.applet.Applet) null;
            MidiPcmStream.logoutAndReload(125, (java.applet.Applet) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("gh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param20).append(')').toString());
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
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 27257) {
          this.field_m = (MusicPatchNode[][]) null;
        }
        var3 = param1 & 240;
        if (var3 == 128) {
          var4 = 15 & param1;
          var5 = 127 & param1 >> 8;
          var6 = (8361409 & param1) >> 16;
          this.noteOff(false, var4, var6, var5);
          return;
        }
        if (144 == var3) {
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = 127 & param1 >> 8;
          var6Lifetime1 = param1 >> 16 & 127;
          if (var6Lifetime1 <= 0) {
            this.noteOff(false, var4Lifetime1, 64, var5Lifetime1);
            return;
          }
          this.noteOn(var4Lifetime1, var6Lifetime1, var5Lifetime1, param0 - 27131);
        } else {
          if (var3 == 160) {
            var4Lifetime1 = param1 & 15;
            var5Lifetime1 = param1 >> 8 & 127;
            var6Lifetime1 = (8363658 & param1) >> 16;
            this.noOperation(var4Lifetime1, 0, var6Lifetime1, var5Lifetime1);
            return;
          }
          if (var3 != 176) {
            if (var3 == 192) {
              var4Lifetime1 = 15 & param1;
              var5Lifetime1 = (32738 & param1) >> 8;
              this.setChannelProgramOffset(122, var5Lifetime1 + this.field_n[var4Lifetime1], var4Lifetime1);
              return;
            }
            if (var3 == 208) {
              var4Lifetime1 = param1 & 15;
              var5Lifetime1 = param1 >> 8 & 127;
              this.clearTemporaryTable(var5Lifetime1, var4Lifetime1, (byte) -25);
              return;
            }
            if (var3 == 224) {
              var4Lifetime1 = 15 & param1;
              var5Lifetime1 = ((8323387 & param1) >> 9) + (param1 >> 8 & 127);
              this.setChannelGain(var5Lifetime1, var4Lifetime1, true);
              return;
            }
            var3 = param1 & 255;
            if (var3 != 255) {
              return;
            }
            this.resetState((byte) -103, true);
            return;
          }
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = param1 >> 8 & 127;
          var6Lifetime1 = (8387180 & param1) >> 16;
          if (0 == var5Lifetime1) {
            this.field_n[var4Lifetime1] = NameValidator.bitAnd(-2080769, this.field_n[var4Lifetime1]) + (var6Lifetime1 << 14);
          }
          if (var5Lifetime1 == 32) {
            this.field_n[var4Lifetime1] = (var6Lifetime1 << 7) + NameValidator.bitAnd(-16257, this.field_n[var4Lifetime1]);
          }
          if (var5Lifetime1 == 1) {
            this.field_I[var4Lifetime1] = NameValidator.bitAnd(-16257, this.field_I[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 33) {
            this.field_I[var4Lifetime1] = NameValidator.bitAnd(-128, this.field_I[var4Lifetime1]) + var6Lifetime1;
          }
          if (var5Lifetime1 == 5) {
            this.field_P[var4Lifetime1] = NameValidator.bitAnd(-16257, this.field_P[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 37) {
            this.field_P[var4Lifetime1] = NameValidator.bitAnd(this.field_P[var4Lifetime1], -128) + var6Lifetime1;
          }
          if (var5Lifetime1 == 7) {
            this.field_y[var4Lifetime1] = (var6Lifetime1 << 7) + NameValidator.bitAnd(this.field_y[var4Lifetime1], -16257);
          }
          if (var5Lifetime1 == 39) {
            this.field_y[var4Lifetime1] = var6Lifetime1 + NameValidator.bitAnd(this.field_y[var4Lifetime1], -128);
          }
          if (10 == var5Lifetime1) {
            this.field_S[var4Lifetime1] = NameValidator.bitAnd(-16257, this.field_S[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 42) {
            this.field_S[var4Lifetime1] = var6Lifetime1 + NameValidator.bitAnd(-128, this.field_S[var4Lifetime1]);
          }
          if (var5Lifetime1 == 11) {
            this.field_R[var4Lifetime1] = (var6Lifetime1 << 7) + NameValidator.bitAnd(-16257, this.field_R[var4Lifetime1]);
          }
          if (var5Lifetime1 == 43) {
            this.field_R[var4Lifetime1] = var6Lifetime1 + NameValidator.bitAnd(-128, this.field_R[var4Lifetime1]);
          }
          if (var5Lifetime1 == 64) {
            if (var6Lifetime1 < 64) {
              this.field_Q[var4Lifetime1] = NameValidator.bitAnd(this.field_Q[var4Lifetime1], -2);
            } else {
              this.field_Q[var4Lifetime1] = fj.bitOr(this.field_Q[var4Lifetime1], 1);
            }
          }
          if (var5Lifetime1 == 65) {
            if (var6Lifetime1 >= 64) {
              this.field_Q[var4Lifetime1] = fj.bitOr(this.field_Q[var4Lifetime1], 2);
            } else {
              this.allNotesOff((byte) -62, var4Lifetime1);
              this.field_Q[var4Lifetime1] = NameValidator.bitAnd(this.field_Q[var4Lifetime1], -3);
            }
          }
          if (99 == var5Lifetime1) {
            this.field_V[var4Lifetime1] = (var6Lifetime1 << 7) + NameValidator.bitAnd(127, this.field_V[var4Lifetime1]);
          }
          if (var5Lifetime1 == 98) {
            this.field_V[var4Lifetime1] = NameValidator.bitAnd(16256, this.field_V[var4Lifetime1]) + var6Lifetime1;
          }
          if (var5Lifetime1 == 101) {
            this.field_V[var4Lifetime1] = NameValidator.bitAnd(this.field_V[var4Lifetime1], 127) + (16384 + (var6Lifetime1 << 7));
          }
          if (var5Lifetime1 == 100) {
            this.field_V[var4Lifetime1] = var6Lifetime1 + (NameValidator.bitAnd(16256, this.field_V[var4Lifetime1]) + 16384);
          }
          if (120 == var5Lifetime1) {
            this.allSoundOff(var4Lifetime1, param0 ^ 27257);
          }
          if (var5Lifetime1 == 121) {
            this.resetChannelControllers(268269032, var4Lifetime1);
          }
          if (var5Lifetime1 == 123) {
            this.releaseUnsustainedNotes(var4Lifetime1, 27652);
          }
          if (6 == var5Lifetime1) {
            var7 = this.field_V[var4Lifetime1];
            if (var7 == 16384) {
              this.field_J[var4Lifetime1] = (var6Lifetime1 << 7) + NameValidator.bitAnd(-16257, this.field_J[var4Lifetime1]);
            }
          }
          if (var5Lifetime1 == 38) {
            var7Lifetime1 = this.field_V[var4Lifetime1];
            if (16384 == var7Lifetime1) {
              this.field_J[var4Lifetime1] = var6Lifetime1 + NameValidator.bitAnd(-128, this.field_J[var4Lifetime1]);
            }
          }
          if (var5Lifetime1 == 16) {
            this.field_H[var4Lifetime1] = (var6Lifetime1 << 7) + NameValidator.bitAnd(-16257, this.field_H[var4Lifetime1]);
          }
          if (48 == var5Lifetime1) {
            this.field_H[var4Lifetime1] = var6Lifetime1 + NameValidator.bitAnd(-128, this.field_H[var4Lifetime1]);
          }
          if (var5Lifetime1 == 81) {
            if (var6Lifetime1 < 64) {
              this.releaseSostenutoNotes(var4Lifetime1, param0 - 27298);
              this.field_Q[var4Lifetime1] = NameValidator.bitAnd(this.field_Q[var4Lifetime1], -5);
            } else {
              this.field_Q[var4Lifetime1] = fj.bitOr(this.field_Q[var4Lifetime1], 4);
            }
          }
          if (var5Lifetime1 == 17) {
            this.setPitchBend(8387180, var4Lifetime1, (this.field_p[var4Lifetime1] & -16257) + (var6Lifetime1 << 7));
          }
          if (49 == var5Lifetime1) {
            this.setPitchBend(8387180, var4Lifetime1, var6Lifetime1 + (-128 & this.field_p[var4Lifetime1]));
            return;
          }
        }
    }

    final synchronized int activity() {
        return 0;
    }

    final void applyNoteSampleOffset(int param0, boolean param1, MusicPatchNode param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param2.field_m.field_i.length;
          if (param0 != 11132) {
            return;
          }
          if (param1 &&
            param2.field_m.field_k) {
            var6 = -param2.field_m.field_j + (var4_int + var4_int);
            var4_int = var4_int << 8;
            var5 = (int)((long)this.field_H[param2.field_H] * (long)var6 >> 6);
            if (var5 >= var4_int) {
              var5 = -1 + var4_int + var4_int - var5;
              param2.field_n.setReversePlayback(true);
            }
          } else {
            var5 = (int)((long)this.field_H[param2.field_H] * (long)var4_int >> 6);
          }
          param2.field_n.setPosition(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("gh.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final synchronized void stopTrack(boolean param0, boolean param1) {
        this.field_N.release();
        this.field_C = null;
        this.resetState((byte) -125, param0);
        if (param1) {
          this.field_B = (int[]) null;
        }
    }

    private final void allNotesOff(byte param0, int param1) {
        MusicPatchNode var3_ref_o = null;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if ((this.field_Q[param1] & 2) != 0) {
          var3_ref_o = (MusicPatchNode) (this.field_G.field_l.first(12623));
          while (var3_ref_o != null) {
            if (~var3_ref_o.field_H == ~param1 &&
              this.field_A[param1][var3_ref_o.field_t] == null &&
              var3_ref_o.field_y < 0) {
              var3_ref_o.field_y = 0;
            }
            var3_ref_o = (MusicPatchNode) (this.field_G.field_l.next(0));
          }
        }
        int var3 = -77 / ((param0 - 3) / 33);
    }

    final synchronized void selectChannelBank(int param0, int param1, int param2) {
        int var4 = -108 % ((param1 + 39) / 47);
        this.setChannelBank(param0, param2, 1319989672);
    }

    private final void resetState(byte param0, boolean param1) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        int var3Lifetime1;
        if (param1) {
          this.allSoundOff(-1, 0);
        } else {
          this.releaseUnsustainedNotes(-1, 27652);
        }
        this.resetChannelControllers(268269032, -1);
        int var3 = 0;
        if (param0 >= -86) {
          MusicPatchNode var5 = (MusicPatchNode) null;
          this.updateNote(103, -78, 68, (int[]) null, (MusicPatchNode) null);
        }
        while (var3 < 16) {
          this.field_q[var3] = this.field_k[var3];
          var3++;
        }
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < 16) {
          this.field_n[var6] = NameValidator.bitAnd(this.field_k[var6], -128);
          var6++;
        }
    }

    final synchronized void playTrack(byte param0, boolean param1, MusicTrack param2) {
        if (param0 != -96) {
          return;
        }
        try {
          this.startTrack(-61, param1, param2, true);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "gh.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void setChannelBank(int param0, int param1, int param2) {
        this.field_k[param1] = param0;
        if (param2 != 1319989672) {
          return;
        }
        this.field_n[param1] = NameValidator.bitAnd(-128, param0);
        this.setChannelProgramOffset(param2 - 1319989581, param0, param1);
    }

    final boolean updateNote(int param0, int param1, int param2, int[] param3, MusicPatchNode param4) {
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        PatchEnvelopeSet var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          param4.field_C = AudioOutput.field_r / 100;
          if (param4.field_y >= 0 && (null == param4.field_n ||
            param4.field_n.isSamplePositionOutOfRange())) {
            param4.release(true);
            param4.unlink(true);
            if (0 < param4.field_k) {
              if (this.field_m[param4.field_H][param4.field_k] != param4) {
                return true;
              }
              this.field_m[param4.field_H][param4.field_k] = null;
            }
            return true;
          }
          var6_int = param4.field_B;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(16.0 * Math.pow(2.0, (double)this.field_P[param4.field_H] * 0.0004921259842519685) + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param4.field_B = var6_int;
          }
          param4.field_n.setSampleStepMagnitude(this.computeVoiceSpeed(param1 ^ -24574, param4));
          var7 = param4.field_x;
          var8 = 0;
          param4.field_z = param4.field_z + 1;
          param4.field_w = param4.field_w + var7.field_e;
          var9 = (double)((-60 + param4.field_t << 8) + (param4.field_i * param4.field_B >> 12)) * 0.000005086263020833333;
          if (0 < var7.field_n) {
            if (var7.field_m <= 0) {
              param4.field_j = param4.field_j + 128;
            } else {
              param4.field_j = param4.field_j + (int)(128.0 * Math.pow(2.0, (double)var7.field_m * var9) + 0.5);
            }
            if (param4.field_j * var7.field_n >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_h) {
            if (var7.field_g <= 0) {
              param4.field_h = param4.field_h + 128;
            } else {
              param4.field_h = param4.field_h + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_g) * 128.0);
            }
            while (var7.field_h.length - 2 > param4.field_v) {
              if (param4.field_h > (65280 & var7.field_h[param4.field_v + 2] << 8)) {
                param4.field_v = param4.field_v + 2;
                continue;
              }
              break;
            }
            if (param4.field_v == -2 + var7.field_h.length &&
              var7.field_h[1 + param4.field_v] == 0) {
              var8 = 1;
            }
          }
          if (param4.field_y >= 0 &&
            null != var7.field_l &&
            (1 & this.field_Q[param4.field_H]) == 0 && (!(param4.field_k >= 0) ||
            param4 != this.field_m[param4.field_H][param4.field_k])) {
            if (0 >= var7.field_i) {
              param4.field_y = param4.field_y + 128;
            } else {
              param4.field_y = param4.field_y + (int)(128.0 * Math.pow(2.0, (double)var7.field_i * var9) + 0.5);
            }
            while (var7.field_l.length - 2 > param4.field_p) {
              if (param4.field_y > (var7.field_l[2 + param4.field_p] & 255) << 8) {
                param4.field_p = param4.field_p + 2;
                continue;
              }
              break;
            }
            if (param4.field_p == -2 + var7.field_l.length) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param4.field_n.rampVolumeAndPan(param4.field_C, this.computeVoiceGain((byte) -128, param4), this.computeVoicePan(param1 - 24592, param4));
            if (param1 == 24464) {
              return false;
            }
            return false;
          }
          param4.field_n.fadeOut(param4.field_C);
          if (param3 == null) {
            param4.field_n.skip(param2);
          } else {
            param4.field_n.mixInto(param3, param0, param2);
          }
          if (param4.field_n.hasRemainingRampFrames()) {
            this.field_G.field_n.addSubStream(param4.field_n);
          }
          param4.release(true);
          if (param4.field_y >= 0) {
            param4.unlink(true);
            if (0 < param4.field_k &&
              param4 == this.field_m[param4.field_H][param4.field_k]) {
              this.field_m[param4.field_H][param4.field_k] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_71_0 = var6;
          stackIn_71_1 = new StringBuilder().append("gh.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    final synchronized void setTempoScale(int param0, byte param1) {
        this.field_r = param0;
        if (param1 >= -84) {
          field_D = (IntrusiveDequeCursor) null;
        }
    }

    private final int computeVoiceGain(byte param0, MusicPatchNode param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        PatchEnvelopeSet var9 = null;
        PatchEnvelopeSet var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (0 == this.field_B[param1.field_H]) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = param1.field_x;
          var10 = var9;
          var4 = 4096 + this.field_y[param1.field_H] * this.field_R[param1.field_H] >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + param1.field_u * var4 >> 15;
          var4 = 128 + this.field_v * var4 >> 8;
          var4 = var4 * this.field_B[param1.field_H] + 128 >> 8;
          if (0 < var10.field_n) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)param1.field_j * 0.00001953125 * (double)var10.field_n) * (double)var4);
          }
          if (var10.field_h != null) {
            var5 = param1.field_h;
            var6 = var10.field_h[1 + param1.field_v];
            if (-2 + var10.field_h.length > param1.field_v) {
              var7 = (255 & var9.field_h[param1.field_v]) << 8;
              var8 = (var10.field_h[param1.field_v + 2] & 255) << 8;
              var6 = var6 + (var5 - var7) * (-var6 + var10.field_h[3 + param1.field_v]) / (var8 - var7);
            }
            var4 = var6 * var4 + 32 >> 6;
          }
          if (param1.field_y > 0 &&
            null != var10.field_l) {
            var5Lifetime1 = param1.field_y;
            var6Lifetime1 = var10.field_l[param1.field_p + 1];
            if (param1.field_p < var10.field_l.length - 2) {
              var7Lifetime1 = (var9.field_l[param1.field_p] & 255) << 8;
              var8Lifetime1 = (var10.field_l[param1.field_p + 2] & 255) << 8;
              var6Lifetime1 = var6Lifetime1 + (-var6Lifetime1 + var10.field_l[param1.field_p + 3]) * (-var7Lifetime1 + var5Lifetime1) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = 32 + var6Lifetime1 * var4 >> 6;
          }
          if (param0 > -122) {
            this.field_x = (int[]) null;
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("gh.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void noteOff(boolean param0, int param1, int param2, int param3) {
        MusicPatchNode var6 = null;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        MusicPatchNode var8 = this.field_A[param1][param3];
        if (var8 == null) {
          return;
        }
        this.field_A[param1][param3] = null;
        if (0 == (2 & this.field_Q[param1])) {
          var8.field_y = 0;
        } else {
          var6 = (MusicPatchNode) (this.field_G.field_l.first(12623));
          while (var6 != null) {
            if (var8.field_H == var6.field_H && var6.field_y < 0 &&
              var6 != var8) {
              var8.field_y = 0;
              break;
            }
            var6 = (MusicPatchNode) (this.field_G.field_l.next(0));
          }
        }
        if (param0) {
          this.field_F = (NodeHashTable) null;
        }
    }

    final synchronized void skip(int param0) {
        int var2;
        long var3;
        int var6;
        int var5;
        boolean decompiledFrameRemainder0 = true;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_N.isReady()) {
          var2 = this.field_r * this.field_N.field_h / AudioOutput.field_r;
          while (true) {
            var3 = this.field_T + (long)var2 * (long)param0;
            if (0L <= -var3 + this.field_t) {
              this.field_T = var3;
            } else {
              var5 = (int)((-1L + (-this.field_T + (this.field_t + (long)var2))) / (long)var2);
              this.field_T = this.field_T + (long)var2 * (long)var5;
              param0 = param0 - var5;
              this.field_G.skip(var5);
              this.dispatchDueMidiMessages((byte) -126);
              if (this.field_N.isReady()) {
                continue;
              }
            }
            break;
          }
          this.field_G.skip(param0);
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_G.skip(param0);
        }

    }

    private final void setChannelGain(int param0, int param1, boolean param2) {
        this.field_x[param1] = param0;
        if (!param2) {
          this.field_I = (int[]) null;
        }
    }

    private final void setChannelProgramOffset(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 <= 16) {
          return;
        }
        if (param1 != this.field_q[param2]) {
          this.field_q[param2] = param1;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_m[param2][var4] = null;
          }
        }
    }

    final static void logoutAndReload(int param0, java.applet.Applet param1) {
        try {
          if (param0 != 2) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            MidiPcmStream.logoutAndReload(87, (java.applet.Applet) null);
          }
          um.setSessionCookie("", param1, 13680);
          mc.reloadPage(param0 ^ 30451, param1);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "gh.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 < 49) {
          Sprite[] var2 = (Sprite[]) null;
          MidiPcmStream.drawFramedTextPanel(-77, (BitmapFont) null, 44, (BitmapFont) null, 50, -28, 27, 16, 26, 104, 12, -16, (Sprite[]) null, -80, -75, (byte) -94, -15, (Sprite[]) null, 47, (Sprite[]) null, 87);
        }
        field_z = null;
        field_o = null;
        field_L = null;
        field_l = null;
        field_D = null;
        field_O = null;
        field_E = null;
    }

    private final synchronized void startTrack(int param0, boolean param1, MusicTrack param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        this.stopTrack(param3, false);
        this.field_N.parse(param2.field_g);
        if (param0 >= -49) {
          return;
        }
        try {
          this.field_u = param1 ? true : false;
          this.field_T = 0L;
          var5_int = this.field_N.trackCount();
          for (var6 = 0; var5_int > var6; var6++) {
            this.field_N.seekTrack(var6);
            this.field_N.readDelta(var6);
            this.field_N.saveTrackPosition(var6);
          }
          this.field_U = this.field_N.nextTrack();
          this.field_K = this.field_N.field_d[this.field_U];
          this.field_t = this.field_N.tickTime(this.field_K);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "gh.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void setPitchBend(int param0, int param1, int param2) {
        this.field_p[param1] = param2;
        this.field_s[param1] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param2) * 2097152.0);
        if (param0 != 8387180) {
          this.setChannelGain(-47, -57, false);
        }
    }

    final boolean discardInactiveVoice(boolean param0, MusicPatchNode param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_n != null) {
            if (!param0) {
              MidiPcmStream.multiplyFixed16(-58, (byte) 89, 75);
            }
            return false;
          }
          if (param1.field_y < 0) {
            return true;
          }
          param1.unlink(true);
          if (0 < param1.field_k &&
            param1 == this.field_m[param1.field_H][param1.field_k]) {
            this.field_m[param1.field_H][param1.field_k] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("gh.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void clearTemporaryTable(int param0, int param1, byte param2) {
        if (param2 >= -4) {
          this.field_V = (int[]) null;
        }
    }

    private final int computeVoicePan(int param0, MusicPatchNode param1) {
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
          if (param0 > -126) {
            stackIn_2_0 = -91;
            return stackIn_2_0;
          }
          var3_int = this.field_S[param1.field_H];
          if (8192 <= var3_int) {
            stackIn_7_0 = -(32 + (16384 - var3_int) * (-param1.field_q + 128) >> 6) + 16384;
            return stackIn_7_0;
          }
          stackIn_5_0 = 32 + var3_int * param1.field_q >> 6;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("gh.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final synchronized PcmStream firstSubStream() {
        return (PcmStream) ((Object) this.field_G);
    }

    final static void setHuffmanCodec(int param0, HuffmanCodec param1) {
        try {
          int var2_int = 66 / ((param0 + 27) / 62);
          TextLayout.field_g = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "gh.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void resetChannelControllers(int param0, int param1) {
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 < 0) {
          for (param1 = 0; param1 < 16; param1++) {
            this.resetChannelControllers(param0 ^ 0, param1);
          }
        } else {
          this.field_y[param1] = 12800;
          this.field_S[param1] = 8192;
          this.field_R[param1] = 16383;
          this.field_x[param1] = 8192;
          this.field_I[param1] = 0;
          this.field_P[param1] = 8192;
          this.allNotesOff((byte) 121, param1);
          this.releaseSostenutoNotes(param1, param0 ^ -268269053);
          if (param0 != 268269032) {
            this.field_S = (int[]) null;
          }
          this.field_Q[param1] = 0;
          this.field_V[param1] = 32767;
          this.field_J[param1] = 256;
          this.field_H[param1] = 0;
          this.setPitchBend(8387180, param1, 8192);
        }
    }

    public MidiPcmStream() {
        this.field_p = new int[16];
        this.field_k = new int[16];
        this.field_r = 1000000;
        this.field_A = new MusicPatchNode[16][128];
        this.field_s = new int[16];
        this.field_v = 256;
        this.field_H = new int[16];
        this.field_x = new int[16];
        this.field_n = new int[16];
        this.field_J = new int[16];
        this.field_B = new int[16];
        this.field_V = new int[16];
        this.field_q = new int[16];
        this.field_m = new MusicPatchNode[16][128];
        this.field_Q = new int[16];
        this.field_I = new int[16];
        this.field_R = new int[16];
        this.field_S = new int[16];
        this.field_P = new int[16];
        this.field_y = new int[16];
        this.field_N = new MidiFileReader();
        this.field_G = new MusicPatchPcmStream(this);
        this.field_F = new NodeHashTable(128);
        this.setChannelVolume(-1, (byte) 69, 256);
        this.resetState((byte) -93, true);
    }

    static {
        field_O = "Auto-respond to <%0>";
        field_D = new IntrusiveDequeCursor();
        field_l = new int[]{2, 20, 21, 6, 5, 9};
        field_z = "Reject <%0> from this game";
        field_L = new IntrusiveDequeCursor();
        field_o = "Now, clicking near yourself will cause an explosion of arcane energy. Try using it on the target. If you miss, move closer and try again.";
    }
}
