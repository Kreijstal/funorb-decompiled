/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vt extends tia {
    static int field_k;
    static String field_m;
    static int[] field_l;
    private eaa field_j;
    private kv[] field_i;

    final static void a(sga param0, int param1, int param2, boolean param3, int param4) {
        int var27_int = 0;
        sga stackIn_40_0;
        int stackIn_40_1;
        int stackIn_40_2;
        int stackIn_40_3;
        boolean stackIn_41_4 = false;
        int stackIn_44_0 = 0;
        int stackIn_57_0 = 0;
        sna stackIn_95_0;
        int stackIn_95_1;
        int stackIn_95_2;
        int stackIn_95_3;
        int stackIn_96_4 = 0;
        RuntimeException stackIn_216_0 = null;
        StringBuilder stackIn_216_1 = null;
        String stackIn_217_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        eaa var10 = null;
        int var11_int = 0;
        Object var11 = null;
        ema var12 = null;
        int var13 = 0;
        sna var14 = null;
        sna var15 = null;
        sna var16 = null;
        sna var17 = null;
        sna var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        Object var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        Object var30 = null;
        String var30_ref = null;
        int var30_int = 0;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        Object var24Lifetime1;
        Object var24Lifetime2;
        Object var30Lifetime1;
        String var30_refLifetime1;
        String var30_refLifetime2;
        Object var30Lifetime1Lifetime1;
        int var9Lifetime1;
        int var11_intLifetime1;
        int var24_intLifetime1;
        int var26Lifetime1;
        int var30_intLifetime1;
        int var26Lifetime2;
        var31 = BachelorFridge.field_y;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = param2;
          if (pw.field_w != null && (null != hr.field_b ||
            null != re.field_F ||
            null != gma.field_c ||
            null != wda.field_c)) {
            for (var9 = 0; var9 < ld.field_q; var9++) {
              var10_int = pw.field_w.field_Eb[var9] & 255;
              if (hr.field_b != null &&
                hr.field_b[var9] != null &&
                hr.field_b[var9][var10_int]) {
                var5_int = 1;
              }
              if (re.field_F != null &&
                null != re.field_F[var9]) {
                var11_int = re.field_F[var9][var10_int];
                if (var11_int > var6) {
                  var6 = var11_int;
                }
                if (var11_int != 0 &&
                  !bha.field_l) {
                  var5_int = 1;
                }
              }
              if (null != gma.field_c &&
                gma.field_c[var9] != null) {
                var11_intLifetime1 = gma.field_c[var9][var10_int];
                if (var11_intLifetime1 != 0 &&
                  !bha.field_l) {
                  var5_int = 1;
                }
                if (var11_intLifetime1 > var7) {
                  var7 = var11_intLifetime1;
                }
              }
              if (wda.field_c != null &&
                null != wda.field_c[var9]) {
                var8 = var8 | wda.field_c[var9][var10_int];
              }
            }
          }
          stackIn_40_0 = (sga) (param0);
          stackIn_40_1 = 4 + rg.field_h * 2;
          stackIn_40_2 = 2;
          stackIn_40_3 = (rg.field_h * 4 + 8) * param4;
          stackIn_41_4 = (bga.field_m == param0);
          stackIn_44_0 = (!((sga) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_40_2, stackIn_40_3, stackIn_41_4, param3, true)) ? 0 : 1;
          var9Lifetime1 = stackIn_44_0;
          var10 = param0.field_vb.field_z;
          var11 = null;
          var12 = (ema) (var10.b((byte) 90));
          while (var12 != null) {
            var13 = 0;
            if (var12.field_z == null) {
              var12.field_Ib = new sna(0L, gi.field_c);
              var12.a(-1, var12.field_Ib);
              var12.field_Bb = new sna(0L, wv.field_l);
              if (eaa.field_c) {
                var12.a(-1, var12.field_Bb);
              }
              var12.field_Bb.field_N = 2;
              var12.field_vb = new sna(0L, qs.field_m);
              var12.a(~param2, var12.field_vb);
              var12.d((byte) 118);
              var12.field_Fb = new sna(0L, mh.field_k);
              var12.a(-1, var12.field_Fb);
              var12.field_Db = new sna(0L, tca.field_c);
              var13 = 1;
              var12.a(-1, var12.field_Db);
            }
            var12.field_Ib.field_Z = null;
            var12.field_Ib.field_p = 0;
            var14 = var12.field_Ib;
            var12.field_Bb.field_Z = null;
            var14.field_sb = 0;
            var12.field_Bb.field_p = 0;
            var15 = var12.field_Bb;
            var12.field_Fb.field_Z = null;
            var15.field_sb = 0;
            var16 = var12.field_Fb;
            var12.field_Fb.field_p = 0;
            var12.field_Db.field_Z = null;
            var16.field_sb = 0;
            var17 = var12.field_Db;
            var12.field_Db.field_p = 0;
            var17.field_sb = 0;
            var12.field_vb.field_Z = null;
            var12.field_vb.field_p = 0;
            var18 = var12.field_vb;
            var18.field_sb = 0;
            var12.field_sb = param0.field_vb.field_sb;
            var19 = 0;
            var32 = var12.field_Nb;
            var21 = 72;
            if (param0 == qba.field_m) {
              var21 += 42;
            }
            var33 = po.a(var12.field_Ib.field_jb, var32, var21);
            var20 = var33;
            stackIn_57_0 = (var33.equals(var12.field_Nb)) ? 0 : 1;
            var22 = stackIn_57_0;
            if (4 > var12.field_Kb) {
              if (var12.field_Kb > 0) {
                var20 = "<img=" + (var12.field_Kb - 1) + ">" + var33;
              }
            } else {
              var20 = "<img=" + (re.field_E - 4 + var12.field_Kb) + ">" + var33;
            }
            var12.field_Ib.field_Z = var20;
            if (!var12.f((byte) 21)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_zb ||
                (!(var12.field_Jb >= var6) ||
                !(var7 <= var12.field_Gb) ||
                !(0 >= (var8 & ~var12.field_xb)))) {
                var23_int = 8414771;
                var24_int = 8421504;
              }
              var12.field_Fb.field_gb = var23_int;
              var12.field_Bb.field_gb = var23_int;
              var12.field_Ib.field_gb = var23_int;
              var12.field_Ib.field_w = var24_int;
              var12.field_Ib.field_G = var24_int;
              var12.field_Ib.field_ab = var24_int;
              var12.field_Bb.field_w = var24_int;
              var12.field_Bb.field_G = var24_int;
              var12.field_Bb.field_ab = var24_int;
              var12.field_Fb.field_w = var24_int;
              var12.field_Fb.field_G = var24_int;
              var12.field_Fb.field_ab = var24_int;
              if (param0 == ak.field_q) {
                if (!pw.field_w.field_Zb) {
                  var12.field_Db.field_Z = ui.field_p;
                }
              } else {
                if (!var12.field_wb) {
                  if (!var12.field_Ob) {
                    var12.field_Fb.field_Z = go.field_r;
                  } else {
                    var12.field_Ib.field_Z = lga.a(true, new String[]{var20}, ql.field_p);
                    var12.field_Fb.field_Z = mc.field_i;
                    var12.field_Db.field_Z = im.field_b;
                  }
                } else {
                  var12.field_Ib.field_Z = lga.a(true, new String[]{var20}, vla.field_t);
                  var12.field_Db.field_Z = bga.field_f;
                }
              }
              var25_int = 0;
              if (null != pw.field_w &&
                ps.d(-118) &&
                ge.field_F != var12.field_Eb) {
                if (var12.field_Fb.field_Z != null) {
                  var26 = var12.field_Fb.e(-1) + gba.field_Bb * 2;
                  var12.field_Fb.a(rg.field_h, 31407, var26, var25_int, var19);
                  var25_int = var25_int + var26;
                }
                if (null != var12.field_Db.field_Z) {
                  if (ak.field_q == param0) {
                    var26Lifetime2 = 40;
                  } else {
                    var26Lifetime2 = var12.field_Db.e(-1) + gba.field_Bb * 2;
                  }
                  var12.field_Db.a(rg.field_h, 31407, var26Lifetime2, var25_int, var19);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_95_0 = var12.field_Ib;
              stackIn_95_1 = rg.field_h;
              stackIn_95_2 = param2 + 31407;
              stackIn_95_3 = var12.field_sb;
              if (!eaa.field_c) {
                stackIn_96_4 = 0;
              } else {
                stackIn_96_4 = 42;
              }
              ((sna) (Object) stackIn_95_0).a(stackIn_95_1, stackIn_95_2, stackIn_95_3 - stackIn_96_4 - var25_int, var25_int, var19);
              var12.field_Bb.field_Z = Integer.toString(var12.field_Jb);
              var12.field_Bb.a(rg.field_h, param2 + 31407, 40, -40 + var12.field_sb, var19);
              if (var12.field_Ib.field_T &&
                var22 != 0) {
                jja.field_m = var12.field_Nb;
                if (null != nt.field_y &&
                  null != nt.field_y[var12.field_Kb]) {
                  jja.field_m = jja.field_m + " - " + nt.field_y[var12.field_Kb];
                }
              } else {
                if (var12.field_Ib.field_T &&
                  nt.field_y != null &&
                  nt.field_y[var12.field_Kb] != null) {
                  jja.field_m = nt.field_y[var12.field_Kb];
                }
              }
              var19 = var19 + rg.field_h;
            }
            var23 = vaa.a(var20, var12.field_yb, -1);
            var24 = var23;
            var30 = var24;
            var25 = var30;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_vb.field_jb.b(var23, -gba.field_Bb - gba.field_Bb + var12.field_sb);
              var12.field_vb.field_Z = var23;
              var12.field_vb.field_cb = 256 * var12.field_Mb / kla.field_x;
              var12.field_vb.a(rg.field_h * var24_intLifetime1, 31407, -(gba.field_Bb * 2) + var12.field_sb, gba.field_Bb, var19);
              var19 = var19 + var24_intLifetime1 * rg.field_h;
            }
            if (var9Lifetime1 == 0) {
              var12.field_hb = var19 - var12.field_p;
            }
            if (var13 != 0) {
              param0.field_vb.a(false, var12, (sna) (var11), 2);
            }
            if (var12.field_R != 0 &&
              !var12.f((byte) 21)) {
              if (var12.field_Fb.field_R == 0) {
                if (var12.field_Db.field_R != 0) {
                  od.a(var12.field_Eb, param1, 2);
                } else {
                  rda.a((byte) -104, 0, 0, param0, jc.field_r, var12, nfa.field_a);
                }
              } else {
                bia.a((byte) 90, var12.field_Eb, param1);
              }
            }
            var11 = var12;
            if (var12.field_E &&
              !var12.f((byte) 21)) {
              var24Lifetime2 = null;
              if (~ge.field_F != ~var12.field_Eb) {
                if (var5_int != 0 &&
                  !var12.field_zb) {
                  var24Lifetime2 = lga.a(true, new String[]{var20}, in.field_d);
                  var30Lifetime1 = var24Lifetime2;
                  var25 = var30Lifetime1;
                  var24Lifetime2 = var25;
                  var30Lifetime1Lifetime1 = var24Lifetime2;
                  var25 = var30Lifetime1Lifetime1;
                } else {
                  if (var7 > var12.field_Gb) {
                    var25_int = var7 - var12.field_Gb;
                    if (var25_int == 1) {
                      var24Lifetime2 = lga.a(true, new String[]{var20}, sna.field_C);
                    }
                    var24Lifetime2 = lga.a(true, new String[]{var20, Integer.toString(var25_int)}, pi.field_h);
                  } else {
                    if (var6 <= var12.field_Jb) {
                      if (0 != (var8 & ~var12.field_xb)) {
                        var25_int = ho.a(91, ~var12.field_xb & var8);
                        var24Lifetime2 = lga.a(true, new String[]{var20}, bh.field_s);
                        if (0 < var25_int &&
                          null != ffa.field_j &&
                          var25_int <= ffa.field_j.length &&
                          null != ffa.field_j[var25_int - 1]) {
                          var24Lifetime2 = lga.a(true, new String[]{var20}, ffa.field_j[var25_int - 1][2]);
                        }
                      }
                    } else {
                      var24Lifetime2 = lga.a(true, new String[]{var20, Integer.toString(var6)}, bw.field_d);
                    }
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_zb) {
                  var24Lifetime2 = fla.field_p;
                } else {
                  if (var7 <= var12.field_Gb) {
                    if (var12.field_Jb < var6) {
                      var24Lifetime2 = lga.a(true, new String[]{null, Integer.toString(var6)}, pda.field_q);
                    } else {
                      if ((~var12.field_xb & var8) != 0) {
                        var25_int = ho.a(86, ~var12.field_xb & var8);
                        var24Lifetime2 = gl.field_f;
                        if (var25_int > 0 &&
                          ffa.field_j != null &&
                          ffa.field_j.length >= var25_int &&
                          ffa.field_j[-1 + var25_int] != null) {
                          var24Lifetime2 = ffa.field_j[var25_int - 1][1];
                        }
                      }
                    }
                  } else {
                    var25_int = -var12.field_Gb + var7;
                    if (var25_int == 1) {
                      var24Lifetime2 = bk.field_w;
                    }
                    var24Lifetime2 = lga.a(true, new String[]{null, Integer.toString(var25_int)}, rj.field_o);
                  }
                }
              }
              if (var24Lifetime2 != null) {
                var34 = "<col=A00000>" + (String) (var24Lifetime2);
                var30_ref = var34;
                var25 = var30_ref;
                var24Lifetime2 = var25;
                var30_refLifetime1 = var34;
                var25 = var30_refLifetime1;
                var25 = null;
                var26Lifetime1 = 0;
                for (var27_int = 0; var27_int < ld.field_q; var27_int++) {
                  var28 = 255 & pw.field_w.field_Eb[var27_int];
                  var29 = 0;
                  if (hr.field_b != null &&
                    null != hr.field_b[var27_int] &&
                    hr.field_b[var27_int][var28] &&
                    !var12.field_zb) {
                    var29 = 1;
                  }
                  if (null != re.field_F &&
                    null != re.field_F[var27_int]) {
                    var30_int = re.field_F[var27_int][var28];
                    if (var30_int != 0 &&
                      !bha.field_l &&
                      !var12.field_zb) {
                      var29 = 1;
                    }
                    if (var12.field_Jb < var30_int) {
                      var29 = 1;
                    }
                  }
                  if (gma.field_c != null &&
                    null != gma.field_c[var27_int]) {
                    var30_intLifetime1 = gma.field_c[var27_int][var28];
                    if (var30_intLifetime1 != 0 &&
                      !bha.field_l &&
                      !var12.field_zb) {
                      var29 = 1;
                    }
                    if (var30_intLifetime1 > var12.field_Gb) {
                      var29 = 1;
                    }
                  }
                  if (null != wda.field_c &&
                    null != wda.field_c[var27_int] &&
                    (~var12.field_xb & wda.field_c[var27_int][var28]) != 0) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + kka.field_k[var27_int] + "</col>";
                    var25 = var30_refLifetime2;
                    var24Lifetime2 = var25;
                    var25 = var30_refLifetime2;
                    if (var25 == null) {
                      var25 = var30_refLifetime2;
                      var24Lifetime2 = var25;
                      var24Lifetime2 = var25;
                    } else {
                      var25 = (String) (var25) + ", " + var30_refLifetime2;
                      var26Lifetime1 = 1;
                    }
                  }
                }
                if (ak.field_q == param0 &&
                  ps.d(param2 - 124)) {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var34 + "<br>" + qn.field_h + (String) (var25);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + lga.a(true, new String[]{(String) (var25)}, cb.field_n);
                  }
                } else {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var34 + "<br>" + lga.a(true, new String[]{(String) (var25)}, jn.field_a);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + ra.field_l + (String) (var25);
                  }
                }
                if (ak.field_q == param0 &&
                  !ps.d(-121)) {
                  var27 = pw.field_w.field_Jb;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + lga.a(true, new String[]{var27}, ef.field_m);
                }
                jja.field_m = (String) (var24Lifetime2);
              }
            }
            var12 = (ema) (var10.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_216_0 = var5;
          stackIn_216_1 = new StringBuilder().append("vt.B(");
          if (param0 == null) {
            stackIn_217_2 = "null";
          } else {
            stackIn_217_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_216_0), ((StringBuilder) (Object) stackIn_216_1).append(stackIn_217_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_m = null;
        if (param0 != 0) {
          return;
        }
        field_l = null;
    }

    vt(gj param0, ad param1) {
        super(param0, param1);
        int var3_int = 0;
        int var4 = 0;
        try {
          var3_int = qq.field_i.length;
          this.field_i = new kv[var3_int];
          for (var4 = 0; var4 < var3_int; var4++) {
            this.field_i[var4] = qq.field_i[var4].a();
          }
          this.field_j = new eaa();
          this.field_g = 192;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "vt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0) {
        int var3;
        b var4;
        boolean stackIn_12_0 = false;
        var3 = BachelorFridge.field_y;
        int fieldTemp$1 = this.field_g - 1;
        this.field_g = this.field_g - 1;
        if ((fieldTemp$1 & 31) == 0) {
          this.field_j.a(new b(), true);
        }
        if (param0 >= 0) {
          field_l = (int[]) null;
        }
        var4 = (b) (this.field_j.b((byte) 90));
        while (var4 != null) {
          var4.b(true);
          var4 = (b) (this.field_j.c(0));
        }
        stackIn_12_0 = !(this.field_g <= 0) || (this.field_j.e(12917));
        return stackIn_12_0;
    }

    final void a(int param0, int param1, int param2) {
        int var5 = BachelorFridge.field_y;
        if (param1 != 25415) {
          vt.b(-62);
        }
        b var4 = (b) (this.field_j.b((byte) 90));
        while (var4 != null) {
          this.field_i[var4.field_s].a(param2 + (var4.field_i >> 3), -32 + ((var4.field_q >> 3) + (var4.field_h >> 3)) + (param0 - 64), var4.field_o);
          var4 = (b) (this.field_j.c(0));
        }
    }

    static {
        field_l = new int[]{11, 8, 0, 1, 2, 3};
    }
}
