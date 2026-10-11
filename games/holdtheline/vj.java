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
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ak.field_b == sf.field_n) {
            stackIn_2_0 = null;
            return (nd) (stackIn_2_0);
          }
          if (param0 != 0) {
            field_o = (String) null;
          }
          if (fd.field_c == ak.field_b &&
            param1.equals(rd.field_j)) {
            ak.field_b = gg.field_M;
            stackIn_8_0 = ja.field_U;
            return stackIn_8_0;
          }
          ak.field_b = sf.field_n;
          ja.field_U = null;
          rd.field_j = param1;
          stackIn_10_0 = null;
          return (nd) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("vj.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
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
