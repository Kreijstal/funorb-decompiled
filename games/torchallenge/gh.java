/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends da {
    mi[] field_q;
    static String field_z;
    int[] field_o;
    int field_p;
    byte[][][] field_s;
    mi[] field_j;
    static int[] field_n;
    static String field_v;
    int field_l;
    static String field_y;
    int[] field_u;
    static String field_r;
    int[] field_t;
    static String field_i;
    static int[][][] field_k;
    static boolean field_x;
    static int field_w;
    static boolean field_m;

    public static void a(int param0) {
        field_r = null;
        field_n = null;
        field_k = (int[][][]) null;
        field_z = null;
        if (param0 != -16742) {
          gh.a(-119);
          field_y = null;
          field_i = null;
          field_v = null;
          return;
        } else {
          field_y = null;
          field_i = null;
          field_v = null;
          return;
        }
    }

    final static void a(byte param0, String param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ae.field_C = param2;
              hl.field_e = true;
              da.field_c = new wa(t.field_b, dl.field_H, param1, eb.field_m, ae.field_C);
              t.field_b.a((byte) 73, (ee) (da.field_c));
              if (param0 == -116) {
                break L1;
              } else {
                field_y = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("gh.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    gh() {
    }

    static {
        field_z = "Open in popup window";
        field_v = "FULL ACCESS";
        field_y = "Seal";
        field_r = "You have <%0> unread messages!";
        field_n = new int[]{300, 300, 300, 425, 300};
        field_x = false;
        field_i = "Help posts: ON";
        field_k = new int[][][]{new int[][]{new int[]{0, 0}}, new int[][]{new int[]{0, 0}}, new int[][]{new int[]{0, 0}}, new int[][]{new int[]{0, 0}, new int[]{229, 82}}, new int[][]{new int[]{0, 0}}};
        field_m = false;
    }
}
