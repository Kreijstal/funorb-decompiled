/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo {
    private int field_e;
    private int[] field_i;
    private int field_c;
    private int field_b;
    static int field_j;
    static boolean field_d;
    static int field_h;
    private int[] field_f;
    static String field_a;
    private int field_g;

    public static void c(int param0) {
        if (param0 != -1640531527) {
            uo.c(-56);
        }
        field_a = null;
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param0) {
            bi.a(0, 0, bi.field_f, bi.field_a, 0, 192);
        } else {
            bi.d();
        }
        if (param1 != -28518) {
            uo.a(true, 65, false);
        }
        rc.a(param0, (byte) -120);
    }

    final int a(int param0) {
        if (!(((uo) this).field_e != 0)) {
            this.a(true);
            ((uo) this).field_e = 256;
        }
        if (param0 < 13) {
            int discarded$0 = ((uo) this).a(32);
        }
        int fieldTemp$1 = ((uo) this).field_e - 1;
        ((uo) this).field_e = ((uo) this).field_e - 1;
        return ((uo) this).field_i[fieldTemp$1];
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        int fieldTemp$3 = ((uo) this).field_g + 1;
        ((uo) this).field_g = ((uo) this).field_g + 1;
        ((uo) this).field_b = ((uo) this).field_b + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L1: {
              var3 = ((uo) this).field_f[var2];
              if ((var2 & 2) == 0) {
                if ((1 & var2) == 0) {
                  ((uo) this).field_c = ((uo) this).field_c ^ ((uo) this).field_c << 13;
                  break L1;
                } else {
                  ((uo) this).field_c = ((uo) this).field_c ^ ((uo) this).field_c >>> 6;
                  break L1;
                }
              } else {
                if ((1 & var2) != 0) {
                  ((uo) this).field_c = ((uo) this).field_c ^ ((uo) this).field_c >>> 16;
                  break L1;
                } else {
                  ((uo) this).field_c = ((uo) this).field_c ^ ((uo) this).field_c << 2;
                  break L1;
                }
              }
            }
            ((uo) this).field_c = ((uo) this).field_c + ((uo) this).field_f[var2 + 128 & 255];
            int dupTemp$4 = ((uo) this).field_f[eg.a(var3 >> 2, 255)] + ((uo) this).field_c + ((uo) this).field_b;
            var4 = dupTemp$4;
            ((uo) this).field_f[var2] = dupTemp$4;
            int dupTemp$5 = ((uo) this).field_f[eg.a(1020, var4 >> 8) >> 2] + var3;
            ((uo) this).field_b = dupTemp$5;
            ((uo) this).field_i[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    uo(int[] param0) {
        int var2_int = 0;
        try {
            ((uo) this).field_i = new int[256];
            ((uo) this).field_f = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((uo) this).field_i[var2_int] = param0[var2_int];
            }
            this.b(20196);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "uo.<init>(" + (param0 != null ? "{...}" : "null") + 41);
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
        var11 = ZombieDawn.field_J;
        var10 = -1640531527;
        var3 = -1640531527;
        var7 = -1640531527;
        var4 = -1640531527;
        var8 = -1640531527;
        var5 = -1640531527;
        var9 = -1640531527;
        var6 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (256 <= var2) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.a(true);
                    ((uo) this).field_e = 256;
                    return;
                  } else {
                    var9 = var9 + ((uo) this).field_f[6 + var2];
                    var5 = var5 + ((uo) this).field_f[2 + var2];
                    var7 = var7 + ((uo) this).field_f[var2 + 4];
                    var8 = var8 + ((uo) this).field_f[var2 - -5];
                    var4 = var4 + ((uo) this).field_f[var2 - -1];
                    var10 = var10 + ((uo) this).field_f[7 + var2];
                    var6 = var6 + ((uo) this).field_f[3 + var2];
                    var3 = var3 + ((uo) this).field_f[var2];
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
                    ((uo) this).field_f[var2] = var3;
                    ((uo) this).field_f[1 + var2] = var4;
                    ((uo) this).field_f[var2 - -2] = var5;
                    ((uo) this).field_f[var2 + 3] = var6;
                    ((uo) this).field_f[4 + var2] = var7;
                    ((uo) this).field_f[var2 - -5] = var8;
                    ((uo) this).field_f[6 + var2] = var9;
                    ((uo) this).field_f[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var5 = var5 + ((uo) this).field_i[2 + var2];
                var9 = var9 + ((uo) this).field_i[6 + var2];
                var7 = var7 + ((uo) this).field_i[4 + var2];
                var6 = var6 + ((uo) this).field_i[3 + var2];
                var10 = var10 + ((uo) this).field_i[7 + var2];
                var8 = var8 + ((uo) this).field_i[var2 + 5];
                var3 = var3 + ((uo) this).field_i[var2];
                var4 = var4 + ((uo) this).field_i[1 + var2];
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
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 9;
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((uo) this).field_f[var2] = var3;
                ((uo) this).field_f[1 + var2] = var4;
                ((uo) this).field_f[var2 + 2] = var5;
                ((uo) this).field_f[var2 - -3] = var6;
                ((uo) this).field_f[4 + var2] = var7;
                ((uo) this).field_f[5 + var2] = var8;
                ((uo) this).field_f[var2 + 6] = var9;
                ((uo) this).field_f[var2 + 7] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 11;
            var4 = var4 + var5;
            var6 = var6 + var3;
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
            var9 = var9 + var10;
            var3 = var3 + var8;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This password is part of your Player Name, and would be easy to guess";
        field_h = 60;
        field_j = 10;
    }
}
