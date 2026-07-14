/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends pn implements Cloneable {
    static long field_m;

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        if (param0 < 92) {
            int discarded$0 = ((vb) this).a(true, false);
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            return -17;
        }
        return 2;
    }

    final nj a(int param0, nj param1) {
        if (param0 != 23525) {
          ((vb) this).b(-84, -83, 69, false, 69, 108);
          return ng.a(dq.field_F, param1, (f) (Object) new vb((f) (Object) new kp(-1)), (byte) -83, nk.field_m);
        } else {
          return ng.a(dq.field_F, param1, (f) (Object) new vb((f) (Object) new kp(-1)), (byte) -83, nk.field_m);
        }
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        if (param4 >= -87) {
          field_m = 115L;
          mb.field_g = mb.field_g - ob.field_l;
          wd.field_j = wd.field_j - 1;
          fn.field_h.a(256, 12 * (param5 + param2), (param0 + param3) * 12, 0, (byte) -111);
          ((vb) this).field_l.a((byte) 92, (f) (Object) param1);
          return ((vb) this).field_l.a(param0, param1, param2, param3, (byte) -109, param5, param6);
        } else {
          mb.field_g = mb.field_g - ob.field_l;
          wd.field_j = wd.field_j - 1;
          fn.field_h.a(256, 12 * (param5 + param2), (param0 + param3) * 12, 0, (byte) -111);
          ((vb) this).field_l.a((byte) 92, (f) (Object) param1);
          return ((vb) this).field_l.a(param0, param1, param2, param3, (byte) -109, param5, param6);
        }
    }

    vb(f param0) {
        super(param0);
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        we.field_h = we.field_h + 24;
        fp.field_a = fp.field_a + 24;
        je.field_j = je.field_j + 12;
        b.field_a = b.field_a + 12;
        if (param5 != -87) {
          field_m = -6L;
          cn.field_e.a(64, 12 * param2, 12 * param1, 0, (byte) -111);
          return (f) (Object) new ig(param0, bd.field_n, ((vb) this).field_l, true);
        } else {
          cn.field_e.a(64, 12 * param2, 12 * param1, 0, (byte) -111);
          return (f) (Object) new ig(param0, bd.field_n, ((vb) this).field_l, true);
        }
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        var7 = -78 % ((74 - param0) / 41);
        if ((param1 ^ -1) == -25) {
          if (24 != param2) {
            de.field_k.b(param4, param5 - param2, 2 * param1, 3 * param2);
            return;
          } else {
            de.field_k.a(param4, -param2 + param5);
            return;
          }
        } else {
          de.field_k.b(param4, param5 - param2, 2 * param1, 3 * param2);
          return;
        }
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
            return null;
        }
        return (f) this;
    }

    static {
    }
}
