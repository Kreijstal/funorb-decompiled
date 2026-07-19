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
        boolean discarded$1 = false;
        RuntimeException var2 = null;
        at var2_ref = null;
        mt var3 = null;
        int var4 = 0;
        int var5 = 0;
        at stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        at stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                discarded$1 = gu.a(102);
                break L1;
              }
            }
            var2_ref = new at();
            var3 = new mt(param1);
            L2: while (true) {
              L3: {
                if (var3.a((byte) 16)) {
                  break L3;
                } else {
                  var4 = var3.b(-1);
                  if (Character.isWhitespace((char) var4)) {
                    continue L2;
                  } else {
                    L4: {
                      if (var4 == 34) {
                        var2_ref.a((byte) -119, (tc) (aw.a((byte) 121, var3)));
                        break L4;
                      } else {
                        if (var4 == 39) {
                          var2_ref.a((byte) -119, (tc) (aw.a((byte) 121, var3)));
                          break L4;
                        } else {
                          L5: {
                            if (var4 != 40) {
                              break L5;
                            } else {
                              var2_ref.a((byte) -119, (tc) (new og(mo.field_j, -1 + var3.field_c)));
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (var4 != 41) {
                              break L6;
                            } else {
                              var2_ref.a((byte) -119, (tc) (new og(gm.field_d, -1 + var3.field_c)));
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (44 != var4) {
                              break L7;
                            } else {
                              var2_ref.a((byte) -119, (tc) (new og(sb.field_d, var3.field_c + -1)));
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var2_ref.a((byte) -119, (tc) (bi.a((byte) -118, var3)));
                          if (var5 == 0) {
                            break L4;
                          } else {
                            var2_ref.a((byte) -119, (tc) (aw.a((byte) 121, var3)));
                            break L4;
                          }
                        }
                      }
                    }
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_23_0 = (at) (var2_ref);
              stackIn_24_0 = stackOut_23_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("gu.D(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != -16356) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1) {
        bv var2 = null;
        var2 = vl.field_n;
        if (param0 >= -31) {
          field_a = (String) null;
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
        field_a = "Connection timed out. Please try using a different server.";
    }
}
