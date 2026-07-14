/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class c extends vg implements fo {
    static int[] field_g;
    static java.math.BigInteger field_f;
    static String field_h;

    int a(int param0, byte param1) {
        if (param1 != -39) {
            boolean discarded$0 = ((c) this).h(10);
            return param0;
        }
        return param0;
    }

    abstract boolean h(int param0);

    final static boolean[] a(int param0, boolean[] param1, byte param2, kh param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        var4 = param3.b((byte) 44, param0);
        if (var4 != 0) {
          if (param1 != null) {
            if (var4 == param1.length) {
              var5 = 0;
              var6 = 100 / ((16 - param2) / 40);
              L0: while (true) {
                if (var4 <= var5) {
                  return param1;
                } else {
                  param1[var5] = uha.a(5907, param3);
                  var5++;
                  continue L0;
                }
              }
            } else {
              param1 = new boolean[var4];
              var5 = 0;
              var6 = 100 / ((16 - param2) / 40);
              L1: while (true) {
                if (var4 <= var5) {
                  return param1;
                } else {
                  param1[var5] = uha.a(5907, param3);
                  var5++;
                  continue L1;
                }
              }
            }
          } else {
            param1 = new boolean[var4];
            var5 = 0;
            var6 = 100 / ((16 - param2) / 40);
            L2: while (true) {
              if (var4 <= var5) {
                return param1;
              } else {
                param1[var5] = uha.a(5907, param3);
                var5++;
                continue L2;
              }
            }
          }
        } else {
          return null;
        }
    }

    abstract void a(uw param0, int param1);

    public static void m(int param0) {
        field_g = null;
        field_f = null;
        if (param0 <= 54) {
            return;
        }
        field_h = null;
    }

    abstract void a(int param0, byte param1, int param2, int param3);

    abstract void a(la param0, int param1);

    abstract void a(int param0, boolean param1);

    c() {
    }

    abstract c d(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[1024];
        field_h = "Login: ";
        field_f = new java.math.BigInteger("65537");
    }
}
