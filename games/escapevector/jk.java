/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    private int field_a;
    private int field_d;
    static volatile int field_b;
    private int field_c;

    final static void a(String[] args, String param1, int param2, int param3) {
        String[] var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var5 = EscapeVector.field_A;
        ui.field_b = ia.field_y;
        if (-256 != (param3 ^ -1)) {
          if ((param3 ^ -1) > -101) {
            co.field_a = bm.a(param1, param3, param2 ^ -97);
            if (param2 != -101) {
              field_b = 26;
              return;
            } else {
              return;
            }
          } else {
            if (param3 <= 105) {
              var4 = args;
              mb.a(var4, 4);
              co.field_a = rg.a(args, (byte) -63);
              if (param2 != -101) {
                field_b = 26;
                return;
              } else {
                return;
              }
            } else {
              co.field_a = bm.a(param1, param3, param2 ^ -97);
              if (param2 == -101) {
                return;
              } else {
                field_b = 26;
                return;
              }
            }
          }
        } else {
          L0: {
            if ((gf.field_a ^ -1) <= -14) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          co.field_a = fc.a(stackIn_4_0 != 0, (byte) -79);
          mb.a((String[]) null, param2 + 105);
          if (param2 == -101) {
            return;
          } else {
            field_b = 26;
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param2 != 14714) {
            ((jk) this).field_a = 40;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 1 << param2;
        if (!(0 != (((jk) this).field_a & var4))) {
            return;
        }
        if (param1 != ((jk) this).field_d) {
            return;
        }
        oe var5 = ma.field_a;
        int var6 = -69 / ((19 - param0) / 47);
        if (!(var5 != null)) {
            return;
        }
        this.a(param1, param2, 14714);
        var5.a(param2, false, ((jk) this).field_c, ((jk) this).field_c ^ 255);
    }

    final static void a(String param0, byte param1) {
        if (param1 != -6) {
            field_b = 86;
        }
    }

    jk(int param0, int param1, int param2) {
        ((jk) this).field_d = param0;
        ((jk) this).field_a = param1;
        ((jk) this).field_c = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
    }
}
