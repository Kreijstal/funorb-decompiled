/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends hf {
    static String field_o;
    int field_k;
    static long[] field_l;
    static dm[] field_r;
    static String[] field_f;
    int[] field_q;
    int field_m;
    static int field_h;
    int field_n;
    static ja[] field_g;
    int field_p;
    int field_i;
    int field_j;

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != -91) {
                return;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(wf.a(var2, 68, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 != 6491) {
          tl.b(-67);
          field_o = null;
          field_g = null;
          field_l = null;
          field_f = null;
          field_r = null;
          return;
        } else {
          field_o = null;
          field_g = null;
          field_l = null;
          field_f = null;
          field_r = null;
          return;
        }
    }

    tl() {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, boolean param7) {
        ((tl) this).field_p = param5;
        ((tl) this).field_n = param0;
        ((tl) this).field_q = param6;
        ((tl) this).field_m = param2;
        ((tl) this).field_i = param1;
        if (!param7) {
          tl.b(-125);
          ((tl) this).field_k = param4;
          ((tl) this).field_j = param3;
          return;
        } else {
          ((tl) this).field_k = param4;
          ((tl) this).field_j = param3;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Prev";
        field_l = new long[32];
        field_g = new ja[1000];
    }
}
