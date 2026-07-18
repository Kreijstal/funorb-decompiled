/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static ue field_b;
    static String field_a;

    final static nq a(lu param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        nq stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        nq stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 1) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            var2_int = param0.b(16711935);
            if (255 != var2_int) {
              stackOut_5_0 = new nq(var2_int >> 5, var2_int & 31);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("qi.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    final static void a(byte param0) {
        int var2 = 0;
        var2 = BachelorFridge.field_y;
        if ((dj.field_c.field_h.field_h & 1 << dj.field_c.field_n) == 0) {
          if (0 != dj.field_c.field_h.field_h) {
            lr.field_k[10] = gt.field_r;
            if (param0 < 27) {
              field_b = null;
              return;
            } else {
              return;
            }
          } else {
            lr.field_k[10] = nt.field_w;
            if (param0 >= 27) {
              return;
            } else {
              field_b = null;
              return;
            }
          }
        } else {
          lr.field_k[10] = cd.field_k;
          if (param0 >= 27) {
            return;
          } else {
            field_b = null;
            return;
          }
        }
    }

    final static void b() {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == uc.field_m) {
          return;
        } else {
          var1 = (Object) (Object) uc.field_m;
          synchronized (var1) {
            L0: {
              uc.field_m = null;
              break L0;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Are you sure you want to delete this creature?";
    }
}
