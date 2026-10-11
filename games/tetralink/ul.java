/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul implements kg {
    static String field_a;
    static float field_d;
    static String field_b;
    static String field_e;
    static kh[] field_c;

    public static void a(int param0) {
        int var1 = -102 / ((-25 - param0) / 36);
        field_b = null;
        field_e = null;
        field_c = null;
        field_a = null;
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        oh var8 = null;
        gd var9 = null;
        try {
          if (!param3) {
            var9 = (gd) null;
            ul.a((byte) 88, (gd) null);
          }
          var6_int = param1 + param0.field_t;
          var7 = param2 + param0.field_w;
          in.a(var6_int, var7, (byte) -118, param0.field_F, param0.field_u);
          var8 = fj.field_q[1];
          if (param0 instanceof ae &&
            ((ae) (param0)).field_N) {
            var8.b((param0.field_F - var8.field_t >> 1) + 1 + var6_int, 1 + (var7 + (param0.field_u - var8.field_F >> 1)), 256);
          }
          if (!param0.c(3)) {
            return;
          }
          id.a(param0.field_F - 4, 2 + var7, 0, param0.field_u - 4, 2 + var6_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("ul.L(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0, gd param1) {
        gd var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          var3 = 114 / ((param0 - 0) / 52);
          param1.b(false);
          var2 = (gd) (gl.field_p.c(false));
          while (var2 != null) {
            if (var2.a((byte) -115, param1)) {
              var2 = (gd) (gl.field_p.a((byte) -70));
              continue;
            }
            break;
          }
          if (var2 != null) {
            cl.a(var2, -94, param1);
            return;
          }
          gl.field_p.a(param1, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("ul.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_a = "Unable to connect to the data server. Please check any firewall you are using.";
        field_b = "You have resigned.";
    }
}
