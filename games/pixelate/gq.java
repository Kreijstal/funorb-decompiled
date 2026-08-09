/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends go {
    static String field_l;
    static String field_m;
    static int field_n;

    final ea b(int param0) {
        if (param0 != -27096) {
            field_n = -3;
        }
        return da.field_o;
    }

    final static void a(int param0, int param1, int param2, String param3) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var4_int = param0;
            L1: while (true) {
              if (var4_int >= up.field_n.length) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (!up.field_n[var4_int].field_f) {
                  var4_int++;
                  continue L1;
                } else {
                  up.field_n[var4_int].a(param3, param2, -1379417087, param1);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("gq.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    gq(long param0, String param1) {
        super(param0, param1);
    }

    public static void e(int param0) {
        if (param0 != 100) {
            field_n = 92;
        }
        field_l = null;
        field_m = null;
    }

    final static boolean d(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 > 55) {
            break L0;
          } else {
            field_m = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (jg.a((byte) 59)) {
              break L2;
            } else {
              if ((uo.field_j ^ -1) < -1) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    static {
        field_l = "This game has started.";
        field_m = "Main Menu";
        field_n = 100;
    }
}
