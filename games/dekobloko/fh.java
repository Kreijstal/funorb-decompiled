/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    static String field_b;
    static int[] field_a;
    static int field_h;
    static i field_e;
    static int field_f;
    static w field_g;
    static ud field_c;
    static w field_d;

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var6 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int var17 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var17 = client.field_A ? 1 : 0;
        try {
          if (!param2) {
            return;
          }
          var4_int = 320;
          var5 = 490;
          for (var6 = 0; var6 < rb.field_n.length; var6++) {
            var7 = rb.field_n[var6] >> 8 & 255;
            var8 = 255 & rb.field_n[var6] >> 24;
            var9 = (2048 * var7 >> 8) + (bb.field_f * (1 + var8) >> 6);
            var10 = rb.field_n[var6] >> 16 & 255;
            var11 = 255 & rb.field_n[var6];
            var12 = ke.a(2047, var9) >> 6;
            var13 = h.a(var9, (byte) -122) >> 6;
            var14 = ke.a(2047, var11 + var9) >> 6;
            var15 = h.a(var9 + var11, (byte) -122) >> 6;
            var16 = new int[]{var4_int + param3, param0 + var5, var12 + param3, param0 + var13, param3 + var14, var15 + param0};
            if (256 == param1) {
              ok.a(var16, 16777215, var10);
            } else {
              ok.a(var16, 16777215, var10 * 256 >> 9);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var4), "fh.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void b(byte param0) {
        s.g((byte) -115);
        if (param0 > -122) {
          fh.a(-67);
        }
    }

    final static void a(byte param0, cl param1, int param2) {
        uf var3 = null;
        try {
          var3 = we.field_b;
          int var4 = -58 / ((param0 - 59) / 33);
          var3.f(param2, -4);
          var3.a(true, param1.field_q);
          var3.a(true, param1.field_z);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "fh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0) {
        int var1 = 114 % ((param0 - 70) / 46);
        if (sm.field_e == -1) {
          if (!pe.b(25973, 1)) {
            return false;
          }
          sm.field_e = de.field_V.d((byte) -64);
          de.field_V.field_n = 0;
        }
        if (sm.field_e == -2) {
          if (!pe.b(25973, 2)) {
            return false;
          }
          sm.field_e = de.field_V.e(3);
          de.field_V.field_n = 0;
        }
        return pe.b(25973, sm.field_e);
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
        if (param0 != 0) {
          return;
        }
        field_g = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = client.field_A ? 1 : 0;
        try {
          if (!uk.a(-22802)) {
            if (cl.field_v != null &&
              cl.field_v.field_e) {
              sn.a(false);
              u.field_i.a((byte) -105, new ib(u.field_i, kl.field_p));
            }
            return;
          }
          var1_int = -26 % ((param0 - 37) / 58);
          u.field_i.a(jd.field_Yb, true, ab.field_f, 29166);
          u.field_i.g(0);
          while (ab.$cfr$intArgs$c$a284cb190b53(50)) {
            u.field_i.a(wh.field_c, el.field_G, (byte) 121);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "fh.E(" + param0 + ')');
        }
    }

    static {
        field_b = "<%0> WINS!";
        field_e = new i();
    }
}
