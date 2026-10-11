/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    static boolean field_b;
    static bg field_a;

    final static void a(byte param0) {
        vl.h(-1);
        wi.field_C = true;
        gd.field_B = true;
        if (param0 == 117) {
          mb.field_b.n(21974);
          t.a(false, vb.field_a, param0 ^ 117);
          return;
        }
        field_b = false;
        mb.field_b.n(21974);
        t.a(false, vb.field_a, param0 ^ 117);
    }

    final static gj a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        gj var5 = null;
        gj stackIn_4_0 = null;
        gj stackIn_8_0 = null;
        gj stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() != 0) {
            var2_int = param0.indexOf('@');
            if (var2_int == -1) {
              stackIn_8_0 = dh.field_d;
              return stackIn_8_0;
            }
            if (param1 > -15) {
              field_a = (bg) null;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(1 + var2_int);
            var5 = ha.a(92, var3);
            if (var5 == null) {
              return hm.a(var4, true);
            }
            stackIn_14_0 = var5;
            return stackIn_14_0;
          }
          stackIn_4_0 = bj.field_h;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("dg.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 < 57) {
          return;
        }
        field_a = null;
    }

    static {
        field_b = false;
        field_a = new bg(14, 0, 4, 1);
    }
}
