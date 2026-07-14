/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ae extends br {
    int field_f;
    static ao field_h;
    static String field_g;

    abstract void a(int param0, qd param1);

    final static int a(k param0, String param1, int param2) {
        int var3 = 0;
        byte[] var4 = null;
        CharSequence var5 = null;
        var3 = param0.field_j;
        var5 = (CharSequence) (Object) param1;
        var4 = qo.a(var5, (byte) -116);
        if (param2 != -31746) {
          return 73;
        } else {
          param0.c(var4.length, (byte) 78);
          param0.field_j = param0.field_j + r.field_a.a(var4.length, (byte) -62, 0, param0.field_m, param0.field_j, var4);
          return -var3 + param0.field_j;
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 0) {
            field_g = null;
            ((ae) this).field_f = param1;
            return;
        }
        ((ae) this).field_f = param1;
    }

    ae() {
    }

    final static ja[] a(ja param0, int param1) {
        ja[] var2 = null;
        ja[] var3 = null;
        var3 = new ja[9];
        var2 = var3;
        var3[4] = param0;
        if (param1 != 27117) {
          field_g = null;
          return var2;
        } else {
          return var2;
        }
    }

    public static void b(boolean param0) {
        Object var2 = null;
        if (param0) {
          var2 = null;
          int discarded$2 = ae.a((k) null, (String) null, -18);
          field_g = null;
          field_h = null;
          return;
        } else {
          field_g = null;
          field_h = null;
          return;
        }
    }

    void a(byte param0) {
        if (param0 >= -47) {
            Object var3 = null;
            ((ae) this).a(-7, (qd) null);
            ((ae) this).a(true);
            return;
        }
        ((ae) this).a(true);
    }

    ae(int param0) {
        ((ae) this).a(0, param0);
    }

    abstract void a(int param0, boolean param1, int param2, int param3);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "<%0>'s game";
        field_h = new ao(7, 0, 1, 1);
    }
}
