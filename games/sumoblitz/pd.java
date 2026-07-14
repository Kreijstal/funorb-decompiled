/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends ms {
    static hv field_m;
    int field_o;
    int field_k;
    static int field_l;
    static int field_p;
    static Object field_n;
    static String field_r;
    static int[] field_q;

    public static void a(byte param0) {
        if (param0 > -117) {
          pd.a((byte) 113);
          field_q = null;
          field_r = null;
          field_n = null;
          field_m = null;
          return;
        } else {
          field_q = null;
          field_r = null;
          field_n = null;
          field_m = null;
          return;
        }
    }

    final static void a(byte param0, int param1, of param2) {
        pl var3 = null;
        if (param0 != -65) {
          field_m = null;
          var3 = as.field_v;
          var3.g(param1, 8);
          var3.b((byte) 103, 5);
          var3.b((byte) 46, 0);
          var3.b(117, param2.field_p);
          var3.b((byte) 86, param2.field_l);
          var3.b((byte) 121, param2.field_s);
          return;
        } else {
          var3 = as.field_v;
          var3.g(param1, 8);
          var3.b((byte) 103, 5);
          var3.b((byte) 46, 0);
          var3.b(117, param2.field_p);
          var3.b((byte) 86, param2.field_l);
          var3.b((byte) 121, param2.field_s);
          return;
        }
    }

    final static db a(byte[] param0, int param1, int param2) {
        db var3 = null;
        Object var4 = null;
        if (param2 != 5412) {
          var4 = null;
          db discarded$2 = pd.a((byte[]) null, 48, 96);
          var3 = new db(param0);
          jj.field_a.a((ms) (Object) var3, (byte) 39);
          mn.a(var3, param2 + -5530, param1);
          return var3;
        } else {
          var3 = new db(param0);
          jj.field_a.a((ms) (Object) var3, (byte) 39);
          mn.a(var3, param2 + -5530, param1);
          return var3;
        }
    }

    private pd() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new hv();
        field_r = "Name";
    }
}
