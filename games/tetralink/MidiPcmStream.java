/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiPcmStream extends PcmStream {
    private int field_R;
    private int[] field_r;
    private int[] field_V;
    int[] field_I;
    private int[] field_H;
    private int[] field_t;
    static String field_O;
    private NodeHashTable field_A;
    private int[] field_v;
    static int field_s;
    private int[] field_K;
    private int field_X;
    private int[] field_M;
    private int[] field_u;
    private int[] field_Q;
    private int[] field_E;
    int[] field_T;
    private MidiFileReader field_N;
    private MidiNote[][] field_J;
    private int[] field_L;
    private MidiNote[][] field_B;
    int[] field_G;
    private int[] field_w;
    private int[] field_W;
    private long field_C;
    private MusicPatchPcmStream field_y;
    private boolean field_x;
    private int field_Y;
    private int field_S;
    private long field_D;
    private boolean field_U;
    private int field_F;
    private MusicTrack field_z;

    private final void dispatchDueMidiMessages(byte param0) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_27_0Lifetime1;
        int stackIn_27_1Lifetime1;
        var7 = TetraLink.field_J;
        var2 = this.field_Y;
        if (param0 <= 19) {
          this.field_V = (int[]) null;
        }
        var3 = this.field_S;
        var4 = this.field_C;
        if (null != this.field_z &&
          ~this.field_F == ~var3) {
          this.startTrack(this.field_z, 0, this.field_U, this.field_x);
          this.dispatchDueMidiMessages((byte) 38);
          return;
        }
        scanLoop1: while (true) {
          stackIn_7_0 = ~var3;
          stackIn_7_1 = ~this.field_S;
          if (stackIn_7_0 == stackIn_7_1) {
            while (true) {
              stackIn_27_0 = var3;
              stackIn_27_1 = this.field_N.field_g[var2];
              if (stackIn_27_0 == stackIn_27_1) {
                this.field_N.seekTrack(var2);
                var6 = this.field_N.readMessage(var2);
                stackIn_7_0 = -2;
                stackIn_7_1 = ~var6;
                if (stackIn_7_0 != stackIn_7_1) {
                  if ((128 & var6) != 0) {
                    this.handleMidiMessage(91, var6);
                  }
                  this.field_N.readTrackDelta(var2);
                  this.field_N.saveTrackPosition(var2);
                  continue;
                }
                this.field_N.markTrackDone();
                this.field_N.saveTrackPosition(var2);
                if (this.field_N.isDone()) {
                  if (this.field_z != null) {
                    this.playTrack(this.field_x, this.field_z, (byte) 123);
                    this.dispatchDueMidiMessages((byte) 108);
                    return;
                  }
                  if (this.field_x &&
                    var3 != 0) {
                    this.field_N.reset(var4);
                  } else {
                    this.resetState(true, (byte) 127);
                    this.field_N.release();
                    return;
                  }
                }
              }
              break;
            }
            var2 = this.field_N.nextTrack();
            var3 = this.field_N.field_g[var2];
            var4 = this.field_N.tickTime(var3);
            continue scanLoop1;
          }
          break;
        }
        this.field_C = var4;
        this.field_Y = var2;
        this.field_S = var3;
        if (this.field_z == null) {
          return;
        }
        stackIn_27_0Lifetime1 = var3;
        stackIn_27_1Lifetime1 = this.field_F;
        if (stackIn_27_0Lifetime1 > stackIn_27_1Lifetime1) {
          this.field_Y = -1;
          this.field_S = this.field_F;
          this.field_C = this.field_N.tickTime(this.field_S);
        }
        return;
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
        int var5Lifetime3Lifetime1;
        var8 = TetraLink.field_J;
        var3 = 240 & param1;
        if (128 == var3) {
          var4 = param1 & 15;
          var5 = param1 >> 8 & 127;
          var6 = (8323462 & param1) >> 16;
          this.noteOff(var5, (byte) 77, var4, var6);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = (param1 & 32590) >> 8;
          var6Lifetime1 = (8359574 & param1) >> 16;
          if (var6Lifetime1 <= 0) {
            this.noteOff(var5Lifetime1, (byte) 77, var4Lifetime1, 64);
          } else {
            this.noteOn(var5Lifetime1, var6Lifetime1, -25798, var4Lifetime1);
          }
          return;
        }
        if (160 == var3) {
          var4Lifetime2 = param1 & 15;
          var5Lifetime2 = (param1 & 32674) >> 8;
          var6Lifetime2 = (param1 & 8343902) >> 16;
          this.handleKeyPressure(false, var4Lifetime2, var5Lifetime2, var6Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (var3 == 192) {
            var4Lifetime3 = 15 & param1;
            var5Lifetime3 = (32759 & param1) >> 8;
            this.setChannelProgramOffset(var5Lifetime3 + this.field_M[var4Lifetime3], -2, var4Lifetime3);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = 15 & param1;
            var5Lifetime3Lifetime1 = (32749 & param1) >> 8;
            this.handleChannelPressure((byte) -62, var5Lifetime3Lifetime1, var4Lifetime3Lifetime1);
          } else {
            if (var3 == 224) {
              var4Lifetime3Lifetime1 = 15 & param1;
              var5Lifetime3Lifetime1 = ((param1 & 8323385) >> 9) + ((param1 & 32630) >> 8);
              this.setChannelPitchBend(-27508, var4Lifetime3Lifetime1, var5Lifetime3Lifetime1);
            } else {
              var3 = 255 & param1;
              if (var3 == 255) {
                this.resetState(true, (byte) 77);
              } else {
                if (param0 < 67) {
                  this.field_X = -10;
                }
              }
            }
          }
          return;
        }
        var4Lifetime4 = param1 & 15;
        var5Lifetime4 = param1 >> 8 & 127;
        var6Lifetime3 = 127 & param1 >> 16;
        if (var5Lifetime4 == 0) {
          this.field_M[var4Lifetime4] = StatusRequestHelpers.bitAnd(-2080769, this.field_M[var4Lifetime4]) + (var6Lifetime3 << 14);
        }
        if (32 == var5Lifetime4) {
          this.field_M[var4Lifetime4] = (var6Lifetime3 << 7) + StatusRequestHelpers.bitAnd(this.field_M[var4Lifetime4], -16257);
        }
        if (1 == var5Lifetime4) {
          this.field_t[var4Lifetime4] = StatusRequestHelpers.bitAnd(this.field_t[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 33) {
          this.field_t[var4Lifetime4] = StatusRequestHelpers.bitAnd(this.field_t[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (5 == var5Lifetime4) {
          this.field_V[var4Lifetime4] = StatusRequestHelpers.bitAnd(this.field_V[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 37) {
          this.field_V[var4Lifetime4] = StatusRequestHelpers.bitAnd(this.field_V[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 7) {
          this.field_u[var4Lifetime4] = StatusRequestHelpers.bitAnd(-16257, this.field_u[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 39) {
          this.field_u[var4Lifetime4] = var6Lifetime3 + StatusRequestHelpers.bitAnd(-128, this.field_u[var4Lifetime4]);
        }
        if (var5Lifetime4 == 10) {
          this.field_r[var4Lifetime4] = (var6Lifetime3 << 7) + StatusRequestHelpers.bitAnd(this.field_r[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 42) {
          this.field_r[var4Lifetime4] = StatusRequestHelpers.bitAnd(this.field_r[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 11) {
          this.field_W[var4Lifetime4] = StatusRequestHelpers.bitAnd(this.field_W[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 43) {
          this.field_W[var4Lifetime4] = var6Lifetime3 + StatusRequestHelpers.bitAnd(-128, this.field_W[var4Lifetime4]);
        }
        if (64 == var5Lifetime4) {
          if (64 <= var6Lifetime3) {
            this.field_I[var4Lifetime4] = IntrusiveNode.bitOr(this.field_I[var4Lifetime4], 1);
          } else {
            this.field_I[var4Lifetime4] = StatusRequestHelpers.bitAnd(this.field_I[var4Lifetime4], -2);
          }
        }
        if (65 == var5Lifetime4) {
          if (var6Lifetime3 >= 64) {
            this.field_I[var4Lifetime4] = IntrusiveNode.bitOr(this.field_I[var4Lifetime4], 2);
          } else {
            this.releasePortamentoNotes(var4Lifetime4, (byte) 116);
            this.field_I[var4Lifetime4] = StatusRequestHelpers.bitAnd(this.field_I[var4Lifetime4], -3);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_v[var4Lifetime4] = StatusRequestHelpers.bitAnd(127, this.field_v[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 98) {
          this.field_v[var4Lifetime4] = var6Lifetime3 + StatusRequestHelpers.bitAnd(16256, this.field_v[var4Lifetime4]);
        }
        if (var5Lifetime4 == 101) {
          this.field_v[var4Lifetime4] = StatusRequestHelpers.bitAnd(127, this.field_v[var4Lifetime4]) + 16384 + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 100) {
          this.field_v[var4Lifetime4] = var6Lifetime3 + 16384 + StatusRequestHelpers.bitAnd(16256, this.field_v[var4Lifetime4]);
        }
        if (var5Lifetime4 == 120) {
          this.allSoundOff((byte) -119, var4Lifetime4);
        }
        if (121 == var5Lifetime4) {
          this.resetChannelControllers(var4Lifetime4, 16384);
        }
        if (var5Lifetime4 == 123) {
          this.allNotesOff(var4Lifetime4, -58);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_v[var4Lifetime4];
          if (var7 == 16384) {
            this.field_K[var4Lifetime4] = (var6Lifetime3 << 7) + StatusRequestHelpers.bitAnd(this.field_K[var4Lifetime4], -16257);
          }
        }
        if (38 == var5Lifetime4) {
          var7Lifetime1 = this.field_v[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_K[var4Lifetime4] = var6Lifetime3 + StatusRequestHelpers.bitAnd(this.field_K[var4Lifetime4], -128);
          }
        }
        if (var5Lifetime4 == 16) {
          this.field_G[var4Lifetime4] = StatusRequestHelpers.bitAnd(this.field_G[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 48) {
          this.field_G[var4Lifetime4] = StatusRequestHelpers.bitAnd(-128, this.field_G[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 81) {
          if (64 > var6Lifetime3) {
            this.resetRetriggerPhase(var4Lifetime4, 114);
            this.field_I[var4Lifetime4] = StatusRequestHelpers.bitAnd(this.field_I[var4Lifetime4], -5);
          } else {
            this.field_I[var4Lifetime4] = IntrusiveNode.bitOr(this.field_I[var4Lifetime4], 4);
          }
        }
        if (var5Lifetime4 == 17) {
          this.setRetriggerRate(var4Lifetime4, 13242, (-16257 & this.field_L[var4Lifetime4]) + (var6Lifetime3 << 7));
        }
        if (var5Lifetime4 == 49) {
          this.setRetriggerRate(var4Lifetime4, 13242, var6Lifetime3 + (-128 & this.field_L[var4Lifetime4]));
          return;
        }
    }

    private final int computeVoiceGain(MidiNote param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        MusicPatchEnvelope var9 = null;
        MusicPatchEnvelope var10 = null;
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
          if (this.field_w[param0.field_n] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = param0.field_q;
          var10 = var9;
          var4 = 4096 + this.field_W[param0.field_n] * this.field_u[param0.field_n] >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + param0.field_J * var4 >> 15;
          var4 = var4 * this.field_X + 128 >> 8;
          var4 = var4 * this.field_w[param0.field_n] + 128 >> 8;
          if (var10.field_a > 0) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)var10.field_a * (0.00001953125 * (double)param0.field_t)) + 0.5);
          }
          if (param1 != 16402) {
            field_O = (String) null;
          }
          if (null != var10.field_d) {
            var5 = param0.field_o;
            var6 = var10.field_d[1 + param0.field_G];
            if (param0.field_G < (-2 + var10.field_d.length)) {
              var7 = var9.field_d[param0.field_G] << 8 & 65280;
              var8 = (var10.field_d[2 + param0.field_G] & 255) << 8;
              var6 = var6 + (var5 - var7) * (var10.field_d[3 + param0.field_G] - var6) / (var8 - var7);
            }
            var4 = 32 + var6 * var4 >> 6;
          }
          if (0 < param0.field_v &&
            null != var10.field_e) {
            var5Lifetime1 = param0.field_v;
            var6Lifetime1 = var10.field_e[param0.field_A + 1];
            if (param0.field_A < -2 + var10.field_e.length) {
              var7Lifetime1 = var9.field_e[param0.field_A] << 8 & 65280;
              var8Lifetime1 = (var10.field_e[param0.field_A + 2] & 255) << 8;
              var6Lifetime1 = var6Lifetime1 + (var5Lifetime1 - var7Lifetime1) * (-var6Lifetime1 + var10.field_e[param0.field_A + 3]) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = 32 + var6Lifetime1 * var4 >> 6;
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("g.M(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void resetRetriggerPhase(int param0, int param1) {
        MidiNote var3_ref_oc;
        int var3;
        int var4;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_0Lifetime1;
        int stackIn_8_1Lifetime1;
        var4 = TetraLink.field_J;
        if ((this.field_I[param0] & 4) != 0) {
          var3_ref_oc = (MidiNote) (this.field_y.field_u.first(false));
          while (var3_ref_oc != null) {
            stackIn_8_0 = param0;
            stackIn_8_1 = var3_ref_oc.field_n;
            if (stackIn_8_0 == stackIn_8_1) {
              var3_ref_oc.field_F = 0;
            }
            var3_ref_oc = (MidiNote) (this.field_y.field_u.next((byte) -70));
          }
        }
        stackIn_8_0Lifetime1 = 65;
        stackIn_8_1Lifetime1 = (10 - param1) / 37;
        var3 = stackIn_8_0Lifetime1 / stackIn_8_1Lifetime1;
    }

    final static void layoutLobbyPanels(int param0) {
        QuickChatMenuFactory.field_d.setBounds((byte) -92, TextMetricsGlobals.field_c.field_Hb - (IntroFinalFrameHelpers.field_b ? MouseInputHandler.field_e + 2 + 42 : 0), 0, 18, 0);
        if (param0 != 1753) {
          field_s = 47;
        }
        FullscreenErrorDialog.field_eb.setBounds((byte) -93, 42 + MouseInputHandler.field_e, 0, 18, -40 + TextMetricsGlobals.field_c.field_Hb + (-MouseInputHandler.field_e - 2));
        DateInputWidget.field_Q.setBoundsAndLayout(TextMetricsGlobals.field_c.field_Hb, MouseInputHandler.field_e, TextMetricsGlobals.field_c.field_R - 20, true, 20, 0, 2);
    }

    private final int computeVoicePan(byte param0, MidiNote param1) {
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
          var3_int = this.field_r[param1.field_n];
          var4 = -71 / ((-33 - param0) / 52);
          if (var3_int < 8192) {
            stackIn_4_0 = 32 + param1.field_r * var3_int >> 6;
            return stackIn_4_0;
          }
          stackIn_2_0 = -((-param1.field_r + 128) * (16384 - var3_int) + 32 >> 6) + 16384;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("g.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static Sprite[] createSolidFrameSprites(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = TetraLink.field_J;
        Sprite[] var7 = new Sprite[9];
        Sprite[] var4 = var7;
        var7[0] = FaceNormal.createSolidSprite(param1, param2, 0);
        for (var5 = 1; 9 > var5; var5++) {
          var7[var5] = var7[0];
        }
        var4[4] = FaceNormal.createSolidSprite(param0, 64, 0);
        if (param3 <= 44) {
          MidiPcmStream.sendShowGamePlayers(78, (byte) -73, -70);
        }
        return var4;
    }

    final synchronized void skipFrames(int param0) {
        int var2;
        long var3;
        int var6;
        int var5;
        boolean decompiledFrameCompleted0 = true;
        var6 = TetraLink.field_J;
        if (this.field_N.isReady()) {
          var2 = this.field_R * this.field_N.field_f / AudioOutput.field_k;
          while (true) {
            var3 = (long)param0 * (long)var2 + this.field_D;
            if (this.field_C - var3 >= 0L) {
              this.field_D = var3;
              break;
            }
            var5 = (int)((-1L + (long)var2 + this.field_C - this.field_D) / (long)var2);
            this.field_D = this.field_D + (long)var5 * (long)var2;
            this.field_y.skipFrames(var5);
            param0 = param0 - var5;
            this.dispatchDueMidiMessages((byte) 110);
            if (this.field_N.isReady()) {
              continue;
            }
            this.field_y.skipFrames(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if (decompiledFrameCompleted0) {
          this.field_y.skipFrames(param0);
        }

    }

    final synchronized void selectChannelBank(int param0, int param1, byte param2) {
        if (param2 >= -95) {
          this.handleChannelPressure((byte) 8, 116, 107);
        }
        this.setChannelBank(param0, -121, param1);
    }

    public static void releaseStatics(byte param0) {
        field_O = null;
        int var1 = -46 % ((54 - param0) / 62);
    }

    private final void handleChannelPressure(byte param0, int param1, int param2) {
        if (param0 != -62) {
          this.stop(96);
        }
    }

    final synchronized void setChannelVolume(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TetraLink.field_J;
        if (param2 <= 54) {
          return;
        }
        if (param1 >= 0) {
          this.field_w[param1] = param0;
        } else {
          for (var4 = 0; 16 > var4; var4++) {
            this.field_w[var4] = param0;
          }
        }
    }

    private final synchronized void stopTrack(int param0, boolean param1) {
        if (param0 != 487759088) {
          Archive var4 = (Archive) null;
          this.prepareTrack((SoundEffectLibrary) null, (MusicTrack) null, (Archive) null, -13, -73);
        }
        this.field_N.release();
        this.field_z = null;
        this.resetState(param1, (byte) 39);
    }

    final synchronized boolean isReady(byte param0) {
        int var2 = -65 / ((14 - param0) / 33);
        return this.field_N.isReady();
    }

    final boolean discardInactiveVoice(byte param0, MidiNote param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 94) {
            field_s = -84;
          }
          if (null != param1.field_I) {
            return false;
          }
          if (param1.field_v >= 0) {
            param1.unlink(false);
            if (param1.field_C > 0 &&
              param1 == this.field_J[param1.field_n][param1.field_C]) {
              this.field_J[param1.field_n][param1.field_C] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("g.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final synchronized int activity() {
        return 0;
    }

    private final void setRetriggerRate(int param0, int param1, int param2) {
        this.field_L[param0] = param2;
        if (param1 != 13242) {
          return;
        }
        this.field_T[param0] = (int)(0.5 + 2097152.0 * Math.pow(2.0, (double)param2 * 0.00054931640625));
    }

    final static void handleAccountRequestResult(String[] args, String param1, int param2, byte param3) {
        String[] var4 = null;
        int var5 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = TetraLink.field_J;
        try {
          if (param3 != 3) {
            field_O = (String) null;
          }
          PasswordLengthHelpers.field_a = RegistrationResponseHelpers.field_d;
          if (param2 != 255) {
            if (param2 >= 100 &&
              105 >= param2) {
              var4 = args;
              AccountTermsPanel.publishUsernameSuggestions(var4, 10532);
              FontAndBrightnessHelpers.field_f = MusicPatch.createSuggestedUsernameQuery((byte) -67, args);
              return;
            }
            FontAndBrightnessHelpers.field_f = QuickChatCategoryCache.createUsernameResponseQuery(param1, param2, false);
          } else {
            stackIn_7_0 = !(13 <= LoadingStepTracker.field_k);
            FontAndBrightnessHelpers.field_f = TextWidgetPainter.createFlagResult(stackIn_7_0, 1);
            AccountTermsPanel.publishUsernameSuggestions((String[]) null, param3 ^ 10535);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("g.H(");
          if (args == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void setChannelBank(int param0, int param1, int param2) {
        this.field_H[param0] = param2;
        this.field_M[param0] = StatusRequestHelpers.bitAnd(param2, -128);
        if (param1 >= -70) {
          this.setMasterVolume((byte) -28, 93);
        }
        this.setChannelProgramOffset(param2, -2, param0);
    }

    final static void sendShowGamePlayers(int param0, byte param1, int param2) {
        LobbyGame var6 = null;
        LobbyGame var7 = null;
        BitPacketBuffer var4 = null;
        if (param2 != QuickChatHelpDialog.field_Nb) {
          var6 = (LobbyGame) (QuickChatCommandType.field_e.findByKey((long)QuickChatHelpDialog.field_Nb, 1));
          var7 = var6;
          if (var7 != null) {
            var7.field_fc = null;
          }
          QuickChatHelpDialog.field_Nb = param2;
          var4 = QuickChatHelpDialog.field_Lb;
          var4.writeCipheredByte(param0, (byte) -92);
          var4.writeByte(3, false);
          var4.writeByte(11, false);
          var4.writeShort(param2, false);
        }
        if (param1 > -113) {
          MidiPcmStream.releaseStatics((byte) -93);
        }
    }

    final static void sendWithdrawJoinRequest(int param0, int param1, int param2) {
        BitPacketBuffer var3 = QuickChatHelpDialog.field_Lb;
        var3.writeCipheredByte(param2, (byte) -92);
        var3.writeByte(3, false);
        var3.writeByte(9, false);
        var3.writeShort(param0, false);
        if (param1 > -122) {
          MidiPcmStream.sendShowGamePlayers(39, (byte) -68, -123);
        }
    }

    private final void allSoundOff(byte param0, int param1) {
        MidiNote var3;
        int var4;
        int var5;
        var5 = TetraLink.field_J;
        var4 = -66 / ((9 - param0) / 45);
        var3 = (MidiNote) (this.field_y.field_u.first(false));
        while (var3 != null) {
          if (param1 < 0 ||
            var3.field_n == param1) {
            if (var3.field_I != null) {
              var3.field_I.fadeOutAndUnlink(AudioOutput.field_k / 100);
              if (var3.field_I.hasRemainingRampFrames()) {
                this.field_y.field_s.addSubStream(var3.field_I);
              }
              var3.releaseVoice(77);
            }
            if (0 > var3.field_v) {
              this.field_B[var3.field_n][var3.field_E] = null;
            }
            var3.unlink(false);
          }
          var3 = (MidiNote) (this.field_y.field_u.next((byte) -70));
        }
    }

    final synchronized void playTrack(boolean param0, MusicTrack param1, byte param2) {
        try {
          this.startTrack(param1, 0, true, param0);
          if (param2 <= 1) {
            this.field_W = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "g.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final synchronized PcmStream nextSubStream() {
        return null;
    }

    private final void releasePortamentoNotes(int param0, byte param1) {
        int var3;
        MidiNote var4;
        int var5;
        var5 = TetraLink.field_J;
        var3 = -107 / ((param1 + 65) / 51);
        if ((2 & this.field_I[param0]) != 0) {
          var4 = (MidiNote) (this.field_y.field_u.first(false));
          while (var4 != null) {
            if (~var4.field_n == ~param0) {
              if (this.field_B[param0][var4.field_E] != null) {
                var4 = (MidiNote) (this.field_y.field_u.next((byte) -70));
                continue;
              }
              if (var4.field_v < 0) {
                var4.field_v = 0;
              }
            }
            var4 = (MidiNote) (this.field_y.field_u.next((byte) -70));
          }
        }
    }

    final synchronized void releasePatchSamples(byte param0) {
        int var3 = TetraLink.field_J;
        if (param0 < 111) {
          this.activity();
        }
        MusicPatch var4 = (MusicPatch) (this.field_A.first(84));
        while (var4 != null) {
          var4.releaseNoteTable((byte) -118);
          var4 = (MusicPatch) (this.field_A.next(-1));
        }
    }

    final synchronized PcmStream firstSubStream() {
        return (PcmStream) ((Object) this.field_y);
    }

    private final void noteOn(int param0, int param1, int param2, int param3) {
        boolean stackIn_17_1 = false;
        MidiNote stackIn_17_2 = null;
        Object stackIn_18_0;
        boolean stackIn_18_3;
        MidiNote var5;
        int var6_int;
        PcmSample var6;
        MidiNote var7;
        MidiNote var8;
        int var9;
        MusicPatch var10;
        MusicPatch var11;
        var9 = TetraLink.field_J;
        this.noteOff(param0, (byte) 77, param3, 64);
        if ((this.field_I[param3] & 2) != 0) {
          var5 = (MidiNote) (this.field_y.field_u.last(true));
          while (var5 != null) {
            if (param3 == var5.field_n &&
              var5.field_v < 0) {
              this.field_B[param3][var5.field_E] = null;
              this.field_B[param3][param0] = var5;
              var6_int = (var5.field_D * var5.field_u >> 12) + var5.field_x;
              var5.field_x = var5.field_x + (-var5.field_E + param0 << 8);
              var5.field_E = param0;
              var5.field_D = 4096;
              var5.field_u = -var5.field_x + var6_int;
              return;
            }
            var5 = (MidiNote) (this.field_y.field_u.previous((byte) 14));
          }
        }
        var10 = (MusicPatch) (this.field_A.get((long)this.field_E[param3], (byte) -43));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_z[param0];
        if (var6 == null) {
          return;
        }
        var7 = new MidiNote();
        var7.field_B = var11;
        var7.field_y = var6;
        var7.field_n = param3;
        var7.field_q = var10.field_v[param0];
        if (param2 != -25798) {
          this.setTempoScale(-115, -32);
        }
        var7.field_C = var10.field_p[param0];
        var7.field_E = param0;
        var7.field_J = var10.field_A[param0] * (var11.field_C * param1 * param1) + 1024 >> 11;
        var7.field_r = 255 & var10.field_w[param0];
        var7.field_x = (param0 << 8) - (32767 & var10.field_o[param0]);
        var7.field_A = 0;
        var7.field_o = 0;
        var7.field_v = -1;
        var7.field_G = 0;
        var7.field_t = 0;
        if (this.field_G[param3] != 0) {
          var7.field_I = PcmSampleStream.createAtStepQ8(var6, this.computeVoiceSpeed(-18511, var7), 0, this.computeVoicePan((byte) 24, var7));
          stackIn_17_1 = false;
          stackIn_17_2 = var7;
          if (var11.field_o[param0] >= 0) {
            stackIn_18_0 = this;
            stackIn_18_3 = false;
          } else {
            stackIn_18_0 = this;
            stackIn_18_3 = true;
          }
          this.applyNoteSampleOffset(stackIn_17_1, stackIn_17_2, stackIn_18_3);
        } else {
          var7.field_I = PcmSampleStream.createAtStepQ8(var6, this.computeVoiceSpeed(-18511, var7), this.computeVoiceGain(var7, 16402), this.computeVoicePan((byte) 87, var7));
        }
        if (var11.field_o[param0] < 0) {
          var7.field_I.setLoopCount(-1);
        }
        if (0 <= var7.field_C) {
          var8 = this.field_J[param3][var7.field_C];
          if (var8 != null &&
            var8.field_v < 0) {
            this.field_B[param3][var8.field_E] = null;
            var8.field_v = 0;
          }
          this.field_J[param3][var7.field_C] = var7;
        }
        this.field_y.field_u.addLast(var7, false);
        this.field_B[param3][param0] = var7;
        return;
    }

    final synchronized void setMasterVolume(byte param0, int param1) {
        int var3 = 97 / ((param0 - 45) / 38);
        this.field_X = param1;
    }

    private final void setChannelPitchBend(int param0, int param1, int param2) {
        if (param0 != -27508) {
          return;
        }
        this.field_Q[param1] = param2;
    }

    private final void handleKeyPressure(boolean param0, int param1, int param2, int param3) {
        if (param0) {
          this.field_Y = -94;
        }
    }

    final boolean updateNote(int param0, int[] param1, int param2, MidiNote param3, int param4) {
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        MusicPatchEnvelope var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_34_0Lifetime1;
        int stackIn_34_1Lifetime1;
        int stackIn_53_0Lifetime1;
        int stackIn_53_1Lifetime1;
        var11 = TetraLink.field_J;
        try {
          param3.field_s = AudioOutput.field_k / 100;
          if (0 <= param3.field_v && (null == param3.field_I ||
            param3.field_I.isSamplePositionOutOfRange())) {
            param3.releaseVoice(-121);
            param3.unlink(false);
            if (param3.field_C > 0) {
              if (this.field_J[param3.field_n][param3.field_C] != param3) {
                return true;
              }
              this.field_J[param3.field_n][param3.field_C] = null;
            }
            return true;
          }
          var6_int = param3.field_D;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_V[param3.field_n]));
            if (var6_int < 0) {
              var6_int = 0;
            }
            param3.field_D = var6_int;
          }
          param3.field_I.setSampleStepMagnitude(this.computeVoiceSpeed(-18511, param3));
          if (param4 != 21107) {
            this.field_G = (int[]) null;
          }
          var7 = param3.field_q;
          param3.field_p = param3.field_p + var7.field_k;
          param3.field_H = param3.field_H + 1;
          var8 = 0;
          var9 = 0.000005086263020833333 * (double)((param3.field_E - 60 << 8) + (param3.field_D * param3.field_u >> 12));
          if (0 < var7.field_a) {
            if (var7.field_i <= 0) {
              param3.field_t = param3.field_t + 128;
            } else {
              param3.field_t = param3.field_t + (int)(Math.pow(2.0, (double)var7.field_i * var9) * 128.0 + 0.5);
            }
            if (param3.field_t * var7.field_a >= 819200) {
              var8 = 1;
            }
          }
          if (var7.field_d != null) {
            if (var7.field_b > 0) {
              param3.field_o = param3.field_o + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_b));
            } else {
              param3.field_o = param3.field_o + 128;
            }
            while (true) {
              if (var7.field_d.length - 2 > param3.field_G) {
                stackIn_34_0 = ~param3.field_o;
                stackIn_34_1 = ~((255 & var7.field_d[2 + param3.field_G]) << 8);
                if (stackIn_34_0 < stackIn_34_1) {
                  param3.field_G = param3.field_G + 2;
                  continue;
                }
              }
              stackIn_34_0Lifetime1 = var7.field_d.length - 2;
              stackIn_34_1Lifetime1 = param3.field_G;
              if (stackIn_34_0Lifetime1 != stackIn_34_1Lifetime1) {
                break;
              }
              if (var7.field_d[param3.field_G + 1] != 0) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (0 <= param3.field_v &&
            var7.field_e != null &&
            (this.field_I[param3.field_n] & 1) == 0 && (!(param3.field_C >= 0) ||
            this.field_J[param3.field_n][param3.field_C] != param3)) {
            if (var7.field_j > 0) {
              param3.field_v = param3.field_v + (int)(128.0 * Math.pow(2.0, (double)var7.field_j * var9) + 0.5);
            } else {
              param3.field_v = param3.field_v + 128;
            }
            while (true) {
              if ((-2 + var7.field_e.length) > param3.field_A) {
                stackIn_53_0 = var7.field_e[param3.field_A + 2] << 8 & 65280;
                stackIn_53_1 = param3.field_v;
                if (stackIn_53_0 < stackIn_53_1) {
                  param3.field_A = param3.field_A + 2;
                  continue;
                }
              }
              stackIn_53_0Lifetime1 = param3.field_A;
              stackIn_53_1Lifetime1 = var7.field_e.length - 2;
              if (stackIn_53_0Lifetime1 != stackIn_53_1Lifetime1) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (var8 == 0) {
            param3.field_I.rampVolumeAndPan(param3.field_s, this.computeVoiceGain(param3, 16402), this.computeVoicePan((byte) -118, param3));
            return false;
          }
          param3.field_I.fadeOutAndUnlink(param3.field_s);
          if (param1 != null) {
            param3.field_I.mixInto(param1, param0, param2);
          } else {
            param3.field_I.skipFrames(param2);
          }
          if (param3.field_I.hasRemainingRampFrames()) {
            this.field_y.field_s.addSubStream(param3.field_I);
          }
          param3.releaseVoice(59);
          if (param3.field_v >= 0) {
            param3.unlink(false);
            if (param3.field_C > 0 &&
              this.field_J[param3.field_n][param3.field_C] == param3) {
              this.field_J[param3.field_n][param3.field_C] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("g.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void resetChannelControllers(int param0, int param1) {
        int var4;
        var4 = TetraLink.field_J;
        if (0 > param0) {
          for (param0 = 0; param0 < 16; param0++) {
            this.resetChannelControllers(param0, 16384);
          }
        } else {
          if (param1 != 16384) {
            this.allSoundOff((byte) -88, 32);
          }
          this.field_u[param0] = 12800;
          this.field_r[param0] = 8192;
          this.field_W[param0] = 16383;
          this.field_Q[param0] = 8192;
          this.field_t[param0] = 0;
          this.field_V[param0] = 8192;
          this.releasePortamentoNotes(param0, (byte) 94);
          this.resetRetriggerPhase(param0, -52);
          this.field_I[param0] = 0;
          this.field_v[param0] = 32767;
          this.field_K[param0] = 256;
          this.field_G[param0] = 0;
          this.setRetriggerRate(param0, param1 - 3142, 8192);
        }
    }

    private final synchronized void startTrack(MusicTrack param0, int param1, boolean param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = TetraLink.field_J;
        try {
          this.stopTrack(487759088, param2);
          this.field_N.load(param0.field_o);
          this.field_x = param3 ? true : false;
          this.field_D = (long)param1;
          var5_int = this.field_N.trackCount();
          for (var6 = 0; var5_int > var6; var6++) {
            this.field_N.seekTrack(var6);
            this.field_N.readTrackDelta(var6);
            this.field_N.saveTrackPosition(var6);
          }
          this.field_Y = this.field_N.nextTrack();
          this.field_S = this.field_N.field_g[this.field_Y];
          this.field_C = this.field_N.tickTime(this.field_S);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "g.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void setChannelProgramOffset(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TetraLink.field_J;
        if (~param0 != ~this.field_E[param2]) {
          this.field_E[param2] = param0;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_J[param2][var4] = null;
          }
        }
        if (param1 != -2) {
          this.resetRetriggerPhase(-10, -14);
        }
    }

    private final int computeVoiceSpeed(int param0, MidiNote param1) {
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
          var3_int = (param1.field_D * param1.field_u >> 12) + param1.field_x;
          var3_int = var3_int + (this.field_K[param1.field_n] * (-8192 + this.field_Q[param1.field_n]) >> 12);
          var4 = param1.field_q;
          if (var4.field_k > 0 && (!(var4.field_c <= 0) ||
            this.field_t[param1.field_n] > 0)) {
            var5 = var4.field_c << 2;
            var6 = var4.field_h << 1;
            if (param1.field_H < var6) {
              var5 = var5 * param1.field_H / var6;
            }
            var5 = var5 + (this.field_t[param1.field_n] >> 7);
            var7 = Math.sin((double)(param1.field_p & 511) * 0.01227184630308513);
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)(0.5 + (double)(param1.field_y.field_o * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)AudioOutput.field_k);
          if (param0 != -18511) {
            this.field_v = (int[]) null;
          }
          stackIn_13_0 = (var5Lifetime1 < 1) ? 1 : var5Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("g.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized boolean prepareTrack(SoundEffectLibrary param0, MusicTrack param1, Archive param2, int param3, int param4) {
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
        PatchNoteUsage var8 = null;
        int var9 = 0;
        int var11 = 0;
        MusicPatch var12 = null;
        MusicPatch var13 = null;
        var11 = TetraLink.field_J;
        try {
          param1.buildPatchUsage();
          var6_int = 1;
          var7 = null;
          if (param3 > ~param4) {
            var7 = new int[]{param4};
          }
          var8 = (PatchNoteUsage) (param1.field_n.first(43));
          while (var8 != null) {
            boolean decompiledFrameRemainder0 = true;
            var9 = (int)var8.key;
            var12 = (MusicPatch) (this.field_A.get((long)var9, (byte) -43));
            if (var12 == null) {
              var13 = GzipDecompressor.loadInstrumentPatch(true, var9, param2);
              if (var13 == null) {
                var6_int = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_A.put((long)var9, -53, var13);
                decompiledFrameRemainder0 = !(var13.loadSamples((int[]) (var7), param0, (byte) -114, var8.field_p));
              }
            } else {
              decompiledFrameRemainder0 = !(var12.loadSamples((int[]) (var7), param0, (byte) -114, var8.field_p));
            }
            if (decompiledFrameRemainder0) {
              var6_int = 0;
            }
            var8 = (PatchNoteUsage) (param1.field_n.next(-1));
          }
          if (var6_int != 0) {
            param1.releasePatchUsage();
          }
          stackIn_19_0 = var6_int;
          return stackIn_19_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("g.SA(");
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
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int hashString(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          var2_int = param1.length();
          var3 = 0;
          if (param0 != -1) {
            field_s = 79;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = NetworkArchiveRequest.encodeExtendedChar(param1.charAt(var4), false) + (var3 << 5) - var3;
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("g.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final synchronized void stop(int param0) {
        if (param0 <= 18) {
          String var3 = (String) null;
          MidiPcmStream.handleAccountRequestResult((String[]) null, (String) null, -80, (byte) 37);
        }
        this.stopTrack(487759088, true);
    }

    final synchronized void setTempoScale(int param0, int param1) {
        this.field_R = param0;
        if (param1 > -9) {
          this.field_E = (int[]) null;
        }
    }

    private final void resetState(boolean param0, byte param1) {
        int var4 = TetraLink.field_J;
        int var3Lifetime1;
        if (param0) {
          this.allSoundOff((byte) -100, -1);
        } else {
          this.allNotesOff(-1, -120);
        }
        this.resetChannelControllers(-1, 16384);
        int var3 = 0;
        if (param1 < 9) {
          this.noteOn(-128, 56, -103, 34);
        }
        while (var3 < 16) {
          this.field_E[var3] = this.field_H[var3];
          var3++;
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_M[var5] = StatusRequestHelpers.bitAnd(this.field_H[var5], -128);
          var5++;
        }
    }

    final void applyNoteSampleOffset(boolean param0, MidiNote param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        MusicTrack var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param1.field_y.field_s.length;
          if (param0) {
            var7 = (MusicTrack) null;
            this.startTrack((MusicTrack) null, 123, false, false);
          }
          if (param2 &&
            param1.field_y.field_p) {
            var6 = -param1.field_y.field_q + var4_int + var4_int;
            var4_int = var4_int << 8;
            var5 = (int)((long)var6 * (long)this.field_G[param1.field_n] >> 6);
            if (var5 >= var4_int) {
              param1.field_I.setReversePlayback(true);
              var5 = -1 + var4_int + var4_int - var5;
            }
          } else {
            var5 = (int)((long)this.field_G[param1.field_n] * (long)var4_int >> 6);
          }
          param1.field_I.setPosition(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("g.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void allNotesOff(int param0, int param1) {
        int var4 = TetraLink.field_J;
        if (param1 >= -12) {
          this.field_M = (int[]) null;
        }
        MidiNote var3 = (MidiNote) (this.field_y.field_u.first(false));
        while (var3 != null) {
          if ((param0 < 0 || ~param0 == ~var3.field_n) &&
            !(0 <= var3.field_v)) {
            this.field_B[var3.field_n][var3.field_E] = null;
            var3.field_v = 0;
          }
          var3 = (MidiNote) (this.field_y.field_u.next((byte) -70));
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
        var8 = TetraLink.field_J;
        try {
          if (this.field_N.isReady()) {
            var4_int = this.field_R * this.field_N.field_f / AudioOutput.field_k;
            while (true) {
              var5 = this.field_D + (long)param2 * (long)var4_int;
              if (-var5 + this.field_C >= 0L) {
                this.field_D = var5;
              } else {
                var7 = (int)((-1L + ((long)var4_int + this.field_C - this.field_D)) / (long)var4_int);
                this.field_D = this.field_D + (long)var4_int * (long)var7;
                this.field_y.mixInto(param0, param1, var7);
                param1 = param1 + var7;
                param2 = param2 - var7;
                this.dispatchDueMidiMessages((byte) 111);
                if (this.field_N.isReady()) {
                  continue;
                }
              }
              break;
            }
            this.field_y.mixInto(param0, param1, param2);
            return;
          }
          this.field_y.mixInto(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("g.BA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void noteOff(int param0, byte param1, int param2, int param3) {
        MidiNote var6 = null;
        int var7 = TetraLink.field_J;
        MidiNote var8 = this.field_B[param2][param0];
        if (var8 == null) {
          return;
        }
        if (param1 != 77) {
          field_O = (String) null;
        }
        this.field_B[param2][param0] = null;
        if ((this.field_I[param2] & 2) == 0) {
          var8.field_v = 0;
        } else {
          var6 = (MidiNote) (this.field_y.field_u.first(false));
          while (var6 != null) {
            if (var6.field_n == var8.field_n &&
              0 > var6.field_v &&
              var8 != var6) {
              var8.field_v = 0;
              break;
            }
            var6 = (MidiNote) (this.field_y.field_u.next((byte) -70));
          }
        }
    }

    public MidiPcmStream() {
        this.field_r = new int[16];
        this.field_I = new int[16];
        this.field_R = 1000000;
        this.field_t = new int[16];
        this.field_X = 256;
        this.field_M = new int[16];
        this.field_K = new int[16];
        this.field_u = new int[16];
        this.field_H = new int[16];
        this.field_J = new MidiNote[16][128];
        this.field_V = new int[16];
        this.field_B = new MidiNote[16][128];
        this.field_v = new int[16];
        this.field_E = new int[16];
        this.field_T = new int[16];
        this.field_Q = new int[16];
        this.field_L = new int[16];
        this.field_G = new int[16];
        this.field_w = new int[16];
        this.field_W = new int[16];
        this.field_N = new MidiFileReader();
        this.field_y = new MusicPatchPcmStream(this);
        this.field_A = new NodeHashTable(128);
        this.setChannelVolume(256, -1, 61);
        this.resetState(true, (byte) 49);
    }

    static {
        field_s = 1;
    }
}
