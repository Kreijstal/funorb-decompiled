/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends bh {
    static String field_t;
    int field_r;
    static ui[][] field_u;
    static int[] field_o;
    boolean field_s;
    int[] field_q;
    static String field_n;
    static String field_p;

    public static void a(int param0) {
        field_u = null;
        field_p = null;
        field_t = null;
        field_o = null;
        field_n = null;
    }

    final static void c(byte param0) {
        RuntimeException var1 = null;
        tj var1_ref = null;
        ve var1_ref2 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = client.field_A ? 1 : 0;
        try {
          L0: {
            var1_ref = (tj) (Object) i.field_b.c((byte) -53);
            L1: while (true) {
              if (var1_ref == null) {
                var1_ref2 = (ve) (Object) h.field_b.c((byte) 26);
                L2: while (true) {
                  if (var1_ref2 == null) {
                    var1_ref = (tj) (Object) oc.field_b.c((byte) 50);
                    L3: while (true) {
                      if (var1_ref == null) {
                        break L0;
                      } else {
                        if (0 < var1_ref.field_Qb) {
                          var1_ref.field_Qb = var1_ref.field_Qb - 1;
                          if (var1_ref.field_Qb != 0) {
                            var1_ref = (tj) (Object) oc.field_b.d(true);
                            continue L3;
                          } else {
                            var1_ref.field_hc = 0;
                            if (!var1_ref.g((byte) 59)) {
                              var1_ref = (tj) (Object) oc.field_b.d(true);
                              continue L3;
                            } else {
                              var1_ref.b((byte) 101);
                              var1_ref = (tj) (Object) oc.field_b.d(true);
                              continue L3;
                            }
                          }
                        } else {
                          var1_ref = (tj) (Object) oc.field_b.d(true);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (var1_ref2.field_Rb > 0) {
                      var1_ref2.field_Rb = var1_ref2.field_Rb - 1;
                      if (var1_ref2.field_Rb == 0) {
                        var1_ref2.field_oc = 0;
                        if (!var1_ref2.i((byte) 115)) {
                          var1_ref2 = (ve) (Object) h.field_b.d(true);
                          continue L2;
                        } else {
                          var1_ref2.b((byte) 113);
                          var1_ref2 = (ve) (Object) h.field_b.d(true);
                          continue L2;
                        }
                      } else {
                        var1_ref2 = (ve) (Object) h.field_b.d(true);
                        continue L2;
                      }
                    } else {
                      var1_ref2 = (ve) (Object) h.field_b.d(true);
                      continue L2;
                    }
                  }
                }
              } else {
                if (var1_ref.field_Qb <= 0) {
                  var1_ref = (tj) (Object) i.field_b.d(true);
                  continue L1;
                } else {
                  var1_ref.field_Qb = var1_ref.field_Qb - 1;
                  if (var1_ref.field_Qb != 0) {
                    var1_ref = (tj) (Object) i.field_b.d(true);
                    continue L1;
                  } else {
                    var1_ref.field_hc = 0;
                    if (var1_ref.g((byte) 111)) {
                      var1_ref.b((byte) 112);
                      var1_ref = (tj) (Object) i.field_b.d(true);
                      continue L1;
                    } else {
                      var1_ref = (tj) (Object) i.field_b.d(true);
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "sb.B(" + 123 + 41);
        }
    }

    final static fm a(long param0, String param1, boolean param2, String param3, int param4) {
        RuntimeException var6 = null;
        qa stackIn_5_0 = null;
        ob stackIn_7_0 = null;
        wk stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ob stackOut_6_0 = null;
        wk stackOut_8_0 = null;
        qa stackOut_4_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if ((long)param4 != param0) {
                break L1;
              } else {
                if (param3 != null) {
                  stackOut_6_0 = new ob(param3, param1);
                  stackIn_7_0 = stackOut_6_0;
                  return (fm) (Object) stackIn_7_0;
                } else {
                  break L1;
                }
              }
            }
            if (!param2) {
              stackOut_8_0 = new wk(param0, param1);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_4_0 = new qa(param0, param1);
              stackIn_5_0 = stackOut_4_0;
              return (fm) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("sb.C(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 41);
        }
        return (fm) (Object) stackIn_9_0;
    }

    sb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Secret achievement";
        field_o = new int[]{10076391, 4944180, 14961707, 16178128, 13820388};
        field_u = new ui[8][4];
        field_n = "Players: <%0>/<%1>";
        field_p = "Show players in <%0>'s game";
    }
}
