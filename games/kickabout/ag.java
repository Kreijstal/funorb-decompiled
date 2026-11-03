/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends IntrusiveNode {
    static int field_h;
    PcmSampleStream field_i;
    static String field_l;
    static MouseWheelInput field_f;
    static int field_e;
    int field_j;
    static int field_g;
    IntrusiveNode field_k;

    final static UiLayoutNode a(int param0, int param1) {
        UiLayoutNode var2 = new UiLayoutNode((long)param1, (UiLayoutNode) null);
        var2.field_R = ShopPlayerSlot.a((byte) 26, param0);
        return var2;
    }

    public static void a(byte param0) {
        field_f = null;
        field_l = null;
        if (param0 < 66) {
          ag.a((byte) 34);
        }
    }

    ag(PcmSampleStream param0, IntrusiveNode param1) {
        try {
          this.field_i = param0;
          this.field_j = param0.getTargetVolume();
          this.field_k = param1;
          this.field_i.b(128 + mn.field_a * this.field_j >> 8);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ag.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "<%0>: Show Chat";
    }
}
