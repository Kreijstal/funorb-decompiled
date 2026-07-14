/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ff {
    static String field_e;
    static String field_b;
    int field_a;
    int field_c;
    static String field_f;
    static String field_d;

    final static void b(int param0) {
        ph.field_f = ec.b(false);
        u.field_b = new i();
        hl.a(true, 24574, true);
        if (param0 != -13408) {
            Object var2 = null;
            ff.a(113, 57, (String[]) null, (String) null);
        }
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        int var5 = 0;
        Object var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        if (param1 <= -99) {
          ma.field_o = da.field_d;
          if (255 != param0) {
            if (param0 <= -101) {
              if (-106 >= param0) {
                vb.field_j = wk.a((byte) 17, param2);
                return;
              } else {
                vb.field_j = mh.a(param0, true, param3);
                return;
              }
            } else {
              vb.field_j = mh.a(param0, true, param3);
              return;
            }
          } else {
            L0: {
              stackOut_13_0 = 0;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (-14 >= (uh.field_d ^ -1)) {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L0;
              } else {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L0;
              }
            }
            vb.field_j = di.a(stackIn_16_0 != 0, stackIn_16_1 != 0);
            return;
          }
        } else {
          var6 = null;
          ff.a(4, 59, (String[]) null, (String) null);
          ma.field_o = da.field_d;
          if (255 != param0) {
            if (param0 <= -101) {
              if (-106 >= param0) {
                vb.field_j = wk.a((byte) 17, param2);
                return;
              } else {
                vb.field_j = mh.a(param0, true, param3);
                return;
              }
            } else {
              vb.field_j = mh.a(param0, true, param3);
              return;
            }
          } else {
            L1: {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (-14 >= (uh.field_d ^ -1)) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            vb.field_j = di.a(stackIn_5_0 != 0, stackIn_5_1 != 0);
            return;
          }
        }
    }

    final static void a(byte param0) {
        int var1 = 107 / ((param0 - 10) / 41);
        ga.field_E = new nc();
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ff(int param0, int param1, int param2, int param3) {
        ((ff) this).field_c = param3;
        ((ff) this).field_a = param0;
    }

    final static void a(int param0, dl param1, boolean param2, byte param3, int param4, int param5, int param6, int param7, String param8, boolean param9, int param10, int param11, int param12, long param13) {
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
              te.field_N = new jd(param11);
              id.field_c = new jd(param7);
              if (!param9) {
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
              cl.field_m = stackIn_3_0 != 0;
              if (!param2) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            b.field_b = stackIn_6_0 != 0;
            lc.field_l = param8;
            if (param3 > 87) {
              ia.field_kb = param6;
              qa.field_n = param1;
              ci.field_jb = param10;
              al.field_n = param4;
              jj.field_s = param0;
              ki.field_C = param5;
              jh.field_f = param12;
              wk.field_b = param13;
              if (qa.field_n.field_b == null) {
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              } else {
                try {
                  pj.field_D = new hb(qa.field_n.field_b, 64, 0);
                } catch (java.io.IOException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return;
                }
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 255) {
            return;
        }
        field_e = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Discard";
        field_e = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_f = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_d = "Orb points: <%0>";
    }
}
