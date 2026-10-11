/*
 * Decompiled by CFR-JS 0.4.0.
 */
class um extends od {
    static String field_k;
    static byte[] field_m;
    static mpa field_l;

    final static vb a(int param0, int param1, u param2, int param3, int param4) {
        qia var5 = null;
        RuntimeException var5_ref = null;
        sc var6 = null;
        vb var7 = null;
        vb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -6455) {
            field_k = (String) null;
          }
          var5 = qia.b(param2, 100, param4, param0);
          var6 = hda.a(param1, 1303, var5);
          var7 = new vb(var5, var6);
          tna.field_e.b((byte) -57, var7);
          kva.field_n.a(var6);
          stackIn_3_0 = var7;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("um.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    um() {
    }

    final static int a(int param0, int param1, int param2) {
        if (~param2 != param1) {
          return epa.field_r[param2];
        }
        if (kba.a(param1 + 1, param0)) {
          return 29;
        }
        return epa.field_r[param2];
    }

    public static void a(byte param0) {
        int var1 = -34 % ((-66 - param0) / 45);
        field_m = null;
        field_l = null;
        field_k = null;
    }

    static {
        field_k = "OpenGL";
    }
}
