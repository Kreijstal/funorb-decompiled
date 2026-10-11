/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq extends na {
    static ik field_h;
    private dh field_e;
    static int field_i;
    static eg field_g;
    static int[] field_j;
    static String field_f;

    final gf a(byte param0, String param1) {
        v var3 = null;
        RuntimeException var3_ref = null;
        gf stackIn_5_0 = null;
        gf stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_e instanceof op) {
            var3 = ((op) ((Object) this.field_e)).a(72);
            if (var3 != null &&
              var3.c(88) != qe.field_a) {
              stackIn_5_0 = qr.field_e;
              return stackIn_5_0;
            }
          }
          if (param0 != 26) {
            nq.a(-47, 52, 56);
          }
          if (!param1.equals(this.field_e.field_m)) {
            stackIn_11_0 = qr.field_e;
          } else {
            stackIn_11_0 = qe.field_a;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("nq.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_j = null;
        field_f = null;
        field_h = null;
        field_g = null;
        if (param0 != -31) {
          nq.a(-90, -68, 30);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1 <= 72) {
            stackIn_3_0 = 18;
            return stackIn_3_0;
          }
          var3_int = 1;
          while (param2 > 1) {
            if (0 != (1 & param2)) {
              var3_int = var3_int * param0;
            }
            param0 = param0 * param0;
            param2 = param2 >> 1;
          }
          if (param2 != 1) {
            stackIn_15_0 = var3_int;
            return stackIn_15_0;
          }
          stackIn_13_0 = param0 * var3_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var3), "nq.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final String a(int param0, String param1) {
        v var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_e instanceof op) {
            var3 = ((op) ((Object) this.field_e)).a(-114);
            if (var3 != null) {
              if (var3.c(param0 - 98) == qe.field_a &&
                !param1.equals(this.field_e.field_m)) {
                stackIn_8_0 = gq.field_p;
                return stackIn_8_0;
              }
              stackIn_10_0 = var3.a(param0 + 3690);
              return stackIn_10_0;
            }
          }
          if (!param1.equals(this.field_e.field_m)) {
            stackIn_13_0 = gq.field_p;
            return stackIn_13_0;
          }
          if (param0 == 0) {
            return null;
          }
          nq.c((byte) 75);
          stackIn_17_0 = null;
          return (String) (stackIn_17_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("nq.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    nq(dh param0, dh param1) {
        super(param0);
        try {
          this.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "nq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = 0;
        field_f = "options";
        field_j = new int[1];
    }
}
