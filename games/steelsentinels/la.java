/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static int field_b;
    static int field_a;
    static kg field_c;

    final static void a(boolean param0, pc param1) {
        if (param0) {
          return;
        }
        try {
          ll.field_e.a(param1.field_v);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "la.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, cc param1) {
        cc var2 = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = SteelSentinels.obfuscationControl;
        try {
          param1.unlink(4);
          var2 = (cc) (q.field_m.first(13058));
          if (param0 <= 123) {
            field_a = -70;
          }
          while (var2 != null) {
            if (var2.a(param1, -81)) {
              var2 = (cc) (q.field_m.next((byte) -25));
              continue;
            }
            break;
          }
          if (var2 == null) {
            q.field_m.addLast(3, param1);
          } else {
            IsaacRandom.insertNodeBefore(var2, 30, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_12_0 = var2_ref;
          stackIn_12_1 = new StringBuilder().append("la.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_52_3 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        boolean stackIn_58_2 = false;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        boolean stackIn_67_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RgbSprite var2_ref_wk = null;
        int var3 = 0;
        RgbSprite var4_ref_wk = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var6_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        RgbSprite var10 = null;
        int var11 = 0;
        RgbSprite var12 = null;
        String var14 = null;
        RgbSprite var16 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int var2Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var3Lifetime5;
        int var4Lifetime1;
        int var4Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10_intLifetime1;
        int var10_intLifetime2;
        int var10_intLifetime3;
        var11 = SteelSentinels.obfuscationControl;
        try {
          if (null != ta.field_d &&
            ta.field_d.a(true) &&
            ta.field_d.a("benefits", (byte) 90) &&
            fb.field_h != null &&
            fb.field_h.a(true) &&
            fb.field_h.a("benefits", (byte) 90)) {
            c.field_o = rl.a(ta.field_d, "benefits", "headline", false);
            wb.field_i = rl.a(ta.field_d, "benefits", "blurbpane", false);
            ba.field_e = rl.a(ta.field_d, "benefits", "button", false);
            da.field_f = rl.a(ta.field_d, "benefits", "signup_text", false);
            bc.field_pb = rl.a(ta.field_d, "benefits", "menu_text", false);
            bc.field_ub = rl.a(ta.field_d, "benefits", "button_frame", false);
            NodeIterator.field_b = rl.a(ta.field_d, "benefits", "arrow", false);
            nn.field_g = (BitmapFont) ((Object) vd.a(fb.field_h, "benefits", ta.field_d, -1, "large_font"));
            wn.field_a = (BitmapFont) ((Object) vd.a(fb.field_h, "benefits", ta.field_d, -1, "small_font"));
            var27 = SoftwareRaster.field_g;
            var2 = SoftwareRaster.field_c;
            var3 = SoftwareRaster.field_j;
            SoftwareRaster.b(ti.field_n);
            var4_ref_wk = new RgbSprite(NodeIterator.field_b.field_A + 4, 4 + NodeIterator.field_b.field_F);
            var4_ref_wk.d();
            NodeIterator.field_b.c(2, 2, dc.field_h);
            uj.a(2, 0, 0, (byte) -19, var4_ref_wk.field_F, 1, var4_ref_wk, var4_ref_wk.field_A);
            NodeIterator.field_b = var4_ref_wk;
            in.field_e = NodeIterator.field_b.a();
            var12 = new RgbSprite(195, 221);
            var6 = var12.field_A / 2;
            var12.d();
            nn.field_g.a(db.a(hg.field_a, -127, new String[]{vb.field_d}), var6, 40, 16777215, -1);
            wn.field_a.a(db.a(SceneWidget.field_Bb, -119, new String[]{vb.field_d}), var6, 60, 16777215, -1);
            nn.field_g.a(db.a(rn.field_z, -40, new String[]{rg.field_c}), var6, 110, 16777215, -1);
            wn.field_a.a(db.a(jk.field_f, -25, new String[]{rg.field_c}), var6, 130, 16777215, -1);
            nn.field_g.a(ol.field_Xb, var6, 180, 16777215, -1);
            wn.field_a.a(wn.field_c, var6, 200, 16777215, -1);
            uj.a(3, 0, 0, (byte) -45, var12.field_F, 1, var12, var12.field_A);
            wb.field_i.d();
            var12.a(18 - wb.field_i.field_D, -wb.field_i.field_H + 241);
            for (var7 = 0; ta.field_f.length > var7; var7++) {
              bm.field_R[var7].d();
              wn.field_a.a(ta.field_f[var7], 3, 3, bm.field_R[var7].field_A - 6, -6 + bm.field_R[var7].field_F, dc.field_h, -1, 1, 1, wn.field_a.field_F + wn.field_a.field_G);
              uj.a(3, 0, 0, (byte) -79, bm.field_R[var7].field_F, 1, bm.field_R[var7], bm.field_R[var7].field_A);
            }
            ta.field_f = null;
            tf.field_e = da.field_f.g();
            tf.field_e.d();
            ej.a(SoftwareRaster.field_j * 2 / 3, 0, SoftwareRaster.field_c, 64, 0, 40);
            SoftwareRaster.a(var27, var2, var3);
            SoftwareRaster.a(ti.field_n);
            mc.field_a = (ba.field_e.field_F - bc.field_ub.field_F) / 2 + 390;
            ta.field_d = null;
            rn.field_u = 434 + (-bc.field_ub.field_A + ba.field_e.field_A) / 2;
            aj.field_s = 231 + (-bc.field_ub.field_A + ba.field_e.field_A) / 2;
            od.field_m = (ba.field_e.field_F - bc.field_ub.field_F) / 2 + 390;
          }
          if (null == jf.field_kb) {
            return;
          }
          var1_int = -79 / ((-22 - param0) / 42);
          if (hl.field_r != null &&
            null != nn.field_g) {
            var28 = SoftwareRaster.field_g;
            var3Lifetime1 = SoftwareRaster.field_c;
            var4 = SoftwareRaster.field_j;
            SoftwareRaster.b(ti.field_n);
            var14 = db.a(CombatWorld.field_x, -69, new String[]{cm.field_m[wc.field_j]});
            var6Lifetime1 = nn.field_g.a(var14, pa.field_b);
            var7Lifetime1 = nn.field_g.a(var14, pa.field_b, nn.field_g.field_G + nn.field_g.field_F);
            var8 = sg.field_e + (-var6Lifetime1 + pa.field_b) / 2;
            var9 = ij.field_W + (ci.field_g - var7Lifetime1) / 2;
            var8 -= 3;
            var6Lifetime1 += 6;
            if (var8 < 0) {
              var10_int = -var8;
              var8 = var8 + var10_int;
              sg.field_e = sg.field_e + var10_int;
              vl.field_t = vl.field_t - var10_int;
              hl.field_r.field_D = hl.field_r.field_D + var10_int;
              var6Lifetime1 = var6Lifetime1 + 2 * var10_int;
              hl.field_r.field_z = hl.field_r.field_z + var10_int * 2;
            }
            var7Lifetime1 += 6;
            var9 -= 3;
            if (hl.field_r.field_z < var8 + var6Lifetime1) {
              var10_intLifetime1 = var8 + var6Lifetime1 - hl.field_r.field_z;
              hl.field_r.field_D = hl.field_r.field_D + var10_intLifetime1;
              var6Lifetime1 = var6Lifetime1 + 2 * var10_intLifetime1;
              hl.field_r.field_z = hl.field_r.field_z + var10_intLifetime1 * 2;
              var8 = var8 + var10_intLifetime1;
              sg.field_e = sg.field_e + var10_intLifetime1;
              vl.field_t = vl.field_t - var10_intLifetime1;
            }
            if (var9 < 0) {
              var10_intLifetime2 = -var9;
              ij.field_W = ij.field_W + var10_intLifetime2;
              var9 = var9 + var10_intLifetime2;
              hl.field_r.field_B = hl.field_r.field_B + 2 * var10_intLifetime2;
              ej.field_y = ej.field_y - var10_intLifetime2;
              hl.field_r.field_H = hl.field_r.field_H + var10_intLifetime2;
              var7Lifetime1 = var7Lifetime1 + var10_intLifetime2 * 2;
            }
            if (var7Lifetime1 + var9 > hl.field_r.field_B) {
              var10_intLifetime3 = -hl.field_r.field_B + var9 + var7Lifetime1;
              var9 = var9 + var10_intLifetime3;
              hl.field_r.field_B = hl.field_r.field_B + 2 * var10_intLifetime3;
              var7Lifetime1 = var7Lifetime1 + 2 * var10_intLifetime3;
              hl.field_r.field_H = hl.field_r.field_H + var10_intLifetime3;
              ij.field_W = ij.field_W + var10_intLifetime3;
              ej.field_y = ej.field_y - var10_intLifetime3;
            }
            hl.field_r.e();
            var10 = new RgbSprite(hl.field_r.field_z, hl.field_r.field_B);
            var10.d();
            nn.field_g.a(var14, sg.field_e, ij.field_W, pa.field_b, ci.field_g, 16777215, -1, 1, 1, nn.field_g.field_F + nn.field_g.field_G);
            uj.a(3, 0, 0, (byte) -119, var10.field_B, 1, var10, var10.field_z);
            hl.field_r.d();
            var10.a(0, 0);
            fa.field_e = new RgbSprite(640, 480);
            fa.field_e.d();
            hl.field_r.d((hl.field_r.field_z >> 1) + vl.field_t, (hl.field_r.field_B >> 1) + ej.field_y, be.field_e, 4096);
            hl.field_r = null;
            fa.field_e.f();
            SoftwareRaster.a(var28, var3Lifetime1, var4);
            SoftwareRaster.a(ti.field_n);
          }
          if (ij.field_P != null &&
            null != wn.field_a) {
            var29 = SoftwareRaster.field_g;
            var3Lifetime2 = SoftwareRaster.field_c;
            var4Lifetime1 = SoftwareRaster.field_j;
            SoftwareRaster.b(ti.field_n);
            var16 = new RgbSprite(412, 43);
            var6_ref_String = db.a(dd.field_l, -109, new String[]{ij.field_P});
            ij.field_P = null;
            var16.d();
            wn.field_a.a(var6_ref_String, 3, 3, var16.field_A - 6, var16.field_F - 6, 16777215, -1, 0, 1, wn.field_a.field_G + wn.field_a.field_F);
            uj.a(3, 0, 0, (byte) -42, var16.field_F, 1, var16, var16.field_A);
            jf.field_kb.d();
            var16.a(-jf.field_kb.field_D + 199, -jf.field_kb.field_H + 83);
            SoftwareRaster.a(var29, var3Lifetime2, var4Lifetime1);
            SoftwareRaster.a(ti.field_n);
          }
          if (qi.field_i != null &&
            wn.field_a != null) {
            var30 = SoftwareRaster.field_g;
            var3Lifetime3 = SoftwareRaster.field_c;
            var4Lifetime2 = SoftwareRaster.field_j;
            SoftwareRaster.b(ti.field_n);
            var5 = wn.field_a.a(ia.field_j, 640) + 6;
            var6Lifetime2 = 20 + (var5 + qi.field_i.field_z);
            var7Lifetime2 = 427 - var6Lifetime2 / 2;
            var8Lifetime1 = qi.field_i.field_z + (var7Lifetime2 + 20);
            jf.field_kb.d();
            wn.field_a.b(ia.field_j, -jf.field_kb.field_D + var8Lifetime1, wn.field_a.field_F + wn.field_a.field_G + (155 - jf.field_kb.field_H), 16777215, -1);
            uj.a(3, var8Lifetime1 - jf.field_kb.field_D - 4, 155 - jf.field_kb.field_H, (byte) -60, 50, 1, jf.field_kb, var5);
            var9Lifetime1 = 155 - jf.field_kb.field_H - (-wn.field_a.field_F + (-wn.field_a.field_G + qi.field_i.field_B - 3)) / 2;
            qi.field_i.a(-jf.field_kb.field_D + var7Lifetime2, var9Lifetime1);
            SoftwareRaster.a(var30, var3Lifetime3, var4Lifetime2);
            SoftwareRaster.a(ti.field_n);
            qi.field_i = null;
          }
          SoftwareRaster.b(ti.field_n);
          SoftwareRaster.a(16, 16, 608, 112, 15, Sentinel.field_bc, an.field_b);
          SoftwareRaster.a(231, 144, 393, 232, 15, Sentinel.field_bc, an.field_b);
          if (c.field_o != null) {
            c.field_o.a(0, 0);
          }
          if (null != wb.field_i) {
            wb.field_i.a(0, 0);
          }
          jf.field_kb.a(0, 0);
          if (null != fa.field_e) {
            fa.field_e.a(0, 0);
          }
          if (null != ba.field_e &&
            null != bc.field_ub) {
            ba.field_e.a(231, 390);
            var2_ref_wk = da.field_f;
            if (jh.field_i.field_e == 0) {
              var2_ref_wk = tf.field_e;
            }
            var2_ref_wk.a(0, 0);
            stackIn_51_0 = 40;
            stackIn_51_1 = 20612;
            stackIn_51_2 = ik.field_e;
            if (0 != jh.field_i.field_e) {
              stackIn_52_3 = 3;
            } else {
              stackIn_52_3 = 4;
            }
            var3Lifetime4 = stackIn_51_0 + (dd.a(stackIn_51_1, stackIn_51_2 << stackIn_52_3) * 40 >> 16);
            if (var3Lifetime4 > 0) {
              ba.field_e.a(230, 389, var3Lifetime4);
              ba.field_e.a(232, 389, var3Lifetime4);
              ba.field_e.a(232, 391, var3Lifetime4);
              ba.field_e.a(230, 391, var3Lifetime4);
              var2_ref_wk.a(1, 1, var3Lifetime4);
              var2_ref_wk.a(-1, 1, var3Lifetime4);
              var2_ref_wk.a(1, -1, var3Lifetime4);
              var2_ref_wk.a(-1, -1, var3Lifetime4);
            }
            stackIn_57_0 = mc.field_a;
            stackIn_57_1 = -28;
            stackIn_58_2 = (jh.field_i.field_e == 0);
            sf.$cfr$intArgs$a$c79a3df4369d(stackIn_57_0, stackIn_57_1, stackIn_58_2, aj.field_s);
          }
          if (null != ba.field_e &&
            null != bc.field_ub) {
            ba.field_e.a(434, 390);
            bc.field_pb.a(0, 0);
            if (jh.field_i.field_e == 1) {
              ej.a(ba.field_e.field_F * 7 / 12, 436, ba.field_e.field_A - 4, 64, 392, 40);
            }
            stackIn_66_0 = od.field_m;
            stackIn_66_1 = -3;
            stackIn_67_2 = (jh.field_i.field_e == 1);
            sf.$cfr$intArgs$a$c79a3df4369d(stackIn_66_0, stackIn_66_1, stackIn_67_2, rn.field_u);
          }
          if (NodeIterator.field_b != null) {
            var2Lifetime1 = 357 - NodeIterator.field_b.field_B / 2;
            NodeIterator.field_b.a(-NodeIterator.field_b.field_z + 269, var2Lifetime1);
            in.field_e.a(586, var2Lifetime1);
            if (pi.field_c > var2Lifetime1 &&
              pi.field_c < NodeIterator.field_b.field_F + var2Lifetime1) {
              var3Lifetime5 = 40 + (dd.a(20612, ik.field_e << 4) * 40 >> 16);
              if (0 < var3Lifetime5) {
                if (oh.field_f > -NodeIterator.field_b.field_A + 269 &&
                  oh.field_f < 269) {
                  NodeIterator.field_b.a(-1 - NodeIterator.field_b.field_z + 269, -1 + var2Lifetime1, var3Lifetime5);
                  NodeIterator.field_b.a(-NodeIterator.field_b.field_z + 269 + 1, -1 + var2Lifetime1, var3Lifetime5);
                  NodeIterator.field_b.a(-1 + (269 - NodeIterator.field_b.field_z), var2Lifetime1 + 1, var3Lifetime5);
                  NodeIterator.field_b.a(269 - NodeIterator.field_b.field_z + 1, 1 + var2Lifetime1, var3Lifetime5);
                } else {
                  if (oh.field_f > 586 &&
                    586 + NodeIterator.field_b.field_A > oh.field_f) {
                    in.field_e.a(585, var2Lifetime1 - 1, var3Lifetime5);
                    in.field_e.a(587, var2Lifetime1 - 1, var3Lifetime5);
                    in.field_e.a(585, 1 + var2Lifetime1, var3Lifetime5);
                    in.field_e.a(587, var2Lifetime1 + 1, var3Lifetime5);
                  }
                }
              }
            }
            rg.b(30);
            bm.field_R[lh.field_r].a(269, 340);
          } else {
            rg.b(30);
            bm.field_R[lh.field_r].a(269, 340);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "la.E(" + param0 + ')');
        }
    }

    final static void a(byte[] param0, int param1, int[] param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        cc var8 = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          if (param4 != -32513) {
            var8 = (cc) null;
            la.a(126, (cc) null);
          }
          var5_int = 0;
          while (true) {
            if (IntrusiveNode.field_c.length <= var5_int) {
              return;
            }
            param1 = IntrusiveNode.field_c[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param1;
              param1--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param3 = um.field_bb[incrementValue$1];
              dupTemp$2 = param0[param3];
              dupTemp$3 = param2[dupTemp$2];
              param2[dupTemp$2] = dupTemp$3 + 1;
              um.field_bb[dupTemp$3] = param3;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("la.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 124 / ((-23 - param0) / 49);
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        boolean stackIn_11_2 = false;
        int stackIn_13_3;
        int stackIn_13_4;
        int stackIn_13_5;
        int stackIn_13_6;
        int stackIn_13_7;
        boolean stackIn_14_8 = false;
        fe.c((byte) 123);
        if (nf.field_b != null) {
          stackIn_6_0 = (he.a((int) nf.field_b.field_Sb[2], false, nf.field_b.field_wc)) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var2 = stackIn_6_0;
        stackIn_9_0 = 15;
        stackIn_9_1 = jj.field_d;
        stackIn_11_2 = (ob.field_y) || (CombatWorld.field_G);
        stackIn_13_3 = param0;
        stackIn_13_4 = 0;
        stackIn_13_5 = 72;
        stackIn_13_6 = var2;
        stackIn_13_7 = 11;
        stackIn_14_8 = (kg.field_Vb <= 50) ? false : true;
        bl.a(stackIn_9_0, stackIn_9_1, stackIn_11_2, stackIn_13_3, stackIn_13_4, stackIn_13_5, stackIn_13_6 != 0, stackIn_13_7, stackIn_14_8, 14, param1, true);
        if (ParticleEffect.field_J) {
          mm.field_g.a(57, (byte) -117);
          ParticleEffect.field_J = false;
        }
        if (of.field_c) {
          mm.field_g.a(10, (byte) -117);
          of.field_c = false;
        }
    }

    static {
        field_a = -1;
        field_b = 200;
    }
}
