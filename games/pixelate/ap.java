/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap {
    static int field_a;
    static int field_c;
    static String[][] field_d;
    static String field_g;
    private int[] field_h;
    static String field_b;
    static String field_i;
    static int field_e;
    static int field_f;

    final static void a(String param0, int param1, int param2, int param3, String param4) {
        if (param3 != 24092) {
          return;
        } else {
          nf.field_d.field_qb = param0;
          nf.field_d.field_K = nf.field_d.field_K + rh.field_y.field_K;
          nf.field_d.field_cb = param4;
          nf.field_d.field_N = param2;
          rh.field_y.field_D = rh.field_y.field_D + rh.field_y.field_K;
          rh.field_y.field_K = param1;
          nf.field_d.field_K = nf.field_d.field_K - rh.field_y.field_K;
          rh.field_y.field_D = rh.field_y.field_D - rh.field_y.field_K;
          return;
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        var3 = -1 + (((ap) this).field_h.length >> 999862689);
        var4 = param0 & var3;
        if (param1 == -67) {
          L0: while (true) {
            var5 = ((ap) this).field_h[var4 + var4 - -1];
            if (0 != (var5 ^ -1)) {
              if (((ap) this).field_h[var4 - -var4] != param0) {
                var4 = 1 + var4 & var3;
                continue L0;
              } else {
                return var5;
              }
            } else {
              return -1;
            }
          }
        } else {
          return 123;
        }
    }

    final static tf[] a(int param0, int param1, int param2, int param3, int param4) {
        tf[] var5 = null;
        tf[] var6 = null;
        var6 = new tf[9];
        var5 = var6;
        tf dupTemp$4 = cl.a(param4, param3, (byte) -108);
        var6[6] = dupTemp$4;
        var5[3] = dupTemp$4;
        var5[2] = dupTemp$4;
        var5[1] = dupTemp$4;
        var5[0] = dupTemp$4;
        tf dupTemp$5 = cl.a(param4, param0, (byte) -116);
        var6[8] = dupTemp$5;
        var5[7] = dupTemp$5;
        var5[param2] = dupTemp$5;
        if (param1 != 0) {
          var6[4] = cl.a(64, param1, (byte) -50);
          return var5;
        } else {
          return var5;
        }
    }

    ap(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = 1;
        L0: while (true) {
          if (param0.length - -(param0.length >> 194923649) < var2) {
            ((ap) this).field_h = new int[var2 + var2];
            var3 = 0;
            L1: while (true) {
              if (var2 - -var2 <= var3) {
                var3 = 0;
                L2: while (true) {
                  if (param0.length > var3) {
                    var4 = -1 + var2 & param0[var3];
                    L3: while (true) {
                      if ((((ap) this).field_h[1 + (var4 + var4)] ^ -1) == 0) {
                        ((ap) this).field_h[var4 + var4] = param0[var3];
                        ((ap) this).field_h[var4 + var4 - -1] = var3;
                        var3++;
                        continue L2;
                      } else {
                        var4 = var2 - 1 & var4 - -1;
                        continue L3;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                ((ap) this).field_h[var3] = -1;
                var3++;
                continue L1;
              }
            }
          } else {
            var2 = var2 << 1;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 11924) {
            return;
        }
        field_d = null;
        field_i = null;
        field_g = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 70;
        field_a = field_c << -843215614;
        field_d = new String[][]{new String[3], new String[3]};
        field_g = "Concluded";
        field_e = 65;
        field_b = "Show lobby chat from my friends";
        field_i = "Solicitation";
    }
}
