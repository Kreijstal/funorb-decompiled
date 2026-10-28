/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReverbPcmStream extends PcmStream {
    private float crossChannelGain;
    private float feedback;
    private ReverbAllPassFilter[] rightAllPasses;
    private float wetGain;
    private ReverbAllPassFilter[] leftAllPasses;
    private float dampingTimeMicros;
    private float sameChannelGain;
    private ReverbCombFilter[] rightCombs;
    private int[] inputBuffer;
    private PcmStream inputStream;
    private float dryGain;
    private float stereoWidth;
    private float inputGain;
    private ReverbCombFilter[] leftCombs;
    private float dampingStep;

    final synchronized void mixInto(int[] samples, int offset, int length) {
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var18;
        int var19;
        this.synchronizeChannelMode();
        length = length + offset;
        while (offset < length) {
          int var4 = length - offset;
          if (var4 > 256) {
            var4 = 256;
          }
          if (this.inputStream != null) {
            this.inputStream.mixInto(this.inputBuffer, 0, var4);
          }
          int var5 = 0;
          for (int var6 = 0; var6 < 8; var6++) {
            var5 = ReverbPcmStream.scanNegativePeak(var5, this.leftCombs[var6].delayBuffer, this.leftCombs[var6].delayIndex, var4);
          }
          for (int var6Lifetime1 = 0; var6Lifetime1 < 4; var6Lifetime1++) {
            var5 = ReverbPcmStream.scanNegativePeak(var5, this.leftAllPasses[var6Lifetime1].delayBuffer, this.leftAllPasses[var6Lifetime1].delayIndex, var4);
          }
          if (AudioOutput.stereo) {
            for (int var6Lifetime2 = 0; var6Lifetime2 < 8; var6Lifetime2++) {
              var5 = ReverbPcmStream.scanNegativePeak(var5, this.rightCombs[var6Lifetime2].delayBuffer, this.rightCombs[var6Lifetime2].delayIndex, var4);
            }
            for (int var6Lifetime2Lifetime1 = 0; var6Lifetime2Lifetime1 < 4; var6Lifetime2Lifetime1++) {
              var5 = ReverbPcmStream.scanNegativePeak(var5, this.rightAllPasses[var6Lifetime2Lifetime1].delayBuffer, this.rightAllPasses[var6Lifetime2Lifetime1].delayIndex, var4);
            }
            var4 = var4 << 1;
            offset = offset << 1;
          }
          for (int var6Lifetime3 = 0; var6Lifetime3 < var4; var6Lifetime3++) {
            int var7 = this.inputBuffer[var6Lifetime3];
            if (var7 > 0) {
              var7 = -var7;
            }
            if (var7 < var5) {
              var5 = var7;
            }
          }
          int var6Lifetime4 = 0;
          while (var5 <= -4096) {
            var6Lifetime4++;
            var5 = var5 >> 1;
          }
          int var7Lifetime1 = (int)(this.feedback * 4096.0f);
          int var8 = (int)(this.dampingStep * 4096.0f);
          int var9 = (int)(this.dryGain * 4096.0f);
          int var10 = (int)(this.inputGain * 65536.0f);
          if (!AudioOutput.stereo) {
            var11 = (int)(this.wetGain * 4096.0f);
            for (var12 = 0; var12 < var4; var12++) {
              var13 = this.inputBuffer[var12] >> var6Lifetime4;
              var14 = var13 * var10 >> 16;
              var15 = 0;
              for (var16 = 0; var16 < 8; var16++) {
                ReverbCombFilter var27 = this.leftCombs[var16];
                var18 = var27.delayBuffer[var27.delayIndex] >> var6Lifetime4;
                var19 = var27.filteredSample >> var6Lifetime4;
                var19 = var19 + ((var18 - var19) * var8 + 2048 >> 12);
                var27.filteredSample = var19 << var6Lifetime4;
                var27.delayBuffer[var27.delayIndex] = var14 + (var19 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                int fieldTemp$3 = var27.delayIndex + 1;
                var27.delayIndex = var27.delayIndex + 1;
                if (fieldTemp$3 >= var27.delayBuffer.length) {
                  var27.delayIndex = 0;
                }
                var15 = var15 + var18;
              }
              for (var16 = 0; var16 < 4; var16++) {
                ReverbAllPassFilter var28 = this.leftAllPasses[var16];
                var18 = var28.delayBuffer[var28.delayIndex] >> var6Lifetime4;
                var15 = var18 - var15;
                var28.delayBuffer[var28.delayIndex] = var14 + (var18 * 2048 + 2048 >> 12) << var6Lifetime4;
                int fieldTemp$2 = var28.delayIndex + 1;
                var28.delayIndex = var28.delayIndex + 1;
                if (fieldTemp$2 >= var28.delayBuffer.length) {
                  var28.delayIndex = 0;
                }
              }
              if (var6Lifetime4 <= 12) {
                int incrementValue$0 = offset;
                offset++;
                samples[incrementValue$0] = samples[incrementValue$0] + (var15 * var11 + var13 * var9 >> 12 - var6Lifetime4);
              } else {
                int incrementValue$1 = offset;
                offset++;
                samples[incrementValue$1] = samples[incrementValue$1] + (var15 * var11 + var13 * var9 << var6Lifetime4 - 12);
              }
            }
          } else {
            var11 = (int)(this.sameChannelGain * 4096.0f);
            var12 = (int)(this.crossChannelGain * 4096.0f);
            var13 = 0;
            {
              while (!(var13 >= var4)) {
                int incrementValue$4 = var13;
                var13++;
                var14 = this.inputBuffer[incrementValue$4] >> var6Lifetime4;
                int incrementValue$5 = var13;
                var13++;
                var15 = this.inputBuffer[incrementValue$5] >> var6Lifetime4;
                var16 = (var14 + var15) * var10 >> 17;
                int var17 = 0;
                for (var18 = 0; var18 < 8; var18++) {
                  ReverbCombFilter var23 = this.leftCombs[var18];
                  int var20 = var23.delayBuffer[var23.delayIndex] >> var6Lifetime4;
                  int var21 = var23.filteredSample >> var6Lifetime4;
                  var21 = var21 + ((var20 - var21) * var8 + 2048 >> 12);
                  var23.filteredSample = var21 << var6Lifetime4;
                  var23.delayBuffer[var23.delayIndex] = var16 + (var21 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                  int fieldTemp$13 = var23.delayIndex + 1;
                  var23.delayIndex = var23.delayIndex + 1;
                  if (fieldTemp$13 >= var23.delayBuffer.length) {
                    var23.delayIndex = 0;
                  }
                  var17 = var17 + var20;
                }
                for (var18 = 0; var18 < 4; var18++) {
                  ReverbAllPassFilter var24 = this.leftAllPasses[var18];
                  int var20Lifetime1 = var24.delayBuffer[var24.delayIndex] >> var6Lifetime4;
                  var17 = var20Lifetime1 - var17;
                  var24.delayBuffer[var24.delayIndex] = var16 + (var20Lifetime1 * 2048 + 2048 >> 12) << var6Lifetime4;
                  int fieldTemp$12 = var24.delayIndex + 1;
                  var24.delayIndex = var24.delayIndex + 1;
                  if (fieldTemp$12 >= var24.delayBuffer.length) {
                    var24.delayIndex = 0;
                  }
                }
                var18 = 0;
                for (var19 = 0; var19 < 8; var19++) {
                  ReverbCombFilter var25 = this.rightCombs[var19];
                  int var21Lifetime1 = var25.delayBuffer[var25.delayIndex] >> var6Lifetime4;
                  int var22 = var25.filteredSample >> var6Lifetime4;
                  var22 = var22 + ((var21Lifetime1 - var22) * var8 + 2048 >> 12);
                  var25.filteredSample = var22 << var6Lifetime4;
                  var25.delayBuffer[var25.delayIndex] = var16 + (var22 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                  int fieldTemp$11 = var25.delayIndex + 1;
                  var25.delayIndex = var25.delayIndex + 1;
                  if (fieldTemp$11 >= var25.delayBuffer.length) {
                    var25.delayIndex = 0;
                  }
                  var18 = var18 + var21Lifetime1;
                }
                for (var19 = 0; var19 < 4; var19++) {
                  ReverbAllPassFilter var26 = this.rightAllPasses[var19];
                  int var21Lifetime2 = var26.delayBuffer[var26.delayIndex] >> var6Lifetime4;
                  var18 = var21Lifetime2 - var18;
                  var26.delayBuffer[var26.delayIndex] = var16 + (var21Lifetime2 * 2048 + 2048 >> 12) << var6Lifetime4;
                  int fieldTemp$10 = var26.delayIndex + 1;
                  var26.delayIndex = var26.delayIndex + 1;
                  if (fieldTemp$10 >= var26.delayBuffer.length) {
                    var26.delayIndex = 0;
                  }
                }
                if (var6Lifetime4 <= 12) {
                  int incrementValue$6 = offset;
                  offset++;
                  samples[incrementValue$6] = samples[incrementValue$6] + (var17 * var11 + var18 * var12 + var14 * var9 >> 12 - var6Lifetime4);
                  int incrementValue$7 = offset;
                  offset++;
                  samples[incrementValue$7] = samples[incrementValue$7] + (var18 * var11 + var17 * var12 + var15 * var9 >> 12 - var6Lifetime4);
                  continue;
                }
                int incrementValue$8 = offset;
                offset++;
                samples[incrementValue$8] = samples[incrementValue$8] + (var17 * var11 + var18 * var12 + var14 * var9 << var6Lifetime4 - 12);
                int incrementValue$9 = offset;
                offset++;
                samples[incrementValue$9] = samples[incrementValue$9] + (var18 * var11 + var17 * var12 + var15 * var9 << var6Lifetime4 - 12);
              }
              {
                offset = offset >> 1;
              }
            }
          }
          if (this.inputStream == null) {
            continue;
          }
          ArraySupport.clear(this.inputBuffer, 0, var4);
        }
    }

    private final synchronized void setStereoWidth(float width) {
        this.stereoWidth = width;
        this.sameChannelGain = (float)((double)this.wetGain * Math.sqrt((double)(1.0f + this.stereoWidth) * 0.5));
        this.crossChannelGain = (float)((double)this.wetGain * Math.sqrt((double)(1.0f - this.stereoWidth) * 0.5));
    }

    final PcmStream firstSubstream() {
        return this.inputStream;
    }

    private final static int scanNegativePeak(int peak, int[] samples, int offset, int length) {
        if (length > samples.length) {
          length = samples.length;
        }
        for (int var4 = 0; var4 < length; var4++) {
          int var5 = samples[offset];
          if (var5 > 0) {
            var5 = -var5;
          }
          if (var5 < peak) {
            peak = var5;
          }
          offset++;
          if (offset == samples.length) {
            offset = 0;
          }
        }
        return peak;
    }

    private final synchronized void setDryGain(float gain) {
        this.dryGain = gain;
    }

    final synchronized void skip(int length) {
        if (this.inputStream != null) {
          this.inputStream.skip(length);
        }
    }

    private final synchronized void setWetGain(float gain) {
        this.wetGain = gain;
        this.sameChannelGain = (float)((double)this.wetGain * Math.sqrt((double)(1.0f + this.stereoWidth) * 0.5));
        this.crossChannelGain = (float)((double)this.wetGain * Math.sqrt((double)(1.0f - this.stereoWidth) * 0.5));
    }

    private final synchronized void setInputGain(float gain) {
        this.inputGain = gain;
    }

    private final void synchronizeChannelMode() {
        int var1;
        if (!AudioOutput.stereo) {
          if (this.rightCombs != null) {
            for (var1 = 0; var1 < 8; var1++) {
              this.leftCombs[var1].clear();
            }
            for (var1 = 0; var1 < 4; var1++) {
              this.leftAllPasses[var1].clear();
            }
            this.rightCombs = null;
            this.rightAllPasses = null;
            this.inputBuffer = new int[256];
          }
        } else if (this.rightCombs == null) {
          for (var1 = 0; var1 < 8; var1++) {
            this.leftCombs[var1].clear();
          }
          for (var1 = 0; var1 < 4; var1++) {
            this.leftAllPasses[var1].clear();
          }
          this.rightCombs = new ReverbCombFilter[8];
          this.rightCombs[0] = new ReverbCombFilter(1139 * AudioOutput.sampleRate / 44100);
          this.rightCombs[1] = new ReverbCombFilter(1211 * AudioOutput.sampleRate / 44100);
          this.rightCombs[2] = new ReverbCombFilter(1300 * AudioOutput.sampleRate / 44100);
          this.rightCombs[3] = new ReverbCombFilter(1379 * AudioOutput.sampleRate / 44100);
          this.rightCombs[4] = new ReverbCombFilter(1445 * AudioOutput.sampleRate / 44100);
          this.rightCombs[5] = new ReverbCombFilter(1514 * AudioOutput.sampleRate / 44100);
          this.rightCombs[6] = new ReverbCombFilter(1580 * AudioOutput.sampleRate / 44100);
          this.rightCombs[7] = new ReverbCombFilter(1640 * AudioOutput.sampleRate / 44100);
          this.rightAllPasses = new ReverbAllPassFilter[4];
          this.rightAllPasses[0] = new ReverbAllPassFilter(579 * AudioOutput.sampleRate / 44100);
          this.rightAllPasses[1] = new ReverbAllPassFilter(464 * AudioOutput.sampleRate / 44100);
          this.rightAllPasses[2] = new ReverbAllPassFilter(364 * AudioOutput.sampleRate / 44100);
          this.rightAllPasses[3] = new ReverbAllPassFilter(248 * AudioOutput.sampleRate / 44100);
          this.inputBuffer = new int[512];
        }
    }

    final synchronized void setDampingTimeMicros(float halfLifeMicros) {
        this.dampingTimeMicros = halfLifeMicros;
        this.dampingStep = 1.0f - (float)Math.pow(0.5, 1000000.0 / (double)(this.dampingTimeMicros * (float)AudioOutput.sampleRate));
    }

    final PcmStream nextSubstream() {
        return null;
    }

    final synchronized void setFeedback(float feedback) {
        this.feedback = feedback;
    }

    final int activity() {
        return 8;
    }

    ReverbPcmStream(PcmStream param0) {
        this.leftCombs = new ReverbCombFilter[8];
        this.leftCombs[0] = new ReverbCombFilter(1116 * AudioOutput.sampleRate / 44100);
        this.leftCombs[1] = new ReverbCombFilter(1188 * AudioOutput.sampleRate / 44100);
        this.leftCombs[2] = new ReverbCombFilter(1277 * AudioOutput.sampleRate / 44100);
        this.leftCombs[3] = new ReverbCombFilter(1356 * AudioOutput.sampleRate / 44100);
        this.leftCombs[4] = new ReverbCombFilter(1422 * AudioOutput.sampleRate / 44100);
        this.leftCombs[5] = new ReverbCombFilter(1491 * AudioOutput.sampleRate / 44100);
        this.leftCombs[6] = new ReverbCombFilter(1557 * AudioOutput.sampleRate / 44100);
        this.leftCombs[7] = new ReverbCombFilter(1617 * AudioOutput.sampleRate / 44100);
        this.leftAllPasses = new ReverbAllPassFilter[4];
        this.leftAllPasses[0] = new ReverbAllPassFilter(556 * AudioOutput.sampleRate / 44100);
        this.leftAllPasses[1] = new ReverbAllPassFilter(441 * AudioOutput.sampleRate / 44100);
        this.leftAllPasses[2] = new ReverbAllPassFilter(341 * AudioOutput.sampleRate / 44100);
        this.leftAllPasses[3] = new ReverbAllPassFilter(225 * AudioOutput.sampleRate / 44100);
        if (!AudioOutput.stereo) {
          this.inputBuffer = new int[256];
        }
        this.synchronizeChannelMode();
        this.setInputGain(0.04500000178813934f);
        this.setWetGain(1.0f);
        this.setFeedback(0.8399999737739563f);
        this.setDryGain(1.0f);
        this.setDampingTimeMicros(7000.0f);
        this.setStereoWidth(1.0f);
        this.inputStream = param0;
    }
}
