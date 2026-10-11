/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io {
    static qr field_c;
    private bc field_b;
    private ti field_a;
    private bc field_e;
    private ti field_d;

    private final kk a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        kk var8 = null;
        dq var9 = null;
        kk var10 = null;
        kk stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        kk stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        kk var8Lifetime1;
        try {
          if (param2 != 0) {
            this.field_b = (bc) null;
          }
          var5_int = param3 ^ (param0 << 4 & 65523 | param0 >>> 12);
          var5_int = var5_int | param0 << 16;
          var6 = (long)var5_int;
          var8 = (kk) (this.field_d.a(var6, -25064));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param1 != null &&
            param1[0] <= 0) {
            return null;
          }
          var9 = dq.a(this.field_b, param0, param3);
          if (var9 == null) {
            stackIn_12_0 = null;
            return (kk) (stackIn_12_0);
          }
          var10 = var9.b();
          var8Lifetime1 = var10;
          this.field_d.a(var8Lifetime1, 13, var6);
          if (param1 != null) {
            param1[0] = param1[0] - var10.field_m.length;
          }
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("io.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final kk a(int param0, int[] param1, int param2) {
        kk discarded$1 = null;
        RuntimeException var4 = null;
        int[] var5 = null;
        kk stackIn_2_0 = null;
        kk stackIn_6_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_e.a((byte) -114) == 1) {
            stackIn_2_0 = this.a(param0 - 12203, param2, 0, param1);
            return stackIn_2_0;
          }
          if (this.field_e.a(param2, param0 ^ -26268) == 1) {
            stackIn_6_0 = this.a(param0 - 12203, 0, param2, param1);
            return stackIn_6_0;
          }
          if (param0 != 0) {
            var5 = (int[]) null;
            discarded$1 = this.a(84, 113, 110, (int[]) null);
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("io.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final kk a(int param0, byte param1, int[] param2) {
        RuntimeException var4 = null;
        int[] var5 = null;
        kk stackIn_2_0 = null;
        kk stackIn_5_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_b.a((byte) -79) == 1) {
            stackIn_2_0 = this.a(0, param2, 0, param0);
            return stackIn_2_0;
          }
          if (1 == this.field_b.a(param0, -26268)) {
            stackIn_5_0 = this.a(param0, param2, param1 ^ -63, 0);
            return stackIn_5_0;
          }
          if (param1 != -63) {
            var5 = (int[]) null;
            this.a(-103, (int[]) null, -81);
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("io.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final kk a(int[] param0, int param1, String param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        kk stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_b.a(122, param3);
          if (0 > var5_int) {
            return null;
          }
          var6 = this.field_b.a(var5_int, (byte) 106, param2);
          if (param1 < ~var6) {
            return null;
          }
          stackIn_7_0 = this.a(var5_int, param0, 0, var6);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("io.G(");
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
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final kk a(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        kk var8 = null;
        fd var9 = null;
        kk stackIn_2_0 = null;
        kk stackIn_18_0 = null;
        kk stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        kk var8Lifetime1;
        try {
          var5_int = (param2 >>> 12 | 65520 & param2 << 4) ^ param1;
          var5_int = var5_int | param2 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (kk) (this.field_d.a(var6, -25064));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param3 != null &&
            0 >= param3[0]) {
            return null;
          }
          var9 = (fd) (this.field_a.a(var6, -25064));
          if (var9 == null) {
            var9 = fd.a(this.field_e, param2, param1);
            if (var9 == null) {
              return null;
            }
            this.field_a.a(var9, 66, var6);
          }
          var8Lifetime1 = var9.a(param3);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.b((byte) -98);
          this.field_d.a(var8Lifetime1, -128, var6);
          if (param0 == -12203) {
            stackIn_20_0 = var8Lifetime1;
            return stackIn_20_0;
          }
          stackIn_18_0 = (kk) null;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("io.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 < 104) {
          io.a((byte) -77);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final kk a(String param0, String param1, int param2) {
        RuntimeException var4 = null;
        kk stackIn_2_0 = null;
        kk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == -22888) {
            stackIn_4_0 = this.a(param0, true, (int[]) null, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (kk) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("io.C(");
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
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static bc a(int param0, int param1) {
        if (param1 >= 27) {
          return cc.a(1, false, param0, 12000, true, false);
        }
        field_c = (qr) null;
        return cc.a(1, false, param0, 12000, true, false);
    }

    private final kk a(String param0, boolean param1, int[] param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        kk stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        kk stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (kk) null;
            return stackIn_2_0;
          }
          var5_int = this.field_e.a(124, param0);
          if (var5_int < 0) {
            stackIn_5_0 = null;
            return (kk) (stackIn_5_0);
          }
          var6 = this.field_e.a(var5_int, (byte) 106, param3);
          if (var6 >= 0) {
            stackIn_10_0 = this.a(-12203, var6, var5_int, param2);
            return stackIn_10_0;
          }
          stackIn_8_0 = null;
          return (kk) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("io.I(");
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
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    io(bc param0, bc param1) {
        this.field_a = new ti(256);
        this.field_d = new ti(256);
        try {
          this.field_e = param1;
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "io.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final kk a(int param0, String param1, String param2) {
        RuntimeException var4 = null;
        kk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 28116) {
            this.field_e = (bc) null;
          }
          stackIn_3_0 = this.a((int[]) null, -1, param1, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("io.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
    }
}
