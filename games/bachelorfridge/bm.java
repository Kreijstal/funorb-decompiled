/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends pp {
    int field_k;
    private int field_j;
    int field_l;
    static String field_i;
    static String field_m;

    public static void d(byte param0) {
        field_m = null;
        field_i = null;
        if (param0 != 3) {
            field_m = (String) null;
        }
    }

    final static int a(int param0, int param1) {
        String var2 = null;
        ji var3 = null;
        var2 = lka.field_E[param1][5];
        var2 = var2.toLowerCase();
        var2 = var2.trim();
        var3 = (ji) ((Object) fi.field_m.a(true, (long)var2.hashCode()));
        if (param0 <= 58) {
          field_m = (String) null;
          return var3.field_h;
        } else {
          return var3.field_h;
        }
    }

    bm(int param0, int param1, int param2) {
        this.field_j = param0;
        this.field_k = param1;
        this.field_l = param2;
    }

    final void a(lu param0, byte param1) {
        try {
            int var3_int = 96 / ((34 - param1) / 58);
            super.a(param0, (byte) -58);
            param0.d(this.field_j, 0);
            param0.d(this.field_k, 0);
            param0.d(this.field_l, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "bm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(aga param0, op param1, int param2) {
        try {
            if (param2 != 12) {
                lu var5 = (lu) null;
                this.a((lu) null, (byte) 36);
            }
            param1.b((byte) 76, this.field_j, this.field_k, this.field_l);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "bm.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        an.field_q = param1;
        ha.field_n = param0;
        eo.field_l = param4;
        if (param3 != -14702) {
            return;
        }
        pw.field_x = param2;
    }

    static {
        field_i = "Speed</col>";
        field_m = "The invitation has been withdrawn.";
    }
}
