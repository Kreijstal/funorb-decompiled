/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static ff field_f;
    private qd field_j;
    private da field_a;
    private da field_c;
    static da field_e;
    static boolean field_g;
    private qd field_i;
    static String field_h;
    static int field_d;
    static int field_b;

    private final sh a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sh var8 = null;
        ra var9 = null;
        sh var10 = null;
        sh stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        sh stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        sh var8Lifetime1;
        try {
          var5_int = param3 ^ (param2 >>> 12 | 65533 & param2 << 4);
          var5_int = var5_int | param2 << 16;
          var6 = (long)var5_int;
          var8 = (sh) (this.field_i.a(true, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param0 != null &&
            param0[0] <= 0) {
            stackIn_6_0 = null;
            return (sh) (stackIn_6_0);
          }
          if (param1 != 1264444880) {
            this.field_c = (da) null;
          }
          var9 = ra.a(this.field_a, param2, param3);
          if (var9 == null) {
            return null;
          }
          var10 = var9.b();
          var8Lifetime1 = var10;
          this.field_i.a((byte) 76, var8Lifetime1, var6);
          if (param0 != null) {
            param0[0] = param0[0] - var10.field_i.length;
          }
          stackIn_15_0 = var8Lifetime1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("me.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != 56) {
          return;
        }
        field_e = null;
        field_f = null;
    }

    final sh a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        sh stackIn_2_0 = null;
        sh stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (~this.field_c.a((byte) 89) == param1) {
            stackIn_2_0 = this.a(0, param2, param0, (byte) -77);
            return stackIn_2_0;
          }
          if (this.field_c.b(126, param2) != 1) {
            throw new RuntimeException();
          }
          stackIn_6_0 = this.a(param2, 0, param0, (byte) -107);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("me.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final sh a(int param0, int param1, int[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sh var8 = null;
        sl var9 = null;
        sh stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        sh stackIn_17_0 = null;
        sh stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        sh var8Lifetime1;
        try {
          var5_int = param1 ^ (65524 & param0 << 4 | param0 >>> 12);
          var5_int = var5_int | param0 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (sh) (this.field_i.a(true, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            stackIn_6_0 = null;
            return (sh) (stackIn_6_0);
          }
          var9 = (sl) (this.field_j.a(true, var6));
          if (var9 == null) {
            var9 = sl.a(this.field_c, param0, param1);
            if (var9 == null) {
              return null;
            }
            this.field_j.a((byte) 113, var9, var6);
          }
          var8Lifetime1 = var9.a(param2);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.c(10);
          if (param3 > -52) {
            stackIn_17_0 = (sh) null;
            return stackIn_17_0;
          }
          this.field_i.a((byte) 40, var8Lifetime1, var6);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("me.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (lk.field_e >= 10000) {
          vk.a(255, (byte) 89, 0);
        }
        if (param0) {
          field_g = true;
        }
        if (lk.field_e >= 20000) {
          vk.a(254, (byte) 89, 1);
        }
        if (lk.field_e >= 30000) {
          vk.a(253, (byte) 89, 2);
        }
        if (lk.field_e >= 40000) {
          vk.a(252, (byte) 89, 3);
        }
        if (50000 <= lk.field_e) {
          vk.a(251, (byte) 89, 4);
        }
    }

    final sh a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        sh stackIn_5_0 = null;
        sh stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_b = 6;
          }
          if (1 == this.field_a.a((byte) 105)) {
            stackIn_5_0 = this.a(param2, 1264444880, 0, param1);
            return stackIn_5_0;
          }
          if (this.field_a.b(12, param1) != 1) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.a(param2, 1264444880, param1, 0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("me.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    me(da param0, da param1) {
        this.field_j = new qd(256);
        this.field_i = new qd(256);
        try {
          this.field_c = param1;
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new ff(9, 0, 4, 1);
    }
}
