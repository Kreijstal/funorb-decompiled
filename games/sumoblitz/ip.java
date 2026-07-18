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
          int incrementValue$2 = var4;
          var4++;
          ((ip) this).field_x[incrementValue$2] = (byte)(var5 * 3 >> 5);
          ((ip) this).field_x[var4] = (byte)(var5 * 3 >> 5);
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
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (oj.a(false)) {
              boolean discarded$15 = pu.field_e.a(cc.field_j, c.field_r, true, -1);
              pu.field_e.h(-104);
              L1: while (true) {
                if (!wd.c(-81)) {
                  break L0;
                } else {
                  boolean discarded$16 = pu.field_e.a(np.field_c, tg.field_a, true);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (null == gk.field_o) {
                  break L2;
                } else {
                  if (gk.field_o.field_a) {
                    ib.d(1);
                    pu.field_e.a((byte) 113, (pk) (Object) new u(pu.field_e, am.field_e));
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "ip.D(" + 1886067877 + ')');
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
