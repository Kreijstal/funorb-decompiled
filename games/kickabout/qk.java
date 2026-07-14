/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends wi {
    static String field_G;
    static int[] field_I;
    static String field_F;
    static int[] field_E;
    static String field_H;

    private qk(String param0, jv param1) {
        this(param0, nb.field_i.field_l, param1);
        ((qk) this).field_r = nb.field_i.field_o;
    }

    private qk(String param0, gj param1, jv param2) {
        super(param0, param1, param2);
        ((qk) this).field_r = nb.field_i.field_o;
    }

    qk(String param0, jv param1, boolean param2) {
        this(param0, param1);
        ((qk) this).field_A = param2 ? true : false;
    }

    final static uo a(String param0, sj param1, int param2, String param3, sj param4) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        if (param2 <= 63) {
          var7 = null;
          uo discarded$2 = qk.a((String) null, (sj) null, -54, (String) null, (sj) null);
          var5 = param4.b(param3, -1);
          var6 = param4.a((byte) -98, param0, var5);
          return cq.a(10, param1, var6, var5, param4);
        } else {
          var5 = param4.b(param3, -1);
          var6 = param4.a((byte) -98, param0, var5);
          return cq.a(10, param1, var6, var5, param4);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((qk) this).field_A = !((qk) this).field_A ? true : false;
        super.b(param0, param1, param2, param3);
    }

    public static void a(byte param0) {
        field_F = null;
        field_H = null;
        field_E = null;
        field_G = null;
        if (param0 <= 99) {
            return;
        }
        field_I = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Semi-Finals";
        field_I = new int[]{0, 4096, 5793, 7094, 8192, 9159, 10033, 10837, 11585, 12288, 12953, 13585, 14189, 14768, 15326, 15864, 16384, 16888, 17378, 17854, 18318, 18770, 19212, 19644, 20066, 20480, 20886, 21283, 21674, 22058, 22435, 22806, 23170, 23530, 23884, 24232, 24576, 24915, 25249, 25580, 25905, 26227, 26545, 26859, 27170, 27477, 27780, 28081, 28378, 28672, 28963, 29251, 29537, 29819, 30099, 30377, 30652, 30924, 31194, 31462, 31727, 31991, 32252, 32511, 32768, 33023, 33276, 33527, 33776, 34024, 34270, 34514, 34756, 34996, 35235, 35472, 35708, 35942, 36175, 36406, 36636, 36864, 37091, 37316, 37540, 37763, 37985, 38205, 38424, 38642, 38858, 39073, 39287, 39500, 39712, 39923, 40132, 40341, 40548, 40755, 40960, 41164, 41368, 41570, 41771, 41972, 42171, 42369, 42567, 42763, 42959, 43154, 43348, 43541, 43733, 43925, 44115, 44305, 44494, 44682, 44869, 45056, 45242, 45427, 45611, 45795, 45977, 46160, 46341, 46522, 46702, 46881, 47059, 47237, 47415, 47591, 47767, 47942, 48117, 48291, 48465, 48637, 48809, 48981, 49152, 49322, 49492, 49661, 49830, 49998, 50166, 50332, 50499, 50665, 50830, 50995, 51159, 51323, 51486, 51649, 51811, 51972, 52134, 52294, 52454, 52614, 52773, 52932, 53090, 53248, 53405, 53562, 53719, 53874, 54030, 54185, 54340, 54494, 54647, 54801, 54954, 55106, 55258, 55410, 55561, 55712, 55862, 56012, 56162, 56311, 56459, 56608, 56756, 56903, 57051, 57198, 57344, 57490, 57636, 57781, 57926, 58071, 58215, 58359, 58503, 58646, 58789, 58931, 59073, 59215, 59357, 59498, 59639, 59779, 59919, 60059, 60199, 60338, 60477, 60615, 60753, 60891, 61029, 61166, 61303, 61440, 61576, 61712, 61848, 61984, 62119, 62254, 62388, 62523, 62657, 62790, 62924, 63057, 63190, 63323, 63455, 63587, 63719, 63850, 63982, 64113, 64243, 64374, 64504, 64634, 64763, 64893, 65022, 65151, 65279, 65408};
        field_H = "Players";
        field_E = new int[10];
        field_F = "<%0> goes through <%1> for having more successfull tackles than <%2>";
        field_E[0] = 2;
        field_E[4] = 1;
        field_E[6] = 1;
        field_E[7] = 2;
        field_E[2] = 3;
        field_E[1] = 1;
        field_E[3] = 2;
        field_E[9] = 9;
        field_E[5] = 1;
        field_E[8] = 2;
    }
}
