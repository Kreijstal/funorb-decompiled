/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    private int field_a;
    private int field_g;
    private int field_e;
    private int[] field_d;
    private int field_f;
    static int field_b;
    private int[] field_c;

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Main.field_T;
          int fieldTemp$3 = ((hg) this).field_f + 1;
          ((hg) this).field_f = ((hg) this).field_f + 1;
          ((hg) this).field_e = ((hg) this).field_e + fieldTemp$3;
          if (param0 <= -76) {
            break L0;
          } else {
            this.a(true);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L2: {
              var3 = ((hg) this).field_c[var2];
              if (0 == (2 & var2)) {
                if ((1 & var2) != 0) {
                  ((hg) this).field_g = ((hg) this).field_g ^ ((hg) this).field_g >>> 1064320486;
                  break L2;
                } else {
                  ((hg) this).field_g = ((hg) this).field_g ^ ((hg) this).field_g << -1080037299;
                  break L2;
                }
              } else {
                if (-1 != (1 & var2 ^ -1)) {
                  ((hg) this).field_g = ((hg) this).field_g ^ ((hg) this).field_g >>> -1056164048;
                  break L2;
                } else {
                  ((hg) this).field_g = ((hg) this).field_g ^ ((hg) this).field_g << 27756322;
                  break L2;
                }
              }
            }
            ((hg) this).field_g = ((hg) this).field_g + ((hg) this).field_c[var2 - -128 & 255];
            int dupTemp$4 = ((hg) this).field_g + (((hg) this).field_c[bc.a(var3 >> 1001785282, 255)] + ((hg) this).field_e);
            var4 = dupTemp$4;
            ((hg) this).field_c[var2] = dupTemp$4;
            int dupTemp$5 = ((hg) this).field_c[bc.a(var4 >> -296385240 >> -1804145406, 255)] + var3;
            ((hg) this).field_e = dupTemp$5;
            ((hg) this).field_d[var2] = dupTemp$5;
            var2++;
            continue L1;
          }
        }
    }

    private final void a(boolean param0) {
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
        Object var12 = null;
        L0: {
          var11 = Main.field_T;
          var10 = -1640531527;
          var9 = -1640531527;
          var5 = -1640531527;
          var7 = -1640531527;
          var6 = -1640531527;
          if (!param0) {
            break L0;
          } else {
            var12 = null;
            String discarded$1 = hg.a((CharSequence) null, (byte) 30);
            break L0;
          }
        }
        var4 = -1640531527;
        var3 = -1640531527;
        var8 = -1640531527;
        var2 = 0;
        L1: while (true) {
          if (-5 >= (var2 ^ -1)) {
            var2 = 0;
            L2: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L3: while (true) {
                  if (256 <= var2) {
                    this.a(-119);
                    ((hg) this).field_a = 256;
                    return;
                  } else {
                    var10 = var10 + ((hg) this).field_c[var2 - -7];
                    var3 = var3 + ((hg) this).field_c[var2];
                    var8 = var8 + ((hg) this).field_c[var2 + 5];
                    var7 = var7 + ((hg) this).field_c[var2 - -4];
                    var6 = var6 + ((hg) this).field_c[3 + var2];
                    var5 = var5 + ((hg) this).field_c[var2 - -2];
                    var4 = var4 + ((hg) this).field_c[var2 + 1];
                    var9 = var9 + ((hg) this).field_c[var2 - -6];
                    var3 = var3 ^ var4 << -1610128405;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 1683203202;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -437895064;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -364366032;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -1258605878;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -290187516;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 43741352;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 2030219529;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((hg) this).field_c[var2] = var3;
                    ((hg) this).field_c[var2 + 1] = var4;
                    ((hg) this).field_c[2 + var2] = var5;
                    ((hg) this).field_c[var2 - -3] = var6;
                    ((hg) this).field_c[4 + var2] = var7;
                    ((hg) this).field_c[5 + var2] = var8;
                    ((hg) this).field_c[6 + var2] = var9;
                    ((hg) this).field_c[7 + var2] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var9 = var9 + ((hg) this).field_d[var2 + 6];
                var3 = var3 + ((hg) this).field_d[var2];
                var10 = var10 + ((hg) this).field_d[7 + var2];
                var7 = var7 + ((hg) this).field_d[var2 + 4];
                var6 = var6 + ((hg) this).field_d[3 + var2];
                var8 = var8 + ((hg) this).field_d[5 + var2];
                var5 = var5 + ((hg) this).field_d[var2 - -2];
                var4 = var4 + ((hg) this).field_d[var2 + 1];
                var3 = var3 ^ var4 << 674971627;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> -193223934;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << -1858988056;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> 1113936880;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << -1187276470;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> -309164604;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << -1538162424;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> -965987383;
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((hg) this).field_c[var2] = var3;
                ((hg) this).field_c[1 + var2] = var4;
                ((hg) this).field_c[2 + var2] = var5;
                ((hg) this).field_c[3 + var2] = var6;
                ((hg) this).field_c[4 + var2] = var7;
                ((hg) this).field_c[5 + var2] = var8;
                ((hg) this).field_c[6 + var2] = var9;
                ((hg) this).field_c[7 + var2] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << 485334923;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 1130996610;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 1793033672;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 714375760;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -908194422;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> 233456324;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -1914839960;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 1725704297;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L1;
          }
        }
    }

    final static lb a(String param0, byte param1) {
        if (param1 >= -43) {
            return null;
        }
        if (wh.field_a.a(640)) {
            if (!(param0.equals((Object) (Object) wh.field_a.d(640)))) {
                wh.field_a = nk.a(false, param0);
            }
        }
        return wh.field_a;
    }

    final int b(int param0) {
        if (!(-1 != (((hg) this).field_a ^ -1))) {
            this.a(-80);
            ((hg) this).field_a = 256;
        }
        if (param0 != -1427) {
            this.a(61);
        }
        int fieldTemp$0 = ((hg) this).field_a - 1;
        ((hg) this).field_a = ((hg) this).field_a - 1;
        return ((hg) this).field_d[fieldTemp$0];
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = eh.a(0, fe.a(param0, 75));
        if (!(var2 != null)) {
            var2 = "";
        }
        int var3 = 99 / ((param1 - 36) / 57);
        return var2;
    }

    hg(int[] param0) {
        int var2 = 0;
        ((hg) this).field_c = new int[256];
        ((hg) this).field_d = new int[256];
        for (var2 = 0; var2 < param0.length; var2++) {
            ((hg) this).field_d[var2] = param0[var2];
        }
        this.a(false);
    }

    static {
    }
}
