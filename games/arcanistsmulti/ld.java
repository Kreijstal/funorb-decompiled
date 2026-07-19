/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends im {
    static eg field_q;
    static boolean field_p;
    static String field_l;
    static int[][] field_n;
    static int field_m;
    static String field_j;
    static String field_k;
    static String field_o;

    final static m a(boolean param0) {
        if (param0) {
            ld.c((byte) -35);
            return pc.field_e;
        }
        return pc.field_e;
    }

    ld(long param0, String param1) {
        super(param0, param1);
    }

    final static pb a(int param0, boolean param1) {
        pb discarded$2 = null;
        pb var2 = null;
        var2 = new pb();
        hn.field_q.b(var2, -1);
        ik.a(param0, 0);
        if (param1) {
          discarded$2 = ld.a(15, true);
          return var2;
        } else {
          return var2;
        }
    }

    final ch a(int param0) {
        if (param0 != 0) {
            return (ch) null;
        }
        return fe.field_n;
    }

    final static void c(byte param0) {
        if (param0 != 13) {
            field_m = 5;
            tc.field_A = null;
            return;
        }
        tc.field_A = null;
    }

    public static void b(byte param0) {
        field_o = null;
        field_n = (int[][]) null;
        field_j = null;
        field_k = null;
        field_l = null;
        field_q = null;
        int var1 = -71 / ((param0 - -50) / 40);
    }

    final static void a(cm param0, int param1, int param2) {
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
              cc.field_e.b(param0, -1);
              hb.a(param0, param2, (byte) 92);
              if (param1 >= 89) {
                break L1;
              } else {
                field_o = (String) null;
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
            stackOut_3_1 = new StringBuilder().append("ld.I(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_l = "Not yet achieved";
        field_j = "Reading Book of Storm";
        field_n = new int[][]{new int[]{255, 0, 255}, new int[]{255, 102, 153}, new int[]{255, 204, 153}, new int[]{255, 255, 153}, new int[]{255, 255, 102}, new int[]{255, 255, 0}, new int[]{255, 204, 0}, new int[]{255, 153, 0}, new int[]{255, 102, 0}, new int[]{255, 0, 0}, new int[]{204, 0, 0}, new int[]{153, 0, 0}, new int[]{153, 102, 51}, new int[]{102, 51, 0}, new int[]{153, 51, 102}, new int[]{153, 51, 204}, new int[]{153, 153, 204}, new int[]{153, 204, 51}, new int[]{51, 204, 51}, new int[]{51, 255, 0}, new int[]{0, 153, 51}, new int[]{0, 102, 0}, new int[]{0, 51, 102}, new int[]{0, 102, 153}, new int[]{0, 102, 204}, new int[]{0, 153, 255}, new int[]{0, 204, 255}, new int[]{102, 255, 204}, new int[]{69, 69, 69}, new int[]{102, 102, 102}, new int[]{153, 153, 153}, new int[]{204, 204, 204}};
        field_k = "Arcane spells focus on useful utilities and basic summoning abilities.";
    }
}
