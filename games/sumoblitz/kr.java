/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr {
    static String[] field_f;
    static ri[] field_b;
    static tf field_a;
    static int[] field_d;
    static int field_c;
    static int field_e;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        if (param0 > -58) {
            field_a = (tf) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static wb[] a(int param0, ki param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        wb[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wb[] stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 19889) {
                break L1;
              } else {
                field_d = (int[]) null;
                break L1;
              }
            }
            if (k.a(param1, param2, param3, param0 + -42935)) {
              stackOut_5_0 = bw.b(-124);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("kr.B(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wb[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (!param2) {
          if (param1 > -16) {
            L0: {
              kr.a(28);
              if (param0) {
                jj.field_d = jj.field_d + 1;
                o.a((byte) -56);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (param0) {
                jj.field_d = jj.field_d + 1;
                o.a((byte) -56);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          Sumoblitz.field_H = Sumoblitz.field_H + 1;
          rb.a(-129);
          if (param1 <= -16) {
            L2: {
              if (param0) {
                jj.field_d = jj.field_d + 1;
                o.a((byte) -56);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              kr.a(28);
              if (param0) {
                jj.field_d = jj.field_d + 1;
                o.a((byte) -56);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        }
    }

    static {
        field_f = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = new tf();
        field_e = 0;
        field_c = 256;
    }
}
