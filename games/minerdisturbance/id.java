/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    int field_g;
    int field_d;
    static bj field_c;
    static String[] field_l;
    private long field_k;
    String field_e;
    private int field_h;
    static int[] field_b;
    private String field_m;
    static String field_i;
    private boolean field_j;
    int[] field_a;
    int field_f;

    public static void b() {
        field_l = null;
        field_i = null;
        field_b = null;
        field_c = null;
    }

    final static jh a(byte param0, String param1, int param2) {
        ic var3 = null;
        RuntimeException var3_ref = null;
        ic stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        ic stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new ic();
            ((jh) (Object) var3).field_f = param1;
            ((jh) (Object) var3).field_e = param2;
            stackOut_0_0 = (ic) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("id.B(").append(-34).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param2 + ')');
        }
        return (jh) (Object) stackIn_1_0;
    }

    final int a(int param0) {
        if (!((id) this).field_j) {
          if (((id) this).field_g != 2) {
            if (param0 >= 25) {
              if (kf.field_f == ((id) this).field_k) {
                return 1;
              } else {
                if (ha.field_g == 2) {
                  int discarded$14 = 66;
                  if (!fa.a(((id) this).field_m)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              return 26;
            }
          } else {
            if (((id) this).field_h <= 0) {
              if (param0 >= 25) {
                if (kf.field_f == ((id) this).field_k) {
                  return 1;
                } else {
                  if (ha.field_g == 2) {
                    int discarded$15 = 66;
                    if (!fa.a(((id) this).field_m)) {
                      return 0;
                    } else {
                      return 1;
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                return 26;
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
    }

    id(boolean param0) {
        ((id) this).field_h = mk.field_a;
        ((id) this).field_m = vd.field_x;
        ((id) this).field_e = bf.field_c;
        ((id) this).field_k = il.field_v;
        ((id) this).field_d = ig.field_e;
        ((id) this).field_g = pf.field_i;
        if (param0) {
            ((id) this).field_a = pi.field_l;
        } else {
            ((id) this).field_a = null;
        }
        ((id) this).field_f = pl.field_c;
        ((id) this).field_j = sa.field_u;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_l = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_i = "Email (Login):";
    }
}
