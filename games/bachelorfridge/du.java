/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class du {
    int field_c;
    static js field_a;
    int field_d;
    static ee field_b;
    static int[] field_e;

    final static eq a(String param0, byte param1) {
        RuntimeException var2 = null;
        String var3 = null;
        Object stackIn_4_0 = null;
        eq stackIn_8_0 = null;
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
            L1: {
              if (param1 == -43) {
                break L1;
              } else {
                var3 = (String) null;
                du.a((String) null, (byte) -83);
                break L1;
              }
            }
            if (dka.field_G != kq.field_j) {
              L2: {
                if (dka.field_G != ki.field_w) {
                  break L2;
                } else {
                  if (!param0.equals(vh.field_w)) {
                    break L2;
                  } else {
                    dka.field_G = tn.field_a;
                    stackIn_8_0 = vo.field_d;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              vh.field_w = param0;
              dka.field_G = kq.field_j;
              vo.field_d = null;
              stackIn_10_0 = null;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("du.A(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (eq) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return (eq) ((Object) stackIn_10_0);
          }
        }
    }

    du(int param0, int param1, int param2, int param3) {
        this.field_d = param3;
        this.field_c = param0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 8192) {
            field_a = (js) null;
            field_a = null;
            field_e = null;
            return;
        }
        field_a = null;
        field_e = null;
    }

    static {
        field_e = new int[8192];
    }
}
