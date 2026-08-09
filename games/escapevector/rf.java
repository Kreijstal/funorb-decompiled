/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static boolean field_b;
    static int field_a;

    final static fn a(int param0, int param1) {
        if (dj.field_d != null) {
          if (0 == param0) {
            return dj.field_d[0];
          } else {
            if (param0 != param1) {
              if (-32769 != (param0 ^ -1)) {
                if (-49153 != (param0 ^ -1)) {
                  return null;
                } else {
                  return dj.field_d[3];
                }
              } else {
                return dj.field_d[2];
              }
            } else {
              return dj.field_d[1];
            }
          }
        } else {
          return null;
        }
    }

    final static void a(fd param0, int param1, int param2, int param3, fd param4, int param5) {
        hn.field_s = param2;
        gf.field_e = param4;
        fe.field_k = param5;
        en.field_k = param1;
        if (param3 != 3) {
            return;
        }
        try {
            of.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "rf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static te a(int param0, te param1, int[] param2) {
        te var3 = null;
        RuntimeException var3_ref = null;
        te stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new te(0, 0, 0);
              if (param0 <= -15) {
                break L1;
              } else {
                field_a = 60;
                break L1;
              }
            }
            var3.field_a = param1.field_a;
            var3.field_k = param1.field_k;
            var3.field_g = param1.field_g;
            var3.field_i = param1.field_i;
            var3.field_l = param2;
            var3.field_h = param1.field_h;
            var3.field_f = param1.field_f;
            var3.field_d = param1.field_d;
            stackIn_3_0 = (te) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("rf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = true;
        field_a = -1;
    }
}
