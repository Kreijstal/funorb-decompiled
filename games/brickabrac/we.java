/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static String field_c;
    static int secondPreviousPacketOpcode;
    static RgbSprite[] activePowerUpSprites;

    final static void a(byte param0) {
        ResourceArchive.pendingReflectionChecks = new NodeDeque();
        if (param0 != -46) {
          we.a(12);
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -8495) {
          we.a((byte) -45);
          activePowerUpSprites = null;
          return;
        }
        activePowerUpSprites = null;
    }

    static {
        secondPreviousPacketOpcode = -1;
        field_c = "Player One";
    }
}
