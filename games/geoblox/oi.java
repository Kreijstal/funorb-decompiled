/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static String[] field_a;
    static String field_e;
    static String field_d;
    static dm field_b;
    static String field_c;

    final synchronized static byte[] a(boolean param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param1 != 100) {
            break L0;
          } else {
            if ((hb.field_b ^ -1) < -1) {
              hb.field_b = hb.field_b - 1;
              var2_ref_byte__ = dj.field_I[hb.field_b - 1];
              dj.field_I[hb.field_b] = null;
              return var2_ref_byte__;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if ((param1 ^ -1) != -5001) {
            break L1;
          } else {
            if (0 < ah.field_d) {
              ah.field_d = ah.field_d - 1;
              var2_ref_byte__ = rd.field_s[ah.field_d - 1];
              rd.field_s[ah.field_d] = null;
              return var2_ref_byte__;
            } else {
              break L1;
            }
          }
        }
        if (!param0) {
          L2: {
            if ((param1 ^ -1) != -30001) {
              break L2;
            } else {
              if (ag.field_i <= 0) {
                break L2;
              } else {
                ag.field_i = ag.field_i - 1;
                var2_ref_byte__ = sd.field_C[ag.field_i - 1];
                sd.field_C[ag.field_i] = null;
                return var2_ref_byte__;
              }
            }
          }
          L3: {
            if (sg.field_c == null) {
              break L3;
            } else {
              var2 = 0;
              L4: while (true) {
                if (var2 >= nk.field_c.length) {
                  break L3;
                } else {
                  if (nk.field_c[var2] == param1) {
                    if (0 < oa.field_b[var2]) {
                      oa.field_b[var2] = oa.field_b[var2] - 1;
                      var3 = sg.field_c[var2][oa.field_b[var2] - 1];
                      sg.field_c[var2][oa.field_b[var2]] = null;
                      return var3;
                    } else {
                      var2++;
                      continue L4;
                    }
                  } else {
                    var2++;
                    continue L4;
                  }
                }
              }
            }
          }
          return new byte[param1];
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = Geoblox.field_C;
        se var4 = (se) (Object) sj.field_g.g(0);
        while (var4 != null) {
            tj.a(param0, 86, var4);
            var4 = (se) (Object) sj.field_g.d(1);
        }
        if (param1 < 115) {
            field_b = null;
        }
        ea var5 = (ea) (Object) ea.field_g.g(0);
        while (var5 != null) {
            gj.a((byte) -88, param0, var5);
            var5 = (ea) (Object) ea.field_g.d(1);
        }
    }

    final static dm[] a(byte param0, String param1, String param2, rh param3) {
        int var5 = -59 % ((41 - param0) / 39);
        int var4 = param3.a((byte) 127, param2);
        int var6 = param3.a(param1, -101, var4);
        return rd.a(var4, -122, var6, param3);
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = -119 / ((param0 - 49) / 55);
        field_e = null;
        field_b = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[255];
        field_d = "The objective of Geoblox is to stack geoblox on your avatar in patterns of three in a row, by shape, colour, or both shape AND colour. Matching both shape and colour simultaneously will earn you even more points!<br>Try connecting three of a kind by colour now. Press <img=2> once you are ready to continue.";
        field_c = "Type your password again to make sure it's correct";
    }
}
