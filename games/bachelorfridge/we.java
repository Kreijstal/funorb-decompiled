/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static long field_b;
    static String field_a;

    final static lba[] a(byte param0, ht param1) {
        lba[] stackIn_4_0 = null;
        lba[] stackIn_10_0 = null;
        lba[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        lba[] var4 = null;
        int var5 = 0;
        lba var6 = null;
        int var7 = 0;
        eh var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = BachelorFridge.field_y;
        try {
          if (!param1.b(34)) {
            stackIn_4_0 = new lba[]{};
            return stackIn_4_0;
          }
          var8 = param1.c(-1);
          while (0 == var8.field_f) {
            gda.a(false, 10L);
          }
          if (2 == var8.field_f) {
            stackIn_10_0 = new lba[]{};
            return stackIn_10_0;
          }
          var10 = (int[]) (var8.field_e);
          var9 = var10;
          var3 = var9;
          var4 = new lba[var10.length >> 2];
          var5 = 0;
          if (param0 >= -31) {
            field_a = (String) null;
          }
          while (var4.length > var5) {
            var6 = new lba();
            var4[var5] = var6;
            var6.field_d = var3[var5 << 2];
            var6.field_e = var3[1 + (var5 << 2)];
            var6.field_a = var3[(var5 << 2) + 2];
            var6.field_b = var3[3 + (var5 << 2)];
            var5++;
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("we.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < -122) {
          return;
        }
        field_a = (String) null;
    }

    static {
        field_a = "Falling into a pit means instant death for the creature! Take great care not to slip and fall, or be pushed!";
    }
}
