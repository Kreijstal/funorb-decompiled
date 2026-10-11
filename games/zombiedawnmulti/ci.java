/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static String[] field_c;
    static String field_f;
    static fm field_d;
    static int field_a;
    private int field_e;
    static String field_h;
    private th field_b;
    static String field_g;

    final void a(byte param0, byte[] param1) {
        gi var3 = null;
        int fieldTemp$0 = 0;
        try {
          var3 = new gi(param1);
          if (param0 <= 71) {
            field_h = (String) null;
          }
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          var3.field_k = fieldTemp$0;
          if (var3.field_j != 2 &&
            var3.field_j != 4) {
          }
          this.field_b.a(var3, false);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ci.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 1475) {
          return;
        }
        field_d = null;
        field_c = null;
        field_h = null;
        field_f = null;
        field_g = null;
    }

    final static String a(int param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        String var6 = "(" + k.field_k + " " + jp.field_e + " " + ij.field_d + ") " + op.field_i;
        String var1 = var6;
        if (param0 >= hd.field_q) {
        } else {
          var1 = var6 + ":";
          for (var2 = 0; var2 < hd.field_q; var2++) {
            var7 = var1 + ' ';
            var3 = 255 & s.field_e.field_m[var2];
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (10 > var4) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            if (10 > var3) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    final byte[] a(byte param0, int param1) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        th var3 = this.field_b;
        Object var4 = null;
        if (param0 != -85) {
          return (byte[]) null;
        }
        gi var4_ref = (gi) (var3.c(113));
        while (var4_ref != null) {
          if (var4_ref.field_k == param1) {
            break;
          }
          var4_ref = (gi) (var3.b(6));
        }
        if (var4_ref == null) {
          return null;
        }
        return var4_ref.field_o;
    }

    final static void a(boolean param0, int param1) {
        int var6 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        cj stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_3 = 0;
        Object stackIn_35_0 = null;
        mo stackIn_35_1 = null;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        cj var8_ref_cj = null;
        mo var9 = null;
        int var9_int = 0;
        int var10 = 0;
        mo var10_ref_mo = null;
        int var12 = 0;
        int var13 = 0;
        cj var14 = null;
        cj var15 = null;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          dm.field_Qb = oo.field_l;
          kp.field_l = oo.field_b;
          if (param0) {
            stackIn_4_0 = sq.field_Q;
          } else {
            stackIn_4_0 = da.field_a;
          }
          mf.a(stackIn_4_0, false);
          em.field_U.a(0, mh.field_i.field_zb, 0, (byte) -74, -2 + (-40 + mh.field_i.field_z));
          fn.field_h.a(jk.field_f, 0, ga.field_r.field_zb, 0, -3344);
          stackIn_6_0 = ie.field_jb;
          stackIn_6_1 = 18;
          stackIn_6_2 = 2 + jk.field_f;
          if (tb.field_u) {
            stackIn_7_3 = 2 + (40 + qa.field_o) + 2;
          } else {
            stackIn_7_3 = 0;
          }
          ((cj) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, -stackIn_7_3 + ga.field_r.field_zb, 0, -3344);
          bf.field_h.a(18, 2 + jk.field_f, 42 + qa.field_o, -42 - qa.field_o + ga.field_r.field_zb, -3344);
          bf.field_n.a(qa.field_o, 2, ga.field_r.field_zb, 0, -2 - jk.field_f + (ga.field_r.field_z - 20), -31465, 20 + (2 + jk.field_f));
          jp.field_b.a(40, mh.field_i.field_z - 40, mh.field_i.field_zb, 0, -3344);
          gg.field_m.a(30, 0, fc.field_a.field_zb, 0, -3344);
          dl.field_a.a(-2 + fc.field_a.field_z - 70, 30, fc.field_a.field_zb, 0, -3344);
          var2_int = 3 + kj.field_h;
          if (2 > qo.field_r.length) {
            var2_int--;
          }
          if (param0) {
            var2_int--;
          }
          var3 = -2 + (-10 + dl.field_a.field_z - (8 - (var2_int + 1) / 2)) / (var2_int + 1);
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -(var2_int * (var3 + 2)) - 5 + (dl.field_a.field_z - 5);
          if (var4 > 40) {
            var4 = 40;
          }
          ik.field_d.a(var4, 5, -5 + (dl.field_a.field_zb - 5), 5, -3344);
          var5 = var4 + 7;
          for (var6 = 0; 4 + kj.field_h > var6; var6++) {
            if ((var6 != 1 ||
              !(2 > qo.field_r.length)) && (3 != var6 ||
              !(r.field_f <= 1))) {
              if (!param0 &&
                var6 == 3) {
                var15 = mi.field_Ib[var6];
                mi.field_Ib[var6].field_z = 0;
                var15.field_zb = 0;
                for (var8 = 0; ma.field_b[var6].length > var8; var8++) {
                  if (null != ma.field_b[var6][var8]) {
                    var9 = ma.field_b[var6][var8];
                    ma.field_b[var6][var8].field_z = 0;
                    var9.field_zb = 0;
                  }
                }
              } else if (param0 &&
                var6 == 0) {
                var14 = mi.field_Ib[var6];
                mi.field_Ib[var6].field_z = 0;
                var14.field_zb = 0;
                for (var8 = 0; ma.field_b[var6].length > var8; var8++) {
                  stackIn_35_0 = null;
                  stackIn_35_1 = ma.field_b[var6][var8];
                  if (stackIn_35_0 != stackIn_35_1) {
                    var9 = ma.field_b[var6][var8];
                    ma.field_b[var6][var8].field_z = 0;
                    var9.field_zb = 0;
                  }
                }
              } else {
                if (param0) {
                  if (var6 >= 4) {
                    if (null != km.field_ab) {
                      stackIn_50_0 = (km.field_ab[var6 - 4]) ? 1 : 0;
                    } else {
                      stackIn_50_0 = 0;
                    }
                  } else {
                    stackIn_50_0 = 0;
                  }
                } else {
                  stackIn_50_0 = 0;
                }
                var7 = stackIn_50_0;
                if (var7 != 0) {
                  var8_ref_cj = mi.field_Ib[var6];
                  mi.field_Ib[var6].field_z = 0;
                  var8_ref_cj.field_zb = 0;
                  for (var9_int = 0; var9_int < ma.field_b[var6].length; var9_int++) {
                    if (ma.field_b[var6][var9_int] != null) {
                      var10_ref_mo = ma.field_b[var6][var9_int];
                      ma.field_b[var6][var9_int].field_z = 0;
                      var10_ref_mo.field_zb = 0;
                    }
                  }
                } else {
                  mi.field_Ib[var6].a(var3, var5, 103, 5, -3344);
                  var8 = 110;
                  if (!param0) {
                    if (ma.field_b[var6][0] != null) {
                      var9 = ma.field_b[var6][0];
                      ma.field_b[var6][0].field_z = 0;
                      var9.field_zb = 0;
                    }
                  } else {
                    ma.field_b[var6][0].a(ed.field_c, 2, var3, 38, var8, var5, 2);
                    var8 += 40;
                  }
                  var9_int = 2 + (-var8 + (-5 + fc.field_a.field_zb));
                  var10 = ma.field_b[var6].length - 1;
                  for (var11 = 0; var10 > var11; var11++) {
                    var12 = var11 * var9_int / var10;
                    ma.field_b[var6][var11 + 1].a(ed.field_c, 2, var3, -var12 + var9_int * (var11 + 1) / var10 - 2, var8 + var12, var5, 2);
                  }
                  var5 = var5 + (2 + var3);
                }
              }
            }
          }
          qf.field_b.a(-10 + (-4 + oo.field_l - 130), 10, 360, oo.field_b - 360 >> 1, -3344);
          mq.field_l.a(24, 0, qf.field_b.field_zb, 0, -3344);
          vb.field_c.a(-24 + qf.field_b.field_z, 24, qf.field_b.field_zb, 0, -3344);
          vb.field_c.field_ab = tg.a(1, vb.field_c.field_z, 8421504, 3, 11579568, 35);
          pd.field_b.a(-26 + (-10 + vb.field_c.field_z), 5, -10 + vb.field_c.field_zb, 5, -3344);
          pg.field_a.a(24, -24 + vb.field_c.field_z - 5, 80, (-80 + vb.field_c.field_zb) / 2, -3344);
          if (param1 > -6) {
            return;
          }
          up.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ci.C(" + param0 + ',' + param1 + ')');
        }
    }

    ci() {
        this.field_e = 0;
        this.field_b = new th();
    }

    static {
        field_a = 0;
        field_h = "Next";
        field_g = "Retry";
        field_c = new String[]{null, null, null, null, "You can tell the zombie where to go by <col=ff0000>right-clicking on the map</col>. Zombies are slow to react, but they'll get there eventually.", null, "Deselect your zombies by left-clicking a vacant spot on the map. Try that now."};
    }
}
