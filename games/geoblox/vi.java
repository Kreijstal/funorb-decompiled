/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends hk {
    static String field_F;
    static long field_H;
    static String field_G;
    static int field_E;

    public static void f(int param0) {
        if (param0 >= -65) {
            d var2 = (d) null;
            vi.a(98, (d) null);
        }
        field_F = null;
        field_G = null;
    }

    private vi(String param0, bb param1) {
        this(param0, hb.field_j.field_j, param1);
        try {
            this.field_q = hb.field_j.field_c;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "vi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_y = !this.field_y ? true : false;
        super.a(param0, param1, param2, param3);
    }

    private vi(String param0, dh param1, bb param2) {
        super(param0, param1, param2);
        try {
            this.field_q = hb.field_j.field_c;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "vi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static rj[] a(int param0, d param1) {
        int var5 = 0;
        rj[] stackIn_3_0 = null;
        rj[] stackIn_9_0 = null;
        rj[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        rj[] var4 = null;
        rj var6 = null;
        int var7 = 0;
        cb var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = Geoblox.field_C;
        try {
          if (!param1.b(-26098)) {
            stackIn_3_0 = new rj[]{};
            return stackIn_3_0;
          }
          {
            var8 = param1.a(34);
            L0: while (var8.field_a == 0) {
              bc.a(0, 10L);
            }
            if (var8.field_a == 2) {
              stackIn_9_0 = new rj[]{};
              return stackIn_9_0;
            }
            {
              var10 = (int[]) (var8.field_b);
              var9 = var10;
              var3 = var9;
              var4 = new rj[var10.length >> 2];
              if (param0 <= 61) {
                field_H = 120L;
              }
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = new rj();
                var4[var5] = var6;
                var6.field_d = var3[var5 << 2];
                var6.field_f = var3[1 + (var5 << 2)];
                var6.field_h = var3[2 + (var5 << 2)];
                var6.field_a = var3[(var5 << 2) + 3];
              }
              stackIn_16_0 = (rj[]) (var4);
              return stackIn_16_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = (RuntimeException) (var2);

          stackIn_19_1 = new StringBuilder().append("vi.F(").append(param0).append(',');

          if (param1 == null) {
            stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(')').toString());
        }
    }

    vi(String param0, bb param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_y = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "vi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_F = "Play the game without logging in just yet";
        field_G = "Updates will sent to the email address you've given";
        field_E = 12;
    }
}
