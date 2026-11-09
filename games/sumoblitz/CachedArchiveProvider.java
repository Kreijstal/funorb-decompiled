/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedArchiveProvider extends ArchiveProvider {
    private IntrusiveNodeHashTable groupRequests;
    private ArchiveIndex index;
    static ToolkitSprite[] field_j;
    private CacheIoWorker cacheWorker;
    static int[] field_z;
    static DisplayModeFailure FULLSCREEN_FOCUS_FAILURE;
    private int expectedIndexCrc;
    private int archiveId;
    private SectorCacheStore indexCache;
    private Js5Client networkClient;
    private SectorCacheStore groupCache;
    private byte[] groupCacheStates;
    private byte[] expectedIndexDigest;
    private ResourceRequest indexRequest;
    private int expectedIndexRevision;
    private boolean verifyingCache;
    private int nextGroup;
    private IntrusiveDeque priorityGroups;
    private boolean prefetchEnabled;
    private IntrusiveDeque pendingGroups;
    private long nextCleanupMillis;
    private boolean discardCompletedRequests;

    public static void releaseStatics(byte param0) {
        field_j = null;
        field_z = null;
        if (param0 > -78) {
          field_z = (int[]) null;
        }
        FULLSCREEN_FOCUS_FAILURE = null;
    }

    final ArchiveIndex fetchIndex(byte guard) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (null != this.index) {
          return this.index;
        }
        if (this.indexRequest == null) {
          if (this.networkClient.urgentQueueFull(-88)) {
            return null;
          }
          this.indexRequest = (ResourceRequest) ((Object) this.networkClient.requestGroup(255, true, this.archiveId, (byte) -88, (byte) 0));
        }
        if (this.indexRequest.pending) {
          return null;
        }
        if (guard >= -62) {
          return (ArchiveIndex) null;
        }
        var7 = this.indexRequest.completedBytes(false);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.indexRequest instanceof CacheIoRequest)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.index = new ArchiveIndex(var7, this.expectedIndexCrc, this.expectedIndexDigest);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.networkClient.invalidateConnection(14702);
            this.index = null;
            if (!this.networkClient.urgentQueueFull(-6)) {
              this.indexRequest = (ResourceRequest) ((Object) this.networkClient.requestGroup(255, true, this.archiveId, (byte) 90, (byte) 0));
            } else {
              this.indexRequest = null;
            }
            return null;
          }
          if (this.indexCache != null) {
            this.cacheWorker.enqueueWrite(this.archiveId, var7, 2, this.indexCache);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.index = new ArchiveIndex(var7, this.expectedIndexCrc, this.expectedIndexDigest);
            if (this.index.revision != this.expectedIndexRevision) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.index = null;
            if (!this.networkClient.urgentQueueFull(122)) {
              this.indexRequest = (ResourceRequest) ((Object) this.networkClient.requestGroup(255, true, this.archiveId, (byte) -81, (byte) 0));
            } else {
              this.indexRequest = null;
            }
            return null;
          }
        }
        this.indexRequest = null;
        if (this.groupCache != null) {
          this.groupCacheStates = new byte[this.index.groupCapacity];
        }
        return this.index;
    }

    final void servicePriorityGroups(int guard) {
        ResourceRequest discarded$0 = null;
        ResourceRequest discarded$1 = null;
        IntrusiveNode var2;
        int var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (this.pendingGroups == null) {
          return;
        }
        if (guard > -18) {
          this.enablePrefetch((byte) 124);
        }
        if (this.fetchIndex((byte) -120) == null) {
          return;
        }
        var2 = this.priorityGroups.first(-72);
        while (var2 != null) {
          var3 = (int)var2.key;
          if (var3 >= 0) {
            if (this.index.groupCapacity > var3) {
              if (this.index.fileCounts[var3] == 0) {
                var2.unlink(false);
              } else {
                if (this.groupCacheStates[var3] == 0) {
                  discarded$0 = this.resolveGroupRequest(var3, 1, 30561);
                }
                if (-1 == this.groupCacheStates[var3]) {
                  discarded$1 = this.resolveGroupRequest(var3, 2, 30561);
                }
                if (this.groupCacheStates[var3] == 1) {
                  var2.unlink(false);
                }
              }
            } else {
              var2.unlink(false);
            }
          } else {
            var2.unlink(false);
          }
          var2 = this.priorityGroups.next((byte) 18);
        }
    }

    private final ResourceRequest resolveGroupRequest(int groupId, int requestMode, int guard) {
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
        ResourceRequest var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        var12 = (ResourceRequest) (this.groupRequests.a(120, (long)groupId));
        var4 = var12;
        if (var12 != null &&
          requestMode == 0 &&
          !var12.urgent &&
          var12.pending) {
          var12.unlink(false);
          var4 = null;
        }
        if (var4 == null) {
          if (requestMode != 0) {
            if (1 == requestMode) {
              if (null == this.groupCache) {
                throw new RuntimeException();
              }
              var4 = this.cacheWorker.enqueueRead(groupId, -82, this.groupCache);
            } else {
              if (2 != requestMode) {
                throw new RuntimeException();
              }
              if (this.groupCache == null) {
                throw new RuntimeException();
              }
              if (this.groupCacheStates[groupId] != -1) {
                throw new RuntimeException();
              }
              if (this.networkClient.backgroundQueueFull(true)) {
                return null;
              }
              var4 = this.networkClient.requestGroup(this.archiveId, false, groupId, (byte) -126, (byte) 2);
            }
          } else {
            if (null != this.groupCache &&
              this.groupCacheStates[groupId] != -1) {
              var4 = this.cacheWorker.readImmediate(this.groupCache, -128, groupId);
            } else {
              if (this.networkClient.urgentQueueFull(119)) {
                return null;
              }
              var4 = this.networkClient.requestGroup(this.archiveId, true, groupId, (byte) -87, (byte) 2);
            }
          }
          this.groupRequests.a((IntrusiveNode) (var4), guard ^ -30562, (long)groupId);
        }
        if (((ResourceRequest) (var4)).pending) {
          return null;
        }
        var18 = ((ResourceRequest) (var4)).completedBytes(false);
        var13 = var18;
        var5 = var13;
        if (guard != 30561) {
          this.groupCacheStates = (byte[]) null;
        }
        if (var4 instanceof CacheIoRequest) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              CubeMapSource.field_c.reset();
              CubeMapSource.field_c.update(var5, 0, -2 + var18.length);
              var6_int = (int)CubeMapSource.field_c.getValue();
              if (this.index.groupCrcs[groupId] != var6_int) {
                throw new RuntimeException();
              }
              if (this.index.groupDigests != null &&
                this.index.groupDigests[groupId] != null) {
                var29 = this.index.groupDigests[groupId];
                var30 = ArchiveLoadRequirement.whirlpoolDigest(var5, (byte) -109, 0, var18.length - 2);
                var11 = 0;
                var9 = var11;
                while (var11 < 64) {
                  if (~var29[var11] != ~var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = (var5[-1 + var18.length] & 255) + (65280 & var5[-2 + var18.length] << 8);
              if (var7 != (65535 & this.index.groupVersions[groupId])) {
                throw new RuntimeException();
              }
              if (1 != this.groupCacheStates[groupId]) {
                if (this.groupCacheStates[groupId] == 0) {
                }
                this.groupCacheStates[groupId] = (byte) 1;
              }
              if (!((ResourceRequest) (var4)).urgent) {
                ((ResourceRequest) (var4)).unlink(false);
              }
              stackIn_92_0 = var4;
              return (ResourceRequest) (stackIn_92_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.groupCacheStates[groupId] = (byte)-1;
            ((ResourceRequest) (var4)).unlink(false);
            if (((ResourceRequest) (var4)).urgent) {
              if (this.networkClient.urgentQueueFull(guard - 30551)) {
                return null;
              }
              var4 = this.networkClient.requestGroup(this.archiveId, true, groupId, (byte) 78, (byte) 2);
              this.groupRequests.a((IntrusiveNode) (var4), -1, (long)groupId);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            CubeMapSource.field_c.reset();
            CubeMapSource.field_c.update(var5, 0, var18.length - 2);
            var6_int = (int)CubeMapSource.field_c.getValue();
            if (this.index.groupCrcs[groupId] != var6_int) {
              throw new RuntimeException();
            }
            if (null != this.index.groupDigests &&
              this.index.groupDigests[groupId] != null) {
              var28 = this.index.groupDigests[groupId];
              var27 = ArchiveLoadRequirement.whirlpoolDigest(var5, (byte) -110, 0, -2 + var18.length);
              for (var9 = 0; 64 > var9; var9++) {
                if (var27[var9] != var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.networkClient.failureCount = 0;
            this.networkClient.failureCode = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.networkClient.invalidateConnection(14702);
          ((ResourceRequest) (var4)).unlink(false);
          if (((ResourceRequest) (var4)).urgent &&
            !this.networkClient.urgentQueueFull(guard - 30435)) {
            var4 = this.networkClient.requestGroup(this.archiveId, true, groupId, (byte) -69, (byte) 2);
            this.groupRequests.a((IntrusiveNode) (var4), -1, (long)groupId);
          }
          return null;
        }
        var5[var18.length - 2] = (byte)(this.index.groupVersions[groupId] >>> 8);
        var5[-1 + var18.length] = (byte)this.index.groupVersions[groupId];
        if (null != this.groupCache) {
          this.cacheWorker.enqueueWrite(groupId, var18, 2, this.groupCache);
          if (this.groupCacheStates[groupId] != 1) {
            this.groupCacheStates[groupId] = (byte) 1;
          }
        }
        if (!((ResourceRequest) (var4)).urgent) {
          ((ResourceRequest) (var4)).unlink(false);
        }
        return (ResourceRequest) (var4);
    }

    final byte[] fetchGroup(int groupId, boolean guard) {
        ResourceRequest var3 = this.resolveGroupRequest(groupId, 0, 30561);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.completedBytes(guard);
        var3.unlink(guard);
        return var4;
    }

    final void enablePrefetch(byte guard) {
        if (this.groupCache == null) {
          return;
        }
        this.prefetchEnabled = true;
        if (this.pendingGroups == null) {
          this.pendingGroups = new IntrusiveDeque();
        }
        int var2 = -71 / ((guard + 2) / 46);
    }

    final int groupLoadPercent(int groupId, int guard) {
        ResourceRequest var3 = (ResourceRequest) (this.groupRequests.a(guard + 120, (long)groupId));
        if (var3 != null) {
          return var3.loadPercent(-1);
        }
        if (guard != 0) {
          this.prefetchEnabled = true;
          return 0;
        }
        return 0;
    }

    final void service(int guard) {
        ResourceRequest discarded$1 = null;
        ResourceRequest discarded$0 = null;
        ResourceRequest discarded$3 = null;
        ResourceRequest discarded$2 = null;
        int var2_int;
        ResourceRequest var2;
        IntrusiveNode var3;
        int var4;
        int var5;
        IntrusiveNode var6;
        IntrusiveNode var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        IntrusiveNode var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (null != this.pendingGroups) {
          if (null == this.fetchIndex((byte) -102)) {
            return;
          }
          if (this.verifyingCache) {
            var2_int = 1;
            var3 = this.pendingGroups.first(122);
            while (var3 != null) {
              var4 = (int)var3.key;
              if (this.groupCacheStates[var4] == 0) {
                discarded$1 = this.resolveGroupRequest(var4, 1, 30561);
              }
              if (0 != this.groupCacheStates[var4]) {
                var3.unlink(false);
              } else {
                var2_int = 0;
              }
              var3 = this.pendingGroups.next((byte) 18);
            }
            scanLoop1: while (true) {
              if (this.nextGroup < this.index.fileCounts.length) {
                if (this.index.fileCounts[this.nextGroup] != 0) {
                  if (250 <= this.cacheWorker.queuedCount) {
                    var2_int = 0;
                    break scanLoop1;
                  }
                  if (this.groupCacheStates[this.nextGroup] == 0) {
                    discarded$0 = this.resolveGroupRequest(this.nextGroup, 1, 30561);
                  }
                  if (0 == this.groupCacheStates[this.nextGroup]) {
                    var7 = new IntrusiveNode();
                    var7.key = (long)this.nextGroup;
                    this.pendingGroups.addLast(var7, (byte) 39);
                    var2_int = 0;
                  }
                }
                this.nextGroup = this.nextGroup + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.nextGroup = 0;
              this.verifyingCache = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.prefetchEnabled) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.pendingGroups.first(89);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.key;
                if (this.groupCacheStates[var4Lifetime1] != 1) {
                  discarded$3 = this.resolveGroupRequest(var4Lifetime1, 2, 30561);
                }
                if (this.groupCacheStates[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.unlink(false);
                }
                var3Lifetime1 = this.pendingGroups.next((byte) 18);
              }
              scanLoop2: while (true) {
                if (this.index.fileCounts.length > this.nextGroup) {
                  if (this.index.fileCounts[this.nextGroup] != 0) {
                    if (this.networkClient.backgroundQueueFull(true)) {
                      var2_intLifetime1 = 0;
                      break scanLoop2;
                    }
                    if (this.groupCacheStates[this.nextGroup] != 1) {
                      discarded$2 = this.resolveGroupRequest(this.nextGroup, 2, 30561);
                    }
                    if (this.groupCacheStates[this.nextGroup] != 1) {
                      var6 = new IntrusiveNode();
                      var6.key = (long)this.nextGroup;
                      var2_intLifetime1 = 0;
                      this.pendingGroups.addLast(var6, (byte) 39);
                    }
                  }
                  this.nextGroup = this.nextGroup + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.nextGroup = 0;
                this.prefetchEnabled = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.pendingGroups = null;
            }
          }
        }
        if (guard > -29) {
          this.groupLoadPercent(30, -8);
        }
        if (this.discardCompletedRequests &&
          IntroMeshResources.monotonicTimeMillis(-91) >= this.nextCleanupMillis) {
          var2 = (ResourceRequest) (this.groupRequests.a(84));
          while (var2 != null) {
            if (!var2.pending) {
              if (!var2.cleanupMarked) {
                var2.cleanupMarked = true;
              } else {
                if (!var2.urgent) {
                  throw new RuntimeException();
                }
                var2.unlink(false);
              }
            }
            var2 = (ResourceRequest) (this.groupRequests.a(true));
          }
          this.nextCleanupMillis = 1000L + IntroMeshResources.monotonicTimeMillis(-42);
        }
    }

    final static int crc32(int length, byte[] bytes, byte guard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -87 % ((-27 - guard) / 41);
          stackIn_1_0 = ReflectionCheck.crc32(bytes, 0, length, 1001);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("am.A(").append(length).append(',');
          if (bytes == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(guard).append(')').toString());
        }
    }

    CachedArchiveProvider(int archive, SectorCacheStore groups, SectorCacheStore indices, Js5Client client, CacheIoWorker worker, int indexCrc, byte[] indexDigest, int indexRevision, boolean discardCompleted) {
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
        this.groupRequests = new IntrusiveNodeHashTable(16);
        this.nextGroup = 0;
        this.priorityGroups = new IntrusiveDeque();
        this.nextCleanupMillis = 0L;
        try {
          this.groupCache = groups;
          this.archiveId = archive;
          if (this.groupCache != null) {
            this.verifyingCache = true;
            this.pendingGroups = new IntrusiveDeque();
          } else {
            this.verifyingCache = false;
          }
          stackIn_7_1 = (discardCompleted);
          this.discardCompletedRequests = stackIn_7_1;
          this.expectedIndexCrc = indexCrc;
          this.expectedIndexRevision = indexRevision;
          this.networkClient = client;
          this.expectedIndexDigest = indexDigest;
          this.cacheWorker = worker;
          this.indexCache = indices;
          if (this.indexCache != null) {
            this.indexRequest = (ResourceRequest) ((Object) this.cacheWorker.readImmediate(this.indexCache, 91, this.archiveId));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("am.<init>(").append(archive).append(',');
          if (groups == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (indices == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (client == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (worker == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(indexCrc).append(',');
          if (indexDigest == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(indexRevision).append(',').append(discardCompleted).append(')').toString());
        }
    }

    static {
        field_z = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        FULLSCREEN_FOCUS_FAILURE = new DisplayModeFailure();
    }
}
