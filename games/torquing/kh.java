/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends q {
    static int[] field_p;
    pj field_k;
    static int[] field_m;
    static gd field_o;
    mp field_q;
    static t field_r;
    static String[] field_n;
    static String field_j;
    rm field_l;

    final static void a(kh param0, byte param1) {
        int var3 = 0;
        mp var4 = null;
        rm var5 = null;
        L0: {
          var5 = param0.field_l;
          if (var5.field_M.length > var5.field_f) {
            var3 = var5.field_f;
            var5.field_M = u.a(32681, var5.field_M, var3);
            var5.field_B = u.a(32681, var5.field_B, var3);
            var5.field_E = u.a(32681, var5.field_E, var3);
            break L0;
          } else {
            break L0;
          }
        }
        if (var5.field_g < var5.field_o.length) {
          L1: {
            var3 = var5.field_g;
            var5.field_o = u.a(32681, var5.field_o, var3);
            var5.field_y = u.a(32681, var5.field_y, var3);
            var5.field_q = u.a(32681, var5.field_q, var3);
            var5.field_j = mn.a(-6058, var5.field_j, 0, var3);
            if (null != var5.field_D) {
              var5.field_D = cc.a(var3, (byte) 127, var5.field_D);
              break L1;
            } else {
              break L1;
            }
          }
          var5.field_m = qi.a(var3, var5.field_m, (byte) 60);
          var4 = param0.field_q;
          if (null == var4.field_u) {
            L2: {
              if (null == var5.field_u) {
                break L2;
              } else {
                if (var5.field_u.length <= var5.field_k) {
                  break L2;
                } else {
                  var3 = var5.field_k;
                  var5.field_s = cc.a(var3, (byte) 23, var5.field_s);
                  var5.field_u = qi.a(var3, var5.field_u, (byte) 60);
                  var5.field_n = qi.a(var3, var5.field_n, (byte) 60);
                  var5.field_x = qi.a(var3, var5.field_x, (byte) 60);
                  break L2;
                }
              }
            }
            if (param1 >= -55) {
              kh.a(-88);
              return;
            } else {
              return;
            }
          } else {
            L3: {
              var4.field_u = mn.a(-6058, var4.field_u, 255, var3);
              if (null == var5.field_u) {
                break L3;
              } else {
                if (var5.field_u.length <= var5.field_k) {
                  break L3;
                } else {
                  var3 = var5.field_k;
                  var5.field_s = cc.a(var3, (byte) 23, var5.field_s);
                  var5.field_u = qi.a(var3, var5.field_u, (byte) 60);
                  var5.field_n = qi.a(var3, var5.field_n, (byte) 60);
                  var5.field_x = qi.a(var3, var5.field_x, (byte) 60);
                  break L3;
                }
              }
            }
            if (param1 < -55) {
              return;
            } else {
              kh.a(-88);
              return;
            }
          }
        } else {
          L4: {
            if (null == var5.field_u) {
              break L4;
            } else {
              if (var5.field_u.length <= var5.field_k) {
                break L4;
              } else {
                var3 = var5.field_k;
                var5.field_s = cc.a(var3, (byte) 23, var5.field_s);
                var5.field_u = qi.a(var3, var5.field_u, (byte) 60);
                var5.field_n = qi.a(var3, var5.field_n, (byte) 60);
                var5.field_x = qi.a(var3, var5.field_x, (byte) 60);
                break L4;
              }
            }
          }
          if (param1 < -55) {
            return;
          } else {
            kh.a(-88);
            return;
          }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 24997) {
          var2 = null;
          kh.a((kh) null, (byte) -125);
          field_n = null;
          field_j = null;
          field_p = null;
          field_r = null;
          field_m = null;
          field_o = null;
          return;
        } else {
          field_n = null;
          field_j = null;
          field_p = null;
          field_r = null;
          field_m = null;
          field_o = null;
          return;
        }
    }

    public kh() {
        ((kh) this).field_k = null;
        ((kh) this).field_l = null;
        ((kh) this).field_q = null;
    }

    kh(rm param0) {
        ((kh) this).field_k = null;
        ((kh) this).field_l = param0;
        ((kh) this).field_q = new mp();
    }

    kh(kh param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        ((kh) this).field_l = new rm(param0.field_l, param1, param2, param3, param4);
        ((kh) this).field_k = null;
        ((kh) this).field_q = new mp();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[8192];
        field_p = new int[25];
        dk.a(field_p, 0, 25, -1);
        field_p[9] = 1;
        field_p[8] = 0;
        field_j = "Connection restored.";
    }
}
