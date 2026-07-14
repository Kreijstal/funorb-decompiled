/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ada extends rva implements tsa {
    static ura field_z;
    private fe field_x;
    static int[] field_y;
    private rj field_B;

    public static void c(int param0) {
        if (param0 >= -122) {
            field_z = null;
            field_y = null;
            field_z = null;
            return;
        }
        field_y = null;
        field_z = null;
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        Object var7 = null;
        if (param4 >= 44) {
          if (((ada) this).field_x.a((byte) 124).b(-4666) != uh.field_k) {
            return;
          } else {
            kv.a(((ada) this).field_x.d(22829), ((ada) this).field_x.a(109), 95, ((ada) this).field_x.j((byte) 110));
            return;
          }
        } else {
          var7 = null;
          ((ada) this).a(-16, -96, (ae) null, 107);
          if (((ada) this).field_x.a((byte) 124).b(-4666) != uh.field_k) {
            return;
          } else {
            kv.a(((ada) this).field_x.d(22829), ((ada) this).field_x.a(109), 95, ((ada) this).field_x.j((byte) 110));
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        eka.field_o.c(mca.field_d, ((ada) this).field_i + (param0 + 4), 4 + (eka.field_o.field_w + (((ada) this).field_n + param1)), 16777215, -1);
    }

    ada(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (isa) null);
        ((ada) this).field_x = new fe((isa) (Object) new hga(10000536), ha.field_b, 0, 0, 140, 25);
        ((ada) this).field_x.a((byte) 111, new uba());
        ((ada) this).field_B = new rj(aua.field_d, (qc) this);
        ((ada) this).field_w = new ae[]{(ae) (Object) ((ada) this).field_x, (ae) (Object) ((ada) this).field_B};
        ((ada) this).field_B.field_r = (isa) (Object) new td();
        ((ada) this).c((byte) 127);
    }

    final void a(int param0, int param1, ae param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((ada) this).field_B.field_y = ((ada) this).field_x.a((byte) 47).b(-4666) == uh.field_k ? true : false;
    }

    final static int b(boolean param0) {
        if (param0) {
            ada.c(-7);
            return tu.field_h;
        }
        return tu.field_h;
    }

    final void a(byte param0) {
        int var2 = 0;
        var2 = 250;
        if (param0 != 88) {
          field_y = null;
          ((ada) this).field_x.a((byte) -31, 140, 25, ((ada) this).field_m + -var2 >> -1682148063, ((ada) this).field_p - -20 + -25 >> -797370687);
          ((ada) this).field_B.a((byte) -31, 100, 30, 10 + (140 + (((ada) this).field_m + -var2 >> -561359551)), (-30 + ((ada) this).field_p - -20 >> 578252321) + 2);
          return;
        } else {
          ((ada) this).field_x.a((byte) -31, 140, 25, ((ada) this).field_m + -var2 >> -1682148063, ((ada) this).field_p - -20 + -25 >> -797370687);
          ((ada) this).field_B.a((byte) -31, 100, 30, 10 + (140 + (((ada) this).field_m + -var2 >> -561359551)), (-30 + ((ada) this).field_p - -20 >> 578252321) + 2);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new ura();
        field_y = new int[8192];
    }
}
