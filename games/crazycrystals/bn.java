/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static am field_h;
    private db field_d;
    private db field_e;
    static String field_f;
    private fc field_b;
    static wb field_i;
    static int field_c;
    static lg field_g;
    private fc field_a;

    private final ko a(int param0, int param1, int[] param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ko var8 = null;
        ha var9 = null;
        ko var10 = null;
        ko stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        ko stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ko var8Lifetime1;
        try {
          var5_int = (param1 >>> 12 | 65527 & param1 << 4) ^ param0;
          var5_int = var5_int | param1 << 16;
          if (!param3) {
            this.field_a = (fc) null;
          }
          var6 = (long)var5_int;
          var8 = (ko) (this.field_a.a(var6, 0));
          if (var8 != null) {
            stackIn_4_0 = var8;
            return stackIn_4_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            stackIn_8_0 = null;
            return (ko) (stackIn_8_0);
          }
          var9 = ha.a(this.field_d, param1, param0);
          if (var9 == null) {
            stackIn_11_0 = null;
            return (ko) (stackIn_11_0);
          }
          var10 = var9.b();
          var8Lifetime1 = var10;
          this.field_a.a(-22072, var6, var8Lifetime1);
          if (param2 != null) {
            param2[0] = param2[0] - var10.field_k.length;
          }
          stackIn_16_0 = var8Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("bn.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    final ko a(int param0, boolean param1, int[] param2) {
        RuntimeException var4 = null;
        ko stackIn_2_0 = null;
        ko stackIn_5_0 = null;
        ko stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_e.a(122) == 1) {
            stackIn_2_0 = this.a(0, -101, param0, param2);
            return stackIn_2_0;
          }
          if (param1) {
            stackIn_5_0 = (ko) null;
            return stackIn_5_0;
          }
          if (1 != this.field_e.a(param0, 0)) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.a(param0, -76, 0, param2);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("bn.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_g = null;
        if (param0 == -3) {
          field_f = null;
          field_i = null;
          return;
        }
        bn.a((byte) 80);
        field_f = null;
        field_i = null;
    }

    private final ko a(int param0, int param1, int param2, int[] param3) {
        ko discarded$0 = null;
        ko stackIn_4_0 = null;
        ko stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ko var8 = null;
        bl var9 = null;
        int[] var10 = null;
        ko var8Lifetime1;
        try {
          if (param1 >= -20) {
            var10 = (int[]) null;
            discarded$0 = this.a(89, -15, (int[]) null, true);
          }
          var5_int = (param0 >>> 12 | (536875007 & param0) << 4) ^ param2;
          var5_int = var5_int | param0 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (ko) (this.field_a.a(var6, 0));
          if (var8 != null) {
            stackIn_4_0 = var8;
            return stackIn_4_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            return null;
          }
          var9 = (bl) (this.field_b.a(var6, 0));
          if (var9 == null) {
            var9 = bl.a(this.field_e, param0, param2);
            if (var9 == null) {
              return null;
            }
            this.field_b.a(-22072, var6, var9);
          }
          var8Lifetime1 = var9.a(param3);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.a(false);
          this.field_a.a(-22072, var6, var8Lifetime1);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("bn.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final ko a(int[] param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int[] stackIn_3_3;
        Object stackIn_4_0;
        boolean stackIn_4_4;
        ko stackIn_5_0 = null;
        ko stackIn_9_0 = null;
        ko stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_d.a(105) != 1) {
            if (this.field_d.a(param2, 0) == 1) {
              stackIn_9_0 = this.a(0, param2, param0, true);
              return stackIn_9_0;
            }
            if (!param1) {
              throw new RuntimeException();
            }
            stackIn_12_0 = (ko) null;
            return stackIn_12_0;
          }
          stackIn_3_0 = this;
          stackIn_3_1 = param2;
          stackIn_3_2 = 0;
          stackIn_3_3 = (int[]) (param0);
          if (param1) {
            stackIn_4_0 = this;
            stackIn_4_4 = false;
          } else {
            stackIn_4_0 = this;
            stackIn_4_4 = true;
          }
          stackIn_5_0 = this.a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_4_4);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("bn.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    bn(db param0, db param1) {
        this.field_b = new fc(256);
        this.field_a = new fc(256);
        try {
          this.field_e = param1;
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "bn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
