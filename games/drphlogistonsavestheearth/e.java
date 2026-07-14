/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e extends ei {
    private nf field_r;
    static volatile int field_q;
    private boolean field_s;
    private String field_p;

    final static void e(int param0) {
        if (null == ng.field_c) {
          if (null == af.field_g) {
            if (param0 != -20480) {
              field_q = 79;
              rb.a((byte) -102);
              return;
            } else {
              rb.a((byte) -102);
              return;
            }
          } else {
            af.field_g.h((byte) 23);
            if (param0 != -20480) {
              field_q = 79;
              rb.a((byte) -102);
              return;
            } else {
              rb.a((byte) -102);
              return;
            }
          }
        } else {
          ng.field_c.a((byte) -20);
          if (null != af.field_g) {
            af.field_g.h((byte) 23);
            if (param0 == -20480) {
              rb.a((byte) -102);
              return;
            } else {
              field_q = 79;
              rb.a((byte) -102);
              return;
            }
          } else {
            if (param0 != -20480) {
              field_q = 79;
              rb.a((byte) -102);
              return;
            } else {
              rb.a((byte) -102);
              return;
            }
          }
        }
    }

    e(kl param0, kl param1) {
        super(param0);
        ((e) this).field_p = "";
        ((e) this).field_s = false;
        ((e) this).field_r = new nf(param0, param1);
    }

    final static int a(int param0, int param1) {
        if (param0 < 101) {
          int discarded$2 = e.a(21, 94);
          return (-20480 + param1 * 64) / 320 + 128;
        } else {
          return (-20480 + param1 * 64) / 320 + 128;
        }
    }

    final vh a(int param0, String param1) {
        vc var3 = null;
        if (!(((e) this).field_r.a(param0, param1) != u.field_b)) {
            return u.field_b;
        }
        if (!(param1.equals((Object) (Object) ((e) this).field_p))) {
            var3 = jc.a((byte) 45, param1);
            if (var3.a(false)) {
                ((e) this).field_p = param1;
                ((e) this).field_s = var3.b(-15493);
                return ((e) this).field_s ? ce.field_e : u.field_b;
            }
            return nd.field_P;
        }
        return ((e) this).field_s ? ce.field_e : u.field_b;
    }

    final String a(byte param0, String param1) {
        if (!(((e) this).field_r.a(8192, param1) != u.field_b)) {
            return ((e) this).field_r.a((byte) 94, param1);
        }
        if (param0 <= 47) {
            return null;
        }
        if (!(((e) this).a(8192, param1) != u.field_b)) {
            return ce.field_c;
        }
        return fl.field_e;
    }

    final static void a(int param0, boolean param1) {
        if (param0 != -1) {
            return;
        }
        ib.field_f.a(param1, -87);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = -1;
    }
}
