/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static int[] field_h;
    static volatile boolean field_f;
    static sf[] field_d;
    static String field_j;
    static int field_e;
    static String field_i;
    static wk[] field_g;
    static int field_b;
    static int field_c;
    static cm field_a;
    static mi field_k;

    final static void a(java.awt.Canvas param0, int param1) {
        qe.a((java.awt.Component) (Object) param0, param1 ^ -21768);
        hb.a(0, (java.awt.Component) (Object) param0);
        if (param1 == 9174) {
          if (nc.field_j != null) {
            nc.field_j.b((java.awt.Component) (Object) param0, true);
            return;
          } else {
            return;
          }
        } else {
          field_b = -11;
          if (nc.field_j == null) {
            return;
          } else {
            nc.field_j.b((java.awt.Component) (Object) param0, true);
            return;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 < 13) {
          field_k = null;
          field_j = null;
          field_k = null;
          field_g = null;
          field_a = null;
          field_i = null;
          field_d = null;
          field_h = null;
          return;
        } else {
          field_j = null;
          field_k = null;
          field_g = null;
          field_a = null;
          field_i = null;
          field_d = null;
          field_h = null;
          return;
        }
    }

    final static void a(int param0, mg param1) {
        if (param1 == null) {
          return;
        } else {
          jk.field_i = param1;
          qf.field_c.field_M.g(6);
          qf.field_c.a((gh) (Object) jk.field_i, 127);
          if (param0 != 12105) {
            return;
          } else {
            vb.field_e = true;
            return;
          }
        }
    }

    final static void a(int param0, byte param1, tc param2) {
        ic.field_B.a(3, (ck) (Object) param2);
        vh.a(param0, param2, (byte) 109);
        if (param1 > -24) {
            Object var4 = null;
            pa.a(45, (mg) null);
        }
    }

    final static void a(cm param0, int param1, cm param2) {
        int var3 = -47 / ((param1 - 53) / 45);
        rj.field_d = param2;
        field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = true;
        field_e = -1;
        field_c = -1;
        field_j = "Co-op highscores";
        field_i = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
