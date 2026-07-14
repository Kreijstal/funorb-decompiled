/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    static boolean field_g;
    static boolean field_c;
    static int field_b;
    static boolean field_e;
    static qg field_f;
    static String field_a;
    static String field_d;

    final synchronized static byte[] a(int param0, boolean param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param0 != 100) {
            break L0;
          } else {
            if ((tg.field_g ^ -1) >= -1) {
              break L0;
            } else {
              tg.field_g = tg.field_g - 1;
              var2_ref_byte__ = to.field_d[tg.field_g - 1];
              to.field_d[tg.field_g] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (!param1) {
            break L1;
          } else {
            field_c = true;
            break L1;
          }
        }
        L2: {
          if (-5001 != (param0 ^ -1)) {
            break L2;
          } else {
            if (0 >= dj.field_a) {
              break L2;
            } else {
              dj.field_a = dj.field_a - 1;
              var2_ref_byte__ = rp.field_c[dj.field_a - 1];
              rp.field_c[dj.field_a] = null;
              return var2_ref_byte__;
            }
          }
        }
        L3: {
          if ((param0 ^ -1) != -30001) {
            break L3;
          } else {
            if (hm.field_s > 0) {
              hm.field_s = hm.field_s - 1;
              var2_ref_byte__ = lm.field_l[hm.field_s - 1];
              lm.field_l[hm.field_s] = null;
              return var2_ref_byte__;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (lo.field_c == null) {
            break L4;
          } else {
            var2 = 0;
            L5: while (true) {
              if (var2 >= fp.field_c.length) {
                break L4;
              } else {
                if (param0 == fp.field_c[var2]) {
                  if (0 < vc.field_c[var2]) {
                    vc.field_c[var2] = vc.field_c[var2] - 1;
                    var3 = lo.field_c[var2][vc.field_c[var2] - 1];
                    lo.field_c[var2][vc.field_c[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L5;
                  }
                } else {
                  var2++;
                  continue L5;
                }
              }
            }
          }
        }
        return new byte[param0];
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != 0) {
            Object var2 = null;
            kn.a(114, (String) null, -104, -11, 95, -38, (String) null, (String) null);
        }
        field_f = null;
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, int param5, String param6, String param7) {
        h var8 = hp.field_b[param2];
        if (!(var8 != null)) {
            return;
        }
        var8.field_p = param7 == null ? null : hd.a(false, param0, "da_raider_" + param7);
        var8.field_g = param1 != null ? hd.a(false, param3, "da_raider_" + param1) : null;
        if (param4 < 123) {
            Object var9 = null;
            kn.a(19, (String) null, 101, 48, 18, -38, (String) null, (String) null);
        }
        var8.field_a = param6 == null ? null : hd.a(false, param5, "da_raider_" + param6);
    }

    final static cn[] a(nh param0, String param1, String param2, int param3) {
        int var4 = param0.a(param1, 1000);
        if (param3 >= -43) {
            field_c = true;
        }
        int var5 = param0.a(0, param2, var4);
        return oi.a(0, var4, var5, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Retry";
        field_d = "Open in popup window";
    }
}
