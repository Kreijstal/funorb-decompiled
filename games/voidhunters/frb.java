/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class frb extends rqa {
    final static eu a(ds param0, byte param1) {
        int var2 = 66 % ((70 - param1) / 39);
        return new eu(param0.a(true), param0.a(true), param0.a(true), param0.a(true), param0.c((byte) -123), param0.e((byte) -90));
    }

    final static String a(int param0, int param1) {
        if (param1 <= 73) {
            Object var3 = null;
            eu discarded$6 = frb.a((ds) null, (byte) -91);
            if (!(vqa.field_g == null)) {
                return Integer.toString(vqa.field_g.field_m.b(1).field_f.field_a[param0]);
            }
            return "Unknown";
        }
        if (!(vqa.field_g == null)) {
            return Integer.toString(vqa.field_g.field_m.b(1).field_f.field_a[param0]);
        }
        return "Unknown";
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          eu discarded$2 = frb.a((ds) null, (byte) -82);
          return new nc((Object) (Object) frb.a(100, 96));
        } else {
          return new nc((Object) (Object) frb.a(100, 96));
        }
    }

    frb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
