/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    private vr field_b;
    static String[] field_e;
    static sna field_a;
    static js field_h;
    private vr field_g;
    private js field_f;
    static lna field_d;
    private js field_c;

    final be a(String param0, String param1, int param2) {
        RuntimeException var4 = null;
        be stackIn_2_0 = null;
        be stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == -28494) {
            stackIn_4_0 = this.a(param0, (int[]) null, param1, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (be) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("i.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final be a(int param0, int[] param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        be stackIn_2_0 = null;
        be stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1 == this.field_g.a((byte) 20)) {
            stackIn_2_0 = this.a(param2, 0, (byte) -69, param1);
            return stackIn_2_0;
          }
          var4_int = 13 / ((-10 - param0) / 33);
          if (this.field_g.d(param2, 0) != 1) {
            throw new RuntimeException();
          }
          stackIn_5_0 = this.a(0, param2, (byte) 106, param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("i.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    private final be a(int[] param0, int param1, String param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_5_0 = null;
        be stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_b.a(param2, false);
          var6 = 119 % ((-50 - param1) / 44);
          if (var5_int < 0) {
            return null;
          }
          var7 = this.field_b.a((byte) 6, var5_int, param3);
          if (var7 >= 0) {
            stackIn_7_0 = this.a(var7, var5_int, param0, -1884086484);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (be) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("i.G(");
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
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final be a(String param0, int[] param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        be stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_g.a(param0, false);
          if (param3 > var5_int) {
            stackIn_2_0 = null;
            return (be) (stackIn_2_0);
          }
          var6 = this.field_g.a((byte) 6, var5_int, param2);
          if (var6 >= 0) {
            stackIn_7_0 = this.a(var6, var5_int, (byte) -27, param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (be) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("i.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
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
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final be a(int param0, byte param1, int[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        be stackIn_2_0 = null;
        be stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_b.a((byte) 20) == 1) {
            stackIn_2_0 = this.a(param0, 0, param2, -1884086484);
            return stackIn_2_0;
          }
          var4_int = 113 / ((-60 - param1) / 54);
          if (1 != this.field_b.d(param0, 0)) {
            throw new RuntimeException();
          }
          stackIn_6_0 = this.a(0, param0, param2, -1884086484);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("i.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final be a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        be var8 = null;
        dv var9 = null;
        be stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        be stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        be var8Lifetime1;
        try {
          var5_int = param0 ^ (65530 & param1 << 4 | param1 >>> 12);
          var5_int = var5_int | param1 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (be) (this.field_c.a(true, var6));
          if (param3 != -1884086484) {
            field_e = (String[]) null;
          }
          if (var8 != null) {
            stackIn_4_0 = var8;
            return stackIn_4_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            stackIn_8_0 = null;
            return (be) (stackIn_8_0);
          }
          var9 = (dv) (this.field_f.a(true, var6));
          if (var9 == null) {
            var9 = dv.a(this.field_b, param1, param0);
            if (var9 == null) {
              return null;
            }
            this.field_f.a(var6, (byte) -111, var9);
          }
          var8Lifetime1 = var9.a(param2);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.a(false);
          this.field_c.a(var6, (byte) 124, var8Lifetime1);
          stackIn_18_0 = var8Lifetime1;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("i.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 46 / ((param0 + 43) / 56);
        field_e = null;
        field_d = null;
        field_h = null;
    }

    private final be a(int param0, int param1, byte param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        be var8 = null;
        int var9 = 0;
        vp var10 = null;
        be var11 = null;
        be stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        be stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        be var8Lifetime1;
        try {
          var5_int = (param1 >>> 12 | 65530 & param1 << 4) ^ param0;
          var5_int = var5_int | param1 << 16;
          var6 = (long)var5_int;
          var9 = 124 % ((param2 - 55) / 42);
          var8 = (be) (this.field_c.a(true, var6));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            stackIn_7_0 = null;
            return (be) (stackIn_7_0);
          }
          var10 = vp.a(this.field_g, param1, param0);
          if (var10 == null) {
            return null;
          }
          var11 = var10.b();
          var8Lifetime1 = var11;
          this.field_c.a(var6, (byte) 67, var8Lifetime1);
          if (param3 != null) {
            param3[0] = param3[0] - var11.field_i.length;
          }
          stackIn_14_0 = var8Lifetime1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("i.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final be a(String param0, String param1, byte param2) {
        RuntimeException var4 = null;
        be stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 47) {
            field_d = (lna) null;
          }
          stackIn_3_0 = this.a((int[]) null, -122, param1, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("i.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    i(vr param0, vr param1) {
        this.field_f = new js(256);
        this.field_c = new js(256);
        try {
          this.field_b = param1;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "i.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
