/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveSourceManager {
    private java.math.BigInteger rsaModulus;
    static String field_d;
    static String[] field_f;
    private java.math.BigInteger rsaExponent;
    private CachedArchiveSource[] archiveSources;
    private PacketBuffer masterIndexPacket;
    static String field_e;
    private ArchiveFetchClient fetchClient;
    private ArchiveNetworkRequest masterIndexRequest;
    private CacheIoWorker cacheIo;
    static AlphaFont field_j;

    final void maintainArchiveSources(int obfuscationGuard) {
        int queuedSourceIndex;
        int unusedClientFlag;
        int maintenanceSourceIndex;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        if (null == this.archiveSources) {
          return;
        }
        if (obfuscationGuard <= 42) {
          this.rsaExponent = (java.math.BigInteger) null;
        }
        for (queuedSourceIndex = 0; this.archiveSources.length > queuedSourceIndex; queuedSourceIndex++) {
          if (null != this.archiveSources[queuedSourceIndex]) {
            this.archiveSources[queuedSourceIndex].processQueuedGroups(20312);
          }
        }
        for (maintenanceSourceIndex = 0; maintenanceSourceIndex < this.archiveSources.length; maintenanceSourceIndex++) {
          if (null != this.archiveSources[maintenanceSourceIndex]) {
            this.archiveSources[maintenanceSourceIndex].maintainGroups(1);
          }
        }
    }

    ArchiveSourceManager(ArchiveFetchClient fetchClient, CacheIoWorker cacheIo) {
        this(fetchClient, cacheIo, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean pollMasterIndex(boolean obfuscationGuard) {
        int digestByteIndex = 0;
        int archiveCount;
        byte[] signatureBytes;
        byte[] recoveredSignature;
        java.math.BigInteger recoveredInteger;
        int unusedClientFlag;
        FileCacheStore unusedIndexCache;
        PacketBuffer masterPacket;
        byte[] signatureStorage;
        java.math.BigInteger signatureInteger;
        byte[] signatureBuffer;
        byte[] masterDigest;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        if (null != this.masterIndexPacket) {
          return true;
        }
        if (null == this.masterIndexRequest) {
          if (this.fetchClient.isPriorityQueueFull(2)) {
            return false;
          }
          this.masterIndexRequest = this.fetchClient.request(-952050528, 255, (byte) 0, 255, true);
        }
        if (this.masterIndexRequest.pending) {
          return false;
        }
        masterPacket = new PacketBuffer(this.masterIndexRequest.getData((byte) 56));
        masterPacket.position = 5;
        archiveCount = masterPacket.readUnsignedByte(255);
        masterPacket.position = masterPacket.position + 72 * archiveCount;
        signatureBuffer = new byte[masterPacket.data.length - masterPacket.position];
        signatureStorage = signatureBuffer;
        signatureBytes = signatureStorage;
        masterPacket.readBytes(0, signatureBytes, 127, signatureBuffer.length);
        if (null != this.rsaExponent &&
          null != this.rsaModulus) {
          signatureInteger = new java.math.BigInteger(signatureBuffer);
          recoveredInteger = signatureInteger.modPow(this.rsaExponent, this.rsaModulus);
          recoveredSignature = recoveredInteger.toByteArray();
        } else {
          recoveredSignature = signatureBytes;
        }
        if (recoveredSignature.length != 65) {
          throw new RuntimeException();
        }
        masterDigest = jd.computeWhirlpoolDigest(masterPacket.data, 5, -14970, masterPacket.position - signatureBuffer.length - 5);
        for (digestByteIndex = 0; 64 > digestByteIndex; digestByteIndex++) {
          if (masterDigest[digestByteIndex] != recoveredSignature[digestByteIndex + 1]) {
            throw new RuntimeException();
          }
        }
        this.masterIndexPacket = masterPacket;
        if (obfuscationGuard) {
          unusedIndexCache = (FileCacheStore) null;
          this.getArchiveSource(34, true, (FileCacheStore) null, -60, (FileCacheStore) null);
        }
        this.archiveSources = new CachedArchiveSource[archiveCount];
        return true;
    }

    final static void layoutLobbyTransition(int transitionTick, boolean obfuscationGuard) {
        int centerOffsetX = (-640 + kp.field_a) / 2;
        int transitionSpanSquared = ScrollPaneWithFooter.field_Yb * ScrollPaneWithFooter.field_Yb;
        int remainingTransitionSquared = -(transitionTick * transitionTick) + transitionSpanSquared;
        NinjaBackground.field_w.setBounds(Rasterizer2D.height - 120 - 4 - 90, 90, centerOffsetX - remainingTransitionSquared * 199 / transitionSpanSquared, 199, (byte) 64);
        MultiplayerMatch.field_d.setBounds(-4 + (Rasterizer2D.height - 120), 0, 438 * remainingTransitionSquared / transitionSpanSquared + (202 + centerOffsetX), 438, (byte) 64);
        if (obfuscationGuard) {
          field_e = (String) null;
        }
    }

    public static void b(int param0) {
        field_e = null;
        int var1 = -35 % ((param0 - 34) / 39);
        field_j = null;
        field_d = null;
        field_f = null;
    }

    final CachedArchiveSource getArchiveSource(int obfuscationGuard, boolean cleanupEnabled, FileCacheStore indexCache, int archiveId, FileCacheStore groupCache) {
        CachedArchiveSource cachedSourceResult = null;
        CachedArchiveSource createdSourceResult = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String indexCacheSummary = null;
        StringBuilder groupContextBuilder = null;
        String groupCacheSummary = null;
        RuntimeException caughtFailure = null;
        int unusedGuardQuotient = 0;
        RuntimeException failure = null;
        int indexCrc = 0;
        int indexRevision = 0;
        CachedArchiveSource source = null;
        byte[] indexDigest = null;
        try {
          if (null == this.masterIndexPacket) {
            throw new RuntimeException();
          }
          if (archiveId >= 0 &&
            archiveId < this.archiveSources.length) {
            if (null != this.archiveSources[archiveId]) {
              cachedSourceResult = this.archiveSources[archiveId];
              return cachedSourceResult;
            }
            this.masterIndexPacket.position = archiveId * 72 + 6;
            unusedGuardQuotient = -124 / ((obfuscationGuard + 71) / 38);
            indexCrc = this.masterIndexPacket.readInt(255);
            indexRevision = this.masterIndexPacket.readInt(255);
            indexDigest = new byte[64];
            this.masterIndexPacket.readBytes(0, indexDigest, 122, 64);
            source = new CachedArchiveSource(archiveId, groupCache, indexCache, this.fetchClient, this.cacheIo, indexCrc, indexDigest, indexRevision, cleanupEnabled);
            this.archiveSources[archiveId] = source;
            createdSourceResult = source;
            return createdSourceResult;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException caughtException) {
          caughtFailure = caughtException;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("co.C(").append(obfuscationGuard).append(',').append(cleanupEnabled).append(',');
          if (indexCache == null) {
            indexCacheSummary = "null";
          } else {
            indexCacheSummary = "{...}";
          }
          groupContextBuilder = ((StringBuilder) (Object) contextBuilder).append(indexCacheSummary).append(',').append(archiveId).append(',');
          if (groupCache == null) {
            groupCacheSummary = "null";
          } else {
            groupCacheSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) groupContextBuilder).append(groupCacheSummary).append(')').toString());
        }
    }

    private ArchiveSourceManager(ArchiveFetchClient fetchClient, CacheIoWorker cacheIo, java.math.BigInteger rsaExponent, java.math.BigInteger rsaModulus) {
        try {
          this.rsaModulus = rsaModulus;
          this.rsaExponent = rsaExponent;
          this.cacheIo = cacheIo;
          this.fetchClient = fetchClient;
          if (!this.fetchClient.isPriorityQueueFull(2)) {
            this.masterIndexRequest = this.fetchClient.request(-952050528, 255, (byte) 0, 255, true);
          }
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "co.<init>(" + (fetchClient != null ? "{...}" : "null") + ',' + (cacheIo != null ? "{...}" : "null") + ',' + (rsaExponent != null ? "{...}" : "null") + ',' + (rsaModulus != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, MusicTrack param1) {
        try {
          IsaacGenerator.a(param1, 0);
          if (param0 >= -74) {
            field_d = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "co.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int getTextChoiceContentWidth(byte obfuscationGuard) {
        if (obfuscationGuard != -53) {
          field_j = (AlphaFont) null;
        }
        return MusicVoiceMixer.textChoiceRight - LevelPack.textChoiceLeft;
    }

    static {
        field_e = "Hide lobby chat";
        field_d = "Hide players in <%0>'s game";
    }
}
