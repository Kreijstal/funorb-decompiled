/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    private int field_h;
    private long field_a;
    static String[] field_f;
    private long[][] field_c;
    private int field_g;
    static byte[][] field_e;
    private int field_b;
    private Object[][] field_d;

    final Object b(int param0) {
        Object[] var2 = null;
        long[] var3 = null;
        Object var4 = null;
        int var5 = 0;
        Object[] var6 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (0 <= ((ld) this).field_g) {
          var6 = ((ld) this).field_d[(int)((long)(-1 + ((ld) this).field_b) & ((ld) this).field_a)];
          var2 = var6;
          var3 = ((ld) this).field_c[(int)(((ld) this).field_a & (long)(((ld) this).field_b + -1))];
          L0: while (true) {
            L1: {
              if (var6.length <= ((ld) this).field_g) {
                break L1;
              } else {
                var4 = var6[((ld) this).field_g];
                if (var4 == null) {
                  break L1;
                } else {
                  ((ld) this).field_g = ((ld) this).field_g + 1;
                  if ((((ld) this).field_a ^ -1L) == (var3[((ld) this).field_g] ^ -1L)) {
                    return var4;
                  } else {
                    continue L0;
                  }
                }
              }
            }
            ((ld) this).field_g = param0;
            return null;
          }
        } else {
          return null;
        }
    }

    final Object a(int param0, long param1) {
        if (param0 > -123) {
            field_f = null;
        }
        ((ld) this).field_a = param1;
        ((ld) this).field_g = 0;
        return ((ld) this).b(-1);
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        if (param0 < 75) {
            field_f = null;
        }
    }

    final void a(Object param0, byte param1, long param2) {
        Object[] var5 = null;
        long[] var6 = null;
        int var7_int = 0;
        Object[] var7 = null;
        long[] var8 = null;
        int var9 = 0;
        Object[] var10 = null;
        long[] var11 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        if (param0 == null) {
          throw new IllegalArgumentException();
        } else {
          var10 = ((ld) this).field_d[(int)((long)(-1 + ((ld) this).field_b) & param2)];
          var5 = var10;
          var11 = ((ld) this).field_c[(int)((long)(((ld) this).field_b + -1) & param2)];
          var6 = var11;
          var7_int = 0;
          L0: while (true) {
            if (var7_int >= var10.length) {
              if (param1 == 26) {
                var7 = var5;
                var8 = var6;
                var5 = new Object[var7.length + ((ld) this).field_h];
                ((ld) this).field_d[(int)ej.a((long)(((ld) this).field_b + -1), param2)] = new Object[var7.length + ((ld) this).field_h];
                var6 = new long[var8.length + ((ld) this).field_h];
                ((ld) this).field_c[(int)ej.a(param2, (long)(-1 + ((ld) this).field_b))] = new long[var8.length + ((ld) this).field_h];
                ji.a(var7, 0, var5, 0, var7.length);
                ji.a(var8, 0, var6, 0, var8.length);
                var5[var7.length] = param0;
                var6[var8.length] = param2;
                return;
              } else {
                return;
              }
            } else {
              if (var10[var7_int] == null) {
                var5[var7_int] = param0;
                var11[var7_int] = param2;
                return;
              } else {
                var7_int++;
                continue L0;
              }
            }
          }
        }
    }

    ld(int param0, int param1, int param2) {
        int var4 = 0;
        ((ld) this).field_h = param2;
        ((ld) this).field_b = param0;
        ((ld) this).field_d = new Object[((ld) this).field_b][];
        ((ld) this).field_c = new long[((ld) this).field_b][];
        for (var4 = 0; ((ld) this).field_b > var4; var4++) {
            ((ld) this).field_d[var4] = new Object[param1];
            ((ld) this).field_c[var4] = new long[param1];
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"By rating", "By win percentage"};
    }
}
