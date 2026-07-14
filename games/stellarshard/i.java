/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class i {
    static th field_d;
    static oj field_c;
    static int field_a;
    static int[] field_e;
    static int field_b;

    final static void a(java.awt.Canvas param0, int param1) {
        L0: {
          if (11 == eg.field_d) {
            tc.d(1);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= -96) {
          field_a = 100;
          nb.a(b.field_v, fg.field_K, am.field_i, (byte) -120);
          pd.a(param0, 0, 0, (byte) -79);
          return;
        } else {
          nb.a(b.field_v, fg.field_K, am.field_i, (byte) -120);
          pd.a(param0, 0, 0, (byte) -79);
          return;
        }
    }

    abstract void a(byte[] param0, byte param1);

    final static wb a(int param0, String param1) {
        if (param1 == null) {
            return rk.field_c;
        }
        if (0 == param1.length()) {
            return rk.field_c;
        }
        int var2 = param1.indexOf('@');
        if (-1 == var2) {
            return uj.field_d;
        }
        String var3 = param1.substring(0, var2);
        String var4 = param1.substring(var2 + 1);
        int var6 = 35 % ((param0 - 58) / 48);
        wb var5 = ok.a(var3, 1);
        if (!(var5 == null)) {
            return var5;
        }
        return sd.a((byte) -96, var4);
    }

    abstract byte[] a(int param0);

    public static void b(int param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        if (param0 != 64) {
            Object var2 = null;
            wb discarded$0 = i.a(76, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new th();
        field_e = new int[256];
        field_c = new oj();
    }
}
