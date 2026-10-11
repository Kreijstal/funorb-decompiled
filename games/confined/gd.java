/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends rk {
    static int[] field_m;
    int field_s;
    static pf field_q;
    static String field_r;
    static nf[] field_t;
    static int field_n;
    int[] field_p;
    static int field_u;
    boolean field_o;

    final static in a(int param0, String param1, int param2) {
        in var3 = null;
        RuntimeException var3_ref = null;
        in stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new in(false);
          var3.field_f = param1;
          var3.field_g = param2;
          if (param0 != 4) {
            gd.a((byte) 14);
          }
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("gd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 == -3) {
          field_r = null;
          field_q = null;
          field_m = null;
          field_t = null;
          return;
        }
        pm var2 = (pm) null;
        gd.a(21, 49, (bi) null, (pm) null);
        field_r = null;
        field_q = null;
        field_m = null;
        field_t = null;
    }

    final static void a(int param0, int param1, bi param2, pm param3) {
        try {
          da.a(param0, 0, param2, false, param3);
          int var4_int = -74 / ((param1 + 76) / 32);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "gd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    gd() {
        this.field_o = false;
    }

    static {
        field_r = "Account created successfully!";
        field_u = 4;
    }
}
