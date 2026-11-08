/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicCrossfadeStream extends PcmStream {
    private int[] field_u;
    private MusicTrack primaryTrack;
    private int fadeStep;
    private MidiPcmStream secondarySynthesizer;
    private int overlayMix256;
    private int primaryMixQ20;
    private boolean field_A;
    static tg[] field_y;
    private MidiPcmStream primarySynthesizer;
    static String thisisrunescapeclan;
    private int[] field_C;
    private boolean returnWhenTrackEnds;
    private MusicTrack overlayTrack;
    private MusicTrack secondaryTrack;
    private int masterGain;
    private MidiPcmStream overlaySynthesizer;
    private static IntrusiveDeque field_q;
    static UiComponent field_x;
    static String[] field_H;
    static int[] field_B;

    final static void c(int param0) {
        if (param0 != 946) {
          return;
        }
        MessageScreen.field_H = new IntrusiveDeque();
    }

    final void mixInto(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_36_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = Pool.field_O;
        try {
          if (this.masterGain <= 0) {
            this.skip(param2);
            return;
          }
          if (this.returnWhenTrackEnds) {
            if (0 < this.fadeStep &&
              !this.primarySynthesizer.d(-11414)) {
              this.fadeStep = -this.fadeStep;
              this.primaryTrack = null;
              this.returnWhenTrackEnds = false;
            } else {
              if (this.fadeStep < 0 &&
                !this.secondarySynthesizer.d(-11414)) {
                this.secondaryTrack = null;
                this.fadeStep = -this.fadeStep;
                this.returnWhenTrackEnds = false;
              }
            }
          }
          var4_int = this.masterGain * (this.primaryMixQ20 >> 12) / 256;
          var5 = -var4_int + this.masterGain;
          if (0 != this.fadeStep) {
            this.primaryMixQ20 = this.primaryMixQ20 + param2 * this.fadeStep;
            if (this.primaryMixQ20 >= 1048576) {
              this.primaryMixQ20 = 1048576;
              if (!this.returnWhenTrackEnds) {
                this.fadeStep = 0;
                if (!this.field_A) {
                  if (this.secondaryTrack != null) {
                    this.secondarySynthesizer.stopMusicPlayback(-1);
                  }
                  this.secondaryTrack = null;
                }
              }
            } else {
              if (0 >= this.primaryMixQ20) {
                this.primaryMixQ20 = 0;
                if (!this.returnWhenTrackEnds) {
                  this.fadeStep = 0;
                  if (!this.field_A) {
                    if (this.primaryTrack != null) {
                      this.primarySynthesizer.stopMusicPlayback(-1);
                    }
                    this.primaryTrack = null;
                  }
                }
              }
            }
          }
          if (AudioOutput.stereo) {
            stackIn_36_0 = param2 << 1;
          } else {
            stackIn_36_0 = param2;
          }
          var6 = stackIn_36_0;
          if (this.overlayMix256 < 256 && (null != this.primaryTrack ||
            null != this.secondaryTrack)) {
            if (256 != var4_int) {
              if (var5 != 256) {
                if (null != this.field_u &&
                  this.field_u.length >= var6) {
                  ArrayOperations.clearInts(this.field_u, 0, var6);
                  ArrayOperations.clearInts(this.field_C, 0, var6);
                } else {
                  this.field_C = new int[var6];
                  this.field_u = new int[var6];
                }
                this.primarySynthesizer.mixInto(this.field_u, 0, param2);
                this.secondarySynthesizer.mixInto(this.field_C, 0, param2);
                if (!AudioOutput.stereo) {
                  stackIn_50_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_50_0 = localTemp$0;
                }
                var7 = stackIn_50_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (this.field_C[var8] * var5 + var4_int * this.field_u[var8] >> 8);
                }
              } else {
                this.secondarySynthesizer.mixInto(param0, param1, param2);
              }
            } else {
              this.primarySynthesizer.mixInto(param0, param1, param2);
            }
          }
          if (null != this.overlayTrack) {
            if (0 == this.overlayMix256) {
              return;
            }
            if (null != this.field_u &&
              var6 <= this.field_u.length) {
              ArrayOperations.clearInts(this.field_u, 0, var6);
            } else {
              this.field_u = new int[var6];
              this.field_C = new int[var6];
            }
            this.overlaySynthesizer.mixInto(this.field_u, 0, param2);
            if (!AudioOutput.stereo) {
              stackIn_65_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_65_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_65_0;
            var8Lifetime1 = this.overlayMix256 * this.masterGain / 256;
            var9 = this.masterGain - var8Lifetime1;
            for (var10 = 0; var10 < var6; var10++) {
              param0[var10 + var7Lifetime1] = var9 * param0[var10 + var7Lifetime1] + var8Lifetime1 * this.field_u[var10] >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_71_0 = var4;
          stackIn_71_1 = new StringBuilder().append("rq.E(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static PlayingSound a(int param0, PcmSampleStream param1) {
        PlayingSound var2 = null;
        RuntimeException var2_ref = null;
        PlayingSound stackIn_2_0 = null;
        PlayingSound stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new PlayingSound(param1, param1);
          if (param0 < 93) {
            stackIn_2_0 = (PlayingSound) null;
            return stackIn_2_0;
          }
          UsernameSuggestionsPanel.field_R.addFirst((byte) -108, var2);
          ReportAbuseDialog.field_Xb.b(param1);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("rq.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        String dupTemp$0 = null;
        PoolMatchController stackIn_8_0 = null;
        StringBuilder stackIn_15_0 = null;
        String stackIn_16_1 = null;
        PoolMatchController var2;
        String var3;
        int var4;
        String var5;
        String var6;
        String var3Lifetime1;
        if (param0 != 0) {
          MusicCrossfadeStream.c(-63);
        }
        if (ContentTransitionDialog.field_pb.length > param1 &&
          0L != (1L << param1 & LinkButtonPainter.field_i)) {
          if (null == AccountContentDialog.field_ub) {
            stackIn_8_0 = TextWidgetPainter.field_e;
          } else {
            stackIn_8_0 = AccountContentDialog.field_ub;
          }
          var2 = stackIn_8_0;
          if (var2 != null) {
            var6 = new String(new char[]{(char)65, (char)108, (char)116, (char)32});
            var3 = var6;
            var4 = param1 / 10;
            if (0 != (2 & var4)) {
              var3 = var6 + "Ctrl ";
            }
            if ((1 & var4) != 0) {
              var3 = var3 + "Shift ";
            }
            stackIn_15_0 = new StringBuilder().append(var3);
            if (param1 % 10 < 9) {
              stackIn_16_1 = Integer.toString(param1 % 10 + 1);
            } else {
              stackIn_16_1 = "0";
            }
            dupTemp$0 = ((StringBuilder) (Object) stackIn_15_0).append(stackIn_16_1).toString();
            var5 = dupTemp$0;
            var3Lifetime1 = dupTemp$0;
            ProgressBarWidget.a(true, 0, var5 + ": " + ContentTransitionDialog.field_pb[param1][0], ContentTransitionDialog.field_pb[param1][1]);
          }
        }
    }

    public static void releaseStatics(byte param0) {
        field_x = null;
        field_H = null;
        field_q = null;
        field_y = null;
        thisisrunescapeclan = null;
        if (param0 < 42) {
          return;
        }
        field_B = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        StateIconLabel.field_Nb[jh.field_c] = param1;
        NetworkGameClient.field_H[jh.field_c] = jh.field_c;
        TickClock.field_g[jh.field_c] = param3;
        if (q.field_a < param3) {
          jl.field_c = param3;
        }
        if (!(ArchiveRequest.field_z <= param3)) {
          DiskCacheWorker.field_d = param3;
        }
        MenuScreen.field_y[jh.field_c] = param4;
        om.field_s[jh.field_c] = param5;
        gd.field_d[jh.field_c] = param0;
        if (!param2) {
          return;
        }
        int var6 = param5 + (param4 + param0);
        int var7 = var6 == 0 ? 0 : 1000 * param4 / var6;
        VertexNormal.field_c[jh.field_c] = var7;
        if (var7 < DiskCacheWorker.field_d) {
          DiskCacheWorker.field_d = var7;
        }
        if (!(var7 <= jl.field_c)) {
          jl.field_c = var7;
        }
        jh.field_c = jh.field_c + 1;
    }

    final synchronized void skip(int length) {
        int var3;
        boolean decompiledFrameRemainder0 = true;
        var3 = Pool.field_O;
        if (this.primaryMixQ20 > 0) {
          if (null != this.primaryTrack) {
            this.primarySynthesizer.skip(length);
            if (this.primaryMixQ20 >= 1048576) {
              if ((!(this.overlayMix256 <= 0)) &&
                ((null != this.overlayTrack))) {
                this.overlaySynthesizer.skip(length);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (null == this.secondaryTrack) {
                if ((!(this.overlayMix256 <= 0)) &&
                  ((null != this.overlayTrack))) {
                  this.overlaySynthesizer.skip(length);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.secondarySynthesizer.skip(length);
              }
            }
          } else {
            if (this.primaryMixQ20 >= 1048576) {
              if ((!(this.overlayMix256 <= 0)) &&
                ((null != this.overlayTrack))) {
                this.overlaySynthesizer.skip(length);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (null == this.secondaryTrack) {
                if ((!(this.overlayMix256 <= 0)) &&
                  ((null != this.overlayTrack))) {
                  this.overlaySynthesizer.skip(length);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.secondarySynthesizer.skip(length);
              }
            }
          }
        } else {
          if (this.primaryMixQ20 >= 1048576) {
            if ((!(this.overlayMix256 <= 0)) &&
              ((null != this.overlayTrack))) {
              this.overlaySynthesizer.skip(length);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (null == this.secondaryTrack) {
              if ((!(this.overlayMix256 <= 0)) &&
                ((null != this.overlayTrack))) {
                this.overlaySynthesizer.skip(length);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.secondarySynthesizer.skip(length);
            }
          }
        }
        if ((decompiledFrameRemainder0) && (this.overlayMix256 > 0 &&
          null != this.overlayTrack)) {
          this.overlaySynthesizer.skip(length);
        }
        if (this.returnWhenTrackEnds) {
          if (this.fadeStep > 0 &&
            !this.primarySynthesizer.d(-11414)) {
            this.returnWhenTrackEnds = false;
            this.fadeStep = -this.fadeStep;
            this.primaryTrack = null;
          } else {
            if (this.fadeStep < 0 &&
              !this.secondarySynthesizer.d(-11414)) {
              this.secondaryTrack = null;
              this.fadeStep = -this.fadeStep;
              this.returnWhenTrackEnds = false;
            }
          }
        }
        if (this.fadeStep != 0) {
          this.primaryMixQ20 = this.primaryMixQ20 + length * this.fadeStep;
          if (this.primaryMixQ20 < 1048576) {
            if (this.primaryMixQ20 <= 0) {
              this.primaryMixQ20 = 0;
              if (!this.returnWhenTrackEnds) {
                this.fadeStep = 0;
                if (!this.field_A) {
                  if (this.primaryTrack != null) {
                    this.primarySynthesizer.stopMusicPlayback(-1);
                  }
                  this.primaryTrack = null;
                }
              }
            }
          } else {
            this.primaryMixQ20 = 1048576;
            if (!this.returnWhenTrackEnds) {
              this.fadeStep = 0;
              if (!this.field_A) {
                if (null != this.secondaryTrack) {
                  this.secondarySynthesizer.stopMusicPlayback(-1);
                }
                this.secondaryTrack = null;
              }
            }
          }
        }
    }

    final static boolean a(int param0, int param1, boolean param2, double param3, int param4, double[] param5, int[] param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = param4 - 320;
          var9 = param1 - 240;
          var10 = -param3 * (double)((float)param6[6] * 0.0000152587890625f * (float)var9) / 512.0 + ((double)(0.0000152587890625f * (float)param6[9]) * -param3 + (double)((float)var8_int * ((float)param6[3] * 0.0000152587890625f)) * -param3 / 512.0);
          var12 = (double)(0.0000152587890625f * (float)param6[10]) * -param3 + (double)((float)var8_int * ((float)param6[4] * 0.0000152587890625f)) * -param3 / 512.0 + (double)((float)var9 * ((float)param6[7] * 0.0000152587890625f)) * -param3 / 512.0;
          var14 = -param3 * (double)((float)param6[8] * 0.0000152587890625f * (float)var9) / 512.0 + ((double)(0.0000152587890625f * (float)param6[11]) * -param3 + (double)((float)var8_int * (0.0000152587890625f * (float)param6[5])) * -param3 / 512.0);
          var16 = Math.sqrt(var10 * var10 + var12 * var12 + var14 * var14);
          var14 = var14 / var16;
          var12 = var12 / var16;
          var10 = var10 / var16;
          var18 = (double)(-param6[2] + param0) / var14;
          if (param2) {
            MusicCrossfadeStream.a((byte) -106, -122);
          }
          param5[0] = ((double)param6[0] + var10 * var18) / 8.0;
          param5[1] = ((double)param6[1] + var12 * var18) / 8.0;
          return ((0.0 > var14));
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("rq.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        DelayedServerPacket var6_ref_fr = null;
        int var7 = 0;
        byte[] var8 = null;
        DelayedServerPacket var9 = null;
        int var10 = 0;
        byte[] var11 = null;
        DelayedServerPacket var13 = null;
        byte[] var14 = null;
        byte[] var17 = null;
        int var6Lifetime1;
        var7 = Pool.field_O;
        try {
          if (WhirlpoolHasher.field_c != 0) {
            var2_long = rl.monotonicTimeMillis((byte) -94);
            var4 = WhirlpoolHasher.field_c;
            if (u.field_b != 0.0) {
              var4 = (int)((double)var4 + ValidationIconWidget.field_P.nextGaussian() * u.field_b);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            if (0 < JaggrabDownloader.field_j.position) {
              var14 = new byte[JaggrabDownloader.field_j.position];
              var11 = var14;
              var8 = var11;
              var17 = var8;
              for (var6 = 0; var6 < var14.length; var6++) {
                var8[var6] = JaggrabDownloader.field_j.payload[var6];
              }
              var6_ref_fr = new DelayedServerPacket((long)var4 + var2_long, JaggrabDownloader.field_j.position, var17);
              field_q.addFirst((byte) 90, var6_ref_fr);
              JaggrabDownloader.field_j.position = 0;
            }
            var9 = (DelayedServerPacket) (field_q.last((byte) -73));
            var13 = var9;
            if (var13 != null &&
              var13.field_p < var2_long) {
              var13.unlink((byte) -117);
              var10 = 0;
              var6Lifetime1 = var10;
              while (var10 < var13.field_r) {
                JaggrabDownloader.field_j.payload[var10] = var9.field_l[var10];
                var10++;
              }
              JaggrabDownloader.field_j.position = var13.field_r;
            }
          }
          if (param0 >= -16) {
            MusicCrossfadeStream.a((byte) -17, -81);
          }
          DebugTuningSupport.flushClientPackets(param1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "rq.L(" + param0 + ',' + param1 + ')');
        }
    }

    final PcmStream firstChildStream() {
        return null;
    }

    final synchronized void setMasterGain(int param0, int param1) {
        this.masterGain = param0;
        if (param1 != 11557) {
          field_H = (String[]) null;
        }
    }

    final synchronized int getSchedulingCost() {
        return 2;
    }

    final PcmStream nextChildStream() {
        return null;
    }

    private MusicCrossfadeStream() throws Throwable {
        throw new Error();
    }

    static {
        int var0 = 0;
        field_y = new tg[255];
        thisisrunescapeclan = "This is your RuneScape clan if you have one.";
        for (var0 = 0; var0 < field_y.length; var0++) {
          field_y[var0] = new tg();
        }
        field_B = new int[]{20, 21, 49, 6, 8};
    }
}
