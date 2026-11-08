/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FaceNormal {
    static IntrusiveDeque field_d;
    int y;
    int z;
    static boolean field_c;
    static String field_h;
    int x;
    static char[] field_e;
    static String field_b;

    final static void completePendingAvailabilityCheck(boolean param0, int param1) {
        DualLinkDequeIterator.field_e.complete(param0, (byte) -124);
        if (param1 != -23249) {
          field_c = true;
        }
    }

    final static int rotateLeftFourBits(int param0, int param1) {
        if (param0 == 56082116) {
          return param1 >>> 28 | param1 << 4;
        }
        field_c = true;
        return param1 >>> 28 | param1 << 4;
    }

    final static PcmStreamMixer getSoundMixer(int param0) {
        if (param0 != 55) {
          FaceNormal.releaseStatics((byte) 3);
          return PlayerInputFactory.field_a;
        }
        return PlayerInputFactory.field_a;
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        field_b = null;
        if (param0 >= 71) {
          field_d = null;
          field_h = null;
          return;
        }
        field_c = false;
        field_d = null;
        field_h = null;
    }

    static {
        field_h = "stats";
        field_c = false;
        field_d = new IntrusiveDeque();
        field_e = new char[]{(char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57, (char)48};
        field_b = "Don't mind";
    }
}
