/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends pi {
    static String field_s;
    byte[] field_t;
    static int field_u;
    boolean field_q;
    static int[] field_p;
    static String[] field_o;
    static String[][] field_n;
    static String field_r;

    af() {
    }

    public static void a(int param0) {
        field_n = null;
        field_r = null;
        field_p = null;
        field_o = null;
        if (param0 != -12707) {
          field_p = null;
          field_s = null;
          return;
        } else {
          field_s = null;
          return;
        }
    }

    final static int a(sb param0, ta param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            var8 = new StringBuilder(8);
            var4 = 0;
            var5 = -1;
            L1: while (true) {
              L2: {
                if (param0.field_u.length <= param0.field_o) {
                  break L2;
                } else {
                  L3: {
                    var5 = param0.d((byte) -54);
                    if (nn.field_l != var5) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (!ne.a(var5, uf.field_q, param0, (byte) -99)) {
                      break L4;
                    } else {
                      if (var4 != 0) {
                        break L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (var5 != el.field_d) {
                    StringBuilder discarded$3 = var8.append((char)var5);
                    continue L1;
                  } else {
                    L5: {
                      if (var4 != 0) {
                        if (param0.field_o - -1 != param0.field_u.length) {
                          L6: {
                            var6 = param0.m(4);
                            if (ne.a(var6, uf.field_q, param0, (byte) -81)) {
                              break L6;
                            } else {
                              if (nn.field_l == var6) {
                                break L6;
                              } else {
                                if (var6 == el.field_d) {
                                  StringBuilder discarded$4 = var8.append((char)var6);
                                  break L5;
                                } else {
                                  param0.field_o = param0.field_o - 1;
                                  StringBuilder discarded$5 = var8.append((char)var5);
                                  break L5;
                                }
                              }
                            }
                          }
                          param0.field_o = param0.field_o - 1;
                          break L5;
                        } else {
                          throw new RuntimeException("Unterminated quote!");
                        }
                      } else {
                        break L5;
                      }
                    }
                    L7: {
                      if (var4 != 0) {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        break L7;
                      } else {
                        stackOut_21_0 = 1;
                        stackIn_23_0 = stackOut_21_0;
                        break L7;
                      }
                    }
                    var4 = stackIn_23_0;
                    continue L1;
                  }
                }
              }
              param1.a((byte) -105, (pi) (Object) new lj(var8.toString()));
              stackOut_27_0 = var5;
              stackIn_28_0 = stackOut_27_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("af.A(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          L9: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + -113 + 41);
        }
        return stackIn_28_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_s = "Retry";
        field_n = new String[][]{null, new String[1]};
        field_r = "Cost: <%0>";
    }
}
