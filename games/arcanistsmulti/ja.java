/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends rl {
    static String field_t;
    private mn field_v;
    static int field_s;
    static int field_u;
    private String field_q;
    private boolean field_x;
    static boolean field_y;
    static String field_w;
    static String field_r;

    public static void d(int param0) {
        field_r = null;
        field_t = null;
        if (param0 != 0) {
            return;
        }
        field_w = null;
    }

    final String a(String param0, byte param1) {
        if (((ja) this).field_v.a(param0, -91) != ra.field_k) {
          if (param1 < -114) {
            if (((ja) this).a(param0, -90) == ra.field_k) {
              return oj.field_b;
            } else {
              return nh.field_v;
            }
          } else {
            return null;
          }
        } else {
          return ((ja) this).field_v.a(param0, (byte) -115);
        }
    }

    final eh a(String param0, int param1) {
        int var3 = 0;
        if (((ja) this).field_v.a(param0, 14) == ra.field_k) {
            return ra.field_k;
        }
        if (param0.equals((Object) (Object) ((ja) this).field_q)) {
            var3 = 75 / ((-50 - param1) / 36);
            return ((ja) this).field_x ? nn.field_s : ra.field_k;
        }
        km var3_ref = ib.a(2, param0);
        if (!(var3_ref.a((byte) -111))) {
            return ug.field_c;
        }
        ((ja) this).field_q = param0;
        ((ja) this).field_x = var3_ref.a(-21813);
        var3 = 75 / ((-50 - param1) / 36);
        return ((ja) this).field_x ? nn.field_s : ra.field_k;
    }

    final static kc d(byte param0) {
        if (param0 != 90) {
            kc discarded$0 = ja.d((byte) -69);
            return lf.field_b.field_Cb;
        }
        return lf.field_b.field_Cb;
    }

    ja(rn param0, rn param1) {
        super(param0);
        ((ja) this).field_x = false;
        ((ja) this).field_q = "";
        ((ja) this).field_v = new mn(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Remove <%0> from ignore list";
        field_s = 0;
        field_u = 200;
        field_w = "Breaking real-world laws";
        field_r = "Pause Menu";
    }
}
