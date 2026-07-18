/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static volatile int field_l;
    static ci field_k;
    static String field_h;
    private int field_b;
    private int[] field_a;
    static String field_g;
    static og field_f;
    private int field_d;
    static String field_j;
    private int field_e;
    private int field_c;
    private int[] field_i;

    public static void a(boolean param0) {
        field_f = null;
        field_h = null;
        field_k = null;
        field_g = null;
        field_j = null;
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        int fieldTemp$3 = ((qe) this).field_c + 1;
        ((qe) this).field_c = ((qe) this).field_c + 1;
        ((qe) this).field_e = ((qe) this).field_e + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L1: {
              var3 = ((qe) this).field_a[var2];
              if ((2 & var2) != 0) {
                if (0 != (var2 & 1)) {
                  ((qe) this).field_b = ((qe) this).field_b ^ ((qe) this).field_b >>> 16;
                  break L1;
                } else {
                  ((qe) this).field_b = ((qe) this).field_b ^ ((qe) this).field_b << 2;
                  break L1;
                }
              } else {
                if ((var2 & 1) == 0) {
                  ((qe) this).field_b = ((qe) this).field_b ^ ((qe) this).field_b << 13;
                  break L1;
                } else {
                  ((qe) this).field_b = ((qe) this).field_b ^ ((qe) this).field_b >>> 6;
                  break L1;
                }
              }
            }
            ((qe) this).field_b = ((qe) this).field_b + ((qe) this).field_a[128 + var2 & 255];
            int dupTemp$4 = ((qe) this).field_e + (((qe) this).field_a[dg.a(var3, 1020) >> 2] - -((qe) this).field_b);
            var4 = dupTemp$4;
            ((qe) this).field_a[var2] = dupTemp$4;
            int dupTemp$5 = ((qe) this).field_a[dg.a(var4, 261306) >> 8 >> 2] + var3;
            ((qe) this).field_e = dupTemp$5;
            ((qe) this).field_i[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

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
        var11 = Terraphoenix.field_V;
        var6 = -1640531527;
        var3 = -1640531527;
        var8 = -1640531527;
        var4 = -1640531527;
        var9 = -1640531527;
        var10 = -1640531527;
        var5 = -1640531527;
        var7 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (256 <= var2) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    int discarded$1 = -38;
                    this.a();
                    ((qe) this).field_d = 256;
                    return;
                  } else {
                    var9 = var9 + ((qe) this).field_a[var2 - -6];
                    var4 = var4 + ((qe) this).field_a[1 + var2];
                    var8 = var8 + ((qe) this).field_a[5 + var2];
                    var5 = var5 + ((qe) this).field_a[var2 - -2];
                    var3 = var3 + ((qe) this).field_a[var2];
                    var6 = var6 + ((qe) this).field_a[3 + var2];
                    var10 = var10 + ((qe) this).field_a[var2 - -7];
                    var7 = var7 + ((qe) this).field_a[var2 + 4];
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
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 8;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 9;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((qe) this).field_a[var2] = var3;
                    ((qe) this).field_a[1 + var2] = var4;
                    ((qe) this).field_a[var2 + 2] = var5;
                    ((qe) this).field_a[var2 - -3] = var6;
                    ((qe) this).field_a[var2 - -4] = var7;
                    ((qe) this).field_a[var2 - -5] = var8;
                    ((qe) this).field_a[6 + var2] = var9;
                    ((qe) this).field_a[var2 + 7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var6 = var6 + ((qe) this).field_i[var2 - -3];
                var7 = var7 + ((qe) this).field_i[4 + var2];
                var4 = var4 + ((qe) this).field_i[var2 - -1];
                var5 = var5 + ((qe) this).field_i[var2 - -2];
                var9 = var9 + ((qe) this).field_i[var2 - -6];
                var8 = var8 + ((qe) this).field_i[5 + var2];
                var10 = var10 + ((qe) this).field_i[var2 - -7];
                var3 = var3 + ((qe) this).field_i[var2];
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
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << 8;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 9;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((qe) this).field_a[var2] = var3;
                ((qe) this).field_a[1 + var2] = var4;
                ((qe) this).field_a[2 + var2] = var5;
                ((qe) this).field_a[3 + var2] = var6;
                ((qe) this).field_a[4 + var2] = var7;
                ((qe) this).field_a[var2 - -5] = var8;
                ((qe) this).field_a[6 + var2] = var9;
                ((qe) this).field_a[var2 - -7] = var10;
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
            var3 = var3 + var8;
            var9 = var9 + var10;
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
        if (param0 < 64) {
            ((qe) this).field_e = -7;
        }
        if (((qe) this).field_d == 0) {
            int discarded$0 = -38;
            this.a();
            ((qe) this).field_d = 256;
        }
        int fieldTemp$1 = ((qe) this).field_d - 1;
        ((qe) this).field_d = ((qe) this).field_d - 1;
        return ((qe) this).field_i[fieldTemp$1];
    }

    final static void a(int param0, fa param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ee var5 = null;
        int[] var6 = null;
        int var7 = 0;
        uc var8 = null;
        int var9 = 0;
        uc var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            var8 = new uc(param1.a("logo.fo3d", "", -21653));
            var10 = var8;
            var3 = var10.a(-16384);
            var10.k(-1694261224);
            qk.field_l = ig.a(-25831, var10);
            cm.field_b = new ee[var3];
            vh.field_j = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if (var3 <= var4) {
                var10.n(8);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var9 >= var3) {
                    break L0;
                  } else {
                    var5 = cm.field_b[var9];
                    var5.a(true, 6, 6, 1, 6);
                    var5.c((byte) 41);
                    var6 = new int[]{var5.field_K + var5.field_r >> 1, var5.field_a + var5.field_M >> 1, var5.field_t + var5.field_v >> 1};
                    vh.field_j[var9] = var6;
                    var5.a(true, -var6[2], -var6[0], -var6[1]);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                cm.field_b[var4] = fc.a(11043, var8);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("qe.B(").append(-28664).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    qe(int[] param0) {
        int var2_int = 0;
        try {
            ((qe) this).field_i = new int[256];
            ((qe) this).field_a = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((qe) this).field_i[var2_int] = param0[var2_int];
            }
            int discarded$0 = -1;
            this.b();
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "qe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Grunt with shielded armour";
        field_h = "Unpacking graphics";
        field_l = 0;
        field_j = "KPA-B";
    }
}
