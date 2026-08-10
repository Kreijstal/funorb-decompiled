/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pb {
    static String field_c;
    static String field_b;
    static int field_a;

    abstract pb b(byte param0);

    public static void a(int param0) {
        if (param0 != -31237) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    abstract int a(int param0, int param1);

    abstract void a(boolean param0, ta param1, boolean param2);

    void a(boolean param0, int param1, int param2, int param3) {
        if (!param0) {
            field_c = (String) null;
        }
    }

    void a(byte param0, ta param1) {
        try {
            if (param0 != 19) {
                field_a = 19;
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "pb.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(byte param0) {
        int var2 = -66 % ((29 - param0) / 42);
    }

    abstract int a(byte param0, boolean param1);

    final static void a(int param0, un param1, int param2, int param3, int param4, int param5, String param6, int param7, int param8) {
        try {
            fk.field_v = param5;
            em.field_g = param6;
            pj.field_x = param8;
            kn.field_q = param2;
            ah.field_e = param7;
            cb.field_m = param0;
            cc.field_a = param1;
            CrazyCrystals.field_D = param3;
            if (param4 != 1843275042) {
                field_b = (String) null;
            }
            oi.field_d = (ob) ((Object) new ap());
            hc.field_a = new ni(param1);
            ch.field_d = new pk(oi.field_d, hc.field_a);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "pb.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    abstract void a(int param0, int param1, ta param2);

    final static int a(int param0, byte param1) {
        param0--;
        param0 = param0 | param0 >>> 23041505;
        param0 = param0 | param0 >>> 1843275042;
        param0 = param0 | param0 >>> 1138636740;
        param0 = param0 | param0 >>> -1715481528;
        if (param1 > -41) {
          pb.a(73);
          param0 = param0 | param0 >>> 1666788048;
          return 1 + param0;
        } else {
          param0 = param0 | param0 >>> 1666788048;
          return 1 + param0;
        }
    }

    static {
        field_c = "Passwords can only contain letters and numbers";
    }
}
