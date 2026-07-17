/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    static int[] field_h;
    private int field_i;
    static int field_e;
    private int[] field_a;
    static java.awt.Font field_c;
    private int field_b;
    private int[] field_d;
    private int field_f;
    private int field_g;
    static long[] field_j;

    public static void a() {
        field_j = null;
        field_h = null;
        field_c = null;
    }

    final static boolean b() {
        int var1 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var1 = 9;
            if (m.field_b == null) {
              break L1;
            } else {
              if (!r.field_c.a((byte) 11)) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var2 = -85 / ((-63 - param0) / 46);
        int fieldTemp$3 = ((jb) this).field_g + 1;
        ((jb) this).field_g = ((jb) this).field_g + 1;
        ((jb) this).field_f = ((jb) this).field_f + fieldTemp$3;
        var3 = 0;
        L0: while (true) {
          if (var3 >= 256) {
            return;
          } else {
            L1: {
              var4 = ((jb) this).field_a[var3];
              if (0 != (2 & var3)) {
                if ((var3 & 1) == 0) {
                  ((jb) this).field_i = ((jb) this).field_i ^ ((jb) this).field_i << 2;
                  break L1;
                } else {
                  ((jb) this).field_i = ((jb) this).field_i ^ ((jb) this).field_i >>> 16;
                  break L1;
                }
              } else {
                if ((var3 & 1) == 0) {
                  ((jb) this).field_i = ((jb) this).field_i ^ ((jb) this).field_i << 13;
                  break L1;
                } else {
                  ((jb) this).field_i = ((jb) this).field_i ^ ((jb) this).field_i >>> 6;
                  break L1;
                }
              }
            }
            ((jb) this).field_i = ((jb) this).field_i + ((jb) this).field_a[255 & var3 + 128];
            int dupTemp$4 = ((jb) this).field_f + ((jb) this).field_i + ((jb) this).field_a[w.a(var4, 1020) >> 2];
            var5 = dupTemp$4;
            ((jb) this).field_a[var3] = dupTemp$4;
            int dupTemp$5 = ((jb) this).field_a[w.a(255, var5 >> 8 >> 2)] + var4;
            ((jb) this).field_f = dupTemp$5;
            ((jb) this).field_d[var3] = dupTemp$5;
            var3++;
            continue L0;
          }
        }
    }

    jb(int[] param0) {
        int var2_int = 0;
        try {
            ((jb) this).field_a = new int[256];
            ((jb) this).field_d = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((jb) this).field_d[var2_int] = param0[var2_int];
            }
            int discarded$0 = 119;
            this.c();
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "jb.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    private final void c() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var7 = -1640531527;
        var5 = -1640531527;
        var4 = -1640531527;
        var9 = -1640531527;
        var10 = -1640531527;
        var8 = -1640531527;
        var3 = -1640531527;
        var6 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.a((byte) -122);
                    ((jb) this).field_b = 256;
                    return;
                  } else {
                    var4 = var4 + ((jb) this).field_a[1 + var2];
                    var3 = var3 + ((jb) this).field_a[var2];
                    var5 = var5 + ((jb) this).field_a[var2 + 2];
                    var9 = var9 + ((jb) this).field_a[var2 + 6];
                    var6 = var6 + ((jb) this).field_a[var2 - -3];
                    var8 = var8 + ((jb) this).field_a[var2 - -5];
                    var7 = var7 + ((jb) this).field_a[var2 + 4];
                    var10 = var10 + ((jb) this).field_a[7 + var2];
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
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 10;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> 4;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 8;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 9;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    ((jb) this).field_a[var2] = var3;
                    ((jb) this).field_a[1 + var2] = var4;
                    ((jb) this).field_a[2 + var2] = var5;
                    ((jb) this).field_a[var2 + 3] = var6;
                    ((jb) this).field_a[var2 + 4] = var7;
                    ((jb) this).field_a[5 + var2] = var8;
                    ((jb) this).field_a[var2 + 6] = var9;
                    ((jb) this).field_a[var2 + 7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var4 = var4 + ((jb) this).field_d[var2 - -1];
                var8 = var8 + ((jb) this).field_d[var2 + 5];
                var10 = var10 + ((jb) this).field_d[7 + var2];
                var6 = var6 + ((jb) this).field_d[var2 + 3];
                var9 = var9 + ((jb) this).field_d[6 + var2];
                var7 = var7 + ((jb) this).field_d[var2 - -4];
                var5 = var5 + ((jb) this).field_d[2 + var2];
                var3 = var3 + ((jb) this).field_d[var2];
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
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((jb) this).field_a[var2] = var3;
                ((jb) this).field_a[var2 + 1] = var4;
                ((jb) this).field_a[var2 - -2] = var5;
                ((jb) this).field_a[var2 - -3] = var6;
                ((jb) this).field_a[4 + var2] = var7;
                ((jb) this).field_a[var2 - -5] = var8;
                ((jb) this).field_a[var2 + 6] = var9;
                ((jb) this).field_a[7 + var2] = var10;
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
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 16;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << 10;
            var8 = var8 + var9;
            var10 = var10 + var7;
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

    final int d(int param0) {
        if (((jb) this).field_b == 0) {
            this.a((byte) 100);
            ((jb) this).field_b = 256;
        }
        if (param0 != 3) {
            return 22;
        }
        int fieldTemp$0 = ((jb) this).field_b - 1;
        ((jb) this).field_b = ((jb) this).field_b - 1;
        return ((jb) this).field_d[fieldTemp$0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new long[32];
        field_h = new int[128];
    }
}
