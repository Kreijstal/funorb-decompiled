/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SpriteState extends DualLinkNode {
    static int[] field_u;
    static String[] field_p;
    int field_q;
    int field_v;
    int field_t;
    int field_r;
    static int field_y;
    int field_w;
    static int[] field_s;
    int field_x;

    final static void requestScreenTransition(int param0, int param1, int param2) {
        LinkTextPainter.field_h = param0;
        String var4 = (String) null;
        RegionPowerupEffect.startLoginTransition(-1, (String) null, true);
        int var3 = -120 / ((-77 - param1) / 47);
    }

    public static void releaseStatics(byte param0) {
        field_p = null;
        field_s = null;
        if (param0 != -77) {
          field_p = (String[]) null;
          field_u = null;
          return;
        }
        field_u = null;
    }

    final static Js5Archive createResourceArchive(boolean param0, boolean param1, int param2, int param3, boolean param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          CachedArchiveSource var8 = null;
          Js5Archive stackIn_11_0 = null;
          Js5Archive stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            if (null != WeightedLruCache.field_a.field_e) {
              AchievementBanner.field_j = new BufferedFile(WeightedLruCache.field_a.field_e, 5200, 0);
              WeightedLruCache.field_a.field_e = null;
              var6 = new SectorCacheStore(255, AchievementBanner.field_j, new BufferedFile(WeightedLruCache.field_a.field_i, 12000, 0), 2097152);
            }
            var7 = null;
            if (AchievementBanner.field_j != null) {
              if (ViewportController.field_v == null) {
                ViewportController.field_v = new BufferedFile[WeightedLruCache.field_a.field_q.length];
              }
              if (null == ViewportController.field_v[param2]) {
                ViewportController.field_v[param2] = new BufferedFile(WeightedLruCache.field_a.field_q[param2], 12000, 0);
                WeightedLruCache.field_a.field_q[param2] = null;
              }
              var7 = new SectorCacheStore(param2, AchievementBanner.field_j, ViewportController.field_v[param2], 2097152);
            }
            var8 = PendingBytePayloadRequest.field_l.openProvider((SectorCacheStore) (var7), (byte) -106, param0, param2, (SectorCacheStore) (var6));
            if (!param1) {
              stackIn_11_0 = (Js5Archive) null;
              return stackIn_11_0;
            }
            if (param5) {
              var8.startPrefetch(false);
            }
            stackIn_15_0 = new Js5Archive(var8, param4, param3);
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

    SpriteState() {
    }

    static {
        field_u = new int[16];
        field_p = new String[]{"Showing by rating", "Showing by win percentage"};
        field_y = 131072;
    }
}
