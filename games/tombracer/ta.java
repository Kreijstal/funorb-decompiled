/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends jea {
    static int[] field_vb;
    static ka[] field_ub;
    private jea field_wb;
    private jea field_tb;

    ta(long param0, iu param1, iu param2, int param3, jea param4, String param5) {
        this(param0, (jea) null, param4, param5);
        try {
          this.field_wb.field_bb = param3;
          this.field_wb.field_R = param2;
          this.field_wb.field_lb = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ta.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(byte param0, int param1) {
        if (param0 == 95) {
          return this.field_wb.b((byte) 69) - (-param1 - this.field_tb.b((byte) 69));
        }
        this.field_tb = (jea) null;
        return this.field_wb.b((byte) 69) - (-param1 - this.field_tb.b((byte) 69));
    }

    ta(long param0, ta param1, String param2) {
        this(param0, param1.field_wb, param1.field_tb, param2);
    }

    private final void b(byte param0, int param1) {
        int var3 = 0;
        int var3Lifetime1;
        if (param0 > 109) {
          this.field_wb.a(this.field_wb.b((byte) 69), this.field_t, -23776, 0, 0);
          var3 = param1 + this.field_wb.field_G;
          this.field_tb.a(this.field_G - var3, this.field_t, -23776, 0, var3);
          return;
        }
        field_ub = (ka[]) null;
        this.field_wb.a(this.field_wb.b((byte) 69), this.field_t, -23776, 0, 0);
        var3Lifetime1 = param1 + this.field_wb.field_G;
        this.field_tb.a(this.field_G - var3Lifetime1, this.field_t, -23776, 0, var3Lifetime1);
    }

    private ta(long param0, jea param1, jea param2, String param3) {
        super(param0, (jea) null);
        try {
          this.field_wb = new jea(0L, param1);
          this.field_tb = new jea(0L, param2);
          this.field_tb.field_r = param3;
          this.b(-124, this.field_wb);
          this.b(-124, this.field_tb);
          this.a(-10966);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ta.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_vb = null;
        if (param0 != -17) {
          field_ub = (ka[]) null;
          field_ub = null;
          return;
        }
        field_ub = null;
    }

    final static g d(int param0, boolean param1) {
        g[] var2;
        int var3;
        g var4;
        int var5;
        g[] var6;
        int var3Lifetime1;
        g var4Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = qg.field_a;
        var2 = var6;
        if (!param1) {
          for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (param0 == var4.field_a) {
              return var4;
            }
          }
          return null;
        }
        ta.d(32, false);
        for (var3Lifetime1 = 0; var6.length > var3Lifetime1; var3Lifetime1++) {
          var4Lifetime1 = var6[var3Lifetime1];
          if (param0 == var4Lifetime1.field_a) {
            return var4Lifetime1;
          }
        }
        return null;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        if (param2 > -85) {
          return;
        }
        this.a(param0, param4, -23776, param1, param5);
        this.b((byte) 123, param3);
    }

    final static void a(iu[][] param0, String[][] param1, int[] param2, int param3, cn param4, int param5, hja[] param6, byte[] param7, byte[] param8, String[][] param9, String[] param10, cn param11, byte param12, int[] param13, iu[][] param14, cn param15, boolean param16) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        RuntimeException var17 = null;
        String[] var18 = null;
        try {
          var18 = (String[]) null;
          lba.a(param5, 1, param4, param16, param0, param13, param1, param11, param2, param10, param6, param9, (String[]) null, param14, param15, param3, 1, param7, param8);
          var17_int = -112 / ((66 - param12) / 41);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_4_0 = var17;
          stackIn_4_1 = new StringBuilder().append("ta.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param7 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param8 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param9 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param10 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param11 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param14 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param15 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param16).append(')').toString());
        }
    }

    static {
        field_vb = new int[]{190, 280, 400, 440, 490, 246};
    }
}
