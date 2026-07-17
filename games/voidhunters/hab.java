/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hab extends uda {
    private boolean field_f;
    static int field_k;
    static int field_i;
    static String field_j;
    static int field_h;
    static wfb[] field_g;
    static String field_e;

    final void b(int param0, boolean param1) {
        if (param0 != 5) {
            return;
        }
        ((hab) this).field_d.a(et.field_c, true, asa.field_a);
    }

    public static void e() {
        field_e = null;
        field_g = null;
        field_j = null;
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 5) {
            ((hab) this).a(88);
        }
    }

    hab(pf param0) {
        super(param0);
        ((hab) this).field_f = false;
    }

    final void a(byte param0, int param1, ura param2) {
        try {
            ((hab) this).field_d.a(param2, -121);
            if (param0 <= 42) {
                ((hab) this).b(-13, true);
            }
            ((hab) this).field_d.h(-126, param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "hab.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, boolean param1) {
        hdb var3 = null;
        oj var4 = null;
        if (param0 == 5) {
          var3 = ((hab) this).field_d.J(10);
          if (var3 != null) {
            if (!param1) {
              ((hab) this).field_d.a(0, (byte) -78, tma.field_q);
              return;
            } else {
              ((hab) this).field_d.g(1, -97);
              ((hab) this).field_d.a((ura) (Object) var3, param0 + -119);
              ((hab) this).field_d.a((byte) -111, tma.field_p);
              ((hab) this).field_d.g(1, param0 ^ -60);
              ((hab) this).field_d.a(et.field_c, true, df.field_o);
              ((hab) this).field_d.a(true, param0 ^ -21120, false, pja.field_l, 2);
              ((hab) this).field_d.a(0, (byte) -97, tma.field_q);
              var4 = ((hab) this).field_d.H((byte) -125);
              var4.b(param0 ^ 5, (pw) (Object) ((hab) this).field_d.z((byte) 103));
              ((hab) this).field_d.a(wda.field_o, true);
              ((hab) this).field_d.g(0, -71);
              ((hab) this).field_f = true;
              return;
            }
          } else {
            ((hab) this).field_d.a(0, (byte) -78, tma.field_q);
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(byte param0) {
        int var2 = 26 / ((34 - param0) / 63);
        return true;
    }

    final void a(int param0) {
        if (((hab) this).field_f) {
          ((hab) this).field_d.g(1, -43);
          ((hab) this).field_d.a((byte) -111, meb.field_d);
          ((hab) this).field_d.a(asa.field_a, true, asa.field_a);
          ((hab) this).field_d.a(2, pea.field_d, param0 + -2536);
          ((hab) this).field_d.a(0, (byte) -125, qcb.field_q);
          ((hab) this).field_d.F((byte) 116);
          ((hab) this).field_d.a((ura) null, param0 + -2652);
          ((hab) this).field_d.g(0, param0 ^ -2481);
          ((hab) this).field_f = false;
          ((hab) this).field_d.a(asa.field_a, true, asa.field_a);
          if (param0 == 2543) {
            return;
          } else {
            field_i = -56;
            return;
          }
        } else {
          ((hab) this).field_d.a(0, (byte) -97, qcb.field_q);
          ((hab) this).field_d.a(asa.field_a, true, asa.field_a);
          if (param0 == 2543) {
            return;
          } else {
            field_i = -56;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 100;
        field_j = null;
        field_e = "Add action (Add node info to custom variable)";
        field_h = 4;
    }
}
