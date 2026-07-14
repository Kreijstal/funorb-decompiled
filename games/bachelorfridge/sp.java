/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp extends pu {
    static int field_l;

    final static int a(int param0, int param1, byte param2) {
        int var5 = BachelorFridge.field_y;
        int var3 = 1;
        while (1 < param1) {
            if ((1 & param1) != 0) {
                var3 = var3 * param0;
            }
            param1 = param1 >> 1;
            param0 = param0 * param0;
        }
        if (1 == param1) {
            return var3 * param0;
        }
        int var4 = 50 / ((-46 - param2) / 52);
        return var3;
    }

    final static int a(hh param0, boolean param1, hh param2) {
        if (param1) {
            sp.b(-122);
        }
        Object var4 = null;
        return iv.a(-15, 0, 0, param0, (String) null, false, param2);
    }

    final static void b(int param0) {
        if (param0 != 1) {
            field_l = -10;
        }
        if (!(gfa.field_i)) {
            throw new IllegalStateException();
        }
        if (oq.field_b != null) {
            oq.field_b.p(-96);
        }
        String var1 = kaa.c(97);
        ola.field_e = new ph(var1, (String) null, true, false, false);
        gja.field_m.a((wj) (Object) kka.field_l, (byte) 82);
        kka.field_l.e((wj) (Object) ola.field_e, 33);
        kka.field_l.m(param0 ^ 17311);
    }

    final static void a(byte[] param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = BachelorFridge.field_y;
        lka.field_E = qs.a(false, new lu(param0));
        w.field_h = new int[50][13];
        var2 = 1;
        L0: while (true) {
          if (var2 >= lka.field_E.length) {
            L1: {
              if (param1 == -7) {
                break L1;
              } else {
                var5 = null;
                int discarded$1 = sp.a((hh) null, false, (hh) null);
                break L1;
              }
            }
            return;
          } else {
            var3 = 2;
            L2: while (true) {
              if (15 <= var3) {
                var2++;
                continue L0;
              } else {
                if ((var3 ^ -1) != -4) {
                  if (var3 != -7) {
                    if (-10 != var3) {
                      if ((var3 ^ -1) != -13) {
                        w.field_h[-1 + var2][-2 + var3] = kka.a(var2, 63, var3);
                        var3++;
                        continue L2;
                      } else {
                        var3++;
                        continue L2;
                      }
                    } else {
                      var3++;
                      continue L2;
                    }
                  } else {
                    var3++;
                    continue L2;
                  }
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = -1;
    }
}
