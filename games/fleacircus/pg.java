/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static int field_f;
    static int field_e;
    static int field_c;
    static String field_b;
    static int field_a;
    static int field_d;

    final static void a(int param0, int param1) {
        lh var2 = null;
        int var3 = 0;
        oa var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          if (param0 > -64) {
            pg.a(-11, 18);
          }
          var4 = (oa) (cf.field_d.c((byte) 47));
          while (var4 != null) {
            s.a(var4, param1, false);
            var4 = (oa) (cf.field_d.b((byte) -105));
          }
          var2 = hd.field_a.c((byte) 47);
          while (var2 != null) {
            ef.a(0, param1);
            var2 = hd.field_a.b((byte) -105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2_ref), "pg.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(int param0, int param1, byte[] param2, int param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          var11 = new char[param0];
          var10 = var11;
          var4 = var10;
          var5 = param3;
          for (var6 = 0; param0 > var6; var6++) {
            var7 = param2[var6 + param1] & 255;
            if (var7 != 0) {
              if (128 <= var7 &&
                var7 < 160) {
                var8 = fh.field_e[var7 - 128];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var7;
            }
          }
          stackIn_16_0 = new String(var11, 0, var5);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("pg.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    final static bi[] b(int param0) {
        int var2 = 0;
        int var3 = fleas.field_A ? 1 : 0;
        bi[] var1 = new bi[ef.field_l];
        for (var2 = param0; ef.field_l > var2; var2++) {
          var1[var2] = new bi(e.field_e, uf.field_k, vg.field_I[var2], b.field_b[var2], ij.field_H[var2], ob.field_a[var2], of.field_d[var2], rd.field_d);
        }
        c.o(-28210);
        return var1;
    }

    public static void a(int param0) {
        int var1 = 20 % ((-74 - param0) / 41);
        field_b = null;
    }

    static {
        field_f = 0;
        field_a = 0;
        field_b = "members-only content";
        field_d = 61453;
    }
}
