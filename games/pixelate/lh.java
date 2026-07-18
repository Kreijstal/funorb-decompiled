/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    private int[] field_c;
    static ak field_b;
    private int field_d;
    private int[] field_h;
    private int field_i;
    static boolean field_g;
    static String field_j;
    private int field_f;
    private int field_e;
    static String field_a;

    final static hh a(int param0, fm param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (rk.a(param2, false, param1, param0)) {
            int discarded$2 = -103;
            return tj.b();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("lh.E(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ',' + 119 + ')');
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
        int var12 = 0;
        var12 = Pixelate.field_H ? 1 : 0;
        var9 = -1640531527;
        var5 = -1640531527;
        var7 = -1640531527;
        var3 = -1640531527;
        var4 = -1640531527;
        var6 = -1640531527;
        var11 = 0;
        var8 = -1640531527;
        var10 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    int discarded$1 = 0;
                    this.a();
                    ((lh) this).field_e = 256;
                    return;
                  } else {
                    var3 = var3 + ((lh) this).field_c[var2];
                    var10 = var10 + ((lh) this).field_c[7 + var2];
                    var4 = var4 + ((lh) this).field_c[var2 + 1];
                    var9 = var9 + ((lh) this).field_c[6 + var2];
                    var5 = var5 + ((lh) this).field_c[var2 - -2];
                    var7 = var7 + ((lh) this).field_c[var2 + 4];
                    var6 = var6 + ((lh) this).field_c[3 + var2];
                    var8 = var8 + ((lh) this).field_c[5 + var2];
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
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    ((lh) this).field_c[var2] = var3;
                    ((lh) this).field_c[1 + var2] = var4;
                    ((lh) this).field_c[var2 + 2] = var5;
                    ((lh) this).field_c[3 + var2] = var6;
                    ((lh) this).field_c[4 + var2] = var7;
                    ((lh) this).field_c[5 + var2] = var8;
                    ((lh) this).field_c[6 + var2] = var9;
                    ((lh) this).field_c[var2 + 7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var3 = var3 + ((lh) this).field_h[var2];
                var7 = var7 + ((lh) this).field_h[4 + var2];
                var4 = var4 + ((lh) this).field_h[var2 - -1];
                var8 = var8 + ((lh) this).field_h[var2 + 5];
                var10 = var10 + ((lh) this).field_h[var2 + 7];
                var5 = var5 + ((lh) this).field_h[2 + var2];
                var6 = var6 + ((lh) this).field_h[3 + var2];
                var9 = var9 + ((lh) this).field_h[6 + var2];
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
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 9;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((lh) this).field_c[var2] = var3;
                ((lh) this).field_c[var2 - -1] = var4;
                ((lh) this).field_c[var2 - -2] = var5;
                ((lh) this).field_c[3 + var2] = var6;
                ((lh) this).field_c[4 + var2] = var7;
                ((lh) this).field_c[5 + var2] = var8;
                ((lh) this).field_c[6 + var2] = var9;
                ((lh) this).field_c[7 + var2] = var10;
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
            var9 = var9 + var6;
            var7 = var7 + var8;
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
            var2++;
            continue L0;
          }
        }
    }

    final int a(int param0) {
        if (!(0 != ((lh) this).field_e)) {
            int discarded$0 = 0;
            this.a();
            ((lh) this).field_e = 256;
        }
        if (param0 != 256) {
            ((lh) this).field_f = -113;
        }
        int fieldTemp$1 = ((lh) this).field_e - 1;
        ((lh) this).field_e = ((lh) this).field_e - 1;
        return ((lh) this).field_h[fieldTemp$1];
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        int fieldTemp$3 = ((lh) this).field_d + 1;
        ((lh) this).field_d = ((lh) this).field_d + 1;
        ((lh) this).field_i = ((lh) this).field_i + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L1: {
              var3 = ((lh) this).field_c[var2];
              if ((2 & var2) == 0) {
                if (0 != (var2 & 1)) {
                  ((lh) this).field_f = ((lh) this).field_f ^ ((lh) this).field_f >>> 6;
                  break L1;
                } else {
                  ((lh) this).field_f = ((lh) this).field_f ^ ((lh) this).field_f << 13;
                  break L1;
                }
              } else {
                if ((1 & var2) != 0) {
                  ((lh) this).field_f = ((lh) this).field_f ^ ((lh) this).field_f >>> 16;
                  break L1;
                } else {
                  ((lh) this).field_f = ((lh) this).field_f ^ ((lh) this).field_f << 2;
                  break L1;
                }
              }
            }
            ((lh) this).field_f = ((lh) this).field_f + ((lh) this).field_c[255 & var2 + 128];
            int dupTemp$4 = ((lh) this).field_i + ((lh) this).field_f + ((lh) this).field_c[cm.a(255, var3 >> 2)];
            var4 = dupTemp$4;
            ((lh) this).field_c[var2] = dupTemp$4;
            int dupTemp$5 = ((lh) this).field_c[cm.a(255, var4 >> 8 >> 2)] + var3;
            ((lh) this).field_i = dupTemp$5;
            ((lh) this).field_h[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    public static void c() {
        field_a = null;
        field_b = null;
        field_j = null;
    }

    final static ld a(fm param0, int param1, int param2, fm param3, int param4) {
        RuntimeException var5 = null;
        ld stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ld stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (rk.a(param4, false, param0, param1)) {
              stackOut_3_0 = on.a(param3.a(param1, param4, true), 26);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("lh.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(48077700).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param4 + ')');
        }
        return stackIn_4_0;
    }

    lh(int[] param0) {
        int var2_int = 0;
        try {
            ((lh) this).field_h = new int[256];
            ((lh) this).field_c = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                ((lh) this).field_h[var2_int] = param0[var2_int];
            }
            int discarded$0 = -60;
            this.b();
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "lh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Security";
        field_a = "Please try again in a few minutes.";
    }
}
