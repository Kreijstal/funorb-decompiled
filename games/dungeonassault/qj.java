/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static ai[] field_c;
    static String field_a;
    static String field_b;
    static String[] field_f;
    static String[] field_e;
    static String field_d;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 != -2418) {
            Object var2 = null;
            qj.a(68, -99, 85, 14, (int[]) null, 57, 16, 52, 84, 64, 97, 118, (int[]) null, 57, -36, -28);
        }
        field_e = null;
        field_f = null;
    }

    final static void a(byte param0) {
        int var1 = -31 / ((param0 - -45) / 35);
        hl.field_a = ea.b(120);
        lg.field_w = new ji();
        na.a(true, 2591221, true);
    }

    final static void a(java.applet.Applet param0, byte param1) {
        if (param1 != 89) {
            field_e = null;
        }
        String var2 = param0.getParameter("username");
        if (var2 != null) {
            CharSequence var3 = (CharSequence) (Object) var2;
            // ifne L55
        }
        return;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int[] param12, int param13, int param14, int param15) {
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = DungeonAssault.field_K;
        var16 = param0 & 16711935;
        var17 = 65280 & param0;
        param10 = -param15;
        L0: while (true) {
          if (param10 >= 0) {
            L1: {
              if (param11 > 68) {
                break L1;
              } else {
                qj.a(-102);
                break L1;
              }
            }
            return;
          } else {
            param8 = -param13;
            L2: while (true) {
              if ((param8 ^ -1) <= -1) {
                param14 = param14 + param5;
                param3 = param3 + param7;
                param10++;
                continue L0;
              } else {
                param3++;
                param2 = param4[param3];
                if (0 == param2) {
                  param14++;
                  param8++;
                  continue L2;
                } else {
                  param2 = param2 >> 16;
                  param2 = (var16 * param2 & -16711936 | 16711680 & var17 * param2) >>> -290534424;
                  param9 = (param2 & 16711935) * param6;
                  param2 = (-param9 + param2 * param6 & 16711680) + (-16711936 & param9) >>> 1566873192;
                  param9 = param12[param14];
                  param1 = param2 - -param9;
                  param2 = (16711935 & param2) + (16711935 & param9);
                  param9 = (65536 & -param2 + param1) + (16777472 & param2);
                  param14++;
                  param12[param14] = mp.a(param9 + -(param9 >>> 443472456), -param9 + param1);
                  param8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Confirm Password: ";
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_f = new String[]{"Thievery", "Drawing on a lifetime of experience, the <%0> can coordinate great acts of larceny. With his skills to assist, the likelihood of waking the dungeon's master when stealing its gold is reduced."};
        field_d = "Your party sneaks past the monster.";
        field_e = new String[16];
    }
}
