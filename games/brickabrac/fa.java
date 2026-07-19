/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends nm {
    int field_k;
    int field_i;
    static String field_j;

    final static pe a(int param0, byte param1, int param2, int param3) {
        pe var4 = null;
        var4 = new pe();
        var4.field_w = param2;
        if (param1 > -68) {
          field_j = (String) null;
          var4.field_m = new int[param0];
          ob.field_F.a(var4, (byte) 3);
          i.a(param3, var4, 108);
          return var4;
        } else {
          var4.field_m = new int[param0];
          ob.field_F.a(var4, (byte) 3);
          i.a(param3, var4, 108);
          return var4;
        }
    }

    private fa() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        field_j = null;
        if (param0 != -102) {
            field_j = (String) null;
        }
    }

    static {
        field_j = "Waiting for levels";
    }
}
