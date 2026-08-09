/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hq {
    static hd field_c;
    static nm[] field_b;
    static boolean field_a;
    static int field_d;
    static kg[] field_e;

    final static boolean a(byte param0) {
        ml var2;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        if (param0 == 10) {
          if ((vj.field_c ^ -1) <= -11) {
            if (nb.field_f) {
              return false;
            } else {
              L0: {
                if (oh.b(-14954)) {
                  stackIn_16_0 = 0;
                  break L0;
                } else {
                  stackIn_16_0 = 1;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          var2 = (ml) null;
          hq.a(-49, -20, (ml) null, 91);
          if ((vj.field_c ^ -1) <= -11) {
            if (nb.field_f) {
              return false;
            } else {
              L1: {
                if (oh.b(-14954)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final static int a(int param0, int param1, ml param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 22531) {
                break L1;
              } else {
                hq.a((byte) -59);
                break L1;
              }
            }
            stackIn_3_0 = wr.a(param1, param2, 1 << param3, param3, 1 << param1, 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("hq.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static void b(byte param0) {
        if (!(!kd.field_s)) {
            fa.b(-127);
        }
        if (param0 < 108) {
            hq.a((byte) 11);
            return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 123 / ((param0 - -76) / 50);
        field_e = null;
    }

    static {
        field_a = false;
    }
}
