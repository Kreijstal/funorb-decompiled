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
        if (!param0) {
          field_b = (jn) null;
          field_c = null;
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0) {
        if (wd.field_f == null) {
          if (param0 == -27864) {
            if (null != iv.field_a) {
              iv.field_a.e();
              return;
            } else {
              return;
            }
          } else {
            field_d = (ri) null;
            if (null != iv.field_a) {
              iv.field_a.e();
              return;
            } else {
              return;
            }
          }
        } else {
          wd.field_f.e();
          if (param0 != -27864) {
            field_d = (ri) null;
            if (null == iv.field_a) {
              return;
            } else {
              iv.field_a.e();
              return;
            }
          } else {
            if (null != iv.field_a) {
              iv.field_a.e();
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_a = new qr();
        field_b = new jn();
    }
}
