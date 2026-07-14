/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dfb extends rqa {
    static String field_o;
    static String field_p;
    static long field_q;

    final static void a(int param0) {
        if (null == klb.field_r) {
          if (param0 == 4410) {
            if (null != vqa.field_i) {
              vqa.field_i.g(25880);
              fha.e(95);
              return;
            } else {
              fha.e(95);
              return;
            }
          } else {
            field_o = null;
            if (null != vqa.field_i) {
              vqa.field_i.g(25880);
              fha.e(95);
              return;
            } else {
              fha.e(95);
              return;
            }
          }
        } else {
          klb.field_r.e(param0 + -4299);
          if (param0 != 4410) {
            field_o = null;
            if (null == vqa.field_i) {
              fha.e(95);
              return;
            } else {
              vqa.field_i.g(25880);
              fha.e(95);
              return;
            }
          } else {
            if (null != vqa.field_i) {
              vqa.field_i.g(25880);
              fha.e(95);
              return;
            } else {
              fha.e(95);
              return;
            }
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc(mbb.field_b);
    }

    dfb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(int param0) {
        field_o = null;
        field_p = null;
        if (param0 <= 78) {
            field_o = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "<%0> must play 1 more rated game before playing with the current options.";
        field_o = "Remove <%0> from friend list";
    }
}
