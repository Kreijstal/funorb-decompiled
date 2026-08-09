/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    static boolean field_b;
    static bg field_a;

    final static void a(byte param0) {
        vl.h(-1);
        wi.field_C = true;
        gd.field_B = true;
        if (param0 != 117) {
          field_b = false;
          mb.field_b.n(21974);
          t.a(false, vb.field_a, param0 ^ 117);
          return;
        } else {
          mb.field_b.n(21974);
          t.a(false, vb.field_a, param0 ^ 117);
          return;
        }
    }

    final static gj a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        gj var5 = null;
        gj stackIn_4_0 = null;
        gj stackIn_8_0 = null;
        gj stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (-1 != (param0.length() ^ -1)) {
                  var2_int = param0.indexOf('@');
                  if (var2_int == -1) {
                    stackIn_8_0 = dh.field_d;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      if (param1 <= -15) {
                        break L2;
                      } else {
                        field_a = (bg) null;
                        break L2;
                      }
                    }
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(1 + var2_int);
                    var5 = ha.a(92, var3);
                    if (var5 != null) {
                      stackIn_14_0 = (gj) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return hm.a(var4, true);
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = bj.field_h;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("dg.C(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    public static void b(byte param0) {
        if (param0 < 57) {
            return;
        }
        field_a = null;
    }

    static {
        field_b = false;
        field_a = new bg(14, 0, 4, 1);
    }
}
