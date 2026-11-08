/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSampleStream extends PcmStream {
    private int positionQ8;
    private int targetVolume;
    private int monoGain;
    private int loopEnd;
    private int pan;
    private int monoGainStep;
    private int rightGain;
    private int rampSamplesRemaining;
    private int rightGainStep;
    private int loopStart;
    private int loopCount;
    private boolean pingPong;
    private int leftGain;
    private int leftGainStep;
    private int stepQ8;

    private final void cancelRamp() {
        if (this.rampSamplesRemaining != 0) {
          if (this.targetVolume == -2147483648) {
            this.targetVolume = 0;
          }
          this.rampSamplesRemaining = 0;
          this.recomputeGains();
          return;
        }
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
        param10.positionQ8 = param3 << 8;
        return param4 >> 1;
    }

    final synchronized int targetPan() {
        return this.pan < 0 ? -1 : this.pan;
    }

    final synchronized void rampVolumeAndPan(int sampleCount, int volume, int pan) {
        int var6 = 0;
        int var6Lifetime1;
        if (sampleCount == 0) {
          this.setVolumeAndPan(volume, pan);
          return;
        }
        int var4 = PcmSampleStream.leftGain(volume, pan);
        int var5 = PcmSampleStream.rightGain(volume, pan);
        if (this.leftGain != var4) {
          var6 = volume - this.monoGain;
          if (this.monoGain - volume > var6) {
            var6 = this.monoGain - volume;
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
          if (sampleCount > var6) {
            sampleCount = var6;
          }
          this.rampSamplesRemaining = sampleCount;
          this.targetVolume = volume;
          this.pan = pan;
          this.monoGainStep = (volume - this.monoGain) / sampleCount;
          this.leftGainStep = (var4 - this.leftGain) / sampleCount;
          this.rightGainStep = (var5 - this.rightGain) / sampleCount;
          return;
        }
        if (this.rightGain != var5) {
          var6Lifetime1 = volume - this.monoGain;
          if (this.monoGain - volume > var6Lifetime1) {
            var6Lifetime1 = this.monoGain - volume;
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
          if (sampleCount > var6Lifetime1) {
            sampleCount = var6Lifetime1;
          }
          this.rampSamplesRemaining = sampleCount;
          this.targetVolume = volume;
          this.pan = pan;
          this.monoGainStep = (volume - this.monoGain) / sampleCount;
          this.leftGainStep = (var4 - this.leftGain) / sampleCount;
          this.rightGainStep = (var5 - this.rightGain) / sampleCount;
          return;
        }
        this.rampSamplesRemaining = 0;
    }

    final synchronized void setReversed(boolean reversed) {
        this.stepQ8 = (this.stepQ8 ^ this.stepQ8 >> 31) + (this.stepQ8 >>> 31);
        if (!reversed) {
          return;
        }
        this.stepQ8 = -this.stepQ8;
    }

    final synchronized void setVolume(int volume) {
        this.setVolumeAndPan(volume, this.targetPan());
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
        param10.positionQ8 = param4;
        return param5;
    }

    final static PcmSampleStream createForSampleStep(PcmSample sample, int stepQ8, int volume, int pan) {
        if (sample.samples == null) {
          return null;
        }
        if (sample.samples.length != 0) {
          return new PcmSampleStream(sample, stepQ8, volume, pan);
        }
        return null;
    }

    private final static int rightGain(int volume, int pan) {
        return pan < 0 ? -volume : (int)((double)volume * Math.sqrt((double)pan * 0.0001220703125) + 0.5);
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
        param10.positionQ8 = param3 << 8;
        return param4 >> 1;
    }

    private final static int mixReverseStereoAlignedRamp(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmSampleStream param12) {
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
        param12.monoGain = param12.monoGain + param12.monoGainStep * (param9 - param4);
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
        param12.positionQ8 = param3 << 8;
        return param4 >> 1;
    }

    private final void recomputeGains() {
        this.monoGain = this.targetVolume;
        this.leftGain = PcmSampleStream.leftGain(this.targetVolume, this.pan);
        this.rightGain = PcmSampleStream.rightGain(this.targetVolume, this.pan);
    }

    private final static int mixReverseMonoInterpolatedRamp(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
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
        param11.monoGain = param6;
        param11.positionQ8 = param4;
        return param5;
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
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
        if (this.targetVolume == 0 &&
          this.rampSamplesRemaining == 0) {
          this.skip(param2);
          return;
        }
        var4 = (PcmSample) (this.sample);
        var5 = this.loopStart << 8;
        var6 = this.loopEnd << 8;
        var7 = var4.samples.length << 8;
        var8 = var6 - var5;
        if (var8 <= 0) {
          this.loopCount = 0;
        }
        var9 = param1;
        param2 = param2 + param1;
        if (this.positionQ8 < 0) {
          if (this.stepQ8 <= 0) {
            this.cancelRamp();
            this.unlink(false);
            return;
          }
          this.positionQ8 = 0;
        }
        if (this.positionQ8 >= var7) {
          if (this.stepQ8 >= 0) {
            this.cancelRamp();
            this.unlink(false);
            return;
          }
          this.positionQ8 = var7 - 1;
        }
        if (this.loopCount < 0) {
          if (!this.pingPong) {
            if (this.stepQ8 >= 0) {
              while (true) {
                var9 = this.mixForward(param0, var9, var6, param2, (int) var4.samples[this.loopStart]);
                if (this.positionQ8 < var6) {
                  return;
                }
                this.positionQ8 = var5 + (this.positionQ8 - var5) % var8;
              }
            }
            while (true) {
              var9 = this.mixReverse(param0, var9, var5, param2, (int) var4.samples[this.loopEnd - 1]);
              if (this.positionQ8 >= var5) {
                return;
              }
              this.positionQ8 = var6 - 1 - (var6 - 1 - this.positionQ8) % var8;
            }
          }
          if (this.stepQ8 < 0) {
            var9 = this.mixReverse(param0, var9, var5, param2, (int) var4.samples[this.loopStart]);
            if (this.positionQ8 >= var5) {
              return;
            }
            this.positionQ8 = var5 + var5 - 1 - this.positionQ8;
            this.stepQ8 = -this.stepQ8;
          }
          while (true) {
            var9 = this.mixForward(param0, var9, var6, param2, (int) var4.samples[this.loopEnd - 1]);
            if (this.positionQ8 < var6) {
              return;
            }
            this.positionQ8 = var6 + var6 - 1 - this.positionQ8;
            this.stepQ8 = -this.stepQ8;
            var9 = this.mixReverse(param0, var9, var5, param2, (int) var4.samples[this.loopStart]);
            if (this.positionQ8 >= var5) {
              return;
            }
            this.positionQ8 = var5 + var5 - 1 - this.positionQ8;
            this.stepQ8 = -this.stepQ8;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.loopCount > 0) {
          if (!this.pingPong) {
            if (this.stepQ8 < 0) {
              while (true) {
                var9 = this.mixReverse(param0, var9, var5, param2, (int) var4.samples[this.loopEnd - 1]);
                if (this.positionQ8 >= var5) {
                  return;
                }
                var10 = (var6 - 1 - this.positionQ8) / var8;
                if (var10 < this.loopCount) {
                  this.positionQ8 = this.positionQ8 + var8 * var10;
                  this.loopCount = this.loopCount - var10;
                  continue;
                }
                break;
              }
              this.positionQ8 = this.positionQ8 + var8 * this.loopCount;
              this.loopCount = 0;
            } else {
              while (true) {
                var9 = this.mixForward(param0, var9, var6, param2, (int) var4.samples[this.loopStart]);
                if (this.positionQ8 < var6) {
                  return;
                }
                var10Lifetime1 = (this.positionQ8 - var5) / var8;
                if (var10Lifetime1 < this.loopCount) {
                  this.positionQ8 = this.positionQ8 - var8 * var10Lifetime1;
                  this.loopCount = this.loopCount - var10Lifetime1;
                  continue;
                }
                break;
              }
              this.positionQ8 = this.positionQ8 - var8 * this.loopCount;
              this.loopCount = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.stepQ8 < 0) {
              var9 = this.mixReverse(param0, var9, var5, param2, (int) var4.samples[this.loopStart]);
              if (this.positionQ8 >= var5) {
                return;
              }
              this.positionQ8 = var5 + var5 - 1 - this.positionQ8;
              this.stepQ8 = -this.stepQ8;
              fieldTemp$0 = this.loopCount - 1;
              this.loopCount = this.loopCount - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                var9 = this.mixForward(param0, var9, var6, param2, (int) var4.samples[this.loopEnd - 1]);
                if (this.positionQ8 < var6) {
                  return;
                }
                this.positionQ8 = var6 + var6 - 1 - this.positionQ8;
                this.stepQ8 = -this.stepQ8;
                fieldTemp$1 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                var9 = this.mixReverse(param0, var9, var5, param2, (int) var4.samples[this.loopStart]);
                if (this.positionQ8 >= var5) {
                  return;
                }
                this.positionQ8 = var5 + var5 - 1 - this.positionQ8;
                this.stepQ8 = -this.stepQ8;
                fieldTemp$2 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.stepQ8 >= 0) {
          discarded$4 = this.mixForward(param0, var9, var7, param2, 0);
          if (this.positionQ8 >= var7) {
            this.positionQ8 = var7;
            this.cancelRamp();
            this.unlink(false);
          }
          return;
        }
        discarded$3 = this.mixReverse(param0, var9, 0, param2, 0);
        if (this.positionQ8 >= 0) {
          return;
        }
        this.positionQ8 = -1;
        this.cancelRamp();
        this.unlink(false);
        return;
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
        param11.positionQ8 = param4;
        return param5 >> 1;
    }

    final synchronized void setLoopCount(int loopCount) {
        this.loopCount = loopCount;
    }

    final synchronized int targetVolume() {
        return this.targetVolume == -2147483648 ? 0 : this.targetVolume;
    }

    final int activityWeight() {
        if (this.targetVolume == 0 &&
          this.rampSamplesRemaining == 0) {
          return 0;
        }
        return 1;
    }

    final synchronized void rampVolume(int sampleCount, int volume) {
        this.rampVolumeAndPan(sampleCount, volume, this.targetPan());
    }

    private final static int mixForwardMonoAlignedRamp(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmSampleStream param9) {
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
        param9.monoGain = param4 >> 2;
        param9.positionQ8 = param2 << 8;
        return param3;
    }

    private final static int mixForwardStereoAlignedRamp(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmSampleStream param12) {
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
        param12.monoGain = param12.monoGain + param12.monoGainStep * (param9 - param4);
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
        param12.positionQ8 = param3 << 8;
        return param4 >> 1;
    }

    final PcmStream firstSubstream() {
        return null;
    }

    private final int mixForward(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.rampSamplesRemaining <= 0) {
            if (this.stepQ8 == 256 &&
              (this.positionQ8 & 255) == 0) {
              if (AudioOutput.stereo) {
                return PcmSampleStream.mixForwardStereoAligned(0, ((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.leftGain, this.rightGain, 0, param3, param2, this);
              }
              return PcmSampleStream.mixForwardMonoAligned(((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.monoGain, 0, param3, param2, this);
            }
            if (AudioOutput.stereo) {
              return PcmSampleStream.mixForwardStereoInterpolated(0, 0, ((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.leftGain, this.rightGain, 0, param3, param2, this, this.stepQ8, param4);
            }
            return PcmSampleStream.mixForwardMonoInterpolated(0, 0, ((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.monoGain, 0, param3, param2, this, this.stepQ8, param4);
          }
          var6 = param1 + this.rampSamplesRemaining;
          if (var6 > param3) {
            var6 = param3;
          }
          this.rampSamplesRemaining = this.rampSamplesRemaining + param1;
          if (this.stepQ8 == 256 &&
            (this.positionQ8 & 255) == 0) {
            if (!AudioOutput.stereo) {
              param1 = PcmSampleStream.mixForwardMonoAlignedRamp(((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.monoGain, this.monoGainStep, 0, var6, param2, this);
            } else {
              param1 = PcmSampleStream.mixForwardStereoAlignedRamp(0, ((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this);
            }
          } else {
            if (!AudioOutput.stereo) {
              param1 = PcmSampleStream.mixForwardMonoInterpolatedRamp(0, 0, ((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.monoGain, this.monoGainStep, 0, var6, param2, this, this.stepQ8, param4);
            } else {
              param1 = PcmSampleStream.mixForwardStereoInterpolatedRamp(0, 0, ((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this, this.stepQ8, param4);
            }
          }
          this.rampSamplesRemaining = this.rampSamplesRemaining - param1;
          if (this.rampSamplesRemaining != 0) {
            return param1;
          }
        } while (!this.finishRampOrConverge());
        return param3;
    }

    private final static int mixForwardMonoInterpolatedRamp(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
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
        param11.monoGain = param6;
        param11.positionQ8 = param4;
        return param5;
    }

    final PcmStream nextSubstream() {
        return null;
    }

    final synchronized void setStepMagnitude(int stepMagnitudeQ8) {
        if (this.stepQ8 < 0) {
          this.stepQ8 = -stepMagnitudeQ8;
        } else {
          this.stepQ8 = stepMagnitudeQ8;
        }
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
        if (this.rampSamplesRemaining > 0) {
          if (param0 < this.rampSamplesRemaining) {
            this.monoGain = this.monoGain + this.monoGainStep * param0;
            this.leftGain = this.leftGain + this.leftGainStep * param0;
            this.rightGain = this.rightGain + this.rightGainStep * param0;
            this.rampSamplesRemaining = this.rampSamplesRemaining - param0;
          } else {
            if (this.targetVolume == -2147483648) {
              this.targetVolume = 0;
              this.rightGain = 0;
              this.leftGain = 0;
              this.monoGain = 0;
              this.unlink(false);
              param0 = this.rampSamplesRemaining;
            }
            this.rampSamplesRemaining = 0;
            this.recomputeGains();
          }
        }
        var2 = (PcmSample) (this.sample);
        var3 = this.loopStart << 8;
        var4 = this.loopEnd << 8;
        var5 = var2.samples.length << 8;
        var6 = var4 - var3;
        if (var6 <= 0) {
          this.loopCount = 0;
        }
        if (this.positionQ8 < 0) {
          if (this.stepQ8 <= 0) {
            this.cancelRamp();
            this.unlink(false);
            return;
          }
          this.positionQ8 = 0;
        }
        if (this.positionQ8 >= var5) {
          if (this.stepQ8 >= 0) {
            this.cancelRamp();
            this.unlink(false);
            return;
          }
          this.positionQ8 = var5 - 1;
        }
        this.positionQ8 = this.positionQ8 + this.stepQ8 * param0;
        if (this.loopCount < 0) {
          if (!this.pingPong) {
            if (this.stepQ8 >= 0) {
              if (this.positionQ8 < var4) {
                return;
              }
              this.positionQ8 = var3 + (this.positionQ8 - var3) % var6;
              return;
            }
            if (this.positionQ8 >= var3) {
              return;
            }
            this.positionQ8 = var4 - 1 - (var4 - 1 - this.positionQ8) % var6;
            return;
          }
          if (this.stepQ8 < 0) {
            if (this.positionQ8 >= var3) {
              return;
            }
            this.positionQ8 = var3 + var3 - 1 - this.positionQ8;
            this.stepQ8 = -this.stepQ8;
          }
          while (this.positionQ8 >= var4) {
            this.positionQ8 = var4 + var4 - 1 - this.positionQ8;
            this.stepQ8 = -this.stepQ8;
            if (this.positionQ8 >= var3) {
              return;
            }
            this.positionQ8 = var3 + var3 - 1 - this.positionQ8;
            this.stepQ8 = -this.stepQ8;
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.loopCount > 0) {
          if (!this.pingPong) {
            if (this.stepQ8 >= 0) {
              if (this.positionQ8 < var4) {
                return;
              }
              var7 = (this.positionQ8 - var3) / var6;
              if (var7 >= this.loopCount) {
                this.positionQ8 = this.positionQ8 - var6 * this.loopCount;
                this.loopCount = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.positionQ8 = this.positionQ8 - var6 * var7;
                this.loopCount = this.loopCount - var7;
              }
            } else {
              if (this.positionQ8 >= var3) {
                return;
              }
              var7 = (var4 - 1 - this.positionQ8) / var6;
              if (var7 >= this.loopCount) {
                this.positionQ8 = this.positionQ8 + var6 * this.loopCount;
                this.loopCount = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.positionQ8 = this.positionQ8 + var6 * var7;
                this.loopCount = this.loopCount - var7;
              }
            }
            if (decompiledFrameRemainder0) {
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.stepQ8 < 0) {
              if (this.positionQ8 >= var3) {
                return;
              }
              this.positionQ8 = var3 + var3 - 1 - this.positionQ8;
              this.stepQ8 = -this.stepQ8;
              fieldTemp$0 = this.loopCount - 1;
              this.loopCount = this.loopCount - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                if (this.positionQ8 < var4) {
                  return;
                }
                this.positionQ8 = var4 + var4 - 1 - this.positionQ8;
                this.stepQ8 = -this.stepQ8;
                fieldTemp$1 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                if (this.positionQ8 >= var3) {
                  return;
                }
                this.positionQ8 = var3 + var3 - 1 - this.positionQ8;
                this.stepQ8 = -this.stepQ8;
                fieldTemp$2 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.stepQ8 >= 0) {
          if (this.positionQ8 >= var5) {
            this.positionQ8 = var5;
            this.cancelRamp();
            this.unlink(false);
          }
          return;
        }
        if (this.positionQ8 >= 0) {
          return;
        }
        this.positionQ8 = -1;
        this.cancelRamp();
        this.unlink(false);
    }

    final synchronized void fadeOutAndUnlink(int sampleCount) {
        int var2 = 0;
        int var2Lifetime1;
        if (sampleCount == 0) {
          this.setVolume(0);
          this.unlink(false);
          return;
        }
        if (this.leftGain != 0) {
          var2 = -this.monoGain;
          if (this.monoGain > var2) {
            var2 = this.monoGain;
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
          if (sampleCount > var2) {
            sampleCount = var2;
          }
          this.rampSamplesRemaining = sampleCount;
          this.targetVolume = -2147483648;
          this.monoGainStep = -this.monoGain / sampleCount;
          this.leftGainStep = -this.leftGain / sampleCount;
          this.rightGainStep = -this.rightGain / sampleCount;
          return;
        }
        if (this.rightGain != 0) {
          var2Lifetime1 = -this.monoGain;
          if (this.monoGain > var2Lifetime1) {
            var2Lifetime1 = this.monoGain;
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
          if (sampleCount > var2Lifetime1) {
            sampleCount = var2Lifetime1;
          }
          this.rampSamplesRemaining = sampleCount;
          this.targetVolume = -2147483648;
          this.monoGainStep = -this.monoGain / sampleCount;
          this.leftGainStep = -this.leftGain / sampleCount;
          this.rightGainStep = -this.rightGain / sampleCount;
          return;
        }
        this.rampSamplesRemaining = 0;
        this.targetVolume = 0;
        this.monoGain = 0;
        this.unlink(false);
    }

    private final static int mixReverseMonoAlignedRamp(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmSampleStream param9) {
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
        param9.monoGain = param4 >> 2;
        param9.positionQ8 = param2 << 8;
        return param3;
    }

    private final synchronized void setVolumeAndPan(int volume, int pan) {
        this.targetVolume = volume;
        this.pan = pan;
        this.rampSamplesRemaining = 0;
        this.recomputeGains();
    }

    private final int mixReverse(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.rampSamplesRemaining <= 0) {
            if (this.stepQ8 == -256 &&
              (this.positionQ8 & 255) == 0) {
              if (AudioOutput.stereo) {
                return PcmSampleStream.mixReverseStereoAligned(0, ((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.leftGain, this.rightGain, 0, param3, param2, this);
              }
              return PcmSampleStream.mixReverseMonoAligned(((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.monoGain, 0, param3, param2, this);
            }
            if (AudioOutput.stereo) {
              return PcmSampleStream.mixReverseStereoInterpolated(0, 0, ((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.leftGain, this.rightGain, 0, param3, param2, this, this.stepQ8, param4);
            }
            return PcmSampleStream.mixReverseMonoInterpolated(0, 0, ((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.monoGain, 0, param3, param2, this, this.stepQ8, param4);
          }
          var6 = param1 + this.rampSamplesRemaining;
          if (var6 > param3) {
            var6 = param3;
          }
          this.rampSamplesRemaining = this.rampSamplesRemaining + param1;
          if (this.stepQ8 == -256 &&
            (this.positionQ8 & 255) == 0) {
            if (!AudioOutput.stereo) {
              param1 = PcmSampleStream.mixReverseMonoAlignedRamp(((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.monoGain, this.monoGainStep, 0, var6, param2, this);
            } else {
              param1 = PcmSampleStream.mixReverseStereoAlignedRamp(0, ((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this);
            }
          } else {
            if (!AudioOutput.stereo) {
              param1 = PcmSampleStream.mixReverseMonoInterpolatedRamp(0, 0, ((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.monoGain, this.monoGainStep, 0, var6, param2, this, this.stepQ8, param4);
            } else {
              param1 = PcmSampleStream.mixReverseStereoInterpolatedRamp(0, 0, ((PcmSample) (this.sample)).samples, param0, this.positionQ8, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this, this.stepQ8, param4);
            }
          }
          this.rampSamplesRemaining = this.rampSamplesRemaining - param1;
          if (this.rampSamplesRemaining != 0) {
            return param1;
          }
        } while (!this.finishRampOrConverge());
        return param3;
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
        param8.positionQ8 = param2 << 8;
        return param3;
    }

    final synchronized void setPosition(int positionQ8) {
        int var2 = ((PcmSample) (this.sample)).samples.length << 8;
        if (positionQ8 < -1) {
          positionQ8 = -1;
        }
        if (positionQ8 > var2) {
          positionQ8 = var2;
        }
        this.positionQ8 = positionQ8;
    }

    final synchronized boolean isRamping() {
        return this.rampSamplesRemaining != 0;
    }

    private final static int mixForwardStereoInterpolatedRamp(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmSampleStream param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.monoGain = param13.monoGain - param13.monoGainStep * param5;
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
        param13.monoGain = param13.monoGain + param13.monoGainStep * param5;
        param13.leftGain = param6;
        param13.rightGain = param7;
        param13.positionQ8 = param4;
        return param5;
    }

    final static PcmSampleStream createAtRatePercent(PcmSample sample, int ratePercent, int volume) {
        if (sample.samples == null) {
          return null;
        }
        if (sample.samples.length != 0) {
          return new PcmSampleStream(sample, (int)((long)sample.sampleRate * 256L * (long)ratePercent / (long)(100 * AudioOutput.sampleRate)), volume << 6);
        }
        return null;
    }

    final int priority() {
        int var1 = this.monoGain * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.loopCount == 0) {
          var1 = var1 - var1 * this.positionQ8 / (((PcmSample) (this.sample)).samples.length << 8);
        } else {
          if (this.loopCount >= 0) {
            var1 = var1 - var1 * this.loopStart / ((PcmSample) (this.sample)).samples.length;
          }
        }
        return var1 > 255 ? 255 : var1;
    }

    final synchronized int stepMagnitude() {
        return this.stepQ8 < 0 ? -this.stepQ8 : this.stepQ8;
    }

    final synchronized boolean isOutOfBounds() {
        return this.positionQ8 < 0 || this.positionQ8 >= ((PcmSample) (this.sample)).samples.length << 8;
    }

    private final static int mixReverseStereoInterpolatedRamp(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmSampleStream param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.monoGain = param13.monoGain - param13.monoGainStep * param5;
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
        param13.monoGain = param13.monoGain + param13.monoGainStep * param5;
        param13.leftGain = param6;
        param13.rightGain = param7;
        param13.positionQ8 = param4;
        return param5;
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
        param8.positionQ8 = param2 << 8;
        return param3;
    }

    private final boolean finishRampOrConverge() {
        int var1;
        int var2;
        int var3;
        var1 = this.targetVolume;
        if (var1 != -2147483648) {
          var2 = PcmSampleStream.leftGain(var1, this.pan);
          var3 = PcmSampleStream.rightGain(var1, this.pan);
        } else {
          var3 = 0;
          var2 = 0;
          var1 = 0;
        }
        if (this.monoGain == var1 &&
          this.leftGain == var2 &&
          this.rightGain == var3) {
          if (this.targetVolume != -2147483648) {
            this.recomputeGains();
            return false;
          }
          this.targetVolume = 0;
          this.rightGain = 0;
          this.leftGain = 0;
          this.monoGain = 0;
          this.unlink(false);
          return true;
        }
        if (this.monoGain >= var1) {
          if (this.monoGain <= var1) {
            this.monoGainStep = 0;
          } else {
            this.monoGainStep = -1;
            this.rampSamplesRemaining = this.monoGain - var1;
          }
        } else {
          this.monoGainStep = 1;
          this.rampSamplesRemaining = var1 - this.monoGain;
        }
        if (this.leftGain >= var2) {
          if (this.leftGain <= var2) {
            this.leftGainStep = 0;
          } else {
            this.leftGainStep = -1;
            if (this.rampSamplesRemaining == 0 ||
              this.rampSamplesRemaining > this.leftGain - var2) {
              this.rampSamplesRemaining = this.leftGain - var2;
            }
          }
        } else {
          this.leftGainStep = 1;
          if (this.rampSamplesRemaining == 0 ||
            this.rampSamplesRemaining > var2 - this.leftGain) {
            this.rampSamplesRemaining = var2 - this.leftGain;
          }
        }
        if (this.rightGain < var3) {
          this.rightGainStep = 1;
          if (this.rampSamplesRemaining != 0 &&
            this.rampSamplesRemaining <= var3 - this.rightGain) {
            return false;
          }
          this.rampSamplesRemaining = var3 - this.rightGain;
          return false;
        }
        if (this.rightGain <= var3) {
          this.rightGainStep = 0;
        } else {
          this.rightGainStep = -1;
          if (this.rampSamplesRemaining == 0 ||
            this.rampSamplesRemaining > this.rightGain - var3) {
            this.rampSamplesRemaining = this.rightGain - var3;
          }
        }
        return false;
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
        param11.positionQ8 = param4;
        return param5 >> 1;
    }

    private final static int leftGain(int volume, int pan) {
        return pan < 0 ? volume : (int)((double)volume * Math.sqrt((double)(16384 - pan) * 0.0001220703125) + 0.5);
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
        param10.positionQ8 = param4;
        return param5;
    }

    private PcmSampleStream(PcmSample param0, int param1, int param2) {
        this.sample = (AbstractAudioSample) ((Object) param0);
        this.loopStart = param0.loopStart;
        this.loopEnd = param0.loopEnd;
        this.pingPong = param0.pingPong;
        this.stepQ8 = param1;
        this.targetVolume = param2;
        this.pan = 8192;
        this.positionQ8 = 0;
        this.recomputeGains();
    }

    private PcmSampleStream(PcmSample param0, int param1, int param2, int param3) {
        this.sample = (AbstractAudioSample) ((Object) param0);
        this.loopStart = param0.loopStart;
        this.loopEnd = param0.loopEnd;
        this.pingPong = param0.pingPong;
        this.stepQ8 = param1;
        this.targetVolume = param2;
        this.pan = param3;
        this.positionQ8 = 0;
        this.recomputeGains();
    }
}
