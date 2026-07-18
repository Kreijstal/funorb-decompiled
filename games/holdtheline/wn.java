/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    static ie field_g;
    private int field_j;
    private int[] field_d;
    private int field_e;
    static va field_f;
    static hj field_a;
    private int field_i;
    private int[] field_b;
    static String[] field_h;
    private int field_c;
    static String field_k;

    private final void a() {
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
        var11 = HoldTheLine.field_D;
        var9 = -1640531527;
        var7 = -1640531527;
        var5 = -1640531527;
        var10 = -1640531527;
        var6 = -1640531527;
        var4 = -1640531527;
        var3 = -1640531527;
        var8 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (256 <= var2) {
                    this.a(0);
                    ((wn) this).field_i = 256;
                    return;
                  } else {
                    var4 = var4 + ((wn) this).field_d[1 + var2];
                    var8 = var8 + ((wn) this).field_d[var2 + 5];
                    var7 = var7 + ((wn) this).field_d[var2 - -4];
                    var5 = var5 + ((wn) this).field_d[2 + var2];
                    var10 = var10 + ((wn) this).field_d[var2 - -7];
                    var3 = var3 + ((wn) this).field_d[var2];
                    var6 = var6 + ((wn) this).field_d[3 + var2];
                    var9 = var9 + ((wn) this).field_d[6 + var2];
                    var3 = var3 ^ var4 << 11;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 2;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 8;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 16;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 10;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> 4;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 8;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 9;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    ((wn) this).field_d[var2] = var3;
                    ((wn) this).field_d[var2 + 1] = var4;
                    ((wn) this).field_d[var2 - -2] = var5;
                    ((wn) this).field_d[3 + var2] = var6;
                    ((wn) this).field_d[var2 - -4] = var7;
                    ((wn) this).field_d[var2 + 5] = var8;
                    ((wn) this).field_d[var2 + 6] = var9;
                    ((wn) this).field_d[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var7 = var7 + ((wn) this).field_b[4 + var2];
                var10 = var10 + ((wn) this).field_b[var2 - -7];
                var3 = var3 + ((wn) this).field_b[var2];
                var9 = var9 + ((wn) this).field_b[var2 + 6];
                var4 = var4 + ((wn) this).field_b[1 + var2];
                var6 = var6 + ((wn) this).field_b[var2 - -3];
                var5 = var5 + ((wn) this).field_b[var2 + 2];
                var8 = var8 + ((wn) this).field_b[var2 - -5];
                var3 = var3 ^ var4 << 11;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 2;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 8;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> 16;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 10;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 4;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 8;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 9;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((wn) this).field_d[var2] = var3;
                ((wn) this).field_d[var2 - -1] = var4;
                ((wn) this).field_d[2 + var2] = var5;
                ((wn) this).field_d[var2 - -3] = var6;
                ((wn) this).field_d[4 + var2] = var7;
                ((wn) this).field_d[var2 - -5] = var8;
                ((wn) this).field_d[var2 + 6] = var9;
                ((wn) this).field_d[7 + var2] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 11;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 2;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 8;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 16;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 10;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> 4;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 8;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 9;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L0;
          }
        }
    }

    public static void b() {
        field_g = null;
        field_a = null;
        field_k = null;
        field_f = null;
        field_h = null;
    }

    final int c(int param0) {
        if (param0 != 256) {
            return 23;
        }
        if (!(((wn) this).field_i != 0)) {
            this.a(param0 ^ 256);
            ((wn) this).field_i = 256;
        }
        int fieldTemp$0 = ((wn) this).field_i - 1;
        ((wn) this).field_i = ((wn) this).field_i - 1;
        return ((wn) this).field_b[fieldTemp$0];
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        int fieldTemp$3 = ((wn) this).field_e + 1;
        ((wn) this).field_e = ((wn) this).field_e + 1;
        ((wn) this).field_c = ((wn) this).field_c + fieldTemp$3;
        var2 = param0;
        L0: while (true) {
          if (256 <= var2) {
            return;
          } else {
            L1: {
              var3 = ((wn) this).field_d[var2];
              if (0 == (2 & var2)) {
                if ((var2 & 1) == 0) {
                  ((wn) this).field_j = ((wn) this).field_j ^ ((wn) this).field_j << 13;
                  break L1;
                } else {
                  ((wn) this).field_j = ((wn) this).field_j ^ ((wn) this).field_j >>> 6;
                  break L1;
                }
              } else {
                if ((var2 & 1) != 0) {
                  ((wn) this).field_j = ((wn) this).field_j ^ ((wn) this).field_j >>> 16;
                  break L1;
                } else {
                  ((wn) this).field_j = ((wn) this).field_j ^ ((wn) this).field_j << 2;
                  break L1;
                }
              }
            }
            ((wn) this).field_j = ((wn) this).field_j + ((wn) this).field_d[128 + var2 & 255];
            int dupTemp$4 = ((wn) this).field_c + (((wn) this).field_d[pk.a(var3, 1020) >> 2] + ((wn) this).field_j);
            var4 = dupTemp$4;
            ((wn) this).field_d[var2] = dupTemp$4;
            int dupTemp$5 = var3 + ((wn) this).field_d[pk.a(261345, var4) >> 8 >> 2];
            ((wn) this).field_c = dupTemp$5;
            ((wn) this).field_b[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    wn(int[] param0) {
        int var2_int = 0;
        try {
            ((wn) this).field_b = new int[256];
            ((wn) this).field_d = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                ((wn) this).field_b[var2_int] = param0[var2_int];
            }
            int discarded$0 = 106;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "wn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Weapons";
    }
}
