/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nda {
    static String field_d;
    private cn field_b;
    private cn field_c;
    private ji field_e;
    private ji field_a;

    final u a(String param0, byte param1, String param2) {
        RuntimeException var4 = null;
        u stackIn_2_0 = null;
        u stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 52) {
            stackIn_4_0 = this.a(false, param2, param0, (int[]) null);
            return stackIn_4_0;
          }
          stackIn_2_0 = (u) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("nda.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        field_d = null;
    }

    private final u a(String param0, byte param1, int[] param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        u stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        u stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -59) {
            stackIn_2_0 = (u) null;
            return stackIn_2_0;
          }
          var5_int = this.field_c.b(param3, -7768);
          if (var5_int < 0) {
            stackIn_5_0 = null;
            return (u) (stackIn_5_0);
          }
          var6 = this.field_c.a(true, param0, var5_int);
          if (var6 >= 0) {
            stackIn_10_0 = this.a(var6, param2, (byte) 101, var5_int);
            return stackIn_10_0;
          }
          stackIn_8_0 = null;
          return (u) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("nda.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final u a(boolean param0, String param1, String param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        u stackIn_5_0 = null;
        u stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_b.b(param2, -7768);
          if (var5_int < 0) {
            stackIn_2_0 = null;
            return (u) (stackIn_2_0);
          }
          if (param0) {
            stackIn_5_0 = (u) null;
            return stackIn_5_0;
          }
          var6 = this.field_b.a(true, param1, var5_int);
          if (0 > var6) {
            return null;
          }
          stackIn_10_0 = this.a(59, var5_int, var6, param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("nda.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final u a(int param0, int[] param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        u var8 = null;
        fg var9 = null;
        u stackIn_2_0 = null;
        Object stackIn_11_0 = null;
        u stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        u var8Lifetime1;
        try {
          var5_int = param0 ^ (param3 >>> 12 | 65528 & param3 << 4);
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (u) (this.field_a.a((byte) -127, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param1 != null &&
            param1[0] <= 0) {
            return null;
          }
          var9 = (fg) (this.field_e.a((byte) -114, var6));
          if (var9 == null) {
            var9 = fg.a(this.field_c, param3, param0);
            if (var9 == null) {
              stackIn_11_0 = null;
              return (u) (stackIn_11_0);
            }
            this.field_e.a(var6, 124, var9);
          }
          if (param2 <= 56) {
            this.field_e = (ji) null;
          }
          var8Lifetime1 = var9.a(param1);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.p(113);
          this.field_a.a(var6, 121, var8Lifetime1);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("nda.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final u a(byte param0, int[] param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        u stackIn_2_0 = null;
        u stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -119 % ((65 - param0) / 35);
          if (this.field_c.c(4) == 1) {
            stackIn_2_0 = this.a(param2, param1, (byte) 101, 0);
            return stackIn_2_0;
          }
          if (this.field_c.a((byte) 66, param2) != 1) {
            throw new RuntimeException();
          }
          stackIn_5_0 = this.a(0, param1, (byte) 83, param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("nda.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final u a(String param0, int param1, String param2) {
        RuntimeException var4 = null;
        u stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 11) {
            field_d = (String) null;
          }
          stackIn_3_0 = this.a(param0, (byte) -59, (int[]) null, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("nda.G(");
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final u a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        u stackIn_2_0 = null;
        u stackIn_6_0 = null;
        u stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_b.c(param2 + 4) == 1) {
            stackIn_2_0 = this.a(param2 ^ 52, 0, param0, param1);
            return stackIn_2_0;
          }
          if (this.field_b.a((byte) -96, param0) == 1) {
            stackIn_6_0 = this.a(param2 + 115, param0, 0, param1);
            return stackIn_6_0;
          }
          if (param2 == 0) {
            throw new RuntimeException();
          }
          stackIn_9_0 = (u) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("nda.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    private final u a(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        u var8 = null;
        vma var9 = null;
        u var10 = null;
        u stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        u stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        u var8Lifetime1;
        try {
          var5_int = (param1 >>> 12 | (-805302273 & param1) << 4) ^ param2;
          var5_int = var5_int | param1 << 16;
          if (param0 < 45) {
            this.field_e = (ji) null;
          }
          var6 = (long)var5_int;
          var8 = (u) (this.field_a.a((byte) -110, var6));
          if (var8 != null) {
            stackIn_4_0 = var8;
            return stackIn_4_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            stackIn_8_0 = null;
            return (u) (stackIn_8_0);
          }
          var9 = vma.a(this.field_b, param1, param2);
          if (var9 == null) {
            stackIn_11_0 = null;
            return (u) (stackIn_11_0);
          }
          var10 = var9.a();
          var8Lifetime1 = var10;
          this.field_a.a(var6, 103, var8Lifetime1);
          if (param3 != null) {
            param3[0] = param3[0] - var10.field_i.length;
          }
          stackIn_16_0 = var8Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("nda.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    nda(cn param0, cn param1) {
        this.field_e = new ji(256);
        this.field_a = new ji(256);
        try {
          this.field_c = param1;
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nda.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Invalid password.";
    }
}
