/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq extends qq implements vca {
    private mj field_i;
    static int field_j;
    static int field_k;

    mq(jp param0, mj param1, boolean param2) {
        super(param0, 34963, param2);
        ((mq) this).field_i = param1;
    }

    public final void a(int param0, int param1) {
        super.a(param0, param1 * ((mq) this).field_i.field_h);
    }

    public final boolean b(int param0) {
        int var2 = 10 / ((param0 - 13) / 37);
        return super.a((byte) -81, ((mq) this).field_d.field_Sc);
    }

    public final void a(int param0) {
        if (param0 >= -84) {
            return;
        }
        super.a(-119);
    }

    final static boolean a(int param0, int param1, boolean param2) {
        if (param2) {
            return false;
        }
        return 0 != (param1 & 2048) ? true : false;
    }

    public final jaclib.memory.Buffer a(byte param0, boolean param1) {
        if (param0 > -23) {
          field_k = 77;
          return super.a(false, param1, ((mq) this).field_d.field_Sc);
        } else {
          return super.a(false, param1, ((mq) this).field_d.field_Sc);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 100;
    }
}
