/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tv extends jea {
    private jea field_tb;
    jea field_vb;
    static String field_ub;
    static String field_xb;
    static nh field_wb;

    tv(long param0, jea param1, jea param2, jea param3, iu param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 != null) {
            this.field_tb = new jea(0L, param2);
            this.field_tb.field_R = param4;
            this.b(-124, this.field_tb);
          }
          if (param5 != null) {
            this.field_vb = new jea(0L, param3, param5);
            this.b(-125, this.field_vb);
            this.a(-10966);
          } else {
            this.a(-10966);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("tv.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param2 <= -7) {
          var4 = -param0;
          var5 = -param0;
          if (this.field_tb != null) {
            var4 = this.field_tb.b((byte) 69);
          }
          if (null != this.field_vb) {
            var5 = this.field_vb.a(-param1 + (-var4 + (-param1 + this.field_G)) - param0, false);
          }
          var6 = param1 + param0 + (var4 + param1) + var5;
          if (var6 > this.field_G) {
            var5 = var5 + (this.field_G - var6);
            var6 = this.field_G;
          }
          if (1 == this.field_z) {
            param1 = param1 + (-var6 + this.field_G) / 2;
          }
          if (2 == this.field_z) {
            param1 = param1 + (-var6 + this.field_G);
          }
          if (null != this.field_tb) {
            this.field_tb.a(var4, this.field_t, -23776, 0, param1);
            this.field_tb.field_bb = this.field_bb;
          }
          if (null == this.field_vb) {
            return;
          }
          this.field_vb.a(var5, this.field_t, -23776, 0, param0 + param1 + var4);
          if (this.field_tb == null) {
            this.field_vb.field_z = this.field_z;
          } else {
            this.field_vb.field_z = 0;
          }
          this.field_vb.field_bb = this.field_bb;
          return;
        }
        field_xb = (String) null;
        var4Lifetime1 = -param0;
        var5Lifetime1 = -param0;
        if (this.field_tb != null) {
          var4Lifetime1 = this.field_tb.b((byte) 69);
        }
        if (null != this.field_vb) {
          var5Lifetime1 = this.field_vb.a(-param1 + (-var4Lifetime1 + (-param1 + this.field_G)) - param0, false);
        }
        var6Lifetime1 = param1 + param0 + (var4Lifetime1 + param1) + var5Lifetime1;
        if (var6Lifetime1 > this.field_G) {
          var5Lifetime1 = var5Lifetime1 + (this.field_G - var6Lifetime1);
          var6Lifetime1 = this.field_G;
        }
        if (1 == this.field_z) {
          param1 = param1 + (-var6Lifetime1 + this.field_G) / 2;
        }
        if (2 == this.field_z) {
          param1 = param1 + (-var6Lifetime1 + this.field_G);
        }
        if (null != this.field_tb) {
          this.field_tb.a(var4Lifetime1, this.field_t, -23776, 0, param1);
          this.field_tb.field_bb = this.field_bb;
        }
        if (null == this.field_vb) {
          return;
        }
        this.field_vb.a(var5Lifetime1, this.field_t, -23776, 0, param0 + param1 + var4Lifetime1);
        if (this.field_tb == null) {
          this.field_vb.field_z = this.field_z;
        } else {
          this.field_vb.field_z = 0;
        }
        this.field_vb.field_bb = this.field_bb;
    }

    public static void f(int param0) {
        field_wb = null;
        field_xb = null;
        if (param0 < 114) {
          field_ub = (String) null;
          field_ub = null;
          return;
        }
        field_ub = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param0, param3, param4 - 23776, param6, param1);
        this.a(param2, param5, (byte) -112);
        if (param4 != 0) {
          this.a(107, -86, 59, 7, 1, 125, 35);
        }
    }

    final int b(int param0, int param1, int param2) {
        int var4 = -param2;
        int var5 = -param2;
        if (this.field_tb != null) {
          var4 = this.field_tb.b((byte) 69);
        }
        if (param1 == 16474) {
          if (this.field_vb != null) {
            var5 = this.field_vb.b((byte) 69);
          }
          return var4 + (param0 + param2 + var5 + param0);
        }
        tv.f(-53);
        if (this.field_vb != null) {
          var5 = this.field_vb.b((byte) 69);
        }
        return var4 + (param0 + param2 + var5 + param0);
    }

    static {
        field_ub = "Blue Flamer";
        field_xb = "Show game chat from my friends";
    }
}
