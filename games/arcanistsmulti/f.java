/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends pg {
    static ha field_g;
    byte[] field_k;
    int field_j;
    static String field_i;
    static int field_h;

    final static jg a(int param0, int param1, int param2, int param3) {
        boolean stackIn_46_0 = false;
        boolean stackIn_57_0 = false;
        boolean stackIn_64_0 = false;
        boolean stackIn_71_0 = false;
        boolean stackIn_76_0 = false;
        boolean stackIn_80_0 = false;
        boolean stackIn_88_0 = false;
        boolean stackIn_92_0 = false;
        boolean stackIn_99_0 = false;
        boolean stackIn_103_0 = false;
        boolean stackIn_109_0 = false;
        boolean stackIn_113_0 = false;
        boolean stackIn_121_0 = false;
        boolean stackIn_125_0 = false;
        boolean stackIn_131_0 = false;
        boolean stackIn_135_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        jg var8_ref_jg;
        int var9;
        jg var9_ref_jg;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime3Lifetime1;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = null;
        qo.field_f.field_Cb.field_G.c(param0 ^ -16711298);
        var5 = 0;
        var6 = 0;
        for (var7 = gb.field_f - 1; var7 >= 0; var7--) {
          var8_ref_jg = g.field_d[var7];
          var9 = 0;
          if (!wh.field_g &&
            var5 < hj.field_b) {
            var10_int = oh.a((byte) 126, var8_ref_jg.field_m);
            if (var8_ref_jg.b(-84) >= var10_int && (var8_ref_jg.field_i ||
              !sa.a(var8_ref_jg.field_n, 320))) {
              var9 = 1;
            }
          }
          if (var9 == 0) {
            var8_ref_jg.field_a = null;
          } else {
            if (var8_ref_jg.field_a != null &&
              !ui.field_s) {
              var5++;
            } else {
              if (var8_ref_jg.field_a == null) {
                vh.field_t = vh.field_t + 1;
              }
              var10 = jk.a(3, var8_ref_jg);
              var11 = var10 + dj.a(var8_ref_jg.field_e);
              var12 = rm.a(var8_ref_jg, (byte) 106);
              var8_ref_jg.field_a = new kc(0L, nf.field_A, var11);
              var6 = var6 + param2;
              var8_ref_jg.field_a.field_ob = var12;
              var8_ref_jg.field_a.field_J = var12 + (-((var12 & 16711422) >> 1) + ((16711422 & nf.field_A.field_J) >> 1));
              var8_ref_jg.field_a.field_eb = var12 + (-(var12 >> 1 & 8355711) + (nf.field_A.field_eb >> 1 & 8355711));
              var8_ref_jg.field_a.field_Z = oo.field_x;
              var5++;
            }
          }
        }
        var7Lifetime1 = 0;
        for (var8 = 0; gb.field_f > var8; var8++) {
          var9_ref_jg = g.field_d[var8];
          if (null != var9_ref_jg.field_a) {
            qo.field_f.field_Cb.a(var9_ref_jg.field_a, 110);
            var9_ref_jg.field_a.a(var9_ref_jg.field_a.c(-25921), param3, var7Lifetime1, param2, (byte) -120);
            if (0 != var9_ref_jg.field_a.field_U) {
              var4 = var9_ref_jg;
            }
            var7Lifetime1 = var7Lifetime1 + param2;
          }
        }
        var8Lifetime1 = var6 - (var7Lifetime1 - qo.field_f.field_Cb.field_B) + qo.field_f.field_Cb.field_I;
        qo.field_f.field_Cb.field_I = qo.field_f.field_Cb.field_I - var8Lifetime1;
        if (param0 != 16711422) {
          f.a(-105, 114, -71, 4);
          qo.field_f.field_Cb.field_db = qo.field_f.field_Cb.field_db + var8Lifetime1;
          if (ui.field_s) {
            qo.field_f.field_Cb.field_I = var7Lifetime1;
          }
          qo.field_f.field_Cb.field_B = var7Lifetime1 - qo.field_f.field_Cb.field_I;
          if (ui.field_s) {
            ui.field_s = false;
            qo.field_f.field_Cb.field_db = qo.field_f.field_Hb.field_I - qo.field_f.field_Cb.field_I;
            qo.field_f.field_Cb.field_bb = 0;
            di.field_j = true;
          }
          if (ef.field_r &&
            tm.field_d != null) {
            di.field_j = true;
          }
          var9Lifetime1 = -qo.field_f.field_Cb.field_B - qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
          if (di.field_j) {
            qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9Lifetime1;
          }
          qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
          stackIn_46_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime1);
          di.field_j = stackIn_46_0;
          return (jg) (var4);
        }
        qo.field_f.field_Cb.field_db = qo.field_f.field_Cb.field_db + var8Lifetime1;
        if (ui.field_s) {
          qo.field_f.field_Cb.field_I = var7Lifetime1;
          qo.field_f.field_Cb.field_B = var7Lifetime1 - qo.field_f.field_Cb.field_I;
          if (!ui.field_s) {
            if (ef.field_r &&
              tm.field_d != null) {
              di.field_j = true;
            }
            var9Lifetime2 = -qo.field_f.field_Cb.field_B - qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
            if (di.field_j) {
              qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9Lifetime2;
            }
            qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
            stackIn_57_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime2);
            di.field_j = stackIn_57_0;
          } else {
            ui.field_s = false;
            qo.field_f.field_Cb.field_db = qo.field_f.field_Hb.field_I - qo.field_f.field_Cb.field_I;
            qo.field_f.field_Cb.field_bb = 0;
            di.field_j = true;
            if (!ef.field_r) {
              var9Lifetime2 = -qo.field_f.field_Cb.field_B - qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
              if (di.field_j) {
                qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9Lifetime2;
              }
              qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
              stackIn_64_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime2);
              di.field_j = stackIn_64_0;
            } else {
              if (tm.field_d != null) {
                di.field_j = true;
                var9Lifetime2 = -qo.field_f.field_Cb.field_B - qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
                if (di.field_j) {
                  qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9Lifetime2;
                }
                qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                stackIn_71_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime2);
                di.field_j = stackIn_71_0;
              } else {
                var9Lifetime2 = -qo.field_f.field_Cb.field_B - qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
                if (!di.field_j) {
                  qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                  stackIn_76_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime2);
                  di.field_j = stackIn_76_0;
                } else {
                  qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9Lifetime2;
                  qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                  stackIn_80_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime2);
                  di.field_j = stackIn_80_0;
                }
              }
            }
          }
          return (jg) (var4);
        }
        qo.field_f.field_Cb.field_B = var7Lifetime1 - qo.field_f.field_Cb.field_I;
        if (!ui.field_s) {
          if (ef.field_r &&
            tm.field_d != null) {
            di.field_j = true;
            var9Lifetime3 = -qo.field_f.field_Cb.field_B - qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
            if (!di.field_j) {
              qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
              stackIn_121_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime3);
              di.field_j = stackIn_121_0;
            } else {
              qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9Lifetime3;
              qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
              stackIn_125_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime3);
              di.field_j = stackIn_125_0;
            }
            return (jg) (var4);
          }
          var9Lifetime3Lifetime1 = -qo.field_f.field_Cb.field_B - qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
          if (!di.field_j) {
            qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
            stackIn_131_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime3Lifetime1);
            di.field_j = stackIn_131_0;
          } else {
            qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9Lifetime3Lifetime1;
            qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
            stackIn_135_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime3Lifetime1);
            di.field_j = stackIn_135_0;
          }
          return (jg) (var4);
        }
        ui.field_s = false;
        qo.field_f.field_Cb.field_db = qo.field_f.field_Hb.field_I - qo.field_f.field_Cb.field_I;
        qo.field_f.field_Cb.field_bb = 0;
        di.field_j = true;
        if (!ef.field_r) {
          var9Lifetime4 = -qo.field_f.field_Cb.field_B - qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
          if (!di.field_j) {
            qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
            stackIn_88_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime4);
            di.field_j = stackIn_88_0;
          } else {
            qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9Lifetime4;
            qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
            stackIn_92_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime4);
            di.field_j = stackIn_92_0;
          }
        } else {
          if (tm.field_d == null) {
            var9Lifetime4 = -qo.field_f.field_Cb.field_B - qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
            if (!di.field_j) {
              qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
              stackIn_99_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime4);
              di.field_j = stackIn_99_0;
            } else {
              qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9Lifetime4;
              qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
              stackIn_103_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime4);
              di.field_j = stackIn_103_0;
            }
          } else {
            di.field_j = true;
            var9Lifetime4 = -qo.field_f.field_Cb.field_B - qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
            if (!di.field_j) {
              qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
              stackIn_109_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime4);
              di.field_j = stackIn_109_0;
            } else {
              qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9Lifetime4;
              qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
              stackIn_113_0 = (qo.field_f.field_Cb.field_db + qo.field_f.field_Cb.field_bb == var9Lifetime4);
              di.field_j = stackIn_113_0;
            }
          }
        }
        return (jg) (var4);
    }

    f(byte[] param0) {
        try {
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "f.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != -1) {
          return;
        }
        field_g = null;
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, byte param4, int param5, boolean param6, int param7, int param8, boolean param9, boolean param10, int param11, int param12, int param13) {
        kh.field_c = null;
        ej.a(101);
        param3 = w.a(0, param8, param1, param11, param3, param2, param13);
        fn.a(param9, param3, param7, param0, param5, param12, param10, param13, param6, 83);
        mo.a(1, param10, param7);
        if (param4 >= -28) {
          f.a(-1);
        } else {
          kn.a(param1, param7, false, param3);
          return;
        }
        kn.a(param1, param7, false, param3);
    }

    static {
        field_i = "Close";
    }
}
