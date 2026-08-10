/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static int field_c;
    static long field_e;
    static String field_b;
    static int[] field_d;
    static int field_a;

    final static void a(String[][] param0, String[] param1, byte param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = Pool.field_O;
        try {
            re.field_e = param1;
            lb.field_P = param0;
            for (var3_int = 0; var3_int < lb.field_P.length; var3_int++) {
                for (var4 = 0; var4 < lb.field_P[var3_int].length; var4++) {
                    if (!(lb.field_P[var3_int][var4] == null)) {
                        lb.field_P[var3_int][var4] = lb.field_P[var3_int][var4].toLowerCase();
                    }
                }
            }
            if (param2 != -96) {
                field_b = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "hf.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int[] a(int param0, byte param1) {
        int var2;
        var2 = param0;
        if ((var2 ^ -1) == 0) {
          return jc.field_i;
        } else {
          if (var2 != 0) {
            if (1 == var2) {
              return dq.field_i;
            } else {
              if (var2 == 2) {
                return bc.field_c;
              } else {
                var2 = -97 % ((14 - param1) / 35);
                return null;
              }
            }
          } else {
            return v.field_a;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_d = (int[]) null;
        }
        field_d = null;
        field_b = null;
    }

    static {
        field_b = "Similar rating";
        field_a = 4800;
    }
}
