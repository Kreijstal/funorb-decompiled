/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq {
    private int field_b;
    static vn field_a;

    final static void a(int param0, int param1, boolean param2) {
        if (param1 != mb.field_b) {
          L0: {
            mb.field_b = param1;
            if (!param2) {
              gn.a(mb.field_b, true);
              break L0;
            } else {
              mp.a(mb.field_b, 124);
              qv.a(mb.field_b, 4);
              break L0;
            }
          }
          if (param0 > -87) {
            field_a = null;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            ((tq) this).a(-14, 14);
        }
        jaggl.OpenGL.glEndList();
    }

    tq(fr param0, int param1) {
        ((tq) this).field_b = jaggl.OpenGL.glGenLists(param1);
    }

    final void a(byte param0, char param1) {
        jaggl.OpenGL.glCallList(param1 + ((tq) this).field_b);
        if (param0 == 121) {
            return;
        }
        field_a = null;
    }

    final void a(int param0, int param1) {
        jaggl.OpenGL.glNewList(((tq) this).field_b + param0, param1);
    }

    public static void a(byte param0) {
        if (param0 >= -6) {
            field_a = null;
        }
        field_a = null;
    }

    final static boolean a(int param0, boolean param1, int param2) {
        if (!param1) {
            tq.a(34, -21, true);
        }
        return -1 != (param2 & 256 ^ -1) ? true : false;
    }

    final static void a(byte param0, ah param1) {
        if (oc.field_e <= in.field_z) {
            hb.a(param1, -1);
            oc.field_e = (int)((double)oc.field_e + 1.5 * (double)oc.field_e);
        }
        if (param0 == -106) {
            return;
        }
        tq.a((byte) -12);
    }

    static {
    }
}
