/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    String field_l;
    static sj field_e;
    String field_g;
    int field_d;
    bj field_j;
    static String field_a;
    static ta field_k;
    String field_m;
    static ea field_h;
    private static int[] field_c;
    static char[] field_n;
    static ta field_b;
    static hg field_f;
    static hg field_o;
    static bj field_i;

    final static String a(byte param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = MinerDisturbance.field_ab;
        var6 = "(" + lc.field_s + " " + rd.field_a + " " + ud.field_a + ") " + oj.field_K;
        var1 = var6;
        if (rj.field_d > 0) {
          var1 = var6 + ":";
          for (var2 = 0; rj.field_d > var2; var2++) {
            var7 = var1 + ' ';
            var1 = var7;
            var3 = kj.field_a.field_u[var2] & 255;
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 >= 10) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            if (var3 < 10) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        if (param0 <= 48) {
          field_e = (sj) null;
        }
        return var1;
    }

    final static void a(bj param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        pb var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ld var8 = null;
        int var9 = 0;
        ld var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = MinerDisturbance.field_ab;
        try {
          if (param1 != 347664612) {
            return;
          }
          var8 = new ld(param0.a("", 0, "logo.fo3d"));
          var10 = var8;
          var3 = var10.d((byte) -54);
          var10.f((byte) 16);
          bl.field_v = tk.a(-123, var10);
          aj.field_b = new pb[var3];
          pa.field_b = new int[var3][];
          for (var4 = 0; var4 < var3; var4++) {
            aj.field_b[var4] = lj.a(var8, (byte) -62);
          }
          var10.o(-98);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var3 > var9) {
            var5 = aj.field_b[var9];
            var5.a(1, 6, 6, 6, (byte) -81);
            var5.a(true);
            var6 = new int[]{var5.field_v + var5.field_H >> 1, var5.field_h + var5.field_l >> 1, var5.field_J + var5.field_j >> 1};
            pa.field_b[var9] = var6;
            var5.a(-var6[2], -var6[1], 0, -var6[0]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("hj.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_a = null;
        if (param0) {
          hj.a(false);
        }
        field_c = null;
        field_b = null;
        field_n = null;
        field_o = null;
        field_k = null;
        field_e = null;
        field_h = null;
        field_f = null;
    }

    private hj() throws Throwable {
        throw new Error();
    }

    static {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_e = new sj("usename");
        field_a = "Just play";
        field_k = new ta();
        field_c = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
          var4 = (long)(-1 + (var0 << 1));
          var6 = (long)((var0 << 1) + 1);
          var2 = (int)((var4 * var4 >> 18) - 32768L);
          var3 = (int)((var6 * var6 >> 18) - 32768L);
          if (field_c.length <= var3) {
            var3 = -1 + field_c.length;
          }
          for (var1 = var2 >= 0 ? var2 : 0; var3 >= var1; var1++) {
            field_c[var1] = var0;
          }
        }
        field_n = new char[128];
        field_b = new ta();
    }
}
