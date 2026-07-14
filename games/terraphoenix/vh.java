/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vh extends uf {
    static String field_n;
    static bg[] field_k;
    static int[][] field_j;
    long field_m;
    vh field_i;
    static String field_l;
    vh field_o;
    static String field_h;

    final static boolean a(int param0, int param1, fa param2, boolean param3) {
        byte[] var5 = param2.b(param0, -106, param1);
        byte[] var4 = var5;
        if (!param3) {
            field_n = null;
            if (!(var5 != null)) {
                return false;
            }
            b.a(var5, (byte) -110);
            return true;
        }
        if (!(var5 != null)) {
            return false;
        }
        b.a(var5, (byte) -110);
        return true;
    }

    final static void a(String param0, byte param1, float param2) {
        ad.field_e = param0;
        int var3 = -44 % ((-15 - param1) / 53);
        ed.field_d = param2;
    }

    final void c(byte param0) {
        if (((vh) this).field_i != null) {
          ((vh) this).field_i.field_o = ((vh) this).field_o;
          ((vh) this).field_o.field_i = ((vh) this).field_i;
          ((vh) this).field_i = null;
          if (param0 != 13) {
            ((vh) this).field_m = 69L;
            ((vh) this).field_o = null;
            return;
          } else {
            ((vh) this).field_o = null;
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_n = null;
        if (param0 != 7229) {
          field_h = null;
          field_j = null;
          field_k = null;
          field_l = null;
          field_h = null;
          return;
        } else {
          field_j = null;
          field_k = null;
          field_l = null;
          field_h = null;
          return;
        }
    }

    protected vh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Soldier";
        field_h = "    Low Walls";
    }
}
