/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static int field_c;
    static int field_b;
    static int field_d;
    static int[] field_a;

    final static void a(int param0, int param1, String[] param2, String param3) {
        String[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        var5 = Geoblox.field_C;
        if (param1 == 6568) {
          si.field_g = va.field_e;
          if (param0 != -256) {
            if (-101 <= param0) {
              if (param0 <= 105) {
                var4 = param2;
                ci.a(var4, 416577356);
                me.field_g = ac.a(param1 + -6540, param2);
                return;
              } else {
                me.field_g = ig.a(param3, param0, false);
                return;
              }
            } else {
              me.field_g = ig.a(param3, param0, false);
              return;
            }
          } else {
            L0: {
              stackOut_3_0 = param1 ^ 6648;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if ((rd.field_u ^ -1) <= -14) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L0;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L0;
              }
            }
            me.field_g = hh.a(stackIn_6_0, stackIn_6_1 != 0);
            var6 = null;
            ci.a((String[]) null, 416577356);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0) {
        if (hl.field_G) {
          kf.field_e = true;
          q.a((byte) 123, true);
          hj.field_a = 0;
          if (param0 >= -90) {
            kb.c(-89);
            return;
          } else {
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (param1) {
            return;
        }
        ue.a(param0, true, (byte) -102);
    }

    final static void b(int param0) {
        int var1 = 0;
        if (null == kd.field_e) {
          if (vg.field_i != null) {
            vg.field_i.m(23181);
            eh.a((byte) -2);
            var1 = -121 % ((-38 - param0) / 59);
            return;
          } else {
            eh.a((byte) -2);
            var1 = -121 % ((-38 - param0) / 59);
            return;
          }
        } else {
          kd.field_e.l(0);
          if (vg.field_i == null) {
            eh.a((byte) -2);
            var1 = -121 % ((-38 - param0) / 59);
            return;
          } else {
            vg.field_i.m(23181);
            eh.a((byte) -2);
            var1 = -121 % ((-38 - param0) / 59);
            return;
          }
        }
    }

    public static void c(int param0) {
        if (param0 != 105) {
            field_c = 71;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 640;
    }
}
