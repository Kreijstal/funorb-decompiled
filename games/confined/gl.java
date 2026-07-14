/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends mf {
    static mi field_j;
    static String field_k;
    private ul field_l;
    static double field_m;
    static double field_i;
    private ul field_h;

    gl(ul param0, ul param1, ul param2) {
        super(param0);
        ((gl) this).field_h = param1;
        ((gl) this).field_l = param2;
    }

    public static void c(byte param0) {
        field_k = null;
        if (param0 >= -1) {
            return;
        }
        field_j = null;
    }

    final fi a(byte param0, String param1) {
        String var3 = null;
        String var4 = null;
        var3 = ((gl) this).field_h.field_B.toLowerCase();
        var4 = param1.toLowerCase();
        if (param0 <= -44) {
          if (-1 != (var4.length() ^ -1)) {
            if (!wd.a(0, var3, var4)) {
              return fb.field_e;
            } else {
              if (this.a(param1, (byte) -69)) {
                return fb.field_e;
              } else {
                return nn.field_q;
              }
            }
          } else {
            return fb.field_e;
          }
        } else {
          field_i = 1.1993332607782194;
          if (-1 != (var4.length() ^ -1)) {
            if (!wd.a(0, var3, var4)) {
              return fb.field_e;
            } else {
              if (this.a(param1, (byte) -69)) {
                return fb.field_e;
              } else {
                return nn.field_q;
              }
            }
          } else {
            return fb.field_e;
          }
        }
    }

    private final boolean a(String param0, byte param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        var3 = ((gl) this).field_l.field_B.toLowerCase();
        var4 = param0.toLowerCase();
        var5 = -119 % ((30 - param1) / 41);
        if (0 < var3.length()) {
          if (0 < var4.length()) {
            var6 = var3.lastIndexOf("@");
            if (0 <= var6) {
              if (-1 + var3.length() > var6) {
                var7 = var3.substring(0, var6);
                var8 = var3.substring(var6 + 1);
                if ((var4.indexOf(var7) ^ -1) <= -1) {
                  return true;
                } else {
                  if ((var4.indexOf(var8) ^ -1) <= -1) {
                    return true;
                  } else {
                    return false;
                  }
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

    final String a(String param0, boolean param1) {
        String var6 = ((gl) this).field_h.field_B.toLowerCase();
        String var4 = param0.toLowerCase();
        if (var4.length() == 0) {
            return null;
        }
        String var5 = var4;
        if (!(!ef.a(101, var5))) {
            return vm.field_bb;
        }
        if (!(!lc.a(param1, var5))) {
            return oe.field_T;
        }
        if (wc.a(var5, -81)) {
            return mk.field_m;
        }
        if (!(!this.a(param0, (byte) 124))) {
            return mg.field_f;
        }
        if (-1 <= (var6.length() ^ -1)) {
            return si.field_f;
        }
        if (!(!nm.a(var6, (byte) 96, var5))) {
            return fg.field_pb;
        }
        if (!(!qd.a(var6, var5, false))) {
            return wh.field_eb;
        }
        if (!(!ig.a(var6, 0, var5))) {
            return fg.field_pb;
        }
        return vm.field_bb;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0.0;
    }
}
