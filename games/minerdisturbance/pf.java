/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static String[][] field_d;
    static String[] field_f;
    static String[][] field_g;
    static ea[] field_a;
    static oe field_e;
    private boolean field_h;
    static int field_c;
    private String field_b;
    static int field_i;

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        field_f = null;
        if (param0 != -1) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    final boolean b(byte param0) {
        if (param0 <= 26) {
            return true;
        }
        return ((pf) this).field_h;
    }

    final String a(byte param0) {
        int var2 = 16 / ((-65 - param0) / 32);
        return ((pf) this).field_b;
    }

    pf(String param0) {
        this(param0, false);
    }

    final static void a(we param0, String param1, int param2, int param3, mg param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = MinerDisturbance.field_ab;
        var5 = 0;
        var6 = -1;
        var7 = 1;
        if (param3 == -19453) {
          L0: while (true) {
            if (var7 >= param1.length()) {
              return;
            } else {
              L1: {
                var8 = param1.charAt(var7);
                if (var8 == 60) {
                  var6 = param4.field_d[0] + (var5 >> -1070577144) - -param0.a(param1.substring(0, var7));
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (0 != (var6 ^ -1)) {
                  param4.field_d[var7] = var6;
                  break L2;
                } else {
                  L3: {
                    if (32 == var8) {
                      var5 = var5 + param2;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  param4.field_d[var7] = (var5 >> 31909096) + param4.field_d[0] - (-param0.a(param1.substring(0, 1 + var7)) - -param0.a((char) var8));
                  break L2;
                }
              }
              if (var8 == 62) {
                var6 = -1;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        mb.field_b.a(0, param0, -114);
    }

    pf(String param0, boolean param1) {
        ((pf) this).field_b = param0;
        ((pf) this).field_h = param1 ? true : false;
        if (((pf) this).field_b == null) {
            ((pf) this).field_b = "";
        }
        if (((pf) this).field_b.length() == 0) {
            ((pf) this).field_h = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[][]{new String[1]};
        field_g = new String[][]{null, new String[1]};
        field_f = new String[]{"Story", "Controls", "Using Equipment", "Environment", "Advanced Environment", "Super Volcano Environment", "Tips"};
    }
}
