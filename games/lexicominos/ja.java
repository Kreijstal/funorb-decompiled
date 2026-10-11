/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static int[] field_b;
    private na field_d;
    private sh field_a;
    private sh field_e;
    private na field_c;

    private final ke a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ke var8 = null;
        ba var9 = null;
        int[] var10 = null;
        ke var11 = null;
        ke stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        ke stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ke var8Lifetime1;
        try {
          var5_int = param1 ^ (param3 << 4 & 65521 | param3 >>> 12);
          var5_int = var5_int | param3 << 16;
          if (param2 != 4164) {
            var10 = (int[]) null;
            this.a(-93, (int[]) null, true);
          }
          var6 = (long)var5_int;
          var8 = (ke) (this.field_c.a(var6, (byte) 109));
          if (var8 != null) {
            stackIn_4_0 = var8;
            return stackIn_4_0;
          }
          if (param0 != null &&
            param0[0] <= 0) {
            stackIn_8_0 = null;
            return (ke) (stackIn_8_0);
          }
          var9 = ba.a(this.field_a, param3, param1);
          if (var9 == null) {
            return null;
          }
          var11 = var9.a();
          var8Lifetime1 = var11;
          this.field_c.a(var8Lifetime1, (byte) -126, var6);
          if (param0 != null) {
            param0[0] = param0[0] - var11.field_i.length;
          }
          stackIn_15_0 = var8Lifetime1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ja.D(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(byte param0) {
        ul var1 = (ul) (pb.field_k.a(31334));
        if (var1 == null) {
          var1 = new ul();
        }
        var1.a(lf.field_b, lf.field_e, 0, lf.field_a, lf.field_c, lf.field_f, lf.field_h, lf.field_g);
        if (param0 < -110) {
          vb.field_m.b(103, var1);
          return;
        }
        ja.a(112);
        vb.field_m.b(103, var1);
    }

    final static boolean a(int param0) {
        if (param0 == -2116060060) {
          return !qa.field_c.b(12) ? true : false;
        }
        field_b = (int[]) null;
        return !qa.field_c.b(12) ? true : false;
    }

    final ke a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        ke stackIn_2_0 = null;
        ke stackIn_6_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1 == this.field_a.b(param0 + 21)) {
            stackIn_2_0 = this.a(param1, param2, 4164, 0);
            return stackIn_2_0;
          }
          if (this.field_a.a((byte) 119, param2) == 1) {
            stackIn_6_0 = this.a(param1, 0, 4164, param2);
            return stackIn_6_0;
          }
          if (param0 != -1) {
            field_b = (int[]) null;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ja.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    private final ke a(byte param0, String param1, int[] param2) {
        RuntimeException var4 = null;
        ke stackIn_3_0 = null;
        ke stackIn_6_0 = null;
        ke stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_e.a("", (byte) -127)) {
            stackIn_3_0 = this.a("", param2, param0 + 7135, param1);
            return stackIn_3_0;
          }
          if (param0 == -92) {
            stackIn_8_0 = this.a(param1, param2, 7043, "");
            return stackIn_8_0;
          }
          stackIn_6_0 = (ke) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ja.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -36) {
          ja.a(-28);
        }
    }

    final ke a(int param0, int[] param1, boolean param2) {
        ke discarded$1 = null;
        RuntimeException var4 = null;
        int[] var5 = null;
        ke stackIn_4_0 = null;
        ke stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            var5 = (int[]) null;
            discarded$1 = this.a((byte) -35, (String) null, (int[]) null);
          }
          if (1 == this.field_e.b(27)) {
            stackIn_4_0 = this.a(param0, 0, (byte) -6, param1);
            return stackIn_4_0;
          }
          if (this.field_e.a((byte) -95, param0) != 1) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.a(0, param0, (byte) -6, param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ja.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    private final ke a(String param0, int[] param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ke stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 7043) {
            this.field_e = (sh) null;
          }
          var5_int = this.field_e.c(param0, (byte) -89);
          if (var5_int < 0) {
            return null;
          }
          var6 = this.field_e.a(param3, param2 - 35007, var5_int);
          if (var6 < 0) {
            return null;
          }
          stackIn_9_0 = this.a(var6, var5_int, (byte) -6, param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ja.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final ke a(int param0, int param1, byte param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ke var8 = null;
        sd var9 = null;
        ke stackIn_2_0 = null;
        ke stackIn_15_0 = null;
        ke stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        ke var8Lifetime1;
        try {
          var5_int = ((-268431361 & param1) << 4 | param1 >>> 12) ^ param0;
          var5_int = var5_int | param1 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (ke) (this.field_c.a(var6, (byte) 118));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            return null;
          }
          var9 = (sd) (this.field_d.a(var6, (byte) 122));
          if (var9 == null) {
            var9 = sd.a(this.field_e, param1, param0);
            if (var9 == null) {
              return null;
            }
            this.field_d.a(var9, (byte) -102, var6);
          }
          var8Lifetime1 = var9.a(param3);
          if (param2 != -6) {
            stackIn_15_0 = (ke) null;
            return stackIn_15_0;
          }
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.b((byte) -125);
          this.field_c.a(var8Lifetime1, (byte) -57, var6);
          stackIn_20_0 = var8Lifetime1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("ja.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final ke a(byte param0, String param1) {
        RuntimeException var3 = null;
        ke stackIn_2_0 = null;
        ke stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -80) {
            stackIn_4_0 = this.a((byte) -92, param1, (int[]) null);
            return stackIn_4_0;
          }
          stackIn_2_0 = (ke) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ja.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    ja(sh param0, sh param1) {
        this.field_d = new na(256);
        this.field_c = new na(256);
        try {
          this.field_a = param0;
          this.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new int[]{100, 2, 1, 6, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 4, 5, 20};
    }
}
