/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    static byte[][] field_e;
    private dj field_g;
    static String field_a;
    static byte[][] field_f;
    private dl field_c;
    private dj field_b;
    static boolean[] field_h;
    private dl field_d;

    private final gi a(int param0, int param1, int[] param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        gi var8 = null;
        ml var9 = null;
        gi var10 = null;
        gi stackIn_5_0 = null;
        gi stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        gi var8Lifetime1;
        try {
          if (!param3) {
            field_e = (byte[][]) null;
          }
          var5_int = param1 ^ ((268439551 & param0) << 4 | param0 >>> 12);
          var5_int = var5_int | param0 << 16;
          var6 = (long)var5_int;
          var8 = (gi) (this.field_d.a(var6, 75));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            return null;
          }
          var9 = ml.a(this.field_g, param0, param1);
          if (var9 == null) {
            return null;
          }
          var10 = var9.b();
          var8Lifetime1 = var10;
          this.field_d.a(-99, var6, var8Lifetime1);
          if (param2 != null) {
            param2[0] = param2[0] - var10.field_l.length;
          }
          stackIn_16_0 = var8Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ka.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    final gi a(int param0, boolean param1, int[] param2) {
        RuntimeException var4 = null;
        int[] var5 = null;
        gi stackIn_3_0 = null;
        gi stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1 == this.field_g.d(-1)) {
            stackIn_3_0 = this.a(0, param0, param2, true);
            return stackIn_3_0;
          }
          if (param1) {
            var5 = (int[]) null;
            this.a(-25, (int[]) null, -10);
          }
          if (this.field_g.a((byte) 105, param0) != 1) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.a(param0, 0, param2, true);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ka.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_f = (byte[][]) null;
        field_a = null;
        field_h = null;
        if (param0 <= 14) {
          return;
        }
        field_e = (byte[][]) null;
    }

    final gi a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        gi stackIn_3_0 = null;
        gi stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_b.d(param0 ^ -1856253637) == 1) {
            stackIn_3_0 = this.a(param2, param1, 0, 117);
            return stackIn_3_0;
          }
          if (param0 != 1856253636) {
            this.field_d = (dl) null;
          }
          if (this.field_b.a((byte) 82, param2) != 1) {
            throw new RuntimeException();
          }
          stackIn_9_0 = this.a(0, param1, param2, 113);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ka.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    private final gi a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        gi var8 = null;
        mb var9 = null;
        gi stackIn_2_0 = null;
        gi stackIn_5_0 = null;
        Object stackIn_17_0 = null;
        gi stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        gi var8Lifetime1;
        try {
          var5_int = param0 ^ (param2 >>> 12 | param2 << 4 & 65531);
          var5_int = var5_int | param2 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (gi) (this.field_d.a(var6, 58));
          if (param3 < 95) {
            stackIn_2_0 = (gi) null;
            return stackIn_2_0;
          }
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param1 != null &&
            param1[0] <= 0) {
            return null;
          }
          var9 = (mb) (this.field_c.a(var6, 100));
          if (var9 == null) {
            var9 = mb.a(this.field_b, param2, param0);
            if (var9 == null) {
              return null;
            }
            this.field_c.a(-118, var6, var9);
          }
          var8Lifetime1 = var9.a(param1);
          if (var8Lifetime1 == null) {
            stackIn_17_0 = null;
            return (gi) (stackIn_17_0);
          }
          var9.b(-27598);
          this.field_d.a(-102, var6, var8Lifetime1);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ka.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ka(dj param0, dj param1) {
        this.field_c = new dl(256);
        this.field_d = new dl(256);
        try {
          this.field_g = param0;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new byte[250][];
        field_h = new boolean[]{};
    }
}
