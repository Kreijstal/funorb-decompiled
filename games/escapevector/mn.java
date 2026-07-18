/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends hg {
    static int field_n;
    la[] field_r;
    int field_g;
    int field_i;
    byte[][][] field_l;
    int[] field_o;
    la[] field_p;
    static ab field_h;
    int[] field_m;
    static ph field_q;
    static int field_k;
    int[] field_j;

    final static String a(int param0, char param1) {
        int var4 = 0;
        int var6 = EscapeVector.field_A;
        char[] var7 = new char[20];
        char[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var7[var4] = param1;
        }
        int var5 = 26;
        return new String(var7);
    }

    final static void d() {
        int var3 = 0;
        int var1 = lh.b((byte) 71) ? 1 : 0;
        if (!(rc.field_a != null)) {
            kh.a(var1 != 0, -1230, false);
            return;
        }
        int var2 = vh.f(98);
        if (!(rc.field_a.field_f == var2)) {
            var3 = rc.field_a.field_h ? 1 : 0;
            kh.a(var1 != 0, -1230, var3 != 0);
            return;
        }
    }

    final static void a(int param0, byte param1) {
        if (!(bk.field_r == null)) {
            bk.field_r.b(-1, param0);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              em.e(param1, param2, 1 + param3, 10000536);
              em.e(param1, param4 + param2, param3 - -1, 12105912);
              var5_int = 1;
              var6 = param4;
              if (em.field_k > var5_int + param2) {
                var5_int = em.field_k - param2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 + var6 > em.field_j) {
                var6 = -param2 + em.field_j;
                break L2;
              } else {
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var6 <= var7) {
                break L0;
              } else {
                var8 = var7 * 48 / param4 + 152;
                var9 = var8 << 16 | var8 << 8 | var8;
                em.field_i[param1 + em.field_l * (var7 + param2)] = var9;
                em.field_i[param3 + (param1 + (param2 - -var7) * em.field_l)] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var5, "mn.D(" + -27951 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a() {
        field_h = null;
        field_q = null;
    }

    mn() {
    }

    static {
    }
}
