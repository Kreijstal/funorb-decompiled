/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    static int[] field_a;
    static String field_e;
    static int[][] field_c;
    static ll[] field_f;
    static String field_b;
    static int[] field_g;
    static kc field_d;

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        th.field_f = param3;
        if (!param1) {
          L0: {
            field_b = null;
            if (param2 != 0) {
              break L0;
            } else {
              if (!dg.field_s) {
                break L0;
              } else {
                jm.field_b = co.field_d;
                dg.field_s = false;
                param2 = 9;
                break L0;
              }
            }
          }
          L1: {
            mn.field_r = param2;
            km.field_c = 0;
            if (!ij.b(mn.field_r, 10)) {
              break L1;
            } else {
              L2: {
                var4 = 0;
                if (mn.field_r == 10) {
                  var4 = -1;
                  break L2;
                } else {
                  break L2;
                }
              }
              tl.field_f[mn.field_r].a(param0, var4, (byte) -115);
              break L1;
            }
          }
          return;
        } else {
          L3: {
            if (param2 != 0) {
              break L3;
            } else {
              if (!dg.field_s) {
                break L3;
              } else {
                jm.field_b = co.field_d;
                dg.field_s = false;
                param2 = 9;
                break L3;
              }
            }
          }
          L4: {
            mn.field_r = param2;
            km.field_c = 0;
            if (!ij.b(mn.field_r, 10)) {
              break L4;
            } else {
              L5: {
                var4 = 0;
                if (mn.field_r == 10) {
                  var4 = -1;
                  break L5;
                } else {
                  break L5;
                }
              }
              tl.field_f[mn.field_r].a(param0, var4, (byte) -115);
              break L4;
            }
          }
          return;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        field_c = null;
        field_d = null;
        field_e = null;
        field_f = null;
    }

    final static void a(byte param0) {
        int var1 = -117 / ((param0 - 6) / 51);
        nj.field_c = 0;
        uc.a(3);
    }

    final static boolean a(int param0) {
        if (!hk.c(0)) {
            return false;
        }
        if ((jb.field_v & 8) != 0) {
            return false;
        }
        return true;
    }

    final static oo b(int param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        oo var2 = null;
        oo stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        oo stackOut_5_0 = null;
        try {
          L0: {
            if (param0 == -16635) {
              break L0;
            } else {
              field_e = null;
              break L0;
            }
          }
          var1_int = 0;
          L1: while (true) {
            var2 = bg.field_d.a(param0 + 16638, var1_int);
            if (var2.field_A) {
              stackOut_5_0 = (oo) var2;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              var1_int++;
              continue L1;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[41][];
        field_a = new int[]{6000, 4500, 3000, 2250, 1500, 1000, 500};
        field_c[31] = new int[7];
        field_c[10] = new int[2];
        field_c[29] = new int[1];
        field_c[11] = new int[2];
        field_c[7] = new int[2];
        field_c[4] = new int[2];
        field_c[6] = new int[0];
        field_c[14] = new int[1];
        field_c[28] = new int[1];
        field_c[8] = new int[1];
        field_c[2] = new int[4];
        field_c[17] = new int[1];
        field_c[36] = new int[1];
        field_c[26] = new int[1];
        field_c[3] = new int[2];
        field_c[39] = new int[1];
        field_c[13] = new int[1];
        field_c[30] = new int[1];
        field_c[1] = new int[2];
        field_c[37] = new int[1];
        field_c[33] = new int[2];
        field_c[5] = new int[4];
        field_c[25] = new int[3];
        field_c[9] = new int[4];
        field_c[15] = new int[1];
        field_c[32] = new int[4];
        field_e = "<%0> is already on your friend list.";
        field_b = "How to Leap and Bound";
        field_g = new int[]{0, 4096, 5793, 7094, 8192, 9159, 10033, 10837, 11585, 12288, 12953, 13585, 14189, 14768, 15326, 15864, 16384, 16888, 17378, 17854, 18318, 18770, 19212, 19644, 20066, 20480, 20886, 21283, 21674, 22058, 22435, 22806, 23170, 23530, 23884, 24232, 24576, 24915, 25249, 25580, 25905, 26227, 26545, 26859, 27170, 27477, 27780, 28081, 28378, 28672, 28963, 29251, 29537, 29819, 30099, 30377, 30652, 30924, 31194, 31462, 31727, 31991, 32252, 32511, 32768, 33023, 33276, 33527, 33776, 34024, 34270, 34514, 34756, 34996, 35235, 35472, 35708, 35942, 36175, 36406, 36636, 36864, 37091, 37316, 37540, 37763, 37985, 38205, 38424, 38642, 38858, 39073, 39287, 39500, 39712, 39923, 40132, 40341, 40548, 40755, 40960, 41164, 41368, 41570, 41771, 41972, 42171, 42369, 42567, 42763, 42959, 43154, 43348, 43541, 43733, 43925, 44115, 44305, 44494, 44682, 44869, 45056, 45242, 45427, 45611, 45795, 45977, 46160, 46341, 46522, 46702, 46881, 47059, 47237, 47415, 47591, 47767, 47942, 48117, 48291, 48465, 48637, 48809, 48981, 49152, 49322, 49492, 49661, 49830, 49998, 50166, 50332, 50499, 50665, 50830, 50995, 51159, 51323, 51486, 51649, 51811, 51972, 52134, 52294, 52454, 52614, 52773, 52932, 53090, 53248, 53405, 53562, 53719, 53874, 54030, 54185, 54340, 54494, 54647, 54801, 54954, 55106, 55258, 55410, 55561, 55712, 55862, 56012, 56162, 56311, 56459, 56608, 56756, 56903, 57051, 57198, 57344, 57490, 57636, 57781, 57926, 58071, 58215, 58359, 58503, 58646, 58789, 58931, 59073, 59215, 59357, 59498, 59639, 59779, 59919, 60059, 60199, 60338, 60477, 60615, 60753, 60891, 61029, 61166, 61303, 61440, 61576, 61712, 61848, 61984, 62119, 62254, 62388, 62523, 62657, 62790, 62924, 63057, 63190, 63323, 63455, 63587, 63719, 63850, 63982, 64113, 64243, 64374, 64504, 64634, 64763, 64893, 65022, 65151, 65279, 65408};
    }
}
