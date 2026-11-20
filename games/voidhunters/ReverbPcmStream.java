/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReverbPcmStream extends PcmStream {
    private float crossWetGain;
    private PcmStream input;
    private float stereoWidth;
    private ReverbCombDelay[] rightCombDelays;
    private float wetGain;
    private float feedback;
    private float dampingCoefficient;
    private float dampingTime;
    private float dryGain;
    private int[] scratch;
    private float directWetGain;
    private float inputGain;
    private ReverbDiffusionDelay[] rightDiffusionDelays;
    private ReverbCombDelay[] leftCombDelays;
    private ReverbDiffusionDelay[] leftDiffusionDelays;

    final PcmStream firstSubStream() {
        return this.input;
    }

    private final void updateStereoBuffers() {
        int var1;
        if (!AudioOutput.stereo) {
          if (this.rightCombDelays != null) {
            for (var1 = 0; var1 < 8; var1++) {
              this.leftCombDelays[var1].clear();
            }
            for (var1 = 0; var1 < 4; var1++) {
              this.leftDiffusionDelays[var1].clear();
            }
            this.rightCombDelays = null;
            this.rightDiffusionDelays = null;
            this.scratch = new int[256];
          }
        } else {
          if (this.rightCombDelays == null) {
            for (var1 = 0; var1 < 8; var1++) {
              this.leftCombDelays[var1].clear();
            }
            for (var1 = 0; var1 < 4; var1++) {
              this.leftDiffusionDelays[var1].clear();
            }
            this.rightCombDelays = new ReverbCombDelay[8];
            this.rightCombDelays[0] = new ReverbCombDelay(1139 * AudioOutput.sampleRate / 44100);
            this.rightCombDelays[1] = new ReverbCombDelay(1211 * AudioOutput.sampleRate / 44100);
            this.rightCombDelays[2] = new ReverbCombDelay(1300 * AudioOutput.sampleRate / 44100);
            this.rightCombDelays[3] = new ReverbCombDelay(1379 * AudioOutput.sampleRate / 44100);
            this.rightCombDelays[4] = new ReverbCombDelay(1445 * AudioOutput.sampleRate / 44100);
            this.rightCombDelays[5] = new ReverbCombDelay(1514 * AudioOutput.sampleRate / 44100);
            this.rightCombDelays[6] = new ReverbCombDelay(1580 * AudioOutput.sampleRate / 44100);
            this.rightCombDelays[7] = new ReverbCombDelay(1640 * AudioOutput.sampleRate / 44100);
            this.rightDiffusionDelays = new ReverbDiffusionDelay[4];
            this.rightDiffusionDelays[0] = new ReverbDiffusionDelay(579 * AudioOutput.sampleRate / 44100);
            this.rightDiffusionDelays[1] = new ReverbDiffusionDelay(464 * AudioOutput.sampleRate / 44100);
            this.rightDiffusionDelays[2] = new ReverbDiffusionDelay(364 * AudioOutput.sampleRate / 44100);
            this.rightDiffusionDelays[3] = new ReverbDiffusionDelay(248 * AudioOutput.sampleRate / 44100);
            this.scratch = new int[512];
          }
        }
    }

    final synchronized void setStereoWidth(float param0) {
        this.stereoWidth = param0;
        this.directWetGain = (float)((double)this.wetGain * Math.sqrt((double)(1.0f + this.stereoWidth) * 0.5));
        this.crossWetGain = (float)((double)this.wetGain * Math.sqrt((double)(1.0f - this.stereoWidth) * 0.5));
    }

    private final static int scanNegativePeak(int param0, int[] param1, int param2, int param3) {
        int var4 = 0;
        int var5;
        if (param3 > param1.length) {
          param3 = param1.length;
        }
        for (var4 = 0; var4 < param3; var4++) {
          var5 = param1[param2];
          if (var5 > 0) {
            var5 = -var5;
          }
          if (var5 < param0) {
            param0 = var5;
          }
          param2++;
          if (param2 == param1.length) {
            param2 = 0;
          }
        }
        return param0;
    }

    final int getActivityWeight() {
        return 8;
    }

    final synchronized void setFeedback(float param0) {
        this.feedback = param0;
    }

    final synchronized void skip(int param0) {
        if (this.input != null) {
          this.input.skip(param0);
        }
    }

    final synchronized void mix(int[] param0, int param1, int param2) {
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$10 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        ReverbCombDelay var23;
        ReverbDiffusionDelay var24;
        ReverbCombDelay var25;
        ReverbDiffusionDelay var26;
        ReverbCombDelay var27;
        ReverbDiffusionDelay var28;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var6Lifetime2Lifetime1;
        this.updateStereoBuffers();
        param2 = param2 + param1;
        while (param1 < param2) {
          var4 = param2 - param1;
          if (var4 > 256) {
            var4 = 256;
          }
          if (this.input != null) {
            this.input.mix(this.scratch, 0, var4);
          }
          var5 = 0;
          for (var6 = 0; var6 < 8; var6++) {
            var5 = ReverbPcmStream.scanNegativePeak(var5, this.leftCombDelays[var6].samples, this.leftCombDelays[var6].cursor, var4);
          }
          for (var6Lifetime1 = 0; var6Lifetime1 < 4; var6Lifetime1++) {
            var5 = ReverbPcmStream.scanNegativePeak(var5, this.leftDiffusionDelays[var6Lifetime1].samples, this.leftDiffusionDelays[var6Lifetime1].cursor, var4);
          }
          if (AudioOutput.stereo) {
            for (var6Lifetime2 = 0; var6Lifetime2 < 8; var6Lifetime2++) {
              var5 = ReverbPcmStream.scanNegativePeak(var5, this.rightCombDelays[var6Lifetime2].samples, this.rightCombDelays[var6Lifetime2].cursor, var4);
            }
            for (var6Lifetime2Lifetime1 = 0; var6Lifetime2Lifetime1 < 4; var6Lifetime2Lifetime1++) {
              var5 = ReverbPcmStream.scanNegativePeak(var5, this.rightDiffusionDelays[var6Lifetime2Lifetime1].samples, this.rightDiffusionDelays[var6Lifetime2Lifetime1].cursor, var4);
            }
            var4 = var4 << 1;
            param1 = param1 << 1;
          }
          for (var6Lifetime3 = 0; var6Lifetime3 < var4; var6Lifetime3++) {
            var7 = this.scratch[var6Lifetime3];
            if (var7 > 0) {
              var7 = -var7;
            }
            if (var7 < var5) {
              var5 = var7;
            }
          }
          var6Lifetime4 = 0;
          while (var5 <= -4096) {
            var6Lifetime4++;
            var5 = var5 >> 1;
          }
          var7Lifetime1 = (int)(this.feedback * 4096.0f);
          var8 = (int)(this.dampingCoefficient * 4096.0f);
          var9 = (int)(this.dryGain * 4096.0f);
          var10 = (int)(this.inputGain * 65536.0f);
          if (!AudioOutput.stereo) {
            var11 = (int)(this.wetGain * 4096.0f);
            for (var12 = 0; var12 < var4; var12++) {
              var13 = this.scratch[var12] >> var6Lifetime4;
              var14 = var13 * var10 >> 16;
              var15 = 0;
              for (var16 = 0; var16 < 8; var16++) {
                var27 = this.leftCombDelays[var16];
                var18 = var27.samples[var27.cursor] >> var6Lifetime4;
                var19 = var27.filteredSample >> var6Lifetime4;
                var19 = var19 + ((var18 - var19) * var8 + 2048 >> 12);
                var27.filteredSample = var19 << var6Lifetime4;
                var27.samples[var27.cursor] = var14 + (var19 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                fieldTemp$3 = var27.cursor + 1;
                var27.cursor = var27.cursor + 1;
                if (fieldTemp$3 >= var27.samples.length) {
                  var27.cursor = 0;
                }
                var15 = var15 + var18;
              }
              for (var16 = 0; var16 < 4; var16++) {
                var28 = this.leftDiffusionDelays[var16];
                var18 = var28.samples[var28.cursor] >> var6Lifetime4;
                var15 = var18 - var15;
                var28.samples[var28.cursor] = var14 + (var18 * 2048 + 2048 >> 12) << var6Lifetime4;
                fieldTemp$2 = var28.cursor + 1;
                var28.cursor = var28.cursor + 1;
                if (fieldTemp$2 >= var28.samples.length) {
                  var28.cursor = 0;
                }
              }
              if (var6Lifetime4 <= 12) {
                incrementValue$0 = param1;
                param1++;
                param0[incrementValue$0] = param0[incrementValue$0] + (var15 * var11 + var13 * var9 >> 12 - var6Lifetime4);
              } else {
                incrementValue$1 = param1;
                param1++;
                param0[incrementValue$1] = param0[incrementValue$1] + (var15 * var11 + var13 * var9 << var6Lifetime4 - 12);
              }
            }
          } else {
            var11 = (int)(this.directWetGain * 4096.0f);
            var12 = (int)(this.crossWetGain * 4096.0f);
            var13 = 0;
            {
              while (!(var13 >= var4)) {
                incrementValue$4 = var13;
                var13++;
                var14 = this.scratch[incrementValue$4] >> var6Lifetime4;
                incrementValue$5 = var13;
                var13++;
                var15 = this.scratch[incrementValue$5] >> var6Lifetime4;
                var16 = (var14 + var15) * var10 >> 17;
                var17 = 0;
                for (var18 = 0; var18 < 8; var18++) {
                  var23 = this.leftCombDelays[var18];
                  var20 = var23.samples[var23.cursor] >> var6Lifetime4;
                  var21 = var23.filteredSample >> var6Lifetime4;
                  var21 = var21 + ((var20 - var21) * var8 + 2048 >> 12);
                  var23.filteredSample = var21 << var6Lifetime4;
                  var23.samples[var23.cursor] = var16 + (var21 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                  fieldTemp$13 = var23.cursor + 1;
                  var23.cursor = var23.cursor + 1;
                  if (fieldTemp$13 >= var23.samples.length) {
                    var23.cursor = 0;
                  }
                  var17 = var17 + var20;
                }
                for (var18 = 0; var18 < 4; var18++) {
                  var24 = this.leftDiffusionDelays[var18];
                  var20Lifetime1 = var24.samples[var24.cursor] >> var6Lifetime4;
                  var17 = var20Lifetime1 - var17;
                  var24.samples[var24.cursor] = var16 + (var20Lifetime1 * 2048 + 2048 >> 12) << var6Lifetime4;
                  fieldTemp$12 = var24.cursor + 1;
                  var24.cursor = var24.cursor + 1;
                  if (fieldTemp$12 >= var24.samples.length) {
                    var24.cursor = 0;
                  }
                }
                var18 = 0;
                for (var19 = 0; var19 < 8; var19++) {
                  var25 = this.rightCombDelays[var19];
                  var21Lifetime1 = var25.samples[var25.cursor] >> var6Lifetime4;
                  var22 = var25.filteredSample >> var6Lifetime4;
                  var22 = var22 + ((var21Lifetime1 - var22) * var8 + 2048 >> 12);
                  var25.filteredSample = var22 << var6Lifetime4;
                  var25.samples[var25.cursor] = var16 + (var22 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                  fieldTemp$11 = var25.cursor + 1;
                  var25.cursor = var25.cursor + 1;
                  if (fieldTemp$11 >= var25.samples.length) {
                    var25.cursor = 0;
                  }
                  var18 = var18 + var21Lifetime1;
                }
                for (var19 = 0; var19 < 4; var19++) {
                  var26 = this.rightDiffusionDelays[var19];
                  var21Lifetime2 = var26.samples[var26.cursor] >> var6Lifetime4;
                  var18 = var21Lifetime2 - var18;
                  var26.samples[var26.cursor] = var16 + (var21Lifetime2 * 2048 + 2048 >> 12) << var6Lifetime4;
                  fieldTemp$10 = var26.cursor + 1;
                  var26.cursor = var26.cursor + 1;
                  if (fieldTemp$10 >= var26.samples.length) {
                    var26.cursor = 0;
                  }
                }
                if (var6Lifetime4 <= 12) {
                  incrementValue$6 = param1;
                  param1++;
                  param0[incrementValue$6] = param0[incrementValue$6] + (var17 * var11 + var18 * var12 + var14 * var9 >> 12 - var6Lifetime4);
                  incrementValue$7 = param1;
                  param1++;
                  param0[incrementValue$7] = param0[incrementValue$7] + (var18 * var11 + var17 * var12 + var15 * var9 >> 12 - var6Lifetime4);
                  continue;
                }
                incrementValue$8 = param1;
                param1++;
                param0[incrementValue$8] = param0[incrementValue$8] + (var17 * var11 + var18 * var12 + var14 * var9 << var6Lifetime4 - 12);
                incrementValue$9 = param1;
                param1++;
                param0[incrementValue$9] = param0[incrementValue$9] + (var18 * var11 + var17 * var12 + var15 * var9 << var6Lifetime4 - 12);
              }
              {
                param1 = param1 >> 1;
              }
            }
          }
          if (this.input == null) {
            continue;
          }
          ArrayOperations.clear(this.scratch, 0, var4);
        }
    }

    final synchronized void setInputGain(float param0) {
        this.inputGain = param0;
    }

    final synchronized void setWetGain(float param0) {
        this.wetGain = param0;
        this.directWetGain = (float)((double)this.wetGain * Math.sqrt((double)(1.0f + this.stereoWidth) * 0.5));
        this.crossWetGain = (float)((double)this.wetGain * Math.sqrt((double)(1.0f - this.stereoWidth) * 0.5));
    }

    final synchronized void setDampingTime(float param0) {
        this.dampingTime = param0;
        this.dampingCoefficient = 1.0f - (float)Math.pow(0.5, 1000000.0 / (double)(this.dampingTime * (float)AudioOutput.sampleRate));
    }

    final synchronized void setDryGain(float param0) {
        this.dryGain = param0;
    }

    final PcmStream nextSubStream() {
        return null;
    }

    ReverbPcmStream(PcmStream param0) {
        this.leftCombDelays = new ReverbCombDelay[8];
        this.leftCombDelays[0] = new ReverbCombDelay(1116 * AudioOutput.sampleRate / 44100);
        this.leftCombDelays[1] = new ReverbCombDelay(1188 * AudioOutput.sampleRate / 44100);
        this.leftCombDelays[2] = new ReverbCombDelay(1277 * AudioOutput.sampleRate / 44100);
        this.leftCombDelays[3] = new ReverbCombDelay(1356 * AudioOutput.sampleRate / 44100);
        this.leftCombDelays[4] = new ReverbCombDelay(1422 * AudioOutput.sampleRate / 44100);
        this.leftCombDelays[5] = new ReverbCombDelay(1491 * AudioOutput.sampleRate / 44100);
        this.leftCombDelays[6] = new ReverbCombDelay(1557 * AudioOutput.sampleRate / 44100);
        this.leftCombDelays[7] = new ReverbCombDelay(1617 * AudioOutput.sampleRate / 44100);
        this.leftDiffusionDelays = new ReverbDiffusionDelay[4];
        this.leftDiffusionDelays[0] = new ReverbDiffusionDelay(556 * AudioOutput.sampleRate / 44100);
        this.leftDiffusionDelays[1] = new ReverbDiffusionDelay(441 * AudioOutput.sampleRate / 44100);
        this.leftDiffusionDelays[2] = new ReverbDiffusionDelay(341 * AudioOutput.sampleRate / 44100);
        this.leftDiffusionDelays[3] = new ReverbDiffusionDelay(225 * AudioOutput.sampleRate / 44100);
        if (!AudioOutput.stereo) {
          this.scratch = new int[256];
        }
        this.updateStereoBuffers();
        this.setInputGain(0.04500000178813934f);
        this.setWetGain(1.0f);
        this.setFeedback(0.8399999737739563f);
        this.setDryGain(1.0f);
        this.setDampingTime(7000.0f);
        this.setStereoWidth(1.0f);
        this.input = param0;
    }
}
