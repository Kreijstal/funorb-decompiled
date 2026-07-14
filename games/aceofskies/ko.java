/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko extends pm {
    static pa[] field_g;
    static int field_f;

    ko(long param0, String param1) {
        super(param0, param1);
    }

    final static String a(rb param0, int param1, byte param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        try {
          L0: {
            var3_int = param0.f(-129);
            if (param1 < var3_int) {
              var3_int = param1;
              break L0;
            } else {
              break L0;
            }
          }
          if (param2 <= -100) {
            return (String) (Object) stackIn_5_0;
          } else {
            stackOut_4_0 = (String) null;
            stackIn_5_0 = stackOut_4_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          var4 = new byte[var3_int];
          ((rb) param0).field_g = ((rb) param0).field_g + tq.field_i.a(0, var3_int, ((rb) param0).field_f, true, ((rb) param0).field_g, var4);
          var5 = hf.a(26, var3_int, 0, var4);
          stackOut_6_0 = (String) var5;
          stackIn_7_0 = stackOut_6_0;
        }
        return null;
    }

    final eo a(int param0) {
        if (param0 >= -51) {
            eo discarded$0 = ((ko) this).a(-83);
            return iu.field_h;
        }
        return iu.field_h;
    }

    public static void c(int param0) {
        field_g = null;
        if (param0 != 0) {
            rb var2 = (rb) null;
            String discarded$0 = ko.a((rb) null, 0, (byte) -22);
        }
    }

    static {
    }
}
