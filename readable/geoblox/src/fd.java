/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    int field_a;

    final static void a(java.applet.Applet param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 126 % ((-26 - param1) / 49);
            var3 = param0.getParameter("username");
            if (var3 != null) {
              var4 = (CharSequence) ((Object) var3);
              if (0L != rh.a(var4, -48)) {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var2);

          stackIn_6_1 = new StringBuilder().append("fd.A(");

          if (param0 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, gd param1, boolean param2, int param3) {
        PcmSampleStream var4 = PcmSampleStream.a(param1, 100, param3);
        cg var5 = rl.a(param0, var4, 1000);
        qa.field_f.addLast(-103, new je(var4, var5));
        if (param2) {
            return;
        }
        try {
            ge.field_d.a(var5);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "fd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
