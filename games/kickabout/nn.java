/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends wj implements vh {
    private wi field_H;
    static ot field_B;
    static String field_L;
    static ot field_K;
    static String[] field_G;
    private wi field_J;
    static boolean field_D;
    static String[] field_I;
    private wi field_E;
    static ut field_C;

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        int var7 = 0;
        var7 = Kickabout.field_G;
        if (param3 > 64) {
          if (param1 != ((nn) this).field_J) {
            if (param1 != ((nn) this).field_E) {
              if (((nn) this).field_H != param1) {
                return;
              } else {
                bh.a(true);
                return;
              }
            } else {
              fr.a((byte) -76);
              return;
            }
          } else {
            nn.a(-25085);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0) {
        Object var2 = null;
        if (param0 != -25085) {
          nn.k(115);
          var2 = null;
          ui.a("", (byte) 111, (String) null);
          return;
        } else {
          var2 = null;
          ui.a("", (byte) 111, (String) null);
          return;
        }
    }

    public static void k(int param0) {
        if (param0 != 2) {
          field_C = null;
          field_L = null;
          field_B = null;
          field_I = null;
          field_G = null;
          field_K = null;
          field_C = null;
          return;
        } else {
          field_L = null;
          field_B = null;
          field_I = null;
          field_G = null;
          field_K = null;
          field_C = null;
          return;
        }
    }

    public nn() {
        super(0, 0, 476, 225, (gj) null);
        ((nn) this).field_E = new wi(dw.field_f, (jv) null);
        ((nn) this).field_J = new wi(vb.field_e, (jv) null);
        ((nn) this).field_H = new wi(ba.field_o, (jv) null);
        op var1 = new op();
        ((nn) this).field_E.field_r = (gj) (Object) var1;
        ((nn) this).field_J.field_r = (gj) (Object) var1;
        ((nn) this).field_H.field_r = (gj) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> -1929100191;
        ((nn) this).field_J.a(30, 1, ((nn) this).field_n + -var3 >> 1174333729, var4, -var2 + (((nn) this).field_i - 48));
        ((nn) this).field_H.a(30, 1, var4 + ((-var3 + ((nn) this).field_n >> -879203903) - -var2), var4, -48 + (((nn) this).field_i + -var2));
        ((nn) this).field_E.a(30, 1, ((nn) this).field_n + -var3 >> -705987071, var3, -(var2 * 2) + (((nn) this).field_i + -78));
        ((nn) this).field_J.field_k = (jv) this;
        ((nn) this).field_E.field_k = (jv) this;
        ((nn) this).field_H.field_k = (jv) this;
        ((nn) this).field_E.field_u = so.field_c;
        ((nn) this).field_H.field_u = pv.field_G;
        ((nn) this).a(-59, (fd) (Object) ((nn) this).field_J);
        ((nn) this).a(-121, (fd) (Object) ((nn) this).field_E);
        ((nn) this).a(-54, (fd) (Object) ((nn) this).field_H);
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        if (super.a(param0, (byte) -101, param2, param3)) {
          return true;
        } else {
          if ((param3 ^ -1) == -99) {
            return ((nn) this).a(param2, (byte) -100);
          } else {
            if (param1 < -60) {
              if ((param3 ^ -1) != -100) {
                return false;
              } else {
                return ((nn) this).b(param2, (byte) 126);
              }
            } else {
              return true;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param2 + ((nn) this).field_t;
        int var6 = param3 + ((nn) this).field_g;
        int discarded$0 = gf.field_a.a(vb.field_i, 20 + var5, 20 + var6, ((nn) this).field_n + -40, ((nn) this).field_i + -50, 16777215, -1, 1, 0, gf.field_a.field_G);
        super.a(param0, (int) (char)param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new String[]{"POW:", "SPD:", "TCK:", "EXP:"};
        field_D = false;
        field_L = "<%0> has resigned.";
    }
}
