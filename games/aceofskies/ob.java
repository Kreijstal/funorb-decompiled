/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static String field_f;
    private ph field_g;
    static int field_d;
    static long[] field_c;
    static int field_e;
    private gk field_a;
    private gk field_h;
    private ph field_b;

    final al a(int param0, int[] param1, byte param2) {
        RuntimeException var4 = null;
        al stackIn_3_0 = null;
        al stackIn_6_0 = null;
        al stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1 == this.field_a.a((byte) 127)) {
            stackIn_3_0 = this.a(0, param0, param1, 1452176260);
            return stackIn_3_0;
          }
          if (this.field_a.b(param0, param2 + 28004) == 1) {
            stackIn_6_0 = this.a(param0, 0, param1, 1452176260);
            return stackIn_6_0;
          }
          if (param2 == -92) {
            throw new RuntimeException();
          }
          stackIn_9_0 = (al) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ob.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
          field_e = 125;
          field_c = null;
          return;
        }
        field_c = null;
    }

    private final al a(int param0, int param1, int[] param2, int param3) {
        al stackIn_2_0 = null;
        al stackIn_6_0 = null;
        al stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        al var8 = null;
        t var9 = null;
        al var8Lifetime1;
        try {
          var5_int = param1 ^ ((param0 & -268431361) << 4 | param0 >>> 12);
          var5_int = var5_int | param0 << 16;
          if (param3 != 1452176260) {
            stackIn_2_0 = (al) null;
            return stackIn_2_0;
          }
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (al) (this.field_b.a((byte) 106, var6));
          if (var8 != null) {
            stackIn_6_0 = var8;
            return stackIn_6_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            return null;
          }
          var9 = (t) (this.field_g.a((byte) 106, var6));
          if (var9 == null) {
            var9 = t.a(this.field_a, param0, param1);
            if (var9 == null) {
              return null;
            }
            this.field_g.a(-105, var6, var9);
          }
          var8Lifetime1 = var9.a(param2);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.c(-125);
          this.field_b.a(124, var6, var8Lifetime1);
          stackIn_20_0 = var8Lifetime1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("ob.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(String param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (rr.field_b.startsWith("win")) {
            stackIn_2_0 = param0 + ".dll";
            return stackIn_2_0;
          }
          if (rr.field_b.startsWith("linux")) {
            stackIn_5_0 = "lib" + param0 + ".so";
            return stackIn_5_0;
          }
          if (rr.field_b.startsWith("mac")) {
            stackIn_8_0 = "lib" + param0 + ".dylib";
            return stackIn_8_0;
          }
          if (param1 == -18) {
            return null;
          }
          stackIn_12_0 = (String) null;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ob.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    private final al a(int param0, int[] param1, int param2, int param3) {
        al discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        al var8 = null;
        bj var9 = null;
        int[] var10 = null;
        al var11 = null;
        al stackIn_5_0 = null;
        al stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        al var8Lifetime1;
        try {
          var5_int = (param2 >>> 12 | (param2 & -805302273) << 4) ^ param0;
          var5_int = var5_int | param2 << 16;
          var6 = (long)var5_int;
          if (param3 > -37) {
            var10 = (int[]) null;
            discarded$1 = this.a(-58, -101, (int[]) null, -98);
          }
          var8 = (al) (this.field_b.a((byte) 106, var6));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param1 != null &&
            param1[0] <= 0) {
            return null;
          }
          var9 = bj.a(this.field_h, param2, param0);
          if (var9 == null) {
            return null;
          }
          var11 = var9.a();
          var8Lifetime1 = var11;
          this.field_b.a(105, var6, var8Lifetime1);
          if (param1 != null) {
            param1[0] = param1[0] - var11.field_g.length;
          }
          stackIn_16_0 = var8Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ob.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final al a(int[] param0, int param1, byte param2) {
        RuntimeException var4 = null;
        al stackIn_2_0 = null;
        al stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_h.a((byte) 113) == 1) {
            stackIn_2_0 = this.a(param1, param0, 0, -58);
            return stackIn_2_0;
          }
          if (param2 <= 96) {
            field_f = (String) null;
          }
          if (this.field_h.b(param1, 27912) != 1) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.a(0, param0, param1, -58);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ob.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    ob(gk param0, gk param1) {
        this.field_g = new ph(256);
        this.field_b = new ph(256);
        try {
          this.field_h = param0;
          this.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new long[32];
        field_f = "Name";
    }
}
