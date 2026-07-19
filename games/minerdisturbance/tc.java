/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends pi {
    static ta field_v;
    int field_w;
    static int field_s;
    uj field_u;
    static int field_t;
    static om field_o;
    static String field_r;
    int field_q;
    static String field_p;
    String field_n;

    public static void a(byte param0) {
        field_r = null;
        field_o = null;
        field_v = null;
        field_p = null;
        int var1 = -5 / ((-34 - param0) / 50);
    }

    final static void a(int param0) {
        fa.field_c = null;
        pe.field_pb = 0;
        ng.field_l = -1;
        if (param0 != 9358) {
          field_s = -106;
          il.field_n = false;
          lj.field_q = -1;
          return;
        } else {
          il.field_n = false;
          lj.field_q = -1;
          return;
        }
    }

    final static void a(int param0, int param1) {
        ld var2 = sn.field_c;
        var2.d((byte) -87, param1);
        var2.c(param0, 25564);
        var2.c(2, 25564);
    }

    tc(uj param0, int param1, int param2) {
        try {
            this.field_u = param0;
            this.field_n = param0.a((byte) -115);
            this.field_q = param1;
            this.field_w = param2;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "tc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_v = new ta();
        field_r = "This password contains your Player Name, and would be easy to guess";
        field_p = "An alternative to conventional mining. Using this you can push rocks into gaps or force ore out of boulders. Essential for the eccentric dwarf.";
    }
}
