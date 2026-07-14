/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ek {
    static String[] field_b;
    static boolean field_c;
    static String[][] field_a;

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != 19) {
            ek.a((byte) 93);
        }
    }

    final int a(long param0, int param1) {
        long var4 = 0L;
        if (param1 > -57) {
          return 68;
        } else {
          L0: {
            var4 = ((ek) this).a(0);
            if (0L < var4) {
              gf.a(var4, -10309);
              break L0;
            } else {
              break L0;
            }
          }
          return ((ek) this).a(-1374, param0);
        }
    }

    abstract void a(boolean param0);

    final static ln[] a(int param0, bj param1, int param2, int param3) {
        if (param2 == 20839) {
          if (!cn.a(param3, param2 ^ 20581, param0, param1)) {
            return null;
          } else {
            return aa.a(-113);
          }
        } else {
          ek.a((byte) -67);
          if (!cn.a(param3, param2 ^ 20581, param0, param1)) {
            return null;
          } else {
            return aa.a(-113);
          }
        }
    }

    abstract int a(int param0, long param1);

    final static boolean a(int param0, String param1) {
        Object var3 = null;
        if (param1 != null) {
          if (param1.length() >= nn.field_k) {
            if (param1.length() > ah.field_h) {
              return true;
            } else {
              if (param0 >= -56) {
                var3 = null;
                ln[] discarded$2 = ek.a(107, (bj) null, -97, 126);
                return false;
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    abstract long a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[][]{new String[1]};
    }
}
