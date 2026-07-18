/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    private int field_b;
    private int field_a;
    private int field_c;
    static int field_e;
    private int field_d;

    private final void a(int param0) {
        int var2 = 0;
        var2 = qo.a(-8905, (long)((cc) this).field_a, (long)((cc) this).field_a) + qo.a(-8905, (long)((cc) this).field_b, (long)((cc) this).field_b) - (-qo.a(-8905, (long)((cc) this).field_c, (long)((cc) this).field_c) - qo.a(-8905, (long)((cc) this).field_d, (long)((cc) this).field_d));
        if (param0 > 34) {
          if (var2 >= 65535) {
            if (65537 < var2) {
              var2 = pc.a(var2, -524289);
              ((cc) this).field_a = bw.a((long)var2, 249299984, (long)((cc) this).field_a);
              ((cc) this).field_b = bw.a((long)var2, 249299984, (long)((cc) this).field_b);
              ((cc) this).field_c = bw.a((long)var2, 249299984, (long)((cc) this).field_c);
              ((cc) this).field_d = bw.a((long)var2, 249299984, (long)((cc) this).field_d);
              return;
            } else {
              return;
            }
          } else {
            var2 = pc.a(var2, -524289);
            ((cc) this).field_a = bw.a((long)var2, 249299984, (long)((cc) this).field_a);
            ((cc) this).field_b = bw.a((long)var2, 249299984, (long)((cc) this).field_b);
            ((cc) this).field_c = bw.a((long)var2, 249299984, (long)((cc) this).field_c);
            ((cc) this).field_d = bw.a((long)var2, 249299984, (long)((cc) this).field_d);
            return;
          }
        } else {
          return;
        }
    }

    final void a(cc param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3_int = qo.a(-8905, (long)param0.field_a, (long)((cc) this).field_a) - (qo.a(-8905, (long)param0.field_b, (long)((cc) this).field_b) - (-qo.a(-8905, (long)param0.field_c, (long)((cc) this).field_c) + -qo.a(-8905, (long)param0.field_d, (long)((cc) this).field_d)));
              var4 = qo.a(-8905, (long)param0.field_a, (long)((cc) this).field_b) + (qo.a(-8905, (long)param0.field_b, (long)((cc) this).field_a) + (qo.a(-8905, (long)param0.field_c, (long)((cc) this).field_d) + -qo.a(-8905, (long)param0.field_d, (long)((cc) this).field_c)));
              var5 = qo.a(-8905, (long)param0.field_a, (long)((cc) this).field_c) - (qo.a(-8905, (long)param0.field_b, (long)((cc) this).field_d) + -qo.a(-8905, (long)param0.field_c, (long)((cc) this).field_a)) + qo.a(-8905, (long)param0.field_d, (long)((cc) this).field_b);
              if (param1 <= -28) {
                break L1;
              } else {
                this.a(122);
                break L1;
              }
            }
            ((cc) this).field_d = qo.a(-8905, (long)param0.field_a, (long)((cc) this).field_d) - -qo.a(-8905, (long)param0.field_b, (long)((cc) this).field_c) - (qo.a(-8905, (long)param0.field_c, (long)((cc) this).field_b) + -qo.a(-8905, (long)param0.field_d, (long)((cc) this).field_a));
            ((cc) this).field_a = var3_int;
            ((cc) this).field_c = var5;
            ((cc) this).field_b = var4;
            this.a(62);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cc.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        param4 = param4 >> 1;
        if (!param1) {
          var8 = null;
          ((cc) this).a((cc) null, 27);
          int discarded$2 = 3;
          var6 = rn.b(param4);
          var7 = sb.a(param4, -127);
          ((cc) this).field_a = var7;
          ((cc) this).field_b = qo.a(-8905, (long)param3, (long)var6);
          ((cc) this).field_c = qo.a(-8905, (long)param0, (long)var6);
          ((cc) this).field_d = qo.a(-8905, (long)param2, (long)var6);
          return;
        } else {
          int discarded$3 = 3;
          var6 = rn.b(param4);
          var7 = sb.a(param4, -127);
          ((cc) this).field_a = var7;
          ((cc) this).field_b = qo.a(-8905, (long)param3, (long)var6);
          ((cc) this).field_c = qo.a(-8905, (long)param0, (long)var6);
          ((cc) this).field_d = qo.a(-8905, (long)param2, (long)var6);
          return;
        }
    }

    final void a(int param0, int[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = qo.a(-8905, (long)((cc) this).field_a, (long)((cc) this).field_a);
            var4 = qo.a(-8905, (long)((cc) this).field_a, (long)((cc) this).field_b);
            var5 = qo.a(-8905, (long)((cc) this).field_a, (long)((cc) this).field_c);
            var6 = qo.a(-8905, (long)((cc) this).field_a, (long)((cc) this).field_d);
            var7 = qo.a(-8905, (long)((cc) this).field_b, (long)((cc) this).field_b);
            var8 = qo.a(-8905, (long)((cc) this).field_b, (long)((cc) this).field_c);
            var9 = qo.a(-8905, (long)((cc) this).field_b, (long)((cc) this).field_d);
            var10 = qo.a(-8905, (long)((cc) this).field_c, (long)((cc) this).field_c);
            var11 = qo.a(param0 ^ -8897, (long)((cc) this).field_c, (long)((cc) this).field_d);
            var12 = qo.a(param0 ^ -8897, (long)((cc) this).field_d, (long)((cc) this).field_d);
            param1[4] = var6 + (var8 - (-var6 + -var8));
            param1[7] = -var12 + (var10 + var3_int + -var7);
            param1[9] = var5 + (var9 + var5 + var9);
            param1[5] = -var5 + -var5 + (var9 + var9);
            param1[10] = -var4 + (-var4 + (var11 + var11));
            param1[3] = -var10 + var7 - (-var3_int + var12);
            param1[11] = -var7 + -var10 + (var3_int + var12);
            param1[6] = var8 + -var6 + var8 + -var6;
            param1[param0] = var4 + var11 + (var11 - -var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("cc.D(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    public cc() {
        ((cc) this).field_a = 65536;
    }

    static {
    }
}
