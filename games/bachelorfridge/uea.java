/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uea extends kj {
    static kv field_j;
    static int field_i;
    static String field_g;
    private kv field_f;
    private int field_h;

    final void a(int param0, int param1, int param2) {
        int var4 = (int)((1.0 - Math.cos((double)(((uea) this).field_h * 4) * 3.141592653589793 / 50.0)) * 64.0);
        super.a(param0, param1, param2);
        ((uea) this).field_f.a(param2, param0, var4);
    }

    public static void c() {
        field_j = null;
        field_g = null;
        int var1 = 0;
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 21) {
          return true;
        } else {
          L0: {
            int fieldTemp$2 = ((uea) this).field_h - 1;
            ((uea) this).field_h = ((uea) this).field_h - 1;
            if (fieldTemp$2 > 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            ((uea) this).field_f = null;
        }
    }

    uea(gj param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        try {
            ((uea) this).field_h = 50;
            ((uea) this).field_f = new kv(128, 64);
            bu.a(0, ((uea) this).field_f);
            param0.field_s.field_p.e(0, 0, param3);
            db.b(100);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Enter name of friend to add to list";
    }
}
