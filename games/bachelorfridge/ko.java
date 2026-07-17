/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    private int[] field_b;
    private int field_i;
    private int field_d;
    static int field_e;
    private int field_a;
    private int[] field_c;
    static kga field_f;
    private int field_j;
    static vr field_g;
    static String field_h;

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        int fieldTemp$3 = ((ko) this).field_d + 1;
        ((ko) this).field_d = ((ko) this).field_d + 1;
        ((ko) this).field_i = ((ko) this).field_i + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L1: {
              var3 = ((ko) this).field_c[var2];
              if (0 == (2 & var2)) {
                if ((var2 & 1) != 0) {
                  ((ko) this).field_j = ((ko) this).field_j ^ ((ko) this).field_j >>> 6;
                  break L1;
                } else {
                  ((ko) this).field_j = ((ko) this).field_j ^ ((ko) this).field_j << 13;
                  break L1;
                }
              } else {
                if ((1 & var2) == 0) {
                  ((ko) this).field_j = ((ko) this).field_j ^ ((ko) this).field_j << 2;
                  break L1;
                } else {
                  ((ko) this).field_j = ((ko) this).field_j ^ ((ko) this).field_j >>> 16;
                  break L1;
                }
              }
            }
            ((ko) this).field_j = ((ko) this).field_j + ((ko) this).field_c[255 & var2 + 128];
            int dupTemp$4 = ((ko) this).field_i + (((ko) this).field_j + ((ko) this).field_c[dda.a(var3, 1020) >> 2]);
            var4 = dupTemp$4;
            ((ko) this).field_c[var2] = dupTemp$4;
            int dupTemp$5 = var3 + ((ko) this).field_c[dda.a(var4 >> 8 >> 2, 255)];
            ((ko) this).field_i = dupTemp$5;
            ((ko) this).field_b[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(int param0, byte param1) {
        if (bp.e(-29919)) {
            return;
        }
        sja.field_fb.c(94, (byte) 115);
        int var2 = -5 / ((param1 - -18) / 51);
        sja.field_fb.d(param0, 0);
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
        int var12 = 0;
        var12 = BachelorFridge.field_y;
        var5 = -1640531527;
        var6 = -1640531527;
        var9 = -1640531527;
        var4 = -1640531527;
        var10 = -1640531527;
        var3 = -1640531527;
        var7 = -1640531527;
        var8 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            var11 = 77;
            L1: while (true) {
              if (256 <= var2) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.a(false);
                    ((ko) this).field_a = 256;
                    return;
                  } else {
                    var8 = var8 + ((ko) this).field_c[var2 + 5];
                    var3 = var3 + ((ko) this).field_c[var2];
                    var10 = var10 + ((ko) this).field_c[var2 + 7];
                    var4 = var4 + ((ko) this).field_c[1 + var2];
                    var7 = var7 + ((ko) this).field_c[4 + var2];
                    var9 = var9 + ((ko) this).field_c[6 + var2];
                    var5 = var5 + ((ko) this).field_c[2 + var2];
                    var6 = var6 + ((ko) this).field_c[3 + var2];
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
                    ((ko) this).field_c[var2] = var3;
                    ((ko) this).field_c[1 + var2] = var4;
                    ((ko) this).field_c[2 + var2] = var5;
                    ((ko) this).field_c[3 + var2] = var6;
                    ((ko) this).field_c[4 + var2] = var7;
                    ((ko) this).field_c[5 + var2] = var8;
                    ((ko) this).field_c[var2 - -6] = var9;
                    ((ko) this).field_c[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var5 = var5 + ((ko) this).field_b[var2 + 2];
                var4 = var4 + ((ko) this).field_b[var2 - -1];
                var6 = var6 + ((ko) this).field_b[3 + var2];
                var7 = var7 + ((ko) this).field_b[4 + var2];
                var10 = var10 + ((ko) this).field_b[var2 + 7];
                var8 = var8 + ((ko) this).field_b[var2 + 5];
                var9 = var9 + ((ko) this).field_b[6 + var2];
                var3 = var3 + ((ko) this).field_b[var2];
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
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((ko) this).field_c[var2] = var3;
                ((ko) this).field_c[1 + var2] = var4;
                ((ko) this).field_c[var2 + 2] = var5;
                ((ko) this).field_c[3 + var2] = var6;
                ((ko) this).field_c[var2 - -4] = var7;
                ((ko) this).field_c[var2 - -5] = var8;
                ((ko) this).field_c[var2 - -6] = var9;
                ((ko) this).field_c[7 + var2] = var10;
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

    final int a(int param0, int param1) {
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        if (0 >= param1) {
            throw new IllegalArgumentException();
        }
        if (param0 != -21000) {
            ((ko) this).field_i = -67;
        }
        int var3 = 2147483647 + -(int)(4294967296L % (long)param1);
        do {
            var4 = ((ko) this).b(28602);
        } while (var3 < var4);
        return sg.a(param1, 1816304479, var4);
    }

    final int b(int param0) {
        if (!(0 != ((ko) this).field_a)) {
            this.a(false);
            ((ko) this).field_a = 256;
        }
        if (param0 != 28602) {
            ((ko) this).field_c = null;
        }
        int fieldTemp$0 = ((ko) this).field_a - 1;
        ((ko) this).field_a = ((ko) this).field_a - 1;
        return ((ko) this).field_b[fieldTemp$0];
    }

    public static void a(byte param0) {
        if (param0 >= -41) {
            ko.a(35, (byte) -68);
        }
        field_h = null;
        field_g = null;
        field_f = null;
    }

    ko(int[] param0) {
        int var2_int = 0;
        try {
            ((ko) this).field_b = new int[256];
            ((ko) this).field_c = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                ((ko) this).field_b[var2_int] = param0[var2_int];
            }
            this.a(48);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ko.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 20;
        field_h = "Members";
    }
}
