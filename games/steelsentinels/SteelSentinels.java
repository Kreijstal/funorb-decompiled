/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class SteelSentinels extends FunOrbClient {
    static String field_H;
    static String field_I;
    static SceneWidget field_J;
    public static int obfuscationControl;

    final void a(byte param0) {
        int stackIn_134_0 = 0;
        boolean stackIn_135_1 = false;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas var2 = null;
        RuntimeException var2_ref = null;
        SceneWidget var3 = null;
        ai var3_ref = null;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        CombatWorld var6_ref_ee = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Sentinel var9 = null;
        ParticleEffect var9_ref = null;
        Projectile var9_ref2 = null;
        Sentinel var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5_intLifetime1;
        int var5_intLifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        var13 = obfuscationControl;
        try {
          var2 = gl.a(false);
          if (ol.j(0)) {
            df.a(-111, var2, ParticleEffect.g(2));
            return;
          }
          if (!SceneWidget.field_pb) {
            en.a(var2, -28003);
            return;
          }
          if (!co.a(false)) {
            mc.a(qj.field_i, 100.0f, -21801);
            en.a(var2, -28003);
            return;
          }
          boolean decompiledFrameRemainder1 = true;
          this.n(53);
          if (pm.field_T != vb.field_g) {
            if (pm.field_T != 0) {
              if (vb.field_g == 0) {
                an.a(pm.field_T, pc.field_w, false, 125);
                an.a(vb.field_g, pc.field_w, false, -40);
                decompiledFrameRemainder1 = (var13 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (pm.field_U >= 10) {
                  an.a(vb.field_g, Sprite.field_k, false, 86);
                  if (var13 != 0) {
                    an.a(pm.field_T, pc.field_w, false, -110);
                    an.a(vb.field_g, pc.field_w, false, -62);
                    an.a(pm.field_T, pc.field_w, false, -34);
                    an.a(pm.field_T, pc.field_w, true, -15);
                  }
                } else {
                  an.a(pm.field_T, pc.field_w, false, -110);
                  if (var13 != 0) {
                    an.a(vb.field_g, pc.field_w, false, -62);
                    an.a(pm.field_T, pc.field_w, false, -34);
                    an.a(pm.field_T, pc.field_w, true, -15);
                  }
                }
              }
            } else {
              an.a(vb.field_g, pc.field_w, false, -62);
              an.a(pm.field_T, pc.field_w, false, -34);
              if (var13 != 0) {
                an.a(pm.field_T, pc.field_w, true, -15);
              }
            }
          } else {
            an.a(pm.field_T, pc.field_w, true, -15);
          }
          if (!pc.field_w ||
            !Sprite.field_k) {
            boolean decompiledFrameCompleted0 = true;
            da.a(li.c(8), 25104);
            if (pm.field_T == -2) {
              var3 = hl.a((byte) -66);
              if (var3 != null) {
                regionExit1: {
                  boolean decompiledFrameCompleted1 = true;
                  var4 = var3.field_Rb;
                  var5_int = var3.field_cb;
                  SoftwareRaster.a(var4 + 4, 4 + var5_int + 42, var3.field_Rb - 4 + var3.field_zb, var3.field_cb + (-4 + var3.field_Lb));
                  if (null == ih.field_s ||
                    fc.field_e[101]) {
                    di.field_g = -1;
                    ih.field_s = new CombatWorld(-1, 1, new String[]{}, new int[][]{null}, false, 0, 0, 2, false, false);
                    ih.field_s.computerPlayerCount = 2;
                    if (var13 == 0) {
                      break regionExit1;
                    }
                  }
                  var6_ref_ee = ih.field_s;
                  var7 = var4 - 2;
                  if (var6_ref_ee.sentinels.size((byte) -128) < 2) {
                    var9_int = -100000;
                    var10 = new Sentinel(0, var9_int, var6_ref_ee);
                    var11 = 0;
                    if (var6_ref_ee.sentinels.first(13058) != null) {
                      var11 = -((Sentinel) (var6_ref_ee.sentinels.first(13058))).teamId + 1;
                    }
                    var12 = ua.field_v;
                    if (0.5 > Math.random()) {
                      var12 = ua.field_x;
                    }
                    if (0.3 > Math.random()) {
                      var12 = ua.field_P;
                    }
                    if (0.1 > Math.random()) {
                      var12 = ua.field_N;
                    }
                    if (0.1 > Math.random()) {
                      var12 = ua.field_O;
                    }
                    var10.configureDesign(var12, true, false, -1, var11);
                    var10.field_Nb = 10;
                    var10.d(-28033);
                    var10.velocityY = 1000;
                    var10.field_Qb = 250;
                    var10.j(-5);
                    var6_ref_ee.sentinels.addLast(3, var10);
                  }
                  var8 = 310;
                  var9 = (Sentinel) (var6_ref_ee.sentinels.first(13058));
                  while (null != var9) {
                    var9.a((byte) -22, var7, oh.field_f, pi.field_c, var8);
                    var9 = (Sentinel) (var6_ref_ee.sentinels.next((byte) -119));
                    if (var13 != 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                  }
                  if (decompiledFrameCompleted1) {
                    var9_ref = (ParticleEffect) (var6_ref_ee.particles.first(13058));
                    while (true) {
                      if (null != var9_ref) {
                        var9_ref.drawParticle(var7, var8, true, (byte) -89);
                        var9_ref = (ParticleEffect) (var6_ref_ee.particles.next((byte) -112));
                        if (var13 == 0) {
                          continue;
                        }
                      } else {
                        var9_ref2 = (Projectile) (var6_ref_ee.field_db.first(13058));
                        while (null != var9_ref2) {
                          var9_ref2.a(var8, var7, 4);
                          var9_ref2 = (Projectile) (var6_ref_ee.field_db.next((byte) -39));
                          if (var13 != 0) {
                            break regionExit1;
                          }
                        }
                        var9_ref = (ParticleEffect) (var6_ref_ee.particles.first(13058));
                      }
                      break;
                    }
                    while (var9_ref != null) {
                      var9_ref.drawParticle(var7, var8, false, (byte) 31);
                      var9_ref = (ParticleEffect) (var6_ref_ee.particles.next((byte) -82));
                      if (var13 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                    }
                  }
                }
                if (decompiledFrameCompleted0) {
                  SoftwareRaster.c();
                }
              }
            }
            if (decompiledFrameCompleted0) {
              r.a(false, li.c(8));
            }
            ci.a(li.c(8), (byte) -62);
          }
          var3_ref = (ai) (bd.field_b.first(13058));
          if (var3_ref != null) {
            var4Lifetime1 = 6;
            var5_intLifetime1 = 250;
            var6 = var4Lifetime1 * 2 + 64;
            var7Lifetime1 = 0;
            if (ob.field_o < var6) {
              var7Lifetime1 = var7Lifetime1 + (ob.field_o - var6);
            }
            var8Lifetime1 = -var5_intLifetime1 + 640;
            if ((500 - var6) < ob.field_o) {
              var7Lifetime1 = var7Lifetime1 + (500 + (-ob.field_o - var6));
            }
            SoftwareRaster.c(var8Lifetime1, var7Lifetime1, var5_intLifetime1, var6, 0, 192);
            SoftwareRaster.h(var8Lifetime1, var7Lifetime1, var5_intLifetime1, var6, 39398, 192);
            if (var3_ref.field_q == null) {
              ff.field_lb.a(var3_ref.field_u, var8Lifetime1 + var4Lifetime1, var7Lifetime1 + var4Lifetime1, -(2 * var4Lifetime1) + var5_intLifetime1, -(2 * var4Lifetime1) + var6, 52479, -1, 0, 1, 12);
              if (var13 != 0) {
                var3_ref.field_q.c(var8Lifetime1 + var4Lifetime1, var7Lifetime1 + var4Lifetime1, 64, 64);
                ff.field_lb.a(var3_ref.field_u, var4Lifetime1 * 2 + var8Lifetime1 + 64, var7Lifetime1 + var4Lifetime1, -64 + (var5_intLifetime1 - var4Lifetime1 * 3), var6 - var4Lifetime1 * 2, 52479, -1, 0, 1, 12);
              }
            } else {
              var3_ref.field_q.c(var8Lifetime1 + var4Lifetime1, var7Lifetime1 + var4Lifetime1, 64, 64);
              ff.field_lb.a(var3_ref.field_u, var4Lifetime1 * 2 + var8Lifetime1 + 64, var7Lifetime1 + var4Lifetime1, -64 + (var5_intLifetime1 - var4Lifetime1 * 3), var6 - var4Lifetime1 * 2, 52479, -1, 0, 1, 12);
            }
          }
          boolean decompiledFrameRemainder0 = true;
          var4Lifetime2 = 27 / ((param0 - 56) / 48);
          if (mg.b(true)) {
            SoftwareRaster.f(0, 0, SoftwareRaster.field_c, SoftwareRaster.field_j);
            qf.a(100);
            decompiledFrameRemainder0 = (var13 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (!cf.c((byte) 92)) {
              if ((ri.b(-113)) &&
                (!mg.b(true))) {
                SoftwareRaster.f(0, 0, SoftwareRaster.field_c, SoftwareRaster.field_j);
                ec.a((byte) -95);
                if (var13 != 0) {
                  stackIn_134_0 = -64;
                  if (wb.field_c != null) {
                    stackIn_135_1 = true;
                  } else {
                    stackIn_135_1 = kc.field_q;
                  }
                  qa.$cfr$intArgs$a$7ffe4b125357(stackIn_134_0, stackIn_135_1);
                }
              }
            } else {
              stackIn_134_0 = -64;
              if (wb.field_c != null) {
                stackIn_135_1 = true;
              } else {
                stackIn_135_1 = kc.field_q;
              }
              qa.$cfr$intArgs$a$7ffe4b125357(stackIn_134_0, stackIn_135_1);
            }
          }
          if (in.field_i != in.field_h) {
            var5_intLifetime2 = 256 * SentinelDesigner.field_a / 16;
            if (var5_intLifetime2 > 0) {
              SoftwareRaster.c(0, 0, SoftwareRaster.field_c, SoftwareRaster.field_j, 0, var5_intLifetime2);
            }
          }
          if (cb.field_l < ej.field_v) {
            SoftwareRaster.h(2, 2, 102, 15, 6710886, 128);
            SoftwareRaster.a(3, 3, 100, 13, 0);
            SoftwareRaster.a(4, 4, cb.field_l * 33 + 33 * al.field_g / ua.field_r, 11, 39398);
            if (fk.field_d != null) {
              var5 = db.a(ff.field_sb, -98, new String[]{Integer.toString(cb.field_l * 33 + al.field_g * 33 / ua.field_r)});
              fk.field_d.a(var5, 54, 12, 39398, 0);
              SoftwareRaster.a(3, 3, 33 * cb.field_l + al.field_g * 33 / ua.field_r, 17);
              fk.field_d.a(var5, 54, 12, 0, 39398);
              SoftwareRaster.c();
            }
          }
          kg.a(0, 0, 28594, var2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "SteelSentinels.EA(" + param0 + ')');
        }
    }

    private final boolean k(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var6 = 0;
        int stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        RuntimeException decompiledCaughtException = null;
        IndexedSprite[] var2_array = null;
        IndexedSprite[] var3 = null;
        int var3_int = 0;
        RgbSprite[] var3_array = null;
        RgbSprite[][] var3_array2 = null;
        int var4_int = 0;
        RgbSprite[][] var4 = null;
        int var5 = 0;
        var6 = obfuscationControl;
        try {
          ec.a(35);
          if (null != aj.field_x) {
            if (tm.field_d.ensureIndex(true) &&
              tm.field_d.a("basic", (byte) 90)) {
              if (tm.field_d.ensureIndex(true) &&
                tm.field_d.a("roman20", (byte) 90)) {
                if (ej.field_t.ensureIndex(true) &&
                  ej.field_t.a("roman20", (byte) 90)) {
                  if (tm.field_d.ensureIndex(true) &&
                    tm.field_d.a("lobby", (byte) 90)) {
                    if (tm.field_d.ensureIndex(true) &&
                      tm.field_d.a("basicfont12", (byte) 90)) {
                      if (ej.field_t.ensureIndex(true) &&
                        ej.field_t.a("basicfont12", (byte) 90)) {
                        if (ej.field_t.ensureIndex(true) &&
                          ej.field_t.a("lobby", (byte) 90)) {
                          if (aj.field_x.ensureIndex(true) &&
                            aj.field_x.a(param0 ^ -43)) {
                            if (dh.field_z.ensureIndex(true) &&
                              dh.field_z.a(param0 ^ -43)) {
                              qi.field_l = false;
                              if (ti.field_t.ensureIndex(true) &&
                                ti.field_t.a(25)) {
                                if (rc.field_i.ensureIndex(true) &&
                                  rc.field_i.a(param0 + 77)) {
                                  if (g.field_i.ensureIndex(true) &&
                                    g.field_i.a(25)) {
                                    if (DualNode.field_x.ensureIndex(true) &&
                                      DualNode.field_x.a("basic", (byte) 90)) {
                                      if (im.field_h.ensureIndex(true) &&
                                        im.field_h.a(25)) {
                                        if (oh.field_a.ensureIndex(true) &&
                                          oh.field_a.a("basic", (byte) 90)) {
                                          if (IsaacRandom.field_k.ensureIndex(true) &&
                                            IsaacRandom.field_k.a(25)) {
                                            if (rj.field_k.ensureIndex(true) &&
                                              rj.field_k.a(param0 + 77)) {
                                              en.a(-59);
                                              mc.a(ResourceArchive.field_n, 82.0f, param0 ^ 21787);
                                              this.a((byte) 111);
                                              he.field_e = new ub(aj.field_x, dh.field_z);
                                              aj.field_x = null;
                                              cc.j(0);
                                              return false;
                                            }
                                            mc.a(ka.a((byte) -128, qj.field_i, sl.field_l, rj.field_k), 90.0f, -21801);
                                            return false;
                                          }
                                          mc.a(ci.a(IsaacRandom.field_k, (byte) 94, "", qj.field_i, sl.field_l), 85.0f, -21801);
                                          return false;
                                        }
                                        mc.a(ci.a(oh.field_a, (byte) 108, "basic", kb.field_c, og.field_c), 80.0f, -21801);
                                        return false;
                                      }
                                      mc.a(ka.a((byte) -78, en.field_f, ai.field_t, im.field_h), 75.0f, -21801);
                                      return false;
                                    }
                                    mc.a(ci.a(DualNode.field_x, (byte) 94, "basic", en.field_f, ai.field_t), 70.0f, -21801);
                                    return false;
                                  }
                                  mc.a(ci.a(g.field_i, (byte) 101, "", tf.field_f, nj.field_P), 60.0f, -21801);
                                  return false;
                                }
                                mc.a(ka.a((byte) -103, tf.field_f, nj.field_P, rc.field_i), 45.0f, -21801);
                                return false;
                              }
                              mc.a(ci.a(ti.field_t, (byte) 99, "", rn.field_t, ue.field_a), 42.0f, -21801);
                              return false;
                            }
                            mc.a(ci.a(dh.field_z, (byte) 127, "", rn.field_t, ue.field_a), 40.0f, -21801);
                            return false;
                          }
                          mc.a(ci.a(aj.field_x, (byte) 122, "", rn.field_t, ue.field_a), 20.0f, param0 - 21749);
                          return false;
                        }
                        mc.a(ci.a(ej.field_t, (byte) 116, "lobby", kb.field_c, og.field_c), 17.0f, param0 - 21749);
                        return false;
                      }
                      mc.a(ci.a(ej.field_t, (byte) 97, "basicfont12", kb.field_c, og.field_c), 15.0f, param0 - 21749);
                      return false;
                    }
                    mc.a(ci.a(tm.field_d, (byte) 120, "basicfont12", en.field_f, ai.field_t), 14.0f, -21801);
                    return false;
                  }
                  mc.a(ci.a(tm.field_d, (byte) 104, "lobby", en.field_f, ai.field_t), 13.0f, param0 - 21749);
                  return false;
                }
                mc.a(ci.a(ej.field_t, (byte) 111, "roman20", kb.field_c, og.field_c), 12.0f, -21801);
                return false;
              }
              mc.a(ci.a(tm.field_d, (byte) 116, "roman20", en.field_f, ai.field_t), 11.0f, param0 ^ 21787);
              return false;
            }
            mc.a(ci.a(tm.field_d, (byte) 116, "basic", en.field_f, ai.field_t), 10.0f, -21801);
            return false;
          }
          if (ti.field_t != null) {
            mc.a(ResourceArchive.field_n, 85.0f, -21801);
            this.a((byte) -116);
            qj.field_q[71] = uk.a(ti.field_t, "default", "deploying_in").a();
            qj.field_q[72] = uk.a(ti.field_t, "default", "five").a();
            qj.field_q[73] = uk.a(ti.field_t, "default", "four").a();
            qj.field_q[74] = uk.a(ti.field_t, "default", "three").a();
            qj.field_q[75] = uk.a(ti.field_t, "default", "two").a();
            qj.field_q[76] = uk.a(ti.field_t, "default", "one").a();
            qj.field_q[77] = uk.a(ti.field_t, "default", "chassis_upgrade_available").a();
            qj.field_q[78] = uk.a(ti.field_t, "default", "armour_level_critical").a();
            qj.field_q[79] = uk.a(ti.field_t, "default", "target_acquired").a();
            qj.field_q[80] = uk.a(ti.field_t, "default", "target_lock_failed").a();
            qj.field_q[81] = uk.a(ti.field_t, "default", "warning").a();
            qj.field_q[82] = uk.a(ti.field_t, "default", "energy_low").a();
            qj.field_q[83] = uk.a(ti.field_t, "default", "shield_depleted").a();
            ti.field_t = null;
            cc.j(0);
            return false;
          }
          if (g.field_i != null) {
            mc.a(ba.field_a, 88.0f, -21801);
            this.a((byte) 104);
            me.field_f = tg.a(g.field_i, "", "md_title_music");
            l.field_i = tg.a(g.field_i, "", "war_zone");
            gb.field_e = tg.a(g.field_i, "", "lost_world");
            CipherPacketBuffer.field_z = tg.a(g.field_i, "", "cityscape");
            ue.field_e = tg.a(g.field_i, "", "thats_no_moon");
            db.field_a = tg.a(g.field_i, "", "star_fleet");
            q.field_f.a(0, me.field_f, 21687, he.field_e, rc.field_i);
            q.field_f.a(0, l.field_i, 21687, he.field_e, rc.field_i);
            q.field_f.a(0, gb.field_e, 21687, he.field_e, rc.field_i);
            q.field_f.a(0, CipherPacketBuffer.field_z, 21687, he.field_e, rc.field_i);
            q.field_f.a(0, ue.field_e, param0 + 21739, he.field_e, rc.field_i);
            q.field_f.a(0, db.field_a, 21687, he.field_e, rc.field_i);
            q.field_f.a((byte) 25);
            g.field_i = null;
            rc.field_i = null;
            cc.j(0);
            return false;
          }
          if (oh.field_a == null) {
            if (null != IsaacRandom.field_k) {
              hj.a((byte) 106, new m(IsaacRandom.field_k.a("huffman", -742, "")));
              IsaacRandom.field_k = null;
              cc.j(0);
              return false;
            }
            BattleTerrain.a(false);
            gf.a(0);
            var2_int = 0;
            do {
              if (23 <= var2_int) {
                pm.field_T = 0;
                vb.field_g = 0;
                vg.a(50, (byte) -127);
                jn.a(true, (byte) 92, 200, me.field_f);
                break;
              }
              i.field_e[var2_int] = new SentinelDesigner(var2_int);
              var2_int++;
            } while (var6 == 0);
            if (!ni.b(118)) {
              al.field_i = fg.a(4, param0 + 20051);
            }
            cc.j(0);
            if (param0 != -52) {
              this.b(-1, true);
            }
            return true;
          }
          mc.a(ArchiveIndex.field_i, 90.0f, param0 - 21749);
          this.a((byte) 109);
          var2_array = cj.a(-126, "basic", DualNode.field_x, "ranks");
          va.field_j = vd.a(ej.field_t, "roman20", tm.field_d, param0 + 51, "");
          dm.field_f = be.a(DualNode.field_x, oh.field_a, (byte) -102, "biting30", "basic");
          dk.field_h = vd.a(oh.field_a, "basic", DualNode.field_x, param0 ^ 51, "smallfont");
          fk.field_d = vd.a(oh.field_a, "basic", DualNode.field_x, -1, "tinyfont");
          ff.field_lb = vd.a(ej.field_t, "basicfont12", tm.field_d, param0 + 51, "");
          pl.field_U = be.a(DualNode.field_x, oh.field_a, (byte) -93, "bitingfont", "basic");
          ui.field_U = be.a(DualNode.field_x, oh.field_a, (byte) -84, "bitinghalf", "basic");
          ql.field_Tb = dd.a(DualNode.field_x, oh.field_a, true, "basic", "menutitlefont");
          cf.a("menu_overlays", "basic", (byte) -87, DualNode.field_x);
          wd.field_a = GameplayController.a(DualNode.field_x, (byte) 42, "frame", "basic");
          km.field_e = GameplayController.a(DualNode.field_x, (byte) -119, "frame_filled", "basic");
          ag.field_o = GameplayController.a(DualNode.field_x, (byte) -60, "button_frame", "basic");
          vk.field_l = GameplayController.a(DualNode.field_x, (byte) -122, "button_raised", "basic");
          ja.field_e = GameplayController.a(DualNode.field_x, (byte) 36, "button_depressed", "basic");
          if (ni.b(param0 ^ -44) ||
            !(rd.field_b > 0)) {
            var3 = cj.a(121, "basic", DualNode.field_x, "expansion");
            eh.field_c = new ng((java.applet.Applet) (this), dm.field_e, var3, SentinelDesigner.field_f);
          }
          od.field_c = cf.a("achievements_large", "basic", (byte) -79, DualNode.field_x);
          vg.field_h = cf.a("cursors", "basic", (byte) -54, DualNode.field_x);
          var3_int = 0;
          do {
            if (!(var3_int < vg.field_h.length)) {
              ff.field_tb = rl.a(tm.field_d, "basic", "unachieved", false);
              ug.field_P = rl.a(tm.field_d, "basic", "locked", false);
              d.field_G = rl.a(tm.field_d, "basic", "orbcoin", false);
              g.field_d = new RgbSprite(40, 40);
              g.field_d.d();
              ff.field_tb.c(0, 0, 40, 40);
              sj.field_F = new RgbSprite(40, 40);
              sj.field_F.d();
              ug.field_P.c(0, 0, 40, 40);
              sb.field_bb.b((byte) 126);
              rg.a(false, ff.field_tb);
              rg.a(false, ug.field_P);
              rg.a(false, d.field_G);
              ig.field_o = new RgbSprite[5][];
              wa.a((ResourceArchive) null, 2, DualNode.field_x);
              Sprite.field_m = cf.a("darkblueboxfilled", "basic", (byte) -52, DualNode.field_x);
              be.field_f = cf.a("obviousdarkbluebox", "basic", (byte) -56, DualNode.field_x);
              tk.field_t = cf.a("darkbluebox", "basic", (byte) -54, DualNode.field_x);
              sa.field_e = cf.a("darkerbluebox", "basic", (byte) -30, DualNode.field_x);
              nn.field_a = cf.a("lightbluetabbox", "basic", (byte) -108, DualNode.field_x);
              lj.field_b = cf.a("darkgrayboxfilled", "basic", (byte) -114, DualNode.field_x);
              co.field_d = cf.a("darkgraybox", "basic", (byte) -67, DualNode.field_x);
              pa.field_g = cf.a("sectiontab", "basic", (byte) -99, DualNode.field_x);
              bm.field_Y = cf.a("tabselected", "basic", (byte) -40, DualNode.field_x);
              sb.field_X = cf.a("tabunselected", "basic", (byte) -67, DualNode.field_x);
              oe.field_f = cf.a("tabmouseover", "basic", (byte) -71, DualNode.field_x);
              si.field_E = cf.a("sentinelimages", "basic", (byte) -111, DualNode.field_x);
              tk.field_t[4] = null;
              be.field_f[4] = null;
              pd.field_T = cf.a("greybox", "basic", (byte) -90, DualNode.field_x);
              pd.field_T[4] = null;
              ao.field_y = rl.a(DualNode.field_x, "basic", "dropdown_mark", false);
              ac.field_bb = rl.a(DualNode.field_x, "basic", "button_cover", false);
              break;
            }
            vg.field_h[var3_int].e();
            var3_int++;
          } while (var6 == 0);
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(ac.field_bb.field_E.length > var3_int)))) {
            stackIn_149_0 = ~ac.field_bb.field_E[var3_int];
            stackIn_149_1 = -16777216;
            if (var6 == 0) {
              if (stackIn_149_0 == stackIn_149_1) {
                ac.field_bb.field_E[var3_int] = 0;
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            oa.field_N = rl.a(DualNode.field_x, "basic", "goldstar", false);
            td.field_ec = rl.a(DualNode.field_x, "basic", "silverstar", false);
            rl.a(DualNode.field_x, "basic", "starfrigate", false);
            sb.field_W = rl.a(DualNode.field_x, "basic", "starcruiser", false);
            hb.field_e = sb.field_W.a();
            NodeIterator.field_c = cj.a(27, "basic", DualNode.field_x, "texticons");
            bb.field_X = new int[]{13, 13, 13, 13, 14, 14, 14, 13, 13, 15, 13, 13, 12, 13, 15, 13, 13, 13, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15};
            dk.field_h.a(NodeIterator.field_c, bb.field_X);
            fk.field_d.a(NodeIterator.field_c, bb.field_X);
            pl.field_U.a(NodeIterator.field_c, bb.field_X);
            ff.field_lb.a(NodeIterator.field_c, bb.field_X);
            stackIn_149_0 = param0;
            stackIn_149_1 = -5;
          }
          var3 = cj.a(stackIn_149_0 ^ stackIn_149_1, "basic", DualNode.field_x, "instr_texticons");
          ub.field_a = new IndexedSprite[18];
          pg.field_w = new int[ub.field_a.length];
          var4_int = 0;
          do {
            if (!(var4_int < ub.field_a.length)) {
              ii.a(var3, 0, ub.field_a, 6, 2);
              ub.field_a[17] = ub.field_a[7];
              ah.field_Zb = cf.a("scrolldown", "basic", (byte) -87, DualNode.field_x);
              sj.field_x = cf.a("scrollup", "basic", (byte) -33, DualNode.field_x);
              jn.field_f = cf.a("scrollbar", "basic", (byte) -95, DualNode.field_x);
              qi.field_a = cf.a("scrollvert", "basic", (byte) -104, DualNode.field_x);
              wc.field_k = cf.a("frame_shiny", "basic", (byte) -123, DualNode.field_x);
              ta.field_c = cf.a("frame_shiny_bright", "basic", (byte) -43, DualNode.field_x);
              ResourceArchive.field_b = cf.a("frame_basic_bright", "basic", (byte) -128, DualNode.field_x);
              ng.field_p = cf.a("frame_basic_thin", "basic", (byte) -55, DualNode.field_x);
              vh.field_b = cf.a("frame_basic", "basic", (byte) -127, DualNode.field_x);
              oa.field_U = cf.a("display_frame", "basic", (byte) -35, DualNode.field_x);
              oa.field_U[4] = null;
              bl.field_d = cf.a("config_tut_frame", "basic", (byte) -32, DualNode.field_x);
              bl.field_d[4] = null;
              oa.field_Q = cf.a("popup_frame", "basic", (byte) -94, DualNode.field_x);
              oa.field_Q[4] = null;
              si.field_l = cj.a(125, "basic", DualNode.field_x, "mechbits");
              hb.field_j = cf.a("weaponclasses", "basic", (byte) -107, DualNode.field_x);
              ja.field_d = cj.a(-123, "basic", DualNode.field_x, "batdrone");
              lb.field_Zb = cj.a(param0 ^ 69, "basic", DualNode.field_x, "drones");
              jd.field_qb = cj.a(param0 + 163, "basic", DualNode.field_x, "bits_golem");
              Sentinel.field_nc = cj.a(42, "basic", DualNode.field_x, "bits_bird");
              li.field_z = cj.a(-115, "basic", DualNode.field_x, "bits_slave");
              wi.field_C = cj.a(125, "basic", DualNode.field_x, "bits_babel");
              ne.field_R = cj.a(-128, "basic", DualNode.field_x, "bits_valhalla");
              hk.field_Ec = cj.a(-128, "basic", DualNode.field_x, "bits_orbital");
              ui.field_V = cj.a(61, "basic", DualNode.field_x, "bits_bertha");
              vc.field_b = cj.a(67, "basic", DualNode.field_x, "bits_smasher");
              ng.field_c = cj.a(76, "basic", DualNode.field_x, "bits_scorpion");
              ParticleEffect.field_L = cj.a(-116, "basic", DualNode.field_x, "bits_hurricane");
              cf.field_u = cj.a(param0 - 65, "basic", DualNode.field_x, "bits_commando");
              Sprite.field_b = cj.a(param0 ^ -112, "basic", DualNode.field_x, "bits_turtle");
              ml.field_c = cj.a(param0 + 19, "basic", DualNode.field_x, "droppod");
              ArchiveProvider.field_a = cj.a(param0 ^ -128, "basic", DualNode.field_x, "infantary");
              IsaacRandom.field_d = cj.a(-123, "basic", DualNode.field_x, "modules");
              break;
            }
            pg.field_w[var4_int] = 14;
            var4_int++;
          } while (var6 == 0);
          var3_array = rh.field_v;
          var3_array[0] = rl.a(DualNode.field_x, "basic", "instr_giantrobot", false);
          var3_array[1] = rl.a(DualNode.field_x, "basic", "instr_queue", false);
          var3_array[2] = rl.a(DualNode.field_x, "Basic", "instr_walk", false);
          var3_array[3] = rl.a(DualNode.field_x, "basic", "instr_jump", false);
          var3_array[4] = rl.a(DualNode.field_x, "basic", "instr_thrust", false);
          var3_array[5] = IsaacRandom.field_d[16].toRgbSprite();
          var3_array[6] = rl.a(DualNode.field_x, "basic", "instr_selweapon", false);
          var3_array[7] = rl.a(DualNode.field_x, "basic", "instr_target", false);
          var3_array[8] = rl.a(DualNode.field_x, "basic", "instr_noenergy", false);
          var3_array[9] = IsaacRandom.field_d[32].toRgbSprite();
          var3_array[10] = IsaacRandom.field_d[33].toRgbSprite();
          var3_array[11] = rl.a(DualNode.field_x, "basic", "instr_bigshieldicon", false);
          var3_array[12] = IsaacRandom.field_d[27].toRgbSprite();
          var3_array[13] = rl.a(DualNode.field_x, "basic", "instr_stats", false);
          var3_array[14] = rl.a(DualNode.field_x, "basic", "instr_chassis", false);
          var3_array[15] = rl.a(DualNode.field_x, "basic", "instr_components", false);
          var3_array[16] = rl.a(DualNode.field_x, "basic", "instr_weapons", false);
          var3_array[17] = rl.a(DualNode.field_x, "basic", "instr_modules", false);
          var3_array[18] = rl.a(DualNode.field_x, "basic", "instr_engineer", false);
          var3_array[19] = rl.a(DualNode.field_x, "basic", "instr_coop", false);
          var3_array[20] = rl.a(DualNode.field_x, "basic", "instr_team", false);
          var3_array[25] = rl.a(DualNode.field_x, "basic", "instr_techvalue", false);
          ArchiveProvider.field_b = rl.a(DualNode.field_x, "basic", "logo_menu_chromakey", false);
          ob.field_z = (ek) (dn.a("basic", -63, "main_lower_panel", DualNode.field_x));
          ma.field_eb = (ek) (dn.a("basic", param0 ^ 75, "main_title_panel", DualNode.field_x));
          CachedArchiveProvider.field_j = rl.a(DualNode.field_x, "basic", "menu_mesh", false);
          ic.field_db = rl.a(DualNode.field_x, "basic", "menu_titlebar", false);
          pl.field_T = GameplayController.a(DualNode.field_x, (byte) -62, "menu_button_1", "basic");
          GameplayController.a(DualNode.field_x, (byte) 107, "empty_button", "basic");
          el.field_Ub = rl.a(DualNode.field_x, "basic", "prevbtn", false);
          gm.field_b = rl.a(DualNode.field_x, "basic", "nextbtn", false);
          pf.field_b = rl.a(DualNode.field_x, "basic", "lobby_icon", false);
          vc.field_e = cf.a("statbars", "basic", (byte) -13, DualNode.field_x);
          pd.field_Z = cf.a("tags", "basic", (byte) -50, DualNode.field_x);
          NodeHashTable.field_k = rl.a(DualNode.field_x, "basic", "tagborder", false);
          qg.field_f = cf.a("movekeys", "basic", (byte) -38, DualNode.field_x);
          bc.field_wb = rl.a(DualNode.field_x, "basic", "shiftkey", false);
          da.field_e = cf.a("config_tabs", "basic", (byte) -33, DualNode.field_x);
          aj.field_r[0] = rl.a(DualNode.field_x, "basic", "research_ring", false);
          b.field_q[0] = rl.a(DualNode.field_x, "basic", "research_icon", false);
          bl.field_p = cj.a(param0 - 75, "basic", DualNode.field_x, "powerups");
          gf.field_c = cf.a("headings_bar", "basic", (byte) -26, DualNode.field_x);
          rl.a(DualNode.field_x, "basic", "solarite", false);
          vk.field_q = rl.a(DualNode.field_x, "basic", "mansize", false);
          gj.field_a = rl.a(DualNode.field_x, "basic", "stripeybar", false);
          vk.field_r = rl.a(DualNode.field_x, "basic", "hackbit", false);
          wc.field_d = cf.a("pretty_button_lit", "basic", (byte) -111, DualNode.field_x);
          hk.field_Tb = cf.a("pretty_button_unlit", "basic", (byte) -50, DualNode.field_x);
          eb.field_p = cf.a("menu_border", "basic", (byte) -31, DualNode.field_x);
          lj.field_e = cf.a("bin_icon", "basic", (byte) -14, DualNode.field_x);
          pd.field_Q = cf.a("faces_idle", "basic", (byte) -87, DualNode.field_x);
          bg.field_C = cf.a("faces_talk", "basic", (byte) -97, DualNode.field_x);
          am.field_f = cf.a("tutor_buttons", "basic", (byte) -125, DualNode.field_x);
          b.field_n = cf.a("shields", "basic", (byte) -58, DualNode.field_x);
          vi.field_gb = cf.a("explosion", "basic", (byte) -34, DualNode.field_x);
          var3_array = ec.a((byte) -115, "smoke", DualNode.field_x, "basic");
          cc.field_pc = new ek[var3_array.length];
          var4_int = 0;
          do {
            if (var4_int >= var3_array.length) {
              bm.field_S = cf.a("plasma", "basic", (byte) -98, DualNode.field_x);
              cf.a("dust", "basic", (byte) -81, DualNode.field_x);
              bf.field_Cb = cj.a(-120, "basic", DualNode.field_x, "crowns");
              bc.field_sb = new RgbSprite(32, 32);
              bc.field_sb.d();
              d.field_G.b(0, 0, 32, 32);
              sb.field_bb.b((byte) 125);
              d.field_G = null;
              break;
            }
            cc.field_pc[var4_int] = (ek) (var3_array[var4_int]);
            var4_int++;
          } while (var6 == 0);
          var3_array2 = new RgbSprite[nc.field_m.length][];
          var4 = new RgbSprite[nc.field_m.length][];
          var5 = 0;
          do {
            if (!(nc.field_m.length > var5)) {
              ResourceArchive.a(te.field_c, (byte) 74, tm.field_d, (int[]) null, rj.field_k, var4, true, 4, 3, bb.field_R, var2_array, v.field_b, var3_array2, ej.field_t, kc.field_w, ParticleEffect.field_y, ti.field_u);
              pa.a(tm.field_d, 111, ej.field_t);
              un.a(200, 126);
              oh.field_a = null;
              cc.j(param0 ^ -52);
              break;
            }
            var3_array2[var5] = cf.a(nc.field_m[var5], "basic", (byte) -63, DualNode.field_x);
            var4[var5] = null;
            var5++;
          } while (var6 == 0);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.OA(" + param0 + ')');
        }
    }

    final static RgbSprite[] a(int param0, int param1, byte param2, int param3, int param4) {
        RgbSprite dupTemp$2 = null;
        RgbSprite dupTemp$3 = null;
        RgbSprite[] var5 = null;
        RuntimeException var5_ref = null;
        RgbSprite[] stackIn_2_0 = null;
        RgbSprite[] stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new RgbSprite[9];
          if (param2 != -62) {
            stackIn_2_0 = (RgbSprite[]) null;
            return stackIn_2_0;
          }
          dupTemp$2 = bd.a(param1, param3, 248);
          var5[6] = dupTemp$2;
          var5[3] = dupTemp$2;
          var5[2] = dupTemp$2;
          var5[1] = dupTemp$2;
          var5[0] = dupTemp$2;
          dupTemp$3 = bd.a(param4, param3, 248);
          var5[8] = dupTemp$3;
          var5[7] = dupTemp$3;
          var5[5] = dupTemp$3;
          if (param0 != 0) {
            var5[4] = bd.a(param0, 64, 248);
          }
          stackIn_8_0 = var5;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5_ref), "SteelSentinels.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void n(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = obfuscationControl;
        try {
          ej.field_v = 3;
          if (param0 != 53) {
            return;
          }
          if (DualNode.field_x != null) {
            ua.field_r = 13;
            cb.field_l = 0;
            if (!DualNode.field_x.ensureIndex(true)) {
              return;
            }
            boolean decompiledFrameRemainder0 = true;
            if (al.field_g == 0 &&
              DualNode.field_x.a((byte) -38, "lw_midground_01", "basic")) {
              al.field_g = al.field_g + 1;
              ig.field_o[1] = new RgbSprite[4];
              ig.field_o[1][0] = rl.a(DualNode.field_x, "basic", "lw_midground_01", false);
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (1 == al.field_g &&
                DualNode.field_x.a((byte) 113, "lw_midground_02", "basic")) {
                al.field_g = al.field_g + 1;
                ig.field_o[1][1] = rl.a(DualNode.field_x, "basic", "lw_midground_02", false);
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (2 != al.field_g ||
                  !DualNode.field_x.a((byte) -78, "lw_midground_03", "basic")) {
                  if (al.field_g == 3 &&
                    DualNode.field_x.a((byte) 101, "lw_midground_04", "basic")) {
                    al.field_g = al.field_g + 1;
                    ig.field_o[1][3] = rl.a(DualNode.field_x, "basic", "lw_midground_04", false);
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (al.field_g != 4 ||
                      !DualNode.field_x.a((byte) -56, "ct_midground_01", "basic")) {
                      if (al.field_g != 5 ||
                        !DualNode.field_x.a((byte) 102, "ct_midground_02", "basic")) {
                        if (al.field_g != 6 ||
                          !DualNode.field_x.a((byte) -117, "ct_midground_03", "basic")) {
                          if (7 == al.field_g &&
                            DualNode.field_x.a((byte) -57, "ct_midground_04", "basic")) {
                            al.field_g = al.field_g + 1;
                            ig.field_o[2][3] = rl.a(DualNode.field_x, "basic", "ct_midground_04", false);
                            decompiledFrameRemainder0 = (var3 != 0);
                          }
                          if (decompiledFrameRemainder0) {
                            if (al.field_g == 8 &&
                              DualNode.field_x.a((byte) 107, "testsurface", "basic")) {
                              al.field_g = al.field_g + 1;
                              vi.field_R = rl.a(DualNode.field_x, "basic", "testsurface", false);
                              decompiledFrameRemainder0 = (var3 != 0);
                            }
                            if (decompiledFrameRemainder0) {
                              if (al.field_g != 9 ||
                                !DualNode.field_x.a((byte) -63, "wz_texture", "basic")) {
                                if (al.field_g == 10 &&
                                  DualNode.field_x.a((byte) -81, "lw_texture", "basic")) {
                                  al.field_g = al.field_g + 1;
                                  bc.field_rb[1] = rl.a(DualNode.field_x, "basic", "lw_texture", false);
                                  decompiledFrameRemainder0 = (var3 != 0);
                                }
                                if (decompiledFrameRemainder0) {
                                  if (11 == al.field_g &&
                                    DualNode.field_x.a((byte) -113, "ct_texture", "basic")) {
                                    al.field_g = al.field_g + 1;
                                    bc.field_rb[2] = rl.a(DualNode.field_x, "basic", "ct_texture", false);
                                    decompiledFrameRemainder0 = (var3 != 0);
                                  }
                                  if ((decompiledFrameRemainder0) &&
                                    (decompiledFrameRemainder0 = (al.field_g == 12)) &&
                                    (decompiledFrameRemainder0 = !(!DualNode.field_x.a((byte) 127, "mn_texture", "basic")))) {
                                    al.field_g = al.field_g + 1;
                                    bc.field_rb[3] = rl.a(DualNode.field_x, "basic", "mn_texture", false);
                                    decompiledFrameRemainder0 = (var3 != 0);
                                  }
                                }
                              }
                              if (decompiledFrameRemainder0) {
                                al.field_g = al.field_g + 1;
                                bc.field_rb = new RgbSprite[5];
                                bc.field_rb[0] = rl.a(DualNode.field_x, "basic", "wz_texture", false);
                                bc.field_rb[4] = bc.field_rb[0];
                                decompiledFrameRemainder0 = (var3 != 0);
                              }
                            }
                          }
                        }
                        if (decompiledFrameRemainder0) {
                          al.field_g = al.field_g + 1;
                          ig.field_o[2][2] = rl.a(DualNode.field_x, "basic", "ct_midground_03", false);
                          if (var3 != 0) {
                            al.field_g = al.field_g + 1;
                            ig.field_o[2][1] = rl.a(DualNode.field_x, "basic", "ct_midground_02", false);
                            al.field_g = al.field_g + 1;
                            ig.field_o[2] = new RgbSprite[4];
                            ig.field_o[2][0] = rl.a(DualNode.field_x, "basic", "ct_midground_01", false);
                            al.field_g = al.field_g + 1;
                            ig.field_o[1][2] = rl.a(DualNode.field_x, "basic", "lw_midground_03", false);
                          }
                        }
                      } else {
                        al.field_g = al.field_g + 1;
                        ig.field_o[2][1] = rl.a(DualNode.field_x, "basic", "ct_midground_02", false);
                        if (var3 != 0) {
                          al.field_g = al.field_g + 1;
                          ig.field_o[2] = new RgbSprite[4];
                          ig.field_o[2][0] = rl.a(DualNode.field_x, "basic", "ct_midground_01", false);
                          al.field_g = al.field_g + 1;
                          ig.field_o[1][2] = rl.a(DualNode.field_x, "basic", "lw_midground_03", false);
                        }
                      }
                    } else {
                      al.field_g = al.field_g + 1;
                      ig.field_o[2] = new RgbSprite[4];
                      ig.field_o[2][0] = rl.a(DualNode.field_x, "basic", "ct_midground_01", false);
                      if (var3 != 0) {
                        al.field_g = al.field_g + 1;
                        ig.field_o[1][2] = rl.a(DualNode.field_x, "basic", "lw_midground_03", false);
                      }
                    }
                  }
                } else {
                  al.field_g = al.field_g + 1;
                  ig.field_o[1][2] = rl.a(DualNode.field_x, "basic", "lw_midground_03", false);
                }
              }
            }
            if (13 == al.field_g) {
              DualNode.field_x = null;
              cb.field_l = cb.field_l + 1;
              al.field_g = 0;
            }
            return;
          }
          if (cb.field_l == 1 &&
            im.field_h != null) {
            ua.field_r = 23;
            cb.field_l = 1;
            if (!im.field_h.ensureIndex(true)) {
              return;
            }
            if (al.field_g == 0 &&
              im.field_h.a((byte) -91, "wz_background.jpg", "warzone/")) {
              al.field_g = al.field_g + 1;
              return;
            }
            if (al.field_g == 1 &&
              im.field_h.a((byte) -40, "lw_background.jpg", "lostworld/")) {
              al.field_g = al.field_g + 1;
              return;
            }
            if (al.field_g == 2 &&
              im.field_h.a((byte) 126, "ct_background.jpg", "city/")) {
              al.field_g = al.field_g + 1;
              return;
            }
            if (3 == al.field_g &&
              im.field_h.a((byte) -48, "mn_background.jpg", "moon/")) {
              al.field_g = al.field_g + 1;
              return;
            }
            if (al.field_g == 4 &&
              im.field_h.a((byte) 94, "wz_midground_01.png", "warzone/")) {
              al.field_g = al.field_g + 1;
              ig.field_o[0] = new RgbSprite[4];
              ig.field_o[0][0] = (RgbSprite) ((Object) new ek(im.field_h.a("wz_midground_01.png", -742, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (al.field_g == 5 &&
              im.field_h.a((byte) 109, "wz_midground_02.png", "warzone/")) {
              al.field_g = al.field_g + 1;
              ig.field_o[0][1] = (RgbSprite) ((Object) new ek(im.field_h.a("wz_midground_02.png", -742, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (al.field_g == 6 &&
              im.field_h.a((byte) 83, "wz_midground_03.png", "warzone/")) {
              al.field_g = al.field_g + 1;
              ig.field_o[0][2] = (RgbSprite) ((Object) new ek(im.field_h.a("wz_midground_03.png", -742, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (7 == al.field_g &&
              im.field_h.a((byte) 118, "wz_midground_04.png", "warzone/")) {
              al.field_g = al.field_g + 1;
              ig.field_o[0][3] = (RgbSprite) ((Object) new ek(im.field_h.a("wz_midground_04.png", bi.a(param0, -721), "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (al.field_g == 8 &&
              im.field_h.a((byte) 88, "wz_foreground_01.png", "warzone/")) {
              al.field_g = al.field_g + 1;
              kc.field_x[0] = new RgbSprite[7];
              kc.field_x[0][0] = (RgbSprite) ((Object) new ek(im.field_h.a("wz_foreground_01.png", param0 - 795, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (9 == al.field_g &&
              im.field_h.a((byte) 122, "wz_foreground_02.png", "warzone/")) {
              al.field_g = al.field_g + 1;
              kc.field_x[0][1] = (RgbSprite) ((Object) new ek(im.field_h.a("wz_foreground_02.png", param0 - 795, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (al.field_g == 10 &&
              im.field_h.a((byte) 84, "wz_foreground_03.png", "warzone/")) {
              al.field_g = al.field_g + 1;
              kc.field_x[0][2] = (RgbSprite) ((Object) new ek(im.field_h.a("wz_foreground_03.png", -742, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (al.field_g == 11 &&
              im.field_h.a((byte) 122, "wz_foreground_04.png", "warzone/")) {
              al.field_g = al.field_g + 1;
              kc.field_x[0][3] = (RgbSprite) ((Object) new ek(im.field_h.a("wz_foreground_04.png", -742, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (al.field_g == 12 &&
              im.field_h.a((byte) -76, "wz_foreground_05.png", "warzone/")) {
              al.field_g = al.field_g + 1;
              kc.field_x[0][4] = (RgbSprite) ((Object) new ek(im.field_h.a("wz_foreground_05.png", param0 - 795, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (al.field_g == 13 &&
              im.field_h.a((byte) 102, "wz_foreground_06.png", "warzone/")) {
              al.field_g = al.field_g + 1;
              kc.field_x[0][5] = (RgbSprite) ((Object) new ek(im.field_h.a("wz_foreground_06.png", -742, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (al.field_g == 14 &&
              im.field_h.a((byte) 93, "wz_foreground_07.png", "warzone/")) {
              al.field_g = al.field_g + 1;
              kc.field_x[0][6] = (RgbSprite) ((Object) new ek(im.field_h.a("wz_foreground_07.png", -742, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (al.field_g == 15 &&
              im.field_h.a((byte) -54, "sb_foreground_01.png", "fleetbattle/")) {
              kc.field_x[1] = new RgbSprite[6];
              al.field_g = al.field_g + 1;
              kc.field_x[1][0] = (RgbSprite) ((Object) new ek(im.field_h.a("sb_foreground_01.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (16 == al.field_g &&
              im.field_h.a((byte) -68, "sb_foreground_02.png", "fleetbattle/")) {
              al.field_g = al.field_g + 1;
              kc.field_x[1][1] = (RgbSprite) ((Object) new ek(im.field_h.a("sb_foreground_02.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (17 == al.field_g &&
              im.field_h.a((byte) -121, "sb_foreground_03.png", "fleetbattle/")) {
              al.field_g = al.field_g + 1;
              kc.field_x[1][2] = (RgbSprite) ((Object) new ek(im.field_h.a("sb_foreground_03.png", bi.a(param0, -721), "fleetbattle/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (18 == al.field_g &&
              im.field_h.a((byte) -127, "sb_foreground_04.png", "fleetbattle/")) {
              al.field_g = al.field_g + 1;
              kc.field_x[1][3] = (RgbSprite) ((Object) new ek(im.field_h.a("sb_foreground_04.png", bi.a(param0, -721), "fleetbattle/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (al.field_g == 19 &&
              im.field_h.a((byte) -70, "sb_foreground_05.png", "fleetbattle/")) {
              al.field_g = al.field_g + 1;
              kc.field_x[1][4] = (RgbSprite) ((Object) new ek(im.field_h.a("sb_foreground_05.png", bi.a(param0, -721), "fleetbattle/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (20 == al.field_g &&
              im.field_h.a((byte) 126, "sb_foreground_06.png", "fleetbattle/")) {
              al.field_g = al.field_g + 1;
              kc.field_x[1][5] = (RgbSprite) ((Object) new ek(im.field_h.a("sb_foreground_06.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) gl.a(false))));
              return;
            }
            if (al.field_g == 21 &&
              im.field_h.a((byte) -87, "planet.jpg", "fleetbattle/")) {
              al.field_g = al.field_g + 1;
              return;
            }
            if (al.field_g == 22 &&
              im.field_h.a((byte) 123, "moon.jpg", "fleetbattle/")) {
              al.field_g = al.field_g + 1;
              return;
            }
            if (al.field_g == 23) {
              al.field_g = 0;
              cb.field_l = cb.field_l + 1;
            }
            return;
          }
          if (cb.field_l == 2 &&
            he.field_e != null) {
            regionExit1: {
              ua.field_r = 90;
              if (al.field_g == 0) {
                qj.field_q[0] = he.field_e.a("menu_select", "", -123);
                al.field_g = al.field_g + 1;
                if (var3 == 0) {
                  break regionExit1;
                }
              }
              if (al.field_g == 1) {
                qj.field_q[1] = he.field_e.a("jumping", "", bi.a(param0, 90));
                al.field_g = al.field_g + 1;
                if (var3 == 0) {
                  break regionExit1;
                }
              }
              if (al.field_g != 2) {
                if (3 != al.field_g) {
                  if (al.field_g == 4) {
                    qj.field_q[4] = he.field_e.a("drop_pod", "", -121);
                    al.field_g = al.field_g + 1;
                    if (var3 == 0) {
                      break regionExit1;
                    }
                  }
                  if (al.field_g != 5) {
                    if (al.field_g == 6) {
                      qj.field_q[6] = he.field_e.a("footstep_5", "", 100);
                      al.field_g = al.field_g + 1;
                      if (var3 == 0) {
                        break regionExit1;
                      }
                    }
                    if (al.field_g != 7) {
                      if (8 == al.field_g) {
                        qj.field_q[8] = he.field_e.a("respawn", "", -28);
                        al.field_g = al.field_g + 1;
                        if (var3 == 0) {
                          break regionExit1;
                        }
                      }
                      if (al.field_g != 9) {
                        if (10 != al.field_g) {
                          if (11 != al.field_g) {
                            if (12 == al.field_g) {
                              qj.field_q[12] = he.field_e.a("proxy_grenade_launcher", "", 105);
                              al.field_g = al.field_g + 1;
                              if (var3 == 0) {
                                break regionExit1;
                              }
                            }
                            if (al.field_g != 13) {
                              if (al.field_g != 14) {
                                if (15 == al.field_g) {
                                  qj.field_q[15] = he.field_e.a("pulse_laser", "", -118);
                                  al.field_g = al.field_g + 1;
                                  if (var3 == 0) {
                                    break regionExit1;
                                  }
                                }
                                if (al.field_g != 16) {
                                  if (al.field_g == 17) {
                                    qj.field_q[17] = he.field_e.a("emp_rocket_impact", "", 112);
                                    al.field_g = al.field_g + 1;
                                    if (var3 == 0) {
                                      break regionExit1;
                                    }
                                  }
                                  if (al.field_g == 18) {
                                    qj.field_q[18] = he.field_e.a("flak_repeater", "", 124);
                                    al.field_g = al.field_g + 1;
                                    if (var3 == 0) {
                                      break regionExit1;
                                    }
                                  }
                                  if (19 == al.field_g) {
                                    qj.field_q[19] = he.field_e.a("plasma_spray", "", -50);
                                    al.field_g = al.field_g + 1;
                                    if (var3 == 0) {
                                      break regionExit1;
                                    }
                                  }
                                  if (al.field_g != 20) {
                                    if (al.field_g == 21) {
                                      qj.field_q[21] = he.field_e.a("electron_cannon", "", param0 - 135);
                                      al.field_g = al.field_g + 1;
                                      if (var3 == 0) {
                                        break regionExit1;
                                      }
                                    }
                                    if (al.field_g == 22) {
                                      qj.field_q[22] = he.field_e.a("sword", "", 113);
                                      al.field_g = al.field_g + 1;
                                      if (var3 == 0) {
                                        break regionExit1;
                                      }
                                    }
                                    if (al.field_g != 23) {
                                      if (al.field_g != 24) {
                                        if (al.field_g != 25) {
                                          if (al.field_g != 26) {
                                            if (27 != al.field_g) {
                                              if (al.field_g != 28) {
                                                if (29 == al.field_g) {
                                                  qj.field_q[29] = he.field_e.a("shield_loop", "", 122);
                                                  al.field_g = al.field_g + 1;
                                                  if (var3 == 0) {
                                                    break regionExit1;
                                                  }
                                                }
                                                if (30 == al.field_g) {
                                                  qj.field_q[30] = he.field_e.a("mine_inactive_hum_2", "", -105);
                                                  al.field_g = al.field_g + 1;
                                                  if (var3 == 0) {
                                                    break regionExit1;
                                                  }
                                                }
                                                if (al.field_g == 31) {
                                                  qj.field_q[31] = he.field_e.a("lightning_cannon", "", 123);
                                                  al.field_g = al.field_g + 1;
                                                  if (var3 == 0) {
                                                    break regionExit1;
                                                  }
                                                }
                                                if (32 == al.field_g) {
                                                  qj.field_q[32] = he.field_e.a("heavy_cannon_3", "", -86);
                                                  al.field_g = al.field_g + 1;
                                                  if (var3 == 0) {
                                                    break regionExit1;
                                                  }
                                                }
                                                if (al.field_g != 33) {
                                                  if (al.field_g == 34) {
                                                    qj.field_q[34] = he.field_e.a("heavy_cannon_1", "", -109);
                                                    al.field_g = al.field_g + 1;
                                                    if (var3 == 0) {
                                                      break regionExit1;
                                                    }
                                                  }
                                                  if (al.field_g != 35) {
                                                    if (al.field_g == 36) {
                                                      qj.field_q[36] = he.field_e.a("heavy_gun_3", "", param0 - 94);
                                                      al.field_g = al.field_g + 1;
                                                      if (var3 == 0) {
                                                        break regionExit1;
                                                      }
                                                    }
                                                    if (al.field_g == 37) {
                                                      qj.field_q[37] = he.field_e.a("air_mine", "", -78);
                                                      al.field_g = al.field_g + 1;
                                                      if (var3 == 0) {
                                                        break regionExit1;
                                                      }
                                                    }
                                                    if (al.field_g == 38) {
                                                      qj.field_q[38] = he.field_e.a("heavy_gun_1", "", 126);
                                                      al.field_g = al.field_g + 1;
                                                      if (var3 == 0) {
                                                        break regionExit1;
                                                      }
                                                    }
                                                    if (al.field_g != 39) {
                                                      if (al.field_g == 40) {
                                                        qj.field_q[40] = he.field_e.a("rail_repeater", "", 118);
                                                        al.field_g = al.field_g + 1;
                                                        if (var3 == 0) {
                                                          break regionExit1;
                                                        }
                                                      }
                                                      if (41 != al.field_g) {
                                                        if (al.field_g == 42) {
                                                          qj.field_q[42] = he.field_e.a("plasma_cannon", "", 104);
                                                          al.field_g = al.field_g + 1;
                                                          if (var3 == 0) {
                                                            break regionExit1;
                                                          }
                                                        }
                                                        if (43 != al.field_g) {
                                                          if (al.field_g != 44) {
                                                            if (al.field_g != 45) {
                                                              if (al.field_g == 46) {
                                                                qj.field_q[67] = he.field_e.a("laser_beam", "", 110);
                                                                al.field_g = al.field_g + 1;
                                                                if (var3 == 0) {
                                                                  break regionExit1;
                                                                }
                                                              }
                                                              if (al.field_g != 47) {
                                                                if (al.field_g == 48) {
                                                                  qj.field_q[46] = he.field_e.a("flak_cannon_3", "", 103);
                                                                  al.field_g = al.field_g + 1;
                                                                  if (var3 == 0) {
                                                                    break regionExit1;
                                                                  }
                                                                }
                                                                if (49 != al.field_g) {
                                                                  if (al.field_g == 50) {
                                                                    qj.field_q[48] = he.field_e.a("explosion_1", "", 110);
                                                                    al.field_g = al.field_g + 1;
                                                                    if (var3 == 0) {
                                                                      break regionExit1;
                                                                    }
                                                                  }
                                                                  if (al.field_g == 51) {
                                                                    qj.field_q[49] = he.field_e.a("damage_richochet", "", bi.a(param0, -15));
                                                                    al.field_g = al.field_g + 1;
                                                                    if (var3 == 0) {
                                                                      break regionExit1;
                                                                    }
                                                                  }
                                                                  if (al.field_g == 52) {
                                                                    qj.field_q[50] = he.field_e.a("damage_plasma_burn", "", 113);
                                                                    al.field_g = al.field_g + 1;
                                                                    if (var3 == 0) {
                                                                      break regionExit1;
                                                                    }
                                                                  }
                                                                  if (53 != al.field_g) {
                                                                    if (al.field_g == 54) {
                                                                      qj.field_q[52] = he.field_e.a("explosion_4", "", 122);
                                                                      al.field_g = al.field_g + 1;
                                                                      if (var3 == 0) {
                                                                        break regionExit1;
                                                                      }
                                                                    }
                                                                    if (al.field_g != 55) {
                                                                      if (al.field_g != 56) {
                                                                        if (al.field_g == 57) {
                                                                          qj.field_q[55] = he.field_e.a("damage_debris_hitting_ground", "", -32);
                                                                          al.field_g = al.field_g + 1;
                                                                          if (var3 == 0) {
                                                                            break regionExit1;
                                                                          }
                                                                        }
                                                                        if (al.field_g == 58) {
                                                                          qj.field_q[56] = he.field_e.a("explosion_3", "", -82);
                                                                          al.field_g = al.field_g + 1;
                                                                          if (var3 == 0) {
                                                                            break regionExit1;
                                                                          }
                                                                        }
                                                                        if (al.field_g != 59) {
                                                                          if (60 != al.field_g) {
                                                                            if (al.field_g == 61) {
                                                                              qj.field_q[59] = he.field_e.a("rail_cannon", "", 122);
                                                                              al.field_g = al.field_g + 1;
                                                                              if (var3 == 0) {
                                                                                break regionExit1;
                                                                              }
                                                                            }
                                                                            if (al.field_g != 62) {
                                                                              if (al.field_g != 63) {
                                                                                if (64 == al.field_g) {
                                                                                  qj.field_q[62] = he.field_e.a("fusion_cannon", "", -56);
                                                                                  al.field_g = al.field_g + 1;
                                                                                  if (var3 == 0) {
                                                                                    break regionExit1;
                                                                                  }
                                                                                }
                                                                                if (al.field_g != 65) {
                                                                                  if (al.field_g != 66) {
                                                                                    if (al.field_g != 67) {
                                                                                      if (al.field_g != 68) {
                                                                                        if (al.field_g == 69) {
                                                                                          qj.field_q[69] = he.field_e.a("Add_order", "", 118);
                                                                                          al.field_g = al.field_g + 1;
                                                                                          if (var3 == 0) {
                                                                                            break regionExit1;
                                                                                          }
                                                                                        }
                                                                                        if (70 != al.field_g) {
                                                                                          if (al.field_g == 71) {
                                                                                            qj.field_q[85] = he.field_e.a("pause_menu_close", "", -92);
                                                                                            al.field_g = al.field_g + 1;
                                                                                            if (var3 == 0) {
                                                                                              break regionExit1;
                                                                                            }
                                                                                          }
                                                                                          if (72 == al.field_g) {
                                                                                            qj.field_q[86] = he.field_e.a("explosion_fireball_1", "", 100);
                                                                                            al.field_g = al.field_g + 1;
                                                                                            if (var3 == 0) {
                                                                                              break regionExit1;
                                                                                            }
                                                                                          }
                                                                                          if (al.field_g != 73) {
                                                                                            if (74 != al.field_g) {
                                                                                              if (al.field_g != 75) {
                                                                                                if (al.field_g == 76) {
                                                                                                  qj.field_q[90] = he.field_e.a("steam", "", -108);
                                                                                                  al.field_g = al.field_g + 1;
                                                                                                  if (var3 == 0) {
                                                                                                    break regionExit1;
                                                                                                  }
                                                                                                }
                                                                                                if (al.field_g == 77) {
                                                                                                  qj.field_q[91] = he.field_e.a("flak_explosion_500ms", "", 95);
                                                                                                  al.field_g = al.field_g + 1;
                                                                                                  if (var3 == 0) {
                                                                                                    break regionExit1;
                                                                                                  }
                                                                                                }
                                                                                                if (al.field_g != 78) {
                                                                                                  if (al.field_g != 79) {
                                                                                                    if (al.field_g != 80) {
                                                                                                      if (al.field_g != 81) {
                                                                                                        if (al.field_g != 82) {
                                                                                                          if (al.field_g != 83) {
                                                                                                            if (al.field_g == 84) {
                                                                                                              qj.field_q[98] = he.field_e.a("main_menu_disappear", "", 93);
                                                                                                              al.field_g = al.field_g + 1;
                                                                                                              if (var3 == 0) {
                                                                                                                break regionExit1;
                                                                                                              }
                                                                                                            }
                                                                                                            if (al.field_g != 85) {
                                                                                                              if (al.field_g != 86) {
                                                                                                                if (al.field_g == 87) {
                                                                                                                  qj.field_q[102] = he.field_e.a("power_up", "", 102);
                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                  if (var3 == 0) {
                                                                                                                    break regionExit1;
                                                                                                                  }
                                                                                                                }
                                                                                                                if (al.field_g == 88) {
                                                                                                                  qj.field_q[103] = he.field_e.a("energy_sword_part_1", "", param0 + 47);
                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                  if (var3 == 0) {
                                                                                                                    break regionExit1;
                                                                                                                  }
                                                                                                                }
                                                                                                                if (al.field_g != 89) {
                                                                                                                  break regionExit1;
                                                                                                                }
                                                                                                                qj.field_q[104] = he.field_e.a("new_nuke_explosion", "", 100);
                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                if (var3 == 0) {
                                                                                                                  break regionExit1;
                                                                                                                }
                                                                                                              }
                                                                                                              qj.field_q[100] = he.field_e.a("Menu_engineering_select_part", "", -28);
                                                                                                              al.field_g = al.field_g + 1;
                                                                                                              if (var3 == 0) {
                                                                                                                break regionExit1;
                                                                                                              }
                                                                                                            }
                                                                                                            qj.field_q[99] = he.field_e.a("Menu_engineering_select_chassis", "", -112);
                                                                                                            al.field_g = al.field_g + 1;
                                                                                                            if (var3 == 0) {
                                                                                                              break regionExit1;
                                                                                                            }
                                                                                                          }
                                                                                                          qj.field_q[97] = he.field_e.a("Mouseover", "", 120);
                                                                                                          al.field_g = al.field_g + 1;
                                                                                                          if (var3 == 0) {
                                                                                                            break regionExit1;
                                                                                                          }
                                                                                                        }
                                                                                                        qj.field_q[96] = he.field_e.a("Main_menu_appear", "", 104);
                                                                                                        al.field_g = al.field_g + 1;
                                                                                                        if (var3 == 0) {
                                                                                                          break regionExit1;
                                                                                                        }
                                                                                                      }
                                                                                                      qj.field_q[95] = he.field_e.a("Button_press", "", -49);
                                                                                                      al.field_g = al.field_g + 1;
                                                                                                      if (var3 == 0) {
                                                                                                        break regionExit1;
                                                                                                      }
                                                                                                    }
                                                                                                    qj.field_q[94] = he.field_e.a("damage_plasma_burn2", "", -79);
                                                                                                    al.field_g = al.field_g + 1;
                                                                                                    if (var3 == 0) {
                                                                                                      break regionExit1;
                                                                                                    }
                                                                                                  }
                                                                                                  qj.field_q[93] = he.field_e.a("trackloop", "", bi.a(param0, 68));
                                                                                                  al.field_g = al.field_g + 1;
                                                                                                  if (var3 == 0) {
                                                                                                    break regionExit1;
                                                                                                  }
                                                                                                }
                                                                                                qj.field_q[92] = he.field_e.a("hoverloop", "", param0 + 59);
                                                                                                al.field_g = al.field_g + 1;
                                                                                                if (var3 == 0) {
                                                                                                  break regionExit1;
                                                                                                }
                                                                                              }
                                                                                              qj.field_q[89] = he.field_e.a("explosion_fireball_4", "", -85);
                                                                                              al.field_g = al.field_g + 1;
                                                                                              if (var3 == 0) {
                                                                                                break regionExit1;
                                                                                              }
                                                                                            }
                                                                                            qj.field_q[88] = he.field_e.a("explosion_fireball_3", "", bi.a(param0, -90));
                                                                                            al.field_g = al.field_g + 1;
                                                                                            if (var3 == 0) {
                                                                                              break regionExit1;
                                                                                            }
                                                                                          }
                                                                                          qj.field_q[87] = he.field_e.a("explosion_fireball_2", "", -125);
                                                                                          al.field_g = al.field_g + 1;
                                                                                          if (var3 == 0) {
                                                                                            break regionExit1;
                                                                                          }
                                                                                        }
                                                                                        qj.field_q[84] = he.field_e.a("pause_menu_open", "", bi.a(param0, -110));
                                                                                        al.field_g = al.field_g + 1;
                                                                                        if (var3 == 0) {
                                                                                          break regionExit1;
                                                                                        }
                                                                                      }
                                                                                      qj.field_q[66] = he.field_e.a("ultra_gun", "", 123);
                                                                                      al.field_g = al.field_g + 1;
                                                                                      if (var3 == 0) {
                                                                                        break regionExit1;
                                                                                      }
                                                                                    }
                                                                                    qj.field_q[65] = he.field_e.a("doomsday_cannon", "", -83);
                                                                                    al.field_g = al.field_g + 1;
                                                                                    if (var3 == 0) {
                                                                                      break regionExit1;
                                                                                    }
                                                                                  }
                                                                                  qj.field_q[64] = he.field_e.a("solaris_laser", "", -116);
                                                                                  al.field_g = al.field_g + 1;
                                                                                  if (var3 == 0) {
                                                                                    break regionExit1;
                                                                                  }
                                                                                }
                                                                                qj.field_q[63] = he.field_e.a("EMP_cannon", "", -61);
                                                                                al.field_g = al.field_g + 1;
                                                                                if (var3 == 0) {
                                                                                  break regionExit1;
                                                                                }
                                                                              }
                                                                              qj.field_q[61] = he.field_e.a("air_death_missile", "", bi.a(param0, 85));
                                                                              al.field_g = al.field_g + 1;
                                                                              if (var3 == 0) {
                                                                                break regionExit1;
                                                                              }
                                                                            }
                                                                            qj.field_q[60] = he.field_e.a("class_DEATH_nuke", "", -113);
                                                                            al.field_g = al.field_g + 1;
                                                                            if (var3 == 0) {
                                                                              break regionExit1;
                                                                            }
                                                                          }
                                                                          qj.field_q[58] = he.field_e.a("howitzer", "", -53);
                                                                          al.field_g = al.field_g + 1;
                                                                          if (var3 == 0) {
                                                                            break regionExit1;
                                                                          }
                                                                        }
                                                                        qj.field_q[57] = he.field_e.a("destructor_rocket", "", 100);
                                                                        al.field_g = al.field_g + 1;
                                                                        if (var3 == 0) {
                                                                          break regionExit1;
                                                                        }
                                                                      }
                                                                      qj.field_q[54] = he.field_e.a("explosion_6", "", 96);
                                                                      al.field_g = al.field_g + 1;
                                                                      if (var3 == 0) {
                                                                        break regionExit1;
                                                                      }
                                                                    }
                                                                    qj.field_q[53] = he.field_e.a("explosion_5", "", 117);
                                                                    al.field_g = al.field_g + 1;
                                                                    if (var3 == 0) {
                                                                      break regionExit1;
                                                                    }
                                                                  }
                                                                  qj.field_q[51] = he.field_e.a("damage_scraping_metal", "", -108);
                                                                  al.field_g = al.field_g + 1;
                                                                  if (var3 == 0) {
                                                                    break regionExit1;
                                                                  }
                                                                }
                                                                qj.field_q[47] = he.field_e.a("explosion_2", "", bi.a(param0, -87));
                                                                al.field_g = al.field_g + 1;
                                                                if (var3 == 0) {
                                                                  break regionExit1;
                                                                }
                                                              }
                                                              qj.field_q[68] = he.field_e.a("heavy_gun_2", "", bi.a(param0, -27));
                                                              al.field_g = al.field_g + 1;
                                                              if (var3 == 0) {
                                                                break regionExit1;
                                                              }
                                                            }
                                                            qj.field_q[45] = he.field_e.a("heavy_cannon_2", "", param0 + 62);
                                                            al.field_g = al.field_g + 1;
                                                            if (var3 == 0) {
                                                              break regionExit1;
                                                            }
                                                          }
                                                          qj.field_q[44] = he.field_e.a("heavy_rocket_launch", "", param0 + 63);
                                                          al.field_g = al.field_g + 1;
                                                          if (var3 == 0) {
                                                            break regionExit1;
                                                          }
                                                        }
                                                        qj.field_q[43] = he.field_e.a("rifled_sniper_cannon", "", 120);
                                                        al.field_g = al.field_g + 1;
                                                        if (var3 == 0) {
                                                          break regionExit1;
                                                        }
                                                      }
                                                      qj.field_q[41] = he.field_e.a("mine_proximity_2", "", -72);
                                                      al.field_g = al.field_g + 1;
                                                      if (var3 == 0) {
                                                        break regionExit1;
                                                      }
                                                    }
                                                    qj.field_q[39] = he.field_e.a("flak_cannon_1", "", 95);
                                                    al.field_g = al.field_g + 1;
                                                    if (var3 == 0) {
                                                      break regionExit1;
                                                    }
                                                  }
                                                  qj.field_q[35] = he.field_e.a("morter", "", -67);
                                                  al.field_g = al.field_g + 1;
                                                  if (var3 == 0) {
                                                    break regionExit1;
                                                  }
                                                }
                                                qj.field_q[33] = he.field_e.a("flak_cannon_2", "", -103);
                                                al.field_g = al.field_g + 1;
                                                if (var3 == 0) {
                                                  break regionExit1;
                                                }
                                              }
                                              qj.field_q[28] = he.field_e.a("EDD_teleport", "", 103);
                                              al.field_g = al.field_g + 1;
                                              if (var3 == 0) {
                                                break regionExit1;
                                              }
                                            }
                                            qj.field_q[27] = he.field_e.a("shield_hit", "", bi.a(param0, -109));
                                            al.field_g = al.field_g + 1;
                                            if (var3 == 0) {
                                              break regionExit1;
                                            }
                                          }
                                          qj.field_q[26] = he.field_e.a("ballistic_target_tracking_module", "", param0 - 176);
                                          al.field_g = al.field_g + 1;
                                          if (var3 == 0) {
                                            break regionExit1;
                                          }
                                        }
                                        qj.field_q[25] = he.field_e.a("attach_component", "", -57);
                                        al.field_g = al.field_g + 1;
                                        if (var3 == 0) {
                                          break regionExit1;
                                        }
                                      }
                                      qj.field_q[24] = he.field_e.a("hammer", "", -57);
                                      al.field_g = al.field_g + 1;
                                      if (var3 == 0) {
                                        break regionExit1;
                                      }
                                    }
                                    qj.field_q[23] = he.field_e.a("energy_sword_part_2", "", -41);
                                    al.field_g = al.field_g + 1;
                                    if (var3 == 0) {
                                      break regionExit1;
                                    }
                                  }
                                  qj.field_q[20] = he.field_e.a("light_rocket_launch", "", -56);
                                  al.field_g = al.field_g + 1;
                                  if (var3 == 0) {
                                    break regionExit1;
                                  }
                                }
                                qj.field_q[16] = he.field_e.a("mini_gun", "", 127);
                                al.field_g = al.field_g + 1;
                                if (var3 == 0) {
                                  break regionExit1;
                                }
                              }
                              qj.field_q[14] = he.field_e.a("rapier_missle", "", param0 + 68);
                              al.field_g = al.field_g + 1;
                              if (var3 == 0) {
                                break regionExit1;
                              }
                            }
                            qj.field_q[13] = he.field_e.a("gauss_gun", "", -110);
                            al.field_g = al.field_g + 1;
                            if (var3 == 0) {
                              break regionExit1;
                            }
                          }
                          qj.field_q[11] = he.field_e.a("landing", "", 121);
                          al.field_g = al.field_g + 1;
                          if (var3 == 0) {
                            break regionExit1;
                          }
                        }
                        qj.field_q[10] = he.field_e.a("footstep_3", "", param0 + 64);
                        al.field_g = al.field_g + 1;
                        if (var3 == 0) {
                          break regionExit1;
                        }
                      }
                      qj.field_q[9] = he.field_e.a("death", "", param0 - 141);
                      al.field_g = al.field_g + 1;
                      if (var3 == 0) {
                        break regionExit1;
                      }
                    }
                    qj.field_q[7] = he.field_e.a("footstep_2", "", 111);
                    al.field_g = al.field_g + 1;
                    if (var3 == 0) {
                      break regionExit1;
                    }
                  }
                  qj.field_q[5] = he.field_e.a("footstep_4", "", 125);
                  al.field_g = al.field_g + 1;
                  if (var3 == 0) {
                    break regionExit1;
                  }
                }
                qj.field_q[3] = he.field_e.a("footstep_1", "", bi.a(param0, 75));
                al.field_g = al.field_g + 1;
                if (var3 == 0) {
                  break regionExit1;
                }
              }
              qj.field_q[2] = he.field_e.a("thrusting", "", bi.a(param0, 92));
              al.field_g = al.field_g + 1;
            }
            if (al.field_g == 90) {
              al.field_g = 0;
              cb.field_l = cb.field_l + 1;
              he.field_e = null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.PA(" + param0 + ')');
        }
    }

    public static void j(byte param0) {
        field_H = null;
        field_J = null;
        if (param0 != -10) {
          return;
        }
        try {
          field_I = null;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "SteelSentinels.TA(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (pl.field_S != null) {
            rc.a(0, pl.field_S);
            pl.field_S = null;
            cc.j(0);
          }
          IsaacRandom.field_k = dh.a(-124, 3);
          DualNode.field_x = dh.a(60, 5);
          oh.field_a = dh.a(-90, 6);
          aj.field_x = dh.a(55, 7);
          dh.field_z = dh.a(120, 8);
          var2_int = -77 % ((47 - param0) / 35);
          rc.field_i = dh.a(-92, 9);
          g.field_i = dh.a(-106, 10);
          rj.field_k = dh.a(104, 11);
          ti.field_t = dh.a(125, 12);
          im.field_h = dh.a(70, 13);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.RA(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ti.d(7094);
          if (null != wb.field_c) {
            ub.c(0);
          }
          var2_int = 21 % ((param0 - 34) / 48);
          ao.h(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.LA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a(15, -28233, "steelsentinels");
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "SteelSentinels.init()");
        }
    }

    private final void b(int param0, boolean param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_179_0 = false;
        GameplayController stackIn_251_0;
        GameplayController stackIn_251_1;
        boolean stackIn_251_2;
        int stackIn_251_3;
        int stackIn_251_4;
        String[] stackIn_251_5;
        int stackIn_251_6;
        boolean stackIn_251_7;
        int[][] stackIn_251_8;
        GameplayController stackIn_252_0;
        GameplayController stackIn_252_1;
        int stackIn_252_9;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        Sentinel var5 = null;
        int var5_int = 0;
        int[][] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = obfuscationControl;
        try {
          boolean decompiledFrameRemainder2 = true;
          wh.a(false);
          if (in.field_h != in.field_i) {
            if (~bg.field_G != ~in.field_i) {
              if (de.field_f == in.field_i) {
                if (!ni.b(12)) {
                  if (null != lc.field_c) {
                    pa.a(3, (byte) -114, lc.field_c);
                  }
                  gf.c(-128);
                  vb.field_g = SentinelDesigner.field_i;
                  if (si.field_y) {
                    si.field_y = false;
                    ag.a(-4, false);
                  }
                  if (fe.field_E &&
                    vb.b(-52)) {
                    var3_int = vb.field_g;
                    if (var3_int == 5 ||
                      var3_int == 6 ||
                      var3_int == 8) {
                      var3_int = SceneWidget.field_Jb;
                    }
                    q.a(-4, false, -1, var3_int);
                  }
                  if (d.a(vb.field_g, 0)) {
                    ol.b(true);
                  }
                }
                in.field_i = ik.field_b;
                decompiledFrameRemainder2 = (var8 != 0);
              }
              if (decompiledFrameRemainder2) {
                SentinelDesigner.field_a = SentinelDesigner.field_a - 1;
                decompiledFrameRemainder2 = (SentinelDesigner.field_a == 0);
                if (decompiledFrameRemainder2) {
                  in.field_i = in.field_h;
                  decompiledFrameRemainder2 = (var8 != 0);
                }
              }
            }
            if (decompiledFrameRemainder2) {
              SentinelDesigner.field_a = SentinelDesigner.field_a + 1;
              decompiledFrameRemainder2 = (SentinelDesigner.field_a == 16);
              if (decompiledFrameRemainder2) {
                if (!si.field_y) {
                  bb.a((byte) 113);
                  if (var8 != 0) {
                    ef.a(param0 ^ 116);
                  }
                } else {
                  ef.a(param0 ^ 116);
                }
                in.field_i = de.field_f;
                decompiledFrameRemainder2 = (var8 != 0);
              }
            }
          }
          if (decompiledFrameRemainder2) {
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameRemainder1 = true;
            var3_int = 0;
            var4 = 0;
            if (!param1) {
              if (~vb.field_g == ~pm.field_T) {
                if (pm.field_T == -1) {
                  if ((!bg.field_H) &&
                    (decompiledFrameRemainder1 = (null != fk.field_i))) {
                    fk.field_i.c(-68, true);
                    while (dl.f(22759)) {
                      fk.field_i.g(97);
                      if (var8 != 0) {
                        decompiledFrameCompleted2 = false;
                        break;
                      }
                    }
                    decompiledFrameRemainder1 = !(decompiledFrameCompleted2);
                  }
                  if ((decompiledFrameRemainder1) &&
                    (decompiledFrameCompleted2)) {
                    var4 = 1;
                    var3_int = 1;
                    decompiledFrameRemainder1 = (var8 != 0);
                  }
                }
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameCompleted2)) {
                  if (pm.field_T == -2) {
                    boolean decompiledFrameCompleted1 = true;
                    if (null != ih.field_s &&
                      null != hl.a((byte) -66)) {
                      ih.field_s.advanceSimulation((byte) 27);
                      var5 = (Sentinel) (ih.field_s.sentinels.first(13058));
                      while (null != var5) {
                        var5.field_vb = 0;
                        var5 = (Sentinel) (ih.field_s.sentinels.next((byte) -80));
                        if (var8 != 0) {
                          decompiledFrameCompleted1 = false;
                          break;
                        }
                      }
                    }
                    if (decompiledFrameCompleted1) {
                      var3_int = 1;
                    }
                    decompiledFrameRemainder1 = (var8 != 0);
                  }
                  if ((decompiledFrameRemainder1) &&
                    (d.a(pm.field_T, param0 ^ 120))) {
                    i.field_e[pm.field_T].b(true);
                    if (var8 != 0) {
                      pm.field_U = pm.field_U + 1;
                      if (pm.field_U == 20) {
                        ol.b(true);
                      }
                    }
                  }
                }
              } else {
                pm.field_U = pm.field_U + 1;
                if (pm.field_U == 20) {
                  ol.b(true);
                }
              }
            }
            if ((decompiledFrameCompleted2) && (bg.field_H &&
              !rc.field_n &&
              !da.field_d)) {
              if (ob.field_y &&
                jn.field_g) {
                var3_int = 0;
              }
              la.a(13, var3_int != 0);
              if (CombatWorld.field_G ||
                ob.field_y) {
                ue.a((byte) 38, var4 != 0, 320, 180);
              }
              if (CombatWorld.field_G &&
                null != si.field_A) {
                si.field_A.c(param0 ^ 37, var4 != 0);
              }
              if (ob.field_y) {
                fk.field_i.c(-121, var4 != 0);
              }
              while (dl.f(22759)) {
                boolean decompiledFrameRemainder0 = true;
                if (vl.field_v) {
                  if (ob.field_y ||
                    CombatWorld.field_G) {
                    decompiledFrameRemainder0 = !(!cn.a(13, 15, 12, false));
                    if ((decompiledFrameRemainder0) &&
                      (var8 == 0)) {
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    cj.a(13, (byte) 99, 12, 15);
                    decompiledFrameRemainder0 = (var8 != 0);
                  }
                }
                if ((decompiledFrameRemainder0) && ((ob.field_y ||
                  CombatWorld.field_G) && (jn.field_g ||
                  ei.field_q == 80 ||
                  ei.field_q == 10) && cn.a(13, 15, 12, false))) {
                  continue;
                }
                stackIn_179_0 = jn.field_g;
                if (var8 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_179_0) {
                  continue;
                }
                if (CombatWorld.field_G) {
                  si.field_A.g(73);
                }
                if (!ob.field_y) {
                  continue;
                }
                fk.field_i.g(51);
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_179_0 = bg.field_H;
            }
            if (!stackIn_179_0) {
              IntKeyLookup.d((byte) -66);
            }
            if (!vl.field_v) {
              if (!(on.field_i <= 0)) {
                on.field_i = on.field_i - 1;
                if ((var8 != 0) &&
                  (on.field_i < an.field_h)) {
                  on.field_i = on.field_i + 1;
                }
              }
            } else {
              if (on.field_i < an.field_h) {
                on.field_i = on.field_i + 1;
              }
            }
            var5_int = an.field_h * an.field_h;
            var6 = var5_int - on.field_i * on.field_i;
            var7 = vf.field_e + 120 * var6 / var5_int;
            SentinelDesigner.d(0, var7);
            if (bd.field_b.first(13058) != null) {
              fieldTemp$0 = ob.field_o + 1;
              ob.field_o = ob.field_o + 1;
              if (fieldTemp$0 == 500) {
                ob.field_o = 0;
                bd.field_b.a(true);
              }
            }
          }
          if (param0 != 120) {
            this.m(-19);
          }
          if (vb.field_g == -3) {
            lc.field_c = null;
            var3 = g.field_l;
            var4_ref_String__ = new String[]{var3};
            var5_array = new int[var4_ref_String__.length][];
            var5_array[0] = uc.field_b;
            var6 = 1;
            while (true) {
              if (var6 < var4_ref_String__.length) {
                var5_array[var6] = uc.field_b;
                var6++;
                if (var8 == 0) {
                  continue;
                }
              } else {
                var6 = 0;
              }
              break;
            }
            var7 = di.field_g;
            switch ((var8 == 0
              || var7 == -1
              || var7 == 0
              || var7 == 1
              || var7 == 3
              || var7 == 5
              || var7 == 7
              || var7 == 10
              ) ? var7 : -2) {
              case 0:
                var5_array[0] = ua.field_v;
                var6 = 16;
                if (var8 == 0) {
                  break;
                }
              case 1:
                var5_array[0] = ua.field_v;
                var6 = 16;
                if (var8 == 0) {
                  break;
                }
              case 7:
                var6 = 16;
                if (var8 == 0) {
                  break;
                }
              case 4:
                var6 = 16;
                if (var8 == 0) {
                  break;
                }
              case 3:
              case 5:
                var5_array[0] = ua.field_C[ol.field_Ub + 10 * ge.field_j];
                var6 = 16;
                if (var8 == 0) {
                  break;
                }
              case 10:
                var6 = ua.field_t[10 * ge.field_j + ol.field_Ub][1];
                var5_array[0] = ua.field_C[ol.field_Ub + ge.field_j * 10];
                if (var8 == 0) {
                  break;
                }
              case -1:
                var6 = 0;
              default:
                break;
            }
            vl.field_v = false;
            jn.field_g = false;
            stackIn_251_0 = null;
            stackIn_251_1 = null;
            stackIn_251_2 = false;
            stackIn_251_3 = var6;
            stackIn_251_4 = 1;
            stackIn_251_5 = var4_ref_String__;
            stackIn_251_6 = 0;
            stackIn_251_7 = false;
            stackIn_251_8 = var5_array;
            if (-1 != di.field_g) {
              stackIn_252_0 = null;
              stackIn_252_1 = null;
              stackIn_252_9 = 0;
            } else {
              stackIn_252_0 = null;
              stackIn_252_1 = null;
              stackIn_252_9 = 3;
            }
            fk.field_i = new GameplayController(stackIn_251_2, stackIn_251_3, stackIn_251_4, stackIn_251_5, stackIn_251_6, stackIn_251_7, stackIn_251_8, stackIn_252_9, 2, false, false);
            var7 = ArticulatedPart.field_B ? 1 : 0;
            q.a(-1, var7 != 0, -1, 0);
            Sprite.field_k = true;
          }
          if (-4 == vb.field_g) {
            mm.field_g.writeCipheredOpcode(63, (byte) -117);
            mm.field_g.position = mm.field_g.position + 1;
            var3_int = mm.field_g.position;
            mm.field_g.writeByte((byte) 124, uc.field_b.length);
            var4 = 0;
            while (true) {
              if (var4 < uc.field_b.length) {
                mm.field_g.writeByte((byte) 127, uc.field_b[var4]);
                var4++;
                if (var8 == 0) {
                  continue;
                }
              } else {
                mm.field_g.b((byte) 111, mm.field_g.position - var3_int);
                mm.field_g.writeCipheredOpcode(9, (byte) -117);
                rc.field_n = true;
                vb.field_g = pm.field_T;
              }
              break;
            }
            on.field_i = an.field_h;
          }
          if (vb.field_g == -5) {
            na.a((byte) -43, 11, nf.field_b.j(-26));
            da.field_d = true;
            vb.field_g = pm.field_T;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3_ref), "SteelSentinels.SA(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException runtimeException = null;
        ic var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(14, false, 5000, 71, 1, 0, 4, 2);
          var2 = new ic();
          var2.b(128, (byte) -123, 9);
          qm.a(-31, hb.field_i, 22050, var2, true, (java.awt.Component) ((Object) sl.field_n));
          this.a(1, true, true, false, true, true, false);
          ad.field_d = FunOrbClient.field_s;
          m.field_b = pl.field_ab;
          f.field_B[66] = 1;
          f.field_B[61] = 1;
          f.field_B[67] = 32;
          gl.field_x = qg.field_j;
          if (param0 != 26689) {
            this.c(-47);
          }
          f.field_B[57] = -2;
          f.field_B[71] = 12;
          f.field_B[72] = 2;
          f.field_B[78] = -1;
          uc.field_b = ua.field_x;
          fc.field_b = rc.field_o;
          f.field_B[80] = 2;
          f.field_B[70] = 1;
          f.field_B[76] = 5;
          f.field_B[73] = 21;
          f.field_B[58] = -2;
          f.field_B[63] = 1;
          f.field_B[77] = -1;
          ol.field_cc = te.field_a;
          ja.field_b = cb.field_h;
          f.field_B[60] = -1;
          f.field_B[74] = 1;
          f.field_B[64] = 1;
          in.field_b = uc.field_h;
          f.field_B[65] = 1;
          f.field_B[62] = 4;
          f.field_B[69] = 19;
          f.field_B[79] = 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "SteelSentinels.W(" + param0 + ')');
        }
    }

    public SteelSentinels() {
    }

    final void c(int param0) {
        int[] array$0 = null;
        int stackIn_13_1 = 0;
        boolean stackIn_14_2 = false;
        boolean stackIn_77_1 = false;
        int stackIn_278_0 = 0;
        int stackIn_330_0 = 0;
        int stackIn_334_0 = 0;
        int stackIn_338_0 = 0;
        int stackIn_340_0 = 0;
        int stackIn_340_1 = 0;
        int stackIn_351_0 = 0;
        int stackIn_440_0 = 0;
        int stackIn_440_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        Object var3_ref = null;
        Object var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        SentinelCommand var5_ref_je = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        SentinelCommand var10_ref = null;
        int var11_int = 0;
        Sentinel var11 = null;
        int[][] var12 = null;
        int var13_int = 0;
        GameplayController var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = obfuscationControl;
        try {
          ub.b(-108);
          kg.field_Vb = ha.a((byte) -86);
          vk.a(false);
          if (wb.field_c != null &&
            wb.field_c.field_b) {
            ub.c(param0 - 2);
            og.a(-5213);
          }
          if (param0 != 2) {
            this.init();
          }
          stackIn_13_1 = 5;
          stackIn_14_2 = (wb.field_c != null);
          this.a(stackIn_13_1, stackIn_14_2);
          if (rm.field_f) {
            this.m(105);
            rm.field_f = false;
          }
          a.field_c = a.field_c + 1;
          if (ol.j(0)) {
            this.k(113);
            if (ol.j(0)) {
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (SceneWidget.field_pb) {
            if (co.a(false)) {
              if (mg.b(true)) {
                if (in.field_i == in.field_h) {
                  var2_int = eh.a(0);
                  switch (var2_int) {
                    case 2:
                      ub.c(0);
                    default:
                      break;
                    case 4:
                      si.field_y = true;
                      v.a(0, lk.field_bb, param0 + 8);
                      if (var15 == 0) {
                        break;
                      }
                    case 3:
                      si.field_y = false;
                      ag.a(-4, true);
                      break;
                  }
                  this.b(param0 + 118, true);
                  decompiledFrameRemainder0 = (var15 != 0);
                }
                if (decompiledFrameRemainder0) {
                  this.b(param0 + 118, false);
                  decompiledFrameRemainder0 = (var15 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (!cf.c((byte) 100)) {
                  if (!ri.b(-121)) {
                    this.b(120, false);
                    decompiledFrameRemainder0 = (var15 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (in.field_i == in.field_h) {
                      var2_int = rn.c((byte) 90);
                      if (var2_int == 1) {
                        fe.field_E = true;
                        v.a(0, pl.field_Q, param0 + 8);
                      }
                      this.b(param0 + 118, true);
                      decompiledFrameRemainder0 = (var15 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      this.b(param0 + 118, false);
                      decompiledFrameRemainder0 = (var15 != 0);
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  stackIn_77_1 = (null != wb.field_c);
                  var2_int = this.a(stackIn_77_1, -3836);
                  if (var2_int == 1 ||
                    var2_int == 2) {
                    if (wb.field_c != null) {
                      ub.c(0);
                    }
                    if (var2_int == 2) {
                      t.a(true, Projectile.d((byte) -21));
                    }
                  }
                  this.b(120, true);
                  if (var15 != 0) {
                    ai.d(param0 + 103);
                    r.a(jj.field_d, (byte) 104);
                    if (this.k((byte) -52)) {
                      SceneWidget.field_pb = true;
                    }
                  }
                }
              }
            } else {
              ai.d(param0 + 103);
              if (var15 != 0) {
                r.a(jj.field_d, (byte) 104);
                if (this.k((byte) -52)) {
                  SceneWidget.field_pb = true;
                }
              }
            }
          } else {
            r.a(jj.field_d, (byte) 104);
            if (this.k((byte) -52)) {
              SceneWidget.field_pb = true;
            }
          }
          if (!ni.b(92)) {
            do {
              var2 = (cf) (un.field_b.a(true));
              if (var2 == null) {
                if (var15 == 0) {
                  break;
                }
              } else {
                r.a(4, (byte) 123, (cf) (var2));
              }
            } while (var15 == 0);
          }
          if (!ni.b(74) &&
            Explosion.field_P != 0) {
            ef.a((byte) -109);
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!rl.a((byte) 54, f.field_B)))) {
            stackIn_440_0 = ch.field_N;
            stackIn_440_1 = 9;
            if (var15 == 0) {
              if (stackIn_440_0 == stackIn_440_1) {
                ol.b(true);
                vb.field_g = 11;
                rc.field_n = false;
                ll.field_s = rf.field_d.h(1);
                continue;
              }
              if (ch.field_N == 14) {
                ol.b(true);
                jj.field_i = nf.a(uc.field_b, h.field_G, (byte) 44);
                kc.field_w[1] = (byte) 0;
                if ((jj.field_i & rc.field_o[1][kc.field_w[1]]) == 0) {
                  kc.field_w[1] = (byte) 1;
                  if (rd.field_b > 0) {
                    kc.field_w[1] = (byte) 2;
                  }
                }
                if (kc.field_w[1] == 0) {
                  v.field_b[0] = 4;
                }
                if (1 == kc.field_w[1]) {
                  v.field_b[0] = 6;
                }
                if (kc.field_w[1] == 2) {
                  v.field_b[0] = 12;
                }
                sg.a(ge.a(2000, (byte) -32), nl.field_db.length, tm.a((byte) 50), 1024, ge.a(12, (byte) -32), nj.a((byte) -127), ti.field_u, (byte) -22, ic.f(3443), 150);
                nh.a((byte) -98, tc.d(800), wn.b((byte) 121));
                rc.field_n = false;
                vb.field_g = -2;
                bg.field_H = true;
                continue;
              }
              if (ch.field_N == 15) {
                if (bg.field_H) {
                  ol.b(true);
                  oa.f(param0 ^ -12163);
                  IsaacRandom.b((byte) 124);
                  Sprite.field_k = false;
                  ob.field_y = false;
                  vb.field_g = 0;
                  NodeIterator.field_d = true;
                  CombatWorld.field_G = false;
                  bg.field_H = false;
                  lc.field_e = true;
                  vn.c(103);
                }
                da.field_d = false;
                rc.field_n = false;
                continue;
              }
              if (ch.field_N == 10 &&
                bg.field_H) {
                in.a(11247);
                continue;
              }
              if (ch.field_N == 80) {
                var2_int = rf.field_d.readUnsignedByte((byte) -123);
                var3 = (byte)(255 & rf.field_d.readUnsignedByte((byte) -123));
                if (null == nf.field_b) {
                  continue;
                }
                if (0 != var2_int) {
                  nf.field_b.field_Sb[var2_int] = (byte) var3;
                  continue;
                }
                nf.field_b.field_Ub = var3;
                v.field_b[0] = var3;
                continue;
              }
              if (ch.field_N == 11) {
                var2 = eb.$cfr$intArgs$a$9d0e4b5217c4(-62, false);
                bg.a((na) (var2), -92);
                if (m.field_a != 1) {
                  continue;
                }
                if (fk.field_i == null) {
                  continue;
                }
                if (ph.field_e == null) {
                  continue;
                }
                var3_ref = "";
                if (null != b.field_g) {
                  var4_ref = b.field_g;
                  if (be.field_b == 1) {
                    var4_ref = "<img=0>" + (String) (var4_ref);
                  }
                  if (2 == be.field_b) {
                    var4_ref = "<img=1>" + (String) (var4_ref);
                  }
                  var3_ref = (String) (var4_ref) + ": ";
                }
                var4_ref = (String) (var3_ref) + BitmapFont.a(bg.field_F);
                if (((na) (var2)).field_g ||
                  !o.a(-122, ((na) (var2)).field_p)) {
                  bl.a(48127, (String) (var4_ref), (byte) 124);
                  ln.field_e = ln.field_e - 1;
                }
                continue;
              }
              if (ch.field_N == 12) {
                eb.$cfr$intArgs$a$9d0e4b5217c4(-127, true);
                bg.a(new na(true), -93);
                continue;
              }
              if (ch.field_N == 67) {
                var2 = jg.a(true);
                var3 = 0;
                while (var3 < java.lang.reflect.Array.getLength(var2)) {
                  ((int[]) (var2))[var3] = rf.field_d.readInt(0);
                  var3++;
                }
                var3_ref = var2;
                var4_ref = ge.field_m;
                var5 = 0;
                while (var5 < 8) {
                  ((int[]) (var3_ref))[var5] = ec.a(((int[]) (var3_ref))[var5], ~((int[]) (var4_ref))[var5]);
                  var5++;
                }
                if (ln.field_h) {
                  var3_ref = ce.field_t;
                  var4_ref = var2;
                  var5 = 0;
                  while (var5 < 8) {
                    ((int[]) (var3_ref))[var5] = vn.a(((int[]) (var3_ref))[var5], ((int[]) (var4_ref))[var5]);
                    var5++;
                  }
                }
                var3_ref = ge.field_m;
                var4_ref = var2;
                var5 = 0;
                while (var5 < 8) {
                  ((int[]) (var3_ref))[var5] = vn.a(((int[]) (var3_ref))[var5], ((int[]) (var4_ref))[var5]);
                  var5++;
                }
                Projectile.c((byte) 10);
                continue;
              }
              if (ch.field_N == 60) {
                li.field_v = rf.field_d.readInt(0);
                h.field_G = rf.field_d.readInt(0);
                var2_int = 0;
                while (var2_int < 4) {
                  rn.field_D[var2_int] = rf.field_d.readInt(0);
                  var2_int++;
                }
                var2_int = 0;
                while (2 > var2_int) {
                  fe.field_D[var2_int] = rf.field_d.readInt(0);
                  var2_int++;
                }
                var2_int = 0;
                while (var2_int < va.field_k.length) {
                  va.field_k[var2_int] = 0;
                  var2_int++;
                }
                vn.d(-30);
                continue;
              }
              if (ch.field_N == 77) {
                var2_int = rf.field_d.readUnsignedByte((byte) -123);
                CombatWorld.field_S = new int[var2_int];
                var3 = 0;
                while (var2_int > var3) {
                  CombatWorld.field_S[var3] = rf.field_d.readUnsignedByte((byte) -123);
                  var3++;
                }
                continue;
              }
              if (ch.field_N == 78) {
                var2_int = 0;
                while (var2_int < 3) {
                  fm.field_f[var2_int] = rf.field_d.readUnsignedByte((byte) -65);
                  var2_int++;
                }
                var2_int = 0;
                while (true) {
                  if (jh.field_a.length > var2_int) {
                    jh.field_a[var2_int] = rf.field_d.readUnsignedShort((byte) -60);
                    var2_int++;
                    continue;
                  }
                  break;
                }
                if ((16 & fm.field_f[0]) != 0) {
                  stackIn_278_0 = 1;
                } else {
                  stackIn_278_0 = 0;
                }
                var2_int = stackIn_278_0;
                fm.field_f[0] = ec.a(fm.field_f[0], 15);
                if (fj.field_d <= fm.field_f[0]) {
                  if (var2_int == 0) {
                    NodeIterator.field_f = 1;
                  } else {
                    NodeIterator.field_f = 2;
                  }
                } else {
                  NodeIterator.field_f = 0;
                }
                if (!PacketBuffer.h((byte) -79)) {
                  continue;
                }
                km.field_a = CombatWorld.field_k;
                continue;
              }
              if (ch.field_N == 73) {
                var2_int = rf.field_d.readUnsignedByte((byte) -63) - 1;
                var3 = rf.field_d.readInt(0);
                var4 = rf.field_d.readInt(0);
                var5 = rf.field_d.readInt(0);
                var6 = rf.field_d.readInt(0);
                var7 = rf.field_d.readInt(0);
                if (var2_int < 2) {
                  lc.field_c = tj.a(var6, var4, var5, -var2_int + 65535, var7, param0 ^ 19, var2_int + 0, new int[]{var3}, 3);
                }
                qi.field_d = null;
                qm.a(true);
                bd.field_b.addLast(3, new ai((RgbSprite) null, db.a(vm.field_q, param0 - 102, new String[]{Integer.toString(var3 / 516)})));
                continue;
              }
              if (ch.field_N == 72) {
                var2_int = rf.field_d.readUnsignedShort((byte) -60);
                li.field_v = li.field_v + var2_int;
                if (var2_int <= 0) {
                  continue;
                }
                vn.d(param0 - 44);
                hj.field_F = var2_int;
                continue;
              }
              if (ch.field_N == 74 ||
                79 == ch.field_N) {
                var2_int = rf.field_d.readUnsignedByte((byte) -113);
                var3_ref = qg.field_o;
                if (79 == ch.field_N) {
                  var3_ref = c.field_r;
                }
                bd.field_b.addLast(3, new ai((RgbSprite) null, db.a((String) (var3_ref), -105, new String[]{t.field_e[var2_int]})));
                continue;
              }
              if (ch.field_N == 70) {
                rf.field_d.readUnsignedByte((byte) -67);
                continue;
              }
              if (ch.field_N == 57 ||
                ch.field_N == 58) {
                ol.b(true);
                var2_int = rf.field_d.readInt(param0 - 2);
                var3 = rf.field_d.readUnsignedByte((byte) -110);
                var4 = rf.field_d.readUnsignedByte((byte) -74);
                var5 = rf.field_d.readUnsignedByte((byte) -90);
                var6 = rf.field_d.readUnsignedByte((byte) -102);
                stackIn_330_0 = ((var6 & 1) == 0) ? 0 : 1;
                var7 = stackIn_330_0;
                stackIn_334_0 = ((2 & var6) == 0) ? 0 : 1;
                var8 = stackIn_334_0;
                stackIn_338_0 = (0 == rf.field_d.readUnsignedByte((byte) -81)) ? 0 : 1;
                var9 = stackIn_338_0;
                var10 = new String[rf.field_d.readUnsignedByte((byte) -90)];
                var11_int = -2;
                var12 = new int[var10.length][];
                var13_int = 0;
                while (true) {
                  stackIn_340_0 = ~var13_int;
                  stackIn_340_1 = ~var10.length;
                  if (stackIn_340_0 > stackIn_340_1) {
                    var10[var13_int] = rf.field_d.e((byte) 126);
                    array$0 = new int[rf.field_d.readUnsignedByte((byte) -63)];
                    var12[var13_int] = array$0;
                    stackIn_351_0 = 0;
                    var14 = stackIn_351_0;
                    while (var14 < var12[var13_int].length) {
                      var12[var13_int][var14] = rf.field_d.readUnsignedByte((byte) -123);
                      stackIn_340_0 = ~var12[var13_int][var14];
                      stackIn_340_1 = -256;
                      if (stackIn_340_0 == stackIn_340_1) {
                        var12[var13_int][var14] = -1;
                      }
                      var14++;
                    }
                    var13_int++;
                    continue;
                  }
                  break;
                }
                var11_int = rf.field_d.readByte((byte) -2);
                di.field_g = -1;
                qh.field_Yb = -2;
                jn.field_g = false;
                vl.field_v = false;
                lc.field_c = null;
                stackIn_351_0 = -1;
                if (stackIn_351_0 == var11_int) {
                  var11_int = -2;
                }
                var13 = new GameplayController(true, var2_int, var3, var10, var11_int, var9 != 0, var12, var4, var5, var7 != 0, var8 != 0);
                var13.field_w = rf.field_d.readInt(0);
                if (57 != ch.field_N) {
                  si.field_A = var13;
                  CombatWorld.field_G = true;
                  ol.l(0);
                } else {
                  fk.field_i = var13;
                  ob.field_y = true;
                  in.c(2);
                  h.i(-1);
                  ol.l(0);
                }
                vb.field_g = -1;
                da.field_d = false;
                Sprite.field_k = true;
                continue;
              }
              if (ch.field_N == 59) {
                if (ob.field_y ||
                  CombatWorld.field_G) {
                  ol.b(true);
                  if (ob.field_y) {
                    fk.field_i.a((byte) -128, false);
                  }
                  lc.field_e = true;
                  vb.field_g = -2;
                  CombatWorld.field_G = false;
                  ob.field_y = false;
                  Sprite.field_k = false;
                  vl.field_v = true;
                  ln.field_e = 0;
                  vn.c(104);
                }
                da.field_d = false;
                continue;
              }
              var2 = null;
              if (!ob.field_y) {
                if (CombatWorld.field_G) {
                  var2 = si.field_A;
                }
              } else {
                var2 = fk.field_i;
              }
              if (null != var2) {
                if (ch.field_N == 61) {
                  var3 = rf.field_d.readUnsignedByte((byte) -117);
                  var4_ref = ((GameplayController) (var2)).world.findSentinelForPlayer(var3, -128);
                  var5_ref_je = (SentinelCommand) (((Sentinel) (var4_ref)).secondaryCommands.b(1063677678));
                  if (var5_ref_je != null) {
                    var5_ref_je.unlink(param0 ^ 6);
                  }
                  var5_ref_je = (SentinelCommand) (((Sentinel) (var4_ref)).pendingCommands.b(1063677678));
                  if (var5_ref_je == null) {
                    continue;
                  }
                  var5_ref_je.unlink(4);
                  continue;
                }
                if (ch.field_N == 69) {
                  var3 = rf.field_d.readUnsignedByte((byte) -85);
                  var4 = rf.field_d.readUnsignedByte((byte) -80);
                  var5 = rf.field_d.readUnsignedByte((byte) -120);
                  var6 = rf.field_d.readInt(0);
                  var7 = rf.field_d.readInt(0);
                  var8 = rf.field_d.readInt(param0 ^ 2);
                  var9 = rf.field_d.readInt(param0 ^ 2);
                  if (var5 == 255) {
                    var5 = -1;
                  }
                  var10_ref = new SentinelCommand(var4, var5, var6);
                  var10_ref.aimAngle = var9;
                  var10_ref.targetWorldX = var7;
                  var10_ref.targetWorldY = var8;
                  var11 = ((GameplayController) (var2)).world.findSentinelForPlayer(var3, -128);
                  if (var4 == 10) {
                  }
                  if (null == var11) {
                    continue;
                  }
                  var11.scheduleCommand((byte) 79, var10_ref);
                  continue;
                }
                if (ch.field_N == 76) {
                  var3 = rf.field_d.readUnsignedByte((byte) -120);
                  var4 = rf.field_d.readInt(0);
                  ((GameplayController) (var2)).world.a(var4, 28669, var3);
                  continue;
                }
                if (ch.field_N == 71) {
                  if (((GameplayController) (var2)).field_i - 100 > ((GameplayController) (var2)).field_w &&
                    ((GameplayController) (var2)).world.simulationTick < ((GameplayController) (var2)).field_w) {
                    ((GameplayController) (var2)).field_w = -100 + ((GameplayController) (var2)).field_i;
                  }
                  ((GameplayController) (var2)).field_i = rf.field_d.readInt(param0 ^ 2);
                  var3 = rf.field_d.readInt(0);
                  var4 = rf.field_d.readInt(param0 - 2);
                  if (((GameplayController) (var2)).field_l >= ((GameplayController) (var2)).world.simulationTick) {
                    continue;
                  }
                  ((GameplayController) (var2)).field_j = var3;
                  ((GameplayController) (var2)).field_l = var4;
                  continue;
                }
                if (62 == ch.field_N) {
                  ((GameplayController) (var2)).field_i = rf.field_d.readInt(0);
                  ((GameplayController) (var2)).field_z = true;
                  continue;
                }
                if (ch.field_N == 63) {
                  ((GameplayController) (var2)).world.field_V = rf.field_d.readUnsignedByte((byte) -92);
                  if (null == fk.field_i) {
                    continue;
                  }
                  in.c(2);
                  continue;
                }
                if (ch.field_N == 64) {
                  ((GameplayController) (var2)).world.field_hb = rf.field_d.readUnsignedByte((byte) -111);
                  continue;
                }
                if (ch.field_N == 65) {
                  ((GameplayController) (var2)).world.field_X = rf.field_d.readUnsignedByte((byte) -91);
                  if (null == fk.field_i) {
                    continue;
                  }
                  h.i(-1);
                  continue;
                }
                if (66 == ch.field_N) {
                  ((GameplayController) (var2)).field_N = rf.field_d.readUnsignedByte((byte) -85);
                  if (null == fk.field_i) {
                    continue;
                  }
                  h.i(-1);
                  continue;
                }
              }
              this.h(param0 + 50);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            gj.a(0, 0);
            stackIn_440_0 = -2;
            stackIn_440_1 = pm.field_T;
          }
          if (stackIn_440_0 == stackIn_440_1 &&
            vb.field_g == -2) {
            vl.field_v = true;
          }
          if (vl.field_v) {
            ln.field_e = 0;
          }
          if (ri.a(16731221)) {
            var2_int = this.i((byte) -112);
            if (0 == var2_int ||
              var2_int == 1) {
              wh.a(2, -26077);
              uc.a(true, 3);
              hk.a((byte) 86, 4);
              vf.a(false, 6);
              ml.a(param0 - 74, 7);
              gm.a((byte) -92);
              if (1 != var2_int) {
                if (bg.field_H) {
                  ob.field_y = false;
                  Sprite.field_k = false;
                  CombatWorld.field_G = false;
                  lc.field_e = true;
                  NodeIterator.field_d = true;
                  if (!ob.field_y) {
                    q.a(0, false, param0 - 3, 0);
                    if (var15 != 0) {
                      ll.field_s = rl.field_e;
                      q.a(11, false, -1, 0);
                    }
                  } else {
                    ll.field_s = rl.field_e;
                    q.a(11, false, -1, 0);
                  }
                  ol.b(true);
                  i.field_e[pm.field_T].a(false, 0, -102);
                  bg.field_H = false;
                  vn.c(12);
                }
                rc.field_n = false;
                da.field_d = false;
                if (var15 != 0) {
                  rc.field_n = true;
                  da.field_d = true;
                }
              } else {
                rc.field_n = true;
                da.field_d = true;
              }
            }
            var3 = 0;
            if (var2_int == 2) {
              var3 = 1;
            }
            if (bg.field_H ||
              rc.field_n ||
              da.field_d) {
              var3 = 1;
            }
            if (!ri.a(16731221)) {
              var3 = 0;
            }
            if (var3 != 0) {
              of.a(10);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (var2), "SteelSentinels.DA(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          SteelSentinels.j((byte) -10);
          NodeDeque.c((byte) -29);
          wd.a(0);
          hf.a(true);
          fj.a((byte) -120);
          rg.c(125);
          SceneWidget.a(false);
          i.a((byte) 100);
          uc.a(false);
          ci.a(false);
          am.a(2);
          FunOrbClient.h((byte) -111);
          od.a(false);
          GameApplet.e(48);
          fk.a((byte) -64);
          wc.a(true);
          a.c(72);
          SoftwareRaster.a();
          ResourceArchive.b(false);
          un.a(false);
          if (param0 < 22) {
            this.a(48);
          }
          PacketBuffer.d(-125);
          mm.b(122);
          fl.a(124);
          of.a((byte) 84);
          in.b(127);
          ph.a(80);
          vh.a(-67);
          be.a((byte) -34);
          pa.a((byte) 56);
          ib.a((byte) -119);
          na.a(2);
          im.a((byte) -88);
          wn.a((byte) -126);
          al.b(30);
          he.a(690);
          cj.a(-1);
          nn.b((byte) 30);
          jg.b((byte) -109);
          ng.a((byte) -82);
          ub.a(94);
          SentinelDesigner.h((byte) -104);
          GameplayController.b(750);
          nd.a(-107);
          hh.a(false);
          vk.c((byte) -91);
          cb.b(-1);
          ta.a((byte) -35);
          rj.a(83);
          sg.a((byte) -45);
          jn.a((byte) 79);
          IntrusiveNode.c(4433);
          cd.a(false);
          di.a(-1);
          bi.a((byte) 80);
          ik.b(79);
          lc.b(1);
          o.a(-98);
          dj.a((byte) 94);
          me.a(-118);
          CipherPacketBuffer.e(true);
          IsaacRandom.a((byte) -94);
          gj.a(-102);
          tf.a((byte) 26);
          lb.j(0);
          dh.c((byte) 93);
          ve.b((byte) -60);
          CombatWorld.g(0);
          ArticulatedPart.d((byte) 20);
          rm.d((byte) -18);
          qj.c(21841);
          NodeIterator.e(5370);
          BitmapFont.a();
          vf.a(-119);
          jh.a(30706);
          ba.a(false);
          SentinelCommand.a((byte) -110);
          Projectile.h(31554);
          Sentinel.c((byte) 58);
          BattleTerrain.b(false);
          ic.a(false);
          NodeHashTable.c(96);
          hj.e(0);
          ab.a();
          ej.e(-93);
          tb.f();
          sj.b(false);
          hk.d((byte) -65);
          dk.b((byte) -91);
          cc.k(102);
          lj.a((byte) 109);
          ArchiveIndex.a(0);
          vb.a(-1);
          ArchiveProvider.b(38);
          wi.g(573);
          DualNode.f(8191);
          rd.a(8192);
          eh.b(0);
          ka.f((byte) 127);
          fg.o((byte) -29);
          ki.l((byte) -47);
          bf.m((byte) -111);
          k.n((byte) 107);
          vi.a(false);
          pd.i(-48);
          pm.l(320);
          qc.j(60);
          ll.a(103);
          uj.a(-1);
          uk.c();
          pj.a();
          dg.a((byte) -84);
          ri.d(0);
          tj.a(true);
          Sprite.a((byte) 66);
          PartInstruction.a((byte) 17);
          ne.g(-23261);
          oc.a(-1);
          qi.a(-104);
          ad.a(0);
          id.j(127);
          dn.b(false);
          ql.d((byte) 91);
          dd.a(0);
          td.j(-114);
          oh.a(1);
          m.a(64);
          qm.a((byte) 37);
          te.a((byte) -83);
          ak.a(124);
          gm.a(-1);
          gf.b(-111);
          rb.a((byte) -82);
          en.a(true);
          kk.a((byte) -105);
          pl.c(true);
          ai.e(0);
          dc.a(-38);
          DualNodeDeque.b((byte) 26);
          qh.j(15);
          uf.a(24);
          nf.a(55);
          ol.k(-16);
          ParticleEffect.h(-185837884);
          ua.a((byte) 115);
          sn.b(0);
          bd.a(-23333);
          og.a((byte) -88);
          la.a((byte) -112);
          an.a((byte) -63);
          f.e(-2);
          qa.h(10);
          rc.a(15598);
          df.i(-58);
          CachedArchiveProvider.c(2);
          ok.a(true);
          fe.e((byte) 21);
          se.a((byte) -114);
          jd.l(0);
          lf.b();
          jj.b(-123);
          pe.a((byte) -117);
          tm.a(5);
          ec.b((byte) 24);
          fc.a(true);
          sa.a(false);
          pi.b((byte) 61);
          mc.a(23225);
          IntKeyLookup.b((byte) -81);
          gb.a(false);
          oi.a();
          nh.a(-120);
          ni.a(42);
          rl.a(0);
          pf.a(true);
          wa.c(-21121);
          b.a(0);
          qg.b((byte) 105);
          da.a(true);
          lh.c((byte) 19);
          oa.a((byte) -105);
          ug.g(475);
          ac.k((byte) 38);
          bb.h((byte) 127);
          dl.g(-19969);
          qe.a(-31914);
          sh.a(-3274);
          kb.a(5);
          ln.b(0);
          mg.k(-31097);
          co.a((byte) -13);
          oe.a(272);
          mn.g(1);
          ao.g(0);
          nc.a((byte) 127);
          db.a(true);
          vg.a(-61);
          gl.c(0);
          ti.b(65280);
          ed.a((byte) 99);
          vc.b(-13);
          ue.b((byte) -96);
          p.a();
          ce.a((byte) 77);
          bh.a((byte) -98);
          Explosion.h(-2107133436);
          ig.a((byte) 121);
          qf.a(false);
          mj.d((byte) -72);
          el.b(true);
          ca.c((byte) -73);
          bj.a(7);
          hc.f((byte) 67);
          bc.i((byte) -108);
          jf.d(true);
          gd.l(-12930);
          bk.g(-47);
          ij.a((byte) -42);
          ma.c(false);
          lk.h(-30289);
          ff.h(-3413);
          sb.g(108);
          ia.c((byte) 103);
          wb.a((byte) 87);
          nj.a(false);
          nl.f((byte) -122);
          um.g(32);
          cl.a(5);
          vn.d(false);
          re.l(0);
          ch.a((byte) -68);
          ha.c(true);
          si.a(24);
          ge.b(26);
          g.a(122);
          h.h(0);
          d.h(12);
          q.a((byte) -127);
          hb.a(true);
          bg.g(-1008);
          fm.a(4314);
          le.i(124);
          r.c((byte) -117);
          mf.a();
          va.a(false);
          l.a((byte) 22);
          wh.a((byte) 46);
          kf.d(90);
          tc.a(false);
          hg.a(108);
          ud.d(20000000);
          pc.f(100);
          jm.d(-89);
          kh.b(100);
          bl.a(false);
          ag.b(9);
          li.d(-30874);
          s.a((byte) -86);
          ui.h(-13);
          ah.b(false);
          sl.a(-104);
          hl.e(0);
          cf.a((byte) 9);
          c.a((byte) 127);
          rh.b(false);
          dm.a(-127);
          rf.c(126);
          kc.d(-1341);
          de.a(7);
          fb.b((byte) -119);
          pg.c(28873);
          on.b((byte) -116);
          sf.a(false);
          ml.a(107);
          e.a((byte) -89);
          bm.a((byte) -90);
          aj.d(-1);
          km.a((byte) -27);
          t.a(-13375);
          hm.a((byte) 105);
          ob.d(18601);
          rn.d(3);
          ke.b((byte) 12);
          il.c(-58);
          ei.c(1);
          vm.d((byte) -128);
          ih.c(18384);
          nm.d((byte) 116);
          eb.c(81);
          tk.d((byte) -113);
          ja.a(true);
          vl.a((byte) 29);
          vd.b((byte) 56);
          v.c(true);
          ef.b(8421504);
          this.field_t = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.V(" + param0 + ')');
        }
    }

    static {
        field_I = "SPAWN DRONES";
        field_H = "Allow spectators?";
    }
}
