/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    static String[] field_c;
    static String field_a;
    static String field_b;
    static long field_f;
    static int[] field_e;
    static l field_d;

    final static void a(MinerDisturbance param0, int param1) {
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        nb.field_i = new ml[12];
        ui.field_L = -640;
        pd.field_b = param0;
        mc.field_w = 4;
        q.field_c = 4;
        oj.field_J = 4;
        int[] var3 = new int[]{24, 23, 22, 1, 2, 3, 4};
        int[] var2 = var3;
        nb.field_i[4] = new ml(4, var2, 10, 200, -3 != (kb.field_c ^ -1) ? 320 : 350, 270, 270 / var3.length, true, 1);
        var2 = new int[]{11, 0, 10, 18};
        nb.field_i[1] = new ml(1, var2, 320, 430, 640, 320, -3 == (kb.field_c ^ -1) ? 210 : 160, false, 1);
        int[] var4 = new int[]{0};
        nb.field_i[3] = new ml(3, var4, 320, 430, 640, 320, 320, false, 1);
        int[] var5 = new int[]{7, 8, 9, 0};
        var2 = var5;
        nb.field_i[2] = new ml(2, var2, 320, 372, 640, 320, 600 / (var5.length - 1), false, 1);
        int[] var6 = new int[]{13, 1, 19, 5, 6, 3, 17};
        var2 = var6;
        nb.field_i[0] = new ml(0, var2, 10, 240, (kb.field_c ^ -1) == -3 ? 350 : 320, 240, 240 / var6.length, true, 1);
        int[] var7 = new int[]{2, 0};
        nb.field_i[5] = new ml(5, var7, 320, 430, 640, 320, 320, false, 1);
        int[] var8 = new int[]{16, 15};
        nb.field_i[6] = new ml(6, var8, 320, 220, 640, 320, 159, true, 1);
        if (param1 != 45977) {
            return;
        }
        try {
            var9 = new int[]{16, 0};
            nb.field_i[7] = new ml(7, var9, 320, 365, 640, 320, 320, false, 1);
            var10 = new int[]{16, 0};
            nb.field_i[8] = new ml(8, var10, 320, 430, 640, 320, 307, false, 1);
            var11 = new int[]{0, 4};
            nb.field_i[11] = new ml(11, var11, -1, -1, -1, -1, -1, false, -1);
            var12 = new int[]{12, 5, 6, 0};
            var2 = var12;
            nb.field_i[10] = new ml(10, var2, 10, 326, 310, 320, 140 / var12.length, true, 1);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "kf.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(rc param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              hj.field_f.a(param0);
              if (param1 < -36) {
                break L1;
              } else {
                kf.a(96);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kf.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 42959) {
          field_d = (l) null;
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    static {
        field_c = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_e = new int[]{0, 4096, 5793, 7094, 8192, 9159, 10033, 10837, 11585, 12288, 12953, 13585, 14189, 14768, 15326, 15864, 16384, 16888, 17378, 17854, 18318, 18770, 19212, 19644, 20066, 20480, 20886, 21283, 21674, 22058, 22435, 22806, 23170, 23530, 23884, 24232, 24576, 24915, 25249, 25580, 25905, 26227, 26545, 26859, 27170, 27477, 27780, 28081, 28378, 28672, 28963, 29251, 29537, 29819, 30099, 30377, 30652, 30924, 31194, 31462, 31727, 31991, 32252, 32511, 32768, 33023, 33276, 33527, 33776, 34024, 34270, 34514, 34756, 34996, 35235, 35472, 35708, 35942, 36175, 36406, 36636, 36864, 37091, 37316, 37540, 37763, 37985, 38205, 38424, 38642, 38858, 39073, 39287, 39500, 39712, 39923, 40132, 40341, 40548, 40755, 40960, 41164, 41368, 41570, 41771, 41972, 42171, 42369, 42567, 42763, 42959, 43154, 43348, 43541, 43733, 43925, 44115, 44305, 44494, 44682, 44869, 45056, 45242, 45427, 45611, 45795, 45977, 46160, 46341, 46522, 46702, 46881, 47059, 47237, 47415, 47591, 47767, 47942, 48117, 48291, 48465, 48637, 48809, 48981, 49152, 49322, 49492, 49661, 49830, 49998, 50166, 50332, 50499, 50665, 50830, 50995, 51159, 51323, 51486, 51649, 51811, 51972, 52134, 52294, 52454, 52614, 52773, 52932, 53090, 53248, 53405, 53562, 53719, 53874, 54030, 54185, 54340, 54494, 54647, 54801, 54954, 55106, 55258, 55410, 55561, 55712, 55862, 56012, 56162, 56311, 56459, 56608, 56756, 56903, 57051, 57198, 57344, 57490, 57636, 57781, 57926, 58071, 58215, 58359, 58503, 58646, 58789, 58931, 59073, 59215, 59357, 59498, 59639, 59779, 59919, 60059, 60199, 60338, 60477, 60615, 60753, 60891, 61029, 61166, 61303, 61440, 61576, 61712, 61848, 61984, 62119, 62254, 62388, 62523, 62657, 62790, 62924, 63057, 63190, 63323, 63455, 63587, 63719, 63850, 63982, 64113, 64243, 64374, 64504, 64634, 64763, 64893, 65022, 65151, 65279, 65408};
        field_b = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
