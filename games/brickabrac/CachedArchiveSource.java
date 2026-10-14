/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedArchiveSource extends ArchiveSource {
    static int[] field_t;
    static TextFont field_y;
    private FileCacheStore groupCache;
    private ArchiveFetchClient fetchClient;
    private byte[] expectedIndexDigest;
    private ResourceRequest indexRequest;
    private int expectedIndexCrc;
    private IntrusiveHashTable requests;
    private ArchiveIndex index;
    private byte[] cacheGroupStates;
    private FileCacheStore indexCache;
    static NodeDeque ignoreEntries;
    private int archiveId;
    static int field_r;
    static int field_p;
    private int expectedIndexRevision;
    private CacheIoWorker cacheIo;
    private boolean prefetchingGroups;
    private int scanGroupId;
    private NodeDeque queuedGroups;
    private NodeDeque pendingScanGroups;
    private boolean checkingCache;
    private long nextCleanupMillis;
    private boolean cleanupEnabled;

    final int getGroupProgress(byte obfuscationGuard, int groupId) {
        ResourceRequest var3 = (ResourceRequest) (this.requests.get(-117, (long)groupId));
        if (obfuscationGuard >= -60) {
          this.checkingCache = true;
        }
        if (var3 != null) {
          return var3.getProgress(-21546);
        }
        return 0;
    }

    final static void d(int param0) {
        int var3 = 0;
        int stackIn_12_0 = 0;
        String stackIn_12_1 = null;
        boolean stackIn_13_2 = false;
        NineSliceFrame stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        NineSliceFrame var9 = null;
        int var10 = 0;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var1_int = -LevelPack.field_k + MusicVoiceMixer.field_p;
          if (param0 != -16085) {
            return;
          }
          LevelPack.field_k = NewAchievementsScreen.field_J - (var1_int >> 1);
          ContentTransitionPhase.field_d = ea.field_e - (bg.field_r >> 1);
          MusicVoiceMixer.field_p = var1_int + LevelPack.field_k;
          var2 = ContentTransitionPhase.field_d;
          for (var3 = 0; var3 < kn.field_E.length; var3++) {
            var4 = MenuSelection.field_q[var3];
            if (var4 < 0) {
              var5 = ValidationStatus.field_d;
            } else {
              if (ArcticBackground.field_r.selectedIndex != var4) {
                var5 = DateInputWidget.field_I;
              } else {
                var5 = LobbyGame.field_hc;
              }
            }
            var6 = kn.field_E[var3];
            stackIn_12_0 = 0;
            stackIn_12_1 = var6;
            stackIn_13_2 = !(var4 < 0);
            var7 = pl.a(stackIn_12_0, stackIn_12_1, stackIn_13_2);
            var8 = NewAchievementsScreen.field_J - (var7 >> 1);
            if (var4 >= 0) {
              var2 = var2 + GameClock.field_g;
              if (ArcticBackground.field_r.selectedIndex != var4) {
                stackIn_17_0 = ArrayWidgetGroup.field_F;
              } else {
                stackIn_17_0 = EmailConfirmationValidator.field_l;
              }
              var9 = stackIn_17_0;
              if (var9 != null) {
                var9.paintFrame((FullscreenFailureDialog.field_lb << 1) + var7, (GameCanvas.field_f << 1) + TooltipSprite.field_i, -FullscreenFailureDialog.field_lb + var8, false, var2);
              }
              var2 = var2 + GameCanvas.field_f;
            }
            if (var4 >= 0) {
              PowerUpWarning.field_r.drawLeft(var6, var8, PowerUpWarning.field_i + var2, var5, -1);
              var2 = var2 + (TooltipSprite.field_i + GameClock.field_g + GameCanvas.field_f);
            } else {
              Widget.field_m.drawLeft(var6, var8, DualLinkDeque.field_b + var2, var5, -1);
              var2 = var2 + BufferedSocket.field_m;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "jq.J(" + param0 + ')');
        }
    }

    final void processQueuedGroups(int obfuscationGuard) {
        int var3 = 0;
        ResourceRequest discarded$0 = null;
        ResourceRequest discarded$1 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (null == this.pendingScanGroups) {
          return;
        }
        if (obfuscationGuard != 20312) {
          this.expectedIndexRevision = -97;
        }
        if (this.getIndex((byte) -112) == null) {
          return;
        }
        IntrusiveNode var2 = this.queuedGroups.first(-9);
        while (var2 != null) {
          var3 = (int)var2.key;
          if (var3 < 0) {
            var2.unlink((byte) 111);
          } else {
            if (this.index.groupCapacity <= var3) {
              var2.unlink((byte) 111);
            } else {
              if (this.index.fileCounts[var3] == 0) {
                var2.unlink((byte) 111);
              } else {
                if (this.cacheGroupStates[var3] == 0) {
                  discarded$0 = this.pollGroupRequest(1, var3, (byte) -109);
                }
                if (this.cacheGroupStates[var3] == -1) {
                  discarded$1 = this.pollGroupRequest(2, var3, (byte) -116);
                }
                if (this.cacheGroupStates[var3] == 1) {
                  var2.unlink((byte) 111);
                }
              }
            }
          }
          var2 = this.queuedGroups.next((byte) 116);
        }
    }

    final void startPrefetch(int obfuscationGuard) {
        if (obfuscationGuard != -10476) {
          this.index = (ArchiveIndex) null;
        }
        if (null == this.groupCache) {
          return;
        }
        this.prefetchingGroups = true;
        if (this.pendingScanGroups == null) {
          this.pendingScanGroups = new NodeDeque();
        }
    }

    final static void e(int param0) {
        int var1 = -91 / ((33 - param0) / 48);
        MatchingTextValidator.a(EmailConfirmationValidator.e((byte) -119), 9);
    }

    final byte[] getPackedGroup(int groupId, byte obfuscationGuard) {
        ResourceRequest var3 = this.pollGroupRequest(0, groupId, (byte) -110);
        if (obfuscationGuard > -33) {
          this.archiveId = 38;
        }
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.getData((byte) -85);
        var3.unlink((byte) 111);
        return var4;
    }

    final void maintainGroups(int obfuscationGuard) {
        ResourceRequest discarded$3 = null;
        ResourceRequest discarded$2 = null;
        ResourceRequest discarded$1 = null;
        ResourceRequest discarded$0 = null;
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
        var5 = BrickABrac.field_J ? 1 : 0;
        if (null != this.pendingScanGroups) {
          if (this.getIndex((byte) -112) == null) {
            return;
          }
          if (this.checkingCache) {
            var2_int = 1;
            var3 = this.pendingScanGroups.first(-101);
            while (var3 != null) {
              var4 = (int)var3.key;
              if (this.cacheGroupStates[var4] == 0) {
                discarded$3 = this.pollGroupRequest(1, var4, (byte) -118);
              }
              if (this.cacheGroupStates[var4] == 0) {
                var2_int = 0;
              } else {
                var3.unlink((byte) 111);
              }
              var3 = this.pendingScanGroups.next((byte) 116);
            }
            while (this.scanGroupId < this.index.fileCounts.length) {
              if (0 == this.index.fileCounts[this.scanGroupId]) {
                this.scanGroupId = this.scanGroupId + 1;
                continue;
              }
              if (250 > this.cacheIo.queuedCount) {
                if (this.cacheGroupStates[this.scanGroupId] == 0) {
                  discarded$2 = this.pollGroupRequest(1, this.scanGroupId, (byte) -119);
                }
                if (this.cacheGroupStates[this.scanGroupId] == 0) {
                  var6 = new IntrusiveNode();
                  var6.key = (long)this.scanGroupId;
                  this.pendingScanGroups.addLast(var6, (byte) 3);
                  var2_int = 0;
                }
                this.scanGroupId = this.scanGroupId + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if ((var2_int != 0)) {
              this.scanGroupId = 0;
              this.checkingCache = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.prefetchingGroups) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.pendingScanGroups.first(-127);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.key;
                if (this.cacheGroupStates[var4Lifetime1] != 1) {
                  discarded$1 = this.pollGroupRequest(2, var4Lifetime1, (byte) -118);
                }
                if (1 == this.cacheGroupStates[var4Lifetime1]) {
                  var3Lifetime1.unlink((byte) 111);
                } else {
                  var2_intLifetime1 = 0;
                }
                var3Lifetime1 = this.pendingScanGroups.next((byte) 116);
              }
              scanLoop1: while (true) {
                if (this.index.fileCounts.length > this.scanGroupId) {
                  if (this.index.fileCounts[this.scanGroupId] != 0) {
                    if (this.fetchClient.isBackgroundQueueFull((byte) 101)) {
                      var2_intLifetime1 = 0;
                      break scanLoop1;
                    }
                    if (1 != this.cacheGroupStates[this.scanGroupId]) {
                      discarded$0 = this.pollGroupRequest(2, this.scanGroupId, (byte) -121);
                    }
                    if (1 != this.cacheGroupStates[this.scanGroupId]) {
                      var7 = new IntrusiveNode();
                      var7.key = (long)this.scanGroupId;
                      this.pendingScanGroups.addLast(var7, (byte) 3);
                      var2_intLifetime1 = 0;
                    }
                  }
                  this.scanGroupId = this.scanGroupId + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.prefetchingGroups = false;
                this.scanGroupId = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.pendingScanGroups = null;
            }
          }
        }
        if (this.cleanupEnabled &&
          this.nextCleanupMillis <= MonotonicTime.nowMillis(false)) {
          var2 = (ResourceRequest) (this.requests.first(-15519));
          while (var2 != null) {
            if (!var2.pending) {
              if (!var2.cleanupMarked) {
                var2.cleanupMarked = true;
              } else {
                if (!var2.priority) {
                  throw new RuntimeException();
                }
                var2.unlink((byte) 111);
              }
            }
            var2 = (ResourceRequest) (this.requests.next(true));
          }
          this.nextCleanupMillis = MonotonicTime.nowMillis(false) + 1000L;
        }
        if (obfuscationGuard != 1) {
          this.processQueuedGroups(-33);
        }
    }

    private final ResourceRequest pollGroupRequest(int requestMode, int groupId, byte obfuscationGuard) {
        Object stackIn_59_0 = null;
        Throwable decompiledCaughtException = null;
        Object request = null;
        byte[] data = null;
        int actualCrc = 0;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int cachedRevision = 0;
        int digestIndex = 0;
        int clientBranchFlag = 0;
        int var11 = 0;
        ResourceRequest existingRequest = null;
        byte[] dataAlias = null;
        byte[] payload = null;
        byte[] actualCacheDigest = null;
        byte[] expectedCacheDigest = null;
        byte[] expectedNetworkDigest = null;
        byte[] actualNetworkDigest = null;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        existingRequest = (ResourceRequest) (this.requests.get(-48, (long)groupId));
        request = existingRequest;
        if (existingRequest != null &&
          0 == requestMode &&
          !existingRequest.priority &&
          existingRequest.pending) {
          existingRequest.unlink((byte) 111);
          request = null;
        }
        if (request == null) {
          if (requestMode == 0) {
            if (this.groupCache != null &&
              this.cacheGroupStates[groupId] != -1) {
              request = this.cacheIo.readImmediate(this.groupCache, groupId, 125);
            } else {
              if (this.fetchClient.isPriorityQueueFull(2)) {
                return null;
              }
              request = this.fetchClient.request(-952050528, this.archiveId, (byte) 2, groupId, true);
            }
          } else {
            if (requestMode == 1) {
              if (null == this.groupCache) {
                throw new RuntimeException();
              }
              request = this.cacheIo.readAsync(groupId, this.groupCache, (byte) -114);
            } else {
              if (requestMode != 2) {
                throw new RuntimeException();
              }
              if (this.groupCache == null) {
                throw new RuntimeException();
              }
              if (-1 != this.cacheGroupStates[groupId]) {
                throw new RuntimeException();
              }
              if (this.fetchClient.isBackgroundQueueFull((byte) 101)) {
                return null;
              }
              request = this.fetchClient.request(-952050528, this.archiveId, (byte) 2, groupId, false);
            }
          }
          this.requests.put(34, (IntrusiveNode) (request), (long)groupId);
        }
        if (((ResourceRequest) (request)).pending) {
          return null;
        }
        if (obfuscationGuard > -104) {
          return (ResourceRequest) null;
        }
        payload = ((ResourceRequest) (request)).getData((byte) -74);
        dataAlias = payload;
        data = dataAlias;
        if (request instanceof CacheIoRequest) {
          try {
            if (data != null &&
              2 < payload.length) {
              fq.archiveCrc.reset();
              fq.archiveCrc.update(data, 0, -2 + payload.length);
              actualCrc = (int)fq.archiveCrc.getValue();
              if (actualCrc != this.index.groupCrcs[groupId]) {
                throw new RuntimeException();
              }
              if (this.index.groupDigests != null &&
                this.index.groupDigests[groupId] != null) {
                expectedCacheDigest = this.index.groupDigests[groupId];
                actualCacheDigest = jd.a(data, 0, -14970, -2 + payload.length);
                for (digestIndex = 0; digestIndex < 64; digestIndex++) {
                  if (actualCacheDigest[digestIndex] != expectedCacheDigest[digestIndex]) {
                    throw new RuntimeException();
                  }
                }
              }
              cachedRevision = ((data[-2 + payload.length] & 255) << 8) + (255 & data[payload.length - 1]);
              if (cachedRevision != (65535 & this.index.groupVersions[groupId])) {
                throw new RuntimeException();
              }
              if (this.cacheGroupStates[groupId] != 1) {
                if (this.cacheGroupStates[groupId] != 0) {
                }
                this.cacheGroupStates[groupId] = (byte) 1;
              }
              if (!((ResourceRequest) (request)).priority) {
                ((ResourceRequest) (request)).unlink((byte) 111);
              }
              stackIn_59_0 = request;
              return (ResourceRequest) (stackIn_59_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.cacheGroupStates[groupId] = (byte)-1;
            ((ResourceRequest) (request)).unlink((byte) 111);
            if (((ResourceRequest) (request)).priority &&
              !this.fetchClient.isPriorityQueueFull(2)) {
              request = this.fetchClient.request(-952050528, this.archiveId, (byte) 2, groupId, true);
              this.requests.put(34, (IntrusiveNode) (request), (long)groupId);
            }
            return null;
          }
        }
        try {
          if (data != null &&
            payload.length > 2) {
            fq.archiveCrc.reset();
            fq.archiveCrc.update(data, 0, -2 + payload.length);
            actualCrc = (int)fq.archiveCrc.getValue();
            if (actualCrc != this.index.groupCrcs[groupId]) {
              throw new RuntimeException();
            }
            if (this.index.groupDigests != null &&
              this.index.groupDigests[groupId] != null) {
              expectedNetworkDigest = this.index.groupDigests[groupId];
              actualNetworkDigest = jd.a(data, 0, -14970, -2 + payload.length);
              var11 = 0;
              digestIndex = var11;
              while (64 > var11) {
                if (~expectedNetworkDigest[var11] != ~actualNetworkDigest[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.fetchClient.failureCount = 0;
            this.fetchClient.lastError = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.fetchClient.reportIntegrityFailure((byte) 8);
          ((ResourceRequest) (request)).unlink((byte) 111);
          if (((ResourceRequest) (request)).priority) {
            if (this.fetchClient.isPriorityQueueFull(2)) {
              return null;
            }
            request = this.fetchClient.request(-952050528, this.archiveId, (byte) 2, groupId, true);
            this.requests.put(34, (IntrusiveNode) (request), (long)groupId);
          }
          return null;
        }
        data[payload.length - 2] = (byte)(this.index.groupVersions[groupId] >>> 8);
        data[payload.length - 1] = (byte)this.index.groupVersions[groupId];
        if (this.groupCache != null) {
          this.cacheIo.writeAsync(groupId, false, payload, this.groupCache);
          if (this.cacheGroupStates[groupId] != 1) {
            this.cacheGroupStates[groupId] = (byte) 1;
          }
        }
        if (!((ResourceRequest) (request)).priority) {
          ((ResourceRequest) (request)).unlink((byte) 111);
        }
        return (ResourceRequest) (request);
    }

    final ArchiveIndex getIndex(byte obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        byte[] indexBytes = null;
        RuntimeException var3 = null;
        int clientBranchFlag = 0;
        byte[] indexBytesAlias = null;
        byte[] payloadAlias = null;
        byte[] payload = null;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        if (this.index != null) {
          return this.index;
        }
        if (this.indexRequest == null) {
          if (this.fetchClient.isPriorityQueueFull(2)) {
            return null;
          }
          this.indexRequest = (ResourceRequest) ((Object) this.fetchClient.request(-952050528, 255, (byte) 0, this.archiveId, true));
        }
        if (this.indexRequest.pending) {
          return null;
        }
        payload = this.indexRequest.getData((byte) 99);
        payloadAlias = payload;
        indexBytesAlias = payloadAlias;
        indexBytes = indexBytesAlias;
        if (this.indexRequest instanceof CacheIoRequest) {
          try {
            if (indexBytesAlias == null) {
              throw new RuntimeException();
            }
            this.index = new ArchiveIndex(payload, this.expectedIndexCrc, this.expectedIndexDigest);
            if (this.expectedIndexRevision != this.index.revision) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.index = null;
            if (this.fetchClient.isPriorityQueueFull(obfuscationGuard ^ -110)) {
              this.indexRequest = null;
            } else {
              this.indexRequest = (ResourceRequest) ((Object) this.fetchClient.request(obfuscationGuard ^ 952050480, 255, (byte) 0, this.archiveId, true));
            }
            return null;
          }
        } else {
          try {
            if (indexBytesAlias == null) {
              throw new RuntimeException();
            }
            this.index = new ArchiveIndex(payload, this.expectedIndexCrc, this.expectedIndexDigest);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.fetchClient.reportIntegrityFailure((byte) 8);
            this.index = null;
            if (!this.fetchClient.isPriorityQueueFull(2)) {
              this.indexRequest = (ResourceRequest) ((Object) this.fetchClient.request(-952050528, 255, (byte) 0, this.archiveId, true));
            } else {
              this.indexRequest = null;
            }
            return null;
          }
          if (null != this.indexCache) {
            this.cacheIo.writeAsync(this.archiveId, false, payload, this.indexCache);
          }
        }
        if (null != this.groupCache) {
          this.cacheGroupStates = new byte[this.index.groupCapacity];
        }
        if (obfuscationGuard != -112) {
          this.startPrefetch(-85);
        }
        this.indexRequest = null;
        return this.index;
    }

    public static void c(byte param0) {
        field_y = null;
        field_t = null;
        if (param0 != 56) {
          field_r = 120;
        }
        ignoreEntries = null;
    }

    CachedArchiveSource(int archiveId, FileCacheStore groupCache, FileCacheStore indexCache, ArchiveFetchClient fetchClient, CacheIoWorker cacheIo, int expectedIndexCrc, byte[] expectedIndexDigest, int expectedIndexRevision, boolean cleanupEnabled) {
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
        this.requests = new IntrusiveHashTable(16);
        this.scanGroupId = 0;
        this.queuedGroups = new NodeDeque();
        this.nextCleanupMillis = 0L;
        try {
          this.groupCache = groupCache;
          this.archiveId = archiveId;
          if (null == this.groupCache) {
            this.checkingCache = false;
          } else {
            this.checkingCache = true;
            this.pendingScanGroups = new NodeDeque();
          }
          stackIn_7_1 = (cleanupEnabled);
          this.cleanupEnabled = stackIn_7_1;
          this.expectedIndexDigest = expectedIndexDigest;
          this.expectedIndexCrc = expectedIndexCrc;
          this.fetchClient = fetchClient;
          this.expectedIndexRevision = expectedIndexRevision;
          this.cacheIo = cacheIo;
          this.indexCache = indexCache;
          if (this.indexCache != null) {
            this.indexRequest = (ResourceRequest) ((Object) this.cacheIo.readImmediate(this.indexCache, this.archiveId, -25));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("jq.<init>(").append(archiveId).append(',');
          if (groupCache == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (indexCache == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (fetchClient == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (cacheIo == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(expectedIndexCrc).append(',');
          if (expectedIndexDigest == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(expectedIndexRevision).append(',').append(cleanupEnabled).append(')').toString());
        }
    }

    static {
        field_t = new int[]{510};
        field_p = 0;
    }
}
