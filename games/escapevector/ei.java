/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends hg {
    static byte[][] field_l;
    static int field_j;
    static String field_n;
    static String field_k;
    boolean field_g;
    static mf field_m;
    byte[] field_h;
    static boolean field_i;

    final static boolean d(int param0) {
        vj discarded$2 = null;
        String var2 = null;
        if (param0 != 1000) {
          var2 = (String) null;
          discarded$2 = ei.a(10, true, 83L, (String) null, (String) null);
          return hc.a(false, oc.d((byte) -110));
        } else {
          return hc.a(false, oc.d((byte) -110));
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 != 0) {
            field_n = (String) null;
            return ul.a(param1, param2, 96);
        }
        return ul.a(param1, param2, 96);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = EscapeVector.field_A;
        if (param9 != -15733) {
          field_n = (String) null;
          if (param1 >= param8) {
            if (param1 >= param5) {
              if (param8 < param5) {
                va.a(param12, param6, param13, param10, em.field_i, param7, param3, param0, param8, param5, param1, true, param4, param2, param15, param14, param11);
                return;
              } else {
                va.a(param12, param4, param10, param13, em.field_i, param0, param15, param7, param5, param8, param1, true, param6, param2, param3, param14, param11);
                return;
              }
            } else {
              va.a(param6, param12, param13, param11, em.field_i, param2, param14, param0, param8, param1, param5, true, param4, param7, param15, param3, param10);
              return;
            }
          } else {
            if (param5 <= param8) {
              if (param5 <= param1) {
                va.a(param4, param12, param10, param11, em.field_i, param2, param14, param7, param5, param1, param8, true, param6, param0, param3, param15, param13);
                return;
              } else {
                va.a(param4, param6, param11, param10, em.field_i, param7, param3, param2, param1, param5, param8, true, param12, param0, param14, param15, param13);
                return;
              }
            } else {
              va.a(param6, param4, param11, param13, em.field_i, param0, param15, param2, param1, param8, param5, true, param12, param7, param14, param3, param10);
              return;
            }
          }
        } else {
          if (param1 >= param8) {
            if (param1 >= param5) {
              if (param8 < param5) {
                va.a(param12, param6, param13, param10, em.field_i, param7, param3, param0, param8, param5, param1, true, param4, param2, param15, param14, param11);
                return;
              } else {
                va.a(param12, param4, param10, param13, em.field_i, param0, param15, param7, param5, param8, param1, true, param6, param2, param3, param14, param11);
                return;
              }
            } else {
              va.a(param6, param12, param13, param11, em.field_i, param2, param14, param0, param8, param1, param5, true, param4, param7, param15, param3, param10);
              return;
            }
          } else {
            if (param5 <= param8) {
              if (param5 <= param1) {
                va.a(param4, param12, param10, param11, em.field_i, param2, param14, param7, param5, param1, param8, true, param6, param0, param3, param15, param13);
                return;
              } else {
                va.a(param4, param6, param11, param10, em.field_i, param7, param3, param2, param1, param5, param8, true, param12, param0, param14, param15, param13);
                return;
              }
            } else {
              va.a(param6, param4, param11, param13, em.field_i, param0, param15, param2, param1, param8, param5, true, param12, param7, param14, param3, param10);
              return;
            }
          }
        }
    }

    final static vj a(int param0, boolean param1, long param2, String param3, String param4) {
        RuntimeException var6 = null;
        pl stackIn_5_0 = null;
        bh stackIn_7_0 = null;
        ld stackIn_9_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bh stackOut_6_0 = null;
        ld stackOut_8_0 = null;
        pl stackOut_4_0 = null;
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
              if ((long)param0 != param2) {
                break L1;
              } else {
                if (param3 != null) {
                  stackOut_6_0 = new bh(param3, param4);
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!param1) {
              stackOut_8_0 = new ld(param2, param4);
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_4_0 = new pl(param2, param4);
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var6);
            stackOut_10_1 = new StringBuilder().append("ei.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vj) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (vj) ((Object) stackIn_7_0);
          } else {
            return (vj) ((Object) stackIn_9_0);
          }
        }
    }

    public static void e(int param0) {
        field_m = null;
        field_k = null;
        if (param0 >= -44) {
            return;
        }
        field_l = (byte[][]) null;
        field_n = null;
    }

    ei() {
    }

    static {
        field_l = new byte[1000][];
        field_n = "Use this alternative as your account name";
        field_k = "Play free version";
        field_j = 0;
        field_i = false;
    }
}
