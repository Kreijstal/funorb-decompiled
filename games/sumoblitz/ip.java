/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip extends ml {
    private byte[] field_x;
    static tf field_y;

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (param2 != 4096) {
          return;
        } else {
          var4 = param1 * 2;
          var5 = param0 & 255;
          var4++;
          ((ip) this).field_x[var4] = (byte)(var5 * 3 >> 66555013);
          ((ip) this).field_x[var4] = (byte)(var5 * 3 >> 1886067877);
          return;
        }
    }

    ip() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final byte[] a(byte param0, int param1, int param2, int param3) {
        int var5 = 79 % ((param0 - -43) / 46);
        ((ip) this).field_x = new byte[2 * (param3 * (param2 * param1))];
        ((ip) this).a(param3, 206, param2, param1);
        return ((ip) this).field_x;
    }

    final static void d(int param0) {
        int var2 = 0;
        var2 = Sumoblitz.field_L ? 1 : 0;
        if (oj.a(false)) {
          boolean discarded$3 = pu.field_e.a(cc.field_j, c.field_r, true, param0 + -1886067878);
          if (param0 == 1886067877) {
            pu.field_e.h(-104);
            L0: while (true) {
              if (!wd.c(-81)) {
                return;
              } else {
                boolean discarded$4 = pu.field_e.a(np.field_c, tg.field_a, true);
                continue L0;
              }
            }
          } else {
            ip.d((byte) -127);
            pu.field_e.h(-104);
            L1: while (true) {
              if (!wd.c(-81)) {
                return;
              } else {
                boolean discarded$5 = pu.field_e.a(np.field_c, tg.field_a, true);
                continue L1;
              }
            }
          }
        } else {
          if (null != gk.field_o) {
            if (!gk.field_o.field_a) {
              return;
            } else {
              ib.d(1);
              pu.field_e.a((byte) 113, (pk) (Object) new u(pu.field_e, am.field_e));
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void d(byte param0) {
        field_y = null;
        if (param0 <= 53) {
            ip.d((byte) -74);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new tf();
    }
}
