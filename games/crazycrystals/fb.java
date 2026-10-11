/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fb {
    static String field_e;
    static String field_b;
    static String field_d;
    fq field_a;
    static ko field_c;

    public static void a(byte param0) {
        field_b = null;
        if (param0 == -50) {
          field_d = null;
          field_e = null;
          field_c = null;
          return;
        }
        fb.a((byte) -54);
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0, dl[] param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = CrazyCrystals.field_B;
        try {
          if (param1 != null &&
            param2 > 0) {
            var5_int = param1[0].field_n;
            var6 = param1[2].field_n;
            var7 = param1[1].field_n;
            param1[0].a(param3, param4);
            param1[2].a(-var6 + (param2 + param3), param4);
            kh.b(ob.field_b);
            kh.a(var5_int + param3, param4, -var6 + param2 + param3, param1[param0].field_o + param4);
            var8 = param3 + var5_int;
            var9 = param2 + param3 - var6;
            for (param3 = var8; var9 > param3; param3 = param3 + var7) {
              param1[1].a(param3, param4);
            }
            kh.a(ob.field_b);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("fb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    abstract void a(boolean param0, int param1, int param2, byte param3, boolean param4, int param5, int param6);

    abstract fb a(int param0);

    fb(fq param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "fb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "'<%1>' levels complete<br><col=<%0>>Proceeding to '<%2>' levels";
        field_d = "Still Alive";
    }
}
