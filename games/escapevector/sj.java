/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends IntrusiveNode {
    static QuickChatDynamicCommand field_l;
    String field_g;
    static String field_j;
    static int field_h;
    static String field_k;
    static int field_i;

    final static void a(int param0, byte param1) {
        if (mb.field_a != null) {
          mb.field_a.fadeOut(2048);
        }
        mb.field_a = PcmSampleStream.createAtRatePercentQ6(uf.field_g, 100, qm.field_c * 6144 / 64, param0);
        if (param1 == 51) {
          ObjectSpriteSet.field_e.addSubstream(mb.field_a);
          return;
        }
        field_l = (QuickChatDynamicCommand) null;
        ObjectSpriteSet.field_e.addSubstream(mb.field_a);
    }

    public static void releaseStatics(byte guard) {
        field_j = null;
        field_k = null;
        field_l = null;
        if (guard != 123) {
          field_l = (QuickChatDynamicCommand) null;
        }
    }

    sj(String param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = new QuickChatDynamicCommand(8, 0, 4, 1);
        field_j = "Discard";
        field_k = "Target locations";
    }
}
