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
        return new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    public static void a() {
        field_b = null;
        field_a = null;
        int var1 = 0;
        field_d = null;
        field_c = null;
    }

    final static void a(boolean param0) {
        int discarded$0 = -120;
        ld.a();
        int discarded$1 = -13953;
        ia.h();
    }

    final static void b() {
        RuntimeException var1 = null;
        int var2 = 0;
        im var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Pool.field_O;
        try {
          L0: {
            L1: {
              kh.field_Ac = false;
              tp.field_e = null;
              em.field_L = null;
              if (null == ma.field_i) {
                break L1;
              } else {
                ma.field_i.d((byte) 49);
                ma.field_i = null;
                break L1;
              }
            }
            L2: {
              ln.field_n = null;
              if (ep.field_A != null) {
                ep.field_A.d((byte) 117);
                ep.field_A = null;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              lf.field_a = null;
              if (ck.field_W == null) {
                break L3;
              } else {
                ck.field_W.d((byte) 78);
                ck.field_W = null;
                break L3;
              }
            }
            im.field_Qb = null;
            if (ln.field_n != null) {
              var3 = (im) (Object) ln.field_n.a((byte) -127);
              L4: while (true) {
                if (var3 == null) {
                  ln.field_n = null;
                  break L0;
                } else {
                  var3.a(false);
                  var3 = (im) (Object) ln.field_n.b(29);
                  continue L4;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "mj.D(" + 0 + 41);
        }
    }

    final static void a(int param0, int param1) {
        oq var2 = ej.field_j;
        var2.b(false, param0);
        var2.a(2, false);
        var2.a(4, false);
        var2.a(rk.b(true), false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new hj(10, 2, 2, 0);
    }
}
