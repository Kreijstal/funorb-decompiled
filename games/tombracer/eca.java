/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eca {
    static String[][] field_b;
    static int field_a;
    static nh[] field_c;

    final static boolean a(byte param0, int param1, long param2, int[] param3, String param4) {
        if (!(sqa.a(param1, 83, param3, param4, param2))) {
            return false;
        }
        int var6 = 17 / ((-37 - param0) / 62);
        if (!(param1 != 1)) {
            param1 = 0;
        }
        wp.field_a = param4;
        bta.field_q = param1;
        CharSequence var8 = (CharSequence) (Object) param4;
        mn.field_n = jd.a(1, var8);
        ica.field_b = param2;
        eua var7 = sa.a(oka.field_w, uka.field_M, tg.field_c, param3, false);
        asa.a(-124, var7);
        return true;
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 30152) {
          var2 = null;
          boolean discarded$2 = eca.a((byte) -86, 99, 60L, (int[]) null, (String) null);
          field_b = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static iu[] a(int param0, int param1) {
        iu[] var3 = new iu[9];
        iu[] var2 = var3;
        var3[param0] = jf.a(param1, 124, 64);
        return var2;
    }

    static {
    }
}
