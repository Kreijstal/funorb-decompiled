/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn extends no {
    static jp field_w;
    static mh field_A;
    static String field_H;
    int field_I;
    static java.math.BigInteger field_F;
    static jp[] field_G;
    private int field_z;
    static jp[] field_K;
    hp field_E;
    int field_v;
    static String field_x;
    int field_C;
    int field_J;
    static jp field_D;
    int field_B;
    hp field_y;

    private vn(int param0, int param1) {
        super(0, 0, 0, 0, 1536, 0);
        ((vn) this).field_E = new hp(50);
        ((vn) this).field_y = new hp(50);
        ((vn) this).field_z = param0;
        ((vn) this).a(((vn) this).field_z, param1, 116);
    }

    final static th a(int param0, byte param1) {
        th[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        th[] var5 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param1 > 4) {
          var5 = lq.b(0);
          var2 = var5;
          var3 = 0;
          L0: while (true) {
            if (var5.length > var3) {
              if (param0 == var5[var3].field_e) {
                return var5[var3];
              } else {
                var3++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          field_A = null;
          var5 = lq.b(0);
          var2 = var5;
          var3 = 0;
          L1: while (true) {
            if (var5.length > var3) {
              if (param0 == var5[var3].field_e) {
                return var5[var3];
              } else {
                var3++;
                continue L1;
              }
            } else {
              return null;
            }
          }
        }
    }

    final void a(vo param0, int param1) {
        ((vn) this).field_j = -1536 + (param0.field_j - -(param0.field_u >> -18750591));
        ((vn) this).field_m = param0.field_m - 3072;
        ((vn) this).field_j = ((vn) this).field_j + param0.field_u * ((vn) this).field_z / 3072;
        if (param1 != 0) {
            ((vn) this).field_E = null;
        }
    }

    vn(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, 1536, 0);
        ((vn) this).field_E = new hp(50);
        ((vn) this).field_y = new hp(50);
    }

    final static int[] d(int param0) {
        if (param0 != 8) {
            int[] discarded$0 = vn.d(-23);
            return new int[8];
        }
        return new int[8];
    }

    public static void c(int param0) {
        field_F = null;
        field_w = null;
        field_G = null;
        field_x = null;
        field_A = null;
        field_H = null;
        field_D = null;
        if (param0 < 91) {
          field_F = null;
          field_K = null;
          return;
        } else {
          field_K = null;
          return;
        }
    }

    vn() {
        this(0, 0, 0, 0);
    }

    final void a(int param0, int param1, int param2) {
        ((vn) this).field_k = (sa.a(param0, -4097) >> 242281128) * param1 >> -1038315544;
        if (param2 < 95) {
          return;
        } else {
          ((vn) this).field_o = (BrickABrac.c(2048, param0) >> -1458366744) * -param1 >> -488783160;
          return;
        }
    }

    vn(vo param0, int param1, int param2) {
        this(param1, param2);
        ((vn) this).a(param0, 0);
    }

    final void a(int param0, wq param1) {
        super.a(107, param1);
        ((vn) this).field_C = param1.e(255);
        if (param0 < 89) {
          return;
        } else {
          ((vn) this).field_v = param1.i(65280);
          ((vn) this).field_J = param1.a(126);
          ((vn) this).field_z = param1.a(126);
          ((vn) this).field_I = param1.c((byte) -82);
          return;
        }
    }

    final int a(int param0, StringBuilder param1) {
        int var3 = 0;
        L0: {
          if (param0 > 79) {
            break L0;
          } else {
            ((vn) this).c(-49, 14);
            break L0;
          }
        }
        L1: {
          var3 = -19088744 ^ super.a(93, param1);
          if (param1 != null) {
            StringBuilder discarded$3 = param1.append("base checksum for ball: " + Integer.toString(var3, 16) + "\n");
            StringBuilder discarded$4 = param1.append(((vn) this).field_j + " " + ((vn) this).field_m + " " + ((vn) this).field_k + " " + ((vn) this).field_o + " " + " " + ((vn) this).field_i + " " + ((vn) this).field_l + "\n");
            StringBuilder discarded$5 = param1.append("Ball Info: " + ((vn) this).field_v + " " + ((vn) this).field_J + " " + ((vn) this).field_C + " " + ((vn) this).field_z + "\n");
            break L1;
          } else {
            break L1;
          }
        }
        var3 = var3 ^ ((vn) this).field_v * 83 - -119 << -1317846292;
        var3 = var3 ^ 57 + ((vn) this).field_J * 13 << 486007954;
        var3 = var3 ^ 6483 + ((vn) this).field_C * 53 << -44569309;
        var3 = var3 ^ ((vn) this).field_z * 5 - -289 << -1889170363;
        return var3;
    }

    final void b(int param0, int param1) {
        ((vn) this).field_J = ((vn) this).field_J + param1;
        ((vn) this).field_v = 0;
        if (param0 > -27) {
            ((vn) this).a(119, 71, 24);
        }
    }

    final void c(int param0, int param1) {
        int var3 = kj.a(((vn) this).field_k * ((vn) this).field_k + ((vn) this).field_o * ((vn) this).field_o, 2) >> -830999512;
        int var4 = param1 + var3;
        if (var4 < param0) {
            var4 = 512;
        }
        if (!(var4 <= 3840)) {
            var4 = 3840;
        }
        ((vn) this).field_k = ((vn) this).field_k * var4 / var3;
        ((vn) this).field_o = var4 * ((vn) this).field_o / var3;
    }

    final void a(byte param0, int param1) {
        if (param0 != 40) {
          field_K = null;
          ((vn) this).field_v = ((vn) this).field_v + param1;
          ((vn) this).field_J = 0;
          return;
        } else {
          ((vn) this).field_v = ((vn) this).field_v + param1;
          ((vn) this).field_J = 0;
          return;
        }
    }

    final void a(int param0, int param1) {
        ((vn) this).a(param1, kj.a(((vn) this).field_o * ((vn) this).field_o + ((vn) this).field_k * ((vn) this).field_k, 2) >> -1796864920, 107);
        if (param0 != 6546) {
            ((vn) this).field_v = -29;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Unpacking levels";
        field_H = "To server list";
        field_F = new java.math.BigInteger("65537");
    }
}
