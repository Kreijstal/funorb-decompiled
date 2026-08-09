/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ls extends tm {
    final static String g(int param0) {
        if (param0 != -26370) {
            return (String) null;
        }
        if (!(nr.field_f != wk.field_f)) {
            return qr.field_f;
        }
        if (nr.field_f == mj.field_a) {
            return pr.field_c;
        }
        if (!(lc.field_e.a((byte) -80))) {
            return pr.field_c;
        }
        return ep.field_b;
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
              stackIn_4_0 = new li(qi.b(3));
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

            stackIn_7_1 = new StringBuilder().append("ls.C(").append(param0).append(',');

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

    ls(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
