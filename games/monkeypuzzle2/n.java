/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static String field_c;
    static float[][] field_d;
    static int field_a;
    static li[] field_b;

    public static void a(int param0) {
        if (param0 != -6991) {
            return;
        }
        field_d = (float[][]) null;
        field_c = null;
        field_b = null;
    }

    final static vk a(ad param0, ad param1, byte param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        vk stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (wg.a(param3, param4, param0, -3)) {
              L1: {
                if (param2 > 114) {
                  break L1;
                } else {
                  field_d = (float[][]) null;
                  break L1;
                }
              }
              stackIn_6_0 = pj.a((byte) 101, param1.b(255, param4, param3));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("n.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vk) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ki var5;
        float var6;
        if (-1 <= (wd.field_h.b(-89) ^ -1)) {
          if (param4 != -301) {
            n.a(54);
            return;
          } else {
            return;
          }
        } else {
          if (jj.b(true)) {
            var5 = (ki) ((Object) wd.field_h.d(4011));
            var5.field_q = (float)(-48 + param3);
            var5.field_B = (float)param2;
            var6 = (float)(10.0 / Math.sqrt((double)(param0 * param0 + param1 * param1)));
            var5.field_v = (float)param1 * var6;
            var5.field_u = 0;
            var5.field_D = var6 * (float)param0;
            hd.field_u.a(var5, (byte) 13);
            sc.field_c = sc.field_c + 1;
            if (-301 < (sc.field_c ^ -1)) {
              ok.field_d = false;
              if (param4 == -301) {
                return;
              } else {
                n.a(54);
                return;
              }
            } else {
              e.a(255, (byte) 40, 0);
              ok.field_d = false;
              if (param4 != -301) {
                n.a(54);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param4 == -301) {
              return;
            } else {
              n.a(54);
              return;
            }
          }
        }
    }

    static {
        field_c = "Names cannot start or end with space or underscore";
        field_d = new float[20][2];
        field_a = 3;
        field_b = new li[field_a];
    }
}
