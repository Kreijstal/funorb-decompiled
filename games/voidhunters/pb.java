/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static pb field_k;
    private int field_c;
    static pb field_g;
    int field_j;
    static pb field_d;
    static pb field_e;
    int field_i;
    private mj field_a;
    static pb field_l;
    static pb field_h;
    static pb field_b;
    static int field_m;
    static String field_n;
    static byte[] field_f;

    public static void a() {
        field_f = null;
        field_h = null;
        field_n = null;
        field_k = null;
        field_d = null;
        field_l = null;
        field_e = null;
        field_b = null;
        field_g = null;
    }

    final static pb a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        var2 = param1;
        if (0 == var2) {
          return field_k;
        } else {
          if (var2 == 1) {
            return field_g;
          } else {
            if (2 == var2) {
              return field_d;
            } else {
              if (var2 != 3) {
                if (var2 != 4) {
                  if (var2 == 5) {
                    return field_h;
                  } else {
                    if (6 == var2) {
                      return field_b;
                    } else {
                      return null;
                    }
                  }
                } else {
                  return field_l;
                }
              } else {
                return field_e;
              }
            }
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    private pb(int param0, int param1, mj param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            ((pb) this).field_c = param1;
            ((pb) this).field_a = param2;
            ((pb) this).field_j = param0;
            ((pb) this).field_i = ((pb) this).field_c * ((pb) this).field_a.field_h;
            if (16 > ((pb) this).field_j) {
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("pb.<init>(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new pb(0, 3, mj.field_d);
        field_g = new pb(1, 3, mj.field_d);
        field_d = new pb(2, 4, mj.field_f);
        field_e = new pb(3, 1, mj.field_d);
        field_l = new pb(4, 2, mj.field_d);
        field_h = new pb(5, 3, mj.field_d);
        field_b = new pb(6, 4, mj.field_d);
        field_m = ieb.a(16, -111);
        field_f = new byte[]{(byte) 31, (byte) -117, (byte) 8, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        field_n = "Launches a fighter for harrassment";
    }
}
