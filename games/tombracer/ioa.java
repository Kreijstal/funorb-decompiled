/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ioa extends dg {
    static dq field_n;
    static String field_m;
    private ut field_p;
    static String field_o;

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, param2);
          if (!(param0 instanceof ut)) {
            return;
          }
          this.field_p = (ut) ((Object) param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ioa.E(");
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final int k(byte param0) {
        if (param0 != -99) {
          field_m = (String) null;
          if (!this.field_h.j(-1)) {
            return 5;
          }
          return 2;
        }
        if (!this.field_h.j(-1)) {
          return 5;
        }
        return 2;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var8 = 0;
        int var9 = 0;
        int var6_int = 0;
        int var11 = TombRacer.field_G ? 1 : 0;
        try {
          int var7 = 0;
          if (null == this.field_p) {
            var6_int = 6684672;
          } else {
            if (!this.field_p.k((byte) -120).b(4)) {
              var6_int = this.field_p.c(17832);
            } else {
              var6_int = this.field_p.g((byte) -108);
            }
          }
          var8 = this.field_h.c(-29) / 2;
          var9 = this.field_h.a((byte) 55) / 2;
          int var10 = 86 % ((param4 + 38) / 47);
          oq.a(-var8 + param2, -var9 + param1, param3, 255, param2 + var8, var6_int, param1 + var9, true);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ioa.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    ioa(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    ioa(int param0) {
        super(param0);
    }

    public static void i(int param0) {
        int var1 = -55 / ((param0 + 17) / 59);
        field_n = null;
        field_o = null;
        field_m = null;
    }

    static {
        field_n = new dq(0, 0);
        field_m = "<%0> has withdrawn the request to join.";
        field_o = "Run using the arrow keys or W, A, S and D.";
    }
}
