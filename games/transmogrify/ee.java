/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends aj implements df {
    private String field_z;
    private lj[] field_F;
    private int[] field_E;
    private int field_w;
    static int field_D;
    private kg field_A;
    private ik field_x;
    static String field_C;
    static String field_y;

    public static void l(int param0) {
        if (param0 != -31263) {
          field_C = (String) null;
        }
        field_y = null;
        field_C = null;
    }

    ee(ik param0, kg param1, String param2) {
        super(0, 0, 288, 0, (ui) null);
        int var4_int = 0;
        this.field_w = 0;
        try {
          this.field_A = param1;
          this.field_z = param2;
          this.field_x = param0;
          var4_int = null != this.field_z ? this.field_A.a(this.field_z, 260, this.field_A.field_y) : 0;
          this.a(-108, 0, 0, 288, var4_int + 22);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ee.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = this.field_w;
          this.b((byte) -114, param2 + var4_int);
          this.field_F[var4_int] = this.a((ma) (this), 8283, param0);
          this.field_E[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ee.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(byte param0, int param1) {
        int var6 = Transmogrify.field_A ? 1 : 0;
        if (this.field_w >= param1) {
          return;
        }
        lj[] var7 = new lj[param1];
        lj[] var3 = var7;
        int[] var4 = new int[param1];
        int var5 = 0;
        if (param0 > -45) {
          return;
        }
        while (var5 < this.field_w) {
          var7[var5] = this.field_F[var5];
          var4[var5] = this.field_E[var5];
          var5++;
        }
        this.field_w = param1;
        this.field_F = var3;
        this.field_E = var4;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) 113);
        this.field_A.a(this.field_z, 14 + this.field_p + param0, this.field_n + (param1 + 10), -28 + this.field_l, this.field_h, 16777215, -1, 0, 0, this.field_A.field_y);
        int var5 = -84 / ((77 - param3) / 34);
    }

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          for (var6_int = 0; var6_int < this.field_w; var6_int++) {
            if (param0 != this.field_F[var6_int]) {
              continue;
            }
            var7 = this.field_E[var6_int];
            if (-1 != var7) {
              ba.a(param1 + 99, this.field_E[var6_int]);
            } else {
              this.field_x.r(77);
            }
            break;
          }
          if (param1 != 17) {
            this.field_w = 61;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("ee.MA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(String param0, byte param1, String param2, ci param3, String param4) {
        RuntimeException var5 = null;
        String var6 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 69) {
            var6 = (String) null;
            ee.a((String) null, (byte) 66, (String) null, (ci) null, (String) null);
          }
          if (!param3.a((byte) -115)) {
            stackIn_5_0 = (String) (param0);
            return stackIn_5_0;
          }
          stackIn_7_0 = param2 + " - " + param3.a(0, param4) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ee.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final lj a(ma param0, int param1, String param2) {
        lj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        lj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new lj(param2, param0);
          var4.field_q = (ui) ((Object) new qa());
          var5 = -2 + this.field_h;
          this.a(85, 0, 0, this.field_l, 34 + this.field_h);
          var4.a(73, var5, 7, this.field_l - 14, 30);
          this.a((qg) (var4), (byte) -83);
          if (param1 != 8283) {
            this.field_A = (kg) null;
          }
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("ee.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_C = "To Customer Support";
        field_y = "Password: ";
    }
}
