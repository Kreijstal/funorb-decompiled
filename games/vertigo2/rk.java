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
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_8_0 = null;
        String stackOut_18_0 = null;
        String stackOut_25_0 = null;
        String stackOut_29_0 = null;
        String stackOut_21_0 = null;
        String stackOut_14_0 = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (param2 == 3) {
              stackOut_2_0 = j.field_s;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0 == -27) {
                  break L1;
                } else {
                  field_A = null;
                  break L1;
                }
              }
              if (param2 == 6) {
                stackOut_8_0 = sk.field_d;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (7 != param2) {
                  if (param2 != 8) {
                    if (param2 == 9) {
                      stackOut_18_0 = ad.field_d;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    } else {
                      if (10 != param2) {
                        if (param2 == 11) {
                          stackOut_25_0 = fg.field_cb;
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0;
                        } else {
                          if (param2 == 14) {
                            stackOut_29_0 = Vertigo2.a(new String[1], bk.field_b, -115);
                            stackIn_30_0 = stackOut_29_0;
                            break L0;
                          } else {
                            return null;
                          }
                        }
                      } else {
                        stackOut_21_0 = cf.field_b;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0;
                      }
                    }
                  } else {
                    stackOut_14_0 = re.field_c;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  }
                } else {
                  stackOut_11_0 = sp.field_K;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("rk.G(").append(param0).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L2;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param2 + 41);
        }
        return stackIn_30_0;
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
