/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class OrbDefence extends NetworkGameClient {
    static String field_C;
    static String field_E;
    public static boolean field_D;

    final void updateClient(byte param0) {
        boolean discarded$0 = false;
        int stackIn_5_1 = 0;
        boolean stackIn_6_2 = false;
        boolean stackIn_31_1 = false;
        int var2;
        ha var3_ref_ha;
        int var3;
        int var4;
        int var2Lifetime1;
        var4 = field_D ? 1 : 0;
        MidiPcmStream.c(false);
        if (null != PacketBuffer.field_k &&
          PacketBuffer.field_k.field_e) {
          lb.a(true);
          ee.a(4);
        }
        stackIn_5_1 = 123;
        stackIn_6_2 = (PacketBuffer.field_k != null);
        this.b(stackIn_5_1, stackIn_6_2);
        if (gi.field_b) {
          this.g((byte) -123);
          gi.field_b = false;
        }
        if (eg.c((byte) -126)) {
          this.c(false);
          if (eg.c((byte) -126)) {
            if (!fe.c((byte) -117)) {
              return;
            }
            discarded$0 = this.a(false, (byte) 97);
            return;
          }
        }
        if (!f.field_j) {
          EditableTextField.a(false, of.field_K);
          if (this.a(true, (byte) 97)) {
            f.field_j = true;
          }
        } else {
          if (!ad.a((byte) -72)) {
            PasswordValidator.b((byte) 118);
            if (ad.a((byte) -72)) {
              bg.a(-2027485778);
              ImageProducerRasterBuffer.b(0);
              if (5 == kf.field_c &&
                TextLayout.field_f == 0) {
                kf.field_c = 2;
                rh.a((byte) -96, 2, false);
              }
              if (rl.a((byte) 125)) {
                ud.a(8, ProxyAuthenticationRequiredException.field_d, true, RegistrationAgreementPane.field_I.field_B + RegistrationAgreementPane.field_I.field_E, 6, 6, RegistrationAgreementPane.field_I, RegistrationAgreementPane.field_I.field_E, (byte) 5, 320, 240, qc.field_f);
              }
            }
          } else {
            if (!rl.a((byte) 106)) {
              if (DialogMessagePane.k(783)) {
                stackIn_31_1 = (null != PacketBuffer.field_k);
                var2 = this.a(stackIn_31_1, false);
                if (var2 == 1 ||
                  var2 == 2) {
                  if (null != PacketBuffer.field_k) {
                    lb.a(true);
                  }
                  if (2 == var2) {
                    ja.a(-106, uj.b((byte) -120));
                  }
                }
              } else {
                this.e(false);
              }
            } else {
              if (lc.field_r != 0) {
                this.e(false);
              } else {
                var2 = TextFieldValidator.i(0);
                if (var2 == 2) {
                  lb.a(true);
                } else {
                  if (var2 != 3) {
                    if (var2 == 4) {
                      n.a((byte) -110);
                    }
                  } else {
                    ud.a(8, ProxyAuthenticationRequiredException.field_d, true, RegistrationAgreementPane.field_I.field_E + RegistrationAgreementPane.field_I.field_B, 6, 6, RegistrationAgreementPane.field_I, RegistrationAgreementPane.field_I.field_E, (byte) 5, 320, 240, qc.field_f);
                  }
                }
                if (!rl.a((byte) 114)) {
                  nc.field_cb[kf.field_c].a(true, (byte) 93);
                }
              }
            }
          }
        }
        var2Lifetime1 = -59 / ((54 - param0) / 39);
        if (!n.b((byte) -70)) {
          while (true) {
            var3_ref_ha = (ha) (MouseWheelInput.field_b.removeFirst(0));
            if (var3_ref_ha == null) {
              break;
            }
            f.a(4, var3_ref_ha, (byte) -4);
          }
        }
        while (uj.a(tg.field_b, -16)) {
          this.e((byte) -115);
        }
        bh.a(0, -1);
        if (ModalDialog.c(true)) {
          var3 = this.j(7);
          if (2 == var3) {
            md.b((byte) -121);
          }
        }
    }

    final static void d(boolean param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = field_D ? 1 : 0;
        try {
          if (param0) {
            field_C = (String) null;
          }
          wi.c();
          dk.field_c = new int[260];
          sf.field_O = 11;
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            dk.field_c[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < dk.field_c.length) {
            dk.field_c[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) var1), "OrbDefence.B(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        if (eg.field_x != null) {
          AccountRequestState.a(eg.field_x, (byte) 63);
          eg.field_x = null;
          SoundCache.resetFrameTiming(113);
        }
        bh.field_d = qk.a(4, -32585);
        pd.field_r = qk.a(5, -32585);
        kd.field_q = qk.a(6, -32585);
        AccountCreationResultPanel.field_hb = qk.a(7, -32585);
        int var2 = 13 / ((-73 - param0) / 49);
        ContentTransitionDialog.field_N = qk.a(8, -32585);
        lg.field_c = qk.a(9, -32585);
        mc.a(j.field_b, -29608, GameAppletShell.field_d);
    }

    final static void a(byte[] param0, byte param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_39_1 = 0;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        PacketBuffer var17 = null;
        PacketBuffer var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        int stackIn_21_0Lifetime1;
        int stackIn_21_1Lifetime1;
        int stackIn_32_0Lifetime1;
        int stackIn_32_1Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var13Lifetime3;
        int stackIn_21_0Lifetime1Lifetime1;
        int stackIn_21_1Lifetime1Lifetime1;
        var16 = field_D ? 1 : 0;
        try {
          var17 = new PacketBuffer(param0);
          var18 = var17;
          var18.position = param0.length - 2;
          DialogMessagePane.field_K = var18.readUnsignedShort(98203176);
          ha.field_g = new boolean[DialogMessagePane.field_K];
          jd.field_g = new int[DialogMessagePane.field_K];
          m.field_a = new int[DialogMessagePane.field_K];
          wh.field_b = new int[DialogMessagePane.field_K];
          md.field_i = new byte[DialogMessagePane.field_K][];
          fl.field_a = new byte[DialogMessagePane.field_K][];
          wc.field_a = new int[DialogMessagePane.field_K];
          var18.position = param0.length - (7 + 8 * DialogMessagePane.field_K);
          ModalDialog.field_B = var18.readUnsignedShort(98203176);
          var3 = -1 % ((-4 - param1) / 62);
          he.field_r = var18.readUnsignedShort(98203176);
          var4 = (var18.readUnsignedByte((byte) 90) & 255) + 1;
          for (var5 = 0; DialogMessagePane.field_K > var5; var5++) {
            jd.field_g[var5] = var17.readUnsignedShort(98203176);
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < DialogMessagePane.field_K; var5Lifetime1++) {
            wc.field_a[var5Lifetime1] = var18.readUnsignedShort(98203176);
          }
          for (var5Lifetime2 = 0; DialogMessagePane.field_K > var5Lifetime2; var5Lifetime2++) {
            wh.field_b[var5Lifetime2] = var18.readUnsignedShort(98203176);
          }
          for (var5Lifetime3 = 0; DialogMessagePane.field_K > var5Lifetime3; var5Lifetime3++) {
            m.field_a[var5Lifetime3] = var18.readUnsignedShort(98203176);
          }
          var18.position = -(3 * (-1 + var4)) - 8 * DialogMessagePane.field_K + param0.length - 7;
          vc.field_g = new int[var4];
          var5Lifetime4 = 1;
          while (var5Lifetime4 < var4) {
            vc.field_g[var5Lifetime4] = var18.readUnsignedMedium((byte) -30);
            stackIn_21_0 = ~vc.field_g[var5Lifetime4];
            stackIn_21_1 = -1;
            if (stackIn_21_0 == stackIn_21_1) {
              vc.field_g[var5Lifetime4] = 1;
            }
            var5Lifetime4++;
          }
          var18.position = 0;
          var5Lifetime5 = 0;
          while (true) {
            stackIn_21_0Lifetime1 = ~var5Lifetime5;
            stackIn_21_1Lifetime1 = ~DialogMessagePane.field_K;
            if (stackIn_21_0Lifetime1 <= stackIn_21_1Lifetime1) {
              return;
            }
            {
              var6 = wh.field_b[var5Lifetime5];
              var7 = m.field_a[var5Lifetime5];
              var8 = var7 * var6;
              var21 = new byte[var8];
              var19 = var21;
              var9 = var19;
              fl.field_a[var5Lifetime5] = var21;
              var22 = new byte[var8];
              var20 = var22;
              var10 = var20;
              md.field_i[var5Lifetime5] = var22;
              var11 = 0;
              var12 = var18.readUnsignedByte((byte) 90);
              if ((1 & var12) == 0) {
                for (var13 = 0; var8 > var13; var13++) {
                  var9[var13] = var18.readByte(-20398);
                }
                if (((var12 & 2) != 0)) {
                  for (var13Lifetime3 = 0; var13Lifetime3 < var8; var13Lifetime3++) {
                    dupTemp$0 = var18.readByte(-20398);
                    var10[var13Lifetime3] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_21_0Lifetime1Lifetime1 = var11;
                    stackIn_21_1Lifetime1Lifetime1 = ~var14;
                    if (stackIn_21_1Lifetime1Lifetime1 == 0) {
                      stackIn_52_1 = 0;
                    } else {
                      stackIn_52_1 = 1;
                    }
                    var11 = stackIn_21_0Lifetime1Lifetime1 | stackIn_52_1;
                  }
                }
              } else {
                for (var13Lifetime1 = 0; var6 > var13Lifetime1; var13Lifetime1++) {
                  for (var14Lifetime1 = 0; var7 > var14Lifetime1; var14Lifetime1++) {
                    var9[var13Lifetime1 + var14Lifetime1 * var6] = var18.readByte(-20398);
                  }
                }
                if ((2 & var12) != 0) {
                  var13Lifetime2 = 0;
                  while (true) {
                    stackIn_32_0 = var13Lifetime2;
                    stackIn_32_1 = var6;
                    if (stackIn_32_0 >= stackIn_32_1) {
                      break;
                    }
                    for (var14Lifetime2 = 0; var14Lifetime2 < var7; var14Lifetime2++) {
                      dupTemp$1 = var18.readByte(-20398);
                      var10[var14Lifetime2 * var6 + var13Lifetime2] = dupTemp$1;
                      var15 = dupTemp$1;
                      stackIn_32_0Lifetime1 = var11;
                      stackIn_32_1Lifetime1 = ~var15;
                      if (stackIn_32_1Lifetime1 == 0) {
                        stackIn_39_1 = 0;
                      } else {
                        stackIn_39_1 = 1;
                      }
                      var11 = stackIn_32_0Lifetime1 | stackIn_39_1;
                    }
                    var13Lifetime2++;
                  }
                }
              }
            }
            ha.field_g[var5Lifetime5] = var11 != 0;
            var5Lifetime5++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_57_0 = var2;
          stackIn_57_1 = new StringBuilder().append("OrbDefence.I(");
          if (param0 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param1).append(')').toString());
        }
    }

    public OrbDefence() {
    }

    final void disposeClient(int param0) {
        am.a(-4062);
        if (param0 != 176400) {
          field_E = (String) null;
        }
        if (PacketBuffer.field_k != null) {
          lb.a(true);
        }
        uj.c((byte) 63);
    }

    final void clearClientResources(boolean param0) {
        OrbDefence.clearStaticReferences((byte) -119);
        kg.resetStaticState(96);
        IntrusiveDeque.a(9);
        wf.clearStaticReferences(71);
        jm.clearStaticReferences(-1178583839);
        KeyboardListener.resetStaticState(118);
        rl.clearStaticReferences((byte) -126);
        uk.clearStaticReferences(param0);
        NetworkGameClient.clearStaticReferences(-97);
        ui.clearStaticReferences(-10013);
        GameAppletShell.b(13695);
        uj.clearStaticReferences(0);
        MouseInputListener.a(8);
        MouseWheelInput.clearStaticReferences(121);
        SoftwareRasterizer.clearStaticReferences();
        ResourceArchive.clearStaticReferences(false);
        BitmapFont.clearStaticReferences();
        tc.a(true);
        n.c((byte) -87);
        PacketBuffer.clearDeclaredStaticReferences(10);
        ji.resetStaticState(-5046);
        nl.resetStaticState((byte) -77);
        ce.clearStaticReferences(true);
        bi.clearStaticReferences((byte) 23);
        ld.clearStaticReferences(false);
        bm.clearStaticReferences(63);
        fm.clearStaticReferences((byte) -64);
        vj.clearStaticReferences((byte) 24);
        lf.clearStaticReferences(117);
        og.clearStaticReferences((byte) -123);
        wh.clearStaticReferences(-122);
        na.resetStaticState(-20008);
        FrameTimer.clearStaticReferences((byte) -14);
        RasterBuffer.resetStaticState((byte) -27);
        l.clearStaticReferences(124);
        FullscreenFocusCanvas.clearStaticReferences(29967);
        jk.clearStaticReferences((byte) 65);
        SoundCache.clearStaticReferences(13461);
        ja.clearStaticReferences(-92);
        nk.clearStaticReferences((byte) 15);
        ql.clearStaticReferences((byte) 50);
        ge.clearStaticReferences(1);
        DiskCacheWorker.b(-122);
        pi.clearStaticReferences(param0);
        BufferedRandomAccessFile.c((byte) 78);
        BufferedSocket.clearStaticReferences((byte) -95);
        IntrusiveNode.clearStaticReferences(40);
        MidiPcmStream.resetStaticState(116);
        mh.clearStaticReferences(1);
        he.resetStaticState(22);
        MidiFileReader.clearStaticReferences();
        MusicPatchPcmStream.clearDeclaredStaticReferences(79);
        AudioOutput.clearStaticReferences();
        CrossfadingMidiPcmStream.clearStaticReferences(true);
        am.a((byte) 29);
        ml.clearStaticReferences(true);
        pf.clearStaticReferences(param0);
        lm.b(5);
        aj.clearStaticReferences((byte) -94);
        fd.resetStaticState(-32311);
        id.clearStaticReferences((byte) -115);
        hd.clearStaticReferences(100);
        GzipDecompressor.clearStaticReferences(1000000);
        jl.clearStaticReferences((byte) 9);
        cj.clearStaticReferences(1280);
        bg.a((byte) -107);
        ke.a((byte) -80);
        ModalDialogHost.releaseDeclaredStaticReferences(-79);
        AccountCreationResultPanel.resetDeclaredStaticReferences(11285);
        ProgressDialog.clearStaticReferences(false);
        StandardContentDialog.resetStaticState(-1);
        ProgressMessageDialog.resetStaticState((byte) -94);
        AccountRegistrationPanel.clearStaticReferences(!param0 ? true : false);
        LoginPanel.l(-100);
        DisplayNameSelectionPanel.resetStaticState(!param0 ? true : false);
        ee.clearStaticReferences((byte) 107);
        bl.clearStaticReferences(13756);
        ne.clearStaticReferences(-1459);
        SynthesizerVoice.clearStaticReferences();
        VorbisSample.clearStaticReferences();
        VorbisFloor.clearStaticReferences();
        sd.resetStaticState((byte) -30);
        DualLinkNode.clearDeclaredStaticReferences((byte) -128);
        ia.clearStaticReferences((byte) 125);
        fe.clearStaticReferences((byte) 126);
        f.a((byte) -69);
        km.e(125);
        pd.clearStaticReferences((byte) -19);
        lb.clearStaticReferences((byte) -98);
        kd.clearStaticReferences((byte) 119);
        SpriteGeometry.clearDeclaredStaticReferences(-31028);
        th.clearStaticReferences(true);
        oj.clearDeclaredStaticReferences(384);
        BitPacketBuffer.clearStaticReferences(false);
        wc.clearStaticReferences((byte) -69);
        wl.b(-25829);
        de.clearStaticReferences(-2079);
        lh.clearStaticReferences(-21248);
        mf.clearStaticReferences(127);
        fk.clearStaticReferences((byte) -102);
        ub.clearStaticReferences();
        IsaacRandom.clearStaticReferences((byte) -77);
        nd.clearStaticReferences(-16996);
        PcmOutputWorker.clearStaticReferences((byte) 90);
        a.clearStaticReferences((byte) 29);
        il.resetStaticState(0);
        NetworkArchiveRequest.clearStaticReferences((byte) 61);
        DiskArchiveRequest.clearStaticReferences((byte) -99);
        ak.c((byte) -102);
        BoundedRandomAccessFile.clearStaticReferences(128);
        fl.clearStaticReferences(-128);
        ArchiveRequest.releaseDeclaredStaticReferences((byte) -90);
        jd.clearStaticReferences(0);
        FullscreenStatusDialog.resetStaticState(true);
        DefaultTextWidgetRenderer.clearStaticReferences(true);
        wi.clearStaticReferences();
        p.clearStaticReferences((byte) 73);
        fa.clearStaticReferences(false);
        wd.clearStaticReferences(100);
        m.clearStaticReferences((byte) 98);
        lg.clearStaticReferences(104);
        oh.clearStaticReferences(-17303);
        tg.resetStaticState(2);
        pa.clearStaticReferences(17);
        ua.clearStaticReferences(-415277564);
        tb.clearStaticReferences(-9698);
        sf.b((byte) 7);
        k.clearStaticReferences((byte) -112);
        DelegatingCanvas.clearStaticReferences((byte) 3);
        bh.clearStaticReferences(-21000);
        ByteStorage.clearStaticReferences(14);
        Bzip2Decompressor.clearStaticReferences();
        Bzip2State.clearStaticReferences(16);
        ud.clearStaticReferences(true);
        q.a(109);
        qk.clearStaticReferences((byte) -122);
        ci.clearStaticReferences(1);
        sj.clearStaticReferences((byte) 64);
        ab.clearStaticReferences(false);
        ck.clearStaticReferences(22499);
        TextLayout.clearStaticReferences(0);
        UiWidget.clearDeclaredStaticReferences(-75);
        InteractiveWidget.resetStaticState(99);
        SingleChildWidgetContainer.clearStaticReferences((byte) 81);
        ResizableModalDialog.releaseDeclaredStaticReferences(-15640);
        ModalDialog.clearDeclaredStaticReferences((byte) 87);
        DequeWidgetContainer.clearStaticReferences((byte) -95);
        gd.clearStaticReferences(24);
        kf.clearStaticReferences(-17218);
        oe.clearDeclaredStaticReferences(-12563);
        rh.clearStaticReferences((byte) 126);
        nh.clearStaticReferences((byte) -59);
        gb.a(2867);
        dk.resetStaticState(0);
        cf.clearStaticReferences(0);
        mb.clearStaticReferences(114);
        pg.clearStaticReferences(-12150);
        ProxyAuthenticationRequiredException.clearStaticReferences(48);
        NanoFrameTimer.clearDeclaredStaticReferences((byte) -22);
        ImageProducerRasterBuffer.b((byte) 68);
        db.clearStaticReferences(-101);
        mc.c(12);
        od.b((byte) -87);
        ok.clearStaticReferences((byte) 104);
        cg.clearStaticReferences(0);
        uh.resetStaticState(-5);
        sl.c((byte) 126);
        me.clearDeclaredStaticReferences(5);
        vc.a((byte) 116);
        rc.a(-127);
        LabeledWidgetContainer.releaseDeclaredStaticReferences(-115);
        ValidatedTextField.q(119);
        EditableTextField.n(1);
        ContentTransitionDialog.discardDeclaredStaticReferences(0);
        StripedProgressWidget.clearStaticReferences((byte) 120);
        NameSuggestionsPanel.releaseDeclaredStaticReferences(29858);
        RichTextWidget.releaseDeclaredStaticReferences(-3213);
        kk.discardDeclaredStaticReferences(79);
        of.clearStaticReferences((byte) -83);
        TextFieldValidator.g(-104);
        qb.clearStaticReferences((byte) -83);
        RegistrationAgreementPane.resetStaticState((byte) -19);
        ue.clearStaticReferences((byte) -13);
        SoundFilter.clearStaticReferences();
        j.clearStaticReferences(-99);
        gi.a(param0);
        nc.e(8864);
        ei.b(139);
        hg.c(false);
        vf.clearStaticReferences(1);
        RichTextLayout.clearDeclaredStaticReferences(0);
        tj.a((byte) -58);
        DraggableWidgetContainer.clearDeclaredStaticReferences((byte) -119);
        DropTargetWidgetContainer.releaseDeclaredStaticReferences(21006);
        ba.clearStaticReferences(50);
        IterableNodeHashTable.clearStaticReferences(-1);
        DualLinkDeque.clearStaticReferences(param0);
        nf.clearDeclaredStaticReferences(127);
        lc.releaseDeclaredStaticReferences(96);
        md.clearStaticReferences(-77);
        ih.clearStaticReferences(-127);
        NodeHashTableIterator.clearStaticReferences(-1);
        DualLinkDequeIterator.resetStaticState(false);
        gj.c(false);
        vg.clearStaticReferences(false);
        hb.clearStaticReferences(119);
        hf.clearStaticReferences(true);
        mj.a((byte) 86);
        vk.clearStaticReferences((byte) -108);
        qc.a(4784);
        eg.clearStaticReferences(-123);
        fi.clearStaticReferences(-8601);
        AlphaWidgetContainer.releaseDeclaredStaticReferences(37);
        ti.e(67);
        d.clearStaticReferences((byte) -128);
        ad.clearStaticReferences(true);
        dc.clearStaticReferences(!param0 ? true : false);
        ha.clearStaticReferences((byte) 99);
        AccountRequestState.releaseStatics(8);
        AccountServiceResult.clearStaticReferences(-28342);
        mi.clearStaticReferences((byte) -67);
        tl.clearStaticReferences(-127);
        hc.c(31);
        DialogMessagePane.a((byte) 122);
        df.clearStaticReferences(76);
        ii.clearStaticReferences(-26268);
        hh.resetStaticState(-93);
        FullscreenNoticeType.clearStaticReferences(100);
        vh.clearDeclaredStaticReferences(95);
        fb.clearStaticReferences((byte) 125);
        qf.clearDeclaredStaticReferences(32);
        vb.clearDeclaredStaticReferences(-26818);
        ef.clearStaticReferences(param0);
        sa.a((byte) -105);
        TextLineMetrics.a(-1);
        AccountNameAvailabilityValidator.clearStaticReferences((byte) -97);
        PasswordValidator.resetStaticState((byte) -15);
        EmailFormatValidator.resetStaticState(-24392);
        ConfirmedEmailAvailabilityValidator.j(-1);
        AgeValidator.clearDeclaredStaticReferences(-1);
        MatchingFieldValidator.clearStaticReferences((byte) -41);
        li.clearStaticReferences(false);
        TextHotspotBounds.clearStaticReferences((byte) 83);
        qd.clearStaticReferences(-96);
        DebouncedFieldValidator.clearStaticReferences(7312);
        e.clearStaticReferences((byte) -14);
        this.field_n = null;
    }

    final void renderClientFrame(byte param0) {
        int stackIn_39_0 = 0;
        boolean stackIn_40_1 = false;
        int var3_int;
        kg var3;
        int var4;
        int var5;
        int var6;
        java.awt.Canvas var7;
        var6 = field_D ? 1 : 0;
        var7 = tb.a((byte) 114);
        if (eg.c((byte) -126)) {
          nd.a((byte) -54, var7, km.a(false));
          return;
        }
        if (!f.field_j) {
          PasswordValidator.a(0, var7);
          return;
        }
        if (!ad.a((byte) -72)) {
          j.a(100.0f, ge.field_i, (byte) 113);
          PasswordValidator.a(0, var7);
          return;
        }
        SoftwareRasterizer.clearRaster();
        if (~kk.field_S != ~kf.field_c) {
          if (5 <= RichTextWidget.field_O) {
            if (kk.field_S != -1) {
              if (kk.field_S == 1 &&
                il.field_f != null) {
                il.field_f.a(2, false);
              }
              nc.field_cb[kk.field_S].b((byte) -119);
            } else {
              il.field_f.a(2, false);
            }
            ub.a(10 - RichTextWidget.field_O, 0, ub.field_a);
          } else {
            if (kf.field_c != -1) {
              if (kf.field_c == 1 &&
                null != il.field_f) {
                il.field_f.a(2, false);
              }
              nc.field_cb[kf.field_c].b((byte) -120);
            } else {
              il.field_f.a(2, false);
            }
            ub.a(RichTextWidget.field_O, 0, ub.field_a);
          }
        } else {
          if (-1 != kf.field_c) {
            if (kf.field_c == 1 &&
              il.field_f != null) {
              il.field_f.a(2, false);
            }
            nc.field_cb[kf.field_c].b((byte) 6);
          } else {
            il.field_f.a(2, true);
          }
        }
        if (rl.a((byte) 124)) {
          SoftwareRasterizer.darkenRectangleHalf(0, 0, SoftwareRasterizer.field_f, SoftwareRasterizer.field_l);
          BoundedRandomAccessFile.a(4 + f.field_w[0].field_o, f.field_w[0].field_k + 4, false, f.field_w);
        }
        if (lc.field_r != 0) {
          var3_int = 256 * RichTextWidget.field_O / 10;
          if (var3_int > 0) {
            SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_f, SoftwareRasterizer.field_l, 0, var3_int);
          }
        }
        if (DialogMessagePane.k(783) &&
          !rl.a((byte) 101)) {
          stackIn_39_0 = 82;
          if (null == PacketBuffer.field_k) {
            stackIn_40_1 = EmailFormatValidator.field_o;
          } else {
            stackIn_40_1 = true;
          }
          fg.$cfr$intArgs$a$7ffe4b125357(stackIn_39_0, stackIn_40_1);
        }
        if (2 <= AccountRequestState.field_d) {
          RegistrationAgreementPane.field_I.drawString(Integer.toString(ud.field_f), 20, 20, 16777215, 1);
        }
        if (param0 >= -72) {
          field_C = (String) null;
        }
        var3 = (kg) (oj.field_r.beginForward((byte) 120));
        if (var3 != null) {
          var5 = lc.field_x;
          if (var5 >= 80) {
            if (var5 < 230) {
              var4 = 96;
            } else {
              var4 = 96 + (300 + (160 - 2 * var5));
            }
          } else {
            var4 = 96 + 2 * (-80 + var5);
          }
          SoftwareRasterizer.fillCircleAlpha(var4, 417, 57, 16777215, 64);
          SoftwareRasterizer.fillCircleAlpha(var4, 417, 56, 16777215, 128);
          SoftwareRasterizer.fillCircleAlpha(var4, 417, 55, 16777215, 192);
          SoftwareRasterizer.fillCircleAlpha(var4, 417, 54, 0, 255);
          RichTextLayout.field_o[var3.field_k].drawHalfSize(var4 - 32, 370);
          RegistrationAgreementPane.field_I.drawCentred(gj.field_j[var3.field_k], var4 - 1, 440 + RegistrationAgreementPane.field_I.field_H, 0, 0);
          RegistrationAgreementPane.field_I.drawCentred(gj.field_j[var3.field_k], var4, RegistrationAgreementPane.field_I.field_H + 439, 0, 0);
          RegistrationAgreementPane.field_I.drawCentred(gj.field_j[var3.field_k], var4, 440 + RegistrationAgreementPane.field_I.field_H, 15610879, -1);
        }
        kg.a(0, (byte) -83, 0, var7);
        return;
    }

    final void initializeClient(byte param0) {
        this.a(false, (byte) 88, 10, 3, 1, 0, 2, 60);
        int var3 = 112 / ((param0 + 4) / 39);
        MidiPcmStream var2 = new MidiPcmStream();
        var2.a(128, 9, (byte) 125);
        gj.a(22050, var2, true, 1024, (java.awt.Component) ((Object) GameAppletShell.field_f), wc.field_c);
        he.field_C = 16777215;
        lf.field_e = 15632639;
        mf.field_c = 16777215;
        this.a(false, true, true, false, false);
    }

    private final boolean a(boolean param0, byte param1) {
        int[] array$1 = null;
        int var4_int = 0;
        int var7_int = 0;
        int var3;
        int[] var3_ref_int__;
        qg[] var4;
        int[] var5;
        int var6;
        RgbSprite[] var6_ref_hj__;
        RgbSprite var7;
        int var9;
        int[] var10;
        int[] var11;
        RgbSprite var12;
        RgbSprite var13;
        int[] var14;
        int var3Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        var9 = field_D ? 1 : 0;
        bl.a(param1 ^ 20);
        if (null != kd.field_q) {
          if (j.field_b.ensureIndexLoaded(-1) &&
            j.field_b.tryLoadGroupByName((byte) 102, "basic")) {
            if (!j.field_b.tryLoadGroupByName((byte) 99, "arialbold14")) {
              j.a(4.0f, TextLineMetrics.a(TextFieldValidator.field_e, j.field_b, -14416, ProxyAuthenticationRequiredException.field_a, "arialbold14"), (byte) 118);
              return false;
            }
            if (GameAppletShell.field_d.ensureIndexLoaded(-1) &&
              GameAppletShell.field_d.tryLoadGroupByName((byte) 121, "arialbold14")) {
              if (!j.field_b.tryLoadGroupByName((byte) 81, "arial13")) {
                j.a(4.0f, TextLineMetrics.a(TextFieldValidator.field_e, j.field_b, param1 - 14513, ProxyAuthenticationRequiredException.field_a, "arial13"), (byte) 112);
                return false;
              }
              if (GameAppletShell.field_d.ensureIndexLoaded(param1 - 98) &&
                GameAppletShell.field_d.tryLoadGroupByName((byte) -84, "arial13")) {
                if (kd.field_q.ensureIndexLoaded(-1) &&
                  kd.field_q.tryLoadAllGroups(7715)) {
                  if (AccountCreationResultPanel.field_hb.ensureIndexLoaded(-1) &&
                    AccountCreationResultPanel.field_hb.tryLoadAllGroups(7715)) {
                    if (ContentTransitionDialog.field_N.ensureIndexLoaded(-1) &&
                      ContentTransitionDialog.field_N.tryLoadAllGroups(param1 + 7618)) {
                      if (lg.field_c.ensureIndexLoaded(-1) &&
                        lg.field_c.tryLoadAllGroups(param1 + 7618)) {
                        if (bh.field_d.ensureIndexLoaded(-1) &&
                          bh.field_d.tryLoadAllGroups(7715)) {
                          if (pd.field_r.ensureIndexLoaded(param1 ^ -98) &&
                            pd.field_r.tryLoadAllGroups(param1 + 7618)) {
                            j.a(65.0f, me.field_i, (byte) 122);
                            this.renderClientFrame((byte) -80);
                            if (!param0) {
                              return false;
                            }
                            mh.field_a = new PcmSample[60];
                            bg.a(param1 - 2027485875);
                            cj.field_b = new SoundCache(kd.field_q, AccountCreationResultPanel.field_hb);
                            mh.field_a[0] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_select_menu_item").toPcmSample();
                            mh.field_a[30] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_mouseover_options").toPcmSample();
                            mh.field_a[1] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_place_turret_2").toPcmSample();
                            mh.field_a[2] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_select_turret").toPcmSample();
                            mh.field_a[3] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_upgrade_turret").toPcmSample();
                            mh.field_a[5] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_fast_blast_1").toPcmSample();
                            mh.field_a[10] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_chain_shot_1").toPcmSample();
                            mh.field_a[15] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_big_shot_1").toPcmSample();
                            mh.field_a[20] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_ice_shot_1").toPcmSample();
                            mh.field_a[25] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_beam_blast_1").toPcmSample();
                            mh.field_a[6] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_fast_blast_2").toPcmSample();
                            mh.field_a[11] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_chain_shot_2").toPcmSample();
                            mh.field_a[16] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_big_shot_2").toPcmSample();
                            mh.field_a[21] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_ice_shot_2").toPcmSample();
                            mh.field_a[26] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_beam_blast_2").toPcmSample();
                            mh.field_a[7] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_fast_blast_3").toPcmSample();
                            mh.field_a[12] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_chain_shot_3").toPcmSample();
                            mh.field_a[17] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_big_shot_3").toPcmSample();
                            mh.field_a[22] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_ice_shot_3").toPcmSample();
                            mh.field_a[27] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_beam_blast_3").toPcmSample();
                            mh.field_a[8] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_fast_blast_4").toPcmSample();
                            mh.field_a[13] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_chain_shot_4").toPcmSample();
                            mh.field_a[18] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_big_shot_4").toPcmSample();
                            mh.field_a[23] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_ice_shot_4").toPcmSample();
                            mh.field_a[28] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_beam_blast_4").toPcmSample();
                            mh.field_a[9] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_fast_blast_5").toPcmSample();
                            mh.field_a[14] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_chain_shot_5").toPcmSample();
                            mh.field_a[19] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_big_shot_5").toPcmSample();
                            mh.field_a[24] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_ice_shot_5").toPcmSample();
                            mh.field_a[29] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_beam_blast_5").toPcmSample();
                            mh.field_a[44] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "orb_defence_start_game").toPcmSample();
                            mh.field_a[45] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "orb_defence_end_game").toPcmSample();
                            mh.field_a[46] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "orb_defence_display_wave_message").toPcmSample();
                            mh.field_a[47] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "orb_defence_remove_wave_message").toPcmSample();
                            mh.field_a[49] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_norb_death_1").toPcmSample();
                            mh.field_a[50] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_norb_death_2").toPcmSample();
                            mh.field_a[51] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_norb_death_3").toPcmSample();
                            mh.field_a[52] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_norb_death_4").toPcmSample();
                            mh.field_a[53] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_norb_death_5").toPcmSample();
                            mh.field_a[54] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "Orb_defence_norb_boss_death").toPcmSample();
                            mh.field_a[55] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "orb_defence_destroy_orb").toPcmSample();
                            mh.field_a[56] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "orb_defence_barrier_initialise").toPcmSample();
                            mh.field_a[59] = SynthesizedSoundEffect.loadByName(kd.field_q, "", "orb_defence_barrier_explode").toPcmSample();
                            kd.field_q = null;
                            SoundCache.resetFrameTiming(39);
                            return false;
                          }
                          j.a(55.0f, TextLineMetrics.a(TextFieldValidator.field_e, pd.field_r, param1 ^ -14383, ProxyAuthenticationRequiredException.field_a, ""), (byte) 105);
                          return false;
                        }
                        j.a(45.0f, TextLineMetrics.a(SingleChildWidgetContainer.field_z, bh.field_d, param1 - 14513, AlphaWidgetContainer.field_B, ""), (byte) 120);
                        return false;
                      }
                      j.a(40.0f, TextLineMetrics.a(ha.field_l, lg.field_c, -14416, qd.field_a, ""), (byte) 112);
                      return false;
                    }
                    j.a(30.0f, mc.a(ContentTransitionDialog.field_N, ii.field_d, ld.field_c, 0, -93), (byte) 113);
                    return false;
                  }
                  j.a(20.0f, TextLineMetrics.a(hb.field_b, AccountCreationResultPanel.field_hb, -14416, vg.field_u, ""), (byte) 111);
                  return false;
                }
                j.a(10.0f, TextLineMetrics.a(hb.field_b, kd.field_q, -14416, vg.field_u, ""), (byte) 114);
                return false;
              }
              j.a(5.0f, TextLineMetrics.a(TextFieldValidator.field_e, GameAppletShell.field_d, -14416, ProxyAuthenticationRequiredException.field_a, "arial13"), (byte) 122);
              return false;
            }
            j.a(5.0f, TextLineMetrics.a(TextFieldValidator.field_e, GameAppletShell.field_d, -14416, ProxyAuthenticationRequiredException.field_a, "arialbold14"), (byte) 113);
            return false;
          }
          j.a(3.0f, TextLineMetrics.a(SingleChildWidgetContainer.field_z, j.field_b, param1 - 14513, AlphaWidgetContainer.field_B, "basic"), (byte) 120);
          return false;
        }
        if (null != AccountCreationResultPanel.field_hb) {
          j.a(70.0f, me.field_i, (byte) 120);
          this.renderClientFrame((byte) -82);
          mh.field_a[31] = VorbisSample.loadByName(AccountCreationResultPanel.field_hb, "", "orb_defence_normo_boss_arrive").decodeAllToPcm();
          mh.field_a[32] = VorbisSample.loadByName(AccountCreationResultPanel.field_hb, "", "orb_defence_swarmo_boss_arrive").decodeAllToPcm();
          mh.field_a[33] = VorbisSample.loadByName(AccountCreationResultPanel.field_hb, "", "orb_defence_zoomo_boss_arrive").decodeAllToPcm();
          mh.field_a[34] = VorbisSample.loadByName(AccountCreationResultPanel.field_hb, "", "orb_defence_tougho_boss_arrive").decodeAllToPcm();
          mh.field_a[35] = VorbisSample.loadByName(AccountCreationResultPanel.field_hb, "", "orb_defence_flybo_boss_arrive").decodeAllToPcm();
          mh.field_a[36] = VorbisSample.loadByName(AccountCreationResultPanel.field_hb, "", "orb_defence_bombo_boss_arrive").decodeAllToPcm();
          mh.field_a[37] = VorbisSample.loadByName(AccountCreationResultPanel.field_hb, "", "orb_defence_blambo_boss_arrive").decodeAllToPcm();
          mh.field_a[38] = VorbisSample.loadByName(AccountCreationResultPanel.field_hb, "", "orb_defence_irono_boss_arrive").decodeAllToPcm();
          mh.field_a[39] = VorbisSample.loadByName(AccountCreationResultPanel.field_hb, "", "orb_defence_awesomeo_boss_arrive").decodeAllToPcm();
          mh.field_a[40] = VorbisSample.loadByName(AccountCreationResultPanel.field_hb, "", "orb_defence_sneako_boss_arrive").decodeAllToPcm();
          mh.field_a[41] = VorbisSample.loadByName(AccountCreationResultPanel.field_hb, "", "orb_defence_splitto_boss_arrive").decodeAllToPcm();
          mh.field_a[57] = VorbisSample.loadByName(AccountCreationResultPanel.field_hb, "", "orb_defence_Barrier_Norb_Electrocute").decodeAllToPcm();
          mh.field_a[58] = VorbisSample.loadByName(AccountCreationResultPanel.field_hb, "", "orb_defence_Electro_Turret_shoot").decodeAllToPcm();
          AccountCreationResultPanel.field_hb = null;
          SoundCache.resetFrameTiming(param1 - 8);
          return false;
        }
        if (lg.field_c != null) {
          ee.field_b = new MusicTrack[15];
          j.a(75.0f, m.field_e, (byte) 125);
          this.renderClientFrame((byte) -116);
          ee.field_b[0] = MusicTrack.load(lg.field_c, "", "Orb_defence_level_1_construction");
          ee.field_b[1] = MusicTrack.load(lg.field_c, "", "Orb_defence_level_1_waves");
          ee.field_b[2] = MusicTrack.load(lg.field_c, "", "Orb_defence_level_1_boss");
          ee.field_b[3] = MusicTrack.load(lg.field_c, "", "Orb_defence_level_2_construction");
          ee.field_b[4] = MusicTrack.load(lg.field_c, "", "Orb_defence_level_2_waves");
          ee.field_b[5] = MusicTrack.load(lg.field_c, "", "Orb_defence_level_2_boss");
          ee.field_b[6] = MusicTrack.load(lg.field_c, "", "Orb_defence_level_3_construction");
          ee.field_b[7] = MusicTrack.load(lg.field_c, "", "Orb_defence_level_3_waves");
          ee.field_b[8] = MusicTrack.load(lg.field_c, "", "Orb_defence_level_3_boss");
          ee.field_b[9] = MusicTrack.load(lg.field_c, "", "Orb_defence_level_4_construction");
          ee.field_b[10] = MusicTrack.load(lg.field_c, "", "Orb_defence_level_4_waves");
          ee.field_b[11] = MusicTrack.load(lg.field_c, "", "Orb_defence_level_4_boss");
          ee.field_b[12] = MusicTrack.load(lg.field_c, "", "Orb_defence_titlescreen_1");
          ee.field_b[14] = MusicTrack.load(lg.field_c, "", "Orb_defence_gameover");
          lg.field_c = null;
          SoundCache.resetFrameTiming(param1 - 71);
          return false;
        }
        if (ContentTransitionDialog.field_N != null) {
          for (var3 = 0; 15 > var3; var3++) {
            if (null != ee.field_b[var3] &&
              !ml.field_c.a(ContentTransitionDialog.field_N, cj.field_b, (byte) 31, ee.field_b[var3], 176400)) {
              SoundCache.resetFrameTiming(param1 ^ 0);
              return false;
            }
          }
          ml.field_c.b((byte) 27);
          ContentTransitionDialog.field_N = null;
          cj.field_b = null;
          SoundCache.resetFrameTiming(64);
          return false;
        }
        if (null != j.field_b) {
          j.a(90.0f, IterableNodeHashTable.field_c, (byte) 119);
          this.renderClientFrame((byte) -113);
          DelegatingCanvas.field_d = fk.a(j.field_b, "unachieved", 45, "basic");
          me.field_n = fk.a(j.field_b, "locked", -90, "basic");
          jm.field_b = fk.a(j.field_b, "orbcoin", 105, "basic");
          sl.a(2408, DelegatingCanvas.field_d);
          sl.a(param1 ^ 2313, me.field_n);
          sl.a(param1 ^ 2313, jm.field_b);
          RegistrationAgreementPane.field_I = ConfirmedEmailAvailabilityValidator.a("", "arialbold14", param1 - 202, GameAppletShell.field_d, j.field_b);
          jd.field_c = ConfirmedEmailAvailabilityValidator.a("", "arial13", 90, GameAppletShell.field_d, j.field_b);
          GameAppletShell.field_d = null;
          j.field_b = null;
          SoundCache.resetFrameTiming(param1 ^ 59);
          return false;
        }
        if (null == bh.field_d) {
          if (BoundedRandomAccessFile.b(10489)) {
            for (var3Lifetime1 = 0; var3Lifetime1 < 9; var3Lifetime1++) {
              nc.field_cb[var3Lifetime1] = new ja(var3Lifetime1);
            }
            kf.field_c = 0;
            TextHotspotBounds.a(false, 50);
            km.a((byte) -62, 50);
            TextFieldValidator.a(ee.field_b[12], param1 ^ 99, false, 1, true, 2);
            bl.field_p = 0;
          }
          if (param1 == 97) {
            return true;
          }
          field_E = (String) null;
          return true;
        }
        fk.a(bh.field_d, "background", -117, "");
        TextHotspotBounds.field_t = sf.a("", pd.field_r, -1, "aafont", bh.field_d);
        var14 = TextHotspotBounds.field_t.field_J[0];
        var11 = var14;
        var10 = var11;
        var3_ref_int__ = var10;
        TextHotspotBounds.field_t.field_J = new int[2][];
        TextHotspotBounds.field_t.field_J[0] = var14;
        array$1 = new int[var14.length];
        TextHotspotBounds.field_t.field_J[1] = array$1;
        for (var4_int = 0; var14.length > var4_int; var4_int++) {
          TextHotspotBounds.field_t.field_J[1][var4_int] = EditableTextField.a(var14[var4_int], 16711935);
        }
        var4 = fl.a(-9945, bh.field_d, "", "keys");
        var5 = new int[]{14, 14, 14, 15, 15};
        for (var6 = 0; var4.length > var6; var6++) {
          var4[var6].field_c = 2 + var4[var6].field_h;
          var4[var6].field_b = 1;
        }
        RegistrationAgreementPane.field_I.setInlineSprites(var4, var5);
        jd.field_c.setInlineSprites(var4, var5);
        UiWidget.field_u = p.a(13863, "", bh.field_d, "menu_overlays");
        am.field_d = new RgbSprite[6];
        am.field_d[0] = fk.a(bh.field_d, "baseimage", -83, "");
        am.field_d[1] = fk.a(bh.field_d, "baseimage2", 79, "");
        am.field_d[2] = fk.a(bh.field_d, "baseimage3", gi.a((int) param1, -84), "");
        am.field_d[3] = fk.a(bh.field_d, "baseimage4", gi.a((int) param1, -95), "");
        am.field_d[4] = fk.a(bh.field_d, "baseimage5", -72, "");
        am.field_d[5] = fk.a(bh.field_d, "baseimage6", -58, "");
        TextFieldValidator.field_g = new RgbSprite[6];
        for (var6Lifetime1 = 0; TextFieldValidator.field_g.length > var6Lifetime1; var6Lifetime1++) {
          TextFieldValidator.field_g[var6Lifetime1] = new RgbSprite(160, 120);
        }
        hg.field_ab = fk.a(bh.field_d, "anorb", param1 ^ -64, "");
        ab.field_g = p.a(13863, "", bh.field_d, "walk_norb");
        hf.field_g = p.a(13863, "", bh.field_d, "turrettest");
        cj.a(105);
        fk.field_b = fk.a(bh.field_d, "titleimage", 46, "");
        fk.a(bh.field_d, "orbpilon", 120, "");
        p.a(param1 + 13766, "", bh.field_d, "wall");
        AccountNameAvailabilityValidator.field_q = p.a(13863, "", bh.field_d, "edging");
        mf.field_b = p.a(13863, "", bh.field_d, "floors_1");
        p.a(param1 ^ 13894, "", bh.field_d, "turrets");
        gd.field_b = p.a(13863, "", bh.field_d, "explosion");
        p.a(13863, "", bh.field_d, "bosses");
        MouseInputListener.field_a = fk.a(bh.field_d, "in_game_shine", -79, "");
        ad.field_e = fk.a(bh.field_d, "in_game_swarm_bar", param1 ^ -8, "");
        ProgressMessageDialog.field_X = fk.a(bh.field_d, "in_game_topbar_center", 38, "");
        ck.field_c = new RgbSprite[2];
        ck.field_c[0] = fk.a(bh.field_d, "in_game_turret_unavailable", -119, "");
        ck.field_c[1] = fk.a(bh.field_d, "in_game_turret_available", -62, "");
        KeyboardListener.field_d = new RgbSprite[3];
        KeyboardListener.field_d[0] = fk.a(bh.field_d, "in_game_topbutton_blue", 83, "");
        KeyboardListener.field_d[1] = fk.a(bh.field_d, "in_game_topbutton_green", -60, "");
        KeyboardListener.field_d[2] = fk.a(bh.field_d, "in_game_topbutton_grey", 71, "");
        f.field_w = p.a(13863, "", bh.field_d, "frame");
        ProxyAuthenticationRequiredException.field_d = p.a(13863, "", bh.field_d, "button_frame");
        qc.field_f = p.a(13863, "", bh.field_d, "button_raised");
        p.a(param1 ^ 13894, "", bh.field_d, "button_depressed");
        RichTextLayout.field_o = new RgbSprite[24];
        RichTextLayout.field_o[0] = fk.a(bh.field_d, "achievements_icon_1", -99, "");
        RichTextLayout.field_o[1] = fk.a(bh.field_d, "achievements_icon_2", -71, "");
        RichTextLayout.field_o[2] = fk.a(bh.field_d, "achievements_icon_3", 45, "");
        RichTextLayout.field_o[3] = fk.a(bh.field_d, "achievements_icon_4", 92, "");
        RichTextLayout.field_o[4] = fk.a(bh.field_d, "achievements_icon_5", -100, "");
        RichTextLayout.field_o[5] = fk.a(bh.field_d, "achievements_icon_6", -115, "");
        RichTextLayout.field_o[6] = fk.a(bh.field_d, "achievements_icon_7", gi.a((int) param1, 55), "");
        RichTextLayout.field_o[7] = fk.a(bh.field_d, "achievements_icon_8", 72, "");
        RichTextLayout.field_o[8] = fk.a(bh.field_d, "achievements_icon_9", 58, "");
        RichTextLayout.field_o[9] = fk.a(bh.field_d, "achievements_icon_10", -116, "");
        RichTextLayout.field_o[10] = fk.a(bh.field_d, "achievements_icon_11", 57, "");
        RichTextLayout.field_o[11] = fk.a(bh.field_d, "achievements_icon_12", -79, "");
        RichTextLayout.field_o[12] = fk.a(bh.field_d, "achievements_icon_13", 38, "");
        RichTextLayout.field_o[13] = fk.a(bh.field_d, "achievements_icon_14", 87, "");
        RichTextLayout.field_o[14] = fk.a(bh.field_d, "achievements_icon_15", 98, "");
        RichTextLayout.field_o[15] = fk.a(bh.field_d, "achievements_icon_16", gi.a((int) param1, 62), "");
        RichTextLayout.field_o[16] = fk.a(bh.field_d, "achievements_icon_17", 51, "");
        RichTextLayout.field_o[17] = fk.a(bh.field_d, "achievements_icon_18", gi.a((int) param1, -29), "");
        RichTextLayout.field_o[18] = fk.a(bh.field_d, "achievements_icon_19", param1 - 202, "");
        RichTextLayout.field_o[19] = fk.a(bh.field_d, "achievements_icon_20", 87, "");
        RichTextLayout.field_o[20] = fk.a(bh.field_d, "achievements_icon_21", -70, "");
        RichTextLayout.field_o[21] = fk.a(bh.field_d, "achievements_icon_22", -125, "");
        RichTextLayout.field_o[22] = fk.a(bh.field_d, "achievements_icon_23", 120, "");
        RichTextLayout.field_o[23] = fk.a(bh.field_d, "achievements_icon_24", -98, "");
        ba.a((byte) -27);
        var6_ref_hj__ = RichTextLayout.field_o;
        for (var7_int = 0; var7_int < var6_ref_hj__.length; var7_int++) {
          var12 = var6_ref_hj__[var7_int];
          sl.a(2408, var12);
        }
        var6Lifetime2 = RegistrationAgreementPane.field_I.field_H + RegistrationAgreementPane.field_I.field_B;
        ba.field_e = new RgbSprite(var6Lifetime2, var6Lifetime2);
        ba.field_e.bindAsRenderTarget();
        jm.field_b.drawDownscaledAreaAveraged(0, 0, var6Lifetime2, var6Lifetime2);
        jm.field_b = null;
        BufferedSocket.field_a.a(-40);
        DualLinkNode.a(80, (byte) -38, (java.applet.Applet) (this), SpriteGeometry.field_r, 0, 255);
        var7 = fk.a(bh.field_d, "mb_frames", param1 ^ 38, "");
        ImageProducerRasterBuffer.a(-63, ui.field_e, var7);
        UiWidget.a(param1 - 97, fk.a(bh.field_d, "mb_logo", 40, ""));
        ProxyAuthenticationRequiredException.a(90, p.a(13863, "", bh.field_d, "mb_sshots"));
        var13 = fk.a(bh.field_d, "mb_pricing_bg", 60, "");
        SingleChildWidgetContainer.a(var13, 80, (byte) 45, 10, 10, 10, 140, 1500, 10);
        bh.field_d = null;
        pd.field_r = null;
        SoundCache.resetFrameTiming(70);
        return false;
    }

    public final void init() {
        this.a(11, "orbdefence", (byte) 20);
    }

    private final void e(boolean param0) {
        int fieldTemp$0 = 0;
        int var3;
        var3 = field_D ? 1 : 0;
        if (AccountRequestState.field_d >= 2 &&
          IterableNodeHashTable.field_a[41]) {
          lb.field_g = 16777215;
          DirectByteStorage.field_d = true;
        }
        if (!df.field_f) {
          MusicPatchPcmStream.field_n[25] = db.field_c;
        } else {
          MusicPatchPcmStream.field_n[25] = TextHotspotBounds.field_m;
        }
        if (param0) {
          return;
        }
        if (oj.field_r.beginForward((byte) -55) != null) {
          fieldTemp$0 = lc.field_x + 1;
          lc.field_x = lc.field_x + 1;
          if (fieldTemp$0 == 335) {
            lc.field_x = 0;
            oj.field_r.removeFirst(0);
          }
        }
        if (0 != lc.field_r) {
          if (lc.field_r != 1) {
            if (lc.field_r != 2) {
              RichTextWidget.field_O = RichTextWidget.field_O - 1;
              if (0 == RichTextWidget.field_O) {
                lc.field_r = 0;
              }
            } else {
              if (!n.b((byte) 102)) {
                oh.field_c = lg.a(4, param0);
                if (null != il.field_f) {
                  il.field_f.c(-1);
                }
                kf.field_c = Bzip2State.field_B;
                if (kf.field_c == -2) {
                  kf.field_c = 0;
                  ud.a(8, ProxyAuthenticationRequiredException.field_d, false, RegistrationAgreementPane.field_I.field_E + RegistrationAgreementPane.field_I.field_B, 6, 6, RegistrationAgreementPane.field_I, RegistrationAgreementPane.field_I.field_E, (byte) 5, 320, 240, qc.field_f);
                }
              } else {
                kf.field_c = TextLayout.field_a;
              }
              kk.field_S = kf.field_c;
              RichTextWidget.field_O = 9;
              lc.field_r = 3;
            }
          } else {
            RichTextWidget.field_O = RichTextWidget.field_O + 1;
            if (RichTextWidget.field_O == 10) {
              if (rl.a((byte) 108)) {
                n.a((byte) -110);
              } else {
                ji.a((byte) 104);
              }
              lc.field_r = 2;
            }
          }
        } else {
          if (~kf.field_c == ~kk.field_S) {
            if (kf.field_c != -1) {
              nc.field_cb[kf.field_c].b(param0);
            } else {
              il.field_f.b(28803, true);
            }
          } else {
            RichTextWidget.field_O = RichTextWidget.field_O + 1;
            if (RichTextWidget.field_O == 10) {
              if (kf.field_c == 2) {
                SingleChildWidgetContainer.field_x = null;
              }
              kf.field_c = kk.field_S;
              RichTextWidget.field_O = 0;
            }
          }
        }
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 >= -102) {
          return;
        }
        field_E = null;
        field_C = null;
    }

    static {
        field_C = "Updates will sent to the email address you've given";
        field_E = "???";
    }
}
