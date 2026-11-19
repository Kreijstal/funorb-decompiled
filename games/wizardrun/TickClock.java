/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TickClock {
    static boolean field_d;
    static int[][] field_a;
    static ResourceArchive field_c;
    static int[] field_e;
    static ResourceArchive field_b;

    final int sleepAndAdvance(long param0, int param1) {
        long var4 = 0L;
        if (param1 == 0) {
          var4 = this.delayMillis((byte) 66);
          if (var4 > 0L) {
            LevelData.sleepMillis(var4, false);
          }
          return this.advanceTicks(param0, true);
        }
        return -118;
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        field_a = (int[][]) null;
        if (param0 < -93) {
          field_c = null;
          field_b = null;
          return;
        }
        field_c = (ResourceArchive) null;
        field_c = null;
        field_b = null;
    }

    final static IndexedSprite buildFirstIndexedSprite(byte param0) {
        IndexedSprite var1 = new IndexedSprite(ProgressDialog.field_bb, PlatformActor.field_v, GameMenu.field_q[0], ne.field_h[0], ImageProducerRasterBuffer.field_k[0], MouseInputHandler.field_b[0], TextFieldValidator.field_j[0], ic.field_b);
        if (param0 == -92) {
          ClientException.a(0);
          return var1;
        }
        return (IndexedSprite) null;
    }

    abstract int advanceTicks(long param0, boolean param1);

    abstract void reset(int param0);

    final static String replaceAll(String param0, String param1, int param2, String param3) {
        int var5 = wizardrun.field_H;
        int var4 = param1.indexOf(param0);
        while (var4 != -1) {
          param1 = param1.substring(0, var4) + param3 + param1.substring(param0.length() + var4);
          var4 = param1.indexOf(param0, param3.length() + var4);
        }
        if (param2 == 28834) {
          return param1;
        }
        field_b = (ResourceArchive) null;
        return param1;
    }

    abstract long delayMillis(byte param0);

    static {
        field_d = false;
        field_e = new int[]{5, 1, 1, 3, 5, 1, 2, 2, 3, 5, 10, 2};
    }
}
