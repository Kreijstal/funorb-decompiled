/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static tg field_e;
    static long field_b;
    static int field_c;
    static String field_f;
    static String field_a;
    static long[] field_d;

    public static void a(int param0) {
        field_d = null;
        if (param0 != 3) {
            Object var2 = null;
            l.a(-34, (bl) null);
        }
        field_e = null;
        field_f = null;
        field_a = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var3 = -30 % ((-40 - param2) / 41);
        Object var4 = null;
        rk.a(4, (String) null, param1, param0);
    }

    final static void a(int param0, bl param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var5 = Bounce.field_N;
        var2 = 0;
        L0: while (true) {
          if (3 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= oh.field_c) {
                var3 = 98 / ((param0 - 45) / 34);
                ef.field_i[param1.a((byte) -94)] = ef.field_i[param1.a((byte) -94)] + 1;
                var2 = 0;
                var6 = 0;
                var3 = var6;
                L2: while (true) {
                  if (var6 >= oh.field_c) {
                    oh.field_c = var2;
                    oh.field_c = oh.field_c + 1;
                    sh.field_cb[oh.field_c] = param1;
                    return;
                  } else {
                    L3: {
                      if (param1.field_h == sh.field_cb[var6].field_h) {
                        var4 = sh.field_cb[var6].a((byte) 113);
                        if (ef.field_i[var4] <= wk.field_G) {
                          break L3;
                        } else {
                          ef.field_i[var4] = ef.field_i[var4] - 1;
                          var6++;
                          continue L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var2++;
                    sh.field_cb[var2] = sh.field_cb[var6];
                    var6++;
                    continue L2;
                  }
                }
              } else {
                if (param1.field_h == sh.field_cb[var2].field_h) {
                  ef.field_i[sh.field_cb[var2].a((byte) 78)] = ef.field_i[sh.field_cb[var2].a((byte) 78)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            ef.field_i[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(int param0, byte param1, int param2) {
        if (param1 < 126) {
            field_d = null;
        }
        bi.field_h = param2;
        uf.field_a = param0;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        eb.a((java.awt.Component) (Object) param1, (byte) -105);
        fb.a((java.awt.Component) (Object) param1, (byte) -42);
        if (!(null == hg.field_k)) {
            hg.field_k.a((java.awt.Component) (Object) param1, false);
        }
        if (param0 != 0) {
            Object var3 = null;
            l.a(-60, (java.awt.Canvas) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -132108;
        field_a = "Confirm Email:";
        field_f = "Return to game";
        field_d = new long[32];
    }
}
