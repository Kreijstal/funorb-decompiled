/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends al {
    private ba field_l;
    private ba field_n;
    static boolean field_k;
    static eh field_p;
    static String[] field_m;
    static int[] field_j;
    static tg field_o;

    public static void d(int param0) {
        field_j = null;
        field_o = null;
        field_p = null;
        field_m = null;
        if (param0 != 0) {
            field_m = null;
        }
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        var3 = ((bf) this).field_n.field_h.toLowerCase();
        var4 = param1.toLowerCase();
        if (-1 > (var3.length() ^ -1)) {
          if ((var4.length() ^ -1) < -1) {
            var5 = var3.lastIndexOf("@");
            if ((var5 ^ -1) <= -1) {
              if (var5 < -1 + var3.length()) {
                var6 = var3.substring(0, var5);
                var7 = var3.substring(var5 + 1);
                if (-1 < (var4.indexOf(var6) ^ -1)) {
                  if (var4.indexOf(var7) < 0) {
                    var5 = -116 / ((param0 - 29) / 40);
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                var5 = -116 / ((param0 - 29) / 40);
                return false;
              }
            } else {
              var5 = -116 / ((param0 - 29) / 40);
              return false;
            }
          } else {
            var5 = -116 / ((param0 - 29) / 40);
            return false;
          }
        } else {
          var5 = -116 / ((param0 - 29) / 40);
          return false;
        }
    }

    final String a(String param0, byte param1) {
        String var4 = null;
        String var5 = null;
        String var6 = null;
        var6 = ((bf) this).field_l.field_h.toLowerCase();
        var4 = param0.toLowerCase();
        if (0 != var4.length()) {
          var5 = var4;
          if (!hc.b(var5, param1 ^ -114)) {
            if (!nd.a(var5, param1 + 183)) {
              if (param1 == -114) {
                if (!ab.a(var5, (byte) -12)) {
                  if (this.a(param1 ^ 65, param0)) {
                    return bd.field_m;
                  } else {
                    if (-1 > (var6.length() ^ -1)) {
                      if (!pf.a(128, var5, var6)) {
                        if (ee.a(-1, var6, var5)) {
                          return kk.field_t;
                        } else {
                          if (ah.a(var5, var6, (byte) 8)) {
                            return ll.field_J;
                          } else {
                            return ve.field_b;
                          }
                        }
                      } else {
                        return ll.field_J;
                      }
                    } else {
                      return lk.field_s;
                    }
                  }
                } else {
                  return mb.field_k;
                }
              } else {
                return null;
              }
            } else {
              return ef.field_d;
            }
          } else {
            return ve.field_b;
          }
        } else {
          return null;
        }
    }

    bf(ba param0, ba param1, ba param2) {
        super(param0);
        ((bf) this).field_l = param1;
        ((bf) this).field_n = param2;
    }

    final vf b(String param0, byte param1) {
        if (param1 != 54) {
            return null;
        }
        String var3 = ((bf) this).field_l.field_h.toLowerCase();
        String var4 = param0.toLowerCase();
        if (var4.length() == 0) {
            return a.field_e;
        }
        if (!qb.a(param1 + -177, var4, var3)) {
            return a.field_e;
        }
        if (!(!this.a(77, param0))) {
            return a.field_e;
        }
        return mc.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_p = new eh(13, 0, 1, 0);
        field_j = new int[]{100, 200, 500, 100, 100, 200, 200, 200, 500, 1000};
    }
}
