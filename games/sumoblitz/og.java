/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    private ki field_a;
    private te field_b;
    static boolean[] field_d;
    private ki field_e;
    private te field_c;

    private final qp a(String param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        qp stackIn_4_0 = null;
        qp stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 16) {
            this.field_c = (te) null;
          }
          if (!this.field_a.b((byte) -125, "")) {
            stackIn_6_0 = this.a(88, param0, param2, "");
            return stackIn_6_0;
          }
          stackIn_4_0 = this.a(45, "", param2, param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("og.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
          field_d = (boolean[]) null;
        }
    }

    final qp b(int param0, String param1) {
        RuntimeException var3 = null;
        qp stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_a = (ki) null;
          }
          stackIn_3_0 = this.a(-2, param1, (int[]) null);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("og.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 < -5) {
          return oh.field_e == 24 ? true : false;
        }
        og.a(true);
        return oh.field_e == 24 ? true : false;
    }

    final qp a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        qp stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 91 / ((param0 + 31) / 58);
          stackIn_1_0 = this.a(param1, 80, (int[]) null);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("og.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private final qp a(String param0, int param1, int[] param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        qp stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_e.a(0, param3);
          if (var5_int < param1) {
            stackIn_2_0 = null;
            return (qp) (stackIn_2_0);
          }
          var6 = this.field_e.a(var5_int, param0, (byte) 127);
          if (var6 < 0) {
            return null;
          }
          stackIn_7_0 = this.a(param2, param1 ^ 1026562700, var5_int, var6);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("og.E(");
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
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final qp a(int[] param0, int param1, int param2, int param3) {
        qp discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        qp var8 = null;
        ae var9 = null;
        String var10 = null;
        qp var11 = null;
        qp stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        qp stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        qp var8Lifetime1;
        try {
          var5_int = ((-2147479553 & param2) << 4 | param2 >>> 12) ^ param3;
          if (param1 != 1026562700) {
            var10 = (String) null;
            discarded$1 = this.a((String) null, -18, (int[]) null, (String) null);
          }
          var5_int = var5_int | param2 << 16;
          var6 = (long)var5_int;
          var8 = (qp) (this.field_c.a(param1 ^ 1026562803, var6));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param0 != null &&
            param0[0] <= 0) {
            stackIn_9_0 = null;
            return (qp) (stackIn_9_0);
          }
          var9 = ae.a(this.field_e, param2, param3);
          if (var9 == null) {
            return null;
          }
          var11 = var9.b();
          var8Lifetime1 = var11;
          this.field_c.a(var8Lifetime1, -1, var6);
          if (param0 != null) {
            param0[0] = param0[0] - var11.field_p.length;
          }
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("og.J(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final qp a(int param0, int param1, boolean param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        qp var8 = null;
        q var9 = null;
        qp stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_16_0 = null;
        qp stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        qp var8Lifetime1;
        try {
          var5_int = param0 ^ (param1 >>> 12 | (1342181375 & param1) << 4);
          var5_int = var5_int | param1 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (qp) (this.field_c.a(127, var6));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            stackIn_7_0 = null;
            return (qp) (stackIn_7_0);
          }
          var9 = (q) (this.field_b.a(118, var6));
          if (var9 == null) {
            var9 = q.a(this.field_a, param1, param0);
            if (var9 == null) {
              return null;
            }
            this.field_b.a(var9, -1, var6);
          }
          var8Lifetime1 = var9.a(param3);
          if (var8Lifetime1 == null) {
            stackIn_16_0 = null;
            return (qp) (stackIn_16_0);
          }
          var9.b(param2);
          this.field_c.a(var8Lifetime1, -1, var6);
          stackIn_18_0 = var8Lifetime1;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("og.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final qp a(int param0, String param1, int[] param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        qp stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_a.a(0, param1);
          if (param0 < 33) {
            og.a(30);
          }
          if (var5_int < 0) {
            return null;
          }
          var6 = this.field_a.a(var5_int, param3, (byte) 127);
          if (var6 < 0) {
            return null;
          }
          stackIn_9_0 = this.a(var6, var5_int, false, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("og.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final qp a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        qp stackIn_3_0 = null;
        qp stackIn_6_0 = null;
        qp stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_e.b(true) == 1) {
            stackIn_3_0 = this.a(param1, 1026562700, 0, param0);
            return stackIn_3_0;
          }
          if (this.field_e.a((byte) -65, param0) == 1) {
            stackIn_6_0 = this.a(param1, param2 + 1026551991, param0, 0);
            return stackIn_6_0;
          }
          if (param2 == 10709) {
            throw new RuntimeException();
          }
          stackIn_9_0 = (qp) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("og.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    private final qp a(int param0, String param1, int[] param2) {
        RuntimeException var4 = null;
        qp stackIn_2_0 = null;
        qp stackIn_5_0 = null;
        qp stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2) {
            stackIn_2_0 = (qp) null;
            return stackIn_2_0;
          }
          if (!this.field_e.b((byte) 116, "")) {
            stackIn_7_0 = this.a("", 0, param2, param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = this.a(param1, 0, param2, "");
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("og.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final qp b(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        qp stackIn_2_0 = null;
        qp stackIn_5_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_a.b(true) == 1) {
            stackIn_2_0 = this.a(param2, 0, false, param1);
            return stackIn_2_0;
          }
          if (1 == this.field_a.a((byte) -65, param2)) {
            stackIn_5_0 = this.a(0, param2, false, param1);
            return stackIn_5_0;
          }
          if (param0 > -65) {
            this.field_a = (ki) null;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("og.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    og(ki param0, ki param1) {
        this.field_b = new te(256);
        this.field_c = new te(256);
        try {
          this.field_a = param1;
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
