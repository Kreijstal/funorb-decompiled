/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jv {
    static int field_b;
    static int field_a;

    final static void a(boolean param0, boolean param1) {
        sm.a((byte) 127, param0, param1);
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        if (param0) {
          lk.b(0, 0, lk.field_b, lk.field_c, 0, 192);
          if (param1 == -71) {
            vt.a(param0, true);
            return;
          } else {
            field_b = 40;
            vt.a(param0, true);
            return;
          }
        } else {
          lk.b();
          if (param1 == -71) {
            vt.a(param0, true);
            return;
          } else {
            field_b = 40;
            vt.a(param0, true);
            return;
          }
        }
    }

    final static void a(int param0, String[] param1, String param2, boolean param3) {
        int var5 = 0;
        Object var6 = null;
        String[] var8 = null;
        String[] var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (param3) {
          vm.field_c = st.field_z;
          if (255 != param0) {
            if (100 <= param0) {
              if (param0 <= 105) {
                var9 = param1;
                as.a(256, var9);
                jh.field_z = qr.a(param1, 8192);
                return;
              } else {
                jh.field_z = au.a(48, param2, param0);
                return;
              }
            } else {
              jh.field_z = au.a(48, param2, param0);
              return;
            }
          } else {
            L0: {
              if ((lq.field_d ^ -1) <= -14) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L0;
              }
            }
            jh.field_z = bq.a(stackIn_16_0 != 0, 8192);
            var6 = null;
            as.a(256, (String[]) null);
            return;
          }
        } else {
          field_a = -32;
          vm.field_c = st.field_z;
          if (255 != param0) {
            if (100 <= param0) {
              if (param0 <= 105) {
                var8 = param1;
                as.a(256, var8);
                jh.field_z = qr.a(param1, 8192);
                return;
              } else {
                jh.field_z = au.a(48, param2, param0);
                return;
              }
            } else {
              jh.field_z = au.a(48, param2, param0);
              return;
            }
          } else {
            L1: {
              if ((lq.field_d ^ -1) <= -14) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            jh.field_z = bq.a(stackIn_5_0 != 0, 8192);
            var6 = null;
            as.a(256, (String[]) null);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
