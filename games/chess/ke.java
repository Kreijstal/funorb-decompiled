/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static String field_e;
    static int field_d;
    private int field_k;
    private int[] field_j;
    static km[] field_g;
    private int field_m;
    static String field_b;
    static String field_l;
    private int field_h;
    static String[] field_i;
    private int field_f;
    static String field_c;
    private int[] field_a;

    final static int a(byte[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = ci.a(-82, param0, 0, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ke.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 21106 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final int b(int param0) {
        if (!(param0 != ~((ke) this).field_k)) {
            this.a(true);
            ((ke) this).field_k = 256;
        }
        int fieldTemp$0 = ((ke) this).field_k - 1;
        ((ke) this).field_k = ((ke) this).field_k - 1;
        return ((ke) this).field_a[fieldTemp$0];
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Chess.field_G;
        int fieldTemp$3 = ((ke) this).field_h + 1;
        ((ke) this).field_h = ((ke) this).field_h + 1;
        ((ke) this).field_f = ((ke) this).field_f + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L1: {
              var3 = ((ke) this).field_j[var2];
              if ((2 & var2) == -1) {
                if ((var2 & 1) == 0) {
                  ((ke) this).field_m = ((ke) this).field_m ^ ((ke) this).field_m << 13;
                  break L1;
                } else {
                  ((ke) this).field_m = ((ke) this).field_m ^ ((ke) this).field_m >>> 6;
                  break L1;
                }
              } else {
                if (-1 != (var2 & 1)) {
                  ((ke) this).field_m = ((ke) this).field_m ^ ((ke) this).field_m >>> 16;
                  break L1;
                } else {
                  ((ke) this).field_m = ((ke) this).field_m ^ ((ke) this).field_m << 2;
                  break L1;
                }
              }
            }
            ((ke) this).field_m = ((ke) this).field_m + ((ke) this).field_j[255 & var2 + 128];
            int dupTemp$4 = ((ke) this).field_m + ((ke) this).field_j[ce.a(1020, var3) >> 2] - -((ke) this).field_f;
            var4 = dupTemp$4;
            ((ke) this).field_j[var2] = dupTemp$4;
            int dupTemp$5 = var3 + ((ke) this).field_j[ce.a(var4, 261311) >> 8 >> 2];
            ((ke) this).field_f = dupTemp$5;
            ((ke) this).field_a[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, String param5) {
        int var7 = 0;
        nk var8 = qn.field_U;
        nk var6 = var8;
        var8.f(param3, -58);
        var8.field_l = var8.field_l + 1;
        try {
            var7 = var8.field_l;
            var8.c(param1, (byte) 127);
            if (param1 == 2) {
                var8.a(-99, param2);
            }
            if (param5 == null) {
                var8.b(param4, 119);
            } else {
                int discarded$0 = 16711422;
                int discarded$1 = rm.a((p) (Object) var8, param5);
            }
            var8.a(-var7 + var8.field_l, -1);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ke.A(" + 9822 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
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
        var11 = Chess.field_G;
        var5 = -1640531527;
        var9 = -1640531527;
        var3 = -1640531527;
        var4 = -1640531527;
        var6 = -1640531527;
        var8 = -1640531527;
        var7 = -1640531527;
        var10 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (256 <= var2) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.a(true);
                    ((ke) this).field_k = 256;
                    return;
                  } else {
                    var8 = var8 + ((ke) this).field_j[5 + var2];
                    var6 = var6 + ((ke) this).field_j[3 + var2];
                    var7 = var7 + ((ke) this).field_j[var2 - -4];
                    var4 = var4 + ((ke) this).field_j[var2 - -1];
                    var10 = var10 + ((ke) this).field_j[var2 + 7];
                    var9 = var9 + ((ke) this).field_j[var2 + 6];
                    var3 = var3 + ((ke) this).field_j[var2];
                    var5 = var5 + ((ke) this).field_j[2 + var2];
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
                    ((ke) this).field_j[var2] = var3;
                    ((ke) this).field_j[var2 - -1] = var4;
                    ((ke) this).field_j[var2 - -2] = var5;
                    ((ke) this).field_j[3 + var2] = var6;
                    ((ke) this).field_j[var2 - -4] = var7;
                    ((ke) this).field_j[var2 - -5] = var8;
                    ((ke) this).field_j[6 + var2] = var9;
                    ((ke) this).field_j[var2 - -7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var6 = var6 + ((ke) this).field_a[3 + var2];
                var5 = var5 + ((ke) this).field_a[2 + var2];
                var9 = var9 + ((ke) this).field_a[var2 - -6];
                var8 = var8 + ((ke) this).field_a[var2 + 5];
                var4 = var4 + ((ke) this).field_a[var2 + 1];
                var10 = var10 + ((ke) this).field_a[7 + var2];
                var3 = var3 + ((ke) this).field_a[var2];
                var7 = var7 + ((ke) this).field_a[4 + var2];
                var3 = var3 ^ var4 << 11;
                var6 = var6 + var3;
                var4 = var4 + var5;
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
                ((ke) this).field_j[var2] = var3;
                ((ke) this).field_j[1 + var2] = var4;
                ((ke) this).field_j[var2 - -2] = var5;
                ((ke) this).field_j[var2 + 3] = var6;
                ((ke) this).field_j[var2 - -4] = var7;
                ((ke) this).field_j[var2 - -5] = var8;
                ((ke) this).field_j[6 + var2] = var9;
                ((ke) this).field_j[var2 - -7] = var10;
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

    final static lb a(int param0) {
        return rm.field_M;
    }

    public static void a() {
        field_i = null;
        int var1 = 0;
        field_b = null;
        field_e = null;
        field_l = null;
        field_c = null;
        field_g = null;
    }

    ke(int[] param0) {
        int var2_int = 0;
        try {
            ((ke) this).field_a = new int[256];
            ((ke) this).field_j = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((ke) this).field_a[var2_int] = param0[var2_int];
            }
            int discarded$0 = 41;
            this.b();
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ke.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 3;
        field_b = "Ignore";
        field_l = "Spectate";
        field_i = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_c = "The game options are not all set.";
        field_e = "You are playing as <%0>";
    }
}
