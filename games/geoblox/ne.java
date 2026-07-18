/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    private int field_f;
    private int[] field_e;
    static String field_c;
    private int field_h;
    static String field_d;
    private int[] field_a;
    private int field_g;
    private int field_i;
    static dm field_b;

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
        var11 = Geoblox.field_C;
        var8 = -1640531527;
        var5 = -1640531527;
        var6 = -1640531527;
        var10 = -1640531527;
        var4 = -1640531527;
        var3 = -1640531527;
        var7 = -1640531527;
        var9 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (256 <= var2) {
                    this.a(-108);
                    ((ne) this).field_i = 256;
                    return;
                  } else {
                    var9 = var9 + ((ne) this).field_a[var2 + 6];
                    var3 = var3 + ((ne) this).field_a[var2];
                    var10 = var10 + ((ne) this).field_a[var2 + 7];
                    var6 = var6 + ((ne) this).field_a[3 + var2];
                    var4 = var4 + ((ne) this).field_a[1 + var2];
                    var8 = var8 + ((ne) this).field_a[5 + var2];
                    var5 = var5 + ((ne) this).field_a[var2 + 2];
                    var7 = var7 + ((ne) this).field_a[var2 - -4];
                    var3 = var3 ^ var4 << 11;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 2;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
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
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 8;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 9;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    ((ne) this).field_a[var2] = var3;
                    ((ne) this).field_a[1 + var2] = var4;
                    ((ne) this).field_a[var2 - -2] = var5;
                    ((ne) this).field_a[3 + var2] = var6;
                    ((ne) this).field_a[4 + var2] = var7;
                    ((ne) this).field_a[5 + var2] = var8;
                    ((ne) this).field_a[6 + var2] = var9;
                    ((ne) this).field_a[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var8 = var8 + ((ne) this).field_e[var2 - -5];
                var6 = var6 + ((ne) this).field_e[3 + var2];
                var10 = var10 + ((ne) this).field_e[7 + var2];
                var3 = var3 + ((ne) this).field_e[var2];
                var5 = var5 + ((ne) this).field_e[2 + var2];
                var7 = var7 + ((ne) this).field_e[4 + var2];
                var4 = var4 + ((ne) this).field_e[1 + var2];
                var9 = var9 + ((ne) this).field_e[var2 - -6];
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
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> 4;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << 8;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 9;
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((ne) this).field_a[var2] = var3;
                ((ne) this).field_a[1 + var2] = var4;
                ((ne) this).field_a[2 + var2] = var5;
                ((ne) this).field_a[3 + var2] = var6;
                ((ne) this).field_a[var2 + 4] = var7;
                ((ne) this).field_a[var2 - -5] = var8;
                ((ne) this).field_a[6 + var2] = var9;
                ((ne) this).field_a[7 + var2] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
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
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L0;
          }
        }
    }

    final int b(int param0) {
        if (!(((ne) this).field_i != param0)) {
            this.a(-125);
            ((ne) this).field_i = 256;
        }
        int fieldTemp$0 = ((ne) this).field_i - 1;
        ((ne) this).field_i = ((ne) this).field_i - 1;
        return ((ne) this).field_e[fieldTemp$0];
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          int fieldTemp$3 = ((ne) this).field_h + 1;
          ((ne) this).field_h = ((ne) this).field_h + 1;
          ((ne) this).field_f = ((ne) this).field_f + fieldTemp$3;
          var2 = 0;
          if (param0 < -10) {
            break L0;
          } else {
            ne.a((byte) 89);
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L2: {
              var3 = ((ne) this).field_a[var2];
              if (0 == (2 & var2)) {
                if ((1 & var2) != 0) {
                  ((ne) this).field_g = ((ne) this).field_g ^ ((ne) this).field_g >>> 6;
                  break L2;
                } else {
                  ((ne) this).field_g = ((ne) this).field_g ^ ((ne) this).field_g << 13;
                  break L2;
                }
              } else {
                if ((var2 & 1) != 0) {
                  ((ne) this).field_g = ((ne) this).field_g ^ ((ne) this).field_g >>> 16;
                  break L2;
                } else {
                  ((ne) this).field_g = ((ne) this).field_g ^ ((ne) this).field_g << 2;
                  break L2;
                }
              }
            }
            ((ne) this).field_g = ((ne) this).field_g + ((ne) this).field_a[255 & 128 + var2];
            int dupTemp$4 = ((ne) this).field_f + (((ne) this).field_g + ((ne) this).field_a[cd.a(255, var3 >> 2)]);
            var4 = dupTemp$4;
            ((ne) this).field_a[var2] = dupTemp$4;
            int dupTemp$5 = var3 + ((ne) this).field_a[cd.a(var4 >> 8, 1020) >> 2];
            ((ne) this).field_f = dupTemp$5;
            ((ne) this).field_e[var2] = dupTemp$5;
            var2++;
            continue L1;
          }
        }
    }

    final static void a(byte param0) {
        int var1 = uf.field_h[-1 + uf.field_h.length];
        kk.field_x = (float)(-(255 & si.field_j) + (255 & var1));
        ka.field_c = (float)(-(si.field_j >> 8 & 255) + (var1 >> 8 & 255));
        lk.field_b = (float)(((var1 & 16735942) >> 16) - (si.field_j >> 16 & 255));
        int var2 = 80 % ((5 - param0) / 52);
        fi.a(0, ll.field_d);
    }

    public static void b() {
        field_b = null;
        field_c = null;
        field_d = null;
    }

    ne(int[] param0) {
        int var2_int = 0;
        try {
            ((ne) this).field_a = new int[256];
            ((ne) this).field_e = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((ne) this).field_e[var2_int] = param0[var2_int];
            }
            int discarded$0 = 1;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ne.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Visit the Account Management section on the main site to view.";
        field_c = "Discard results";
    }
}
