/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MonotonicClockSupport {
    static PcmSample field_c;
    static String field_a;
    static int[] field_b;

    public static void releaseStatics(int guard) {
        field_c = null;
        field_b = null;
        if (guard != 128) {
          return;
        }
        field_a = null;
    }

    final static void addSessionCounterOffset(int offset, int guard) {
        if (null != SocketJs5Transport.field_r) {
          SocketJs5Transport.field_r.addOffset(guard ^ -129, offset);
        }
        if (guard != 128) {
          MonotonicClockSupport.addSessionCounterOffset(112, 55);
          return;
        }
    }

    final synchronized static long monotonicMillis(int guard) {
        long var1 = System.currentTimeMillis();
        if (guard != 128) {
          return 9L;
        }
        if (LegacyStyleNode.field_t <= var1) {
          LegacyStyleNode.field_t = var1;
          return var1 + AccountFormStage.field_e;
        }
        AccountFormStage.field_e = AccountFormStage.field_e + (LegacyStyleNode.field_t - var1);
        LegacyStyleNode.field_t = var1;
        return var1 + AccountFormStage.field_e;
    }

    static {
        field_a = "Click";
        field_b = new int[128];
    }
}
