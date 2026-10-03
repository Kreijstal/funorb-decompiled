/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveCatalog {
    private ArchiveNetworkClient networkClient;
    private DiskCacheWorker diskWorker;
    private NetworkArchiveRequest catalogRequest;
    private java.math.BigInteger verificationModulus;
    private java.math.BigInteger verificationExponent;
    private CachedArchiveSource[] archiveSources;
    static String field_a;
    private ByteArrayBuffer catalogBuffer;

    final static boolean b(int param0) {
        if (param0 != 255) {
            return false;
        }
        if (null == InstrumentPatch.field_n) {
            return false;
        }
        nb.a(-2, InstrumentPatch.field_n);
        InstrumentPatch.field_n.a(0, MenuScreen.platformTaskDispatcher);
        InstrumentPatch.field_n = null;
        return true;
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_10_0 = false;
        if (param1 != 97) {
          field_a = (String) null;
        }
        if (!((65 <= param0) &&
              (param0 <= 90)) &&
            !((97 <= param0) &&
              (param0 <= 122))) {
          stackIn_10_0 = false;
        } else {
          stackIn_10_0 = true;
        }
        return stackIn_10_0;
    }

    public static void a(int param0) {
        if (param0 < 8) {
            return;
        }
        field_a = null;
    }

    ArchiveCatalog(ArchiveNetworkClient networkClient, DiskCacheWorker diskWorker) {
        this(networkClient, diskWorker, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final CachedArchiveSource getArchiveSource(int archiveId, byte methodGuard, boolean sweepCompletedRequests, DiskArchiveCache indexDiskCache, DiskArchiveCache groupDiskCache) {
        CachedArchiveSource cachedSourceBeforeReturn = null;
        CachedArchiveSource createdSourceBeforeReturn = null;
        RuntimeException sourceFailureBeforeContext = null;
        StringBuilder sourceMessagePrefix = null;
        String indexDiskCacheDescription = null;
        StringBuilder sourceMessageBeforeGroupCache = null;
        String groupDiskCacheDescription = null;
        RuntimeException caughtSourceFailure = null;
        int expectedIndexCrc32 = 0;
        RuntimeException sourceFailureForContext = null;
        int expectedIndexRevision = 0;
        CachedArchiveSource source = null;
        byte[] expectedIndexWhirlpoolDigest = null;
        try {
          if (this.catalogBuffer == null) {
            throw new RuntimeException();
          }
          if ((archiveId >= 0) &&
              (this.archiveSources.length > archiveId)) {
            if (null != this.archiveSources[archiveId]) {
              cachedSourceBeforeReturn = this.archiveSources[archiveId];
              return cachedSourceBeforeReturn;
            }
            this.catalogBuffer.position = 6 + 72 * archiveId;
            expectedIndexCrc32 = this.catalogBuffer.readIntBE((byte) -108);
            expectedIndexRevision = this.catalogBuffer.readIntBE((byte) -55);
            expectedIndexWhirlpoolDigest = new byte[64];
            if (methodGuard != -9) {
              this.catalogRequest = (NetworkArchiveRequest) null;
            }
            this.catalogBuffer.readBytes(29915, 64, expectedIndexWhirlpoolDigest, 0);
            source = new CachedArchiveSource(archiveId, groupDiskCache, indexDiskCache, this.networkClient, this.diskWorker, expectedIndexCrc32, expectedIndexWhirlpoolDigest, expectedIndexRevision, sweepCompletedRequests);
            this.archiveSources[archiveId] = source;
            createdSourceBeforeReturn = (CachedArchiveSource) (source);
            return createdSourceBeforeReturn;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException sourceFailure) {
          caughtSourceFailure = sourceFailure;
          sourceFailureForContext = caughtSourceFailure;
          sourceFailureBeforeContext = (RuntimeException) (sourceFailureForContext);
          sourceMessagePrefix = new StringBuilder().append("em.E(").append(archiveId).append(',').append(methodGuard).append(',').append(sweepCompletedRequests).append(',');
          if (indexDiskCache == null) {
            indexDiskCacheDescription = "null";
          } else {
            indexDiskCacheDescription = "{...}";
          }
          sourceMessageBeforeGroupCache = ((StringBuilder) (Object) sourceMessagePrefix).append(indexDiskCacheDescription).append(',');
          if (groupDiskCache == null) {
            groupDiskCacheDescription = "null";
          } else {
            groupDiskCacheDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) sourceFailureBeforeContext), ((StringBuilder) (Object) sourceMessageBeforeGroupCache).append(groupDiskCacheDescription).append(')').toString());
        }
    }

    final void advanceArchiveLoading(byte methodGuard) {
        int archiveId;
        int unusedClientGuardSnapshot;
        CachedArchiveSource sourceBeforeBackgroundTick = null;
        unusedClientGuardSnapshot = Geoblox.field_C;
        if (null == this.archiveSources) {
          return;
        }
        for (archiveId = 0; this.archiveSources.length > archiveId; archiveId++) {
          if (this.archiveSources[archiveId] == null) {
            continue;
          }
          this.archiveSources[archiveId].processRequestedGroups(6924);
        }
        if (methodGuard != -65) {
          ArchiveCatalog.a('', 15);
        }
        for (archiveId = 0; archiveId < this.archiveSources.length; archiveId++) {
          if (null == this.archiveSources[archiveId]) {
            continue;
          }
          sourceBeforeBackgroundTick = this.archiveSources[archiveId];
          ((CachedArchiveSource) (Object) sourceBeforeBackgroundTick).advanceBackgroundLoading((byte) -38);
        }
    }

    final boolean ensureCatalogLoaded(byte methodGuard) {
        int digestByteIndex = 0;
        int archiveCount;
        byte[] rawVerificationBytes;
        byte[] verificationBytes;
        java.math.BigInteger verificationIntegerAfterModPow;
        int unusedClientGuardSnapshot;
        ByteArrayBuffer catalogBuffer;
        byte[] verificationBytesAlias;
        java.math.BigInteger encodedVerificationInteger;
        byte[] encodedVerificationBytes;
        byte[] computedDigest;
        unusedClientGuardSnapshot = Geoblox.field_C;
        if (null != this.catalogBuffer) {
          return true;
        }
        if (this.catalogRequest == null) {
          if (this.networkClient.isPriorityQueueFull(20)) {
            return false;
          }
          this.catalogRequest = this.networkClient.queueRequest((byte) 0, 255, -21, 255, true);
        }
        if (methodGuard <= 121) {
          return false;
        }
        if (this.catalogRequest.pending) {
          return false;
        }
        catalogBuffer = new ByteArrayBuffer(this.catalogRequest.getBytes(397));
        catalogBuffer.position = 5;
        archiveCount = catalogBuffer.readUnsignedByte((byte) 34);
        catalogBuffer.position = catalogBuffer.position + archiveCount * 72;
        encodedVerificationBytes = new byte[catalogBuffer.bytes.length - catalogBuffer.position];
        verificationBytesAlias = encodedVerificationBytes;
        rawVerificationBytes = verificationBytesAlias;
        catalogBuffer.readBytes(29915, encodedVerificationBytes.length, encodedVerificationBytes, 0);
        if ((this.verificationExponent != null) &&
            (this.verificationModulus != null)) {
          encodedVerificationInteger = new java.math.BigInteger(encodedVerificationBytes);
          verificationIntegerAfterModPow = encodedVerificationInteger.modPow(this.verificationExponent, this.verificationModulus);
          verificationBytes = verificationIntegerAfterModPow.toByteArray();
        } else {
          verificationBytes = rawVerificationBytes;
        }
        if (verificationBytes.length != 65) {
          throw new RuntimeException();
        }
        computedDigest = SpriteState.computeWhirlpoolDigest(-encodedVerificationBytes.length + catalogBuffer.position - 5, 5, catalogBuffer.bytes, 8);
        for (digestByteIndex = 0; digestByteIndex < 64; digestByteIndex++) {
          if (computedDigest[digestByteIndex] != verificationBytes[1 + digestByteIndex]) {
            throw new RuntimeException();
          }
        }
        this.catalogBuffer = catalogBuffer;
        this.archiveSources = new CachedArchiveSource[archiveCount];
        return true;
    }

    private ArchiveCatalog(ArchiveNetworkClient networkClient, DiskCacheWorker diskWorker, java.math.BigInteger verificationExponent, java.math.BigInteger verificationModulus) {
        RuntimeException constructionFailureForContext = null;
        RuntimeException constructionFailureBeforeContext = null;
        StringBuilder constructionMessagePrefix = null;
        String networkClientDescription = null;
        StringBuilder constructionMessageBeforeWorker = null;
        String diskWorkerDescription = null;
        StringBuilder constructionMessageBeforeExponent = null;
        String verificationExponentDescription = null;
        StringBuilder constructionMessageBeforeModulus = null;
        String verificationModulusDescription = null;
        RuntimeException caughtConstructionFailure = null;
        try {
          this.verificationExponent = verificationExponent;
          this.verificationModulus = verificationModulus;
          this.diskWorker = diskWorker;
          this.networkClient = networkClient;
          if (!this.networkClient.isPriorityQueueFull(20)) {
            this.catalogRequest = this.networkClient.queueRequest((byte) 0, 255, -21, 255, true);
          }
          return;
        } catch (java.lang.RuntimeException constructionFailure) {
          caughtConstructionFailure = constructionFailure;
          constructionFailureForContext = caughtConstructionFailure;
          constructionFailureBeforeContext = (RuntimeException) (constructionFailureForContext);
          constructionMessagePrefix = new StringBuilder().append("em.<init>(");
          if (networkClient == null) {
            networkClientDescription = "null";
          } else {
            networkClientDescription = "{...}";
          }
          constructionMessageBeforeWorker = ((StringBuilder) (Object) constructionMessagePrefix).append(networkClientDescription).append(',');
          if (diskWorker == null) {
            diskWorkerDescription = "null";
          } else {
            diskWorkerDescription = "{...}";
          }
          constructionMessageBeforeExponent = ((StringBuilder) (Object) constructionMessageBeforeWorker).append(diskWorkerDescription).append(',');
          if (verificationExponent == null) {
            verificationExponentDescription = "null";
          } else {
            verificationExponentDescription = "{...}";
          }
          constructionMessageBeforeModulus = ((StringBuilder) (Object) constructionMessageBeforeExponent).append(verificationExponentDescription).append(',');
          if (verificationModulus == null) {
            verificationModulusDescription = "null";
          } else {
            verificationModulusDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) constructionFailureBeforeContext), ((StringBuilder) (Object) constructionMessageBeforeModulus).append(verificationModulusDescription).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 53) {
            ArchiveCatalog.a(26);
          }
          if ((param0 != null) &&
              (param0.length() >= wg.field_m)) {
            if (param0.length() > ArchiveIndex.field_j) {
              return true;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var2);
          stackIn_12_1 = new StringBuilder().append("em.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Replay tutorial";
    }
}
