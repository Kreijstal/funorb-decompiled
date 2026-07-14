/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj extends nm {
    static int[] field_n;
    int field_m;
    int field_o;
    static jp field_q;
    static byte[] field_p;
    static int[] field_l;
    static dm field_j;
    static mh field_k;
    static dh field_r;
    static int field_i;

    final static hg[] a(boolean param0, tg param1) {
        int var5 = 0;
        hg var6 = null;
        int var7 = BrickABrac.field_J ? 1 : 0;
        if (!(param1.b(-125))) {
            return new hg[]{};
        }
        ql var8 = param1.a(0);
        while (-1 == (var8.field_f ^ -1)) {
            wj.a(-128, 10L);
        }
        if ((var8.field_f ^ -1) == -3) {
            return new hg[]{};
        }
        if (!param0) {
            return null;
        }
        int[] var12 = (int[]) var8.field_e;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        hg[] var4 = new hg[var12.length >> 1391905634];
        for (var5 = 0; var4.length > var5; var5++) {
            var6 = new hg();
            var4[var5] = var6;
            var6.field_d = var3[var5 << -1325759230];
            var6.field_c = var3[1 + (var5 << 1625668418)];
            var6.field_h = var3[2 + (var5 << -241429566)];
            var6.field_f = var3[3 + (var5 << 157162242)];
        }
        return var4;
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_j = null;
        field_l = null;
        field_r = null;
        field_n = null;
        field_k = null;
        field_p = null;
        field_q = null;
    }

    final static void a(int param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        int[] var5 = fi.field_w;
        int[] var1 = var5;
        int var2 = param0;
        int var3 = var5.length;
        while (var3 > var2) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    final static void a(gb param0, int param1) {
        int var2 = 0;
        gb var3 = null;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (null != param0.field_j) {
          L0: {
            L1: {
              if (param0.field_f != 0) {
                break L1;
              } else {
                if (0 == param0.field_d) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (mm.field_Sb <= var2) {
                break L0;
              } else {
                var3 = jk.field_s[var2];
                if (-3 == (var3.field_c ^ -1)) {
                  if (var3.field_f == param0.field_f) {
                    if (var3.field_d == param0.field_d) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (null != param0.field_g) {
              ig.field_K = param0.field_m;
              kb.field_Zb = param0.field_k;
              r.field_x = param0.field_c;
              hb.field_z = param0.field_g;
              break L3;
            } else {
              break L3;
            }
          }
          n.a(0, param0);
          var2 = 85 / ((param1 - -11) / 50);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        gp.field_b = param4;
        wh.field_m = param2;
        nq.field_i = param0;
        if (param3 != 0) {
            Object var6 = null;
            hg[] discarded$0 = lj.a(true, (tg) null);
        }
        field_i = param1;
    }

    final static void a(int param0, j param1, ak param2, int param3, int param4) {
        int var5 = -82 % ((param3 - 81) / 41);
        km.a(param2, param1, param4, param0, true, 5, 1);
    }

    lj(int param0) {
        this(param0, true);
    }

    lj(int param0, boolean param1) {
        ((lj) this).field_m = 0;
        ((lj) this).field_o = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        field_n = new int[256];
        var0 = 64;
        var1 = 128;
        var2 = 255;
        var3 = 0;
        L0: while (true) {
          if ((var3 ^ -1) <= -257) {
            field_l = new int[]{0, 4096, 5793, 7094, 8192, 9159, 10033, 10837, 11585, 12288, 12953, 13585, 14189, 14768, 15326, 15864, 16384, 16888, 17378, 17854, 18318, 18770, 19212, 19644, 20066, 20480, 20886, 21283, 21674, 22058, 22435, 22806, 23170, 23530, 23884, 24232, 24576, 24915, 25249, 25580, 25905, 26227, 26545, 26859, 27170, 27477, 27780, 28081, 28378, 28672, 28963, 29251, 29537, 29819, 30099, 30377, 30652, 30924, 31194, 31462, 31727, 31991, 32252, 32511, 32768, 33023, 33276, 33527, 33776, 34024, 34270, 34514, 34756, 34996, 35235, 35472, 35708, 35942, 36175, 36406, 36636, 36864, 37091, 37316, 37540, 37763, 37985, 38205, 38424, 38642, 38858, 39073, 39287, 39500, 39712, 39923, 40132, 40341, 40548, 40755, 40960, 41164, 41368, 41570, 41771, 41972, 42171, 42369, 42567, 42763, 42959, 43154, 43348, 43541, 43733, 43925, 44115, 44305, 44494, 44682, 44869, 45056, 45242, 45427, 45611, 45795, 45977, 46160, 46341, 46522, 46702, 46881, 47059, 47237, 47415, 47591, 47767, 47942, 48117, 48291, 48465, 48637, 48809, 48981, 49152, 49322, 49492, 49661, 49830, 49998, 50166, 50332, 50499, 50665, 50830, 50995, 51159, 51323, 51486, 51649, 51811, 51972, 52134, 52294, 52454, 52614, 52773, 52932, 53090, 53248, 53405, 53562, 53719, 53874, 54030, 54185, 54340, 54494, 54647, 54801, 54954, 55106, 55258, 55410, 55561, 55712, 55862, 56012, 56162, 56311, 56459, 56608, 56756, 56903, 57051, 57198, 57344, 57490, 57636, 57781, 57926, 58071, 58215, 58359, 58503, 58646, 58789, 58931, 59073, 59215, 59357, 59498, 59639, 59779, 59919, 60059, 60199, 60338, 60477, 60615, 60753, 60891, 61029, 61166, 61303, 61440, 61576, 61712, 61848, 61984, 62119, 62254, 62388, 62523, 62657, 62790, 62924, 63057, 63190, 63323, 63455, 63587, 63719, 63850, 63982, 64113, 64243, 64374, 64504, 64634, 64763, 64893, 65022, 65151, 65279, 65408};
            field_j = new dm();
          } else {
            var4 = (int)(Math.pow((double)var3, 1.5) / 16.0);
            field_n[var3] = ud.d(ud.d(var4 * var1 >> -751257912 << -1546493688, var0 * var4 >> 1807909128 << -1467638800), var2 * var4 >> -1088854584);
            var3++;
            continue L0;
          }
        }
    }
}
