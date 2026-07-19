/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends qe {
    static cn[] field_s;
    static md field_v;
    static cn field_r;
    static int field_x;
    static ed field_t;
    static int[] field_w;
    static cn field_y;
    static String field_u;

    private final int[] a(int[] param0, boolean param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var6 = new int[param0.length];
              var3 = var6;
              if (!param1) {
                break L1;
              } else {
                this.c(true);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (param0.length <= var4) {
                stackOut_6_0 = (int[]) (var3);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var6[var4] = -(param0[var4] / 4) + 320 << 938106500;
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("ud.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    ud() {
        String var1 = ii.field_E.toUpperCase();
        gp var2 = ne.field_c;
        rf.field_O = new ob(0L, (ok) null, (ok) null, (ok) null, jm.field_i, "");
        rf.field_O.field_D = 10;
        rf.field_O.field_gb = 630 - rf.field_O.field_Tb.field_L.field_y;
        rf.field_O.field_ic.field_fb = 16777215;
        rf.field_O.field_ic.field_y = (se) ((Object) var2);
        rf.field_O.field_ic.field_lb = 1;
        rf.field_O.field_ic.field_B = rf.field_O.field_Tb.field_L.field_v;
        rf.field_O.field_Tb.field_B = rf.field_O.field_Tb.field_L.field_v;
        rf.field_O.field_B = rf.field_O.field_Tb.field_L.field_v;
        rf.field_O.field_ic.field_ob = rf.field_O.field_Tb.field_L.field_y;
        rf.field_O.field_Tb.field_ob = rf.field_O.field_Tb.field_L.field_y;
        rf.field_O.field_ob = rf.field_O.field_Tb.field_L.field_y;
        ub.field_i = new tf(ne.field_c, var1, ag.field_c);
        ok.field_Y = new tf(ne.field_c, var1, ml.field_b);
        ro.field_B = false;
    }

    private final void a(boolean param0, int param1) {
        ia.field_K.field_w = 0;
        lk.f(param1 + -4080);
        gd.a(0, param1 ^ param1, 0, param0);
        cm.a(1.600000023841858f, 0.9200000166893005f, param1 + -11884, 0.10000000149011612f, 25.0f);
    }

    private final int[] a(boolean param0, int[] param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_3_0 = null;
        int[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_7_0 = null;
        int[] stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            if (!param0) {
              var6 = new int[param1.length];
              var3 = var6;
              var4 = 0;
              L1: while (true) {
                if (param1.length <= var4) {
                  stackOut_7_0 = (int[]) (var3);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6[var4] = 240 - param1[var4] / 4 << 1947488964;
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = (int[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("ud.G(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final void b(boolean param0) {
        wh var3 = (wh) null;
        fk.a((byte) 121, (wh) null);
        sf.field_g = 256;
        ub.field_p = 0;
    }

    public static void a(byte param0) {
        field_y = null;
        field_w = null;
        field_t = null;
        if (param0 > -17) {
            return;
        }
        field_v = null;
        field_r = null;
        field_u = null;
        field_s = null;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = DungeonAssault.field_K;
        if (!(param0)) {
            return;
        }
        if (ia.field_K == null) {
            gf.a();
        } else {
            if (ia.field_K.field_w > ia.field_K.field_g) {
                gf.a();
                var2 = -sg.field_b.field_y + 640 >> 178227169;
                var3 = -sg.field_b.field_v + 480 >> -1231093951;
                sg.field_b.h(var2, var3);
                if (sf.field_g != 0) {
                    gf.b(0, 0, 640, 480, 0, sf.field_g);
                }
                rf.field_O.b(false, 84);
                (rf.field_O.field_hb ? ok.field_Y : ub.field_i).b(rf.field_O.field_D, 32, rf.field_O.field_gb - -(rf.field_O.field_ob / 2) + -(ok.field_Y.field_i / 2));
            } else {
                ia.field_K.a(-101);
                rf.field_O.b(false, 125);
                (!rf.field_O.field_hb ? ub.field_i : ok.field_Y).b(rf.field_O.field_D, 32, -(ok.field_Y.field_i / 2) + (rf.field_O.field_ob / 2 + rf.field_O.field_gb));
            }
        }
    }

    final void c(boolean param0) {
        o discarded$2 = null;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        if (param0) {
          rf.field_O.a(-2, true);
          if (-1 != (rf.field_O.field_G ^ -1)) {
            this.a(true, 4096);
            return;
          } else {
            L0: while (true) {
              if (!ha.b((byte) 47)) {
                L1: {
                  if (!ro.field_B) {
                    rm.r(22362);
                    if (ro.field_B) {
                      this.d(true);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                ia.field_K.a(true);
                if (ia.field_K.field_w < ia.field_K.field_g) {
                  var2 = 0;
                  L2: while (true) {
                    if (var2 >= sj.field_db.length) {
                      return;
                    } else {
                      if (sj.field_db[var2] == ia.field_K.field_w) {
                        if (var2 < u.field_T.length) {
                          discarded$2 = gd.a(64, u.field_T[var2]);
                          var2++;
                          continue L2;
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
                } else {
                  L3: {
                    fieldTemp$3 = ub.field_p + 1;
                    ub.field_p = ub.field_p + 1;
                    if ((fieldTemp$3 ^ -1) <= -151) {
                      sf.field_g = sf.field_g + 8;
                      if ((sf.field_g ^ -1) <= -257) {
                        cm.a(0.0f, 0.0f, -7788, 0.10000000149011612f, 0.0f);
                        this.a(false, 4096);
                        return;
                      } else {
                        break L3;
                      }
                    } else {
                      sf.field_g = sf.field_g - 8;
                      if ((sf.field_g ^ -1) > -1) {
                        sf.field_g = 0;
                        return;
                      } else {
                        break L3;
                      }
                    }
                  }
                  return;
                }
              } else {
                if (-14 == (mm.field_t ^ -1)) {
                  this.a(false, 4096);
                  return;
                } else {
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void d(boolean param0) {
        int[] var46 = null;
        int var5 = 0;
        int[] var47 = null;
        int var7 = 0;
        int[] var48 = null;
        int var3 = 0;
        int var9 = 0;
        int var13 = DungeonAssault.field_K;
        int[] var21 = new int[]{sj.field_db[1], sj.field_db[2] - sj.field_db[1], -sj.field_db[2] + sj.field_db[3], sj.field_db[4] + -sj.field_db[3], -sj.field_db[4] + sj.field_db[5], -sj.field_db[5] + sj.field_db[6], sj.field_db[7] - sj.field_db[6], sj.field_db[8] + -sj.field_db[7], 1870 - sj.field_db[8]};
        ia.field_K = new tk(ga.field_o, var21, 0, ne.field_c, qh.field_J, (cn[]) null);
        ia.field_K.field_i = new boolean[]{param0, true, true, true, false, true, true, true, true};
        ia.field_K.field_a[8] = 16777215;
        ia.field_K.field_u[7] = 16777215;
        ia.field_K.field_B = new boolean[]{true, true, true, true, true, false, true, true, true};
        ia.field_K.field_r = 64;
        for (var3 = 0; ia.field_K.field_n.length > var3; var3++) {
            ia.field_K.field_n[var3] = 5120;
            ia.field_K.field_s[var3] = 4096;
            var46 = ia.field_K.field_c;
            ia.field_K.field_h[var3] = 0;
            var5 = var3;
            var46[var5] = 0;
            ia.field_K.field_j[var3] = 3840;
            ia.field_K.field_f[var3] = 5120;
            ia.field_K.field_q[var3] = 2880;
            ia.field_K.field_x[var3] = 3840;
            var47 = ia.field_K.field_A;
            ia.field_K.field_e[var3] = 5120;
            var7 = var3;
            var47[var7] = 5120;
            var48 = ia.field_K.field_y;
            ia.field_K.field_m[var3] = 3840;
            var9 = var3;
            var48[var9] = 3840;
        }
        ia.field_K.field_y[8] = 2560;
        ia.field_K.field_m[8] = 3200;
        ia.field_K.field_j = this.a(new int[]{-160, 160, 0, 42, ia.field_K.field_j[4], ia.field_K.field_j[5], -120, -18, -18}, false);
        ia.field_K.field_q = this.a(false, new int[]{-120, -120, -120, -9, ia.field_K.field_q[4], ia.field_K.field_q[5], -70, 2, 2});
        int var20 = 0;
        var3 = var20;
        while (ia.field_K.field_n.length > var20) {
            ia.field_K.field_n[var20] = 5120;
            ia.field_K.field_s[var20] = 4096;
            var20++;
        }
        int[] var51 = ia.field_K.field_n;
        int[] var50 = ia.field_K.field_n;
        int[] var49 = ia.field_K.field_s;
        ia.field_K.field_s[5] = 4096;
        var49[4] = 4096;
        var50[5] = 4096;
        var51[4] = 4096;
        int[] var54 = ia.field_K.field_c;
        int[] var52 = ia.field_K.field_c;
        int[] var53 = ia.field_K.field_h;
        ia.field_K.field_h[5] = 0;
        var52[5] = 0;
        var53[4] = 0;
        var54[4] = 0;
        var9 = 600 * (-ia.field_K.field_z[4] + ia.field_K.field_d[4]) / (ia.field_K.field_d[5] + -ia.field_K.field_z[4]);
        ia.field_K.field_j[4] = 0;
        ia.field_K.field_j[5] = -var9 << 1000316868;
        ia.field_K.field_f[4] = -var9 << 1000316868;
        ia.field_K.field_f[5] = -9600;
        int[] var57 = ia.field_K.field_q;
        int[] var56 = ia.field_K.field_q;
        ia.field_K.field_x[5] = 3840;
        int[] var55 = ia.field_K.field_x;
        var55[4] = 3840;
        var56[5] = 3840;
        ia.field_K.field_w = 0;
        var57[4] = 3840;
        cm.a(0.0f, 0.0f, -7788, 0.10000000149011612f, 0.0f);
        t.a(1048576, jd.field_o, false, true);
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.removeKeyListener(in.field_C);
            param0.removeFocusListener(in.field_C);
            ia.field_M = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "ud.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_v = new md();
        field_u = "Save the changes to your dungeon and return to the main menu";
    }
}
