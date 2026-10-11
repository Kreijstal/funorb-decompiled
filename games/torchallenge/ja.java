/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    int field_c;
    int field_i;
    static am field_g;
    int field_d;
    int field_h;
    static int field_f;
    static String field_b;
    static boolean[][] field_e;
    static boolean[][] field_j;
    static int field_a;

    final static boolean a(byte param0, int param1) {
        if (param0 < 91) {
          return false;
        }
        if (param1 < 3) {
          return false;
        }
        if (10 >= param1) {
          return true;
        }
        return false;
    }

    public static void a(int param0) {
        field_g = null;
        field_e = (boolean[][]) null;
        int var1 = -91 / ((param0 + 62) / 55);
        field_j = (boolean[][]) null;
        field_b = null;
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = df.a(param2, '_', "", (byte) 126);
          var3 = je.a(param2, 0);
          if (param1 <= 74) {
            ja.a((byte) -72, 59);
          }
          stackIn_7_0 = (-1 != param0.indexOf(param2)) || (param0.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ja.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var1 = 18 % ((param0 - 73) / 49);
        lb.field_s = 0;
    }

    static {
        field_f = 0;
        field_g = new am(2);
        field_e = new boolean[][]{new boolean[]{false, false, true, false, false, true}, new boolean[]{false, false, true, false, false, true}, new boolean[]{false, false, true, false, false, true}};
        field_j = new boolean[][]{new boolean[]{false, true, true}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{true, true, true}, new boolean[]{false, false, false}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true}, new boolean[]{true}};
    }
}
