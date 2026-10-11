/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    static int[] field_i;
    static String field_c;
    static int field_h;
    static String field_l;
    static String field_m;
    static String[] field_k;
    static int[] field_d;
    static qp field_b;
    static eb[] field_a;
    static String field_e;
    static String field_g;
    static int[][] field_j;
    static dd field_f;

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        field_m = null;
        field_d = null;
        field_f = null;
        field_l = null;
        if (param0 < 9) {
          return;
        }
        field_j = (int[][]) null;
        field_a = null;
        field_e = null;
        field_b = null;
        field_c = null;
        field_k = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((param1 & 7) != 0) {
          var2 = 8 - (param1 & 7);
        }
        int var3 = param1 + var2;
        if (param0 != 8) {
          return -16;
        }
        return var3;
    }

    final static void a(int param0, int param1, int param2) {
        ad.field_u = param0;
        m.field_f = param2;
        int var3 = 62 % ((59 - param1) / 59);
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          if (!p.a(param1, (byte) -113, param0)) {
            return false;
          }
          if (param2 != -37) {
            return true;
          }
          for (var3_int = 0; var3_int < param1.length(); var3_int++) {
            if (!uc.a(param1.charAt(var3_int), (byte) -51)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("w.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final static tc a(boolean param0, int param1) {
        tc var2 = new tc(param1, param0);
        return var2;
    }

    static {
        field_c = "<%0> are <%2>.";
        field_i = new int[]{1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 32, 32, 34, 53, 68, 69, 69, 69, 73, 73, 83, 83, 83, 92, 97, 99};
        field_l = "Cancel unrated rematch";
        field_d = new int[]{12, 20, 21, 49, 6, 7};
        field_m = "Quick Chat Help";
        field_e = "<%0> and <%1> have resigned!";
        field_g = "<%0><br>versus<br><%1>";
    }
}
