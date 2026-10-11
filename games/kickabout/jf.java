/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends tm {
    static hd field_B;
    static String field_A;
    static hd field_D;

    public static void g(int param0) {
        if (param0 >= 26) {
          field_D = null;
          field_A = null;
          field_B = null;
          return;
        }
        up var2 = (up) null;
        jf.a(70, (up) null, -110);
        field_D = null;
        field_A = null;
        field_B = null;
    }

    jf(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        li stackIn_2_0 = null;
        li stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 84) {
            stackIn_4_0 = new li(os.a(106, (String) (param1[0].field_d)));
            return stackIn_4_0;
          }
          stackIn_2_0 = (li) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, up param1, int param2) {
        try {
          np.field_Jb.a(new ie(param2, param1), 3);
          int var3_int = -77 % ((param0 + 44) / 63);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "jf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_A = "<%0> is not on your ignore list.";
    }
}
