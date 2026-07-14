/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class av extends bca {
    int field_t;
    int field_s;
    int field_q;
    int field_r;

    av(int param0, nq param1, int param2, int param3, int param4, int param5) {
        super(param0, param1);
        ((av) this).field_r = param3;
        ((av) this).field_t = param4;
        ((av) this).field_s = param2;
        ((av) this).field_q = param5;
    }

    av(lu param0) {
        super(param0);
        ((av) this).field_k = param0.e((byte) 123);
        ((av) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (0 > var2) {
                break;
            }
            ((av) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((av) this).field_s = param0.b(16711935);
        ((av) this).field_r = param0.b(16711935);
        ((av) this).field_t = param0.b(16711935);
        ((av) this).field_q = param0.b(16711935);
    }

    final void a(op param0, int param1) {
        ((av) this).a(param0, (byte) -2);
        int var3 = -127 % ((param1 - 12) / 35);
    }

    final void a(byte param0, lu param1) {
        if (param0 >= -12) {
          ((av) this).field_s = 78;
          this.a((byte) -38, param1);
          param1.d(((av) this).field_s, 0);
          param1.d(((av) this).field_r, 0);
          param1.d(((av) this).field_t, 0);
          param1.d(((av) this).field_q, 0);
          return;
        } else {
          this.a((byte) -38, param1);
          param1.d(((av) this).field_s, 0);
          param1.d(((av) this).field_r, 0);
          param1.d(((av) this).field_t, 0);
          param1.d(((av) this).field_q, 0);
          return;
        }
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        if (param1 > -21) {
            return;
        }
        try {
            var4 = param2.getGraphics();
            hga.field_U.a((byte) 80, param0, var4, param3);
            var4.dispose();
        } catch (Exception exception) {
            param2.repaint();
        }
    }

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          ((av) this).a((byte) -84, (lu) null);
          return (at) (Object) new pm(param1, (av) this);
        } else {
          return (at) (Object) new pm(param1, (av) this);
        }
    }

    final static void a(int param0, boolean param1) {
        ia.a(param1, -84);
        if (param0 != 0) {
            return;
        }
    }

    static {
    }
}
