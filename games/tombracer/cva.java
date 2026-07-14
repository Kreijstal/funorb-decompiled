/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cva {
    int field_d;
    boolean field_a;
    static ura field_b;
    static String field_e;
    static dk[] field_c;

    final static void a(int param0) {
        int var1 = 0;
        if (wba.field_o == null) {
          throw new IllegalStateException("NGR");
        } else {
          wba.field_o.field_h = true;
          var1 = 105 % ((param0 - -32) / 62);
          uu.b(12475, 1);
          return;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_c = null;
        if (param0 != 1) {
            cva.b(-7);
        }
    }

    cva(boolean param0, int param1) {
        ((cva) this).field_a = param0 ? true : false;
        ((cva) this).field_d = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ura();
        field_e = "Only show private chat from my friends and opponents";
    }
}
