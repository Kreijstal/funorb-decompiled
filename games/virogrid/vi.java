/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends bk {
    static String field_m;
    private String field_i;
    static p field_h;
    static float field_k;
    private String field_e;
    static String field_j;
    static long field_n;
    static boolean field_l;
    static id field_g;
    static String field_f;

    final ul a(boolean param0) {
        if (!param0) {
            vi.b((byte) 48);
            return qg.field_r;
        }
        return qg.field_r;
    }

    final static void b(byte param0) {
        kb.field_c = false;
        fe.field_Fb = false;
        if (param0 >= -113) {
          vi.b((byte) -39);
          kf.a(-1, -1);
          cb.field_c = kh.field_e;
          pa.field_l = kh.field_e;
          return;
        } else {
          kf.a(-1, -1);
          cb.field_c = kh.field_e;
          pa.field_l = kh.field_e;
          return;
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_m = null;
        if (param0 != 31856) {
          vi.b((byte) -109);
          field_h = null;
          field_j = null;
          field_f = null;
          return;
        } else {
          field_h = null;
          field_j = null;
          field_f = null;
          return;
        }
    }

    vi(String param0, String param1) {
        ((vi) this).field_i = param1;
        ((vi) this).field_e = param0;
    }

    final void a(boolean param0, jc param1) {
        if (param0) {
            return;
        }
        param1.b(((vi) this).field_e, (byte) 112);
        param1.c(((vi) this).field_i, (byte) 82);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Members";
        field_j = "Invite only";
        field_h = new p();
        field_f = "No";
    }
}
