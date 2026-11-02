/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends IntrusiveNode {
    int field_k;
    static String field_h;
    IntrusiveNode field_i;
    static ta[] field_l;
    PcmSampleStream field_j;
    static TileRack submissionRack;

    od(PcmSampleStream param0, IntrusiveNode param1) {
        try {
          this.field_j = param0;
          this.field_k = param0.h();
          this.field_i = param1;
          this.field_j.i(128 + kc.field_g * this.field_k >> 8);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "od.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        submissionRack = null;
        field_h = null;
        if (!param0) {
          return;
        }
        field_l = null;
    }

    static {
        int var0 = 0;
        field_l = new ta[255];
        for (var0 = 0; var0 < field_l.length; var0++) {
          field_l[var0] = new ta();
        }
        submissionRack = new TileRack(12, 34, 114);
    }
}
