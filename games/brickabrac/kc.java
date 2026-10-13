/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends IntrusiveNode {
    static String field_i;
    private int field_l;
    private int field_k;
    static jp field_r;
    static jp field_p;
    static nb field_q;
    static mf field_j;
    static mh field_n;
    private int field_m;
    static String field_o;

    public static void a(int param0) {
        field_n = null;
        field_o = null;
        field_p = null;
        int var1 = 82 % ((param0 - 35) / 55);
        field_r = null;
        field_i = null;
        field_j = null;
        field_q = null;
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = 0;
        if (param0 >= 47) {
          fieldTemp$0 = this.field_k + 1;
          this.field_k = this.field_k + 1;
          return fieldTemp$0 < 40 ? true : false;
        }
        field_o = (String) null;
        int fieldTemp$1 = this.field_k + 1;
        this.field_k = this.field_k + 1;
        return fieldTemp$1 < 40 ? true : false;
    }

    final static void a(mf param0, ra param1, int param2, int param3) {
        try {
          rn.field_i = wn.a((byte) -98) * param2 / 1000;
          if (param3 < 91) {
            ra var5 = (ra) null;
            kc.a((mf) null, (ra) null, -127, -72);
          }
          ck.a(-2196, param0);
          bm.a((byte) -70, param0);
          e.a(param0, 115);
          ScorePopup.a(-37);
          fl.e(-41);
          ld.field_t = -rn.field_i + 0;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "kc.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        int var5 = (int)((Math.exp((double)((float)(-this.field_k) / 20.0f)) - Math.exp(-2.0)) * 200.0);
        int var6 = this.a((byte) 116);
        al.a(param2 + (this.field_l >> 8) / param0, var6 / (param0 << 1), (-this.field_k + 40 << 8) / 40, var5, -94, var6 / param0, (this.field_m >> 8) / param0 + param1);
        if (param3) {
          return;
        }
        this.c((byte) -61);
    }

    final static jp[] a(int param0, boolean param1) {
        jp[] var3 = new jp[9];
        jp[] var2 = var3;
        if (!param1) {
          var3[4] = hd.a(param0, 64, (byte) -6);
          return var2;
        }
        kc.$cfr$intArgs$a$a948187ac0af(-5, false);
        var3[4] = hd.a(param0, 64, (byte) -6);
        return var2;
    }

    private final int a(byte param0) {
        int var2 = -80 / ((param0 - 72) / 33);
        return this.field_k * (-this.field_k + 100) / 20 - 5;
    }

    final static gb a(byte param0, boolean param1) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        pi var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        pi var8 = null;
        wd var9 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        var8 = jl.field_e;
        var2 = var8;
        var3 = var8.l(param0 + 188);
        gj.field_a = 127 & var3;
        if (param0 != 67) {
          kc.a(73, true);
        }
        stackIn_5_0 = ((var3 & 128) != 0);
        ji.field_f = stackIn_5_0;
        nh.field_b = var8.l(255);
        an.field_k = var8.g(-32768);
        if (gj.field_a == 2) {
          gb.field_h = var8.i(65280);
          vq.field_H = var8.e((byte) -34);
        } else {
          gb.field_h = 0;
          vq.field_H = 0;
        }
        stackIn_11_0 = (var8.l(255) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        dp.field_t = var8.d(-1);
        if (var4 != 0) {
          nd.field_g = var8.d(-1);
        } else {
          nd.field_g = dp.field_t;
        }
        if (1 != gj.field_a &&
          4 != gj.field_a) {
          ka.field_E = 0;
          sl.field_y = null;
        } else {
          ka.field_E = var8.i(param0 ^ 65347);
          sl.field_y = var8.d(-1);
        }
        if (!param1) {
          gd.field_d = bj.a(80, (byte) 76, var8);
          rn.field_m = null;
          return new gb(param1);
        }
        var5 = var8.i(65280);
        try {
          var9 = nh.field_c.a(var5, true);
          gd.field_d = var9.h(-3);
          if (nd.field_g.equals(tb.field_cb)) {
            stackIn_24_0 = null;
          } else {
            stackIn_24_0 = var9.field_u;
          }
          rn.field_m = stackIn_24_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          rk.a("CC1", (Throwable) ((Object) var6), param0 ^ 16);
          rn.field_m = null;
          gd.field_d = null;
          return new gb(param1);
        }
        return new gb(param1);
    }

    kc(int param0, int param1) {
        this.field_m = param0;
        this.field_l = param1;
    }

    static {
        field_i = "Waiting for music";
        field_o = "Average rating";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static gb $cfr$intArgs$a$a948187ac0af(int param0, boolean param1) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        pi var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        pi var8 = null;
        wd var9 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        var8 = jl.field_e;
        var2 = var8;
        var3 = var8.l(param0 + 188);
        gj.field_a = 127 & var3;
        if (param0 != 67) {
          kc.a(73, true);
        }
        stackIn_5_0 = ((var3 & 128) != 0);
        ji.field_f = stackIn_5_0;
        nh.field_b = var8.l(255);
        an.field_k = var8.g(-32768);
        if (gj.field_a == 2) {
          gb.field_h = var8.i(65280);
          vq.field_H = var8.e((byte) -34);
        } else {
          gb.field_h = 0;
          vq.field_H = 0;
        }
        stackIn_11_0 = (var8.l(255) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        dp.field_t = var8.d(-1);
        if (var4 != 0) {
          nd.field_g = var8.d(-1);
        } else {
          nd.field_g = dp.field_t;
        }
        if (1 != gj.field_a &&
          4 != gj.field_a) {
          ka.field_E = 0;
          sl.field_y = null;
        } else {
          ka.field_E = var8.i(param0 ^ 65347);
          sl.field_y = var8.d(-1);
        }
        if (!param1) {
          gd.field_d = bj.a(80, (byte) 76, var8);
          rn.field_m = null;
          return new gb(param1);
        }
        var5 = var8.i(65280);
        try {
          var9 = nh.field_c.a(var5, true);
          gd.field_d = var9.h(-3);
          if (nd.field_g.equals(tb.field_cb)) {
            stackIn_24_0 = null;
          } else {
            stackIn_24_0 = var9.field_u;
          }
          rn.field_m = stackIn_24_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          rk.a("CC1", (Throwable) ((Object) var6), param0 ^ 16);
          rn.field_m = null;
          gd.field_d = null;
          return new gb(param1);
        }
        return new gb(param1);
    }
}
