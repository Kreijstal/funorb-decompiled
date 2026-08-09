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

    public static void b(int param0) {
        field_l = null;
        field_i = null;
        field_b = null;
        field_c = null;
        if (param0 != 8192) {
            field_i = (String) null;
        }
    }

    final static jh a(byte param0, String param1, int param2) {
        ic var3 = null;
        RuntimeException var3_ref = null;
        ic stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -34) {
                break L1;
              } else {
                field_b = (int[]) null;
                break L1;
              }
            }
            var3 = new ic();
            ((jh) ((Object) var3)).field_f = param1;
            ((jh) ((Object) var3)).field_e = param2;
            stackIn_3_0 = (ic) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("id.B(").append(param0).append(',');

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
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return (jh) ((Object) stackIn_3_0);
    }

    final int a(int param0) {
        if (!this.field_j) {
          if (-3 != (this.field_g ^ -1)) {
            if (param0 >= 25) {
              if (kf.field_f == this.field_k) {
                return 1;
              } else {
                if (-3 == (ha.field_g ^ -1)) {
                  if (!fa.a(this.field_m, (byte) 66)) {
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
            if (this.field_h <= 0) {
              if (param0 >= 25) {
                if (kf.field_f == this.field_k) {
                  return 1;
                } else {
                  if (-3 == (ha.field_g ^ -1)) {
                    if (!fa.a(this.field_m, (byte) 66)) {
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
        this.field_h = mk.field_a;
        this.field_m = vd.field_x;
        this.field_e = bf.field_c;
        this.field_k = il.field_v;
        this.field_d = ig.field_e;
        this.field_g = pf.field_i;
        if (param0) {
            this.field_a = pi.field_l;
        } else {
            this.field_a = null;
        }
        this.field_f = pl.field_c;
        this.field_j = sa.field_u;
    }

    static {
        field_b = new int[8192];
        field_l = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_i = "Email (Login):";
    }
}
