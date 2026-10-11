/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static qr field_h;
    static bg field_f;
    static bi[] field_d;
    Object[] field_b;
    int field_g;
    static String field_c;
    static String field_a;
    private int field_e;
    static int field_i;

    private final void a(int param0) {
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != -11470) {
          this.field_b = (Object[]) (((Object[]) (this.field_b[8]))[1]);
        }
        this.field_e = this.field_e + 10;
        Object[] var5 = new Object[this.field_e];
        Object[] var2 = var5;
        for (var3 = 0; var3 < this.field_g; var3++) {
          var5[var3] = this.field_b[var3];
        }
        this.field_b = var2;
    }

    final static void a(int param0, int param1, ub param2, boolean param3, int param4) {
        int var27_int = 0;
        ub stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        boolean stackIn_43_3 = false;
        int stackIn_46_0 = 0;
        int stackIn_59_0 = 0;
        qr stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int stackIn_97_3 = 0;
        RuntimeException stackIn_222_0 = null;
        StringBuilder stackIn_222_1 = null;
        String stackIn_223_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        pf var10 = null;
        int var11_int = 0;
        Object var11 = null;
        mj var12 = null;
        int var13 = 0;
        qr var14 = null;
        qr var15 = null;
        qr var16 = null;
        qr var17 = null;
        qr var18 = null;
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
        var31 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (null != np.field_a && (null != td.field_E ||
            ci.field_h != null ||
            null != pg.field_A ||
            null != ji.field_D)) {
            for (var9 = 0; var9 < em.field_k; var9++) {
              var10_int = np.field_a.field_dc[var9] & 255;
              if (td.field_E != null &&
                null != td.field_E[var9] &&
                td.field_E[var9][var10_int]) {
                var5_int = 1;
              }
              if (ci.field_h != null &&
                null != ci.field_h[var9]) {
                var11_int = ci.field_h[var9][var10_int];
                if (var11_int > var6) {
                  var6 = var11_int;
                }
                if (var11_int != 0 &&
                  !hm.field_o) {
                  var5_int = 1;
                }
              }
              if (ji.field_D != null &&
                null != ji.field_D[var9]) {
                var8 = var8 | ji.field_D[var9][var10_int];
              }
              if (pg.field_A != null &&
                null != pg.field_A[var9]) {
                var11_intLifetime1 = pg.field_A[var9][var10_int];
                if (var11_intLifetime1 > var7) {
                  var7 = var11_intLifetime1;
                }
                if (var11_intLifetime1 != 0 &&
                  !hm.field_o) {
                  var5_int = 1;
                }
              }
            }
          }
          stackIn_42_0 = (ub) (param2);
          stackIn_42_1 = 4 * (2 + cr.field_c) * param0;
          stackIn_42_2 = cr.field_c * 2 + 4;
          stackIn_43_3 = (param2 == hp.field_l);
          stackIn_46_0 = (!((ub) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, stackIn_43_3, -108, param3, 2)) ? 0 : 1;
          var9Lifetime1 = stackIn_46_0;
          var10 = param2.field_xb.field_M;
          var11 = null;
          var12 = (mj) (var10.d(param1));
          while (var12 != null) {
            var13 = 0;
            if (null == var12.field_M) {
              var12.field_Ab = new qr(0L, ek.field_E);
              var12.a(4, var12.field_Ab);
              var12.field_Ob = new qr(0L, oj.field_zb);
              if (ns.field_pb) {
                var12.a(param1 ^ 4, var12.field_Ob);
              }
              var12.field_Ob.field_y = 2;
              var12.field_xb = new qr(0L, ii.field_u);
              var12.a(4, var12.field_xb);
              var12.e((byte) -128);
              var12.field_Jb = new qr(0L, kq.field_h);
              var12.a(param1 ^ 4, var12.field_Jb);
              var12.field_Mb = new qr(0L, rf.field_l);
              var13 = 1;
              var12.a(4, var12.field_Mb);
            }
            var12.field_Ab.field_z = null;
            var14 = var12.field_Ab;
            var12.field_Ab.field_mb = 0;
            var12.field_Ob.field_z = null;
            var14.field_K = 0;
            var15 = var12.field_Ob;
            var12.field_Ob.field_mb = 0;
            var15.field_K = 0;
            var12.field_Jb.field_z = null;
            var12.field_Jb.field_mb = 0;
            var16 = var12.field_Jb;
            var12.field_Mb.field_z = null;
            var16.field_K = 0;
            var12.field_Mb.field_mb = 0;
            var17 = var12.field_Mb;
            var12.field_xb.field_z = null;
            var17.field_K = 0;
            var18 = var12.field_xb;
            var12.field_xb.field_mb = 0;
            var18.field_K = 0;
            var12.field_K = param2.field_xb.field_K;
            var19 = 0;
            var32 = var12.field_Cb;
            var20 = var32;
            var20 = var32;
            var21 = 72;
            if (ls.field_a == param2) {
              var21 += 42;
            }
            var33 = nq.a(var12.field_Ab.field_nb, var32, var21);
            var20 = var33;
            var20 = var33;
            var20 = var33;
            stackIn_59_0 = (var33.equals(var12.field_Cb)) ? 0 : 1;
            var22 = stackIn_59_0;
            if (var12.field_Lb < 4) {
              if (0 < var12.field_Lb) {
                var20 = "<img=" + (var12.field_Lb - 1) + ">" + var33;
              }
            } else {
              var20 = "<img=" + (rg.field_d + (var12.field_Lb - 4)) + ">" + var33;
            }
            var12.field_Ab.field_z = var20;
            if (!var12.h(-89)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_Ub ||
                (!(var6 <= var12.field_Qb) ||
                !(var12.field_Fb >= var7) ||
                !((~var12.field_Wb & var8) <= 0))) {
                var23_int = 8414771;
                var24_int = 8421504;
              }
              var12.field_Jb.field_x = var23_int;
              var12.field_Ob.field_x = var23_int;
              var12.field_Ab.field_x = var23_int;
              var12.field_Ab.field_ab = var24_int;
              var12.field_Ab.field_qb = var24_int;
              var12.field_Ab.field_jb = var24_int;
              var12.field_Ob.field_ab = var24_int;
              var12.field_Ob.field_qb = var24_int;
              var12.field_Ob.field_jb = var24_int;
              var12.field_Jb.field_ab = var24_int;
              var12.field_Jb.field_qb = var24_int;
              var12.field_Jb.field_jb = var24_int;
              if (ro.field_a != param2) {
                if (var12.field_Tb) {
                  var12.field_Ab.field_z = re.a(o.field_q, 4371, new String[]{var20});
                  var12.field_Mb.field_z = fb.field_bc;
                } else {
                  if (!var12.field_Vb) {
                    var12.field_Jb.field_z = um.field_p;
                  } else {
                    var12.field_Ab.field_z = re.a(mg.field_E, 4371, new String[]{var20});
                    var12.field_Jb.field_z = o.field_m;
                    var12.field_Mb.field_z = hl.field_J;
                  }
                }
              } else {
                if (!np.field_a.field_Ab) {
                  var12.field_Mb.field_z = lc.field_a;
                }
              }
              var25_int = 0;
              if (np.field_a != null &&
                ip.a((byte) -97) &&
                ~ec.field_p != ~var12.field_Ib) {
                if (null != var12.field_Jb.field_z) {
                  var26 = var12.field_Jb.e(false) + 2 * tg.field_a;
                  var12.field_Jb.a(var26, cr.field_c, (byte) 80, var19, var25_int);
                  var25_int = var25_int + var26;
                }
                if (null != var12.field_Mb.field_z) {
                  if (param2 != ro.field_a) {
                    var26Lifetime2 = var12.field_Mb.e(false) + tg.field_a * 2;
                  } else {
                    var26Lifetime2 = 40;
                  }
                  var12.field_Mb.a(var26Lifetime2, cr.field_c, (byte) 78, var19, var25_int);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_96_0 = var12.field_Ab;
              stackIn_96_1 = -var25_int;
              stackIn_96_2 = var12.field_K;
              if (ns.field_pb) {
                stackIn_97_3 = 42;
              } else {
                stackIn_97_3 = 0;
              }
              ((qr) (Object) stackIn_96_0).a(stackIn_96_1 + (stackIn_96_2 - stackIn_97_3), cr.field_c, (byte) 44, var19, var25_int);
              var12.field_Ob.field_z = Integer.toString(var12.field_Qb);
              var12.field_Ob.a(40, cr.field_c, (byte) 126, var19, var12.field_K - 40);
              if (var12.field_Ab.field_L &&
                var22 != 0) {
                dn.field_k = var12.field_Cb;
                if (tk.field_v != null &&
                  null != tk.field_v[var12.field_Lb]) {
                  dn.field_k = dn.field_k + " - " + tk.field_v[var12.field_Lb];
                }
              } else {
                if (var12.field_Ab.field_L &&
                  tk.field_v != null &&
                  tk.field_v[var12.field_Lb] != null) {
                  dn.field_k = tk.field_v[var12.field_Lb];
                }
              }
              var19 = var19 + cr.field_c;
            }
            var23 = lc.a(var12.field_Eb, (byte) -87, var20);
            var24 = var23;
            var30 = var24;
            var25 = var30;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_xb.field_nb.a(var23, var12.field_K - tg.field_a - tg.field_a);
              var12.field_xb.field_z = var23;
              var12.field_xb.field_I = 256 * var12.field_Gb / ks.field_i;
              var12.field_xb.a(-(2 * tg.field_a) + var12.field_K, var24_intLifetime1 * cr.field_c, (byte) 96, var19, tg.field_a);
              var19 = var19 + cr.field_c * var24_intLifetime1;
            }
            if (var9Lifetime1 == 0) {
              var12.field_gb = var19 - var12.field_mb;
            }
            if (var13 != 0) {
              param2.field_xb.a(2, (qr) (var11), var12, (byte) 126);
            }
            if (var12.field_rb != 0 &&
              !var12.h(-72)) {
              if (0 != var12.field_Jb.field_rb) {
                tj.a((byte) -79, param4, var12.field_Ib);
              } else {
                if (0 == var12.field_Mb.field_rb) {
                  qg.a(nh.field_p, var12, td.field_P, param2, 0, 0, (byte) 110);
                } else {
                  bc.a(param4, (byte) 2, var12.field_Ib);
                }
              }
            }
            if (var12.field_v) {
              if (var12.h(-121)) {
                var11 = var12;
                var12 = (mj) (var10.a((byte) -71));
                continue;
              }
              var24Lifetime2 = null;
              if (ec.field_p != var12.field_Ib) {
                if (var5_int != 0 &&
                  !var12.field_Ub) {
                  var24Lifetime2 = re.a(fb.field_kc, param1 ^ 4371, new String[]{var20});
                  var30Lifetime1 = var24Lifetime2;
                  var25 = var30Lifetime1;
                  var24Lifetime2 = var25;
                  var30Lifetime1Lifetime1 = var24Lifetime2;
                  var25 = var30Lifetime1Lifetime1;
                } else {
                  if (var12.field_Fb >= var7) {
                    if (var6 <= var12.field_Qb) {
                      if ((var8 & ~var12.field_Wb) != 0) {
                        var25_int = db.a(param1 + 38, var8 & ~var12.field_Wb);
                        var24Lifetime2 = re.a(ra.field_j, 4371, new String[]{var20});
                        if (0 < var25_int &&
                          null != qa.field_s &&
                          var25_int <= qa.field_s.length &&
                          qa.field_s[var25_int - 1] != null) {
                          var24Lifetime2 = re.a(qa.field_s[var25_int - 1][2], param1 ^ 4371, new String[]{var20});
                        }
                      }
                    } else {
                      var24Lifetime2 = re.a(mq.field_b, 4371, new String[]{var20, Integer.toString(var6)});
                    }
                  } else {
                    var25_int = -var12.field_Fb + var7;
                    if (var25_int == 1) {
                      var24Lifetime2 = re.a(gs.field_i, 4371, new String[]{var20});
                    }
                    var24Lifetime2 = re.a(em.field_b, 4371, new String[]{var20, Integer.toString(var25_int)});
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_Ub) {
                  var24Lifetime2 = vg.field_r;
                } else {
                  if (var7 > var12.field_Fb) {
                    var25_int = var7 - var12.field_Fb;
                    if (var25_int == 1) {
                      var24Lifetime2 = fc.field_d;
                    }
                    var24Lifetime2 = re.a(as.field_h, param1 ^ 4371, new String[]{null, Integer.toString(var25_int)});
                  } else {
                    if (var6 <= var12.field_Qb) {
                      if ((var8 & ~var12.field_Wb) != 0) {
                        var25_int = db.a(param1 + 31, var8 & ~var12.field_Wb);
                        var24Lifetime2 = ub.field_Eb;
                        if (0 < var25_int &&
                          null != qa.field_s &&
                          qa.field_s.length >= var25_int &&
                          qa.field_s[-1 + var25_int] != null) {
                          var24Lifetime2 = qa.field_s[-1 + var25_int][1];
                        }
                      }
                    } else {
                      var24Lifetime2 = re.a(mk.field_f, 4371, new String[]{null, Integer.toString(var6)});
                    }
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
                for (var27_int = 0; var27_int < em.field_k; var27_int++) {
                  var28 = 255 & np.field_a.field_dc[var27_int];
                  var29 = 0;
                  if (td.field_E != null &&
                    td.field_E[var27_int] != null &&
                    td.field_E[var27_int][var28] &&
                    !var12.field_Ub) {
                    var29 = 1;
                  }
                  if (null != ci.field_h &&
                    ci.field_h[var27_int] != null) {
                    var30_int = ci.field_h[var27_int][var28];
                    if (var30_int != 0 &&
                      !hm.field_o &&
                      !var12.field_Ub) {
                      var29 = 1;
                    }
                    if (var12.field_Qb < var30_int) {
                      var29 = 1;
                    }
                  }
                  if (null != pg.field_A &&
                    null != pg.field_A[var27_int]) {
                    var30_intLifetime1 = pg.field_A[var27_int][var28];
                    if (var30_intLifetime1 != 0 &&
                      !hm.field_o &&
                      !var12.field_Ub) {
                      var29 = 1;
                    }
                    if (var30_intLifetime1 > var12.field_Fb) {
                      var29 = 1;
                    }
                  }
                  if (ji.field_D != null &&
                    null != ji.field_D[var27_int] &&
                    (~var12.field_Wb & ji.field_D[var27_int][var28]) != 0) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + gm.field_l[var27_int] + "</col>";
                    var25 = var30_refLifetime2;
                    var24Lifetime2 = var25;
                    var25 = var30_refLifetime2;
                    if (var25 == null) {
                      var25 = var30_refLifetime2;
                      var24Lifetime2 = var25;
                      var24Lifetime2 = var25;
                    } else {
                      var26Lifetime1 = 1;
                      var25 = (String) (var25) + ", " + var30_refLifetime2;
                    }
                  }
                }
                if (ro.field_a == param2 &&
                  ip.a((byte) -124)) {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var34 + "<br>" + eg.field_s + (String) (var25);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + re.a(ud.field_d, 4371, new String[]{(String) (var25)});
                  }
                } else {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var34 + "<br>" + sd.field_y + (String) (var25);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + re.a(ef.field_e, param1 + 4371, new String[]{(String) (var25)});
                  }
                }
                if (ro.field_a == param2 &&
                  !ip.a((byte) -126)) {
                  var27 = np.field_a.field_Xb;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + re.a(ve.field_Gb, 4371, new String[]{var27});
                }
                dn.field_k = (String) (var24Lifetime2);
              }
            }
            var11 = var12;
            var12 = (mj) (var10.a((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_222_0 = var5;
          stackIn_222_1 = new StringBuilder().append("dm.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_223_2 = "null";
          } else {
            stackIn_223_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_222_0), ((StringBuilder) (Object) stackIn_222_1).append(stackIn_223_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        de.field_h = ff.field_v[param1];
        i.field_a = h.field_w[param1];
        if (param0 != 0) {
          ub var3 = (ub) null;
          dm.a(-32, 115, (ub) null, false, 125);
        }
        ns.field_xb = ae.field_c[param1];
    }

    final void a(Object[] param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var3_int = param1; var3_int < this.field_g; var3_int++) {
            param0[var3_int] = this.field_b[var3_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("dm.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0, Object param1) {
        int fieldTemp$0 = 0;
        try {
          if (this.field_e == this.field_g) {
            this.a(-11470);
          }
          if (param0) {
            dm.a(((boolean[]) (((Object[]) (((Object[]) (this.field_b[7]))[2]))[1]))[4]);
          }
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_b[fieldTemp$0] = param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "dm.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public dm() {
        this.field_e = 10;
        this.field_g = 0;
        this.field_b = new Object[10];
    }

    public static void a(boolean param0) {
        field_c = null;
        field_h = null;
        field_f = null;
        field_d = null;
        field_a = null;
        if (param0) {
          ub var2 = (ub) null;
          dm.a(-33, 120, (ub) null, true, 27);
        }
    }

    static {
        field_a = "Shattered Plans has <%highlight>four different game types</col>, each with a different <%glossary>victory condition</col>.<br><br><%highlight>CONQUEST</col> - This is the simplest type of game: destroy all opponents to achieve victory. Any of the other game types can also be won in this way.<br><br><%highlight>CAPTURE AND HOLD</col> - The game has a fixed length of <%highlight>20 turns</col>, and a fixed map layout. In the centre of the map is <%highlight>Sol</col> and the damaged remains of Earth. At the end of each turn, the player who owns Sol earns <%highlight>1 point</col>. At the end of the 20 turns, the surviving player with the highest score wins. <%glossary>Ties</col> are broken in favour of the player who owns Sol. If none of the tied players own Sol, they draw and the other players lose.<br><br><%highlight>POINTS</col> - Players earn points each turn for the <%glossary>systems</col> they own. <%glossary>Colony homeworlds</col> are worth <%highlight>3 points</col> each turn, <%glossary>neutral homeworlds</col> are worth <%highlight>2 points</col>, and other worlds are worth <%highlight>1 point</col> each. The first player to reach the target number of points, which varies depending on map size, wins the game.<br><br><%highlight>DERELICTS</col> - Several <%glossary>derelict alien objects</col> are scattered around the map. Capturing a derelict allows you to begin researching it, earning you points each turn. This research is expensive, however, and so owning a derelict <%highlight>reduces your income<col> in each <%glossary>resource</col>. The first player to reach the target of <%highlight>50 points</col> wins.<br><br>";
        field_c = "Display Options";
        field_f = new bg("usename");
    }
}
