/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static oj field_a;
    static String[] field_b;
    static int[][] field_c;

    public static void a(int param0) {
        if (param0 != 96) {
            hb var2 = (hb) null;
            jj.a((byte) 74, -122, (hb) null);
        }
        field_b = null;
        field_c = (int[][]) null;
        field_a = null;
    }

    final static od a(byte param0, int param1, hb param2) {
        RuntimeException var3 = null;
        od stackIn_2_0 = null;
        od stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 69) {
              stackIn_4_0 = ic.a(bb.b(param2, 100, 96, param1), 4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (od) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jj.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            vg.a(param1, cg.field_l, true, true, ua.field_d, 0, rc.field_c);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= cg.field_l) {
                L2: {
                  vg.a(param1 + param1, param1 + cg.field_l, true, false, ue.field_a, param1, vb.field_a);
                  var2_int = 60 / ((param0 - 80) / 34);
                  if (cg.field_l <= param1) {
                    break L2;
                  } else {
                    cg.field_l = param1;
                    break L2;
                  }
                }
                break L0;
              } else {
                lk.field_d[var2_int - -param1] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "jj.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, String param1, int param2) {
        try {
            hd.field_b = param0;
            aa.field_g = true;
            wg.field_d = new ik(ci.field_f, rh.field_q, param1, lb.field_d, hd.field_b);
            ci.field_f.b((qg) (wg.field_d), (byte) -71);
            if (param2 != 1702) {
                field_c = (int[][]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "jj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
