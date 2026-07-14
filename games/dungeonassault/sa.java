/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    private int field_m;
    static cf[] field_v;
    private int field_d;
    private int field_s;
    static String field_h;
    private int field_q;
    private int field_j;
    int field_k;
    private cn field_a;
    private int field_p;
    static String field_w;
    private cn field_u;
    static hd field_x;
    private cn field_g;
    private cn field_c;
    int field_b;
    private int field_l;
    static int field_f;
    private int field_o;
    static String field_t;
    private cn field_r;
    private int field_n;
    private int field_i;
    int field_y;
    static String field_e;

    final void a(cn param0, int param1, boolean param2, int param3, int param4) {
        ((sa) this).field_i = ((sa) this).field_l;
        ((sa) this).field_n = ((sa) this).field_p;
        int var6 = 14 % ((58 - param3) / 52);
        ((sa) this).field_a = ((sa) this).field_r;
        ((sa) this).field_c = ((sa) this).field_u;
        ((sa) this).field_p = param1;
        ((sa) this).field_l = param4;
        if (param2) {
            ((sa) this).field_q = param4;
            ((sa) this).field_g = param0;
            ((sa) this).field_d = param1;
        } else {
            ((sa) this).field_s = 32;
        }
        ((sa) this).field_u = param0;
        ((sa) this).field_r = new cn(((sa) this).field_u.field_y - -4, 4 + ((sa) this).field_u.field_v);
        jh.a(((sa) this).field_r);
        ((sa) this).field_u.e(2, 2, 12690143);
        gf.d(2, 2, 0, 0, ((sa) this).field_r.field_y, ((sa) this).field_r.field_v);
        jh.b();
        cn var7 = ((sa) this).field_r;
        ((sa) this).field_r.field_A = -2;
        var7.field_w = -2;
        ((sa) this).field_o = 384;
    }

    public static void b(boolean param0) {
        field_x = null;
        if (param0) {
            field_x = null;
        }
        field_h = null;
        field_e = null;
        field_t = null;
        field_v = null;
        field_w = null;
    }

    private final void a(int param0) {
        if (param0 != 384) {
            Object var3 = null;
            ((sa) this).a(33, false, (cn) null);
        }
        ((sa) this).a(((sa) this).field_g, ((sa) this).field_d, true, -89, ((sa) this).field_q);
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = DungeonAssault.field_K;
          var2 = (-((sa) this).field_u.field_y + ((sa) this).field_b >> -560946047) + ((sa) this).field_m;
          var3 = ((sa) this).field_j - -((sa) this).field_l;
          if (0 == ((sa) this).field_o) {
            this.a(var2, var3, ((sa) this).field_u, (byte) -66);
            break L0;
          } else {
            if (-257 <= (((sa) this).field_o ^ -1)) {
              if (-129 <= (((sa) this).field_o ^ -1)) {
                this.a(var3, (byte) -28, var2, ((sa) this).field_o << -67262879, ((sa) this).field_r);
                this.a(var3, (byte) 105, var2, 128 + -((sa) this).field_o << -1798849823, ((sa) this).field_u);
                break L0;
              } else {
                L1: {
                  if (((sa) this).field_c != null) {
                    var4 = ((sa) this).field_m + (((sa) this).field_b + -((sa) this).field_c.field_y >> 614008129);
                    var5 = ((sa) this).field_i + ((sa) this).field_j;
                    this.a(var5, (byte) 62, var4, ((sa) this).field_o + -128 << 1971957921, ((sa) this).field_a);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.a(var3, (byte) 107, var2, -((sa) this).field_o + 256 << -564415327, ((sa) this).field_r);
                break L0;
              }
            } else {
              if (null != ((sa) this).field_c) {
                var4 = ((sa) this).field_m - -(((sa) this).field_b + -((sa) this).field_c.field_y >> -626131487);
                var5 = ((sa) this).field_i + ((sa) this).field_j;
                this.a(var5, (byte) 80, var4, -256 + ((sa) this).field_o << -598188063, ((sa) this).field_c);
                this.a(var5, (byte) -35, var4, -((sa) this).field_o + 384 << -1472228799, ((sa) this).field_a);
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L2: {
          if (param0 < -20) {
            break L2;
          } else {
            field_h = null;
            break L2;
          }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, cn param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = DungeonAssault.field_K;
        int[] var17 = new int[4];
        int[] var15 = var17;
        int[] var13 = var15;
        int[] var11 = var13;
        int[] var10 = var11;
        int[] var18 = var10;
        gf.a(var17);
        for (var7 = 1; var7 < ((sa) this).field_k; var7++) {
            var8 = var7 * param3 / ((sa) this).field_k;
            gf.e(((sa) this).field_m, var7 + ((sa) this).field_j, ((sa) this).field_m + ((sa) this).field_b, 1 + (((sa) this).field_j - -var7));
            param4.b(param2, param0, var8);
            gf.e(((sa) this).field_m, ((sa) this).field_y + (((sa) this).field_j + -1) - var7, ((sa) this).field_b + ((sa) this).field_m, -var7 + (((sa) this).field_j + ((sa) this).field_y));
            param4.b(param2, param0, var8);
        }
        var8 = -112 / ((param1 - 27) / 32);
        gf.e(((sa) this).field_m, ((sa) this).field_k + ((sa) this).field_j, ((sa) this).field_m + ((sa) this).field_b, ((sa) this).field_j + ((sa) this).field_y - ((sa) this).field_k);
        param4.b(param2, param0, param3);
        gf.b(var18);
    }

    private final void a(int param0, int param1, cn param2, byte param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = DungeonAssault.field_K;
        int[] var16 = new int[4];
        int[] var14 = var16;
        int[] var12 = var14;
        int[] var10 = var12;
        int[] var9 = var10;
        int[] var17 = var9;
        gf.a(var16);
        for (var6 = 1; ((sa) this).field_k > var6; var6++) {
            var7 = (var6 << -1360389272) / ((sa) this).field_k;
            gf.e(((sa) this).field_m, ((sa) this).field_j + var6, ((sa) this).field_m - -((sa) this).field_b, var6 + (((sa) this).field_j - -1));
            param2.d(param0, param1, var7);
            gf.e(((sa) this).field_m, -var6 + (-1 + (((sa) this).field_y + ((sa) this).field_j)), ((sa) this).field_b + ((sa) this).field_m, ((sa) this).field_y + ((sa) this).field_j + -var6);
            param2.d(param0, param1, var7);
        }
        var6 = -73 / ((param3 - -20) / 35);
        gf.e(((sa) this).field_m, ((sa) this).field_j - -((sa) this).field_k, ((sa) this).field_b + ((sa) this).field_m, ((sa) this).field_j + (((sa) this).field_y - ((sa) this).field_k));
        param2.h(param0, param1);
        gf.b(var17);
    }

    final void a(int param0, boolean param1, cn param2) {
        ((sa) this).a(param2, 0, param1, 118, ((sa) this).field_y + -param2.field_v >> 1333733377);
        if (param0 != 1929) {
            ((sa) this).a(false);
        }
    }

    final void a(boolean param0, String param1, byte param2, String param3, int param4) {
        int var13 = 0;
        String var14 = null;
        int var15 = DungeonAssault.field_K;
        jh.c();
        int var6 = -40 + ((sa) this).field_b;
        String[] var7 = jn.a(param3, new int[1], -121, (se) (Object) la.field_b);
        int var8 = var7.length;
        int var9 = la.field_b.field_E + var8 * la.field_b.field_H;
        if (param1 != null) {
            var9 = var9 + 2 * la.field_b.field_H;
        }
        int var10 = la.field_b.field_H;
        cn var11 = new cn(var6, var9);
        var11.e();
        if (!(param1 == null)) {
            db.field_v.c(param1, var6 >> 1249815009, var10, param4, -1);
            var10 = var10 + 2 * la.field_b.field_H;
        }
        String[] var12 = var7;
        for (var13 = 0; var13 < var12.length; var13++) {
            var14 = var12[var13];
            la.field_b.c(var14, var6 >> 1149971201, var10, param4, -1);
            var10 = var10 + la.field_b.field_H;
        }
        jh.b();
        ((sa) this).a(1929, param0, var11);
        if (param2 != 91) {
            Object var16 = null;
            sa.a((byte) -10, -54, -25, -114, (int[]) null);
        }
    }

    final void a(boolean param0) {
        L0: {
          ((sa) this).field_o = ((sa) this).field_o - 12;
          if (-1 < (((sa) this).field_o ^ -1)) {
            ((sa) this).field_o = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((mo.field_a & 3) == 0) {
            L2: {
              if (((sa) this).field_o == 0) {
                ((sa) this).field_p = ((sa) this).field_p - 1;
                if (((sa) this).field_p - 1 >= 0) {
                  ((sa) this).field_l = ((sa) this).field_l - 1;
                  if (-17 != ((sa) this).field_p) {
                    break L2;
                  } else {
                    this.a(384);
                    break L2;
                  }
                } else {
                  if (((sa) this).field_g == ((sa) this).field_u) {
                    break L2;
                  } else {
                    ((sa) this).field_s = ((sa) this).field_s - 1;
                    if (-1 <= ((sa) this).field_s - 1) {
                      this.a(384);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            ((sa) this).field_n = ((sa) this).field_n - 1;
            if ((((sa) this).field_n - 1 ^ -1) <= -1) {
              ((sa) this).field_i = ((sa) this).field_i - 1;
              break L1;
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        L3: {
          if (!param0) {
            break L3;
          } else {
            ((sa) this).a(true);
            break L3;
          }
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int[] param4) {
        int[] var10 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = DungeonAssault.field_K;
        while (true) {
            param1--;
            if ((param1 ^ -1) > -1) {
                break;
            }
            var10 = param4;
            int[] var5 = var10;
            var6 = param2;
            var7 = param3;
            var10[var6] = var7 + (nb.a(var10[var6], 16711422) >> -1762978335);
            param2++;
        }
        if (param0 != 45) {
            Object var9 = null;
            sa.a((byte) 65, 42, 56, 44, (int[]) null);
        }
    }

    sa(int param0, int param1, int param2, int param3) {
        ((sa) this).field_k = 16;
        ((sa) this).field_b = param2;
        ((sa) this).field_y = param3;
        ((sa) this).field_j = param1;
        ((sa) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Updates will sent to the email address you've given";
        field_w = "Loading graphics";
        field_e = "REVIVE";
    }
}
