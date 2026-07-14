/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends oj {
    private int field_y;
    private int field_z;

    final String a(byte param0, boolean param1) {
        if (!(!param1)) {
            System.out.println("Turn change: new turn: " + ((kc) this).field_y + " player: " + ((kc) this).field_z);
        }
        String var3 = "EventTurnChange: new turn: " + ((kc) this).field_y + " player: " + ((kc) this).field_z;
        int var4 = 2 % ((param0 - 53) / 51);
        return var3;
    }

    final static void d(byte param0) {
        vi.a(-76);
        if (param0 != -112) {
            return;
        }
        mw.b(dh.field_n[0].field_A, jn.field_c, mi.field_l, gl.field_c, jn.field_d, 1);
    }

    final void a(ha param0, int param1) {
        if (param1 != -26661) {
            ((kc) this).field_y = 68;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        if (param2.field_xb.field_X) {
          return false;
        } else {
          param2.f(((kc) this).field_y, ((kc) this).field_z, 0);
          if (param1 >= -84) {
            return false;
          } else {
            return true;
          }
        }
    }

    kc(int param0, int param1) {
        ((kc) this).field_z = param1;
        ((kc) this).field_m = 22;
        ((kc) this).field_y = param0;
    }

    static {
    }
}
