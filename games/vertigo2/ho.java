/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho {
    static String field_a;
    static int[] field_e;
    int field_b;
    byte field_h;
    int field_c;
    int field_j;
    static String field_d;
    static String field_i;
    byte field_g;
    int[][] field_f;

    final static void a(int param0) {
        if (!sq.field_c) {
          throw new IllegalStateException();
        }
        mg.field_O = true;
        int var1 = 47 / ((3 - param0) / 46);
        pm.a((byte) 52, false);
        hn.field_w = 0;
    }

    final static void a(int param0, boolean param1, int param2) {
        b var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        tp var3 = pf.a(false, param1, param2);
        b var4Lifetime1;
        if (var3 != null) {
          un.field_Lb.a(0, false);
          var4 = un.field_Lb;
          var5_ref_String = nf.field_o;
          var4.field_n.a(var5_ref_String, 5, param0 ^ 24285);
          var4Lifetime1 = un.field_Lb;
          var5 = sd.field_N;
          var6 = no.field_e;
          var4Lifetime1.field_n.c(0, var6, -1220, var5, 0);
        }
        if (param0 != 24285) {
          field_i = (String) null;
        }
        ql.a(param1, -127, param2);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (this.field_g < this.field_f.length) {
          this.field_f[this.field_g][0] = param3;
          this.field_f[this.field_g][1] = param0;
          this.field_f[this.field_g][2] = param1;
          this.field_f[this.field_g][3] = param2;
          this.field_g = (byte)(this.field_g + 1);
        }
        if (param4 != -30439) {
          field_i = (String) null;
        }
    }

    final static void a(int param0, boolean param1) {
        int var6 = 0;
        cr dupTemp$0 = null;
        int var11 = 0;
        int stackIn_4_0 = 0;
        cr stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_48_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        cr var7 = null;
        int var7_int = 0;
        int var8 = 0;
        cr var8_ref_cr = null;
        nk var9 = null;
        int var9_int = 0;
        int var10 = 0;
        nk var10_ref_nk = null;
        int var12 = 0;
        int var13 = 0;
        cr var14 = null;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          om.field_D = bi.field_j;
          qg.field_G = bi.field_e;
          if (param1) {
            stackIn_4_0 = ko.field_P;
          } else {
            stackIn_4_0 = mp.field_b;
          }
          hq.b(stackIn_4_0, -127);
          el.field_e.a(0, 14017, hk.field_o.field_Fb, 0, -2 + (-40 + hk.field_o.field_db));
          nb.field_D.a(param0 ^ 108, de.field_g.field_Fb, r.field_f, 0, 0);
          stackIn_6_0 = uc.field_a;
          stackIn_6_1 = param0 + 83;
          if (db.field_S) {
            stackIn_7_2 = 40 + re.field_k + 4;
          } else {
            stackIn_7_2 = 0;
          }
          ((cr) (Object) stackIn_6_0).a(stackIn_6_1, -stackIn_7_2 + de.field_g.field_Fb, 18, 2 + r.field_f, 0);
          eq.field_z.a(param0 + 95, re.field_k + 42, 18, 2 + r.field_f, -40 + (-re.field_k + (de.field_g.field_Fb - 2)));
          vd.field_d.a(2 + r.field_f + 20, 2, re.field_k, -22 + (de.field_g.field_db - r.field_f), 0, de.field_g.field_Fb, 3124);
          ne.field_G.a(76, hk.field_o.field_Fb, 40, -40 + hk.field_o.field_db, param0);
          ud.field_x.a(76, lb.field_c.field_Fb, 30, 0, 0);
          fd.field_s.a(108, lb.field_c.field_Fb, -2 + (lb.field_c.field_db - 70), 30, 0);
          var2_int = 3 + ol.field_A;
          if (rc.field_a.length < 2) {
            var2_int--;
          }
          if (param1) {
            var2_int--;
          }
          var3 = (-10 + (-5 + (-5 + (fd.field_s.field_db + 2) + (var2_int + 1) / 2))) / (var2_int + 1) - 2;
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = fd.field_s.field_db - 5 - 5 - (2 + var3) * var2_int;
          if (40 < var4) {
            var4 = 40;
          }
          pc.field_b.a(84, -5 + (-5 + fd.field_s.field_Fb), var4, 5, 5);
          var5 = 7 + var4;
          for (var6 = 0; 4 + ol.field_A > var6; var6++) {
            if ((1 != var6 ||
              !(rc.field_a.length < 2)) && (var6 != 3 ||
              !(sp.field_O <= 1))) {
              if (!param1 &&
                var6 == 3) {
                dupTemp$0 = el.field_h[var6];
                var14 = dupTemp$0;
                var7 = dupTemp$0;
                el.field_h[var6].field_db = 0;
                var14.field_Fb = 0;
                for (var8 = 0; mg.field_S[var6].length > var8; var8++) {
                  if (mg.field_S[var6][var8] != null) {
                    var9 = mg.field_S[var6][var8];
                    mg.field_S[var6][var8].field_db = 0;
                    var9.field_Fb = 0;
                  }
                }
              } else if (param1 &&
                0 == var6) {
                var7 = el.field_h[var6];
                el.field_h[var6].field_db = 0;
                var7.field_Fb = 0;
                for (var8 = 0; var8 < mg.field_S[var6].length; var8++) {
                  if (mg.field_S[var6][var8] != null) {
                    var9 = mg.field_S[var6][var8];
                    mg.field_S[var6][var8].field_db = 0;
                    var9.field_Fb = 0;
                  }
                }
              } else {
                if (param1) {
                  if (var6 >= 4) {
                    if (null != kf.field_d) {
                      stackIn_48_0 = (kf.field_d[-4 + var6]) ? 1 : 0;
                    } else {
                      stackIn_48_0 = 0;
                    }
                  } else {
                    stackIn_48_0 = 0;
                  }
                } else {
                  stackIn_48_0 = 0;
                }
                var7_int = stackIn_48_0;
                if (var7_int != 0) {
                  var8_ref_cr = el.field_h[var6];
                  el.field_h[var6].field_db = 0;
                  var8_ref_cr.field_Fb = 0;
                  for (var9_int = 0; var9_int < mg.field_S[var6].length; var9_int++) {
                    if (null != mg.field_S[var6][var9_int]) {
                      var10_ref_nk = mg.field_S[var6][var9_int];
                      mg.field_S[var6][var9_int].field_db = 0;
                      var10_ref_nk.field_Fb = 0;
                    }
                  }
                } else {
                  el.field_h[var6].a(param0 ^ 123, 103, var3, var5, 5);
                  var8 = 110;
                  if (param1) {
                    mg.field_S[var6][0].a(var5, 38, r.field_j, var3, 2, param0 + 1, var8);
                    var8 += 40;
                  } else {
                    if (mg.field_S[var6][0] != null) {
                      var9 = mg.field_S[var6][0];
                      mg.field_S[var6][0].field_db = 0;
                      var9.field_Fb = 0;
                    }
                  }
                  var9_int = lb.field_c.field_Fb - 5 - (var8 - 2);
                  var10 = -1 + mg.field_S[var6].length;
                  for (var11 = 0; var10 > var11; var11++) {
                    var12 = var11 * var9_int / var10;
                    mg.field_S[var6][1 + var11].a(var5, -var12 + ((var11 + 1) * var9_int / var10 - 2), r.field_j, var3, 2, param0 ^ 1, var12 + var8);
                  }
                  var5 = var5 + (2 + var3);
                }
              }
            }
          }
          wc.field_m.a(param0 ^ 81, 360, -20 + (-124 + bi.field_j), 10, bi.field_e - 360 >> 1);
          he.field_x.a(77, wc.field_m.field_Fb, 24, 0, 0);
          lr.field_P.a(116, wc.field_m.field_Fb, -24 + wc.field_m.field_db, 24, 0);
          lr.field_P.field_Bb = vl.a(lr.field_P.field_db, 3, 0, 1, 11579568, 8421504);
          im.field_j.a(99, lr.field_P.field_Fb - 10, -2 + (lr.field_P.field_db - 34), 5, 5);
          Vertigo2.field_M.a(74, 80, 24, -5 + (lr.field_P.field_db - 24), (-80 + lr.field_P.field_Fb) / 2);
          po.b((byte) -52);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "ho.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        for (var2 = 0; var2 < this.field_f.length; var2++) {
          this.field_f[var2][0] = -1;
        }
        this.field_g = (byte) 0;
        if (param0 != -28233) {
          this.field_f = (int[][]) null;
        }
    }

    ho() {
        int var1 = 0;
        this.field_f = new int[9][4];
        this.field_h = (byte) -1;
        for (var1 = 0; var1 < this.field_f.length; var1++) {
          this.field_f[var1][0] = -1;
        }
        this.field_g = (byte) 0;
    }

    public static void c(int param0) {
        field_i = null;
        field_a = null;
        if (param0 != 11579568) {
          ho.a(68);
        }
        field_e = null;
        field_d = null;
    }

    static {
        field_e = new int[]{2};
        field_a = "Cancel rematch";
        field_d = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_i = "Location";
    }
}
