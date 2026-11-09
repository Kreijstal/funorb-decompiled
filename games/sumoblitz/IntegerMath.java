/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntegerMath {
    final static void a(byte param0) {
        if (0 - LegacyOpenGlRidgedWaterEffect.field_i == MusicPatch.field_u) {
          if (param0 > 42) {
            MusicPatch.field_u = MusicPatch.field_u + 1;
            return;
          }
          return;
        }
        if (250 - LegacyOpenGlRidgedWaterEffect.field_i != MusicPatch.field_u) {
          if (param0 > 42) {
            MusicPatch.field_u = MusicPatch.field_u + 1;
            return;
          }
          return;
        }
        if (param0 > 42) {
          MusicPatch.field_u = MusicPatch.field_u + 1;
          return;
        }
    }

    final static int floorLog2(int guard, int value) {
        int var2 = 0;
        if (value > 65535) {
          var2 = var2 | 16;
          value = value >>> 16;
        }
        if (value > 255) {
          value = value >>> 8;
          var2 = var2 | 8;
        }
        if (15 < value) {
          var2 = var2 | 4;
          value = value >>> 4;
        }
        int var3 = -66 / ((-59 - guard) / 55);
        if (value > 3) {
          var2 = var2 | 2;
          value = value >>> 2;
        }
        if (value > 1) {
          value = value >>> 1;
          var2 = var2 | 1;
        }
        return var2;
    }

    final static boolean isSingleBitOrZero(int value, int guard) {
        if (guard <= -100) {
          return value == (value & -value) ? true : false;
        }
        return false;
    }

    static {
    }
}
