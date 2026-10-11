/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da extends de implements ih {
    static int[] field_k;
    private kp field_h;
    static int field_j;
    static int field_i;

    public final boolean c(int param0) {
        if (param0 != -12211) {
          field_j = -18;
          if (this.field_h.field_w != null) {
            return this.field_h.field_w.length() == 0 ? true : false;
          }
          return true;
        }
        if (this.field_h.field_w == null) {
          return true;
        }
        if (this.field_h.field_w.length() != 0) {
          return false;
        }
        return true;
    }

    public static void b(byte param0) {
        if (param0 >= -97) {
          da.b((byte) -31);
          field_k = null;
          return;
        }
        field_k = null;
    }

    abstract String b(int param0, String param1);

    final ba a(byte param0) {
        if (param0 > 24) {
          return this.a(-1, this.field_h.field_w);
        }
        field_i = 123;
        return this.a(-1, this.field_h.field_w);
    }

    da(kp param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(byte param0, kp param1) {
        try {
          if (param0 < 16) {
            String var4 = (String) null;
            this.b(-114, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "da.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String f(int param0) {
        if (param0 < -68) {
          return this.b(3614, this.field_h.field_w);
        }
        this.f(-53);
        return this.b(3614, this.field_h.field_w);
    }

    public final void a(int param0, kp param1) {
        kp var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 >= -10) {
            var4 = (kp) null;
            this.a((byte) -106, (kp) null);
            this.b(18340);
          } else {
            this.b(18340);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("da.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    abstract ba a(int param0, String param1);

    static {
    }
}
