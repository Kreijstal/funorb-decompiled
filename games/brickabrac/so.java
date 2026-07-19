/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so {
    static String field_e;
    private to field_a;
    static ke field_f;
    static int field_b;
    static fk field_d;
    private mf field_g;
    private mf field_c;

    final static pb a(int param0, int param1, int param2, vl param3) {
        pb discarded$2 = null;
        Object var4 = null;
        pb var5 = null;
        vl var6 = null;
        Object stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var4 = null;
              if (param0 == 0) {
                break L1;
              } else {
                var6 = (vl) null;
                discarded$2 = so.a(8, 113, -81, (vl) null);
                break L1;
              }
            }
            var5 = (pb) ((Object) param3.d(-15));
            L2: while (true) {
              L3: {
                if (var5 == null) {
                  break L3;
                } else {
                  if (var5.a((byte) -84, param1, param2)) {
                    var4 = var5;
                    break L3;
                  } else {
                    var5 = (pb) ((Object) param3.a((byte) 116));
                    continue L2;
                  }
                }
              }
              L4: {
                if (var4 != null) {
                  break L4;
                } else {
                  var4 = (pb) ((Object) param3.a(127));
                  break L4;
                }
              }
              param3.a(true, (nm) (var4));
              stackOut_10_0 = var4;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = var4;
            stackOut_12_1 = new StringBuilder().append("so.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return (pb) ((Object) stackIn_11_0);
    }

    public static void b(byte param0) {
        int var1 = 22 % ((param0 - 19) / 35);
        field_d = null;
        field_e = null;
    }

    final static int a(byte param0) {
        if (param0 != -35) {
            return 43;
        }
        return gr.field_a;
    }

    final kn a(int param0, byte param1) {
        byte[] var4 = null;
        kn var3 = (kn) (this.field_a.a((long)param0, true));
        if (var3 != null) {
            return var3;
        }
        if (param0 < 32768) {
            var4 = this.field_g.a(param0, 0, 4);
        } else {
            var4 = this.field_c.a(32767 & param0, 0, 4);
        }
        var3 = new kn();
        if (!(var4 == null)) {
            var3.a(new wq(var4), -29539);
        }
        if (!(-32769 < (param0 ^ -1))) {
            var3.c((byte) -124);
        }
        int var5 = -120 % ((param1 - 22) / 49);
        this.field_a.a(72, var3, (long)param0);
        return var3;
    }

    final static void a(mf param0, mf param1, mf param2, int param3, mf param4) {
        jp discarded$4 = null;
        jp discarded$5 = null;
        int discarded$6 = 0;
        jp dupTemp$7 = null;
        RuntimeException var5 = null;
        byte[] var5_array = null;
        int var7_int = 0;
        jp[] var7 = null;
        Object var8 = null;
        Object var9 = null;
        int var10_int = 0;
        jp var10 = null;
        jp var11_ref_jp = null;
        int var11 = 0;
        int var12 = 0;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        tp[] var16 = null;
        byte[] var17 = null;
        tp[] var18 = null;
        jp var19 = null;
        jp var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            lf.field_t = uo.a((byte) 29, param0, "splash", "basic");
            er.field_b = pl.a("basic", "lobby_game_logo", (byte) 110, param0);
            var21 = param2.a(-86, "basic", "gamefont");
            var15 = var21;
            var13 = var15;
            var5_array = var13;
            var16 = wq.a("basic", param0, "gamefont", param3 + -946744493);
            sn.a(param3 ^ 29068, var21, 1);
            ma.field_O = fc.a(0, var21, 0, var16, 0, 1);
            ma.field_O.field_M = bg.field_n;
            nn.field_g = fc.a(2, var21, 0, var16, 0, 1);
            nn.field_g.field_M = bg.field_n;
            var22 = param4.a(86, "kartika13", "");
            var17 = var22;
            var14 = var17;
            var5_array = var14;
            var18 = wq.a("kartika13", param1, "", -946715356);
            ob.field_D = fc.a(0, var22, 0, var18, 0, 1);
            ob.field_D.field_M = bg.field_n;
            ce.field_e = fc.a(1, var22, 0, var18, 0, 1);
            ce.field_e.field_M = bg.field_n;
            gj.field_c = bd.a("basic", "menu_overlays", param0, (byte) -8);
            var7_int = 0;
            L1: while (true) {
              if (gj.field_c.length <= var7_int) {
                cd.field_h = kf.a("frame", "basic", param0, -122);
                t.field_d = kf.a("frame_track", "basic", param0, -128);
                t.field_d[4] = null;
                var7 = cd.field_h;
                var7[4] = null;
                discarded$4 = pl.a("basic", "frame_bracket", (byte) 106, param0);
                af.field_A = kf.a("button_frame", "basic", param0, -91);
                vn.field_G = kf.a("button_raised", "basic", param0, 103);
                pe.field_k = kf.a("button_depressed", "basic", param0, -104);
                si.field_c = wq.a("basic", param0, "achievements_large", -946715356);
                vq.field_F = pl.a("basic", "unachieved", (byte) 97, param1);
                pg.field_p = pl.a("basic", "orbcoin", (byte) 122, param1);
                discarded$5 = pl.a("basic", "locked", (byte) -45, param1);
                nj.field_z = new jp(32, 32);
                nj.field_z.g();
                pg.field_p.c(0, 0, 32, 32);
                kc.field_q.a((byte) 91);
                pg.field_p = null;
                var19 = new jp(vq.field_F.field_x / 4, vq.field_F.field_z / 4);
                var19.g();
                vq.field_F.e(0, 0);
                kc.field_q.a((byte) 113);
                bf.field_L = p.a(-12, var19, 8, 9838226);
                qh.field_c = p.a(-12, var19, 12, 9838226);
                var8 = null;
                e.field_l = new jp[si.field_c.length];
                pa.field_h = new jp[si.field_c.length];
                var20 = new jp(vq.field_F.field_x / 4, vq.field_F.field_z / 4);
                var10_int = 0;
                L2: while (true) {
                  if (var10_int >= si.field_c.length) {
                    no.field_t = new jp[lo.field_c.length][];
                    var9 = null;
                    var10_int = 0;
                    L3: while (true) {
                      if (lo.field_c.length <= var10_int) {
                        re.field_k = pl.a("basic", "ball", (byte) 121, param0);
                        vn.field_D = pl.a("basic", "steelball", (byte) 98, param0);
                        h.field_C = wq.a("basic", param0, "brickset", -946715356);
                        dg.field_b = cr.a("basic", param0, "paddlecaps", param3 + -29135);
                        qg.field_D = cr.a("basic", param0, "paddleseg", 2);
                        dk.field_R = pl.a("basic", "paddlecentre", (byte) 100, param0);
                        gg.field_p = cr.a("basic", param0, "powerup", 2);
                        ol.field_r = pl.a("basic", "powerupbar", (byte) 104, param0);
                        ch.field_l = pl.a("basic", "heart", (byte) -108, param0);
                        kb.field_Ub = cr.a("basic", param0, "characters_fm", 2);
                        im.field_a = cr.a("basic", param0, "lever_game", param3 + -29135);
                        nm.field_f = cr.a("basic", param0, "eyes_game", 2);
                        tf.field_g = cr.a("basic", param0, "track_heads", 2);
                        ef.field_e = cr.a("basic", param0, "characters_small", 2);
                        ul.field_k = cr.a("basic", param0, "character_heads", param3 ^ 29139);
                        cn.field_e = cr.a("basic", param0, "lever_small", 2);
                        ul.field_r = cr.a("basic", param0, "lever_small_choc", 2);
                        lp.field_yb = cr.a("basic", param0, "lever_small_space", param3 ^ 29139);
                        qi.field_K = kf.a("frame_bubble", "basic", param0, -105);
                        ap.field_a = pl.a("basic", "frame_bubble_point", (byte) -120, param0);
                        ln.field_j = bd.a("basic", "rosette_sml", param0, (byte) -8);
                        hp.field_l = bd.a("basic", "rosette_lrg", param0, (byte) -8);
                        me.field_a = wq.a("basic", param0, "podium2", -946715356);
                        pl.field_f = wq.a("basic", param0, "podium3", param3 ^ -946719499);
                        cl.field_r = cr.a("basic", param0, "podium_happy", 2);
                        e.field_q = cr.a("basic", param0, "podium_sad", param3 ^ 29139);
                        qh.field_e = um.a("basic", "congratulations", 1593955777, param0);
                        pa.field_m = new jp[h.field_C.length];
                        var10_int = 0;
                        L4: while (true) {
                          if (var10_int >= pa.field_m.length) {
                            pa.field_m[24].g();
                            lb.a(0, 0, lb.field_c, lb.field_d);
                            mf.field_a = new jp[pa.field_m.length];
                            var10_int = 0;
                            L5: while (true) {
                              if (var10_int >= pa.field_m.length) {
                                kp.field_e = new jp[dg.field_b.length];
                                var10_int = 0;
                                L6: while (true) {
                                  if (dg.field_b.length <= var10_int) {
                                    ol.field_z = new jp[qg.field_D.length];
                                    var10_int = 0;
                                    L7: while (true) {
                                      if (qg.field_D.length <= var10_int) {
                                        L8: {
                                          ep.field_j = new jp(dk.field_R.field_x / 2, dk.field_R.field_z / 2);
                                          ep.field_j.g();
                                          dk.field_R.a(0, 0);
                                          p.field_i = new jp(re.field_k.field_x / 2, re.field_k.field_z / 2);
                                          p.field_i.g();
                                          re.field_k.a(0, 0);
                                          mh.field_ib = new jp(vn.field_D.field_x / 2, vn.field_D.field_z / 2);
                                          mh.field_ib.g();
                                          vn.field_D.a(0, 0);
                                          ch.field_k = new jp[gg.field_p.length];
                                          if (param3 == 29137) {
                                            break L8;
                                          } else {
                                            discarded$6 = so.a((byte) -25);
                                            break L8;
                                          }
                                        }
                                        var10_int = 0;
                                        L9: while (true) {
                                          if (ch.field_k.length <= var10_int) {
                                            kc.field_q.a((byte) 79);
                                            var10_int = 0;
                                            L10: while (true) {
                                              if (var10_int >= ln.field_j.length) {
                                                var10_int = 0;
                                                L11: while (true) {
                                                  if (hp.field_l.length <= var10_int) {
                                                    um.field_p = pl.a("basic", "character_menu", (byte) -62, param0);
                                                    pa.field_j = pl.a("basic", "character_menu_eyes", (byte) -120, param0);
                                                    gr.field_d = cr.a("basic", param0, "lever_menu", 2);
                                                    nl.field_b = um.a("basic", "logo", 1593955777, param0);
                                                    g.field_l = cr.a("basic", param0, "sliders", 2);
                                                    mp.field_Vb = cr.a("basic", param0, "arrow_level", param3 ^ 29139);
                                                    pa.field_l = new jp[mp.field_Vb.length];
                                                    var10_int = 0;
                                                    L12: while (true) {
                                                      if (mp.field_Vb.length <= var10_int) {
                                                        un.field_e = new tp[7];
                                                        un.field_e[0] = uo.a((byte) 29, param0, "p1_key_right", "basic");
                                                        un.field_e[1] = uo.a((byte) 29, param0, "p1_key_left", "basic");
                                                        un.field_e[2] = uo.a((byte) 29, param0, "p1_key_launch", "basic");
                                                        un.field_e[3] = uo.a((byte) 29, param0, "p2_key_right", "basic");
                                                        un.field_e[4] = uo.a((byte) 29, param0, "p2_key_left", "basic");
                                                        un.field_e[5] = uo.a((byte) 29, param0, "p2_key_launch", "basic");
                                                        un.field_e[6] = uo.a((byte) 29, param0, "key_enter", "basic");
                                                        nd.field_f = new int[58];
                                                        var10_int = 0;
                                                        L13: while (true) {
                                                          if (nd.field_f.length <= var10_int) {
                                                            jk.field_u = lg.a(2, mo.field_N, -1);
                                                            v.field_b = lg.a(2, ci.field_s.toUpperCase(), -1);
                                                            ed.field_b = new jp[3];
                                                            var10_int = 0;
                                                            L14: while (true) {
                                                              if (var10_int >= ed.field_b.length) {
                                                                rn.field_a = new jp[tf.field_g.length];
                                                                var10_int = 0;
                                                                L15: while (true) {
                                                                  if (rn.field_a.length <= var10_int) {
                                                                    lk.field_n = new jp[tf.field_g.length];
                                                                    var10_int = 0;
                                                                    L16: while (true) {
                                                                      if (var10_int >= lk.field_n.length) {
                                                                        rk.field_Sb = ap.field_a.e();
                                                                        rk.field_Sb.b();
                                                                        dg.field_e = pl.a("basic", "shutter", (byte) 110, param0);
                                                                        cq.field_o = new jp(dg.field_e.field_x / 2, dg.field_e.field_z / 2);
                                                                        cq.field_o.g();
                                                                        dg.field_e.a(0, 0);
                                                                        kc.field_q.a((byte) 118);
                                                                        var10 = pl.a("basic", "flame", (byte) 107, param0);
                                                                        hc.field_a = new jp[2][4];
                                                                        ip.field_v = new jp[2][4];
                                                                        var11 = 0;
                                                                        L17: while (true) {
                                                                          if ((var11 ^ -1) <= -5) {
                                                                            kc.field_q.a((byte) 127);
                                                                            hq.field_s = bd.a("basic", "expansion_icons", param0, (byte) -8);
                                                                            da.field_E = new jp[hq.field_s.length];
                                                                            var11 = 0;
                                                                            L18: while (true) {
                                                                              if (var11 >= hq.field_s.length) {
                                                                                cm.field_r = new jp[hq.field_s.length];
                                                                                var11 = 0;
                                                                                L19: while (true) {
                                                                                  if (hq.field_s.length <= var11) {
                                                                                    ik.field_f = new jp[hq.field_s.length];
                                                                                    var11 = 0;
                                                                                    L20: while (true) {
                                                                                      if (var11 >= hq.field_s.length) {
                                                                                        break L0;
                                                                                      } else {
                                                                                        ik.field_f[var11] = p.a(pn.a(param3, -29147), da.field_E[var11], 14, 16777215);
                                                                                        var11++;
                                                                                        continue L20;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    cm.field_r[var11] = pg.a(da.field_E[var11], 20, -17912);
                                                                                    var11++;
                                                                                    continue L19;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                da.field_E[var11] = new jp(hq.field_s[var11].field_x / 2, hq.field_s[var11].field_z / 2);
                                                                                fc.a(-59, da.field_E[var11]);
                                                                                hq.field_s[var11].a(0, 0);
                                                                                sc.b(-89);
                                                                                var11++;
                                                                                continue L18;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            ip.field_v[0][var11] = new jp(var10.field_x - var11, var10.field_z);
                                                                            ip.field_v[0][var11].g();
                                                                            var10.a(0, 0, -var11 + var10.field_x, var10.field_z);
                                                                            ip.field_v[1][var11] = ip.field_v[0][var11].c();
                                                                            hc.field_a[0][var11] = new jp(ip.field_v[0][var11].field_x / 2, ip.field_v[0][var11].field_z / 2);
                                                                            hc.field_a[0][var11].g();
                                                                            var10.a(0, 0, ip.field_v[0][var11].field_x / 2, ip.field_v[0][var11].field_z / 2);
                                                                            hc.field_a[1][var11] = hc.field_a[0][var11].c();
                                                                            var11++;
                                                                            continue L17;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        lk.field_n[var10_int] = pg.a(tf.field_g[var10_int], 20, pn.a(param3, -13351));
                                                                        var10_int++;
                                                                        continue L16;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    rn.field_a[var10_int] = p.a(pn.a(param3, -29147), tf.field_g[var10_int], 14, 16755200);
                                                                    var10_int++;
                                                                    continue L15;
                                                                  }
                                                                }
                                                              } else {
                                                                ed.field_b[var10_int] = fp.a(2, 2, Integer.toString(-var10_int + 3), true);
                                                                var10_int++;
                                                                continue L14;
                                                              }
                                                            }
                                                          } else {
                                                            nd.field_f[var10_int] = 14;
                                                            var10_int++;
                                                            continue L13;
                                                          }
                                                        }
                                                      } else {
                                                        dupTemp$7 = mp.field_Vb[var10_int].e();
                                                        pa.field_l[var10_int] = dupTemp$7;
                                                        var11_ref_jp = dupTemp$7;
                                                        var11_ref_jp.b();
                                                        var10_int++;
                                                        continue L12;
                                                      }
                                                    }
                                                  } else {
                                                    hp.field_l[var10_int].d();
                                                    var10_int++;
                                                    continue L11;
                                                  }
                                                }
                                              } else {
                                                ln.field_j[var10_int].d();
                                                var10_int++;
                                                continue L10;
                                              }
                                            }
                                          } else {
                                            ch.field_k[var10_int] = new jp(gg.field_p[var10_int].field_x / 2, gg.field_p[var10_int].field_z / 2);
                                            ch.field_k[var10_int].g();
                                            gg.field_p[var10_int].a(0, 0);
                                            var10_int++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        ol.field_z[var10_int] = new jp(qg.field_D[var10_int].field_x / 2, qg.field_D[var10_int].field_z / 2);
                                        ol.field_z[var10_int].g();
                                        qg.field_D[var10_int].a(0, 0);
                                        var10_int++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    kp.field_e[var10_int] = new jp(dg.field_b[var10_int].field_x / 2, dg.field_b[var10_int].field_z / 2);
                                    kp.field_e[var10_int].g();
                                    dg.field_b[var10_int].a(0, 0);
                                    var10_int++;
                                    continue L6;
                                  }
                                }
                              } else {
                                mf.field_a[var10_int] = new jp(pa.field_m[var10_int].field_x / 2, pa.field_m[var10_int].field_z / 2);
                                mf.field_a[var10_int].g();
                                pa.field_m[var10_int % 29].a(0, 0);
                                var10_int++;
                                continue L5;
                              }
                            }
                          } else {
                            pa.field_m[var10_int] = h.field_C[var10_int].a();
                            var10_int++;
                            continue L4;
                          }
                        }
                      } else {
                        no.field_t[var10_int] = cr.a("basic", param0, lo.field_c[var10_int], 2);
                        var10_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var20.g();
                    lb.d();
                    si.field_c[var10_int].c(0, 0);
                    kc.field_q.a((byte) 101);
                    e.field_l[var10_int] = p.a(-12, var20, 8, 9838226);
                    pa.field_h[var10_int] = p.a(pn.a(param3, -29147), var20, 12, 9838226);
                    var10_int++;
                    continue L2;
                  }
                }
              } else {
                L21: {
                  L22: {
                    gj.field_c[var7_int] = qg.a(gj.field_c[var7_int], 1);
                    if (-1 == (gj.field_c[var7_int].field_D ^ -1)) {
                      break L22;
                    } else {
                      if (gj.field_c[var7_int].field_C == 0) {
                        break L22;
                      } else {
                        break L21;
                      }
                    }
                  }
                  gj.field_c[var7_int] = null;
                  break L21;
                }
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var5 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) (var5);
            stackOut_65_1 = new StringBuilder().append("so.D(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L23;
            } else {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L23;
            }
          }
          L24: {
            stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L24;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L24;
            }
          }
          L25: {
            stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param2 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L25;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L25;
            }
          }
          L26: {
            stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param3).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param4 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L26;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L26;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ')');
        }
    }

    so(int param0, mf param1, mf param2) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        this.field_a = new to(64);
        try {
          L0: {
            L1: {
              this.field_c = param2;
              this.field_g = param1;
              if (this.field_g == null) {
                break L1;
              } else {
                discarded$4 = this.field_g.c(-123, 0);
                break L1;
              }
            }
            L2: {
              if (this.field_c == null) {
                break L2;
              } else {
                discarded$5 = this.field_c.c(-113, 0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("so.<init>(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_e = "Rating";
        field_f = null;
    }
}
