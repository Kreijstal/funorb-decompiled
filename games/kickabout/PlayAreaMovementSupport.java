/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayAreaMovementSupport {
    static Sprite[] field_d;
    static String field_e;
    static int[] field_a;
    static Sprite[] field_c;
    static String field_b;

    public static void releaseStatics(int param0) {
        if (param0 < -114) {
          field_a = null;
          field_c = null;
          field_d = null;
          field_e = null;
          field_b = null;
          return;
        }
        PlayAreaMovementSupport.releaseStatics(107);
        field_a = null;
        field_c = null;
        field_d = null;
        field_e = null;
        field_b = null;
    }

    final static int constantOne(byte param0) {
        if (param0 != 40) {
          return -111;
        }
        return 1;
    }

    final static int[] moveWithinAreas(int param0, int param1, PlayArea[] param2, int param3, int param4, int param5, int param6, int param7) {
        int[] stackIn_2_0 = null;
        int[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        PlayArea[] var9 = null;
        try {
          RandomAccessCacheFile.field_b[1] = param5;
          RandomAccessCacheFile.field_b[5] = param7;
          RandomAccessCacheFile.field_b[3] = param0;
          RandomAccessCacheFile.field_b[0] = param6;
          RandomAccessCacheFile.field_b[4] = param1;
          RandomAccessCacheFile.field_b[2] = param4;
          if (!MeshPreviewSupport.isInsideAnyArea(param2, (byte) -124, RandomAccessCacheFile.field_b)) {
            stackIn_2_0 = RandomAccessCacheFile.field_b;
            return stackIn_2_0;
          }
          RandomAccessCacheFile.field_b[0] = RandomAccessCacheFile.field_b[0] + RandomAccessCacheFile.field_b[3];
          if (!MeshPreviewSupport.isInsideAnyArea(param2, (byte) -104, RandomAccessCacheFile.field_b)) {
            RandomAccessCacheFile.field_b[0] = param6;
            RandomAccessCacheFile.field_b[3] = -RandomAccessCacheFile.field_b[3];
          }
          RandomAccessCacheFile.field_b[1] = RandomAccessCacheFile.field_b[1] + RandomAccessCacheFile.field_b[4];
          if (!MeshPreviewSupport.isInsideAnyArea(param2, (byte) -61, RandomAccessCacheFile.field_b)) {
            RandomAccessCacheFile.field_b[1] = param5;
            RandomAccessCacheFile.field_b[4] = -RandomAccessCacheFile.field_b[4];
          }
          RandomAccessCacheFile.field_b[2] = RandomAccessCacheFile.field_b[2] + RandomAccessCacheFile.field_b[5];
          if (param3 >= -51) {
            var9 = (PlayArea[]) null;
            PlayAreaMovementSupport.moveWithinAreas(-23, 65, (PlayArea[]) null, -116, 62, 0, -89, 61);
          }
          if (!MeshPreviewSupport.isInsideAnyArea(param2, (byte) -85, RandomAccessCacheFile.field_b)) {
            RandomAccessCacheFile.field_b[5] = -RandomAccessCacheFile.field_b[5];
            RandomAccessCacheFile.field_b[2] = param4;
          }
          stackIn_13_0 = RandomAccessCacheFile.field_b;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("lt.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_e = "time";
        field_b = "Final";
    }
}
