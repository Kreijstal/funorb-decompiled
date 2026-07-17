/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class md {
    static boolean field_d;
    static int[][] field_a;
    static kl field_c;
    static int[] field_e;
    static kl field_b;

    final int a(long param0, int param1) {
        long var4 = 0L;
        if (param1 != 0) {
          return -118;
        } else {
          L0: {
            var4 = ((md) this).b((byte) 66);
            if (var4 > 0L) {
              tg.a(var4, false);
              break L0;
            } else {
              break L0;
            }
          }
          return ((md) this).a(param0, true);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static db c(byte param0) {
        db var1 = new db(hk.field_bb, eg.field_v, ph.field_q[0], ne.field_h[0], cg.field_k[0], tf.field_b[0], mf.field_j[0], ic.field_b);
        eb.a(0);
        return var1;
    }

    abstract int a(long param0, boolean param1);

    abstract void a(int param0);

    final static String a(String param0, String param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = wizardrun.field_H;
        var4 = param1.indexOf(param0);
        L0: while (true) {
          if (var4 == -1) {
            if (param2 != 28834) {
              field_b = null;
              return param1;
            } else {
              return param1;
            }
          } else {
            param1 = param1.substring(0, var4) + param3 + param1.substring(param0.length() + var4);
            var4 = param1.indexOf(param0, param3.length() + var4);
            continue L0;
          }
        }
    }

    abstract long b(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_e = new int[]{5, 1, 1, 3, 5, 1, 2, 2, 3, 5, 10, 2};
    }
}
