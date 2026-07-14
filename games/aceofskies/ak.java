/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends RuntimeException {
    static ad field_d;
    Throwable field_c;
    static int[] field_b;
    String field_a;
    static boolean field_e;
    static int[] field_f;

    public static void a(boolean param0) {
        int[] var2 = null;
        field_d = null;
        field_b = null;
        if (param0) {
          var2 = (int[]) null;
          wp discarded$2 = ak.a(-20, (wp) null, (int[]) null);
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    final static void a(ga param0, boolean param1, int param2) {
        tq.field_d.a(84, (wf) (Object) param0);
        ac.a(0, param2, param0);
        if (!param1) {
            field_e = false;
        }
    }

    final static wp a(int param0, wp param1, int[] param2) {
        wp var3 = null;
        var3 = new wp(0, 0, 0);
        var3.field_c = ((wp) param1).field_c;
        var3.field_i = param2;
        var3.field_h = ((wp) param1).field_h;
        var3.field_j = ((wp) param1).field_j;
        var3.field_a = ((wp) param1).field_a;
        if (param0 != 15810) {
          return (wp) null;
        } else {
          var3.field_b = ((wp) param1).field_b;
          var3.field_d = ((wp) param1).field_d;
          var3.field_e = ((wp) param1).field_e;
          return var3;
        }
    }

    ak(Throwable param0, String param1) {
        ((ak) this).field_a = param1;
        ((ak) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[1];
        field_e = false;
        field_f = new int[8];
    }
}
