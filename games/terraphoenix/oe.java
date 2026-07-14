/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static int field_c;
    private fa field_e;
    static String field_a;
    static rh field_d;
    static String[] field_b;
    private fa field_g;
    private qk field_f;

    final mb a(boolean param0, int param1) {
        mb var3 = null;
        byte[] var4 = null;
        mb var5 = null;
        var3 = (mb) ((oe) this).field_f.a((long)param1, -24469);
        if (var3 == null) {
          L0: {
            if (32768 <= param1) {
              var4 = ((oe) this).field_e.b(1, 19, 32767 & param1);
              break L0;
            } else {
              var4 = ((oe) this).field_g.b(1, 116, param1);
              break L0;
            }
          }
          L1: {
            var5 = new mb();
            if (var4 != null) {
              var5.a(new dh(var4), param0);
              break L1;
            } else {
              break L1;
            }
          }
          if (param0) {
            if (32768 <= param1) {
              var5.c(-12);
              ((oe) this).field_f.a((byte) -3, (Object) (Object) var5, (long)param1);
              return var5;
            } else {
              ((oe) this).field_f.a((byte) -3, (Object) (Object) var5, (long)param1);
              return var5;
            }
          } else {
            field_a = null;
            if (32768 > param1) {
              ((oe) this).field_f.a((byte) -3, (Object) (Object) var5, (long)param1);
              return var5;
            } else {
              var5.c(-12);
              ((oe) this).field_f.a((byte) -3, (Object) (Object) var5, (long)param1);
              return var5;
            }
          }
        } else {
          return var3;
        }
    }

    final static String a(boolean param0, byte param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (!param2) {
          L0: {
            if (param0) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param3) {
              var4++;
              break L1;
            } else {
              break L1;
            }
          }
          if (param1 <= 97) {
            return null;
          } else {
            return kf.field_e[var4];
          }
        } else {
          L2: {
            var4 += 4;
            if (param0) {
              var4 += 2;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param3) {
              var4++;
              break L3;
            } else {
              break L3;
            }
          }
          if (param1 <= 97) {
            return null;
          } else {
            return kf.field_e[var4];
          }
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        int var1 = 41 / ((44 - param0) / 57);
        field_d = null;
    }

    final static void a(int param0) {
        int var1 = -1 / ((36 - param0) / 61);
        pe.field_b = new pl();
        bj.field_f.a((gl) (Object) pe.field_b, -100);
    }

    private oe() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_c = 100;
        field_d = new rh(9, 0, 4, 1);
    }
}
