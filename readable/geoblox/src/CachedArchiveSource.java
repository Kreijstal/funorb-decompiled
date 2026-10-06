/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedArchiveSource extends ArchiveSource {
    private IntrusiveNodeHashTable groupRequests;
    static boolean accountCreationNewsOptIn;
    private int expectedIndexRevision;
    static int[] projectedMeshVertexDepth;
    private ArchiveNetworkClient networkClient;
    private ArchiveRequest indexRequest;
    private int archiveId;
    private DiskCacheWorker diskWorker;
    private int expectedIndexCrc32;
    private DiskArchiveCache indexDiskCache;
    static IndexedSprite jewelsBackgroundSprite;
    private byte[] groupDiskStatus;
    private byte[] expectedIndexWhirlpoolDigest;
    private ArchiveIndex index;
    private DiskArchiveCache groupDiskCache;
    private int backgroundGroupIndex;
    private boolean downloadAllPending;
    private IntrusiveDeque requestedGroups;
    private boolean verifyDiskCachePending;
    private IntrusiveDeque backgroundGroups;
    private boolean sweepCompletedRequests;
    private long nextRequestSweepMillis;

    final ArchiveIndex getIndex(byte methodGuard) {
        RuntimeException caughtIndexFailure = null;
        byte[] indexBytesForValidation = null;
        RuntimeException indexFailureForRetry = null;
        int unusedClientGuardSnapshot = 0;
        byte[] indexBytesForNullCheck = null;
        byte[] indexBytesFromRequest = null;
        byte[] indexBytesBeforeValidation = null;
        byte[] indexBytesAfterRequest = null;
        byte[] indexBytesForDiskValidation = null;
        unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        if (null != this.index) {
          return this.index;
        }
        if (this.indexRequest == null) {
          if (this.networkClient.isPriorityQueueFull(20)) {
            return null;
          }
          this.indexRequest = (ArchiveRequest) ((Object) this.networkClient.queueRequest((byte) 0, 255, -21, this.archiveId, true));
        }
        if (methodGuard <= 111) {
          this.advanceBackgroundLoading((byte) 65);
        }
        if (this.indexRequest.pending) {
          return null;
        }
        indexBytesAfterRequest = this.indexRequest.getBytes(397);
        indexBytesFromRequest = indexBytesAfterRequest;
        indexBytesForNullCheck = indexBytesFromRequest;
        indexBytesForDiskValidation = indexBytesForNullCheck;
        indexBytesBeforeValidation = indexBytesForDiskValidation;
        indexBytesForValidation = indexBytesBeforeValidation;
        if (this.indexRequest instanceof DiskArchiveRequest) {
          try {
            if (indexBytesForValidation == null) {
              throw new RuntimeException();
            }
            this.index = new ArchiveIndex(indexBytesForDiskValidation, this.expectedIndexCrc32, this.expectedIndexWhirlpoolDigest);
            if (this.index.indexRevision != this.expectedIndexRevision) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException diskIndexFailure) {
            caughtIndexFailure = diskIndexFailure;
            indexFailureForRetry = caughtIndexFailure;
            this.index = null;
            if (!this.networkClient.isPriorityQueueFull(20)) {
              this.indexRequest = (ArchiveRequest) ((Object) this.networkClient.queueRequest((byte) 0, 255, -21, this.archiveId, true));
            } else {
              this.indexRequest = null;
            }
            return null;
          }
        } else {
          try {
            if (indexBytesForNullCheck == null) {
              throw new RuntimeException();
            }
            this.index = new ArchiveIndex(indexBytesAfterRequest, this.expectedIndexCrc32, this.expectedIndexWhirlpoolDigest);
          } catch (java.lang.RuntimeException networkIndexFailure) {
            caughtIndexFailure = networkIndexFailure;
            indexFailureForRetry = caughtIndexFailure;
            this.networkClient.resetAfterValidationFailure(20);
            this.index = null;
            if (this.networkClient.isPriorityQueueFull(20)) {
              this.indexRequest = null;
            } else {
              this.indexRequest = (ArchiveRequest) ((Object) this.networkClient.queueRequest((byte) 0, 255, -21, this.archiveId, true));
            }
            return null;
          }
          if (null != this.indexDiskCache) {
            this.diskWorker.queueWrite((byte) 88, this.archiveId, this.indexDiskCache, indexBytesAfterRequest);
          }
        }
        this.indexRequest = null;
        if (this.groupDiskCache != null) {
          this.groupDiskStatus = new byte[this.index.groupSlotCount];
        }
        return this.index;
    }

    private final ArchiveRequest getGroupRequest(byte methodGuard, int requestMode, int groupId) {
        Object validatedDiskRequestBeforeReturn = null;
        int complementedDiskStatusBeforeWrite = 0;
        int complementedValidStatus = 0;
        Throwable caughtValidationFailure = null;
        Object request = null;
        byte[] groupBytes = null;
        int payloadCrc32 = 0;
        RuntimeException networkValidationFailure = null;
        Exception diskValidationFailure = null;
        int storedGroupRevision = 0;
        int digestByteIndex = 0;
        int unusedClientGuardSnapshot = 0;
        int networkDigestByteIndex = 0;
        ArchiveRequest cachedRequest = null;
        byte[] groupBytesFromRequest = null;
        byte[] groupBytesForPayloadChecks = null;
        byte[] expectedDiskGroupDigest = null;
        byte[] computedDiskGroupDigest = null;
        byte[] computedNetworkGroupDigest = null;
        byte[] expectedNetworkGroupDigest = null;
        unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        cachedRequest = (ArchiveRequest) ((Object) this.groupRequests.findByKey((long)groupId, (byte) -124));
        request = cachedRequest;
        if (cachedRequest != null &&
            requestMode == 0 &&
            !cachedRequest.priority &&
            cachedRequest.pending) {
          cachedRequest.unlinkNode(false);
          request = null;
        }
        if (request == null) {
          if (requestMode != 0) {
            if (requestMode == 1) {
              if (null == this.groupDiskCache) {
                throw new RuntimeException();
              }
              request = this.diskWorker.queueRead(methodGuard + 131, this.groupDiskCache, groupId);
            } else {
              if (requestMode != 2) {
                throw new RuntimeException();
              }
              if (null == this.groupDiskCache) {
                throw new RuntimeException();
              }
              if (this.groupDiskStatus[groupId] != -1) {
                throw new RuntimeException();
              }
              if (this.networkClient.isBackgroundQueueFull(-21)) {
                return null;
              }
              request = this.networkClient.queueRequest((byte) 2, this.archiveId, methodGuard + 50, groupId, false);
            }
          } else {
            if (null != this.groupDiskCache &&
                -1 != this.groupDiskStatus[groupId]) {
              request = this.diskWorker.readSynchronously(this.groupDiskCache, groupId, 15079962);
            } else {
              if (this.networkClient.isPriorityQueueFull(20)) {
                return null;
              }
              request = this.networkClient.queueRequest((byte) 2, this.archiveId, -21, groupId, true);
            }
          }
          this.groupRequests.put((byte) 102, (IntrusiveNode) (request), (long)groupId);
        }
        if (((ArchiveRequest) (request)).pending) {
          return null;
        }
        groupBytesForPayloadChecks = ((ArchiveRequest) (request)).getBytes(397);
        groupBytesFromRequest = groupBytesForPayloadChecks;
        groupBytes = groupBytesFromRequest;
        if (methodGuard != -71) {
          return (ArchiveRequest) null;
        }
        if (request instanceof DiskArchiveRequest) {
          try {
            if (groupBytes != null &&
                groupBytesForPayloadChecks.length > 2) {
              WhirlpoolHash.archivePayloadCrc32.reset();
              WhirlpoolHash.archivePayloadCrc32.update(groupBytes, 0, groupBytesForPayloadChecks.length - 2);
              payloadCrc32 = (int)WhirlpoolHash.archivePayloadCrc32.getValue();
              if (payloadCrc32 != this.index.groupCrc32[groupId]) {
                throw new RuntimeException();
              }
              if (this.index.groupWhirlpoolDigests != null &&
                  null != this.index.groupWhirlpoolDigests[groupId]) {
                expectedDiskGroupDigest = this.index.groupWhirlpoolDigests[groupId];
                computedDiskGroupDigest = SpriteState.computeWhirlpoolDigest(-2 + groupBytesForPayloadChecks.length, 0, groupBytesForPayloadChecks, 8);
                for (digestByteIndex = 0; digestByteIndex < 64; digestByteIndex++) {
                  if (~expectedDiskGroupDigest[digestByteIndex] != ~computedDiskGroupDigest[digestByteIndex]) {
                    throw new RuntimeException();
                  }
                }
              }
              storedGroupRevision = (groupBytes[-2 + groupBytesForPayloadChecks.length] << 8 & 65280) + (groupBytes[groupBytesForPayloadChecks.length - 1] & 255);
              if ((65535 & this.index.groupRevisions[groupId]) != storedGroupRevision) {
                throw new RuntimeException();
              }
              if (this.groupDiskStatus[groupId] != 1) {
                if (this.groupDiskStatus[groupId] != 0) {
                }
                this.groupDiskStatus[groupId] = (byte) 1;
              }
              if (!((ArchiveRequest) (request)).priority) {
                ((ArchiveRequest) (request)).unlinkNode(false);
              }
              validatedDiskRequestBeforeReturn = request;
              return (ArchiveRequest) (validatedDiskRequestBeforeReturn);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception diskFailure) {
            caughtValidationFailure = diskFailure;
            diskValidationFailure = (Exception) (Object) caughtValidationFailure;
            this.groupDiskStatus[groupId] = (byte)-1;
            ((ArchiveRequest) (request)).unlinkNode(false);
            if (!((ArchiveRequest) (request)).priority) {
              return null;
            }
            if (this.networkClient.isPriorityQueueFull(20)) {
              return null;
            }
            request = this.networkClient.queueRequest((byte) 2, this.archiveId, -21, groupId, true);
            this.groupRequests.put((byte) 102, (IntrusiveNode) (request), (long)groupId);
            return null;
          }
        }
        try {
          if (groupBytes != null &&
              groupBytesForPayloadChecks.length > 2) {
            WhirlpoolHash.archivePayloadCrc32.reset();
            WhirlpoolHash.archivePayloadCrc32.update(groupBytes, 0, groupBytesForPayloadChecks.length - 2);
            payloadCrc32 = (int)WhirlpoolHash.archivePayloadCrc32.getValue();
            if (payloadCrc32 != this.index.groupCrc32[groupId]) {
              throw new RuntimeException();
            }
            if (null != this.index.groupWhirlpoolDigests &&
                null != this.index.groupWhirlpoolDigests[groupId]) {
              expectedNetworkGroupDigest = this.index.groupWhirlpoolDigests[groupId];
              computedNetworkGroupDigest = SpriteState.computeWhirlpoolDigest(-2 + groupBytesForPayloadChecks.length, 0, groupBytesForPayloadChecks, 8);
              networkDigestByteIndex = 0;
              digestByteIndex = networkDigestByteIndex;
              while (networkDigestByteIndex < 64) {
                if (~computedNetworkGroupDigest[networkDigestByteIndex] != ~expectedNetworkGroupDigest[networkDigestByteIndex]) {
                  throw new RuntimeException();
                }
                networkDigestByteIndex++;
              }
            }
            this.networkClient.failureCount = 0;
            this.networkClient.failureCode = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException networkFailure) {
          caughtValidationFailure = networkFailure;
          networkValidationFailure = (RuntimeException) (Object) caughtValidationFailure;
          this.networkClient.resetAfterValidationFailure(20);
          ((ArchiveRequest) (request)).unlinkNode(false);
          if (((ArchiveRequest) (request)).priority &&
              !this.networkClient.isPriorityQueueFull(methodGuard ^ -83)) {
            request = this.networkClient.queueRequest((byte) 2, this.archiveId, -21, groupId, true);
            this.groupRequests.put((byte) 102, (IntrusiveNode) (request), (long)groupId);
          }
          return null;
        }
        groupBytes[groupBytesForPayloadChecks.length - 2] = (byte)(this.index.groupRevisions[groupId] >>> 8);
        groupBytes[-1 + groupBytesForPayloadChecks.length] = (byte)this.index.groupRevisions[groupId];
        if (null != this.groupDiskCache) {
          this.diskWorker.queueWrite((byte) 66, groupId, this.groupDiskCache, groupBytesForPayloadChecks);
          complementedDiskStatusBeforeWrite = ~this.groupDiskStatus[groupId];
          complementedValidStatus = -2;
          if (complementedDiskStatusBeforeWrite != complementedValidStatus) {
            this.groupDiskStatus[groupId] = (byte) 1;
          }
        }
        if (!((ArchiveRequest) (request)).priority) {
          ((ArchiveRequest) (request)).unlinkNode(false);
        }
        return (ArchiveRequest) (request);
    }

    final static String reverseTextCodeUnits(int methodGuard, String text) {
        int characterIndex = 0;
        int textLength = 0;
        RuntimeException reverseFailureForContext = null;
        char[] reversedCharacters = null;
        int clientControlFlowGuard = 0;
        String guardedNullTextSnapshot = null;
        String reversedTextBeforeReturn = null;
        RuntimeException reverseFailureBeforeContext = null;
        StringBuilder reverseMessagePrefix = null;
        String textDescription = null;
        RuntimeException caughtReverseFailure = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          textLength = text.length();
          reversedCharacters = new char[textLength];
          for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
            reversedCharacters[-characterIndex + (-1 + textLength)] = text.charAt(characterIndex);
          }
          if (methodGuard < 26) {
            guardedNullTextSnapshot = (String) null;
            CachedArchiveSource.reverseTextCodeUnits(68, (String) null);
          }
          reversedTextBeforeReturn = new String(reversedCharacters);
          return reversedTextBeforeReturn;
        } catch (java.lang.RuntimeException reverseFailure) {
          caughtReverseFailure = reverseFailure;
          reverseFailureForContext = caughtReverseFailure;
          reverseFailureBeforeContext = reverseFailureForContext;
          reverseMessagePrefix = new StringBuilder().append("bj.A(").append(methodGuard).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) reverseFailureBeforeContext), ((StringBuilder) (Object) reverseMessagePrefix).append(textDescription).append(')').toString());
        }
    }

    final byte[] getPackedGroup(int methodGuard, int groupId) {
        ArchiveRequest groupRequest = this.getGroupRequest((byte) -71, 0, groupId);
        if (groupRequest == null) {
            return null;
        }
        byte[] packedBytes = groupRequest.getBytes(397);
        groupRequest.unlinkNode(false);
        if (methodGuard != 4) {
            this.requestAllGroups(49);
        }
        return packedBytes;
    }

    final int getGroupProgress(int methodGuard, int groupId) {
        ArchiveRequest groupRequest = (ArchiveRequest) ((Object) this.groupRequests.findByKey((long)groupId, (byte) -102));
        if (methodGuard < 125) {
            return -119;
        }
        if (groupRequest != null) {
            return groupRequest.getProgress(0);
        }
        return 0;
    }

    public static void releaseStaticReferences(boolean methodGuard) {
        if (!methodGuard) {
            return;
        }
        jewelsBackgroundSprite = null;
        projectedMeshVertexDepth = null;
    }

    final void requestAllGroups(int methodGuard) {
        if (this.groupDiskCache == null) {
            return;
        }
        if (methodGuard < 80) {
            this.nextRequestSweepMillis = -51L;
        }
        this.downloadAllPending = true;
        if (this.backgroundGroups == null) {
            this.backgroundGroups = new IntrusiveDeque();
        }
    }

    final void processRequestedGroups(int methodGuard) {
        int groupId = 0;
        ArchiveRequest unusedDiskVerificationRequest = null;
        ArchiveRequest unusedBackgroundDownloadRequest = null;
        int unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        if (methodGuard != 6924) {
            this.advanceBackgroundLoading((byte) -7);
        }
        if (this.backgroundGroups == null) {
            return;
        }
        if (null == this.getIndex((byte) 126)) {
            return;
        }
        IntrusiveNode requestedGroup = this.requestedGroups.firstForIteration(0);
        while (requestedGroup != null) {
            groupId = (int)requestedGroup.nodeKey;
            if (groupId < 0) {
                requestedGroup.unlinkNode(false);
            } else {
                if (groupId >= this.index.groupSlotCount) {
                    requestedGroup.unlinkNode(false);
                } else {
                    if (this.index.fileCounts[groupId] == 0) {
                        requestedGroup.unlinkNode(false);
                    } else {
                        if (this.groupDiskStatus[groupId] == 0) {
                            unusedDiskVerificationRequest = this.getGroupRequest((byte) -71, 1, groupId);
                        }
                        if (-1 == this.groupDiskStatus[groupId]) {
                            unusedBackgroundDownloadRequest = this.getGroupRequest((byte) -71, 2, groupId);
                        }
                        if (this.groupDiskStatus[groupId] == 1) {
                            requestedGroup.unlinkNode(false);
                        }
                    }
                }
            }
            requestedGroup = this.requestedGroups.nextForIteration(1);
        }
    }

    final void advanceBackgroundLoading(byte methodGuard) {
        ArchiveRequest unusedQueuedDiskVerificationRequest = null;
        ArchiveRequest unusedScannedDiskVerificationRequest = null;
        ArchiveRequest unusedQueuedBackgroundDownloadRequest = null;
        ArchiveRequest unusedScannedBackgroundDownloadRequest = null;
        int phaseComplete;
        ArchiveRequest cleanupRequest;
        IntrusiveNode backgroundGroup;
        int groupId;
        int unusedClientGuardSnapshot;
        IntrusiveNode newDownloadGroup;
        IntrusiveNode newVerificationGroup;
        backgroundLoadingAndSweep: {
          requestSweepDueCheck: {
            completedRequestSweep: {
              backgroundGroupLoading: {
                unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
                if (this.backgroundGroups != null) {
                  if (null == this.getIndex((byte) 118)) {
                    return;
                  }
                  if (this.verifyDiskCachePending) {
                    phaseComplete = 1;
                    backgroundGroup = this.backgroundGroups.firstForIteration(0);
                    while (backgroundGroup != null) {
                      groupId = (int)backgroundGroup.nodeKey;
                      if (this.groupDiskStatus[groupId] == 0) {
                        unusedQueuedDiskVerificationRequest = this.getGroupRequest((byte) -71, 1, groupId);
                      }
                      if (this.groupDiskStatus[groupId] != 0) {
                        backgroundGroup.unlinkNode(false);
                      } else {
                        phaseComplete = 0;
                      }
                      backgroundGroup = this.backgroundGroups.nextForIteration(1);
                    }
                    while (this.backgroundGroupIndex < this.index.fileCounts.length) {
                      if (0 == this.index.fileCounts[this.backgroundGroupIndex]) {
                        this.backgroundGroupIndex = this.backgroundGroupIndex + 1;
                        continue;
                      }
                      if (this.diskWorker.queuedRequestCount < 250) {
                        if (this.groupDiskStatus[this.backgroundGroupIndex] == 0) {
                          unusedScannedDiskVerificationRequest = this.getGroupRequest((byte) -71, 1, this.backgroundGroupIndex);
                        }
                        if (0 == this.groupDiskStatus[this.backgroundGroupIndex]) {
                          newVerificationGroup = new IntrusiveNode();
                          newVerificationGroup.nodeKey = (long)this.backgroundGroupIndex;
                          phaseComplete = 0;
                          this.backgroundGroups.addLast(-45, newVerificationGroup);
                        }
                        this.backgroundGroupIndex = this.backgroundGroupIndex + 1;
                        continue;
                      }
                      phaseComplete = 0;
                      break;
                    }
                    if (phaseComplete == 0) {
                      break backgroundGroupLoading;
                    }
                    this.backgroundGroupIndex = 0;
                    this.verifyDiskCachePending = false;
                    break backgroundGroupLoading;
                  }
                  if (this.downloadAllPending) {
                    phaseComplete = 1;
                    backgroundGroup = this.backgroundGroups.firstForIteration(0);
                    while (backgroundGroup != null) {
                      groupId = (int)backgroundGroup.nodeKey;
                      if (this.groupDiskStatus[groupId] != 1) {
                        unusedQueuedBackgroundDownloadRequest = this.getGroupRequest((byte) -71, 2, groupId);
                      }
                      if (this.groupDiskStatus[groupId] != 1) {
                        phaseComplete = 0;
                      } else {
                        backgroundGroup.unlinkNode(false);
                      }
                      backgroundGroup = this.backgroundGroups.nextForIteration(1);
                    }
                    backgroundDownloadScanStep: while (true) {
                      if (this.backgroundGroupIndex < this.index.fileCounts.length) {
                        if (this.index.fileCounts[this.backgroundGroupIndex] != 0) {
                          if (this.networkClient.isBackgroundQueueFull(-21)) {
                            phaseComplete = 0;
                            break backgroundDownloadScanStep;
                          }
                          if (this.groupDiskStatus[this.backgroundGroupIndex] != 1) {
                            unusedScannedBackgroundDownloadRequest = this.getGroupRequest((byte) -71, 2, this.backgroundGroupIndex);
                          }
                          if (this.groupDiskStatus[this.backgroundGroupIndex] != 1) {
                            newDownloadGroup = new IntrusiveNode();
                            newDownloadGroup.nodeKey = (long)this.backgroundGroupIndex;
                            phaseComplete = 0;
                            this.backgroundGroups.addLast(-97, newDownloadGroup);
                          }
                        }
                        this.backgroundGroupIndex = this.backgroundGroupIndex + 1;
                        continue;
                      }
                      break;
                    }
                    if (phaseComplete != 0) {
                      this.downloadAllPending = false;
                      this.backgroundGroupIndex = 0;
                      break backgroundGroupLoading;
                    }
                    if (methodGuard != -38) {
                      this.getPackedGroup(25, 41);
                    }
                    if (!this.sweepCompletedRequests) {
                      break backgroundLoadingAndSweep;
                    }
                    if (ClientClockSupport.correctedCurrentTimeMillis(-12520) < this.nextRequestSweepMillis) {
                      break requestSweepDueCheck;
                    }
                    cleanupRequest = (ArchiveRequest) ((Object) this.groupRequests.firstForIteration((byte) 125));
                    while (cleanupRequest != null) {
                      if (!cleanupRequest.pending) {
                        if (cleanupRequest.seenByCleanup) {
                          if (!cleanupRequest.priority) {
                            throw new RuntimeException();
                          }
                          cleanupRequest.unlinkNode(false);
                        } else {
                          cleanupRequest.seenByCleanup = true;
                        }
                      }
                      cleanupRequest = (ArchiveRequest) ((Object) this.groupRequests.nextForIteration(74));
                    }
                    break completedRequestSweep;
                  }
                  this.backgroundGroups = null;
                }
              }
              if (methodGuard != -38) {
                this.getPackedGroup(25, 41);
              }
              if (!this.sweepCompletedRequests) {
                break backgroundLoadingAndSweep;
              }
              if (ClientClockSupport.correctedCurrentTimeMillis(-12520) < this.nextRequestSweepMillis) {
                break requestSweepDueCheck;
              }
              cleanupRequest = (ArchiveRequest) ((Object) this.groupRequests.firstForIteration((byte) 125));
              while (cleanupRequest != null) {
                if (!cleanupRequest.pending) {
                  if (cleanupRequest.seenByCleanup) {
                    if (!cleanupRequest.priority) {
                      throw new RuntimeException();
                    }
                    cleanupRequest.unlinkNode(false);
                  } else {
                    cleanupRequest.seenByCleanup = true;
                  }
                }
                cleanupRequest = (ArchiveRequest) ((Object) this.groupRequests.nextForIteration(74));
              }
            }
            this.nextRequestSweepMillis = 1000L + ClientClockSupport.correctedCurrentTimeMillis(methodGuard - 12482);
          }
        }
    }

    CachedArchiveSource(int archiveId, DiskArchiveCache groupDiskCache, DiskArchiveCache indexDiskCache, ArchiveNetworkClient networkClient, DiskCacheWorker diskWorker, int expectedIndexCrc32, byte[] expectedIndexWhirlpoolDigest, int expectedIndexRevision, boolean sweepCompletedRequests) {
        boolean sweepOptionSnapshot = false;
        RuntimeException constructionFailureBeforeContext = null;
        StringBuilder constructionMessagePrefix = null;
        String groupDiskCacheDescription = null;
        StringBuilder constructionMessageBeforeIndexCache = null;
        String indexDiskCacheDescription = null;
        StringBuilder constructionMessageBeforeNetwork = null;
        String networkClientDescription = null;
        StringBuilder constructionMessageBeforeWorker = null;
        String diskWorkerDescription = null;
        StringBuilder constructionMessageBeforeDigest = null;
        String expectedDigestDescription = null;
        RuntimeException caughtConstructionFailure = null;
        RuntimeException constructionFailureForContext = null;
        this.groupRequests = new IntrusiveNodeHashTable(16);
        this.backgroundGroupIndex = 0;
        this.requestedGroups = new IntrusiveDeque();
        this.nextRequestSweepMillis = 0L;
        try {
          this.groupDiskCache = groupDiskCache;
          this.archiveId = archiveId;
          if (null == this.groupDiskCache) {
            this.verifyDiskCachePending = false;
          } else {
            this.verifyDiskCachePending = true;
            this.backgroundGroups = new IntrusiveDeque();
          }
          this.diskWorker = diskWorker;
          this.indexDiskCache = indexDiskCache;
          sweepOptionSnapshot = !(!sweepCompletedRequests);
          this.sweepCompletedRequests = sweepOptionSnapshot;
          this.expectedIndexWhirlpoolDigest = expectedIndexWhirlpoolDigest;
          this.networkClient = networkClient;
          this.expectedIndexRevision = expectedIndexRevision;
          this.expectedIndexCrc32 = expectedIndexCrc32;
          if (this.indexDiskCache != null) {
            this.indexRequest = (ArchiveRequest) ((Object) this.diskWorker.readSynchronously(this.indexDiskCache, this.archiveId, 15079962));
          }
          return;
        } catch (java.lang.RuntimeException constructionFailure) {
          caughtConstructionFailure = constructionFailure;
          constructionFailureForContext = caughtConstructionFailure;
          constructionFailureBeforeContext = constructionFailureForContext;
          constructionMessagePrefix = new StringBuilder().append("bj.<init>(").append(archiveId).append(',');
          if (groupDiskCache == null) {
            groupDiskCacheDescription = "null";
          } else {
            groupDiskCacheDescription = "{...}";
          }
          constructionMessageBeforeIndexCache = ((StringBuilder) (Object) constructionMessagePrefix).append(groupDiskCacheDescription).append(',');
          if (indexDiskCache == null) {
            indexDiskCacheDescription = "null";
          } else {
            indexDiskCacheDescription = "{...}";
          }
          constructionMessageBeforeNetwork = ((StringBuilder) (Object) constructionMessageBeforeIndexCache).append(indexDiskCacheDescription).append(',');
          if (networkClient == null) {
            networkClientDescription = "null";
          } else {
            networkClientDescription = "{...}";
          }
          constructionMessageBeforeWorker = ((StringBuilder) (Object) constructionMessageBeforeNetwork).append(networkClientDescription).append(',');
          if (diskWorker == null) {
            diskWorkerDescription = "null";
          } else {
            diskWorkerDescription = "{...}";
          }
          constructionMessageBeforeDigest = ((StringBuilder) (Object) constructionMessageBeforeWorker).append(diskWorkerDescription).append(',').append(expectedIndexCrc32).append(',');
          if (expectedIndexWhirlpoolDigest == null) {
            expectedDigestDescription = "null";
          } else {
            expectedDigestDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) constructionFailureBeforeContext), ((StringBuilder) (Object) constructionMessageBeforeDigest).append(expectedDigestDescription).append(',').append(expectedIndexRevision).append(',').append(sweepCompletedRequests).append(')').toString());
        }
    }

    static {
        projectedMeshVertexDepth = new int[8192];
    }
}
