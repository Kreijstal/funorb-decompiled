/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static rj field_c;
    static String field_a;
    static boolean[][] field_b;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final static boolean a(byte param0, uf param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.j(-88);
          stackIn_3_0 = (var2_int == 1) ? 1 : 0;
          var3 = stackIn_3_0;
          if (param0 < 39) {
            field_b = (boolean[][]) null;
          }
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("jh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        if (param0 < 30) {
          return false;
        }
        if (li.field_N) {
          if (null == eb.field_l) {
            return true;
          }
          if (!d.p(-67)) {
            return false;
          }
          if (vh.field_d == null) {
            return true;
          }
          return false;
        }
        if (!d.p(-67)) {
          return false;
        }
        if (vh.field_d != null) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = (boolean[][]) null;
        if (param0 != -14282) {
          jh.a((byte) -122);
        }
    }

    static {
        field_c = new rj();
        field_b = new boolean[][]{new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{true, true, true}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{true, true, true}, new boolean[]{false, false, false}, new boolean[]{false, false, false}};
        field_a = null;
    }
}
