/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedArchiveProvider extends ArchiveProvider {
    private ArchiveDiskWorker diskWorker;
    private int expectedIndexCrc;
    private NodeHashTable requests;
    private ArchiveIndex index;
    private ArchiveDisk archiveDisk;
    private int archiveId;
    private ArchiveDisk indexDisk;
    static Widget field_s;
    private byte[] expectedIndexDigest;
    private int expectedIndexVersion;
    private NetworkArchiveClient field_g;
    private byte[] groupDiskStatus;
    private ArchiveRequest indexRequest;
    private boolean validatingDiskGroups;
    private IntrusiveDeque prefetchQueue;
    private IntrusiveDeque backgroundQueue;
    private int backgroundGroupIndex;
    private boolean prefetchingGroups;
    private long nextRequestCleanupTime;
    private boolean field_m;

    final ArchiveIndex fetchIndex(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = VoidHunters.field_G;
        if (this.index != null) {
          return this.index;
        }
        if (null == this.indexRequest) {
          if (this.field_g.isPriorityQueueFull(126)) {
            return null;
          }
          this.indexRequest = (ArchiveRequest) ((Object) this.field_g.requestGroup(true, param0 ^ -30, this.archiveId, (byte) 0, 255));
        }
        if (this.indexRequest.pending) {
          return null;
        }
        if (param0 != 9) {
          return (ArchiveIndex) null;
        }
        var7 = this.indexRequest.getData(param0 ^ -97);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.indexRequest instanceof DiskArchiveRequest)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.index = new ArchiveIndex(var7, this.expectedIndexCrc, this.expectedIndexDigest);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_g.resetAfterValidationFailure((byte) -25);
            this.index = null;
            if (this.field_g.isPriorityQueueFull(param0 ^ 89)) {
              this.indexRequest = null;
            } else {
              this.indexRequest = (ArchiveRequest) ((Object) this.field_g.requestGroup(true, param0 - 30, this.archiveId, (byte) 0, 255));
            }
            return null;
          }
          if (null != this.indexDisk) {
            this.diskWorker.enqueueWrite(this.indexDisk, var7, (byte) 92, this.archiveId);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.index = new ArchiveIndex(var7, this.expectedIndexCrc, this.expectedIndexDigest);
            if (this.index.version != this.expectedIndexVersion) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.index = null;
            if (this.field_g.isPriorityQueueFull(121)) {
              this.indexRequest = null;
            } else {
              this.indexRequest = (ArchiveRequest) ((Object) this.field_g.requestGroup(true, -21, this.archiveId, (byte) 0, 255));
            }
            return null;
          }
        }
        this.indexRequest = null;
        if (null != this.archiveDisk) {
          this.groupDiskStatus = new byte[this.index.groupCapacity];
        }
        return this.index;
    }

    final int getGroupLoadPercent(int param0, boolean param1) {
        ArchiveRequest var3 = (ArchiveRequest) (this.requests.get((long)param0, 122));
        if (var3 != null) {
          return var3.getLoadPercent((byte) -4);
        }
        if (param1) {
          CachedArchiveProvider.clearSharedReferences((byte) 114);
        }
        return 0;
    }

    final void processBackgroundRequests(int param0) {
        ArchiveRequest discarded$3 = null;
        ArchiveRequest discarded$2 = null;
        ArchiveRequest discarded$1 = null;
        ArchiveRequest discarded$0 = null;
        int var2_int;
        ArchiveRequest var2;
        IntrusiveNode var3;
        int var4;
        int var5;
        IntrusiveNode var6;
        IntrusiveNode var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        ArchiveRequest var2Lifetime1;
        IntrusiveNode var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder2 = true;
        var5 = VoidHunters.field_G;
        if (this.backgroundQueue != null) {
          if (this.fetchIndex((byte) 9) == null) {
            return;
          }
          if (this.validatingDiskGroups) {
            var2_int = 1;
            var3 = this.backgroundQueue.first(0);
            while (var3 != null) {
              var4 = (int)var3.key;
              if (this.groupDiskStatus[var4] == 0) {
                discarded$3 = this.fetchGroupRequest(1, -26489, var4);
              }
              if (this.groupDiskStatus[var4] != 0) {
                var3.unlink(-3846);
              } else {
                var2_int = 0;
              }
              var3 = this.backgroundQueue.next((byte) 80);
            }
            scanLoop1: while (true) {
              if (this.index.groupFileCounts.length > this.backgroundGroupIndex) {
                if (0 != this.index.groupFileCounts[this.backgroundGroupIndex]) {
                  if (this.diskWorker.pendingCount >= 250) {
                    var2_int = 0;
                    break scanLoop1;
                  }
                  if (this.groupDiskStatus[this.backgroundGroupIndex] == 0) {
                    discarded$2 = this.fetchGroupRequest(1, -26489, this.backgroundGroupIndex);
                  }
                  if (this.groupDiskStatus[this.backgroundGroupIndex] == 0) {
                    var6 = new IntrusiveNode();
                    var6.key = (long)this.backgroundGroupIndex;
                    var2_int = 0;
                    this.backgroundQueue.addLast(-10258, var6);
                  }
                }
                this.backgroundGroupIndex = this.backgroundGroupIndex + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.validatingDiskGroups = false;
              this.backgroundGroupIndex = 0;
            }
            decompiledFrameRemainder2 = false;
          }
          else {
            if (this.prefetchingGroups) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.backgroundQueue.first(0);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.key;
                if (this.groupDiskStatus[var4Lifetime1] != 1) {
                  discarded$1 = this.fetchGroupRequest(2, -26489, var4Lifetime1);
                }
                if (this.groupDiskStatus[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.unlink(-3846);
                }
                var3Lifetime1 = this.backgroundQueue.next((byte) 121);
              }
              scanLoop2: while (true) {
                if (this.backgroundGroupIndex < this.index.groupFileCounts.length) {
                  if (this.index.groupFileCounts[this.backgroundGroupIndex] != 0) {
                    if (this.field_g.isBackgroundQueueFull((byte) 32)) {
                      var2_intLifetime1 = 0;
                      break scanLoop2;
                    }
                    if (this.groupDiskStatus[this.backgroundGroupIndex] != 1) {
                      discarded$0 = this.fetchGroupRequest(2, -26489, this.backgroundGroupIndex);
                    }
                    if (1 != this.groupDiskStatus[this.backgroundGroupIndex]) {
                      var7 = new IntrusiveNode();
                      var7.key = (long)this.backgroundGroupIndex;
                      this.backgroundQueue.addLast(-10258, var7);
                      var2_intLifetime1 = 0;
                    }
                  }
                  this.backgroundGroupIndex = this.backgroundGroupIndex + 1;
                  continue;
                }
                break;
              }
              if (var2_intLifetime1 != 0) {
                this.backgroundGroupIndex = 0;
                this.prefetchingGroups = false;
                decompiledFrameRemainder2 = false;
              }
              else {
                if (param0 > -27) {
                  this.prefetchAllGroups((byte) -14);
                }
                decompiledFrameRemainder0 = (this.field_m);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(this.nextRequestCleanupTime > MonotonicMillisClock.currentTimeMillis(false)))) {
                  var2 = (ArchiveRequest) (this.requests.first((byte) 48));
                  while (var2 != null) {
                    if (!var2.pending) {
                      if (var2.cleanupMarked) {
                        if (!var2.priority) {
                          throw new RuntimeException();
                        }
                        var2.unlink(-3846);
                      } else {
                        var2.cleanupMarked = true;
                      }
                    }
                    var2 = (ArchiveRequest) (this.requests.next(-91));
                  }
                  decompiledFrameRemainder1 = false;
                }
              }
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              this.backgroundQueue = null;
            }
          }
        }
        if ((decompiledFrameRemainder1) &&
          (decompiledFrameRemainder0)) {
          if (param0 > -27) {
            this.prefetchAllGroups((byte) -14);
          }
          decompiledFrameRemainder0 = (this.field_m);
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameRemainder0 = !(this.nextRequestCleanupTime > MonotonicMillisClock.currentTimeMillis(false)))) {
            var2Lifetime1 = (ArchiveRequest) (this.requests.first((byte) 48));
            while (var2Lifetime1 != null) {
              if (!var2Lifetime1.pending) {
                if (var2Lifetime1.cleanupMarked) {
                  if (!var2Lifetime1.priority) {
                    throw new RuntimeException();
                  }
                  var2Lifetime1.unlink(-3846);
                } else {
                  var2Lifetime1.cleanupMarked = true;
                }
              }
              var2Lifetime1 = (ArchiveRequest) (this.requests.next(-91));
            }
          }
        }
        if (decompiledFrameRemainder0) {
          this.nextRequestCleanupTime = MonotonicMillisClock.currentTimeMillis(false) + 1000L;
        }

    }

    final void prefetchAllGroups(byte param0) {
        if (param0 > -9) {
          return;
        }
        if (null == this.archiveDisk) {
          return;
        }
        this.prefetchingGroups = true;
        if (this.backgroundQueue == null) {
          this.backgroundQueue = new IntrusiveDeque();
        }
    }

    final byte[] fetchGroup(int param0, int param1) {
        ArchiveRequest var3 = this.fetchGroupRequest(0, -26489, param1);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.getData(-95);
        if (param0 <= 112) {
          return (byte[]) null;
        }
        var3.unlink(-3846);
        return var4;
    }

    final void processQueuedPrefetches(int param0) {
        ArchiveRequest discarded$0 = null;
        ArchiveRequest discarded$1 = null;
        IntrusiveNode var2;
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        if (this.backgroundQueue == null) {
          return;
        }
        if (this.fetchIndex((byte) 9) == null) {
          return;
        }
        var2 = this.prefetchQueue.first(param0);
        while (var2 != null) {
          var3 = (int)var2.key;
          if (0 <= var3 &&
            var3 < this.index.groupCapacity &&
            this.index.groupFileCounts[var3] != 0) {
            if (this.groupDiskStatus[var3] == 0) {
              discarded$0 = this.fetchGroupRequest(1, -26489, var3);
            }
            if (this.groupDiskStatus[var3] == -1) {
              discarded$1 = this.fetchGroupRequest(2, -26489, var3);
            }
            if (this.groupDiskStatus[var3] == 1) {
              var2.unlink(-3846);
            }
          } else {
            var2.unlink(param0 - 3846);
          }
          var2 = this.prefetchQueue.next((byte) 10);
        }
    }

    public static void clearSharedReferences(byte param0) {
        int var1 = 110 % ((param0 + 65) / 33);
        field_s = null;
    }

    private final ArchiveRequest fetchGroupRequest(int param0, int param1, int param2) {
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        Object stackIn_92_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ArchiveRequest var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = VoidHunters.field_G;
        if (param1 != -26489) {
          return (ArchiveRequest) null;
        }
        var12 = (ArchiveRequest) (this.requests.get((long)param2, 100));
        var4 = var12;
        if (var12 != null &&
          0 == param0 &&
          !var12.priority &&
          var12.pending) {
          var12.unlink(-3846);
          var4 = null;
        }
        if (var4 == null) {
          if (param0 != 0) {
            if (param0 != 1) {
              if (param0 != 2) {
                throw new RuntimeException();
              }
              if (this.archiveDisk == null) {
                throw new RuntimeException();
              }
              if (this.groupDiskStatus[param2] != -1) {
                throw new RuntimeException();
              }
              if (this.field_g.isBackgroundQueueFull((byte) 32)) {
                return null;
              }
              var4 = this.field_g.requestGroup(false, -21, param2, (byte) 2, this.archiveId);
            } else {
              if (this.archiveDisk == null) {
                throw new RuntimeException();
              }
              var4 = this.diskWorker.enqueueRead((byte) 121, this.archiveDisk, param2);
            }
          } else {
            if (null != this.archiveDisk &&
              this.groupDiskStatus[param2] != -1) {
              var4 = this.diskWorker.readSynchronously(param2, this.archiveDisk, (byte) 104);
            } else {
              if (this.field_g.isPriorityQueueFull(104)) {
                return null;
              }
              var4 = this.field_g.requestGroup(true, -21, param2, (byte) 2, this.archiveId);
            }
          }
          this.requests.put((long)param2, (IntrusiveNode) (var4), (byte) -119);
        }
        if (((ArchiveRequest) (var4)).pending) {
          return null;
        }
        var18 = ((ArchiveRequest) (var4)).getData(77);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof DiskArchiveRequest) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              SetPointDefenceLaserProjectiles.field_p.reset();
              SetPointDefenceLaserProjectiles.field_p.update(var5, 0, var18.length - 2);
              var6_int = (int)SetPointDefenceLaserProjectiles.field_p.getValue();
              if (this.index.groupCrcs[param2] != var6_int) {
                throw new RuntimeException();
              }
              if (this.index.groupDigests != null &&
                this.index.groupDigests[param2] != null) {
                var29 = this.index.groupDigests[param2];
                var30 = SetMissileLauncherProjectiles.computeArchiveDigest((byte) 25, -2 + var18.length, var18, 0);
                var11 = 0;
                var9 = var11;
                while (64 > var11) {
                  if (var29[var11] != var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = ((255 & var5[-2 + var18.length]) << 8) + (255 & var5[-1 + var18.length]);
              if (var7 != (65535 & this.index.groupVersions[param2])) {
                throw new RuntimeException();
              }
              if (this.groupDiskStatus[param2] != 1) {
                if (this.groupDiskStatus[param2] != 0) {
                }
                this.groupDiskStatus[param2] = (byte) 1;
              }
              if (!((ArchiveRequest) (var4)).priority) {
                ((ArchiveRequest) (var4)).unlink(-3846);
              }
              stackIn_92_0 = var4;
              return (ArchiveRequest) (stackIn_92_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.groupDiskStatus[param2] = (byte)-1;
            ((ArchiveRequest) (var4)).unlink(-3846);
            if (!((ArchiveRequest) (var4)).priority) {
              return null;
            }
            if (this.field_g.isPriorityQueueFull(92)) {
              return null;
            }
            var4 = this.field_g.requestGroup(true, -21, param2, (byte) 2, this.archiveId);
            this.requests.put((long)param2, (IntrusiveNode) (var4), (byte) -127);
            return null;
          }
        }
        try {
          if (var5 != null &&
            2 < var18.length) {
            SetPointDefenceLaserProjectiles.field_p.reset();
            SetPointDefenceLaserProjectiles.field_p.update(var5, 0, var18.length - 2);
            var6_int = (int)SetPointDefenceLaserProjectiles.field_p.getValue();
            if (this.index.groupCrcs[param2] != var6_int) {
              throw new RuntimeException();
            }
            if (this.index.groupDigests != null &&
              this.index.groupDigests[param2] != null) {
              var28 = this.index.groupDigests[param2];
              var27 = SetMissileLauncherProjectiles.computeArchiveDigest((byte) 25, -2 + var18.length, var18, 0);
              for (var9 = 0; var9 < 64; var9++) {
                if (var27[var9] != var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_g.errorCount = 0;
            this.field_g.errorStatus = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_g.resetAfterValidationFailure((byte) -25);
          ((ArchiveRequest) (var4)).unlink(-3846);
          if (((ArchiveRequest) (var4)).priority) {
            if (this.field_g.isPriorityQueueFull(54)) {
              return null;
            }
            var4 = this.field_g.requestGroup(true, -21, param2, (byte) 2, this.archiveId);
            this.requests.put((long)param2, (IntrusiveNode) (var4), (byte) -118);
          }
          return null;
        }
        var5[var18.length - 2] = (byte)(this.index.groupVersions[param2] >>> 8);
        var5[-1 + var18.length] = (byte)this.index.groupVersions[param2];
        if (null != this.archiveDisk) {
          this.diskWorker.enqueueWrite(this.archiveDisk, var18, (byte) 111, param2);
          stackIn_61_0 = -2;
          stackIn_61_1 = ~this.groupDiskStatus[param2];
          if (stackIn_61_0 != stackIn_61_1) {
            this.groupDiskStatus[param2] = (byte) 1;
          }
        }
        if (!((ArchiveRequest) (var4)).priority) {
          ((ArchiveRequest) (var4)).unlink(-3846);
        }
        return (ArchiveRequest) (var4);
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        if (!OpenGlTexture1D.field_i) {
          SoftwareRasterizer2D.fillRectangleAlpha(param2, param3, param5, param4, param6, param0);
        } else {
          if (OpenGlModel.field_v) {
            GetDebrisGroupColour.field_r.fillRectangle(param5, (byte) 120, param6 | param0 << 24, param4, param3, param2);
          }
        }
        if (param1) {
          field_s = (Widget) null;
        }
    }

    CachedArchiveProvider(int param0, ArchiveDisk param1, ArchiveDisk param2, NetworkArchiveClient param3, ArchiveDiskWorker param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.requests = new NodeHashTable(16);
        this.backgroundGroupIndex = 0;
        this.prefetchQueue = new IntrusiveDeque();
        this.nextRequestCleanupTime = 0L;
        try {
          this.archiveId = param0;
          this.archiveDisk = param1;
          if (null == this.archiveDisk) {
            this.validatingDiskGroups = false;
          } else {
            this.validatingDiskGroups = true;
            this.backgroundQueue = new IntrusiveDeque();
          }
          this.indexDisk = param2;
          stackIn_7_1 = (param8);
          this.field_m = stackIn_7_1;
          this.diskWorker = param4;
          this.field_g = param3;
          this.expectedIndexDigest = param6;
          this.expectedIndexVersion = param7;
          this.expectedIndexCrc = param5;
          if (this.indexDisk != null) {
            this.indexRequest = (ArchiveRequest) ((Object) this.diskWorker.readSynchronously(this.archiveId, this.indexDisk, (byte) -65));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("ga.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
    }
}
