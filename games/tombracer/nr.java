/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nr implements bo {
    private int field_b;
    static mla field_d;
    private int field_c;
    static sla field_a;

    public final void a(kh param0, byte param1) {
        Object var4 = null;
        param0.h((byte) -37);
        ((nr) this).field_b = param0.b((byte) 44, 3);
        if (-2 != (param0.b((byte) 44, 1) ^ -1)) {
          ((nr) this).field_c = param0.b((byte) 44, 2);
          param0.i((byte) 98);
          if (param1 == -19) {
            return;
          } else {
            var4 = null;
            ((nr) this).a((kh) null, (byte) -120);
            return;
          }
        } else {
          ((nr) this).field_c = -1;
          param0.i((byte) 98);
          if (param1 == -19) {
            return;
          } else {
            var4 = null;
            ((nr) this).a((kh) null, (byte) -120);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
            nr.a(true);
            field_a = null;
            return;
        }
        field_a = null;
    }

    public final void a(int param0, kh param1) {
        param1.i(8);
        param1.a((byte) 89, ((nr) this).field_b, 3);
        if (param0 == 200) {
          if ((((nr) this).field_c ^ -1) == 0) {
            param1.a((byte) -127, 1, 1);
            param1.k(param0 + -1826190886);
            return;
          } else {
            param1.a((byte) 121, 0, 1);
            param1.a((byte) 53, ((nr) this).field_c, 2);
            param1.k(param0 + -1826190886);
            return;
          }
        } else {
          nr.a(false);
          if ((((nr) this).field_c ^ -1) == 0) {
            param1.a((byte) -127, 1, 1);
            param1.k(param0 + -1826190886);
            return;
          } else {
            param1.a((byte) 121, 0, 1);
            param1.a((byte) 53, ((nr) this).field_c, 2);
            param1.k(param0 + -1826190886);
            return;
          }
        }
    }

    final void a(byte param0, qh param1, v param2) {
        param1.a((byte) 113, ((nr) this).field_b, ((nr) this).field_c);
        if (param0 != -78) {
            nr.a(false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new mla();
        field_a = new sla();
    }
}
