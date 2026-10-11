/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pv extends bw {
    jfa field_f;
    static String field_h;
    static int field_i;
    int field_g;

    public static void a(int param0) {
        field_h = null;
        if (param0 != -15565) {
          pv.a(47);
        }
    }

    boolean b(boolean param0) {
        if (!param0) {
          return true;
        }
        return false;
    }

    final static void a(int param0, long param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            Thread.sleep(param1);
            if (param0 != 20182) {
              pv.a(24, -57L);
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, boolean param1) {
        int var6 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_9_1 = false;
        sna stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_12_3 = 0;
        Object stackIn_33_0 = null;
        gna stackIn_33_1 = null;
        int stackIn_57_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        sna var7_ref_sna = null;
        int var7 = 0;
        int var8_int = 0;
        sna var8 = null;
        gna var9_ref_gna = null;
        int var9 = 0;
        gna var10 = null;
        int var10_int = 0;
        int var12 = 0;
        int var13 = 0;
        sna var14 = null;
        int var15 = 0;
        var13 = BachelorFridge.field_y;
        try {
          if (!param1) {
            field_i = -56;
          }
          kq.field_i = dg.field_c;
          kg.field_b = dg.field_i;
          if (param0) {
            stackIn_6_0 = ld.field_p;
          } else {
            stackIn_6_0 = dja.field_m;
          }
          stackIn_9_1 = !(param1);
          dna.c(stackIn_6_0, stackIn_9_1);
          pf.field_n.a(0, ela.field_i.field_p - 42, 0, ela.field_i.field_sb, (byte) 99);
          mja.field_t.a(rg.field_h, 31407, nu.field_f.field_sb, 0, 0);
          stackIn_11_0 = oga.field_t;
          stackIn_11_1 = 18;
          stackIn_11_2 = 31407;
          if (!eaa.field_c) {
            stackIn_12_3 = 0;
          } else {
            stackIn_12_3 = 4 + rj.field_j + 40;
          }
          ((sna) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2, -stackIn_12_3 + nu.field_f.field_sb, 0, rg.field_h + 2);
          ut.field_q.a(18, 31407, 42 + rj.field_j, -40 + (nu.field_f.field_sb - rj.field_j - 2), rg.field_h + 2);
          ak.field_q.a((byte) -58, -2 + (nu.field_f.field_p - (rg.field_h + 20)), 0, 22 + rg.field_h, nu.field_f.field_sb, rj.field_j, 2);
          jj.field_wb.a(40, 31407, ela.field_i.field_sb, 0, -40 + ela.field_i.field_p);
          vaa.field_a.a(30, 31407, ho.field_g.field_sb, 0, 0);
          vm.field_i.a(-40 + (ho.field_g.field_p - 32), 31407, ho.field_g.field_sb, 0, 30);
          var2_int = 3 + ld.field_q;
          if (qha.field_c.length < 2) {
            var2_int--;
          }
          if (param0) {
            var2_int--;
          }
          var3 = (-10 + (vm.field_i.field_p - 5) + (-5 - (-2 - (1 + var2_int) / 2))) / (1 + var2_int) - 2;
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -5 + vm.field_i.field_p - 5 - (var3 + 2) * var2_int;
          if (var4 > 40) {
            var4 = 40;
          }
          mh.field_j.a(var4, 31407, -5 + (vm.field_i.field_sb - 5), 5, 5);
          var5 = var4 + 5 + 2;
          for (var6 = 0; 4 + ld.field_q > var6; var6++) {
            if ((1 != var6 ||
              !(qha.field_c.length < 2)) && (var6 != 3 ||
              !(bma.field_u <= 1))) {
              if (!param0 &&
                3 == var6) {
                var14 = pka.field_b[var6];
                var7_ref_sna = var14;
                pka.field_b[var6].field_p = 0;
                var14.field_sb = 0;
                for (var8_int = 0; gd.field_n[var6].length > var8_int; var8_int++) {
                  stackIn_33_0 = null;
                  stackIn_33_1 = gd.field_n[var6][var8_int];
                  if (stackIn_33_0 != stackIn_33_1) {
                    var9_ref_gna = gd.field_n[var6][var8_int];
                    gd.field_n[var6][var8_int].field_p = 0;
                    var9_ref_gna.field_sb = 0;
                  }
                }
              } else if (param0 &&
                var6 == 0) {
                var7_ref_sna = pka.field_b[var6];
                pka.field_b[var6].field_p = 0;
                var7_ref_sna.field_sb = 0;
                for (var8_int = 0; var8_int < gd.field_n[var6].length; var8_int++) {
                  if (null != gd.field_n[var6][var8_int]) {
                    var9_ref_gna = gd.field_n[var6][var8_int];
                    gd.field_n[var6][var8_int].field_p = 0;
                    var9_ref_gna.field_sb = 0;
                  }
                }
              } else {
                if (param0) {
                  if (var6 >= 4) {
                    if (null != vl.field_e) {
                      stackIn_57_0 = (vl.field_e[var6 - 4]) ? 1 : 0;
                    } else {
                      stackIn_57_0 = 0;
                    }
                  } else {
                    stackIn_57_0 = 0;
                  }
                } else {
                  stackIn_57_0 = 0;
                }
                var7 = stackIn_57_0;
                if (var7 != 0) {
                  var8 = pka.field_b[var6];
                  pka.field_b[var6].field_p = 0;
                  var8.field_sb = 0;
                  var15 = 0;
                  var9 = var15;
                  while (gd.field_n[var6].length > var15) {
                    if (null != gd.field_n[var6][var15]) {
                      var10 = gd.field_n[var6][var15];
                      gd.field_n[var6][var15].field_p = 0;
                      var10.field_sb = 0;
                    }
                    var15++;
                  }
                } else {
                  pka.field_b[var6].a(var3, 31407, 103, 5, var5);
                  var8_int = 110;
                  if (!param0) {
                    if (null != gd.field_n[var6][0]) {
                      var9_ref_gna = gd.field_n[var6][0];
                      gd.field_n[var6][0].field_p = 0;
                      var9_ref_gna.field_sb = 0;
                    }
                  } else {
                    gd.field_n[var6][0].a(38, 2, var3, var8_int, lm.field_d, (byte) -113, var5);
                    var8_int += 40;
                  }
                  var9 = ho.field_g.field_sb + (-5 - var8_int + 2);
                  var10_int = -1 + gd.field_n[var6].length;
                  for (var11 = 0; var10_int > var11; var11++) {
                    var12 = var11 * var9 / var10_int;
                    gd.field_n[var6][var11 + 1].a(-var12 + (var9 * (1 + var11) / var10_int - 2), 2, var3, var12 + var8_int, lm.field_d, (byte) -9, var5);
                  }
                  var5 = var5 + (2 + var3);
                }
              }
            }
          }
          qw.field_b.a(-124 + (dg.field_c - 10 - 10), 31407, 360, dg.field_i - 360 >> 1, 10);
          saa.field_f.a(24, 31407, qw.field_b.field_sb, 0, 0);
          rf.field_q.a(-24 + qw.field_b.field_p, 31407, qw.field_b.field_sb, 0, 24);
          rf.field_q.field_eb = mu.a(11579568, 3, rf.field_q.field_p, 8421504, 1, (byte) 17);
          tv.field_o.a(-26 + (-10 + rf.field_q.field_p), 31407, rf.field_q.field_sb - 10, 5, 5);
          vca.field_h.a(24, 31407, 80, (rf.field_q.field_sb - 80) / 2, -24 + rf.field_q.field_p - 5);
          pg.e(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "pv.B(" + param0 + ',' + param1 + ')');
        }
    }

    pv() {
    }

    static {
        field_i = 50;
        field_h = "Similar rating";
    }
}
