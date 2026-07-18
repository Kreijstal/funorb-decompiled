/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    static int[] field_f;
    private int field_a;
    private int field_e;
    private int[] field_i;
    private int[] field_c;
    private int field_b;
    static af field_d;
    static rf field_h;
    private int field_g;

    private final void a(boolean param0) {
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
        var11 = EscapeVector.field_A;
        var5 = -1640531527;
        var7 = -1640531527;
        var6 = -1640531527;
        var8 = -1640531527;
        var9 = -1640531527;
        var3 = -1640531527;
        var4 = -1640531527;
        var10 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            int discarded$1 = -116;
            df.a();
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.b(-115);
                    ((df) this).field_g = 256;
                    return;
                  } else {
                    var9 = var9 + ((df) this).field_i[6 + var2];
                    var3 = var3 + ((df) this).field_i[var2];
                    var6 = var6 + ((df) this).field_i[var2 + 3];
                    var8 = var8 + ((df) this).field_i[var2 - -5];
                    var4 = var4 + ((df) this).field_i[var2 - -1];
                    var5 = var5 + ((df) this).field_i[2 + var2];
                    var7 = var7 + ((df) this).field_i[var2 - -4];
                    var10 = var10 + ((df) this).field_i[var2 - -7];
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
                    ((df) this).field_i[var2] = var3;
                    ((df) this).field_i[var2 - -1] = var4;
                    ((df) this).field_i[2 + var2] = var5;
                    ((df) this).field_i[3 + var2] = var6;
                    ((df) this).field_i[4 + var2] = var7;
                    ((df) this).field_i[var2 - -5] = var8;
                    ((df) this).field_i[6 + var2] = var9;
                    ((df) this).field_i[var2 - -7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var7 = var7 + ((df) this).field_c[var2 - -4];
                var3 = var3 + ((df) this).field_c[var2];
                var8 = var8 + ((df) this).field_c[5 + var2];
                var9 = var9 + ((df) this).field_c[6 + var2];
                var4 = var4 + ((df) this).field_c[1 + var2];
                var10 = var10 + ((df) this).field_c[var2 + 7];
                var5 = var5 + ((df) this).field_c[var2 + 2];
                var6 = var6 + ((df) this).field_c[3 + var2];
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
                ((df) this).field_i[var2] = var3;
                ((df) this).field_i[var2 - -1] = var4;
                ((df) this).field_i[2 + var2] = var5;
                ((df) this).field_i[3 + var2] = var6;
                ((df) this).field_i[var2 - -4] = var7;
                ((df) this).field_i[5 + var2] = var8;
                ((df) this).field_i[6 + var2] = var9;
                ((df) this).field_i[var2 + 7] = var10;
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
            var9 = var9 + var10;
            var3 = var3 + var8;
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

    final int a(int param0) {
        if (param0 != 1736563940) {
            ((df) this).field_e = -4;
        }
        if (0 == ((df) this).field_g) {
            this.b(-118);
            ((df) this).field_g = 256;
        }
        int fieldTemp$0 = ((df) this).field_g - 1;
        ((df) this).field_g = ((df) this).field_g - 1;
        return ((df) this).field_c[fieldTemp$0];
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = EscapeVector.field_A;
        int fieldTemp$3 = ((df) this).field_a + 1;
        ((df) this).field_a = ((df) this).field_a + 1;
        ((df) this).field_e = ((df) this).field_e + fieldTemp$3;
        if (param0 <= -96) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= 256) {
              return;
            } else {
              L1: {
                var3 = ((df) this).field_i[var2];
                if (0 != (var2 & 2)) {
                  if ((1 & var2) != 0) {
                    ((df) this).field_b = ((df) this).field_b ^ ((df) this).field_b >>> 16;
                    break L1;
                  } else {
                    ((df) this).field_b = ((df) this).field_b ^ ((df) this).field_b << 2;
                    break L1;
                  }
                } else {
                  if ((var2 & 1) != 0) {
                    ((df) this).field_b = ((df) this).field_b ^ ((df) this).field_b >>> 6;
                    break L1;
                  } else {
                    ((df) this).field_b = ((df) this).field_b ^ ((df) this).field_b << 13;
                    break L1;
                  }
                }
              }
              ((df) this).field_b = ((df) this).field_b + ((df) this).field_i[255 & var2 + 128];
              int dupTemp$4 = ((df) this).field_b + (((df) this).field_i[ae.a(var3, 1020) >> 2] - -((df) this).field_e);
              var4 = dupTemp$4;
              ((df) this).field_i[var2] = dupTemp$4;
              int dupTemp$5 = var3 + ((df) this).field_i[ae.a(var4 >> 8, 1020) >> 2];
              ((df) this).field_e = dupTemp$5;
              ((df) this).field_c[var2] = dupTemp$5;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void a() {
        field_f = null;
        field_d = null;
        field_h = null;
    }

    static boolean a(boolean param0, boolean param1) {
        return param0 | param1;
    }

    df(int[] param0) {
        int var2_int = 0;
        try {
            ((df) this).field_i = new int[256];
            ((df) this).field_c = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((df) this).field_c[var2_int] = param0[var2_int];
            }
            this.a(false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "df.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[8192];
        field_h = new rf();
    }
}
