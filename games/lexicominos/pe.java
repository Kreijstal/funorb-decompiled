/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static String field_e;
    static char field_b;
    private int field_i;
    private int field_f;
    private int[] field_g;
    private int[] field_h;
    static String field_a;
    private int field_d;
    static String field_j;
    private int field_c;

    public static void a(byte param0) {
        int var1 = -20;
        field_j = null;
        field_e = null;
        field_a = null;
    }

    final int c(int param0) {
        if (!(((pe) this).field_d != param0)) {
            this.a(param0 ^ -2034);
            ((pe) this).field_d = 256;
        }
        int fieldTemp$0 = ((pe) this).field_d - 1;
        ((pe) this).field_d = ((pe) this).field_d - 1;
        return ((pe) this).field_g[fieldTemp$0];
    }

    final static void a(int param0, int param1, int param2, le param3, int param4, db[] param5, db[] param6, int param7, le param8, int param9, int param10, int param11, int param12, int param13, boolean param14) {
        try {
            Object var16 = null;
            aj.a(0, param9, 0, ea.field_b, param3, g.field_n, 480, param7, ec.field_c, param8, param13, param0, param5, (db[]) null, param4, true, param12, param6, param2, param10, param1);
            bl.a(param14, 2);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "pe.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + -98 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          int fieldTemp$3 = ((pe) this).field_i + 1;
          ((pe) this).field_i = ((pe) this).field_i + 1;
          ((pe) this).field_f = ((pe) this).field_f + fieldTemp$3;
          if (param0 == -2034) {
            break L0;
          } else {
            ((pe) this).field_d = 0;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L2: {
              var3 = ((pe) this).field_h[var2];
              if ((var2 & 2) != 0) {
                if ((1 & var2) != 0) {
                  ((pe) this).field_c = ((pe) this).field_c ^ ((pe) this).field_c >>> 16;
                  break L2;
                } else {
                  ((pe) this).field_c = ((pe) this).field_c ^ ((pe) this).field_c << 2;
                  break L2;
                }
              } else {
                if (0 == (var2 & 1)) {
                  ((pe) this).field_c = ((pe) this).field_c ^ ((pe) this).field_c << 13;
                  break L2;
                } else {
                  ((pe) this).field_c = ((pe) this).field_c ^ ((pe) this).field_c >>> 6;
                  break L2;
                }
              }
            }
            ((pe) this).field_c = ((pe) this).field_c + ((pe) this).field_h[255 & 128 + var2];
            int dupTemp$4 = ((pe) this).field_f + ((pe) this).field_c + ((pe) this).field_h[vg.a(1020, var3) >> 2];
            var4 = dupTemp$4;
            ((pe) this).field_h[var2] = dupTemp$4;
            int dupTemp$5 = ((pe) this).field_h[vg.a(255, var4 >> 8 >> 2)] - -var3;
            ((pe) this).field_f = dupTemp$5;
            ((pe) this).field_g[var2] = dupTemp$5;
            var2++;
            continue L1;
          }
        }
    }

    private final void b(int param0) {
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
        var11 = Lexicominos.field_L ? 1 : 0;
        var8 = -1640531527;
        var4 = -1640531527;
        var3 = -1640531527;
        var6 = -1640531527;
        var5 = -1640531527;
        var10 = -1640531527;
        var9 = -1640531527;
        var7 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.a(-2034);
                    ((pe) this).field_d = 256;
                    return;
                  } else {
                    var9 = var9 + ((pe) this).field_h[var2 - -6];
                    var8 = var8 + ((pe) this).field_h[5 + var2];
                    var4 = var4 + ((pe) this).field_h[var2 + 1];
                    var7 = var7 + ((pe) this).field_h[var2 + 4];
                    var3 = var3 + ((pe) this).field_h[var2];
                    var10 = var10 + ((pe) this).field_h[7 + var2];
                    var5 = var5 + ((pe) this).field_h[2 + var2];
                    var6 = var6 + ((pe) this).field_h[var2 - -3];
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
                    ((pe) this).field_h[var2] = var3;
                    ((pe) this).field_h[1 + var2] = var4;
                    ((pe) this).field_h[var2 + 2] = var5;
                    ((pe) this).field_h[var2 + 3] = var6;
                    ((pe) this).field_h[4 + var2] = var7;
                    ((pe) this).field_h[var2 - -5] = var8;
                    ((pe) this).field_h[6 + var2] = var9;
                    ((pe) this).field_h[var2 - -7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var4 = var4 + ((pe) this).field_g[1 + var2];
                var3 = var3 + ((pe) this).field_g[var2];
                var10 = var10 + ((pe) this).field_g[var2 + 7];
                var6 = var6 + ((pe) this).field_g[var2 - -3];
                var9 = var9 + ((pe) this).field_g[6 + var2];
                var8 = var8 + ((pe) this).field_g[var2 + 5];
                var5 = var5 + ((pe) this).field_g[2 + var2];
                var7 = var7 + ((pe) this).field_g[var2 - -4];
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
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 9;
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((pe) this).field_h[var2] = var3;
                ((pe) this).field_h[1 + var2] = var4;
                ((pe) this).field_h[var2 + 2] = var5;
                ((pe) this).field_h[var2 - -3] = var6;
                ((pe) this).field_h[4 + var2] = var7;
                ((pe) this).field_h[var2 + 5] = var8;
                ((pe) this).field_h[var2 + 6] = var9;
                ((pe) this).field_h[7 + var2] = var10;
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
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L0;
          }
        }
    }

    pe(int[] param0) {
        int var2_int = 0;
        try {
            ((pe) this).field_g = new int[256];
            ((pe) this).field_h = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((pe) this).field_g[var2_int] = param0[var2_int];
            }
            this.b(-24892);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "pe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Passwords must be between 5 and 20 characters long";
        field_j = "Please send me news and updates (I can unsubscribe at any time)";
        field_e = "Loading graphics";
    }
}
