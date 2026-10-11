/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class um implements vc {
    private long field_b;
    static int field_a;

    final static tk a(byte param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        tk stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (gl.field_E.a(90) &&
            !param1.equals(gl.field_E.c(0))) {
            gl.field_E = co.a(param1, -100);
          }
          if (param0 != 110) {
            var3 = (String) null;
            um.a((byte) -101, (String) null);
          }
          stackIn_6_0 = gl.field_E;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("um.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void a(int param0) {
        this.field_b = pd.a(-22826);
        if (param0 != -7674) {
          this.field_b = -52L;
        }
    }

    public final String b(byte param0) {
        if (this.b(110)) {
          return null;
        }
        if (pd.a(-22826) >= 350L + this.field_b) {
          int var2 = -9 / ((-33 - param0) / 57);
          return this.c(-111);
        }
        return null;
    }

    abstract rh c(byte param0);

    abstract String c(int param0);

    public final rh a(byte param0) {
        if (param0 > -71) {
          this.field_b = 85L;
          if (this.b(121)) {
            return di.field_L;
          }
          if (!(pd.a(-22826) >= this.field_b + 350L)) {
            return se.field_l;
          }
          return this.c((byte) -7);
        }
        if (this.b(121)) {
          return di.field_L;
        }
        if (!(pd.a(-22826) >= this.field_b + 350L)) {
          return se.field_l;
        }
        return this.c((byte) -7);
    }

    static {
    }
}
