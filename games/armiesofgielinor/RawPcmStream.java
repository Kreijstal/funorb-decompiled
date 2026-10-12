/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RawPcmStream extends PcmStream {
    private int loopEnd;
    private int rampFramesRemaining;
    private int volumeStep;
    private int volume;
    private int position;
    private int leftVolumeStep;
    private int remainingLoops;
    private int step;
    private int rightVolume;
    private int pan;
    private int targetVolume;
    private int rightVolumeStep;
    private int loopStart;
    private boolean pingPongLoop;
    private int leftVolume;

    private final static int mixForwardMonoAlignedRamped(byte[] samples, int[] output, int position, int outputPosition, int volume, int volumeStep, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream) {
        int outputIndex1 = 0;
        int sampleIndex1 = 0;
        int outputIndex2 = 0;
        int sampleIndex2 = 0;
        int outputIndex3 = 0;
        int sampleIndex3 = 0;
        int outputIndex4 = 0;
        int sampleIndex4 = 0;
        int outputIndex5 = 0;
        int sampleIndex5 = 0;
        position = position >> 8;
        sourceBoundary = sourceBoundary >> 8;
        volume = volume << 2;
        volumeStep = volumeStep << 2;
        mixLimit = outputPosition + sourceBoundary - position;
        if (outputPosition + sourceBoundary - position > outputLimit) {
          mixLimit = outputLimit;
        }
        stream.leftVolume = stream.leftVolume + stream.leftVolumeStep * (mixLimit - outputPosition);
        stream.rightVolume = stream.rightVolume + stream.rightVolumeStep * (mixLimit - outputPosition);
        mixLimit -= 3;
        while (outputPosition < mixLimit) {
          outputIndex1 = outputPosition;
          outputPosition++;
          sampleIndex1 = position;
          position++;
          output[outputIndex1] = output[outputIndex1] + samples[sampleIndex1] * volume;
          volume = volume + volumeStep;
          outputIndex2 = outputPosition;
          outputPosition++;
          sampleIndex2 = position;
          position++;
          output[outputIndex2] = output[outputIndex2] + samples[sampleIndex2] * volume;
          volume = volume + volumeStep;
          outputIndex3 = outputPosition;
          outputPosition++;
          sampleIndex3 = position;
          position++;
          output[outputIndex3] = output[outputIndex3] + samples[sampleIndex3] * volume;
          volume = volume + volumeStep;
          outputIndex4 = outputPosition;
          outputPosition++;
          sampleIndex4 = position;
          position++;
          output[outputIndex4] = output[outputIndex4] + samples[sampleIndex4] * volume;
          volume = volume + volumeStep;
        }
        mixLimit += 3;
        while (outputPosition < mixLimit) {
          outputIndex5 = outputPosition;
          outputPosition++;
          sampleIndex5 = position;
          position++;
          output[outputIndex5] = output[outputIndex5] + samples[sampleIndex5] * volume;
          volume = volume + volumeStep;
        }
        stream.volume = volume >> 2;
        stream.position = position << 8;
        return outputPosition;
    }

    final synchronized void setStepMagnitude(int magnitude) {
        if (this.step < 0) {
          this.step = -magnitude;
        } else {
          this.step = magnitude;
        }
    }

    final static RawPcmStream createAtRateAndPan(PcmSample sample, int ratePercent, int volume, int pan) {
        if (sample.samples == null) {
          return null;
        }
        if (sample.samples.length != 0) {
          return new RawPcmStream(sample, (int)((long)sample.sampleRate * 256L * (long)ratePercent / (long)(100 * PcmPlayer.outputSampleRate)), volume << 6, pan << 6);
        }
        return null;
    }

    private final static int mixForwardStereoAlignedConstant(int sampleValue, byte[] samples, int[] output, int position, int outputPosition, int leftVolume, int rightVolume, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream) {
        int outputIndex1 = 0;
        int outputIndex2 = 0;
        int outputIndex3 = 0;
        int outputIndex4 = 0;
        int outputIndex5 = 0;
        int outputIndex6 = 0;
        int outputIndex7 = 0;
        int outputIndex8 = 0;
        int outputIndex9 = 0;
        int outputIndex10 = 0;
        position = position >> 8;
        sourceBoundary = sourceBoundary >> 8;
        leftVolume = leftVolume << 2;
        rightVolume = rightVolume << 2;
        mixLimit = outputPosition + sourceBoundary - position;
        if (outputPosition + sourceBoundary - position > outputLimit) {
          mixLimit = outputLimit;
        }
        outputPosition = outputPosition << 1;
        mixLimit = mixLimit << 1;
        mixLimit -= 6;
        while (outputPosition < mixLimit) {
          sampleValue = samples[position++];
          outputIndex1 = outputPosition;
          outputPosition++;
          output[outputIndex1] = output[outputIndex1] + sampleValue * leftVolume;
          outputIndex2 = outputPosition;
          outputPosition++;
          output[outputIndex2] = output[outputIndex2] + sampleValue * rightVolume;
          sampleValue = samples[position++];
          outputIndex3 = outputPosition;
          outputPosition++;
          output[outputIndex3] = output[outputIndex3] + sampleValue * leftVolume;
          outputIndex4 = outputPosition;
          outputPosition++;
          output[outputIndex4] = output[outputIndex4] + sampleValue * rightVolume;
          sampleValue = samples[position++];
          outputIndex5 = outputPosition;
          outputPosition++;
          output[outputIndex5] = output[outputIndex5] + sampleValue * leftVolume;
          outputIndex6 = outputPosition;
          outputPosition++;
          output[outputIndex6] = output[outputIndex6] + sampleValue * rightVolume;
          sampleValue = samples[position++];
          outputIndex7 = outputPosition;
          outputPosition++;
          output[outputIndex7] = output[outputIndex7] + sampleValue * leftVolume;
          outputIndex8 = outputPosition;
          outputPosition++;
          output[outputIndex8] = output[outputIndex8] + sampleValue * rightVolume;
        }
        mixLimit += 6;
        while (outputPosition < mixLimit) {
          sampleValue = samples[position++];
          outputIndex9 = outputPosition;
          outputPosition++;
          output[outputIndex9] = output[outputIndex9] + sampleValue * leftVolume;
          outputIndex10 = outputPosition;
          outputPosition++;
          output[outputIndex10] = output[outputIndex10] + sampleValue * rightVolume;
        }
        stream.position = position << 8;
        return outputPosition >> 1;
    }

    private final static int mixReverseMonoInterpolatedConstant(int sampleValue, int sampleIndex, byte[] samples, int[] output, int position, int outputPosition, int volume, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream, int step, int boundarySample) {
        int outputIndex1 = 0;
        int outputIndex2 = 0;
        if (step != 0) {
          mixLimit = outputPosition + (sourceBoundary + 256 - position + step) / step;
        }
        if (step == 0 ||
          outputPosition + (sourceBoundary + 256 - position + step) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        while (outputPosition < mixLimit) {
          sampleIndex = position >> 8;
          sampleValue = samples[sampleIndex - 1];
          outputIndex1 = outputPosition;
          outputPosition++;
          output[outputIndex1] = output[outputIndex1] + (((sampleValue << 8) + (samples[sampleIndex] - sampleValue) * (position & 255)) * volume >> 6);
          position = position + step;
        }
        if (step != 0) {
          mixLimit = outputPosition + (sourceBoundary - position + step) / step;
        }
        if (step == 0 ||
          outputPosition + (sourceBoundary - position + step) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        sampleValue = boundarySample;
        sampleIndex = step;
        while (outputPosition < mixLimit) {
          outputIndex2 = outputPosition;
          outputPosition++;
          output[outputIndex2] = output[outputIndex2] + (((sampleValue << 8) + (samples[position >> 8] - sampleValue) * (position & 255)) * volume >> 6);
          position = position + sampleIndex;
        }
        stream.position = position;
        return outputPosition;
    }

    final PcmStream nextSubStream() {
        return null;
    }

    final int getSchedulingCost() {
        if (this.targetVolume == 0 &&
          this.rampFramesRemaining == 0) {
          return 0;
        }
        return 1;
    }

    private final static int mixReverseMonoInterpolatedRamped(int sampleValue, int sampleIndex, byte[] samples, int[] output, int position, int outputPosition, int volume, int volumeStep, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream, int step, int boundarySample) {
        int outputIndex1 = 0;
        int outputIndex2 = 0;
        stream.leftVolume = stream.leftVolume - stream.leftVolumeStep * outputPosition;
        stream.rightVolume = stream.rightVolume - stream.rightVolumeStep * outputPosition;
        if (step != 0) {
          mixLimit = outputPosition + (sourceBoundary + 256 - position + step) / step;
        }
        if (step == 0 ||
          outputPosition + (sourceBoundary + 256 - position + step) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        while (outputPosition < mixLimit) {
          sampleIndex = position >> 8;
          sampleValue = samples[sampleIndex - 1];
          outputIndex1 = outputPosition;
          outputPosition++;
          output[outputIndex1] = output[outputIndex1] + (((sampleValue << 8) + (samples[sampleIndex] - sampleValue) * (position & 255)) * volume >> 6);
          volume = volume + volumeStep;
          position = position + step;
        }
        if (step != 0) {
          mixLimit = outputPosition + (sourceBoundary - position + step) / step;
        }
        if (step == 0 ||
          outputPosition + (sourceBoundary - position + step) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        sampleValue = boundarySample;
        sampleIndex = step;
        while (outputPosition < mixLimit) {
          outputIndex2 = outputPosition;
          outputPosition++;
          output[outputIndex2] = output[outputIndex2] + (((sampleValue << 8) + (samples[position >> 8] - sampleValue) * (position & 255)) * volume >> 6);
          volume = volume + volumeStep;
          position = position + sampleIndex;
        }
        stream.leftVolume = stream.leftVolume + stream.leftVolumeStep * outputPosition;
        stream.rightVolume = stream.rightVolume + stream.rightVolumeStep * outputPosition;
        stream.volume = volume;
        stream.position = position;
        return outputPosition;
    }

    private final static int mixForwardStereoInterpolatedConstant(int sampleValue, int sampleIndex, byte[] samples, int[] output, int position, int outputPosition, int leftVolume, int rightVolume, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream, int step, int boundarySample) {
        int outputIndex1 = 0;
        int outputIndex2 = 0;
        int outputIndex3 = 0;
        int outputIndex4 = 0;
        if (step != 0) {
          mixLimit = outputPosition + (sourceBoundary - position + step - 257) / step;
        }
        if (step == 0 ||
          outputPosition + (sourceBoundary - position + step - 257) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        outputPosition = outputPosition << 1;
        mixLimit = mixLimit << 1;
        while (outputPosition < mixLimit) {
          sampleIndex = position >> 8;
          sampleValue = samples[sampleIndex];
          sampleValue = (sampleValue << 8) + (samples[sampleIndex + 1] - sampleValue) * (position & 255);
          outputIndex1 = outputPosition;
          outputPosition++;
          output[outputIndex1] = output[outputIndex1] + (sampleValue * leftVolume >> 6);
          outputIndex2 = outputPosition;
          outputPosition++;
          output[outputIndex2] = output[outputIndex2] + (sampleValue * rightVolume >> 6);
          position = position + step;
        }
        if (step != 0) {
          mixLimit = (outputPosition >> 1) + (sourceBoundary - position + step - 1) / step;
        }
        if (step == 0 ||
          (outputPosition >> 1) + (sourceBoundary - position + step - 1) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        mixLimit = mixLimit << 1;
        sampleIndex = boundarySample;
        while (outputPosition < mixLimit) {
          sampleValue = samples[position >> 8];
          sampleValue = (sampleValue << 8) + (sampleIndex - sampleValue) * (position & 255);
          outputIndex3 = outputPosition;
          outputPosition++;
          output[outputIndex3] = output[outputIndex3] + (sampleValue * leftVolume >> 6);
          outputIndex4 = outputPosition;
          outputPosition++;
          output[outputIndex4] = output[outputIndex4] + (sampleValue * rightVolume >> 6);
          position = position + step;
        }
        stream.position = position;
        return outputPosition >> 1;
    }

    private final static int mixReverseStereoInterpolatedRamped(int sampleValue, int sampleIndex, byte[] samples, int[] output, int position, int outputPosition, int leftVolume, int rightVolume, int leftStep, int rightStep, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream, int step, int boundarySample) {
        int outputIndex1 = 0;
        int outputIndex2 = 0;
        int outputIndex3 = 0;
        int outputIndex4 = 0;
        stream.volume = stream.volume - stream.volumeStep * outputPosition;
        if (step != 0) {
          mixLimit = outputPosition + (sourceBoundary + 256 - position + step) / step;
        }
        if (step == 0 ||
          outputPosition + (sourceBoundary + 256 - position + step) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        outputPosition = outputPosition << 1;
        mixLimit = mixLimit << 1;
        while (outputPosition < mixLimit) {
          sampleIndex = position >> 8;
          sampleValue = samples[sampleIndex - 1];
          sampleValue = (sampleValue << 8) + (samples[sampleIndex] - sampleValue) * (position & 255);
          outputIndex1 = outputPosition;
          outputPosition++;
          output[outputIndex1] = output[outputIndex1] + (sampleValue * leftVolume >> 6);
          leftVolume = leftVolume + leftStep;
          outputIndex2 = outputPosition;
          outputPosition++;
          output[outputIndex2] = output[outputIndex2] + (sampleValue * rightVolume >> 6);
          rightVolume = rightVolume + rightStep;
          position = position + step;
        }
        if (step != 0) {
          mixLimit = (outputPosition >> 1) + (sourceBoundary - position + step) / step;
        }
        if (step == 0 ||
          (outputPosition >> 1) + (sourceBoundary - position + step) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        mixLimit = mixLimit << 1;
        sampleIndex = boundarySample;
        while (outputPosition < mixLimit) {
          sampleValue = (sampleIndex << 8) + (samples[position >> 8] - sampleIndex) * (position & 255);
          outputIndex3 = outputPosition;
          outputPosition++;
          output[outputIndex3] = output[outputIndex3] + (sampleValue * leftVolume >> 6);
          leftVolume = leftVolume + leftStep;
          outputIndex4 = outputPosition;
          outputPosition++;
          output[outputIndex4] = output[outputIndex4] + (sampleValue * rightVolume >> 6);
          rightVolume = rightVolume + rightStep;
          position = position + step;
        }
        outputPosition = outputPosition >> 1;
        stream.volume = stream.volume + stream.volumeStep * outputPosition;
        stream.leftVolume = leftVolume;
        stream.rightVolume = rightVolume;
        stream.position = position;
        return outputPosition;
    }

    private final synchronized void setVolumeAndPan(int volume, int pan) {
        this.targetVolume = volume;
        this.pan = pan;
        this.rampFramesRemaining = 0;
        this.updateGains();
    }

    private final static int mixReverseMonoAlignedConstant(byte[] samples, int[] output, int position, int outputPosition, int volume, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream) {
        int outputIndex1 = 0;
        int sampleIndex1 = 0;
        int outputIndex2 = 0;
        int sampleIndex2 = 0;
        int outputIndex3 = 0;
        int sampleIndex3 = 0;
        int outputIndex4 = 0;
        int sampleIndex4 = 0;
        int outputIndex5 = 0;
        int sampleIndex5 = 0;
        position = position >> 8;
        sourceBoundary = sourceBoundary >> 8;
        volume = volume << 2;
        mixLimit = outputPosition + position - (sourceBoundary - 1);
        if (outputPosition + position - (sourceBoundary - 1) > outputLimit) {
          mixLimit = outputLimit;
        }
        mixLimit -= 3;
        while (outputPosition < mixLimit) {
          outputIndex1 = outputPosition;
          outputPosition++;
          sampleIndex1 = position;
          position--;
          output[outputIndex1] = output[outputIndex1] + samples[sampleIndex1] * volume;
          outputIndex2 = outputPosition;
          outputPosition++;
          sampleIndex2 = position;
          position--;
          output[outputIndex2] = output[outputIndex2] + samples[sampleIndex2] * volume;
          outputIndex3 = outputPosition;
          outputPosition++;
          sampleIndex3 = position;
          position--;
          output[outputIndex3] = output[outputIndex3] + samples[sampleIndex3] * volume;
          outputIndex4 = outputPosition;
          outputPosition++;
          sampleIndex4 = position;
          position--;
          output[outputIndex4] = output[outputIndex4] + samples[sampleIndex4] * volume;
        }
        mixLimit += 3;
        while (outputPosition < mixLimit) {
          outputIndex5 = outputPosition;
          outputPosition++;
          sampleIndex5 = position;
          position--;
          output[outputIndex5] = output[outputIndex5] + samples[sampleIndex5] * volume;
        }
        stream.position = position << 8;
        return outputPosition;
    }

    final synchronized void render(int[] output, int outputOffset, int frameCount) {
        int initialLoopsLeft = 0;
        int reverseLoopsLeft = 0;
        int forwardLoopsLeft = 0;
        int unusedForwardOutputPosition = 0;
        int unusedReverseOutputPosition = 0;
        PcmSample sample;
        int loopStartPosition;
        int loopEndPosition;
        int sampleEndPosition;
        int loopSpan;
        int outputPosition;
        int reverseWrapCount;
        int forwardWrapCount;
        if (this.targetVolume == 0 &&
          this.rampFramesRemaining == 0) {
          this.skip(frameCount);
          return;
        }
        sample = (PcmSample) (this.sound);
        loopStartPosition = this.loopStart << 8;
        loopEndPosition = this.loopEnd << 8;
        sampleEndPosition = sample.samples.length << 8;
        loopSpan = loopEndPosition - loopStartPosition;
        if (loopSpan <= 0) {
          this.remainingLoops = 0;
        }
        outputPosition = outputOffset;
        frameCount = frameCount + outputOffset;
        if (this.position < 0) {
          if (this.step <= 0) {
            this.cancelRamp();
            this.unlink(-119);
            return;
          }
          this.position = 0;
        }
        if (this.position >= sampleEndPosition) {
          if (this.step >= 0) {
            this.cancelRamp();
            this.unlink(33);
            return;
          }
          this.position = sampleEndPosition - 1;
        }
        if (this.remainingLoops < 0) {
          if (!this.pingPongLoop) {
            if (this.step >= 0) {
              while (true) {
                outputPosition = this.mixForward(output, outputPosition, loopEndPosition, frameCount, (int) sample.samples[this.loopStart]);
                if (this.position < loopEndPosition) {
                  return;
                }
                this.position = loopStartPosition + (this.position - loopStartPosition) % loopSpan;
              }
            }
            while (true) {
              outputPosition = this.mixReverse(output, outputPosition, loopStartPosition, frameCount, (int) sample.samples[this.loopEnd - 1]);
              if (this.position >= loopStartPosition) {
                return;
              }
              this.position = loopEndPosition - 1 - (loopEndPosition - 1 - this.position) % loopSpan;
            }
          }
          if (this.step < 0) {
            outputPosition = this.mixReverse(output, outputPosition, loopStartPosition, frameCount, (int) sample.samples[this.loopStart]);
            if (this.position >= loopStartPosition) {
              return;
            }
            this.position = loopStartPosition + loopStartPosition - 1 - this.position;
            this.step = -this.step;
          }
          while (true) {
            outputPosition = this.mixForward(output, outputPosition, loopEndPosition, frameCount, (int) sample.samples[this.loopEnd - 1]);
            if (this.position < loopEndPosition) {
              return;
            }
            this.position = loopEndPosition + loopEndPosition - 1 - this.position;
            this.step = -this.step;
            outputPosition = this.mixReverse(output, outputPosition, loopStartPosition, frameCount, (int) sample.samples[this.loopStart]);
            if (this.position >= loopStartPosition) {
              return;
            }
            this.position = loopStartPosition + loopStartPosition - 1 - this.position;
            this.step = -this.step;
          }
        }
        boolean continueLoopHandling = true;
        if (this.remainingLoops > 0) {
          if (!this.pingPongLoop) {
            if (this.step < 0) {
              while (true) {
                outputPosition = this.mixReverse(output, outputPosition, loopStartPosition, frameCount, (int) sample.samples[this.loopEnd - 1]);
                if (this.position >= loopStartPosition) {
                  return;
                }
                reverseWrapCount = (loopEndPosition - 1 - this.position) / loopSpan;
                if (reverseWrapCount < this.remainingLoops) {
                  this.position = this.position + loopSpan * reverseWrapCount;
                  this.remainingLoops = this.remainingLoops - reverseWrapCount;
                  continue;
                }
                break;
              }
              this.position = this.position + loopSpan * this.remainingLoops;
              this.remainingLoops = 0;
            } else {
              while (true) {
                outputPosition = this.mixForward(output, outputPosition, loopEndPosition, frameCount, (int) sample.samples[this.loopStart]);
                if (this.position < loopEndPosition) {
                  return;
                }
                forwardWrapCount = (this.position - loopStartPosition) / loopSpan;
                if (forwardWrapCount < this.remainingLoops) {
                  this.position = this.position - loopSpan * forwardWrapCount;
                  this.remainingLoops = this.remainingLoops - forwardWrapCount;
                  continue;
                }
                break;
              }
              this.position = this.position - loopSpan * this.remainingLoops;
              this.remainingLoops = 0;
            }
            continueLoopHandling = false;
          }
          else {
            if (this.step < 0) {
              outputPosition = this.mixReverse(output, outputPosition, loopStartPosition, frameCount, (int) sample.samples[this.loopStart]);
              if (this.position >= loopStartPosition) {
                return;
              }
              this.position = loopStartPosition + loopStartPosition - 1 - this.position;
              this.step = -this.step;
              initialLoopsLeft = this.remainingLoops - 1;
              this.remainingLoops = this.remainingLoops - 1;
              continueLoopHandling = (initialLoopsLeft != 0);
            }
            if (continueLoopHandling) {
              do {
                outputPosition = this.mixForward(output, outputPosition, loopEndPosition, frameCount, (int) sample.samples[this.loopEnd - 1]);
                if (this.position < loopEndPosition) {
                  return;
                }
                this.position = loopEndPosition + loopEndPosition - 1 - this.position;
                this.step = -this.step;
                reverseLoopsLeft = this.remainingLoops - 1;
                this.remainingLoops = this.remainingLoops - 1;
                if (reverseLoopsLeft == 0) {
                  break;
                }
                outputPosition = this.mixReverse(output, outputPosition, loopStartPosition, frameCount, (int) sample.samples[this.loopStart]);
                if (this.position >= loopStartPosition) {
                  return;
                }
                this.position = loopStartPosition + loopStartPosition - 1 - this.position;
                this.step = -this.step;
                forwardLoopsLeft = this.remainingLoops - 1;
                this.remainingLoops = this.remainingLoops - 1;
              } while (forwardLoopsLeft != 0);
            }
          }
        }
        if (this.step >= 0) {
          unusedForwardOutputPosition = this.mixForward(output, outputPosition, sampleEndPosition, frameCount, 0);
          if (this.position >= sampleEndPosition) {
            this.position = sampleEndPosition;
            this.cancelRamp();
            this.unlink(-127);
          }
          return;
        }
        unusedReverseOutputPosition = this.mixReverse(output, outputPosition, 0, frameCount, 0);
        if (this.position >= 0) {
          return;
        }
        this.position = -1;
        this.cancelRamp();
        this.unlink(105);
        return;
    }

    private final static int mixReverseStereoAlignedRamped(int sampleValue, byte[] samples, int[] output, int position, int outputPosition, int leftVolume, int rightVolume, int leftStep, int rightStep, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream) {
        int outputIndex1 = 0;
        int outputIndex2 = 0;
        int outputIndex3 = 0;
        int outputIndex4 = 0;
        int outputIndex5 = 0;
        int outputIndex6 = 0;
        int outputIndex7 = 0;
        int outputIndex8 = 0;
        int outputIndex9 = 0;
        int outputIndex10 = 0;
        position = position >> 8;
        sourceBoundary = sourceBoundary >> 8;
        leftVolume = leftVolume << 2;
        rightVolume = rightVolume << 2;
        leftStep = leftStep << 2;
        rightStep = rightStep << 2;
        mixLimit = outputPosition + position - (sourceBoundary - 1);
        if (outputPosition + position - (sourceBoundary - 1) > outputLimit) {
          mixLimit = outputLimit;
        }
        stream.volume = stream.volume + stream.volumeStep * (mixLimit - outputPosition);
        outputPosition = outputPosition << 1;
        mixLimit = mixLimit << 1;
        mixLimit -= 6;
        while (outputPosition < mixLimit) {
          sampleValue = samples[position--];
          outputIndex1 = outputPosition;
          outputPosition++;
          output[outputIndex1] = output[outputIndex1] + sampleValue * leftVolume;
          leftVolume = leftVolume + leftStep;
          outputIndex2 = outputPosition;
          outputPosition++;
          output[outputIndex2] = output[outputIndex2] + sampleValue * rightVolume;
          rightVolume = rightVolume + rightStep;
          sampleValue = samples[position--];
          outputIndex3 = outputPosition;
          outputPosition++;
          output[outputIndex3] = output[outputIndex3] + sampleValue * leftVolume;
          leftVolume = leftVolume + leftStep;
          outputIndex4 = outputPosition;
          outputPosition++;
          output[outputIndex4] = output[outputIndex4] + sampleValue * rightVolume;
          rightVolume = rightVolume + rightStep;
          sampleValue = samples[position--];
          outputIndex5 = outputPosition;
          outputPosition++;
          output[outputIndex5] = output[outputIndex5] + sampleValue * leftVolume;
          leftVolume = leftVolume + leftStep;
          outputIndex6 = outputPosition;
          outputPosition++;
          output[outputIndex6] = output[outputIndex6] + sampleValue * rightVolume;
          rightVolume = rightVolume + rightStep;
          sampleValue = samples[position--];
          outputIndex7 = outputPosition;
          outputPosition++;
          output[outputIndex7] = output[outputIndex7] + sampleValue * leftVolume;
          leftVolume = leftVolume + leftStep;
          outputIndex8 = outputPosition;
          outputPosition++;
          output[outputIndex8] = output[outputIndex8] + sampleValue * rightVolume;
          rightVolume = rightVolume + rightStep;
        }
        mixLimit += 6;
        while (outputPosition < mixLimit) {
          sampleValue = samples[position--];
          outputIndex9 = outputPosition;
          outputPosition++;
          output[outputIndex9] = output[outputIndex9] + sampleValue * leftVolume;
          leftVolume = leftVolume + leftStep;
          outputIndex10 = outputPosition;
          outputPosition++;
          output[outputIndex10] = output[outputIndex10] + sampleValue * rightVolume;
          rightVolume = rightVolume + rightStep;
        }
        stream.leftVolume = leftVolume >> 2;
        stream.rightVolume = rightVolume >> 2;
        stream.position = position << 8;
        return outputPosition >> 1;
    }

    private final boolean finishRamp() {
        int targetVolume;
        int targetLeftVolume;
        int targetRightVolume;
        targetVolume = this.targetVolume;
        if (targetVolume != -2147483648) {
          targetLeftVolume = RawPcmStream.leftGain(targetVolume, this.pan);
          targetRightVolume = RawPcmStream.rightGain(targetVolume, this.pan);
        } else {
          targetRightVolume = 0;
          targetLeftVolume = 0;
          targetVolume = 0;
        }
        if (this.volume == targetVolume &&
          this.leftVolume == targetLeftVolume &&
          this.rightVolume == targetRightVolume) {
          if (this.targetVolume != -2147483648) {
            this.updateGains();
            return false;
          }
          this.targetVolume = 0;
          this.rightVolume = 0;
          this.leftVolume = 0;
          this.volume = 0;
          this.unlink(73);
          return true;
        }
        if (this.volume >= targetVolume) {
          if (this.volume <= targetVolume) {
            this.volumeStep = 0;
          } else {
            this.volumeStep = -1;
            this.rampFramesRemaining = this.volume - targetVolume;
          }
        } else {
          this.volumeStep = 1;
          this.rampFramesRemaining = targetVolume - this.volume;
        }
        if (this.leftVolume >= targetLeftVolume) {
          if (this.leftVolume <= targetLeftVolume) {
            this.leftVolumeStep = 0;
          } else {
            this.leftVolumeStep = -1;
            if (this.rampFramesRemaining == 0 ||
              this.rampFramesRemaining > this.leftVolume - targetLeftVolume) {
              this.rampFramesRemaining = this.leftVolume - targetLeftVolume;
            }
          }
        } else {
          this.leftVolumeStep = 1;
          if (this.rampFramesRemaining == 0 ||
            this.rampFramesRemaining > targetLeftVolume - this.leftVolume) {
            this.rampFramesRemaining = targetLeftVolume - this.leftVolume;
          }
        }
        if (this.rightVolume < targetRightVolume) {
          this.rightVolumeStep = 1;
          if (this.rampFramesRemaining != 0 &&
            this.rampFramesRemaining <= targetRightVolume - this.rightVolume) {
            return false;
          }
          this.rampFramesRemaining = targetRightVolume - this.rightVolume;
          return false;
        }
        if (this.rightVolume <= targetRightVolume) {
          this.rightVolumeStep = 0;
        } else {
          this.rightVolumeStep = -1;
          if (this.rampFramesRemaining == 0 ||
            this.rampFramesRemaining > this.rightVolume - targetRightVolume) {
            this.rampFramesRemaining = this.rightVolume - targetRightVolume;
          }
        }
        return false;
    }

    private final static int mixForwardStereoInterpolatedRamped(int sampleValue, int sampleIndex, byte[] samples, int[] output, int position, int outputPosition, int leftVolume, int rightVolume, int leftStep, int rightStep, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream, int step, int boundarySample) {
        int outputIndex1 = 0;
        int outputIndex2 = 0;
        int outputIndex3 = 0;
        int outputIndex4 = 0;
        stream.volume = stream.volume - stream.volumeStep * outputPosition;
        if (step != 0) {
          mixLimit = outputPosition + (sourceBoundary - position + step - 257) / step;
        }
        if (step == 0 ||
          outputPosition + (sourceBoundary - position + step - 257) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        outputPosition = outputPosition << 1;
        mixLimit = mixLimit << 1;
        while (outputPosition < mixLimit) {
          sampleIndex = position >> 8;
          sampleValue = samples[sampleIndex];
          sampleValue = (sampleValue << 8) + (samples[sampleIndex + 1] - sampleValue) * (position & 255);
          outputIndex1 = outputPosition;
          outputPosition++;
          output[outputIndex1] = output[outputIndex1] + (sampleValue * leftVolume >> 6);
          leftVolume = leftVolume + leftStep;
          outputIndex2 = outputPosition;
          outputPosition++;
          output[outputIndex2] = output[outputIndex2] + (sampleValue * rightVolume >> 6);
          rightVolume = rightVolume + rightStep;
          position = position + step;
        }
        if (step != 0) {
          mixLimit = (outputPosition >> 1) + (sourceBoundary - position + step - 1) / step;
        }
        if (step == 0 ||
          (outputPosition >> 1) + (sourceBoundary - position + step - 1) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        mixLimit = mixLimit << 1;
        sampleIndex = boundarySample;
        while (outputPosition < mixLimit) {
          sampleValue = samples[position >> 8];
          sampleValue = (sampleValue << 8) + (sampleIndex - sampleValue) * (position & 255);
          outputIndex3 = outputPosition;
          outputPosition++;
          output[outputIndex3] = output[outputIndex3] + (sampleValue * leftVolume >> 6);
          leftVolume = leftVolume + leftStep;
          outputIndex4 = outputPosition;
          outputPosition++;
          output[outputIndex4] = output[outputIndex4] + (sampleValue * rightVolume >> 6);
          rightVolume = rightVolume + rightStep;
          position = position + step;
        }
        outputPosition = outputPosition >> 1;
        stream.volume = stream.volume + stream.volumeStep * outputPosition;
        stream.leftVolume = leftVolume;
        stream.rightVolume = rightVolume;
        stream.position = position;
        return outputPosition;
    }

    final synchronized int getTargetVolume() {
        return this.targetVolume == -2147483648 ? 0 : this.targetVolume;
    }

    final synchronized int getPan() {
        return this.pan < 0 ? -1 : this.pan;
    }

    final int getPriority() {
        int priority = this.volume * 3 >> 6;
        priority = (priority ^ priority >> 31) + (priority >>> 31);
        if (this.remainingLoops == 0) {
          priority = priority - priority * this.position / (((PcmSample) (this.sound)).samples.length << 8);
        } else {
          if (this.remainingLoops >= 0) {
            priority = priority - priority * this.loopStart / ((PcmSample) (this.sound)).samples.length;
          }
        }
        return priority > 255 ? 255 : priority;
    }

    final synchronized boolean isRamping() {
        return this.rampFramesRemaining != 0;
    }

    final static RawPcmStream createAtRate(PcmSample sample, int ratePercent, int volume) {
        if (sample.samples == null) {
          return null;
        }
        if (sample.samples.length != 0) {
          return new RawPcmStream(sample, (int)((long)sample.sampleRate * 256L * (long)ratePercent / (long)(100 * PcmPlayer.outputSampleRate)), volume << 6);
        }
        return null;
    }

    final synchronized void setReverse(boolean reverse) {
        this.step = (this.step ^ this.step >> 31) + (this.step >>> 31);
        if (!reverse) {
          return;
        }
        this.step = -this.step;
    }

    private final static int mixReverseStereoInterpolatedConstant(int sampleValue, int sampleIndex, byte[] samples, int[] output, int position, int outputPosition, int leftVolume, int rightVolume, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream, int step, int boundarySample) {
        int outputIndex1 = 0;
        int outputIndex2 = 0;
        int outputIndex3 = 0;
        int outputIndex4 = 0;
        if (step != 0) {
          mixLimit = outputPosition + (sourceBoundary + 256 - position + step) / step;
        }
        if (step == 0 ||
          outputPosition + (sourceBoundary + 256 - position + step) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        outputPosition = outputPosition << 1;
        mixLimit = mixLimit << 1;
        while (outputPosition < mixLimit) {
          sampleIndex = position >> 8;
          sampleValue = samples[sampleIndex - 1];
          sampleValue = (sampleValue << 8) + (samples[sampleIndex] - sampleValue) * (position & 255);
          outputIndex1 = outputPosition;
          outputPosition++;
          output[outputIndex1] = output[outputIndex1] + (sampleValue * leftVolume >> 6);
          outputIndex2 = outputPosition;
          outputPosition++;
          output[outputIndex2] = output[outputIndex2] + (sampleValue * rightVolume >> 6);
          position = position + step;
        }
        if (step != 0) {
          mixLimit = (outputPosition >> 1) + (sourceBoundary - position + step) / step;
        }
        if (step == 0 ||
          (outputPosition >> 1) + (sourceBoundary - position + step) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        mixLimit = mixLimit << 1;
        sampleIndex = boundarySample;
        while (outputPosition < mixLimit) {
          sampleValue = (sampleIndex << 8) + (samples[position >> 8] - sampleIndex) * (position & 255);
          outputIndex3 = outputPosition;
          outputPosition++;
          output[outputIndex3] = output[outputIndex3] + (sampleValue * leftVolume >> 6);
          outputIndex4 = outputPosition;
          outputPosition++;
          output[outputIndex4] = output[outputIndex4] + (sampleValue * rightVolume >> 6);
          position = position + step;
        }
        stream.position = position;
        return outputPosition >> 1;
    }

    private final static int mixForwardMonoInterpolatedConstant(int sampleValue, int sampleIndex, byte[] samples, int[] output, int position, int outputPosition, int volume, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream, int step, int boundarySample) {
        int outputIndex1 = 0;
        int outputIndex2 = 0;
        if (step != 0) {
          mixLimit = outputPosition + (sourceBoundary - position + step - 257) / step;
        }
        if (step == 0 ||
          outputPosition + (sourceBoundary - position + step - 257) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        while (outputPosition < mixLimit) {
          sampleIndex = position >> 8;
          sampleValue = samples[sampleIndex];
          outputIndex1 = outputPosition;
          outputPosition++;
          output[outputIndex1] = output[outputIndex1] + (((sampleValue << 8) + (samples[sampleIndex + 1] - sampleValue) * (position & 255)) * volume >> 6);
          position = position + step;
        }
        if (step != 0) {
          mixLimit = outputPosition + (sourceBoundary - position + step - 1) / step;
        }
        if (step == 0 ||
          outputPosition + (sourceBoundary - position + step - 1) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        sampleIndex = boundarySample;
        while (outputPosition < mixLimit) {
          sampleValue = samples[position >> 8];
          outputIndex2 = outputPosition;
          outputPosition++;
          output[outputIndex2] = output[outputIndex2] + (((sampleValue << 8) + (sampleIndex - sampleValue) * (position & 255)) * volume >> 6);
          position = position + step;
        }
        stream.position = position;
        return outputPosition;
    }

    private final void cancelRamp() {
        if (this.rampFramesRemaining != 0) {
          if (this.targetVolume == -2147483648) {
            this.targetVolume = 0;
          }
          this.rampFramesRemaining = 0;
          this.updateGains();
          return;
        }
    }

    final PcmStream firstSubStream() {
        return null;
    }

    final synchronized void fadeOut(int frameCount) {
        int maximumGain = 0;
        int maximumRightGain;
        if (frameCount == 0) {
          this.setVolume(0);
          this.unlink(61);
          return;
        }
        if (this.leftVolume != 0) {
          maximumGain = -this.volume;
          if (this.volume > maximumGain) {
            maximumGain = this.volume;
          }
          if (-this.leftVolume > maximumGain) {
            maximumGain = -this.leftVolume;
          }
          if (this.leftVolume > maximumGain) {
            maximumGain = this.leftVolume;
          }
          if (-this.rightVolume > maximumGain) {
            maximumGain = -this.rightVolume;
          }
          if (this.rightVolume > maximumGain) {
            maximumGain = this.rightVolume;
          }
          if (frameCount > maximumGain) {
            frameCount = maximumGain;
          }
          this.rampFramesRemaining = frameCount;
          this.targetVolume = -2147483648;
          this.volumeStep = -this.volume / frameCount;
          this.leftVolumeStep = -this.leftVolume / frameCount;
          this.rightVolumeStep = -this.rightVolume / frameCount;
          return;
        }
        if (this.rightVolume != 0) {
          maximumRightGain = -this.volume;
          if (this.volume > maximumRightGain) {
            maximumRightGain = this.volume;
          }
          if (-this.leftVolume > maximumRightGain) {
            maximumRightGain = -this.leftVolume;
          }
          if (this.leftVolume > maximumRightGain) {
            maximumRightGain = this.leftVolume;
          }
          if (-this.rightVolume > maximumRightGain) {
            maximumRightGain = -this.rightVolume;
          }
          if (this.rightVolume > maximumRightGain) {
            maximumRightGain = this.rightVolume;
          }
          if (frameCount > maximumRightGain) {
            frameCount = maximumRightGain;
          }
          this.rampFramesRemaining = frameCount;
          this.targetVolume = -2147483648;
          this.volumeStep = -this.volume / frameCount;
          this.leftVolumeStep = -this.leftVolume / frameCount;
          this.rightVolumeStep = -this.rightVolume / frameCount;
          return;
        }
        this.rampFramesRemaining = 0;
        this.targetVolume = 0;
        this.volume = 0;
        this.unlink(86);
    }

    final static RawPcmStream createAtStep(PcmSample sample, int step, int volume, int pan) {
        if (sample.samples == null) {
          return null;
        }
        if (sample.samples.length != 0) {
          return new RawPcmStream(sample, step, volume, pan);
        }
        return null;
    }

    final synchronized void setLoopCount(int loopCount) {
        this.remainingLoops = loopCount;
    }

    final synchronized void rampVolumeAndPan(int frameCount, int volume, int pan) {
        int maximumGainDelta = 0;
        int maximumRightGainDelta;
        if (frameCount == 0) {
          this.setVolumeAndPan(volume, pan);
          return;
        }
        int targetLeftVolume = RawPcmStream.leftGain(volume, pan);
        int targetRightVolume = RawPcmStream.rightGain(volume, pan);
        if (this.leftVolume != targetLeftVolume) {
          maximumGainDelta = volume - this.volume;
          if (this.volume - volume > maximumGainDelta) {
            maximumGainDelta = this.volume - volume;
          }
          if (targetLeftVolume - this.leftVolume > maximumGainDelta) {
            maximumGainDelta = targetLeftVolume - this.leftVolume;
          }
          if (this.leftVolume - targetLeftVolume > maximumGainDelta) {
            maximumGainDelta = this.leftVolume - targetLeftVolume;
          }
          if (targetRightVolume - this.rightVolume > maximumGainDelta) {
            maximumGainDelta = targetRightVolume - this.rightVolume;
          }
          if (this.rightVolume - targetRightVolume > maximumGainDelta) {
            maximumGainDelta = this.rightVolume - targetRightVolume;
          }
          if (frameCount > maximumGainDelta) {
            frameCount = maximumGainDelta;
          }
          this.rampFramesRemaining = frameCount;
          this.targetVolume = volume;
          this.pan = pan;
          this.volumeStep = (volume - this.volume) / frameCount;
          this.leftVolumeStep = (targetLeftVolume - this.leftVolume) / frameCount;
          this.rightVolumeStep = (targetRightVolume - this.rightVolume) / frameCount;
          return;
        }
        if (this.rightVolume != targetRightVolume) {
          maximumRightGainDelta = volume - this.volume;
          if (this.volume - volume > maximumRightGainDelta) {
            maximumRightGainDelta = this.volume - volume;
          }
          if (targetLeftVolume - this.leftVolume > maximumRightGainDelta) {
            maximumRightGainDelta = targetLeftVolume - this.leftVolume;
          }
          if (this.leftVolume - targetLeftVolume > maximumRightGainDelta) {
            maximumRightGainDelta = this.leftVolume - targetLeftVolume;
          }
          if (targetRightVolume - this.rightVolume > maximumRightGainDelta) {
            maximumRightGainDelta = targetRightVolume - this.rightVolume;
          }
          if (this.rightVolume - targetRightVolume > maximumRightGainDelta) {
            maximumRightGainDelta = this.rightVolume - targetRightVolume;
          }
          if (frameCount > maximumRightGainDelta) {
            frameCount = maximumRightGainDelta;
          }
          this.rampFramesRemaining = frameCount;
          this.targetVolume = volume;
          this.pan = pan;
          this.volumeStep = (volume - this.volume) / frameCount;
          this.leftVolumeStep = (targetLeftVolume - this.leftVolume) / frameCount;
          this.rightVolumeStep = (targetRightVolume - this.rightVolume) / frameCount;
          return;
        }
        this.rampFramesRemaining = 0;
    }

    private final static int mixForwardMonoAlignedConstant(byte[] samples, int[] output, int position, int outputPosition, int volume, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream) {
        int outputIndex1 = 0;
        int sampleIndex1 = 0;
        int outputIndex2 = 0;
        int sampleIndex2 = 0;
        int outputIndex3 = 0;
        int sampleIndex3 = 0;
        int outputIndex4 = 0;
        int sampleIndex4 = 0;
        int outputIndex5 = 0;
        int sampleIndex5 = 0;
        position = position >> 8;
        sourceBoundary = sourceBoundary >> 8;
        volume = volume << 2;
        mixLimit = outputPosition + sourceBoundary - position;
        if (outputPosition + sourceBoundary - position > outputLimit) {
          mixLimit = outputLimit;
        }
        mixLimit -= 3;
        while (outputPosition < mixLimit) {
          outputIndex1 = outputPosition;
          outputPosition++;
          sampleIndex1 = position;
          position++;
          output[outputIndex1] = output[outputIndex1] + samples[sampleIndex1] * volume;
          outputIndex2 = outputPosition;
          outputPosition++;
          sampleIndex2 = position;
          position++;
          output[outputIndex2] = output[outputIndex2] + samples[sampleIndex2] * volume;
          outputIndex3 = outputPosition;
          outputPosition++;
          sampleIndex3 = position;
          position++;
          output[outputIndex3] = output[outputIndex3] + samples[sampleIndex3] * volume;
          outputIndex4 = outputPosition;
          outputPosition++;
          sampleIndex4 = position;
          position++;
          output[outputIndex4] = output[outputIndex4] + samples[sampleIndex4] * volume;
        }
        mixLimit += 3;
        while (outputPosition < mixLimit) {
          outputIndex5 = outputPosition;
          outputPosition++;
          sampleIndex5 = position;
          position++;
          output[outputIndex5] = output[outputIndex5] + samples[sampleIndex5] * volume;
        }
        stream.position = position << 8;
        return outputPosition;
    }

    private final static int rightGain(int volume, int pan) {
        return pan < 0 ? -volume : (int)((double)volume * Math.sqrt((double)pan * 0.0001220703125) + 0.5);
    }

    final synchronized boolean isOutOfBounds() {
        return this.position < 0 || this.position >= ((PcmSample) (this.sound)).samples.length << 8;
    }

    final synchronized void skip(int frameCount) {
        int initialLoopsLeft = 0;
        int reverseLoopsLeft = 0;
        int forwardLoopsLeft = 0;
        PcmSample sample;
        int loopStartPosition;
        int loopEndPosition;
        int sampleEndPosition;
        int loopSpan;
        int wrapCount;
        if (this.rampFramesRemaining > 0) {
          if (frameCount < this.rampFramesRemaining) {
            this.volume = this.volume + this.volumeStep * frameCount;
            this.leftVolume = this.leftVolume + this.leftVolumeStep * frameCount;
            this.rightVolume = this.rightVolume + this.rightVolumeStep * frameCount;
            this.rampFramesRemaining = this.rampFramesRemaining - frameCount;
          } else {
            if (this.targetVolume == -2147483648) {
              this.targetVolume = 0;
              this.rightVolume = 0;
              this.leftVolume = 0;
              this.volume = 0;
              this.unlink(41);
              frameCount = this.rampFramesRemaining;
            }
            this.rampFramesRemaining = 0;
            this.updateGains();
          }
        }
        sample = (PcmSample) (this.sound);
        loopStartPosition = this.loopStart << 8;
        loopEndPosition = this.loopEnd << 8;
        sampleEndPosition = sample.samples.length << 8;
        loopSpan = loopEndPosition - loopStartPosition;
        if (loopSpan <= 0) {
          this.remainingLoops = 0;
        }
        if (this.position < 0) {
          if (this.step <= 0) {
            this.cancelRamp();
            this.unlink(127);
            return;
          }
          this.position = 0;
        }
        if (this.position >= sampleEndPosition) {
          if (this.step >= 0) {
            this.cancelRamp();
            this.unlink(73);
            return;
          }
          this.position = sampleEndPosition - 1;
        }
        this.position = this.position + this.step * frameCount;
        if (this.remainingLoops < 0) {
          if (!this.pingPongLoop) {
            if (this.step >= 0) {
              if (this.position < loopEndPosition) {
                return;
              }
              this.position = loopStartPosition + (this.position - loopStartPosition) % loopSpan;
              return;
            }
            if (this.position >= loopStartPosition) {
              return;
            }
            this.position = loopEndPosition - 1 - (loopEndPosition - 1 - this.position) % loopSpan;
            return;
          }
          if (this.step < 0) {
            if (this.position >= loopStartPosition) {
              return;
            }
            this.position = loopStartPosition + loopStartPosition - 1 - this.position;
            this.step = -this.step;
          }
          while (this.position >= loopEndPosition) {
            this.position = loopEndPosition + loopEndPosition - 1 - this.position;
            this.step = -this.step;
            if (this.position >= loopStartPosition) {
              return;
            }
            this.position = loopStartPosition + loopStartPosition - 1 - this.position;
            this.step = -this.step;
          }
          return;
        }
        boolean continueLoopHandling = true;
        if (this.remainingLoops > 0) {
          if (!this.pingPongLoop) {
            if (this.step >= 0) {
              if (this.position < loopEndPosition) {
                return;
              }
              wrapCount = (this.position - loopStartPosition) / loopSpan;
              if (wrapCount >= this.remainingLoops) {
                this.position = this.position - loopSpan * this.remainingLoops;
                this.remainingLoops = 0;
                continueLoopHandling = false;
              }
              else {
                this.position = this.position - loopSpan * wrapCount;
                this.remainingLoops = this.remainingLoops - wrapCount;
              }
            } else {
              if (this.position >= loopStartPosition) {
                return;
              }
              wrapCount = (loopEndPosition - 1 - this.position) / loopSpan;
              if (wrapCount >= this.remainingLoops) {
                this.position = this.position + loopSpan * this.remainingLoops;
                this.remainingLoops = 0;
                continueLoopHandling = false;
              }
              else {
                this.position = this.position + loopSpan * wrapCount;
                this.remainingLoops = this.remainingLoops - wrapCount;
              }
            }
            if (continueLoopHandling) {
              return;
            }
          }
          if (continueLoopHandling) {
            if (this.step < 0) {
              if (this.position >= loopStartPosition) {
                return;
              }
              this.position = loopStartPosition + loopStartPosition - 1 - this.position;
              this.step = -this.step;
              initialLoopsLeft = this.remainingLoops - 1;
              this.remainingLoops = this.remainingLoops - 1;
              continueLoopHandling = (initialLoopsLeft != 0);
            }
            if (continueLoopHandling) {
              do {
                if (this.position < loopEndPosition) {
                  return;
                }
                this.position = loopEndPosition + loopEndPosition - 1 - this.position;
                this.step = -this.step;
                reverseLoopsLeft = this.remainingLoops - 1;
                this.remainingLoops = this.remainingLoops - 1;
                if (reverseLoopsLeft == 0) {
                  break;
                }
                if (this.position >= loopStartPosition) {
                  return;
                }
                this.position = loopStartPosition + loopStartPosition - 1 - this.position;
                this.step = -this.step;
                forwardLoopsLeft = this.remainingLoops - 1;
                this.remainingLoops = this.remainingLoops - 1;
              } while (forwardLoopsLeft != 0);
            }
          }
        }
        if (this.step >= 0) {
          if (this.position >= sampleEndPosition) {
            this.position = sampleEndPosition;
            this.cancelRamp();
            this.unlink(-117);
          }
          return;
        }
        if (this.position >= 0) {
          return;
        }
        this.position = -1;
        this.cancelRamp();
        this.unlink(81);
    }

    private final static int mixReverseMonoAlignedRamped(byte[] samples, int[] output, int position, int outputPosition, int volume, int volumeStep, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream) {
        int outputIndex1 = 0;
        int sampleIndex1 = 0;
        int outputIndex2 = 0;
        int sampleIndex2 = 0;
        int outputIndex3 = 0;
        int sampleIndex3 = 0;
        int outputIndex4 = 0;
        int sampleIndex4 = 0;
        int outputIndex5 = 0;
        int sampleIndex5 = 0;
        position = position >> 8;
        sourceBoundary = sourceBoundary >> 8;
        volume = volume << 2;
        volumeStep = volumeStep << 2;
        mixLimit = outputPosition + position - (sourceBoundary - 1);
        if (outputPosition + position - (sourceBoundary - 1) > outputLimit) {
          mixLimit = outputLimit;
        }
        stream.leftVolume = stream.leftVolume + stream.leftVolumeStep * (mixLimit - outputPosition);
        stream.rightVolume = stream.rightVolume + stream.rightVolumeStep * (mixLimit - outputPosition);
        mixLimit -= 3;
        while (outputPosition < mixLimit) {
          outputIndex1 = outputPosition;
          outputPosition++;
          sampleIndex1 = position;
          position--;
          output[outputIndex1] = output[outputIndex1] + samples[sampleIndex1] * volume;
          volume = volume + volumeStep;
          outputIndex2 = outputPosition;
          outputPosition++;
          sampleIndex2 = position;
          position--;
          output[outputIndex2] = output[outputIndex2] + samples[sampleIndex2] * volume;
          volume = volume + volumeStep;
          outputIndex3 = outputPosition;
          outputPosition++;
          sampleIndex3 = position;
          position--;
          output[outputIndex3] = output[outputIndex3] + samples[sampleIndex3] * volume;
          volume = volume + volumeStep;
          outputIndex4 = outputPosition;
          outputPosition++;
          sampleIndex4 = position;
          position--;
          output[outputIndex4] = output[outputIndex4] + samples[sampleIndex4] * volume;
          volume = volume + volumeStep;
        }
        mixLimit += 3;
        while (outputPosition < mixLimit) {
          outputIndex5 = outputPosition;
          outputPosition++;
          sampleIndex5 = position;
          position--;
          output[outputIndex5] = output[outputIndex5] + samples[sampleIndex5] * volume;
          volume = volume + volumeStep;
        }
        stream.volume = volume >> 2;
        stream.position = position << 8;
        return outputPosition;
    }

    private final static int mixReverseStereoAlignedConstant(int sampleValue, byte[] samples, int[] output, int position, int outputPosition, int leftVolume, int rightVolume, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream) {
        int outputIndex1 = 0;
        int outputIndex2 = 0;
        int outputIndex3 = 0;
        int outputIndex4 = 0;
        int outputIndex5 = 0;
        int outputIndex6 = 0;
        int outputIndex7 = 0;
        int outputIndex8 = 0;
        int outputIndex9 = 0;
        int outputIndex10 = 0;
        position = position >> 8;
        sourceBoundary = sourceBoundary >> 8;
        leftVolume = leftVolume << 2;
        rightVolume = rightVolume << 2;
        mixLimit = outputPosition + position - (sourceBoundary - 1);
        if (outputPosition + position - (sourceBoundary - 1) > outputLimit) {
          mixLimit = outputLimit;
        }
        outputPosition = outputPosition << 1;
        mixLimit = mixLimit << 1;
        mixLimit -= 6;
        while (outputPosition < mixLimit) {
          sampleValue = samples[position--];
          outputIndex1 = outputPosition;
          outputPosition++;
          output[outputIndex1] = output[outputIndex1] + sampleValue * leftVolume;
          outputIndex2 = outputPosition;
          outputPosition++;
          output[outputIndex2] = output[outputIndex2] + sampleValue * rightVolume;
          sampleValue = samples[position--];
          outputIndex3 = outputPosition;
          outputPosition++;
          output[outputIndex3] = output[outputIndex3] + sampleValue * leftVolume;
          outputIndex4 = outputPosition;
          outputPosition++;
          output[outputIndex4] = output[outputIndex4] + sampleValue * rightVolume;
          sampleValue = samples[position--];
          outputIndex5 = outputPosition;
          outputPosition++;
          output[outputIndex5] = output[outputIndex5] + sampleValue * leftVolume;
          outputIndex6 = outputPosition;
          outputPosition++;
          output[outputIndex6] = output[outputIndex6] + sampleValue * rightVolume;
          sampleValue = samples[position--];
          outputIndex7 = outputPosition;
          outputPosition++;
          output[outputIndex7] = output[outputIndex7] + sampleValue * leftVolume;
          outputIndex8 = outputPosition;
          outputPosition++;
          output[outputIndex8] = output[outputIndex8] + sampleValue * rightVolume;
        }
        mixLimit += 6;
        while (outputPosition < mixLimit) {
          sampleValue = samples[position--];
          outputIndex9 = outputPosition;
          outputPosition++;
          output[outputIndex9] = output[outputIndex9] + sampleValue * leftVolume;
          outputIndex10 = outputPosition;
          outputPosition++;
          output[outputIndex10] = output[outputIndex10] + sampleValue * rightVolume;
        }
        stream.position = position << 8;
        return outputPosition >> 1;
    }

    final synchronized void setPosition(int position) {
        int sampleEndPosition = ((PcmSample) (this.sound)).samples.length << 8;
        if (position < -1) {
          position = -1;
        }
        if (position > sampleEndPosition) {
          position = sampleEndPosition;
        }
        this.position = position;
    }

    private final void updateGains() {
        this.volume = this.targetVolume;
        this.leftVolume = RawPcmStream.leftGain(this.targetVolume, this.pan);
        this.rightVolume = RawPcmStream.rightGain(this.targetVolume, this.pan);
    }

    private final static int leftGain(int volume, int pan) {
        return pan < 0 ? volume : (int)((double)volume * Math.sqrt((double)(16384 - pan) * 0.0001220703125) + 0.5);
    }

    private final int mixReverse(int[] output, int outputPosition, int sourceBoundary, int outputLimit, int boundarySample) {
        int rampOutputLimit;
        do {
          if (this.rampFramesRemaining <= 0) {
            if (this.step == -256 &&
              (this.position & 255) == 0) {
              if (PcmPlayer.stereo) {
                return RawPcmStream.mixReverseStereoAlignedConstant(0, ((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.leftVolume, this.rightVolume, 0, outputLimit, sourceBoundary, this);
              }
              return RawPcmStream.mixReverseMonoAlignedConstant(((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.volume, 0, outputLimit, sourceBoundary, this);
            }
            if (PcmPlayer.stereo) {
              return RawPcmStream.mixReverseStereoInterpolatedConstant(0, 0, ((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.leftVolume, this.rightVolume, 0, outputLimit, sourceBoundary, this, this.step, boundarySample);
            }
            return RawPcmStream.mixReverseMonoInterpolatedConstant(0, 0, ((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.volume, 0, outputLimit, sourceBoundary, this, this.step, boundarySample);
          }
          rampOutputLimit = outputPosition + this.rampFramesRemaining;
          if (rampOutputLimit > outputLimit) {
            rampOutputLimit = outputLimit;
          }
          this.rampFramesRemaining = this.rampFramesRemaining + outputPosition;
          if (this.step == -256 &&
            (this.position & 255) == 0) {
            if (!PcmPlayer.stereo) {
              outputPosition = RawPcmStream.mixReverseMonoAlignedRamped(((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.volume, this.volumeStep, 0, rampOutputLimit, sourceBoundary, this);
            } else {
              outputPosition = RawPcmStream.mixReverseStereoAlignedRamped(0, ((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.leftVolume, this.rightVolume, this.leftVolumeStep, this.rightVolumeStep, 0, rampOutputLimit, sourceBoundary, this);
            }
          } else {
            if (!PcmPlayer.stereo) {
              outputPosition = RawPcmStream.mixReverseMonoInterpolatedRamped(0, 0, ((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.volume, this.volumeStep, 0, rampOutputLimit, sourceBoundary, this, this.step, boundarySample);
            } else {
              outputPosition = RawPcmStream.mixReverseStereoInterpolatedRamped(0, 0, ((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.leftVolume, this.rightVolume, this.leftVolumeStep, this.rightVolumeStep, 0, rampOutputLimit, sourceBoundary, this, this.step, boundarySample);
            }
          }
          this.rampFramesRemaining = this.rampFramesRemaining - outputPosition;
          if (this.rampFramesRemaining != 0) {
            return outputPosition;
          }
        } while (!this.finishRamp());
        return outputLimit;
    }

    private final int mixForward(int[] output, int outputPosition, int sourceBoundary, int outputLimit, int boundarySample) {
        int rampOutputLimit;
        do {
          if (this.rampFramesRemaining <= 0) {
            if (this.step == 256 &&
              (this.position & 255) == 0) {
              if (PcmPlayer.stereo) {
                return RawPcmStream.mixForwardStereoAlignedConstant(0, ((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.leftVolume, this.rightVolume, 0, outputLimit, sourceBoundary, this);
              }
              return RawPcmStream.mixForwardMonoAlignedConstant(((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.volume, 0, outputLimit, sourceBoundary, this);
            }
            if (PcmPlayer.stereo) {
              return RawPcmStream.mixForwardStereoInterpolatedConstant(0, 0, ((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.leftVolume, this.rightVolume, 0, outputLimit, sourceBoundary, this, this.step, boundarySample);
            }
            return RawPcmStream.mixForwardMonoInterpolatedConstant(0, 0, ((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.volume, 0, outputLimit, sourceBoundary, this, this.step, boundarySample);
          }
          rampOutputLimit = outputPosition + this.rampFramesRemaining;
          if (rampOutputLimit > outputLimit) {
            rampOutputLimit = outputLimit;
          }
          this.rampFramesRemaining = this.rampFramesRemaining + outputPosition;
          if (this.step == 256 &&
            (this.position & 255) == 0) {
            if (!PcmPlayer.stereo) {
              outputPosition = RawPcmStream.mixForwardMonoAlignedRamped(((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.volume, this.volumeStep, 0, rampOutputLimit, sourceBoundary, this);
            } else {
              outputPosition = RawPcmStream.mixForwardStereoAlignedRamped(0, ((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.leftVolume, this.rightVolume, this.leftVolumeStep, this.rightVolumeStep, 0, rampOutputLimit, sourceBoundary, this);
            }
          } else {
            if (!PcmPlayer.stereo) {
              outputPosition = RawPcmStream.mixForwardMonoInterpolatedRamped(0, 0, ((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.volume, this.volumeStep, 0, rampOutputLimit, sourceBoundary, this, this.step, boundarySample);
            } else {
              outputPosition = RawPcmStream.mixForwardStereoInterpolatedRamped(0, 0, ((PcmSample) (this.sound)).samples, output, this.position, outputPosition, this.leftVolume, this.rightVolume, this.leftVolumeStep, this.rightVolumeStep, 0, rampOutputLimit, sourceBoundary, this, this.step, boundarySample);
            }
          }
          this.rampFramesRemaining = this.rampFramesRemaining - outputPosition;
          if (this.rampFramesRemaining != 0) {
            return outputPosition;
          }
        } while (!this.finishRamp());
        return outputLimit;
    }

    final synchronized int getStepMagnitude() {
        return this.step < 0 ? -this.step : this.step;
    }

    final synchronized void setVolume(int volume) {
        this.setVolumeAndPan(volume, this.getPan());
    }

    final synchronized void rampVolume(int frameCount, int volume) {
        this.rampVolumeAndPan(frameCount, volume, this.getPan());
    }

    private final static int mixForwardStereoAlignedRamped(int sampleValue, byte[] samples, int[] output, int position, int outputPosition, int leftVolume, int rightVolume, int leftStep, int rightStep, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream) {
        int outputIndex1 = 0;
        int outputIndex2 = 0;
        int outputIndex3 = 0;
        int outputIndex4 = 0;
        int outputIndex5 = 0;
        int outputIndex6 = 0;
        int outputIndex7 = 0;
        int outputIndex8 = 0;
        int outputIndex9 = 0;
        int outputIndex10 = 0;
        position = position >> 8;
        sourceBoundary = sourceBoundary >> 8;
        leftVolume = leftVolume << 2;
        rightVolume = rightVolume << 2;
        leftStep = leftStep << 2;
        rightStep = rightStep << 2;
        mixLimit = outputPosition + sourceBoundary - position;
        if (outputPosition + sourceBoundary - position > outputLimit) {
          mixLimit = outputLimit;
        }
        stream.volume = stream.volume + stream.volumeStep * (mixLimit - outputPosition);
        outputPosition = outputPosition << 1;
        mixLimit = mixLimit << 1;
        mixLimit -= 6;
        while (outputPosition < mixLimit) {
          sampleValue = samples[position++];
          outputIndex1 = outputPosition;
          outputPosition++;
          output[outputIndex1] = output[outputIndex1] + sampleValue * leftVolume;
          leftVolume = leftVolume + leftStep;
          outputIndex2 = outputPosition;
          outputPosition++;
          output[outputIndex2] = output[outputIndex2] + sampleValue * rightVolume;
          rightVolume = rightVolume + rightStep;
          sampleValue = samples[position++];
          outputIndex3 = outputPosition;
          outputPosition++;
          output[outputIndex3] = output[outputIndex3] + sampleValue * leftVolume;
          leftVolume = leftVolume + leftStep;
          outputIndex4 = outputPosition;
          outputPosition++;
          output[outputIndex4] = output[outputIndex4] + sampleValue * rightVolume;
          rightVolume = rightVolume + rightStep;
          sampleValue = samples[position++];
          outputIndex5 = outputPosition;
          outputPosition++;
          output[outputIndex5] = output[outputIndex5] + sampleValue * leftVolume;
          leftVolume = leftVolume + leftStep;
          outputIndex6 = outputPosition;
          outputPosition++;
          output[outputIndex6] = output[outputIndex6] + sampleValue * rightVolume;
          rightVolume = rightVolume + rightStep;
          sampleValue = samples[position++];
          outputIndex7 = outputPosition;
          outputPosition++;
          output[outputIndex7] = output[outputIndex7] + sampleValue * leftVolume;
          leftVolume = leftVolume + leftStep;
          outputIndex8 = outputPosition;
          outputPosition++;
          output[outputIndex8] = output[outputIndex8] + sampleValue * rightVolume;
          rightVolume = rightVolume + rightStep;
        }
        mixLimit += 6;
        while (outputPosition < mixLimit) {
          sampleValue = samples[position++];
          outputIndex9 = outputPosition;
          outputPosition++;
          output[outputIndex9] = output[outputIndex9] + sampleValue * leftVolume;
          leftVolume = leftVolume + leftStep;
          outputIndex10 = outputPosition;
          outputPosition++;
          output[outputIndex10] = output[outputIndex10] + sampleValue * rightVolume;
          rightVolume = rightVolume + rightStep;
        }
        stream.leftVolume = leftVolume >> 2;
        stream.rightVolume = rightVolume >> 2;
        stream.position = position << 8;
        return outputPosition >> 1;
    }

    private final static int mixForwardMonoInterpolatedRamped(int sampleValue, int sampleIndex, byte[] samples, int[] output, int position, int outputPosition, int volume, int volumeStep, int mixLimit, int outputLimit, int sourceBoundary, RawPcmStream stream, int step, int boundarySample) {
        int outputIndex1 = 0;
        int outputIndex2 = 0;
        stream.leftVolume = stream.leftVolume - stream.leftVolumeStep * outputPosition;
        stream.rightVolume = stream.rightVolume - stream.rightVolumeStep * outputPosition;
        if (step != 0) {
          mixLimit = outputPosition + (sourceBoundary - position + step - 257) / step;
        }
        if (step == 0 ||
          outputPosition + (sourceBoundary - position + step - 257) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        while (outputPosition < mixLimit) {
          sampleIndex = position >> 8;
          sampleValue = samples[sampleIndex];
          outputIndex1 = outputPosition;
          outputPosition++;
          output[outputIndex1] = output[outputIndex1] + (((sampleValue << 8) + (samples[sampleIndex + 1] - sampleValue) * (position & 255)) * volume >> 6);
          volume = volume + volumeStep;
          position = position + step;
        }
        if (step != 0) {
          mixLimit = outputPosition + (sourceBoundary - position + step - 1) / step;
        }
        if (step == 0 ||
          outputPosition + (sourceBoundary - position + step - 1) / step > outputLimit) {
          mixLimit = outputLimit;
        }
        sampleIndex = boundarySample;
        while (outputPosition < mixLimit) {
          sampleValue = samples[position >> 8];
          outputIndex2 = outputPosition;
          outputPosition++;
          output[outputIndex2] = output[outputIndex2] + (((sampleValue << 8) + (sampleIndex - sampleValue) * (position & 255)) * volume >> 6);
          volume = volume + volumeStep;
          position = position + step;
        }
        stream.leftVolume = stream.leftVolume + stream.leftVolumeStep * outputPosition;
        stream.rightVolume = stream.rightVolume + stream.rightVolumeStep * outputPosition;
        stream.volume = volume;
        stream.position = position;
        return outputPosition;
    }

    private RawPcmStream(PcmSample sample, int step, int volume) {
        this.sound = (SoundData) ((Object) sample);
        this.loopStart = sample.loopStart;
        this.loopEnd = sample.loopEnd;
        this.pingPongLoop = sample.loopModeFlag;
        this.step = step;
        this.targetVolume = volume;
        this.pan = 8192;
        this.position = 0;
        this.updateGains();
    }

    private RawPcmStream(PcmSample sample, int step, int volume, int pan) {
        this.sound = (SoundData) ((Object) sample);
        this.loopStart = sample.loopStart;
        this.loopEnd = sample.loopEnd;
        this.pingPongLoop = sample.loopModeFlag;
        this.step = step;
        this.targetVolume = volume;
        this.pan = pan;
        this.position = 0;
        this.updateGains();
    }
}
