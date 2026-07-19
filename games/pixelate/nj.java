/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static bb field_h;
    private lm field_b;
    private lm field_a;
    static int[] field_e;
    static String field_g;
    static String field_d;
    static char field_f;
    static String field_c;

    final static void a(fm param0, byte param1) {
        qd var2 = null;
        sp discarded$0 = null;
        try {
            if (param1 != 14) {
                field_e = (int[]) null;
            }
            qd.a(param0.a((byte) 24, "", "headers.packvorbis"));
            var2 = qd.a(param0, "jagex logo2.packvorbis", "");
            discarded$0 = var2.a();
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "nj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(int param0) {
        int var2 = 0;
        lm var3 = null;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param0 <= 96) {
          return 62;
        } else {
          var2 = 0;
          var3 = this.field_b.field_p;
          L0: while (true) {
            if (var3 == this.field_b) {
              return var2;
            } else {
              var3 = var3.field_p;
              var2++;
              continue L0;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_e = null;
        field_d = null;
        if (param0 < 26) {
            return;
        }
        field_h = null;
        field_c = null;
    }

    final lm a(byte param0) {
        lm var2 = null;
        var2 = this.field_b.field_p;
        if (var2 != this.field_b) {
          var2.e(17);
          if (param0 != 80) {
            this.field_a = (lm) null;
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void d(int param0) {
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (ql.e(114)) {
              discarded$12 = lb.field_x.a(qk.field_i, true, (byte) 99, nh.field_b);
              lb.field_x.d((byte) 111);
              L1: while (true) {
                if (!bh.b((byte) 126)) {
                  if (param0 == 49661) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    nj.b((byte) -125);
                    return;
                  }
                } else {
                  discarded$13 = lb.field_x.a(field_f, ke.field_a, false);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (null == ib.field_f) {
                  break L2;
                } else {
                  if (!ib.field_f.field_g) {
                    break L2;
                  } else {
                    ln.a(49);
                    lb.field_x.b(param0 + -55844, new ic(lb.field_x, ia.field_c));
                    break L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "nj.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final lm c(int param0) {
        lm var2 = null;
        if (param0 >= 53) {
          var2 = this.field_b.field_p;
          if (this.field_b == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_p;
            return var2;
          }
        } else {
          return (lm) null;
        }
    }

    final void a(int param0, lm param1) {
        try {
            if (param1.field_r != null) {
                param1.e(17);
            }
            param1.field_r = this.field_b.field_r;
            param1.field_p = this.field_b;
            param1.field_r.field_p = param1;
            param1.field_p.field_r = param1;
            int var3_int = -65 % ((31 - param0) / 45);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "nj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final lm a(int param0) {
        lm var2 = null;
        var2 = this.field_a;
        if (var2 == this.field_b) {
          this.field_a = null;
          return null;
        } else {
          this.field_a = var2.field_p;
          if (param0 != 65151) {
            return (lm) null;
          } else {
            return var2;
          }
        }
    }

    public nj() {
        this.field_b = new lm();
        this.field_b.field_r = this.field_b;
        this.field_b.field_p = this.field_b;
    }

    static {
        field_h = new bb();
        field_e = new int[]{0, 4096, 5793, 7094, 8192, 9159, 10033, 10837, 11585, 12288, 12953, 13585, 14189, 14768, 15326, 15864, 16384, 16888, 17378, 17854, 18318, 18770, 19212, 19644, 20066, 20480, 20886, 21283, 21674, 22058, 22435, 22806, 23170, 23530, 23884, 24232, 24576, 24915, 25249, 25580, 25905, 26227, 26545, 26859, 27170, 27477, 27780, 28081, 28378, 28672, 28963, 29251, 29537, 29819, 30099, 30377, 30652, 30924, 31194, 31462, 31727, 31991, 32252, 32511, 32768, 33023, 33276, 33527, 33776, 34024, 34270, 34514, 34756, 34996, 35235, 35472, 35708, 35942, 36175, 36406, 36636, 36864, 37091, 37316, 37540, 37763, 37985, 38205, 38424, 38642, 38858, 39073, 39287, 39500, 39712, 39923, 40132, 40341, 40548, 40755, 40960, 41164, 41368, 41570, 41771, 41972, 42171, 42369, 42567, 42763, 42959, 43154, 43348, 43541, 43733, 43925, 44115, 44305, 44494, 44682, 44869, 45056, 45242, 45427, 45611, 45795, 45977, 46160, 46341, 46522, 46702, 46881, 47059, 47237, 47415, 47591, 47767, 47942, 48117, 48291, 48465, 48637, 48809, 48981, 49152, 49322, 49492, 49661, 49830, 49998, 50166, 50332, 50499, 50665, 50830, 50995, 51159, 51323, 51486, 51649, 51811, 51972, 52134, 52294, 52454, 52614, 52773, 52932, 53090, 53248, 53405, 53562, 53719, 53874, 54030, 54185, 54340, 54494, 54647, 54801, 54954, 55106, 55258, 55410, 55561, 55712, 55862, 56012, 56162, 56311, 56459, 56608, 56756, 56903, 57051, 57198, 57344, 57490, 57636, 57781, 57926, 58071, 58215, 58359, 58503, 58646, 58789, 58931, 59073, 59215, 59357, 59498, 59639, 59779, 59919, 60059, 60199, 60338, 60477, 60615, 60753, 60891, 61029, 61166, 61303, 61440, 61576, 61712, 61848, 61984, 62119, 62254, 62388, 62523, 62657, 62790, 62924, 63057, 63190, 63323, 63455, 63587, 63719, 63850, 63982, 64113, 64243, 64374, 64504, 64634, 64763, 64893, 65022, 65151, 65279, 65408};
        field_g = "Names can only contain letters, numbers, spaces and underscores";
        field_c = "You need to play <%0> more rated games to unlock this option.";
        field_d = "Advertising websites";
    }
}
