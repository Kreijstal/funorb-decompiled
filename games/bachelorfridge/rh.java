/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static String field_a;

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = BachelorFridge.field_y;
          if (param1 <= -122) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        var3 = 0;
        var4 = vka.field_q;
        L1: while (true) {
          if (pt.field_a.length <= var3) {
            return -1;
          } else {
            var5 = gn.field_l[var3];
            if (-1 < (var5 ^ -1)) {
              var4 = var4 + un.field_i;
              var3++;
              continue L1;
            } else {
              var6 = hka.a(true, true, pt.field_a[var3]);
              var4 = var4 + raa.field_J;
              var7 = sd.field_a - (var6 >> -36563167);
              if (hha.a(jo.field_t - -(pba.field_r << 1208946273), param2, var6 + (hna.field_k << -394418175), 1, var7 - hna.field_k, var4, param0)) {
                return var5;
              } else {
                var4 = var4 + (raa.field_J + (pba.field_r << 765803585) + jo.field_t);
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        if (param0 != 19007) {
            return;
        }
        String var2 = param1.getParameter("username");
        if (var2 != null) {
            CharSequence var3 = (CharSequence) (Object) var2;
            // ifne L38
        }
        return;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        sna var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        gs var10 = null;
        L0: {
          var7 = BachelorFridge.field_y;
          if (saa.field_b <= eb.field_t) {
            break L0;
          } else {
            eb.field_t = eb.field_t + 1;
            break L0;
          }
        }
        L1: {
          if (hga.field_U.field_f == pda.field_p) {
            break L1;
          } else {
            fs.field_f = fs.field_f + (hga.field_U.field_f - pda.field_p);
            pda.field_p = hga.field_U.field_f;
            break L1;
          }
        }
        if (eb.field_t > 0) {
          L2: {
            iv.b(false);
            if (param1 >= 45) {
              break L2;
            } else {
              var8 = null;
              rh.a(true, (eaa) null);
              break L2;
            }
          }
          L3: {
            i.field_a.a(19842, param2);
            if (ao.field_d == null) {
              break L3;
            } else {
              if (hl.field_I) {
                boolean discarded$1 = ao.field_d.a(param2, i.field_a.field_D, i.field_a.field_M, 6381);
                break L3;
              } else {
                ao.field_d = null;
                break L3;
              }
            }
          }
          var4 = 0;
          L4: while (true) {
            if (var4 >= 5) {
              L5: {
                if (kg.field_a.field_R != 0) {
                  wt.field_n = new uq(kg.field_a.field_D, kg.field_a.field_M, kg.field_a.field_sb, kg.field_a.field_p, param3, qaa.field_d, mda.field_c, sm.field_s, qs.field_m, nr.field_v, dla.field_k, (String) null, 0L);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var10 = iu.a(param0, (byte) 114, gba.field_Bb, rg.field_h);
                if (var10 != null) {
                  om.a(var10, (byte) -111);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                var9 = gr.a(2);
                if (var9 != null) {
                  jja.field_m = var9;
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            } else {
              var5 = r.field_l[var4];
              if (var5 != null) {
                L8: {
                  if (0 == var5.field_R) {
                    break L8;
                  } else {
                    qca.a(var4, var5, (byte) 124);
                    break L8;
                  }
                }
                var6 = af.a(var4, 26291);
                wg.field_i[var4].field_v = gi.field_b[var6];
                bda.field_m[var4].field_Z = qo.field_a[var6];
                var4++;
                continue L4;
              } else {
                var4++;
                continue L4;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(boolean param0, eaa param1) {
        int var6 = BachelorFridge.field_y;
        if (bp.e(-29919)) {
            throw new IllegalStateException();
        }
        sja.field_fb.c(80, (byte) 107);
        if (param0) {
            field_a = null;
        }
        sja.field_fb.field_g = sja.field_fb.field_g + 2;
        int var2 = sja.field_fb.field_g;
        sja.field_fb.field_g = sja.field_fb.field_g + 1;
        int var3 = 0;
        kha var4 = (kha) (Object) param1.b((byte) 90);
        while (var4 != null) {
            sja.field_fb.d(var4.field_h, 0);
            var3++;
            sja.field_fb.d(var4.field_g, 0);
            var4 = (kha) (Object) param1.c(0);
        }
        int var5 = sja.field_fb.field_g;
        sja.field_fb.field_g = var2;
        sja.field_fb.d(var3, 0);
        sja.field_fb.field_g = var5;
        sja.field_fb.a((byte) -88, -var2 + sja.field_fb.field_g);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> ready!";
    }
}
