/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStream extends AudioStream {
    private int step256;
    private int gainStep;
    private int targetGain;
    private int loopStart;
    private int currentGain;
    private int rightGainStep;
    private int rightGain;
    private int rampRemaining;
    private int pan;
    private int leftGainStep;
    private int leftGain;
    private int loopEnd;
    private int loopCount;
    private int position256;
    private boolean pingPong;

    final int getSchedulingCost() {
        if (this.targetGain == 0 &&
          this.rampRemaining == 0) {
          return 0;
        }
        return 1;
    }

    final synchronized void skip(int frames) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        PcmSound var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (this.rampRemaining > 0) {
          if (frames < this.rampRemaining) {
            this.currentGain = this.currentGain + this.gainStep * frames;
            this.leftGain = this.leftGain + this.leftGainStep * frames;
            this.rightGain = this.rightGain + this.rightGainStep * frames;
            this.rampRemaining = this.rampRemaining - frames;
          } else {
            if (this.targetGain == -2147483648) {
              this.targetGain = 0;
              this.rightGain = 0;
              this.leftGain = 0;
              this.currentGain = 0;
              this.unlink((byte) 111);
              frames = this.rampRemaining;
            }
            this.rampRemaining = 0;
            this.recalculateGains();
          }
        }
        var2 = (PcmSound) (this.data);
        var3 = this.loopStart << 8;
        var4 = this.loopEnd << 8;
        var5 = var2.samples.length << 8;
        var6 = var4 - var3;
        if (var6 <= 0) {
          this.loopCount = 0;
        }
        if (this.position256 < 0) {
          if (this.step256 <= 0) {
            this.cancelRamp();
            this.unlink((byte) 111);
            return;
          }
          this.position256 = 0;
        }
        if (this.position256 >= var5) {
          if (this.step256 >= 0) {
            this.cancelRamp();
            this.unlink((byte) 111);
            return;
          }
          this.position256 = var5 - 1;
        }
        this.position256 = this.position256 + this.step256 * frames;
        if (this.loopCount < 0) {
          if (!this.pingPong) {
            if (this.step256 >= 0) {
              if (this.position256 < var4) {
                return;
              }
              this.position256 = var3 + (this.position256 - var3) % var6;
              return;
            }
            if (this.position256 >= var3) {
              return;
            }
            this.position256 = var4 - 1 - (var4 - 1 - this.position256) % var6;
            return;
          }
          if (this.step256 < 0) {
            if (this.position256 >= var3) {
              return;
            }
            this.position256 = var3 + var3 - 1 - this.position256;
            this.step256 = -this.step256;
          }
          while (this.position256 >= var4) {
            this.position256 = var4 + var4 - 1 - this.position256;
            this.step256 = -this.step256;
            if (this.position256 >= var3) {
              return;
            }
            this.position256 = var3 + var3 - 1 - this.position256;
            this.step256 = -this.step256;
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.loopCount > 0) {
          if (!this.pingPong) {
            if (this.step256 >= 0) {
              if (this.position256 < var4) {
                return;
              }
              var7 = (this.position256 - var3) / var6;
              if (var7 >= this.loopCount) {
                this.position256 = this.position256 - var6 * this.loopCount;
                this.loopCount = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.position256 = this.position256 - var6 * var7;
                this.loopCount = this.loopCount - var7;
              }
            } else {
              if (this.position256 >= var3) {
                return;
              }
              var7 = (var4 - 1 - this.position256) / var6;
              if (var7 >= this.loopCount) {
                this.position256 = this.position256 + var6 * this.loopCount;
                this.loopCount = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.position256 = this.position256 + var6 * var7;
                this.loopCount = this.loopCount - var7;
              }
            }
            if (decompiledFrameRemainder0) {
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.step256 < 0) {
              if (this.position256 >= var3) {
                return;
              }
              this.position256 = var3 + var3 - 1 - this.position256;
              this.step256 = -this.step256;
              fieldTemp$0 = this.loopCount - 1;
              this.loopCount = this.loopCount - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                if (this.position256 < var4) {
                  return;
                }
                this.position256 = var4 + var4 - 1 - this.position256;
                this.step256 = -this.step256;
                fieldTemp$1 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                if (this.position256 >= var3) {
                  return;
                }
                this.position256 = var3 + var3 - 1 - this.position256;
                this.step256 = -this.step256;
                fieldTemp$2 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.step256 >= 0) {
          if (this.position256 >= var5) {
            this.position256 = var5;
            this.cancelRamp();
            this.unlink((byte) 111);
          }
          return;
        }
        if (this.position256 >= 0) {
          return;
        }
        this.position256 = -1;
        this.cancelRamp();
        this.unlink((byte) 111);
    }

    final synchronized void setPosition(int position256) {
        int var2 = ((PcmSound) (this.data)).samples.length << 8;
        if (position256 < -1) {
          position256 = -1;
        }
        if (position256 > var2) {
          position256 = var2;
        }
        this.position256 = position256;
    }

    private final static int calculateLeftGain(int gain, int pan) {
        return pan < 0 ? gain : (int)((double)gain * Math.sqrt((double)(16384 - pan) * 0.0001220703125) + 0.5);
    }

    final synchronized int getVolume() {
        return this.targetGain == -2147483648 ? 0 : this.targetGain + 32 >> 6;
    }

    private final boolean finishRamp() {
        int var1;
        int var2;
        int var3;
        var1 = this.targetGain;
        if (var1 != -2147483648) {
          var2 = PcmStream.calculateLeftGain(var1, this.pan);
          var3 = PcmStream.calculateRightGain(var1, this.pan);
        } else {
          var3 = 0;
          var2 = 0;
          var1 = 0;
        }
        if (this.currentGain == var1 &&
          this.leftGain == var2 &&
          this.rightGain == var3) {
          if (this.targetGain != -2147483648) {
            this.recalculateGains();
            return false;
          }
          this.targetGain = 0;
          this.rightGain = 0;
          this.leftGain = 0;
          this.currentGain = 0;
          this.unlink((byte) 111);
          return true;
        }
        if (this.currentGain >= var1) {
          if (this.currentGain <= var1) {
            this.gainStep = 0;
          } else {
            this.gainStep = -1;
            this.rampRemaining = this.currentGain - var1;
          }
        } else {
          this.gainStep = 1;
          this.rampRemaining = var1 - this.currentGain;
        }
        if (this.leftGain >= var2) {
          if (this.leftGain <= var2) {
            this.leftGainStep = 0;
          } else {
            this.leftGainStep = -1;
            if (this.rampRemaining == 0 ||
              this.rampRemaining > this.leftGain - var2) {
              this.rampRemaining = this.leftGain - var2;
            }
          }
        } else {
          this.leftGainStep = 1;
          if (this.rampRemaining == 0 ||
            this.rampRemaining > var2 - this.leftGain) {
            this.rampRemaining = var2 - this.leftGain;
          }
        }
        if (this.rightGain < var3) {
          this.rightGainStep = 1;
          if (this.rampRemaining != 0 &&
            this.rampRemaining <= var3 - this.rightGain) {
            return false;
          }
          this.rampRemaining = var3 - this.rightGain;
          return false;
        }
        if (this.rightGain <= var3) {
          this.rightGainStep = 0;
        } else {
          this.rightGainStep = -1;
          if (this.rampRemaining == 0 ||
            this.rampRemaining > this.rightGain - var3) {
            this.rampRemaining = this.rightGain - var3;
          }
        }
        return false;
    }

    final synchronized int getGain() {
        return this.targetGain == -2147483648 ? 0 : this.targetGain;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, PcmStream param8) {
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
        param8.position256 = param2 << 8;
        return param3;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, PcmStream param8) {
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
        param8.position256 = param2 << 8;
        return param3;
    }

    final static PcmStream createAtRate(PcmSound sound, int speedPercent, int volume) {
        if (sound.samples == null) {
          return null;
        }
        if (sound.samples.length != 0) {
          return new PcmStream(sound, (int)((long)sound.sampleRate * 256L * (long)speedPercent / (long)(100 * PcmPlayer.sampleRate)), volume << 6);
        }
        return null;
    }

    private final synchronized void setGainAndPan(int gain, int pan) {
        this.targetGain = gain;
        this.pan = pan;
        this.rampRemaining = 0;
        this.recalculateGains();
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmStream param11, int param12, int param13) {
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
        param11.position256 = param4;
        return param5 >> 1;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmStream param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.currentGain = param13.currentGain - param13.gainStep * param5;
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
        param13.currentGain = param13.currentGain + param13.gainStep * param5;
        param13.leftGain = param6;
        param13.rightGain = param7;
        param13.position256 = param4;
        return param5;
    }

    final synchronized boolean isOutOfRange() {
        return this.position256 < 0 || this.position256 >= ((PcmSound) (this.data)).samples.length << 8;
    }

    final synchronized void fadeOut(int frames) {
        int var2 = 0;
        int var2Lifetime1;
        if (frames == 0) {
          this.setGain(0);
          this.unlink((byte) 111);
          return;
        }
        if (this.leftGain != 0) {
          var2 = -this.currentGain;
          if (this.currentGain > var2) {
            var2 = this.currentGain;
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
          if (frames > var2) {
            frames = var2;
          }
          this.rampRemaining = frames;
          this.targetGain = -2147483648;
          this.gainStep = -this.currentGain / frames;
          this.leftGainStep = -this.leftGain / frames;
          this.rightGainStep = -this.rightGain / frames;
          return;
        }
        if (this.rightGain != 0) {
          var2Lifetime1 = -this.currentGain;
          if (this.currentGain > var2Lifetime1) {
            var2Lifetime1 = this.currentGain;
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
          if (frames > var2Lifetime1) {
            frames = var2Lifetime1;
          }
          this.rampRemaining = frames;
          this.targetGain = -2147483648;
          this.gainStep = -this.currentGain / frames;
          this.leftGainStep = -this.leftGain / frames;
          this.rightGainStep = -this.rightGain / frames;
          return;
        }
        this.rampRemaining = 0;
        this.targetGain = 0;
        this.currentGain = 0;
        this.unlink((byte) 111);
    }

    final synchronized void setVolume(int volume) {
        this.setGainAndPan(volume << 6, this.getPan());
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmStream param12) {
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
        param12.currentGain = param12.currentGain + param12.gainStep * (param9 - param4);
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
        param12.position256 = param3 << 8;
        return param4 >> 1;
    }

    final int getPriority() {
        int var1 = this.currentGain * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.loopCount == 0) {
          var1 = var1 - var1 * this.position256 / (((PcmSound) (this.data)).samples.length << 8);
        } else {
          if (this.loopCount >= 0) {
            var1 = var1 - var1 * this.loopStart / ((PcmSound) (this.data)).samples.length;
          }
        }
        return var1 > 255 ? 255 : var1;
    }

    final synchronized void rampGain(int frames, int gain) {
        this.rampGainAndPan(frames, gain, this.getPan());
    }

    final synchronized void setSpeed(int magnitude) {
        if (this.step256 < 0) {
          this.step256 = -magnitude;
        } else {
          this.step256 = magnitude;
        }
    }

    final static PcmStream createWithVolume(PcmSound sound, int step256, int volume) {
        if (sound.samples == null) {
          return null;
        }
        if (sound.samples.length != 0) {
          return new PcmStream(sound, step256, volume << 6);
        }
        return null;
    }

    final synchronized void rampGainAndPan(int frames, int gain, int pan) {
        int var6 = 0;
        int var6Lifetime1;
        if (frames == 0) {
          this.setGainAndPan(gain, pan);
          return;
        }
        int var4 = PcmStream.calculateLeftGain(gain, pan);
        int var5 = PcmStream.calculateRightGain(gain, pan);
        if (this.leftGain != var4) {
          var6 = gain - this.currentGain;
          if (this.currentGain - gain > var6) {
            var6 = this.currentGain - gain;
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
          if (frames > var6) {
            frames = var6;
          }
          this.rampRemaining = frames;
          this.targetGain = gain;
          this.pan = pan;
          this.gainStep = (gain - this.currentGain) / frames;
          this.leftGainStep = (var4 - this.leftGain) / frames;
          this.rightGainStep = (var5 - this.rightGain) / frames;
          return;
        }
        if (this.rightGain != var5) {
          var6Lifetime1 = gain - this.currentGain;
          if (this.currentGain - gain > var6Lifetime1) {
            var6Lifetime1 = this.currentGain - gain;
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
          if (frames > var6Lifetime1) {
            frames = var6Lifetime1;
          }
          this.rampRemaining = frames;
          this.targetGain = gain;
          this.pan = pan;
          this.gainStep = (gain - this.currentGain) / frames;
          this.leftGainStep = (var4 - this.leftGain) / frames;
          this.rightGainStep = (var5 - this.rightGain) / frames;
          return;
        }
        this.rampRemaining = 0;
    }

    private final void cancelRamp() {
        if (this.rampRemaining != 0) {
          if (this.targetGain == -2147483648) {
            this.targetGain = 0;
          }
          this.rampRemaining = 0;
          this.recalculateGains();
          return;
        }
    }

    final synchronized void setLoopCount(int loopCount) {
        this.loopCount = loopCount;
    }

    final synchronized int getPan() {
        return this.pan < 0 ? -1 : this.pan;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmStream param10) {
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
        param10.position256 = param3 << 8;
        return param4 >> 1;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmStream param11, int param12, int param13) {
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
        param11.currentGain = param6;
        param11.position256 = param4;
        return param5;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmStream param11, int param12, int param13) {
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
        param11.currentGain = param6;
        param11.position256 = param4;
        return param5;
    }

    final AudioStream firstSubStream() {
        return null;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.rampRemaining <= 0) {
            if (this.step256 == 256 &&
              (this.position256 & 255) == 0) {
              if (PcmPlayer.stereo) {
                return PcmStream.b(0, ((PcmSound) (this.data)).samples, param0, this.position256, param1, this.leftGain, this.rightGain, 0, param3, param2, this);
              }
              return PcmStream.a(((PcmSound) (this.data)).samples, param0, this.position256, param1, this.currentGain, 0, param3, param2, this);
            }
            if (PcmPlayer.stereo) {
              return PcmStream.c(0, 0, ((PcmSound) (this.data)).samples, param0, this.position256, param1, this.leftGain, this.rightGain, 0, param3, param2, this, this.step256, param4);
            }
            return PcmStream.b(0, 0, ((PcmSound) (this.data)).samples, param0, this.position256, param1, this.currentGain, 0, param3, param2, this, this.step256, param4);
          }
          var6 = param1 + this.rampRemaining;
          if (var6 > param3) {
            var6 = param3;
          }
          this.rampRemaining = this.rampRemaining + param1;
          if (this.step256 == 256 &&
            (this.position256 & 255) == 0) {
            if (!PcmPlayer.stereo) {
              param1 = PcmStream.b(((PcmSound) (this.data)).samples, param0, this.position256, param1, this.currentGain, this.gainStep, 0, var6, param2, this);
            } else {
              param1 = PcmStream.b(0, ((PcmSound) (this.data)).samples, param0, this.position256, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this);
            }
          } else {
            if (!PcmPlayer.stereo) {
              param1 = PcmStream.a(0, 0, ((PcmSound) (this.data)).samples, param0, this.position256, param1, this.currentGain, this.gainStep, 0, var6, param2, this, this.step256, param4);
            } else {
              param1 = PcmStream.a(0, 0, ((PcmSound) (this.data)).samples, param0, this.position256, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this, this.step256, param4);
            }
          }
          this.rampRemaining = this.rampRemaining - param1;
          if (this.rampRemaining != 0) {
            return param1;
          }
        } while (!this.finishRamp());
        return param3;
    }

    final static PcmStream createWithGain(PcmSound sound, int step256, int gain, int pan) {
        if (sound.samples == null) {
          return null;
        }
        if (sound.samples.length != 0) {
          return new PcmStream(sound, step256, gain, pan);
        }
        return null;
    }

    final AudioStream nextSubStream() {
        return null;
    }

    final synchronized void setReverse(boolean reverse) {
        this.step256 = (this.step256 ^ this.step256 >> 31) + (this.step256 >>> 31);
        if (!reverse) {
          return;
        }
        this.step256 = -this.step256;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmStream param9) {
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
        param9.currentGain = param4 >> 2;
        param9.position256 = param2 << 8;
        return param3;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmStream param10) {
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
        param10.position256 = param3 << 8;
        return param4 >> 1;
    }

    final synchronized void fill(int[] output, int offset, int frames) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int discarded$4 = 0;
        int discarded$3 = 0;
        PcmSound var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var10Lifetime1;
        if (this.targetGain == 0 &&
          this.rampRemaining == 0) {
          this.skip(frames);
          return;
        }
        var4 = (PcmSound) (this.data);
        var5 = this.loopStart << 8;
        var6 = this.loopEnd << 8;
        var7 = var4.samples.length << 8;
        var8 = var6 - var5;
        if (var8 <= 0) {
          this.loopCount = 0;
        }
        var9 = offset;
        frames = frames + offset;
        if (this.position256 < 0) {
          if (this.step256 <= 0) {
            this.cancelRamp();
            this.unlink((byte) 111);
            return;
          }
          this.position256 = 0;
        }
        if (this.position256 >= var7) {
          if (this.step256 >= 0) {
            this.cancelRamp();
            this.unlink((byte) 111);
            return;
          }
          this.position256 = var7 - 1;
        }
        if (this.loopCount < 0) {
          if (!this.pingPong) {
            if (this.step256 >= 0) {
              while (true) {
                var9 = this.b(output, var9, var6, frames, (int) var4.samples[this.loopStart]);
                if (this.position256 < var6) {
                  return;
                }
                this.position256 = var5 + (this.position256 - var5) % var8;
              }
            }
            while (true) {
              var9 = this.a(output, var9, var5, frames, (int) var4.samples[this.loopEnd - 1]);
              if (this.position256 >= var5) {
                return;
              }
              this.position256 = var6 - 1 - (var6 - 1 - this.position256) % var8;
            }
          }
          if (this.step256 < 0) {
            var9 = this.a(output, var9, var5, frames, (int) var4.samples[this.loopStart]);
            if (this.position256 >= var5) {
              return;
            }
            this.position256 = var5 + var5 - 1 - this.position256;
            this.step256 = -this.step256;
          }
          while (true) {
            var9 = this.b(output, var9, var6, frames, (int) var4.samples[this.loopEnd - 1]);
            if (this.position256 < var6) {
              return;
            }
            this.position256 = var6 + var6 - 1 - this.position256;
            this.step256 = -this.step256;
            var9 = this.a(output, var9, var5, frames, (int) var4.samples[this.loopStart]);
            if (this.position256 >= var5) {
              return;
            }
            this.position256 = var5 + var5 - 1 - this.position256;
            this.step256 = -this.step256;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.loopCount > 0) {
          if (!this.pingPong) {
            if (this.step256 < 0) {
              while (true) {
                var9 = this.a(output, var9, var5, frames, (int) var4.samples[this.loopEnd - 1]);
                if (this.position256 >= var5) {
                  return;
                }
                var10 = (var6 - 1 - this.position256) / var8;
                if (var10 < this.loopCount) {
                  this.position256 = this.position256 + var8 * var10;
                  this.loopCount = this.loopCount - var10;
                  continue;
                }
                break;
              }
              this.position256 = this.position256 + var8 * this.loopCount;
              this.loopCount = 0;
            } else {
              while (true) {
                var9 = this.b(output, var9, var6, frames, (int) var4.samples[this.loopStart]);
                if (this.position256 < var6) {
                  return;
                }
                var10Lifetime1 = (this.position256 - var5) / var8;
                if (var10Lifetime1 < this.loopCount) {
                  this.position256 = this.position256 - var8 * var10Lifetime1;
                  this.loopCount = this.loopCount - var10Lifetime1;
                  continue;
                }
                break;
              }
              this.position256 = this.position256 - var8 * this.loopCount;
              this.loopCount = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.step256 < 0) {
              var9 = this.a(output, var9, var5, frames, (int) var4.samples[this.loopStart]);
              if (this.position256 >= var5) {
                return;
              }
              this.position256 = var5 + var5 - 1 - this.position256;
              this.step256 = -this.step256;
              fieldTemp$0 = this.loopCount - 1;
              this.loopCount = this.loopCount - 1;
              decompiledFrameRemainder0 = (fieldTemp$0 != 0);
            }
            if (decompiledFrameRemainder0) {
              do {
                var9 = this.b(output, var9, var6, frames, (int) var4.samples[this.loopEnd - 1]);
                if (this.position256 < var6) {
                  return;
                }
                this.position256 = var6 + var6 - 1 - this.position256;
                this.step256 = -this.step256;
                fieldTemp$1 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
                if (fieldTemp$1 == 0) {
                  break;
                }
                var9 = this.a(output, var9, var5, frames, (int) var4.samples[this.loopStart]);
                if (this.position256 >= var5) {
                  return;
                }
                this.position256 = var5 + var5 - 1 - this.position256;
                this.step256 = -this.step256;
                fieldTemp$2 = this.loopCount - 1;
                this.loopCount = this.loopCount - 1;
              } while (fieldTemp$2 != 0);
            }
          }
        }
        if (this.step256 >= 0) {
          discarded$4 = this.b(output, var9, var7, frames, 0);
          if (this.position256 >= var7) {
            this.position256 = var7;
            this.cancelRamp();
            this.unlink((byte) 111);
          }
          return;
        }
        discarded$3 = this.a(output, var9, 0, frames, 0);
        if (this.position256 >= 0) {
          return;
        }
        this.position256 = -1;
        this.cancelRamp();
        this.unlink((byte) 111);
        return;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, PcmStream param11, int param12, int param13) {
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
        param11.position256 = param4;
        return param5 >> 1;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, PcmStream param9) {
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
        param9.currentGain = param4 >> 2;
        param9.position256 = param2 << 8;
        return param3;
    }

    final synchronized int getSpeed() {
        return this.step256 < 0 ? -this.step256 : this.step256;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        do {
          if (this.rampRemaining <= 0) {
            if (this.step256 == -256 &&
              (this.position256 & 255) == 0) {
              if (PcmPlayer.stereo) {
                return PcmStream.a(0, ((PcmSound) (this.data)).samples, param0, this.position256, param1, this.leftGain, this.rightGain, 0, param3, param2, this);
              }
              return PcmStream.b(((PcmSound) (this.data)).samples, param0, this.position256, param1, this.currentGain, 0, param3, param2, this);
            }
            if (PcmPlayer.stereo) {
              return PcmStream.d(0, 0, ((PcmSound) (this.data)).samples, param0, this.position256, param1, this.leftGain, this.rightGain, 0, param3, param2, this, this.step256, param4);
            }
            return PcmStream.a(0, 0, ((PcmSound) (this.data)).samples, param0, this.position256, param1, this.currentGain, 0, param3, param2, this, this.step256, param4);
          }
          var6 = param1 + this.rampRemaining;
          if (var6 > param3) {
            var6 = param3;
          }
          this.rampRemaining = this.rampRemaining + param1;
          if (this.step256 == -256 &&
            (this.position256 & 255) == 0) {
            if (!PcmPlayer.stereo) {
              param1 = PcmStream.a(((PcmSound) (this.data)).samples, param0, this.position256, param1, this.currentGain, this.gainStep, 0, var6, param2, this);
            } else {
              param1 = PcmStream.a(0, ((PcmSound) (this.data)).samples, param0, this.position256, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this);
            }
          } else {
            if (!PcmPlayer.stereo) {
              param1 = PcmStream.b(0, 0, ((PcmSound) (this.data)).samples, param0, this.position256, param1, this.currentGain, this.gainStep, 0, var6, param2, this, this.step256, param4);
            } else {
              param1 = PcmStream.b(0, 0, ((PcmSound) (this.data)).samples, param0, this.position256, param1, this.leftGain, this.rightGain, this.leftGainStep, this.rightGainStep, 0, var6, param2, this, this.step256, param4);
            }
          }
          this.rampRemaining = this.rampRemaining - param1;
          if (this.rampRemaining != 0) {
            return param1;
          }
        } while (!this.finishRamp());
        return param3;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmStream param10, int param11, int param12) {
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
        param10.position256 = param4;
        return param5;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, PcmStream param12) {
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
        param12.currentGain = param12.currentGain + param12.gainStep * (param9 - param4);
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
        param12.position256 = param3 << 8;
        return param4 >> 1;
    }

    final synchronized void setGain(int gain) {
        this.setGainAndPan(gain, this.getPan());
    }

    final synchronized boolean isRamping() {
        return this.rampRemaining != 0;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, PcmStream param13, int param14, int param15) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        param13.currentGain = param13.currentGain - param13.gainStep * param5;
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
        param13.currentGain = param13.currentGain + param13.gainStep * param5;
        param13.leftGain = param6;
        param13.rightGain = param7;
        param13.position256 = param4;
        return param5;
    }

    private final void recalculateGains() {
        this.currentGain = this.targetGain;
        this.leftGain = PcmStream.calculateLeftGain(this.targetGain, this.pan);
        this.rightGain = PcmStream.calculateRightGain(this.targetGain, this.pan);
    }

    private final static int calculateRightGain(int gain, int pan) {
        return pan < 0 ? -gain : (int)((double)gain * Math.sqrt((double)pan * 0.0001220703125) + 0.5);
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, PcmStream param10, int param11, int param12) {
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
        param10.position256 = param4;
        return param5;
    }

    private PcmStream(PcmSound sound, int step256, int gain) {
        this.data = (AudioData) ((Object) sound);
        this.loopStart = sound.loopStart;
        this.loopEnd = sound.loopEnd;
        this.pingPong = sound.pingPong;
        this.step256 = step256;
        this.targetGain = gain;
        this.pan = 8192;
        this.position256 = 0;
        this.recalculateGains();
    }

    private PcmStream(PcmSound sound, int step256, int gain, int pan) {
        this.data = (AudioData) ((Object) sound);
        this.loopStart = sound.loopStart;
        this.loopEnd = sound.loopEnd;
        this.pingPong = sound.pingPong;
        this.step256 = step256;
        this.targetGain = gain;
        this.pan = pan;
        this.position256 = 0;
        this.recalculateGains();
    }
}
