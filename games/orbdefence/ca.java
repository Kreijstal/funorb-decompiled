/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ca {
    static boolean field_b;
    ca field_c;
    long field_d;
    ca field_e;
    static String field_a;

    final static short[] a(short[] param0, int param1, boolean param2, se param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        var4 = param3.h(param1, 8);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (var4 != param0.length) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param0 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param3.h(4, 8);
            if (!param2) {
              break L2;
            } else {
              var9 = null;
              short[] discarded$2 = ca.a((short[]) null, -25, true, (se) null);
              break L2;
            }
          }
          L3: {
            var6 = (short)param3.h(16, 8);
            if (0 < var5) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param0[var7] = (short)(var6 + param3.h(var5, 8));
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param0[var7] = (short)var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param0;
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        if (param0 != 40) {
            field_a = null;
        }
        field_a = null;
    }

    final static int a(boolean param0) {
        if (!(vh.field_n >= 2)) {
            return 0;
        }
        if (param0) {
            field_b = false;
        }
        if (wj.field_m != 0) {
            if (!(lf.field_a == null)) {
                if (!lf.field_a.b(-1)) {
                    return 14;
                }
                if (!(lf.field_a.c((byte) -62, ""))) {
                    return 29;
                }
                if (!(lf.field_a.b((byte) -113, ""))) {
                    return 29;
                }
            }
            if (!(og.field_g.b(-1))) {
                return 43;
            }
            if (!og.field_g.b((byte) 58, "commonui")) {
                return 57;
            }
            if (!am.field_b.b(-1)) {
                return 71;
            }
            if (!(am.field_b.b((byte) 94, "commonui"))) {
                return 80;
            }
            if (!(wb.field_b.b(-1))) {
                return 82;
            }
            // ifne L276
            return 86;
        }
        if (!og.field_g.b(-1)) {
            return 20;
        }
        if (!(og.field_g.b((byte) 112, "commonui"))) {
            return 40;
        }
        if (!am.field_b.b(-1)) {
            return 50;
        }
        if (!am.field_b.b((byte) 111, "commonui")) {
            return 60;
        }
        if (!(wb.field_b.b(-1))) {
            return 70;
        }
        if (!wb.field_b.c(7715)) {
            return 80;
        }
        return 100;
    }

    final void b(int param0) {
        if (!(null != ((ca) this).field_c)) {
            return;
        }
        ((ca) this).field_c.field_e = ((ca) this).field_e;
        if (param0 != 57) {
            Object var3 = null;
            short[] discarded$0 = ca.a((short[]) null, 120, true, (se) null);
        }
        ((ca) this).field_e.field_c = ((ca) this).field_c;
        ((ca) this).field_e = null;
        ((ca) this).field_c = null;
    }

    final boolean b(boolean param0) {
        if (!(null != ((ca) this).field_c)) {
            return false;
        }
        if (!param0) {
            ca.a(-7);
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Max Bolts";
    }
}
