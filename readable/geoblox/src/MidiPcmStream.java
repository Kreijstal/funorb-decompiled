/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiPcmStream extends PcmStream {
    private MidiNote[][] field_D;
    private int[] field_p;
    private MidiTrackReader midiReader;
    private int[] field_z;
    int[] field_u;
    static boolean[] heldInternalKeys;
    static Sprite jewelsForegroundSprite;
    private int field_T;
    private int[] field_r;
    private IntrusiveNodeHashTable instrumentPatches;
    private MidiNote[][] field_j;
    private int[] field_v;
    int[] field_n;
    private int[] field_S;
    int[] field_m;
    private int[] field_L;
    private int[] field_M;
    static int pendingActionPanelPhase;
    private int[] field_K;
    private int field_R;
    private int[] field_y;
    private int[] field_s;
    static int[] queuedKeyboardEventCodes;
    private int[] field_Q;
    static int[] lowBitMasks;
    private int[] field_F;
    private int[] field_w;
    private int field_k;
    private MidiNoteMixer field_I;
    private boolean loopScore;
    private int field_t;
    private long field_x;
    private long field_A;
    private boolean field_P;
    private MusicScore field_l;
    private int field_U;

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (this.midiReader.isLoaded()) {
            var4_int = this.midiReader.tickDivision * this.field_T / AudioOutput.sampleRateHz;
            while (true) {
              var5 = (long)param2 * (long)var4_int + this.field_x;
              if (this.field_A - var5 >= 0L) {
                this.field_x = var5;
                break;
              }
              var7 = (int)((-1L + this.field_A - (this.field_x - (long)var4_int)) / (long)var4_int);
              this.field_x = this.field_x + (long)var7 * (long)var4_int;
              this.field_I.a(param0, param1, var7);
              param2 = param2 - var7;
              param1 = param1 + var7;
              this.a((byte) 65);
              if (!this.midiReader.isLoaded()) {
                break;
              }
              continue;
            }
          }
          this.field_I.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("kj.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized int d() {
        return 0;
    }

    private final void d(int param0, int param1, int param2) {
        if (param1 != -2832) {
            this.stopMusicPlayback(44);
        }
    }

    private final int a(byte param0, MidiNote param1) {
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
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_L[param1.field_t] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var10 = param1.field_x;
          var11 = var10;
          var4 = this.field_p[param1.field_t] * this.field_r[param1.field_t] + 4096 >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          var5 = -83 % ((param0 - 44) / 55);
          var4 = 16384 + var4 * param1.field_w >> 15;
          var4 = 128 + var4 * this.field_R >> 8;
          var4 = var4 * this.field_L[param1.field_t] + 128 >> 8;
          if (var11.decayRate > 0) {
            var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param1.field_l * (double)var11.decayRate) * (double)var4);
          }
          if (null != var11.volumeEnvelope) {
            var6 = param1.field_o;
            var7 = var11.volumeEnvelope[1 + param1.field_k];
            if (param1.field_k < var11.volumeEnvelope.length - 2) {
              var8 = (var10.volumeEnvelope[param1.field_k] & 255) << 8;
              var9 = (255 & var11.volumeEnvelope[param1.field_k + 2]) << 8;
              var7 = var7 + (var11.volumeEnvelope[param1.field_k + 3] - var7) * (-var8 + var6) / (var9 - var8);
            }
            var4 = var4 * var7 + 32 >> 6;
          }
          if ((param1.field_y > 0) &&
              (var11.releaseEnvelope != null)) {
            var6 = param1.field_y;
            var7 = var11.releaseEnvelope[1 + param1.field_q];
            if (-2 + var11.releaseEnvelope.length > param1.field_q) {
              var8 = var10.releaseEnvelope[param1.field_q] << 8 & 65280;
              var9 = var11.releaseEnvelope[param1.field_q + 2] << 8 & 65280;
              var7 = var7 + (var11.releaseEnvelope[param1.field_q + 3] - var7) * (-var8 + var6) / (-var8 + var9);
            }
            var4 = var7 * var4 + 32 >> 6;
          }
          stackIn_19_0 = var4;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("kj.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final int a(int param0, MidiNote param1) {
        int stackIn_10_0 = 0;
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
        try {
          var3_int = (param1.field_n * param1.field_s >> 12) + param1.field_E;
          var3_int = var3_int + ((-8192 + this.field_y[param1.field_t]) * this.field_v[param1.field_t] >> 12);
          var4 = param1.field_x;
          if (0 < var4.vibratoPhaseStep) {
            if (!((var4.vibratoDepth <= 0) &&
                (this.field_s[param1.field_t] <= 0))) {
              var5 = var4.vibratoDepth << 2;
              var6 = var4.vibratoRampTicks << 1;
              if (var6 > param1.field_j) {
                var5 = var5 * param1.field_j / var6;
              }
              var5 = var5 + (this.field_s[param1.field_t] >> 7);
              var7 = Math.sin(0.01227184630308513 * (double)(param1.field_m & 511));
              var3_int = var3_int + (int)(var7 * (double)var5);
            }
          }
          if (param0 <= 10) {
            stackIn_10_0 = -116;
            return stackIn_10_0;
          }
          var5 = (int)((double)(256 * param1.field_i.sampleRateHz) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)AudioOutput.sampleRateHz + 0.5);
          stackIn_14_0 = (var5 < 1) ? 1 : var5;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("kj.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void clearDecodedSpriteWorkingArrays(boolean clearRemainingArrays) {
        md.decodedSpriteYOffsets = null;
        if (!clearRemainingArrays) {
            return;
        }
        ProgressBarWidget.decodedSpriteHeights = null;
        mj.decodedSpriteIndices = (byte[][]) null;
        DualLinkNode.decodedSpriteWidths = null;
        GameplaySession.decodedSpriteXOffsets = null;
        NanoFrameTimer.decodedSpritePalette = null;
    }

    private final void a(byte param0, int param1) {
        MidiNote var3 = null;
        if (param0 != 39) {
            this.b((byte) -85, -70);
        }
        if (!((this.field_m[param1] & 2) == 0)) {
            var3 = (MidiNote) ((Object) this.field_I.field_l.firstForIteration(0));
            while (var3 != null) {
                if (param1 == var3.field_t && null == this.field_j[param1][var3.field_D] && var3.field_y < 0) {
                    var3.field_y = 0;
                }
                var3 = (MidiNote) ((Object) this.field_I.field_l.nextForIteration(1));
            }
        }
    }

    final boolean a(int param0, int param1, int[] param2, MidiNote param3, boolean param4) {
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        InstrumentEnvelope var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        try {
          param3.field_g = AudioOutput.sampleRateHz / 100;
          if (param3.field_y >= 0) {
            if (!((null != param3.field_u) &&
                (!param3.field_u.isSamplePositionOutOfRange()))) {
              param3.b(-1);
              param3.unlinkNode(param4);
              if ((0 < param3.field_r) &&
                  (param3 == this.field_D[param3.field_t][param3.field_r])) {
                this.field_D[param3.field_t][param3.field_r] = null;
                return true;
              }
              return true;
            }
          }
          var6_int = param3.field_s;
          if (0 < var6_int) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, (double)this.field_M[param3.field_t] * 0.0004921259842519685));
            if (0 > var6_int) {
              var6_int = 0;
            }
            param3.field_s = var6_int;
          }
          param3.field_u.d(this.a(112, param3));
          var7 = param3.field_x;
          param3.field_m = param3.field_m + var7.vibratoPhaseStep;
          param3.field_j = param3.field_j + 1;
          var8 = param4 ? 1 : 0;
          var9 = 0.000005086263020833333 * (double)((-60 + param3.field_D << 8) + (param3.field_n * param3.field_s >> 12));
          if (var7.decayRate > 0) {
            if (var7.decayKeyScaling > 0) {
              param3.field_l = param3.field_l + (int)(128.0 * Math.pow(2.0, (double)var7.decayKeyScaling * var9) + 0.5);
            } else {
              param3.field_l = param3.field_l + 128;
            }
            if (var7.decayRate * param3.field_l >= 819200) {
              var8 = 1;
            }
          }
          if (var7.volumeEnvelope != null) {
            if (var7.volumeEnvelopeKeyScaling > 0) {
              param3.field_o = param3.field_o + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.volumeEnvelopeKeyScaling));
            } else {
              param3.field_o = param3.field_o + 128;
            }
            while (param3.field_k < -2 + var7.volumeEnvelope.length) {
              if ((65280 & var7.volumeEnvelope[param3.field_k + 2] << 8) < param3.field_o) {
                param3.field_k = param3.field_k + 2;
                continue;
              }
              break;
            }
            if ((!(param3.field_k != -2 + var7.volumeEnvelope.length) &&
                !(var7.volumeEnvelope[param3.field_k + 1] != 0))) {
              var8 = 1;
            }
          }
          L11: {
            if ((param3.field_y >= 0) &&
                (var7.releaseEnvelope != null) &&
                ((this.field_m[param3.field_t] & 1) == 0)) {
              if ((0 <= param3.field_r) &&
                  (param3 == this.field_D[param3.field_t][param3.field_r])) {
                break L11;
              }
              if (0 < var7.releaseEnvelopeKeyScaling) {
                param3.field_y = param3.field_y + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.releaseEnvelopeKeyScaling) * 128.0);
              } else {
                param3.field_y = param3.field_y + 128;
              }
              while (-2 + var7.releaseEnvelope.length > param3.field_q) {
                if (param3.field_y > (var7.releaseEnvelope[param3.field_q + 2] & 255) << 8) {
                  param3.field_q = param3.field_q + 2;
                  continue;
                }
                break;
              }
              if (-2 + var7.releaseEnvelope.length != param3.field_q) {
                break L11;
              }
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param3.field_u.a(param3.field_g, this.a((byte) -79, param3), this.a(param3, 761736646));
            return false;
          }
          param3.field_u.c(param3.field_g);
          if (param2 == null) {
            param3.field_u.b(param0);
          } else {
            param3.field_u.a(param2, param1, param0);
          }
          if (param3.field_u.g()) {
            this.field_I.field_m.a(param3.field_u);
          }
          param3.b(-1);
          if (0 <= param3.field_y) {
            param3.unlinkNode(false);
            if ((0 < param3.field_r) &&
                (this.field_D[param3.field_t][param3.field_r] == param3)) {
              this.field_D[param3.field_t][param3.field_r] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_66_0 = var6;
          stackIn_66_1 = new StringBuilder().append("kj.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param3 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, byte param1) {
        MidiNote var3 = null;
        if (!((this.field_m[param0] & 4) == 0)) {
            var3 = (MidiNote) ((Object) this.field_I.field_l.firstForIteration(0));
            while (var3 != null) {
                if (!(var3.field_t != param0)) {
                    var3.field_B = 0;
                }
                var3 = (MidiNote) ((Object) this.field_I.field_l.nextForIteration(1));
            }
        }
        if (param1 != 67) {
            this.field_l = (MusicScore) null;
        }
    }

    final synchronized boolean prepareScoreInstruments(SoundSampleCache sampleCache, int sampleByteBudget, int methodGuard, MusicScore score, ResourceArchive patchArchive) {
        int allInstrumentsPreparedAtReturn = 0;
        RuntimeException preparationFailureBeforeDescription = null;
        StringBuilder preparationMessagePrefix = null;
        String sampleCacheDescription = null;
        StringBuilder messageBeforeScore = null;
        String scoreDescription = null;
        StringBuilder messageBeforePatchArchive = null;
        String patchArchiveDescription = null;
        RuntimeException caughtInstrumentPreparationFailure = null;
        int allInstrumentsPreparedFlag = 0;
        RuntimeException instrumentPreparationFailureForContext = null;
        Object remainingByteBudget = null;
        InstrumentNoteMask instrumentNoteMask = null;
        int instrumentId = 0;
        InstrumentPatch instrumentPatch = null;
        int clientControlSnapshot = 0;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          score.collectInstrumentNotes();
          allInstrumentsPreparedFlag = 1;
          remainingByteBudget = null;
          if (~sampleByteBudget < methodGuard) {
            remainingByteBudget = new int[]{sampleByteBudget};
          }
          instrumentNoteMask = (InstrumentNoteMask) ((Object) score.instrumentNoteMasks.a((byte) 125));
          while (instrumentNoteMask != null) {
            instrumentId = (int)instrumentNoteMask.field_a;
            instrumentPatch = (InstrumentPatch) ((Object) this.instrumentPatches.a((long)instrumentId, (byte) -91));
            if (instrumentPatch == null) {
              instrumentPatch = InstrumentPatch.loadInstrumentPatch(instrumentId, (byte) 121, patchArchive);
              if (instrumentPatch != null) {
                this.instrumentPatches.a((byte) 102, instrumentPatch, (long)instrumentId);
              } else {
                allInstrumentsPreparedFlag = 0;
              }
            }
            if ((instrumentPatch != null) &&
                (!instrumentPatch.loadSelectedSamples((int[]) (remainingByteBudget), instrumentNoteMask.notesUsed, methodGuard + 36, sampleCache))) {
              allInstrumentsPreparedFlag = 0;
            }
            instrumentNoteMask = (InstrumentNoteMask) ((Object) score.instrumentNoteMasks.b(methodGuard - 100));
          }
          if (allInstrumentsPreparedFlag != 0) {
            score.clearInstrumentNotes();
          }
          allInstrumentsPreparedAtReturn = allInstrumentsPreparedFlag;
          return allInstrumentsPreparedAtReturn != 0;
        } catch (java.lang.RuntimeException instrumentPreparationFailure) {
          caughtInstrumentPreparationFailure = instrumentPreparationFailure;
          instrumentPreparationFailureForContext = caughtInstrumentPreparationFailure;
          preparationFailureBeforeDescription = instrumentPreparationFailureForContext;
          preparationMessagePrefix = new StringBuilder().append("kj.T(");
          if (sampleCache == null) {
            sampleCacheDescription = "null";
          } else {
            sampleCacheDescription = "{...}";
          }
          messageBeforeScore = ((StringBuilder) (Object) preparationMessagePrefix).append(sampleCacheDescription).append(',').append(sampleByteBudget).append(',').append(methodGuard).append(',');
          if (score == null) {
            scoreDescription = "null";
          } else {
            scoreDescription = "{...}";
          }
          messageBeforePatchArchive = ((StringBuilder) (Object) messageBeforeScore).append(scoreDescription).append(',');
          if (patchArchive == null) {
            patchArchiveDescription = "null";
          } else {
            patchArchiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) preparationFailureBeforeDescription), ((StringBuilder) (Object) messageBeforePatchArchive).append(patchArchiveDescription).append(')').toString());
        }
    }

    private final void b(byte param0, int param1) {
        if (!(param1 >= 0)) {
            for (param1 = 0; param1 < 16; param1++) {
                this.b((byte) -22, param1);
            }
            return;
        }
        this.field_p[param1] = 12800;
        this.field_z[param1] = 8192;
        this.field_r[param1] = 16383;
        this.field_y[param1] = 8192;
        this.field_s[param1] = 0;
        this.field_M[param1] = 8192;
        this.a((byte) 39, param1);
        this.a(param1, (byte) 67);
        this.field_m[param1] = 0;
        if (param0 >= -12) {
            this.field_k = 55;
        }
        this.field_w[param1] = 32767;
        this.field_v[param1] = 256;
        this.field_u[param1] = 0;
        this.f(-112, 8192, param1);
    }

    private final void a(int param0, int param1, int param2) {
        this.field_F[param1] = param2;
        this.field_K[param1] = ProxySocketConnector.andInt(param2, -128);
        if (param0 != -8581) {
            this.field_z = (int[]) null;
        }
        this.b(param1, -129, param2);
    }

    private final int a(MidiNote param0, int param1) {
        int discarded$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        MidiNote var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.field_z[param0.field_t];
          if (param1 != 761736646) {
            var4 = (MidiNote) null;
            discarded$1 = this.a((MidiNote) null, 124);
          }
          if (var3_int < 8192) {
            stackIn_6_0 = var3_int * param0.field_h + 32 >> 6;
            return stackIn_6_0;
          }
          stackIn_4_0 = 16384 - (32 + (128 - param0.field_h) * (16384 - var3_int) >> 6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kj.U(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(MidiNote param0, byte param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        try {
          if (param1 != -70) {
            heldInternalKeys = (boolean[]) null;
          }
          var4_int = param0.field_i.samples.length;
          if ((param2) &&
              (param0.field_i.pingPongLoop)) {
            var6 = -param0.field_i.loopStart + var4_int + var4_int;
            var4_int = var4_int << 8;
            var5 = (int)((long)var6 * (long)this.field_u[param0.field_t] >> 6);
            if (!(var4_int > var5)) {
              param0.field_u.b(true);
              var5 = -var5 + (var4_int + var4_int) - 1;
            }
          } else {
            var5 = (int)((long)var4_int * (long)this.field_u[param0.field_t] >> 6);
          }
          param0.field_u.e(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("kj.HA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized PcmStream c() {
        return null;
    }

    private final void c(int param0, int param1) {
        MidiNote var3 = (MidiNote) ((Object) this.field_I.field_l.firstForIteration(param1 ^ param1));
        while (var3 != null) {
            if ((param0 < 0 || param0 == var3.field_t) &&
                (!(var3.field_y >= 0))) {
                this.field_j[var3.field_t][var3.field_D] = null;
                var3.field_y = 0;
            }
            var3 = (MidiNote) ((Object) this.field_I.field_l.nextForIteration(1));
        }
    }

    private final void c(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (param1 != 38) {
          return;
        }
        var3 = 240 & param0;
        if (var3 == 128) {
          var4 = param0 & 15;
          var5 = (32542 & param0) >> 8;
          var6 = (param0 & 8361066) >> 16;
          this.b(23327, var5, var6, var4);
          return;
        }
        if (var3 == 144) {
          var4 = param0 & 15;
          var5 = (32525 & param0) >> 8;
          var6 = 127 & param0 >> 16;
          if (var6 > 0) {
            this.c(-1, var4, var6, var5);
          } else {
            this.b(23327, var5, 64, var4);
          }
          return;
        }
        if (var3 == 160) {
          var4 = 15 & param0;
          var5 = param0 >> 8 & 127;
          var6 = (8370933 & param0) >> 16;
          this.a(-40, var6, var5, var4);
          return;
        }
        if (var3 != 176) {
          if (192 == var3) {
            var4 = param0 & 15;
            var5 = (32632 & param0) >> 8;
            this.b(var4, param1 - 167, var5 + this.field_K[var4]);
            return;
          }
          if (var3 == 208) {
            var4 = param0 & 15;
            var5 = (32669 & param0) >> 8;
            this.d(var5, param1 ^ -2858, var4);
            return;
          }
          if (var3 == 224) {
            var4 = param0 & 15;
            var5 = (param0 >> 9 & 16256) + ((32673 & param0) >> 8);
            this.c(-108, var5, var4);
            return;
          }
          var3 = 255 & param0;
          if (255 != var3) {
            return;
          }
          this.a(true, param1 ^ 2097113);
          return;
        }
        var4 = 15 & param0;
        var5 = (param0 & 32577) >> 8;
        var6 = param0 >> 16 & 127;
        if (0 == var5) {
          this.field_K[var4] = (var6 << 14) + ProxySocketConnector.andInt(this.field_K[var4], -2080769);
        }
        if (var5 == 32) {
          this.field_K[var4] = (var6 << 7) + ProxySocketConnector.andInt(this.field_K[var4], -16257);
        }
        if (var5 == 1) {
          this.field_s[var4] = (var6 << 7) + ProxySocketConnector.andInt(this.field_s[var4], -16257);
        }
        if (33 == var5) {
          this.field_s[var4] = var6 + ProxySocketConnector.andInt(-128, this.field_s[var4]);
        }
        if (var5 == 5) {
          this.field_M[var4] = ProxySocketConnector.andInt(-16257, this.field_M[var4]) + (var6 << 7);
        }
        if (var5 == 37) {
          this.field_M[var4] = ProxySocketConnector.andInt(-128, this.field_M[var4]) + var6;
        }
        if (var5 == 7) {
          this.field_p[var4] = ProxySocketConnector.andInt(this.field_p[var4], -16257) + (var6 << 7);
        }
        if (var5 == 39) {
          this.field_p[var4] = ProxySocketConnector.andInt(-128, this.field_p[var4]) + var6;
        }
        if (var5 == 10) {
          this.field_z[var4] = ProxySocketConnector.andInt(-16257, this.field_z[var4]) + (var6 << 7);
        }
        if (var5 == 42) {
          this.field_z[var4] = var6 + ProxySocketConnector.andInt(-128, this.field_z[var4]);
        }
        if (var5 == 11) {
          this.field_r[var4] = (var6 << 7) + ProxySocketConnector.andInt(-16257, this.field_r[var4]);
        }
        if (var5 == 43) {
          this.field_r[var4] = ProxySocketConnector.andInt(-128, this.field_r[var4]) + var6;
        }
        if (var5 == 64) {
          if (var6 < 64) {
            this.field_m[var4] = ProxySocketConnector.andInt(this.field_m[var4], -2);
          } else {
            this.field_m[var4] = lb.orInt(this.field_m[var4], 1);
          }
        }
        if (var5 == 65) {
          if (64 <= var6) {
            this.field_m[var4] = lb.orInt(this.field_m[var4], 2);
          } else {
            this.a((byte) 39, var4);
            this.field_m[var4] = ProxySocketConnector.andInt(this.field_m[var4], -3);
          }
        }
        if (var5 == 99) {
          this.field_w[var4] = ProxySocketConnector.andInt(this.field_w[var4], 127) + (var6 << 7);
        }
        if (var5 == 98) {
          this.field_w[var4] = var6 + ProxySocketConnector.andInt(16256, this.field_w[var4]);
        }
        if (101 == var5) {
          this.field_w[var4] = (var6 << 7) + (ProxySocketConnector.andInt(this.field_w[var4], 127) + 16384);
        }
        if (var5 == 100) {
          this.field_w[var4] = 16384 + (ProxySocketConnector.andInt(16256, this.field_w[var4]) + var6);
        }
        if (120 == var5) {
          this.b(100, var4);
        }
        if (var5 == 121) {
          this.b((byte) -72, var4);
        }
        if (var5 == 123) {
          this.c(var4, param1 ^ 15421);
        }
        if (var5 == 6) {
          var7 = this.field_w[var4];
          if (16384 == var7) {
            this.field_v[var4] = ProxySocketConnector.andInt(this.field_v[var4], -16257) + (var6 << 7);
          }
        }
        if (var5 == 38) {
          var7 = this.field_w[var4];
          if (var7 == 16384) {
            this.field_v[var4] = ProxySocketConnector.andInt(this.field_v[var4], -128) + var6;
          }
        }
        if (16 == var5) {
          this.field_u[var4] = ProxySocketConnector.andInt(-16257, this.field_u[var4]) + (var6 << 7);
        }
        if (48 == var5) {
          this.field_u[var4] = var6 + ProxySocketConnector.andInt(this.field_u[var4], -128);
        }
        if (var5 == 81) {
          if (var6 >= 64) {
            this.field_m[var4] = lb.orInt(this.field_m[var4], 4);
          } else {
            this.a(var4, (byte) 67);
            this.field_m[var4] = ProxySocketConnector.andInt(this.field_m[var4], -5);
          }
        }
        if (var5 == 17) {
          this.f(-118, (var6 << 7) + (this.field_Q[var4] & -16257), var4);
        }
        if (var5 == 49) {
          this.f(-102, (-128 & this.field_Q[var4]) + var6, var4);
        }
        return;
    }

    private final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Geoblox.clientControlFlowFlag;
        if (param1 >= 0) {
            this.field_L[param1] = param2;
        } else {
            for (var4 = 0; var4 < 16; var4++) {
                this.field_L[var4] = param2;
            }
        }
        if (param0 != 74) {
            this.a((byte) 100, 93);
        }
    }

    final synchronized void b(int param0, byte param1) {
        this.field_R = param0;
        if (param1 != 22) {
            this.field_x = 84L;
        }
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        long var5;
        int var7;
        var3 = -25 % ((29 - param0) / 34);
        var2 = this.field_t;
        var4 = this.field_k;
        var5 = this.field_A;
        if ((this.field_l != null) &&
            (this.field_U == var4)) {
          this.a(121, this.field_l, this.loopScore, this.field_P);
          this.a((byte) 73);
          return;
        }
        L1: while (true) {
          if (var4 != this.field_k) {
            this.field_k = var4;
            this.field_A = var5;
            this.field_t = var2;
            if ((null != this.field_l) &&
                (this.field_U < var4)) {
              this.field_k = this.field_U;
              this.field_t = -1;
              this.field_A = this.midiReader.getTickTime(this.field_k);
            }
            return;
          }
          while (true) {
            if (this.midiReader.trackTicks[var2] == var4) {
              this.midiReader.seekTrack(var2);
              var7 = this.midiReader.readTrackEvent(var2);
              if (1 != var7) {
                if ((128 & var7) != 0) {
                  this.c(var7, (byte) 38);
                }
                this.midiReader.readTrackDelta(var2);
                this.midiReader.saveTrackPosition(var2);
                continue;
              }
              this.midiReader.markCurrentTrackEnded();
              this.midiReader.saveTrackPosition(var2);
              if (this.midiReader.areAllTracksEnded()) {
                if (this.field_l != null) {
                  this.startMusicScore(this.loopScore, this.field_l, -1706);
                  this.a((byte) -32);
                  return;
                }
                if ((this.loopScore) &&
                    (var4 != 0)) {
                  this.midiReader.restartTracks(var5);
                } else {
                  this.a(true, 2097151);
                  this.midiReader.unload();
                  return;
                }
              }
            }
            var2 = this.midiReader.selectEarliestTrack();
            var4 = this.midiReader.trackTicks[var2];
            var5 = this.midiReader.getTickTime(var4);
            continue L1;
          }
        }
    }

    final synchronized void startMusicScore(boolean loopPlayback, MusicScore score, int methodGuard) {
        try {
            if (methodGuard != -1706) {
                this.field_t = -24;
            }
            this.a(methodGuard + 1832, score, loopPlayback, true);
        } catch (RuntimeException musicStartFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) musicStartFailure), "kj.PA(" + loopPlayback + ',' + (score != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        MidiNote var6;
        MidiNote var7;
        var7 = this.field_j[param3][param1];
        if (var7 == null) {
          return;
        }
        this.field_j[param3][param1] = null;
        if (param0 != 23327) {
          this.field_U = -124;
        }
        L1: {
          if ((this.field_m[param3] & 2) != 0) {
            var6 = (MidiNote) ((Object) this.field_I.field_l.firstForIteration(param0 ^ 23327));
            while (var6 != null) {
              if ((var7.field_t == var6.field_t) &&
                  (0 > var6.field_y) &&
                  (var7 != var6)) {
                var7.field_y = 0;
                break L1;
              }
              var6 = (MidiNote) ((Object) this.field_I.field_l.nextForIteration(1));
            }
            break L1;
          }
          var7.field_y = 0;
        }
    }

    private final void b(int param0, int param1) {
        MidiNote var3;
        var3 = (MidiNote) ((Object) this.field_I.field_l.firstForIteration(param0 - 100));
        while (var3 != null) {
          if (!((param1 >= 0) &&
                (param1 != var3.field_t))) {
            if (null != var3.field_u) {
              var3.field_u.c(AudioOutput.sampleRateHz / 100);
              if (var3.field_u.g()) {
                this.field_I.field_m.a(var3.field_u);
              }
              var3.b(-1);
            }
            if (var3.field_y < 0) {
              this.field_j[var3.field_t][var3.field_D] = null;
            }
            var3.unlinkNode(false);
          }
          var3 = (MidiNote) ((Object) this.field_I.field_l.nextForIteration(1));
        }
        if (param0 != 100) {
          this.field_x = -48L;
        }
    }

    final synchronized void clearInstrumentSampleIds(byte methodGuard) {
        int clientControlSnapshot = Geoblox.clientControlFlowFlag;
        if (methodGuard <= 65) {
            this.c(-76, (byte) -34);
        }
        InstrumentPatch instrumentPatch = (InstrumentPatch) ((Object) this.instrumentPatches.a((byte) 125));
        while (instrumentPatch != null) {
            instrumentPatch.clearEncodedSampleIds((byte) -121);
            instrumentPatch = (InstrumentPatch) ((Object) this.instrumentPatches.b(-52));
        }
    }

    private final void f(int param0, int param1, int param2) {
        this.field_Q[param2] = param1;
        if (param0 > -100) {
            this.a(-75, 124, -68);
        }
        this.field_n[param2] = (int)(0.5 + 2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1));
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 != this.field_S[param0]) {
            this.field_S[param0] = param2;
            for (var4 = 0; var4 < 128; var4++) {
                this.field_D[param0][var4] = null;
            }
        }
        if (param1 != -129) {
            this.field_v = (int[]) null;
        }
    }

    public static void b(boolean param0) {
        jewelsForegroundSprite = null;
        queuedKeyboardEventCodes = null;
        heldInternalKeys = null;
        lowBitMasks = null;
        if (param0) {
            MidiPcmStream.c(-77);
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        if (!param0) {
            this.c(-1, 15387);
        } else {
            this.b(100, -1);
        }
        if (param1 != 2097151) {
            this.b(108);
        }
        this.b((byte) -109, -1);
        for (var3 = 0; var3 < 16; var3++) {
            this.field_S[var3] = this.field_F[var3];
        }
        int var4 = 0;
        var3 = var4;
        while (var4 < 16) {
            this.field_K[var4] = ProxySocketConnector.andInt(this.field_F[var4], -128);
            var4++;
        }
    }

    final synchronized PcmStream b() {
        return (PcmStream) ((Object) this.field_I);
    }

    final synchronized void b(int param0) {
        int var2;
        long var3;
        int var5;
        if (this.midiReader.isLoaded()) {
          var2 = this.field_T * this.midiReader.tickDivision / AudioOutput.sampleRateHz;
          while (true) {
            var3 = this.field_x + (long)param0 * (long)var2;
            if (-var3 + this.field_A >= 0L) {
              this.field_x = var3;
              break;
            }
            var5 = (int)((-1L + ((long)var2 - this.field_x + this.field_A)) / (long)var2);
            this.field_x = this.field_x + (long)var2 * (long)var5;
            param0 = param0 - var5;
            this.field_I.b(var5);
            this.a((byte) -42);
            if (this.midiReader.isLoaded()) {
              continue;
            }
            break;
          }
        }
        this.field_I.b(param0);
    }

    final boolean b(MidiNote param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_u != null) {
            if (param1 == -1) {
              return false;
            }
            return true;
          }
          if (param0.field_y >= 0) {
            param0.unlinkNode(false);
            if ((0 < param0.field_r) &&
                (this.field_D[param0.field_t][param0.field_r] == param0)) {
              this.field_D[param0.field_t][param0.field_r] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("kj.IA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized void a(byte param0, boolean param1) {
        this.midiReader.unload();
        if (param0 < 78) {
            this.field_y = (int[]) null;
        }
        this.field_l = null;
        this.a(param1, 2097151);
    }

    private final void c(int param0, int param1, int param2, int param3) {
        MidiNote stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        Object stackIn_16_0;
        boolean stackIn_16_3;
        MidiNote var5;
        int var6_int;
        PcmSample var6;
        MidiNote var7;
        MidiNote var8;
        InstrumentPatch var9;
        InstrumentPatch var10;
        this.b(23327, param3, 64, param1);
        if (0 != (2 & this.field_m[param1])) {
          var5 = (MidiNote) ((Object) this.field_I.field_l.lastForIteration(false));
          while (var5 != null) {
            if ((param1 == var5.field_t) &&
                (var5.field_y < 0)) {
              this.field_j[param1][var5.field_D] = null;
              this.field_j[param1][param3] = var5;
              var6_int = (var5.field_n * var5.field_s >> 12) + var5.field_E;
              var5.field_E = var5.field_E + (param3 - var5.field_D << 8);
              var5.field_D = param3;
              var5.field_n = var6_int - var5.field_E;
              var5.field_s = 4096;
              return;
            }
            var5 = (MidiNote) ((Object) this.field_I.field_l.previousForIteration(~param0));
          }
        }
        var9 = (InstrumentPatch) ((Object) this.instrumentPatches.a((long)this.field_S[param1], (byte) -105));
        var10 = var9;
        if (var10 == null) {
          return;
        }
        var6 = var9.keySamples[param3];
        if (var6 == null) {
          return;
        }
        var7 = new MidiNote();
        var7.field_t = param1;
        var7.field_z = var10;
        var7.field_i = var6;
        var7.field_x = var9.keyEnvelopes[param3];
        var7.field_r = var9.keyGroups[param3];
        var7.field_D = param3;
        var7.field_w = var9.keyVolumes[param3] * var10.globalVolume * (param2 * param2) + 1024 >> 11;
        var7.field_h = 255 & var9.keyPans[param3];
        var7.field_E = (param3 << 8) - (var9.pitchOffsetsAndLoopFlag[param3] & 32767);
        var7.field_q = 0;
        var7.field_l = 0;
        var7.field_o = 0;
        var7.field_k = 0;
        var7.field_y = -1;
        if (param0 == ~this.field_u[param1]) {
          var7.field_u = PcmSampleStream.a(var6, this.a(92, var7), this.a((byte) 117, var7), this.a(var7, 761736646));
        } else {
          var7.field_u = PcmSampleStream.a(var6, this.a(83, var7), 0, this.a(var7, 761736646));
          stackIn_15_1 = var7;
          stackIn_15_2 = -70;
          if (0 <= var9.pitchOffsetsAndLoopFlag[param3]) {
            stackIn_16_0 = this;
            stackIn_16_3 = false;
          } else {
            stackIn_16_0 = this;
            stackIn_16_3 = true;
          }
          this.a(stackIn_15_1, (byte) stackIn_15_2, stackIn_16_3);
        }
        if (var9.pitchOffsetsAndLoopFlag[param3] < 0) {
          var7.field_u.g(-1);
        }
        if (0 <= var7.field_r) {
          var8 = this.field_D[param1][var7.field_r];
          if ((var8 != null) &&
              (var8.field_y < 0)) {
            this.field_j[param1][var8.field_D] = null;
            var8.field_y = 0;
          }
          this.field_D[param1][var7.field_r] = var7;
        }
        this.field_I.field_l.addLast(-70, var7);
        this.field_j[param1][param3] = var7;
        return;
    }

    private final void c(int param0, int param1, int param2) {
        if (param0 > -107) {
            return;
        }
        this.field_y[param2] = param1;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param0 != -40) {
            int[] var6 = (int[]) null;
            this.a((int[]) null, -107, 119);
        }
    }

    final synchronized void stopMusicPlayback(int methodGuard) {
        this.a((byte) 106, true);
        if (methodGuard != -9268) {
            this.field_F = (int[]) null;
        }
    }

    final static void c(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (null != TrackedPcmStream.keyboardListener) {
          var1 = TrackedPcmStream.keyboardListener;
          synchronized (var1) {
            TrackedPcmStream.keyboardListener = null;
          }
        }
        if (param0 != -11099) {
          pendingActionPanelPhase = 4;
        }
    }

    private final synchronized void a(int param0, MusicScore param1, boolean param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
            this.a((byte) 98, param3);
            this.midiReader.load(param1.midiBytes);
            this.field_x = 0L;
            this.loopScore = param2 ? true : false;
            var5_int = this.midiReader.getTrackCount();
            if (param0 <= 92) {
                this.a(60, (byte) -45);
            }
            for (var6 = 0; var6 < var5_int; var6++) {
                this.midiReader.seekTrack(var6);
                this.midiReader.readTrackDelta(var6);
                this.midiReader.saveTrackPosition(var6);
            }
            this.field_t = this.midiReader.selectEarliestTrack();
            this.field_k = this.midiReader.trackTicks[this.field_t];
            this.field_A = this.midiReader.getTickTime(this.field_k);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "kj.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void e(int param0, int param1, int param2) {
        if (param0 != -1636) {
            this.b((byte) -86, 98);
        }
        this.a(-8581, param1, param2);
    }

    public MidiPcmStream() {
        this.field_D = new MidiNote[16][128];
        this.field_z = new int[16];
        this.field_u = new int[16];
        this.field_p = new int[16];
        this.field_S = new int[16];
        this.field_m = new int[16];
        this.field_v = new int[16];
        this.field_L = new int[16];
        this.field_s = new int[16];
        this.field_M = new int[16];
        this.field_j = new MidiNote[16][128];
        this.field_r = new int[16];
        this.field_T = 1000000;
        this.field_K = new int[16];
        this.field_R = 256;
        this.field_n = new int[16];
        this.field_y = new int[16];
        this.field_Q = new int[16];
        this.field_F = new int[16];
        this.field_w = new int[16];
        this.midiReader = new MidiTrackReader();
        this.field_I = new MidiNoteMixer((MidiPcmStream) (this));
        this.instrumentPatches = new IntrusiveNodeHashTable(128);
        this.a((byte) 74, -1, 256);
        this.a(true, 2097151);
    }

    static {
        pendingActionPanelPhase = 0;
        heldInternalKeys = new boolean[112];
        queuedKeyboardEventCodes = new int[128];
        lowBitMasks = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
