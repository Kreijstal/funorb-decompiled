/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static qr field_a;
    static jn field_b;
    static String field_c;
    static ri field_d;

    final static boolean a(byte param0) {
        if (param0 != -64) {
          return false;
        }
        return pg.field_a;
    }

    public static void a(boolean param0) {
        if (param0) {
          field_c = null;
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        }
        field_b = (jn) null;
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0) {
        if (wd.field_f != null) {
          wd.field_f.e();
          if (param0 == -27864) {
            if (null == iv.field_a) {
              return;
            }
            iv.field_a.e();
            return;
          }
          field_d = (ri) null;
          if (null != iv.field_a) {
            iv.field_a.e();
            return;
          }
          return;
        }
        if (param0 != -27864) {
          field_d = (ri) null;
          if (null == iv.field_a) {
            return;
          }
          iv.field_a.e();
          return;
        }
        if (null == iv.field_a) {
          return;
        }
        iv.field_a.e();
    }

    static {
        field_a = new qr();
        field_b = new jn();
    }
}
