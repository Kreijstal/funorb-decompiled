/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends pu {
    static sga field_n;
    static long[] field_l;
    static String field_m;
    static sna field_o;

    final static void c(int param0) {
        int var2 = -3 / ((param0 - 19) / 61);
        gb var1 = (gb) (ja.field_s.b((byte) 90));
        if (var1 == null) {
          vc.a((byte) -72);
          return;
        }
        pf var3 = ig.field_m;
        var3.f(-64);
        var3.f(48);
        var3.f(-108);
        var3.f(111);
        var1.a(false);
    }

    final static void a(int param0, byte[] param1, int param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5Lifetime1;
        var6 = BachelorFridge.field_y;
        try {
          var3_int = param2;
          var4 = new int[256];
          for (var5 = 0; var5 < 256; var5++) {
            incrementValue$1 = var3_int;
            var3_int++;
            var4[var5] = dda.a(255, (int) param1[incrementValue$1]);
          }
          var3_int += 256;
          var7 = 0;
          var5Lifetime1 = var7;
          while (var7 < 256) {
            param1[var3_int] = (byte)(param1[var3_int] - param0);
            var3_int = var3_int + var4[var7];
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("p.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_m = null;
        if (param0 != 0) {
          p.b(111);
        }
        field_l = null;
        field_n = null;
        field_o = null;
    }

    static {
        field_l = new long[1000];
        field_m = "Ask to join <%0>'s game";
    }
}
