/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends qc {
    static String field_r;
    static int field_n;
    private ne field_p;
    private int field_s;
    static gk field_l;
    static String field_q;
    static dm field_k;
    static boolean[] field_o;
    static int field_m;

    final void c(int param0, int param1, byte[] param2, int param3) {
        int var6 = 0;
        int var7 = Geoblox.field_C;
        int var5 = 31 % ((param0 - -36) / 37);
        for (var6 = 0; var6 < param3; var6++) {
            ((pk) this).field_f = ((pk) this).field_f + 1;
            param2[var6 + param1] = (byte)(((pk) this).field_j[((pk) this).field_f] + -((pk) this).field_p.b(0));
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = param2 >>> 2037282111;
        if (param1 != -6) {
            pk.k((byte) 101);
        }
        return -var3 + (param2 + var3) / param0;
    }

    final static void k(byte param0) {
        da.field_a = 0;
        if (param0 != -13) {
            int discarded$0 = pk.a(106, (byte) 22, 96);
        }
    }

    final void a(int[] param0, boolean param1) {
        ((pk) this).field_p = new ne(param0);
        if (param1) {
            ((pk) this).i(-68);
        }
    }

    final void k(int param0) {
        ((pk) this).field_s = param0 * ((pk) this).field_f;
    }

    pk(byte[] param0) {
        super(param0);
    }

    final static void h(int param0, int param1) {
        int var2 = 0;
        gd var3 = null;
        int var4 = 0;
        var2 = 0;
        if (param0 < -117) {
          L0: while (true) {
            if (33 <= var2) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (var4 >= 33) {
                  p.field_i = null;
                  return;
                } else {
                  if (!vg.field_j[var4]) {
                    return;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (param1 == ck.field_c[var2]) {
                if (!vg.field_j[var2]) {
                  L2: {
                    L3: {
                      if (10 > var2) {
                        break L3;
                      } else {
                        if (26 >= var2) {
                          var3 = te.field_c.c(-1879044097, w.field_b[var2]);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var3 = te.field_c.b(1, w.field_b[var2]);
                    break L2;
                  }
                  fl.field_c[var2] = var3.a(p.field_i);
                  vg.field_j[var2] = true;
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void j(int param0) {
        field_o = null;
        field_k = null;
        if (param0 != 0) {
            field_r = null;
        }
        field_r = null;
        field_q = null;
        field_l = null;
    }

    final int e(byte param0, int param1) {
        int var6 = Geoblox.field_C;
        int var3 = ((pk) this).field_s >> 2101762179;
        if (param0 != -17) {
            return -69;
        }
        int var4 = 8 + -(7 & ((pk) this).field_s);
        int var5 = 0;
        ((pk) this).field_s = ((pk) this).field_s + param1;
        while (var4 < param1) {
            var3++;
            var5 = var5 + ((((pk) this).field_j[var3] & kj.field_G[var4]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 == var4) {
            var5 = var5 + (((pk) this).field_j[var3] & kj.field_G[var4]);
        } else {
            var5 = var5 + (((pk) this).field_j[var3] >> var4 - param1 & kj.field_G[param1]);
        }
        return var5;
    }

    final void a(int param0, byte param1) {
        ((pk) this).field_f = ((pk) this).field_f + 1;
        ((pk) this).field_j[((pk) this).field_f] = (byte)(param0 + ((pk) this).field_p.b(0));
        if (param1 >= -12) {
            pk.h(-6, -80);
        }
    }

    final void i(int param0) {
        ((pk) this).field_f = (7 + ((pk) this).field_s) / 8;
        if (param0 != -16989) {
            ((pk) this).field_p = null;
        }
    }

    final int j(byte param0) {
        if (param0 != 122) {
            ((pk) this).k(-51);
        }
        ((pk) this).field_f = ((pk) this).field_f + 1;
        return 255 & ((pk) this).field_j[((pk) this).field_f] + -((pk) this).field_p.b(0);
    }

    pk(int param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "   ";
        field_q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_m = 15;
        field_o = new boolean[1000];
    }
}
