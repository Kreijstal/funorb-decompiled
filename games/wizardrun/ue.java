/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    private kl field_f;
    static bh field_h;
    private kl field_c;
    static String field_b;
    private ab field_g;
    private ab field_a;
    static o field_d;
    static byte[][] field_e;

    public static void a(int param0) {
        if (param0 == 0) {
          field_d = null;
          field_e = (byte[][]) null;
          field_h = null;
          field_b = null;
          return;
        }
        field_e = (byte[][]) null;
        field_d = null;
        field_e = (byte[][]) null;
        field_h = null;
        field_b = null;
    }

    final je a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        je stackIn_3_0 = null;
        je stackIn_6_0 = null;
        je stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_c.c(0) == 1) {
            stackIn_3_0 = this.a(param2, true, 0, param1);
            return stackIn_3_0;
          }
          if (param0 != 19830) {
            stackIn_6_0 = (je) null;
            return stackIn_6_0;
          }
          if (1 != this.field_c.d(param0 ^ -19719, param2)) {
            throw new RuntimeException();
          }
          stackIn_9_0 = this.a(0, true, param2, param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ue.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final je b(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        je stackIn_3_0 = null;
        je stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_f.c(param0 ^ param0) == 1) {
            stackIn_3_0 = this.a(param1, param0 + 29237, param2, 0);
            return stackIn_3_0;
          }
          if (this.field_f.d(-110, param2) != 1) {
            throw new RuntimeException();
          }
          stackIn_7_0 = this.a(param1, param0 + 29237, 0, param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ue.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    private final je a(int param0, boolean param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        je var8 = null;
        nc var9 = null;
        je stackIn_2_0 = null;
        je stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        je stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        je var8Lifetime1;
        try {
          if (!param1) {
            stackIn_2_0 = (je) null;
            return stackIn_2_0;
          }
          var5_int = (param2 >>> 12 | 65522 & param2 << 4) ^ param0;
          var5_int = var5_int | param2 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (je) (this.field_a.a(1, var6));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            stackIn_9_0 = null;
            return (je) (stackIn_9_0);
          }
          var9 = (nc) (this.field_g.a(1, var6));
          if (var9 == null) {
            var9 = nc.a(this.field_c, param2, param0);
            if (var9 == null) {
              stackIn_13_0 = null;
              return (je) (stackIn_13_0);
            }
            this.field_g.a(var9, -37, var6);
          }
          var8Lifetime1 = var9.a(param3);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.a(false);
          this.field_a.a(var8Lifetime1, -41, var6);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ue.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final je a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        je var8 = null;
        b var9 = null;
        je var10 = null;
        je stackIn_2_0 = null;
        je stackIn_6_0 = null;
        Object stackIn_10_0 = null;
        je stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        je var8Lifetime1;
        try {
          var5_int = param2 ^ (param3 >>> 12 | (-1342173185 & param3) << 4);
          if (param1 != -3243) {
            stackIn_2_0 = (je) null;
            return stackIn_2_0;
          }
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int;
          var8 = (je) (this.field_a.a(param1 + 3244, var6));
          if (var8 != null) {
            stackIn_6_0 = var8;
            return stackIn_6_0;
          }
          if (param0 != null &&
            param0[0] <= 0) {
            stackIn_10_0 = null;
            return (je) (stackIn_10_0);
          }
          var9 = b.a(this.field_f, param3, param2);
          if (var9 == null) {
            return null;
          }
          var10 = var9.b();
          var8Lifetime1 = var10;
          this.field_a.a(var8Lifetime1, param1 + 3139, var6);
          if (param0 != null) {
            param0[0] = param0[0] - var10.field_k.length;
          }
          stackIn_18_0 = var8Lifetime1;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("ue.E(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ue(kl param0, kl param1) {
        this.field_g = new ab(256);
        this.field_a = new ab(256);
        try {
          this.field_f = param0;
          this.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "ue.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Log in";
        field_h = new bh(7, 0, 1, 1);
    }
}
