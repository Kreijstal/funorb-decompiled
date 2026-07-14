/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br extends kp implements ik {
    static ve field_Y;
    static String field_W;
    static String field_S;
    private of field_Z;
    static int field_X;
    private int field_V;
    static int field_Q;
    static boolean field_R;
    static int field_T;
    static int field_U;

    final static void a(java.awt.Frame param0, jj param1, int param2) {
        wk var3 = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        L0: while (true) {
          var3 = param1.a(false, param0);
          L1: while (true) {
            if (-1 != (var3.field_b ^ -1)) {
              if ((var3.field_b ^ -1) == -2) {
                if (param2 != 8) {
                  field_Y = null;
                  param0.setVisible(false);
                  param0.dispose();
                  return;
                } else {
                  param0.setVisible(false);
                  param0.dispose();
                  return;
                }
              } else {
                um.a(true, 100L);
                continue L0;
              }
            } else {
              um.a(true, 10L);
              continue L1;
            }
          }
        }
    }

    final void h(byte param0) {
        if (param0 <= 16) {
            return;
        }
        super.h((byte) 89);
        if (!(null == ((br) this).field_Z)) {
            ((br) this).field_Z.b(18340);
        }
    }

    final void a(boolean param0, of param1) {
        ((br) this).field_Z = param1;
        if (!param0) {
            Object var4 = null;
            ((br) this).a((byte) 118, -53, -31, (iq) null);
        }
    }

    final static int b(int param0, byte param1) {
        if (param1 != 48) {
            field_U = -18;
            return param0;
        }
        return param0;
    }

    final static String a(String param0, int param1, int param2) {
        CharSequence var6 = (CharSequence) (Object) param0;
        if (!(hi.a((byte) 122, var6))) {
            return or.field_a;
        }
        if (wc.a(param0, true)) {
            return Vertigo2.field_K;
        }
        if (!(2 == ba.field_d)) {
            return jf.field_J;
        }
        if (iq.b(param0, 109)) {
            return Vertigo2.a(new String[1], lk.field_f, 55);
        }
        if (!(vd.field_a < param2)) {
            return eb.field_i;
        }
        if (!(!c.a(param0, (byte) -116))) {
            return Vertigo2.a(new String[1], wb.field_C, -4);
        }
        mi var5 = uh.field_Wb;
        var5.j(param1, 127);
        var5.field_u = var5.field_u + 1;
        int var4 = var5.field_u;
        var5.f(2, -92);
        var5.a((byte) 0, param0);
        var5.b((byte) -98, var5.field_u + -var4);
        return null;
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        Object var6 = null;
        super.a((byte) 45, param1, param2, param3);
        if (param0 < 6) {
          var6 = null;
          br.a((java.awt.Frame) null, (jj) null, -16);
          ((br) this).field_V = -param1 + (-((br) this).field_o + ed.field_n);
          return;
        } else {
          ((br) this).field_V = -param1 + (-((br) this).field_o + ed.field_n);
          return;
        }
    }

    public static void n(int param0) {
        field_W = null;
        field_Y = null;
        if (param0 != -17131) {
            return;
        }
        field_S = null;
    }

    final String a(boolean param0) {
        if (((br) this).field_p) {
          if (((br) this).field_q != null) {
            if (param0) {
              int discarded$2 = br.b(-110, (byte) -108);
              jn.a(gb.field_d, -4765, ed.field_n - (-((br) this).field_n - -((br) this).field_V));
              return ((br) this).field_q;
            } else {
              jn.a(gb.field_d, -4765, ed.field_n - (-((br) this).field_n - -((br) this).field_V));
              return ((br) this).field_q;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final of a(byte param0) {
        if (param0 != -5) {
            field_U = -34;
            return ((br) this).field_Z;
        }
        return ((br) this).field_Z;
    }

    br(String param0, uf param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = "Quick Chat Help";
        field_S = "Please enter your age in years";
        field_Y = new ve(8, 0, 4, 1);
    }
}
