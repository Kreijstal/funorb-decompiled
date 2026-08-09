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
        td.a((byte) -108);
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -9 / ((-76 - param0) / 46);
            if (dj.field_a != el.field_E) {
              L1: {
                if (ta.field_m != el.field_E) {
                  break L1;
                } else {
                  if (param1.equals(gk.field_c)) {
                    el.field_E = ok.field_a;
                    stackIn_9_0 = ed.field_d;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              el.field_E = dj.field_a;
              gk.field_c = param1;
              ed.field_d = null;
              stackIn_7_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("sg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ml) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ml) ((Object) stackIn_7_0);
          } else {
            return stackIn_9_0;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -29297) {
          field_d = (String) null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0, int param1, String param2, int param3, ej param4, int param5, int param6, boolean param7, long param8, int param9, int param10, int param11, int param12, boolean param13) {
        try {
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                L1: {
                  ae.field_N = new ha(param9);
                  pg.field_fb = new ha(param0);
                  il.field_v = param4;
                  if (!param7) {
                    stackIn_3_0 = 0;
                    break L1;
                  } else {
                    stackIn_3_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  tl.field_b = stackIn_3_0 != 0;
                  t.field_f = param12;
                  if (!param13) {
                    stackIn_6_0 = 0;
                    break L2;
                  } else {
                    stackIn_6_0 = 1;
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
                    sg.a((byte) 88);
                    break L3;
                  }
                }
                wd.field_a = param1;
                if (il.field_v.field_e == null) {
                  break L0;
                } else {
                  try {
                    L4: {
                      e.field_a = new pc(il.field_v.field_e, 64, 0);
                      break L4;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var15 = (IOException) (Object) decompiledCaughtException;
                    throw new RuntimeException(var15.toString());
                  }
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var15_ref);

                stackIn_15_1 = new StringBuilder().append("sg.E(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L6;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Discard";
        field_a = new pi();
        field_c = new String[]{"Battle alien squadrons", "Play in fullscreen", "Activate the Phoenix Device"};
        field_d = "Current level : ";
    }
}
