/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nr extends oh {
    ln field_p;
    ln[] field_j;
    static fg field_m;
    static boolean[][] field_q;
    static bi field_k;
    static String field_n;
    static String field_o;
    static String field_s;
    int[] field_i;
    static v field_h;
    static bi[] field_r;
    static qb field_l;

    public static void a(byte param0) {
        field_r = null;
        field_o = null;
        field_l = null;
        field_n = null;
        field_s = null;
        field_k = null;
        field_m = null;
        field_h = null;
        field_q = (boolean[][]) null;
        if (param0 != 48) {
            nr.a(-27);
        }
    }

    final static java.awt.Container a(int param0) {
        if (param0 < 53) {
            return (java.awt.Container) null;
        }
        if (!(null == uf.field_b)) {
            return (java.awt.Container) ((Object) uf.field_b);
        }
        return (java.awt.Container) ((Object) kq.f((byte) 125));
    }

    nr(ln param0, int param1) {
        try {
            this.field_j = null;
            this.field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "nr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    nr(ln param0, int[] param1, ln[] param2) {
        int var4_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            this.field_j = param2;
            this.field_i = param1;
            this.field_p = param0;
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= this.field_i.length) {
                break L0;
              } else {
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("nr.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
    }

    static {
        field_m = new fg();
        field_o = "You can ask to join this game";
        field_s = "Battles won in hostile space.";
        field_n = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
