/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static wk[] field_k;
    private int[] field_e;
    private int[] field_c;
    static je field_i;
    private int field_f;
    static wk[] field_a;
    private int field_j;
    static kd field_g;
    private int field_b;
    static String field_d;
    private int field_h;

    private final void b(boolean param0) {
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
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        var9 = -1640531527;
        var4 = -1640531527;
        var5 = -1640531527;
        var7 = -1640531527;
        var8 = -1640531527;
        var10 = -1640531527;
        var3 = -1640531527;
        var6 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (256 <= var2) {
                var2 = 0;
                L2: while (true) {
                  if (256 <= var2) {
                    this.a(true);
                    ((ga) this).field_b = 256;
                    return;
                  } else {
                    var5 = var5 + ((ga) this).field_c[var2 + 2];
                    var7 = var7 + ((ga) this).field_c[4 + var2];
                    var3 = var3 + ((ga) this).field_c[var2];
                    var4 = var4 + ((ga) this).field_c[var2 - -1];
                    var6 = var6 + ((ga) this).field_c[var2 - -3];
                    var10 = var10 + ((ga) this).field_c[var2 - -7];
                    var8 = var8 + ((ga) this).field_c[5 + var2];
                    var9 = var9 + ((ga) this).field_c[var2 - -6];
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
                    ((ga) this).field_c[var2] = var3;
                    ((ga) this).field_c[var2 + 1] = var4;
                    ((ga) this).field_c[var2 + 2] = var5;
                    ((ga) this).field_c[var2 + 3] = var6;
                    ((ga) this).field_c[var2 + 4] = var7;
                    ((ga) this).field_c[var2 + 5] = var8;
                    ((ga) this).field_c[6 + var2] = var9;
                    ((ga) this).field_c[var2 - -7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var3 = var3 + ((ga) this).field_e[var2];
                var10 = var10 + ((ga) this).field_e[7 + var2];
                var5 = var5 + ((ga) this).field_e[2 + var2];
                var8 = var8 + ((ga) this).field_e[var2 - -5];
                var7 = var7 + ((ga) this).field_e[var2 + 4];
                var6 = var6 + ((ga) this).field_e[3 + var2];
                var9 = var9 + ((ga) this).field_e[6 + var2];
                var4 = var4 + ((ga) this).field_e[var2 - -1];
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
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << 8;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 9;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((ga) this).field_c[var2] = var3;
                ((ga) this).field_c[var2 + 1] = var4;
                ((ga) this).field_c[var2 - -2] = var5;
                ((ga) this).field_c[var2 + 3] = var6;
                ((ga) this).field_c[4 + var2] = var7;
                ((ga) this).field_c[var2 - -5] = var8;
                ((ga) this).field_c[6 + var2] = var9;
                ((ga) this).field_c[var2 - -7] = var10;
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
            var2++;
            continue L0;
          }
        }
    }

    public static void b(int param0) {
        int var1 = 34;
        field_i = null;
        field_d = null;
        field_g = null;
        field_k = null;
        field_a = null;
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int fieldTemp$3 = ((ga) this).field_h + 1;
        ((ga) this).field_h = ((ga) this).field_h + 1;
        ((ga) this).field_j = ((ga) this).field_j + fieldTemp$3;
        if (param0) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= 256) {
              return;
            } else {
              L1: {
                var3 = ((ga) this).field_c[var2];
                if ((var2 & 2) != 0) {
                  if ((var2 & 1) == 0) {
                    ((ga) this).field_f = ((ga) this).field_f ^ ((ga) this).field_f << 2;
                    break L1;
                  } else {
                    ((ga) this).field_f = ((ga) this).field_f ^ ((ga) this).field_f >>> 16;
                    break L1;
                  }
                } else {
                  if (0 != (1 & var2)) {
                    ((ga) this).field_f = ((ga) this).field_f ^ ((ga) this).field_f >>> 6;
                    break L1;
                  } else {
                    ((ga) this).field_f = ((ga) this).field_f ^ ((ga) this).field_f << 13;
                    break L1;
                  }
                }
              }
              ((ga) this).field_f = ((ga) this).field_f + ((ga) this).field_c[var2 + 128 & 255];
              int dupTemp$4 = ((ga) this).field_j + (((ga) this).field_c[rn.a(255, var3 >> 2)] + ((ga) this).field_f);
              var4 = dupTemp$4;
              ((ga) this).field_c[var2] = dupTemp$4;
              int dupTemp$5 = ((ga) this).field_c[rn.a(var4 >> 8, 1020) >> 2] + var3;
              ((ga) this).field_j = dupTemp$5;
              ((ga) this).field_e[var2] = dupTemp$5;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final int a(int param0) {
        if (0 == ((ga) this).field_b) {
            this.a(true);
            ((ga) this).field_b = 256;
        }
        if (param0 != 256) {
            this.a(false);
        }
        int fieldTemp$0 = ((ga) this).field_b - 1;
        ((ga) this).field_b = ((ga) this).field_b - 1;
        return ((ga) this).field_e[fieldTemp$0];
    }

    ga(int[] param0) {
        int var2_int = 0;
        try {
            ((ga) this).field_e = new int[256];
            ((ga) this).field_c = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                ((ga) this).field_e[var2_int] = param0[var2_int];
            }
            this.b(true);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ga.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
