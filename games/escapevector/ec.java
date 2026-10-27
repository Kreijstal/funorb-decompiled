/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static wb field_a;
    private mf field_e;
    private mf field_d;
    static String field_c;
    private ib field_b;
    private ib field_g;
    static te[] field_f;

    private final hh a(int[] param0, byte param1, int param2, int param3) {
        String stackIn_24_2 = null;
        try {
          int var5_int = (param2 << 4 & 65522 | param2 >>> 12) ^ param3;
          if (param1 <= 14) {
            hh stackIn_2_0 = (hh) null;
            return stackIn_2_0;
          }
          var5_int = var5_int | param2 << 16;
          long var6 = 4294967296L ^ (long)var5_int;
          hh var8 = (hh) (this.field_g.a(var6, -1));
          if (var8 != null) {
            hh stackIn_6_0 = var8;
            return stackIn_6_0;
          }
          if (param0 != null &&
            0 >= param0[0]) {
            return null;
          }
          in var9 = (in) (this.field_b.a(var6, -1));
          if (var9 == null) {
            var9 = in.a(this.field_e, param2, param3);
            if (var9 == null) {
              Object stackIn_14_0 = null;
              return (hh) (stackIn_14_0);
            }
            this.field_b.a(var9, 10901, var6);
          }
          hh var8Lifetime1 = var9.a(param0);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.unlink((byte) -27);
          this.field_g.a(var8Lifetime1, 10901, var6);
          hh stackIn_20_0 = var8Lifetime1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var5;
          StringBuilder stackIn_23_1 = new StringBuilder().append("ec.D(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 78 / ((param0 - 56) / 54);
        field_c = null;
        field_f = null;
    }

    private final hh a(int param0, int param1, int[] param2, int param3) {
        String stackIn_21_2 = null;
        try {
          int var5_int = param3 ^ (param1 << 4 & 65533 | param1 >>> 12);
          var5_int = var5_int | param1 << 16;
          long var6 = (long)var5_int;
          hh var8 = (hh) (this.field_g.a(var6, -1));
          if (var8 != null) {
            hh stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            Object stackIn_7_0 = null;
            return (hh) (stackIn_7_0);
          }
          kj var9 = kj.a(this.field_d, param1, param3);
          if (var9 == null) {
            Object stackIn_10_0 = null;
            return (hh) (stackIn_10_0);
          }
          if (param0 != 1158948012) {
            int[] var10 = (int[]) null;
            hh discarded$1 = this.a(-13, 124, (int[]) null, 13);
          }
          hh var11 = var9.a();
          hh var8Lifetime1 = var11;
          this.field_g.a(var8Lifetime1, 10901, var6);
          if (param2 != null) {
            param2[0] = param2[0] - var11.field_h.length;
          }
          hh stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var5;
          StringBuilder stackIn_20_1 = new StringBuilder().append("ec.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final hh a(int param0, byte param1, int param2) {
        if (param1 == -128) {
          return this.a((int[]) null, (byte) 18, param0, param2);
        }
        this.field_d = (mf) null;
        return this.a((int[]) null, (byte) 18, param0, param2);
    }

    final hh a(byte param0, int param1, int param2) {
        if (param0 > 44) {
          return this.a(1158948012, param2, (int[]) null, param1);
        }
        this.field_e = (mf) null;
        return this.a(1158948012, param2, (int[]) null, param1);
    }

    ec(mf param0, mf param1) {
        this.field_b = new ib(256);
        this.field_g = new ib(256);
        try {
          this.field_e = param1;
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ec.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Email is valid";
    }
}
