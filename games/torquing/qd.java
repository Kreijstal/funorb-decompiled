/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static int field_g;
    static int field_d;
    static k field_f;
    static sm[] field_c;
    static double[] field_h;
    static int[][] field_a;
    static long field_e;
    static String field_i;
    static pi field_b;

    public static void c() {
        field_c = null;
        field_h = null;
        field_a = null;
        field_i = null;
        field_b = null;
        field_f = null;
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (ef.field_b != null) {
            var1 = (Object) (Object) ef.field_b;
            synchronized (var1) {
              L1: {
                ef.field_b = null;
                break L1;
              }
            }
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 == 1) {
            break L2;
          } else {
            qd.b(60);
            break L2;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        var8 = Torquing.field_u;
        try {
          L0: {
            var3_int = 0;
            var4 = a.field_d;
            L1: while (true) {
              if (var3_int >= wh.field_z.length) {
                stackOut_11_0 = -1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                L2: {
                  var5 = mn.field_Z[var3_int];
                  if (var5 >= 0) {
                    var6 = mh.a(true, -90, wh.field_z[var3_int]);
                    var4 = var4 + hn.field_z;
                    var7 = -(var6 >> 1) + vk.field_A;
                    if (l.a((ln.field_D << 1) + kp.field_d, param2, 23273, param1, (aq.field_b << 1) + var6, var7 - aq.field_b, var4)) {
                      stackOut_7_0 = var5;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    } else {
                      var4 = var4 + (kp.field_d + (ln.field_D << 1) + hn.field_z);
                      break L2;
                    }
                  } else {
                    var4 = var4 + bp.field_e;
                    break L2;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var3, "qd.D(" + 16452 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_12_0;
    }

    final static Boolean a() {
        Boolean var1 = jl.field_T;
        jl.field_T = null;
        return var1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new double[3];
        field_i = "Close";
        field_f = new k(15, 0, 1, 0);
    }
}
