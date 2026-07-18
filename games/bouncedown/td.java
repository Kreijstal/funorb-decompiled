/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class td {
    static int field_a;
    static int field_b;

    abstract byte[] a(int param0, boolean param1);

    final static void a(int param0, gk param1, gk param2, gk param3, boolean param4) {
        try {
            pb.field_k = kg.a(2, "");
            pb.field_k.a(false, (byte) -48);
            uc.a(param2, 118, param3, param1);
            tk.a(126);
            vc.field_F = wj.field_a;
            fh.field_B = wj.field_a;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "td.C(" + 1 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static boolean a(int param0) {
        return fe.field_g;
    }

    abstract int a(int param0, int param1);

    final static void a(byte param0) {
        L0: {
          eh.a(true);
          if (ch.field_h != null) {
            mh.a(ch.field_h, (byte) 86);
            break L0;
          } else {
            break L0;
          }
        }
        q.l(8927);
        mc.a(-660);
        hh.b((byte) 48);
        if (wg.b(true)) {
          hh.field_p.a(true, 1);
          jj.a(0, true);
          kc.a((byte) 18);
          return;
        } else {
          kc.a((byte) 18);
          return;
        }
    }

    abstract g b(int param0);

    static {
    }
}
