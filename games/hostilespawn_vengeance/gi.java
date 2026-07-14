/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static String field_m;
    static bd field_f;
    private int[] field_k;
    private int field_e;
    private int field_g;
    static int[] field_l;
    static bd field_d;
    static String field_n;
    private int field_i;
    private int field_b;
    static gb field_h;
    private int[] field_a;
    static bd field_c;
    static bd field_j;

    private final void a(int param0) {
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
        var11 = HostileSpawn.field_I ? 1 : 0;
        var4 = -1640531527;
        var10 = -1640531527;
        var8 = -1640531527;
        var6 = -1640531527;
        var5 = -1640531527;
        var7 = -1640531527;
        var3 = -1640531527;
        var9 = -1640531527;
        if (param0 == -7) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= 4) {
              var2 = 0;
              L1: while (true) {
                if (-257 >= (var2 ^ -1)) {
                  var2 = 0;
                  L2: while (true) {
                    if (-257 >= (var2 ^ -1)) {
                      this.a((byte) 109);
                      ((gi) this).field_e = 256;
                      return;
                    } else {
                      var9 = var9 + ((gi) this).field_a[var2 - -6];
                      var6 = var6 + ((gi) this).field_a[var2 - -3];
                      var5 = var5 + ((gi) this).field_a[var2 + 2];
                      var4 = var4 + ((gi) this).field_a[1 + var2];
                      var8 = var8 + ((gi) this).field_a[var2 + 5];
                      var10 = var10 + ((gi) this).field_a[7 + var2];
                      var3 = var3 + ((gi) this).field_a[var2];
                      var7 = var7 + ((gi) this).field_a[var2 + 4];
                      var3 = var3 ^ var4 << 1611048331;
                      var4 = var4 + var5;
                      var6 = var6 + var3;
                      var4 = var4 ^ var5 >>> -388179806;
                      var7 = var7 + var4;
                      var5 = var5 + var6;
                      var5 = var5 ^ var6 << -117190776;
                      var6 = var6 + var7;
                      var8 = var8 + var5;
                      var6 = var6 ^ var7 >>> -1254553808;
                      var9 = var9 + var6;
                      var7 = var7 + var8;
                      var7 = var7 ^ var8 << 697156842;
                      var8 = var8 + var9;
                      var10 = var10 + var7;
                      var8 = var8 ^ var9 >>> -326482716;
                      var9 = var9 + var10;
                      var3 = var3 + var8;
                      var9 = var9 ^ var10 << 2061325096;
                      var10 = var10 + var3;
                      var4 = var4 + var9;
                      var10 = var10 ^ var3 >>> 651934249;
                      var5 = var5 + var10;
                      var3 = var3 + var4;
                      ((gi) this).field_a[var2] = var3;
                      ((gi) this).field_a[1 + var2] = var4;
                      ((gi) this).field_a[2 + var2] = var5;
                      ((gi) this).field_a[var2 + 3] = var6;
                      ((gi) this).field_a[var2 + 4] = var7;
                      ((gi) this).field_a[var2 - -5] = var8;
                      ((gi) this).field_a[var2 + 6] = var9;
                      ((gi) this).field_a[var2 - -7] = var10;
                      var2 += 8;
                      continue L2;
                    }
                  }
                } else {
                  var10 = var10 + ((gi) this).field_k[var2 + 7];
                  var8 = var8 + ((gi) this).field_k[var2 + 5];
                  var7 = var7 + ((gi) this).field_k[var2 + 4];
                  var9 = var9 + ((gi) this).field_k[var2 - -6];
                  var6 = var6 + ((gi) this).field_k[3 + var2];
                  var3 = var3 + ((gi) this).field_k[var2];
                  var5 = var5 + ((gi) this).field_k[2 + var2];
                  var4 = var4 + ((gi) this).field_k[1 + var2];
                  var3 = var3 ^ var4 << 20226699;
                  var6 = var6 + var3;
                  var4 = var4 + var5;
                  var4 = var4 ^ var5 >>> 161008386;
                  var7 = var7 + var4;
                  var5 = var5 + var6;
                  var5 = var5 ^ var6 << 1841231944;
                  var8 = var8 + var5;
                  var6 = var6 + var7;
                  var6 = var6 ^ var7 >>> 1800994256;
                  var9 = var9 + var6;
                  var7 = var7 + var8;
                  var7 = var7 ^ var8 << 74981802;
                  var10 = var10 + var7;
                  var8 = var8 + var9;
                  var8 = var8 ^ var9 >>> -333528860;
                  var3 = var3 + var8;
                  var9 = var9 + var10;
                  var9 = var9 ^ var10 << 1309331976;
                  var4 = var4 + var9;
                  var10 = var10 + var3;
                  var10 = var10 ^ var3 >>> -1806566135;
                  var5 = var5 + var10;
                  var3 = var3 + var4;
                  ((gi) this).field_a[var2] = var3;
                  ((gi) this).field_a[1 + var2] = var4;
                  ((gi) this).field_a[2 + var2] = var5;
                  ((gi) this).field_a[3 + var2] = var6;
                  ((gi) this).field_a[4 + var2] = var7;
                  ((gi) this).field_a[var2 + 5] = var8;
                  ((gi) this).field_a[6 + var2] = var9;
                  ((gi) this).field_a[7 + var2] = var10;
                  var2 += 8;
                  continue L1;
                }
              }
            } else {
              var3 = var3 ^ var4 << -671734453;
              var4 = var4 + var5;
              var6 = var6 + var3;
              var4 = var4 ^ var5 >>> -598066462;
              var5 = var5 + var6;
              var7 = var7 + var4;
              var5 = var5 ^ var6 << -903244728;
              var8 = var8 + var5;
              var6 = var6 + var7;
              var6 = var6 ^ var7 >>> 1376940528;
              var7 = var7 + var8;
              var9 = var9 + var6;
              var7 = var7 ^ var8 << -1288560598;
              var8 = var8 + var9;
              var10 = var10 + var7;
              var8 = var8 ^ var9 >>> 1981243172;
              var9 = var9 + var10;
              var3 = var3 + var8;
              var9 = var9 ^ var10 << 1676595784;
              var10 = var10 + var3;
              var4 = var4 + var9;
              var10 = var10 ^ var3 >>> -747852855;
              var3 = var3 + var4;
              var5 = var5 + var10;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static boolean b(byte param0) {
        int var1 = -87 % ((13 - param0) / 38);
        return li.field_o;
    }

    final int a(boolean param0) {
        if (!param0) {
            field_m = null;
        }
        if (0 == ((gi) this).field_e) {
            this.a((byte) 112);
            ((gi) this).field_e = 256;
        }
        ((gi) this).field_e = ((gi) this).field_e - 1;
        return ((gi) this).field_k[((gi) this).field_e - 1];
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (param0 >= 106) {
          ((gi) this).field_i = ((gi) this).field_i + 1;
          ((gi) this).field_b = ((gi) this).field_b + (((gi) this).field_i + 1);
          var2 = 0;
          L0: while (true) {
            if (var2 <= -257) {
              return;
            } else {
              L1: {
                var3 = ((gi) this).field_a[var2];
                if (0 != (2 & var2)) {
                  if (0 == (var2 & 1)) {
                    ((gi) this).field_g = ((gi) this).field_g ^ ((gi) this).field_g << 1227142626;
                    break L1;
                  } else {
                    ((gi) this).field_g = ((gi) this).field_g ^ ((gi) this).field_g >>> -964001712;
                    break L1;
                  }
                } else {
                  if (-1 != (var2 & 1)) {
                    ((gi) this).field_g = ((gi) this).field_g ^ ((gi) this).field_g >>> -2066651098;
                    break L1;
                  } else {
                    ((gi) this).field_g = ((gi) this).field_g ^ ((gi) this).field_g << 1488855821;
                    break L1;
                  }
                }
              }
              ((gi) this).field_g = ((gi) this).field_g + ((gi) this).field_a[255 & 128 + var2];
              var4 = ((gi) this).field_b + (((gi) this).field_g + ((gi) this).field_a[ua.a(1020, var3) >> -1778175774]);
              ((gi) this).field_a[var2] = ((gi) this).field_b + (((gi) this).field_g + ((gi) this).field_a[ua.a(1020, var3) >> -1778175774]);
              ((gi) this).field_b = ((gi) this).field_a[ua.a(var4 >> 2016286568, 1020) >> -1059419166] + var3;
              ((gi) this).field_k[var2] = ((gi) this).field_a[ua.a(var4 >> 2016286568, 1020) >> -1059419166] + var3;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    gi(int[] param0) {
        int var2 = 0;
        ((gi) this).field_a = new int[256];
        ((gi) this).field_k = new int[256];
        for (var2 = 0; var2 < param0.length; var2++) {
            ((gi) this).field_k[var2] = param0[var2];
        }
        this.a(-7);
    }

    public static void b(boolean param0) {
        field_f = null;
        field_j = null;
        if (!param0) {
            field_j = null;
        }
        field_n = null;
        field_h = null;
        field_m = null;
        field_l = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Pistol";
        field_n = "Close";
        field_l = new int[8192];
    }
}
