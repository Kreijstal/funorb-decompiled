/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static cj field_b;
    static int[] field_c;
    static String field_a;

    final static void a(byte param0, int param1, int param2, int param3) {
        fq.field_n = param2;
        qh.field_e = param3;
        hp.field_k = param1;
        int var4 = -111 % ((param0 - -71) / 49);
    }

    final static void a(ga param0, int param1, int param2, byte param3) {
        ok.a(-105, -1, param0, param1, -1, param2);
        if (param3 != 102) {
            nn.a(true);
        }
    }

    public static void b(int param0) {
        int var1 = 72 % ((-49 - param0) / 56);
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static fc a(int param0, byte[] param1) {
        int var5 = 0;
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = 100;
        int var3 = 100;
        byte[] var4 = new byte[param1.length - -8];
        for (var5 = 0; 6 > var5; var5++) {
            nn.a(-113, var5, var4, ql.a(true, var5, param1));
        }
        nn.a(-99, 6, var4, var2);
        nn.a(-110, 7, var4, var3);
        for (var5 = 6; param1.length / 4 > var5; var5++) {
            nn.a(-109, 2 + var5, var4, ql.a(true, var5, param1));
        }
        int var6 = 52 % ((-44 - param0) / 34);
        return jg.a(30270, var4);
    }

    final static void a(boolean param0) {
        oo.f(0, 84, 640, 335, 0, 128);
        cc.field_c.a(0, 84);
        if (param0) {
            nn.b(126);
        }
    }

    final static java.awt.Container a(int param0) {
        if (null != cg.field_m) {
            return (java.awt.Container) (Object) cg.field_m;
        }
        if (param0 < 21) {
            nn.b(-111);
            return (java.awt.Container) (Object) jl.b(0);
        }
        return (java.awt.Container) (Object) jl.b(0);
    }

    final static void a(int param0, int param1, byte[] param2, int param3) {
        if (param0 >= -92) {
          field_c = null;
          param2[param1 * 4] = (byte)(param3 >>> 840221592);
          param2[1 + param1 * 4] = (byte)(param3 >>> 871084176);
          param2[2 + 4 * param1] = (byte)(param3 >>> -2145686328);
          param2[3 + param1 * 4] = (byte)param3;
          return;
        } else {
          param2[param1 * 4] = (byte)(param3 >>> 840221592);
          param2[1 + param1 * 4] = (byte)(param3 >>> 871084176);
          param2[2 + 4 * param1] = (byte)(param3 >>> -2145686328);
          param2[3 + param1 * 4] = (byte)param3;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[128];
        field_a = "Invite";
    }
}
