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
        at stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        at stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                boolean discarded$2 = gu.a(102);
                break L1;
              }
            }
            var2 = new at();
            var3 = new mt(param1);
            L2: while (true) {
              if (var3.a((byte) 16)) {
                stackOut_17_0 = (at) var2;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                var4 = var3.b(-1);
                if (Character.isWhitespace((char) var4)) {
                  continue L2;
                } else {
                  L3: {
                    if (var4 == 34) {
                      break L3;
                    } else {
                      if (var4 == 39) {
                        break L3;
                      } else {
                        if (var4 != 40) {
                          if (var4 != 41) {
                            if (44 != var4) {
                              var2.a((byte) -119, (tc) (Object) bi.a((byte) -118, var3));
                              continue L2;
                            } else {
                              var2.a((byte) -119, (tc) (Object) new og(sb.field_d, var3.field_c + -1));
                              continue L2;
                            }
                          } else {
                            var2.a((byte) -119, (tc) (Object) new og(gm.field_d, -1 + var3.field_c));
                            continue L2;
                          }
                        } else {
                          var2.a((byte) -119, (tc) (Object) new og(mo.field_j, -1 + var3.field_c));
                          continue L2;
                        }
                      }
                    }
                  }
                  var2.a((byte) -119, (tc) (Object) aw.a((byte) 121, var3));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2_ref;
            stackOut_19_1 = new StringBuilder().append("gu.D(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_18_0;
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1) {
        bv var2 = null;
        var2 = vl.field_n;
        if (param0 >= -31) {
          field_a = null;
          var2.h(32161, param1);
          var2.b(1, 1);
          var2.b(1, 0);
          return;
        } else {
          var2.h(32161, param1);
          var2.b(1, 1);
          var2.b(1, 0);
          return;
        }
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
