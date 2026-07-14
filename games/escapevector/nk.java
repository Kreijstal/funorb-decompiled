/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends ah {
    static int field_n;
    private ul field_o;
    private ul field_q;
    static mf field_p;
    static String field_s;
    static String field_r;

    final String a(byte param0, String param1) {
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        var7 = ((nk) this).field_q.field_l.toLowerCase();
        var4 = param1.toLowerCase();
        if (0 != var4.length()) {
          var5 = var4;
          if (ol.a((byte) -7, var5)) {
            return vc.field_e;
          } else {
            if (lb.b((byte) -78, var5)) {
              return gn.field_b;
            } else {
              if (aa.a(1, var5)) {
                return n.field_j;
              } else {
                var6 = 78 / ((param0 - 10) / 51);
                if (!this.b((byte) 53, param1)) {
                  if (var7.length() > 0) {
                    if (lg.a(0, var5, var7)) {
                      return cn.field_b;
                    } else {
                      if (lf.a(var5, (byte) 37, var7)) {
                        return kk.field_a;
                      } else {
                        if (pi.a(-115, var5, var7)) {
                          return cn.field_b;
                        } else {
                          return vc.field_e;
                        }
                      }
                    }
                  } else {
                    return ml.field_b;
                  }
                } else {
                  return bg.field_b;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void h(int param0) {
        if (param0 != -8055) {
            field_n = -37;
            cg.field_l = null;
            bj.field_z = null;
            return;
        }
        cg.field_l = null;
        bj.field_z = null;
    }

    private final boolean b(byte param0, String param1) {
        String var4 = null;
        int var5 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        var7 = param1;
        if (param0 == 53) {
          var12 = ((nk) this).field_o.field_l.toLowerCase();
          var13 = param1.toLowerCase();
          if (-1 > (var12.length() ^ -1)) {
            if (0 < var13.length()) {
              var5 = var12.lastIndexOf("@");
              if (var5 >= 0) {
                if (var5 < var12.length() + -1) {
                  var14 = var12.substring(0, var5);
                  var15 = var12.substring(1 + var5);
                  if (0 > var13.indexOf(var14)) {
                    if (0 > var13.indexOf(var15)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_s = null;
          var8 = ((nk) this).field_o.field_l.toLowerCase();
          var9 = param1.toLowerCase();
          var4 = var9;
          if (-1 > (var8.length() ^ -1)) {
            if (0 < var9.length()) {
              var5 = var8.lastIndexOf("@");
              if (var5 >= 0) {
                if (var5 < var8.length() + -1) {
                  var10 = var8.substring(0, var5);
                  var11 = var8.substring(1 + var5);
                  var7 = var11;
                  if (0 > var9.indexOf(var10)) {
                    if (0 > var9.indexOf(var11)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static int a(int param0, dk param1) {
        int var2 = 0;
        if (param1 != null) {
          var2 = param1.field_f + param1.field_p / 2;
          if (param0 >= -83) {
            field_p = null;
            return var2 * 16384 / 640;
          } else {
            return var2 * 16384 / 640;
          }
        } else {
          return 8192;
        }
    }

    final rf a(int param0, String param1) {
        String var3 = ((nk) this).field_q.field_l.toLowerCase();
        String var4 = param1.toLowerCase();
        if (param0 == (var4.length() ^ -1)) {
            return ob.field_a;
        }
        if (!hd.a(var4, false, var3)) {
            return ob.field_a;
        }
        if (!(!this.b((byte) 53, param1))) {
            return ob.field_a;
        }
        return df.field_h;
    }

    final static int a(int param0, int param1) {
        if (qd.a(param1, -102)) {
          if (param0 != 1) {
            field_p = null;
            return bc.field_g[param1];
          } else {
            return bc.field_g[param1];
          }
        } else {
          return 1;
        }
    }

    public static void g(int param0) {
        field_p = null;
        if (param0 != 29779) {
            field_s = null;
            field_s = null;
            field_r = null;
            return;
        }
        field_s = null;
        field_r = null;
    }

    final static void b(int param0, int param1) {
        if (!(null == bk.field_r)) {
            bk.field_r.a(param0, 3748);
        }
        if (param1 > -121) {
            int discarded$0 = nk.a(-97, -50);
            return;
        }
    }

    nk(ul param0, ul param1, ul param2) {
        super(param0);
        ((nk) this).field_q = param1;
        ((nk) this).field_o = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "You are not currently logged in to the<nbsp>game.";
        field_s = "Show elapsed time: ";
    }
}
