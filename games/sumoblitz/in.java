/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in extends ie {
    static ti field_D;
    static String field_C;
    static int field_z;
    static String field_B;
    int field_A;

    final static boolean g(int param0) {
        if (param0 > -26) {
            field_B = null;
            if (mp.field_a < 20) {
                return true;
            }
            int discarded$2 = -1;
            if (!we.g()) {
                return true;
            }
            if (jk.field_c <= 0) {
                return false;
            }
            if (au.c(1)) {
                return false;
            }
            return true;
        }
        if (mp.field_a < 20) {
            return true;
        }
        int discarded$5 = -1;
        if (!we.g()) {
            return true;
        }
        if (jk.field_c <= 0) {
            return false;
        }
        if (au.c(1)) {
            return false;
        }
        return true;
    }

    in(pk param0) {
        super(param0.field_r, param0.field_v, param0.field_q, param0.field_p, (mh) null, (qm) null);
        try {
            param0.a(-116, 0, 0, ((in) this).field_p, ((in) this).field_q);
            ((in) this).field_A = 256;
            ((in) this).field_y = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "in.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public in() {
        super(0, 0, 0, 0, (mh) null, (qm) null);
        ((in) this).field_A = 256;
    }

    public static void a(byte param0) {
        field_C = null;
        field_D = null;
        field_B = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        wb var6 = null;
        if (0 != param3) {
          return;
        } else {
          if (null != ((in) this).field_y) {
            if (((in) this).field_A != 0) {
              if (((in) this).field_A == 256) {
                ((in) this).field_y.a(((in) this).field_r + param0, ((in) this).field_v + param1, (byte) -125, param3);
                return;
              } else {
                var6 = new wb(((in) this).field_y.field_q, ((in) this).field_y.field_p);
                jq.a(7161, var6);
                if (param2 >= -35) {
                  field_C = null;
                  ((in) this).field_y.a(0, 0, (byte) -55, param3);
                  su.a((byte) 108);
                  var6.a(((in) this).field_r + param0, param1 - -((in) this).field_v, ((in) this).field_A);
                  return;
                } else {
                  ((in) this).field_y.a(0, 0, (byte) -55, param3);
                  su.a((byte) 108);
                  var6.a(((in) this).field_r + param0, param1 - -((in) this).field_v, ((in) this).field_A);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = 0;
        field_B = "Next";
    }
}
