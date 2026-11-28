/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static String field_b;
    static volatile int field_a;

    final static void a(byte param0, boolean param1, String param2) {
        try {
          DiskCacheWorker.field_f = param1;
          s.field_K = true;
          int var3_int = 4 % ((param0 - 32) / 48);
          ki.field_c = new dh(TunnelCamera.field_Z, fd.field_k, param2, IntrusiveNode.field_f, DiskCacheWorker.field_f);
          TunnelCamera.field_Z.c(ki.field_c, 0);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "r.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(bj param0, int param1, int param2) {
        MatchingFieldValidator.field_k.addLast((IntrusiveNode) (param0), (byte) 67);
        if (param1 != -1) {
          return;
        }
        try {
          MatchingFieldValidator.a(param2, 102, param0);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "r.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        field_b = null;
        if (param0 < 53) {
          r.clearStaticReferences(-122);
        }
    }

    static {
        field_b = "C";
        field_a = -1;
    }
}
