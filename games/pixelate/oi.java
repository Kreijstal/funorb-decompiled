/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static String field_b;
    static ak field_e;
    static volatile int field_c;
    static String field_a;
    static String field_d;

    final static boolean a(pl param0, int param1, boolean param2, String param3, byte param4, String param5, String param6) {
        RuntimeException var7 = null;
        dm var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (wm.field_a != tm.field_X) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var8 = new dm(wa.field_c, param0);
                wa.field_c.b(-6183, var8);
                if (!og.a((byte) -96)) {
                  L2: {
                    tm.field_X = rj.field_F;
                    v.field_b = null;
                    if (!param2) {
                      stackIn_9_0 = 0;
                      break L2;
                    } else {
                      stackIn_9_0 = 1;
                      break L2;
                    }
                  }
                  oc.field_J = stackIn_9_0 != 0;
                  nk.field_b = param3;
                  um.field_r = param1;
                  pm.field_s = param5;
                  vp.field_Nb = param6;
                  break L1;
                } else {
                  var8.h((byte) -118);
                  break L1;
                }
              }
              if (param4 < -86) {
                stackIn_13_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_d = (String) null;
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var7);

            stackIn_16_1 = new StringBuilder().append("oi.C(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param6 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    final static void a(String param0, String param1, byte param2) {
        try {
            if (param2 != -33) {
                String var4 = (String) null;
                oi.a((pl) null, -20, true, (String) null, (byte) -44, (String) null, (String) null);
            }
            gf.a(param1, false, 32, param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "oi.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, byte param3, uj param4, int param5, gp param6) {
        wi var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
            em.a(param4.field_Fb, param4.field_Nb, param4.field_Ub, -1, param4, -163, param6, (int[]) null, -1);
            eg.field_n.b(true, (byte) -98);
            eg.field_n.a(0, (int[]) null, -3);
            int var7_int = -127 / ((param3 - 0) / 38);
            eg.field_n.b(8893);
            var8 = eg.field_n;
            var9 = param0;
            var10 = param2;
            var11 = param5;
            var12 = param1;
            var8.field_b.b(var12, var9, 28, var10, var11);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "oi.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 0;
        field_b = "Searching for an opponent";
        field_a = "Decline invitation to <%0>'s game";
        field_d = "Your rating is <%0>";
    }
}
