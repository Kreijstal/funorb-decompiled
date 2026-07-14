/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static double[][] field_a;
    static bi field_b;

    public static void b(int param0) {
        field_a = null;
        if (param0 != -1674) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = 0;
        var4 = Torquing.field_u;
        if (param0 == 14837) {
          if (null != jh.field_x) {
            if (null != de.field_d) {
              return;
            } else {
              jh.field_x = new int[256];
              de.field_d = new int[256];
              var1 = 0;
              L0: while (true) {
                if (256 <= var1) {
                  return;
                } else {
                  var2 = 6.283185307179586 * ((double)var1 / 255.0);
                  jh.field_x[var1] = (int)(4096.0 * Math.sin(var2));
                  de.field_d[var1] = (int)(Math.cos(var2) * 4096.0);
                  var1++;
                  continue L0;
                }
              }
            }
          } else {
            jh.field_x = new int[256];
            de.field_d = new int[256];
            var1 = 0;
            L1: while (true) {
              if (256 <= var1) {
                return;
              } else {
                var2 = 6.283185307179586 * ((double)var1 / 255.0);
                jh.field_x[var1] = (int)(4096.0 * Math.sin(var2));
                de.field_d[var1] = (int)(Math.cos(var2) * 4096.0);
                var1++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final static double[] a(int param0, int param1, int param2, double[] param3, int param4, int param5, int param6, int param7, int param8, int param9, byte param10) {
        int var11 = 88 % ((51 - param10) / 58);
        return qa.a(param9 * 100, param0, param1 * 100, 100 * param6, param2 * 100, param5 * 100, (byte) -42, param4, param8, param3, param7 * 100);
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new double[8][3];
    }
}
