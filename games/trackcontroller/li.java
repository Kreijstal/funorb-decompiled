/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends IntrusiveNode {
    IntrusiveNode field_k;
    int field_m;
    static String field_l;
    PcmSampleStream field_j;
    static boolean field_i;

    final static String d(int param0) {
        if (IntrusiveDequeCursor.field_a == null) {
          return "";
        }
        if (param0 != -579139480) {
          field_l = (String) null;
          return IntrusiveDequeCursor.field_a;
        }
        return IntrusiveDequeCursor.field_a;
    }

    public static void a(byte param0) {
        field_l = null;
        int var1 = -101 % ((param0 - 0) / 63);
    }

    li(PcmSampleStream param0, IntrusiveNode param1) {
        try {
          this.field_j = param0;
          this.field_m = param0.e();
          this.field_k = param1;
          this.field_j.g(qd.field_d * this.field_m + 128 >> 8);
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
