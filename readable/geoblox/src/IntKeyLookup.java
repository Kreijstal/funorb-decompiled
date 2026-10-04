/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class IntKeyLookup {
    static Sprite unachievedSprite;
    static TextTemplateArgumentType textTemplateArgumentTypeTwelve;
    private int[] keyIndexPairs;
    static int[] meshCameraTransform;

    public static void releaseStaticReferences(byte methodGuard) {
        unachievedSprite = null;
        textTemplateArgumentTypeTwelve = null;
        if (methodGuard != 49) {
            IntKeyLookup.releaseStaticReferences((byte) 72);
        }
        meshCameraTransform = null;
    }

    final int findIndex(boolean preserveUnachievedSprite, int key) {
        int bucketMask;
        int bucket;
        int storedIndex;
        if (!preserveUnachievedSprite) {
          unachievedSprite = (Sprite) null;
        }
        bucketMask = (this.keyIndexPairs.length >> 1) - 1;
        bucket = bucketMask & key;
        while (true) {
          storedIndex = this.keyIndexPairs[1 + bucket + bucket];
          if (-1 == storedIndex) {
            return -1;
          }
          if (this.keyIndexPairs[bucket + bucket] == key) {
            return storedIndex;
          }
          bucket = bucket + 1 & bucketMask;
          continue;
        }
    }

    final static ResourceArchive createResourceArchive(int methodGuard, int archiveId, boolean downloadAllGroups, int fileRetentionPolicy, boolean discardPackedGroups, boolean sweepCompletedRequests) {
        try {
            Object indexDiskCacheOrIoFailure = null;
            Object groupDiskCache = null;
            CachedArchiveSource archiveSource = null;
            ResourceArchive guardResultBeforeReturn = null;
            ResourceArchive archiveBeforeReturn = null;
            Throwable caughtFactoryFailure = null;
            try {
              if (methodGuard > -49) {
                guardResultBeforeReturn = (ResourceArchive) null;
                return guardResultBeforeReturn;
              }
              indexDiskCacheOrIoFailure = null;
              if (ByteShortQuery.archiveTaskDispatcher.cacheDataFile != null) {
                CacheFileState.cacheDataFile = new BufferedRandomAccessFile(ByteShortQuery.archiveTaskDispatcher.cacheDataFile, 5200, 0);
                ByteShortQuery.archiveTaskDispatcher.cacheDataFile = null;
                indexDiskCacheOrIoFailure = new DiskArchiveCache(255, CacheFileState.cacheDataFile, new BufferedRandomAccessFile(ByteShortQuery.archiveTaskDispatcher.masterCacheIndexFile, 12000, 0), 2097152);
              }
              groupDiskCache = null;
              if (CacheFileState.cacheDataFile != null) {
                if (TrackedPcmStream.openedCacheIndexFiles == null) {
                  TrackedPcmStream.openedCacheIndexFiles = new BufferedRandomAccessFile[ByteShortQuery.archiveTaskDispatcher.cacheIndexFiles.length];
                }
                if (TrackedPcmStream.openedCacheIndexFiles[archiveId] == null) {
                  TrackedPcmStream.openedCacheIndexFiles[archiveId] = new BufferedRandomAccessFile(ByteShortQuery.archiveTaskDispatcher.cacheIndexFiles[archiveId], 12000, 0);
                  ByteShortQuery.archiveTaskDispatcher.cacheIndexFiles[archiveId] = null;
                }
                groupDiskCache = new DiskArchiveCache(archiveId, CacheFileState.cacheDataFile, TrackedPcmStream.openedCacheIndexFiles[archiveId], 2097152);
              }
              archiveSource = DequeCursor.archiveCatalog.getArchiveSource(archiveId, (byte) -9, sweepCompletedRequests, (DiskArchiveCache) (indexDiskCacheOrIoFailure), (DiskArchiveCache) (groupDiskCache));
              if (downloadAllGroups) {
                archiveSource.requestAllGroups(92);
              }
              archiveBeforeReturn = new ResourceArchive(archiveSource, discardPackedGroups, fileRetentionPolicy);
              return archiveBeforeReturn;
            } catch (java.io.IOException factoryIOException) {
              caughtFactoryFailure = factoryIOException;
              indexDiskCacheOrIoFailure = (IOException) (Object) caughtFactoryFailure;
              throw new RuntimeException(((IOException) (indexDiskCacheOrIoFailure)).toString());
            }
        } catch (RuntimeException | Error uncheckedFactoryFailure) {
            throw uncheckedFactoryFailure;
        } catch (Throwable checkedFactoryFailure) {
            throw new RuntimeException(checkedFactoryFailure);
        }
    }

    IntKeyLookup(int[] keys) {
        int bucketCount = 0;
        int arraySlotThenKeyIndex = 0;
        int bucket = 0;
        RuntimeException constructionFailureBeforeContext = null;
        StringBuilder constructionMessagePrefix = null;
        String keysDescription = null;
        RuntimeException caughtConstructionFailure = null;
        RuntimeException constructionFailureForContext = null;
        try {
          bucketCount = 1;
          while (keys.length + (keys.length >> 1) >= bucketCount) {
            bucketCount = bucketCount << 1;
          }
          this.keyIndexPairs = new int[bucketCount + bucketCount];
          for (arraySlotThenKeyIndex = 0; arraySlotThenKeyIndex < bucketCount + bucketCount; arraySlotThenKeyIndex++) {
            this.keyIndexPairs[arraySlotThenKeyIndex] = -1;
          }
          for (arraySlotThenKeyIndex = 0; arraySlotThenKeyIndex < keys.length; arraySlotThenKeyIndex++) {
            for (bucket = keys[arraySlotThenKeyIndex] & bucketCount - 1; this.keyIndexPairs[bucket + bucket + 1] != -1; bucket = bucket + 1 & -1 + bucketCount) {
            }
            this.keyIndexPairs[bucket + bucket] = keys[arraySlotThenKeyIndex];
            this.keyIndexPairs[1 + bucket + bucket] = arraySlotThenKeyIndex;
          }
          return;
        } catch (java.lang.RuntimeException constructionFailure) {
          caughtConstructionFailure = constructionFailure;
          constructionFailureForContext = caughtConstructionFailure;
          constructionFailureBeforeContext = constructionFailureForContext;
          constructionMessagePrefix = new StringBuilder().append("am.<init>(");
          if (keys == null) {
            keysDescription = "null";
          } else {
            keysDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) constructionFailureBeforeContext), ((StringBuilder) (Object) constructionMessagePrefix).append(keysDescription).append(')').toString());
        }
    }

    static {
        meshCameraTransform = new int[12];
        textTemplateArgumentTypeTwelve = new TextTemplateArgumentType(12, 0, 1, 0);
    }
}
