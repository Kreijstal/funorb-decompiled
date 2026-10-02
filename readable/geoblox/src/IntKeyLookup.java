/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class IntKeyLookup {
    static Sprite unachievedSprite;
    static ck field_d;
    private int[] keyIndexPairs;
    static int[] field_a;

    public static void a(byte param0) {
        unachievedSprite = null;
        field_d = null;
        if (param0 != 49) {
            IntKeyLookup.a((byte) 72);
        }
        field_a = null;
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
        L1: while (true) {
          storedIndex = this.keyIndexPairs[1 + bucket + bucket];
          if (-1 == storedIndex) {
            return -1;
          }
          if (this.keyIndexPairs[bucket + bucket] == key) {
            return storedIndex;
          }
          bucket = bucket + 1 & bucketMask;
          continue L1;
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
              if (ph.archiveTaskDispatcher.cacheDataFile != null) {
                af.field_d = new sk(ph.archiveTaskDispatcher.cacheDataFile, 5200, 0);
                ph.archiveTaskDispatcher.cacheDataFile = null;
                indexDiskCacheOrIoFailure = new jh(255, af.field_d, new sk(ph.archiveTaskDispatcher.masterCacheIndexFile, 12000, 0), 2097152);
              }
              groupDiskCache = null;
              if (af.field_d != null) {
                if (je.field_h == null) {
                  je.field_h = new sk[ph.archiveTaskDispatcher.cacheIndexFiles.length];
                }
                if (je.field_h[archiveId] == null) {
                  je.field_h[archiveId] = new sk(ph.archiveTaskDispatcher.cacheIndexFiles[archiveId], 12000, 0);
                  ph.archiveTaskDispatcher.cacheIndexFiles[archiveId] = null;
                }
                groupDiskCache = new jh(archiveId, af.field_d, je.field_h[archiveId], 2097152);
              }
              archiveSource = gb.archiveCatalog.getArchiveSource(archiveId, (byte) -9, sweepCompletedRequests, (jh) (indexDiskCacheOrIoFailure), (jh) (groupDiskCache));
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
          L0: while (keys.length + (keys.length >> 1) >= bucketCount) {
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
          constructionFailureBeforeContext = (RuntimeException) (constructionFailureForContext);
          constructionMessagePrefix = new StringBuilder().append("am.<init>(");
          if (keys == null) {
            keysDescription = "null";
          } else {
            keysDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) constructionFailureBeforeContext), ((StringBuilder) (Object) constructionMessagePrefix).append(keysDescription).append(')').toString());
        }
    }

    static {
        field_a = new int[12];
        field_d = new ck(12, 0, 1, 0);
    }
}
