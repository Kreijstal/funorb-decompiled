/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends td {
    static String field_p;
    static sna field_r;
    static int field_q;

    ui(int param0, aga param1) {
        super(param0, param1);
    }

    public static void c(boolean param0) {
        if (!param0) {
          field_q = -19;
        }
        field_r = null;
        field_p = null;
    }

    final static void a(byte param0, kv param1) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        kv var10 = null;
        var9 = BachelorFridge.field_y;
        try {
          if (((param1.field_p | param1.field_q | param1.field_t | param1.field_u) & 3) == 0) {
            return;
          }
          var2_int = (param1.field_t & 3) + param1.field_q;
          if (param0 != -33) {
            var10 = (kv) null;
            ui.a((byte) -45, (kv) null);
          }
          var3 = param1.field_p + (3 & param1.field_u);
          var2_int = -(3 & var2_int) + (4 + var2_int);
          var3 = 4 - ((var3 & 3) - var3);
          var4 = new int[var2_int * var3];
          var5 = 0;
          var6 = (3 & param1.field_t) + (3 & param1.field_u) * var2_int;
          for (var7 = 0; param1.field_p > var7; var7++) {
            for (var8 = 0; var8 < param1.field_q; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param1.field_v[incrementValue$1];
            }
            var6 = var6 + (var2_int - param1.field_q);
          }
          param1.field_t = param1.field_t & -4;
          param1.field_p = var3;
          param1.field_u = param1.field_u & -4;
          param1.field_v = var4;
          param1.field_q = var2_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ui.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        wfa var4 = null;
        ii stackIn_2_0 = null;
        wfa stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_h.a(75, param0);
          var4 = new wfa(this.field_g, new nq(var3));
          if (param1 != 3) {
            stackIn_2_0 = (ii) null;
            return stackIn_2_0;
          }
          var4.field_o.a(new iv(new nq(var3), false, 1, -var3.field_t, 0), true);
          stackIn_4_0 = var4;
          return (ii) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ui.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = "Kick";
    }
}
