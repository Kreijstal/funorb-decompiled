/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sr {
    int field_g;
    static String field_d;
    int field_h;
    static boolean[] field_c;
    int field_f;
    static long field_a;
    int field_e;
    static sna field_b;

    public static void b(byte param0) {
        field_d = null;
        field_c = null;
        if (param0 < 125) {
          field_a = -105L;
        }
        field_b = null;
    }

    final static void a(boolean param0, boolean param1, int param2, boolean param3) {
        int stackIn_5_0 = 0;
        boolean stackIn_6_1 = false;
        int stackIn_16_0 = 0;
        String stackIn_30_0 = null;
        sna stackIn_40_0 = null;
        String stackIn_41_1 = null;
        sna stackIn_43_0 = null;
        boolean stackIn_43_1 = false;
        String[] stackIn_43_2 = null;
        String stackIn_44_3 = null;
        sna stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        boolean stackIn_74_2 = false;
        sna stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        boolean stackIn_79_2 = false;
        sna stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        boolean stackIn_84_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        sna var5 = null;
        sna var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        sna var15 = null;
        String var16 = null;
        sna var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = BachelorFridge.field_y;
        try {
          if (!param0) {
            return;
          }
          stackIn_5_0 = ld.field_p;
          stackIn_6_1 = !(param0);
          dna.c(stackIn_5_0, stackIn_6_1);
          if (null != rv.field_n) {
            ik.field_i.field_p = 0;
            var15 = ik.field_i;
            var17 = var15;
            var17.field_sb = 0;
            cn.field_j.field_p = 0;
            var5 = cn.field_j;
            var5.field_sb = 0;
            cw.field_yb.field_p = 0;
            var6 = cw.field_yb;
            var6.field_sb = 0;
            vaa.field_a.field_Z = tw.field_d.toUpperCase();
            var7 = (2 + ho.field_g.field_sb) / 2;
            cw.field_yb.a(40, 31407, var7 - 2, 0, ho.field_g.field_p - 40);
            cn.field_j.a(40, 31407, -var7 + ho.field_g.field_sb, var7, ho.field_g.field_p - 40);
            if (1 == qha.field_c.length &&
              qha.field_c[0] == 2) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (var10 < qha.field_c.length) {
                  stackIn_16_0 = ((fia.field_r[var10 / 8] & 1 << (7 & var10)) == 0) ? 0 : 1;
                  var11_int = stackIn_16_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    qha.field_c[var10] != 2) {
                    var8 = 1;
                  } else {
                    var10++;
                    continue;
                  }
                }
                if (var9_int != 0) {
                  break;
                }
                var8 = 1;
                break;
              }
            }
            cn.field_j.field_u = true;
            if (!ce.field_y) {
              stackIn_40_0 = cn.field_j;
              if (var8 != 0) {
                stackIn_41_1 = bg.field_m;
              } else {
                stackIn_41_1 = fka.field_h;
              }
              stackIn_40_0.field_Z = ((String) (Object) stackIn_41_1).toUpperCase();
              stackIn_43_0 = (sna) (field_b);
              stackIn_43_1 = true;
              stackIn_43_2 = new String[]{cn.field_j.field_Z};
              if (var8 != 0) {
                stackIn_44_3 = kk.field_r;
              } else {
                stackIn_44_3 = ffa.field_h;
              }
              stackIn_43_0.field_Z = lga.a(stackIn_43_1, stackIn_43_2, stackIn_44_3);
              cw.field_yb.field_Z = lo.field_a;
              fla.field_q = true;
              jj.field_wb.field_u = true;
              if (null != pha.field_h) {
                uu.field_yb = false;
                fla.field_q = false;
                if (bja.field_o == null) {
                  bja.field_o = new byte[ld.field_q];
                  ala.field_b = new boolean[ld.field_q];
                }
                var13 = 0;
                var9_intLifetime1 = var13;
                while (var13 < ld.field_q) {
                  ala.field_b[var13] = false;
                  var13++;
                }
                ub.a(0, true, -81, -1, -1, rv.field_n, -1, ld.field_q);
                if (!(2 > hea.field_r) &&
                  wga.field_q[12]) {
                  fla.field_q = true;
                }
              }
              if (!fla.field_q) {
                cn.field_j.field_u = false;
                if (cn.field_j.field_E) {
                  var9 = null;
                  if (uu.field_yb) {
                    var9 = "<col=A00000>" + gb.field_j + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; ld.field_q > var10Lifetime1; var10Lifetime1++) {
                    if (ala.field_b[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + kka.field_k[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 == null) {
                        var9 = var11_ref;
                      } else {
                        var9 = (String) (var9) + ", " + var11_ref;
                      }
                    }
                  }
                  jja.field_m = "<col=A00000>" + iha.field_k + "<br>" + jm.field_l + (String) (var9);
                }
              }
            } else {
              jj.field_wb.field_u = false;
              field_b.field_Z = pba.field_q;
              if (var8 != 0) {
                stackIn_30_0 = wk.field_e;
              } else {
                stackIn_30_0 = sk.field_p;
              }
              var16 = stackIn_30_0;
              var9 = var16;
              var9 = var16;
              var9 = var16;
              var10Lifetime1 = cw.field_yb.field_jb.a(var16) + cw.field_yb.field_jb.a('.') * 3;
              cw.field_yb.field_N = 0;
              if ((qf.field_v & 48) == 16) {
                var9 = var16 + ".";
              }
              cw.field_yb.field_L = (cw.field_yb.field_sb - var10Lifetime1) / 2;
              if ((qf.field_v & 48) == 32) {
                var9 = (String) (var9) + "..";
              }
              if ((48 & qf.field_v) == 48) {
                var9 = (String) (var9) + "...";
              }
              cw.field_yb.field_Z = (String) (var9);
              cn.field_j.field_Z = bga.field_f.toUpperCase();
            }
          }
          stackIn_73_0 = ela.field_i;
          stackIn_73_1 = 19842;
          stackIn_74_2 = (param3) && (!param1) && (!w.field_e);
          ((sna) (Object) stackIn_73_0).a(stackIn_73_1, stackIn_74_2);
          stackIn_78_0 = ho.field_g;
          stackIn_78_1 = 19842;
          stackIn_79_2 = (param3) && (!param1) && (!w.field_e);
          ((sna) (Object) stackIn_78_0).a(stackIn_78_1, stackIn_79_2);
          stackIn_83_0 = qw.field_b;
          stackIn_83_1 = 19842;
          stackIn_84_2 = (param3) && (!param1) && (w.field_e);
          ((sna) (Object) stackIn_83_0).a(stackIn_83_1, stackIn_84_2);
          pf.field_n.field_a.f(18632);
          if (null != rv.field_n) {
            if (jj.field_wb.field_R != 0) {
              wt.b(-22908, param2);
            }
            if (cn.field_j.field_R != 0) {
              if (ce.field_y) {
                kl.a(54, param2);
              } else {
                fq.a(param2, (byte) -124);
              }
            }
            wp.a(false, rv.field_n, param2, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var4), "sr.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (32 >= bs.field_k) {
          gka.a(119, 0);
        } else {
          var1 = bs.field_k % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          gka.a(126, -var1 + bs.field_k);
        }
        if (param0 > -9) {
          sr.b((byte) -4);
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static void a(int param0, byte param1) {
        if (param1 < 5) {
          field_c = (boolean[]) null;
        }
        dc.field_m = da.field_a[param0];
        gq.field_G = sb.field_m[param0];
        rj.field_q = dl.field_k[param0];
    }

    final static void a(int param0) {
        et.field_m = null;
        tb.field_b = null;
        if (param0 != 48) {
          sr.b((byte) 41);
        }
    }

    static {
        field_d = "Dairy";
    }
}
