/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vta extends vw {
    static float field_e;
    static String field_f;
    static int[] field_d;

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
            field_f = null;
        }
    }

    vta(eo param0) {
        super(param0);
    }

    public static void d(int param0) {
        field_f = null;
        field_d = null;
        if (param0 != 36070) {
            field_d = null;
        }
    }

    final void a(int param0, boolean param1) {
        ((vta) this).field_c.a(true, (byte) 100);
        int var3 = 121 / ((param0 - 41) / 62);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != 55) {
            field_d = null;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param2 == 2048) {
            break L0;
          } else {
            vta.c((byte) -99);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-1 == (param1 & 2048)) {
              break L2;
            } else {
              if (-1 == (param0 & 55)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static int a(CharSequence param0, int param1) {
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        int var2 = param0.length();
        if (param1 != -12754) {
            vta.d(-51);
        }
        int var3 = 0;
        for (var4 = 0; var4 < var2; var4++) {
            var3 = -var3 + ((var3 << -345436059) - -io.a(-377, param0.charAt(var4)));
        }
        return var3;
    }

    final void a(int param0, iva param1, int param2) {
        ((vta) this).field_c.a(true, param1);
        ((vta) this).field_c.a((byte) -35, param0);
        if (param2 != 24595) {
            Object var5 = null;
            int discarded$0 = vta.a((CharSequence) null, -89);
        }
    }

    final void a(int param0) {
        if (param0 >= -4) {
            field_e = -1.3910614252090454f;
        }
        ((vta) this).field_c.a(false, (byte) 72);
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
            Object var3 = null;
            int discarded$0 = vta.a((CharSequence) null, -5);
            return true;
        }
        return true;
    }

    final static void c(byte param0) {
        fua.field_g = false;
        if (param0 < 52) {
            field_f = null;
        }
        ok.field_s = -1 == (vc.field_q.h(255) ^ -1) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Remove <%0> from ignore list";
        field_d = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
    }
}
