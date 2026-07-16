/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static String field_e;
    static int field_d;
    private int field_k;
    private int[] field_j;
    static km[] field_g;
    private int field_m;
    static String field_b;
    static String field_l;
    private int field_h;
    static String[] field_i;
    private int field_f;
    static String field_c;
    private int[] field_a;

    final static int a(byte[] param0, int param1, int param2) {
        if (param1 != 21106) {
            return -122;
        }
        return ci.a(-82, param0, 0, param2);
    }

    final int b(int param0) {
        if (!(param0 != (((ke) this).field_k ^ -1))) {
            this.a(true);
            ((ke) this).field_k = 256;
        }
        int fieldTemp$0 = ((ke) this).field_k - 1;
        ((ke) this).field_k = ((ke) this).field_k - 1;
        return ((ke) this).field_a[fieldTemp$0];
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Chess.field_G;
          if (param0) {
            break L0;
          } else {
            this.a(true);
            break L0;
          }
        }
        int fieldTemp$3 = ((ke) this).field_h + 1;
        ((ke) this).field_h = ((ke) this).field_h + 1;
        ((ke) this).field_f = ((ke) this).field_f + fieldTemp$3;
        var2 = 0;
        L1: while (true) {
          if ((var2 ^ -1) <= -257) {
            return;
          } else {
            L2: {
              var3 = ((ke) this).field_j[var2];
              if ((2 & var2) == -1) {
                if ((var2 & 1) == 0) {
                  ((ke) this).field_m = ((ke) this).field_m ^ ((ke) this).field_m << 1197497165;
                  break L2;
                } else {
                  ((ke) this).field_m = ((ke) this).field_m ^ ((ke) this).field_m >>> -1252978458;
                  break L2;
                }
              } else {
                if (-1 != (var2 & 1)) {
                  ((ke) this).field_m = ((ke) this).field_m ^ ((ke) this).field_m >>> -1563905872;
                  break L2;
                } else {
                  ((ke) this).field_m = ((ke) this).field_m ^ ((ke) this).field_m << 297583010;
                  break L2;
                }
              }
            }
            ((ke) this).field_m = ((ke) this).field_m + ((ke) this).field_j[255 & var2 + 128];
            int dupTemp$4 = ((ke) this).field_m + ((ke) this).field_j[ce.a(1020, var3) >> 898509890] - -((ke) this).field_f;
            var4 = dupTemp$4;
            ((ke) this).field_j[var2] = dupTemp$4;
            int dupTemp$5 = var3 + ((ke) this).field_j[ce.a(var4, 261311) >> -1336342712 >> 413519362];
            ((ke) this).field_f = dupTemp$5;
            ((ke) this).field_a[var2] = dupTemp$5;
            var2++;
            continue L1;
          }
        }
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, String param5) {
        nk var8 = qn.field_U;
        var8.f(param3, param0 ^ -9832);
        var8.field_l = var8.field_l + 1;
        if (param0 != 9822) {
            return;
        }
        int var7 = var8.field_l;
        var8.c(param1, (byte) 127);
        if ((param1 ^ -1) == -3) {
            var8.a(param0 + -9921, param2);
        }
        if (param5 == null) {
            var8.b(param4, 119);
        } else {
            int discarded$0 = rm.a((p) (Object) var8, param5, param0 ^ 16701600);
        }
        var8.a(-var7 + var8.field_l, -1);
    }

    private final void b(byte param0) {
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
          var11 = Chess.field_G;
          if (param0 == 41) {
            break L0;
          } else {
            var12 = null;
            int discarded$1 = ke.a((byte[]) null, -20, 3);
            break L0;
          }
        }
        var5 = -1640531527;
        var9 = -1640531527;
        var3 = -1640531527;
        var4 = -1640531527;
        var6 = -1640531527;
        var8 = -1640531527;
        var7 = -1640531527;
        var10 = -1640531527;
        var2 = 0;
        L1: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L2: while (true) {
              if (256 <= var2) {
                var2 = 0;
                L3: while (true) {
                  if (-257 >= (var2 ^ -1)) {
                    this.a(true);
                    ((ke) this).field_k = 256;
                    return;
                  } else {
                    var8 = var8 + ((ke) this).field_j[5 + var2];
                    var6 = var6 + ((ke) this).field_j[3 + var2];
                    var7 = var7 + ((ke) this).field_j[var2 - -4];
                    var4 = var4 + ((ke) this).field_j[var2 - -1];
                    var10 = var10 + ((ke) this).field_j[var2 + 7];
                    var9 = var9 + ((ke) this).field_j[var2 + 6];
                    var3 = var3 + ((ke) this).field_j[var2];
                    var5 = var5 + ((ke) this).field_j[2 + var2];
                    var3 = var3 ^ var4 << -724429525;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -1268769374;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -369173688;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 2110567152;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -816920182;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1663832924;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << -1715727864;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 1636059721;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((ke) this).field_j[var2] = var3;
                    ((ke) this).field_j[var2 - -1] = var4;
                    ((ke) this).field_j[var2 - -2] = var5;
                    ((ke) this).field_j[3 + var2] = var6;
                    ((ke) this).field_j[var2 - -4] = var7;
                    ((ke) this).field_j[var2 - -5] = var8;
                    ((ke) this).field_j[6 + var2] = var9;
                    ((ke) this).field_j[var2 - -7] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var6 = var6 + ((ke) this).field_a[3 + var2];
                var5 = var5 + ((ke) this).field_a[2 + var2];
                var9 = var9 + ((ke) this).field_a[var2 - -6];
                var8 = var8 + ((ke) this).field_a[var2 + 5];
                var4 = var4 + ((ke) this).field_a[var2 + 1];
                var10 = var10 + ((ke) this).field_a[7 + var2];
                var3 = var3 + ((ke) this).field_a[var2];
                var7 = var7 + ((ke) this).field_a[4 + var2];
                var3 = var3 ^ var4 << 1306040267;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 871329634;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << -1968662872;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> 947956912;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << -2072973654;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 930582820;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << -1038043256;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -480895831;
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((ke) this).field_j[var2] = var3;
                ((ke) this).field_j[1 + var2] = var4;
                ((ke) this).field_j[var2 - -2] = var5;
                ((ke) this).field_j[var2 + 3] = var6;
                ((ke) this).field_j[var2 - -4] = var7;
                ((ke) this).field_j[var2 - -5] = var8;
                ((ke) this).field_j[6 + var2] = var9;
                ((ke) this).field_j[var2 - -7] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << -274702325;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> -48667998;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 285997192;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> -88569264;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -432759670;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> 506634724;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -569643064;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 1765238761;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L1;
          }
        }
    }

    final static lb a(int param0) {
        if (param0 != -27212) {
            Object var2 = null;
            int discarded$0 = ke.a((byte[]) null, 98, 120);
        }
        return rm.field_M;
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = 34 % ((-24 - param0) / 47);
        field_b = null;
        field_e = null;
        field_l = null;
        field_c = null;
        field_g = null;
    }

    ke(int[] param0) {
        int var2 = 0;
        ((ke) this).field_a = new int[256];
        ((ke) this).field_j = new int[256];
        for (var2 = 0; param0.length > var2; var2++) {
            ((ke) this).field_a[var2] = param0[var2];
        }
        this.b((byte) 41);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 3;
        field_b = "Ignore";
        field_l = "Spectate";
        field_i = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_c = "The game options are not all set.";
        field_e = "You are playing as <%0>";
    }
}
