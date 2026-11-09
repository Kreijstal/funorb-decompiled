/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class HitRegion extends IntrusiveNode {
    int x;
    static String field_i;
    private int width;
    private int height;
    private boolean enabled;
    static int field_j;
    int y;

    public static void clearStatics(byte param0) {
        if (param0 != 15) {
          HitRegion.signedBitLength(-111, -63);
          field_i = null;
          return;
        }
        field_i = null;
    }

    final void c(int param0, int param1, int param2) {
        if (param1 != 2) {
          this.y = 109;
        }
    }

    final static AnimatedPanel a(int param0) {
        if (param0 != 20605) {
          HitRegion.clearStatics((byte) -50);
          return SingleChildWidget.field_y.field_xb;
        }
        return SingleChildWidget.field_y.field_xb;
    }

    final void d(int param0, int param1, int param2) {
        if (param2 != -30872) {
          this.height = -77;
        }
    }

    private final boolean containsPoint(int param0, int param1, int param2) {
        if (!this.enabled) {
          return false;
        }
        param0 = param0 - this.x;
        param2 = param2 - this.y;
        if (param1 != -19255) {
          return true;
        }
        if (0 > param0) {
          return false;
        }
        if (param2 < 0) {
          return false;
        }
        if (param0 >= this.width) {
          return false;
        }
        if (this.height > param2) {
          return true;
        }
        return false;
    }

    final HitRegion hitTest(int param0, int param1, int param2) {
        if (this.containsPoint(param1, -19255, param2)) {
          return this;
        }
        if (param0 <= -108) {
          return null;
        }
        this.y = -25;
        return null;
    }

    final static int signedBitLength(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (0 == param0) {
          return 0;
        }
        if (param0 > 0) {
          var2 = 1;
          if (param0 > 65535) {
            var2 += 16;
            param0 = param0 >> 16;
          }
          if (param0 > 255) {
            param0 = param0 >> 8;
            var2 += 8;
          }
          if (param0 > 15) {
            param0 = param0 >> 4;
            var2 += 4;
          }
          if (3 < param0) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (param0 > 1) {
            param0 = param0 >> 1;
            var2++;
          }
          return var2;
        }
        if (param1 != 1) {
          field_j = 112;
        }
        var2Lifetime1 = 2;
        if (param0 < -65536) {
          var2Lifetime1 += 16;
          param0 = param0 >> 16;
        }
        if (param0 < -256) {
          var2Lifetime1 += 8;
          param0 = param0 >> 8;
        }
        if (param0 < -16) {
          var2Lifetime1 += 4;
          param0 = param0 >> 4;
        }
        if (param0 < -4) {
          var2Lifetime1 += 2;
          param0 = param0 >> 2;
        }
        if (param0 < -2) {
          param0 = param0 >> 1;
          var2Lifetime1++;
        }
        return var2Lifetime1;
    }

    private HitRegion() throws Throwable {
        throw new Error();
    }

    static {
        field_i = "All achievements are available only in rated games.";
    }
}
