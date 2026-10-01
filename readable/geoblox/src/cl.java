/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static java.security.SecureRandom field_e;
    static String field_d;
    static uf field_c;
    static int field_a;
    static Sprite field_b;

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        if (param0 != -9474) {
            cl.a(62);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static sl a(byte param0, String param1) {
        RuntimeException var2 = null;
        sl stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= 56) {
              field_a = -115;
            }
            if (IntrusiveDeque.field_d != si.field_g) {
              if (si.field_g == va.field_e) {
                if (param1.equals(cg.field_k)) {
                  si.field_g = uf.field_l;
                  stackIn_8_0 = ScorePopup.field_g;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              si.field_g = IntrusiveDeque.field_d;
              cg.field_k = param1;
              ScorePopup.field_g = null;
              stackIn_10_0 = null;
              decompiledRegionSelector0 = 1;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var2);

          stackIn_13_1 = new StringBuilder().append("cl.A(").append(param0).append(',');

          if (param1 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return (sl) ((Object) stackIn_10_0);
        }
    }

    static {
        field_a = 10;
        field_d = "Continue";
    }
}
