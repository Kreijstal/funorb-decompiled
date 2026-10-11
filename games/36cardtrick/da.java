/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    private qk field_f;
    static boolean field_b;
    private vb field_a;
    static String[] field_c;
    private qk field_e;
    private vb field_d;

    private final ib a(byte param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ib var8 = null;
        uj var9 = null;
        ib var10 = null;
        ib stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        ib stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ib var8Lifetime1;
        try {
          var5_int = param2 ^ (param3 >>> 12 | 65520 & param3 << 4);
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int;
          var8 = (ib) (this.field_d.a(false, var6));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param1 != null &&
            param1[0] <= 0) {
            stackIn_7_0 = null;
            return (ib) (stackIn_7_0);
          }
          if (param0 < 100) {
            da.a(60);
          }
          var9 = uj.a(this.field_f, param3, param2);
          if (var9 == null) {
            return null;
          }
          var10 = var9.a();
          var8Lifetime1 = var10;
          this.field_d.a(var6, (byte) 44, var8Lifetime1);
          if (param1 != null) {
            param1[0] = param1[0] - var10.field_h.length;
          }
          stackIn_16_0 = var8Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("da.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final ib a(int param0, int param1, int param2) {
        if (param1 == -1703274388) {
          return this.a((byte) 113, (int[]) null, param0, param2);
        }
        this.b(-108, 0, 54);
        return this.a((byte) 113, (int[]) null, param0, param2);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -1703274388) {
          da.a(-86);
        }
    }

    final ib b(int param0, int param1, int param2) {
        if (param2 == -14888) {
          return this.a(0, (int[]) null, param1, param0);
        }
        int[] var5 = (int[]) null;
        ib discarded$0 = this.a((byte) 18, (int[]) null, -97, 96);
        return this.a(0, (int[]) null, param1, param0);
    }

    private final ib a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ib var8 = null;
        ig var9 = null;
        ib stackIn_3_0 = null;
        Object stackIn_13_0 = null;
        ib stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        ib var8Lifetime1;
        try {
          var5_int = param2 ^ (param3 >>> 12 | (param3 & -1610608641) << 4);
          var5_int = var5_int | param3 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (ib) (this.field_d.a(false, var6));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param1 != null &&
            param1[0] <= 0) {
            return null;
          }
          var9 = (ig) (this.field_a.a(false, var6));
          if (param0 != 0) {
            field_b = true;
          }
          if (var9 == null) {
            var9 = ig.a(this.field_e, param3, param2);
            if (var9 == null) {
              stackIn_13_0 = null;
              return (ib) (stackIn_13_0);
            }
            this.field_a.a(var6, (byte) 124, var9);
          }
          var8Lifetime1 = var9.a(param1);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.c(104);
          this.field_d.a(var6, (byte) 118, var8Lifetime1);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("da.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    da(qk param0, qk param1) {
        this.field_a = new vb(256);
        this.field_d = new vb(256);
        try {
          this.field_e = param1;
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = true;
    }
}
