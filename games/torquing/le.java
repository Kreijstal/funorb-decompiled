/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    final static void a(int param0, la param1) {
        int var3 = 0;
        int var4 = 0;
        of var5 = null;
        int[] var6 = null;
        int var7 = 0;
        qk var8 = null;
        df var9 = null;
        int var10 = 0;
        df var11 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = Torquing.field_u;
        try {
          var9 = new df(param1.a(-125, "", "logo.fo3d"));
          var11 = var9;
          var3 = var11.i((byte) -101);
          var11.j((byte) -100);
          ha.field_d = pe.a((byte) -59, var11);
          db.field_a = new of[var3];
          eo.field_d = new int[var3][];
          for (var4 = 0; var4 < var3; var4++) {
            db.field_a[var4] = mh.a(255, var9);
          }
          var11.j(-128);
          if (param0 != 6) {
            var8 = (qk) null;
            le.a((byte) -43, -40, (qk) null);
          }
          var10 = 0;
          var4Lifetime1 = var10;
          while (var10 < var3) {
            var5 = db.field_a[var10];
            var5.a(1, 6, 6, 6, (byte) -123);
            var5.a(32767);
            var6 = new int[]{var5.field_g + var5.field_A >> 1, var5.field_H + var5.field_x >> 1, var5.field_p + var5.field_e >> 1};
            eo.field_d[var10] = var6;
            var5.a(-var6[2], (byte) -6, -var6[0], -var6[1]);
            var10++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("le.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, qk param2) {
        if (param0 < 82) {
          return;
        }
        try {
          kc.field_z.a((byte) 54, param2);
          ii.a(32, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "le.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
