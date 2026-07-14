/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends kk {
    static ka field_f;
    private java.nio.ByteBuffer field_g;

    final static void a(int param0, boolean param1) {
        rk.field_a = kk.field_a;
        ag.field_o = 0;
        ck.field_f = 0;
        fk.field_a = param0;
        ea.field_a = new n(2);
        ea.field_a.a(false, param1, -1, td.a(pe.field_d, la.field_c, true));
    }

    final void a(int param0, byte[] param1) {
        ((ij) this).field_g = java.nio.ByteBuffer.allocateDirect(param1.length);
        if (param0 != -5361) {
          field_f = null;
          java.nio.Buffer discarded$8 = ((ij) this).field_g.position(0);
          java.nio.ByteBuffer discarded$9 = ((ij) this).field_g.put(param1);
          return;
        } else {
          java.nio.Buffer discarded$10 = ((ij) this).field_g.position(0);
          java.nio.ByteBuffer discarded$11 = ((ij) this).field_g.put(param1);
          return;
        }
    }

    final static qb a(String param0, byte param1) {
        if (qa.field_a.b(false)) {
          if (!param0.equals((Object) (Object) qa.field_a.a((byte) 2))) {
            qa.field_a = uf.a(param0, 17);
            if (param1 != -51) {
              return null;
            } else {
              return qa.field_a;
            }
          } else {
            if (param1 != -51) {
              return null;
            } else {
              return qa.field_a;
            }
          }
        } else {
          if (param1 != -51) {
            return null;
          } else {
            return qa.field_a;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 20756) {
            return;
        }
        field_f = null;
    }

    final byte[] a(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        if (param0 != 4208) {
          return null;
        } else {
          var3 = new byte[((ij) this).field_g.capacity()];
          var2 = var3;
          java.nio.Buffer discarded$4 = ((ij) this).field_g.position(0);
          java.nio.ByteBuffer discarded$5 = ((ij) this).field_g.get(var3);
          return var3;
        }
    }

    ij() {
    }

    final static void a(int param0, java.applet.Applet param1) {
        hi.a(0, "", param1);
        if (param0 != 18065) {
            field_f = null;
            wj.a(param1, 0);
            return;
        }
        wj.a(param1, 0);
    }

    static {
    }
}
