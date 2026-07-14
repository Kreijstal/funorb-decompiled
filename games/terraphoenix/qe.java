/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static volatile int field_l;
    static ci field_k;
    static String field_h;
    private int field_b;
    private int[] field_a;
    static String field_g;
    static og field_f;
    private int field_d;
    static String field_j;
    private int field_e;
    private int field_c;
    private int[] field_i;

    public static void a(boolean param0) {
        field_f = null;
        field_h = null;
        field_k = null;
        if (!param0) {
            Object var2 = null;
            qe.a(-54, (fa) null);
        }
        field_g = null;
        field_j = null;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        ((qe) this).field_c = ((qe) this).field_c + 1;
        ((qe) this).field_e = ((qe) this).field_e + (((qe) this).field_c + 1);
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            L1: {
              if (param0 == -38) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            return;
          } else {
            L2: {
              var3 = ((qe) this).field_a[var2];
              if ((2 & var2) != 0) {
                if (0 != (var2 & 1)) {
                  ((qe) this).field_b = ((qe) this).field_b ^ ((qe) this).field_b >>> 1332198768;
                  break L2;
                } else {
                  ((qe) this).field_b = ((qe) this).field_b ^ ((qe) this).field_b << 1760828226;
                  break L2;
                }
              } else {
                if ((var2 & 1) == 0) {
                  ((qe) this).field_b = ((qe) this).field_b ^ ((qe) this).field_b << 1080141645;
                  break L2;
                } else {
                  ((qe) this).field_b = ((qe) this).field_b ^ ((qe) this).field_b >>> 1284776614;
                  break L2;
                }
              }
            }
            ((qe) this).field_b = ((qe) this).field_b + ((qe) this).field_a[128 + var2 & 255];
            var4 = ((qe) this).field_e + (((qe) this).field_a[dg.a(var3, 1020) >> 870073890] - -((qe) this).field_b);
            ((qe) this).field_a[var2] = ((qe) this).field_e + (((qe) this).field_a[dg.a(var3, 1020) >> 870073890] - -((qe) this).field_b);
            ((qe) this).field_e = ((qe) this).field_a[dg.a(var4, 261306) >> -475825944 >> -1282238686] + var3;
            ((qe) this).field_i[var2] = ((qe) this).field_a[dg.a(var4, 261306) >> -475825944 >> -1282238686] + var3;
            var2++;
            continue L0;
          }
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Terraphoenix.field_V;
          if (param0 == -1) {
            break L0;
          } else {
            ((qe) this).field_i = null;
            break L0;
          }
        }
        var6 = -1640531527;
        var3 = -1640531527;
        var8 = -1640531527;
        var4 = -1640531527;
        var9 = -1640531527;
        var10 = -1640531527;
        var5 = -1640531527;
        var7 = -1640531527;
        var2 = 0;
        L1: while (true) {
          if (-5 >= (var2 ^ -1)) {
            var2 = 0;
            L2: while (true) {
              if (256 <= var2) {
                var2 = 0;
                L3: while (true) {
                  if (-257 >= (var2 ^ -1)) {
                    this.a((byte) -38);
                    ((qe) this).field_d = 256;
                    return;
                  } else {
                    var9 = var9 + ((qe) this).field_a[var2 - -6];
                    var4 = var4 + ((qe) this).field_a[1 + var2];
                    var8 = var8 + ((qe) this).field_a[5 + var2];
                    var5 = var5 + ((qe) this).field_a[var2 - -2];
                    var3 = var3 + ((qe) this).field_a[var2];
                    var6 = var6 + ((qe) this).field_a[3 + var2];
                    var10 = var10 + ((qe) this).field_a[var2 - -7];
                    var7 = var7 + ((qe) this).field_a[var2 + 4];
                    var3 = var3 ^ var4 << -1012803669;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 1535899970;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -1322237176;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 673664144;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -1802057046;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> 1325804740;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 2129165640;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -509153303;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((qe) this).field_a[var2] = var3;
                    ((qe) this).field_a[1 + var2] = var4;
                    ((qe) this).field_a[var2 + 2] = var5;
                    ((qe) this).field_a[var2 - -3] = var6;
                    ((qe) this).field_a[var2 - -4] = var7;
                    ((qe) this).field_a[var2 - -5] = var8;
                    ((qe) this).field_a[6 + var2] = var9;
                    ((qe) this).field_a[var2 + 7] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var6 = var6 + ((qe) this).field_i[var2 - -3];
                var7 = var7 + ((qe) this).field_i[4 + var2];
                var4 = var4 + ((qe) this).field_i[var2 - -1];
                var5 = var5 + ((qe) this).field_i[var2 - -2];
                var9 = var9 + ((qe) this).field_i[var2 - -6];
                var8 = var8 + ((qe) this).field_i[5 + var2];
                var10 = var10 + ((qe) this).field_i[var2 - -7];
                var3 = var3 + ((qe) this).field_i[var2];
                var3 = var3 ^ var4 << 1399989995;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 1740077090;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << -1516401208;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> -1942710064;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << -168808598;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 1575054148;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << -122292024;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> -1118520343;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((qe) this).field_a[var2] = var3;
                ((qe) this).field_a[1 + var2] = var4;
                ((qe) this).field_a[2 + var2] = var5;
                ((qe) this).field_a[3 + var2] = var6;
                ((qe) this).field_a[4 + var2] = var7;
                ((qe) this).field_a[var2 - -5] = var8;
                ((qe) this).field_a[6 + var2] = var9;
                ((qe) this).field_a[var2 - -7] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << 1415239723;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -917396510;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -234794520;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 1605636368;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -178099446;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 1841850660;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 1627527784;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -1980907415;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L1;
          }
        }
    }

    final int a(int param0) {
        if (param0 < 64) {
            ((qe) this).field_e = -7;
        }
        if (-1 == (((qe) this).field_d ^ -1)) {
            this.a((byte) -38);
            ((qe) this).field_d = 256;
        }
        ((qe) this).field_d = ((qe) this).field_d - 1;
        return ((qe) this).field_i[((qe) this).field_d - 1];
    }

    final static void a(int param0, fa param1) {
        int var3 = 0;
        int var4 = 0;
        ee var5 = null;
        int[] var6 = null;
        int var7 = 0;
        uc var8 = null;
        int var9 = 0;
        uc var10 = null;
        var7 = Terraphoenix.field_V;
        var8 = new uc(param1.a("logo.fo3d", "", -21653));
        var10 = var8;
        var3 = var10.a(-16384);
        var10.k(-1694261224);
        qk.field_l = ig.a(-25831, var10);
        cm.field_b = new ee[var3];
        vh.field_j = new int[var3][];
        if (param0 == -28664) {
          var4 = 0;
          L0: while (true) {
            if (var3 <= var4) {
              var10.n(8);
              var9 = 0;
              var4 = var9;
              L1: while (true) {
                if (var9 >= var3) {
                  return;
                } else {
                  var5 = cm.field_b[var9];
                  var5.a(true, 6, 6, 1, 6);
                  var5.c((byte) 41);
                  var6 = new int[]{var5.field_K + var5.field_r >> 313848161, var5.field_a + var5.field_M >> 1312590529, var5.field_t + var5.field_v >> 1689125985};
                  vh.field_j[var9] = var6;
                  var5.a(true, -var6[2], -var6[0], -var6[1]);
                  var9++;
                  continue L1;
                }
              }
            } else {
              cm.field_b[var4] = fc.a(11043, var8);
              var4++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    qe(int[] param0) {
        int var2 = 0;
        ((qe) this).field_i = new int[256];
        ((qe) this).field_a = new int[256];
        for (var2 = 0; param0.length > var2; var2++) {
            ((qe) this).field_i[var2] = param0[var2];
        }
        this.b(-1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Grunt with shielded armour";
        field_h = "Unpacking graphics";
        field_l = 0;
        field_j = "KPA-B";
    }
}
