/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static sj field_b;
    static String[] field_c;
    static ut field_a;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
          field_a = (ut) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static void a(byte param0) {
        k.field_i = 0;
        if (param0 > 126) {
          td.field_d = -1;
          nc.field_a = false;
          mh.field_o = null;
          ws.field_e = -1;
          return;
        }
        d.a((byte) -102);
        td.field_d = -1;
        nc.field_a = false;
        mh.field_o = null;
        ws.field_e = -1;
    }

    final static int a(boolean param0, int param1) {
        if (param1 < 0) {
          param1 = Math.min(param1 + 91750, 0);
        } else {
          param1 = Math.max(param1 - 91750, 0);
        }
        if (param0) {
          if (Math.abs(param1) < 58982) {
            param1 = 0;
          }
          return param1;
        }
        d.a(true, -93);
        if (Math.abs(param1) < 58982) {
          param1 = 0;
        }
        return param1;
    }

    static {
        field_c = new String[]{"total kicks", "total passes", "total shots", "total headers"};
    }
}
