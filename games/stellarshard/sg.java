/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sg {
    static pi field_a;
    static String field_b;
    static String field_d;
    static String[] field_c;

    final static void a(int param0, int param1) {
        int discarded$0 = td.a((byte) -108);
        int var2 = -79 % ((param0 - -20) / 51);
    }

    final static boolean a(byte param0) {
        if (param0 < 18) {
            return false;
        }
        return gk.field_a;
    }

    final static ml a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        ml stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var2_int = -9 / ((-76 - param0) / 46);
            if (dj.field_a != el.field_E) {
              L1: {
                if (ta.field_m != el.field_E) {
                  break L1;
                } else {
                  if (param1.equals((Object) (Object) gk.field_c)) {
                    el.field_E = ok.field_a;
                    stackOut_8_0 = ed.field_d;
                    stackIn_9_0 = stackOut_8_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              el.field_E = dj.field_a;
              gk.field_c = param1;
              ed.field_d = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (ml) (Object) stackIn_7_0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ml) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("sg.C(").append(param0).append(44);
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
          throw ma.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, int param1, String param2, int param3, ej param4, int param5, int param6, boolean param7, long param8, int param9, int param10, int param11, int param12, boolean param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                L1: {
                  ae.field_N = new ha(param9);
                  pg.field_fb = new ha(param0);
                  il.field_v = param4;
                  if (!param7) {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  } else {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    break L1;
                  }
                }
                L2: {
                  tl.field_b = stackIn_3_0 != 0;
                  t.field_f = param12;
                  if (!param13) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  uj.field_f = stackIn_6_0 != 0;
                  ue.field_d = param10;
                  h.field_d = param3;
                  df.field_j = param2;
                  od.field_z = param8;
                  kg.field_E = param5;
                  i.field_b = param11;
                  if (param6 > 72) {
                    break L3;
                  } else {
                    boolean discarded$1 = sg.a((byte) 88);
                    break L3;
                  }
                }
                wd.field_a = param1;
                if (il.field_v.field_e == null) {
                  break L0;
                } else {
                  {
                    L4: {
                      e.field_a = new pc(il.field_v.field_e, 64, 0);
                      break L4;
                    }
                  }
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) var15_ref;
                stackOut_13_1 = new StringBuilder().append("sg.E(").append(param0).append(44).append(param1).append(44);
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param2 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L5;
                }
              }
              L6: {
                stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param3).append(44);
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param4 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + param12 + 44 + param13 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Discard";
        field_a = new pi();
        field_c = new String[]{"Battle alien squadrons", "Play in fullscreen", "Activate the Phoenix Device"};
        field_d = "Current level : ";
    }
}
