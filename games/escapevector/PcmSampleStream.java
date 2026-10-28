/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSampleStream extends PcmStream {
    private int rightVolumeStep;
    private int loopEnd;
    private boolean pingPongLoop;
    private int stepQ8;
    private int panQ14;
    private int leftVolumeStep;
    private int positionQ8;
    private int volumeQ6;
    private int leftVolumeQ6;
    private int rampSamples;
    private int rightVolumeQ6;
    private int targetVolumeQ6;
    private int volumeStep;
    private int loopCount;
    private int loopStart;

    private final int mixForward(int[] output, int offset, int boundaryQ8, int limit, int boundarySample) {
        do {
          if (this.rampSamples <= 0) {
            if (this.stepQ8 == 256 &&
              (this.positionQ8 & 255) == 0) {
              if (AudioOutput.stereo) {
                return PcmSampleStream.mixForwardStereo(0, ((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.leftVolumeQ6, this.rightVolumeQ6, 0, limit, boundaryQ8, this);
              }
              return PcmSampleStream.mixForwardMono(((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.volumeQ6, 0, limit, boundaryQ8, this);
            }
            if (AudioOutput.stereo) {
              return PcmSampleStream.mixForwardInterpolatedStereo(0, 0, ((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.leftVolumeQ6, this.rightVolumeQ6, 0, limit, boundaryQ8, this, this.stepQ8, boundarySample);
            }
            return PcmSampleStream.mixForwardInterpolatedMono(0, 0, ((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.volumeQ6, 0, limit, boundaryQ8, this, this.stepQ8, boundarySample);
          }
          int var6 = offset + this.rampSamples;
          if (var6 > limit) {
            var6 = limit;
          }
          this.rampSamples = this.rampSamples + offset;
          if (this.stepQ8 == 256 &&
            (this.positionQ8 & 255) == 0) {
            if (!AudioOutput.stereo) {
              offset = PcmSampleStream.mixForwardMonoRamp(((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.volumeQ6, this.volumeStep, 0, var6, boundaryQ8, this);
            } else {
              offset = PcmSampleStream.mixForwardStereoRamp(0, ((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.leftVolumeQ6, this.rightVolumeQ6, this.leftVolumeStep, this.rightVolumeStep, 0, var6, boundaryQ8, this);
            }
          } else if (!AudioOutput.stereo) {
            offset = PcmSampleStream.mixForwardInterpolatedMonoRamp(0, 0, ((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.volumeQ6, this.volumeStep, 0, var6, boundaryQ8, this, this.stepQ8, boundarySample);
          } else {
            offset = PcmSampleStream.mixForwardInterpolatedStereoRamp(0, 0, ((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.leftVolumeQ6, this.rightVolumeQ6, this.leftVolumeStep, this.rightVolumeStep, 0, var6, boundaryQ8, this, this.stepQ8, boundarySample);
          }
          this.rampSamples = this.rampSamples - offset;
          if (this.rampSamples != 0) {
            return offset;
          }
        } while (!this.adjustRampOrStop());
        return limit;
    }

    final synchronized void setVolumeQ6(int volumeQ6) {
        this.setVolumeAndPanQ6(volumeQ6, this.panQ14());
    }

    private final static int mixReverseInterpolatedStereoRamp(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmSampleStream param13, int param14, int param15) {
        param13.volumeQ6 = param13.volumeQ6 - param13.volumeStep * param5;
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
          int incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          int incrementValue$7 = param5;
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
          int incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          int incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param7 = param7 + param9;
          param4 = param4 + param14;
        }
        param5 = param5 >> 1;
        param13.volumeQ6 = param13.volumeQ6 + param13.volumeStep * param5;
        param13.leftVolumeQ6 = param6;
        param13.rightVolumeQ6 = param7;
        param13.positionQ8 = param4;
        return param5;
    }

    private final void refreshGains() {
        this.volumeQ6 = this.targetVolumeQ6;
        this.leftVolumeQ6 = PcmSampleStream.leftGain(this.targetVolumeQ6, this.panQ14);
        this.rightVolumeQ6 = PcmSampleStream.rightGain(this.targetVolumeQ6, this.panQ14);
    }

    private final static int mixForwardInterpolatedStereoRamp(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmSampleStream param13, int param14, int param15) {
        param13.volumeQ6 = param13.volumeQ6 - param13.volumeStep * param5;
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
          int incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          int incrementValue$7 = param5;
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
          int incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          param6 = param6 + param8;
          int incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param7 = param7 + param9;
          param4 = param4 + param14;
        }
        param5 = param5 >> 1;
        param13.volumeQ6 = param13.volumeQ6 + param13.volumeStep * param5;
        param13.leftVolumeQ6 = param6;
        param13.rightVolumeQ6 = param7;
        param13.positionQ8 = param4;
        return param5;
    }

    final static PcmSampleStream createAtStepScaled(PcmSample sample, int stepQ8, int volume, int panQ8) {
        if (sample.samples == null) {
          return null;
        }
        if (sample.samples.length != 0) {
          return new PcmSampleStream(sample, stepQ8, volume << 6, panQ8 << 6);
        }
        return null;
    }

    private final int mixReverse(int[] output, int offset, int boundaryQ8, int limit, int boundarySample) {
        do {
          if (this.rampSamples <= 0) {
            if (this.stepQ8 == -256 &&
              (this.positionQ8 & 255) == 0) {
              if (AudioOutput.stereo) {
                return PcmSampleStream.mixReverseStereo(0, ((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.leftVolumeQ6, this.rightVolumeQ6, 0, limit, boundaryQ8, this);
              }
              return PcmSampleStream.mixReverseMono(((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.volumeQ6, 0, limit, boundaryQ8, this);
            }
            if (AudioOutput.stereo) {
              return PcmSampleStream.mixReverseInterpolatedStereo(0, 0, ((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.leftVolumeQ6, this.rightVolumeQ6, 0, limit, boundaryQ8, this, this.stepQ8, boundarySample);
            }
            return PcmSampleStream.mixReverseInterpolatedMono(0, 0, ((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.volumeQ6, 0, limit, boundaryQ8, this, this.stepQ8, boundarySample);
          }
          int var6 = offset + this.rampSamples;
          if (var6 > limit) {
            var6 = limit;
          }
          this.rampSamples = this.rampSamples + offset;
          if (this.stepQ8 == -256 &&
            (this.positionQ8 & 255) == 0) {
            if (!AudioOutput.stereo) {
              offset = PcmSampleStream.mixReverseMonoRamp(((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.volumeQ6, this.volumeStep, 0, var6, boundaryQ8, this);
            } else {
              offset = PcmSampleStream.mixReverseStereoRamp(0, ((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.leftVolumeQ6, this.rightVolumeQ6, this.leftVolumeStep, this.rightVolumeStep, 0, var6, boundaryQ8, this);
            }
          } else if (!AudioOutput.stereo) {
            offset = PcmSampleStream.mixReverseInterpolatedMonoRamp(0, 0, ((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.volumeQ6, this.volumeStep, 0, var6, boundaryQ8, this, this.stepQ8, boundarySample);
          } else {
            offset = PcmSampleStream.mixReverseInterpolatedStereoRamp(0, 0, ((PcmSample) (this.sample)).samples, output, this.positionQ8, offset, this.leftVolumeQ6, this.rightVolumeQ6, this.leftVolumeStep, this.rightVolumeStep, 0, var6, boundaryQ8, this, this.stepQ8, boundarySample);
          }
          this.rampSamples = this.rampSamples - offset;
          if (this.rampSamples != 0) {
            return offset;
          }
        } while (!this.adjustRampOrStop());
        return limit;
    }

    final synchronized void rampVolumeQ6(int duration, int volumeQ6) {
        this.rampVolumeAndPanQ6(duration, volumeQ6, this.panQ14());
    }

    private final static int mixForwardStereo(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10) {
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
          int incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          int incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param0 = param1[param3++];
          int incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          int incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param0 = param1[param3++];
          int incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          int incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param0 = param1[param3++];
          int incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          int incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
        }
        param7 += 6;
        while (param4 < param7) {
          param0 = param1[param3++];
          int incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          int incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
        }
        param10.positionQ8 = param3 << 8;
        return param4 >> 1;
    }

    private final boolean adjustRampOrStop() {
        int var2;
        int var3;
        int var1 = this.targetVolumeQ6;
        if (var1 != -2147483648) {
          var2 = PcmSampleStream.leftGain(var1, this.panQ14);
          var3 = PcmSampleStream.rightGain(var1, this.panQ14);
        } else {
          var3 = 0;
          var2 = 0;
          var1 = 0;
        }
        if (this.volumeQ6 == var1 &&
          this.leftVolumeQ6 == var2 &&
          this.rightVolumeQ6 == var3) {
          if (this.targetVolumeQ6 != -2147483648) {
            this.refreshGains();
            return false;
          }
          this.targetVolumeQ6 = 0;
          this.rightVolumeQ6 = 0;
          this.leftVolumeQ6 = 0;
          this.volumeQ6 = 0;
          this.unlink((byte) -120);
          return true;
        }
        if (!(this.volumeQ6 >= var1)) {
          this.volumeStep = 1;
          this.rampSamples = var1 - this.volumeQ6;
        } else if (this.volumeQ6 <= var1) {
          this.volumeStep = 0;
        } else {
          this.volumeStep = -1;
          this.rampSamples = this.volumeQ6 - var1;
        }
        if (!(this.leftVolumeQ6 >= var2)) {
          this.leftVolumeStep = 1;
          if (this.rampSamples == 0 ||
            this.rampSamples > var2 - this.leftVolumeQ6) {
            this.rampSamples = var2 - this.leftVolumeQ6;
          }
        } else if (this.leftVolumeQ6 <= var2) {
          this.leftVolumeStep = 0;
        } else {
          this.leftVolumeStep = -1;
          if (this.rampSamples == 0 ||
            this.rampSamples > this.leftVolumeQ6 - var2) {
            this.rampSamples = this.leftVolumeQ6 - var2;
          }
        }
        if (this.rightVolumeQ6 < var3) {
          this.rightVolumeStep = 1;
          if (this.rampSamples != 0 &&
            this.rampSamples <= var3 - this.rightVolumeQ6) {
            return false;
          }
          this.rampSamples = var3 - this.rightVolumeQ6;
          return false;
        }
        if (this.rightVolumeQ6 <= var3) {
          this.rightVolumeStep = 0;
        } else {
          this.rightVolumeStep = -1;
          if (this.rampSamples == 0 ||
            this.rampSamples > this.rightVolumeQ6 - var3) {
            this.rampSamples = this.rightVolumeQ6 - var3;
          }
        }
        return false;
    }

    final synchronized void skip(int length) {
        int fieldTemp$2 = 0;
        int var7;
        if (this.rampSamples > 0) {
          if (length < this.rampSamples) {
            this.volumeQ6 = this.volumeQ6 + this.volumeStep * length;
            this.leftVolumeQ6 = this.leftVolumeQ6 + this.leftVolumeStep * length;
            this.rightVolumeQ6 = this.rightVolumeQ6 + this.rightVolumeStep * length;
            this.rampSamples = this.rampSamples - length;
          } else {
            if (this.targetVolumeQ6 == -2147483648) {
              this.targetVolumeQ6 = 0;
              this.rightVolumeQ6 = 0;
              this.leftVolumeQ6 = 0;
              this.volumeQ6 = 0;
              this.unlink((byte) -12);
              length = this.rampSamples;
            }
            this.rampSamples = 0;
            this.refreshGains();
          }
        }
        PcmSample var2 = (PcmSample) (this.sample);
        int var3 = this.loopStart << 8;
        int var4 = this.loopEnd << 8;
        int var5 = var2.samples.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
          this.loopCount = 0;
        }
        if (this.positionQ8 < 0) {
          if (this.stepQ8 <= 0) {
            this.cancelRamp();
            this.unlink((byte) -123);
            return;
          }
          this.positionQ8 = 0;
        }
        if (this.positionQ8 >= var5) {
          if (this.stepQ8 >= 0) {
            this.cancelRamp();
            this.unlink((byte) -56);
            return;
          }
          this.positionQ8 = var5 - 1;
        }
        this.positionQ8 = this.positionQ8 + this.stepQ8 * length;
        if (this.loopCount < 0) {
          if (!this.pingPongLoop) {
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
          if (!this.pingPongLoop) {
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
              int fieldTemp$0 = this.loopCount - 1;
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
                int fieldTemp$1 = this.loopCount - 1;
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
            this.unlink((byte) -100);
          }
          return;
        }
        if (this.positionQ8 >= 0) {
          return;
        }
        this.positionQ8 = -1;
        this.cancelRamp();
        this.unlink((byte) -88);
    }

    final synchronized void playBackwardFromEnd() {
        this.stepQ8 = (this.stepQ8 ^ this.stepQ8 >> 31) + (this.stepQ8 >>> 31);
        this.stepQ8 = -this.stepQ8;
        this.positionQ8 = ((PcmSample) (this.sample)).samples.length - 1 << 8;
    }

    final synchronized void setLoopCount(int count) {
        this.loopCount = count;
    }

    final synchronized void setPosition(int sampleIndex) {
        sampleIndex = sampleIndex << 8;
        int var2 = ((PcmSample) (this.sample)).samples.length << 8;
        if (sampleIndex < -1) {
          sampleIndex = -1;
        }
        if (sampleIndex > var2) {
          sampleIndex = var2;
        }
        this.positionQ8 = sampleIndex;
    }

    private final static int mixReverseMonoRamp(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmSampleStream param9) {
        param2 = param2 >> 8;
        param8 = param8 >> 8;
        param4 = param4 << 2;
        param5 = param5 << 2;
        param6 = param3 + param2 - (param8 - 1);
        if (param3 + param2 - (param8 - 1) > param7) {
          param6 = param7;
        }
        param9.leftVolumeQ6 = param9.leftVolumeQ6 + param9.leftVolumeStep * (param6 - param3);
        param9.rightVolumeQ6 = param9.rightVolumeQ6 + param9.rightVolumeStep * (param6 - param3);
        param6 -= 3;
        while (param3 < param6) {
          int incrementValue$0 = param3;
          param3++;
          int incrementValue$1 = param2;
          param2--;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          param4 = param4 + param5;
          int incrementValue$2 = param3;
          param3++;
          int incrementValue$3 = param2;
          param2--;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          param4 = param4 + param5;
          int incrementValue$4 = param3;
          param3++;
          int incrementValue$5 = param2;
          param2--;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          param4 = param4 + param5;
          int incrementValue$6 = param3;
          param3++;
          int incrementValue$7 = param2;
          param2--;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
          param4 = param4 + param5;
        }
        param6 += 3;
        while (param3 < param6) {
          int incrementValue$8 = param3;
          param3++;
          int incrementValue$9 = param2;
          param2--;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
          param4 = param4 + param5;
        }
        param9.volumeQ6 = param4 >> 2;
        param9.positionQ8 = param2 << 8;
        return param3;
    }

    final static PcmSampleStream createAtRatePercentQ6(PcmSample sample, int ratePercent, int volumeQ6, int panQ14) {
        if (sample.samples == null) {
          return null;
        }
        if (sample.samples.length != 0) {
          return new PcmSampleStream(sample, (int)((long)sample.sampleRate * 256L * (long)ratePercent / (long)(100 * AudioOutput.sampleRate)), volumeQ6, panQ14);
        }
        return null;
    }

    private final static int mixReverseInterpolatedMono(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10, int param11, int param12) {
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
          int incrementValue$1 = param5;
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
          int incrementValue$0 = param5;
          param5++;
          param3[incrementValue$0] = param3[incrementValue$0] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
          param4 = param4 + param1;
        }
        param10.positionQ8 = param4;
        return param5;
    }

    private final static int mixReverseMono(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, PcmSampleStream param8) {
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param2 - (param7 - 1);
        if (param3 + param2 - (param7 - 1) > param6) {
          param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
          int incrementValue$0 = param3;
          param3++;
          int incrementValue$1 = param2;
          param2--;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          int incrementValue$2 = param3;
          param3++;
          int incrementValue$3 = param2;
          param2--;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          int incrementValue$4 = param3;
          param3++;
          int incrementValue$5 = param2;
          param2--;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          int incrementValue$6 = param3;
          param3++;
          int incrementValue$7 = param2;
          param2--;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
          int incrementValue$8 = param3;
          param3++;
          int incrementValue$9 = param2;
          param2--;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
        }
        param8.positionQ8 = param2 << 8;
        return param3;
    }

    private final static int mixReverseInterpolatedMonoRamp(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
        param11.leftVolumeQ6 = param11.leftVolumeQ6 - param11.leftVolumeStep * param5;
        param11.rightVolumeQ6 = param11.rightVolumeQ6 - param11.rightVolumeStep * param5;
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
          int incrementValue$3 = param5;
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
          int incrementValue$2 = param5;
          param5++;
          param3[incrementValue$2] = param3[incrementValue$2] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
          param6 = param6 + param7;
          param4 = param4 + param1;
        }
        param11.leftVolumeQ6 = param11.leftVolumeQ6 + param11.leftVolumeStep * param5;
        param11.rightVolumeQ6 = param11.rightVolumeQ6 + param11.rightVolumeStep * param5;
        param11.volumeQ6 = param6;
        param11.positionQ8 = param4;
        return param5;
    }

    private final static int mixReverseInterpolatedStereo(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
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
          int incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          int incrementValue$7 = param5;
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
          int incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          int incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param4 = param4 + param12;
        }
        param11.positionQ8 = param4;
        return param5 >> 1;
    }

    private final static int rightGain(int volumeQ6, int panQ14) {
        return panQ14 < 0 ? -volumeQ6 : (int)((double)volumeQ6 * Math.sqrt((double)panQ14 * 0.0001220703125) + 0.5);
    }

    private final static int mixForwardStereoRamp(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmSampleStream param12) {
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
        param12.volumeQ6 = param12.volumeQ6 + param12.volumeStep * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        while (param4 < param9) {
          param0 = param1[param3++];
          int incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3++];
          int incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3++];
          int incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3++];
          int incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
          param6 = param6 + param8;
        }
        param9 += 6;
        while (param4 < param9) {
          param0 = param1[param3++];
          int incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
          param6 = param6 + param8;
        }
        param12.leftVolumeQ6 = param5 >> 2;
        param12.rightVolumeQ6 = param6 >> 2;
        param12.positionQ8 = param3 << 8;
        return param4 >> 1;
    }

    private final static int mixReverseStereo(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10) {
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
          int incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          int incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param0 = param1[param3--];
          int incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          int incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param0 = param1[param3--];
          int incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          int incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param0 = param1[param3--];
          int incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          int incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
        }
        param7 += 6;
        while (param4 < param7) {
          param0 = param1[param3--];
          int incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          int incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
        }
        param10.positionQ8 = param3 << 8;
        return param4 >> 1;
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

    final synchronized void mixInto(int[] samples, int offset, int length) {
        int fieldTemp$2 = 0;
        if (this.targetVolumeQ6 == 0 &&
          this.rampSamples == 0) {
          this.skip(length);
          return;
        }
        PcmSample var4 = (PcmSample) (this.sample);
        int var5 = this.loopStart << 8;
        int var6 = this.loopEnd << 8;
        int var7 = var4.samples.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
          this.loopCount = 0;
        }
        int var9 = offset;
        length = length + offset;
        if (this.positionQ8 < 0) {
          if (this.stepQ8 <= 0) {
            this.cancelRamp();
            this.unlink((byte) -26);
            return;
          }
          this.positionQ8 = 0;
        }
        if (this.positionQ8 >= var7) {
          if (this.stepQ8 >= 0) {
            this.cancelRamp();
            this.unlink((byte) -10);
            return;
          }
          this.positionQ8 = var7 - 1;
        }
        if (this.loopCount < 0) {
          if (!this.pingPongLoop) {
            if (this.stepQ8 >= 0) {
              while (true) {
                var9 = this.mixForward(samples, var9, var6, length, (int) var4.samples[this.loopStart]);
                if (this.positionQ8 < var6) {
                  return;
                }
                this.positionQ8 = var5 + (this.positionQ8 - var5) % var8;
              }
            }
            while (true) {
              var9 = this.mixReverse(samples, var9, var5, length, (int) var4.samples[this.loopEnd - 1]);
              if (this.positionQ8 >= var5) {
                return;
              }
              this.positionQ8 = var6 - 1 - (var6 - 1 - this.positionQ8) % var8;
            }
          }
          if (this.stepQ8 < 0) {
            var9 = this.mixReverse(samples, var9, var5, length, (int) var4.samples[this.loopStart]);
            if (this.positionQ8 >= var5) {
              return;
            }
            this.positionQ8 = var5 + var5 - 1 - this.positionQ8;
            this.stepQ8 = -this.stepQ8;
          }
          while (true) {
            var9 = this.mixForward(samples, var9, var6, length, (int) var4.samples[this.loopEnd - 1]);
            if (this.positionQ8 < var6) {
              return;
            }
            this.positionQ8 = var6 + var6 - 1 - this.positionQ8;
            this.stepQ8 = -this.stepQ8;
            var9 = this.mixReverse(samples, var9, var5, length, (int) var4.samples[this.loopStart]);
            if (this.positionQ8 >= var5) {
              return;
            }
            this.positionQ8 = var5 + var5 - 1 - this.positionQ8;
            this.stepQ8 = -this.stepQ8;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.loopCount > 0) {
          if (!this.pingPongLoop) {
            if (this.stepQ8 < 0) {
              while (true) {
                var9 = this.mixReverse(samples, var9, var5, length, (int) var4.samples[this.loopEnd - 1]);
                if (this.positionQ8 >= var5) {
                  return;
                }
                int var10 = (var6 - 1 - this.positionQ8) / var8;
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
                var9 = this.mixForward(samples, var9, var6, length, (int) var4.samples[this.loopStart]);
                if (this.positionQ8 < var6) {
                  return;
                }
                int var10Lifetime1 = (this.positionQ8 - var5) / var8;
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
              var9 = this.mixReverse(samples, var9, var5, length, (int) var4.samples[this.loopStart]);
              if (this.positionQ8 >= var5) {
                return;
              }
              this.positionQ8 = var5 + var5 - 1 - this.positionQ8;
              this.stepQ8 = -this.stepQ8;
              int fieldTemp$0 = this.loopCount - 1;
              this.loopCount = this.loopCount - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                var9 = this.mixForward(samples, var9, var6, length, (int) var4.samples[this.loopEnd - 1]);
                if (this.positionQ8 < var6) {
                  return;
                }
                this.positionQ8 = var6 + var6 - 1 - this.positionQ8;
                this.stepQ8 = -this.stepQ8;
                int fieldTemp$1 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                var9 = this.mixReverse(samples, var9, var5, length, (int) var4.samples[this.loopStart]);
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
          int discarded$4 = this.mixForward(samples, var9, var7, length, 0);
          if (this.positionQ8 >= var7) {
            this.positionQ8 = var7;
            this.cancelRamp();
            this.unlink((byte) -66);
          }
          return;
        }
        int discarded$3 = this.mixReverse(samples, var9, 0, length, 0);
        if (this.positionQ8 >= 0) {
          return;
        }
        this.positionQ8 = -1;
        this.cancelRamp();
        this.unlink((byte) -123);
        return;
    }

    private final void cancelRamp() {
        if (this.rampSamples != 0) {
          if (this.targetVolumeQ6 == -2147483648) {
            this.targetVolumeQ6 = 0;
          }
          this.rampSamples = 0;
          this.refreshGains();
          return;
        }
    }

    private final static int mixForwardMono(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, PcmSampleStream param8) {
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param7 - param2;
        if (param3 + param7 - param2 > param6) {
          param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
          int incrementValue$0 = param3;
          param3++;
          int incrementValue$1 = param2;
          param2++;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          int incrementValue$2 = param3;
          param3++;
          int incrementValue$3 = param2;
          param2++;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          int incrementValue$4 = param3;
          param3++;
          int incrementValue$5 = param2;
          param2++;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          int incrementValue$6 = param3;
          param3++;
          int incrementValue$7 = param2;
          param2++;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
          int incrementValue$8 = param3;
          param3++;
          int incrementValue$9 = param2;
          param2++;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
        }
        param8.positionQ8 = param2 << 8;
        return param3;
    }

    private final static int mixForwardInterpolatedMono(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10, int param11, int param12) {
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
          int incrementValue$1 = param5;
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
          int incrementValue$0 = param5;
          param5++;
          param3[incrementValue$0] = param3[incrementValue$0] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
          param4 = param4 + param11;
        }
        param10.positionQ8 = param4;
        return param5;
    }

    final int priority() {
        int var1 = this.volumeQ6 * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.loopCount == 0) {
          var1 = var1 - var1 * this.positionQ8 / (((PcmSample) (this.sample)).samples.length << 8);
        } else if (this.loopCount >= 0) {
          var1 = var1 - var1 * this.loopStart / ((PcmSample) (this.sample)).samples.length;
        }
        return var1 > 255 ? 255 : var1;
    }

    final synchronized void rampVolumeAndPanQ6(int duration, int volumeQ6, int panQ14) {
        if (duration == 0) {
          this.setVolumeAndPanQ6(volumeQ6, panQ14);
          return;
        }
        int var4 = PcmSampleStream.leftGain(volumeQ6, panQ14);
        int var5 = PcmSampleStream.rightGain(volumeQ6, panQ14);
        if (this.leftVolumeQ6 != var4) {
          int var6 = volumeQ6 - this.volumeQ6;
          if (this.volumeQ6 - volumeQ6 > var6) {
            var6 = this.volumeQ6 - volumeQ6;
          }
          if (var4 - this.leftVolumeQ6 > var6) {
            var6 = var4 - this.leftVolumeQ6;
          }
          if (this.leftVolumeQ6 - var4 > var6) {
            var6 = this.leftVolumeQ6 - var4;
          }
          if (var5 - this.rightVolumeQ6 > var6) {
            var6 = var5 - this.rightVolumeQ6;
          }
          if (this.rightVolumeQ6 - var5 > var6) {
            var6 = this.rightVolumeQ6 - var5;
          }
          if (duration > var6) {
            duration = var6;
          }
          this.rampSamples = duration;
          this.targetVolumeQ6 = volumeQ6;
          this.panQ14 = panQ14;
          this.volumeStep = (volumeQ6 - this.volumeQ6) / duration;
          this.leftVolumeStep = (var4 - this.leftVolumeQ6) / duration;
          this.rightVolumeStep = (var5 - this.rightVolumeQ6) / duration;
          return;
        }
        if (this.rightVolumeQ6 != var5) {
          int var6Lifetime1 = volumeQ6 - this.volumeQ6;
          if (this.volumeQ6 - volumeQ6 > var6Lifetime1) {
            var6Lifetime1 = this.volumeQ6 - volumeQ6;
          }
          if (var4 - this.leftVolumeQ6 > var6Lifetime1) {
            var6Lifetime1 = var4 - this.leftVolumeQ6;
          }
          if (this.leftVolumeQ6 - var4 > var6Lifetime1) {
            var6Lifetime1 = this.leftVolumeQ6 - var4;
          }
          if (var5 - this.rightVolumeQ6 > var6Lifetime1) {
            var6Lifetime1 = var5 - this.rightVolumeQ6;
          }
          if (this.rightVolumeQ6 - var5 > var6Lifetime1) {
            var6Lifetime1 = this.rightVolumeQ6 - var5;
          }
          if (duration > var6Lifetime1) {
            duration = var6Lifetime1;
          }
          this.rampSamples = duration;
          this.targetVolumeQ6 = volumeQ6;
          this.panQ14 = panQ14;
          this.volumeStep = (volumeQ6 - this.volumeQ6) / duration;
          this.leftVolumeStep = (var4 - this.leftVolumeQ6) / duration;
          this.rightVolumeStep = (var5 - this.rightVolumeQ6) / duration;
          return;
        }
        this.rampSamples = 0;
    }

    final PcmStream nextSubstream() {
        return null;
    }

    final synchronized void setVolume(int volume) {
        this.setVolumeAndPanQ6(volume << 6, this.panQ14());
    }

    final synchronized void setLoopRange(int start, int end) {
        this.loopStart = start;
        this.loopEnd = end;
    }

    final int activity() {
        if (this.targetVolumeQ6 == 0 &&
          this.rampSamples == 0) {
          return 0;
        }
        return 1;
    }

    private final static int mixForwardMonoRamp(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmSampleStream param9) {
        param2 = param2 >> 8;
        param8 = param8 >> 8;
        param4 = param4 << 2;
        param5 = param5 << 2;
        param6 = param3 + param8 - param2;
        if (param3 + param8 - param2 > param7) {
          param6 = param7;
        }
        param9.leftVolumeQ6 = param9.leftVolumeQ6 + param9.leftVolumeStep * (param6 - param3);
        param9.rightVolumeQ6 = param9.rightVolumeQ6 + param9.rightVolumeStep * (param6 - param3);
        param6 -= 3;
        while (param3 < param6) {
          int incrementValue$0 = param3;
          param3++;
          int incrementValue$1 = param2;
          param2++;
          param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
          param4 = param4 + param5;
          int incrementValue$2 = param3;
          param3++;
          int incrementValue$3 = param2;
          param2++;
          param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
          param4 = param4 + param5;
          int incrementValue$4 = param3;
          param3++;
          int incrementValue$5 = param2;
          param2++;
          param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
          param4 = param4 + param5;
          int incrementValue$6 = param3;
          param3++;
          int incrementValue$7 = param2;
          param2++;
          param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
          param4 = param4 + param5;
        }
        param6 += 3;
        while (param3 < param6) {
          int incrementValue$8 = param3;
          param3++;
          int incrementValue$9 = param2;
          param2++;
          param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
          param4 = param4 + param5;
        }
        param9.volumeQ6 = param4 >> 2;
        param9.positionQ8 = param2 << 8;
        return param3;
    }

    final PcmStream firstSubstream() {
        return null;
    }

    final synchronized void setPingPongLoop(boolean enabled) {
        this.pingPongLoop = enabled ? true : false;
    }

    private final synchronized int panQ14() {
        return this.panQ14 < 0 ? -1 : this.panQ14;
    }

    final synchronized void fadeOut(int duration) {
        if (duration == 0) {
          this.setVolumeQ6(0);
          this.unlink((byte) -38);
          return;
        }
        if (this.leftVolumeQ6 != 0) {
          int var2 = -this.volumeQ6;
          if (this.volumeQ6 > var2) {
            var2 = this.volumeQ6;
          }
          if (-this.leftVolumeQ6 > var2) {
            var2 = -this.leftVolumeQ6;
          }
          if (this.leftVolumeQ6 > var2) {
            var2 = this.leftVolumeQ6;
          }
          if (-this.rightVolumeQ6 > var2) {
            var2 = -this.rightVolumeQ6;
          }
          if (this.rightVolumeQ6 > var2) {
            var2 = this.rightVolumeQ6;
          }
          if (duration > var2) {
            duration = var2;
          }
          this.rampSamples = duration;
          this.targetVolumeQ6 = -2147483648;
          this.volumeStep = -this.volumeQ6 / duration;
          this.leftVolumeStep = -this.leftVolumeQ6 / duration;
          this.rightVolumeStep = -this.rightVolumeQ6 / duration;
          return;
        }
        if (this.rightVolumeQ6 != 0) {
          int var2Lifetime1 = -this.volumeQ6;
          if (this.volumeQ6 > var2Lifetime1) {
            var2Lifetime1 = this.volumeQ6;
          }
          if (-this.leftVolumeQ6 > var2Lifetime1) {
            var2Lifetime1 = -this.leftVolumeQ6;
          }
          if (this.leftVolumeQ6 > var2Lifetime1) {
            var2Lifetime1 = this.leftVolumeQ6;
          }
          if (-this.rightVolumeQ6 > var2Lifetime1) {
            var2Lifetime1 = -this.rightVolumeQ6;
          }
          if (this.rightVolumeQ6 > var2Lifetime1) {
            var2Lifetime1 = this.rightVolumeQ6;
          }
          if (duration > var2Lifetime1) {
            duration = var2Lifetime1;
          }
          this.rampSamples = duration;
          this.targetVolumeQ6 = -2147483648;
          this.volumeStep = -this.volumeQ6 / duration;
          this.leftVolumeStep = -this.leftVolumeQ6 / duration;
          this.rightVolumeStep = -this.rightVolumeQ6 / duration;
          return;
        }
        this.rampSamples = 0;
        this.targetVolumeQ6 = 0;
        this.volumeQ6 = 0;
        this.unlink((byte) -23);
    }

    private final static int mixForwardInterpolatedMonoRamp(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
        param11.leftVolumeQ6 = param11.leftVolumeQ6 - param11.leftVolumeStep * param5;
        param11.rightVolumeQ6 = param11.rightVolumeQ6 - param11.rightVolumeStep * param5;
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
          int incrementValue$3 = param5;
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
          int incrementValue$2 = param5;
          param5++;
          param3[incrementValue$2] = param3[incrementValue$2] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
          param6 = param6 + param7;
          param4 = param4 + param12;
        }
        param11.leftVolumeQ6 = param11.leftVolumeQ6 + param11.leftVolumeStep * param5;
        param11.rightVolumeQ6 = param11.rightVolumeQ6 + param11.rightVolumeStep * param5;
        param11.volumeQ6 = param6;
        param11.positionQ8 = param4;
        return param5;
    }

    private final static int mixForwardInterpolatedStereo(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
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
          int incrementValue$6 = param5;
          param5++;
          param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
          int incrementValue$7 = param5;
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
          int incrementValue$4 = param5;
          param5++;
          param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
          int incrementValue$5 = param5;
          param5++;
          param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
          param4 = param4 + param12;
        }
        param11.positionQ8 = param4;
        return param5 >> 1;
    }

    final synchronized void rampVolumeAndPan(int duration, int volume, int panQ8) {
        this.rampVolumeAndPanQ6(duration, volume << 6, panQ8 << 6);
    }

    final synchronized void setSpeed(int stepQ8) {
        if (this.stepQ8 < 0) {
          this.stepQ8 = -stepQ8;
        } else {
          this.stepQ8 = stepQ8;
        }
    }

    final static PcmSampleStream createAtStepQ8(PcmSample sample, int stepQ8, int volumeQ6, int panQ14) {
        if (sample.samples == null) {
          return null;
        }
        if (sample.samples.length != 0) {
          return new PcmSampleStream(sample, stepQ8, volumeQ6, panQ14);
        }
        return null;
    }

    private final static int leftGain(int volumeQ6, int panQ14) {
        return panQ14 < 0 ? volumeQ6 : (int)((double)volumeQ6 * Math.sqrt((double)(16384 - panQ14) * 0.0001220703125) + 0.5);
    }

    final synchronized void rampVolume(int duration, int volume) {
        this.rampVolumeAndPanQ6(duration, volume << 6, this.panQ14());
    }

    private final static int mixReverseStereoRamp(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmSampleStream param12) {
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
        param12.volumeQ6 = param12.volumeQ6 + param12.volumeStep * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        while (param4 < param9) {
          param0 = param1[param3--];
          int incrementValue$1 = param4;
          param4++;
          param2[incrementValue$1] = param2[incrementValue$1] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$2 = param4;
          param4++;
          param2[incrementValue$2] = param2[incrementValue$2] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3--];
          int incrementValue$4 = param4;
          param4++;
          param2[incrementValue$4] = param2[incrementValue$4] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$5 = param4;
          param4++;
          param2[incrementValue$5] = param2[incrementValue$5] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3--];
          int incrementValue$7 = param4;
          param4++;
          param2[incrementValue$7] = param2[incrementValue$7] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$8 = param4;
          param4++;
          param2[incrementValue$8] = param2[incrementValue$8] + param0 * param6;
          param6 = param6 + param8;
          param0 = param1[param3--];
          int incrementValue$10 = param4;
          param4++;
          param2[incrementValue$10] = param2[incrementValue$10] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$11 = param4;
          param4++;
          param2[incrementValue$11] = param2[incrementValue$11] + param0 * param6;
          param6 = param6 + param8;
        }
        param9 += 6;
        while (param4 < param9) {
          param0 = param1[param3--];
          int incrementValue$13 = param4;
          param4++;
          param2[incrementValue$13] = param2[incrementValue$13] + param0 * param5;
          param5 = param5 + param7;
          int incrementValue$14 = param4;
          param4++;
          param2[incrementValue$14] = param2[incrementValue$14] + param0 * param6;
          param6 = param6 + param8;
        }
        param12.leftVolumeQ6 = param5 >> 2;
        param12.rightVolumeQ6 = param6 >> 2;
        param12.positionQ8 = param3 << 8;
        return param4 >> 1;
    }

    final synchronized void setVolumeAndPanQ6(int volumeQ6, int panQ14) {
        this.targetVolumeQ6 = volumeQ6;
        this.panQ14 = panQ14;
        this.rampSamples = 0;
        this.refreshGains();
    }

    private PcmSampleStream(PcmSample param0, int param1, int param2) {
        this.sample = (AbstractPcmSample) ((Object) param0);
        this.loopStart = param0.loopStart;
        this.loopEnd = param0.loopEnd;
        this.pingPongLoop = param0.pingPongLoop;
        this.stepQ8 = param1;
        this.targetVolumeQ6 = param2;
        this.panQ14 = 8192;
        this.positionQ8 = 0;
        this.refreshGains();
    }

    private PcmSampleStream(PcmSample param0, int param1, int param2, int param3) {
        this.sample = (AbstractPcmSample) ((Object) param0);
        this.loopStart = param0.loopStart;
        this.loopEnd = param0.loopEnd;
        this.pingPongLoop = param0.pingPongLoop;
        this.stepQ8 = param1;
        this.targetVolumeQ6 = param2;
        this.panQ14 = param3;
        this.positionQ8 = 0;
        this.refreshGains();
    }
}
