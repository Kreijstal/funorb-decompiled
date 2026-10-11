/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    static boolean field_e;
    static String field_a;
    static String field_b;
    static ab field_c;
    static String field_d;

    final static void b(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          var1_int = da.field_g[0];
          for (var2 = 1; var2 < da.field_g.length; var2++) {
            var3 = da.field_g[var2];
            ek.a(bf.field_m, var2 << 4, bf.field_m, var1_int, var3);
            var1_int = var1_int + var3;
          }
          if (param0 != -80) {
            fh.a(-100);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "fh.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = Virogrid.field_F ? 1 : 0;
        if (kf.field_e < 0) {
          return;
        }
        var3 = -135 + param2;
        var4 = param0 - 35;
        var5 = 256;
        if (kf.field_e < 75) {
          var5 = (kf.field_e << 8) / 75;
        }
        if (kf.field_e > 200) {
          var5 = (250 - kf.field_e << 8) / 50;
        }
        kb.a(ag.field_g, 16865);
        fk.a();
        df.c();
        cm.a(11);
        if (var5 < 256) {
          df.b(0, 0, df.field_e, df.field_f, 0, 256 - var5);
        }
        ai.a(true);
        if (kf.field_e < 150) {
          ag.field_g.e(var3, var4);
        } else {
          nd.field_d.a(15 + var3, var4 + 10, var5);
        }
        var6 = kf.field_e - 125;
        if (var6 > 0 &&
          var6 < 50) {
          if (20 > var6) {
            var7 = 256 * var6 / 20;
            cc.field_u.e(var3, var4, var7);
          } else {
            if (var6 >= 30) {
              var7 = 256 * (50 - var6) / 20;
              cc.field_u.e(var3, var4, var7);
            } else {
              cc.field_u.e(var3, var4, 256);
            }
          }
        }
        var6Lifetime1 = kf.field_e - 140;
        if (var6Lifetime1 > param1) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = 256 * var6Lifetime1 / 20;
          }
          dn.field_c.a(var3 + 15, var4 + 10, var5 * var7Lifetime1 >> 8);
        }
        return;
    }

    final static void a(byte param0) {
        ao.field_Hb = 52.5f;
        mj.field_D = 262144;
        sg.field_i = 128.0f;
        sj.field_o = 3.1415927410125732f;
        co.field_h = 0;
        lj.field_r = 128.0f;
        cf.field_c = 3.1415927410125732f;
        we.field_k = 50.0f;
        ad.field_g[2] = 0.0;
        ad.field_g[0] = 1.0;
        id.field_r = 0;
        jk.field_c = 2;
        lj.field_r = 80.0f;
        em.field_c = 80.0f;
        if (param0 > -83) {
          field_e = true;
        }
        vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
        vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
        gb.c((byte) -44);
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != 10061) {
          field_e = true;
        }
        field_b = null;
    }

    static {
        field_a = "You have the most pieces";
        field_b = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_d = "Options";
    }
}
