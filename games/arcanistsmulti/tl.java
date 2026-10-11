/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tl {
    static String field_c;
    static String field_e;
    static qb[] field_a;
    static boolean field_d;
    static String field_g;
    static lc[] field_f;
    static String field_b;

    public static void a(byte param0) {
        field_c = null;
        if (param0 < -17) {
          field_a = null;
          field_b = null;
          field_e = null;
          field_g = null;
          field_f = null;
          return;
        }
        field_e = (String) null;
        field_a = null;
        field_b = null;
        field_e = null;
        field_g = null;
        field_f = null;
    }

    final static void e(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 >= -52) {
            tl.c((byte) -27);
          }
          var5 = kl.field_B;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "tl.E(" + param0 + ')');
        }
    }

    final static int c(byte param0) {
        if (ih.field_f < 2) {
          return 0;
        }
        if (param0 != -77) {
          tl.e((byte) -108);
        }
        if (gm.field_f == 0) {
          if (!da.field_b.c(-10923)) {
            return 20;
          }
          if (!da.field_b.a("commonui", -24417)) {
            return 40;
          }
          if (!ea.field_C.c(-10923)) {
            return 50;
          }
          if (!ea.field_C.a("commonui", -24417)) {
            return 60;
          }
          if (!ho.field_g.c(-10923)) {
            return 70;
          }
          if (ho.field_g.a(-86)) {
            return 100;
          }
          return 80;
        }
        if (null != lh.field_g) {
          if (!lh.field_g.c(-10923)) {
            return 14;
          }
          if (!lh.field_g.a(true, "")) {
            return 29;
          }
          if (!lh.field_g.a("", -24417)) {
            return 29;
          }
        }
        if (!da.field_b.c(param0 ^ 10982)) {
          return 43;
        }
        if (!da.field_b.a("commonui", -24417)) {
          return 57;
        }
        if (!ea.field_C.c(-10923)) {
          return 71;
        }
        if (!ea.field_C.a("commonui", param0 ^ 24364)) {
          return 80;
        }
        if (!ho.field_g.c(-10923)) {
          return 82;
        }
        if (!ho.field_g.a(param0 ^ 35)) {
          return 86;
        }
        return 100;
    }

    final static String b(byte param0) {
        if (param0 < 95) {
          tl.a((byte) 55);
          return vi.field_F;
        }
        return vi.field_F;
    }

    abstract int a(int param0, byte param1);

    abstract jk d(byte param0);

    abstract byte[] a(int param0, boolean param1);

    final static void a(int param0) {
        if (ob.field_Y != null) {
          ob.field_Y.field_l = false;
          li.a(0, param0 + 30267);
          if (param0 != -30267) {
            field_e = (String) null;
            return;
          }
          return;
        }
        li.a(0, param0 + 30267);
        if (param0 == -30267) {
          return;
        }
        field_e = (String) null;
    }

    static {
        field_c = "<%0> might change the options - wait and see.";
        field_e = "MOST KILLS - ";
        field_g = "Reading Book of Nature";
        field_d = false;
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_f = new lc[17];
    }
}
