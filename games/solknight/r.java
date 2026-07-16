/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    private int field_k;
    private int[] field_f;
    private int[] field_h;
    private int field_a;
    private int field_c;
    private int field_j;
    static od[] field_i;
    static nc field_b;
    static o field_d;
    static char[] field_g;
    static String field_e;

    final static wg b(int param0) {
        if (ma.field_o == el.field_p) {
            throw new IllegalStateException();
        }
        if (!(ma.field_o != da.field_d)) {
            ma.field_o = el.field_p;
            return vb.field_j;
        }
        if (param0 >= 14) {
            return null;
        }
        field_g = null;
        return null;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = SolKnight.field_L ? 1 : 0;
          int fieldTemp$3 = ((r) this).field_a + 1;
          ((r) this).field_a = ((r) this).field_a + 1;
          ((r) this).field_j = ((r) this).field_j + fieldTemp$3;
          if (param0 == 12009) {
            break L0;
          } else {
            ((r) this).field_k = 0;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (-257 >= (var2 ^ -1)) {
            return;
          } else {
            L2: {
              var3 = ((r) this).field_h[var2];
              if (0 != (2 & var2)) {
                if ((1 & var2) != 0) {
                  ((r) this).field_c = ((r) this).field_c ^ ((r) this).field_c >>> -1674131120;
                  break L2;
                } else {
                  ((r) this).field_c = ((r) this).field_c ^ ((r) this).field_c << 741576098;
                  break L2;
                }
              } else {
                if (-1 == (1 & var2 ^ -1)) {
                  ((r) this).field_c = ((r) this).field_c ^ ((r) this).field_c << -543514227;
                  break L2;
                } else {
                  ((r) this).field_c = ((r) this).field_c ^ ((r) this).field_c >>> 1204613894;
                  break L2;
                }
              }
            }
            ((r) this).field_c = ((r) this).field_c + ((r) this).field_h[var2 + 128 & 255];
            int dupTemp$4 = ((r) this).field_j + ((r) this).field_c + ((r) this).field_h[fi.a(1020, var3) >> 249695458];
            var4 = dupTemp$4;
            ((r) this).field_h[var2] = dupTemp$4;
            int dupTemp$5 = ((r) this).field_h[fi.a(var4 >> 1038198280, 1020) >> -146635614] + var3;
            ((r) this).field_j = dupTemp$5;
            ((r) this).field_f[var2] = dupTemp$5;
            var2++;
            continue L1;
          }
        }
    }

    final int a(byte param0) {
        int var2 = 58 % ((66 - param0) / 35);
        if (((r) this).field_k == 0) {
            this.a(12009);
            ((r) this).field_k = 256;
        }
        int fieldTemp$0 = ((r) this).field_k - 1;
        ((r) this).field_k = ((r) this).field_k - 1;
        return ((r) this).field_f[fieldTemp$0];
    }

    r(int[] param0) {
        int var2 = 0;
        ((r) this).field_h = new int[256];
        ((r) this).field_f = new int[256];
        for (var2 = 0; param0.length > var2; var2++) {
            ((r) this).field_f[var2] = param0[var2];
        }
        this.d(93);
    }

    final static da a(int param0, int param1) {
        if (param1 <= 71) {
            return null;
        }
        return ab.a(2097152, param0, 1, false, true, false);
    }

    public static void c(int param0) {
        field_g = null;
        field_d = null;
        int var1 = 121 % ((-28 - param0) / 52);
        field_b = null;
        field_e = null;
        field_i = null;
    }

    private final void d(int param0) {
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
        var11 = SolKnight.field_L ? 1 : 0;
        var10 = -1640531527;
        var4 = -1640531527;
        var8 = -1640531527;
        var5 = -1640531527;
        var6 = -1640531527;
        var7 = -1640531527;
        var3 = -1640531527;
        var9 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -5) {
            var2 = 0;
            L1: while (true) {
              if (-257 >= (var2 ^ -1)) {
                L2: {
                  var2 = 0;
                  if (param0 > 38) {
                    break L2;
                  } else {
                    this.d(-101);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (256 <= var2) {
                    this.a(12009);
                    ((r) this).field_k = 256;
                    return;
                  } else {
                    var10 = var10 + ((r) this).field_h[7 + var2];
                    var5 = var5 + ((r) this).field_h[2 + var2];
                    var4 = var4 + ((r) this).field_h[1 + var2];
                    var7 = var7 + ((r) this).field_h[4 + var2];
                    var8 = var8 + ((r) this).field_h[5 + var2];
                    var6 = var6 + ((r) this).field_h[3 + var2];
                    var3 = var3 + ((r) this).field_h[var2];
                    var9 = var9 + ((r) this).field_h[var2 - -6];
                    var3 = var3 ^ var4 << 1784184779;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1997580862;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -866398008;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 1874927984;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -1459882710;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -566889948;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 1787884008;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -1875758071;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    ((r) this).field_h[var2] = var3;
                    ((r) this).field_h[var2 + 1] = var4;
                    ((r) this).field_h[var2 - -2] = var5;
                    ((r) this).field_h[3 + var2] = var6;
                    ((r) this).field_h[4 + var2] = var7;
                    ((r) this).field_h[5 + var2] = var8;
                    ((r) this).field_h[6 + var2] = var9;
                    ((r) this).field_h[var2 + 7] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var5 = var5 + ((r) this).field_f[var2 + 2];
                var10 = var10 + ((r) this).field_f[var2 - -7];
                var8 = var8 + ((r) this).field_f[var2 - -5];
                var7 = var7 + ((r) this).field_f[var2 + 4];
                var6 = var6 + ((r) this).field_f[var2 + 3];
                var9 = var9 + ((r) this).field_f[6 + var2];
                var4 = var4 + ((r) this).field_f[1 + var2];
                var3 = var3 + ((r) this).field_f[var2];
                var3 = var3 ^ var4 << -422290325;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 1345224994;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << 1139981768;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -1842368240;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << -327332886;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 148293348;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 2100529704;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -817450103;
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((r) this).field_h[var2] = var3;
                ((r) this).field_h[1 + var2] = var4;
                ((r) this).field_h[var2 - -2] = var5;
                ((r) this).field_h[3 + var2] = var6;
                ((r) this).field_h[var2 - -4] = var7;
                ((r) this).field_h[5 + var2] = var8;
                ((r) this).field_h[6 + var2] = var9;
                ((r) this).field_h[7 + var2] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 1173189387;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -703423006;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 1306579432;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> -1864505584;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 1085041322;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> -1705574268;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 2025044552;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> -1849570999;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(da param0, int param1, int param2, e param3) {
        a.field_i = param1 * l.a((byte) 96) / 1000;
        ae.a(26197, param0);
        pb.a(param0, param2 ^ -89);
        pj.a(param2 + 2, param0);
        qk.e(param2 ^ param2);
        gl.a((byte) 28);
        ad.field_h = 0 + -a.field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new nc();
        field_e = "Waiting for graphics";
        field_g = new char[128];
    }
}
