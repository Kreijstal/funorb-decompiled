/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class ZombieDawn extends GameLoopApplet {
    private boolean field_F;
    static Js5Archive field_H;
    static long[] field_E;
    private StringBuilder field_I;
    private StringBuilder field_G;
    static Font field_K;
    static String field_D;
    public static int field_J;

    final void onStartup(byte param0) {
        this.a(41, 7, 11, false, 9, 0, 1, 10);
        int var2 = 89 / ((35 - param0) / 49);
        oj.field_d = new tl();
        this.startWithLoader(oj.field_d, (byte) 14);
        rj var3 = new rj();
        var3.selectChannelBank(128, (byte) -128, 9);
        ac.initializeAudioOutputs(vh.field_a, true, (java.awt.Component) ((Object) cj.field_d), var3, 22050, -97);
        this.a(false, true, true, false, -6046);
    }

    final boolean isConnectionBusy(int param0) {
        if (param0 != 10) {
          field_E = (long[]) null;
          return false;
        }
        return false;
    }

    public final boolean onKeyTyped(char param0, int param1, int param2) {
        if (null != GameApplet.field_c &&
          sg.field_eb == GameApplet.field_c) {
          return GameApplet.field_c.handleKeyPress(param1, 65793, param0);
        }
        if (param2 != 20) {
          return true;
        }
        return false;
    }

    public final void drawFrame(int param0) {
        al stackIn_5_0 = null;
        al var2;
        tj var2_ref;
        int var3;
        String var4_ref_String;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        al var17;
        Runtime var18;
        int var3Lifetime1;
        int var5Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var5Lifetime1Lifetime1;
        var16 = field_J;
        Rasterizer.clear();
        if (sg.field_eb != GameApplet.field_c) {
          if (GameApplet.field_c.field_d == 0) {
            stackIn_5_0 = sg.field_eb;
          } else {
            stackIn_5_0 = GameApplet.field_c;
          }
          var17 = stackIn_5_0;
          var2 = var17;
          if (oj.field_d.field_n &&
            po.field_xb >= 16) {
            po.field_xb = 15;
          }
          if (16 <= po.field_xb) {
            sg.field_eb.drawBackground((byte) 108);
            sg.field_eb.drawScreen((byte) -102);
            var17.drawTransitionFade(512 - (po.field_xb << 4), (byte) -128, true);
          } else {
            GameApplet.field_c.drawBackground((byte) 120);
            GameApplet.field_c.drawScreen((byte) -118);
            var17.drawTransitionFade(po.field_xb << 4, (byte) 46, false);
          }
        } else {
          GameApplet.field_c.drawBackground((byte) 112);
          GameApplet.field_c.drawScreen((byte) -86);
        }
        boolean decompiledFrameRemainder0 = true;
        if (oj.field_d.field_n && (0.0f < oj.field_d.field_b ||
          this.field_F)) {
          this.field_F = true;
          var2_ref = sg.field_jb;
          var3 = 380;
          var4_ref_String = jh.field_l;
          var5 = ((Font) ((Object) var2_ref)).textWidth(var4_ref_String);
          if (var3 > var5) {
            var5 = var3 + 20;
          }
          var6 = 100;
          var7 = nh.field_G;
          var8 = WhirlpoolHasher.field_d;
          var9 = -(var6 / 2) + var7;
          var10 = -(var5 / 2) + var8 - 10;
          var11 = 10 + (var5 / 2 + var8);
          var12 = var6 / 2 + var7;
          Mover.intersectClipIntArgs(var9, 99, var11, var12, var10);
          if (WhirlpoolHasher.field_e == 640 &&
            480 == nh.field_P) {
            qk.field_Hb[0].drawWithOffsets(0, 0);
            qk.field_Hb[0].drawAdditive(0, 0, 256);
          } else {
            var13 = WhirlpoolHasher.field_e / 128;
            var14 = nh.field_P / 96;
            qk.field_Hb[0].drawScaled(-var13, -var14, 2 * var13 + WhirlpoolHasher.field_e, var14 * 2 + nh.field_P);
            qk.field_Hb[0].drawScaledAdditive(-var13, -var14, WhirlpoolHasher.field_e + 2 * var13, var14 * 2 + nh.field_P, 150);
          }
          Rasterizer.setClip(var10, var9, var8, var7);
          pf.field_f.drawTransparent(var10, var9);
          Rasterizer.setClip(var8, var9, var11, var7);
          pf.field_f.drawTransparent(-pf.field_f.field_w + var11, var9);
          Rasterizer.setClip(var10, var7, var8, var12);
          pf.field_f.drawTransparent(var10, -pf.field_f.field_t + var12);
          Rasterizer.setClip(var8, var7, var11, var12);
          pf.field_f.drawTransparent(var11 - pf.field_f.field_w, -pf.field_f.field_t + var12);
          Rasterizer.setClip(var10, var9, var11, var12);
          ((Font) ((Object) var2_ref)).drawStringCentered(var4_ref_String, WhirlpoolHasher.field_d, nh.field_G, 2, -1);
          var13Lifetime1 = (int)(oj.field_d.field_b * (float)var3 / 100.0f);
          Rasterizer.fillRect(var8 - var3 / 2, 10 + var7, var3, 12, 0);
          Rasterizer.setClip(-(var3 / 2) + var8, var7 + 10, var8 + (-(var3 / 2) + var13Lifetime1), var7 + 22);
          if (WhirlpoolHasher.field_e == 640 &&
            480 == nh.field_P) {
            qk.field_Hb[3].drawWithOffsets(0, 0);
            qk.field_Hb[3].drawAdditive(0, 0, 150);
          } else {
            var14Lifetime1 = WhirlpoolHasher.field_e / 128;
            var15 = nh.field_P / 96;
            qk.field_Hb[3].drawScaled(-var14Lifetime1, -var15, var14Lifetime1 * 2 + WhirlpoolHasher.field_e, 2 * var15 + nh.field_P);
            qk.field_Hb[3].drawScaledAdditive(-var14Lifetime1, -var15, 2 * var14Lifetime1 + WhirlpoolHasher.field_e, 2 * var15 + nh.field_P, 150);
          }
          Rasterizer.drawRectOutline(-(var3 / 2) + var8, var7 + 10, var3, 12, 4458504);
          pa.popRasterState(param0 ^ 26807);
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_F = false;
        }
        if (lo.field_j >= 2 &&
          bn.field_f) {
          if (this.field_G == null) {
            this.field_G = new StringBuilder("Mem: 00000KiB");
            this.field_I = new StringBuilder("FPS: 00");
          }
          if (tp.field_p % 50L == 0L) {
            var18 = Runtime.getRuntime();
            var3Lifetime1 = (int)(var18.totalMemory() - var18.freeMemory()) >> 10;
            var4 = mf.field_d;
            for (var5Lifetime1 = 9; var5Lifetime1 > 4; var5Lifetime1--) {
              this.field_G.setCharAt(var5Lifetime1, (char)(var3Lifetime1 % 10 + 48));
              var3Lifetime1 = var3Lifetime1 / 10;
            }
            for (var5Lifetime1Lifetime1 = 6; var5Lifetime1Lifetime1 > 4; var5Lifetime1Lifetime1--) {
              this.field_I.setCharAt(var5Lifetime1Lifetime1, (char)(48 + var4 % 10));
              var4 = var4 / 10;
            }
          }
          Js5Transport.field_k.drawString(this.field_G.toString(), 5, 20, 16777215, 1);
          Js5Transport.field_k.drawString(this.field_I.toString(), 5, 35, 16777215, 1);
        }
        if (param0 != -14964) {
          this.field_G = (StringBuilder) null;
        }
    }

    public ZombieDawn() {
        sa.field_Y = this;
    }

    final void onLoadingFinished(int param0) {
        if (GameApplet.field_c.field_d == 6 &&
          !nk.a(8, kg.field_g)) {
          GameApplet.field_c = jj.getScreen(3, 123);
          ca.a(false, true, 3);
        } else {
          if (dp.field_h != 2147483647) {
            ca.a(true, true, dp.field_h);
          }
        }
        if (param0 != 1235) {
          this.field_F = true;
        }
        bh.a(0);
        if (0 < be.field_j) {
          oj.field_d.requestMemberAssets(param0 - 1126, 1);
        }
    }

    final void startMainMenu(boolean param0) {
        SecondaryNodeDequeIterator.installViewController(-107, param0);
        fh.i(0);
        mf.a((byte) -67);
        GameApplet.field_c = jj.getScreen(11, 122);
        ca.a(true, true, 1);
        kp.a(50, (byte) 3);
        if (!ng.field_e) {
          qb.a(false, 224);
          ZombieDawn.setMusicVolume(119, 288);
          ph.a((byte) 106, ArchiveProvider.field_a[0]);
        }
        if (!ng.field_e &&
          !po.isGuestSession(13296)) {
          l.b(102, 4);
        }
        ep.c((byte) -50);
    }

    final void onConnectionResult(int param0, int param1) {
        if (param1 < 27) {
          field_K = (Font) null;
        }
    }

    public final void runTick(boolean param0, boolean param1) {
        int var4;
        wg var5;
        var4 = field_J;
        tp.field_p = tp.field_p + 1L;
        if (WhirlpoolHasher.field_e != te.field_eb ||
          kj.field_c != nh.field_P) {
          nh.field_P = kj.field_c;
          WhirlpoolHasher.field_e = te.field_eb;
          vh.field_b = (-640 + WhirlpoolHasher.field_e) / 2;
          qj.field_d = WhirlpoolHasher.field_e;
          me.field_Bb = nh.field_P;
          id.field_M = (nh.field_P - 480) / 2;
          nh.field_I = nh.field_P / 24 + 2;
          WhirlpoolHasher.field_a = WhirlpoolHasher.field_e / 24 + 2;
          WhirlpoolHasher.field_d = WhirlpoolHasher.field_e / 2;
          nh.field_G = nh.field_P / 2;
          if (lf.field_h != null && (lf.field_h.field_w != WhirlpoolHasher.field_e ||
            lf.field_h.field_t != nh.field_P)) {
            lf.field_h = null;
            lf.field_h = new Sprite(WhirlpoolHasher.field_e, nh.field_P);
          }
          TileMap.field_q = -1;
        }
        if (!po.isGuestSession(13296)) {
          while (true) {
            var5 = (wg) (dn.field_D.removeLast(123));
            if (var5 == null) {
              break;
            }
            dd.a(5, var5, -62);
          }
        }
        oj.field_d.processResourceQueue(47);
        if (param1) {
          this.isConnectionBusy(20);
        }
        if (we.hasActiveDialog((byte) -80)) {
          param0 = false;
        }
        if (oj.field_d.field_n) {
          return;
        }
        if (GameApplet.field_c == sg.field_eb) {
          GameApplet.field_c.handleInput((byte) -102, param0);
        } else {
          if (sg.field_eb.field_d == 0) {
            sg.field_eb.handleInput((byte) -115, param0);
          }
          po.field_xb = po.field_xb + 1;
          if (po.field_xb == 32) {
            if (GameApplet.field_c.field_d == 3) {
              WhirlpoolHasher.field_m = null;
            }
            GameApplet.field_c.onReplacedByScreen(sg.field_eb, 72);
            GameApplet.field_c = sg.field_eb;
            po.field_xb = 0;
          }
        }
    }

    final void onShutdown(int param0) {
        kl.shutdownAudioOutputs(-16861);
        if (param0 != 16850) {
          return;
        }
        pg.shutdownDisplayAndInput(1);
    }

    final boolean handlePacket(am param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 2) {
            ZombieDawn.setMusicVolume(-101, 34);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ZombieDawn.HA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void setMusicVolume(int param0, int param1) {
        ce.field_u = param1;
        if (uh.field_o != null) {
          uh.field_o.setMasterVolume(param1, (byte) -64);
        }
        if (param0 < 112) {
          ZombieDawn.setMusicVolume(-94, 83);
        }
        if (null != nc.field_p) {
          nc.field_p.setVolume((byte) 122, param1);
        }
    }

    final static void showLoginChoiceDialog(int param0) {
        if (param0 != -10401) {
          ZombieDawn.releaseStatics((byte) 6);
        }
        bm.field_d.transitionToContent(20, new di());
    }

    final void releaseStaticResources(boolean param0) {
        ZombieDawn.releaseStatics((byte) 114);
        mk.releaseStatics(4);
        IntrusiveDeque.releaseStatics((byte) -61);
        Rasterizer.releaseStatics();
        Font.releaseStatics();
        am.releaseStatics(-98);
        ff.a(-1);
        sb.releaseStatics(false);
        GameLoopApplet.releaseStatics((byte) -125);
        rn.releaseStatics(-12637);
        fo.releaseStatics(false);
        cm.releaseStatics(0);
        he.releaseStatics((byte) 85);
        ti.releaseStatics(4);
        ua.releaseStatics(-20441);
        al.releaseStatics((byte) 2);
        nl.releaseStatics((byte) 69);
        ph.releaseStatics(-1);
        GameKeyHandler.releaseStatics((byte) 85);
        FunOrbApplet.f(false);
        ClientException.releaseStatics((byte) 86);
        GameApplet.b(40);
        JaggrabDownloader.releaseStatics(-72);
        MouseInputHandler.releaseStatics(-14380);
        MouseWheelInput.releaseStatics(103);
        Js5Archive.releaseStatics(108);
        ob.releaseStatics(41);
        mp.a(13);
        PacketBuffer.releaseStatics(27291);
        pd.releaseStatics((byte) -117);
        ne.a((byte) 83);
        gf.releaseStatics(true);
        wn.releaseStatics(0);
        ha.a(127);
        hc.releaseStatics((byte) -121);
        c.releaseStatics(true);
        aa.releaseStatics(-2008296413);
        ja.releaseStatics(param0);
        rk.releaseStatics(16);
        ni.releaseStatics(-1);
        ln.releaseStatics(-5);
        RasterBuffer.releaseStatics(16);
        jk.releaseStatics(50);
        FullscreenFocusCanvas.releaseStatics(71);
        ViewportController.releaseStatics((byte) 49);
        ae.releaseStatics(false);
        GameWorld.f(!param0 ? true : false);
        tl.releaseStatics(123);
        IntrusiveNode.releaseStatics((byte) 61);
        jd.releaseStatics((byte) 126);
        ta.releaseStatics(false);
        mb.releaseStatics();
        ka.releaseStatics((byte) 118);
        ca.releaseStatics(true);
        o.releaseStatics(true);
        fl.releaseStatics((byte) -54);
        kl.releaseStatics((byte) -112);
        ac.releaseStatics((byte) -104);
        fg.releaseStatics(-25585);
        pl.releaseStatics((byte) -95);
        Js5Transport.releaseStatics(!param0 ? true : false);
        ExceptionWrapper.releaseStatics((byte) -122);
        Js5ArchiveManager.releaseStatics(-16785);
        BufferedFile.releaseStatics(0);
        BufferedSocket.releaseStatics((byte) 105);
        dl.releaseStatics(-974314864);
        lf.a(-9742);
        jg.releaseStatics();
        ip.releaseStatics((byte) 10);
        qf.releaseStatics();
        tp.releaseStatics(0);
        sc.releaseStatics(126);
        dd.releaseStatics((byte) 68);
        jp.a(false);
        vd.releaseStatics(128);
        ng.releaseStatics((byte) -126);
        DualLinkNode.releaseStatics(-107);
        da.c((byte) 93);
        dc.releaseStatics(-79);
        SpatialGrid.releaseStatics((byte) -86);
        uk.releaseStatics(-21);
        ro.releaseStatics((byte) -99);
        vj.releaseStatics((byte) 112);
        ap.releaseStatics(false);
        LevelNavigation.releaseStatics((byte) -115);
        Camera.releaseStatics(60);
        ub.releaseStatics((byte) 93);
        uh.releaseStatics((byte) 73);
        qj.releaseStatics(97);
        Zombie.releaseStatics(54);
        Human.releaseStatics(60);
        TileMap.releaseStatics((byte) 122);
        Mover.releaseStatics(0);
        Point.releaseStatics((byte) -125);
        WorldObject.releaseStatics(237239984);
        ig.releaseStatics(-96);
        u.releaseStatics(-71);
        co.releaseStatics(28186);
        ji.releaseStatics(-9);
        qd.releaseStatics(-79);
        d.releaseStatics(6);
        nk.releaseStatics(-11486);
        qb.releaseStatics(-6633);
        SpriteState.releaseStatics((byte) -77);
        ei.releaseStatics(123);
        dn.releaseStatics(0);
        i.releaseStatics(10);
        bh.releaseStatics(117);
        ma.releaseStatics((byte) 13);
        nf.releaseStatics(0);
        gg.releaseStatics((byte) -103);
        IsaacCipher.releaseStatics(-1640531527);
        RandomAccessCacheFile.releaseStatics(0);
        nd.releaseStatics(-128);
        td.releaseStatics((byte) 94);
        oc.releaseStatics(96);
        je.releaseStatics(2);
        ce.d(-128);
        mf.releaseStatics(123);
        vi.releaseStatics(-51);
        md.releaseStatics(54);
        sa.releaseStatics((byte) 88);
        cf.releaseStatics(18072);
        sg.releaseStatics(false);
        fk.releaseStatics((byte) -31);
        di.releaseStatics(true);
        ih.releaseStatics(-31608);
        ui.releaseStatics(117);
        sl.releaseStatics(79);
        kj.releaseStatics((byte) 122);
        pg.releaseStatics(-5);
        so.a();
        nm.releaseStatics(-101);
        bb.releaseStatics(-107);
        qc.releaseStatics((byte) 61);
        re.releaseStatics(param0);
        nc.releaseStatics(-2135443998);
        ge.releaseStatics(256);
        vl.releaseStatics((byte) -51);
        qo.releaseStatics((byte) -68);
        t.releaseStatics(27803);
        el.releaseStatics(-1);
        vf.releaseStatics(4056);
        cj.releaseStatics(25808);
        pa.releaseStatics((byte) 25);
        vg.releaseStatics(-1);
        lb.releaseStatics((byte) -118);
        pn.releaseStatics(-74);
        nh.releaseStatics((byte) -29);
        an.releaseStatics(-119);
        r.releaseStatics(0);
        hp.releaseStatics(84);
        vh.releaseStatics((byte) 31);
        jh.releaseStatics(13192);
        ci.releaseStatics(false);
        ArchiveProvider.releaseStatics((byte) -98);
        en.releaseStatics();
        f.releaseStatics((byte) 39);
        gd.releaseStatics((byte) -45);
        p.releaseStatics(false);
        wi.releaseStatics((byte) 61);
        cl.releaseStatics((byte) 87);
        wh.releaseStatics(0);
        cb.releaseStatics(112);
        pf.a((byte) 88);
        DelegatingCanvas.a(0);
        to.releaseStatics((byte) 113);
        mo.releaseStatics(-76);
        rf.releaseStatics(11021);
        lj.releaseStatics();
        ba.releaseStatics(false);
        n.releaseStatics(128);
        ch.releaseStatics(1426);
        il.releaseStatics(4466);
        hj.releaseStatics();
        qp.releaseStatics((byte) 92);
        dm.releaseStatics(3);
        ia.releaseStatics(25268);
        lc.releaseStatics(-1);
        ed.releaseStatics((byte) 54);
        bm.releaseStatics(0);
        sj.releaseStatics(1222359528);
        hg.releaseStatics(140);
        SocketConnector.releaseStatics(26161);
        ImageProducerRasterBuffer.releaseStatics(-1);
        te.releaseStatics((byte) 105);
        id.releaseStatics(-72);
        SpatialBucket.releaseStatics(-12220);
        kc.clearStatics(!param0 ? true : false);
        mm.releaseStatics((byte) 47);
        ck.releaseStatics(1);
        be.releaseStatics(true);
        ea.a((byte) 82);
        no.releaseStatics(!param0 ? true : false);
        gn.releaseStatics(127);
        hk.releaseStatics(true);
        we.releaseStatics(16777215);
        ao.releaseStatics(-106);
        gk.releaseStatics(114);
        me.clearStatics(95);
        wo.releaseStatics(86);
        oo.releaseStatics((byte) 117);
        si.releaseStatics(255);
        qk.releaseStatics(15213);
        jo.releaseStatics((byte) -73);
        ve.releaseStatics();
        wc.releaseStatics((byte) -73);
        ek.releaseStatics(0);
        dk.releaseStatics((byte) 91);
        qm.releaseStatics(0);
        og.releaseStatics(false);
        SectorCacheStore.releaseStatics((byte) 79);
        wd.releaseStatics(1445852592);
        pj.releaseStatics(32);
        ie.releaseStatics();
        q.releaseStatics(false);
        ic.releaseStatics(16604);
        tb.releaseStatics(!param0 ? true : false);
        ki.releaseStatics((byte) 122);
        hb.releaseStatics(-86);
        kn.releaseStatics(false);
        hm.releaseStatics(-27476);
        np.releaseStatics(1569045130);
        wf.releaseStatics(102);
        fm.releaseStatics(12959);
        pm.releaseStatics(!param0 ? true : false);
        fe.releaseStatics(67);
        ho.releaseStatics((byte) 118);
        WhirlpoolHasher.releaseStatics(!param0 ? true : false);
        vb.releaseStatics((byte) -104);
        po.clearStatics(-31113);
        cn.releaseStatics(92);
        hf.releaseStatics((byte) -34);
        rl.releaseStatics(-103);
        ad.releaseStatics(-1819016370);
        ij.g(-1);
        qi.releaseStatics(0);
        nj.releaseStatics(false);
        kf.releaseStatics(4347);
        rg.releaseStatics(13885);
        em.releaseStatics((byte) -69);
        kp.releaseStatics((byte) -119);
        cg.releaseStatics(true);
        SecondaryNodeDeque.releaseStatics((byte) -109);
        bj.releaseStatics(42);
        jl.releaseStatics((byte) -113);
        ProxySocketConnector.releaseStatics(32);
        uj.releaseStatics(256);
        NodeHashTableIterator.releaseStatics((byte) 122);
        SecondaryNodeDequeIterator.releaseStatics((byte) 48);
        b.releaseStatics((byte) -47);
        bo.releaseStatics(7644);
        tk.releaseStatics(-90);
        af.releaseStatics(25752);
        bg.releaseStatics((byte) -44);
        lo.releaseStatics((byte) -79);
        wg.releaseStatics(110);
        uf.releaseStatics(-103);
        jc.releaseStatics(830);
        rc.releaseStatics(0);
        km.releaseStatics((byte) 49);
        hn.releaseStatics((byte) 94);
        vm.a(!param0 ? true : false);
        dp.releaseStatics(true);
        tc.releaseStatics(-26642);
        jm.releaseStatics(param0);
        jb.releaseStatics(-59);
        mh.releaseStatics((byte) -72);
        k.releaseStatics(114);
        oh.releaseStatics(-101);
        j.releaseStatics((byte) -3);
        df.releaseStatics(-24231);
        ep.a(0);
        nn.releaseStatics(2);
        sd.releaseStatics(80);
        AccountServerResult.releaseStatics(-25401);
        tm.releaseStatics(-5364);
        PowerupCard.releaseStatics(-27940);
        sn.releaseStatics((byte) 93);
        bn.releaseStatics(5);
        ld.d(25008);
        l.releaseStatics(-1);
        sm.releaseStatics(true);
        e.releaseStatics(true);
        gj.releaseStatics(120);
        oe.releaseStatics(15);
        eb.releaseStatics(false);
        kh.releaseStatics(-67);
        ud.releaseStatics((byte) -105);
        gl.a(8);
        oj.releaseStatics(-14311);
        s.releaseStatics((byte) -123);
        lm.releaseStatics(3);
        jj.releaseStatics(2021978896);
        a.releaseStatics((byte) 105);
        ql.releaseStatics(!param0 ? true : false);
        kg.releaseStatics(-2314);
        mc.releaseStatics((byte) -13);
        lk.releaseStatics(1029);
        kb.releaseStatics(111);
        fj.releaseStatics((byte) -127);
        wl.releaseStatics((byte) -86);
        eg.releaseStatics(-26441);
        vk.releaseStatics((byte) -90);
        this.host = null;
        this.field_I = null;
        this.field_G = null;
    }

    public final void init() {
        this.a(12, 108, "zombiedawn");
    }

    public static void releaseStatics(byte param0) {
        field_K = null;
        field_H = null;
        field_D = null;
        field_E = null;
        if (param0 <= 109) {
          field_E = (long[]) null;
        }
    }

    static {
        field_E = new long[32];
        field_D = "Score";
    }
}
