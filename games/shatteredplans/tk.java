/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends jc {
    int field_A;
    ob field_D;
    static bi field_x;
    static String field_B;
    static long field_z;
    byte field_w;
    static String[] field_v;
    static int field_y;
    static nq field_C;

    final int e(int param0) {
        if (null == ((tk) this).field_D) {
          return 0;
        } else {
          if (param0 != 0) {
            return 19;
          } else {
            return 100 * ((tk) this).field_D.field_j / (-((tk) this).field_w + ((tk) this).field_D.field_h.length);
          }
        }
    }

    final byte[] e(byte param0) {
        if (!((tk) this).field_u) {
          if (-((tk) this).field_w + ((tk) this).field_D.field_h.length <= ((tk) this).field_D.field_j) {
            if (param0 <= 48) {
              int discarded$2 = ((tk) this).e(92);
              return ((tk) this).field_D.field_h;
            } else {
              return ((tk) this).field_D.field_h;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    public static void d(boolean param0) {
        field_x = null;
        field_B = null;
        field_C = null;
        field_v = null;
    }

    tk() {
    }

    final static void a(int param0, int param1, byte param2) {
        sl var3 = js.field_f;
        var3.h(param0, 255);
        var3.c(3, (byte) -71);
        var3.c(9, (byte) -110);
        var3.d(param1, 255);
    }

    final static boolean a(long param0, String param1, boolean param2, int[] param3, int param4) {
        vm var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        String stackIn_10_0 = null;
        String stackIn_11_0 = null;
        String stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (j.a(2, param3, param1, param4, param0)) {
              if (!param2) {
                L1: {
                  if (param4 == 1) {
                    param4 = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  em.field_h = param4;
                  gi.field_a = param1;
                  stackOut_9_0 = (String) param1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (param2) {
                    stackOut_11_0 = (String) (Object) stackIn_11_0;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L2;
                  } else {
                    stackOut_10_0 = (String) (Object) stackIn_10_0;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L2;
                  }
                }
                nd.field_k = ji.a((CharSequence) (Object) stackIn_12_0, stackIn_12_1 != 0);
                hd.field_k = param0;
                var6 = bo.a(param3, (byte) -112, nl.field_d, hl.field_I, kh.field_Nb);
                sl.a(0, var6);
                stackOut_12_0 = 1;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6_ref;
            stackOut_14_1 = new StringBuilder().append("tk.K(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param4 + 41);
        }
        return stackIn_13_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Send private message to <%0>";
    }
}
