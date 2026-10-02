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

    final static ResourceArchive a(int param0, int param1, boolean param2, int param3, boolean param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            CachedArchiveSource var8 = null;
            ResourceArchive stackIn_2_0 = null;
            ResourceArchive stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (param0 > -49) {
                stackIn_2_0 = (ResourceArchive) null;
                return stackIn_2_0;
              }
              var6 = null;
              if (ph.field_i.cacheDataFile != null) {
                af.field_d = new sk(ph.field_i.cacheDataFile, 5200, 0);
                ph.field_i.cacheDataFile = null;
                var6 = new jh(255, af.field_d, new sk(ph.field_i.masterCacheIndexFile, 12000, 0), 2097152);
              }
              var7 = null;
              if (af.field_d != null) {
                if (je.field_h == null) {
                  je.field_h = new sk[ph.field_i.cacheIndexFiles.length];
                }
                if (je.field_h[param1] == null) {
                  je.field_h[param1] = new sk(ph.field_i.cacheIndexFiles[param1], 12000, 0);
                  ph.field_i.cacheIndexFiles[param1] = null;
                }
                var7 = new jh(param1, af.field_d, je.field_h[param1], 2097152);
              }
              var8 = gb.field_b.a(param1, (byte) -9, param5, (jh) (var6), (jh) (var7));
              if (param2) {
                var8.requestAllGroups(92);
              }
              stackIn_15_0 = new ResourceArchive(var8, param4, param3);
              return stackIn_15_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
