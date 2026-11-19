/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSampleStream extends PcmStream {
    private int playbackStep;
    private int loopStart;
    private boolean pingPong;
    private int position;
    private int rightGainStep;
    private int leftGain;
    private int leftGainStep;
    private int targetVolume;
    private int rampFrames;
    private int loopEnd;
    private int loopCount;
    private int volume;
    private int volumeStep;
    private int rightGain;
    private int pan;

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

    private final static int mixForwardStereoInterpolatedRamp(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmSampleStream param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.volume = param13.volume - param13.volumeStep * param5;
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
        param13.volume = param13.volume + param13.volumeStep * param5;
        param13.leftGain = param6;
        param13.rightGain = param7;
        param13.position = param4;
        return param5;
    }

    final synchronized void setVolume(int param0) {
        this.setVolumeAndPan(param0, this.getPan());
    }

    final synchronized boolean isOutOfBounds() {
        return this.position < 0 || this.position >= ((PcmSample) (this.field_i)).field_n.length << 8;
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

    final synchronized void setPlaybackStep(int param0) {
        if (this.playbackStep < 0) {
          this.playbackStep = -param0;
        } else {
          this.playbackStep = param0;
        }
    }

    private final static int mixBackwardMonoInterpolatedRamp(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
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
        param11.volume = param6;
        param11.position = param4;
        return param5;
    }

    private final boolean finishVolumeRamp() {
        int var1;
        int var2;
        int var3;
        var1 = this.targetVolume;
        if (var1 != -2147483648) {
          var2 = PcmSampleStream.calculateLeftGain(var1, this.pan);
          var3 = PcmSampleStream.calculateRightGain(var1, this.pan);
        } else {
          var3 = 0;
          var2 = 0;
          var1 = 0;
        }
        if (this.volume == var1 &&
          this.leftGain == var2 &&
          this.rightGain == var3) {
          if (this.targetVolume != -2147483648) {
            this.refreshChannelGains();
            return false;
          }
          this.targetVolume = 0;
          this.rightGain = 0;
          this.leftGain = 0;
          this.volume = 0;
          this.unlink(0);
          return true;
        }
        if (this.volume >= var1) {
          if (this.volume <= var1) {
            this.volumeStep = 0;
          } else {
            this.volumeStep = -1;
            this.rampFrames = this.volume - var1;
          }
        } else {
          this.volumeStep = 1;
          this.rampFrames = var1 - this.volume;
        }
        if (this.leftGain >= var2) {
          if (this.leftGain <= var2) {
            this.leftGainStep = 0;
          } else {
            this.leftGainStep = -1;
            if (this.rampFrames == 0 ||
              this.rampFrames > this.leftGain - var2) {
              this.rampFrames = this.leftGain - var2;
            }
          }
        } else {
          this.leftGainStep = 1;
          if (this.rampFrames == 0 ||
            this.rampFrames > var2 - this.leftGain) {
            this.rampFrames = var2 - this.leftGain;
          }
        }
        if (this.rightGain < var3) {
          this.rightGainStep = 1;
          if (this.rampFrames != 0 &&
            this.rampFrames <= var3 - this.rightGain) {
            return false;
          }
          this.rampFrames = var3 - this.rightGain;
          return false;
        }
        if (this.rightGain <= var3) {
          this.rightGainStep = 0;
        } else {
          this.rightGainStep = -1;
          if (this.rampFrames == 0 ||
            this.rampFrames > this.rightGain - var3) {
            this.rampFrames = this.rightGain - var3;
          }
        }
        return false;
    }

    private final void refreshChannelGains() {
        this.volume = this.targetVolume;
        this.leftGain = PcmSampleStream.calculateLeftGain(this.targetVolume, this.pan);
        this.rightGain = PcmSampleStream.calculateRightGain(this.targetVolume, this.pan);
    }

    private final int mixForward(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.rampFrames <= 0) {
            if (this.playbackStep == 256 &&
              (this.position & 255) == 0) {
              if (AudioOutput.field_t) {
                return PcmSampleStream.mixForwardStereo(0, ((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.leftGain, this.rightGain, 0, param3, param2, this);
              }
              return PcmSampleStream.mixForwardMono(((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.volume, 0, param3, param2, this);
            }
            if (AudioOutput.field_t) {
              return PcmSampleStream.mixForwardStereoInterpolated(0, 0, ((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.leftGain, this.rightGain, 0, param3, param2, this, this.playbackStep, param4);
            }
            return PcmSampleStream.mixForwardMonoInterpolated(0, 0, ((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.volume, 0, param3, param2, this, this.playbackStep, param4);
          }
          var6 = param1 + this.rampFrames;
          if (var6 > param3) {
            var6 = param3;
          }
          this.rampFrames = this.rampFrames + param1;
          if (this.playbackStep == 256 &&
            (this.position & 255) == 0) {
            if (!AudioOutput.field_t) {
              param1 = PcmSampleStream.mixForwardMonoRamp(((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.volume, this.volumeStep, 0, var6, param2, this);
            } else {
              param1 = PcmSampleStream.mixForwardStereoRamp(0, ((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this);
            }
          } else {
            if (!AudioOutput.field_t) {
              param1 = PcmSampleStream.mixForwardMonoInterpolatedRamp(0, 0, ((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.volume, this.volumeStep, 0, var6, param2, this, this.playbackStep, param4);
            } else {
              param1 = PcmSampleStream.mixForwardStereoInterpolatedRamp(0, 0, ((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this, this.playbackStep, param4);
            }
          }
          this.rampFrames = this.rampFrames - param1;
          if (this.rampFrames != 0) {
            return param1;
          }
        } while (!this.finishVolumeRamp());
        return param3;
    }

    final static PcmSampleStream createWithStep(PcmSample param0, int param1, int param2, int param3) {
        if (param0.field_n == null) {
          return null;
        }
        if (param0.field_n.length != 0) {
          return new PcmSampleStream(param0, param1, param2, param3);
        }
        return null;
    }

    final synchronized void setPan(int param0) {
        this.setVolumeAndPan(this.getVolume(), param0);
    }

    private final static int mixBackwardStereo(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10) {
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

    final static PcmSampleStream createAtRate(PcmSample param0, int param1, int param2, int param3) {
        if (param0.field_n == null) {
          return null;
        }
        if (param0.field_n.length != 0) {
          return new PcmSampleStream(param0, (int)((long)param0.field_j * 256L * (long)param1 / (long)(100 * AudioOutput.field_l)), param2 << 6, param3 << 6);
        }
        return null;
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
        if (this.rampFrames > 0) {
          if (param0 < this.rampFrames) {
            this.volume = this.volume + this.volumeStep * param0;
            this.leftGain = this.leftGain + this.leftGainStep * param0;
            this.rightGain = this.rightGain + this.rightGainStep * param0;
            this.rampFrames = this.rampFrames - param0;
          } else {
            if (this.targetVolume == -2147483648) {
              this.targetVolume = 0;
              this.rightGain = 0;
              this.leftGain = 0;
              this.volume = 0;
              this.unlink(0);
              param0 = this.rampFrames;
            }
            this.rampFrames = 0;
            this.refreshChannelGains();
          }
        }
        var2 = (PcmSample) (this.field_i);
        var3 = this.loopStart << 8;
        var4 = this.loopEnd << 8;
        var5 = var2.field_n.length << 8;
        var6 = var4 - var3;
        if (var6 <= 0) {
          this.loopCount = 0;
        }
        if (this.position < 0) {
          if (this.playbackStep <= 0) {
            this.cancelVolumeRamp();
            this.unlink(0);
            return;
          }
          this.position = 0;
        }
        if (this.position >= var5) {
          if (this.playbackStep >= 0) {
            this.cancelVolumeRamp();
            this.unlink(0);
            return;
          }
          this.position = var5 - 1;
        }
        this.position = this.position + this.playbackStep * param0;
        if (this.loopCount < 0) {
          if (!this.pingPong) {
            if (this.playbackStep >= 0) {
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
          if (this.playbackStep < 0) {
            if (this.position >= var3) {
              return;
            }
            this.position = var3 + var3 - 1 - this.position;
            this.playbackStep = -this.playbackStep;
          }
          while (this.position >= var4) {
            this.position = var4 + var4 - 1 - this.position;
            this.playbackStep = -this.playbackStep;
            if (this.position >= var3) {
              return;
            }
            this.position = var3 + var3 - 1 - this.position;
            this.playbackStep = -this.playbackStep;
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.loopCount > 0) {
          if (!this.pingPong) {
            if (this.playbackStep >= 0) {
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
            if (this.playbackStep < 0) {
              if (this.position >= var3) {
                return;
              }
              this.position = var3 + var3 - 1 - this.position;
              this.playbackStep = -this.playbackStep;
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
                this.playbackStep = -this.playbackStep;
                fieldTemp$1 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                if (this.position >= var3) {
                  return;
                }
                this.position = var3 + var3 - 1 - this.position;
                this.playbackStep = -this.playbackStep;
                fieldTemp$2 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.playbackStep >= 0) {
          if (this.position >= var5) {
            this.position = var5;
            this.cancelVolumeRamp();
            this.unlink(0);
          }
          return;
        }
        if (this.position >= 0) {
          return;
        }
        this.position = -1;
        this.cancelVolumeRamp();
        this.unlink(0);
    }

    final synchronized int getSamplePosition() {
        return this.position >> 8;
    }

    private final static int calculateLeftGain(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private final static int mixBackwardMonoRamp(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmSampleStream param9) {
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
        param9.volume = param4 >> 2;
        param9.position = param2 << 8;
        return param3;
    }

    final synchronized void setSamplePosition(int param0) {
        param0 = param0 << 8;
        int var2 = ((PcmSample) (this.field_i)).field_n.length << 8;
        if (param0 < -1) {
          param0 = -1;
        }
        if (param0 > var2) {
          param0 = var2;
        }
        this.position = param0;
    }

    final synchronized int getPlaybackStep() {
        return this.playbackStep < 0 ? -this.playbackStep : this.playbackStep;
    }

    final synchronized void setReversed(boolean param0) {
        this.playbackStep = (this.playbackStep ^ this.playbackStep >> 31) + (this.playbackStep >>> 31);
        if (!param0) {
          return;
        }
        this.playbackStep = -this.playbackStep;
    }

    final PcmStream firstSubStream() {
        return null;
    }

    private final static int mixForwardMono(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, PcmSampleStream param8) {
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

    final static PcmSampleStream createAtRate(PcmSample param0, int param1, int param2) {
        if (param0.field_n == null) {
          return null;
        }
        if (param0.field_n.length != 0) {
          return new PcmSampleStream(param0, (int)((long)param0.field_j * 256L * (long)param1 / (long)(100 * AudioOutput.field_l)), param2 << 6);
        }
        return null;
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
        param11.volume = param6;
        param11.position = param4;
        return param5;
    }

    private final static int mixForwardMonoRamp(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmSampleStream param9) {
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
        param9.volume = param4 >> 2;
        param9.position = param2 << 8;
        return param3;
    }

    private final static int mixBackwardStereoRamp(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmSampleStream param12) {
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
        param12.volume = param12.volume + param12.volumeStep * (param9 - param4);
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

    final static PcmSampleStream createWithStep(PcmSample param0, int param1, int param2) {
        if (param0.field_n == null) {
          return null;
        }
        if (param0.field_n.length != 0) {
          return new PcmSampleStream(param0, param1, param2 << 6);
        }
        return null;
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
        if (this.targetVolume == 0 &&
          this.rampFrames == 0) {
          this.skip(param2);
          return;
        }
        var4 = (PcmSample) (this.field_i);
        var5 = this.loopStart << 8;
        var6 = this.loopEnd << 8;
        var7 = var4.field_n.length << 8;
        var8 = var6 - var5;
        if (var8 <= 0) {
          this.loopCount = 0;
        }
        var9 = param1;
        param2 = param2 + param1;
        if (this.position < 0) {
          if (this.playbackStep <= 0) {
            this.cancelVolumeRamp();
            this.unlink(0);
            return;
          }
          this.position = 0;
        }
        if (this.position >= var7) {
          if (this.playbackStep >= 0) {
            this.cancelVolumeRamp();
            this.unlink(0);
            return;
          }
          this.position = var7 - 1;
        }
        if (this.loopCount < 0) {
          if (!this.pingPong) {
            if (this.playbackStep >= 0) {
              while (true) {
                var9 = this.mixForward(param0, var9, var6, param2, (int) var4.field_n[this.loopStart]);
                if (this.position < var6) {
                  return;
                }
                this.position = var5 + (this.position - var5) % var8;
              }
            }
            while (true) {
              var9 = this.mixBackward(param0, var9, var5, param2, (int) var4.field_n[this.loopEnd - 1]);
              if (this.position >= var5) {
                return;
              }
              this.position = var6 - 1 - (var6 - 1 - this.position) % var8;
            }
          }
          if (this.playbackStep < 0) {
            var9 = this.mixBackward(param0, var9, var5, param2, (int) var4.field_n[this.loopStart]);
            if (this.position >= var5) {
              return;
            }
            this.position = var5 + var5 - 1 - this.position;
            this.playbackStep = -this.playbackStep;
          }
          while (true) {
            var9 = this.mixForward(param0, var9, var6, param2, (int) var4.field_n[this.loopEnd - 1]);
            if (this.position < var6) {
              return;
            }
            this.position = var6 + var6 - 1 - this.position;
            this.playbackStep = -this.playbackStep;
            var9 = this.mixBackward(param0, var9, var5, param2, (int) var4.field_n[this.loopStart]);
            if (this.position >= var5) {
              return;
            }
            this.position = var5 + var5 - 1 - this.position;
            this.playbackStep = -this.playbackStep;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.loopCount > 0) {
          if (!this.pingPong) {
            if (this.playbackStep < 0) {
              while (true) {
                var9 = this.mixBackward(param0, var9, var5, param2, (int) var4.field_n[this.loopEnd - 1]);
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
                var9 = this.mixForward(param0, var9, var6, param2, (int) var4.field_n[this.loopStart]);
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
            if (this.playbackStep < 0) {
              var9 = this.mixBackward(param0, var9, var5, param2, (int) var4.field_n[this.loopStart]);
              if (this.position >= var5) {
                return;
              }
              this.position = var5 + var5 - 1 - this.position;
              this.playbackStep = -this.playbackStep;
              fieldTemp$0 = this.loopCount - 1;
              this.loopCount = this.loopCount - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                var9 = this.mixForward(param0, var9, var6, param2, (int) var4.field_n[this.loopEnd - 1]);
                if (this.position < var6) {
                  return;
                }
                this.position = var6 + var6 - 1 - this.position;
                this.playbackStep = -this.playbackStep;
                fieldTemp$1 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                var9 = this.mixBackward(param0, var9, var5, param2, (int) var4.field_n[this.loopStart]);
                if (this.position >= var5) {
                  return;
                }
                this.position = var5 + var5 - 1 - this.position;
                this.playbackStep = -this.playbackStep;
                fieldTemp$2 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.playbackStep >= 0) {
          discarded$4 = this.mixForward(param0, var9, var7, param2, 0);
          if (this.position >= var7) {
            this.position = var7;
            this.cancelVolumeRamp();
            this.unlink(0);
          }
          return;
        }
        discarded$3 = this.mixBackward(param0, var9, 0, param2, 0);
        if (this.position >= 0) {
          return;
        }
        this.position = -1;
        this.cancelVolumeRamp();
        this.unlink(0);
        return;
    }

    private final void cancelVolumeRamp() {
        if (this.rampFrames != 0) {
          if (this.targetVolume == -2147483648) {
            this.targetVolume = 0;
          }
          this.rampFrames = 0;
          this.refreshChannelGains();
          return;
        }
    }

    final int getPriority() {
        int var1 = this.volume * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.loopCount == 0) {
          var1 = var1 - var1 * this.position / (((PcmSample) (this.field_i)).field_n.length << 8);
        } else {
          if (this.loopCount >= 0) {
            var1 = var1 - var1 * this.loopStart / ((PcmSample) (this.field_i)).field_n.length;
          }
        }
        return var1 > 255 ? 255 : var1;
    }

    private final static int calculateRightGain(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int mixForwardStereo(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10) {
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

    final synchronized void fadeOutAndRemove(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == 0) {
          this.setVolume(0);
          this.unlink(0);
          return;
        }
        if (this.leftGain != 0) {
          var2 = -this.volume;
          if (this.volume > var2) {
            var2 = this.volume;
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
          this.rampFrames = param0;
          this.targetVolume = -2147483648;
          this.volumeStep = -this.volume / param0;
          this.leftGainStep = -this.leftGain / param0;
          this.rightGainStep = -this.rightGain / param0;
          return;
        }
        if (this.rightGain != 0) {
          var2Lifetime1 = -this.volume;
          if (this.volume > var2Lifetime1) {
            var2Lifetime1 = this.volume;
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
          this.rampFrames = param0;
          this.targetVolume = -2147483648;
          this.volumeStep = -this.volume / param0;
          this.leftGainStep = -this.leftGain / param0;
          this.rightGainStep = -this.rightGain / param0;
          return;
        }
        this.rampFrames = 0;
        this.targetVolume = 0;
        this.volume = 0;
        this.unlink(0);
    }

    final synchronized int getVolume() {
        return this.targetVolume == -2147483648 ? 0 : this.targetVolume;
    }

    final synchronized boolean isRamping() {
        return this.rampFrames != 0;
    }

    private final synchronized void setVolumeAndPan(int param0, int param1) {
        this.targetVolume = param0;
        this.pan = param1;
        this.rampFrames = 0;
        this.refreshChannelGains();
    }

    final synchronized void setFixedPosition(int param0) {
        int var2 = ((PcmSample) (this.field_i)).field_n.length << 8;
        if (param0 < -1) {
          param0 = -1;
        }
        if (param0 > var2) {
          param0 = var2;
        }
        this.position = param0;
    }

    final int getActivityWeight() {
        if (this.targetVolume == 0 &&
          this.rampFrames == 0) {
          return 0;
        }
        return 1;
    }

    private final static int mixBackwardStereoInterpolatedRamp(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmSampleStream param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.volume = param13.volume - param13.volumeStep * param5;
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
        param13.volume = param13.volume + param13.volumeStep * param5;
        param13.leftGain = param6;
        param13.rightGain = param7;
        param13.position = param4;
        return param5;
    }

    private final static int mixBackwardMonoInterpolated(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmSampleStream param10, int param11, int param12) {
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

    final synchronized void setLoopCount(int param0) {
        this.loopCount = param0;
    }

    private final int mixBackward(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.rampFrames <= 0) {
            if (this.playbackStep == -256 &&
              (this.position & 255) == 0) {
              if (AudioOutput.field_t) {
                return PcmSampleStream.mixBackwardStereo(0, ((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.leftGain, this.rightGain, 0, param3, param2, this);
              }
              return PcmSampleStream.mixBackwardMono(((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.volume, 0, param3, param2, this);
            }
            if (AudioOutput.field_t) {
              return PcmSampleStream.mixBackwardStereoInterpolated(0, 0, ((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.leftGain, this.rightGain, 0, param3, param2, this, this.playbackStep, param4);
            }
            return PcmSampleStream.mixBackwardMonoInterpolated(0, 0, ((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.volume, 0, param3, param2, this, this.playbackStep, param4);
          }
          var6 = param1 + this.rampFrames;
          if (var6 > param3) {
            var6 = param3;
          }
          this.rampFrames = this.rampFrames + param1;
          if (this.playbackStep == -256 &&
            (this.position & 255) == 0) {
            if (!AudioOutput.field_t) {
              param1 = PcmSampleStream.mixBackwardMonoRamp(((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.volume, this.volumeStep, 0, var6, param2, this);
            } else {
              param1 = PcmSampleStream.mixBackwardStereoRamp(0, ((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this);
            }
          } else {
            if (!AudioOutput.field_t) {
              param1 = PcmSampleStream.mixBackwardMonoInterpolatedRamp(0, 0, ((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.volume, this.volumeStep, 0, var6, param2, this, this.playbackStep, param4);
            } else {
              param1 = PcmSampleStream.mixBackwardStereoInterpolatedRamp(0, 0, ((PcmSample) (this.field_i)).field_n, param0, this.position, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this, this.playbackStep, param4);
            }
          }
          this.rampFrames = this.rampFrames - param1;
          if (this.rampFrames != 0) {
            return param1;
          }
        } while (!this.finishVolumeRamp());
        return param3;
    }

    final synchronized void rampVolumeAndPan(int param0, int param1, int param2) {
        int var6 = 0;
        int var6Lifetime1;
        if (param0 == 0) {
          this.setVolumeAndPan(param1, param2);
          return;
        }
        int var4 = PcmSampleStream.calculateLeftGain(param1, param2);
        int var5 = PcmSampleStream.calculateRightGain(param1, param2);
        if (this.leftGain != var4) {
          var6 = param1 - this.volume;
          if (this.volume - param1 > var6) {
            var6 = this.volume - param1;
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
          this.rampFrames = param0;
          this.targetVolume = param1;
          this.pan = param2;
          this.volumeStep = (param1 - this.volume) / param0;
          this.leftGainStep = (var4 - this.leftGain) / param0;
          this.rightGainStep = (var5 - this.rightGain) / param0;
          return;
        }
        if (this.rightGain != var5) {
          var6Lifetime1 = param1 - this.volume;
          if (this.volume - param1 > var6Lifetime1) {
            var6Lifetime1 = this.volume - param1;
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
          this.rampFrames = param0;
          this.targetVolume = param1;
          this.pan = param2;
          this.volumeStep = (param1 - this.volume) / param0;
          this.leftGainStep = (var4 - this.leftGain) / param0;
          this.rightGainStep = (var5 - this.rightGain) / param0;
          return;
        }
        this.rampFrames = 0;
    }

    final synchronized int getPan() {
        return this.pan < 0 ? -1 : this.pan;
    }

    private final static int mixBackwardMono(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, PcmSampleStream param8) {
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

    final PcmStream nextSubStream() {
        return null;
    }

    private final static int mixForwardStereoRamp(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmSampleStream param12) {
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
        param12.volume = param12.volume + param12.volumeStep * (param9 - param4);
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

    private final static int mixBackwardStereoInterpolated(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmSampleStream param11, int param12, int param13) {
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

    final synchronized void rampVolume(int param0, int param1) {
        this.rampVolumeAndPan(param0, param1, this.getPan());
    }

    private PcmSampleStream(PcmSample param0, int param1, int param2) {
        this.field_i = (AbstractAudioSample) ((Object) param0);
        this.loopStart = param0.field_m;
        this.loopEnd = param0.field_l;
        this.pingPong = param0.field_k;
        this.playbackStep = param1;
        this.targetVolume = param2;
        this.pan = 8192;
        this.position = 0;
        this.refreshChannelGains();
    }

    private PcmSampleStream(PcmSample param0, int param1, int param2, int param3) {
        this.field_i = (AbstractAudioSample) ((Object) param0);
        this.loopStart = param0.field_m;
        this.loopEnd = param0.field_l;
        this.pingPong = param0.field_k;
        this.playbackStep = param1;
        this.targetVolume = param2;
        this.pan = param3;
        this.position = 0;
        this.refreshChannelGains();
    }
}
