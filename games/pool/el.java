/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends ob {
    static int[] field_H;
    static String field_L;
    static int[] field_J;
    static he field_K;
    static int[] field_I;

    final void c(int param0) {
        int var12 = 0;
        int stackIn_3_0 = 0;
        int[] stackIn_6_0 = null;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        an stackIn_46_0 = null;
        String stackIn_47_1 = null;
        int stackIn_56_0 = 0;
        an stackIn_64_0 = null;
        String stackIn_65_1 = null;
        int var2;
        int var3_int;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var13;
        int[] var14;
        int[] var15;
        int var4Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        var13 = Pool.field_O;
        super.c(72);
        stackIn_3_0 = (this.field_E != 18) ? 0 : 1;
        var2 = stackIn_3_0;
        var3_int = 60;
        var4 = 120;
        nj.a(rm.field_g, (byte) 91, -(var3_int * 2) + qh.field_l, var3_int, var4, qh.field_f - 220);
        if (var2 != 0) {
          stackIn_6_0 = hp.field_c;
        } else {
          stackIn_6_0 = oa.field_g;
        }
        var15 = stackIn_6_0;
        var14 = var15;
        var3 = var14;
        if (param0 <= 36) {
          return;
        }
        if (var2 != 0) {
          if (uk.field_j != -1 &&
            t.a(0, var15, uk.field_j)) {
            uk.field_j = -1;
          }
          if (kh.field_Gc != -1 &&
            t.a(0, var15, kh.field_Gc)) {
            kh.field_Gc = -1;
          }
        }
        var4Lifetime1 = 0;
        var5 = -ua.field_r.field_w + td.field_g.field_w >> 3;
        for (var6 = 0; var6 < fj.c((byte) -9); var6++) {
          var7 = this.g(-45, var6);
          var8 = this.d(var6, true);
          if (var6 == uk.field_j) {
            td.field_g.e(var7 - var5, -var5 + var8);
          } else {
            if (var6 == kh.field_Gc) {
              te.field_n.e(-var5 + var7, var8 - var5);
            }
          }
          L19: {
            if (fe.a(var15, -13671, var6)) {
              li.field_f[var6].e(var7, var8);
            } else {
              if (var2 != 0) {
                break L19;
              }
              tf.a(-17104, var6).e(var7, var8);
            }
            var4Lifetime1++;
            if (var4Lifetime1 % 10 == 0) {
              var7 = 80;
              var8 += 36;
            } else {
              var7 += 36;
            }
          }
        }
        nj.a(vk.field_y, (byte) -81, 500, -500 + qh.field_l >> 1, 205, 165);
        if (uk.field_j == -1) {
          stackIn_37_0 = kh.field_Gc;
        } else {
          stackIn_37_0 = uk.field_j;
        }
        var6Lifetime1 = stackIn_37_0;
        if (var6Lifetime1 != -1) {
          ni.field_Z.d(md.field_a[var6Lifetime1], 225, ni.field_Z.field_C + 215, 16777215, -1);
          stackIn_41_0 = (!fe.a(var15, -13671, var6Lifetime1)) ? 0 : 1;
          var7Lifetime1 = stackIn_41_0;
          stackIn_46_0 = sa.field_h;
          if (var7Lifetime1 != 0) {
            stackIn_47_1 = np.field_e;
          } else {
            if (mp.field_V <= 0 &&
              ap.field_w[var6Lifetime1]) {
              stackIn_47_1 = cl.field_n;
            } else {
              stackIn_47_1 = bc.field_g;
            }
          }
          ((an) (Object) stackIn_46_0).d(stackIn_47_1, 225, sa.field_h.field_C + 240, 13412966, -1);
          if (var7Lifetime1 != 0) {
            li.field_f[var6Lifetime1].c(85, 225);
          } else {
            tf.a(-17104, var6Lifetime1).c(85, 225);
          }
          var8 = sa.field_h.field_G + 5;
          if (cj.field_fb[var6Lifetime1]) {
            stackIn_56_0 = (var7Lifetime1 != 0) ? 1 : 0;
          } else {
            stackIn_56_0 = 1;
          }
          var9 = stackIn_56_0;
          if (var9 == 0) {
            vm.field_g = null;
            ao.field_Lb = null;
            uo.field_Qb = -1;
          } else {
            if (null == vm.field_g ||
              var6Lifetime1 != uo.field_Qb) {
              vm.field_g = ef.a("</col>", kc.field_d[var6Lifetime1], (byte) 4, "<col=aaaaff>");
              ao.field_Lb = ug.a(new int[]{var8}, 260, kc.field_d[var6Lifetime1], 260, sa.field_h, true, 225);
              uo.field_Qb = var6Lifetime1;
              qi.field_b = sa.field_h.b(vm.field_g, 260, var8);
            }
          }
          stackIn_64_0 = sa.field_h;
          if (var9 != 0) {
            stackIn_65_1 = vm.field_g;
          } else {
            stackIn_65_1 = kb.field_c;
          }
          ((an) (Object) stackIn_64_0).a(stackIn_65_1, 225, 260, 260, 70, 13421772, -1, 0, 1, var8);
          sa.field_h.d(sd.field_W + ch.field_J[var6Lifetime1] * 100, 225, 340 + sa.field_h.field_C, 13421772, -1);
          sa.field_h.d(ri.field_R, 345, sa.field_h.field_C + 340, 13421772, -1);
          var10 = 345 + sa.field_h.b(ri.field_R);
          var11 = (-dq.field_k.field_A + sa.field_h.field_w + sa.field_h.field_C >> 1) + 340;
          for (var12 = 0; ch.field_J[var6Lifetime1] > var12; var12++) {
            dq.field_k.c(var10, var11);
            var10 = var10 + dq.field_k.field_z / 3;
          }
        } else {
          mc.field_e.b(fd.field_L, qh.field_l >> 1, 215 + mc.field_e.field_C, 4, -1);
          if (hk.b(-107)) {
            var7Lifetime1 = 215 + this.field_x >> 1;
            mc.field_e.a(ra.field_a, qh.field_l >> 2, -mc.field_e.field_G + var7Lifetime1, qh.field_l >> 1, 240, 4, -1, 0, 0, 0);
          }
        }
        if (this.field_B.field_e == 1) {
          sa.field_h.a(ab.field_a, 220, 390, 360, 36, 15658734, -1, 1, 1, 0);
        }
        var7Lifetime2 = dp.a(104);
        if (-1 != var7Lifetime2) {
          qa.a((byte) 71, qh.field_l >> 1, sa.field_h, re.field_e[var7Lifetime2], 15658734, 4144959);
          if (this.field_G != null) {
            this.field_G.a(15658734, 0, 128, -1, true, 70 - qi.field_b >> 1);
          }
        }
        return;
    }

    private final int a(int param0, boolean param1, int param2, boolean param3) {
        int var6 = 0;
        int[] var5;
        int var9;
        int[] var10;
        int[] stackIn_3_0 = null;
        int var7;
        int var8;
        var9 = Pool.field_O;
        if (param1) {
          stackIn_3_0 = hp.field_c;
        } else {
          stackIn_3_0 = oa.field_g;
        }
        var10 = stackIn_3_0;
        var5 = var10;
        for (var6 = 0; fj.c((byte) -108) > var6; var6++) {
          if (!t.a(0, var10, var6) ||
            !param1) {
            var7 = this.g(-55, var6);
            var8 = this.d(var6, true);
            if (var7 <= param0 &&
              param2 >= var8 &&
              36 + var7 >= param0 &&
              param2 <= 36 + var8) {
              return var6;
            }
          }
        }
        if (!param3) {
          return -1;
        }
        return 66;
    }

    private final int g(int param0, int param1) {
        int var3 = param1 % 27;
        if (param0 >= 0) {
          field_H = (int[]) null;
        }
        return (-468 + qh.field_l >> 1) + (var3 < 13 ? param1 * 36 : -(pp.a(true) ? 18 : 0) + (param1 - 13) * 36);
    }

    final int d(int param0, int param1) {
        if (this.field_B.field_e == 1) {
          return 60;
        }
        if (param1 == param0) {
          return this.field_t;
        }
        if (param1 == 1) {
          return 350 + this.field_t;
        }
        return this.field_t + param1 * 180;
    }

    final int a(boolean param0, int param1) {
        if (this.field_B.field_e == 1) {
          return 210;
        }
        if (param1 == 0) {
          return this.d(0, param1) + 340;
        }
        if (param0) {
          field_K = (he) null;
        }
        if (param1 == 1) {
          return 130 + this.d(0, param1);
        }
        return 140 + this.d(0, param1);
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        kh.field_Gc = -1;
        uk.field_j = -1;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        un.field_h = param1;
        int var5 = 69 % ((param0 - 25) / 50);
        kh.field_yc = param4;
        ob.field_u = param2;
        qr.field_g = param3;
    }

    el(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(mq.field_a, param0, param1, param2, param3, param4, param5);
    }

    private final int d(int param0, boolean param1) {
        if (!param1) {
          return -42;
        }
        return (2 * (param0 / 27) + (param0 % 27 < 13 ? 0 : 1)) * 36 + 130;
    }

    private final void a(boolean param0, byte param1) {
        int var3;
        kh.field_Gc = this.a(wn.field_i, param0, gg.field_f, false);
        if (ne.field_s == 1) {
          vj.a((byte) -27, il.field_c[0]);
          var3 = this.a(lq.field_W, param0, ua.field_o, false);
          if (uk.field_j == var3) {
            uk.field_j = -1;
          } else {
            if (var3 != -1) {
              uk.field_j = var3;
            }
          }
        }
        if (param1 != -98) {
          field_I = (int[]) null;
        }
    }

    final int b(byte param0, int param1) {
        if (param0 != 6) {
          return 93;
        }
        return this.field_x;
    }

    final static int a(int param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 30377) {
            stackIn_4_0 = ao.a(param0, true, true, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = -106;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("el.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final void d(int param0) {
        int stackIn_12_0 = 0;
        int stackIn_13_1 = 0;
        super.d(param0);
        if (this.field_E != 17) {
          if (this.field_E == 18 ||
            ne.field_w == 19) {
            this.a(true, (byte) -98);
          }
        } else {
          this.a(false, (byte) -98);
        }
        if (ao.field_Lb != null &&
          null != vm.field_g &&
          -1 != uo.field_Qb) {
          this.field_G = ag.a(-(70 - qi.field_b >> 1) + gg.field_f, ao.field_Lb, wn.field_i, param0 ^ -15396);
          se.field_l = 12;
          eo.field_Vb = 12;
          stackIn_12_0 = 0;
          if (this.field_G == null) {
            stackIn_13_1 = -1;
          } else {
            stackIn_13_1 = this.field_G.field_p;
          }
          jo.g(stackIn_12_0, stackIn_13_1);
        }
    }

    final void b(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        var5 = Pool.field_O;
        var4 = this.field_h[param2];
        if (var4 != 48) {
          if (var4 == 23) {
            if (this.field_B.b((byte) 108)) {
              nk.a(pl.field_d, this.field_E, (byte) 81);
            }
          } else {
            super.b(-16470, param1, param2);
          }
        } else {
          if (this.field_B.b((byte) 106)) {
            var4 = param1 ? 1 : 0;
            stackIn_8_0 = -3405;
            stackIn_8_1 = 16;
            stackIn_9_2 = (!mg.a(true)) ? 0 : 21;
            fq.a(stackIn_8_0, stackIn_8_1, stackIn_9_2, var4 != 0);
          }
        }
        if (param0 != -16470) {
          field_L = (String) null;
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          field_I = (int[]) null;
        }
        field_K = null;
        field_L = null;
        field_H = null;
        field_I = null;
        field_J = null;
    }

    static {
        field_H = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_J = new int[]{0, 4096, 5793, 7094, 8192, 9159, 10033, 10837, 11585, 12288, 12953, 13585, 14189, 14768, 15326, 15864, 16384, 16888, 17378, 17854, 18318, 18770, 19212, 19644, 20066, 20480, 20886, 21283, 21674, 22058, 22435, 22806, 23170, 23530, 23884, 24232, 24576, 24915, 25249, 25580, 25905, 26227, 26545, 26859, 27170, 27477, 27780, 28081, 28378, 28672, 28963, 29251, 29537, 29819, 30099, 30377, 30652, 30924, 31194, 31462, 31727, 31991, 32252, 32511, 32768, 33023, 33276, 33527, 33776, 34024, 34270, 34514, 34756, 34996, 35235, 35472, 35708, 35942, 36175, 36406, 36636, 36864, 37091, 37316, 37540, 37763, 37985, 38205, 38424, 38642, 38858, 39073, 39287, 39500, 39712, 39923, 40132, 40341, 40548, 40755, 40960, 41164, 41368, 41570, 41771, 41972, 42171, 42369, 42567, 42763, 42959, 43154, 43348, 43541, 43733, 43925, 44115, 44305, 44494, 44682, 44869, 45056, 45242, 45427, 45611, 45795, 45977, 46160, 46341, 46522, 46702, 46881, 47059, 47237, 47415, 47591, 47767, 47942, 48117, 48291, 48465, 48637, 48809, 48981, 49152, 49322, 49492, 49661, 49830, 49998, 50166, 50332, 50499, 50665, 50830, 50995, 51159, 51323, 51486, 51649, 51811, 51972, 52134, 52294, 52454, 52614, 52773, 52932, 53090, 53248, 53405, 53562, 53719, 53874, 54030, 54185, 54340, 54494, 54647, 54801, 54954, 55106, 55258, 55410, 55561, 55712, 55862, 56012, 56162, 56311, 56459, 56608, 56756, 56903, 57051, 57198, 57344, 57490, 57636, 57781, 57926, 58071, 58215, 58359, 58503, 58646, 58789, 58931, 59073, 59215, 59357, 59498, 59639, 59779, 59919, 60059, 60199, 60338, 60477, 60615, 60753, 60891, 61029, 61166, 61303, 61440, 61576, 61712, 61848, 61984, 62119, 62254, 62388, 62523, 62657, 62790, 62924, 63057, 63190, 63323, 63455, 63587, 63719, 63850, 63982, 64113, 64243, 64374, 64504, 64634, 64763, 64893, 65022, 65151, 65279, 65408};
        field_L = "To <u=ffffff>take a shot</u>, <img=0> <col=99ff99>click on the cue ball</col> where you would like to strike it. If you click nearer the bottom, the cue ball will back-spin, if you click nearer the top, it will forward-spin.";
        field_K = new he();
    }
}
