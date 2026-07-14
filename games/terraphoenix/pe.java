/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static pl field_b;
    static String[] field_c;
    private static long[] field_d;
    static int[] field_f;
    static og field_a;
    static int field_e;

    final static void a(int param0, String param1, int param2, int param3, int param4, int param5, int param6, he param7, int param8) {
        rf.field_v = param0;
        mc.field_b = param7;
        ml.field_s = param3;
        ng.field_y = param2;
        ai.field_c = param8;
        eb.field_B = param1;
        tj.field_wb = param5;
        lg.field_h = param4;
        if (param6 != 128) {
            field_d = null;
        }
        jg.field_kb = (h) (Object) new kg();
        t.field_c = new wh(param7);
        i.field_a = new qi(jg.field_kb, t.field_c);
    }

    public static void a(byte param0) {
        field_c = null;
        field_f = null;
        field_b = null;
        field_d = null;
        field_a = null;
        if (param0 != -107) {
            field_a = null;
        }
    }

    final static void a(int param0, pk param1, int param2, pk param3) {
        if (param2 != 48) {
            return;
        }
        da.field_h = param1;
        qk.field_a = param3;
        ch.field_c = param0;
        tb.a(l.field_k / 2, 21361, l.field_j / 2);
        aj.a(param3.field_p + param3.field_u, param2 + -19653, param1.field_p + param1.field_u, param3.field_u, param1.field_u);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_d = new long[256];
        field_c = new String[]{"Hostiles Neutralised", "Aliens Killed", "Grunts Killed", "Area secured", "Research base secured", "Airbase secured", "Manufacturing facility secured", "Alien transporter recovered", "Alien invader recovered", "Alien database stolen", "Alien codes stolen", "Warhead recovered", "Transporter captured", "Warhead set and ready", "Resources collected", "UFO escaped", "Base lost", "Assault failed", "Warhead lost", "Attack team failed", "Resources not recovered", "Soldiers wounded", "Soldiers lost", "Soldiers abandoned", "Difficulty bonus:", "Speed bonus:", "Mission score: ", "Game score: ", "Zombies Killed"};
        var2 = 0;
        L0: while (true) {
          if (var2 <= -257) {
            field_f = new int[]{128, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 58, 58, 58, 58, 58, 58, 58, 58, 108, 88, 98, 98, 48, 48, 128, 108, 58, 128, 128, 128, 128, 128, 48, 128, 78, 78, 68, 68, 68, 68, 50, 50, 40, 50, 50, 40, 50, 40, 50, 40, 50, 40, 50, 40, 50, 40, 50, 50, 70, 40, 128, 38, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 100, 128, 50, 50, 60, 50, 128, 98, 128, 128, 88, 118, 128, 78, 48, 128};
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (-9 <= var3) {
                field_d[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((var0 & 1L) != 1L) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = -3932672073523589310L ^ var0 >>> -1021229247;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
