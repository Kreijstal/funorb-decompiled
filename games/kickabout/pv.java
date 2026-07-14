/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pv extends i {
    private int field_K;
    static int[] field_F;
    static nm[][] field_I;
    static String field_G;
    static int[] field_J;
    static int field_H;

    public static void g(byte param0) {
        field_F = null;
        field_G = null;
        field_J = null;
        if (param0 >= -92) {
          field_I = null;
          field_I = null;
          return;
        } else {
          field_I = null;
          return;
        }
    }

    final void a(int param0, int param1) {
        boolean[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        boolean[] var7 = null;
        var6 = Kickabout.field_G;
        super.a(84, param1);
        if (!la.a(100)) {
          var7 = tu.field_E.field_J;
          var3 = var7;
          if (param0 >= 60) {
            if (var7[((pv) this).field_K]) {
              return;
            } else {
              L0: {
                var7[((pv) this).field_K] = true;
                if (la.a(100)) {
                  break L0;
                } else {
                  var4 = 0;
                  var5 = 0;
                  L1: while (true) {
                    if (var7.length <= var5) {
                      or.field_d.b(69, (byte) 119);
                      or.field_d.b(-57, var4);
                      break L0;
                    } else {
                      if (var7[var5]) {
                        var4 = var4 | 1 << var5;
                        var5++;
                        var5++;
                        continue L1;
                      } else {
                        var5++;
                        var5++;
                        continue L1;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    pv(int param0) {
        super(param0);
        ((pv) this).field_K = -12 + param0 + 1;
    }

    final int b(int param0) {
        if (param0 != -1379118556) {
            field_F = null;
            return 400;
        }
        return 400;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new int[8192];
        field_J = new int[5];
        field_J[1] = 204800;
        field_J[4] = 655360;
        field_J[0] = 409600;
        field_J[2] = 204800;
        field_J[3] = 180224;
        field_G = "Play the game without logging in just yet";
        field_H = 6;
    }
}
