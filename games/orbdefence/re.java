/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    private int field_e;
    private int field_d;
    private int field_h;
    private int[] field_a;
    static String field_g;
    private int[] field_b;
    static String field_f;
    private int field_c;

    private final void b() {
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
        int var12 = 0;
        var12 = OrbDefence.field_D ? 1 : 0;
        var3 = -1640531527;
        var4 = -1640531527;
        var10 = -1640531527;
        var7 = -1640531527;
        var8 = -1640531527;
        var9 = -1640531527;
        var5 = -1640531527;
        var6 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var11 = -97;
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.a((byte) 122);
                    ((re) this).field_c = 256;
                    return;
                  } else {
                    var3 = var3 + ((re) this).field_a[var2];
                    var5 = var5 + ((re) this).field_a[2 + var2];
                    var6 = var6 + ((re) this).field_a[var2 - -3];
                    var10 = var10 + ((re) this).field_a[7 + var2];
                    var9 = var9 + ((re) this).field_a[6 + var2];
                    var8 = var8 + ((re) this).field_a[var2 - -5];
                    var7 = var7 + ((re) this).field_a[4 + var2];
                    var4 = var4 + ((re) this).field_a[1 + var2];
                    var3 = var3 ^ var4 << 11;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 2;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 8;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
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
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((re) this).field_a[var2] = var3;
                    ((re) this).field_a[var2 + 1] = var4;
                    ((re) this).field_a[var2 - -2] = var5;
                    ((re) this).field_a[3 + var2] = var6;
                    ((re) this).field_a[4 + var2] = var7;
                    ((re) this).field_a[5 + var2] = var8;
                    ((re) this).field_a[6 + var2] = var9;
                    ((re) this).field_a[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var3 = var3 + ((re) this).field_b[var2];
                var7 = var7 + ((re) this).field_b[4 + var2];
                var9 = var9 + ((re) this).field_b[var2 - -6];
                var6 = var6 + ((re) this).field_b[3 + var2];
                var4 = var4 + ((re) this).field_b[var2 - -1];
                var10 = var10 + ((re) this).field_b[7 + var2];
                var5 = var5 + ((re) this).field_b[2 + var2];
                var8 = var8 + ((re) this).field_b[5 + var2];
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
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << 10;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 4;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 8;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 9;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((re) this).field_a[var2] = var3;
                ((re) this).field_a[var2 + 1] = var4;
                ((re) this).field_a[var2 - -2] = var5;
                ((re) this).field_a[3 + var2] = var6;
                ((re) this).field_a[4 + var2] = var7;
                ((re) this).field_a[var2 + 5] = var8;
                ((re) this).field_a[6 + var2] = var9;
                ((re) this).field_a[7 + var2] = var10;
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

    public static void c() {
        field_g = null;
        field_f = null;
    }

    final int a(int param0) {
        if (!(0 != ((re) this).field_c)) {
            this.a((byte) 119);
            ((re) this).field_c = 256;
        }
        if (param0 != 128) {
            ((re) this).field_d = -48;
        }
        int fieldTemp$0 = ((re) this).field_c - 1;
        ((re) this).field_c = ((re) this).field_c - 1;
        return ((re) this).field_b[fieldTemp$0];
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = OrbDefence.field_D ? 1 : 0;
          if (param0 >= 118) {
            break L0;
          } else {
            int discarded$4 = ((re) this).a(92);
            break L0;
          }
        }
        int fieldTemp$5 = ((re) this).field_h + 1;
        ((re) this).field_h = ((re) this).field_h + 1;
        ((re) this).field_e = ((re) this).field_e + fieldTemp$5;
        var2 = 0;
        L1: while (true) {
          if (256 <= var2) {
            return;
          } else {
            L2: {
              var3 = ((re) this).field_a[var2];
              if ((var2 & 2) != 0) {
                if ((var2 & 1) == 0) {
                  ((re) this).field_d = ((re) this).field_d ^ ((re) this).field_d << 2;
                  break L2;
                } else {
                  ((re) this).field_d = ((re) this).field_d ^ ((re) this).field_d >>> 16;
                  break L2;
                }
              } else {
                if ((1 & var2) != 0) {
                  ((re) this).field_d = ((re) this).field_d ^ ((re) this).field_d >>> 6;
                  break L2;
                } else {
                  ((re) this).field_d = ((re) this).field_d ^ ((re) this).field_d << 13;
                  break L2;
                }
              }
            }
            ((re) this).field_d = ((re) this).field_d + ((re) this).field_a[128 + var2 & 255];
            int dupTemp$6 = ((re) this).field_a[vi.a(var3 >> 2, 255)] + (((re) this).field_d + ((re) this).field_e);
            var4 = dupTemp$6;
            ((re) this).field_a[var2] = dupTemp$6;
            int dupTemp$7 = var3 + ((re) this).field_a[vi.a(var4 >> 8 >> 2, 255)];
            ((re) this).field_e = dupTemp$7;
            ((re) this).field_b[var2] = dupTemp$7;
            var2++;
            continue L1;
          }
        }
    }

    re(int[] param0) {
        int var2_int = 0;
        try {
            ((re) this).field_b = new int[256];
            ((re) this).field_a = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                ((re) this).field_b[var2_int] = param0[var2_int];
            }
            int discarded$0 = 92;
            this.b();
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "re.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "FLYBO";
        field_f = "ZOOMO";
    }
}
