/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static String field_e;
    static int field_f;
    static String field_d;
    static String field_a;
    static ge field_b;
    static String field_g;
    static String field_h;
    static int[] field_c;
    static boolean[] field_j;
    static String[] field_i;

    public static void a(byte param0) {
        field_h = null;
        field_j = null;
        field_d = null;
        field_c = null;
        field_i = null;
        field_b = null;
        field_g = null;
        field_e = null;
        field_a = null;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 != 13776) {
            return 91;
        }
        param1 = param2 - param1;
        return param0 - param0 * (param1 * (param1 * param1)) / param2 / param2 / param2;
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        int[] var1_array = null;
        int[] var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          L0: {
            var16 = mc.field_e.field_U[0];
            var13 = var16;
            var10 = var13;
            var7 = var10;
            var6 = var7;
            var1_array = var6;
            mc.field_e.field_U = new int[5][];
            mc.field_e.field_U[0] = var16;
            var18 = new int[var16.length];
            var15 = var18;
            var12 = var15;
            var9 = var12;
            var2 = var9;
            var17 = new int[var16.length];
            var14 = var17;
            var11 = var14;
            var8 = var11;
            var3 = var8;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var16.length) {
                fd.a(var18, var17, (byte) -54);
                mc.field_e.field_U[2] = dn.a(var3, (byte) 36, ta.a(new int[4], 28));
                mc.field_e.field_U[1] = dn.a(var3, (byte) 94, ta.a(new int[4], 3));
                mc.field_e.field_U[4] = dn.a(var3, (byte) 53, ta.a(new int[4], -120));
                mc.field_e.field_U[3] = dn.a(var3, (byte) 45, ta.a(new int[4], -128));
                break L0;
              } else {
                var17[var4] = var4;
                var2[var4] = var16[var4];
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "bc.A(" + 17 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Unable to connect to the data server. Please check any firewall you are using.";
        field_f = 48;
        field_a = "Time trial completed!";
        field_d = "End tutorial";
        field_b = new ge(256);
        field_g = "Not yet achieved";
        field_i = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_h = ", <%0>";
    }
}
