/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class m extends am {
    static bm field_n;
    static String field_j;
    static String field_r;
    static String field_k;
    byte[] field_i;
    int field_o;
    static int field_q;
    static int field_h;
    static boolean field_l;
    static String[] field_m;
    static String field_p;

    public static void b(boolean param0) {
        field_n = null;
        field_m = null;
        field_k = null;
        field_p = null;
        field_r = null;
        if (param0) {
            field_r = null;
        }
        field_j = null;
    }

    final static boolean c(int param0) {
        int var1 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var1 = -81 / ((param0 - -27) / 63);
            if (null == nb.field_F) {
              break L1;
            } else {
              if (null == nb.field_F.k(0)) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final static void a(int param0, boolean param1, fd param2, int param3, int param4, int param5, int param6, int param7, int param8, long param9, String param10, int param11, int param12, boolean param13) {
        try {
            sc.field_g = new en(param7);
            s.field_b = new en(param4);
            fh.field_b = param8;
            uj.field_k = param2;
            vi.field_l = param9;
            uc.field_d = param10;
            if (param11 >= -22) {
                Object var16 = null;
                m.a(90, false, (fd) null, 122, -120, -27, -1, 13, 18, -21L, (String) null, 69, -50, true);
            }
            le.field_bb = param12;
            cb.field_c = param3;
            og.field_c = param0;
            rl.field_b = param5;
            ea.field_c = param6;
            wc.field_g = param13 ? true : false;
            sd.field_u = param1 ? true : false;
            if (uj.field_k.field_q != null) {
                try {
                    q.field_b = new bn(uj.field_k.field_q, 64, 0);
                } catch (IOException iOException) {
                    throw new RuntimeException(iOException.toString());
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static long a(boolean param0) {
        if (!param0) {
            field_q = 69;
        }
        return -bb.field_c + hn.a((byte) 80);
    }

    private m() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "<col=ffffff>Plasma<nbsp>cannon</col><br>The plasma cannon is the pinnacle of military technology. The plasma ball that this weapon fires explodes in a short-ranged ß-ray blast that can boil targets even through walls.";
        field_k = "Aha! A magnetically accelerated projectile weapon or \"railgun\".";
        field_j = "It's quiet<nbsp>... too quiet. That must mean it's completely safe.";
        field_n = new bm();
        field_m = new String[]{"All scores", "My scores", "Best each"};
        field_h = 50;
        field_p = "Well these rockets would be useful if I had a rocket launcher.";
    }
}
