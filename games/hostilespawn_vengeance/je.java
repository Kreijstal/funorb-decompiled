/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static String field_b;
    static int[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        if (param0 > 12) {
          field_a = null;
          field_b = null;
          return;
        }
        fd var2 = (fd) null;
        je.a((fd) null, 44);
        field_a = null;
        field_b = null;
    }

    final static ak[] a(fd param0, int param1) {
        int var5 = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        ak[] var4 = null;
        ak var6 = null;
        int var7 = 0;
        kk var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        ak[] stackIn_4_0 = null;
        ak[] stackIn_11_0 = null;
        ak[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (!param0.a(true)) {
            stackIn_4_0 = new ak[]{};
            return stackIn_4_0;
          }
          var8 = param0.a(param1 ^ -83);
          while (var8.field_f == 0) {
            vj.a(10L, (byte) -49);
          }
          if (param1 == var8.field_f) {
            stackIn_11_0 = new ak[]{};
            return stackIn_11_0;
          }
          var10 = (int[]) (var8.field_c);
          var9 = var10;
          var3 = var9;
          var4 = new ak[var10.length >> 2];
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new ak();
            var4[var5] = var6;
            var6.field_d = var3[var5 << 2];
            var6.field_k = var3[1 + (var5 << 2)];
            var6.field_e = var3[(var5 << 2) + 2];
            var6.field_j = var3[3 + (var5 << 2)];
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("je.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = "There's got to be a way out of here somehow!";
        field_a = new int[]{0, 6, 4, 4, 4};
    }
}
