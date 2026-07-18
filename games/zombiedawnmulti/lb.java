/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static String field_e;
    static ul field_d;
    static int[] field_c;
    static int field_a;
    static String field_b;

    final static boolean a(String param0, String param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            int discarded$9 = 0;
            if (ol.a(param1)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (qa.a((byte) 29, param1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                if (gn.b((byte) 62, param1)) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                } else {
                  if (param0.length() != 0) {
                    if (!cr.a(param0, param1, -1)) {
                      if (a.a(param1, param0, (byte) -74)) {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0 != 0;
                      } else {
                        if (ia.a(127, param0, param1)) {
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          break L0;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0 != 0;
                    }
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("lb.C(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L1;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L1;
            }
          }
          L2: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L2;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + -10 + ')');
        }
        return stackIn_26_0 != 0;
    }

    final static void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!df.field_H) {
          return;
        } else {
          if (-1 != param0) {
            if (0 == param2) {
              fk.a(hl.field_d[1], true);
              field_c = null;
              return;
            } else {
              if (param2 == 1) {
                fk.a(hl.field_d[2], true);
                field_c = null;
                return;
              } else {
                if (param2 == 2) {
                  fk.a(hl.field_d[3], true);
                  field_c = null;
                  return;
                } else {
                  if (param2 != 3) {
                    if (4 != param2) {
                      field_c = null;
                      return;
                    } else {
                      fk.a(hl.field_d[1], true);
                      field_c = null;
                      return;
                    }
                  } else {
                    fk.a(hl.field_d[4], true);
                    field_c = null;
                    return;
                  }
                }
              }
            }
          } else {
            fk.a(hl.field_d[12], true);
            field_c = null;
            return;
          }
        }
    }

    final static void a(int param0) {
        String var1 = null;
        if (!ch.field_e) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (h.field_L != null) {
              h.field_L.m(-7435);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = ob.e(-24093);
          b.field_c = new qm(var1, (String) null, true, false, false);
          nb.field_a.b(3016, (cf) (Object) wj.field_i);
          wj.field_i.a((cf) (Object) b.field_c, (byte) -123);
          wj.field_i.h((byte) 49);
          return;
        }
    }

    public static void a() {
        field_c = null;
        field_d = null;
        field_b = null;
        field_e = null;
    }

    final static boolean a(byte param0, int param1) {
        return 0 <= param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You cannot join this game - it is in progress";
        field_e = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
