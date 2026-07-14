/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends na {
    private dh field_e;
    static hr[] field_j;
    static ri field_i;
    static ck field_g;
    private dh field_h;
    static String field_f;

    final String a(int param0, String param1) {
        String var3 = null;
        String var4 = null;
        String var5 = null;
        var3 = ((tc) this).field_h.field_m.toLowerCase();
        var4 = param1.toLowerCase();
        if (param0 != var4.length()) {
          var5 = var4;
          if (!ao.a(var5, 30996)) {
            if (!me.a(false, var5)) {
              if (!hp.a(var5, true)) {
                if (!this.b(-53, param1)) {
                  if (var3.length() > 0) {
                    if (gt.a(var5, var3, 82)) {
                      return vr.field_F;
                    } else {
                      if (!jd.a(var5, (byte) 114, var3)) {
                        if (wv.a(false, var5, var3)) {
                          return vr.field_F;
                        } else {
                          return sg.field_k;
                        }
                      } else {
                        return mm.field_e;
                      }
                    }
                  } else {
                    return ka.field_a;
                  }
                } else {
                  return pc.field_a;
                }
              } else {
                return mc.field_J;
              }
            } else {
              return ur.field_X;
            }
          } else {
            return sg.field_k;
          }
        } else {
          return null;
        }
    }

    final gf a(byte param0, String param1) {
        String var3 = null;
        String var4 = null;
        var3 = ((tc) this).field_h.field_m.toLowerCase();
        var4 = param1.toLowerCase();
        if (var4.length() != 0) {
          if (!gg.a(var4, var3, -83)) {
            return qr.field_e;
          } else {
            if (!this.b(98, param1)) {
              if (param0 != 26) {
                field_j = null;
                return qe.field_a;
              } else {
                return qe.field_a;
              }
            } else {
              return qr.field_e;
            }
          }
        } else {
          return qr.field_e;
        }
    }

    private final boolean b(int param0, String param1) {
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        var9 = ((tc) this).field_e.field_m.toLowerCase();
        var4 = param1.toLowerCase();
        var5 = -109 % ((10 - param0) / 60);
        if (0 < var9.length()) {
          if (-1 > var4.length()) {
            var6 = var9.lastIndexOf("@");
            if (-1 <= var6) {
              if (var9.length() - 1 > var6) {
                var7 = var9.substring(0, var6);
                var8 = var9.substring(var6 - -1);
                if (-1 < (var4.indexOf(var7) ^ -1)) {
                  if ((var4.indexOf(var8) ^ -1) > -1) {
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

    final static void e(int param0) {
        ta.field_b = 0;
        qk.field_T = -1;
        bn.field_P = false;
        ei.field_a = 0;
        if (param0 < 85) {
          return;
        } else {
          cl.field_w = false;
          bi.field_c = 0;
          ew.field_e = 0;
          b.field_c = false;
          hl.field_e = false;
          vb.field_E = false;
          nq.field_i = 0;
          return;
        }
    }

    public static void f(int param0) {
        field_i = null;
        field_j = null;
        if (param0 != -1) {
            return;
        }
        field_g = null;
        field_f = null;
    }

    tc(dh param0, dh param1, dh param2) {
        super(param0);
        ((tc) this).field_e = param2;
        ((tc) this).field_h = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new ck();
    }
}
