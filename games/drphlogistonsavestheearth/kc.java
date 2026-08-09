/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends gi {
    static nh field_q;
    static boolean field_k;
    static bb field_n;
    int field_m;
    static he[] field_l;
    static int[][] field_o;
    static int field_r;
    static nh field_p;
    static String field_j;
    int field_h;
    static nh[] field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param7 != 28183) {
          field_l = (he[]) null;
          if (param5 >= param3) {
            if (param5 >= param4) {
              if (param4 <= param3) {
                fa.a(param4, (byte) -124, param2, param5, param0, param3, param6, param1, wj.field_l);
                return;
              } else {
                fa.a(param3, (byte) -124, param6, param5, param0, param4, param2, param1, wj.field_l);
                return;
              }
            } else {
              fa.a(param3, (byte) -124, param1, param4, param0, param5, param2, param6, wj.field_l);
              return;
            }
          } else {
            if (param4 <= param3) {
              if (param4 > param5) {
                fa.a(param5, (byte) -124, param6, param3, param0, param4, param1, param2, wj.field_l);
                return;
              } else {
                fa.a(param4, (byte) -124, param1, param3, param0, param5, param6, param2, wj.field_l);
                return;
              }
            } else {
              fa.a(param5, (byte) -124, param2, param4, param0, param3, param1, param6, wj.field_l);
              return;
            }
          }
        } else {
          if (param5 >= param3) {
            if (param5 >= param4) {
              if (param4 <= param3) {
                fa.a(param4, (byte) -124, param2, param5, param0, param3, param6, param1, wj.field_l);
                return;
              } else {
                fa.a(param3, (byte) -124, param6, param5, param0, param4, param2, param1, wj.field_l);
                return;
              }
            } else {
              fa.a(param3, (byte) -124, param1, param4, param0, param5, param2, param6, wj.field_l);
              return;
            }
          } else {
            if (param4 <= param3) {
              if (param4 > param5) {
                fa.a(param5, (byte) -124, param6, param3, param0, param4, param1, param2, wj.field_l);
                return;
              } else {
                fa.a(param4, (byte) -124, param1, param3, param0, param5, param6, param2, wj.field_l);
                return;
              }
            } else {
              fa.a(param5, (byte) -124, param2, param4, param0, param3, param1, param6, wj.field_l);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_q = null;
        field_j = null;
        field_o = (int[][]) null;
        field_l = null;
        field_i = null;
        field_n = null;
        if (param0 != -1) {
          kc.a(100, 93, 101, 72, -52, -125, 28, -79);
          field_p = null;
          return;
        } else {
          field_p = null;
          return;
        }
    }

    final static jb a(vj param0, vj param1, String param2, int param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        jb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param1.a(param2, (byte) -114);
            var6 = -24 % ((param3 - -39) / 54);
            var7 = param1.a((byte) -105, param4, var5_int);
            stackIn_1_0 = oj.a(var5_int, var7, param1, param0, 15619);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("kc.A(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_5_0), stackIn_14_2 + ')');
        }
        return stackIn_1_0;
    }

    private kc() throws Throwable {
        throw new Error();
    }

    static {
        field_k = false;
        field_n = new bb();
        field_o = new int[][]{new int[]{950, 950, 950, 1900, 1900, 1900, 1900, 2300}, new int[]{950}, new int[]{1250}, new int[]{1800, 1800, 1800}, new int[]{1400}, new int[]{800}, new int[]{1300, 1300, 1300}, new int[]{850}, new int[]{550}};
        field_j = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
