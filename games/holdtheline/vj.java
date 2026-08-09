/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vj extends wc {
    static String field_n;
    static int field_l;
    static String field_m;
    boolean field_q;
    static String field_o;
    boolean field_p;

    abstract vj c(boolean param0);

    final static nd b(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        nd stackIn_8_0 = null;
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
            if (ak.field_b != sf.field_n) {
              L1: {
                if (param0 == 0) {
                  break L1;
                } else {
                  field_o = (String) null;
                  break L1;
                }
              }
              L2: {
                if (fd.field_c != ak.field_b) {
                  break L2;
                } else {
                  if (!param1.equals(rd.field_j)) {
                    break L2;
                  } else {
                    ak.field_b = gg.field_M;
                    stackIn_8_0 = ja.field_U;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              ak.field_b = sf.field_n;
              ja.field_U = null;
              rd.field_j = param1;
              stackIn_10_0 = null;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("vj.M(").append(param0).append(',');

            if (param1 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nd) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return (nd) ((Object) stackIn_10_0);
          }
        }
    }

    public static void h(int param0) {
        field_m = null;
        if (param0 > -43) {
            field_n = (String) null;
            field_n = null;
            field_o = null;
            return;
        }
        field_n = null;
        field_o = null;
    }

    vj() {
    }

    static {
        field_n = "Kill the Zombies!";
        field_l = 0;
        field_o = "Orb coins: <%0>";
        field_m = "Password is valid";
    }
}
