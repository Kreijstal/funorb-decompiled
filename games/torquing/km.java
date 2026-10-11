/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    static String field_a;

    final static void a(int param0) {
        ff.field_a = false;
        if (param0 > 28) {
          aq.field_c = false;
          od.b(128, -1);
          kh.field_o = tp.field_h;
          bh.field_a = tp.field_h;
          return;
        }
        field_a = (String) null;
        aq.field_c = false;
        od.b(128, -1);
        kh.field_o = tp.field_h;
        bh.field_a = tp.field_h;
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        qk var5 = null;
        h var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Torquing.field_u;
        try {
          var5 = (qk) (kc.field_z.b(0));
          while (var5 != null) {
            ii.a(32, param1, var5);
            var5 = (qk) (kc.field_z.f(-24059));
          }
          var3 = -31 % ((-90 - param0) / 35);
          var6 = (h) (to.field_s.b(0));
          while (var6 != null) {
            va.a(var6, (byte) 125, param1);
            var6 = (h) (to.field_s.f(-24059));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "km.A(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized static long b(int param0) {
        long var1 = System.currentTimeMillis();
        if (var1 < j.field_p) {
          la.field_g = la.field_g + (-var1 + j.field_p);
          if (param0 == -1) {
            j.field_p = var1;
            return var1 + la.field_g;
          }
          return -53L;
        }
        if (param0 == -1) {
          j.field_p = var1;
          return var1 + la.field_g;
        }
        return -53L;
    }

    public static void a(byte param0) {
        int var1 = 104 % ((param0 + 46) / 40);
        field_a = null;
    }

    static {
        field_a = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
