/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static dd field_b;
    static int[] field_a;
    static hj field_d;
    static String[][] field_c;
    static boolean field_e;

    final static int[] a(int param0) {
        if (param0 == -31121) {
          return new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        }
        return (int[]) null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        int var1 = 34 % ((param0 + 21) / 40);
        field_d = null;
        field_c = (String[][]) null;
    }

    final static void a(boolean param0) {
        if (!param0) {
          mj.a(-35);
          ld.a((byte) -120);
          ia.h(-13953);
          return;
        }
        ld.a((byte) -120);
        ia.h(-13953);
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        im var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Pool.field_O;
        try {
          kh.field_Ac = false;
          tp.field_e = null;
          em.field_L = null;
          if (param0 != 0) {
            mj.a(99, 12);
          }
          if (null != ma.field_i) {
            ma.field_i.d((byte) 49);
            ma.field_i = null;
          }
          ln.field_n = null;
          if (ep.field_A != null) {
            ep.field_A.d((byte) 117);
            ep.field_A = null;
          }
          lf.field_a = null;
          if (ck.field_W != null) {
            ck.field_W.d((byte) 78);
            ck.field_W = null;
          }
          im.field_Qb = null;
          if (ln.field_n == null) {
            return;
          }
          var3 = (im) (ln.field_n.a((byte) -127));
          while (var3 != null) {
            var3.a(false);
            var3 = (im) (ln.field_n.b(param0 ^ 29));
          }
          ln.field_n = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "mj.D(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        oq var2 = ej.field_j;
        if (param1 == 27712) {
          var2.b(false, param0);
          var2.a(2, false);
          var2.a(4, false);
          var2.a(rk.b(true), false);
          return;
        }
        mj.a(true);
        var2.b(false, param0);
        var2.a(2, false);
        var2.a(4, false);
        var2.a(rk.b(true), false);
    }

    static {
        field_d = new hj(10, 2, 2, 0);
    }
}
