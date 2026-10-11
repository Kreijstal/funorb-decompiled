/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static String[] field_b;
    int field_a;
    private fr field_c;
    static String field_d;
    static boolean field_e;

    protected final void finalize() throws Throwable {
        this.field_c.a(this.field_a, (byte) 113);
        super.finalize();
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, boolean param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param4 <= param5) {
            return;
          }
          if (param3 <= 1 + param5) {
            return;
          }
          if (param3 > param5 + 5 &&
            param0 != param1) {
            var7_int = (param0 & param1 & 1) + (param0 >> 1) + (param1 >> 1);
            var8 = param5;
            var9 = param1;
            var10 = param0;
            for (var11 = param5; param3 > var11; var11++) {
              var12 = pd.field_q[var11];
              if (!param6) {
                stackIn_23_0 = uc.field_c[var12];
              } else {
                stackIn_23_0 = lj.field_a[var12];
              }
              var13 = stackIn_23_0;
              if (var13 <= var7_int) {
                if (var13 > var10) {
                  var10 = var13;
                }
              } else {
                pd.field_q[var11] = pd.field_q[var8];
                if (var13 < var9) {
                  var9 = var13;
                }
                incrementValue$0 = var8;
                var8++;
                pd.field_q[incrementValue$0] = var12;
              }
            }
            vk.a(var9, param1, param2, var8, param4, param5, param6);
            vk.a(param0, var10, (byte) -107, param3, param4, var8, param6);
            return;
          }
          for (var7_intLifetime1 = -1 + param3; var7_intLifetime1 > param5; var7_intLifetime1--) {
            for (var8Lifetime1 = param5; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = pd.field_q[var8Lifetime1];
              var10Lifetime1 = pd.field_q[1 + var8Lifetime1];
              if (jl.a(var10Lifetime1, var9Lifetime1, param6, (byte) 98)) {
                pd.field_q[var8Lifetime1] = var10Lifetime1;
                pd.field_q[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var7), "vk.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(int param0) {
        if (param0 > -31) {
          vk.a(-31);
        }
        qr.field_c = new jn();
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 429166529) {
          vk.a(100, 10, (byte) 96, 17, -1, -25, true);
        }
        field_d = null;
    }

    vk(fr param0, int param1, int param2) {
        try {
          this.field_a = param2;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "vk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = new String[]{"Placing enemies...", "Placing terrain..."};
        field_d = null;
    }
}
