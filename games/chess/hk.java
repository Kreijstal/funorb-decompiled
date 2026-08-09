/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends wc {
    static String field_L;
    static String field_N;
    static int field_H;
    static byte[][] field_K;
    static int field_M;
    static String field_J;
    static int field_I;

    hk(int param0) {
        this(rb.field_b, param0);
    }

    final String a(int param0, mf param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -29558) {
                break L1;
              } else {
                field_J = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = a.a((byte) 113, '*', param1.field_v.length());
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hk.Q(").append(param0).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void c(byte param0) {
        field_N = null;
        field_J = null;
        field_L = null;
        if (param0 != -42) {
            return;
        }
        field_K = (byte[][]) null;
    }

    final static km[] a(int param0, int param1, int param2, int param3) {
        if (param1 != 1) {
          field_J = (String) null;
          return sc.a(param2, 121, param3, 1, param0);
        } else {
          return sc.a(param2, 121, param3, 1, param0);
        }
    }

    private hk(lh param0, int param1) {
        super(param0, param1);
    }

    static {
        field_L = "This game is full.";
        field_N = "You have withdrawn your request to join.";
        field_J = "Offer unrated rematch";
        field_K = new byte[1000][];
        field_I = 640;
    }
}
