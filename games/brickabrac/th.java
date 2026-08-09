/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static jp field_j;
    int field_g;
    static String field_f;
    static String[] field_a;
    static boolean field_d;
    static jp field_i;
    static boolean field_h;
    static jp field_c;
    int field_e;
    static boolean field_b;

    public static void a(int param0) {
        int var1 = -115 % ((83 - param0) / 41);
        field_f = null;
        field_a = null;
        field_i = null;
        field_c = null;
        field_j = null;
    }

    final static boolean a(int[] param0, long param1, int param2, boolean param3, String param4) {
        og var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!kb.a(param1, -3, param4, param0, param2)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 != 1) {
                  break L1;
                } else {
                  param2 = 0;
                  break L1;
                }
              }
              L2: {
                tk.field_p = param4;
                ng.field_b = param2;
                var7 = (CharSequence) ((Object) param4);
                kb.field_Qb = gb.a(var7, 64);
                qn.field_n = param1;
                var6 = hq.a(param0, cp.field_K, ko.field_j, nb.field_e, (byte) -78);
                if (!param3) {
                  break L2;
                } else {
                  field_f = (String) null;
                  break L2;
                }
              }
              fk.a(105, var6);
              stackIn_9_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6_ref);

            stackIn_12_1 = new StringBuilder().append("th.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final static void a(byte param0) {
        String var2;
        if (param0 != -63) {
          var2 = (String) null;
          th.a((int[]) null, 43L, -67, true, (String) null);
          ri.c(true);
          return;
        } else {
          ri.c(true);
          return;
        }
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
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
              if (param1 < -81) {
                break L1;
              } else {
                th.a((byte) -77);
                break L1;
              }
            }
            stackIn_3_0 = bl.a(0, false, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("th.D(");

            if (param0 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void b(int param0) {
        if (param0 != 1) {
            th.a((byte) 83);
            if (!nq.field_p) {
                return;
            }
            rd.a(-1);
            return;
        }
        if (nq.field_p) {
            rd.a(-1);
            return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    th(int param0, int param1, int param2, int param3) {
        this.field_g = param3;
        this.field_e = param0;
    }

    static {
        field_h = false;
        field_f = "Players: ";
    }
}
