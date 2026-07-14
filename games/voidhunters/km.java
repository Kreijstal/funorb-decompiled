/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends jtb {
    ds field_p;
    int field_r;
    static int field_o;
    byte field_q;
    static String field_s;

    public static void g(byte param0) {
        field_s = null;
        if (param0 != 114) {
            km.g((byte) -103);
        }
    }

    final byte[] a(int param0) {
        int var2 = 0;
        if (((km) this).field_n) {
          throw new RuntimeException();
        } else {
          if (((km) this).field_p.field_e >= ((km) this).field_p.field_h.length - ((km) this).field_q) {
            var2 = 9 / ((17 - param0) / 58);
            return ((km) this).field_p.field_h;
          } else {
            throw new RuntimeException();
          }
        }
    }

    final static void e(int param0) {
        fva.field_p = true;
        ow.field_b = 0;
        if (param0 != 1) {
            field_o = -76;
        }
    }

    final static void a(asb param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        faa var8 = null;
        int var9 = 0;
        faa var10 = null;
        wma var11 = null;
        int[] var12 = null;
        var7 = VoidHunters.field_G;
        var8 = new faa(param0.a("", true, "logo.fo3d"));
        var10 = var8;
        var3 = var10.e((byte) -87);
        var10.p(-23497);
        gs.field_a = bh.a(var10, (byte) -122);
        raa.field_p = new int[var3][];
        eha.field_o = new wma[var3];
        var4 = 0;
        L0: while (true) {
          if (var3 <= var4) {
            var10.f((byte) -79);
            var9 = 0;
            var4 = var9;
            if (param1 != 36) {
              return;
            } else {
              L1: while (true) {
                if (var9 >= var3) {
                  return;
                } else {
                  var11 = eha.field_o[var9];
                  var11.a(-21227, 6, 6, 6, 1);
                  var11.a(param1 + 83);
                  var12 = new int[]{var11.field_B + var11.field_d >> 1428307521, var11.field_a + var11.field_u >> 459000545, var11.field_s + var11.field_q >> 1353702081};
                  raa.field_p[var9] = var12;
                  var11.a(param1 + -45, -var12[2], -var12[0], -var12[1]);
                  var9++;
                  continue L1;
                }
              }
            }
          } else {
            eha.field_o[var4] = ur.a(var8, (byte) -105);
            var4++;
            continue L0;
          }
        }
    }

    final static void f(byte param0) {
        if (param0 == -119) {
          if (-11 == (qmb.field_q ^ -1)) {
            twa.b(param0 ^ -108);
            qmb.field_q = 11;
            dga.field_a = true;
            return;
          } else {
            if (!nua.b(true)) {
              twa.b(param0 ^ -108);
              qmb.field_q = 11;
              dga.field_a = true;
              return;
            } else {
              dga.field_a = true;
              return;
            }
          }
        } else {
          km.g((byte) 33);
          if (-11 == (qmb.field_q ^ -1)) {
            twa.b(param0 ^ -108);
            qmb.field_q = 11;
            dga.field_a = true;
            return;
          } else {
            if (!nua.b(true)) {
              twa.b(param0 ^ -108);
              qmb.field_q = 11;
              dga.field_a = true;
              return;
            } else {
              dga.field_a = true;
              return;
            }
          }
        }
    }

    km() {
    }

    final int e(byte param0) {
        if (null == ((km) this).field_p) {
            return 0;
        }
        if (param0 != -4) {
            return -96;
        }
        return ((km) this).field_p.field_e * 100 / (((km) this).field_p.field_h.length - ((km) this).field_q);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 5;
        field_s = "External ship design loaded";
    }
}
