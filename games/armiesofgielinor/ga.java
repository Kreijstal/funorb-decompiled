/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static wk[] field_k;
    private int[] field_e;
    private int[] field_c;
    static je field_i;
    private int field_f;
    static wk[] field_a;
    private int field_j;
    static kd field_g;
    private int field_b;
    static String field_d;
    private int field_h;

    private final void b(boolean param0) {
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
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        var9 = -1640531527;
        var4 = -1640531527;
        var5 = -1640531527;
        var7 = -1640531527;
        var8 = -1640531527;
        var10 = -1640531527;
        var3 = -1640531527;
        var6 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (256 <= var2) {
                var2 = 0;
                L2: while (true) {
                  if (256 <= var2) {
                    this.a(param0);
                    ((ga) this).field_b = 256;
                    return;
                  } else {
                    var5 = var5 + ((ga) this).field_c[var2 + 2];
                    var7 = var7 + ((ga) this).field_c[4 + var2];
                    var3 = var3 + ((ga) this).field_c[var2];
                    var4 = var4 + ((ga) this).field_c[var2 - -1];
                    var6 = var6 + ((ga) this).field_c[var2 - -3];
                    var10 = var10 + ((ga) this).field_c[var2 - -7];
                    var8 = var8 + ((ga) this).field_c[5 + var2];
                    var9 = var9 + ((ga) this).field_c[var2 - -6];
                    var3 = var3 ^ var4 << 527788939;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 911965250;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -168900152;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -2032299984;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 1091566890;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -584796;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 1358174600;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 387978569;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((ga) this).field_c[var2] = var3;
                    ((ga) this).field_c[var2 + 1] = var4;
                    ((ga) this).field_c[var2 + 2] = var5;
                    ((ga) this).field_c[var2 + 3] = var6;
                    ((ga) this).field_c[var2 + 4] = var7;
                    ((ga) this).field_c[var2 + 5] = var8;
                    ((ga) this).field_c[6 + var2] = var9;
                    ((ga) this).field_c[var2 - -7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var3 = var3 + ((ga) this).field_e[var2];
                var10 = var10 + ((ga) this).field_e[7 + var2];
                var5 = var5 + ((ga) this).field_e[2 + var2];
                var8 = var8 + ((ga) this).field_e[var2 - -5];
                var7 = var7 + ((ga) this).field_e[var2 + 4];
                var6 = var6 + ((ga) this).field_e[3 + var2];
                var9 = var9 + ((ga) this).field_e[6 + var2];
                var4 = var4 + ((ga) this).field_e[var2 - -1];
                var3 = var3 ^ var4 << 1547421899;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> -439065630;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 1624644072;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> 1430611120;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << 1491474730;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> -1911678940;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << 142563720;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 1468163305;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((ga) this).field_c[var2] = var3;
                ((ga) this).field_c[var2 + 1] = var4;
                ((ga) this).field_c[var2 - -2] = var5;
                ((ga) this).field_c[var2 + 3] = var6;
                ((ga) this).field_c[4 + var2] = var7;
                ((ga) this).field_c[var2 - -5] = var8;
                ((ga) this).field_c[6 + var2] = var9;
                ((ga) this).field_c[var2 - -7] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << -1885353909;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> -1316851006;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 1622318312;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 341056080;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -626919062;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> -857000252;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << -920355608;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 510930409;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L0;
          }
        }
    }

    public static void b(int param0) {
        int var1 = -102 / ((param0 - 45) / 43);
        field_i = null;
        field_d = null;
        field_g = null;
        field_k = null;
        field_a = null;
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((ga) this).field_h = ((ga) this).field_h + 1;
        ((ga) this).field_j = ((ga) this).field_j + (((ga) this).field_h + 1);
        if (param0) {
          var2 = 0;
          L0: while (true) {
            if (var2 <= -257) {
              return;
            } else {
              L1: {
                var3 = ((ga) this).field_c[var2];
                if (-1 != (var2 & 2)) {
                  if ((var2 & 1) == 0) {
                    ((ga) this).field_f = ((ga) this).field_f ^ ((ga) this).field_f << -45955454;
                    break L1;
                  } else {
                    ((ga) this).field_f = ((ga) this).field_f ^ ((ga) this).field_f >>> -170062224;
                    break L1;
                  }
                } else {
                  if (0 != (1 & var2)) {
                    ((ga) this).field_f = ((ga) this).field_f ^ ((ga) this).field_f >>> 681687238;
                    break L1;
                  } else {
                    ((ga) this).field_f = ((ga) this).field_f ^ ((ga) this).field_f << 2019060749;
                    break L1;
                  }
                }
              }
              ((ga) this).field_f = ((ga) this).field_f + ((ga) this).field_c[var2 + 128 & 255];
              var4 = ((ga) this).field_j + (((ga) this).field_c[rn.a(255, var3 >> 811609538)] + ((ga) this).field_f);
              ((ga) this).field_c[var2] = ((ga) this).field_j + (((ga) this).field_c[rn.a(255, var3 >> 811609538)] + ((ga) this).field_f);
              ((ga) this).field_j = ((ga) this).field_c[rn.a(var4 >> -1106998904, 1020) >> -277124574] + var3;
              ((ga) this).field_e[var2] = ((ga) this).field_c[rn.a(var4 >> -1106998904, 1020) >> -277124574] + var3;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final int a(int param0) {
        if (0 == ((ga) this).field_b) {
            this.a(true);
            ((ga) this).field_b = 256;
        }
        if (param0 != 256) {
            this.a(false);
        }
        ((ga) this).field_b = ((ga) this).field_b - 1;
        return ((ga) this).field_e[((ga) this).field_b - 1];
    }

    ga(int[] param0) {
        int var2 = 0;
        ((ga) this).field_e = new int[256];
        ((ga) this).field_c = new int[256];
        for (var2 = 0; var2 < param0.length; var2++) {
            ((ga) this).field_e[var2] = param0[var2];
        }
        this.b(true);
    }

    static {
    }
}
