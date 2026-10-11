/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    static aa field_b;
    static int field_c;
    static qr field_d;
    static String field_a;

    final static void a(boolean param0) {
        df var1 = null;
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        df var1Lifetime1;
        jo.field_d = null;
        r.field_c = 0;
        oi.field_e = 0;
        if (!param0) {
          return;
        }
        try {
          vd.field_j.a(0);
          fp.field_b.a(0);
          var1 = eg.field_q.c((byte) -86);
          while (var1 != null) {
            var1.a(16);
            var1 = eg.field_q.b((byte) -107);
          }
          var1Lifetime1 = sl.field_m.c((byte) -70);
          while (var1Lifetime1 != null) {
            var1Lifetime1.a(16);
            var1Lifetime1 = sl.field_m.b((byte) -107);
          }
          po.field_b = 0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "an.B(" + param0 + ')');
        }
    }

    public static void b(boolean param0) {
        field_a = null;
        if (!param0) {
          return;
        }
        field_d = null;
        field_b = null;
    }

    final static lp a(byte param0, boolean param1, sd param2) {
        int var6_int = 0;
        String dupTemp$0 = null;
        lp stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        String var4 = null;
        kb var5 = null;
        b var6 = null;
        int var7 = 0;
        ff var7_ref_ff = null;
        qk var8 = null;
        int var8_int = 0;
        ff var9 = null;
        qk var9_ref = null;
        int var10 = 0;
        qk var11 = null;
        String var12 = null;
        lp var13 = null;
        String var4Lifetime1;
        String var4Lifetime2;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var13 = new lp(0, 0, 209, 50);
          var13.field_h = param2;
          var12 = param2.field_q.field_I;
          var4 = var12;
          var4Lifetime1 = var12;
          var4Lifetime2 = var12;
          if (param1) {
            var4Lifetime2 = var12 + " (" + param2.field_o.field_t + ")";
          }
          if (param0 != -76) {
            an.b(true);
          }
          var5 = new kb(0, 0, 209, param2.field_o.field_k, var4Lifetime2, 16777215, false);
          var13.a(var5, 8);
          for (var6_int = 0; 4 > var6_int; var6_int++) {
            var7_ref_ff = new ff(40 + var6_int * (5 + fs.field_a[var6_int].field_z), var5.field_i + 7, fs.field_a[var6_int]);
            var13.a(var7_ref_ff, param0 ^ -68);
            var8_int = param2.field_r + param2.field_u[var6_int];
            if (var8_int < 0) {
              var8_int = 0;
            }
            var11 = new qk(40 + var6_int * (fs.field_a[var6_int].field_z + 5), 7 + var5.field_i + fs.field_a[var6_int].field_w / 8, fs.field_a[var6_int].field_z, fs.field_a[var6_int].field_w, Integer.toString(var8_int));
            var9_ref = var11;
            var13.a(var9_ref, param0 ^ -68);
            dupTemp$0 = ne.field_m[var6_int];
            var11.field_o = dupTemp$0;
            var7_ref_ff.field_o = dupTemp$0;
          }
          var6 = new b(k.field_d.field_z / 2 + (fs.field_a[0].field_z + 5) * 4 + 40, 6 + var5.field_i, k.field_d.field_z * 2, -2 + k.field_d.field_w, 2, 534312);
          var13.a(var6, param0 ^ -68);
          var7 = param2.field_r;
          if (var7 < 0) {
            var7 = 0;
          }
          var8 = new qk(k.field_d.field_z + 4 * (5 + fs.field_a[0].field_z) + 40, var5.field_i + (7 + fs.field_a[0].field_w / 8), 3 * k.field_d.field_z / 2, k.field_d.field_w, Integer.toString(var7));
          var13.a(var8, 8);
          var9 = new ff(40 + 4 * (fs.field_a[0].field_z + 5), 5 + var5.field_i, k.field_d);
          var13.a(var9, 8);
          var9.field_o = si.field_w;
          var8.field_o = si.field_w;
          var6.field_o = si.field_w;
          stackIn_13_0 = var13;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("an.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_a = "Warring Worlds";
    }
}
