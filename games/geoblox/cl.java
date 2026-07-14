/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static java.security.SecureRandom field_e;
    static String field_d;
    static uf field_c;
    static int field_a;
    static dm field_b;

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        if (param0 != -9474) {
            cl.a(62);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static sl a(byte param0, String param1) {
        if (param0 > 56) {
          if (tf.field_d != si.field_g) {
            if (si.field_g == va.field_e) {
              if (!param1.equals((Object) (Object) cg.field_k)) {
                si.field_g = tf.field_d;
                cg.field_k = param1;
                me.field_g = null;
                return null;
              } else {
                si.field_g = uf.field_l;
                return me.field_g;
              }
            } else {
              si.field_g = tf.field_d;
              cg.field_k = param1;
              me.field_g = null;
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_a = -115;
          if (tf.field_d != si.field_g) {
            if (si.field_g == va.field_e) {
              if (!param1.equals((Object) (Object) cg.field_k)) {
                si.field_g = tf.field_d;
                cg.field_k = param1;
                me.field_g = null;
                return null;
              } else {
                si.field_g = uf.field_l;
                return me.field_g;
              }
            } else {
              si.field_g = tf.field_d;
              cg.field_k = param1;
              me.field_g = null;
              return null;
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 10;
        field_d = "Continue";
    }
}
