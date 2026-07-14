/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static hj field_a;

    final static void a(int param0, String param1, String[] param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        String[] var9 = null;
        String[] var10 = null;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (param0 <= -11) {
          tg.field_c = kf.field_d;
          if (-256 != (param3 ^ -1)) {
            if (100 <= param3) {
              if ((param3 ^ -1) >= -106) {
                var10 = param2;
                gi.a(var10, (byte) -66);
                uc.field_q = hi.a(2, param2);
                return;
              } else {
                uc.field_q = oe.a(param3, param1, -3);
                return;
              }
            } else {
              uc.field_q = oe.a(param3, param1, -3);
              return;
            }
          } else {
            L0: {
              if (13 <= ae.field_a) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L0;
              }
            }
            uc.field_q = fk.a(stackIn_16_0 != 0, (byte) -68);
            var7 = null;
            gi.a((String[]) null, (byte) -73);
            return;
          }
        } else {
          var6 = null;
          wa discarded$1 = i.a(true, (byte[]) null);
          tg.field_c = kf.field_d;
          if (-256 != (param3 ^ -1)) {
            if (100 <= param3) {
              if ((param3 ^ -1) >= -106) {
                var9 = param2;
                gi.a(var9, (byte) -66);
                uc.field_q = hi.a(2, param2);
                return;
              } else {
                uc.field_q = oe.a(param3, param1, -3);
                return;
              }
            } else {
              uc.field_q = oe.a(param3, param1, -3);
              return;
            }
          } else {
            L1: {
              if (13 <= ae.field_a) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            uc.field_q = fk.a(stackIn_5_0 != 0, (byte) -68);
            var7 = null;
            gi.a((String[]) null, (byte) -73);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 100) {
            i.a(8);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static wa a(boolean param0, byte[] param1) {
        wa var2 = null;
        Object var3 = null;
        if (param1 != null) {
          var2 = new wa(param1, jd.field_g, wc.field_a, wh.field_b, m.field_a, vc.field_g, fl.field_a);
          md.a((byte) -118);
          if (param0) {
            var3 = null;
            wa discarded$2 = i.a(true, (byte[]) null);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    static {
    }
}
