/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    static boolean stereoEnabled;
    private static AudioService sharedAudioService;
    private long streamTimeMillis;
    private boolean disposed;
    private int schedulingWorkLimit;
    int[] mixBuffer;
    private static int serviceThreadPriority;
    private PcmStream rootStream;
    static int sampleRateHz;
    private PcmStream[] priorityQueueHeads;
    private int bufferCapacityFrames;
    private int previousMaxDrainedFrames;
    private long nextDrainCheckMillis;
    private int lastBufferedFrames;
    private boolean skipNextDrainCheck;
    private long reopenAtMillis;
    private int framesUntilReschedule;
    private PcmStream[] priorityQueueTails;
    private int adaptiveBufferFrames;
    private int maxDrainedFrames;
    private int requestedBufferFrames;

    void writeMixBlock() throws Exception {
    }

    final static AudioOutput createOutput(PlatformTaskDispatcher taskDispatcher, java.awt.Component component, int outputSlot, int requestedBufferFrames) {
        try {
            JavaSoundAudioOutput output = null;
            Throwable ignoredOutputFailure = null;
            JavaSoundAudioOutput allocatedOutput = null;
            JavaSoundAudioOutput outputBeforeBufferAllocation = null;
            int mixBlockFrames = 0;
            int channelCount = 0;
            JavaSoundAudioOutput outputBeforeReturn = null;
            Throwable caughtOutputFailure = null;
            if (sampleRateHz == 0) {
              throw new IllegalStateException();
            }
            if ((outputSlot >= 0) &&
                (outputSlot < 2)) {
              if (requestedBufferFrames < 256) {
                requestedBufferFrames = 256;
              }
              try {
                allocatedOutput = new JavaSoundAudioOutput();
                output = allocatedOutput;
                outputBeforeBufferAllocation = output;
                mixBlockFrames = 256;
                if (!stereoEnabled) {
                  channelCount = 1;
                } else {
                  channelCount = 2;
                }
                ((AudioOutput) ((Object) outputBeforeBufferAllocation)).mixBuffer = new int[mixBlockFrames * channelCount];
                ((AudioOutput) ((Object) output)).requestedBufferFrames = requestedBufferFrames;
                ((AudioOutput) ((Object) output)).initializeDevice(component);
                ((AudioOutput) ((Object) output)).bufferCapacityFrames = (requestedBufferFrames & -1024) + 1024;
                if (((AudioOutput) ((Object) output)).bufferCapacityFrames > 16384) {
                  ((AudioOutput) ((Object) output)).bufferCapacityFrames = 16384;
                }
                ((AudioOutput) ((Object) output)).openDevice(((AudioOutput) ((Object) output)).bufferCapacityFrames);
                if ((serviceThreadPriority > 0) &&
                    (sharedAudioService == null)) {
                  sharedAudioService = new AudioService();
                  sharedAudioService.taskDispatcher = taskDispatcher;
                  taskDispatcher.startThread((Runnable) ((Object) sharedAudioService), 0, serviceThreadPriority);
                }
                if (sharedAudioService != null) {
                  if (sharedAudioService.outputs[outputSlot] != null) {
                    throw new IllegalArgumentException();
                  }
                  sharedAudioService.outputs[outputSlot] = (AudioOutput) ((Object) allocatedOutput);
                }
                outputBeforeReturn = output;
                return (AudioOutput) ((Object) outputBeforeReturn);
              } catch (java.lang.Throwable outputCreationFailure) {
                caughtOutputFailure = outputCreationFailure;
                ignoredOutputFailure = caughtOutputFailure;
                return new AudioOutput();
              }
            }
            throw new IllegalArgumentException();
        } catch (RuntimeException | Error uncheckedOutputFailure) {
            throw uncheckedOutputFailure;
        } catch (Throwable checkedOutputFailure) {
            throw new RuntimeException(checkedOutputFailure);
        }
    }

    final synchronized void flushAndMarkDrainCheck() {
        try {
            this.skipNextDrainCheck = true;
            try {
                this.flushDevice();
            } catch (Exception flushFailure) {
                this.closeDevice();
                this.reopenAtMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520) + 2000L;
            }
        } catch (RuntimeException | Error uncheckedFlushFailure) {
            throw uncheckedFlushFailure;
        } catch (Throwable checkedFlushFailure) {
            throw new RuntimeException(checkedFlushFailure);
        }
    }

    void openDevice(int capacityFrames) throws Exception {
    }

    final synchronized void dispose() {
        int outputSlot = 0;
        int allOutputsRemovedInt;
        if (sharedAudioService != null) {
          allOutputsRemovedInt = 1;
          for (outputSlot = 0; outputSlot < 2; outputSlot++) {
            if (sharedAudioService.outputs[outputSlot] == this) {
              sharedAudioService.outputs[outputSlot] = null;
            }
            if (sharedAudioService.outputs[outputSlot] == null) {
              continue;
            }
            allOutputsRemovedInt = 0;
          }
          if ((allOutputsRemovedInt != 0)) {
            sharedAudioService.stopRequested = true;
            while (sharedAudioService.running) {
              ByteTextDecodingSupport.sleepMillis(0, 50L);
            }
            sharedAudioService = null;
          }
        }
        this.closeDevice();
        this.mixBuffer = null;
        this.disposed = true;
    }

    final synchronized void setRootStream(PcmStream stream) {
        this.rootStream = stream;
    }

    void flushDevice() throws Exception {
    }

    private final static void resetStreamScheduling(PcmStream stream) {
        stream.activeForMixing = false;
        if (stream.sample != null) {
            stream.sample.scheduledWork = 0;
        }
        PcmStream childStream = stream.firstChildStream();
        while (childStream != null) {
            AudioOutput.resetStreamScheduling(childStream);
            childStream = stream.nextChildStream();
        }
    }

    public static void releaseSharedAudioServiceReference() {
        sharedAudioService = null;
    }

    final static void configureAudio(int sampleRate, boolean stereo, int threadPriority) {
        if (sampleRate < 8000 || sampleRate > 48000) {
            throw new IllegalArgumentException();
        }
        sampleRateHz = sampleRate;
        stereoEnabled = stereo ? true : false;
        serviceThreadPriority = threadPriority;
    }

    final synchronized void serviceOutput() {
        try {
            Throwable caughtServiceFailure = null;
            long nowMillis = 0L;
            Exception serviceFailure = null;
            int queuedFrames = 0;
            int targetFrames = 0;
            if (this.disposed) {
              return;
            }
            nowMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520);
            try {
              if (nowMillis > this.streamTimeMillis + 6000L) {
                this.streamTimeMillis = nowMillis - 6000L;
              }
              while (nowMillis > this.streamTimeMillis + 5000L) {
                this.skipFrames(256);
                this.streamTimeMillis = this.streamTimeMillis + (long)(256000 / sampleRateHz);
                nowMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520);
              }
            } catch (java.lang.Exception catchUpFailure) {
              caughtServiceFailure = catchUpFailure;
              serviceFailure = (Exception) (Object) caughtServiceFailure;
              this.streamTimeMillis = nowMillis;
            }
            if (this.mixBuffer == null) {
              return;
            }
            try {
              if (this.reopenAtMillis != 0L) {
                if (nowMillis < this.reopenAtMillis) {
                  return;
                }
                this.openDevice(this.bufferCapacityFrames);
                this.reopenAtMillis = 0L;
                this.skipNextDrainCheck = true;
              }
              queuedFrames = this.getQueuedFrames();
              if (this.lastBufferedFrames - queuedFrames > this.maxDrainedFrames) {
                this.maxDrainedFrames = this.lastBufferedFrames - queuedFrames;
              }
              targetFrames = this.requestedBufferFrames + this.adaptiveBufferFrames;
              if (targetFrames + 256 > 16384) {
                targetFrames = 16128;
              }
              if (targetFrames + 256 > this.bufferCapacityFrames) {
                this.bufferCapacityFrames = this.bufferCapacityFrames + 1024;
                if (this.bufferCapacityFrames > 16384) {
                  this.bufferCapacityFrames = 16384;
                }
                this.closeDevice();
                this.openDevice(this.bufferCapacityFrames);
                queuedFrames = 0;
                this.skipNextDrainCheck = true;
                if (targetFrames + 256 > this.bufferCapacityFrames) {
                  targetFrames = this.bufferCapacityFrames - 256;
                  this.adaptiveBufferFrames = targetFrames - this.requestedBufferFrames;
                }
              }
              while (queuedFrames < targetFrames) {
                this.mixBlock(this.mixBuffer, 256);
                this.writeMixBlock();
                queuedFrames += 256;
              }
              if (nowMillis > this.nextDrainCheckMillis) {
                if (this.skipNextDrainCheck) {
                  this.skipNextDrainCheck = false;
                } else {
                  if ((this.maxDrainedFrames == 0) &&
                      (this.previousMaxDrainedFrames == 0)) {
                    this.closeDevice();
                    this.reopenAtMillis = nowMillis + 2000L;
                    return;
                  }
                  this.adaptiveBufferFrames = Math.min(this.previousMaxDrainedFrames, this.maxDrainedFrames);
                  this.previousMaxDrainedFrames = this.maxDrainedFrames;
                }
                this.maxDrainedFrames = 0;
                this.nextDrainCheckMillis = nowMillis + 2000L;
              }
              this.lastBufferedFrames = queuedFrames;
            } catch (java.lang.Exception deviceServiceFailure) {
              caughtServiceFailure = deviceServiceFailure;
              serviceFailure = (Exception) (Object) caughtServiceFailure;
              this.closeDevice();
              this.reopenAtMillis = nowMillis + 2000L;
            }
            return;
        } catch (RuntimeException | Error uncheckedServiceFailure) {
            throw uncheckedServiceFailure;
        } catch (Throwable checkedServiceFailure) {
            throw new RuntimeException(checkedServiceFailure);
        }
    }

    private final void enqueueByPriority(PcmStream stream, int priority) {
        int priorityBucket = priority >> 5;
        PcmStream previousTail = this.priorityQueueTails[priorityBucket];
        if (previousTail == null) {
            this.priorityQueueHeads[priorityBucket] = stream;
        } else {
            previousTail.scheduledNextStream = stream;
        }
        this.priorityQueueTails[priorityBucket] = stream;
        stream.scheduledPriority = priority;
    }

    private final void mixBlock(int[] destination, int frameCount) {
        int sampleCount;
        int scheduledWork;
        int pendingBuckets;
        int priorityPassThenCleanupBucket;
        int priorityBucket;
        Object cleanupStream;
        int sampleWorkThreshold;
        PcmStream[] queueHeadsAlias;
        int bucketMaskThenCleanupIndex;
        Object previousStreamOrNextCleanupStream;
        PcmStream stream;
        AbstractAudioSample sample;
        int streamWork;
        PcmStream childStream;
        int parentPriority;
        PcmStream nextStream;
        sampleCount = frameCount;
        if (stereoEnabled) {
          sampleCount = sampleCount << 1;
        }
        ArrayOperations.clearInts(destination, 0, sampleCount);
        this.framesUntilReschedule = this.framesUntilReschedule - frameCount;
        if ((this.rootStream != null) &&
            (this.framesUntilReschedule <= 0)) {
          this.framesUntilReschedule = this.framesUntilReschedule + (sampleRateHz >> 4);
          AudioOutput.resetStreamScheduling(this.rootStream);
          this.enqueueByPriority(this.rootStream, this.rootStream.getSchedulingPriority());
          scheduledWork = 0;
          pendingBuckets = 255;
          priorityPassThenCleanupBucket = 7;
          while (true) {
            streamSelection: {
              if (pendingBuckets != 0) {
                if (priorityPassThenCleanupBucket >= 0) {
                  priorityBucket = priorityPassThenCleanupBucket;
                  sampleWorkThreshold = 0;
                } else {
                  priorityBucket = priorityPassThenCleanupBucket & 3;
                  sampleWorkThreshold = -(priorityPassThenCleanupBucket >> 2);
                }
                bucketMaskThenCleanupIndex = pendingBuckets >>> priorityBucket & 286331153;
                while (bucketMaskThenCleanupIndex != 0) {
                  if ((bucketMaskThenCleanupIndex & 1) != 0) {
                    pendingBuckets = pendingBuckets & ~(1 << priorityBucket);
                    previousStreamOrNextCleanupStream = null;
                    stream = this.priorityQueueHeads[priorityBucket];
                    childStream = stream;
                    childStream = stream;
                    while ((stream != null)) {
                      sample = stream.sample;
                      if ((sample != null) &&
                          (sample.scheduledWork > sampleWorkThreshold)) {
                        pendingBuckets = pendingBuckets | 1 << priorityBucket;
                        previousStreamOrNextCleanupStream = stream;
                        stream = stream.scheduledNextStream;
                        continue;
                      }
                      stream.activeForMixing = true;
                      streamWork = stream.getSchedulingCost();
                      scheduledWork = scheduledWork + streamWork;
                      if (sample != null) {
                        sample.scheduledWork = sample.scheduledWork + streamWork;
                      }
                      if (scheduledWork >= this.schedulingWorkLimit) {
                        break streamSelection;
                      }
                      childStream = stream.firstChildStream();
                      if (childStream != null) {
                        parentPriority = stream.scheduledPriority;
                        while (childStream != null) {
                          this.enqueueByPriority(childStream, parentPriority * childStream.getSchedulingPriority() >> 8);
                          childStream = stream.nextChildStream();
                        }
                      }
                      nextStream = stream.scheduledNextStream;
                      stream.scheduledNextStream = null;
                      if (previousStreamOrNextCleanupStream != null) {
                        ((PcmStream) (previousStreamOrNextCleanupStream)).scheduledNextStream = nextStream;
                      } else {
                        this.priorityQueueHeads[priorityBucket] = nextStream;
                      }
                      if (nextStream == null) {
                        this.priorityQueueTails[priorityBucket] = (PcmStream) (previousStreamOrNextCleanupStream);
                      }
                      stream = nextStream;
                      continue;
                    }
                  }
                  priorityBucket += 4;
                  sampleWorkThreshold++;
                  bucketMaskThenCleanupIndex = bucketMaskThenCleanupIndex >>> 4;
                }
                priorityPassThenCleanupBucket--;
                continue;
              }
            }
            break;
          }
          for (priorityPassThenCleanupBucket = 0; priorityPassThenCleanupBucket < 8; priorityPassThenCleanupBucket++) {
            cleanupStream = this.priorityQueueHeads[priorityPassThenCleanupBucket];
            queueHeadsAlias = this.priorityQueueHeads;
            bucketMaskThenCleanupIndex = priorityPassThenCleanupBucket;
            this.priorityQueueTails[priorityPassThenCleanupBucket] = null;
            queueHeadsAlias[bucketMaskThenCleanupIndex] = null;
            while (cleanupStream != null) {
              previousStreamOrNextCleanupStream = ((PcmStream) (cleanupStream)).scheduledNextStream;
              ((PcmStream) (cleanupStream)).scheduledNextStream = null;
              cleanupStream = previousStreamOrNextCleanupStream;
            }
          }
        }
        if (this.framesUntilReschedule < 0) {
          this.framesUntilReschedule = 0;
        }
        if (this.rootStream != null) {
          this.rootStream.mixInto(destination, 0, frameCount);
        }
        this.streamTimeMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520);
    }

    private final void skipFrames(int frameCount) {
        this.framesUntilReschedule = this.framesUntilReschedule - frameCount;
        if (this.framesUntilReschedule < 0) {
            this.framesUntilReschedule = 0;
        }
        if (this.rootStream != null) {
            this.rootStream.skipFrames(frameCount);
            return;
        }
    }

    void initializeDevice(java.awt.Component unusedComponent) throws Exception {
    }

    int getQueuedFrames() throws Exception {
        return this.bufferCapacityFrames;
    }

    void closeDevice() {
    }

    AudioOutput() {
        this.disposed = false;
        this.schedulingWorkLimit = 32;
        this.streamTimeMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520);
        this.skipNextDrainCheck = true;
        this.priorityQueueHeads = new PcmStream[8];
        this.lastBufferedFrames = 0;
        this.nextDrainCheckMillis = 0L;
        this.previousMaxDrainedFrames = 0;
        this.reopenAtMillis = 0L;
        this.maxDrainedFrames = 0;
        this.framesUntilReschedule = 0;
        this.priorityQueueTails = new PcmStream[8];
    }
}
