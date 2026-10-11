/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vab {
    int field_b;
    static String field_a;
    private qfa field_c;

    protected final void finalize() throws Throwable {
        this.field_c.g(this.field_b, -92);
        super.finalize();
    }

    final static void a(byte param0, ml param1) {
        int var2_int = 0;
        ml var3 = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = VoidHunters.field_G;
        try {
          if (param0 != -94) {
            field_a = (String) null;
          }
          for (var2_int = 0; var2_int < 4; var2_int++) {
            var3 = new ml(32);
            var3.a(1, 1, new ml(24));
            var3.a(param0 ^ -93, 2, new ml(24));
            var3.a(1, 3, new ml(24));
            var3.a(param0 ^ -93, 4, new ml(24));
            var3.a(1, 5, new ml(24));
            param1.a(param0 ^ -93, var2_int, var3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("vab.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          field_a = (String) null;
        }
    }

    vab(qfa param0, int param1, int param2) {
        try {
          this.field_b = param2;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "vab.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Back";
    }
}
