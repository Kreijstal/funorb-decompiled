/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    int field_b;
    int field_f;
    static int field_e;
    static int field_c;
    static String field_a;
    static String field_d;

    final static void a(int param0) {
        gl.a(126, 4);
        if (param0 != 26566) {
            me.a(-97, (String) null, (int[]) null, 72L, -125);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    me(int param0, int param1, int param2, int param3) {
        this.field_f = param3;
        this.field_b = param0;
    }

    public static void a(byte param0) {
        if (param0 != -36) {
          me.a(97, (String) null, (int[]) null, -40L, 2);
          field_a = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static boolean a(int param0, String param1, int[] param2, long param3, int param4) {
        mq var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
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
            if (rb.a(param3, param1, -17231, param4, param2)) {
              L1: {
                if (param4 == 1) {
                  param4 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              rs.field_t = param4;
              qd.field_G = param1;
              var7 = (CharSequence) ((Object) param1);
              wm.field_b = k.a(var7, false);
              dj.field_e = param3;
              var6 = fg.a(-11, uj.field_n, param2, vs.field_g, hf.field_f);
              vs.a(256, var6);
              if (param0 > 77) {
                stackIn_9_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_e = -67;
                return true;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6_ref);

            stackIn_12_1 = new StringBuilder().append("me.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    static {
        field_e = -1;
        field_a = "You have: <%0>";
        field_c = -1;
        field_d = "Reload game";
    }
}
