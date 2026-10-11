/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static boolean field_e;
    static ae field_d;
    static String field_b;
    static vi field_a;
    static qj field_c;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 >= -47) {
          tl.a((byte) -113);
        }
    }

    final static boolean a(aa param0, aa param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        aa var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          if (param2 != -1) {
            var5 = (aa) null;
            tl.a((aa) null, (aa) null, 6);
          }
          var3_int = param0.field_ob - param1.field_ob;
          if (me.field_d != param0.field_jb) {
            if (null == param0.field_jb) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (me.field_d != param1.field_jb) {
            if (param1.field_jb == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("tl.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_e = true;
        field_d = new ae();
        field_b = "Username: ";
    }
}
