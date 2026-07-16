/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static String[] field_h;
    static String field_f;
    static char[] field_a;
    static String field_b;
    static int field_d;
    static dd field_g;
    static dd field_e;
    static int field_c;

    final static String a(byte param0) {
        if (!(null != di.field_j)) {
            return "";
        }
        if (param0 > -85) {
            field_d = 115;
            return di.field_j;
        }
        return di.field_j;
    }

    public static void a(boolean param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        field_f = null;
        field_g = null;
        if (param0) {
            return;
        }
        field_h = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 == 0) {
          return 0;
        } else {
          if (0 > param0) {
            throw new IllegalArgumentException("");
          } else {
            if (32768 > param0) {
              L0: {
                if (128 <= param0) {
                  if ((param0 ^ -1) > -2049) {
                    if (-513 >= (param0 ^ -1)) {
                      var2 = 3;
                      break L0;
                    } else {
                      var2 = 4;
                      param0 = param0 << (var2 << 678062721);
                      return ac.field_o[param0 + -32768] >> var2;
                    }
                  } else {
                    if ((param0 ^ -1) > -8193) {
                      var2 = 2;
                      param0 = param0 << (var2 << 678062721);
                      return ac.field_o[param0 + -32768] >> var2;
                    } else {
                      var2 = 1;
                      param0 = param0 << (var2 << 678062721);
                      return ac.field_o[param0 + -32768] >> var2;
                    }
                  }
                } else {
                  if ((param0 ^ -1) > -9) {
                    if (2 > param0) {
                      return 256;
                    } else {
                      var2 = 7;
                      param0 = param0 << (var2 << 678062721);
                      return ac.field_o[param0 + -32768] >> var2;
                    }
                  } else {
                    if (param0 < 32) {
                      var2 = 6;
                      param0 = param0 << (var2 << 678062721);
                      return ac.field_o[param0 + -32768] >> var2;
                    } else {
                      var2 = 5;
                      break L0;
                    }
                  }
                }
              }
              param0 = param0 << (var2 << 678062721);
              return ac.field_o[param0 + -32768] >> var2;
            } else {
              if (-131073 < (param0 ^ -1)) {
                if (param1 <= -119) {
                  return ac.field_o[-32768 + param0];
                } else {
                  field_f = null;
                  return ac.field_o[-32768 + param0];
                }
              } else {
                if ((param0 ^ -1) <= -33554433) {
                  if (-536870913 < (param0 ^ -1)) {
                    if ((param0 ^ -1) > -134217729) {
                      var2 = 5;
                      param0 = param0 >> (var2 << -979488383);
                      return ac.field_o[param0 + -32768] << var2;
                    } else {
                      var2 = 6;
                      param0 = param0 >> (var2 << -979488383);
                      return ac.field_o[param0 + -32768] << var2;
                    }
                  } else {
                    var2 = 7;
                    param0 = param0 >> (var2 << -979488383);
                    return ac.field_o[param0 + -32768] << var2;
                  }
                } else {
                  if (param0 < 2097152) {
                    if (-524289 < (param0 ^ -1)) {
                      var2 = 1;
                      param0 = param0 >> (var2 << -979488383);
                      return ac.field_o[param0 + -32768] << var2;
                    } else {
                      var2 = 2;
                      param0 = param0 >> (var2 << -979488383);
                      return ac.field_o[param0 + -32768] << var2;
                    }
                  } else {
                    if (-8388609 >= (param0 ^ -1)) {
                      var2 = 4;
                      param0 = param0 >> (var2 << -979488383);
                      return ac.field_o[param0 + -32768] << var2;
                    } else {
                      var2 = 3;
                      param0 = param0 >> (var2 << -979488383);
                      return ac.field_o[param0 + -32768] << var2;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(String param0, int param1, String param2) {
        if (param1 <= -116) {
          if (d.field_d != null) {
            d.field_d.k(17);
            vj.field_j = new ui(param2, param0, false, true, true);
            tn.field_n.d((ei) (Object) vj.field_j, 30);
            return;
          } else {
            vj.field_j = new ui(param2, param0, false, true, true);
            tn.field_n.d((ei) (Object) vj.field_j, 30);
            return;
          }
        } else {
          field_g = null;
          if (d.field_d == null) {
            vj.field_j = new ui(param2, param0, false, true, true);
            tn.field_n.d((ei) (Object) vj.field_j, 30);
            return;
          } else {
            d.field_d.k(17);
            vj.field_j = new ui(param2, param0, false, true, true);
            tn.field_n.d((ei) (Object) vj.field_j, 30);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_a = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_f = "You must play 1 more rated game before playing with the current options.";
        field_d = 64;
        field_b = "Your game";
    }
}
