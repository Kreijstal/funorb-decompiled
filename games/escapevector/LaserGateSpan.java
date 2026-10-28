/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LaserGateSpan extends IntrusiveNode {
    static Sprite field_l;
    static int field_g;
    static int field_k;
    int rightX;
    int y;
    int leftX;

    final static int roundUpToEight(byte guard, int value) {
        if (guard == 57) {
          int var2 = 0;
          if ((value & 7) != 0) {
            var2 = -(value & 7) + 8;
          }
          int var3 = var2 + value;
          return var3;
        }
        LaserGateSpan.roundUpToEight((byte) 123, -70);
        int var2Lifetime1 = 0;
        if ((value & 7) != 0) {
          var2Lifetime1 = -(value & 7) + 8;
        }
        int var3Lifetime1 = var2Lifetime1 + value;
        return var3Lifetime1;
    }

    LaserGateSpan(int leftX, int rightX, int y) {
        this.y = y;
        this.rightX = rightX;
        this.leftX = leftX;
    }

    public static void releaseStatics(byte guard) {
        if (guard > -67) {
          LaserGateSpan.releaseStatics((byte) -101);
          field_l = null;
          return;
        }
        field_l = null;
    }

    static {
        field_k = 0;
        field_l = new Sprite(540, 140);
    }
}
