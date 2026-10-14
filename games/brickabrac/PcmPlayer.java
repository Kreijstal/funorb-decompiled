/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PcmPlayer {
    int[] samples;
    private int workLimit;
    static int sampleRate;
    private long lastMixTimeMillis;
    private AudioStream rootStream;
    private static int serviceThreadPriority;
    private static PcmPlayerService service;
    private boolean closed;
    static boolean stereo;
    private int framesUntilScheduling;
    private long reopenAtMillis;
    private AudioStream[] priorityHeads;
    private int previousMaximumDrainFrames;
    private int lastQueuedFrames;
    private int latencyAdjustmentFrames;
    private AudioStream[] priorityTails;
    private int capacityFrames;
    private long nextCheckMillis;
    private int maximumDrainFrames;
    private boolean justOpened;
    private int requestedLatencyFrames;

    void flushDevice() throws Exception {
    }

    final synchronized void pump() {
        try {
          Throwable caughtFailure = null;
          long nowMillis = 0L;
          Exception deviceOrClockFailure = null;
          int queuedFrames = 0;
          int targetFrames = 0;
          if (this.closed) {
            return;
          }
          nowMillis = MonotonicTime.nowMillis(false);
          try {
            if (nowMillis > this.lastMixTimeMillis + 6000L) {
              this.lastMixTimeMillis = nowMillis - 6000L;
            }
            while (nowMillis > this.lastMixTimeMillis + 5000L) {
              this.skipFrames(256);
              this.lastMixTimeMillis = this.lastMixTimeMillis + (long)(256000 / sampleRate);
              nowMillis = MonotonicTime.nowMillis(false);
            }
          } catch (java.lang.Exception clockFailure) {
            caughtFailure = clockFailure;
            deviceOrClockFailure = (Exception) (Object) caughtFailure;
            this.lastMixTimeMillis = nowMillis;
          }
          if (this.samples == null) {
            return;
          }
          try {
            if (this.reopenAtMillis != 0L) {
              if (nowMillis < this.reopenAtMillis) {
                return;
              }
              this.openDevice(this.capacityFrames);
              this.reopenAtMillis = 0L;
              this.justOpened = true;
            }
            queuedFrames = this.getQueuedFrames();
            if (this.lastQueuedFrames - queuedFrames > this.maximumDrainFrames) {
              this.maximumDrainFrames = this.lastQueuedFrames - queuedFrames;
            }
            targetFrames = this.requestedLatencyFrames + this.latencyAdjustmentFrames;
            if (targetFrames + 256 > 16384) {
              targetFrames = 16128;
            }
            if (targetFrames + 256 > this.capacityFrames) {
              this.capacityFrames = this.capacityFrames + 1024;
              if (this.capacityFrames > 16384) {
                this.capacityFrames = 16384;
              }
              this.closeDevice();
              this.openDevice(this.capacityFrames);
              queuedFrames = 0;
              this.justOpened = true;
              if (targetFrames + 256 > this.capacityFrames) {
                targetFrames = this.capacityFrames - 256;
                this.latencyAdjustmentFrames = targetFrames - this.requestedLatencyFrames;
              }
            }
            while (queuedFrames < targetFrames) {
              this.fillSamples(this.samples, 256);
              this.writeDevice();
              queuedFrames += 256;
            }
            if (nowMillis > this.nextCheckMillis) {
              if (this.justOpened) {
                this.justOpened = false;
              } else {
                if (this.maximumDrainFrames == 0 &&
                  this.previousMaximumDrainFrames == 0) {
                  this.closeDevice();
                  this.reopenAtMillis = nowMillis + 2000L;
                  return;
                }
                this.latencyAdjustmentFrames = Math.min(this.previousMaximumDrainFrames, this.maximumDrainFrames);
                this.previousMaximumDrainFrames = this.maximumDrainFrames;
              }
              this.maximumDrainFrames = 0;
              this.nextCheckMillis = nowMillis + 2000L;
            }
            this.lastQueuedFrames = queuedFrames;
          } catch (java.lang.Exception deviceFailure) {
            caughtFailure = deviceFailure;
            deviceOrClockFailure = (Exception) (Object) caughtFailure;
            this.closeDevice();
            this.reopenAtMillis = nowMillis + 2000L;
          }
          return;
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    private final void fillSamples(int[] output, int frameCount) {
        int sampleCount;
        int scheduledWork;
        int bucketMask;
        int scanPass;
        int bucket;
        Object remainingStream;
        int soundWorkThreshold;
        AudioStream[] headArray;
        int bucketFlags;
        Object previousStream;
        AudioStream stream;
        AudioData sound;
        int streamCost;
        AudioStream initialStream;
        int parentPriority;
        AudioStream nextStream;
        int cleanupBucket;
        int cleanupIndex;
        Object nextRemainingStream;
        AudioStream initialStreamAlias;
        AudioStream child;
        sampleCount = frameCount;
        if (stereo) {
          sampleCount = sampleCount << 1;
        }
        ArrayOperations.clearInts(output, 0, sampleCount);
        this.framesUntilScheduling = this.framesUntilScheduling - frameCount;
        if (this.rootStream != null &&
          this.framesUntilScheduling <= 0) {
          this.framesUntilScheduling = this.framesUntilScheduling + (sampleRate >> 4);
          PcmPlayer.resetSchedulingTree(this.rootStream);
          this.enqueueStream(this.rootStream, this.rootStream.getPriority());
          scheduledWork = 0;
          bucketMask = 255;
          scanPass = 7;
          scanLoop1: while (true) {
            if (bucketMask != 0) {
              if (scanPass >= 0) {
                bucket = scanPass;
                soundWorkThreshold = 0;
              } else {
                bucket = scanPass & 3;
                soundWorkThreshold = -(scanPass >> 2);
              }
              bucketFlags = bucketMask >>> bucket & 286331153;
              while (bucketFlags != 0) {
                if ((bucketFlags & 1) != 0) {
                  bucketMask = bucketMask & ~(1 << bucket);
                  previousStream = null;
                  stream = this.priorityHeads[bucket];
                  initialStream = stream;
                  initialStreamAlias = stream;
                  while (stream != null) {
                    sound = stream.data;
                    if (sound != null &&
                      sound.schedulerUsage > soundWorkThreshold) {
                      bucketMask = bucketMask | 1 << bucket;
                      previousStream = stream;
                      stream = stream.schedulerNext;
                      continue;
                    }
                    stream.enabled = true;
                    streamCost = stream.getSchedulingCost();
                    scheduledWork = scheduledWork + streamCost;
                    if (sound != null) {
                      sound.schedulerUsage = sound.schedulerUsage + streamCost;
                    }
                    if (scheduledWork >= this.workLimit) {
                      break scanLoop1;
                    }
                    child = stream.firstSubStream();
                    if (child != null) {
                      parentPriority = stream.schedulerPriority;
                      while (child != null) {
                        this.enqueueStream(child, parentPriority * child.getPriority() >> 8);
                        child = stream.nextSubStream();
                      }
                    }
                    nextStream = stream.schedulerNext;
                    stream.schedulerNext = null;
                    if (previousStream != null) {
                      ((AudioStream) (previousStream)).schedulerNext = nextStream;
                    } else {
                      this.priorityHeads[bucket] = nextStream;
                    }
                    if (nextStream == null) {
                      this.priorityTails[bucket] = (AudioStream) (previousStream);
                    }
                    stream = nextStream;
                  }
                }
                bucket += 4;
                soundWorkThreshold++;
                bucketFlags = bucketFlags >>> 4;
              }
              scanPass--;
              continue;
            }
            break;
          }
          for (cleanupBucket = 0; cleanupBucket < 8; cleanupBucket++) {
            remainingStream = this.priorityHeads[cleanupBucket];
            headArray = this.priorityHeads;
            cleanupIndex = cleanupBucket;
            this.priorityTails[cleanupBucket] = null;
            headArray[cleanupIndex] = null;
            while (remainingStream != null) {
              nextRemainingStream = ((AudioStream) (remainingStream)).schedulerNext;
              ((AudioStream) (remainingStream)).schedulerNext = null;
              remainingStream = nextRemainingStream;
            }
          }
        }
        if (this.framesUntilScheduling < 0) {
          this.framesUntilScheduling = 0;
        }
        if (this.rootStream != null) {
          this.rootStream.fill(output, 0, frameCount);
        }
        this.lastMixTimeMillis = MonotonicTime.nowMillis(false);
    }

    public static void clearServiceReference() {
        service = null;
    }

    private final void enqueueStream(AudioStream stream, int priority) {
        int bucket = priority >> 5;
        AudioStream tail = this.priorityTails[bucket];
        if (tail == null) {
          this.priorityHeads[bucket] = stream;
        } else {
          tail.schedulerNext = stream;
        }
        this.priorityTails[bucket] = stream;
        stream.schedulerPriority = priority;
    }

    final static void configureOutput(int requestedSampleRate, boolean stereoEnabled, int workerPriority) {
        if (requestedSampleRate < 8000 ||
          requestedSampleRate > 48000) {
          throw new IllegalArgumentException();
        }
        sampleRate = requestedSampleRate;
        stereo = stereoEnabled ? true : false;
        serviceThreadPriority = workerPriority;
    }

    void initDevice(java.awt.Component component) throws Exception {
    }

    void writeDevice() throws Exception {
    }

    final static PcmPlayer create(PlatformServices services, java.awt.Component component, int playerIndex, int requestedLatencyFrames) {
        try {
          JavaSoundPcmPlayer player = null;
          Throwable backendFailure = null;
          JavaSoundPcmPlayer createdPlayer = null;
          JavaSoundPcmPlayer sampleBufferOwner = null;
          int blockFrames = 0;
          int channels = 0;
          JavaSoundPcmPlayer resultPlayer = null;
          Throwable caughtFailure = null;
          if (sampleRate == 0) {
            throw new IllegalStateException();
          }
          if (playerIndex >= 0 &&
            playerIndex < 2) {
            if (requestedLatencyFrames < 256) {
              requestedLatencyFrames = 256;
            }
            try {
              createdPlayer = new JavaSoundPcmPlayer();
              player = createdPlayer;
              sampleBufferOwner = player;
              blockFrames = 256;
              if (!stereo) {
                channels = 1;
              } else {
                channels = 2;
              }
              ((PcmPlayer) ((Object) sampleBufferOwner)).samples = new int[blockFrames * channels];
              ((PcmPlayer) ((Object) player)).requestedLatencyFrames = requestedLatencyFrames;
              ((PcmPlayer) ((Object) player)).initDevice(component);
              ((PcmPlayer) ((Object) player)).capacityFrames = (requestedLatencyFrames & -1024) + 1024;
              if (((PcmPlayer) ((Object) player)).capacityFrames > 16384) {
                ((PcmPlayer) ((Object) player)).capacityFrames = 16384;
              }
              ((PcmPlayer) ((Object) player)).openDevice(((PcmPlayer) ((Object) player)).capacityFrames);
              if (serviceThreadPriority > 0 &&
                service == null) {
                service = new PcmPlayerService();
                service.platformServices = services;
                services.startThread(serviceThreadPriority, (Runnable) ((Object) service), (byte) -94);
              }
              if (service != null) {
                if (service.players[playerIndex] != null) {
                  throw new IllegalArgumentException();
                }
                service.players[playerIndex] = (PcmPlayer) ((Object) createdPlayer);
              }
              resultPlayer = player;
              return (PcmPlayer) ((Object) resultPlayer);
            } catch (java.lang.Throwable creationFailure) {
              caughtFailure = creationFailure;
              backendFailure = caughtFailure;
              return new PcmPlayer();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    private final static void resetSchedulingTree(AudioStream stream) {
        stream.enabled = false;
        if (stream.data != null) {
          stream.data.schedulerUsage = 0;
        }
        AudioStream child = stream.firstSubStream();
        while (child != null) {
          PcmPlayer.resetSchedulingTree(child);
          child = stream.nextSubStream();
        }
    }

    void closeDevice() {
    }

    final synchronized void setRootStream(AudioStream stream) {
        this.rootStream = stream;
    }

    void openDevice(int capacityFrames) throws Exception {
    }

    final synchronized void shutdown() {
        int playerIndex = 0;
        int serviceEmpty;
        if (service != null) {
          serviceEmpty = 1;
          for (playerIndex = 0; playerIndex < 2; playerIndex++) {
            if (service.players[playerIndex] == this) {
              service.players[playerIndex] = null;
            }
            if (service.players[playerIndex] != null) {
              serviceEmpty = 0;
            }
          }
          if (serviceEmpty != 0) {
            service.stopRequested = true;
            while (service.running) {
              wj.sleepMillis(-125, 50L);
            }
            service = null;
          }
        }
        this.closeDevice();
        this.samples = null;
        this.closed = true;
    }

    private final void skipFrames(int frameCount) {
        this.framesUntilScheduling = this.framesUntilScheduling - frameCount;
        if (this.framesUntilScheduling < 0) {
          this.framesUntilScheduling = 0;
        }
        if (this.rootStream != null) {
          this.rootStream.skip(frameCount);
          return;
        }
    }

    int getQueuedFrames() throws Exception {
        return this.capacityFrames;
    }

    final synchronized void flush() {
        try {
          this.justOpened = true;
          try {
            this.flushDevice();
          } catch (Exception flushFailure) {
            this.closeDevice();
            this.reopenAtMillis = MonotonicTime.nowMillis(false) + 2000L;
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    PcmPlayer() {
        this.workLimit = 32;
        this.closed = false;
        this.lastMixTimeMillis = MonotonicTime.nowMillis(false);
        this.reopenAtMillis = 0L;
        this.priorityHeads = new AudioStream[8];
        this.nextCheckMillis = 0L;
        this.priorityTails = new AudioStream[8];
        this.framesUntilScheduling = 0;
        this.previousMaximumDrainFrames = 0;
        this.justOpened = true;
        this.lastQueuedFrames = 0;
        this.maximumDrainFrames = 0;
    }
}
