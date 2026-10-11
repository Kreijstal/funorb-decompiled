/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jaa implements noa {
    private int field_g;
    private int field_c;
    private int field_d;
    private int field_h;
    static apa field_b;
    private boolean field_e;
    private int field_f;
    static String field_a;

    final int a(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == -43946608) {
          var2 = this.field_d | (this.field_g << 16 | this.field_f << 8);
          if (this.field_e) {
            var2 = this.field_h << 24 | var2;
          }
          return var2;
        }
        kh var3 = (kh) null;
        this.a(8, (kh) null);
        var2Lifetime1 = this.field_d | (this.field_g << 16 | this.field_f << 8);
        if (this.field_e) {
          var2Lifetime1 = this.field_h << 24 | var2Lifetime1;
        }
        return var2Lifetime1;
    }

    private final void a(int param0, int param1, kh param2) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          var4_int = 1 << 8 - this.field_c;
          var5 = -1 + var4_int;
          this.field_g = var4_int * param2.b((byte) 44, this.field_c);
          if (0 < this.field_g) {
            this.field_g = this.field_g + var5;
          }
          this.field_f = var4_int * param2.b((byte) 44, this.field_c);
          if (this.field_f > 0) {
            this.field_f = this.field_f + var5;
          }
          this.field_d = param2.b((byte) 44, this.field_c) * var4_int;
          if (0 < this.field_d) {
            this.field_d = this.field_d + var5;
          }
          if (this.field_e) {
            this.field_h = param2.b((byte) 44, this.field_c) * var4_int;
          }
          if (param0 != 8) {
            field_b = (apa) null;
          }
          if (0 >= this.field_h) {
            return;
          }
          this.field_h = this.field_h + var5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("jaa.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    final void a(boolean param0, int param1) {
        this.field_g = param1 >> 16 ^ 255;
        this.field_d = 255 ^ param1;
        this.field_h = param1 >> 24 ^ 255;
        if (!param0) {
          this.field_f = (65398 ^ param1) >> 8;
          return;
        }
    }

    jaa(boolean param0, int param1) {
        this.field_c = param1;
        this.field_e = param0 ? true : false;
    }

    final void a(int param0, kh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 1 << -this.field_c + 8;
          var4 = var3_int - 1;
          param1.a((byte) -128, iia.d(param0, -var4 + this.field_g, param0 ^ 2) / var3_int, this.field_c);
          param1.a((byte) 61, iia.d(0, -var4 + this.field_f, 2) / var3_int, this.field_c);
          param1.a((byte) -128, iia.d(0, -var4 + this.field_d, 2) / var3_int, this.field_c);
          if (!this.field_e) {
            return;
          }
          param1.a((byte) -127, iia.d(0, this.field_h - var4, 2) / var3_int, this.field_c);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jaa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 24) {
            stackIn_4_0 = nia.a(param1, 0, param1.length, 255);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("jaa.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    jaa(boolean param0, int param1, int param2, kh param3) {
        try {
          this.field_e = param0 ? true : false;
          this.field_c = param1;
          this.a(8, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jaa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Send private message";
    }
}
