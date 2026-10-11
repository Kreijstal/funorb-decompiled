/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pa {
    static gq field_d;
    static int field_b;
    static String field_a;
    static int field_c;
    static sm[] field_e;

    final static hi a(int param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        df var8 = null;
        p var9 = null;
        var7 = Torquing.field_u;
        var8 = kj.field_d;
        var3 = var8.i((byte) -101);
        stackIn_3_0 = ((var3 & 128) != 0);
        fd.field_a = stackIn_3_0;
        n.field_u = var3 & 127;
        hh.field_a = var8.i((byte) -101);
        pm.field_r = var8.b(9);
        if (n.field_u != 2) {
          bg.field_n = 0;
          oh.field_b = 0;
        } else {
          bg.field_n = var8.i(7088);
          oh.field_b = var8.e((byte) 62);
        }
        stackIn_9_0 = (var8.i((byte) -101) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        un.field_c = var8.h((byte) 125);
        if (var4 == 0) {
          dg.field_m = un.field_c;
        } else {
          dg.field_m = var8.h((byte) 119);
        }
        if (n.field_u == 1) {
          var8.i(7088);
          var8.h((byte) 125);
        } else {
          if (n.field_u == 4) {
            var8.i(7088);
            var8.h((byte) 125);
          }
        }
        if (param0 != -11936) {
          field_c = -78;
        }
        if (!param1) {
          np.field_m = Torquing.a(26657, 80, var8);
          md.field_a = null;
          return new hi(param1);
        }
        var5 = var8.i(param0 ^ -13616);
        try {
          var9 = qg.field_C.a(var5, 32767);
          np.field_m = var9.c((byte) -127);
          if (!dg.field_m.equals(re.field_e)) {
            stackIn_25_0 = var9.field_v;
          } else {
            stackIn_25_0 = null;
          }
          md.field_a = stackIn_25_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          nn.a("CC1", (Throwable) ((Object) var6), -9958);
          np.field_m = null;
          md.field_a = null;
          return new hi(param1);
        }
        return new hi(param1);
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        if (param0 >= -48) {
          field_e = (sm[]) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static dn b(int param0, boolean param1) {
        dn var2 = null;
        dn var2Lifetime1;
        if (param0 >= 6) {
          var2 = new dn(true);
          var2.field_g = param1 ? true : false;
          return var2;
        }
        field_a = (String) null;
        var2Lifetime1 = new dn(true);
        var2Lifetime1.field_g = param1 ? true : false;
        return var2Lifetime1;
    }

    static {
        field_d = new gq(0);
        field_a = "Waiting for levels";
    }
}
