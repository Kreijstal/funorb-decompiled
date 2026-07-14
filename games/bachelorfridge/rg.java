/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg extends bw {
    int[] field_g;
    int field_i;
    static int field_h;
    static kv field_j;
    static eaa field_f;

    final static void a(int param0, int param1, byte param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          ug.field_o.e(param0, param1);
          var4 = -98 % ((param2 - -3) / 53);
          if (param3) {
            L1: {
              var5 = 2 * (wga.field_s % ug.field_o.field_q);
              if (ug.field_o.field_q <= var5) {
                var5 = ug.field_o.field_q - var5 - -ug.field_o.field_q;
                break L1;
              } else {
                break L1;
              }
            }
            if (10 <= var5) {
              if (-40 + ug.field_o.field_q < var5) {
                var5 = ug.field_o.field_q + -40;
                iaa.a(param1, 80, var5, 0, param0, 0, ug.field_o, -3702, 30);
                break L0;
              } else {
                iaa.a(param1, 80, var5, 0, param0, 0, ug.field_o, -3702, 30);
                return;
              }
            } else {
              var5 = 10;
              iaa.a(param1, 80, var5, 0, param0, 0, ug.field_o, -3702, 30);
              return;
            }
          } else {
            break L0;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 0) {
            rg.a(-107, 55, (byte) -71, true);
            field_j = null;
            return;
        }
        field_j = null;
    }

    final static void a(String param0, int param1) {
        io.field_q.field_Z = param0;
        eda.field_j = true;
        int var2 = hga.field_U.field_b;
        int var3 = hga.field_U.field_f;
        int var4 = io.field_q.field_jb.a(param0, 272, io.field_q.field_B);
        int var5 = 7 + (-110 + var3 / param1 - var4 / 2);
        sb.field_n.a(var3 - 120 - var5 * 2, 31407, 320, (-320 + var2) / 2, var5);
        sb.field_n.field_eb = mu.a(11579568, 3, sb.field_n.field_p, 8421504, 2105376, (byte) 17);
        io.field_q.a(-24 + (sb.field_n.field_p - 20), 31407, -24 + (-24 + sb.field_n.field_sb), 24, 16);
        aja.field_l.a(24, param1 ^ 31405, 80, 120, -24 + (-20 + sb.field_n.field_p));
    }

    private rg() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1) {
        int var4 = BachelorFridge.field_y;
        cfa var5 = (cfa) (Object) eaa.field_d.b((byte) 90);
        while (var5 != null) {
            nr.a(param1, var5, (byte) 102);
            var5 = (cfa) (Object) eaa.field_d.c(0);
        }
        bw var2 = gs.field_l.b((byte) 90);
        int var3 = 17 / ((-41 - param0) / 59);
        while (var2 != null) {
            ah.a(4, param1);
            var2 = gs.field_l.c(0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new kv(270, 70);
        field_f = new eaa();
    }
}
