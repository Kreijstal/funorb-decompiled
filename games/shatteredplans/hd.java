/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends oh {
    bi field_o;
    int field_h;
    static oa field_s;
    bi field_i;
    static qr field_m;
    static byte[][] field_q;
    static String field_p;
    static String field_j;
    static ro field_r;
    static ul field_t;
    static uh field_n;
    static long field_k;
    static int[] field_l;

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        nd[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        nd[] var7 = null;
        int var8 = 0;
        nd var9 = null;
        nd var10 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        nd[] var3Lifetime1;
        int var1_intLifetime1;
        int var1_intLifetime2;
        int var4Lifetime1;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          gf.b();
          var2 = 300 - di.field_m;
          var1_int = -25 + var2 / 8;
          db.field_a.b(var1_int, 0, 33023);
          var1_intLifetime1 = var2 / 6 - 100;
          w.field_D.b(var1_intLifetime1, 0, 4227327);
          oi.field_d.a(var1_intLifetime1, 0, dp.field_r / 8);
          var7 = fe.field_y;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var9 = var7[var4];
            if (var9.field_a != 0) {
              gf.b(var1_intLifetime1 + var9.field_e << 4, var9.field_j << 4, var9.field_f, var9.field_a, fe.field_u);
            }
          }
          var1_intLifetime2 = -250 + var2 / 4;
          vm.field_Jb.b(var1_intLifetime2, 120, 8421631);
          tp.field_e.a(var1_intLifetime2, param0, dp.field_r / 4);
          sr.field_F.a(var1_intLifetime2, 120, dp.field_r);
          var3Lifetime1 = fe.field_H;
          var8 = 0;
          var4Lifetime1 = var8;
          while (var3Lifetime1.length > var8) {
            var10 = var3Lifetime1[var8];
            if (0 != var10.field_a) {
              gf.b(var10.field_e + var1_intLifetime2 << 4, var10.field_j + 120 << 4, var10.field_f, var10.field_a, fe.field_u);
            }
            var8++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "hd.A(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_j = null;
        field_r = null;
        field_m = null;
        field_q = (byte[][]) null;
        field_l = null;
        if (param0 > -49) {
          field_r = (ro) null;
        }
        field_s = null;
        field_t = null;
        field_n = null;
    }

    hd(String param0, nq param1, int param2) {
        int var7 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          var4_int = param1.c(param0);
          var5 = param1.field_J + param1.field_q;
          stackIn_4_0 = (500 >= var4_int) ? 0 : 1;
          var6 = stackIn_4_0;
          if (var6 != 0) {
            var4_int = 600;
          }
          this.field_i = new bi(var4_int, var5);
          this.field_o = new bi(var4_int + 6, 6 + var5);
          ra.a(-127);
          this.field_i.e();
          if (var6 == 0) {
            param1.d(param0, 0, param1.field_J, 16777215, -1);
          } else {
            param1.b(param0, 0, param1.field_J, 16777215, -1, 600);
          }
          this.field_o.e();
          this.field_i.c(3, 3);
          gf.b(1, 1, 0, 0, 6 + var4_int, var5 + 6);
          for (var7 = (var4_int + 6) * (6 + var5) - 1; var7 >= 0; var7--) {
            if (0 == (128 & gf.field_h[var7])) {
              gf.field_h[var7] = gf.field_h[var7] << 1;
            }
          }
          cg.i(0);
          this.field_h = -param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("hd.<init>(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final static ld a(int param0, int param1) {
        if (param1 < 102) {
          field_k = -43L;
        }
        ld var2 = new ld();
        ua.field_d.a((byte) -113, var2);
        cp.a(param0, 1);
        return var2;
    }

    final static void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var1_int = ln.field_H.length;
        kb.field_A = 0;
        if (param0) {
          return;
        }
        try {
          cb.field_i = new int[var1_int];
          for (var2 = 0; var1_int > var2; var2++) {
            var3 = aa.a(var2, (byte) -71);
            if (var2 != -1 + var1_int) {
              var3 += 50;
            }
            cb.field_i[var2] = var3;
            kb.field_A = kb.field_A + var3;
          }
          kb.field_A = kb.field_A - 294;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "hd.B(" + param0 + ')');
        }
    }

    static {
        field_p = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_j = "Click to build fleets in this territory.";
        field_s = new oa();
        field_r = new ro();
        field_l = new int[5];
    }
}
