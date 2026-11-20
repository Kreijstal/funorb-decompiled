/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSampleStream extends PcmStream {
    private int rampSamples;
    private int loopEnd;
    private int leftGainStep;
    private int step;
    private int loopStart;
    private int gainStep;
    private int position;
    private int rightGainStep;
    private boolean pingPongLoop;
    private int rightGain;
    private int leftGain;
    private int targetGain;
    private int gain;
    private int loopCount;
    private int pan;

    final static PcmSampleStream createRaw(PcmSample param0, int param1, int param2, int param3) {
        if (param0.samples == null) {
          return null;
        }
        if (param0.samples.length != 0) {
          return new PcmSampleStream(param0, param1, param2, param3);
        }
        return null;
    }

    private final static int mixReverseStereoInterpolatedRamped(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmSampleStream param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.gain = param13.gain - param13.gainStep * param5;
        if (param14 != 0) {
          param10 = param5 + (param12 + 256 - param4 + param14) / param14;
        }
        if (param14 == 0 ||
          param5 + (param12 + 256 - param4 + param14) / param14 > param11) {
          param10 = param11;
        }
        param5 = param5 << 1;
        param10 = param10 << 1;
        while (param5 < param10) {
          param1 = param4 >> 8;
          param0 = param2[param1 - 1];
          param0 = (param0 << 8) + (param2[param1] - param0) * (param4 & 255);
          incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          incrementValue$7 = param5;
          param5++;
          param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
          param7 = param7 + param9;
          param4 = param4 + param14;
        }
        if (param14 != 0) {
          param10 = (param5 >> 1) + (param12 - param4 + param14) / param14;
        }
        if (param14 == 0 ||
          (param5 >> 1) + (param12 - param4 + param14) / param14 > param11) {
          param10 = param11;
        }
        param10 = param10 << 1;
        param1 = param15;
        while (param5 < param10) {
          param0 = (param1 << 8) + (param2[param4 >> 8] - param1) * (param4 & 255);
          incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param7 = param7 + param9;
          param4 = param4 + param14;
        }
        param5 = param5 >> 1;
        param13.gain = param13.gain + param13.gainStep * param5;
        param13.leftGain = param6;
        param13.rightGain = param7;
        param13.position = param4;
        return param5;
    }

    final synchronized int getPan() {
        return this.pan < 0 ? -1 : this.pan;
    }

    final synchronized void setLoopCount(int param0) {
        this.loopCount = param0;
    }

    final synchronized void setPosition(int param0) {
        int var2 = ((PcmSample) (this.sound)).samples.length << 8;
        if (param0 < -1) {
          param0 = -1;
        }
        if (param0 > var2) {
          param0 = var2;
        }
        this.position = param0;
    }

    private final static int calculateLeftGain(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final synchronized void skip(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        PcmSample var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (this.rampSamples > 0) {
          if (param0 < this.rampSamples) {
            this.gain = this.gain + this.gainStep * param0;
            this.leftGain = this.leftGain + this.leftGainStep * param0;
            this.rightGain = this.rightGain + this.rightGainStep * param0;
            this.rampSamples = this.rampSamples - param0;
          } else {
            if (this.targetGain == -2147483648) {
              this.targetGain = 0;
              this.rightGain = 0;
              this.leftGain = 0;
              this.gain = 0;
              this.unlink(-3846);
              param0 = this.rampSamples;
            }
            this.rampSamples = 0;
            this.updateGains();
          }
        }
        var2 = (PcmSample) (this.sound);
        var3 = this.loopStart << 8;
        var4 = this.loopEnd << 8;
        var5 = var2.samples.length << 8;
        var6 = var4 - var3;
        if (var6 <= 0) {
          this.loopCount = 0;
        }
        if (this.position < 0) {
          if (this.step <= 0) {
            this.cancelRamp();
            this.unlink(-3846);
            return;
          }
          this.position = 0;
        }
        if (this.position >= var5) {
          if (this.step >= 0) {
            this.cancelRamp();
            this.unlink(-3846);
            return;
          }
          this.position = var5 - 1;
        }
        this.position = this.position + this.step * param0;
        if (this.loopCount < 0) {
          if (!this.pingPongLoop) {
            if (this.step >= 0) {
              if (this.position < var4) {
                return;
              }
              this.position = var3 + (this.position - var3) % var6;
              return;
            }
            if (this.position >= var3) {
              return;
            }
            this.position = var4 - 1 - (var4 - 1 - this.position) % var6;
            return;
          }
          if (this.step < 0) {
            if (this.position >= var3) {
              return;
            }
            this.position = var3 + var3 - 1 - this.position;
            this.step = -this.step;
          }
          while (this.position >= var4) {
            this.position = var4 + var4 - 1 - this.position;
            this.step = -this.step;
            if (this.position >= var3) {
              return;
            }
            this.position = var3 + var3 - 1 - this.position;
            this.step = -this.step;
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.loopCount > 0) {
          if (!this.pingPongLoop) {
            if (this.step >= 0) {
              if (this.position < var4) {
                return;
              }
              var7 = (this.position - var3) / var6;
              if (var7 >= this.loopCount) {
                this.position = this.position - var6 * this.loopCount;
                this.loopCount = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.position = this.position - var6 * var7;
                this.loopCount = this.loopCount - var7;
              }
            } else {
              if (this.position >= var3) {
                return;
              }
              var7 = (var4 - 1 - this.position) / var6;
              if (var7 >= this.loopCount) {
                this.position = this.position + var6 * this.loopCount;
                this.loopCount = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.position = this.position + var6 * var7;
                this.loopCount = this.loopCount - var7;
              }
            }
            if (decompiledFrameRemainder0) {
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.step < 0) {
              if (this.position >= var3) {
                return;
              }
              this.position = var3 + var3 - 1 - this.position;
              this.step = -this.step;
              fieldTemp$0 = this.loopCount - 1;
              this.loopCount = this.loopCount - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                if (this.position < var4) {
                  return;
                }
                this.position = var4 + var4 - 1 - this.position;
                this.step = -this.step;
                fieldTemp$1 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                if (this.position >= var3) {
                  return;
                }
                this.position = var3 + var3 - 1 - this.position;
                this.step = -this.step;
                fieldTemp$2 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.step >= 0) {
          if (this.position >= var5) {
            this.position = var5;
            this.cancelRamp();
            this.unlink(-3846);
          }
          return;
        }
        if (this.position >= 0) {
          return;
        }
        this.position = -1;
        this.cancelRamp();
        this.unlink(-3846);
    }

    private final void cancelRamp() {
        if (this.rampSamples != 0) {
          if (this.targetGain == -2147483648) {
            this.targetGain = 0;
          }
          this.rampSamples = 0;
          this.updateGains();
          return;
        }
    }

    final PcmStream nextSubStream() {
        return null;
    }

    private final static int mixForwardMonoInterpolatedRamped(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        param11.leftGain = param11.leftGain - param11.leftGainStep * param5;
        param11.rightGain = param11.rightGain - param11.rightGainStep * param5;
        if (param12 != 0) {
          param8 = param5 + (param10 - param4 + param12 - 257) / param12;
        }
        if (param12 == 0 ||
          param5 + (param10 - param4 + param12 - 257) / param12 > param9) {
          param8 = param9;
        }
        while (param5 < param8) {
          param1 = param4 >> 8;
          param0 = param2[param1];
          incrementValue$3 = param5;
          param5++;
          param3[incrementValue$3] = param3[incrementValue$3] + (((param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255)) * param6 >> 6);
          param6 = param6 + param7;
          param4 = param4 + param12;
        }
        if (param12 != 0) {
          param8 = param5 + (param10 - param4 + param12 - 1) / param12;
        }
        if (param12 == 0 ||
          param5 + (param10 - param4 + param12 - 1) / param12 > param9) {
          param8 = param9;
        }
        param1 = param13;
        while (param5 < param8) {
          param0 = param2[param4 >> 8];
          incrementValue$2 = param5;
          param5++;
          param3[incrementValue$2] = param3[incrementValue$2] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
          param6 = param6 + param7;
          param4 = param4 + param12;
        }
        param11.leftGain = param11.leftGain + param11.leftGainStep * param5;
        param11.rightGain = param11.rightGain + param11.rightGainStep * param5;
        param11.gain = param6;
        param11.position = param4;
        return param5;
    }

    final synchronized void rampGain(int param0, int param1) {
        this.rampTo(param0, param1, this.getPan());
    }

    final synchronized void setGainAndPan(int param0, int param1) {
        this.targetGain = param0;
        this.pan = param1;
        this.rampSamples = 0;
        this.updateGains();
    }

    final static PcmSampleStream createPanned(PcmSample param0, int param1, int param2, int param3) {
        if (param0.samples == null) {
          return null;
        }
        if (param0.samples.length != 0) {
          return new PcmSampleStream(param0, (int)((long)param0.sampleRate * 256L * (long)param1 / (long)(100 * AudioOutput.sampleRate)), param2 << 6, param3 << 6);
        }
        return null;
    }

    private final static int mixReverseMonoAligned(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, PcmSampleStream param8) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param2 - (param7 - 1);
        if (param3 + param2 - (param7 - 1) > param6) {
          param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
          incrementValue$0 = param3;
          param3++;
          incrementValue$1 = param2;
          param2--;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          incrementValue$2 = param3;
          param3++;
          incrementValue$3 = param2;
          param2--;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          incrementValue$4 = param3;
          param3++;
          incrementValue$5 = param2;
          param2--;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          incrementValue$6 = param3;
          param3++;
          incrementValue$7 = param2;
          param2--;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
          incrementValue$8 = param3;
          param3++;
          incrementValue$9 = param2;
          param2--;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
        }
        param8.position = param2 << 8;
        return param3;
    }

    private final static int mixForwardMonoInterpolated(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10, int param11, int param12) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        if (param11 != 0) {
          param7 = param5 + (param9 - param4 + param11 - 257) / param11;
        }
        if (param11 == 0 ||
          param5 + (param9 - param4 + param11 - 257) / param11 > param8) {
          param7 = param8;
        }
        while (param5 < param7) {
          param1 = param4 >> 8;
          param0 = param2[param1];
          incrementValue$1 = param5;
          param5++;
          param3[incrementValue$1] = param3[incrementValue$1] + (((param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255)) * param6 >> 6);
          param4 = param4 + param11;
        }
        if (param11 != 0) {
          param7 = param5 + (param9 - param4 + param11 - 1) / param11;
        }
        if (param11 == 0 ||
          param5 + (param9 - param4 + param11 - 1) / param11 > param8) {
          param7 = param8;
        }
        param1 = param12;
        while (param5 < param7) {
          param0 = param2[param4 >> 8];
          incrementValue$0 = param5;
          param5++;
          param3[incrementValue$0] = param3[incrementValue$0] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
          param4 = param4 + param11;
        }
        param10.position = param4;
        return param5;
    }

    private final static int mixReverseMonoInterpolatedRamped(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        param11.leftGain = param11.leftGain - param11.leftGainStep * param5;
        param11.rightGain = param11.rightGain - param11.rightGainStep * param5;
        if (param12 != 0) {
          param8 = param5 + (param10 + 256 - param4 + param12) / param12;
        }
        if (param12 == 0 ||
          param5 + (param10 + 256 - param4 + param12) / param12 > param9) {
          param8 = param9;
        }
        while (param5 < param8) {
          param1 = param4 >> 8;
          param0 = param2[param1 - 1];
          incrementValue$3 = param5;
          param5++;
          param3[incrementValue$3] = param3[incrementValue$3] + (((param0 << 8) + (param2[param1] - param0) * (param4 & 255)) * param6 >> 6);
          param6 = param6 + param7;
          param4 = param4 + param12;
        }
        if (param12 != 0) {
          param8 = param5 + (param10 - param4 + param12) / param12;
        }
        if (param12 == 0 ||
          param5 + (param10 - param4 + param12) / param12 > param9) {
          param8 = param9;
        }
        param0 = param13;
        param1 = param12;
        while (param5 < param8) {
          incrementValue$2 = param5;
          param5++;
          param3[incrementValue$2] = param3[incrementValue$2] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
          param6 = param6 + param7;
          param4 = param4 + param1;
        }
        param11.leftGain = param11.leftGain + param11.leftGainStep * param5;
        param11.rightGain = param11.rightGain + param11.rightGainStep * param5;
        param11.gain = param6;
        param11.position = param4;
        return param5;
    }

    final int getActivityWeight() {
        if (this.targetGain == 0 &&
          this.rampSamples == 0) {
          return 0;
        }
        return 1;
    }

    private final void updateGains() {
        this.gain = this.targetGain;
        this.leftGain = PcmSampleStream.calculateLeftGain(this.targetGain, this.pan);
        this.rightGain = PcmSampleStream.calculateRightGain(this.targetGain, this.pan);
    }

    final synchronized void fadeOut(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == 0) {
          this.setGain(0);
          this.unlink(-3846);
          return;
        }
        if (this.leftGain != 0) {
          var2 = -this.gain;
          if (this.gain > var2) {
            var2 = this.gain;
          }
          if (-this.leftGain > var2) {
            var2 = -this.leftGain;
          }
          if (this.leftGain > var2) {
            var2 = this.leftGain;
          }
          if (-this.rightGain > var2) {
            var2 = -this.rightGain;
          }
          if (this.rightGain > var2) {
            var2 = this.rightGain;
          }
          if (param0 > var2) {
            param0 = var2;
          }
          this.rampSamples = param0;
          this.targetGain = -2147483648;
          this.gainStep = -this.gain / param0;
          this.leftGainStep = -this.leftGain / param0;
          this.rightGainStep = -this.rightGain / param0;
          return;
        }
        if (this.rightGain != 0) {
          var2Lifetime1 = -this.gain;
          if (this.gain > var2Lifetime1) {
            var2Lifetime1 = this.gain;
          }
          if (-this.leftGain > var2Lifetime1) {
            var2Lifetime1 = -this.leftGain;
          }
          if (this.leftGain > var2Lifetime1) {
            var2Lifetime1 = this.leftGain;
          }
          if (-this.rightGain > var2Lifetime1) {
            var2Lifetime1 = -this.rightGain;
          }
          if (this.rightGain > var2Lifetime1) {
            var2Lifetime1 = this.rightGain;
          }
          if (param0 > var2Lifetime1) {
            param0 = var2Lifetime1;
          }
          this.rampSamples = param0;
          this.targetGain = -2147483648;
          this.gainStep = -this.gain / param0;
          this.leftGainStep = -this.leftGain / param0;
          this.rightGainStep = -this.rightGain / param0;
          return;
        }
        this.rampSamples = 0;
        this.targetGain = 0;
        this.gain = 0;
        this.unlink(-3846);
    }

    private final static int mixForwardMonoAlignedRamped(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmSampleStream param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        param2 = param2 >> 8;
        param8 = param8 >> 8;
        param4 = param4 << 2;
        param5 = param5 << 2;
        param6 = param3 + param8 - param2;
        if (param3 + param8 - param2 > param7) {
          param6 = param7;
        }
        param9.leftGain = param9.leftGain + param9.leftGainStep * (param6 - param3);
        param9.rightGain = param9.rightGain + param9.rightGainStep * (param6 - param3);
        param6 -= 3;
        while (param3 < param6) {
          incrementValue$0 = param3;
          param3++;
          incrementValue$1 = param2;
          param2++;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          param4 = param4 + param5;
          incrementValue$2 = param3;
          param3++;
          incrementValue$3 = param2;
          param2++;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          param4 = param4 + param5;
          incrementValue$4 = param3;
          param3++;
          incrementValue$5 = param2;
          param2++;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          param4 = param4 + param5;
          incrementValue$6 = param3;
          param3++;
          incrementValue$7 = param2;
          param2++;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
          param4 = param4 + param5;
        }
        param6 += 3;
        while (param3 < param6) {
          incrementValue$8 = param3;
          param3++;
          incrementValue$9 = param2;
          param2++;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
          param4 = param4 + param5;
        }
        param9.gain = param4 >> 2;
        param9.position = param2 << 8;
        return param3;
    }

    private final static int mixReverseMonoInterpolated(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10, int param11, int param12) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        if (param11 != 0) {
          param7 = param5 + (param9 + 256 - param4 + param11) / param11;
        }
        if (param11 == 0 ||
          param5 + (param9 + 256 - param4 + param11) / param11 > param8) {
          param7 = param8;
        }
        while (param5 < param7) {
          param1 = param4 >> 8;
          param0 = param2[param1 - 1];
          incrementValue$1 = param5;
          param5++;
          param3[incrementValue$1] = param3[incrementValue$1] + (((param0 << 8) + (param2[param1] - param0) * (param4 & 255)) * param6 >> 6);
          param4 = param4 + param11;
        }
        if (param11 != 0) {
          param7 = param5 + (param9 - param4 + param11) / param11;
        }
        if (param11 == 0 ||
          param5 + (param9 - param4 + param11) / param11 > param8) {
          param7 = param8;
        }
        param0 = param12;
        param1 = param11;
        while (param5 < param7) {
          incrementValue$0 = param5;
          param5++;
          param3[incrementValue$0] = param3[incrementValue$0] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
          param4 = param4 + param1;
        }
        param10.position = param4;
        return param5;
    }

    private final int mixForward(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.rampSamples <= 0) {
            if (this.step == 256 &&
              (this.position & 255) == 0) {
              if (AudioOutput.stereo) {
                return PcmSampleStream.mixForwardStereoAligned(0, ((PcmSample) (this.sound)).samples, param0, this.position, param1, this.leftGain, this.rightGain, 0, param3, param2, this);
              }
              return PcmSampleStream.mixForwardMonoAligned(((PcmSample) (this.sound)).samples, param0, this.position, param1, this.gain, 0, param3, param2, this);
            }
            if (AudioOutput.stereo) {
              return PcmSampleStream.mixForwardStereoInterpolated(0, 0, ((PcmSample) (this.sound)).samples, param0, this.position, param1, this.leftGain, this.rightGain, 0, param3, param2, this, this.step, param4);
            }
            return PcmSampleStream.mixForwardMonoInterpolated(0, 0, ((PcmSample) (this.sound)).samples, param0, this.position, param1, this.gain, 0, param3, param2, this, this.step, param4);
          }
          var6 = param1 + this.rampSamples;
          if (var6 > param3) {
            var6 = param3;
          }
          this.rampSamples = this.rampSamples + param1;
          if (this.step == 256 &&
            (this.position & 255) == 0) {
            if (!AudioOutput.stereo) {
              param1 = PcmSampleStream.mixForwardMonoAlignedRamped(((PcmSample) (this.sound)).samples, param0, this.position, param1, this.gain, this.gainStep, 0, var6, param2, this);
            } else {
              param1 = PcmSampleStream.mixForwardStereoAlignedRamped(0, ((PcmSample) (this.sound)).samples, param0, this.position, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this);
            }
          } else {
            if (!AudioOutput.stereo) {
              param1 = PcmSampleStream.mixForwardMonoInterpolatedRamped(0, 0, ((PcmSample) (this.sound)).samples, param0, this.position, param1, this.gain, this.gainStep, 0, var6, param2, this, this.step, param4);
            } else {
              param1 = PcmSampleStream.mixForwardStereoInterpolatedRamped(0, 0, ((PcmSample) (this.sound)).samples, param0, this.position, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this, this.step, param4);
            }
          }
          this.rampSamples = this.rampSamples - param1;
          if (this.rampSamples != 0) {
            return param1;
          }
        } while (!this.finishRamp());
        return param3;
    }

    private final static int mixReverseMonoAlignedRamped(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmSampleStream param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        param2 = param2 >> 8;
        param8 = param8 >> 8;
        param4 = param4 << 2;
        param5 = param5 << 2;
        param6 = param3 + param2 - (param8 - 1);
        if (param3 + param2 - (param8 - 1) > param7) {
          param6 = param7;
        }
        param9.leftGain = param9.leftGain + param9.leftGainStep * (param6 - param3);
        param9.rightGain = param9.rightGain + param9.rightGainStep * (param6 - param3);
        param6 -= 3;
        while (param3 < param6) {
          incrementValue$0 = param3;
          param3++;
          incrementValue$1 = param2;
          param2--;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          param4 = param4 + param5;
          incrementValue$2 = param3;
          param3++;
          incrementValue$3 = param2;
          param2--;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          param4 = param4 + param5;
          incrementValue$4 = param3;
          param3++;
          incrementValue$5 = param2;
          param2--;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          param4 = param4 + param5;
          incrementValue$6 = param3;
          param3++;
          incrementValue$7 = param2;
          param2--;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
          param4 = param4 + param5;
        }
        param6 += 3;
        while (param3 < param6) {
          incrementValue$8 = param3;
          param3++;
          incrementValue$9 = param2;
          param2--;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
          param4 = param4 + param5;
        }
        param9.gain = param4 >> 2;
        param9.position = param2 << 8;
        return param3;
    }

    private final static int mixForwardStereoAlignedRamped(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmSampleStream param12) {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        param3 = param3 >> 8;
        param11 = param11 >> 8;
        param5 = param5 << 2;
        param6 = param6 << 2;
        param7 = param7 << 2;
        param8 = param8 << 2;
        param9 = param4 + param11 - param3;
        if (param4 + param11 - param3 > param10) {
          param9 = param10;
        }
        param12.gain = param12.gain + param12.gainStep * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        while (param4 < param9) {
          param0 = param1[param3++];
          incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3++];
          incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3++];
          incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3++];
          incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
          param6 = param6 + param8;
        }
        param9 += 6;
        while (param4 < param9) {
          param0 = param1[param3++];
          incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
          param6 = param6 + param8;
        }
        param12.leftGain = param5 >> 2;
        param12.rightGain = param6 >> 2;
        param12.position = param3 << 8;
        return param4 >> 1;
    }

    final synchronized boolean isOutOfBounds() {
        return this.position < 0 || this.position >= ((PcmSample) (this.sound)).samples.length << 8;
    }

    private final static int mixForwardStereoInterpolated(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        if (param12 != 0) {
          param8 = param5 + (param10 - param4 + param12 - 257) / param12;
        }
        if (param12 == 0 ||
          param5 + (param10 - param4 + param12 - 257) / param12 > param9) {
          param8 = param9;
        }
        param5 = param5 << 1;
        param8 = param8 << 1;
        while (param5 < param8) {
          param1 = param4 >> 8;
          param0 = param2[param1];
          param0 = (param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255);
          incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          incrementValue$7 = param5;
          param5++;
          param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
          param4 = param4 + param12;
        }
        if (param12 != 0) {
          param8 = (param5 >> 1) + (param10 - param4 + param12 - 1) / param12;
        }
        if (param12 == 0 ||
          (param5 >> 1) + (param10 - param4 + param12 - 1) / param12 > param9) {
          param8 = param9;
        }
        param8 = param8 << 1;
        param1 = param13;
        while (param5 < param8) {
          param0 = param2[param4 >> 8];
          param0 = (param0 << 8) + (param1 - param0) * (param4 & 255);
          incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param4 = param4 + param12;
        }
        param11.position = param4;
        return param5 >> 1;
    }

    private final static int mixReverseStereoAligned(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10) {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        param3 = param3 >> 8;
        param9 = param9 >> 8;
        param5 = param5 << 2;
        param6 = param6 << 2;
        param7 = param4 + param3 - (param9 - 1);
        if (param4 + param3 - (param9 - 1) > param8) {
          param7 = param8;
        }
        param4 = param4 << 1;
        param7 = param7 << 1;
        param7 -= 6;
        while (param4 < param7) {
          param0 = param1[param3--];
          incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param0 = param1[param3--];
          incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param0 = param1[param3--];
          incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param0 = param1[param3--];
          incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
        }
        param7 += 6;
        while (param4 < param7) {
          param0 = param1[param3--];
          incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
        }
        param10.position = param3 << 8;
        return param4 >> 1;
    }

    final synchronized int getTargetGain() {
        return this.targetGain == -2147483648 ? 0 : this.targetGain;
    }

    private final static int mixForwardStereoAligned(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10) {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        param3 = param3 >> 8;
        param9 = param9 >> 8;
        param5 = param5 << 2;
        param6 = param6 << 2;
        param7 = param4 + param9 - param3;
        if (param4 + param9 - param3 > param8) {
          param7 = param8;
        }
        param4 = param4 << 1;
        param7 = param7 << 1;
        param7 -= 6;
        while (param4 < param7) {
          param0 = param1[param3++];
          incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param0 = param1[param3++];
          incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param0 = param1[param3++];
          incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param0 = param1[param3++];
          incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
        }
        param7 += 6;
        while (param4 < param7) {
          param0 = param1[param3++];
          incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
        }
        param10.position = param3 << 8;
        return param4 >> 1;
    }

    final synchronized void mix(int[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int discarded$4 = 0;
        int discarded$3 = 0;
        PcmSample var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var10Lifetime1;
        if (this.targetGain == 0 &&
          this.rampSamples == 0) {
          this.skip(param2);
          return;
        }
        var4 = (PcmSample) (this.sound);
        var5 = this.loopStart << 8;
        var6 = this.loopEnd << 8;
        var7 = var4.samples.length << 8;
        var8 = var6 - var5;
        if (var8 <= 0) {
          this.loopCount = 0;
        }
        var9 = param1;
        param2 = param2 + param1;
        if (this.position < 0) {
          if (this.step <= 0) {
            this.cancelRamp();
            this.unlink(-3846);
            return;
          }
          this.position = 0;
        }
        if (this.position >= var7) {
          if (this.step >= 0) {
            this.cancelRamp();
            this.unlink(-3846);
            return;
          }
          this.position = var7 - 1;
        }
        if (this.loopCount < 0) {
          if (!this.pingPongLoop) {
            if (this.step >= 0) {
              while (true) {
                var9 = this.mixForward(param0, var9, var6, param2, (int) var4.samples[this.loopStart]);
                if (this.position < var6) {
                  return;
                }
                this.position = var5 + (this.position - var5) % var8;
              }
            }
            while (true) {
              var9 = this.mixReverse(param0, var9, var5, param2, (int) var4.samples[this.loopEnd - 1]);
              if (this.position >= var5) {
                return;
              }
              this.position = var6 - 1 - (var6 - 1 - this.position) % var8;
            }
          }
          if (this.step < 0) {
            var9 = this.mixReverse(param0, var9, var5, param2, (int) var4.samples[this.loopStart]);
            if (this.position >= var5) {
              return;
            }
            this.position = var5 + var5 - 1 - this.position;
            this.step = -this.step;
          }
          while (true) {
            var9 = this.mixForward(param0, var9, var6, param2, (int) var4.samples[this.loopEnd - 1]);
            if (this.position < var6) {
              return;
            }
            this.position = var6 + var6 - 1 - this.position;
            this.step = -this.step;
            var9 = this.mixReverse(param0, var9, var5, param2, (int) var4.samples[this.loopStart]);
            if (this.position >= var5) {
              return;
            }
            this.position = var5 + var5 - 1 - this.position;
            this.step = -this.step;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.loopCount > 0) {
          if (!this.pingPongLoop) {
            if (this.step < 0) {
              while (true) {
                var9 = this.mixReverse(param0, var9, var5, param2, (int) var4.samples[this.loopEnd - 1]);
                if (this.position >= var5) {
                  return;
                }
                var10 = (var6 - 1 - this.position) / var8;
                if (var10 < this.loopCount) {
                  this.position = this.position + var8 * var10;
                  this.loopCount = this.loopCount - var10;
                  continue;
                }
                break;
              }
              this.position = this.position + var8 * this.loopCount;
              this.loopCount = 0;
            } else {
              while (true) {
                var9 = this.mixForward(param0, var9, var6, param2, (int) var4.samples[this.loopStart]);
                if (this.position < var6) {
                  return;
                }
                var10Lifetime1 = (this.position - var5) / var8;
                if (var10Lifetime1 < this.loopCount) {
                  this.position = this.position - var8 * var10Lifetime1;
                  this.loopCount = this.loopCount - var10Lifetime1;
                  continue;
                }
                break;
              }
              this.position = this.position - var8 * this.loopCount;
              this.loopCount = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.step < 0) {
              var9 = this.mixReverse(param0, var9, var5, param2, (int) var4.samples[this.loopStart]);
              if (this.position >= var5) {
                return;
              }
              this.position = var5 + var5 - 1 - this.position;
              this.step = -this.step;
              fieldTemp$0 = this.loopCount - 1;
              this.loopCount = this.loopCount - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                var9 = this.mixForward(param0, var9, var6, param2, (int) var4.samples[this.loopEnd - 1]);
                if (this.position < var6) {
                  return;
                }
                this.position = var6 + var6 - 1 - this.position;
                this.step = -this.step;
                fieldTemp$1 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                var9 = this.mixReverse(param0, var9, var5, param2, (int) var4.samples[this.loopStart]);
                if (this.position >= var5) {
                  return;
                }
                this.position = var5 + var5 - 1 - this.position;
                this.step = -this.step;
                fieldTemp$2 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.step >= 0) {
          discarded$4 = this.mixForward(param0, var9, var7, param2, 0);
          if (this.position >= var7) {
            this.position = var7;
            this.cancelRamp();
            this.unlink(-3846);
          }
          return;
        }
        discarded$3 = this.mixReverse(param0, var9, 0, param2, 0);
        if (this.position >= 0) {
          return;
        }
        this.position = -1;
        this.cancelRamp();
        this.unlink(-3846);
        return;
    }

    final int getPriority() {
        int var1 = this.gain * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.loopCount == 0) {
          var1 = var1 - var1 * this.position / (((PcmSample) (this.sound)).samples.length << 8);
        } else {
          if (this.loopCount >= 0) {
            var1 = var1 - var1 * this.loopStart / ((PcmSample) (this.sound)).samples.length;
          }
        }
        return var1 > 255 ? 255 : var1;
    }

    private final boolean finishRamp() {
        int var1;
        int var2;
        int var3;
        var1 = this.targetGain;
        if (var1 != -2147483648) {
          var2 = PcmSampleStream.calculateLeftGain(var1, this.pan);
          var3 = PcmSampleStream.calculateRightGain(var1, this.pan);
        } else {
          var3 = 0;
          var2 = 0;
          var1 = 0;
        }
        if (this.gain == var1 &&
          this.leftGain == var2 &&
          this.rightGain == var3) {
          if (this.targetGain != -2147483648) {
            this.updateGains();
            return false;
          }
          this.targetGain = 0;
          this.rightGain = 0;
          this.leftGain = 0;
          this.gain = 0;
          this.unlink(-3846);
          return true;
        }
        if (this.gain >= var1) {
          if (this.gain <= var1) {
            this.gainStep = 0;
          } else {
            this.gainStep = -1;
            this.rampSamples = this.gain - var1;
          }
        } else {
          this.gainStep = 1;
          this.rampSamples = var1 - this.gain;
        }
        if (this.leftGain >= var2) {
          if (this.leftGain <= var2) {
            this.leftGainStep = 0;
          } else {
            this.leftGainStep = -1;
            if (this.rampSamples == 0 ||
              this.rampSamples > this.leftGain - var2) {
              this.rampSamples = this.leftGain - var2;
            }
          }
        } else {
          this.leftGainStep = 1;
          if (this.rampSamples == 0 ||
            this.rampSamples > var2 - this.leftGain) {
            this.rampSamples = var2 - this.leftGain;
          }
        }
        if (this.rightGain < var3) {
          this.rightGainStep = 1;
          if (this.rampSamples != 0 &&
            this.rampSamples <= var3 - this.rightGain) {
            return false;
          }
          this.rampSamples = var3 - this.rightGain;
          return false;
        }
        if (this.rightGain <= var3) {
          this.rightGainStep = 0;
        } else {
          this.rightGainStep = -1;
          if (this.rampSamples == 0 ||
            this.rampSamples > this.rightGain - var3) {
            this.rampSamples = this.rightGain - var3;
          }
        }
        return false;
    }

    final static PcmSampleStream create(PcmSample param0, int param1, int param2) {
        if (param0.samples == null) {
          return null;
        }
        if (param0.samples.length != 0) {
          return new PcmSampleStream(param0, (int)((long)param0.sampleRate * 256L * (long)param1 / (long)(100 * AudioOutput.sampleRate)), param2 << 6);
        }
        return null;
    }

    final synchronized void rampTo(int param0, int param1, int param2) {
        int var6 = 0;
        int var6Lifetime1;
        if (param0 == 0) {
          this.setGainAndPan(param1, param2);
          return;
        }
        int var4 = PcmSampleStream.calculateLeftGain(param1, param2);
        int var5 = PcmSampleStream.calculateRightGain(param1, param2);
        if (this.leftGain != var4) {
          var6 = param1 - this.gain;
          if (this.gain - param1 > var6) {
            var6 = this.gain - param1;
          }
          if (var4 - this.leftGain > var6) {
            var6 = var4 - this.leftGain;
          }
          if (this.leftGain - var4 > var6) {
            var6 = this.leftGain - var4;
          }
          if (var5 - this.rightGain > var6) {
            var6 = var5 - this.rightGain;
          }
          if (this.rightGain - var5 > var6) {
            var6 = this.rightGain - var5;
          }
          if (param0 > var6) {
            param0 = var6;
          }
          this.rampSamples = param0;
          this.targetGain = param1;
          this.pan = param2;
          this.gainStep = (param1 - this.gain) / param0;
          this.leftGainStep = (var4 - this.leftGain) / param0;
          this.rightGainStep = (var5 - this.rightGain) / param0;
          return;
        }
        if (this.rightGain != var5) {
          var6Lifetime1 = param1 - this.gain;
          if (this.gain - param1 > var6Lifetime1) {
            var6Lifetime1 = this.gain - param1;
          }
          if (var4 - this.leftGain > var6Lifetime1) {
            var6Lifetime1 = var4 - this.leftGain;
          }
          if (this.leftGain - var4 > var6Lifetime1) {
            var6Lifetime1 = this.leftGain - var4;
          }
          if (var5 - this.rightGain > var6Lifetime1) {
            var6Lifetime1 = var5 - this.rightGain;
          }
          if (this.rightGain - var5 > var6Lifetime1) {
            var6Lifetime1 = this.rightGain - var5;
          }
          if (param0 > var6Lifetime1) {
            param0 = var6Lifetime1;
          }
          this.rampSamples = param0;
          this.targetGain = param1;
          this.pan = param2;
          this.gainStep = (param1 - this.gain) / param0;
          this.leftGainStep = (var4 - this.leftGain) / param0;
          this.rightGainStep = (var5 - this.rightGain) / param0;
          return;
        }
        this.rampSamples = 0;
    }

    final PcmStream firstSubStream() {
        return null;
    }

    final synchronized int getSpeed() {
        return this.step < 0 ? -this.step : this.step;
    }

    final synchronized void setReverse(boolean param0) {
        this.step = (this.step ^ this.step >> 31) + (this.step >>> 31);
        if (!param0) {
          return;
        }
        this.step = -this.step;
    }

    final synchronized void setGain(int param0) {
        this.setGainAndPan(param0, this.getPan());
    }

    private final static int mixReverseStereoInterpolated(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        if (param12 != 0) {
          param8 = param5 + (param10 + 256 - param4 + param12) / param12;
        }
        if (param12 == 0 ||
          param5 + (param10 + 256 - param4 + param12) / param12 > param9) {
          param8 = param9;
        }
        param5 = param5 << 1;
        param8 = param8 << 1;
        while (param5 < param8) {
          param1 = param4 >> 8;
          param0 = param2[param1 - 1];
          param0 = (param0 << 8) + (param2[param1] - param0) * (param4 & 255);
          incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          incrementValue$7 = param5;
          param5++;
          param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
          param4 = param4 + param12;
        }
        if (param12 != 0) {
          param8 = (param5 >> 1) + (param10 - param4 + param12) / param12;
        }
        if (param12 == 0 ||
          (param5 >> 1) + (param10 - param4 + param12) / param12 > param9) {
          param8 = param9;
        }
        param8 = param8 << 1;
        param1 = param13;
        while (param5 < param8) {
          param0 = (param1 << 8) + (param2[param4 >> 8] - param1) * (param4 & 255);
          incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param4 = param4 + param12;
        }
        param11.position = param4;
        return param5 >> 1;
    }

    private final int mixReverse(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.rampSamples <= 0) {
            if (this.step == -256 &&
              (this.position & 255) == 0) {
              if (AudioOutput.stereo) {
                return PcmSampleStream.mixReverseStereoAligned(0, ((PcmSample) (this.sound)).samples, param0, this.position, param1, this.leftGain, this.rightGain, 0, param3, param2, this);
              }
              return PcmSampleStream.mixReverseMonoAligned(((PcmSample) (this.sound)).samples, param0, this.position, param1, this.gain, 0, param3, param2, this);
            }
            if (AudioOutput.stereo) {
              return PcmSampleStream.mixReverseStereoInterpolated(0, 0, ((PcmSample) (this.sound)).samples, param0, this.position, param1, this.leftGain, this.rightGain, 0, param3, param2, this, this.step, param4);
            }
            return PcmSampleStream.mixReverseMonoInterpolated(0, 0, ((PcmSample) (this.sound)).samples, param0, this.position, param1, this.gain, 0, param3, param2, this, this.step, param4);
          }
          var6 = param1 + this.rampSamples;
          if (var6 > param3) {
            var6 = param3;
          }
          this.rampSamples = this.rampSamples + param1;
          if (this.step == -256 &&
            (this.position & 255) == 0) {
            if (!AudioOutput.stereo) {
              param1 = PcmSampleStream.mixReverseMonoAlignedRamped(((PcmSample) (this.sound)).samples, param0, this.position, param1, this.gain, this.gainStep, 0, var6, param2, this);
            } else {
              param1 = PcmSampleStream.mixReverseStereoAlignedRamped(0, ((PcmSample) (this.sound)).samples, param0, this.position, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this);
            }
          } else {
            if (!AudioOutput.stereo) {
              param1 = PcmSampleStream.mixReverseMonoInterpolatedRamped(0, 0, ((PcmSample) (this.sound)).samples, param0, this.position, param1, this.gain, this.gainStep, 0, var6, param2, this, this.step, param4);
            } else {
              param1 = PcmSampleStream.mixReverseStereoInterpolatedRamped(0, 0, ((PcmSample) (this.sound)).samples, param0, this.position, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this, this.step, param4);
            }
          }
          this.rampSamples = this.rampSamples - param1;
          if (this.rampSamples != 0) {
            return param1;
          }
        } while (!this.finishRamp());
        return param3;
    }

    private PcmSampleStream(PcmSample param0, int param1, int param2) {
        this.sound = (SoundNode) ((Object) param0);
        this.loopStart = param0.loopStart;
        this.loopEnd = param0.loopEnd;
        this.pingPongLoop = param0.pingPongLoop;
        this.step = param1;
        this.targetGain = param2;
        this.pan = 8192;
        this.position = 0;
        this.updateGains();
    }

    final synchronized boolean isRamping() {
        return this.rampSamples != 0;
    }

    final synchronized void setSpeed(int param0) {
        if (this.step < 0) {
          this.step = -param0;
        } else {
          this.step = param0;
        }
    }

    private final static int calculateRightGain(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int mixReverseStereoAlignedRamped(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmSampleStream param12) {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        param3 = param3 >> 8;
        param11 = param11 >> 8;
        param5 = param5 << 2;
        param6 = param6 << 2;
        param7 = param7 << 2;
        param8 = param8 << 2;
        param9 = param4 + param3 - (param11 - 1);
        if (param4 + param3 - (param11 - 1) > param10) {
          param9 = param10;
        }
        param12.gain = param12.gain + param12.gainStep * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        while (param4 < param9) {
          param0 = param1[param3--];
          incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3--];
          incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3--];
          incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3--];
          incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
          param6 = param6 + param8;
        }
        param9 += 6;
        while (param4 < param9) {
          param0 = param1[param3--];
          incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          param5 = param5 + param7;
          incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
          param6 = param6 + param8;
        }
        param12.leftGain = param5 >> 2;
        param12.rightGain = param6 >> 2;
        param12.position = param3 << 8;
        return param4 >> 1;
    }

    private PcmSampleStream(PcmSample param0, int param1, int param2, int param3) {
        this.sound = (SoundNode) ((Object) param0);
        this.loopStart = param0.loopStart;
        this.loopEnd = param0.loopEnd;
        this.pingPongLoop = param0.pingPongLoop;
        this.step = param1;
        this.targetGain = param2;
        this.pan = param3;
        this.position = 0;
        this.updateGains();
    }

    private final static int mixForwardStereoInterpolatedRamped(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmSampleStream param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.gain = param13.gain - param13.gainStep * param5;
        if (param14 != 0) {
          param10 = param5 + (param12 - param4 + param14 - 257) / param14;
        }
        if (param14 == 0 ||
          param5 + (param12 - param4 + param14 - 257) / param14 > param11) {
          param10 = param11;
        }
        param5 = param5 << 1;
        param10 = param10 << 1;
        while (param5 < param10) {
          param1 = param4 >> 8;
          param0 = param2[param1];
          param0 = (param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255);
          incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          incrementValue$7 = param5;
          param5++;
          param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
          param7 = param7 + param9;
          param4 = param4 + param14;
        }
        if (param14 != 0) {
          param10 = (param5 >> 1) + (param12 - param4 + param14 - 1) / param14;
        }
        if (param14 == 0 ||
          (param5 >> 1) + (param12 - param4 + param14 - 1) / param14 > param11) {
          param10 = param11;
        }
        param10 = param10 << 1;
        param1 = param15;
        while (param5 < param10) {
          param0 = param2[param4 >> 8];
          param0 = (param0 << 8) + (param1 - param0) * (param4 & 255);
          incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param7 = param7 + param9;
          param4 = param4 + param14;
        }
        param5 = param5 >> 1;
        param13.gain = param13.gain + param13.gainStep * param5;
        param13.leftGain = param6;
        param13.rightGain = param7;
        param13.position = param4;
        return param5;
    }

    private final static int mixForwardMonoAligned(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, PcmSampleStream param8) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param7 - param2;
        if (param3 + param7 - param2 > param6) {
          param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
          incrementValue$0 = param3;
          param3++;
          incrementValue$1 = param2;
          param2++;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          incrementValue$2 = param3;
          param3++;
          incrementValue$3 = param2;
          param2++;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          incrementValue$4 = param3;
          param3++;
          incrementValue$5 = param2;
          param2++;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          incrementValue$6 = param3;
          param3++;
          incrementValue$7 = param2;
          param2++;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
          incrementValue$8 = param3;
          param3++;
          incrementValue$9 = param2;
          param2++;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
        }
        param8.position = param2 << 8;
        return param3;
    }
}
