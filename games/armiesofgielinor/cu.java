/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cu implements gj {
    static RgbSprite[] field_d;
    static boolean field_c;
    static RgbSprite field_b;
    static boolean field_a;

    public static void a(byte param0) {
        field_d = null;
        int var1 = 57 % ((param0 + 17) / 56);
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param1 == 0) {
          return 0;
        }
        if (param0 != 3) {
          return 114;
        }
        if (param1 > 0) {
          var2 = 1;
          if (param1 > 65535) {
            param1 = param1 >> 16;
            var2 += 16;
          }
          if (param1 > 255) {
            var2 += 8;
            param1 = param1 >> 8;
          }
          if (param1 > 15) {
            var2 += 4;
            param1 = param1 >> 4;
          }
          if (param1 > 3) {
            param1 = param1 >> 2;
            var2 += 2;
          }
          if (param1 > 1) {
            param1 = param1 >> 1;
            var2++;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (param1 < -65536) {
          param1 = param1 >> 16;
          var2Lifetime1 += 16;
        }
        if (-256 > param1) {
          var2Lifetime1 += 8;
          param1 = param1 >> 8;
        }
        if (param1 < -16) {
          var2Lifetime1 += 4;
          param1 = param1 >> 4;
        }
        if (param1 < -4) {
          var2Lifetime1 += 2;
          param1 = param1 >> 2;
        }
        if (param1 < -2) {
          var2Lifetime1++;
          param1 = param1 >> 1;
        }
        return var2Lifetime1;
    }

    static {
        field_c = true;
        field_a = true;
    }
}
