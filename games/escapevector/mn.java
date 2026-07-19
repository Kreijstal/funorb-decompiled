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

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var6 = EscapeVector.field_A;
        char[] var7 = new char[param2];
        char[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var7[var4] = param1;
        }
        int var5 = 53 / ((49 - param0) / 63);
        return new String(var7);
    }

    final static void d(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        if (param0 >= -112) {
            mn.a(81, (byte) 59);
            var1 = lh.b((byte) 71) ? 1 : 0;
            if (!(rc.field_a != null)) {
                kh.a(var1 != 0, -1230, false);
                return;
            }
            var2 = vh.f(98);
            if (!(rc.field_a.field_f == var2)) {
                var3 = rc.field_a.field_h ? 1 : 0;
                kh.a(var1 != 0, -1230, var3 != 0);
                return;
            }
            return;
        }
        var1 = lh.b((byte) 71) ? 1 : 0;
        if (!(rc.field_a != null)) {
            kh.a(var1 != 0, -1230, false);
            return;
        }
        var2 = vh.f(98);
        if (!(rc.field_a.field_f == var2)) {
            var3 = rc.field_a.field_h ? 1 : 0;
            kh.a(var1 != 0, -1230, var3 != 0);
            return;
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 != 44) {
          L0: {
            field_n = -42;
            if (bk.field_r != null) {
              bk.field_r.b(-1, param0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (bk.field_r != null) {
              bk.field_r.b(-1, param0);
              break L1;
            } else {
              break L1;
            }
          }
          return;
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
        int decompiledRegionSelector0 = 0;
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
            if (param0 == -27951) {
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
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = var7 * 48 / param4 + 152;
                  var9 = var8 << 101571248 | var8 << -1960417720 | var8;
                  em.field_i[param1 + em.field_l * (var7 + param2)] = var9;
                  em.field_i[param3 + (param1 + (param2 - -var7) * em.field_l)] = var9;
                  var7++;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var5), "mn.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 < 70) {
            mn.a(86, -71, -62, 90, 61);
            field_q = null;
            return;
        }
        field_q = null;
    }

    mn() {
    }

    static {
    }
}
