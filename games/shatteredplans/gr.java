/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gr extends oh {
    int[][] field_m;
    String[][] field_n;
    int field_r;
    int field_h;
    static int field_o;
    boolean field_q;
    int field_k;
    static pf field_p;
    int field_i;
    int field_j;
    int field_l;

    final static void a(int param0, int param1, int[] param2, int param3) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = -param0 + 256;
          var5 = 16711935 & param3;
          c.c();
          var6 = 65280 & param3;
          c.a(param2, 0, param2.length);
          c.d();
          while (c.a()) {
            var7 = c.field_e;
            if (gf.field_i > var7) {
              var7 = gf.field_i;
            }
            var8 = c.field_a;
            if (gf.field_l < var8) {
              var8 = gf.field_l;
            }
            var9 = (var7 & -8) - (7 & c.field_h);
            var9 = var9 + (8 + (-8 & -var9 + var7));
            var10 = var9 + c.field_h * gf.field_b;
            while (var8 > var9) {
              gf.field_h[var10] = we.a(16711935, we.a(16711935, gf.field_h[var10]) * var4_int + var5 * param0 >>> 8) + (we.a(we.a(65280, gf.field_h[var10]) * var4_int + var6 * param0, 16711680) >>> 8);
              var10 += 8;
              var9 += 8;
            }
          }
          if (param1 <= -58) {
            return;
          }
          gr.a(false, true, 50);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("gr.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 >= -25) {
          gr.a((byte) -99, 47, -15);
          field_p = null;
          return;
        }
        field_p = null;
    }

    final static bi a(byte param0, int param1, int param2) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        bi var3 = new bi(param2, param2);
        int var4 = 0;
        if (param0 > -38) {
          field_p = (pf) null;
          while (var3.field_B.length > var4) {
            var3.field_B[var4] = param1;
            var4++;
          }
          return var3;
        }
        while (var3.field_B.length > var4) {
          var3.field_B[var4] = param1;
          var4++;
        }
        return var3;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (!param0) {
          gf.b();
          og.a(param2, param0);
          return;
        }
        gf.c(0, 0, gf.field_b, gf.field_k, 0, 192);
        og.a(param2, param0);
    }

    gr() {
    }

    static {
    }
}
