/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    private int field_i;
    private int field_b;
    static String field_l;
    private int field_j;
    static String field_f;
    private int[] field_g;
    private int field_a;
    private int[] field_e;
    static String field_h;
    static dc field_k;
    static eh field_c;
    static int[][] field_d;

    final static void a(byte param0, int param1, int param2, int param3, dj param4, int param5, int param6, int param7, int param8, int param9, int param10, ec param11, int param12, dj param13, ec param14, int param15, int param16, int param17, int param18, ec param19, int param20) {
        ml.a(param4, param3, (byte) 95, param13);
        if (param0 < 85) {
            return;
        }
        e.b(1, param8, param12, param1, param2);
        td.a(true, param17, param5);
        rc.a(param14, 120, param16, param15, param19, param18);
        lj.a(param10, param11, param7, 69);
        vi.a(-1, param6, param20, param9);
    }

    final static void a(int param0, m param1, eg param2, int param3) {
        sn.field_G = param0 * gm.b(-2) / 1000;
        ed.a((byte) -17, param2);
        ArcanistsMulti.a(param2, (byte) -80);
        int var4 = 88 % ((81 - param3) / 36);
        fl.a(-2389, param2);
        tm.a(5968);
        h.j(0);
        gi.field_a = -sn.field_G + 0;
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((ug) this).field_i = ((ug) this).field_i + 1;
          ((ug) this).field_j = ((ug) this).field_j + (((ug) this).field_i + 1);
          var2 = 0;
          if (!param0) {
            break L0;
          } else {
            this.b(false);
            break L0;
          }
        }
        L1: while (true) {
          if (var2 <= -257) {
            return;
          } else {
            L2: {
              var3 = ((ug) this).field_g[var2];
              if (-1 == (2 & var2)) {
                if (-1 != (1 & var2 ^ -1)) {
                  ((ug) this).field_a = ((ug) this).field_a ^ ((ug) this).field_a >>> -965374842;
                  break L2;
                } else {
                  ((ug) this).field_a = ((ug) this).field_a ^ ((ug) this).field_a << 619261165;
                  break L2;
                }
              } else {
                if ((var2 & 1) != 0) {
                  ((ug) this).field_a = ((ug) this).field_a ^ ((ug) this).field_a >>> 1648616368;
                  break L2;
                } else {
                  ((ug) this).field_a = ((ug) this).field_a ^ ((ug) this).field_a << -56508126;
                  break L2;
                }
              }
            }
            ((ug) this).field_a = ((ug) this).field_a + ((ug) this).field_g[255 & var2 - -128];
            var4 = ((ug) this).field_a + (((ug) this).field_g[dg.a(var3 >> -1170177854, 255)] - -((ug) this).field_j);
            ((ug) this).field_g[var2] = ((ug) this).field_a + (((ug) this).field_g[dg.a(var3 >> -1170177854, 255)] - -((ug) this).field_j);
            ((ug) this).field_j = var3 + ((ug) this).field_g[dg.a(var4, 261203) >> -1588828664 >> 1085753954];
            ((ug) this).field_e[var2] = var3 + ((ug) this).field_g[dg.a(var4, 261203) >> -1588828664 >> 1085753954];
            var2++;
            continue L1;
          }
        }
    }

    private final void a(byte param0) {
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
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        var7 = -1640531527;
        var3 = -1640531527;
        var5 = -1640531527;
        var9 = -1640531527;
        var10 = -1640531527;
        var8 = -1640531527;
        var4 = -1640531527;
        var6 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (-5 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                L2: {
                  if (param0 > 124) {
                    break L2;
                  } else {
                    int discarded$1 = ((ug) this).a(false);
                    break L2;
                  }
                }
                var2 = 0;
                L3: while (true) {
                  if (-257 >= (var2 ^ -1)) {
                    this.b(false);
                    ((ug) this).field_b = 256;
                    return;
                  } else {
                    var7 = var7 + ((ug) this).field_g[var2 + 4];
                    var6 = var6 + ((ug) this).field_g[3 + var2];
                    var5 = var5 + ((ug) this).field_g[2 + var2];
                    var8 = var8 + ((ug) this).field_g[var2 - -5];
                    var10 = var10 + ((ug) this).field_g[var2 + 7];
                    var3 = var3 + ((ug) this).field_g[var2];
                    var4 = var4 + ((ug) this).field_g[1 + var2];
                    var9 = var9 + ((ug) this).field_g[6 + var2];
                    var3 = var3 ^ var4 << -1061714549;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -1533129022;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 1980359016;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -2017757264;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -1427019062;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> 1818626756;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -250798200;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 748186889;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    ((ug) this).field_g[var2] = var3;
                    ((ug) this).field_g[var2 + 1] = var4;
                    ((ug) this).field_g[var2 + 2] = var5;
                    ((ug) this).field_g[var2 + 3] = var6;
                    ((ug) this).field_g[4 + var2] = var7;
                    ((ug) this).field_g[var2 + 5] = var8;
                    ((ug) this).field_g[6 + var2] = var9;
                    ((ug) this).field_g[7 + var2] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var8 = var8 + ((ug) this).field_e[var2 + 5];
                var6 = var6 + ((ug) this).field_e[3 + var2];
                var9 = var9 + ((ug) this).field_e[var2 - -6];
                var3 = var3 + ((ug) this).field_e[var2];
                var10 = var10 + ((ug) this).field_e[var2 + 7];
                var7 = var7 + ((ug) this).field_e[4 + var2];
                var4 = var4 + ((ug) this).field_e[1 + var2];
                var5 = var5 + ((ug) this).field_e[2 + var2];
                var3 = var3 ^ var4 << -600765813;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> -851064030;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 1195279688;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -823930128;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << -2124314102;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 1514288100;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 317657288;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 1779230889;
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((ug) this).field_g[var2] = var3;
                ((ug) this).field_g[var2 - -1] = var4;
                ((ug) this).field_g[2 + var2] = var5;
                ((ug) this).field_g[var2 - -3] = var6;
                ((ug) this).field_g[var2 + 4] = var7;
                ((ug) this).field_g[var2 + 5] = var8;
                ((ug) this).field_g[6 + var2] = var9;
                ((ug) this).field_g[7 + var2] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 107899019;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 1908760674;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 977064808;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 1286021328;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << 964885642;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 1189930884;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 160580232;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -36095831;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L0;
          }
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return -76;
        }
        if (!(((ug) this).field_b != 0)) {
            this.b(param0);
            ((ug) this).field_b = 256;
        }
        ((ug) this).field_b = ((ug) this).field_b - 1;
        return ((ug) this).field_e[((ug) this).field_b - 1];
    }

    ug(int[] param0) {
        int var2 = 0;
        ((ug) this).field_e = new int[256];
        ((ug) this).field_g = new int[256];
        for (var2 = 0; param0.length > var2; var2++) {
            ((ug) this).field_e[var2] = param0[var2];
        }
        this.a((byte) 126);
    }

    public static void a(int param0) {
        field_l = null;
        field_c = null;
        field_f = null;
        field_h = null;
        if (param0 < 101) {
            field_l = null;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Wands available:<nbsp>";
        field_f = "Show all game chat";
        field_k = null;
        field_h = "Players: <%0>/<%1>";
        field_c = new eh();
        field_d = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
    }
}
