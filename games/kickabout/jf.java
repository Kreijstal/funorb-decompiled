/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends tm {
    static hd field_B;
    static String field_A;
    static hd field_D;

    public static void g(int param0) {
        up var2;
        if (param0 < 26) {
          var2 = (up) null;
          jf.a(70, (up) null, -110);
          field_D = null;
          field_A = null;
          field_B = null;
          return;
        } else {
          field_D = null;
          field_A = null;
          field_B = null;
          return;
        }
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 84) {
              stackIn_4_0 = new li(os.a(106, (String) (param1[0].field_d)));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (li) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, up param1, int param2) {
        try {
            np.field_Jb.a(new ie(param2, param1), 3);
            int var3_int = -77 % ((param0 - -44) / 63);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "jf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_A = "<%0> is not on your ignore list.";
    }
}
