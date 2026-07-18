/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private int[] field_k;
    private int field_c;
    static cd field_h;
    static wc field_l;
    private int field_e;
    private int[] field_a;
    private int field_g;
    private int field_j;
    static qd field_b;
    static mn field_m;
    static String field_i;
    static int field_d;
    static String field_f;

    public static void a(byte param0) {
        field_m = null;
        field_h = null;
        field_b = null;
        int var1 = 1;
        field_l = null;
        field_i = null;
        field_f = null;
    }

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
        var11 = Torquing.field_u;
        var3 = -1640531527;
        var5 = -1640531527;
        var6 = -1640531527;
        var10 = -1640531527;
        var8 = -1640531527;
        var7 = -1640531527;
        var9 = -1640531527;
        var4 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (256 <= var2) {
                    this.a(false);
                    ((gn) this).field_c = 256;
                    return;
                  } else {
                    var4 = var4 + ((gn) this).field_a[1 + var2];
                    var6 = var6 + ((gn) this).field_a[3 + var2];
                    var8 = var8 + ((gn) this).field_a[var2 + 5];
                    var9 = var9 + ((gn) this).field_a[6 + var2];
                    var3 = var3 + ((gn) this).field_a[var2];
                    var10 = var10 + ((gn) this).field_a[var2 - -7];
                    var5 = var5 + ((gn) this).field_a[var2 + 2];
                    var7 = var7 + ((gn) this).field_a[4 + var2];
                    var3 = var3 ^ var4 << 11;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 2;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 8;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 16;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
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
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((gn) this).field_a[var2] = var3;
                    ((gn) this).field_a[var2 + 1] = var4;
                    ((gn) this).field_a[2 + var2] = var5;
                    ((gn) this).field_a[var2 + 3] = var6;
                    ((gn) this).field_a[var2 - -4] = var7;
                    ((gn) this).field_a[var2 + 5] = var8;
                    ((gn) this).field_a[6 + var2] = var9;
                    ((gn) this).field_a[var2 + 7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var3 = var3 + ((gn) this).field_k[var2];
                var8 = var8 + ((gn) this).field_k[var2 + 5];
                var9 = var9 + ((gn) this).field_k[var2 + 6];
                var7 = var7 + ((gn) this).field_k[var2 + 4];
                var5 = var5 + ((gn) this).field_k[2 + var2];
                var10 = var10 + ((gn) this).field_k[var2 + 7];
                var6 = var6 + ((gn) this).field_k[3 + var2];
                var4 = var4 + ((gn) this).field_k[1 + var2];
                var3 = var3 ^ var4 << 11;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 2;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 8;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> 16;
                var7 = var7 + var8;
                var9 = var9 + var6;
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
                ((gn) this).field_a[var2] = var3;
                ((gn) this).field_a[var2 + 1] = var4;
                ((gn) this).field_a[var2 + 2] = var5;
                ((gn) this).field_a[3 + var2] = var6;
                ((gn) this).field_a[var2 + 4] = var7;
                ((gn) this).field_a[5 + var2] = var8;
                ((gn) this).field_a[var2 + 6] = var9;
                ((gn) this).field_a[7 + var2] = var10;
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
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 16;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 10;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 4;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << 8;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 9;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L0;
          }
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Torquing.field_u;
        int fieldTemp$3 = ((gn) this).field_e + 1;
        ((gn) this).field_e = ((gn) this).field_e + 1;
        ((gn) this).field_j = ((gn) this).field_j + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
            return;
          } else {
            L1: {
              var3 = ((gn) this).field_a[var2];
              if (0 == (var2 & 2)) {
                if ((1 & var2) != 0) {
                  ((gn) this).field_g = ((gn) this).field_g ^ ((gn) this).field_g >>> 6;
                  break L1;
                } else {
                  ((gn) this).field_g = ((gn) this).field_g ^ ((gn) this).field_g << 13;
                  break L1;
                }
              } else {
                if ((1 & var2) == 0) {
                  ((gn) this).field_g = ((gn) this).field_g ^ ((gn) this).field_g << 2;
                  break L1;
                } else {
                  ((gn) this).field_g = ((gn) this).field_g ^ ((gn) this).field_g >>> 16;
                  break L1;
                }
              }
            }
            ((gn) this).field_g = ((gn) this).field_g + ((gn) this).field_a[var2 + 128 & 255];
            int dupTemp$4 = ((gn) this).field_j + ((gn) this).field_a[ie.a(var3 >> 2, 255)] - -((gn) this).field_g;
            var4 = dupTemp$4;
            ((gn) this).field_a[var2] = dupTemp$4;
            int dupTemp$5 = ((gn) this).field_a[ie.a(var4 >> 8 >> 2, 255)] + var3;
            ((gn) this).field_j = dupTemp$5;
            ((gn) this).field_k[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    final int b(byte param0) {
        if (param0 == -103) {
          if (((gn) this).field_c == 0) {
            this.a(false);
            ((gn) this).field_c = 256;
            int fieldTemp$4 = ((gn) this).field_c - 1;
            ((gn) this).field_c = ((gn) this).field_c - 1;
            return ((gn) this).field_k[fieldTemp$4];
          } else {
            int fieldTemp$5 = ((gn) this).field_c - 1;
            ((gn) this).field_c = ((gn) this).field_c - 1;
            return ((gn) this).field_k[fieldTemp$5];
          }
        } else {
          ((gn) this).field_k = null;
          if (((gn) this).field_c != 0) {
            int fieldTemp$6 = ((gn) this).field_c - 1;
            ((gn) this).field_c = ((gn) this).field_c - 1;
            return ((gn) this).field_k[fieldTemp$6];
          } else {
            this.a(false);
            ((gn) this).field_c = 256;
            int fieldTemp$7 = ((gn) this).field_c - 1;
            ((gn) this).field_c = ((gn) this).field_c - 1;
            return ((gn) this).field_k[fieldTemp$7];
          }
        }
    }

    gn(int[] param0) {
        int var2_int = 0;
        try {
            ((gn) this).field_k = new int[256];
            ((gn) this).field_a = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((gn) this).field_k[var2_int] = param0[var2_int];
            }
            this.a(0);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "gn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = null;
        field_h = new cd();
        field_b = new qd();
        field_i = "If you are a member, log in to start at any level you've reached.";
        field_d = 0;
        field_f = "to keep fullscreen or";
    }
}
