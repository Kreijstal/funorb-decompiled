/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedArchiveProvider extends ArchiveProvider {
    private byte[] groupStates;
    private int indexCrc32;
    static String[] field_r;
    private byte[] indexDigest;
    private int indexRevision;
    private ArchiveIndex index;
    private int archiveId;
    private Js5Transport transport;
    private SectorCacheStore indexStore;
    private ArchiveRequest indexRequest;
    private IntrusiveNodeHashTable requests;
    private DiskCacheWorker diskWorker;
    private SectorCacheStore groupStore;
    private boolean verifyingCache;
    private IntrusiveDeque prefetchQueue;
    private IntrusiveDeque backgroundQueue;
    private boolean prefetching;
    private int scanGroupId;
    static int field_n;
    private long nextCleanupMillis;
    private boolean cleanupEnabled;
    static IndexedSprite[] field_w;

    final void serviceBackgroundRequests(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        if (guard >= -21) {
          this.getEncodedGroup((byte) -107, 43);
        }
        if (null != this.backgroundQueue) {
          if (null == this.getIndex(29192)) {
            return;
          }
          if (this.verifyingCache) {
            boolean var2_int = true;
            IntrusiveNode var3 = this.backgroundQueue.first(false);
            while (var3 != null) {
              int var4 = (int)var3.key;
              if (this.groupStates[var4] == 0) {
                ArchiveRequest discarded$3 = this.pollGroupRequest(var4, 1, 23874);
              }
              if (this.groupStates[var4] != 0) {
                var3.unlink((byte) -53);
              } else {
                var2_int = false;
              }
              var3 = this.backgroundQueue.next((byte) 70);
            }
            scanLoop1: while (true) {
              if (this.index.groupFileCounts.length > this.scanGroupId) {
                if (this.index.groupFileCounts[this.scanGroupId] != 0) {
                  if (250 <= this.diskWorker.pendingCount) {
                    var2_int = false;
                    break scanLoop1;
                  }
                  if (0 == this.groupStates[this.scanGroupId]) {
                    ArchiveRequest discarded$2 = this.pollGroupRequest(this.scanGroupId, 1, 23874);
                  }
                  if (this.groupStates[this.scanGroupId] == 0) {
                    IntrusiveNode var6 = new IntrusiveNode();
                    var6.key = (long)this.scanGroupId;
                    this.backgroundQueue.addLast(-12328, var6);
                    var2_int = false;
                  }
                }
                this.scanGroupId = this.scanGroupId + 1;
                continue;
              }
              break;
            }
            if (var2_int) {
              this.scanGroupId = 0;
              this.verifyingCache = false;
            }
          } else if (this.prefetching) {
            boolean var2_intLifetime1 = true;
            IntrusiveNode var3Lifetime1 = this.backgroundQueue.first(false);
            while (var3Lifetime1 != null) {
              int var4Lifetime1 = (int)var3Lifetime1.key;
              if (this.groupStates[var4Lifetime1] != 1) {
                ArchiveRequest discarded$1 = this.pollGroupRequest(var4Lifetime1, 2, 23874);
              }
              if (this.groupStates[var4Lifetime1] != 1) {
                var2_intLifetime1 = false;
              } else {
                var3Lifetime1.unlink((byte) -24);
              }
              var3Lifetime1 = this.backgroundQueue.next((byte) 70);
            }
            while (this.scanGroupId < this.index.groupFileCounts.length) {
              if (this.index.groupFileCounts[this.scanGroupId] == 0) {
                this.scanGroupId = this.scanGroupId + 1;
                continue;
              }
              if (!this.transport.isPrefetchCapacityReached(20)) {
                if (this.groupStates[this.scanGroupId] != 1) {
                  ArchiveRequest discarded$0 = this.pollGroupRequest(this.scanGroupId, 2, 23874);
                }
                if (1 != this.groupStates[this.scanGroupId]) {
                  IntrusiveNode var7 = new IntrusiveNode();
                  var7.key = (long)this.scanGroupId;
                  var2_intLifetime1 = false;
                  this.backgroundQueue.addLast(-12328, var7);
                }
                this.scanGroupId = this.scanGroupId + 1;
                continue;
              }
              var2_intLifetime1 = false;
              break;
            }
            if (var2_intLifetime1) {
              this.prefetching = false;
              this.scanGroupId = 0;
            }
            boolean decompiledFrameRemainder0 = false;
          } else {
            this.backgroundQueue = null;
          }
        }
        if (!this.cleanupEnabled) {
          return;
        }
        if (MonotonicClockSupport.monotonicMillis(128) < this.nextCleanupMillis) {
          return;
        }
        ArchiveRequest var2 = (ArchiveRequest) (this.requests.first(false));
        while (var2 != null) {
          if (!var2.pending) {
            if (var2.field_s) {
              if (!var2.field_r) {
                throw new RuntimeException();
              }
              var2.unlink((byte) -117);
            } else {
              var2.field_s = true;
            }
          }
          var2 = (ArchiveRequest) (this.requests.next((byte) 62));
        }
        this.nextCleanupMillis = MonotonicClockSupport.monotonicMillis(128) + 1000L;
        return;
    }

    final byte[] getEncodedGroup(byte guard, int groupId) {
        ArchiveRequest var3 = this.pollGroupRequest(groupId, 0, 23874);
        if (var3 == null) {
          return null;
        }
        if (guard <= -9) {
          byte[] var4 = var3.getBytes(true);
          var3.unlink((byte) -81);
          return var4;
        }
        return (byte[]) null;
    }

    final int groupProgress(int guard, int groupId) {
        if (guard != 0) {
          this.requests = (IntrusiveNodeHashTable) null;
        }
        ArchiveRequest var3 = (ArchiveRequest) (this.requests.get((long)groupId, -1));
        if (var3 != null) {
          return var3.progress(100);
        }
        return 0;
    }

    final void startPrefetch(byte guard) {
        if (null == this.groupStore) {
          return;
        }
        int var2 = -123 / ((53 - guard) / 42);
        this.prefetching = true;
        if (null == this.backgroundQueue) {
          this.backgroundQueue = new IntrusiveDeque();
        }
    }

    final static void loadMemberCampaignAssets(int guard) {
        if (!UiContainer.hasMembership((byte) 113)) {
          return;
        }
        if (StatefulTextPainter.field_u == null) {
          return;
        }
        if (guard != 2) {
          return;
        }
        if (!StatefulTextPainter.field_u.ensureIndex(0)) {
          return;
        }
        if (!StatefulTextPainter.field_u.tryLoadAllGroups((byte) -119)) {
          return;
        }
        if (PcmResampler.field_h == null) {
          PcmResampler.field_h = AchievementDefinition.requestArchiveKey(5, 0, -1, 2);
          return;
        }
        if (PcmResampler.field_h.key == null) {
          return;
        }
        UsernameCredentials.field_h = AccountRequestDialog.a(PcmResampler.field_h.key, StatefulTextPainter.field_u, UsernameCredentials.field_h, UiContainer.field_B, (byte) 112);
        if (FrameCadenceSupport.field_b == null) {
          FrameCadenceSupport.field_b = MarkerSliderPainter.a(1, StatefulTextPainter.field_u, IndexedSpriteState.field_j, PcmResampler.field_h.key);
        }
        if (null != FrameCadenceSupport.field_b) {
          PcmResampler.field_h = null;
          StatefulTextPainter.field_u = null;
        }
    }

    final ArchiveIndex getIndex(int guard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = EscapeVector.obfuscationControl;
        if (this.index != null) {
          return this.index;
        }
        if (null == this.indexRequest) {
          if (this.transport.isUrgentCapacityReached(20)) {
            return null;
          }
          this.indexRequest = (ArchiveRequest) ((Object) this.transport.requestGroup(255, true, (byte) 0, this.archiveId, (byte) 0));
        }
        if (this.indexRequest.pending) {
          return null;
        }
        byte[] var7 = this.indexRequest.getBytes(true);
        byte[] var6 = var7;
        byte[] var5 = var6;
        byte[] var2 = var5;
        if (guard != 29192) {
          CachedArchiveProvider.hitTestLegacyMenuAction((byte) 93, -10, 70);
        }
        if (this.indexRequest instanceof DiskCacheRequest) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.index = new ArchiveIndex(var7, this.indexCrc32, this.indexDigest);
            if (this.index.revision != this.indexRevision) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.index = null;
            if (!this.transport.isUrgentCapacityReached(20)) {
              this.indexRequest = (ArchiveRequest) ((Object) this.transport.requestGroup(255, true, (byte) 0, this.archiveId, (byte) 0));
            } else {
              this.indexRequest = null;
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.index = new ArchiveIndex(var7, this.indexCrc32, this.indexDigest);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.transport.resetAfterIntegrityFailure((byte) -125);
            this.index = null;
            if (!this.transport.isUrgentCapacityReached(20)) {
              this.indexRequest = (ArchiveRequest) ((Object) this.transport.requestGroup(255, true, (byte) 0, this.archiveId, (byte) 0));
            } else {
              this.indexRequest = null;
            }
            return null;
          }
          if (this.indexStore != null) {
            this.diskWorker.enqueueOperation(var7, this.archiveId, guard ^ 29194, this.indexStore);
          }
        }
        this.indexRequest = null;
        if (null != this.groupStore) {
          this.groupStates = new byte[this.index.groupCapacity];
        }
        return this.index;
    }

    private final ArchiveRequest pollGroupRequest(int groupId, int requestMode, int guard) {
        Throwable decompiledCaughtException = null;
        int var6_int = 0;
        int var9 = 0;
        int var10 = EscapeVector.obfuscationControl;
        ArchiveRequest var12 = (ArchiveRequest) (this.requests.get((long)groupId, -1));
        Object var4 = var12;
        if (var12 != null &&
          requestMode == 0 &&
          !var12.field_r &&
          var12.pending) {
          var12.unlink((byte) -16);
          var4 = null;
        }
        if (var4 == null) {
          if (requestMode != 0) {
            if (requestMode != 1) {
              if (requestMode != 2) {
                throw new RuntimeException();
              }
              if (this.groupStore == null) {
                throw new RuntimeException();
              }
              if (this.groupStates[groupId] != -1) {
                throw new RuntimeException();
              }
              if (this.transport.isPrefetchCapacityReached(20)) {
                return null;
              }
              var4 = this.transport.requestGroup(this.archiveId, false, (byte) 0, groupId, (byte) 2);
            } else {
              if (this.groupStore == null) {
                throw new RuntimeException();
              }
              var4 = this.diskWorker.enqueueRead((byte) -127, this.groupStore, groupId);
            }
          } else if (this.groupStore != null &&
            -1 != this.groupStates[groupId]) {
            var4 = this.diskWorker.readImmediate(this.groupStore, guard ^ 23908, groupId);
          } else {
            if (this.transport.isUrgentCapacityReached(20)) {
              return null;
            }
            var4 = this.transport.requestGroup(this.archiveId, true, (byte) 0, groupId, (byte) 2);
          }
          this.requests.put((IntrusiveNode) (var4), 10901, (long)groupId);
        }
        if (((ArchiveRequest) (var4)).pending) {
          return null;
        }
        if (guard != 23874) {
          this.getIndex(1);
        }
        byte[] var18 = ((ArchiveRequest) (var4)).getBytes(true);
        byte[] var13 = var18;
        byte[] var5 = var13;
        if (var4 instanceof DiskCacheRequest) {
          try {
            if (var5 != null &&
              2 < var18.length) {
              NanoTickClock.field_m.reset();
              NanoTickClock.field_m.update(var5, 0, var18.length - 2);
              var6_int = (int)NanoTickClock.field_m.getValue();
              if (var6_int != this.index.groupCrc32s[groupId]) {
                throw new RuntimeException();
              }
              if (this.index.groupDigests != null &&
                this.index.groupDigests[groupId] != null) {
                byte[] var27 = this.index.groupDigests[groupId];
                byte[] var28 = RasterBuffer.whirlpoolDigest(var5, 0, var18.length - 2, guard - 23874);
                for (var9 = 0; var9 < 64; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              int var7 = (var5[-2 + var18.length] << 8 & 65280) + (255 & var5[-1 + var18.length]);
              if (var7 != (this.index.groupVersions[groupId] & 65535)) {
                throw new RuntimeException();
              }
              if (this.groupStates[groupId] != 1) {
                if (this.groupStates[groupId] != 0) {
                }
                this.groupStates[groupId] = (byte) 1;
              }
              if (!((ArchiveRequest) (var4)).field_r) {
                ((ArchiveRequest) (var4)).unlink((byte) -93);
              }
              Object stackIn_61_0 = var4;
              return (ArchiveRequest) (stackIn_61_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            Exception var6_ref = (Exception) (Object) decompiledCaughtException;
            this.groupStates[groupId] = (byte)-1;
            ((ArchiveRequest) (var4)).unlink((byte) -92);
            if (((ArchiveRequest) (var4)).field_r &&
              !this.transport.isUrgentCapacityReached(20)) {
              var4 = this.transport.requestGroup(this.archiveId, true, (byte) 0, groupId, (byte) 2);
              this.requests.put((IntrusiveNode) (var4), 10901, (long)groupId);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            NanoTickClock.field_m.reset();
            NanoTickClock.field_m.update(var5, 0, var18.length - 2);
            var6_int = (int)NanoTickClock.field_m.getValue();
            if (var6_int != this.index.groupCrc32s[groupId]) {
              throw new RuntimeException();
            }
            if (this.index.groupDigests != null &&
              null != this.index.groupDigests[groupId]) {
              byte[] var30 = this.index.groupDigests[groupId];
              byte[] var29 = RasterBuffer.whirlpoolDigest(var5, 0, -2 + var18.length, 0);
              int var11 = 0;
              var9 = var11;
              while (var11 < 64) {
                if (var29[var11] != var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.transport.failureCount = 0;
            this.transport.lastErrorCode = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.transport.resetAfterIntegrityFailure((byte) -110);
          ((ArchiveRequest) (var4)).unlink((byte) -86);
          if (!((ArchiveRequest) (var4)).field_r) {
            return null;
          }
          if (this.transport.isUrgentCapacityReached(guard - 23854)) {
            return null;
          }
          var4 = this.transport.requestGroup(this.archiveId, true, (byte) 0, groupId, (byte) 2);
          this.requests.put((IntrusiveNode) (var4), 10901, (long)groupId);
          return null;
        }
        var5[var18.length - 2] = (byte)(this.index.groupVersions[groupId] >>> 8);
        var5[var18.length - 1] = (byte)this.index.groupVersions[groupId];
        if (null != this.groupStore) {
          this.diskWorker.enqueueOperation(var18, groupId, guard ^ 23872, this.groupStore);
          if (this.groupStates[groupId] != 1) {
            this.groupStates[groupId] = (byte) 1;
          }
        }
        if (!((ArchiveRequest) (var4)).field_r) {
          ((ArchiveRequest) (var4)).unlink((byte) -86);
        }
        return (ArchiveRequest) (var4);
    }

    final void servicePrefetchQueue(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        if (null == this.backgroundQueue) {
          return;
        }
        if (this.getIndex(29192) == null) {
          return;
        }
        if (guard != -1) {
          this.getEncodedGroup((byte) -27, -44);
        }
        IntrusiveNode var2 = this.prefetchQueue.first(false);
        while (var2 != null) {
          int var3 = (int)var2.key;
          if (var3 < 0) {
            var2.unlink((byte) -57);
          } else if (var3 >= this.index.groupCapacity) {
            var2.unlink((byte) -57);
          } else if (this.index.groupFileCounts[var3] == 0) {
            var2.unlink((byte) -57);
          } else {
            if (this.groupStates[var3] == 0) {
              ArchiveRequest discarded$0 = this.pollGroupRequest(var3, 1, guard ^ -23875);
            }
            if (this.groupStates[var3] == -1) {
              ArchiveRequest discarded$1 = this.pollGroupRequest(var3, 2, 23874);
            }
            if (this.groupStates[var3] == 1) {
              var2.unlink((byte) -118);
            }
          }
          var2 = this.prefetchQueue.next((byte) 70);
        }
    }

    final static Sprite loadSpriteFromArchive(ResourceArchive archive, boolean guard, int fileId, int groupId) {
        String stackIn_10_2 = null;
        try {
          if (!guard) {
            CachedArchiveProvider.releaseStatics((byte) 80);
          }
          if (ArchivePreloader.loadSpriteSheet(archive, 116, groupId, fileId)) {
            Sprite stackIn_6_0 = SpriteFactorySupport.buildSpriteFromSheet(100);
            return stackIn_6_0;
          }
          Object stackIn_4_0 = null;
          return (Sprite) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var4;
          StringBuilder stackIn_9_1 = new StringBuilder().append("hk.H(");
          if (archive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(',').append(fileId).append(',').append(groupId).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        field_r = null;
        if (guard != 8) {
          field_r = (String[]) null;
        }
        field_w = null;
    }

    final static int hitTestLegacyMenuAction(byte guard, int x, int y) {
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var3_int = 0;
          int var4 = EmailSyntaxValidator.field_o;
          if (guard != 122) {
            CachedArchiveProvider.loadMemberCampaignAssets(91);
          }
          while (Js5NetworkRequest.field_I.length > var3_int) {
            int var5 = LoginPromptSupport.field_a[var3_int];
            if (0 <= var5) {
              int var6 = LoginMethod.legacyMenuTextWidth(98, Js5NetworkRequest.field_I[var3_int], true);
              var4 = var4 + CheckboxPainter.field_s;
              int var7 = -(var6 >> 1) + ClientException.field_e;
              if (DualLinkNode.a(x, (AchievementTracker.field_k << 1) + IntroFrameRenderer.field_a, guard ^ -123, var4, -MembershipPromotionScreen.field_k + var7, (MembershipPromotionScreen.field_k << 1) + var6, y)) {
                int stackIn_8_0 = var5;
                return stackIn_8_0;
              }
              var4 = var4 + (CheckboxPainter.field_s + (AchievementTracker.field_k << 1) + IntroFrameRenderer.field_a);
            } else {
              var4 = var4 + SpriteFactorySupport.field_b;
            }
            var3_int++;
          }
          int stackIn_12_0 = -1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var3), "hk.G(" + guard + ',' + x + ',' + y + ')');
        }
    }

    CachedArchiveProvider(int archiveId, SectorCacheStore groupStore, SectorCacheStore indexStore, Js5Transport transport, DiskCacheWorker diskWorker, int indexCrc32, byte[] indexDigest, int indexRevision, boolean cleanupEnabled) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        String stackIn_19_2 = null;
        String stackIn_22_2 = null;
        String stackIn_25_2 = null;
        this.requests = new IntrusiveNodeHashTable(16);
        this.scanGroupId = 0;
        this.prefetchQueue = new IntrusiveDeque();
        this.nextCleanupMillis = 0L;
        try {
          this.archiveId = archiveId;
          this.groupStore = groupStore;
          if (null == this.groupStore) {
            this.verifyingCache = false;
          } else {
            this.verifyingCache = true;
            this.backgroundQueue = new IntrusiveDeque();
          }
          this.indexRevision = indexRevision;
          this.indexStore = indexStore;
          this.diskWorker = diskWorker;
          this.transport = transport;
          this.indexDigest = indexDigest;
          this.indexCrc32 = indexCrc32;
          boolean stackIn_7_1 = (cleanupEnabled);
          this.cleanupEnabled = stackIn_7_1;
          if (this.indexStore != null) {
            this.indexRequest = (ArchiveRequest) ((Object) this.diskWorker.readImmediate(this.indexStore, 106, this.archiveId));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var10;
          StringBuilder stackIn_12_1 = new StringBuilder().append("hk.<init>(").append(archiveId).append(',');
          if (groupStore == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (indexStore == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (transport == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          StringBuilder stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (diskWorker == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          StringBuilder stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(indexCrc32).append(',');
          if (indexDigest == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(indexRevision).append(',').append(cleanupEnabled).append(')').toString());
        }
    }

    static {
        field_r = new String[]{"Belter Award", "Moon Runner", "Moon Raker", "Hero of Earth", "Star Pilot", "Ace Pilot", "Fuel Filler", "Tough Destroyer", "Speed Nitwit", "Speed Freak", "Speed Demon", "Power Pilot", "Spirit of Vengeance", "Force King", "Seeker Shaker", "Flak Dancer", "Seeker Slingshot", "G Force", "Belter Award (Normal)", "Moon Runner (Normal)", "Moon Raker (Normal)", "Hero of Earth (Normal)", "High Octane", "Ore Crusher", "Cold Fusion", "Saviour of Earth", "Heroic Pilot", "Ultimate Pilot", "Total Annihilation", "Virtual Reality", "Bouncing Around", "Free Fall"};
        UsernameCredentials.cacheCompletionHook(50, (byte) -6);
    }
}
