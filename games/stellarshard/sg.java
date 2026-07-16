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
        int var2 = 0;
        var2 = -9 / ((-76 - param0) / 46);
        if (dj.field_a != el.field_E) {
          if (ta.field_m == el.field_E) {
            if (!param1.equals((Object) (Object) gk.field_c)) {
              el.field_E = dj.field_a;
              gk.field_c = param1;
              ed.field_d = null;
              return null;
            } else {
              el.field_E = ok.field_a;
              return ed.field_d;
            }
          } else {
            el.field_E = dj.field_a;
            gk.field_c = param1;
            ed.field_d = null;
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -29297) {
          field_d = null;
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
            IOException var15 = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            L0: {
              ae.field_N = new ha(param9);
              pg.field_fb = new ha(param0);
              il.field_v = param4;
              if (!param7) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L0;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L0;
              }
            }
            L1: {
              tl.field_b = stackIn_3_0 != 0;
              t.field_f = param12;
              if (!param13) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            L2: {
              uj.field_f = stackIn_6_0 != 0;
              ue.field_d = param10;
              h.field_d = param3;
              df.field_j = param2;
              od.field_z = param8;
              kg.field_E = param5;
              i.field_b = param11;
              if (param6 > 72) {
                break L2;
              } else {
                boolean discarded$2 = sg.a((byte) 88);
                break L2;
              }
            }
            wd.field_a = param1;
            if (il.field_v.field_e == null) {
              return;
            } else {
              try {
                L3: {
                  e.field_a = new pc(il.field_v.field_e, 64, 0);
                  break L3;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
              return;
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
