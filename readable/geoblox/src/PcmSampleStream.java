/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSampleStream extends PcmStream {
    private int loopsRemaining;
    private int rampFramesRemaining;
    private int volumeStepPerFrame;
    private int currentLeftVolume;
    private int currentRightVolume;
    private int targetPan;
    private int targetVolume;
    private int loopStart;
    private int sampleStepFixed;
    private int loopEnd;
    private boolean pingPongLoop;
    private int currentVolume;
    private int samplePositionFixed;
    private int rightVolumeStepPerFrame;
    private int leftVolumeStepPerFrame;

    private final static int mixReverseStereoInterpolated(int sampleValueOrBoundarySample, int sourceIndexOrBoundarySample, byte[] samples, int[] destination, int samplePositionFixed, int destinationFrameOrSampleIndex, int leftVolume, int rightVolume, int destinationLimit, int destinationEnd, int sampleBoundaryFixed, PcmSampleStream stream, int sampleStepFixed, int boundarySample) {
        int interiorLeftDestinationIndex = 0;
        int interiorRightDestinationIndex = 0;
        int boundaryLeftDestinationIndex = 0;
        int boundaryRightDestinationIndex = 0;
        if (sampleStepFixed != 0) {
          destinationLimit = destinationFrameOrSampleIndex + (sampleBoundaryFixed + 256 - samplePositionFixed + sampleStepFixed) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || destinationFrameOrSampleIndex + (sampleBoundaryFixed + 256 - samplePositionFixed + sampleStepFixed) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        destinationFrameOrSampleIndex = destinationFrameOrSampleIndex << 1;
        destinationLimit = destinationLimit << 1;
        while (destinationFrameOrSampleIndex < destinationLimit) {
          sourceIndexOrBoundarySample = samplePositionFixed >> 8;
          sampleValueOrBoundarySample = samples[sourceIndexOrBoundarySample - 1];
          sampleValueOrBoundarySample = (sampleValueOrBoundarySample << 8) + (samples[sourceIndexOrBoundarySample] - sampleValueOrBoundarySample) * (samplePositionFixed & 255);
          interiorLeftDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[interiorLeftDestinationIndex] = destination[interiorLeftDestinationIndex] + (sampleValueOrBoundarySample * leftVolume >> 6);
          interiorRightDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[interiorRightDestinationIndex] = destination[interiorRightDestinationIndex] + (sampleValueOrBoundarySample * rightVolume >> 6);
          samplePositionFixed = samplePositionFixed + sampleStepFixed;
        }
        if (sampleStepFixed != 0) {
          destinationLimit = (destinationFrameOrSampleIndex >> 1) + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || (destinationFrameOrSampleIndex >> 1) + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        destinationLimit = destinationLimit << 1;
        sourceIndexOrBoundarySample = boundarySample;
        while (destinationFrameOrSampleIndex < destinationLimit) {
          sampleValueOrBoundarySample = (sourceIndexOrBoundarySample << 8) + (samples[samplePositionFixed >> 8] - sourceIndexOrBoundarySample) * (samplePositionFixed & 255);
          boundaryLeftDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[boundaryLeftDestinationIndex] = destination[boundaryLeftDestinationIndex] + (sampleValueOrBoundarySample * leftVolume >> 6);
          boundaryRightDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[boundaryRightDestinationIndex] = destination[boundaryRightDestinationIndex] + (sampleValueOrBoundarySample * rightVolume >> 6);
          samplePositionFixed = samplePositionFixed + sampleStepFixed;
        }
        stream.samplePositionFixed = samplePositionFixed;
        return destinationFrameOrSampleIndex >> 1;
    }

    final synchronized void setVolume(int volume) {
        this.setVolumeAndPan(volume, this.getPan());
    }

    final int getSchedulingCost() {
        if (this.targetVolume == 0 && this.rampFramesRemaining == 0) {
            return 0;
        }
        return 1;
    }

    private final boolean finishOrContinueVolumeRamp() {
        int targetVolume;
        int targetLeftVolume;
        int targetRightVolume;
        targetVolume = this.targetVolume;
        if (targetVolume != -2147483648) {
          targetLeftVolume = PcmSampleStream.computeLeftVolume(targetVolume, this.targetPan);
          targetRightVolume = PcmSampleStream.computeRightVolume(targetVolume, this.targetPan);
        } else {
          targetRightVolume = 0;
          targetLeftVolume = 0;
          targetVolume = 0;
        }
        if (this.currentVolume == targetVolume &&
            this.currentLeftVolume == targetLeftVolume &&
            this.currentRightVolume == targetRightVolume) {
          if (this.targetVolume != -2147483648) {
            this.refreshCurrentVolumes();
            return false;
          }
          this.targetVolume = 0;
          this.currentRightVolume = 0;
          this.currentLeftVolume = 0;
          this.currentVolume = 0;
          this.unlinkNode(false);
          return true;
        }
        if (this.currentVolume >= targetVolume) {
          if (this.currentVolume <= targetVolume) {
            this.volumeStepPerFrame = 0;
          } else {
            this.volumeStepPerFrame = -1;
            this.rampFramesRemaining = this.currentVolume - targetVolume;
          }
        } else {
          this.volumeStepPerFrame = 1;
          this.rampFramesRemaining = targetVolume - this.currentVolume;
        }
        if (this.currentLeftVolume >= targetLeftVolume) {
          if (this.currentLeftVolume <= targetLeftVolume) {
            this.leftVolumeStepPerFrame = 0;
          } else {
            this.leftVolumeStepPerFrame = -1;
            if (this.rampFramesRemaining == 0 ||
                this.rampFramesRemaining > this.currentLeftVolume - targetLeftVolume) {
              this.rampFramesRemaining = this.currentLeftVolume - targetLeftVolume;
            }
          }
        } else {
          this.leftVolumeStepPerFrame = 1;
          if (this.rampFramesRemaining == 0 ||
              this.rampFramesRemaining > targetLeftVolume - this.currentLeftVolume) {
            this.rampFramesRemaining = targetLeftVolume - this.currentLeftVolume;
          }
        }
        if (this.currentRightVolume < targetRightVolume) {
          this.rightVolumeStepPerFrame = 1;
          if (this.rampFramesRemaining != 0 &&
              this.rampFramesRemaining <= targetRightVolume - this.currentRightVolume) {
            return false;
          }
          this.rampFramesRemaining = targetRightVolume - this.currentRightVolume;
          return false;
        }
        if (this.currentRightVolume <= targetRightVolume) {
          this.rightVolumeStepPerFrame = 0;
        } else {
          this.rightVolumeStepPerFrame = -1;
          if (this.rampFramesRemaining == 0 ||
              this.rampFramesRemaining > this.currentRightVolume - targetRightVolume) {
            this.rampFramesRemaining = this.currentRightVolume - targetRightVolume;
          }
        }
        return false;
    }

    private final int mixReverseToBoundary(int[] destination, int destinationOffset, int sampleBoundaryFixed, int destinationEnd, int boundarySample) {
        int rampDestinationEnd;
        do {
          if (this.rampFramesRemaining <= 0) {
            if (this.sampleStepFixed == -256 &&
                (this.samplePositionFixed & 255) == 0) {
              if (AudioOutput.stereoEnabled) {
                return PcmSampleStream.mixReverseStereoAligned(0, ((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentLeftVolume, this.currentRightVolume, 0, destinationEnd, sampleBoundaryFixed, this);
              }
              return PcmSampleStream.mixReverseMonoAligned(((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentVolume, 0, destinationEnd, sampleBoundaryFixed, this);
            }
            if (AudioOutput.stereoEnabled) {
              return PcmSampleStream.mixReverseStereoInterpolated(0, 0, ((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentLeftVolume, this.currentRightVolume, 0, destinationEnd, sampleBoundaryFixed, this, this.sampleStepFixed, boundarySample);
            }
            return PcmSampleStream.mixReverseMonoInterpolated(0, 0, ((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentVolume, 0, destinationEnd, sampleBoundaryFixed, this, this.sampleStepFixed, boundarySample);
          }
          rampDestinationEnd = destinationOffset + this.rampFramesRemaining;
          if (rampDestinationEnd > destinationEnd) {
            rampDestinationEnd = destinationEnd;
          }
          this.rampFramesRemaining = this.rampFramesRemaining + destinationOffset;
          if (this.sampleStepFixed == -256 &&
              (this.samplePositionFixed & 255) == 0) {
            if (!AudioOutput.stereoEnabled) {
              destinationOffset = PcmSampleStream.mixReverseMonoAlignedRamp(((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentVolume, this.volumeStepPerFrame, 0, rampDestinationEnd, sampleBoundaryFixed, this);
            } else {
              destinationOffset = PcmSampleStream.mixReverseStereoAlignedRamp(0, ((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentLeftVolume, this.currentRightVolume, this.leftVolumeStepPerFrame, this.rightVolumeStepPerFrame, 0, rampDestinationEnd, sampleBoundaryFixed, this);
            }
          } else {
            if (!AudioOutput.stereoEnabled) {
              destinationOffset = PcmSampleStream.mixReverseMonoInterpolatedRamp(0, 0, ((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentVolume, this.volumeStepPerFrame, 0, rampDestinationEnd, sampleBoundaryFixed, this, this.sampleStepFixed, boundarySample);
            } else {
              destinationOffset = PcmSampleStream.mixReverseStereoInterpolatedRamp(0, 0, ((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentLeftVolume, this.currentRightVolume, this.leftVolumeStepPerFrame, this.rightVolumeStepPerFrame, 0, rampDestinationEnd, sampleBoundaryFixed, this, this.sampleStepFixed, boundarySample);
            }
          }
          this.rampFramesRemaining = this.rampFramesRemaining - destinationOffset;
          if (this.rampFramesRemaining != 0) {
            return destinationOffset;
          }
        } while (!this.finishOrContinueVolumeRamp());
        return destinationEnd;
    }

    final PcmStream firstChildStream() {
        return null;
    }

    final synchronized int getTargetVolume() {
        return this.targetVolume == -2147483648 ? 0 : this.targetVolume;
    }

    private final int mixForwardToBoundary(int[] destination, int destinationOffset, int sampleBoundaryFixed, int destinationEnd, int boundarySample) {
        int rampDestinationEnd;
        do {
          if (this.rampFramesRemaining <= 0) {
            if (this.sampleStepFixed == 256 &&
                (this.samplePositionFixed & 255) == 0) {
              if (AudioOutput.stereoEnabled) {
                return PcmSampleStream.mixForwardStereoAligned(0, ((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentLeftVolume, this.currentRightVolume, 0, destinationEnd, sampleBoundaryFixed, this);
              }
              return PcmSampleStream.mixForwardMonoAligned(((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentVolume, 0, destinationEnd, sampleBoundaryFixed, this);
            }
            if (AudioOutput.stereoEnabled) {
              return PcmSampleStream.mixForwardStereoInterpolated(0, 0, ((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentLeftVolume, this.currentRightVolume, 0, destinationEnd, sampleBoundaryFixed, this, this.sampleStepFixed, boundarySample);
            }
            return PcmSampleStream.mixForwardMonoInterpolated(0, 0, ((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentVolume, 0, destinationEnd, sampleBoundaryFixed, this, this.sampleStepFixed, boundarySample);
          }
          rampDestinationEnd = destinationOffset + this.rampFramesRemaining;
          if (rampDestinationEnd > destinationEnd) {
            rampDestinationEnd = destinationEnd;
          }
          this.rampFramesRemaining = this.rampFramesRemaining + destinationOffset;
          if (this.sampleStepFixed == 256 &&
              (this.samplePositionFixed & 255) == 0) {
            if (!AudioOutput.stereoEnabled) {
              destinationOffset = PcmSampleStream.mixForwardMonoAlignedRamp(((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentVolume, this.volumeStepPerFrame, 0, rampDestinationEnd, sampleBoundaryFixed, this);
            } else {
              destinationOffset = PcmSampleStream.mixForwardStereoAlignedRamp(0, ((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentLeftVolume, this.currentRightVolume, this.leftVolumeStepPerFrame, this.rightVolumeStepPerFrame, 0, rampDestinationEnd, sampleBoundaryFixed, this);
            }
          } else {
            if (!AudioOutput.stereoEnabled) {
              destinationOffset = PcmSampleStream.mixForwardMonoInterpolatedRamp(0, 0, ((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentVolume, this.volumeStepPerFrame, 0, rampDestinationEnd, sampleBoundaryFixed, this, this.sampleStepFixed, boundarySample);
            } else {
              destinationOffset = PcmSampleStream.mixForwardStereoInterpolatedRamp(0, 0, ((PcmSample) ((Object) this.sample)).samples, destination, this.samplePositionFixed, destinationOffset, this.currentLeftVolume, this.currentRightVolume, this.leftVolumeStepPerFrame, this.rightVolumeStepPerFrame, 0, rampDestinationEnd, sampleBoundaryFixed, this, this.sampleStepFixed, boundarySample);
            }
          }
          this.rampFramesRemaining = this.rampFramesRemaining - destinationOffset;
          if (this.rampFramesRemaining != 0) {
            return destinationOffset;
          }
        } while (!this.finishOrContinueVolumeRamp());
        return destinationEnd;
    }

    final int getSchedulingPriority() {
        int priority = this.currentVolume * 3 >> 6;
        priority = (priority ^ priority >> 31) + (priority >>> 31);
        if (this.loopsRemaining == 0) {
            priority = priority - priority * this.samplePositionFixed / (((PcmSample) ((Object) this.sample)).samples.length << 8);
        } else {
            if (this.loopsRemaining >= 0) {
                priority = priority - priority * this.loopStart / ((PcmSample) ((Object) this.sample)).samples.length;
            }
        }
        return priority > 255 ? 255 : priority;
    }

    final synchronized void rampVolume(int rampFrames, int targetVolume) {
        this.rampVolumeAndPan(rampFrames, targetVolume, this.getPan());
    }

    private final static int mixForwardMonoAlignedRamp(byte[] samples, int[] destination, int samplePositionOrIndex, int destinationIndex, int volume, int volumeStep, int destinationLimit, int destinationEnd, int sampleBoundaryOrIndex, PcmSampleStream stream) {
        int firstDestinationIndex = 0;
        int firstSourceIndex = 0;
        int secondDestinationIndex = 0;
        int secondSourceIndex = 0;
        int thirdDestinationIndex = 0;
        int thirdSourceIndex = 0;
        int fourthDestinationIndex = 0;
        int fourthSourceIndex = 0;
        int tailDestinationIndex = 0;
        int tailSourceIndex = 0;
        samplePositionOrIndex = samplePositionOrIndex >> 8;
        sampleBoundaryOrIndex = sampleBoundaryOrIndex >> 8;
        volume = volume << 2;
        volumeStep = volumeStep << 2;
        destinationLimit = destinationIndex + sampleBoundaryOrIndex - samplePositionOrIndex;
        if (destinationIndex + sampleBoundaryOrIndex - samplePositionOrIndex > destinationEnd) {
            destinationLimit = destinationEnd;
        }
        stream.currentLeftVolume = stream.currentLeftVolume + stream.leftVolumeStepPerFrame * (destinationLimit - destinationIndex);
        stream.currentRightVolume = stream.currentRightVolume + stream.rightVolumeStepPerFrame * (destinationLimit - destinationIndex);
        destinationLimit -= 3;
        while (destinationIndex < destinationLimit) {
            firstDestinationIndex = destinationIndex;
            destinationIndex++;
            firstSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex++;
            destination[firstDestinationIndex] = destination[firstDestinationIndex] + samples[firstSourceIndex] * volume;
            volume = volume + volumeStep;
            secondDestinationIndex = destinationIndex;
            destinationIndex++;
            secondSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex++;
            destination[secondDestinationIndex] = destination[secondDestinationIndex] + samples[secondSourceIndex] * volume;
            volume = volume + volumeStep;
            thirdDestinationIndex = destinationIndex;
            destinationIndex++;
            thirdSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex++;
            destination[thirdDestinationIndex] = destination[thirdDestinationIndex] + samples[thirdSourceIndex] * volume;
            volume = volume + volumeStep;
            fourthDestinationIndex = destinationIndex;
            destinationIndex++;
            fourthSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex++;
            destination[fourthDestinationIndex] = destination[fourthDestinationIndex] + samples[fourthSourceIndex] * volume;
            volume = volume + volumeStep;
        }
        destinationLimit += 3;
        while (destinationIndex < destinationLimit) {
            tailDestinationIndex = destinationIndex;
            destinationIndex++;
            tailSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex++;
            destination[tailDestinationIndex] = destination[tailDestinationIndex] + samples[tailSourceIndex] * volume;
            volume = volume + volumeStep;
        }
        stream.currentVolume = volume >> 2;
        stream.samplePositionFixed = samplePositionOrIndex << 8;
        return destinationIndex;
    }

    private final static int computeLeftVolume(int volume, int pan) {
        return pan < 0 ? volume : (int)((double)volume * Math.sqrt((double)(16384 - pan) * 0.0001220703125) + 0.5);
    }

    private final static int mixForwardStereoInterpolated(int sampleValueOrBoundarySample, int sourceIndexOrBoundarySample, byte[] samples, int[] destination, int samplePositionFixed, int destinationFrameOrSampleIndex, int leftVolume, int rightVolume, int destinationLimit, int destinationEnd, int sampleBoundaryFixed, PcmSampleStream stream, int sampleStepFixed, int boundarySample) {
        int interiorLeftDestinationIndex = 0;
        int interiorRightDestinationIndex = 0;
        int boundaryLeftDestinationIndex = 0;
        int boundaryRightDestinationIndex = 0;
        if (sampleStepFixed != 0) {
          destinationLimit = destinationFrameOrSampleIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 257) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || destinationFrameOrSampleIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 257) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        destinationFrameOrSampleIndex = destinationFrameOrSampleIndex << 1;
        destinationLimit = destinationLimit << 1;
        while (destinationFrameOrSampleIndex < destinationLimit) {
          sourceIndexOrBoundarySample = samplePositionFixed >> 8;
          sampleValueOrBoundarySample = samples[sourceIndexOrBoundarySample];
          sampleValueOrBoundarySample = (sampleValueOrBoundarySample << 8) + (samples[sourceIndexOrBoundarySample + 1] - sampleValueOrBoundarySample) * (samplePositionFixed & 255);
          interiorLeftDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[interiorLeftDestinationIndex] = destination[interiorLeftDestinationIndex] + (sampleValueOrBoundarySample * leftVolume >> 6);
          interiorRightDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[interiorRightDestinationIndex] = destination[interiorRightDestinationIndex] + (sampleValueOrBoundarySample * rightVolume >> 6);
          samplePositionFixed = samplePositionFixed + sampleStepFixed;
        }
        if (sampleStepFixed != 0) {
          destinationLimit = (destinationFrameOrSampleIndex >> 1) + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 1) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || (destinationFrameOrSampleIndex >> 1) + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 1) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        destinationLimit = destinationLimit << 1;
        sourceIndexOrBoundarySample = boundarySample;
        while (destinationFrameOrSampleIndex < destinationLimit) {
          sampleValueOrBoundarySample = samples[samplePositionFixed >> 8];
          sampleValueOrBoundarySample = (sampleValueOrBoundarySample << 8) + (sourceIndexOrBoundarySample - sampleValueOrBoundarySample) * (samplePositionFixed & 255);
          boundaryLeftDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[boundaryLeftDestinationIndex] = destination[boundaryLeftDestinationIndex] + (sampleValueOrBoundarySample * leftVolume >> 6);
          boundaryRightDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[boundaryRightDestinationIndex] = destination[boundaryRightDestinationIndex] + (sampleValueOrBoundarySample * rightVolume >> 6);
          samplePositionFixed = samplePositionFixed + sampleStepFixed;
        }
        stream.samplePositionFixed = samplePositionFixed;
        return destinationFrameOrSampleIndex >> 1;
    }

    private final static int mixForwardMonoAligned(byte[] samples, int[] destination, int samplePositionOrIndex, int destinationIndex, int volume, int destinationLimit, int destinationEnd, int sampleBoundaryOrIndex, PcmSampleStream stream) {
        int firstDestinationIndex = 0;
        int firstSourceIndex = 0;
        int secondDestinationIndex = 0;
        int secondSourceIndex = 0;
        int thirdDestinationIndex = 0;
        int thirdSourceIndex = 0;
        int fourthDestinationIndex = 0;
        int fourthSourceIndex = 0;
        int tailDestinationIndex = 0;
        int tailSourceIndex = 0;
        samplePositionOrIndex = samplePositionOrIndex >> 8;
        sampleBoundaryOrIndex = sampleBoundaryOrIndex >> 8;
        volume = volume << 2;
        destinationLimit = destinationIndex + sampleBoundaryOrIndex - samplePositionOrIndex;
        if (destinationIndex + sampleBoundaryOrIndex - samplePositionOrIndex > destinationEnd) {
            destinationLimit = destinationEnd;
        }
        destinationLimit -= 3;
        while (destinationIndex < destinationLimit) {
            firstDestinationIndex = destinationIndex;
            destinationIndex++;
            firstSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex++;
            destination[firstDestinationIndex] = destination[firstDestinationIndex] + samples[firstSourceIndex] * volume;
            secondDestinationIndex = destinationIndex;
            destinationIndex++;
            secondSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex++;
            destination[secondDestinationIndex] = destination[secondDestinationIndex] + samples[secondSourceIndex] * volume;
            thirdDestinationIndex = destinationIndex;
            destinationIndex++;
            thirdSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex++;
            destination[thirdDestinationIndex] = destination[thirdDestinationIndex] + samples[thirdSourceIndex] * volume;
            fourthDestinationIndex = destinationIndex;
            destinationIndex++;
            fourthSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex++;
            destination[fourthDestinationIndex] = destination[fourthDestinationIndex] + samples[fourthSourceIndex] * volume;
        }
        destinationLimit += 3;
        while (destinationIndex < destinationLimit) {
            tailDestinationIndex = destinationIndex;
            destinationIndex++;
            tailSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex++;
            destination[tailDestinationIndex] = destination[tailDestinationIndex] + samples[tailSourceIndex] * volume;
        }
        stream.samplePositionFixed = samplePositionOrIndex << 8;
        return destinationIndex;
    }

    private final static int mixReverseStereoAlignedRamp(int sampleValue, byte[] samples, int[] destination, int samplePositionOrIndex, int destinationFrameOrSampleIndex, int leftVolume, int rightVolume, int leftVolumeStep, int rightVolumeStep, int destinationLimit, int destinationEnd, int sampleBoundaryOrIndex, PcmSampleStream stream) {
        int firstLeftDestinationIndex = 0;
        int firstRightDestinationIndex = 0;
        int secondLeftDestinationIndex = 0;
        int secondRightDestinationIndex = 0;
        int thirdLeftDestinationIndex = 0;
        int thirdRightDestinationIndex = 0;
        int fourthLeftDestinationIndex = 0;
        int fourthRightDestinationIndex = 0;
        int tailLeftDestinationIndex = 0;
        int tailRightDestinationIndex = 0;
        samplePositionOrIndex = samplePositionOrIndex >> 8;
        sampleBoundaryOrIndex = sampleBoundaryOrIndex >> 8;
        leftVolume = leftVolume << 2;
        rightVolume = rightVolume << 2;
        leftVolumeStep = leftVolumeStep << 2;
        rightVolumeStep = rightVolumeStep << 2;
        destinationLimit = destinationFrameOrSampleIndex + samplePositionOrIndex - (sampleBoundaryOrIndex - 1);
        if (destinationFrameOrSampleIndex + samplePositionOrIndex - (sampleBoundaryOrIndex - 1) > destinationEnd) {
            destinationLimit = destinationEnd;
        }
        stream.currentVolume = stream.currentVolume + stream.volumeStepPerFrame * (destinationLimit - destinationFrameOrSampleIndex);
        destinationFrameOrSampleIndex = destinationFrameOrSampleIndex << 1;
        destinationLimit = destinationLimit << 1;
        destinationLimit -= 6;
        while (destinationFrameOrSampleIndex < destinationLimit) {
            sampleValue = samples[samplePositionOrIndex--];
            firstLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[firstLeftDestinationIndex] = destination[firstLeftDestinationIndex] + sampleValue * leftVolume;
            leftVolume = leftVolume + leftVolumeStep;
            firstRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[firstRightDestinationIndex] = destination[firstRightDestinationIndex] + sampleValue * rightVolume;
            rightVolume = rightVolume + rightVolumeStep;
            sampleValue = samples[samplePositionOrIndex--];
            secondLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[secondLeftDestinationIndex] = destination[secondLeftDestinationIndex] + sampleValue * leftVolume;
            leftVolume = leftVolume + leftVolumeStep;
            secondRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[secondRightDestinationIndex] = destination[secondRightDestinationIndex] + sampleValue * rightVolume;
            rightVolume = rightVolume + rightVolumeStep;
            sampleValue = samples[samplePositionOrIndex--];
            thirdLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[thirdLeftDestinationIndex] = destination[thirdLeftDestinationIndex] + sampleValue * leftVolume;
            leftVolume = leftVolume + leftVolumeStep;
            thirdRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[thirdRightDestinationIndex] = destination[thirdRightDestinationIndex] + sampleValue * rightVolume;
            rightVolume = rightVolume + rightVolumeStep;
            sampleValue = samples[samplePositionOrIndex--];
            fourthLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[fourthLeftDestinationIndex] = destination[fourthLeftDestinationIndex] + sampleValue * leftVolume;
            leftVolume = leftVolume + leftVolumeStep;
            fourthRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[fourthRightDestinationIndex] = destination[fourthRightDestinationIndex] + sampleValue * rightVolume;
            rightVolume = rightVolume + rightVolumeStep;
        }
        destinationLimit += 6;
        while (destinationFrameOrSampleIndex < destinationLimit) {
            sampleValue = samples[samplePositionOrIndex--];
            tailLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[tailLeftDestinationIndex] = destination[tailLeftDestinationIndex] + sampleValue * leftVolume;
            leftVolume = leftVolume + leftVolumeStep;
            tailRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[tailRightDestinationIndex] = destination[tailRightDestinationIndex] + sampleValue * rightVolume;
            rightVolume = rightVolume + rightVolumeStep;
        }
        stream.currentLeftVolume = leftVolume >> 2;
        stream.currentRightVolume = rightVolume >> 2;
        stream.samplePositionFixed = samplePositionOrIndex << 8;
        return destinationFrameOrSampleIndex >> 1;
    }

    final PcmStream nextChildStream() {
        return null;
    }

    final synchronized void fadeOutAndUnlink(int fadeFrames) {
        int maxVolumeMagnitude = 0;
        int maxVolumeMagnitudeLiteralPhase1;
        if (fadeFrames == 0) {
            this.setVolume(0);
            this.unlinkNode(false);
            return;
        }
        if (this.currentLeftVolume != 0) {
            maxVolumeMagnitude = -this.currentVolume;
            if (this.currentVolume > maxVolumeMagnitude) {
                maxVolumeMagnitude = this.currentVolume;
            }
            if (-this.currentLeftVolume > maxVolumeMagnitude) {
                maxVolumeMagnitude = -this.currentLeftVolume;
            }
            if (this.currentLeftVolume > maxVolumeMagnitude) {
                maxVolumeMagnitude = this.currentLeftVolume;
            }
            if (-this.currentRightVolume > maxVolumeMagnitude) {
                maxVolumeMagnitude = -this.currentRightVolume;
            }
            if (this.currentRightVolume > maxVolumeMagnitude) {
                maxVolumeMagnitude = this.currentRightVolume;
            }
            if (fadeFrames > maxVolumeMagnitude) {
                fadeFrames = maxVolumeMagnitude;
            }
            this.rampFramesRemaining = fadeFrames;
            this.targetVolume = -2147483648;
            this.volumeStepPerFrame = -this.currentVolume / fadeFrames;
            this.leftVolumeStepPerFrame = -this.currentLeftVolume / fadeFrames;
            this.rightVolumeStepPerFrame = -this.currentRightVolume / fadeFrames;
            return;
        }
        if (this.currentRightVolume != 0) {
            maxVolumeMagnitudeLiteralPhase1 = -this.currentVolume;
            if (this.currentVolume > maxVolumeMagnitudeLiteralPhase1) {
                maxVolumeMagnitudeLiteralPhase1 = this.currentVolume;
            }
            if (-this.currentLeftVolume > maxVolumeMagnitudeLiteralPhase1) {
                maxVolumeMagnitudeLiteralPhase1 = -this.currentLeftVolume;
            }
            if (this.currentLeftVolume > maxVolumeMagnitudeLiteralPhase1) {
                maxVolumeMagnitudeLiteralPhase1 = this.currentLeftVolume;
            }
            if (-this.currentRightVolume > maxVolumeMagnitudeLiteralPhase1) {
                maxVolumeMagnitudeLiteralPhase1 = -this.currentRightVolume;
            }
            if (this.currentRightVolume > maxVolumeMagnitudeLiteralPhase1) {
                maxVolumeMagnitudeLiteralPhase1 = this.currentRightVolume;
            }
            if (fadeFrames > maxVolumeMagnitudeLiteralPhase1) {
                fadeFrames = maxVolumeMagnitudeLiteralPhase1;
            }
            this.rampFramesRemaining = fadeFrames;
            this.targetVolume = -2147483648;
            this.volumeStepPerFrame = -this.currentVolume / fadeFrames;
            this.leftVolumeStepPerFrame = -this.currentLeftVolume / fadeFrames;
            this.rightVolumeStepPerFrame = -this.currentRightVolume / fadeFrames;
            return;
        }
        this.rampFramesRemaining = 0;
        this.targetVolume = 0;
        this.currentVolume = 0;
        this.unlinkNode(false);
    }

    private final synchronized void setVolumeAndPan(int volume, int pan) {
        this.targetVolume = volume;
        this.targetPan = pan;
        this.rampFramesRemaining = 0;
        this.refreshCurrentVolumes();
    }

    final synchronized void setReversePlayback(boolean reverse) {
        this.sampleStepFixed = (this.sampleStepFixed ^ this.sampleStepFixed >> 31) + (this.sampleStepFixed >>> 31);
        if (!reverse) {
            return;
        }
        this.sampleStepFixed = -this.sampleStepFixed;
    }

    final synchronized void setLoopCount(int loopCount) {
        this.loopsRemaining = loopCount;
    }

    private final static int mixForwardStereoInterpolatedRamp(int sampleValueOrBoundarySample, int sourceIndexOrBoundarySample, byte[] samples, int[] destination, int samplePositionFixed, int destinationFrameOrSampleIndex, int leftVolume, int rightVolume, int leftVolumeStep, int rightVolumeStep, int destinationLimit, int destinationEnd, int sampleBoundaryFixed, PcmSampleStream stream, int sampleStepFixed, int boundarySample) {
        int interiorLeftDestinationIndex = 0;
        int interiorRightDestinationIndex = 0;
        int boundaryLeftDestinationIndex = 0;
        int boundaryRightDestinationIndex = 0;
        stream.currentVolume = stream.currentVolume - stream.volumeStepPerFrame * destinationFrameOrSampleIndex;
        if (sampleStepFixed != 0) {
          destinationLimit = destinationFrameOrSampleIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 257) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || destinationFrameOrSampleIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 257) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        destinationFrameOrSampleIndex = destinationFrameOrSampleIndex << 1;
        destinationLimit = destinationLimit << 1;
        while (destinationFrameOrSampleIndex < destinationLimit) {
          sourceIndexOrBoundarySample = samplePositionFixed >> 8;
          sampleValueOrBoundarySample = samples[sourceIndexOrBoundarySample];
          sampleValueOrBoundarySample = (sampleValueOrBoundarySample << 8) + (samples[sourceIndexOrBoundarySample + 1] - sampleValueOrBoundarySample) * (samplePositionFixed & 255);
          interiorLeftDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[interiorLeftDestinationIndex] = destination[interiorLeftDestinationIndex] + (sampleValueOrBoundarySample * leftVolume >> 6);
          leftVolume = leftVolume + leftVolumeStep;
          interiorRightDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[interiorRightDestinationIndex] = destination[interiorRightDestinationIndex] + (sampleValueOrBoundarySample * rightVolume >> 6);
          rightVolume = rightVolume + rightVolumeStep;
          samplePositionFixed = samplePositionFixed + sampleStepFixed;
        }
        if (sampleStepFixed != 0) {
          destinationLimit = (destinationFrameOrSampleIndex >> 1) + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 1) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || (destinationFrameOrSampleIndex >> 1) + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 1) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        destinationLimit = destinationLimit << 1;
        sourceIndexOrBoundarySample = boundarySample;
        while (destinationFrameOrSampleIndex < destinationLimit) {
          sampleValueOrBoundarySample = samples[samplePositionFixed >> 8];
          sampleValueOrBoundarySample = (sampleValueOrBoundarySample << 8) + (sourceIndexOrBoundarySample - sampleValueOrBoundarySample) * (samplePositionFixed & 255);
          boundaryLeftDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[boundaryLeftDestinationIndex] = destination[boundaryLeftDestinationIndex] + (sampleValueOrBoundarySample * leftVolume >> 6);
          leftVolume = leftVolume + leftVolumeStep;
          boundaryRightDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[boundaryRightDestinationIndex] = destination[boundaryRightDestinationIndex] + (sampleValueOrBoundarySample * rightVolume >> 6);
          rightVolume = rightVolume + rightVolumeStep;
          samplePositionFixed = samplePositionFixed + sampleStepFixed;
        }
        destinationFrameOrSampleIndex = destinationFrameOrSampleIndex >> 1;
        stream.currentVolume = stream.currentVolume + stream.volumeStepPerFrame * destinationFrameOrSampleIndex;
        stream.currentLeftVolume = leftVolume;
        stream.currentRightVolume = rightVolume;
        stream.samplePositionFixed = samplePositionFixed;
        return destinationFrameOrSampleIndex;
    }

    private final static int mixReverseMonoInterpolated(int sampleValueOrBoundarySample, int sourceIndexOrStep, byte[] samples, int[] destination, int samplePositionFixed, int destinationIndex, int volume, int destinationLimit, int destinationEnd, int sampleBoundaryFixed, PcmSampleStream stream, int sampleStepFixed, int boundarySample) {
        int interiorDestinationIndex = 0;
        int boundaryDestinationIndex = 0;
        if (sampleStepFixed != 0) {
          destinationLimit = destinationIndex + (sampleBoundaryFixed + 256 - samplePositionFixed + sampleStepFixed) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || destinationIndex + (sampleBoundaryFixed + 256 - samplePositionFixed + sampleStepFixed) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        while (destinationIndex < destinationLimit) {
          sourceIndexOrStep = samplePositionFixed >> 8;
          sampleValueOrBoundarySample = samples[sourceIndexOrStep - 1];
          interiorDestinationIndex = destinationIndex;
          destinationIndex++;
          destination[interiorDestinationIndex] = destination[interiorDestinationIndex] + (((sampleValueOrBoundarySample << 8) + (samples[sourceIndexOrStep] - sampleValueOrBoundarySample) * (samplePositionFixed & 255)) * volume >> 6);
          samplePositionFixed = samplePositionFixed + sampleStepFixed;
        }
        if (sampleStepFixed != 0) {
          destinationLimit = destinationIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || destinationIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        sampleValueOrBoundarySample = boundarySample;
        sourceIndexOrStep = sampleStepFixed;
        while (destinationIndex < destinationLimit) {
          boundaryDestinationIndex = destinationIndex;
          destinationIndex++;
          destination[boundaryDestinationIndex] = destination[boundaryDestinationIndex] + (((sampleValueOrBoundarySample << 8) + (samples[samplePositionFixed >> 8] - sampleValueOrBoundarySample) * (samplePositionFixed & 255)) * volume >> 6);
          samplePositionFixed = samplePositionFixed + sourceIndexOrStep;
        }
        stream.samplePositionFixed = samplePositionFixed;
        return destinationIndex;
    }

    private final static int mixReverseStereoInterpolatedRamp(int sampleValueOrBoundarySample, int sourceIndexOrBoundarySample, byte[] samples, int[] destination, int samplePositionFixed, int destinationFrameOrSampleIndex, int leftVolume, int rightVolume, int leftVolumeStep, int rightVolumeStep, int destinationLimit, int destinationEnd, int sampleBoundaryFixed, PcmSampleStream stream, int sampleStepFixed, int boundarySample) {
        int interiorLeftDestinationIndex = 0;
        int interiorRightDestinationIndex = 0;
        int boundaryLeftDestinationIndex = 0;
        int boundaryRightDestinationIndex = 0;
        stream.currentVolume = stream.currentVolume - stream.volumeStepPerFrame * destinationFrameOrSampleIndex;
        if (sampleStepFixed != 0) {
          destinationLimit = destinationFrameOrSampleIndex + (sampleBoundaryFixed + 256 - samplePositionFixed + sampleStepFixed) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || destinationFrameOrSampleIndex + (sampleBoundaryFixed + 256 - samplePositionFixed + sampleStepFixed) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        destinationFrameOrSampleIndex = destinationFrameOrSampleIndex << 1;
        destinationLimit = destinationLimit << 1;
        while (destinationFrameOrSampleIndex < destinationLimit) {
          sourceIndexOrBoundarySample = samplePositionFixed >> 8;
          sampleValueOrBoundarySample = samples[sourceIndexOrBoundarySample - 1];
          sampleValueOrBoundarySample = (sampleValueOrBoundarySample << 8) + (samples[sourceIndexOrBoundarySample] - sampleValueOrBoundarySample) * (samplePositionFixed & 255);
          interiorLeftDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[interiorLeftDestinationIndex] = destination[interiorLeftDestinationIndex] + (sampleValueOrBoundarySample * leftVolume >> 6);
          leftVolume = leftVolume + leftVolumeStep;
          interiorRightDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[interiorRightDestinationIndex] = destination[interiorRightDestinationIndex] + (sampleValueOrBoundarySample * rightVolume >> 6);
          rightVolume = rightVolume + rightVolumeStep;
          samplePositionFixed = samplePositionFixed + sampleStepFixed;
        }
        if (sampleStepFixed != 0) {
          destinationLimit = (destinationFrameOrSampleIndex >> 1) + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || (destinationFrameOrSampleIndex >> 1) + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        destinationLimit = destinationLimit << 1;
        sourceIndexOrBoundarySample = boundarySample;
        while (destinationFrameOrSampleIndex < destinationLimit) {
          sampleValueOrBoundarySample = (sourceIndexOrBoundarySample << 8) + (samples[samplePositionFixed >> 8] - sourceIndexOrBoundarySample) * (samplePositionFixed & 255);
          boundaryLeftDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[boundaryLeftDestinationIndex] = destination[boundaryLeftDestinationIndex] + (sampleValueOrBoundarySample * leftVolume >> 6);
          leftVolume = leftVolume + leftVolumeStep;
          boundaryRightDestinationIndex = destinationFrameOrSampleIndex;
          destinationFrameOrSampleIndex++;
          destination[boundaryRightDestinationIndex] = destination[boundaryRightDestinationIndex] + (sampleValueOrBoundarySample * rightVolume >> 6);
          rightVolume = rightVolume + rightVolumeStep;
          samplePositionFixed = samplePositionFixed + sampleStepFixed;
        }
        destinationFrameOrSampleIndex = destinationFrameOrSampleIndex >> 1;
        stream.currentVolume = stream.currentVolume + stream.volumeStepPerFrame * destinationFrameOrSampleIndex;
        stream.currentLeftVolume = leftVolume;
        stream.currentRightVolume = rightVolume;
        stream.samplePositionFixed = samplePositionFixed;
        return destinationFrameOrSampleIndex;
    }

    final synchronized boolean hasRemainingRampFrames() {
        return this.rampFramesRemaining != 0;
    }

    final synchronized void setSampleStepMagnitude(int stepMagnitude) {
        if (this.sampleStepFixed < 0) {
            this.sampleStepFixed = -stepMagnitude;
        } else {
            this.sampleStepFixed = stepMagnitude;
        }
    }

    final synchronized void setSamplePositionFixed(int positionFixed) {
        int sampleEndFixed = ((PcmSample) ((Object) this.sample)).samples.length << 8;
        if (positionFixed < -1) {
            positionFixed = -1;
        }
        if (positionFixed > sampleEndFixed) {
            positionFixed = sampleEndFixed;
        }
        this.samplePositionFixed = positionFixed;
    }

    private final static int computeRightVolume(int volume, int pan) {
        return pan < 0 ? -volume : (int)((double)volume * Math.sqrt((double)pan * 0.0001220703125) + 0.5);
    }

    final synchronized int getSampleStepMagnitude() {
        return this.sampleStepFixed < 0 ? -this.sampleStepFixed : this.sampleStepFixed;
    }

    final synchronized void skipFrames(int frameCount) {
        int remainingAfterInitialBounce = 0;
        int remainingAfterEndBounce = 0;
        int remainingAfterStartBounce = 0;
        PcmSample sample;
        int loopStartFixed;
        int loopEndFixed;
        int sampleEndFixed;
        int loopSpanFixed;
        int loopsCrossed;
        if (this.rampFramesRemaining > 0) {
          if (frameCount < this.rampFramesRemaining) {
            this.currentVolume = this.currentVolume + this.volumeStepPerFrame * frameCount;
            this.currentLeftVolume = this.currentLeftVolume + this.leftVolumeStepPerFrame * frameCount;
            this.currentRightVolume = this.currentRightVolume + this.rightVolumeStepPerFrame * frameCount;
            this.rampFramesRemaining = this.rampFramesRemaining - frameCount;
          } else {
            if (this.targetVolume == -2147483648) {
              this.targetVolume = 0;
              this.currentRightVolume = 0;
              this.currentLeftVolume = 0;
              this.currentVolume = 0;
              this.unlinkNode(false);
              frameCount = this.rampFramesRemaining;
            }
            this.rampFramesRemaining = 0;
            this.refreshCurrentVolumes();
          }
        }
        sample = (PcmSample) ((Object) this.sample);
        loopStartFixed = this.loopStart << 8;
        loopEndFixed = this.loopEnd << 8;
        sampleEndFixed = sample.samples.length << 8;
        loopSpanFixed = loopEndFixed - loopStartFixed;
        if (loopSpanFixed <= 0) {
          this.loopsRemaining = 0;
        }
        if (this.samplePositionFixed < 0) {
          if (this.sampleStepFixed <= 0) {
            this.cancelVolumeRamp();
            this.unlinkNode(false);
            return;
          }
          this.samplePositionFixed = 0;
        }
        if (this.samplePositionFixed >= sampleEndFixed) {
          if (this.sampleStepFixed >= 0) {
            this.cancelVolumeRamp();
            this.unlinkNode(false);
            return;
          }
          this.samplePositionFixed = sampleEndFixed - 1;
        }
        this.samplePositionFixed = this.samplePositionFixed + this.sampleStepFixed * frameCount;
        if (this.loopsRemaining < 0) {
          if (!this.pingPongLoop) {
            if (this.sampleStepFixed >= 0) {
              if (this.samplePositionFixed < loopEndFixed) {
                return;
              }
              this.samplePositionFixed = loopStartFixed + (this.samplePositionFixed - loopStartFixed) % loopSpanFixed;
              return;
            }
            if (this.samplePositionFixed >= loopStartFixed) {
              return;
            }
            this.samplePositionFixed = loopEndFixed - 1 - (loopEndFixed - 1 - this.samplePositionFixed) % loopSpanFixed;
            return;
          }
          if (this.sampleStepFixed < 0) {
            if (this.samplePositionFixed >= loopStartFixed) {
              return;
            }
            this.samplePositionFixed = loopStartFixed + loopStartFixed - 1 - this.samplePositionFixed;
            this.sampleStepFixed = -this.sampleStepFixed;
          }
          while (this.samplePositionFixed >= loopEndFixed) {
            this.samplePositionFixed = loopEndFixed + loopEndFixed - 1 - this.samplePositionFixed;
            this.sampleStepFixed = -this.sampleStepFixed;
            if (this.samplePositionFixed >= loopStartFixed) {
              return;
            }
            this.samplePositionFixed = loopStartFixed + loopStartFixed - 1 - this.samplePositionFixed;
            this.sampleStepFixed = -this.sampleStepFixed;
          }
          return;
        }
        finiteLoopSkipping: {
          if (this.loopsRemaining > 0) {
            if (!this.pingPongLoop) {
              if (this.sampleStepFixed >= 0) {
                if (this.samplePositionFixed < loopEndFixed) {
                  return;
                }
                loopsCrossed = (this.samplePositionFixed - loopStartFixed) / loopSpanFixed;
                if (loopsCrossed >= this.loopsRemaining) {
                  this.samplePositionFixed = this.samplePositionFixed - loopSpanFixed * this.loopsRemaining;
                  this.loopsRemaining = 0;
                  break finiteLoopSkipping;
                }
                this.samplePositionFixed = this.samplePositionFixed - loopSpanFixed * loopsCrossed;
                this.loopsRemaining = this.loopsRemaining - loopsCrossed;
              } else {
                if (this.samplePositionFixed >= loopStartFixed) {
                  return;
                }
                loopsCrossed = (loopEndFixed - 1 - this.samplePositionFixed) / loopSpanFixed;
                if (loopsCrossed >= this.loopsRemaining) {
                  this.samplePositionFixed = this.samplePositionFixed + loopSpanFixed * this.loopsRemaining;
                  this.loopsRemaining = 0;
                  break finiteLoopSkipping;
                }
                this.samplePositionFixed = this.samplePositionFixed + loopSpanFixed * loopsCrossed;
                this.loopsRemaining = this.loopsRemaining - loopsCrossed;
              }
              return;
            }
            if (this.sampleStepFixed < 0) {
              if (this.samplePositionFixed >= loopStartFixed) {
                return;
              }
              this.samplePositionFixed = loopStartFixed + loopStartFixed - 1 - this.samplePositionFixed;
              this.sampleStepFixed = -this.sampleStepFixed;
              remainingAfterInitialBounce = this.loopsRemaining - 1;
              this.loopsRemaining = this.loopsRemaining - 1;
              if (remainingAfterInitialBounce == 0) {
                break finiteLoopSkipping;
              }
            }
            do {
              if (this.samplePositionFixed < loopEndFixed) {
                return;
              }
              this.samplePositionFixed = loopEndFixed + loopEndFixed - 1 - this.samplePositionFixed;
              this.sampleStepFixed = -this.sampleStepFixed;
              remainingAfterEndBounce = this.loopsRemaining - 1;
              this.loopsRemaining = this.loopsRemaining - 1;
              if (remainingAfterEndBounce == 0) {
                break;
              }
              if (this.samplePositionFixed >= loopStartFixed) {
                return;
              }
              this.samplePositionFixed = loopStartFixed + loopStartFixed - 1 - this.samplePositionFixed;
              this.sampleStepFixed = -this.sampleStepFixed;
              remainingAfterStartBounce = this.loopsRemaining - 1;
              this.loopsRemaining = this.loopsRemaining - 1;
            } while (remainingAfterStartBounce != 0);
          }
        }
        if (this.sampleStepFixed >= 0) {
          if (this.samplePositionFixed >= sampleEndFixed) {
            this.samplePositionFixed = sampleEndFixed;
            this.cancelVolumeRamp();
            this.unlinkNode(false);
          }
          return;
        }
        if (this.samplePositionFixed >= 0) {
          return;
        }
        this.samplePositionFixed = -1;
        this.cancelVolumeRamp();
        this.unlinkNode(false);
    }

    private final static int mixForwardStereoAligned(int sampleValue, byte[] samples, int[] destination, int samplePositionOrIndex, int destinationFrameOrSampleIndex, int leftVolume, int rightVolume, int destinationLimit, int destinationEnd, int sampleBoundaryOrIndex, PcmSampleStream stream) {
        int firstLeftDestinationIndex = 0;
        int firstRightDestinationIndex = 0;
        int secondLeftDestinationIndex = 0;
        int secondRightDestinationIndex = 0;
        int thirdLeftDestinationIndex = 0;
        int thirdRightDestinationIndex = 0;
        int fourthLeftDestinationIndex = 0;
        int fourthRightDestinationIndex = 0;
        int tailLeftDestinationIndex = 0;
        int tailRightDestinationIndex = 0;
        samplePositionOrIndex = samplePositionOrIndex >> 8;
        sampleBoundaryOrIndex = sampleBoundaryOrIndex >> 8;
        leftVolume = leftVolume << 2;
        rightVolume = rightVolume << 2;
        destinationLimit = destinationFrameOrSampleIndex + sampleBoundaryOrIndex - samplePositionOrIndex;
        if (destinationFrameOrSampleIndex + sampleBoundaryOrIndex - samplePositionOrIndex > destinationEnd) {
            destinationLimit = destinationEnd;
        }
        destinationFrameOrSampleIndex = destinationFrameOrSampleIndex << 1;
        destinationLimit = destinationLimit << 1;
        destinationLimit -= 6;
        while (destinationFrameOrSampleIndex < destinationLimit) {
            sampleValue = samples[samplePositionOrIndex++];
            firstLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[firstLeftDestinationIndex] = destination[firstLeftDestinationIndex] + sampleValue * leftVolume;
            firstRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[firstRightDestinationIndex] = destination[firstRightDestinationIndex] + sampleValue * rightVolume;
            sampleValue = samples[samplePositionOrIndex++];
            secondLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[secondLeftDestinationIndex] = destination[secondLeftDestinationIndex] + sampleValue * leftVolume;
            secondRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[secondRightDestinationIndex] = destination[secondRightDestinationIndex] + sampleValue * rightVolume;
            sampleValue = samples[samplePositionOrIndex++];
            thirdLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[thirdLeftDestinationIndex] = destination[thirdLeftDestinationIndex] + sampleValue * leftVolume;
            thirdRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[thirdRightDestinationIndex] = destination[thirdRightDestinationIndex] + sampleValue * rightVolume;
            sampleValue = samples[samplePositionOrIndex++];
            fourthLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[fourthLeftDestinationIndex] = destination[fourthLeftDestinationIndex] + sampleValue * leftVolume;
            fourthRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[fourthRightDestinationIndex] = destination[fourthRightDestinationIndex] + sampleValue * rightVolume;
        }
        destinationLimit += 6;
        while (destinationFrameOrSampleIndex < destinationLimit) {
            sampleValue = samples[samplePositionOrIndex++];
            tailLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[tailLeftDestinationIndex] = destination[tailLeftDestinationIndex] + sampleValue * leftVolume;
            tailRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[tailRightDestinationIndex] = destination[tailRightDestinationIndex] + sampleValue * rightVolume;
        }
        stream.samplePositionFixed = samplePositionOrIndex << 8;
        return destinationFrameOrSampleIndex >> 1;
    }

    private final static int mixReverseMonoAligned(byte[] samples, int[] destination, int samplePositionOrIndex, int destinationIndex, int volume, int destinationLimit, int destinationEnd, int sampleBoundaryOrIndex, PcmSampleStream stream) {
        int firstDestinationIndex = 0;
        int firstSourceIndex = 0;
        int secondDestinationIndex = 0;
        int secondSourceIndex = 0;
        int thirdDestinationIndex = 0;
        int thirdSourceIndex = 0;
        int fourthDestinationIndex = 0;
        int fourthSourceIndex = 0;
        int tailDestinationIndex = 0;
        int tailSourceIndex = 0;
        samplePositionOrIndex = samplePositionOrIndex >> 8;
        sampleBoundaryOrIndex = sampleBoundaryOrIndex >> 8;
        volume = volume << 2;
        destinationLimit = destinationIndex + samplePositionOrIndex - (sampleBoundaryOrIndex - 1);
        if (destinationIndex + samplePositionOrIndex - (sampleBoundaryOrIndex - 1) > destinationEnd) {
            destinationLimit = destinationEnd;
        }
        destinationLimit -= 3;
        while (destinationIndex < destinationLimit) {
            firstDestinationIndex = destinationIndex;
            destinationIndex++;
            firstSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex--;
            destination[firstDestinationIndex] = destination[firstDestinationIndex] + samples[firstSourceIndex] * volume;
            secondDestinationIndex = destinationIndex;
            destinationIndex++;
            secondSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex--;
            destination[secondDestinationIndex] = destination[secondDestinationIndex] + samples[secondSourceIndex] * volume;
            thirdDestinationIndex = destinationIndex;
            destinationIndex++;
            thirdSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex--;
            destination[thirdDestinationIndex] = destination[thirdDestinationIndex] + samples[thirdSourceIndex] * volume;
            fourthDestinationIndex = destinationIndex;
            destinationIndex++;
            fourthSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex--;
            destination[fourthDestinationIndex] = destination[fourthDestinationIndex] + samples[fourthSourceIndex] * volume;
        }
        destinationLimit += 3;
        while (destinationIndex < destinationLimit) {
            tailDestinationIndex = destinationIndex;
            destinationIndex++;
            tailSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex--;
            destination[tailDestinationIndex] = destination[tailDestinationIndex] + samples[tailSourceIndex] * volume;
        }
        stream.samplePositionFixed = samplePositionOrIndex << 8;
        return destinationIndex;
    }

    final synchronized void mixInto(int[] destination, int destinationOffset, int frameCount) {
        int remainingAfterInitialBounce = 0;
        int remainingAfterEndBounce = 0;
        int remainingAfterStartBounce = 0;
        int discardedForwardDestinationEnd = 0;
        int discardedReverseDestinationEnd = 0;
        PcmSample sample;
        int loopStartFixed;
        int loopEndFixed;
        int sampleEndFixed;
        int loopSpanFixed;
        int nextDestinationOffset;
        int loopsCrossed;
        int loopsCrossedNestedPhase2;
        if (this.targetVolume == 0 &&
            this.rampFramesRemaining == 0) {
          this.skipFrames(frameCount);
          return;
        }
        sample = (PcmSample) ((Object) this.sample);
        loopStartFixed = this.loopStart << 8;
        loopEndFixed = this.loopEnd << 8;
        sampleEndFixed = sample.samples.length << 8;
        loopSpanFixed = loopEndFixed - loopStartFixed;
        if (loopSpanFixed <= 0) {
          this.loopsRemaining = 0;
        }
        nextDestinationOffset = destinationOffset;
        frameCount = frameCount + destinationOffset;
        if (this.samplePositionFixed < 0) {
          if (this.sampleStepFixed <= 0) {
            this.cancelVolumeRamp();
            this.unlinkNode(false);
            return;
          }
          this.samplePositionFixed = 0;
        }
        if (this.samplePositionFixed >= sampleEndFixed) {
          if (this.sampleStepFixed >= 0) {
            this.cancelVolumeRamp();
            this.unlinkNode(false);
            return;
          }
          this.samplePositionFixed = sampleEndFixed - 1;
        }
        if (this.loopsRemaining < 0) {
          if (!this.pingPongLoop) {
            if (this.sampleStepFixed >= 0) {
              while (true) {
                nextDestinationOffset = this.mixForwardToBoundary(destination, nextDestinationOffset, loopEndFixed, frameCount, (int) sample.samples[this.loopStart]);
                if (this.samplePositionFixed < loopEndFixed) {
                  return;
                }
                this.samplePositionFixed = loopStartFixed + (this.samplePositionFixed - loopStartFixed) % loopSpanFixed;
              }
            }
            while (true) {
              nextDestinationOffset = this.mixReverseToBoundary(destination, nextDestinationOffset, loopStartFixed, frameCount, (int) sample.samples[this.loopEnd - 1]);
              if (this.samplePositionFixed >= loopStartFixed) {
                return;
              }
              this.samplePositionFixed = loopEndFixed - 1 - (loopEndFixed - 1 - this.samplePositionFixed) % loopSpanFixed;
            }
          }
          if (this.sampleStepFixed < 0) {
            nextDestinationOffset = this.mixReverseToBoundary(destination, nextDestinationOffset, loopStartFixed, frameCount, (int) sample.samples[this.loopStart]);
            if (this.samplePositionFixed >= loopStartFixed) {
              return;
            }
            this.samplePositionFixed = loopStartFixed + loopStartFixed - 1 - this.samplePositionFixed;
            this.sampleStepFixed = -this.sampleStepFixed;
          }
          while (true) {
            nextDestinationOffset = this.mixForwardToBoundary(destination, nextDestinationOffset, loopEndFixed, frameCount, (int) sample.samples[this.loopEnd - 1]);
            if (this.samplePositionFixed < loopEndFixed) {
              return;
            }
            this.samplePositionFixed = loopEndFixed + loopEndFixed - 1 - this.samplePositionFixed;
            this.sampleStepFixed = -this.sampleStepFixed;
            nextDestinationOffset = this.mixReverseToBoundary(destination, nextDestinationOffset, loopStartFixed, frameCount, (int) sample.samples[this.loopStart]);
            if (this.samplePositionFixed >= loopStartFixed) {
              return;
            }
            this.samplePositionFixed = loopStartFixed + loopStartFixed - 1 - this.samplePositionFixed;
            this.sampleStepFixed = -this.sampleStepFixed;
          }
        }
        finiteLoopMixing: {
          if (this.loopsRemaining > 0) {
            if (!this.pingPongLoop) {
              if (this.sampleStepFixed < 0) {
                while (true) {
                  nextDestinationOffset = this.mixReverseToBoundary(destination, nextDestinationOffset, loopStartFixed, frameCount, (int) sample.samples[this.loopEnd - 1]);
                  if (this.samplePositionFixed >= loopStartFixed) {
                    return;
                  }
                  loopsCrossed = (loopEndFixed - 1 - this.samplePositionFixed) / loopSpanFixed;
                  if (loopsCrossed < this.loopsRemaining) {
                    this.samplePositionFixed = this.samplePositionFixed + loopSpanFixed * loopsCrossed;
                    this.loopsRemaining = this.loopsRemaining - loopsCrossed;
                    continue;
                  }
                  break;
                }
                this.samplePositionFixed = this.samplePositionFixed + loopSpanFixed * this.loopsRemaining;
                this.loopsRemaining = 0;
                break finiteLoopMixing;
              }
              while (true) {
                nextDestinationOffset = this.mixForwardToBoundary(destination, nextDestinationOffset, loopEndFixed, frameCount, (int) sample.samples[this.loopStart]);
                if (this.samplePositionFixed < loopEndFixed) {
                  return;
                }
                loopsCrossedNestedPhase2 = (this.samplePositionFixed - loopStartFixed) / loopSpanFixed;
                if (loopsCrossedNestedPhase2 < this.loopsRemaining) {
                  this.samplePositionFixed = this.samplePositionFixed - loopSpanFixed * loopsCrossedNestedPhase2;
                  this.loopsRemaining = this.loopsRemaining - loopsCrossedNestedPhase2;
                  continue;
                }
                break;
              }
              this.samplePositionFixed = this.samplePositionFixed - loopSpanFixed * this.loopsRemaining;
              this.loopsRemaining = 0;
              break finiteLoopMixing;
            }
            if (this.sampleStepFixed < 0) {
              nextDestinationOffset = this.mixReverseToBoundary(destination, nextDestinationOffset, loopStartFixed, frameCount, (int) sample.samples[this.loopStart]);
              if (this.samplePositionFixed >= loopStartFixed) {
                return;
              }
              this.samplePositionFixed = loopStartFixed + loopStartFixed - 1 - this.samplePositionFixed;
              this.sampleStepFixed = -this.sampleStepFixed;
              remainingAfterInitialBounce = this.loopsRemaining - 1;
              this.loopsRemaining = this.loopsRemaining - 1;
              if (remainingAfterInitialBounce == 0) {
                break finiteLoopMixing;
              }
            }
            do {
              nextDestinationOffset = this.mixForwardToBoundary(destination, nextDestinationOffset, loopEndFixed, frameCount, (int) sample.samples[this.loopEnd - 1]);
              if (this.samplePositionFixed < loopEndFixed) {
                return;
              }
              this.samplePositionFixed = loopEndFixed + loopEndFixed - 1 - this.samplePositionFixed;
              this.sampleStepFixed = -this.sampleStepFixed;
              remainingAfterEndBounce = this.loopsRemaining - 1;
              this.loopsRemaining = this.loopsRemaining - 1;
              if (remainingAfterEndBounce == 0) {
                break;
              }
              nextDestinationOffset = this.mixReverseToBoundary(destination, nextDestinationOffset, loopStartFixed, frameCount, (int) sample.samples[this.loopStart]);
              if (this.samplePositionFixed >= loopStartFixed) {
                return;
              }
              this.samplePositionFixed = loopStartFixed + loopStartFixed - 1 - this.samplePositionFixed;
              this.sampleStepFixed = -this.sampleStepFixed;
              remainingAfterStartBounce = this.loopsRemaining - 1;
              this.loopsRemaining = this.loopsRemaining - 1;
            } while (remainingAfterStartBounce != 0);
          }
        }
        if (this.sampleStepFixed >= 0) {
          discardedForwardDestinationEnd = this.mixForwardToBoundary(destination, nextDestinationOffset, sampleEndFixed, frameCount, 0);
          if (this.samplePositionFixed >= sampleEndFixed) {
            this.samplePositionFixed = sampleEndFixed;
            this.cancelVolumeRamp();
            this.unlinkNode(false);
          }
          return;
        }
        discardedReverseDestinationEnd = this.mixReverseToBoundary(destination, nextDestinationOffset, 0, frameCount, 0);
        if (this.samplePositionFixed >= 0) {
          return;
        }
        this.samplePositionFixed = -1;
        this.cancelVolumeRamp();
        this.unlinkNode(false);
        return;
    }

    private final void refreshCurrentVolumes() {
        this.currentVolume = this.targetVolume;
        this.currentLeftVolume = PcmSampleStream.computeLeftVolume(this.targetVolume, this.targetPan);
        this.currentRightVolume = PcmSampleStream.computeRightVolume(this.targetVolume, this.targetPan);
    }

    private final static int mixReverseMonoInterpolatedRamp(int sampleValueOrBoundarySample, int sourceIndexOrStep, byte[] samples, int[] destination, int samplePositionFixed, int destinationIndex, int volume, int volumeStep, int destinationLimit, int destinationEnd, int sampleBoundaryFixed, PcmSampleStream stream, int sampleStepFixed, int boundarySample) {
        int interiorDestinationIndex = 0;
        int boundaryDestinationIndex = 0;
        stream.currentLeftVolume = stream.currentLeftVolume - stream.leftVolumeStepPerFrame * destinationIndex;
        stream.currentRightVolume = stream.currentRightVolume - stream.rightVolumeStepPerFrame * destinationIndex;
        if (sampleStepFixed != 0) {
          destinationLimit = destinationIndex + (sampleBoundaryFixed + 256 - samplePositionFixed + sampleStepFixed) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || destinationIndex + (sampleBoundaryFixed + 256 - samplePositionFixed + sampleStepFixed) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        while (destinationIndex < destinationLimit) {
          sourceIndexOrStep = samplePositionFixed >> 8;
          sampleValueOrBoundarySample = samples[sourceIndexOrStep - 1];
          interiorDestinationIndex = destinationIndex;
          destinationIndex++;
          destination[interiorDestinationIndex] = destination[interiorDestinationIndex] + (((sampleValueOrBoundarySample << 8) + (samples[sourceIndexOrStep] - sampleValueOrBoundarySample) * (samplePositionFixed & 255)) * volume >> 6);
          volume = volume + volumeStep;
          samplePositionFixed = samplePositionFixed + sampleStepFixed;
        }
        if (sampleStepFixed != 0) {
          destinationLimit = destinationIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || destinationIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        sampleValueOrBoundarySample = boundarySample;
        sourceIndexOrStep = sampleStepFixed;
        while (destinationIndex < destinationLimit) {
          boundaryDestinationIndex = destinationIndex;
          destinationIndex++;
          destination[boundaryDestinationIndex] = destination[boundaryDestinationIndex] + (((sampleValueOrBoundarySample << 8) + (samples[samplePositionFixed >> 8] - sampleValueOrBoundarySample) * (samplePositionFixed & 255)) * volume >> 6);
          volume = volume + volumeStep;
          samplePositionFixed = samplePositionFixed + sourceIndexOrStep;
        }
        stream.currentLeftVolume = stream.currentLeftVolume + stream.leftVolumeStepPerFrame * destinationIndex;
        stream.currentRightVolume = stream.currentRightVolume + stream.rightVolumeStepPerFrame * destinationIndex;
        stream.currentVolume = volume;
        stream.samplePositionFixed = samplePositionFixed;
        return destinationIndex;
    }

    final synchronized void rampVolumeAndPan(int rampFrames, int targetVolume, int targetPan) {
        int maxVolumeDelta = 0;
        int maxVolumeDeltaLiteralPhase1;
        if (rampFrames == 0) {
            this.setVolumeAndPan(targetVolume, targetPan);
            return;
        }
        int targetLeftVolume = PcmSampleStream.computeLeftVolume(targetVolume, targetPan);
        int targetRightVolume = PcmSampleStream.computeRightVolume(targetVolume, targetPan);
        if (this.currentLeftVolume != targetLeftVolume) {
            maxVolumeDelta = targetVolume - this.currentVolume;
            if (this.currentVolume - targetVolume > maxVolumeDelta) {
                maxVolumeDelta = this.currentVolume - targetVolume;
            }
            if (targetLeftVolume - this.currentLeftVolume > maxVolumeDelta) {
                maxVolumeDelta = targetLeftVolume - this.currentLeftVolume;
            }
            if (this.currentLeftVolume - targetLeftVolume > maxVolumeDelta) {
                maxVolumeDelta = this.currentLeftVolume - targetLeftVolume;
            }
            if (targetRightVolume - this.currentRightVolume > maxVolumeDelta) {
                maxVolumeDelta = targetRightVolume - this.currentRightVolume;
            }
            if (this.currentRightVolume - targetRightVolume > maxVolumeDelta) {
                maxVolumeDelta = this.currentRightVolume - targetRightVolume;
            }
            if (rampFrames > maxVolumeDelta) {
                rampFrames = maxVolumeDelta;
            }
            this.rampFramesRemaining = rampFrames;
            this.targetVolume = targetVolume;
            this.targetPan = targetPan;
            this.volumeStepPerFrame = (targetVolume - this.currentVolume) / rampFrames;
            this.leftVolumeStepPerFrame = (targetLeftVolume - this.currentLeftVolume) / rampFrames;
            this.rightVolumeStepPerFrame = (targetRightVolume - this.currentRightVolume) / rampFrames;
            return;
        }
        if (this.currentRightVolume != targetRightVolume) {
            maxVolumeDeltaLiteralPhase1 = targetVolume - this.currentVolume;
            if (this.currentVolume - targetVolume > maxVolumeDeltaLiteralPhase1) {
                maxVolumeDeltaLiteralPhase1 = this.currentVolume - targetVolume;
            }
            if (targetLeftVolume - this.currentLeftVolume > maxVolumeDeltaLiteralPhase1) {
                maxVolumeDeltaLiteralPhase1 = targetLeftVolume - this.currentLeftVolume;
            }
            if (this.currentLeftVolume - targetLeftVolume > maxVolumeDeltaLiteralPhase1) {
                maxVolumeDeltaLiteralPhase1 = this.currentLeftVolume - targetLeftVolume;
            }
            if (targetRightVolume - this.currentRightVolume > maxVolumeDeltaLiteralPhase1) {
                maxVolumeDeltaLiteralPhase1 = targetRightVolume - this.currentRightVolume;
            }
            if (this.currentRightVolume - targetRightVolume > maxVolumeDeltaLiteralPhase1) {
                maxVolumeDeltaLiteralPhase1 = this.currentRightVolume - targetRightVolume;
            }
            if (rampFrames > maxVolumeDeltaLiteralPhase1) {
                rampFrames = maxVolumeDeltaLiteralPhase1;
            }
            this.rampFramesRemaining = rampFrames;
            this.targetVolume = targetVolume;
            this.targetPan = targetPan;
            this.volumeStepPerFrame = (targetVolume - this.currentVolume) / rampFrames;
            this.leftVolumeStepPerFrame = (targetLeftVolume - this.currentLeftVolume) / rampFrames;
            this.rightVolumeStepPerFrame = (targetRightVolume - this.currentRightVolume) / rampFrames;
            return;
        }
        this.rampFramesRemaining = 0;
    }

    private final void cancelVolumeRamp() {
        if (this.rampFramesRemaining != 0) {
            if (this.targetVolume == -2147483648) {
                this.targetVolume = 0;
            }
            this.rampFramesRemaining = 0;
            this.refreshCurrentVolumes();
            return;
        }
    }

    private final static int mixForwardMonoInterpolatedRamp(int sampleValueOrBoundarySample, int sourceIndexOrBoundarySample, byte[] samples, int[] destination, int samplePositionFixed, int destinationIndex, int volume, int volumeStep, int destinationLimit, int destinationEnd, int sampleBoundaryFixed, PcmSampleStream stream, int sampleStepFixed, int boundarySample) {
        int interiorDestinationIndex = 0;
        int boundaryDestinationIndex = 0;
        stream.currentLeftVolume = stream.currentLeftVolume - stream.leftVolumeStepPerFrame * destinationIndex;
        stream.currentRightVolume = stream.currentRightVolume - stream.rightVolumeStepPerFrame * destinationIndex;
        if (sampleStepFixed != 0) {
          destinationLimit = destinationIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 257) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || destinationIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 257) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        while (destinationIndex < destinationLimit) {
          sourceIndexOrBoundarySample = samplePositionFixed >> 8;
          sampleValueOrBoundarySample = samples[sourceIndexOrBoundarySample];
          interiorDestinationIndex = destinationIndex;
          destinationIndex++;
          destination[interiorDestinationIndex] = destination[interiorDestinationIndex] + (((sampleValueOrBoundarySample << 8) + (samples[sourceIndexOrBoundarySample + 1] - sampleValueOrBoundarySample) * (samplePositionFixed & 255)) * volume >> 6);
          volume = volume + volumeStep;
          samplePositionFixed = samplePositionFixed + sampleStepFixed;
        }
        if (sampleStepFixed != 0) {
          destinationLimit = destinationIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 1) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || destinationIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 1) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        sourceIndexOrBoundarySample = boundarySample;
        while (destinationIndex < destinationLimit) {
          sampleValueOrBoundarySample = samples[samplePositionFixed >> 8];
          boundaryDestinationIndex = destinationIndex;
          destinationIndex++;
          destination[boundaryDestinationIndex] = destination[boundaryDestinationIndex] + (((sampleValueOrBoundarySample << 8) + (sourceIndexOrBoundarySample - sampleValueOrBoundarySample) * (samplePositionFixed & 255)) * volume >> 6);
          volume = volume + volumeStep;
          samplePositionFixed = samplePositionFixed + sampleStepFixed;
        }
        stream.currentLeftVolume = stream.currentLeftVolume + stream.leftVolumeStepPerFrame * destinationIndex;
        stream.currentRightVolume = stream.currentRightVolume + stream.rightVolumeStepPerFrame * destinationIndex;
        stream.currentVolume = volume;
        stream.samplePositionFixed = samplePositionFixed;
        return destinationIndex;
    }

    private final static int mixReverseMonoAlignedRamp(byte[] samples, int[] destination, int samplePositionOrIndex, int destinationIndex, int volume, int volumeStep, int destinationLimit, int destinationEnd, int sampleBoundaryOrIndex, PcmSampleStream stream) {
        int firstDestinationIndex = 0;
        int firstSourceIndex = 0;
        int secondDestinationIndex = 0;
        int secondSourceIndex = 0;
        int thirdDestinationIndex = 0;
        int thirdSourceIndex = 0;
        int fourthDestinationIndex = 0;
        int fourthSourceIndex = 0;
        int tailDestinationIndex = 0;
        int tailSourceIndex = 0;
        samplePositionOrIndex = samplePositionOrIndex >> 8;
        sampleBoundaryOrIndex = sampleBoundaryOrIndex >> 8;
        volume = volume << 2;
        volumeStep = volumeStep << 2;
        destinationLimit = destinationIndex + samplePositionOrIndex - (sampleBoundaryOrIndex - 1);
        if (destinationIndex + samplePositionOrIndex - (sampleBoundaryOrIndex - 1) > destinationEnd) {
            destinationLimit = destinationEnd;
        }
        stream.currentLeftVolume = stream.currentLeftVolume + stream.leftVolumeStepPerFrame * (destinationLimit - destinationIndex);
        stream.currentRightVolume = stream.currentRightVolume + stream.rightVolumeStepPerFrame * (destinationLimit - destinationIndex);
        destinationLimit -= 3;
        while (destinationIndex < destinationLimit) {
            firstDestinationIndex = destinationIndex;
            destinationIndex++;
            firstSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex--;
            destination[firstDestinationIndex] = destination[firstDestinationIndex] + samples[firstSourceIndex] * volume;
            volume = volume + volumeStep;
            secondDestinationIndex = destinationIndex;
            destinationIndex++;
            secondSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex--;
            destination[secondDestinationIndex] = destination[secondDestinationIndex] + samples[secondSourceIndex] * volume;
            volume = volume + volumeStep;
            thirdDestinationIndex = destinationIndex;
            destinationIndex++;
            thirdSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex--;
            destination[thirdDestinationIndex] = destination[thirdDestinationIndex] + samples[thirdSourceIndex] * volume;
            volume = volume + volumeStep;
            fourthDestinationIndex = destinationIndex;
            destinationIndex++;
            fourthSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex--;
            destination[fourthDestinationIndex] = destination[fourthDestinationIndex] + samples[fourthSourceIndex] * volume;
            volume = volume + volumeStep;
        }
        destinationLimit += 3;
        while (destinationIndex < destinationLimit) {
            tailDestinationIndex = destinationIndex;
            destinationIndex++;
            tailSourceIndex = samplePositionOrIndex;
            samplePositionOrIndex--;
            destination[tailDestinationIndex] = destination[tailDestinationIndex] + samples[tailSourceIndex] * volume;
            volume = volume + volumeStep;
        }
        stream.currentVolume = volume >> 2;
        stream.samplePositionFixed = samplePositionOrIndex << 8;
        return destinationIndex;
    }

    private final static int mixForwardStereoAlignedRamp(int sampleValue, byte[] samples, int[] destination, int samplePositionOrIndex, int destinationFrameOrSampleIndex, int leftVolume, int rightVolume, int leftVolumeStep, int rightVolumeStep, int destinationLimit, int destinationEnd, int sampleBoundaryOrIndex, PcmSampleStream stream) {
        int firstLeftDestinationIndex = 0;
        int firstRightDestinationIndex = 0;
        int secondLeftDestinationIndex = 0;
        int secondRightDestinationIndex = 0;
        int thirdLeftDestinationIndex = 0;
        int thirdRightDestinationIndex = 0;
        int fourthLeftDestinationIndex = 0;
        int fourthRightDestinationIndex = 0;
        int tailLeftDestinationIndex = 0;
        int tailRightDestinationIndex = 0;
        samplePositionOrIndex = samplePositionOrIndex >> 8;
        sampleBoundaryOrIndex = sampleBoundaryOrIndex >> 8;
        leftVolume = leftVolume << 2;
        rightVolume = rightVolume << 2;
        leftVolumeStep = leftVolumeStep << 2;
        rightVolumeStep = rightVolumeStep << 2;
        destinationLimit = destinationFrameOrSampleIndex + sampleBoundaryOrIndex - samplePositionOrIndex;
        if (destinationFrameOrSampleIndex + sampleBoundaryOrIndex - samplePositionOrIndex > destinationEnd) {
            destinationLimit = destinationEnd;
        }
        stream.currentVolume = stream.currentVolume + stream.volumeStepPerFrame * (destinationLimit - destinationFrameOrSampleIndex);
        destinationFrameOrSampleIndex = destinationFrameOrSampleIndex << 1;
        destinationLimit = destinationLimit << 1;
        destinationLimit -= 6;
        while (destinationFrameOrSampleIndex < destinationLimit) {
            sampleValue = samples[samplePositionOrIndex++];
            firstLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[firstLeftDestinationIndex] = destination[firstLeftDestinationIndex] + sampleValue * leftVolume;
            leftVolume = leftVolume + leftVolumeStep;
            firstRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[firstRightDestinationIndex] = destination[firstRightDestinationIndex] + sampleValue * rightVolume;
            rightVolume = rightVolume + rightVolumeStep;
            sampleValue = samples[samplePositionOrIndex++];
            secondLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[secondLeftDestinationIndex] = destination[secondLeftDestinationIndex] + sampleValue * leftVolume;
            leftVolume = leftVolume + leftVolumeStep;
            secondRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[secondRightDestinationIndex] = destination[secondRightDestinationIndex] + sampleValue * rightVolume;
            rightVolume = rightVolume + rightVolumeStep;
            sampleValue = samples[samplePositionOrIndex++];
            thirdLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[thirdLeftDestinationIndex] = destination[thirdLeftDestinationIndex] + sampleValue * leftVolume;
            leftVolume = leftVolume + leftVolumeStep;
            thirdRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[thirdRightDestinationIndex] = destination[thirdRightDestinationIndex] + sampleValue * rightVolume;
            rightVolume = rightVolume + rightVolumeStep;
            sampleValue = samples[samplePositionOrIndex++];
            fourthLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[fourthLeftDestinationIndex] = destination[fourthLeftDestinationIndex] + sampleValue * leftVolume;
            leftVolume = leftVolume + leftVolumeStep;
            fourthRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[fourthRightDestinationIndex] = destination[fourthRightDestinationIndex] + sampleValue * rightVolume;
            rightVolume = rightVolume + rightVolumeStep;
        }
        destinationLimit += 6;
        while (destinationFrameOrSampleIndex < destinationLimit) {
            sampleValue = samples[samplePositionOrIndex++];
            tailLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[tailLeftDestinationIndex] = destination[tailLeftDestinationIndex] + sampleValue * leftVolume;
            leftVolume = leftVolume + leftVolumeStep;
            tailRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[tailRightDestinationIndex] = destination[tailRightDestinationIndex] + sampleValue * rightVolume;
            rightVolume = rightVolume + rightVolumeStep;
        }
        stream.currentLeftVolume = leftVolume >> 2;
        stream.currentRightVolume = rightVolume >> 2;
        stream.samplePositionFixed = samplePositionOrIndex << 8;
        return destinationFrameOrSampleIndex >> 1;
    }

    final static PcmSampleStream createForSampleStep(PcmSample sample, int sampleStepFixed, int volume, int pan) {
        if (sample.samples == null) {
            return null;
        }
        if (sample.samples.length != 0) {
            return new PcmSampleStream(sample, sampleStepFixed, volume, pan);
        }
        return null;
    }

    final synchronized int getPan() {
        return this.targetPan < 0 ? -1 : this.targetPan;
    }

    final synchronized boolean isSamplePositionOutOfRange() {
        return this.samplePositionFixed < 0 || this.samplePositionFixed >= ((PcmSample) ((Object) this.sample)).samples.length << 8;
    }

    final static PcmSampleStream createForPlaybackRate(PcmSample sample, int ratePercent, int volume) {
        if (sample.samples == null) {
            return null;
        }
        if (sample.samples.length != 0) {
            return new PcmSampleStream(sample, (int)((long)sample.sampleRateHz * 256L * (long)ratePercent / (long)(100 * AudioOutput.sampleRateHz)), volume << 6);
        }
        return null;
    }

    private PcmSampleStream(PcmSample sample, int sampleStepFixed, int volume) {
        this.sample = (AbstractAudioSample) ((Object) sample);
        this.loopStart = sample.loopStart;
        this.loopEnd = sample.loopEnd;
        this.pingPongLoop = sample.pingPongLoop;
        this.sampleStepFixed = sampleStepFixed;
        this.targetVolume = volume;
        this.targetPan = 8192;
        this.samplePositionFixed = 0;
        this.refreshCurrentVolumes();
    }

    private final static int mixForwardMonoInterpolated(int sampleValueOrBoundarySample, int sourceIndexOrBoundarySample, byte[] samples, int[] destination, int samplePositionFixed, int destinationIndex, int volume, int destinationLimit, int destinationEnd, int sampleBoundaryFixed, PcmSampleStream stream, int sampleStepFixed, int boundarySample) {
        int interiorDestinationIndex = 0;
        int boundaryDestinationIndex = 0;
        if (sampleStepFixed != 0) {
          destinationLimit = destinationIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 257) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || destinationIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 257) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        while (destinationIndex < destinationLimit) {
          sourceIndexOrBoundarySample = samplePositionFixed >> 8;
          sampleValueOrBoundarySample = samples[sourceIndexOrBoundarySample];
          interiorDestinationIndex = destinationIndex;
          destinationIndex++;
          destination[interiorDestinationIndex] = destination[interiorDestinationIndex] + (((sampleValueOrBoundarySample << 8) + (samples[sourceIndexOrBoundarySample + 1] - sampleValueOrBoundarySample) * (samplePositionFixed & 255)) * volume >> 6);
          samplePositionFixed = samplePositionFixed + sampleStepFixed;
        }
        if (sampleStepFixed != 0) {
          destinationLimit = destinationIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 1) / sampleStepFixed;
        }
        if (sampleStepFixed == 0 || destinationIndex + (sampleBoundaryFixed - samplePositionFixed + sampleStepFixed - 1) / sampleStepFixed > destinationEnd) {
          destinationLimit = destinationEnd;
        }
        sourceIndexOrBoundarySample = boundarySample;
        while (destinationIndex < destinationLimit) {
          sampleValueOrBoundarySample = samples[samplePositionFixed >> 8];
          boundaryDestinationIndex = destinationIndex;
          destinationIndex++;
          destination[boundaryDestinationIndex] = destination[boundaryDestinationIndex] + (((sampleValueOrBoundarySample << 8) + (sourceIndexOrBoundarySample - sampleValueOrBoundarySample) * (samplePositionFixed & 255)) * volume >> 6);
          samplePositionFixed = samplePositionFixed + sampleStepFixed;
        }
        stream.samplePositionFixed = samplePositionFixed;
        return destinationIndex;
    }

    private final static int mixReverseStereoAligned(int sampleValue, byte[] samples, int[] destination, int samplePositionOrIndex, int destinationFrameOrSampleIndex, int leftVolume, int rightVolume, int destinationLimit, int destinationEnd, int sampleBoundaryOrIndex, PcmSampleStream stream) {
        int firstLeftDestinationIndex = 0;
        int firstRightDestinationIndex = 0;
        int secondLeftDestinationIndex = 0;
        int secondRightDestinationIndex = 0;
        int thirdLeftDestinationIndex = 0;
        int thirdRightDestinationIndex = 0;
        int fourthLeftDestinationIndex = 0;
        int fourthRightDestinationIndex = 0;
        int tailLeftDestinationIndex = 0;
        int tailRightDestinationIndex = 0;
        samplePositionOrIndex = samplePositionOrIndex >> 8;
        sampleBoundaryOrIndex = sampleBoundaryOrIndex >> 8;
        leftVolume = leftVolume << 2;
        rightVolume = rightVolume << 2;
        destinationLimit = destinationFrameOrSampleIndex + samplePositionOrIndex - (sampleBoundaryOrIndex - 1);
        if (destinationFrameOrSampleIndex + samplePositionOrIndex - (sampleBoundaryOrIndex - 1) > destinationEnd) {
            destinationLimit = destinationEnd;
        }
        destinationFrameOrSampleIndex = destinationFrameOrSampleIndex << 1;
        destinationLimit = destinationLimit << 1;
        destinationLimit -= 6;
        while (destinationFrameOrSampleIndex < destinationLimit) {
            sampleValue = samples[samplePositionOrIndex--];
            firstLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[firstLeftDestinationIndex] = destination[firstLeftDestinationIndex] + sampleValue * leftVolume;
            firstRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[firstRightDestinationIndex] = destination[firstRightDestinationIndex] + sampleValue * rightVolume;
            sampleValue = samples[samplePositionOrIndex--];
            secondLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[secondLeftDestinationIndex] = destination[secondLeftDestinationIndex] + sampleValue * leftVolume;
            secondRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[secondRightDestinationIndex] = destination[secondRightDestinationIndex] + sampleValue * rightVolume;
            sampleValue = samples[samplePositionOrIndex--];
            thirdLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[thirdLeftDestinationIndex] = destination[thirdLeftDestinationIndex] + sampleValue * leftVolume;
            thirdRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[thirdRightDestinationIndex] = destination[thirdRightDestinationIndex] + sampleValue * rightVolume;
            sampleValue = samples[samplePositionOrIndex--];
            fourthLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[fourthLeftDestinationIndex] = destination[fourthLeftDestinationIndex] + sampleValue * leftVolume;
            fourthRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[fourthRightDestinationIndex] = destination[fourthRightDestinationIndex] + sampleValue * rightVolume;
        }
        destinationLimit += 6;
        while (destinationFrameOrSampleIndex < destinationLimit) {
            sampleValue = samples[samplePositionOrIndex--];
            tailLeftDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[tailLeftDestinationIndex] = destination[tailLeftDestinationIndex] + sampleValue * leftVolume;
            tailRightDestinationIndex = destinationFrameOrSampleIndex;
            destinationFrameOrSampleIndex++;
            destination[tailRightDestinationIndex] = destination[tailRightDestinationIndex] + sampleValue * rightVolume;
        }
        stream.samplePositionFixed = samplePositionOrIndex << 8;
        return destinationFrameOrSampleIndex >> 1;
    }

    private PcmSampleStream(PcmSample sample, int sampleStepFixed, int volume, int pan) {
        this.sample = (AbstractAudioSample) ((Object) sample);
        this.loopStart = sample.loopStart;
        this.loopEnd = sample.loopEnd;
        this.pingPongLoop = sample.pingPongLoop;
        this.sampleStepFixed = sampleStepFixed;
        this.targetVolume = volume;
        this.targetPan = pan;
        this.samplePositionFixed = 0;
        this.refreshCurrentVolumes();
    }
}
