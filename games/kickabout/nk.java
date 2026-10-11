/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends dg {
    static int field_h;
    static String field_g;

    final static boolean b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = nr.field_q;
        synchronized (var1) {
          if (param0 != -59) {
            nk.a(114);
          }
          if (vb.field_b == wl.field_n) {
            return false;
          }
          cc.field_e = bt.field_a[wl.field_n];
          il.field_c = up.field_a[wl.field_n];
          wl.field_n = 127 & 1 + wl.field_n;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final static he a(int param0, long param1) {
        if (param0 != 31253) {
          return (he) null;
        }
        return (he) (pu.field_Eb.a(param0 - 34864, param1));
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = Kickabout.field_G;
        int var7Lifetime1;
        eo.a(mk.field_a, param0, param2, param3, param1, 256, mk.field_a.field_v - param1);
        int[] var11 = new int[4];
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var6 = var9;
        on.a(var11);
        if (param4 != 3) {
          nk.$cfr$intArgs$b$c4997cb15529(94);
        } else {
          on.e(param0, param2, param3 + param0, param2 + param1);
          cq.field_j.c(-40 + param0, param2 - 290, 32);
          on.b(var11);
          for (var7 = 0; var7 < 2; var7++) {
            on.e(var7 + param0, var7 + param2, -var7 - var7 + param3, param1 - var7 - var7, 65793);
          }
          return;
        }
        on.e(param0, param2, param3 + param0, param2 + param1);
        cq.field_j.c(-40 + param0, param2 - 290, 32);
        on.b(var11);
        for (var7Lifetime1 = 0; var7Lifetime1 < 2; var7Lifetime1++) {
          on.e(var7Lifetime1 + param0, var7Lifetime1 + param2, -var7Lifetime1 - var7Lifetime1 + param3, param1 - var7Lifetime1 - var7Lifetime1, 65793);
        }
    }

    nk() {
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -15207) {
          nk.$cfr$intArgs$b$c4997cb15529(110);
        }
    }

    final static void c(byte param0) {
        int var1_int = 0;
        hn var2 = null;
        int var3 = Kickabout.field_G;
        if (la.a(param0 + 156)) {
          wk.a(50);
          return;
        }
        if (param0 != -56) {
          return;
        }
        try {
          or.field_d.b(81, (byte) 99);
          or.field_d.field_n = or.field_d.field_n + 2;
          var1_int = or.field_d.field_n;
          or.field_d.a(109, da.field_h.a(false));
          var2 = (hn) (da.field_h.g(param0 + 24065));
          while (var2 != null) {
            var2.a(1, or.field_d);
            var2 = (hn) (da.field_h.c(param0 ^ -23));
          }
          or.field_d.d(or.field_d.field_n - var1_int, param0 + 118);
          da.field_h.b(param0 + 23053);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "nk.F(" + param0 + ')');
        }
    }

    static {
        field_g = "players";
        field_h = 0;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static boolean $cfr$intArgs$b$c4997cb15529(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = nr.field_q;
        synchronized (var1) {
          if (param0 != -59) {
            nk.a(114);
          }
          if (vb.field_b == wl.field_n) {
            return false;
          }
          cc.field_e = bt.field_a[wl.field_n];
          il.field_c = up.field_a[wl.field_n];
          wl.field_n = 127 & 1 + wl.field_n;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }
}
