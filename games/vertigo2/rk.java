/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class rk extends gp {
    boolean field_u;
    boolean field_t;
    volatile boolean field_z;
    static vl[] field_w;
    static String field_x;
    static int field_y;
    static cr field_v;
    static String[] field_A;

    abstract int i(int param0);

    final static String a(byte param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        String stackOut_16_0 = null;
        String stackOut_23_0 = null;
        String stackOut_27_0 = null;
        String stackOut_19_0 = null;
        String stackOut_12_0 = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (param2 == 3) {
              stackOut_2_0 = j.field_s;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param2 == 6) {
                stackOut_6_0 = sk.field_d;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (7 != param2) {
                  if (param2 != 8) {
                    if (param2 == 9) {
                      stackOut_16_0 = ad.field_d;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      if (10 != param2) {
                        if (param2 == 11) {
                          stackOut_23_0 = fg.field_cb;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          if (param2 == 14) {
                            stackOut_27_0 = Vertigo2.a(new String[1], bk.field_b, -115);
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            return null;
                          }
                        }
                      } else {
                        stackOut_19_0 = cf.field_b;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    }
                  } else {
                    stackOut_12_0 = re.field_c;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                } else {
                  stackOut_9_0 = sp.field_K;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("rk.G(").append(-27).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L1;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param2 + ')');
        }
        return stackIn_28_0;
    }

    final static void h(int param0) {
        rh.b(-14, 17);
    }

    public static void a(boolean param0) {
        field_w = null;
        field_v = null;
        field_x = null;
        field_A = null;
    }

    abstract byte[] a(byte param0);

    rk() {
        ((rk) this).field_z = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_w = new vl[255];
        for (var0 = 0; field_w.length > var0; var0++) {
            field_w[var0] = new vl();
        }
        field_x = "Main Menu";
    }
}
