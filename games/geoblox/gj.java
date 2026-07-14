/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends fj {
    static int field_u;
    static String field_t;
    static cb field_s;
    private Object field_r;

    final static void a(byte param0, int param1, ea param2) {
        pk var3 = fj.field_q;
        var3.a(param1, (byte) -80);
        int var4 = 66 % ((param0 - 23) / 51);
        var3.d((byte) 122, 2);
        var3.d((byte) 125, 0);
        var3.d((byte) -90, param2.field_f);
    }

    final static void a(String param0, int param1, byte param2, String[] param3) {
        int var5 = 0;
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
        kd.field_b = va.field_e;
        if (param2 == 30) {
          if (param1 != 255) {
            if (param1 <= -101) {
              if (-106 < param1) {
                dl.field_a = ig.a(param0, param1, false);
                return;
              } else {
                dl.field_a = ac.a(28, param3);
                return;
              }
            } else {
              dl.field_a = ig.a(param0, param1, false);
              return;
            }
          } else {
            L0: {
              stackOut_3_0 = -106;
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
            dl.field_a = hh.a(stackIn_6_0, stackIn_6_1 != 0);
            return;
          }
        } else {
          return;
        }
    }

    final Object e(byte param0) {
        if (param0 <= 50) {
            Object var3 = null;
            gj.a((String) null, 21, (byte) -91, (String[]) null);
            return ((gj) this).field_r;
        }
        return ((gj) this).field_r;
    }

    final boolean g(int param0) {
        if (param0 != 13) {
            return true;
        }
        return false;
    }

    final static void f(byte param0) {
        ja var1 = null;
        int var2 = 0;
        var2 = Geoblox.field_C;
        var1 = (ja) (Object) a.field_d.g(0);
        L0: while (true) {
          if (var1 == null) {
            if (param0 > -33) {
              gj.f((byte) 90);
              return;
            } else {
              return;
            }
          } else {
            L1: {
              if (-1 == (var1.field_z ^ -1)) {
                break L1;
              } else {
                var1.e(1643839728);
                break L1;
              }
            }
            var1 = (ja) (Object) a.field_d.d(1);
            continue L0;
          }
        }
    }

    public static void h(int param0) {
        if (param0 != -1) {
            gj.h(-23);
            field_s = null;
            field_t = null;
            return;
        }
        field_s = null;
        field_t = null;
    }

    gj(Object param0, int param1) {
        super(param1);
        ((gj) this).field_r = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Login / Register";
    }
}
