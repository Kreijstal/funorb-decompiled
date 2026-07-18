/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu {
    static b field_b;
    static String field_a;

    final static boolean a(int param0) {
        int var1 = -61 / ((-54 - param0) / 62);
        if (oa.field_I != null) {
            return oa.field_I.a(-30847, ui.field_i, rs.field_q);
        }
        return false;
    }

    final static at a(boolean param0, String param1) {
        at var2 = null;
        RuntimeException var2_ref = null;
        mt var3 = null;
        int var4 = 0;
        int var5 = 0;
        at stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        at stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2 = new at();
            var3 = new mt(param1);
            L1: while (true) {
              if (var3.a((byte) 16)) {
                stackOut_15_0 = (at) var2;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                var4 = var3.b(-1);
                if (Character.isWhitespace((char) var4)) {
                  continue L1;
                } else {
                  L2: {
                    if (var4 == 34) {
                      break L2;
                    } else {
                      if (var4 == 39) {
                        break L2;
                      } else {
                        if (var4 != 40) {
                          if (var4 != 41) {
                            if (44 != var4) {
                              var2.a((byte) -119, (tc) (Object) bi.a((byte) -118, var3));
                              continue L1;
                            } else {
                              var2.a((byte) -119, (tc) (Object) new og(sb.field_d, var3.field_c + -1));
                              continue L1;
                            }
                          } else {
                            var2.a((byte) -119, (tc) (Object) new og(gm.field_d, -1 + var3.field_c));
                            continue L1;
                          }
                        } else {
                          var2.a((byte) -119, (tc) (Object) new og(mo.field_j, -1 + var3.field_c));
                          continue L1;
                        }
                      }
                    }
                  }
                  var2.a((byte) -119, (tc) (Object) aw.a((byte) 121, var3));
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2_ref;
            stackOut_17_1 = new StringBuilder().append("gu.D(").append(false).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    public static void b() {
        field_b = null;
        field_a = null;
    }

    final static void a() {
        bv var2 = vl.field_n;
        var2.h(32161, 11);
        var2.b(1, 1);
        var2.b(1, 0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Connection timed out. Please try using a different server.";
    }
}
