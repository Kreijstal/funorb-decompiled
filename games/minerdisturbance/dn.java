/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends pi {
    static String field_s;
    static String field_n;
    static int field_w;
    private int field_o;
    private int field_u;
    private int field_r;
    private int field_q;
    private int field_v;
    static rc[] field_t;
    private int field_p;

    final boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ((dn) this).field_p = ((dn) this).field_p + ((dn) this).field_r;
        ((dn) this).field_u = ((dn) this).field_u + 800;
        ((dn) this).field_o = ((dn) this).field_o + ((dn) this).field_v;
        ((dn) this).field_v = ((dn) this).field_v + 4;
        if (param0 == -126) {
          var2 = -li.field_c + (((dn) this).field_p >> -1328603548);
          var3 = (((dn) this).field_o >> 1912766116) - db.field_d;
          if (0 <= var2) {
            if (640 >= var2) {
              if (var3 >= 0) {
                if (-481 <= (var3 ^ -1)) {
                  if ((((dn) this).field_v ^ -1) < -1) {
                    if (!je.field_I[(((dn) this).field_p >> 860805060) / 32][(((dn) this).field_o >> 48815076) / 32].field_a) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_t = null;
          var2 = -li.field_c + (((dn) this).field_p >> -1328603548);
          var3 = (((dn) this).field_o >> 1912766116) - db.field_d;
          if (0 <= var2) {
            if (640 >= var2) {
              if (var3 >= 0) {
                if (-481 <= (var3 ^ -1)) {
                  if ((((dn) this).field_v ^ -1) < -1) {
                    if (!je.field_I[(((dn) this).field_p >> 860805060) / 32][(((dn) this).field_o >> 48815076) / 32].field_a) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static String a(CharSequence param0, boolean param1) {
        String var2 = null;
        if (param1) {
          L0: {
            field_n = null;
            var2 = oh.a(ah.a(-97, param0), 95);
            if (var2 == null) {
              var2 = "";
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            var2 = oh.a(ah.a(-97, param0), 95);
            if (var2 == null) {
              var2 = "";
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    public static void b(byte param0) {
        if (param0 >= -44) {
          field_n = null;
          field_s = null;
          field_t = null;
          field_n = null;
          return;
        } else {
          field_s = null;
          field_t = null;
          field_n = null;
          return;
        }
    }

    final static void a(bj param0, byte param1) {
        ea var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = new ea(param0.a("", 0, "final_frame.jpg"), (java.awt.Component) (Object) ef.field_c);
        var3 = var2.field_y;
        var4 = var2.field_C;
        ti.a((byte) -4);
        bl.field_x = new ea(var3, var4 * 3 / 4);
        bl.field_x.g();
        var2.g(0, 0);
        eg.field_b = new ea(var3, -bl.field_x.field_C + var4);
        eg.field_b.g();
        var2.g(0, -bl.field_x.field_C);
        eg.field_b.field_u = bl.field_x.field_C;
        tk.b(true);
        if (param1 != 29) {
          field_w = -122;
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        int var2 = -li.field_c + (((dn) this).field_p >> 2119690564);
        int var3 = 56 % ((param0 - 21) / 42);
        int var4 = -db.field_d + (((dn) this).field_o >> -759394588);
        je.field_B[((dn) this).field_q % je.field_B.length].b(-120, var2, 2048, 65535 & ((dn) this).field_u, var4);
    }

    final static int a(String param0, boolean param1, int param2, String param3, String param4, int param5, int param6) {
        pf var7 = null;
        pf var8 = null;
        Object var9 = null;
        if (param6 != -14543) {
          var9 = null;
          int discarded$1 = dn.a((String) null, true, -124, (String) null, (String) null, -122, 43);
          var7 = new pf(param3);
          var8 = new pf(param0);
          return j.a(param2, param6 ^ 14565, param1, param5, var8, param4, var7);
        } else {
          var7 = new pf(param3);
          var8 = new pf(param0);
          return j.a(param2, param6 ^ 14565, param1, param5, var8, param4, var7);
        }
    }

    dn(int param0, int param1, int param2, int param3, int param4) {
        ((dn) this).field_o = param2 << 23226020;
        ((dn) this).field_v = param4 + -param2 << 1635974404;
        ((dn) this).field_q = param0;
        ((dn) this).field_r = -param1 + param3 << -814480476;
        ((dn) this).field_p = param1 << 355639460;
        int var6 = ub.a(-1237818874, ((dn) this).field_v * ((dn) this).field_v + ((dn) this).field_r * ((dn) this).field_r >> -1774625052);
        ((dn) this).field_r = (((dn) this).field_r << -1991802077) / var6;
        ((dn) this).field_v = -32;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "FROM ONLY";
        field_w = 0;
        field_n = "Log In/Register";
        field_t = new rc[25];
    }
}
