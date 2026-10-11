/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static int field_a;

    final static al[] a(un param0, byte param1) {
        int var5 = 0;
        al[] stackIn_3_0 = null;
        al[] stackIn_10_0 = null;
        al[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        al[] var4 = null;
        al var6 = null;
        int var7 = 0;
        un var8 = null;
        gb var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var7 = CrazyCrystals.field_B;
        try {
          if (!param0.b(5)) {
            stackIn_3_0 = new al[]{};
            return stackIn_3_0;
          }
          var9 = param0.a((byte) -116);
          while (var9.field_a == 0) {
            fh.a(true, 10L);
          }
          if (var9.field_a == 2) {
            stackIn_10_0 = new al[]{};
            return stackIn_10_0;
          }
          var11 = (int[]) (var9.field_b);
          var10 = var11;
          var3 = var10;
          var4 = new al[var11.length >> 2];
          if (param1 <= 13) {
            var8 = (un) null;
            ri.a((un) null, (byte) -59);
          }
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new al();
            var4[var5] = var6;
            var6.field_i = var3[var5 << 2];
            var6.field_g = var3[(var5 << 2) + 1];
            var6.field_b = var3[2 + (var5 << 2)];
            var6.field_e = var3[3 + (var5 << 2)];
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("ri.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
