/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends jl {
    private String[] field_t;
    private int field_s;
    static int[] field_u;
    private tc[] field_r;
    static String field_q;

    private final void a(byte param0, String[] param1, int param2, int param3, int param4) {
        String stackIn_25_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (this.field_h == null) {
            return;
          }
          if (param1 == null) {
            return;
          }
          if (param1.length == 0) {
            return;
          }
          if (param0 != -95) {
            return;
          }
          String[] var10 = param1;
          String[] var6 = var10;
          for (int var7 = 0; var7 < var10.length; var7++) {
            String var8 = var10[var7];
            if (var8 != null &&
              0 < var8.length()) {
              if (param4 < 0) {
                this.field_h.a(var8, this.field_d, param2, param3, -1);
              }
              if (param4 > 0) {
                this.field_h.b(var8, this.field_d, param2, param3, -1);
              }
            }
            param2 = param2 + this.field_f;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_24_0 = var6_ref;
          StringBuilder stackIn_24_1 = new StringBuilder().append("wd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void c(int param0) {
        int var2 = 640;
        int var3 = this.a(this.field_r, 0);
        int var4 = this.a(this.field_t, 0);
        int var5 = 90 / ((42 - param0) / 41);
        this.field_o = var4 + var3;
        this.field_d = var3 + (var2 - this.field_o) / 2;
    }

    final void a(int param0, int param1) {
        if (null == this.field_h) {
          return;
        }
        int var3 = this.field_h.field_r;
        if (param1 != 3) {
          return;
        }
        param0 = param0 + var3;
        param0 = param0 + this.b(param0, param1 ^ 13944);
        this.a(param0, this.field_r, (byte) -121);
        this.a((byte) -95, this.field_t, param0, this.field_s, -1);
    }

    private final void a(int param0, tc[] param1, byte param2) {
        String stackIn_19_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (this.field_h == null) {
            return;
          }
          if (param1 == null) {
            return;
          }
          if (0 == param1.length) {
            return;
          }
          int var4_int = this.field_h.field_r;
          param0 = param0 - var4_int;
          tc[] var5 = param1;
          int var6 = 101 / ((param2 + 57) / 55);
          for (int var7 = 0; var5.length > var7; var7++) {
            tc var8 = var5[var7];
            if (var8 != null) {
              var8.a(103, this.field_d - var8.d(11384), param0);
            }
            param0 = param0 + this.field_f;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var4;
          StringBuilder stackIn_18_1 = new StringBuilder().append("wd.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, ih param1, int param2, int param3) {
        try {
          super.a(0, param1, param2, -80);
          this.field_s = param0;
          int var5_int = 77 % ((param3 - 47) / 60);
          this.c(126);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "wd.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(tc[] param0, int param1) {
        String stackIn_20_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (param0 == null) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param0.length == 0) {
            int stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          int var3_int = param1;
          for (int var4 = 0; var4 < param0.length; var4++) {
            tc var5 = param0[var4];
            if (var5 != null) {
              var3_int = t.a(var5.d(11384), var3_int, 41);
            }
          }
          int stackIn_16_0 = var3_int;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var3;
          StringBuilder stackIn_19_1 = new StringBuilder().append("wd.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_u = null;
        field_q = null;
        if (guard < 85) {
          wd.releaseStatics(-128);
        }
    }

    wd(String param0, tc[] param1, String[] param2) {
        super(param0, param2);
        try {
          this.field_t = param2;
          this.field_r = param1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "wd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_u = new int[256];
        field_q = "Targets";
    }
}
