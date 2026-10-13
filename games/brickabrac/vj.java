/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static n field_e;
    oa field_d;
    static int field_c;
    static jp field_b;
    static mh[] field_a;
    static int[] field_f;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param2 >= 75) {
          var6 = 24;
          var7 = 5;
          this.field_d.a(var7, param1, param0, var6, param4, param3, 75);
          sj.field_d.a(np.field_a, 0, 0, rg.field_c.field_Ib, (byte) 64);
          gk.field_c.a(18, 2 + np.field_a, 0, -82 + (rg.field_c.field_Ib - ec.field_J - 2), (byte) 64);
          GameplayScreen.field_u.a(18, 2 + np.field_a, -2 + (-ec.field_J + (rg.field_c.field_Ib - 80)), 82 + ec.field_J, (byte) 64);
          GameScreen.field_f.a(true, 2, rg.field_c.field_Ib, 0, 20 + (np.field_a + 2), ec.field_J, 20, -2 + (-np.field_a + rg.field_c.field_cb) - 20);
          f.field_c.a(20, -779, ec.field_J, 2);
          return;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
          field_f = null;
          field_a = null;
          field_b = null;
          return;
        }
        vm var2 = (vm) null;
        vj.a(true, 99, (byte) -104, (vm) null);
        field_f = null;
        field_a = null;
        field_b = null;
    }

    final static void a(boolean param0, int param1, byte param2, vm param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        Throwable var6 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var4_int = -2 / ((41 - param2) / 40);
          if (null != dc.field_e) {
            ul.a(1048576, param3, param1, param0, -104);
          }
          if (null == m.field_f) {
            return;
          }
          var5 = eo.field_f;
          synchronized (var5) {
            m.field_f.e(param1, -1, 16);
            if (param3 == fo.field_a) {
              return;
            }
            m.field_f.f(-24774);
            eo.field_f.b();
            fo.field_a = param3;
            if (null != fo.field_a) {
              m.field_f.a(fo.field_a, 127, param0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("vj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    vj(String param0, mh param1) {
        String[] var3 = null;
        mh[] var4 = null;
        try {
          var3 = new String[]{param0, e.field_j, pl.field_e};
          var4 = new mh[]{param1, rg.field_c, (mh) ((Object) f.field_c)};
          this.field_d = new oa(0L, eh.field_n, var3, hd.field_c, var4, 0);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "vj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new n();
        field_f = new int[]{14, 14, 14, 14, 14, 14, 14};
    }
}
