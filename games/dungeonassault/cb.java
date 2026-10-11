/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static int field_b;
    static md field_a;
    static String field_c;

    final static void a(java.math.BigInteger param0, int param1, byte[] param2, ec param3, int param4, java.math.BigInteger param5, int param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = DungeonAssault.field_K;
        try {
          var7_int = wk.a(param1, 18605);
          if (rp.field_g == null) {
            rp.field_g = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          if (param4 != 5471) {
            field_a = (md) null;
          }
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = rp.field_g.nextInt();
          }
          if (null == wa.field_b ||
            !(wa.field_b.field_m.length >= var7_int)) {
            wa.field_b = new ec(var7_int);
          }
          wa.field_b.field_o = 0;
          wa.field_b.a(param2, 1, param1, param6);
          wa.field_b.g(param4 - 5468, var7_int);
          wa.field_b.a(var13, true);
          if (t.field_d == null ||
            !(t.field_d.field_m.length >= 100)) {
            t.field_d = new ec(100);
          }
          t.field_d.field_o = 0;
          t.field_d.a(6, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            t.field_d.a((byte) 63, var13[var11]);
            var11++;
          }
          t.field_d.i(param1, param4 ^ -5422);
          t.field_d.a(param0, 2, param5);
          param3.a(t.field_d.field_m, 1, t.field_d.field_o, 0);
          param3.a(wa.field_b.field_m, param4 ^ 5470, wa.field_b.field_o, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("cb.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 27525) {
          field_c = (String) null;
        }
        field_c = null;
    }

    static {
        field_a = new md();
        field_c = "Rot Worms";
    }
}
