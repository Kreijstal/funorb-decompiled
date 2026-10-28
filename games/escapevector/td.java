/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
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

    final static void a(int param0, int param1) {
        if (null != SocketJs5Transport.field_r) {
          SocketJs5Transport.field_r.b(param1 ^ -129, param0);
        }
        if (param1 != 128) {
          td.a(112, 55);
          return;
        }
    }

    final synchronized static long b(int param0) {
        long var1 = System.currentTimeMillis();
        if (param0 != 128) {
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
